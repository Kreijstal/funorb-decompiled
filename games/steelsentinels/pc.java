/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc extends ck {
    em field_v;
    ck field_u;
    static String field_r;
    static fm field_p;
    int field_t;
    static String field_s;
    static String field_o;
    static gh field_q;
    static boolean field_w;

    final static int e(int param0) {
        int var2 = 0;
        int var3 = SteelSentinels.field_G;
        int var1 = 0;
        for (var2 = 0; var2 < fe.field_D.length; var2++) {
            var1 = var1 + mm.a((byte) 101, fe.field_D[var2]);
        }
        if (param0 < 115) {
            return -66;
        }
        int var4 = 0;
        var2 = var4;
        while (rn.field_D.length > var4) {
            var1 = var1 + mm.a((byte) 112, rn.field_D[var4]);
            var4++;
        }
        return var1;
    }

    final static void a(int param0, wk[] param1, int param2, mi param3, int param4, int param5, int param6, int param7, int param8, wk[] param9, int param10, int param11, int param12, int param13, int param14, int param15, mi param16, int param17, wk[] param18, int param19, int param20) {
        vk.a(param14, param13, param5, param6, param10, param7, new ak(param18), (byte) -115, param16, param11, new ak(param9), param19, param15, param2, param0, param12, param4, param17, param3, new ak(param1), param8);
        if (param20 < 2) {
            field_p = null;
        }
    }

    public static void f(int param0) {
        field_s = null;
        field_q = null;
        int var1 = -124 / ((62 - param0) / 37);
        field_o = null;
        field_p = null;
        field_r = null;
    }

    final static void d(int param0) {
        if (!(sb.field_bb.field_i == jn.field_c)) {
            va.field_b = va.field_b + (-jn.field_c + sb.field_bb.field_i);
            jn.field_c = sb.field_bb.field_i;
        }
        if (!(wa.field_p <= 0)) {
            wa.field_p = wa.field_p - 1;
        }
        if (param0 >= -17) {
            return;
        }
        if (!(0 >= wa.field_p)) {
            nn.a(false);
        }
    }

    pc(em param0, ck param1) {
        ((pc) this).field_v = param0;
        ((pc) this).field_t = param0.f();
        ((pc) this).field_u = param1;
        ((pc) this).field_v.e(((pc) this).field_t * lb.field_ac + 128 >> -990443640);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Invite more players, or alternatively try changing the following settings:  ";
        field_p = new fm(8, 0, 4, 1);
        field_s = "This password contains repeated characters, and would be easy to guess";
        field_o = "Match by...";
    }
}
