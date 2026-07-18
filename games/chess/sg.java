/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    static String field_a;
    static StringBuilder field_c;
    static int[] field_g;
    static String field_b;
    static int field_d;
    static String field_e;
    static ag field_f;

    final static int a(CharSequence param0, byte param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = Chess.field_G;
        try {
          L0: {
            var3_int = 0;
            var4 = param0.length();
            var6 = 83;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4) {
                stackOut_6_0 = var3_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                L2: {
                  if (param2 != param0.charAt(var5)) {
                    break L2;
                  } else {
                    var3_int++;
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("sg.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + 124 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final static int a(int param0, int param1, int param2) {
        if (!(wb.field_c < param2 + param0 + param1)) {
            return param2 + param0;
        }
        if (!(-param1 + param0 < 0)) {
            return param0 - param1;
        }
        return -param1 + wb.field_c;
    }

    final static void a(java.applet.Applet param0, byte param1, String param2) {
        try {
            java.net.URL var3 = null;
            if (param1 <= 118) {
                field_a = null;
            }
            try {
                var3 = new java.net.URL(param0.getCodeBase(), param2);
                int discarded$1 = -87;
                var3 = rh.a(var3, param0);
                fe.a(var3.toString(), true, (byte) 112, param0);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a() {
        field_a = null;
        field_b = null;
        field_c = null;
        field_e = null;
        field_f = null;
        field_g = null;
        int var1 = -49;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Game";
        field_a = "<u=000001>General information</u>";
        field_e = "Continue";
        field_c = new StringBuilder(80);
        field_f = new ag();
    }
}
