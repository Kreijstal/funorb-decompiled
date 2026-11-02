/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UpgradeStatNames {
    static String[] names;
    private static String field_z;

    public static void a(int param0) {
        if (param0 != 1600) {
          UpgradeStatNames.a(88);
          names = null;
          return;
        }
        names = null;
    }

    static {
        field_z = "ee.A(";
        names = new String[]{"Speed", "Traction", "Bounce", "Spikes", "Armour"};
        mr.a(1600, (byte) -115);
    }
}
