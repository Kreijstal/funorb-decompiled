/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static double[][] field_a;
    static bi field_b;

    public static void b(int param0) {
        field_a = null;
        field_b = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            L1: {
              L2: {
                if (null == jh.field_x) {
                  break L2;
                } else {
                  if (null != de.field_d) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              jh.field_x = new int[256];
              de.field_d = new int[256];
              var1_int = 0;
              L3: while (true) {
                if (256 <= var1_int) {
                  break L1;
                } else {
                  var2 = 6.283185307179586 * ((double)var1_int / 255.0);
                  jh.field_x[var1_int] = (int)(4096.0 * Math.sin(var2));
                  de.field_d[var1_int] = (int)(Math.cos(var2) * 4096.0);
                  var1_int++;
                  continue L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "ie.D(" + 14837 + ')');
        }
    }

    final static double[] a(int param0, int param1, int param2, double[] param3, int param4, int param5, int param6, int param7, int param8, int param9, byte param10) {
        int var11_int = 0;
        RuntimeException var11 = null;
        double[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        double[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var11_int = 88 % ((51 - param10) / 58);
            stackOut_0_0 = qa.a(param9 * 100, param0, param1 * 100, 100 * param6, param2 * 100, param5 * 100, (byte) -42, param4, param8, param3, param7 * 100);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var11 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var11;
            stackOut_2_1 = new StringBuilder().append("ie.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param3 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
        return stackIn_1_0;
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new double[8][3];
    }
}
