.class public final synthetic Landroidx/compose/runtime/FloatState$-CC;
.super Ljava/lang/Object;
.source "SnapshotFloatState.kt"


# direct methods
.method public static $default$getValue(Landroidx/compose/runtime/FloatState;)Ljava/lang/Float;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/runtime/FloatState;

    .line 66
    invoke-interface {p0}, Landroidx/compose/runtime/FloatState;->getFloatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic $default$getValue(Landroidx/compose/runtime/FloatState;)Ljava/lang/Object;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/runtime/FloatState;

    .line 61
    invoke-interface {p0}, Landroidx/compose/runtime/FloatState;->getValue()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$getValue$jd(Landroidx/compose/runtime/FloatState;)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/FloatState;

    .line 61
    invoke-static {p0}, Landroidx/compose/runtime/FloatState$-CC;->$default$getValue(Landroidx/compose/runtime/FloatState;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method
