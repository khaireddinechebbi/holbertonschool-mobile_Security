package androidx.compose.material.icons.rounded;

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
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_favorite", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Favorite", "Landroidx/compose/material/icons/Icons$Rounded;", "getFavorite", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FavoriteKt {
    private static ImageVector _favorite;

    public static final ImageVector getFavorite(Icons.Rounded $this$Favorite) {
        Intrinsics.checkNotNullParameter($this$Favorite, "<this>");
        ImageVector imageVector = _favorite;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder $this$_get_Favorite__u24lambda_u241 = new ImageVector.Builder("Rounded.Favorite", Dp.m5274constructorimpl(24.0f), Dp.m5274constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int pathFillType$iv = VectorKt.getDefaultFillType();
        Brush fill$iv$iv = new SolidColor(Color.INSTANCE.m2997getBlack0d7_KjU(), null);
        int strokeLineCap$iv$iv = StrokeCap.INSTANCE.m3324getButtKaPHkGw();
        int strokeLineJoin$iv$iv = StrokeJoin.INSTANCE.m3334getBevelLxFBmk8();
        PathBuilder $this$PathData_u24lambda_u240$iv$iv$iv = new PathBuilder();
        $this$PathData_u24lambda_u240$iv$iv$iv.moveTo(13.35f, 20.13f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(-0.76f, 0.69f, -1.93f, 0.69f, -2.69f, -0.01f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-0.11f, -0.1f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveTo(5.3f, 15.27f, 1.87f, 12.16f, 2.0f, 8.28f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.06f, -1.7f, 0.93f, -3.33f, 2.34f, -4.29f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(2.64f, -1.8f, 5.9f, -0.96f, 7.66f, 1.1f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(1.76f, -2.06f, 5.02f, -2.91f, 7.66f, -1.1f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(1.41f, 0.96f, 2.28f, 2.59f, 2.34f, 4.29f);
        $this$PathData_u24lambda_u240$iv$iv$iv.curveToRelative(0.14f, 3.88f, -3.3f, 6.99f, -8.55f, 11.76f);
        $this$PathData_u24lambda_u240$iv$iv$iv.lineToRelative(-0.1f, 0.09f);
        $this$PathData_u24lambda_u240$iv$iv$iv.close();
        ImageVector build = ImageVector.Builder.m3606addPathoIyEayM$default($this$_get_Favorite__u24lambda_u241, $this$PathData_u24lambda_u240$iv$iv$iv.getNodes(), pathFillType$iv, "", fill$iv$iv, 1.0f, null, 1.0f, 1.0f, strokeLineCap$iv$iv, strokeLineJoin$iv$iv, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _favorite = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
