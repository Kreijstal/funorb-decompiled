/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CanvasInputBindings {
    final static void attachInputHandlers(java.awt.Canvas param0, byte param1) {
        SelectableAchievementIcon.attachKeyboardInput((java.awt.Component) ((Object) param0), -125);
        if (param1 != -64) {
          return;
        }
        try {
          ModalStack.attachMouseInput(15282, (java.awt.Component) ((Object) param0));
          if (SoundStreamHandle.field_f != null) {
            SoundStreamHandle.field_f.attach((byte) -83, (java.awt.Component) ((Object) param0));
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "lp.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
