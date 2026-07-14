/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mra extends rqa {
    static int field_o;

    final static phb a(int param0, byte param1, int param2) {
        int var5 = VoidHunters.field_G;
        phb var3 = new phb(param2, param2);
        int var4 = 0;
        if (param1 > -109) {
            Object var6 = null;
            mra.a((java.applet.Applet) null, 118);
        }
        while (var4 < var3.field_r.length) {
            var3.field_r[var4] = param0;
            var4++;
        }
        return var3;
    }

    mra(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        si.a(41, 62, param0[0].a(7));
        if (param1 > -119) {
            Object var4 = null;
            nc discarded$0 = ((mra) this).a((nc[]) null, -98);
        }
        return new nc((Object) (Object) "void");
    }

    final static double e(byte param0) {
        if (param0 != -97) {
            return -0.6867473510386889;
        }
        return aib.field_c;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                if (param1 != 0) {
                    field_o = -95;
                }
                param0.getAppletContext().showDocument(ne.a(var2, (byte) 63, param0), "_top");
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
        field_o = 1;
        dtb discarded$0 = new dtb();
    }
}
