.class public final synthetic Landroidx/compose/ui/text/font/PlatformResolveInterceptor$-CC;
.super Ljava/lang/Object;
.source "FontFamilyResolver.kt"


# direct methods
.method public static $default$interceptFontFamily(Landroidx/compose/ui/text/font/PlatformResolveInterceptor;Landroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/font/FontFamily;
    .locals 0
    .param p0, "_this"    # Landroidx/compose/ui/text/font/PlatformResolveInterceptor;
    .param p1, "fontFamily"    # Landroidx/compose/ui/text/font/FontFamily;

    .line 116
    return-object p1
.end method

.method public static $default$interceptFontStyle-T2F_aPo(Landroidx/compose/ui/text/font/PlatformResolveInterceptor;I)I
    .locals 0
    .param p0, "_this"    # Landroidx/compose/ui/text/font/PlatformResolveInterceptor;
    .param p1, "fontStyle"    # I

    .line 120
    return p1
.end method

.method public static $default$interceptFontSynthesis-Mscr08Y(Landroidx/compose/ui/text/font/PlatformResolveInterceptor;I)I
    .locals 0
    .param p0, "_this"    # Landroidx/compose/ui/text/font/PlatformResolveInterceptor;
    .param p1, "fontSynthesis"    # I

    .line 122
    return p1
.end method

.method public static $default$interceptFontWeight(Landroidx/compose/ui/text/font/PlatformResolveInterceptor;Landroidx/compose/ui/text/font/FontWeight;)Landroidx/compose/ui/text/font/FontWeight;
    .locals 1
    .param p0, "_this"    # Landroidx/compose/ui/text/font/PlatformResolveInterceptor;
    .param p1, "fontWeight"    # Landroidx/compose/ui/text/font/FontWeight;

    .line 0
    const-string v0, "fontWeight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    return-object p1
.end method
