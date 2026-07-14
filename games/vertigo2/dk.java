/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk extends da {
    static ve field_o;
    static String field_m;
    static String field_l;
    static String field_n;

    final static er[] a(int[] param0, boolean param1, er[] param2) {
        er[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        er var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          var3 = new er[96];
          var4 = 0;
          var5 = 0;
          if (param1) {
            break L0;
          } else {
            dk.c((byte) -110);
            break L0;
          }
        }
        L1: while (true) {
          if (6 <= var5) {
            ro.field_g.a(89);
            return var3;
          } else {
            if (param2[var5].field_y == param2[var5].field_t) {
              param0[var5] = (-param2[var5].field_y + 512) / 8;
              var6 = 0;
              L2: while (true) {
                if ((var6 ^ -1) <= -5) {
                  var5++;
                  continue L1;
                } else {
                  var7 = 0;
                  L3: while (true) {
                    if (4 <= var7) {
                      var6++;
                      continue L2;
                    } else {
                      var8 = new er(128, 128);
                      var8.d();
                      param2[var5].c(param0[var5] + -(param2[var5].field_y * var7 / 4), param0[var5] - var6 * param2[var5].field_t / 4);
                      var9 = param0[var5] - 1;
                      L4: while (true) {
                        if (-1 < (var9 ^ -1)) {
                          var4++;
                          var3[var4] = var8;
                          var7++;
                          continue L3;
                        } else {
                          var10 = 0;
                          L5: while (true) {
                            if (var8.field_y <= var10) {
                              var9--;
                              continue L4;
                            } else {
                              var8.field_F[var8.field_y * var10 - -var9] = var8.field_F[var8.field_y * var10 - -param0[var5]];
                              var8.field_F[-var9 + ((1 + var10) * var8.field_y - 1)] = var8.field_F[-param0[var5] + var8.field_y * (var10 - -1) - 1];
                              var8.field_F[var8.field_y * var9 - -var10] = var8.field_F[param0[var5] * var8.field_y - -var10];
                              var8.field_F[var10 + var8.field_y * (-var9 + (-1 + var8.field_t))] = var8.field_F[var8.field_y * (-param0[var5] + -1 + var8.field_t) - -var10];
                              var10++;
                              continue L5;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              throw new IllegalArgumentException("img_in pix32s must be exactly square.");
            }
          }
        }
    }

    public static void c(byte param0) {
        field_o = null;
        field_n = null;
        field_m = null;
        if (param0 != -73) {
            field_n = null;
        }
        field_l = null;
    }

    final static void d(byte param0) {
        int var1 = 0;
        if (tg.field_e > 32) {
            var1 = tg.field_e % 32;
            if (0 == var1) {
                var1 = 32;
            }
            pk.b(-88, -var1 + tg.field_e);
        } else {
            pk.b(-128, 0);
        }
        var1 = -81 % ((-22 - param0) / 52);
    }

    final String b(int param0, String param1) {
        if (param0 != 3614) {
            return null;
        }
        if (!(((dk) this).a(-1, param1) != ir.field_a)) {
            return sr.field_d;
        }
        return mh.field_b;
    }

    dk(kp param0) {
        super(param0);
    }

    final ba a(int param0, String param1) {
        if (param0 != -1) {
            return null;
        }
        int var3 = null == ol.a(param1, param0 + -6674) ? 1 : 0;
        if (var3 == 0) {
            return ir.field_a;
        }
        return qm.field_G;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new ve(1, 2, 2, 0);
        field_n = "Loading extra data";
        field_l = "Macroing or use of bots";
        field_m = "<%0> is RED";
    }
}
