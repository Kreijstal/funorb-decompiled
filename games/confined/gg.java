/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends rk {
    static wi field_m;
    int field_o;
    static String[] field_p;
    static nf[] field_q;
    static od[] field_n;

    public static void b(int param0) {
        field_p = null;
        if (param0 <= 7) {
            return;
        }
        field_q = null;
        field_m = null;
        field_n = null;
    }

    private gg() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = null;
        field_p = new String[]{"bosses/sphere/sphere", "bosses/cube/cube", "bosses/bird/bird", "bosses/humanoid/humanoid"};
        field_n = new od[4];
    }
}
