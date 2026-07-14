/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm extends kn implements sh {
    private int[] field_P;
    static int[] field_N;
    private int field_R;
    private hc[] field_M;
    private we field_Q;
    static String field_K;
    static String field_O;
    static fg[] field_S;
    private String field_L;
    private rg field_J;
    static String field_I;

    public final void a(int param0, byte param1, hc param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        for (var6 = 0; var6 < ((fm) this).field_R; var6++) {
            if (((fm) this).field_M[var6] == param2) {
                var7 = ((fm) this).field_P[var6];
                if (var7 == -1) {
                    ((fm) this).field_J.s(2121792);
                    break;
                }
                oj.a(((fm) this).field_P[var6], 3);
                break;
            }
        }
        if (param1 != 6) {
            ((fm) this).field_J = null;
        }
    }

    final hc a(String param0, int param1, rm param2) {
        hc var4 = new hc(param0, param2);
        if (param1 <= 28) {
            ((fm) this).field_P = null;
        }
        var4.field_A = (ad) (Object) new wi();
        int var5 = -2 + ((fm) this).field_q;
        ((fm) this).a(((fm) this).field_q - -34, -88, 0, ((fm) this).field_v, 0);
        var4.a(30, -89, 7, -14 + ((fm) this).field_v, var5);
        ((fm) this).a(-1, (fe) (Object) var4);
        return var4;
    }

    final static boolean a(byte param0) {
        int var1 = 99 / ((-61 - param0) / 56);
        return am.c((byte) 111) == 35 ? true : false;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = ((fm) this).field_Q.a(((fm) this).field_L, ((fm) this).field_u + param1 + 14, param2 - -((fm) this).field_t + 10, ((fm) this).field_v - 28, ((fm) this).field_q, 16777215, -1, 0, 0, ((fm) this).field_Q.field_I);
    }

    final static void f(byte param0) {
        ui.field_L = -640;
        if (param0 != 81) {
            return;
        }
        fl.field_d = false;
        el.field_c = false;
        tk.field_a = false;
    }

    fm(rg param0, we param1, String param2) {
        super(0, 0, 288, 0, (ad) null);
        ((fm) this).field_R = 0;
        ((fm) this).field_L = param2;
        ((fm) this).field_Q = param1;
        ((fm) this).field_J = param0;
        int var4 = ((fm) this).field_L == null ? 0 : ((fm) this).field_Q.b(((fm) this).field_L, 260, ((fm) this).field_Q.field_I);
        ((fm) this).a(var4 + 22, -93, 0, 288, 0);
    }

    public static void e(byte param0) {
        if (param0 != -123) {
            field_N = null;
        }
        field_K = null;
        field_I = null;
        field_S = null;
        field_N = null;
        field_O = null;
    }

    final static void a(String param0, boolean param1) {
        if (param1) {
            fm.e((byte) -36);
        }
    }

    final void a(int param0, String param1, int param2) {
        int var4 = ((fm) this).field_R;
        this.a(-32164, var4 - -1);
        ((fm) this).field_M[var4] = ((fm) this).a(param1, 35, (rm) this);
        if (param2 > -55) {
            field_I = null;
        }
        ((fm) this).field_P[var4] = param0;
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = MinerDisturbance.field_ab;
        if (param0 != -32164) {
            return;
        }
        if (((fm) this).field_R >= param1) {
            return;
        }
        hc[] var7 = new hc[param1];
        hc[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < ((fm) this).field_R; var5++) {
            var7[var5] = ((fm) this).field_M[var5];
            var4[var5] = ((fm) this).field_P[var5];
        }
        ((fm) this).field_P = var4;
        ((fm) this).field_R = param1;
        ((fm) this).field_M = var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_S = new fg[255];
        field_O = "Ranking: Insipid Explorer";
        field_N = new int[4];
        field_K = "Need more lift? Grab this handy jetpack! Hold <img=25> and <img=17> to rocket into the skies! Comes with 2 year warantee to offset the volatile nature of the device.";
        for (var0 = 0; field_S.length > var0; var0++) {
            field_S[var0] = new fg();
        }
        field_I = "Your email address is used to identify this account";
    }
}
