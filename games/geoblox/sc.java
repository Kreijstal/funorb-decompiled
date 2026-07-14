/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class sc {
    int field_a;
    int[] field_d;
    int field_c;
    static int field_f;
    java.awt.Image field_e;
    static fe field_b;

    abstract void a(int param0, java.awt.Graphics param1, int param2, int param3);

    abstract void a(int param0, java.awt.Component param1, int param2, byte param3);

    final static dm a(byte param0) {
        int var4_int = 0;
        int var1 = rc.field_j[0] * hl.field_K[0];
        byte[] var2 = mj.field_a[0];
        int[] var3 = new int[var1];
        if (param0 != -60) {
            Object var5 = null;
            int discarded$0 = sc.a((byte) 50, (Random) null, 37);
        }
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = cm.field_j[cd.a(255, (int) var2[var4_int])];
        }
        dm var4 = new dm(pg.field_b, dd.field_C, gh.field_m[0], md.field_e[0], rc.field_j[0], hl.field_K[0], var3);
        kj.c(true);
        return var4;
    }

    public static void b(byte param0) {
        field_b = null;
        if (param0 != 58) {
            Object var2 = null;
            int discarded$0 = sc.a((byte) 47, (Random) null, -73);
        }
    }

    final static int a(byte param0, Random param1, int param2) {
        int var4 = 0;
        if (param0 != -75) {
            return 102;
        }
        if (-1 <= (param2 ^ -1)) {
            throw new IllegalArgumentException();
        }
        if (uj.a(true, param2)) {
            return (int)((4294967295L & (long)param1.nextInt()) * (long)param2 >> -1102483296);
        }
        int var3 = -(int)(4294967296L % (long)param2) + -2147483648;
        while (true) {
            var4 = param1.nextInt();
            if (var3 > var4) {
                break;
            }
        }
        return jc.a(var4, param2, param0 ^ 121);
    }

    final void a(int param0) {
        vb.a(((sc) this).field_d, ((sc) this).field_a, ((sc) this).field_c);
        if (param0 != 255) {
            Object var3 = null;
            int discarded$0 = sc.a((byte) -94, (Random) null, 54);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new fe();
    }
}
