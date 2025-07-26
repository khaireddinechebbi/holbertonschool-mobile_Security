.class public final synthetic Landroidx/compose/runtime/tooling/CompositionData$-CC;
.super Ljava/lang/Object;
.source "CompositionData.kt"


# direct methods
.method public static $default$find(Landroidx/compose/runtime/tooling/CompositionData;Ljava/lang/Object;)Landroidx/compose/runtime/tooling/CompositionGroup;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/runtime/tooling/CompositionData;
    .param p1, "identityToFind"    # Ljava/lang/Object;

    .line 0
    const-string/jumbo v0, "identityToFind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    const/4 v0, 0x0

    return-object v0
.end method
