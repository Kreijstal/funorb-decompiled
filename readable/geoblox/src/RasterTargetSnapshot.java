/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RasterTargetSnapshot extends IntrusiveNode {
    static String previousText;
    int framebufferHeight;
    static long[] updateTimeHistoryMillis;
    static Sprite[] introFaceFrames;
    static String[] menuActionTexts;
    int[] pixels;
    int clipBottom;
    static int pendingActionPanelHeight;
    int clipLeft;
    static GameplayEntity[] entitiesById;
    int clipTop;
    int clipRight;
    int stride;

    final static void navigateToSupportPage(java.applet.Applet applet, byte methodGuard) {
        try {
            java.net.URL supportUrl = null;
            Exception printedNavigationFailure = null;
            RuntimeException navigationFailureForContext = null;
            RuntimeException navigationFailureBeforeDescription = null;
            StringBuilder navigationMessagePrefix = null;
            String appletDescription = null;
            Throwable caughtNavigationThrowable = null;
            try {
              if (methodGuard != -91) {
                return;
              }
              try {
                supportUrl = new java.net.URL(applet.getCodeBase(), "tosupport.ws");
                applet.getAppletContext().showDocument(SessionGameApplet.applySessionOverridesToUrl(supportUrl, 68, applet), "_top");
                return;
              } catch (java.lang.Exception navigationException) {
                caughtNavigationThrowable = navigationException;
                printedNavigationFailure = (Exception) (Object) caughtNavigationThrowable;
                printedNavigationFailure.printStackTrace();
                return;
              }
            } catch (java.lang.RuntimeException navigationFailure) {
              caughtNavigationThrowable = navigationFailure;
              navigationFailureForContext = (RuntimeException) (Object) caughtNavigationThrowable;
              navigationFailureBeforeDescription = navigationFailureForContext;
              navigationMessagePrefix = new StringBuilder().append("tl.A(");
              if (applet == null) {
                appletDescription = "null";
              } else {
                appletDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) navigationFailureBeforeDescription), ((StringBuilder) (Object) navigationMessagePrefix).append(appletDescription).append(',').append(methodGuard).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedBoundaryFailure) {
            throw uncheckedBoundaryFailure;
        } catch (Throwable checkedBoundaryFailure) {
            throw new RuntimeException(checkedBoundaryFailure);
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard == 6491) {
            previousText = null;
            entitiesById = null;
            updateTimeHistoryMillis = null;
            menuActionTexts = null;
            introFaceFrames = null;
            return;
        }
        RasterTargetSnapshot.releaseStaticReferences(-67);
        previousText = null;
        entitiesById = null;
        updateTimeHistoryMillis = null;
        menuActionTexts = null;
        introFaceFrames = null;
    }

    RasterTargetSnapshot() {
    }

    final void capture(int clipLeft, int clipRight, int clipBottom, int stride, int framebufferHeight, int clipTop, int[] pixels, boolean methodGuard) {
        try {
            this.clipTop = clipTop;
            this.clipLeft = clipLeft;
            this.pixels = pixels;
            this.clipBottom = clipBottom;
            this.clipRight = clipRight;
            if (!methodGuard) {
                RasterTargetSnapshot.releaseStaticReferences(-125);
            }
            this.framebufferHeight = framebufferHeight;
            this.stride = stride;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "tl.C(" + clipLeft + ',' + clipRight + ',' + clipBottom + ',' + stride + ',' + framebufferHeight + ',' + clipTop + ',' + (pixels != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    static {
        previousText = "Prev";
        updateTimeHistoryMillis = new long[32];
        entitiesById = new GameplayEntity[1000];
    }
}
