/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj implements cj {
    static String[] field_c;
    static im field_d;
    static vg field_b;
    static String field_a;
    static String field_f;
    static String field_e;

    public final void a(int param0, gl param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        ci var8 = null;
        var6 = param2 - -param1.field_w;
        var7 = param1.field_u + param0;
        ah.a(param1.field_n, 128, param1.field_p, var6, var7);
        if (param3 == -24381) {
          L0: {
            var8 = og.field_c[1];
            if (!(param1 instanceof eb)) {
              break L0;
            } else {
              if (((eb) (Object) param1).field_C) {
                var8.d((-var8.field_q + param1.field_p >> 16861537) + (var6 - -1), var7 + 1 + (-var8.field_u + param1.field_n >> -1724550079), 256);
                break L0;
              } else {
                if (!param1.d(-118)) {
                  return;
                } else {
                  ed.a(-4 + param1.field_p, -4 + param1.field_n, 2 + var7, 52, var6 + 2);
                  return;
                }
              }
            }
          }
          if (param1.d(-118)) {
            ed.a(-4 + param1.field_p, -4 + param1.field_n, 2 + var7, 52, var6 + 2);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Terraphoenix.field_V;
        if (param0 == 95) {
          m.field_e = null;
          fd.field_k = false;
          if (!qi.field_b) {
            var1 = db.field_b;
            if (-1 > (var1 ^ -1)) {
              if (var1 != 1) {
                m.field_e = ij.a(new String[1], -1, na.field_X);
                m.field_e = bj.a(new CharSequence[3], (byte) -103);
                nb.field_b.h((byte) -126);
                vj.a(param0 ^ -24476);
                return;
              } else {
                m.field_e = ol.field_Lb;
                m.field_e = bj.a(new CharSequence[3], (byte) -103);
                nb.field_b.h((byte) -126);
                vj.a(param0 ^ -24476);
                return;
              }
            } else {
              nb.field_b.h((byte) -126);
              vj.a(param0 ^ -24476);
              return;
            }
          } else {
            nb.field_b.l(54);
            return;
          }
        } else {
          field_b = null;
          m.field_e = null;
          fd.field_k = false;
          if (!qi.field_b) {
            var1 = db.field_b;
            if (-1 > (var1 ^ -1)) {
              if (var1 != 1) {
                m.field_e = ij.a(new String[1], -1, na.field_X);
                m.field_e = bj.a(new CharSequence[3], (byte) -103);
                nb.field_b.h((byte) -126);
                vj.a(param0 ^ -24476);
                return;
              } else {
                m.field_e = ol.field_Lb;
                m.field_e = bj.a(new CharSequence[3], (byte) -103);
                nb.field_b.h((byte) -126);
                vj.a(param0 ^ -24476);
                return;
              }
            } else {
              nb.field_b.h((byte) -126);
              vj.a(param0 ^ -24476);
              return;
            }
          } else {
            nb.field_b.l(54);
            return;
          }
        }
    }

    public static void a(int param0) {
        int var1 = -87 % ((-43 - param0) / 37);
        field_f = null;
        field_a = null;
        field_d = null;
        field_c = null;
        field_b = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Terrain Level:";
        field_d = new im();
        field_e = "Unfortunately we are unable to create an account for you at this time.";
    }
}
