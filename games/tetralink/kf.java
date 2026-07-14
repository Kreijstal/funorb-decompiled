/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    static boolean field_d;
    static String field_b;
    static String field_a;
    static volatile int field_c;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 23365) {
            field_a = null;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (!(11 != fn.field_R)) {
            kn.a(param0 ^ -8145);
        }
        nn.a(bn.field_a, md.field_v, param0 + 8007, n.field_Q);
        if (param0 != -8129) {
            return;
        }
        bo.a(0, 0, param1, -2);
    }

    final static oh[] a(boolean param0, oh[] param1) {
        int var2 = 0;
        oh var3 = null;
        int var4 = TetraLink.field_J;
        if (!param0) {
            field_b = null;
        }
        for (var2 = 0; var2 < param1.length; var2++) {
            var3 = param1[var2];
            param1[var2].field_D = 0;
            var3.field_x = 0;
            param1[var2].field_t = param1[var2].field_u;
            param1[var2].field_F = param1[var2].field_E;
        }
        return param1;
    }

    final static void a(int param0, int param1, int param2, ve param3, ve param4, int param5) {
        da.field_e = param1;
        io.field_a = param2;
        if (param0 != -4968) {
            field_c = 80;
        }
        hj.field_e = param3;
        mn.field_c = param5;
        hd.field_t = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Only show game chat from my friends";
        field_b = "Exploiting a bug";
        field_c = 0;
    }
}
