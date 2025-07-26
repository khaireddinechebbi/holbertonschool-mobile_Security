package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SelectOld.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$initSelectResult$1", f = "SelectOld.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class UnbiasedSelectBuilderImpl$initSelectResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UnbiasedSelectBuilderImpl<R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnbiasedSelectBuilderImpl$initSelectResult$1(UnbiasedSelectBuilderImpl<R> unbiasedSelectBuilderImpl, Continuation<? super UnbiasedSelectBuilderImpl$initSelectResult$1> continuation) {
        super(2, continuation);
        this.this$0 = unbiasedSelectBuilderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnbiasedSelectBuilderImpl$initSelectResult$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnbiasedSelectBuilderImpl$initSelectResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object result) {
        UnbiasedSelectBuilderImpl$initSelectResult$1 unbiasedSelectBuilderImpl$initSelectResult$1;
        Throwable e;
        UnbiasedSelectBuilderImpl$initSelectResult$1 unbiasedSelectBuilderImpl$initSelectResult$12;
        CancellableContinuationImpl cancellableContinuationImpl;
        CancellableContinuationImpl cancellableContinuationImpl2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(result);
                unbiasedSelectBuilderImpl$initSelectResult$1 = this;
                try {
                    unbiasedSelectBuilderImpl$initSelectResult$1.label = 1;
                    Object doSelect = unbiasedSelectBuilderImpl$initSelectResult$1.this$0.doSelect(unbiasedSelectBuilderImpl$initSelectResult$1);
                    if (doSelect != coroutine_suspended) {
                        result = doSelect;
                        cancellableContinuationImpl2 = ((UnbiasedSelectBuilderImpl) unbiasedSelectBuilderImpl$initSelectResult$1.this$0).cont;
                        SelectOldKt.resumeUndispatched(cancellableContinuationImpl2, result);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                } catch (Throwable th) {
                    e = th;
                    unbiasedSelectBuilderImpl$initSelectResult$12 = unbiasedSelectBuilderImpl$initSelectResult$1;
                    cancellableContinuationImpl = ((UnbiasedSelectBuilderImpl) unbiasedSelectBuilderImpl$initSelectResult$12.this$0).cont;
                    SelectOldKt.resumeUndispatchedWithException(cancellableContinuationImpl, e);
                    return Unit.INSTANCE;
                }
            case 1:
                unbiasedSelectBuilderImpl$initSelectResult$12 = this;
                try {
                    ResultKt.throwOnFailure(result);
                    unbiasedSelectBuilderImpl$initSelectResult$1 = unbiasedSelectBuilderImpl$initSelectResult$12;
                    cancellableContinuationImpl2 = ((UnbiasedSelectBuilderImpl) unbiasedSelectBuilderImpl$initSelectResult$1.this$0).cont;
                    SelectOldKt.resumeUndispatched(cancellableContinuationImpl2, result);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    e = th2;
                    cancellableContinuationImpl = ((UnbiasedSelectBuilderImpl) unbiasedSelectBuilderImpl$initSelectResult$12.this$0).cont;
                    SelectOldKt.resumeUndispatchedWithException(cancellableContinuationImpl, e);
                    return Unit.INSTANCE;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
