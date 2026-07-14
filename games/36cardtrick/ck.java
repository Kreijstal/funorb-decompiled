/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends qg {
    static String field_F;
    private boolean field_H;
    static String field_G;
    static String field_I;
    private int field_A;
    private ee field_E;
    private int field_C;
    private int field_B;
    private String field_D;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = ((ck) this).field_o - -param0;
        int var6 = ((ck) this).field_i + param1;
        this.a(param0, param1, -1, param3);
        if (!(-1 == (param3 ^ -1))) {
            return;
        }
        int var7 = ((ck) this).field_H ? -(2 * ((ck) this).field_A) + -((ck) this).field_C + ((ck) this).field_h : 0;
        int discarded$0 = ((ck) this).field_E.a(((ck) this).field_D, var7 + var5 + ((ck) this).field_A, var6 + ((ck) this).field_A, -((ck) this).field_A + ((ck) this).field_C, -(2 * ((ck) this).field_A) + ((ck) this).field_q, ((ck) this).field_B, param2, !((ck) this).field_H ? 2 : 0, 1, ((ck) this).field_E.field_s);
    }

    final String b(byte param0) {
        int var2 = ((ck) this).field_y.field_j ? 1 : 0;
        ((ck) this).field_y.field_j = ((ck) this).field_j;
        String var3 = ((ck) this).field_y.b(param0);
        ((ck) this).field_y.field_j = var2 != 0 ? true : false;
        return var3;
    }

    public static void d(byte param0) {
        field_F = null;
        field_I = null;
        if (param0 != 41) {
            field_G = (String) null;
            field_G = null;
            return;
        }
        field_G = null;
    }

    ck(int param0, int param1, int param2, int param3, lk param4, boolean param5, int param6, int param7, ee param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ci) null, (pl) null);
        ((ck) this).field_A = param7;
        ((ck) this).field_E = param8;
        ((ck) this).field_B = param9;
        ((ck) this).field_H = param5 ? true : false;
        ((ck) this).field_D = param10;
        ((ck) this).field_y = param4;
        ((ck) this).field_C = param6;
        int var12 = ((ck) this).field_C - ((ck) this).field_A;
        int var13 = ((ck) this).field_E.b(param10, var12, ((ck) this).field_E.field_s) + 2 * ((ck) this).field_A;
        if (var13 > param3) {
            ((ck) this).a(var13, param1, param2, param0, true);
        } else {
            var13 = param3;
        }
        int var14 = !((ck) this).field_H ? 2 * ((ck) this).field_A + ((ck) this).field_C : 0;
        ((ck) this).field_y.a(-(((ck) this).field_A * 2) + param3, ((ck) this).field_A - -(var13 + -param3 >> -1346711711), -((ck) this).field_C + (param2 + -(((ck) this).field_A * 3)), var14, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Login: ";
        field_I = "Members";
    }
}
