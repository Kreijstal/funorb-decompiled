/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    static String field_b;
    static String field_a;

    final static int[] a(int param0, int param1, double[] param2) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Chess.field_G;
        try {
          L0: {
            var6 = new int[param2.length];
            var3 = var6;
            var4 = param1 + param2.length;
            L1: while (true) {
              if ((var4 ^ -1) > -1) {
                stackIn_5_0 = (int[]) (var3);
                break L0;
              } else {
                var6[var4] = (int)(0.5 + (double)(1 << param0) * param2[var4]);
                var4--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("rd.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    final static km a(int param0, int param1, int param2) {
        int var5 = Chess.field_G;
        km var6 = new km(param0, param0);
        km var3 = var6;
        int var4 = 0;
        if (param2 != 14727) {
            return (km) null;
        }
        while (var4 < var3.field_x.length) {
            var6.field_x[var4] = param1;
            var4++;
        }
        return var3;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 32286) {
            field_a = (String) null;
        }
    }

    static {
        field_a = "Please try again in a few minutes.";
        field_b = "to keep fullscreen or";
    }
}
