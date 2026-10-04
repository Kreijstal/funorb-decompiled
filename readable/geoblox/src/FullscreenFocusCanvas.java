/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenFocusCanvas extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean focusLost;
    static int pointerPressYSnapshot;
    static java.awt.Frame standaloneFrameReference;
    java.awt.Frame fullscreenFrame;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.focusLost = true;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "he.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void exitFullscreen(int methodGuard, PlatformTaskDispatcher taskDispatcher) {
        try {
            FullscreenSupport.exitFullscreenAndDisposeFrame(this.fullscreenFrame, 10, taskDispatcher);
            if (methodGuard != 0) {
                standaloneFrameReference = (java.awt.Frame) null;
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "he.B(" + methodGuard + ',' + (taskDispatcher != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard != 0) {
            FullscreenFocusCanvas.releaseStaticReferences(-79);
            standaloneFrameReference = null;
            return;
        }
        standaloneFrameReference = null;
    }

    FullscreenFocusCanvas() {
    }

    public final void update(java.awt.Graphics param0) {
    }

    static {
        pointerPressYSnapshot = 0;
    }
}
