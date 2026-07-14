/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj extends kf implements vn {
    private String field_Z;
    private gk field_W;
    static StringBuilder field_ab;
    private ek[] field_V;
    static int[][] field_T;
    private int field_U;
    private mm field_X;
    static nh field_cb;
    private int[] field_S;
    static ck field_eb;
    static int field_Y;
    static String field_db;
    static String field_bb;

    dj(gk param0, mm param1, String param2) {
        super(0, 0, 288, 0, (gl) null);
        ((dj) this).field_U = 0;
        ((dj) this).field_X = param1;
        ((dj) this).field_Z = param2;
        ((dj) this).field_W = param0;
        int var4 = null == ((dj) this).field_Z ? 0 : ((dj) this).field_X.b(((dj) this).field_Z, 260, ((dj) this).field_X.field_R);
        ((dj) this).b(var4 + 22, 288, 0, 0, -16555);
    }

    final static int a(int param0) {
        if (param0 < 106) {
            dj.b(false);
        }
        return ig.field_dc;
    }

    public static void b(boolean param0) {
        field_ab = null;
        if (!param0) {
            return;
        }
        field_eb = null;
        field_T = null;
        field_bb = null;
        field_db = null;
        field_cb = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, -104, param2, param3);
        int discarded$32 = ((dj) this).field_X.a(((dj) this).field_Z, param0 - (-((dj) this).field_u - 14), ((dj) this).field_D + (param3 + 10), ((dj) this).field_t - 28, ((dj) this).field_y, 16777215, -1, 0, 0, ((dj) this).field_X.field_R);
        if (param1 > -103) {
            ((dj) this).a(67, 1, 70, -22);
        }
    }

    private final void b(int param0, int param1) {
        int var5 = 0;
        int var6 = client.field_A ? 1 : 0;
        if (!(((dj) this).field_U < param0)) {
            return;
        }
        ek[] var7 = new ek[param0];
        ek[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = 0; var5 < ((dj) this).field_U; var5++) {
            var7[var5] = ((dj) this).field_V[var5];
            var4[var5] = ((dj) this).field_S[var5];
        }
        ((dj) this).field_U = param0;
        var5 = -117 % ((50 - param1) / 51);
        ((dj) this).field_S = var4;
        ((dj) this).field_V = var3;
    }

    final ek a(int param0, String param1, kg param2) {
        ek var4 = new ek(param1, param2);
        var4.field_p = (gl) (Object) new fk();
        int var5 = -2 + ((dj) this).field_y;
        if (param0 <= 95) {
            return null;
        }
        ((dj) this).b(((dj) this).field_y + 34, ((dj) this).field_t, 0, 0, -16555);
        var4.b(30, -14 + ((dj) this).field_t, 7, var5, -16555);
        ((dj) this).b((ce) (Object) var4, (byte) -55);
        return var4;
    }

    final void a(String param0, int param1, int param2) {
        if (param2 != 14) {
            ((dj) this).field_Z = null;
        }
        int var4 = ((dj) this).field_U;
        this.b(1 + var4, -104);
        ((dj) this).field_V[var4] = ((dj) this).a(103, param0, (kg) this);
        ((dj) this).field_S[var4] = param1;
    }

    final static void a(ud param0, int param1) {
        ai.a(98, 0, param0, 128, 128);
        if (param1 != 22) {
            Object var3 = null;
            dj.a((ud) null, 24);
        }
    }

    public final void a(byte param0, int param1, ek param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = client.field_A ? 1 : 0;
        if (param0 != 67) {
            field_db = null;
        }
        for (var6 = 0; var6 < ((dj) this).field_U; var6++) {
            if (!(((dj) this).field_V[var6] != param2)) {
                var7 = ((dj) this).field_S[var6];
                if ((var7 ^ -1) == 0) {
                    ((dj) this).field_W.n(-123);
                    break;
                }
                hm.a(((dj) this).field_S[var6], (byte) -109);
                break;
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = null;
        field_ab = new StringBuilder(80);
        field_bb = "Show lobby chat from my friends";
        field_db = "Show all game chat";
    }
}
