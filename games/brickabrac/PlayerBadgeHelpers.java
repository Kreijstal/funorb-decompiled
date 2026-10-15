/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerBadgeHelpers {
    static String askToJoinGameText;
    static UiComponent field_f;
    static IndexedSprite[] field_e;
    static int[] decodedSpritePalette;
    static String gameFullText;
    static String friendsAndOpponentsPrivateChatText;

    public static void a(boolean param0) {
        decodedSpritePalette = null;
        gameFullText = null;
        askToJoinGameText = null;
        if (!param0) {
          field_f = null;
          friendsAndOpponentsPrivateChatText = null;
          field_e = null;
          return;
        }
        PlayerBadgeHelpers.selectPlayerBadgeKind(-100, -97, (byte) -12);
        field_f = null;
        friendsAndOpponentsPrivateChatText = null;
        field_e = null;
    }

    final static int selectPlayerBadgeKind(int privilegeByteOne, int privilegeByteTwo, byte obfuscationGuard) {
        if (obfuscationGuard != -22) {
          return -88;
        }
        if (privilegeByteOne >= 2) {
          return 2;
        }
        if (privilegeByteTwo < 5) {
          return 0;
        }
        return 1;
    }

    static {
        askToJoinGameText = "Ask to join <%0>'s game";
        gameFullText = "This game is full.";
        friendsAndOpponentsPrivateChatText = "Only show private chat from my friends and opponents";
    }
}
