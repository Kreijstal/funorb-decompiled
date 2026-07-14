/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends vd {
    private String field_F;
    static int[] field_v;
    static nd[] field_C;
    static int[] field_x;
    static String field_z;
    static int[] field_u;
    private int field_G;
    private bi field_D;
    static nd[] field_y;
    static nd[] field_H;
    private int field_K;
    static String field_E;
    static int field_B;
    static int field_A;
    static qr field_w;
    static int field_J;

    public static void g(int param0) {
        field_w = null;
        field_v = null;
        field_C = null;
        field_E = null;
        field_x = null;
        if (param0 != 128) {
            return;
        }
        field_z = null;
        field_H = null;
        field_u = null;
        field_y = null;
    }

    final void a(int param0) {
        if (!((fe) this).field_s) {
            return;
        }
        if (!((((fe) this).field_K ^ -1) == 0)) {
            gf.d(((fe) this).field_k, ((fe) this).field_t, ((fe) this).field_m, ((fe) this).field_i, ((fe) this).field_K);
        }
        if (!(null == ((fe) this).field_D)) {
            ((fe) this).field_D.f((((fe) this).field_m - ((fe) this).field_D.field_z) / 2 + ((fe) this).field_k, (-((fe) this).field_D.field_w + ((fe) this).field_i) / 2 + ((fe) this).field_t);
        }
        int var2 = -72 % ((67 - param0) / 47);
        if (!(null == ((fe) this).field_F)) {
            rs.field_Cb.c(((fe) this).field_F, ((fe) this).field_m / 2 + ((fe) this).field_k + 1, (rs.field_Cb.field_J + rs.field_Cb.field_q) / 4 + ((fe) this).field_t - -(((fe) this).field_i / 2), ((fe) this).field_G, -1);
        }
    }

    final static void f(int param0) {
        mg.field_C = false;
        el.field_b = false;
        qj.a((byte) -127, param0);
        ee.field_l = oj.field_Fb;
        fj.field_s = oj.field_Fb;
    }

    final void a(byte param0, int param1, String param2) {
        ((fe) this).field_G = param1;
        ((fe) this).field_F = param2;
        int var4 = -8 / ((52 - param0) / 41);
    }

    final static void a(boolean param0, byte[] param1, byte[] param2, int param3, int[] param4, String[] param5, int param6, bc param7, bc param8, String[][] param9, bc param10, bi[][] param11, String[] param12, bi[][] param13, String[][] param14, nk[] param15, int param16, int[] param17, String[] param18, int param19) {
        m.a((byte) -52, param17, param10, param15, param8);
        bq.a(27770, param8);
        if (param16 > -113) {
            fe.g(125);
        }
        tb.a(param6, param4, param9, param14, param8, param18, param12, param11, param19, param13, param3, param5, param1, -7966, param2);
        ak.a(param7, (byte) -81, param0, param8);
        ir.l(1062);
        in.a((byte) -83);
        te.a(true);
    }

    fe(int param0, int param1, int param2, int param3, int param4, bi param5, String param6, int param7) {
        super(param0, param1, param2, param3);
        ((fe) this).field_G = param7;
        ((fe) this).field_K = param4;
        ((fe) this).field_F = param6;
        ((fe) this).field_D = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0_int = 0;
        int var4 = 0;
        field_z = "Watch Introduction";
        field_E = "Please send me news and updates (I can unsubscribe at any time)";
        field_x = new int[256];
        field_u = new int[256];
        field_v = new int[7];
        for (var0_int = 0; (var0_int ^ -1) > -257; var0_int++) {
            field_u[var0_int] = 65793 * var0_int;
            field_x[var0_int] = ee.a(ee.a(var0_int >> -1361319103 << 1727412584, var0_int), var0_int >> 144282114 << 1944931184);
        }
        int var5 = 0;
        var0_int = var5;
        while ((var5 ^ -1) > -4) {
            field_v[var5] = 4210752 * (1 + var5);
            field_v[6 + -var5] = 4210752 + var5 * 4210752;
            var5++;
        }
        field_v[3] = 16777215;
        int[] var0 = new int[]{256, 251, 245, 239, 219, 215, 161, 157, 154, 150, 146, 144, 316, 306, 612, 604, 599, 774, 777};
        int[] var1 = new int[]{199, 209, 223, 235, 214, 227, 289, 302, 313, 327, 338, 351, 247, 267, 180, 209, 240, 235, 258};
        int[] var2 = new int[]{327, 239, 128, 326, 639, 717, 529, 507, 132, 195, 772, 777, 211, 319, 84, 202, 717, 303, 235, 193};
        int[] var3 = new int[]{395, 478, 553, 617, 475, 615, 611, 384, 552, 628, 492, 403, 401, 348, 627, 393, 615, 509, 500, 545};
        field_y = new nd[12];
        for (var4 = 0; 12 > var4; var4++) {
            field_y[var4] = new nd(var0[var4], var1[var4], 80);
        }
        field_H = new nd[7];
        for (var4 = 0; (var4 ^ -1) > -8; var4++) {
            field_H[var4] = new nd(var0[var4 + 12], var1[var4 + 12], 144);
        }
        field_C = new nd[var2.length];
        for (var4 = 0; var4 < var2.length; var4++) {
            field_C[var4] = new nd(var2[var4], var3[var4], 240);
        }
        field_J = 0;
    }
}
