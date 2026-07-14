/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wf extends ta {
    static String field_q;
    int field_t;
    int field_s;
    int field_u;
    int field_w;
    static ei field_x;
    int field_v;
    int field_r;

    final static void c(byte param0) {
        int var1 = 0;
        int var3_int = 0;
        double[] var4_ref_double__ = null;
        int var5 = 0;
        double[] var3 = null;
        int var4 = 0;
        int var6 = Torquing.field_u;
        int var2 = 86 % ((-30 - param0) / 41);
        for (var1 = 0; -9 < (var1 ^ -1); var1++) {
            for (var3_int = 0; (var3_int ^ -1) > -9; var3_int++) {
                var4_ref_double__ = jl.field_O[var1];
                mg.field_a[var1][var3_int] = 0.0;
                var5 = var3_int;
                var4_ref_double__[var5] = 0.0;
            }
            var3 = go.field_w;
            var4 = var1;
            vf.field_e[var1] = 0.0;
            var3[var4] = 0.0;
        }
        ia.field_i = 0;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = ((wf) this).field_w << -1563841277;
        if (param1 != 1326547364) {
            ((wf) this).b(78, 62, -121, -50, -99);
        }
        param4 = (15 & var6) + (param4 << 1326547364);
        int var7 = ((wf) this).field_u << -67037501;
        param3 = (param3 << -620567804) + (var7 & 15);
        ((wf) this).b(var6, var7, param4, param3, param2, param0);
    }

    final static t[] a(int param0, int param1, int param2, int param3, byte param4) {
        t[] var6 = new t[9];
        t[] var5 = var6;
        var6[6] = hj.a((byte) -87, param1, param2);
        var5[3] = hj.a((byte) -87, param1, param2);
        var5[2] = hj.a((byte) -87, param1, param2);
        var5[1] = hj.a((byte) -87, param1, param2);
        var5[0] = hj.a((byte) -87, param1, param2);
        var6[8] = hj.a((byte) -86, param3, param2);
        var5[7] = hj.a((byte) -86, param3, param2);
        var5[5] = hj.a((byte) -86, param3, param2);
        if (!(param0 == 0)) {
            var6[4] = hj.a((byte) -88, param0, 64);
        }
        if (param4 != 106) {
            return null;
        }
        return var5;
    }

    abstract void b(int param0, int param1, int param2, int param3, int param4, int param5);

    final static int a(byte param0, int param1, byte[] param2) {
        if (param0 != -117) {
            field_x = null;
        }
        return nn.a(7655, param2, 0, param1);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        ph.b(2 + param3, param0 + 1, 4, param4);
        ph.a(param3 + 6, 2 + param0, 4, param4);
        ph.a(5 + param3, 6 + param0, 5, param4);
        ph.a(param3 + 4, param0 - -11, 4, param4);
        ph.b(param3 - -2, param0 - -15, 2, param4);
        ph.a(1 + param3, param0 + 2, 9, param4);
        int var5 = -89 / ((83 - param2) / 42);
        ph.a(2 + param3, param0 + 11, 4, param4);
        ph.a(2 + param3, param0 + 2, 9, param1);
        ph.a(param3 - -3, 2 + param0, 13, param1);
        ph.a(4 + param3, 2 + param0, 9, param1);
        ph.a(param3 - -5, param0 + 2, 4, param1);
    }

    public static void a(boolean param0) {
        field_x = null;
        field_q = null;
        if (param0) {
            wf.a(true);
        }
    }

    wf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "HIGH";
    }
}
