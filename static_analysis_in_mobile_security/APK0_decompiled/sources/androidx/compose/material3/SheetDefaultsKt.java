package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SheetDefaults.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\u0000\u001aA\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00150\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0015H\u0001¢\u0006\u0002\u0010\u001a\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"BottomSheetMaxWidth", "Landroidx/compose/ui/unit/Dp;", "getBottomSheetMaxWidth", "()F", "F", "DragHandleVerticalPadding", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "sheetState", "Landroidx/compose/material3/SheetState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "onFling", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "velocity", "", "rememberSheetState", "skipPartiallyExpanded", "", "confirmValueChange", "Landroidx/compose/material3/SheetValue;", "initialValue", "skipHiddenState", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/SheetValue;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SheetDefaultsKt {
    private static final float DragHandleVerticalPadding = Dp.m5274constructorimpl(22);
    private static final float BottomSheetMaxWidth = Dp.m5274constructorimpl(640);

    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(final SheetState sheetState, final Orientation orientation, final Function1<? super Float, Unit> onFling) {
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(onFling, "onFling");
        return new NestedScrollConnection() { // from class: androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1
            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreScroll-OzD1aCk */
            public long mo337onPreScrollOzD1aCk(long available, int source) {
                float delta = offsetToFloat(available);
                if (delta < 0.0f && NestedScrollSource.m3997equalsimpl0(source, NestedScrollSource.INSTANCE.m4002getDragWNlRxjI())) {
                    return toOffset(SheetState.this.getSwipeableState$material3_release().dispatchRawDelta(delta));
                }
                return Offset.INSTANCE.m2747getZeroF1C5BW0();
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public long mo335onPostScrollDzOQY0M(long consumed, long available, int source) {
                if (NestedScrollSource.m3997equalsimpl0(source, NestedScrollSource.INSTANCE.m4002getDragWNlRxjI())) {
                    return toOffset(SheetState.this.getSwipeableState$material3_release().dispatchRawDelta(offsetToFloat(available)));
                }
                return Offset.INSTANCE.m2747getZeroF1C5BW0();
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreFling-QWom1Mo */
            public Object mo336onPreFlingQWom1Mo(long available, Continuation<? super Velocity> continuation) {
                long m5510getZero9UxMQ8M;
                float toFling = velocityToFloat(available);
                float currentOffset = SheetState.this.requireOffset();
                if (toFling < 0.0f && currentOffset > SheetState.this.getSwipeableState$material3_release().getMinOffset()) {
                    onFling.invoke(Boxing.boxFloat(toFling));
                    m5510getZero9UxMQ8M = available;
                } else {
                    m5510getZero9UxMQ8M = Velocity.INSTANCE.m5510getZero9UxMQ8M();
                }
                return Velocity.m5490boximpl(m5510getZero9UxMQ8M);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostFling-RZ2iAVY */
            public Object mo334onPostFlingRZ2iAVY(long consumed, long available, Continuation<? super Velocity> continuation) {
                onFling.invoke(Boxing.boxFloat(velocityToFloat(available)));
                return Velocity.m5490boximpl(available);
            }

            private final long toOffset(float $this$toOffset) {
                return OffsetKt.Offset(orientation == Orientation.Horizontal ? $this$toOffset : 0.0f, orientation == Orientation.Vertical ? $this$toOffset : 0.0f);
            }

            private final float velocityToFloat(long $this$toFloat) {
                return orientation == Orientation.Horizontal ? Velocity.m5499getXimpl($this$toFloat) : Velocity.m5500getYimpl($this$toFloat);
            }

            private final float offsetToFloat(long $this$toFloat) {
                return orientation == Orientation.Horizontal ? Offset.m2731getXimpl($this$toFloat) : Offset.m2732getYimpl($this$toFloat);
            }
        };
    }

    public static final SheetState rememberSheetState(boolean skipPartiallyExpanded, Function1<? super SheetValue, Boolean> function1, SheetValue initialValue, boolean skipHiddenState, Composer $composer, int $changed, int i) {
        Object value$iv$iv;
        $composer.startReplaceableGroup(1032784200);
        ComposerKt.sourceInformation($composer, "C(rememberSheetState)P(3)422@15342L100,416@15112L330:SheetDefaults.kt#uh7d8r");
        final boolean skipPartiallyExpanded2 = (i & 1) != 0 ? false : skipPartiallyExpanded;
        final Function1 confirmValueChange = (i & 2) != 0 ? new Function1<SheetValue, Boolean>() { // from class: androidx.compose.material3.SheetDefaultsKt$rememberSheetState$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(SheetValue it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return true;
            }
        } : function1;
        final SheetValue initialValue2 = (i & 4) != 0 ? SheetValue.Hidden : initialValue;
        final boolean skipHiddenState2 = (i & 8) != 0 ? false : skipHiddenState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1032784200, $changed, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:410)");
        }
        Object[] objArr = {Boolean.valueOf(skipPartiallyExpanded2), confirmValueChange};
        Saver<SheetState, SheetValue> Saver = SheetState.INSTANCE.Saver(skipPartiallyExpanded2, confirmValueChange);
        Object[] keys$iv = {Boolean.valueOf(skipPartiallyExpanded2), initialValue2, confirmValueChange, Boolean.valueOf(skipHiddenState2)};
        $composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation($composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean invalid$iv = false;
        for (Object key$iv : keys$iv) {
            invalid$iv |= $composer.changed(key$iv);
        }
        Object it$iv$iv = $composer.rememberedValue();
        if (invalid$iv || it$iv$iv == Composer.INSTANCE.getEmpty()) {
            value$iv$iv = (Function0) new Function0<SheetState>() { // from class: androidx.compose.material3.SheetDefaultsKt$rememberSheetState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final SheetState invoke() {
                    return new SheetState(skipPartiallyExpanded2, initialValue2, confirmValueChange, skipHiddenState2);
                }
            };
            $composer.updateRememberedValue(value$iv$iv);
        } else {
            value$iv$iv = it$iv$iv;
        }
        $composer.endReplaceableGroup();
        SheetState sheetState = (SheetState) RememberSaveableKt.m2617rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) value$iv$iv, $composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return sheetState;
    }

    public static final float getBottomSheetMaxWidth() {
        return BottomSheetMaxWidth;
    }
}
