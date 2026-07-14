/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bs {
    static bi field_a;
    static int field_b;
    static String field_c;

    public static void a(int param0) {
        if (param0 <= 35) {
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        wo.field_a = param2;
        if (param3 <= 22) {
            bs.a(true, (byte) -46);
        }
        em.field_j = param1;
        ih.field_b = param0;
    }

    final static void a(bi param0, int param1) {
        ra.a(-127);
        param0.e();
        if (param1 < 74) {
            field_b = -100;
        }
    }

    final static void a(boolean param0, byte param1) {
        if (param1 != 72) {
            field_c = null;
        }
        wh.field_a.a(param0, 88);
    }

    final static int a(int param0, byte[] param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var4 = -1;
        if (param2 >= -41) {
            return -36;
        }
        for (var5 = param3; var5 < param0; var5++) {
            var4 = var4 >>> 481221800 ^ vg.field_w[255 & (var4 ^ param1[var5])];
        }
        var4 = var4 ^ -1;
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Play the game without logging in just yet";
    }
}
