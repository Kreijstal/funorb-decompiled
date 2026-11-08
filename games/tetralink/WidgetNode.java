/*
 * Decompiled by CFR-JS 0.4.0.
 */
class WidgetNode extends DualLinkNode {
    static float field_x;
    static QuickChatCommandType field_t;
    static String field_u;
    static String field_v;
    static boolean[] field_w;

    final static boolean isAchievementUnlocked(int param0, int param1) {
        if (0 != (param0 << param1 & QuickChatCategoryCache.field_a)) {
          return true;
        }
        if (!PendingStatQuery.hasFeatureBit(FullscreenErrorDialog.field_gb[param1], (byte) 118)) {
          return false;
        }
        return true;
    }

    WidgetNode() {
    }

    public static void releaseStatics(byte param0) {
        field_w = null;
        if (param0 == -96) {
          field_t = null;
          field_u = null;
          field_v = null;
          return;
        }
        WidgetNode.releaseStatics((byte) 88);
        field_t = null;
        field_u = null;
        field_v = null;
    }

    static {
        field_u = "Invalid name";
        field_v = "Offensive account name";
        field_t = new QuickChatCommandType(13, 0, 1, 0);
    }
}
