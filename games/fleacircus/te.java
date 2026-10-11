/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    private boolean field_b;
    dd field_c;
    static String field_i;
    private int field_f;
    private int field_h;
    private int field_a;
    private int field_e;
    dd[] field_g;
    private int field_d;

    final void a(int param0) {
        this.field_e = -1;
        this.field_d = 0;
        this.field_a = 0;
        this.field_f = 256;
        this.field_h = param0;
        this.field_c = null;
        this.field_g = null;
    }

    final te c(int param0, int param1) {
        this.field_a = param1;
        if (param0 < 103) {
          this.field_c = (dd) null;
          return this;
        }
        return this;
    }

    final te a(int param0, int param1) {
        this.field_e = param0;
        if (param1 < 111) {
          field_i = (String) null;
          return this;
        }
        return this;
    }

    final te a(int param0, byte param1) {
        if (param1 != -75) {
          return (te) null;
        }
        this.field_d = param0;
        return this;
    }

    final void a(hb param0, qa param1, int param2, int param3, int param4) {
        fa stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_25_5 = 0;
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
          og.a(param1.field_z + param3, this.field_g, -113, param4 + param1.field_y, param1.field_j, param1.field_u);
          if (this.field_c != null) {
            var6_int = param4 + param1.field_y + this.field_h;
            var7 = this.field_a + (param1.field_z + param3);
            if (1 == param0.field_i) {
              var6_int = var6_int + (-this.field_c.field_x + param1.field_u) / 2;
            }
            if (param0.field_h == 1) {
              var7 = var7 + (-this.field_c.field_r + param1.field_j) / 2;
            }
            if (param0.field_i == 2) {
              var6_int = var6_int + (param1.field_u - this.field_c.field_x);
            }
            if (2 == param0.field_h) {
              var7 = var7 + (param1.field_j - this.field_c.field_r);
            }
            this.field_c.d(var6_int, var7);
          }
          var6 = param0.c(35, param1);
          if (param2 != 0) {
            return;
          }
          if (var6 != null &&
            param0.field_j != null) {
            if (this.field_d < 0) {
              return;
            }
            stackIn_21_0 = param0.field_j;
            stackIn_21_1 = var6;
            if (this.field_h != -2147483648) {
              stackIn_22_2 = this.field_h;
            } else {
              stackIn_22_2 = 0;
            }
            stackIn_24_2 = stackIn_22_2 + param0.field_n + (param4 + param1.field_y);
            stackIn_24_3 = param3 + param1.field_z;
            stackIn_24_4 = param0.field_m;
            if (-2147483648 == this.field_a) {
              stackIn_25_5 = 0;
            } else {
              stackIn_25_5 = this.field_a;
            }
            stackIn_27_3 = stackIn_24_3 + (stackIn_24_4 + stackIn_25_5);
            stackIn_27_4 = -param0.field_o + (-param0.field_n + param1.field_u);
            stackIn_27_5 = -param0.field_k - param0.field_m + param1.field_j;
            stackIn_27_6 = this.field_d;
            stackIn_27_7 = this.field_e;
            if (this.field_f != -2147483648) {
              stackIn_28_8 = this.field_f;
            } else {
              stackIn_28_8 = 256;
            }
            ((fa) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_24_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_28_8, param0.field_i, param0.field_h, param0.field_d);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_32_0 = var6_ref;
          stackIn_32_1 = new StringBuilder().append("te.K(");
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
          throw pf.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final te a(boolean param0, dd[] param1) {
        RuntimeException var3 = null;
        te var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            var4 = (te) null;
            this.a((te) null, 57);
          }
          this.field_g = param1;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("te.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        if (param0) {
          te.a(false);
        }
    }

    final void a(te param0, int param1, qa param2, hb param3, int param4, int param5) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_b) {
            param0.a(param3, param2, param5 + 2, param1, param4);
            param0.a(0);
          }
          if (null != this.field_c) {
            param0.field_c = this.field_c;
          }
          if (-2147483648 != this.field_a) {
            param0.field_a = this.field_a;
          }
          if (this.field_d >= -1) {
            param0.field_d = this.field_d;
          }
          if (this.field_e >= -1) {
            param0.field_e = this.field_e;
          }
          if (param5 != -2) {
            return;
          }
          if (this.field_h != -2147483648) {
            param0.field_h = this.field_h;
          }
          if (this.field_g != null) {
            param0.field_g = this.field_g;
          }
          if (-2147483648 == this.field_f) {
            return;
          }
          param0.field_f = this.field_f;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("te.D(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final te a(boolean param0, byte param1) {
        this.field_b = param0 ? true : false;
        if (param1 > -101) {
          this.field_d = 76;
          return this;
        }
        return this;
    }

    final static void b(int param0, int param1) {
        fb.b(param0 ^ -92);
        if (param0 != 0) {
          field_i = (String) null;
        }
    }

    final te a(boolean param0, int param1) {
        if (!param0) {
          this.field_e = 73;
          this.field_h = param1;
          return this;
        }
        this.field_h = param1;
        return this;
    }

    final void a(te param0, int param1) {
        try {
          param0.field_e = this.field_e;
          param0.field_h = this.field_h;
          param0.field_a = this.field_a;
          param0.field_b = this.field_b;
          param0.field_f = this.field_f;
          if (param1 <= 22) {
            this.a(-120);
          }
          param0.field_g = this.field_g;
          param0.field_c = this.field_c;
          param0.field_d = this.field_d;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "te.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    te() {
        this.field_c = null;
        this.field_f = -2147483648;
        this.field_e = -2;
        this.field_a = -2147483648;
        this.field_h = -2147483648;
        this.field_b = false;
        this.field_g = null;
        this.field_d = -2;
    }

    static {
        field_i = "This password contains your Player Name, and would be easy to guess";
    }
}
