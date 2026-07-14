/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jab extends rqa {
    static int[] field_o;
    static int field_p;

    jab(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          field_p = -101;
          si.a(17, 62, param0[0].a(75));
          return new nc((Object) (Object) "void");
        } else {
          si.a(17, 62, param0[0].a(75));
          return new nc((Object) (Object) "void");
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 2) {
            Object var2 = null;
            jab.a(81, (java.applet.Applet) null);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                if (param0 != 17) {
                    field_p = 68;
                }
                var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                param1.getAppletContext().showDocument(ne.a(var2, (byte) -119, param1), "_top");
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
        field_o = new int[]{2, 21, 4, 3, 11};
        field_p = 20;
    }
}
