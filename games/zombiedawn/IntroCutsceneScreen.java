/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntroCutsceneScreen extends MenuScreen {
    private int field_m;
    private boolean field_n;
    static QuickChatCommandType field_p;
    static String[] field_o;

    final void drawScreen(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        int var4Lifetime1Lifetime1;
        int var5Lifetime1Lifetime1;
        var6 = ZombieDawn.field_J;
        var2 = SpriteFadeHelpers.field_b;
        if (param0 >= -35) {
          this.drawScreen((byte) -96);
        }
        var3 = LevelObstacle.field_M;
        Rasterizer.clear();
        if (this.field_n) {
          this.drawIntroCaptions(-105);
          return;
        }
        Rasterizer.intersectClip(-32 + SpriteFadeHelpers.field_b, 0, 672 + SpriteFadeHelpers.field_b, DropdownList.field_P);
        if (260 <= this.field_m) {
          if (this.field_m >= 388) {
            if (this.field_m < 508) {
              PendingHighscoreRequest.field_j.drawWithOffsets(var2, var3);
              ArmySoldier.field_Ub.drawTransparent(var2, 480 + (var3 - ArmySoldier.field_Ub.field_q));
            } else {
              if (this.field_m >= 1564) {
                if (this.field_m < 1724) {
                  PendingHighscoreRequest.field_j.drawWithOffsets(-264 + var2, var3);
                  MainMenuScreen.field_t.drawTransparent(var2 + 270, 200 + var3);
                } else {
                  if (this.field_m >= 1852) {
                    if (this.field_m >= 2152) {
                    }
                  } else {
                    PendingHighscoreRequest.field_j.drawTransparent(-264 + var2, var3);
                    MainMenuScreen.field_t.drawTransparent(var2 + 270, 200 + var3);
                    Rasterizer.fillRectangleBlended(0, var3, WhirlpoolHasher.field_e, 550, 0, 2 * this.field_m - 3448);
                  }
                }
              } else {
                var4 = -508 + this.field_m;
                PendingHighscoreRequest.field_j.drawWithOffsets(-(var4 >> 2) + var2, var3);
                var5 = var4 * 3 >> 2;
                ArmySoldier.field_Ub.drawTransparent(-var5 + var2, var3 + 480 - ArmySoldier.field_Ub.field_q);
                MainMenuScreen.field_t.drawTransparent(1062 + (var2 - var5), 200 + var3);
              }
            }
          } else {
            PendingHighscoreRequest.field_j.drawTransparent(var2, var3);
            ArmySoldier.field_Ub.drawTransparent(var2, -ArmySoldier.field_Ub.field_q + (480 + var3));
            Rasterizer.fillRectangleBlended(0, var3, WhirlpoolHasher.field_e, 550, 0, -(2 * (-260 + this.field_m)) + 256);
          }
        }
        this.drawIntroCaptions(-119);
        Rasterizer.intersectClip(-32 + SpriteFadeHelpers.field_b, 0, SpriteFadeHelpers.field_b + 672, DropdownList.field_P);
        if (this.field_m > 120 &&
          this.field_m < 388) {
          CacheEntry.field_q.drawStringCentered(ScrollViewport.field_L, WhirlpoolHasher.field_d, Math.min(510 + LevelObstacle.field_M, DropdownList.field_P - 20), 16777215, 0);
        }
        if (640 < WhirlpoolHasher.field_e) {
          var4Lifetime1 = 8;
          Rasterizer.drawVerticalLineAlpha(-1 + SpriteFadeHelpers.field_b, LevelObstacle.field_M, 550, 0, 4);
          for (var5Lifetime1 = SpriteFadeHelpers.field_b - 2; 0 < var5Lifetime1; var5Lifetime1--) {
            if (256 > var4Lifetime1) {
              Rasterizer.drawVerticalLineAlpha(var5Lifetime1, LevelObstacle.field_M, 550, 0, var4Lifetime1);
              var4Lifetime1 += 8;
              continue;
            }
            break;
          }
          var4Lifetime1Lifetime1 = 8;
          Rasterizer.drawVerticalLineAlpha(640 + SpriteFadeHelpers.field_b, LevelObstacle.field_M, 550, 0, 4);
          for (var5Lifetime1Lifetime1 = 640 + SpriteFadeHelpers.field_b + 1; var5Lifetime1Lifetime1 < WhirlpoolHasher.field_e; var5Lifetime1Lifetime1++) {
            if (256 <= var4Lifetime1Lifetime1) {
              break;
            }
            Rasterizer.drawVerticalLineAlpha(var5Lifetime1Lifetime1, LevelObstacle.field_M, 550, 0, var4Lifetime1Lifetime1);
            var4Lifetime1Lifetime1 += 8;
          }
        }
    }

    private final void drawIntroCaptions(int param0) {
        int stackIn_21_0 = 0;
        int var2;
        int var3;
        int var4;
        Object var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var8Lifetime1;
        int var9Lifetime1;
        var10 = ZombieDawn.field_J;
        var3 = 26 / ((-41 - param0) / 63);
        var2 = SpriteFadeHelpers.field_b;
        var4 = LevelObstacle.field_M;
        var5 = null;
        var6 = 0;
        for (var8 = 0; var8 < HighscoreRequest.field_q.length; var8++) {
          var9 = -HighscoreRequest.field_q[var8] + this.field_m;
          if (0 < var9 &&
            var9 < 50 + BulletCasing.field_g[var8] + 10) {
            var6 = 256;
            if (var9 < 10) {
              var6 = (var9 << 8) / 10;
            }
            var5 = WidgetStyleLayer.field_o[var8];
            if (var9 > 10 + BulletCasing.field_g[var8]) {
              var6 = -((-BulletCasing.field_g[var8] - 10 + var9 << 8) / 50) + 256;
            }
          }
        }
        var7 = 50 + var4;
        if (var5 != null) {
          var8Lifetime1 = -5 + (ProgressMessageDialog.field_jb.field_I + ProgressMessageDialog.field_jb.field_x);
          stackIn_21_0 = (var5 != WidgetStyleLayer.field_o[6]) ? 0 : 1;
          var9Lifetime1 = stackIn_21_0;
          if (var9Lifetime1 != 0 ||
            var5 == WidgetStyleLayer.field_o[5]) {
            var7 = 180 + var4;
          }
          if (var9Lifetime1 != 0) {
            ProgressMessageDialog.field_jb.drawParagraph(WidgetStyleLayer.field_o[5], 60 + var2, var7, 520, 200, 0, 0, 1, 0, var8Lifetime1);
          }
          if (null == TextHotspotRegion.field_n ||
            TextHotspotRegion.field_n != var5) {
            this.renderGlowingCaption(var8Lifetime1, var7 - var4, 5, (String) (var5));
          }
          if (256 > var6) {
            ProgressMessageDialog.field_jb.drawParagraphAlpha((String) (var5), var2 + 60, var7, 520, 200, 0, 0, var6, 1, 0, var8Lifetime1);
            if (var9Lifetime1 == 0) {
              SpriteEffectHelpers.drawTransparent(MusicPatchNode.field_h, var2, var4, var6);
            }
          } else {
            ProgressMessageDialog.field_jb.drawParagraph((String) (var5), var2 + 60, var7, 520, 200, 0, 0, 1, 0, var8Lifetime1);
            if (var9Lifetime1 == 0) {
              SpriteEffectHelpers.drawTransparent(MusicPatchNode.field_h, var2, var4);
            }
          }
        }
        TextHotspotRegion.field_n = (String) (var5);
    }

    final static void shutdownAudioOutputs(int param0) {
        if (null != ExceptionWrapper.field_d) {
          ExceptionWrapper.field_d.shutdown();
        }
        if (LoginDialog.field_fb != null) {
          LoginDialog.field_fb.shutdown();
        }
        if (param0 != -16861) {
          IntroCutsceneScreen.highlightArea(-83, 78);
        }
    }

    final boolean handleKeyPress(int param0, int param1, char param2) {
        if (param1 != 65793) {
          IntroCutsceneScreen.shutdownAudioOutputs(95);
        }
        if (this.field_m <= 100) {
          return true;
        }
        this.finishIntro((byte) -117);
        return true;
    }

    final void handleInput(byte param0, boolean param1) {
        int stackIn_3_0 = 0;
        int var3;
        int var4;
        int var5;
        this.field_m = this.field_m + 1;
        HighscoreRequest.field_q = new int[]{90, 490, 830, 1170, 1510, 1970, 2020};
        BulletCasing.field_g = new int[]{280, 180, 180, 180, 180, 180, 180};
        stackIn_3_0 = (1 != GzipDecompressor.field_d) ? 0 : 1;
        var3 = stackIn_3_0;
        if (this.field_m >= 2152) {
          var3 = 1;
        }
        if (var3 != 0 &&
          100 < this.field_m) {
          this.finishIntro((byte) 113);
        }
        if (this.field_m == HighscoreRequest.field_q[0]) {
          SpriteSheetArchiveHelpers.playMusicTrackDefault((byte) 103, ArchiveProvider.field_a[9]);
        }
        var4 = -71 / ((param0 + 39) / 61);
        if (this.field_m > 1896 &&
          2152 > this.field_m) {
          var5 = -this.field_m + 2152;
          if (var5 < 0) {
            var5 = 0;
          }
          ZombieDawn.setMusicVolume(119, InputValidationResult.field_a * var5 >> 8);
        }
    }

    final void onReplacedByScreen(MenuScreen param0, int param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_n = true;
          if (param1 <= 70) {
            this.drawIntroCaptions(-27);
            BlastParticle.field_d.unloadResourceGroup(100, 10);
          } else {
            BlastParticle.field_d.unloadResourceGroup(100, 10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kl.W(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean startAccountCreation(String param0, int param1, AccountCreationForm param2, String param3, int param4, String param5, boolean param6) {
        RuntimeException var7 = null;
        AccountCreationDialog var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ValidatedTextWidget.field_S != AccountCreationForm.field_F) {
            return false;
          }
          if (param1 != 640) {
            IntroCutsceneScreen.highlightArea(-27, 118);
          }
          var8 = new AccountCreationDialog(MessageDialogContent.field_S, param2);
          MessageDialogContent.field_S.addDialog(var8, true);
          if (LoginMethod.appletHasTuhstatbutCookie((byte) 12)) {
            var8.showTimeoutResult(false);
            return true;
          }
          IntroSpeedHelpers.field_d = param5;
          ErrorReportHelpers.field_a = param4;
          AchievementBanner.field_i = param0;
          PendingFlagRequest.field_l = param6;
          RankingRowHelpers.field_f = null;
          ArmySoldier.field_Rb = param3;
          AccountCreationForm.field_F = SpriteFadeHelpers.field_c;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_15_0 = var7;
          stackIn_15_1 = new StringBuilder().append("kl.AA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param6).append(')').toString());
        }
    }

    IntroCutsceneScreen(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        this.field_m = 0;
        try {
          this.field_n = false;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "kl.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    private final void finishIntro(byte param0) {
        int var2 = 118 % ((61 - param0) / 52);
        ZombieDawn.setMusicVolume(117, InputValidationResult.field_a);
        SpriteSheetArchiveHelpers.playMusicTrackDefault((byte) 47, ArchiveProvider.field_a[1]);
        UiResourceHelpers.switchScreenMusic(true, true, 0);
    }

    private final void renderGlowingCaption(int param0, int param1, int param2, String param3) {
        try {
          MusicPatchNode.field_h.setAsRenderTarget();
          Rasterizer.clear();
          ProgressMessageDialog.field_jb.drawParagraph(param3, 60, param1, 520, 200, 4, 0, 1, 0, param0);
          SpriteEffectHelpers.drawRasterOutline(16777215);
          SpriteEffectHelpers.drawRasterOutline(16777215);
          SpriteEffectHelpers.drawRasterOutline(16777215);
          SpriteEffectHelpers.drawRasterOutline(16777215);
          Rasterizer.blurRectangle(5, 5, 0, 0, 640, 480);
          ProgressMessageDialog.field_jb.drawParagraph(param3, 60, param1, 520, 200, param2, 0, 1, 0, param0);
          DisplayState.field_f.makeRasterTarget(param2 + 11);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "kl.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void highlightArea(int param0, int param1) {
        int var5 = 0;
        int var6 = ZombieDawn.field_J;
        if (OctaveNoiseMap.field_j <= 0 &&
          param0 > 0) {
          return;
        }
        LongAndTextLoginPayload.field_i = param0;
        ContentTransitionDialog.setRasterTarget((byte) -119, PowerupCard.field_b);
        Rasterizer.clear();
        Sprite var2 = GlowAreaSupport.field_d;
        int var3 = 0;
        int var4 = 0;
        var2.drawTransparent(var3 + 10, var4 + 10);
        for (var5 = 0; var5 < 3; var5++) {
          SpriteEffectHelpers.drawRasterOutline(16777045);
        }
        var2.drawTransparentWithOpacity(10 + var3, 10 + var4, 0);
        if (param1 != 16777045) {
          return;
        }
        try {
          Rasterizer.blurRectangle(2, 2, 0, 0, 195, 170);
          SingleChildWidget.popRasterState(-21189);
          PopupMenuBuilder.field_b = 3 * DiskArchiveRequest.field_z.length >> 2;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "kl.T(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -112) {
          field_p = (QuickChatCommandType) null;
        }
        field_o = null;
        field_p = null;
    }

    final void startIntro(int param0) {
        this.field_n = false;
        if (param0 >= -123) {
          return;
        }
        BlastParticle.field_d.queueResourceGroup(false, 10);
        this.field_m = 0;
        ByteArrayPool.stopMusic(65);
        InputValidationResult.field_a = VisualPropertyNode.field_u;
    }

    static {
        field_p = new QuickChatCommandType(0, 2, 2, 1);
        field_o = new String[]{"4 new stages full of zombifying action", "Fight new enemies trying to chase you out of their land", "Trick humans into opening your path and use new powerups", "Take over the Palace and seize the throne!"};
    }
}
