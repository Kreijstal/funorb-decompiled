/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyOptionCompatibilityRules {
    static int[][] optionCombinations;
    static int field_b;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        optionCombinations = (int[][]) null;
        if (param0 != 500) {
          LobbyOptionCompatibilityRules.clearSharedReferences(-91);
        }
    }

    static {
        field_z = "ncb.A(";
        field_b = 500;
    }
}
