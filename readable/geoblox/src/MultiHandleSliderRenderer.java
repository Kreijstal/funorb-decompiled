/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MultiHandleSliderRenderer implements WidgetRenderer {
    private int handleRadius;
    static int fiveMatchChainAchievementId;
    private int railColor;
    static int[] meshSpecularResponseByAbsDot;
    private int handleColor;
    static int avatarTintFadeTicks;
    static Sprite rotatedThemeForegroundRaster;
    private int backgroundColor;
    private BitmapFont font;
    private int textColor;
    private int textShadowColor;
    static int pendingActionPanelWidth;

    final static void openAccountCreationForm(byte methodGuard) {
        EntityCollisionSupport.activeAccountCreationForm = new AccountCreationForm();
        if (methodGuard >= 19) {
            ButtonWidget.accountContentDialog.replaceContent(EntityCollisionSupport.activeAccountCreationForm, -54);
            return;
        }
        rotatedThemeForegroundRaster = (Sprite) null;
        ButtonWidget.accountContentDialog.replaceContent(EntityCollisionSupport.activeAccountCreationForm, -54);
    }

    public final void drawWidget(int parentX, int methodGuard, int parentY, boolean widgetEnabled, UiWidget widget) {
        int handleIndex = 0;
        UiWidget sliderWidgetOrNull = null;
        RuntimeException drawingFailureBeforeDescription = null;
        StringBuilder drawingMessagePrefix = null;
        String widgetDescription = null;
        RuntimeException drawingFailure = null;
        RuntimeException drawingFailureForContext = null;
        int usableRailWidth = 0;
        int railScreenX = 0;
        int railScreenY = 0;
        int clientControlFlowSnapshot = 0;
        MultiHandleSliderWidget sliderWidget = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (widget instanceof MultiHandleSliderWidget) {
            sliderWidgetOrNull = (UiWidget) (widget);
          } else {
            sliderWidgetOrNull = null;
          }
          sliderWidget = (MultiHandleSliderWidget) ((Object) sliderWidgetOrNull);
          if (methodGuard >= -5) {
            return;
          }
          if (sliderWidget == null) {
          }
          SoftwareRasterizer.fillRectangle(widget.widgetX + parentX, widget.widgetY + parentY, widget.widgetWidth, widget.widgetHeight, this.backgroundColor);
          usableRailWidth = -(2 * sliderWidget.railInset) + widget.widgetWidth;
          railScreenX = parentX - (-widget.widgetX - sliderWidget.railInset);
          railScreenY = sliderWidget.railOffsetY + parentY + widget.widgetY;
          SoftwareRasterizer.drawLine(railScreenX, railScreenY, usableRailWidth + railScreenX, railScreenY, this.railColor);
          for (handleIndex = sliderWidget.handleCount((byte) 86) - 1; handleIndex >= 0; handleIndex--) {
            SoftwareRasterizer.fillCircle(usableRailWidth * sliderWidget.handleValueAt(-113, handleIndex) / sliderWidget.maximumValue(-128) + railScreenX, railScreenY, this.handleRadius, this.handleColor);
          }
          if (null == this.font) {
            return;
          }
          this.font.drawCenteredText(sliderWidget.widgetText, railScreenX + usableRailWidth / 2, this.font.lineAdvance + railScreenY + sliderWidget.railOffsetY, this.textColor, this.textShadowColor);
          return;
        } catch (java.lang.RuntimeException caughtDrawingFailure) {
          drawingFailure = caughtDrawingFailure;
          drawingFailureForContext = drawingFailure;
          drawingFailureBeforeDescription = drawingFailureForContext;
          drawingMessagePrefix = new StringBuilder().append("jf.E(").append(parentX).append(',').append(methodGuard).append(',').append(parentY).append(',').append(widgetEnabled).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) drawingFailureBeforeDescription), ((StringBuilder) (Object) drawingMessagePrefix).append(widgetDescription).append(')').toString());
        }
    }

    final static java.awt.Container getActiveCanvasContainer(boolean preservePendingActionPanelWidth) {
        if (SharedBufferPools.fullscreenFrame != null) {
            return (java.awt.Container) ((Object) SharedBufferPools.fullscreenFrame);
        }
        if (!preservePendingActionPanelWidth) {
            pendingActionPanelWidth = 78;
            return (java.awt.Container) ((Object) NodeHashTableIterator.getActiveApplet(122));
        }
        return (java.awt.Container) ((Object) NodeHashTableIterator.getActiveApplet(122));
    }

    final static void drawHalfBlendRgbGradientSpan(int destinationIndex, int redStepQ16, int guard, int redQ16, int blueStepQ16, int greenQ16, int greenStepQ16, int pixelCount, int blueQ16, int[] destinationPixels) {
        int[] destinationForWrite = null;
        RuntimeException spanFailure = null;
        int destinationIndexForWrite = 0;
        int redForWriteQ16 = 0;
        int greenForWriteQ16 = 0;
        int blueForWriteQ16 = 0;
        int previousPixelHalf = 0;
        int controlFlagSnapshot = 0;
        int[] destinationForRead = null;
        RuntimeException spanFailureBeforeContext = null;
        StringBuilder spanMessagePrefix = null;
        String destinationDescription = null;
        RuntimeException caughtSpanFailure = null;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          while (true) {
            pixelCount--;
            if (pixelCount < 0) {
              if (guard == 33423689) {
                return;
              }
              pendingActionPanelWidth = -7;
              return;
            }
            destinationForRead = destinationPixels;
            destinationForWrite = destinationForRead;
            destinationIndexForWrite = destinationIndex;
            redForWriteQ16 = redQ16;
            greenForWriteQ16 = greenQ16;
            blueForWriteQ16 = blueQ16;
            previousPixelHalf = destinationForRead[destinationIndexForWrite] >> 1 & 8355711;
            destinationForWrite[destinationIndexForWrite] = ProxySocketConnector.andInt(255, blueForWriteQ16 >> 17) + ((ProxySocketConnector.andInt(33423689, greenForWriteQ16) >> 9) + (ProxySocketConnector.andInt(33423360, redForWriteQ16) >> 1)) + previousPixelHalf;
            destinationIndex++;
            blueQ16 = blueQ16 + blueStepQ16;
            redQ16 = redQ16 + redStepQ16;
            greenQ16 = greenQ16 + greenStepQ16;
          }
        } catch (java.lang.RuntimeException caughtSpanParameter) {
          caughtSpanFailure = caughtSpanParameter;
          spanFailure = caughtSpanFailure;
          spanFailureBeforeContext = spanFailure;
          spanMessagePrefix = new StringBuilder().append("jf.F(").append(destinationIndex).append(',').append(redStepQ16).append(',').append(guard).append(',').append(redQ16).append(',').append(blueStepQ16).append(',').append(greenQ16).append(',').append(greenStepQ16).append(',').append(pixelCount).append(',').append(blueQ16).append(',');
          if (destinationPixels == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) spanFailureBeforeContext), ((StringBuilder) (Object) spanMessagePrefix).append(destinationDescription).append(')').toString());
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        rotatedThemeForegroundRaster = null;
        int guardRemainder = 14 % ((methodGuard - 27) / 47);
        meshSpecularResponseByAbsDot = null;
    }

    final static void drawGrayTintedHorizontalThreePartStrip(Sprite[] sprites, int grayTint, int stripLeftThenTileX, int stripWidth, int stripTop, int methodGuard) {
        RuntimeException drawFailureBeforeDescription = null;
        StringBuilder drawMessagePrefix = null;
        String spritesDescription = null;
        RuntimeException caughtDrawFailure = null;
        int leftWidth = 0;
        RuntimeException drawFailureForContext = null;
        int rightWidth = 0;
        int tileWidth = 0;
        int tileStartX = 0;
        int tileEndX = 0;
        int unusedClientControlSnapshot = 0;
        CharSequence unusedNullTextSnapshot = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (sprites != null &&
              stripWidth > 0) {
            leftWidth = sprites[0].fullWidth;
            rightWidth = sprites[2].fullWidth;
            tileWidth = sprites[1].fullWidth;
            sprites[0].drawGrayTinted(stripLeftThenTileX, stripTop, grayTint);
            sprites[2].drawGrayTinted(-rightWidth + (stripLeftThenTileX + stripWidth), stripTop, grayTint);
            SoftwareRasterizer.saveClip(ClientOptionSupport.sharedSavedClip);
            SoftwareRasterizer.intersectClip(leftWidth + stripLeftThenTileX, stripTop, -rightWidth + stripWidth + stripLeftThenTileX, stripTop + sprites[1].fullHeight);
            tileStartX = stripLeftThenTileX + leftWidth;
            tileEndX = -rightWidth + (stripLeftThenTileX + stripWidth);
            for (stripLeftThenTileX = tileStartX; stripLeftThenTileX < tileEndX; stripLeftThenTileX = stripLeftThenTileX + tileWidth) {
              sprites[1].drawGrayTinted(stripLeftThenTileX, stripTop, grayTint);
            }
            SoftwareRasterizer.restoreClip(ClientOptionSupport.sharedSavedClip);
            if (methodGuard == -17154) {
              return;
            }
            unusedNullTextSnapshot = (CharSequence) null;
            MultiHandleSliderRenderer.encodeTextBytes((CharSequence) null, (byte) 66);
            return;
          }
          return;
        } catch (java.lang.RuntimeException drawFailure) {
          caughtDrawFailure = drawFailure;
          drawFailureForContext = caughtDrawFailure;
          drawFailureBeforeDescription = drawFailureForContext;
          drawMessagePrefix = new StringBuilder().append("jf.G(");
          if (sprites == null) {
            spritesDescription = "null";
          } else {
            spritesDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) drawFailureBeforeDescription), ((StringBuilder) (Object) drawMessagePrefix).append(spritesDescription).append(',').append(grayTint).append(',').append(stripLeftThenTileX).append(',').append(stripWidth).append(',').append(stripTop).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static byte[] encodeTextBytes(CharSequence text, byte methodGuard) {
        int characterIndex = 0;
        byte[] encodedBytesBeforeReturn = null;
        RuntimeException encodingFailureBeforeDescription = null;
        StringBuilder encodingMessagePrefix = null;
        String textDescription = null;
        RuntimeException caughtEncodingFailure = null;
        int textLength = 0;
        RuntimeException encodingFailureForContext = null;
        byte[] encodedBytes = null;
        int characterCode = 0;
        int unusedClientGuardSnapshot = 0;
        int[] unusedNullIntArraySnapshot = null;
        unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard < 117) {
            unusedNullIntArraySnapshot = (int[]) null;
            MultiHandleSliderRenderer.drawHalfBlendRgbGradientSpan(25, 87, -85, 85, 111, -85, 50, 110, -77, (int[]) null);
          }
          textLength = text.length();
          encodedBytes = new byte[textLength];
          for (characterIndex = 0; textLength > characterIndex; characterIndex++) {
            encodedTextCharacter: {
              characterCode = text.charAt(characterIndex);
              if ((characterCode <= 0 ||
                characterCode >= 128) && (characterCode < 160 ||
                  255 < characterCode)) {
                switch (characterCode) {
                  case 8364:
                    encodedBytes[characterIndex] = (byte)-128;
                    break encodedTextCharacter;
                  case 8218:
                    encodedBytes[characterIndex] = (byte)-126;
                    break encodedTextCharacter;
                  case 402:
                    encodedBytes[characterIndex] = (byte)-125;
                    break encodedTextCharacter;
                  case 8222:
                    encodedBytes[characterIndex] = (byte)-124;
                    break encodedTextCharacter;
                  case 8230:
                    encodedBytes[characterIndex] = (byte)-123;
                    break encodedTextCharacter;
                  case 8224:
                    encodedBytes[characterIndex] = (byte)-122;
                    break encodedTextCharacter;
                  case 8225:
                    encodedBytes[characterIndex] = (byte)-121;
                    break encodedTextCharacter;
                  case 710:
                    encodedBytes[characterIndex] = (byte)-120;
                    break encodedTextCharacter;
                  case 8240:
                    encodedBytes[characterIndex] = (byte)-119;
                    break encodedTextCharacter;
                  case 352:
                    encodedBytes[characterIndex] = (byte)-118;
                    break encodedTextCharacter;
                  case 8249:
                    encodedBytes[characterIndex] = (byte)-117;
                    break encodedTextCharacter;
                  case 338:
                    encodedBytes[characterIndex] = (byte)-116;
                    break encodedTextCharacter;
                  case 381:
                    encodedBytes[characterIndex] = (byte)-114;
                    break encodedTextCharacter;
                  case 8216:
                    encodedBytes[characterIndex] = (byte)-111;
                    break encodedTextCharacter;
                  case 8217:
                    encodedBytes[characterIndex] = (byte)-110;
                    break encodedTextCharacter;
                  case 8220:
                    encodedBytes[characterIndex] = (byte)-109;
                    break encodedTextCharacter;
                  case 8221:
                    encodedBytes[characterIndex] = (byte)-108;
                    break encodedTextCharacter;
                  case 8226:
                    encodedBytes[characterIndex] = (byte)-107;
                    break encodedTextCharacter;
                  case 8211:
                    encodedBytes[characterIndex] = (byte)-106;
                    break encodedTextCharacter;
                  case 8212:
                    encodedBytes[characterIndex] = (byte)-105;
                    break encodedTextCharacter;
                  case 732:
                    encodedBytes[characterIndex] = (byte)-104;
                    break encodedTextCharacter;
                  case 8482:
                    encodedBytes[characterIndex] = (byte)-103;
                    break encodedTextCharacter;
                  case 353:
                    encodedBytes[characterIndex] = (byte)-102;
                    break encodedTextCharacter;
                  case 8250:
                    encodedBytes[characterIndex] = (byte)-101;
                    break encodedTextCharacter;
                  case 339:
                    encodedBytes[characterIndex] = (byte)-100;
                    break encodedTextCharacter;
                  case 382:
                    encodedBytes[characterIndex] = (byte)-98;
                    break encodedTextCharacter;
                  default:
                    encodedBytes[characterIndex] = (byte)63;
                    break encodedTextCharacter;
                  case 376:
                    encodedBytes[characterIndex] = (byte)-97;
                    break encodedTextCharacter;
                }
                  }
              encodedBytes[characterIndex] = (byte)characterCode;
            }
          }
          encodedBytesBeforeReturn = encodedBytes;
          return encodedBytesBeforeReturn;
        } catch (java.lang.RuntimeException encodingFailure) {
          caughtEncodingFailure = encodingFailure;
          encodingFailureForContext = caughtEncodingFailure;
          encodingFailureBeforeDescription = encodingFailureForContext;
          encodingMessagePrefix = new StringBuilder().append("jf.C(");
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) encodingFailureBeforeDescription), ((StringBuilder) (Object) encodingMessagePrefix).append(textDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    MultiHandleSliderRenderer(BitmapFont font, int textColor, int textShadowColor, int railColor, int backgroundColor, int handleRadius, int handleColor) {
        try {
            this.railColor = railColor;
            this.backgroundColor = backgroundColor;
            this.handleColor = handleColor;
            this.font = font;
            this.handleRadius = handleRadius;
            this.textColor = textColor;
            this.textShadowColor = textShadowColor;
        } catch (RuntimeException rendererInitializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) rendererInitializationFailure), "jf.<init>(" + (font != null ? "{...}" : "null") + ',' + textColor + ',' + textShadowColor + ',' + railColor + ',' + backgroundColor + ',' + handleRadius + ',' + handleColor + ')');
        }
    }

    static {
        avatarTintFadeTicks = 0;
        fiveMatchChainAchievementId = 3;
    }
}
