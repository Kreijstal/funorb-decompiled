/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends ne {
    static String field_k;
    static boolean field_j;
    int field_l;
    ne field_o;
    static String field_m;
    static int field_i;
    ni field_n;

    final static int a(byte param0, int param1, int param2) {
        if (!(-1 != ce.field_p)) {
            return hc.field_b;
        }
        int var5 = 119 / ((-85 - param0) / 41);
        double var3 = (double)ce.field_p / 50.0;
        double var6 = (-Math.cos(3.141592653589793 * var3) + 1.0) / 2.0;
        return (int)(var6 * (double)(param2 + -param1)) + param1;
    }

    final static cn a(int param0, byte param1, int param2, int param3, int param4, cn param5) {
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
        cn stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        cn stackOut_28_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var14 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var6_int = 0;
              var7 = 0;
              if (param3 < 0) {
                var6_int = var6_int - param3;
                param4 = param4 + param3;
                param3 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 >= 0) {
                break L2;
              } else {
                param2 = param2 + param0;
                var7 = var7 - param0;
                param0 = 0;
                break L2;
              }
            }
            L3: {
              if (gf.field_i >= param4 + param3) {
                break L3;
              } else {
                param4 = gf.field_i + -param3;
                break L3;
              }
            }
            L4: {
              if (param0 - -param2 <= gf.field_c) {
                break L4;
              } else {
                param2 = -param0 + gf.field_c;
                break L4;
              }
            }
            if (param4 >= 0) {
              if (0 <= param2) {
                L5: {
                  if (param1 > 92) {
                    break L5;
                  } else {
                    field_j = false;
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    if (param5 == null) {
                      break L7;
                    } else {
                      if (param5.field_y < param4) {
                        break L7;
                      } else {
                        if (param5.field_v < param2) {
                          break L7;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  param5 = new cn(param4, param2);
                  break L6;
                }
                var8 = -param4 + gf.field_i;
                var9 = -param4 + param5.field_y;
                var10 = param3 + gf.field_i * param0;
                var11 = -1;
                var12 = -param2;
                L8: while (true) {
                  if (var12 >= 0) {
                    param5.field_w = var6_int;
                    param5.field_A = var7;
                    stackOut_28_0 = (cn) param5;
                    stackIn_29_0 = stackOut_28_0;
                    break L0;
                  } else {
                    var13 = -param4;
                    L9: while (true) {
                      if (0 <= var13) {
                        var11 = var11 + var9;
                        var10 = var10 + var8;
                        var12++;
                        continue L8;
                      } else {
                        var11++;
                        param5.field_B[var11] = gf.field_b[var10];
                        var13++;
                        var10++;
                        continue L9;
                      }
                    }
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("fa.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param5 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
        }
        return stackIn_29_0;
    }

    public static void a() {
        field_k = null;
        field_m = null;
    }

    final void a(int param0, int param1) {
        int var3 = -119 / ((param1 - -68) / 41);
        ((fa) this).field_l = param0;
        ((fa) this).field_n.h(128 + oo.field_d * param0 >> 8);
    }

    fa(ni param0, ne param1) {
        try {
            ((fa) this).field_n = param0;
            ((fa) this).field_l = param0.i();
            ((fa) this).field_o = param1;
            ((fa) this).field_n.h(oo.field_d * ((fa) this).field_l - -128 >> 8);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "fa.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Achieved";
        field_k = "A vast pit occupies almost all of this room, except for a narrow ledge. There is no way to gauge its depth. A raider who falls here will continue falling for some time.<br><br>This trap will kill defeated raiders, even if they have abilities that would normally prevent death.";
    }
}
