/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends kj implements sg {
    private eg field_P;
    static int[] field_S;
    static int field_N;
    private String field_Q;
    private wa field_J;
    private int field_M;
    private ng[] field_O;
    static boolean field_R;
    private int[] field_K;
    static volatile int field_L;

    public static void a(int param0) {
        if (param0 != 15638) {
            sj.a(-59);
        }
        field_S = null;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = ((sj) this).field_P.a(((sj) this).field_Q, 14 + ((sj) this).field_m + param1, param0 - (-((sj) this).field_i + -10), ((sj) this).field_p - 28, ((sj) this).field_l, 16777215, -1, 0, 0, ((sj) this).field_P.field_x);
    }

    private final void a(int param0, boolean param1) {
        int var5 = 0;
        int var6 = TorChallenge.field_F ? 1 : 0;
        if (((sj) this).field_M >= param0) {
            return;
        }
        ng[] var7 = new ng[param0];
        ng[] var3 = var7;
        if (!param1) {
            ((sj) this).field_M = 16;
        }
        int[] var4 = new int[param0];
        for (var5 = 0; var5 < ((sj) this).field_M; var5++) {
            var7[var5] = ((sj) this).field_O[var5];
            var4[var5] = ((sj) this).field_K[var5];
        }
        ((sj) this).field_O = var3;
        ((sj) this).field_K = var4;
        ((sj) this).field_M = param0;
    }

    sj(wa param0, eg param1, String param2) {
        super(0, 0, 288, 0, (j) null);
        ((sj) this).field_M = 0;
        ((sj) this).field_Q = param2;
        ((sj) this).field_P = param1;
        ((sj) this).field_J = param0;
        int var4 = ((sj) this).field_Q == null ? 0 : ((sj) this).field_P.b(((sj) this).field_Q, 260, ((sj) this).field_P.field_x);
        ((sj) this).a((byte) 106, 0, 22 - -var4, 288, 0);
    }

    final void a(int param0, int param1, String param2) {
        int var4 = ((sj) this).field_M;
        this.a(var4 + 1, true);
        ((sj) this).field_O[var4] = ((sj) this).a((byte) 46, (gg) this, param2);
        ((sj) this).field_K[var4] = param0;
        if (param1 != 2083) {
            field_N = 89;
        }
    }

    public final void a(ng param0, int param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = TorChallenge.field_F ? 1 : 0;
        for (var6 = 0; ((sj) this).field_M > var6; var6++) {
            if (((sj) this).field_O[var6] == param0) {
                var7 = ((sj) this).field_K[var6];
                if (var7 == -1) {
                    ((sj) this).field_J.o(77);
                    break;
                }
                fk.a(!param4 ? true : false, ((sj) this).field_K[var6]);
                break;
            }
        }
        if (param4) {
            field_R = true;
        }
    }

    final ng a(byte param0, gg param1, String param2) {
        if (param0 != 46) {
            Object var6 = null;
            ((sj) this).a((ng) null, 51, -46, 106, false);
        }
        ng var4 = new ng(param2, param1);
        var4.field_q = (j) (Object) new cl();
        int var5 = -2 + ((sj) this).field_l;
        ((sj) this).a((byte) 112, 0, 34 + ((sj) this).field_l, ((sj) this).field_p, 0);
        var4.a((byte) 127, 7, 30, -14 + ((sj) this).field_p, var5);
        ((sj) this).a(0, (ee) (Object) var4);
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = 0;
        field_S = new int[8192];
        field_R = false;
        field_L = 0;
    }
}
