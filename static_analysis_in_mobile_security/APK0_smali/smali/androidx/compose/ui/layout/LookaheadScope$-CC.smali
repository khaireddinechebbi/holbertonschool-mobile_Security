.class public final synthetic Landroidx/compose/ui/layout/LookaheadScope$-CC;
.super Ljava/lang/Object;
.source "LookaheadScope.kt"


# direct methods
.method public static $default$intermediateLayout(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function4;)Landroidx/compose/ui/Modifier;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/ui/layout/LookaheadScope;
    .param p1, "$this$intermediateLayout"    # Landroidx/compose/ui/Modifier;
    .param p2, "measure"    # Lkotlin/jvm/functions/Function4;
    .annotation runtime Lkotlin/Deprecated;
        message = ""
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "intermediateLayout { measurable, constraints ->measure.invoke(this, measurable, constraints, lookaheadSize)}"
            imports = {}
        .end subannotation
    .end annotation

    .line 0
    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "measure"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    new-instance v0, Landroidx/compose/ui/layout/LookaheadScope$intermediateLayout$1;

    invoke-direct {v0, p2}, Landroidx/compose/ui/layout/LookaheadScope$intermediateLayout$1;-><init>(Lkotlin/jvm/functions/Function4;)V

    check-cast v0, Lkotlin/jvm/functions/Function3;

    invoke-static {p1, v0}, Landroidx/compose/ui/layout/LookaheadScopeKt;->intermediateLayout(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 290
    return-object v0
.end method

.method public static $default$localLookaheadPositionOf-dBAh8RU(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;)J
    .locals 4
    .param p0, "_this"    # Landroidx/compose/ui/layout/LookaheadScope;
    .param p1, "$this$localLookaheadPositionOf_u2ddBAh8RU"    # Landroidx/compose/ui/layout/LayoutCoordinates;
    .param p2, "coordinates"    # Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 0
    const-string v0, "$this$localLookaheadPositionOf"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coordinates"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    invoke-interface {p0, p1}, Landroidx/compose/ui/layout/LookaheadScope;->toLookaheadCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v0

    .line 231
    invoke-interface {p0, p2}, Landroidx/compose/ui/layout/LookaheadScope;->toLookaheadCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v1

    .line 232
    sget-object v2, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide v2

    .line 230
    invoke-interface {v0, v1, v2, v3}, Landroidx/compose/ui/layout/LayoutCoordinates;->localPositionOf-R5De75A(Landroidx/compose/ui/layout/LayoutCoordinates;J)J

    move-result-wide v0

    .line 233
    return-wide v0
.end method
