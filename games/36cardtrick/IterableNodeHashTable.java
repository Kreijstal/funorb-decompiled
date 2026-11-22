/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    private IntrusiveNode lookupCursor;
    static int[] field_e;
    static int field_c;
    int bucketCount;
    IntrusiveNode[] buckets;

    final void put(int param0, long param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        try {
          if (null != param2.previous) {
            param2.unlink(83);
          }
          var5 = this.buckets[(int)(param1 & (long)(-1 + this.bucketCount))];
          param2.next = var5;
          param2.previous = var5.previous;
          if (param0 >= -94) {
            this.lookupCursor = (IntrusiveNode) null;
          }
          param2.previous.next = param2;
          param2.next.previous = param2;
          param2.key = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "ed.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    final IntrusiveNode get(byte param0, long param1) {
        int var4;
        IntrusiveNode var5;
        IntrusiveNode var6;
        int var7;
        var7 = Main.field_T;
        var4 = -24 / ((21 - param0) / 48);
        var5 = this.buckets[(int)((long)(-1 + this.bucketCount) & param1)];
        this.lookupCursor = var5.next;
        while (true) {
          if (var5 == this.lookupCursor) {
            this.lookupCursor = null;
            return null;
          }
          if (this.lookupCursor.key != param1) {
            this.lookupCursor = this.lookupCursor.next;
            continue;
          }
          break;
        }
        var6 = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.next;
        return var6;
    }

    private IterableNodeHashTable() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 3663) {
          field_c = -42;
        }
    }

    static {
        field_e = new int[8192];
    }
}
