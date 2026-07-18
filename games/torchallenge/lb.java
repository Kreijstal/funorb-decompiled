/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lb extends w {
    static int field_s;
    static boolean[] field_q;
    static String[] field_u;
    static ge field_t;
    int field_r;
    static int[] field_p;

    final static ka[] f(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var10 = null;
        int[] var11 = null;
        int[] var9 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = TorChallenge.field_F ? 1 : 0;
        ka[] var1 = new ka[vl.field_b];
        if (param0 != 204) {
            field_u = null;
        }
        for (var2 = 0; var2 < vl.field_b; var2++) {
            var3 = lg.field_e[var2] * pg.field_r[var2];
            var10 = h.field_a[var2];
            var11 = new int[var3];
            var9 = var11;
            var5 = var9;
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = td.field_m[jh.a((int) var10[var6], 255)];
            }
            var1[var2] = new ka(ij.field_B, le.field_g, ug.field_e[var2], dd.field_t[var2], pg.field_r[var2], lg.field_e[var2], var11);
        }
        int discarded$0 = 0;
        p.a();
        return var1;
    }

    abstract Object c(byte param0);

    public static void d(int param0) {
        field_q = null;
        field_p = null;
        field_t = null;
        field_u = null;
        if (param0 != 18972) {
            lb.d((byte) -89);
        }
    }

    final static void a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ka var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        RuntimeException decompiledCaughtException = null;
        var17 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var9 = ak.field_a[0][0].field_q;
            var10 = ak.field_a[0][0].field_v;
            var13 = 4;
            var15 = 0;
            L1: while (true) {
              if (var15 >= 8) {
                L2: {
                  if (param2 > 35) {
                    break L2;
                  } else {
                    ka[] discarded$2 = lb.f(-115);
                    break L2;
                  }
                }
                break L0;
              } else {
                var16 = 0;
                L3: while (true) {
                  if (var16 >= 3) {
                    var15++;
                    continue L1;
                  } else {
                    L4: {
                      var11 = ol.field_c[var15][var16][4];
                      if (var11 <= 0) {
                        break L4;
                      } else {
                        if (24 > var11) {
                          var12 = (24 + -var11) / var13;
                          if (var12 < 0) {
                            break L4;
                          } else {
                            if (var12 >= 6) {
                              break L4;
                            } else {
                              var4 = ol.field_c[var15][var16][2];
                              var6 = ol.field_c[var15][var16][3];
                              var5 = ol.field_c[var15][var16][1];
                              var3_int = ol.field_c[var15][var16][0];
                              var4 = -(256 * (var9 >> 1) / 32) + var4;
                              var3_int = var3_int + var4 / 256;
                              var4 = var4 % 256;
                              var6 = var6 - (var10 >> 1) * 256 / 64;
                              var5 = var5 + var6 / 256;
                              var6 = var6 % 256;
                              int discarded$3 = -2140919664;
                              qb.a(var4, var5, param1, param0, var3_int, var6);
                              var14 = ak.field_a[vj.field_c][var12];
                              var7 = dl.field_n[0];
                              var8 = dl.field_n[2];
                              var14.d(var7, var8, 160);
                              break L4;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    var16++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var3, "lb.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract boolean e(int param0);

    final static void d(byte param0) {
        double var1_double = 0.0;
        RuntimeException var1 = null;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              wi.field_a = new int[2048];
              var7 = 1024.0;
              if (param0 <= 0) {
                break L1;
              } else {
                lb.d(-1);
                break L1;
              }
            }
            var9 = 0;
            L2: while (true) {
              if (var9 >= 2048) {
                break L0;
              } else {
                L3: {
                  var3 = (double)var9;
                  var1_double = var3 / var7;
                  var5 = Math.sin(3.141592653589793 * var1_double);
                  if (var5 < 0.0) {
                    var5 = -var5;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5 = 65536.0 * var5;
                wi.field_a[var9] = (int)var5;
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "lb.C(" + param0 + ')');
        }
    }

    lb(int param0) {
        ((lb) this).field_r = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new boolean[]{true, true, true, true, false, false, false, true, true, true};
        field_s = 0;
        field_u = new String[]{"Life+", "Health+", "Speed+", "Jump+"};
        field_p = new int[]{6, 6, 6};
    }
}
