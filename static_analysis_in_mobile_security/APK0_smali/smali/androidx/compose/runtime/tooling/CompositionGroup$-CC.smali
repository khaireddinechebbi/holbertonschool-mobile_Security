.class public final synthetic Landroidx/compose/runtime/tooling/CompositionGroup$-CC;
.super Ljava/lang/Object;
.source "CompositionData.kt"


# direct methods
.method public static $default$getGroupSize(Landroidx/compose/runtime/tooling/CompositionGroup;)I
    .locals 1
    .param p0, "_this"    # Landroidx/compose/runtime/tooling/CompositionGroup;

    .line 99
    const/4 v0, 0x0

    return v0
.end method

.method public static $default$getIdentity(Landroidx/compose/runtime/tooling/CompositionGroup;)Ljava/lang/Object;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/runtime/tooling/CompositionGroup;

    .line 94
    const/4 v0, 0x0

    return-object v0
.end method

.method public static $default$getSlotsSize(Landroidx/compose/runtime/tooling/CompositionGroup;)I
    .locals 1
    .param p0, "_this"    # Landroidx/compose/runtime/tooling/CompositionGroup;

    .line 101
    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic access$find$jd(Landroidx/compose/runtime/tooling/CompositionGroup;Ljava/lang/Object;)Landroidx/compose/runtime/tooling/CompositionGroup;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/tooling/CompositionGroup;
    .param p1, "identityToFind"    # Ljava/lang/Object;

    .line 61
    invoke-static {p0, p1}, Landroidx/compose/runtime/tooling/CompositionData$-CC;->$default$find(Landroidx/compose/runtime/tooling/CompositionData;Ljava/lang/Object;)Landroidx/compose/runtime/tooling/CompositionGroup;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$getGroupSize$jd(Landroidx/compose/runtime/tooling/CompositionGroup;)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/tooling/CompositionGroup;

    .line 61
    invoke-static {p0}, Landroidx/compose/runtime/tooling/CompositionGroup$-CC;->$default$getGroupSize(Landroidx/compose/runtime/tooling/CompositionGroup;)I

    move-result v0

    return v0
.end method

.method public static synthetic access$getIdentity$jd(Landroidx/compose/runtime/tooling/CompositionGroup;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/tooling/CompositionGroup;

    .line 61
    invoke-static {p0}, Landroidx/compose/runtime/tooling/CompositionGroup$-CC;->$default$getIdentity(Landroidx/compose/runtime/tooling/CompositionGroup;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$getSlotsSize$jd(Landroidx/compose/runtime/tooling/CompositionGroup;)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/tooling/CompositionGroup;

    .line 61
    invoke-static {p0}, Landroidx/compose/runtime/tooling/CompositionGroup$-CC;->$default$getSlotsSize(Landroidx/compose/runtime/tooling/CompositionGroup;)I

    move-result v0

    return v0
.end method
