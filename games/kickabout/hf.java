/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static hh field_a;
    private int field_f;
    private int field_i;
    ut[] field_g;
    private int field_h;
    private int field_b;
    static bu field_e;
    private boolean field_d;
    ut field_j;
    private int field_c;

    final void a(int param0) {
        this.field_h = 0;
        this.field_i = 256;
        this.field_j = null;
        this.field_g = null;
        this.field_b = 0;
        if (param0 != -13136) {
          return;
        }
        this.field_f = 0;
        this.field_c = -1;
    }

    final hf a(boolean param0, ut[] param1) {
        RuntimeException var3 = null;
        hf var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            var4 = (hf) null;
            this.a((hf) null, -70);
          }
          this.field_g = param1;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final hf b(byte param0, int param1) {
        if (param0 < 89) {
          hf.a(true);
        }
        this.field_h = param1;
        return this;
    }

    final hf a(int param0, boolean param1) {
        if (!param1) {
          this.field_j = (ut) null;
        }
        this.field_c = param0;
        return this;
    }

    final static String a(byte param0, int param1, int param2, byte[] param3) {
        int var6 = 0;
        int incrementValue$0 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var9 = 0;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var8 = 0;
        String var10 = null;
        var9 = Kickabout.field_G;
        try {
          var12 = new char[param1];
          var11 = var12;
          var4 = var11;
          var5 = 0;
          for (var6 = 0; param1 > var6; var6++) {
            var7 = param3[param2 + var6] & 255;
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = ts.field_c[var7 - 128];
                if (var8 == 0) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$0 = var5;
              var5++;
              var4[incrementValue$0] = (char)var7;
            }
          }
          if (param0 >= -119) {
            var10 = (String) null;
            hf.a((String) null, 99);
          }
          stackIn_16_0 = new String(var12, 0, var5);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("hf.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_e = (bu) null;
        }
        field_e = null;
        field_a = null;
    }

    final hf a(byte param0, int param1) {
        this.field_b = param1;
        if (param0 >= -26) {
          this.field_d = true;
        }
        return this;
    }

    final hf a(boolean param0, byte param1) {
        int var3 = 19 / ((41 - param1) / 47);
        this.field_d = param0 ? true : false;
        return this;
    }

    final void a(int param0, int param1, id param2, fd param3, int param4, hf param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_d) {
            param5.a(param3, param2, param0, param4, 0);
            param5.a(-13136);
          }
          if (this.field_i != param1) {
            param5.field_i = this.field_i;
          }
          if (this.field_g != null) {
            param5.field_g = this.field_g;
          }
          if (this.field_c >= -1) {
            param5.field_c = this.field_c;
          }
          if (this.field_j != null) {
            param5.field_j = this.field_j;
          }
          if (this.field_h != -2147483648) {
            param5.field_h = this.field_h;
          }
          if (this.field_f >= -1) {
            param5.field_f = this.field_f;
          }
          if (this.field_b != -2147483648) {
            param5.field_b = this.field_b;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("hf.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
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
          throw nb.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final hf b(int param0, int param1) {
        if (param0 != -2) {
          return (hf) null;
        }
        this.field_f = param1;
        return this;
    }

    final void a(hf param0, int param1) {
        try {
          param0.field_h = this.field_h;
          param0.field_b = this.field_b;
          param0.field_d = this.field_d;
          param0.field_g = this.field_g;
          param0.field_j = this.field_j;
          param0.field_c = this.field_c;
          if (param1 != -2147483648) {
            this.field_i = -81;
          }
          param0.field_i = this.field_i;
          param0.field_f = this.field_f;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "hf.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          var2_int = 0;
          if (param1 != -3) {
            hf.a(false);
          }
          while (var2_int < param0.length()) {
            var3 = param0.charAt(var2_int);
            if (!se.a((byte) -113, (char) var3) &&
              !gn.a(12105, (char) var3)) {
              return true;
            }
            var2_int++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("hf.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, nu param1, int param2) {
        int var6 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = Kickabout.field_G;
        try {
          stackIn_4_0 = (1 != param0) ? 0 : 1;
          var3_int = stackIn_4_0;
          if (param2 < 26) {
            var9 = (String) null;
            hf.a((String) null, 97);
          }
          stackIn_9_0 = (var3_int != 0) ? -1 : 1345;
          var4 = stackIn_9_0;
          var5 = -1;
          for (var6 = 1; 5 > var6; var6++) {
            var7 = param1.field_P[param0][var6].a(true);
            if (var3_int != 0 &&
              var7 >= var4 ||
              var3_int == 0 &&
              var4 >= var7) {
              var4 = var7;
              var5 = var6;
            }
          }
          stackIn_22_0 = var5;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("hf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(fd param0, id param1, int param2, int param3, int param4) {
        hu stackIn_21_0;
        String stackIn_21_1;
        int stackIn_21_2;
        int stackIn_21_3;
        int stackIn_21_4;
        int stackIn_22_5 = 0;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_25_4 = 0;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        int stackIn_28_8;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        hf var8 = null;
        try {
          if (param4 != 0) {
            var8 = (hf) null;
            this.a((hf) null, 96);
          }
          ea.a(param2 + param0.field_g, param0.field_i, param0.field_t + param3, (byte) 79, this.field_g, param0.field_n);
          if (null != this.field_j) {
            var6_int = this.field_b + param0.field_t + param3;
            if (param1.field_e == 1) {
              var6_int = var6_int + (-this.field_j.field_o + param0.field_n) / 2;
            }
            var7 = param2 + param0.field_g + this.field_h;
            if (1 == param1.field_m) {
              var7 = var7 + (-this.field_j.field_v + param0.field_i) / 2;
            }
            if (param1.field_e == 2) {
              var6_int = var6_int + (param0.field_n - this.field_j.field_o);
            }
            if (param1.field_m == 2) {
              var7 = var7 + (param0.field_i - this.field_j.field_v);
            }
            this.field_j.c(var6_int, var7);
          }
          var6 = param1.b((byte) -83, param0);
          if (var6 != null &&
            null != param1.field_a) {
            if (this.field_f < 0) {
              return;
            }
            stackIn_21_0 = param1.field_a;
            stackIn_21_1 = var6;
            stackIn_21_2 = param1.field_h;
            stackIn_21_3 = param0.field_t;
            stackIn_21_4 = param3;
            if (this.field_b != -2147483648) {
              stackIn_22_5 = this.field_b;
            } else {
              stackIn_22_5 = 0;
            }
            stackIn_24_2 = stackIn_21_2 + (stackIn_21_3 + (stackIn_21_4 + stackIn_22_5));
            stackIn_24_3 = param1.field_q + param0.field_g + param2;
            if (-2147483648 != this.field_h) {
              stackIn_25_4 = this.field_h;
            } else {
              stackIn_25_4 = 0;
            }
            stackIn_27_3 = stackIn_24_3 + stackIn_25_4;
            stackIn_27_4 = -param1.field_l + (param0.field_n - param1.field_h);
            stackIn_27_5 = -param1.field_o + (param0.field_i - param1.field_q);
            stackIn_27_6 = this.field_f;
            stackIn_27_7 = this.field_c;
            if (-2147483648 == this.field_i) {
              stackIn_28_8 = 256;
            } else {
              stackIn_28_8 = this.field_i;
            }
            ((hu) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_24_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_28_8, param1.field_e, param1.field_m, param1.field_p);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_32_0 = var6_ref;
          stackIn_32_1 = new StringBuilder().append("hf.J(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    hf() {
        this.field_i = -2147483648;
        this.field_f = -2;
        this.field_d = false;
        this.field_h = -2147483648;
        this.field_b = -2147483648;
        this.field_g = null;
        this.field_c = -2;
        this.field_j = null;
    }

    static {
        field_a = new hh();
    }
}
