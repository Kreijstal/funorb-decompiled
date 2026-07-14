/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static int field_a;
    static int field_e;
    static int field_c;
    static rc field_b;
    static String field_d;

    final static void a(String param0, java.applet.Applet param1, boolean param2, int param3) {
        try {
            if (param3 != -20517) {
                return;
            }
            if (!(!ec.field_n.startsWith("win"))) {
                if (!(!kj.a(param0, 27994))) {
                    return;
                }
            }
            try {
                param1.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                ae.a((Throwable) null, param3 ^ -30848, "MGR1: " + param0);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 61) {
            return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        mg var4 = null;
        var3 = ZombieDawn.field_J;
        var4 = (mg) (Object) bg.field_i.b((byte) 26);
        L0: while (true) {
          if (var4 == null) {
            if (param0 != 0) {
              field_e = -110;
              return;
            } else {
              return;
            }
          } else {
            oe.a(param1, -19004, var4);
            var4 = (mg) (Object) bg.field_i.a(false);
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "You are not currently logged in to the<nbsp>game.";
        field_b = null;
    }
}
