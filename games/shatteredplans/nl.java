/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static int[] field_a;
    static String field_c;
    static qr field_b;
    static qr field_d;

    public static void a(int param0) {
        field_d = null;
        if (param0 >= -50) {
            return;
        }
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final static lp a(ph param0, fs[] param1, int param2, fs param3) {
        int var5 = 0;
        kb var6 = null;
        ff var7 = null;
        int var8_int = 0;
        ff var8 = null;
        ff var9 = null;
        int var10 = 0;
        lp var11 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        var11 = new lp(0, 0, 182, rg.field_a);
        var11.field_h = (Object) (Object) param3;
        var5 = 0;
        var5 = 0;
        L0: while (true) {
          if (param0.field_h.length > var5) {
            if (param0.field_h[var5] != null) {
              var5++;
              var5++;
              continue L0;
            } else {
              param0.field_h[var5] = var11;
              var6 = new kb(3 * pf.field_a[param3.field_x].field_z / 4, -(rs.field_Cb.field_J / 2) + var11.field_i / 2, -(3 * pf.field_a[param3.field_x].field_z / 4) + 182, param3.field_k, param3.field_t, 16777215, true);
              var11.a((vd) (Object) var6, param2 ^ 10);
              bg.a(-2612, param1.length);
              var7 = new ff(3 * pf.field_a[param3.field_x].field_z / 4, var11.field_i / 2 + rs.field_Cb.field_J / 2 - -3, ne.a(-1, false));
              var11.a((vd) (Object) var7, 8);
              param0.field_f[var5][0] = var7;
              var8_int = 1;
              L1: while (true) {
                if (param1.length - 1 <= var8_int) {
                  var8 = new ff(0, (-pf.field_a[param3.field_x].field_w + var11.field_i) / param2, pf.field_a[param3.field_x]);
                  var11.a((vd) (Object) var8, 8);
                  return var11;
                } else {
                  var9 = new ff(pf.field_a[param3.field_x].field_z + var8_int * (2 - -dc.field_F.field_z), 3 + rs.field_Cb.field_J / 2 + var11.field_i / 2, wm.a(-1, 0));
                  var11.a((vd) (Object) var9, 8);
                  param0.field_f[var5][var8_int] = var9;
                  var8_int++;
                  continue L1;
                }
              }
            }
          } else {
            var6 = new kb(3 * pf.field_a[param3.field_x].field_z / 4, -(rs.field_Cb.field_J / 2) + var11.field_i / 2, -(3 * pf.field_a[param3.field_x].field_z / 4) + 182, param3.field_k, param3.field_t, 16777215, true);
            var11.a((vd) (Object) var6, param2 ^ 10);
            bg.a(-2612, param1.length);
            var7 = new ff(3 * pf.field_a[param3.field_x].field_z / 4, var11.field_i / 2 + rs.field_Cb.field_J / 2 - -3, ne.a(-1, false));
            var11.a((vd) (Object) var7, 8);
            param0.field_f[var5][0] = var7;
            var8_int = 1;
            L2: while (true) {
              if (param1.length - 1 <= var8_int) {
                var8 = new ff(0, (-pf.field_a[param3.field_x].field_w + var11.field_i) / param2, pf.field_a[param3.field_x]);
                var11.a((vd) (Object) var8, 8);
                return var11;
              } else {
                var9 = new ff(pf.field_a[param3.field_x].field_z + var8_int * (2 - -dc.field_F.field_z), 3 + rs.field_Cb.field_J / 2 + var11.field_i / 2, wm.a(-1, 0));
                var11.a((vd) (Object) var9, 8);
                param0.field_f[var5][var8_int] = var9;
                var8_int++;
                continue L2;
              }
            }
          }
        }
    }

    static {
    }
}
