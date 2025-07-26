.class public final synthetic Landroidx/compose/ui/input/pointer/PointerInputScope$-CC;
.super Ljava/lang/Object;
.source "SuspendingPointerInputFilter.kt"


# direct methods
.method public static $default$getExtendedTouchPadding-NH-jbRc(Landroidx/compose/ui/input/pointer/PointerInputScope;)J
    .locals 2
    .param p0, "_this"    # Landroidx/compose/ui/input/pointer/PointerInputScope;

    .line 144
    sget-object v0, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Size$Companion;->getZero-NH-jbRc()J

    move-result-wide v0

    return-wide v0
.end method

.method public static $default$getInterceptOutOfBoundsChildEvents(Landroidx/compose/ui/input/pointer/PointerInputScope;)Z
    .locals 1
    .param p0, "_this"    # Landroidx/compose/ui/input/pointer/PointerInputScope;

    .line 161
    const/4 v0, 0x0

    return v0
.end method

.method public static $default$setInterceptOutOfBoundsChildEvents(Landroidx/compose/ui/input/pointer/PointerInputScope;Z)V
    .locals 0
    .param p0, "_this"    # Landroidx/compose/ui/input/pointer/PointerInputScope;

    .line 162
    return-void
.end method

.method public static synthetic access$getExtendedTouchPadding-NH-jbRc$jd(Landroidx/compose/ui/input/pointer/PointerInputScope;)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/input/pointer/PointerInputScope;

    .line 130
    invoke-static {p0}, Landroidx/compose/ui/input/pointer/PointerInputScope$-CC;->$default$getExtendedTouchPadding-NH-jbRc(Landroidx/compose/ui/input/pointer/PointerInputScope;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$getInterceptOutOfBoundsChildEvents$jd(Landroidx/compose/ui/input/pointer/PointerInputScope;)Z
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/input/pointer/PointerInputScope;

    .line 130
    invoke-static {p0}, Landroidx/compose/ui/input/pointer/PointerInputScope$-CC;->$default$getInterceptOutOfBoundsChildEvents(Landroidx/compose/ui/input/pointer/PointerInputScope;)Z

    move-result v0

    return v0
.end method

.method public static synthetic access$roundToPx--R2X_6o$jd(Landroidx/compose/ui/input/pointer/PointerInputScope;J)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/input/pointer/PointerInputScope;
    .param p1, "$receiver"    # J

    .line 130
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$roundToPx--R2X_6o(Landroidx/compose/ui/unit/Density;J)I

    move-result v0

    return v0
.end method

.method public static synthetic access$roundToPx-0680j_4$jd(Landroidx/compose/ui/input/pointer/PointerInputScope;F)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/input/pointer/PointerInputScope;
    .param p1, "$receiver"    # F

    .line 130
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$roundToPx-0680j_4(Landroidx/compose/ui/unit/Density;F)I

    move-result v0

    return v0
.end method

.method public static synthetic access$setInterceptOutOfBoundsChildEvents$jd(Landroidx/compose/ui/input/pointer/PointerInputScope;Z)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/input/pointer/PointerInputScope;
    .param p1, "<anonymous parameter 0>"    # Z

    .line 130
    invoke-static {p0, p1}, Landroidx/compose/ui/input/pointer/PointerInputScope$-CC;->$default$setInterceptOutOfBoundsChildEvents(Landroidx/compose/ui/input/pointer/PointerInputScope;Z)V

    return-void
.end method

.method public static synthetic access$toDp-GaN1DYA$jd(Landroidx/compose/ui/input/pointer/PointerInputScope;J)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/input/pointer/PointerInputScope;
    .param p1, "$receiver"    # J

    .line 130
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$toDp-GaN1DYA(Landroidx/compose/ui/unit/Density;J)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toDp-u2uoSUM$jd(Landroidx/compose/ui/input/pointer/PointerInputScope;F)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/input/pointer/PointerInputScope;
    .param p1, "$receiver"    # F

    .line 130
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toDp-u2uoSUM(Landroidx/compose/ui/unit/Density;F)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toDp-u2uoSUM$jd(Landroidx/compose/ui/input/pointer/PointerInputScope;I)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/input/pointer/PointerInputScope;
    .param p1, "$receiver"    # I

    .line 130
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toDp-u2uoSUM(Landroidx/compose/ui/unit/Density;I)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toDpSize-k-rfVVM$jd(Landroidx/compose/ui/input/pointer/PointerInputScope;J)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/input/pointer/PointerInputScope;
    .param p1, "$receiver"    # J

    .line 130
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$toDpSize-k-rfVVM(Landroidx/compose/ui/unit/Density;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$toPx--R2X_6o$jd(Landroidx/compose/ui/input/pointer/PointerInputScope;J)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/input/pointer/PointerInputScope;
    .param p1, "$receiver"    # J

    .line 130
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$toPx--R2X_6o(Landroidx/compose/ui/unit/Density;J)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toPx-0680j_4$jd(Landroidx/compose/ui/input/pointer/PointerInputScope;F)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/input/pointer/PointerInputScope;
    .param p1, "$receiver"    # F

    .line 130
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toPx-0680j_4(Landroidx/compose/ui/unit/Density;F)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toRect$jd(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/input/pointer/PointerInputScope;
    .param p1, "$receiver"    # Landroidx/compose/ui/unit/DpRect;

    .line 130
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toRect(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$toSize-XkaWNTQ$jd(Landroidx/compose/ui/input/pointer/PointerInputScope;J)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/input/pointer/PointerInputScope;
    .param p1, "$receiver"    # J

    .line 130
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$toSize-XkaWNTQ(Landroidx/compose/ui/unit/Density;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$toSp-0xMU5do$jd(Landroidx/compose/ui/input/pointer/PointerInputScope;F)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/input/pointer/PointerInputScope;
    .param p1, "$receiver"    # F

    .line 130
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toSp-0xMU5do(Landroidx/compose/ui/unit/Density;F)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$toSp-kPz2Gy4$jd(Landroidx/compose/ui/input/pointer/PointerInputScope;F)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/input/pointer/PointerInputScope;
    .param p1, "$receiver"    # F

    .line 130
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toSp-kPz2Gy4(Landroidx/compose/ui/unit/Density;F)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$toSp-kPz2Gy4$jd(Landroidx/compose/ui/input/pointer/PointerInputScope;I)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/input/pointer/PointerInputScope;
    .param p1, "$receiver"    # I

    .line 130
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toSp-kPz2Gy4(Landroidx/compose/ui/unit/Density;I)J

    move-result-wide v0

    return-wide v0
.end method
