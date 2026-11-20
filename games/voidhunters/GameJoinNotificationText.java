/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameJoinNotificationText {
    static String playerJoinedGameText;
    static String field_b;
    private static String field_z;

    public static void clearSharedReferences(boolean param0) {
        field_b = null;
        if (param0) {
          return;
        }
        playerJoinedGameText = null;
    }

    static {
        field_z = "dgb.A(";
        playerJoinedGameText = "<%0> has joined your game.";
    }
}
