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
        try {
            param0.addMouseListener(om.field_b);
            param0.addMouseMotionListener(om.field_b);
            param0.addFocusListener(om.field_b);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "rm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean hasNext() {
        return this.field_f.field_c != this.field_b;
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
        if (!(null != this.field_d)) {
            throw new IllegalStateException();
        }
        this.field_d.d(103);
        this.field_d = null;
    }

    rm(vb param0) {
        this.field_d = null;
        try {
            this.field_f = param0;
            this.field_b = this.field_f.field_c.field_j;
            this.field_d = null;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "rm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final Object next() {
        fl var1 = this.field_b;
        if (this.field_f.field_c != var1) {
            this.field_b = var1.field_j;
        } else {
            this.field_b = null;
            var1 = null;
        }
        this.field_d = var1;
        return var1;
    }

    static {
        field_a = "Passwords must be between 5 and 20 letters and numbers";
    }
}
