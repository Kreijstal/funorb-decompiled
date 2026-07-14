/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends ai {
    static char[] field_n;
    static String field_k;
    static boolean field_l;
    static String field_m;
    static boolean field_o;

    mk(long param0, String param1) {
        super(param0, param1);
    }

    final static void a(String param0, boolean param1, float param2, int param3) {
        if (ui.field_c != null) {
          ui.field_c.a(-67, param1, param2, param0);
          fn.d();
          if (param3 > -34) {
            mk.b(41);
            kh.a((byte) 35, true);
            return;
          } else {
            kh.a((byte) 35, true);
            return;
          }
        } else {
          ui.field_c = new jj(vg.field_Z, cb.field_b);
          vg.field_Z.c((fj) (Object) ui.field_c, 0);
          ui.field_c.a(-67, param1, param2, param0);
          fn.d();
          if (param3 <= -34) {
            kh.a((byte) 35, true);
            return;
          } else {
            mk.b(41);
            kh.a((byte) 35, true);
            return;
          }
        }
    }

    public static void c(int param0) {
        field_n = null;
        if (param0 < 71) {
            field_o = false;
            field_m = null;
            field_k = null;
            return;
        }
        field_m = null;
        field_k = null;
    }

    final si b(byte param0) {
        int var2 = 114 % ((param0 - 51) / 57);
        return vd.field_c;
    }

    final static void b(int param0) {
        ud var1 = null;
        ud var1_ref = null;
        if (param0 != 128) {
          L0: {
            field_m = null;
            var1 = (ud) (Object) m.field_d.b((byte) 87);
            if (var1 != null) {
              break L0;
            } else {
              var1_ref = new ud();
              break L0;
            }
          }
          var1_ref.a(fn.field_c, fn.field_l, (byte) 90, fn.field_b, fn.field_g, fn.field_i, fn.field_j, fn.field_h);
          ve.field_b.a((rk) (Object) var1_ref, (byte) 114);
          return;
        } else {
          L1: {
            var1 = (ud) (Object) m.field_d.b((byte) 87);
            if (var1 != null) {
              break L1;
            } else {
              var1_ref = new ud();
              break L1;
            }
          }
          var1_ref.a(fn.field_c, fn.field_l, (byte) 90, fn.field_b, fn.field_g, fn.field_i, fn.field_j, fn.field_h);
          ve.field_b.a((rk) (Object) var1_ref, (byte) 114);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new char[128];
        field_m = "This password contains repeated characters, and would be easy to guess";
        field_k = "Instructions";
        field_l = false;
    }
}
