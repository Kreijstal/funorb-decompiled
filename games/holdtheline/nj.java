/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    private int field_l;
    private int field_a;
    static int field_d;
    private boolean field_f;
    private int field_h;
    private int field_k;
    hj[] field_j;
    static float field_e;
    hj field_b;
    static uf[] field_c;
    static hj field_i;
    private int field_g;

    final void a(nj param0, int param1) {
        try {
          param0.field_j = this.field_j;
          param0.field_k = this.field_k;
          param0.field_g = this.field_g;
          param0.field_a = this.field_a;
          param0.field_f = this.field_f;
          param0.field_l = this.field_l;
          if (param1 != -1) {
            this.b(88, -100);
          }
          param0.field_h = this.field_h;
          param0.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "nj.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final nj b(int param0, int param1) {
        this.field_l = param0;
        if (param1 != -26228) {
          this.a(39, 17);
          return this;
        }
        return this;
    }

    final static void a(int param0, int param1, String[] param2, String param3) {
        int var5 = 0;
        String[] var6 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var4 = null;
        RuntimeException var4_ref = null;
        var5 = HoldTheLine.field_D;
        try {
          ak.field_b = fd.field_c;
          if (255 != param1) {
            if (100 > param1) {
              ja.field_U = ij.a(param3, 256, param1);
            } else {
              if (param1 <= 105) {
                var4 = param2;
                ri.a((byte) 102, var4);
                ja.field_U = ca.a(param2, (byte) 123);
              } else {
                ja.field_U = ij.a(param3, 256, param1);
              }
            }
          } else {
            stackIn_5_0 = !(u.field_V >= 13);
            ja.field_U = kl.a(stackIn_5_0, 0);
            var6 = (String[]) null;
            ri.a((byte) 71, (String[]) null);
          }
          if (param0 == 256) {
            return;
          }
          nj.a(58);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_17_0 = var4_ref;
          stackIn_17_1 = new StringBuilder().append("nj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void a(ig param0, nj param1, int param2, int param3, int param4, n param5) {
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
          if (this.field_f) {
            param1.a(param5, param2, param3, -1, param0);
            param1.a((byte) -121);
          }
          if (this.field_a != -2147483648) {
            param1.field_a = this.field_a;
          }
          if (param4 != -28063) {
            field_e = -1.5048772096633911f;
          }
          if (this.field_g != -2147483648) {
            param1.field_g = this.field_g;
          }
          if (this.field_j != null) {
            param1.field_j = this.field_j;
          }
          if (-1 <= this.field_l) {
            param1.field_l = this.field_l;
          }
          if (-2147483648 != this.field_k) {
            param1.field_k = this.field_k;
          }
          if (null != this.field_b) {
            param1.field_b = this.field_b;
          }
          if (this.field_h < -1) {
            return;
          }
          param1.field_h = this.field_h;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("nj.K(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final nj a(int param0, boolean param1) {
        this.field_g = param0;
        if (!param1) {
          return (nj) null;
        }
        return this;
    }

    final nj a(int param0, hj[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_j = param1;
          if (param0 != 29536) {
            this.a((byte) 115);
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("nj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final nj a(int param0, int param1) {
        this.field_a = param0;
        if (param1 > -115) {
          return (nj) null;
        }
        return this;
    }

    final nj a(boolean param0, int param1) {
        if (param1 == -2147483648) {
          this.field_f = param0 ? true : false;
          return this;
        }
        String var4 = (String) null;
        nj.a(33, -24, (String[]) null, (String) null);
        this.field_f = param0 ? true : false;
        return this;
    }

    final void a(byte param0) {
        this.field_g = 0;
        this.field_j = null;
        this.field_h = -1;
        this.field_l = 0;
        if (param0 == -121) {
          this.field_b = null;
          this.field_k = 256;
          this.field_a = 0;
          return;
        }
    }

    final void a(n param0, int param1, int param2, int param3, ig param4) {
        qi stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_21_2 = 0;
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
          hi.a(this.field_j, param0.field_u, true, param0.field_x, param2 + param0.field_k, param1 + param0.field_o);
          if (null != this.field_b) {
            var6_int = param2 + param0.field_k + this.field_a;
            var7 = this.field_g + param0.field_o + param1;
            if (param4.field_i == 1) {
              var6_int = var6_int + (-this.field_b.field_o + param0.field_x) / 2;
            }
            if (param4.field_d == 1) {
              var7 = var7 + (-this.field_b.field_v + param0.field_u) / 2;
            }
            if (param4.field_i == 2) {
              var6_int = var6_int + (param0.field_x - this.field_b.field_o);
            }
            if (2 == param4.field_d) {
              var7 = var7 + (-this.field_b.field_v + param0.field_u);
            }
            this.field_b.a(var6_int, var7);
          }
          if (param3 != -1) {
            return;
          }
          var6 = param4.a(param0, (byte) -15);
          if (var6 != null &&
            null != param4.field_f &&
            this.field_l >= 0) {
            stackIn_20_0 = param4.field_f;
            stackIn_20_1 = var6;
            if (this.field_a == -2147483648) {
              stackIn_21_2 = 0;
            } else {
              stackIn_21_2 = this.field_a;
            }
            stackIn_23_2 = stackIn_21_2 + param4.field_j + param0.field_k + param2;
            if (this.field_g != -2147483648) {
              stackIn_24_3 = this.field_g;
            } else {
              stackIn_24_3 = 0;
            }
            stackIn_26_3 = stackIn_24_3 + param4.field_p + (param0.field_o + param1);
            stackIn_26_4 = -param4.field_n + (-param4.field_j + param0.field_x);
            stackIn_26_5 = -param4.field_e + param0.field_u - param4.field_p;
            stackIn_26_6 = this.field_l;
            stackIn_26_7 = this.field_h;
            if (this.field_k == -2147483648) {
              stackIn_27_8 = 256;
            } else {
              stackIn_27_8 = this.field_k;
            }
            ((qi) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_23_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_27_8, param4.field_i, param4.field_d, param4.field_h);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_31_0 = var6_ref;
          stackIn_31_1 = new StringBuilder().append("nj.B(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_c = null;
        if (param0 < 55) {
          field_c = (uf[]) null;
        }
    }

    nj() {
        this.field_h = -2;
        this.field_a = -2147483648;
        this.field_f = false;
        this.field_j = null;
        this.field_k = -2147483648;
        this.field_l = -2;
        this.field_b = null;
        this.field_g = -2147483648;
    }

    final nj b(int param0, boolean param1) {
        this.field_h = param0;
        if (param1) {
          return (nj) null;
        }
        return this;
    }

    static {
    }
}
