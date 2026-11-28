/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DefaultTextWidgetRenderer implements WidgetRenderer, TextWidgetRenderer {
    BitmapFont field_f;
    int field_e;
    int field_c;
    int field_a;
    int field_k;
    private int field_n;
    int field_o;
    int field_b;
    int field_h;
    static String[] field_g;
    int field_d;
    private boolean field_l;
    int field_j;
    static String field_i;
    int field_m;
    static boolean field_p;

    private final void drawTextWithDefaultStyle(int param0, UiWidget param1, byte param2, int param3) {
        try {
          this.drawText(param0, param3, 0, param1, this.field_c, 0, 26296, this.field_n);
          if (param2 >= -97) {
            this.field_b = 76;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "hd.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    DefaultTextWidgetRenderer(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final void paintCaret(int param0, UiWidget param1, int param2, int param3, int param4) {
        TextLayout var13 = null;
        TextLayout var14 = null;
        int var7 = 0;
        TextLineMetrics var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
          if (param0 != -3) {
            field_p = true;
          }
          if (param1.isFocused(true)) {
            var13 = this.getTextLayout(param1, (byte) -41);
            var14 = var13;
            var7 = var14.getLineIndexForTextOffset(param4, 0);
            var8 = var13.field_d[var7];
            var9 = var14.getXForTextOffset((byte) -30, param4);
            var10 = this.getUnalignedTextOriginX(param1, var9, (byte) 125, param2);
            var11 = this.getTextOriginY((byte) -95, param1, param3) + Math.max(0, var8.field_g);
            var12 = this.getTextOriginY((byte) -42, param1, param3) + Math.min(this.getTextAreaHeight(true, param1), Math.min(var8.field_c, var14.field_d.length <= var7 + 1 ? var8.field_c : var13.field_d[1 + var7].field_g));
            cl.a(true, param1.field_j + param3 + param1.field_f, param1.field_s + param2, param1.field_j + param3, param1.field_i + param1.field_s + param2);
            eh.field_j.a(this.field_j, var10, var11, var12, var10, false);
            wf.a(-82);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "hd.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int getUnalignedTextOriginX(UiWidget param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 125) {
            this.field_d = -27;
          }
          stackIn_3_0 = param0.field_s + (param3 + this.field_d) + (param0.field_n + param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("hd.Q(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final TextLayout getTextLayout(UiWidget param0, byte param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        UiWidget var4 = null;
        TextLayout stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param0.field_m) {
            param0.field_m = (TextLayout) ((Object) new RichTextLayout());
          }
          if (!this.field_l) {
            this.rebuildTextLayout(0, param0);
          } else {
            ((RichTextLayout) (param0.field_m)).layoutWrappedText((byte) 104, this.field_f, this.field_h, this.getTextAreaWidth(105, param0), this.getTextAreaHeight(true, param0), this.field_a, this.field_k, this.resolveDisplayText(param0, false));
          }
          if (param1 >= -36) {
            var4 = (UiWidget) null;
            discarded$1 = this.getTextAreaHeight(false, (UiWidget) null);
          }
          stackIn_9_0 = param0.field_m;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("hd.J(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    String resolveDisplayText(UiWidget param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_4_0 = param0.field_k;
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("hd.R(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void drawText(int param0, int param1, int param2, UiWidget param3, int param4, int param5, int param6, int param7) {
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
        var13 = StarCannon.field_A;
        try {
          boolean decompiledFrameRemainder0 = true;
          cl.a(true, param3.field_j + param1 + param3.field_f, param3.field_s + param0, param3.field_j + param1, param3.field_s + (param0 + param3.field_i));
          var9_int = this.getTextAreaWidth(113, param3);
          var10 = this.getTextAreaHeight(true, param3);
          if (!this.field_l) {
            var12 = this.field_a;
            if (var12 == 0) {
              var11 = this.field_f.field_p;
            } else {
              if (var12 != 2) {
                if (var12 != 3 &&
                  1 == var12) {
                }
                var11 = (-this.field_f.field_q + (var10 - this.field_f.field_p) >> 1) + this.field_f.field_p;
              } else {
                var11 = -this.field_f.field_q + var10;
              }
            }
            var12Lifetime1 = this.field_h;
            if (var12Lifetime1 != 0 &&
              3 != var12Lifetime1) {
              if (1 == var12Lifetime1) {
                this.field_f.drawCentred(this.resolveDisplayText(param3, false), this.getUnalignedTextOriginX(param3, param2, (byte) 125, param0) + (var9_int >> 1), this.getUnalignedTextOriginY(param3, param5, param1, false) + var11, param4, param7);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_f.drawRightAligned(this.resolveDisplayText(param3, false), var9_int + this.getUnalignedTextOriginX(param3, param2, (byte) 125, param0), this.getUnalignedTextOriginY(param3, param5, param1, false) + var11, param4, param7);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_f.drawString(this.resolveDisplayText(param3, false), this.getUnalignedTextOriginX(param3, param2, (byte) 125, param0), this.getUnalignedTextOriginY(param3, param5, param1, false) + var11, param4, param7);
            }
          } else {
            this.field_f.drawParagraph(this.resolveDisplayText(param3, false), this.getUnalignedTextOriginX(param3, param2, (byte) 125, param0), this.getUnalignedTextOriginY(param3, param5, param1, false), var9_int, var10, param4, param7, this.field_h, this.field_a, this.field_k);
          }
          if (param6 != 26296) {
            field_g = (String[]) null;
          }
          wf.a(param6 - 26355);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_28_0 = var9;
          stackIn_28_1 = new StringBuilder().append("hd.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
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
          this.getTextLayout(param1, (byte) -119);
          if (param0 != 16293784) {
            this.field_n = 62;
          }
          stackIn_3_0 = param1.field_m.getLayoutHeight(param0 ^ -16293862) + this.field_e + this.field_b;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hd.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void resetStaticState(byte param0) {
        field_g = null;
        field_i = null;
        if (param0 != 125) {
          field_p = true;
        }
    }

    public final int getFontLineHeight(int param0) {
        if (param0 != 0) {
          return -65;
        }
        return this.field_f.field_q + this.field_f.field_p;
    }

    public final int getTextOriginY(byte param0, UiWidget param1, int param2) {
        RuntimeException var4 = null;
        UiWidget var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -31) {
            var5 = (UiWidget) null;
            this.getTextAreaWidth(13, (UiWidget) null);
          }
          stackIn_3_0 = this.getUnalignedTextOriginY(param1, 0, param2, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("hd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public final int findTextOffsetAtScreenPosition(int param0, int param1, UiWidget param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        DefaultTextWidgetRenderer var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param5) {
            var8 = (DefaultTextWidgetRenderer) null;
            this.copyStyleTo(-92, (DefaultTextWidgetRenderer) null);
          }
          this.getTextLayout(param2, (byte) -85);
          stackIn_3_0 = param2.field_m.getTextOffsetAt(-this.getTextOriginX(param2, (byte) 12, param3) + param0, (byte) 19, -this.getTextOriginY((byte) -61, param2, param4) + param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("hd.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public void paintWidget(int param0, boolean param1, int param2, int param3, UiWidget param4) {
        if (null == this.field_f) {
          return;
        }
        try {
          this.drawTextWithDefaultStyle(param0, param4, (byte) -114, param3);
          int var6_int = 78 % ((param2 - 2) / 54);
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "hd.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final int getUnalignedTextOriginY(UiWidget param0, int param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3) {
            this.field_n = -81;
          }
          stackIn_3_0 = param1 + param2 + (param0.field_j - (-this.field_e - param0.field_q));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("hd.U(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final int getPreferredWidth(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.getTextLayout(param0, (byte) -103);
          if (param1 != -26557) {
            var4 = (UiWidget) null;
            this.getPreferredHeight(50, (UiWidget) null);
          }
          stackIn_3_0 = param0.field_m.getMaxLineRightX(119) - (-this.field_d - this.field_o);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hd.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void rebuildTextLayout(int param0, UiWidget param1) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        UiWidget var8 = null;
        int var6Lifetime1;
        var7 = StarCannon.field_A;
        try {
          if (param1.field_m == null) {
            param1.field_m = (TextLayout) ((Object) new RichTextLayout());
          }
          if (param0 != 0) {
            var8 = (UiWidget) null;
            this.rebuildTextLayout(114, (UiWidget) null);
          }
          var3_int = this.getTextAreaWidth(108, param1);
          var4 = this.getTextAreaHeight(true, param1);
          var6 = this.field_a;
          if (var6 == 0) {
            var5 = this.field_f.field_p;
          } else {
            if (var6 != 2) {
              if (var6 != 3 &&
                1 == var6) {
              }
              var5 = (-this.field_f.field_q + (-this.field_f.field_p + var4) >> 1) + this.field_f.field_p;
            } else {
              var5 = -this.field_f.field_q + var4;
            }
          }
          var6Lifetime1 = this.field_h;
          if (var6Lifetime1 != 0 &&
            3 != var6Lifetime1) {
            if (1 == var6Lifetime1) {
              if (!(param1.field_m instanceof RichTextLayout)) {
                return;
              }
              ((RichTextLayout) (param1.field_m)).layoutSingleLineCentered(this.field_f, this.resolveDisplayText(param1, false), 466572161, var3_int >> 1, var5);
              return;
            }
            if (2 != var6Lifetime1) {
              return;
            }
            if (!(param1.field_m instanceof RichTextLayout)) {
              return;
            }
            ((RichTextLayout) (param1.field_m)).layoutSingleLineRightAligned(this.resolveDisplayText(param1, false), var3_int, (byte) 127, var5, this.field_f);
            return;
          }
          if (param1.field_m instanceof RichTextLayout) {
            ((RichTextLayout) (param1.field_m)).layoutSingleLineLeftAligned(var5, 0, (byte) 111, this.resolveDisplayText(param1, false), this.field_f);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("hd.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final void copyStyleTo(int param0, DefaultTextWidgetRenderer param1) {
        try {
          param1.field_j = this.field_j;
          param1.field_e = this.field_e;
          param1.field_m = this.field_m;
          param1.field_l = this.field_l;
          param1.field_c = this.field_c;
          param1.field_a = this.field_a;
          param1.field_b = this.field_b;
          param1.field_k = this.field_k;
          param1.field_o = this.field_o;
          param1.field_h = this.field_h;
          param1.field_f = this.field_f;
          param1.field_d = this.field_d;
          if (param0 >= -17) {
            this.field_n = 34;
          }
          param1.field_n = this.field_n;
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "hd.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int getTextOriginX(UiWidget param0, byte param1, int param2) {
        RuntimeException var4 = null;
        UiWidget var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 12) {
            var5 = (UiWidget) null;
            this.resolveDisplayText((UiWidget) null, true);
          }
          stackIn_3_0 = this.getUnalignedTextOriginX(param0, 0, (byte) 125, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("hd.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    protected DefaultTextWidgetRenderer() {
    }

    private final int getTextAreaHeight(boolean param0, UiWidget param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            var4 = (UiWidget) null;
            this.getTextOriginY((byte) -63, (UiWidget) null, 80);
          }
          stackIn_3_0 = -this.field_b + param1.field_f - this.field_e;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hd.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int getTextAreaWidth(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 74) {
            this.field_h = -39;
          }
          stackIn_3_0 = param1.field_i - this.field_d - this.field_o;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void paintSelection(int param0, int param1, int param2, UiWidget param3, byte param4, int param5) {
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
        TextLineMetrics var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        TextLayout var17 = null;
        TextLayout var18 = null;
        var16 = StarCannon.field_A;
        try {
          if (param5 == param2) {
            return;
          }
          if (param4 <= 54) {
            return;
          }
          if (param3.isFocused(true)) {
            var17 = this.getTextLayout(param3, (byte) -104);
            var18 = var17;
            if (param5 < param2) {
              var8 = param5;
              var9 = param2;
            } else {
              var8 = param2;
              var9 = param5;
            }
            var10 = var18.getLineIndexForTextOffset(var8, 0);
            var11 = var18.getLineIndexForTextOffset(var9, 0);
            cl.a(true, param3.field_f + param0 + param3.field_j, param1 + param3.field_s, param0 + param3.field_j, param3.field_s + param1 + param3.field_i);
            for (var12 = var10; var12 <= var11; var12++) {
              var13 = var17.field_d[var12];
              if (var12 == var10) {
                stackIn_16_0 = var18.getXForTextOffset((byte) -30, var8);
              } else {
                stackIn_16_0 = var13.field_d[0];
              }
              var14 = stackIn_16_0;
              if (var12 == var11) {
                stackIn_21_0 = var18.getXForTextOffset((byte) -30, var9);
              } else {
                if (var13 == null) {
                  stackIn_21_0 = 0;
                } else {
                  stackIn_21_0 = var13.field_d[-1 + var13.field_d.length];
                }
              }
              var15 = stackIn_21_0;
              eh.field_j.a(this.field_m >>> 24, this.field_m, var13.field_g + param3.field_q + this.field_e + (param0 + param3.field_j), -var14 + var15, this.getUnalignedTextOriginX(param3, var14, (byte) 125, param1), var13.field_c, (byte) 113);
            }
            wf.a(-76);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("hd.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    DefaultTextWidgetRenderer(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_c = param5;
          this.field_o = param2;
          this.field_m = param11;
          this.field_l = param12 ? true : false;
          this.field_k = param9;
          this.field_j = param10;
          this.field_b = param4;
          this.field_h = param7;
          this.field_e = param3;
          this.field_d = param1;
          this.field_a = param8;
          this.field_f = param0;
          this.field_n = param6;
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "hd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_g = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_i = "Reload game";
    }
}
