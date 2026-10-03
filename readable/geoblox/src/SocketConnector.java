/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SocketConnector {
    static String loginGameUpdatedText;
    String field_e;
    static int field_a;
    static int swapRotationControlsKeyCode;
    static int[][] themeSpriteColors;
    static int[][] themeCycleColors;
    int field_b;
    static String field_d;

    final java.net.Socket a(int param0) throws IOException {
        if (param0 != 1) {
            return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_e, this.field_b);
    }

    abstract java.net.Socket b(int param0) throws IOException;

    final static boolean d(int param0) {
        if (param0 != 7) {
            return true;
        }
        return !EntityContactSupport.activeEmailAvailabilityQuery.isCompleted(-95) ? true : false;
    }

    final static SocialListEntry findSocialEntry(byte methodGuard, String displayName) {
        String var2 = null;
        SocialListEntry var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        SocialListEntry stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        SocialListEntry stackIn_20_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Geoblox.clientControlFlowFlag;
        try {
          if (ArchiveSource.field_a == null) {
            return null;
          }
          if (displayName == null) {
            return null;
          }
          if (displayName.length() == 0) {
            return null;
          }
          if (methodGuard != -62) {
            stackIn_10_0 = (SocialListEntry) null;
            return stackIn_10_0;
          }
          var6 = (CharSequence) ((Object) displayName);
          var2 = ResizableDialog.a(var6, 12);
          if (var2 == null) {
            stackIn_13_0 = null;
            return (SocialListEntry) (stackIn_13_0);
          }
          var3 = (SocialListEntry) ((Object) ArchiveSource.field_a.findFirst((long)var2.hashCode(), -1));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.displayName);
            var4 = ResizableDialog.a(var7, 12);
            if (var4.equals(var2)) {
              stackIn_20_0 = var3;
              return stackIn_20_0;
            }
            var3 = (SocialListEntry) ((Object) ArchiveSource.field_a.findNext(-29925));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_25_0 = var2_ref;
          stackIn_25_1 = new StringBuilder().append("jg.B(").append(methodGuard).append(',');
          if (displayName == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static IndexedSprite loadIndexedSprite(ResourceArchive graphicsArchive, int methodGuard, String groupName, String resourceName) {
        int archiveGroupId = 0;
        RuntimeException var4 = null;
        int archiveFileId = 0;
        IndexedSprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          archiveGroupId = graphicsArchive.findGroupId((byte) 127, groupName);
          if (methodGuard != 1) {
            field_a = 100;
          }
          archiveFileId = graphicsArchive.findFileId(resourceName, -110, archiveGroupId);
          stackIn_3_0 = UsernameSuggestionsPanel.a(archiveFileId, graphicsArchive, archiveGroupId, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("jg.C(");
          if (graphicsArchive == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(methodGuard).append(',');
          if (groupName == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (resourceName == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        field_d = null;
        loginGameUpdatedText = null;
        if (param0 != 16712207) {
            SocketConnector.d(56);
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
          kf.musicScoreArchive = musicScoreArchive;
          UsernameAvailabilityQuery.instrumentPatchArchive = instrumentPatchArchive;
          AchievementSubmission.gameSoundResampler = new PcmResampler(22050, AudioOutput.sampleRateHz);
          ll.titleMusicTrack = MusicScore.loadNamedScore(kf.musicScoreArchive, "", "title_music_loop");
          ValidationMessageWidget.gameOverMusicTrack = MusicScore.loadNamedScore(kf.musicScoreArchive, "", "game_over");
          IntrusiveNode.sunMusicTrack = MusicScore.loadNamedScore(kf.musicScoreArchive, "", "sun");
          ContentTransitionDialog.resultMusicTrack = MusicScore.loadNamedScore(kf.musicScoreArchive, "", "bonus_bubble_jingle");
          te.gameSoundSampleCache = new SoundSampleCache(synthesizedSoundArchive, vorbisArchive);
          PasswordWidgetRenderer.gameMusicStream.prepareScoreInstruments(te.gameSoundSampleCache, 0, -1, IntrusiveNode.sunMusicTrack, UsernameAvailabilityQuery.instrumentPatchArchive);
          EmailValidator.themeMusicPreparationFlags[1] = true;
          PasswordWidgetRenderer.gameMusicStream.prepareScoreInstruments(te.gameSoundSampleCache, 0, -1, ContentTransitionDialog.resultMusicTrack, UsernameAvailabilityQuery.instrumentPatchArchive);
          PasswordWidgetRenderer.gameMusicStream.prepareScoreInstruments(te.gameSoundSampleCache, 0, -1, ValidationMessageWidget.gameOverMusicTrack, UsernameAvailabilityQuery.instrumentPatchArchive);
          PasswordWidgetRenderer.gameMusicStream.prepareScoreInstruments(te.gameSoundSampleCache, 0, -1, ll.titleMusicTrack, UsernameAvailabilityQuery.instrumentPatchArchive);
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
              sampleBeforeResampling = te.gameSoundSampleCache.getVorbisSampleByName(-1879044097, w.gameSoundResourceNames[soundIndex]);
            } else {
              sampleBeforeResampling = te.gameSoundSampleCache.getSynthesizedSampleByName(1, w.gameSoundResourceNames[soundIndex]);
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
        int var0_int = 0;
        int var1 = 0;
        int[] var0;
        int var2;
        int var3;
        float var3_float;
        int var4;
        float var4_float;
        int var5;
        float var5_float;
        float var6;
        float var7;
        float var8;
        int var9;
        float var10;
        float var11;
        float var12;
        float var13;
        float var14;
        float var15;
        float var16;
        int[] var17;
        int[] var18;
        field_a = 9;
        loginGameUpdatedText = "This game has been updated! Please reload this page.";
        swapRotationControlsKeyCode = 35;
        themeCycleColors = new int[7][7];
        themeSpriteColors = new int[][]{new int[]{16646130, 4383370, 7784169, 16732531, 16569656, 16756645, 14022770}, new int[]{16099865, 16720435, 16770049, 42709, 16733161, 11078398, 3658269}, new int[]{16229425, 5957352, 16122070, 15595784, 10216240, 2706395, 11226077}, new int[]{52224, 39372, 16751631, 16751052, 16777011, 16724736, 10040217}, new int[]{16507819, 14654025, 14129125, 13953361, 14512505, 12506866, 12632256}, new int[]{15815889, 1289446, 16363563, 16116238, 9126089, 16730432, 5088306}, new int[]{16716239, 22986, 7461652, 16514820, 16712207, 16744452, 6438761}};
        for (var0_int = 0; var0_int < 7; var0_int++) {
          ArrayOperations.copyInts(themeSpriteColors[var0_int], 0, themeCycleColors[var0_int], 0, 7);
        }
        var18 = new int[7];
        var17 = var18;
        var0 = var17;
        for (var1 = 0; var1 < 7; var1++) {
          for (var2 = 0; 7 > var2; var2++) {
            var3_float = (float)((themeSpriteColors[var1][var2] & 16776188) >> 16) / 255.0f;
            var4_float = (float)((themeSpriteColors[var1][var2] & 65454) >> 8) / 255.0f;
            var5_float = (float)(255 & themeSpriteColors[var1][var2]) / 255.0f;
            var9 = 0;
            if ((var3_float > var4_float) &&
                (var3_float > var5_float)) {
              var7 = var3_float;
              if (!(var4_float > var5_float)) {
                var6 = var4_float;
              } else {
                var6 = var5_float;
              }
            } else if ((var4_float > var3_float) &&
                (var4_float > var5_float)) {
              var6 = (!(var3_float > var5_float)) ? var3_float : var5_float;
              var9 = 1;
              var7 = var4_float;
            } else {
              var7 = var5_float;
              var9 = 2;
              var6 = (!(var4_float < var3_float)) ? var3_float : var4_float;
            }
            var8 = var7 - var6;
            var10 = (var7 + var6) / 2.0f;
            if (!(var10 < 0.5f)) {
              var11 = var8 / (-var6 + (-var7 + 2.0f));
            } else {
              var11 = var8 / (var7 + var6);
            }
            var13 = 0.1666666716337204f;
            var14 = ((-var3_float + var7) * var13 + 0.5f * var8) / var8;
            var15 = ((-var4_float + var7) * var13 + 0.5f * var8) / var8;
            var16 = (var13 * (var7 - var5_float) + var8 * 0.5f) / var8;
            if (var9 == 0) {
              var12 = -var15 + var16;
            } else {
              if (var9 == 1) {
                var12 = -var16 + (0.3333333432674408f + var14);
              } else {
                var12 = -var14 + (0.6666666865348816f + var15);
              }
            }
            if (!(var12 < 0.0f)) {
              if (var12 > 1.0f) {
                var12 = var12 - 1.0f;
              }
            } else {
              var12 = var12 + 1.0f;
            }
            var0[var2] = (int)(var12 * 255.0f) << (int)(var11 * 255.0f) + 16 << 8 + (int)(255.0f * var10);
          }
          for (var2 = 1; 7 > var2; var2++) {
            var3 = -1 + var2;
            var4 = var18[var2];
            var5 = themeCycleColors[var1][var2];
            while (var3 >= 0) {
              if (var18[var3] > var4) {
                var0[var3 + 1] = var18[var3];
                themeCycleColors[var1][1 + var3] = themeCycleColors[var1][var3];
                var3--;
                continue;
              }
              break;
            }
            var0[var3 + 1] = var4;
            themeCycleColors[var1][var3 + 1] = var5;
          }
        }
    }
}
