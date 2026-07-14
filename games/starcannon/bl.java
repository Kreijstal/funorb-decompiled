/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static int field_a;
    static String field_c;
    static jc field_b;

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != -29584) {
          var2 = null;
          bl.a(true, (java.applet.Applet) null);
          field_c = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          return;
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                if (param0) {
                    field_a = 90;
                }
                param1.getAppletContext().showDocument(wh.a(127, var2, param1), "_top");
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
        field_c = "Logging in...";
    }
}
