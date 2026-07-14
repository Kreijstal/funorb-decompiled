/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends fa {
    int field_k;
    static String field_l;
    int field_m;

    public static void b(byte param0) {
        field_l = null;
        if (param0 != -10) {
            field_l = null;
        }
    }

    private m() throws Throwable {
        throw new Error();
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                int var3 = 83 % ((param1 - -11) / 38);
                param0.getAppletContext().showDocument(lg.a(false, param0, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        String var1 = null;
        Object var2 = null;
        if (to.field_s) {
          L0: {
            if (to.field_r != null) {
              to.field_r.p(param0 ^ 15);
              break L0;
            } else {
              break L0;
            }
          }
          var1 = dd.a(0);
          nf.field_b = new be(var1, (String) null, true, false, false);
          if (param0 != -102) {
            var2 = null;
            m.a((java.applet.Applet) null, -43);
            wa.field_c.b(param0 + -6081, (ng) (Object) ph.field_l);
            ph.field_l.c((ng) (Object) nf.field_b, param0 ^ 27);
            ph.field_l.e(false);
            return;
          } else {
            wa.field_c.b(param0 + -6081, (ng) (Object) ph.field_l);
            ph.field_l.c((ng) (Object) nf.field_b, param0 ^ 27);
            ph.field_l.e(false);
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Only show game chat from my friends";
    }
}
