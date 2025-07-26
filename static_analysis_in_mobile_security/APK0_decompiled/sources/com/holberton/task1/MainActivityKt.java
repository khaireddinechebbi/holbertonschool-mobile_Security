package com.holberton.task1;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.holberton.task1.ui.theme.ThemeKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u001a\u001c\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\r\u001a\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\bX\u008a\u008e\u0002"}, d2 = {"FlagChallenge", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FlagChallengePreview", "(Landroidx/compose/runtime/Composer;I)V", "hexToAscii", "", "hexStr", "xorDeobfuscate", "input", "", "", "key", "xorObfuscate", "app_debug", "userInput", "resultMessage"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MainActivityKt {
    /* JADX WARN: Removed duplicated region for block: B:42:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03ab A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlagChallenge(androidx.compose.ui.Modifier r69, androidx.compose.runtime.Composer r70, final int r71, final int r72) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.holberton.task1.MainActivityKt.FlagChallenge(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String FlagChallenge$lambda$1(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    private static final String FlagChallenge$lambda$4(MutableState<String> mutableState) {
        MutableState<String> $this$getValue$iv = mutableState;
        return $this$getValue$iv.getValue();
    }

    public static final String hexToAscii(String hexStr) {
        Intrinsics.checkNotNullParameter(hexStr, "hexStr");
        StringBuilder output = new StringBuilder("");
        int i = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, hexStr.length() - 1, 2);
        if (0 <= progressionLastElement) {
            while (true) {
                String str = hexStr.substring(i, i + 2);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
                output.append((char) Integer.parseInt(str, CharsKt.checkRadix(16)));
                if (i == progressionLastElement) {
                    break;
                }
                i += 2;
            }
        }
        String sb = output.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
        return sb;
    }

    public static final List<Integer> xorObfuscate(List<Integer> input, int key) {
        Intrinsics.checkNotNullParameter(input, "input");
        List<Integer> $this$map$iv = input;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            int it = ((Number) item$iv$iv).intValue();
            destination$iv$iv.add(Integer.valueOf(it ^ key));
        }
        return (List) destination$iv$iv;
    }

    public static final String xorDeobfuscate(List<Integer> input, int key) {
        Intrinsics.checkNotNullParameter(input, "input");
        List<Integer> $this$map$iv = input;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            int it = ((Number) item$iv$iv).intValue();
            destination$iv$iv.add(Character.valueOf((char) (it ^ key)));
        }
        return CollectionsKt.joinToString$default((List) destination$iv$iv, "", null, null, 0, null, null, 62, null);
    }

    public static final void FlagChallengePreview(Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1825070305);
        ComposerKt.sourceInformation($composer2, "C(FlagChallengePreview)125@4215L42:MainActivity.kt#wyyfmi");
        if ($changed != 0 || !$composer2.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1825070305, $changed, -1, "com.holberton.task1.FlagChallengePreview (MainActivity.kt:124)");
            }
            ThemeKt.Task1Theme(false, false, ComposableSingletons$MainActivityKt.INSTANCE.m5558getLambda6$app_debug(), $composer2, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = $composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.holberton.task1.MainActivityKt$FlagChallengePreview$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                MainActivityKt.FlagChallengePreview(composer, RecomposeScopeImplKt.updateChangedFlags($changed | 1));
            }
        });
    }
}
