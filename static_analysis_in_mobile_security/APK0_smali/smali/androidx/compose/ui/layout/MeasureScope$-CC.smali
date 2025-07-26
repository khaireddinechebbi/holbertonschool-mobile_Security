.class public final synthetic Landroidx/compose/ui/layout/MeasureScope$-CC;
.super Ljava/lang/Object;
.source "MeasureScope.kt"


# direct methods
.method public static $default$layout(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;
    .locals 7
    .param p0, "_this"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p1, "width"    # I
    .param p2, "height"    # I
    .param p3, "alignmentLines"    # Ljava/util/Map;
    .param p4, "placementBlock"    # Lkotlin/jvm/functions/Function1;

    .line 0
    const-string v0, "alignmentLines"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "placementBlock"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    new-instance v0, Landroidx/compose/ui/layout/MeasureScope$layout$1;

    move-object v1, v0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p0

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Landroidx/compose/ui/layout/MeasureScope$layout$1;-><init>(IILjava/util/Map;Landroidx/compose/ui/layout/MeasureScope;Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Landroidx/compose/ui/layout/MeasureResult;

    .line 59
    return-object v0
.end method

.method public static synthetic access$isLookingAhead$jd(Landroidx/compose/ui/layout/MeasureScope;)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/MeasureScope;

    .line 26
    invoke-static {p0}, Landroidx/compose/ui/layout/IntrinsicMeasureScope$-CC;->$default$isLookingAhead(Landroidx/compose/ui/layout/IntrinsicMeasureScope;)Z

    move-result v0

    return v0
.end method

.method public static synthetic access$layout$jd(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p1, "width"    # I
    .param p2, "height"    # I
    .param p3, "alignmentLines"    # Ljava/util/Map;
    .param p4, "placementBlock"    # Lkotlin/jvm/functions/Function1;

    .line 26
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/ui/layout/MeasureScope$-CC;->$default$layout(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$roundToPx--R2X_6o$jd(Landroidx/compose/ui/layout/MeasureScope;J)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p1, "$receiver"    # J

    .line 26
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$roundToPx--R2X_6o(Landroidx/compose/ui/unit/Density;J)I

    move-result v0

    return v0
.end method

.method public static synthetic access$roundToPx-0680j_4$jd(Landroidx/compose/ui/layout/MeasureScope;F)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p1, "$receiver"    # F

    .line 26
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$roundToPx-0680j_4(Landroidx/compose/ui/unit/Density;F)I

    move-result v0

    return v0
.end method

.method public static synthetic access$toDp-GaN1DYA$jd(Landroidx/compose/ui/layout/MeasureScope;J)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p1, "$receiver"    # J

    .line 26
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$toDp-GaN1DYA(Landroidx/compose/ui/unit/Density;J)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toDp-u2uoSUM$jd(Landroidx/compose/ui/layout/MeasureScope;F)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p1, "$receiver"    # F

    .line 26
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toDp-u2uoSUM(Landroidx/compose/ui/unit/Density;F)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toDp-u2uoSUM$jd(Landroidx/compose/ui/layout/MeasureScope;I)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p1, "$receiver"    # I

    .line 26
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toDp-u2uoSUM(Landroidx/compose/ui/unit/Density;I)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toDpSize-k-rfVVM$jd(Landroidx/compose/ui/layout/MeasureScope;J)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p1, "$receiver"    # J

    .line 26
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$toDpSize-k-rfVVM(Landroidx/compose/ui/unit/Density;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$toPx--R2X_6o$jd(Landroidx/compose/ui/layout/MeasureScope;J)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p1, "$receiver"    # J

    .line 26
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$toPx--R2X_6o(Landroidx/compose/ui/unit/Density;J)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toPx-0680j_4$jd(Landroidx/compose/ui/layout/MeasureScope;F)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p1, "$receiver"    # F

    .line 26
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toPx-0680j_4(Landroidx/compose/ui/unit/Density;F)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toRect$jd(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p1, "$receiver"    # Landroidx/compose/ui/unit/DpRect;

    .line 26
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toRect(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$toSize-XkaWNTQ$jd(Landroidx/compose/ui/layout/MeasureScope;J)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p1, "$receiver"    # J

    .line 26
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$toSize-XkaWNTQ(Landroidx/compose/ui/unit/Density;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$toSp-0xMU5do$jd(Landroidx/compose/ui/layout/MeasureScope;F)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p1, "$receiver"    # F

    .line 26
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toSp-0xMU5do(Landroidx/compose/ui/unit/Density;F)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$toSp-kPz2Gy4$jd(Landroidx/compose/ui/layout/MeasureScope;F)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p1, "$receiver"    # F

    .line 26
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toSp-kPz2Gy4(Landroidx/compose/ui/unit/Density;F)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$toSp-kPz2Gy4$jd(Landroidx/compose/ui/layout/MeasureScope;I)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/layout/MeasureScope;
    .param p1, "$receiver"    # I

    .line 26
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toSp-kPz2Gy4(Landroidx/compose/ui/unit/Density;I)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
    .locals 0

    .line 42
    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    .line 45
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p3

    .line 42
    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Landroidx/compose/ui/layout/MeasureScope;->layout(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: layout"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
