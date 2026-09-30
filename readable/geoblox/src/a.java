/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static int[] field_c;
    static tf field_d;
    static String[] field_a;
    static int field_e;
    static String field_b;
    private static String field_z;

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 > -63) {
            a.a((byte) 92);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        field_z = "a.A(";
        field_c = new int[8192];
        field_a = new String[]{"Welcome to Geoblox!", "The controls", "How to play", "Bonuses", "Special geoblox", "Special geoblox cont."};
        field_e = -1;
        field_b = "Retry";
        field_d = new tf();
    }
}
