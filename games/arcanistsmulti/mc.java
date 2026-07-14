/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static int field_c;
    static qb[] field_a;
    static dj field_b;

    final static void a(int param0, int param1, int param2, boolean param3) {
        ib.a(param3, 2);
        kb.a(param3, param0, -32507, param1);
        if (param2 > -79) {
            mc.a(55);
        }
    }

    final static kc a(byte param0) {
        if (param0 != 21) {
            return null;
        }
        return ee.field_g.field_Cb;
    }

    private mc() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var5 = null;
            String var2 = param1.getDocumentBase().getFile();
            String var4 = var2;
            var4 = var2;
            int var3 = var2.indexOf('?');
            var4 = "reload.ws";
            if (param0 != 30449) {
                return;
            }
            try {
                if ((var3 ^ -1) <= -1) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param1.getCodeBase(), var4);
                param1.getAppletContext().showDocument(nm.a(param1, var5, param0 + -62292), "_self");
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
        field_a = null;
        if (param0 < 70) {
            mc.a(113);
        }
    }

    static {
    }
}
