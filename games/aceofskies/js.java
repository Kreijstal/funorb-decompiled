/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class js implements Iterator {
    private wt field_a;
    private wt field_d;
    static int[] field_c;
    private hs field_b;

    public final Object next() {
        wt var1 = ((js) this).field_d;
        if (var1 == ((js) this).field_b.field_c) {
            ((js) this).field_d = null;
            var1 = null;
        } else {
            ((js) this).field_d = var1.field_j;
        }
        ((js) this).field_a = var1;
        return (Object) (Object) var1;
    }

    public final void remove() {
        if (null == ((js) this).field_a) {
            throw new IllegalStateException();
        }
        ((js) this).field_a.d(-118);
        ((js) this).field_a = null;
    }

    public final boolean hasNext() {
        return ((js) this).field_d != ((js) this).field_b.field_c;
    }

    public static void a() {
        field_c = null;
        int var1 = 0;
    }

    js(hs param0) {
        ((js) this).field_a = null;
        try {
            ((js) this).field_b = param0;
            ((js) this).field_a = null;
            ((js) this).field_d = ((js) this).field_b.field_c.field_j;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "js.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
