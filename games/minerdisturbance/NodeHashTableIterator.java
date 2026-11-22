/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTableIterator implements Iterator {
    static int field_e;
    static Sprite field_a;
    private sd table;
    private IntrusiveNode lastReturned;
    private int nextBucketIndex;
    private IntrusiveNode nextNode;

    public final boolean hasNext() {
        IntrusiveNode[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        int var2;
        var2 = MinerDisturbance.field_ab;
        if (this.table.field_b[this.nextBucketIndex - 1] != this.nextNode) {
          return true;
        }
        while (true) {
          if (this.nextBucketIndex >= this.table.field_f) {
            return false;
          }
          fieldTemp$0 = this.table.field_b;
          fieldTemp$1 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          if (fieldTemp$0[fieldTemp$1].field_f == this.table.field_b[-1 + this.nextBucketIndex]) {
            this.nextNode = this.table.field_b[-1 + this.nextBucketIndex];
            continue;
          }
          break;
        }
        this.nextNode = this.table.field_b[this.nextBucketIndex - 1].field_f;
        return true;
    }

    final static void b(int param0) {
        sa var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        sa var1Lifetime1;
        var2 = MinerDisturbance.field_ab;
        try {
          mj.field_o.e();
          im.field_b.e();
          sa.field_s = sa.field_s - 1;
          if (sa.field_s == 0) {
            sa.field_s = 200;
            var1 = (sa) (hj.field_b.b(114));
            while (var1 != null) {
              if (!var1.field_p.isLinked(121)) {
                var1.unlink(param0 + 6163);
              }
              var1 = (sa) (hj.field_b.b((byte) 56));
            }
            if (null != GameAppletShell.field_c) {
              var1Lifetime1 = (sa) (GameAppletShell.field_c.b(114));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_p.isLinked(122)) {
                  var1Lifetime1.unlink(34);
                }
                var1Lifetime1 = (sa) (GameAppletShell.field_c.b((byte) 56));
              }
            }
          }
          if (param0 != -6129) {
            return;
          }
          if (null != km.field_a) {
            if (km.field_a.b((byte) -114)) {
              return;
            }
            de.field_b = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1_ref), "gb.D(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= -77) {
          return;
        }
        NodeHashTableIterator.b(92);
    }

    public final Object next() {
        IntrusiveNode[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        IntrusiveNode var1;
        int var2;
        var2 = MinerDisturbance.field_ab;
        if (this.nextNode != this.table.field_b[this.nextBucketIndex - 1]) {
          var1 = this.nextNode;
          this.lastReturned = var1;
          this.nextNode = var1.field_f;
          return var1;
        }
        do {
          if (this.table.field_f <= this.nextBucketIndex) {
            return null;
          }
          fieldTemp$0 = this.table.field_b;
          fieldTemp$1 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          var1 = fieldTemp$0[fieldTemp$1].field_f;
        } while (this.table.field_b[this.nextBucketIndex - 1] == var1);
        this.nextNode = var1.field_f;
        this.lastReturned = var1;
        return var1;
    }

    private final void reset(int param0) {
        this.lastReturned = null;
        if (param0 > 113) {
          this.nextNode = this.table.field_b[0].field_f;
          this.nextBucketIndex = 1;
          return;
        }
        this.lastReturned = (IntrusiveNode) null;
        this.nextNode = this.table.field_b[0].field_f;
        this.nextBucketIndex = 1;
    }

    final static void a(int param0, String param1) {
        lh.a(-18473, param1);
        if (param0 > -110) {
          return;
        }
        try {
          DirectByteStorage.a(false, rf.field_a, 0);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "gb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    NodeHashTableIterator(sd param0) {
        this.lastReturned = null;
        try {
          this.table = param0;
          this.reset(123);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "gb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void remove() {
        if (null == this.lastReturned) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlink(34);
        this.lastReturned = null;
    }

    static {
        field_e = 0;
    }
}
