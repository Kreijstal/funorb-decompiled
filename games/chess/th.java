/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th implements ui {
    static int[] field_c;
    static String field_e;
    static int field_d;
    static int field_a;
    static int field_b;
    static String field_f;

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        if (param0 != 0) {
            th.c(-92);
            field_e = null;
            return;
        }
        field_e = null;
    }

    final static void c(int param0) {
        jb.a((byte) -89);
        int var1 = -107 % ((param0 - -14) / 54);
        rn.a(sc.field_e, -128, el.field_z[0].field_v, ri.field_g, on.field_e, fe.field_g);
    }

    final static rk b(int param0) {
        rk var1 = new rk(cd.field_p, ek.field_a, be.field_a[0], a.field_c[param0], wm.field_b[0], b.field_c[0], vk.field_d[0], uh.field_r);
        ch.k(4210752);
        return var1;
    }

    static {
        field_e = "Show all game chat";
        field_c = new int[12];
        field_f = "This is your RuneScape clan if you have one.";
        field_d = 0;
    }
}
