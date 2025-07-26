package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jy\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/material/SliderDefaults;", "", "()V", "DisabledActiveTrackAlpha", "", "DisabledInactiveTrackAlpha", "DisabledTickAlpha", "InactiveTrackAlpha", "TickAlpha", "colors", "Landroidx/compose/material/SliderColors;", "thumbColor", "Landroidx/compose/ui/graphics/Color;", "disabledThumbColor", "activeTrackColor", "inactiveTrackColor", "disabledActiveTrackColor", "disabledInactiveTrackColor", "activeTickColor", "inactiveTickColor", "disabledActiveTickColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SliderColors;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final float DisabledActiveTrackAlpha = 0.32f;
    public static final float DisabledInactiveTrackAlpha = 0.12f;
    public static final float DisabledTickAlpha = 0.12f;
    public static final SliderDefaults INSTANCE = new SliderDefaults();
    public static final float InactiveTrackAlpha = 0.24f;
    public static final float TickAlpha = 0.54f;

    private SliderDefaults() {
    }

    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m1185colorsq0g_0yA(long thumbColor, long disabledThumbColor, long activeTrackColor, long inactiveTrackColor, long disabledActiveTrackColor, long disabledInactiveTrackColor, long activeTickColor, long inactiveTickColor, long disabledActiveTickColor, long disabledInactiveTickColor, Composer $composer, int $changed, int $changed1, int i) {
        long disabledThumbColor2;
        long inactiveTrackColor2;
        long disabledInactiveTrackColor2;
        long activeTickColor2;
        long inactiveTickColor2;
        long disabledActiveTickColor2;
        long disabledInactiveTickColor2;
        long m2969copywmQWz5c;
        long m2969copywmQWz5c2;
        long m2969copywmQWz5c3;
        long m2969copywmQWz5c4;
        long m2969copywmQWz5c5;
        long m2969copywmQWz5c6;
        long m2969copywmQWz5c7;
        $composer.startReplaceableGroup(436017687);
        ComposerKt.sourceInformation($composer, "C(colors)P(9:c#ui.graphics.Color,6:c#ui.graphics.Color,1:c#ui.graphics.Color,8:c#ui.graphics.Color,3:c#ui.graphics.Color,5:c#ui.graphics.Color,0:c#ui.graphics.Color,7:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.graphics.Color)480@20866L6,481@20932L6,482@20988L8,483@21039L6,484@21104L6,487@21275L6,490@21488L33:Slider.kt#jmzs0o");
        long thumbColor2 = (i & 1) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1048getPrimary0d7_KjU() : thumbColor;
        if ((i & 2) != 0) {
            m2969copywmQWz5c7 = Color.m2969copywmQWz5c(r8, (r12 & 1) != 0 ? Color.m2973getAlphaimpl(r8) : ContentAlpha.INSTANCE.getDisabled($composer, 6), (r12 & 2) != 0 ? Color.m2977getRedimpl(r8) : 0.0f, (r12 & 4) != 0 ? Color.m2976getGreenimpl(r8) : 0.0f, (r12 & 8) != 0 ? Color.m2974getBlueimpl(MaterialTheme.INSTANCE.getColors($composer, 6).m1047getOnSurface0d7_KjU()) : 0.0f);
            disabledThumbColor2 = ColorKt.m3016compositeOverOWjLjI(m2969copywmQWz5c7, MaterialTheme.INSTANCE.getColors($composer, 6).m1052getSurface0d7_KjU());
        } else {
            disabledThumbColor2 = disabledThumbColor;
        }
        long activeTrackColor2 = (i & 4) != 0 ? MaterialTheme.INSTANCE.getColors($composer, 6).m1048getPrimary0d7_KjU() : activeTrackColor;
        if ((i & 8) != 0) {
            m2969copywmQWz5c6 = Color.m2969copywmQWz5c(r10, (r12 & 1) != 0 ? Color.m2973getAlphaimpl(r10) : 0.24f, (r12 & 2) != 0 ? Color.m2977getRedimpl(r10) : 0.0f, (r12 & 4) != 0 ? Color.m2976getGreenimpl(r10) : 0.0f, (r12 & 8) != 0 ? Color.m2974getBlueimpl(activeTrackColor2) : 0.0f);
            inactiveTrackColor2 = m2969copywmQWz5c6;
        } else {
            inactiveTrackColor2 = inactiveTrackColor;
        }
        long disabledActiveTrackColor2 = (i & 16) != 0 ? Color.m2969copywmQWz5c(r4, (r12 & 1) != 0 ? Color.m2973getAlphaimpl(r4) : 0.32f, (r12 & 2) != 0 ? Color.m2977getRedimpl(r4) : 0.0f, (r12 & 4) != 0 ? Color.m2976getGreenimpl(r4) : 0.0f, (r12 & 8) != 0 ? Color.m2974getBlueimpl(MaterialTheme.INSTANCE.getColors($composer, 6).m1047getOnSurface0d7_KjU()) : 0.0f) : disabledActiveTrackColor;
        if ((i & 32) != 0) {
            m2969copywmQWz5c5 = Color.m2969copywmQWz5c(r47, (r12 & 1) != 0 ? Color.m2973getAlphaimpl(r47) : 0.12f, (r12 & 2) != 0 ? Color.m2977getRedimpl(r47) : 0.0f, (r12 & 4) != 0 ? Color.m2976getGreenimpl(r47) : 0.0f, (r12 & 8) != 0 ? Color.m2974getBlueimpl(disabledActiveTrackColor2) : 0.0f);
            disabledInactiveTrackColor2 = m2969copywmQWz5c5;
        } else {
            disabledInactiveTrackColor2 = disabledInactiveTrackColor;
        }
        if ((i & 64) != 0) {
            m2969copywmQWz5c4 = Color.m2969copywmQWz5c(r10, (r12 & 1) != 0 ? Color.m2973getAlphaimpl(r10) : 0.54f, (r12 & 2) != 0 ? Color.m2977getRedimpl(r10) : 0.0f, (r12 & 4) != 0 ? Color.m2976getGreenimpl(r10) : 0.0f, (r12 & 8) != 0 ? Color.m2974getBlueimpl(ColorsKt.m1066contentColorForek8zF_U(activeTrackColor2, $composer, ($changed >> 6) & 14)) : 0.0f);
            activeTickColor2 = m2969copywmQWz5c4;
        } else {
            activeTickColor2 = activeTickColor;
        }
        if ((i & 128) != 0) {
            m2969copywmQWz5c3 = Color.m2969copywmQWz5c(r47, (r12 & 1) != 0 ? Color.m2973getAlphaimpl(r47) : 0.54f, (r12 & 2) != 0 ? Color.m2977getRedimpl(r47) : 0.0f, (r12 & 4) != 0 ? Color.m2976getGreenimpl(r47) : 0.0f, (r12 & 8) != 0 ? Color.m2974getBlueimpl(activeTrackColor2) : 0.0f);
            inactiveTickColor2 = m2969copywmQWz5c3;
        } else {
            inactiveTickColor2 = inactiveTickColor;
        }
        if ((i & 256) != 0) {
            m2969copywmQWz5c2 = Color.m2969copywmQWz5c(r47, (r12 & 1) != 0 ? Color.m2973getAlphaimpl(r47) : 0.12f, (r12 & 2) != 0 ? Color.m2977getRedimpl(r47) : 0.0f, (r12 & 4) != 0 ? Color.m2976getGreenimpl(r47) : 0.0f, (r12 & 8) != 0 ? Color.m2974getBlueimpl(activeTickColor2) : 0.0f);
            disabledActiveTickColor2 = m2969copywmQWz5c2;
        } else {
            disabledActiveTickColor2 = disabledActiveTickColor;
        }
        if ((i & 512) != 0) {
            m2969copywmQWz5c = Color.m2969copywmQWz5c(r47, (r12 & 1) != 0 ? Color.m2973getAlphaimpl(r47) : 0.12f, (r12 & 2) != 0 ? Color.m2977getRedimpl(r47) : 0.0f, (r12 & 4) != 0 ? Color.m2976getGreenimpl(r47) : 0.0f, (r12 & 8) != 0 ? Color.m2974getBlueimpl(disabledInactiveTrackColor2) : 0.0f);
            disabledInactiveTickColor2 = m2969copywmQWz5c;
        } else {
            disabledInactiveTickColor2 = disabledInactiveTickColor;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(436017687, $changed, $changed1, "androidx.compose.material.SliderDefaults.colors (Slider.kt:479)");
        }
        DefaultSliderColors defaultSliderColors = new DefaultSliderColors(thumbColor2, disabledThumbColor2, activeTrackColor2, inactiveTrackColor2, disabledActiveTrackColor2, disabledInactiveTrackColor2, activeTickColor2, inactiveTickColor2, disabledActiveTickColor2, disabledInactiveTickColor2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceableGroup();
        return defaultSliderColors;
    }
}
