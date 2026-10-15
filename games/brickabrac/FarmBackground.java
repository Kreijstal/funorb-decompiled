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
    static int fireworkSpawnWidth;
    static String field_t;

    final void drawSplitBackground(int destinationY, byte obfuscationGuard, int destinationX, int colorIndex, int scroll16) {
        RasterCacheSurface var6 = null;
        if (obfuscationGuard >= -84) {
          field_v = (UiComponent) null;
        }
        if (this.hasSprites((byte) -122)) {
          var6 = kd.selectBackgroundSurface1280(this.sceneId, colorIndex, (byte) -36);
          if (!var6.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            RegistrationResponseDialog.a(colorIndex, var6, 2, MainMenuScreen.field_w, -13, false);
            var6.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          }
          MultiValueSliderRenderer.a(-899814320, 306, destinationX, ActivityIndicatorWidget.field_D, var6.sprite, destinationY, 2, WidgetTextLayout.field_b, scroll16, -13);
        } else {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 306, 480, FontRequestHelpers.farmBackgroundColors[colorIndex], 22953);
        }
    }

    final void drawFullBackground(boolean obfuscationGuard, int scroll16, int destinationY, int colorIndex, int destinationX) {
        RasterCacheSurface var7 = null;
        if (this.hasSprites((byte) -106)) {
          var7 = PowerUp.selectBackgroundSurface960(this.sceneId, colorIndex, -20777);
          if (!var7.matchesCacheKeys((byte) -84, colorIndex, this.sceneId)) {
            RegistrationResponseDialog.a(colorIndex, var7, 1, MouseInput.farmFarSprite, 0, !obfuscationGuard ? true : false);
            var7.setCacheKeys(this.sceneId, colorIndex, (byte) 78);
          }
          MultiValueSliderRenderer.a(-899814320, 640, destinationX, LevelPackCard.farmNearSprite, var7.sprite, destinationY, 1, FontRequestHelpers.farmMidSprite, scroll16, 0);
        } else {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 640, 480, FontRequestHelpers.farmBackgroundColors[colorIndex], 22953);
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
        stackIn_8_0 = (null != LevelPackCard.farmNearSprite) && (FontRequestHelpers.farmMidSprite != null) && (MouseInput.farmFarSprite != null) && (null != MultiplayerExitScreen.farmSmallSprite);
        return stackIn_8_0;
    }

    final boolean loadSprites(boolean obfuscationGuard) {
        if (!AchievementIcon.backgroundSpriteArchive.ensureGroupAvailableByName("farm", -28138)) {
          return false;
        }
        LevelPackCard.farmNearSprite = SpriteInputHelpers.loadRgbSpriteByName("farm", "farm_near", (byte) 103, AchievementIcon.backgroundSpriteArchive);
        FontRequestHelpers.farmMidSprite = SpriteInputHelpers.loadRgbSpriteByName("farm", "farm_mid", (byte) -63, AchievementIcon.backgroundSpriteArchive);
        MouseInput.farmFarSprite = SpriteInputHelpers.loadRgbSpriteByName("farm", "farm_far", (byte) -78, AchievementIcon.backgroundSpriteArchive);
        MultiplayerExitScreen.farmSmallSprite = SpriteInputHelpers.loadRgbSpriteByName("farm", "farm_small", (byte) 106, AchievementIcon.backgroundSpriteArchive);
        if (obfuscationGuard) {
          FarmBackground.g(-29);
        }
        ActivityIndicatorWidget.field_D = UiGeometryHelpers.createScaledHalfSizeSprite(0, LevelPackCard.farmNearSprite);
        WidgetTextLayout.field_b = UiGeometryHelpers.createScaledHalfSizeSprite(0, FontRequestHelpers.farmMidSprite);
        MainMenuScreen.field_w = UiGeometryHelpers.createScaledHalfSizeSprite(0, MouseInput.farmFarSprite);
        return true;
    }

    final void drawPreview(byte obfuscationGuard, int colorIndex, int destinationX, int destinationY) {
        if (colorIndex > -1) {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, FontRequestHelpers.farmBackgroundColors[colorIndex], 22953);
        } else {
          Rasterizer2D.fillVerticalGradient(destinationX, destinationY, 153, 238, 7829367, 22953);
        }
        if (this.hasSprites((byte) -109)) {
          MultiplayerExitScreen.farmSmallSprite.drawTransparent(destinationX, destinationY);
        }
        int var5 = -18 / ((-28 - obfuscationGuard) / 43);
    }

    final static String[] splitPreservingEmptyParts(byte obfuscationGuard, String text, char delimiter) {
        int partIndex = 0;
        int writtenPartIndex = 0;
        int delimiterCount = 0;
        RuntimeException failure = null;
        String[] parts = null;
        int nextPartIndex = 0;
        int guardCalculation = 0;
        int partStart = 0;
        int delimiterIndex = 0;
        int gameFlag = 0;
        CharSequence textSequence = null;
        String[] resultParts = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String textSummary = null;
        RuntimeException caughtFailure = null;
        gameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          textSequence = (CharSequence) ((Object) text);
          delimiterCount = pp.countCharacter((byte) 120, delimiter, textSequence);
          parts = new String[1 + delimiterCount];
          nextPartIndex = 0;
          guardCalculation = -40 % ((obfuscationGuard - 61) / 61);
          partStart = 0;
          for (partIndex = 0; partIndex < delimiterCount; partIndex++) {
            for (delimiterIndex = partStart; delimiter != text.charAt(delimiterIndex); delimiterIndex++) {
            }
            writtenPartIndex = nextPartIndex;
            nextPartIndex++;
            parts[writtenPartIndex] = text.substring(partStart, delimiterIndex);
            partStart = delimiterIndex + 1;
          }
          parts[delimiterCount] = text.substring(partStart);
          resultParts = parts;
          return resultParts;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("qb.Q(").append(obfuscationGuard).append(',');
          if (text == null) {
            textSummary = "null";
          } else {
            textSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(textSummary).append(',').append(delimiter).append(')').toString());
        }
    }

    final static int wrapBalancedDialogText(String[] lines, int maximumWidth, int obfuscationGuard, TextFont font, String text) {
        int characterIndex = 0;
        int spaceLineIndex = 0;
        int breakLineIndex = 0;
        int tailLineIndex = 0;
        int fastLineCount = 0;
        int lineCountResult = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String linesSummary = null;
        StringBuilder fontContextBuilder = null;
        String fontSummary = null;
        StringBuilder textContextBuilder = null;
        String textSummary = null;
        RuntimeException caughtFailure = null;
        int textWidth = 0;
        RuntimeException failure = null;
        int estimatedLineCount = 0;
        int lineStart = 0;
        int textLength = 0;
        int character = 0;
        String candidateLine = null;
        int candidateWidth = 0;
        int unusedGameFlag = 0;
        int lineCount;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          textWidth = font.measureText(text);
          if (maximumWidth >= textWidth &&
            text.indexOf("<br>") == -1) {
            lines[0] = text;
            fastLineCount = 1;
            return fastLineCount;
          }
          estimatedLineCount = (textWidth - (-maximumWidth + 1)) / maximumWidth;
          maximumWidth = textWidth / estimatedLineCount;
          lineCount = 0;
          lineStart = 0;
          textLength = text.length();
          for (characterIndex = 0; characterIndex < textLength; characterIndex++) {
            character = text.charAt(characterIndex);
            if (character == 32 ||
              character == 45) {
              candidateLine = text.substring(lineStart, characterIndex + 1).trim();
              candidateWidth = font.measureText(candidateLine);
              if (maximumWidth <= candidateWidth) {
                spaceLineIndex = lineCount;
                lineCount++;
                lines[spaceLineIndex] = candidateLine;
                lineStart = 1 + characterIndex;
              }
            }
            if (character == 62 &&
              text.regionMatches(characterIndex - 3, "<br>", 0, 4)) {
              breakLineIndex = lineCount;
              lineCount++;
              lines[breakLineIndex] = text.substring(lineStart, characterIndex - 3).trim();
              lineStart = characterIndex + 1;
            }
          }
          if (textLength > lineStart) {
            tailLineIndex = lineCount;
            lineCount++;
            lines[tailLineIndex] = text.substring(lineStart, textLength).trim();
          }
          if (obfuscationGuard != -63) {
            field_s = (String) null;
          }
          lineCountResult = lineCount;
          return lineCountResult;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("qb.A(");
          if (lines == null) {
            linesSummary = "null";
          } else {
            linesSummary = "{...}";
          }
          fontContextBuilder = ((StringBuilder) (Object) contextBuilder).append(linesSummary).append(',').append(maximumWidth).append(',').append(obfuscationGuard).append(',');
          if (font == null) {
            fontSummary = "null";
          } else {
            fontSummary = "{...}";
          }
          textContextBuilder = ((StringBuilder) (Object) fontContextBuilder).append(fontSummary).append(',');
          if (text == null) {
            textSummary = "null";
          } else {
            textSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) textContextBuilder).append(textSummary).append(')').toString());
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
