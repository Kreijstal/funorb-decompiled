/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends nb implements jk {
    private le field_E;
    private int field_J;
    static String field_G;
    private kf[] field_H;
    static vi field_D;
    private uc field_F;
    private String field_L;
    static int[] field_K;
    private int[] field_B;

    final void a(byte param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = ((vc) this).field_E.a(((vc) this).field_L, ((vc) this).field_t + param2 + 14, 10 + param1 + ((vc) this).field_o, ((vc) this).field_j + -28, ((vc) this).field_v, 16777215, -1, 0, 0, ((vc) this).field_E.field_E);
    }

    vc(uc param0, le param1, String param2) {
        super(0, 0, 288, 0, (rd) null);
        ((vc) this).field_J = 0;
        ((vc) this).field_E = param1;
        ((vc) this).field_L = param2;
        ((vc) this).field_F = param0;
        int var4 = null == ((vc) this).field_L ? 0 : ((vc) this).field_E.a(((vc) this).field_L, 260, ((vc) this).field_E.field_E);
        ((vc) this).a(var4 + 22, 288, true, 0, 0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        fb.field_g = param2;
        kk.field_o = param1;
        hc.field_fb = param4;
        sb.field_f = param3;
        if (param0 != -5094) {
            field_D = null;
        }
    }

    final kf a(int param0, String param1, vd param2) {
        kf var4 = new kf(param1, param2);
        var4.field_i = (rd) (Object) new v();
        if (param0 != -1) {
            field_G = null;
        }
        int var5 = -2 + ((vc) this).field_v;
        ((vc) this).a(34 + ((vc) this).field_v, ((vc) this).field_j, true, 0, 0);
        var4.a(30, ((vc) this).field_j - 14, true, var5, 7);
        ((vc) this).b((byte) -106, (w) (Object) var4);
        return var4;
    }

    final void a(String param0, int param1, int param2) {
        int var4 = ((vc) this).field_J;
        this.b(102, var4 - -1);
        int var5 = 61 / ((param2 - 47) / 58);
        ((vc) this).field_H[var4] = ((vc) this).a(-1, param0, (vd) this);
        ((vc) this).field_B[var4] = param1;
    }

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = Lexicominos.field_L ? 1 : 0;
        if (param2 != 215535458) {
            Object var9 = null;
            kf discarded$0 = ((vc) this).a(-94, (String) null, (vd) null);
        }
        for (var6 = 0; ((vc) this).field_J > var6; var6++) {
            if (!(((vc) this).field_H[var6] != param4)) {
                var7 = ((vc) this).field_B[var6];
                if (0 != (var7 ^ -1)) {
                    ni.a(82, ((vc) this).field_B[var6]);
                    break;
                }
                ((vc) this).field_F.g(true);
                break;
            }
        }
    }

    private final void b(int param0, int param1) {
        int var5 = 0;
        int var6 = Lexicominos.field_L ? 1 : 0;
        if (((vc) this).field_J >= param1) {
            return;
        }
        kf[] var7 = new kf[param1];
        kf[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < ((vc) this).field_J; var5++) {
            var7[var5] = ((vc) this).field_H[var5];
            var4[var5] = ((vc) this).field_B[var5];
        }
        ((vc) this).field_H = var3;
        ((vc) this).field_J = param1;
        if (param0 < 69) {
            return;
        }
        ((vc) this).field_B = var4;
    }

    public static void g(int param0) {
        field_G = null;
        if (param0 != -16531) {
            return;
        }
        field_D = null;
        field_K = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_G = "Account created successfully!";
    }
}
