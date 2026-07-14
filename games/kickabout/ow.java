/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ow {
    static String[] field_f;
    static String[] field_d;
    static int[] field_c;
    static String field_e;
    static qb field_b;
    static String field_a;

    abstract int a(int param0, int param1);

    abstract kl a(int param0);

    abstract byte[] b(int param0, int param1);

    final static ut a(sj param0, int param1, byte param2, int param3) {
        if (!cu.a(param3, param0, param1, 101)) {
            return null;
        }
        if (param2 <= 4) {
            return null;
        }
        return oc.c((byte) 75);
    }

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
            return;
        }
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_c = new int[]{2, 4, 6, 8, 16};
        field_a = "live feed";
    }
}
