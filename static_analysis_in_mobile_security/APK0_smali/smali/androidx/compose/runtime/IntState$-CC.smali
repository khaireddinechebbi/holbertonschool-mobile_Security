.class public final synthetic Landroidx/compose/runtime/IntState$-CC;
.super Ljava/lang/Object;
.source "SnapshotIntState.kt"


# direct methods
.method public static $default$getValue(Landroidx/compose/runtime/IntState;)Ljava/lang/Integer;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/runtime/IntState;

    .line 66
    invoke-interface {p0}, Landroidx/compose/runtime/IntState;->getIntValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic $default$getValue(Landroidx/compose/runtime/IntState;)Ljava/lang/Object;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/runtime/IntState;

    .line 61
    invoke-interface {p0}, Landroidx/compose/runtime/IntState;->getValue()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$getValue$jd(Landroidx/compose/runtime/IntState;)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/IntState;

    .line 61
    invoke-static {p0}, Landroidx/compose/runtime/IntState$-CC;->$default$getValue(Landroidx/compose/runtime/IntState;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method
