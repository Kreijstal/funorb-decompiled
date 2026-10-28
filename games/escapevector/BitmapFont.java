/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class BitmapFont extends DualLinkNode {
    private int[] imageBaselines;
    int maxDescent;
    private static StringBuilder wrapBuffer;
    private byte[] kerning;
    int maxAscent;
    private int[] glyphOffsetY;
    int lineHeight;
    private int[] glyphWidth;
    private int[] advances;
    private int[] glyphHeight;
    private int[] glyphOffsetX;
    private static int currentShadowColor;
    private static int currentAlpha;
    private static int underlineColor;
    private static int defaultColor;
    private static int defaultShadowColor;
    private static int justificationRemainder;
    private IndexedSpriteState[] images;
    private static int defaultAlpha;
    int capHeight;
    private static int strikeColor;
    private static int justificationSpacingQ8;
    private static String[] wrappedLines;
    private static int currentColor;

    private final void decodeFontMetrics(byte[] data) {
        int var2;
        this.advances = new int[256];
        if (data.length == 257) {
          for (var2 = 0; var2 < this.advances.length; var2++) {
            this.advances[var2] = data[var2] & 255;
          }
          this.lineHeight = data[256] & 255;
        } else {
          var2 = 0;
          for (int var3_int = 0; var3_int < 256; var3_int++) {
            int incrementValue$6 = var2;
            var2++;
            this.advances[var3_int] = data[incrementValue$6] & 255;
          }
          int[] var14 = new int[256];
          int[] var10 = var14;
          int[] var3 = var10;
          int[] var17 = new int[256];
          int[] var13 = var17;
          int[] var4 = var13;
          for (int var5_int = 0; var5_int < 256; var5_int++) {
            int incrementValue$5 = var2;
            var2++;
            var3[var5_int] = data[incrementValue$5] & 255;
          }
          for (int var5_intLifetime1 = 0; var5_intLifetime1 < 256; var5_intLifetime1++) {
            int incrementValue$4 = var2;
            var2++;
            var4[var5_intLifetime1] = data[incrementValue$4] & 255;
          }
          byte[][] var15 = new byte[256][];
          byte[][] var11 = var15;
          byte[][] var5 = var11;
          for (int var6_int = 0; var6_int < 256; var6_int++) {
            byte[] array$2 = new byte[var14[var6_int]];
            var5[var6_int] = array$2;
            int var7 = 0;
            for (int var8 = 0; var8 < var15[var6_int].length; var8++) {
              int incrementValue$3 = var2;
              var2++;
              var7 = (byte)(var7 + data[incrementValue$3]);
              var15[var6_int][var8] = (byte)var7;
            }
          }
          byte[][] var16 = new byte[256][];
          byte[][] var12 = var16;
          byte[][] var6 = var12;
          for (int var7Lifetime1 = 0; var7Lifetime1 < 256; var7Lifetime1++) {
            byte[] array$0 = new byte[var14[var7Lifetime1]];
            var6[var7Lifetime1] = array$0;
            int var8Lifetime1 = 0;
            for (int var9 = 0; var9 < var16[var7Lifetime1].length; var9++) {
              int incrementValue$1 = var2;
              var2++;
              var8Lifetime1 = (byte)(var8Lifetime1 + data[incrementValue$1]);
              var16[var7Lifetime1][var9] = (byte)var8Lifetime1;
            }
          }
          this.kerning = new byte[65536];
          for (int var7Lifetime2 = 0; var7Lifetime2 < 256; var7Lifetime2++) {
            if (var7Lifetime2 != 32 &&
              var7Lifetime2 != 160) {
              for (int var8Lifetime2 = 0; var8Lifetime2 < 256; var8Lifetime2++) {
                if (var8Lifetime2 != 32 &&
                  var8Lifetime2 != 160) {
                  this.kerning[(var7Lifetime2 << 8) + var8Lifetime2] = (byte)BitmapFont.computePairKerning(var15, var16, var17, this.advances, var14, var7Lifetime2, var8Lifetime2);
                }
              }
            }
          }
          this.lineHeight = var17[32] + var14[32];
        }
    }

    private final void renderLine(String text, int x, int baselineY) {
        int stackIn_27_0 = 0;
        int var10 = 0;
        baselineY = baselineY - this.lineHeight;
        int var4 = -1;
        int var5 = 0;
        int var6 = text.length();
        for (int var7 = 0; var7 < var6; var7++) {
          boolean decompiledFrameRemainder0 = true;
          int var8 = text.charAt(var7);
          if (var8 != 60) {
            if (var8 == 62 &&
              var4 != -1) {
              String var9_ref_String = text.substring(var4 + 1, var7).toLowerCase();
              var4 = -1;
              if (var9_ref_String.equals("lt")) {
                var8 = 60;
              } else if (var9_ref_String.equals("gt")) {
                var8 = 62;
              } else if (var9_ref_String.equals("nbsp")) {
                var8 = 160;
              } else if (var9_ref_String.equals("shy")) {
                var8 = 173;
              } else if (var9_ref_String.equals("times")) {
                var8 = 215;
              } else if (var9_ref_String.equals("euro")) {
                var8 = 8364;
              } else if (var9_ref_String.equals("copy")) {
                var8 = 169;
              } else if (!var9_ref_String.equals("reg")) {
                if (!var9_ref_String.startsWith("img=")) {
                  this.applyTag(var9_ref_String);
                } else {
                  try {
                    CharSequence var13 = (CharSequence) ((Object) var9_ref_String.substring(4));
                    var10 = gn.a(16777215, var13);
                    IndexedSpriteState var11_ref_fi = this.images[var10];
                    if (this.imageBaselines == null) {
                      stackIn_27_0 = var11_ref_fi.field_h;
                    } else {
                      stackIn_27_0 = this.imageBaselines[var10];
                    }
                    int var12 = stackIn_27_0;
                    if (currentAlpha != 256) {
                      var11_ref_fi.drawAlpha(x, baselineY + this.lineHeight - var12, currentAlpha);
                    } else {
                      var11_ref_fi.draw(x, baselineY + this.lineHeight - var12);
                    }
                    x = x + var11_ref_fi.field_a;
                    var5 = 0;
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    Throwable decompiledCaughtException = decompiledCaughtParameter0;
                    Exception var10_ref_Exception = (Exception) (Object) decompiledCaughtException;
                  }
                }
                decompiledFrameRemainder0 = false;
              } else {
                var8 = 174;
              }
            }
            if (decompiledFrameRemainder0 &&
              var4 == -1) {
              var8 = (char)(hf.a(23, (char) var8) & 255);
              if (this.kerning != null &&
                var5 != 0) {
                x = x + this.kerning[(var5 << 8) + var8];
              }
              int var9 = this.glyphWidth[var8];
              var10 = this.glyphHeight[var8];
              int var11 = x;
              if (var8 == 32) {
                if (justificationSpacingQ8 > 0) {
                  justificationRemainder = justificationRemainder + justificationSpacingQ8;
                  x = x + (justificationRemainder >> 8);
                  justificationRemainder = justificationRemainder & 255;
                }
              } else if (currentAlpha != 256) {
                if (currentShadowColor != -1) {
                  this.drawGlyphAlpha(var8, x + this.glyphOffsetX[var8] + 1, baselineY + this.glyphOffsetY[var8] + 1, var9, var10, currentShadowColor, currentAlpha, true);
                }
                this.drawGlyphAlpha(var8, x + this.glyphOffsetX[var8], baselineY + this.glyphOffsetY[var8], var9, var10, currentColor, currentAlpha, false);
              } else {
                if (currentShadowColor != -1) {
                  this.drawGlyph(var8, x + this.glyphOffsetX[var8] + 1, baselineY + this.glyphOffsetY[var8] + 1, var9, var10, currentShadowColor, true);
                }
                this.drawGlyph(var8, x + this.glyphOffsetX[var8], baselineY + this.glyphOffsetY[var8], var9, var10, currentColor, false);
              }
              x = x + this.advances[var8];
              if (strikeColor != -1) {
                SoftwareRasterizer.drawHorizontalLine(var11, baselineY + (int)((double)this.lineHeight * 0.7), x - var11, strikeColor);
              }
              if (underlineColor != -1) {
                SoftwareRasterizer.drawHorizontalLine(var11, baselineY + this.lineHeight + 1, x - var11, underlineColor);
              }
              var5 = var8;
            }
          } else {
            var4 = var7;
          }
        }
    }

    final void drawCenteredAlpha(String text, int x, int baselineY, int color, int shadow, int alpha) {
        if (text == null) {
          return;
        }
        this.resetStyle(color, shadow, alpha);
        this.renderLine(text, x - this.stringWidth(text) / 2, baselineY);
    }

    private final void resetOpaqueStyle(int color, int shadow) {
        strikeColor = -1;
        underlineColor = -1;
        defaultShadowColor = shadow;
        currentShadowColor = shadow;
        defaultColor = color;
        currentColor = color;
        defaultAlpha = 256;
        currentAlpha = 256;
        justificationSpacingQ8 = 0;
        justificationRemainder = 0;
    }

    abstract void drawGlyphAlpha(int glyph, int x, int y, int width, int height, int color, int alpha, boolean shadow);

    final void drawLeft(String text, int x, int baselineY, int color, int shadow) {
        if (text == null) {
          return;
        }
        this.resetOpaqueStyle(color, shadow);
        this.renderLine(text, x, baselineY);
    }

    final int wrappedLineCount(String text, int width) {
        return this.wrapLines(text, new int[]{width}, wrappedLines);
    }

    private final void resetStyle(int color, int shadow, int alpha) {
        strikeColor = -1;
        underlineColor = -1;
        defaultShadowColor = shadow;
        currentShadowColor = shadow;
        defaultColor = color;
        currentColor = color;
        defaultAlpha = alpha;
        currentAlpha = alpha;
        justificationSpacingQ8 = 0;
        justificationRemainder = 0;
    }

    private final void prepareJustification(String text, int targetWidth) {
        int var3 = 0;
        boolean var4 = false;
        int var5 = text.length();
        for (int var6 = 0; var6 < var5; var6++) {
          int var7 = text.charAt(var6);
          if (var7 == 60) {
            var4 = true;
          } else if (var7 == 62) {
            var4 = false;
          } else if (!var4 &&
            var7 == 32) {
            var3++;
          }
        }
        if (var3 > 0) {
          justificationSpacingQ8 = (targetWidth - this.stringWidth(text) << 8) / var3;
        }
    }

    final void drawLeftAlpha(String text, int x, int baselineY, int color, int shadow, int alpha) {
        if (text == null) {
          return;
        }
        this.resetStyle(color, shadow, alpha);
        this.renderLine(text, x, baselineY);
    }

    final int drawParagraph(String text, int x, int y, int width, int height, int color, int shadow, int horizontalAlignment, int verticalAlignment, int lineSpacing) {
        return this.drawParagraphAlpha(text, x, y, width, height, color, shadow, 256, horizontalAlignment, verticalAlignment, lineSpacing);
    }

    final int stringWidth(String text) {
        if (text == null) {
          return 0;
        }
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        int var5 = text.length();
        for (int var6 = 0; var6 < var5; var6++) {
          boolean decompiledFrameRemainder0 = true;
          int var7 = text.charAt(var6);
          if (var7 != 60) {
            if (var7 == 62 &&
              var2 != -1) {
              String var8 = text.substring(var2 + 1, var6).toLowerCase();
              var2 = -1;
              if (var8.equals("lt")) {
                var7 = 60;
              } else if (var8.equals("gt")) {
                var7 = 62;
              } else if (var8.equals("nbsp")) {
                var7 = 160;
              } else if (var8.equals("shy")) {
                var7 = 173;
              } else if (var8.equals("times")) {
                var7 = 215;
              } else if (var8.equals("euro")) {
                var7 = 8364;
              } else if (var8.equals("copy")) {
                var7 = 169;
              } else if (!var8.equals("reg")) {
                if (var8.startsWith("img=")) {
                  try {
                    CharSequence var10 = (CharSequence) ((Object) var8.substring(4));
                    int var9_int = gn.a(16777215, var10);
                    var4 = var4 + this.images[var9_int].field_a;
                    var3 = 0;
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    Throwable decompiledCaughtException = decompiledCaughtParameter0;
                    Exception var9 = (Exception) (Object) decompiledCaughtException;
                  }
                }
                decompiledFrameRemainder0 = false;
              } else {
                var7 = 174;
              }
            }
            if (decompiledFrameRemainder0 &&
              var2 == -1) {
              var7 = (char)(hf.a(46, (char) var7) & 255);
              var4 = var4 + this.advances[var7];
              if (this.kerning != null &&
                var3 != 0) {
                var4 = var4 + this.kerning[(var3 << 8) + var7];
              }
              var3 = var7;
            }
          } else {
            var2 = var6;
          }
        }
        return var4;
    }

    final int paragraphHeight(String text, int width, int lineSpacing) {
        if (lineSpacing == 0) {
          lineSpacing = this.lineHeight;
        }
        int var4 = this.wrapLines(text, new int[]{width}, wrappedLines);
        int var5 = (var4 - 1) * lineSpacing;
        return this.maxAscent + var5 + this.maxDescent;
    }

    public static void releaseStatics() {
        wrapBuffer = null;
        wrappedLines = null;
    }

    abstract void drawGlyph(int glyph, int x, int y, int width, int height, int color, boolean shadow);

    final int drawParagraphAlpha(String text, int x, int y, int width, int height, int color, int shadow, int alpha, int horizontalAlignment, int verticalAlignment, int lineSpacing) {
        int var14;
        if (text == null) {
          return 0;
        }
        this.resetStyle(color, shadow, alpha);
        if (lineSpacing == 0) {
          lineSpacing = this.lineHeight;
        }
        int[] var12 = new int[]{width};
        if (height < this.maxAscent + this.maxDescent + lineSpacing &&
          height < lineSpacing + lineSpacing) {
          var12 = null;
        }
        int var13 = this.wrapLines(text, var12, wrappedLines);
        if (verticalAlignment == 3 &&
          var13 == 1) {
          verticalAlignment = 1;
        }
        if (verticalAlignment == 0) {
          var14 = y + this.maxAscent;
        } else if (verticalAlignment == 1) {
          var14 = y + this.maxAscent + (height - this.maxAscent - this.maxDescent - (var13 - 1) * lineSpacing) / 2;
        } else if (verticalAlignment != 2) {
          int var15 = (height - this.maxAscent - this.maxDescent - (var13 - 1) * lineSpacing) / (var13 + 1);
          if (var15 < 0) {
            var15 = 0;
          }
          var14 = y + this.maxAscent + var15;
          lineSpacing = lineSpacing + var15;
        } else {
          var14 = y + height - this.maxDescent - (var13 - 1) * lineSpacing;
        }
        for (int var15Lifetime1 = 0; var15Lifetime1 < var13; var15Lifetime1++) {
          if (horizontalAlignment == 0) {
            this.renderLine(wrappedLines[var15Lifetime1], x, var14);
            var14 = var14 + lineSpacing;
          } else if (horizontalAlignment == 1) {
            this.renderLine(wrappedLines[var15Lifetime1], x + (width - this.stringWidth(wrappedLines[var15Lifetime1])) / 2, var14);
            var14 = var14 + lineSpacing;
          } else if (horizontalAlignment != 2) {
            if (var15Lifetime1 != var13 - 1) {
              this.prepareJustification(wrappedLines[var15Lifetime1], width);
              this.renderLine(wrappedLines[var15Lifetime1], x, var14);
              justificationSpacingQ8 = 0;
            } else {
              this.renderLine(wrappedLines[var15Lifetime1], x, var14);
            }
            var14 = var14 + lineSpacing;
          } else {
            this.renderLine(wrappedLines[var15Lifetime1], x + width - this.stringWidth(wrappedLines[var15Lifetime1]), var14);
            var14 = var14 + lineSpacing;
          }
        }
        return var13;
    }

    final void drawCentered(String text, int x, int baselineY, int color, int shadow) {
        if (text == null) {
          return;
        }
        this.resetOpaqueStyle(color, shadow);
        this.renderLine(text, x - this.stringWidth(text) / 2, baselineY);
    }

    final int charAdvance(char character) {
        return this.advances[hf.a(40, character) & 255];
    }

    final void drawRightAlpha(String text, int x, int baselineY, int color, int shadow, int alpha) {
        if (text == null) {
          return;
        }
        this.resetStyle(color, shadow, alpha);
        this.renderLine(text, x - this.stringWidth(text), baselineY);
    }

    private final void applyTag(String tag) {
        try {
          if (tag.startsWith("col=")) {
            CharSequence var3 = (CharSequence) ((Object) tag.substring(4));
            currentColor = GameAppletShell.a(16, 27672, var3);
          } else if (tag.equals("/col")) {
            currentColor = defaultColor;
          } else if (tag.startsWith("trans=")) {
            CharSequence var4 = (CharSequence) ((Object) tag.substring(6));
            currentAlpha = gn.a(16777215, var4);
          } else if (tag.equals("/trans")) {
            currentAlpha = defaultAlpha;
          } else if (tag.startsWith("str=")) {
            CharSequence var5 = (CharSequence) ((Object) tag.substring(4));
            strikeColor = GameAppletShell.a(16, 27672, var5);
          } else if (tag.equals("str")) {
            strikeColor = 8388608;
          } else if (tag.equals("/str")) {
            strikeColor = -1;
          } else if (tag.startsWith("u=")) {
            CharSequence var6 = (CharSequence) ((Object) tag.substring(2));
            underlineColor = GameAppletShell.a(16, 27672, var6);
          } else if (tag.equals("u")) {
            underlineColor = 0;
          } else if (tag.equals("/u")) {
            underlineColor = -1;
          } else if (tag.startsWith("shad=")) {
            CharSequence var7 = (CharSequence) ((Object) tag.substring(5));
            currentShadowColor = GameAppletShell.a(16, 27672, var7);
          } else if (tag.equals("shad")) {
            currentShadowColor = 0;
          } else if (tag.equals("/shad")) {
            currentShadowColor = defaultShadowColor;
          } else if (tag.equals("br")) {
            this.resetStyle(defaultColor, defaultShadowColor, defaultAlpha);
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          Exception var2 = (Exception) (Object) decompiledCaughtException;
        }
    }

    final int wrapLines(String text, int[] widths, String[] lines) {
        int stackIn_70_2 = 0;
        Object var17 = null;
        if (text == null) {
          return 0;
        }
        ri.a(0, ' ', wrapBuffer, (byte) 56);
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int var7 = 0;
        int var8 = 0;
        int var9 = -1;
        int var10 = 0;
        int var11 = 0;
        int var12 = text.length();
        for (int var13 = 0; var13 < var12; var13++) {
          int var14 = text.charAt(var13);
          if (var14 != 60) {
            if (var14 == 62 &&
              var9 != -1) {
              String var15 = text.substring(var9 + 1, var13).toLowerCase();
              var9 = -1;
              StringBuilder discarded$0 = wrapBuffer.append('<');
              StringBuilder discarded$1 = wrapBuffer.append(var15);
              StringBuilder discarded$2 = wrapBuffer.append('>');
              if (var15.equals("br")) {
                lines[var11] = wrapBuffer.toString().substring(var5, wrapBuffer.length());
                var11++;
                var5 = wrapBuffer.length();
                var4 = 0;
                var6 = -1;
                var10 = 0;
              } else if (var15.equals("lt")) {
                var4 = var4 + this.charAdvance('<');
                if (this.kerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.kerning[(var10 << 8) + 60];
                }
                var10 = 60;
              } else if (var15.equals("gt")) {
                var4 = var4 + this.charAdvance('>');
                if (this.kerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.kerning[(var10 << 8) + 62];
                }
                var10 = 62;
              } else if (var15.equals("nbsp")) {
                var4 = var4 + this.charAdvance(' ');
                if (this.kerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.kerning[(var10 << 8) + 160];
                }
                var10 = 160;
              } else if (var15.equals("shy")) {
                var4 = var4 + this.charAdvance('­');
                if (this.kerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.kerning[(var10 << 8) + 173];
                }
                var10 = 173;
              } else if (var15.equals("times")) {
                var4 = var4 + this.charAdvance('×');
                if (this.kerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.kerning[(var10 << 8) + 215];
                }
                var10 = 215;
              } else if (var15.equals("euro")) {
                var4 = var4 + this.charAdvance('€');
                if (this.kerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.kerning[(var10 << 8) + 128];
                }
                var10 = 8364;
              } else if (var15.equals("copy")) {
                var4 = var4 + this.charAdvance('©');
                if (this.kerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.kerning[(var10 << 8) + 169];
                }
                var10 = 169;
              } else if (var15.equals("reg")) {
                var4 = var4 + this.charAdvance('®');
                if (this.kerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.kerning[(var10 << 8) + 174];
                }
                var10 = 174;
              } else if (var15.startsWith("img=")) {
                try {
                  CharSequence var18 = (CharSequence) ((Object) var15.substring(4));
                  int var16_int = gn.a(16777215, var18);
                  var4 = var4 + this.images[var16_int].field_a;
                  var10 = 0;
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  Throwable decompiledCaughtException = decompiledCaughtParameter0;
                  Exception var16 = (Exception) (Object) decompiledCaughtException;
                }
              }
              var14 = 0;
            }
            if (var9 == -1) {
              if (var14 != 0) {
                StringBuilder discarded$3 = wrapBuffer.append((char) var14);
                var14 = (char)(hf.a(99, (char) var14) & 255);
                var4 = var4 + this.advances[var14];
                if (this.kerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.kerning[(var10 << 8) + var14];
                }
                var10 = var14;
              }
              if (var14 == 32) {
                var6 = wrapBuffer.length();
                var7 = var4;
                var8 = 1;
              }
              if (widths != null) {
                int stackIn_69_0 = var4;
                int[] stackIn_69_1 = (int[]) (widths);
                if (var11 >= widths.length) {
                  stackIn_70_2 = widths.length - 1;
                } else {
                  stackIn_70_2 = var11;
                }
                if (stackIn_69_0 > stackIn_69_1[stackIn_70_2] &&
                  var6 >= 0) {
                  lines[var11] = wrapBuffer.toString().substring(var5, var6 - var8);
                  var11++;
                  var5 = var6;
                  var6 = -1;
                  var4 = var4 - var7;
                  var10 = 0;
                }
              }
              if (var14 == 45) {
                var6 = wrapBuffer.length();
                var7 = var4;
                var8 = 0;
              }
            }
          } else {
            var9 = var13;
          }
        }
        if (wrapBuffer.length() > var5) {
          lines[var11] = wrapBuffer.toString().substring(var5, wrapBuffer.length());
          var11++;
        }
        return var11;
    }

    private final static int computePairKerning(byte[][] param0, byte[][] param1, int[] param2, int[] param3, int[] param4, int param5, int param6) {
        int var7 = param2[param5];
        int var8 = var7 + param4[param5];
        int var9 = param2[param6];
        int var10 = var9 + param4[param6];
        int var11 = var7;
        if (var9 > var7) {
          var11 = var9;
        }
        int var12 = var8;
        if (var10 < var8) {
          var12 = var10;
        }
        int var13 = param3[param5];
        if (param3[param6] < var13) {
          var13 = param3[param6];
        }
        byte[] var14 = param1[param5];
        byte[] var15 = param0[param6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;
        for (int var18 = var11; var18 < var12; var18++) {
          int incrementValue$6 = var16;
          var16++;
          int incrementValue$7 = var17;
          var17++;
          int var19 = var14[incrementValue$6] + var15[incrementValue$7];
          if (var19 < var13) {
            var13 = var19;
          }
        }
        return -var13;
    }

    BitmapFont(byte[] metrics, int[] offsetX, int[] offsetY, int[] widths, int[] heights) {
        this.lineHeight = 0;
        this.glyphOffsetX = offsetX;
        this.glyphOffsetY = offsetY;
        this.glyphWidth = widths;
        this.glyphHeight = heights;
        this.decodeFontMetrics(metrics);
        int var6 = 2147483647;
        int var7 = -2147483648;
        for (int var8 = 0; var8 < 256; var8++) {
          if (this.glyphOffsetY[var8] < var6 &&
            this.glyphHeight[var8] != 0) {
            var6 = this.glyphOffsetY[var8];
          }
          if (this.glyphOffsetY[var8] + this.glyphHeight[var8] > var7) {
            var7 = this.glyphOffsetY[var8] + this.glyphHeight[var8];
          }
        }
        this.maxAscent = this.lineHeight - var6;
        this.maxDescent = var7 - this.lineHeight;
        this.capHeight = this.lineHeight - this.glyphOffsetY[88];
    }

    final void drawRight(String text, int x, int baselineY, int color, int shadow) {
        if (text == null) {
          return;
        }
        this.resetOpaqueStyle(color, shadow);
        this.renderLine(text, x - this.stringWidth(text), baselineY);
    }

    static {
        wrapBuffer = new StringBuilder(100);
        underlineColor = -1;
        justificationRemainder = 0;
        currentShadowColor = -1;
        strikeColor = -1;
        defaultShadowColor = -1;
        defaultAlpha = 256;
        wrappedLines = new String[100];
        defaultColor = 0;
        currentColor = 0;
        justificationSpacingQ8 = 0;
        currentAlpha = 256;
    }
}
