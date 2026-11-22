/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenFocusCanvas extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean focusLost;
    java.awt.Frame fullscreenFrame;
    static am field_c;
    static int field_b;
    static db field_a;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.focusLost = true;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "dd.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        int var1 = -12 % ((-67 - param0) / 42);
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void exitFullscreen(un param0, byte param1) {
        try {
          if (param1 != -92) {
            java.awt.Graphics var4 = (java.awt.Graphics) null;
            this.paint((java.awt.Graphics) null);
          }
          bo.exitFullscreenFrame(param0, this.fullscreenFrame, param1 + 93);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "dd.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void update(java.awt.Graphics param0) {
    }

    FullscreenFocusCanvas() {
    }

    static {
    }
}
