/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static String field_a;
    static String field_c;
    static String field_d;
    static oj field_b;

    final static boolean a(int param0, CharSequence param1) {
        if (param0 >= -97) {
            field_d = null;
        }
        return si.a(-26629, 10, param1, true);
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_c = null;
        if (param0 != 6) {
            Object var2 = null;
            td.a(72, -37, -11, (tf[]) null, (byte) -29, -65);
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, tf[] param3, byte param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Pixelate.field_H ? 1 : 0;
          if (param3 == null) {
            break L0;
          } else {
            if (0 < param2) {
              var6 = param3[0].field_A;
              var7 = param3[2].field_A;
              var8 = param3[1].field_A;
              param3[0].d(param0, param1, param5);
              param3[2].d(param2 + param0 + -var7, param1, param5);
              if (param4 == 121) {
                t.a(wg.field_c);
                t.d(var6 + param0, param1, -var7 + param2 + param0, param1 - -param3[1].field_B);
                var9 = param0 + var6;
                var10 = -var7 + (param0 + param2);
                param0 = var9;
                L1: while (true) {
                  if (var10 <= param0) {
                    t.b(wg.field_c);
                    return;
                  } else {
                    param3[1].d(param0, param1, param5);
                    param0 = param0 + var8;
                    continue L1;
                  }
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static void a(int param0, hh[] param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        lk.field_o = new hh[param1.length];
        var2 = 0;
        L0: while (true) {
          if (lk.field_o.length <= var2) {
            L1: {
              li.field_d = new tf(48, 48);
              li.field_d.c();
              if (param0 >= 117) {
                break L1;
              } else {
                var8 = null;
                td.a(-3, 104, 72, (tf[]) null, (byte) -122, -90);
                break L1;
              }
            }
            var2 = 0;
            L2: while (true) {
              if (8 <= var2) {
                t.d(8, 8, 32, 32, 6, 16777215);
                t.c(2, 2, 0, 0, t.field_j, t.field_d);
                qa.field_f.a(19692);
                return;
              } else {
                var3 = (var2 << -1967606424) / 8;
                t.d(var2, var2, 32 - -((-var2 + 8) * 2), -(2 * var2) + 16 + 32, 6, var3 * 65793);
                var2++;
                continue L2;
              }
            }
          } else {
            var3 = gd.field_e[var2].field_m;
            var4 = gd.field_e[var2].field_k;
            lk.field_o[var2] = new hh(var3, var4, 2);
            var5 = 0;
            L3: while (true) {
              if (var5 >= var4) {
                var2++;
                continue L0;
              } else {
                var6 = 0;
                L4: while (true) {
                  if (var3 <= var6) {
                    var5++;
                    continue L3;
                  } else {
                    lk.field_o[var2].field_n[var6 + var5 * var3] = param1[var2].field_n[var6 + var5 * 5];
                    var6++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Log in / Create account";
        field_c = "It's a draw!";
    }
}
