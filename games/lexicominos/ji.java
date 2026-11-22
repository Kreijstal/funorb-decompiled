/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ji implements Iterable {
    private IntrusiveNode field_c;
    static int[] field_e;
    IntrusiveNode[] field_f;
    int field_d;
    static String field_b;
    static int[] field_a;

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    final void a(IntrusiveNode param0, int param1, long param2) {
        IntrusiveNode var5 = null;
        try {
          if (null != param0.previous) {
            param0.unlink((byte) -119);
          }
          var5 = this.field_f[(int)((long)(this.field_d - param1) & param2)];
          param0.next = var5;
          param0.previous = var5.previous;
          param0.previous.next = param0;
          param0.key = param2;
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ji.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void b(byte param0) {
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
          if (tj.field_h == sh.field_f) {
            return false;
          }
          if (param0 != -72) {
            ji.a((byte) 25);
          }
          da.field_b = gj.field_x[tj.field_h];
          pe.field_b = ok.field_q[tj.field_h];
          tj.field_h = 127 & tj.field_h + 1;
          stackIn_7_0 = true;
        }
        return stackIn_7_0;
    }

    final IntrusiveNode a(byte param0, long param1) {
        IntrusiveNode var4;
        IntrusiveNode var5;
        int var6;
        IntrusiveNode var4Lifetime1;
        IntrusiveNode var5Lifetime1;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (param0 == 42) {
          var4 = this.field_f[(int)(param1 & (long)(-1 + this.field_d))];
          this.field_c = var4.next;
          while (true) {
            if (var4 == this.field_c) {
              this.field_c = null;
              return null;
            }
            if (~param1 != ~this.field_c.key) {
              this.field_c = this.field_c.next;
              continue;
            }
            break;
          }
          var5 = this.field_c;
          this.field_c = this.field_c.next;
          return var5;
        }
        this.iterator();
        var4Lifetime1 = this.field_f[(int)(param1 & (long)(-1 + this.field_d))];
        this.field_c = var4Lifetime1.next;
        while (true) {
          if (var4Lifetime1 == this.field_c) {
            this.field_c = null;
            return null;
          }
          if (~param1 != ~this.field_c.key) {
            this.field_c = this.field_c.next;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_c;
        this.field_c = this.field_c.next;
        return var5Lifetime1;
    }

    private ji() throws Throwable {
        throw new Error();
    }

    static {
        field_e = new int[128];
        field_a = new int[4];
    }
}
