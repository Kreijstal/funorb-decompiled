/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementMaskRequest extends IntrusiveNode {
    int[] achievementMask;
    static NodeDeque delayedPackets;
    boolean complete;
    static UiComponent field_n;
    static GameUiLifecycle uiLifecycle;
    static String field_l;

    public static void clearSharedReferences(int obfuscationGuard) {
        uiLifecycle = null;
        field_n = null;
        field_l = null;
        if (obfuscationGuard != 28391) {
          return;
        }
        delayedPackets = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 99 % ((param4 - 70) / 44);
        DialogMessagePanel.a(4227327, param5, param6, (byte) 99, param0, param3, param2, param1);
    }

    final static void drawHorizontallyCenteredSprite(int spriteIndex, int y) {
        TableQuickChatHelpers.field_c[spriteIndex].drawTransparent((640 - TableQuickChatHelpers.field_c[spriteIndex].canvasWidth) / 2, y);
    }

    AchievementMaskRequest() {
        this.complete = false;
    }

    static {
        field_l = "Add <%0> to friend list";
    }
}
