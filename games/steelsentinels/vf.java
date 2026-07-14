/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static vd field_b;
    static long field_d;
    static String field_c;
    static String field_a;
    static String field_f;
    static int field_e;

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        int var1 = 91 % ((param0 - 56) / 62);
        field_c = null;
        field_b = null;
    }

    final static void a(int param0, String param1) {
        sj.field_z.field_S = param1;
        im.field_b = true;
        int var2 = sb.field_bb.field_c;
        int var3 = sb.field_bb.field_i;
        int var4 = sj.field_z.field_L.a(param1, 272, sj.field_z.field_Ib);
        int var5 = -110 + (var3 / 2 + 7 + -(var4 / 2));
        fl.field_b.a(0, var5, -(var5 * 2) + -120 + var3, (var2 - 320) / 2, param0);
        fl.field_b.field_I = se.a(3, 2105376, 11579568, fl.field_b.field_Lb, 8421504, param0 ^ 13382);
        sj.field_z.a(param0 + -320, 16, -24 + (fl.field_b.field_Lb + -20), 24, -24 + (fl.field_b.field_zb - 24));
        pm.field_gb.a(0, -20 + (fl.field_b.field_Lb + -24), 24, 120, 80);
    }

    final static void a(boolean param0, int param1) {
        ck var2 = null;
        int var3 = 0;
        Object var4 = null;
        rh var5 = null;
        var3 = SteelSentinels.field_G;
        var5 = (rh) (Object) ol.field_Vb.e(13058);
        L0: while (true) {
          if (var5 == null) {
            var2 = fg.field_Ub.e(13058);
            L1: while (true) {
              if (var2 == null) {
                if (!param0) {
                  return;
                } else {
                  var4 = null;
                  vf.a(4, (String) null);
                  return;
                }
              } else {
                tc.a(87, param1);
                var2 = fg.field_Ub.a((byte) -111);
                continue L1;
              }
            }
          } else {
            vm.a(param1, -103, var5);
            var5 = (rh) (Object) ol.field_Vb.a((byte) -92);
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new vd();
        field_c = "MODULES";
        field_f = "Players";
        field_e = 360;
        field_a = "Previous";
    }
}
