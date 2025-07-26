package androidx.compose.material.icons.outlined;

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

/* compiled from: Favorite.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_favorite", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Favorite", "Landroidx/compose/material/icons/Icons$Outlined;", "getFavorite", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FavoriteKt {
    private static ImageVector _favorite;

    public static final ImageVector getFavorite(Icons.Outlined $this$Favorite) {
        Intrinsics.checkNotNullParameter($this$Favorite, "<this>");
        ImageVector imageVector = _favorite;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder $this$_get_Favorite__u24lambda_u241 = new ImageVector.Builder("Outlined.Favorite", Dp.m5274constructorimpl(24.0f), Dp.m5274constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.INSTANCE.m2997getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.INSTANCE.m3324getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.INSTANCE.m3334getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(12.0f, 21.35f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-1.45f, -1.32f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(1.74f, 0.0f, 3.41f, 0.81f, 4.5f, 2.09f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.0f, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineTo(12.0f, 21.35f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        ImageVector build = ImageVector.Builder.m3606addPathoIyEayM$default($this$_get_Favorite__u24lambda_u241, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _favorite = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
