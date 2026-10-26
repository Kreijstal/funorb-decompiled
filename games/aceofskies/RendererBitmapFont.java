/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class RendererBitmapFont {
    private GraphicsRenderer renderer;
    static int[] field_b;
    private BitmapFontMetrics metrics;
    static tk field_a;

    final int drawParagraph(int maskY, int left, int textColor, boolean obfuscationGuard, int shadowColor, int horizontalAlignment, int top, int lineSpacing, int maskX, RenderSprite[] inlineImages, aa mask, int verticalAlignment, int[] inlineImageBaselineOffsets, int width, int height, String text) {
        RuntimeException var17 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!obfuscationGuard) {
            this.renderer = (GraphicsRenderer) null;
          }
          stackIn_3_0 = this.drawParagraphInternal(height, shadowColor, 0, mask, verticalAlignment, textColor, text, width, horizontalAlignment, top, maskY, lineSpacing, inlineImages, -2, inlineImageBaselineOffsets, left, maskX);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_6_0 = var17;
          stackIn_6_1 = new StringBuilder().append("da.I(").append(maskY).append(',').append(left).append(',').append(textColor).append(',').append(obfuscationGuard).append(',').append(shadowColor).append(',').append(horizontalAlignment).append(',').append(top).append(',').append(lineSpacing).append(',').append(maskX).append(',');
          if (inlineImages == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (mask == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(verticalAlignment).append(',');
          if (inlineImageBaselineOffsets == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(width).append(',').append(height).append(',');
          if (text == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static ResourceArchive a(int param0, int param1) {
        ResourceArchive stackIn_6_0 = null;
        if (param1 != 1) {
          field_b = (int[]) null;
        }
        if (null == oi.field_d &&
          param0 != -1) {
          stackIn_6_0 = lc.a(true, false, true, (byte) -65, 1, param0);
        } else {
          stackIn_6_0 = oi.field_d;
        }
        return stackIn_6_0;
    }

    private final void applyStyleTag(String tag, int obfuscationGuard) {
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int[] var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        CharSequence var10 = null;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          try {
            if (!tag.startsWith("col=")) {
              if (tag.equals("/col")) {
                qg.rendererCurrentTextColor = tf.rendererDefaultTextColor & 16777215 | qg.rendererCurrentTextColor & -16777216;
              }
            } else {
              var6 = (CharSequence) ((Object) tag.substring(4));
              qg.rendererCurrentTextColor = -16777216 & qg.rendererCurrentTextColor | 16777215 & np.a(var6, 4, 16);
            }
            if (obfuscationGuard != -16777216) {
              var5 = (int[]) null;
              this.drawTextWithImages(119, 96, (RenderSprite[]) null, 57, -108, (String) null, -122, (int[]) null);
            }
            if (tag.startsWith("argb=")) {
              var10 = (CharSequence) ((Object) tag.substring(5));
              qg.rendererCurrentTextColor = np.a(var10, 4, 16);
            } else {
              if (tag.equals("/argb")) {
                qg.rendererCurrentTextColor = tf.rendererDefaultTextColor;
              } else {
                if (tag.startsWith("str=")) {
                  var9 = (CharSequence) ((Object) tag.substring(4));
                  rs.rendererStrikethroughColor = qg.rendererCurrentTextColor & -16777216 | np.a(var9, 4, 16);
                } else {
                  if (tag.equals("str")) {
                    rs.rendererStrikethroughColor = -16777216 & qg.rendererCurrentTextColor | 8388608;
                  } else {
                    if (tag.equals("/str")) {
                      rs.rendererStrikethroughColor = -1;
                    } else {
                      if (tag.startsWith("u=")) {
                        var8 = (CharSequence) ((Object) tag.substring(2));
                        PacketBuffer.rendererUnderlineColor = qg.rendererCurrentTextColor & -16777216 | np.a(var8, obfuscationGuard ^ -16777212, 16);
                      } else {
                        if (tag.equals("u")) {
                          PacketBuffer.rendererUnderlineColor = -16777216 & qg.rendererCurrentTextColor;
                        } else {
                          if (tag.equals("/u")) {
                            PacketBuffer.rendererUnderlineColor = -1;
                          } else {
                            if (!tag.equalsIgnoreCase("shad=-1")) {
                              if (tag.startsWith("shad=")) {
                                var7 = (CharSequence) ((Object) tag.substring(5));
                                es.rendererCurrentShadowColor = qg.rendererCurrentTextColor & -16777216 | np.a(var7, 4, 16);
                              } else {
                                if (!tag.equals("shad")) {
                                  if (tag.equals("/shad")) {
                                    es.rendererCurrentShadowColor = em.rendererDefaultShadowColor;
                                  } else {
                                    if (tag.equals("br")) {
                                      this.resetTextStyle(em.rendererDefaultShadowColor, -1, tf.rendererDefaultTextColor);
                                    }
                                  }
                                } else {
                                  es.rendererCurrentShadowColor = qg.rendererCurrentTextColor & -16777216;
                                }
                              }
                            } else {
                              es.rendererCurrentShadowColor = 0;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_38_0 = var3_ref;
          stackIn_38_1 = new StringBuilder().append("da.P(");
          if (tag == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        if (param0 < 8) {
          field_b = (int[]) null;
        }
        if (param1) {
          ef.field_m = ef.field_m - 1;
          if (ef.field_m == 0) {
            ScorchMark.field_f = null;
          }
        }
        if (param2) {
          gq.field_e = gq.field_e - 1;
          if (gq.field_e == 0) {
            sa.field_h = null;
          }
        }
    }

    final void drawTextWithImages(int textColor, int shadowColor, RenderSprite[] inlineImages, int leftX, int maskY, String text, int baselineY, int[] inlineImageBaselineOffsets) {
        if (text == null) {
          return;
        }
        try {
          this.resetTextStyle(shadowColor, -1, textColor);
          this.drawStyledText(0, inlineImages, leftX, text, (byte) 5, inlineImageBaselineOffsets, baselineY, (aa) null, maskY);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "da.O(" + textColor + ',' + shadowColor + ',' + (inlineImages != null ? "{...}" : "null") + ',' + leftX + ',' + maskY + ',' + (text != null ? "{...}" : "null") + ',' + baselineY + ',' + (inlineImageBaselineOffsets != null ? "{...}" : "null") + ')');
        }
    }

    private final int drawParagraphInternal(int height, int shadowColor, int maximumLines, aa mask, int verticalAlignment, int textColor, String text, int width, int horizontalAlignment, int top, int maskY, int lineSpacing, RenderSprite[] inlineImages, int obfuscationGuard, int[] inlineImageBaselineOffsets, int left, int maskX) {
        int stackIn_4_0 = 0;
        int stackIn_46_0 = 0;
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var22Lifetime1;
        var23 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (text == null) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          this.resetTextStyle(shadowColor, -1, textColor);
          if (lineSpacing == 0) {
            lineSpacing = this.metrics.lineAdvance;
          }
          if (lineSpacing + this.metrics.maxDescent + this.metrics.maxAscent > height &&
            height < lineSpacing + lineSpacing) {
            var18 = null;
          } else {
            var18 = new int[]{width};
          }
          var20 = 109 / ((obfuscationGuard - 48) / 39);
          if (-1 == maximumLines) {
            maximumLines = height / lineSpacing;
            if (0 >= maximumLines) {
              maximumLines = 1;
            }
          }
          var19 = this.metrics.wrapText(-121, inlineImages, (int[]) (var18), vi.field_p, text);
          if (0 < maximumLines &&
            var19 >= maximumLines) {
            var19 = maximumLines;
            vi.field_p[maximumLines - 1] = this.metrics.a(inlineImages, 0, width, vi.field_p[-1 + maximumLines]);
          }
          if (3 == verticalAlignment &&
            var19 == 1) {
            verticalAlignment = 1;
          }
          if (verticalAlignment == 0) {
            var21 = this.metrics.maxAscent + top;
          } else {
            if (verticalAlignment == 1) {
              var21 = (-this.metrics.maxDescent + (-this.metrics.maxAscent + (height - (-1 + var19) * lineSpacing))) / 2 + this.metrics.maxAscent + top;
            } else {
              if (verticalAlignment == 2) {
                var21 = -((-1 + var19) * lineSpacing) - this.metrics.maxDescent + (height + top);
              } else {
                var22 = (-this.metrics.maxDescent - this.metrics.maxAscent + height - (var19 - 1) * lineSpacing) / (var19 + 1);
                if (0 > var22) {
                  var22 = 0;
                }
                var21 = this.metrics.maxAscent + (top + var22);
                lineSpacing = lineSpacing + var22;
              }
            }
          }
          for (var22Lifetime1 = 0; var22Lifetime1 < var19; var22Lifetime1++) {
            if (horizontalAlignment == 0) {
              this.drawStyledText(maskX, inlineImages, left, vi.field_p[var22Lifetime1], (byte) 5, inlineImageBaselineOffsets, var21, mask, maskY);
            } else {
              if (horizontalAlignment == 1) {
                this.drawStyledText(maskX, inlineImages, left + (-this.metrics.measureTextWidth((byte) 94, vi.field_p[var22Lifetime1]) + width) / 2, vi.field_p[var22Lifetime1], (byte) 5, inlineImageBaselineOffsets, var21, mask, maskY);
              } else {
                if (horizontalAlignment != 2) {
                  if (var22Lifetime1 != var19 - 1) {
                    this.prepareJustification(width, (byte) 104, vi.field_p[var22Lifetime1]);
                    this.drawStyledText(maskX, inlineImages, left, vi.field_p[var22Lifetime1], (byte) 5, inlineImageBaselineOffsets, var21, mask, maskY);
                    tm.rendererSpaceExpansionQ8 = 0;
                  } else {
                    this.drawStyledText(maskX, inlineImages, left, vi.field_p[var22Lifetime1], (byte) 5, inlineImageBaselineOffsets, var21, mask, maskY);
                  }
                } else {
                  this.drawStyledText(maskX, inlineImages, -this.metrics.measureTextWidth((byte) 94, vi.field_p[var22Lifetime1]) + (left + width), vi.field_p[var22Lifetime1], (byte) 5, inlineImageBaselineOffsets, var21, mask, maskY);
                }
              }
            }
            var21 = var21 + lineSpacing;
          }
          stackIn_46_0 = var19;
          return stackIn_46_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var18 = decompiledCaughtException;
          stackIn_49_0 = var18;
          stackIn_49_1 = new StringBuilder().append("da.T(").append(height).append(',').append(shadowColor).append(',').append(maximumLines).append(',');
          if (mask == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(verticalAlignment).append(',').append(textColor).append(',');
          if (text == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          stackIn_55_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(width).append(',').append(horizontalAlignment).append(',').append(top).append(',').append(maskY).append(',').append(lineSpacing).append(',');
          if (inlineImages == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          stackIn_58_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(obfuscationGuard).append(',');
          if (inlineImageBaselineOffsets == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw pn.a((Throwable) (stackIn_49_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(left).append(',').append(maskX).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 5) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    RendererBitmapFont(GraphicsRenderer renderer, BitmapFontMetrics metrics) {
        try {
          this.metrics = metrics;
          this.renderer = renderer;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "da.<init>(" + (renderer != null ? "{...}" : "null") + ',' + (metrics != null ? "{...}" : "null") + ')');
        }
    }

    final void drawText(int textColor, int shadowColor, int leftX, String text, int obfuscationGuard, int baselineY) {
        if (text == null) {
          return;
        }
        try {
          if (obfuscationGuard != 18731) {
            String var8 = (String) null;
            this.drawRightAlignedText((String) null, -14, 82, 83, -17, (byte) 19);
          }
          this.resetTextStyle(shadowColor, obfuscationGuard - 18732, textColor);
          this.drawStyledText(0, (RenderSprite[]) null, leftX, text, (byte) 5, (int[]) null, baselineY, (aa) null, 0);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "da.F(" + textColor + ',' + shadowColor + ',' + leftX + ',' + (text != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + baselineY + ')');
        }
    }

    private final void drawStyledText(int maskX, RenderSprite[] inlineImages, int penX, String text, byte obfuscationGuard, int[] inlineImageBaselineOffsets, int baselineY, aa mask, int maskY) {
        int var13 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        Throwable decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        String var15_ref_String = null;
        int var15 = 0;
        int var16_int = 0;
        Exception var16 = null;
        RenderSprite var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        CharSequence var21 = null;
        var20 = null;
        var19 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          baselineY = baselineY - this.metrics.lineAdvance;
          if (obfuscationGuard != 5) {
            this.renderer = (GraphicsRenderer) null;
          }
          var10_int = -1;
          var11 = -1;
          var12 = text.length();
          for (var13 = 0; var13 < var12; var13++) {
            boolean decompiledFrameRemainder0 = true;
            var14 = (char)(255 & ae.a(text.charAt(var13), 56));
            if (var14 != 60) {
              if (var14 == 62 &&
                -1 != var10_int) {
                var15_ref_String = text.substring(var10_int + 1, var13);
                var10_int = -1;
                if (var15_ref_String.equals("lt")) {
                  var14 = 60;
                } else {
                  if (!var15_ref_String.equals("gt")) {
                    if (!var15_ref_String.equals("nbsp")) {
                      if (var15_ref_String.equals("shy")) {
                        var14 = 173;
                      } else {
                        if (!var15_ref_String.equals("times")) {
                          if (var15_ref_String.equals("euro")) {
                            var14 = 8364;
                          } else {
                            if (var15_ref_String.equals("copy")) {
                              var14 = 169;
                            } else {
                              if (!var15_ref_String.equals("reg")) {
                                if (!var15_ref_String.startsWith("img=")) {
                                  this.applyStyleTag(var15_ref_String, -16777216);
                                } else {
                                  try {
                                    var21 = (CharSequence) ((Object) var15_ref_String.substring(4));
                                    var16_int = td.a(var21, (byte) 38);
                                    var17 = inlineImages[var16_int];
                                    if (inlineImageBaselineOffsets != null) {
                                      stackIn_26_0 = inlineImageBaselineOffsets[var16_int];
                                    } else {
                                      stackIn_26_0 = var17.c();
                                    }
                                    var18 = stackIn_26_0;
                                    if ((qg.rendererCurrentTextColor & -16777216) != -16777216) {
                                      var17.a(penX, baselineY + this.metrics.lineAdvance - var18, 0, qg.rendererCurrentTextColor & -16777216 | 16777215, 1);
                                    } else {
                                      var17.a(penX, -var18 + this.metrics.lineAdvance + baselineY, 1, 0, 1);
                                    }
                                    penX = penX + inlineImages[var16_int].d();
                                    var11 = -1;
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    var16 = (Exception) (Object) decompiledCaughtException;
                                  }
                                }
                                decompiledFrameRemainder0 = false;
                              }
                              else {
                                var14 = 174;
                              }
                            }
                          }
                        } else {
                          var14 = 215;
                        }
                      }
                    } else {
                      var14 = 160;
                    }
                  } else {
                    var14 = 62;
                  }
                }
              }
              if ((decompiledFrameRemainder0) &&
                (var10_int == -1)) {
                if (var11 != -1) {
                  penX = penX + this.metrics.getPairKerning(0, (char) var14, var11);
                }
                if (var14 == 32) {
                  if (tm.rendererSpaceExpansionQ8 > 0) {
                    ed.rendererJustificationRemainderQ8 = ed.rendererJustificationRemainderQ8 + tm.rendererSpaceExpansionQ8;
                    penX = penX + (ed.rendererJustificationRemainderQ8 >> 8);
                    ed.rendererJustificationRemainderQ8 = ed.rendererJustificationRemainderQ8 & 255;
                  }
                } else {
                  if (mask == null) {
                    if (0 != (-16777216 & es.rendererCurrentShadowColor)) {
                      this.drawGlyph((char) var14, 1 + penX, baselineY + 1, es.rendererCurrentShadowColor, true);
                    }
                    this.drawGlyph((char) var14, penX, baselineY, qg.rendererCurrentTextColor, false);
                  } else {
                    if (0 != (es.rendererCurrentShadowColor & -16777216)) {
                      this.drawGlyphWithMask((char) var14, 1 + penX, baselineY + 1, es.rendererCurrentShadowColor, true, mask, maskX, maskY);
                    }
                    this.drawGlyphWithMask((char) var14, penX, baselineY, qg.rendererCurrentTextColor, false, mask, maskX, maskY);
                  }
                }
                var15 = this.metrics.measureCharacterAdvance((byte) 109, var14);
                if (rs.rendererStrikethroughColor != -1) {
                  this.renderer.a(baselineY + (int)(0.7 * (double)this.metrics.lineAdvance), rs.rendererStrikethroughColor, 28321, penX, var15);
                }
                if (PacketBuffer.rendererUnderlineColor != -1) {
                  this.renderer.a(1 + (baselineY + this.metrics.lineAdvance), PacketBuffer.rendererUnderlineColor, 28321, penX, var15);
                }
                penX = penX + var15;
                var11 = var14;
              }
            } else {
              var10_int = var13;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var10 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_64_0 = var10;
          stackIn_64_1 = new StringBuilder().append("da.G(").append(maskX).append(',');
          if (inlineImages == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_67_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',').append(penX).append(',');
          if (text == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(obfuscationGuard).append(',');
          if (inlineImageBaselineOffsets == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(baselineY).append(',');
          if (mask == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_64_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(maskY).append(')').toString());
        }
    }

    private final void prepareJustification(int targetWidth, byte obfuscationGuard, String text) {
        int var6 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var4_int = 0;
          var5 = 0;
          if (obfuscationGuard <= 98) {
            return;
          }
          for (var6 = 0; text.length() > var6; var6++) {
            var7 = text.charAt(var6);
            if (var7 != 60) {
              if (var7 != 62) {
                if (var5 == 0 &&
                  32 == var7) {
                  var4_int++;
                }
              } else {
                var5 = 0;
              }
            } else {
              var5 = 1;
            }
          }
          if (var4_int > 0) {
            tm.rendererSpaceExpansionQ8 = (targetWidth - this.metrics.measureTextWidth((byte) 94, text) << 8) / var4_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("da.N(").append(targetWidth).append(',').append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void drawRightAlignedText(String text, int textColor, int shadowColor, int rightX, int baselineY, byte obfuscationGuard) {
        if (text == null) {
          return;
        }
        try {
          this.resetTextStyle(shadowColor, -1, textColor);
          if (obfuscationGuard != 92) {
            this.renderer = (GraphicsRenderer) null;
          }
          this.drawStyledText(0, (RenderSprite[]) null, rightX - this.metrics.measureTextWidth((byte) 94, text), text, (byte) 5, (int[]) null, baselineY, (aa) null, 0);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "da.J(" + (text != null ? "{...}" : "null") + ',' + textColor + ',' + shadowColor + ',' + rightX + ',' + baselineY + ',' + obfuscationGuard + ')');
        }
    }

    abstract void drawGlyph(char glyph, int x, int y, int color, boolean shadowPass);

    private final void resetTextStyle(int shadowColor, int underlineColor, int textColor) {
        rs.rendererStrikethroughColor = -1;
        tf.rendererDefaultTextColor = textColor;
        qg.rendererCurrentTextColor = textColor;
        tm.rendererSpaceExpansionQ8 = 0;
        PacketBuffer.rendererUnderlineColor = underlineColor;
        ed.rendererJustificationRemainderQ8 = 0;
        if (shadowColor == -1) {
          shadowColor = 0;
        }
        em.rendererDefaultShadowColor = shadowColor;
        es.rendererCurrentShadowColor = shadowColor;
    }

    final void drawCenteredText(int obfuscationGuard, int textColor, int shadowColor, int baselineY, int centerX, String text) {
        if (text == null) {
          return;
        }
        try {
          this.resetTextStyle(shadowColor, -1, textColor);
          this.drawStyledText(0, (RenderSprite[]) null, -(this.metrics.measureTextWidth((byte) 94, text) / 2) + centerX, text, (byte) 5, (int[]) null, baselineY, (aa) null, 0);
          if (obfuscationGuard < 95) {
            String var8 = (String) null;
            this.drawRightAlignedText((String) null, 1, -72, -15, 80, (byte) -125);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "da.Q(" + obfuscationGuard + ',' + textColor + ',' + shadowColor + ',' + baselineY + ',' + centerX + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    final void drawRightAlignedTextWithImages(int shadowColor, int textColor, int[] inlineImageBaselineOffsets, byte obfuscationGuard, int baselineY, String text, int rightX, RenderSprite[] inlineImages) {
        if (text == null) {
          return;
        }
        try {
          this.resetTextStyle(shadowColor, -1, textColor);
          if (obfuscationGuard > -93) {
            RendererBitmapFont.a(126, -64);
          }
          this.drawStyledText(0, inlineImages, -this.metrics.measureTextWidth((byte) 94, text) + rightX, text, (byte) 5, inlineImageBaselineOffsets, baselineY, (aa) null, 0);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "da.M(" + shadowColor + ',' + textColor + ',' + (inlineImageBaselineOffsets != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + baselineY + ',' + (text != null ? "{...}" : "null") + ',' + rightX + ',' + (inlineImages != null ? "{...}" : "null") + ')');
        }
    }

    abstract void drawGlyphWithMask(char glyph, int x, int y, int color, boolean shadowPass, aa mask, int maskX, int maskY);

    static {
        field_b = new int[128];
    }
}
