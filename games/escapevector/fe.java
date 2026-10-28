/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe {
    static int field_k;
    private IndexedSprite[] field_b;
    private int field_o;
    private MenuInputState field_a;
    private int field_j;
    private int field_l;
    private boolean field_n;
    private int field_e;
    private Sprite field_g;
    private String field_f;
    private Sprite field_h;
    private Sprite field_c;
    private String[] field_d;
    private int field_m;
    private int field_i;

    final void c(int param0) {
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
        if (param0 > -28) {
          this.field_b = (IndexedSprite[]) null;
        }
        while (var2Lifetime1 < 2) {
          SoftwareRasterizer.fillVerticalGradient(508, var3Lifetime1, 127, 42, 1130115, 3365268);
          SoftwareRasterizer.fillRectangle(508, var3Lifetime1 + 42, 127, 42, 12410);
          var2Lifetime1++;
          var3Lifetime1 += 91;
        }
        this.b(-122);
        if (null != ThreeSliceButtonPainter.field_x &&
          ThreeSliceButtonPainter.field_x.ensureIndex(0) &&
          ThreeSliceButtonPainter.field_x.tryLoadNamedGroup(0, "members_expansion_screen") &&
          ThreeSliceButtonPainter.field_x.tryLoadNamedGroup(0, "arialish12") &&
          ThreeSliceButtonPainter.field_x.tryLoadNamedGroup(0, "pump32") &&
          pc.field_e != null &&
          pc.field_e.ensureIndex(0) &&
          pc.field_e.tryLoadNamedGroup(0, "arialish12") &&
          pc.field_e.tryLoadNamedGroup(0, "pump32")) {
          TriangleMesh.field_z = AccountRegistrationPanel.a(ThreeSliceButtonPainter.field_x, 54, "frame", "members_expansion_screen");
          ml.field_c = fe.a("members_expansion_screen", ThreeSliceButtonPainter.field_x, "arrow", true);
          KeyboardStateSupport.field_c = DisplayNameForm.loadBinaryFont(4, pc.field_e, "arialish12", "", ThreeSliceButtonPainter.field_x);
          ReflectionCheck.field_h = KeyboardStateSupport.loadCoverageFont("", -73, ThreeSliceButtonPainter.field_x, "pump32", pc.field_e);
          IntrusiveDequeCursor.field_e = p.a((byte) 8, "benefit_orbs", ThreeSliceButtonPainter.field_x, "members_expansion_screen");
          LoginMethod.field_c = p.a((byte) 8, "button_text", ThreeSliceButtonPainter.field_x, "members_expansion_screen");
          QuickChatDynamicCommand.field_a = MeshMaterial.loadSpritesByName("button_highlights", ThreeSliceButtonPainter.field_x, "members_expansion_screen", (byte) 71);
          ThreeSliceButtonPainter.field_x = null;
          pc.field_e = null;
        }
        this.b((byte) 87);
        if (null == TriangleMesh.field_z) {
          return;
        }
        this.field_h.drawTransparent(376, 339);
        this.field_g.drawTransparent(9, 9);
        TriangleMesh.field_z.draw(0, 0);
        if (null != ml.field_c) {
          ml.field_c.drawTransparent(9, 257);
          ml.field_c.drawMirrored(558, 257);
          if (UiContainer.field_y > 257 &&
            UiContainer.field_y < 290) {
            int var2Lifetime2 = 40 + (40 * TextLayoutLine.sineQ16(this.field_m << 4, -124) >> 16);
            if (var2Lifetime2 > 0) {
              if (GzipDecoder.field_d > 9 &&
                GzipDecoder.field_d < 82) {
                ml.field_c.drawAdditive(8, 256, var2Lifetime2);
                ml.field_c.drawAdditive(10, 256, var2Lifetime2);
                ml.field_c.drawAdditive(8, 258, var2Lifetime2);
                ml.field_c.drawAdditive(10, 258, var2Lifetime2);
              } else if (GzipDecoder.field_d > 558 &&
                GzipDecoder.field_d < 631) {
                ml.field_c.flipHorizontally();
                ml.field_c.drawAdditive(557, 256, var2Lifetime2);
                ml.field_c.drawAdditive(559, 256, var2Lifetime2);
                ml.field_c.drawAdditive(557, 258, var2Lifetime2);
                ml.field_c.drawAdditive(559, 258, var2Lifetime2);
                ml.field_c.flipHorizontally();
              }
            }
          }
        }
        this.field_c.drawTransparent(16, 302);
        KeyboardStateSupport.field_c.drawParagraph(this.field_d[this.field_i], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
        IntrusiveDequeCursor.field_e.drawTransparent(30, 330);
        KeyboardStateSupport.field_c.drawParagraph(MatchingTextValidator.field_n[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
        KeyboardStateSupport.field_c.drawParagraph(MatchingTextValidator.field_n[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
        KeyboardStateSupport.field_c.drawParagraph(MatchingTextValidator.field_n[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
        LoginMethod.field_c.drawTransparent(508 + (127 - LoginMethod.field_c.fullWidth) / 2, 315);
        if (this.field_a.selectedIndex == 0) {
          QuickChatDynamicCommand.field_a[0].drawTransparent(508, 299);
        } else if (this.field_a.selectedIndex == 1) {
          QuickChatDynamicCommand.field_a[1].drawTransparent(508, 387);
        }
    }

    final int a(byte param0, boolean param1) {
        int var6 = EscapeVector.obfuscationControl;
        this.field_e = this.field_e + 65536;
        while (SimulatorAssetSupport.multiplyQ16(false, this.field_e, IntKeyLookup.field_a) >= 65536) {
          this.field_m = this.field_m + 1;
          this.field_e = this.field_e - IntKeyLookup.field_a;
        }
        int var3 = -1;
        if (param0 != 23) {
          return 103;
        }
        if (this.field_b != null) {
          var3 = this.field_b.length;
        }
        if (var3 != -1) {
          if (this.field_l < IntKeyLookup.field_e) {
            this.field_l = this.field_l + 1;
            if (this.field_l > IntKeyLookup.field_c && (this.field_b == null ||
              null == this.field_b[this.field_i])) {
              this.field_l = this.field_l - 1;
              boolean decompiledFrameRemainder0 = false;
            } else if (this.field_l >= IntKeyLookup.field_e &&
              null == this.field_b[(1 + this.field_i) % var3]) {
              this.field_l = this.field_l - 1;
            }
          }
          if (this.field_l >= IntKeyLookup.field_e) {
            this.field_j = this.field_i;
            this.field_l = this.field_l - IntKeyLookup.field_e;
            if (this.field_n) {
              this.field_i = this.field_i + 1;
              if (var3 <= this.field_i) {
                this.field_i = this.field_i - var3;
              }
            } else {
              this.field_i = this.field_i - 1;
              if (0 > this.field_i) {
                this.field_i = this.field_i + var3;
              }
            }
          }
          if (IntKeyLookup.field_c < this.field_l) {
            this.field_n = true;
          }
        }
        if (null != ml.field_c) {
          boolean var4 = false;
          if (AccountMessagePanel.field_N != 0 &&
            LoginDialog.field_ob > 257 &&
            LoginDialog.field_ob < 290) {
            if (sf.field_c > 9 &&
              82 > sf.field_c) {
              var4 = true;
              this.field_l = IntKeyLookup.field_e;
              this.field_n = false;
            }
            if (sf.field_c > 558 &&
              sf.field_c < 631) {
              this.field_n = true;
              var4 = true;
              this.field_l = IntKeyLookup.field_e;
            }
          }
          if (!var4 &&
            this.field_l > IntKeyLookup.field_c &&
            LoginDialog.field_ob > 257 &&
            290 > LoginDialog.field_ob) {
            if (GzipDecoder.field_d > 9 &&
              GzipDecoder.field_d < 82) {
              this.field_l = IntKeyLookup.field_c;
            }
            if (558 < GzipDecoder.field_d &&
              GzipDecoder.field_d < 631) {
              this.field_l = IntKeyLookup.field_c;
            }
          }
        }
        if (!param1) {
          return 0;
        }
        this.field_a.updatePointer(this.a(sf.field_c, LoginDialog.field_ob, -16311), (byte) 122, this.a(GzipDecoder.field_d, UiContainer.field_y, -16311));
        boolean var4Lifetime1 = false;
        if (this.field_a.isInitialActivation((byte) -18)) {
          if (this.field_a.selectedIndex == 0) {
            var4Lifetime1 = true;
          }
          if (1 == this.field_a.selectedIndex) {
            return 2;
          }
        }
        if (ValidationState.field_b) {
          while (AccountRequestDialog.pollKeyEvent(-71)) {
            int var5 = this.a(false);
            if (var5 == 0) {
              continue;
            }
            return var5;
          }
        }
        if (!var4Lifetime1) {
          return 0;
        }
        this.b(true);
        return 3;
    }

    private final int a(boolean param0) {
        this.field_a.handleKeyEvent((byte) 6);
        if (param0) {
          int[] var3 = (int[]) null;
          this.a((BitmapFont) null, 9, 97, -25, 47, 28, (String) null, (int[]) null);
        }
        if (this.field_a.isInitialActivation((byte) -18)) {
          if (this.field_a.selectedIndex == 0) {
            this.b(true);
            return 3;
          }
          if (this.field_a.selectedIndex == 1) {
            return 1;
          }
        }
        if (PasswordValidator.field_n == 13) {
          return 1;
        }
        return 0;
    }

    final static Sprite a(String param0, ResourceArchive param1, String param2, boolean param3) {
        String stackIn_5_2 = null;
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        try {
          int var4_int = param1.findGroupId(-1, param0);
          int var5 = param1.findFileId(var4_int, param2, param3);
          Sprite stackIn_1_0 = EditableTextWidget.a(var4_int, var5, param1, (byte) 9);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var4;
          StringBuilder stackIn_4_1 = new StringBuilder().append("fe.F(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          StringBuilder stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 != -83) {
          field_k = 94;
        }
        LegacyWidgetStyle.field_E = new AccountRegistrationPanel();
        rd.field_c.transitionToContent(LegacyWidgetStyle.field_E, 30);
    }

    private final void b(int param0) {
        int var5 = EscapeVector.obfuscationControl;
        if (this.field_b == null) {
          if (KeyboardStateSupport.field_c == null) {
            return;
          }
          KeyboardStateSupport.field_c.drawParagraph(um.field_a, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
          return;
        }
        IndexedSprite var6 = this.field_b[this.field_i];
        IndexedSprite var2 = var6;
        if (var2 != null) {
          var6.draw(9, 58);
        } else if (null != KeyboardStateSupport.field_c) {
          KeyboardStateSupport.field_c.drawParagraph(um.field_a, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
        }
        if (param0 > -109) {
          return;
        }
        if (IntKeyLookup.field_c > this.field_l) {
          IndexedSprite var7 = this.field_b[this.field_j];
          IndexedSprite var2Lifetime1 = var7;
          if (var2Lifetime1 != null) {
            int var3 = this.field_l * (var7.field_a + 60) / IntKeyLookup.field_c;
            int var4 = -30 + var3;
            if (this.field_n) {
              ModalPanel.drawIndexedSpriteAlphaGradient(9, (-var4 + var7.field_a) * 256 / 30, 4163, var7, 58, -256 * var4 / 30);
            } else {
              ModalPanel.drawIndexedSpriteAlphaGradient(9, -256 * var4 / 30, 4163, var2Lifetime1, 58, 256 * (var7.field_a - var4) / 30);
            }
          }
        }
        return;
    }

    final void a(boolean param0, byte param1) {
        this.field_l = IntKeyLookup.field_c;
        if (param1 != 47) {
          this.field_g = (Sprite) null;
        }
        this.field_m = 0;
        this.field_i = 0;
        this.field_e = 0;
        this.field_a.initializeSelection(105, param0, this.a(GzipDecoder.field_d, UiContainer.field_y, -16311), -1);
    }

    private final void a(boolean param0, String[] param1, IndexedSprite[] param2, java.applet.Applet param3, String param4, int param5) {
        String stackIn_15_2 = null;
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        String stackIn_24_2 = null;
        try {
          String var7 = param3.getParameter("currency");
          if (param5 != 13439) {
            this.field_m = -71;
          }
          if (var7 != null &&
            LoginCredentialType.isDecimalText(false, (CharSequence) ((Object) var7))) {
            this.field_o = ModeProgress.parseDecimal(16777215, (CharSequence) ((Object) var7));
          } else {
            this.field_o = 2;
          }
          this.field_f = param4;
          this.field_a = new MenuInputState(2);
          this.field_d = param1;
          this.field_b = param2;
          if (this.field_b != null &&
            3 <= this.field_b.length) {
            ValidationState.field_b = param0;
            return;
          }
          throw new IllegalArgumentException("");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_14_0 = runtimeException;
          StringBuilder stackIn_14_1 = new StringBuilder().append("fe.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          StringBuilder stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param5).append(')').toString());
        }
    }

    private final void b(byte param0) {
        if (null == this.field_g) {
          if (ReflectionCheck.field_h == null) {
            return;
          }
          this.field_g = new Sprite(622, 47);
          TickClock.pushSpriteRaster(this.field_g, (byte) -90);
          SoftwareRasterizer.fillVerticalGradient(0, 0, 622, 47, 4540749, 65793);
          int var2 = 16448250;
          int var3 = 10068666;
          int[] var17 = AchievementFlagSupport.blendPalette256(1746055568, var3, var2);
          this.a(ReflectionCheck.field_h, 0, 0, 47, 622, 0, this.field_f, var17);
          RasterRestoreSupport.popRasterState((byte) 107);
          this.field_c = new Sprite(475, 24);
          this.a(0, ReflectionCheck.field_h, NineSliceFrame.field_d, 24, 0, this.field_c, -4, 0.75f, var17, 475);
          int[] var18 = AchievementFlagSupport.blendPalette256(1746055568, 526344, 526344);
          Sprite var5 = new Sprite(121, 122);
          TickClock.pushSpriteRaster(var5, (byte) -40);
          SoftwareRasterizer.fillVerticalGradient(0, 0, var5.width, var5.height / 2, 16180917, 16306250);
          if (param0 <= 63) {
            String var8 = (String) null;
            this.a(false, (String[]) null, (IndexedSprite[]) null, (java.applet.Applet) null, (String) null, 46);
          }
          SoftwareRasterizer.fillVerticalGradient(0, var5.height / 2, var5.width, var5.height, 16306250, 15568919);
          String var6 = UiComponent.field_r;
          String var7 = mh.field_b;
          this.a(0, ReflectionCheck.field_h, var6, var5.height, 0, var5, -16, 0.5f, var18, var5.width);
          this.a(0, ReflectionCheck.field_h, var7, var5.height, 0, var5, 20, 0.5f, var18, var5.width);
          this.a(0, ReflectionCheck.field_h, p.field_f[this.field_o], var5.height / 3, 0, var5, -ReflectionCheck.field_h.maxAscent + (var5.height / 2 + 12), 0.699999988079071f, var18, var5.width);
          RasterRestoreSupport.popRasterState((byte) -54);
          this.field_h = new Sprite(121, 122);
          TickClock.pushSpriteRaster(this.field_h, (byte) -104);
          var5.drawCenteredRotatedScaledBilinear(this.field_h.width / 2, this.field_h.height / 2, -2048, 4096);
          RasterRestoreSupport.popRasterState((byte) -12);
          return;
        }
    }

    private final void a(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, String param6, int[] param7) {
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
            this.field_d = (String[]) null;
          }
          RasterRestoreSupport.popRasterState((byte) -95);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "fe.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    private final void b(boolean param0) {
        try {
          AudioService.a((byte) 53, PointCloudEffect.activeApplet((byte) -90));
        } catch (Exception exception) {
          exception.printStackTrace();
        }
        if (!param0) {
          this.b(98);
        }
    }

    final static void a(int param0) {
        AccountNoticeKind.resetAccountFlow(3161);
        int var1 = -82 % ((param0 + 5) / 57);
        DraggableWidget.field_F = true;
        DialWidget.field_H = true;
        Checkbox.field_F.closeAllPanels(17415);
        UiTheme.a((byte) 119, DualLinkNode.field_h, false);
    }

    private final int a(int param0, int param1, int param2) {
        if (TriangleMesh.field_z == null) {
          return -1;
        }
        if (508 <= param0 && param0 < 635 && param1 >= 299 &&
          386 > param1) {
          return 0;
        }
        if (param0 >= 508 && 635 > param0 && param1 >= 390 &&
          param1 < 475) {
          return 1;
        }
        if (param2 != -16311) {
          fe.a(-110);
        }
        return -1;
    }

    fe(java.applet.Applet param0, String param1, IndexedSprite[] param2, String[] param3) {
        this.field_n = true;
        this.field_e = 0;
        this.field_m = 0;
        try {
          this.a(true, param3, param2, param0, param1, 13439);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "fe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, BitmapFont param1, String param2, int param3, int param4, Sprite param5, int param6, float param7, int[] param8, int param9) {
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
          this.a(param1, param0, 0, var12, var11_int, 0, param2, param8);
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
