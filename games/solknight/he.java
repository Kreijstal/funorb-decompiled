/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he {
    static int field_b;
    static nc field_d;
    static int[] field_a;
    static String field_e;
    static hi field_c;
    static String field_f;

    public static void a(boolean param0) {
        Object var2 = null;
        field_e = null;
        field_f = null;
        if (param0) {
          var2 = null;
          he.a(24, (java.applet.Applet) null);
          field_d = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static boolean a(int param0) {
        int var1 = -4 % ((param0 - 8) / 48);
        return !td.field_h.a(false) ? true : false;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                if (param0 != -1) {
                    Object var3 = null;
                    he.a(103, (java.applet.Applet) null);
                }
                var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                param1.getAppletContext().showDocument(kk.a(122, var2, param1), "_top");
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
        field_b = -1;
        field_e = "LEVEL <%0><br>COMPLETE";
        field_a = new int[16384];
        field_d = new nc();
        field_f = "Use this alternative as your account name";
    }
}
