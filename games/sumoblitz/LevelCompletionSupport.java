/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelCompletionSupport {
    static ToolkitSprite[] field_b;
    static String field_a;

    final static void completeLevel(int guard) {
        TextureMetadata.field_f[OpenGlShaderProgram.levelIndex] = true;
        Js5ClientState.field_a = TextureFormat.elapsedTicks;
        if (RenderPresentationException.a(false)) {
          NineSlicePanel.field_d[OpenGlShaderProgram.levelIndex] = true;
        }
        if (GridWidgetContainer.livesRemaining == 3) {
          up.field_g[OpenGlShaderProgram.levelIndex] = true;
        }
        HiscoreRequest.openPauseMenu((byte) -104);
        OpenGlIndexBuffer.g(123);
        if (!SoundCache.isLevelIndexTwentyFour(-77)) {
          StrongCacheReference.switchMenuScreen(-7753, true, 10);
        }
        if (!(OpenGlShaderProgram.levelIndex <= ToolkitRasterStateFrame.field_e)) {
          ToolkitRasterStateFrame.field_e = OpenGlShaderProgram.levelIndex;
        }
        int var1 = TextureFormat.elapsedTicks;
        if (!(var1 >= CacheIoRequest.field_z[OpenGlShaderProgram.levelIndex])) {
          CacheIoRequest.field_z[OpenGlShaderProgram.levelIndex] = var1;
        }
        if (OpenGlTexture3D.field_j[OpenGlShaderProgram.levelIndex] < FadingWidget.score) {
          OpenGlTexture3D.field_j[OpenGlShaderProgram.levelIndex] = FadingWidget.score;
        }
        if (guard != 0) {
          field_a = (String) null;
        }
        if (OpenGlShaderProgram.levelIndex == 12 &&
          !ValidationMessageWidget.field_P) {
          UnderageAccountInfoPanel.b(24753, 245, 10);
        }
        MatchingTextValidator.field_i = MatchingTextValidator.field_i + 1;
        BlendMode.lastLevelScore = FadingWidget.score;
    }

    public static void releaseStatics(int guard) {
        if (guard != 6) {
          LevelCompletionSupport.initializeHslColorTable((byte) 64);
        }
        field_b = null;
        field_a = null;
    }

    final static void initializeHslColorTable(byte guard) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        double var1_double = 0.0;
        RuntimeException var1 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16_double = 0.0;
        int var16 = 0;
        int var17 = 0;
        double var18_double = 0.0;
        int var18 = 0;
        int var19 = 0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        int var26 = 0;
        var26 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (null != ReassignUpgradesScreen.hslToRgb) {
            return;
          }
          ReassignUpgradesScreen.hslToRgb = new int[65536];
          var1_double = Math.random() * 0.03 - 0.015 + 0.7;
          for (var3 = 0; var3 < 65536; var3++) {
            var4 = (double)(var3 >> 10 & 63) / 64.0 + 0.0078125;
            var6 = (double)(7 & var3 >> 7) / 8.0 + 0.0625;
            var8 = (double)(127 & var3) / 128.0;
            var10 = var8;
            var12 = var8;
            var14 = var8;
            if (0.0 != var6) {
              if (!(var8 < 0.5)) {
                var16_double = -(var6 * var8) + (var8 + var6);
              } else {
                var16_double = (1.0 + var6) * var8;
              }
              var18_double = var8 * 2.0 - var16_double;
              var20 = 0.3333333333333333 + var4;
              if (1.0 < var20) {
                var20 = var20 - 1.0;
              }
              var22 = var4;
              var24 = -0.3333333333333333 + var4;
              if (!(var22 * 6.0 < 1.0)) {
                if (var22 * 2.0 < 1.0) {
                  var12 = var16_double;
                } else {
                  if (2.0 > 3.0 * var22) {
                    var12 = var18_double + (-var18_double + var16_double) * (0.6666666666666666 - var22) * 6.0;
                  } else {
                    var12 = var18_double;
                  }
                }
              } else {
                var12 = var22 * (6.0 * (-var18_double + var16_double)) + var18_double;
              }
              if (var20 * 6.0 < 1.0) {
                var10 = var18_double + var20 * ((-var18_double + var16_double) * 6.0);
              } else {
                if (1.0 > 2.0 * var20) {
                  var10 = var16_double;
                } else {
                  if (var20 * 3.0 < 2.0) {
                    var10 = var18_double + (0.6666666666666666 - var20) * (var16_double - var18_double) * 6.0;
                  } else {
                    var10 = var18_double;
                  }
                }
              }
              if (0.0 > var24) {
                var24 = var24 + 1.0;
              }
              if (6.0 * var24 < 1.0) {
                var14 = var18_double + var24 * ((var16_double - var18_double) * 6.0);
              } else {
                if (!(var24 * 2.0 < 1.0)) {
                  if (!(2.0 > 3.0 * var24)) {
                    var14 = var18_double;
                  } else {
                    var14 = var18_double + (0.6666666666666666 - var24) * (-var18_double + var16_double) * 6.0;
                  }
                } else {
                  var14 = var16_double;
                }
              }
            }
            var10 = Math.pow(var10, var1_double);
            var12 = Math.pow(var12, var1_double);
            var14 = Math.pow(var14, var1_double);
            var16 = (int)(var10 * 256.0);
            var17 = (int)(256.0 * var12);
            var18 = (int)(var14 * 256.0);
            var19 = (var16 << 16) - (-(var17 << 8) - var18);
            ReassignUpgradesScreen.hslToRgb[var3] = var19;
          }
          if (guard != -56) {
            field_b = (ToolkitSprite[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "o.B(" + guard + ')');
        }
    }

    static {
        field_a = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
