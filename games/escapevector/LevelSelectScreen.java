/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelSelectScreen {
    private int gameMode;
    static String field_c;
    private GameplaySession previewSession;
    static EmailValidationError field_g;
    private Sprite background;
    private LegacyButton[] footerButtons;
    private boolean previewDirty;
    private int backAction;
    static AudioOutput field_l;
    int accountStateIndex;
    private LegacyButton[] levelButtons;
    private int introductionAction;
    int tutorialAction;
    private AnimatedPathMarker[] pathMarkers;
    static String field_i;
    private int loginAction;
    int actionCount;
    private LegacyButton[] introTutorialButtons;
    private int selectedLevelIndex;

    private final String visibleLevelName(int levelIndex, int unlockedLevel, String name, boolean guard) {
        String stackIn_14_2 = null;
        try {
          if (guard) {
            this.update(-97);
          }
          int var5_int = GameProgressSupport.field_c.progressKind(this.gameMode, 0);
          if (var5_int == 0) {
            boolean stackIn_6_0 = !(levelIndex > unlockedLevel);
            boolean var6 = stackIn_6_0;
            if (!var6) {
              name = StripedProgressBar.field_M;
            }
          }
          String stackIn_10_0 = (String) (name);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var5;
          StringBuilder stackIn_13_1 = new StringBuilder().append("ig.E(").append(levelIndex).append(',').append(unlockedLevel).append(',');
          if (name == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(guard).append(')').toString());
        }
    }

    final static void writeScoreSubmission(int guard, int opcode, ScoreSubmission submission) {
        int var7 = EscapeVector.obfuscationControl;
        try {
          CipherPacketBuffer var8 = QuickChatDynamicCommand.outgoingPackets;
          CipherPacketBuffer var9 = var8;
          var9.writeCipheredOpcode(opcode, true);
          var9.position = var9.position + 1;
          int var4 = var9.position;
          var9.writeByte(1, -123);
          var9.writeShort(-113, submission.requestId);
          var9.writeShort(-107, submission.boardId);
          var9.writeShort(110, submission.boardIdComplement);
          var9.writeInt((byte) 124, submission.field_o);
          var9.writeInt((byte) 123, submission.field_m);
          var9.writeInt((byte) 127, submission.field_n);
          var9.writeInt((byte) 127, submission.field_g);
          var9.writeByte(submission.field_q.length, -123);
          int var5 = -65 / ((87 - guard) / 35);
          for (int var6 = 0; submission.field_q.length > var6; var6++) {
            var8.writeInt((byte) 123, submission.field_q[var6]);
          }
          var9.appendCrc32(var4, -39);
          var9.backpatchByteLength(-56, -var4 + var9.position);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ig.N(" + guard + ',' + opcode + ',' + (submission != null ? "{...}" : "null") + ')');
        }
    }

    private final void createFooterButtons(byte guard, int firstRevealTick, int revealInterval, BinaryBitmapFont font) {
        String[] var9 = null;
        int[] var10 = null;
        int[] var5 = null;
        try {
          int var6 = 0;
          int var7 = 442;
          int var8 = 640;
          if (guard != -12) {
            this.buildLayout((byte) 44);
          }
          if (AccountSessionSupport.isGuestSession(-117)) {
            var9 = new String[]{IntrusiveDeque.field_e, ModalPanel.field_O};
            var10 = new int[]{1, 2};
            var5 = new int[]{this.loginAction, this.backAction};
          } else {
            var5 = new int[]{this.backAction};
            var9 = new String[]{ModalPanel.field_O};
            var10 = new int[]{1};
          }
          int var11 = var9.length;
          int[] var16 = TextLayoutLine.createSpacedPositions(revealInterval, firstRevealTick, var11, (byte) -17);
          this.footerButtons = DynamicTerrainRenderer.createButtonRow(var8, var5, var7, var6, font, var9, var10, false, var16);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ig.S(" + guard + ',' + firstRevealTick + ',' + revealInterval + ',' + (font != null ? "{...}" : "null") + ')');
        }
    }

    private final void tickPreview(int guard) {
        if (this.previewSession == null) {
          return;
        }
        Minimap var2 = this.previewSession.minimap;
        if (var2 != null) {
          var2.animationTick = var2.animationTick + 1;
        }
        if (guard != -98) {
          LegacyButton var3 = (LegacyButton) null;
          this.playButtonSound((PcmSample) null, 19, (LegacyButton) null, 55, 2);
        }
        if (this.selectedLevelIndex == this.previewSession.levelIndex) {
          return;
        }
        this.previewDirty = true;
    }

    private final void createIntroTutorialButtons(int firstRevealTick, int guard, BinaryBitmapFont font, int revealInterval) {
        String stackIn_6_2 = null;
        try {
          int[] var13 = new int[]{this.introductionAction, this.tutorialAction};
          String[] var6 = new String[]{TickClock.field_b, SavedDataRequestSupport.playTutorialLabel};
          int[] var7 = new int[]{2, 3};
          int var8 = 3;
          int var9 = 89;
          int var10 = 402;
          int var11 = var6.length;
          int[] var17 = TextLayoutLine.createSpacedPositions(revealInterval, firstRevealTick, var11, (byte) -17);
          this.introTutorialButtons = DynamicTerrainRenderer.createButtonRow(var10, var13, var9, var8, font, var6, var7, false, var17);
          if (guard != -9079) {
            this.introTutorialButtons = (LegacyButton[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_5_0 = var5;
          StringBuilder stackIn_5_1 = new StringBuilder().append("ig.FA(").append(firstRevealTick).append(',').append(guard).append(',');
          if (font == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(revealInterval).append(')').toString());
        }
    }

    private final void playButtonSound(PcmSample sample, int positionDivisor, LegacyButton button, int volume, int ratePercent) {
        try {
          int var6_int = button.width / positionDivisor + button.y;
          int var7 = var6_int * 16384 / 640;
          ObjectSpriteSet.field_e.playSampleWithPan(sample, ratePercent, volume, var7);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ig.G(" + (sample != null ? "{...}" : "null") + ',' + positionDivisor + ',' + (button != null ? "{...}" : "null") + ',' + volume + ',' + ratePercent + ')');
        }
    }

    private final boolean handleActivation(boolean pointerDriven, int guard) {
        if (guard > -50) {
          this.introTutorialButtons = (LegacyButton[]) null;
        }
        this.playSelectionSounds(6620);
        if (!HighscorePlayerRecord.field_d.isInitialActivation((byte) -18)) {
          return false;
        }
        int var3 = HighscorePlayerRecord.field_d.selectedIndex;
        int var4 = SpriteFactorySupport.levelCount(false, this.gameMode);
        if (var3 >= 0 &&
          var4 > var3) {
          int var5 = GameProgressSupport.field_c.progressKind(this.gameMode, 0);
          if (var5 == 0) {
            int var6 = GameProgressSupport.field_c.unlockedLevelIndex(29386, this.gameMode);
            if (!this.isLevelAccessible(var6, var3, true)) {
              return false;
            }
          }
          AlternateUsernameCredentials.field_q = null;
          IntValueNode.field_i = null;
          SelfDestructEffects.field_q = -1;
          int var6Lifetime1 = var3;
          IntValueNode.startSelectedLevel(this.gameMode, var6Lifetime1, 89);
          return true;
        }
        if (this.tutorialAction == var3) {
          IntValueNode.field_i = null;
          AlternateUsernameCredentials.field_q = null;
          SelfDestructEffects.field_q = -1;
          IntValueNode.startSelectedLevel(this.gameMode, -1, 101);
          return true;
        }
        if (var3 == this.loginAction &&
          AccountSessionSupport.isGuestSession(-107)) {
          GuestLoginSupport.beginAccountLogin(true);
          LoginHandshakeSupport.field_d = 0;
          ChatMessage.clearFrameOffsets((byte) -90);
          return true;
        }
        if (var3 == this.backAction) {
          SelfDestructEffects.field_q = -1;
          GameplaySession.openSessionScreen(pointerDriven, 2560);
          return true;
        }
        if (this.introductionAction != var3) {
          return false;
        }
        LevelObject.enqueueCampaignIntroduction(this.gameMode, (byte) -128);
        LoginHandshakeSupport.field_d = 0;
        LaserGateSpan.field_k = 0;
        GameplaySession.resetSessionMenuState((byte) 30);
        return true;
    }

    private final void drawButtons(LegacyButton[] buttons, int guard) {
        String stackIn_14_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          int var3_int = -122 / ((guard + 21) / 52);
          if (buttons == null) {
            return;
          }
          int var4 = HighscorePlayerRecord.field_d.selectedIndex;
          LegacyButton[] var5 = buttons;
          for (int var6 = 0; var5.length > var6; var6++) {
            LegacyButton var7 = var5[var6];
            int var8 = var7.actionId;
            boolean stackIn_9_0 = !(var8 != var4);
            boolean var9 = stackIn_9_0;
            var7.draw(-16383, (var9));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3;
          StringBuilder stackIn_13_1 = new StringBuilder().append("ig.AA(");
          if (buttons == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void captureSelectedLevel(byte guard) {
        MenuInputState var2 = HighscorePlayerRecord.field_d;
        if (var2 == null) {
          return;
        }
        int var3 = var2.selectedIndex;
        if (guard != 86) {
          this.captureSelectedLevel((byte) 3);
        }
        int var4 = SpriteFactorySupport.levelCount(false, this.gameMode);
        if (var3 < 0) {
          return;
        }
        if (var4 <= var3) {
          return;
        }
        this.selectedLevelIndex = var3;
    }

    private final Sprite completionSprite(byte guard, boolean accessible) {
        if (guard >= -16) {
          this.drawLevelButtons((byte) 50);
        }
        int var3 = GameProgressSupport.field_c.progressKind(this.gameMode, 0);
        if (var3 == 0) {
          return null;
        }
        if (var3 != 1) {
          return null;
        }
        if (SavedCompletionFlags.field_f == null) {
          return null;
        }
        if (accessible) {
          return SavedCompletionFlags.field_f[1];
        }
        return SavedCompletionFlags.field_f[0];
    }

    private final void updatePreviewLevel(int guard) {
        if (this.previewSession == null) {
          return;
        }
        if (guard != 1) {
          this.background = (Sprite) null;
        }
        if (this.previewDirty) {
          this.previewDirty = false;
          this.previewSession.selectLevel(this.selectedLevelIndex, 110);
          this.configurePreviewMinimap(true);
          SpriteOffset.resetFrameTiming((byte) 82);
        }
    }

    private final void drawPreview(int guard) {
        this.updatePreviewLevel(guard + 1);
        if (null == this.previewSession) {
          return;
        }
        Minimap var17 = this.previewSession.minimap;
        if (var17 == null) {
          return;
        }
        int var3 = 640;
        int var4 = 480;
        int var5 = 3;
        int var6 = 79;
        int var7 = 402;
        int var8 = 349;
        int var9 = this.previewSession.tilesWide * var17.pixelsPerTile;
        int var10 = this.previewSession.tilesHigh * var17.pixelsPerTile;
        int var11 = (-var9 + var3) / 2;
        int var12 = (-var10 + var4) / 2;
        int var13 = (var7 - var9) / 2;
        int var14 = (var8 - var10) / 2;
        int var15 = -var11 + (var5 + var13);
        int var16 = -var12 + var14 + var6;
        var17.renderView(var16, false, var15, guard);
    }

    private final void assignActionCodes(int guard) {
        boolean var2 = (this.gameMode == 3);
        int var3 = SpriteFactorySupport.levelCount(false, this.gameMode);
        this.actionCount = var3;
        if (!var2) {
          int fieldTemp$0 = this.actionCount;
          this.actionCount = this.actionCount + 1;
          this.tutorialAction = fieldTemp$0;
        }
        if (!var2) {
          int fieldTemp$1 = this.actionCount;
          this.actionCount = this.actionCount + 1;
          this.introductionAction = fieldTemp$1;
        }
        if (AccountSessionSupport.isGuestSession(-118)) {
          int fieldTemp$2 = this.actionCount;
          this.actionCount = this.actionCount + 1;
          this.loginAction = fieldTemp$2;
        }
        if (guard != -30234) {
          LegacyButton[] var4 = (LegacyButton[]) null;
          this.drawButtons((LegacyButton[]) null, 116);
        }
        int fieldTemp$3 = this.actionCount;
        this.actionCount = this.actionCount + 1;
        this.backAction = fieldTemp$3;
    }

    private final void drawLevelButtons(byte guard) {
        int var22 = EscapeVector.obfuscationControl;
        int var2 = 12;
        int var3 = 12;
        LegacyButton var23 = this.levelButtons[0];
        LegacyButton var19 = var23;
        var19 = var23;
        int var5 = -var2 + var23.x;
        int var6 = var23.x + var23.width + (var2 - 1);
        int var7 = -var3 + var23.y;
        LegacyButton var24 = this.levelButtons[-1 + this.levelButtons.length];
        int var8 = var3 + var24.height + var24.y;
        int var9 = 1;
        int var10 = 50;
        int var11 = LoginHandshakeSupport.field_d;
        int var12 = var11 >= var10 ? 0 : -var11 + var10;
        int var13 = 3170352;
        int var14 = 6340704;
        int var15 = -32 / ((12 - guard) / 63);
        AccountNoticeKind.drawAnimatedPanelFrame(var12, var5, var6, var8, true, 29788, false, var14, var13, var9, var7, true);
        int var16 = HighscorePlayerRecord.field_d.selectedIndex;
        LegacyButton[] var17 = this.levelButtons;
        for (int var18 = 0; var17.length > var18; var18++) {
          var19 = var17[var18];
          int var20 = var19.actionId;
          if (var20 < 0) {
            var20 = this.tutorialAction;
          }
          boolean var21 = (var16 == var20);
          var19.draw(-16383, (var21));
        }
    }

    private final int hitButtons(byte guard, int x, LegacyButton[] buttons, int y) {
        LegacyButton var7 = null;
        String stackIn_14_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          LegacyButton[] var9 = buttons;
          LegacyButton[] var5 = var9;
          if (guard != -43) {
            this.hitTest(42, 56, -95);
          }
          int var6 = 0;
          while (true) {
            if (var9.length <= var6) {
              int stackIn_10_0 = -1;
              return stackIn_10_0;
            }
            var7 = var9[var6];
            if (!var7.hitTest((byte) 65, x, y)) {
              var6++;
              continue;
            }
            break;
          }
          int stackIn_7_0 = var7.actionId;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var5_ref;
          StringBuilder stackIn_13_1 = new StringBuilder().append("ig.BA(").append(guard).append(',').append(x).append(',');
          if (buttons == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(y).append(')').toString());
        }
    }

    private final boolean isLevelAccessible(int unlockedLevel, int levelIndex, boolean guard) {
        if (!guard) {
          return true;
        }
        int var4 = GameProgressSupport.field_c.progressKind(this.gameMode, 0);
        if (var4 == 0) {
          return levelIndex <= unlockedLevel ? true : false;
        }
        if (var4 != 1) {
          return false;
        }
        int var5 = GameProgressSupport.field_c.levelStatus(true, this.gameMode, levelIndex);
        return LevelAvailabilitySupport.isAccessible((byte) 121, var5);
    }

    private final void playButtonRevealSounds(int ratePercent, int guard, int volume, LegacyButton[] buttons) {
        String stackIn_14_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          if (buttons == null) {
            return;
          }
          if (guard != 9355) {
            return;
          }
          int var5_int = LoginHandshakeSupport.field_d;
          LegacyButton[] var6 = buttons;
          for (int var7 = 0; var7 < var6.length; var7++) {
            LegacyButton var8 = var6[var7];
            int var9 = var8.revealUntilTick;
            if (var5_int == var9) {
              this.playButtonSound(ModeProgressSupport.field_a, 2, var8, volume, ratePercent);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var5;
          StringBuilder stackIn_13_1 = new StringBuilder().append("ig.P(").append(ratePercent).append(',').append(guard).append(',').append(volume).append(',');
          if (buttons == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void playSelectionSounds(int guard) {
        Throwable decompiledCaughtException = null;
        int var11 = EscapeVector.obfuscationControl;
        if (guard != 6620) {
          LevelSelectScreen.releaseStatics(-11);
        }
        if (HighscorePlayerRecord.field_d.selectionChanged) {
          Object var2 = ObjectSpriteSet.field_e;
          synchronized (var2) {
            int var3 = 1536 * IterableNodeHashTable.field_c / 64;
            int var4 = 100;
            int var5 = HighscorePlayerRecord.field_d.selectedIndex;
            this.playSelectedButtonSound(this.levelButtons, var3, var4, 3);
            this.playSelectedButtonSound(this.footerButtons, var3, var4, 3);
            int var4Lifetime1 = 102;
            if (this.pathMarkers != null) {
              AnimatedPathMarker[] var6 = this.pathMarkers;
              for (int var7 = 0; var6.length > var7; var7++) {
                AnimatedPathMarker var8 = var6[var7];
                if (var8.markerIndex == var5) {
                  int var9 = var8.markerPosition.x * 16384 / 640;
                  ObjectSpriteSet.field_e.playSampleWithPan(ArchiveRequest.field_w, var4Lifetime1, var3, var9);
                }
              }
            }
            this.playSelectedButtonSound(this.introTutorialButtons, var3, var4Lifetime1, 3);
          }
        }
    }

    private final void initializeSimulatorPreview(int guard) {
        if (~this.gameMode != guard) {
          this.previewSession = null;
          return;
        }
        byte[][] var2 = UsernameCredentials.field_h[this.gameMode];
        this.previewSession = new GameplaySession(var2);
        this.previewSession.gameMode = this.gameMode;
        this.previewSession.selectLevel(this.selectedLevelIndex, -59);
        this.configurePreviewMinimap(true);
    }

    final int hitTest(int y, int guard, int x) {
        int var7 = EscapeVector.obfuscationControl;
        if (this.pathMarkers != null) {
          AnimatedPathMarker[] var8 = this.pathMarkers;
          AnimatedPathMarker[] var4_ref_qe__ = var8;
          for (int var5 = 0; var8.length > var5; var5++) {
            AnimatedPathMarker var6 = var8[var5];
            if (var6.hitMarker(y, x, guard ^ 12088)) {
              return var6.markerIndex;
            }
          }
        }
        if (guard != 12089) {
          this.accountStateIndex = 122;
        }
        int var4 = this.hitButtons((byte) -43, x, this.levelButtons, y);
        if (var4 >= 0) {
          return var4;
        }
        if (null != this.introTutorialButtons) {
          var4 = this.hitButtons((byte) -43, x, this.introTutorialButtons, y);
        }
        if (var4 >= 0) {
          return var4;
        }
        var4 = this.hitButtons((byte) -43, x, this.footerButtons, y);
        if (0 <= var4) {
          return var4;
        }
        return -1;
    }

    private final void drawPathMarkers(boolean guard, int selectedAction) {
        int var7 = EscapeVector.obfuscationControl;
        if (!guard) {
          return;
        }
        if (null == this.pathMarkers) {
          return;
        }
        AnimatedPathMarker[] var8 = this.pathMarkers;
        AnimatedPathMarker[] var3 = var8;
        for (int var4 = 0; var8.length > var4; var4++) {
          AnimatedPathMarker var5 = var8[var4];
          boolean var6 = (var5.markerIndex == selectedAction);
          var5.draw((var6), -1);
        }
    }

    private final void buildLayout(byte guard) {
        boolean var2 = (this.gameMode == 3);
        BinaryBitmapFont var3 = ByteStorage.gameFont;
        this.assignActionCodes(-30234);
        int var4 = GameProgressSupport.field_c.unlockedLevelIndex(29386, this.gameMode);
        if (!var2) {
          this.pathMarkers = AccountNoticeDialog.createPathMarkers(10, var4, this.gameMode);
        }
        int var5 = 10;
        this.createLevelButtons((byte) 51, var3, var5);
        int var6 = 3;
        if (!var2) {
          this.createIntroTutorialButtons(var6, -9079, var3, var5);
        }
        int var6Lifetime1 = 5;
        this.createFooterButtons((byte) -12, var6Lifetime1, var5, var3);
        IndexedSpriteState.setLegacyButtonColors(this.levelButtons, 0);
        if (!var2) {
          IndexedSpriteState.setLegacyButtonColors(this.introTutorialButtons, 0);
        }
        IndexedSpriteState.setLegacyButtonColors(this.footerButtons, 0);
        if (guard <= 8) {
          BinaryBitmapFont var7 = (BinaryBitmapFont) null;
          this.createLevelButtons((byte) -115, (BinaryBitmapFont) null, 37);
        }
    }

    final void draw(int guard) {
        SoftwareRasterizer.clearFramebuffer();
        SelfDestructEffects.drawMenuEdges(guard ^ 1);
        int var2 = LoginHandshakeSupport.field_d < 50 ? -LoginHandshakeSupport.field_d + 50 : 0;
        if (null != this.background) {
          this.background.drawOpaque(3, 79);
        }
        this.drawPreview(0);
        LoginCredentialType.drawInsetUnevenFrame(404, 3162160, guard ^ 115, 0, 6324320, 76, guard, var2, 430);
        int var3 = SpriteFactorySupport.levelCount(false, this.gameMode);
        int var4 = HighscorePlayerRecord.field_d.selectedIndex;
        boolean var5 = true;
        if (var4 >= 0 &&
          var3 > var4) {
          int var6 = GameProgressSupport.field_c.unlockedLevelIndex(guard + 29383, this.gameMode);
          var5 = (var4 <= var6);
        }
        this.drawButtons(this.introTutorialButtons, 104);
        this.drawButtons(this.footerButtons, guard - 85);
        this.drawLevelButtons((byte) 120);
        this.drawPathMarkers(true, var4);
        this.drawLockedNotice(var3, (byte) -59, (var5));
        MenuTitleRenderSupport.drawTitles(guard + 1);
    }

    private final void selectBackground(int guard) {
        this.background = null;
        if (guard != -32044) {
          return;
        }
        if (this.gameMode == 1) {
          this.background = DirectByteStorage.field_k;
        }
        if (this.gameMode == 0) {
          this.background = DirectByteStorage.field_k;
        }
        if (this.gameMode == 2) {
          this.background = AccountSessionSupport.field_c;
        }
    }

    final void update(int guard) {
        int var5 = EscapeVector.obfuscationControl;
        if (guard != 2525) {
          this.selectBackground(-66);
        }
        this.updateRevealEffects(0);
        MenuInputState var6 = HighscorePlayerRecord.field_d;
        int var3 = var6.selectedIndex;
        int var4 = SpriteFactorySupport.levelCount(false, this.gameMode);
        while (AccountRequestDialog.pollKeyEvent(-113)) {
          var6.handleKeyWithoutNavigation(100);
          if (PasswordValidator.field_n == 96 ||
            PasswordValidator.field_n == 98) {
            if (this.backAction == var3 &&
              this.loginAction >= 0) {
              var6.selectFromKeyboard(false, this.loginAction);
            } else if (var3 == this.backAction) {
              var6.selectFromKeyboard(false, var4 - 1);
            } else if (this.loginAction == var3) {
              var6.selectFromKeyboard(false, -1 + var4);
            } else if (var3 > 0 &&
              var3 < var4) {
              var6.selectFromKeyboard(false, -1 + var3);
            } else if (0 == var3 &&
              this.tutorialAction >= 0) {
              var6.selectFromKeyboard(false, this.tutorialAction);
            } else if (0 == var3 &&
              this.introductionAction >= 0) {
              var6.selectFromKeyboard(false, this.introductionAction);
            } else if (var3 == 0) {
              var6.selectFromKeyboard(false, this.backAction);
            } else if (var3 == this.tutorialAction &&
              this.introductionAction >= 0) {
              var6.selectFromKeyboard(false, this.introductionAction);
            } else if (this.tutorialAction == var3) {
              var6.selectFromKeyboard(false, this.backAction);
            } else if (var3 != this.introductionAction) {
              var6.selectFromKeyboard(false, LoginForm.initialLevelSelection(this.gameMode, (byte) 121));
            } else {
              var6.selectFromKeyboard(false, this.backAction);
            }
          }
          if (PasswordValidator.field_n == 97 ||
            PasswordValidator.field_n == 99) {
            if (this.tutorialAction == var3) {
              var6.selectFromKeyboard(false, 0);
            } else if (var3 >= 0 &&
              var3 < var4 - 1) {
              var6.selectFromKeyboard(false, var3 + 1);
            } else if (var4 - 1 == var3 &&
              this.loginAction >= 0) {
              var6.selectFromKeyboard(false, this.loginAction);
            } else if (var3 == var4 - 1) {
              var6.selectFromKeyboard(false, this.backAction);
            } else if (this.loginAction == var3) {
              var6.selectFromKeyboard(false, this.backAction);
            } else if (var3 == this.backAction &&
              this.introductionAction >= 0) {
              var6.selectFromKeyboard(false, this.introductionAction);
            } else if (var3 == this.backAction &&
              this.tutorialAction >= 0) {
              var6.selectFromKeyboard(false, this.tutorialAction);
            } else if (this.backAction == var3) {
              var6.selectFromKeyboard(false, 0);
            } else if (var3 == this.introductionAction &&
              this.tutorialAction >= 0) {
              var6.selectFromKeyboard(false, this.tutorialAction);
            } else if (this.introductionAction != var3) {
              var6.selectFromKeyboard(false, LoginForm.initialLevelSelection(this.gameMode, (byte) 121));
            } else {
              var6.selectFromKeyboard(false, 0);
            }
          }
          if (PasswordValidator.field_n == 13) {
            SelfDestructEffects.field_q = -1;
            GameplaySession.openSessionScreen(false, guard ^ 989);
            return;
          }
          if (this.handleActivation(false, -54)) {
            return;
          }
        }
        var6.updatePointer(this.hitTest(LoginDialog.field_ob, 12089, SessionCounterState.field_c), (byte) 126, this.hitTest(UiContainer.field_y, 12089, GzipDecoder.field_d));
        boolean discarded$0 = this.handleActivation(true, -89);
        this.captureSelectedLevel((byte) 86);
        this.tickPreview(guard ^ -2493);
    }

    private final void drawLockedNotice(int levelCount, byte guard, boolean accessible) {
        if (guard != -59) {
          this.updateRevealEffects(27);
        }
        Object var4 = null;
        if (!accessible) {
          String var6 = GameAppletShell.field_f;
          var4 = var6;
          if (AccountSessionSupport.isGuestSession(-97)) {
            var4 = var6 + "<br>" + AccountTermsPanel.field_O + " " + LoginCredentialType.field_c;
          }
        }
        if (var4 != null) {
          int var5 = 8 + ByteStorage.gameFont.paragraphHeight((String) (var4), 387, 20);
          SoftwareRasterizer.drawHorizontalLine(7, 426 + (-var5 - 1), 393, 3162160);
          SoftwareRasterizer.fillRectangle(7, -var5 + 426, 393, var5, 0);
          ByteStorage.gameFont.drawParagraph((String) (var4), 10, 128, 387, 294, 6340704, -1, 1, 2, 20);
        }
    }

    private final void configurePreviewMinimap(boolean guard) {
        if (!guard) {
          return;
        }
        if (this.previewSession == null) {
          return;
        }
        Minimap var2 = this.previewSession.minimap;
        if (var2 == null) {
          return;
        }
        var2.animationTick = var2.animationTick + 1;
        if (!var2.isVisible((byte) -102)) {
          var2.toggleVisible((byte) -101);
        }
        var2.showFrame = false;
        var2.darkenBackground = false;
    }

    private final void createLevelButtons(byte guard, BinaryBitmapFont font, int revealInterval) {
        String stackIn_18_2 = null;
        int var27 = EscapeVector.obfuscationControl;
        try {
          int var4_int = 4;
          int var5 = 88;
          int var6 = 18;
          int var7 = 9;
          int var8 = 415;
          if (guard != 51) {
            return;
          }
          int var9 = 625;
          int var10 = -var8 + var9 + 1;
          int var11 = 30;
          int[] var12 = ValidationIndicator.field_E[this.gameMode];
          int var13 = var12.length;
          int var14 = SpriteFactorySupport.levelCount(false, this.gameMode);
          int var15 = LabeledField.field_M[this.gameMode];
          this.levelButtons = new LegacyButton[-var15 + var14];
          int var16 = GameProgressSupport.field_c.unlockedLevelIndex(29386, this.gameMode);
          int var17 = 0;
          int var18 = var15;
          while (var13 > var17) {
            int var19 = var12[var17];
            for (int var20 = 0; var19 > var20; var20++) {
              if (var18 < var14) {
                String var28 = TrackerMusicDefinition.levelDisplayName((byte) 127, this.gameMode, var18);
                String var29 = this.visibleLevelName(var18, var16, var28, false);
                boolean var22 = (this.isLevelAccessible(var16, var18, true));
                int var23 = var18;
                if (0 > var23) {
                  var23 = this.tutorialAction;
                }
                int var24 = 1 + var18;
                Sprite var25 = this.completionSprite((byte) -71, (var22));
                LegacyButton var26 = new LegacyButton(var4_int, var23, var24, var29, var11, var25, revealInterval, font);
                var26.setPosition((byte) -48, var8, var5);
                var26.setSize(var6, guard ^ 51, var10);
                this.levelButtons[var18 - var15] = var26;
                var5 = var5 + var6;
                var18++;
                continue;
              }
              break;
            }
            if (var14 <= var18) {
              return;
            }
            var5 = var5 + var7;
            var17++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var4;
          StringBuilder stackIn_17_1 = new StringBuilder().append("ig.W(").append(guard).append(',');
          if (font == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(revealInterval).append(')').toString());
        }
    }

    private final void updateRevealEffects(int guard) {
        int var11 = EscapeVector.obfuscationControl;
        int var2 = LoginHandshakeSupport.field_d;
        if (var2 == 0) {
          StringNode.playFrameAppearSound(8192, (byte) 51);
        }
        IntValueNode.field_j = true;
        if (guard != 0) {
          return;
        }
        int var3 = IterableNodeHashTable.field_c * 6144 / 64;
        int var4 = 100;
        this.playButtonRevealSounds(var4, guard + 9355, var3, this.introTutorialButtons);
        this.playButtonRevealSounds(var4, guard ^ 9355, var3, this.footerButtons);
        if (this.pathMarkers != null) {
          AnimatedPathMarker[] var5 = this.pathMarkers;
          for (int var6 = 0; var5.length > var6; var6++) {
            AnimatedPathMarker var7 = var5[var6];
            if (var7.startTick == var2) {
              PcmSample var8 = AccountOverlayController.field_b;
              int var9 = 16384 * var7.markerPosition.x / 640;
              PcmSampleStream var10 = PcmSampleStream.createAtRatePercentQ6(var8, var4, var3, var9);
              ValidatedTextWidget.field_K[var7.markerIndex] = var10;
            }
          }
        }
        SelfDestructEffects.field_s = true;
        if (1000 > LoginHandshakeSupport.field_d) {
          LoginHandshakeSupport.field_d = LoginHandshakeSupport.field_d + 1;
        }
    }

    private final void playSelectedButtonSound(LegacyButton[] buttons, int volume, int ratePercent, int guard) {
        String stackIn_19_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          if (buttons == null) {
            return;
          }
          int var5_int = HighscorePlayerRecord.field_d.selectedIndex;
          Object var6 = null;
          if (guard != 3) {
            this.configurePreviewMinimap(true);
          }
          LegacyButton[] var7 = buttons;
          for (int var8 = 0; var7.length > var8; var8++) {
            LegacyButton var9 = var7[var8];
            int var10 = var9.actionId;
            if (var5_int == var10) {
              var6 = var9;
            }
          }
          if (var6 == null) {
            return;
          }
          this.playButtonSound(ArchiveRequest.field_w, 2, (LegacyButton) (var6), volume, ratePercent);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var5;
          StringBuilder stackIn_18_1 = new StringBuilder().append("ig.L(");
          if (buttons == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(volume).append(',').append(ratePercent).append(',').append(guard).append(')').toString());
        }
    }

    LevelSelectScreen(int gameMode, int accountStateIndex) {
        this.backAction = -2;
        this.previewDirty = true;
        this.tutorialAction = -2;
        this.loginAction = -2;
        this.introductionAction = -2;
        this.selectedLevelIndex = 0;
        this.accountStateIndex = accountStateIndex;
        this.gameMode = gameMode;
        this.buildLayout((byte) 62);
        this.selectBackground(-32044);
        this.initializeSimulatorPreview(-4);
    }

    public static void releaseStatics(int guard) {
        field_l = null;
        field_g = null;
        field_i = null;
        if (guard > -33) {
          LevelSelectScreen.releaseStatics(-58);
        }
        field_c = null;
    }

    static {
        field_c = "Skip";
        field_i = "Player names can be up to 12 letters, numbers and underscores";
        field_g = new EmailValidationError();
    }
}
