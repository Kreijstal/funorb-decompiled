/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    private IntrusiveNode lookupCursor;
    static int[] field_g;
    int bucketCount;
    static String field_e;
    static AccountServiceResult field_d;
    IntrusiveNode[] buckets;
    static int[] field_c;
    static IntrusiveDeque field_a;

    public static void clearStaticReferences(int param0) {
        field_e = null;
        field_d = null;
        field_g = null;
        field_c = null;
        if (param0 == -1) {
          field_a = null;
          return;
        }
        field_a = (IntrusiveDeque) null;
        field_a = null;
    }

    final void put(long param0, boolean param1, IntrusiveNode param2) {
        if (null != param2.field_c) {
          param2.unlink(34);
        }
        IntrusiveNode var5 = this.buckets[(int)(param0 & (long)(this.bucketCount - 1))];
        if (!param1) {
          return;
        }
        try {
          param2.field_c = var5.field_c;
          param2.field_f = var5;
          param2.field_c.field_f = param2;
          param2.field_d = param0;
          param2.field_f.field_c = param2;
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "sd.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode get(int param0, long param1) {
        IntrusiveNode var5 = null;
        int var6 = MinerDisturbance.field_ab;
        IntrusiveNode var4 = this.buckets[(int)((long)(-1 + this.bucketCount) & param1)];
        this.lookupCursor = var4.field_f;
        while (this.lookupCursor != var4) {
          if (~param1 == ~this.lookupCursor.field_d) {
            var5 = this.lookupCursor;
            this.lookupCursor = this.lookupCursor.field_f;
            return var5;
          }
          this.lookupCursor = this.lookupCursor.field_f;
        }
        this.lookupCursor = null;
        if (param0 >= -53) {
          return (IntrusiveNode) null;
        }
        return null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    private IterableNodeHashTable() throws Throwable {
        throw new Error();
    }

    static {
        field_e = "Start Game";
        field_c = new int[25];
        field_g = new int[8192];
        field_a = new IntrusiveDeque();
    }
}
