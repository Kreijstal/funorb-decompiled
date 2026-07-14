/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static String field_b;
    static rj field_c;
    static cn field_a;

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
            if (param0 <= 64) {
                return;
            }
            try {
                param1.getAppletContext().showDocument(j.a((byte) 115, var2, param1), "_top");
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
        field_c = null;
        if (param0 != 2601) {
            return;
        }
        field_a = null;
    }

    final static q a(byte param0, nh param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        if (param0 >= -78) {
          field_b = null;
          var4 = param1.a(param2, 1000);
          var5 = param1.a(0, param3, var4);
          return fl.a(-1, param1, var5, var4);
        } else {
          var4 = param1.a(param2, 1000);
          var5 = param1.a(0, param3, var4);
          return fl.a(-1, param1, var5, var4);
        }
    }

    static {
    }
}
