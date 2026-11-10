/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MembershipPromotionScreen {
    private String[] field_k;
    private int field_c;
    private MenuSelection field_a;
    private int field_i;
    static byte[] field_l;
    private Sprite field_p;
    private int field_q;
    private boolean field_f;
    private Sprite field_g;
    private String field_j;
    private IndexedSprite[] field_m;
    private int field_h;
    private Sprite field_b;
    private int field_e;
    private int field_o;
    static Sprite[] field_d;
    static String field_n;

    private final void buildTextSprites(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int[] var16 = null;
        int[] var14 = null;
        int[] var12 = null;
        int[] var10 = null;
        Sprite var6 = null;
        String var7 = null;
        String var8 = null;
        if (null == this.field_b) {
          if (null == AudioMixerHelpers.field_b) {
            return;
          }
          this.field_b = new Sprite(622, 47);
          ContentTransitionDialog.setRasterTarget((byte) -84, this.field_b);
          int var2 = 76 % ((param0 + 45) / 48);
          Rasterizer.fillVerticalGradient(0, 0, 622, 47, 4540749, 65793);
          var3 = 16448250;
          var4 = 10068666;
          var16 = BloodSplat.createColorRamp(var4, -107, var3);
          this.drawGradientText(-1, 0, 622, 0, 47, AudioMixerHelpers.field_b, var16, this.field_j);
          SingleChildWidget.popRasterState(-21189);
          this.field_g = new Sprite(475, 24);
          this.drawScaledGradientText(SecondaryNodeDequeIterator.field_e, 0, (byte) 112, this.field_g, var16, -4, AudioMixerHelpers.field_b, 475, 0.75f, 24);
          var14 = BloodSplat.createColorRamp(526344, -116, 526344);
          var12 = var14;
          var10 = var12;
          var6 = new Sprite(121, 122);
          ContentTransitionDialog.setRasterTarget((byte) -127, var6);
          Rasterizer.fillVerticalGradient(0, 0, var6.field_w, var6.field_t / 2, 16180917, 16306250);
          Rasterizer.fillVerticalGradient(0, var6.field_t / 2, var6.field_w, var6.field_t, 16306250, 15568919);
          var7 = TextButton.field_y;
          var8 = ProxySocketConnector.field_i;
          this.drawScaledGradientText(var7, 0, (byte) 63, var6, var14, -16, AudioMixerHelpers.field_b, var6.field_w, 0.5f, var6.field_t);
          this.drawScaledGradientText(var8, 0, (byte) 42, var6, var14, 20, AudioMixerHelpers.field_b, var6.field_w, 0.5f, var6.field_t);
          this.drawScaledGradientText(AudioMixerHelpers.field_e[this.field_h], 0, (byte) 99, var6, var10, var6.field_t / 2 + (-AudioMixerHelpers.field_b.field_I + 12), AudioMixerHelpers.field_b, var6.field_w, 0.699999988079071f, var6.field_t / 3);
          SingleChildWidget.popRasterState(-21189);
          this.field_p = new Sprite(121, 122);
          ContentTransitionDialog.setRasterTarget((byte) -121, this.field_p);
          var6.drawRotatedAboutCenter(this.field_p.field_w / 2, this.field_p.field_t / 2, -2048, 4096);
          SingleChildWidget.popRasterState(-21189);
          return;
        }
    }

    private final void drawScreenshotTransition(int param0) {
        IndexedSprite var2;
        int var3;
        int var4;
        int var5;
        IndexedSprite var6;
        IndexedSprite var7;
        IndexedSprite var2Lifetime1;
        var5 = ZombieDawn.field_J;
        if (this.field_m == null) {
          if (InsetTextPainter.field_r != null) {
            InsetTextPainter.field_r.drawParagraph(NameAvailabilityValidator.field_f, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
          }
          return;
        }
        var6 = this.field_m[this.field_c];
        var2 = var6;
        if (var2 != null) {
          var6.draw(9, 58);
        } else {
          if (InsetTextPainter.field_r != null) {
            InsetTextPainter.field_r.drawParagraph(NameAvailabilityValidator.field_f, 9, 58, 622, 196, 16754688, -1, 1, 1, 0);
          }
        }
        if (this.field_i < DraggableWidget.field_I) {
          var7 = this.field_m[this.field_e];
          var2Lifetime1 = var7;
          if (var2Lifetime1 != null) {
            var3 = (60 + var7.field_a) * this.field_i / DraggableWidget.field_I;
            var4 = -30 + var3;
            if (!this.field_f) {
              SpriteFadeHelpers.drawHorizontalFadeSprite(var2Lifetime1, (var7.field_a - var4) * 256 / 30, -256 * var4 / 30, 9, 58, (byte) 84);
            } else {
              SpriteFadeHelpers.drawHorizontalFadeSprite(var2Lifetime1, -256 * var4 / 30, 256 * (-var4 + var7.field_a) / 30, 9, 58, (byte) 84);
            }
          }
        }
        if (param0 != 9) {
          this.field_h = -111;
        }
        return;
    }

    private final void initialize(boolean param0, java.applet.Applet param1, int param2, String[] param3, String param4, IndexedSprite[] param5) {
        String var7 = null;
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
        RuntimeException var7_ref = null;
        try {
          var7 = param1.getParameter("currency");
          if (var7 != null &&
            ResizableModeHelpers.isDecimalInteger((byte) -117, (CharSequence) ((Object) var7))) {
            this.field_h = DualLinkDeque.parseDecimalInt((CharSequence) ((Object) var7), 115);
          } else {
            this.field_h = 2;
          }
          this.field_j = param4;
          this.field_a = new MenuSelection(param2);
          this.field_m = param5;
          this.field_k = param3;
          if (this.field_m != null &&
            this.field_m.length >= 3) {
            WhirlpoolHasher.field_r = param0;
            return;
          }
          throw new IllegalArgumentException("");
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_13_0 = var7_ref;
          stackIn_13_1 = new StringBuilder().append("o.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param5 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final int handleKeyboard(int param0) {
        this.field_a.navigateVertical(param0 + 17875);
        if (param0 != 3782) {
          return 58;
        }
        if (this.field_a.isActivated(param0 ^ -3772)) {
          if (this.field_a.field_d == 0) {
            this.openMembershipPage(1);
            return 3;
          }
          if (this.field_a.field_d == 1) {
            return 1;
          }
        }
        if (PasswordValidator.field_i == 13) {
          return 1;
        }
        return 0;
    }

    private final void drawScaledGradientText(String param0, int param1, byte param2, Sprite param3, int[] param4, int param5, Font param6, int param7, float param8, int param9) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var11_int = 0;
        RuntimeException var11 = null;
        int var12 = 0;
        Sprite var13 = null;
        try {
          var11_int = (int)((float)param7 / param8);
          var12 = (int)((float)param9 / param8);
          var13 = new Sprite(var11_int, var12);
          if (param2 < 6) {
            this.field_m = (IndexedSprite[]) null;
          }
          ContentTransitionDialog.setRasterTarget((byte) -83, var13);
          param3.drawScaled((int)((float)(-param1) / param8), (int)((float)(-param5) / param8), (int)((float)param3.field_w / param8), (int)((float)param3.field_t / param8));
          this.drawGradientText(-1, 0, var11_int, 0, var12, param6, param4, param0);
          SingleChildWidget.popRasterState(-21189);
          ContentTransitionDialog.setRasterTarget((byte) -91, param3);
          var13.drawScaledAveraged(param1, param5, param7, param9);
          SingleChildWidget.popRasterState(-21189);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_6_0 = var11;
          stackIn_6_1 = new StringBuilder().append("o.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final void open(boolean param0, int param1) {
        this.field_q = 0;
        this.field_i = DraggableWidget.field_I;
        this.field_o = 0;
        this.field_c = 0;
        this.field_a.initializeSelection(param0, (byte) -120, this.hitTest(FadingModalPanel.field_K, KeyStateHelpers.field_b, -33), -1);
        if (param1 != 1) {
          field_l = (byte[]) null;
        }
    }

    final void draw(byte param0) {
        int var2;
        int var3;
        int var4;
        String var5;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        var4 = ZombieDawn.field_J;
        Rasterizer.fillVerticalGradient(9, 9, 622, 47, 4540749, 65793);
        Rasterizer.fillRect(9, 257, 622, 33, 2585);
        Rasterizer.fillVerticalGradient(9, 265, 622, 11, 2585, 1515566);
        var2 = 0;
        var3 = 14;
        while (var2 < 4) {
          Rasterizer.fillVerticalGradient(var3, 331, 117, 90, 460551, 3881787);
          var2++;
          var3 += 121;
        }
        if (param0 < 102) {
          var5 = (String) null;
          this.drawGradientText(15, -22, 123, 21, -97, (Font) null, (int[]) null, (String) null);
        }
        var2Lifetime1 = 0;
        var3Lifetime1 = 299;
        while (var2Lifetime1 < 2) {
          Rasterizer.fillVerticalGradient(508, var3Lifetime1, 127, 42, 1130115, 3365268);
          Rasterizer.fillRect(508, var3Lifetime1 + 42, 127, 42, 12410);
          var3Lifetime1 += 91;
          var2Lifetime1++;
        }
        this.drawScreenshotTransition(9);
        if (null != AchievementsScreen.field_t &&
          AchievementsScreen.field_t.isIndexLoaded((byte) 73) &&
          AchievementsScreen.field_t.loadGroupByName(-1, "members_expansion_screen") &&
          AchievementsScreen.field_t.loadGroupByName(-1, "arialish12") &&
          AchievementsScreen.field_t.loadGroupByName(-1, "pump32") &&
          AddressHintGlobals.field_b != null &&
          AddressHintGlobals.field_b.isIndexLoaded((byte) 73) &&
          AddressHintGlobals.field_b.loadGroupByName(-1, "arialish12") &&
          AddressHintGlobals.field_b.loadGroupByName(-1, "pump32")) {
          JaggrabDownloader.field_i = HighscoresScreen.loadIndexedSprite(AchievementsScreen.field_t, "frame", "members_expansion_screen", 4424743);
          AchievementsScreen.field_r = LoginAndPacketHelpers.loadSpriteByName(AchievementsScreen.field_t, "arrow", 8, "members_expansion_screen");
          InsetTextPainter.field_r = PowerupPickup.loadGlyphFontByName("", -1, AddressHintGlobals.field_b, "arialish12", AchievementsScreen.field_t);
          AudioMixerHelpers.field_b = DualLinkDeque.loadCoverageFont(AddressHintGlobals.field_b, "pump32", "", 0, AchievementsScreen.field_t);
          Blast.field_i = LongAndTextLoginPayload.loadSpriteByName("benefit_orbs", AchievementsScreen.field_t, "members_expansion_screen", 1);
          AccountPromptTexts.field_c = LongAndTextLoginPayload.loadSpriteByName("button_text", AchievementsScreen.field_t, "members_expansion_screen", 1);
          LoginConnectionHelpers.field_c = PendingFlagRequest.loadSpritesByName((byte) 24, "members_expansion_screen", "button_highlights", AchievementsScreen.field_t);
          AchievementsScreen.field_t = null;
          AddressHintGlobals.field_b = null;
        }
        this.buildTextSprites((byte) -127);
        if (null == JaggrabDownloader.field_i) {
          return;
        }
        this.field_p.drawTransparent(376, 339);
        this.field_b.drawTransparent(9, 9);
        JaggrabDownloader.field_i.draw(0, 0);
        if (null != AchievementsScreen.field_r) {
          AchievementsScreen.field_r.drawTransparent(9, 257);
          AchievementsScreen.field_r.drawMirrored(558, 257);
          if (257 < FadingModalPanel.field_K &&
            FadingModalPanel.field_K < 290) {
            var2Lifetime2 = 40 + (40 * RoamingCountryHuman.sinFixed(2047, this.field_o << 4) >> 16);
            if (var2Lifetime2 > 0) {
              if (KeyStateHelpers.field_b > 9 &&
                KeyStateHelpers.field_b < 82) {
                AchievementsScreen.field_r.drawAdditive(8, 256, var2Lifetime2);
                AchievementsScreen.field_r.drawAdditive(10, 256, var2Lifetime2);
                AchievementsScreen.field_r.drawAdditive(8, 258, var2Lifetime2);
                AchievementsScreen.field_r.drawAdditive(10, 258, var2Lifetime2);
              } else {
                if (558 < KeyStateHelpers.field_b &&
                  KeyStateHelpers.field_b < 631) {
                  AchievementsScreen.field_r.flipHorizontal();
                  AchievementsScreen.field_r.drawAdditive(557, 256, var2Lifetime2);
                  AchievementsScreen.field_r.drawAdditive(559, 256, var2Lifetime2);
                  AchievementsScreen.field_r.drawAdditive(557, 258, var2Lifetime2);
                  AchievementsScreen.field_r.drawAdditive(559, 258, var2Lifetime2);
                  AchievementsScreen.field_r.flipHorizontal();
                }
              }
            }
          }
        }
        this.field_g.drawTransparent(16, 302);
        InsetTextPainter.field_r.drawParagraph(this.field_k[this.field_c], 9, 257, 622, 33, 16754688, -1, 1, 1, 0);
        Blast.field_i.drawTransparent(30, 330);
        InsetTextPainter.field_r.drawParagraph(NodeHashTable.field_a[0], 17, 428, 111, 35, 16754688, -1, 1, 1, 0);
        InsetTextPainter.field_r.drawParagraph(NodeHashTable.field_a[1], 138, 428, 111, 35, 16754688, -1, 1, 1, 0);
        InsetTextPainter.field_r.drawParagraph(NodeHashTable.field_a[2], 259, 428, 111, 35, 16754688, -1, 1, 1, 0);
        AccountPromptTexts.field_c.drawTransparent(508 + (127 - AccountPromptTexts.field_c.field_r) / 2, 315);
        if (this.field_a.field_d == 0) {
          LoginConnectionHelpers.field_c[0].drawTransparent(508, 299);
        } else {
          if (this.field_a.field_d == 1) {
            LoginConnectionHelpers.field_c[1].drawTransparent(508, 387);
          }
        }
    }

    public static void releaseStatics(boolean param0) {
        field_l = null;
        field_n = null;
        field_d = null;
        if (!param0) {
          field_d = (Sprite[]) null;
        }
    }

    private final void openMembershipPage(int param0) {
        try {
          GameWorld.openSubscribePage(AppletHostHelpers.getHostApplet(param0 ^ param0), 124);
        } catch (Exception exception) {
          exception.printStackTrace();
        }
    }

    private final int hitTest(int param0, int param1, int param2) {
        int var4 = -72 / ((83 - param2) / 41);
        if (null == JaggrabDownloader.field_i) {
          return -1;
        }
        if (param1 >= 508 &&
          param1 < 635 &&
          299 <= param0 &&
          param0 < 386) {
          return 0;
        }
        if (508 <= param1 && param1 < 635 && param0 >= 390 &&
          param0 < 475) {
          return 1;
        }
        return -1;
    }

    MembershipPromotionScreen(java.applet.Applet param0, String param1, IndexedSprite[] param2, boolean param3, String[] param4) {
        this.field_q = 0;
        this.field_f = true;
        this.field_o = 0;
        try {
          this.initialize(param3, param0, 2, param4, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "o.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final int update(boolean param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        var6 = ZombieDawn.field_J;
        if (param1 != 257) {
          return 122;
        }
        this.field_q = this.field_q + 65536;
        while (65536 <= FunOrbApplet.multiplyFixed16(108, DraggableWidget.field_E, this.field_q)) {
          this.field_o = this.field_o + 1;
          this.field_q = this.field_q - DraggableWidget.field_E;
        }
        var3 = -1;
        if (this.field_m != null) {
          var3 = this.field_m.length;
        }
        if (var3 != -1) {
          boolean decompiledFrameRemainder0 = true;
          if (DraggableWidget.field_P > this.field_i) {
            this.field_i = this.field_i + 1;
            if (DraggableWidget.field_I < this.field_i && (null == this.field_m ||
              null == this.field_m[this.field_c])) {
              this.field_i = this.field_i - 1;
              decompiledFrameRemainder0 = false;
            }
            else {
              if (DraggableWidget.field_P <= this.field_i &&
                null == this.field_m[(this.field_c + 1) % var3]) {
                this.field_i = this.field_i - 1;
              }
            }
          }
          if (DraggableWidget.field_P <= this.field_i) {
            this.field_e = this.field_c;
            if (!this.field_f) {
              this.field_c = this.field_c - 1;
              if (0 > this.field_c) {
                this.field_c = this.field_c + var3;
              }
            } else {
              this.field_c = this.field_c + 1;
              if (this.field_c >= var3) {
                this.field_c = this.field_c - var3;
              }
            }
            this.field_i = this.field_i - DraggableWidget.field_P;
          }
          if (DraggableWidget.field_I < this.field_i) {
            this.field_f = true;
          }
        }
        if (AchievementsScreen.field_r != null) {
          var4 = 0;
          if (GzipDecompressor.field_d != 0 &&
            257 < UiContainer.field_D &&
            UiContainer.field_D < 290) {
            if (ScreechEffect.field_j > 9 &&
              82 > ScreechEffect.field_j) {
              this.field_i = DraggableWidget.field_P;
              this.field_f = false;
              var4 = 1;
            }
            if (ScreechEffect.field_j > 558 &&
              631 > ScreechEffect.field_j) {
              this.field_i = DraggableWidget.field_P;
              this.field_f = true;
              var4 = 1;
            }
          }
          if (var4 == 0 &&
            DraggableWidget.field_I < this.field_i &&
            UiContainer.field_D > 257 &&
            UiContainer.field_D < 290) {
            if (KeyStateHelpers.field_b > 9 &&
              KeyStateHelpers.field_b < 82) {
              this.field_i = DraggableWidget.field_I;
            }
            if (558 < KeyStateHelpers.field_b &&
              KeyStateHelpers.field_b < 631) {
              this.field_i = DraggableWidget.field_I;
            }
          }
        }
        if (!param0) {
          return 0;
        }
        this.field_a.updatePointer((byte) -35, this.hitTest(FadingModalPanel.field_K, KeyStateHelpers.field_b, 125), this.hitTest(UiContainer.field_D, ScreechEffect.field_j, 126));
        var4Lifetime1 = 0;
        if (this.field_a.isActivated(-125)) {
          if (0 == this.field_a.field_d) {
            var4Lifetime1 = 1;
          }
          if (1 == this.field_a.field_d) {
            return 2;
          }
        }
        if (WhirlpoolHasher.field_r) {
          while (TileMap.pollKeyEvent(param1 - 146)) {
            var5 = this.handleKeyboard(param1 + 3525);
            if (var5 != 0) {
              return var5;
            }
          }
        }
        if (var4Lifetime1 == 0) {
          return 0;
        }
        this.openMembershipPage(1);
        return 3;
    }

    private final void drawGradientText(int param0, int param1, int param2, int param3, int param4, Font param5, int[] param6, String param7) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = ZombieDawn.field_J;
        try {
          TrafficVehicle.pushRasterState(1584);
          if (param0 != -1) {
            this.field_p = (Sprite) null;
          }
          for (var9_int = param1; var9_int < param4; var9_int++) {
            Rasterizer.setClip(param3, var9_int, param2, var9_int + 1);
            var10 = var9_int * param6.length / param4;
            var11 = param6[param6.length + (-var10 - 1)];
            param5.drawParagraph(param7, param3, param1, param2, param4, var11, -1, 1, 1, 0);
          }
          SingleChildWidget.popRasterState(-21189);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "o.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "??????";
    }
}
