/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IncomingChatState {
    static int field_b;
    static int channelType;
    static String[] field_c;
    private static String field_z;

    public static void clearSharedReferences(boolean param0) {
        if (param0) {
          IncomingChatState.clearSharedReferences(false);
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_z = "wja.A(";
        field_b = 32768;
    }
}
