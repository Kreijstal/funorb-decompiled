/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
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
        if (param0 != ~ng.quickChatChannel) {
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
          rd.a((byte) -86);
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

    final static String a(String param0, String[] param1, byte param2) {
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
        String[] var12 = null;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_int = param0.length();
          var4 = var3_int;
          var5 = 0;
          if (param2 != 103) {
            var12 = (String[]) null;
            rd.a((String) null, (String[]) null, (byte) -1);
          }
          while (true) {
            var6_int = param0.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = 2 + var6_int; var5 < var3_int; var5++) {
                if (WidgetTheme.isAsciiDigit(param0.charAt(var5), (byte) 44)) {
                  continue;
                }
                break;
              }
              var7_ref_String = param0.substring(2 + var6_int, var5);
              if (!MeshAttributeRecord.a((CharSequence) ((Object) var7_ref_String), -43)) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (param0.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = UsernameAvailabilityValidator.a((CharSequence) ((Object) var7_ref_String), -28734);
              var4 = var4 + (var6_int - var5 + param1[var8].length());
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          while (true) {
            var8Lifetime1 = param0.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$2 = var6.append(param0.substring(var7));
              stackIn_27_0 = var6.toString();
              return stackIn_27_0;
            }
            for (var5Lifetime1 = 2 + var8Lifetime1; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (WidgetTheme.isAsciiDigit(param0.charAt(var5Lifetime1), (byte) 60)) {
                continue;
              }
              break;
            }
            var9 = param0.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!MeshAttributeRecord.a((CharSequence) ((Object) var9), param2 ^ -23)) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (62 != param0.charAt(var5Lifetime1)) {
              continue;
            }
            var5Lifetime1++;
            var10 = UsernameAvailabilityValidator.a((CharSequence) ((Object) var9), -28734);
            discarded$0 = var6.append(param0.substring(var7, var8Lifetime1));
            var7 = var5Lifetime1;
            discarded$1 = var6.append(param1[var10]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("rd.D(");
          if (param0 == null) {
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
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    final static RgbSprite[] c(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        RgbSprite[] var1 = new RgbSprite[nl.decodedSpriteCount];
        for (var2 = 0; var2 < nl.decodedSpriteCount; var2++) {
          var3 = jh.decodedSpriteWidths[var2] * TextHotspotRegion.decodedSpriteHeights[var2];
          var4 = GameOverlayHelpers.decodedSpriteIndices[var2];
          var5 = new int[var3];
          for (var6 = 0; var6 < var3; var6++) {
            var5[var6] = qp.decodedSpritePalette[IntrusiveHashIterator.a((int) var4[var6], 255)];
          }
          var1[var2] = new RgbSprite(cf.decodedCanvasWidth, FullscreenFailureDialog.decodedCanvasHeight, ArrayWidgetGroup.decodedSpriteOffsetX[var2], SocketConnector.decodedSpriteOffsetY[var2], jh.decodedSpriteWidths[var2], TextHotspotRegion.decodedSpriteHeights[var2], var5);
        }
        if (param0 < 93) {
          return (RgbSprite[]) null;
        }
        MotionWaypoint.clearDecodedSpriteData((byte) 96);
        return var1;
    }

    public static void a(byte param0) {
        field_e = null;
        field_b = null;
        if (param0 != 46) {
          rd.c(110);
        }
        field_c = null;
        constructionCapsSprites = (RgbSprite[][]) null;
    }

    static {
        field_b = "Fullscreen";
        field_c = "<%0> has withdrawn the request to join.";
    }
}
