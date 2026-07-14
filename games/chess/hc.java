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
        l var1 = ((hc) this).field_c;
        if (var1 == ((hc) this).field_a.field_c) {
            var1 = null;
            ((hc) this).field_c = null;
        } else {
            ((hc) this).field_c = var1.field_p;
        }
        ((hc) this).field_f = var1;
        return (Object) (Object) var1;
    }

    public final boolean hasNext() {
        return ((hc) this).field_c != ((hc) this).field_a.field_c;
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
        if (((hc) this).field_f == null) {
            throw new IllegalStateException();
        }
        ((hc) this).field_f.d(-1);
        ((hc) this).field_f = null;
    }

    final static void a(int param0, byte param1) {
        nk var2 = qn.field_U;
        var2.f(param0, -95);
        int var3 = 60 / ((-20 - param1) / 47);
        var2.c(1, (byte) 69);
        var2.c(1, (byte) 122);
    }

    hc(cn param0) {
        ((hc) this).field_f = null;
        ((hc) this).field_a = param0;
        ((hc) this).field_f = null;
        ((hc) this).field_c = ((hc) this).field_a.field_c.field_p;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Macroing or use of bots";
        field_d = "Orb coins: ";
        field_b = null;
    }
}
