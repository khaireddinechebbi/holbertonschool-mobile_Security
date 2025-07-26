.class public final synthetic Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec$-CC;
.super Ljava/lang/Object;
.source "VectorizedAnimationSpec.kt"


# direct methods
.method public static $default$isInfinite(Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;)Z
    .locals 1
    .param p0, "_this"    # Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;

    .line 164
    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic access$getEndVelocity$jd(Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;
    .param p1, "initialValue"    # Landroidx/compose/animation/core/AnimationVector;
    .param p2, "targetValue"    # Landroidx/compose/animation/core/AnimationVector;
    .param p3, "initialVelocity"    # Landroidx/compose/animation/core/AnimationVector;

    .line 162
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/core/VectorizedAnimationSpec$-CC;->$default$getEndVelocity(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$isInfinite$jd(Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;

    .line 162
    invoke-static {p0}, Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec$-CC;->$default$isInfinite(Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;)Z

    move-result v0

    return v0
.end method
