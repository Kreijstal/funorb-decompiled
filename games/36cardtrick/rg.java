/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rg implements Iterator {
    private he field_c;
    private va field_d;
    private he field_b;
    static int field_e;
    static boolean field_a;

    public final void remove() {
        if (null == this.field_c) {
            throw new IllegalStateException();
        }
        this.field_c.d(12);
        this.field_c = null;
    }

    public final Object next() {
        he var1 = this.field_b;
        if (var1 == this.field_d.field_a) {
            this.field_b = null;
            var1 = null;
        } else {
            this.field_b = var1.field_h;
        }
        this.field_c = var1;
        return var1;
    }

    public final boolean hasNext() {
        return this.field_b != this.field_d.field_a;
    }

    final static void a(byte param0) {
        int var1 = 54 / ((param0 - 58) / 42);
        ej.a((byte) -118, lh.field_c, ri.field_b, true);
        ij.field_g = true;
    }

    rg(va param0) {
        this.field_c = null;
        try {
            this.field_d = param0;
            this.field_b = this.field_d.field_a.field_h;
            this.field_c = null;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "rg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = -2147483648;
        field_a = true;
    }
}
