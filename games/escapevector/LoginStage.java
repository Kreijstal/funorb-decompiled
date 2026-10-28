/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginStage {
    static double field_c;
    static int field_b;
    static boolean field_a;

    final static void pushRasterState(int guard) {
        RasterSnapshot var1 = (RasterSnapshot) (TextWidgetPainter.field_d.removeLast(-8980));
        if (var1 == null) {
          var1 = new RasterSnapshot();
        }
        var1.a(SoftwareRasterizer.clipBottom, (byte) 29, SoftwareRasterizer.clipTop, SoftwareRasterizer.clipRight, SoftwareRasterizer.clipLeft, SoftwareRasterizer.height, SoftwareRasterizer.pixels, SoftwareRasterizer.width);
        int var2 = 28 % ((guard + 72) / 49);
        GradientOutlineTextPainter.field_q.addLast(-12328, var1);
    }

    final static String formatPacketDiagnostic(byte guard) {
        int var5 = EscapeVector.obfuscationControl;
        String var6 = "(" + NetworkGameClient.field_q + " " + ArchiveIndex.field_t + " " + LoginPromptSupport.field_b + ") " + LegacyStyleNode.field_v;
        String var1 = var6;
        if (EmailSyntaxValidator.field_r > 0) {
          var1 = var6 + ":";
          for (int var2 = 0; var2 < EmailSyntaxValidator.field_r; var2++) {
            String var7 = var1 + ' ';
            var1 = var7;
            int var3 = 255 & QuickChatDynamicCommand.incomingPackets.payload[var2];
            int var4 = var3 >> 4;
            if (var4 < 10) {
              var4 += 48;
            } else {
              var4 += 55;
            }
            var3 = var3 & 15;
            String var8 = var7 + (char)var4;
            if (var3 >= 10) {
              var3 += 55;
            } else {
              var3 += 48;
            }
            var1 = var8 + (char)var3;
          }
        }
        int var2Lifetime1 = 96 / ((-24 - guard) / 38);
        return var1;
    }

    final boolean isResponseStage(byte guard) {
        if (guard < 62) {
          return false;
        }
        boolean stackIn_8_0 = (this == LoginHandshakeState.keyExchangeStage) || (ClientException.field_c == this) || (this == ThreeSliceButtonPainter.field_t);
        return stackIn_8_0;
    }

    final static byte[] loadLevelBytes(ResourceArchive archive, int[] key, int level, int mode, ResourceArchive memberArchive, byte guard) {
        ResourceArchive stackIn_10_0 = null;
        String stackIn_21_2 = null;
        String stackIn_24_2 = null;
        String stackIn_27_2 = null;
        try {
          if (guard < 92) {
            field_b = -32;
          }
          int var6_int = SpriteFactorySupport.levelCount(false, mode);
          if (level < 0) {
            return null;
          }
          if (var6_int <= level) {
            Object stackIn_6_0 = null;
            return (byte[]) (stackIn_6_0);
          }
          int var7 = GzipDecoder.field_e[mode];
          if (var7 != 2) {
            stackIn_10_0 = (ResourceArchive) (archive);
          } else {
            stackIn_10_0 = (ResourceArchive) (memberArchive);
          }
          ResourceArchive var8 = stackIn_10_0;
          if (var8 == null) {
            return null;
          }
          String var12 = DisplayModeInfo.field_e[mode].toLowerCase();
          String var11 = ByteStorage.levelNamesByMode[mode][level].toLowerCase() + ".lvl";
          String var13 = SpaceCompactionSupport.compactSpaces((byte) 72, var11);
          String var15 = var12 + "_" + var13;
          String var14 = "";
          if (key == null) {
            byte[] stackIn_17_0 = var8.getNamedFile(-4, var15, var14);
            return stackIn_17_0;
          }
          byte[] stackIn_15_0 = var8.getNamedFileWithKey((byte) -73, var14, var15, key);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var6;
          StringBuilder stackIn_20_1 = new StringBuilder().append("hf.D(");
          if (archive == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (key == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          StringBuilder stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(level).append(',').append(mode).append(',');
          if (memberArchive == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(guard).append(')').toString());
        }
    }

    final static Sprite[] buildRgbSpritesFromSheet(int guard) {
        int var7 = EscapeVector.obfuscationControl;
        if (guard < 63) {
          field_c = -0.8853374871854307;
        }
        Sprite[] var1 = new Sprite[ArchiveLoadTask.spriteCount];
        for (int var2 = 0; var2 < ArchiveLoadTask.spriteCount; var2++) {
          int var3 = SavedDataQuerySupport.spriteHeights[var2] * SpriteLoadTask.spriteWidths[var2];
          byte[] var4 = AnimatedPathMarker.spriteIndices[var2];
          int[] var5 = new int[var3];
          for (int var6 = 0; var6 < var3; var6++) {
            var5[var6] = ArchiveLoadTask.spritePalette[SpriteCheckboxPainter.bitwiseAnd((int) var4[var6], 255)];
          }
          var1[var2] = new Sprite(on.spriteSheetWidth, DelegatingCanvas.spriteSheetHeight, ModeProgress.spriteOffsetXs[var2], ChatMessage.spriteOffsetYs[var2], SpriteLoadTask.spriteWidths[var2], SavedDataQuerySupport.spriteHeights[var2], var5);
        }
        SpriteDecodeSupport.releaseSpriteSheet(false);
        return var1;
    }

    final static byte encodeCp1252Character(int guard, char character) {
        int var2;
        int var3 = EscapeVector.obfuscationControl;
        if (guard <= 22) {
          return (byte) -88;
        }
        {
          if ((character <= 0 ||
            character >= 128) &&
            (character < 160 ||
            character > 255)) {
            if (8364 == character) {
              var2 = -128;
            } else if (character == 8218) {
              var2 = -126;
            } else if (character == 402) {
              var2 = -125;
            } else if (8222 == character) {
              var2 = -124;
            } else if (character == 8230) {
              var2 = -123;
            } else if (character == 8224) {
              var2 = -122;
            } else if (8225 == character) {
              var2 = -121;
            } else if (710 == character) {
              var2 = -120;
            } else if (character == 8240) {
              var2 = -119;
            } else if (character == 352) {
              var2 = -118;
            } else if (character == 8249) {
              var2 = -117;
            } else if (character == 338) {
              var2 = -116;
            } else if (character == 381) {
              var2 = -114;
            } else if (8216 == character) {
              var2 = -111;
            } else if (character == 8217) {
              var2 = -110;
            } else if (character == 8220) {
              var2 = -109;
            } else if (8221 == character) {
              var2 = -108;
            } else if (character == 8226) {
              var2 = -107;
            } else if (8211 == character) {
              var2 = -106;
            } else if (8212 == character) {
              var2 = -105;
            } else if (character == 732) {
              var2 = -104;
            } else if (character == 8482) {
              var2 = -103;
            } else if (character == 353) {
              var2 = -102;
            } else if (8250 == character) {
              var2 = -101;
            } else if (339 == character) {
              var2 = -100;
            } else if (character == 382) {
              var2 = -98;
            } else if (character != 376) {
              var2 = 63;
            } else {
              var2 = -97;
            }
          } else {
            var2 = (byte)character;
          }
        }
        return (byte) var2;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_c = Math.atan2(1.0, 0.0);
    }
}
