/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un {
    static int[] field_a;
    static IntrusiveDeque field_b;
    static String playerNameText;
    private static String field_z;

    public static void releaseStatics(boolean param0) {
        playerNameText = null;
        field_a = null;
        field_b = null;
        if (!param0) {
          field_a = (int[]) null;
        }
    }

    static {
        field_z = "un.A(";
        field_a = new int[]{1, 2, 3, 4, 5, 6};
        playerNameText = "Player Name: ";
    }
}
