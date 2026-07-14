/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends gi {
    static int field_I;
    static int field_w;
    private ie field_A;
    static String field_x;
    static int[] field_D;
    static gh field_H;
    static String field_y;
    private int field_F;
    static tg field_z;
    static String field_G;
    static String field_C;
    static String field_E;
    static boolean field_B;

    final void a(int param0, byte param1) {
        ((kj) this).field_p = ((kj) this).field_p + 1;
        ((kj) this).field_t[((kj) this).field_p] = (byte)(param0 + ((kj) this).field_A.c(-96));
        if (param1 != -117) {
            field_y = null;
        }
    }

    public static void e(boolean param0) {
        field_y = null;
        field_D = null;
        field_G = null;
        field_z = null;
        field_H = null;
        if (!param0) {
            return;
        }
        field_x = null;
        field_E = null;
        field_C = null;
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int var5 = 0;
        int var6 = SteelSentinels.field_G;
        if (param3 < 49) {
            field_E = null;
            for (var5 = 0; var5 < param1; var5++) {
                ((kj) this).field_p = ((kj) this).field_p + 1;
                param2[param0 + var5] = (byte)(((kj) this).field_t[((kj) this).field_p] + -((kj) this).field_A.c(-93));
            }
            return;
        }
        for (var5 = 0; var5 < param1; var5++) {
            ((kj) this).field_p = ((kj) this).field_p + 1;
            param2[param0 + var5] = (byte)(((kj) this).field_t[((kj) this).field_p] + -((kj) this).field_A.c(-93));
        }
    }

    final static int j(int param0) {
        gb.field_c.a(false);
        if (!ne.field_N.d((byte) 125)) {
            return qh.d((byte) -107);
        }
        if (param0 <= 9) {
            int discarded$0 = kj.j(-98);
            return 0;
        }
        return 0;
    }

    final void i(byte param0) {
        if (param0 != -3) {
            int discarded$0 = kj.j(53);
            ((kj) this).field_p = (7 + ((kj) this).field_F) / 8;
            return;
        }
        ((kj) this).field_p = (7 + ((kj) this).field_F) / 8;
    }

    final void a(int param0, int[] param1) {
        if (param0 != -1833430685) {
            field_B = true;
            ((kj) this).field_A = new ie(param1);
            return;
        }
        ((kj) this).field_A = new ie(param1);
    }

    final void d(boolean param0) {
        ((kj) this).field_F = ((kj) this).field_p * 8;
        if (param0) {
            int discarded$0 = kj.j(-27);
        }
    }

    final int g(int param0, int param1) {
        int var7 = SteelSentinels.field_G;
        int var3 = ((kj) this).field_F >> -1833430685;
        int var4 = -(((kj) this).field_F & 7) + 8;
        ((kj) this).field_F = ((kj) this).field_F + param1;
        int var5 = 0;
        while (param1 > var4) {
            var3++;
            var5 = var5 + ((((kj) this).field_t[var3] & kd.field_r[var4]) << param1 + -var4);
            param1 = param1 - var4;
            var4 = 8;
        }
        int var6 = 64 % ((param0 - -27) / 36);
        if (param1 != var4) {
            var5 = var5 + (((kj) this).field_t[var3] >> var4 + -param1 & kd.field_r[param1]);
        } else {
            var5 = var5 + (((kj) this).field_t[var3] & kd.field_r[var4]);
        }
        return var5;
    }

    kj(byte[] param0) {
        super(param0);
    }

    kj(int param0) {
        super(param0);
    }

    final int f(boolean param0) {
        if (param0) {
            return -93;
        }
        ((kj) this).field_p = ((kj) this).field_p + 1;
        return 255 & ((kj) this).field_t[((kj) this).field_p] - ((kj) this).field_A.c(-102);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 0;
        field_x = "Game Over";
        field_D = new int[]{107, 30, 33, 32, 26, -1, -1, -1, -1, -1};
        field_G = "Highscores";
        field_C = "This password is part of your Player Name, and would be easy to guess";
        field_y = "Sound: ";
        field_E = "Connection timed out. Please try using a different server.";
    }
}
