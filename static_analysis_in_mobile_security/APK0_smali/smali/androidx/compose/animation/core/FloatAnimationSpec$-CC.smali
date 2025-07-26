.class public final synthetic Landroidx/compose/animation/core/FloatAnimationSpec$-CC;
.super Ljava/lang/Object;
.source "FloatAnimationSpec.kt"


# direct methods
.method public static $default$getEndVelocity(Landroidx/compose/animation/core/FloatAnimationSpec;FFF)F
    .locals 6
    .param p0, "_this"    # Landroidx/compose/animation/core/FloatAnimationSpec;
    .param p1, "initialValue"    # F
    .param p2, "targetValue"    # F
    .param p3, "initialVelocity"    # F

    .line 85
    nop

    .line 86
    invoke-interface {p0, p1, p2, p3}, Landroidx/compose/animation/core/FloatAnimationSpec;->getDurationNanos(FFF)J

    move-result-wide v1

    .line 87
    nop

    .line 88
    nop

    .line 89
    nop

    .line 85
    move-object v0, p0

    move v3, p1

    move v4, p2

    move v5, p3

    invoke-interface/range {v0 .. v5}, Landroidx/compose/animation/core/FloatAnimationSpec;->getVelocityFromNanos(JFFF)F

    move-result v0

    .line 90
    return v0
.end method

.method public static bridge synthetic $default$vectorize(Landroidx/compose/animation/core/FloatAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedAnimationSpec;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/animation/core/FloatAnimationSpec;
    .param p1, "converter"    # Landroidx/compose/animation/core/TwoWayConverter;

    .line 36
    invoke-interface {p0, p1}, Landroidx/compose/animation/core/FloatAnimationSpec;->vectorize(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;

    move-result-object v0

    check-cast v0, Landroidx/compose/animation/core/VectorizedAnimationSpec;

    return-object v0
.end method

.method public static $default$vectorize(Landroidx/compose/animation/core/FloatAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/animation/core/FloatAnimationSpec;
    .param p1, "converter"    # Landroidx/compose/animation/core/TwoWayConverter;

    .line 0
    const-string v0, "converter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    new-instance v0, Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;

    invoke-direct {v0, p0}, Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;-><init>(Landroidx/compose/animation/core/FloatAnimationSpec;)V

    return-object v0
.end method

.method public static synthetic access$getEndVelocity$jd(Landroidx/compose/animation/core/FloatAnimationSpec;FFF)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/animation/core/FloatAnimationSpec;
    .param p1, "initialValue"    # F
    .param p2, "targetValue"    # F
    .param p3, "initialVelocity"    # F

    .line 36
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/core/FloatAnimationSpec$-CC;->$default$getEndVelocity(Landroidx/compose/animation/core/FloatAnimationSpec;FFF)F

    move-result v0

    return v0
.end method

.method public static synthetic access$vectorize$jd(Landroidx/compose/animation/core/FloatAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/animation/core/FloatAnimationSpec;
    .param p1, "converter"    # Landroidx/compose/animation/core/TwoWayConverter;

    .line 36
    invoke-static {p0, p1}, Landroidx/compose/animation/core/FloatAnimationSpec$-CC;->$default$vectorize(Landroidx/compose/animation/core/FloatAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;

    move-result-object v0

    return-object v0
.end method
