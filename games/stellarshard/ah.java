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
        if (!(this.field_l != null)) {
            return;
        }
        this.field_l.field_m = this.field_m;
        this.field_m.field_l = this.field_l;
        this.field_m = null;
        this.field_l = null;
    }

    final static void a(java.awt.Component param0, boolean param1) {
        param0.removeKeyListener(pk.field_e);
        param0.removeFocusListener(pk.field_e);
        if (param1) {
            return;
        }
        try {
            se.field_H = -1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ah.EB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_k = null;
        if (param0 != -31) {
            return;
        }
        field_n = null;
        field_q = null;
        field_p = null;
    }

    final static boolean a(int param0) {
        boolean discarded$0 = false;
        if (param0 != -1) {
            discarded$0 = ah.d(12);
            return cg.field_a;
        }
        return cg.field_a;
    }

    final static boolean d(int param0) {
        if (param0 != -12171) {
            field_q = (java.awt.Frame) null;
            return vh.a(true, hf.a((byte) -6));
        }
        return vh.a(true, hf.a((byte) -6));
    }

    protected ah() {
    }

    static {
        field_k = "<img=4><img=0><img=5> - Thrust and turn<br><img=1> - Fire guns<br>Destroy the asteroids to progress";
        field_n = "This game has been updated! Please reload this page.";
    }
}
