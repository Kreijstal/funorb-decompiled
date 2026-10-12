/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bt {
    static String[] quickChatShortcutLabels;
    static int field_f;
    static String field_b;
    static int field_g;
    static String field_a;
    static ResourceArchive field_e;
    static String field_d;

    final static void b(int param0) {
        if (param0 == 0) {
          wb.a(true, (byte) 32, cd.field_e, qk.field_b);
          se.field_f = true;
          return;
        }
        bt.c(83);
        wb.a(true, (byte) 32, cd.field_e, qk.field_b);
        se.field_f = true;
    }

    public static void c(int param0) {
        quickChatShortcutLabels = null;
        field_e = null;
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 != 0) {
          bt.b(3);
        }
    }

    final static void a(int param0) {
        MoveEvent.matchSetupPanel = new MatchSetupPanel();
        MoveEvent.matchSetupPanel.initializePanel(1);
        IntPair var1 = MoveEvent.matchSetupPanel.getPanelStart((byte) -72);
        if (var1 == null) {
          return;
        }
        IntPair var2 = MoveEvent.matchSetupPanel.getPanelEnd((byte) 94);
        if (var2 == null) {
          return;
        }
        int var3 = 9 % ((param0 + 41) / 55);
        int var4 = MoveEvent.matchSetupPanel.getPreviewRowHeight(-10754);
        if (var4 < 0) {
          return;
        }
        if (null == MoveEvent.matchSetupPanel.itemIds) {
          return;
        }
        if (MoveEvent.matchSetupPanel.itemIds.length != 0) {
          EquipmentBattleTutorial.configureTutorialStage(var4, 5, var1.first, var2.first, var1.second, var2.second, MoveEvent.matchSetupPanel.itemIds, -52);
          return;
        }
    }

    static {
        quickChatShortcutLabels = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_b = "<%0> rune";
        field_a = "You need to play 1 more rated game to unlock this option.";
        field_d = "MP";
    }
}
