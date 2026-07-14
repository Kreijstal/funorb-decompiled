/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends pe implements qd {
    static int field_G;
    private String field_I;
    static boolean field_M;
    private mh field_L;
    private int[] field_E;
    static ta field_K;
    private vd field_J;
    private int field_H;
    private pl[] field_F;

    final pl a(int param0, String param1, ce param2) {
        pl var4 = new pl(param1, param2);
        var4.field_w = (bf) (Object) new jl();
        int var5 = -2 + ((vc) this).field_n;
        ((vc) this).a(param0 ^ 111, 0, ((vc) this).field_n - -34, ((vc) this).field_r, param0);
        var4.a(110, var5, 30, ((vc) this).field_r - 14, 7);
        ((vc) this).a((ub) (Object) var4, (byte) 98);
        return var4;
    }

    final void a(byte param0, String param1, int param2) {
        if (param0 != -31) {
            ((vc) this).field_E = null;
        }
        int var4 = ((vc) this).field_H;
        this.a(1 + var4, (byte) 109);
        ((vc) this).field_F[var4] = ((vc) this).a(0, param1, (ce) this);
        ((vc) this).field_E[var4] = param2;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1 + 0, param2, param3);
        int discarded$0 = ((vc) this).field_J.a(((vc) this).field_I, param0 - -((vc) this).field_o - -14, ((vc) this).field_l + (param3 + 10), ((vc) this).field_r - 28, ((vc) this).field_n, 16777215, -1, param1, 0, ((vc) this).field_J.field_M);
    }

    public static void d(boolean param0) {
        field_K = null;
        if (param0) {
            field_K = null;
        }
    }

    vc(mh param0, vd param1, String param2) {
        super(0, 0, 288, 0, (bf) null);
        ((vc) this).field_H = 0;
        ((vc) this).field_I = param2;
        ((vc) this).field_L = param0;
        ((vc) this).field_J = param1;
        int var4 = ((vc) this).field_I != null ? ((vc) this).field_J.a(((vc) this).field_I, 260, ((vc) this).field_J.field_M) : 0;
        ((vc) this).a(123, 0, 22 - -var4, 288, 0);
    }

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = wizardrun.field_H;
        if (param0 != -18905) {
            ((vc) this).field_L = null;
        }
        for (var6 = 0; ((vc) this).field_H > var6; var6++) {
            if (param1 == ((vc) this).field_F[var6]) {
                var7 = ((vc) this).field_E[var6];
                if (-1 == var7) {
                    ((vc) this).field_L.l(param0 ^ 9704);
                    break;
                }
                jc.a((byte) 94, ((vc) this).field_E[var6]);
                break;
            }
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = wizardrun.field_H;
        bh.field_a = null;
        cf.field_i = false;
        if (param0 != 260) {
            field_M = false;
        }
        if (wi.field_J) {
            aa.field_lb.n(8);
        } else {
            var1 = ei.field_t;
            if (-1 > (var1 ^ -1)) {
                if ((var1 ^ -1) == -2) {
                    bh.field_a = ib.field_d;
                } else {
                    bh.field_a = di.a(new String[1], (byte) 46, of.field_m);
                }
                bh.field_a = ol.a(new CharSequence[3], 550);
            }
            aa.field_lb.l(-27697);
            uh.a((byte) 125);
        }
    }

    private final void a(int param0, byte param1) {
        int var6 = 0;
        int var7 = wizardrun.field_H;
        if (((vc) this).field_H >= param0) {
            return;
        }
        pl[] var8 = new pl[param0];
        pl[] var3 = var8;
        int var4 = 125 % ((param1 - 8) / 33);
        int[] var5 = new int[param0];
        for (var6 = 0; var6 < ((vc) this).field_H; var6++) {
            var8[var6] = ((vc) this).field_F[var6];
            var5[var6] = ((vc) this).field_E[var6];
        }
        ((vc) this).field_F = var3;
        ((vc) this).field_H = param0;
        ((vc) this).field_E = var5;
    }

    final static void a(int param0, String param1) {
        va.a(-2, param1);
        if (param0 >= -67) {
            field_G = -79;
        }
        fc.a(sd.field_c, false, -120);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = 4;
    }
}
