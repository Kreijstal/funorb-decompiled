/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kg implements Iterator {
    private de field_b;
    private rk field_a;
    static int field_c;
    private rk field_d;

    public final void remove() {
        if (null == ((kg) this).field_a) {
            throw new IllegalStateException();
        }
        ((kg) this).field_a.b(false);
        ((kg) this).field_a = null;
    }

    public final Object next() {
        rk var1 = ((kg) this).field_d;
        if (var1 == ((kg) this).field_b.field_b) {
            ((kg) this).field_d = null;
            var1 = null;
        } else {
            ((kg) this).field_d = var1.field_i;
        }
        ((kg) this).field_a = var1;
        return (Object) (Object) var1;
    }

    public final boolean hasNext() {
        return ((kg) this).field_b.field_b != ((kg) this).field_d;
    }

    kg(de param0) {
        ((kg) this).field_a = null;
        try {
            ((kg) this).field_b = param0;
            ((kg) this).field_d = ((kg) this).field_b.field_b.field_i;
            ((kg) this).field_a = null;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "kg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
    }
}
