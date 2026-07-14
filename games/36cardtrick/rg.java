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
        if (null == ((rg) this).field_c) {
            throw new IllegalStateException();
        }
        ((rg) this).field_c.d(12);
        ((rg) this).field_c = null;
    }

    public final Object next() {
        he var1 = ((rg) this).field_b;
        if (var1 == ((rg) this).field_d.field_a) {
            ((rg) this).field_b = null;
            var1 = null;
        } else {
            ((rg) this).field_b = ((he) var1).field_h;
        }
        ((rg) this).field_c = var1;
        return (Object) (Object) var1;
    }

    public final boolean hasNext() {
        return ((rg) this).field_b != ((rg) this).field_d.field_a;
    }

    final static void a(byte param0) {
        int var1 = 54 / ((param0 - 58) / 42);
        ej.a((byte) -118, lh.field_c, ri.field_b, true);
        ij.field_g = true;
    }

    rg(va param0) {
        ((rg) this).field_c = null;
        ((rg) this).field_d = param0;
        ((rg) this).field_b = ((rg) this).field_d.field_a.field_h;
        ((rg) this).field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -2147483648;
        field_a = true;
    }
}
