/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk extends lh {
    int field_j;
    int field_A;
    int field_l;
    int field_r;
    int field_C;
    wc field_D;
    int field_B;
    ie field_k;
    int field_F;
    int field_w;
    sf field_z;
    int field_t;
    int field_o;
    de field_i;
    static dd field_m;
    int field_q;
    int field_p;
    int field_n;
    int field_v;
    int field_x;
    static dd field_s;
    int field_u;
    static String field_y;
    int field_E;

    final void d(int param0) {
        int var2 = 4 % ((param0 - 40) / 58);
        ((tk) this).field_i = null;
        ((tk) this).field_z = null;
        ((tk) this).field_k = null;
        ((tk) this).field_D = null;
    }

    public static void a(int param0) {
        field_m = null;
        field_s = null;
        field_y = null;
        if (param0 >= -90) {
            tk.a(40);
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6) {
        try {
            ia.field_p[param5] = param2;
            ia.field_t[param5] = param1;
            ia.field_l[param5] = param3;
            ia.field_j[param5] = param6;
            if (param4 > -116) {
                field_y = null;
            }
            ia.field_r[param5] = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "tk.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    tk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Create";
    }
}
