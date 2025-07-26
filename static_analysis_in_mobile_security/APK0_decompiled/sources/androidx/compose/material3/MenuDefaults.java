package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* compiled from: Menu.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JQ\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/MenuDefaults;", "", "()V", "DropdownMenuItemContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getDropdownMenuItemContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "itemColors", "Landroidx/compose/material3/MenuItemColors;", "textColor", "Landroidx/compose/ui/graphics/Color;", "leadingIconColor", "trailingIconColor", "disabledTextColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "itemColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/MenuItemColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MenuDefaults {
    public static final int $stable = 0;
    private static final PaddingValues DropdownMenuItemContentPadding;
    public static final MenuDefaults INSTANCE = new MenuDefaults();

    private MenuDefaults() {
    }

    /* renamed from: itemColors-5tl4gsc, reason: not valid java name */
    public final MenuItemColors m1610itemColors5tl4gsc(long textColor, long leadingIconColor, long trailingIconColor, long disabledTextColor, long disabledLeadingIconColor, long disabledTrailingIconColor, Composer $composer, int $changed, int i) {
        long disabledTextColor2;
        long disabledLeadingIconColor2;
        long m2969copywmQWz5c;
        long m2969copywmQWz5c2;
        $composer.startReplaceableGroup(-1278543580);
        ComposerKt.sourceInformation($composer, "C(itemColors)P(4:c#ui.graphics.Color,3:c#ui.graphics.Color,5:c#ui.graphics.Color,1:c#ui.graphics.Color,0:c#ui.graphics.Color,2:c#ui.graphics.Color)235@8727L9,236@8808L9,237@8891L9,239@8991L9,241@9163L9,243@9335L9:Menu.kt#uh7d8r");
        long textColor2 = (i & 1) != 0 ? ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemLabelTextColor(), $composer, 6) : textColor;
        long leadingIconColor2 = (i & 2) != 0 ? ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemLeadingIconColor(), $composer, 6) : leadingIconColor;
        long trailingIconColor2 = (i & 4) != 0 ? ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemTrailingIconColor(), $composer, 6) : trailingIconColor;
        if ((i & 8) != 0) {
            m2969copywmQWz5c2 = Color.m2969copywmQWz5c(r6, (r12 & 1) != 0 ? Color.m2973getAlphaimpl(r6) : 0.38f, (r12 & 2) != 0 ? Color.m2977getRedimpl(r6) : 0.0f, (r12 & 4) != 0 ? Color.m2976getGreenimpl(r6) : 0.0f, (r12 & 8) != 0 ? Color.m2974getBlueimpl(ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemDisabledLabelTextColor(), $composer, 6)) : 0.0f);
            disabledTextColor2 = m2969copywmQWz5c2;
        } else {
            disabledTextColor2 = disabledTextColor;
        }
        if ((i & 16) != 0) {
            m2969copywmQWz5c = Color.m2969copywmQWz5c(r6, (r12 & 1) != 0 ? Color.m2973getAlphaimpl(r6) : 0.38f, (r12 & 2) != 0 ? Color.m2977getRedimpl(r6) : 0.0f, (r12 & 4) != 0 ? Color.m2976getGreenimpl(r6) : 0.0f, (r12 & 8) != 0 ? Color.m2974getBlueimpl(ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemDisabledLeadingIconColor(), $composer, 6)) : 0.0f);
            disabledLeadingIconColor2 = m2969copywmQWz5c;
        } else {
            disabledLeadingIconColor2 = disabledLeadingIconColor;
        }
        long disabledTrailingIconColor2 = (i & 32) != 0 ? Color.m2969copywmQWz5c(r2, (r12 & 1) != 0 ? Color.m2973getAlphaimpl(r2) : 0.38f, (r12 & 2) != 0 ? Color.m2977getRedimpl(r2) : 0.0f, (r12 & 4) != 0 ? Color.m2976getGreenimpl(r2) : 0.0f, (r12 & 8) != 0 ? Color.m2974getBlueimpl(ColorSchemeKt.toColor(MenuTokens.INSTANCE.getListItemDisabledTrailingIconColor(), $composer, 6)) : 0.0f) : disabledTrailingIconColor;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1278543580, $changed, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:234)");
        }
        MenuItemColors menuItemColors = new MenuItemColors(textColor2, leadingIconColor2, trailingIconColor2, disabledTextColor2, disabledLeadingIconColor2, disabledTrailingIconColor2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return menuItemColors;
    }

    static {
        float f;
        f = MenuKt.DropdownMenuItemHorizontalPadding;
        DropdownMenuItemContentPadding = PaddingKt.m481PaddingValuesYgX7TsA(f, Dp.m5274constructorimpl(0));
    }

    public final PaddingValues getDropdownMenuItemContentPadding() {
        return DropdownMenuItemContentPadding;
    }
}
