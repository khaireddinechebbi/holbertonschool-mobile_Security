.class final Landroidx/compose/animation/core/EasingFunctionsKt$EaseInOutElastic$1;
.super Ljava/lang/Object;
.source "EasingFunctions.kt"

# interfaces
.implements Landroidx/compose/animation/core/Easing;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/animation/core/EasingFunctionsKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"
    }
    d2 = {
        "",
        "fraction",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/animation/core/EasingFunctionsKt$EaseInOutElastic$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/animation/core/EasingFunctionsKt$EaseInOutElastic$1;

    invoke-direct {v0}, Landroidx/compose/animation/core/EasingFunctionsKt$EaseInOutElastic$1;-><init>()V

    sput-object v0, Landroidx/compose/animation/core/EasingFunctionsKt$EaseInOutElastic$1;->INSTANCE:Landroidx/compose/animation/core/EasingFunctionsKt$EaseInOutElastic$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final transform(F)F
    .locals 12
    .param p1, "fraction"    # F

    .line 207
    const-wide v0, 0x3ff657184ae74487L    # 1.3962634015954636

    .line 208
    .local v0, "c5":D
    nop

    .line 209
    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    cmpg-float v5, p1, v4

    if-nez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_1

    goto :goto_3

    .line 210
    :cond_1
    const/high16 v5, 0x3f800000    # 1.0f

    cmpg-float v6, p1, v5

    if-nez v6, :cond_2

    const/4 v6, 0x1

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    if-eqz v6, :cond_3

    const/high16 v4, 0x3f800000    # 1.0f

    goto :goto_3

    .line 211
    :cond_3
    cmpg-float v4, v4, p1

    if-gtz v4, :cond_4

    const/high16 v4, 0x3f000000    # 0.5f

    cmpg-float v4, p1, v4

    if-gtz v4, :cond_4

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    :goto_2
    const/high16 v3, 0x41320000    # 11.125f

    const/high16 v4, 0x41200000    # 10.0f

    const/high16 v6, 0x40000000    # 2.0f

    const/high16 v7, 0x41a00000    # 20.0f

    if-eqz v2, :cond_5

    .line 212
    float-to-double v5, v6

    mul-float v2, p1, v7

    sub-float/2addr v2, v4

    float-to-double v8, v2

    invoke-static {v5, v6, v8, v9}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v8

    double-to-float v2, v8

    float-to-double v8, v2

    .line 213
    mul-float v7, v7, p1

    sub-float/2addr v7, v3

    float-to-double v2, v7

    mul-double v2, v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    .line 212
    mul-double v8, v8, v2

    neg-double v2, v8

    .line 213
    nop

    .line 212
    div-double/2addr v2, v5

    .line 213
    double-to-float v4, v2

    goto :goto_3

    .line 215
    :cond_5
    float-to-double v8, v6

    const/high16 v2, -0x3e600000    # -20.0f

    mul-float v2, v2, p1

    add-float/2addr v2, v4

    float-to-double v10, v2

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v10

    double-to-float v2, v10

    float-to-double v10, v2

    .line 216
    mul-float v7, v7, p1

    sub-float/2addr v7, v3

    float-to-double v2, v7

    mul-double v2, v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    .line 215
    mul-double v10, v10, v2

    .line 216
    nop

    .line 215
    div-double/2addr v10, v8

    .line 216
    double-to-float v2, v10

    .line 215
    add-float v4, v2, v5

    .line 208
    :goto_3
    return v4
.end method
