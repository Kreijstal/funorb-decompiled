/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuScreen {
    private int field_e;
    private MenuInputState field_f;
    static int field_g;
    static boolean field_d;
    static StringBuilder field_h;
    static volatile long field_b;
    static IntrusiveDeque field_a;
    static MusicTrack[] musicTracks;

    private final void drawAchievementIcon(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int discarded$0 = 0;
        Sprite var7;
        int var8;
        Sprite var9;
        Sprite var10;
        Sprite stackIn_4_0 = null;
        Sprite stackIn_10_0 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        if (param4 == 32) {
          if ((1 << param3 & SocketConnector.field_c) != 0) {
            stackIn_10_0 = ValidatedTextWidget.field_Y[param3];
          } else {
            stackIn_10_0 = MenuInputState.field_b;
          }
          var10 = stackIn_10_0;
          var7 = var10;
          var10.drawTransparent(-16 + param0, param5 - 16);
        } else {
          if ((1 << param3 & SocketConnector.field_c) != 0) {
            stackIn_4_0 = MouseWheelInput.achievementIcons[param3];
          } else {
            stackIn_4_0 = StrongCacheReference.unachievedIcon;
          }
          var9 = stackIn_4_0;
          var10 = var9;
          var7 = var10;
          var10 = var9;
          var7 = var10;
          var7 = var9;
          if (param4 != 128) {
            var9.drawDownscaledAveraged(param0 - (param4 >> 1), -(param4 >> 1) + param5, param4, param4);
          } else {
            var9.drawTransparent(param0 - 64, -64 + param5);
          }
        }
        if (param2) {
          PasswordFieldPainter.field_C[DrawQueueGlobals.field_d] = param0;
          PasswordFieldPainter.field_F[DrawQueueGlobals.field_d] = param5;
          PasswordFieldPainter.field_B[DrawQueueGlobals.field_d] = param4;
          PasswordFieldPainter.field_G[DrawQueueGlobals.field_d] = param3;
          DrawQueueGlobals.field_d = DrawQueueGlobals.field_d + 1;
        }
        if (param1 != 3624) {
          discarded$0 = this.findItemAt(74, (byte) -42, -91);
        }
    }

    private final void drawAchievements(byte param0, int param1) {
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_35_0 = 0;
        BinaryBitmapFont stackIn_82_0 = null;
        String stackIn_83_1 = null;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var26 = Virogrid.field_F ? 1 : 0;
        var3 = 10;
        if (!Bzip2State.hasFeatureBit((byte) 13, 0) &&
          (512 & SocketConnector.field_c) == 0) {
          var3--;
        }
        var4 = -(20 * var3) + 20 + 320;
        DrawQueueGlobals.field_d = 0;
        var5 = 104;
        var6 = 0;
        if (param0 > -101) {
          this.drawMessageText((byte) -40);
        }
        while (10 > var6) {
          var7 = var6;
          if (BitCountAndDialogHelpers.field_d[var7]) {
            if (0 == (1 << var7 & SocketConnector.field_c)) {
              if (BitCountAndDialogHelpers.field_d[var7]) {
                stackIn_16_0 = (Bzip2State.hasFeatureBit((byte) 13, 0)) ? 1 : 0;
              } else {
                stackIn_16_0 = 0;
              }
            } else {
              stackIn_16_0 = 1;
            }
          } else {
            stackIn_16_0 = 1;
          }
          var8 = stackIn_16_0;
          if (var8 != 0) {
            this.drawAchievementIcon(var4, 3624, true, var7, PasswordFieldPainter.field_J[var7], var5);
          }
          var4 += 40;
          var6++;
        }
        if (TextJoinHelpers.field_d != -1) {
          stackIn_24_0 = TextJoinHelpers.field_d;
        } else {
          stackIn_24_0 = SoundPlaybackHelpers.field_c;
        }
        var6Lifetime1 = stackIn_24_0;
        IndexedSpriteState.drawDitheredHorizontalLine(400, 100, 32 + var5, 1141646, 120);
        var7Lifetime1 = 124;
        if (-1 != var6Lifetime1) {
          if (!BoundedUrlRequest.field_j[var6Lifetime1]) {
            stackIn_35_0 = ((SocketConnector.field_c & 1 << var6Lifetime1) != 0) ? 1 : 0;
          } else {
            stackIn_35_0 = 1;
          }
          var8Lifetime1 = stackIn_35_0;
          if (param1 != 2) {
            PopupInputHelpers.menuFont.drawLeft(DualLinkDeque.achievementTitles[var6Lifetime1].toUpperCase(), 320, 60 + var7Lifetime1, 8437759, -1);
            if ((SocketConnector.field_c & 1 << var6Lifetime1) == 0) {
              DropTargetWidget.smallFont.drawLeft(RasterEffectHelpers.field_g.toUpperCase(), 320, var7Lifetime1 + 78, 16711680, -1);
            } else {
              DropTargetWidget.smallFont.drawLeft(FallingParticle.field_j.toUpperCase(), 320, 78 + var7Lifetime1, 65280, -1);
            }
          }
          var9 = (int)(Math.cos((double)((float)UiTheme.field_r / 50.0f)) * 76.0);
          var10 = (int)(28.0 * Math.sin((double)((float)UiTheme.field_r / 50.0f)));
          var11 = (int)(Math.sin((double)((float)UiTheme.field_r / 50.0f)) * 76.0);
          var12 = (int)(Math.cos((double)((float)UiTheme.field_r / 50.0f)) * 28.0);
          var13 = (int)(Math.sin((double)((float)(UiTheme.field_r + 50) / 50.0f)) * 76.0);
          var14 = (int)(28.0 * Math.cos((double)((float)(UiTheme.field_r + 50) / 50.0f)));
          var15 = (int)(Math.sin((double)((float)(UiTheme.field_r + 100) / 50.0f)) * 76.0);
          var16 = (int)(28.0 * Math.cos((double)((float)(UiTheme.field_r + 100) / 50.0f)));
          var17 = (int)(Math.sin((double)((float)(UiTheme.field_r + 150) / 50.0f)) * 76.0);
          var18 = (int)(Math.cos((double)((float)(150 + UiTheme.field_r) / 50.0f)) * 28.0);
          var19 = 3072 / (-var10 + 96);
          var20 = 3072 / (-var12 + 96);
          var21 = 3072 / (96 - var14);
          var22 = 3072 / (96 - var16);
          var23 = 3072 / (96 - var18);
          var24 = 210;
          var25 = var7Lifetime1 + 108;
          if (LoadingProgressDialog.field_eb[var6Lifetime1] >= 1) {
            if (var10 < 0) {
              QuickChatPhraseRegistry.orbCoinIcon.drawDownscaledAveraged(-(var19 >> 1) + var9 + var24, -(var19 >> 1) + (var25 + (var9 / 2 + var10)), var19, var19);
            }
            if (LoadingProgressDialog.field_eb[var6Lifetime1] >= 2 &&
              var12 < 0) {
              QuickChatPhraseRegistry.orbCoinIcon.drawDownscaledAveraged(var11 + var24 - (var20 >> 1), -(var20 >> 1) - var11 / 2 + (var25 + var12), var20, var20);
            }
            if (3 <= LoadingProgressDialog.field_eb[var6Lifetime1] &&
              var14 < 0) {
              QuickChatPhraseRegistry.orbCoinIcon.drawDownscaledAveraged(-(var21 >> 1) + (var24 + var13), -(var21 >> 1) - var13 / 2 + (var25 + var14), var21, var21);
            }
            if (LoadingProgressDialog.field_eb[var6Lifetime1] >= 4 &&
              var16 < 0) {
              QuickChatPhraseRegistry.orbCoinIcon.drawDownscaledAveraged(-(var22 >> 1) + var24 + var15, var16 + var25 - var15 / 2 - (var22 >> 1), var22, var22);
            }
            if (LoadingProgressDialog.field_eb[var6Lifetime1] >= 5 &&
              0 > var18) {
              QuickChatPhraseRegistry.orbCoinIcon.drawDownscaledAveraged(var17 + var24 - (var23 >> 1), var25 - (var17 / 2 - var18 + (var23 >> 1)), var23, var23);
            }
          }
          this.drawAchievementIcon(var24, 3624, false, var6Lifetime1, 128, var25);
          if (LoadingProgressDialog.field_eb[var6Lifetime1] >= 1) {
            if (var10 >= 0) {
              QuickChatPhraseRegistry.orbCoinIcon.drawDownscaledAveraged(var24 - (-var9 + (var19 >> 1)), -(var19 >> 1) + var10 + var25 + var9 / 2, var19, var19);
            }
            if (LoadingProgressDialog.field_eb[var6Lifetime1] >= 2 &&
              0 <= var12) {
              QuickChatPhraseRegistry.orbCoinIcon.drawDownscaledAveraged(-(var20 >> 1) + var24 + var11, -(var20 >> 1) + var12 + var25 - var11 / 2, var20, var20);
            }
            if (LoadingProgressDialog.field_eb[var6Lifetime1] >= 3 &&
              var14 >= 0) {
              QuickChatPhraseRegistry.orbCoinIcon.drawDownscaledAveraged(var13 + var24 - (var21 >> 1), -(var21 >> 1) + (var14 + var25 - var13 / 2), var21, var21);
            }
            if (LoadingProgressDialog.field_eb[var6Lifetime1] >= 4 &&
              var16 >= 0) {
              QuickChatPhraseRegistry.orbCoinIcon.drawDownscaledAveraged(-(var22 >> 1) + var24 + var15, var16 + var25 - (var15 / 2 + (var22 >> 1)), var22, var22);
            }
            if (5 <= LoadingProgressDialog.field_eb[var6Lifetime1] &&
              var18 >= 0) {
              QuickChatPhraseRegistry.orbCoinIcon.drawDownscaledAveraged(-(var23 >> 1) + var24 + var17, -(var23 >> 1) + (var18 - var17 / 2 + var25), var23, var23);
            }
          }
          if (param1 != 2) {
            DropTargetWidget.smallFont.drawLeft(RasterSnapshot.field_m.toUpperCase(), 320, var7Lifetime1 + 158, 8437759, -1);
            DropTargetWidget.smallFont.drawLeft(Integer.toString(FullscreenFocusCanvas.field_c[var6Lifetime1]), 420, 158 + var7Lifetime1, 8437759, -1);
            DropTargetWidget.smallFont.drawLeft(DualLinkNode.field_i.toUpperCase(), 320, var7Lifetime1 + 178, 8437759, -1);
            DropTargetWidget.smallFont.drawLeft(Integer.toString(LoadingProgressDialog.field_eb[var6Lifetime1]), 420, var7Lifetime1 + 178, 8437759, -1);
            stackIn_82_0 = DropTargetWidget.smallFont;
            if (var8Lifetime1 == 0) {
              stackIn_83_1 = "???";
            } else {
              stackIn_83_1 = TextEncodingHelpers.achievementCriteria[var6Lifetime1].toUpperCase();
            }
            ((BinaryBitmapFont) (Object) stackIn_82_0).drawParagraph(stackIn_83_1, 320, var7Lifetime1 + 92, 190, 80, 8437759, -1, 0, 0, 20);
          }
        } else {
          if (param1 != 2) {
            if (VerticalScrollbar.isGuestSession(20)) {
              DropTargetWidget.smallFont.drawCentered(SpriteLoadHelpers.textCreateAccount1.toUpperCase(), 320, 270, 8437759, -1);
              DropTargetWidget.smallFont.drawCentered(DecodedSpriteHelpers.textCreateAccount2.toUpperCase(), 320, 290, 8437759, -1);
              DropTargetWidget.smallFont.drawParagraph(FadeLayer.field_L.toUpperCase(), 160, 210, 320, 80, 8437759, -1, 1, 0, 20);
            } else {
              DropTargetWidget.smallFont.drawParagraph(FadeLayer.field_L.toUpperCase(), 160, 240, 320, 80, 8437759, -1, 1, 0, 20);
            }
          }
        }
        var8Lifetime2 = 340;
        if (VerticalScrollbar.isGuestSession(20)) {
          var8Lifetime2 -= 20;
        }
        DropTargetWidget.smallFont.drawCentered(StripedProgressBar.textRatedAchievements.toUpperCase(), 320, var8Lifetime2, 8437759, -1);
        if (!VerticalScrollbar.isGuestSession(20)) {
          IndexedSpriteState.drawDitheredHorizontalLine(400, 100, 350, 1141646, 120);
        }
    }

    private final void moveSelection(int param0) {
        int var2;
        var2 = this.field_f.field_d;
        if (param0 != 0) {
          field_h = (StringBuilder) null;
        }
        if (MidiPcmStream.field_y == 6 &&
          !VerticalScrollbar.isGuestSession(param0 + 20)) {
          this.handleNavigationKeys(72);
        } else {
          if (0 != DelegatingCanvas.field_j[this.field_e].length) {
            this.field_f.handleVerticalNavigation(param0 ^ 61);
          }
        }
        if (this.field_f.field_d != var2) {
          SoundPlaybackHelpers.playSoundEffect(30, QuickChatCategoryCache.field_a);
        }
    }

    final void drawScreen(int param0, int param1, int param2) {
        int var6 = 0;
        int stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        int stackIn_2_3;
        int stackIn_3_4 = 0;
        int stackIn_17_1 = 0;
        boolean stackIn_18_2 = false;
        int var4;
        int var5;
        int var7;
        var7 = Virogrid.field_F ? 1 : 0;
        Rasterizer.fillRectangle(100, 0, 10, 400, 0);
        Rasterizer.fillRectangle(530, 0, 10, 400, 0);
        stackIn_2_0 = 110;
        stackIn_2_1 = 0;
        stackIn_2_2 = 420;
        stackIn_2_3 = 400;
        stackIn_3_4 = (param1 == 1) ? 127 : 263172;
        Rasterizer.fillRectangle(stackIn_2_0, stackIn_2_1, stackIn_2_2, stackIn_2_3, stackIn_3_4);
        if (this.field_e == 10) {
          return;
        }
        var4 = -(ReflectionCheckHelpers.standardFont.textWidth(TypeCode.field_e[this.field_e]) / 2) + 320;
        if (param2 >= -61) {
          return;
        }
        var5 = 40;
        if (this.field_e == 0) {
          Js5Archive.field_l.draw(-(Js5Archive.field_l.field_j / 2) + 320, 20);
        } else {
          ReflectionCheckHelpers.standardFont.drawLeft(TypeCode.field_e[this.field_e], var4, var5, 1141646, -1);
        }
        IndexedSpriteState.drawDitheredHorizontalLine(400, 100, 72, 1141646, 120);
        for (var6 = 0; this.field_f.field_o > var6; var6++) {
          if (this.isItemVisible(var6, -115)) {
            stackIn_17_1 = 64;
            stackIn_18_2 = (this.field_f.field_d == var6);
            this.drawMenuItem((byte) stackIn_17_1, stackIn_18_2, param1, var6);
          }
        }
        if (this.field_e == 6) {
          this.drawRankings(param1, 16290);
        } else {
          if (7 == this.field_e) {
            this.drawInstructionPage(param0, param1, (byte) 20);
          } else {
            if (8 != this.field_e) {
              if (this.field_e == 9 &&
                param1 != 2) {
                ReflectionCheckHelpers.standardFont.drawParagraph(FadeLayer.field_J, 135, 78, 370, 180, 8437759, -1, 1, 0, 18);
                return;
              }
            } else {
              this.drawAchievements((byte) -113, param1);
            }
          }
        }
        return;
    }

    final static String formatIndexedText(String[] args, String param1, int param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          var3_int = param1.length();
          var4 = var3_int;
          var5 = 0;
          if (param2 != 2) {
            var12 = (String) null;
            MenuScreen.formatIndexedText((String[]) null, (String) null, -50);
          }
          while (true) {
            var6_int = param1.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = 2 + var6_int; var3_int > var5; var5++) {
                if (DualLinkHashTable.isAsciiDigit(0, param1.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param1.substring(2 + var6_int, var5);
              if (!MusicVoiceMixer.isDecimalInteger((CharSequence) ((Object) var7_ref_String), param2 - 113)) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (param1.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = WhirlpoolDigest.parseDecimalInt((CharSequence) ((Object) var7_ref_String), false);
              var4 = var4 + (-var5 + var6_int + args[var8].length());
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          while (true) {
            var8Lifetime1 = param1.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$2 = var6.append(param1.substring(var7));
              stackIn_27_0 = var6.toString();
              return stackIn_27_0;
            }
            for (var5Lifetime1 = var8Lifetime1 + 2; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (DualLinkHashTable.isAsciiDigit(0, param1.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var9 = param1.substring(var8Lifetime1 + 2, var5Lifetime1);
            if (!MusicVoiceMixer.isDecimalInteger((CharSequence) ((Object) var9), param2 ^ -123)) {
              continue;
            }
            if (var5Lifetime1 >= var3_int) {
              continue;
            }
            if (param1.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = WhirlpoolDigest.parseDecimalInt((CharSequence) ((Object) var9), false);
            discarded$0 = var6.append(param1.substring(var7, var8Lifetime1));
            var7 = var5Lifetime1;
            discarded$1 = var6.append(args[var10]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("oi.F(");
          if (args == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void drawLobbyOverlays(boolean param0, int param1) {
        DebouncedValidator.drawLobbyAndChatPanels(param0, -8241);
        if (param1 != 6) {
          musicTracks = (MusicTrack[]) null;
        }
        ClientEnvironmentHelpers.drawOverlays(false, param0);
    }

    private final int findAchievementAt(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        var8 = Virogrid.field_F ? 1 : 0;
        for (var4 = 0; DrawQueueGlobals.field_d > var4; var4++) {
          var5 = PasswordFieldPainter.field_C[var4] - param0;
          var6 = -param2 + PasswordFieldPainter.field_F[var4];
          var7 = PasswordFieldPainter.field_B[var4] >> 1;
          if (-var7 <= var5 &&
            var7 >= var5 &&
            var6 >= -var7 &&
            var7 >= var6) {
            return PasswordFieldPainter.field_G[var4];
          }
        }
        var4Lifetime1 = 107 % ((70 - param1) / 37);
        return -1;
    }

    private final void drawRankings(int param0, int param1) {
        int var10 = 0;
        int stackIn_26_0;
        int stackIn_26_1;
        int stackIn_26_2;
        int stackIn_26_3;
        int stackIn_27_4;
        int var3;
        int var4;
        int var5;
        String var6;
        String[] var7;
        int[] var8;
        int var9;
        int var11;
        int var4Lifetime1;
        var11 = Virogrid.field_F ? 1 : 0;
        if (param0 == 2) {
          return;
        }
        if (VerticalScrollbar.isGuestSession(20)) {
          this.drawMessageText((byte) -86);
          return;
        }
        if (null == IsaacRandom.field_j) {
          IsaacRandom.field_j = MidiPcmStream.findOrQueueRequest(0, 7, 10, param1 ^ -16301);
        }
        var3 = 1141646;
        if (param1 != 16290) {
          musicTracks = (MusicTrack[]) null;
        }
        var4 = ReflectionCheckHelpers.standardFont.field_H + 64;
        var5 = var4;
        if (FullscreenState.field_c == 3) {
          var4 = var4 + DropTargetWidget.smallFont.field_H;
        }
        regionExit1: {
          LongAndTextLoginPayload.tinyFont.drawCentered(TextFieldValidator.field_j.toUpperCase(), 310, var5, var3, -1);
          LongAndTextLoginPayload.tinyFont.drawCentered(TextWidgetPainter.field_h.toUpperCase(), 368, var4, var3, -1);
          LongAndTextLoginPayload.tinyFont.drawCentered(SpriteState.field_s.toUpperCase(), 420, var5, var3, -1);
          LongAndTextLoginPayload.tinyFont.drawCentered(DialWidgetPainter.field_s.toUpperCase(), 458, var4, var3, -1);
          var4 += 24;
          LongAndTextLoginPayload.tinyFont.drawCentered(SpriteState.field_o.toUpperCase(), 500, var5, var3, -1);
          if (IsaacRandom.field_j.field_s) {
            if (IsaacRandom.field_j.field_j != null) {
              var6 = RasterSnapshot.field_s.toUpperCase();
              var7 = IsaacRandom.field_j.field_j[GameApplet.field_c];
              var8 = IsaacRandom.field_j.field_t[GameApplet.field_c];
              var9 = 0;
              for (var10 = 0; var10 < 10; var10++) {
                if (var7[var10] != null) {
                  var3 = 1141646;
                  if (PacketBuffer.isLocalPlayerName(var7[var10], true)) {
                    var3 = 16777215;
                    var9 = 1;
                  }
                  stackIn_26_0 = 118;
                  stackIn_26_1 = -DropTargetWidget.smallFont.field_H - DropTargetWidget.smallFont.field_G + var4;
                  stackIn_26_2 = 400;
                  stackIn_26_3 = 22;
                  if (var10 % 2 != 1) {
                    stackIn_27_4 = 665399;
                  } else {
                    stackIn_27_4 = 996169;
                  }
                  Rasterizer.fillRectangle(stackIn_26_0, stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_27_4);
                  var6 = "";
                  this.drawRankingRow(178, var8[3 + var10 * 4], var7[var10], var4, var8[4 * var10 + 2], var3, var10, var8[4 * var10 + 1], var8[var10 * 4]);
                }
                var4 += 21;
              }
              if (((var9 == 0)) &&
                (!(0 >= IsaacRandom.field_j.field_q + (IsaacRandom.field_j.field_m + IsaacRandom.field_j.field_h)))) {
                var3 = 8437759;
                this.drawRankingRow(param1 - 16112, IsaacRandom.field_j.field_m, DebouncedValidator.field_d, var4, IsaacRandom.field_j.field_q, var3, -1, IsaacRandom.field_j.field_h, IsaacRandom.field_j.field_u);
              }
              break regionExit1;
            }
            var6 = ProxyAuthenticationRequiredException.field_a.toUpperCase();
          } else {
            var6 = QuickChatCategoryCache.field_b.toUpperCase();
          }
        }
        var4Lifetime1 = 120 + DropTargetWidget.smallFont.field_H + 10 * DelegatingCanvas.field_a[6] / 2;
        DropTargetWidget.smallFont.drawCentered(var6, 320, var4Lifetime1, 8437759, -1);
        return;
    }

    private final void drawRankingRow(int param0, int param1, String param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        String var17 = null;
        int var10_int = param1 + param7 + param4;
        if (param6 != -1) {
          DropTargetWidget.smallFont.drawRight(param6 + 1 + ". ", 140, param3, param5, -1);
        }
        if (var10_int != 0) {
          param4 = (param4 * 200 + var10_int) / (var10_int * 2);
          param1 = (var10_int + param1 * 200) / (2 * var10_int);
          param7 = (param7 * 200 + var10_int) / (var10_int * 2);
        }
        String var12 = param2;
        DropTargetWidget.smallFont.drawLeft(var12, 140, param3, param5, -1);
        String var13 = Integer.toString(param8);
        DropTargetWidget.smallFont.drawCentered(var13, 310, param3, param5, -1);
        String var14 = var10_int < 50 ? Integer.toString(var10_int) : "50+";
        String var11 = var14;
        DropTargetWidget.smallFont.drawCentered(var14, 368, param3, param5, -1);
        String var15 = param7 + "%";
        DropTargetWidget.smallFont.drawCentered(var15, 420, param3, param5, -1);
        String var16 = param1 + "%";
        if (param0 != 178) {
          return;
        }
        try {
          DropTargetWidget.smallFont.drawCentered(var16, 458, param3, param5, -1);
          var17 = param4 + "%";
          DropTargetWidget.smallFont.drawCentered(var17, 500, param3, param5, -1);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "oi.CA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void handlePointer(boolean param0, double param1, double param2, int param3, int param4, int param5) {
        int var9 = 0;
        int var10 = 0;
        int var11 = Virogrid.field_F ? 1 : 0;
        if (param3 == 2) {
          return;
        }
        if (!TextFieldValidator.field_k &&
          !Js5Archive.field_e) {
          if (this.field_e != 8) {
          } else {
            SoundPlaybackHelpers.field_c = param0 ? -1 : this.findAchievementAt((int)param2, -94, (int)param1);
            if (param5 == 1) {
              if (TextJoinHelpers.field_d == SoundPlaybackHelpers.field_c) {
                TextJoinHelpers.field_d = -1;
              } else {
                if (-1 != SoundPlaybackHelpers.field_c) {
                  TextJoinHelpers.field_d = SoundPlaybackHelpers.field_c;
                }
              }
            }
          }
          if (param0) {
            this.field_f.updatePointer(-1, false, -1);
          } else {
            var9 = this.field_f.field_d;
            var10 = this.findItemAt((int)param1, (byte) -128, (int)param2);
            this.field_f.updatePointer(var10, false, var10);
            if (-1 != this.field_f.field_d) {
              this.activateItem(this.field_f.field_d, true, param4 ^ -423235729);
            }
            if (this.field_f.field_d != var9) {
              SoundPlaybackHelpers.playSoundEffect(30, QuickChatCategoryCache.field_a);
            }
          }
        }
        if (param4 != -3666) {
          field_a = (IntrusiveDeque) null;
        }
    }

    private final void handleNavigationKeys(int param0) {
        int var3;
        var3 = Virogrid.field_F ? 1 : 0;
        if (96 == ScrollPane.field_Gb) {
          if (this.field_f.field_d > 0) {
            if (this.field_f.field_d != 2) {
              this.field_f.selectIndex(-75, 0);
            }
          } else {
            this.field_f.selectIndex(param0 - 168, 1);
          }
        }
        if (97 == ScrollPane.field_Gb) {
          if (this.field_f.field_d != 1) {
            if (this.field_f.field_d != 2) {
              this.field_f.selectIndex(-120, 1);
            }
          } else {
            this.field_f.selectIndex(param0 - 105, 0);
          }
        }
        if (ScrollPane.field_Gb == 99) {
          if (this.field_f.field_d >= 0 &&
            this.field_f.field_d <= 1) {
            this.field_f.selectIndex(-75, 2);
          } else {
            this.field_f.selectIndex(param0 ^ -39, GameApplet.field_c);
          }
        }
        if (ScrollPane.field_Gb == 98) {
          if (this.field_f.field_d == 2) {
            this.field_f.selectIndex(-61, GameApplet.field_c);
          } else {
            this.field_f.selectIndex(-76, 2);
          }
        }
        if (param0 != 72) {
          this.handleInput((byte) -44);
        }
        this.field_f.captureKeyCode((byte) 32);
    }

    private final void drawMessageText(byte param0) {
        DropTargetWidget.smallFont.drawCentered(ContentTransitionDialog.field_mb.toUpperCase(), 320, 197 + ReflectionCheckHelpers.standardFont.field_H, 8437759, -1);
        if (param0 > -1) {
          this.drawMenuItem((byte) -58, false, -58, 36);
        }
    }

    private final void activateItem(int param0, boolean param1, int param2) {
        int var4 = DelegatingCanvas.field_j[this.field_e][param0];
        this.performItemAction(param0, var4, (byte) 124);
        if (param2 != 423239361) {
          field_b = 60L;
        }
        if (this.field_f.isForwardAction(83)) {
          if (14 != var4 &&
            var4 != 15) {
            SoundPlaybackHelpers.playSoundEffect(30, ReportAbuseDialog.field_Lb);
          }
          ByteStorage.handleGameMenuAction(2094, param1, var4);
        }
    }

    final void updatePointerSelection(byte param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = Virogrid.field_F ? 1 : 0;
        if (this.field_f.field_d != -1) {
          param1 = this.field_f.field_d;
        }
        if (param0 <= 115) {
          return;
        }
        this.field_f.initializeSelection(param2, this.findItemAt((int)PendingSubmission.field_k, (byte) -128, (int)DialogMessagePane.field_M), -563, param1);
        MusicPatchEnvelope.field_c = UiTheme.field_r;
        if (this.field_e == 8) {
          SoundPlaybackHelpers.field_c = -1;
          TextJoinHelpers.field_d = -1;
          for (var4 = 0; var4 < 10; var4++) {
            PasswordFieldPainter.field_J[var4] = 0;
          }
        }
    }

    private final int getItemTop(int param0, int param1) {
        if (6 == this.field_e &&
          !VerticalScrollbar.isGuestSession(param0 ^ 2)) {
          if (param1 < 2) {
            return DelegatingCanvas.field_f[this.field_e];
          }
          return DelegatingCanvas.field_f[this.field_e] + DelegatingCanvas.field_a[this.field_e];
        }
        if (param0 != 22) {
          field_h = (StringBuilder) null;
        }
        return param1 * DelegatingCanvas.field_a[this.field_e] + DelegatingCanvas.field_f[this.field_e];
    }

    private final int findItemAt(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        var6 = Virogrid.field_F ? 1 : 0;
        if (IconTextComponent.field_Jb > ClientEnvironmentHelpers.field_c.field_J) {
          return -1;
        }
        for (var4 = 0; DelegatingCanvas.field_j[this.field_e].length > var4; var4++) {
          var5 = this.getItemTop(22, var4);
          if (this.isItemVisible(var4, -107) &&
            param2 >= this.getItemLeft(-57, var4) &&
            param2 < this.getItemRight((byte) -94, var4) &&
            var5 <= param0 &&
            param0 < this.getItemHeight(var4, (byte) 94) + var5) {
            return var4;
          }
        }
        if (param1 > -124) {
          field_g = -3;
        }
        return -1;
    }

    private final void performItemAction(int param0, int param1, byte param2) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        boolean stackIn_116_0 = false;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = Virogrid.field_F ? 1 : 0;
        if (param2 < 81) {
          this.drawScreen(-95, 86, -94);
        }
        regionExit1: {
          var5 = param1;
          if (var5 != 0) {
            regionExit2: {
              if (var5 != 24) {
                if (var5 == 1) {
                  break regionExit1;
                }
                if (2 == var5) {
                  break regionExit1;
                }
                if (var5 == 7) {
                  break regionExit1;
                }
                if (var5 == 3) {
                  break regionExit1;
                }
                if (5 != var5 &&
                  8 != var5 &&
                  var5 != 4 &&
                  var5 != 6) {
                  if (9 == var5) {
                    break regionExit1;
                  }
                  if (var5 == 10) {
                    break regionExit1;
                  }
                  if (var5 != 11) {
                    if (var5 == 18) {
                      break regionExit1;
                    }
                    if (19 != var5 &&
                      12 != var5) {
                      if (var5 == 20) {
                        break regionExit1;
                      }
                      if (var5 != 21) {
                        if (var5 == 22) {
                          break regionExit1;
                        }
                        if (var5 != 13) {
                          if (var5 == 23) {
                            break regionExit1;
                          }
                          if (var5 == 14) {
                            var4 = 0;
                            if (this.field_f.isHomePressed((byte) 104) &&
                              DelegatingCanvas.field_c > 0) {
                              TextFieldValidator.setSoundEffectVolume((byte) 83, 0);
                              var4 = 1;
                            }
                            if (this.field_f.isEndPressed((byte) 46) &&
                              DelegatingCanvas.field_c < 256) {
                              TextFieldValidator.setSoundEffectVolume((byte) 43, 256);
                              var4 = 1;
                            }
                            if (this.field_f.isPointerHeld((byte) 121)) {
                              var5 = -120 + (this.getItemLeft(102, param0) + this.getItemRight((byte) -94, param0)) + AccountTermsPanel.field_L >> 1;
                              var6 = (int)DialogMessagePane.field_M - var5;
                              var7 = var6 * 256 / 120;
                              if (0 >= var7) {
                                TextFieldValidator.setSoundEffectVolume((byte) 58, 0);
                              } else {
                                if (var7 >= 256) {
                                  TextFieldValidator.setSoundEffectVolume((byte) 61, 256);
                                } else {
                                  TextFieldValidator.setSoundEffectVolume((byte) 35, var7);
                                }
                              }
                              var4 = 1;
                            }
                            if (this.field_f.isLeftPressed(31) &&
                              DelegatingCanvas.field_c > 0) {
                              LoginRsaKey.decreaseMusicVolume(88);
                              var4 = 1;
                            }
                            if (this.field_f.isRightPressed((byte) -125) &&
                              DelegatingCanvas.field_c < 256) {
                              LoginCredentialType.increaseVolume((byte) 64);
                              var4 = 1;
                            }
                            if (((var4 != 0)) && ((!(this.field_f.isPointerHeld((byte) 122)) ||
                              !(MusicPatchEnvelope.field_c >= UiTheme.field_r)))) {
                              SoundPlaybackHelpers.playSoundEffect(30, ReportAbuseDialog.field_Lb);
                              MusicPatchEnvelope.field_c = UiTheme.field_r + 20;
                            }
                            break regionExit1;
                          }
                          if (var5 == 15) {
                            if (this.field_f.isHomePressed((byte) 119)) {
                              CachedTextLayout.setMusicVolume(0, 0);
                            }
                            if (this.field_f.isEndPressed((byte) 102)) {
                              CachedTextLayout.setMusicVolume(256, 0);
                            }
                            if (this.field_f.isPointerHeld((byte) 122)) {
                              var5 = -120 + (this.getItemLeft(82, param0) - (-this.getItemRight((byte) -94, param0) - AccountTermsPanel.field_L)) >> 1;
                              var6 = (int)DialogMessagePane.field_M - var5;
                              var7 = 256 * var6 / 120;
                              if (var7 > 0) {
                                if (var7 >= 256) {
                                  CachedTextLayout.setMusicVolume(256, 0);
                                } else {
                                  CachedTextLayout.setMusicVolume(var7, 0);
                                }
                              } else {
                                CachedTextLayout.setMusicVolume(0, 0);
                              }
                            }
                            if (this.field_f.isLeftPressed(31)) {
                              TextureCache.decreaseMusicVolume(11864);
                            }
                            if (this.field_f.isRightPressed((byte) -128)) {
                              MusicVolumeAndOverlayHelpers.stepMusicVolumeUp((byte) 99);
                            }
                          } else {
                            if (var5 == 16) {
                              if (!this.field_f.isBackAction(26505) &&
                                !this.field_f.isNextAction(-1)) {
                                break regionExit2;
                              }
                              if (ByteArrayPool.field_c >= 2) {
                                ByteArrayPool.field_c = 0;
                                PendingRequest.createGameOptions(true, (byte) 87);
                              } else {
                                ByteArrayPool.field_c = LoginMethod.field_l;
                                PendingRequest.createGameOptions(true, (byte) 87);
                              }
                              break regionExit1;
                            }
                            if (var5 != 17) {
                              if (var5 == 28) {
                                if (this.field_f.isNextAction(-1) ||
                                  this.field_f.isBackAction(26505)) {
                                  stackIn_116_0 = !(RegistrationRequestDialog.field_Db);
                                  RegistrationRequestDialog.field_Db = stackIn_116_0;
                                }
                              } else {
                                switch (var5) {
                                  case 26:
                                    if (this.field_f.isNextAction(-1)) {
                                      MusicCrossfadeStream.field_y = (MusicCrossfadeStream.field_y + 1) % ProgressMessageDialog.turnDurations.length;
                                      break regionExit1;
                                    }
                                    if (!this.field_f.isBackAction(26505)) {
                                      break regionExit2;
                                    }
                                    MusicCrossfadeStream.field_y = (-1 - (-ProgressMessageDialog.turnDurations.length - MusicCrossfadeStream.field_y)) % ProgressMessageDialog.turnDurations.length;
                                    break regionExit1;
                                  default:
                                    break regionExit1;
                                  case 27:
                                    if (this.field_f.isNextAction(-1)) {
                                      DraggableWidget.field_I = (DraggableWidget.field_I + 1) % LongAndTextCredentials.aiLevelNames.length;
                                      break regionExit1;
                                    }
                                    if (!this.field_f.isBackAction(26505)) {
                                      break regionExit2;
                                    }
                                    DraggableWidget.field_I = (LongAndTextCredentials.aiLevelNames.length - (1 - DraggableWidget.field_I)) % LongAndTextCredentials.aiLevelNames.length;
                                    break regionExit1;
                                  case 25:
                                    break;
                                }
                              }
                              if (this.field_f.isNextAction(-1)) {
                                TextJoinHelpers.field_b = (TextJoinHelpers.field_b + 1) % ScoreSubmissionHelpers.gridSizes.length;
                              } else {
                                if (!(!this.field_f.isBackAction(26505))) {
                                  TextJoinHelpers.field_b = (ScoreSubmissionHelpers.gridSizes.length - 1 + TextJoinHelpers.field_b) % ScoreSubmissionHelpers.gridSizes.length;
                                }
                              }
                              break regionExit1;
                            }
                            if (MarkerSlider.field_H.field_g) {
                              if (this.field_f.isBackAction(26505)) {
                                fieldTemp$1 = ByteArrayPool.field_c - 1;
                                ByteArrayPool.field_c = ByteArrayPool.field_c - 1;
                                if (2 <= fieldTemp$1) {
                                  LoginMethod.field_l = ByteArrayPool.field_c;
                                  PendingRequest.createGameOptions(true, (byte) 87);
                                } else {
                                  ByteArrayPool.field_c = TextFieldPainter.detailNames.length - 1;
                                  LoginMethod.field_l = ByteArrayPool.field_c;
                                  PendingRequest.createGameOptions(true, (byte) 87);
                                }
                                break regionExit1;
                              }
                              if (this.field_f.isNextAction(-1)) {
                                fieldTemp$0 = ByteArrayPool.field_c + 1;
                                ByteArrayPool.field_c = ByteArrayPool.field_c + 1;
                                if (fieldTemp$0 >= TextFieldPainter.detailNames.length) {
                                  ByteArrayPool.field_c = 2;
                                }
                                LoginMethod.field_l = ByteArrayPool.field_c;
                                PendingRequest.createGameOptions(true, (byte) 87);
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    MenuScreen(int param0) {
        this.field_e = param0;
        this.field_f = new MenuInputState(DelegatingCanvas.field_j[this.field_e].length);
        if (DelegatingCanvas.field_j[this.field_e].length == 0) {
          this.field_f.field_d = -1;
        }
    }

    final void handleInput(byte param0) {
        int discarded$0 = 0;
        int var2 = 0;
        int stackIn_31_0 = 0;
        int var3;
        int var4;
        var4 = Virogrid.field_F ? 1 : 0;
        if (!TextFieldValidator.field_k &&
          !Js5Archive.field_e) {
          while (GrowableIntList.pollKeyEvent((byte) -125)) {
            if (ScrollPane.field_Gb != 13) {
              this.moveSelection(0);
              if (-1 == this.field_f.field_d) {
                continue;
              }
              this.activateItem(this.field_f.field_d, false, 423239361);
              continue;
            }
            if (this.field_e != 2 &&
              this.field_e != 3 &&
              this.field_e != 4 &&
              this.field_e != 5) {
              if (LoginMethodHelpers.field_e == this.field_e) {
                continue;
              }
              if (0 != LoginMethodHelpers.field_e &&
                LoginMethodHelpers.field_e != 2 &&
                3 != LoginMethodHelpers.field_e &&
                LoginMethodHelpers.field_e != 4) {
                if (LoginMethodHelpers.field_e != 5) {
                  continue;
                }
                ByteStorage.handleGameMenuAction(2094, false, 8);
                continue;
              }
              ByteStorage.handleGameMenuAction(2094, false, 8);
              continue;
            }
            ByteStorage.handleGameMenuAction(2094, false, 2);
          }
        }
        if (param0 >= -45) {
          discarded$0 = this.getItemLeft(-89, -85);
        }
        if (this.field_e == 8) {
          for (var2 = 0; var2 < 10; var2++) {
            if (var2 == TextJoinHelpers.field_d) {
              stackIn_31_0 = 48;
            } else {
              stackIn_31_0 = (SoundPlaybackHelpers.field_c == var2) ? 40 : 32;
            }
            var3 = stackIn_31_0;
            if (PasswordFieldPainter.field_J[var2] <= var3) {
              if (PasswordFieldPainter.field_J[var2] < var3) {
                PasswordFieldPainter.field_J[var2] = PasswordFieldPainter.field_J[var2] + 1;
              }
            } else {
              PasswordFieldPainter.field_J[var2] = PasswordFieldPainter.field_J[var2] - 1;
            }
          }
        }
    }

    private final void drawInstructionPage(int param0, int param1, byte param2) {
        String var4 = TooltipAndOptionsHelpers.instructionPages[param0];
        int var5 = DropTargetWidget.smallFont.wrappedLineCount(var4, 370);
        int var7 = 100 % ((-48 - param2) / 63);
        int var6 = 16 + 18 * var5;
        IndexedSpriteState.drawDitheredHorizontalLine(400, 100, 72, 1141646, 120);
        IndexedSpriteState.drawDitheredHorizontalLine(400, 100, 72 + var6, 1141646, 120);
        PlayingSound.drawDitheredVerticalLine(73, 1141646, 120, (byte) -122, -1 + var6);
        PlayingSound.drawDitheredVerticalLine(73, 1141646, 519, (byte) -110, -1 + var6);
        if (param1 != 2) {
          DropTargetWidget.smallFont.drawParagraph(var4, 135, 78, 370, 180, 8437759, -1, 0, 0, 18);
        }
    }

    private final boolean isItemVisible(int param0, int param1) {
        if (param1 > -100) {
          this.drawMenuItem((byte) 52, false, -102, -36);
        }
        return true;
    }

    private final void drawMenuItem(byte param0, boolean param1, int param2, int param3) {
        StringBuilder stackIn_6_0 = null;
        String stackIn_7_1 = null;
        StringBuilder stackIn_11_0 = null;
        String stackIn_12_1 = null;
        StringBuilder stackIn_16_0 = null;
        String stackIn_17_1 = null;
        String stackIn_26_0 = null;
        int stackIn_52_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_64_0 = 0;
        int var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        String var19;
        String var20;
        var18 = Virogrid.field_F ? 1 : 0;
        if (param2 == 2) {
          return;
        }
        var5 = -24 % ((param0 + 92) / 33);
        var6 = DelegatingCanvas.field_j[this.field_e][param3];
        var19 = LoginDialog.field_pb[var6];
        var7 = var19;
        var7 = var19;
        var7 = var19;
        switch (var6) {
          case 8:
            if (LoginMethodHelpers.field_e != 0 &&
              GameClock.field_c != 0) {
              if (LoginMethodHelpers.field_e != 2 &&
                GameClock.field_c != 2) {
                if (LoginMethodHelpers.field_e != 3 &&
                  GameClock.field_c != 3 &&
                  LoginMethodHelpers.field_e != 4 &&
                  GameClock.field_c != 4 &&
                  5 != LoginMethodHelpers.field_e &&
                  5 != GameClock.field_c) {
                  break;
                }
                var7 = DialWidgetPainter.field_j;
                break;
              }
              var7 = PasswordValidator.field_p;
              break;
            }
            var7 = LoginDialog.field_pb[7];
            break;
          case 25:
            var7 = MenuScreen.formatIndexedText(new String[]{QuickChatCategoryCache.gameOptionNames[1][TextJoinHelpers.field_b]}, var19, 2);
            break;
          case 27:
            var7 = MenuScreen.formatIndexedText(new String[]{LongAndTextCredentials.aiLevelNames[DraggableWidget.field_I]}, var19, 2);
            break;
          case 19:
            if (TextDecodeHelpers.field_g != 0) {
              stackIn_26_0 = IconLabelWidget.field_Eb;
            } else {
              stackIn_26_0 = IconTextComponent.field_Gb;
            }
            var7 = stackIn_26_0;
            break;
          case 26:
            var7 = MenuScreen.formatIndexedText(new String[]{QuickChatCategoryCache.gameOptionNames[0][MusicCrossfadeStream.field_y]}, var19, 2);
            break;
          case 28:
            stackIn_16_0 = new StringBuilder().append(var19);
            if (!RegistrationRequestDialog.field_Db) {
              stackIn_17_1 = FullscreenSupport.field_b;
            } else {
              stackIn_17_1 = QuickChatPhraseRegistry.field_f;
            }
            var7 = ((StringBuilder) (Object) stackIn_16_0).append(stackIn_17_1).toString();
            break;
          case 17:
            stackIn_11_0 = new StringBuilder().append(var19);
            if (!MarkerSlider.field_H.field_g) {
              stackIn_12_1 = LobbySessionHelpers.textNotAvailableIn2d;
            } else {
              stackIn_12_1 = TextFieldPainter.detailNames[ByteArrayPool.field_c];
            }
            var7 = ((StringBuilder) (Object) stackIn_11_0).append(stackIn_12_1).toString();
            break;
          case 16:
            stackIn_6_0 = new StringBuilder().append(var19);
            if (MarkerSlider.field_H.field_g) {
              stackIn_7_1 = GameKeyHandler.text3d;
            } else {
              stackIn_7_1 = ChatFilterHelpers.text2d;
            }
            var7 = ((StringBuilder) (Object) stackIn_6_0).append(stackIn_7_1).toString();
            break;
          default:
            break;
        }
        var20 = var7.toUpperCase();
        var8 = PopupInputHelpers.menuFont.textWidth(var20);
        var9 = this.getItemLeft(108, param3);
        var10 = this.getItemRight((byte) -94, param3);
        var11 = this.getItemTop(22, param3);
        if (var6 == 14 ||
          15 == var6) {
          var8 = AccountTermsPanel.field_L + 120;
        }
        var12 = -var8 + (var9 + var10) >> 1;
        var13 = this.getItemHeight(param3, (byte) -123);
        var14 = var10 - var9;
        var15 = this.getItemHeight(param3, (byte) 56);
        WidgetContainer.drawMenuButtonBackground(param2, 6752, var14, var9, param1, var11, var15);
        stackIn_52_0 = (!param1) ? 8437759 : 16777215;
        var16 = stackIn_52_0;
        if (17 == var6 &&
          !MarkerSlider.field_H.field_g) {
          stackIn_57_0 = (param1) ? 12632256 : 7829367;
          var16 = stackIn_57_0;
        }
        PopupInputHelpers.menuFont.drawLeft(var20, var12, var11 + PopupInputHelpers.menuFont.field_H, var16, -1);
        if (var6 != 14 &&
          var6 != 15) {
          return;
        }
        var12 = var12 + AccountTermsPanel.field_L;
        Rasterizer.drawRectangle(var12, -1 + var13 / 2 + var11, 121, 2, var16);
        if (14 == var6) {
          stackIn_64_0 = 120 * DelegatingCanvas.field_c / 256;
        } else {
          stackIn_64_0 = DisplayNameHelpers.field_a * 120 / 256;
        }
        var17 = stackIn_64_0;
        Rasterizer.drawRectangle(var17 + var12 - 1, 3 + var11, 3, -6 + var13, var16);
        return;
    }

    private final int getItemRight(byte param0, int param1) {
        if (this.field_e == 6 &&
          !VerticalScrollbar.isGuestSession(20)) {
          return param1 >= 2 ? DelegatingCanvas.field_h[this.field_e] : 310 + param1 * 180;
        }
        if (param0 != -94) {
          this.drawAchievements((byte) -114, -126);
        }
        return DelegatingCanvas.field_h[this.field_e];
    }

    private final int getItemLeft(int param0, int param1) {
        int var3 = 104 / ((param0 - 9) / 63);
        if (this.field_e == 6 &&
          !VerticalScrollbar.isGuestSession(20)) {
          return param1 < 2 ? 150 + 180 * param1 : DelegatingCanvas.field_b[this.field_e];
        }
        return DelegatingCanvas.field_b[this.field_e];
    }

    private final int getItemHeight(int param0, byte param1) {
        int var3 = 122 / ((param1 + 60) / 54);
        return 30;
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        musicTracks = null;
        if (param0 < 76) {
          field_b = -59L;
        }
        field_h = null;
    }

    final void releaseScreenAssets(int param0) {
        if (this.field_e == 6) {
          IsaacRandom.field_j = null;
        }
        if (param0 != -11308) {
          field_h = (StringBuilder) null;
        }
    }

    static {
        field_d = true;
        field_g = 0;
        field_h = new StringBuilder(80);
        field_b = 0L;
        field_a = new IntrusiveDeque();
    }
}
