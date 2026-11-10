/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementsScreen extends MenuScreen {
    static volatile int field_s;
    static Js5Archive field_p;
    static Sprite field_r;
    private int field_n;
    static int[] field_o;
    static Js5Archive field_t;
    private int field_q;
    static QuickChatCommandType field_m;

    final static void setDisplayModeController(ViewportController param0, byte param1) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          SpriteSheetDecoder.field_b = param0;
          if (SpriteSheetDecoder.field_b != null &&
            SpriteSheetDecoder.field_b.field_c) {
            stackIn_5_0 = 1;
          } else {
            stackIn_5_0 = 0;
          }
          SessionSocketHelpers.notifyBrowserResize(stackIn_5_0, 27102);
          if (param1 > -89) {
            field_s = -115;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("nl.BA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void drawScreen(byte param0) {
        int var20 = 0;
        String[] var2;
        String[] var3;
        String var4;
        String var5;
        PaletteBitmapFont var6;
        BinaryBitmapFont var7;
        int var8;
        int var9;
        int var10;
        Sprite var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var18;
        String var19;
        int var21;
        String[] var22;
        Sprite var23;
        String var24;
        String var25;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        var21 = ZombieDawn.field_J;
        super.drawScreen((byte) -71);
        JaggrabDownloader.drawPipeboxBackdrop(false);
        var22 = TrafficVehicle.field_J;
        var2 = var22;
        var3 = TriangleMesh.field_C;
        var4 = FrameSpriteHelpers.field_d;
        var5 = AccountServerResult.field_j;
        var6 = ProgressMessageDialog.field_jb;
        var7 = CacheEntry.field_q;
        if (this.field_d == 6) {
          var7.drawStringCentered(ArrivingPassenger.field_Hb, WhirlpoolHasher.field_d, LevelObstacle.field_M + 288 - 14, 16777215, 0);
        }
        var8 = SectorCacheStore.field_f;
        var9 = 288;
        for (var10 = 0; var22.length > var10; var10++) {
          if (this.isAchievementListed(var10, -30858)) {
            var9Lifetime1 = LevelObstacle.field_M + QuickChatCommandType.field_g[var10];
            var8Lifetime1 = AlternateLongAndNameCredentials.field_k[var10] + SpriteFadeHelpers.field_b;
            if (this.field_d == 6) {
              Rasterizer.fillRoundedRectangleBlended(-3 + var8Lifetime1, -3 + var9Lifetime1, 38, 38, 6, 3355443, 128);
              if (this.isAchievementEarned(var10, -7)) {
                if (this.field_q == var10) {
                  Rasterizer.fillRoundedRectangleBlended(-3 + var8Lifetime1, var9Lifetime1 - 3, 38, 38, 6, 0, 128);
                }
                if (this.field_n == var10) {
                  Rasterizer.drawRoundedRectangle(-3 + var8Lifetime1, -3 + var9Lifetime1, 38, 38, 6, 16777215);
                }
                var11 = this.getAchievementIcon(var10, true);
                if (var11 == null) {
                  var11 = MessageDialogContent.field_G;
                }
                var11.drawQuarterSize(var8Lifetime1, var9Lifetime1);
              }
            } else {
              if (this.field_q == var10) {
                Rasterizer.fillRoundedRectangleBlended(-3 + var8Lifetime1, var9Lifetime1 - 3, 38, 38, 6, 0, 128);
              }
              if (this.field_n == var10) {
                Rasterizer.drawRoundedRectangle(-3 + var8Lifetime1, -3 + var9Lifetime1, 38, 38, 6, 16777215);
              }
              var11 = this.getAchievementIcon(var10, true);
              if (var11 == null) {
                var11 = MessageDialogContent.field_G;
              }
              var11.drawQuarterSize(var8Lifetime1, var9Lifetime1);
            }
          }
        }
        var9Lifetime2 = 384;
        var7.drawStringCentered(GameLoopApplet.field_C, WhirlpoolHasher.field_d, LevelObstacle.field_M + var9Lifetime2 + 32, 16777215, 0);
        var10Lifetime1 = -1;
        if (param0 >= -35) {
          return;
        }
        if (-1 == this.field_q) {
          if (this.field_n != -1) {
            var10Lifetime1 = this.field_n;
          }
        } else {
          var10Lifetime1 = this.field_q;
        }
        if (var10Lifetime1 != -1 &&
          this.isAchievementListed(var10Lifetime1, -30858)) {
          var23 = this.getAchievementIcon(var10Lifetime1, true);
          var23.drawTransparent(110 + SpriteFadeHelpers.field_b, 140 + LevelObstacle.field_M - 32);
          var6.drawParagraph(var22[var10Lifetime1], SpriteFadeHelpers.field_b + 260, LevelObstacle.field_M + 80, 300, 85, 0, 0, 1, 2, 35);
          var12 = 280 + SpriteFadeHelpers.field_b;
          var13 = -32 + LevelObstacle.field_M + 200;
          var14 = 280;
          var15 = 100;
          var16 = var7.field_I + var7.field_x;
          if (this.isHiddenUntilEarned(var10Lifetime1, -21) &&
            !this.isAchievementEarned(var10Lifetime1, -7)) {
            var25 = ExceptionWrapper.field_f;
            var7.drawParagraph(var25, var12, var13, var14, var15, 16777215, 0, 0, 0, var16);
          } else {
            var24 = var3[var10Lifetime1];
            var18 = var16 * var7.drawParagraph(var24, var12, var13, var14, var15, 16777215, 0, 0, 0, var16);
            var13 = var13 + (6 + (var18 + var16));
            var19 = var5 + 100 * VisualPropertyOverrides.field_N[var10Lifetime1];
            var7.drawString(var19, var12, var13, 16777215, 0);
            var12 = var12 + (var7.textWidth(var19) + 12);
            var7.drawString(var4, var12, var13, 16777215, 0);
            var12 = var12 + var7.textWidth(var4);
            for (var20 = 0; var20 < VisualPropertyOverrides.field_N[var10Lifetime1]; var20++) {
              HotspotTextWidget.field_E.drawTransparent(var20 * (HotspotTextWidget.field_E.field_r >> 1) + var12, var13 - HotspotTextWidget.field_E.field_q + 2);
            }
          }
        }
    }

    final static void initializeLogoSequence(int param0, PcmMixer param1, byte param2, Js5Archive param3) {
        try {
          SpatialGrid.field_b = LoginPayloadKind.getFramesPerSecond((byte) 122) * param0 / 1000;
          MusicCrossfadeStream.loadLogoSound((byte) 124, param3);
          ErrorReportHelpers.loadLogoModels(param3, (byte) -128);
          RegionPowerupEffect.loadFinalFrameImage(param3, true);
          SpecularTableHelpers.buildSpecularTable(255);
          ConnectionCleanupHelpers.renderLogoGlow((byte) -101);
          int var4_int = -67 / ((param2 - 2) / 56);
          LevelNavigation.field_x = 0 - SpatialGrid.field_b;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "nl.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_p = null;
        field_o = null;
        field_m = null;
        field_r = null;
        field_t = null;
        if (param0 <= 64) {
          AchievementsScreen.releaseStatics((byte) -77);
        }
    }

    private final Sprite getAchievementIcon(int param0, boolean param1) {
        if (this.isAchievementEarned(param0, -7)) {
          return MenuLayoutHelpers.field_a[param0];
        }
        if (OctaveNoiseMap.field_j <= 0 &&
          MouseWheelInput.field_a[param0]) {
          return MultiHandleSliderWidget.field_E;
        }
        if (!param1) {
          field_p = (Js5Archive) null;
        }
        return MessageDialogContent.field_G;
    }

    final int getItemLeft(int param0, int param1) {
        if (this.field_d == param1) {
          return (param0 == 0 ? 100 : 350) + SpriteFadeHelpers.field_b;
        }
        if (!MeleeHuman.isGuestSession(13296)) {
          return WhirlpoolHasher.field_d - (this.field_i >> 1);
        }
        return (param0 != 0 ? 470 : 50) + SpriteFadeHelpers.field_b;
    }

    final void handleInput(byte param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var5Lifetime1;
        var6 = ZombieDawn.field_J;
        super.handleInput((byte) 85, param1);
        this.field_n = -1;
        var3 = -SpriteFadeHelpers.field_b + KeyStateHelpers.field_b;
        var4 = -LevelObstacle.field_M + FadingModalPanel.field_K;
        var5 = 0;
        scanLoop1: while (true) {
          if (AlternateLongAndNameCredentials.field_k.length > var5) {
            if (var3 >= AlternateLongAndNameCredentials.field_k[var5] &&
              40 + AlternateLongAndNameCredentials.field_k[var5] > var3 &&
              var4 >= QuickChatCommandType.field_g[var5] &&
              var4 < 40 + QuickChatCommandType.field_g[var5]) {
              this.field_n = var5;
              if (this.field_d != 6) {
                break scanLoop1;
              }
              if (0 > this.field_n) {
                break scanLoop1;
              }
              if (this.isAchievementEarned(this.field_n, -7)) {
                break scanLoop1;
              }
              this.field_n = -1;
              break scanLoop1;
            }
            var5++;
            continue;
          }
          break;
        }
        if (GzipDecompressor.field_d != 0) {
          if (this.field_q != this.field_n) {
            if (this.field_n != -1) {
              this.field_q = this.field_n;
            }
          } else {
            this.field_q = -1;
          }
          var5Lifetime1 = 45 % ((param0 + 39) / 61);
        } else {
          var5Lifetime1 = 45 % ((param0 + 39) / 61);
        }
        return;
    }

    final void resetSelection(byte param0, int param1, boolean param2) {
        int var12 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int var10;
        int var11;
        int var13;
        var13 = ZombieDawn.field_J;
        super.resetSelection((byte) 73, param1, param2);
        this.field_q = -1;
        this.field_n = -1;
        if (param0 < 65) {
          this.field_q = 92;
        }
        var4 = 32;
        for (var5 = 0; ValidationMessageWidget.field_P.length > var5; var5++) {
          if (!this.isAchievementListed(var5, -30858)) {
            var4--;
          }
        }
        SectorCacheStore.field_f = 120;
        var5 = 0;
        do {
          var5++;
          var6 = (int)Math.ceil((double)((float)var4 / (float)var5));
        } while (var6 > 14);
        SectorCacheStore.field_f = 320 - (-40 + 40 * var6) / 2;
        var7 = SectorCacheStore.field_f;
        var8 = 288;
        var8 = var8 + (120 - 40 * var5) / 2;
        var9 = new int[]{var6, var6, var6, 0};
        if (var4 % var5 != 1) {
          if (var4 % var5 != 2) {
            SectorCacheStore.field_f = SectorCacheStore.field_f - 20;
            var7 = SectorCacheStore.field_f;
          } else {
            var9[1] = var9[1] - 1;
            var7 -= 20;
          }
        } else {
          var9[0] = var9[0] - 1;
          var9[2] = var9[2] - 1;
        }
        var10 = 0;
        var11 = 0;
        for (var12 = 0; var12 < 32; var12++) {
          if (this.isAchievementListed(var12, -30858)) {
            AlternateLongAndNameCredentials.field_k[var12] = var7;
            QuickChatCommandType.field_g[var12] = var8;
            var7 += 40;
            var10++;
            if (var10 == var9[var11]) {
              var8 += 40;
              var7 = SectorCacheStore.field_f;
              var10 = 0;
              var11++;
              if (var9[-1 + var11] < var9[var11]) {
                var7 -= 20;
              }
            }
          }
        }
        return;
    }

    private final boolean isAchievementEarned(int param0, int param1) {
        int[] var4 = param1 != ~this.field_d ? Js5Archive.field_i : PasswordValidator.field_g;
        int[] var3 = var4;
        return NameCharacterHelpers.isBitSet(param0, var4, -112);
    }

    AchievementsScreen(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        this.field_n = -1;
        this.field_q = -1;
    }

    private final boolean isAchievementListed(int param0, int param1) {
        boolean stackIn_10_0 = false;
        if (param1 != -30858) {
          return false;
        }
        boolean decompiledFrameRemainder0 = true;
        if (!this.isAchievementEarned(param0, -7) && (!ValidationMessageWidget.field_P[param0] ||
          MouseWheelInput.field_a[param0] &&
          !(OctaveNoiseMap.field_j > 0) &&
          !(SavedDataRequest.field_j >= 2))) {
          stackIn_10_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_10_0 = true;
        }
        return stackIn_10_0;
    }

    final int getItemRight(boolean param0, int param1) {
        if (!param0) {
          byte[] var4 = (byte[]) null;
          AchievementsScreen.computeWhirlpoolDigest(-87, -56, -85, (byte[]) null);
        }
        if (!MeleeHuman.isGuestSession(13296) ||
          this.field_d == 6) {
          return this.getItemLeft(param1, 6) + this.field_i;
        }
        if (0 == param1) {
          return this.getItemLeft(param1, 6) + 350;
        }
        return 100 + this.getItemLeft(param1, 6);
    }

    private final boolean isHiddenUntilEarned(int param0, int param1) {
        boolean stackIn_9_0 = false;
        if (param1 != -21) {
          return true;
        }
        stackIn_9_0 = (param0 == 29) || (param0 == 30) || (param0 == 31) || (param0 == 20);
        return stackIn_9_0;
    }

    final static void clearBucketCounts(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ZombieDawn.field_J;
        try {
          if (param0 != -30006) {
            return;
          }
          var5 = OffsetHelpers.field_b;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var1_ref), "nl.HA(" + param0 + ')');
        }
    }

    final static byte[] computeWhirlpoolDigest(int param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        WhirlpoolHasher var5 = null;
        byte[] var6 = null;
        var7 = ZombieDawn.field_J;
        try {
          if (param2 > -115) {
            AchievementsScreen.clearBucketCounts(91);
          }
          if (param0 > 0) {
            var8 = new byte[param1];
            var4 = var8;
            for (var5_int = 0; var5_int < param1; var5_int++) {
              var8[var5_int] = param3[var5_int + param0];
            }
          } else {
            var4 = param3;
          }
          var5 = new WhirlpoolHasher();
          var5.reset(71);
          var5.updateBits(true, var4, (long)(8 * param1));
          var6 = new byte[64];
          var5.finishDigest(var6, 0, -128);
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("nl.LA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_s = 0;
        field_m = new QuickChatCommandType(9, 0, 4, 1);
    }
}
