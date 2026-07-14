/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf extends g implements oi {
    private String field_C;
    private int[] field_K;
    static pf field_E;
    static d field_L;
    static String field_D;
    private ck field_I;
    static int field_F;
    private bd field_G;
    private int field_B;
    private ig[] field_J;

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = stellarshard.field_B;
        if (!(param0 > ((vf) this).field_B)) {
            return;
        }
        if (param1 <= 31) {
            return;
        }
        ig[] var7 = new ig[param0];
        ig[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = 0; var5 < ((vf) this).field_B; var5++) {
            var7[var5] = ((vf) this).field_J[var5];
            var4[var5] = ((vf) this).field_K[var5];
        }
        ((vf) this).field_K = var4;
        ((vf) this).field_B = param0;
        ((vf) this).field_J = var3;
    }

    final static pb[] a(pf param0, byte param1, int param2, int param3) {
        if (param1 != -78) {
            return null;
        }
        if (!tl.a(param0, (byte) -5, param3, param2)) {
            return null;
        }
        return dl.d((byte) 116);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = ((vf) this).field_G.a(((vf) this).field_C, 14 + (param3 + ((vf) this).field_w), 10 + param2 + ((vf) this).field_k, ((vf) this).field_p + -28, ((vf) this).field_t, 16777215, -1, 0, 0, ((vf) this).field_G.field_N);
    }

    final static void a(int param0, int param1, int param2, int param3, pb[] param4, int param5, bd param6, int param7, pb[] param8, int param9, int param10, int param11, int param12, boolean param13, int param14, bd param15) {
        cg.a(param5, eh.field_a, param1, param14, param2, param11, sa.field_h, new qc(param4), param15, (byte) 45, param10, param9, param0, new qc(param8), kl.field_k, lg.field_b, ka.field_q, 480, ul.field_G, param6, param7);
        qc.a(param3, param13, 0);
        if (param12 != 260) {
            field_F = -126;
        }
    }

    final ig a(lf param0, String param1, byte param2) {
        ig var4 = new ig(param1, param0);
        var4.field_u = (uk) (Object) new b();
        int var5 = -2 + ((vf) this).field_t;
        int var6 = -121 / ((15 - param2) / 46);
        ((vf) this).b(((vf) this).field_p, 0, 0, ((vf) this).field_t + 34, 23987);
        var4.b(-14 + ((vf) this).field_p, 7, var5, 30, 23987);
        ((vf) this).b(4, (rj) (Object) var4);
        return var4;
    }

    final void a(int param0, int param1, String param2) {
        int var4 = ((vf) this).field_B;
        this.a(var4 - -1, 73);
        ((vf) this).field_J[var4] = ((vf) this).a((lf) this, param2, (byte) -96);
        if (param0 != -31805) {
            Object var5 = null;
            ig discarded$0 = ((vf) this).a((lf) null, (String) null, (byte) -31);
        }
        ((vf) this).field_K[var4] = param1;
    }

    static int b(int param0, int param1) {
        return param0 | param1;
    }

    public final void a(int param0, int param1, ig param2, boolean param3, int param4) {
        int var7 = 0;
        int var8 = stellarshard.field_B;
        int var6 = 0;
        if (param3) {
            return;
        }
        while (var6 < ((vf) this).field_B) {
            if (!(param2 != ((vf) this).field_J[var6])) {
                var7 = ((vf) this).field_K[var6];
                if (0 != (var7 ^ -1)) {
                    rh.a(((vf) this).field_K[var6], (byte) -72);
                    break;
                }
                ((vf) this).field_I.o(3);
                break;
            }
            var6++;
        }
    }

    final static id a(int param0) {
        if (param0 != 0) {
            vf.d(true);
        }
        if (null == mk.field_l) {
            mk.field_l = new id(de.field_c, 20, 0, 0, 0, 11579568, -1, 0, 0, de.field_c.field_N, -1, 2147483647, true);
        }
        return mk.field_l;
    }

    vf(ck param0, bd param1, String param2) {
        super(0, 0, 288, 0, (uk) null);
        ((vf) this).field_B = 0;
        ((vf) this).field_C = param2;
        ((vf) this).field_G = param1;
        ((vf) this).field_I = param0;
        int var4 = null != ((vf) this).field_C ? ((vf) this).field_G.b(((vf) this).field_C, 260, ((vf) this).field_G.field_N) : 0;
        ((vf) this).b(288, 0, 0, var4 + 22, 23987);
    }

    public static void d(boolean param0) {
        field_L = null;
        field_E = null;
        if (param0) {
            field_D = null;
        }
        field_D = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "This password contains your Player Name, and would be easy to guess";
        field_F = 480;
    }
}
