/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextWidgetRenderer implements WidgetRenderer, TextWidgetLayout {
    int field_g;
    private boolean field_q;
    BitmapFont field_n;
    static java.awt.Image field_a;
    static String waitingForGraphicsText;
    int field_e;
    int field_o;
    int field_c;
    private int field_p;
    int field_f;
    int field_i;
    int field_m;
    static boolean field_k;
    int field_j;
    int field_b;
    int field_h;
    static String field_d;

    private final int a(UiWidget param0, int param1, int param2, int param3) {
        int discarded$1 = 0;
        RuntimeException var5 = null;
        UiWidget var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 11875) {
            var6 = (UiWidget) null;
            discarded$1 = this.b((UiWidget) null, 96, -93, -23);
          }
          stackIn_3_0 = this.field_e + param0.widgetX + param1 + (param0.field_k + param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ff.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1, UiWidget param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Geoblox.clientControlFlowFlag;
        try {
          L0: {
            PasswordWidgetRenderer.a(param0 + param2.widgetY, param2.widgetX + param7, param3 - 14045, param2.widgetY + (param0 + param2.widgetHeight), param2.widgetWidth + (param7 + param2.widgetX));
            var9_int = this.a(param2, param3 - 1);
            var10 = this.b(289769985, param2);
            if (!this.field_q) {
              var12 = this.field_i;
              if (var12 != 0) {
                if (var12 != 2) {
                  if ((var12 != 3) &&
                      (var12 != 1)) {
                  }
                  var11 = (-this.field_n.maxAscent + (var10 - this.field_n.maxDescent) >> 1) + this.field_n.maxAscent;
                } else {
                  var11 = var10 - this.field_n.maxDescent;
                }
              } else {
                var11 = this.field_n.maxAscent;
              }
              var12 = this.field_g;
              if ((var12 != 0) &&
                  (var12 != 3)) {
                if (var12 == 1) {
                  this.field_n.drawCenteredText(this.c(125, param2), this.a(param2, param7, 11875, param6) + (var9_int >> 1), this.b(param2, param0, 1674, param4) + var11, param5, param1);
                  break L0;
                }
                if (var12 != 2) {
                  break L0;
                }
                this.field_n.drawRightAlignedText(this.c(112, param2), var9_int + this.a(param2, param7, param3 + 11875, param6), var11 + this.b(param2, param0, 1674, param4), param5, param1);
                break L0;
              }
              this.field_n.drawText(this.c(121, param2), this.a(param2, param7, 11875, param6), this.b(param2, param0, 1674, param4) + var11, param5, param1);
            } else {
              this.field_n.drawParagraph(this.c(113, param2), this.a(param2, param7, 11875, param6), this.b(param2, param0, 1674, param4), var9_int, var10, param5, param1, this.field_g, this.field_i, this.field_f);
            }
          }
          if (param3 != 0) {
            this.field_e = -98;
          }
          id.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_30_0 = var9;
          stackIn_30_1 = new StringBuilder().append("ff.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final void a(int param0, int param1, UiWidget param2, boolean param3) {
        try {
            this.a(param1, this.field_p, param2, 0, 0, this.field_o, 0, param0);
            if (!param3) {
                UiWidget var6 = (UiWidget) null;
                this.b((byte) -108, (UiWidget) null);
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ff.P(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void b(byte param0, UiWidget param1) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Geoblox.clientControlFlowFlag;
        try {
          if (null == param1.field_w) {
            param1.field_w = (TextLayout) ((Object) new CachedTextLayout());
          }
          var3_int = this.a(param1, -1);
          var4 = this.b(289769985, param1);
          if (param0 != 109) {
            return;
          }
          var6 = this.field_i;
          if (var6 != 0) {
            if (var6 != 2) {
              if ((var6 != 3) &&
                  (var6 == 1)) {
              }
              var5 = (var4 - (this.field_n.maxAscent + this.field_n.maxDescent) >> 1) + this.field_n.maxAscent;
            } else {
              var5 = var4 - this.field_n.maxDescent;
            }
          } else {
            var5 = this.field_n.maxAscent;
          }
          L4: {
            var6 = this.field_g;
            if ((var6 != 0) &&
                (var6 != 3)) {
              if (var6 == 1) {
                if (!(param1.field_w instanceof CachedTextLayout)) {
                  break L4;
                }
                ((CachedTextLayout) ((Object) param1.field_w)).a(this.c(122, param1), var5, var3_int >> 1, (byte) 58, this.field_n);
                return;
              }
              if (var6 != 2) {
                break L4;
              }
              if (!(param1.field_w instanceof CachedTextLayout)) {
                break L4;
              }
              ((CachedTextLayout) ((Object) param1.field_w)).a(var3_int, var5, (byte) -21, this.field_n, this.c(125, param1));
              return;
            }
            if (param1.field_w instanceof CachedTextLayout) {
              ((CachedTextLayout) ((Object) param1.field_w)).a(var5, 0, this.c(param0 ^ 18, param1), -91, this.field_n);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("ff.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    public final TextLayout a(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        TextLayout stackIn_8_0 = null;
        TextLayout stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.field_w == null) {
            param1.field_w = (TextLayout) ((Object) new CachedTextLayout());
          }
          if (this.field_q) {
            ((CachedTextLayout) ((Object) param1.field_w)).a(this.field_i, 1, this.c(116, param1), this.field_f, this.field_n, this.a(param1, -1), this.field_g, this.b(289769985, param1));
          } else {
            this.b((byte) 109, param1);
          }
          if (param0 > 110) {
            stackIn_10_0 = param1.field_w;
            return stackIn_10_0;
          }
          stackIn_8_0 = (TextLayout) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ff.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    TextWidgetRenderer(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final int a(UiWidget param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        UiWidget var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a((byte) 115, param0);
          if (param2 != -15539) {
            var8 = (UiWidget) null;
            this.b((byte) 9, (UiWidget) null);
          }
          stackIn_3_0 = param0.field_w.a(param1 - this.a(param5, param0, (byte) 46), -109, param4 - this.a(param3, -2, param0));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("ff.V(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final int a(UiWidget param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a((byte) 126, param0);
          var3_int = 24 / ((param1 - 30) / 57);
          stackIn_1_0 = param0.field_w.a(90) - (-this.field_e - this.field_j);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ff.AA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(int param0, UiWidget param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 46 / ((param0 + 58) / 61);
          this.a((byte) 127, param1);
          stackIn_1_0 = param1.field_w.b(-3111) + this.field_m + this.field_b;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ff.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        waitingForGraphicsText = null;
        field_d = null;
        field_a = null;
        if (!param0) {
            field_a = (java.awt.Image) null;
        }
    }

    final void a(TextWidgetRenderer param0, boolean param1) {
        try {
            param0.field_i = this.field_i;
            param0.field_c = this.field_c;
            param0.field_m = this.field_m;
            param0.field_e = this.field_e;
            param0.field_f = this.field_f;
            param0.field_n = this.field_n;
            if (!param1) {
                this.field_m = 34;
            }
            param0.field_j = this.field_j;
            param0.field_b = this.field_b;
            param0.field_q = this.field_q;
            param0.field_o = this.field_o;
            param0.field_h = this.field_h;
            param0.field_p = this.field_p;
            param0.field_g = this.field_g;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ff.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
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
          if (param2 != 1674) {
            var6 = (UiWidget) null;
            this.c(-123, (UiWidget) null);
          }
          stackIn_3_0 = param3 + param0.field_n + (this.field_m + (param0.widgetY + param1));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ff.U(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    String c(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 109) {
            this.field_i = 23;
          }
          stackIn_3_0 = param1.widgetText;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ff.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int a(int param0, int param1, UiWidget param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -2) {
            field_k = true;
          }
          stackIn_3_0 = this.b(param2, param0, param1 ^ -1676, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ff.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int a(int param0, UiWidget param1, byte param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 46) {
            stackIn_4_0 = this.a(param1, param0, param2 + 11829, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = 59;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ff.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public void drawWidget(int parentX, int methodGuard, int parentY, boolean widgetEnabled, UiWidget widget) {
        if (!(null != this.field_n)) {
            return;
        }
        try {
            this.a(parentX, parentY, widget, true);
            if (methodGuard >= -5) {
                this.field_c = -8;
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ff.E(" + parentX + ',' + methodGuard + ',' + parentY + ',' + widgetEnabled + ',' + (widget != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(int param0) {
        if (param0 != 1) {
            UiWidget var3 = (UiWidget) null;
            this.a(79, -83, (UiWidget) null, -31, 118, 54, 3, -68);
        }
        return this.field_n.maxAscent + this.field_n.maxDescent;
    }

    private final int b(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 289769985) {
            stackIn_4_0 = -this.field_m + param1.widgetHeight - this.field_b;
            return stackIn_4_0;
          }
          stackIn_2_0 = 90;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ff.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, UiWidget param3, int param4) {
        int var7 = 0;
        TextLayoutLine var8 = null;
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
          if (param3.hasKeyboardFocus((byte) 54)) {
            var14 = this.a((byte) 121, param3);
            var15 = var14;
            var7 = var15.a((byte) 24, param1);
            var8 = var14.field_a[var7];
            var9 = var15.a(param1, 120);
            var10 = this.a(param3, param0, 11875, var9);
            var11 = this.a(param4, -2, param3) + Math.max(0, var8.field_d);
            stackIn_4_0 = this.a(param4, -2, param3);
            stackIn_4_1 = this.b(289769985, param3);
            stackIn_4_2 = var8.field_a;
            if (var7 + 1 >= var15.field_a.length) {
              stackIn_5_3 = var8.field_a;
            } else {
              stackIn_5_3 = var14.field_a[var7 + 1].field_d;
            }
            var12 = stackIn_4_0 + Math.min(stackIn_4_1, Math.min(stackIn_4_2, stackIn_5_3));
            PasswordWidgetRenderer.a(param4 + param3.widgetY, param0 + param3.widgetX, -14045, param4 + param3.widgetY + param3.widgetHeight, param3.widgetWidth + param0 + param3.widgetX);
            DialRenderer.field_j.a(var12, var10, this.field_c, var11, var10, 8947848);
            id.a(true);
          }
          if (param2 != -2) {
            var13 = (UiWidget) null;
            this.a((UiWidget) null, (byte) 70);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("ff.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param4).append(')').toString());
        }
    }

    public final int a(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            var4 = (UiWidget) null;
            this.a(106, 101, 118, (UiWidget) null, -6);
          }
          stackIn_3_0 = -this.field_j - this.field_e + param0.widgetWidth;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ff.R(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, UiWidget param5) {
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
        UiWidget var17 = null;
        TextLayout var18 = null;
        TextLayout var19 = null;
        var16 = Geoblox.clientControlFlowFlag;
        try {
          if (param0 == param4) {
            return;
          }
          if (param1 != 0) {
            var17 = (UiWidget) null;
            this.a(90, -50, (UiWidget) null);
          }
          if (param5.hasKeyboardFocus((byte) 54)) {
            var18 = this.a((byte) 115, param5);
            var19 = var18;
            if (param4 <= param0) {
              var9 = param0;
              var8 = param4;
            } else {
              var9 = param4;
              var8 = param0;
            }
            var10 = var19.a((byte) 24, var8);
            var11 = var19.a((byte) 24, var9);
            PasswordWidgetRenderer.a(param2 + param5.widgetY, param3 + param5.widgetX, -14045, param5.widgetHeight + (param5.widgetY + param2), param5.widgetWidth + (param3 + param5.widgetX));
            for (var12 = var10; var12 <= var11; var12++) {
              var13 = var18.field_a[var12];
              if (var10 != var12) {
                stackIn_15_0 = var13.field_c[0];
              } else {
                stackIn_15_0 = var19.a(var8, 110);
              }
              var14 = stackIn_15_0;
              if (var11 != var12) {
                if (var13 != null) {
                  stackIn_20_0 = var13.field_c[var13.field_c.length - 1];
                } else {
                  stackIn_20_0 = 0;
                }
              } else {
                stackIn_20_0 = var19.a(var9, 124);
              }
              var15 = stackIn_20_0;
              DialRenderer.field_j.a(var13.field_d + (param2 + param5.widgetY + this.field_m + param5.field_n), var13.field_a, -var14 + var15, this.field_h >>> 24, param1 ^ 15658734, this.field_h, this.a(param5, param3, 11875, var14));
            }
            id.a(true);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("ff.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    protected TextWidgetRenderer() {
    }

    TextWidgetRenderer(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_i = param8;
            this.field_q = param12 ? true : false;
            this.field_j = param2;
            this.field_n = param0;
            this.field_h = param11;
            this.field_p = param6;
            this.field_f = param9;
            this.field_o = param5;
            this.field_e = param1;
            this.field_b = param4;
            this.field_m = param3;
            this.field_c = param10;
            this.field_g = param7;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ff.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        waitingForGraphicsText = "Waiting for graphics";
        field_d = null;
    }
}
