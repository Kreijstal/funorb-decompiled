/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lj implements Iterable {
    static int[] field_c;
    static String field_b;
    ta field_a;
    static int field_d;

    public static void b(int param0) {
        field_b = null;
        field_c = null;
        int var1 = -71 / ((param0 - 70) / 43);
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new wo((lj) this);
    }

    final void a(ta param0, byte param1) {
        L0: {
          if (param0.field_j != null) {
            param0.h(0);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_p = ((lj) this).field_a;
        param0.field_j = ((lj) this).field_a.field_j;
        param0.field_j.field_p = param0;
        if (param1 >= -13) {
          field_b = null;
          param0.field_p.field_j = param0;
          return;
        } else {
          param0.field_p.field_j = param0;
          return;
        }
    }

    final static void a(nj param0, byte param1) {
        Object var2 = null;
        int var3 = 0;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var2 = (Object) (Object) Torquing.field_v;
        synchronized (var2) {
          L0: {
            var3 = 127 / ((17 - param1) / 41);
            Torquing.field_v.field_r.a((lf) (Object) param0);
            break L0;
          }
        }
    }

    final static String a(byte[] param0, boolean param1) {
        if (param1) {
            return null;
        }
        return hk.a(param0.length, true, 0, param0);
    }

    final ta a(int param0) {
        ta var2 = null;
        var2 = ((lj) this).field_a.field_p;
        if (param0 == 4) {
          if (var2 == ((lj) this).field_a) {
            return null;
          } else {
            var2.h(0);
            return var2;
          }
        } else {
          ta discarded$7 = ((lj) this).a(121);
          if (var2 == ((lj) this).field_a) {
            return null;
          } else {
            var2.h(0);
            return var2;
          }
        }
    }

    private lj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[4];
        field_b = "LEVEL:";
    }
}
