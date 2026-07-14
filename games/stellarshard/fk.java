/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends gg {
    static int[] field_k;
    int field_p;
    int field_l;
    int field_n;
    int field_m;
    static String field_r;
    static String field_q;
    int field_s;
    int field_o;

    final static void a(int param0, java.awt.Component param1) {
        if (param0 != -28092) {
            return;
        }
        param1.setFocusTraversalKeysEnabled(false);
        param1.addKeyListener((java.awt.event.KeyListener) (Object) pk.field_e);
        param1.addFocusListener((java.awt.event.FocusListener) (Object) pk.field_e);
    }

    public static void a(int param0) {
        field_k = null;
        field_r = null;
        if (param0 != 23976) {
            field_k = null;
            field_q = null;
            return;
        }
        field_q = null;
    }

    final static hl d(int param0) {
        if (param0 < 70) {
            return null;
        }
        return ok.field_b;
    }

    fk(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((fk) this).field_n = param5;
        ((fk) this).field_p = param1;
        ((fk) this).field_o = param4;
        ((fk) this).field_l = param0;
        ((fk) this).field_m = param2;
        ((fk) this).field_s = param3;
    }

    final static void a(java.applet.Applet param0, boolean param1, String param2, byte param3) {
        try {
            if (param3 < 71) {
                return;
            }
            if (!(!ej.field_k.startsWith("win"))) {
                if (!(!li.a(param2, (byte) -5))) {
                    return;
                }
            }
            try {
                param0.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                qe.a(12, "MGR1: " + param2, (Throwable) null);
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
        field_r = "Your email address is used to identify this account";
        field_q = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
