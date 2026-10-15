/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MouseInputCleanup {
    static RgbSprite[] spaceLeverSprites;
    static int field_a;
    static int fullscreenDialogButtonLineHeight;

    final static void detachMouseInput(int obfuscationGuard, java.awt.Component component) {
        component.removeMouseListener(PowerUpWarning.mouseInput);
        component.removeMouseMotionListener(PowerUpWarning.mouseInput);
        if (obfuscationGuard != 20616) {
          return;
        }
        try {
          component.removeFocusListener(PowerUpWarning.mouseInput);
          QuickChatHelpDialog.liveHeldButton = 0;
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "b.A(" + obfuscationGuard + ',' + (component != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        spaceLeverSprites = null;
        if (!param0) {
          field_a = 50;
        }
    }

    static {
        field_a = -1;
    }
}
