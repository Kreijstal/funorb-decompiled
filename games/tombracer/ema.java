/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ema implements isa {
    static String field_a;
    static int field_b;

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (param0.field_p < var6_int) {
                L2: {
                  if (param2 == 16777215) {
                    break L2;
                  } else {
                    boolean discarded$1 = ema.a(false, 4, -88, -72, -24);
                    break L2;
                  }
                }
                var6_int = 1;
                L3: while (true) {
                  if (var6_int > 5) {
                    break L0;
                  } else {
                    L4: {
                      var7 = param0.field_m + param0.field_i + (param1 + -(param0.field_m >> 1) + -5) - -var6_int;
                      var8 = (param0.field_m >> 1) + -(var6_int * 2);
                      var9 = (param0.field_p - 4 >> 1) + (param0.field_n + (param3 - -var6_int));
                      if (bea.field_h > var9) {
                        break L4;
                      } else {
                        if (bea.field_k > var9) {
                          L5: {
                            if (var7 <= bea.field_b) {
                              break L5;
                            } else {
                              bea.field_l[var9 * bea.field_g - (-var7 + 1)] = sea.c(16711422, bea.field_l[var7 + (bea.field_g * var9 - 1)]) >> 1;
                              break L5;
                            }
                          }
                          if (var7 + var8 >= bea.field_d) {
                            break L4;
                          } else {
                            bea.field_l[var7 + var9 * bea.field_g + var8] = sea.c(8355711, bea.field_l[var8 + bea.field_g * var9 + var7] >> 1);
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    bea.c(var7, var9, var8, 0);
                    var6_int++;
                    continue L3;
                  }
                }
              } else {
                var7 = 152 - -(var6_int * 48 / param0.field_p);
                var8 = var7 | (var7 << 16 | var7 << 8);
                bea.c(param0.field_i + param1, param0.field_n + (param3 + var6_int), param0.field_m, var8);
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6;
            stackOut_17_1 = new StringBuilder().append("ema.B(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        jpa var8 = null;
        jpa var9 = null;
        int stackIn_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var8 = lm.field_p[param3];
          var9 = var8;
          var6 = 0;
          if (param0) {
            var9.b();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param2 < param1) {
            break L1;
          } else {
            if (0 > param4) {
              break L1;
            } else {
              if (param2 >= var9.field_i) {
                break L1;
              } else {
                if (param4 < var9.field_a) {
                  L2: {
                    var6 = var9.field_f[param2 + param4 * var8.field_i];
                    if (var6 >= 0) {
                      if (0 < var8.field_g[var6]) {
                        stackOut_15_0 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        break L2;
                      } else {
                        stackOut_14_0 = 0;
                        stackIn_17_0 = stackOut_14_0;
                        break L2;
                      }
                    } else {
                      stackOut_12_0 = 0;
                      stackIn_17_0 = stackOut_12_0;
                      break L2;
                    }
                  }
                  L3: {
                    var7 = stackIn_17_0;
                    if (param0) {
                      var9.b();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return var7 != 0;
                } else {
                  break L1;
                }
              }
            }
          }
        }
        if (param0) {
          var9.b();
          return false;
        } else {
          return false;
        }
    }

    public static void a() {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Your email address is used to identify this account";
    }
}
