/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static wk[] field_g;
    static String field_a;
    static int[][] field_c;
    static boolean field_b;
    static tg field_e;
    static String field_d;
    static gh field_f;

    final static void a(int param0, int param1, int param2, boolean param3) {
        ne.field_y.field_p = 0;
        ne.field_y.a((byte) 122, 12);
        ne.field_y.b(param3, rb.field_g.nextInt());
        ne.field_y.b(true, rb.field_g.nextInt());
        ne.field_y.a((byte) 121, param0);
        ne.field_y.a((byte) 109, param2);
        ne.field_y.d(param1, 59);
        ne.field_y.a(qe.field_d, jd.field_ib, -10048);
        mm.field_g.a(18, (byte) -117);
        mm.field_g.field_p = mm.field_g.field_p + 1;
        int var4 = mm.field_g.field_p + 1;
        mm.field_g.a(ne.field_y.field_p, (byte) -122, 0, ne.field_y.field_t);
        mm.field_g.b((byte) 89, -var4 + mm.field_g.field_p);
    }

    final static int a(byte param0) {
        if (param0 <= 21) {
            field_b = true;
            return ej.field_B;
        }
        return ej.field_B;
    }

    final static void a(byte param0, boolean param1, int param2, int param3) {
        nn.a(-1604006872, param1, param3, param2);
        if (param0 != 38) {
            Object var5 = null;
            String discarded$0 = ue.a((CharSequence[]) null, -124);
        }
    }

    final static void a(int param0, gh param1) {
        gh var5 = null;
        int var3 = SteelSentinels.field_G;
        gh var4 = (gh) (Object) param1.field_M.e(13058);
        gh var2 = var4;
        while (var4 != null) {
            var4.field_Lb = 0;
            var4.field_lb = 0;
            var4.field_eb = 0;
            var4.field_gb = 0;
            var5 = (gh) (Object) param1.field_M.a((byte) -34);
            gh var5_ref = var5;
        }
        param1.field_Lb = 0;
        param1.field_eb = 0;
        param1.field_lb = 0;
        param1.field_gb = param0;
    }

    final static String a(CharSequence[] param0, int param1) {
        if (param1 != 0) {
            return null;
        }
        return bf.a(param0.length, 0, (byte) 50, param0);
    }

    public static void b(byte param0) {
        field_d = null;
        field_f = null;
        field_c = null;
        field_g = null;
        field_e = null;
        int var1 = 69 % ((param0 - -34) / 55);
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for sound effects";
        field_c = new int[][]{null, null, null};
        field_g = new wk[field_c.length];
        field_d = "<col=00ffff>You are reading a past message, and your training schedule has been paused.<br>To continue your training, press <img=20> until you return to your current objective.</col>";
        field_b = false;
    }
}
