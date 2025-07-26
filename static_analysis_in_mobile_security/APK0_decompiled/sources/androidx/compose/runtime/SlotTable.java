package androidx.compose.runtime;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0015J\u000e\u0010-\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0007J\u0006\u0010.\u001a\u00020/J\u0015\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0000¢\u0006\u0002\b4JW\u00100\u001a\u0002012\u0006\u0010)\u001a\u0002052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d2\u0006\u0010#\u001a\u00020\u00152\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0000¢\u0006\u0004\b4\u00106J\u0006\u00107\u001a\u00020\u001aJ\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u001509H\u0002J\u0012\u0010:\u001a\u0004\u0018\u00010\u00032\u0006\u0010;\u001a\u00020\u001eH\u0016J\u0012\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020\u0015H\u0002J\u0016\u0010?\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0007J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001509H\u0002J\u0010\u0010B\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\u0015H\u0002J\u001d\u0010C\u001a\n\u0012\u0004\u0012\u00020=\u0018\u0001092\u0006\u0010D\u001a\u00020\u0015H\u0000¢\u0006\u0002\bEJ\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00030GH\u0096\u0002J\u000e\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001509H\u0002J\u000e\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001509H\u0002J\u0006\u0010J\u001a\u000203J\u0006\u0010K\u001a\u000205J\u000e\u0010L\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u0007J\u000e\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001509H\u0002J:\u0010N\u001a\u0002HO\"\u0004\b\u0000\u0010O2!\u0010P\u001a\u001d\u0012\u0013\u0012\u001103¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(2\u0012\u0004\u0012\u0002HO0QH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010TJO\u0010U\u001a\u0002012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d2\u0006\u0010#\u001a\u00020\u00152\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0000¢\u0006\u0004\bV\u0010WJ\u001f\u0010X\u001a\u0004\u0018\u00010\u001e2\u0006\u0010>\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020\u0015H\u0000¢\u0006\u0002\bZJ\u001d\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e092\u0006\u0010>\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\\J\u0006\u0010]\u001a\u000201J:\u0010^\u001a\u0002HO\"\u0004\b\u0000\u0010O2!\u0010P\u001a\u001d\u0012\u0013\u0012\u001105¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b()\u0012\u0004\u0012\u0002HO0QH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010TJ \u0010_\u001a\u00020\u0015*\u00060`j\u0002`a2\u0006\u0010,\u001a\u00020\u00152\u0006\u0010b\u001a\u00020\u0015H\u0002R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u001e\u0010#\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u001a\u0010%\u001a\u00020\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u001a@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006c"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "()V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "getAnchors$runtime_release", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "compositionGroups", "getCompositionGroups", "()Ljava/lang/Iterable;", "<set-?>", "", "groups", "getGroups", "()[I", "", "groupsSize", "getGroupsSize", "()I", "isEmpty", "", "()Z", "readers", "", "", "slots", "getSlots", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "slotsSize", "getSlotsSize", "version", "getVersion$runtime_release", "setVersion$runtime_release", "(I)V", "writer", "getWriter$runtime_release", "anchor", "index", "anchorIndex", "asString", "", "close", "", "reader", "Landroidx/compose/runtime/SlotReader;", "close$runtime_release", "Landroidx/compose/runtime/SlotWriter;", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "containsMark", "dataIndexes", "", "find", "identityToFind", "findEffectiveRecomposeScope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "group", "groupContainsAnchor", "groupIndex", "groupSizes", "invalidateGroup", "invalidateGroupsWithKey", "target", "invalidateGroupsWithKey$runtime_release", "iterator", "", "keys", "nodes", "openReader", "openWriter", "ownsAnchor", "parentIndexes", "read", "T", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "setTo", "setTo$runtime_release", "([II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "slot", "slotIndex", "slot$runtime_release", "slotsOf", "slotsOf$runtime_release", "verifyWellFormed", "write", "emitGroup", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "level", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, KMappedMarker {
    private int groupsSize;
    private int readers;
    private int slotsSize;
    private int version;
    private boolean writer;
    private int[] groups = new int[0];
    private Object[] slots = new Object[0];
    private ArrayList<Anchor> anchors = new ArrayList<>();

    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    /* renamed from: getWriter$runtime_release, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    /* renamed from: getVersion$runtime_release, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final void setVersion$runtime_release(int i) {
        this.version = i;
    }

    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    public final void setAnchors$runtime_release(ArrayList<Anchor> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.anchors = arrayList;
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    public final <T> T read(Function1<? super SlotReader, ? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        SlotReader reader = openReader();
        try {
            return block.invoke(reader);
        } finally {
            InlineMarker.finallyStart(1);
            reader.close();
            InlineMarker.finallyEnd(1);
        }
    }

    public final <T> T write(Function1<? super SlotWriter, ? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        SlotWriter writer = openWriter();
        try {
            return block.invoke(writer);
        } finally {
            InlineMarker.finallyStart(1);
            writer.close();
            InlineMarker.finallyEnd(1);
        }
    }

    public final SlotReader openReader() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.readers++;
        return new SlotReader(this);
    }

    public final SlotWriter openWriter() {
        boolean value$iv = !this.writer;
        if (value$iv) {
            boolean value$iv2 = this.readers <= 0;
            if (value$iv2) {
                this.writer = true;
                this.version++;
                return new SlotWriter(this);
            }
            ComposerKt.composeRuntimeError("Cannot start a writer when a reader is pending".toString());
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("Cannot start a writer when another writer is pending".toString());
        throw new KotlinNothingValueException();
    }

    public final Anchor anchor(int index) {
        boolean value$iv = !this.writer;
        if (!value$iv) {
            ComposerKt.composeRuntimeError("use active SlotWriter to create an anchor location instead ".toString());
            throw new KotlinNothingValueException();
        }
        if (!(index >= 0 && index < this.groupsSize)) {
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        ArrayList $this$getOrAdd$iv = this.anchors;
        int effectiveSize$iv = this.groupsSize;
        int location$iv = SlotTableKt.search($this$getOrAdd$iv, index, effectiveSize$iv);
        if (location$iv < 0) {
            Anchor anchor$iv = new Anchor(index);
            $this$getOrAdd$iv.add(-(location$iv + 1), anchor$iv);
            return anchor$iv;
        }
        Anchor anchor = $this$getOrAdd$iv.get(location$iv);
        Intrinsics.checkNotNullExpressionValue(anchor, "get(location)");
        return anchor;
    }

    public final int anchorIndex(Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        boolean value$iv = !this.writer;
        if (value$iv) {
            boolean value$iv2 = anchor.getValid();
            if (value$iv2) {
                return anchor.getLocation();
            }
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
        ComposerKt.composeRuntimeError("Use active SlotWriter to determine anchor location instead".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean ownsAnchor(Anchor anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        if (!anchor.getValid()) {
            return false;
        }
        int it = SlotTableKt.search(this.anchors, anchor.getLocation(), this.groupsSize);
        return ((it < 0 || !Intrinsics.areEqual(this.anchors.get(it), anchor)) ? 0 : 1) != 0;
    }

    public final boolean groupContainsAnchor(int groupIndex, Anchor anchor) {
        int groupSize;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        boolean value$iv = !this.writer;
        if (!value$iv) {
            ComposerKt.composeRuntimeError("Writer is active".toString());
            throw new KotlinNothingValueException();
        }
        boolean value$iv2 = groupIndex >= 0 && groupIndex < this.groupsSize;
        if (value$iv2) {
            boolean value$iv3 = ownsAnchor(anchor);
            if (value$iv3) {
                groupSize = SlotTableKt.groupSize(this.groups, groupIndex);
                int i = groupSize + groupIndex;
                int location = anchor.getLocation();
                if (groupIndex <= location && location < i) {
                    return true;
                }
            }
            return false;
        }
        ComposerKt.composeRuntimeError("Invalid group index".toString());
        throw new KotlinNothingValueException();
    }

    public final void close$runtime_release(SlotReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        boolean value$iv = reader.getTable() == this && this.readers > 0;
        if (value$iv) {
            this.readers--;
        } else {
            ComposerKt.composeRuntimeError("Unexpected reader close()".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void close$runtime_release(SlotWriter writer, int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<Anchor> anchors) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        if (!(writer.getTable() == this && this.writer)) {
            throw new IllegalArgumentException("Unexpected writer close()".toString());
        }
        this.writer = false;
        setTo$runtime_release(groups, groupsSize, slots, slotsSize, anchors);
    }

    public final void setTo$runtime_release(int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<Anchor> anchors) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
    }

    public final List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int target) {
        List anchors = new ArrayList();
        List scopes = new ArrayList();
        Ref.BooleanRef allScopesFound = new Ref.BooleanRef();
        allScopesFound.element = true;
        SlotReader reader$iv = openReader();
        try {
            invalidateGroupsWithKey$lambda$14$scanGroup(reader$iv, target, anchors, allScopesFound, this, scopes);
            Unit unit = Unit.INSTANCE;
            reader$iv.close();
            SlotTable this_$iv = this;
            int $i$f$write = 0;
            SlotWriter writer$iv = this_$iv.openWriter();
            try {
                writer$iv.startGroup();
                int index$iv = 0;
                int size = anchors.size();
                while (index$iv < size) {
                    Object item$iv = anchors.get(index$iv);
                    Anchor anchor = (Anchor) item$iv;
                    SlotTable this_$iv2 = this_$iv;
                    try {
                        int $i$f$write2 = $i$f$write;
                        try {
                            if (anchor.toIndexFor(writer$iv) >= writer$iv.getCurrentGroup()) {
                                writer$iv.seek(anchor);
                                writer$iv.bashGroup$runtime_release();
                            }
                            index$iv++;
                            this_$iv = this_$iv2;
                            $i$f$write = $i$f$write2;
                        } catch (Throwable th) {
                            th = th;
                            writer$iv.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        writer$iv.close();
                        throw th;
                    }
                }
                writer$iv.skipToGroupEnd();
                writer$iv.endGroup();
                writer$iv.close();
                if (allScopesFound.element) {
                    return scopes;
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            reader$iv.close();
            throw th4;
        }
    }

    private static final void invalidateGroupsWithKey$lambda$14$scanGroup(SlotReader $reader, int $target, List<Anchor> list, Ref.BooleanRef allScopesFound, SlotTable this$0, List<RecomposeScopeImpl> list2) {
        int key = $reader.getGroupKey();
        if (key == $target) {
            list.add(SlotReader.anchor$default($reader, 0, 1, null));
            if (allScopesFound.element) {
                RecomposeScopeImpl nearestScope = this$0.findEffectiveRecomposeScope($reader.getCurrent());
                if (nearestScope != null) {
                    list2.add(nearestScope);
                } else {
                    allScopesFound.element = false;
                    list2.clear();
                }
            }
            $reader.skipGroup();
            return;
        }
        $reader.startGroup();
        while (!$reader.isGroupEnd()) {
            invalidateGroupsWithKey$lambda$14$scanGroup($reader, $target, list, allScopesFound, this$0, list2);
        }
        $reader.endGroup();
    }

    public final boolean containsMark() {
        boolean containsMark;
        if (this.groupsSize <= 0) {
            return false;
        }
        containsMark = SlotTableKt.containsMark(this.groups, 0);
        return containsMark;
    }

    private final RecomposeScopeImpl findEffectiveRecomposeScope(int group) {
        int current = group;
        while (current > 0) {
            Iterator<Object> it = new DataIterator(this, current).iterator();
            while (it.hasNext()) {
                Object data = it.next();
                if (data instanceof RecomposeScopeImpl) {
                    return (RecomposeScopeImpl) data;
                }
            }
            current = SlotTableKt.parentAnchor(this.groups, current);
        }
        return null;
    }

    private final boolean invalidateGroup(int group) {
        int current = group;
        while (current >= 0) {
            Iterator<Object> it = new DataIterator(this, current).iterator();
            while (it.hasNext()) {
                Object data = it.next();
                if (data instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) data).setRequiresRecompose(true);
                    return ((RecomposeScopeImpl) data).invalidateForResult(null) != InvalidationResult.IGNORED;
                }
            }
            current = SlotTableKt.parentAnchor(this.groups, current);
        }
        return false;
    }

    public final void verifyWellFormed() {
        int groupSize;
        Ref.IntRef current = new Ref.IntRef();
        if (this.groupsSize > 0) {
            while (current.element < this.groupsSize) {
                int i = current.element;
                groupSize = SlotTableKt.groupSize(this.groups, current.element);
                verifyWellFormed$validateGroup(current, this, -1, i + groupSize);
            }
            if (!(current.element == this.groupsSize)) {
                throw new IllegalStateException(("Incomplete group at root " + current.element + " expected to be " + this.groupsSize).toString());
            }
        }
        int length = this.slots.length;
        for (int index = this.slotsSize; index < length; index++) {
            if (!(this.slots[index] == null)) {
                throw new IllegalStateException(("Non null value in the slot gap at index " + index).toString());
            }
        }
        int lastLocation = -1;
        List $this$fastForEach$iv = this.anchors;
        int size = $this$fastForEach$iv.size();
        for (int index$iv = 0; index$iv < size; index$iv++) {
            Object item$iv = $this$fastForEach$iv.get(index$iv);
            Anchor anchor = (Anchor) item$iv;
            int location = anchor.toIndexFor(this);
            if (!(location >= 0 && location <= this.groupsSize)) {
                throw new IllegalArgumentException("Invalid anchor, location out of bound".toString());
            }
            if (!(lastLocation < location)) {
                throw new IllegalArgumentException("Anchor is out of order".toString());
            }
            lastLocation = location;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int verifyWellFormed$validateGroup(kotlin.jvm.internal.Ref.IntRef r19, androidx.compose.runtime.SlotTable r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotTable.verifyWellFormed$validateGroup(kotlin.jvm.internal.Ref$IntRef, androidx.compose.runtime.SlotTable, int, int):int");
    }

    public final String asString() {
        if (this.writer) {
            return super.toString();
        }
        StringBuilder $this$asString_u24lambda_u2433 = new StringBuilder();
        $this$asString_u24lambda_u2433.append(super.toString());
        $this$asString_u24lambda_u2433.append('\n');
        int groupsSize = this.groupsSize;
        if (groupsSize > 0) {
            int current = 0;
            while (current < groupsSize) {
                current += emitGroup($this$asString_u24lambda_u2433, current, 0);
            }
        } else {
            $this$asString_u24lambda_u2433.append("<EMPTY>");
        }
        String sb = $this$asString_u24lambda_u2433.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "StringBuilder().apply(builderAction).toString()");
        return sb;
    }

    private final int emitGroup(StringBuilder $this$emitGroup, int index, int level) {
        int key;
        int groupSize;
        int nodeCount;
        boolean hasMark;
        boolean containsMark;
        boolean hasObjectKey;
        boolean isNode;
        boolean hasAux;
        int slotStart;
        int auxIndex;
        int nodeIndex;
        int objectKeyIndex;
        boolean z = false;
        for (int i = 0; i < level; i++) {
            $this$emitGroup.append(' ');
        }
        $this$emitGroup.append("Group(");
        $this$emitGroup.append(index);
        $this$emitGroup.append(") key=");
        key = SlotTableKt.key(this.groups, index);
        $this$emitGroup.append(key);
        groupSize = SlotTableKt.groupSize(this.groups, index);
        $this$emitGroup.append(", nodes=");
        nodeCount = SlotTableKt.nodeCount(this.groups, index);
        $this$emitGroup.append(nodeCount);
        $this$emitGroup.append(", size=");
        $this$emitGroup.append(groupSize);
        hasMark = SlotTableKt.hasMark(this.groups, index);
        if (hasMark) {
            $this$emitGroup.append(", mark");
        }
        containsMark = SlotTableKt.containsMark(this.groups, index);
        if (containsMark) {
            $this$emitGroup.append(", contains mark");
        }
        int dataStart = emitGroup$dataIndex(this, index);
        int dataEnd = emitGroup$dataIndex(this, index + 1);
        if (dataStart >= 0 && dataStart <= dataEnd) {
            z = true;
        }
        if (z && dataEnd <= this.slotsSize) {
            hasObjectKey = SlotTableKt.hasObjectKey(this.groups, index);
            if (hasObjectKey) {
                StringBuilder append = new StringBuilder().append(" objectKey=");
                Object[] objArr = this.slots;
                objectKeyIndex = SlotTableKt.objectKeyIndex(this.groups, index);
                $this$emitGroup.append(append.append(objArr[objectKeyIndex]).toString());
            }
            isNode = SlotTableKt.isNode(this.groups, index);
            if (isNode) {
                StringBuilder append2 = new StringBuilder().append(" node=");
                Object[] objArr2 = this.slots;
                nodeIndex = SlotTableKt.nodeIndex(this.groups, index);
                $this$emitGroup.append(append2.append(objArr2[nodeIndex]).toString());
            }
            hasAux = SlotTableKt.hasAux(this.groups, index);
            if (hasAux) {
                StringBuilder append3 = new StringBuilder().append(" aux=");
                Object[] objArr3 = this.slots;
                auxIndex = SlotTableKt.auxIndex(this.groups, index);
                $this$emitGroup.append(append3.append(objArr3[auxIndex]).toString());
            }
            slotStart = SlotTableKt.slotAnchor(this.groups, index);
            if (slotStart < dataEnd) {
                $this$emitGroup.append(", slots=[");
                $this$emitGroup.append(slotStart);
                $this$emitGroup.append(": ");
                for (int dataIndex = slotStart; dataIndex < dataEnd; dataIndex++) {
                    if (dataIndex != slotStart) {
                        $this$emitGroup.append(", ");
                    }
                    $this$emitGroup.append(String.valueOf(this.slots[dataIndex]));
                }
                $this$emitGroup.append("]");
            }
        } else {
            $this$emitGroup.append(", *invalid data offsets " + dataStart + '-' + dataEnd + '*');
        }
        $this$emitGroup.append('\n');
        int current = index + 1;
        int end = index + groupSize;
        while (current < end) {
            current += emitGroup($this$emitGroup, current, level + 1);
        }
        return groupSize;
    }

    private static final int emitGroup$dataIndex(SlotTable this$0, int index) {
        int dataAnchor;
        if (index >= this$0.groupsSize) {
            return this$0.slotsSize;
        }
        dataAnchor = SlotTableKt.dataAnchor(this$0.groups, index);
        return dataAnchor;
    }

    private final List<Integer> keys() {
        List<Integer> keys;
        keys = SlotTableKt.keys(this.groups, this.groupsSize * 5);
        return keys;
    }

    private final List<Integer> nodes() {
        List<Integer> nodeCounts;
        nodeCounts = SlotTableKt.nodeCounts(this.groups, this.groupsSize * 5);
        return nodeCounts;
    }

    private final List<Integer> parentIndexes() {
        List<Integer> parentAnchors;
        parentAnchors = SlotTableKt.parentAnchors(this.groups, this.groupsSize * 5);
        return parentAnchors;
    }

    private final List<Integer> dataIndexes() {
        List<Integer> dataAnchors;
        dataAnchors = SlotTableKt.dataAnchors(this.groups, this.groupsSize * 5);
        return dataAnchors;
    }

    private final List<Integer> groupSizes() {
        List<Integer> groupSizes;
        groupSizes = SlotTableKt.groupSizes(this.groups, this.groupsSize * 5);
        return groupSizes;
    }

    public final List<Object> slotsOf$runtime_release(int group) {
        int start;
        start = SlotTableKt.dataAnchor(this.groups, group);
        int end = group + 1 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, group + 1) : this.slots.length;
        return ArraysKt.toList(this.slots).subList(start, end);
    }

    public final Object slot$runtime_release(int group, int slotIndex) {
        int start;
        start = SlotTableKt.slotAnchor(this.groups, group);
        int end = group + 1 < this.groupsSize ? SlotTableKt.dataAnchor(this.groups, group + 1) : this.slots.length;
        int len = end - start;
        boolean z = false;
        if (slotIndex >= 0 && slotIndex < len) {
            z = true;
        }
        return z ? this.slots[start + slotIndex] : Composer.INSTANCE.getEmpty();
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator<CompositionGroup> iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public CompositionGroup find(Object identityToFind) {
        Intrinsics.checkNotNullParameter(identityToFind, "identityToFind");
        return new SlotTableGroup(this, 0, 0, 4, null).find(identityToFind);
    }
}
