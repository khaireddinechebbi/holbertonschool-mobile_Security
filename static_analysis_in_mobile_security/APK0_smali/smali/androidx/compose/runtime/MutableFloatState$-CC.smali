.class public final synthetic Landroidx/compose/runtime/MutableFloatState$-CC;
.super Ljava/lang/Object;
.source "SnapshotFloatState.kt"


# direct methods
.method public static $default$getValue(Landroidx/compose/runtime/MutableFloatState;)Ljava/lang/Float;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/runtime/MutableFloatState;

    .line 93
    invoke-interface {p0}, Landroidx/compose/runtime/MutableFloatState;->getFloatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic $default$getValue(Landroidx/compose/runtime/MutableFloatState;)Ljava/lang/Object;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/runtime/MutableFloatState;

    .line 87
    invoke-interface {p0}, Landroidx/compose/runtime/MutableFloatState;->getValue()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public static $default$setValue(Landroidx/compose/runtime/MutableFloatState;F)V
    .locals 0
    .param p0, "_this"    # Landroidx/compose/runtime/MutableFloatState;
    .param p1, "value"    # F

    .line 94
    invoke-interface {p0, p1}, Landroidx/compose/runtime/MutableFloatState;->setFloatValue(F)V

    return-void
.end method

.method public static bridge synthetic $default$setValue(Landroidx/compose/runtime/MutableFloatState;Ljava/lang/Object;)V
    .locals 1
    .param p0, "_this"    # Landroidx/compose/runtime/MutableFloatState;
    .param p1, "<set-?>"    # Ljava/lang/Object;

    .line 87
    move-object v0, p1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-interface {p0, v0}, Landroidx/compose/runtime/MutableFloatState;->setValue(F)V

    return-void
.end method

.method public static synthetic access$getValue$jd(Landroidx/compose/runtime/MutableFloatState;)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/runtime/MutableFloatState;

    .line 87
    invoke-static {p0}, Landroidx/compose/runtime/MutableFloatState$-CC;->$default$getValue(Landroidx/compose/runtime/MutableFloatState;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public static synthetic access$setValue$jd(Landroidx/compose/runtime/MutableFloatState;F)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/runtime/MutableFloatState;
    .param p1, "value"    # F

    .line 87
    invoke-static {p0, p1}, Landroidx/compose/runtime/MutableFloatState$-CC;->$default$setValue(Landroidx/compose/runtime/MutableFloatState;F)V

    return-void
.end method
