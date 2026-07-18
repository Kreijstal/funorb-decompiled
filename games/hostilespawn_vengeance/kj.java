/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kj implements Iterator {
    private ui field_h;
    static boolean field_b;
    private dk field_d;
    private dk field_i;
    static String field_a;
    static cb field_g;
    static boolean field_c;
    static String field_e;
    static bd field_f;

    public final Object next() {
        dk var1 = ((kj) this).field_i;
        if (((kj) this).field_h.field_a == var1) {
            ((kj) this).field_i = null;
            var1 = null;
        } else {
            ((kj) this).field_i = var1.field_j;
        }
        ((kj) this).field_d = var1;
        return (Object) (Object) var1;
    }

    final static s b(int param0) {
        String var1 = qc.d(750938499);
        if (var1 != null) {
            if (var1.indexOf('@') >= 0) {
                var1 = "";
            }
        }
        return new s(qc.d(750938499), ia.b(32674));
    }

    final static int a(int param0) {
        if (param0 > -90) {
            field_e = null;
            return ia.field_h;
        }
        return ia.field_h;
    }

    public final void remove() {
        if (!(null != ((kj) this).field_d)) {
            throw new IllegalStateException();
        }
        ((kj) this).field_d.c(-1);
        ((kj) this).field_d = null;
    }

    public static void a(byte param0) {
        field_e = null;
        field_g = null;
        field_a = null;
        field_f = null;
    }

    public final boolean hasNext() {
        return ((kj) this).field_i != ((kj) this).field_h.field_a;
    }

    kj(ui param0) {
        ((kj) this).field_d = null;
        try {
            ((kj) this).field_h = param0;
            ((kj) this).field_i = ((kj) this).field_h.field_a.field_j;
            ((kj) this).field_d = null;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "kj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_a = "Name is available";
    }
}
