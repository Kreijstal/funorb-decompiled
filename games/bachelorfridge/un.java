/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un {
    byte[] field_j;
    static int[] field_a;
    byte[] field_b;
    int field_g;
    static kv field_m;
    static int field_i;
    int field_d;
    int field_e;
    int field_l;
    int field_h;
    static String field_f;
    int field_c;
    int field_k;

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_f = null;
              if (param0 == 2) {
                break L1;
              } else {
                boolean discarded$2 = un.a(false, -119, 88, 16);
                break L1;
              }
            }
            field_a = null;
            field_m = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "un.C(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 >= 82) {
              if (~Math.abs(param2) <= ~Math.abs(param1)) {
                if (~Math.abs(param2) >= ~Math.abs(param1)) {
                  if (param2 < 0) {
                    L1: {
                      if (param1 >= 0) {
                        stackOut_35_0 = 2;
                        stackIn_36_0 = stackOut_35_0;
                        break L1;
                      } else {
                        stackOut_33_0 = 1;
                        stackIn_36_0 = stackOut_33_0;
                        break L1;
                      }
                    }
                    break L0;
                  } else {
                    if (0 >= param2) {
                      stackOut_30_0 = 0;
                      stackIn_31_0 = stackOut_30_0;
                      return stackIn_31_0;
                    } else {
                      L2: {
                        if (param1 < 0) {
                          stackOut_28_0 = 4;
                          stackIn_29_0 = stackOut_28_0;
                          break L2;
                        } else {
                          stackOut_26_0 = 3;
                          stackIn_29_0 = stackOut_26_0;
                          break L2;
                        }
                      }
                      return stackIn_29_0;
                    }
                  }
                } else {
                  L3: {
                    if (param2 < 0) {
                      stackOut_17_0 = 2;
                      stackIn_18_0 = stackOut_17_0;
                      break L3;
                    } else {
                      stackOut_15_0 = 4;
                      stackIn_18_0 = stackOut_15_0;
                      break L3;
                    }
                  }
                  return stackIn_18_0;
                }
              } else {
                L4: {
                  if (param1 < 0) {
                    stackOut_9_0 = 1;
                    stackIn_10_0 = stackOut_9_0;
                    break L4;
                  } else {
                    stackOut_7_0 = 3;
                    stackIn_10_0 = stackOut_7_0;
                    break L4;
                  }
                }
                return stackIn_10_0;
              }
            } else {
              stackOut_1_0 = -51;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "un.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_36_0;
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_56_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_40_0 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                if (gk.field_a[param1] > gk.field_a[param3]) {
                  stackOut_26_0 = 1;
                  stackIn_27_0 = stackOut_26_0;
                  return stackIn_27_0 != 0;
                } else {
                  if (gk.field_a[param1] >= gk.field_a[param3]) {
                    if (uc.field_k[param3] >= uc.field_k[param1]) {
                      if (uc.field_k[param1] < uc.field_k[param3]) {
                        stackOut_37_0 = 0;
                        stackIn_38_0 = stackOut_37_0;
                        return stackIn_38_0 != 0;
                      } else {
                        break L1;
                      }
                    } else {
                      stackOut_32_0 = 1;
                      stackIn_33_0 = stackOut_32_0;
                      return stackIn_33_0 != 0;
                    }
                  } else {
                    stackOut_29_0 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    return stackIn_30_0 != 0;
                  }
                }
              } else {
                if (uc.field_k[param1] > uc.field_k[param3]) {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                } else {
                  if (uc.field_k[param1] < uc.field_k[param3]) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0 != 0;
                  } else {
                    if (~gk.field_a[param3] > ~gk.field_a[param1]) {
                      stackOut_16_0 = 1;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0 != 0;
                    } else {
                      if (~gk.field_a[param1] > ~gk.field_a[param3]) {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0 != 0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            if (param2 == -17596) {
              var4_int = uda.field_X[param3] + sc.field_o[param3] + mba.field_a[param3];
              var5 = sc.field_o[param1] + mba.field_a[param1] - -uda.field_X[param1];
              if (~var4_int > ~var5) {
                stackOut_45_0 = 1;
                stackIn_46_0 = stackOut_45_0;
                return stackIn_46_0 != 0;
              } else {
                if (var4_int > var5) {
                  stackOut_50_0 = 0;
                  stackIn_51_0 = stackOut_50_0;
                  return stackIn_51_0 != 0;
                } else {
                  L2: {
                    if (param1 <= param3) {
                      stackOut_55_0 = 0;
                      stackIn_56_0 = stackOut_55_0;
                      break L2;
                    } else {
                      stackOut_53_0 = 1;
                      stackIn_56_0 = stackOut_53_0;
                      break L2;
                    }
                  }
                  break L0;
                }
              }
            } else {
              stackOut_40_0 = 0;
              stackIn_41_0 = stackOut_40_0;
              return stackIn_41_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var4, "un.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_56_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "We've filled your shopping bag with some free food! Click on the shopping bag to see what you have in stock.";
    }
}
