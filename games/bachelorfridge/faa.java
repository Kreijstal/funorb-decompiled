/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class faa {
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var15 = 0;
        int[] var21 = null;
        int var17 = BachelorFridge.field_y;
        int var11 = cr.a(an.field_q, param5, ha.field_n, param3 + -14040);
        int var12 = cr.a(an.field_q, param4, ha.field_n, 0);
        int var13 = cr.a(eo.field_l, param2, pw.field_x, 0);
        int var14 = cr.a(eo.field_l, param1, pw.field_x, param3 ^ param3);
        int var7 = cr.a(an.field_q, param5 + param6, ha.field_n, 0);
        int var8 = cr.a(an.field_q, param4 + -param6, ha.field_n, 0);
        for (var15 = var11; var15 < var7; var15++) {
            hba.a(param0, var13, tj.field_b[var15], 7, var14);
        }
        for (var15 = var12; var15 > var8; var15--) {
            hba.a(param0, var13, tj.field_b[var15], param3 ^ 14047, var14);
        }
        int var9 = cr.a(eo.field_l, param6 + param2, pw.field_x, 0);
        int var10 = cr.a(eo.field_l, -param6 + param1, pw.field_x, 0);
        for (var15 = var7; var15 <= var8; var15++) {
            var21 = tj.field_b[var15];
            hba.a(param0, var13, var21, 7, var9);
            hba.a(param0, var10, var21, 7, var14);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = -26 / ((89 - param0) / 36);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Add <%0> to friend list";
    }
}
