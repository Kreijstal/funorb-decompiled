/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PauseMenuScreen {
    private int right;
    private int musicAction;
    private int top;
    private int soundAction;
    private int skipTutorialAction;
    static String field_i;
    private int endGameAction;
    private int instructionsAction;
    private int briefingAction;
    static String field_h;
    private int elapsedTimeAction;
    private int left;
    private int fullscreenAction;

    public static void releaseStatics(int guard) {
        if (guard >= -85) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          PauseMenuScreen.readSettingsCookie(101, (java.applet.Applet) null);
        }
        field_i = null;
        field_h = null;
    }

    final void draw(byte guard) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        Object stackIn_14_0;
        boolean stackIn_14_3;
        int var6 = EscapeVector.obfuscationControl;
        SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, 64);
        if (LoginHandshakeSupport.field_d >= 20) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = -LoginHandshakeSupport.field_d + 20;
        }
        int var2 = stackIn_3_0;
        if (var2 < 20) {
          stackIn_6_0 = (-var2 + 20) * 160 / 20;
        } else {
          stackIn_6_0 = 0;
        }
        int var3 = stackIn_6_0;
        if (LoginHandshakeSupport.isLegacyMenuVisible((byte) 122)) {
          int var4 = 20 + InstructionsScreen.legacyMenuWidth(0) / 2;
          int var5 = 15 + SlidingSpriteTransition.legacyMenuHeight((byte) -96) / 2;
          GameAppletShell.a(var3, 320 - var4, 240 - var5, 6320248, 0, var5 + 241, -3, 321 + var4, 12110032, 3160124, 2 * var2);
          AchievementTracker.drawLegacyMenu(0);
          return;
        }
        GameAppletShell.a(var3, this.left - 6, this.top - 12, 6320248, 0, 24 * PauseMenuState.input.itemCount + this.top + 12, -3, 6 + this.right, 12110032, 3160124, var2 * 2);
        int var4Lifetime1 = this.top;
        int var5Lifetime1 = 0;
        if (guard <= 124) {
          return;
        }
        while (var5Lifetime1 < PauseMenuState.input.itemCount) {
          int stackIn_13_1 = -19868;
          int stackIn_13_2 = var4Lifetime1;
          if (var5Lifetime1 != PauseMenuState.input.selectedIndex) {
            stackIn_14_0 = this;
            stackIn_14_3 = false;
          } else {
            stackIn_14_0 = this;
            stackIn_14_3 = true;
          }
          this.drawRow(stackIn_13_1, stackIn_13_2, stackIn_14_3, var5Lifetime1);
          var4Lifetime1 += 24;
          var5Lifetime1++;
        }
        return;
    }

    private final int rowWidth(int action, boolean guard) {
        if (this.soundAction == action) {
          int var3_int = (ByteStorage.gameFont.stringWidth(DisplayNameForm.field_N) + ByteStorage.gameFont.stringWidth(LoginMethod.field_d)) / 2;
          int var4 = (-68 + var3_int) / 2;
          return 2 * -(var4 - ByteStorage.gameFont.stringWidth(DisplayNameForm.field_N));
        }
        if (this.musicAction == action) {
          int var3_intLifetime1 = (ByteStorage.gameFont.stringWidth(DisplayNameForm.field_N) + ByteStorage.gameFont.stringWidth(LoginMethod.field_d)) / 2;
          int var4Lifetime1 = (-68 + var3_intLifetime1) / 2;
          return -(-ByteStorage.gameFont.stringWidth(LoginMethod.field_d) + var4Lifetime1) * 2;
        }
        if (action == this.elapsedTimeAction) {
          int var3_intLifetime2 = ByteStorage.gameFont.stringWidth(PasswordValidator.field_s);
          int var4Lifetime2 = (ByteStorage.gameFont.stringWidth(NameSuggestionsPanel.field_J) + ByteStorage.gameFont.stringWidth(MembershipAssetSupport.field_d)) / 2;
          int var5 = (var3_intLifetime2 - var4Lifetime2) / 2;
          int var6 = (var5 + ByteStorage.gameFont.stringWidth(NameSuggestionsPanel.field_J)) * 2;
          int var7 = 2 * (ByteStorage.gameFont.stringWidth(MembershipAssetSupport.field_d) + var5);
          int stackIn_10_0 = (var7 >= var6) ? var7 : var6;
          return stackIn_10_0;
        }
        Object var3 = null;
        if (action == 0) {
          var3 = SocketConnector.field_g;
        }
        if (this.skipTutorialAction == action) {
          var3 = SpriteStrip.field_o;
        }
        if (this.instructionsAction == action) {
          var3 = LoginHandshakeState.instructionsLabel;
        }
        if (action == this.briefingAction) {
          var3 = LoginForm.field_O;
        }
        if (action == this.fullscreenAction) {
          var3 = BrowserSessionMarkerState.field_b;
        }
        if (guard) {
          PauseMenuScreen.readIncomingString((byte) 111);
        }
        if (this.endGameAction == action) {
          var3 = ArchiveRequest.field_q;
        }
        return ByteStorage.gameFont.stringWidth((String) (var3));
    }

    final void update(byte guard) {
        int var3 = EscapeVector.obfuscationControl;
        do {
          if (!AccountRequestDialog.pollKeyEvent(-105)) {
            if (guard != -75) {
              this.updatePointerSelection(true, -119);
            }
            PauseMenuState.input.updateVerticalList(0, this.left, this.top, 24, this.right);
            boolean discarded$1 = this.handleActivation(true, 123);
            return;
          }
          if (PasswordValidator.field_n == 13) {
            SessionMenuSupport.field_c = null;
            return;
          }
          PauseMenuState.input.handleKeyEvent((byte) 6);
        } while (!this.handleActivation(false, 122));
        return;
    }

    private final boolean handleActivation(boolean pointerDriven, int guard) {
        int var9 = EscapeVector.obfuscationControl;
        if (PauseMenuState.input.selectionChanged) {
          ObjectSpriteSet.field_e.playSampleWithPan(ArchiveRequest.field_w, 100, 1536 * IterableNodeHashTable.field_c / 64, 8192);
        }
        if (PauseMenuState.input.selectedIndex == 0 &&
          PauseMenuState.input.isInitialActivation((byte) -18)) {
          SavedDataQuerySupport.field_d = true;
          Js5NetworkRequest.field_E = true;
          SessionMenuSupport.field_c = null;
          return true;
        }
        if (PauseMenuState.input.selectedIndex == this.skipTutorialAction &&
          PauseMenuState.input.isInitialActivation((byte) -18)) {
          KeyboardStateSupport.advanceSessionCounters(112);
          BoundedRandomAccessFile.activeSession.quitRequested = true;
          BoundedRandomAccessFile.activeSession.advanceLevelRequested = true;
          BoundedRandomAccessFile.activeSession.finishPendingBonuses((byte) 68);
          SessionMenuSupport.field_c = null;
          SavedDataQuerySupport.field_d = true;
          Js5NetworkRequest.field_E = true;
          return true;
        }
        if (PauseMenuState.input.selectedIndex == this.instructionsAction &&
          PauseMenuState.input.isInitialActivation((byte) -18)) {
          InstructionsNavigationSupport.openInstructions(PauseMenuState.input.pointerDriven, false);
          return true;
        }
        if (this.briefingAction == PauseMenuState.input.selectedIndex &&
          PauseMenuState.input.isInitialActivation((byte) -18)) {
          BoundedRandomAccessFile.activeSession.replayMissionBriefing(256);
          return true;
        }
        if (PauseMenuState.input.selectedIndex == this.soundAction) {
          if (PauseMenuState.input.isLeftPressed(13) &&
            IterableNodeHashTable.field_c > 0) {
            IterableNodeHashTable.field_c = IterableNodeHashTable.field_c - 8;
            if (IterableNodeHashTable.field_c < 0) {
              IterableNodeHashTable.field_c = 0;
            }
            TrackerMusicDefinition.d(8192);
          }
          if (PauseMenuState.input.isRightPressed(-98) &&
            64 > IterableNodeHashTable.field_c) {
            IterableNodeHashTable.field_c = IterableNodeHashTable.field_c + 8;
            if (IterableNodeHashTable.field_c > 64) {
              IterableNodeHashTable.field_c = 64;
            }
            TrackerMusicDefinition.d(8192);
          }
          if (PauseMenuState.input.isHomePressed(-10809)) {
            IterableNodeHashTable.field_c = 0;
            TrackerMusicDefinition.d(8192);
          }
          if (PauseMenuState.input.isEndPressed(0)) {
            IterableNodeHashTable.field_c = 64;
            TrackerMusicDefinition.d(8192);
          }
          if (PauseMenuState.input.isPointerHeld(false)) {
            int var3 = ByteStorage.gameFont.stringWidth(DisplayNameForm.field_N);
            int var4 = ByteStorage.gameFont.stringWidth(LoginMethod.field_d);
            int stackIn_39_0 = (var3 > var4) ? var3 : var4;
            int var5 = stackIn_39_0;
            int var6 = 320 + (var5 - 68) / 2;
            int var7 = -var6 - (2 - GzipDecoder.field_d);
            if (var7 < 0) {
              var7 = 0;
            } else if (var7 > 64) {
              var7 = 64;
            }
            if (PauseMenuState.input.isInitialActivation((byte) -18) ||
              var7 != IterableNodeHashTable.field_c) {
              IterableNodeHashTable.field_c = var7;
              TrackerMusicDefinition.d(8192);
            }
          } else if (PauseMenuState.input.isInitialActivation((byte) -18)) {
            TrackerMusicDefinition.d(8192);
          }
        }
        if (guard < 121) {
          int discarded$0 = this.maximumRowWidth((byte) -39);
        }
        if (this.musicAction == PauseMenuState.input.selectedIndex) {
          if (PauseMenuState.input.isLeftPressed(115) &&
            0 < MembershipPromotionSupport.field_b) {
            MembershipPromotionSupport.field_b = MembershipPromotionSupport.field_b - 8;
            if (0 > MembershipPromotionSupport.field_b) {
              MembershipPromotionSupport.field_b = 0;
            }
            TrackerMusicPlayer var10 = DraggableWidget.field_N;
            if (var10 != null) {
              var10.d(MembershipPromotionSupport.field_b * GrowableIntList.field_b / 64);
            }
          }
          if (PauseMenuState.input.isRightPressed(-98) &&
            MembershipPromotionSupport.field_b < 64) {
            MembershipPromotionSupport.field_b = MembershipPromotionSupport.field_b + 8;
            if (64 < MembershipPromotionSupport.field_b) {
              MembershipPromotionSupport.field_b = 64;
            }
            TrackerMusicPlayer var11 = DraggableWidget.field_N;
            if (var11 != null) {
              var11.d(GrowableIntList.field_b * MembershipPromotionSupport.field_b / 64);
            }
          }
          if (PauseMenuState.input.isHomePressed(-10809)) {
            MembershipPromotionSupport.field_b = 0;
            TrackerMusicPlayer var12 = DraggableWidget.field_N;
            if (var12 != null) {
              var12.d(GrowableIntList.field_b * MembershipPromotionSupport.field_b / 64);
            }
          }
          if (PauseMenuState.input.isEndPressed(0)) {
            MembershipPromotionSupport.field_b = 64;
            TrackerMusicPlayer var13 = DraggableWidget.field_N;
            if (var13 != null) {
              var13.d(MembershipPromotionSupport.field_b * GrowableIntList.field_b / 64);
            }
          }
          if (PauseMenuState.input.isPointerHeld(false)) {
            int var3Lifetime1 = ByteStorage.gameFont.stringWidth(DisplayNameForm.field_N);
            int var4Lifetime1 = ByteStorage.gameFont.stringWidth(LoginMethod.field_d);
            int stackIn_79_0 = (var3Lifetime1 <= var4Lifetime1) ? var4Lifetime1 : var3Lifetime1;
            int var5Lifetime1 = stackIn_79_0;
            int var6Lifetime1 = 320 + (var5Lifetime1 - 68) / 2;
            int var7Lifetime1 = -2 - (var6Lifetime1 - GzipDecoder.field_d);
            if (!(var7Lifetime1 >= 0)) {
              var7Lifetime1 = 0;
            } else if (var7Lifetime1 > 64) {
              var7Lifetime1 = 64;
            }
            MembershipPromotionSupport.field_b = var7Lifetime1;
            TrackerMusicPlayer var8 = DraggableWidget.field_N;
            if (var8 != null) {
              var8.d(GrowableIntList.field_b * MembershipPromotionSupport.field_b / 64);
            }
          }
        }
        if (PauseMenuState.input.selectedIndex == this.fullscreenAction &&
          PauseMenuState.input.isInitialActivation((byte) -18)) {
          if (IsaacRandom.field_d != null) {
            DisplayAndRatingSupport.exitFullscreen(-25123);
          } else {
            TickClock.a(24, pointerDriven);
          }
          PauseMenuState.input.setPointerSelection(-1, true, 4767999);
        }
        if (PauseMenuState.input.selectedIndex == this.elapsedTimeAction && (PauseMenuState.input.isBackwardAction(false) ||
          PauseMenuState.input.isForwardAction(23518))) {
          boolean stackIn_99_0 = !(SpriteState.field_r);
          SpriteState.field_r = stackIn_99_0;
          ObjectSpriteSet.field_e.playSampleWithPan(ArchiveRequest.field_w, 100, IterableNodeHashTable.field_c * 1536 / 64, 8192);
        }
        if (this.endGameAction != PauseMenuState.input.selectedIndex) {
          return false;
        }
        if (!PauseMenuState.input.isInitialActivation((byte) -18)) {
          return false;
        }
        BoundedRandomAccessFile.activeSession.quitRequested = true;
        BoundedRandomAccessFile.activeSession.finishPendingBonuses((byte) -48);
        SavedDataQuerySupport.field_d = true;
        SessionMenuSupport.field_c = null;
        Js5NetworkRequest.field_E = true;
        return true;
    }

    final static String readSettingsCookie(int guard, java.applet.Applet applet) {
        try {
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          int var8 = EscapeVector.obfuscationControl;
          try {
            try {
              String var9 = applet.getParameter("cookieprefix");
              String var3 = var9 + "settings";
              String var4 = (String) (JavaScriptBridge.callWindowFunction(applet, "getcookies", -29155));
              String[] var5 = ModalPanel.splitString(-128, var4, ';');
              for (int var6 = 0; var6 < var5.length; var6++) {
                int var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  String stackIn_6_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_6_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var2 = decompiledCaughtException;
            }
            if (MenuEdgeSegment.field_p != null) {
              String stackIn_12_0 = MenuEdgeSegment.field_p;
              return stackIn_12_0;
            }
            if (guard != -1) {
              PauseMenuScreen.readIncomingString((byte) -31);
            }
            String stackIn_16_0 = applet.getParameter("settings");
            return stackIn_16_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_19_0 = var2_ref;
            StringBuilder stackIn_19_1 = new StringBuilder().append("tf.D(").append(guard).append(',');
            if (applet == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void updatePointerSelection(boolean pointerDriven, int guard) {
        if (guard != 320) {
          this.update((byte) 11);
        }
        PauseMenuState.input.setPointerSelection(PauseMenuState.input.hitVerticalList((byte) 119, this.top, GzipDecoder.field_d, 24, this.right, UiContainer.field_y, this.left), pointerDriven, guard + 4767679);
    }

    private final int maximumRowWidth(byte guard) {
        int var5 = EscapeVector.obfuscationControl;
        int var2 = 0;
        for (int var3 = 0; var3 < PauseMenuState.input.itemCount; var3++) {
          int var4 = this.rowWidth(var3, false);
          if (var2 < var4) {
            var2 = var4;
          }
        }
        int var4Lifetime1 = 35 / ((guard - 14) / 50);
        return var2;
    }

    PauseMenuScreen() {
        GameplaySession var5 = BoundedRandomAccessFile.activeSession;
        int var2 = 1;
        if (0 <= var5.levelIndex) {
          this.skipTutorialAction = -2;
        } else {
          int incrementValue$0 = var2;
          var2++;
          this.skipTutorialAction = incrementValue$0;
        }
        int incrementValue$1 = var2;
        var2++;
        this.instructionsAction = incrementValue$1;
        if (var5.gameMode != 3 &&
          var5.levelIndex >= 0) {
          int incrementValue$2 = var2;
          var2++;
          this.briefingAction = incrementValue$2;
        } else {
          this.briefingAction = -2;
        }
        int incrementValue$3 = var2;
        var2++;
        this.soundAction = incrementValue$3;
        int incrementValue$4 = var2;
        var2++;
        this.musicAction = incrementValue$4;
        if (Js5NetworkRequest.field_x > 0) {
          int incrementValue$5 = var2;
          var2++;
          this.fullscreenAction = incrementValue$5;
        } else {
          this.fullscreenAction = -2;
        }
        if (var5.levelIndex >= 0 &&
          var5.scoringEnabled) {
          int incrementValue$6 = var2;
          var2++;
          this.elapsedTimeAction = incrementValue$6;
        } else {
          this.elapsedTimeAction = -2;
        }
        int incrementValue$7 = var2;
        var2++;
        this.endGameAction = incrementValue$7;
        this.top = 240 - var2 * 12;
        PauseMenuState.input = new MenuInputState(var2);
        this.updatePointerSelection(false, 320);
        int var3 = this.maximumRowWidth((byte) -56);
        this.left = -10 + (-(var3 / 2) + 320);
        this.right = 10 + (320 + var3 / 2);
    }

    final static String readIncomingString(byte guard) {
        if (guard != 0) {
          PauseMenuScreen.releaseStatics(-60);
        }
        return QuickChatDynamicCommand.incomingPackets.readString(false);
    }

    private final void drawRow(int guard, int y, boolean selected, int action) {
        String stackIn_32_1 = null;
        LoginHandshakeSupport.field_b.bindAsFramebuffer();
        SoftwareRasterizer.clearFramebuffer();
        int stackIn_3_0 = (!selected) ? 7899280 : 16777215;
        int var5 = stackIn_3_0;
        int var6 = LoginHandshakeSupport.field_b.fullWidth / 2;
        if (guard != -19868) {
          return;
        }
        if (0 == action) {
          ByteStorage.gameFont.drawCentered(SocketConnector.field_g, var6, 22, var5, -1);
        }
        if (action == this.skipTutorialAction) {
          ByteStorage.gameFont.drawCentered(SpriteStrip.field_o, var6, 22, var5, -1);
        }
        if (action == this.instructionsAction) {
          ByteStorage.gameFont.drawCentered(LoginHandshakeState.instructionsLabel, var6, 22, var5, -1);
        }
        if (action == this.briefingAction) {
          ByteStorage.gameFont.drawCentered(LoginForm.field_O, var6, 22, var5, -1);
        }
        if (action == this.soundAction) {
          int var7 = ByteStorage.gameFont.stringWidth(DisplayNameForm.field_N);
          int var8 = ByteStorage.gameFont.stringWidth(LoginMethod.field_d);
          int stackIn_19_0 = (var8 < var7) ? var7 : var8;
          int var9 = stackIn_19_0;
          int var10 = var6 + (var9 - 68) / 2;
          ByteStorage.gameFont.drawRight(DisplayNameForm.field_N, var10, 22, var5, -1);
          SingleChildContainer.a(var10, 13202, 4, IterableNodeHashTable.field_c, var5);
        }
        if (action == this.musicAction) {
          int var7Lifetime1 = ByteStorage.gameFont.stringWidth(DisplayNameForm.field_N);
          int var8Lifetime1 = ByteStorage.gameFont.stringWidth(LoginMethod.field_d);
          int stackIn_24_0 = (var8Lifetime1 >= var7Lifetime1) ? var8Lifetime1 : var7Lifetime1;
          int var9Lifetime1 = stackIn_24_0;
          int var10Lifetime1 = (-68 + var9Lifetime1) / 2 + var6;
          ByteStorage.gameFont.drawRight(LoginMethod.field_d, var10Lifetime1, 22, var5, -1);
          SingleChildContainer.a(var10Lifetime1, 13202, 4, MembershipPromotionSupport.field_b, var5);
        }
        if (this.fullscreenAction == action) {
          ByteStorage.gameFont.drawCentered(BrowserSessionMarkerState.field_b, var6, 22, var5, -1);
        }
        if (action == this.elapsedTimeAction) {
          int var7Lifetime2 = ByteStorage.gameFont.stringWidth(PasswordValidator.field_s);
          int var8Lifetime2 = (ByteStorage.gameFont.stringWidth(NameSuggestionsPanel.field_J) + ByteStorage.gameFont.stringWidth(MembershipAssetSupport.field_d)) / 2;
          int var9Lifetime2 = var6 + (var7Lifetime2 - var8Lifetime2) / 2;
          ByteStorage.gameFont.drawRight(PasswordValidator.field_s, var9Lifetime2, 22, var5, -1);
          BinaryBitmapFont stackIn_31_0 = ByteStorage.gameFont;
          if (SpriteState.field_r) {
            stackIn_32_1 = NameSuggestionsPanel.field_J;
          } else {
            stackIn_32_1 = MembershipAssetSupport.field_d;
          }
          ((BinaryBitmapFont) (Object) stackIn_31_0).drawLeft(stackIn_32_1, var9Lifetime2, 22, var5, -1);
        }
        if (action == this.endGameAction) {
          ByteStorage.gameFont.drawCentered(ArchiveRequest.field_q, var6, 22, var5, -1);
        }
        AlphaContainer.field_D.a(107);
        MeshProjectionSupport.markSpriteEdges(LoginHandshakeSupport.field_b, true, 1);
        LoginHandshakeSupport.field_b.addOutline(5267536);
        LoginHandshakeSupport.field_b.drawTransparent((-LoginHandshakeSupport.field_b.fullWidth + 640) / 2, y);
    }

    static {
        field_i = "Extract the crate";
    }
}
