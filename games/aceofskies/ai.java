/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ai {
    static String field_b;
    static int[] field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -28739) {
            return;
        }
        try {
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "ai.A(" + param0 + ')');
        }
    }

    final static w a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        w var5 = null;
        w stackIn_5_0 = null;
        w stackIn_10_0 = null;
        w stackIn_15_0 = null;
        Object stackIn_18_0 = null;
        w stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        w stackOut_9_0 = null;
        w stackOut_14_0 = null;
        w stackOut_19_0 = null;
        Object stackOut_17_0 = null;
        w stackOut_4_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (null == param0) {
                break L1;
              } else {
                if (param0.length() != 0) {
                  var2_int = param0.indexOf('@');
                  if (var2_int == -1) {
                    stackOut_9_0 = nh.field_f;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(var2_int - -1);
                    var5 = ds.a(false, var3);
                    if (null != var5) {
                      stackOut_14_0 = (w) var5;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    } else {
                      if (param1 == 12) {
                        stackOut_19_0 = in.a(126, var4);
                        stackIn_20_0 = stackOut_19_0;
                        break L0;
                      } else {
                        stackOut_17_0 = null;
                        stackIn_18_0 = stackOut_17_0;
                        return (w) (Object) stackIn_18_0;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = mo.field_a;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("ai.C(");
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param1 + ')');
        }
        return stackIn_20_0;
    }

    abstract void a(int param0, float param1, int param2, float param3, int param4, int param5, float param6, float param7, int param8, float[] param9, int param10);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Updates will sent to the email address you've given";
    }
}
