/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ah extends gg {
    ah field_m;
    static java.awt.Frame field_q;
    static pb[] field_p;
    static String field_k;
    ah field_l;
    static String field_n;
    long field_o;

    final void c(byte param0) {
        if (param0 != 36) {
            return;
        }
        if (!(((ah) this).field_l != null)) {
            return;
        }
        ((ah) this).field_l.field_m = ((ah) this).field_m;
        ((ah) this).field_m.field_l = ((ah) this).field_l;
        ((ah) this).field_m = null;
        ((ah) this).field_l = null;
    }

    final static void a(java.awt.Component param0) {
        param0.removeKeyListener((java.awt.event.KeyListener) (Object) pk.field_e);
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) pk.field_e);
        try {
            se.field_H = -1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "ah.EB(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_n = null;
        field_q = null;
        field_p = null;
    }

    final static boolean a(int param0) {
        if (param0 != -1) {
            boolean discarded$0 = ah.d(12);
            return cg.field_a;
        }
        return cg.field_a;
    }

    final static boolean d(int param0) {
        if (param0 != -12171) {
            field_q = null;
            return vh.a(true, hf.a((byte) -6));
        }
        return vh.a(true, hf.a((byte) -6));
    }

    protected ah() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "<img=4><img=0><img=5> - Thrust and turn<br><img=1> - Fire guns<br>Destroy the asteroids to progress";
        field_n = "This game has been updated! Please reload this page.";
    }
}
