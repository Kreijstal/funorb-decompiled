/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatPermissions {
    static String field_a;
    static int field_b;

    final static boolean isFreeChatAllowed(int param0) {
        int var1 = -95 % ((65 - param0) / 43);
        return !ConsoleSettingsScript.quickChatOnly ? true : false;
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 != -53) {
          field_a = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_a = "This entry doesn't match";
    }
}
