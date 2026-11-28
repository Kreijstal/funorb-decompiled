/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    private IntrusiveNode lookupCursor;
    static int[] field_e;
    IntrusiveNode[] buckets;
    int bucketCount;
    static String field_b;
    static int[] field_a;

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    final void put(IntrusiveNode param0, int param1, long param2) {
        IntrusiveNode var5 = null;
        try {
          if (null != param0.previous) {
            param0.unlink((byte) -119);
          }
          var5 = this.buckets[(int)((long)(this.bucketCount - param1) & param2)];
          param0.next = var5;
          param0.previous = var5.previous;
          param0.previous.next = param0;
          param0.key = param2;
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "ji.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_a = null;
        int var1 = -69 % ((4 - param0) / 55);
        field_b = null;
        field_e = null;
    }

    final static boolean a(byte param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        boolean stackIn_7_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = AccountNameAvailabilityValidator.field_l;
        synchronized (var1_ref) {
          if (TextFieldValidator.field_h == ResourceArchive.field_f) {
            return false;
          }
          if (param0 != -72) {
            IterableNodeHashTable.a((byte) 25);
          }
          da.field_b = gj.field_x[TextFieldValidator.field_h];
          IsaacRandom.field_b = Bzip2State.field_q[TextFieldValidator.field_h];
          TextFieldValidator.field_h = 127 & TextFieldValidator.field_h + 1;
          stackIn_7_0 = true;
        }
        return stackIn_7_0;
    }

    final IntrusiveNode get(byte param0, long param1) {
        IntrusiveNode var4;
        IntrusiveNode var5;
        int var6;
        IntrusiveNode var4Lifetime1;
        IntrusiveNode var5Lifetime1;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (param0 == 42) {
          var4 = this.buckets[(int)(param1 & (long)(-1 + this.bucketCount))];
          this.lookupCursor = var4.next;
          while (true) {
            if (var4 == this.lookupCursor) {
              this.lookupCursor = null;
              return null;
            }
            if (~param1 != ~this.lookupCursor.key) {
              this.lookupCursor = this.lookupCursor.next;
              continue;
            }
            break;
          }
          var5 = this.lookupCursor;
          this.lookupCursor = this.lookupCursor.next;
          return var5;
        }
        this.iterator();
        var4Lifetime1 = this.buckets[(int)(param1 & (long)(-1 + this.bucketCount))];
        this.lookupCursor = var4Lifetime1.next;
        while (true) {
          if (var4Lifetime1 == this.lookupCursor) {
            this.lookupCursor = null;
            return null;
          }
          if (~param1 != ~this.lookupCursor.key) {
            this.lookupCursor = this.lookupCursor.next;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.next;
        return var5Lifetime1;
    }

    private IterableNodeHashTable() throws Throwable {
        throw new Error();
    }

    static {
        field_e = new int[128];
        field_a = new int[4];
    }
}
