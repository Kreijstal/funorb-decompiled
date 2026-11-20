/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameInvitationText {
    static int field_c;
    static String invitingPlayerText;
    static String[] field_a;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        field_a = null;
        if (param0 != 26986) {
          return;
        }
        invitingPlayerText = null;
    }

    static {
        field_z = "gob.A(";
        invitingPlayerText = "Inviting <%0>";
    }
}
