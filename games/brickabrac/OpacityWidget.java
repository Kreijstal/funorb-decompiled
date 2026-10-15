/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpacityWidget extends SingleChildWidget {
    static String clientSession;
    static RgbSprite[] constructionCentreSprites;
    static int field_I;
    int opacity256;
    static int pendingMusicLoads;

    public OpacityWidget() {
        super(0, 0, 0, 0, (WidgetRenderer) null, (WidgetListener) null);
        this.opacity256 = 256;
    }

    final static void startLocalGame(String[] playerNames, int startingLevel, LevelSequence configuration, int localPlayerCount, boolean inputFlag, int obfuscationGuard) {
        int playerIndex = 0;
        GameplayScreen stackIn_10_0 = null;
        boolean stackIn_10_1 = false;
        boolean stackIn_11_2 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int localPlayerMask = 0;
        RuntimeException failure = null;
        int[] seedWords = null;
        int clientBranchFlag = 0;
        int[] seedStorage = null;
        int[] randomSeeds = null;
        int[] characterOrder = null;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          VerticalScrollbar.field_Ub = null;
          WidgetTextLayout.resultCounterTwo = 23;
          OptionsScreen.resultCounterOne = 57;
          DelegatingCanvas.field_c = 13;
          if (obfuscationGuard != -12665) {
            OpacityWidget.a(122);
          }
          QuickChatMenu.field_Wb = 3;
          DisplayModeInfo.field_e = 51550 + (ButtonWidgetRenderer.field_w.nextInt(102) << 16);
          FullscreenFailureDialog.field_kb = 72;
          BrowserResizeNotificationHelpers.field_a = 40;
          OutgoingPacketHelpers.field_g = 11;
          localPlayerMask = (1 << localPlayerCount) - 1;
          randomSeeds = new int[localPlayerCount];
          seedStorage = randomSeeds;
          seedWords = seedStorage;
          for (playerIndex = 0; localPlayerCount > playerIndex; playerIndex++) {
            seedWords[playerIndex] = ButtonWidgetRenderer.field_w.nextInt(97);
          }
          characterOrder = LobbyPlayer.createCharacterOrder(ButtonWidgetRenderer.field_w, false);
          IntArrayRequest.gameplayScreen = new GameplayScreen(playerNames, -1, localPlayerMask, configuration, randomSeeds, characterOrder);
          IntArrayRequest.gameplayScreen.setStartingLevel((byte) 119, startingLevel);
          IntArrayRequest.gameplayScreen.snapshotsReady = true;
          stackIn_10_0 = IntArrayRequest.gameplayScreen;
          stackIn_10_1 = IntArrayRequest.gameplayScreen.suppressResultSubmission;
          stackIn_11_2 = (QuickChatHelpDialog.loginPrivilegeByteOne >= 2) && (localPlayerCount == 1) && (GameConnectionShell.field_t);
          stackIn_10_0.suppressResultSubmission = stackIn_10_1 | stackIn_11_2;
          ScreenNavigationHelpers.requestScreen(inputFlag, 103, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_15_0 = failure;
          stackIn_15_1 = new StringBuilder().append("sk.E(");
          if (playerNames == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(startingLevel).append(',');
          if (configuration == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(localPlayerCount).append(',').append(inputFlag).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void finishScreenTransition(byte obfuscationGuard) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int[] var1Lifetime1;
        int var2Lifetime1;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          if (InvitationDialogHelpers.pendingScreen == null) {
            return;
          }
          if (AccountMessageDialog.currentScreen instanceof MenuScreen) {
            ((MenuScreen) (AccountMessageDialog.currentScreen)).onExit((byte) 79);
          }
          AccountMessageDialog.currentScreen = InvitationDialogHelpers.pendingScreen;
          InvitationDialogHelpers.pendingScreen = null;
          NodeDequeCursor.screenTransitionTick = 0;
          if (NewAchievementsScreen.discardGameplayOnTransition) {
            NewAchievementsScreen.discardGameplayOnTransition = false;
            IntArrayRequest.gameplayScreen = null;
          }
          if (obfuscationGuard > -112) {
            constructionCentreSprites = (RgbSprite[]) null;
          }
          if (EmailLoginCredentials.field_l) {
            VerticalScrollbar.field_Ub = null;
            AccountMessageDialog.queuedAchievementSubmissions.clear((byte) -121);
            var9 = SecondaryHashTable.earnedAchievementMask;
            var7 = var9;
            var4 = var7;
            var1 = var4;
            for (var2 = 0; var2 < 8; var2++) {
              var9[var2] = 0;
            }
            var10 = SpriteInputHelpers.pendingAchievementMask;
            var8 = var10;
            var5 = var8;
            var1Lifetime1 = var5;
            var6 = 0;
            var2Lifetime1 = var6;
            while (8 > var6) {
              var10[var6] = 0;
              var6++;
            }
            EmailLoginCredentials.field_l = false;
          }
          if (HalloweenBackground.field_y) {
            WhirlpoolHasher.a(7);
            ToggleButtonWidget.a((byte) 119);
            EmailConfirmationValidator.e(-94);
            HalloweenBackground.field_y = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1_ref), "sk.B(" + obfuscationGuard + ')');
        }
    }

    final void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        if (layer != 0) {
          return;
        }
        if (this.child == null) {
          return;
        }
        if (0 == this.opacity256) {
          return;
        }
        if (256 == this.opacity256) {
          this.child.drawLayer(parentY + this.y, parentX + this.x, layer, (byte) -11);
          return;
        }
        RgbSprite var6 = new RgbSprite(this.child.width, this.child.height);
        IndexedSpriteGeometry.pushSpriteRaster(-113, var6);
        this.child.drawLayer(0, 0, layer, obfuscationGuard);
        RasterStackHelpers.popRaster(obfuscationGuard ^ 119);
        var6.b(parentX + this.x, parentY + this.y, this.opacity256);
    }

    public static void a(int param0) {
        if (param0 != 51550) {
          clientSession = (String) null;
        }
        constructionCentreSprites = null;
        clientSession = null;
    }

    final static SoundPlayback queueSoundPlayback(byte obfuscationGuard, PcmStream stream) {
        SoundPlayback var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        SoundPlayback stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new SoundPlayback(stream, stream);
          var3 = 30 % ((obfuscationGuard - 58) / 43);
          QuickChatPhraseDefinition.soundPlaybacks.addLast(var2, (byte) 3);
          PasswordFieldRenderer.soundMixer.addStream(stream);
          stackIn_1_0 = var2;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("sk.A(").append(obfuscationGuard).append(',');
          if (stream == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    OpacityWidget(Widget child) {
        super(child.x, child.y, child.width, child.height, (WidgetRenderer) null, (WidgetListener) null);
        try {
          child.setBounds(this.height, 0, 0, (byte) -119, this.width);
          this.opacity256 = 256;
          this.child = child;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "sk.<init>(" + (child != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
