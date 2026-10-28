/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MembershipPromotionScreen {
    static int field_k;
    private IndexedSprite[] screenshots;
    private int currencyIndex;
    private MenuInputState input;
    private int previousScreenshot;
    private int transitionTicks;
    private boolean forward;
    private int animationAccumulatorQ16;
    private Sprite headingSprite;
    private String heading;
    private Sprite priceSprite;
    private Sprite benefitsHeadingSprite;
    private String[] captions;
    private int animationTick;
    private int screenshotIndex;

    final void draw(int guard) {
        int var4 = EscapeVector.obfuscationControl;
        SoftwareRasterizer.fillVerticalGradient(9, 9, 622, 47, 4540749, 65793);
        SoftwareRasterizer.fillRectangle(9, 257, 622, 33, 2585);
        SoftwareRasterizer.fillVerticalGradient(9, 265, 622, 11, 2585, 1515566);
        int var2 = 0;
        int var3 = 14;
        while (var2 < 4) {
          SoftwareRasterizer.fillVerticalGradient(var3, 331, 117, 90, 460551, 3881787);
          var3 += 121;
          var2++;
        }
        int var2Lifetime1 = 0;
        int var3Lifetime1 = 299;
        if (guard > -28) {
          this.screenshots = (IndexedSprite[]) null;
        }
        while (var2Lifetime1 < 2) {
          SoftwareRasterizer.fillVerticalGradient(508, var3Lifetime1, 127, 42, 1130115, 3365268);
          SoftwareRasterizer.fillRectangle(508, var3Lifetime1 + 42, 127, 42, 12410);
          var2Lifetime1++;
          var3Lifetime1 += 91;
        }
        this.drawScreenshotTransition(-122);
        if (null != ThreeSliceButtonPainter.field_x &&
          ThreeSliceButtonPainter.field_x.ensureIndex(0) &&
          ThreeSliceButtonPainter.field_x.tryLoadNamedGroup(0, "members_expansion_screen") &&
          ThreeSliceButtonPainter.field_x.tryLoadNamedGroup(0, "arialish12") &&
          ThreeSliceButtonPainter.field_x.tryLoadNamedGroup(0, "pump32") &&
          ModeProgressSupport.field_e != null &&
          ModeProgressSupport.field_e.ensureIndex(0) &&
          ModeProgressSupport.field_e.tryLoadNamedGroup(0, "arialish12") &&
          ModeProgressSupport.field_e.tryLoadNamedGroup(0, "pump32")) {
          TriangleMesh.field_z = AccountRegistrationPanel.loadNamedIndexedSprite(ThreeSliceButtonPainter.field_x, 54, "frame", "members_expansion_screen");
          TrackerMusicLoader.field_c = MembershipPromotionScreen.loadNamedSprite("members_expansion_screen", ThreeSliceButtonPainter.field_x, "arrow", true);
          KeyboardStateSupport.field_c = DisplayNameForm.loadBinaryFont(4, ModeProgressSupport.field_e, "arialish12", "", ThreeSliceButtonPainter.field_x);
          ReflectionCheck.field_h = KeyboardStateSupport.loadCoverageFont("", -73, ThreeSliceButtonPainter.field_x, "pump32", ModeProgressSupport.field_e);
          IntrusiveDequeCursor.field_e = SimulatorSpriteAssets.loadNamedSprite((byte) 8, "benefit_orbs", ThreeSliceButtonPainter.field_x, "members_expansion_screen");
          LoginMethod.field_c = SimulatorSpriteAssets.loadNamedSprite((byte) 8, "button_text", ThreeSliceButtonPainter.field_x, "members_expansion_screen");
          QuickChatDynamicCommand.field_a = MeshMaterial.loadSpritesByName("button_highlights", ThreeSliceButtonPainter.field_x, "members_expansion_screen", (byte) 71);
          ThreeSliceButtonPainter.field_x = null;
          ModeProgressSupport.field_e = null;
        }
        this.buildTextSprites((byte) 87);
        if (null == TriangleMesh.field_z) {
          return;
        }
        this.priceSprite.drawTransparent(376, 339);
        this.headingSprite.drawTransparent(9, 9);
        TriangleMesh.field_z.draw(0, 0);
        if (null != TrackerMusicLoader.field_c) {
          TrackerMusicLoader.field_c.drawTransparent(9, 257);
          TrackerMusicLoader.field_c.drawMirrored(558, 257);
          if (UiContainer.field_y > 257 &&
            UiContainer.field_y < 290) {
            int var2Lifetime2 = 40 + (40 * TextLayoutLine.sineQ16(this.animationTick << 4, -124) >> 16);
            if (var2Lifetime2 > 0) {
              if (GzipDecoder.field_d > 9 &&
                GzipDecoder.field_d < 82) {
                TrackerMusicLoader.field_c.drawAdditive(8, 256, var2Lifetime2);
                TrackerMusicLoader.field_c.drawAdditive(10, 256, var2Lifetime2);
                TrackerMusicLoader.field_c.drawAdditive(8, 258, var2Lifetime2);
                TrackerMusicLoader.field_c.drawAdditive(10, 258, var2Lifetime2);
              } else if (GzipDecoder.field_d > 558 &&
                GzipDecoder.field_d < 631) {
                TrackerMusicLoader.field_c.flipHorizontally();
                TrackerMusicLoader.field_c.drawAdditive(557, 256, var2Lifetime2);
                TrackerMusicLoader.field_c.drawAdditive(559, 256, var2Lifetime2);
                TrackerMusicLoader.field_c.drawAdditive(557, 258, var2Lifetime2);
                TrackerMusicLoader.field_c.drawAdditive(559, 258, var2Lifetime2);
                TrackerMusicLoader.field_c.flipHorizontally();
              }
            }
          }
        }
        this.benefitsHeadingSprite.drawTransparent(16, 302);
        KeyboardStateSupport.field_c.drawParagraph(this.captions[this.screenshotIndex], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
        IntrusiveDequeCursor.field_e.drawTransparent(30, 330);
        KeyboardStateSupport.field_c.drawParagraph(MatchingTextValidator.field_n[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
        KeyboardStateSupport.field_c.drawParagraph(MatchingTextValidator.field_n[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
        KeyboardStateSupport.field_c.drawParagraph(MatchingTextValidator.field_n[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
        LoginMethod.field_c.drawTransparent(508 + (127 - LoginMethod.field_c.fullWidth) / 2, 315);
        if (this.input.selectedIndex == 0) {
          QuickChatDynamicCommand.field_a[0].drawTransparent(508, 299);
        } else if (this.input.selectedIndex == 1) {
          QuickChatDynamicCommand.field_a[1].drawTransparent(508, 387);
        }
    }

    final int update(byte guard, boolean handleInput) {
        int var6 = EscapeVector.obfuscationControl;
        this.animationAccumulatorQ16 = this.animationAccumulatorQ16 + 65536;
        while (SimulatorAssetSupport.multiplyQ16(false, this.animationAccumulatorQ16, IntKeyLookup.field_a) >= 65536) {
          this.animationTick = this.animationTick + 1;
          this.animationAccumulatorQ16 = this.animationAccumulatorQ16 - IntKeyLookup.field_a;
        }
        int var3 = -1;
        if (guard != 23) {
          return 103;
        }
        if (this.screenshots != null) {
          var3 = this.screenshots.length;
        }
        if (var3 != -1) {
          if (this.transitionTicks < IntKeyLookup.field_e) {
            this.transitionTicks = this.transitionTicks + 1;
            if (this.transitionTicks > IntKeyLookup.field_c && (this.screenshots == null ||
              null == this.screenshots[this.screenshotIndex])) {
              this.transitionTicks = this.transitionTicks - 1;
              boolean decompiledFrameRemainder0 = false;
            } else if (this.transitionTicks >= IntKeyLookup.field_e &&
              null == this.screenshots[(1 + this.screenshotIndex) % var3]) {
              this.transitionTicks = this.transitionTicks - 1;
            }
          }
          if (this.transitionTicks >= IntKeyLookup.field_e) {
            this.previousScreenshot = this.screenshotIndex;
            this.transitionTicks = this.transitionTicks - IntKeyLookup.field_e;
            if (this.forward) {
              this.screenshotIndex = this.screenshotIndex + 1;
              if (var3 <= this.screenshotIndex) {
                this.screenshotIndex = this.screenshotIndex - var3;
              }
            } else {
              this.screenshotIndex = this.screenshotIndex - 1;
              if (0 > this.screenshotIndex) {
                this.screenshotIndex = this.screenshotIndex + var3;
              }
            }
          }
          if (IntKeyLookup.field_c < this.transitionTicks) {
            this.forward = true;
          }
        }
        if (null != TrackerMusicLoader.field_c) {
          boolean var4 = false;
          if (AccountMessagePanel.field_N != 0 &&
            LoginDialog.field_ob > 257 &&
            LoginDialog.field_ob < 290) {
            if (SessionCounterState.field_c > 9 &&
              82 > SessionCounterState.field_c) {
              var4 = true;
              this.transitionTicks = IntKeyLookup.field_e;
              this.forward = false;
            }
            if (SessionCounterState.field_c > 558 &&
              SessionCounterState.field_c < 631) {
              this.forward = true;
              var4 = true;
              this.transitionTicks = IntKeyLookup.field_e;
            }
          }
          if (!var4 &&
            this.transitionTicks > IntKeyLookup.field_c &&
            LoginDialog.field_ob > 257 &&
            290 > LoginDialog.field_ob) {
            if (GzipDecoder.field_d > 9 &&
              GzipDecoder.field_d < 82) {
              this.transitionTicks = IntKeyLookup.field_c;
            }
            if (558 < GzipDecoder.field_d &&
              GzipDecoder.field_d < 631) {
              this.transitionTicks = IntKeyLookup.field_c;
            }
          }
        }
        if (!handleInput) {
          return 0;
        }
        this.input.updatePointer(this.hitTest(SessionCounterState.field_c, LoginDialog.field_ob, -16311), (byte) 122, this.hitTest(GzipDecoder.field_d, UiContainer.field_y, -16311));
        boolean var4Lifetime1 = false;
        if (this.input.isInitialActivation((byte) -18)) {
          if (this.input.selectedIndex == 0) {
            var4Lifetime1 = true;
          }
          if (1 == this.input.selectedIndex) {
            return 2;
          }
        }
        if (ValidationState.field_b) {
          while (AccountRequestDialog.pollKeyEvent(-71)) {
            int var5 = this.handleKeyboard(false);
            if (var5 == 0) {
              continue;
            }
            return var5;
          }
        }
        if (!var4Lifetime1) {
          return 0;
        }
        this.openMembershipPage(true);
        return 3;
    }

    private final int handleKeyboard(boolean guard) {
        this.input.handleKeyEvent((byte) 6);
        if (guard) {
          int[] var3 = (int[]) null;
          this.drawGradientText((BitmapFont) null, 9, 97, -25, 47, 28, (String) null, (int[]) null);
        }
        if (this.input.isInitialActivation((byte) -18)) {
          if (this.input.selectedIndex == 0) {
            this.openMembershipPage(true);
            return 3;
          }
          if (this.input.selectedIndex == 1) {
            return 1;
          }
        }
        if (PasswordValidator.field_n == 13) {
          return 1;
        }
        return 0;
    }

    final static Sprite loadNamedSprite(String groupName, ResourceArchive archive, String fileName, boolean guard) {
        String stackIn_5_2 = null;
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        try {
          int var4_int = archive.findGroupId(-1, groupName);
          int var5 = archive.findFileId(var4_int, fileName, guard);
          Sprite stackIn_1_0 = EditableTextWidget.loadRgbSprite(var4_int, var5, archive, (byte) 9);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var4;
          StringBuilder stackIn_4_1 = new StringBuilder().append("fe.F(");
          if (groupName == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          StringBuilder stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (archive == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (fileName == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(guard).append(')').toString());
        }
    }

    final static void showRegistrationPanel(byte guard) {
        if (guard != -83) {
          field_k = 94;
        }
        LegacyWidgetStyle.field_E = new AccountRegistrationPanel();
        SpaceCompactionSupport.loginDialog.transitionToContent(LegacyWidgetStyle.field_E, 30);
    }

    private final void drawScreenshotTransition(int guard) {
        int var5 = EscapeVector.obfuscationControl;
        if (this.screenshots == null) {
          if (KeyboardStateSupport.field_c == null) {
            return;
          }
          KeyboardStateSupport.field_c.drawParagraph(AccountSessionStatusSupport.field_a, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
          return;
        }
        IndexedSprite var6 = this.screenshots[this.screenshotIndex];
        IndexedSprite var2 = var6;
        if (var2 != null) {
          var6.draw(9, 58);
        } else if (null != KeyboardStateSupport.field_c) {
          KeyboardStateSupport.field_c.drawParagraph(AccountSessionStatusSupport.field_a, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
        }
        if (guard > -109) {
          return;
        }
        if (IntKeyLookup.field_c > this.transitionTicks) {
          IndexedSprite var7 = this.screenshots[this.previousScreenshot];
          IndexedSprite var2Lifetime1 = var7;
          if (var2Lifetime1 != null) {
            int var3 = this.transitionTicks * (var7.field_a + 60) / IntKeyLookup.field_c;
            int var4 = -30 + var3;
            if (this.forward) {
              ModalPanel.drawIndexedSpriteAlphaGradient(9, (-var4 + var7.field_a) * 256 / 30, 4163, var7, 58, -256 * var4 / 30);
            } else {
              ModalPanel.drawIndexedSpriteAlphaGradient(9, -256 * var4 / 30, 4163, var2Lifetime1, 58, 256 * (var7.field_a - var4) / 30);
            }
          }
        }
        return;
    }

    final void open(boolean pointerDriven, byte guard) {
        this.transitionTicks = IntKeyLookup.field_c;
        if (guard != 47) {
          this.headingSprite = (Sprite) null;
        }
        this.animationTick = 0;
        this.screenshotIndex = 0;
        this.animationAccumulatorQ16 = 0;
        this.input.initializeSelection(105, pointerDriven, this.hitTest(GzipDecoder.field_d, UiContainer.field_y, -16311), -1);
    }

    private final void initialize(boolean keyboardEnabled, String[] captions, IndexedSprite[] screenshots, java.applet.Applet applet, String heading, int guard) {
        String stackIn_15_2 = null;
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        String stackIn_24_2 = null;
        try {
          String var7 = applet.getParameter("currency");
          if (guard != 13439) {
            this.animationTick = -71;
          }
          if (var7 != null &&
            LoginCredentialType.isDecimalText(false, (CharSequence) ((Object) var7))) {
            this.currencyIndex = ModeProgress.parseDecimal(16777215, (CharSequence) ((Object) var7));
          } else {
            this.currencyIndex = 2;
          }
          this.heading = heading;
          this.input = new MenuInputState(2);
          this.captions = captions;
          this.screenshots = screenshots;
          if (this.screenshots != null &&
            3 <= this.screenshots.length) {
            ValidationState.field_b = keyboardEnabled;
            return;
          }
          throw new IllegalArgumentException("");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_14_0 = runtimeException;
          StringBuilder stackIn_14_1 = new StringBuilder().append("fe.J(").append(keyboardEnabled).append(',');
          if (captions == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          StringBuilder stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (screenshots == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (applet == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (heading == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void buildTextSprites(byte guard) {
        if (null == this.headingSprite) {
          if (ReflectionCheck.field_h == null) {
            return;
          }
          this.headingSprite = new Sprite(622, 47);
          TickClock.pushSpriteRaster(this.headingSprite, (byte) -90);
          SoftwareRasterizer.fillVerticalGradient(0, 0, 622, 47, 4540749, 65793);
          int var2 = 16448250;
          int var3 = 10068666;
          int[] var17 = AchievementFlagSupport.blendPalette256(1746055568, var3, var2);
          this.drawGradientText(ReflectionCheck.field_h, 0, 0, 47, 622, 0, this.heading, var17);
          RasterRestoreSupport.popRasterState((byte) 107);
          this.benefitsHeadingSprite = new Sprite(475, 24);
          this.drawScaledGradientText(0, ReflectionCheck.field_h, NineSliceFrame.field_d, 24, 0, this.benefitsHeadingSprite, -4, 0.75f, var17, 475);
          int[] var18 = AchievementFlagSupport.blendPalette256(1746055568, 526344, 526344);
          Sprite var5 = new Sprite(121, 122);
          TickClock.pushSpriteRaster(var5, (byte) -40);
          SoftwareRasterizer.fillVerticalGradient(0, 0, var5.width, var5.height / 2, 16180917, 16306250);
          if (guard <= 63) {
            String var8 = (String) null;
            this.initialize(false, (String[]) null, (IndexedSprite[]) null, (java.applet.Applet) null, (String) null, 46);
          }
          SoftwareRasterizer.fillVerticalGradient(0, var5.height / 2, var5.width, var5.height, 16306250, 15568919);
          String var6 = UiComponent.field_r;
          String var7 = LoginIdentifierSupport.field_b;
          this.drawScaledGradientText(0, ReflectionCheck.field_h, var6, var5.height, 0, var5, -16, 0.5f, var18, var5.width);
          this.drawScaledGradientText(0, ReflectionCheck.field_h, var7, var5.height, 0, var5, 20, 0.5f, var18, var5.width);
          this.drawScaledGradientText(0, ReflectionCheck.field_h, SimulatorSpriteAssets.field_f[this.currencyIndex], var5.height / 3, 0, var5, -ReflectionCheck.field_h.maxAscent + (var5.height / 2 + 12), 0.699999988079071f, var18, var5.width);
          RasterRestoreSupport.popRasterState((byte) -54);
          this.priceSprite = new Sprite(121, 122);
          TickClock.pushSpriteRaster(this.priceSprite, (byte) -104);
          var5.drawCenteredRotatedScaledBilinear(this.priceSprite.width / 2, this.priceSprite.height / 2, -2048, 4096);
          RasterRestoreSupport.popRasterState((byte) -12);
          return;
        }
    }

    private final void drawGradientText(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, String param6, int[] param7) {
        int var12 = EscapeVector.obfuscationControl;
        try {
          LoginStage.pushRasterState(param2 ^ 26);
          for (int var9_int = param1; var9_int < param3; var9_int++) {
            SoftwareRasterizer.setClip(param5, var9_int, param4, 1 + var9_int);
            int var10 = var9_int * param7.length / param3;
            int var11 = param7[param7.length + (-var10 - 1)];
            param0.drawParagraph(param6, param5, param1, param4, param3, var11, -1, 1, 1, 0);
          }
          if (param2 != 0) {
            this.captions = (String[]) null;
          }
          RasterRestoreSupport.popRasterState((byte) -95);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "fe.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    private final void openMembershipPage(boolean guard) {
        try {
          AudioService.openMembershipPage((byte) 53, PointCloudEffect.activeApplet((byte) -90));
        } catch (Exception exception) {
          exception.printStackTrace();
        }
        if (!guard) {
          this.drawScreenshotTransition(98);
        }
    }

    final static void beginAlternateLoginFlow(int guard) {
        AccountNoticeKind.resetAccountFlow(3161);
        int var1 = -82 % ((guard + 5) / 57);
        DraggableWidget.field_F = true;
        DialWidget.field_H = true;
        Checkbox.field_F.closeAllPanels(17415);
        UiTheme.showAccountRequest((byte) 119, DualLinkNode.field_h, false);
    }

    private final int hitTest(int x, int y, int guard) {
        if (TriangleMesh.field_z == null) {
          return -1;
        }
        if (508 <= x && x < 635 && y >= 299 &&
          386 > y) {
          return 0;
        }
        if (x >= 508 && 635 > x && y >= 390 &&
          y < 475) {
          return 1;
        }
        if (guard != -16311) {
          MembershipPromotionScreen.beginAlternateLoginFlow(-110);
        }
        return -1;
    }

    MembershipPromotionScreen(java.applet.Applet applet, String heading, IndexedSprite[] screenshots, String[] captions) {
        this.forward = true;
        this.animationAccumulatorQ16 = 0;
        this.animationTick = 0;
        try {
          this.initialize(true, captions, screenshots, applet, heading, 13439);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "fe.<init>(" + (applet != null ? "{...}" : "null") + ',' + (heading != null ? "{...}" : "null") + ',' + (screenshots != null ? "{...}" : "null") + ',' + (captions != null ? "{...}" : "null") + ')');
        }
    }

    private final void drawScaledGradientText(int param0, BitmapFont param1, String param2, int param3, int param4, Sprite param5, int param6, float param7, int[] param8, int param9) {
        String stackIn_5_2 = null;
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        String stackIn_14_2 = null;
        try {
          int var11_int = (int)((float)param9 / param7);
          int var12 = (int)((float)param3 / param7);
          Sprite var13 = new Sprite(var11_int, var12);
          TickClock.pushSpriteRaster(var13, (byte) -125);
          param5.drawScaled((int)((float)(-param4) / param7), (int)((float)(-param6) / param7), (int)((float)param5.width / param7), (int)((float)param5.height / param7));
          this.drawGradientText(param1, param0, 0, var12, var11_int, 0, param2, param8);
          RasterRestoreSupport.popRasterState((byte) -81);
          TickClock.pushSpriteRaster(param5, (byte) -105);
          var13.drawDownscaled(param4, param6, param9, param3);
          RasterRestoreSupport.popRasterState((byte) 123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var11 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var11;
          StringBuilder stackIn_4_1 = new StringBuilder().append("fe.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          StringBuilder stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param9).append(')').toString());
        }
    }

    static {
    }
}
