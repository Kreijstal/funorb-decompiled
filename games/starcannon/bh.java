/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bh implements Iterable {
    static mj field_b;
    uh field_f;
    static rk field_e;
    static int field_d;
    static int[] field_c;
    static int field_a;
    static boolean field_g;

    final uh b(int param0) {
        uh var2 = null;
        int var3 = 0;
        var2 = ((bh) this).field_f.field_m;
        var3 = -14 % ((param0 - 15) / 50);
        if (((bh) this).field_f == var2) {
          return null;
        } else {
          var2.a(-6242);
          return var2;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        int var1 = 48 % ((16 - param0) / 36);
        field_e = null;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new ob((bh) this);
    }

    final static String a(String param0, ue param1, byte param2, String param3, String param4) {
        if (param2 == -38) {
          if (!param1.b((byte) 93)) {
            return param0;
          } else {
            return param3 + " - " + param1.a(param4, (byte) 75) + "%";
          }
        } else {
          field_a = -82;
          if (!param1.b((byte) 93)) {
            return param0;
          } else {
            return param3 + " - " + param1.a(param4, (byte) 75) + "%";
          }
        }
    }

    private bh() throws Throwable {
        throw new Error();
    }

    final void a(uh param0, int param1) {
        if (param1 != 25184) {
          L0: {
            uh discarded$1 = ((bh) this).b(-80);
            if (null != param0.field_f) {
              param0.a(param1 + -31426);
              break L0;
            } else {
              break L0;
            }
          }
          param0.field_m = ((bh) this).field_f;
          param0.field_f = ((bh) this).field_f.field_f;
          param0.field_f.field_m = param0;
          param0.field_m.field_f = param0;
          return;
        } else {
          L1: {
            if (null != param0.field_f) {
              param0.a(param1 + -31426);
              break L1;
            } else {
              break L1;
            }
          }
          param0.field_m = ((bh) this).field_f;
          param0.field_f = ((bh) this).field_f.field_f;
          param0.field_f.field_m = param0;
          param0.field_m.field_f = param0;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new mj("usename");
        field_d = -1;
        field_c = new int[8192];
        field_e = new rk();
    }
}
