/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk {
    static vk[][] field_c;
    oa field_d;
    oa field_e;
    static String field_b;
    static qi field_a;

    final static void a(int[] param0, byte param1, byte param2, bm param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = HoldTheLine.field_D;
        if (param1 != -92) {
          return;
        } else {
          gf.a();
          gf.a(param0, 0, param0.length);
          gf.c();
          L0: while (true) {
            if (!gf.d()) {
              return;
            } else {
              L1: {
                var4 = gf.field_g;
                if (0 <= var4) {
                  break L1;
                } else {
                  var4 = 0;
                  break L1;
                }
              }
              L2: {
                var5 = gf.field_b;
                if (param3.field_i <= var5) {
                  var5 = -1 + param3.field_i;
                  break L2;
                } else {
                  break L2;
                }
              }
              var6 = gf.field_a;
              if (0 <= var6) {
                if (var6 >= param3.field_l) {
                  continue L0;
                } else {
                  var7 = var4 + var6 * param3.field_i;
                  var8 = -var4 + var5;
                  L3: while (true) {
                    var8--;
                    if (-1 < (var8 ^ -1)) {
                      continue L0;
                    } else {
                      param3.field_m[var7] = (byte)kc.a((int) param3.field_m[var7], (int) param2);
                      var7++;
                      continue L3;
                    }
                  }
                }
              } else {
                continue L0;
              }
            }
          }
        }
    }

    final static void a(boolean param0) {
        lk.field_e = null;
        if (param0) {
            return;
        }
        nk.field_K = null;
        ad.field_d = null;
        wb.field_g = null;
        la.field_j = null;
        dd.field_E = null;
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 != -7689) {
            field_c = null;
        }
    }

    tk(oa param0, oa param1) {
        ((tk) this).field_e = param0;
        ((tk) this).field_d = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Suggested names: ";
    }
}
