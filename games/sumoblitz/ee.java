/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    static String[] field_a;
    private static String field_z;

    public static void a(int param0) {
        if (param0 != 1600) {
            ee.a(88);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "ee.A(";
        field_a = new String[]{"Speed", "Traction", "Bounce", "Spikes", "Armour"};
        int discarded$0 = mr.a(1600, (byte) -115);
    }
}
