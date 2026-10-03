/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static String fullscreenCancelButtonText;
    static boolean field_c;
    static int kindFourRemovalCount;
    static v field_d;

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
            rb.a((byte) -35);
          }
          if (!mf.decodeSpritesFromArchive(fileId, groupId, 107, glyphGraphicsArchive)) {
            return null;
          }
          fontBeforeReturn = lc.buildMonochromeFontFromDecodedSprites(4520, fontMetricsArchive.getFile(groupId, -28153, fileId));
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

    public static void a(byte param0) {
        field_d = null;
        fullscreenCancelButtonText = null;
        int var1 = -73 % ((-60 - param0) / 48);
    }

    static {
        fullscreenCancelButtonText = "Cancel";
        field_d = null;
    }
}
