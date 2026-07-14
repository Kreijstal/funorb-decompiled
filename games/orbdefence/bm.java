/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    static String field_c;
    static String field_a;
    static String field_b;
    static sk field_d;
    static boolean field_e;

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 63) {
          bm.a(122);
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            String var2 = param1.getDocumentBase().getFile();
            int var3 = var2.indexOf('?');
            String var4 = "reload.ws";
            if (!((var3 ^ -1) > -1)) {
                var4 = var4 + var2.substring(var3);
            }
            java.net.URL var5 = new java.net.URL(param1.getCodeBase(), var4);
            if (param0 != 12979) {
                return;
            }
            try {
                param1.getAppletContext().showDocument(f.a(param1, var5, -21), "_self");
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
        field_c = "Discard";
        field_a = null;
        field_b = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_e = false;
    }
}
