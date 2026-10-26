/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class BitmapFont extends DualLinkNode {
    private int[] inlineImageBaselineOffsets;
    private int[] glyphAdvances;
    int maxDescent;
    int capitalXAscent;
    int lineAdvance;
    private int[] glyphHeights;
    private int[] glyphXOffsets;
    int maxAscent;
    private int[] glyphYOffsets;
    private int[] glyphWidths;
    private byte[] pairKerning;
    private IndexedSpriteState[] inlineImages;
    private static StringBuilder wrappingBuffer;
    private static int strikethroughColor;
    private static int spaceExpansionQ8;
    private static int defaultTextColor;
    private static int currentTextColor;
    private static String[] wrappedLines;
    private static int currentAlpha256;
    private static int currentShadowColor;
    private static int defaultAlpha256;
    private static int justificationRemainderQ8;
    private static int defaultShadowColor;
    private static int underlineColor;

    abstract void drawGlyph(int glyphIndex, int x, int y, int width, int height, int color, boolean shadowPass);

    final int drawParagraph(String text, int left, int top, int width, int height, int textColor, int shadowColor, int horizontalAlignment, int verticalAlignment, int lineSpacing) {
        return this.drawParagraphAlpha(text, left, top, width, height, textColor, shadowColor, 256, horizontalAlignment, verticalAlignment, lineSpacing);
    }

    final int measureCharacterAdvance(char character) {
        return this.glyphAdvances[ae.a(character, -113) & 255];
    }

    public static void releaseTextScratchStorage() {
        wrappingBuffer = null;
        wrappedLines = null;
    }

    private final void applyStyleTag(String tag) {
        try {
          if (tag.startsWith("col=")) {
            CharSequence var3 = (CharSequence) ((Object) tag.substring(4));
            currentTextColor = np.a(var3, 4, 16);
          } else if (tag.equals("/col")) {
            currentTextColor = defaultTextColor;
          } else if (tag.startsWith("trans=")) {
            CharSequence var4 = (CharSequence) ((Object) tag.substring(6));
            currentAlpha256 = td.a(var4, (byte) 38);
          } else if (tag.equals("/trans")) {
            currentAlpha256 = defaultAlpha256;
          } else if (tag.startsWith("str=")) {
            CharSequence var5 = (CharSequence) ((Object) tag.substring(4));
            strikethroughColor = np.a(var5, 4, 16);
          } else if (tag.equals("str")) {
            strikethroughColor = 8388608;
          } else if (tag.equals("/str")) {
            strikethroughColor = -1;
          } else if (tag.startsWith("u=")) {
            CharSequence var6 = (CharSequence) ((Object) tag.substring(2));
            underlineColor = np.a(var6, 4, 16);
          } else if (tag.equals("u")) {
            underlineColor = 0;
          } else if (tag.equals("/u")) {
            underlineColor = -1;
          } else if (tag.startsWith("shad=")) {
            CharSequence var7 = (CharSequence) ((Object) tag.substring(5));
            currentShadowColor = np.a(var7, 4, 16);
          } else if (tag.equals("shad")) {
            currentShadowColor = 0;
          } else if (tag.equals("/shad")) {
            currentShadowColor = defaultShadowColor;
          } else if (tag.equals("br")) {
            this.resetTextStyle(defaultTextColor, defaultShadowColor, defaultAlpha256);
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          Exception var2 = (Exception) (Object) decompiledCaughtException;
        }
    }

    abstract void drawGlyphAlpha(int glyphIndex, int x, int y, int width, int height, int color, int alpha256, boolean shadowPass);

    private final void resetOpaqueTextStyle(int textColor, int shadowColor) {
        strikethroughColor = -1;
        underlineColor = -1;
        defaultShadowColor = shadowColor;
        currentShadowColor = shadowColor;
        defaultTextColor = textColor;
        currentTextColor = textColor;
        defaultAlpha256 = 256;
        currentAlpha256 = 256;
        spaceExpansionQ8 = 0;
        justificationRemainderQ8 = 0;
    }

    final int drawParagraphAlpha(String text, int left, int top, int width, int height, int textColor, int shadowColor, int alpha256, int horizontalAlignment, int verticalAlignment, int lineSpacing) {
        int var14;
        if (text == null) {
          return 0;
        }
        this.resetTextStyle(textColor, shadowColor, alpha256);
        if (lineSpacing == 0) {
          lineSpacing = this.lineAdvance;
        }
        int[] var12 = new int[]{width};
        if (height < this.maxAscent + this.maxDescent + lineSpacing &&
          height < lineSpacing + lineSpacing) {
          var12 = null;
        }
        int var13 = this.wrapText(text, var12, wrappedLines);
        if (verticalAlignment == 3 &&
          var13 == 1) {
          verticalAlignment = 1;
        }
        if (verticalAlignment == 0) {
          var14 = top + this.maxAscent;
        } else if (verticalAlignment == 1) {
          var14 = top + this.maxAscent + (height - this.maxAscent - this.maxDescent - (var13 - 1) * lineSpacing) / 2;
        } else if (verticalAlignment != 2) {
          int var15 = (height - this.maxAscent - this.maxDescent - (var13 - 1) * lineSpacing) / (var13 + 1);
          if (var15 < 0) {
            var15 = 0;
          }
          var14 = top + this.maxAscent + var15;
          lineSpacing = lineSpacing + var15;
        } else {
          var14 = top + height - this.maxDescent - (var13 - 1) * lineSpacing;
        }
        for (int var15Lifetime1 = 0; var15Lifetime1 < var13; var15Lifetime1++) {
          if (horizontalAlignment == 0) {
            this.drawStyledText(wrappedLines[var15Lifetime1], left, var14);
            var14 = var14 + lineSpacing;
          } else if (horizontalAlignment == 1) {
            this.drawStyledText(wrappedLines[var15Lifetime1], left + (width - this.measureTextWidth(wrappedLines[var15Lifetime1])) / 2, var14);
            var14 = var14 + lineSpacing;
          } else if (horizontalAlignment != 2) {
            if (var15Lifetime1 != var13 - 1) {
              this.prepareJustification(wrappedLines[var15Lifetime1], width);
              this.drawStyledText(wrappedLines[var15Lifetime1], left, var14);
              spaceExpansionQ8 = 0;
            } else {
              this.drawStyledText(wrappedLines[var15Lifetime1], left, var14);
            }
            var14 = var14 + lineSpacing;
          } else {
            this.drawStyledText(wrappedLines[var15Lifetime1], left + width - this.measureTextWidth(wrappedLines[var15Lifetime1]), var14);
            var14 = var14 + lineSpacing;
          }
        }
        return var13;
    }

    private final void decodeFontMetrics(byte[] encodedMetrics) {
        int var2;
        this.glyphAdvances = new int[256];
        if (encodedMetrics.length == 257) {
          for (var2 = 0; var2 < this.glyphAdvances.length; var2++) {
            this.glyphAdvances[var2] = encodedMetrics[var2] & 255;
          }
          this.lineAdvance = encodedMetrics[256] & 255;
        } else {
          var2 = 0;
          for (int var3_int = 0; var3_int < 256; var3_int++) {
            int incrementValue$6 = var2;
            var2++;
            this.glyphAdvances[var3_int] = encodedMetrics[incrementValue$6] & 255;
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
            var3[var5_int] = encodedMetrics[incrementValue$5] & 255;
          }
          for (int var5_intLifetime1 = 0; var5_intLifetime1 < 256; var5_intLifetime1++) {
            int incrementValue$4 = var2;
            var2++;
            var4[var5_intLifetime1] = encodedMetrics[incrementValue$4] & 255;
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
              var7 = (byte)(var7 + encodedMetrics[incrementValue$3]);
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
              var8Lifetime1 = (byte)(var8Lifetime1 + encodedMetrics[incrementValue$1]);
              var16[var7Lifetime1][var9] = (byte)var8Lifetime1;
            }
          }
          this.pairKerning = new byte[65536];
          for (int var7Lifetime2 = 0; var7Lifetime2 < 256; var7Lifetime2++) {
            if (var7Lifetime2 != 32 &&
              var7Lifetime2 != 160) {
              for (int var8Lifetime2 = 0; var8Lifetime2 < 256; var8Lifetime2++) {
                if (var8Lifetime2 != 32 &&
                  var8Lifetime2 != 160) {
                  this.pairKerning[(var7Lifetime2 << 8) + var8Lifetime2] = (byte)BitmapFont.computePairKerning(var15, var16, var17, this.glyphAdvances, var14, var7Lifetime2, var8Lifetime2);
                }
              }
            }
          }
          this.lineAdvance = var17[32] + var14[32];
        }
    }

    final void drawText(String text, int leftX, int baselineY, int textColor, int shadowColor) {
        if (text == null) {
          return;
        }
        this.resetOpaqueTextStyle(textColor, shadowColor);
        this.drawStyledText(text, leftX, baselineY);
    }

    final int wrapText(String text, int[] lineWidthLimits, String[] outputLines) {
        int stackIn_70_2 = 0;
        Object var17 = null;
        if (text == null) {
          return 0;
        }
        aq.a(' ', -2, 0, wrappingBuffer);
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
              StringBuilder discarded$0 = wrappingBuffer.append('<');
              StringBuilder discarded$1 = wrappingBuffer.append(var15);
              StringBuilder discarded$2 = wrappingBuffer.append('>');
              if (var15.equals("br")) {
                outputLines[var11] = wrappingBuffer.toString().substring(var5, wrappingBuffer.length());
                var11++;
                var5 = wrappingBuffer.length();
                var4 = 0;
                var6 = -1;
                var10 = 0;
              } else if (var15.equals("lt")) {
                var4 = var4 + this.measureCharacterAdvance('<');
                if (this.pairKerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.pairKerning[(var10 << 8) + 60];
                }
                var10 = 60;
              } else if (var15.equals("gt")) {
                var4 = var4 + this.measureCharacterAdvance('>');
                if (this.pairKerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.pairKerning[(var10 << 8) + 62];
                }
                var10 = 62;
              } else if (var15.equals("nbsp")) {
                var4 = var4 + this.measureCharacterAdvance(' ');
                if (this.pairKerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.pairKerning[(var10 << 8) + 160];
                }
                var10 = 160;
              } else if (var15.equals("shy")) {
                var4 = var4 + this.measureCharacterAdvance('­');
                if (this.pairKerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.pairKerning[(var10 << 8) + 173];
                }
                var10 = 173;
              } else if (var15.equals("times")) {
                var4 = var4 + this.measureCharacterAdvance('×');
                if (this.pairKerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.pairKerning[(var10 << 8) + 215];
                }
                var10 = 215;
              } else if (var15.equals("euro")) {
                var4 = var4 + this.measureCharacterAdvance('€');
                if (this.pairKerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.pairKerning[(var10 << 8) + 128];
                }
                var10 = 8364;
              } else if (var15.equals("copy")) {
                var4 = var4 + this.measureCharacterAdvance('©');
                if (this.pairKerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.pairKerning[(var10 << 8) + 169];
                }
                var10 = 169;
              } else if (var15.equals("reg")) {
                var4 = var4 + this.measureCharacterAdvance('®');
                if (this.pairKerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.pairKerning[(var10 << 8) + 174];
                }
                var10 = 174;
              } else if (var15.startsWith("img=")) {
                try {
                  CharSequence var18 = (CharSequence) ((Object) var15.substring(4));
                  int var16_int = td.a(var18, (byte) 38);
                  var4 = var4 + this.inlineImages[var16_int].fullWidth;
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
                StringBuilder discarded$3 = wrappingBuffer.append((char) var14);
                var14 = (char)(ae.a((char) var14, 68) & 255);
                var4 = var4 + this.glyphAdvances[var14];
                if (this.pairKerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.pairKerning[(var10 << 8) + var14];
                }
                var10 = var14;
              }
              if (var14 == 32) {
                var6 = wrappingBuffer.length();
                var7 = var4;
                var8 = 1;
              }
              if (lineWidthLimits != null) {
                int stackIn_69_0 = var4;
                int[] stackIn_69_1 = (int[]) (lineWidthLimits);
                if (var11 >= lineWidthLimits.length) {
                  stackIn_70_2 = lineWidthLimits.length - 1;
                } else {
                  stackIn_70_2 = var11;
                }
                if (stackIn_69_0 > stackIn_69_1[stackIn_70_2] &&
                  var6 >= 0) {
                  outputLines[var11] = wrappingBuffer.toString().substring(var5, var6 - var8);
                  var11++;
                  var5 = var6;
                  var6 = -1;
                  var4 = var4 - var7;
                  var10 = 0;
                }
              }
              if (var14 == 45) {
                var6 = wrappingBuffer.length();
                var7 = var4;
                var8 = 0;
              }
            }
          } else {
            var9 = var13;
          }
        }
        if (wrappingBuffer.length() > var5) {
          outputLines[var11] = wrappingBuffer.toString().substring(var5, wrappingBuffer.length());
          var11++;
        }
        return var11;
    }

    final int measureWrappedHeight(String text, int wrapWidth, int lineSpacing) {
        if (lineSpacing == 0) {
          lineSpacing = this.lineAdvance;
        }
        int var4 = this.wrapText(text, new int[]{wrapWidth}, wrappedLines);
        int var5 = (var4 - 1) * lineSpacing;
        return this.maxAscent + var5 + this.maxDescent;
    }

    final int countWrappedLines(String text, int wrapWidth) {
        return this.wrapText(text, new int[]{wrapWidth}, wrappedLines);
    }

    private final static int computePairKerning(byte[][] leadingProfiles, byte[][] trailingProfiles, int[] profileOffsets, int[] advances, int[] profileLengths, int firstGlyph, int secondGlyph) {
        int var7 = profileOffsets[firstGlyph];
        int var8 = var7 + profileLengths[firstGlyph];
        int var9 = profileOffsets[secondGlyph];
        int var10 = var9 + profileLengths[secondGlyph];
        int var11 = var7;
        if (var9 > var7) {
          var11 = var9;
        }
        int var12 = var8;
        if (var10 < var8) {
          var12 = var10;
        }
        int var13 = advances[firstGlyph];
        if (advances[secondGlyph] < var13) {
          var13 = advances[secondGlyph];
        }
        byte[] var14 = trailingProfiles[firstGlyph];
        byte[] var15 = leadingProfiles[secondGlyph];
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
          spaceExpansionQ8 = (targetWidth - this.measureTextWidth(text) << 8) / var3;
        }
    }

    final int measureTextWidth(String text) {
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
                    int var9_int = td.a(var10, (byte) 38);
                    var4 = var4 + this.inlineImages[var9_int].fullWidth;
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
              var7 = (char)(ae.a((char) var7, -110) & 255);
              var4 = var4 + this.glyphAdvances[var7];
              if (this.pairKerning != null &&
                var3 != 0) {
                var4 = var4 + this.pairKerning[(var3 << 8) + var7];
              }
              var3 = var7;
            }
          } else {
            var2 = var6;
          }
        }
        return var4;
    }

    final void drawRightAlignedText(String text, int rightX, int baselineY, int textColor, int shadowColor) {
        if (text == null) {
          return;
        }
        this.resetOpaqueTextStyle(textColor, shadowColor);
        this.drawStyledText(text, rightX - this.measureTextWidth(text), baselineY);
    }

    private final void drawStyledText(String text, int penX, int baselineY) {
        int stackIn_27_0 = 0;
        int var10 = 0;
        baselineY = baselineY - this.lineAdvance;
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
                  this.applyStyleTag(var9_ref_String);
                } else {
                  try {
                    CharSequence var13 = (CharSequence) ((Object) var9_ref_String.substring(4));
                    var10 = td.a(var13, (byte) 38);
                    IndexedSpriteState var11_ref_df = this.inlineImages[var10];
                    if (this.inlineImageBaselineOffsets == null) {
                      stackIn_27_0 = var11_ref_df.fullHeight;
                    } else {
                      stackIn_27_0 = this.inlineImageBaselineOffsets[var10];
                    }
                    int var12 = stackIn_27_0;
                    if (currentAlpha256 != 256) {
                      var11_ref_df.drawAlpha(penX, baselineY + this.lineAdvance - var12, currentAlpha256);
                    } else {
                      var11_ref_df.draw(penX, baselineY + this.lineAdvance - var12);
                    }
                    penX = penX + var11_ref_df.fullWidth;
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
              var8 = (char)(ae.a((char) var8, -107) & 255);
              if (this.pairKerning != null &&
                var5 != 0) {
                penX = penX + this.pairKerning[(var5 << 8) + var8];
              }
              int var9 = this.glyphWidths[var8];
              var10 = this.glyphHeights[var8];
              int var11 = penX;
              if (var8 == 32) {
                if (spaceExpansionQ8 > 0) {
                  justificationRemainderQ8 = justificationRemainderQ8 + spaceExpansionQ8;
                  penX = penX + (justificationRemainderQ8 >> 8);
                  justificationRemainderQ8 = justificationRemainderQ8 & 255;
                }
              } else if (currentAlpha256 != 256) {
                if (currentShadowColor != -1) {
                  this.drawGlyphAlpha(var8, penX + this.glyphXOffsets[var8] + 1, baselineY + this.glyphYOffsets[var8] + 1, var9, var10, currentShadowColor, currentAlpha256, true);
                }
                this.drawGlyphAlpha(var8, penX + this.glyphXOffsets[var8], baselineY + this.glyphYOffsets[var8], var9, var10, currentTextColor, currentAlpha256, false);
              } else {
                if (currentShadowColor != -1) {
                  this.drawGlyph(var8, penX + this.glyphXOffsets[var8] + 1, baselineY + this.glyphYOffsets[var8] + 1, var9, var10, currentShadowColor, true);
                }
                this.drawGlyph(var8, penX + this.glyphXOffsets[var8], baselineY + this.glyphYOffsets[var8], var9, var10, currentTextColor, false);
              }
              penX = penX + this.glyphAdvances[var8];
              if (strikethroughColor != -1) {
                SoftwareRasterizer.drawHorizontalLine(var11, baselineY + (int)((double)this.lineAdvance * 0.7), penX - var11, strikethroughColor);
              }
              if (underlineColor != -1) {
                SoftwareRasterizer.drawHorizontalLine(var11, baselineY + this.lineAdvance + 1, penX - var11, underlineColor);
              }
              var5 = var8;
            }
          } else {
            var4 = var7;
          }
        }
    }

    BitmapFont(byte[] encodedMetrics, int[] glyphXOffsets, int[] glyphYOffsets, int[] glyphWidths, int[] glyphHeights) {
        this.lineAdvance = 0;
        this.glyphXOffsets = glyphXOffsets;
        this.glyphYOffsets = glyphYOffsets;
        this.glyphWidths = glyphWidths;
        this.glyphHeights = glyphHeights;
        this.decodeFontMetrics(encodedMetrics);
        int var6 = 2147483647;
        int var7 = -2147483648;
        for (int var8 = 0; var8 < 256; var8++) {
          if (this.glyphYOffsets[var8] < var6 &&
            this.glyphHeights[var8] != 0) {
            var6 = this.glyphYOffsets[var8];
          }
          if (this.glyphYOffsets[var8] + this.glyphHeights[var8] > var7) {
            var7 = this.glyphYOffsets[var8] + this.glyphHeights[var8];
          }
        }
        this.maxAscent = this.lineAdvance - var6;
        this.maxDescent = var7 - this.lineAdvance;
        this.capitalXAscent = this.lineAdvance - this.glyphYOffsets[88];
    }

    private final void resetTextStyle(int textColor, int shadowColor, int alpha256) {
        strikethroughColor = -1;
        underlineColor = -1;
        defaultShadowColor = shadowColor;
        currentShadowColor = shadowColor;
        defaultTextColor = textColor;
        currentTextColor = textColor;
        defaultAlpha256 = alpha256;
        currentAlpha256 = alpha256;
        spaceExpansionQ8 = 0;
        justificationRemainderQ8 = 0;
    }

    final void drawCenteredText(String text, int centerX, int baselineY, int textColor, int shadowColor) {
        if (text == null) {
          return;
        }
        this.resetOpaqueTextStyle(textColor, shadowColor);
        this.drawStyledText(text, centerX - this.measureTextWidth(text) / 2, baselineY);
    }

    static {
        wrappingBuffer = new StringBuilder(100);
        defaultTextColor = 0;
        spaceExpansionQ8 = 0;
        currentTextColor = 0;
        wrappedLines = new String[100];
        currentAlpha256 = 256;
        currentShadowColor = -1;
        defaultShadowColor = -1;
        strikethroughColor = -1;
        underlineColor = -1;
        defaultAlpha256 = 256;
        justificationRemainderQ8 = 0;
    }
}
