/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh implements dh {
    private int field_b;
    private int field_k;
    private int field_j;
    private int field_c;
    private int field_e;
    static rd field_f;
    private int field_g;
    private int field_d;
    private qi field_h;
    static ll field_a;
    static uf field_i;

    public static void a(boolean param0) {
        field_i = null;
        field_f = null;
        field_a = null;
    }

    vh(qi param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((vh) this).field_h = param0;
            ((vh) this).field_g = param2;
            ((vh) this).field_c = param4;
            ((vh) this).field_k = param7;
            ((vh) this).field_b = param6;
            ((vh) this).field_j = param5;
            ((vh) this).field_e = param3;
            ((vh) this).field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "vh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static int a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            if (param1.equalsIgnoreCase("red")) {
              break L0;
            } else {
              if (param1.equalsIgnoreCase("weapons")) {
                break L0;
              } else {
                L1: {
                  if (param0 > 93) {
                    break L1;
                  } else {
                    vh.a(true);
                    break L1;
                  }
                }
                L2: {
                  if (param1.equalsIgnoreCase("green")) {
                    break L2;
                  } else {
                    if (param1.equalsIgnoreCase("speed")) {
                      break L2;
                    } else {
                      L3: {
                        if (param1.equalsIgnoreCase("blue")) {
                          break L3;
                        } else {
                          if (param1.equalsIgnoreCase("shields")) {
                            break L3;
                          } else {
                            if (!param1.equalsIgnoreCase("black")) {
                              throw new IllegalArgumentException();
                            } else {
                              stackOut_18_0 = 3;
                              stackIn_19_0 = stackOut_18_0;
                              return stackIn_19_0;
                            }
                          }
                        }
                      }
                      stackOut_15_0 = 2;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  }
                }
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("vh.B(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
    }

    public final void a(boolean param0, int param1, int param2, n param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hg var14 = null;
        n stackIn_3_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        n stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof hg)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (n) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (n) param3;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var14 = (hg) (Object) stackIn_3_0;
              if (var14 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              tc.f(param3.field_k + param1, param4 - -param3.field_o, param3.field_x, param3.field_u, ((vh) this).field_k);
              var7 = var14.field_G + (param3.field_k + param1);
              var8 = var14.field_J + (param4 - -param3.field_o);
              tc.d(var7, var8, var14.field_P, ((vh) this).field_j);
              if (var14.field_L == -1) {
                break L3;
              } else {
                var9 = 2.0 * ((double)var14.field_L * 3.141592653589793) / (double)var14.field_O;
                var11 = (int)(-Math.sin(var9) * (double)var14.field_P);
                var12 = (int)(Math.cos(var9) * (double)var14.field_P);
                tc.d(var7 - -var11, var12 + var8, 1, ((vh) this).field_b);
                break L3;
              }
            }
            L4: {
              tc.d(var7, var8, 2, 1);
              var9 = 2.0 * ((double)var14.field_K * 3.141592653589793) / (double)var14.field_O;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_P);
              if (param2 <= -48) {
                break L4;
              } else {
                ((vh) this).field_g = -87;
                break L4;
              }
            }
            var12 = (int)(Math.cos(var9) * (double)var14.field_P);
            tc.d(var7, var8, var7 + var11, var8 + var12, 1);
            if (((vh) this).field_h != null) {
              var13 = var14.field_P + var14.field_G - -((vh) this).field_d;
              int discarded$1 = ((vh) this).field_h.a(param3.field_q, param1 + (param3.field_k + var13), param4 + param3.field_o - -((vh) this).field_g, -((vh) this).field_d + (-var13 + param3.field_x), param3.field_u - (((vh) this).field_d << 1), ((vh) this).field_e, ((vh) this).field_c, 1, 1, 0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("vh.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = (rd) (Object) new le(7, 30.0f, new int[2]);
        field_a = new ll();
    }
}
