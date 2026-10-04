/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpawnQuotaSupport {
    static IndexedSprite selectedThemeBackground;

    final static void recordGeneratedEntity(boolean methodGuard) {
        if (!UiWidget.gameplaySession.tutorialMode) {
            CacheReference.generatedInCurrentTheme = CacheReference.generatedInCurrentTheme + 1;
            if (methodGuard) {
                SpawnQuotaSupport.releaseSelectedThemeBackground(false);
                return;
            }
            return;
        }
        if (!methodGuard) {
            return;
        }
        SpawnQuotaSupport.releaseSelectedThemeBackground(false);
    }

    public static void releaseSelectedThemeBackground(boolean methodGuard) {
        if (methodGuard) {
            selectedThemeBackground = (IndexedSprite) null;
            selectedThemeBackground = null;
            return;
        }
        selectedThemeBackground = null;
    }

    final static boolean decodeSpritesFromArchive(int fileId, int groupId, int methodGuard, ResourceArchive graphicsArchive) {
        byte[] unusedSpriteBytesSnapshot = null;
        RuntimeException decodeFailureForContext = null;
        byte[] spriteBytes = null;
        RuntimeException decodeFailureBeforeArchiveDescription = null;
        StringBuilder decodeMessagePrefix = null;
        String graphicsArchiveDescription = null;
        RuntimeException caughtDecodeFailure = null;
        try {
          spriteBytes = graphicsArchive.getFile(groupId, -28153, fileId);
          unusedSpriteBytesSnapshot = spriteBytes;
          if (methodGuard < 102) {
            return false;
          }
          if (spriteBytes == null) {
            return false;
          }
          IntrusiveNode.decodeSpriteSheet(true, spriteBytes);
          return true;
        } catch (java.lang.RuntimeException decodeFailure) {
          caughtDecodeFailure = decodeFailure;
          decodeFailureForContext = caughtDecodeFailure;
          decodeFailureBeforeArchiveDescription = decodeFailureForContext;
          decodeMessagePrefix = new StringBuilder().append("mf.A(").append(fileId).append(',').append(groupId).append(',').append(methodGuard).append(',');
          if (graphicsArchive == null) {
            graphicsArchiveDescription = "null";
          } else {
            graphicsArchiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) decodeFailureBeforeArchiveDescription), ((StringBuilder) (Object) decodeMessagePrefix).append(graphicsArchiveDescription).append(')').toString());
        }
    }

    static {
    }
}
