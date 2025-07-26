package androidx.compose.material.icons.twotone;

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

/* compiled from: AccountBox.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_accountBox", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AccountBox", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAccountBox", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AccountBoxKt {
    private static ImageVector _accountBox;

    public static final ImageVector getAccountBox(Icons.TwoTone $this$AccountBox) {
        Intrinsics.checkNotNullParameter($this$AccountBox, "<this>");
        ImageVector imageVector = _accountBox;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder $this$_get_AccountBox__u24lambda_u243 = new ImageVector.Builder("TwoTone.AccountBox", Dp.m5274constructorimpl(24.0f), Dp.m5274constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.INSTANCE.m2997getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.INSTANCE.m3324getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.INSTANCE.m3334getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(5.0f, 17.86f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(6.8f, 16.09f, 9.27f, 15.0f, 12.0f, 15.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveToRelative(5.2f, 1.09f, 7.0f, 2.86f);
        $this$PathData_u24lambda_u240$iv$iv$iv.verticalLineTo(5.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.horizontalLineTo(5.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.verticalLineTo(17.86f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(12.0f, 6.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveTo(13.93f, 13.0f, 12.0f, 13.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv.reflectiveCurveTo(10.07f, 6.0f, 12.0f, 6.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        ImageVector.Builder.m3606addPathoIyEayM$default($this$_get_AccountBox__u24lambda_u243, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 0.3f, null, 0.3f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int pathFillType$iv2 = VectorKt.getDefaultFillType();
        Brush fill$iv$iv2 = new SolidColor(Color.INSTANCE.m2997getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv2 = StrokeCap.INSTANCE.m3324getButtKaPHkGw();
        int strokeLineJoin$iv$iv2 = StrokeJoin.INSTANCE.m3334getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv2 = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv2.moveTo(19.0f, 3.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.horizontalLineTo(5.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.verticalLineToRelative(14.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.horizontalLineToRelative(14.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.verticalLineTo(5.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.close();
        $this$PathData_u24lambda_u240$iv$iv$iv2.moveTo(17.0f, 19.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.horizontalLineTo(7.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.verticalLineToRelative(-0.24f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveTo(8.42f, 17.62f, 10.16f, 17.0f, 12.0f, 17.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.reflectiveCurveToRelative(3.58f, 0.62f, 5.0f, 1.76f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.verticalLineTo(19.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.close();
        $this$PathData_u24lambda_u240$iv$iv$iv2.moveTo(19.0f, 17.86f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.curveTo(17.2f, 16.09f, 14.73f, 15.0f, 12.0f, 15.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.reflectiveCurveToRelative(-5.2f, 1.09f, -7.0f, 2.86f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.verticalLineTo(5.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.horizontalLineToRelative(14.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.verticalLineTo(17.86f);
        $this$PathData_u24lambda_u240$iv$iv$iv2.close();
        ImageVector.Builder.m3606addPathoIyEayM$default($this$_get_AccountBox__u24lambda_u243, $this$PathData_u24lambda_u240$iv$iv$iv2.getNodes(), pathFillType$iv2, "", fill$iv$iv2, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv2, strokeLineJoin$iv$iv2, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int pathFillType$iv3 = VectorKt.getDefaultFillType();
        Brush fill$iv$iv3 = new SolidColor(Color.INSTANCE.m2997getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv3 = StrokeCap.INSTANCE.m3324getButtKaPHkGw();
        int strokeLineJoin$iv$iv3 = StrokeJoin.INSTANCE.m3334getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv3 = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv3.moveTo(12.0f, 13.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.reflectiveCurveTo(13.93f, 6.0f, 12.0f, 6.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.reflectiveCurveTo(10.07f, 13.0f, 12.0f, 13.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.close();
        $this$PathData_u24lambda_u240$iv$iv$iv3.moveTo(12.0f, 8.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.reflectiveCurveTo(12.83f, 11.0f, 12.0f, 11.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.reflectiveCurveTo(11.17f, 8.0f, 12.0f, 8.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv3.close();
        ImageVector build = ImageVector.Builder.m3606addPathoIyEayM$default($this$_get_AccountBox__u24lambda_u243, $this$PathData_u24lambda_u240$iv$iv$iv3.getNodes(), pathFillType$iv3, "", fill$iv$iv3, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv3, strokeLineJoin$iv$iv3, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accountBox = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
