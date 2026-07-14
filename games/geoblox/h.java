/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static int field_b;
    private String field_c;
    private boolean field_e;
    static int field_a;
    private boolean field_f;
    static int field_d;

    final void a(byte param0, boolean param1) {
        if (param0 > -47) {
            return;
        }
        ((h) this).field_e = param1 ? true : false;
        ((h) this).field_f = true;
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            String var2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            if (param1) {
                return;
            }
            try {
                var2 = param0.getDocumentBase().getFile();
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if (!((var3 ^ -1) > -1)) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param0.getCodeBase(), var4);
                param0.getAppletContext().showDocument(wf.a(var5, 58, param0), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0) {
        if (param0 > -74) {
            boolean discarded$0 = ((h) this).a(19);
            return ((h) this).field_f;
        }
        return ((h) this).field_f;
    }

    final static void c(int param0) {
        int var2 = 0;
        ja var3 = null;
        var2 = Geoblox.field_C;
        var3 = (ja) (Object) ji.field_r.g(0);
        L0: while (true) {
          if (var3 == null) {
            if (param0 != -1) {
              h.c(116);
              return;
            } else {
              return;
            }
          } else {
            var3.g(-16096);
            var3 = (ja) (Object) ji.field_r.d(1);
            continue L0;
          }
        }
    }

    final boolean a(byte param0) {
        if (param0 >= -45) {
            Object var3 = null;
            h.a((java.applet.Applet) null, true);
            return ((h) this).field_e;
        }
        return ((h) this).field_e;
    }

    final String b(int param0) {
        if (param0 != 19491) {
            boolean discarded$0 = ((h) this).a((byte) -82);
            return ((h) this).field_c;
        }
        return ((h) this).field_c;
    }

    h(String param0) {
        ((h) this).field_f = false;
        ((h) this).field_e = false;
        ((h) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
