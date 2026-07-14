/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm extends dl implements ae {
    static wk[] field_S;
    static String field_W;
    static wk[] field_R;
    private String field_P;
    private oa[] field_bb;
    private int field_V;
    static boolean field_Q;
    private int[] field_U;
    static wk[] field_Y;
    private k field_X;
    static wk[] field_Z;
    static long[] field_T;
    private mi field_ab;

    public static void a(byte param0) {
        field_Z = null;
        field_Y = null;
        field_S = null;
        field_W = null;
        field_R = null;
        int var1 = 24 / ((77 - param0) / 37);
        field_T = null;
    }

    bm(k param0, mi param1, String param2) {
        super(0, 0, 288, 0, (qk) null);
        ((bm) this).field_V = 0;
        ((bm) this).field_P = param2;
        ((bm) this).field_ab = param1;
        ((bm) this).field_X = param0;
        int var4 = null != ((bm) this).field_P ? ((bm) this).field_ab.a(((bm) this).field_P, 260, ((bm) this).field_ab.field_G) : 0;
        ((bm) this).a(0, (byte) -93, 0, 288, var4 + 22);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -123, param2, param3);
        if (param1 > -99) {
            ((bm) this).a(-109, (byte) 96, 110, -22);
        }
        int discarded$0 = ((bm) this).field_ab.a(((bm) this).field_P, ((bm) this).field_o + (param2 + 14), ((bm) this).field_z + param0 + 10, ((bm) this).field_x + -28, ((bm) this).field_E, 16777215, -1, 0, 0, ((bm) this).field_ab.field_G);
    }

    final static wk[] b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = SteelSentinels.field_G;
        wk[] var7 = new wk[9];
        wk[] var4 = var7;
        if (param1 != -2) {
            bm.a((byte) 112);
        }
        var7[0] = bd.a(param0, param2, 248);
        for (var5 = 1; (var5 ^ -1) > -10; var5++) {
            var7[var5] = var7[0];
        }
        var4[4] = bd.a(param3, 64, 248);
        return var4;
    }

    public final void a(int param0, byte param1, int param2, oa param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = SteelSentinels.field_G;
        for (var6 = 0; ((bm) this).field_V > var6; var6++) {
            if (!(param3 != ((bm) this).field_bb[var6])) {
                var7 = ((bm) this).field_U[var6];
                if (0 != (var7 ^ -1)) {
                    hc.a(((bm) this).field_U[var6], 0);
                    break;
                }
                ((bm) this).field_X.m(112);
                break;
            }
        }
        var6 = -76 / ((-85 - param1) / 36);
    }

    private final void a(int param0, byte param1) {
        int var5 = 0;
        int var6 = SteelSentinels.field_G;
        if (!(((bm) this).field_V < param0)) {
            return;
        }
        if (param1 < 71) {
            field_T = null;
        }
        oa[] var7 = new oa[param0];
        oa[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = 0; ((bm) this).field_V > var5; var5++) {
            var7[var5] = ((bm) this).field_bb[var5];
            var4[var5] = ((bm) this).field_U[var5];
        }
        ((bm) this).field_bb = var3;
        ((bm) this).field_U = var4;
        ((bm) this).field_V = param0;
    }

    final oa a(int param0, tn param1, String param2) {
        oa var4 = new oa(param2, param1);
        if (param0 > -101) {
            this.a(3, (byte) -77);
        }
        var4.field_p = (qk) (Object) new kh();
        int var5 = -2 + ((bm) this).field_E;
        ((bm) this).a(0, (byte) -85, 0, ((bm) this).field_x, 34 + ((bm) this).field_E);
        var4.a(7, (byte) -123, var5, ((bm) this).field_x - 14, 30);
        ((bm) this).a((lh) (Object) var4, -83);
        return var4;
    }

    final void a(int param0, String param1, int param2) {
        int var4 = ((bm) this).field_V;
        this.a(var4 + 1, (byte) 108);
        ((bm) this).field_bb[var4] = ((bm) this).a(-102, (tn) this, param1);
        if (param2 < 67) {
            ((bm) this).field_bb = null;
        }
        ((bm) this).field_U[var4] = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = "Enter name of player to add to list";
        field_Q = false;
        field_T = new long[32];
    }
}
