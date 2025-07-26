.class public final synthetic Landroidx/compose/ui/layout/SubcomposeIntermediateMeasureScope$-CC;
.super Ljava/lang/Object;
.source "SubcomposeLayout.kt"


# direct methods
.method public static $default$subcompose(Landroidx/compose/ui/layout/SubcomposeIntermediateMeasureScope;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/ui/layout/SubcomposeIntermediateMeasureScope;
    .param p1, "slotId"    # Ljava/lang/Object;
    .param p2, "content"    # Lkotlin/jvm/functions/Function2;

    .line 0
    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    invoke-interface {p0, p1}, Landroidx/compose/ui/layout/SubcomposeIntermediateMeasureScope;->measurablesForSlot(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
