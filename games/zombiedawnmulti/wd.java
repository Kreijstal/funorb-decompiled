/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends se implements in {
    static ri field_P;
    static id field_G;
    static int[] field_Q;
    private String field_O;
    static gd field_L;
    private ne field_R;
    private int[] field_N;
    private gn[] field_H;
    private int field_J;
    static String field_I;
    private fm field_M;

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = ((wd) this).field_M.a(((wd) this).field_O, ((wd) this).field_y + param3 - -14, param1 + (((wd) this).field_i + 10), -28 + ((wd) this).field_n, ((wd) this).field_w, 16777215, -1, 0, 0, ((wd) this).field_M.field_C);
    }

    public static void a(byte param0) {
        field_I = null;
        field_P = null;
        field_L = null;
        field_Q = null;
        field_G = null;
        if (param0 > -23) {
            Object var2 = null;
            wd.a(11, 88, 108, -22, (ga) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, ga param4) {
        ok.a(param1 + -126, param1, param4, param3, param0, param2);
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((wd) this).field_J >= param1) {
            return;
        }
        if (param0 != -3481) {
            return;
        }
        gn[] var7 = new gn[param1];
        gn[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < ((wd) this).field_J; var5++) {
            var7[var5] = ((wd) this).field_H[var5];
            var4[var5] = ((wd) this).field_N[var5];
        }
        ((wd) this).field_J = param1;
        ((wd) this).field_H = var3;
        ((wd) this).field_N = var4;
    }

    final static void a(int param0, int param1, ga param2, int param3, int param4, int param5) {
        if (op.field_m.field_c) {
            return;
        }
        if (param4 < 21) {
            return;
        }
        if (df.field_I) {
            boolean discarded$0 = cf.field_s.a(0, param3, param5, param0, false);
            return;
        }
        param2.b((byte) -35, 58);
        param2.a(param1, (byte) -110);
        param2.a(param0, (byte) -125);
        param2.a(param3, (byte) -47);
        param2.a(param5, (byte) -109);
    }

    wd(ne param0, fm param1, String param2) {
        super(0, 0, 288, 0, (nl) null);
        ((wd) this).field_J = 0;
        ((wd) this).field_R = param0;
        ((wd) this).field_O = param2;
        ((wd) this).field_M = param1;
        int var4 = ((wd) this).field_O != null ? ((wd) this).field_M.a(((wd) this).field_O, 260, ((wd) this).field_M.field_C) : 0;
        ((wd) this).b(0, 0, 28972, 288, 22 - -var4);
    }

    final gn a(String param0, int param1, bj param2) {
        gn var4 = new gn(param0, param2);
        var4.field_h = (nl) (Object) new oq();
        int var5 = ((wd) this).field_w - 2;
        ((wd) this).b(0, 0, 28972, ((wd) this).field_n, ((wd) this).field_w - -34);
        var4.b(7, var5, 28972, -14 + ((wd) this).field_n, 30);
        if (param1 >= -59) {
            wd.a((byte) -6);
        }
        ((wd) this).b((byte) 122, (cf) (Object) var4);
        return var4;
    }

    final void a(String param0, int param1, boolean param2) {
        int var4 = ((wd) this).field_J;
        if (!param2) {
            ((wd) this).field_N = null;
        }
        this.a(-3481, 1 + var4);
        ((wd) this).field_H[var4] = ((wd) this).a(param0, -108, (bj) this);
        ((wd) this).field_N[var4] = param1;
    }

    public final void a(int param0, int param1, gn param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = ZombieDawnMulti.field_E ? 1 : 0;
        for (var6 = 0; var6 < ((wd) this).field_J; var6++) {
            if (param2 == ((wd) this).field_H[var6]) {
                var7 = ((wd) this).field_N[var6];
                if (0 != (var7 ^ -1)) {
                    fb.a(((wd) this).field_N[var6], 111);
                    break;
                }
                ((wd) this).field_R.m(-7435);
                break;
            }
        }
        if (param3 >= -83) {
            ((wd) this).a(115, -39, -122, -67);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Use this alternative as your account name";
    }
}
