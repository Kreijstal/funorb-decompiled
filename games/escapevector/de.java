/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends hg {
    static ik field_i;
    static String[] field_h;
    int field_g;
    static boolean field_j;

    final static void a(String param0, String param1, int param2) {
        if (be.field_b == null) {
          dd.field_d = new h(param0, param1, false, true, true);
          if (param2 != 63) {
            field_h = null;
            rd.field_c.a((hm) (Object) dd.field_d, 30);
            return;
          } else {
            rd.field_c.a((hm) (Object) dd.field_d, 30);
            return;
          }
        } else {
          be.field_b.o(-18861);
          dd.field_d = new h(param0, param1, false, true, true);
          if (param2 == 63) {
            rd.field_c.a((hm) (Object) dd.field_d, 30);
            return;
          } else {
            field_h = null;
            rd.field_c.a((hm) (Object) dd.field_d, 30);
            return;
          }
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            String var2 = param1.getDocumentBase().getFile();
            if (param0) {
                return;
            }
            try {
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if (!((var3 ^ -1) > -1)) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param1.getCodeBase(), var4);
                param1.getAppletContext().showDocument(sh.a((byte) 12, param1, var5), "_self");
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
        field_h = null;
        if (!param0) {
            return;
        }
        field_i = null;
    }

    de(int param0) {
        ((de) this).field_g = param0;
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        ce.field_f.a(true);
        param0 = l.a(-8462, param0);
        param1 = jg.a(param0, 13565, param1);
        var3 = nk.a(1, param0);
        ma.field_a = new oe(ld.field_h[param0], var3, param0, param1);
        ma.field_a.y((byte) -40);
        if (param2 < 77) {
          field_h = null;
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new String[]{"Congratulations, commander. Your mission has been an overwhelming success.", "You have exceeded all expectations and single-handedly brought about the destruction of the alien war machine.", "Their military infrastructure lies in ruins ... ", " ... in the wake of your successful undercover strikes", "Earth is safe once again, thanks to you."};
    }
}
