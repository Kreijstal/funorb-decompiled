/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si {
    Sprite[] field_a;
    private int field_k;
    static lh field_n;
    private int field_d;
    private boolean field_h;
    private int field_e;
    private int field_f;
    static String[] field_i;
    Sprite field_l;
    private int field_b;
    static boolean archiveUseControlOpcode2;
    static lh field_m;
    static int field_j;
    static al field_g;

    final static String a(String param0, int param1, String param2, ResourceArchive param3) {
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3.ensureIndexLoaded(param1 ^ param1)) {
            stackIn_4_0 = param2 + " - " + param3.getLoadProgress((byte) 110) + "%";
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) (param0);
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var4);
          stackIn_7_1 = new StringBuilder().append("si.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final si a(int param0, int param1) {
        this.field_f = param1;
        if (param0 != 0) {
            return (si) null;
        }
        return (si) (this);
    }

    final si b(int param0, int param1) {
        this.field_e = param1;
        if (param0 != 256) {
            return (si) null;
        }
        return (si) (this);
    }

    final si a(boolean param0, byte param1) {
        this.field_h = param0 ? true : false;
        if (param1 != 73) {
            si.a(false);
            return (si) (this);
        }
        return (si) (this);
    }

    final void a(rd param0, int param1, int param2, UiWidget param3, int param4) {
        BitmapFont stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_23_2;
        int stackIn_23_3;
        int stackIn_23_4;
        int stackIn_24_5 = 0;
        int stackIn_26_3;
        int stackIn_26_4;
        int stackIn_26_5;
        int stackIn_26_6;
        int stackIn_26_7;
        int stackIn_27_8;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          ma.drawNineSlicePanel(param3.widgetY + param2, param1 + param3.widgetX, param3.widgetHeight, (byte) -92, param3.widgetWidth, this.field_a);
          if (this.field_l != null) {
            var6_int = this.field_b + (param3.widgetX + param1);
            var7 = this.field_f + param2 + param3.widgetY;
            if (param0.field_g == 1) {
              var6_int = var6_int + (-this.field_l.fullWidth + param3.widgetWidth) / 2;
            }
            if (2 == param0.field_g) {
              var6_int = var6_int + (-this.field_l.fullWidth + param3.widgetWidth);
            }
            if (param0.field_i == 1) {
              var7 = var7 + (param3.widgetHeight - this.field_l.fullHeight) / 2;
            }
            if (2 == param0.field_i) {
              var7 = var7 + (-this.field_l.fullHeight + param3.widgetHeight);
            }
            this.field_l.draw(var6_int, var7);
          }
          if (param4 != 0) {
            field_n = (lh) null;
          }
          var6 = param0.c(120, param3);
          if ((var6 != null) &&
              (null != param0.field_n)) {
            if (this.field_e < 0) {
              return;
            }
            stackIn_20_0 = param0.field_n;
            stackIn_20_1 = (String) (var6);
            if (this.field_b != -2147483648) {
              stackIn_21_2 = this.field_b;
            } else {
              stackIn_21_2 = 0;
            }
            stackIn_23_2 = stackIn_21_2 + param0.field_e + param3.widgetX + param1;
            stackIn_23_3 = param0.field_m;
            stackIn_23_4 = param3.widgetY + param2;
            if (this.field_f == -2147483648) {
              stackIn_24_5 = 0;
            } else {
              stackIn_24_5 = this.field_f;
            }
            stackIn_26_3 = stackIn_23_3 + (stackIn_23_4 + stackIn_24_5);
            stackIn_26_4 = -param0.field_e + param3.widgetWidth - param0.field_j;
            stackIn_26_5 = -param0.field_b + (-param0.field_m + param3.widgetHeight);
            stackIn_26_6 = this.field_e;
            stackIn_26_7 = this.field_d;
            if (this.field_k != -2147483648) {
              stackIn_27_8 = this.field_k;
            } else {
              stackIn_27_8 = 256;
            }
            ((BitmapFont) (Object) stackIn_20_0).drawParagraphAlpha(stackIn_20_1, stackIn_23_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_27_8, param0.field_g, param0.field_i, param0.field_f);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_31_0 = (RuntimeException) (var6_ref);
          stackIn_31_1 = new StringBuilder().append("si.B(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param4).append(')').toString());
        }
    }

    final si a(byte param0, int param1) {
        this.field_d = param1;
        if (param0 != 16) {
            return (si) null;
        }
        return (si) (this);
    }

    final si b(byte param0, int param1) {
        this.field_b = param1;
        if (param0 != -53) {
            this.field_h = true;
            return (si) (this);
        }
        return (si) (this);
    }

    public static void a(boolean param0) {
        field_i = null;
        field_m = null;
        field_g = null;
        if (param0) {
            archiveUseControlOpcode2 = true;
            field_n = null;
            return;
        }
        field_n = null;
    }

    final void a(int param0, int param1, si param2, rd param3, int param4, UiWidget param5) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_h) {
            param2.a(param3, param0, param1, param5, 0);
            param2.a((byte) -8);
          }
          if (param4 != -16566) {
            return;
          }
          if (this.field_f != -2147483648) {
            param2.field_f = this.field_f;
          }
          if (this.field_d >= -1) {
            param2.field_d = this.field_d;
          }
          if (this.field_k != -2147483648) {
            param2.field_k = this.field_k;
          }
          if (null != this.field_a) {
            param2.field_a = this.field_a;
          }
          if (null != this.field_l) {
            param2.field_l = this.field_l;
          }
          if (this.field_e >= -1) {
            param2.field_e = this.field_e;
          }
          if (this.field_b == -2147483648) {
            return;
          }
          param2.field_b = this.field_b;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = (RuntimeException) (var7);
          stackIn_23_1 = new StringBuilder().append("si.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final void a(int param0, si param1) {
        try {
            param1.field_e = this.field_e;
            if (param0 != 2) {
                Sprite[] var4 = (Sprite[]) null;
                this.a((Sprite[]) null, true);
            }
            param1.field_k = this.field_k;
            param1.field_b = this.field_b;
            param1.field_a = this.field_a;
            param1.field_l = this.field_l;
            param1.field_h = this.field_h;
            param1.field_f = this.field_f;
            param1.field_d = this.field_d;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "si.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final si a(Sprite[] param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            this.a((byte) 66, -18);
          }
          this.field_a = param0;
          return (si) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var3);
          stackIn_6_1 = new StringBuilder().append("si.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0) {
        this.field_a = null;
        this.field_l = null;
        this.field_d = -1;
        this.field_b = 0;
        this.field_k = 256;
        int var2 = 108 / ((57 - param0) / 46);
        this.field_f = 0;
        this.field_e = 0;
    }

    si() {
        this.field_a = null;
        this.field_d = -2;
        this.field_k = -2147483648;
        this.field_h = false;
        this.field_e = -2;
        this.field_f = -2147483648;
        this.field_l = null;
        this.field_b = -2147483648;
    }

    static {
        field_n = new lh();
        field_m = new lh();
        field_j = 5167632;
    }
}
