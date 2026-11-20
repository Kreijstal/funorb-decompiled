/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oib {
    static String field_b;
    static Widget field_a;
    static int fontJustificationRemainder;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 <= 119) {
          return;
        }
        field_b = null;
    }

    abstract dka a(byte param0);

    abstract void a(PacketBuffer param0, int param1);

    static {
        field_z = "oib.D(";
        field_b = "Destroy the enemy's base before they destroy yours!";
        fontJustificationRemainder = 0;
    }
}
