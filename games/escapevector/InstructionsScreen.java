/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InstructionsScreen {
    static String[] simulatorBackgroundNames;
    private boolean showPickups;
    private int padding;
    private int previousPageCode;
    private boolean showObjective;
    private PairedTextColumns controlLegend;
    private int contentHeight;
    private boolean members;
    private LegacyTextBlock retributionText;
    private int resumeCode;
    private int[] actionCodes;
    private int contentWidth;
    private LegacyTextBlock retrievalText;
    private LegacyTextBlock simulatorText;
    private int nextPageCode;
    private boolean inSession;
    static AccountFormStage field_q;
    private boolean showGameModes;
    private int centerY;
    private SpriteLabelColumns pickupLegend;
    private MenuInputState input;
    private AnimatedPanelFrame frame;
    private boolean showControls;
    private LegacyButton exitButton;
    private int mainMenuCode;
    static int field_a;
    private LegacyButton[] pageButtons;
    private LegacyTextBlock objectiveText;
    private int currentPage;
    private int pageCount;

    private final void buildPickupLegend(byte guard) {
        SpriteStrip[] var2 = this.buildPickupSpriteStrips(false);
        String[] var3 = new String[]{QuitPageSupport.field_b, UiContainer.field_D, LevelAvailabilitySupport.field_a, MembershipPromotionSupport.field_a, ArchiveProvider.field_c, ModeProgress.field_l, NodeHashTableIterator.field_a};
        this.prefixBullets(var3, (byte) -10);
        BinaryBitmapFont var4 = ByteStorage.gameFont;
        int var5 = 16777215;
        int var6 = this.headingColor((byte) 49);
        this.pickupLegend = new SpriteLabelColumns(IterableDualLinkDeque.field_a, var2, var3);
        if (guard <= 111) {
          return;
        }
        this.pickupLegend.configure(var6, var4, var5, 117);
    }

    private final void buildObjectiveText(int guard) {
        String var2 = this.objectiveHeading((byte) 114);
        String[] var3 = this.objectiveLines(27679);
        this.objectiveText = new LegacyTextBlock(var2, var3);
        if (guard > -63) {
          this.currentPage = -57;
        }
        this.configureTextBlock(this.objectiveText, 16777215);
    }

    final static int legacyMenuWidth(int guard) {
        if (guard != 0) {
          InstructionsScreen.releaseStatics(-11);
        }
        return ChatHistorySupport.field_a - TriangleMesh.field_x;
    }

    private final void measureContentWidth(byte guard) {
        int var2 = 107 % ((11 - guard) / 36);
        this.contentWidth = 0;
        this.contentWidth = MainMenuScreen.maxInt(this.controlLegend.contentWidth(true), this.contentWidth, 63);
        this.contentWidth = MainMenuScreen.maxInt(this.pickupLegend.contentWidth(true), this.contentWidth, 37);
        this.contentWidth = MainMenuScreen.maxInt(this.objectiveText.contentWidth(true), this.contentWidth, 54);
        this.contentWidth = MainMenuScreen.maxInt(this.retrievalText.contentWidth(true), this.contentWidth, 24);
        if (this.members) {
          this.contentWidth = MainMenuScreen.maxInt(this.retributionText.contentWidth(true), this.contentWidth, 89);
          this.contentWidth = MainMenuScreen.maxInt(this.simulatorText.contentWidth(true), this.contentWidth, 14);
        }
    }

    final static SpriteLoadTask[] createSpriteLoadTasks(int start, boolean[] waitForGroup, String[] groupNames, ResourceArchive archive, int format, int[] xteaKey, String[] fileNames) {
        String stackIn_9_2 = null;
        String stackIn_12_2 = null;
        String stackIn_15_2 = null;
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          SpriteLoadTask[] var11 = new SpriteLoadTask[fileNames.length];
          SpriteLoadTask[] var7 = var11;
          for (int var8 = start; fileNames.length > var8; var8++) {
            SpriteLoadTask var9 = new SpriteLoadTask(archive, fileNames[var8], groupNames[var8], format, waitForGroup[var8], xteaKey);
            var11[var8] = var9;
          }
          SpriteLoadTask[] stackIn_5_0 = var7;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7_ref = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var7_ref;
          StringBuilder stackIn_8_1 = new StringBuilder().append("dn.T(").append(start).append(',');
          if (waitForGroup == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          StringBuilder stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (groupNames == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (archive == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          StringBuilder stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(format).append(',');
          if (xteaKey == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (fileNames == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final int[] createPageButtons(int param0, boolean param1, int param2, int param3, int param4, BinaryBitmapFont param5) {
        String stackIn_17_2 = null;
        try {
          this.pageButtons = new LegacyButton[2];
          int var7_int = 3;
          int var8 = param2;
          if (!param1) {
            String[] discarded$0 = this.objectiveLines(104);
          }
          int var9 = param0 * var8;
          int var10 = var8 + 1;
          int var11 = 10;
          int var12 = param4;
          int var13 = 0;
          if (this.currentPage < -1 + this.pageCount) {
            var13++;
          }
          if (this.currentPage > 0) {
            var13++;
          }
          int[] var14 = new int[var13];
          int var15 = 0;
          if (this.currentPage > 0) {
            int var16 = var11 + param3;
            String var17 = DisplayModeInfo.field_b;
            int incrementValue$1 = var8;
            var8++;
            this.createPageButton(var17, var12, var10, var7_int, var9, var16, param5, this.previousPageCode, 0, 10551200, incrementValue$1);
            int incrementValue$2 = var15;
            var15++;
            var14[incrementValue$2] = this.previousPageCode;
          }
          if (this.currentPage < this.pageCount - 1) {
            int var16Lifetime1 = -var11 + this.contentWidth + param3;
            String var17Lifetime1 = ContentTransitionDialog.field_kb;
            int incrementValue$3 = var8;
            var8++;
            this.createPageButton(var17Lifetime1, var12, var10, var7_int, var9, var16Lifetime1, param5, this.nextPageCode, 1, 10551200, incrementValue$3);
            int incrementValue$4 = var15;
            var15++;
            var14[incrementValue$4] = this.nextPageCode;
          }
          int[] stackIn_13_0 = var14;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var7;
          StringBuilder stackIn_16_1 = new StringBuilder().append("dn.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final int highlightColor(byte guard) {
        if (guard != 70) {
          simulatorBackgroundNames = (String[]) null;
        }
        GameplaySession var2 = BoundedRandomAccessFile.activeSession;
        if (var2 != null) {
          return 12110032;
        }
        return 10551200;
    }

    private final void configureButtonPalette(int guard) {
        int[] var2;
        int[] var3;
        int[] var4;
        int var5;
        int var9 = EscapeVector.obfuscationControl;
        if (!this.inSession) {
          var2 = new int[]{3170352, 8421504, 8421504};
          var4 = new int[]{6340704, 16777215, 16777215};
          var3 = new int[]{6340704, 16777215, 16777215};
        } else {
          var5 = this.headingColor((byte) 104);
          int var6_int = this.highlightColor((byte) 70);
          var4 = new int[]{var5, var6_int, var6_int};
          var3 = new int[]{var5, var6_int, var6_int};
          var2 = new int[]{var5, var6_int, var6_int};
        }
        var5 = 75 / ((-81 - guard) / 43);
        if (null != this.pageButtons) {
          LegacyButton[] var6 = this.pageButtons;
          for (int var7 = 0; var7 < var6.length; var7++) {
            LegacyButton var8 = var6[var7];
            if (var8 != null) {
              var8.setColors(var3, var2, (byte) -128, var4);
            }
          }
        }
        if (null != this.exitButton) {
          LegacyButton stackIn_15_0 = this.exitButton;
          ((LegacyButton) (Object) stackIn_15_0).setColors(var3, var2, (byte) -125, var4);
        }
    }

    private final void close(boolean visible, int actionCode) {
        HighscorePlayerRecord.field_d = null;
        PauseMenuState.instructionsVisible = visible ? true : false;
        if (this.resumeCode == actionCode) {
          SessionMenuSupport.field_c.updatePointerSelection(false, 320);
        }
        if (this.mainMenuCode == actionCode) {
          AlternateUsernameCredentials.field_q.updatePointerSelection(-26480, false);
        }
        LoginHandshakeSupport.field_d = 0;
        ChatMessage.clearFrameOffsets((byte) -118);
    }

    private final int hitTest(int guard, int x, int y) {
        int var7 = EscapeVector.obfuscationControl;
        LegacyButton[] var4 = this.pageButtons;
        int var5 = 0;
        if (guard < 2) {
          InstructionsScreen.releaseStatics(-72);
        }
        while (var5 < var4.length) {
          LegacyButton var6 = var4[var5];
          if (var6 != null &&
            var6.hitTest((byte) 65, x, y)) {
            return var6.actionId;
          }
          var5++;
        }
        if (null != this.exitButton &&
          this.exitButton.hitTest((byte) 65, x, y)) {
          return this.exitButton.actionId;
        }
        return -1;
    }

    private final void updateRevealEffects(int guard) {
        int var2 = LoginHandshakeSupport.field_d;
        if (var2 == 0) {
          int var3_int = 8192;
          StringNode.playFrameAppearSound(var3_int, (byte) 51);
        }
        IntValueNode.field_j = true;
        if (null != BoundedRandomAccessFile.activeSession &&
          var2 >= 20) {
          IntValueNode.field_j = false;
        }
        if (guard == ~var2) {
          PcmSample var3 = ModeProgressSupport.field_a;
          int var4 = 100;
          int var5 = 6144 * IterableNodeHashTable.field_c / 64;
          int var6 = 8192;
          PcmStreamMixer var7 = ObjectSpriteSet.field_e;
          var7.playSampleWithPan(var3, var4, var5, var6);
        }
        if (var2 < 1000) {
          LoginHandshakeSupport.field_d = LoginHandshakeSupport.field_d + 1;
        }
    }

    private final void playSelectionSound(int volume) {
        PcmStreamMixer var2 = ObjectSpriteSet.field_e;
        PcmSample var3 = ArchiveRequest.field_w;
        int var4 = 100;
        int var5 = volume * IterableNodeHashTable.field_c / 64;
        int var6 = 8192;
        var2.playSampleWithPan(var3, var4, var5, var6);
    }

    private final Sprite[] spriteSetForMode(int guard, int mode) {
        if (EmailSyntaxValidator.a(mode, -2)) {
          Sprite[] var3 = AchievementThresholdRule.objectSprites;
          return this.powerupSprites(var3, guard + 4802);
        }
        if (!UiContainer.hasMembership((byte) -75)) {
          return null;
        }
        if (mode == 2) {
          Sprite[] var3Lifetime1 = AchievementThresholdRule.objectSprites;
          return this.powerupSprites(var3Lifetime1, -126);
        }
        if (mode == 3) {
          Sprite[] var3Lifetime2 = ArchiveProvider.field_b;
          return this.powerupSprites(var3Lifetime2, -113);
        }
        if (guard == -4898) {
          return null;
        }
        return (Sprite[]) null;
    }

    private final Sprite[] powerupSprites(Sprite[] sprites, int guard) {
        String stackIn_26_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (sprites == null) {
            return null;
          }
          int var3_int = 7;
          Sprite[] var4 = new Sprite[var3_int];
          int var5 = 0;
          if (guard > -88) {
            this.playSelectionSound(-88);
          }
          for (int var6 = 0; sprites.length > var6; var6++) {
            if (ResourceArchive.isPowerupType(var6, -64) ||
              1 == var6 ||
              5 == var6) {
              Sprite var7 = sprites[var6];
              if (var5 >= 0 &&
                var5 <= var3_int) {
                if (var7 == null) {
                  return null;
                }
                int incrementValue$1 = var5;
                var5++;
                var4[incrementValue$1] = var7;
              }
            }
          }
          Sprite[] stackIn_22_0 = var4;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_25_0 = var3;
          StringBuilder stackIn_25_1 = new StringBuilder().append("dn.HA(");
          if (sprites == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void measureContentHeight(int initialHeight) {
        this.contentHeight = initialHeight;
        this.contentHeight = this.contentHeight + this.controlLegend.height((byte) -90);
        this.contentHeight = MainMenuScreen.maxInt(this.pickupLegend.height((byte) -90), this.contentHeight, 76);
        this.contentHeight = MainMenuScreen.maxInt(this.objectiveText.height((byte) -90), this.contentHeight, 62);
        int var2 = this.retrievalText.height((byte) -90);
        var2 = var2 + this.retrievalText.fontHeight((byte) 124);
        if (this.members) {
          var2 = var2 + this.retributionText.height((byte) -90);
          var2 = var2 + this.retributionText.fontHeight((byte) 109);
          var2 = var2 + this.simulatorText.height((byte) -90);
        }
        this.contentHeight = MainMenuScreen.maxInt(var2, this.contentHeight, 81);
    }

    private final int selectedActionCode(int guard) {
        if (this.input == null) {
          return -1;
        }
        if (this.actionCodes == null) {
          return -1;
        }
        if (guard < 57) {
          field_q = (AccountFormStage) null;
        }
        int var2 = this.input.selectedIndex;
        if (0 > var2) {
          return -1;
        }
        if (var2 >= this.actionCodes.length) {
          return -1;
        }
        return this.actionCodes[var2];
    }

    private final int actionIndex(int actionCode, int guard) {
        int var4 = EscapeVector.obfuscationControl;
        if (this.actionCodes == null) {
          return -1;
        }
        if (this.actionCodes.length == 0) {
          return -1;
        }
        if (guard != -3844) {
          return -23;
        }
        for (int var3 = 0; var3 < this.actionCodes.length; var3++) {
          if (actionCode == this.actionCodes[var3]) {
            return var3;
          }
        }
        return -1;
    }

    final boolean update(int guard) {
        this.updateRevealEffects(guard);
        this.handlePointer(-22600);
        int var2 = this.handleActivation(false, 1) ? 1 : 0;
        boolean var2Lifetime1 = (this.handleKeyboard((byte) 67));
        if (var2Lifetime1) {
          return (var2Lifetime1);
        }
        return (var2Lifetime1);
    }

    private final void createPageButton(String param0, int param1, int param2, int param3, int param4, int param5, BinaryBitmapFont param6, int param7, int param8, int param9, int param10) {
        try {
          if (param9 != 10551200) {
            int discarded$0 = this.selectedActionCode(36);
          }
          LegacyButton var13 = new LegacyButton(param3, param10, param0, param4, param2, param6);
          LegacyButton var14 = var13;
          param1 = param1 - var14.height / 2;
          if (1 == param8) {
            param5 = param5 - var14.width;
          }
          var14.setPosition((byte) 125, param5, param1);
          this.pageButtons[param8] = var13;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "dn.AA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    private final void buildLayout(int guard, boolean pointerDriven) {
        int var3 = 640;
        int var4 = (-this.contentWidth + var3) / 2;
        int var5 = this.centerY - this.contentHeight / 2;
        int var6 = 0;
        int var7 = 10;
        BinaryBitmapFont var8 = ByteStorage.gameFont;
        int[] var16 = this.createPageButtons(var7, true, var6, var4, var5, var8);
        var6 = var6 + var16.length;
        int var10 = this.centerY + this.contentHeight / 2;
        int[] var17 = this.createExitButton(33, var6, var10, var8, var7);
        var6 = var6 + var17.length;
        this.actionCodes = new int[var6];
        int var12 = 0;
        var12 = this.appendActionCodes(var16, -3549, var12);
        int discarded$0 = this.appendActionCodes(var17, -3549, var12);
        int var13 = 21 / ((guard - 49) / 46);
        this.configureButtonPalette(105);
        this.initializeInput(pointerDriven, false);
    }

    private final void initializeInput(boolean pointerDriven, boolean guard) {
        this.input = new MenuInputState(this.actionCodes.length);
        int var3 = -1;
        if (!this.inSession) {
          var3 = this.actionIndex(this.mainMenuCode, -3844);
        } else {
          var3 = this.actionIndex(this.resumeCode, -3844);
        }
        int var4 = this.hitTest(104, GzipDecoder.field_d, UiContainer.field_y);
        this.input.initializeSelection(121, pointerDriven, var4, var3);
        if (guard) {
          SpriteStrip[] discarded$0 = this.buildPickupSpriteStrips(true);
        }
    }

    private final String[] objectiveLines(int guard) {
        String var3_ref;
        if (guard != 27679) {
          this.showObjective = false;
        }
        GameplaySession var5 = BoundedRandomAccessFile.activeSession;
        GameplaySession var6 = var5;
        if (var6 == null) {
          String[] var3 = new String[]{IntroAudioSupport.field_c, LoginCredentialType.field_e};
          return var3;
        }
        regionExit1: {
          String[] var3Lifetime1 = null;
          if (var6.isMissionComplete((byte) -18)) {
            var3_ref = GameModeSelectScreen.field_h;
          } else {
            if (!var6.shipDestroyed &&
              !var6.levelEnded) {
              if (var6.levelIndex < 0) {
                var3_ref = AccountRegistrationPanel.field_O;
              } else if (1 == var6.tetheredObjectType) {
                var3_ref = AccountRequestDialog.field_qb[var5.missionDialogueTier((byte) -84)];
              } else if (var6.cargoLost) {
                var3_ref = EmailAvailabilityRequest.field_f[var5.missionDialogueTier((byte) -84)];
              } else if (var6.objectiveType != 1) {
                var3_ref = LevelObject.field_q;
              } else {
                var3_ref = PairedTextColumns.field_r;
              }
              break regionExit1;
            }
            var3_ref = AccountTermsPanel.field_M;
          }
        }
        if (12 <= var6.levelIndex) {
          String[] var4 = new String[]{var3_ref, " ", WeightedLruCache.field_e};
          return var4;
        }
        String[] var4Lifetime1 = new String[]{var3_ref};
        return var4Lifetime1;
    }

    final void drawContents(byte guard) {
        int var7 = EscapeVector.obfuscationControl;
        this.drawBackdrop((byte) 117);
        int var2 = 0;
        LegacyButton[] var3_ref_dk__ = this.pageButtons;
        for (int var4 = 0; var3_ref_dk__.length > var4; var4++) {
          LegacyButton var5 = var3_ref_dk__[var4];
          if (null != var5) {
            boolean stackIn_8_0 = !(this.input.selectedIndex != var5.actionId);
            boolean var6 = stackIn_8_0;
            var5.draw(-16383, (var6));
            var2 = var5.y + var5.height / 2;
          }
        }
        if (this.showControls &&
          this.controlLegend != null) {
          var2 = var2 + this.drawTextBlock(var2, this.controlLegend, 0);
        }
        if (this.showPickups &&
          null != this.pickupLegend) {
          var2 = var2 + this.drawTextBlock(var2, this.pickupLegend, 0);
        }
        if (this.showObjective &&
          this.objectiveText != null) {
          var2 = var2 + this.drawTextBlock(var2, this.objectiveText, 0);
        }
        if (this.showGameModes) {
          var2 = var2 + this.drawTextBlock(var2, this.retrievalText, 0);
          if (this.members) {
            var2 = var2 + this.drawTextBlock(var2, this.retributionText, 0);
            var2 = var2 + this.drawTextBlock(var2, this.simulatorText, 0);
          }
        }
        if (null != this.exitButton) {
          boolean stackIn_31_0 = !(this.input.selectedIndex != this.exitButton.actionId);
          boolean var3 = stackIn_31_0;
          this.exitButton.draw(-16383, (var3));
          int var2Lifetime1 = this.exitButton.height + this.exitButton.y;
        }
        if (guard <= 104) {
          this.changePage((byte) 11, 95);
        }
    }

    private final int headingColor(byte guard) {
        if (guard < 14) {
          this.updateRevealEffects(-81);
        }
        GameplaySession var2 = BoundedRandomAccessFile.activeSession;
        if (var2 == null) {
          return 6340704;
        }
        return 7899280;
    }

    private final void drawPageNumber(byte guard) {
        BinaryBitmapFont var2 = ByteStorage.gameFont;
        if (guard != 88) {
          return;
        }
        int var3 = 16777215;
        int var4 = this.frame.width + this.frame.x - this.padding;
        int var5 = this.frame.y + (this.frame.height - this.padding - var2.maxDescent);
        String var6 = 1 + this.currentPage + "/" + this.pageCount;
        var2.drawRight(var6, var4, var5, var3, -1);
    }

    private final void buildModeInstructions(int guard) {
        String var2 = DirectByteStorage.field_o;
        String[] var3 = new String[]{IntroAudioSupport.field_c};
        this.retrievalText = new LegacyTextBlock(var2, var3);
        this.configureTextBlock(this.retrievalText, guard ^ 16762243);
        var3 = new String[]{LoginIdentifierSupport.field_g};
        var2 = PairedTextColumns.field_s;
        this.retributionText = new LegacyTextBlock(var2, var3);
        this.configureTextBlock(this.retributionText, 16777215);
        var2 = AlternateUsernameCredentials.field_p;
        var3 = new String[]{TriangleMesh.field_p + "<br>" + "<br>", LoginCredentialType.field_e};
        this.simulatorText = new LegacyTextBlock(var2, var3);
        if (guard != 14972) {
          return;
        }
        this.configureTextBlock(this.simulatorText, 16777215);
    }

    private final void configureTextBlock(LegacyTextBlock block, int color) {
        try {
          int var3_int = color;
          int var4 = this.headingColor((byte) 84);
          BinaryBitmapFont var5 = ByteStorage.gameFont;
          block.configure(var4, var5, var3_int, -87);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "dn.KA(" + (block != null ? "{...}" : "null") + ',' + color + ')');
        }
    }

    final static void setLoadingProgress(String message, int guard, float progress) {
        AlternateUsernameCredentials.field_t = progress;
        if (guard != 17637) {
          return;
        }
        try {
          DelegatingCanvas.field_e = message;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "dn.J(" + (message != null ? "{...}" : "null") + ',' + guard + ',' + progress + ')');
        }
    }

    private final String objectiveHeading(byte guard) {
        int var3 = -97 / ((-76 - guard) / 44);
        GameplaySession var2 = BoundedRandomAccessFile.activeSession;
        if (var2 == null) {
          return PointCloudEffect.field_v;
        }
        return GameProgressSupport.field_b;
    }

    private final SpriteStrip[] buildPickupSpriteStrips(boolean guard) {
        int var12 = EscapeVector.obfuscationControl;
        if (guard) {
          return (SpriteStrip[]) null;
        }
        Sprite[] var13 = this.spriteSetForMode(-4898, 1);
        Sprite[] var2 = var13;
        Sprite[] var3 = this.spriteSetForMode(-4898, 3);
        if (var2 == null) {
          return null;
        }
        if (var13.length == 0) {
          return null;
        }
        int var4 = var13.length;
        SpriteStrip[] var5 = new SpriteStrip[var4];
        int var6 = 8;
        for (int var7 = 0; var4 > var7; var7++) {
          Sprite var8 = var13[var7];
          Object var9 = null;
          if (var3 != null) {
            var9 = var3[var7];
          }
          Sprite[] var10 = new Sprite[]{var8, (Sprite) (var9)};
          SpriteStrip var11 = new SpriteStrip(var10, var6);
          var5[var7] = var11;
        }
        return var5;
    }

    private final void changePage(byte guard, int actionCode) {
        int var6 = EscapeVector.obfuscationControl;
        if (actionCode == this.nextPageCode) {
          this.currentPage = this.currentPage + 1;
          if (this.currentPage >= this.pageCount) {
            this.currentPage = 0;
          }
        }
        if (this.previousPageCode == actionCode) {
          this.currentPage = this.currentPage - 1;
          if (this.currentPage < 0) {
            this.currentPage = -1 + this.pageCount;
          }
        }
        boolean var3 = true;
        if (null != this.input) {
          boolean stackIn_14_0 = !(!this.input.pointerDriven);
          var3 = stackIn_14_0;
        }
        this.buildLayout(108, (var3));
        int var4 = this.actionIndex(actionCode, -3844);
        if (0 <= var4 &&
          null != this.input) {
          this.input.selectFromKeyboard(false, var4);
        }
        int var5 = 119 / ((48 - guard) / 61);
        if (0 == this.currentPage) {
          this.showGameModes = false;
          this.showObjective = false;
          this.showControls = true;
          this.showPickups = false;
        }
        if (this.currentPage == 1) {
          this.showObjective = false;
          this.showControls = false;
          this.showPickups = true;
          this.showGameModes = false;
        }
        if (this.currentPage == 2) {
          if (this.inSession) {
            this.showObjective = true;
          } else {
            this.showObjective = false;
          }
          if (this.inSession) {
            this.showGameModes = false;
          } else {
            this.showGameModes = true;
          }
          this.showPickups = false;
          this.showControls = false;
        }
    }

    private final void drawBackdrop(byte guard) {
        if (guard < 102) {
          InstructionsScreen.setLoadingProgress((String) null, 106, 1.9259626865386963f);
        }
        if (!this.inSession) {
          SoftwareRasterizer.clearFramebuffer();
          SelfDestructEffects.drawMenuEdges(2);
          this.frame.draw(105);
          MenuTitleRenderSupport.drawTitles(4);
        } else {
          int var2 = 640;
          int var3 = 480;
          int var4 = 64;
          SoftwareRasterizer.fillRectangleAlpha(0, 0, var2, var3, 0, var4);
          this.frame.draw(116);
        }
        this.drawPageNumber((byte) 88);
    }

    private final boolean handleKeyboard(byte guard) {
        int var5 = EscapeVector.obfuscationControl;
        int var3 = -33 / ((guard + 47) / 45);
        boolean var2 = false;
        while (AccountRequestDialog.pollKeyEvent(-73)) {
          this.input.handleKeyEvent((byte) 6);
          if (this.input.selectionChanged) {
            this.playSelectionSound(1536);
          }
          if (PasswordValidator.field_n == 13) {
            int var4 = this.mainMenuCode;
            if (this.inSession) {
              var4 = this.resumeCode;
            }
            this.input.selectedIndex = this.actionIndex(var4, -3844);
            boolean stackIn_11_0 = !(!this.handleActivation(true, 1));
            var2 = stackIn_11_0;
            if (var2) {
              return (var2);
            }
          }
          boolean stackIn_16_0 = !(!this.handleActivation(false, 1));
          var2 = stackIn_16_0;
          if (var2) {
            return (var2);
          }
        }
        return (var2);
    }

    private final boolean handleActivation(boolean force, int guard) {
        if (guard != 1) {
          this.buildLayout(54, true);
        }
        boolean var3 = false;
        if (!this.input.isInitialActivation((byte) -18) &&
          !force) {
          return (var3);
        }
        int var4 = this.selectedActionCode(guard + 73);
        if (var4 != this.mainMenuCode &&
          var4 != this.resumeCode) {
          if (var4 == this.previousPageCode) {
            this.changePage((byte) 115, var4);
          } else if (var4 == this.nextPageCode) {
            this.changePage((byte) 115, var4);
          }
          return (var3);
        }
        this.close(false, var4);
        boolean var3Lifetime1 = true;
        return (var3Lifetime1);
    }

    public static void releaseStatics(int guard) {
        if (guard != -1) {
          simulatorBackgroundNames = (String[]) null;
        }
        field_q = null;
        simulatorBackgroundNames = null;
    }

    private final int[] createExitButton(int param0, int param1, int param2, BinaryBitmapFont param3, int param4) {
        String stackIn_11_2 = null;
        try {
          GameplaySession var6 = BoundedRandomAccessFile.activeSession;
          int var7 = 3;
          int var8 = param1;
          int var9 = param4 * var8;
          if (param0 <= 6) {
            int[] stackIn_2_0 = (int[]) null;
            return stackIn_2_0;
          }
          int var10 = var8 + 1;
          int var11 = param2 + this.padding;
          if (var6 == null) {
            String var12 = GameKeyHandler.field_a;
            int[] stackIn_7_0 = this.createCenteredExitButton(var12, var11, var10, this.mainMenuCode, 10551200, var9, param3, var7, var8);
            return stackIn_7_0;
          }
          String var12Lifetime1 = WeightedLruCache.field_f;
          int[] stackIn_5_0 = this.createCenteredExitButton(var12Lifetime1, var11, var10, this.resumeCode, 10551200, var9, param3, var7, var8);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var6_ref;
          StringBuilder stackIn_10_1 = new StringBuilder().append("dn.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    private final int[] createCenteredExitButton(String param0, int param1, int param2, int param3, int param4, int param5, BinaryBitmapFont param6, int param7, int param8) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        try {
          this.exitButton = new LegacyButton(param7, param8, param0, param5, param2, param6);
          int var10_int = 640;
          int var11 = this.exitButton.width;
          int var12 = 480;
          int var13 = (-var11 + var10_int) / 2;
          int var14 = -this.exitButton.height + (var12 - param1);
          param1 = param1 + var14 / 2;
          this.exitButton.setPosition((byte) 114, var13, param1);
          if (param4 != 10551200) {
            this.input = (MenuInputState) null;
          }
          int[] var15 = new int[]{param3};
          int[] stackIn_3_0 = var15;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var10;
          StringBuilder stackIn_6_1 = new StringBuilder().append("dn.UA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final static String loginRequirementText(boolean achievements, int guard, boolean score, boolean progress) {
        int var4 = 0;
        if (achievements) {
          var4 += 4;
        }
        if (score) {
          var4 += 2;
        }
        if (guard != 4) {
          simulatorBackgroundNames = (String[]) null;
        }
        if (progress) {
          var4++;
        }
        return ChatMessageDecoder.field_c[var4];
    }

    private final void handlePointer(int guard) {
        int var2 = this.hitTest(103, GzipDecoder.field_d, UiContainer.field_y);
        if (guard != -22600) {
          this.exitButton = (LegacyButton) null;
        }
        int var3 = this.hitTest(guard + 22723, SessionCounterState.field_c, LoginDialog.field_ob);
        this.input.updatePointer(var3, (byte) 118, var2);
        if (this.input.selectionChanged) {
          this.playSelectionSound(1536);
        }
    }

    private final void prefixBullets(String[] lines, byte guard) {
        String stackIn_10_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          for (int var3_int = 0; var3_int < lines.length; var3_int++) {
            String var4 = lines[var3_int];
            lines[var3_int] = "- " + var4;
          }
          if (guard != -10) {
            this.buildObjectiveText(-17);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var3;
          StringBuilder stackIn_9_1 = new StringBuilder().append("dn.F(");
          if (lines == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(')').toString());
        }
    }

    private final int drawTextBlock(int y, LegacyTextBlock block, int guard) {
        String stackIn_10_2 = null;
        try {
          if (block == null) {
            int stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (guard != 0) {
            LegacyTextBlock var5 = (LegacyTextBlock) null;
            int discarded$1 = this.drawTextBlock(115, (LegacyTextBlock) null, 41);
          }
          block.draw(y, 3);
          int var4_int = block.height((byte) -90);
          var4_int = var4_int + block.fontHeight((byte) 99);
          int stackIn_6_0 = var4_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var4;
          StringBuilder stackIn_9_1 = new StringBuilder().append("dn.O(").append(y).append(',');
          if (block == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void buildFrame(byte guard) {
        int var2 = 640;
        if (guard != 87) {
          BinaryBitmapFont var15 = (BinaryBitmapFont) null;
          this.createPageButton((String) null, -33, 46, -86, -58, -49, (BinaryBitmapFont) null, -14, -115, 10, -82);
        }
        int var3 = -this.padding + (-this.contentWidth + var2) / 2;
        int var4 = 0;
        LegacyButton var5 = this.pageButtons[0];
        if (var5 == null) {
          var5 = this.pageButtons[1];
        }
        if (var5 != null) {
          var4 = var5.y - this.padding;
        }
        int var6 = this.contentWidth + this.padding * 2;
        int var7 = 0;
        if (var5 != null) {
          var7 = this.contentHeight + (var5.height / 2 + var5.y) + this.padding;
        }
        int var8 = var7 - var4;
        int var9 = 20;
        this.frame = new AnimatedPanelFrame(var3, var4, var6, var8, var9);
        int var10 = 3162160;
        if (this.inSession) {
          var10 = this.headingColor((byte) 76);
        }
        int var11 = 6324320;
        if (this.inSession) {
          var11 = this.highlightColor((byte) 70);
        }
        int var12 = 0;
        int var13 = 3160124;
        int var14 = 160;
        if (this.inSession) {
          this.frame.configureAccent(var10, var13, var12, var14, var11, (byte) -128);
        } else {
          this.frame.configureFrame(guard ^ 15176, var11, var12, var10);
        }
    }

    private final void buildTextContent(byte guard) {
        this.buildControlLegend(true);
        this.buildPickupLegend((byte) 124);
        this.buildObjectiveText(-109);
        this.buildModeInstructions(14972);
        this.measureContentWidth((byte) 79);
        if (guard != 19) {
          return;
        }
        this.measureContentHeight(0);
    }

    private final int appendActionCodes(int[] codes, int guard, int offset) {
        String stackIn_7_2 = null;
        try {
          ArraySupport.copy(codes, 0, this.actionCodes, offset, codes.length);
          if (guard != -3549) {
            this.currentPage = 116;
          }
          offset = offset + codes.length;
          int stackIn_3_0 = offset;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4;
          StringBuilder stackIn_6_1 = new StringBuilder().append("dn.R(");
          if (codes == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(',').append(offset).append(')').toString());
        }
    }

    private final void buildControlLegend(boolean guard) {
        String[] var8 = new String[]{AccountSessionStatusSupport.field_c, ProgressQuery.field_i, PacketBuffer.field_k, SpriteOffset.field_a, SpriteStrip.field_h, ArchiveKeyRequest.field_h, SlidingSpriteTransition.field_i};
        if (!guard) {
          return;
        }
        String[] var3 = new String[]{AchievementFlagSupport.field_b, QuickChatPhraseDefinition.field_w, LoginHandshakeSupport.field_c, PathPoint.field_e, MenuEdgeSegment.field_k, DynamicTerrainRenderer.field_t, IntroFinalFrameSupport.field_b};
        int var4 = 16777215;
        int var5 = this.highlightColor((byte) 70);
        int var6 = this.headingColor((byte) 115);
        BinaryBitmapFont var7 = ByteStorage.gameFont;
        this.controlLegend = new PairedTextColumns(RegistrationRequestDialog.field_yb, var8, var3);
        this.controlLegend.configureColumns(var6, var5, var4, (byte) -92, var7);
    }

    InstructionsScreen(boolean pointerDriven) {
        this.showObjective = false;
        this.nextPageCode = 1;
        this.showPickups = false;
        this.showGameModes = false;
        this.padding = 13;
        this.inSession = true;
        this.members = false;
        this.resumeCode = 3;
        this.previousPageCode = 0;
        this.centerY = 260;
        this.pageButtons = new LegacyButton[2];
        this.showControls = true;
        this.mainMenuCode = 2;
        this.pageCount = 3;
        this.currentPage = 0;
        GameplaySession var2 = BoundedRandomAccessFile.activeSession;
        if (var2 == null) {
          this.inSession = false;
        } else {
          this.inSession = true;
        }
        this.members = UiContainer.hasMembership((byte) 115);
        this.buildTextContent((byte) 19);
        this.buildLayout(-66, pointerDriven);
        this.buildFrame((byte) 87);
    }

    static {
        simulatorBackgroundNames = new String[]{"virtual_layer0.jpg", "virtual_layer1.jpg", "virtual_layer2.jpg", "virtual_layer3.jpg"};
    }
}
