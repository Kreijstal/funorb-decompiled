/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static String field_a;
    static int[] field_c;
    static String field_b;

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            if (param1 != 2) {
                gm.a(false);
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                param0.getAppletContext().showDocument(gh.a(param0, var2, (byte) 67), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        if (!param0) {
            gm.a(false);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static boolean a(db param0, int param1, boolean param2, int param3) {
        byte[] var5 = param0.b(param1, 0, param3);
        byte[] var4 = var5;
        if (!param2) {
            return false;
        }
        if (!(var5 != null)) {
            return false;
        }
        h.a(var5, param2);
        return true;
    }

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        L0: {
          var4 = 0;
          if (param0) {
            var4 += 4;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param1) {
            var4 += 2;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param2) {
            var4++;
            break L2;
          } else {
            break L2;
          }
        }
        if (param3 != 12184) {
          field_c = null;
          return pf.field_m[var4];
        } else {
          return pf.field_m[var4];
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_b = "To Highscores";
    }
}
