/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScoreMultiplierTable {
    static int[] multipliers;
    static IntrusiveDeque field_b;
    static String playerNameText;
    private static String field_z;

    public static void releaseStatics(boolean param0) {
        playerNameText = null;
        multipliers = null;
        field_b = null;
        if (!param0) {
          multipliers = (int[]) null;
        }
    }

    static {
        field_z = "un.A(";
        multipliers = new int[]{1, 2, 3, 4, 5, 6};
        playerNameText = "Player Name: ";
    }
}
