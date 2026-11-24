/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTableIterator implements Iterator {
    static bd field_g;
    static bd field_d;
    private IntrusiveNode nextNode;
    static bn[] field_a;
    private IntrusiveNodeHashTable table;
    private int nextBucketIndex;
    private IntrusiveNode lastReturned;

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = HostileSpawn.field_I ? 1 : 0;
        if (this.table.field_f[-1 + this.nextBucketIndex] != this.nextNode) {
          return true;
        }
        while (true) {
          if (this.table.field_b <= this.nextBucketIndex) {
            return false;
          }
          fieldTemp$0 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          if (this.table.field_f[fieldTemp$0].field_g == this.table.field_f[this.nextBucketIndex - 1]) {
            this.nextNode = this.table.field_f[this.nextBucketIndex - 1];
            continue;
          }
          break;
        }
        this.nextNode = this.table.field_f[-1 + this.nextBucketIndex].field_g;
        return true;
    }

    public final void remove() {
        if (this.lastReturned == null) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlink(-124);
        this.lastReturned = null;
    }

    public static void clearStaticReferences(int param0) {
        field_d = null;
        field_a = null;
        if (param0 <= 31) {
          field_d = (bd) null;
          field_g = null;
          return;
        }
        field_g = null;
    }

    private final void reset(byte param0) {
        this.lastReturned = null;
        if (param0 == 105) {
          this.nextBucketIndex = 1;
          this.nextNode = this.table.field_f[0].field_g;
          return;
        }
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        IntrusiveNode var1;
        int var2;
        var2 = HostileSpawn.field_I ? 1 : 0;
        if (this.table.field_f[this.nextBucketIndex - 1] != this.nextNode) {
          var1 = this.nextNode;
          this.lastReturned = var1;
          this.nextNode = var1.field_g;
          return var1;
        }
        do {
          if (this.nextBucketIndex >= this.table.field_b) {
            return null;
          }
          fieldTemp$0 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          var1 = this.table.field_f[fieldTemp$0].field_g;
        } while (this.table.field_f[-1 + this.nextBucketIndex] == var1);
        this.lastReturned = var1;
        this.nextNode = var1.field_g;
        return var1;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = HostileSpawn.field_I ? 1 : 0;
        if (param2 >= param5) {
          if (param2 < param6) {
            t.a(si.field_i, false, param4, param6, param3, param5, param2, param0, param7);
          } else {
            if (param6 <= param5) {
              t.a(si.field_i, false, param4, param2, param0, param6, param5, param7, param3);
            } else {
              t.a(si.field_i, false, param4, param2, param0, param5, param6, param3, param7);
            }
          }
        } else {
          if (param5 < param6) {
            t.a(si.field_i, false, param4, param6, param3, param2, param5, param7, param0);
          } else {
            if (param2 >= param6) {
              t.a(si.field_i, false, param4, param5, param7, param6, param2, param0, param3);
            } else {
              t.a(si.field_i, false, param4, param5, param7, param2, param6, param3, param0);
            }
          }
        }
        if (param1 == -121) {
          return;
        }
        field_d = (bd) null;
    }

    NodeHashTableIterator(IntrusiveNodeHashTable param0) {
        this.lastReturned = null;
        try {
          this.table = param0;
          this.reset((byte) 105);
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "oe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
