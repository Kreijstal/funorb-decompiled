/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetTheme {
    WidgetRenderer field_i;
    TextFont font;
    int field_h;
    int field_g;
    int field_m;
    WidgetRenderer defaultFocusableRenderer;
    int field_p;
    private int field_c;
    static String[] lostBallMessages;
    int field_f;
    int field_j;
    static int chatHistoryCategoryLimit;
    static UiComponent field_n;
    WidgetRenderer textFieldRenderer;
    WidgetRenderer emptyFocusableRenderer;
    int field_a;
    static String field_d;
    WidgetRenderer toggleButtonRenderer;
    private boolean field_s;

    public static void a(int param0) {
        lostBallMessages = null;
        field_d = null;
        field_n = null;
        if (param0 != -31063) {
          lostBallMessages = (String[]) null;
        }
    }

    final void a(TextFont param0, int param1) {
        TextWidgetRenderer var17 = null;
        StatefulWidgetRenderer var4 = null;
        RgbSprite[] var5 = null;
        ArgbSprite var16 = null;
        ArgbSprite var18 = null;
        int var7_int = 0;
        StatefulWidgetRenderer var6 = null;
        StatefulWidgetRenderer var7 = null;
        RadialSelectorRenderer discarded$0 = null;
        MultiValueSliderRenderer discarded$1 = null;
        StatefulWidgetRenderer var8 = null;
        RgbSprite[] var9 = null;
        RgbSprite[] var10 = null;
        RgbSprite dupTemp$2 = null;
        StatefulWidgetRenderer var11 = null;
        StatefulWidgetRenderer var12 = null;
        RgbSprite var13 = null;
        StatefulWidgetRenderer var14 = null;
        StatefulWidgetRenderer var19 = null;
        int var15 = BrickABrac.field_J ? 1 : 0;
        StatefulWidgetRenderer var14Lifetime1;
        StatefulWidgetRenderer var14Lifetime2;
        try {
          var17 = new TextWidgetRenderer(param0, 2, 2, 2236962, 1, 1, 1, param0.ascent + param0.descent + 2);
          var17.textColor = 16777215;
          this.field_i = (WidgetRenderer) ((Object) var17);
          var4 = new StatefulWidgetRenderer();
          var17.copyStyleTo(-86, var4);
          var4.caretColor = 15658734;
          var4.selectionArgb = 11711154;
          this.font = param0;
          this.field_f = 3;
          this.field_a = 3;
          this.field_p = 5592405;
          this.field_m = -1;
          this.field_h = 3;
          this.field_c = 15658734;
          this.field_j = 15658734;
          this.field_g = 3;
          var4.replaceStateStyle(0, 113).setTextPaint(false, 15658734).setFrameSprites(ScorePopup.a(7829367, 10066329, (byte) 66, 8947848), -2147483648);
          var4.replaceStateStyle(1, 110).setFrameSprites(ScorePopup.a(13421772, 10066329, (byte) 115, 11184810), -2147483648);
          var4.replaceStateStyle(3, 118).setFrameSprites(ScorePopup.a(10066329, 7829367, (byte) 115, 8947848), param1 ^ -2134061876).setOffsetX(1, (byte) -50).setOffsetY(0, 1);
          var5 = new RgbSprite[9];
          var16 = new ArgbSprite(32, 32);
          var18 = var16;
          for (var7_int = 0; var18.pixels.length > var7_int; var7_int++) {
            var16.pixels[var7_int] = 1077952576;
          }
          var5[4] = (RgbSprite) ((Object) var18);
          var4.replaceStateStyle(4, 121).setPaintPreviousStyle(true, false).setFrameSprites(var5, -2147483648);
          var4.replaceStateStyle(5, param1 ^ 13421757).setFrameSprites(VerticalScrollbar.a(0, 0, 65793, 1, 0), param1 ^ -2134061876).setPaintPreviousStyle(true, false).setTextPaint(false, -1);
          this.defaultFocusableRenderer = (WidgetRenderer) ((Object) var4);
          var6 = new StatefulWidgetRenderer(var4, true);
          var6.horizontalAlignment = 0;
          var7 = new StatefulWidgetRenderer(var4, true);
          var7.horizontalAlignment = 0;
          var7.setAllFrameSprites(BallPulseEffect.a(8947848, false), false);
          var7.replaceStateStyle(1, 110).setFrameSprites(BallPulseEffect.a(11184810, false), param1 + 2134061876).setTextPaint(false, 2236962);
          this.toggleButtonRenderer = (WidgetRenderer) ((Object) new LabeledToggleRenderer(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          discarded$0 = new RadialSelectorRenderer(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new MultiValueSliderRenderer(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
          var8 = new StatefulWidgetRenderer();
          var17.copyStyleTo(-68, var8);
          var8.replaceStateStyle(0, 105).setFrameSprites(ScorePopup.a(10066329, 7829367, (byte) 124, 15658734), -2147483648).setTextPaint(false, 1118481).setShadowPaint(-1, (byte) -69);
          var8.replaceStateStyle(4, 108).setPaintPreviousStyle(true, false).setFrameSprites(var5, -2147483648);
          this.textFieldRenderer = (WidgetRenderer) ((Object) var8);
          var9 = new RgbSprite[9];
          var9[4] = new RgbSprite(2, 1);
          var10 = new RgbSprite[9];
          var10[4] = new RgbSprite(1, 2);
          dupTemp$2 = var9[4];
          dupTemp$2.pixels = new int[]{6710886, 7829367};
          var10[4].pixels = new int[]{6710886, 7829367};
          var11 = new StatefulWidgetRenderer();
          var12 = new StatefulWidgetRenderer();
          var11.setStateFrameSprites(true, 0, var9);
          var12.setStateFrameSprites(true, 0, var10);
          var13 = new RgbSprite(7, 4);
          var13.pixels = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, param1, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          var14 = new StatefulWidgetRenderer(var4, true);
          var14.setAllIcons(-1553, var13.copy());
          var13.rotateClockwise();
          var14Lifetime1 = new StatefulWidgetRenderer(var4, true);
          var14Lifetime1.setAllIcons(-1553, var13.copy());
          var13.rotateClockwise();
          var14Lifetime2 = new StatefulWidgetRenderer(var4, true);
          var14Lifetime2.setAllIcons(-1553, var13.copy());
          var13.rotateClockwise();
          var19 = new StatefulWidgetRenderer(var4, true);
          var19.setAllIcons(-1553, var13);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "eh.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void decodeSpriteData(byte[] data, boolean obfuscationGuard) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        byte[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        PacketBuffer stackIn_30_2 = null;
        boolean stackIn_31_3;
        byte[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        PacketBuffer stackIn_40_2 = null;
        boolean stackIn_41_3 = false;
        int stackIn_43_0 = 0;
        int stackIn_44_1 = 0;
        byte[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        PacketBuffer stackIn_54_2 = null;
        boolean stackIn_55_3 = false;
        int stackIn_57_0 = 0;
        int stackIn_58_1 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int paletteSize = 0;
        int var4 = 0;
        int spriteWidth = 0;
        int spriteHeight = 0;
        int pixelCount = 0;
        byte[] indices = null;
        byte[] alpha = null;
        int hasNonopaqueAlpha = 0;
        int layoutFlags = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int clientBranchFlag = 0;
        PacketBuffer packet = null;
        PacketBuffer metadataPacket = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int offsetYIndex;
        int widthIndex;
        int heightIndex;
        int paletteIndex;
        int spriteIndex;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          packet = new PacketBuffer(data);
          metadataPacket = packet;
          metadataPacket.position = -2 + data.length;
          nl.decodedSpriteCount = metadataPacket.readUnsignedShort(65280);
          GameOverlayHelpers.decodedSpriteIndices = new byte[nl.decodedSpriteCount][];
          jh.decodedSpriteWidths = new int[nl.decodedSpriteCount];
          SocketConnector.decodedSpriteOffsetY = new int[nl.decodedSpriteCount];
          TextHotspotRegion.decodedSpriteHeights = new int[nl.decodedSpriteCount];
          tm.decodedSpriteHasAlpha = new boolean[nl.decodedSpriteCount];
          PopupWidgetLayer.decodedSpriteAlpha = new byte[nl.decodedSpriteCount][];
          ArrayWidgetGroup.decodedSpriteOffsetX = new int[nl.decodedSpriteCount];
          metadataPacket.position = -(8 * nl.decodedSpriteCount) + (-7 + data.length);
          cf.decodedCanvasWidth = metadataPacket.readUnsignedShort(65280);
          FullscreenFailureDialog.decodedCanvasHeight = metadataPacket.readUnsignedShort(65280);
          paletteSize = 1 + (metadataPacket.readUnsignedByte(255) & 255);
          for (var4 = 0; nl.decodedSpriteCount > var4; var4++) {
            ArrayWidgetGroup.decodedSpriteOffsetX[var4] = packet.readUnsignedShort(65280);
          }
          for (offsetYIndex = 0; nl.decodedSpriteCount > offsetYIndex; offsetYIndex++) {
            SocketConnector.decodedSpriteOffsetY[offsetYIndex] = metadataPacket.readUnsignedShort(65280);
          }
          for (widthIndex = 0; nl.decodedSpriteCount > widthIndex; widthIndex++) {
            jh.decodedSpriteWidths[widthIndex] = metadataPacket.readUnsignedShort(65280);
          }
          for (heightIndex = 0; heightIndex < nl.decodedSpriteCount; heightIndex++) {
            TextHotspotRegion.decodedSpriteHeights[heightIndex] = metadataPacket.readUnsignedShort(65280);
          }
          metadataPacket.position = -(3 * (paletteSize - 1)) + (-(nl.decodedSpriteCount * 8) + data.length - 7);
          qp.decodedSpritePalette = new int[paletteSize];
          for (paletteIndex = 1; paletteSize > paletteIndex; paletteIndex++) {
            qp.decodedSpritePalette[paletteIndex] = metadataPacket.readUnsignedMedium((byte) -34);
            if (0 == qp.decodedSpritePalette[paletteIndex]) {
              qp.decodedSpritePalette[paletteIndex] = 1;
            }
          }
          if (obfuscationGuard) {
            field_d = (String) null;
          }
          metadataPacket.position = 0;
          for (spriteIndex = 0; spriteIndex < nl.decodedSpriteCount; spriteIndex++) {
            spriteWidth = jh.decodedSpriteWidths[spriteIndex];
            spriteHeight = TextHotspotRegion.decodedSpriteHeights[spriteIndex];
            pixelCount = spriteWidth * spriteHeight;
            var20 = new byte[pixelCount];
            var18 = var20;
            indices = var18;
            GameOverlayHelpers.decodedSpriteIndices[spriteIndex] = var20;
            var21 = new byte[pixelCount];
            var19 = var21;
            alpha = var19;
            PopupWidgetLayer.decodedSpriteAlpha[spriteIndex] = var21;
            hasNonopaqueAlpha = 0;
            layoutFlags = metadataPacket.readUnsignedByte(255);
            if ((1 & layoutFlags) == 0) {
              for (var12 = 0; var12 < pixelCount; var12++) {
                indices[var12] = metadataPacket.readByte(true);
              }
              if ((2 & layoutFlags) != 0) {
                for (var12 = 0; var12 < pixelCount; var12++) {
                  stackIn_54_0 = alpha;
                  stackIn_54_1 = var12;
                  stackIn_54_2 = metadataPacket;
                  stackIn_55_3 = !(obfuscationGuard);
                  dupTemp$0 = ((PacketBuffer) (Object) stackIn_54_2).readByte(stackIn_55_3);
                  stackIn_54_0[stackIn_54_1] = dupTemp$0;
                  var13 = dupTemp$0;
                  stackIn_57_0 = hasNonopaqueAlpha;
                  if (var13 == -1) {
                    stackIn_58_1 = 0;
                  } else {
                    stackIn_58_1 = 1;
                  }
                  hasNonopaqueAlpha = stackIn_57_0 | stackIn_58_1;
                }
              }
            } else {
              for (var12 = 0; spriteWidth > var12; var12++) {
                for (var13 = 0; var13 < spriteHeight; var13++) {
                  stackIn_30_0 = indices;
                  stackIn_30_1 = var12 + var13 * spriteWidth;
                  stackIn_30_2 = metadataPacket;
                  stackIn_31_3 = !(obfuscationGuard);
                  stackIn_30_0[stackIn_30_1] = ((PacketBuffer) (Object) stackIn_30_2).readByte(stackIn_31_3);
                }
              }
              if ((2 & layoutFlags) != 0) {
                for (var12 = 0; var12 < spriteWidth; var12++) {
                  for (var13 = 0; spriteHeight > var13; var13++) {
                    stackIn_40_0 = alpha;
                    stackIn_40_1 = var12 + var13 * spriteWidth;
                    stackIn_40_2 = metadataPacket;
                    stackIn_41_3 = !(obfuscationGuard);
                    dupTemp$1 = ((PacketBuffer) (Object) stackIn_40_2).readByte(stackIn_41_3);
                    stackIn_40_0[stackIn_40_1] = dupTemp$1;
                    var14 = dupTemp$1;
                    stackIn_43_0 = hasNonopaqueAlpha;
                    if (-1 == var14) {
                      stackIn_44_1 = 0;
                    } else {
                      stackIn_44_1 = 1;
                    }
                    hasNonopaqueAlpha = stackIn_43_0 | stackIn_44_1;
                  }
                }
              }
            }
            tm.decodedSpriteHasAlpha[spriteIndex] = hasNonopaqueAlpha != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_63_0 = var2;
          stackIn_63_1 = new StringBuilder().append("eh.J(");
          if (data == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void writeChatFilters(boolean obfuscationGuard, int opcode) {
        BitPacketBuffer packet = TextFieldValidator.outgoingPackets;
        packet.writeCipheredOpcode(-13413, opcode);
        if (!obfuscationGuard) {
          WidgetTheme.isAsciiDigit('￪', (byte) -120);
        }
        packet.writeByte(-101, 2);
        packet.writeByte(-103, 4);
        packet.writeByte(-109, RegistrationResponseDialog.packChatFilters(248));
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = -9 % ((11 - param3) / 49);
        Rasterizer2D.drawLine(param1, param2, param5, param4, param0);
    }

    private final void a(int param0, String param1, int param2, int param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var5_int = this.font.measureText(param1);
          var6 = this.font.capHeight + this.font.descent;
          if (param0 != 8081) {
            return;
          }
          var7 = param3;
          if (Rasterizer2D.width < 6 + var7 + var5_int) {
            var7 = -6 + (Rasterizer2D.width - var5_int);
          }
          var8 = param2 - (this.font.capHeight - 32);
          if (6 + (var8 + var6) > Rasterizer2D.height) {
            var8 = -var6 + Rasterizer2D.height - 6;
          }
          Rasterizer2D.drawRectangle(var7, var8, var5_int + 6, var6 + 6, this.field_c);
          Rasterizer2D.fillRectangle(1 + var7, 1 + var8, var5_int + 4, var6 + 4, this.field_p);
          this.font.drawLeft(param1, var7 + 3, this.font.capHeight + var8 + 3, this.field_c, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("eh.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, String param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (this.field_s) {
            this.a(param3, 8947848, param1, param2);
          } else {
            this.a(8081, param3, param1, param2);
          }
          if (!param0) {
            this.field_j = -47;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("eh.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static boolean isAsciiDigit(char character, byte obfuscationGuard) {
        boolean stackIn_6_0 = false;
        if (obfuscationGuard <= 27) {
          return true;
        }
        stackIn_6_0 = (character >= 48) && (character <= 57);
        return stackIn_6_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8 = 115 / ((param5 + 18) / 63);
        Rasterizer2D.fillRectangleAlpha(param3, param0, param6, param4, param2, param1);
    }

    final static void a(boolean param0, boolean param1) {
        if (IntegerParsingHelpers.quickChatHelpDialog != null) {
          Rasterizer2D.darkenRectangle(Rasterizer2D.clipLeft, Rasterizer2D.clipTop, Rasterizer2D.clipRight - Rasterizer2D.clipLeft, Rasterizer2D.clipBottom - Rasterizer2D.clipTop);
          IntegerParsingHelpers.quickChatHelpDialog.drawRoot(true, param0);
        }
        if (!param1) {
          chatHistoryCategoryLimit = -26;
        }
    }

    final static java.awt.Frame openFullscreenFrame(int refreshRate, PlatformServices platform, int height, int obfuscationGuard, int bitDepth, int width) {
        int modeIndex = 0;
        Object unavailableResult = null;
        Object failedFrameResult = null;
        java.awt.Frame frameResult = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String platformSummary = null;
        RuntimeException caughtFailure = null;
        DisplayModeInfo[] modes = null;
        RuntimeException failure = null;
        int foundMode = 0;
        java.awt.Frame frame = null;
        int unusedClientFlag = 0;
        DisplayModeInfo[] availableModes = null;
        PlatformTask task = null;
        unusedClientFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (!platform.isFullscreenAvailable(-122)) {
            return null;
          }
          if (0 == bitDepth) {
            availableModes = PowerUpWarning.listDisplayModes(true, platform);
            modes = availableModes;
            if (modes == null) {
              unavailableResult = null;
              return (java.awt.Frame) (unavailableResult);
            }
            foundMode = 0;
            for (modeIndex = 0; availableModes.length > modeIndex; modeIndex++) {
              if (availableModes[modeIndex].width == width &&
                availableModes[modeIndex].height == height && ((refreshRate == 0 ||
                refreshRate == availableModes[modeIndex].refreshRate) &&
                (foundMode == 0 ||
                !(availableModes[modeIndex].bitDepth <= bitDepth)))) {
                bitDepth = availableModes[modeIndex].bitDepth;
                foundMode = 1;
              }
            }
            if (foundMode == 0) {
              return null;
            }
          }
          task = platform.requestEnterFullscreen(refreshRate, -35, height, bitDepth, width);
          while (0 == task.status) {
            BytePayloadRequest.sleepMillis(-126, 10L);
          }
          frame = (java.awt.Frame) (task.result);
          if (obfuscationGuard <= 80) {
            WidgetTheme.isAsciiDigit('4', (byte) 78);
          }
          if (frame == null) {
            return null;
          }
          if (task.status != 2) {
            frameResult = frame;
            return frameResult;
          }
          IntegerParsingHelpers.closeFullscreenFrame(platform, -20954, frame);
          failedFrameResult = null;
          return (java.awt.Frame) (failedFrameResult);
        } catch (java.lang.RuntimeException caughtException) {
          caughtFailure = caughtException;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("eh.G(").append(refreshRate).append(',');
          if (platform == null) {
            platformSummary = "null";
          } else {
            platformSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(platformSummary).append(',').append(height).append(',').append(obfuscationGuard).append(',').append(bitDepth).append(',').append(width).append(')').toString());
        }
    }

    private final void a(String param0, int param1, int param2, int param3) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        var15 = BrickABrac.field_J ? 1 : 0;
        try {
          var5_int = this.field_h + this.field_f;
          var6 = this.field_a + this.field_g;
          var7 = this.field_m;
          if (param1 != 8947848) {
            field_d = (String) null;
          }
          if (var7 == -1) {
            var7 = this.font.ascent + this.font.descent;
          }
          var8 = Rasterizer2D.width >> 2;
          var9 = this.font.measureText(param0);
          var10 = this.font.descent + this.font.ascent;
          var11 = 1;
          if (var9 > var8 ||
            param0.indexOf("<br>") != -1) {
            if (var9 <= var8) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = 2 * ((-1 + var9 % var8 + var13) / var13) + var8;
            }
            if (null == BirthDateValidator.field_j) {
              BirthDateValidator.field_j = new String[16];
            }
            var11Lifetime1 = this.font.wrapText(param0, new int[]{var12}, BirthDateValidator.field_j);
            var9 = 0;
            var10 = var10 + (-1 + var11Lifetime1) * var7;
            for (var13Lifetime2 = 0; var13Lifetime2 < var11Lifetime1; var13Lifetime2++) {
              var14 = this.font.measureText(BirthDateValidator.field_j[var13Lifetime2]);
              if (var14 > var9) {
                var9 = var14;
              }
            }
          }
          var12 = param3;
          if (var12 + var9 + var5_int > Rasterizer2D.width) {
            var12 = Rasterizer2D.width - var9 - var5_int;
          }
          var13Lifetime1 = -this.font.capHeight + (param2 + 32);
          if (var13Lifetime1 + var10 + var6 > Rasterizer2D.height) {
            var13Lifetime1 = -var6 - var10 + param2;
          }
          Rasterizer2D.drawRectangle(var12, var13Lifetime1, var5_int + var9, var10 + var6, this.field_j);
          Rasterizer2D.fillRectangle(var12 + 1, 1 + var13Lifetime1, var5_int + (var9 - 2), var10 + (var6 - 2), this.field_p);
          this.font.drawParagraph(param0, this.field_h + var12, var13Lifetime1 + this.field_g, var9, var10, this.field_c, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("eh.L(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public WidgetTheme() {
        this.field_s = true;
    }

    static {
        field_d = "Multiball: spilts your ball into eight other balls.";
    }
}
