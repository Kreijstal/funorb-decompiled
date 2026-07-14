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
        if (param1.field_s != null) {
            param1.e(0);
        }
        param1.field_s = ((rk) this).field_e.field_s;
        int var3 = -118 % ((31 - param0) / 42);
        param1.field_o = ((rk) this).field_e;
        param1.field_s.field_o = param1;
        param1.field_o.field_s = param1;
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
        if (param1 != -33) {
            rk.a(-45);
        }
    }

    final static void c(int param0) {
        int var1 = 0;
        int var2 = TetraLink.field_J;
        wn.field_t.a(104);
        if (param0 != -8243) {
            field_b = null;
        }
        for (var1 = 0; var1 > -33; var1++) {
            uh.field_c[var1] = 0L;
        }
        for (var1 = 0; -33 > var1; var1++) {
            ui.field_c[var1] = 0L;
        }
        qh.field_n = 0;
    }

    rk() {
        ((rk) this).field_e = new gb();
        ((rk) this).field_e.field_s = ((rk) this).field_e;
        ((rk) this).field_e.field_o = ((rk) this).field_e;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_a = null;
        }
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
