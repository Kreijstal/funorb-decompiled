/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenCanvas extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean focusLost;
    java.awt.Frame frame;
    static String[] field_d;
    static String field_c;

    public final void update(java.awt.Graphics param0) {
    }

    final void exitFullscreen(PlatformService param0, int param1) {
        try {
          if (param1 != -32335) {
            FullscreenCanvas.clearSharedReferences(false);
          }
          GetWorldWidthUpshift.exitFullscreenBlocking(this.frame, param0, (byte) 126);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ufb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
          this.focusLost = true;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ufb.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    FullscreenCanvas() {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public static void clearSharedReferences(boolean param0) {
        if (param0) {
          return;
        }
        field_d = null;
        field_c = null;
    }

    static {
        field_d = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_c = "Wasp chassis";
    }
}
