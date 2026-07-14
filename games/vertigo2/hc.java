/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static int field_b;
    static int field_a;

    final static void a(int param0, int param1) {
        mi var2 = null;
        Object var3 = null;
        var2 = uh.field_Wb;
        var2.j(param1, 122);
        var2.f(1, -117);
        if (param0 >= -25) {
          var3 = null;
          hc.a((String) null, -33, true, (java.applet.Applet) null);
          var2.f(1, -90);
          return;
        } else {
          var2.f(1, -90);
          return;
        }
    }

    final static void a(String param0, int param1, boolean param2, java.applet.Applet param3) {
        try {
            if (jj.field_v.startsWith("win")) {
                if (eb.a(param0, true)) {
                    return;
                }
            }
            try {
                if (param1 != 16011) {
                    Object var5 = null;
                    hc.a((String) null, -87, false, (java.applet.Applet) null);
                }
                param3.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                ke.a((Throwable) null, "MGR1: " + param0, 0);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
