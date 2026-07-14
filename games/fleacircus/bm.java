/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends gj implements da {
    private bb[] field_F;
    private bd field_L;
    private String field_H;
    static int field_K;
    static String field_N;
    private fa field_G;
    static int field_M;
    private int[] field_I;
    private int field_J;

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = fleas.field_A ? 1 : 0;
        if (param3 != 248) {
            return;
        }
        for (var6 = 0; var6 < ((bm) this).field_J; var6++) {
            if (((bm) this).field_F[var6] == param4) {
                var7 = ((bm) this).field_I[var6];
                if (0 == (var7 ^ -1)) {
                    ((bm) this).field_L.n(-22645);
                    break;
                }
                cg.a((byte) -105, ((bm) this).field_I[var6]);
                break;
            }
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = fleas.field_A ? 1 : 0;
        if (((bm) this).field_J >= param1) {
            return;
        }
        bb[] var7 = new bb[param1];
        bb[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = param0; ((bm) this).field_J > var5; var5++) {
            var7[var5] = ((bm) this).field_F[var5];
            var4[var5] = ((bm) this).field_I[var5];
        }
        ((bm) this).field_F = var3;
        ((bm) this).field_I = var4;
        ((bm) this).field_J = param1;
    }

    public static void c(boolean param0) {
        if (param0) {
            field_N = null;
        }
        field_N = null;
    }

    final bb a(kd param0, boolean param1, String param2) {
        bb var4 = new bb(param2, param0);
        var4.field_p = (ch) (Object) new ri();
        if (!param1) {
            ((bm) this).field_G = null;
        }
        int var5 = ((bm) this).field_j - 2;
        ((bm) this).a(0, ((bm) this).field_u, 0, ((bm) this).field_j + 34, 80);
        var4.a(7, ((bm) this).field_u - 14, var5, 30, 80);
        ((bm) this).a((qa) (Object) var4, (byte) -32);
        return var4;
    }

    final static ll a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = fleas.field_A ? 1 : 0;
        ll var5 = (ll) (Object) jj.field_S.c((byte) 47);
        while (var5 != null) {
            if (!(var5.field_k != param4)) {
                return var5;
            }
            var5 = (ll) (Object) jj.field_S.b((byte) -105);
        }
        ll var5_ref = new ll();
        var5_ref.field_k = param4;
        var5_ref.field_t = param2;
        var5_ref.field_q = param3;
        jj.field_S.a(param0, (lh) (Object) var5_ref);
        ak.a(-14722, var5_ref, param1);
        return var5_ref;
    }

    final static int f(byte param0) {
        if (param0 <= 8) {
            bm.c(true);
        }
        return (int)(1000000000L / na.field_f);
    }

    final static void e(byte param0) {
        int var1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var2 = 0;
        int var8 = 0;
        int var7 = 0;
        int var6 = 0;
        int var5 = 0;
        int var9 = fleas.field_A ? 1 : 0;
        if (param0 != 31) {
            bm.c(false);
        }
        for (var1 = 0; var1 < qi.field_f; var1++) {
            var3 = rk.field_u[var1];
            var4 = kk.field_a[var1];
            var2 = -1 + var3;
            var8 = 16 * var4 + 16;
            var7 = 16 * var3 + 20;
            var6 = var4 * 16;
            if (-15 != (fl.field_c[var3][var4] ^ -1)) {
                if (!(fl.field_c[var3][var4] == 28)) {
                    me.field_i[var1] = 1;
                }
            }
            var5 = var3 * 16;
            while (qg.a(fl.field_c[var2][var4], -48)) {
                var5 -= 16;
                var2--;
            }
            var2 = var3 - -1;
            while (qg.a(fl.field_c[var2][var4], -117)) {
                var2++;
                var7 += 16;
            }
            oa.field_m[var1] = var5;
            uh.field_n[var1] = var6;
            lc.field_v[var1] = var7;
            ca.field_G[var1] = var8;
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4 = ((bm) this).field_J;
        this.a(param1 ^ param1, 1 + var4);
        ((bm) this).field_F[var4] = ((bm) this).a((kd) this, true, param0);
        ((bm) this).field_I[var4] = param2;
    }

    bm(bd param0, fa param1, String param2) {
        super(0, 0, 288, 0, (ch) null);
        ((bm) this).field_J = 0;
        ((bm) this).field_G = param1;
        ((bm) this).field_H = param2;
        ((bm) this).field_L = param0;
        int var4 = null == ((bm) this).field_H ? 0 : ((bm) this).field_G.b(((bm) this).field_H, 260, ((bm) this).field_G.field_H);
        ((bm) this).a(0, 288, 0, var4 + 22, 80);
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        super.b(param0, param1, param2, param3);
        int discarded$0 = ((bm) this).field_G.a(((bm) this).field_H, 14 + param1 + ((bm) this).field_y, param0 + (((bm) this).field_z + 10), -28 + ((bm) this).field_u, ((bm) this).field_j, 16777215, -1, 0, 0, ((bm) this).field_G.field_H);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "To server list";
    }
}
