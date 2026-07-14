/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn {
    static String field_e;
    static int field_c;
    static String field_a;
    static String field_d;
    static int[] field_b;

    final static as a(int param0, mg param1) {
        as var2 = new as(param1);
        int var3 = -54 % ((-34 - param0) / 45);
        return var2;
    }

    final static void a(ik[] param0, int param1, boolean param2) {
        bj.k(26987);
        bk.a(param0, 0);
        if (!param2) {
            field_c = -118;
        }
        vp.c(-20677, param1);
    }

    final static void a(byte param0) {
        hd var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (cb.field_h != null) {
          var1 = (hd) (Object) cb.field_h.d(0);
          var2 = (int)ra.field_e + 20;
          var3 = 20;
          var4 = 63 % ((param0 - -56) / 39);
          L0: while (true) {
            if (var1 == null) {
              return;
            } else {
              if (-1 >= (var1.field_h ^ -1)) {
                L1: {
                  if (230 > var1.field_h) {
                    wc.a(-27030, var1.field_h << 1500934308, var3, var1.field_i, var2, 256);
                    break L1;
                  } else {
                    if (var1.field_h >= 250) {
                      var5 = -(5 * var1.field_h) + 1500;
                      wc.a(-27030, var1.field_h << 814392388, -3 + var3, var1.field_o, var2 - 3, var5);
                      wc.a(-27030, var1.field_h << 2057711524, var3, var1.field_i, var2, var5);
                      break L1;
                    } else {
                      wc.a(-27030, var1.field_h << -148616476, -3 + var3, var1.field_o, var2 - 3, -2760 + 12 * var1.field_h);
                      wc.a(-27030, var1.field_h << -989994556, var3, var1.field_i, var2, 256);
                      break L1;
                    }
                  }
                }
                var2 = var2 + var1.field_i.field_w;
                var1 = (hd) (Object) cb.field_h.a((byte) -71);
                continue L0;
              } else {
                var2 = var2 + var1.field_i.field_w;
                var1 = (hd) (Object) cb.field_h.a((byte) -71);
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 < 82) {
            return;
        }
        for (var1 = 0; var1 < da.field_g; var1++) {
            wm.field_d[var1] = null;
        }
        da.field_g = 0;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_e = null;
        field_d = null;
        if (param0 != -989994556) {
            field_d = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_e = "Create";
        field_d = " and ";
        field_a = "Join";
        field_b = new int[4];
    }
}
