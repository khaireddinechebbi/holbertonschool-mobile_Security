package androidx.compose.material3;

import androidx.compose.ui.platform.AccessibilityManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: SnackbarHost.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1", f = "SnackbarHost.kt", i = {}, l = {230}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class SnackbarHostKt$SnackbarHost$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AccessibilityManager $accessibilityManager;
    final /* synthetic */ SnackbarData $currentSnackbarData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$SnackbarHost$1(SnackbarData snackbarData, AccessibilityManager accessibilityManager, Continuation<? super SnackbarHostKt$SnackbarHost$1> continuation) {
        super(2, continuation);
        this.$currentSnackbarData = snackbarData;
        this.$accessibilityManager = accessibilityManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SnackbarHostKt$SnackbarHost$1(this.$currentSnackbarData, this.$accessibilityManager, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SnackbarHostKt$SnackbarHost$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        SnackbarHostKt$SnackbarHost$1 snackbarHostKt$SnackbarHost$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                SnackbarData snackbarData = this.$currentSnackbarData;
                if (snackbarData != null) {
                    long duration = SnackbarHostKt.toMillis(snackbarData.getVisuals().getDuration(), this.$currentSnackbarData.getVisuals().getActionLabel() != null, this.$accessibilityManager);
                    this.label = 1;
                    if (DelayKt.delay(duration, this) != coroutine_suspended) {
                        snackbarHostKt$SnackbarHost$1 = this;
                        snackbarHostKt$SnackbarHost$1.$currentSnackbarData.dismiss();
                    } else {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                snackbarHostKt$SnackbarHost$1 = this;
                ResultKt.throwOnFailure($result);
                snackbarHostKt$SnackbarHost$1.$currentSnackbarData.dismiss();
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
