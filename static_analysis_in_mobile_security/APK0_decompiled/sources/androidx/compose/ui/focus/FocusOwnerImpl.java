package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: FocusOwnerImpl.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u001d\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&H\u0016J\n\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001d\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\b\u0010.\u001a\u00020\u0005H\u0016J\u0010\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u000201H\u0016J\u0010\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u000202H\u0016J\u0010\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0014H\u0016J\b\u00103\u001a\u00020\u0005H\u0016J\u001d\u00104\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u0010-J\u000e\u00106\u001a\u0004\u0018\u000107*\u000208H\u0002J\\\u00109\u001a\u00020\u0005\"\n\b\u0000\u0010:\u0018\u0001*\u000208*\u0002082\f\u0010;\u001a\b\u0012\u0004\u0012\u0002H:0<2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u0002H:\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u0002H:\u0012\u0004\u0012\u00020\u00050\u0003H\u0082\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010@R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006A"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "onRequestApplyChangesListener", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function1;)V", "focusInvalidationManager", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "rootFocusNode", "Landroidx/compose/ui/focus/FocusTargetNode;", "getRootFocusNode$ui_release", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setRootFocusNode$ui_release", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "clearFocus", "force", "", "refreshFocusEvents", "dispatchInterceptedSoftKeyboardEvent", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchKeyEvent", "dispatchKeyEvent-ZmokQxo", "dispatchRotaryEvent", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "getFocusRect", "Landroidx/compose/ui/geometry/Rect;", "moveFocus", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "moveFocus-3ESFkO8", "(I)Z", "releaseFocus", "scheduleInvalidation", "node", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "takeFocus", "wrapAroundFocus", "wrapAroundFocus-3ESFkO8", "lastLocalKeyInputNode", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "traverseAncestors", "T", "type", "Landroidx/compose/ui/node/NodeKind;", "onPreVisit", "onVisit", "traverseAncestors-Y-YKmho", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusOwnerImpl implements FocusOwner {
    private final FocusInvalidationManager focusInvalidationManager;
    public LayoutDirection layoutDirection;
    private final Modifier modifier;
    private FocusTargetNode rootFocusNode;

    /* compiled from: FocusOwnerImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError e8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public FocusOwnerImpl(Function1<? super Function0<Unit>, Unit> onRequestApplyChangesListener) {
        Intrinsics.checkNotNullParameter(onRequestApplyChangesListener, "onRequestApplyChangesListener");
        this.rootFocusNode = new FocusTargetNode();
        this.focusInvalidationManager = new FocusInvalidationManager(onRequestApplyChangesListener);
        this.modifier = new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public FocusTargetNode create() {
                return FocusOwnerImpl.this.getRootFocusNode();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void update(FocusTargetNode node) {
                Intrinsics.checkNotNullParameter(node, "node");
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void inspectableProperties(InspectorInfo $this$inspectableProperties) {
                Intrinsics.checkNotNullParameter($this$inspectableProperties, "<this>");
                $this$inspectableProperties.setName("RootFocusTarget");
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public int hashCode() {
                return FocusOwnerImpl.this.getRootFocusNode().hashCode();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public boolean equals(Object other) {
                return other == this;
            }
        };
    }

    /* renamed from: getRootFocusNode$ui_release, reason: from getter */
    public final FocusTargetNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    public final void setRootFocusNode$ui_release(FocusTargetNode focusTargetNode) {
        Intrinsics.checkNotNullParameter(focusTargetNode, "<set-?>");
        this.rootFocusNode = focusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection = this.layoutDirection;
        if (layoutDirection != null) {
            return layoutDirection;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutDirection");
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void setLayoutDirection(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void takeFocus() {
        if (this.rootFocusNode.getFocusState() == FocusStateImpl.Inactive) {
            this.rootFocusNode.setFocusState(FocusStateImpl.Active);
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void releaseFocus() {
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean force) {
        clearFocus(force, true);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void clearFocus(boolean force, boolean refreshFocusEvents) {
        FocusStateImpl focusStateImpl;
        if (!force) {
            switch (WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m2679performCustomClearFocusMxy_nc0(this.rootFocusNode, FocusDirection.INSTANCE.m2660getExitdhqQ8s()).ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return;
            }
        }
        FocusStateImpl rootInitialState = this.rootFocusNode.getFocusState();
        if (FocusTransactionsKt.clearFocus(this.rootFocusNode, force, refreshFocusEvents)) {
            FocusTargetNode focusTargetNode = this.rootFocusNode;
            switch (WhenMappings.$EnumSwitchMapping$1[rootInitialState.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    focusStateImpl = FocusStateImpl.Active;
                    break;
                case 4:
                    focusStateImpl = FocusStateImpl.Inactive;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            focusTargetNode.setFocusState(focusStateImpl);
        }
    }

    @Override // androidx.compose.ui.focus.FocusManager
    /* renamed from: moveFocus-3ESFkO8 */
    public boolean mo2668moveFocus3ESFkO8(final int focusDirection) {
        final FocusTargetNode source = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (source == null) {
            return false;
        }
        FocusRequester it = FocusTraversalKt.m2683customFocusSearchOMvw8(source, focusDirection, getLayoutDirection());
        if (it != FocusRequester.INSTANCE.getDefault()) {
            return it != FocusRequester.INSTANCE.getCancel() && it.focus$ui_release();
        }
        final Ref.BooleanRef isCancelled = new Ref.BooleanRef();
        boolean foundNextItem = FocusTraversalKt.m2684focusSearchsMXa3k8(this.rootFocusNode, focusDirection, getLayoutDirection(), new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$foundNextItem$1

            /* compiled from: FocusOwnerImpl.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CustomDestinationResult.values().length];
                    try {
                        iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
                    } catch (NoSuchFieldError e) {
                    }
                    try {
                        iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
                    } catch (NoSuchFieldError e2) {
                    }
                    try {
                        iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
                    } catch (NoSuchFieldError e3) {
                    }
                    try {
                        iArr[CustomDestinationResult.None.ordinal()] = 4;
                    } catch (NoSuchFieldError e4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode destination) {
                Modifier.Node node;
                boolean z;
                DelegatableNode $this$nearestAncestor_u2d64DMado$iv;
                int type$iv;
                NodeChain nodes;
                DelegatableNode $this$nearestAncestor_u2d64DMado$iv2;
                int type$iv2;
                DelegatableNode $this$nearestAncestor_u2d64DMado$iv3;
                int type$iv3;
                int count$iv$iv$iv;
                MutableVector mutableVector;
                Intrinsics.checkNotNullParameter(destination, "destination");
                if (Intrinsics.areEqual(destination, FocusTargetNode.this)) {
                    return false;
                }
                FocusTargetNode $this$nearestAncestor_u2d64DMado$iv4 = destination;
                int type$iv4 = NodeKind.m4443constructorimpl(1024);
                if (!$this$nearestAncestor_u2d64DMado$iv4.getNode().getIsAttached()) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                Modifier.Node node$iv$iv$iv = $this$nearestAncestor_u2d64DMado$iv4.getNode().getParent();
                LayoutNode layout$iv$iv$iv = DelegatableNodeKt.requireLayoutNode($this$nearestAncestor_u2d64DMado$iv4);
                loop0: while (true) {
                    int i = 1;
                    if (layout$iv$iv$iv == null) {
                        node = null;
                        break;
                    }
                    Modifier.Node head$iv$iv$iv = layout$iv$iv$iv.getNodes().getHead();
                    if ((head$iv$iv$iv.getAggregateChildKindSet() & type$iv4) != 0) {
                        while (node$iv$iv$iv != null) {
                            if ((node$iv$iv$iv.getKindSet() & type$iv4) != 0) {
                                Modifier.Node it$iv$iv = node$iv$iv$iv;
                                MutableVector mutableVector2 = null;
                                node = it$iv$iv;
                                while (node != null) {
                                    if (node instanceof FocusTargetNode) {
                                        break loop0;
                                    }
                                    Modifier.Node this_$iv$iv$iv$iv = node;
                                    if (((this_$iv$iv$iv$iv.getKindSet() & type$iv4) != 0) && (node instanceof DelegatingNode)) {
                                        int count$iv$iv$iv2 = 0;
                                        DelegatingNode this_$iv$iv$iv$iv2 = (DelegatingNode) node;
                                        Modifier.Node node$iv$iv$iv$iv = this_$iv$iv$iv$iv2.getDelegate();
                                        while (node$iv$iv$iv$iv != null) {
                                            Modifier.Node next$iv$iv$iv = node$iv$iv$iv$iv;
                                            if ((next$iv$iv$iv.getKindSet() & type$iv4) != 0) {
                                                count$iv$iv$iv2++;
                                                if (count$iv$iv$iv2 == i) {
                                                    node = next$iv$iv$iv;
                                                    $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv4;
                                                    type$iv3 = type$iv4;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv4;
                                                        count$iv$iv$iv = count$iv$iv$iv2;
                                                        type$iv3 = type$iv4;
                                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                    } else {
                                                        $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv4;
                                                        count$iv$iv$iv = count$iv$iv$iv2;
                                                        type$iv3 = type$iv4;
                                                        mutableVector = mutableVector2;
                                                    }
                                                    Modifier.Node theNode$iv$iv$iv = node;
                                                    if (theNode$iv$iv$iv != null) {
                                                        if (mutableVector != null) {
                                                            mutableVector.add(theNode$iv$iv$iv);
                                                        }
                                                        node = null;
                                                    }
                                                    if (mutableVector != null) {
                                                        mutableVector.add(next$iv$iv$iv);
                                                    }
                                                    mutableVector2 = mutableVector;
                                                    count$iv$iv$iv2 = count$iv$iv$iv;
                                                }
                                            } else {
                                                $this$nearestAncestor_u2d64DMado$iv3 = $this$nearestAncestor_u2d64DMado$iv4;
                                                type$iv3 = type$iv4;
                                            }
                                            node$iv$iv$iv$iv = node$iv$iv$iv$iv.getChild();
                                            $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv3;
                                            type$iv4 = type$iv3;
                                            i = 1;
                                        }
                                        $this$nearestAncestor_u2d64DMado$iv2 = $this$nearestAncestor_u2d64DMado$iv4;
                                        type$iv2 = type$iv4;
                                        if (count$iv$iv$iv2 == 1) {
                                            $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv2;
                                            type$iv4 = type$iv2;
                                            i = 1;
                                        }
                                    } else {
                                        $this$nearestAncestor_u2d64DMado$iv2 = $this$nearestAncestor_u2d64DMado$iv4;
                                        type$iv2 = type$iv4;
                                    }
                                    node = DelegatableNodeKt.pop(mutableVector2);
                                    $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv2;
                                    type$iv4 = type$iv2;
                                    i = 1;
                                }
                            }
                            node$iv$iv$iv = node$iv$iv$iv.getParent();
                            $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv4;
                            type$iv4 = type$iv4;
                            i = 1;
                        }
                        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv4;
                        type$iv = type$iv4;
                    } else {
                        $this$nearestAncestor_u2d64DMado$iv = $this$nearestAncestor_u2d64DMado$iv4;
                        type$iv = type$iv4;
                    }
                    layout$iv$iv$iv = layout$iv$iv$iv.getParent$ui_release();
                    node$iv$iv$iv = (layout$iv$iv$iv == null || (nodes = layout$iv$iv$iv.getNodes()) == null) ? null : nodes.getTail();
                    $this$nearestAncestor_u2d64DMado$iv4 = $this$nearestAncestor_u2d64DMado$iv;
                    type$iv4 = type$iv;
                }
                if (node == null) {
                    throw new IllegalStateException("Focus search landed at the root.".toString());
                }
                switch (WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m2682performCustomRequestFocusMxy_nc0(destination, focusDirection).ordinal()]) {
                    case 1:
                        z = true;
                        break;
                    case 2:
                    case 3:
                        isCancelled.element = true;
                        z = true;
                        break;
                    case 4:
                        z = FocusTransactionsKt.performRequestFocus(destination);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(z);
            }
        });
        if (isCancelled.element) {
            return false;
        }
        return foundNextItem || m2672wrapAroundFocus3ESFkO8(focusDirection);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchKeyEvent-ZmokQxo */
    public boolean mo2670dispatchKeyEventZmokQxo(KeyEvent keyEvent) {
        DelegatableNode $this$traverseAncestors_u2dY_u2dYKmho$iv;
        int type$iv;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv;
        DelegatableNode $this$traverseAncestors_u2dY_u2dYKmho$iv2;
        int type$iv2;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv2;
        MutableVector mutableVector;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv3;
        int i;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv4;
        int i2;
        MutableVector mutableVector2;
        int size;
        Modifier.Node focusedKeyInputNode;
        FocusOwnerImpl this_$iv;
        int i3;
        NodeChain nodes;
        FocusOwnerImpl this_$iv2;
        int i4;
        FocusOwnerImpl this_$iv3;
        int i5;
        int count$iv$iv$iv$iv;
        MutableVector mutableVector3;
        Object obj;
        FocusTargetNode activeFocusTarget;
        NodeChain nodes2;
        FocusTargetNode activeFocusTarget2;
        FocusTargetNode activeFocusTarget3;
        MutableVector mutableVector4;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        FocusTargetNode activeFocusTarget4 = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (activeFocusTarget4 == null) {
            throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
        }
        Modifier.Node lastLocalKeyInputNode = lastLocalKeyInputNode(activeFocusTarget4);
        int i6 = 1;
        if (lastLocalKeyInputNode == null) {
            FocusTargetNode $this$nearestAncestor_u2d64DMado$iv = activeFocusTarget4;
            int m4443constructorimpl = NodeKind.m4443constructorimpl(8192);
            if (!$this$nearestAncestor_u2d64DMado$iv.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node node$iv$iv$iv = $this$nearestAncestor_u2d64DMado$iv.getNode().getParent();
            LayoutNode layout$iv$iv$iv = DelegatableNodeKt.requireLayoutNode($this$nearestAncestor_u2d64DMado$iv);
            loop0: while (true) {
                if (layout$iv$iv$iv == null) {
                    obj = null;
                    break;
                }
                Modifier.Node head$iv$iv$iv = layout$iv$iv$iv.getNodes().getHead();
                if ((head$iv$iv$iv.getAggregateChildKindSet() & m4443constructorimpl) != 0) {
                    while (node$iv$iv$iv != null) {
                        if ((node$iv$iv$iv.getKindSet() & m4443constructorimpl) != 0) {
                            Modifier.Node it$iv$iv = node$iv$iv$iv;
                            MutableVector mutableVector5 = null;
                            Modifier.Node node = it$iv$iv;
                            while (node != null) {
                                if (node instanceof KeyInputModifierNode) {
                                    obj = node;
                                    break loop0;
                                }
                                Modifier.Node this_$iv$iv$iv$iv = node;
                                if (((this_$iv$iv$iv$iv.getKindSet() & m4443constructorimpl) != 0) && (node instanceof DelegatingNode)) {
                                    int count$iv$iv$iv = 0;
                                    DelegatingNode this_$iv$iv$iv$iv2 = (DelegatingNode) node;
                                    Modifier.Node node$iv$iv$iv$iv = this_$iv$iv$iv$iv2.getDelegate();
                                    while (node$iv$iv$iv$iv != null) {
                                        Modifier.Node next$iv$iv$iv = node$iv$iv$iv$iv;
                                        if ((next$iv$iv$iv.getKindSet() & m4443constructorimpl) != 0) {
                                            count$iv$iv$iv++;
                                            if (count$iv$iv$iv == i6) {
                                                node = next$iv$iv$iv;
                                                activeFocusTarget3 = activeFocusTarget4;
                                            } else {
                                                if (mutableVector5 == null) {
                                                    activeFocusTarget3 = activeFocusTarget4;
                                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                                } else {
                                                    activeFocusTarget3 = activeFocusTarget4;
                                                    mutableVector4 = mutableVector5;
                                                }
                                                Modifier.Node theNode$iv$iv$iv = node;
                                                if (theNode$iv$iv$iv != null) {
                                                    if (mutableVector4 != null) {
                                                        mutableVector4.add(theNode$iv$iv$iv);
                                                    }
                                                    node = null;
                                                }
                                                if (mutableVector4 != null) {
                                                    mutableVector4.add(next$iv$iv$iv);
                                                }
                                                mutableVector5 = mutableVector4;
                                            }
                                        } else {
                                            activeFocusTarget3 = activeFocusTarget4;
                                        }
                                        node$iv$iv$iv$iv = node$iv$iv$iv$iv.getChild();
                                        activeFocusTarget4 = activeFocusTarget3;
                                        i6 = 1;
                                    }
                                    activeFocusTarget2 = activeFocusTarget4;
                                    if (count$iv$iv$iv == 1) {
                                        activeFocusTarget4 = activeFocusTarget2;
                                        i6 = 1;
                                    }
                                } else {
                                    activeFocusTarget2 = activeFocusTarget4;
                                }
                                node = DelegatableNodeKt.pop(mutableVector5);
                                activeFocusTarget4 = activeFocusTarget2;
                                i6 = 1;
                            }
                        }
                        node$iv$iv$iv = node$iv$iv$iv.getParent();
                        i6 = 1;
                        activeFocusTarget4 = activeFocusTarget4;
                    }
                    activeFocusTarget = activeFocusTarget4;
                } else {
                    activeFocusTarget = activeFocusTarget4;
                }
                layout$iv$iv$iv = layout$iv$iv$iv.getParent$ui_release();
                node$iv$iv$iv = (layout$iv$iv$iv == null || (nodes2 = layout$iv$iv$iv.getNodes()) == null) ? null : nodes2.getTail();
                i6 = 1;
                activeFocusTarget4 = activeFocusTarget;
            }
            KeyInputModifierNode keyInputModifierNode = (KeyInputModifierNode) obj;
            lastLocalKeyInputNode = keyInputModifierNode != null ? keyInputModifierNode.getNode() : null;
        }
        Modifier.Node focusedKeyInputNode2 = lastLocalKeyInputNode;
        if (focusedKeyInputNode2 == null) {
            return false;
        }
        Modifier.Node $this$traverseAncestors_u2dY_u2dYKmho$iv3 = focusedKeyInputNode2;
        int type$iv3 = NodeKind.m4443constructorimpl(8192);
        FocusOwnerImpl this_$iv4 = this;
        int i7 = 0;
        List list = null;
        if (!$this$traverseAncestors_u2dY_u2dYKmho$iv3.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node$iv$iv$iv$iv2 = $this$traverseAncestors_u2dY_u2dYKmho$iv3.getNode().getParent();
        LayoutNode layout$iv$iv$iv$iv = DelegatableNodeKt.requireLayoutNode($this$traverseAncestors_u2dY_u2dYKmho$iv3);
        while (layout$iv$iv$iv$iv != null) {
            Modifier.Node head$iv$iv$iv$iv = layout$iv$iv$iv$iv.getNodes().getHead();
            if ((head$iv$iv$iv$iv.getAggregateChildKindSet() & type$iv3) != 0) {
                while (node$iv$iv$iv$iv2 != null) {
                    if ((node$iv$iv$iv$iv2.getKindSet() & type$iv3) != 0) {
                        Modifier.Node it$iv$iv$iv = node$iv$iv$iv$iv2;
                        MutableVector mutableVector6 = null;
                        Modifier.Node node2 = it$iv$iv$iv;
                        while (node2 != null) {
                            Modifier.Node focusedKeyInputNode3 = focusedKeyInputNode2;
                            if (node2 instanceof KeyInputModifierNode) {
                                Modifier.Node node3 = node2;
                                if (list == null) {
                                    Object result$iv$iv = new ArrayList();
                                    list = (List) result$iv$iv;
                                }
                                list.add(node3);
                                this_$iv2 = this_$iv4;
                                i4 = i7;
                            } else {
                                Modifier.Node this_$iv$iv$iv$iv$iv = node2;
                                if (((this_$iv$iv$iv$iv$iv.getKindSet() & type$iv3) != 0) && (node2 instanceof DelegatingNode)) {
                                    int count$iv$iv$iv$iv2 = 0;
                                    DelegatingNode this_$iv$iv$iv$iv$iv2 = (DelegatingNode) node2;
                                    Modifier.Node node$iv$iv$iv$iv$iv = this_$iv$iv$iv$iv$iv2.getDelegate();
                                    while (node$iv$iv$iv$iv$iv != null) {
                                        Modifier.Node next$iv$iv$iv$iv = node$iv$iv$iv$iv$iv;
                                        if ((next$iv$iv$iv$iv.getKindSet() & type$iv3) != 0) {
                                            count$iv$iv$iv$iv2++;
                                            this_$iv3 = this_$iv4;
                                            if (count$iv$iv$iv$iv2 == 1) {
                                                node2 = next$iv$iv$iv$iv;
                                                i5 = i7;
                                            } else {
                                                if (mutableVector6 == null) {
                                                    count$iv$iv$iv$iv = count$iv$iv$iv$iv2;
                                                    i5 = i7;
                                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                } else {
                                                    count$iv$iv$iv$iv = count$iv$iv$iv$iv2;
                                                    i5 = i7;
                                                    mutableVector3 = mutableVector6;
                                                }
                                                MutableVector mutableVector7 = mutableVector3;
                                                Modifier.Node theNode$iv$iv$iv$iv = node2;
                                                if (theNode$iv$iv$iv$iv != null) {
                                                    if (mutableVector7 != null) {
                                                        mutableVector7.add(theNode$iv$iv$iv$iv);
                                                    }
                                                    node2 = null;
                                                }
                                                if (mutableVector7 != null) {
                                                    mutableVector7.add(next$iv$iv$iv$iv);
                                                }
                                                mutableVector6 = mutableVector7;
                                                count$iv$iv$iv$iv2 = count$iv$iv$iv$iv;
                                            }
                                        } else {
                                            this_$iv3 = this_$iv4;
                                            i5 = i7;
                                        }
                                        node$iv$iv$iv$iv$iv = node$iv$iv$iv$iv$iv.getChild();
                                        this_$iv4 = this_$iv3;
                                        i7 = i5;
                                    }
                                    this_$iv2 = this_$iv4;
                                    i4 = i7;
                                    if (count$iv$iv$iv$iv2 == 1) {
                                        focusedKeyInputNode2 = focusedKeyInputNode3;
                                        this_$iv4 = this_$iv2;
                                        i7 = i4;
                                    }
                                } else {
                                    this_$iv2 = this_$iv4;
                                    i4 = i7;
                                }
                            }
                            node2 = DelegatableNodeKt.pop(mutableVector6);
                            focusedKeyInputNode2 = focusedKeyInputNode3;
                            this_$iv4 = this_$iv2;
                            i7 = i4;
                        }
                    }
                    node$iv$iv$iv$iv2 = node$iv$iv$iv$iv2.getParent();
                    focusedKeyInputNode2 = focusedKeyInputNode2;
                    this_$iv4 = this_$iv4;
                    i7 = i7;
                }
                focusedKeyInputNode = focusedKeyInputNode2;
                this_$iv = this_$iv4;
                i3 = i7;
            } else {
                focusedKeyInputNode = focusedKeyInputNode2;
                this_$iv = this_$iv4;
                i3 = i7;
            }
            layout$iv$iv$iv$iv = layout$iv$iv$iv$iv.getParent$ui_release();
            node$iv$iv$iv$iv2 = (layout$iv$iv$iv$iv == null || (nodes = layout$iv$iv$iv$iv.getNodes()) == null) ? null : nodes.getTail();
            focusedKeyInputNode2 = focusedKeyInputNode;
            this_$iv4 = this_$iv;
            i7 = i3;
        }
        List ancestors$iv = list;
        if (ancestors$iv != null && ancestors$iv.size() - 1 >= 0) {
            do {
                int index$iv$iv = size;
                size--;
                Object item$iv$iv = ancestors$iv.get(index$iv$iv);
                KeyInputModifierNode it = (KeyInputModifierNode) item$iv$iv;
                if (it.mo144onPreKeyEventZmokQxo(keyEvent)) {
                    return true;
                }
            } while (size >= 0);
        }
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv5 = $this$traverseAncestors_u2dY_u2dYKmho$iv3.getNode();
        int i8 = 0;
        MutableVector mutableVector8 = null;
        Modifier.Node node4 = $this$dispatchForKind_u2d6rFNWt0$iv$iv5;
        while (node4 != null) {
            if (node4 instanceof KeyInputModifierNode) {
                KeyInputModifierNode it2 = (KeyInputModifierNode) node4;
                if (it2.mo144onPreKeyEventZmokQxo(keyEvent)) {
                    return true;
                }
                $this$dispatchForKind_u2d6rFNWt0$iv$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv$iv5;
                i = i8;
            } else {
                Modifier.Node this_$iv$iv$iv = node4;
                if (((this_$iv$iv$iv.getKindSet() & type$iv3) != 0) && (node4 instanceof DelegatingNode)) {
                    int count$iv$iv = 0;
                    DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) node4;
                    Modifier.Node node$iv$iv$iv2 = this_$iv$iv$iv2.getDelegate();
                    while (node$iv$iv$iv2 != null) {
                        Modifier.Node next$iv$iv = node$iv$iv$iv2;
                        if ((next$iv$iv.getKindSet() & type$iv3) != 0) {
                            count$iv$iv++;
                            if (count$iv$iv == 1) {
                                node4 = next$iv$iv;
                                $this$dispatchForKind_u2d6rFNWt0$iv$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv$iv5;
                                i2 = i8;
                            } else {
                                if (mutableVector8 == null) {
                                    $this$dispatchForKind_u2d6rFNWt0$iv$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv$iv5;
                                    i2 = i8;
                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                } else {
                                    $this$dispatchForKind_u2d6rFNWt0$iv$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv$iv5;
                                    i2 = i8;
                                    mutableVector2 = mutableVector8;
                                }
                                mutableVector8 = mutableVector2;
                                Modifier.Node theNode$iv$iv = node4;
                                if (theNode$iv$iv != null) {
                                    if (mutableVector8 != null) {
                                        mutableVector8.add(theNode$iv$iv);
                                    }
                                    node4 = null;
                                }
                                if (mutableVector8 != null) {
                                    mutableVector8.add(next$iv$iv);
                                }
                            }
                        } else {
                            $this$dispatchForKind_u2d6rFNWt0$iv$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv$iv5;
                            i2 = i8;
                        }
                        node$iv$iv$iv2 = node$iv$iv$iv2.getChild();
                        $this$dispatchForKind_u2d6rFNWt0$iv$iv5 = $this$dispatchForKind_u2d6rFNWt0$iv$iv4;
                        i8 = i2;
                    }
                    $this$dispatchForKind_u2d6rFNWt0$iv$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv$iv5;
                    i = i8;
                    MutableVector mutableVector9 = mutableVector8;
                    if (count$iv$iv == 1) {
                        $this$dispatchForKind_u2d6rFNWt0$iv$iv5 = $this$dispatchForKind_u2d6rFNWt0$iv$iv3;
                        i8 = i;
                        mutableVector8 = mutableVector9;
                    } else {
                        mutableVector8 = mutableVector9;
                    }
                } else {
                    $this$dispatchForKind_u2d6rFNWt0$iv$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv$iv5;
                    i = i8;
                }
            }
            node4 = DelegatableNodeKt.pop(mutableVector8);
            $this$dispatchForKind_u2d6rFNWt0$iv$iv5 = $this$dispatchForKind_u2d6rFNWt0$iv$iv3;
            i8 = i;
        }
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv$iv6 = $this$traverseAncestors_u2dY_u2dYKmho$iv3.getNode();
        MutableVector mutableVector10 = null;
        Modifier.Node node5 = $this$dispatchForKind_u2d6rFNWt0$iv$iv6;
        while (node5 != null) {
            if (node5 instanceof KeyInputModifierNode) {
                KeyInputModifierNode it3 = (KeyInputModifierNode) node5;
                if (it3.mo142onKeyEventZmokQxo(keyEvent)) {
                    return true;
                }
                $this$traverseAncestors_u2dY_u2dYKmho$iv = $this$traverseAncestors_u2dY_u2dYKmho$iv3;
                type$iv = type$iv3;
                $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$dispatchForKind_u2d6rFNWt0$iv$iv6;
            } else {
                Modifier.Node this_$iv$iv$iv3 = node5;
                if (((this_$iv$iv$iv3.getKindSet() & type$iv3) != 0) && (node5 instanceof DelegatingNode)) {
                    int count$iv$iv2 = 0;
                    DelegatingNode this_$iv$iv$iv4 = (DelegatingNode) node5;
                    Modifier.Node node$iv$iv$iv3 = this_$iv$iv$iv4.getDelegate();
                    while (node$iv$iv$iv3 != null) {
                        Modifier.Node next$iv$iv2 = node$iv$iv$iv3;
                        if ((next$iv$iv2.getKindSet() & type$iv3) != 0) {
                            count$iv$iv2++;
                            if (count$iv$iv2 == 1) {
                                node5 = next$iv$iv2;
                                $this$traverseAncestors_u2dY_u2dYKmho$iv2 = $this$traverseAncestors_u2dY_u2dYKmho$iv3;
                                type$iv2 = type$iv3;
                                $this$dispatchForKind_u2d6rFNWt0$iv$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv$iv6;
                            } else {
                                if (mutableVector10 == null) {
                                    $this$traverseAncestors_u2dY_u2dYKmho$iv2 = $this$traverseAncestors_u2dY_u2dYKmho$iv3;
                                    type$iv2 = type$iv3;
                                    $this$dispatchForKind_u2d6rFNWt0$iv$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv$iv6;
                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                } else {
                                    $this$traverseAncestors_u2dY_u2dYKmho$iv2 = $this$traverseAncestors_u2dY_u2dYKmho$iv3;
                                    type$iv2 = type$iv3;
                                    $this$dispatchForKind_u2d6rFNWt0$iv$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv$iv6;
                                    mutableVector = mutableVector10;
                                }
                                mutableVector10 = mutableVector;
                                Modifier.Node theNode$iv$iv2 = node5;
                                if (theNode$iv$iv2 != null) {
                                    if (mutableVector10 != null) {
                                        mutableVector10.add(theNode$iv$iv2);
                                    }
                                    node5 = null;
                                }
                                if (mutableVector10 != null) {
                                    mutableVector10.add(next$iv$iv2);
                                }
                            }
                        } else {
                            $this$traverseAncestors_u2dY_u2dYKmho$iv2 = $this$traverseAncestors_u2dY_u2dYKmho$iv3;
                            type$iv2 = type$iv3;
                            $this$dispatchForKind_u2d6rFNWt0$iv$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv$iv6;
                        }
                        node$iv$iv$iv3 = node$iv$iv$iv3.getChild();
                        $this$traverseAncestors_u2dY_u2dYKmho$iv3 = $this$traverseAncestors_u2dY_u2dYKmho$iv2;
                        type$iv3 = type$iv2;
                        $this$dispatchForKind_u2d6rFNWt0$iv$iv6 = $this$dispatchForKind_u2d6rFNWt0$iv$iv2;
                    }
                    $this$traverseAncestors_u2dY_u2dYKmho$iv = $this$traverseAncestors_u2dY_u2dYKmho$iv3;
                    type$iv = type$iv3;
                    $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$dispatchForKind_u2d6rFNWt0$iv$iv6;
                    if (count$iv$iv2 == 1) {
                        $this$traverseAncestors_u2dY_u2dYKmho$iv3 = $this$traverseAncestors_u2dY_u2dYKmho$iv;
                        type$iv3 = type$iv;
                        $this$dispatchForKind_u2d6rFNWt0$iv$iv6 = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
                    }
                } else {
                    $this$traverseAncestors_u2dY_u2dYKmho$iv = $this$traverseAncestors_u2dY_u2dYKmho$iv3;
                    type$iv = type$iv3;
                    $this$dispatchForKind_u2d6rFNWt0$iv$iv = $this$dispatchForKind_u2d6rFNWt0$iv$iv6;
                }
            }
            node5 = DelegatableNodeKt.pop(mutableVector10);
            $this$traverseAncestors_u2dY_u2dYKmho$iv3 = $this$traverseAncestors_u2dY_u2dYKmho$iv;
            type$iv3 = type$iv;
            $this$dispatchForKind_u2d6rFNWt0$iv$iv6 = $this$dispatchForKind_u2d6rFNWt0$iv$iv;
        }
        if (ancestors$iv == null) {
            return false;
        }
        int size2 = ancestors$iv.size();
        for (int index$iv$iv2 = 0; index$iv$iv2 < size2; index$iv$iv2++) {
            Object item$iv$iv2 = ancestors$iv.get(index$iv$iv2);
            KeyInputModifierNode it4 = (KeyInputModifierNode) item$iv$iv2;
            if (it4.mo142onKeyEventZmokQxo(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    public boolean mo2669dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent) {
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode2;
        Modifier.Node node;
        int i;
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode3;
        Modifier.Node node2;
        int i2;
        MutableVector mutableVector;
        Modifier.Node node3;
        int i3;
        Modifier.Node node4;
        int i4;
        MutableVector mutableVector2;
        int size;
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode4;
        FocusOwnerImpl focusOwnerImpl;
        int i5;
        NodeChain nodes;
        FocusOwnerImpl focusOwnerImpl2;
        int i6;
        FocusOwnerImpl focusOwnerImpl3;
        int i7;
        int i8;
        MutableVector mutableVector3;
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode5;
        FocusTargetNode focusTargetNode;
        NodeChain nodes2;
        FocusTargetNode focusTargetNode2;
        FocusTargetNode focusTargetNode3;
        MutableVector mutableVector4;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        int i9 = 1;
        if (findActiveFocusNode != null) {
            FocusTargetNode focusTargetNode4 = findActiveFocusNode;
            int m4443constructorimpl = NodeKind.m4443constructorimpl(131072);
            if (!focusTargetNode4.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent = focusTargetNode4.getNode().getParent();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode4);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    softKeyboardInterceptionModifierNode5 = null;
                    break;
                }
                if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m4443constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & m4443constructorimpl) != 0) {
                            MutableVector mutableVector5 = null;
                            Modifier.Node node5 = parent;
                            while (node5 != 0) {
                                if (node5 instanceof SoftKeyboardInterceptionModifierNode) {
                                    softKeyboardInterceptionModifierNode5 = node5;
                                    break loop0;
                                }
                                if (((node5.getKindSet() & m4443constructorimpl) != 0) && (node5 instanceof DelegatingNode)) {
                                    int i10 = 0;
                                    Modifier.Node delegate = node5.getDelegate();
                                    node5 = node5;
                                    while (delegate != null) {
                                        Modifier.Node node6 = delegate;
                                        if ((node6.getKindSet() & m4443constructorimpl) != 0) {
                                            i10++;
                                            if (i10 == i9) {
                                                node5 = node6;
                                                focusTargetNode3 = focusTargetNode4;
                                            } else {
                                                if (mutableVector5 == null) {
                                                    focusTargetNode3 = focusTargetNode4;
                                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                                } else {
                                                    focusTargetNode3 = focusTargetNode4;
                                                    mutableVector4 = mutableVector5;
                                                }
                                                Object obj = node5;
                                                node5 = node5;
                                                if (obj != null) {
                                                    if (mutableVector4 != null) {
                                                        mutableVector4.add(obj);
                                                    }
                                                    node5 = 0;
                                                }
                                                if (mutableVector4 != null) {
                                                    mutableVector4.add(node6);
                                                }
                                                mutableVector5 = mutableVector4;
                                            }
                                        } else {
                                            focusTargetNode3 = focusTargetNode4;
                                        }
                                        delegate = delegate.getChild();
                                        focusTargetNode4 = focusTargetNode3;
                                        i9 = 1;
                                        node5 = node5;
                                    }
                                    focusTargetNode2 = focusTargetNode4;
                                    if (i10 == 1) {
                                        focusTargetNode4 = focusTargetNode2;
                                        i9 = 1;
                                    }
                                } else {
                                    focusTargetNode2 = focusTargetNode4;
                                }
                                node5 = DelegatableNodeKt.pop(mutableVector5);
                                focusTargetNode4 = focusTargetNode2;
                                i9 = 1;
                            }
                        }
                        parent = parent.getParent();
                        focusTargetNode4 = focusTargetNode4;
                        i9 = 1;
                    }
                    focusTargetNode = focusTargetNode4;
                } else {
                    focusTargetNode = focusTargetNode4;
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent = (requireLayoutNode == null || (nodes2 = requireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
                focusTargetNode4 = focusTargetNode;
                i9 = 1;
            }
            softKeyboardInterceptionModifierNode = softKeyboardInterceptionModifierNode5;
        } else {
            softKeyboardInterceptionModifierNode = null;
        }
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode6 = softKeyboardInterceptionModifierNode;
        if (softKeyboardInterceptionModifierNode6 == null) {
            return false;
        }
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode7 = softKeyboardInterceptionModifierNode6;
        int m4443constructorimpl2 = NodeKind.m4443constructorimpl(131072);
        FocusOwnerImpl focusOwnerImpl4 = this;
        int i11 = 0;
        ArrayList arrayList = null;
        if (!softKeyboardInterceptionModifierNode7.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent2 = softKeyboardInterceptionModifierNode7.getNode().getParent();
        LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(softKeyboardInterceptionModifierNode7);
        while (requireLayoutNode2 != null) {
            if ((requireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & m4443constructorimpl2) != 0) {
                while (parent2 != null) {
                    if ((parent2.getKindSet() & m4443constructorimpl2) != 0) {
                        MutableVector mutableVector6 = null;
                        Modifier.Node node7 = parent2;
                        while (node7 != null) {
                            SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode8 = softKeyboardInterceptionModifierNode6;
                            if (node7 instanceof SoftKeyboardInterceptionModifierNode) {
                                Modifier.Node node8 = node7;
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(node8);
                                focusOwnerImpl2 = focusOwnerImpl4;
                                i6 = i11;
                            } else if (((node7.getKindSet() & m4443constructorimpl2) != 0) && (node7 instanceof DelegatingNode)) {
                                int i12 = 0;
                                Modifier.Node delegate2 = ((DelegatingNode) node7).getDelegate();
                                while (delegate2 != null) {
                                    Modifier.Node node9 = delegate2;
                                    if ((node9.getKindSet() & m4443constructorimpl2) != 0) {
                                        i12++;
                                        focusOwnerImpl3 = focusOwnerImpl4;
                                        if (i12 == 1) {
                                            node7 = node9;
                                            i7 = i11;
                                        } else {
                                            if (mutableVector6 == null) {
                                                i8 = i12;
                                                i7 = i11;
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            } else {
                                                i8 = i12;
                                                i7 = i11;
                                                mutableVector3 = mutableVector6;
                                            }
                                            MutableVector mutableVector7 = mutableVector3;
                                            Modifier.Node node10 = node7;
                                            if (node10 != null) {
                                                if (mutableVector7 != null) {
                                                    mutableVector7.add(node10);
                                                }
                                                node7 = null;
                                            }
                                            if (mutableVector7 != null) {
                                                mutableVector7.add(node9);
                                            }
                                            mutableVector6 = mutableVector7;
                                            i12 = i8;
                                        }
                                    } else {
                                        focusOwnerImpl3 = focusOwnerImpl4;
                                        i7 = i11;
                                    }
                                    delegate2 = delegate2.getChild();
                                    focusOwnerImpl4 = focusOwnerImpl3;
                                    i11 = i7;
                                }
                                focusOwnerImpl2 = focusOwnerImpl4;
                                i6 = i11;
                                if (i12 == 1) {
                                    softKeyboardInterceptionModifierNode6 = softKeyboardInterceptionModifierNode8;
                                    focusOwnerImpl4 = focusOwnerImpl2;
                                    i11 = i6;
                                }
                            } else {
                                focusOwnerImpl2 = focusOwnerImpl4;
                                i6 = i11;
                            }
                            node7 = DelegatableNodeKt.pop(mutableVector6);
                            softKeyboardInterceptionModifierNode6 = softKeyboardInterceptionModifierNode8;
                            focusOwnerImpl4 = focusOwnerImpl2;
                            i11 = i6;
                        }
                    }
                    parent2 = parent2.getParent();
                    softKeyboardInterceptionModifierNode6 = softKeyboardInterceptionModifierNode6;
                    focusOwnerImpl4 = focusOwnerImpl4;
                    i11 = i11;
                }
                softKeyboardInterceptionModifierNode4 = softKeyboardInterceptionModifierNode6;
                focusOwnerImpl = focusOwnerImpl4;
                i5 = i11;
            } else {
                softKeyboardInterceptionModifierNode4 = softKeyboardInterceptionModifierNode6;
                focusOwnerImpl = focusOwnerImpl4;
                i5 = i11;
            }
            requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
            parent2 = (requireLayoutNode2 == null || (nodes = requireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            softKeyboardInterceptionModifierNode6 = softKeyboardInterceptionModifierNode4;
            focusOwnerImpl4 = focusOwnerImpl;
            i11 = i5;
        }
        List list = arrayList;
        if (list != null && list.size() - 1 >= 0) {
            do {
                int i13 = size;
                size--;
                if (((SoftKeyboardInterceptionModifierNode) list.get(i13)).mo3656onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                    return true;
                }
            } while (size >= 0);
        }
        Modifier.Node node11 = softKeyboardInterceptionModifierNode7.getNode();
        int i14 = 0;
        MutableVector mutableVector8 = null;
        Modifier.Node node12 = node11;
        while (node12 != null) {
            if (node12 instanceof SoftKeyboardInterceptionModifierNode) {
                if (((SoftKeyboardInterceptionModifierNode) node12).mo3656onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                    return true;
                }
                node3 = node11;
                i3 = i14;
            } else if (((node12.getKindSet() & m4443constructorimpl2) != 0) && (node12 instanceof DelegatingNode)) {
                int i15 = 0;
                Modifier.Node delegate3 = ((DelegatingNode) node12).getDelegate();
                while (delegate3 != null) {
                    Modifier.Node node13 = delegate3;
                    if ((node13.getKindSet() & m4443constructorimpl2) != 0) {
                        i15++;
                        if (i15 == 1) {
                            node12 = node13;
                            node4 = node11;
                            i4 = i14;
                        } else {
                            if (mutableVector8 == null) {
                                node4 = node11;
                                i4 = i14;
                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                            } else {
                                node4 = node11;
                                i4 = i14;
                                mutableVector2 = mutableVector8;
                            }
                            mutableVector8 = mutableVector2;
                            Modifier.Node node14 = node12;
                            if (node14 != null) {
                                if (mutableVector8 != null) {
                                    mutableVector8.add(node14);
                                }
                                node12 = null;
                            }
                            if (mutableVector8 != null) {
                                mutableVector8.add(node13);
                            }
                        }
                    } else {
                        node4 = node11;
                        i4 = i14;
                    }
                    delegate3 = delegate3.getChild();
                    node11 = node4;
                    i14 = i4;
                }
                node3 = node11;
                i3 = i14;
                MutableVector mutableVector9 = mutableVector8;
                if (i15 == 1) {
                    node11 = node3;
                    i14 = i3;
                    mutableVector8 = mutableVector9;
                } else {
                    mutableVector8 = mutableVector9;
                }
            } else {
                node3 = node11;
                i3 = i14;
            }
            node12 = DelegatableNodeKt.pop(mutableVector8);
            node11 = node3;
            i14 = i3;
        }
        Modifier.Node node15 = softKeyboardInterceptionModifierNode7.getNode();
        MutableVector mutableVector10 = null;
        Modifier.Node node16 = node15;
        while (node16 != null) {
            if (node16 instanceof SoftKeyboardInterceptionModifierNode) {
                if (((SoftKeyboardInterceptionModifierNode) node16).mo3655onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                    return true;
                }
                softKeyboardInterceptionModifierNode2 = softKeyboardInterceptionModifierNode7;
                node = node15;
                i = m4443constructorimpl2;
            } else if (((node16.getKindSet() & m4443constructorimpl2) != 0) && (node16 instanceof DelegatingNode)) {
                int i16 = 0;
                Modifier.Node delegate4 = ((DelegatingNode) node16).getDelegate();
                while (delegate4 != null) {
                    Modifier.Node node17 = delegate4;
                    if ((node17.getKindSet() & m4443constructorimpl2) != 0) {
                        i16++;
                        if (i16 == 1) {
                            node16 = node17;
                            softKeyboardInterceptionModifierNode3 = softKeyboardInterceptionModifierNode7;
                            node2 = node15;
                            i2 = m4443constructorimpl2;
                        } else {
                            if (mutableVector10 == null) {
                                softKeyboardInterceptionModifierNode3 = softKeyboardInterceptionModifierNode7;
                                node2 = node15;
                                i2 = m4443constructorimpl2;
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            } else {
                                softKeyboardInterceptionModifierNode3 = softKeyboardInterceptionModifierNode7;
                                node2 = node15;
                                i2 = m4443constructorimpl2;
                                mutableVector = mutableVector10;
                            }
                            mutableVector10 = mutableVector;
                            Modifier.Node node18 = node16;
                            if (node18 != null) {
                                if (mutableVector10 != null) {
                                    mutableVector10.add(node18);
                                }
                                node16 = null;
                            }
                            if (mutableVector10 != null) {
                                mutableVector10.add(node17);
                            }
                        }
                    } else {
                        softKeyboardInterceptionModifierNode3 = softKeyboardInterceptionModifierNode7;
                        node2 = node15;
                        i2 = m4443constructorimpl2;
                    }
                    delegate4 = delegate4.getChild();
                    softKeyboardInterceptionModifierNode7 = softKeyboardInterceptionModifierNode3;
                    node15 = node2;
                    m4443constructorimpl2 = i2;
                }
                softKeyboardInterceptionModifierNode2 = softKeyboardInterceptionModifierNode7;
                node = node15;
                i = m4443constructorimpl2;
                if (i16 == 1) {
                    softKeyboardInterceptionModifierNode7 = softKeyboardInterceptionModifierNode2;
                    node15 = node;
                    m4443constructorimpl2 = i;
                }
            } else {
                softKeyboardInterceptionModifierNode2 = softKeyboardInterceptionModifierNode7;
                node = node15;
                i = m4443constructorimpl2;
            }
            node16 = DelegatableNodeKt.pop(mutableVector10);
            softKeyboardInterceptionModifierNode7 = softKeyboardInterceptionModifierNode2;
            node15 = node;
            m4443constructorimpl2 = i;
        }
        if (list == null) {
            return false;
        }
        int size2 = list.size();
        for (int i17 = 0; i17 < size2; i17++) {
            if (((SoftKeyboardInterceptionModifierNode) list.get(i17)).mo3655onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(RotaryScrollEvent event) {
        RotaryInputModifierNode rotaryInputModifierNode;
        RotaryInputModifierNode rotaryInputModifierNode2;
        Modifier.Node node;
        int i;
        RotaryInputModifierNode rotaryInputModifierNode3;
        Modifier.Node node2;
        int i2;
        MutableVector mutableVector;
        Modifier.Node node3;
        int i3;
        Modifier.Node node4;
        int i4;
        MutableVector mutableVector2;
        int size;
        RotaryInputModifierNode rotaryInputModifierNode4;
        FocusOwnerImpl focusOwnerImpl;
        int i5;
        NodeChain nodes;
        FocusOwnerImpl focusOwnerImpl2;
        int i6;
        FocusOwnerImpl focusOwnerImpl3;
        int i7;
        int i8;
        MutableVector mutableVector3;
        RotaryInputModifierNode rotaryInputModifierNode5;
        FocusTargetNode focusTargetNode;
        NodeChain nodes2;
        FocusTargetNode focusTargetNode2;
        FocusTargetNode focusTargetNode3;
        MutableVector mutableVector4;
        Intrinsics.checkNotNullParameter(event, "event");
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        int i9 = 1;
        if (findActiveFocusNode != null) {
            FocusTargetNode focusTargetNode4 = findActiveFocusNode;
            int m4443constructorimpl = NodeKind.m4443constructorimpl(16384);
            if (!focusTargetNode4.getNode().getIsAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent = focusTargetNode4.getNode().getParent();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode4);
            loop0: while (true) {
                if (requireLayoutNode == null) {
                    rotaryInputModifierNode5 = null;
                    break;
                }
                if ((requireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & m4443constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & m4443constructorimpl) != 0) {
                            MutableVector mutableVector5 = null;
                            Modifier.Node node5 = parent;
                            while (node5 != 0) {
                                if (node5 instanceof RotaryInputModifierNode) {
                                    rotaryInputModifierNode5 = node5;
                                    break loop0;
                                }
                                if (((node5.getKindSet() & m4443constructorimpl) != 0) && (node5 instanceof DelegatingNode)) {
                                    int i10 = 0;
                                    Modifier.Node delegate = node5.getDelegate();
                                    node5 = node5;
                                    while (delegate != null) {
                                        Modifier.Node node6 = delegate;
                                        if ((node6.getKindSet() & m4443constructorimpl) != 0) {
                                            i10++;
                                            if (i10 == i9) {
                                                node5 = node6;
                                                focusTargetNode3 = focusTargetNode4;
                                            } else {
                                                if (mutableVector5 == null) {
                                                    focusTargetNode3 = focusTargetNode4;
                                                    mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                                } else {
                                                    focusTargetNode3 = focusTargetNode4;
                                                    mutableVector4 = mutableVector5;
                                                }
                                                Object obj = node5;
                                                node5 = node5;
                                                if (obj != null) {
                                                    if (mutableVector4 != null) {
                                                        mutableVector4.add(obj);
                                                    }
                                                    node5 = 0;
                                                }
                                                if (mutableVector4 != null) {
                                                    mutableVector4.add(node6);
                                                }
                                                mutableVector5 = mutableVector4;
                                            }
                                        } else {
                                            focusTargetNode3 = focusTargetNode4;
                                        }
                                        delegate = delegate.getChild();
                                        focusTargetNode4 = focusTargetNode3;
                                        i9 = 1;
                                        node5 = node5;
                                    }
                                    focusTargetNode2 = focusTargetNode4;
                                    if (i10 == 1) {
                                        focusTargetNode4 = focusTargetNode2;
                                        i9 = 1;
                                    }
                                } else {
                                    focusTargetNode2 = focusTargetNode4;
                                }
                                node5 = DelegatableNodeKt.pop(mutableVector5);
                                focusTargetNode4 = focusTargetNode2;
                                i9 = 1;
                            }
                        }
                        parent = parent.getParent();
                        focusTargetNode4 = focusTargetNode4;
                        i9 = 1;
                    }
                    focusTargetNode = focusTargetNode4;
                } else {
                    focusTargetNode = focusTargetNode4;
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                parent = (requireLayoutNode == null || (nodes2 = requireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
                focusTargetNode4 = focusTargetNode;
                i9 = 1;
            }
            rotaryInputModifierNode = rotaryInputModifierNode5;
        } else {
            rotaryInputModifierNode = null;
        }
        RotaryInputModifierNode rotaryInputModifierNode6 = rotaryInputModifierNode;
        if (rotaryInputModifierNode6 == null) {
            return false;
        }
        RotaryInputModifierNode rotaryInputModifierNode7 = rotaryInputModifierNode6;
        int m4443constructorimpl2 = NodeKind.m4443constructorimpl(16384);
        FocusOwnerImpl focusOwnerImpl4 = this;
        int i11 = 0;
        ArrayList arrayList = null;
        if (!rotaryInputModifierNode7.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent2 = rotaryInputModifierNode7.getNode().getParent();
        LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(rotaryInputModifierNode7);
        while (requireLayoutNode2 != null) {
            if ((requireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & m4443constructorimpl2) != 0) {
                while (parent2 != null) {
                    if ((parent2.getKindSet() & m4443constructorimpl2) != 0) {
                        MutableVector mutableVector6 = null;
                        Modifier.Node node7 = parent2;
                        while (node7 != null) {
                            RotaryInputModifierNode rotaryInputModifierNode8 = rotaryInputModifierNode6;
                            if (node7 instanceof RotaryInputModifierNode) {
                                Modifier.Node node8 = node7;
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(node8);
                                focusOwnerImpl2 = focusOwnerImpl4;
                                i6 = i11;
                            } else if (((node7.getKindSet() & m4443constructorimpl2) != 0) && (node7 instanceof DelegatingNode)) {
                                int i12 = 0;
                                Modifier.Node delegate2 = ((DelegatingNode) node7).getDelegate();
                                while (delegate2 != null) {
                                    Modifier.Node node9 = delegate2;
                                    if ((node9.getKindSet() & m4443constructorimpl2) != 0) {
                                        i12++;
                                        focusOwnerImpl3 = focusOwnerImpl4;
                                        if (i12 == 1) {
                                            node7 = node9;
                                            i7 = i11;
                                        } else {
                                            if (mutableVector6 == null) {
                                                i8 = i12;
                                                i7 = i11;
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            } else {
                                                i8 = i12;
                                                i7 = i11;
                                                mutableVector3 = mutableVector6;
                                            }
                                            MutableVector mutableVector7 = mutableVector3;
                                            Modifier.Node node10 = node7;
                                            if (node10 != null) {
                                                if (mutableVector7 != null) {
                                                    mutableVector7.add(node10);
                                                }
                                                node7 = null;
                                            }
                                            if (mutableVector7 != null) {
                                                mutableVector7.add(node9);
                                            }
                                            mutableVector6 = mutableVector7;
                                            i12 = i8;
                                        }
                                    } else {
                                        focusOwnerImpl3 = focusOwnerImpl4;
                                        i7 = i11;
                                    }
                                    delegate2 = delegate2.getChild();
                                    focusOwnerImpl4 = focusOwnerImpl3;
                                    i11 = i7;
                                }
                                focusOwnerImpl2 = focusOwnerImpl4;
                                i6 = i11;
                                if (i12 == 1) {
                                    rotaryInputModifierNode6 = rotaryInputModifierNode8;
                                    focusOwnerImpl4 = focusOwnerImpl2;
                                    i11 = i6;
                                }
                            } else {
                                focusOwnerImpl2 = focusOwnerImpl4;
                                i6 = i11;
                            }
                            node7 = DelegatableNodeKt.pop(mutableVector6);
                            rotaryInputModifierNode6 = rotaryInputModifierNode8;
                            focusOwnerImpl4 = focusOwnerImpl2;
                            i11 = i6;
                        }
                    }
                    parent2 = parent2.getParent();
                    rotaryInputModifierNode6 = rotaryInputModifierNode6;
                    focusOwnerImpl4 = focusOwnerImpl4;
                    i11 = i11;
                }
                rotaryInputModifierNode4 = rotaryInputModifierNode6;
                focusOwnerImpl = focusOwnerImpl4;
                i5 = i11;
            } else {
                rotaryInputModifierNode4 = rotaryInputModifierNode6;
                focusOwnerImpl = focusOwnerImpl4;
                i5 = i11;
            }
            requireLayoutNode2 = requireLayoutNode2.getParent$ui_release();
            parent2 = (requireLayoutNode2 == null || (nodes = requireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            rotaryInputModifierNode6 = rotaryInputModifierNode4;
            focusOwnerImpl4 = focusOwnerImpl;
            i11 = i5;
        }
        List list = arrayList;
        if (list != null && list.size() - 1 >= 0) {
            do {
                int i13 = size;
                size--;
                if (((RotaryInputModifierNode) list.get(i13)).onPreRotaryScrollEvent(event)) {
                    return true;
                }
            } while (size >= 0);
        }
        Modifier.Node node11 = rotaryInputModifierNode7.getNode();
        int i14 = 0;
        MutableVector mutableVector8 = null;
        Modifier.Node node12 = node11;
        while (node12 != null) {
            if (node12 instanceof RotaryInputModifierNode) {
                if (((RotaryInputModifierNode) node12).onPreRotaryScrollEvent(event)) {
                    return true;
                }
                node3 = node11;
                i3 = i14;
            } else if (((node12.getKindSet() & m4443constructorimpl2) != 0) && (node12 instanceof DelegatingNode)) {
                int i15 = 0;
                Modifier.Node delegate3 = ((DelegatingNode) node12).getDelegate();
                while (delegate3 != null) {
                    Modifier.Node node13 = delegate3;
                    if ((node13.getKindSet() & m4443constructorimpl2) != 0) {
                        i15++;
                        if (i15 == 1) {
                            node12 = node13;
                            node4 = node11;
                            i4 = i14;
                        } else {
                            if (mutableVector8 == null) {
                                node4 = node11;
                                i4 = i14;
                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                            } else {
                                node4 = node11;
                                i4 = i14;
                                mutableVector2 = mutableVector8;
                            }
                            mutableVector8 = mutableVector2;
                            Modifier.Node node14 = node12;
                            if (node14 != null) {
                                if (mutableVector8 != null) {
                                    mutableVector8.add(node14);
                                }
                                node12 = null;
                            }
                            if (mutableVector8 != null) {
                                mutableVector8.add(node13);
                            }
                        }
                    } else {
                        node4 = node11;
                        i4 = i14;
                    }
                    delegate3 = delegate3.getChild();
                    node11 = node4;
                    i14 = i4;
                }
                node3 = node11;
                i3 = i14;
                MutableVector mutableVector9 = mutableVector8;
                if (i15 == 1) {
                    node11 = node3;
                    i14 = i3;
                    mutableVector8 = mutableVector9;
                } else {
                    mutableVector8 = mutableVector9;
                }
            } else {
                node3 = node11;
                i3 = i14;
            }
            node12 = DelegatableNodeKt.pop(mutableVector8);
            node11 = node3;
            i14 = i3;
        }
        Modifier.Node node15 = rotaryInputModifierNode7.getNode();
        MutableVector mutableVector10 = null;
        Modifier.Node node16 = node15;
        while (node16 != null) {
            if (node16 instanceof RotaryInputModifierNode) {
                if (((RotaryInputModifierNode) node16).onRotaryScrollEvent(event)) {
                    return true;
                }
                rotaryInputModifierNode2 = rotaryInputModifierNode7;
                node = node15;
                i = m4443constructorimpl2;
            } else if (((node16.getKindSet() & m4443constructorimpl2) != 0) && (node16 instanceof DelegatingNode)) {
                int i16 = 0;
                Modifier.Node delegate4 = ((DelegatingNode) node16).getDelegate();
                while (delegate4 != null) {
                    Modifier.Node node17 = delegate4;
                    if ((node17.getKindSet() & m4443constructorimpl2) != 0) {
                        i16++;
                        if (i16 == 1) {
                            node16 = node17;
                            rotaryInputModifierNode3 = rotaryInputModifierNode7;
                            node2 = node15;
                            i2 = m4443constructorimpl2;
                        } else {
                            if (mutableVector10 == null) {
                                rotaryInputModifierNode3 = rotaryInputModifierNode7;
                                node2 = node15;
                                i2 = m4443constructorimpl2;
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            } else {
                                rotaryInputModifierNode3 = rotaryInputModifierNode7;
                                node2 = node15;
                                i2 = m4443constructorimpl2;
                                mutableVector = mutableVector10;
                            }
                            mutableVector10 = mutableVector;
                            Modifier.Node node18 = node16;
                            if (node18 != null) {
                                if (mutableVector10 != null) {
                                    mutableVector10.add(node18);
                                }
                                node16 = null;
                            }
                            if (mutableVector10 != null) {
                                mutableVector10.add(node17);
                            }
                        }
                    } else {
                        rotaryInputModifierNode3 = rotaryInputModifierNode7;
                        node2 = node15;
                        i2 = m4443constructorimpl2;
                    }
                    delegate4 = delegate4.getChild();
                    rotaryInputModifierNode7 = rotaryInputModifierNode3;
                    node15 = node2;
                    m4443constructorimpl2 = i2;
                }
                rotaryInputModifierNode2 = rotaryInputModifierNode7;
                node = node15;
                i = m4443constructorimpl2;
                if (i16 == 1) {
                    rotaryInputModifierNode7 = rotaryInputModifierNode2;
                    node15 = node;
                    m4443constructorimpl2 = i;
                }
            } else {
                rotaryInputModifierNode2 = rotaryInputModifierNode7;
                node = node15;
                i = m4443constructorimpl2;
            }
            node16 = DelegatableNodeKt.pop(mutableVector10);
            rotaryInputModifierNode7 = rotaryInputModifierNode2;
            node15 = node;
            m4443constructorimpl2 = i;
        }
        if (list == null) {
            return false;
        }
        int size2 = list.size();
        for (int i17 = 0; i17 < size2; i17++) {
            if (((RotaryInputModifierNode) list.get(i17)).onRotaryScrollEvent(event)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusTargetNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusEventModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusPropertiesModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.focusInvalidationManager.scheduleInvalidation(node);
    }

    /* renamed from: traverseAncestors-Y-YKmho, reason: not valid java name */
    private final /* synthetic */ <T extends DelegatableNode> void m2671traverseAncestorsYYKmho(DelegatableNode $this$traverseAncestors_u2dY_u2dYKmho, int type, Function1<? super T, Unit> function1, Function1<? super T, Unit> function12) {
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv;
        int i;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv2;
        int i2;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv3;
        int i3;
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv4;
        int i4;
        int size;
        int i5;
        DelegatableNode $this$ancestors_u2d64DMado$iv;
        int i6;
        NodeChain nodes;
        int i7;
        DelegatableNode $this$ancestors_u2d64DMado$iv2;
        int i8;
        DelegatableNode $this$ancestors_u2d64DMado$iv3;
        int i9;
        int i10;
        Object result$iv;
        int count$iv$iv$iv;
        Function1<? super T, Unit> function13 = function1;
        int count$iv$iv$iv2 = 0;
        DelegatableNode $this$ancestors_u2d64DMado$iv4 = $this$traverseAncestors_u2dY_u2dYKmho;
        int i11 = 0;
        Object result$iv2 = null;
        if (!$this$ancestors_u2d64DMado$iv4.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node$iv$iv$iv = $this$ancestors_u2d64DMado$iv4.getNode().getParent();
        LayoutNode layout$iv$iv$iv = DelegatableNodeKt.requireLayoutNode($this$ancestors_u2d64DMado$iv4);
        while (layout$iv$iv$iv != null) {
            Modifier.Node head$iv$iv$iv = layout$iv$iv$iv.getNodes().getHead();
            if ((head$iv$iv$iv.getAggregateChildKindSet() & type) != 0) {
                while (node$iv$iv$iv != null) {
                    if ((node$iv$iv$iv.getKindSet() & type) != 0) {
                        Modifier.Node it$iv$iv = node$iv$iv$iv;
                        Object stack$iv$iv$iv = null;
                        Modifier.Node this_$iv$iv$iv$iv = it$iv$iv;
                        while (this_$iv$iv$iv$iv != null) {
                            int i12 = count$iv$iv$iv2;
                            Intrinsics.reifiedOperationMarker(3, "T");
                            if (this_$iv$iv$iv$iv instanceof Object) {
                                Modifier.Node node = this_$iv$iv$iv$iv;
                                if (result$iv2 == null) {
                                    Object result$iv3 = new ArrayList();
                                    result$iv2 = (List) result$iv3;
                                }
                                $this$ancestors_u2d64DMado$iv3 = $this$ancestors_u2d64DMado$iv4;
                                ((List) result$iv2).add(node);
                                i9 = i11;
                            } else {
                                $this$ancestors_u2d64DMado$iv3 = $this$ancestors_u2d64DMado$iv4;
                                if (((this_$iv$iv$iv$iv.getKindSet() & type) != 0) && (this_$iv$iv$iv$iv instanceof DelegatingNode)) {
                                    int count$iv$iv$iv3 = 0;
                                    DelegatingNode this_$iv$iv$iv$iv2 = (DelegatingNode) this_$iv$iv$iv$iv;
                                    Modifier.Node node$iv$iv$iv$iv = this_$iv$iv$iv$iv2.getDelegate();
                                    while (node$iv$iv$iv$iv != null) {
                                        DelegatingNode this_$iv$iv$iv$iv3 = this_$iv$iv$iv$iv2;
                                        Modifier.Node next$iv$iv$iv = node$iv$iv$iv$iv;
                                        if ((next$iv$iv$iv.getKindSet() & type) != 0) {
                                            count$iv$iv$iv3++;
                                            i10 = i11;
                                            if (count$iv$iv$iv3 == 1) {
                                                this_$iv$iv$iv$iv = next$iv$iv$iv;
                                                result$iv = result$iv2;
                                            } else {
                                                Object obj = (MutableVector) stack$iv$iv$iv;
                                                if (obj == null) {
                                                    count$iv$iv$iv = count$iv$iv$iv3;
                                                    result$iv = result$iv2;
                                                    obj = new MutableVector(new Modifier.Node[16], 0);
                                                } else {
                                                    count$iv$iv$iv = count$iv$iv$iv3;
                                                    result$iv = result$iv2;
                                                }
                                                stack$iv$iv$iv = obj;
                                                Modifier.Node theNode$iv$iv$iv = this_$iv$iv$iv$iv;
                                                if (theNode$iv$iv$iv != null) {
                                                    MutableVector mutableVector = (MutableVector) stack$iv$iv$iv;
                                                    if (mutableVector != null) {
                                                        mutableVector.add(theNode$iv$iv$iv);
                                                    }
                                                    this_$iv$iv$iv$iv = null;
                                                }
                                                MutableVector mutableVector2 = (MutableVector) stack$iv$iv$iv;
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(next$iv$iv$iv);
                                                }
                                                count$iv$iv$iv3 = count$iv$iv$iv;
                                            }
                                        } else {
                                            i10 = i11;
                                            result$iv = result$iv2;
                                        }
                                        node$iv$iv$iv$iv = node$iv$iv$iv$iv.getChild();
                                        this_$iv$iv$iv$iv2 = this_$iv$iv$iv$iv3;
                                        i11 = i10;
                                        result$iv2 = result$iv;
                                    }
                                    i9 = i11;
                                    Object result$iv4 = result$iv2;
                                    if (count$iv$iv$iv3 == 1) {
                                        count$iv$iv$iv2 = i12;
                                        $this$ancestors_u2d64DMado$iv4 = $this$ancestors_u2d64DMado$iv3;
                                        i11 = i9;
                                        result$iv2 = result$iv4;
                                    } else {
                                        result$iv2 = result$iv4;
                                    }
                                } else {
                                    i9 = i11;
                                    result$iv2 = result$iv2;
                                }
                            }
                            this_$iv$iv$iv$iv = DelegatableNodeKt.pop((MutableVector) stack$iv$iv$iv);
                            count$iv$iv$iv2 = i12;
                            $this$ancestors_u2d64DMado$iv4 = $this$ancestors_u2d64DMado$iv3;
                            i11 = i9;
                        }
                        i7 = count$iv$iv$iv2;
                        $this$ancestors_u2d64DMado$iv2 = $this$ancestors_u2d64DMado$iv4;
                        i8 = i11;
                    } else {
                        i7 = count$iv$iv$iv2;
                        $this$ancestors_u2d64DMado$iv2 = $this$ancestors_u2d64DMado$iv4;
                        i8 = i11;
                    }
                    node$iv$iv$iv = node$iv$iv$iv.getParent();
                    count$iv$iv$iv2 = i7;
                    $this$ancestors_u2d64DMado$iv4 = $this$ancestors_u2d64DMado$iv2;
                    i11 = i8;
                }
                i5 = count$iv$iv$iv2;
                $this$ancestors_u2d64DMado$iv = $this$ancestors_u2d64DMado$iv4;
                i6 = i11;
            } else {
                i5 = count$iv$iv$iv2;
                $this$ancestors_u2d64DMado$iv = $this$ancestors_u2d64DMado$iv4;
                i6 = i11;
            }
            layout$iv$iv$iv = layout$iv$iv$iv.getParent$ui_release();
            node$iv$iv$iv = (layout$iv$iv$iv == null || (nodes = layout$iv$iv$iv.getNodes()) == null) ? null : nodes.getTail();
            count$iv$iv$iv2 = i5;
            $this$ancestors_u2d64DMado$iv4 = $this$ancestors_u2d64DMado$iv;
            i11 = i6;
        }
        List ancestors = (List) result$iv2;
        if (ancestors != null && ancestors.size() - 1 >= 0) {
            do {
                int index$iv = size;
                size--;
                Object item$iv = ancestors.get(index$iv);
                function13.invoke(item$iv);
            } while (size >= 0);
        }
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv5 = $this$traverseAncestors_u2dY_u2dYKmho.getNode();
        int i13 = 0;
        Object stack$iv = null;
        Modifier.Node node$iv = $this$dispatchForKind_u2d6rFNWt0$iv5;
        while (node$iv != null) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if (node$iv instanceof Object) {
                function13.invoke(node$iv);
                $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv5;
                i3 = i13;
            } else {
                Modifier.Node this_$iv$iv = node$iv;
                if (((this_$iv$iv.getKindSet() & type) != 0) && (node$iv instanceof DelegatingNode)) {
                    int count$iv = 0;
                    DelegatingNode this_$iv$iv2 = (DelegatingNode) node$iv;
                    Modifier.Node node$iv$iv = this_$iv$iv2.getDelegate();
                    while (node$iv$iv != null) {
                        Modifier.Node next$iv = node$iv$iv;
                        if ((next$iv.getKindSet() & type) != 0) {
                            count$iv++;
                            if (count$iv == 1) {
                                node$iv = next$iv;
                                $this$dispatchForKind_u2d6rFNWt0$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv5;
                                i4 = i13;
                            } else {
                                Object obj2 = (MutableVector) stack$iv;
                                if (obj2 == null) {
                                    $this$dispatchForKind_u2d6rFNWt0$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv5;
                                    i4 = i13;
                                    Object mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                    obj2 = mutableVector3;
                                } else {
                                    $this$dispatchForKind_u2d6rFNWt0$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv5;
                                    i4 = i13;
                                }
                                stack$iv = obj2;
                                Modifier.Node theNode$iv = node$iv;
                                if (theNode$iv != null) {
                                    MutableVector mutableVector4 = (MutableVector) stack$iv;
                                    if (mutableVector4 != null) {
                                        mutableVector4.add(theNode$iv);
                                    }
                                    node$iv = null;
                                }
                                MutableVector mutableVector5 = (MutableVector) stack$iv;
                                if (mutableVector5 != null) {
                                    mutableVector5.add(next$iv);
                                }
                            }
                        } else {
                            $this$dispatchForKind_u2d6rFNWt0$iv4 = $this$dispatchForKind_u2d6rFNWt0$iv5;
                            i4 = i13;
                        }
                        node$iv$iv = node$iv$iv.getChild();
                        $this$dispatchForKind_u2d6rFNWt0$iv5 = $this$dispatchForKind_u2d6rFNWt0$iv4;
                        i13 = i4;
                    }
                    $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv5;
                    i3 = i13;
                    if (count$iv == 1) {
                        function13 = function1;
                        $this$dispatchForKind_u2d6rFNWt0$iv5 = $this$dispatchForKind_u2d6rFNWt0$iv3;
                        i13 = i3;
                    }
                } else {
                    $this$dispatchForKind_u2d6rFNWt0$iv3 = $this$dispatchForKind_u2d6rFNWt0$iv5;
                    i3 = i13;
                }
            }
            node$iv = DelegatableNodeKt.pop((MutableVector) stack$iv);
            function13 = function1;
            $this$dispatchForKind_u2d6rFNWt0$iv5 = $this$dispatchForKind_u2d6rFNWt0$iv3;
            i13 = i3;
        }
        Modifier.Node $this$dispatchForKind_u2d6rFNWt0$iv6 = $this$traverseAncestors_u2dY_u2dYKmho.getNode();
        int i14 = 0;
        Object stack$iv2 = null;
        Modifier.Node node$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv6;
        while (node$iv2 != null) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if (node$iv2 instanceof Object) {
                function12.invoke(node$iv2);
                $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv6;
                i = i14;
            } else {
                Modifier.Node this_$iv$iv3 = node$iv2;
                if (((this_$iv$iv3.getKindSet() & type) != 0) && (node$iv2 instanceof DelegatingNode)) {
                    int count$iv2 = 0;
                    DelegatingNode this_$iv$iv4 = (DelegatingNode) node$iv2;
                    Modifier.Node node$iv$iv2 = this_$iv$iv4.getDelegate();
                    while (node$iv$iv2 != null) {
                        Modifier.Node next$iv2 = node$iv$iv2;
                        if ((next$iv2.getKindSet() & type) != 0) {
                            count$iv2++;
                            if (count$iv2 == 1) {
                                node$iv2 = next$iv2;
                                $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv6;
                                i2 = i14;
                            } else {
                                Object obj3 = (MutableVector) stack$iv2;
                                if (obj3 == null) {
                                    $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv6;
                                    i2 = i14;
                                    Object mutableVector6 = new MutableVector(new Modifier.Node[16], 0);
                                    obj3 = mutableVector6;
                                } else {
                                    $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv6;
                                    i2 = i14;
                                }
                                stack$iv2 = obj3;
                                Modifier.Node theNode$iv2 = node$iv2;
                                if (theNode$iv2 != null) {
                                    MutableVector mutableVector7 = (MutableVector) stack$iv2;
                                    if (mutableVector7 != null) {
                                        mutableVector7.add(theNode$iv2);
                                    }
                                    node$iv2 = null;
                                }
                                MutableVector mutableVector8 = (MutableVector) stack$iv2;
                                if (mutableVector8 != null) {
                                    mutableVector8.add(next$iv2);
                                }
                            }
                        } else {
                            $this$dispatchForKind_u2d6rFNWt0$iv2 = $this$dispatchForKind_u2d6rFNWt0$iv6;
                            i2 = i14;
                        }
                        node$iv$iv2 = node$iv$iv2.getChild();
                        $this$dispatchForKind_u2d6rFNWt0$iv6 = $this$dispatchForKind_u2d6rFNWt0$iv2;
                        i14 = i2;
                    }
                    $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv6;
                    i = i14;
                    if (count$iv2 == 1) {
                        $this$dispatchForKind_u2d6rFNWt0$iv6 = $this$dispatchForKind_u2d6rFNWt0$iv;
                        i14 = i;
                    }
                } else {
                    $this$dispatchForKind_u2d6rFNWt0$iv = $this$dispatchForKind_u2d6rFNWt0$iv6;
                    i = i14;
                }
            }
            node$iv2 = DelegatableNodeKt.pop((MutableVector) stack$iv2);
            $this$dispatchForKind_u2d6rFNWt0$iv6 = $this$dispatchForKind_u2d6rFNWt0$iv;
            i14 = i;
        }
        if (ancestors != null) {
            int size2 = ancestors.size();
            for (int index$iv2 = 0; index$iv2 < size2; index$iv2++) {
                Object item$iv2 = ancestors.get(index$iv2);
                function12.invoke(item$iv2);
            }
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Rect getFocusRect() {
        FocusTargetNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            return FocusTraversalKt.focusRect(findActiveFocusNode);
        }
        return null;
    }

    private final Modifier.Node lastLocalKeyInputNode(DelegatableNode $this$lastLocalKeyInputNode) {
        Modifier.Node node = null;
        int mask$iv = NodeKind.m4443constructorimpl(1024) | NodeKind.m4443constructorimpl(8192);
        if (!$this$lastLocalKeyInputNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
        }
        Modifier.Node self$iv = $this$lastLocalKeyInputNode.getNode();
        if ((self$iv.getAggregateChildKindSet() & mask$iv) != 0) {
            for (Modifier.Node next$iv = self$iv.getChild(); next$iv != null; next$iv = next$iv.getChild()) {
                if ((next$iv.getKindSet() & mask$iv) != 0) {
                    Modifier.Node modifierNode = next$iv;
                    if ((modifierNode.getKindSet() & NodeKind.m4443constructorimpl(1024)) != 0) {
                        return node;
                    }
                    node = modifierNode;
                }
            }
        }
        return node;
    }

    /* renamed from: wrapAroundFocus-3ESFkO8, reason: not valid java name */
    private final boolean m2672wrapAroundFocus3ESFkO8(int focusDirection) {
        if (!this.rootFocusNode.getFocusState().getHasFocus() || this.rootFocusNode.getFocusState().isFocused()) {
            return false;
        }
        if (!(FocusDirection.m2650equalsimpl0(focusDirection, FocusDirection.INSTANCE.m2663getNextdhqQ8s()) ? true : FocusDirection.m2650equalsimpl0(focusDirection, FocusDirection.INSTANCE.m2665getPreviousdhqQ8s()))) {
            return false;
        }
        clearFocus(false);
        if (this.rootFocusNode.getFocusState().isFocused()) {
            return mo2668moveFocus3ESFkO8(focusDirection);
        }
        return false;
    }
}
