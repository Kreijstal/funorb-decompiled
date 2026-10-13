/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BlankScreen extends GameScreen {
    static ni field_k;
    static String field_j;
    static String field_h;
    static SecondaryHashTable field_i;

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
        field_i = null;
        field_j = null;
    }

    final static void a(int param0, og param1) {
        try {
          if (param0 != -2) {
            BlankScreen.d((byte) 104);
          }
          wd.field_w.addChild(param1, 0);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "of.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        if (th.field_h) {
          return null;
        }
        if (MonotonicTime.field_e > go.field_e) {
          return null;
        }
        if (go.field_e < jh.field_a + MonotonicTime.field_e) {
          return LevelCompleteScreen.field_J;
        }
        return null;
    }

    static {
        field_h = "<%0> has declined the invitation.";
        field_j = "Player Name: ";
    }
}
