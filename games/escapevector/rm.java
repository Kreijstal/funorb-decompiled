/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rm implements Iterator {
    private fl field_b;
    static boolean field_c;
    static String field_g;
    static ed field_e;
    static String field_a;
    private vb field_f;
    private fl field_d;

    final static void a(java.awt.Component param0, byte param1) {
        if (param1 != 38) {
            return;
        }
        param0.addMouseListener((java.awt.event.MouseListener) (Object) om.field_b);
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) om.field_b);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) om.field_b);
    }

    public final boolean hasNext() {
        return ((rm) this).field_f.field_c != ((rm) this).field_b;
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            field_c = false;
            field_e = null;
            field_g = null;
            return;
        }
        field_e = null;
        field_g = null;
    }

    public final void remove() {
        if (!(null != ((rm) this).field_d)) {
            throw new IllegalStateException();
        }
        ((rm) this).field_d.d(103);
        ((rm) this).field_d = null;
    }

    rm(vb param0) {
        ((rm) this).field_d = null;
        ((rm) this).field_f = param0;
        ((rm) this).field_b = ((rm) this).field_f.field_c.field_j;
        ((rm) this).field_d = null;
    }

    public final Object next() {
        fl var1 = ((rm) this).field_b;
        if (((rm) this).field_f.field_c != var1) {
            ((rm) this).field_b = var1.field_j;
        } else {
            ((rm) this).field_b = null;
            var1 = null;
        }
        ((rm) this).field_d = var1;
        return (Object) (Object) var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Passwords must be between 5 and 20 letters and numbers";
    }
}
