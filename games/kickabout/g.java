/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static hd field_a;
    static int[] field_b;

    final static void b(boolean param0) {
        int var1 = 0;
        int var2 = Kickabout.field_G;
        m.field_d = new int[16];
        if (param0) {
            return;
        }
        for (var1 = 0; var1 < m.field_d.length; var1++) {
            m.field_d[var1] = (var1 << -923243614) * 65793;
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[5];
        field_b[0] = 286720;
        field_b[3] = 163840;
        field_b[4] = 327680;
        field_b[2] = 163840;
        field_b[1] = 163840;
    }
}
