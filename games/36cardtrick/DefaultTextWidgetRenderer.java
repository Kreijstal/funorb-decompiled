/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DefaultTextWidgetRenderer implements WidgetRenderer, TextWidgetRenderer {
    int field_i;
    int field_h;
    int field_b;
    int field_j;
    private int field_d;
    int field_o;
    BitmapFont field_c;
    static int field_e;
    int field_l;
    int field_k;
    private boolean field_g;
    int field_m;
    int field_f;
    static String[] field_a;
    int field_n;

    private final void a(UiWidget param0, boolean param1) {
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
        UiWidget var8 = null;
        int var6Lifetime1;
        var7 = Main.field_T;
        try {
          if (!param1) {
            var8 = (UiWidget) null;
            this.findTextOffsetAtScreenPosition(-100, -38, -40, 81, (UiWidget) null, 47);
          }
          if (null == param0.field_s) {
            param0.field_s = (TextLayout) ((Object) new RichTextLayout());
          }
          var3_int = this.getTextAreaWidth(param0, 0);
          var4 = this.b(param0, -32260);
          var6 = this.field_f;
          if (var6 == 0) {
            var5 = this.field_c.field_s;
          } else {
            if (var6 == 2) {
              var5 = var4 - this.field_c.field_x;
            } else {
              if (var6 != 3 &&
                1 == var6) {
              }
              var5 = (-this.field_c.field_x + var4 - this.field_c.field_s >> 1) + this.field_c.field_s;
            }
          }
          var6Lifetime1 = this.field_i;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (1 != var6Lifetime1) {
              if (var6Lifetime1 != 2) {
                return;
              }
              if (!(param0.field_s instanceof RichTextLayout)) {
                return;
              }
              ((RichTextLayout) (param0.field_s)).layoutSingleLineRightAligned(this.b(69, param0), (byte) -109, var5, this.field_c, var3_int);
            } else {
              if (param0.field_s instanceof RichTextLayout) {
                ((RichTextLayout) (param0.field_s)).layoutSingleLineCentered(this.field_c, var5, this.b(-123, param0), -102, var3_int >> 1);
                return;
              }
            }
            return;
          }
          if (param0.field_s instanceof RichTextLayout) {
            ((RichTextLayout) (param0.field_s)).layoutSingleLineLeftAligned(this.b(96, param0), 1, this.field_c, var5, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("ek.Q(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, UiWidget param1, int param2, int param3) {
        int discarded$0 = 0;
        try {
          if (param3 != 2) {
            UiWidget var6 = (UiWidget) null;
            discarded$0 = this.b((UiWidget) null, -123, -52, -32);
          }
          this.a(0, 0, (byte) 108, this.field_h, param2, param0, this.field_d, param1);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "ek.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(DefaultTextWidgetRenderer param0, byte param1) {
        try {
          param0.field_k = this.field_k;
          param0.field_i = this.field_i;
          param0.field_c = this.field_c;
          param0.field_d = this.field_d;
          param0.field_f = this.field_f;
          param0.field_n = this.field_n;
          param0.field_h = this.field_h;
          param0.field_m = this.field_m;
          param0.field_b = this.field_b;
          param0.field_l = this.field_l;
          int var3_int = 55 / ((-24 - param1) / 33);
          param0.field_j = this.field_j;
          param0.field_o = this.field_o;
          param0.field_g = this.field_g;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "ek.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        SoftwareRasterizer.drawHorizontalLine(param7, param4, param8, param1);
        SoftwareRasterizer.drawVerticalLine(param7, 1 + param4, param6 - 1, param1);
        if (param0 != 92) {
          field_a = (String[]) null;
        }
        SoftwareRasterizer.drawHorizontalLine(param7 + 1, param4 + 1, param8 - 2, param5);
        SoftwareRasterizer.drawVerticalLine(param7 + 1, 2 + param4, -3 + param6, param5);
        SoftwareRasterizer.drawVerticalLine(-2 + (param8 + param7), 2 + param4, param6 - 3, param3);
        SoftwareRasterizer.drawHorizontalLine(2 + param7, -2 + param4 + param6, -2 + param8, param3);
        SoftwareRasterizer.drawVerticalLine(-1 + param7 + param8, param4 + 1, param6 - 1, param2);
        SoftwareRasterizer.drawHorizontalLine(1 + param7, param6 + param4 - 1, -2 + param8, param2);
    }

    String b(int param0, UiWidget param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 87 / ((param0 + 48) / 42);
          stackIn_1_0 = param1.field_r;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ek.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public final void paintSelection(UiWidget param0, byte param1, int param2, int param3, int param4, int param5) {
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
        TextLineMetrics var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        TextLayout var17 = null;
        TextLayout var18 = null;
        var16 = Main.field_T;
        try {
          if (param1 < 37) {
            this.field_k = -120;
          }
          if (param5 == param4) {
            return;
          }
          if (param0.isFocused(69)) {
            var17 = this.getTextLayout((byte) -63, param0);
            var18 = var17;
            if (param4 > param5) {
              var8 = param5;
              var9 = param4;
            } else {
              var9 = param5;
              var8 = param4;
            }
            var10 = var18.getLineIndexForTextOffset(-13453, var8);
            var11 = var18.getLineIndexForTextOffset(-13453, var9);
            DefaultTextWidgetRenderer.a(param0.field_i + param2, param3 - (-param0.field_o - param0.field_h), param0.field_o + param3, (byte) 125, param2 + param0.field_i + param0.field_q);
            for (var12 = var10; var12 <= var11; var12++) {
              var13 = var17.field_d[var12];
              if (var10 == var12) {
                stackIn_15_0 = var18.getXForTextOffset(true, var8);
              } else {
                stackIn_15_0 = var13.field_a[0];
              }
              var14 = stackIn_15_0;
              if (var11 == var12) {
                stackIn_20_0 = var18.getXForTextOffset(true, var9);
              } else {
                if (var13 != null) {
                  stackIn_20_0 = var13.field_a[-1 + var13.field_a.length];
                } else {
                  stackIn_20_0 = 0;
                }
              }
              var15 = stackIn_20_0;
              pj.field_a.a(this.field_o, 10066329, this.a(param0, var14, param3, -3), param2 - (-param0.field_i - (this.field_m + param0.field_m) - var13.field_b), var13.field_c, var15 - var14, this.field_o >>> 24);
            }
            gg.a(14756);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("ek.J(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final int b(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -32260) {
            this.field_j = -40;
          }
          stackIn_3_0 = param0.field_q - this.field_m - this.field_j;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ek.CA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void paintCaret(int param0, int param1, int param2, byte param3, UiWidget param4) {
        int var7 = 0;
        TextLineMetrics var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        TextLayout var13 = null;
        TextLayout var14 = null;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_7_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param3 < 26) {
            return;
          }
          if (param4.isFocused(111)) {
            var13 = this.getTextLayout((byte) -74, param4);
            var14 = var13;
            var7 = var14.getLineIndexForTextOffset(-13453, param1);
            var8 = var13.field_d[var7];
            var9 = var14.getXForTextOffset(true, param1);
            var10 = this.a(param4, var9, param0, -3);
            var11 = this.getTextOriginY(param4, -1815612287, param2) + Math.max(0, var8.field_b);
            stackIn_6_0 = this.getTextOriginY(param4, -1815612287, param2);
            stackIn_6_1 = this.b(param4, -32260);
            stackIn_6_2 = var8.field_c;
            if (var14.field_d.length > 1 + var7) {
              stackIn_7_3 = var13.field_d[1 + var7].field_b;
            } else {
              stackIn_7_3 = var8.field_c;
            }
            var12 = stackIn_6_0 + Math.min(stackIn_6_1, Math.min(stackIn_6_2, stackIn_7_3));
            DefaultTextWidgetRenderer.a(param2 + param4.field_i, param0 - (-param4.field_o - param4.field_h), param4.field_o + param0, (byte) 55, param2 + param4.field_i + param4.field_q);
            pj.field_a.a(var11, var10, var10, this.field_l, 0, var12);
            gg.a(14756);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("ek.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final int getPreferredWidth(UiWidget param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 91 / ((param1 + 70) / 40);
          this.getTextLayout((byte) 42, param0);
          stackIn_1_0 = param0.field_s.getMaxLineRightX((byte) -5) + (this.field_k + this.field_n);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ek.I(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(UiWidget param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        UiWidget var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -3) {
            var6 = (UiWidget) null;
            this.b(-108, (UiWidget) null);
          }
          stackIn_3_0 = param0.field_o + (param2 - (-this.field_k - param0.field_l) + param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ek.V(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, UiWidget param7) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = Main.field_T;
        try {
          DefaultTextWidgetRenderer.a(param7.field_i + param5, param4 + (param7.field_o + param7.field_h), param4 + param7.field_o, (byte) 61, param5 - (-param7.field_i - param7.field_q));
          var9_int = this.getTextAreaWidth(param7, 0);
          var10 = this.b(param7, -32260);
          if (param2 != 108) {
            field_e = -11;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_g) {
            this.field_c.drawParagraph(this.b(11, param7), this.a(param7, param0, param4, -3), this.b(param7, 116, param5, param1), var9_int, var10, param3, param6, this.field_i, this.field_f, this.field_b);
          } else {
            var12 = this.field_f;
            if (0 == var12) {
              var11 = this.field_c.field_s;
            } else {
              if (2 != var12) {
                if (var12 != 3 &&
                  var12 == 1) {
                }
                var11 = (-this.field_c.field_x + (-this.field_c.field_s + var10) >> 1) + this.field_c.field_s;
              } else {
                var11 = var10 - this.field_c.field_x;
              }
            }
            var12Lifetime1 = this.field_i;
            if (var12Lifetime1 != 0 &&
              3 != var12Lifetime1) {
              if (var12Lifetime1 == 1) {
                this.field_c.drawCentred(this.b(param2 + 1, param7), (var9_int >> 1) + this.a(param7, param0, param4, param2 - 111), this.b(param7, 126, param5, param1) + var11, param3, param6);
              } else {
                if ((2 == var12Lifetime1)) {
                  this.field_c.drawRightAligned(this.b(95, param7), this.a(param7, param0, param4, -3) + var9_int, this.b(param7, 116, param5, param1) + var11, param3, param6);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_c.drawString(this.b(11, param7), this.a(param7, param0, param4, param2 - 111), this.b(param7, param2 ^ 22, param5, param1) + var11, param3, param6);
            }
          }
          gg.a(14756);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_26_0 = var9;
          stackIn_26_1 = new StringBuilder().append("ek.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public final int getTextOriginY(UiWidget param0, int param1, int param2) {
        RuntimeException var4 = null;
        UiWidget var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1815612287) {
            var5 = (UiWidget) null;
            this.paintWidget(5, (UiWidget) null, -31, -114, false);
          }
          stackIn_3_0 = this.b(param0, 115, param2, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ek.K(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void clearStaticReferences(byte param0) {
        if (param0 != 61) {
          field_a = (String[]) null;
        }
        field_a = null;
    }

    public final TextLayout getTextLayout(byte param0, UiWidget param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        TextLayout stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 38 % ((-8 - param0) / 49);
          if (param1.field_s == null) {
            param1.field_s = (TextLayout) ((Object) new RichTextLayout());
          }
          if (!this.field_g) {
            this.a(param1, true);
          } else {
            ((RichTextLayout) (param1.field_s)).layoutWrappedText(this.b(param1, -32260), 841570337, this.field_f, this.getTextAreaWidth(param1, 0), this.field_c, this.field_i, this.b(75, param1), this.field_b);
          }
          stackIn_7_0 = param1.field_s;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ek.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final int getTextAreaWidth(UiWidget param0, int param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        UiWidget var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            var4 = (UiWidget) null;
            discarded$1 = this.a((UiWidget) null, 75, 43, -98);
          }
          stackIn_3_0 = param0.field_h - (this.field_k + this.field_n);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ek.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    DefaultTextWidgetRenderer(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int b(UiWidget param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        UiWidget var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 113) {
            var6 = (UiWidget) null;
            this.a((UiWidget) null, false);
          }
          stackIn_3_0 = this.field_m + param0.field_i + (param2 + param0.field_m + param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ek.W(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final int findTextOffsetAtScreenPosition(int param0, int param1, int param2, int param3, UiWidget param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -10989) {
            this.field_j = 28;
          }
          this.getTextLayout((byte) -109, param4);
          stackIn_3_0 = param4.field_s.getTextOffsetAt(param5 - this.getTextOriginY(param4, -1815612287, param1), -this.getTextOriginX(param3, (byte) -77, param4) + param0, param2 ^ 10969);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("ek.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(')').toString());
        }
    }

    public void paintWidget(int param0, UiWidget param1, int param2, int param3, boolean param4) {
        int discarded$0 = 0;
        if (null == this.field_c) {
          return;
        }
        try {
          this.a(param3, param1, param0, param2 ^ 11445);
          if (param2 != 11447) {
            UiWidget var7 = (UiWidget) null;
            discarded$0 = this.a((UiWidget) null, -92, 108, -40);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "ek.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int getPreferredHeight(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.getTextLayout((byte) -99, param1);
          if (param0 == -2) {
            stackIn_4_0 = param1.field_s.getLayoutHeight(param0 ^ -2) + this.field_m + this.field_j;
            return stackIn_4_0;
          }
          stackIn_2_0 = 6;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ek.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 < 15) {
          DefaultTextWidgetRenderer.clearStaticReferences((byte) 49);
        }
        ji.a(true);
        SoftwareRasterizer.intersectClip(param2, param0, param1, param4);
    }

    public final int getTextOriginX(int param0, byte param1, UiWidget param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 55 / ((param1 - 51) / 35);
          stackIn_1_0 = this.a(param2, 0, param0, -3);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("ek.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public final int getFontLineHeight(int param0) {
        if (param0 != -1) {
          return -67;
        }
        return this.field_c.field_x + this.field_c.field_s;
    }

    protected DefaultTextWidgetRenderer() {
    }

    DefaultTextWidgetRenderer(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_i = param7;
          this.field_n = param2;
          this.field_m = param3;
          this.field_k = param1;
          this.field_j = param4;
          this.field_d = param6;
          this.field_b = param9;
          this.field_c = param0;
          this.field_h = param5;
          this.field_o = param11;
          this.field_f = param8;
          this.field_l = param10;
          this.field_g = param12 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "ek.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_e = 50;
        field_a = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
