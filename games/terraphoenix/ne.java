/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ne implements Iterator {
    private vh field_a;
    private tc field_d;
    private vh field_c;
    static String field_b;
    static int field_e;

    public final void remove() {
        if (!(null != ((ne) this).field_c)) {
            throw new IllegalStateException();
        }
        ((ne) this).field_c.c((byte) 13);
        ((ne) this).field_c = null;
    }

    public final boolean hasNext() {
        return ((ne) this).field_a != ((ne) this).field_d.field_a;
    }

    public final Object next() {
        vh var1 = ((ne) this).field_a;
        if (((ne) this).field_d.field_a == var1) {
            var1 = null;
            ((ne) this).field_a = null;
        } else {
            ((ne) this).field_a = var1.field_o;
        }
        ((ne) this).field_c = var1;
        return (Object) (Object) var1;
    }

    public static void a(int param0) {
        int var1 = -32;
        field_b = null;
    }

    ne(tc param0) {
        ((ne) this).field_c = null;
        try {
            ((ne) this).field_d = param0;
            ((ne) this).field_c = null;
            ((ne) this).field_a = ((ne) this).field_d.field_a.field_o;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "ne.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        jj discarded$0 = new jj();
        field_b = "Select ";
        field_e = 72;
    }
}
