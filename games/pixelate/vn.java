/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vn {
    static tf field_c;
    static boolean[][] field_e;
    static long field_b;
    static int field_g;
    private float field_a;
    private int field_f;
    static String field_d;

    final void a(int param0) {
        ((vn) this).field_a = ((vn) this).field_a - 1.600000023841858f;
        if (param0 < 91) {
          L0: {
            field_d = null;
            if (((vn) this).field_a < -20.0f) {
              this.b(false);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((vn) this).field_a < -20.0f) {
              this.b(false);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static void a(int param0, boolean param1, boolean param2, String param3) {
        uj.j(param0 + -705633292);
        wa.field_c.e((byte) 54);
        nf.field_b = new be(h.field_U, (String) null, to.field_s, param1, param2);
        ph.field_l = new on(wa.field_c, (ng) (Object) nf.field_b);
        if (param0 != -20) {
          return;
        } else {
          wa.field_c.b(-6183, (ng) (Object) ph.field_l);
          return;
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        field_c = null;
        if (param0) {
            field_c = null;
        }
    }

    final static ob a(fm param0, String param1, String param2, fm param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        if (param4 != 22510) {
          field_c = null;
          var5 = param0.a(122, param1);
          var6 = param0.a((byte) -95, param2, var5);
          return jf.a(param3, var5, param0, var6, (byte) 126);
        } else {
          var5 = param0.a(122, param1);
          var6 = param0.a((byte) -95, param2, var5);
          return jf.a(param3, var5, param0, var6, (byte) 126);
        }
    }

    private final void b(boolean param0) {
        ((vn) this).field_f = 90 + ok.a(ea.field_b, -112, 340);
        ((vn) this).field_a = 480.0f;
        if (param0) {
            field_e = null;
        }
    }

    final void a(byte param0) {
        hn.field_b.b(((vn) this).field_f, (int)((vn) this).field_a);
        if (param0 < 122) {
            field_g = -53;
        }
    }

    vn(int param0) {
        this.b(false);
        ((vn) this).field_a = (float)param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new boolean[][]{new boolean[4], new boolean[4], new boolean[4], new boolean[4], new boolean[4], new boolean[4]};
        field_d = "Rated game";
    }
}
