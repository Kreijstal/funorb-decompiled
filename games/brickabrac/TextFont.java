/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFont extends DualLinkNode {
    private int[] inlineSpriteBaselines;
    int xHeight;
    private int[] glyphAdvances;
    private int[] glyphOffsetY;
    int ascent;
    private byte[] kerning;
    int capHeight;
    private static StringBuilder wrapScratch;
    private static int justifyRemainder256;
    private static int defaultPaint;
    int baselineHeight;
    private static String[] wrappedLines;
    private int[] glyphOffsetX;
    private static int defaultShadow;
    private static int justifyStep256;
    private int[] glyphWidths;
    private static int underlineColor;
    private int[] glyphHeights;
    int descent;
    private static int strikeColor;
    private static int defaultAlpha;
    private static int currentPaint;
    private IndexedSpriteGeometry[] inlineSprites;
    private static int currentAlpha;
    private static int currentShadow;

    abstract void drawGlyph(int glyphId, int x, int y, int width, int height, int paint, boolean shadow);

    private final void applyTag(String tag) {
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
                                      this.resetStyle(defaultPaint, defaultShadow, defaultAlpha);
                                    }
                                  } else {
                                    currentShadow = defaultShadow;
                                  }
                                } else {
                                  currentShadow = 0;
                                }
                              } else {
                                var7 = (CharSequence) ((Object) tag.substring(5));
                                currentShadow = DualLinkNode.a(16, (byte) -55, var7);
                              }
                            } else {
                              underlineColor = -1;
                            }
                          } else {
                            underlineColor = 0;
                          }
                        } else {
                          var6 = (CharSequence) ((Object) tag.substring(2));
                          underlineColor = DualLinkNode.a(16, (byte) -55, var6);
                        }
                      } else {
                        strikeColor = -1;
                      }
                    } else {
                      strikeColor = 8388608;
                    }
                  } else {
                    var5 = (CharSequence) ((Object) tag.substring(4));
                    strikeColor = DualLinkNode.a(16, (byte) -55, var5);
                  }
                } else {
                  currentAlpha = defaultAlpha;
                }
              } else {
                var4 = (CharSequence) ((Object) tag.substring(6));
                currentAlpha = fl.a(var4, -28734);
              }
            } else {
              currentPaint = defaultPaint;
            }
          } else {
            var3 = (CharSequence) ((Object) tag.substring(4));
            currentPaint = DualLinkNode.a(16, (byte) -55, var3);
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Exception) (Object) decompiledCaughtException;
        }
    }

    public static void a() {
        wrapScratch = null;
        wrappedLines = null;
    }

    final int countWrappedLines(String text, int width) {
        return this.wrapText(text, new int[]{width}, wrappedLines);
    }

    final int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        return this.a(param0, param1, param2, param3, param4, param5, param6, 256, param7, param8, param9);
    }

    final int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int[] var12;
        int var13;
        int var14;
        int var15;
        int var15Lifetime1;
        if (param0 == null) {
          return 0;
        }
        this.resetStyle(param5, param6, param7);
        if (param10 == 0) {
          param10 = this.baselineHeight;
        }
        var12 = new int[]{param3};
        if (param4 < this.ascent + this.descent + param10 &&
          param4 < param10 + param10) {
          var12 = null;
        }
        var13 = this.wrapText(param0, var12, wrappedLines);
        if (param9 == 3 &&
          var13 == 1) {
          param9 = 1;
        }
        if (param9 != 0) {
          if (param9 != 1) {
            if (param9 != 2) {
              var15 = (param4 - this.ascent - this.descent - (var13 - 1) * param10) / (var13 + 1);
              if (var15 < 0) {
                var15 = 0;
              }
              var14 = param2 + this.ascent + var15;
              param10 = param10 + var15;
            } else {
              var14 = param2 + param4 - this.descent - (var13 - 1) * param10;
            }
          } else {
            var14 = param2 + this.ascent + (param4 - this.ascent - this.descent - (var13 - 1) * param10) / 2;
          }
        } else {
          var14 = param2 + this.ascent;
        }
        for (var15Lifetime1 = 0; var15Lifetime1 < var13; var15Lifetime1++) {
          if (param8 != 0) {
            if (param8 != 1) {
              if (param8 != 2) {
                if (var15Lifetime1 != var13 - 1) {
                  this.prepareJustification(wrappedLines[var15Lifetime1], param3);
                  this.drawText(wrappedLines[var15Lifetime1], param1, var14);
                  justifyStep256 = 0;
                } else {
                  this.drawText(wrappedLines[var15Lifetime1], param1, var14);
                }
                var14 = var14 + param10;
              } else {
                this.drawText(wrappedLines[var15Lifetime1], param1 + param3 - this.measureText(wrappedLines[var15Lifetime1]), var14);
                var14 = var14 + param10;
              }
            } else {
              this.drawText(wrappedLines[var15Lifetime1], param1 + (param3 - this.measureText(wrappedLines[var15Lifetime1])) / 2, var14);
              var14 = var14 + param10;
            }
          } else {
            this.drawText(wrappedLines[var15Lifetime1], param1, var14);
            var14 = var14 + param10;
          }
        }
        return var13;
    }

    private final void resetStyle(int paint, int shadow, int alpha) {
        strikeColor = -1;
        underlineColor = -1;
        defaultShadow = shadow;
        currentShadow = shadow;
        defaultPaint = paint;
        currentPaint = paint;
        defaultAlpha = alpha;
        currentAlpha = alpha;
        justifyStep256 = 0;
        justifyRemainder256 = 0;
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
          justifyStep256 = (targetWidth - this.measureText(text) << 8) / var3;
        }
    }

    final void drawRightAlpha(String text, int rightX, int baselineY, int paint, int shadow, int alpha) {
        if (text == null) {
          return;
        }
        this.resetStyle(paint, shadow, alpha);
        this.drawText(text, rightX - this.measureText(text), baselineY);
    }

    private final void readMetrics(byte[] metrics) {
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
        if (metrics.length == 257) {
          for (var2 = 0; var2 < this.glyphAdvances.length; var2++) {
            this.glyphAdvances[var2] = metrics[var2] & 255;
          }
          this.baselineHeight = metrics[256] & 255;
        } else {
          var2 = 0;
          for (var3_int = 0; var3_int < 256; var3_int++) {
            incrementValue$6 = var2;
            var2++;
            this.glyphAdvances[var3_int] = metrics[incrementValue$6] & 255;
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
            var3[var5_int] = metrics[incrementValue$5] & 255;
          }
          for (var5_intLifetime1 = 0; var5_intLifetime1 < 256; var5_intLifetime1++) {
            incrementValue$4 = var2;
            var2++;
            var4[var5_intLifetime1] = metrics[incrementValue$4] & 255;
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
              var7 = (byte)(var7 + metrics[incrementValue$3]);
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
              var8Lifetime1 = (byte)(var8Lifetime1 + metrics[incrementValue$1]);
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
                  this.kerning[(var7Lifetime2 << 8) + var8Lifetime2] = (byte)TextFont.a(var15, var16, var17, this.glyphAdvances, var14, var7Lifetime2, var8Lifetime2);
                }
              }
            }
          }
          this.baselineHeight = var17[32] + var14[32];
        }
    }

    final void drawRight(String text, int rightX, int baselineY, int paint, int shadow) {
        if (text == null) {
          return;
        }
        this.resetStyleOpaque(paint, shadow);
        this.drawText(text, rightX - this.measureText(text), baselineY);
    }

    final void c(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
          return;
        }
        this.resetStyle(param3, param4, param5);
        this.drawText(param0, param1, param2);
    }

    private final void drawText(String text, int x, int baselineY) {
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
        IndexedSpriteGeometry var11_ref_fc = null;
        int var11 = 0;
        int var12 = 0;
        CharSequence var13 = null;
        baselineY = baselineY - this.baselineHeight;
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
                                this.applyTag(var9_ref_String);
                              } else {
                                try {
                                  var13 = (CharSequence) ((Object) var9_ref_String.substring(4));
                                  var10 = fl.a(var13, -28734);
                                  var11_ref_fc = this.inlineSprites[var10];
                                  if (this.inlineSpriteBaselines == null) {
                                    stackIn_27_0 = var11_ref_fc.canvasHeight;
                                  } else {
                                    stackIn_27_0 = this.inlineSpriteBaselines[var10];
                                  }
                                  var12 = stackIn_27_0;
                                  if (currentAlpha != 256) {
                                    var11_ref_fc.drawAlpha(x, baselineY + this.baselineHeight - var12, currentAlpha);
                                  } else {
                                    var11_ref_fc.drawTransparent(x, baselineY + this.baselineHeight - var12);
                                  }
                                  x = x + var11_ref_fc.canvasWidth;
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
              var8 = (char)(na.a(-8250, (char) var8) & 255);
              if (this.kerning != null &&
                var5 != 0) {
                x = x + this.kerning[(var5 << 8) + var8];
              }
              var9 = this.glyphWidths[var8];
              var10 = this.glyphHeights[var8];
              var11 = x;
              if (var8 == 32) {
                if (justifyStep256 > 0) {
                  justifyRemainder256 = justifyRemainder256 + justifyStep256;
                  x = x + (justifyRemainder256 >> 8);
                  justifyRemainder256 = justifyRemainder256 & 255;
                }
              } else {
                if (currentAlpha != 256) {
                  if (currentShadow != -1) {
                    this.drawGlyphAlpha(var8, x + this.glyphOffsetX[var8] + 1, baselineY + this.glyphOffsetY[var8] + 1, var9, var10, currentShadow, currentAlpha, true);
                  }
                  this.drawGlyphAlpha(var8, x + this.glyphOffsetX[var8], baselineY + this.glyphOffsetY[var8], var9, var10, currentPaint, currentAlpha, false);
                } else {
                  if (currentShadow != -1) {
                    this.drawGlyph(var8, x + this.glyphOffsetX[var8] + 1, baselineY + this.glyphOffsetY[var8] + 1, var9, var10, currentShadow, true);
                  }
                  this.drawGlyph(var8, x + this.glyphOffsetX[var8], baselineY + this.glyphOffsetY[var8], var9, var10, currentPaint, false);
                }
              }
              x = x + this.glyphAdvances[var8];
              if (strikeColor != -1) {
                Rasterizer2D.drawHorizontalLine(var11, baselineY + (int)((double)this.baselineHeight * 0.7), x - var11, strikeColor);
              }
              if (underlineColor != -1) {
                Rasterizer2D.drawHorizontalLine(var11, baselineY + this.baselineHeight + 1, x - var11, underlineColor);
              }
              var5 = var8;
            }
          } else {
            var4 = var7;
          }
        }
    }

    private final void resetStyleOpaque(int paint, int shadow) {
        strikeColor = -1;
        underlineColor = -1;
        defaultShadow = shadow;
        currentShadow = shadow;
        defaultPaint = paint;
        currentPaint = paint;
        defaultAlpha = 256;
        currentAlpha = 256;
        justifyStep256 = 0;
        justifyRemainder256 = 0;
    }

    final void drawCenteredAlpha(String text, int centerX, int baselineY, int paint, int shadow, int alpha) {
        if (text == null) {
          return;
        }
        this.resetStyle(paint, shadow, alpha);
        this.drawText(text, centerX - this.measureText(text) / 2, baselineY);
    }

    final int measureWrappedHeight(String text, int width, int lineSpacing) {
        if (lineSpacing == 0) {
          lineSpacing = this.baselineHeight;
        }
        int var4 = this.wrapText(text, new int[]{width}, wrappedLines);
        int var5 = (var4 - 1) * lineSpacing;
        return this.ascent + var5 + this.descent;
    }

    final void drawCentered(String text, int centerX, int baselineY, int paint, int shadow) {
        if (text == null) {
          return;
        }
        this.resetStyleOpaque(paint, shadow);
        this.drawText(text, centerX - this.measureText(text) / 2, baselineY);
    }

    final void drawLeft(String text, int x, int baselineY, int paint, int shadow) {
        if (text == null) {
          return;
        }
        this.resetStyleOpaque(paint, shadow);
        this.drawText(text, x, baselineY);
    }

    final int measureWrappedWidth(String text, int width) {
        int var5 = 0;
        int var3;
        int var4;
        int var6;
        var3 = this.wrapText(text, new int[]{width}, wrappedLines);
        var4 = 0;
        for (var5 = 0; var5 < var3; var5++) {
          var6 = this.measureText(wrappedLines[var5]);
          if (var6 > var4) {
            var4 = var6;
          }
        }
        return var4;
    }

    final int wrapText(String text, int[] lineWidths, String[] lines) {
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
        MessageScreen.a(' ', wrapScratch, 0, false);
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
              discarded$0 = wrapScratch.append('<');
              discarded$1 = wrapScratch.append(var15);
              discarded$2 = wrapScratch.append('>');
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
                                    var16_int = fl.a(var18, -28734);
                                    var4 = var4 + this.inlineSprites[var16_int].canvasWidth;
                                    var10 = 0;
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    var16 = (Exception) (Object) decompiledCaughtException;
                                  }
                                }
                              } else {
                                var4 = var4 + this.getAdvance('®');
                                if (this.kerning != null &&
                                  var10 != 0) {
                                  var4 = var4 + this.kerning[(var10 << 8) + 174];
                                }
                                var10 = 174;
                              }
                            } else {
                              var4 = var4 + this.getAdvance('©');
                              if (this.kerning != null &&
                                var10 != 0) {
                                var4 = var4 + this.kerning[(var10 << 8) + 169];
                              }
                              var10 = 169;
                            }
                          } else {
                            var4 = var4 + this.getAdvance('€');
                            if (this.kerning != null &&
                              var10 != 0) {
                              var4 = var4 + this.kerning[(var10 << 8) + 128];
                            }
                            var10 = 8364;
                          }
                        } else {
                          var4 = var4 + this.getAdvance('×');
                          if (this.kerning != null &&
                            var10 != 0) {
                            var4 = var4 + this.kerning[(var10 << 8) + 215];
                          }
                          var10 = 215;
                        }
                      } else {
                        var4 = var4 + this.getAdvance('­');
                        if (this.kerning != null &&
                          var10 != 0) {
                          var4 = var4 + this.kerning[(var10 << 8) + 173];
                        }
                        var10 = 173;
                      }
                    } else {
                      var4 = var4 + this.getAdvance(' ');
                      if (this.kerning != null &&
                        var10 != 0) {
                        var4 = var4 + this.kerning[(var10 << 8) + 160];
                      }
                      var10 = 160;
                    }
                  } else {
                    var4 = var4 + this.getAdvance('>');
                    if (this.kerning != null &&
                      var10 != 0) {
                      var4 = var4 + this.kerning[(var10 << 8) + 62];
                    }
                    var10 = 62;
                  }
                } else {
                  var4 = var4 + this.getAdvance('<');
                  if (this.kerning != null &&
                    var10 != 0) {
                    var4 = var4 + this.kerning[(var10 << 8) + 60];
                  }
                  var10 = 60;
                }
              } else {
                lines[var11] = wrapScratch.toString().substring(var5, wrapScratch.length());
                var11++;
                var5 = wrapScratch.length();
                var4 = 0;
                var6 = -1;
                var10 = 0;
              }
              var14 = 0;
            }
            if (var9 == -1) {
              if (var14 != 0) {
                discarded$3 = wrapScratch.append((char) var14);
                var14 = (char)(na.a(-8250, (char) var14) & 255);
                var4 = var4 + this.glyphAdvances[var14];
                if (this.kerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.kerning[(var10 << 8) + var14];
                }
                var10 = var14;
              }
              if (var14 == 32) {
                var6 = wrapScratch.length();
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
                  lines[var11] = wrapScratch.toString().substring(var5, var6 - var8);
                  var11++;
                  var5 = var6;
                  var6 = -1;
                  var4 = var4 - var7;
                  var10 = 0;
                }
              }
              if (var14 == 45) {
                var6 = wrapScratch.length();
                var7 = var4;
                var8 = 0;
              }
            }
          } else {
            var9 = var13;
          }
        }
        if (wrapScratch.length() > var5) {
          lines[var11] = wrapScratch.toString().substring(var5, wrapScratch.length());
          var11++;
        }
        return var11;
    }

    final int measureText(String text) {
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
                                  var9_int = fl.a(var10, -28734);
                                  var4 = var4 + this.inlineSprites[var9_int].canvasWidth;
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
              var7 = (char)(na.a(-8250, (char) var7) & 255);
              var4 = var4 + this.glyphAdvances[var7];
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

    private final static int a(byte[][] param0, byte[][] param1, int[] param2, int[] param3, int[] param4, int param5, int param6) {
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
        var7 = param2[param5];
        var8 = var7 + param4[param5];
        var9 = param2[param6];
        var10 = var9 + param4[param6];
        var11 = var7;
        if (var9 > var7) {
          var11 = var9;
        }
        var12 = var8;
        if (var10 < var8) {
          var12 = var10;
        }
        var13 = param3[param5];
        if (param3[param6] < var13) {
          var13 = param3[param6];
        }
        var14 = param1[param5];
        var15 = param0[param6];
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

    final void drawCharacter(char character, int x, int baselineY, int paint) {
        int var5 = 0;
        if (character != 32) {
          baselineY = baselineY - this.baselineHeight;
          var5 = na.a(-8250, character) & 255;
          this.drawGlyph(var5, x + this.glyphOffsetX[var5], baselineY + this.glyphOffsetY[var5], this.glyphWidths[var5], this.glyphHeights[var5], paint, false);
        }
    }

    final void setInlineSprites(IndexedSpriteGeometry[] sprites, int[] baselines) {
        if (baselines != null &&
          baselines.length != sprites.length) {
          throw new IllegalArgumentException();
        }
        this.inlineSprites = sprites;
        this.inlineSpriteBaselines = baselines;
    }

    final int getAdvance(char character) {
        return this.glyphAdvances[na.a(-8250, character) & 255];
    }

    final static String truncateText(TextFont font, String text, int width) {
        int var6 = 0;
        int var3;
        int var4;
        int var5;
        int var7;
        if (font.measureText(text) <= width) {
          return text;
        }
        var3 = font.measureText("...");
        var4 = width - var3;
        var5 = 0;
        for (var6 = 0; var6 < text.length(); var6++) {
          var7 = font.getAdvance(text.charAt(var6));
          if (var5 + var7 > var4) {
            return text.substring(0, var6 - 1) + "...";
          }
          var5 = var5 + var7;
        }
        return null;
    }

    final static String escapeAngles(String text) {
        int var3_int = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var1;
        int var2;
        int var4;
        StringBuilder var3;
        int var5;
        int var4Lifetime1;
        var1 = text.length();
        var2 = 0;
        for (var3_int = 0; var3_int < var1; var3_int++) {
          var4 = text.charAt(var3_int);
          if (var4 != 60) {
            if (var4 == 62) {
              var2 += 3;
            }
          } else {
            var2 += 3;
          }
        }
        var3 = new StringBuilder(var1 + var2);
        for (var4Lifetime1 = 0; var4Lifetime1 < var1; var4Lifetime1++) {
          var5 = text.charAt(var4Lifetime1);
          if (var5 != 60) {
            if (var5 != 62) {
              discarded$0 = var3.append((char) var5);
            } else {
              discarded$1 = var3.append("<gt>");
            }
          } else {
            discarded$2 = var3.append("<lt>");
          }
        }
        return var3.toString();
    }

    abstract void drawGlyphAlpha(int glyphId, int x, int y, int width, int height, int paint, int alpha, boolean shadow);

    TextFont(byte[] metrics, int[] glyphOffsetX, int[] glyphOffsetY, int[] glyphWidths, int[] glyphHeights) {
        int var8 = 0;
        int var6;
        int var7;
        this.baselineHeight = 0;
        this.glyphOffsetX = glyphOffsetX;
        this.glyphOffsetY = glyphOffsetY;
        this.glyphWidths = glyphWidths;
        this.glyphHeights = glyphHeights;
        this.readMetrics(metrics);
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
        this.ascent = this.baselineHeight - var6;
        this.descent = var7 - this.baselineHeight;
        this.capHeight = this.baselineHeight - this.glyphOffsetY[88];
        this.xHeight = this.baselineHeight - this.glyphOffsetY[120];
    }

    static {
        wrapScratch = new StringBuilder(100);
        justifyRemainder256 = 0;
        defaultShadow = -1;
        wrappedLines = new String[100];
        underlineColor = -1;
        defaultPaint = 0;
        strikeColor = -1;
        defaultAlpha = 256;
        justifyStep256 = 0;
        currentPaint = 0;
        currentAlpha = 256;
        currentShadow = -1;
    }
}
