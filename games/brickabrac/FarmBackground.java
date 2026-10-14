/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FarmBackground extends BackgroundScene {
    static ResourceArchive field_r;
    static boolean field_u;
    static UiComponent field_x;
    static UiComponent field_v;
    static String field_y;
    static String field_s;
    static int field_w;
    static String field_t;

    final void drawSplitBackground(int destinationY, byte obfuscationGuard, int destinationX, int colorIndex, int scroll16) {
        RasterCacheSurface var6 = null;
        if (obfuscationGuard >= -84) {
          field_v = (UiComponent) null;
        }
        if (this.hasSprites((byte) -122)) {
          var6 = kd.a(this.sceneId, colorIndex, (byte) -36);
          if (!var6.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            RegistrationResponseDialog.a(colorIndex, var6, 2, MainMenuScreen.field_w, -13, false);
            var6.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          }
          MultiValueSliderRenderer.a(-899814320, 306, destinationX, ActivityIndicatorWidget.field_D, var6.sprite, destinationY, 2, WidgetTextLayout.field_b, scroll16, -13);
        } else {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 306, 480, rm.farmBackgroundColors[colorIndex], 22953);
        }
    }

    final void drawFullBackground(boolean obfuscationGuard, int scroll16, int destinationY, int colorIndex, int destinationX) {
        RasterCacheSurface var7 = null;
        if (this.hasSprites((byte) -106)) {
          var7 = PowerUp.a(this.sceneId, colorIndex, -20777);
          if (!var7.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            RegistrationResponseDialog.a(colorIndex, var7, 1, MouseInput.farmFarSprite, 0, !obfuscationGuard ? true : false);
            var7.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          }
          MultiValueSliderRenderer.a(-899814320, 640, destinationX, LevelPackCard.farmNearSprite, var7.sprite, destinationY, 1, rm.farmMidSprite, scroll16, 0);
        } else {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 640, 480, rm.farmBackgroundColors[colorIndex], 22953);
        }
        if (!obfuscationGuard) {
          this.drawPreview((byte) -27, 96, -30, 88);
        }
    }

    final static RgbSprite a(RgbSprite param0, boolean param1, int param2) {
        int var4 = 0;
        RgbSprite var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        RgbSprite stackIn_3_0 = null;
        RgbSprite stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1) {
            stackIn_3_0 = (RgbSprite) null;
            return stackIn_3_0;
          }
          var3 = new RgbSprite(param0.canvasWidth * param2, param0.canvasHeight);
          var3.bindRasterTarget();
          for (var4 = 0; param2 > var4; var4++) {
            param0.drawTransparent(param0.canvasWidth * var4, 0);
          }
          BallPulseEffect.framebuffer.bindRaster((byte) 116);
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("qb.P(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    FarmBackground(int sceneId, String musicName, String soundEffectPrefix, int soundEffectCount) {
        super(sceneId, musicName, soundEffectPrefix, soundEffectCount);
    }

    final boolean hasSprites(byte obfuscationGuard) {
        boolean stackIn_8_0 = false;
        if (obfuscationGuard > -91) {
          field_u = true;
        }
        stackIn_8_0 = (null != LevelPackCard.farmNearSprite) && (rm.farmMidSprite != null) && (MouseInput.farmFarSprite != null) && (null != MultiplayerExitScreen.farmSmallSprite);
        return stackIn_8_0;
    }

    final boolean loadSprites(boolean obfuscationGuard) {
        if (!AchievementIcon.field_m.ensureGroupAvailableByName("farm", -28138)) {
          return false;
        }
        LevelPackCard.farmNearSprite = pl.loadRgbSpriteByName("farm", "farm_near", (byte) 103, AchievementIcon.field_m);
        rm.farmMidSprite = pl.loadRgbSpriteByName("farm", "farm_mid", (byte) -63, AchievementIcon.field_m);
        MouseInput.farmFarSprite = pl.loadRgbSpriteByName("farm", "farm_far", (byte) -78, AchievementIcon.field_m);
        MultiplayerExitScreen.farmSmallSprite = pl.loadRgbSpriteByName("farm", "farm_small", (byte) 106, AchievementIcon.field_m);
        if (obfuscationGuard) {
          FarmBackground.g(-29);
        }
        ActivityIndicatorWidget.field_D = jh.a(0, LevelPackCard.farmNearSprite);
        WidgetTextLayout.field_b = jh.a(0, rm.farmMidSprite);
        MainMenuScreen.field_w = jh.a(0, MouseInput.farmFarSprite);
        return true;
    }

    final void drawPreview(byte obfuscationGuard, int colorIndex, int destinationX, int destinationY) {
        if (colorIndex > -1) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, rm.farmBackgroundColors[colorIndex], 22953);
        } else {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, 7829367, 22953);
        }
        if (this.hasSprites((byte) -109)) {
          MultiplayerExitScreen.farmSmallSprite.drawTransparent(destinationX, destinationY);
        }
        int var5 = -18 / ((-28 - obfuscationGuard) / 43);
    }

    final static String[] a(byte param0, String param1, char param2) {
        int var8 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        CharSequence var11 = null;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          var11 = (CharSequence) ((Object) param1);
          var3_int = pp.a((byte) 120, param2, var11);
          var4 = new String[1 + var3_int];
          var5 = 0;
          var6 = -40 % ((param0 - 61) / 61);
          var7 = 0;
          for (var8 = 0; var8 < var3_int; var8++) {
            for (var9 = var7; param2 != param1.charAt(var9); var9++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param1.substring(var7, var9);
            var7 = var9 + 1;
          }
          var4[var3_int] = param1.substring(var7);
          stackIn_8_0 = var4;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("qb.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(String[] args, int param1, int param2, TextFont param3, String param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          var5_int = param3.measureText(param4);
          if (param1 >= var5_int &&
            param4.indexOf("<br>") == -1) {
            args[0] = param4;
            stackIn_4_0 = 1;
            return stackIn_4_0;
          }
          var6 = (var5_int - (-param1 + 1)) / param1;
          param1 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param4.length();
          for (var9 = 0; var9 < var8; var9++) {
            var10 = param4.charAt(var9);
            if (var10 == 32 ||
              var10 == 45) {
              var11 = param4.substring(var7, var9 + 1).trim();
              var12 = param3.measureText(var11);
              if (param1 <= var12) {
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                args[incrementValue$1] = var11;
                var7 = 1 + var9;
              }
            }
            if (var10 == 62 &&
              param4.regionMatches(var9 - 3, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              args[incrementValue$2] = param4.substring(var7, var9 - 3).trim();
              var7 = var9 + 1;
            }
          }
          if (var8 > var7) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            args[incrementValue$0] = param4.substring(var7, var8).trim();
          }
          if (param2 != -63) {
            field_s = (String) null;
          }
          stackIn_28_0 = var6Lifetime1;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("qb.A(");
          if (args == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param4 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_t = null;
        field_v = null;
        field_y = null;
        if (param0 != 0) {
          String var2 = (String) null;
          FarmBackground.addExceptionContext((Throwable) null, (String) null);
        }
        field_x = null;
        field_r = null;
        field_s = null;
    }

    final static ClientException addExceptionContext(Throwable cause, String context) {
        ClientException var2 = null;
        if (!(cause instanceof ClientException)) {
          var2 = new ClientException(cause, context);
        } else {
          var2 = (ClientException) ((Object) cause);
          var2.context = var2.context + ' ' + context;
        }
        return var2;
    }

    final static void g(int param0) {
        if (10 == AchievementIcon.field_j ||
          !ReportAbuseDialog.i(0)) {
          DialogMessagePanel.h(6846);
          AchievementIcon.field_j = 11;
        }
        if (param0 < 105) {
          FarmBackground.f(-80);
        }
        LevelCompleteScreen.field_C = true;
    }

    static {
        field_y = "Please enter your age in years";
        field_s = "Who can join";
        field_t = "Connection restored.";
    }
}
