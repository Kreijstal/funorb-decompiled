/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static String field_a;
    static double[] field_d;
    static double[] field_e;
    static String field_c;
    static String field_b;
    static um field_g;
    static java.awt.Font field_f;

    final static hg a(int param0, int param1) {
        hg[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        hg[] var5 = null;
        var4 = Chess.field_G;
        var5 = ln.l(2);
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var5.length > var3) {
            if (var5[var3].field_e != param0) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          } else {
            return null;
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_d = null;
        field_b = null;
        field_f = null;
        field_g = null;
        field_c = null;
        if (param0 > -30) {
            li.a(86);
        }
    }

    final static km a(int param0, byte param1, um param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        km stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        km stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (tj.a(param3, param0, param2, (byte) 83)) {
              if (param1 == -2) {
                stackOut_6_0 = hl.a(param1 + 2);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (km) (Object) stackIn_5_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("li.B(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_a = "Please send me news and updates (I can unsubscribe at any time)";
        field_d = new double[65536];
        field_e = new double[65536];
        for (var0 = 0; 65536 > var0; var0++) {
            field_d[var0] = Math.sin(3.141592653589793 * (double)var0 / 32768.0);
            field_e[var0] = Math.cos((double)var0 * 3.141592653589793 / 32768.0);
        }
        field_c = "You cannot join this game - it is in progress";
        field_b = "Error connecting to server. Please try using a different server.";
    }
}
