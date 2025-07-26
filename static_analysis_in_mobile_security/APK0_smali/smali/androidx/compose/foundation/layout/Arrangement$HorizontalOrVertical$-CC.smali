.class public final synthetic Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical$-CC;
.super Ljava/lang/Object;
.source "Arrangement.kt"


# direct methods
.method public static $default$getSpacing-D9Ej5fM(Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;)F
    .locals 3
    .param p0, "_this"    # Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 108
    const/4 v0, 0x0

    .local v0, "$this$dp$iv":I
    const/4 v1, 0x0

    .line 716
    .local v1, "$i$f$getDp":I
    int-to-float v2, v0

    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 108
    .end local v0    # "$this$dp$iv":I
    .end local v1    # "$i$f$getDp":I
    return v0
.end method

.method public static synthetic access$getSpacing-D9Ej5fM$jd(Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 102
    invoke-static {p0}, Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical$-CC;->$default$getSpacing-D9Ej5fM(Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;)F

    move-result v0

    return v0
.end method
