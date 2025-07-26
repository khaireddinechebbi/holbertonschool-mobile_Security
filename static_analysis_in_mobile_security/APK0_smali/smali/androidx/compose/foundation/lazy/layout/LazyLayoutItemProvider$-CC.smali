.class public final synthetic Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider$-CC;
.super Ljava/lang/Object;
.source "LazyLayoutItemProvider.kt"


# direct methods
.method public static $default$getContentType(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;I)Ljava/lang/Object;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;
    .param p1, "index"    # I

    .line 47
    const/4 v0, 0x0

    return-object v0
.end method

.method public static $default$getIndex(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Ljava/lang/Object;)I
    .locals 1
    .param p0, "_this"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;
    .param p1, "key"    # Ljava/lang/Object;

    .line 0
    const-string/jumbo v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    const/4 v0, -0x1

    return v0
.end method

.method public static $default$getKey(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;I)Ljava/lang/Object;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;
    .param p1, "index"    # I

    .line 54
    invoke-static {p1}, Landroidx/compose/foundation/lazy/layout/Lazy_androidKt;->getDefaultLazyLayoutKey(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
