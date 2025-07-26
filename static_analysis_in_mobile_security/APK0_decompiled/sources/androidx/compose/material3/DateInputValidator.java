package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DateInput.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0002\u0010\u0011J-\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/DateInputValidator;", "", "stateData", "Landroidx/compose/material3/StateData;", "dateInputFormat", "Landroidx/compose/material3/DateInputFormat;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "dateValidator", "Lkotlin/Function1;", "", "", "errorDatePattern", "", "errorDateOutOfYearRange", "errorInvalidNotAllowed", "errorInvalidRangeInput", "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DateInputFormat;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "validate", "calendarDate", "Landroidx/compose/material3/CalendarDate;", "inputIdentifier", "Landroidx/compose/material3/InputIdentifier;", "locale", "Ljava/util/Locale;", "validate-XivgLIo", "(Landroidx/compose/material3/CalendarDate;ILjava/util/Locale;)Ljava/lang/String;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateInputValidator {
    private final DatePickerFormatter dateFormatter;
    private final DateInputFormat dateInputFormat;
    private final Function1<Long, Boolean> dateValidator;
    private final String errorDateOutOfYearRange;
    private final String errorDatePattern;
    private final String errorInvalidNotAllowed;
    private final String errorInvalidRangeInput;
    private final StateData stateData;

    /* JADX WARN: Multi-variable type inference failed */
    public DateInputValidator(StateData stateData, DateInputFormat dateInputFormat, DatePickerFormatter dateFormatter, Function1<? super Long, Boolean> dateValidator, String errorDatePattern, String errorDateOutOfYearRange, String errorInvalidNotAllowed, String errorInvalidRangeInput) {
        Intrinsics.checkNotNullParameter(stateData, "stateData");
        Intrinsics.checkNotNullParameter(dateInputFormat, "dateInputFormat");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(dateValidator, "dateValidator");
        Intrinsics.checkNotNullParameter(errorDatePattern, "errorDatePattern");
        Intrinsics.checkNotNullParameter(errorDateOutOfYearRange, "errorDateOutOfYearRange");
        Intrinsics.checkNotNullParameter(errorInvalidNotAllowed, "errorInvalidNotAllowed");
        Intrinsics.checkNotNullParameter(errorInvalidRangeInput, "errorInvalidRangeInput");
        this.stateData = stateData;
        this.dateInputFormat = dateInputFormat;
        this.dateFormatter = dateFormatter;
        this.dateValidator = dateValidator;
        this.errorDatePattern = errorDatePattern;
        this.errorDateOutOfYearRange = errorDateOutOfYearRange;
        this.errorInvalidNotAllowed = errorInvalidNotAllowed;
        this.errorInvalidRangeInput = errorInvalidRangeInput;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d8, code lost:
    
        if (r0 < (r2 != null ? r2.getUtcTimeMillis() : Long.MAX_VALUE)) goto L22;
     */
    /* renamed from: validate-XivgLIo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m1465validateXivgLIo(androidx.compose.material3.CalendarDate r13, int r14, java.util.Locale r15) {
        /*
            r12 = this;
            java.lang.String r0 = "locale"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "format(this, *args)"
            r1 = 0
            r2 = 1
            if (r13 != 0) goto L30
            java.lang.String r3 = r12.errorDatePattern
            java.lang.Object[] r4 = new java.lang.Object[r2]
            androidx.compose.material3.DateInputFormat r5 = r12.dateInputFormat
            java.lang.String r5 = r5.getPatternWithDelimiters()
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toUpperCase(r6)
            java.lang.String r6 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r4[r1] = r5
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r2)
            java.lang.String r1 = java.lang.String.format(r3, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L30:
            androidx.compose.material3.StateData r3 = r12.stateData
            kotlin.ranges.IntRange r3 = r3.getYearRange()
            int r4 = r13.getYear()
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L72
            java.lang.String r3 = r12.errorDateOutOfYearRange
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            androidx.compose.material3.StateData r6 = r12.stateData
            kotlin.ranges.IntRange r6 = r6.getYearRange()
            int r6 = r6.getFirst()
            java.lang.String r6 = androidx.compose.material3.DatePickerKt.toLocalString(r6)
            r5[r1] = r6
            androidx.compose.material3.StateData r1 = r12.stateData
            kotlin.ranges.IntRange r1 = r1.getYearRange()
            int r1 = r1.getLast()
            java.lang.String r1 = androidx.compose.material3.DatePickerKt.toLocalString(r1)
            r5[r2] = r1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r1 = java.lang.String.format(r3, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L72:
            kotlin.jvm.functions.Function1<java.lang.Long, java.lang.Boolean> r3 = r12.dateValidator
            long r4 = r13.getUtcTimeMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r3 = r3.invoke(r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto Lae
            java.lang.String r3 = r12.errorInvalidNotAllowed
            java.lang.Object[] r4 = new java.lang.Object[r2]
            androidx.compose.material3.DatePickerFormatter r5 = r12.dateFormatter
            androidx.compose.material3.StateData r6 = r12.stateData
            androidx.compose.material3.CalendarModel r7 = r6.getCalendarModel()
            r9 = 0
            r10 = 8
            r11 = 0
            r6 = r13
            r8 = r15
            java.lang.String r5 = androidx.compose.material3.DatePickerFormatter.formatDate$material3_release$default(r5, r6, r7, r8, r9, r10, r11)
            r4[r1] = r5
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r2)
            java.lang.String r1 = java.lang.String.format(r3, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        Lae:
            androidx.compose.material3.InputIdentifier$Companion r0 = androidx.compose.material3.InputIdentifier.INSTANCE
            int r0 = r0.m1585getStartDateInputJ2x2o4M()
            boolean r0 = androidx.compose.material3.InputIdentifier.m1579equalsimpl0(r14, r0)
            if (r0 == 0) goto Lda
            long r0 = r13.getUtcTimeMillis()
            androidx.compose.material3.StateData r2 = r12.stateData
            androidx.compose.runtime.MutableState r2 = r2.getSelectedEndDate()
            java.lang.Object r2 = r2.getValue()
            androidx.compose.material3.CalendarDate r2 = (androidx.compose.material3.CalendarDate) r2
            if (r2 == 0) goto Ld1
            long r2 = r2.getUtcTimeMillis()
            goto Ld6
        Ld1:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Ld6:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L103
        Lda:
            androidx.compose.material3.InputIdentifier$Companion r0 = androidx.compose.material3.InputIdentifier.INSTANCE
            int r0 = r0.m1583getEndDateInputJ2x2o4M()
            boolean r0 = androidx.compose.material3.InputIdentifier.m1579equalsimpl0(r14, r0)
            if (r0 == 0) goto L106
            long r0 = r13.getUtcTimeMillis()
            androidx.compose.material3.StateData r2 = r12.stateData
            androidx.compose.runtime.MutableState r2 = r2.getSelectedStartDate()
            java.lang.Object r2 = r2.getValue()
            androidx.compose.material3.CalendarDate r2 = (androidx.compose.material3.CalendarDate) r2
            if (r2 == 0) goto Lfd
            long r2 = r2.getUtcTimeMillis()
            goto Lff
        Lfd:
            r2 = -9223372036854775808
        Lff:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L106
        L103:
            java.lang.String r0 = r12.errorInvalidRangeInput
            return r0
        L106:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateInputValidator.m1465validateXivgLIo(androidx.compose.material3.CalendarDate, int, java.util.Locale):java.lang.String");
    }
}
