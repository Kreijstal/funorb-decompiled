/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DefaultTextWidgetRenderer implements WidgetRenderer, TextWidgetRenderer {
    int field_r;
    int field_i;
    int field_j;
    BitmapFont field_a;
    int field_h;
    int field_p;
    int field_g;
    private int field_d;
    private boolean field_f;
    int field_s;
    int field_k;
    static si field_e;
    static String field_t;
    static String field_o;
    int field_b;
    static int field_l;
    static va field_q;
    int field_m;
    static PcmSample field_n;
    static int field_c;

    public void paintWidget(byte param0, int param1, boolean param2, UiWidget param3, int param4) {
        if (this.field_a == null) {
          return;
        }
        try {
          this.drawTextWithDefaultStyle((byte) -112, param3, param4, param1);
          if (param0 > -97) {
            field_c = -49;
          }
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "vf.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public final int getTextAreaWidth(UiWidget param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -82 / ((param1 + 84) / 32);
          stackIn_1_0 = param0.field_F - this.field_h - this.field_r;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("vf.Q(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public final TextLayout getTextLayout(UiWidget param0, byte param1) {
        RuntimeException var3 = null;
        TextLayout stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_p == null) {
            param0.field_p = (TextLayout) ((Object) new RichTextLayout());
          }
          if (param1 >= -81) {
            field_n = (PcmSample) null;
          }
          if (!this.field_f) {
            this.rebuildTextLayout(2147483647, param0);
          } else {
            ((RichTextLayout) (param0.field_p)).layoutWrappedText(this.resolveDisplayText(param0, -2), this.getTextAreaWidth(param0, -124), this.field_p, 3, this.field_k, this.field_s, this.getTextAreaHeight(param0, 126), this.field_a);
          }
          stackIn_8_0 = param0.field_p;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("vf.S(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void rebuildTextLayout(int param0, UiWidget param1) {
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
        int var6Lifetime1;
        var7 = Confined.field_J ? 1 : 0;
        try {
          if (null == param1.field_p) {
            param1.field_p = (TextLayout) ((Object) new RichTextLayout());
          }
          var3_int = this.getTextAreaWidth(param1, -121);
          var4 = this.getTextAreaHeight(param1, -104);
          if (param0 != 2147483647) {
            return;
          }
          var6 = this.field_k;
          if (var6 != 0) {
            if (var6 == 2) {
              var5 = -this.field_a.field_D + var4;
            } else {
              if (var6 != 3 &&
                var6 == 1) {
              }
              var5 = this.field_a.field_C + (var4 - this.field_a.field_C - this.field_a.field_D >> 1);
            }
          } else {
            var5 = this.field_a.field_C;
          }
          var6Lifetime1 = this.field_p;
          if (0 != var6Lifetime1 &&
            var6Lifetime1 != 3) {
            if (var6Lifetime1 == 1) {
              if (param1.field_p instanceof RichTextLayout) {
                ((RichTextLayout) (param1.field_p)).layoutSingleLineCentered(var3_int >> 1, 121, var5, this.resolveDisplayText(param1, param0 + 2147483647), this.field_a);
                return;
              }
            } else {
              if (var6Lifetime1 != 2) {
                return;
              }
              if (!(param1.field_p instanceof RichTextLayout)) {
                return;
              }
              ((RichTextLayout) (param1.field_p)).layoutSingleLineRightAligned(this.field_a, this.resolveDisplayText(param1, -2), var5, var3_int, -103);
            }
            return;
          }
          if (param1.field_p instanceof RichTextLayout) {
            ((RichTextLayout) (param1.field_p)).layoutSingleLineLeftAligned(var5, 0, (byte) -24, this.field_a, this.resolveDisplayText(param1, -2));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("vf.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    public final int getTextOriginY(int param0, int param1, UiWidget param2) {
        RuntimeException var4 = null;
        UiWidget var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 2) {
            var5 = (UiWidget) null;
            this.paintCaret(27, (UiWidget) null, 93, 37, -60);
          }
          stackIn_3_0 = this.getUnalignedTextOriginY(param2, param1 + 123, param0, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("vf.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final int getUnalignedTextOriginY(UiWidget param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -16 / ((param1 - 63) / 58);
          stackIn_1_0 = this.field_b + param2 - (-param0.field_m - param0.field_y - param3);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("vf.AA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final int getPreferredHeight(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.getTextLayout(param1, (byte) -110);
          if (param0 != -1870081887) {
            this.field_g = -44;
          }
          stackIn_3_0 = param1.field_p.getLayoutHeight(23791) + this.field_b + this.field_j;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vf.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final void drawText(int param0, int param1, int param2, int param3, int param4, int param5, UiWidget param6, int param7) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = Confined.field_J ? 1 : 0;
        try {
          TunnelMesh.pushAndIntersectRasterClip(param6.field_q + param3, param6.field_F + (param3 + param6.field_q), param6.field_m + (param2 + param6.field_z), param2 + param6.field_m, param5 ^ -29579);
          if (param5 != -18866) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          var9_int = this.getTextAreaWidth(param6, 111);
          var10 = this.getTextAreaHeight(param6, 88);
          if (!this.field_f) {
            var12 = this.field_k;
            if (var12 != 0) {
              if (var12 == 2) {
                var11 = var10 - this.field_a.field_D;
              } else {
                if (3 != var12 &&
                  var12 != 1) {
                }
                var11 = this.field_a.field_C + (var10 - this.field_a.field_C - this.field_a.field_D >> 1);
              }
            } else {
              var11 = this.field_a.field_C;
            }
            var12Lifetime1 = this.field_p;
            if (var12Lifetime1 != 0 &&
              var12Lifetime1 != 3) {
              if (var12Lifetime1 == 1) {
                this.field_a.drawCentred(this.resolveDisplayText(param6, -2), this.getUnalignedTextOriginX(param3, 14525, param1, param6) + (var9_int >> 1), this.getUnalignedTextOriginY(param6, -59, param2, param4) + var11, param7, param0);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_a.drawRightAligned(this.resolveDisplayText(param6, -2), var9_int + this.getUnalignedTextOriginX(param3, 14525, param1, param6), this.getUnalignedTextOriginY(param6, -28, param2, param4) + var11, param7, param0);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_a.drawString(this.resolveDisplayText(param6, -2), this.getUnalignedTextOriginX(param3, 14525, param1, param6), var11 + this.getUnalignedTextOriginY(param6, -91, param2, param4), param7, param0);
            }
          } else {
            this.field_a.drawParagraph(this.resolveDisplayText(param6, -2), this.getUnalignedTextOriginX(param3, 14525, param1, param6), this.getUnalignedTextOriginY(param6, -34, param2, param4), var9_int, var10, param7, param0, this.field_p, this.field_k, this.field_s);
          }
          StripedProgressWidget.b(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_29_0 = var9;
          stackIn_29_1 = new StringBuilder().append("vf.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param7).append(')').toString());
        }
    }

    public final int getTextOriginX(UiWidget param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            field_n = (PcmSample) null;
          }
          stackIn_3_0 = this.getUnalignedTextOriginX(param1, 14525, 0, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("vf.R(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void drawTextWithDefaultStyle(byte param0, UiWidget param1, int param2, int param3) {
        try {
          this.drawText(this.field_d, 0, param2, param3, 0, -18866, param1, this.field_i);
          int var5_int = -105 % ((-53 - param0) / 59);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "vf.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int getTextAreaHeight(UiWidget param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -44 % ((-33 - param1) / 39);
          stackIn_1_0 = -this.field_j + param0.field_z - this.field_b;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("vf.EA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final void copyStyleTo(boolean param0, DefaultTextWidgetRenderer param1) {
        param1.field_f = this.field_f;
        param1.field_g = this.field_g;
        param1.field_m = this.field_m;
        param1.field_h = this.field_h;
        param1.field_j = this.field_j;
        param1.field_r = this.field_r;
        param1.field_d = this.field_d;
        param1.field_a = this.field_a;
        param1.field_k = this.field_k;
        param1.field_b = this.field_b;
        param1.field_p = this.field_p;
        param1.field_s = this.field_s;
        if (param0) {
          return;
        }
        try {
          param1.field_i = this.field_i;
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "vf.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int getFontLineHeight(int param0) {
        if (param0 != -1431655766) {
          this.field_k = -127;
        }
        return this.field_a.field_D + this.field_a.field_C;
    }

    final static int countSetBits(int param0, int param1) {
        param0 = ((-1431655766 & param0) >>> 1) + (1431655765 & param0);
        param0 = (858993459 & param0) + ((-858993459 & param0) >>> 2);
        if (param1 != -29047) {
          field_o = (String) null;
        }
        param0 = param0 + (param0 >>> 4) & 252645135;
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return param0 & 255;
    }

    final static void a(byte param0, int param1) {
        qn.field_n = param1;
        if (param0 > -109) {
          field_c = 89;
        }
    }

    DefaultTextWidgetRenderer(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final void paintCaret(int param0, UiWidget param1, int param2, int param3, int param4) {
        int var7 = 0;
        TextLineMetrics var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        UiWidget var13 = null;
        TextLayout var14 = null;
        TextLayout var15 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param1.isFocused((byte) 21)) {
            var14 = this.getTextLayout(param1, (byte) -113);
            var15 = var14;
            var7 = var15.getLineIndexForTextOffset(-90, param4);
            var8 = var14.field_c[var7];
            var9 = var15.getXForTextOffset(param4, -115);
            var10 = this.getUnalignedTextOriginX(param0, 14525, var9, param1);
            var11 = this.getTextOriginY(param2, 2, param1) + Math.max(0, var8.field_d);
            stackIn_4_0 = this.getTextOriginY(param2, 2, param1);
            stackIn_4_1 = this.getTextAreaHeight(param1, -122);
            stackIn_4_2 = var8.field_a;
            if (var15.field_c.length <= var7 + 1) {
              stackIn_5_3 = var8.field_a;
            } else {
              stackIn_5_3 = var14.field_c[var7 + 1].field_d;
            }
            var12 = stackIn_4_0 + Math.min(stackIn_4_1, Math.min(stackIn_4_2, stackIn_5_3));
            TunnelMesh.pushAndIntersectRasterClip(param1.field_q + param0, param1.field_F + param1.field_q + param0, param1.field_z + param1.field_m + param2, param2 + param1.field_m, 14907);
            KeyboardInput.field_d.a(var10, var11, var12, var10, (byte) -62, this.field_m);
            StripedProgressWidget.b(false);
          }
          if (param3 > -19) {
            var13 = (UiWidget) null;
            this.resolveDisplayText((UiWidget) null, 103);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("vf.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    String resolveDisplayText(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -2) {
            this.field_i = 102;
          }
          stackIn_3_0 = param0.field_B;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vf.K(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void paintSelection(int param0, UiWidget param1, int param2, int param3, int param4, int param5) {
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
        var16 = Confined.field_J ? 1 : 0;
        try {
          if (param2 != 0) {
            return;
          }
          if (param5 == param3) {
            return;
          }
          if (param1.isFocused((byte) 85)) {
            var17 = this.getTextLayout(param1, (byte) -115);
            var18 = var17;
            if (param3 >= param5) {
              var9 = param3;
              var8 = param5;
            } else {
              var8 = param3;
              var9 = param5;
            }
            var10 = var18.getLineIndexForTextOffset(-96, var8);
            var11 = var18.getLineIndexForTextOffset(-120, var9);
            TunnelMesh.pushAndIntersectRasterClip(param0 + param1.field_q, param1.field_q + param0 + param1.field_F, param4 + param1.field_m + param1.field_z, param4 + param1.field_m, 14907);
            for (var12 = var10; var12 <= var11; var12++) {
              var13 = var17.field_c[var12];
              if (var10 != var12) {
                stackIn_15_0 = var13.field_e[0];
              } else {
                stackIn_15_0 = var18.getXForTextOffset(var8, -102);
              }
              var14 = stackIn_15_0;
              if (var12 != var11) {
                if (var13 != null) {
                  stackIn_20_0 = var13.field_e[var13.field_e.length - 1];
                } else {
                  stackIn_20_0 = 0;
                }
              } else {
                stackIn_20_0 = var18.getXForTextOffset(var9, -102);
              }
              var15 = stackIn_20_0;
              KeyboardInput.field_d.a(this.getUnalignedTextOriginX(param0, param2 ^ 14525, var14, param1), var13.field_d + (param1.field_y + this.field_b) + param4 + param1.field_m, this.field_g >>> 24, 126, -var14 + var15, var13.field_a, this.field_g);
            }
            StripedProgressWidget.b(false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("vf.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final int getUnalignedTextOriginX(int param0, int param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 14525) {
            stackIn_4_0 = param2 + param3.field_v + this.field_h + (param0 + param3.field_q);
            return stackIn_4_0;
          }
          stackIn_2_0 = -22;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("vf.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final int findTextOffsetAtScreenPosition(byte param0, int param1, int param2, int param3, int param4, UiWidget param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.getTextLayout(param5, (byte) -99);
          if (param0 <= 76) {
            DefaultTextWidgetRenderer.b(34);
          }
          stackIn_3_0 = param5.field_p.getTextOffsetAt(-this.getTextOriginY(param1, 2, param5) + param2, (byte) -126, -this.getTextOriginX(param5, param3, 0) + param4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("vf.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    protected DefaultTextWidgetRenderer() {
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != -1) {
          DefaultTextWidgetRenderer.countSetBits(-103, 57);
        }
        field_q = null;
        field_o = null;
        field_n = null;
        field_t = null;
    }

    DefaultTextWidgetRenderer(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_b = param3;
          this.field_m = param10;
          this.field_p = param7;
          this.field_s = param9;
          this.field_r = param2;
          this.field_g = param11;
          this.field_d = param6;
          this.field_a = param0;
          this.field_h = param1;
          this.field_f = param12 ? true : false;
          this.field_k = param8;
          this.field_j = param4;
          this.field_i = param5;
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    public final int getPreferredWidth(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        DefaultTextWidgetRenderer var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.getTextLayout(param1, (byte) -103);
          if (param0 <= 117) {
            var4 = (DefaultTextWidgetRenderer) null;
            this.copyStyleTo(true, (DefaultTextWidgetRenderer) null);
          }
          stackIn_3_0 = param1.field_p.getMaxLineRightX(true) + (this.field_h + this.field_r);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vf.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_e = new si(2);
        field_o = null;
        field_l = 50;
        field_t = "This creates a powerful#defensive force field#around your ship.";
        field_q = new va();
        field_c = 0;
    }
}
