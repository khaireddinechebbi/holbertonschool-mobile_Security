.class public final synthetic Landroidx/compose/ui/platform/InspectableValue$-CC;
.super Ljava/lang/Object;
.source "InspectableValue.kt"


# direct methods
.method public static $default$getInspectableElements(Landroidx/compose/ui/platform/InspectableValue;)Lkotlin/sequences/Sequence;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/ui/platform/InspectableValue;

    .line 42
    invoke-static {}, Lkotlin/sequences/SequencesKt;->emptySequence()Lkotlin/sequences/Sequence;

    move-result-object v0

    return-object v0
.end method

.method public static $default$getNameFallback(Landroidx/compose/ui/platform/InspectableValue;)Ljava/lang/String;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/ui/platform/InspectableValue;

    .line 50
    const/4 v0, 0x0

    return-object v0
.end method

.method public static $default$getValueOverride(Landroidx/compose/ui/platform/InspectableValue;)Ljava/lang/Object;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/ui/platform/InspectableValue;

    .line 56
    const/4 v0, 0x0

    return-object v0
.end method

.method public static synthetic access$getInspectableElements$jd(Landroidx/compose/ui/platform/InspectableValue;)Lkotlin/sequences/Sequence;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/platform/InspectableValue;

    .line 35
    invoke-static {p0}, Landroidx/compose/ui/platform/InspectableValue$-CC;->$default$getInspectableElements(Landroidx/compose/ui/platform/InspectableValue;)Lkotlin/sequences/Sequence;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$getNameFallback$jd(Landroidx/compose/ui/platform/InspectableValue;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/platform/InspectableValue;

    .line 35
    invoke-static {p0}, Landroidx/compose/ui/platform/InspectableValue$-CC;->$default$getNameFallback(Landroidx/compose/ui/platform/InspectableValue;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$getValueOverride$jd(Landroidx/compose/ui/platform/InspectableValue;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/platform/InspectableValue;

    .line 35
    invoke-static {p0}, Landroidx/compose/ui/platform/InspectableValue$-CC;->$default$getValueOverride(Landroidx/compose/ui/platform/InspectableValue;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
