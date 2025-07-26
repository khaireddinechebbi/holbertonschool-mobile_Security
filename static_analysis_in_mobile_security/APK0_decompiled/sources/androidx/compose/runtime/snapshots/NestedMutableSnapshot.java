package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0002\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0002J\b\u0010\u0018\u001a\u00020\tH\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "readObserver", "Lkotlin/Function1;", "", "", "writeObserver", "parent", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "deactivated", "", "getParent", "()Landroidx/compose/runtime/snapshots/MutableSnapshot;", "root", "Landroidx/compose/runtime/snapshots/Snapshot;", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "deactivate", "dispose", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NestedMutableSnapshot extends MutableSnapshot {
    private boolean deactivated;
    private final MutableSnapshot parent;

    public final MutableSnapshot getParent() {
        return this.parent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedMutableSnapshot(int id, SnapshotIdSet invalid, Function1<Object, Unit> function1, Function1<Object, Unit> function12, MutableSnapshot parent) {
        super(id, invalid, function1, function12);
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        parent.mo2618nestedActivated$runtime_release(this);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this.parent.getRoot();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (!getDisposed()) {
            super.dispose();
            deactivate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r9 == null) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088 A[Catch: all -> 0x00d3, TryCatch #0 {, blocks: (B:12:0x0035, B:14:0x003d, B:17:0x0044, B:22:0x005e, B:24:0x0066, B:27:0x0080, B:29:0x0088, B:30:0x008d, B:35:0x0070, B:36:0x007d), top: B:11:0x0035 }] */
    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        /*
            r13 = this;
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r13.parent
            boolean r0 = r0.getApplied()
            if (r0 != 0) goto Ld6
            androidx.compose.runtime.snapshots.MutableSnapshot r0 = r13.parent
            boolean r0 = r0.getDisposed()
            if (r0 == 0) goto L12
            goto Ld6
        L12:
            androidx.compose.runtime.collection.IdentityArraySet r0 = r13.getModified$runtime_release()
            int r1 = r13.getId()
            r2 = 0
            if (r0 == 0) goto L2b
            androidx.compose.runtime.snapshots.MutableSnapshot r3 = r13.parent
            r4 = r13
            androidx.compose.runtime.snapshots.MutableSnapshot r4 = (androidx.compose.runtime.snapshots.MutableSnapshot) r4
            androidx.compose.runtime.snapshots.SnapshotIdSet r5 = r3.getInvalid()
            java.util.Map r3 = androidx.compose.runtime.snapshots.SnapshotKt.access$optimisticMerges(r3, r4, r5)
            goto L2c
        L2b:
            r3 = r2
        L2c:
            r4 = 0
            java.lang.Object r5 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            r6 = 0
            monitor-enter(r5)
            r7 = 0
            r8 = r13
            androidx.compose.runtime.snapshots.Snapshot r8 = (androidx.compose.runtime.snapshots.Snapshot) r8     // Catch: java.lang.Throwable -> Ld3
            androidx.compose.runtime.snapshots.SnapshotKt.access$validateOpen(r8)     // Catch: java.lang.Throwable -> Ld3
            if (r0 == 0) goto L7d
            int r8 = r0.size()     // Catch: java.lang.Throwable -> Ld3
            if (r8 != 0) goto L44
            goto L7d
        L44:
            androidx.compose.runtime.snapshots.MutableSnapshot r8 = r13.parent     // Catch: java.lang.Throwable -> Ld3
            int r8 = r8.getId()     // Catch: java.lang.Throwable -> Ld3
            androidx.compose.runtime.snapshots.MutableSnapshot r9 = r13.parent     // Catch: java.lang.Throwable -> Ld3
            androidx.compose.runtime.snapshots.SnapshotIdSet r9 = r9.getInvalid()     // Catch: java.lang.Throwable -> Ld3
            androidx.compose.runtime.snapshots.SnapshotApplyResult r8 = r13.innerApplyLocked$runtime_release(r8, r3, r9)     // Catch: java.lang.Throwable -> Ld3
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r9 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE     // Catch: java.lang.Throwable -> Ld3
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r9)     // Catch: java.lang.Throwable -> Ld3
            if (r9 != 0) goto L5e
            monitor-exit(r5)
            return r8
        L5e:
            androidx.compose.runtime.snapshots.MutableSnapshot r9 = r13.parent     // Catch: java.lang.Throwable -> Ld3
            androidx.compose.runtime.collection.IdentityArraySet r9 = r9.getModified$runtime_release()     // Catch: java.lang.Throwable -> Ld3
            if (r9 == 0) goto L70
            r10 = r9
            r11 = 0
            r12 = r0
            java.util.Collection r12 = (java.util.Collection) r12     // Catch: java.lang.Throwable -> Ld3
            r10.addAll(r12)     // Catch: java.lang.Throwable -> Ld3
            if (r9 != 0) goto L7c
        L70:
            r9 = r0
            r10 = 0
            androidx.compose.runtime.snapshots.MutableSnapshot r11 = r13.parent     // Catch: java.lang.Throwable -> Ld3
            r11.setModified(r9)     // Catch: java.lang.Throwable -> Ld3
            r13.setModified(r2)     // Catch: java.lang.Throwable -> Ld3
        L7c:
            goto L80
        L7d:
            r13.closeAndReleasePinning$runtime_release()     // Catch: java.lang.Throwable -> Ld3
        L80:
            androidx.compose.runtime.snapshots.MutableSnapshot r2 = r13.parent     // Catch: java.lang.Throwable -> Ld3
            int r2 = r2.getId()     // Catch: java.lang.Throwable -> Ld3
            if (r2 >= r1) goto L8d
            androidx.compose.runtime.snapshots.MutableSnapshot r2 = r13.parent     // Catch: java.lang.Throwable -> Ld3
            r2.advance$runtime_release()     // Catch: java.lang.Throwable -> Ld3
        L8d:
            androidx.compose.runtime.snapshots.MutableSnapshot r2 = r13.parent     // Catch: java.lang.Throwable -> Ld3
            androidx.compose.runtime.snapshots.SnapshotIdSet r8 = r2.getInvalid()     // Catch: java.lang.Throwable -> Ld3
            androidx.compose.runtime.snapshots.SnapshotIdSet r8 = r8.clear(r1)     // Catch: java.lang.Throwable -> Ld3
            androidx.compose.runtime.snapshots.SnapshotIdSet r9 = r13.getPreviousIds()     // Catch: java.lang.Throwable -> Ld3
            androidx.compose.runtime.snapshots.SnapshotIdSet r8 = r8.andNot(r9)     // Catch: java.lang.Throwable -> Ld3
            r2.setInvalid$runtime_release(r8)     // Catch: java.lang.Throwable -> Ld3
            androidx.compose.runtime.snapshots.MutableSnapshot r2 = r13.parent     // Catch: java.lang.Throwable -> Ld3
            r2.recordPrevious$runtime_release(r1)     // Catch: java.lang.Throwable -> Ld3
            androidx.compose.runtime.snapshots.MutableSnapshot r2 = r13.parent     // Catch: java.lang.Throwable -> Ld3
            int r8 = r13.takeoverPinnedSnapshot$runtime_release()     // Catch: java.lang.Throwable -> Ld3
            r2.recordPreviousPinnedSnapshot$runtime_release(r8)     // Catch: java.lang.Throwable -> Ld3
            androidx.compose.runtime.snapshots.MutableSnapshot r2 = r13.parent     // Catch: java.lang.Throwable -> Ld3
            androidx.compose.runtime.snapshots.SnapshotIdSet r8 = r13.getPreviousIds()     // Catch: java.lang.Throwable -> Ld3
            r2.recordPreviousList$runtime_release(r8)     // Catch: java.lang.Throwable -> Ld3
            androidx.compose.runtime.snapshots.MutableSnapshot r2 = r13.parent     // Catch: java.lang.Throwable -> Ld3
            int[] r8 = r13.getPreviousPinnedSnapshots()     // Catch: java.lang.Throwable -> Ld3
            r2.recordPreviousPinnedSnapshots$runtime_release(r8)     // Catch: java.lang.Throwable -> Ld3
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Ld3
            monitor-exit(r5)
            r2 = 1
            r13.setApplied$runtime_release(r2)
            r13.deactivate()
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Success r2 = androidx.compose.runtime.snapshots.SnapshotApplyResult.Success.INSTANCE
            androidx.compose.runtime.snapshots.SnapshotApplyResult r2 = (androidx.compose.runtime.snapshots.SnapshotApplyResult) r2
            return r2
        Ld3:
            r2 = move-exception
            monitor-exit(r5)
            throw r2
        Ld6:
            androidx.compose.runtime.snapshots.SnapshotApplyResult$Failure r0 = new androidx.compose.runtime.snapshots.SnapshotApplyResult$Failure
            r1 = r13
            androidx.compose.runtime.snapshots.Snapshot r1 = (androidx.compose.runtime.snapshots.Snapshot) r1
            r0.<init>(r1)
            androidx.compose.runtime.snapshots.SnapshotApplyResult r0 = (androidx.compose.runtime.snapshots.SnapshotApplyResult) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.NestedMutableSnapshot.apply():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    private final void deactivate() {
        if (!this.deactivated) {
            this.deactivated = true;
            this.parent.mo2619nestedDeactivated$runtime_release(this);
        }
    }
}
