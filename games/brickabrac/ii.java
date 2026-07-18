/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends nm {
    int field_o;
    static String field_l;
    int field_p;
    static boolean field_j;
    static int field_q;
    static String[] field_r;
    int field_n;
    int field_k;
    int field_m;
    static String field_s;
    int field_t;
    int[] field_i;

    final void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            ((ii) this).field_k = param7;
            ((ii) this).field_m = param2;
            ((ii) this).field_n = param1;
            ((ii) this).field_o = param6;
            ((ii) this).field_p = param3;
            ((ii) this).field_t = param5;
            if (param4 == -161) {
              ((ii) this).field_i = param0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ii.A(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static boolean a(boolean param0, char param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 < 32) {
                break L1;
              } else {
                if (126 < param1) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
            if (param0) {
              L2: {
                if (param1 < 160) {
                  break L2;
                } else {
                  if (255 < param1) {
                    break L2;
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                }
              }
              L3: {
                if (param1 == 8364) {
                  break L3;
                } else {
                  if (param1 == 338) {
                    break L3;
                  } else {
                    if (param1 == 8212) {
                      break L3;
                    } else {
                      if (param1 == 339) {
                        break L3;
                      } else {
                        if (param1 != 376) {
                          stackOut_30_0 = 0;
                          stackIn_31_0 = stackOut_30_0;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_28_0 = 1;
              stackIn_29_0 = stackOut_28_0;
              return stackIn_29_0 != 0;
            } else {
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "ii.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_31_0 != 0;
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 20888) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            field_l = null;
            field_r = null;
            field_s = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "ii.B(" + param0 + ')');
        }
    }

    ii() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[16];
        field_l = "Only show lobby chat from my friends";
        field_q = 2;
        field_s = "<%0> installed";
    }
}
