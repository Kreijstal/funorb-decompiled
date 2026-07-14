/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends pa {
    static String[] field_G;
    private int field_D;
    private int field_J;
    private String field_F;
    private rb field_E;
    private boolean field_K;
    static rb field_H;
    private int field_I;

    final String d(int param0) {
        int var3 = 50 % ((10 - param0) / 58);
        int var2 = ((q) this).field_z.field_l ? 1 : 0;
        ((q) this).field_z.field_l = ((q) this).field_l;
        String var4 = ((q) this).field_z.d(-71);
        ((q) this).field_z.field_l = var2 != 0 ? true : false;
        return var4;
    }

    public static void c(boolean param0) {
        field_H = null;
        if (param0) {
            field_H = null;
            field_G = null;
            return;
        }
        field_G = null;
    }

    q(int param0, int param1, int param2, int param3, ga param4, boolean param5, int param6, int param7, rb param8, int param9, String param10) {
        super(param0, param1, param2, param3, (io) null, (sk) null);
        ((q) this).field_I = param7;
        ((q) this).field_D = param6;
        ((q) this).field_F = param10;
        ((q) this).field_z = param4;
        ((q) this).field_J = param9;
        ((q) this).field_K = param5 ? true : false;
        ((q) this).field_E = param8;
        int var12 = ((q) this).field_D - ((q) this).field_I;
        int var13 = ((q) this).field_E.b(param10, var12, ((q) this).field_E.field_I) - -(((q) this).field_I * 2);
        if (param3 < var13) {
            ((q) this).a(-109, param1, param0, param2, var13);
        } else {
            var13 = param3;
        }
        int var14 = ((q) this).field_K ? 0 : ((q) this).field_D - -(2 * ((q) this).field_I);
        ((q) this).field_z.a(118, ((q) this).field_I - -(var13 + -param3 >> -467061183), var14, param2 - ((q) this).field_D + -(((q) this).field_I * 3), param3 - 2 * ((q) this).field_I);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param2 + ((q) this).field_k;
        int var6 = param0 + ((q) this).field_j;
        super.a(param0, param1, param2, param3);
        if (!(0 == param1)) {
            return;
        }
        int var7 = ((q) this).field_K ? -(2 * ((q) this).field_I) + (-((q) this).field_D + ((q) this).field_i) : 0;
        int discarded$0 = ((q) this).field_E.a(((q) this).field_F, ((q) this).field_I + (var5 + var7), ((q) this).field_I + var6, ((q) this).field_D + -((q) this).field_I, -(((q) this).field_I * 2) + ((q) this).field_n, ((q) this).field_J, -1, !((q) this).field_K ? 2 : 0, 1, ((q) this).field_E.field_I);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new String[]{"Washington D.C.", "London"};
    }
}
