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
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        hg stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        hg stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        var4 = Chess.field_G;
        try {
          L0: {
            var2 = ln.l(2);
            var3 = param1;
            L1: while (true) {
              L2: {
                if (~var2.length >= ~var3) {
                  break L2;
                } else {
                  if (~var2[var3].field_e != ~param0) {
                    var3++;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  } else {
                    stackOut_4_0 = var2[var3];
                    stackIn_5_0 = stackOut_4_0;
                    return stackIn_5_0;
                  }
                }
              }
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var2_ref, "li.A(" + param0 + ',' + param1 + ')');
        }
        return (hg) (Object) stackIn_8_0;
    }

    public static void a(int param0) {
        try {
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
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "li.C(" + param0 + ')');
        }
    }

    final static km a(int param0, byte param1, um param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        km stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        km stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!tj.a(param3, param0, param2, (byte) 83)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (km) (Object) stackIn_4_0;
            } else {
              if (param1 == -2) {
                stackOut_8_0 = hl.a(param1 + 2);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (km) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("li.B(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_a = "Please send me news and updates (I can unsubscribe at any time)";
        field_d = new double[65536];
        field_e = new double[65536];
        var0 = 0;
        L0: while (true) {
          if (65536 <= var0) {
            field_c = "You cannot join this game - it is in progress";
            field_b = "Error connecting to server. Please try using a different server.";
            return;
          } else {
            field_d[var0] = Math.sin(3.141592653589793 * (double)var0 / 32768.0);
            field_e[var0] = Math.cos((double)var0 * 3.141592653589793 / 32768.0);
            var0++;
            continue L0;
          }
        }
    }
}
