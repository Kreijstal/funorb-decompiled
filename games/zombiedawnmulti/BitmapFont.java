/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class BitmapFont extends DualLinkNode {
    int baselineHeight;
    private int[] field_G;
    private int[] glyphAdvances;
    int field_J;
    private int[] field_y;
    private int[] field_x;
    private int[] field_B;
    private int[] inlineSpriteBaselines;
    int maxDescent;
    private IndexedSpriteState[] inlineSprites;
    private static StringBuilder field_q;
    private static int defaultShadowColor;
    private byte[] kerning;
    private static int currentTextColor;
    private static String[] wrappedLines;
    private static int currentShadowColor;
    private static int spaceExpansionQ8;
    private static int currentAlpha;
    private static int field_u;
    private static int underlineColor;
    int maxAscent;
    private static int field_s;
    private static int defaultTextColor;
    private static int defaultAlpha;

    final int countWrappedLines(String param0, int param1) {
        return this.wrapText(param0, new int[]{param1}, wrappedLines);
    }

    final void drawCenteredAlpha(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
          return;
        }
        this.resetStyle(param3, param4, param5);
        this.drawText(param0, param1 - this.textWidth(param0) / 2, param2);
    }

    abstract void drawGlyphAlpha(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7);

    private final void drawText(String param0, int param1, int param2) {
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
        IndexedSpriteState var11_ref_sb = null;
        int var11 = 0;
        int var12 = 0;
        CharSequence var13 = null;
        param2 = param2 - this.baselineHeight;
        var4 = -1;
        var5 = 0;
        var6 = param0.length();
        for (var7 = 0; var7 < var6; var7++) {
          boolean decompiledFrameRemainder0 = true;
          var8 = param0.charAt(var7);
          if (var8 != 60) {
            if (var8 == 62 &&
              var4 != -1) {
              var9_ref_String = param0.substring(var4 + 1, var7).toLowerCase();
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
                                  var10 = TriangleMesh.parseDecimalInt(var13, -9159);
                                  var11_ref_sb = this.inlineSprites[var10];
                                  if (this.inlineSpriteBaselines == null) {
                                    stackIn_27_0 = var11_ref_sb.field_a;
                                  } else {
                                    stackIn_27_0 = this.inlineSpriteBaselines[var10];
                                  }
                                  var12 = stackIn_27_0;
                                  if (currentAlpha != 256) {
                                    var11_ref_sb.drawAlpha(param1, param2 + this.baselineHeight - var12, currentAlpha);
                                  } else {
                                    var11_ref_sb.draw(param1, param2 + this.baselineHeight - var12);
                                  }
                                  param1 = param1 + var11_ref_sb.field_f;
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
              var8 = (char)(MouseInputHandler.encodeExtendedChar((char) var8, (byte) -126) & 255);
              if (this.kerning != null &&
                var5 != 0) {
                param1 = param1 + this.kerning[(var5 << 8) + var8];
              }
              var9 = this.field_y[var8];
              var10 = this.field_x[var8];
              var11 = param1;
              if (var8 == 32) {
                if (spaceExpansionQ8 > 0) {
                  field_s = field_s + spaceExpansionQ8;
                  param1 = param1 + (field_s >> 8);
                  field_s = field_s & 255;
                }
              } else {
                if (currentAlpha != 256) {
                  if (currentShadowColor != -1) {
                    this.drawGlyphAlpha(var8, param1 + this.field_B[var8] + 1, param2 + this.field_G[var8] + 1, var9, var10, currentShadowColor, currentAlpha, true);
                  }
                  this.drawGlyphAlpha(var8, param1 + this.field_B[var8], param2 + this.field_G[var8], var9, var10, currentTextColor, currentAlpha, false);
                } else {
                  if (currentShadowColor != -1) {
                    this.drawGlyph(var8, param1 + this.field_B[var8] + 1, param2 + this.field_G[var8] + 1, var9, var10, currentShadowColor, true);
                  }
                  this.drawGlyph(var8, param1 + this.field_B[var8], param2 + this.field_G[var8], var9, var10, currentTextColor, false);
                }
              }
              param1 = param1 + this.glyphAdvances[var8];
              if (field_u != -1) {
                SoftwareRasterizer.drawHorizontalLine(var11, param2 + (int)((double)this.baselineHeight * 0.7), param1 - var11, field_u);
              }
              if (underlineColor != -1) {
                SoftwareRasterizer.drawHorizontalLine(var11, param2 + this.baselineHeight + 1, param1 - var11, underlineColor);
              }
              var5 = var8;
            }
          } else {
            var4 = var7;
          }
        }
    }

    private final void resetTextStyle(int param0, int param1) {
        field_u = -1;
        underlineColor = -1;
        defaultShadowColor = param1;
        currentShadowColor = param1;
        defaultTextColor = param0;
        currentTextColor = param0;
        defaultAlpha = 256;
        currentAlpha = 256;
        spaceExpansionQ8 = 0;
        field_s = 0;
    }

    private final void prepareJustification(String param0, int param1) {
        int var6 = 0;
        int var3;
        int var4;
        int var5;
        int var7;
        var3 = 0;
        var4 = 0;
        var5 = param0.length();
        for (var6 = 0; var6 < var5; var6++) {
          var7 = param0.charAt(var6);
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
          spaceExpansionQ8 = (param1 - this.textWidth(param0) << 8) / var3;
        }
    }

    final int charWidth(char param0) {
        return this.glyphAdvances[MouseInputHandler.encodeExtendedChar(param0, (byte) -41) & 255];
    }

    final void drawLeft(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
          return;
        }
        this.resetTextStyle(param3, param4);
        this.drawText(param0, param1, param2);
    }

    final int wrapText(String param0, int[] param1, String[] param2) {
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
        if (param0 == null) {
          return 0;
        }
        TransitionPhase.padWithChar(' ', 0, 0, field_q);
        var4 = 0;
        var5 = 0;
        var6 = -1;
        var7 = 0;
        var8 = 0;
        var9 = -1;
        var10 = 0;
        var11 = 0;
        var12 = param0.length();
        for (var13 = 0; var13 < var12; var13++) {
          var14 = param0.charAt(var13);
          if (var14 != 60) {
            if (var14 == 62 &&
              var9 != -1) {
              var15 = param0.substring(var9 + 1, var13).toLowerCase();
              var9 = -1;
              discarded$0 = field_q.append('<');
              discarded$1 = field_q.append(var15);
              discarded$2 = field_q.append('>');
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
                                    var16_int = TriangleMesh.parseDecimalInt(var18, -9159);
                                    var4 = var4 + this.inlineSprites[var16_int].field_f;
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
                param2[var11] = field_q.toString().substring(var5, field_q.length());
                var11++;
                var5 = field_q.length();
                var4 = 0;
                var6 = -1;
                var10 = 0;
              }
              var14 = 0;
            }
            if (var9 == -1) {
              if (var14 != 0) {
                discarded$3 = field_q.append((char) var14);
                var14 = (char)(MouseInputHandler.encodeExtendedChar((char) var14, (byte) -89) & 255);
                var4 = var4 + this.glyphAdvances[var14];
                if (this.kerning != null &&
                  var10 != 0) {
                  var4 = var4 + this.kerning[(var10 << 8) + var14];
                }
                var10 = var14;
              }
              if (var14 == 32) {
                var6 = field_q.length();
                var7 = var4;
                var8 = 1;
              }
              if (param1 != null) {
                stackIn_69_0 = var4;
                stackIn_69_1 = (int[]) (param1);
                if (var11 >= param1.length) {
                  stackIn_70_2 = param1.length - 1;
                } else {
                  stackIn_70_2 = var11;
                }
                if (stackIn_69_0 > stackIn_69_1[stackIn_70_2] &&
                  var6 >= 0) {
                  param2[var11] = field_q.toString().substring(var5, var6 - var8);
                  var11++;
                  var5 = var6;
                  var6 = -1;
                  var4 = var4 - var7;
                  var10 = 0;
                }
              }
              if (var14 == 45) {
                var6 = field_q.length();
                var7 = var4;
                var8 = 0;
              }
            }
          } else {
            var9 = var13;
          }
        }
        if (field_q.length() > var5) {
          param2[var11] = field_q.toString().substring(var5, field_q.length());
          var11++;
        }
        return var11;
    }

    final int measureWrappedHeight(String param0, int param1, int param2) {
        if (param2 == 0) {
          param2 = this.baselineHeight;
        }
        int var4 = this.wrapText(param0, new int[]{param1}, wrappedLines);
        int var5 = (var4 - 1) * param2;
        return this.maxAscent + var5 + this.maxDescent;
    }

    final void drawCharacter(char param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (param0 != 32) {
          param2 = param2 - this.baselineHeight;
          var5 = MouseInputHandler.encodeExtendedChar(param0, (byte) -99) & 255;
          this.drawGlyph(var5, param1 + this.field_B[var5], param2 + this.field_G[var5], this.field_y[var5], this.field_x[var5], param3, false);
        }
    }

    private final void applyStyleTag(String param0) {
        Throwable decompiledCaughtException = null;
        Exception var2 = null;
        CharSequence var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        try {
          if (!param0.startsWith("col=")) {
            if (!param0.equals("/col")) {
              if (!param0.startsWith("trans=")) {
                if (!param0.equals("/trans")) {
                  if (!param0.startsWith("str=")) {
                    if (!param0.equals("str")) {
                      if (!param0.equals("/str")) {
                        if (!param0.startsWith("u=")) {
                          if (!param0.equals("u")) {
                            if (!param0.equals("/u")) {
                              if (!param0.startsWith("shad=")) {
                                if (!param0.equals("shad")) {
                                  if (!param0.equals("/shad")) {
                                    if (param0.equals("br")) {
                                      this.resetStyle(defaultTextColor, defaultShadowColor, defaultAlpha);
                                    }
                                  } else {
                                    currentShadowColor = defaultShadowColor;
                                  }
                                } else {
                                  currentShadowColor = 0;
                                }
                              } else {
                                var7 = (CharSequence) ((Object) param0.substring(5));
                                currentShadowColor = OptionsMenuScreen.parseInteger(var7, 16, 3);
                              }
                            } else {
                              underlineColor = -1;
                            }
                          } else {
                            underlineColor = 0;
                          }
                        } else {
                          var6 = (CharSequence) ((Object) param0.substring(2));
                          underlineColor = OptionsMenuScreen.parseInteger(var6, 16, 3);
                        }
                      } else {
                        field_u = -1;
                      }
                    } else {
                      field_u = 8388608;
                    }
                  } else {
                    var5 = (CharSequence) ((Object) param0.substring(4));
                    field_u = OptionsMenuScreen.parseInteger(var5, 16, 3);
                  }
                } else {
                  currentAlpha = defaultAlpha;
                }
              } else {
                var4 = (CharSequence) ((Object) param0.substring(6));
                currentAlpha = TriangleMesh.parseDecimalInt(var4, -9159);
              }
            } else {
              currentTextColor = defaultTextColor;
            }
          } else {
            var3 = (CharSequence) ((Object) param0.substring(4));
            currentTextColor = OptionsMenuScreen.parseInteger(var3, 16, 3);
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Exception) (Object) decompiledCaughtException;
        }
    }

    public static void releaseStatics() {
        field_q = null;
        wrappedLines = null;
    }

    private final void decodeFontMetrics(byte[] param0) {
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
        if (param0.length == 257) {
          for (var2 = 0; var2 < this.glyphAdvances.length; var2++) {
            this.glyphAdvances[var2] = param0[var2] & 255;
          }
          this.baselineHeight = param0[256] & 255;
        } else {
          var2 = 0;
          for (var3_int = 0; var3_int < 256; var3_int++) {
            incrementValue$6 = var2;
            var2++;
            this.glyphAdvances[var3_int] = param0[incrementValue$6] & 255;
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
            var3[var5_int] = param0[incrementValue$5] & 255;
          }
          for (var5_intLifetime1 = 0; var5_intLifetime1 < 256; var5_intLifetime1++) {
            incrementValue$4 = var2;
            var2++;
            var4[var5_intLifetime1] = param0[incrementValue$4] & 255;
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
              var7 = (byte)(var7 + param0[incrementValue$3]);
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
              var8Lifetime1 = (byte)(var8Lifetime1 + param0[incrementValue$1]);
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
                  this.kerning[(var7Lifetime2 << 8) + var8Lifetime2] = (byte)BitmapFont.computePairKerning(var15, var16, var17, this.glyphAdvances, var14, var7Lifetime2, var8Lifetime2);
                }
              }
            }
          }
          this.baselineHeight = var17[32] + var14[32];
        }
    }

    final int textWidth(String param0) {
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
        if (param0 == null) {
          return 0;
        }
        var2 = -1;
        var3 = 0;
        var4 = 0;
        var5 = param0.length();
        for (var6 = 0; var6 < var5; var6++) {
          boolean decompiledFrameRemainder0 = true;
          var7 = param0.charAt(var6);
          if (var7 != 60) {
            if (var7 == 62 &&
              var2 != -1) {
              var8 = param0.substring(var2 + 1, var6).toLowerCase();
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
                                  var9_int = TriangleMesh.parseDecimalInt(var10, -9159);
                                  var4 = var4 + this.inlineSprites[var9_int].field_f;
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
              var7 = (char)(MouseInputHandler.encodeExtendedChar((char) var7, (byte) -117) & 255);
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

    final int drawParagraph(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        return this.drawParagraphAlpha(param0, param1, param2, param3, param4, param5, param6, 256, param7, param8, param9);
    }

    final static String truncateText(BitmapFont param0, String param1, int param2) {
        int var6 = 0;
        int var3;
        int var4;
        int var5;
        int var7;
        if (param0.textWidth(param1) <= param2) {
          return param1;
        }
        var3 = param0.textWidth("...");
        var4 = param2 - var3;
        var5 = 0;
        for (var6 = 0; var6 < param1.length(); var6++) {
          var7 = param0.charWidth(param1.charAt(var6));
          if (var5 + var7 > var4) {
            return param1.substring(0, var6 - 1) + "...";
          }
          var5 = var5 + var7;
        }
        return null;
    }

    final static String escapeMarkup(String param0) {
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
        var1 = param0.length();
        var2 = 0;
        for (var3_int = 0; var3_int < var1; var3_int++) {
          var4 = param0.charAt(var3_int);
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
          var5 = param0.charAt(var4Lifetime1);
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

    private final static int computePairKerning(byte[][] param0, byte[][] param1, int[] param2, int[] param3, int[] param4, int param5, int param6) {
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

    final void drawLeftAlpha(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
          return;
        }
        this.resetStyle(param3, param4, param5);
        this.drawText(param0, param1, param2);
    }

    private final void resetStyle(int param0, int param1, int param2) {
        field_u = -1;
        underlineColor = -1;
        defaultShadowColor = param1;
        currentShadowColor = param1;
        defaultTextColor = param0;
        currentTextColor = param0;
        defaultAlpha = param2;
        currentAlpha = param2;
        spaceExpansionQ8 = 0;
        field_s = 0;
    }

    final void drawRightAlpha(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
          return;
        }
        this.resetStyle(param3, param4, param5);
        this.drawText(param0, param1 - this.textWidth(param0), param2);
    }

    final void drawCentered(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
          return;
        }
        this.resetTextStyle(param3, param4);
        this.drawText(param0, param1 - this.textWidth(param0) / 2, param2);
    }

    final int drawParagraphAlpha(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
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
        if (param4 < this.maxAscent + this.maxDescent + param10 &&
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
              var15 = (param4 - this.maxAscent - this.maxDescent - (var13 - 1) * param10) / (var13 + 1);
              if (var15 < 0) {
                var15 = 0;
              }
              var14 = param2 + this.maxAscent + var15;
              param10 = param10 + var15;
            } else {
              var14 = param2 + param4 - this.maxDescent - (var13 - 1) * param10;
            }
          } else {
            var14 = param2 + this.maxAscent + (param4 - this.maxAscent - this.maxDescent - (var13 - 1) * param10) / 2;
          }
        } else {
          var14 = param2 + this.maxAscent;
        }
        for (var15Lifetime1 = 0; var15Lifetime1 < var13; var15Lifetime1++) {
          if (param8 != 0) {
            if (param8 != 1) {
              if (param8 != 2) {
                if (var15Lifetime1 != var13 - 1) {
                  this.prepareJustification(wrappedLines[var15Lifetime1], param3);
                  this.drawText(wrappedLines[var15Lifetime1], param1, var14);
                  spaceExpansionQ8 = 0;
                } else {
                  this.drawText(wrappedLines[var15Lifetime1], param1, var14);
                }
                var14 = var14 + param10;
              } else {
                this.drawText(wrappedLines[var15Lifetime1], param1 + param3 - this.textWidth(wrappedLines[var15Lifetime1]), var14);
                var14 = var14 + param10;
              }
            } else {
              this.drawText(wrappedLines[var15Lifetime1], param1 + (param3 - this.textWidth(wrappedLines[var15Lifetime1])) / 2, var14);
              var14 = var14 + param10;
            }
          } else {
            this.drawText(wrappedLines[var15Lifetime1], param1, var14);
            var14 = var14 + param10;
          }
        }
        return var13;
    }

    final void setInlineSprites(IndexedSpriteState[] param0, int[] param1) {
        if (param1 != null &&
          param1.length != param0.length) {
          throw new IllegalArgumentException();
        }
        this.inlineSprites = param0;
        this.inlineSpriteBaselines = param1;
    }

    final int maxLineWidth(String param0, int param1) {
        int var5 = 0;
        int var3;
        int var4;
        int var6;
        var3 = this.wrapText(param0, new int[]{param1}, wrappedLines);
        var4 = 0;
        for (var5 = 0; var5 < var3; var5++) {
          var6 = this.textWidth(wrappedLines[var5]);
          if (var6 > var4) {
            var4 = var6;
          }
        }
        return var4;
    }

    abstract void drawGlyph(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6);

    final void drawRightAligned(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
          return;
        }
        this.resetTextStyle(param3, param4);
        this.drawText(param0, param1 - this.textWidth(param0), param2);
    }

    BitmapFont(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4) {
        int var8 = 0;
        int var6;
        int var7;
        this.baselineHeight = 0;
        this.field_B = param1;
        this.field_G = param2;
        this.field_y = param3;
        this.field_x = param4;
        this.decodeFontMetrics(param0);
        var6 = 2147483647;
        var7 = -2147483648;
        for (var8 = 0; var8 < 256; var8++) {
          if (this.field_G[var8] < var6 &&
            this.field_x[var8] != 0) {
            var6 = this.field_G[var8];
          }
          if (this.field_G[var8] + this.field_x[var8] > var7) {
            var7 = this.field_G[var8] + this.field_x[var8];
          }
        }
        this.maxAscent = this.baselineHeight - var6;
        this.maxDescent = var7 - this.baselineHeight;
        this.field_J = this.baselineHeight - this.field_G[88];
    }

    static {
        field_q = new StringBuilder(100);
        currentShadowColor = -1;
        defaultShadowColor = -1;
        spaceExpansionQ8 = 0;
        field_u = -1;
        currentTextColor = 0;
        wrappedLines = new String[100];
        field_s = 0;
        underlineColor = -1;
        defaultTextColor = 0;
        defaultAlpha = 256;
        currentAlpha = 256;
    }
}
