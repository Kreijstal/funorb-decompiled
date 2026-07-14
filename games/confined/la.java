/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends am {
    private String field_Q;
    static int field_R;
    static int[] field_T;
    private boolean field_L;
    private int field_U;
    static e field_N;
    private int field_K;
    static int field_O;
    private ok field_P;
    static long[] field_S;
    private int field_J;
    static ej field_M;

    final String f(byte param0) {
        int var2 = ((la) this).field_H.field_w ? 1 : 0;
        ((la) this).field_H.field_w = ((la) this).field_w;
        if (param0 > -82) {
            la.i(13);
        }
        String var3 = ((la) this).field_H.f((byte) -84);
        ((la) this).field_H.field_w = var2 != 0 ? true : false;
        return var3;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 < 36) {
            String discarded$0 = ((la) this).f((byte) 63);
        }
        int var5 = param3 + ((la) this).field_q;
        int var6 = param0 + ((la) this).field_m;
        super.a(param0, param1, (byte) 75, param3);
        if (!(-1 == (param1 ^ -1))) {
            return;
        }
        int var7 = !((la) this).field_L ? 0 : -(((la) this).field_U * 2) + ((la) this).field_F + -((la) this).field_J;
        int discarded$1 = ((la) this).field_P.a(((la) this).field_Q, var5 - (-var7 - ((la) this).field_U), var6 - -((la) this).field_U, -((la) this).field_U + ((la) this).field_J, -(((la) this).field_U * 2) + ((la) this).field_z, ((la) this).field_K, -1, ((la) this).field_L ? 0 : 2, 1, ((la) this).field_P.field_C);
    }

    final static void j(int param0) {
        bj.a(true, kc.field_n, 14451, rd.field_Jb);
        pc.field_f = true;
        if (param0 < 23) {
            la.j(106);
        }
    }

    la(int param0, int param1, int param2, int param3, fj param4, boolean param5, int param6, int param7, ok param8, int param9, String param10) {
        super(param0, param1, param2, param3, (fe) null, (uk) null);
        ((la) this).field_K = param9;
        ((la) this).field_U = param7;
        ((la) this).field_Q = param10;
        ((la) this).field_P = param8;
        ((la) this).field_H = param4;
        ((la) this).field_L = param5 ? true : false;
        ((la) this).field_J = param6;
        int var12 = ((la) this).field_J + -((la) this).field_U;
        int var13 = ((la) this).field_P.b(param10, var12, ((la) this).field_P.field_C) - -(((la) this).field_U * 2);
        if (var13 > param3) {
            ((la) this).a(-111, param2, param1, var13, param0);
        } else {
            var13 = param3;
        }
        int var14 = ((la) this).field_L ? 0 : 2 * ((la) this).field_U + ((la) this).field_J;
        ((la) this).field_H.a(-114, -((la) this).field_J + param2 - ((la) this).field_U * 3, (var13 - param3 >> -914293439) + ((la) this).field_U, param3 + -(((la) this).field_U * 2), var14);
    }

    public static void i(int param0) {
        field_T = null;
        field_N = null;
        field_M = null;
        field_S = null;
        int var1 = -101 % ((param0 - -31) / 34);
    }

    final static long h(int param0) {
        if (param0 <= 110) {
            la.j(13);
        }
        return -m.field_b + ri.a(-3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = new long[1000];
        field_N = new e(8, 0, 4, 1);
        field_M = new ej();
    }
}
