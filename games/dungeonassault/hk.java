/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    static String[] field_d;
    static int[] field_b;
    static int[] field_c;
    static long field_e;
    static String field_a;
    private static String field_z;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 >= -59) {
            return;
        }
        field_d = null;
        field_b = null;
    }

    static {
        field_z = "hk.A(";
        field_b = new int[128];
        field_c = new int[8192];
        field_d = new String[]{"Summon Zombie", "Summon zombie to scout the next room. (Single use)"};
        field_a = "Close";
        field_e = 20000000L;
    }
}
