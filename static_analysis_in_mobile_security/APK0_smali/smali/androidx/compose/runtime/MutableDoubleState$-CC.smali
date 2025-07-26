.class public final synthetic Landroidx/compose/runtime/MutableDoubleState$-CC;
.super Ljava/lang/Object;
.source "SnapshotDoubleState.kt"


# direct methods
.method public static $default$getValue(Landroidx/compose/runtime/MutableDoubleState;)Ljava/lang/Double;
    .locals 2
    .param p0, "_this"    # Landroidx/compose/runtime/MutableDoubleState;

    .line 97
    invoke-interface {p0}, Landroidx/compose/runtime/MutableDoubleState;->getDoubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic $default$getValue(Landroidx/compose/runtime/MutableDoubleState;)Ljava/lang/Object;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/runtime/MutableDoubleState;

    .line 91
    invoke-interface {p0}, Landroidx/compose/runtime/MutableDoubleState;->getValue()Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public static $default$setValue(Landroidx/compose/runtime/MutableDoubleState;D)V
    .locals 0
    .param p0, "_this"    # Landroidx/compose/runtime/MutableDoubleState;
    .param p1, "value"    # D

    .line 98
    invoke-interface {p0, p1, p2}, Landroidx/compose/runtime/MutableDoubleState;->setDoubleValue(D)V

    return-void
.end method

.method public static bridge synthetic $default$setValue(Landroidx/compose/runtime/MutableDoubleState;Ljava/lang/Object;)V
    .locals 2
    .param p0, "_this"    # Landroidx/compose/runtime/MutableDoubleState;
    .param p1, "<set-?>"    # Ljava/lang/Object;

    .line 91
    move-object v0, p1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-interface {p0, v0, v1}, Landroidx/compose/runtime/MutableDoubleState;->setValue(D)V

    return-void
.end method

.method public static synthetic access$getValue$jd(Landroidx/compose/runtime/MutableDoubleState;)D
    .locals 2
    .param p0, "$this"    # Landroidx/compose/runtime/MutableDoubleState;

    .line 91
    invoke-static {p0}, Landroidx/compose/runtime/MutableDoubleState$-CC;->$default$getValue(Landroidx/compose/runtime/MutableDoubleState;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$setValue$jd(Landroidx/compose/runtime/MutableDoubleState;D)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/runtime/MutableDoubleState;
    .param p1, "value"    # D

    .line 91
    invoke-static {p0, p1, p2}, Landroidx/compose/runtime/MutableDoubleState$-CC;->$default$setValue(Landroidx/compose/runtime/MutableDoubleState;D)V

    return-void
.end method
