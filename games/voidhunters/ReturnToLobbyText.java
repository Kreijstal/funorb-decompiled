/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReturnToLobbyText {
    static int field_a;
    static String returnToLobbyText;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        returnToLobbyText = null;
        if (param0 < 68) {
          field_a = 120;
        }
    }

    static {
        field_z = "tua.A(";
        field_a = 4;
        returnToLobbyText = "Return to lobby";
    }
}
