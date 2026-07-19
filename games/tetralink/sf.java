/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sf implements Iterator {
    static je field_a;
    static String field_c;
    private gb field_f;
    static int field_d;
    private rk field_e;
    static String field_b;
    private gb field_g;

    public final boolean hasNext() {
        return this.field_g != this.field_e.field_e;
    }

    public final void remove() {
        if (!(null != this.field_f)) {
            throw new IllegalStateException();
        }
        this.field_f.e(0);
        this.field_f = null;
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 > -97) {
            field_b = (String) null;
        }
    }

    public final Object next() {
        gb var1 = this.field_g;
        if (this.field_e.field_e != var1) {
            this.field_g = var1.field_o;
        } else {
            var1 = null;
            this.field_g = null;
        }
        this.field_f = var1;
        return var1;
    }

    sf(rk param0) {
        this.field_f = null;
        try {
            this.field_e = param0;
            this.field_f = null;
            this.field_g = this.field_e.field_e.field_o;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "sf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static gd a(int param0, long param1) {
        if (param0 != -18701) {
          sf.a((byte) -94);
          return (gd) ((Object) dg.field_g.a(param1, param0 ^ -18702));
        } else {
          return (gd) ((Object) dg.field_g.a(param1, param0 ^ -18702));
        }
    }

    static {
        field_c = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_b = "<%0> is not on your friend list.";
        field_d = 0;
        field_a = new je();
    }
}
