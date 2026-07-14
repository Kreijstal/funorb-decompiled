/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends td implements m {
    private jj field_D;
    private int[] field_C;
    private String field_H;
    static String field_E;
    private int field_I;
    private oh field_F;
    private rh[] field_G;

    private final void a(int param0, int param1) {
        int var6 = 0;
        int var7 = TrackController.field_F ? 1 : 0;
        if (((lc) this).field_I >= param0) {
            return;
        }
        rh[] var8 = new rh[param0];
        rh[] var3 = var8;
        int[] var4 = new int[param0];
        int var5 = -100 / ((param1 - 86) / 32);
        for (var6 = 0; ((lc) this).field_I > var6; var6++) {
            var8[var6] = ((lc) this).field_G[var6];
            var4[var6] = ((lc) this).field_C[var6];
        }
        ((lc) this).field_G = var3;
        ((lc) this).field_C = var4;
        ((lc) this).field_I = param0;
    }

    public static void j(int param0) {
        field_E = null;
        if (param0 <= 111) {
            field_E = null;
        }
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = TrackController.field_F ? 1 : 0;
        if (param4 != -27322) {
            ((lc) this).field_C = null;
        }
        for (var6 = 0; var6 < ((lc) this).field_I; var6++) {
            if (((lc) this).field_G[var6] == param0) {
                var7 = ((lc) this).field_C[var6];
                if (-1 == var7) {
                    ((lc) this).field_D.t(20252);
                    break;
                }
                qc.b(((lc) this).field_C[var6], (byte) -42);
                break;
            }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = ((lc) this).field_F.a(((lc) this).field_H, 14 + param1 + ((lc) this).field_p, param2 + ((lc) this).field_m + 10, ((lc) this).field_x - 28, ((lc) this).field_u, 16777215, -1, 0, 0, ((lc) this).field_F.field_G);
    }

    final rh a(int param0, tg param1, String param2) {
        rh var4 = new rh(param2, param1);
        var4.field_y = (t) (Object) new dc();
        int var5 = ((lc) this).field_u + -2;
        ((lc) this).a(34 + ((lc) this).field_u, -3050, 0, ((lc) this).field_x, 0);
        var4.a(30, -3050, var5, param0 + ((lc) this).field_x, 7);
        ((lc) this).a(false, (al) (Object) var4);
        return var4;
    }

    final static int[] b(boolean param0) {
        if (param0) {
            int[] discarded$0 = lc.b(true);
        }
        return new int[8];
    }

    final void a(int param0, String param1, int param2) {
        int var4 = ((lc) this).field_I;
        if (param0 != -17040) {
            field_E = null;
        }
        this.a(var4 + 1, 120);
        ((lc) this).field_G[var4] = ((lc) this).a(-14, (tg) this, param1);
        ((lc) this).field_C[var4] = param2;
    }

    lc(jj param0, oh param1, String param2) {
        super(0, 0, 288, 0, (t) null);
        ((lc) this).field_I = 0;
        ((lc) this).field_F = param1;
        ((lc) this).field_D = param0;
        ((lc) this).field_H = param2;
        int var4 = null == ((lc) this).field_H ? 0 : ((lc) this).field_F.a(((lc) this).field_H, 260, ((lc) this).field_F.field_G);
        ((lc) this).a(22 + var4, -3050, 0, 288, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
