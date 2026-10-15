/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GamePresentationHelpers {
    static String field_b;
    static BinaryMaskFont field_e;
    static String field_c;
    static boolean field_a;
    static RgbSprite[][] constructionCapsSprites;

    final static void a(int param0) {
        TooltipSprite.field_p = false;
        if (null != hd.quickChatMenu) {
          hd.quickChatMenu.resetSelection((byte) 41);
        }
        if (param0 != ~ScreenNavigationHelpers.quickChatChannel) {
          UsernameAvailabilityValidator.b(true);
        }
        HighscoresScreen.field_v = 0;
    }

    final static void drawDiagnosticOverlay(int obfuscationGuard) {
        int reverseCharacterIndex = 0;
        char characterForAdvance = 0;
        RuntimeException caughtFailure = null;
        int lineCount = 0;
        RuntimeException drawingFailure = null;
        int panelHeight = 0;
        int panelWidth = 0;
        DiagnosticTextLine measuredLine = null;
        int borderInset = 0;
        DiagnosticTextLine drawnLine = null;
        int measuredLineWidth = 0;
        int measureCharacterIndex = 0;
        int unusedCharacter = 0;
        int unusedClientFlag = 0;
        int baselineY;
        int borderAlpha256;
        int cursorX;
        int drawnCharacter;
        unusedClientFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard >= -26) {
            return;
          }
          lineCount = LoginCredentials.diagnosticLines.size(119);
          if (lineCount != 0) {
            panelHeight = 14 + (18 * lineCount + 9);
            panelWidth = 0;
            measuredLine = (DiagnosticTextLine) (LoginCredentials.diagnosticLines.first(-8));
            while (measuredLine != null) {
              measuredLineWidth = 0;
              for (measureCharacterIndex = 0; measuredLine.text.length() > measureCharacterIndex; measureCharacterIndex++) {
                measuredLineWidth = measuredLineWidth + SoundCache.diagnosticFont.getAdvance(measuredLine.text.charAt(measureCharacterIndex));
              }
              if (measuredLineWidth > panelWidth) {
                panelWidth = measuredLineWidth;
              }
              measuredLine = (DiagnosticTextLine) (LoginCredentials.diagnosticLines.next((byte) 116));
            }
            panelWidth += 28;
            panelWidth = -(panelWidth % 100) + (100 + panelWidth);
            Rasterizer2D.fillRectangleAlpha(-panelWidth + 626, 14, panelWidth, panelHeight, 0, 180);
            for (borderInset = 0; borderInset < 12; borderInset++) {
              borderAlpha256 = (-borderInset + 12) * 20;
              Rasterizer2D.drawRectangleAlpha(626 - panelWidth + borderInset, 14 + borderInset, -borderInset - borderInset + panelWidth, -borderInset - borderInset + panelHeight, 0, borderAlpha256);
            }
            baselineY = 41;
            drawnLine = (DiagnosticTextLine) (LoginCredentials.diagnosticLines.first(-80));
            while (drawnLine != null) {
              cursorX = 612;
              unusedCharacter = 0;
              for (reverseCharacterIndex = 0; drawnLine.text.length() > reverseCharacterIndex; reverseCharacterIndex++) {
                characterForAdvance = drawnLine.text.charAt(drawnLine.text.length() + (-reverseCharacterIndex - 1));
                drawnCharacter = characterForAdvance;
                cursorX = cursorX - SoundCache.diagnosticFont.getAdvance(characterForAdvance);
                SoundCache.diagnosticFont.drawCharacter((char) drawnCharacter, cursorX, baselineY, 2);
              }
              baselineY += 18;
              drawnLine = (DiagnosticTextLine) (LoginCredentials.diagnosticLines.next((byte) 116));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtDrawingFailure) {
          caughtFailure = caughtDrawingFailure;
          drawingFailure = caughtFailure;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) drawingFailure), "rd.E(" + obfuscationGuard + ')');
        }
    }

    final static BackgroundScene selectBackground(int selector, byte obfuscationGuard) {
        int var3 = 0;
        Object var2 = null;
        if (obfuscationGuard != 19) {
          GamePresentationHelpers.a((byte) -86);
        }
        ChatMessage.backgroundVariant = ButtonWidgetRenderer.field_w.nextBoundedInt(-37880252, 2);
        if (selector == 0) {
          var3 = ButtonWidgetRenderer.field_w.nextBoundedInt(-37880252, 11);
          if (var3 + 1 == IntArrayRequest.lastBackgroundId) {
            var3 = (1 + var3) % 11;
          }
          IntArrayRequest.lastBackgroundId = var3 + 1;
          selector = var3 + 1;
        }
        if (selector == 7) {
          HotspotTextWidget.clearFireworks(0);
        }
        BackgroundScene var2_ref = BackgroundRegistry.scenes[selector];
        var2_ref.ensureSprites(obfuscationGuard - 18);
        return var2_ref;
    }

    final static String formatIndexedText(String template, String[] replacements, byte obfuscationGuard) {
        StringBuilder tailAppendResult = null;
        StringBuilder literalAppendResult = null;
        StringBuilder replacementAppendResult = null;
        String formattedText = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String templateSummary = null;
        StringBuilder replacementContextBuilder = null;
        String replacementsSummary = null;
        RuntimeException caughtFailure = null;
        int templateLength = 0;
        RuntimeException failure = null;
        int outputCapacity = 0;
        int scanIndex = 0;
        int tokenStart = 0;
        StringBuilder resultBuilder = null;
        int literalStart = 0;
        String indexDigits = null;
        int replacementIndex = 0;
        String copyIndexDigits = null;
        int copyReplacementIndex = 0;
        int unusedGameFlag = 0;
        String[] unusedReplacements = null;
        int copyScanIndex;
        int copyTokenStart;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          templateLength = template.length();
          outputCapacity = templateLength;
          scanIndex = 0;
          if (obfuscationGuard != 103) {
            unusedReplacements = (String[]) null;
            GamePresentationHelpers.formatIndexedText((String) null, (String[]) null, (byte) -1);
          }
          while (true) {
            tokenStart = template.indexOf("<%", scanIndex);
            if (tokenStart >= 0) {
              for (scanIndex = 2 + tokenStart; scanIndex < templateLength; scanIndex++) {
                if (WidgetTheme.isAsciiDigit(template.charAt(scanIndex), (byte) 44)) {
                  continue;
                }
                break;
              }
              indexDigits = template.substring(2 + tokenStart, scanIndex);
              if (!MeshAttributeRecord.isDecimalInt((CharSequence) ((Object) indexDigits), -43)) {
                continue;
              }
              if (scanIndex >= templateLength) {
                continue;
              }
              if (template.charAt(scanIndex) != 62) {
                continue;
              }
              scanIndex++;
              replacementIndex = UsernameAvailabilityValidator.parseDecimalInt((CharSequence) ((Object) indexDigits), -28734);
              outputCapacity = outputCapacity + (tokenStart - scanIndex + replacements[replacementIndex].length());
              continue;
            }
            break;
          }
          resultBuilder = new StringBuilder(outputCapacity);
          literalStart = 0;
          copyScanIndex = 0;
          while (true) {
            copyTokenStart = template.indexOf("<%", copyScanIndex);
            if (copyTokenStart < 0) {
              tailAppendResult = resultBuilder.append(template.substring(literalStart));
              formattedText = resultBuilder.toString();
              return formattedText;
            }
            for (copyScanIndex = 2 + copyTokenStart; templateLength > copyScanIndex; copyScanIndex++) {
              if (WidgetTheme.isAsciiDigit(template.charAt(copyScanIndex), (byte) 60)) {
                continue;
              }
              break;
            }
            copyIndexDigits = template.substring(2 + copyTokenStart, copyScanIndex);
            if (!MeshAttributeRecord.isDecimalInt((CharSequence) ((Object) copyIndexDigits), obfuscationGuard ^ -23)) {
              continue;
            }
            if (templateLength <= copyScanIndex) {
              continue;
            }
            if (62 != template.charAt(copyScanIndex)) {
              continue;
            }
            copyScanIndex++;
            copyReplacementIndex = UsernameAvailabilityValidator.parseDecimalInt((CharSequence) ((Object) copyIndexDigits), -28734);
            literalAppendResult = resultBuilder.append(template.substring(literalStart, copyTokenStart));
            literalStart = copyScanIndex;
            replacementAppendResult = resultBuilder.append(replacements[copyReplacementIndex]);
          }
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("rd.D(");
          if (template == null) {
            templateSummary = "null";
          } else {
            templateSummary = "{...}";
          }
          replacementContextBuilder = ((StringBuilder) (Object) contextBuilder).append(templateSummary).append(',');
          if (replacements == null) {
            replacementsSummary = "null";
          } else {
            replacementsSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) replacementContextBuilder).append(replacementsSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static RgbSprite[] buildRgbSprites(int obfuscationGuard) {
        int spriteIndex = 0;
        int pixelCount = 0;
        byte[] indices = null;
        int[] pixels = null;
        int pixelIndex = 0;
        int unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        RgbSprite[] sprites = new RgbSprite[IncomingPacketHelpers.decodedSpriteCount];
        for (spriteIndex = 0; spriteIndex < IncomingPacketHelpers.decodedSpriteCount; spriteIndex++) {
          pixelCount = jh.decodedSpriteWidths[spriteIndex] * TextHotspotRegion.decodedSpriteHeights[spriteIndex];
          indices = GameOverlayHelpers.decodedSpriteIndices[spriteIndex];
          pixels = new int[pixelCount];
          for (pixelIndex = 0; pixelIndex < pixelCount; pixelIndex++) {
            pixels[pixelIndex] = qp.decodedSpritePalette[IntrusiveHashIterator.a((int) indices[pixelIndex], 255)];
          }
          sprites[spriteIndex] = new RgbSprite(cf.decodedCanvasWidth, FullscreenFailureDialog.decodedCanvasHeight, ArrayWidgetGroup.decodedSpriteOffsetX[spriteIndex], SocketConnector.decodedSpriteOffsetY[spriteIndex], jh.decodedSpriteWidths[spriteIndex], TextHotspotRegion.decodedSpriteHeights[spriteIndex], pixels);
        }
        if (obfuscationGuard < 93) {
          return (RgbSprite[]) null;
        }
        MotionWaypoint.clearDecodedSpriteData((byte) 96);
        return sprites;
    }

    public static void a(byte param0) {
        field_e = null;
        field_b = null;
        if (param0 != 46) {
          GamePresentationHelpers.buildRgbSprites(110);
        }
        field_c = null;
        constructionCapsSprites = (RgbSprite[][]) null;
    }

    static {
        field_b = "Fullscreen";
        field_c = "<%0> has withdrawn the request to join.";
    }
}
