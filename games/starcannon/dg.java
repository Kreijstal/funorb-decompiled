/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends rf {
    int field_m;
    int field_h;
    static int field_n;
    static int field_l;
    int field_i;
    int field_g;
    int field_k;
    int field_f;
    static String field_j;

    final static int b(byte param0) {
        if (param0 != -18) {
            dg.a(-106);
            return qb.field_a;
        }
        return qb.field_a;
    }

    final static void a(int param0) {
        ti.field_c = -1;
        if (param0 != 11199) {
            return;
        }
        di.field_m = 0;
        eg.field_h = false;
        ua.field_a = -1;
        sc.field_c = null;
    }

    public static void d(int param0) {
        int var1 = 57 / ((69 - param0) / 54);
        field_j = null;
    }

    private dg() throws Throwable {
        throw new Error();
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    static {
        field_n = -1;
        field_j = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
