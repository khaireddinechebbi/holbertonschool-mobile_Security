.class public final synthetic Landroidx/compose/runtime/SnapshotMutationPolicy$-CC;
.super Ljava/lang/Object;
.source "SnapshotMutationPolicy.kt"


# direct methods
.method public static $default$merge(Landroidx/compose/runtime/SnapshotMutationPolicy;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/runtime/SnapshotMutationPolicy;
    .param p1, "previous"    # Ljava/lang/Object;
    .param p2, "current"    # Ljava/lang/Object;
    .param p3, "applied"    # Ljava/lang/Object;

    .line 57
    const/4 v0, 0x0

    return-object v0
.end method

.method public static synthetic access$merge$jd(Landroidx/compose/runtime/SnapshotMutationPolicy;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/SnapshotMutationPolicy;
    .param p1, "previous"    # Ljava/lang/Object;
    .param p2, "current"    # Ljava/lang/Object;
    .param p3, "applied"    # Ljava/lang/Object;

    .line 38
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/runtime/SnapshotMutationPolicy$-CC;->$default$merge(Landroidx/compose/runtime/SnapshotMutationPolicy;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
