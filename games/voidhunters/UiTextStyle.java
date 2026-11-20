/*
 * Decompiled by CFR-JS 0.4.0.
 */
class UiTextStyle implements UiRenderer, UiTextRenderer {
    private int shadowColor;
    int paddingLeft;
    int caretColor;
    BitmapFont font;
    int lineSpacing;
    private boolean wrapText;
    int textColor;
    static GameStateFactory field_e;
    int selectionColor;
    static String field_l;
    int paddingTop;
    int paddingRight;
    int paddingBottom;
    int horizontalAlignment;
    int verticalAlignment;

    private final void layoutSingleLine(UiComponent param0, byte param1) {
        int discarded$0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        UiComponent var8 = null;
        int var6Lifetime1;
        var7 = VoidHunters.field_G;
        try {
          if (null == param0.textLayout) {
            param0.textLayout = (TextLayout) ((Object) new BitmapTextLayout());
          }
          var3_int = this.getContentWidth(param0, (byte) 110);
          var4 = this.getContentHeight((byte) 96, param0);
          var6 = this.verticalAlignment;
          if (var6 != 0) {
            if (var6 != 2) {
              if (var6 != 3 &&
                var6 != 1) {
              }
              var5 = this.font.maxAscent + (-this.font.maxDescent + (-this.font.maxAscent + var4) >> 1);
            } else {
              var5 = var4 - this.font.maxDescent;
            }
          } else {
            var5 = this.font.maxAscent;
          }
          if (param1 <= 58) {
            var8 = (UiComponent) null;
            discarded$0 = this.getTextXWithOffset(-103, (UiComponent) null, -65, (byte) 74);
          }
          var6Lifetime1 = this.horizontalAlignment;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (var6Lifetime1 == 1) {
              if (param0.textLayout instanceof BitmapTextLayout) {
                ((BitmapTextLayout) (param0.textLayout)).layoutCentered(-2661, var3_int >> 1, this.getDisplayText((byte) -97, param0), var5, this.font);
                return;
              }
            } else {
              if (var6Lifetime1 != 2) {
                return;
              }
              if (param0.textLayout instanceof BitmapTextLayout) {
                ((BitmapTextLayout) (param0.textLayout)).layoutRightAligned(var5, this.font, 49, var3_int, this.getDisplayText((byte) -56, param0));
                return;
              }
            }
            return;
          }
          if (!(param0.textLayout instanceof BitmapTextLayout)) {
            return;
          }
          ((BitmapTextLayout) (param0.textLayout)).layoutLeftAligned(var5, this.font, -3, this.getDisplayText((byte) -98, param0), 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("bob.CA(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void drawText(int param0, int param1, int param2, int param3, int param4, UiComponent param5, int param6, int param7) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = VoidHunters.field_G;
        try {
          SelectableIconLabelWidget.pushClip(param5.width + param5.x + param6, param5.height + (param7 + param5.y), param5.x + param6, true, param5.y + param7);
          var9_int = this.getContentWidth(param5, (byte) 81);
          var10 = this.getContentHeight((byte) 56, param5);
          if (param3 != -13997) {
            this.shadowColor = 65;
          }
          boolean decompiledFrameRemainder0 = true;
          if (!this.wrapText) {
            var12 = this.verticalAlignment;
            if (var12 != 0) {
              if (var12 == 2) {
                var11 = var10 - this.font.maxDescent;
              } else {
                if (3 != var12 &&
                  var12 == 1) {
                }
                var11 = this.font.maxAscent + (-this.font.maxDescent + var10 - this.font.maxAscent >> 1);
              }
            } else {
              var11 = this.font.maxAscent;
            }
            var12Lifetime1 = this.horizontalAlignment;
            if (0 != var12Lifetime1 &&
              var12Lifetime1 != 3) {
              if (var12Lifetime1 == 1) {
                this.font.drawCentered(this.getDisplayText((byte) -109, param5), (var9_int >> 1) + this.getTextXWithOffset(param6, param5, param0, (byte) -13), this.getTextYWithOffset(param7, -117, param5, param2) + var11, param4, param1);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.font.drawRightAligned(this.getDisplayText((byte) -72, param5), var9_int + this.getTextXWithOffset(param6, param5, param0, (byte) -13), var11 + this.getTextYWithOffset(param7, -124, param5, param2), param4, param1);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.font.draw(this.getDisplayText((byte) -68, param5), this.getTextXWithOffset(param6, param5, param0, (byte) -13), this.getTextYWithOffset(param7, param3 ^ 14041, param5, param2) + var11, param4, param1);
            }
          } else {
            this.font.drawParagraph(this.getDisplayText((byte) -112, param5), this.getTextXWithOffset(param6, param5, param0, (byte) -13), this.getTextYWithOffset(param7, -117, param5, param2), var9_int, var10, param4, param1, this.horizontalAlignment, this.verticalAlignment, this.lineSpacing);
          }
          bia.popRasterState((byte) 124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_28_0 = var9;
          stackIn_28_1 = new StringBuilder().append("bob.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final int getTextYWithOffset(int param0, int param1, UiComponent param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -116) {
            this.wrapText = true;
          }
          stackIn_3_0 = param3 + (this.paddingTop + param0) - (-param2.y - param2.textOffsetY);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("bob.FA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    UiTextStyle(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int getTextXWithOffset(int param0, UiComponent param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -13) {
            this.verticalAlignment = -85;
          }
          stackIn_3_0 = param2 + (this.paddingLeft + param1.x + param0) + param1.textOffsetX;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("bob.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final int getPreferredHeight(UiComponent param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.getTextLayout(param0, 3);
          var3_int = -15 % ((param1 + 1) / 59);
          stackIn_1_0 = param0.textLayout.getHeight(29565) - (-this.paddingTop - this.paddingBottom);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("bob.I(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int getContentWidth(UiComponent param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 66) {
            stackIn_4_0 = param0.width + (-this.paddingLeft - this.paddingRight);
            return stackIn_4_0;
          }
          stackIn_2_0 = -93;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("bob.M(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int getCaretIndexAtPoint(int param0, int param1, int param2, int param3, UiComponent param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.getTextLayout(param4, 3);
          if (param5 != -1) {
            UiTextStyle.clearSharedReferences(38);
          }
          stackIn_3_0 = param4.textLayout.getCaretIndexAtPoint(param1 - this.getTextOriginY(-3, param2, param4), -23381, param0 - this.getTextOriginX(0, param3, param4));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("bob.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(')').toString());
        }
    }

    public final TextLayout getTextLayout(UiComponent param0, int param1) {
        RuntimeException var3 = null;
        TextLayout stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3) {
            this.shadowColor = -104;
          }
          if (param0.textLayout == null) {
            param0.textLayout = (TextLayout) ((Object) new BitmapTextLayout());
          }
          if (this.wrapText) {
            ((BitmapTextLayout) (param0.textLayout)).layoutParagraph(this.lineSpacing, this.getContentHeight((byte) 83, param0), this.getContentWidth(param0, (byte) 117), this.getDisplayText((byte) -94, param0), this.font, this.horizontalAlignment, 3, this.verticalAlignment);
          } else {
            this.layoutSingleLine(param0, (byte) 87);
          }
          stackIn_8_0 = param0.textLayout;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("bob.D(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void drawText(int param0, UiComponent param1, int param2, int param3) {
        int discarded$0 = 0;
        try {
          this.drawText(0, this.shadowColor, 0, -13997, this.textColor, param1, param3, param2);
          if (param0 != 340287457) {
            UiComponent var6 = (UiComponent) null;
            discarded$0 = this.getTextXWithOffset(-125, (UiComponent) null, -85, (byte) -70);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bob.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void copyTo(int param0, UiTextStyle param1) {
        param1.selectionColor = this.selectionColor;
        if (param0 >= -121) {
          return;
        }
        try {
          param1.paddingLeft = this.paddingLeft;
          param1.paddingBottom = this.paddingBottom;
          param1.paddingTop = this.paddingTop;
          param1.wrapText = this.wrapText;
          param1.horizontalAlignment = this.horizontalAlignment;
          param1.verticalAlignment = this.verticalAlignment;
          param1.caretColor = this.caretColor;
          param1.textColor = this.textColor;
          param1.lineSpacing = this.lineSpacing;
          param1.font = this.font;
          param1.shadowColor = this.shadowColor;
          param1.paddingRight = this.paddingRight;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bob.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void drawSelection(int param0, int param1, int param2, int param3, UiComponent param4, int param5) {
        int var12 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        TextLayoutLine var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        UiComponent var17 = null;
        TextLayout var18 = null;
        TextLayout var19 = null;
        var16 = VoidHunters.field_G;
        try {
          if (param2 != -24184) {
            var17 = (UiComponent) null;
            this.drawSelection(-123, -97, 78, -103, (UiComponent) null, 79);
          }
          if (param0 == param5) {
            return;
          }
          if (!param4.hasFocus((byte) -120)) {
            return;
          }
          var18 = this.getTextLayout(param4, 3);
          var19 = var18;
          if (param5 > param0) {
            var9 = param5;
            var8 = param0;
          } else {
            var8 = param5;
            var9 = param0;
          }
          var10 = var19.getLineIndexForCaret(true, var8);
          var11 = var19.getLineIndexForCaret(true, var9);
          SelectableIconLabelWidget.pushClip(param4.x + param3 + param4.width, param4.y + param1 + param4.height, param4.x + param3, true, param1 + param4.y);
          for (var12 = var10; var11 >= var12; var12++) {
            var13 = var18.lines[var12];
            if (var10 == var12) {
              stackIn_15_0 = var19.getCaretX(var8, -112);
            } else {
              stackIn_15_0 = var13.caretXs[0];
            }
            var14 = stackIn_15_0;
            if (var12 == var11) {
              stackIn_20_0 = var19.getCaretX(var9, -124);
            } else {
              if (var13 != null) {
                stackIn_20_0 = var13.caretXs[-1 + var13.caretXs.length];
              } else {
                stackIn_20_0 = 0;
              }
            }
            var15 = stackIn_20_0;
            GetDebrisMax.field_s.a(var13.top + (param4.textOffsetY + this.paddingTop + (param4.y + param1)), this.selectionColor >>> 24, true, var15 - var14, this.selectionColor, this.getTextXWithOffset(param3, param4, var14, (byte) -13), var13.bottom);
          }
          bia.popRasterState((byte) 124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("bob.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param5).append(')').toString());
        }
    }

    public final int getTextOriginX(int param0, int param1, UiComponent param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.paddingLeft = -99;
          }
          stackIn_3_0 = this.getTextXWithOffset(param1, param2, 0, (byte) -13);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("bob.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int getPreferredWidth(int param0, UiComponent param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2) {
            this.horizontalAlignment = 43;
          }
          this.getTextLayout(param1, 3);
          stackIn_3_0 = param1.textLayout.getRightEdge(-18877) + this.paddingLeft + this.paddingRight;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bob.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final int getContentHeight(byte param0, UiComponent param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 50) {
            this.shadowColor = 14;
          }
          stackIn_3_0 = param1.height - (this.paddingTop + this.paddingBottom);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bob.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public void drawComponent(int param0, UiComponent param1, int param2, int param3, boolean param4) {
        if (this.font == null) {
          return;
        }
        try {
          this.drawText(340287457, param1, param3, param2);
          int var6_int = 96 / ((param0 + 27) / 35);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bob.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int getTextOriginY(int param0, int param1, UiComponent param2) {
        RuntimeException var4 = null;
        UiComponent var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -3) {
            var5 = (UiComponent) null;
            this.getContentWidth((UiComponent) null, (byte) -80);
          }
          stackIn_3_0 = this.getTextYWithOffset(param1, param0 - 114, param2, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("bob.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_e = null;
        field_l = null;
        if (param0 != 22540) {
          field_l = (String) null;
        }
    }

    public final int getLineHeight(int param0) {
        if (param0 < 7) {
          return -64;
        }
        return this.font.maxDescent + this.font.maxAscent;
    }

    String getDisplayText(byte param0, UiComponent param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -53) {
            this.verticalAlignment = 73;
          }
          stackIn_3_0 = param1.text;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bob.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void drawCaret(UiComponent param0, int param1, byte param2, int param3, int param4) {
        TextLayout var13 = null;
        TextLayout var14 = null;
        int var7 = 0;
        TextLayoutLine var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
          if (param0.hasFocus((byte) -120)) {
            var13 = this.getTextLayout(param0, 3);
            var14 = var13;
            var7 = var14.getLineIndexForCaret(true, param4);
            var8 = var13.lines[var7];
            var9 = var14.getCaretX(param4, -126);
            var10 = this.getTextXWithOffset(param3, param0, var9, (byte) -13);
            var11 = this.getTextOriginY(-3, param1, param0) + Math.max(0, var8.top);
            var12 = this.getTextOriginY(-3, param1, param0) + Math.min(this.getContentHeight((byte) 71, param0), Math.min(var8.bottom, 1 + var7 >= var14.lines.length ? var8.bottom : var13.lines[var7 + 1].top));
            SelectableIconLabelWidget.pushClip(param0.width + (param3 + param0.x), param0.height + param1 + param0.y, param0.x + param3, true, param0.y + param1);
            GetDebrisMax.field_s.a(this.caretColor, var11, var12, var10, var10, 11480);
            bia.popRasterState((byte) 124);
          }
          int var6_int = -36 / ((6 - param2) / 58);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bob.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    protected UiTextStyle() {
    }

    UiTextStyle(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.lineSpacing = param9;
          this.shadowColor = param6;
          this.paddingTop = param3;
          this.selectionColor = param11;
          this.paddingBottom = param4;
          this.caretColor = param10;
          this.wrapText = param12 ? true : false;
          this.verticalAlignment = param8;
          this.textColor = param5;
          this.font = param0;
          this.horizontalAlignment = param7;
          this.paddingRight = param2;
          this.paddingLeft = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "bob.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_e = (GameStateFactory) ((Object) new MessageFactory());
        field_l = "Extend current mission phase";
    }
}
