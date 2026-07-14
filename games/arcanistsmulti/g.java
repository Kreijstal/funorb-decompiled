/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static qb field_a;
    static String field_c;
    static kc field_g;
    static jg[] field_d;
    static ll[] field_f;
    static no field_e;
    static String field_b;

    public static void a(int param0) {
        if (param0 != 30586) {
          g.a(-51);
          field_d = null;
          field_e = null;
          field_g = null;
          field_b = null;
          field_a = null;
          field_c = null;
          field_f = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          field_g = null;
          field_b = null;
          field_a = null;
          field_c = null;
          field_f = null;
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            if (param1 != -10400) {
                return;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                param0.getAppletContext().showDocument(nm.a(param0, var2, -31843), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Unfortunately you are not eligible to create an account.";
        field_b = "Options";
    }
}
