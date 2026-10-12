/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vs {
    static String field_d;
    static boolean field_j;
    static String highlightedConsoleInput;
    static int field_a;
    static String field_i;
    static int field_f;
    static ClientUiComponent field_g;
    static MapTile[] field_e;
    static String field_h;
    static String field_b;

    final static void showQuickChatMenu(int obfuscationGuard, QuickChatMenu menu) {
        if (menu == null) {
          return;
        }
        try {
          qd.activeQuickChatMenu = menu;
          OwnerChangeEvent.quickChatMenuHost.children.clear(75);
          OwnerChangeEvent.quickChatMenuHost.addChild(qd.activeQuickChatMenu, 105);
          if (obfuscationGuard != 256) {
            field_j = true;
          }
          BattleTutorial.quickChatMenuVisible = true;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "vs.B(" + obfuscationGuard + ',' + (menu != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        if (param0 < -50) {
          field_g = null;
          field_h = null;
          highlightedConsoleInput = null;
          field_i = null;
          return;
        }
    }

    static {
        field_d = "Macroing or use of bots";
        field_h = "<%0> Mana";
        field_i = "all 6 devotee Achievements.";
        field_b = "Enemies";
        field_f = 256;
    }
}
