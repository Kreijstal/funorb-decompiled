/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static int field_a;
    static String field_c;
    static bc field_h;
    static String field_g;
    static int field_e;
    static ds field_b;
    static bi[][] field_i;
    static boolean field_f;
    static bi field_d;

    final static void a(boolean param0) {
        k.field_b = false;
        if (!param0) {
            bi discarded$0 = oi.a(-116, (byte) -74);
        }
    }

    final static void a(byte param0, bc param1) {
        int var2 = 0;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        ln.field_K = mf.a(param1, "", "starfield", false);
        mp.field_e = new bi[6];
        for (var2 = 0; var2 < 6; var2++) {
            mp.field_e[var2] = vr.a(param1, var2 - -1, 1);
        }
        ce.field_v = mf.a(param1, "", "win", false);
        dp.field_s = mf.a(param1, "", "lose", false);
        if (param0 != -126) {
            Object var4 = null;
            oi.a((byte) -117, (bc) null);
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        if (param0 != -1) {
            oi.a(52);
        }
        field_d = null;
        field_i = null;
        field_g = null;
        field_c = null;
    }

    final static bi a(int param0, byte param1) {
        bi var3 = null;
        bi var2_ref = null;
        bi var2 = bd.field_C[param0];
        if (!(var2 != null)) {
            var3 = new bi(32, 32);
            var2_ref = var3;
            bd.field_C[param0] = new bi(32, 32);
            bs.a(var3, 77);
            jd.field_j[param0].g(0, 0);
            cg.i(0);
        }
        if (param1 != 66) {
            oi.a(-57);
        }
        return var2_ref;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_b = new ds(2);
    }
}
