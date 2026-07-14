/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends kd {
    int field_h;
    int field_o;
    int field_q;
    static ja field_r;
    int field_n;
    static ng field_m;
    int field_p;
    static aj field_l;
    int field_j;
    static int field_i;
    static String field_k;

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int[] param6, int param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = Lexicominos.field_L ? 1 : 0;
        if (param5 != -95) {
            field_m = null;
        }
        while (true) {
            param2--;
            if (0 > param2) {
                break;
            }
            var17 = param6;
            var10 = var17;
            var11 = param8;
            var12 = param4;
            var13 = param1;
            var14 = param9;
            var15 = (16711422 & var17[var11]) >> 2087352065;
            var10[var11] = vg.a(var13 >> -1801119671, 65280) + vg.a(var12 >> -1304186335, 16711680) + (vg.a(var14, 33440375) >> 422246321) + var15;
            param9 = param9 + param3;
            param4 = param4 + param0;
            param1 = param1 + param7;
            param8++;
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_l = null;
        if (param0 < 66) {
            return;
        }
        field_m = null;
        field_r = null;
    }

    final static boolean a(byte param0, char param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = Lexicominos.field_L ? 1 : 0;
        if (Character.isISOControl(param1)) {
            return false;
        }
        if (!(!jd.a((byte) -16, param1))) {
            return true;
        }
        char[] var7 = hb.field_a;
        char[] var2 = var7;
        int var3 = 97 % ((28 - param0) / 61);
        for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (param1 == var5) {
                return true;
            }
        }
        var2 = n.field_l;
        for (var3 = 0; var3 < var2.length; var3++) {
            var4 = var2[var3];
            if (var4 == param1) {
                return true;
            }
        }
        return false;
    }

    vb(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((vb) this).field_p = param1;
        ((vb) this).field_h = param4;
        ((vb) this).field_n = param0;
        ((vb) this).field_j = param2;
        ((vb) this).field_q = param3;
        ((vb) this).field_o = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new ng();
        field_l = new aj(4, 1, 1, 1);
        field_k = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
