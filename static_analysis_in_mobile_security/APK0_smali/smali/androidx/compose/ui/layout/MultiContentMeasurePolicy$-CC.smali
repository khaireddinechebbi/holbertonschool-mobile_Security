.class public final synthetic Landroidx/compose/ui/layout/MultiContentMeasurePolicy$-CC;
.super Ljava/lang/Object;
.source "MultiContentMeasurePolicy.kt"


# direct methods
.method public static $default$maxIntrinsicHeight(Landroidx/compose/ui/layout/MultiContentMeasurePolicy;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 30
    .param p0, "_this"    # Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    .param p1, "$this$maxIntrinsicHeight"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "width"    # I

    .line 0
    move-object/from16 v0, p1

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "measurables"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    move-object/from16 v1, p2

    .local v1, "$this$fastMap$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 296
    .local v3, "$i$f$fastMap":I
    nop

    .line 297
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 298
    .local v4, "target$iv":Ljava/util/ArrayList;
    move-object v5, v1

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 299
    .local v6, "$i$f$fastForEach":I
    nop

    .line 300
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    :goto_0
    if-ge v7, v8, :cond_1

    .line 301
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 302
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    .local v10, "it$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 303
    .local v11, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object v12, v4

    check-cast v12, Ljava/util/Collection;

    move-object v13, v10

    check-cast v13, Ljava/util/List;

    .local v13, "list":Ljava/util/List;
    const/4 v14, 0x0

    .line 186
    .local v14, "$i$a$-fastMap-MultiContentMeasurePolicy$maxIntrinsicHeight$mapped$1":I
    move-object v15, v13

    .local v15, "$this$fastMap$iv":Ljava/util/List;
    const/16 v16, 0x0

    .line 304
    .local v16, "$i$f$fastMap":I
    nop

    .line 305
    move-object/from16 v17, v1

    .end local v1    # "$this$fastMap$iv":Ljava/util/List;
    .local v17, "$this$fastMap$iv":Ljava/util/List;
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 306
    .local v1, "target$iv":Ljava/util/ArrayList;
    move-object v2, v15

    .local v2, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v18, 0x0

    .line 307
    .local v18, "$i$f$fastForEach":I
    nop

    .line 308
    const/16 v19, 0x0

    move/from16 v20, v3

    .end local v3    # "$i$f$fastMap":I
    .local v19, "index$iv$iv":I
    .local v20, "$i$f$fastMap":I
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    move-object/from16 v21, v5

    move/from16 v5, v19

    .end local v19    # "index$iv$iv":I
    .local v5, "index$iv$iv":I
    .local v21, "$this$fastForEach$iv$iv":Ljava/util/List;
    :goto_1
    if-ge v5, v3, :cond_0

    .line 309
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    .line 310
    .local v19, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v22, v19

    .local v22, "it$iv":Ljava/lang/Object;
    const/16 v23, 0x0

    .line 311
    .local v23, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object/from16 v24, v2

    .end local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v24, "$this$fastForEach$iv$iv":Ljava/util/List;
    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    move/from16 v25, v3

    move-object/from16 v3, v22

    check-cast v3, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v3, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v26, 0x0

    .line 187
    .local v26, "$i$a$-fastMap-MultiContentMeasurePolicy$maxIntrinsicHeight$mapped$1$1":I
    move/from16 v27, v6

    .end local v6    # "$i$f$fastForEach":I
    .local v27, "$i$f$fastForEach":I
    new-instance v6, Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;

    move/from16 v28, v8

    sget-object v8, Landroidx/compose/ui/layout/IntrinsicMinMax;->Max:Landroidx/compose/ui/layout/IntrinsicMinMax;

    move-object/from16 v29, v9

    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    .local v29, "item$iv$iv":Ljava/lang/Object;
    sget-object v9, Landroidx/compose/ui/layout/IntrinsicWidthHeight;->Height:Landroidx/compose/ui/layout/IntrinsicWidthHeight;

    invoke-direct {v6, v3, v8, v9}, Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;-><init>(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMinMax;Landroidx/compose/ui/layout/IntrinsicWidthHeight;)V

    .line 311
    .end local v3    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v26    # "$i$a$-fastMap-MultiContentMeasurePolicy$maxIntrinsicHeight$mapped$1$1":I
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 312
    nop

    .line 310
    .end local v22    # "it$iv":Ljava/lang/Object;
    .end local v23    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 308
    .end local v19    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v2, v24

    move/from16 v3, v25

    move/from16 v6, v27

    move/from16 v8, v28

    move-object/from16 v9, v29

    goto :goto_1

    .end local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v27    # "$i$f$fastForEach":I
    .end local v29    # "item$iv$iv":Ljava/lang/Object;
    .restart local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v6    # "$i$f$fastForEach":I
    .restart local v9    # "item$iv$iv":Ljava/lang/Object;
    :cond_0
    move-object/from16 v24, v2

    move/from16 v27, v6

    move/from16 v28, v8

    move-object/from16 v29, v9

    .line 313
    .end local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v5    # "index$iv$iv":I
    .end local v6    # "$i$f$fastForEach":I
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    .restart local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v27    # "$i$f$fastForEach":I
    .restart local v29    # "item$iv$iv":Ljava/lang/Object;
    nop

    .line 314
    .end local v18    # "$i$f$fastForEach":I
    .end local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    check-cast v1, Ljava/util/List;

    .line 186
    .end local v1    # "target$iv":Ljava/util/ArrayList;
    .end local v15    # "$this$fastMap$iv":Ljava/util/List;
    .end local v16    # "$i$f$fastMap":I
    nop

    .line 303
    .end local v13    # "list":Ljava/util/List;
    .end local v14    # "$i$a$-fastMap-MultiContentMeasurePolicy$maxIntrinsicHeight$mapped$1":I
    invoke-interface {v12, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 315
    nop

    .line 302
    .end local v10    # "it$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 300
    .end local v29    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v2, p2

    move-object/from16 v1, v17

    move/from16 v3, v20

    move-object/from16 v5, v21

    goto/16 :goto_0

    .end local v17    # "$this$fastMap$iv":Ljava/util/List;
    .end local v20    # "$i$f$fastMap":I
    .end local v21    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v27    # "$i$f$fastForEach":I
    .local v1, "$this$fastMap$iv":Ljava/util/List;
    .local v3, "$i$f$fastMap":I
    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v6    # "$i$f$fastForEach":I
    :cond_1
    move-object/from16 v17, v1

    move/from16 v20, v3

    move-object/from16 v21, v5

    move/from16 v27, v6

    .line 316
    .end local v1    # "$this$fastMap$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastMap":I
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    .end local v7    # "index$iv$iv":I
    .restart local v17    # "$this$fastMap$iv":Ljava/util/List;
    .restart local v20    # "$i$f$fastMap":I
    .restart local v21    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v27    # "$i$f$fastForEach":I
    nop

    .line 317
    .end local v21    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v27    # "$i$f$fastForEach":I
    move-object v1, v4

    check-cast v1, Ljava/util/List;

    .line 185
    .end local v4    # "target$iv":Ljava/util/ArrayList;
    .end local v17    # "$this$fastMap$iv":Ljava/util/List;
    .end local v20    # "$i$f$fastMap":I
    nop

    .line 190
    .local v1, "mapped":Ljava/util/List;
    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xd

    const/4 v7, 0x0

    move/from16 v3, p3

    invoke-static/range {v2 .. v7}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide v2

    .line 191
    .local v2, "constraints":J
    new-instance v4, Landroidx/compose/ui/layout/IntrinsicsMeasureScope;

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v5

    invoke-direct {v4, v0, v5}, Landroidx/compose/ui/layout/IntrinsicsMeasureScope;-><init>(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 192
    .local v4, "layoutReceiver":Landroidx/compose/ui/layout/IntrinsicsMeasureScope;
    move-object v5, v4

    check-cast v5, Landroidx/compose/ui/layout/MeasureScope;

    move-object/from16 v6, p0

    invoke-interface {v6, v5, v1, v2, v3}, Landroidx/compose/ui/layout/MultiContentMeasurePolicy;->measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v5

    .line 193
    .local v5, "layoutResult":Landroidx/compose/ui/layout/MeasureResult;
    invoke-interface {v5}, Landroidx/compose/ui/layout/MeasureResult;->getHeight()I

    move-result v7

    return v7
.end method

.method public static $default$maxIntrinsicWidth(Landroidx/compose/ui/layout/MultiContentMeasurePolicy;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 30
    .param p0, "_this"    # Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    .param p1, "$this$maxIntrinsicWidth"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "height"    # I

    .line 0
    move-object/from16 v0, p1

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "measurables"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    move-object/from16 v1, p2

    .local v1, "$this$fastMap$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 274
    .local v3, "$i$f$fastMap":I
    nop

    .line 275
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 276
    .local v4, "target$iv":Ljava/util/ArrayList;
    move-object v5, v1

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 277
    .local v6, "$i$f$fastForEach":I
    nop

    .line 278
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    :goto_0
    if-ge v7, v8, :cond_1

    .line 279
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 280
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    .local v10, "it$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 281
    .local v11, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object v12, v4

    check-cast v12, Ljava/util/Collection;

    move-object v13, v10

    check-cast v13, Ljava/util/List;

    .local v13, "list":Ljava/util/List;
    const/4 v14, 0x0

    .line 162
    .local v14, "$i$a$-fastMap-MultiContentMeasurePolicy$maxIntrinsicWidth$mapped$1":I
    move-object v15, v13

    .local v15, "$this$fastMap$iv":Ljava/util/List;
    const/16 v16, 0x0

    .line 282
    .local v16, "$i$f$fastMap":I
    nop

    .line 283
    move-object/from16 v17, v1

    .end local v1    # "$this$fastMap$iv":Ljava/util/List;
    .local v17, "$this$fastMap$iv":Ljava/util/List;
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 284
    .local v1, "target$iv":Ljava/util/ArrayList;
    move-object v2, v15

    .local v2, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v18, 0x0

    .line 285
    .local v18, "$i$f$fastForEach":I
    nop

    .line 286
    const/16 v19, 0x0

    move/from16 v20, v3

    .end local v3    # "$i$f$fastMap":I
    .local v19, "index$iv$iv":I
    .local v20, "$i$f$fastMap":I
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    move-object/from16 v21, v5

    move/from16 v5, v19

    .end local v19    # "index$iv$iv":I
    .local v5, "index$iv$iv":I
    .local v21, "$this$fastForEach$iv$iv":Ljava/util/List;
    :goto_1
    if-ge v5, v3, :cond_0

    .line 287
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    .line 288
    .local v19, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v22, v19

    .local v22, "it$iv":Ljava/lang/Object;
    const/16 v23, 0x0

    .line 289
    .local v23, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object/from16 v24, v2

    .end local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v24, "$this$fastForEach$iv$iv":Ljava/util/List;
    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    move/from16 v25, v3

    move-object/from16 v3, v22

    check-cast v3, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v3, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v26, 0x0

    .line 163
    .local v26, "$i$a$-fastMap-MultiContentMeasurePolicy$maxIntrinsicWidth$mapped$1$1":I
    move/from16 v27, v6

    .end local v6    # "$i$f$fastForEach":I
    .local v27, "$i$f$fastForEach":I
    new-instance v6, Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;

    move/from16 v28, v8

    sget-object v8, Landroidx/compose/ui/layout/IntrinsicMinMax;->Max:Landroidx/compose/ui/layout/IntrinsicMinMax;

    move-object/from16 v29, v9

    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    .local v29, "item$iv$iv":Ljava/lang/Object;
    sget-object v9, Landroidx/compose/ui/layout/IntrinsicWidthHeight;->Width:Landroidx/compose/ui/layout/IntrinsicWidthHeight;

    invoke-direct {v6, v3, v8, v9}, Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;-><init>(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMinMax;Landroidx/compose/ui/layout/IntrinsicWidthHeight;)V

    .line 289
    .end local v3    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v26    # "$i$a$-fastMap-MultiContentMeasurePolicy$maxIntrinsicWidth$mapped$1$1":I
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 290
    nop

    .line 288
    .end local v22    # "it$iv":Ljava/lang/Object;
    .end local v23    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 286
    .end local v19    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v2, v24

    move/from16 v3, v25

    move/from16 v6, v27

    move/from16 v8, v28

    move-object/from16 v9, v29

    goto :goto_1

    .end local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v27    # "$i$f$fastForEach":I
    .end local v29    # "item$iv$iv":Ljava/lang/Object;
    .restart local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v6    # "$i$f$fastForEach":I
    .restart local v9    # "item$iv$iv":Ljava/lang/Object;
    :cond_0
    move-object/from16 v24, v2

    move/from16 v27, v6

    move/from16 v28, v8

    move-object/from16 v29, v9

    .line 291
    .end local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v5    # "index$iv$iv":I
    .end local v6    # "$i$f$fastForEach":I
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    .restart local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v27    # "$i$f$fastForEach":I
    .restart local v29    # "item$iv$iv":Ljava/lang/Object;
    nop

    .line 292
    .end local v18    # "$i$f$fastForEach":I
    .end local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    check-cast v1, Ljava/util/List;

    .line 162
    .end local v1    # "target$iv":Ljava/util/ArrayList;
    .end local v15    # "$this$fastMap$iv":Ljava/util/List;
    .end local v16    # "$i$f$fastMap":I
    nop

    .line 281
    .end local v13    # "list":Ljava/util/List;
    .end local v14    # "$i$a$-fastMap-MultiContentMeasurePolicy$maxIntrinsicWidth$mapped$1":I
    invoke-interface {v12, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 293
    nop

    .line 280
    .end local v10    # "it$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 278
    .end local v29    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v2, p2

    move-object/from16 v1, v17

    move/from16 v3, v20

    move-object/from16 v5, v21

    goto/16 :goto_0

    .end local v17    # "$this$fastMap$iv":Ljava/util/List;
    .end local v20    # "$i$f$fastMap":I
    .end local v21    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v27    # "$i$f$fastForEach":I
    .local v1, "$this$fastMap$iv":Ljava/util/List;
    .local v3, "$i$f$fastMap":I
    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v6    # "$i$f$fastForEach":I
    :cond_1
    move-object/from16 v17, v1

    move/from16 v20, v3

    move-object/from16 v21, v5

    move/from16 v27, v6

    .line 294
    .end local v1    # "$this$fastMap$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastMap":I
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    .end local v7    # "index$iv$iv":I
    .restart local v17    # "$this$fastMap$iv":Ljava/util/List;
    .restart local v20    # "$i$f$fastMap":I
    .restart local v21    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v27    # "$i$f$fastForEach":I
    nop

    .line 295
    .end local v21    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v27    # "$i$f$fastForEach":I
    move-object v1, v4

    check-cast v1, Ljava/util/List;

    .line 161
    .end local v4    # "target$iv":Ljava/util/ArrayList;
    .end local v17    # "$this$fastMap$iv":Ljava/util/List;
    .end local v20    # "$i$f$fastMap":I
    nop

    .line 166
    .local v1, "mapped":Ljava/util/List;
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x7

    const/4 v7, 0x0

    move/from16 v5, p3

    invoke-static/range {v2 .. v7}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide v2

    .line 167
    .local v2, "constraints":J
    new-instance v4, Landroidx/compose/ui/layout/IntrinsicsMeasureScope;

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v5

    invoke-direct {v4, v0, v5}, Landroidx/compose/ui/layout/IntrinsicsMeasureScope;-><init>(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 168
    .local v4, "layoutReceiver":Landroidx/compose/ui/layout/IntrinsicsMeasureScope;
    move-object v5, v4

    check-cast v5, Landroidx/compose/ui/layout/MeasureScope;

    move-object/from16 v6, p0

    invoke-interface {v6, v5, v1, v2, v3}, Landroidx/compose/ui/layout/MultiContentMeasurePolicy;->measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v5

    .line 169
    .local v5, "layoutResult":Landroidx/compose/ui/layout/MeasureResult;
    invoke-interface {v5}, Landroidx/compose/ui/layout/MeasureResult;->getWidth()I

    move-result v7

    return v7
.end method

.method public static $default$minIntrinsicHeight(Landroidx/compose/ui/layout/MultiContentMeasurePolicy;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 30
    .param p0, "_this"    # Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    .param p1, "$this$minIntrinsicHeight"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "width"    # I

    .line 0
    move-object/from16 v0, p1

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "measurables"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    move-object/from16 v1, p2

    .local v1, "$this$fastMap$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 252
    .local v3, "$i$f$fastMap":I
    nop

    .line 253
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 254
    .local v4, "target$iv":Ljava/util/ArrayList;
    move-object v5, v1

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 255
    .local v6, "$i$f$fastForEach":I
    nop

    .line 256
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    :goto_0
    if-ge v7, v8, :cond_1

    .line 257
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 258
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    .local v10, "it$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 259
    .local v11, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object v12, v4

    check-cast v12, Ljava/util/Collection;

    move-object v13, v10

    check-cast v13, Ljava/util/List;

    .local v13, "list":Ljava/util/List;
    const/4 v14, 0x0

    .line 138
    .local v14, "$i$a$-fastMap-MultiContentMeasurePolicy$minIntrinsicHeight$mapped$1":I
    move-object v15, v13

    .local v15, "$this$fastMap$iv":Ljava/util/List;
    const/16 v16, 0x0

    .line 260
    .local v16, "$i$f$fastMap":I
    nop

    .line 261
    move-object/from16 v17, v1

    .end local v1    # "$this$fastMap$iv":Ljava/util/List;
    .local v17, "$this$fastMap$iv":Ljava/util/List;
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 262
    .local v1, "target$iv":Ljava/util/ArrayList;
    move-object v2, v15

    .local v2, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v18, 0x0

    .line 263
    .local v18, "$i$f$fastForEach":I
    nop

    .line 264
    const/16 v19, 0x0

    move/from16 v20, v3

    .end local v3    # "$i$f$fastMap":I
    .local v19, "index$iv$iv":I
    .local v20, "$i$f$fastMap":I
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    move-object/from16 v21, v5

    move/from16 v5, v19

    .end local v19    # "index$iv$iv":I
    .local v5, "index$iv$iv":I
    .local v21, "$this$fastForEach$iv$iv":Ljava/util/List;
    :goto_1
    if-ge v5, v3, :cond_0

    .line 265
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    .line 266
    .local v19, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v22, v19

    .local v22, "it$iv":Ljava/lang/Object;
    const/16 v23, 0x0

    .line 267
    .local v23, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object/from16 v24, v2

    .end local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v24, "$this$fastForEach$iv$iv":Ljava/util/List;
    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    move/from16 v25, v3

    move-object/from16 v3, v22

    check-cast v3, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v3, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v26, 0x0

    .line 139
    .local v26, "$i$a$-fastMap-MultiContentMeasurePolicy$minIntrinsicHeight$mapped$1$1":I
    move/from16 v27, v6

    .end local v6    # "$i$f$fastForEach":I
    .local v27, "$i$f$fastForEach":I
    new-instance v6, Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;

    move/from16 v28, v8

    sget-object v8, Landroidx/compose/ui/layout/IntrinsicMinMax;->Min:Landroidx/compose/ui/layout/IntrinsicMinMax;

    move-object/from16 v29, v9

    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    .local v29, "item$iv$iv":Ljava/lang/Object;
    sget-object v9, Landroidx/compose/ui/layout/IntrinsicWidthHeight;->Height:Landroidx/compose/ui/layout/IntrinsicWidthHeight;

    invoke-direct {v6, v3, v8, v9}, Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;-><init>(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMinMax;Landroidx/compose/ui/layout/IntrinsicWidthHeight;)V

    .line 267
    .end local v3    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v26    # "$i$a$-fastMap-MultiContentMeasurePolicy$minIntrinsicHeight$mapped$1$1":I
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 268
    nop

    .line 266
    .end local v22    # "it$iv":Ljava/lang/Object;
    .end local v23    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 264
    .end local v19    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v2, v24

    move/from16 v3, v25

    move/from16 v6, v27

    move/from16 v8, v28

    move-object/from16 v9, v29

    goto :goto_1

    .end local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v27    # "$i$f$fastForEach":I
    .end local v29    # "item$iv$iv":Ljava/lang/Object;
    .restart local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v6    # "$i$f$fastForEach":I
    .restart local v9    # "item$iv$iv":Ljava/lang/Object;
    :cond_0
    move-object/from16 v24, v2

    move/from16 v27, v6

    move/from16 v28, v8

    move-object/from16 v29, v9

    .line 269
    .end local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v5    # "index$iv$iv":I
    .end local v6    # "$i$f$fastForEach":I
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    .restart local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v27    # "$i$f$fastForEach":I
    .restart local v29    # "item$iv$iv":Ljava/lang/Object;
    nop

    .line 270
    .end local v18    # "$i$f$fastForEach":I
    .end local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    check-cast v1, Ljava/util/List;

    .line 138
    .end local v1    # "target$iv":Ljava/util/ArrayList;
    .end local v15    # "$this$fastMap$iv":Ljava/util/List;
    .end local v16    # "$i$f$fastMap":I
    nop

    .line 259
    .end local v13    # "list":Ljava/util/List;
    .end local v14    # "$i$a$-fastMap-MultiContentMeasurePolicy$minIntrinsicHeight$mapped$1":I
    invoke-interface {v12, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 271
    nop

    .line 258
    .end local v10    # "it$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 256
    .end local v29    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v2, p2

    move-object/from16 v1, v17

    move/from16 v3, v20

    move-object/from16 v5, v21

    goto/16 :goto_0

    .end local v17    # "$this$fastMap$iv":Ljava/util/List;
    .end local v20    # "$i$f$fastMap":I
    .end local v21    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v27    # "$i$f$fastForEach":I
    .local v1, "$this$fastMap$iv":Ljava/util/List;
    .local v3, "$i$f$fastMap":I
    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v6    # "$i$f$fastForEach":I
    :cond_1
    move-object/from16 v17, v1

    move/from16 v20, v3

    move-object/from16 v21, v5

    move/from16 v27, v6

    .line 272
    .end local v1    # "$this$fastMap$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastMap":I
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    .end local v7    # "index$iv$iv":I
    .restart local v17    # "$this$fastMap$iv":Ljava/util/List;
    .restart local v20    # "$i$f$fastMap":I
    .restart local v21    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v27    # "$i$f$fastForEach":I
    nop

    .line 273
    .end local v21    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v27    # "$i$f$fastForEach":I
    move-object v1, v4

    check-cast v1, Ljava/util/List;

    .line 137
    .end local v4    # "target$iv":Ljava/util/ArrayList;
    .end local v17    # "$this$fastMap$iv":Ljava/util/List;
    .end local v20    # "$i$f$fastMap":I
    nop

    .line 142
    .local v1, "mapped":Ljava/util/List;
    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xd

    const/4 v7, 0x0

    move/from16 v3, p3

    invoke-static/range {v2 .. v7}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide v2

    .line 143
    .local v2, "constraints":J
    new-instance v4, Landroidx/compose/ui/layout/IntrinsicsMeasureScope;

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v5

    invoke-direct {v4, v0, v5}, Landroidx/compose/ui/layout/IntrinsicsMeasureScope;-><init>(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 144
    .local v4, "layoutReceiver":Landroidx/compose/ui/layout/IntrinsicsMeasureScope;
    move-object v5, v4

    check-cast v5, Landroidx/compose/ui/layout/MeasureScope;

    move-object/from16 v6, p0

    invoke-interface {v6, v5, v1, v2, v3}, Landroidx/compose/ui/layout/MultiContentMeasurePolicy;->measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v5

    .line 145
    .local v5, "layoutResult":Landroidx/compose/ui/layout/MeasureResult;
    invoke-interface {v5}, Landroidx/compose/ui/layout/MeasureResult;->getHeight()I

    move-result v7

    return v7
.end method

.method public static $default$minIntrinsicWidth(Landroidx/compose/ui/layout/MultiContentMeasurePolicy;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I
    .locals 30
    .param p0, "_this"    # Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    .param p1, "$this$minIntrinsicWidth"    # Landroidx/compose/ui/layout/IntrinsicMeasureScope;
    .param p2, "measurables"    # Ljava/util/List;
    .param p3, "height"    # I

    .line 0
    move-object/from16 v0, p1

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "measurables"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    move-object/from16 v1, p2

    .local v1, "$this$fastMap$iv":Ljava/util/List;
    const/4 v3, 0x0

    .line 230
    .local v3, "$i$f$fastMap":I
    nop

    .line 231
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 232
    .local v4, "target$iv":Ljava/util/ArrayList;
    move-object v5, v1

    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v6, 0x0

    .line 233
    .local v6, "$i$f$fastForEach":I
    nop

    .line 234
    const/4 v7, 0x0

    .local v7, "index$iv$iv":I
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    :goto_0
    if-ge v7, v8, :cond_1

    .line 235
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 236
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    .local v10, "it$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 237
    .local v11, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object v12, v4

    check-cast v12, Ljava/util/Collection;

    move-object v13, v10

    check-cast v13, Ljava/util/List;

    .local v13, "list":Ljava/util/List;
    const/4 v14, 0x0

    .line 113
    .local v14, "$i$a$-fastMap-MultiContentMeasurePolicy$minIntrinsicWidth$mapped$1":I
    move-object v15, v13

    .local v15, "$this$fastMap$iv":Ljava/util/List;
    const/16 v16, 0x0

    .line 238
    .local v16, "$i$f$fastMap":I
    nop

    .line 239
    move-object/from16 v17, v1

    .end local v1    # "$this$fastMap$iv":Ljava/util/List;
    .local v17, "$this$fastMap$iv":Ljava/util/List;
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 240
    .local v1, "target$iv":Ljava/util/ArrayList;
    move-object v2, v15

    .local v2, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/16 v18, 0x0

    .line 241
    .local v18, "$i$f$fastForEach":I
    nop

    .line 242
    const/16 v19, 0x0

    move/from16 v20, v3

    .end local v3    # "$i$f$fastMap":I
    .local v19, "index$iv$iv":I
    .local v20, "$i$f$fastMap":I
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    move-object/from16 v21, v5

    move/from16 v5, v19

    .end local v19    # "index$iv$iv":I
    .local v5, "index$iv$iv":I
    .local v21, "$this$fastForEach$iv$iv":Ljava/util/List;
    :goto_1
    if-ge v5, v3, :cond_0

    .line 243
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v19

    .line 244
    .local v19, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v22, v19

    .local v22, "it$iv":Ljava/lang/Object;
    const/16 v23, 0x0

    .line 245
    .local v23, "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    move-object/from16 v24, v2

    .end local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .local v24, "$this$fastForEach$iv$iv":Ljava/util/List;
    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    move/from16 v25, v3

    move-object/from16 v3, v22

    check-cast v3, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .local v3, "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    const/16 v26, 0x0

    .line 114
    .local v26, "$i$a$-fastMap-MultiContentMeasurePolicy$minIntrinsicWidth$mapped$1$1":I
    move/from16 v27, v6

    .end local v6    # "$i$f$fastForEach":I
    .local v27, "$i$f$fastForEach":I
    new-instance v6, Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;

    move/from16 v28, v8

    sget-object v8, Landroidx/compose/ui/layout/IntrinsicMinMax;->Min:Landroidx/compose/ui/layout/IntrinsicMinMax;

    move-object/from16 v29, v9

    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    .local v29, "item$iv$iv":Ljava/lang/Object;
    sget-object v9, Landroidx/compose/ui/layout/IntrinsicWidthHeight;->Width:Landroidx/compose/ui/layout/IntrinsicWidthHeight;

    invoke-direct {v6, v3, v8, v9}, Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;-><init>(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMinMax;Landroidx/compose/ui/layout/IntrinsicWidthHeight;)V

    .line 245
    .end local v3    # "it":Landroidx/compose/ui/layout/IntrinsicMeasurable;
    .end local v26    # "$i$a$-fastMap-MultiContentMeasurePolicy$minIntrinsicWidth$mapped$1$1":I
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 246
    nop

    .line 244
    .end local v22    # "it$iv":Ljava/lang/Object;
    .end local v23    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 242
    .end local v19    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v2, v24

    move/from16 v3, v25

    move/from16 v6, v27

    move/from16 v8, v28

    move-object/from16 v9, v29

    goto :goto_1

    .end local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v27    # "$i$f$fastForEach":I
    .end local v29    # "item$iv$iv":Ljava/lang/Object;
    .restart local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v6    # "$i$f$fastForEach":I
    .restart local v9    # "item$iv$iv":Ljava/lang/Object;
    :cond_0
    move-object/from16 v24, v2

    move/from16 v27, v6

    move/from16 v28, v8

    move-object/from16 v29, v9

    .line 247
    .end local v2    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v5    # "index$iv$iv":I
    .end local v6    # "$i$f$fastForEach":I
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    .restart local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v27    # "$i$f$fastForEach":I
    .restart local v29    # "item$iv$iv":Ljava/lang/Object;
    nop

    .line 248
    .end local v18    # "$i$f$fastForEach":I
    .end local v24    # "$this$fastForEach$iv$iv":Ljava/util/List;
    check-cast v1, Ljava/util/List;

    .line 113
    .end local v1    # "target$iv":Ljava/util/ArrayList;
    .end local v15    # "$this$fastMap$iv":Ljava/util/List;
    .end local v16    # "$i$f$fastMap":I
    nop

    .line 237
    .end local v13    # "list":Ljava/util/List;
    .end local v14    # "$i$a$-fastMap-MultiContentMeasurePolicy$minIntrinsicWidth$mapped$1":I
    invoke-interface {v12, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 249
    nop

    .line 236
    .end local v10    # "it$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-fastForEach-ListUtilsKt$fastMap$2$iv":I
    nop

    .line 234
    .end local v29    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v2, p2

    move-object/from16 v1, v17

    move/from16 v3, v20

    move-object/from16 v5, v21

    goto/16 :goto_0

    .end local v17    # "$this$fastMap$iv":Ljava/util/List;
    .end local v20    # "$i$f$fastMap":I
    .end local v21    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v27    # "$i$f$fastForEach":I
    .local v1, "$this$fastMap$iv":Ljava/util/List;
    .local v3, "$i$f$fastMap":I
    .local v5, "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v6    # "$i$f$fastForEach":I
    :cond_1
    move-object/from16 v17, v1

    move/from16 v20, v3

    move-object/from16 v21, v5

    move/from16 v27, v6

    .line 250
    .end local v1    # "$this$fastMap$iv":Ljava/util/List;
    .end local v3    # "$i$f$fastMap":I
    .end local v5    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v6    # "$i$f$fastForEach":I
    .end local v7    # "index$iv$iv":I
    .restart local v17    # "$this$fastMap$iv":Ljava/util/List;
    .restart local v20    # "$i$f$fastMap":I
    .restart local v21    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .restart local v27    # "$i$f$fastForEach":I
    nop

    .line 251
    .end local v21    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v27    # "$i$f$fastForEach":I
    move-object v1, v4

    check-cast v1, Ljava/util/List;

    .line 112
    .end local v4    # "target$iv":Ljava/util/ArrayList;
    .end local v17    # "$this$fastMap$iv":Ljava/util/List;
    .end local v20    # "$i$f$fastMap":I
    nop

    .line 117
    .local v1, "mapped":Ljava/util/List;
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x7

    const/4 v7, 0x0

    move/from16 v5, p3

    invoke-static/range {v2 .. v7}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    move-result-wide v2

    .line 118
    .local v2, "constraints":J
    new-instance v4, Landroidx/compose/ui/layout/IntrinsicsMeasureScope;

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    move-result-object v5

    invoke-direct {v4, v0, v5}, Landroidx/compose/ui/layout/IntrinsicsMeasureScope;-><init>(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 119
    .local v4, "layoutReceiver":Landroidx/compose/ui/layout/IntrinsicsMeasureScope;
    move-object v5, v4

    check-cast v5, Landroidx/compose/ui/layout/MeasureScope;

    move-object/from16 v6, p0

    invoke-interface {v6, v5, v1, v2, v3}, Landroidx/compose/ui/layout/MultiContentMeasurePolicy;->measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v5

    .line 120
    .local v5, "layoutResult":Landroidx/compose/ui/layout/MeasureResult;
    invoke-interface {v5}, Landroidx/compose/ui/layout/MeasureResult;->getWidth()I

    move-result v7

    return v7
.end method
