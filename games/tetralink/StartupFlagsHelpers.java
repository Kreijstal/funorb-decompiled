/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StartupFlagsHelpers {
    static QuickChatCommandType field_d;
    int field_f;
    int field_j;
    int field_e;
    static PcmSample field_c;
    int field_b;
    static StringBuilder field_h;
    static int field_i;
    static int[] field_g;
    static int field_a;

    final static void pollStartupFlagsRequest(int param0) {
        if (Bzip2State.field_n) {
          return;
        }
        if (ChatPanelSlideHelpers.field_e == null) {
          ChatPanelSlideHelpers.field_e = StatusRequestHelpers.queueStatusRequest(4, (byte) -74);
        }
        if (ChatPanelSlideHelpers.field_e.field_s) {
          QuickChatCategoryCache.field_a = QuickChatCategoryCache.field_a | ChatPanelSlideHelpers.field_e.field_t;
          ChatPanelSlideHelpers.field_e = null;
          Bzip2State.field_n = true;
        }
        if (param0 != 4) {
          field_g = (int[]) null;
        }
        if (Bzip2State.field_n) {
          Js5ArchiveManager.closeUiLayers((byte) 116);
          QuickChatCategoryCache.registerScreens((byte) -119);
        }
    }

    public static void releaseStatics(boolean param0) {
        if (param0) {
          return;
        }
        field_h = null;
        field_c = null;
        field_d = null;
        field_g = null;
    }

    static {
        field_d = new QuickChatCommandType(11, 0, 1, 2);
        field_h = new StringBuilder(80);
    }
}
