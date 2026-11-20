/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyInviteSuggestionText {
    static String inviteMorePlayersText;
    static int field_b;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        if (param0 != 6947) {
          inviteMorePlayersText = (String) null;
          inviteMorePlayersText = null;
          return;
        }
        inviteMorePlayersText = null;
    }

    static {
        field_z = "alb.A(";
        inviteMorePlayersText = "Invite more players, or alternatively try changing the following settings:  ";
    }
}
