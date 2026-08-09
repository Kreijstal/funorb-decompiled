/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends hg {
    boolean field_h;
    oc field_i;
    static ed field_j;
    int field_q;
    hl field_o;
    int field_n;
    int field_m;
    int field_l;
    int field_p;
    int field_g;
    int field_k;
    int field_r;

    public static void a(byte param0) {
        field_j = null;
        int var1 = -26 / ((param0 - 26) / 58);
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param2 = ca.a(-1, '_', param2, "");
              var3 = na.a(param2, false);
              if (param0 < -77) {
                break L1;
              } else {
                field_j = (ed) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (0 != (param1.indexOf(param2) ^ -1)) {
                  break L3;
                } else {
                  if (0 == (param1.indexOf(var3) ^ -1)) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("pi.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    pi() {
    }

    static {
    }
}
