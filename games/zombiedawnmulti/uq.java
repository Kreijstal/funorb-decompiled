/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uq {
    static pi field_b;
    static cj field_d;
    static String field_c;
    static String field_e;
    static int field_g;
    static fm field_f;
    static String field_a;

    final static void a(int param0, int param1) {
        int var3 = 0;
        kj var4 = null;
        nh var5 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 <= -6) {
          var4 = (kj) (Object) md.field_u.c(121);
          L0: while (true) {
            if (var4 == null) {
              var5 = (nh) (Object) pn.field_f.c(83);
              L1: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  ag.a((byte) 73, var5, param0);
                  var5 = (nh) (Object) pn.field_f.b(6);
                  continue L1;
                }
              }
            } else {
              bp.a(var4, true, param0);
              var4 = (kj) (Object) md.field_u.b(6);
              continue L0;
            }
          }
        } else {
          uq.a(-91, -34);
          var4 = (kj) (Object) md.field_u.c(121);
          L2: while (true) {
            if (var4 == null) {
              var5 = (nh) (Object) pn.field_f.c(83);
              L3: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  ag.a((byte) 73, var5, param0);
                  var5 = (nh) (Object) pn.field_f.b(6);
                  continue L3;
                }
              }
            } else {
              bp.a(var4, true, param0);
              var4 = (kj) (Object) md.field_u.b(6);
              continue L2;
            }
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
            if (param0 != 3) {
                return;
            }
            try {
                param1.getAppletContext().showDocument(gf.a(param1, true, var2), "_top");
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
        field_a = null;
        field_f = null;
        field_e = null;
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 != 3) {
            Object var2 = null;
            uq.a((java.applet.Applet) null, -5);
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            if (param1 != 3) {
                return;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                param0.getAppletContext().showDocument(gf.a(param0, true, var2), "_top");
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
        field_c = "Public";
        field_b = new pi(3);
        field_g = 49;
        field_e = "Please send me news and updates (I can unsubscribe at any time)";
        field_a = "You need to play 1 more rated game to unlock this option.";
    }
}
