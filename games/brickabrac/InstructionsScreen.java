/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InstructionsScreen extends MenuScreen {
    static int lobbyChatFilter;
    private int pageIndex;
    static int gameChatFilter;
    static String field_x;
    static String field_t;
    private int parentScreenId;
    static String field_w;

    final static int f(byte param0) {
        int stackIn_32_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        java.awt.Component var8 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          var1_int = 0;
          var2 = 0;
          while (jl.pollKeyEvent((byte) 5)) {
            UiComponent.field_H.navigateVertical(-1);
            if (UiComponent.field_H.isActivated((byte) 113)) {
              var1_int = 1;
            }
            if (MeshAttributeRecord.currentKeyCode != 13) {
              continue;
            }
            var2 = 1;
          }
          if (param0 != 124) {
            var8 = (java.awt.Component) null;
            InstructionsScreen.attachKeyboardInput(22, (java.awt.Component) null);
          }
          UiComponent.field_H.updatePointer(PlayerNameChooserPanel.b(120, ResourcePreparationEntry.pointerY, MusicPatch.pointerX), param0 + 27355, PlayerNameChooserPanel.b(param0 - 4, PlayerNameChooserPanel.pressY, LoadingProgressDialog.pressX));
          if (UiComponent.field_H.isActivated((byte) 113)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            UiComponent.field_H.selectedIndex >= 0) {
            var3 = UsernameSuggestionPanel.field_I[UiComponent.field_H.selectedIndex];
            if (var3 == 2) {
              ScreenshotViewer.c((byte) 3);
            } else if (5 == var3) {
              ScreenshotViewer.c((byte) 3);
            }
          } else {
            if (var2 != 0 &&
              ArchiveFetchClient.field_p != 2) {
              ScreenshotViewer.c((byte) 3);
            }
          }
          if (var3 == 0 &&
            ArchiveFetchClient.field_p == 2) {
            var4 = MonotonicTime.nowMillis(false) - un.field_g;
            var6 = (int)((-var4 + 10999L) / 1000L);
            if (var6 <= 0) {
              bq.a(true, 5, (byte) 104);
              var3 = 2;
            }
          }
          stackIn_32_0 = var3;
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "md.C(" + param0 + ')');
        }
    }

    final static int writeCompressedString(int obfuscationGuard, String text, PacketBuffer packet) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = packet.position;
          var5 = (CharSequence) ((Object) text);
          var4 = LevelList.a(var5, false);
          packet.writeUnsignedSmart(-1, var4.length);
          packet.position = packet.position + QuickChatCategoryRegistry.textHuffman.compress((byte) -119, var4.length, 0, packet.data, packet.position, var4);
          if (obfuscationGuard == 26152) {
            stackIn_4_0 = packet.position - var3_int;
            return stackIn_4_0;
          }
          stackIn_2_0 = -117;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("md.B(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (packet == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int getParentScreenId(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          return 71;
        }
        return this.parentScreenId;
    }

    final boolean isButtonEnabled(byte obfuscationGuard, int buttonIndex) {
        int var3;
        boolean stackIn_10_0 = false;
        boolean stackIn_16_0 = false;
        boolean stackIn_20_0 = false;
        if (buttonIndex < 0) {
          return false;
        }
        if (obfuscationGuard <= 80) {
          gameChatFilter = -12;
        }
        var3 = this.buttons[buttonIndex].actionId;
        if (var3 == 25) {
          stackIn_20_0 = !(0 >= this.pageIndex);
          return stackIn_20_0;
        }
        if (26 == var3) {
          stackIn_10_0 = !(gh.field_b.length - 1 <= this.pageIndex);
          return stackIn_10_0;
        }
        if (var3 != 37) {
          return true;
        }
        stackIn_16_0 = (gh.field_b.length - 1 == this.pageIndex) && (!IntKeyIndex.a((byte) -10));
        return stackIn_16_0;
    }

    final void handleNavigationKey(int obfuscationGuard, int keyCode, char character) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var5Lifetime1;
        int var6Lifetime1;
        var7 = BrickABrac.field_J ? 1 : 0;
        stackIn_3_0 = (!this.isButtonEnabled((byte) 113, 0)) ? 1 : 0;
        var4 = stackIn_3_0;
        stackIn_6_0 = (this.isButtonEnabled((byte) 104, 2)) ? 2 : 1;
        var5 = stackIn_6_0;
        stackIn_9_0 = (this.isButtonEnabled((byte) 111, 3)) ? 3 : var5;
        var5Lifetime1 = stackIn_9_0;
        if (!this.selection.isHeld(false)) {
          if (keyCode == 96) {
            var6 = -1 + this.selection.selectedIndex;
            if (!this.isButtonEnabled((byte) 86, var6)) {
              var6--;
            }
            if (var4 < this.selection.selectedIndex) {
              this.selection.setSelectedIndex(false, var6);
            } else {
              this.selection.setSelectedIndex(false, var5Lifetime1);
            }
          }
          if (keyCode == 97) {
            var6Lifetime1 = 1 + this.selection.selectedIndex;
            if (!this.isButtonEnabled((byte) 85, var6Lifetime1)) {
              var6Lifetime1++;
            }
            if (this.selection.selectedIndex < 0) {
              this.selection.setSelectedIndex(false, var4);
            } else {
              if (this.selection.selectedIndex >= var5Lifetime1) {
                this.selection.setSelectedIndex(false, var4);
              } else {
                this.selection.setSelectedIndex(false, var6Lifetime1);
              }
            }
          }
        }
        this.selection.pollKeyboardCode((byte) -124);
        if (obfuscationGuard != -120) {
          field_x = (String) null;
        }
    }

    InstructionsScreen() {
        super(7, 38, 460, 402, 35, LevelPackCard.field_n);
        ConditionalTextValue.field_j = PasswordFieldRenderer.field_D.ascent + PasswordFieldRenderer.field_D.descent + 1;
    }

    final void onEnter(boolean usePointer, int initialSelection, int obfuscationGuard) {
        int var7 = 0;
        int var4;
        int var5;
        MenuButton var6_ref_q;
        String var7_ref_String;
        int var8_int;
        int var9;
        String stackIn_5_0 = null;
        int var6;
        MenuButton var8;
        int var5Lifetime1;
        var9 = BrickABrac.field_J ? 1 : 0;
        super.onEnter(usePointer, 2, 98);
        this.pageIndex = 0;
        var4 = 0;
        for (var5 = 0; var5 < this.buttons.length; var5++) {
          var6_ref_q = this.buttons[var5];
          if (var6_ref_q.actionId != 8) {
            stackIn_5_0 = ArrayWidgetGroup.buttonLabels[var6_ref_q.actionId];
          } else {
            stackIn_5_0 = this.e((byte) 112);
          }
          var7_ref_String = stackIn_5_0;
          var8_int = ContextActionController.field_g.measureText(var7_ref_String);
          if (var8_int > var4) {
            var4 = var8_int;
          }
        }
        var4 += 30;
        var5Lifetime1 = 20 + 3 * var4;
        var6 = (-var5Lifetime1 + 640) / 2;
        if (obfuscationGuard < 96) {
          field_t = (String) null;
        }
        for (var7 = 0; var7 < this.buttons.length; var7++) {
          var8 = this.buttons[var7];
          var8.width = var4;
          var8.x = var6;
          if (var8.actionId != 26) {
            var6 = var6 + (var8.width + 10);
          }
        }
        this.parentScreenId = AccountMessageDialog.currentScreen.screenId;
    }

    public static void g(byte param0) {
        field_x = null;
        if (param0 <= 23) {
          return;
        }
        field_t = null;
        field_w = null;
    }

    final void drawScreen(byte obfuscationGuard) {
        int var4 = 0;
        int var2;
        int var3;
        PaletteFont var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = BrickABrac.field_J ? 1 : 0;
        super.drawScreen((byte) -27);
        GzipInflater.a(550, 5, 243, 5, 140, (byte) -101, 45);
        AchievementMaskRequest.a(this.screenId, 19);
        if (this.pageIndex != 0) {
          PasswordFieldRenderer.field_D.setInlineSprites(SingleChildWidget.field_C, nd.field_f);
        } else {
          PasswordFieldRenderer.field_D.setInlineSprites(un.field_e, vj.field_f);
        }
        var2 = PasswordFieldRenderer.field_D.wrapText(gh.field_b[this.pageIndex], CachedArchiveSource.field_t, ok.field_b);
        var3 = 145 - (-ConditionalTextValue.field_j - 4);
        for (var4 = 0; var2 > var4; var4++) {
          var5 = PasswordFieldRenderer.field_D;
          var6 = 2;
          var7 = -1;
          var8 = 0;
          if (ok.field_b[var4].startsWith("<bab:heading1>")) {
            var5 = ce.field_e;
            var8 = 4;
            var6 = 0;
          } else {
            if (ok.field_b[var4].startsWith("<bab:heading2>")) {
              var8 = 3;
              var6 = 8;
              var5 = ce.field_e;
            } else {
              if (ok.field_b[var4].startsWith("<bab:vspace>")) {
                var8 = 4;
              } else {
                if (!ok.field_b[var4].startsWith("<bab:smlvspace>")) {
                  if (!ok.field_b[var4].endsWith("<bab:smlbr><br>")) {
                    if (ok.field_b[var4].endsWith("<bab:smlvspace><br>") &&
                      !ok.field_b[var4].startsWith("<bab:smlvspace>")) {
                      var8 = 3;
                    }
                  } else {
                    var8 = 9;
                  }
                } else {
                  var8 = 3;
                }
              }
            }
          }
          var5.drawLeft(ok.field_b[var4], 60, var3, var6, var7);
          var3 = var3 + (ConditionalTextValue.field_j + var8);
        }
        if (obfuscationGuard >= -14) {
          InstructionsScreen.g((byte) 61);
        }
        ContextActionController.field_g.drawRight(RasterCacheSurface.a(this.pageIndex, 4), 581, -12 + (ContextActionController.field_g.capHeight + 373), 0, -1);
        this.a(0);
    }

    final static void attachKeyboardInput(int obfuscationGuard, java.awt.Component component) {
        try {
          int var2_int = -107 / ((obfuscationGuard + 53) / 50);
          component.setFocusTraversalKeysEnabled(false);
          component.addKeyListener(DualLinkDeque.keyboardInput);
          component.addFocusListener(DualLinkDeque.keyboardInput);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "md.G(" + obfuscationGuard + ',' + (component != null ? "{...}" : "null") + ')');
        }
    }

    final String e(byte param0) {
        if (param0 < 53) {
          java.awt.Component var3 = (java.awt.Component) null;
          InstructionsScreen.attachKeyboardInput(-108, (java.awt.Component) null);
        }
        return ArrayWidgetGroup.buttonLabels[7];
    }

    final boolean handleMenuAction(int buttonIndex, boolean inputFlag, byte obfuscationGuard) {
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var4;
        MenuButton var5;
        int var6;
        int var7;
        int var8;
        var8 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard != 123) {
          this.getButtonTop(117, -99);
        }
        var4 = 0;
        var5 = this.buttons[buttonIndex];
        var6 = var5.actionId;
        var7 = var6;
        if (26 == var7) {
          if (this.selection.isActivated((byte) 113) &&
            this.isButtonEnabled((byte) 106, buttonIndex)) {
            fieldTemp$1 = this.pageIndex + 1;
            this.pageIndex = this.pageIndex + 1;
            if (fieldTemp$1 >= gh.field_b.length) {
              this.pageIndex = gh.field_b.length - 1;
            }
            if (!this.isButtonEnabled((byte) 123, 2)) {
              this.selection.setSelectedIndex(false, 3);
              if (!this.isButtonEnabled((byte) 102, 3)) {
                this.selection.setSelectedIndex(false, 1);
              }
            }
            var4 = 1;
          }
        } else {
          if (25 != var7) {
            return super.handleMenuAction(buttonIndex, inputFlag, (byte) 123);
          }
          if (this.selection.isActivated((byte) 113) &&
            this.isButtonEnabled((byte) 91, buttonIndex)) {
            fieldTemp$2 = this.pageIndex - 1;
            this.pageIndex = this.pageIndex - 1;
            if (0 > fieldTemp$2) {
              this.pageIndex = 0;
            }
            var4 = 1;
            if (!this.isButtonEnabled((byte) 86, 0)) {
              this.selection.setSelectedIndex(false, 2);
            }
          }
        }
        return var4 != 0;
    }

    final int getButtonTop(int buttonIndex, int obfuscationGuard) {
        if (obfuscationGuard != 1) {
          return 42;
        }
        return this.buttonTop;
    }

    final static void a(String[] args, boolean param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!param1) {
            field_t = (String) null;
          }
          if (null != o.field_c) {
            o.field_c.suggestionPanel.setSuggestions((byte) -94, args);
          }
          if (MusicPatch.field_o != null) {
            MusicPatch.field_o.suggestionPanel.setSuggestions((byte) 102, args);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("md.D(");
          if (args == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_w = "<%0> has joined your game.";
        field_x = "Passwords must be between 5 and 20 letters and numbers";
        field_t = "This game option has not yet been unlocked for use.";
    }
}
