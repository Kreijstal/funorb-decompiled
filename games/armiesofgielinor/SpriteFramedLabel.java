/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteFramedLabel {
    private int y;
    private int[] colours;
    private boolean highlighted;
    private BinaryBitmapFont font;
    private int height;
    private String text;
    private RgbSprite[] frameSprites;
    static int field_g;
    private int width;
    private int x;

    final void drawLabel(int obfuscationGuard) {
        SoftwareRaster.f(this.x, this.y, this.width, this.height, 7829367);
        ReportAbuseDialog.drawNineSlice(this.frameSprites, this.height, this.x, (byte) -47, this.y, this.width);
        if (obfuscationGuard >= 24) {
          this.drawText(-11727);
          return;
        }
        this.frameSprites = (RgbSprite[]) null;
        this.drawText(-11727);
    }

    final int getHeight(byte obfuscationGuard) {
        if (obfuscationGuard >= -10) {
          return -87;
        }
        return this.height;
    }

    final static String a(String param0, char param1, int param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String var12 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = param0.length();
          var5 = param3.length();
          var6 = var4_int;
          var7 = var5 - 1;
          if (param2 != 3) {
            var12 = (String) null;
            SpriteFramedLabel.a((String) null, '(', -2, (String) null);
          }
          if (0 != var7) {
            var8_int = 0;
            while (true) {
              var8_int = param0.indexOf((int) param1, var8_int);
              if (var8_int < 0) {
                break;
              }
              var6 = var6 + var7;
              var8_int++;
            }
          }
          var8 = new StringBuilder(var6);
          var9 = 0;
          while (true) {
            var10 = param0.indexOf((int) param1, var9);
            if (var10 < 0) {
              discarded$0 = var8.append(param0.substring(var9));
              stackIn_12_0 = var8.toString();
              return stackIn_12_0;
            }
            discarded$1 = var8.append(param0.substring(var9, var10));
            var9 = 1 + var10;
            discarded$2 = var8.append(param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ia.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final void resetHighlight(int obfuscationGuard) {
        this.highlighted = false;
        if (obfuscationGuard < 12) {
          String var3 = (String) null;
          this.setText((byte) -122, (String) null);
        }
    }

    private final void drawText(int obfuscationGuard) {
        int textColour = 0;
        int leftBorderWidth = this.frameSprites[3].canvasWidth;
        int spaceWidth = this.font.characterWidth(' ');
        int textX = spaceWidth + (leftBorderWidth + this.x);
        int topBorderHeight = this.frameSprites[1].canvasHeight;
        int topPadding = 2;
        int fontAscent = this.font.maxAscent;
        int baselineY = topBorderHeight + this.y - (-topPadding - fontAscent);
        if (obfuscationGuard == -11727) {
          textColour = this.colours[0];
          if (this.highlighted) {
            textColour = this.colours[1];
          }
          this.font.drawText(this.text, textX, baselineY, textColour, -1);
          return;
        }
    }

    final boolean containsPointer(int pointerY, int obfuscationGuard, int pointerX) {
        if (obfuscationGuard == 0) {
          return ChatMessage.a(pointerY, this.x, this.y, pointerX, this.width, (byte) 94, this.height);
        }
        this.y = 33;
        return ChatMessage.a(pointerY, this.x, this.y, pointerX, this.width, (byte) 94, this.height);
    }

    private final void setText(byte obfuscationGuard, String text) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.text = text;
          if (obfuscationGuard != 20) {
            this.resetHighlight(99);
          }
          this.measureLabel(-94);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ia.F(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void setPosition(int y, byte obfuscationGuard, int x) {
        if (obfuscationGuard >= 45) {
          this.y = y;
          this.x = x;
          return;
        }
        this.setPosition(-31, (byte) 34, -5);
        this.y = y;
        this.x = x;
    }

    final int getWidth(int obfuscationGuard) {
        if (obfuscationGuard == -29408) {
          return this.width;
        }
        String var3 = (String) null;
        SpriteFramedLabel.a((String) null, 'd', -85, (String) null);
        return this.width;
    }

    private final void measureLabel(int obfuscationGuard) {
        int sideBorderWidth = 0;
        int spacePadding = 0;
        int textWidth = 0;
        int verticalBorderHeight = 0;
        int verticalPadding = 0;
        int fontHeight = 0;
        int alternateSideBorderWidth;
        int alternateSpacePadding;
        int alternateTextWidth;
        int alternateVerticalBorderHeight;
        int alternateVerticalPadding;
        int alternateFontHeight;
        if (obfuscationGuard < -92) {
          sideBorderWidth = this.frameSprites[5].canvasWidth + this.frameSprites[3].canvasWidth;
          spacePadding = this.font.characterWidth(' ') << 1;
          textWidth = this.font.textWidth(this.text);
          this.width = spacePadding + sideBorderWidth + textWidth;
          verticalBorderHeight = this.frameSprites[1].canvasHeight + this.frameSprites[7].canvasHeight;
          verticalPadding = 4;
          fontHeight = this.font.maxDescent + this.font.maxAscent;
          this.height = verticalPadding + (verticalBorderHeight + fontHeight);
          return;
        }
        this.setPosition(94, (byte) 54, -110);
        alternateSideBorderWidth = this.frameSprites[5].canvasWidth + this.frameSprites[3].canvasWidth;
        alternateSpacePadding = this.font.characterWidth(' ') << 1;
        alternateTextWidth = this.font.textWidth(this.text);
        this.width = alternateSpacePadding + alternateSideBorderWidth + alternateTextWidth;
        alternateVerticalBorderHeight = this.frameSprites[1].canvasHeight + this.frameSprites[7].canvasHeight;
        alternateVerticalPadding = 4;
        alternateFontHeight = this.font.maxDescent + this.font.maxAscent;
        this.height = alternateVerticalPadding + (alternateVerticalBorderHeight + alternateFontHeight);
    }

    SpriteFramedLabel(RgbSprite[] frameSprites, BinaryBitmapFont font, int[] colours, String text, int x, int y) {
        RuntimeException var7 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.font = font;
          this.frameSprites = frameSprites;
          this.colours = colours;
          this.setPosition(y, (byte) 112, x);
          this.setText((byte) 20, text);
          this.resetHighlight(15);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("ia.<init>(");
          if (frameSprites == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (font == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (colours == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (text == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(x).append(',').append(y).append(')').toString());
        }
    }

    static {
    }
}
