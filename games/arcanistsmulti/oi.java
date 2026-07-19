/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static String field_b;
    static String field_a;

    public static void a(int param0) {
        int var1 = 49 % ((31 - param0) / 61);
        field_b = null;
        field_a = null;
    }

    final static int b(int param0) {
        int var1 = 55 % ((-41 - param0) / 59);
        return 1;
    }

    static {
        field_a = "You cannot use this spell as a lich";
        field_b = "There are two more targets to destroy. Use different angles and velocities to get them both.";
    }
}
