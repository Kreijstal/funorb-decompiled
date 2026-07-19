/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hc implements Iterator {
    private l field_f;
    static String field_e;
    static String field_d;
    static String field_b;
    private l field_c;
    private cn field_a;

    public final Object next() {
        l var1 = this.field_c;
        if (var1 == this.field_a.field_c) {
            var1 = null;
            this.field_c = null;
        } else {
            this.field_c = var1.field_p;
        }
        this.field_f = var1;
        return var1;
    }

    public final boolean hasNext() {
        return this.field_c != this.field_a.field_c;
    }

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
            return;
        }
        field_d = null;
        field_b = null;
    }

    public final void remove() {
        if (this.field_f == null) {
            throw new IllegalStateException();
        }
        this.field_f.d(-1);
        this.field_f = null;
    }

    final static void a(int param0, byte param1) {
        nk var2 = qn.field_U;
        var2.f(param0, -95);
        int var3 = 60 / ((-20 - param1) / 47);
        var2.c(1, (byte) 69);
        var2.c(1, (byte) 122);
    }

    hc(cn param0) {
        this.field_f = null;
        try {
            this.field_a = param0;
            this.field_f = null;
            this.field_c = this.field_a.field_c.field_p;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "hc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Macroing or use of bots";
        field_d = "Orb coins: ";
        field_b = null;
    }
}
