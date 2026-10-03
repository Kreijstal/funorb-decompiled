/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScorePopupSupport {
    static int newAchievementMask;
    static SecondaryNodeHashTable secondarySocialEntriesByNameHash;
    static String createEmailText;

    final static StringBuilder resizeAndPadTextBuilder(StringBuilder builder, byte methodGuard, char paddingCharacter, int targetLength) {
        int paddingIndex = 0;
        int previousLength = 0;
        RuntimeException resizeFailureForContext = null;
        int unusedClientControlSnapshot = 0;
        String unusedNullResourceNameSnapshot = null;
        StringBuilder resizedBuilderResult = null;
        RuntimeException resizeFailureCause = null;
        StringBuilder resizeFailurePrefix = null;
        String builderArgumentDescription = null;
        RuntimeException caughtResizeFailure = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard >= -125) {
            unusedNullResourceNameSnapshot = (String) null;
            ScorePopupSupport.loadSprite((String) null, (ResourceArchive) null, (byte) 14, (String) null);
          }
          previousLength = builder.length();
          builder.setLength(targetLength);
          for (paddingIndex = previousLength; targetLength > paddingIndex; paddingIndex++) {
            builder.setCharAt(paddingIndex, paddingCharacter);
          }
          resizedBuilderResult = (StringBuilder) (builder);
          return resizedBuilderResult;
        } catch (java.lang.RuntimeException resizeFailure) {
          caughtResizeFailure = resizeFailure;
          resizeFailureForContext = caughtResizeFailure;
          resizeFailureCause = resizeFailureForContext;
          resizeFailurePrefix = new StringBuilder().append("ug.D(");
          if (builder == null) {
            builderArgumentDescription = "null";
          } else {
            builderArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) resizeFailureCause), ((StringBuilder) (Object) resizeFailurePrefix).append(builderArgumentDescription).append(',').append(methodGuard).append(',').append(paddingCharacter).append(',').append(targetLength).append(')').toString());
        }
    }

    final static void spawnScorePopup(int points, boolean methodGuard, int originY, int chainMultiplier, int originX) {
        ScorePopup popup = (ScorePopup) ((Object) PcmResampler.availableScorePopups.removeLast(1));
        if (!(popup != null)) {
            UiWidget.gameplaySession.addScore((byte) 127, points);
            return;
        }
        popup.progress = 0.0f;
        popup.points = points;
        popup.pointsText = Integer.toString(points);
        popup.originX = (float)originX;
        popup.chainMultiplier = chainMultiplier;
        if (methodGuard) {
            popup.originY = (float)originY;
            GmtTimestampSupport.activeScorePopups.addLast(-95, popup);
            return;
        }
        createEmailText = (String) null;
        popup.originY = (float)originY;
        GmtTimestampSupport.activeScorePopups.addLast(-95, popup);
    }

    final static Sprite loadSprite(String resourceName, ResourceArchive graphicsArchive, byte methodGuard, String groupName) {
        int archiveGroupId = 0;
        RuntimeException spriteLoadFailureForContext = null;
        int archiveFileId = 0;
        Sprite disabledSpriteResult = null;
        Sprite loadedSpriteResult = null;
        RuntimeException spriteLoadFailureCause = null;
        StringBuilder spriteLoadFailurePrefix = null;
        String resourceNameDescription = null;
        StringBuilder messageBeforeArchiveDescription = null;
        String archiveDescription = null;
        StringBuilder messageBeforeGroupDescription = null;
        String groupNameDescription = null;
        RuntimeException caughtSpriteLoadFailure = null;
        try {
          archiveGroupId = graphicsArchive.findGroupId((byte) 127, groupName);
          archiveFileId = graphicsArchive.findFileId(resourceName, -57, archiveGroupId);
          if (methodGuard == -78) {
            loadedSpriteResult = ByteArrayBuffer.a(archiveGroupId, methodGuard ^ -95, archiveFileId, graphicsArchive);
            return loadedSpriteResult;
          }
          disabledSpriteResult = (Sprite) null;
          return disabledSpriteResult;
        } catch (java.lang.RuntimeException spriteLoadFailure) {
          caughtSpriteLoadFailure = spriteLoadFailure;
          spriteLoadFailureForContext = caughtSpriteLoadFailure;
          spriteLoadFailureCause = spriteLoadFailureForContext;
          spriteLoadFailurePrefix = new StringBuilder().append("ug.C(");
          if (resourceName == null) {
            resourceNameDescription = "null";
          } else {
            resourceNameDescription = "{...}";
          }
          messageBeforeArchiveDescription = ((StringBuilder) (Object) spriteLoadFailurePrefix).append(resourceNameDescription).append(',');
          if (graphicsArchive == null) {
            archiveDescription = "null";
          } else {
            archiveDescription = "{...}";
          }
          messageBeforeGroupDescription = ((StringBuilder) (Object) messageBeforeArchiveDescription).append(archiveDescription).append(',').append(methodGuard).append(',');
          if (groupName == null) {
            groupNameDescription = "null";
          } else {
            groupNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) spriteLoadFailureCause), ((StringBuilder) (Object) messageBeforeGroupDescription).append(groupNameDescription).append(')').toString());
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        createEmailText = null;
        secondarySocialEntriesByNameHash = null;
        if (methodGuard != 9144) {
            String unusedNullResourceNameSnapshot = (String) null;
            ScorePopupSupport.loadSprite((String) null, (ResourceArchive) null, (byte) 53, (String) null);
        }
    }

    static {
        createEmailText = "Email (Login):";
    }
}
