/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ToolkitFont {
    private ToolkitFontMetrics metrics;
    private GraphicsToolkit toolkit;

    private final void resetStyle(int param0, int param1, int param2) {
        DateOfBirthInput.fontUnderlineColor = -1;
        if (param0 == -1) {
          param0 = 0;
        }
        CarouselPlayerInfoFactory.fontDefaultColor = param2;
        TimedSpecialOrderBehaviour.fontColor = param2;
        ConstantMonochromeTextureOperation.fontJustificationStep = param1;
        oib.fontJustificationRemainder = 0;
        SetGrapplingHookRopeChangeRate.fontStrikethroughColor = -1;
        MapClearanceAreaFactory.fontDefaultShadowColor = param0;
        SetThrusterAutobalancing.fontShadowColor = param0;
    }

    abstract void drawGlyphMasked(char param0, int param1, int param2, int param3, boolean param4, GlyphMask param5, int param6, int param7);

    final int drawParagraph(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, boolean param7, int param8, int param9, String param10, int param11, int param12, ToolkitSprite[] param13, int param14, GlyphMask param15) {
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
        RuntimeException var17 = null;
        int[] var18 = null;
        try {
          if (param7) {
            var18 = (int[]) null;
            this.drawStringInternal(-23, -25, 54, (ToolkitSprite[]) null, (String) null, 8, -16, (GlyphMask) null, (int[]) null);
          }
          stackIn_3_0 = this.drawParagraph(param12, param3, param8, param10, param6, param13, param11, param0, 516, param4, param9, param1, param15, param2, 0, param5, param14);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_6_0 = var17;
          stackIn_6_1 = new StringBuilder().append("da.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void setJustification(int param0, int param1, String param2) {
        int var7 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var9 = VoidHunters.field_G;
        try {
          var5 = 114 / ((-63 - param0) / 42);
          var4_int = 0;
          var6 = 0;
          for (var7 = 0; var7 < param2.length(); var7++) {
            var8 = param2.charAt(var7);
            if (60 == var8) {
              var6 = 1;
            } else {
              if (62 != var8) {
                if (var6 == 0 &&
                  var8 == 32) {
                  var4_int++;
                }
              } else {
                var6 = 0;
              }
            }
          }
          if (0 < var4_int) {
            ConstantMonochromeTextureOperation.fontJustificationStep = (-this.metrics.getStringWidth(param2, 1) + param1 << 8) / var4_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("da.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final int drawParagraph(int param0, int param1, int param2, String param3, int[] param4, ToolkitSprite[] param5, int param6, int param7, int param8, int param9, int param10, int param11, GlyphMask param12, int param13, int param14, int param15, int param16) {
        int stackIn_3_0 = 0;
        int stackIn_22_0 = 0;
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
        int var21Lifetime1;
        var22 = VoidHunters.field_G;
        try {
          if (param3 == null) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          this.resetStyle(param0, 0, param16);
          if (0 == param11) {
            param11 = this.metrics.ascent;
          }
          if (param7 < this.metrics.maxAscent + this.metrics.maxDescent + param11 &&
            param7 < param11 + param11) {
            var18 = null;
          } else {
            var18 = new int[]{param10};
          }
          if (param14 == -1) {
            param14 = param7 / param11;
            if (param14 <= 0) {
              param14 = 1;
            }
          }
          var19 = this.metrics.wrapLines(param3, param5, (int[]) (var18), SetUseRectFill.field_o, 4);
          if (param14 > 0 &&
            var19 >= param14) {
            var19 = param14;
            SetUseRectFill.field_o[param14 - 1] = this.metrics.truncateWithEllipsis(SetUseRectFill.field_o[param14 - 1], param10, -62, param5);
          }
          if (param13 == 3 &&
            var19 == 1) {
            param13 = 1;
          }
          if (param8 != 516) {
            stackIn_22_0 = 10;
            return stackIn_22_0;
          }
          if (param13 != 0) {
            if (param13 != 1) {
              if (param13 != 2) {
                var21 = (-((-1 + var19) * param11) + (-this.metrics.maxDescent - this.metrics.maxAscent + param7)) / (var19 + 1);
                if (var21 < 0) {
                  var21 = 0;
                }
                var20 = var21 + param9 + this.metrics.maxAscent;
                param11 = param11 + var21;
              } else {
                var20 = -((var19 - 1) * param11) + (param7 + (param9 - this.metrics.maxDescent));
              }
            } else {
              var20 = this.metrics.maxAscent + (param9 + (param7 - (this.metrics.maxAscent + this.metrics.maxDescent + param11 * (-1 + var19))) / 2);
            }
          } else {
            var20 = param9 + this.metrics.maxAscent;
          }
          for (var21Lifetime1 = 0; var19 > var21Lifetime1; var21Lifetime1++) {
            if (param6 != 0) {
              if (1 == param6) {
                this.drawStringInternal(var20, 27, param1, param5, SetUseRectFill.field_o[var21Lifetime1], param15 + (param10 - this.metrics.getStringWidth(SetUseRectFill.field_o[var21Lifetime1], 1)) / 2, param2, param12, param4);
              } else {
                if (param6 == 2) {
                  this.drawStringInternal(var20, param8 - 460, param1, param5, SetUseRectFill.field_o[var21Lifetime1], -this.metrics.getStringWidth(SetUseRectFill.field_o[var21Lifetime1], 1) + param15 + param10, param2, param12, param4);
                } else {
                  if (var21Lifetime1 != -1 + var19) {
                    this.setJustification(-116, param10, SetUseRectFill.field_o[var21Lifetime1]);
                    this.drawStringInternal(var20, param8 - 432, param1, param5, SetUseRectFill.field_o[var21Lifetime1], param15, param2, param12, param4);
                    ConstantMonochromeTextureOperation.fontJustificationStep = 0;
                  } else {
                    this.drawStringInternal(var20, param8 - 613, param1, param5, SetUseRectFill.field_o[var21Lifetime1], param15, param2, param12, param4);
                  }
                }
              }
            } else {
              this.drawStringInternal(var20, 97, param1, param5, SetUseRectFill.field_o[var21Lifetime1], param15, param2, param12, param4);
            }
            var20 = var20 + param11;
          }
          stackIn_46_0 = var19;
          return stackIn_46_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var18 = decompiledCaughtException;
          stackIn_49_0 = var18;
          stackIn_49_1 = new StringBuilder().append("da.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',');
          if (param4 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          stackIn_55_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',');
          if (param5 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          stackIn_58_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) (stackIn_49_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    private final void drawStringInternal(int param0, int param1, int param2, ToolkitSprite[] param3, String param4, int param5, int param6, GlyphMask param7, int[] param8) {
        int var14 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        Throwable decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        String var16_ref_String = null;
        int var16 = 0;
        int var17_int = 0;
        Exception var17 = null;
        ToolkitSprite var18 = null;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        CharSequence var22 = null;
        var21 = null;
        var20 = VoidHunters.field_G;
        try {
          var10_int = -5 % ((param1 + 34) / 35);
          param0 = param0 - this.metrics.ascent;
          var11 = -1;
          var12 = -1;
          var13 = param4.length();
          for (var14 = 0; var14 < var13; var14++) {
            boolean decompiledFrameRemainder0 = true;
            var15 = (char)(255 & Cp1252CharacterEncoder.encodeCp1252Character(-123, param4.charAt(var14)));
            if (var15 != 60) {
              if (var15 == 62 &&
                var11 != -1) {
                var16_ref_String = param4.substring(1 + var11, var14);
                var11 = -1;
                if (var16_ref_String.equals("lt")) {
                  var15 = 60;
                } else {
                  if (!var16_ref_String.equals("gt")) {
                    if (!var16_ref_String.equals("nbsp")) {
                      if (!var16_ref_String.equals("shy")) {
                        if (!var16_ref_String.equals("times")) {
                          if (!var16_ref_String.equals("euro")) {
                            if (var16_ref_String.equals("copy")) {
                              var15 = 169;
                            } else {
                              if (!var16_ref_String.equals("reg")) {
                                if (!var16_ref_String.startsWith("img=")) {
                                  this.applyStyleTag(97, var16_ref_String);
                                } else {
                                  try {
                                    var22 = (CharSequence) ((Object) var16_ref_String.substring(4));
                                    var17_int = NebulaFieldFactory.a(-118, var22);
                                    var18 = param3[var17_int];
                                    if (param8 == null) {
                                      stackIn_26_0 = var18.getPaddedHeight();
                                    } else {
                                      stackIn_26_0 = param8[var17_int];
                                    }
                                    var19 = stackIn_26_0;
                                    if ((TimedSpecialOrderBehaviour.fontColor & -16777216) == -16777216) {
                                      var18.draw(param5, -var19 + (this.metrics.ascent + param0), 1, 0, 1);
                                    } else {
                                      var18.draw(param5, this.metrics.ascent + param0 - var19, 0, -16777216 & TimedSpecialOrderBehaviour.fontColor | 16777215, 1);
                                    }
                                    param5 = param5 + param3[var17_int].getPaddedWidth();
                                    var12 = -1;
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    var17 = (Exception) (Object) decompiledCaughtException;
                                  }
                                }
                                decompiledFrameRemainder0 = false;
                              }
                              else {
                                var15 = 174;
                              }
                            }
                          } else {
                            var15 = 8364;
                          }
                        } else {
                          var15 = 215;
                        }
                      } else {
                        var15 = 173;
                      }
                    } else {
                      var15 = 160;
                    }
                  } else {
                    var15 = 62;
                  }
                }
              }
              if ((decompiledFrameRemainder0) &&
                (var11 == -1)) {
                if (-1 != var12) {
                  param5 = param5 + this.metrics.getKerning(var12, (char) var15, -101);
                }
                if (var15 == 32) {
                  if (ConstantMonochromeTextureOperation.fontJustificationStep > 0) {
                    oib.fontJustificationRemainder = oib.fontJustificationRemainder + ConstantMonochromeTextureOperation.fontJustificationStep;
                    param5 = param5 + (oib.fontJustificationRemainder >> 8);
                    oib.fontJustificationRemainder = oib.fontJustificationRemainder & 255;
                  }
                } else {
                  if (param7 == null) {
                    if ((-16777216 & SetThrusterAutobalancing.fontShadowColor) != 0) {
                      this.drawGlyph((char) var15, param5 + 1, param0 + 1, SetThrusterAutobalancing.fontShadowColor, true);
                    }
                    this.drawGlyph((char) var15, param5, param0, TimedSpecialOrderBehaviour.fontColor, false);
                  } else {
                    if (0 != (SetThrusterAutobalancing.fontShadowColor & -16777216)) {
                      this.drawGlyphMasked((char) var15, 1 + param5, param0 + 1, SetThrusterAutobalancing.fontShadowColor, true, param7, param6, param2);
                    }
                    this.drawGlyphMasked((char) var15, param5, param0, TimedSpecialOrderBehaviour.fontColor, false, param7, param6, param2);
                  }
                }
                var16 = this.metrics.getGlyphAdvance(var15, (byte) 46);
                if (SetGrapplingHookRopeChangeRate.fontStrikethroughColor != -1) {
                  this.toolkit.drawHorizontalLineDefaultBlend(param5, -25559, SetGrapplingHookRopeChangeRate.fontStrikethroughColor, param0 + (int)(0.7 * (double)this.metrics.ascent), var16);
                }
                if (DateOfBirthInput.fontUnderlineColor != -1) {
                  this.toolkit.drawHorizontalLineDefaultBlend(param5, -25559, DateOfBirthInput.fontUnderlineColor, 1 + this.metrics.ascent + param0, var16);
                }
                param5 = param5 + var16;
                var12 = var15;
              }
            } else {
              var11 = var14;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var10 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_62_0 = var10;
          stackIn_62_1 = new StringBuilder().append("da.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          stackIn_65_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',');
          if (param4 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          stackIn_68_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
          if (param8 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(')').toString());
        }
    }

    final void draw(boolean param0, int param1, int param2, String param3, int param4, int param5) {
        if (param3 == null) {
          return;
        }
        try {
          this.resetStyle(param2, 0, param1);
          this.drawStringInternal(param4, 65, 0, (ToolkitSprite[]) null, param3, param5, 0, (GlyphMask) null, (int[]) null);
          if (!param0) {
            String var8 = (String) null;
            this.applyStyleTag(81, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "da.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    abstract void drawGlyph(char param0, int param1, int param2, int param3, boolean param4);

    private final void applyStyleTag(int param0, String param1) {
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        var4 = VoidHunters.field_G;
        try {
          try {
            if (param1.startsWith("col=")) {
              var5 = (CharSequence) ((Object) param1.substring(4));
              TimedSpecialOrderBehaviour.fontColor = -16777216 & TimedSpecialOrderBehaviour.fontColor | UsernameAvailabilityValidator.parseInt(-596, var5, 16) & 16777215;
            } else {
              if (param1.equals("/col")) {
                TimedSpecialOrderBehaviour.fontColor = 16777215 & CarouselPlayerInfoFactory.fontDefaultColor | TimedSpecialOrderBehaviour.fontColor & -16777216;
              }
            }
            if (param1.startsWith("argb=")) {
              var9 = (CharSequence) ((Object) param1.substring(5));
              TimedSpecialOrderBehaviour.fontColor = UsernameAvailabilityValidator.parseInt(-596, var9, 16);
            } else {
              if (!param1.equals("/argb")) {
                if (!param1.startsWith("str=")) {
                  if (!param1.equals("str")) {
                    if (param1.equals("/str")) {
                      SetGrapplingHookRopeChangeRate.fontStrikethroughColor = -1;
                    } else {
                      if (!param1.startsWith("u=")) {
                        if (!param1.equals("u")) {
                          if (param1.equals("/u")) {
                            DateOfBirthInput.fontUnderlineColor = -1;
                          } else {
                            if (!param1.equalsIgnoreCase("shad=-1")) {
                              if (param1.startsWith("shad=")) {
                                var8 = (CharSequence) ((Object) param1.substring(5));
                                SetThrusterAutobalancing.fontShadowColor = -16777216 & TimedSpecialOrderBehaviour.fontColor | UsernameAvailabilityValidator.parseInt(-596, var8, 16);
                              } else {
                                if (!param1.equals("shad")) {
                                  if (!param1.equals("/shad")) {
                                    if (param1.equals("br")) {
                                      this.resetStyle(MapClearanceAreaFactory.fontDefaultShadowColor, 0, CarouselPlayerInfoFactory.fontDefaultColor);
                                    }
                                  } else {
                                    SetThrusterAutobalancing.fontShadowColor = MapClearanceAreaFactory.fontDefaultShadowColor;
                                  }
                                } else {
                                  SetThrusterAutobalancing.fontShadowColor = TimedSpecialOrderBehaviour.fontColor & -16777216;
                                }
                              }
                            } else {
                              SetThrusterAutobalancing.fontShadowColor = 0;
                            }
                          }
                        } else {
                          DateOfBirthInput.fontUnderlineColor = TimedSpecialOrderBehaviour.fontColor & -16777216;
                        }
                      } else {
                        var7 = (CharSequence) ((Object) param1.substring(2));
                        DateOfBirthInput.fontUnderlineColor = -16777216 & TimedSpecialOrderBehaviour.fontColor | UsernameAvailabilityValidator.parseInt(-596, var7, 16);
                      }
                    }
                  } else {
                    SetGrapplingHookRopeChangeRate.fontStrikethroughColor = TimedSpecialOrderBehaviour.fontColor & -16777216 | 8388608;
                  }
                } else {
                  var6 = (CharSequence) ((Object) param1.substring(4));
                  SetGrapplingHookRopeChangeRate.fontStrikethroughColor = TimedSpecialOrderBehaviour.fontColor & -16777216 | UsernameAvailabilityValidator.parseInt(-596, var6, 16);
                }
              } else {
                TimedSpecialOrderBehaviour.fontColor = CarouselPlayerInfoFactory.fontDefaultColor;
              }
            }
            if (param0 < 65) {
              this.metrics = (ToolkitFontMetrics) null;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_40_0 = var3_ref;
          stackIn_40_1 = new StringBuilder().append("da.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final void drawRightAligned(int param0, int param1, int param2, boolean param3, int param4, String param5) {
        if (!param3) {
          return;
        }
        if (param5 == null) {
          return;
        }
        try {
          this.resetStyle(param0, 0, param2);
          this.drawStringInternal(param1, 87, 0, (ToolkitSprite[]) null, param5, param4 - this.metrics.getStringWidth(param5, 1), 0, (GlyphMask) null, (int[]) null);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "da.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    ToolkitFont(GraphicsToolkit param0, ToolkitFontMetrics param1) {
        try {
          this.metrics = param1;
          this.toolkit = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "da.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
