/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    private boolean field_c;
    private int field_i;
    private int field_g;
    private int field_h;
    static String field_b;
    private int field_a;
    private int field_e;
    ll field_f;
    ll[] field_d;

    final sc a(int param0, int param1) {
        if (param1 != -2) {
          this.b(-40, (byte) -33);
          this.field_g = param0;
          return this;
        }
        this.field_g = param0;
        return this;
    }

    final void a(int param0) {
        this.field_a = -1;
        this.field_g = 0;
        this.field_h = 256;
        this.field_d = null;
        this.field_f = null;
        this.field_i = 0;
        int var2 = -110 / ((param0 - 52) / 60);
        this.field_e = 0;
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 <= 100) {
          field_b = (String) null;
        }
    }

    final static eh a(boolean param0, int param1) {
        if (param0) {
          return (eh) null;
        }
        eh var2 = new eh();
        wu.field_w.a(117, var2);
        lb.a(param1, 0);
        return var2;
    }

    final sc b(int param0, byte param1) {
        if (param1 != -125) {
          return (sc) null;
        }
        this.field_i = param0;
        return this;
    }

    final sc c(int param0, byte param1) {
        if (param1 != -79) {
          this.a(-72);
          this.field_a = param0;
          return this;
        }
        this.field_a = param0;
        return this;
    }

    final void a(sc param0, byte param1) {
        try {
          param0.field_g = this.field_g;
          param0.field_h = this.field_h;
          param0.field_f = this.field_f;
          param0.field_i = this.field_i;
          param0.field_e = this.field_e;
          param0.field_a = this.field_a;
          param0.field_c = this.field_c;
          param0.field_d = this.field_d;
          if (param1 != -22) {
            this.a(39, (byte) 68);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "sc.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(ea param0, boolean param1, int param2, vi param3, int param4) {
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        boolean stackIn_3_3 = false;
        hc stackIn_24_0;
        String stackIn_24_1;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_25_5 = 0;
        int stackIn_27_2 = 0;
        int stackIn_28_3 = 0;
        int stackIn_30_3;
        int stackIn_30_4;
        int stackIn_30_5;
        int stackIn_30_6;
        int stackIn_30_7;
        int stackIn_31_8;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          stackIn_2_0 = param0.field_n;
          stackIn_2_1 = param0.field_q;
          stackIn_2_2 = param2 + param0.field_p;
          stackIn_3_3 = !(param1);
          we.a(stackIn_2_0, stackIn_2_1, stackIn_2_2, stackIn_3_3, param0.field_h + param4, this.field_d);
          if (this.field_f != null) {
            var6_int = this.field_e + param0.field_p + param2;
            if (param3.field_e == 1) {
              var6_int = var6_int + (param0.field_q - this.field_f.field_v) / 2;
            }
            var7 = this.field_i + param0.field_h + param4;
            if (param3.field_f == 1) {
              var7 = var7 + (-this.field_f.field_q + param0.field_n) / 2;
            }
            if (param3.field_e == 2) {
              var6_int = var6_int + (param0.field_q - this.field_f.field_v);
            }
            if (param3.field_f == 2) {
              var7 = var7 + (-this.field_f.field_q + param0.field_n);
            }
            this.field_f.b(var6_int, var7);
          }
          var6 = param3.d(param0, -91);
          if (!param1) {
            this.field_c = false;
          }
          if (var6 != null &&
            null != param3.field_i &&
            this.field_g >= 0) {
            stackIn_24_0 = param3.field_i;
            stackIn_24_1 = var6;
            stackIn_24_2 = param2;
            stackIn_24_3 = -param0.field_p;
            stackIn_24_4 = param3.field_b;
            if (this.field_e != -2147483648) {
              stackIn_25_5 = this.field_e;
            } else {
              stackIn_25_5 = 0;
            }
            stackIn_27_2 = stackIn_24_2 - (stackIn_24_3 - (stackIn_24_4 + stackIn_25_5));
            if (-2147483648 == this.field_i) {
              stackIn_28_3 = 0;
            } else {
              stackIn_28_3 = this.field_i;
            }
            stackIn_30_3 = stackIn_28_3 + (param3.field_a + param0.field_h) + param4;
            stackIn_30_4 = -param3.field_l - param3.field_b + param0.field_q;
            stackIn_30_5 = -param3.field_g + (-param3.field_a + param0.field_n);
            stackIn_30_6 = this.field_g;
            stackIn_30_7 = this.field_a;
            if (this.field_h == -2147483648) {
              stackIn_31_8 = 256;
            } else {
              stackIn_31_8 = this.field_h;
            }
            ((hc) (Object) stackIn_24_0).a(stackIn_24_1, stackIn_27_2, stackIn_30_3, stackIn_30_4, stackIn_30_5, stackIn_30_6, stackIn_30_7, stackIn_31_8, param3.field_e, param3.field_f, param3.field_k);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_35_0 = var6_ref;
          stackIn_35_1 = new StringBuilder().append("sc.J(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(vi param0, int param1, byte param2, int param3, ea param4, sc param5) {
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
          if (this.field_c) {
            param5.a(param4, true, param3, param0, param1);
            param5.a(116);
          }
          if (null != this.field_f) {
            param5.field_f = this.field_f;
          }
          if (param2 != -107) {
            return;
          }
          if (-1 <= this.field_g) {
            param5.field_g = this.field_g;
          }
          if (null != this.field_d) {
            param5.field_d = this.field_d;
          }
          if (this.field_a >= -1) {
            param5.field_a = this.field_a;
          }
          if (-2147483648 != this.field_e) {
            param5.field_e = this.field_e;
          }
          if (this.field_h != -2147483648) {
            param5.field_h = this.field_h;
          }
          if (this.field_i == -2147483648) {
            return;
          }
          param5.field_i = this.field_i;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("sc.L(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param5 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final sc a(ll[] param0, boolean param1) {
        RuntimeException var3 = null;
        sc stackIn_2_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_d = param0;
          if (!param1) {
            return this;
          }
          stackIn_2_0 = (sc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("sc.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final sc a(int param0, byte param1) {
        int var3 = 23 / ((param1 - 27) / 35);
        this.field_e = param0;
        return this;
    }

    final sc a(byte param0, boolean param1) {
        this.field_c = param1 ? true : false;
        if (param0 == -50) {
          return this;
        }
        vi var4 = (vi) null;
        this.a((ea) null, false, -68, (vi) null, 7);
        return this;
    }

    sc() {
        this.field_i = -2147483648;
        this.field_c = false;
        this.field_h = -2147483648;
        this.field_e = -2147483648;
        this.field_f = null;
        this.field_a = -2;
        this.field_g = -2;
        this.field_d = null;
    }

    static {
        field_b = "Player names can be up to 12 letters, numbers and underscores";
    }
}
