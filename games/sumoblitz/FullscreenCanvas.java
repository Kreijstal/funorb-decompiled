/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenCanvas extends java.awt.Canvas implements java.awt.event.FocusListener {
    static String backText;
    java.awt.Frame field_b;
    volatile boolean field_a;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.field_a = true;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cq.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          backText = (String) null;
          backText = null;
          return;
        }
        backText = null;
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final static ArenaPad createArenaPad(int orientation, int xPixels, int yPixels, int padType, byte guard) {
        if (guard != -113) {
          return (ArenaPad) null;
        }
        return new ArenaPad(padType, xPixels, yPixels, orientation);
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void exitFullscreen(boolean visibleBeforeDispose, PlatformTaskDispatcher dispatcher) {
        try {
          OpenGlTransparentWaterEffect.exitFullscreen(this.field_b, dispatcher, visibleBeforeDispose);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cq.C(" + visibleBeforeDispose + ',' + (dispatcher != null ? "{...}" : "null") + ')');
        }
    }

    FullscreenCanvas() {
    }

    static {
        backText = "Back";
    }
}
