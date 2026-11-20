/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameInterfaceText {
    static String roundTemplate;
    static String returnToMainMenuText;
    static String quickChatShortcutText;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        roundTemplate = null;
        if (param0 != 9502) {
          return;
        }
        returnToMainMenuText = null;
        quickChatShortcutText = null;
    }

    static {
        field_z = "bw.A(";
        roundTemplate = "round <%0>";
        returnToMainMenuText = "Return to Main Menu";
        quickChatShortcutText = "Press F10 to open Quick Chat.";
    }
}
