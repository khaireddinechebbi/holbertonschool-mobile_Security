.class public final Landroidx/compose/animation/core/SpringSimulation;
.super Ljava/lang/Object;
.source "SpringSimulation.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003J\u0008\u0010\u0019\u001a\u00020\u001aH\u0002J0\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\n\"\u0004\u0008\r\u0010\u0004R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0014\u0010\n\"\u0004\u0008\u0015\u0010\u0004\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006!"
    }
    d2 = {
        "Landroidx/compose/animation/core/SpringSimulation;",
        "",
        "finalPosition",
        "",
        "(F)V",
        "dampedFreq",
        "",
        "value",
        "dampingRatio",
        "getDampingRatio",
        "()F",
        "setDampingRatio",
        "getFinalPosition",
        "setFinalPosition",
        "gammaMinus",
        "gammaPlus",
        "initialized",
        "",
        "naturalFreq",
        "stiffness",
        "getStiffness",
        "setStiffness",
        "getAcceleration",
        "lastDisplacement",
        "lastVelocity",
        "init",
        "",
        "updateValues",
        "Landroidx/compose/animation/core/Motion;",
        "timeElapsed",
        "",
        "updateValues-IJZedt4$animation_core_release",
        "(FFJ)J",
        "animation-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private dampedFreq:D

.field private dampingRatio:F

.field private finalPosition:F

.field private gammaMinus:D

.field private gammaPlus:D

.field private initialized:Z

.field private naturalFreq:D


# direct methods
.method public constructor <init>(F)V
    .locals 2
    .param p1, "finalPosition"    # F

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    .line 71
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    .line 102
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    .line 68
    return-void
.end method

.method private final init()V
    .locals 11

    .line 131
    iget-boolean v0, p0, Landroidx/compose/animation/core/SpringSimulation;->initialized:Z

    if-eqz v0, :cond_0

    .line 132
    return-void

    .line 135
    :cond_0
    iget v0, p0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    invoke-static {}, Landroidx/compose/animation/core/SpringSimulationKt;->getUNSET()F

    move-result v1

    const/4 v2, 0x1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_4

    .line 141
    iget v0, p0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    float-to-double v3, v0

    float-to-double v5, v0

    mul-double v3, v3, v5

    .line 142
    .local v3, "dampingRatioSquared":D
    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v5, v0, v1

    if-lez v5, :cond_2

    .line 144
    nop

    .line 145
    neg-float v0, v0

    float-to-double v0, v0

    iget-wide v5, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    mul-double v0, v0, v5

    int-to-double v7, v2

    sub-double v9, v3, v7

    invoke-static {v9, v10}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v9

    mul-double v5, v5, v9

    add-double/2addr v0, v5

    .line 144
    iput-wide v0, p0, Landroidx/compose/animation/core/SpringSimulation;->gammaPlus:D

    .line 146
    nop

    .line 147
    iget v0, p0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    neg-float v0, v0

    float-to-double v0, v0

    iget-wide v5, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    mul-double v0, v0, v5

    sub-double v7, v3, v7

    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v7

    mul-double v5, v5, v7

    sub-double/2addr v0, v5

    .line 146
    iput-wide v0, p0, Landroidx/compose/animation/core/SpringSimulation;->gammaMinus:D

    goto :goto_1

    .line 148
    :cond_2
    const/4 v5, 0x0

    cmpl-float v5, v0, v5

    if-ltz v5, :cond_3

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    .line 150
    iget-wide v0, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    int-to-double v5, v2

    sub-double/2addr v5, v3

    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v5

    mul-double v0, v0, v5

    iput-wide v0, p0, Landroidx/compose/animation/core/SpringSimulation;->dampedFreq:D

    .line 153
    :cond_3
    :goto_1
    iput-boolean v2, p0, Landroidx/compose/animation/core/SpringSimulation;->initialized:Z

    .line 154
    return-void

    .line 136
    .end local v3    # "dampingRatioSquared":D
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 137
    nop

    .line 136
    const-string v1, "Error: Final position of the spring must be set before the animation starts"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final getAcceleration(FF)F
    .locals 9
    .param p1, "lastDisplacement"    # F
    .param p2, "lastVelocity"    # F

    .line 115
    iget v0, p0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    sub-float v0, p1, v0

    .line 117
    .local v0, "adjustedDisplacement":F
    iget-wide v1, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    mul-double v3, v1, v1

    .line 118
    .local v3, "k":D
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    mul-double v1, v1, v5

    iget v5, p0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    float-to-double v5, v5

    mul-double v1, v1, v5

    .line 120
    .local v1, "c":D
    neg-double v5, v3

    float-to-double v7, v0

    mul-double v5, v5, v7

    float-to-double v7, p2

    mul-double v7, v7, v1

    sub-double/2addr v5, v7

    double-to-float v5, v5

    return v5
.end method

.method public final getDampingRatio()F
    .locals 1

    .line 102
    iget v0, p0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    return v0
.end method

.method public final getFinalPosition()F
    .locals 1

    .line 68
    iget v0, p0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    return v0
.end method

.method public final getStiffness()F
    .locals 2

    .line 94
    iget-wide v0, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    mul-double v0, v0, v0

    double-to-float v0, v0

    return v0
.end method

.method public final setDampingRatio(F)V
    .locals 2
    .param p1, "value"    # F

    .line 104
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_0

    .line 107
    iput p1, p0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    .line 109
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/animation/core/SpringSimulation;->initialized:Z

    .line 110
    return-void

    .line 105
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Damping ratio must be non-negative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final setFinalPosition(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 68
    iput p1, p0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    return-void
.end method

.method public final setStiffness(F)V
    .locals 2
    .param p1, "value"    # F

    .line 86
    invoke-virtual {p0}, Landroidx/compose/animation/core/SpringSimulation;->getStiffness()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-lez v0, :cond_0

    .line 89
    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    .line 91
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/animation/core/SpringSimulation;->initialized:Z

    .line 92
    return-void

    .line 87
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Spring stiffness constant must be positive."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final updateValues-IJZedt4$animation_core_release(FFJ)J
    .locals 23
    .param p1, "lastDisplacement"    # F
    .param p2, "lastVelocity"    # F
    .param p3, "timeElapsed"    # J

    .line 162
    move-object/from16 v0, p0

    move/from16 v1, p2

    invoke-direct/range {p0 .. p0}, Landroidx/compose/animation/core/SpringSimulation;->init()V

    .line 164
    iget v2, v0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    sub-float v2, p1, v2

    .line 165
    .local v2, "adjustedDisplacement":F
    move-wide/from16 v3, p3

    long-to-double v5, v3

    const-wide v7, 0x408f400000000000L    # 1000.0

    div-double/2addr v5, v7

    .local v5, "deltaT":D
    const-wide/16 v7, 0x0

    .local v7, "displacement":D
    const-wide/16 v9, 0x0

    .line 168
    .local v9, "currentVelocity":D
    iget v11, v0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    const/high16 v12, 0x3f800000    # 1.0f

    cmpl-float v13, v11, v12

    if-lez v13, :cond_0

    .line 172
    float-to-double v11, v2

    .line 173
    iget-wide v13, v0, Landroidx/compose/animation/core/SpringSimulation;->gammaMinus:D

    float-to-double v3, v2

    mul-double v3, v3, v13

    move-wide v15, v7

    .end local v7    # "displacement":D
    .local v15, "displacement":D
    float-to-double v7, v1

    sub-double/2addr v3, v7

    .line 174
    iget-wide v7, v0, Landroidx/compose/animation/core/SpringSimulation;->gammaPlus:D

    sub-double v17, v13, v7

    .line 173
    div-double v3, v3, v17

    .line 172
    sub-double/2addr v11, v3

    .line 170
    move-wide v3, v11

    .line 178
    .local v3, "coeffA":D
    float-to-double v11, v2

    mul-double v11, v11, v13

    move-wide/from16 v17, v9

    .end local v9    # "currentVelocity":D
    .local v17, "currentVelocity":D
    float-to-double v9, v1

    sub-double/2addr v11, v9

    .line 179
    sub-double v7, v13, v7

    .line 178
    div-double/2addr v11, v7

    .line 177
    move-wide v7, v11

    .line 182
    .local v7, "coeffB":D
    mul-double v13, v13, v5

    invoke-static {v13, v14}, Ljava/lang/Math;->exp(D)D

    move-result-wide v9

    mul-double v9, v9, v3

    .line 183
    iget-wide v11, v0, Landroidx/compose/animation/core/SpringSimulation;->gammaPlus:D

    mul-double v11, v11, v5

    invoke-static {v11, v12}, Ljava/lang/Math;->exp(D)D

    move-result-wide v11

    mul-double v11, v11, v7

    .line 182
    add-double/2addr v9, v11

    .line 181
    nop

    .line 186
    .end local v15    # "displacement":D
    .local v9, "displacement":D
    iget-wide v11, v0, Landroidx/compose/animation/core/SpringSimulation;->gammaMinus:D

    mul-double v13, v3, v11

    mul-double v11, v11, v5

    invoke-static {v11, v12}, Ljava/lang/Math;->exp(D)D

    move-result-wide v11

    mul-double v13, v13, v11

    .line 187
    iget-wide v11, v0, Landroidx/compose/animation/core/SpringSimulation;->gammaPlus:D

    mul-double v15, v7, v11

    mul-double v11, v11, v5

    invoke-static {v11, v12}, Ljava/lang/Math;->exp(D)D

    move-result-wide v11

    mul-double v15, v15, v11

    .line 186
    add-double/2addr v13, v15

    .line 185
    move-wide v3, v13

    move v15, v2

    .end local v7    # "coeffB":D
    .end local v17    # "currentVelocity":D
    .local v3, "currentVelocity":D
    goto/16 :goto_1

    .line 189
    .end local v3    # "currentVelocity":D
    .local v7, "displacement":D
    .local v9, "currentVelocity":D
    :cond_0
    move-wide v15, v7

    move-wide/from16 v17, v9

    .end local v7    # "displacement":D
    .end local v9    # "currentVelocity":D
    .restart local v15    # "displacement":D
    .restart local v17    # "currentVelocity":D
    const/4 v3, 0x1

    cmpg-float v4, v11, v12

    if-nez v4, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_2

    .line 191
    move v3, v2

    .line 192
    .local v3, "coeffA":F
    float-to-double v7, v1

    iget-wide v9, v0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    float-to-double v11, v2

    mul-double v11, v11, v9

    add-double/2addr v7, v11

    .line 193
    .local v7, "coeffB":D
    float-to-double v11, v3

    mul-double v13, v7, v5

    add-double/2addr v11, v13

    neg-double v9, v9

    mul-double v9, v9, v5

    invoke-static {v9, v10}, Ljava/lang/Math;->exp(D)D

    move-result-wide v9

    mul-double v9, v9, v11

    .line 196
    .end local v15    # "displacement":D
    .local v9, "displacement":D
    nop

    .line 197
    float-to-double v11, v3

    mul-double v13, v7, v5

    add-double/2addr v11, v13

    iget-wide v13, v0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    neg-double v13, v13

    mul-double v13, v13, v5

    invoke-static {v13, v14}, Ljava/lang/Math;->exp(D)D

    move-result-wide v13

    mul-double v11, v11, v13

    .line 198
    iget-wide v13, v0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    move/from16 v19, v3

    .end local v3    # "coeffA":F
    .local v19, "coeffA":F
    neg-double v3, v13

    .line 197
    mul-double v11, v11, v3

    .line 199
    neg-double v3, v13

    mul-double v3, v3, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->exp(D)D

    move-result-wide v3

    mul-double v3, v3, v7

    .line 196
    add-double/2addr v11, v3

    .line 194
    move-wide v3, v11

    move v15, v2

    .end local v7    # "coeffB":D
    .end local v17    # "currentVelocity":D
    .end local v19    # "coeffA":F
    .local v3, "currentVelocity":D
    goto/16 :goto_1

    .line 203
    .end local v3    # "currentVelocity":D
    .end local v9    # "displacement":D
    .restart local v15    # "displacement":D
    .restart local v17    # "currentVelocity":D
    :cond_2
    move v4, v2

    .line 206
    .local v4, "cosCoeff":F
    int-to-double v7, v3

    iget-wide v9, v0, Landroidx/compose/animation/core/SpringSimulation;->dampedFreq:D

    div-double/2addr v7, v9

    .line 208
    float-to-double v9, v11

    iget-wide v12, v0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    mul-double v9, v9, v12

    move-wide/from16 v19, v15

    .end local v15    # "displacement":D
    .local v19, "displacement":D
    float-to-double v14, v2

    mul-double v9, v9, v14

    .line 209
    float-to-double v14, v1

    .line 208
    add-double/2addr v9, v14

    .line 206
    mul-double v7, v7, v9

    .line 204
    nop

    .line 214
    .local v7, "sinCoeff":D
    neg-float v3, v11

    float-to-double v9, v3

    mul-double v9, v9, v12

    mul-double v9, v9, v5

    invoke-static {v9, v10}, Ljava/lang/Math;->exp(D)D

    move-result-wide v9

    .line 217
    float-to-double v11, v4

    iget-wide v13, v0, Landroidx/compose/animation/core/SpringSimulation;->dampedFreq:D

    mul-double v13, v13, v5

    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    move-result-wide v13

    mul-double v11, v11, v13

    .line 218
    iget-wide v13, v0, Landroidx/compose/animation/core/SpringSimulation;->dampedFreq:D

    mul-double v13, v13, v5

    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    move-result-wide v13

    mul-double v13, v13, v7

    .line 217
    add-double/2addr v11, v13

    .line 214
    mul-double v9, v9, v11

    .line 213
    nop

    .line 223
    .end local v19    # "displacement":D
    .restart local v9    # "displacement":D
    iget-wide v11, v0, Landroidx/compose/animation/core/SpringSimulation;->naturalFreq:D

    neg-double v13, v11

    mul-double v13, v13, v9

    iget v3, v0, Landroidx/compose/animation/core/SpringSimulation;->dampingRatio:F

    move v15, v2

    .end local v2    # "adjustedDisplacement":F
    .local v15, "adjustedDisplacement":F
    float-to-double v1, v3

    mul-double v13, v13, v1

    .line 224
    nop

    .line 225
    neg-float v1, v3

    float-to-double v1, v1

    mul-double v1, v1, v11

    mul-double v1, v1, v5

    invoke-static {v1, v2}, Ljava/lang/Math;->exp(D)D

    move-result-wide v1

    .line 228
    iget-wide v11, v0, Landroidx/compose/animation/core/SpringSimulation;->dampedFreq:D

    move-wide/from16 v19, v9

    .end local v9    # "displacement":D
    .restart local v19    # "displacement":D
    neg-double v9, v11

    move-wide/from16 v21, v13

    float-to-double v13, v4

    mul-double v9, v9, v13

    .line 229
    mul-double v11, v11, v5

    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v11

    .line 228
    mul-double v9, v9, v11

    .line 229
    iget-wide v11, v0, Landroidx/compose/animation/core/SpringSimulation;->dampedFreq:D

    mul-double v13, v11, v7

    .line 230
    mul-double v11, v11, v5

    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v11

    .line 229
    mul-double v13, v13, v11

    .line 228
    add-double/2addr v9, v13

    .line 224
    mul-double v1, v1, v9

    .line 223
    add-double v13, v21, v1

    .line 222
    move-wide v1, v13

    move-wide v3, v1

    move-wide/from16 v9, v19

    .line 237
    .end local v4    # "cosCoeff":F
    .end local v7    # "sinCoeff":D
    .end local v17    # "currentVelocity":D
    .end local v19    # "displacement":D
    .restart local v3    # "currentVelocity":D
    .restart local v9    # "displacement":D
    :goto_1
    iget v1, v0, Landroidx/compose/animation/core/SpringSimulation;->finalPosition:F

    float-to-double v1, v1

    add-double/2addr v1, v9

    double-to-float v1, v1

    .line 238
    .local v1, "newValue":F
    double-to-float v2, v3

    .line 240
    .local v2, "newVelocity":F
    invoke-static {v1, v2}, Landroidx/compose/animation/core/SpringSimulationKt;->Motion(FF)J

    move-result-wide v7

    return-wide v7
.end method
