/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rk implements Iterable {
    static hl field_d;
    gb field_e;
    static int[] field_b;
    static String field_a;
    static byte[][][] field_c;

    final void a(byte param0, gb param1) {
        try {
            if (param1.field_s != null) {
                param1.e(0);
            }
            param1.field_s = ((rk) this).field_e.field_s;
            int var3_int = -118 % ((31 - param0) / 42);
            param1.field_o = ((rk) this).field_e;
            param1.field_s.field_o = param1;
            param1.field_o.field_s = param1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "rk.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new sf((rk) this);
    }

    final gb b(int param0) {
        gb var2 = ((rk) this).field_e.field_o;
        if (((rk) this).field_e == var2) {
            return null;
        }
        if (param0 > -70) {
            return null;
        }
        var2.e(0);
        return var2;
    }

    final static void a(int param0, int param1, int param2) {
        vg.field_Lb = param2;
        dh.field_i = param0;
    }

    final static void c() {
        int var1_int = 0;
        int var2 = TetraLink.field_J;
        try {
            wn.field_t.a(104);
            for (var1_int = 0; var1_int < 32; var1_int++) {
                uh.field_c[var1_int] = 0L;
            }
            for (var1_int = 0; var1_int < 32; var1_int++) {
                ui.field_c[var1_int] = 0L;
            }
            qh.field_n = 0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "rk.E(" + -8243 + ')');
        }
    }

    rk() {
        ((rk) this).field_e = new gb();
        ((rk) this).field_e.field_s = ((rk) this).field_e;
        ((rk) this).field_e.field_o = ((rk) this).field_e;
    }

    public static void a() {
        field_a = null;
        field_b = null;
        field_c = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Play the game without logging in just yet";
    }
}
