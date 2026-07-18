/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends pa {
    static int field_D;

    final static int a(boolean param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0) {
          param1 = param1 & 8191;
          if (4096 <= param1) {
            L0: {
              if (param1 < 6144) {
                stackOut_18_0 = -lo.field_q[-4096 + param1];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = -lo.field_q[8192 - param1];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (param1 < 2048) {
                stackOut_14_0 = lo.field_q[param1];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = lo.field_q[4096 + -param1];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          int discarded$1 = rd.a(false, 94);
          param1 = param1 & 8191;
          if (4096 <= param1) {
            L2: {
              if (param1 < 6144) {
                stackOut_8_0 = -lo.field_q[-4096 + param1];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = -lo.field_q[8192 - param1];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (param1 < 2048) {
                stackOut_4_0 = lo.field_q[param1];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = lo.field_q[4096 + -param1];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, ga param5) {
        ij var7 = null;
        RuntimeException var7_ref = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 1) {
                break L1;
              } else {
                field_D = 107;
                break L1;
              }
            }
            L2: {
              super.a(param0, 5, param2, param3, param4, param5);
              var7 = np.field_H;
              if (var7 == null) {
                break L2;
              } else {
                if (!((rd) this).b(param3, 21224, param4, param0, param2)) {
                  break L2;
                } else {
                  if (!(((rd) this).field_v instanceof in)) {
                    if (!(var7.field_v instanceof in)) {
                      break L2;
                    } else {
                      ((in) (Object) var7.field_v).a(-12156, (rd) this, var7);
                      np.field_H = null;
                      return;
                    }
                  } else {
                    ((in) (Object) ((rd) this).field_v).a(-12156, (rd) this, var7);
                    np.field_H = null;
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var7_ref;
            stackOut_9_1 = new StringBuilder().append("rd.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param5 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    private rd(int param0, int param1, int param2, int param3, io param4, sk param5, ga param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
            ((rd) this).field_z = param6;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "rd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        f.field_b = (58 & param1) >> 4;
        c.field_c = (param1 & 13) >> 2;
        if (2 < f.field_b) {
          L0: {
            f.field_b = 2;
            if (2 < c.field_c) {
              c.field_c = 2;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            gf.field_c = param1 & 3;
            if (gf.field_c <= 2) {
              break L1;
            } else {
              gf.field_c = 2;
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (2 < c.field_c) {
              c.field_c = 2;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            gf.field_c = param1 & 3;
            if (gf.field_c <= 2) {
              break L3;
            } else {
              gf.field_c = 2;
              break L3;
            }
          }
          return;
        }
    }

    static int b(int param0, int param1) {
        return param0 ^ param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = 68;
    }
}
