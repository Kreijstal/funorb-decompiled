/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static String field_c;
    static String field_b;
    static mp field_a;
    static String field_d;
    static int[] field_e;

    public static void a(int param0) {
        Object var2 = null;
        field_c = null;
        field_a = null;
        if (param0 != 18031) {
          var2 = null;
          ue.a((java.applet.Applet) null, false, (String) null, -37);
          field_e = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_e = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    final static void a(java.applet.Applet param0, boolean param1, String param2, int param3) {
        try {
            if (param3 >= -75) {
                return;
            }
            if (qb.field_b.startsWith("win")) {
                if (!(!af.b(param2, -1495))) {
                    return;
                }
            }
            try {
                param0.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                jq.a(-29901, (Throwable) null, "MGR1: " + param2);
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
        field_c = "Game Type: Points";
        field_b = "Click to hide the Projects window.";
        field_a = new mp();
        field_d = "Off";
    }
}
