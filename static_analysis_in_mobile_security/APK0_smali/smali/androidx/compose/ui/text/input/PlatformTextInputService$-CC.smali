.class public final synthetic Landroidx/compose/ui/text/input/PlatformTextInputService$-CC;
.super Ljava/lang/Object;
.source "TextInputService.kt"


# direct methods
.method public static $default$notifyFocusedRect(Landroidx/compose/ui/text/input/PlatformTextInputService;Landroidx/compose/ui/geometry/Rect;)V
    .locals 1
    .param p0, "_this"    # Landroidx/compose/ui/text/input/PlatformTextInputService;
    .param p1, "rect"    # Landroidx/compose/ui/geometry/Rect;

    .line 0
    const-string/jumbo v0, "rect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 287
    return-void
.end method
