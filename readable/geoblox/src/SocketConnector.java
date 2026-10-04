/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SocketConnector {
    static String loginGameUpdatedText;
    String destinationHost;
    static int sweetsThemeCompletionAchievementId;
    static int swapRotationControlsKeyCode;
    static int[][] themeSpriteColors;
    static int[][] themeCycleColors;
    int destinationPort;
    static String bootstrapLoginPanelMessage;

    final java.net.Socket connectDirect(int methodGuard) throws IOException {
        if (methodGuard != 1) {
            return (java.net.Socket) null;
        }
        return new java.net.Socket(this.destinationHost, this.destinationPort);
    }

    abstract java.net.Socket connectUsingSystemProxies(int firstProxyIndex) throws IOException;

    final static boolean isEmailAvailabilityPending(int methodGuard) {
        if (methodGuard != 7) {
            return true;
        }
        return !EntityContactSupport.activeEmailAvailabilityQuery.isCompleted(-95) ? true : false;
    }

    final static SocialListEntry findSocialEntry(byte methodGuard, String displayName) {
        String lookupName = null;
        SocialListEntry candidateEntry = null;
        String candidateName = null;
        int clientControlFlowGuard = 0;
        CharSequence inputNameCharacters = null;
        CharSequence candidateNameCharacters = null;
        SocialListEntry nullEntryAfterGuard = null;
        Object nullEntryAfterInvalidName = null;
        SocialListEntry matchedEntryBeforeReturn = null;
        RuntimeException lookupFailureBeforeContext = null;
        StringBuilder lookupMessagePrefix = null;
        String displayNameDescription = null;
        RuntimeException caughtLookupFailure = null;
        RuntimeException lookupFailureForContext = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (ArchiveSource.primarySocialEntriesByNameHash == null) {
            return null;
          }
          if (displayName == null) {
            return null;
          }
          if (displayName.length() == 0) {
            return null;
          }
          if (methodGuard != -62) {
            nullEntryAfterGuard = (SocialListEntry) null;
            return nullEntryAfterGuard;
          }
          inputNameCharacters = (CharSequence) ((Object) displayName);
          lookupName = ResizableDialog.normalizeSessionName(inputNameCharacters, 12);
          if (lookupName == null) {
            nullEntryAfterInvalidName = null;
            return (SocialListEntry) (nullEntryAfterInvalidName);
          }
          candidateEntry = (SocialListEntry) ((Object) ArchiveSource.primarySocialEntriesByNameHash.findFirst((long)lookupName.hashCode(), -1));
          while (candidateEntry != null) {
            candidateNameCharacters = (CharSequence) ((Object) candidateEntry.displayName);
            candidateName = ResizableDialog.normalizeSessionName(candidateNameCharacters, 12);
            if (candidateName.equals(lookupName)) {
              matchedEntryBeforeReturn = candidateEntry;
              return matchedEntryBeforeReturn;
            }
            candidateEntry = (SocialListEntry) ((Object) ArchiveSource.primarySocialEntriesByNameHash.findNext(-29925));
          }
          return null;
        } catch (java.lang.RuntimeException lookupFailure) {
          caughtLookupFailure = lookupFailure;
          lookupFailureForContext = caughtLookupFailure;
          lookupFailureBeforeContext = lookupFailureForContext;
          lookupMessagePrefix = new StringBuilder().append("jg.B(").append(methodGuard).append(',');
          if (displayName == null) {
            displayNameDescription = "null";
          } else {
            displayNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) lookupFailureBeforeContext), ((StringBuilder) (Object) lookupMessagePrefix).append(displayNameDescription).append(')').toString());
        }
    }

    final static IndexedSprite loadIndexedSprite(ResourceArchive graphicsArchive, int methodGuard, String groupName, String resourceName) {
        int archiveGroupId = 0;
        RuntimeException spriteLoadFailureForContext = null;
        int archiveFileId = 0;
        IndexedSprite indexedSpriteBeforeReturn = null;
        RuntimeException spriteLoadFailureBeforeDescription = null;
        StringBuilder spriteLoadMessagePrefix = null;
        String graphicsArchiveDescription = null;
        StringBuilder messageBeforeGroupName = null;
        String groupNameDescription = null;
        StringBuilder messageBeforeResourceName = null;
        String resourceNameDescription = null;
        RuntimeException caughtSpriteLoadFailure = null;
        try {
          archiveGroupId = graphicsArchive.findGroupId((byte) 127, groupName);
          if (methodGuard != 1) {
            sweetsThemeCompletionAchievementId = 100;
          }
          archiveFileId = graphicsArchive.findFileId(resourceName, -110, archiveGroupId);
          indexedSpriteBeforeReturn = UsernameSuggestionsPanel.loadFirstIndexedSprite(archiveFileId, graphicsArchive, archiveGroupId, true);
          return indexedSpriteBeforeReturn;
        } catch (java.lang.RuntimeException spriteLoadFailure) {
          caughtSpriteLoadFailure = spriteLoadFailure;
          spriteLoadFailureForContext = caughtSpriteLoadFailure;
          spriteLoadFailureBeforeDescription = spriteLoadFailureForContext;
          spriteLoadMessagePrefix = new StringBuilder().append("jg.C(");
          if (graphicsArchive == null) {
            graphicsArchiveDescription = "null";
          } else {
            graphicsArchiveDescription = "{...}";
          }
          messageBeforeGroupName = ((StringBuilder) (Object) spriteLoadMessagePrefix).append(graphicsArchiveDescription).append(',').append(methodGuard).append(',');
          if (groupName == null) {
            groupNameDescription = "null";
          } else {
            groupNameDescription = "{...}";
          }
          messageBeforeResourceName = ((StringBuilder) (Object) messageBeforeGroupName).append(groupNameDescription).append(',');
          if (resourceName == null) {
            resourceNameDescription = "null";
          } else {
            resourceNameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) spriteLoadFailureBeforeDescription), ((StringBuilder) (Object) messageBeforeResourceName).append(resourceNameDescription).append(')').toString());
        }
    }

    public static void releaseSocketConnectorSharedResources(int methodGuard) {
        bootstrapLoginPanelMessage = null;
        loginGameUpdatedText = null;
        if (methodGuard != 16712207) {
            SocketConnector.isEmailAvailabilityPending(56);
        }
        themeSpriteColors = (int[][]) null;
        themeCycleColors = (int[][]) null;
    }

    final static void prepareInitialGameAudio(ResourceArchive synthesizedSoundArchive, byte methodGuard, ResourceArchive vorbisArchive, ResourceArchive musicScoreArchive, ResourceArchive instrumentPatchArchive) {
        RuntimeException preparationFailureBeforeDescription = null;
        StringBuilder preparationMessagePrefix = null;
        String synthesizedArchiveDescription = null;
        StringBuilder messageBeforeVorbisArchive = null;
        String vorbisArchiveDescription = null;
        StringBuilder messageBeforeScoreArchive = null;
        String scoreArchiveDescription = null;
        StringBuilder messageBeforePatchArchive = null;
        String patchArchiveDescription = null;
        RuntimeException caughtAudioPreparationFailure = null;
        int soundIndex = 0;
        RuntimeException audioPreparationFailureForContext = null;
        PcmSample sampleBeforeResampling = null;
        int clientControlSnapshot = 0;
        String invalidGuardLookupName = null;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          AccountEligibilitySupport.musicScoreArchive = musicScoreArchive;
          UsernameAvailabilityQuery.instrumentPatchArchive = instrumentPatchArchive;
          AchievementSubmission.gameSoundResampler = new PcmResampler(22050, AudioOutput.sampleRateHz);
          GameGraphicsResources.titleMusicTrack = MusicScore.loadNamedScore(AccountEligibilitySupport.musicScoreArchive, "", "title_music_loop");
          ValidationMessageWidget.gameOverMusicTrack = MusicScore.loadNamedScore(AccountEligibilitySupport.musicScoreArchive, "", "game_over");
          IntrusiveNode.sunMusicTrack = MusicScore.loadNamedScore(AccountEligibilitySupport.musicScoreArchive, "", "sun");
          ContentTransitionDialog.resultMusicTrack = MusicScore.loadNamedScore(AccountEligibilitySupport.musicScoreArchive, "", "bonus_bubble_jingle");
          GameAudioState.gameSoundSampleCache = new SoundSampleCache(synthesizedSoundArchive, vorbisArchive);
          PasswordWidgetRenderer.gameMusicStream.prepareScoreInstruments(GameAudioState.gameSoundSampleCache, 0, -1, IntrusiveNode.sunMusicTrack, UsernameAvailabilityQuery.instrumentPatchArchive);
          EmailValidator.themeMusicPreparationFlags[1] = true;
          PasswordWidgetRenderer.gameMusicStream.prepareScoreInstruments(GameAudioState.gameSoundSampleCache, 0, -1, ContentTransitionDialog.resultMusicTrack, UsernameAvailabilityQuery.instrumentPatchArchive);
          PasswordWidgetRenderer.gameMusicStream.prepareScoreInstruments(GameAudioState.gameSoundSampleCache, 0, -1, ValidationMessageWidget.gameOverMusicTrack, UsernameAvailabilityQuery.instrumentPatchArchive);
          PasswordWidgetRenderer.gameMusicStream.prepareScoreInstruments(GameAudioState.gameSoundSampleCache, 0, -1, GameGraphicsResources.titleMusicTrack, UsernameAvailabilityQuery.instrumentPatchArchive);
          soundIndex = 0;
          if (methodGuard < 69) {
            invalidGuardLookupName = (String) null;
            SocketConnector.findSocialEntry((byte) 74, (String) null);
          }
          while (soundIndex < 33) {
            if ((TextTemplateArgumentType.gameSoundThemeIds[soundIndex] > 0) &&
                (TextTemplateArgumentType.gameSoundThemeIds[soundIndex] != 1)) {
              soundIndex++;
              continue;
            }
            if ((soundIndex >= 10) &&
                (26 >= soundIndex)) {
              sampleBeforeResampling = GameAudioState.gameSoundSampleCache.getVorbisSampleByName(-1879044097, SessionSocketSupport.gameSoundResourceNames[soundIndex]);
            } else {
              sampleBeforeResampling = GameAudioState.gameSoundSampleCache.getSynthesizedSampleByName(1, SessionSocketSupport.gameSoundResourceNames[soundIndex]);
            }
            GameSoundResources.gameSoundSamples[soundIndex] = sampleBeforeResampling.resampleInPlace(AchievementSubmission.gameSoundResampler);
            SecondaryNodeHashTable.gameSoundPreparationFlags[soundIndex] = true;
            soundIndex++;
          }
          return;
        } catch (java.lang.RuntimeException audioPreparationFailure) {
          caughtAudioPreparationFailure = audioPreparationFailure;
          audioPreparationFailureForContext = caughtAudioPreparationFailure;
          preparationFailureBeforeDescription = audioPreparationFailureForContext;
          preparationMessagePrefix = new StringBuilder().append("jg.E(");
          if (synthesizedSoundArchive == null) {
            synthesizedArchiveDescription = "null";
          } else {
            synthesizedArchiveDescription = "{...}";
          }
          messageBeforeVorbisArchive = ((StringBuilder) (Object) preparationMessagePrefix).append(synthesizedArchiveDescription).append(',').append(methodGuard).append(',');
          if (vorbisArchive == null) {
            vorbisArchiveDescription = "null";
          } else {
            vorbisArchiveDescription = "{...}";
          }
          messageBeforeScoreArchive = ((StringBuilder) (Object) messageBeforeVorbisArchive).append(vorbisArchiveDescription).append(',');
          if (musicScoreArchive == null) {
            scoreArchiveDescription = "null";
          } else {
            scoreArchiveDescription = "{...}";
          }
          messageBeforePatchArchive = ((StringBuilder) (Object) messageBeforeScoreArchive).append(scoreArchiveDescription).append(',');
          if (instrumentPatchArchive == null) {
            patchArchiveDescription = "null";
          } else {
            patchArchiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) preparationFailureBeforeDescription), ((StringBuilder) (Object) messageBeforePatchArchive).append(patchArchiveDescription).append(')').toString());
        }
    }

    static {
        int copiedThemeIndex = 0;
        int sortedThemeIndex = 0;
        int[] themeSortKeysForWrites;
        int colorIndex;
        int insertionScanIndex;
        float maskedRedFraction;
        int insertionSortKey;
        float maskedGreenFraction;
        int insertionRgbColor;
        float blueFraction;
        float selectedLowChannel;
        float selectedHighChannel;
        float selectedChannelRange;
        int dominantChannelId;
        float derivedLightness;
        float derivedSaturation;
        float derivedHue;
        float oneSixth;
        float redHueOffset;
        float greenHueOffset;
        float blueHueOffset;
        int[] allocatedSortKeysAlias;
        int[] allocatedSortKeys;
        sweetsThemeCompletionAchievementId = 9;
        loginGameUpdatedText = "This game has been updated! Please reload this page.";
        swapRotationControlsKeyCode = 35;
        themeCycleColors = new int[7][7];
        themeSpriteColors = new int[][]{new int[]{16646130, 4383370, 7784169, 16732531, 16569656, 16756645, 14022770}, new int[]{16099865, 16720435, 16770049, 42709, 16733161, 11078398, 3658269}, new int[]{16229425, 5957352, 16122070, 15595784, 10216240, 2706395, 11226077}, new int[]{52224, 39372, 16751631, 16751052, 16777011, 16724736, 10040217}, new int[]{16507819, 14654025, 14129125, 13953361, 14512505, 12506866, 12632256}, new int[]{15815889, 1289446, 16363563, 16116238, 9126089, 16730432, 5088306}, new int[]{16716239, 22986, 7461652, 16514820, 16712207, 16744452, 6438761}};
        for (copiedThemeIndex = 0; copiedThemeIndex < 7; copiedThemeIndex++) {
          ArrayOperations.copyInts(themeSpriteColors[copiedThemeIndex], 0, themeCycleColors[copiedThemeIndex], 0, 7);
        }
        allocatedSortKeys = new int[7];
        allocatedSortKeysAlias = allocatedSortKeys;
        themeSortKeysForWrites = allocatedSortKeysAlias;
        for (sortedThemeIndex = 0; sortedThemeIndex < 7; sortedThemeIndex++) {
          for (colorIndex = 0; 7 > colorIndex; colorIndex++) {
            maskedRedFraction = (float)((themeSpriteColors[sortedThemeIndex][colorIndex] & 16776188) >> 16) / 255.0f;
            maskedGreenFraction = (float)((themeSpriteColors[sortedThemeIndex][colorIndex] & 65454) >> 8) / 255.0f;
            blueFraction = (float)(255 & themeSpriteColors[sortedThemeIndex][colorIndex]) / 255.0f;
            dominantChannelId = 0;
            if ((maskedRedFraction > maskedGreenFraction) &&
                (maskedRedFraction > blueFraction)) {
              selectedHighChannel = maskedRedFraction;
              if (!(maskedGreenFraction > blueFraction)) {
                selectedLowChannel = maskedGreenFraction;
              } else {
                selectedLowChannel = blueFraction;
              }
            } else if ((maskedGreenFraction > maskedRedFraction) &&
                (maskedGreenFraction > blueFraction)) {
              selectedLowChannel = (!(maskedRedFraction > blueFraction)) ? maskedRedFraction : blueFraction;
              dominantChannelId = 1;
              selectedHighChannel = maskedGreenFraction;
            } else {
              selectedHighChannel = blueFraction;
              dominantChannelId = 2;
              selectedLowChannel = (!(maskedGreenFraction < maskedRedFraction)) ? maskedRedFraction : maskedGreenFraction;
            }
            selectedChannelRange = selectedHighChannel - selectedLowChannel;
            derivedLightness = (selectedHighChannel + selectedLowChannel) / 2.0f;
            if (!(derivedLightness < 0.5f)) {
              derivedSaturation = selectedChannelRange / (-selectedLowChannel + (-selectedHighChannel + 2.0f));
            } else {
              derivedSaturation = selectedChannelRange / (selectedHighChannel + selectedLowChannel);
            }
            oneSixth = 0.1666666716337204f;
            redHueOffset = ((-maskedRedFraction + selectedHighChannel) * oneSixth + 0.5f * selectedChannelRange) / selectedChannelRange;
            greenHueOffset = ((-maskedGreenFraction + selectedHighChannel) * oneSixth + 0.5f * selectedChannelRange) / selectedChannelRange;
            blueHueOffset = (oneSixth * (selectedHighChannel - blueFraction) + selectedChannelRange * 0.5f) / selectedChannelRange;
            if (dominantChannelId == 0) {
              derivedHue = -greenHueOffset + blueHueOffset;
            } else {
              if (dominantChannelId == 1) {
                derivedHue = -blueHueOffset + (0.3333333432674408f + redHueOffset);
              } else {
                derivedHue = -redHueOffset + (0.6666666865348816f + greenHueOffset);
              }
            }
            if (!(derivedHue < 0.0f)) {
              if (derivedHue > 1.0f) {
                derivedHue = derivedHue - 1.0f;
              }
            } else {
              derivedHue = derivedHue + 1.0f;
            }
            themeSortKeysForWrites[colorIndex] = (int)(derivedHue * 255.0f) << (int)(derivedSaturation * 255.0f) + 16 << 8 + (int)(255.0f * derivedLightness);
          }
          for (colorIndex = 1; 7 > colorIndex; colorIndex++) {
            insertionScanIndex = -1 + colorIndex;
            insertionSortKey = allocatedSortKeys[colorIndex];
            insertionRgbColor = themeCycleColors[sortedThemeIndex][colorIndex];
            while (insertionScanIndex >= 0) {
              if (allocatedSortKeys[insertionScanIndex] > insertionSortKey) {
                themeSortKeysForWrites[insertionScanIndex + 1] = allocatedSortKeys[insertionScanIndex];
                themeCycleColors[sortedThemeIndex][1 + insertionScanIndex] = themeCycleColors[sortedThemeIndex][insertionScanIndex];
                insertionScanIndex--;
                continue;
              }
              break;
            }
            themeSortKeysForWrites[insertionScanIndex + 1] = insertionSortKey;
            themeCycleColors[sortedThemeIndex][insertionScanIndex + 1] = insertionRgbColor;
          }
        }
    }
}
