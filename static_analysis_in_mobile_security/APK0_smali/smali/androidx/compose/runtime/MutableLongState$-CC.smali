.class public final synthetic Landroidx/compose/runtime/MutableLongState$-CC;
.super Ljava/lang/Object;
.source "SnapshotLongState.kt"


# direct methods
.method public static $default$getValue(Landroidx/compose/runtime/MutableLongState;)Ljava/lang/Long;
    .locals 2
    .param p0, "_this"    # Landroidx/compose/runtime/MutableLongState;

    .line 94
    invoke-interface {p0}, Landroidx/compose/runtime/MutableLongState;->getLongValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic $default$getValue(Landroidx/compose/runtime/MutableLongState;)Ljava/lang/Object;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/runtime/MutableLongState;

    .line 88
    invoke-interface {p0}, Landroidx/compose/runtime/MutableLongState;->getValue()Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public static $default$setValue(Landroidx/compose/runtime/MutableLongState;J)V
    .locals 0
    .param p0, "_this"    # Landroidx/compose/runtime/MutableLongState;
    .param p1, "value"    # J

    .line 95
    invoke-interface {p0, p1, p2}, Landroidx/compose/runtime/MutableLongState;->setLongValue(J)V

    return-void
.end method

.method public static bridge synthetic $default$setValue(Landroidx/compose/runtime/MutableLongState;Ljava/lang/Object;)V
    .locals 2
    .param p0, "_this"    # Landroidx/compose/runtime/MutableLongState;
    .param p1, "<set-?>"    # Ljava/lang/Object;

    .line 88
    move-object v0, p1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-interface {p0, v0, v1}, Landroidx/compose/runtime/MutableLongState;->setValue(J)V

    return-void
.end method

.method public static synthetic access$getValue$jd(Landroidx/compose/runtime/MutableLongState;)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/runtime/MutableLongState;

    .line 88
    invoke-static {p0}, Landroidx/compose/runtime/MutableLongState$-CC;->$default$getValue(Landroidx/compose/runtime/MutableLongState;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$setValue$jd(Landroidx/compose/runtime/MutableLongState;J)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/runtime/MutableLongState;
    .param p1, "value"    # J

    .line 88
    invoke-static {p0, p1, p2}, Landroidx/compose/runtime/MutableLongState$-CC;->$default$setValue(Landroidx/compose/runtime/MutableLongState;J)V

    return-void
.end method
