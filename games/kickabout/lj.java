/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj extends gn {
    static String field_l;
    String field_i;
    static volatile long field_e;
    static rc field_g;
    static String field_j;
    static int field_f;
    static String field_m;
    static String field_k;
    static int field_h;

    final static boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0) {
          L0: {
            field_j = (String) null;
            if (lc.field_e.a((byte) -80)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (lc.field_e.a((byte) -80)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                param1 = n.a('_', "", (byte) -124, param1);
                var3 = bo.a(-1, param1);
                var4 = 117 / ((-74 - param0) / 46);
                if (-1 != param2.indexOf(param1)) {
                  break L2;
                } else {
                  if (0 == (param2.indexOf(var3) ^ -1)) {
                    stackIn_5_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_5_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("lj.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    public static void a(int param0) {
        field_g = null;
        field_j = null;
        field_m = null;
        if (param0 >= -23) {
          field_g = (rc) null;
          field_l = null;
          field_k = null;
          return;
        } else {
          field_l = null;
          field_k = null;
          return;
        }
    }

    final static int a(int param0, boolean param1) {
        if (param1) {
            lj.a(-13);
            return 23 * param0 >> -1761140536;
        }
        return 23 * param0 >> -1761140536;
    }

    lj(String param0) {
        try {
            this.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "lj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "Loading fonts";
        field_m = "Auctions";
        field_e = 0L;
        field_f = 0;
        field_j = "Buying or selling an account";
        field_g = new rc();
        field_k = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_h = -1;
    }
}
