.class public final synthetic Landroidx/compose/animation/core/Transition$Segment$-CC;
.super Ljava/lang/Object;
.source "Transition.kt"


# direct methods
.method public static $default$isTransitioningTo(Landroidx/compose/animation/core/Transition$Segment;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p0, "_this"    # Landroidx/compose/animation/core/Transition$Segment;
    .param p1, "$this$isTransitioningTo"    # Ljava/lang/Object;
    .param p2, "targetState"    # Ljava/lang/Object;

    .line 637
    invoke-interface {p0}, Landroidx/compose/animation/core/Transition$Segment;->getInitialState()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Landroidx/compose/animation/core/Transition$Segment;->getTargetState()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static synthetic access$isTransitioningTo$jd(Landroidx/compose/animation/core/Transition$Segment;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/animation/core/Transition$Segment;
    .param p1, "$receiver"    # Ljava/lang/Object;
    .param p2, "targetState"    # Ljava/lang/Object;

    .line 620
    invoke-static {p0, p1, p2}, Landroidx/compose/animation/core/Transition$Segment$-CC;->$default$isTransitioningTo(Landroidx/compose/animation/core/Transition$Segment;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
