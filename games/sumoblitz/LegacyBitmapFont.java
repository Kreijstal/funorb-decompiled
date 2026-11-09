/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LegacyBitmapFont extends DualLinkNode {
    private int[] glyphOffsetX;
    private int[] inlineSpriteHeights;
    int descent;
    private int[] advances;
    private int[] glyphHeights;
    private byte[] kerning;
    int ascent;
    private IndexedSprite[] inlineSprites;
    int baselineOffset;
    int capHeight;
    private static StringBuilder lineBuilder;
    private static int strikethroughColor;
    private static int underlineColor;
    private static int textColor;
    private static int justificationCarryQ8;
    private static int justificationStepQ8;
    private int[] glyphWidths;
    private static int shadowColor;
    private static int defaultAlpha;
    private static int defaultShadowColor;
    private static int defaultTextColor;
    private int[] glyphOffsetY;
    private static String[] lineBuffer;
    private static int alpha;

    final int charWidth(char character) {
        return this.advances[HardwareReflectionEffect.a(true, character) & 255];
    }

    private final void resetStyle(int color, int shadow) {
        strikethroughColor = -1;
        underlineColor = -1;
        defaultShadowColor = shadow;
        shadowColor = shadow;
        defaultTextColor = color;
        textColor = color;
        defaultAlpha = 256;
        alpha = 256;
        justificationStepQ8 = 0;
        justificationCarryQ8 = 0;
    }

    public static void releaseStatics() {
        lineBuilder = null;
        lineBuffer = null;
    }

    final int stringWidth(String text) {
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
                                  var9_int = no.a((byte) -128, var10);
                                  var4 = var4 + this.inlineSprites[var9_int].fullWidth;
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
              var7 = (char)(HardwareReflectionEffect.a(true, (char) var7) & 255);
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

    private final void decodeMetrics(byte[] data) {
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
        this.advances = new int[256];
        if (data.length == 257) {
          for (var2 = 0; var2 < this.advances.length; var2++) {
            this.advances[var2] = data[var2] & 255;
          }
          this.baselineOffset = data[256] & 255;
        } else {
          var2 = 0;
          for (var3_int = 0; var3_int < 256; var3_int++) {
            incrementValue$6 = var2;
            var2++;
            this.advances[var3_int] = data[incrementValue$6] & 255;
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
            var3[var5_int] = data[incrementValue$5] & 255;
          }
          for (var5_intLifetime1 = 0; var5_intLifetime1 < 256; var5_intLifetime1++) {
            incrementValue$4 = var2;
            var2++;
            var4[var5_intLifetime1] = data[incrementValue$4] & 255;
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
              var7 = (byte)(var7 + data[incrementValue$3]);
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
              var8Lifetime1 = (byte)(var8Lifetime1 + data[incrementValue$1]);
              var16[var7Lifetime1][var9] = (byte)var8Lifetime1;
            }
          }
          this.kerning = new byte[65536];
          for (var7Lifetime2 = 0; var7Lifetime2 < 256; var7Lifetime2++) {
            if (var7Lifetime2 != 32 &&
              var7Lifetime2 != 160) {
              for (var8Lifetime2 = 0; var8Lifetime2 < 256; var8Lifetime2++) {
                if (var8Lifetime2 != 32 &&
                  var8Lifetime2 != 160) {
                  this.kerning[(var7Lifetime2 << 8) + var8Lifetime2] = (byte)LegacyBitmapFont.kerningOffset(var15, var16, var17, this.advances, var14, var7Lifetime2, var8Lifetime2);
                }
              }
            }
          }
          this.baselineOffset = var17[32] + var14[32];
        }
    }

    private final void setJustification(String text, int targetWidth) {
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
          justificationStepQ8 = (targetWidth - this.stringWidth(text) << 8) / var3;
        }
    }

    final int drawParagraphAlpha(String text, int x, int y, int width, int height, int color, int shadow, int opacity, int alignX, int alignY, int lineSpacing) {
        int[] var12;
        int var13;
        int var14;
        int var15;
        int var15Lifetime1;
        if (text == null) {
          return 0;
        }
        this.resetStyleAlpha(color, shadow, opacity);
        if (lineSpacing == 0) {
          lineSpacing = this.baselineOffset;
        }
        var12 = new int[]{width};
        if (height < this.ascent + this.descent + lineSpacing &&
          height < lineSpacing + lineSpacing) {
          var12 = null;
        }
        var13 = this.breakLines(text, var12, lineBuffer);
        if (alignY == 3 &&
          var13 == 1) {
          alignY = 1;
        }
        if (alignY != 0) {
          if (alignY != 1) {
            if (alignY != 2) {
              var15 = (height - this.ascent - this.descent - (var13 - 1) * lineSpacing) / (var13 + 1);
              if (var15 < 0) {
                var15 = 0;
              }
              var14 = y + this.ascent + var15;
              lineSpacing = lineSpacing + var15;
            } else {
              var14 = y + height - this.descent - (var13 - 1) * lineSpacing;
            }
          } else {
            var14 = y + this.ascent + (height - this.ascent - this.descent - (var13 - 1) * lineSpacing) / 2;
          }
        } else {
          var14 = y + this.ascent;
        }
        for (var15Lifetime1 = 0; var15Lifetime1 < var13; var15Lifetime1++) {
          if (alignX != 0) {
            if (alignX != 1) {
              if (alignX != 2) {
                if (var15Lifetime1 != var13 - 1) {
                  this.setJustification(lineBuffer[var15Lifetime1], width);
                  this.drawStyledText(lineBuffer[var15Lifetime1], x, var14);
                  justificationStepQ8 = 0;
                } else {
                  this.drawStyledText(lineBuffer[var15Lifetime1], x, var14);
                }
                var14 = var14 + lineSpacing;
              } else {
                this.drawStyledText(lineBuffer[var15Lifetime1], x + width - this.stringWidth(lineBuffer[var15Lifetime1]), var14);
                var14 = var14 + lineSpacing;
              }
            } else {
              this.drawStyledText(lineBuffer[var15Lifetime1], x + (width - this.stringWidth(lineBuffer[var15Lifetime1])) / 2, var14);
              var14 = var14 + lineSpacing;
            }
          } else {
            this.drawStyledText(lineBuffer[var15Lifetime1], x, var14);
            var14 = var14 + lineSpacing;
          }
        }
        return var13;
    }

    private final void drawStyledText(String text, int x, int baselineY) {
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
        IndexedSprite var11_ref_pb = null;
        int var11 = 0;
        int var12 = 0;
        CharSequence var13 = null;
        baselineY = baselineY - this.baselineOffset;
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
                                  var10 = no.a((byte) -128, var13);
                                  var11_ref_pb = this.inlineSprites[var10];
                                  if (this.inlineSpriteHeights == null) {
                                    stackIn_27_0 = var11_ref_pb.fullHeight;
                                  } else {
                                    stackIn_27_0 = this.inlineSpriteHeights[var10];
                                  }
                                  var12 = stackIn_27_0;
                                  if (alpha != 256) {
                                    var11_ref_pb.drawAlpha(x, baselineY + this.baselineOffset - var12, alpha);
                                  } else {
                                    var11_ref_pb.draw(x, baselineY + this.baselineOffset - var12);
                                  }
                                  x = x + var11_ref_pb.fullWidth;
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
              var8 = (char)(HardwareReflectionEffect.a(true, (char) var8) & 255);
              if (this.kerning != null &&
                var5 != 0) {
                x = x + this.kerning[(var5 << 8) + var8];
              }
              var9 = this.glyphWidths[var8];
              var10 = this.glyphHeights[var8];
              var11 = x;
              if (var8 == 32) {
                if (justificationStepQ8 > 0) {
                  justificationCarryQ8 = justificationCarryQ8 + justificationStepQ8;
                  x = x + (justificationCarryQ8 >> 8);
                  justificationCarryQ8 = justificationCarryQ8 & 255;
                }
              } else {
                if (alpha != 256) {
                  if (shadowColor != -1) {
                    this.drawGlyphAlpha(var8, x + this.glyphOffsetX[var8] + 1, baselineY + this.glyphOffsetY[var8] + 1, var9, var10, shadowColor, alpha, true);
                  }
                  this.drawGlyphAlpha(var8, x + this.glyphOffsetX[var8], baselineY + this.glyphOffsetY[var8], var9, var10, textColor, alpha, false);
                } else {
                  if (shadowColor != -1) {
                    this.drawGlyph(var8, x + this.glyphOffsetX[var8] + 1, baselineY + this.glyphOffsetY[var8] + 1, var9, var10, shadowColor, true);
                  }
                  this.drawGlyph(var8, x + this.glyphOffsetX[var8], baselineY + this.glyphOffsetY[var8], var9, var10, textColor, false);
                }
              }
              x = x + this.advances[var8];
              if (strikethroughColor != -1) {
                SoftwareRasterizer.drawHorizontalLine(var11, baselineY + (int)((double)this.baselineOffset * 0.7), x - var11, strikethroughColor);
              }
              if (underlineColor != -1) {
                SoftwareRasterizer.drawHorizontalLine(var11, baselineY + this.baselineOffset + 1, x - var11, underlineColor);
              }
              var5 = var8;
            }
          } else {
            var4 = var7;
          }
        }
    }

    private final void resetStyleAlpha(int color, int shadow, int opacity) {
        strikethroughColor = -1;
        underlineColor = -1;
        defaultShadowColor = shadow;
        shadowColor = shadow;
        defaultTextColor = color;
        textColor = color;
        defaultAlpha = opacity;
        alpha = opacity;
        justificationStepQ8 = 0;
        justificationCarryQ8 = 0;
    }

    final int wrappedHeight(String text, int maxWidth, int lineSpacing) {
        if (lineSpacing == 0) {
          lineSpacing = this.baselineOffset;
        }
        int var4 = this.breakLines(text, new int[]{maxWidth}, lineBuffer);
        int var5 = (var4 - 1) * lineSpacing;
        return this.ascent + var5 + this.descent;
    }

    abstract void drawGlyphAlpha(int glyph, int x, int y, int width, int height, int color, int opacity, boolean shadow);

    final void drawText(String text, int x, int baselineY, int color, int shadow) {
        if (text == null) {
          return;
        }
        this.resetStyle(color, shadow);
        this.drawStyledText(text, x, baselineY);
    }

    final void drawCentered(String text, int centerX, int baselineY, int color, int shadow) {
        if (text == null) {
          return;
        }
        this.resetStyle(color, shadow);
        this.drawStyledText(text, centerX - this.stringWidth(text) / 2, baselineY);
    }

    private final static int kerningOffset(byte[][] leadingProfiles, byte[][] trailingProfiles, int[] profileStarts, int[] advances, int[] profileHeights, int leftGlyph, int rightGlyph) {
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
        var7 = profileStarts[leftGlyph];
        var8 = var7 + profileHeights[leftGlyph];
        var9 = profileStarts[rightGlyph];
        var10 = var9 + profileHeights[rightGlyph];
        var11 = var7;
        if (var9 > var7) {
          var11 = var9;
        }
        var12 = var8;
        if (var10 < var8) {
          var12 = var10;
        }
        var13 = advances[leftGlyph];
        if (advances[rightGlyph] < var13) {
          var13 = advances[rightGlyph];
        }
        var14 = trailingProfiles[leftGlyph];
        var15 = leadingProfiles[rightGlyph];
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

    final int drawParagraph(String text, int x, int y, int width, int height, int color, int shadow, int alignX, int alignY, int lineSpacing) {
        return this.drawParagraphAlpha(text, x, y, width, height, color, shadow, 256, alignX, alignY, lineSpacing);
    }

    final int lineCount(String text, int maxWidth) {
        return this.breakLines(text, new int[]{maxWidth}, lineBuffer);
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
                                      this.resetStyleAlpha(defaultTextColor, defaultShadowColor, defaultAlpha);
                                    }
                                  } else {
                                    shadowColor = defaultShadowColor;
                                  }
                                } else {
                                  shadowColor = 0;
                                }
                              } else {
                                var7 = (CharSequence) ((Object) tag.substring(5));
                                shadowColor = ea.a((byte) -73, var7, 16);
                              }
                            } else {
                              underlineColor = -1;
                            }
                          } else {
                            underlineColor = 0;
                          }
                        } else {
                          var6 = (CharSequence) ((Object) tag.substring(2));
                          underlineColor = ea.a((byte) -73, var6, 16);
                        }
                      } else {
                        strikethroughColor = -1;
                      }
                    } else {
                      strikethroughColor = 8388608;
                    }
                  } else {
                    var5 = (CharSequence) ((Object) tag.substring(4));
                    strikethroughColor = ea.a((byte) -73, var5, 16);
                  }
                } else {
                  alpha = defaultAlpha;
                }
              } else {
                var4 = (CharSequence) ((Object) tag.substring(6));
                alpha = no.a((byte) -128, var4);
              }
            } else {
              textColor = defaultTextColor;
            }
          } else {
            var3 = (CharSequence) ((Object) tag.substring(4));
            textColor = ea.a((byte) -73, var3, 16);
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Exception) (Object) decompiledCaughtException;
        }
    }

    final int breakLines(String text, int[] lineWidths, String[] output) {
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
        lb.a(lineBuilder, 60, ' ', 0);
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
              discarded$0 = lineBuilder.append('<');
              discarded$1 = lineBuilder.append(var15);
              discarded$2 = lineBuilder.append('>');
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
                                    var16_int = no.a((byte) -127, var18);
                                    var4 = var4 + this.inlineSprites[var16_int].fullWidth;
                                    var10 = 0;
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    var16 = (Exception) (Object) decompiledCaughtException;
                                  }
                                }
                              } else {
                                var4 = var4 + this.charWidth('®');
                                if (this.kerning != null &&
                                  var10 != 0) {
                                  var4 = var4 + this.kerning[(var10 << 8) + 174];
                                }
                                var10 = 174;
                              }
                            } else {
                              var4 = var4 + this.charWidth('©');
                              if (this.kerning != null &&
                                var10 != 0) {
                                var4 = var4 + this.kerning[(var10 << 8) + 169];
                              }
                              var10 = 169;
                            }
                          } else {
                            var4 = var4 + this.charWidth('€');
                            if (this.kerning != null &&
                              var10 != 0) {
                              var4 = var4 + this.kerning[(var10 << 8) + 128];
                            }
                            var10 = 8364;
                          }
                        } else {
                          var4 = var4 + this.charWidth('×');
                          if (this.kerning != null &&
                            var10 != 0) {
                            var4 = var4 + this.kerning[(var10 << 8) + 215];
                          }
                          var10 = 215;
                        }
                      } else {
                        var4 = var4 + this.charWidth('­');
                        if (this.kerning != null &&
                          var10 != 0) {
                          var4 = var4 + this.kerning[(var10 << 8) + 173];
                        }
                        var10 = 173;
                      }
                    } else {
                      var4 = var4 + this.charWidth(' ');
                      if (this.kerning != null &&
                        var10 != 0) {
                        var4 = var4 + this.kerning[(var10 << 8) + 160];
                      }
                      var10 = 160;
                    }
                  } else {
                    var4 = var4 + this.charWidth('>');
                    if (this.kerning != null &&
                      var10 != 0) {
                      var4 = var4 + this.kerning[(var10 << 8) + 62];
                    }
                    var10 = 62;
                  }
                } else {
                  var4 = var4 + this.charWidth('<');
                  if (this.kerning != null &&
                    var10 != 0) {
                    var4 = var4 + this.kerning[(var10 << 8) + 60];
                  }
                  var10 = 60;
                }
              } else {
                output[var11] = lineBuilder.toString().substring(var5, lineBuilder.length());
                var11++;
                var5 = lineBuilder.length();
                var4 = 0;
                var6 = -1;
                var10 = 0;
              }
              var14 = 0;
            }
            if (var9 == -1) {
              if (var14 != 0) {
                discarded$3 = lineBuilder.append((char) var14);
                var14 = (char)(HardwareReflectionEffect.a(true, (char) var14) & 255);
                var4 = var4 + this.advances[var14];
                if (this.kerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.kerning[(var10 << 8) + var14];
                }
                var10 = var14;
              }
              if (var14 == 32) {
                var6 = lineBuilder.length();
                var7 = var4;
                var8 = 1;
              }
              if (lineWidths != null) {
                stackIn_69_0 = var4;
                stackIn_69_1 = (int[]) (lineWidths);
                if (var11 >= lineWidths.length) {
                  stackIn_70_2 = lineWidths.length - 1;
                } else {
                  stackIn_70_2 = var11;
                }
                if (stackIn_69_0 > stackIn_69_1[stackIn_70_2] &&
                  var6 >= 0) {
                  output[var11] = lineBuilder.toString().substring(var5, var6 - var8);
                  var11++;
                  var5 = var6;
                  var6 = -1;
                  var4 = var4 - var7;
                  var10 = 0;
                }
              }
              if (var14 == 45) {
                var6 = lineBuilder.length();
                var7 = var4;
                var8 = 0;
              }
            }
          } else {
            var9 = var13;
          }
        }
        if (lineBuilder.length() > var5) {
          output[var11] = lineBuilder.toString().substring(var5, lineBuilder.length());
          var11++;
        }
        return var11;
    }

    final void drawRightAligned(String text, int rightX, int baselineY, int color, int shadow) {
        if (text == null) {
          return;
        }
        this.resetStyle(color, shadow);
        this.drawStyledText(text, rightX - this.stringWidth(text), baselineY);
    }

    abstract void drawGlyph(int glyph, int x, int y, int width, int height, int color, boolean shadow);

    LegacyBitmapFont(byte[] metrics, int[] offsetsX, int[] offsetsY, int[] widths, int[] heights) {
        int var8 = 0;
        int var6;
        int var7;
        this.baselineOffset = 0;
        this.glyphOffsetX = offsetsX;
        this.glyphOffsetY = offsetsY;
        this.glyphWidths = widths;
        this.glyphHeights = heights;
        this.decodeMetrics(metrics);
        var6 = 2147483647;
        var7 = -2147483648;
        for (var8 = 0; var8 < 256; var8++) {
          if (this.glyphOffsetY[var8] < var6 &&
            this.glyphHeights[var8] != 0) {
            var6 = this.glyphOffsetY[var8];
          }
          if (this.glyphOffsetY[var8] + this.glyphHeights[var8] > var7) {
            var7 = this.glyphOffsetY[var8] + this.glyphHeights[var8];
          }
        }
        this.ascent = this.baselineOffset - var6;
        this.descent = var7 - this.baselineOffset;
        this.capHeight = this.baselineOffset - this.glyphOffsetY[88];
    }

    static {
        lineBuilder = new StringBuilder(100);
        justificationCarryQ8 = 0;
        strikethroughColor = -1;
        shadowColor = -1;
        justificationStepQ8 = 0;
        underlineColor = -1;
        defaultShadowColor = -1;
        textColor = 0;
        lineBuffer = new String[100];
        defaultTextColor = 0;
        defaultAlpha = 256;
        alpha = 256;
    }
}
