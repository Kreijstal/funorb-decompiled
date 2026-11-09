/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FontMetrics {
    int field_d;
    private byte[] advances;
    int field_h;
    int field_c;
    private byte[][] kerningTable;
    int field_i;
    static DisplayModeFailure FULLSCREEN_CONFIRMATION_TIMEOUT;
    static int[] field_e;
    static TextureCombineSource PREVIOUS;
    static int field_b;

    final int stringWidth(String text, int guard) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 0) {
            FULLSCREEN_CONFIRMATION_TIMEOUT = (DisplayModeFailure) null;
          }
          stackIn_4_0 = this.stringWidth(0, (ToolkitSprite[]) null, text);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ta.F(");
          if (text == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(')').toString());
        }
    }

    final int wrapLines(String text, boolean guard, String[] lines, int[] lineWidths, ToolkitSprite[] inlineSprites) {
        int discarded$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_139_0 = 0;
        int[] stackIn_139_1 = null;
        int stackIn_140_2 = 0;
        int stackIn_150_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        int stackIn_168_0 = 0;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        String stackIn_173_2 = null;
        StringBuilder stackIn_176_1 = null;
        String stackIn_177_2 = null;
        StringBuilder stackIn_180_1 = null;
        String stackIn_181_2 = null;
        StringBuilder stackIn_184_1 = null;
        String stackIn_185_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        String var19 = null;
        int var20_int = 0;
        Exception var20 = null;
        int var21 = 0;
        var21 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (null == text) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var6_int = 0;
          var7 = 0;
          var8 = -1;
          var9 = 0;
          var10 = 0;
          var11 = -1;
          if (guard) {
            discarded$0 = this.stringWidth(-94, (ToolkitSprite[]) null, (String) null);
          }
          var12 = -1;
          var13 = 0;
          var14 = text.length();
          var15 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var15 >= var14))) {
            var16 = HardwareReflectionEffect.a(true, text.charAt(var15)) & 255;
            var17 = 0;
            stackIn_164_0 = ~var16;
            stackIn_164_1 = -61;
            if (var21 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_164_0 == stackIn_164_1) {
                var11 = var15;
              } else {
                if (-1 != var11) {
                  decompiledFrameRemainder0 = (var16 == 62);
                  if (decompiledFrameRemainder0) {
                    var18 = var11;
                    var19 = text.substring(1 + var11, var15);
                    var11 = -1;
                    if (var19.equals("br")) {
                      lines[var13] = text.substring(var7, var15 + 1);
                      var13++;
                      if (lines.length <= var13) {
                        stackIn_26_0 = 0;
                        return stackIn_26_0;
                      }
                      var7 = 1 + var15;
                      var6_int = 0;
                      var8 = -1;
                      var12 = -1;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      regionExit1: {
                        if (!var19.equals("lt")) {
                          if (var19.equals("gt")) {
                            var17 = var17 + this.characterWidth(62, (byte) -53);
                            if (null != this.kerningTable &&
                              -1 != var12) {
                              var17 = var17 + this.kerningTable[var12][62];
                            }
                            var12 = 62;
                          } else {
                            if (!var19.equals("nbsp")) {
                              if (var19.equals("shy")) {
                                var17 = var17 + this.characterWidth(173, (byte) -53);
                                if (this.kerningTable != null &&
                                  var12 != -1) {
                                  var17 = var17 + this.kerningTable[var12][173];
                                }
                                var12 = 173;
                              } else {
                                if (!var19.equals("times")) {
                                  if (!var19.equals("euro")) {
                                    if (!var19.equals("copy")) {
                                      if (!var19.equals("reg")) {
                                        if (!var19.startsWith("img=")) {
                                          break regionExit1;
                                        }
                                        if (inlineSprites == null) {
                                          break regionExit1;
                                        }
                                        try {
                                          var20_int = LoginFormState.parseDecimal((byte) -128, (CharSequence) ((Object) var19.substring(4)));
                                          var17 = var17 + inlineSprites[var20_int].paddedWidth();
                                          var12 = -1;
                                          decompiledRegionSelector0 = 0;
                                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                                          decompiledCaughtException = decompiledCaughtParameter0;
                                          var20 = (Exception) (Object) decompiledCaughtException;
                                          decompiledRegionSelector0 = 0;
                                        }
                                        if (decompiledRegionSelector0 == 0) {
                                          break regionExit1;
                                        }
                                      }
                                      var17 = var17 + this.characterWidth(174, (byte) -53);
                                      if (this.kerningTable != null &&
                                        var12 != -1) {
                                        var17 = var17 + this.kerningTable[var12][174];
                                      }
                                      var12 = 174;
                                    } else {
                                      var17 = var17 + this.characterWidth(169, (byte) -53);
                                      if (null != this.kerningTable &&
                                        -1 != var12) {
                                        var17 = var17 + this.kerningTable[var12][169];
                                      }
                                      var12 = 169;
                                    }
                                  } else {
                                    var17 = var17 + this.characterWidth(8364, (byte) -53);
                                    if (null != this.kerningTable &&
                                      var12 != -1) {
                                      var17 = var17 + this.kerningTable[var12][8364];
                                    }
                                    var12 = 8364;
                                  }
                                } else {
                                  var17 = var17 + this.characterWidth(215, (byte) -53);
                                  if (this.kerningTable != null &&
                                    var12 != -1) {
                                    var17 = var17 + this.kerningTable[var12][215];
                                  }
                                  var12 = 215;
                                }
                              }
                            } else {
                              var17 = var17 + this.characterWidth(160, (byte) -53);
                              if (null != this.kerningTable &&
                                var12 != -1) {
                                var17 = var17 + this.kerningTable[var12][160];
                              }
                              var12 = 160;
                            }
                          }
                          break regionExit1;
                        }
                        var17 = var17 + this.characterWidth(60, (byte) -53);
                        if (this.kerningTable != null &&
                          var12 != -1) {
                          var17 = var17 + this.kerningTable[var12][60];
                        }
                        var12 = 60;
                      }
                      var16 = -1;
                    }
                  }
                } else {
                  var18 = var15;
                  var17 = var17 + this.characterWidth(var16, (byte) -53);
                  if (null != this.kerningTable &&
                    var12 != -1) {
                    var17 = var17 + this.kerningTable[var12][var16];
                  }
                  var12 = var16;
                }
                if ((decompiledFrameRemainder0) &&
                  (var17 > 0)) {
                  var6_int = var6_int + var17;
                  if (lineWidths != null) {
                    if (var16 == 32) {
                      var8 = var15;
                      var10 = 1;
                      var9 = var6_int;
                    }
                    stackIn_139_0 = var6_int;
                    stackIn_139_1 = (int[]) (lineWidths);
                    if (var13 >= lineWidths.length) {
                      stackIn_140_2 = -1 + lineWidths.length;
                    } else {
                      stackIn_140_2 = var13;
                    }
                    if (stackIn_139_0 > stackIn_139_1[stackIn_140_2]) {
                      if (0 <= var8) {
                        lines[var13] = text.substring(var7, 1 + var8 - var10);
                        var13++;
                        if (lines.length <= var13) {
                          stackIn_150_0 = 0;
                          return stackIn_150_0;
                        }
                        var7 = var8 + 1;
                        var6_int = var6_int - var9;
                        var8 = -1;
                        var12 = -1;
                      } else {
                        lines[var13] = text.substring(var7, var18);
                        var13++;
                        if (lines.length <= var13) {
                          stackIn_156_0 = 0;
                          return stackIn_156_0;
                        }
                        var7 = var18;
                        var6_int = var17;
                        var8 = -1;
                        var12 = -1;
                      }
                    }
                    if (var16 == 45) {
                      var10 = 0;
                      var8 = var15;
                      var9 = var6_int;
                    }
                  }
                }
              }
              var15++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_164_0 = var7;
            stackIn_164_1 = text.length();
          }
          if (stackIn_164_0 < stackIn_164_1) {
            lines[var13] = text.substring(var7, text.length());
            var13++;
          }
          stackIn_168_0 = var13;
          return stackIn_168_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_172_0 = var6;
          stackIn_172_1 = new StringBuilder().append("ta.G(");
          if (text == null) {
            stackIn_173_2 = "null";
          } else {
            stackIn_173_2 = "{...}";
          }
          stackIn_176_1 = ((StringBuilder) (Object) stackIn_172_1).append(stackIn_173_2).append(',').append(guard).append(',');
          if (lines == null) {
            stackIn_177_2 = "null";
          } else {
            stackIn_177_2 = "{...}";
          }
          stackIn_180_1 = ((StringBuilder) (Object) stackIn_176_1).append(stackIn_177_2).append(',');
          if (lineWidths == null) {
            stackIn_181_2 = "null";
          } else {
            stackIn_181_2 = "{...}";
          }
          stackIn_184_1 = ((StringBuilder) (Object) stackIn_180_1).append(stackIn_181_2).append(',');
          if (inlineSprites == null) {
            stackIn_185_2 = "null";
          } else {
            stackIn_185_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_172_0), ((StringBuilder) (Object) stackIn_184_1).append(stackIn_185_2).append(')').toString());
        }
    }

    private final int stringWidth(int guard, ToolkitSprite[] inlineSprites, String text) {
        int stackIn_3_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11_int = 0;
        Exception var11 = null;
        int var12 = 0;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (null == text) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var4_int = -1;
          var5 = -1;
          var6 = 0;
          var7 = text.length();
          var8 = guard;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var7 <= var8))) {
            var9 = text.charAt(var8);
            stackIn_65_0 = -61;
            if (var12 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_65_0 == ~var9) {
                var4_int = var8;
              } else {
                if (var9 == 62 &&
                  var4_int != -1) {
                  var10 = text.substring(1 + var4_int, var8);
                  var4_int = -1;
                  if (var10.equals("lt")) {
                    var9 = 60;
                  } else {
                    if (var10.equals("gt")) {
                      var9 = 62;
                    } else {
                      if (var10.equals("nbsp")) {
                        var9 = 160;
                      } else {
                        if (var10.equals("shy")) {
                          var9 = 173;
                        } else {
                          if (var10.equals("times")) {
                            var9 = 215;
                          } else {
                            if (var10.equals("euro")) {
                              var9 = 8364;
                            } else {
                              if (var10.equals("copy")) {
                                var9 = 169;
                              } else {
                                if ((!var10.equals("reg")) &&
                                  (decompiledFrameRemainder0 = !(!var10.startsWith("img="))) &&
                                  (decompiledFrameRemainder0 = (inlineSprites != null))) {
                                  try {
                                    var11_int = LoginFormState.parseDecimal((byte) -127, (CharSequence) ((Object) var10.substring(4)));
                                    var5 = -1;
                                    var6 = var6 + inlineSprites[var11_int].paddedWidth();
                                    decompiledRegionSelector0 = 0;
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    var11 = (Exception) (Object) decompiledCaughtException;
                                    decompiledRegionSelector0 = 0;
                                  }
                                  decompiledFrameRemainder0 = (decompiledRegionSelector0 != 0);
                                }
                                if (decompiledFrameRemainder0) {
                                  var9 = 174;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (var4_int == -1)) {
                  var6 = var6 + (255 & this.advances[HardwareReflectionEffect.a(true, (char) var9) & 255]);
                  if (null != this.kerningTable &&
                    var5 != -1) {
                    var6 = var6 + this.kerningTable[var5][var9];
                  }
                  var5 = var9;
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_65_0 = var6;
          }
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_69_0 = var4;
          stackIn_69_1 = new StringBuilder().append("ta.H(").append(guard).append(',');
          if (inlineSprites == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',');
          if (text == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    final int characterWidth(int character, byte guard) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -53) {
            this.field_h = -30;
          }
          stackIn_4_0 = this.advances[character] & 255;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var3), "ta.E(" + character + ',' + guard + ')');
        }
    }

    final String ellipsize(int maxWidth, String text, ToolkitSprite[] inlineSprites, int guard) {
        String stackIn_5_0 = null;
        String stackIn_54_0 = null;
        String stackIn_73_0 = null;
        String stackIn_77_0 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_86_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String var12_ref_String = null;
        int var12 = 0;
        int var13_int = 0;
        Exception var13 = null;
        int var14 = 0;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.stringWidth(guard ^ -63, inlineSprites, text) <= maxWidth) {
            stackIn_5_0 = (String) (text);
            return stackIn_5_0;
          }
          maxWidth = maxWidth - this.stringWidth(guard ^ guard, (ToolkitSprite[]) null, "...");
          var5_int = -1;
          var6 = -1;
          var7 = 0;
          var8 = text.length();
          var9 = "";
          var10 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 <= var10))) {
            stackIn_77_0 = (String) (text);
            if (var14 == 0) {
              boolean decompiledFrameRemainder0 = true;
              var11 = ((String) (Object) stackIn_77_0).charAt(var10);
              if (60 == var11) {
                var5_int = var10;
              } else {
                boolean decompiledFrameRemainder1 = true;
                if (var11 == 62 &&
                  var5_int != -1) {
                  var12_ref_String = text.substring(var5_int + 1, var10);
                  var5_int = -1;
                  if (var12_ref_String.equals("lt")) {
                    var11 = 60;
                  } else {
                    if (!var12_ref_String.equals("gt")) {
                      if (var12_ref_String.equals("nbsp")) {
                        var11 = 160;
                        decompiledFrameRemainder1 = false;
                      }
                      else {
                        if (var12_ref_String.equals("shy")) {
                          var11 = 173;
                          decompiledFrameRemainder1 = false;
                        }
                        else {
                          if (var12_ref_String.equals("times")) {
                            var11 = 215;
                            decompiledFrameRemainder1 = false;
                          }
                          else {
                            if (!var12_ref_String.equals("euro")) {
                              if (var12_ref_String.equals("copy")) {
                                var11 = 169;
                                decompiledFrameRemainder1 = false;
                              }
                              else {
                                if ((!var12_ref_String.equals("reg")) &&
                                  (decompiledFrameRemainder0 = !(!var12_ref_String.startsWith("img="))) &&
                                  (decompiledFrameRemainder0 = (null != inlineSprites))) {
                                  try {
                                    var13_int = LoginFormState.parseDecimal((byte) -127, (CharSequence) ((Object) var12_ref_String.substring(4)));
                                    var6 = -1;
                                    var7 = var7 + inlineSprites[var13_int].paddedWidth();
                                    if (var7 > maxWidth) {
                                      stackIn_54_0 = var9 + "...";
                                      return stackIn_54_0;
                                    }
                                    var9 = text.substring(0, 1 + var10);
                                    decompiledRegionSelector0 = 0;
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    var13 = (Exception) (Object) decompiledCaughtException;
                                    decompiledRegionSelector0 = 0;
                                  }
                                  decompiledFrameRemainder0 = (decompiledRegionSelector0 != 0);
                                }
                                if (decompiledFrameRemainder0) {
                                  var11 = 174;
                                  decompiledFrameRemainder1 = false;
                                }
                              }
                            }
                            if ((decompiledFrameRemainder1) &&
                              (decompiledFrameRemainder0)) {
                              var11 = 8364;
                              decompiledFrameRemainder1 = false;
                            }
                          }
                        }
                      }
                    }
                    if ((decompiledFrameRemainder1) &&
                      (decompiledFrameRemainder0)) {
                      var11 = 62;
                    }
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (var5_int == -1)) {
                  var7 = var7 + (this.advances[HardwareReflectionEffect.a(true, (char) var11) & 255] & 255);
                  if (null != this.kerningTable &&
                    var6 != -1) {
                    var7 = var7 + this.kerningTable[var6][var11];
                  }
                  var6 = var11;
                  var12 = var7;
                  if (this.kerningTable != null) {
                    var12 = var12 + this.kerningTable[var11][46];
                  }
                  if (var12 > maxWidth) {
                    stackIn_73_0 = var9 + "...";
                    return stackIn_73_0;
                  }
                  var9 = text.substring(0, var10 + 1);
                }
              }
              var10++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_77_0 = (String) (text);
          }
          return stackIn_77_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_81_0 = var5;
          stackIn_81_1 = new StringBuilder().append("ta.C(").append(maxWidth).append(',');
          if (text == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          stackIn_85_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',');
          if (inlineSprites == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',').append(guard).append(')').toString());
        }
    }

    final static Sprite[] createBeveledPanelSprites(int backgroundColor, int guard, int lightColor, int darkColor) {
        RuntimeException var4 = null;
        Sprite[] stackIn_2_0 = null;
        Sprite[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard > 87) {
            stackIn_4_0 = FallbackShaderEffect.createBeveledPanelSprites(darkColor, 1, 0, backgroundColor, lightColor);
            return stackIn_4_0;
          }
          stackIn_2_0 = (Sprite[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var4), "ta.D(" + backgroundColor + ',' + guard + ',' + lightColor + ',' + darkColor + ')');
        }
    }

    final int kerning(int guard, char nextCharacter, int previousCharacter) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        byte stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard >= -49) {
            this.characterWidth(-23, (byte) 121);
          }
          if (null != this.kerningTable) {
            stackIn_7_0 = this.kerningTable[previousCharacter][nextCharacter];
            return stackIn_7_0;
          }
          stackIn_5_0 = 0;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var4), "ta.A(" + guard + ',' + nextCharacter + ',' + previousCharacter + ')');
        }
    }

    public static void releaseStatics(boolean guard) {
        try {
          FULLSCREEN_CONFIRMATION_TIMEOUT = null;
          field_e = null;
          PREVIOUS = null;
          if (guard) {
            field_b = -45;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ta.B(" + guard + ')');
        }
    }

    FontMetrics(byte[] param0) {
        byte[] array$0 = null;
        byte[] array$1 = null;
        int stackIn_8_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        PacketBuffer var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int var7_int = 0;
        byte[][] var7 = null;
        int var8_int = 0;
        byte[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_77_0Lifetime1;
        int var7_intLifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2 = new PacketBuffer(param0);
          var3 = var2.readUnsignedByte(-31302);
          if (var3 != 0) {
            throw new RuntimeException("");
          }
          stackIn_8_0 = (1 != var2.readUnsignedByte(-31302)) ? 0 : 1;
          boolean decompiledFrameCompleted0 = true;
          var4 = stackIn_8_0;
          this.advances = new byte[256];
          var2.readBytes(this.advances, 256, 0, (byte) -101);
          if (var4 == 0) {
            this.field_d = var2.readUnsignedByte(-31302);
          }
          if (var4 != 0 ||
            var12 != 0) {
            var5 = new int[256];
            var7_int = 0;
            while (var7_int < 256) {
              var5[var7_int] = var2.readUnsignedByte(-31302);
              var7_int++;
              if (var12 != 0) {
                return;
              }
            }
            var6 = new int[256];
            var7_intLifetime1 = 0;
            while (var7_intLifetime1 < 256) {
              var6[var7_intLifetime1] = var2.readUnsignedByte(-31302);
              var7_intLifetime1++;
              if (var12 != 0) {
                return;
              }
            }
            var7 = new byte[256][];
            var8_int = 0;
            scanLoop1: while (true) {
              if (var8_int < 256) {
                array$0 = new byte[var5[var8_int]];
                var7[var8_int] = array$0;
                var9 = 0;
                stackIn_36_0 = 0;
                if (var12 != 0) {
                  break scanLoop1;
                }
                var10 = stackIn_36_0;
                while (var10 < var7[var8_int].length) {
                  var9 = (byte)(var9 + var2.readByte(true));
                  var7[var8_int][var10] = (byte) var9;
                  var10++;
                }
                var8_int++;
                continue;
              }
              stackIn_36_0 = 256;
              break;
            }
            var8 = new byte[stackIn_36_0][];
            var9Lifetime1 = 0;
            scanLoop2: while (true) {
              if (var9Lifetime1 < 256) {
                array$1 = new byte[var5[var9Lifetime1]];
                var8[var9Lifetime1] = array$1;
                var10Lifetime1 = 0;
                stackIn_48_0 = 0;
                if (var12 != 0) {
                  break scanLoop2;
                }
                var11 = stackIn_48_0;
                while (var8[var9Lifetime1].length > var11) {
                  var10Lifetime1 = (byte)(var10Lifetime1 + var2.readByte(true));
                  var8[var9Lifetime1][var11] = (byte) var10Lifetime1;
                  var11++;
                }
                var9Lifetime1++;
                continue;
              }
              this.kerningTable = new byte[256][256];
              stackIn_48_0 = 0;
              break;
            }
            var9Lifetime2 = stackIn_48_0;
            while (true) {
              stackIn_50_0 = var9Lifetime2;
              stackIn_50_1 = 256;
              if (stackIn_50_0 < stackIn_50_1) {
                stackIn_77_0 = ~var9Lifetime2;
                if (var12 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_77_0 != -33 && (160 != var9Lifetime2 ||
                  var12 != 0)) {
                  var10Lifetime2 = 0;
                  while (var10Lifetime2 < 256) {
                    stackIn_50_0 = var10Lifetime2;
                    stackIn_50_1 = 32;
                    if (stackIn_50_0 != stackIn_50_1 && (var10Lifetime2 != 160 ||
                      var12 != 0)) {
                      this.kerningTable[var9Lifetime2][var10Lifetime2] = (byte)OpenGlEnvironmentWaterEffect.a(var9Lifetime2, var10Lifetime2, this.advances, var7, var6, (byte) -75, var8, var5);
                    }
                    var10Lifetime2++;
                  }
                }
                var9Lifetime2++;
                continue;
              }
              break;
            }
            if (decompiledFrameCompleted0) {
              this.field_d = var6[32] + var5[32];
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_h = var2.readUnsignedByte(-31302);
            stackIn_77_0Lifetime1 = var2.readUnsignedByte(-31302);
          }
          this.field_i = var2.readUnsignedByte(-31302);
          this.field_c = var2.readUnsignedByte(-31302);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_82_0 = var2_ref;
          stackIn_82_1 = new StringBuilder().append("ta.<init>(");
          if (param0 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_82_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(')').toString());
        }
    }

    static {
        FULLSCREEN_CONFIRMATION_TIMEOUT = new DisplayModeFailure();
        field_e = new int[8192];
        PREVIOUS = new TextureCombineSource();
    }
}
