/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e extends hp implements hh {
    static int field_O;
    private an[] field_F;
    static String field_I;
    static int field_H;
    private rb field_L;
    private int[] field_J;
    static dn field_S;
    private int field_N;
    private String field_Q;
    static vn field_G;
    private sg field_R;
    static int field_P;
    static int field_K;

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3 ^ 0);
        int discarded$0 = ((e) this).field_L.a(((e) this).field_Q, ((e) this).field_k + param2 + 14, ((e) this).field_j + (param0 + 10), ((e) this).field_i - 28, ((e) this).field_n, 16777215, -1, 0, param3, ((e) this).field_L.field_I);
    }

    final an a(String param0, int param1, sk param2) {
        if (param1 < 102) {
            return null;
        }
        an var4 = new an(param0, param2);
        var4.field_h = (io) (Object) new vm();
        int var5 = -2 + ((e) this).field_n;
        ((e) this).a(113, 0, 0, ((e) this).field_i, ((e) this).field_n + 34);
        var4.a(51, var5, 7, -14 + ((e) this).field_i, 30);
        ((e) this).a((ga) (Object) var4, 10);
        return var4;
    }

    final void a(byte param0, String param1, int param2) {
        int var4 = ((e) this).field_N;
        this.a(-128, 1 + var4);
        ((e) this).field_F[var4] = ((e) this).a(param1, 125, (sk) this);
        ((e) this).field_J[var4] = param2;
        if (param0 < 88) {
            ((e) this).field_F = null;
        }
    }

    private final void a(int param0, int param1) {
        int var6 = 0;
        int var7 = ZombieDawn.field_J;
        if (!(((e) this).field_N < param1)) {
            return;
        }
        int var4 = -81 / ((-66 - param0) / 59);
        an[] var8 = new an[param1];
        an[] var3 = var8;
        int[] var5 = new int[param1];
        for (var6 = 0; ((e) this).field_N > var6; var6++) {
            var8[var6] = ((e) this).field_F[var6];
            var5[var6] = ((e) this).field_J[var6];
        }
        ((e) this).field_N = param1;
        ((e) this).field_J = var5;
        ((e) this).field_F = var3;
    }

    e(sg param0, rb param1, String param2) {
        super(0, 0, 288, 0, (io) null);
        ((e) this).field_N = 0;
        ((e) this).field_L = param1;
        ((e) this).field_Q = param2;
        ((e) this).field_R = param0;
        int var4 = ((e) this).field_Q != null ? ((e) this).field_L.b(((e) this).field_Q, 260, ((e) this).field_L.field_I) : 0;
        ((e) this).a(44, 0, 0, 288, var4 + 22);
    }

    public static void b(boolean param0) {
        field_S = null;
        field_I = null;
        if (!param0) {
            field_G = null;
        }
        field_G = null;
    }

    public final void a(int param0, int param1, an param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = ZombieDawn.field_J;
        if (param1 != -6) {
            this.a(-49, -101);
        }
        for (var6 = 0; var6 < ((e) this).field_N; var6++) {
            if (param2 == ((e) this).field_F[var6]) {
                var7 = ((e) this).field_J[var6];
                if (var7 != -1) {
                    og.b(param1 ^ 120, ((e) this).field_J[var6]);
                    break;
                }
                ((e) this).field_R.h((byte) -126);
                break;
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = 500;
        field_I = "Unpacking music";
        field_P = -1;
        field_K = 67;
    }
}
