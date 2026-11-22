/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    int bucketCount;
    private IntrusiveNode lookupCursor;
    IntrusiveNode[] buckets;
    static IntrusiveDeque field_e;
    static IntrusiveDeque field_c;
    static int field_g;
    static int[] field_a;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_e = null;
        if (param0 != -1) {
          IterableNodeHashTable.a((byte) -27);
        }
    }

    final IntrusiveNode get(byte param0, long param1) {
        IntrusiveNode var4;
        int var5;
        IntrusiveNode var6;
        int var7;
        var7 = Bounce.field_N;
        var5 = -117 / ((param0 - 20) / 36);
        var4 = this.buckets[(int)(param1 & (long)(-1 + this.bucketCount))];
        this.lookupCursor = var4.field_c;
        while (true) {
          if (var4 == this.lookupCursor) {
            this.lookupCursor = null;
            return null;
          }
          if (~this.lookupCursor.field_d != ~param1) {
            this.lookupCursor = this.lookupCursor.field_c;
            continue;
          }
          break;
        }
        var6 = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.field_c;
        return var6;
    }

    final void put(int param0, long param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        try {
          if (param0 > -95) {
            this.iterator();
          }
          if (null != param2.field_f) {
            param2.unlink(2);
          }
          var5 = this.buckets[(int)((long)(-1 + this.bucketCount) & param1)];
          param2.field_f = var5.field_f;
          param2.field_c = var5;
          param2.field_f.field_c = param2;
          param2.field_d = param1;
          param2.field_c.field_f = param2;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.a((Throwable) ((Object) runtimeException), "m.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    private IterableNodeHashTable() throws Throwable {
        throw new Error();
    }

    final static int a(byte param0) {
        if (param0 <= 1) {
          field_e = (IntrusiveDeque) null;
          return SecondaryNodeDeque.field_d;
        }
        return SecondaryNodeDeque.field_d;
    }

    static {
        field_e = new IntrusiveDeque();
        field_c = new IntrusiveDeque();
        field_g = -1;
    }
}
