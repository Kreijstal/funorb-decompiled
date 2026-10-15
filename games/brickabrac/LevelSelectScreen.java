/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelSelectScreen extends MenuScreen {
    private static int[] field_x;
    static long field_E;
    private NodeDeque previewPaths;
    private NodeDeque[] previewBrickGroups;
    static int textChoiceMode;
    static int field_w;
    static String field_t;
    private IntNode previewState;
    private ga field_s;
    private int previewBottom256;
    private int previewLevelIndex;
    private int maxNumberLabelWidth;
    private LevelList levelList;
    private LevelPack pack;
    private String emptySelectionText;
    private int previewRight256;
    private int previewLeft256;
    private int previewTop256;

    final void handleNavigationKey(int obfuscationGuard, int keyCode, char character) {
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard != -120) {
          this.previewLevelIndex = -61;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.selection.selectedIndex >= 0) {
          if (this.selection.selectedIndex == 3) {
            if (keyCode != 97 &&
              keyCode != 96) {
              if (keyCode == 98) {
                this.selection.setSelectedIndex(false, 1);
                this.levelList.selectLast((byte) -100);
              } else {
                if ((99 == keyCode)) {
                  this.selection.setSelectedIndex(false, 1);
                  this.levelList.selectFirst((byte) -95);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (5 == this.buttons.length) {
                this.selection.setSelectedIndex(false, 4);
              }
            }
          } else {
            if (4 != this.selection.selectedIndex) {
              if (1 == this.selection.selectedIndex &&
                this.levelList.handleNavigationKey(-28088, keyCode, (int) character)) {
                this.selection.setSelectedIndex(false, 3);
              }
            } else {
              if (keyCode != 97 &&
                keyCode != 96) {
                if (98 == keyCode) {
                  this.selection.setSelectedIndex(false, 1);
                  this.levelList.selectLast((byte) -63);
                } else {
                  if ((keyCode == 99)) {
                    this.selection.setSelectedIndex(false, 1);
                    this.levelList.selectFirst((byte) -114);
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.selection.setSelectedIndex(false, 3);
              }
            }
          }
        } else {
          this.selection.setSelectedIndex(false, 3);
        }

    }

    final void drawScreen(byte obfuscationGuard) {
        int stackIn_17_0;
        int stackIn_17_1;
        int stackIn_17_2;
        int stackIn_17_3;
        int stackIn_17_4;
        int stackIn_18_5;
        int var2;
        int var3;
        RgbSprite var4;
        int var5;
        int var6;
        super.drawScreen((byte) -101);
        AchievementMaskRequest.a(13, 19);
        GzipInflater.a(550, 5, 33, 5, 140, (byte) -106, 45);
        GzipInflater.a(160, 5, 243, 5, 178, (byte) -88, 45);
        GzipInflater.a(385, 5, 243, 5, 178, (byte) -124, 210);
        ContextActionController.field_g.drawCentered(CanvasResizeController.packNames[this.pack.packId], 320, 1 + (178 - ContextActionController.field_g.xHeight), 0, -1);
        ArchiveNetworkRequest.packSelectorIcons[this.pack.packId].e(565, 140, -2048, 4096);
        if (this.levelList.selectedLevelIndex >= 0 &&
          this.levelList.selectedLevelIndex < this.pack.levelCount) {
          var2 = ContextActionController.field_g.capHeight + 2;
          var3 = this.levelList.selectedLevelIndex;
          if (var3 != this.previewLevelIndex) {
            this.loadPreview(-6845, var3);
            this.previewLevelIndex = var3;
          }
          if (GameConnectionShell.field_t ||
            !(this.previewLevelIndex >= 3 + IntegerPowerHelpers.unlockedLevelCounts[this.pack.packId])) {
            this.a(178, 243 - 2 * var2, 210, 385, (byte) 85);
          }
          if (GameConnectionShell.field_t ||
            !(IntegerPowerHelpers.unlockedLevelCounts[this.pack.packId] < this.previewLevelIndex)) {
            ContextActionController.field_g.drawCentered(this.pack.metadata[this.previewLevelIndex].title, 402, 421 - var2, 0, -1);
          }
          if (!GameConnectionShell.field_t &&
            !(this.previewLevelIndex <= IntegerPowerHelpers.unlockedLevelCounts[this.pack.packId])) {
            if (this.previewLevelIndex < 3 + IntegerPowerHelpers.unlockedLevelCounts[this.pack.packId]) {
              stackIn_17_0 = 210;
              stackIn_17_1 = 178;
              stackIn_17_2 = 385;
              stackIn_17_3 = 233;
              stackIn_17_4 = 0;
              if (1 != -IntegerPowerHelpers.unlockedLevelCounts[0] + var3) {
                stackIn_18_5 = 190;
              } else {
                stackIn_18_5 = 128;
              }
              Rasterizer2D.fillRectangleAlpha(stackIn_17_0, stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_17_4, stackIn_18_5);
            }
            var4 = LevelCompleteScreen.field_F;
            var5 = 210 + (385 - var4.canvasWidth) / 2;
            var6 = (243 - var4.canvasHeight) / 2 + 178;
            var4.b(var5, var6, 196);
          }
        } else {
          ContextActionController.field_g.drawCentered(this.emptySelectionText, 402, 299 + ContextActionController.field_g.descent, 0, -1);
          this.previewLevelIndex = -1;
        }
        this.levelList.draw((byte) 28);
        this.a(0);
        if (obfuscationGuard >= -14) {
          this.previewRight256 = -125;
        }
    }

    static int d(int param0, int param1) {
        return param0 | param1;
    }

    LevelSelectScreen(int screenId, int packIndex) {
        this(screenId, AppletSettingsUiHelpers.field_a, packIndex);
    }

    final void onEnter(boolean usePointer, int initialSelection, int obfuscationGuard) {
        super.onEnter(usePointer, 1, 104);
        this.levelList.setScrollOffset(0);
        if (!usePointer) {
          this.levelList.selectFirst((byte) -90);
        }
        this.previewLevelIndex = -1;
        if (obfuscationGuard < 96) {
          this.refreshMenu(37);
        }
    }

    final String e(byte param0) {
        if (param0 <= 53) {
          return (String) null;
        }
        return ArrayWidgetGroup.buttonLabels[DelayedPacket.c(61) ? 7 : 39];
    }

    private final void loadPreview(int obfuscationGuard, int levelIndex) {
        int clearGroupIndex;
        Brick previewBrick;
        int clientBranchFlag;
        int boundsGroupIndex;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        for (clearGroupIndex = 0; this.previewBrickGroups.length > clearGroupIndex; clearGroupIndex++) {
          if (this.previewBrickGroups[clearGroupIndex] != null) {
            this.previewBrickGroups[clearGroupIndex].clear((byte) -80);
          } else {
            this.previewBrickGroups[clearGroupIndex] = new NodeDeque();
          }
        }
        this.previewPaths.clear((byte) -78);
        VolcanicBackground.decodeLevelBytes(this.previewBrickGroups, this.pack.levelData[levelIndex], this.previewState, this.previewPaths, this.field_s, 10792131);
        NanoGameClock.attachBrickMotionPaths(this.previewBrickGroups, (byte) 35, this.previewPaths, false);
        this.previewTop256 = 122880;
        this.previewLeft256 = 163840;
        this.previewRight256 = 0;
        if (obfuscationGuard != -6845) {
          this.getParentScreenId(false);
        }
        this.previewBottom256 = 0;
        for (boundsGroupIndex = 0; this.previewBrickGroups.length > boundsGroupIndex; boundsGroupIndex++) {
          previewBrick = (Brick) (this.previewBrickGroups[boundsGroupIndex].first(obfuscationGuard + 6735));
          while (previewBrick != null) {
            if ((1 & previewBrick.flags) == 0) {
              if (this.previewRight256 < previewBrick.x256 + previewBrick.width256) {
                this.previewRight256 = previewBrick.x256 + previewBrick.width256;
              }
              if (this.previewTop256 > previewBrick.y256) {
                this.previewTop256 = previewBrick.y256;
              }
              if (previewBrick.y256 + previewBrick.height256 > this.previewBottom256) {
                this.previewBottom256 = previewBrick.height256 + previewBrick.y256;
              }
              if (previewBrick.x256 < this.previewLeft256) {
                this.previewLeft256 = previewBrick.x256;
              }
            }
            previewBrick = (Brick) (this.previewBrickGroups[boundsGroupIndex].next((byte) 116));
          }
        }
    }

    final static boolean a(long param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        SocialListEntry var5 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -82 / ((-47 - param2) / 37);
          var5 = RadialSelectorRenderer.findFriend(false, param1);
          if (var5 != null &&
            var5.serverName != null) {
            return true;
          }
          stackIn_9_0 = (ClientResourceHelpers.currentLobbyGame != null) && (null != EmailAvailabilityRequest.findGamePlayer(param0, 2));
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ud.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean handleKey(char character, int obfuscationGuard, int keyCode) {
        if (obfuscationGuard <= 98) {
          this.getParentScreenId(true);
        }
        if (keyCode != 48) {
          return super.handleKey(character, 100, keyCode);
        }
        if (PauseMenuHelpers.a((byte) 62)) {
          GameConnectionShell.field_t = true;
          return true;
        }
        return true;
    }

    final static IndexedSprite buildIndexedSprite(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return (IndexedSprite) null;
        }
        IndexedSprite var1 = new IndexedSprite(PauseMenuHelpers.decodedCanvasWidth, FullscreenFailureDialog.decodedCanvasHeight, ArrayWidgetGroup.decodedSpriteOffsetX[0], SocketConnector.decodedSpriteOffsetY[0], UiGeometryHelpers.decodedSpriteWidths[0], TextHotspotRegion.decodedSpriteHeights[0], GameOverlayHelpers.decodedSpriteIndices[0], PlayerBadgeHelpers.decodedSpritePalette);
        MotionWaypoint.clearDecodedSpriteData((byte) 96);
        return var1;
    }

    final int getButtonTop(int buttonIndex, int obfuscationGuard) {
        if (obfuscationGuard != 1) {
          return -75;
        }
        return this.buttonTop + 32;
    }

    final static String d(boolean param0) {
        if (MusicEnvelope.field_f == IntrusiveHashIterator.field_g) {
          return VolcanicBackground.field_w;
        }
        if (MusicVoice.field_l == MusicEnvelope.field_f) {
          return LobbyGame.field_pc;
        }
        if (!param0) {
          AchievementSubmission var2 = (AchievementSubmission) null;
          LevelSelectScreen.sendAchievementSubmission(67, (AchievementSubmission) null, (byte) 80);
        }
        if (!LabeledWidget.emailAvailabilityRequest.isCompleted(96)) {
          return LobbyGame.field_pc;
        }
        return GameScreen.field_d;
    }

    private LevelSelectScreen(int screenId, int[] actionIds, int packIndex) {
        super(screenId, 180, 460, 402, 35, actionIds);
        int var4_int = 0;
        int var5 = 0;
        this.previewBrickGroups = new NodeDeque[3];
        this.previewPaths = new NodeDeque();
        this.previewState = new IntNode();
        this.field_s = new ga();
        this.maxNumberLabelWidth = 0;
        try {
          this.emptySelectionText = RichTextLayout.field_s.toLowerCase();
          this.pack = DateFieldsWidget.field_L[packIndex];
          for (var4_int = 0; this.pack.levelCount > var4_int; var4_int++) {
            var5 = ContextActionController.field_g.measureText(this.pack.metadata[var4_int].numberLabel);
            if (var5 > this.maxNumberLabelWidth) {
              this.maxNumberLabelWidth = var5;
            }
          }
          this.layoutButtons(true);
          this.levelList = new LevelList(20, 0, 1, (MenuScreen) (this), this.buttons[1], this.pack);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ud.<init>(" + screenId + ',' + (actionIds != null ? "{...}" : "null") + ',' + packIndex + ')');
        }
    }

    final boolean handleMenuAction(int buttonIndex, boolean inputFlag, byte obfuscationGuard) {
        int var5;
        int var6;
        int var7;
        MenuButton var8;
        var7 = BrickABrac.field_J ? 1 : 0;
        var8 = this.buttons[buttonIndex];
        if (obfuscationGuard != 123) {
          this.handleKey('ﾉ', -55, 73);
        }
        var5 = var8.actionId;
        var6 = var5;
        if (var6 == 31) {
          if (this.selection.isActivated((byte) 113) &&
            0 <= this.levelList.selectedLevelIndex) {
            if (!GameConnectionShell.field_t &&
              IntegerPowerHelpers.unlockedLevelCounts[this.pack.packId] < this.levelList.selectedLevelIndex) {
              return false;
            }
            if (this.levelList.selectedLevelIndex < this.pack.levelCount) {
              RankingsRequest.a(16727, inputFlag, this.levelList.selectedLevelIndex, new LevelSequence(this.pack));
            }
          }
        } else {
          if (var6 == 29) {
            if (inputFlag &&
              this.selection.isPressActivated((byte) 108)) {
              this.levelList.scrollBy(-this.levelList.scrollStep, true);
            }
          } else {
            if (var6 != 30) {
              return super.handleMenuAction(buttonIndex, inputFlag, (byte) 123);
            }
            if (inputFlag &&
              this.selection.isPressActivated((byte) -13)) {
              this.levelList.scrollBy(this.levelList.scrollStep, true);
            }
          }
        }
        return false;
    }

    final static void sendAchievementSubmission(int opcode, AchievementSubmission submission, byte obfuscationGuard) {
        BitPacketBuffer packet = null;
        int payloadStart = 0;
        try {
          packet = TextFieldValidator.outgoingPackets;
          packet.writeCipheredOpcode(-13413, opcode);
          packet.position = packet.position + 1;
          payloadStart = packet.position;
          packet.writeByte(116, 1);
          packet.writeByte(-116, submission.achievementId);
          packet.writeByte(-103, submission.submissionByte);
          packet.writeInt(submission.resultWordOne, (byte) -79);
          packet.writeInt(submission.resultWordTwo, (byte) -79);
          packet.writeInt(submission.resultWordThree, (byte) -79);
          packet.writeInt(submission.resultWordFour, (byte) -79);
          int var5 = -68 / ((obfuscationGuard + 15) / 63);
          packet.appendCrc32(3, payloadStart);
          packet.backfillByteLength((byte) 117, packet.position - payloadStart);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ud.C(" + opcode + ',' + (submission != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public static void f(byte param0) {
        field_t = null;
        field_x = null;
        int var1 = 2 % ((-51 - param0) / 58);
    }

    final void refreshMenu(int obfuscationGuard) {
        if (obfuscationGuard > -60) {
          field_t = (String) null;
        }
        this.initializeButtons(GameRenderAudioHelpers.field_f, 0);
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var8 = 0;
        Brick var9 = null;
        int var10 = BrickABrac.field_J ? 1 : 0;
        if (param4 != 85) {
          this.field_s = (ga) null;
        }
        int var6 = this.previewRight256 - this.previewLeft256 >> 9;
        param2 = param2 + (-var6 + param3) / 2;
        int var7 = -this.previewTop256 + this.previewBottom256 >> 9;
        param0 = param0 + (param1 - var7) / 2;
        for (var8 = 0; var8 < this.previewBrickGroups.length; var8++) {
          var9 = (Brick) (this.previewBrickGroups[var8].first(-109));
          while (var9 != null) {
            if ((1 & var9.flags) == 0) {
              TranslucentNineSliceFrame.fullBrickSprites[var9.typeId].a((var9.x256 - this.previewLeft256 >> 9) + param2, (var9.y256 - this.previewTop256 >> 9) + param0, 17, 8);
            }
            var9 = (Brick) (this.previewBrickGroups[var8].next((byte) 116));
          }
        }
    }

    final void layoutButtons(boolean obfuscationGuard) {
        int dupTemp$0 = 0;
        int var7 = 0;
        String stackIn_9_0 = null;
        MenuButton var3;
        MenuButton var4;
        int var5;
        int var6;
        MenuButton var7_ref_q;
        String var8;
        int var9;
        MenuButton var10;
        MenuButton var11;
        String var12;
        MenuButton var13;
        int var6Lifetime1;
        var9 = BrickABrac.field_J ? 1 : 0;
        if (null == this.pack) {
          return;
        }
        if (!obfuscationGuard) {
          field_w = 119;
        }
        var10 = this.buttons[0];
        var11 = var10;
        var11.x = (-this.maxNumberLabelWidth + 140) / 2 + 55;
        var11.height = 22;
        var11.y = 188;
        var10.width = this.maxNumberLabelWidth;
        var3 = this.buttons[2];
        var3.width = var11.width;
        var3.y = 389;
        var3.x = var11.x;
        var3.height = var10.height;
        var4 = this.buttons[1];
        var4.y = 217;
        var4.height = 165;
        var4.width = 140;
        var4.x = 55;
        var5 = 0;
        for (var6 = 3; var6 < this.buttons.length; var6++) {
          var7_ref_q = this.buttons[var6];
          if (var7_ref_q.actionId != 8) {
            stackIn_9_0 = ArrayWidgetGroup.buttonLabels[var7_ref_q.actionId];
          } else {
            stackIn_9_0 = this.e((byte) 74);
          }
          var12 = stackIn_9_0;
          var8 = var12;
          dupTemp$0 = 30 + ContextActionController.field_g.measureText(var12);
          var7_ref_q.width = dupTemp$0;
          var5 = var5 + dupTemp$0;
          if (var6 > 3) {
            var5 += 10;
          }
        }
        var6Lifetime1 = (640 - var5) / 2;
        for (var7 = 3; var7 < this.buttons.length; var7++) {
          var13 = this.buttons[var7];
          var13.x = var6Lifetime1;
          var13.y = this.getButtonTop(var7, 1);
          var13.height = this.getButtonHeight((byte) 126, var7);
          var6Lifetime1 = var6Lifetime1 + (var13.width + 10);
        }
        return;
    }

    final void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard) {
        super.advanceScreen(updateFlag, inputEnabled, -113);
        this.levelList.updatePointerSelection(false);
        if (obfuscationGuard >= -52) {
          textChoiceMode = -8;
        }
    }

    final int getParentScreenId(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          this.field_s = (ga) null;
        }
        return !DelayedPacket.c(73) ? 16 : 0;
    }

    static {
        int var0 = 0;
        field_x = new int[256];
        field_t = "Player";
        for (var0 = 0; var0 < 256; var0++) {
          field_x[var0] = var0;
        }
    }
}
