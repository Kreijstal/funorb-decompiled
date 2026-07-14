/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm {
    static ko field_a;
    private int field_g;
    private int field_f;
    private int field_c;
    private int field_b;
    static long field_d;
    static int field_e;

    final static wj[] a(int param0) {
        int var2 = 0;
        int var3 = CrazyCrystals.field_B;
        wj[] var1 = new wj[mg.field_a];
        for (var2 = 0; var2 < mg.field_a; var2++) {
            var1[var2] = new wj(km.field_c, bo.field_o, uo.field_k[var2], jm.field_a[var2], uo.field_l[var2], je.field_c[var2], ui.field_c[var2], gh.field_z);
        }
        if (param0 >= -44) {
            wm.b(97);
        }
        ok.a(2188450);
        return var1;
    }

    final static void b(byte param0) {
        if (!ne.field_d) {
            throw new IllegalStateException();
        }
        if (!(null == sp.field_a)) {
            sp.field_a.i((byte) -99);
        }
        String var1 = vg.c((byte) 104);
        mk.field_b = new vk(var1, (String) null, true, false, false);
        qe.field_g.b(-3264, (qm) (Object) jm.field_d);
        if (param0 != -12) {
            field_d = -98L;
        }
        jm.field_d.a((qm) (Object) mk.field_b, (byte) -50);
        jm.field_d.j(param0 + 11);
    }

    final void a(byte param0) {
        kh.d(((wm) this).field_c, ((wm) this).field_g, ((wm) this).field_f, ((wm) this).field_b);
        if (param0 >= -2) {
            wm.b((byte) -27);
        }
    }

    final static void a(int param0, int param1, dl param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = param3 + param2.field_v + (param0 - param8);
        int var10 = param2.field_v + (param3 + param0) + param6;
        int var11 = (param2.field_u >> -1009963071) + (param1 + param2.field_t);
        kh.a(var9, 0, var10, var11 + param5);
        param2.d(param3 - 1, -1 + param1, param7);
        param2.d(-1 + param3, 1 + param1, param7);
        kh.a(mc.field_m);
        kh.a(1 + var9, 0, var10 - -1, param5 + var11);
        param2.d(param3 - -1, -1 + param1, param7);
        param2.d(param3 + 1, 1 + param1, param7);
        kh.a(mc.field_m);
        var10 = param3 + param2.field_l + param2.field_v - (param0 + param8);
        var9 = -param0 + param2.field_l + (param2.field_v + param3 - param6);
        kh.a(var9, -param5 + var11, var10, 480);
        param2.d(param3 - 1, -1 + param1, param7);
        param2.d(param3 - 1, param1 - -1, param7);
        kh.a(mc.field_m);
        kh.a(1 + var9, var11 + -param5, 1 + var10, param4);
        param2.d(param3 - -1, param1 + -1, param7);
        param2.d(param3 - -1, param1 - -1, param7);
        kh.a(mc.field_m);
    }

    wm(int param0, int param1, int param2, int param3) {
        ((wm) this).field_g = param1;
        ((wm) this).field_f = param2;
        ((wm) this).field_c = param0;
        ((wm) this).field_b = param3;
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != -1) {
            wm.b(-12);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
    }
}
