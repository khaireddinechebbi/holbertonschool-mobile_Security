package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Build.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_build", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Build", "Landroidx/compose/material/icons/Icons$Sharp;", "getBuild", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BuildKt {
    private static ImageVector _build;

    public static final ImageVector getBuild(Icons.Sharp $this$Build) {
        Intrinsics.checkNotNullParameter($this$Build, "<this>");
        ImageVector imageVector = _build;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder $this$_get_Build__u24lambda_u241 = new ImageVector.Builder("Sharp.Build", Dp.m5274constructorimpl(24.0f), Dp.m5274constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.INSTANCE.m2997getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.INSTANCE.m3324getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.INSTANCE.m3334getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(12.09f, 2.91f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(10.08f, 0.9f, 7.07f, 0.49f, 4.65f, 1.67f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(4.34f, 4.34f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-3.0f, 3.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-4.34f, -4.34f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(0.48f, 7.1f, 0.89f, 10.09f, 2.9f, 12.1f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(1.86f, 1.86f, 4.58f, 2.35f, 6.89f, 1.48f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(9.82f, 9.82f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(3.71f, -3.71f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-9.78f, -9.79f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.92f, -2.34f, 0.44f, -5.1f, -1.45f, -6.99f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        ImageVector build = ImageVector.Builder.m3606addPathoIyEayM$default($this$_get_Build__u24lambda_u241, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _build = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
