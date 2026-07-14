/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends cj implements ij {
    static int[] field_O;
    static cr field_I;
    private int field_N;
    private d[] field_P;
    private cc field_M;
    static int field_H;
    private int[] field_J;
    static String field_E;
    static int field_F;
    static String field_G;
    private String field_K;
    private fj field_L;

    private final void c(int param0, int param1) {
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        if (((rh) this).field_N >= param1) {
            return;
        }
        d[] var7 = new d[param1];
        d[] var3 = var7;
        int[] var4 = new int[param1];
        if (param0 != 27812) {
            ((rh) this).field_J = null;
        }
        for (var5 = 0; ((rh) this).field_N > var5; var5++) {
            var7[var5] = ((rh) this).field_P[var5];
            var4[var5] = ((rh) this).field_J[var5];
        }
        ((rh) this).field_J = var4;
        ((rh) this).field_P = var3;
        ((rh) this).field_N = param1;
    }

    final void a(String param0, int param1, int param2) {
        int var4 = ((rh) this).field_N;
        this.c(27812, var4 - -1);
        ((rh) this).field_P[var4] = ((rh) this).a(param0, (uf) this, -121);
        ((rh) this).field_J[var4] = param1;
        if (param2 >= -24) {
            field_I = null;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int discarded$32 = ((rh) this).field_M.a(((rh) this).field_K, 14 + (param2 + ((rh) this).field_o), 10 + (param3 + ((rh) this).field_t), ((rh) this).field_n + -28, ((rh) this).field_s, 16777215, -1, 0, 0, ((rh) this).field_M.field_z);
        if (param0) {
            rh.b(81, -4);
        }
    }

    rh(fj param0, cc param1, String param2) {
        super(0, 0, 288, 0, (ur) null);
        ((rh) this).field_N = 0;
        ((rh) this).field_L = param0;
        ((rh) this).field_M = param1;
        ((rh) this).field_K = param2;
        int var4 = ((rh) this).field_K != null ? ((rh) this).field_M.a(((rh) this).field_K, 260, ((rh) this).field_M.field_z) : 0;
        ((rh) this).a(false, 0, 0, 22 - -var4, 288);
    }

    public static void a(byte param0) {
        int var1 = -98 % ((param0 - 48) / 47);
        field_I = null;
        field_G = null;
        field_O = null;
        field_E = null;
    }

    final static boolean a(int param0, String param1) {
        int var3 = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        int var2 = param1.charAt(0);
        for (var3 = 1; var3 < param1.length(); var3++) {
            if (var2 != param1.charAt(var3)) {
                return false;
            }
        }
        if (param0 != 288) {
            field_G = null;
            return true;
        }
        return true;
    }

    final static String a(byte param0, int param1, char param2) {
        int var4 = 0;
        int var5 = Vertigo2.field_L ? 1 : 0;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        if (param0 >= -93) {
            return null;
        }
        for (var4 = 0; param1 > var4; var4++) {
            var6[var4] = param2;
        }
        return new String(var6);
    }

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var8 = 0;
        int var9 = Vertigo2.field_L ? 1 : 0;
        int var7 = 86 / ((-63 - param2) / 51);
        for (var6 = 0; ((rh) this).field_N > var6; var6++) {
            if (((rh) this).field_P[var6] == param1) {
                var8 = ((rh) this).field_J[var6];
                if ((var8 ^ -1) == 0) {
                    ((rh) this).field_L.h((byte) 56);
                    break;
                }
                rh.b(-14, ((rh) this).field_J[var6]);
                break;
            }
        }
    }

    final static boolean e(byte param0) {
        if (param0 != 99) {
            field_I = null;
        }
        return ii.field_z;
    }

    final d a(String param0, uf param1, int param2) {
        if (param2 >= -99) {
            ((rh) this).field_N = 47;
        }
        d var4 = new d(param0, param1);
        var4.field_B = (ur) (Object) new vo();
        int var5 = -2 + ((rh) this).field_s;
        ((rh) this).a(false, 0, 0, ((rh) this).field_s + 34, ((rh) this).field_n);
        var4.a(false, 7, var5, 30, -14 + ((rh) this).field_n);
        ((rh) this).c((byte) 116, (iq) (Object) var4);
        return var4;
    }

    final static void b(int param0, int param1) {
        if (param0 != -14) {
            rh.b(-7, 112);
        }
        nm.field_F = param1;
    }

    final static er[] a(er param0, int param1) {
        er[] var3 = new er[9];
        er[] var2 = var3;
        if (param1 != -27140) {
            return null;
        }
        var3[4] = param0;
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Standard Game";
        field_H = 0;
        field_G = "blue died";
    }
}
