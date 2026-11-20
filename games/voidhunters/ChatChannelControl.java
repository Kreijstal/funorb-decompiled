/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatChannelControl {
    private static String field_z;

    final static void setChatChannel(int param0) {
        NetworkMessageState.chatChannel = param0;
        CommonGameState.selectDefaultQuickChatMenu(true);
    }

    static {
        field_z = "or.A(";
    }
}
