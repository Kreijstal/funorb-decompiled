/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementsScreen {
    static int field_w;
    private SlidingSpriteTransition gridTransition;
    private LegacyButton mainMenuButton;
    private int hoveredSlot;
    private int highscoresActionId;
    private int accountActionId;
    private int mainMenuActionId;
    static String field_k;
    private LegacyButton accountButton;
    private int pageCount;
    private int currentPage;
    private int[][] pageAchievementIds;
    private int[] actionOrder;
    private int previousPageActionId;
    private AnimatedPanelFrame gridPanel;
    private int[] pageSizes;
    private LegacyButton[][] gridButtons;
    private LegacyButton highscoresButton;
    private int nextPageActionId;
    private int achievementSetKind;
    private int[] earnedSnapshotIds;
    private int footerTop;
    private LegacyButton[] pageButtons;
    static String field_g;
    private int selectedSlot;
    private AnimatedPanelFrame detailPanel;

    private final void drawAccountNotice(boolean guard) {
        Object var2 = null;
        if (null != this.accountButton) {
          var2 = IntrusiveNode.field_a;
        }
        if (!guard) {
          this.update(48);
        }
        AchievementTracker var3 = TrackerMusicDefinition.field_f;
        if (var3.queryFailed) {
          var2 = ProgressRecord.field_l;
        }
        if (var2 == null) {
          return;
        }
        BinaryBitmapFont var4 = ByteStorage.gameFont;
        int var5 = var4.maxDescent + var4.maxAscent;
        int var6 = -var5 + this.footerTop - 3 + var4.maxAscent;
        int var7 = 320;
        int var8 = 10551200;
        var4.drawCentered((String) (var2), var7, var6, var8, -1);
    }

    private final void buildLayout(byte guard) {
        int var2 = 10;
        int var3 = var2;
        int var4 = 2;
        BinaryBitmapFont var5 = ByteStorage.gameFont;
        int var7 = 8 / ((18 - guard) / 59);
        int var6 = this.ensureGridButtons(-108);
        var6 = this.createAccountButton(var5, 117, var3, var4, this.footerTop, var6);
        var6 = this.createHighscoresButton(-1, var5, var6, var3, this.footerTop, var4);
        var6 = this.createMainMenuButton(440, var5, (byte) 57, var6, var4, var3);
        this.buildPanels(true);
        int discarded$0 = this.appendPageButtons(var6, 8);
        this.configureFooterPalettes((byte) 98);
        int var8 = this.actionCount((byte) -71);
        this.buildActionOrder(var8, 0);
    }

    private final void updateRevealEffects(boolean redraw) {
        if (mj.field_d == 0) {
          StringNode.playFrameAppearSound(8192, (byte) 51);
        }
        IntValueNode.field_j = redraw;
        this.playButtonRevealSound(64, this.accountButton);
        this.playButtonRevealSound(64, this.highscoresButton);
        this.playButtonRevealSound(64, this.mainMenuButton);
        if (1000 > mj.field_d) {
          mj.field_d = mj.field_d + 1;
        }
    }

    private final void buildPanels(boolean guard) {
        int var2 = 103;
        if (!guard) {
          this.mainMenuActionId = 102;
        }
        int var3 = 40;
        int var4 = 40;
        int var5 = 40;
        int var6 = 3170352;
        int var7 = 6340704;
        this.configureGridPanel(var2, var7, 640, 0, var4, var6, var5, var3);
        this.configureDetailPanel(var7, 1, 2, var6, var5);
    }

    private final boolean updateHoveredAchievement(byte guard) {
        int var2 = -93 % ((56 - guard) / 44);
        MenuInputState var3 = di.field_d;
        int var4 = var3.selectedIndex;
        if (var4 < 0 ||
          var4 >= this.pageAchievementIds[this.currentPage].length) {
          this.hoveredSlot = -1;
          return false;
        }
        this.hoveredSlot = var4;
        if (var3.isInitialActivation((byte) -18)) {
          this.selectedSlot = this.hoveredSlot;
          return true;
        }
        return false;
    }

    private final boolean handlePageAction(int guard, int actionId) {
        if (actionId < 0) {
          return false;
        }
        if (actionId == this.previousPageActionId) {
          int var3 = -1 + this.currentPage;
          if (0 > var3) {
            var3 = this.pageCount - 1;
          }
          this.setPage(var3, (byte) -94);
          return true;
        }
        if (guard > -98) {
          this.achievementSetKind = -25;
        }
        if (this.nextPageActionId != actionId) {
          return false;
        }
        int var3Lifetime1 = 1 + this.currentPage;
        if (this.pageCount <= var3Lifetime1) {
          var3Lifetime1 = 0;
        }
        this.setPage(var3Lifetime1, (byte) 110);
        return true;
    }

    private final void drawAchievementTitle(int divisor, Sprite icon) {
        if (icon == null) {
          return;
        }
        int var3_int = this.selectedAchievementId(true);
        if (var3_int < 0) {
          return;
        }
        try {
          BinaryBitmapFont var4 = ByteStorage.gameFont;
          int var5 = var4.maxAscent + var4.maxDescent;
          String var6 = CachedArchiveProvider.field_r[var3_int];
          int var7 = ((this.detailPanel.height - icon.fullHeight) / divisor - var5) / 3;
          int var8 = var7 + this.detailPanel.y + var4.maxAscent;
          int var9 = 320;
          MatchingTextValidator.a(var8, var6, 16777215, -110, var9);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ta.D(" + divisor + ',' + (icon != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean handleActivation(byte guard, boolean pointerDriven, boolean activate) {
        boolean var4 = false;
        if (this.updateHoveredAchievement((byte) -16)) {
          return (var4);
        }
        if (activate) {
          int var6 = this.selectedActionId(-8477);
          if (0 > var6) {
            return (var4);
          }
          if (this.handlePageAction(-124, var6)) {
            return (var4);
          }
          if (this.accountActionId == var6) {
            GuestLoginSupport.beginAccountLogin(true);
          }
          if (this.highscoresActionId == var6) {
            kh.showHighscoresScreen(MenuTitleSupport.isPointerDriven((byte) -116), -1230, true);
          }
          if (this.mainMenuActionId == var6) {
            AlternateUsernameCredentials.field_q.updatePointerSelection(-26480, pointerDriven);
            di.field_d = null;
          }
          e.field_a = false;
          TrackerMusicDefinition.field_f.clearSessionAchievements(true);
          mj.field_d = 0;
          ChatMessage.clearFrameOffsets((byte) -71);
          var4 = true;
          return (var4);
        }
        if (guard != -91) {
          this.highscoresButton = (LegacyButton) null;
        }
        return (var4);
    }

    final static void requestGuestEntry(int guard) {
        if (guard != 2) {
          AchievementsScreen.releaseStatics(-84);
        }
        WhirlpoolHasher.a(4, 43);
    }

    private final int[] layoutRowCenters(byte guard, int startY, int spacing, int rowCount) {
        int var8 = EscapeVector.obfuscationControl;
        if (rowCount == 1) {
          startY = startY + spacing / 2;
        }
        int[] var5 = new int[rowCount];
        int var6 = 0;
        int var7 = startY;
        if (guard >= -93) {
          this.gridPanel = (AnimatedPanelFrame) null;
        }
        while (var6 < rowCount) {
          var5[var6] = var7;
          var6++;
          var7 = var7 + spacing;
        }
        return var5;
    }

    private final int rewardValueColumnX(int left, int guard, BinaryBitmapFont font, int width) {
        String stackIn_17_2 = null;
        try {
          int var5_int = this.selectedAchievementId(true);
          if (0 > var5_int) {
            int stackIn_3_0 = width / 2 + left;
            return stackIn_3_0;
          }
          int var6 = font.stringWidth(GameProgressTracker.field_a + " ");
          int var7 = font.stringWidth("" + ProxySocketConnector.achievementOrbPoints[var5_int]);
          int var8 = var6 + var7;
          int var9 = font.stringWidth(ResizableModalPanel.field_T + " ");
          int var10 = font.stringWidth("" + ProxySocketConnector.achievementOrbCoins[var5_int]);
          int var11 = var10 + var9;
          int stackIn_7_0 = (var11 > var8) ? var11 : var8;
          int var12 = stackIn_7_0;
          boolean var13 = false;
          int var14 = (-var12 + width) / 2 + left;
          int stackIn_10_0 = ((!(var13))) ? var6 : var9;
          int var15 = stackIn_10_0;
          if (guard != 15930) {
            this.pageAchievementIds = (int[][]) null;
          }
          int var16 = var15 + var14;
          int stackIn_13_0 = var16;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var5;
          StringBuilder stackIn_16_1 = new StringBuilder().append("ta.Q(").append(left).append(',').append(guard).append(',');
          if (font == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(width).append(')').toString());
        }
    }

    private final void configureFooterPalettes(byte guard) {
        int[] var6 = new int[]{3170352, 8421504, 8421504};
        int[] var3 = new int[]{6340704, 16777215, 16777215};
        int var5 = -39 % ((-64 - guard) / 32);
        int[] var4 = new int[]{6340704, 16777215, 16777215};
        if (null != this.accountButton) {
          this.accountButton.setColors(var3, var6, (byte) -123, var4);
        }
        if (this.highscoresButton != null) {
          this.highscoresButton.setColors(var3, var6, (byte) -126, var4);
        }
        if (this.mainMenuButton != null) {
          this.mainMenuButton.setColors(var3, var6, (byte) -126, var4);
        }
    }

    private final int ensureGridButtons(int guard) {
        int var24 = EscapeVector.obfuscationControl;
        if (this.gridButtons != null) {
          return this.pageSizes[this.currentPage];
        }
        int var2 = 1;
        int var3 = 103;
        int var4 = 40;
        int var5 = 40;
        if (guard > -66) {
          return -63;
        }
        int[] var6 = new int[]{36, 40};
        this.partitionAchievementIds((byte) -105);
        int[] var7 = new int[]{36, 40};
        this.gridButtons = new LegacyButton[this.pageCount][];
        for (int var8 = 0; this.pageCount > var8; var8++) {
          int var9 = this.pageSizes[var8];
          int var10 = this.rowsPerPage((byte) 89, var9);
          int[] var37 = this.splitRowSizes(22387, var10, var9);
          int[] var38 = this.scaleCounts(var37, (byte) 100, var4);
          int[] var39 = this.centeredXs(var38, (byte) -115);
          int[] var40 = this.layoutRowCenters((byte) -99, var3, var5, var10);
          Sprite[] var15 = this.iconsForPage(var8, (byte) -116);
          LegacyButton[] array$0 = new LegacyButton[var9];
          this.gridButtons[var8] = array$0;
          for (int var16 = 0; var10 > var16; var16++) {
            int var17 = var37[var16];
            for (int var18 = 0; var18 < var17; var18++) {
              int var19 = this.prefixOffset(var18, var37, 6340704, var16);
              Sprite var20 = var15[var19];
              int var21 = var18 * var4 + var39[var16];
              int var22 = var40[var16];
              LegacyButton var23 = new LegacyButton(var2, var19, var20, var6, var7);
              var23.setSize(var5, 0, var4);
              var23.setPosition((byte) 22, var21, var22);
              this.gridButtons[var8][var19] = var23;
            }
          }
        }
        return this.pageSizes[this.currentPage];
    }

    private final void drawGridPanel(int guard) {
        this.gridPanel.draw(117);
        if (guard != 16317) {
          this.currentPage = -83;
        }
        int var2 = di.field_d.selectedIndex;
        if (!this.gridTransition.isComplete((byte) -7)) {
          this.gridTransition.draw(256);
        } else {
          nm.a((byte) -77, var2, this.gridButtons[this.currentPage]);
        }
        if (null != this.pageButtons) {
          nm.a((byte) -115, var2, this.pageButtons);
        }
    }

    final int hitTest(int guard, int x, int y) {
        int var4 = DebouncedValidator.a(y, 31, this.gridButtons[this.currentPage], x);
        if (var4 >= 0) {
          return var4;
        }
        if (this.accountButton != null &&
          this.accountButton.hitTest((byte) 65, x, y)) {
          return this.accountButton.actionId;
        }
        if (null != this.highscoresButton &&
          this.highscoresButton.hitTest((byte) 65, x, y)) {
          return this.highscoresButton.actionId;
        }
        if (guard != -3) {
          return 57;
        }
        if (this.mainMenuButton != null &&
          this.mainMenuButton.hitTest((byte) 65, x, y)) {
          return this.mainMenuButton.actionId;
        }
        if (this.pageButtons != null) {
          var4 = DebouncedValidator.a(y, 57, this.pageButtons, x);
          if (var4 >= 0) {
            return var4;
          }
        }
        return -1;
    }

    private final int rowsPerPage(byte guard, int itemCount) {
        if (guard <= 18) {
          return 38;
        }
        if (itemCount <= 4) {
          return 1;
        }
        return 2;
    }

    private final int itemsOnPage(byte guard, int totalCount, int pageIndex) {
        int var4 = totalCount / this.pageCount;
        if (pageIndex == 0) {
          var4 = var4 + totalCount % this.pageCount;
        }
        if (guard <= 80) {
          this.nextPageActionId = 38;
        }
        return var4;
    }

    private final boolean handleNextKey(int guard) {
        boolean var2 = false;
        if (AccountRequestDialog.pollKeyEvent(-98)) {
          di.field_d.handleKeyWithoutNavigation(118);
          ArchiveLoadTask.cycleSelectionFromArrowKey(this.actionOrder, 0);
          if (PasswordValidator.field_n == 13) {
            di.field_d.selectFromKeyboard(false, this.mainMenuActionId);
          }
          this.playSelectionSound(20364);
          var2 = (this.handleActivation((byte) -91, false, Js5NetworkRequest.a((byte) 15, PasswordValidator.field_n)));
          return (var2);
        }
        if (guard >= -60) {
          this.selectAchievementSet((byte) 96);
        }
        return (var2);
    }

    private final int[] centeredXs(int[] widths, byte guard) {
        String stackIn_9_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var3_int = 66 / ((guard - 34) / 58);
          int[] var4 = new int[widths.length];
          for (int var5 = 0; widths.length > var5; var5++) {
            int var6 = widths[var5];
            int var7 = (-var6 + 640) / 2;
            var4[var5] = var7;
          }
          int[] stackIn_5_0 = var4;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("ta.S(");
          if (widths == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(')').toString());
        }
    }

    private final boolean isMembersLocked(int guard, int achievementId) {
        if (guard < 14) {
          field_w = 98;
        }
        if (UiContainer.hasMembership((byte) -119)) {
          return false;
        }
        return TrackerMusicDefinition.field_f.isMembersOnly(achievementId, 1);
    }

    private final void drawEmptyMessage(boolean guard) {
        BinaryBitmapFont var2 = ByteStorage.gameFont;
        if (!guard) {
          return;
        }
        int var3 = 320;
        int var4 = 10;
        int var5 = this.detailPanel.y + var4 + var2.maxAscent;
        var2.drawCentered(Js5NetworkRequest.field_C, var3, var5, 10551200, -1);
    }

    private final int[] visibleAchievementIds(int sessionSetKind) {
        int[] var2;
        int var9 = EscapeVector.obfuscationControl;
        if (this.achievementSetKind != sessionSetKind) {
          int var3 = TrackerMusicDefinition.field_f.totalCount(this.achievementSetKind, true);
          int var4 = TrackerMusicDefinition.field_f.visibleCount(this.achievementSetKind, 1);
          int[] var10 = new int[var4];
          var2 = var10;
          int var5 = 0;
          int var6 = 0;
          while (var5 < var3) {
            boolean var7 = (TrackerMusicDefinition.field_f.isHidden(var5, (byte) 55));
            boolean var8 = (TrackerMusicDefinition.field_f.isEarned(var5, (byte) -126, this.achievementSetKind));
            if ((!var7 ||
              var8) && var10.length > var6) {
              var10[var6++] = var5;
            }
            var5++;
          }
        } else {
          var2 = this.earnedSnapshotIds;
        }
        return var2;
    }

    private final int appendPageButtons(int nextActionId, int guard) {
        this.nextPageActionId = -1;
        this.previousPageActionId = -1;
        if (1 >= this.pageCount) {
          this.pageButtons = null;
          return nextActionId;
        }
        int stackIn_6_0 = (this.pageCount > 2) ? 2 : 1;
        int var3 = stackIn_6_0;
        this.pageButtons = new LegacyButton[var3];
        if (guard != 8) {
          this.defaultActionId(46);
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = this.gridPanel.y + (-TextFieldValidator.field_j.fullHeight + this.gridPanel.height) / 2;
        if (this.currentPage > 0) {
          int incrementValue$0 = nextActionId;
          nextActionId++;
          this.previousPageActionId = incrementValue$0;
          int var7 = this.gridPanel.x - TextFieldValidator.field_j.fullWidth / 2;
          this.pageButtons[var4] = new LegacyButton(var5, this.previousPageActionId, SpriteDecodeSupport.field_a);
          this.pageButtons[var4].setPosition((byte) 127, var7, var6);
          this.pageButtons[var4].setSize(TextFieldValidator.field_j.fullHeight, 0, TextFieldValidator.field_j.fullWidth);
          QuickChatPhraseDefinition.applyGrayButtonPalette(-92, this.pageButtons[var4]);
          var4++;
        }
        if (this.pageCount - 1 > this.currentPage) {
          int incrementValue$1 = nextActionId;
          nextActionId++;
          this.nextPageActionId = incrementValue$1;
          int var7Lifetime1 = this.gridPanel.x + (this.gridPanel.width - TextFieldValidator.field_j.fullWidth / 2);
          this.pageButtons[var4] = new LegacyButton(var5, this.nextPageActionId, TextFieldValidator.field_j);
          this.pageButtons[var4].setPosition((byte) 122, var7Lifetime1, var6);
          this.pageButtons[var4].setSize(TextFieldValidator.field_j.fullHeight, 0, TextFieldValidator.field_j.fullWidth);
          QuickChatPhraseDefinition.applyGrayButtonPalette(-110, this.pageButtons[var4]);
        }
        return nextActionId;
    }

    final int defaultActionId(int guard) {
        int var2;
        int var3 = EscapeVector.obfuscationControl;
        if (this.accountButton != null) {
          var2 = this.accountActionId;
        } else if (this.highscoresButton != null) {
          var2 = this.highscoresActionId;
        } else {
          var2 = this.mainMenuActionId;
        }
        if (guard != 5201) {
          int[] discarded$0 = this.visibleAchievementIds(75);
        }
        return var2;
    }

    final boolean update(int guard) {
        if (!this.gridTransition.isComplete((byte) -7)) {
          this.gridTransition.advance((byte) 62);
        }
        this.updateRevealEffects(true);
        boolean var2 = (this.handleNextKey(-70));
        if (guard >= -111) {
          return true;
        }
        if (var2) {
          return (var2);
        }
        boolean var2Lifetime1 = (this.handlePointer((byte) -30));
        if (var2Lifetime1) {
          return (var2Lifetime1);
        }
        return (var2Lifetime1);
    }

    private final void buildActionOrder(int actionCount, int minimumAccountAction) {
        this.actionOrder = new int[actionCount];
        int var3 = 0;
        var3 = AnimatedPathMarker.appendInts(this.actionOrder, var3, true, this.pageAchievementIds[this.currentPage]);
        if (minimumAccountAction <= this.accountActionId) {
          int incrementValue$0 = var3;
          var3++;
          this.actionOrder[incrementValue$0] = this.accountActionId;
        }
        if (this.highscoresActionId >= 0) {
          int incrementValue$1 = var3;
          var3++;
          this.actionOrder[incrementValue$1] = this.highscoresActionId;
        }
        int incrementValue$2 = var3;
        var3++;
        this.actionOrder[incrementValue$2] = this.mainMenuActionId;
        if (this.previousPageActionId >= 0) {
          int incrementValue$3 = var3;
          var3++;
          this.actionOrder[incrementValue$3] = this.previousPageActionId;
        }
        if (0 <= this.nextPageActionId) {
          int incrementValue$4 = var3;
          var3++;
          this.actionOrder[incrementValue$4] = this.nextPageActionId;
        }
    }

    private final void configureGridPanel(int centerY, int lightColor, int viewportWidth, int frameId, int rowHeight, int darkColor, int openTicks, int itemWidth) {
        centerY = -(rowHeight / 2) + centerY;
        rowHeight = 3 * rowHeight;
        itemWidth = itemWidth * 9;
        int var9 = (-itemWidth + viewportWidth) / 2;
        this.gridPanel = new AnimatedPanelFrame(var9, centerY, itemWidth, rowHeight, openTicks);
        this.gridPanel.configureFrame(15135, lightColor, frameId, darkColor);
    }

    private final int prefixOffset(int start, int[] counts, int guard, int rowIndex) {
        String stackIn_12_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          int var5_int = 0;
          for (int var6 = 0; rowIndex > var6; var6++) {
            var5_int = var5_int + counts[var6];
          }
          var5_int = var5_int + start;
          if (guard == 6340704) {
            int stackIn_8_0 = var5_int;
            return stackIn_8_0;
          }
          int stackIn_6_0 = -83;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var5;
          StringBuilder stackIn_11_1 = new StringBuilder().append("ta.GB(").append(start).append(',');
          if (counts == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(guard).append(',').append(rowIndex).append(')').toString());
        }
    }

    private final boolean handlePointer(byte guard) {
        di.field_d.updatePointer(this.hitTest(-3, sf.field_c, LoginDialog.field_ob), (byte) 119, this.hitTest(-3, GzipDecoder.field_d, UiContainer.field_y));
        this.playSelectionSound(20364);
        boolean var2 = (this.handleActivation((byte) -91, true, Js5NetworkRequest.a((byte) 15, -1)));
        int var3 = -122 / ((guard - 73) / 47);
        if (var2) {
          return (var2);
        }
        return (var2);
    }

    private final void configureDetailPanel(int lightColor, int frameId, int arrowScale, int darkColor, int openTicks) {
        int var6 = this.gridPanel.y + this.gridPanel.height + 5;
        int var7 = 20;
        if (null != this.accountButton) {
          var7 = 10;
        } else if (this.highscoresButton != null) {
          var7 = 10;
        }
        int var8 = -this.gridPanel.y + (-this.gridPanel.height - var7) + 440;
        int var9 = this.gridPanel.x - 3 * TextFieldValidator.field_j.fullWidth / arrowScale;
        int var10 = 3 * TextFieldValidator.field_j.fullWidth + this.gridPanel.width;
        this.detailPanel = new AnimatedPanelFrame(var9, var6, var10, var8, openTicks);
        this.detailPanel.configureFrame(15135, lightColor, frameId, darkColor);
    }

    private final LegacyButton selectedButton(boolean guard) {
        int var2 = di.field_d.selectedIndex;
        if (!guard) {
          Sprite discarded$0 = this.displayedIcon(74, -122);
        }
        if (var2 < 0) {
          return null;
        }
        LegacyButton var3 = TetherHumStream.a(this.gridButtons[this.currentPage], var2, 0);
        if (var3 != null) {
          return var3;
        }
        if (this.accountButton != null &&
          this.accountActionId == var2) {
          return this.accountButton;
        }
        if (null != this.highscoresButton &&
          this.highscoresActionId == var2) {
          return this.highscoresButton;
        }
        if (this.mainMenuActionId != var2) {
          return null;
        }
        return this.mainMenuButton;
    }

    private final void drawRewardsColumn(int divisor, Sprite icon) {
        if (icon == null) {
          return;
        }
        int var3_int = this.selectedAchievementId(true);
        if (0 > var3_int) {
          return;
        }
        try {
          BinaryBitmapFont var4 = ByteStorage.gameFont;
          int var5 = var4.maxAscent + var4.maxDescent;
          int var6 = 6340704;
          int var7 = 10551200;
          String var8 = GameProgressTracker.field_a + " ";
          String var9 = "" + ProxySocketConnector.achievementOrbPoints[var3_int];
          String var10 = ResizableModalPanel.field_T + " ";
          String var11 = "" + ProxySocketConnector.achievementOrbCoins[var3_int];
          int var12 = (640 + icon.fullWidth) / divisor;
          int var13 = -var12 + (this.detailPanel.width + this.detailPanel.x);
          int var14 = this.rewardValueColumnX(var12, 15930, var4, var13);
          int var15 = var5 * 2;
          int var16 = this.detailPanel.y - (-((-var15 + this.detailPanel.height) / 2) - var4.maxAscent);
          var4.drawRight(var8, var14, var16, var6, -1);
          var4.drawLeft(var9, var14, var16, var7, -1);
          var16 = var16 + var5;
          var4.drawRight(var10, var14, var16, var6, -1);
          var4.drawLeft(var11, var14, var16, var7, -1);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ta.C(" + divisor + ',' + (icon != null ? "{...}" : "null") + ')');
        }
    }

    private final void allocatePages(byte guard) {
        int var6 = EscapeVector.obfuscationControl;
        AchievementTracker var2 = TrackerMusicDefinition.field_f;
        if (guard > -72) {
          int discarded$0 = this.selectedAchievementId(true);
        }
        int var3 = var2.visibleCount(this.achievementSetKind, 1);
        this.pageCount = this.choosePageCount(var3, (byte) 123);
        this.pageSizes = new int[this.pageCount];
        for (int var4 = 0; var4 < this.pageCount; var4++) {
          int var5 = this.itemsOnPage((byte) 125, var3, var4);
          this.pageSizes[var4] = var5;
        }
    }

    private final void startGridSlide(int guard, int direction) {
        int var3 = 640;
        int var4 = 480;
        Sprite var5 = new Sprite(var3, var4);
        int[] var20 = new int[4];
        LegacyButton[] var7 = this.gridButtons[this.currentPage];
        SoftwareRasterizer.saveClip(var20);
        if (guard != 4551) {
          int discarded$1 = this.selectedActionId(122);
        }
        var5.bindAsFramebuffer();
        nm.a((byte) -103, -1, var7);
        AlphaContainer.field_D.a(124);
        SoftwareRasterizer.restoreClip(var20);
        var5.trimTransparentEdges();
        int var8 = IterableNodeHashTable.minimumButtonX(var7, (byte) 26);
        int var9 = on.a(var7, -49);
        int var10 = ResizableModalPanel.minimumButtonY(var7, (byte) -122);
        int var11 = pb.a((byte) 2, var7);
        var5.fullHeight = var11 - var10;
        var5.offsetX = var5.offsetX - var8;
        var5.fullWidth = var9 - var8;
        var5.offsetY = var5.offsetY - var10;
        int var12 = 40;
        int var13 = 0;
        if (GameModeSelectScreen.field_i == direction) {
          var13 = 0;
        } else if (WhirlpoolHasher.field_f == direction) {
          var13 = -var5.fullWidth + var3 - 1;
        }
        int var14 = var8;
        TransitionPoint var15 = new TransitionPoint(var13, var10);
        TransitionPoint var16 = new TransitionPoint(var14, var10);
        this.gridTransition = new SlidingSpriteTransition(var15, var16, var5, var12);
    }

    private final int createHighscoresButton(int setComplement, BinaryBitmapFont font, int actionId, int revealTick, int y, int frameId) {
        String stackIn_9_2 = null;
        try {
          if (~this.achievementSetKind != setComplement) {
            this.highscoresActionId = -1;
            this.highscoresButton = null;
            int stackIn_3_0 = actionId;
            return stackIn_3_0;
          }
          int var7_int = 3;
          String var8 = DynamicTerrainRenderer.field_m;
          int var9 = SeekerMine.a(var8, 16777215, font);
          int var10 = (-var9 + 640) / 2;
          this.highscoresButton = new LegacyButton(var7_int, actionId, var8, revealTick, frameId, font);
          this.highscoresButton.setPosition((byte) 124, var10, y);
          this.highscoresActionId = actionId;
          int stackIn_5_0 = this.highscoresActionId + 1;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var7;
          StringBuilder stackIn_8_1 = new StringBuilder().append("ta.T(").append(setComplement).append(',');
          if (font == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(actionId).append(',').append(revealTick).append(',').append(y).append(',').append(frameId).append(')').toString());
        }
    }

    private final void drawFooterButtons(int guard) {
        int var2 = di.field_d.selectedIndex;
        if (null != this.accountButton) {
          boolean var3 = (this.accountButton.actionId == var2);
          this.accountButton.draw(-16383, (var3));
        }
        if (guard != -1) {
          int discarded$0 = this.appendPageButtons(72, 122);
        }
        if (null != this.highscoresButton) {
          boolean var3Lifetime1 = (var2 == this.highscoresButton.actionId);
          this.highscoresButton.draw(-16383, (var3Lifetime1));
        }
        if (this.mainMenuButton != null) {
          boolean var3Lifetime2 = (var2 == this.mainMenuButton.actionId);
          this.mainMenuButton.draw(guard - 16382, (var3Lifetime2));
        }
    }

    private final void playSelectionSound(int guard) {
        if (guard != 20364) {
          boolean discarded$0 = this.handleNextKey(2);
        }
        if (di.field_d.selectionChanged) {
          LegacyButton var2 = this.selectedButton(true);
          int var3 = PasswordValidator.a(-93, var2);
          ObjectSpriteSet.field_e.playSampleWithPan(ArchiveRequest.field_w, 100, IterableNodeHashTable.field_c * 1536 / 64, var3);
        }
    }

    private final Sprite drawSelectedIcon(boolean guard) {
        int var2 = this.selectedAchievementId(guard);
        if (var2 < 0) {
          return null;
        }
        Sprite var3 = this.displayedIcon(-4343, var2);
        if (var3 != null) {
          int var4 = (640 - var3.fullWidth) / 2;
          int var5 = this.detailPanel.y + (this.detailPanel.height - var3.fullHeight) / 2;
          var3.drawTransparent(var4, var5);
        }
        return var3;
    }

    private final int createMainMenuButton(int y, BinaryBitmapFont font, byte guard, int actionId, int frameId, int revealTick) {
        String stackIn_8_2 = null;
        try {
          int var7_int = 3;
          String var8 = GameKeyHandler.field_a;
          if (guard != 57) {
            int stackIn_2_0 = 94;
            return stackIn_2_0;
          }
          int var9 = SeekerMine.a(var8, 16777215, font);
          int var10 = (640 - var9) / 2;
          this.mainMenuButton = new LegacyButton(var7_int, actionId, var8, revealTick, frameId, font);
          this.mainMenuButton.setPosition((byte) 121, var10, y);
          this.mainMenuActionId = actionId;
          int stackIn_4_0 = 1 + this.mainMenuActionId;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var7;
          StringBuilder stackIn_7_1 = new StringBuilder().append("ta.DB(").append(y).append(',');
          if (font == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(',').append(actionId).append(',').append(frameId).append(',').append(revealTick).append(')').toString());
        }
    }

    final int actionCount(byte guard) {
        if (guard >= -48) {
          return 57;
        }
        int var2 = 0;
        var2 = var2 + this.pageAchievementIds[this.currentPage].length;
        if (0 <= this.accountActionId) {
          var2++;
        }
        if (this.highscoresActionId >= 0) {
          var2++;
        }
        if (this.mainMenuActionId >= 0) {
          var2++;
        }
        if (this.previousPageActionId >= 0) {
          var2++;
        }
        if (0 <= this.nextPageActionId) {
          var2++;
        }
        return var2;
    }

    private final void drawDetailsPanel(int guard) {
        int var2 = -64 / ((guard + 87) / 34);
        this.detailPanel.draw(50);
        int var3 = this.selectedAchievementId(true);
        if (var3 >= 0) {
          Sprite var4 = this.drawSelectedIcon(true);
          this.drawAchievementTitle(2, var4);
          this.drawAchievementDescription(var4, (byte) -33);
          this.drawRewardsColumn(2, var4);
        } else {
          this.drawEmptyMessage(true);
        }
        this.drawAccountNotice(true);
    }

    private final void drawAchievementDescription(Sprite icon, byte guard) {
        String stackIn_9_0 = null;
        String stackIn_16_2 = null;
        try {
          if (icon == null) {
            return;
          }
          int var3_int = this.selectedAchievementId(true);
          if (0 > var3_int) {
            return;
          }
          BinaryBitmapFont var4 = ByteStorage.gameFont;
          int var5 = 10551200;
          int var6 = 6340704;
          String var7 = ResourceArchive.field_f[var3_int];
          if (!this.isEarned(var3_int, 6144)) {
            stackIn_9_0 = StatefulTextPainter.field_q;
          } else {
            stackIn_9_0 = bg.field_d;
          }
          String var8 = stackIn_9_0;
          String var9 = var7 + "<br>" + "<col=" + Integer.toHexString(var6) + ">" + var8;
          int var10 = 18;
          if (guard != -33) {
            int[] discarded$0 = this.layoutRowCenters((byte) -123, 67, 100, -110);
          }
          int var11 = var10 + this.detailPanel.x;
          int var12 = -var11 - var10 + (-icon.fullWidth + 640) / 2;
          int var13 = var4.paragraphHeight(var9, var12, 0);
          int var14 = this.detailPanel.y + (this.detailPanel.height - var13) / 2;
          var4.drawParagraph(var9, var11, var14, var12, var13, var5, -1, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var3;
          StringBuilder stackIn_15_1 = new StringBuilder().append("ta.FB(");
          if (icon == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void selectAchievementSet(byte guard) {
        if (guard != 111) {
          this.highscoresButton = (LegacyButton) null;
        }
        AchievementTracker var2 = TrackerMusicDefinition.field_f;
        if (var2.hasSessionAchievements(-106)) {
          this.achievementSetKind = 0;
        } else {
          this.achievementSetKind = 1;
        }
    }

    private final int selectedAchievementId(boolean guard) {
        if (this.selectedSlot >= 0 &&
          this.pageAchievementIds[this.currentPage].length > this.selectedSlot) {
          return this.pageAchievementIds[this.currentPage][this.selectedSlot];
        }
        if (0 <= this.hoveredSlot &&
          this.pageAchievementIds[this.currentPage].length > this.hoveredSlot) {
          return this.pageAchievementIds[this.currentPage][this.hoveredSlot];
        }
        if (!guard) {
          field_w = -81;
        }
        return -1;
    }

    private final Sprite[] iconsForPage(int page, byte guard) {
        int var7 = EscapeVector.obfuscationControl;
        int[] var8 = this.pageAchievementIds[page];
        int[] var3 = var8;
        Sprite[] var4 = new Sprite[var8.length];
        int var5 = 0;
        if (guard >= -28) {
          return (Sprite[]) null;
        }
        while (var5 < var4.length) {
          int var6 = var8[var5];
          var4[var5] = this.displayedIcon(-4343, var6);
          var5++;
        }
        return var4;
    }

    private final int[] scaleCounts(int[] counts, byte guard, int scale) {
        String stackIn_9_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int[] var9 = new int[counts.length];
          int[] var4 = var9;
          for (int var5 = 0; counts.length > var5; var5++) {
            int var6 = counts[var5];
            int var7 = scale * var6;
            var9[var5] = var7;
          }
          int var5Lifetime1 = -7 % ((61 - guard) / 36);
          int[] stackIn_5_0 = var4;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var4_ref;
          StringBuilder stackIn_8_1 = new StringBuilder().append("ta.RA(");
          if (counts == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(',').append(scale).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        if (guard != 0) {
          field_k = (String) null;
        }
        field_k = null;
        field_g = null;
    }

    final void draw(int guard) {
        SoftwareRasterizer.clearFramebuffer();
        SelfDestructEffects.b(2);
        pb.a(4);
        if (guard != 3) {
          this.pageButtons = (LegacyButton[]) null;
        }
        this.drawGridPanel(16317);
        this.drawDetailsPanel(-3);
        this.drawFooterButtons(guard - 4);
    }

    private final int[] splitRowSizes(int guard, int rowCount, int itemCount) {
        int var7 = EscapeVector.obfuscationControl;
        int[] var4 = new int[rowCount];
        int var5 = 0;
        if (guard != 22387) {
          this.allocatePages((byte) 26);
        }
        while (var5 < rowCount) {
          int var6 = itemCount / rowCount;
          if (0 == var5) {
            var6 = var6 + itemCount % rowCount;
          }
          var4[var5] = var6;
          var5++;
        }
        return var4;
    }

    private final void partitionAchievementIds(byte guard) {
        int var8 = EscapeVector.obfuscationControl;
        int[] var2 = this.visibleAchievementIds(guard ^ -105);
        this.pageAchievementIds = new int[this.pageCount][];
        int var3 = 0;
        if (guard != -105) {
          this.buildLayout((byte) -10);
        }
        for (int var4 = 0; this.pageCount > var4; var4++) {
          int var5 = this.pageSizes[var4];
          int[] array$0 = new int[var5];
          this.pageAchievementIds[var4] = array$0;
          for (int var6 = 0; var6 < var5; var6++) {
            int var7 = var2[var3++];
            this.pageAchievementIds[var4][var6] = var7;
          }
        }
    }

    private final int choosePageCount(int totalCount, byte guard) {
        if (guard <= 98) {
          return -85;
        }
        int var3 = totalCount / 8;
        if (totalCount % 8 != 0) {
          var3++;
        }
        this.pageCount = var3 / 2;
        if (this.pageCount <= 0) {
          this.pageCount = 1;
        }
        if (0 != var3 % 2) {
          var3++;
        }
        return this.pageCount;
    }

    private final void playButtonRevealSound(int volumeDivisor, LegacyButton button) {
        if (button == null) {
          return;
        }
        int var3_int = mj.field_d;
        if (var3_int != button.revealUntilTick) {
          return;
        }
        try {
          int var4 = PasswordValidator.a(-87, button);
          ObjectSpriteSet.field_e.playSampleWithPan(pc.field_a, 100, IterableNodeHashTable.field_c * 6144 / volumeDivisor, var4);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ta.P(" + volumeDivisor + ',' + (button != null ? "{...}" : "null") + ')');
        }
    }

    private final int selectedActionId(int guard) {
        int var2 = di.field_d.selectedIndex;
        if (0 > var2 ||
          this.actionOrder.length <= var2) {
          return -1;
        }
        if (guard != -8477) {
          return -64;
        }
        int var3 = this.actionOrder[var2];
        return var3;
    }

    private final Sprite displayedIcon(int guard, int achievementId) {
        Sprite var3 = CheckboxPainter.field_c;
        if (this.isEarned(achievementId, guard ^ -2295)) {
          var3 = TrackerMusicDefinition.field_f.achievementIcon(achievementId, 117);
        }
        if (this.isMembersLocked(73, achievementId)) {
          var3 = DualLinkDequeIterator.field_e;
        }
        if (guard != -4343) {
          this.mainMenuButton = (LegacyButton) null;
        }
        return var3;
    }

    private final boolean isEarned(int achievementId, int guard) {
        int var6 = EscapeVector.obfuscationControl;
        int[] var7 = this.earnedSnapshotIds;
        int[] var3 = var7;
        for (int var4 = 0; var4 < var7.length; var4++) {
          int var5 = var7[var4];
          if (~achievementId == ~var5) {
            return true;
          }
        }
        if (guard == 6144) {
          return false;
        }
        this.mainMenuActionId = -116;
        return false;
    }

    private final int createAccountButton(BinaryBitmapFont font, int guard, int revealTick, int frameId, int y, int actionId) {
        String stackIn_9_2 = null;
        try {
          if (!AccountSessionSupport.isGuestSession(-122)) {
            this.accountActionId = -1;
            this.accountButton = null;
            int stackIn_3_0 = actionId;
            return stackIn_3_0;
          }
          int var7_int = 3;
          String var8 = IntrusiveDeque.field_e;
          int var9 = SeekerMine.a(var8, 16777215, font);
          this.accountButton = new LegacyButton(var7_int, actionId, var8, revealTick, frameId, font);
          int var10 = (640 - var9) / 2;
          int var11 = -57 / ((guard - 65) / 52);
          this.accountButton.setPosition((byte) 13, var10, y);
          this.accountActionId = actionId;
          int stackIn_5_0 = this.accountActionId + 1;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var7;
          StringBuilder stackIn_8_1 = new StringBuilder().append("ta.G(");
          if (font == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(',').append(revealTick).append(',').append(frameId).append(',').append(y).append(',').append(actionId).append(')').toString());
        }
    }

    private final void setPage(int page, byte guard) {
        int var3 = WhirlpoolHasher.field_f;
        if (page < this.currentPage) {
          var3 = GameModeSelectScreen.field_i;
        } else {
          var3 = WhirlpoolHasher.field_f;
        }
        this.currentPage = page;
        if (this.currentPage >= this.pageCount) {
          this.currentPage = this.pageCount - 1;
        }
        this.selectedSlot = -1;
        if (0 > this.currentPage) {
          this.currentPage = 0;
        }
        this.hoveredSlot = -1;
        this.buildLayout((byte) -60);
        int var4 = this.actionCount((byte) -128);
        this.buildActionOrder(var4, 0);
        di.field_d = new MenuInputState(var4);
        int var5 = da.field_b.defaultActionId(5201);
        int var6 = da.field_b.hitTest(-3, GzipDecoder.field_d, UiContainer.field_y);
        di.field_d.initializeSelection(117, true, var6, var5);
        mj.field_d = 0;
        ChatMessage.clearFrameOffsets((byte) -70);
        int var7 = -97 % ((guard + 21) / 32);
        this.startGridSlide(4551, var3);
    }

    AchievementsScreen() {
        this.footerTop = 400;
        this.selectedSlot = -1;
        this.currentPage = 0;
        this.hoveredSlot = -1;
        this.selectAchievementSet((byte) 111);
        this.earnedSnapshotIds = TrackerMusicDefinition.field_f.earnedAchievementIds(this.achievementSetKind, (byte) -32);
        this.allocatePages((byte) -128);
        this.buildLayout((byte) 102);
        this.startGridSlide(4551, GameModeSelectScreen.field_i);
    }

    static {
        field_k = "Type your age in years";
        field_w = 0;
        field_g = "Log in";
    }
}
