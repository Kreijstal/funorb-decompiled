/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rba implements Iterator {
    private static String[] field_e;
    private od field_c;
    static String field_b;
    private hma field_d;
    private od field_f;
    static qh field_a;

    public final Object next() {
        od var1 = ((rba) this).field_c;
        if (var1 == ((rba) this).field_d.field_d) {
            var1 = null;
            ((rba) this).field_c = null;
        } else {
            ((rba) this).field_c = var1.field_g;
        }
        ((rba) this).field_f = var1;
        return (Object) (Object) var1;
    }

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_a = null;
    }

    public final void remove() {
        if (((rba) this).field_f == null) {
            throw new IllegalStateException();
        }
        ((rba) this).field_f.c(-7975);
        ((rba) this).field_f = null;
    }

    public final boolean hasNext() {
        return ((rba) this).field_c != ((rba) this).field_d.field_d;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        tga.field_a.c(jg.a(param0, (byte) -68, param2), param6, param3, param5, -22971, param1);
        if (param4 < 0) {
            field_a = null;
        }
    }

    rba(hma param0) {
        ((rba) this).field_f = null;
        try {
            ((rba) this).field_d = param0;
            ((rba) this).field_c = ((rba) this).field_d.field_d.field_g;
            ((rba) this).field_f = null;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rba.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "On";
        field_e = new String[9];
        field_e[4] = "1 Long, 1 Short";
        field_e[8] = "Stutter 2";
        field_e[7] = "Stutter 1";
        field_e[0] = "Constant";
        field_e[6] = "2 Long, 1 Short";
        field_e[3] = "Pulse, Fast";
        field_e[5] = "1 Long, 2 Short";
        field_e[1] = "Pulse, Slow";
        field_e[2] = "Pulse, Medium";
    }
}
