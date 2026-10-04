/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MultiHandleSliderRenderer implements WidgetRenderer {
    private int handleRadius;
    static int field_g;
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

    final static java.awt.Container a(boolean param0) {
        if (SharedBufferPools.fullscreenFrame != null) {
            return (java.awt.Container) ((Object) SharedBufferPools.fullscreenFrame);
        }
        if (!param0) {
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

    final static void a(Sprite[] param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        CharSequence var12 = null;
        var11 = Geoblox.clientControlFlowFlag;
        try {
          if ((param0 != null) &&
              (param3 > 0)) {
            var6_int = param0[0].fullWidth;
            var7 = param0[2].fullWidth;
            var8 = param0[1].fullWidth;
            param0[0].drawGrayTinted(param2, param4, param1);
            param0[2].drawGrayTinted(-var7 + (param2 + param3), param4, param1);
            SoftwareRasterizer.saveClip(ClientOptionSupport.sharedSavedClip);
            SoftwareRasterizer.intersectClip(var6_int + param2, param4, -var7 + param3 + param2, param4 + param0[1].fullHeight);
            var9 = param2 + var6_int;
            var10 = -var7 + (param2 + param3);
            for (param2 = var9; param2 < var10; param2 = param2 + var8) {
              param0[1].drawGrayTinted(param2, param4, param1);
            }
            SoftwareRasterizer.restoreClip(ClientOptionSupport.sharedSavedClip);
            if (param5 == -17154) {
              return;
            }
            var12 = (CharSequence) null;
            MultiHandleSliderRenderer.encodeTextBytes((CharSequence) null, (byte) 66);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("jf.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
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
            L2: {
              characterCode = text.charAt(characterIndex);
              if (!((characterCode > 0) &&
                  (characterCode < 128))) {
                if (!((characterCode >= 160) &&
                    (255 >= characterCode))) {
                  if (8364 == characterCode) {
                    encodedBytes[characterIndex] = (byte)-128;
                    break L2;
                  }
                  if (characterCode == 8218) {
                    encodedBytes[characterIndex] = (byte)-126;
                    break L2;
                  }
                  if (402 == characterCode) {
                    encodedBytes[characterIndex] = (byte)-125;
                    break L2;
                  }
                  if (8222 == characterCode) {
                    encodedBytes[characterIndex] = (byte)-124;
                    break L2;
                  }
                  if (characterCode == 8230) {
                    encodedBytes[characterIndex] = (byte)-123;
                    break L2;
                  }
                  if (characterCode == 8224) {
                    encodedBytes[characterIndex] = (byte)-122;
                    break L2;
                  }
                  if (characterCode == 8225) {
                    encodedBytes[characterIndex] = (byte)-121;
                    break L2;
                  }
                  if (characterCode == 710) {
                    encodedBytes[characterIndex] = (byte)-120;
                    break L2;
                  }
                  if (characterCode == 8240) {
                    encodedBytes[characterIndex] = (byte)-119;
                    break L2;
                  }
                  if (352 == characterCode) {
                    encodedBytes[characterIndex] = (byte)-118;
                    break L2;
                  }
                  if (8249 == characterCode) {
                    encodedBytes[characterIndex] = (byte)-117;
                    break L2;
                  }
                  if (338 == characterCode) {
                    encodedBytes[characterIndex] = (byte)-116;
                    break L2;
                  }
                  if (characterCode == 381) {
                    encodedBytes[characterIndex] = (byte)-114;
                    break L2;
                  }
                  if (8216 == characterCode) {
                    encodedBytes[characterIndex] = (byte)-111;
                    break L2;
                  }
                  if (8217 == characterCode) {
                    encodedBytes[characterIndex] = (byte)-110;
                    break L2;
                  }
                  if (characterCode == 8220) {
                    encodedBytes[characterIndex] = (byte)-109;
                    break L2;
                  }
                  if (characterCode == 8221) {
                    encodedBytes[characterIndex] = (byte)-108;
                    break L2;
                  }
                  if (characterCode == 8226) {
                    encodedBytes[characterIndex] = (byte)-107;
                    break L2;
                  }
                  if (8211 == characterCode) {
                    encodedBytes[characterIndex] = (byte)-106;
                    break L2;
                  }
                  if (characterCode == 8212) {
                    encodedBytes[characterIndex] = (byte)-105;
                    break L2;
                  }
                  if (characterCode == 732) {
                    encodedBytes[characterIndex] = (byte)-104;
                    break L2;
                  }
                  if (characterCode == 8482) {
                    encodedBytes[characterIndex] = (byte)-103;
                    break L2;
                  }
                  if (characterCode == 353) {
                    encodedBytes[characterIndex] = (byte)-102;
                    break L2;
                  }
                  if (characterCode == 8250) {
                    encodedBytes[characterIndex] = (byte)-101;
                    break L2;
                  }
                  if (characterCode == 339) {
                    encodedBytes[characterIndex] = (byte)-100;
                    break L2;
                  }
                  if (characterCode == 382) {
                    encodedBytes[characterIndex] = (byte)-98;
                    break L2;
                  }
                  if (characterCode != 376) {
                    encodedBytes[characterIndex] = (byte)63;
                    break L2;
                  }
                  encodedBytes[characterIndex] = (byte)-97;
                  break L2;
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
        field_g = 3;
    }
}
