package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* compiled from: NavigationDrawer.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Je\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/material3/NavigationDrawerItemDefaults;", "", "()V", "ItemPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getItemPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material3/NavigationDrawerItemColors;", "selectedContainerColor", "Landroidx/compose/ui/graphics/Color;", "unselectedContainerColor", "selectedIconColor", "unselectedIconColor", "selectedTextColor", "unselectedTextColor", "selectedBadgeColor", "unselectedBadgeColor", "colors-oq7We08", "(JJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationDrawerItemColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationDrawerItemDefaults {
    public static final int $stable = 0;
    public static final NavigationDrawerItemDefaults INSTANCE = new NavigationDrawerItemDefaults();
    private static final PaddingValues ItemPadding = PaddingKt.m482PaddingValuesYgX7TsA$default(Dp.m5274constructorimpl(12), 0.0f, 2, null);

    private NavigationDrawerItemDefaults() {
    }

    /* renamed from: colors-oq7We08, reason: not valid java name */
    public final NavigationDrawerItemColors m1629colorsoq7We08(long selectedContainerColor, long unselectedContainerColor, long selectedIconColor, long unselectedIconColor, long selectedTextColor, long unselectedTextColor, long selectedBadgeColor, long unselectedBadgeColor, Composer $composer, int $changed, int i) {
        $composer.startReplaceableGroup(-1574983348);
        ComposerKt.sourceInformation($composer, "C(colors)P(1:c#ui.graphics.Color,5:c#ui.graphics.Color,2:c#ui.graphics.Color,6:c#ui.graphics.Color,3:c#ui.graphics.Color,7:c#ui.graphics.Color,0:c#ui.graphics.Color,4:c#ui.graphics.Color)749@29055L9,750@29146L9,751@29231L9,752@29320L9,753@29410L9,754@29504L9:NavigationDrawer.kt#uh7d8r");
        long selectedContainerColor2 = (i & 1) != 0 ? ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getActiveIndicatorColor(), $composer, 6) : selectedContainerColor;
        long unselectedContainerColor2 = (i & 2) != 0 ? ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getContainerColor(), $composer, 6) : unselectedContainerColor;
        long selectedIconColor2 = (i & 4) != 0 ? ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getActiveIconColor(), $composer, 6) : selectedIconColor;
        long unselectedIconColor2 = (i & 8) != 0 ? ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getInactiveIconColor(), $composer, 6) : unselectedIconColor;
        long selectedTextColor2 = (i & 16) != 0 ? ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getActiveLabelTextColor(), $composer, 6) : selectedTextColor;
        long unselectedTextColor2 = (i & 32) != 0 ? ColorSchemeKt.toColor(NavigationDrawerTokens.INSTANCE.getInactiveLabelTextColor(), $composer, 6) : unselectedTextColor;
        long selectedBadgeColor2 = (i & 64) != 0 ? selectedTextColor2 : selectedBadgeColor;
        long unselectedBadgeColor2 = (i & 128) != 0 ? unselectedTextColor2 : unselectedBadgeColor;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1574983348, $changed, -1, "androidx.compose.material3.NavigationDrawerItemDefaults.colors (NavigationDrawer.kt:748)");
        }
        DefaultDrawerItemsColor defaultDrawerItemsColor = new DefaultDrawerItemsColor(selectedIconColor2, unselectedIconColor2, selectedTextColor2, unselectedTextColor2, selectedContainerColor2, unselectedContainerColor2, selectedBadgeColor2, unselectedBadgeColor2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return defaultDrawerItemsColor;
    }

    public final PaddingValues getItemPadding() {
        return ItemPadding;
    }
}
