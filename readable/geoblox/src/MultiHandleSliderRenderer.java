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
        int var10 = 0;
        UiWidget stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        MultiHandleSliderWidget var12 = null;
        var11 = Geoblox.clientControlFlowFlag;
        try {
          if (widget instanceof MultiHandleSliderWidget) {
            stackIn_4_0 = (UiWidget) (widget);
          } else {
            stackIn_4_0 = null;
          }
          var12 = (MultiHandleSliderWidget) ((Object) stackIn_4_0);
          if (methodGuard >= -5) {
            return;
          }
          if (var12 == null) {
          }
          SoftwareRasterizer.fillRectangle(widget.widgetX + parentX, widget.widgetY + parentY, widget.widgetWidth, widget.widgetHeight, this.backgroundColor);
          var7 = -(2 * var12.railInset) + widget.widgetWidth;
          var8 = parentX - (-widget.widgetX - var12.railInset);
          var9 = var12.railOffsetY + parentY + widget.widgetY;
          SoftwareRasterizer.drawLine(var8, var9, var7 + var8, var9, this.railColor);
          for (var10 = var12.handleCount((byte) 86) - 1; var10 >= 0; var10--) {
            SoftwareRasterizer.fillCircle(var7 * var12.handleValueAt(-113, var10) / var12.maximumValue(-128) + var8, var9, this.handleRadius, this.handleColor);
          }
          if (null == this.font) {
            return;
          }
          this.font.drawCenteredText(var12.widgetText, var8 + var7 / 2, this.font.lineAdvance + var9 + var12.railOffsetY, this.textColor, this.textShadowColor);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("jf.E(").append(parentX).append(',').append(methodGuard).append(',').append(parentY).append(',').append(widgetEnabled).append(',');
          if (widget == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
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
            continue;
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
              if (characterCode <= 0 ||
                  characterCode >= 128) {
                if (characterCode < 160 ||
                    255 < characterCode) {
                  if (8364 == characterCode) {
                    encodedBytes[characterIndex] = (byte)-128;
                    break encodedTextCharacter;
                  }
                  if (characterCode == 8218) {
                    encodedBytes[characterIndex] = (byte)-126;
                    break encodedTextCharacter;
                  }
                  if (402 == characterCode) {
                    encodedBytes[characterIndex] = (byte)-125;
                    break encodedTextCharacter;
                  }
                  if (8222 == characterCode) {
                    encodedBytes[characterIndex] = (byte)-124;
                    break encodedTextCharacter;
                  }
                  if (characterCode == 8230) {
                    encodedBytes[characterIndex] = (byte)-123;
                    break encodedTextCharacter;
                  }
                  if (characterCode == 8224) {
                    encodedBytes[characterIndex] = (byte)-122;
                    break encodedTextCharacter;
                  }
                  if (characterCode == 8225) {
                    encodedBytes[characterIndex] = (byte)-121;
                    break encodedTextCharacter;
                  }
                  if (characterCode == 710) {
                    encodedBytes[characterIndex] = (byte)-120;
                    break encodedTextCharacter;
                  }
                  if (characterCode == 8240) {
                    encodedBytes[characterIndex] = (byte)-119;
                    break encodedTextCharacter;
                  }
                  if (352 == characterCode) {
                    encodedBytes[characterIndex] = (byte)-118;
                    break encodedTextCharacter;
                  }
                  if (8249 == characterCode) {
                    encodedBytes[characterIndex] = (byte)-117;
                    break encodedTextCharacter;
                  }
                      switch (characterCode) {
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

    MultiHandleSliderRenderer(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.railColor = param3;
            this.backgroundColor = param4;
            this.handleColor = param6;
            this.font = param0;
            this.handleRadius = param5;
            this.textColor = param1;
            this.textShadowColor = param2;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "jf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        avatarTintFadeTicks = 0;
        fiveMatchChainAchievementId = 3;
    }
}
