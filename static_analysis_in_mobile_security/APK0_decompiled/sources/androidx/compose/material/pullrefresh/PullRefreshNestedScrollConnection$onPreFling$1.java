package androidx.compose.material.pullrefresh;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PullRefresh.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", i = {}, l = {117}, m = "onPreFling-QWom1Mo", n = {}, s = {})
/* loaded from: classes.dex */
final class PullRefreshNestedScrollConnection$onPreFling$1 extends ContinuationImpl {
    float F$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PullRefreshNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PullRefreshNestedScrollConnection$onPreFling$1(PullRefreshNestedScrollConnection pullRefreshNestedScrollConnection, Continuation<? super PullRefreshNestedScrollConnection$onPreFling$1> continuation) {
        super(continuation);
        this.this$0 = pullRefreshNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo336onPreFlingQWom1Mo(0L, this);
    }
}
