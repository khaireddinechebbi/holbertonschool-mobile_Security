.class public final synthetic Landroidx/compose/ui/graphics/GraphicsLayerScope$-CC;
.super Ljava/lang/Object;
.source "GraphicsLayerScope.kt"


# direct methods
.method public static $default$getAmbientShadowColor-0d7_KjU(Landroidx/compose/ui/graphics/GraphicsLayerScope;)J
    .locals 2
    .param p0, "_this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;

    .line 96
    invoke-static {}, Landroidx/compose/ui/graphics/GraphicsLayerScopeKt;->getDefaultShadowColor()J

    move-result-wide v0

    return-wide v0
.end method

.method public static $default$getCompositingStrategy--NrFUSI(Landroidx/compose/ui/graphics/GraphicsLayerScope;)I
    .locals 1
    .param p0, "_this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;

    .line 206
    sget-object v0, Landroidx/compose/ui/graphics/CompositingStrategy;->Companion:Landroidx/compose/ui/graphics/CompositingStrategy$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/CompositingStrategy$Companion;->getAuto--NrFUSI()I

    move-result v0

    return v0
.end method

.method public static $default$getRenderEffect(Landroidx/compose/ui/graphics/GraphicsLayerScope;)Landroidx/compose/ui/graphics/RenderEffect;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;

    .line 198
    const/4 v0, 0x0

    return-object v0
.end method

.method public static $default$getSize-NH-jbRc(Landroidx/compose/ui/graphics/GraphicsLayerScope;)J
    .locals 2
    .param p0, "_this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;

    .line 217
    sget-object v0, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Size$Companion;->getUnspecified-NH-jbRc()J

    move-result-wide v0

    return-wide v0
.end method

.method public static $default$getSpotShadowColor-0d7_KjU(Landroidx/compose/ui/graphics/GraphicsLayerScope;)J
    .locals 2
    .param p0, "_this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;

    .line 117
    invoke-static {}, Landroidx/compose/ui/graphics/GraphicsLayerScopeKt;->getDefaultShadowColor()J

    move-result-wide v0

    return-wide v0
.end method

.method public static $default$setAmbientShadowColor-8_81llA(Landroidx/compose/ui/graphics/GraphicsLayerScope;J)V
    .locals 0
    .param p0, "_this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "ambientShadowColor"    # J

    .line 99
    return-void
.end method

.method public static $default$setCompositingStrategy-aDBOjCE(Landroidx/compose/ui/graphics/GraphicsLayerScope;I)V
    .locals 0
    .param p0, "_this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "compositingStrategy"    # I

    .line 209
    return-void
.end method

.method public static $default$setRenderEffect(Landroidx/compose/ui/graphics/GraphicsLayerScope;Landroidx/compose/ui/graphics/RenderEffect;)V
    .locals 0
    .param p0, "_this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;

    .line 199
    return-void
.end method

.method public static $default$setSpotShadowColor-8_81llA(Landroidx/compose/ui/graphics/GraphicsLayerScope;J)V
    .locals 0
    .param p0, "_this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "spotShadowColor"    # J

    .line 120
    return-void
.end method

.method public static synthetic access$getAmbientShadowColor-0d7_KjU$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;

    .line 38
    invoke-static {p0}, Landroidx/compose/ui/graphics/GraphicsLayerScope$-CC;->$default$getAmbientShadowColor-0d7_KjU(Landroidx/compose/ui/graphics/GraphicsLayerScope;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$getCompositingStrategy--NrFUSI$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;

    .line 38
    invoke-static {p0}, Landroidx/compose/ui/graphics/GraphicsLayerScope$-CC;->$default$getCompositingStrategy--NrFUSI(Landroidx/compose/ui/graphics/GraphicsLayerScope;)I

    move-result v0

    return v0
.end method

.method public static synthetic access$getRenderEffect$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;)Landroidx/compose/ui/graphics/RenderEffect;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;

    .line 38
    invoke-static {p0}, Landroidx/compose/ui/graphics/GraphicsLayerScope$-CC;->$default$getRenderEffect(Landroidx/compose/ui/graphics/GraphicsLayerScope;)Landroidx/compose/ui/graphics/RenderEffect;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$getSize-NH-jbRc$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;

    .line 38
    invoke-static {p0}, Landroidx/compose/ui/graphics/GraphicsLayerScope$-CC;->$default$getSize-NH-jbRc(Landroidx/compose/ui/graphics/GraphicsLayerScope;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$getSpotShadowColor-0d7_KjU$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;

    .line 38
    invoke-static {p0}, Landroidx/compose/ui/graphics/GraphicsLayerScope$-CC;->$default$getSpotShadowColor-0d7_KjU(Landroidx/compose/ui/graphics/GraphicsLayerScope;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$roundToPx--R2X_6o$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;J)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "$receiver"    # J

    .line 38
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$roundToPx--R2X_6o(Landroidx/compose/ui/unit/Density;J)I

    move-result v0

    return v0
.end method

.method public static synthetic access$roundToPx-0680j_4$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;F)I
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "$receiver"    # F

    .line 38
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$roundToPx-0680j_4(Landroidx/compose/ui/unit/Density;F)I

    move-result v0

    return v0
.end method

.method public static synthetic access$setAmbientShadowColor-8_81llA$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;J)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "ambientShadowColor"    # J

    .line 38
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/graphics/GraphicsLayerScope$-CC;->$default$setAmbientShadowColor-8_81llA(Landroidx/compose/ui/graphics/GraphicsLayerScope;J)V

    return-void
.end method

.method public static synthetic access$setCompositingStrategy-aDBOjCE$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;I)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "compositingStrategy"    # I

    .line 38
    invoke-static {p0, p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope$-CC;->$default$setCompositingStrategy-aDBOjCE(Landroidx/compose/ui/graphics/GraphicsLayerScope;I)V

    return-void
.end method

.method public static synthetic access$setRenderEffect$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;Landroidx/compose/ui/graphics/RenderEffect;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "<anonymous parameter 0>"    # Landroidx/compose/ui/graphics/RenderEffect;

    .line 38
    invoke-static {p0, p1}, Landroidx/compose/ui/graphics/GraphicsLayerScope$-CC;->$default$setRenderEffect(Landroidx/compose/ui/graphics/GraphicsLayerScope;Landroidx/compose/ui/graphics/RenderEffect;)V

    return-void
.end method

.method public static synthetic access$setSpotShadowColor-8_81llA$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;J)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "spotShadowColor"    # J

    .line 38
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/graphics/GraphicsLayerScope$-CC;->$default$setSpotShadowColor-8_81llA(Landroidx/compose/ui/graphics/GraphicsLayerScope;J)V

    return-void
.end method

.method public static synthetic access$toDp-GaN1DYA$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;J)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "$receiver"    # J

    .line 38
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$toDp-GaN1DYA(Landroidx/compose/ui/unit/Density;J)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toDp-u2uoSUM$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;F)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "$receiver"    # F

    .line 38
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toDp-u2uoSUM(Landroidx/compose/ui/unit/Density;F)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toDp-u2uoSUM$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;I)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "$receiver"    # I

    .line 38
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toDp-u2uoSUM(Landroidx/compose/ui/unit/Density;I)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toDpSize-k-rfVVM$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;J)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "$receiver"    # J

    .line 38
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$toDpSize-k-rfVVM(Landroidx/compose/ui/unit/Density;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$toPx--R2X_6o$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;J)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "$receiver"    # J

    .line 38
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$toPx--R2X_6o(Landroidx/compose/ui/unit/Density;J)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toPx-0680j_4$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;F)F
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "$receiver"    # F

    .line 38
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toPx-0680j_4(Landroidx/compose/ui/unit/Density;F)F

    move-result v0

    return v0
.end method

.method public static synthetic access$toRect$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;
    .locals 1
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "$receiver"    # Landroidx/compose/ui/unit/DpRect;

    .line 38
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toRect(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$toSize-XkaWNTQ$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;J)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "$receiver"    # J

    .line 38
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/unit/Density$-CC;->$default$toSize-XkaWNTQ(Landroidx/compose/ui/unit/Density;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$toSp-0xMU5do$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;F)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "$receiver"    # F

    .line 38
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toSp-0xMU5do(Landroidx/compose/ui/unit/Density;F)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$toSp-kPz2Gy4$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;F)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "$receiver"    # F

    .line 38
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toSp-kPz2Gy4(Landroidx/compose/ui/unit/Density;F)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$toSp-kPz2Gy4$jd(Landroidx/compose/ui/graphics/GraphicsLayerScope;I)J
    .locals 2
    .param p0, "$this"    # Landroidx/compose/ui/graphics/GraphicsLayerScope;
    .param p1, "$receiver"    # I

    .line 38
    invoke-static {p0, p1}, Landroidx/compose/ui/unit/Density$-CC;->$default$toSp-kPz2Gy4(Landroidx/compose/ui/unit/Density;I)J

    move-result-wide v0

    return-wide v0
.end method
