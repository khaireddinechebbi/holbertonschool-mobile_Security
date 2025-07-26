package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModifierLocalManager.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tJ\u0006\u0010\u0015\u001a\u00020\u0012J*\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00172\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tJ\u0006\u0010\u001b\u001a\u00020\u0012J\u001a\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalManager;", "", "owner", "Landroidx/compose/ui/node/Owner;", "(Landroidx/compose/ui/node/Owner;)V", "inserted", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/BackwardsCompatNode;", "insertedLocal", "Landroidx/compose/ui/modifier/ModifierLocal;", "invalidated", "", "getOwner", "()Landroidx/compose/ui/node/Owner;", "removed", "Landroidx/compose/ui/node/LayoutNode;", "removedLocal", "insertedProvider", "", "node", "key", "invalidate", "invalidateConsumersOfNodeForKey", "Landroidx/compose/ui/Modifier$Node;", "set", "", "removedProvider", "triggerUpdates", "updatedProvider", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModifierLocalManager {
    private final MutableVector<BackwardsCompatNode> inserted;
    private final MutableVector<ModifierLocal<?>> insertedLocal;
    private boolean invalidated;
    private final Owner owner;
    private final MutableVector<LayoutNode> removed;
    private final MutableVector<ModifierLocal<?>> removedLocal;

    public ModifierLocalManager(Owner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.owner = owner;
        this.inserted = new MutableVector<>(new BackwardsCompatNode[16], 0);
        this.insertedLocal = new MutableVector<>(new ModifierLocal[16], 0);
        this.removed = new MutableVector<>(new LayoutNode[16], 0);
        this.removedLocal = new MutableVector<>(new ModifierLocal[16], 0);
    }

    public final Owner getOwner() {
        return this.owner;
    }

    public final void invalidate() {
        if (!this.invalidated) {
            this.invalidated = true;
            this.owner.registerOnEndApplyChangesListener(new Function0<Unit>() { // from class: androidx.compose.ui.modifier.ModifierLocalManager$invalidate$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ModifierLocalManager.this.triggerUpdates();
                }
            });
        }
    }

    public final void triggerUpdates() {
        this.invalidated = false;
        Iterable toUpdate = new HashSet();
        MutableVector this_$iv = this.removed;
        int size$iv = this_$iv.getSize();
        if (size$iv > 0) {
            int i$iv = 0;
            Object[] content$iv = this_$iv.getContent();
            do {
                LayoutNode layout = (LayoutNode) content$iv[i$iv];
                int i = i$iv;
                ModifierLocal<?> key = this.removedLocal.getContent()[i];
                if (layout.getNodes().getHead().getIsAttached()) {
                    invalidateConsumersOfNodeForKey(layout.getNodes().getHead(), key, (Set) toUpdate);
                }
                i$iv++;
            } while (i$iv < size$iv);
        }
        this.removed.clear();
        this.removedLocal.clear();
        MutableVector this_$iv2 = this.inserted;
        int size$iv2 = this_$iv2.getSize();
        if (size$iv2 > 0) {
            int i$iv2 = 0;
            Object[] content$iv2 = this_$iv2.getContent();
            do {
                BackwardsCompatNode node = (BackwardsCompatNode) content$iv2[i$iv2];
                int i2 = i$iv2;
                ModifierLocal<?> key2 = this.insertedLocal.getContent()[i2];
                if (node.getIsAttached()) {
                    invalidateConsumersOfNodeForKey(node, key2, (Set) toUpdate);
                }
                i$iv2++;
            } while (i$iv2 < size$iv2);
        }
        this.inserted.clear();
        this.insertedLocal.clear();
        Iterable $this$forEach$iv = toUpdate;
        for (Object element$iv : $this$forEach$iv) {
            BackwardsCompatNode it = (BackwardsCompatNode) element$iv;
            it.updateModifierLocalConsumer();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void invalidateConsumersOfNodeForKey(Modifier.Node node, ModifierLocal<?> key, Set<BackwardsCompatNode> set) {
        DelegatableNode $this$visitSubtreeIf_u2d6rFNWt0$iv;
        int type$iv;
        int i;
        boolean diveDeeper$iv$iv;
        int type$iv2;
        int type$iv3;
        int count$iv$iv;
        MutableVector mutableVector;
        ModifierLocal<?> modifierLocal = key;
        Modifier.Node $this$visitSubtreeIf_u2d6rFNWt0$iv2 = node;
        int type$iv4 = NodeKind.m4443constructorimpl(32);
        int i2 = 0;
        if (!$this$visitSubtreeIf_u2d6rFNWt0$iv2.getNode().getIsAttached()) {
            throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
        }
        MutableVector branches$iv$iv = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$iv$iv = $this$visitSubtreeIf_u2d6rFNWt0$iv2.getNode().getChild();
        if (child$iv$iv == null) {
            DelegatableNodeKt.addLayoutNodeChildren(branches$iv$iv, $this$visitSubtreeIf_u2d6rFNWt0$iv2.getNode());
        } else {
            branches$iv$iv.add(child$iv$iv);
        }
        while (branches$iv$iv.isNotEmpty()) {
            Modifier.Node branch$iv$iv = (Modifier.Node) branches$iv$iv.removeAt(branches$iv$iv.getSize() - 1);
            if ((branch$iv$iv.getAggregateChildKindSet() & type$iv4) != 0) {
                Modifier.Node node$iv$iv = branch$iv$iv;
                while (node$iv$iv != null) {
                    if ((node$iv$iv.getKindSet() & type$iv4) != 0) {
                        Modifier.Node node$iv = node$iv$iv;
                        MutableVector mutableVector2 = null;
                        Modifier.Node node2 = node$iv;
                        while (true) {
                            if (node2 == null) {
                                $this$visitSubtreeIf_u2d6rFNWt0$iv = $this$visitSubtreeIf_u2d6rFNWt0$iv2;
                                type$iv = type$iv4;
                                i = i2;
                                diveDeeper$iv$iv = true;
                                break;
                            }
                            if (node2 instanceof ModifierLocalModifierNode) {
                                Object it$iv = node2;
                                $this$visitSubtreeIf_u2d6rFNWt0$iv = $this$visitSubtreeIf_u2d6rFNWt0$iv2;
                                ModifierLocalModifierNode it = (ModifierLocalModifierNode) it$iv;
                                i = i2;
                                if ((it instanceof BackwardsCompatNode) && (((BackwardsCompatNode) it).getElement() instanceof ModifierLocalConsumer)) {
                                    if (((BackwardsCompatNode) it).getReadValues().contains(modifierLocal)) {
                                        set.add(it);
                                    }
                                }
                                if (!(!it.getProvidedValues().contains$ui_release(modifierLocal))) {
                                    type$iv = type$iv4;
                                    diveDeeper$iv$iv = false;
                                    break;
                                }
                                type$iv2 = type$iv4;
                            } else {
                                $this$visitSubtreeIf_u2d6rFNWt0$iv = $this$visitSubtreeIf_u2d6rFNWt0$iv2;
                                i = i2;
                                Modifier.Node this_$iv$iv$iv = node2;
                                if (((this_$iv$iv$iv.getKindSet() & type$iv4) != 0) && (node2 instanceof DelegatingNode)) {
                                    int count$iv$iv2 = 0;
                                    DelegatingNode this_$iv$iv$iv2 = (DelegatingNode) node2;
                                    Modifier.Node node$iv$iv$iv = this_$iv$iv$iv2.getDelegate();
                                    while (node$iv$iv$iv != null) {
                                        Modifier.Node next$iv$iv = node$iv$iv$iv;
                                        if ((next$iv$iv.getKindSet() & type$iv4) != 0) {
                                            count$iv$iv2++;
                                            if (count$iv$iv2 == 1) {
                                                node2 = next$iv$iv;
                                                type$iv3 = type$iv4;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    count$iv$iv = count$iv$iv2;
                                                    type$iv3 = type$iv4;
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                } else {
                                                    count$iv$iv = count$iv$iv2;
                                                    type$iv3 = type$iv4;
                                                    mutableVector = mutableVector2;
                                                }
                                                Modifier.Node theNode$iv$iv = node2;
                                                if (theNode$iv$iv != null) {
                                                    if (mutableVector != null) {
                                                        mutableVector.add(theNode$iv$iv);
                                                    }
                                                    node2 = null;
                                                }
                                                if (mutableVector != null) {
                                                    mutableVector.add(next$iv$iv);
                                                }
                                                mutableVector2 = mutableVector;
                                                count$iv$iv2 = count$iv$iv;
                                            }
                                        } else {
                                            type$iv3 = type$iv4;
                                        }
                                        node$iv$iv$iv = node$iv$iv$iv.getChild();
                                        type$iv4 = type$iv3;
                                    }
                                    type$iv2 = type$iv4;
                                    if (count$iv$iv2 == 1) {
                                        modifierLocal = key;
                                        $this$visitSubtreeIf_u2d6rFNWt0$iv2 = $this$visitSubtreeIf_u2d6rFNWt0$iv;
                                        i2 = i;
                                        type$iv4 = type$iv2;
                                    }
                                } else {
                                    type$iv2 = type$iv4;
                                }
                            }
                            node2 = DelegatableNodeKt.pop(mutableVector2);
                            modifierLocal = key;
                            $this$visitSubtreeIf_u2d6rFNWt0$iv2 = $this$visitSubtreeIf_u2d6rFNWt0$iv;
                            i2 = i;
                            type$iv4 = type$iv2;
                        }
                        if (!diveDeeper$iv$iv) {
                            modifierLocal = key;
                            $this$visitSubtreeIf_u2d6rFNWt0$iv2 = $this$visitSubtreeIf_u2d6rFNWt0$iv;
                            i2 = i;
                            type$iv4 = type$iv;
                            break;
                        }
                    } else {
                        $this$visitSubtreeIf_u2d6rFNWt0$iv = $this$visitSubtreeIf_u2d6rFNWt0$iv2;
                        type$iv = type$iv4;
                        i = i2;
                    }
                    node$iv$iv = node$iv$iv.getChild();
                    modifierLocal = key;
                    $this$visitSubtreeIf_u2d6rFNWt0$iv2 = $this$visitSubtreeIf_u2d6rFNWt0$iv;
                    i2 = i;
                    type$iv4 = type$iv;
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(branches$iv$iv, branch$iv$iv);
            modifierLocal = key;
            $this$visitSubtreeIf_u2d6rFNWt0$iv2 = $this$visitSubtreeIf_u2d6rFNWt0$iv2;
            i2 = i2;
            type$iv4 = type$iv4;
        }
    }

    public final void updatedProvider(BackwardsCompatNode node, ModifierLocal<?> key) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(key, "key");
        MutableVector this_$iv = this.inserted;
        this_$iv.add(node);
        MutableVector this_$iv2 = this.insertedLocal;
        this_$iv2.add(key);
        invalidate();
    }

    public final void insertedProvider(BackwardsCompatNode node, ModifierLocal<?> key) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(key, "key");
        MutableVector this_$iv = this.inserted;
        this_$iv.add(node);
        MutableVector this_$iv2 = this.insertedLocal;
        this_$iv2.add(key);
        invalidate();
    }

    public final void removedProvider(BackwardsCompatNode node, ModifierLocal<?> key) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(key, "key");
        MutableVector this_$iv = this.removed;
        this_$iv.add(DelegatableNodeKt.requireLayoutNode(node));
        MutableVector this_$iv2 = this.removedLocal;
        this_$iv2.add(key);
        invalidate();
    }
}
