/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextWidgetPainter implements WidgetPainter, WidgetTextLayout {
    int field_l;
    private int field_m;
    int field_f;
    int field_j;
    int field_d;
    int field_g;
    BitmapFont field_e;
    int field_c;
    int field_i;
    int field_a;
    int field_h;
    int field_k;
    private boolean field_b;

    public final int getPreferredWidth(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        TextWidgetPainter var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.ensureTextLayout(param1, 14157);
          if (param0 != 3459) {
            var4 = (TextWidgetPainter) null;
            this.copyTo((TextWidgetPainter) null, -5);
          }
          stackIn_3_0 = param1.field_l.getMaxLineWidth(0) - (-this.field_h - this.field_c);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vpa.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int hitTestCaretIndex(UiWidget param0, byte param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 4) {
            this.field_a = -123;
          }
          this.ensureTextLayout(param0, 14157);
          stackIn_3_0 = param0.field_l.characterIndexAt(-1, -this.getTextOriginX(param0, param3, (byte) 119) + param5, -this.textTop(param4, param0, (byte) -48) + param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("vpa.J(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final int textX(UiWidget param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -3) {
            this.field_g = -30;
          }
          stackIn_3_0 = param1 + (param0.field_t + this.field_h) + (param0.field_i + param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("vpa.U(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    String getDisplayText(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -4) {
            var4 = (UiWidget) null;
            this.ensureTextLayout((UiWidget) null, -39);
          }
          stackIn_3_0 = param1.field_o;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vpa.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final void drawWidgetText(boolean param0, UiWidget param1, int param2, int param3) {
        try {
          this.drawClippedText(this.field_m, 0, param1, 0, param3, 12589, param2, this.field_j);
          if (param0) {
            this.field_d = 6;
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "vpa.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 <= 2) {
          TextWidgetPainter.a(3);
        }
        return HorizontalGradientOperator.field_m;
    }

    private final void drawClippedText(int param0, int param1, UiWidget param2, int param3, int param4, int param5, int param6, int param7) {
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
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          tga.intersectClip(param5 - 34542, param4 + param2.field_i, param2.field_i + (param4 + param2.field_m), param6 + param2.field_n, param6 + param2.field_n + param2.field_p);
          if (param5 != 12589) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          var9_int = this.getAvailableTextWidth((byte) 116, param2);
          var10 = this.contentWidth(param5 ^ 2147471058, param2);
          if (!this.field_b) {
            var12 = this.field_a;
            if (var12 != 0) {
              if (2 == var12) {
                var11 = -this.field_e.field_k + var10;
              } else {
                if (3 != var12 &&
                  var12 != 1) {
                }
                var11 = (var10 - this.field_e.field_w - this.field_e.field_k >> 1) + this.field_e.field_w;
              }
            } else {
              var11 = this.field_e.field_w;
            }
            var12Lifetime1 = this.field_l;
            if (var12Lifetime1 != 0 &&
              var12Lifetime1 != 3) {
              if (1 == var12Lifetime1) {
                this.field_e.drawCenteredText(this.getDisplayText(-4, param2), this.textX(param2, param3, param4, -3) + (var9_int >> 1), var11 + this.textY(param6, param1, param2, (byte) -128), param7, param0);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_e.drawRightAlignedText(this.getDisplayText(-4, param2), var9_int + this.textX(param2, param3, param4, -3), this.textY(param6, param1, param2, (byte) -128) + var11, param7, param0);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_e.drawText(this.getDisplayText(-4, param2), this.textX(param2, param3, param4, -3), this.textY(param6, param1, param2, (byte) -128) + var11, param7, param0);
            }
          } else {
            this.field_e.drawParagraph(this.getDisplayText(param5 ^ -12591, param2), this.textX(param2, param3, param4, -3), this.textY(param6, param1, param2, (byte) -128), var9_int, var10, param7, param0, this.field_l, this.field_a, this.field_f);
          }
          pfa.popRasterState(1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_28_0 = var9;
          stackIn_28_1 = new StringBuilder().append("vpa.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public final int getLineInkHeight(byte param0) {
        if (param0 != -90) {
          UiWidget var3 = (UiWidget) null;
          this.getPreferredWidth(-102, (UiWidget) null);
        }
        return this.field_e.field_w + this.field_e.field_k;
    }

    final void copyTo(TextWidgetPainter param0, int param1) {
        int discarded$0 = 0;
        try {
          param0.field_m = this.field_m;
          param0.field_b = this.field_b;
          param0.field_a = this.field_a;
          param0.field_i = this.field_i;
          if (param1 >= -21) {
            UiWidget var4 = (UiWidget) null;
            discarded$0 = this.textY(61, 17, (UiWidget) null, (byte) -104);
          }
          param0.field_k = this.field_k;
          param0.field_h = this.field_h;
          param0.field_f = this.field_f;
          param0.field_e = this.field_e;
          param0.field_d = this.field_d;
          param0.field_j = this.field_j;
          param0.field_c = this.field_c;
          param0.field_l = this.field_l;
          param0.field_g = this.field_g;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "vpa.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void drawSelection(int param0, UiWidget param1, int param2, int param3, int param4, int param5) {
        int var12 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        TextLineLayout var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        TextBlockLayout var17 = null;
        TextBlockLayout var18 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          if (param4 == param5) {
            return;
          }
          if (param0 != -1) {
            return;
          }
          if (param1.hasKeyboardFocus((byte) -34)) {
            var17 = this.ensureTextLayout(param1, 14157);
            var18 = var17;
            if (param4 < param5) {
              var8 = param4;
              var9 = param5;
            } else {
              var9 = param4;
              var8 = param5;
            }
            var10 = var18.findLineIndex(var8, 0);
            var11 = var18.findLineIndex(var9, 0);
            tga.intersectClip(-21953, param3 + param1.field_i, param3 - (-param1.field_i - param1.field_m), param2 + param1.field_n, param1.field_p + (param2 + param1.field_n));
            for (var12 = var10; var12 <= var11; var12++) {
              var13 = var17.field_c[var12];
              if (var10 != var12) {
                stackIn_16_0 = var13.field_c[0];
              } else {
                stackIn_16_0 = var18.getCaretX((byte) -59, var8);
              }
              var14 = stackIn_16_0;
              if (var12 != var11) {
                if (var13 == null) {
                  stackIn_21_0 = 0;
                } else {
                  stackIn_21_0 = var13.field_c[var13.field_c.length - 1];
                }
              } else {
                stackIn_21_0 = var18.getCaretX((byte) -59, var9);
              }
              var15 = stackIn_21_0;
              afa.field_c.fillRectangleAlpha(param1.field_j + (param2 + (param1.field_n + this.field_g + var13.field_d)), var13.field_b, this.field_d, this.field_d >>> 24, (byte) 118, -var14 + var15, this.textX(param1, var14, param3, -3));
            }
            pfa.popRasterState(param0 ^ -2);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("vpa.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final int textTop(int param0, UiWidget param1, byte param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= -39) {
            stackIn_4_0 = this.textY(param0, 0, param1, (byte) -128);
            return stackIn_4_0;
          }
          stackIn_2_0 = 24;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("vpa.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void layoutSingleLine(int param0, UiWidget param1) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var6Lifetime1;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1.field_l == null) {
            param1.field_l = (TextBlockLayout) ((Object) new CachedTextLayout());
          }
          var3_int = this.getAvailableTextWidth((byte) -83, param1);
          if (param0 <= 65) {
            this.field_f = 87;
          }
          var4 = this.contentWidth(2147483647, param1);
          var6 = this.field_a;
          if (var6 == 0) {
            var5 = this.field_e.field_w;
          } else {
            if (var6 == 2) {
              var5 = -this.field_e.field_k + var4;
            } else {
              if (3 != var6 &&
                var6 == 1) {
              }
              var5 = (var4 - (this.field_e.field_w + this.field_e.field_k) >> 1) + this.field_e.field_w;
            }
          }
          var6Lifetime1 = this.field_l;
          if (var6Lifetime1 != 0 &&
            3 != var6Lifetime1) {
            if (var6Lifetime1 == 1) {
              if (!(param1.field_l instanceof CachedTextLayout)) {
                return;
              }
              ((CachedTextLayout) (param1.field_l)).layoutCenteredLine(var5, var3_int >> 1, this.field_e, this.getDisplayText(-4, param1), (byte) -80);
              return;
            }
            if (var6Lifetime1 != 2) {
              return;
            }
            if (!(param1.field_l instanceof CachedTextLayout)) {
              return;
            }
            ((CachedTextLayout) (param1.field_l)).layoutRightAlignedLine(0, this.field_e, var5, this.getDisplayText(-4, param1), var3_int);
            return;
          }
          if (param1.field_l instanceof CachedTextLayout) {
            ((CachedTextLayout) (param1.field_l)).layoutLeftAlignedLine(16512, var5, this.field_e, this.getDisplayText(-4, param1), 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("vpa.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    private final int contentWidth(int param0, UiWidget param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        UiWidget var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2147483647) {
            var4 = (UiWidget) null;
            discarded$1 = this.textY(60, 118, (UiWidget) null, (byte) -16);
          }
          stackIn_3_0 = param1.field_p - this.field_g - this.field_i;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vpa.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public void paintWidget(UiWidget param0, int param1, int param2, int param3, boolean param4) {
        if (null == this.field_e) {
          return;
        }
        try {
          this.drawWidgetText(false, param0, param3, param1);
          if (param2 != 16777215) {
            UiWidget var7 = (UiWidget) null;
            this.drawWidgetText(false, (UiWidget) null, 1, 26);
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "vpa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int getTextOriginX(UiWidget param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 119) {
            TextWidgetPainter.a(-113);
          }
          stackIn_3_0 = this.textX(param0, 0, param1, -3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("vpa.DA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final int getAvailableTextWidth(byte param0, UiWidget param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 83 % ((param0 + 9) / 60);
          stackIn_1_0 = -this.field_h + param1.field_m - this.field_c;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("vpa.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    private final int textY(int param0, int param1, UiWidget param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < -127) {
            stackIn_4_0 = param2.field_j + (param0 + (param2.field_n + this.field_g + param1));
            return stackIn_4_0;
          }
          stackIn_2_0 = 26;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("vpa.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    public final TextBlockLayout ensureTextLayout(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        TextBlockLayout stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_l == null) {
            param0.field_l = (TextBlockLayout) ((Object) new CachedTextLayout());
          }
          if (param1 != 14157) {
            this.field_e = (BitmapFont) null;
          }
          if (!this.field_b) {
            this.layoutSingleLine(param1 ^ 14131, param0);
          } else {
            ((CachedTextLayout) (param0.field_l)).layoutParagraph(this.field_e, (byte) -49, this.getDisplayText(param1 ^ -14159, param0), this.getAvailableTextWidth((byte) 91, param0), this.field_a, this.contentWidth(param1 ^ 2147469490, param0), this.field_l, this.field_f);
          }
          stackIn_9_0 = param0.field_l;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("vpa.P(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void drawCaret(int param0, int param1, int param2, int param3, UiWidget param4) {
        TextBlockLayout var13 = null;
        TextBlockLayout var14 = null;
        int var7 = 0;
        TextLineLayout var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
          if (param2 != -22502) {
            this.field_a = -110;
          }
          if (param4.hasKeyboardFocus((byte) -34)) {
            var13 = this.ensureTextLayout(param4, 14157);
            var14 = var13;
            var7 = var14.findLineIndex(param0, 0);
            var8 = var13.field_c[var7];
            var9 = var14.getCaretX((byte) -59, param0);
            var10 = this.textX(param4, var9, param3, param2 ^ 22503);
            var11 = this.textTop(param1, param4, (byte) -110) + Math.max(0, var8.field_d);
            var12 = this.textTop(param1, param4, (byte) -44) + Math.min(this.contentWidth(2147483647, param4), Math.min(var8.field_b, var7 + 1 >= var14.field_c.length ? var8.field_b : var13.field_c[1 + var7].field_d));
            tga.intersectClip(-21953, param4.field_i + param3, param4.field_i + (param3 + param4.field_m), param1 + param4.field_n, param4.field_n + (param1 + param4.field_p));
            afa.field_c.drawLine(var11, this.field_k, 8947848, var10, var10, var12);
            pfa.popRasterState(1);
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "vpa.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public final int getTextWidth(byte param0, UiWidget param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.ensureTextLayout(param1, 14157);
          var3_int = -28 % ((param0 - 47) / 52);
          stackIn_1_0 = param1.field_l.getLayoutHeight(127) + (this.field_g + this.field_i);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("vpa.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    TextWidgetPainter(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    protected TextWidgetPainter() {
    }

    TextWidgetPainter(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_k = param10;
          this.field_l = param7;
          this.field_a = param8;
          this.field_f = param9;
          this.field_g = param3;
          this.field_b = param12 ? true : false;
          this.field_d = param11;
          this.field_i = param4;
          this.field_e = param0;
          this.field_j = param5;
          this.field_m = param6;
          this.field_h = param1;
          this.field_c = param2;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "vpa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
    }
}
