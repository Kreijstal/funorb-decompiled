/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static String field_a;
    static String field_b;
    static int[] field_c;

    final static wd a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        wd stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        wd stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_3_0 = null;
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
              if (param0 == 0) {
                break L1;
              } else {
                field_c = (int[]) null;
                break L1;
              }
            }
            if (mh.field_b != du.field_d) {
              L2: {
                if (mh.field_b != lm.field_d) {
                  break L2;
                } else {
                  if (param1.equals(jh.field_j)) {
                    mh.field_b = nb.field_i;
                    stackOut_10_0 = vl.field_k;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              jh.field_j = param1;
              mh.field_b = du.field_d;
              vl.field_k = null;
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("ji.B(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (wd) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (wd) ((Object) stackIn_9_0);
          } else {
            return stackIn_11_0;
          }
        }
    }

    final static lk a(boolean param0) {
        lk discarded$8 = null;
        if (!param0) {
          L0: {
            discarded$8 = ji.a(false);
            if (wi.field_f == null) {
              wi.field_f = new lk(gl.field_e, 20, 0, 0, 0, 11579568, -1, 0, 0, gl.field_e.field_H, -1, 2147483647, true);
              break L0;
            } else {
              break L0;
            }
          }
          return wi.field_f;
        } else {
          L1: {
            if (wi.field_f == null) {
              wi.field_f = new lk(gl.field_e, 20, 0, 0, 0, 11579568, -1, 0, 0, gl.field_e.field_H, -1, 2147483647, true);
              break L1;
            } else {
              break L1;
            }
          }
          return wi.field_f;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != 0) {
            field_b = (String) null;
        }
    }

    static {
        field_a = "This item can only be used on your own units.";
        field_b = "Set up new game";
        field_c = new int[8192];
    }
}
