/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenFocusCanvas extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean focusLost;
    static gk field_a;
    static String field_b;
    java.awt.Frame fullscreenFrame;
    static lg field_c;
    static boolean field_d;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.focusLost = true;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "jb.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    final void exitFullscreen(byte param0, PlatformTaskDispatcher param1) {
        try {
          ImageProducerRasterBuffer.exitFullscreenFrame(param1, this.fullscreenFrame, (byte) 110);
          if (param0 >= -106) {
            FullscreenFocusCanvas.clearStaticReferences(true);
          }
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "jb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public static void clearStaticReferences(boolean param0) {
        if (param0) {
          return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    FullscreenFocusCanvas() {
    }

    final static int a(int param0) {
        if (param0 != 31083) {
          field_c = (lg) null;
          return ak.field_y;
        }
        return ak.field_y;
    }

    static {
        field_b = "Type your age in years";
        field_c = new lg();
        field_d = false;
    }
}
