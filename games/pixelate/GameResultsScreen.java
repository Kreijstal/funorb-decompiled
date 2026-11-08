/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameResultsScreen extends MenuScreen {
    static int field_r;
    private int field_J;
    private String field_y;
    private String field_A;
    private String field_v;
    private String field_o;
    private String field_K;
    private String field_s;
    static SecondaryNodeHashTable field_q;
    private String field_w;
    private int field_H;
    private boolean field_B;
    private int field_x;
    private int field_I;
    private int field_z;
    private String[] field_M;
    private int field_G;
    private String field_u;
    static String field_D;
    private int field_E;
    private String[] field_p;
    static String field_t;

    final void showSinglePlayerResults(int param0, int param1, boolean param2, boolean param3, boolean param4, boolean param5, int param6, int param7, int param8, int param9) {
        int var12;
        String stackIn_8_1 = null;
        String stackIn_12_1 = null;
        var12 = Pixelate.field_H ? 1 : 0;
        this.field_G = 0;
        if (param7 != 2) {
          GameResultsScreen.releaseStatics((byte) -64);
        }
        this.field_v = this.formatTime(10, param0);
        this.field_E = param1;
        this.field_H = param8;
        this.field_J = param6;
        this.field_K = NumberFormatHelpers.formatThousands(false, param9);
        if (!param4) {
          if (!param5) {
            if (param2) {
              this.field_A = CacheReference.field_u;
              this.field_I = 5;
            } else {
              this.field_A = AlternateNameCredentials.field_m;
              this.field_I = 0;
            }
          } else {
            this.field_A = SecondaryNodeDeque.field_d;
            this.field_I = 9;
          }
        } else {
          if (!param5 &&
            !param2) {
            if (param3) {
              stackIn_8_1 = ByteStorage.field_c;
            } else {
              stackIn_8_1 = AlternateNameCredentials.field_m;
            }
            this.field_A = stackIn_8_1;
            this.field_I = 0;
          } else {
            if (param3) {
              stackIn_12_1 = ByteStorage.field_c;
            } else {
              stackIn_12_1 = MusicCrossfadeStream.field_J;
            }
            this.field_A = stackIn_12_1;
            this.field_I = 10;
          }
        }
        this.field_x = -1;
    }

    final void draw(int param0) {
        int var5_int = 0;
        int var2;
        int var3;
        int var4;
        PaletteBitmapFont var5;
        int var6;
        int var7;
        int var8;
        Match var9;
        var8 = Pixelate.field_H ? 1 : 0;
        if (this.field_G != 1) {
          NumericDateInputWidget.field_W[7].drawTransparent(0, 45);
        } else {
          NumericDateInputWidget.field_W[4].drawTransparent(0, 45);
        }
        this.drawDefaultBackdrop((byte) -81);
        this.drawRows((byte) -71);
        var2 = 20;
        var3 = 70;
        var4 = 167;
        if (param0 != 11) {
          var9 = (Match) null;
          this.showMultiplayerResults((String) null, 91, (Match) null);
        }
        for (var5_int = 0; 5 > var5_int; var5_int++) {
          LoginCredentials.field_e.field_a[0].drawOpaque(var3, var4);
          var4 = var4 + var2;
          LoginCredentials.field_e.field_a[1].drawOpaque(var3 + (var2 >> 2), var4);
          var4 = var4 + var2;
        }
        var5 = PieceTiming.field_e;
        var6 = 190;
        var7 = var5.maxAscent + var5.maxDescent + 3;
        if (this.field_G == 0) {
          var5.drawText(UiTheme.field_b, 120, var6, 0, -1);
          var5.drawRightAlignedText(this.field_v, 540, var6, 1, -1);
          var6 = var6 + var7;
          var5.drawText(PolygonClipHelpers.field_d, 120, var6, 0, -1);
          var5.drawRightAlignedText(Integer.toString(this.field_E), 540, var6, 1, -1);
          var6 = var6 + var7;
          var5.drawText(MusicCrossfadeStream.field_E, 120, var6, 0, -1);
          var5.drawRightAlignedText(Integer.toString(this.field_H), 540, var6, 1, -1);
          var6 = var6 + var7;
          var5.drawText(IconTextComponent.field_Lb, 120, var6, 0, -1);
          var5.drawRightAlignedText(Integer.toString(this.field_J), 540, var6, 1, -1);
          var6 = var6 + var7;
          SoftwareRasterizer.fillRectangle(118, var6 - 5, 424, 9, 0);
          SoftwareRasterizer.fillRectangle(120, var6 - 2, 420, 3, 16777215);
          var6 = var6 + var7;
          var5.drawText(CanvasInputHelpers.field_c, 120, var6, 0, -1);
          var5.drawRightAlignedText(this.field_K, 540, var6, 1, -1);
        } else {
          if (this.field_G != 1) {
            if (this.field_G == 2) {
              if (this.field_o != null) {
                var5.drawCentered(this.field_o, 330, var6, 0, -1);
              }
              var6 = var6 + var7;
              var5.drawText("Final Scores:", 120, var6, 0, -1);
              var6 = var6 + var7;
              var5.drawText(this.field_M[this.field_z], 120, var6, 0, -1);
              var5.drawRightAlignedText(this.field_p[this.field_z], 540, var6, 1, -1);
              var6 = var6 + var7;
              var5.drawText(this.field_M[1 - this.field_z], 120, var6, 0, -1);
              var5.drawRightAlignedText(this.field_p[1 - this.field_z], 540, var6, 1, -1);
              var6 = var6 + var7;
              var5.drawCentered(this.field_w, 330, var6, 0, -1);
            }
          } else {
            var6 = var6 + var7;
            var5.drawText(UiTheme.field_b, 120, var6, 0, -1);
            var5.drawRightAlignedText(this.field_v, 540, var6, 1, -1);
            var6 = var6 + var7;
            var5.drawText(PolygonClipHelpers.field_d, 120, var6, 0, -1);
            var5.drawRightAlignedText(this.field_y, 540, var6, 1, -1);
            var6 = var6 + var7;
            SoftwareRasterizer.fillRectangle(118, var6 - 5, 424, 9, 0);
            SoftwareRasterizer.fillRectangle(120, var6 - 2, 420, 3, 16777215);
            var6 = var6 + var7;
            var5.drawCentered(this.field_u, 330, var6, 0, -1);
          }
        }
    }

    GameResultsScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    private final String formatTime(int param0, int param1) {
        if (param0 != 10) {
          this.field_H = -21;
        }
        int var3 = param1 / 3000;
        int var4 = param1 % 3000 / 50;
        return var3 + ":" + (var4 < 10 ? "0" : "") + var4;
    }

    private final int getRowTextWidth(int param0, int param1) {
        int var3 = PieceTiming.field_e.textWidth(param1 == 0 ? this.field_A : this.field_s);
        if (param1 == 0) {
          var3 += 40;
        }
        int var4 = -32 / ((param0 + 16) / 47);
        return var3;
    }

    final void hideRematchOption(int param0) {
        this.field_B = false;
        if (param0 >= -119) {
          this.field_u = (String) null;
        }
    }

    final boolean isRowEnabled(int param0, int param1) {
        boolean stackIn_11_0 = false;
        if (param0 >= -112) {
          this.hideRematchOption(-55);
        }
        boolean decompiledFrameRemainder0 = true;
        if (param1 != 0 && ((1 != this.field_G ||
          this.field_x == -1) &&
          (2 != this.field_G ||
          !this.field_B))) {
          stackIn_11_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_11_0 = true;
        }
        return stackIn_11_0;
    }

    final int getRowY(int param0, int param1) {
        int var3 = 120 / ((-13 - param0) / 37);
        return this.field_d;
    }

    final void enterScreen(int param0, int param1, boolean param2) {
        super.enterScreen(param0, !this.isRowEnabled(-113, 1) ? 0 : 1, param2);
    }

    final void setPuzzleResult(boolean param0, boolean param1, int param2, int param3, byte param4, int param5, int param6) {
        this.field_u = !param1 ? PrivateChatHelpers.field_c : MouseInputHandler.field_a;
        this.field_G = 1;
        this.field_x = param5;
        this.field_y = AlphaContainer.formatTemplate(BoundedRandomAccessFile.field_b, param4 + 21, new String[]{Integer.toString(param2), Integer.toString(param6)});
        if (param4 != 34) {
          return;
        }
        this.field_v = this.formatTime(param4 - 24, param3);
        if (this.field_x != -1) {
          this.field_s = !param1 ? LobbyGameLookupHelpers.field_f : ModalStack.field_P;
        }
        if (!param0) {
          this.field_I = 17;
          this.field_A = GameApplet.field_f;
        } else {
          this.field_I = 9;
          this.field_A = SecondaryNodeDeque.field_d;
        }
    }

    final void onCancel(byte param0) {
        this.leaveResults((byte) 12, false);
        if (param0 > -13) {
          GameResultsScreen.releaseStatics((byte) 29);
        }
    }

    final static int computeTimeBonusSeconds(byte param0, int param1) {
        int var2 = -((-10 + param1) / 2) + 25;
        int var3 = 19 % ((param0 - 54) / 38);
        if (var2 < 5) {
          var2 = 5;
        }
        return var2;
    }

    final int getRowRight(int param0, boolean param1) {
        if (param1) {
          field_r = -93;
        }
        return this.getRowLeft(param0, (byte) 90) + this.getRowTextWidth(-112, param0);
    }

    final void drawScreenBackground(int param0) {
        if (param0 != 0) {
          this.field_K = (String) null;
        }
        if (null == NameSuggestionHelpers.field_e) {
          super.drawScreenBackground(0);
        } else {
          NameSuggestionHelpers.field_e.render(false, param0 ^ 0);
          SoftwareRasterizer.darkenRectangle(0, 0, 640, 480);
          HighscoreSubmission.drawBackgroundSquares((byte) -75);
        }
    }

    final void continueFromResults(boolean param0, int param1) {
        int discarded$0 = 0;
        int var3 = 0;
        if (param1 >= -106) {
          discarded$0 = this.getRowTextWidth(-3, 100);
        }
        if (DateOfBirthValidator.field_j == 1) {
          ArchiveIndex.startPuzzleModeGame(this.field_x, (byte) 126);
          LobbyListBindingHelpers.field_e = 14;
          var3 = param0 ? 1 : 0;
          ScreenChangeHelpers.changeScreen(!AlternateNameCredentials.isOfflineOrAccountUi(121) ? 0 : 12, -3, var3 != 0, -25528);
        } else {
          if (DateOfBirthValidator.field_j == 2) {
            NameSuggestionHelpers.field_e.sendResultsDismissed(46);
          }
        }
    }

    final void showMultiplayerResults(String param0, int param1, Match param2) {
        int var4_int = 0;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          this.field_G = 2;
          if (param0 != null) {
            this.field_w = AlphaContainer.formatTemplate(TextButton.field_G, param1 ^ -47, new String[]{param0});
          } else {
            this.field_w = PuzzleModePictureHelpers.field_c;
          }
          this.field_M = new String[2];
          this.field_p = new String[2];
          for (var4_int = 0; var4_int < 2; var4_int++) {
            this.field_M[var4_int] = param2.playerNames[var4_int];
            this.field_p[var4_int] = NumberFormatHelpers.formatThousands(false, param2.scores[var4_int]);
          }
          if (param2.scores[0] >= param2.scores[1]) {
            stackIn_10_1 = 0;
          } else {
            stackIn_10_1 = 1;
          }
          this.field_z = stackIn_10_1;
          this.field_I = -5;
          this.field_A = LoadingProgressDialog.field_jb;
          if (param1 != -10) {
            this.field_G = -27;
          }
          if (this.field_B) {
            this.updateRematchLabel(1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("hq.U(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final int getRowLeft(int param0, byte param1) {
        int var3 = 0;
        if (this.isRowEnabled(-122, 1)) {
          var3 = 60;
          if (0 == param0) {
            return var3;
          }
          return -var3 + (640 - this.getRowTextWidth(98, param0));
        }
        if (param1 != 90) {
          field_t = (String) null;
        }
        return 320 - (this.getRowTextWidth(87, param0) >> 1);
    }

    final void drawFadeTransition(int param0, boolean param1, boolean param2) {
        int var6_int = 0;
        int var4 = param0 * 2;
        if (!param1) {
          GameResultsScreen.releaseStatics((byte) -107);
        }
        int var5 = 128 <= param0 ? param0 * 2 - 256 : 0;
        if (param2) {
          var6_int = var4;
          var4 = var5;
          var5 = var6_int;
        }
        if (EditableTextWidget.field_R == null) {
          EditableTextWidget.field_R = AccountRequestDialog.createRasterBuffer(480, 123, (java.awt.Component) ((Object) new java.awt.Canvas()), 640);
        }
        CanvasRasterBuffer var6 = ClientException.field_f;
        ClientException.field_f = EditableTextWidget.field_R;
        ClientException.field_f.bindRaster(19692);
        this.drawScreenBackground(0);
        ClientException.field_f = var6;
        ClientException.field_f.bindRaster(19692);
        SpriteEffectHelpers.blendFullscreenImageVerticalFade(EditableTextWidget.field_R.field_e, var4, var5);
    }

    final void updateRematchLabel(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Pixelate.field_H ? 1 : 0;
        this.field_B = true;
        var2 = NameSuggestionHelpers.field_e.field_z;
        var3 = NameSuggestionHelpers.field_e.field_a.field_p;
        var4 = NameSuggestionHelpers.field_e.field_o;
        if ((var3 & param0 << var2) != 0) {
          this.field_s = RematchCaptionGlobals.field_c;
        } else {
          if (var3 == 0) {
            if (3 == (1 << NameSuggestionHelpers.field_e.field_z | var4)) {
              this.field_s = EmergentBehaviourBackground.field_t;
            } else {
              this.field_s = TransitionPhase.field_c;
            }
          } else {
            this.field_s = ConditionalTextValue.field_c;
          }
        }
    }

    final void setStatusMessage(String param0, byte param1) {
        try {
          this.field_o = param0;
          if (param1 != -4) {
            this.updateRematchLabel(79);
          }
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "hq.JA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void drawRow(byte param0, boolean param1, int param2) {
        if (param2 == 0) {
          this.drawFooterButton(param1, this.field_A, StripedProgressBar.field_N, -6, this.getRowLeft(0, (byte) 90) + this.getRowRight(0, false) >> 1);
        } else {
          super.drawLabeledRowButton(this.field_s, param1, param2, StripedProgressBar.field_N, (byte) 99);
        }
        if (param0 > -116) {
          this.field_E = 4;
        }
    }

    final void leaveResults(byte param0, boolean param1) {
        int var3;
        int var4;
        int stackIn_8_0 = 0;
        if (DateOfBirthValidator.field_j != 2) {
          var3 = this.field_I;
          var4 = param1 ? 1 : 0;
          stackIn_8_0 = (!AlternateNameCredentials.isOfflineOrAccountUi(104)) ? 0 : 12;
          ScreenChangeHelpers.changeScreen(stackIn_8_0, var3, var4 != 0, -25528);
        } else {
          if (ValidationHelpWidget.field_Y) {
            var3 = param1 ? 1 : 0;
            ScreenChangeHelpers.changeScreen(MidiPcmStream.field_t, -5, var3 != 0, -25528);
          }
          if (DateOfBirthValidator.field_i) {
            PrivateChatHelpers.sendLeaveGameRequest(false, 0, 11);
          }
        }
        if (param0 != 12) {
          this.field_A = (String) null;
        }
    }

    public static void releaseStatics(byte param0) {
        field_D = null;
        field_q = null;
        if (param0 >= -37) {
          field_t = (String) null;
        }
        field_t = null;
    }

    final void handleNavigation(int param0) {
        int var2;
        int var3;
        MenuInputState stackIn_16_0 = null;
        boolean stackIn_16_1 = false;
        int stackIn_17_2 = 0;
        boolean decompiledFrameRemainder0 = true;
        var3 = Pixelate.field_H ? 1 : 0;
        var2 = KeyEventGlobals.field_a;
        if (!this.field_g.isButtonHeld((byte) 35)) {
          if (this.field_g.selectedIndex == -1 && (var2 == 98 ||
            var2 == 99)) {
            stackIn_16_0 = this.field_g;
            stackIn_16_1 = false;
            if (!this.isRowEnabled(-118, 1)) {
              stackIn_17_2 = 0;
            } else {
              stackIn_17_2 = 1;
            }
            ((MenuInputState) (Object) stackIn_16_0).selectIndex(stackIn_16_1, stackIn_17_2);
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_g.selectedIndex == 0 &&
              var2 == 97) {
              if (!(!this.isRowEnabled(-119, 1))) {
                this.field_g.selectIndex(false, 1);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (1 == this.field_g.selectedIndex &&
                var2 == 96) {
                this.field_g.selectIndex(false, 0);
              }
            }
          }
        }
        if (param0 >= -35) {
          GameResultsScreen.releaseStatics((byte) -122);
        }
        this.field_g.captureKeyCode((byte) -71);
    }

    static {
        field_D = "Connection restored.";
    }
}
