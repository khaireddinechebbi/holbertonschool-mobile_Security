package androidx.compose.material;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material.SwitchKt$Switch$4$1", f = "Switch.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class SwitchKt$Switch$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AnchoredDraggableState<Boolean> $anchoredDraggableState;
    final /* synthetic */ boolean $checked;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwitchKt$Switch$4$1(boolean z, AnchoredDraggableState<Boolean> anchoredDraggableState, Continuation<? super SwitchKt$Switch$4$1> continuation) {
        super(2, continuation);
        this.$checked = z;
        this.$anchoredDraggableState = anchoredDraggableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwitchKt$Switch$4$1(this.$checked, this.$anchoredDraggableState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SwitchKt$Switch$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        SwitchKt$Switch$4$1 switchKt$Switch$4$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (this.$checked != this.$anchoredDraggableState.getCurrentValue().booleanValue()) {
                    this.label = 1;
                    if (AnchoredDraggableKt.animateTo$default(this.$anchoredDraggableState, Boxing.boxBoolean(this.$checked), 0.0f, this, 2, null) != coroutine_suspended) {
                        switchKt$Switch$4$1 = this;
                    } else {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                switchKt$Switch$4$1 = this;
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
