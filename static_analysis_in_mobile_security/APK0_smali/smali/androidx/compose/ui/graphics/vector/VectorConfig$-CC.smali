.class public final synthetic Landroidx/compose/ui/graphics/vector/VectorConfig$-CC;
.super Ljava/lang/Object;
.source "VectorPainter.kt"


# direct methods
.method public static $default$getOrDefault(Landroidx/compose/ui/graphics/vector/VectorConfig;Landroidx/compose/ui/graphics/vector/VectorProperty;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/ui/graphics/vector/VectorConfig;
    .param p1, "property"    # Landroidx/compose/ui/graphics/vector/VectorProperty;
    .param p2, "defaultValue"    # Ljava/lang/Object;

    .line 0
    const-string/jumbo v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    return-object p2
.end method

.method public static synthetic access$getOrDefault$jd(Landroidx/compose/ui/graphics/vector/VectorConfig;Landroidx/compose/ui/graphics/vector/VectorProperty;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/graphics/vector/VectorConfig;
    .param p1, "property"    # Landroidx/compose/ui/graphics/vector/VectorProperty;
    .param p2, "defaultValue"    # Ljava/lang/Object;

    .line 313
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/graphics/vector/VectorConfig$-CC;->$default$getOrDefault(Landroidx/compose/ui/graphics/vector/VectorConfig;Landroidx/compose/ui/graphics/vector/VectorProperty;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
