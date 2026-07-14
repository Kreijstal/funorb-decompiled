/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends ec {
    static cn field_w;
    private ff field_v;
    static int field_s;
    private int field_t;
    static String field_x;
    static wh field_u;

    final void d(byte param0, int param1) {
        ((wj) this).field_o = ((wj) this).field_o + 1;
        ((wj) this).field_m[((wj) this).field_o] = (byte)(param1 + ((wj) this).field_v.a(26979));
        if (param0 > -76) {
            ((wj) this).field_t = 30;
        }
    }

    final void a(int[] param0, byte param1) {
        int var3 = -58 % ((-42 - param1) / 36);
        ((wj) this).field_v = new ff(param0);
    }

    final int m(int param0) {
        if (param0 != 255) {
            return -17;
        }
        ((wj) this).field_o = ((wj) this).field_o + 1;
        return 255 & ((wj) this).field_m[((wj) this).field_o] + -((wj) this).field_v.a(26979);
    }

    final int j(int param0, int param1) {
        int var7 = DungeonAssault.field_K;
        int var3 = ((wj) this).field_t >> -109196349;
        int var4 = -(7 & ((wj) this).field_t) + 8;
        int var5 = 0;
        ((wj) this).field_t = ((wj) this).field_t + param1;
        int var6 = -50 % ((param0 - 15) / 58);
        while (param1 > var4) {
            var3++;
            var5 = var5 + ((((wj) this).field_m[var3] & ba.field_b[var4]) << -var4 + param1);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (var4 == param1) {
            var5 = var5 + (((wj) this).field_m[var3] & ba.field_b[var4]);
        } else {
            var5 = var5 + (((wj) this).field_m[var3] >> -param1 + var4 & ba.field_b[param1]);
        }
        return var5;
    }

    final void f(byte param0) {
        ((wj) this).field_o = (((wj) this).field_t + 7) / 8;
        if (param0 <= 19) {
            ((wj) this).f((byte) -32);
        }
    }

    wj(int param0) {
        super(param0);
    }

    wj(byte[] param0) {
        super(param0);
    }

    final void a(int param0, byte param1, int param2, byte[] param3) {
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        for (var5 = 0; var5 < param2; var5++) {
            ((wj) this).field_o = ((wj) this).field_o + 1;
            param3[var5 - -param0] = (byte)(((wj) this).field_m[((wj) this).field_o] + -((wj) this).field_v.a(26979));
        }
        if (param1 != 95) {
            ((wj) this).e(true);
        }
    }

    public static void n(int param0) {
        field_u = null;
        field_w = null;
        field_x = null;
        if (param0 != 7) {
            field_s = -114;
        }
    }

    final void e(boolean param0) {
        if (param0) {
            return;
        }
        ((wj) this).field_t = 8 * ((wj) this).field_o;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "The changes you have made to your dungeon have not yet been saved. Would you like them to be saved now?";
    }
}
