/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rg extends RuntimeException {
    String field_b;
    Throwable field_e;
    static String field_c;
    static int[] field_f;
    static String field_g;
    static int field_d;
    static int field_a;

    final static void a(boolean param0) {
        em.field_h = 0;
        bo.r(0);
        if (!param0) {
            Object var2 = null;
            rg.a(-36, -67, -120, (int[]) null, (int[]) null);
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = ShatteredPlansClient.field_F ? 1 : 0;
        gf.f(param3, param1, param4 - -1, 10000536);
        gf.f(param3, param2 + param1, 1 + param4, 12105912);
        int var5 = 1;
        int var6 = param2;
        if (!(var5 + param1 >= gf.field_a)) {
            var5 = -param1 + gf.field_a;
        }
        if (gf.field_f < param1 + var6) {
            var6 = -param1 + gf.field_f;
        }
        int var7 = -57 % ((param0 - 36) / 45);
        for (var8 = var5; var8 < var6; var8++) {
            var9 = 48 * var8 / param2 + 152;
            var10 = var9 << -1624097080 | var9 << -1194370224 | var9;
            gf.field_h[param3 + gf.field_b * (var8 + param1)] = var10;
            gf.field_h[param4 + param3 + (param1 + var8) * gf.field_b] = var10;
        }
    }

    final static void b(boolean param0) {
        if (param0) {
            field_f = null;
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        v var9 = null;
        int var10 = 0;
        int stackIn_12_0 = 0;
        v stackIn_16_0 = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        v stackOut_15_0 = null;
        v stackOut_14_0 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        var1 = ah.field_R - ld.field_j;
        ld.field_j = -(var1 >> -217125887) + ol.field_e;
        vo.field_b = -(rn.field_b >> 1184028257) + ri.field_O;
        ah.field_R = ld.field_j + var1;
        var2 = vo.field_b;
        if (param0 > 32) {
          var3 = 0;
          L0: while (true) {
            if (t.field_c.length <= var3) {
              return;
            } else {
              L1: {
                var4 = pr.field_d[var3];
                if (0 > var4) {
                  var5 = em.field_j;
                  break L1;
                } else {
                  if (var4 == ns.field_nb.field_c) {
                    var5 = wo.field_a;
                    break L1;
                  } else {
                    var5 = ih.field_b;
                    break L1;
                  }
                }
              }
              L2: {
                var6 = t.field_c[var3];
                if (var4 < 0) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L2;
                }
              }
              L3: {
                var7 = or.a(stackIn_12_0 != 0, var6, true);
                var8 = ol.field_e + -(var7 >> -1906849055);
                if ((var4 ^ -1) > -1) {
                  break L3;
                } else {
                  L4: {
                    var2 = var2 + js.field_e;
                    if (ns.field_nb.field_c != var4) {
                      stackOut_15_0 = cr.field_e;
                      stackIn_16_0 = stackOut_15_0;
                      break L4;
                    } else {
                      stackOut_14_0 = jp.field_Cb;
                      stackIn_16_0 = stackOut_14_0;
                      break L4;
                    }
                  }
                  L5: {
                    var9 = stackIn_16_0;
                    if (var9 != null) {
                      var9.a((uo.field_g << -1871619711) + vh.field_b, -js.field_g + var8, var2, var7 - -(js.field_g << -1023611519), -103);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var2 = var2 + uo.field_g;
                  break L3;
                }
              }
              if ((var4 ^ -1) <= -1) {
                kc.field_g.d(var6, var8, var2 - -we.field_c, var5, -1);
                var2 = var2 + (vh.field_b + js.field_e + uo.field_g);
                var3++;
                continue L0;
              } else {
                lq.field_k.d(var6, var8, var2 - -sp.field_r, var5, -1);
                var2 = var2 + fe.field_A;
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 == -2147483648) {
          L0: {
            if (param2 > param0) {
              L1: {
                var5 = (param0 + param2) / 2;
                var6 = param0;
                var7 = param4[var5];
                param4[var5] = param4[param2];
                param4[param2] = var7;
                var8 = param3[var5];
                param3[var5] = param3[param2];
                param3[param2] = var8;
                if ((var7 ^ -1) != -2147483648) {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              var9 = stackIn_7_0;
              var10 = param0;
              L2: while (true) {
                if (param2 <= var10) {
                  param4[param2] = param4[var6];
                  param4[var6] = var7;
                  param3[param2] = param3[var6];
                  param3[var6] = var8;
                  rg.a(param0, -2147483648, -1 + var6, param3, param4);
                  rg.a(1 + var6, -2147483648, param2, param3, param4);
                  break L0;
                } else {
                  if (-(var9 & var10) + var7 < param4[var10]) {
                    var11 = param4[var10];
                    param4[var10] = param4[var6];
                    param4[var6] = var11;
                    var12 = param3[var10];
                    param3[var10] = param3[var6];
                    var6++;
                    param3[var6] = var12;
                    var10++;
                    continue L2;
                  } else {
                    var10++;
                    continue L2;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, byte param2) {
        if (param2 < 81) {
            field_d = -104;
            return hi.a(param0 + (-param1 + 1), tg.field_b, -11) - -param1;
        }
        return hi.a(param0 + (-param1 + 1), tg.field_b, -11) - -param1;
    }

    public static void b(int param0) {
        if (param0 <= 54) {
            field_d = 111;
            field_g = null;
            field_c = null;
            field_f = null;
            return;
        }
        field_g = null;
        field_c = null;
        field_f = null;
    }

    rg(Throwable param0, String param1) {
        ((rg) this).field_e = param0;
        ((rg) this).field_b = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Logging in...";
        field_a = 56;
        field_g = "Fleets built";
    }
}
