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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Chess.field_G;
        var3 = 0;
        var4 = param0.length();
        var6 = -83 / ((75 - param1) / 49);
        var5 = 0;
        L0: while (true) {
          if (var5 >= var4) {
            return var3;
          } else {
            if (param2 == param0.charAt(var5)) {
              var3++;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (!(wb.field_c < param2 + param0 + param1)) {
            return param2 + param0;
        }
        if (!(-param1 + param0 < param3)) {
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
                var3 = rh.a(var3, param0, (byte) -87);
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

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        field_e = null;
        field_f = null;
        field_g = null;
        int var1 = 98 / ((25 - param0) / 38);
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
