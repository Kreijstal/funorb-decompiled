/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenFocusCanvas extends java.awt.Canvas implements java.awt.event.FocusListener {
    java.awt.Frame field_d;
    volatile boolean field_c;
    static String field_g;
    static boolean field_a;
    static String field_e;
    static String field_f;
    static int field_b;

    public final void update(java.awt.Graphics param0) {
    }

    final static void pushRasterAndIntersectClip(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 == -79) {
          ReflectionCheck.pushRasterState((byte) 75);
          SoftwareRasterizer.intersectClip(param4, param2, param0, param1);
          return;
        }
        FullscreenFocusCanvas.pushRasterAndIntersectClip(20, -54, 32, (byte) 91, -80);
        ReflectionCheck.pushRasterState((byte) 75);
        SoftwareRasterizer.intersectClip(param4, param2, param0, param1);
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final void exitFullscreen(byte param0, PlatformTaskDispatcher param1) {
        try {
          if (param0 <= 33) {
            java.awt.Graphics var4 = (java.awt.Graphics) null;
            this.paint((java.awt.Graphics) null);
          }
          MusicCrossfadeStream.exitFullscreenAndDisposeFrame(param1, this.field_d, 0);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "kl.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        if (param0 >= -87) {
          return;
        }
        field_f = null;
        field_g = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    FullscreenFocusCanvas() {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.field_c = true;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "kl.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Location";
        field_f = "Loading...";
        field_e = "Player Name: ";
    }
}
