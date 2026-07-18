/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    static String field_a;
    static String field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 < 6) {
            sn.a(-121, 89, 108, 123, 4, -128);
        }
        field_b = null;
    }

    final static void a() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (js.field_j < 0) {
          return;
        } else {
          L0: {
            var3 = 185;
            var4 = 205;
            var5 = 256;
            if (js.field_j < 75) {
              var5 = (js.field_j << 8) / 75;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (js.field_j <= 200) {
              break L1;
            } else {
              var5 = (-js.field_j + 250 << 8) / 50;
              break L1;
            }
          }
          L2: {
            aq.a((byte) -40, in.field_i);
            wn.c();
            gf.b();
            gq.e(-70);
            if (var5 < 256) {
              gf.c(0, 0, gf.field_b, gf.field_k, 0, 256 - var5);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            ln.f((byte) -47);
            if (js.field_j >= 150) {
              qa.field_q.a(15 + var3, var4 - -10, var5);
              break L3;
            } else {
              in.field_i.d(var3, var4);
              break L3;
            }
          }
          L4: {
            var6 = -125 + js.field_j;
            if (var6 <= 0) {
              break L4;
            } else {
              if (var6 >= 50) {
                break L4;
              } else {
                if (var6 >= 20) {
                  if (var6 < 30) {
                    rf.field_h.c(var3, var4, 256);
                    break L4;
                  } else {
                    var7 = 256 * (50 - var6) / 20;
                    rf.field_h.c(var3, var4, var7);
                    break L4;
                  }
                } else {
                  var7 = var6 * 256 / 20;
                  rf.field_h.c(var3, var4, var7);
                  break L4;
                }
              }
            }
          }
          L5: {
            var6 = js.field_j + -140;
            if (var6 <= 0) {
              break L5;
            } else {
              L6: {
                var7 = 256;
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                  break L6;
                } else {
                  break L6;
                }
              }
              ak.field_z.a(15 + var3, 10 + var4, var7 * var5 >> 8);
              break L5;
            }
          }
          return;
        }
    }

    final static String a(char param0) {
        return String.valueOf(param0);
    }

    final static void a(int[] param0, byte param1, sd param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ln var4 = null;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = param2.j(18229);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                var3_int = 0;
                L2: while (true) {
                  if (4 <= var3_int) {
                    var4 = param2.h(-23410);
                    continue L1;
                  } else {
                    param0[var3_int] = param0[var3_int] + var4.field_G[var3_int];
                    var3_int++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("sn.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(-76).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param3 != 256) {
              if (param3 != 0) {
                if (param3 != 128) {
                  L1: {
                    if (param4 >= 0) {
                      break L1;
                    } else {
                      param0 = param0 + param4;
                      param4 = 0;
                      break L1;
                    }
                  }
                  L2: {
                    if (0 > param5) {
                      param2 = param2 + param5;
                      param5 = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (param4 - -param0 <= gf.field_b) {
                      break L3;
                    } else {
                      param0 = gf.field_b - param4;
                      break L3;
                    }
                  }
                  L4: {
                    var6_int = 49 / ((param1 - 38) / 61);
                    if (param2 + param5 > gf.field_k) {
                      param2 = gf.field_k + -param5;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  param4--;
                  var7 = param5 + param2;
                  var8 = param5;
                  L5: while (true) {
                    if (var8 >= var7) {
                      break L0;
                    } else {
                      var9 = param4 + var8 * gf.field_b;
                      var10 = param0;
                      L6: while (true) {
                        if (0 >= var10) {
                          var8++;
                          continue L5;
                        } else {
                          var9++;
                          var11 = gf.field_h[var9];
                          var12 = var11 & 16711935;
                          var13 = var11 & 65280;
                          var12 = var12 * param3;
                          var12 = var12 & -16711936;
                          var13 = var13 * param3;
                          var13 = var13 & 16711680;
                          var11 = (var13 | var12) >> 8;
                          gf.field_h[var9] = var11;
                          var10--;
                          continue L6;
                        }
                      }
                    }
                  }
                } else {
                  gf.h(param4, param5, param0, param2);
                  return;
                }
              } else {
                gf.d(param4, param5, param0, param2, 0);
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var6, "sn.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Quick Chat game";
        field_b = "Fullscreen";
    }
}
