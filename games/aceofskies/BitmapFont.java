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
    private df[] inlineImages;
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
        Throwable decompiledCaughtException = null;
        Exception var2 = null;
        CharSequence var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        try {
          if (!tag.startsWith("col=")) {
            if (!tag.equals("/col")) {
              if (!tag.startsWith("trans=")) {
                if (!tag.equals("/trans")) {
                  if (!tag.startsWith("str=")) {
                    if (!tag.equals("str")) {
                      if (!tag.equals("/str")) {
                        if (!tag.startsWith("u=")) {
                          if (!tag.equals("u")) {
                            if (!tag.equals("/u")) {
                              if (!tag.startsWith("shad=")) {
                                if (!tag.equals("shad")) {
                                  if (!tag.equals("/shad")) {
                                    if (tag.equals("br")) {
                                      this.resetTextStyle(defaultTextColor, defaultShadowColor, defaultAlpha256);
                                    }
                                  } else {
                                    currentShadowColor = defaultShadowColor;
                                  }
                                } else {
                                  currentShadowColor = 0;
                                }
                              } else {
                                var7 = (CharSequence) ((Object) tag.substring(5));
                                currentShadowColor = np.a(var7, 4, 16);
                              }
                            } else {
                              underlineColor = -1;
                            }
                          } else {
                            underlineColor = 0;
                          }
                        } else {
                          var6 = (CharSequence) ((Object) tag.substring(2));
                          underlineColor = np.a(var6, 4, 16);
                        }
                      } else {
                        strikethroughColor = -1;
                      }
                    } else {
                      strikethroughColor = 8388608;
                    }
                  } else {
                    var5 = (CharSequence) ((Object) tag.substring(4));
                    strikethroughColor = np.a(var5, 4, 16);
                  }
                } else {
                  currentAlpha256 = defaultAlpha256;
                }
              } else {
                var4 = (CharSequence) ((Object) tag.substring(6));
                currentAlpha256 = td.a(var4, (byte) 38);
              }
            } else {
              currentTextColor = defaultTextColor;
            }
          } else {
            var3 = (CharSequence) ((Object) tag.substring(4));
            currentTextColor = np.a(var3, 4, 16);
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Exception) (Object) decompiledCaughtException;
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
        int[] var12;
        int var13;
        int var14;
        int var15;
        int var15Lifetime1;
        if (text == null) {
          return 0;
        }
        this.resetTextStyle(textColor, shadowColor, alpha256);
        if (lineSpacing == 0) {
          lineSpacing = this.lineAdvance;
        }
        var12 = new int[]{width};
        if (height < this.maxAscent + this.maxDescent + lineSpacing &&
          height < lineSpacing + lineSpacing) {
          var12 = null;
        }
        var13 = this.wrapText(text, var12, wrappedLines);
        if (verticalAlignment == 3 &&
          var13 == 1) {
          verticalAlignment = 1;
        }
        if (verticalAlignment != 0) {
          if (verticalAlignment != 1) {
            if (verticalAlignment != 2) {
              var15 = (height - this.maxAscent - this.maxDescent - (var13 - 1) * lineSpacing) / (var13 + 1);
              if (var15 < 0) {
                var15 = 0;
              }
              var14 = top + this.maxAscent + var15;
              lineSpacing = lineSpacing + var15;
            } else {
              var14 = top + height - this.maxDescent - (var13 - 1) * lineSpacing;
            }
          } else {
            var14 = top + this.maxAscent + (height - this.maxAscent - this.maxDescent - (var13 - 1) * lineSpacing) / 2;
          }
        } else {
          var14 = top + this.maxAscent;
        }
        for (var15Lifetime1 = 0; var15Lifetime1 < var13; var15Lifetime1++) {
          if (horizontalAlignment != 0) {
            if (horizontalAlignment != 1) {
              if (horizontalAlignment != 2) {
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
            } else {
              this.drawStyledText(wrappedLines[var15Lifetime1], left + (width - this.measureTextWidth(wrappedLines[var15Lifetime1])) / 2, var14);
              var14 = var14 + lineSpacing;
            }
          } else {
            this.drawStyledText(wrappedLines[var15Lifetime1], left, var14);
            var14 = var14 + lineSpacing;
          }
        }
        return var13;
    }

    private final void decodeFontMetrics(byte[] encodedMetrics) {
        int var3_int = 0;
        int incrementValue$6 = 0;
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        int var6_int = 0;
        byte[] array$2 = null;
        int incrementValue$3 = 0;
        byte[] array$0 = null;
        int var9 = 0;
        int incrementValue$1 = 0;
        int var2;
        int[] var3;
        int[] var4;
        int var5_int;
        byte[][] var5;
        byte[][] var6;
        int var7;
        int var8;
        int[] var10;
        byte[][] var11;
        byte[][] var12;
        int[] var13;
        int[] var14;
        byte[][] var15;
        byte[][] var16;
        int[] var17;
        int var5_intLifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        this.glyphAdvances = new int[256];
        if (encodedMetrics.length == 257) {
          for (var2 = 0; var2 < this.glyphAdvances.length; var2++) {
            this.glyphAdvances[var2] = encodedMetrics[var2] & 255;
          }
          this.lineAdvance = encodedMetrics[256] & 255;
        } else {
          var2 = 0;
          for (var3_int = 0; var3_int < 256; var3_int++) {
            incrementValue$6 = var2;
            var2++;
            this.glyphAdvances[var3_int] = encodedMetrics[incrementValue$6] & 255;
          }
          var14 = new int[256];
          var10 = var14;
          var3 = var10;
          var17 = new int[256];
          var13 = var17;
          var4 = var13;
          for (var5_int = 0; var5_int < 256; var5_int++) {
            incrementValue$5 = var2;
            var2++;
            var3[var5_int] = encodedMetrics[incrementValue$5] & 255;
          }
          for (var5_intLifetime1 = 0; var5_intLifetime1 < 256; var5_intLifetime1++) {
            incrementValue$4 = var2;
            var2++;
            var4[var5_intLifetime1] = encodedMetrics[incrementValue$4] & 255;
          }
          var15 = new byte[256][];
          var11 = var15;
          var5 = var11;
          for (var6_int = 0; var6_int < 256; var6_int++) {
            array$2 = new byte[var14[var6_int]];
            var5[var6_int] = array$2;
            var7 = 0;
            for (var8 = 0; var8 < var15[var6_int].length; var8++) {
              incrementValue$3 = var2;
              var2++;
              var7 = (byte)(var7 + encodedMetrics[incrementValue$3]);
              var15[var6_int][var8] = (byte)var7;
            }
          }
          var16 = new byte[256][];
          var12 = var16;
          var6 = var12;
          for (var7Lifetime1 = 0; var7Lifetime1 < 256; var7Lifetime1++) {
            array$0 = new byte[var14[var7Lifetime1]];
            var6[var7Lifetime1] = array$0;
            var8Lifetime1 = 0;
            for (var9 = 0; var9 < var16[var7Lifetime1].length; var9++) {
              incrementValue$1 = var2;
              var2++;
              var8Lifetime1 = (byte)(var8Lifetime1 + encodedMetrics[incrementValue$1]);
              var16[var7Lifetime1][var9] = (byte)var8Lifetime1;
            }
          }
          this.pairKerning = new byte[65536];
          for (var7Lifetime2 = 0; var7Lifetime2 < 256; var7Lifetime2++) {
            if (var7Lifetime2 != 32 &&
              var7Lifetime2 != 160) {
              for (var8Lifetime2 = 0; var8Lifetime2 < 256; var8Lifetime2++) {
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
        int var13 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int stackIn_69_0 = 0;
        int[] stackIn_69_1 = null;
        int stackIn_70_2 = 0;
        Throwable decompiledCaughtException = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        String var15 = null;
        int var16_int = 0;
        Exception var16 = null;
        Object var17 = null;
        CharSequence var18 = null;
        var17 = null;
        if (text == null) {
          return 0;
        }
        aq.a(' ', -2, 0, wrappingBuffer);
        var4 = 0;
        var5 = 0;
        var6 = -1;
        var7 = 0;
        var8 = 0;
        var9 = -1;
        var10 = 0;
        var11 = 0;
        var12 = text.length();
        for (var13 = 0; var13 < var12; var13++) {
          var14 = text.charAt(var13);
          if (var14 != 60) {
            if (var14 == 62 &&
              var9 != -1) {
              var15 = text.substring(var9 + 1, var13).toLowerCase();
              var9 = -1;
              discarded$0 = wrappingBuffer.append('<');
              discarded$1 = wrappingBuffer.append(var15);
              discarded$2 = wrappingBuffer.append('>');
              if (!var15.equals("br")) {
                if (!var15.equals("lt")) {
                  if (!var15.equals("gt")) {
                    if (!var15.equals("nbsp")) {
                      if (!var15.equals("shy")) {
                        if (!var15.equals("times")) {
                          if (!var15.equals("euro")) {
                            if (!var15.equals("copy")) {
                              if (!var15.equals("reg")) {
                                if (var15.startsWith("img=")) {
                                  try {
                                    var18 = (CharSequence) ((Object) var15.substring(4));
                                    var16_int = td.a(var18, (byte) 38);
                                    var4 = var4 + this.inlineImages[var16_int].field_h;
                                    var10 = 0;
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    var16 = (Exception) (Object) decompiledCaughtException;
                                  }
                                }
                              } else {
                                var4 = var4 + this.measureCharacterAdvance('®');
                                if (this.pairKerning != null &&
                                  var10 != 0) {
                                  var4 = var4 + this.pairKerning[(var10 << 8) + 174];
                                }
                                var10 = 174;
                              }
                            } else {
                              var4 = var4 + this.measureCharacterAdvance('©');
                              if (this.pairKerning != null &&
                                var10 != 0) {
                                var4 = var4 + this.pairKerning[(var10 << 8) + 169];
                              }
                              var10 = 169;
                            }
                          } else {
                            var4 = var4 + this.measureCharacterAdvance('€');
                            if (this.pairKerning != null &&
                              var10 != 0) {
                              var4 = var4 + this.pairKerning[(var10 << 8) + 128];
                            }
                            var10 = 8364;
                          }
                        } else {
                          var4 = var4 + this.measureCharacterAdvance('×');
                          if (this.pairKerning != null &&
                            var10 != 0) {
                            var4 = var4 + this.pairKerning[(var10 << 8) + 215];
                          }
                          var10 = 215;
                        }
                      } else {
                        var4 = var4 + this.measureCharacterAdvance('­');
                        if (this.pairKerning != null &&
                          var10 != 0) {
                          var4 = var4 + this.pairKerning[(var10 << 8) + 173];
                        }
                        var10 = 173;
                      }
                    } else {
                      var4 = var4 + this.measureCharacterAdvance(' ');
                      if (this.pairKerning != null &&
                        var10 != 0) {
                        var4 = var4 + this.pairKerning[(var10 << 8) + 160];
                      }
                      var10 = 160;
                    }
                  } else {
                    var4 = var4 + this.measureCharacterAdvance('>');
                    if (this.pairKerning != null &&
                      var10 != 0) {
                      var4 = var4 + this.pairKerning[(var10 << 8) + 62];
                    }
                    var10 = 62;
                  }
                } else {
                  var4 = var4 + this.measureCharacterAdvance('<');
                  if (this.pairKerning != null &&
                    var10 != 0) {
                    var4 = var4 + this.pairKerning[(var10 << 8) + 60];
                  }
                  var10 = 60;
                }
              } else {
                outputLines[var11] = wrappingBuffer.toString().substring(var5, wrappingBuffer.length());
                var11++;
                var5 = wrappingBuffer.length();
                var4 = 0;
                var6 = -1;
                var10 = 0;
              }
              var14 = 0;
            }
            if (var9 == -1) {
              if (var14 != 0) {
                discarded$3 = wrappingBuffer.append((char) var14);
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
                stackIn_69_0 = var4;
                stackIn_69_1 = (int[]) (lineWidthLimits);
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
        int var18 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        byte[] var14;
        byte[] var15;
        int var16;
        int var17;
        int var19;
        var7 = profileOffsets[firstGlyph];
        var8 = var7 + profileLengths[firstGlyph];
        var9 = profileOffsets[secondGlyph];
        var10 = var9 + profileLengths[secondGlyph];
        var11 = var7;
        if (var9 > var7) {
          var11 = var9;
        }
        var12 = var8;
        if (var10 < var8) {
          var12 = var10;
        }
        var13 = advances[firstGlyph];
        if (advances[secondGlyph] < var13) {
          var13 = advances[secondGlyph];
        }
        var14 = trailingProfiles[firstGlyph];
        var15 = leadingProfiles[secondGlyph];
        var16 = var11 - var7;
        var17 = var11 - var9;
        for (var18 = var11; var18 < var12; var18++) {
          incrementValue$6 = var16;
          var16++;
          incrementValue$7 = var17;
          var17++;
          var19 = var14[incrementValue$6] + var15[incrementValue$7];
          if (var19 < var13) {
            var13 = var19;
          }
        }
        return -var13;
    }

    private final void prepareJustification(String text, int targetWidth) {
        int var6 = 0;
        int var3;
        int var4;
        int var5;
        int var7;
        var3 = 0;
        var4 = 0;
        var5 = text.length();
        for (var6 = 0; var6 < var5; var6++) {
          var7 = text.charAt(var6);
          if (var7 != 60) {
            if (var7 != 62) {
              if (var4 == 0 &&
                var7 == 32) {
                var3++;
              }
            } else {
              var4 = 0;
            }
          } else {
            var4 = 1;
          }
        }
        if (var3 > 0) {
          spaceExpansionQ8 = (targetWidth - this.measureTextWidth(text) << 8) / var3;
        }
    }

    final int measureTextWidth(String text) {
        int var6 = 0;
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        String var8 = null;
        int var9_int = 0;
        Exception var9 = null;
        CharSequence var10 = null;
        if (text == null) {
          return 0;
        }
        var2 = -1;
        var3 = 0;
        var4 = 0;
        var5 = text.length();
        for (var6 = 0; var6 < var5; var6++) {
          boolean decompiledFrameRemainder0 = true;
          var7 = text.charAt(var6);
          if (var7 != 60) {
            if (var7 == 62 &&
              var2 != -1) {
              var8 = text.substring(var2 + 1, var6).toLowerCase();
              var2 = -1;
              if (!var8.equals("lt")) {
                if (!var8.equals("gt")) {
                  if (!var8.equals("nbsp")) {
                    if (!var8.equals("shy")) {
                      if (!var8.equals("times")) {
                        if (!var8.equals("euro")) {
                          if (!var8.equals("copy")) {
                            if (!var8.equals("reg")) {
                              if (!(!var8.startsWith("img="))) {
                                try {
                                  var10 = (CharSequence) ((Object) var8.substring(4));
                                  var9_int = td.a(var10, (byte) 38);
                                  var4 = var4 + this.inlineImages[var9_int].field_h;
                                  var3 = 0;
                                } catch (java.lang.Exception decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  var9 = (Exception) (Object) decompiledCaughtException;
                                }
                              }
                              decompiledFrameRemainder0 = false;
                            }
                            else {
                              var7 = 174;
                            }
                          } else {
                            var7 = 169;
                          }
                        } else {
                          var7 = 8364;
                        }
                      } else {
                        var7 = 215;
                      }
                    } else {
                      var7 = 173;
                    }
                  } else {
                    var7 = 160;
                  }
                } else {
                  var7 = 62;
                }
              } else {
                var7 = 60;
              }
            }
            if ((decompiledFrameRemainder0) &&
              (var2 == -1)) {
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
        int var7 = 0;
        int stackIn_27_0 = 0;
        Throwable decompiledCaughtException = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        String var9_ref_String = null;
        int var9 = 0;
        int var10 = 0;
        Exception var10_ref_Exception = null;
        df var11_ref_df = null;
        int var11 = 0;
        int var12 = 0;
        CharSequence var13 = null;
        baselineY = baselineY - this.lineAdvance;
        var4 = -1;
        var5 = 0;
        var6 = text.length();
        for (var7 = 0; var7 < var6; var7++) {
          boolean decompiledFrameRemainder0 = true;
          var8 = text.charAt(var7);
          if (var8 != 60) {
            if (var8 == 62 &&
              var4 != -1) {
              var9_ref_String = text.substring(var4 + 1, var7).toLowerCase();
              var4 = -1;
              if (!var9_ref_String.equals("lt")) {
                if (!var9_ref_String.equals("gt")) {
                  if (!var9_ref_String.equals("nbsp")) {
                    if (!var9_ref_String.equals("shy")) {
                      if (!var9_ref_String.equals("times")) {
                        if (!var9_ref_String.equals("euro")) {
                          if (!var9_ref_String.equals("copy")) {
                            if (!var9_ref_String.equals("reg")) {
                              if (!var9_ref_String.startsWith("img=")) {
                                this.applyStyleTag(var9_ref_String);
                              } else {
                                try {
                                  var13 = (CharSequence) ((Object) var9_ref_String.substring(4));
                                  var10 = td.a(var13, (byte) 38);
                                  var11_ref_df = this.inlineImages[var10];
                                  if (this.inlineImageBaselineOffsets == null) {
                                    stackIn_27_0 = var11_ref_df.field_a;
                                  } else {
                                    stackIn_27_0 = this.inlineImageBaselineOffsets[var10];
                                  }
                                  var12 = stackIn_27_0;
                                  if (currentAlpha256 != 256) {
                                    var11_ref_df.a(penX, baselineY + this.lineAdvance - var12, currentAlpha256);
                                  } else {
                                    var11_ref_df.a(penX, baselineY + this.lineAdvance - var12);
                                  }
                                  penX = penX + var11_ref_df.field_h;
                                  var5 = 0;
                                } catch (java.lang.Exception decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  var10_ref_Exception = (Exception) (Object) decompiledCaughtException;
                                }
                              }
                              decompiledFrameRemainder0 = false;
                            }
                            else {
                              var8 = 174;
                            }
                          } else {
                            var8 = 169;
                          }
                        } else {
                          var8 = 8364;
                        }
                      } else {
                        var8 = 215;
                      }
                    } else {
                      var8 = 173;
                    }
                  } else {
                    var8 = 160;
                  }
                } else {
                  var8 = 62;
                }
              } else {
                var8 = 60;
              }
            }
            if ((decompiledFrameRemainder0) &&
              (var4 == -1)) {
              var8 = (char)(ae.a((char) var8, -107) & 255);
              if (this.pairKerning != null &&
                var5 != 0) {
                penX = penX + this.pairKerning[(var5 << 8) + var8];
              }
              var9 = this.glyphWidths[var8];
              var10 = this.glyphHeights[var8];
              var11 = penX;
              if (var8 == 32) {
                if (spaceExpansionQ8 > 0) {
                  justificationRemainderQ8 = justificationRemainderQ8 + spaceExpansionQ8;
                  penX = penX + (justificationRemainderQ8 >> 8);
                  justificationRemainderQ8 = justificationRemainderQ8 & 255;
                }
              } else {
                if (currentAlpha256 != 256) {
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
        int var8 = 0;
        int var6;
        int var7;
        this.lineAdvance = 0;
        this.glyphXOffsets = glyphXOffsets;
        this.glyphYOffsets = glyphYOffsets;
        this.glyphWidths = glyphWidths;
        this.glyphHeights = glyphHeights;
        this.decodeFontMetrics(encodedMetrics);
        var6 = 2147483647;
        var7 = -2147483648;
        for (var8 = 0; var8 < 256; var8++) {
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
