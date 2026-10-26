/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BitmapFontMetrics {
    private byte[] glyphAdvances;
    int maxAscent;
    int lineAdvance;
    private byte[][] pairKerning;
    static int[] field_b;
    int field_a;
    static boolean field_f;
    static sn[] field_c;
    int maxDescent;
    static gh field_g;

    final int measureCharacterAdvance(byte obfuscationGuard, int glyphIndex) {
        try {
          if (obfuscationGuard < 106) {
            this.a((RenderSprite[]) null, -22, 118, (String) null);
          }
          int stackIn_4_0 = this.glyphAdvances[glyphIndex] & 255;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "vs.H(" + obfuscationGuard + ',' + glyphIndex + ')');
        }
    }

    final static int b(int param0) {
        try {
          if (param0 >= -76) {
            field_b = (int[]) null;
          }
          int stackIn_4_0 = -ac.field_c + je.field_a;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "vs.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        try {
          field_c = null;
          field_g = null;
          if (param0 <= 108) {
            BitmapFontMetrics.a(77);
          }
          field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "vs.E(" + param0 + ')');
        }
    }

    private final int measureTextWidthWithImages(String text, byte obfuscationGuard, RenderSprite[] inlineImages) {
        int stackIn_73_0 = 0;
        String stackIn_78_2 = null;
        String stackIn_82_2 = null;
        boolean decompiledRegionSelector0 = false;
        Throwable decompiledCaughtException = null;
        boolean var12 = (AceOfSkies.obfuscationControl);
        try {
          if (null == text) {
            int stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          int var4_int = -1;
          int var5 = -1;
          int var6 = 0;
          int var7 = text.length();
          if (obfuscationGuard != -113) {
            this.maxAscent = -25;
          }
          int var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 >= var7))) {
            int var9 = text.charAt(var8);
            stackIn_73_0 = -61;
            if (!var12) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_73_0 == ~var9) {
                var4_int = var8;
              } else {
                boolean decompiledFrameRemainder1 = true;
                if (var9 == 62 &&
                  var4_int != -1) {
                  String var10 = text.substring(var4_int + 1, var8);
                  var4_int = -1;
                  if (!var10.equals("lt")) {
                    if (!var10.equals("gt")) {
                      if (!var10.equals("nbsp")) {
                        if (!var10.equals("shy")) {
                          if (var10.equals("times")) {
                            var9 = 215;
                            decompiledFrameRemainder1 = false;
                          } else if (var10.equals("euro")) {
                            var9 = 8364;
                            decompiledFrameRemainder1 = false;
                          } else {
                            if (!var10.equals("copy")) {
                              if (!var10.equals("reg") &&
                                (decompiledFrameRemainder0 = !(!var10.startsWith("img="))) &&
                                (decompiledFrameRemainder0 = (inlineImages != null))) {
                                try {
                                  int var11_int = td.a((CharSequence) ((Object) var10.substring(4)), (byte) 38);
                                  var5 = -1;
                                  var6 = var6 + inlineImages[var11_int].d();
                                  decompiledRegionSelector0 = false;
                                } catch (java.lang.Exception decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  Exception var11 = (Exception) (Object) decompiledCaughtException;
                                  decompiledRegionSelector0 = false;
                                }
                                decompiledFrameRemainder0 = ((decompiledRegionSelector0));
                              }
                              if (decompiledFrameRemainder0) {
                                var9 = 174;
                                decompiledFrameRemainder1 = false;
                              }
                            }
                            if (decompiledFrameRemainder1 &&
                              decompiledFrameRemainder0) {
                              var9 = 169;
                              decompiledFrameRemainder1 = false;
                            }
                          }
                        }
                        if (decompiledFrameRemainder1 &&
                          decompiledFrameRemainder0) {
                          var9 = 173;
                          decompiledFrameRemainder1 = false;
                        }
                      }
                      if (decompiledFrameRemainder1 &&
                        decompiledFrameRemainder0) {
                        var9 = 160;
                        decompiledFrameRemainder1 = false;
                      }
                    }
                    if (decompiledFrameRemainder1 &&
                      decompiledFrameRemainder0) {
                      var9 = 62;
                      decompiledFrameRemainder1 = false;
                    }
                  }
                  if (decompiledFrameRemainder1 &&
                    decompiledFrameRemainder0) {
                    var9 = 60;
                  }
                }
                if (decompiledFrameRemainder0 &&
                  var4_int == -1) {
                  var6 = var6 + (this.glyphAdvances[255 & ae.a((char) var9, obfuscationGuard ^ 1)] & 255);
                  if (this.pairKerning != null &&
                    var5 != -1) {
                    var6 = var6 + this.pairKerning[var5][var9];
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
            stackIn_73_0 = var6;
          }
          return stackIn_73_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var4 = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_77_0 = var4;
          StringBuilder stackIn_77_1 = new StringBuilder().append("vs.C(");
          if (text == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          StringBuilder stackIn_81_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(obfuscationGuard).append(',');
          if (inlineImages == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(')').toString());
        }
    }

    final String a(RenderSprite[] param0, int param1, int param2, String param3) {
        String stackIn_79_0 = null;
        String stackIn_84_2 = null;
        String stackIn_88_2 = null;
        boolean decompiledRegionSelector0 = false;
        Throwable decompiledCaughtException = null;
        boolean var14 = (AceOfSkies.obfuscationControl);
        try {
          if (this.measureTextWidthWithImages(param3, (byte) -113, param0) <= param2) {
            String stackIn_5_0 = (String) (param3);
            return stackIn_5_0;
          }
          param2 = param2 - this.measureTextWidthWithImages("...", (byte) -113, (RenderSprite[]) null);
          int var5_int = -1;
          int var6 = -1;
          int var7 = 0;
          int var8 = param3.length();
          String var9 = "";
          int var10 = param1;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 <= var10))) {
            stackIn_79_0 = (String) (param3);
            if (!var14) {
              boolean decompiledFrameRemainder0 = true;
              int var11 = ((String) (Object) stackIn_79_0).charAt(var10);
              if (var11 == 60) {
                var5_int = var10;
              } else {
                boolean decompiledFrameRemainder1 = true;
                if (var11 == 62 &&
                  var5_int != -1) {
                  String var12_ref_String = param3.substring(var5_int + 1, var10);
                  var5_int = -1;
                  if (!var12_ref_String.equals("lt")) {
                    if (var12_ref_String.equals("gt")) {
                      var11 = 62;
                      decompiledFrameRemainder1 = false;
                    } else if (var12_ref_String.equals("nbsp")) {
                      var11 = 160;
                      decompiledFrameRemainder1 = false;
                    } else if (var12_ref_String.equals("shy")) {
                      var11 = 173;
                      decompiledFrameRemainder1 = false;
                    } else if (var12_ref_String.equals("times")) {
                      var11 = 215;
                      decompiledFrameRemainder1 = false;
                    } else {
                      if (!var12_ref_String.equals("euro")) {
                        if (var12_ref_String.equals("copy")) {
                          var11 = 169;
                          decompiledFrameRemainder1 = false;
                        } else if (var12_ref_String.equals("reg")) {
                          var11 = 174;
                          decompiledFrameRemainder1 = false;
                        } else {
                          decompiledFrameRemainder0 = !(!var12_ref_String.startsWith("img="));
                          if (decompiledFrameRemainder0 &&
                            (decompiledFrameRemainder0 = (null != param0))) {
                            try {
                              int var13_int = td.a((CharSequence) ((Object) var12_ref_String.substring(4)), (byte) 38);
                              var7 = var7 + param0[var13_int].d();
                              var6 = -1;
                              if (param2 < var7) {
                                String stackIn_55_0 = var9 + "...";
                                return stackIn_55_0;
                              }
                              var9 = param3.substring(0, 1 + var10);
                              decompiledRegionSelector0 = false;
                            } catch (java.lang.Exception decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              Exception var13 = (Exception) (Object) decompiledCaughtException;
                              decompiledRegionSelector0 = false;
                            }
                            decompiledFrameRemainder0 = ((decompiledRegionSelector0));
                          }
                        }
                      }
                      if (decompiledFrameRemainder1 &&
                        decompiledFrameRemainder0) {
                        var11 = 8364;
                        decompiledFrameRemainder1 = false;
                      }
                    }
                  }
                  if (decompiledFrameRemainder1 &&
                    decompiledFrameRemainder0) {
                    var11 = 60;
                  }
                }
                if (decompiledFrameRemainder0 &&
                  var5_int == -1) {
                  var7 = var7 + (255 & this.glyphAdvances[ae.a((char) var11, -128) & 255]);
                  if (null != this.pairKerning &&
                    var6 != -1) {
                    var7 = var7 + this.pairKerning[var6][var11];
                  }
                  var6 = var11;
                  int var12 = var7;
                  if (this.pairKerning != null) {
                    var12 = var12 + this.pairKerning[var11][46];
                  }
                  if (var12 > param2) {
                    String stackIn_75_0 = var9 + "...";
                    return stackIn_75_0;
                  }
                  var9 = param3.substring(0, var10 + 1);
                }
              }
              var10++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_79_0 = (String) (param3);
          }
          return stackIn_79_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var5 = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_83_0 = var5;
          StringBuilder stackIn_83_1 = new StringBuilder().append("vs.D(");
          if (param0 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          StringBuilder stackIn_87_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_88_2 = "null";
          } else {
            stackIn_88_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_83_0), ((StringBuilder) (Object) stackIn_87_1).append(stackIn_88_2).append(')').toString());
        }
    }

    final int getPairKerning(int obfuscationGuard, char secondGlyph, int firstGlyph) {
        try {
          if (obfuscationGuard != 0) {
            this.measureCharacterAdvance((byte) -7, 58);
          }
          if (null != this.pairKerning) {
            byte stackIn_7_0 = this.pairKerning[firstGlyph][secondGlyph];
            return stackIn_7_0;
          }
          int stackIn_5_0 = 0;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var4), "vs.G(" + obfuscationGuard + ',' + secondGlyph + ',' + firstGlyph + ')');
        }
    }

    final int wrapText(int obfuscationGuard, RenderSprite[] inlineImages, int[] lineWidthLimits, String[] outputLines, String text) {
        int stackIn_131_2 = 0;
        int stackIn_153_0 = 0;
        int stackIn_153_1 = 0;
        String stackIn_162_2 = null;
        String stackIn_166_2 = null;
        String stackIn_170_2 = null;
        String stackIn_174_2 = null;
        boolean decompiledRegionSelector0 = false;
        Throwable decompiledCaughtException = null;
        int var19 = 0;
        boolean var22 = (AceOfSkies.obfuscationControl);
        try {
          if (text == null) {
            int stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          int var6_int = 0;
          int var7 = 0;
          int var8 = -1;
          int var9 = 0;
          int var10 = 0;
          int var11 = -1;
          int var13 = -22 / ((-48 - obfuscationGuard) / 48);
          int var12 = -1;
          int var14 = 0;
          int var15 = text.length();
          int var16 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var15 <= var16))) {
            int var17 = ae.a(text.charAt(var16), 102) & 255;
            int var18 = 0;
            stackIn_153_0 = -61;
            stackIn_153_1 = ~var17;
            if (!var22) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_153_0 == stackIn_153_1) {
                var11 = var16;
              } else {
                if (var11 != -1) {
                  decompiledFrameRemainder0 = (var17 == 62);
                  if (decompiledFrameRemainder0) {
                    var19 = var11;
                    String var20 = text.substring(1 + var11, var16);
                    var11 = -1;
                    if (var20.equals("br")) {
                      outputLines[var14] = text.substring(var7, var16 + 1);
                      var14++;
                      if (outputLines.length <= var14) {
                        int stackIn_23_0 = 0;
                        return stackIn_23_0;
                      }
                      var6_int = 0;
                      var8 = -1;
                      var12 = -1;
                      var7 = 1 + var16;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      regionExit1: {
                        if (var20.equals("lt")) {
                          var18 = var18 + this.measureCharacterAdvance((byte) 111, 60);
                          if (null != this.pairKerning &&
                            var12 != -1) {
                            var18 = var18 + this.pairKerning[var12][60];
                          }
                          var12 = 60;
                        } else {
                          if (!var20.equals("gt")) {
                            if (var20.equals("nbsp")) {
                              var18 = var18 + this.measureCharacterAdvance((byte) 107, 160);
                              if (this.pairKerning != null &&
                                var12 != -1) {
                                var18 = var18 + this.pairKerning[var12][160];
                              }
                              var12 = 160;
                            } else if (var20.equals("shy")) {
                              var18 = var18 + this.measureCharacterAdvance((byte) 110, 173);
                              if (this.pairKerning != null &&
                                var12 != -1) {
                                var18 = var18 + this.pairKerning[var12][173];
                              }
                              var12 = 173;
                            } else if (var20.equals("times")) {
                              var18 = var18 + this.measureCharacterAdvance((byte) 108, 215);
                              if (null != this.pairKerning &&
                                -1 != var12) {
                                var18 = var18 + this.pairKerning[var12][215];
                              }
                              var12 = 215;
                            } else if (var20.equals("euro")) {
                              var18 = var18 + this.measureCharacterAdvance((byte) 111, 8364);
                              if (this.pairKerning != null &&
                                -1 != var12) {
                                var18 = var18 + this.pairKerning[var12][8364];
                              }
                              var12 = 8364;
                            } else if (var20.equals("copy")) {
                              var18 = var18 + this.measureCharacterAdvance((byte) 108, 169);
                              if (this.pairKerning != null &&
                                var12 != -1) {
                                var18 = var18 + this.pairKerning[var12][169];
                              }
                              var12 = 169;
                            } else {
                              if (!var20.equals("reg")) {
                                if (!var20.startsWith("img=")) {
                                  break regionExit1;
                                }
                                if (null == inlineImages) {
                                  break regionExit1;
                                }
                                try {
                                  int var21_int = td.a((CharSequence) ((Object) var20.substring(4)), (byte) 38);
                                  var12 = -1;
                                  var18 = var18 + inlineImages[var21_int].d();
                                  decompiledRegionSelector0 = false;
                                } catch (java.lang.Exception decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  Exception var21 = (Exception) (Object) decompiledCaughtException;
                                  decompiledRegionSelector0 = false;
                                }
                                if (!decompiledRegionSelector0) {
                                  break regionExit1;
                                }
                              }
                              var18 = var18 + this.measureCharacterAdvance((byte) 126, 174);
                              if (this.pairKerning != null &&
                                -1 != var12) {
                                var18 = var18 + this.pairKerning[var12][174];
                              }
                              var12 = 174;
                            }
                            break regionExit1;
                          }
                          var18 = var18 + this.measureCharacterAdvance((byte) 118, 62);
                          if (null != this.pairKerning &&
                            var12 != -1) {
                            var18 = var18 + this.pairKerning[var12][62];
                          }
                          var12 = 62;
                        }
                      }
                      var17 = -1;
                    }
                  }
                } else {
                  var19 = var16;
                  var18 = var18 + this.measureCharacterAdvance((byte) 113, var17);
                  if (this.pairKerning != null &&
                    var12 != -1) {
                    var18 = var18 + this.pairKerning[var12][var17];
                  }
                  var12 = var17;
                }
                if (decompiledFrameRemainder0 &&
                  var18 > 0) {
                  var6_int = var6_int + var18;
                  if (lineWidthLimits != null) {
                    if (var17 == 32) {
                      var10 = 1;
                      var8 = var16;
                      var9 = var6_int;
                    }
                    int stackIn_130_0 = ~var6_int;
                    int[] stackIn_130_1 = (int[]) (lineWidthLimits);
                    if (var14 < lineWidthLimits.length) {
                      stackIn_131_2 = var14;
                    } else {
                      stackIn_131_2 = lineWidthLimits.length - 1;
                    }
                    if (stackIn_130_0 < ~stackIn_130_1[stackIn_131_2]) {
                      if (0 <= var8) {
                        outputLines[var14] = text.substring(var7, var8 + 1 - var10);
                        var14++;
                        if (var14 >= outputLines.length) {
                          int stackIn_141_0 = 0;
                          return stackIn_141_0;
                        }
                        var7 = var8 + 1;
                        var8 = -1;
                        var12 = -1;
                        var6_int = var6_int - var9;
                      } else {
                        outputLines[var14] = text.substring(var7, var19);
                        var14++;
                        if (outputLines.length <= var14) {
                          int stackIn_147_0 = 0;
                          return stackIn_147_0;
                        }
                        var7 = var19;
                        var8 = -1;
                        var12 = -1;
                        var6_int = var18;
                      }
                    }
                    if (var17 == 45) {
                      var8 = var16;
                      var10 = 0;
                      var9 = var6_int;
                    }
                  }
                }
              }
              var16++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_153_0 = text.length();
            stackIn_153_1 = var7;
          }
          if (stackIn_153_0 > stackIn_153_1) {
            outputLines[var14] = text.substring(var7, text.length());
            var14++;
          }
          int stackIn_157_0 = var14;
          return stackIn_157_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var6 = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_161_0 = var6;
          StringBuilder stackIn_161_1 = new StringBuilder().append("vs.A(").append(obfuscationGuard).append(',');
          if (inlineImages == null) {
            stackIn_162_2 = "null";
          } else {
            stackIn_162_2 = "{...}";
          }
          StringBuilder stackIn_165_1 = ((StringBuilder) (Object) stackIn_161_1).append(stackIn_162_2).append(',');
          if (lineWidthLimits == null) {
            stackIn_166_2 = "null";
          } else {
            stackIn_166_2 = "{...}";
          }
          StringBuilder stackIn_169_1 = ((StringBuilder) (Object) stackIn_165_1).append(stackIn_166_2).append(',');
          if (outputLines == null) {
            stackIn_170_2 = "null";
          } else {
            stackIn_170_2 = "{...}";
          }
          StringBuilder stackIn_173_1 = ((StringBuilder) (Object) stackIn_169_1).append(stackIn_170_2).append(',');
          if (text == null) {
            stackIn_174_2 = "null";
          } else {
            stackIn_174_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_161_0), ((StringBuilder) (Object) stackIn_173_1).append(stackIn_174_2).append(')').toString());
        }
    }

    final int measureTextWidth(byte obfuscationGuard, String text) {
        String stackIn_9_2 = null;
        try {
          if (obfuscationGuard == 94) {
            int stackIn_4_0 = this.measureTextWidthWithImages(text, (byte) -113, (RenderSprite[]) null);
            return stackIn_4_0;
          }
          int stackIn_2_0 = 39;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("vs.F(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    BitmapFontMetrics(byte[] encodedMetrics) {
        int stackIn_35_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_75_0 = 0;
        String stackIn_81_2 = null;
        boolean var12 = (AceOfSkies.obfuscationControl);
        try {
          PacketBuffer var2 = new PacketBuffer(encodedMetrics);
          int var3 = var2.readUnsignedByte(-52);
          if (0 != var3) {
            throw new RuntimeException("");
          }
          boolean stackIn_8_0 = !(var2.readUnsignedByte(43) != 1);
          boolean decompiledFrameCompleted0 = true;
          boolean var4 = stackIn_8_0;
          this.glyphAdvances = new byte[256];
          var2.a(0, 7186, 256, this.glyphAdvances);
          if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            int var7_int = 0;
            do {
              if (var7_int >= 256) {
                var7_int = 0;
                break;
              }
              var5[var7_int] = var2.readUnsignedByte(-87);
              var7_int++;
            } while (!var12);
            while (var7_int < 256) {
              var6[var7_int] = var2.readUnsignedByte(-51);
              var7_int++;
              if (var12) {
                return;
              }
            }
            byte[][] var7 = new byte[256][];
            int var8_int = 0;
            scanLoop1: while (true) {
              if (256 > var8_int) {
                byte[] array$0 = new byte[var5[var8_int]];
                var7[var8_int] = array$0;
                int var9 = 0;
                stackIn_35_0 = 0;
                if (var12) {
                  break scanLoop1;
                }
                int var10 = stackIn_35_0;
                while (var10 < var7[var8_int].length) {
                  var9 = (byte)(var9 + var2.readByte(0));
                  var7[var8_int][var10] = (byte) var9;
                  var10++;
                }
                var8_int++;
                continue;
              }
              stackIn_35_0 = 256;
              break;
            }
            byte[][] var8 = new byte[stackIn_35_0][];
            int var9Lifetime1 = 0;
            scanLoop2: while (true) {
              if (var9Lifetime1 < 256) {
                byte[] array$1 = new byte[var5[var9Lifetime1]];
                var8[var9Lifetime1] = array$1;
                int var10Lifetime1 = 0;
                stackIn_47_0 = 0;
                if (var12) {
                  break scanLoop2;
                }
                int var11 = stackIn_47_0;
                while (var8[var9Lifetime1].length > var11) {
                  var10Lifetime1 = (byte)(var10Lifetime1 + var2.readByte(0));
                  var8[var9Lifetime1][var11] = (byte) var10Lifetime1;
                  var11++;
                }
                var9Lifetime1++;
                continue;
              }
              this.pairKerning = new byte[256][256];
              stackIn_47_0 = 0;
              break;
            }
            int var9Lifetime2 = stackIn_47_0;
            while (true) {
              int stackIn_49_0 = ~var9Lifetime2;
              int stackIn_49_1 = -257;
              if (stackIn_49_0 > stackIn_49_1) {
                stackIn_75_0 = var9Lifetime2;
                if (var12) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_75_0 != 32 &&
                  160 != var9Lifetime2) {
                  int var10Lifetime2 = 0;
                  while (var10Lifetime2 < 256) {
                    stackIn_49_0 = ~var10Lifetime2;
                    stackIn_49_1 = -33;
                    if (stackIn_49_0 != stackIn_49_1 && (var10Lifetime2 != 160 ||
                      var12)) {
                      this.pairKerning[var9Lifetime2][var10Lifetime2] = (byte)sb.a(var8, var10Lifetime2, -1, var5, var6, var7, var9Lifetime2, this.glyphAdvances);
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
              this.lineAdvance = var6[32] + var5[32];
            }
          }
          if (decompiledFrameCompleted0) {
            if (!var4 ||
              var12) {
              this.lineAdvance = var2.readUnsignedByte(76);
            }
            this.field_a = var2.readUnsignedByte(-110);
            stackIn_75_0 = var2.readUnsignedByte(96);
          }
          this.maxAscent = var2.readUnsignedByte(-103);
          this.maxDescent = var2.readUnsignedByte(-48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_80_0 = var2_ref;
          StringBuilder stackIn_80_1 = new StringBuilder().append("vs.<init>(");
          if (encodedMetrics == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    static {
    }
}
