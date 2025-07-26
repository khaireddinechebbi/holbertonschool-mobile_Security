.class public final synthetic Landroidx/compose/animation/core/Animation$-CC;
.super Ljava/lang/Object;
.source "Animation.kt"


# direct methods
.method public static $default$isFinishedFromNanos(Landroidx/compose/animation/core/Animation;J)Z
    .locals 3
    .param p0, "_this"    # Landroidx/compose/animation/core/Animation;
    .param p1, "playTimeNanos"    # J

    .line 85
    invoke-interface {p0}, Landroidx/compose/animation/core/Animation;->getDurationNanos()J

    move-result-wide v0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static synthetic access$isFinishedFromNanos$jd(Landroidx/compose/animation/core/Animation;J)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/animation/core/Animation;
    .param p1, "playTimeNanos"    # J

    .line 38
    invoke-static {p0, p1, p2}, Landroidx/compose/animation/core/Animation$-CC;->$default$isFinishedFromNanos(Landroidx/compose/animation/core/Animation;J)Z

    move-result v0

    return v0
.end method
