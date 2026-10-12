/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ip {
    RgbSprite field_j;
    static boolean field_e;
    private int field_g;
    private int field_h;
    private int field_a;
    RgbSprite[] field_d;
    private int field_i;
    private boolean field_f;
    static RgbSprite[] field_c;
    private int field_b;

    final ip a(byte param0, int param1) {
        this.field_a = param1;
        if (param0 != 81) {
          field_e = true;
          return this;
        }
        return this;
    }

    final void a(kb param0, byte param1, int param2, int param3, ao param4) {
        BitmapFont stackIn_19_0;
        String stackIn_19_1;
        int stackIn_19_2;
        int stackIn_19_3;
        int stackIn_20_4 = 0;
        int stackIn_22_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_25_3;
        int stackIn_25_4;
        int stackIn_25_5;
        int stackIn_25_6;
        int stackIn_25_7;
        int stackIn_26_8;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          i.a(this.field_d, param0.field_w, param0.field_B + param3, (byte) -47, param2 + param0.field_p, param0.field_l);
          if (null != this.field_j) {
            var6_int = this.field_i + param0.field_B + param3;
            if (1 == param4.field_n) {
              var6_int = var6_int + (param0.field_l - this.field_j.field_A) / 2;
            }
            var7 = this.field_a + (param2 + param0.field_p);
            if (param4.field_k == 1) {
              var7 = var7 + (-this.field_j.field_x + param0.field_w) / 2;
            }
            if (param4.field_n == 2) {
              var6_int = var6_int + (param0.field_l - this.field_j.field_A);
            }
            if (param4.field_k == 2) {
              var7 = var7 + (param0.field_w - this.field_j.field_x);
            }
            this.field_j.g(var6_int, var7);
          }
          var6 = param4.d(0, param0);
          if (param1 < 44) {
            this.a(-101, 108);
          }
          if (var6 != null &&
            param4.field_q != null) {
            if (0 > this.field_b) {
              return;
            }
            stackIn_19_0 = param4.field_q;
            stackIn_19_1 = var6;
            stackIn_19_2 = param4.field_i + param3;
            stackIn_19_3 = param0.field_B;
            if (-2147483648 != this.field_i) {
              stackIn_20_4 = this.field_i;
            } else {
              stackIn_20_4 = 0;
            }
            stackIn_22_2 = stackIn_19_2 + (stackIn_19_3 + stackIn_20_4);
            if (this.field_a == -2147483648) {
              stackIn_23_3 = 0;
            } else {
              stackIn_23_3 = this.field_a;
            }
            stackIn_25_3 = stackIn_23_3 + param4.field_g + (param2 + param0.field_p);
            stackIn_25_4 = -param4.field_t - param4.field_i + param0.field_l;
            stackIn_25_5 = -param4.field_g + param0.field_w - param4.field_m;
            stackIn_25_6 = this.field_b;
            stackIn_25_7 = this.field_g;
            if (-2147483648 == this.field_h) {
              stackIn_26_8 = 256;
            } else {
              stackIn_26_8 = this.field_h;
            }
            ((BitmapFont) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_22_2, stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7, stackIn_26_8, param4.field_n, param4.field_k, param4.field_j);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_30_0 = var6_ref;
          stackIn_30_1 = new StringBuilder().append("ip.A(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final void a(boolean param0, ip param1) {
        try {
          param1.field_d = this.field_d;
          param1.field_g = this.field_g;
          param1.field_a = this.field_a;
          param1.field_f = this.field_f;
          param1.field_j = this.field_j;
          param1.field_b = this.field_b;
          param1.field_h = this.field_h;
          if (param0) {
            this.field_d = (RgbSprite[]) null;
          }
          param1.field_i = this.field_i;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ip.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ip a(boolean param0, byte param1) {
        if (param1 >= 53) {
          this.field_f = param0 ? true : false;
          return this;
        }
        this.field_h = -125;
        this.field_f = param0 ? true : false;
        return this;
    }

    final ip a(int param0, int param1) {
        this.field_i = param0;
        if (param1 != 1) {
          this.field_d = (RgbSprite[]) null;
          return this;
        }
        return this;
    }

    final void a(int param0, ip param1, int param2, ao param3, int param4, kb param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        ao var8 = null;
        try {
          if (this.field_f) {
            param1.a(param5, (byte) 53, param4, param2, param3);
            param1.a(false);
          }
          if (-2147483648 != this.field_i) {
            param1.field_i = this.field_i;
          }
          if (null != this.field_j) {
            param1.field_j = this.field_j;
          }
          if (-1 <= this.field_b) {
            param1.field_b = this.field_b;
          }
          if (this.field_g >= -1) {
            param1.field_g = this.field_g;
          }
          if (this.field_a != -2147483648) {
            param1.field_a = this.field_a;
          }
          if (this.field_h != -2147483648) {
            param1.field_h = this.field_h;
          }
          if (this.field_d != null) {
            param1.field_d = this.field_d;
          }
          if (param0 == -10265) {
            return;
          }
          var8 = (ao) null;
          this.a((kb) null, (byte) -95, -90, -1, (ao) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("ip.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final ip b(int param0, int param1) {
        if (param1 < 121) {
          this.a(true, (byte) -5);
          this.field_g = param0;
          return this;
        }
        this.field_g = param0;
        return this;
    }

    final void a(boolean param0) {
        this.field_h = 256;
        this.field_a = 0;
        if (!param0) {
          this.field_g = -1;
          this.field_b = 0;
          this.field_d = null;
          this.field_i = 0;
          this.field_j = null;
          return;
        }
        ao var3 = (ao) null;
        this.a((kb) null, (byte) 78, -97, 60, (ao) null);
        this.field_g = -1;
        this.field_b = 0;
        this.field_d = null;
        this.field_i = 0;
        this.field_j = null;
    }

    final ip a(RgbSprite[] param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -84 / ((param1 + 64) / 62);
          this.field_d = param0;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ip.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2) {
        of.field_Ib = param0;
        me.field_e = param1;
        if (param2 <= 77) {
          field_e = true;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, tu param4, RgbSprite[] param5, int param6, String param7, int param8) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        try {
          var9_int = param4.a(param7) + (param5[0].field_y << 1);
          if (param1 > -92) {
            field_c = (RgbSprite[]) null;
          }
          var10 = param6 - (var9_int >> 1);
          var11 = param6 + (var9_int >> 1);
          if (var10 < 0) {
            param6 = param6 - var10;
          } else {
            if (var11 > 640) {
              param6 = param6 - (-640 + var11);
            }
          }
          jp.a(-(var9_int >> 1) + param6, param8, var9_int, param5, param3, -8991);
          param4.c(param7, param6, 2 + (param4.field_v + param8), param0, -1);
          if (!param2) {
            return;
          }
          re.a(param8, -(var9_int >> 1) + param6, -122, var9_int, param5, 128);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_12_0 = var9;
          stackIn_12_1 = new StringBuilder().append("ip.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param8).append(')').toString());
        }
    }

    final ip a(int param0, byte param1) {
        this.field_b = param0;
        int var3 = -92 / ((param1 + 28) / 55);
        return this;
    }

    public static void a(int param0) {
        int var1 = 72 % ((-33 - param0) / 60);
        field_c = null;
    }

    ip() {
        this.field_d = null;
        this.field_a = -2147483648;
        this.field_g = -2;
        this.field_j = null;
        this.field_i = -2147483648;
        this.field_f = false;
        this.field_h = -2147483648;
        this.field_b = -2;
    }

    static {
        field_e = false;
    }
}
