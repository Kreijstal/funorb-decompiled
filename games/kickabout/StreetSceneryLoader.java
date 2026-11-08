/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StreetSceneryLoader extends IntrusiveNode {
    static boolean field_k;
    static HoverTooltip field_m;
    static Sprite field_j;
    static UiLayoutNode field_f;
    static QuickChatCommandType field_l;
    static int field_g;
    static String field_e;
    static int field_i;
    static String field_h;

    final static void enqueuePromotionDialog(boolean param0, int param1) {
        ScrollPane.field_Jb.addLast(new PromotionDialog(param1), 3);
        if (!param0) {
          StreetSceneryLoader.loadStreetScenery(-78);
        }
    }

    final static int loadStreetScenery(int param0) {
        if (ArchiveReconnectSupport.field_b) {
          return -1;
        }
        if (param0 > -121) {
          StreetSceneryLoader.enqueuePromotionDialog(true, -119);
          if (QuickChatKeysHelpPanel.field_Cb.ensurePackedGroupByName(false, "street")) {
            ArchiveReconnectSupport.field_b = true;
            PlatformTaskState.field_b = ServerTextTemplate.a("cars", "street", 2, QuickChatKeysHelpPanel.field_Cb);
            AppletContextSupport.field_d = ServerTextTemplate.a("signs", "street", 2, QuickChatKeysHelpPanel.field_Cb);
            PacketBuffer.field_h = ServerTextTemplate.a("cracks", "street", 2, QuickChatKeysHelpPanel.field_Cb);
            return -1;
          }
          return QuickChatKeysHelpPanel.field_Cb.getGroupProgressByName("street", -16248);
        }
        if (QuickChatKeysHelpPanel.field_Cb.ensurePackedGroupByName(false, "street")) {
          ArchiveReconnectSupport.field_b = true;
          PlatformTaskState.field_b = ServerTextTemplate.a("cars", "street", 2, QuickChatKeysHelpPanel.field_Cb);
          AppletContextSupport.field_d = ServerTextTemplate.a("signs", "street", 2, QuickChatKeysHelpPanel.field_Cb);
          PacketBuffer.field_h = ServerTextTemplate.a("cracks", "street", 2, QuickChatKeysHelpPanel.field_Cb);
          return -1;
        }
        return QuickChatKeysHelpPanel.field_Cb.getGroupProgressByName("street", -16248);
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        if (param0 > -28) {
          return;
        }
        field_e = null;
        field_l = null;
        field_h = null;
        field_m = null;
        field_j = null;
    }

    private StreetSceneryLoader() throws Throwable {
        throw new Error();
    }

    static {
        field_e = "Played";
        field_l = new QuickChatCommandType(15, 0, 1, 0);
        field_i = 0;
        field_h = "LINE-UP";
    }
}
