/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatOpenHelpers {
    int field_b;
    static IntrusiveDeque field_a;
    static SpriteWidget field_c;
    static SpriteWidget field_d;

    final static void openPublicQuickChat(byte param0) {
        ChatFilterHelpers.field_e = 0;
        if (param0 <= 69) {
          QuickChatOpenHelpers.openPublicQuickChat((byte) -83);
          PatchNoteUsage.openRootQuickChatMenu(0);
          return;
        }
        PatchNoteUsage.openRootQuickChatMenu(0);
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 != 0) {
          QuickChatOpenHelpers.releaseStatics(-121);
        }
    }

    static {
        field_a = new IntrusiveDeque();
    }
}
