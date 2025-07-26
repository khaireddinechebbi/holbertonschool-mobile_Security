.class public final synthetic Landroidx/compose/ui/node/LayoutAwareModifierNode$-CC;
.super Ljava/lang/Object;
.source "LayoutAwareModifierNode.kt"


# direct methods
.method public static $default$onPlaced(Landroidx/compose/ui/node/LayoutAwareModifierNode;Landroidx/compose/ui/layout/LayoutCoordinates;)V
    .locals 1
    .param p0, "_this"    # Landroidx/compose/ui/node/LayoutAwareModifierNode;
    .param p1, "coordinates"    # Landroidx/compose/ui/layout/LayoutCoordinates;

    .line 0
    const-string v0, "coordinates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    return-void
.end method

.method public static $default$onRemeasured-ozmzZPI(Landroidx/compose/ui/node/LayoutAwareModifierNode;J)V
    .locals 0
    .param p0, "_this"    # Landroidx/compose/ui/node/LayoutAwareModifierNode;
    .param p1, "size"    # J

    .line 49
    return-void
.end method
