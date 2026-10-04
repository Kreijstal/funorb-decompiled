/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameGraphicsResources {
    static Sprite[] frameNineSliceSprites;
    static String createMoreSuggestionsText;
    static ResourceArchive gameGraphicsArchive;
    static MusicScore titleMusicTrack;
    static boolean loginResponseExtensionEnabled;
    static String createEmailTooltipText;
    static boolean[] themesLoaded;
    static String backText;

    final static long elapsedSinceSessionActivity(byte methodGuard) {
        if (methodGuard != 12) {
            ResourceArchive guardedNullGraphicsArchiveSnapshot = (ResourceArchive) null;
            GameGraphicsResources.loadRgbSpritesById(55, (byte) -55, -85, (ResourceArchive) null);
        }
        return -AudioService.sessionActivityStartMillis + ClientClockSupport.correctedCurrentTimeMillis(-12520);
    }

    final static Sprite[] loadRgbSpritesById(int groupId, byte methodGuard, int fileId, ResourceArchive graphicsArchive) {
        RuntimeException spriteLoadFailureForContext = null;
        Object missingSpritesBeforeReturn = null;
        Sprite[] guardedNullSpritesBeforeReturn = null;
        Sprite[] spritesBeforeReturn = null;
        RuntimeException spriteLoadFailureBeforeContext = null;
        StringBuilder spriteLoadMessagePrefix = null;
        String graphicsArchiveDescription = null;
        RuntimeException caughtSpriteLoadFailure = null;
        try {
          if (!mf.decodeSpritesFromArchive(fileId, groupId, 117, graphicsArchive)) {
            missingSpritesBeforeReturn = null;
            return (Sprite[]) (missingSpritesBeforeReturn);
          }
          if (methodGuard == -81) {
            spritesBeforeReturn = TriangleMesh.buildRgbSpritesFromDecodedSheet(255);
            return spritesBeforeReturn;
          }
          guardedNullSpritesBeforeReturn = (Sprite[]) null;
          return guardedNullSpritesBeforeReturn;
        } catch (java.lang.RuntimeException spriteLoadFailure) {
          caughtSpriteLoadFailure = spriteLoadFailure;
          spriteLoadFailureForContext = caughtSpriteLoadFailure;
          spriteLoadFailureBeforeContext = spriteLoadFailureForContext;
          spriteLoadMessagePrefix = new StringBuilder().append("ll.A(").append(groupId).append(',').append(methodGuard).append(',').append(fileId).append(',');
          if (graphicsArchive == null) {
            graphicsArchiveDescription = "null";
          } else {
            graphicsArchiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) spriteLoadFailureBeforeContext), ((StringBuilder) (Object) spriteLoadMessagePrefix).append(graphicsArchiveDescription).append(')').toString());
        }
    }

    public static void clearGameGraphicsResources(int methodGuard) {
        createEmailTooltipText = null;
        gameGraphicsArchive = null;
        backText = null;
        createMoreSuggestionsText = null;
        titleMusicTrack = null;
        frameNineSliceSprites = null;
        if (methodGuard != 7) {
            return;
        }
        themesLoaded = null;
    }

    static {
        createMoreSuggestionsText = "More suggestions";
        themesLoaded = new boolean[7];
        createEmailTooltipText = "Your email address is used to identify this account";
        backText = "Back";
    }
}
