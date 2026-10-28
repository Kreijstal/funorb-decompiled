/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    Sprite field_g;
    private boolean field_j;
    static String[] field_c;
    private int field_f;
    private int field_e;
    Sprite[] field_i;
    static String field_k;
    static int field_d;
    private int field_a;
    private int field_b;
    private int field_h;

    final ef b(int param0, int param1) {
        if (param0 >= -47) {
          return (ef) null;
        }
        this.field_b = param1;
        return this;
    }

    final ef a(int param0, byte param1) {
        this.field_f = param0;
        int var3 = 120 % ((param1 + 8) / 39);
        return this;
    }

    final void a(int param0, ef param1) {
        try {
          param1.field_b = this.field_b;
          param1.field_a = this.field_a;
          param1.field_g = this.field_g;
          param1.field_j = this.field_j;
          param1.field_e = this.field_e;
          param1.field_h = this.field_h;
          param1.field_i = this.field_i;
          if (param0 != -2) {
            this.field_f = -16;
          }
          param1.field_f = this.field_f;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ef.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ef c(int param0, int param1) {
        this.field_h = param1;
        int var3 = -70 / ((param0 - 39) / 35);
        return this;
    }

    final ef a(int param0, int param1) {
        this.field_a = param0;
        if (param1 != -22572) {
          this.b(-42, 116);
          return this;
        }
        return this;
    }

    final void a(int param0, ef param1, UiComponent param2, int param3, int param4, he param5) {
        String stackIn_21_2 = null;
        String stackIn_24_2 = null;
        String stackIn_27_2 = null;
        try {
          int var7_int = -58 / ((param4 + 32) / 47);
          if (this.field_j) {
            param1.a(param5, param2, param0, param3, (byte) 124);
            param1.a(true);
          }
          if (this.field_a >= -1) {
            param1.field_a = this.field_a;
          }
          if (null != this.field_g) {
            param1.field_g = this.field_g;
          }
          if (this.field_f != -2147483648) {
            param1.field_f = this.field_f;
          }
          if (this.field_h != -2147483648) {
            param1.field_h = this.field_h;
          }
          if (this.field_i != null) {
            param1.field_i = this.field_i;
          }
          if (this.field_b >= -1) {
            param1.field_b = this.field_b;
          }
          if (this.field_e == -2147483648) {
            return;
          }
          param1.field_e = this.field_e;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var7;
          StringBuilder stackIn_20_1 = new StringBuilder().append("ef.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          StringBuilder stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_c = null;
        if (guard <= 38) {
          return;
        }
        field_k = null;
    }

    final ef a(int param0, boolean param1) {
        this.field_j = param1 ? true : false;
        if (param0 > -100) {
          this.field_g = (Sprite) null;
          return this;
        }
        return this;
    }

    final void a(he param0, UiComponent param1, int param2, int param3, byte param4) {
        int stackIn_21_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_27_8;
        String stackIn_32_2 = null;
        String stackIn_35_2 = null;
        try {
          if (param4 < 0) {
            this.field_g = (Sprite) null;
          }
          ld.a(param1.height, this.field_i, 4, param3 + param1.y, param2 + param1.x, param1.width);
          if (null != this.field_g) {
            int var6_int = param2 - (-param1.x - this.field_h);
            if (param0.horizontalAlignment == 1) {
              var6_int = var6_int + (param1.width - this.field_g.fullWidth) / 2;
            }
            int var7 = this.field_f + param1.y + param3;
            if (param0.verticalAlignment == 1) {
              var7 = var7 + (-this.field_g.fullHeight + param1.height) / 2;
            }
            if (param0.horizontalAlignment == 2) {
              var6_int = var6_int + (param1.width - this.field_g.fullWidth);
            }
            if (param0.verticalAlignment == 2) {
              var7 = var7 + (-this.field_g.fullHeight + param1.height);
            }
            this.field_g.e(var6_int, var7);
          }
          String var6 = param0.displayText((byte) 39, param1);
          if (var6 != null &&
            param0.font != null) {
            if (this.field_a < 0) {
              return;
            }
            BitmapFont stackIn_20_0 = param0.font;
            String stackIn_20_1 = var6;
            if (this.field_h == -2147483648) {
              stackIn_21_2 = 0;
            } else {
              stackIn_21_2 = this.field_h;
            }
            int stackIn_23_2 = stackIn_21_2 + (param2 + param1.x + param0.leftInset);
            if (this.field_f != -2147483648) {
              stackIn_24_3 = this.field_f;
            } else {
              stackIn_24_3 = 0;
            }
            int stackIn_26_3 = stackIn_24_3 + param0.topInset + (param1.y + param3);
            int stackIn_26_4 = -param0.leftInset + param1.width - param0.rightInset;
            int stackIn_26_5 = -param0.bottomInset - param0.topInset + param1.height;
            int stackIn_26_6 = this.field_a;
            int stackIn_26_7 = this.field_b;
            if (this.field_e != -2147483648) {
              stackIn_27_8 = this.field_e;
            } else {
              stackIn_27_8 = 256;
            }
            ((BitmapFont) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_23_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_27_8, param0.horizontalAlignment, param0.verticalAlignment, param0.lineSpacing);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_31_0 = var6_ref;
          StringBuilder stackIn_31_1 = new StringBuilder().append("ef.H(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          StringBuilder stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final ef a(int param0, Sprite[] param1) {
        String stackIn_8_2 = null;
        try {
          this.field_i = param1;
          if (param0 == 2) {
            return this;
          }
          ef stackIn_2_0 = (ef) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var3;
          StringBuilder stackIn_7_1 = new StringBuilder().append("ef.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(boolean param0) {
        this.field_b = -1;
        this.field_g = null;
        if (param0) {
          this.field_i = null;
          this.field_e = 256;
          this.field_h = 0;
          this.field_f = 0;
          this.field_a = 0;
          return;
        }
        field_c = (String[]) null;
        this.field_i = null;
        this.field_e = 256;
        this.field_h = 0;
        this.field_f = 0;
        this.field_a = 0;
    }

    ef() {
        this.field_g = null;
        this.field_j = false;
        this.field_f = -2147483648;
        this.field_a = -2;
        this.field_i = null;
        this.field_e = -2147483648;
        this.field_b = -2;
        this.field_h = -2147483648;
    }

    static {
        field_c = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_k = "Rock buster - 'ENTER' or 'R' or 'ALT' to fire";
        field_d = 50;
    }
}
