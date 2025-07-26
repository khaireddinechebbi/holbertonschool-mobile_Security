.class public final synthetic Landroidx/compose/foundation/layout/SideCalculator$-CC;
.super Ljava/lang/Object;
.source "WindowInsetsConnection.android.kt"


# direct methods
.method public static $default$hideMotion(Landroidx/compose/foundation/layout/SideCalculator;FF)F
    .locals 2
    .param p0, "_this"    # Landroidx/compose/foundation/layout/SideCalculator;
    .param p1, "x"    # F
    .param p2, "y"    # F

    .line 483
    invoke-interface {p0, p1, p2}, Landroidx/compose/foundation/layout/SideCalculator;->motionOf(FF)F

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtMost(FF)F

    move-result v0

    return v0
.end method

.method public static $default$showMotion(Landroidx/compose/foundation/layout/SideCalculator;FF)F
    .locals 2
    .param p0, "_this"    # Landroidx/compose/foundation/layout/SideCalculator;
    .param p1, "x"    # F
    .param p2, "y"    # F

    .line 477
    invoke-interface {p0, p1, p2}, Landroidx/compose/foundation/layout/SideCalculator;->motionOf(FF)F

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    move-result v0

    return v0
.end method
