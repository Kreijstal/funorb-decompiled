/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PopupWidgetLayer extends WidgetLayer {
    private int startHeight;
    static String field_U;
    private int startWidth;
    private int resizeTick;
    private int targetWidth;
    private int targetHeight;
    private int resizeDuration;
    static LoginCredentialKind alternateNumericLoginKind;
    static byte[][] decodedSpriteAlpha;
    static WidgetTheme widgetTheme;
    static String field_V;
    static long field_ab;
    static ck field_P;

    void finishTransition(int obfuscationGuard) {
        if (0 >= this.resizeDuration) {
          return;
        }
        if (obfuscationGuard != 20) {
          decodedSpriteAlpha = (byte[][]) null;
        }
        this.setCenteredSize(true, this.targetHeight, this.targetWidth);
        this.resizeDuration = 0;
        this.onResizeCompleted(-13717);
    }

    boolean updateOpacityAndCheckHidden(int obfuscationGuard) {
        this.finishTransition(20);
        if (obfuscationGuard > -22) {
          this.targetWidth = 2;
        }
        return super.updateOpacityAndCheckHidden(-81);
    }

    void onResizeCompleted(int obfuscationGuard) {
        if (obfuscationGuard != -13717) {
          this.startHeight = -40;
        }
    }

    PopupWidgetLayer(WidgetLayerStack layerStack, int width, int height) {
        super(layerStack, width, height);
        this.resizeTick = 0;
        this.resizeDuration = 0;
    }

    final void resizeTo(byte obfuscationGuard, int duration, int targetHeight, int targetWidth) {
        if (duration <= 0) {
          this.setCenteredSize(true, targetHeight, targetWidth);
          return;
        }
        this.targetHeight = targetHeight;
        if (obfuscationGuard != -116) {
          this.updateOpacityAndCheckHidden(97);
        }
        this.startHeight = this.height;
        this.resizeDuration = duration;
        this.targetWidth = targetWidth;
        this.resizeTick = 0;
        this.startWidth = this.width;
    }

    final static String readCompressedString(int maximumLength, byte obfuscationGuard, PacketBuffer packet) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        PacketBuffer var6 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            if (obfuscationGuard < 36) {
              var6 = (PacketBuffer) null;
              PopupWidgetLayer.readCompressedString(61, (byte) 3, (PacketBuffer) null);
            }
            var3_int = packet.readUnsignedSmart(-32768);
            if (maximumLength < var3_int) {
              var3_int = maximumLength;
            }
            var4 = new byte[var3_int];
            packet.position = packet.position + QuickChatCategoryRegistry.textHuffman.decompress(var3_int, 0, packet.position, true, var4, packet.data);
            var5 = df.decodeCp1252(var3_int, -110, var4, 0);
            stackIn_5_0 = var5;
            return stackIn_5_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_7_0 = "Cabbage";
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("bj.UB(").append(maximumLength).append(',').append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    boolean tickLayerAndCheckHidden(int obfuscationGuard) {
        int nextWidth = 0;
        int nextHeight = 0;
        int nextTick = 0;
        int easeDenominator = 0;
        int easeNumerator = 0;
        if (this.resizeDuration > 0) {
          nextWidth = this.targetWidth;
          nextHeight = this.targetHeight;
          nextTick = this.resizeTick + 1;
          this.resizeTick = this.resizeTick + 1;
          if (nextTick < this.resizeDuration) {
            easeNumerator = this.resizeTick * (2 * this.resizeDuration - this.resizeTick);
            easeDenominator = this.resizeDuration * this.resizeDuration;
            nextWidth = easeNumerator * (this.targetWidth - this.startWidth) / easeDenominator + this.startWidth;
            nextHeight = (this.targetHeight - this.startHeight) * easeNumerator / easeDenominator + this.startHeight;
          } else {
            this.resizeDuration = 0;
            this.onResizeCompleted(-13717);
          }
          this.setCenteredSize(true, nextHeight, nextWidth);
        }
        if (obfuscationGuard != 0) {
          this.tickLayerAndCheckHidden(109);
        }
        return super.tickLayerAndCheckHidden(0);
    }

    void paintLayerFrame(int x, int obfuscationGuard, int y) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = BrickABrac.field_J ? 1 : 0;
        Rasterizer2D.fillVerticalGradient(x + 6, y + 35, -12 + this.width, this.height - 40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = y;
        while (var4 > var7) {
          if (Rasterizer2D.clipTop <= var8 &&
            var8 < Rasterizer2D.clipBottom) {
            var9 = var7 * (-var5 + var6) / var4 + var5;
            var10 = 0;
            var11 = this.width;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (20 - var10) * (-var10 + 20) + (20 - var7) * (-var7 + 20);
                if (462 >= var12) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = (462 - var12) * var9 / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  Rasterizer2D.pixels[var10 + var8 * Rasterizer2D.width + x] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = var13Lifetime1 * var13Lifetime1 + (-var7 + 20) * (20 - var7);
                if (var14 <= 462) {
                  if (var14 >= 420) {
                    var15 = var9 * (-var14 + 462) / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    Rasterizer2D.pixels[var11 + (Rasterizer2D.width * var8 + x)] = var15;
                  } else {
                    var12Lifetime1 = var11 + 1;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            Rasterizer2D.drawHorizontalLine(var10 + x, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        var5Lifetime1 = 194;
        var4Lifetime1 = 22;
        var6Lifetime1 = 169;
        var7Lifetime1 = 0;
        var8Lifetime1 = y + 35;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = var7Lifetime1 * (-var5Lifetime1 + var6Lifetime1) / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          Rasterizer2D.drawHorizontalLine(x, var8Lifetime1, 6, var9Lifetime1);
          Rasterizer2D.drawHorizontalLine(this.width + x - 6, var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        if (obfuscationGuard != 274) {
          field_P = (ck) null;
        }
        MusicVoice.field_n.drawTransparent(x + this.width - 90, 10 + y);
        fq.a(this.width - 10, 35 + y, obfuscationGuard ^ 1013, ValidationMessageWidget.field_W, 5 + x);
        fq.a(this.width, -22 + y + this.height, obfuscationGuard + 469, GameplayAudioEvent.field_l, x);
        var5Lifetime2 = 169;
        var4Lifetime2 = this.height - 79;
        var6Lifetime2 = 127;
        var7Lifetime2 = 0;
        var8Lifetime2 = y + 57;
        while (var4Lifetime2 > var7Lifetime2) {
          var9Lifetime2 = var5Lifetime2 + var7Lifetime2 * (-var5Lifetime2 + var6Lifetime2) / var4Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          Rasterizer2D.drawHorizontalLine(x, var8Lifetime2, 6, var9Lifetime2);
          Rasterizer2D.drawHorizontalLine(x + this.width - 6, var8Lifetime2, 6, var9Lifetime2);
          var8Lifetime2++;
          var7Lifetime2++;
        }
    }

    public static void i(int param0) {
        field_P = null;
        if (param0 <= 110) {
          return;
        }
        field_V = null;
        widgetTheme = null;
        decodedSpriteAlpha = (byte[][]) null;
        field_U = null;
        alternateNumericLoginKind = null;
    }

    static {
        field_U = "The hearts above are your lives.<br>Outside of the tutorial level, you will lose one life if all your balls fall out of play.";
        alternateNumericLoginKind = new LoginCredentialKind(0);
        field_V = "Hide chat";
    }
}
