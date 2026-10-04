/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FontLoadingSupport {
    static String fullscreenCancelButtonText;
    static boolean memberAccountMode;
    static int kindFourRemovalCount;
    static CanvasResizeController canvasResizeController;

    final static MonochromeBitmapFont loadMonochromeFontById(int fileId, int methodGuard, ResourceArchive glyphGraphicsArchive, int groupId, ResourceArchive fontMetricsArchive) {
        RuntimeException fontFailureForContext = null;
        MonochromeBitmapFont fontBeforeReturn = null;
        RuntimeException fontFailureBeforeArchiveDescriptions = null;
        StringBuilder fontMessagePrefix = null;
        String glyphArchiveDescription = null;
        StringBuilder fontMessageBeforeMetricsArchive = null;
        String metricsArchiveDescription = null;
        RuntimeException caughtFontFailure = null;
        try {
          if (methodGuard != 0) {
            FontLoadingSupport.clearFontLoadingResources((byte) -35);
          }
          if (!SpawnQuotaSupport.decodeSpritesFromArchive(fileId, groupId, 107, glyphGraphicsArchive)) {
            return null;
          }
          fontBeforeReturn = HighscoreNameEntry.buildMonochromeFontFromDecodedSprites(4520, fontMetricsArchive.getFile(groupId, -28153, fileId));
          return fontBeforeReturn;
        } catch (java.lang.RuntimeException fontFailure) {
          caughtFontFailure = fontFailure;
          fontFailureForContext = caughtFontFailure;
          fontFailureBeforeArchiveDescriptions = fontFailureForContext;
          fontMessagePrefix = new StringBuilder().append("rb.B(").append(fileId).append(',').append(methodGuard).append(',');
          if (glyphGraphicsArchive == null) {
            glyphArchiveDescription = "null";
          } else {
            glyphArchiveDescription = "{...}";
          }
          fontMessageBeforeMetricsArchive = ((StringBuilder) (Object) fontMessagePrefix).append(glyphArchiveDescription).append(',').append(groupId).append(',');
          if (fontMetricsArchive == null) {
            metricsArchiveDescription = "null";
          } else {
            metricsArchiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) fontFailureBeforeArchiveDescriptions), ((StringBuilder) (Object) fontMessageBeforeMetricsArchive).append(metricsArchiveDescription).append(')').toString());
        }
    }

    public static void clearFontLoadingResources(byte methodGuard) {
        canvasResizeController = null;
        fullscreenCancelButtonText = null;
        int guardResidue = -73 % ((-60 - methodGuard) / 48);
    }

    static {
        fullscreenCancelButtonText = "Cancel";
        canvasResizeController = null;
    }
}
