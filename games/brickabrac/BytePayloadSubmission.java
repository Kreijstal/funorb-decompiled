/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BytePayloadSubmission extends IntrusiveNode {
    static boolean field_l;
    static RgbSprite[] smallRosetteSprites;
    int checksum;
    byte[] payload;
    static boolean field_k;

    final static int combineLevelAttributes(LevelPack pack, int startIndex, boolean obfuscationGuard, int endIndex) {
        int levelIndex = 0;
        int combinedAttributes = 0;
        RuntimeException failure = null;
        int gameFlag = 0;
        int resultAttributes = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String packSummary = null;
        RuntimeException caughtFailure = null;
        gameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          combinedAttributes = 0;
          if (!obfuscationGuard) {
            field_k = false;
          }
          for (levelIndex = startIndex; endIndex > levelIndex; levelIndex++) {
            combinedAttributes = combinedAttributes | pack.metadata[levelIndex].attributeWord;
          }
          resultAttributes = combinedAttributes;
          return resultAttributes;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("ln.E(");
          if (pack == null) {
            packSummary = "null";
          } else {
            packSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(packSummary).append(',').append(startIndex).append(',').append(obfuscationGuard).append(',').append(endIndex).append(')').toString());
        }
    }

    public static void a(byte param0) {
        smallRosetteSprites = null;
        int var1 = -16 % ((62 - param0) / 48);
    }

    final static void initializeBackgroundResources(ResourceArchive musicSampleArchive, SoundCache soundCache, ResourceArchive musicTrackArchive, ResourceArchive sceneSpriteArchive, ResourceArchive soundEffectArchive, int obfuscationGuard, ResourceArchive musicPatchArchive) {
        int surface960Index = 0;
        int gameFlag = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String sampleArchiveSummary = null;
        StringBuilder sampleContextBuilder = null;
        String soundCacheSummary = null;
        StringBuilder cacheContextBuilder = null;
        String trackArchiveSummary = null;
        StringBuilder trackContextBuilder = null;
        String spriteArchiveSummary = null;
        StringBuilder spriteContextBuilder = null;
        String effectArchiveSummary = null;
        StringBuilder effectContextBuilder = null;
        String patchArchiveSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        int surface1280Index;
        gameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          BrickABrac.backgroundSoundEffectArchive = soundEffectArchive;
          AchievementIcon.backgroundSpriteArchive = sceneSpriteArchive;
          if (obfuscationGuard != -10) {
            smallRosetteSprites = (RgbSprite[]) null;
          }
          UiComponent.backgroundMusicTrackArchive = musicTrackArchive;
          SoundPlayback.soundCache = soundCache;
          QuickChatMenu.backgroundMusicSampleArchive = musicSampleArchive;
          IterableIntrusiveHashTable.backgroundMusicPatchArchive = musicPatchArchive;
          for (surface960Index = 0; surface960Index < 2; surface960Index++) {
            JungleBackground.backgroundSurfacePool960.addLast(new RasterCacheSurface(960, 480), (byte) 3);
          }
          for (surface1280Index = 0; surface1280Index < 2; surface1280Index++) {
            ActivityIndicatorWidget.backgroundSurfacePool1280.addLast(new RasterCacheSurface(1280, 480), (byte) 3);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("ln.B(");
          if (musicSampleArchive == null) {
            sampleArchiveSummary = "null";
          } else {
            sampleArchiveSummary = "{...}";
          }
          sampleContextBuilder = ((StringBuilder) (Object) contextBuilder).append(sampleArchiveSummary).append(',');
          if (soundCache == null) {
            soundCacheSummary = "null";
          } else {
            soundCacheSummary = "{...}";
          }
          cacheContextBuilder = ((StringBuilder) (Object) sampleContextBuilder).append(soundCacheSummary).append(',');
          if (musicTrackArchive == null) {
            trackArchiveSummary = "null";
          } else {
            trackArchiveSummary = "{...}";
          }
          trackContextBuilder = ((StringBuilder) (Object) cacheContextBuilder).append(trackArchiveSummary).append(',');
          if (sceneSpriteArchive == null) {
            spriteArchiveSummary = "null";
          } else {
            spriteArchiveSummary = "{...}";
          }
          spriteContextBuilder = ((StringBuilder) (Object) trackContextBuilder).append(spriteArchiveSummary).append(',');
          if (soundEffectArchive == null) {
            effectArchiveSummary = "null";
          } else {
            effectArchiveSummary = "{...}";
          }
          effectContextBuilder = ((StringBuilder) (Object) spriteContextBuilder).append(effectArchiveSummary).append(',').append(obfuscationGuard).append(',');
          if (musicPatchArchive == null) {
            patchArchiveSummary = "null";
          } else {
            patchArchiveSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) effectContextBuilder).append(patchArchiveSummary).append(')').toString());
        }
    }

    final static boolean decodeSpritesFromArchive(int obfuscationGuard, int fileId, ResourceArchive archive, int groupId) {
        byte[] unusedDataAlias = null;
        RuntimeException failure = null;
        byte[] spriteBytes = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String archiveSummary = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard >= -87) {
            smallRosetteSprites = (RgbSprite[]) null;
          }
          spriteBytes = archive.takeFile(fileId, groupId, 4);
          unusedDataAlias = spriteBytes;
          if (spriteBytes == null) {
            return false;
          }
          WidgetTheme.decodeSpriteData(spriteBytes, false);
          return true;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("ln.C(").append(obfuscationGuard).append(',').append(fileId).append(',');
          if (archive == null) {
            archiveSummary = "null";
          } else {
            archiveSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(archiveSummary).append(',').append(groupId).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = null != IncomingPacketHelpers.pendingLobbyGame ? 1 : 0;
        if (MeshAttributeRecord.currentKeyCode == 9 &&
          QuickChatHelpDialog.a(QuickChatHelpDialog.field_Zb, -3, Under13RegistrationNoticePanel.field_K, ResourceRequest.field_z, TextFieldRenderer.field_x)) {
          if (TextFieldRenderer.field_x != 2 &&
            var3 != 0) {
            return false;
          }
          return QuickChatParameterType.a(ResourceRequest.field_z, QuickChatHelpDialog.field_Zb, TextFieldRenderer.field_x, false, Under13RegistrationNoticePanel.field_K);
        }
        if (10 == MeshAttributeRecord.currentKeyCode) {
          if (var3 != 0) {
            return false;
          }
          LevelPackLoader.a(4252);
          return true;
        }
        if (MeshAttributeRecord.currentKeyCode == param1) {
          if (!NumericLoginCredentials.repeatMessageAvailable) {
            return false;
          }
          if (QuickChatPhraseDefinition.repeatMessageChannel == 2 &&
            !LevelSelectScreen.a(MultiplayerExitScreen.repeatRecipientId, UiComponentNode.repeatRecipientName, param1 ^ -106)) {
            return false;
          }
          if (QuickChatPhraseDefinition.repeatMessageChannel != 2 &&
            var3 != 0) {
            return false;
          }
          if (LoginCredentialKind.a(param1 - 138)) {
            String var4 = (String) null;
            GrowableIntList.writeChatMessage(WidgetTextLayout.repeatMessageId, UiComponentNode.repeatRecipientName, (byte) -117, QuickChatPhraseDefinition.repeatMessageChannel, param2, (String) null);
          }
          return true;
        }
        return false;
    }

    final static void a(int param0) {
        TextHuffmanHelpers.accountContentLayer.transitionToContent((byte) 126, new AccountIntroductionPanel());
        int var1 = 48 % ((param0 - 32) / 62);
    }

    private BytePayloadSubmission() throws Throwable {
        throw new Error();
    }

    static {
        field_l = false;
    }
}
