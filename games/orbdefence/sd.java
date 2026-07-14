/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static im field_a;
    static hj[] field_f;
    static int field_h;
    static String field_d;
    static int field_g;
    static volatile int field_c;
    static l field_b;
    static int[] field_e;

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        if (!(!param1)) {
            var4 += 4;
        }
        if (param2) {
            var4 += 2;
        }
        if (param3 != 30775) {
            String discarded$0 = sd.a(false, false, false, -6);
        }
        if (!(!param0)) {
            var4++;
        }
        return s.field_E[var4];
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        field_b = null;
        if (param0 != -30) {
            field_c = 11;
        }
        field_f = null;
        field_d = null;
    }

    final static void a(int param0) {
        mb.field_a = gd.a(0);
        bm.field_d = new sk();
        int var1 = 113 / ((param0 - 25) / 55);
        wj.a(-118, true, true);
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var5 = 0;
        int var6 = OrbDefence.field_D ? 1 : 0;
        if (param3 != 0) {
            return 4;
        }
        int var4 = -1;
        for (var5 = param0; var5 < param2; var5++) {
            var4 = var4 >>> -297926712 ^ vi.field_O[255 & (var4 ^ param1[var5])];
        }
        var4 = var4 ^ -1;
        return var4;
    }

    final static void a(boolean param0, int param1) {
        bd.field_u.a(param0, (byte) -89);
        if (param1 <= 15) {
            sd.a((byte) 74);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new im();
        field_d = "Damage";
        field_g = 0;
        field_e = new int[8192];
        field_c = 0;
    }
}
