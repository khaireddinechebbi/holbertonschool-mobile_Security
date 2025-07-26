.class public final synthetic Landroidx/compose/ui/unit/Density$-CC;
.super Ljava/lang/Object;
.source "Density.kt"


# direct methods
.method public static $default$roundToPx--R2X_6o(Landroidx/compose/ui/unit/Density;J)I
    .locals 1
    .param p0, "_this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$this$roundToPx_u2d_u2dR2X_6o"    # J

    .line 98
    invoke-interface {p0, p1, p2}, Landroidx/compose/ui/unit/Density;->toPx--R2X_6o(J)F

    move-result v0

    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v0

    return v0
.end method

.method public static $default$roundToPx-0680j_4(Landroidx/compose/ui/unit/Density;F)I
    .locals 2
    .param p0, "_this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$this$roundToPx_u2d0680j_4"    # F

    .line 74
    invoke-interface {p0, p1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v0

    .line 75
    .local v0, "px":F
    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x7fffffff

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v1

    :goto_0
    return v1
.end method

.method public static $default$toDp-GaN1DYA(Landroidx/compose/ui/unit/Density;J)F
    .locals 4
    .param p0, "_this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$this$toDp_u2dGaN1DYA"    # J

    .line 106
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/TextUnit;->getType-UIouoOA(J)J

    move-result-wide v0

    sget-object v2, Landroidx/compose/ui/unit/TextUnitType;->Companion:Landroidx/compose/ui/unit/TextUnitType$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnitType$Companion;->getSp-UIouoOA()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/unit/TextUnitType;->equals-impl0(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/TextUnit;->getValue-impl(J)F

    move-result v0

    invoke-interface {p0}, Landroidx/compose/ui/unit/Density;->getFontScale()F

    move-result v1

    mul-float v0, v0, v1

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    return v0

    .line 164
    :cond_0
    const/4 v0, 0x0

    .line 106
    .local v0, "$i$a$-check-Density$toDp$1":I
    nop

    .end local v0    # "$i$a$-check-Density$toDp$1":I
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Only Sp can convert to Px"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static $default$toDp-u2uoSUM(Landroidx/compose/ui/unit/Density;F)F
    .locals 2
    .param p0, "_this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$this$toDp_u2du2uoSUM"    # F

    .line 124
    invoke-interface {p0}, Landroidx/compose/ui/unit/Density;->getDensity()F

    move-result v0

    div-float v0, p1, v0

    .local v0, "$this$dp$iv":F
    const/4 v1, 0x0

    .line 166
    .local v1, "$i$f$getDp":I
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 124
    .end local v0    # "$this$dp$iv":F
    .end local v1    # "$i$f$getDp":I
    return v0
.end method

.method public static $default$toDp-u2uoSUM(Landroidx/compose/ui/unit/Density;I)F
    .locals 2
    .param p0, "_this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$this$toDp_u2du2uoSUM"    # I

    .line 114
    int-to-float v0, p1

    invoke-interface {p0}, Landroidx/compose/ui/unit/Density;->getDensity()F

    move-result v1

    div-float/2addr v0, v1

    .local v0, "$this$dp$iv":F
    const/4 v1, 0x0

    .line 165
    .local v1, "$i$f$getDp":I
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 114
    .end local v0    # "$this$dp$iv":F
    .end local v1    # "$i$f$getDp":I
    return v0
.end method

.method public static $default$toDpSize-k-rfVVM(Landroidx/compose/ui/unit/Density;J)J
    .locals 6
    .param p0, "_this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$this$toDpSize_u2dk_u2drfVVM"    # J

    .line 157
    move-wide v0, p1

    .local v0, "$this$isSpecified$iv":J
    const/4 v2, 0x0

    .line 168
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

    .line 157
    .end local v0    # "$this$isSpecified$iv":J
    .end local v2    # "$i$f$isSpecified-uvyYCjk":I
    :goto_0
    if-eqz v3, :cond_1

    .line 158
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v0

    invoke-interface {p0, v0}, Landroidx/compose/ui/unit/Density;->toDp-u2uoSUM(F)F

    move-result v0

    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v1

    invoke-interface {p0, v1}, Landroidx/compose/ui/unit/Density;->toDp-u2uoSUM(F)F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/ui/unit/DpKt;->DpSize-YgX7TsA(FF)J

    move-result-wide v0

    goto :goto_1

    .line 160
    :cond_1
    sget-object v0, Landroidx/compose/ui/unit/DpSize;->Companion:Landroidx/compose/ui/unit/DpSize$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/unit/DpSize$Companion;->getUnspecified-MYxV2XQ()J

    move-result-wide v0

    .line 161
    :goto_1
    return-wide v0
.end method

.method public static $default$toPx--R2X_6o(Landroidx/compose/ui/unit/Density;J)F
    .locals 4
    .param p0, "_this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$this$toPx_u2d_u2dR2X_6o"    # J

    .line 90
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/TextUnit;->getType-UIouoOA(J)J

    move-result-wide v0

    sget-object v2, Landroidx/compose/ui/unit/TextUnitType;->Companion:Landroidx/compose/ui/unit/TextUnitType$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnitType$Companion;->getSp-UIouoOA()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/ui/unit/TextUnitType;->equals-impl0(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/TextUnit;->getValue-impl(J)F

    move-result v0

    invoke-interface {p0}, Landroidx/compose/ui/unit/Density;->getFontScale()F

    move-result v1

    mul-float v0, v0, v1

    invoke-interface {p0}, Landroidx/compose/ui/unit/Density;->getDensity()F

    move-result v1

    mul-float v0, v0, v1

    return v0

    .line 164
    :cond_0
    const/4 v0, 0x0

    .line 90
    .local v0, "$i$a$-check-Density$toPx$1":I
    nop

    .end local v0    # "$i$a$-check-Density$toPx$1":I
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Only Sp can convert to Px"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static $default$toPx-0680j_4(Landroidx/compose/ui/unit/Density;F)F
    .locals 1
    .param p0, "_this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$this$toPx_u2d0680j_4"    # F

    .line 67
    invoke-interface {p0}, Landroidx/compose/ui/unit/Density;->getDensity()F

    move-result v0

    mul-float v0, v0, p1

    return v0
.end method

.method public static $default$toRect(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;
    .locals 5
    .param p0, "_this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$this$toRect"    # Landroidx/compose/ui/unit/DpRect;

    .line 0
    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    new-instance v0, Landroidx/compose/ui/geometry/Rect;

    .line 136
    invoke-virtual {p1}, Landroidx/compose/ui/unit/DpRect;->getLeft-D9Ej5fM()F

    move-result v1

    invoke-interface {p0, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v1

    .line 137
    invoke-virtual {p1}, Landroidx/compose/ui/unit/DpRect;->getTop-D9Ej5fM()F

    move-result v2

    invoke-interface {p0, v2}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v2

    .line 138
    invoke-virtual {p1}, Landroidx/compose/ui/unit/DpRect;->getRight-D9Ej5fM()F

    move-result v3

    invoke-interface {p0, v3}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v3

    .line 139
    invoke-virtual {p1}, Landroidx/compose/ui/unit/DpRect;->getBottom-D9Ej5fM()F

    move-result v4

    invoke-interface {p0, v4}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v4

    .line 135
    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    return-object v0
.end method

.method public static $default$toSize-XkaWNTQ(Landroidx/compose/ui/unit/Density;J)J
    .locals 6
    .param p0, "_this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$this$toSize_u2dXkaWNTQ"    # J

    .line 147
    move-wide v0, p1

    .local v0, "$this$isSpecified$iv":J
    const/4 v2, 0x0

    .line 167
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

    .line 147
    .end local v0    # "$this$isSpecified$iv":J
    .end local v2    # "$i$f$isSpecified-EaSLcWc":I
    :goto_0
    if-eqz v3, :cond_1

    .line 148
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/DpSize;->getWidth-D9Ej5fM(J)F

    move-result v0

    invoke-interface {p0, v0}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v0

    invoke-static {p1, p2}, Landroidx/compose/ui/unit/DpSize;->getHeight-D9Ej5fM(J)F

    move-result v1

    invoke-interface {p0, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/SizeKt;->Size(FF)J

    move-result-wide v0

    goto :goto_1

    .line 150
    :cond_1
    sget-object v0, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Size$Companion;->getUnspecified-NH-jbRc()J

    move-result-wide v0

    .line 151
    :goto_1
    return-wide v0
.end method

.method public static $default$toSp-0xMU5do(Landroidx/compose/ui/unit/Density;F)J
    .locals 2
    .param p0, "_this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$this$toSp_u2d0xMU5do"    # F

    .line 82
    invoke-interface {p0}, Landroidx/compose/ui/unit/Density;->getFontScale()F

    move-result v0

    div-float v0, p1, v0

    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public static $default$toSp-kPz2Gy4(Landroidx/compose/ui/unit/Density;F)J
    .locals 2
    .param p0, "_this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$this$toSp_u2dkPz2Gy4"    # F

    .line 128
    invoke-interface {p0}, Landroidx/compose/ui/unit/Density;->getFontScale()F

    move-result v0

    invoke-interface {p0}, Landroidx/compose/ui/unit/Density;->getDensity()F

    move-result v1

    mul-float v0, v0, v1

    div-float v0, p1, v0

    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public static $default$toSp-kPz2Gy4(Landroidx/compose/ui/unit/Density;I)J
    .locals 3
    .param p0, "_this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$this$toSp_u2dkPz2Gy4"    # I

    .line 120
    int-to-float v0, p1

    invoke-interface {p0}, Landroidx/compose/ui/unit/Density;->getFontScale()F

    move-result v1

    invoke-interface {p0}, Landroidx/compose/ui/unit/Density;->getDensity()F

    move-result v2

    mul-float v1, v1, v2

    div-float/2addr v0, v1

    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$roundToPx--R2X_6o$jd(Landroidx/compose/ui/unit/Density;J)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$receiver"    # J

    .line 47
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$roundToPx--R2X_6o(Landroidx/compose/ui/unit/Density;J)I

    move-result v0

    return v0
.end method

.method public static synthetic access$roundToPx-0680j_4$jd(Landroidx/compose/ui/unit/Density;F)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$receiver"    # F

    .line 47
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$roundToPx-0680j_4(Landroidx/compose/ui/unit/Density;F)I

    move-result v0

    return v0
.end method

.method public static synthetic access$toDp-GaN1DYA$jd(Landroidx/compose/ui/unit/Density;J)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$receiver"    # J

    .line 47
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$toDp-GaN1DYA(Landroidx/compose/ui/unit/Density;J)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toDp-u2uoSUM$jd(Landroidx/compose/ui/unit/Density;F)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$receiver"    # F

    .line 47
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toDp-u2uoSUM(Landroidx/compose/ui/unit/Density;F)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toDp-u2uoSUM$jd(Landroidx/compose/ui/unit/Density;I)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$receiver"    # I

    .line 47
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toDp-u2uoSUM(Landroidx/compose/ui/unit/Density;I)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toDpSize-k-rfVVM$jd(Landroidx/compose/ui/unit/Density;J)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$receiver"    # J

    .line 47
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$toDpSize-k-rfVVM(Landroidx/compose/ui/unit/Density;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$toPx--R2X_6o$jd(Landroidx/compose/ui/unit/Density;J)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$receiver"    # J

    .line 47
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$toPx--R2X_6o(Landroidx/compose/ui/unit/Density;J)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toPx-0680j_4$jd(Landroidx/compose/ui/unit/Density;F)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$receiver"    # F

    .line 47
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toPx-0680j_4(Landroidx/compose/ui/unit/Density;F)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toRect$jd(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$receiver"    # Landroidx/compose/ui/unit/DpRect;

    .line 47
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toRect(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$toSize-XkaWNTQ$jd(Landroidx/compose/ui/unit/Density;J)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$receiver"    # J

    .line 47
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$toSize-XkaWNTQ(Landroidx/compose/ui/unit/Density;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$toSp-0xMU5do$jd(Landroidx/compose/ui/unit/Density;F)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$receiver"    # F

    .line 47
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toSp-0xMU5do(Landroidx/compose/ui/unit/Density;F)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$toSp-kPz2Gy4$jd(Landroidx/compose/ui/unit/Density;F)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$receiver"    # F

    .line 47
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toSp-kPz2Gy4(Landroidx/compose/ui/unit/Density;F)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$toSp-kPz2Gy4$jd(Landroidx/compose/ui/unit/Density;I)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/unit/Density;
    .param p1, "$receiver"    # I

    .line 47
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toSp-kPz2Gy4(Landroidx/compose/ui/unit/Density;I)J

    move-result-wide v0

    return-wide v0
.end method
