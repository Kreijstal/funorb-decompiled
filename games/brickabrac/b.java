/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static RgbSprite[] spaceLeverSprites;
    static int field_a;
    static int field_c;

    final static void a(int param0, java.awt.Component param1) {
        param1.removeMouseListener(PowerUpWarning.mouseInput);
        param1.removeMouseMotionListener(PowerUpWarning.mouseInput);
        if (param0 != 20616) {
          return;
        }
        try {
          param1.removeFocusListener(PowerUpWarning.mouseInput);
          QuickChatHelpDialog.liveHeldButton = 0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "b.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
