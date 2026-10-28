/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    private int field_a;
    private int field_c;
    private int field_f;
    private int field_j;
    private int field_l;
    static String field_i;
    private int field_e;
    private int field_b;
    private int field_g;
    static String field_h;
    private int field_k;
    private int field_d;
    private int field_m;

    public static void releaseStatics(int guard) {
        if (guard >= -85) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          tf.a(101, (java.applet.Applet) null);
        }
        field_i = null;
        field_h = null;
    }

    final void d(byte param0) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        Object stackIn_14_0;
        boolean stackIn_14_3;
        int var6 = EscapeVector.obfuscationControl;
        SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, 64);
        if (mj.field_d >= 20) {
          stackIn_3_0 = 0;
        } else {
          stackIn_3_0 = -mj.field_d + 20;
        }
        int var2 = stackIn_3_0;
        if (var2 < 20) {
          stackIn_6_0 = (-var2 + 20) * 160 / 20;
        } else {
          stackIn_6_0 = 0;
        }
        int var3 = stackIn_6_0;
        if (mj.a((byte) 122)) {
          int var4 = 20 + InstructionsScreen.legacyMenuWidth(0) / 2;
          int var5 = 15 + SlidingSpriteTransition.legacyMenuHeight((byte) -96) / 2;
          GameAppletShell.a(var3, 320 - var4, 240 - var5, 6320248, 0, var5 + 241, -3, 321 + var4, 12110032, 3160124, 2 * var2);
          AchievementTracker.drawLegacyMenu(0);
          return;
        }
        GameAppletShell.a(var3, this.field_d - 6, this.field_f - 12, 6320248, 0, 24 * ch.field_a.itemCount + this.field_f + 12, -3, 6 + this.field_a, 12110032, 3160124, var2 * 2);
        int var4Lifetime1 = this.field_f;
        int var5Lifetime1 = 0;
        if (param0 <= 124) {
          return;
        }
        while (var5Lifetime1 < ch.field_a.itemCount) {
          int stackIn_13_1 = -19868;
          int stackIn_13_2 = var4Lifetime1;
          if (var5Lifetime1 != ch.field_a.selectedIndex) {
            stackIn_14_0 = this;
            stackIn_14_3 = false;
          } else {
            stackIn_14_0 = this;
            stackIn_14_3 = true;
          }
          this.a(stackIn_13_1, stackIn_13_2, stackIn_14_3, var5Lifetime1);
          var4Lifetime1 += 24;
          var5Lifetime1++;
        }
        return;
    }

    private final int a(int param0, boolean param1) {
        if (this.field_j == param0) {
          int var3_int = (ByteStorage.gameFont.stringWidth(DisplayNameForm.field_N) + ByteStorage.gameFont.stringWidth(LoginMethod.field_d)) / 2;
          int var4 = (-68 + var3_int) / 2;
          return 2 * -(var4 - ByteStorage.gameFont.stringWidth(DisplayNameForm.field_N));
        }
        if (this.field_c == param0) {
          int var3_intLifetime1 = (ByteStorage.gameFont.stringWidth(DisplayNameForm.field_N) + ByteStorage.gameFont.stringWidth(LoginMethod.field_d)) / 2;
          int var4Lifetime1 = (-68 + var3_intLifetime1) / 2;
          return -(-ByteStorage.gameFont.stringWidth(LoginMethod.field_d) + var4Lifetime1) * 2;
        }
        if (param0 == this.field_k) {
          int var3_intLifetime2 = ByteStorage.gameFont.stringWidth(PasswordValidator.field_s);
          int var4Lifetime2 = (ByteStorage.gameFont.stringWidth(NameSuggestionsPanel.field_J) + ByteStorage.gameFont.stringWidth(nb.field_d)) / 2;
          int var5 = (var3_intLifetime2 - var4Lifetime2) / 2;
          int var6 = (var5 + ByteStorage.gameFont.stringWidth(NameSuggestionsPanel.field_J)) * 2;
          int var7 = 2 * (ByteStorage.gameFont.stringWidth(nb.field_d) + var5);
          int stackIn_10_0 = (var7 >= var6) ? var7 : var6;
          return stackIn_10_0;
        }
        Object var3 = null;
        if (param0 == 0) {
          var3 = SocketConnector.field_g;
        }
        if (this.field_l == param0) {
          var3 = SpriteStrip.field_o;
        }
        if (this.field_b == param0) {
          var3 = mc.field_a;
        }
        if (param0 == this.field_g) {
          var3 = LoginForm.field_O;
        }
        if (param0 == this.field_m) {
          var3 = BrowserSessionMarkerState.field_b;
        }
        if (param1) {
          tf.b((byte) 111);
        }
        if (this.field_e == param0) {
          var3 = ArchiveRequest.field_q;
        }
        return ByteStorage.gameFont.stringWidth((String) (var3));
    }

    final void a(byte param0) {
        int var3 = EscapeVector.obfuscationControl;
        do {
          if (!AccountRequestDialog.pollKeyEvent(-105)) {
            if (param0 != -75) {
              this.b(true, -119);
            }
            ch.field_a.updateVerticalList(0, this.field_d, this.field_f, 24, this.field_a);
            boolean discarded$1 = this.a(true, 123);
            return;
          }
          if (PasswordValidator.field_n == 13) {
            da.field_c = null;
            return;
          }
          ch.field_a.handleKeyEvent((byte) 6);
        } while (!this.a(false, 122));
        return;
    }

    private final boolean a(boolean param0, int param1) {
        int var9 = EscapeVector.obfuscationControl;
        if (ch.field_a.selectionChanged) {
          ObjectSpriteSet.field_e.playSampleWithPan(ArchiveRequest.field_w, 100, 1536 * IterableNodeHashTable.field_c / 64, 8192);
        }
        if (ch.field_a.selectedIndex == 0 &&
          ch.field_a.isInitialActivation((byte) -18)) {
          SavedDataQuerySupport.field_d = true;
          Js5NetworkRequest.field_E = true;
          da.field_c = null;
          return true;
        }
        if (ch.field_a.selectedIndex == this.field_l &&
          ch.field_a.isInitialActivation((byte) -18)) {
          KeyboardStateSupport.b(112);
          BoundedRandomAccessFile.activeSession.quitRequested = true;
          BoundedRandomAccessFile.activeSession.advanceLevelRequested = true;
          BoundedRandomAccessFile.activeSession.finishPendingBonuses((byte) 68);
          da.field_c = null;
          SavedDataQuerySupport.field_d = true;
          Js5NetworkRequest.field_E = true;
          return true;
        }
        if (ch.field_a.selectedIndex == this.field_b &&
          ch.field_a.isInitialActivation((byte) -18)) {
          ek.a(ch.field_a.pointerDriven, false);
          return true;
        }
        if (this.field_g == ch.field_a.selectedIndex &&
          ch.field_a.isInitialActivation((byte) -18)) {
          BoundedRandomAccessFile.activeSession.replayMissionBriefing(256);
          return true;
        }
        if (ch.field_a.selectedIndex == this.field_j) {
          if (ch.field_a.isLeftPressed(13) &&
            IterableNodeHashTable.field_c > 0) {
            IterableNodeHashTable.field_c = IterableNodeHashTable.field_c - 8;
            if (IterableNodeHashTable.field_c < 0) {
              IterableNodeHashTable.field_c = 0;
            }
            TrackerMusicDefinition.d(8192);
          }
          if (ch.field_a.isRightPressed(-98) &&
            64 > IterableNodeHashTable.field_c) {
            IterableNodeHashTable.field_c = IterableNodeHashTable.field_c + 8;
            if (IterableNodeHashTable.field_c > 64) {
              IterableNodeHashTable.field_c = 64;
            }
            TrackerMusicDefinition.d(8192);
          }
          if (ch.field_a.isHomePressed(-10809)) {
            IterableNodeHashTable.field_c = 0;
            TrackerMusicDefinition.d(8192);
          }
          if (ch.field_a.isEndPressed(0)) {
            IterableNodeHashTable.field_c = 64;
            TrackerMusicDefinition.d(8192);
          }
          if (ch.field_a.isPointerHeld(false)) {
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
            if (ch.field_a.isInitialActivation((byte) -18) ||
              var7 != IterableNodeHashTable.field_c) {
              IterableNodeHashTable.field_c = var7;
              TrackerMusicDefinition.d(8192);
            }
          } else if (ch.field_a.isInitialActivation((byte) -18)) {
            TrackerMusicDefinition.d(8192);
          }
        }
        if (param1 < 121) {
          int discarded$0 = this.c((byte) -39);
        }
        if (this.field_c == ch.field_a.selectedIndex) {
          if (ch.field_a.isLeftPressed(115) &&
            0 < kc.field_b) {
            kc.field_b = kc.field_b - 8;
            if (0 > kc.field_b) {
              kc.field_b = 0;
            }
            TrackerMusicPlayer var10 = DraggableWidget.field_N;
            if (var10 != null) {
              var10.d(kc.field_b * GrowableIntList.field_b / 64);
            }
          }
          if (ch.field_a.isRightPressed(-98) &&
            kc.field_b < 64) {
            kc.field_b = kc.field_b + 8;
            if (64 < kc.field_b) {
              kc.field_b = 64;
            }
            TrackerMusicPlayer var11 = DraggableWidget.field_N;
            if (var11 != null) {
              var11.d(GrowableIntList.field_b * kc.field_b / 64);
            }
          }
          if (ch.field_a.isHomePressed(-10809)) {
            kc.field_b = 0;
            TrackerMusicPlayer var12 = DraggableWidget.field_N;
            if (var12 != null) {
              var12.d(GrowableIntList.field_b * kc.field_b / 64);
            }
          }
          if (ch.field_a.isEndPressed(0)) {
            kc.field_b = 64;
            TrackerMusicPlayer var13 = DraggableWidget.field_N;
            if (var13 != null) {
              var13.d(kc.field_b * GrowableIntList.field_b / 64);
            }
          }
          if (ch.field_a.isPointerHeld(false)) {
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
            kc.field_b = var7Lifetime1;
            TrackerMusicPlayer var8 = DraggableWidget.field_N;
            if (var8 != null) {
              var8.d(GrowableIntList.field_b * kc.field_b / 64);
            }
          }
        }
        if (ch.field_a.selectedIndex == this.field_m &&
          ch.field_a.isInitialActivation((byte) -18)) {
          if (IsaacRandom.field_d != null) {
            ri.a(-25123);
          } else {
            TickClock.a(24, param0);
          }
          ch.field_a.setPointerSelection(-1, true, 4767999);
        }
        if (ch.field_a.selectedIndex == this.field_k && (ch.field_a.isBackwardAction(false) ||
          ch.field_a.isForwardAction(23518))) {
          boolean stackIn_99_0 = !(SpriteState.field_r);
          SpriteState.field_r = stackIn_99_0;
          ObjectSpriteSet.field_e.playSampleWithPan(ArchiveRequest.field_w, 100, IterableNodeHashTable.field_c * 1536 / 64, 8192);
        }
        if (this.field_e != ch.field_a.selectedIndex) {
          return false;
        }
        if (!ch.field_a.isInitialActivation((byte) -18)) {
          return false;
        }
        BoundedRandomAccessFile.activeSession.quitRequested = true;
        BoundedRandomAccessFile.activeSession.finishPendingBonuses((byte) -48);
        SavedDataQuerySupport.field_d = true;
        da.field_c = null;
        Js5NetworkRequest.field_E = true;
        return true;
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          int var8 = EscapeVector.obfuscationControl;
          try {
            try {
              String var9 = param1.getParameter("cookieprefix");
              String var3 = var9 + "settings";
              String var4 = (String) (JavaScriptBridge.callWindowFunction(param1, "getcookies", -29155));
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
            if (param0 != -1) {
              tf.b((byte) -31);
            }
            String stackIn_16_0 = param1.getParameter("settings");
            return stackIn_16_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_19_0 = var2_ref;
            StringBuilder stackIn_19_1 = new StringBuilder().append("tf.D(").append(param0).append(',');
            if (param1 == null) {
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

    final void b(boolean param0, int param1) {
        if (param1 != 320) {
          this.a((byte) 11);
        }
        ch.field_a.setPointerSelection(ch.field_a.hitVerticalList((byte) 119, this.field_f, GzipDecoder.field_d, 24, this.field_a, UiContainer.field_y, this.field_d), param0, param1 + 4767679);
    }

    private final int c(byte param0) {
        int var5 = EscapeVector.obfuscationControl;
        int var2 = 0;
        for (int var3 = 0; var3 < ch.field_a.itemCount; var3++) {
          int var4 = this.a(var3, false);
          if (var2 < var4) {
            var2 = var4;
          }
        }
        int var4Lifetime1 = 35 / ((param0 - 14) / 50);
        return var2;
    }

    tf() {
        GameplaySession var5 = BoundedRandomAccessFile.activeSession;
        int var2 = 1;
        if (0 <= var5.levelIndex) {
          this.field_l = -2;
        } else {
          int incrementValue$0 = var2;
          var2++;
          this.field_l = incrementValue$0;
        }
        int incrementValue$1 = var2;
        var2++;
        this.field_b = incrementValue$1;
        if (var5.gameMode != 3 &&
          var5.levelIndex >= 0) {
          int incrementValue$2 = var2;
          var2++;
          this.field_g = incrementValue$2;
        } else {
          this.field_g = -2;
        }
        int incrementValue$3 = var2;
        var2++;
        this.field_j = incrementValue$3;
        int incrementValue$4 = var2;
        var2++;
        this.field_c = incrementValue$4;
        if (Js5NetworkRequest.field_x > 0) {
          int incrementValue$5 = var2;
          var2++;
          this.field_m = incrementValue$5;
        } else {
          this.field_m = -2;
        }
        if (var5.levelIndex >= 0 &&
          var5.scoringEnabled) {
          int incrementValue$6 = var2;
          var2++;
          this.field_k = incrementValue$6;
        } else {
          this.field_k = -2;
        }
        int incrementValue$7 = var2;
        var2++;
        this.field_e = incrementValue$7;
        this.field_f = 240 - var2 * 12;
        ch.field_a = new MenuInputState(var2);
        this.b(false, 320);
        int var3 = this.c((byte) -56);
        this.field_d = -10 + (-(var3 / 2) + 320);
        this.field_a = 10 + (320 + var3 / 2);
    }

    final static String b(byte param0) {
        if (param0 != 0) {
          tf.releaseStatics(-60);
        }
        return QuickChatDynamicCommand.incomingPackets.readString(false);
    }

    private final void a(int param0, int param1, boolean param2, int param3) {
        String stackIn_32_1 = null;
        mj.field_b.bindAsFramebuffer();
        SoftwareRasterizer.clearFramebuffer();
        int stackIn_3_0 = (!param2) ? 7899280 : 16777215;
        int var5 = stackIn_3_0;
        int var6 = mj.field_b.fullWidth / 2;
        if (param0 != -19868) {
          return;
        }
        if (0 == param3) {
          ByteStorage.gameFont.drawCentered(SocketConnector.field_g, var6, 22, var5, -1);
        }
        if (param3 == this.field_l) {
          ByteStorage.gameFont.drawCentered(SpriteStrip.field_o, var6, 22, var5, -1);
        }
        if (param3 == this.field_b) {
          ByteStorage.gameFont.drawCentered(mc.field_a, var6, 22, var5, -1);
        }
        if (param3 == this.field_g) {
          ByteStorage.gameFont.drawCentered(LoginForm.field_O, var6, 22, var5, -1);
        }
        if (param3 == this.field_j) {
          int var7 = ByteStorage.gameFont.stringWidth(DisplayNameForm.field_N);
          int var8 = ByteStorage.gameFont.stringWidth(LoginMethod.field_d);
          int stackIn_19_0 = (var8 < var7) ? var7 : var8;
          int var9 = stackIn_19_0;
          int var10 = var6 + (var9 - 68) / 2;
          ByteStorage.gameFont.drawRight(DisplayNameForm.field_N, var10, 22, var5, -1);
          SingleChildContainer.a(var10, 13202, 4, IterableNodeHashTable.field_c, var5);
        }
        if (param3 == this.field_c) {
          int var7Lifetime1 = ByteStorage.gameFont.stringWidth(DisplayNameForm.field_N);
          int var8Lifetime1 = ByteStorage.gameFont.stringWidth(LoginMethod.field_d);
          int stackIn_24_0 = (var8Lifetime1 >= var7Lifetime1) ? var8Lifetime1 : var7Lifetime1;
          int var9Lifetime1 = stackIn_24_0;
          int var10Lifetime1 = (-68 + var9Lifetime1) / 2 + var6;
          ByteStorage.gameFont.drawRight(LoginMethod.field_d, var10Lifetime1, 22, var5, -1);
          SingleChildContainer.a(var10Lifetime1, 13202, 4, kc.field_b, var5);
        }
        if (this.field_m == param3) {
          ByteStorage.gameFont.drawCentered(BrowserSessionMarkerState.field_b, var6, 22, var5, -1);
        }
        if (param3 == this.field_k) {
          int var7Lifetime2 = ByteStorage.gameFont.stringWidth(PasswordValidator.field_s);
          int var8Lifetime2 = (ByteStorage.gameFont.stringWidth(NameSuggestionsPanel.field_J) + ByteStorage.gameFont.stringWidth(nb.field_d)) / 2;
          int var9Lifetime2 = var6 + (var7Lifetime2 - var8Lifetime2) / 2;
          ByteStorage.gameFont.drawRight(PasswordValidator.field_s, var9Lifetime2, 22, var5, -1);
          BinaryBitmapFont stackIn_31_0 = ByteStorage.gameFont;
          if (SpriteState.field_r) {
            stackIn_32_1 = NameSuggestionsPanel.field_J;
          } else {
            stackIn_32_1 = nb.field_d;
          }
          ((BinaryBitmapFont) (Object) stackIn_31_0).drawLeft(stackIn_32_1, var9Lifetime2, 22, var5, -1);
        }
        if (param3 == this.field_e) {
          ByteStorage.gameFont.drawCentered(ArchiveRequest.field_q, var6, 22, var5, -1);
        }
        AlphaContainer.field_D.a(107);
        cf.a(mj.field_b, true, 1);
        mj.field_b.addOutline(5267536);
        mj.field_b.drawTransparent((-mj.field_b.fullWidth + 640) / 2, param1);
    }

    static {
        field_i = "Extract the crate";
    }
}
