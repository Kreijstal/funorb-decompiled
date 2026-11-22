/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenFocusCanvas extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame fullscreenFrame;
    static String field_d;
    volatile boolean focusLost;
    static int field_a;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.focusLost = true;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "oe.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final void exitFullscreen(byte param0, le param1) {
        try {
          rl.exitFullscreenFrame(false, param1, this.fullscreenFrame);
          if (param0 != -81) {
            this.focusLost = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "oe.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_d = null;
        int var1 = -93 % ((-9 - param0) / 60);
    }

    public final void update(java.awt.Graphics param0) {
    }

    FullscreenFocusCanvas() {
    }

    static {
    }
}
