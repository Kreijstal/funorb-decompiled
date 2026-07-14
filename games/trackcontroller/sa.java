/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends ok {
    static String[] field_I;
    static String field_K;
    static int[] field_R;
    static j field_Q;
    static int field_T;
    static String field_J;
    static String field_P;
    private int field_E;
    private int field_N;
    private oh field_H;
    private String field_O;
    private int field_S;
    private boolean field_L;
    static volatile int field_M;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = ((sa) this).field_p + param1;
        int var6 = param2 + ((sa) this).field_m;
        super.a(param0, param1, param2, param3);
        if (!(param0 == 0)) {
            return;
        }
        int var7 = ((sa) this).field_L ? -(2 * ((sa) this).field_S) + -((sa) this).field_E + ((sa) this).field_x : 0;
        int discarded$0 = ((sa) this).field_H.a(((sa) this).field_O, ((sa) this).field_S + var7 + var5, ((sa) this).field_S + var6, ((sa) this).field_E + -((sa) this).field_S, -(((sa) this).field_S * 2) + ((sa) this).field_u, ((sa) this).field_N, -1, !((sa) this).field_L ? 2 : 0, 1, ((sa) this).field_H.field_G);
    }

    final String e(int param0) {
        int var2 = ((sa) this).field_B.field_q ? 1 : 0;
        ((sa) this).field_B.field_q = ((sa) this).field_q;
        String var3 = ((sa) this).field_B.e(param0);
        ((sa) this).field_B.field_q = var2 != 0 ? true : false;
        return var3;
    }

    final static void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = TrackController.field_F ? 1 : 0;
        int var1 = rf.field_a[0];
        if (param0 < 3) {
            sa.b(false);
            for (var2 = 1; var2 < rf.field_a.length; var2++) {
                var3 = rf.field_a[var2];
                pd.a(gk.field_b, var2 << 247379844, gk.field_b, var1, var3);
                var1 = var1 + var3;
            }
            return;
        }
        for (var2 = 1; var2 < rf.field_a.length; var2++) {
            var3 = rf.field_a[var2];
            pd.a(gk.field_b, var2 << 247379844, gk.field_b, var1, var3);
            var1 = var1 + var3;
        }
    }

    public static void b(boolean param0) {
        field_I = null;
        if (!param0) {
            sa.b(true);
            field_R = null;
            field_J = null;
            field_P = null;
            field_Q = null;
            field_K = null;
            return;
        }
        field_R = null;
        field_J = null;
        field_P = null;
        field_Q = null;
        field_K = null;
    }

    sa(int param0, int param1, int param2, int param3, al param4, boolean param5, int param6, int param7, oh param8, int param9, String param10) {
        super(param0, param1, param2, param3, (t) null, (tg) null);
        ((sa) this).field_O = param10;
        ((sa) this).field_B = param4;
        ((sa) this).field_L = param5 ? true : false;
        ((sa) this).field_N = param9;
        ((sa) this).field_S = param7;
        ((sa) this).field_E = param6;
        ((sa) this).field_H = param8;
        int var12 = -((sa) this).field_S + ((sa) this).field_E;
        int var13 = ((sa) this).field_H.a(param10, var12, ((sa) this).field_H.field_G) + 2 * ((sa) this).field_S;
        if (param3 < var13) {
            ((sa) this).a(var13, -3050, param1, param2, param0);
        } else {
            var13 = param3;
        }
        int var14 = !((sa) this).field_L ? ((sa) this).field_E + 2 * ((sa) this).field_S : 0;
        ((sa) this).field_B.a(param3 + -(2 * ((sa) this).field_S), -3050, (-param3 + var13 >> 483046369) + ((sa) this).field_S, -((sa) this).field_E + (param2 - 3 * ((sa) this).field_S), var14);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Waiting for graphics";
        field_J = "Creating your account";
        field_M = 0;
    }
}
