.class public final synthetic Landroidx/compose/ui/graphics/Path$-CC;
.super Ljava/lang/Object;
.source "Path.kt"


# direct methods
.method public static $default$arcToRad(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;FFZ)V
    .locals 2
    .param p0, "_this"    # Landroidx/compose/ui/graphics/Path;
    .param p1, "rect"    # Landroidx/compose/ui/geometry/Rect;
    .param p2, "startAngleRadians"    # F
    .param p3, "sweepAngleRadians"    # F
    .param p4, "forceMoveTo"    # Z

    .line 0
    const-string/jumbo v0, "rect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    invoke-static {p2}, Landroidx/compose/ui/graphics/DegreesKt;->degrees(F)F

    move-result v0

    invoke-static {p3}, Landroidx/compose/ui/graphics/DegreesKt;->degrees(F)F

    move-result v1

    invoke-interface {p0, p1, v0, v1, p4}, Landroidx/compose/ui/graphics/Path;->arcTo(Landroidx/compose/ui/geometry/Rect;FFZ)V

    .line 130
    return-void
.end method

.method public static $default$rewind(Landroidx/compose/ui/graphics/Path;)V
    .locals 0
    .param p0, "_this"    # Landroidx/compose/ui/graphics/Path;

    .line 227
    invoke-interface {p0}, Landroidx/compose/ui/graphics/Path;->reset()V

    .line 228
    return-void
.end method

.method public static $default$transform-58bKbWc(Landroidx/compose/ui/graphics/Path;[F)V
    .locals 1
    .param p0, "_this"    # Landroidx/compose/ui/graphics/Path;
    .param p1, "matrix"    # [F

    .line 0
    const-string/jumbo v0, "matrix"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    return-void
.end method

.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/compose/ui/graphics/Path;->Companion:Landroidx/compose/ui/graphics/Path$Companion;

    return-void
.end method

.method public static synthetic access$arcToRad$jd(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;FFZ)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/graphics/Path;
    .param p1, "rect"    # Landroidx/compose/ui/geometry/Rect;
    .param p2, "startAngleRadians"    # F
    .param p3, "sweepAngleRadians"    # F
    .param p4, "forceMoveTo"    # Z

    .line 26
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/ui/graphics/Path$-CC;->$default$arcToRad(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;FFZ)V

    return-void
.end method

.method public static synthetic access$rewind$jd(Landroidx/compose/ui/graphics/Path;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/graphics/Path;

    .line 26
    invoke-static {p0}, Landroidx/compose/ui/graphics/Path$-CC;->$default$rewind(Landroidx/compose/ui/graphics/Path;)V

    return-void
.end method

.method public static synthetic access$transform-58bKbWc$jd(Landroidx/compose/ui/graphics/Path;[F)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/graphics/Path;
    .param p1, "matrix"    # [F

    .line 26
    invoke-static {p0, p1}, Landroidx/compose/ui/graphics/Path$-CC;->$default$transform-58bKbWc(Landroidx/compose/ui/graphics/Path;[F)V

    return-void
.end method

.method public static synthetic addPath-Uv8p0NA$default(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;JILjava/lang/Object;)V
    .locals 0

    .line 205
    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    sget-object p2, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    invoke-virtual {p2}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    move-result-wide p2

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Landroidx/compose/ui/graphics/Path;->addPath-Uv8p0NA(Landroidx/compose/ui/graphics/Path;J)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
