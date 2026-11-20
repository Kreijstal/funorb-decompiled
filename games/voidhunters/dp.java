/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp {
    static GameStateFactory field_b;
    static Widget field_a;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        field_a = null;
        int var1 = 47 % ((-65 - param0) / 45);
        field_b = null;
    }

    static {
        field_z = "dp.A(";
        field_b = (GameStateFactory) ((Object) new PartitionZoneFactory());
    }
}
