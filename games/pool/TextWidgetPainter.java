/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class TextWidgetPainter implements WidgetPainter, io {
    static String field_n;
    private int shadowColor;
    int textColor;
    int horizontalAlignment;
    BitmapFont font;
    static int field_q;
    int field_g;
    static PoolMatchController field_e;
    int field_f;
    int verticalAlignment;
    int field_j;
    private boolean wrapText;
    int field_i;
    int caretColor;
    int selectionColor;
    static int field_h;
    int field_b;

    final static String a(int param0, int param1) {
        if (param0 != 8) {
          field_h = -19;
        }
        return param1 != 0 ? param1 == 1 ? "animating" : 2 != param1 ? param1 != 3 ? "illegal state" : "finished with end choice" : "finished" : "waiting";
    }

    String getWidgetText(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1) {
            stackIn_4_0 = param1.widgetText;
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("am.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final int preferredHeight(int param0, UiWidget param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        UiWidget var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            var4 = (UiWidget) null;
            discarded$1 = this.a((UiWidget) null, -35, -25, (byte) -43);
          }
          this.ensureTextLayout(0, param1);
          stackIn_3_0 = param1.field_x.totalHeight((byte) 66) + this.field_f + this.field_j;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("am.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        int var1 = 92 / ((28 - param0) / 59);
        field_n = null;
    }

    public final void drawSelection(int param0, int param1, int param2, int param3, int param4, UiWidget param5) {
        int var12 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
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
        TextLayout var17 = null;
        TextLayout var18 = null;
        var16 = Pool.field_O;
        try {
          if (param4 != 154888568) {
            TextWidgetPainter.releaseStatics((byte) -85);
          }
          if (param0 == param1) {
            return;
          }
          if (param5.hasKeyboardFocus(55)) {
            var17 = this.ensureTextLayout(0, param5);
            var18 = var17;
            if (param1 >= param0) {
              var9 = param1;
              var8 = param0;
            } else {
              var9 = param0;
              var8 = param1;
            }
            var10 = var18.lineOfCaret(var8, param4 ^ 154888568);
            var11 = var18.lineOfCaret(var9, 0);
            QuickChatPhraseRegistry.a(param2 + param5.widgetX, param5.widgetY + param3, param5.widgetX + (param2 + param5.widgetWidth), (byte) -118, param5.widgetY + (param3 + param5.widgetHeight));
            for (var12 = var10; var12 <= var11; var12++) {
              var13 = var17.field_b[var12];
              if (var10 != var12) {
                stackIn_14_0 = var13.caretXs[0];
              } else {
                stackIn_14_0 = var18.caretX(var8, (byte) -72);
              }
              var14 = stackIn_14_0;
              if (var11 != var12) {
                if (var13 != null) {
                  stackIn_19_0 = var13.caretXs[-1 + var13.caretXs.length];
                } else {
                  stackIn_19_0 = 0;
                }
              } else {
                stackIn_19_0 = var18.caretX(var9, (byte) -102);
              }
              var15 = stackIn_19_0;
              VerticalScrollbar.field_Sb.fillRectangleAlpha(var15 - var14, this.selectionColor >>> 24, var13.bottom, var13.top + this.field_f + (param5.widgetY + (param3 + param5.textOffsetY)), this.selectionColor, (byte) 124, this.a(var14, (byte) 11, param2, param5));
            }
            TriangleMesh.a(121);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("am.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public final int contentWidth(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 26) {
            stackIn_4_0 = -this.field_g + (-this.field_i + param1.widgetWidth);
            return stackIn_4_0;
          }
          stackIn_2_0 = 65;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("am.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final int a(int param0, byte param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 11) {
            field_h = 21;
          }
          stackIn_3_0 = param3.textOffsetX + this.field_i + param2 + (param3.widgetX + param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("am.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    TextWidgetPainter(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final TextLayout ensureTextLayout(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        TextLayout stackIn_8_0 = null;
        TextLayout stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param1.field_x) {
            param1.field_x = (TextLayout) ((Object) new BitmapTextLayout());
          }
          if (!this.wrapText) {
            this.a(param1, false);
          } else {
            ((BitmapTextLayout) (param1.field_x)).layoutParagraph(this.horizontalAlignment, this.getWidgetText(-1, param1), this.font, this.contentHeight(param1, -3), this.field_b, this.contentWidth((byte) 26, param1), this.verticalAlignment, 0);
          }
          if (param0 == 0) {
            stackIn_10_0 = param1.field_x;
            return stackIn_10_0;
          }
          stackIn_8_0 = (TextLayout) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("am.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public void paintWidget(boolean param0, int param1, byte param2, int param3, UiWidget param4) {
        int var6_int = 4 % ((param2 - 2) / 41);
        if (null == this.font) {
          return;
        }
        try {
          this.a((byte) -117, param4, param1, param3);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "am.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public final int preferredWidth(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.ensureTextLayout(0, param0);
          if (param1 == -1848150943) {
            stackIn_4_0 = param0.field_x.maxRightEdge(-1) - (-this.field_i - this.field_g);
            return stackIn_4_0;
          }
          stackIn_2_0 = -29;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("am.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int characterIndexAtPosition(int param0, int param1, int param2, UiWidget param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 < 73) {
            this.wrapText = false;
          }
          this.ensureTextLayout(0, param3);
          stackIn_3_0 = param3.field_x.caretIndexAtPoint(-this.textTop(param0, param3, (byte) -7) + param2, -this.textLeft(5286, param3, param5) + param1, -1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("am.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(UiWidget param0, boolean param1) {
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
        var7 = Pool.field_O;
        try {
          if (param0.field_x == null) {
            param0.field_x = (TextLayout) ((Object) new BitmapTextLayout());
          }
          var3_int = this.contentWidth((byte) 26, param0);
          var4 = this.contentHeight(param0, -3);
          var6 = this.verticalAlignment;
          if (var6 != 0) {
            if (2 == var6) {
              var5 = var4 - this.font.maxDescent;
            } else {
              if (3 != var6 &&
                1 == var6) {
              }
              var5 = this.font.maxAscent + (-this.font.maxDescent + (var4 - this.font.maxAscent) >> 1);
            }
          } else {
            var5 = this.font.maxAscent;
          }
          if (param1) {
            var8 = (UiWidget) null;
            this.drawSelection(116, 45, -107, -47, -40, (UiWidget) null);
          }
          var6Lifetime1 = this.horizontalAlignment;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (1 == var6Lifetime1) {
              if (!(param0.field_x instanceof BitmapTextLayout)) {
                return;
              }
              ((BitmapTextLayout) (param0.field_x)).layoutCentered(this.font, var3_int >> 1, var5, this.getWidgetText(-1, param0), false);
              return;
            }
            if (var6Lifetime1 != 2) {
              return;
            }
            if (!(param0.field_x instanceof BitmapTextLayout)) {
              return;
            }
            ((BitmapTextLayout) (param0.field_x)).layoutRightAligned(this.getWidgetText(-1, param0), this.font, false, var5, var3_int);
            return;
          }
          if (param0.field_x instanceof BitmapTextLayout) {
            ((BitmapTextLayout) (param0.field_x)).layoutLeftAligned(var5, this.getWidgetText(-1, param0), this.font, true, 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("am.U(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    final void copyStyleTo(int param0, TextWidgetPainter param1) {
        param1.textColor = this.textColor;
        param1.horizontalAlignment = this.horizontalAlignment;
        param1.field_i = this.field_i;
        param1.field_g = this.field_g;
        param1.shadowColor = this.shadowColor;
        param1.selectionColor = this.selectionColor;
        param1.field_f = this.field_f;
        param1.wrapText = this.wrapText;
        param1.caretColor = this.caretColor;
        param1.verticalAlignment = this.verticalAlignment;
        param1.field_b = this.field_b;
        param1.field_j = this.field_j;
        if (param0 != -1177150015) {
          return;
        }
        try {
          param1.font = this.font;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "am.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(byte param0) {
        try {
          int var1_int = 0;
          int var3 = Pool.field_O;
          if (GameRules.field_c != null) {
            GameRules.field_c.closeSocket((byte) -80);
          }
          if (null != CheckboxWidget.field_U) {
            CheckboxWidget.field_U.shutdown(-11307);
          }
          if (ih.field_a != null) {
            try {
              ih.field_a.close((byte) 86);
            } catch (IOException iOException) {
            }
          }
          if (null != MenuSelection.field_d) {
            for (var1_int = 0; MenuSelection.field_d.length > var1_int; var1_int++) {
              if (MenuSelection.field_d[var1_int] != null) {
                try {
                  MenuSelection.field_d[var1_int].close((byte) 86);
                } catch (IOException var2_ref) {
                }
              }
            }
          }
          if (param0 != 70) {
            TextWidgetPainter.a(-10, 42);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final int lineHeight(int param0) {
        if (param0 != -10492) {
          return 54;
        }
        return this.font.maxAscent + this.font.maxDescent;
    }

    final static boolean projectPointIfVisible(byte param0, int[] param1, float[] param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 73) {
            return false;
          }
          param2[0] = 0.5f + 8.0f * param2[0];
          param2[1] = param2[1] * 8.0f + 0.5f;
          param2[2] = 0.5f + 8.0f * param2[2];
          if ((float)param1[9] * ((float)(-param1[0]) + param2[0]) + (float)param1[10] * ((float)(-param1[1]) + param2[1]) + (param2[2] - (float)param1[2]) * (float)param1[11] < 0.0f) {
            return false;
          }
          ag.projectToScreen(param1, param2, 9);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("am.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final int a(UiWidget param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 68) {
            this.field_f = -82;
          }
          stackIn_3_0 = param2 + (param0.widgetY + this.field_f) - (-param0.textOffsetY - param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("am.O(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final int textLeft(int param0, UiWidget param1, int param2) {
        RuntimeException var4 = null;
        UiWidget var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5286) {
            var5 = (UiWidget) null;
            this.textLeft(51, (UiWidget) null, 122);
          }
          stackIn_3_0 = this.a(0, (byte) 11, param2, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("am.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void drawCaret(int param0, int param1, int param2, int param3, UiWidget param4) {
        int discarded$1 = 0;
        int var7 = 0;
        TextLineLayout var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        UiWidget var13 = null;
        TextLayout var14 = null;
        TextLayout var15 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_3;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param4.hasKeyboardFocus(66)) {
            var14 = this.ensureTextLayout(param0 - 1, param4);
            var15 = var14;
            var7 = var15.lineOfCaret(param2, 0);
            var8 = var14.field_b[var7];
            var9 = var15.caretX(param2, (byte) -94);
            var10 = this.a(var9, (byte) 11, param3, param4);
            var11 = this.textTop(param1, param4, (byte) -7) + Math.max(0, var8.top);
            stackIn_3_0 = this.textTop(param1, param4, (byte) -7);
            stackIn_3_1 = this.contentHeight(param4, -3);
            stackIn_3_2 = var8.bottom;
            if (1 + var7 >= var15.field_b.length) {
              stackIn_4_3 = var8.bottom;
            } else {
              stackIn_4_3 = var14.field_b[var7 + 1].top;
            }
            var12 = stackIn_3_0 + Math.min(stackIn_3_1, Math.min(stackIn_3_2, stackIn_4_3));
            QuickChatPhraseRegistry.a(param4.widgetX + param3, param4.widgetY + param1, param4.widgetX + param3 + param4.widgetWidth, (byte) -125, param4.widgetHeight + param4.widgetY + param1);
            VerticalScrollbar.field_Sb.drawLine(-1, var10, var12, this.caretColor, var10, var11);
            TriangleMesh.a(param0 + 114);
          }
          if (param0 != 1) {
            var13 = (UiWidget) null;
            discarded$1 = this.a((UiWidget) null, 37, -42, (byte) -76);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("am.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final int textTop(int param0, UiWidget param1, byte param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -7) {
            this.field_g = -17;
          }
          stackIn_3_0 = this.a(param1, 0, param0, (byte) 98);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("am.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (param0 < 114) {
          field_h = 49;
        }
        LimitedRandomAccessFile.b((byte) -60);
    }

    private final int contentHeight(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -3) {
            var4 = (UiWidget) null;
            this.a((byte) -37, (UiWidget) null, 11, -127);
          }
          stackIn_3_0 = param0.widgetHeight - this.field_f - this.field_j;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("am.W(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, UiWidget param2, int param3, int param4, int param5, int param6, byte param7) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = Pool.field_O;
        try {
          QuickChatPhraseRegistry.a(param2.widgetX + param6, param5 + param2.widgetY, param2.widgetWidth + param2.widgetX + param6, (byte) 85, param2.widgetY + param5 + param2.widgetHeight);
          var9_int = this.contentWidth((byte) 26, param2);
          var10 = this.contentHeight(param2, param7 + 19);
          if (param7 != -22) {
            this.shadowColor = 62;
          }
          boolean decompiledFrameRemainder0 = true;
          if (!this.wrapText) {
            var12 = this.verticalAlignment;
            if (0 == var12) {
              var11 = this.font.maxAscent;
            } else {
              if (var12 != 2) {
                if (var12 != 3 &&
                  var12 != 1) {
                }
                var11 = (var10 - this.font.maxAscent - this.font.maxDescent >> 1) + this.font.maxAscent;
              } else {
                var11 = -this.font.maxDescent + var10;
              }
            }
            var12Lifetime1 = this.horizontalAlignment;
            if (var12Lifetime1 != 0 &&
              var12Lifetime1 != 3) {
              if (var12Lifetime1 == 1) {
                this.font.drawCentered(this.getWidgetText(-1, param2), this.a(param3, (byte) 11, param6, param2) + (var9_int >> 1), this.a(param2, param0, param5, (byte) 125) + var11, param1, param4);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.font.c(this.getWidgetText(-1, param2), this.a(param3, (byte) 11, param6, param2) + var9_int, this.a(param2, param0, param5, (byte) 106) + var11, param1, param4);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.font.d(this.getWidgetText(param7 ^ 21, param2), this.a(param3, (byte) 11, param6, param2), var11 + this.a(param2, param0, param5, (byte) 92), param1, param4);
            }
          } else {
            this.font.drawParagraph(this.getWidgetText(param7 ^ 21, param2), this.a(param3, (byte) 11, param6, param2), this.a(param2, param0, param5, (byte) 70), var9_int, var10, param1, param4, this.horizontalAlignment, this.verticalAlignment, this.field_b);
          }
          TriangleMesh.a(114);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_27_0 = var9;
          stackIn_27_1 = new StringBuilder().append("am.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final void a(byte param0, UiWidget param1, int param2, int param3) {
        try {
          int var5_int = -52 / ((param0 + 10) / 61);
          this.a(0, this.textColor, param1, 0, this.shadowColor, param3, param2, (byte) -22);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "am.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    protected TextWidgetPainter() {
    }

    TextWidgetPainter(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.shadowColor = param6;
          this.verticalAlignment = param8;
          this.selectionColor = param11;
          this.field_f = param3;
          this.wrapText = param12 ? true : false;
          this.font = param0;
          this.caretColor = param10;
          this.field_i = param1;
          this.field_b = param9;
          this.field_g = param2;
          this.textColor = param5;
          this.field_j = param4;
          this.horizontalAlignment = param7;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "am.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
    }
}
