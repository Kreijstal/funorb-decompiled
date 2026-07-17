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
        return ((sf) this).field_g != ((sf) this).field_e.field_e;
    }

    public final void remove() {
        if (!(null != ((sf) this).field_f)) {
            throw new IllegalStateException();
        }
        ((sf) this).field_f.e(0);
        ((sf) this).field_f = null;
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    public final Object next() {
        gb var1 = ((sf) this).field_g;
        if (((sf) this).field_e.field_e != var1) {
            ((sf) this).field_g = var1.field_o;
        } else {
            var1 = null;
            ((sf) this).field_g = null;
        }
        ((sf) this).field_f = var1;
        return (Object) (Object) var1;
    }

    sf(rk param0) {
        ((sf) this).field_f = null;
        try {
            ((sf) this).field_e = param0;
            ((sf) this).field_f = null;
            ((sf) this).field_g = ((sf) this).field_e.field_e.field_o;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "sf.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static gd a(int param0, long param1) {
        return (gd) (Object) dg.field_g.a(param1, 1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_b = "<%0> is not on your friend list.";
        field_d = 0;
        field_a = new je();
    }
}
