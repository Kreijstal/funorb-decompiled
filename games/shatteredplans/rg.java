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
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              gf.f(param3, param1, param4 - -1, 10000536);
              gf.f(param3, param2 + param1, 1 + param4, 12105912);
              var5_int = 1;
              var6 = param2;
              if (var5_int + param1 < gf.field_a) {
                var5_int = -param1 + gf.field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (gf.field_f >= param1 + var6) {
                break L2;
              } else {
                var6 = -param1 + gf.field_f;
                break L2;
              }
            }
            var7 = -57 % ((param0 - 36) / 45);
            var8 = var5_int;
            L3: while (true) {
              if (var8 >= var6) {
                break L0;
              } else {
                var9 = 48 * var8 / param2 + 152;
                var10 = var9 << 8 | var9 << 16 | var9;
                gf.field_h[param3 + gf.field_b * (var8 + param1)] = var10;
                gf.field_h[param4 + param3 + (param1 + var8) * gf.field_b] = var10;
                var8++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var5, "rg.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void b(boolean param0) {
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        v var9 = null;
        int var10 = 0;
        int stackIn_13_0 = 0;
        v stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        v stackOut_16_0 = null;
        v stackOut_15_0 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = ah.field_R - ld.field_j;
            ld.field_j = -(var1_int >> 1) + ol.field_e;
            vo.field_b = -(rn.field_b >> 1) + ri.field_O;
            ah.field_R = ld.field_j + var1_int;
            var2 = vo.field_b;
            var3 = 0;
            L1: while (true) {
              if (t.field_c.length <= var3) {
                break L0;
              } else {
                L2: {
                  var4 = pr.field_d[var3];
                  if (0 > var4) {
                    var5 = em.field_j;
                    break L2;
                  } else {
                    if (var4 == ns.field_nb.field_c) {
                      var5 = wo.field_a;
                      break L2;
                    } else {
                      var5 = ih.field_b;
                      break L2;
                    }
                  }
                }
                L3: {
                  var6 = t.field_c[var3];
                  if (var4 < 0) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L3;
                  } else {
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    break L3;
                  }
                }
                L4: {
                  var7 = or.a(stackIn_13_0 != 0, var6, true);
                  var8 = ol.field_e + -(var7 >> 1);
                  if (var4 < 0) {
                    break L4;
                  } else {
                    L5: {
                      var2 = var2 + js.field_e;
                      if (ns.field_nb.field_c != var4) {
                        stackOut_16_0 = cr.field_e;
                        stackIn_17_0 = stackOut_16_0;
                        break L5;
                      } else {
                        stackOut_15_0 = jp.field_Cb;
                        stackIn_17_0 = stackOut_15_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_17_0;
                      if (var9 != null) {
                        var9.a((uo.field_g << 1) + vh.field_b, -js.field_g + var8, var2, var7 - -(js.field_g << 1), -103);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2 = var2 + uo.field_g;
                    break L4;
                  }
                }
                L7: {
                  if (var4 >= 0) {
                    kc.field_g.d(var6, var8, var2 - -we.field_c, var5, -1);
                    var2 = var2 + (vh.field_b + js.field_e + uo.field_g);
                    break L7;
                  } else {
                    lq.field_k.d(var6, var8, var2 - -sp.field_r, var5, -1);
                    var2 = var2 + fe.field_A;
                    break L7;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "rg.B(" + 94 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int[] param3, int[] param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 > param0) {
                L2: {
                  var5_int = (param0 + param2) / 2;
                  var6 = param0;
                  var7 = param4[var5_int];
                  param4[var5_int] = param4[param2];
                  param4[param2] = var7;
                  var8 = param3[var5_int];
                  param3[var5_int] = param3[param2];
                  param3[param2] = var8;
                  if (var7 != 2147483647) {
                    stackOut_7_0 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_8_0 = stackOut_6_0;
                    break L2;
                  }
                }
                var9 = stackIn_8_0;
                var10 = param0;
                L3: while (true) {
                  if (param2 <= var10) {
                    param4[param2] = param4[var6];
                    param4[var6] = var7;
                    param3[param2] = param3[var6];
                    param3[var6] = var8;
                    rg.a(param0, -2147483648, -1 + var6, param3, param4);
                    rg.a(1 + var6, -2147483648, param2, param3, param4);
                    break L1;
                  } else {
                    L4: {
                      if (-(var9 & var10) + var7 >= param4[var10]) {
                        break L4;
                      } else {
                        var11 = param4[var10];
                        param4[var10] = param4[var6];
                        param4[var6] = var11;
                        var12 = param3[var10];
                        param3[var10] = param3[var6];
                        int incrementValue$1 = var6;
                        var6++;
                        param3[incrementValue$1] = var12;
                        break L4;
                      }
                    }
                    var10++;
                    continue L3;
                  }
                }
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("rg.F(").append(param0).append(',').append(-2147483648).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
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
