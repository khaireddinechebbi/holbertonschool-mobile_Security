.class public final synthetic Landroidx/compose/foundation/layout/Arrangement$Horizontal$-CC;
.super Ljava/lang/Object;
.source "Arrangement.kt"


# direct methods
.method public static $default$getSpacing-D9Ej5fM(Landroidx/compose/foundation/layout/Arrangement$Horizontal;)F
    .locals 3
    .param p0, "_this"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 51
    const/4 v0, 0x0

    .local v0, "$this$dp$iv":I
    const/4 v1, 0x0

    .line 716
    .local v1, "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 51
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    return v0
.end method

.method public static synthetic access$getSpacing-D9Ej5fM$jd(Landroidx/compose/foundation/layout/Arrangement$Horizontal;)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 45
    invoke-static {p0}, Landroidx/compose/foundation/layout/Arrangement$Horizontal$-CC;->$default$getSpacing-D9Ej5fM(Landroidx/compose/foundation/layout/Arrangement$Horizontal;)F

    move-result v0

    return v0
.end method
