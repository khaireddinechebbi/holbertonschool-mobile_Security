package androidx.compose.material.pullrefresh;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PullRefresh.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class PullRefreshKt$pullRefresh$2$1 extends FunctionReferenceImpl implements Function1<Float, Float> {
    PullRefreshKt$pullRefresh$2$1(Object obj) {
        super(1, obj, PullRefreshState.class, "onPull", "onPull$material_release(F)F", 0);
    }

    public final Float invoke(float p0) {
        return Float.valueOf(((PullRefreshState) this.receiver).onPull$material_release(p0));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Float f) {
        return invoke(f.floatValue());
    }
}
