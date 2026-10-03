/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static IndexedSprite selectedThemeBackground;

    final static void b(boolean param0) {
        if (!UiWidget.gameplaySession.tutorialMode) {
            fj.field_m = fj.field_m + 1;
            if (param0) {
                mf.a(false);
                return;
            }
            return;
        }
        if (!param0) {
            return;
        }
        mf.a(false);
    }

    public static void a(boolean param0) {
        if (param0) {
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
