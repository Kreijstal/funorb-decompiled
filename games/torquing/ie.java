/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static double[][] field_a;
    static bi field_b;

    public static void b(int param0) {
        field_a = (double[][]) null;
        if (param0 != -1674) {
            return;
        }
        field_b = null;
    }

    final static void a(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = Torquing.field_u;
        if (param0 != 14837) {
            return;
        }
        try {
            if (null == jh.field_x || null == de.field_d) {
                jh.field_x = new int[256];
                de.field_d = new int[256];
                for (var1_int = 0; 256 > var1_int; var1_int++) {
                    var2 = 6.283185307179586 * ((double)var1_int / 255.0);
                    jh.field_x[var1_int] = (int)(4096.0 * Math.sin(var2));
                    de.field_d[var1_int] = (int)(Math.cos(var2) * 4096.0);
                }
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "ie.D(" + param0 + ')');
        }
    }

    final static double[] a(int param0, int param1, int param2, double[] param3, int param4, int param5, int param6, int param7, int param8, int param9, byte param10) {
        int var11_int = 0;
        RuntimeException var11 = null;
        double[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var11_int = 88 % ((51 - param10) / 58);
            stackIn_1_0 = qa.a(param9 * 100, param0, param1 * 100, 100 * param6, param2 * 100, param5 * 100, (byte) -42, param4, param8, param3, param7 * 100);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var11 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var11);

            stackIn_4_1 = new StringBuilder().append("ie.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
        return stackIn_1_0;
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        field_a = new double[8][3];
    }
}
