/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BlankScreen extends GameScreen {
    static StateIconLabel field_k;
    static String field_j;
    static String field_h;
    static SecondaryHashTable friendIndex;

    BlankScreen() {
        super(-2);
    }

    final void drawScreen(byte obfuscationGuard) {
        Rasterizer2D.clear();
        if (obfuscationGuard > -14) {
          BlankScreen.a(-57);
        }
    }

    final void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard) {
        if (obfuscationGuard > -52) {
          this.advanceScreen(true, false, -69);
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_h = null;
        if (param0 != -2) {
          return;
        }
        friendIndex = null;
        field_j = null;
    }

    final static void appendQuickChatSubmenu(int obfuscationGuard, QuickChatMenu submenu) {
        try {
          if (obfuscationGuard != -2) {
            BlankScreen.d((byte) 104);
          }
          QuickChatPhraseDefinition.quickChatMenuRoot.addChild(submenu, 0);
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "of.C(" + obfuscationGuard + ',' + (submenu != null ? "{...}" : "null") + ')');
        }
    }

    final boolean handleKey(char character, int obfuscationGuard, int keyCode) {
        if (obfuscationGuard < 98) {
          field_j = (String) null;
          return false;
        }
        return false;
    }

    final static String d(byte param0) {
        if (param0 != 63) {
          return (String) null;
        }
        if (QuickChatParameterType.tooltipSuppressed) {
          return null;
        }
        if (MonotonicTime.field_e > ResourceArchiveFactory.tooltipTicks) {
          return null;
        }
        if (ResourceArchiveFactory.tooltipTicks < jh.field_a + MonotonicTime.field_e) {
          return LevelCompleteScreen.tooltipText;
        }
        return null;
    }

    static {
        field_h = "<%0> has declined the invitation.";
        field_j = "Player Name: ";
    }
}
