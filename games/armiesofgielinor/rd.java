/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends java.awt.Canvas implements java.awt.event.FocusListener {
    static String field_a;
    volatile boolean field_k;
    static int keyEventFrameEndIndex;
    static int field_b;
    static String field_g;
    static String field_h;
    static String field_f;
    static ClientUiComponent field_e;
    java.awt.Frame field_c;
    static GameplayController gameplayController;
    static long tickDurationNanos;

    public static void a(int param0) {
        field_g = null;
        field_a = null;
        field_f = null;
        gameplayController = null;
        field_h = null;
        field_e = null;
        if (param0 != 20000000) {
          field_e = (ClientUiComponent) null;
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.field_k = true;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "rd.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void clearChatText(int obfuscationGuard) {
        if (obfuscationGuard != 8445) {
          rd.clearChatText(33);
          UpkeepEvent.chatTextBuffer.setLength(0);
          rs.outgoingChatChannel = 0;
          return;
        }
        UpkeepEvent.chatTextBuffer.setLength(0);
        rs.outgoingChatChannel = 0;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final void a(int param0, PlatformTaskService param1) {
        try {
          fj.a(this.field_c, param1, param0 ^ 30916);
          if (param0 != -30918) {
            field_f = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "rd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    rd() {
    }

    static {
        field_h = "Orb points: ";
        keyEventFrameEndIndex = 0;
        field_f = "The game options are not all set.";
        field_a = "Spells to impose your will upon the world.";
        tickDurationNanos = 20000000L;
        field_g = "Updates will sent to the email address you've given";
    }
}
