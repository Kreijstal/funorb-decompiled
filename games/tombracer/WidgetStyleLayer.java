/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetStyleLayer {
    Sprite[] field_i;
    private int field_j;
    private int field_a;
    static ToolkitSprite[] field_b;
    private int field_d;
    Sprite field_c;
    private int field_l;
    static ToolkitSprite[] field_k;
    private boolean field_g;
    static String field_e;
    private int textColour;
    static SpriteData[] field_f;

    public static void releaseStatics(byte param0) {
        field_e = null;
        field_b = null;
        field_f = null;
        if (param0 != 46) {
          WidgetStyleLayer.releaseStatics((byte) -11);
          field_k = null;
          return;
        }
        field_k = null;
    }

    final void a(boolean param0) {
        this.field_c = null;
        this.field_j = 0;
        this.field_d = 0;
        this.field_i = null;
        this.field_a = 256;
        this.field_l = -1;
        this.textColour = 0;
        if (!param0) {
          field_f = (SpriteData[]) null;
        }
    }

    final WidgetStyleLayer withTextColour(int param0, int param1) {
        if (param1 != -2147483648) {
          this.withTextColour(119, -53);
          this.textColour = param0;
          return this;
        }
        this.textColour = param0;
        return this;
    }

    final WidgetStyleLayer c(int param0, int param1) {
        if (param0 == -1) {
          this.field_d = param1;
          return this;
        }
        Sprite[] var4 = (Sprite[]) null;
        this.setSprites(-11, (Sprite[]) null);
        this.field_d = param1;
        return this;
    }

    final WidgetStyleLayer setHorizontalOffset(int param0, int param1) {
        this.field_j = param0;
        if (param1 != 1) {
          this.field_l = 50;
          return this;
        }
        return this;
    }

    final WidgetStyleLayer a(byte param0, int param1) {
        this.field_l = param1;
        if (param0 != 7) {
          this.a(50, false);
          return this;
        }
        return this;
    }

    final void a(int param0, int param1, StatefulWidgetPainter param2, int param3, UiWidget param4) {
        BitmapFont stackIn_20_0;
        String stackIn_20_1;
        int stackIn_20_2;
        int stackIn_20_3;
        int stackIn_20_4;
        int stackIn_21_5 = 0;
        int stackIn_23_2 = 0;
        int stackIn_24_3 = 0;
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
          ConstrainToLatticeLocomotor.drawNineSlice(param4.field_p, this.field_i, param3 + param4.field_n, -118, param4.field_m, param1 + param4.field_i);
          if (null != this.field_c) {
            var6_int = param1 + (param4.field_i + this.field_d);
            if (param2.field_l == 1) {
              var6_int = var6_int + (param4.field_m - this.field_c.field_n) / 2;
            }
            var7 = this.field_j + (param3 + param4.field_n);
            if (1 == param2.field_a) {
              var7 = var7 + (-this.field_c.field_k + param4.field_p) / 2;
            }
            if (param2.field_l == 2) {
              var6_int = var6_int + (-this.field_c.field_n + param4.field_m);
            }
            if (param2.field_a == 2) {
              var7 = var7 + (param4.field_p - this.field_c.field_k);
            }
            this.field_c.drawTransparent(var6_int, var7);
          }
          if (param0 > -31) {
            field_b = (ToolkitSprite[]) null;
          }
          var6 = param2.getDisplayText(-4, param4);
          if (var6 != null &&
            null != param2.field_e) {
            if (this.textColour < 0) {
              return;
            }
            stackIn_20_0 = param2.field_e;
            stackIn_20_1 = var6;
            stackIn_20_2 = param2.field_h;
            stackIn_20_3 = param4.field_i;
            stackIn_20_4 = param1;
            if (-2147483648 != this.field_d) {
              stackIn_21_5 = this.field_d;
            } else {
              stackIn_21_5 = 0;
            }
            stackIn_23_2 = stackIn_20_2 + (stackIn_20_3 + (stackIn_20_4 + stackIn_21_5));
            if (-2147483648 != this.field_j) {
              stackIn_24_3 = this.field_j;
            } else {
              stackIn_24_3 = 0;
            }
            stackIn_26_3 = stackIn_24_3 + (param2.field_g + param3 + param4.field_n);
            stackIn_26_4 = param4.field_m - (param2.field_h + param2.field_c);
            stackIn_26_5 = -param2.field_i + (param4.field_p - param2.field_g);
            stackIn_26_6 = this.textColour;
            stackIn_26_7 = this.field_l;
            if (this.field_a != -2147483648) {
              stackIn_27_8 = this.field_a;
            } else {
              stackIn_27_8 = 256;
            }
            ((BitmapFont) (Object) stackIn_20_0).drawParagraphAlpha(stackIn_20_1, stackIn_23_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_27_8, param2.field_l, param2.field_a, param2.field_f);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_31_0 = var6_ref;
          stackIn_31_1 = new StringBuilder().append("ng.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final void mergeIntoWorkingSkin(StatefulWidgetPainter param0, UiWidget param1, int param2, int param3, int param4, WidgetStyleLayer param5) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_g) {
            param5.a(-49, param4, param0, param3, param1);
            param5.a(true);
          }
          if (null != this.field_i) {
            param5.field_i = this.field_i;
          }
          if (this.field_d != -2147483648) {
            param5.field_d = this.field_d;
          }
          if (this.field_l >= -1) {
            param5.field_l = this.field_l;
          }
          if (this.field_a != -2147483648) {
            param5.field_a = this.field_a;
          }
          if (this.textColour >= -1) {
            param5.textColour = this.textColour;
          }
          if (null != this.field_c) {
            param5.field_c = this.field_c;
          }
          if (param2 <= 122) {
            this.textColour = 119;
          }
          if (this.field_j == -2147483648) {
            return;
          }
          param5.field_j = this.field_j;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("ng.G(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final WidgetStyleLayer a(int param0, boolean param1) {
        if (param0 == -2) {
          this.field_g = param1 ? true : false;
          return this;
        }
        WidgetStyleLayer var4 = (WidgetStyleLayer) null;
        this.mergeIntoWorkingSkin((StatefulWidgetPainter) null, (UiWidget) null, 76, 31, 78, (WidgetStyleLayer) null);
        this.field_g = param1 ? true : false;
        return this;
    }

    final WidgetStyleLayer setSprites(int param0, Sprite[] param1) {
        RuntimeException var3 = null;
        WidgetStyleLayer stackIn_2_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_i = param1;
          if (param0 == 2) {
            return this;
          }
          stackIn_2_0 = (WidgetStyleLayer) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ng.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void copyTo(boolean param0, WidgetStyleLayer param1) {
        param1.field_i = this.field_i;
        param1.field_c = this.field_c;
        param1.textColour = this.textColour;
        param1.field_g = this.field_g;
        param1.field_j = this.field_j;
        param1.field_d = this.field_d;
        if (!param0) {
          return;
        }
        try {
          param1.field_l = this.field_l;
          param1.field_a = this.field_a;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ng.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    WidgetStyleLayer() {
        this.field_i = null;
        this.field_l = -2;
        this.field_c = null;
        this.field_a = -2147483648;
        this.field_g = false;
        this.field_j = -2147483648;
        this.textColour = -2;
        this.field_d = -2147483648;
    }

    static {
        field_e = "Restart Tomb";
    }
}
