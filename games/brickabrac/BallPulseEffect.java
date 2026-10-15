/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BallPulseEffect extends IntrusiveNode {
    static String field_i;
    private int y256;
    private int ageTicks;
    static RgbSprite arcticMidSprite;
    static RgbSprite parisCharacterSprite;
    static SoftwareFramebuffer framebuffer;
    static ResourceArchive specialMusicTrackArchive;
    static UiComponent field_n;
    private int x256;
    static String field_o;

    public static void a(int param0) {
        field_n = null;
        field_o = null;
        parisCharacterSprite = null;
        int var1 = 82 % ((param0 - 35) / 55);
        arcticMidSprite = null;
        field_i = null;
        specialMusicTrackArchive = null;
        framebuffer = null;
    }

    final boolean advance(byte obfuscationGuard) {
        int fieldTemp$0 = 0;
        if (obfuscationGuard >= 47) {
          fieldTemp$0 = this.ageTicks + 1;
          this.ageTicks = this.ageTicks + 1;
          return fieldTemp$0 < 40 ? true : false;
        }
        field_o = (String) null;
        int fieldTemp$1 = this.ageTicks + 1;
        this.ageTicks = this.ageTicks + 1;
        return fieldTemp$1 < 40 ? true : false;
    }

    final static void a(ResourceArchive param0, AudioMixer param1, int param2, int param3) {
        try {
          BoundedFile.field_i = FriendListUi.a((byte) -98) * param2 / 1000;
          if (param3 < 91) {
            AudioMixer var5 = (AudioMixer) null;
            BallPulseEffect.a((ResourceArchive) null, (AudioMixer) null, -127, -72);
          }
          DiagnosticTextLine.a(-2196, param0);
          GameRenderAudioHelpers.loadLogoMeshes((byte) -70, param0);
          AchievementSubmission.a(param0, 115);
          ScorePopup.initializeMeshLighting(-37);
          UsernameAvailabilityValidator.e(-41);
          MatchResultScreen.logoAnimationTicks = -BoundedFile.field_i + 0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "kc.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void draw(int scaleDivisor, int destinationX, int destinationY, boolean obfuscationGuard) {
        int var5 = (int)((Math.exp((double)((float)(-this.ageTicks) / 20.0f)) - Math.exp(-2.0)) * 200.0);
        int var6 = this.pulseSize((byte) 116);
        AchievementMaskRequest.a(destinationY + (this.y256 >> 8) / scaleDivisor, var6 / (scaleDivisor << 1), (-this.ageTicks + 40 << 8) / 40, var5, -94, var6 / scaleDivisor, (this.x256 >> 8) / scaleDivisor + destinationX);
        if (obfuscationGuard) {
          return;
        }
        this.advance((byte) -61);
    }

    final static RgbSprite[] a(int param0, boolean param1) {
        RgbSprite[] var3 = new RgbSprite[9];
        RgbSprite[] var2 = var3;
        if (!param1) {
          var3[4] = InvitationDialogHelpers.a(param0, 64, (byte) -6);
          return var2;
        }
        BallPulseEffect.$cfr$intArgs$a$a948187ac0af(-5, false);
        var3[4] = InvitationDialogHelpers.a(param0, 64, (byte) -6);
        return var2;
    }

    private final int pulseSize(byte obfuscationGuard) {
        int var2 = -80 / ((obfuscationGuard - 72) / 33);
        return this.ageTicks * (-this.ageTicks + 100) / 20 - 5;
    }

    final static ChatMessage readChatMessage(byte obfuscationGuard, boolean quickChat) {
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        BitPacketBuffer var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        BitPacketBuffer var8 = null;
        QuickChatPhraseDefinition var9 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        var8 = LogoRenderHelpers.incomingPackets;
        var2 = var8;
        var3 = var8.readUnsignedByte(obfuscationGuard + 188);
        TableQuickChatHelpers.receivedChatChannel = 127 & var3;
        if (obfuscationGuard != 67) {
          BallPulseEffect.a(73, true);
        }
        stackIn_5_0 = ((var3 & 128) != 0);
        IterableIntrusiveHashTable.receivedChatSystem = stackIn_5_0;
        LobbyUiHelpers.receivedChatBadge = var8.readUnsignedByte(255);
        BirthDateValidator.receivedChatSenderId = var8.readLong(-32768);
        if (TableQuickChatHelpers.receivedChatChannel == 2) {
          ChatMessage.receivedChatKeyHigh16 = var8.readUnsignedShort(65280);
          LevelCompleteScreen.receivedChatKeyLow24 = var8.readUnsignedMedium((byte) -34);
        } else {
          ChatMessage.receivedChatKeyHigh16 = 0;
          LevelCompleteScreen.receivedChatKeyLow24 = 0;
        }
        stackIn_11_0 = (var8.readUnsignedByte(255) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        HalloweenBackground.receivedChatDisplayName = var8.readCp1252String(-1);
        if (var4 != 0) {
          RankingSocketHelpers.receivedChatSenderName = var8.readCp1252String(-1);
        } else {
          RankingSocketHelpers.receivedChatSenderName = HalloweenBackground.receivedChatDisplayName;
        }
        if (1 != TableQuickChatHelpers.receivedChatChannel &&
          4 != TableQuickChatHelpers.receivedChatChannel) {
          MusicVoice.receivedChatContextId = 0;
          CacheEntry.receivedChatContextLabel = null;
        } else {
          MusicVoice.receivedChatContextId = var8.readUnsignedShort(obfuscationGuard ^ 65347);
          CacheEntry.receivedChatContextLabel = var8.readCp1252String(-1);
        }
        if (!quickChat) {
          ByteArrayPoolHelpers.receivedChatText = PopupWidgetLayer.readCompressedString(80, (byte) 76, var8);
          BoundedFile.receivedChatSuggestions = null;
          return new ChatMessage(quickChat);
        }
        var5 = var8.readUnsignedShort(65280);
        try {
          var9 = LobbyUiHelpers.quickChatPhrases.getDefinition(var5, true);
          ByteArrayPoolHelpers.receivedChatText = var9.getPreview(-3);
          if (RankingSocketHelpers.receivedChatSenderName.equals(LoadingProgressDialog.field_cb)) {
            stackIn_24_0 = null;
          } else {
            stackIn_24_0 = var9.linkedPhraseIds;
          }
          BoundedFile.receivedChatSuggestions = stackIn_24_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          AlignedIconLabel.a("CC1", (Throwable) ((Object) var6), obfuscationGuard ^ 16);
          BoundedFile.receivedChatSuggestions = null;
          ByteArrayPoolHelpers.receivedChatText = null;
          return new ChatMessage(quickChat);
        }
        return new ChatMessage(quickChat);
    }

    BallPulseEffect(int x256, int y256) {
        this.x256 = x256;
        this.y256 = y256;
    }

    static {
        field_i = "Waiting for music";
        field_o = "Average rating";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static ChatMessage $cfr$intArgs$a$a948187ac0af(int param0, boolean param1) {
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        BitPacketBuffer var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        BitPacketBuffer var8 = null;
        QuickChatPhraseDefinition var9 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        var8 = LogoRenderHelpers.incomingPackets;
        var2 = var8;
        var3 = var8.readUnsignedByte(param0 + 188);
        TableQuickChatHelpers.receivedChatChannel = 127 & var3;
        if (param0 != 67) {
          BallPulseEffect.a(73, true);
        }
        stackIn_5_0 = ((var3 & 128) != 0);
        IterableIntrusiveHashTable.receivedChatSystem = stackIn_5_0;
        LobbyUiHelpers.receivedChatBadge = var8.readUnsignedByte(255);
        BirthDateValidator.receivedChatSenderId = var8.readLong(-32768);
        if (TableQuickChatHelpers.receivedChatChannel == 2) {
          ChatMessage.receivedChatKeyHigh16 = var8.readUnsignedShort(65280);
          LevelCompleteScreen.receivedChatKeyLow24 = var8.readUnsignedMedium((byte) -34);
        } else {
          ChatMessage.receivedChatKeyHigh16 = 0;
          LevelCompleteScreen.receivedChatKeyLow24 = 0;
        }
        stackIn_11_0 = (var8.readUnsignedByte(255) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        HalloweenBackground.receivedChatDisplayName = var8.readCp1252String(-1);
        if (var4 != 0) {
          RankingSocketHelpers.receivedChatSenderName = var8.readCp1252String(-1);
        } else {
          RankingSocketHelpers.receivedChatSenderName = HalloweenBackground.receivedChatDisplayName;
        }
        if (1 != TableQuickChatHelpers.receivedChatChannel &&
          4 != TableQuickChatHelpers.receivedChatChannel) {
          MusicVoice.receivedChatContextId = 0;
          CacheEntry.receivedChatContextLabel = null;
        } else {
          MusicVoice.receivedChatContextId = var8.readUnsignedShort(param0 ^ 65347);
          CacheEntry.receivedChatContextLabel = var8.readCp1252String(-1);
        }
        if (!param1) {
          ByteArrayPoolHelpers.receivedChatText = PopupWidgetLayer.readCompressedString(80, (byte) 76, var8);
          BoundedFile.receivedChatSuggestions = null;
          return new ChatMessage(param1);
        }
        var5 = var8.readUnsignedShort(65280);
        try {
          var9 = LobbyUiHelpers.quickChatPhrases.getDefinition(var5, true);
          ByteArrayPoolHelpers.receivedChatText = var9.getPreview(-3);
          if (RankingSocketHelpers.receivedChatSenderName.equals(LoadingProgressDialog.field_cb)) {
            stackIn_24_0 = null;
          } else {
            stackIn_24_0 = var9.linkedPhraseIds;
          }
          BoundedFile.receivedChatSuggestions = stackIn_24_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          AlignedIconLabel.a("CC1", (Throwable) ((Object) var6), param0 ^ 16);
          BoundedFile.receivedChatSuggestions = null;
          ByteArrayPoolHelpers.receivedChatText = null;
          return new ChatMessage(param1);
        }
        return new ChatMessage(param1);
    }
}
