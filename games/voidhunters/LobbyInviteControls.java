/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyInviteControls {
    static Widget inviteButton;
    private static String field_z;

    public static void clearSharedReferences(byte param0) {
        inviteButton = null;
        if (param0 != 55) {
          inviteButton = (Widget) null;
        }
    }

    static {
        field_z = "vw.A(";
    }
}
