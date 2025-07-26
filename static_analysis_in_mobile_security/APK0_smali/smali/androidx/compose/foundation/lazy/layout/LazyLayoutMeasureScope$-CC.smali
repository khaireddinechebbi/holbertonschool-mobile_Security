.class public final synthetic Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope$-CC;
.super Ljava/lang/Object;
.source "LazyLayoutMeasureScope.kt"


# direct methods
.method public static $default$toDp-GaN1DYA(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)F
    .locals 4
    .param p0, "_this"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
    .param p1, "$this$toDp_u2dGaN1DYA"    # J

    .line 65
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/TextUnit;->getType-UIouoOA(J)J

    move-result-wide v0

    sget-object v2, Landroidx/compose/ui/unit/TextUnitType;->Companion:Landroidx/compose/ui/unit/TextUnitType$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnitType$Companion;->getSp-UIouoOA()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/unit/TextUnitType;->equals-impl0(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/TextUnit;->getValue-impl(J)F

    move-result v0

    invoke-interface {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getFontScale()F

    move-result v1

    mul-float v0, v0, v1

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    return v0

    .line 151
    :cond_0
    const/4 v0, 0x0

    .line 65
    .local v0, "$i$a$-check-LazyLayoutMeasureScope$toDp$1":I
    nop

    .end local v0    # "$i$a$-check-LazyLayoutMeasureScope$toDp$1":I
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Only Sp can convert to Px"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static $default$toDp-u2uoSUM(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;F)F
    .locals 2
    .param p0, "_this"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
    .param p1, "$this$toDp_u2du2uoSUM"    # F

    .line 73
    invoke-interface {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getDensity()F

    move-result v0

    div-float v0, p1, v0

    .local v0, "$this$dp$iv":F
    const/4 v1, 0x0

    .line 153
    .local v1, "$i$f$getDp":I
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 73
    .end local v0    # "$this$dp$iv":F
    .end local v1    # "$i$f$getDp":I
    return v0
.end method

.method public static $default$toDp-u2uoSUM(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;I)F
    .locals 2
    .param p0, "_this"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
    .param p1, "$this$toDp_u2du2uoSUM"    # I

    .line 70
    int-to-float v0, p1

    invoke-interface {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getDensity()F

    move-result v1

    div-float/2addr v0, v1

    .local v0, "$this$dp$iv":F
    const/4 v1, 0x0

    .line 152
    .local v1, "$i$f$getDp":I
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 70
    .end local v0    # "$this$dp$iv":F
    .end local v1    # "$i$f$getDp":I
    return v0
.end method

.method public static $default$toDpSize-k-rfVVM(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)J
    .locals 6
    .param p0, "_this"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
    .param p1, "$this$toDpSize_u2dk_u2drfVVM"    # J

    .line 92
    move-wide v0, p1

    .local v0, "$this$isSpecified$iv":J
    const/4 v2, 0x0

    .line 155
    .local v2, "$i$f$isSpecified-uvyYCjk":I
    sget-object v3, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/geometry/Size$Companion;->getUnspecified-NH-jbRc()J

    move-result-wide v3

    cmp-long v5, v0, v3

    if-eqz v5, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 92
    .end local v0    # "$this$isSpecified$iv":J
    .end local v2    # "$i$f$isSpecified-uvyYCjk":I
    :goto_0
    if-eqz v3, :cond_1

    .line 93
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v0

    invoke-interface {p0, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->toDp-u2uoSUM(F)F

    move-result v0

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v1

    invoke-interface {p0, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->toDp-u2uoSUM(F)F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/DpKt;->DpSize-YgX7TsA(FF)J

    move-result-wide v0

    goto :goto_1

    .line 95
    :cond_1
    sget-object v0, Landroidx/compose/ui/unit/DpSize;->Companion:Landroidx/compose/ui/unit/DpSize$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/unit/DpSize$Companion;->getUnspecified-MYxV2XQ()J

    move-result-wide v0

    .line 96
    :goto_1
    return-wide v0
.end method

.method public static $default$toSize-XkaWNTQ(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;J)J
    .locals 6
    .param p0, "_this"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
    .param p1, "$this$toSize_u2dXkaWNTQ"    # J

    .line 85
    move-wide v0, p1

    .local v0, "$this$isSpecified$iv":J
    const/4 v2, 0x0

    .line 154
    .local v2, "$i$f$isSpecified-EaSLcWc":I
    sget-object v3, Landroidx/compose/ui/unit/DpSize;->Companion:Landroidx/compose/ui/unit/DpSize$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/unit/DpSize$Companion;->getUnspecified-MYxV2XQ()J

    move-result-wide v3

    cmp-long v5, v0, v3

    if-eqz v5, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 85
    .end local v0    # "$this$isSpecified$iv":J
    .end local v2    # "$i$f$isSpecified-EaSLcWc":I
    :goto_0
    if-eqz v3, :cond_1

    .line 86
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/DpSize;->getWidth-D9Ej5fM(J)F

    move-result v0

    invoke-interface {p0, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->toPx-0680j_4(F)F

    move-result v0

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/DpSize;->getHeight-D9Ej5fM(J)F

    move-result v1

    invoke-interface {p0, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->toPx-0680j_4(F)F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    move-result-wide v0

    goto :goto_1

    .line 88
    :cond_1
    sget-object v0, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Size$Companion;->getUnspecified-NH-jbRc()J

    move-result-wide v0

    .line 89
    :goto_1
    return-wide v0
.end method

.method public static $default$toSp-0xMU5do(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;F)J
    .locals 2
    .param p0, "_this"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
    .param p1, "$this$toSp_u2d0xMU5do"    # F

    .line 82
    invoke-interface {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getFontScale()F

    move-result v0

    div-float v0, p1, v0

    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public static $default$toSp-kPz2Gy4(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;F)J
    .locals 2
    .param p0, "_this"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
    .param p1, "$this$toSp_u2dkPz2Gy4"    # F

    .line 76
    invoke-interface {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getFontScale()F

    move-result v0

    invoke-interface {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getDensity()F

    move-result v1

    mul-float v0, v0, v1

    div-float v0, p1, v0

    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public static $default$toSp-kPz2Gy4(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;I)J
    .locals 3
    .param p0, "_this"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;
    .param p1, "$this$toSp_u2dkPz2Gy4"    # I

    .line 79
    int-to-float v0, p1

    invoke-interface {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getFontScale()F

    move-result v1

    invoke-interface {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;->getDensity()F

    move-result v2

    mul-float v1, v1, v2

    div-float/2addr v0, v1

    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(F)J

    move-result-wide v0

    return-wide v0
.end method
