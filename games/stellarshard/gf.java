/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static String field_a;
    static String field_b;
    static int field_c;

    final static ek a(byte param0, ek param1, int[] param2) {
        ek var3 = null;
        var3 = new ek(0, 0, 0);
        var3.field_b = param1.field_b;
        var3.field_m = param1.field_m;
        var3.field_e = param1.field_e;
        var3.field_a = param1.field_a;
        var3.field_d = param1.field_d;
        var3.field_k = param1.field_k;
        if (param0 <= 121) {
          field_b = null;
          var3.field_i = param1.field_i;
          var3.field_n = param2;
          return var3;
        } else {
          var3.field_i = param1.field_i;
          var3.field_n = param2;
          return var3;
        }
    }

    final static void a(java.applet.Applet param0, String param1, int param2) {
        try {
            java.net.URL var3 = null;
            if (param2 != 16729) {
                return;
            }
            try {
                var3 = new java.net.URL(param0.getCodeBase(), param1);
                var3 = lk.a(param0, var3, 78);
                fk.a(param0, true, var3.toString(), (byte) 86);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -84) {
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Ion gun";
        field_b = "FULLSCREEN OFF";
    }
}
