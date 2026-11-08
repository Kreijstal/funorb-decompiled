/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ButtonMenuScreen extends AppScreen {
    static int[] field_r;
    private String field_s;
    private int field_p;
    private int menuDepth;
    static Sprite field_u;
    private String field_w;
    private MenuButton[] field_v;
    private int field_t;
    static String field_z;
    private int field_g;
    MenuSelection buttonSelection;
    static String field_k;
    MenuButton[] buttons;
    static String field_h;
    int slideOffsetX;
    static int field_l;
    static PcmStreamMixer field_y;
    private int field_o;
    private boolean field_m;
    static UiLayoutNode field_n;

    private final boolean hasBackButton(byte param0) {
        int var2 = 0;
        int var3 = Kickabout.field_G;
        if (param0 != 83) {
          field_n = (UiLayoutNode) null;
        }
        for (var2 = 0; this.buttons.length > var2; var2++) {
          if (7 == this.buttons[var2].kind) {
            return true;
          }
        }
        return false;
    }

    final boolean isShallowerThan(ButtonMenuScreen param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -4319) {
            this.drawOverlay(false, -69);
          }
          stackIn_5_0 = !(param0.menuDepth <= this.menuDepth);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("qt.BA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void showTutorialTip(byte param0) {
        int var2 = 0;
        if (this.screenId == 24) {
          var2 = 12;
        }
        if (param0 <= 41) {
          field_y = (PcmStreamMixer) null;
        }
        if (this.screenId == 25) {
          var2 = 14;
        }
        if (this.screenId == 14) {
          var2 = 15;
        }
        if (this.screenId == 23) {
          var2 = 13;
        }
        if (16 == this.screenId) {
          var2 = 16;
        }
        if (this.screenId == 15) {
          var2 = 17;
        }
        LoginKind.enqueueHelpTipDialog(63, var2);
    }

    int buttonCenterX(int param0, int param1) {
        if (param1 != -22667) {
          this.field_p = -20;
        }
        if (this.buttons[param0].kind == 37) {
          return FormationAgent.field_f - 50;
        }
        return 190;
    }

    void drawScreen(int param0, boolean param1) {
        int var3;
        AppScreen var3_ref_js;
        int var4;
        AppScreen var4_ref_js;
        int var5;
        Sprite var5_ref_ut;
        int var6;
        int var7;
        Sprite var8;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var4Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1Lifetime1;
        var7 = Kickabout.field_G;
        if (this.field_t != 0) {
          var3 = 14 + (5 * this.field_t - 5);
          for (var4 = 0; this.field_t > var4; var4++) {
            var3 = var3 + this.buttons[var4].height;
          }
          var4Lifetime2 = this.buttons[0].width + 14;
          if (1 < this.field_g) {
            for (var5 = 1; this.field_g > var5; var5++) {
              var4Lifetime2 = var4Lifetime2 + (14 + this.buttons[var5].width);
            }
          }
          var5Lifetime3 = this.buttonCenterX(0, -22667) - (this.buttons[0].width >> 1);
          var6 = this.buttonCenterY(60, 0) - (this.buttons[0].height >> 1);
          var5Lifetime3 = var5Lifetime3 - 7 + this.slideOffsetX;
          var6 = var6 - 7;
          SoftwareRasterizer.fillRoundedRectangleBlended(var5Lifetime3, var6, var4Lifetime2, var3, 12, 0, 128);
        }
        if (param0 != -5) {
          return;
        }
        if (-1 != this.field_o) {
          var3Lifetime1 = -((this.slideOffsetX << 6) / 640);
          var8 = SocialListLayoutSupport.field_b[this.field_o][1];
          var5_ref_ut = SocialListLayoutSupport.field_b[this.field_o][0];
          for (var6Lifetime1 = 0; var6Lifetime1 < FormationAgent.field_f - var5_ref_ut.field_o; var6Lifetime1 = var6Lifetime1 + var8.field_o) {
            var8.d(var6Lifetime1, var3Lifetime1);
          }
          var5_ref_ut.d(-var5_ref_ut.field_o + FormationAgent.field_f, var3Lifetime1);
          var6Lifetime1Lifetime1 = var3Lifetime1 - (-var5_ref_ut.field_v + 18);
          if (null != this.field_w) {
            ByteArrayPool.field_d.drawText(this.field_w, 10, var6Lifetime1Lifetime1, 16777215, -1);
          }
          if (null != this.field_s) {
            ByteArrayPool.field_d.drawRightAligned(this.field_s, this.field_p, var6Lifetime1Lifetime1, 16777215, -1);
          }
        }
        if (this.field_m) {
          var3_ref_js = AuctionLogEntry.field_h;
          var4_ref_js = GameModesHelpScreen.field_G;
          if (var4_ref_js != null) {
            if (var3_ref_js == this &&
              var4_ref_js instanceof ButtonMenuScreen &&
              ((ButtonMenuScreen) (var4_ref_js)).field_m) {
              AccountTermsPanel.field_E.d(0, 430);
            } else {
              var5Lifetime1 = (BuyPlayerDialog.field_I << 9) / 24;
              if (256 < var5Lifetime1) {
                var5Lifetime1 = 256;
              }
              if (this == AuctionLogEntry.field_h) {
                var5Lifetime1 = -var5Lifetime1 + 256;
              }
              AccountTermsPanel.field_E.b(0, 430, var5Lifetime1);
            }
          } else {
            AccountTermsPanel.field_E.d(0, 430);
          }
        }
        for (var3Lifetime2 = 0; var3Lifetime2 < this.buttonSelection.itemCount; var3Lifetime2++) {
          regionExit1: {
            if (this.isButtonVisible(var3Lifetime2, (byte) -95)) {
              var4Lifetime1 = this.buttonCenterX(var3Lifetime2, param0 - 22662) + this.slideOffsetX;
              var5Lifetime2 = this.buttons[var3Lifetime2].kind;
              if (var5Lifetime2 == 7) {
                if (this == AuctionLogEntry.field_h &&
                  GameModesHelpScreen.field_G instanceof ButtonMenuScreen &&
                  ((ButtonMenuScreen) (GameModesHelpScreen.field_G)).hasBackButton((byte) 83)) {
                  break regionExit1;
                }
                if (GameModesHelpScreen.field_G == this &&
                  AuctionLogEntry.field_h instanceof ButtonMenuScreen &&
                  ((ButtonMenuScreen) (AuctionLogEntry.field_h)).hasBackButton((byte) 83)) {
                  var4Lifetime1 = var4Lifetime1 - this.slideOffsetX;
                }
              }
              if (7 == var5Lifetime2 ||
                var5Lifetime2 == 43 ||
                var5Lifetime2 == 19 ||
                var5Lifetime2 == 42 ||
                var5Lifetime2 == 21 ||
                var5Lifetime2 == 22 ||
                var5Lifetime2 == 37) {
                SoftwareRasterizer.fillRoundedRectangleBlended(-4 + (var4Lifetime1 - (this.buttons[var3Lifetime2].width >> 1)), this.buttonCenterY(123, var3Lifetime2) + (-(this.buttons[var3Lifetime2].height >> 1) - 4), 8 + this.buttons[var3Lifetime2].width, 8 + this.buttons[var3Lifetime2].height, 10, 0, 128);
              }
              this.buttons[var3Lifetime2].a(this.buttonCenterY(-106, var3Lifetime2), var4Lifetime1, 13800);
            }
          }
        }
    }

    boolean handleKey(int param0, int param1, char param2) {
        int var4;
        int var5;
        int stackIn_8_0 = 0;
        MenuButton stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        var5 = Kickabout.field_G;
        if (this.buttonSelection.selectedIndex >= 0) {
          if (17 != this.buttons[this.buttonSelection.selectedIndex].kind) {
            stackIn_8_0 = (16 == this.buttons[this.buttonSelection.selectedIndex].kind) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
        } else {
          stackIn_8_0 = 0;
        }
        boolean decompiledFrameRemainder0 = true;
        var4 = stackIn_8_0;
        if (param0 == 13) {
          this.goBackUnlessHome(-77);
        } else {
          if (var4 != 0 && (param0 == 96 ||
            param0 == 97)) {
            stackIn_19_0 = this.buttons[this.buttonSelection.selectedIndex];
            stackIn_20_1 = (param0 == 96);
            ((MenuButton) (Object) stackIn_19_0).a(stackIn_20_1, -27);
            decompiledFrameRemainder0 = false;
          }
          else {
            this.buttonSelection.handleVerticalArrowKeys(107);
            if (0 <= this.buttonSelection.selectedIndex &&
              this.buttonSelection.isActivated(-1)) {
              this.buttons[this.buttonSelection.selectedIndex].activate(-1, false);
            }
          }
        }
        if (param1 <= -5) {
          return true;
        }
        this.buttonCenterY(-115, 63);
        return true;
    }

    void setTransitionProgress(int param0, boolean param1, int param2, AppScreen param3) {
        int var5_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 instanceof ButtonMenuScreen) {
            var5_int = -param0 + 256;
            this.slideOffsetX = var5_int * (var5_int * 640) >> 16;
            if (!param1) {
              this.slideOffsetX = this.slideOffsetX - 640;
            }
            if (!param1 &&
              ((ButtonMenuScreen) (param3)).isShallowerThan(this, -4319) ||
              param1 &&
              this.isShallowerThan((ButtonMenuScreen) (param3), -4319)) {
              this.slideOffsetX = -this.slideOffsetX;
            }
          } else {
            this.slideOffsetX = FormationAgent.field_f - SocialRowOrderSupport.getScreenPanelWidth((AppScreen) (this), -4);
          }
          if (param2 >= -28) {
            this.slideOffsetX = 124;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("qt.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void restoreDefaultButtons(byte param0) {
        if (this.field_v != null) {
          this.setButtons(false, this.field_v);
        }
        if (param0 >= -94) {
          MenuButton[] var3 = (MenuButton[]) null;
          this.setButtons(false, (MenuButton[]) null);
        }
    }

    final void configureMenu(String param0, int param1, int param2, int param3, String param4, MenuButton[] param5, MenuButton[] param6, int param7, boolean param8, int param9, int param10, int param11) {
        boolean stackIn_3_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var13 = null;
        try {
          this.field_w = param0;
          this.field_g = param2;
          this.field_o = param9;
          this.field_p = param7;
          this.menuDepth = param11;
          stackIn_3_1 = (param8);
          this.field_m = stackIn_3_1;
          this.screenId = param10;
          if (param3 != -46) {
            ButtonMenuScreen.releaseStatics((byte) 105);
          }
          this.field_t = param1;
          if (param6 == null) {
            param6 = new MenuButton[]{};
          }
          this.field_s = param4;
          if (param5 != null) {
            this.setButtons(false, param5);
            this.field_v = param6;
          } else {
            this.setButtons(false, param6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_13_0 = var13;
          stackIn_13_1 = new StringBuilder().append("qt.CA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param5 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param6 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(')').toString());
        }
    }

    void buildWidgets(int param0) {
        if (param0 != -38) {
          ButtonMenuScreen var3 = (ButtonMenuScreen) null;
          this.isShallowerThan((ButtonMenuScreen) null, 112);
        }
    }

    boolean isButtonVisible(int param0, byte param1) {
        if (param1 != -95) {
          this.drawOverlay(true, 92);
        }
        return true;
    }

    ButtonMenuScreen() {
        super(0);
        this.slideOffsetX = 0;
    }

    final static boolean d(int param0) {
        int var2 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_12_0 = false;
        boolean stackIn_19_0 = false;
        boolean stackIn_28_0 = false;
        boolean stackIn_34_0 = false;
        boolean stackIn_39_0 = false;
        boolean stackIn_45_0 = false;
        int stackIn_49_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_56_0 = 0;
        boolean stackIn_61_0 = false;
        boolean stackIn_66_0 = false;
        boolean stackIn_70_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        var3 = Kickabout.field_G;
        try {
          if (HuffmanCodec.field_e == 1) {
            stackIn_70_0 = (ThumbnailStateFactory.field_d.field_V.possessorTeam == 0);
            return stackIn_70_0;
          }
          if (2 == HuffmanCodec.field_e) {
            stackIn_6_0 = !(EmailAvailabilityValidator.field_k.pixelY(true) >= 285);
            return stackIn_6_0;
          }
          if (HuffmanCodec.field_e == 3) {
            stackIn_12_0 = (790 < EmailAvailabilityValidator.field_k.pixelX(param0 - 85)) && (1000 < EmailAvailabilityValidator.field_k.pixelY(true));
            return stackIn_12_0;
          }
          if (HuffmanCodec.field_e == 4) {
            stackIn_66_0 = (ThumbnailStateFactory.field_d.field_V.possessorTeam == 0) && (ThumbnailStateFactory.field_d.field_V.possessorSlot == 3);
            return stackIn_66_0;
          }
          if (5 == HuffmanCodec.field_e) {
            stackIn_19_0 = (ThumbnailStateFactory.field_d.field_V.possessorTeam == 0) && (ThumbnailStateFactory.field_d.field_V.possessorSlot == 1);
            return stackIn_19_0;
          }
          if (HuffmanCodec.field_e == 6) {
            stackIn_61_0 = (ThumbnailStateFactory.field_d.field_V.possessorTeam == 0) && (3 == ThumbnailStateFactory.field_d.field_V.possessorSlot);
            return stackIn_61_0;
          }
          if (HuffmanCodec.field_e == 7) {
            stackIn_49_0 = (ThumbnailStateFactory.field_d.field_V.possessorTeam != 0) ? 0 : 1;
            var1_int = stackIn_49_0;
            for (var2 = 1; 4 > var2; var2++) {
              stackIn_53_0 = var1_int;
              if (ThumbnailStateFactory.field_d.field_P[1][var2].positionY != AchievementsScreen.a((byte) -27, 1)) {
                stackIn_54_1 = 0;
              } else {
                stackIn_54_1 = 1;
              }
              var1_int = stackIn_53_0 & stackIn_54_1;
            }
            stackIn_56_0 = var1_int;
            return stackIn_56_0 != 0;
          }
          if (8 == HuffmanCodec.field_e) {
            stackIn_28_0 = (ThumbnailStateFactory.field_d.field_V.possessorTeam == 0) && (AccountInputValidationResult.field_f.pixelX(-115) > 760) && (AccountInputValidationResult.field_f.pixelY(true) > 1000);
            return stackIn_28_0;
          }
          if (9 == HuffmanCodec.field_e) {
            stackIn_34_0 = (0 == ThumbnailStateFactory.field_d.field_V.possessorTeam) && (ThumbnailStateFactory.field_d.field_V.possessorSlot == 1);
            return stackIn_34_0;
          }
          if (HuffmanCodec.field_e == 10) {
            stackIn_39_0 = (ThumbnailStateFactory.field_d.participantStatus[0].controlledSlot == 4);
            return stackIn_39_0;
          }
          if (11 == HuffmanCodec.field_e) {
            stackIn_45_0 = (ThumbnailStateFactory.field_d.field_V.possessorTeam == 0);
            return stackIn_45_0;
          }
          if (param0 != -8) {
            ButtonMenuScreen.releaseStatics((byte) -118);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "qt.V(" + param0 + ')');
        }
    }

    void drawOverlay(boolean param0, int param1) {
        if (param1 <= 99) {
          this.field_v = (MenuButton[]) null;
        }
    }

    private final int buttonIndexAt(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = Kickabout.field_G;
        for (var4 = 0; var4 < this.buttons.length; var4++) {
          var5 = this.buttons[var4].width;
          var6 = this.buttons[var4].height;
          var7 = this.buttonCenterX(var4, -22667) - (var5 >> 1) + this.slideOffsetX;
          var8 = -(var6 >> 1) + this.buttonCenterY(31, var4);
          if (this.isButtonVisible(var4, (byte) -95) &&
            param0 >= var7 &&
            var5 + var7 > param0 &&
            param1 >= var8 &&
            var8 + var6 > param1) {
            return var4;
          }
        }
        if (param2 < 29) {
          return 43;
        }
        return -1;
    }

    void updateScreen(byte param0, boolean param1) {
        boolean stackIn_3_0 = false;
        boolean stackIn_4_1 = false;
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        var8 = Kickabout.field_G;
        stackIn_3_0 = param1;
        stackIn_4_1 = (!LoginText.field_e) && (!QuickChatPhraseCache.field_d);
        param1 = stackIn_3_0 & stackIn_4_1;
        if (!param1) {
          this.buttonSelection.selectedIndex = -1;
        }
        if (param1) {
          var3 = this.buttonIndexAt(ArrayWidgetContainer.field_x, TutorialCaptionSupport.field_j, (byte) 30);
          this.buttonSelection.updatePointerSelection(-21174, var3, this.buttonIndexAt(TrinketIcon.field_yb, TabStrip.field_Eb, (byte) 110));
          if (var3 == -1) {
            stackIn_11_0 = -1;
          } else {
            stackIn_11_0 = this.buttons[var3].kind;
          }
          var4 = stackIn_11_0;
          if (var4 != -1 &&
            null != PendingRequestAcknowledgement.field_g[var4]) {
            IndexedSpriteState.$cfr$intArgs$a$b6210757cdab(-67, PendingRequestAcknowledgement.field_g[var4]);
          }
        }
        var9 = 0;
        var3Lifetime1 = var9;
        while (this.buttons.length > var9) {
          stackIn_20_0 = (~var9 != ~this.buttonSelection.selectedIndex) ? 0 : 1;
          var4Lifetime1 = stackIn_20_0;
          if (var4Lifetime1 != 0) {
            stackIn_26_0 = (this.buttonSelection.isActivated(-1)) ? 1 : 0;
          } else {
            stackIn_26_0 = 0;
          }
          var5 = stackIn_26_0;
          if (var4Lifetime1 != 0) {
            stackIn_32_0 = (this.buttonSelection.isPointerHeld(0)) ? 1 : 0;
          } else {
            stackIn_32_0 = 0;
          }
          var6 = stackIn_32_0;
          var7 = ArrayWidgetContainer.field_x - this.buttonCenterX(var9, -22667);
          this.buttons[var9].a(var4Lifetime1 != 0, var5 != 0, var6 != 0, 16, var7);
          var9++;
        }
        var4Lifetime2 = -54 % ((38 - param0) / 60);
    }

    final static void enqueueLoginRequiredDialog(int param0) {
        ScrollPane.field_Jb.addLast(new LoginRequiredDialog(), 3);
        if (param0 != 16144) {
          ButtonMenuScreen.d(-47);
        }
    }

    void enterScreen(int param0, int param1, boolean param2) {
        int var5 = 0;
        MenuButton var6 = null;
        int var7 = Kickabout.field_G;
        this.buttonSelection.restoreSelection(-1, 0, param1, param2);
        MenuButton[] var8 = this.buttons;
        MenuButton[] var4 = var8;
        for (var5 = 0; var5 < var8.length; var5++) {
          var6 = var8[var5];
          var6.a(false, false, false, 16, 0);
        }
        if (param0 == this.buttons.length) {
          this.buttonSelection.selectedIndex = -1;
        }
    }

    private final void goBackUnlessHome(int param0) {
        if (param0 > -67) {
          return;
        }
        if (0 == this.screenId ||
          18 == this.screenId) {
          return;
        }
        RasterGlowSupport.returnToPreviousScreen(106, false);
    }

    public static void releaseStatics(byte param0) {
        field_y = null;
        field_n = null;
        field_z = null;
        int var1 = 27 % ((param0 + 56) / 45);
        field_h = null;
        field_u = null;
        field_k = null;
        field_r = null;
    }

    int buttonCenterY(int param0, int param1) {
        int var5 = 0;
        int var3;
        int var4;
        int var6;
        var6 = Kickabout.field_G;
        if (this.buttons[param1].kind != 7 &&
          42 != this.buttons[param1].kind &&
          this.buttons[param1].kind != 37 &&
          this.buttons[param1].kind != 19 &&
          this.buttons[param1].kind != 43) {
          var3 = -124 % ((param0 + 49) / 52);
          var4 = 190;
          if (this.buttons[param1].kind != 46 &&
            48 != this.buttons[param1].kind &&
            this.buttons[param1].kind != 45 &&
            this.buttons[param1].kind != 28 &&
            this.buttons[param1].kind != 26) {
            if (25 == this.buttons[param1].kind ||
              3 == this.buttons[param1].kind ||
              18 == this.buttons[param1].kind) {
              var4 += 25;
            }
          } else {
            var4 -= 25;
          }
          for (var5 = 0; param1 > var5; var5++) {
            var4 = var4 + ((this.buttons[var5].height >> 1) + 5 + (this.buttons[var5 + 1].height >> 1));
          }
          return var4;
        }
        return 469 - (this.buttons[param1].height >> 1);
    }

    private final void setButtons(boolean param0, MenuButton[] param1) {
        this.buttons = param1;
        if (param0) {
          return;
        }
        try {
          this.buttonSelection = new MenuSelection(this.buttons.length);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "qt.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static UiLayoutNode f(byte param0) {
        if (param0 != -63) {
          return (UiLayoutNode) null;
        }
        return TournamentChampionDialog.field_F.field_yb;
    }

    static {
        field_r = new int[]{672, 100, 1294};
        field_h = "scroll down";
        field_z = "Lobby";
        field_k = "Remove friend";
    }
}
