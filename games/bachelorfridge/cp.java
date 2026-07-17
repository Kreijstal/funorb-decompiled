/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp {
    static kf field_b;
    static int field_c;
    static String[] field_a;
    static int field_d;
    private static String field_z;

    public static void a() {
        field_a = null;
        int var1 = 2;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "cp.A(";
        field_b = new kf();
        field_a = new String[]{"Name", "Kills", "Damage Done", "Healing Done", "Flies Taken", "Pit Pushes", "Status Changes"};
    }
}
