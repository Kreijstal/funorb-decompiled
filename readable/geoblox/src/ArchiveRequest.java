/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveRequest extends DualLinkNode {
    static IntrusiveDeque pendingActionMarkers;
    volatile boolean pending;
    boolean priority;
    static String createAgeTooltipText;
    static int uiFontArchiveId;
    static long[] renderTimeHistoryMillis;
    static String fullscreenAcceptButtonText;
    boolean seenByCleanup;
    static int[] sessionPacketLengthByOpcode;
    static float loadingScaledProgress;

    final static void drawAwtLoadingProgress(int progressPercent, java.awt.Color progressColor, boolean clearCanvas, boolean returnAfterProgressImageFill, String statusText) {
        Exception repaintFallbackFailure = null;
        RuntimeException drawFailureForContext = null;
        java.awt.Graphics canvasGraphics = null;
        java.awt.Graphics progressImageGraphics = null;
        RuntimeException drawFailureBeforeDescription = null;
        StringBuilder drawMessagePrefix = null;
        String colorDescription = null;
        StringBuilder messageBeforeStatus = null;
        String statusDescription = null;
        Throwable caughtDrawThrowable = null;
        Exception progressImageFailure = null;
        int progressLeft = 0;
        int progressTop = 0;
        try {
          try {
            canvasGraphics = MessageDialog.gameCanvas.getGraphics();
            if (null == UiFontResources.awtLoadingFont) {
              UiFontResources.awtLoadingFont = new java.awt.Font("Helvetica", 1, 13);
            }
            if (clearCanvas) {
              canvasGraphics.setColor(java.awt.Color.black);
              canvasGraphics.fillRect(0, 0, AudioService.canvasWidth, ClientRenderingState.canvasHeight);
            }
            if (progressColor == null) {
              progressColor = new java.awt.Color(140, 17, 17);
            }
            try {
              if (null == TextWidgetRenderer.loadingProgressImage) {
                TextWidgetRenderer.loadingProgressImage = MessageDialog.gameCanvas.createImage(304, 34);
              }
              progressImageGraphics = TextWidgetRenderer.loadingProgressImage.getGraphics();
              progressImageGraphics.setColor(progressColor);
              progressImageGraphics.drawRect(0, 0, 303, 33);
              progressImageGraphics.fillRect(2, 2, 3 * progressPercent, 30);
              progressImageGraphics.setColor(java.awt.Color.black);
              if (returnAfterProgressImageFill) {
                return;
              }
              progressImageGraphics.drawRect(1, 1, 301, 31);
              progressImageGraphics.fillRect(3 * progressPercent + 2, 2, 300 - 3 * progressPercent, 30);
              progressImageGraphics.setFont(UiFontResources.awtLoadingFont);
              progressImageGraphics.setColor(java.awt.Color.white);
              progressImageGraphics.drawString(statusText, (-(6 * statusText.length()) + 304) / 2, 22);
              canvasGraphics.drawImage(TextWidgetRenderer.loadingProgressImage, AudioService.canvasWidth / 2 - 152, ClientRenderingState.canvasHeight / 2 - 18, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception imageDrawException) {
              caughtDrawThrowable = imageDrawException;
              progressImageFailure = (Exception) (Object) caughtDrawThrowable;
              progressLeft = AudioService.canvasWidth / 2 - 152;
              progressTop = ClientRenderingState.canvasHeight / 2 - 18;
              canvasGraphics.setColor(progressColor);
              canvasGraphics.drawRect(progressLeft, progressTop, 303, 33);
              canvasGraphics.fillRect(progressLeft + 2, 2 + progressTop, 3 * progressPercent, 30);
              canvasGraphics.setColor(java.awt.Color.black);
              canvasGraphics.drawRect(1 + progressLeft, 1 + progressTop, 301, 31);
              canvasGraphics.fillRect(progressPercent * 3 + (2 + progressLeft), 2 + progressTop, -(progressPercent * 3) + 300, 30);
              canvasGraphics.setFont(UiFontResources.awtLoadingFont);
              canvasGraphics.setColor(java.awt.Color.white);
              canvasGraphics.drawString(statusText, (-(6 * statusText.length()) + 304) / 2 + progressLeft, 22 + progressTop);
            }
            if (SpriteState.loadingOverlayText == null) {
              return;
            }
            canvasGraphics.setFont(UiFontResources.awtLoadingFont);
            canvasGraphics.setColor(java.awt.Color.white);
            canvasGraphics.drawString(SpriteState.loadingOverlayText, AudioService.canvasWidth / 2 - 6 * SpriteState.loadingOverlayText.length() / 2, -26 + ClientRenderingState.canvasHeight / 2);
            return;
          } catch (java.lang.Exception canvasDrawException) {
            caughtDrawThrowable = canvasDrawException;
            repaintFallbackFailure = (Exception) (Object) caughtDrawThrowable;
            MessageDialog.gameCanvas.repaint();
            return;
          }
        } catch (java.lang.RuntimeException drawFailure) {
          caughtDrawThrowable = drawFailure;
          drawFailureForContext = (RuntimeException) (Object) caughtDrawThrowable;
          drawFailureBeforeDescription = drawFailureForContext;
          drawMessagePrefix = new StringBuilder().append("pb.B(").append(progressPercent).append(',');
          if (progressColor == null) {
            colorDescription = "null";
          } else {
            colorDescription = "{...}";
          }
          messageBeforeStatus = ((StringBuilder) (Object) drawMessagePrefix).append(colorDescription).append(',').append(clearCanvas).append(',').append(returnAfterProgressImageFill).append(',');
          if (statusText == null) {
            statusDescription = "null";
          } else {
            statusDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) drawFailureBeforeDescription), ((StringBuilder) (Object) messageBeforeStatus).append(statusDescription).append(')').toString());
        }
    }

    abstract byte[] getBytes(int methodGuard);

    public static void releaseStaticReferences(int methodGuard) {
        createAgeTooltipText = null;
        pendingActionMarkers = null;
        renderTimeHistoryMillis = null;
        sessionPacketLengthByOpcode = null;
        fullscreenAcceptButtonText = null;
        if (methodGuard != 31735) {
            String unusedNullTextSnapshot = (String) null;
            ArchiveRequest.drawAwtLoadingProgress(68, (java.awt.Color) null, true, true, (String) null);
        }
    }

    abstract int getProgress(int methodGuard);

    ArchiveRequest() {
        this.pending = true;
    }

    static {
        pendingActionMarkers = new IntrusiveDeque();
        createAgeTooltipText = "Type your age in years";
        sessionPacketLengthByOpcode = new int[256];
        fullscreenAcceptButtonText = "Accept";
        renderTimeHistoryMillis = new long[32];
    }
}
