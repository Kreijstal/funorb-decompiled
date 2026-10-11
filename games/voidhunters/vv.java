/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vv {
    private int field_i;
    private int field_h;
    phb[] field_b;
    phb field_e;
    private int field_g;
    private boolean field_d;
    private int field_f;
    static String field_a;
    static int field_c;
    private int field_j;

    final void a(byte param0, vv param1) {
        try {
          param1.field_b = this.field_b;
          param1.field_i = this.field_i;
          param1.field_h = this.field_h;
          param1.field_g = this.field_g;
          param1.field_j = this.field_j;
          param1.field_f = this.field_f;
          int var3_int = 52 / ((param0 - 30) / 45);
          param1.field_e = this.field_e;
          param1.field_d = this.field_d;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "vv.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final vv a(int param0, int param1) {
        int var3 = 107 / ((0 - param0) / 45);
        this.field_h = param1;
        return this;
    }

    final void a(uea param0, boolean param1, int param2, shb param3, int param4) {
        no stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_25_6 = 0;
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
        try {
          abb.a(3, param3.field_f, param3.field_h, param4 + param3.field_r, this.field_b, param2 + param3.field_g);
          if (this.field_e != null) {
            var6_int = this.field_h + (param2 + param3.field_g);
            if (param0.field_c == 1) {
              var6_int = var6_int + (-this.field_e.field_m + param3.field_h) / 2;
            }
            var7 = this.field_f + (param4 + param3.field_r);
            if (2 == param0.field_c) {
              var6_int = var6_int + (-this.field_e.field_m + param3.field_h);
            }
            if (param0.field_n == 1) {
              var7 = var7 + (-this.field_e.field_n + param3.field_f) / 2;
            }
            if (param0.field_n == 2) {
              var7 = var7 + (param3.field_f - this.field_e.field_n);
            }
            this.field_e.a(var6_int, var7);
          }
          if (param1) {
            return;
          }
          var6 = param0.b((byte) -110, param3);
          if (var6 != null &&
            null != param0.field_d &&
            this.field_j >= 0) {
            stackIn_21_0 = param0.field_d;
            stackIn_21_1 = var6;
            if (this.field_h != -2147483648) {
              stackIn_22_2 = this.field_h;
            } else {
              stackIn_22_2 = 0;
            }
            stackIn_24_2 = stackIn_22_2 + param0.field_f + (param2 + param3.field_g);
            stackIn_24_3 = param4;
            stackIn_24_4 = param3.field_r;
            stackIn_24_5 = -param0.field_k;
            if (-2147483648 != this.field_f) {
              stackIn_25_6 = this.field_f;
            } else {
              stackIn_25_6 = 0;
            }
            stackIn_27_3 = stackIn_24_3 + (stackIn_24_4 - (stackIn_24_5 - stackIn_25_6));
            stackIn_27_4 = param3.field_h - param0.field_f - param0.field_o;
            stackIn_27_5 = -param0.field_k + (param3.field_f - param0.field_m);
            stackIn_27_6 = this.field_j;
            stackIn_27_7 = this.field_g;
            if (-2147483648 != this.field_i) {
              stackIn_28_8 = this.field_i;
            } else {
              stackIn_28_8 = 256;
            }
            ((no) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_24_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_28_8, param0.field_c, param0.field_n, param0.field_h);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_32_0 = var6_ref;
          stackIn_32_1 = new StringBuilder().append("vv.H(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 24358) {
          vv.b(-6);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final void a(vv param0, int param1, shb param2, int param3, int param4, uea param5) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param4 != -2879) {
            this.field_f = 100;
          }
          if (this.field_d) {
            param0.a(param5, false, param1, param2, param3);
            param0.a(param4 ^ -2887);
          }
          if (this.field_f != -2147483648) {
            param0.field_f = this.field_f;
          }
          if (-1 <= this.field_g) {
            param0.field_g = this.field_g;
          }
          if (-2147483648 != this.field_i) {
            param0.field_i = this.field_i;
          }
          if (null != this.field_b) {
            param0.field_b = this.field_b;
          }
          if (null != this.field_e) {
            param0.field_e = this.field_e;
          }
          if (-2147483648 != this.field_h) {
            param0.field_h = this.field_h;
          }
          if (this.field_j < -1) {
            return;
          }
          param0.field_j = this.field_j;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_27_0 = var7;
          stackIn_27_1 = new StringBuilder().append("vv.J(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final vv b(int param0, int param1) {
        if (param1 != -2147483648) {
          this.field_b = (phb[]) null;
          this.field_j = param0;
          return this;
        }
        this.field_j = param0;
        return this;
    }

    final vv a(boolean param0, phb[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.a(77, 70);
          }
          this.field_b = param1;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vv.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final vv c(int param0, int param1) {
        this.field_g = param0;
        if (param1 != -2147483648) {
          this.b(-117, 101);
          return this;
        }
        return this;
    }

    final vv b(int param0, boolean param1) {
        if (!param1) {
          this.field_f = param0;
          return this;
        }
        shb var4 = (shb) null;
        this.a((uea) null, false, 1, (shb) null, -23);
        this.field_f = param0;
        return this;
    }

    final vv a(int param0, boolean param1) {
        this.field_d = param1 ? true : false;
        if (param0 > -121) {
          return (vv) null;
        }
        return this;
    }

    final void a(int param0) {
        this.field_g = -1;
        if (param0 == 120) {
          this.field_h = 0;
          this.field_f = 0;
          this.field_b = null;
          this.field_i = 256;
          this.field_e = null;
          this.field_j = 0;
          return;
        }
        this.a(-14, 114);
        this.field_h = 0;
        this.field_f = 0;
        this.field_b = null;
        this.field_i = 256;
        this.field_e = null;
        this.field_j = 0;
    }

    vv() {
        this.field_b = null;
        this.field_g = -2;
        this.field_d = false;
        this.field_i = -2147483648;
        this.field_f = -2147483648;
        this.field_e = null;
        this.field_h = -2147483648;
        this.field_j = -2;
    }

    static {
        field_a = "Only show lobby chat from my friends";
        field_c = 120;
    }
}
