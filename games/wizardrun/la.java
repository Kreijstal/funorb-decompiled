/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    private int field_e;
    o[] field_j;
    static long field_g;
    private int field_a;
    private int field_c;
    static boolean field_d;
    private boolean field_b;
    o field_i;
    private int field_h;
    private int field_f;

    final la a(int param0, boolean param1) {
        int var3 = 23 / ((param0 - 58) / 49);
        this.field_b = param1 ? true : false;
        return this;
    }

    final la b(byte param0, int param1) {
        this.field_e = param1;
        if (param0 >= -121) {
          this.a(116, 12);
          return this;
        }
        return this;
    }

    final la a(int param0, byte param1) {
        if (param1 != 105) {
          return (la) null;
        }
        this.field_a = param0;
        return this;
    }

    final la a(int param0, int param1) {
        this.field_f = param1;
        int var3 = -10 / ((param0 - 54) / 43);
        return this;
    }

    final la a(byte param0, int param1) {
        this.field_h = param1;
        if (param0 >= -83) {
          return (la) null;
        }
        return this;
    }

    final la a(int param0, o[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 55) {
            this.a((byte) -5, -10);
          }
          this.field_j = param1;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("la.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(int param0) {
        this.field_j = null;
        this.field_f = 0;
        this.field_i = null;
        this.field_h = 0;
        this.field_e = param0;
        this.field_a = -1;
        this.field_c = 256;
    }

    final void a(la param0, byte param1) {
        try {
          param0.field_c = this.field_c;
          param0.field_f = this.field_f;
          param0.field_a = this.field_a;
          param0.field_h = this.field_h;
          if (param1 >= -2) {
            o[] var4 = (o[]) null;
            this.a(-37, (o[]) null);
          }
          param0.field_i = this.field_i;
          param0.field_b = this.field_b;
          param0.field_j = this.field_j;
          param0.field_e = this.field_e;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "la.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(ub param0, boolean param1, int param2, qa param3, int param4) {
        vd stackIn_20_0 = null;
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
        qa var8 = null;
        try {
          if (param1) {
            var8 = (qa) null;
            this.a(41, 36, -40, (ub) null, (la) null, (qa) null);
          }
          ig.a(this.field_j, param4 + param0.field_o, (byte) -110, param0.field_n, param0.field_r, param2 + param0.field_l);
          if (this.field_i != null) {
            var6_int = this.field_h + (param4 + param0.field_o);
            if (param3.field_l == 1) {
              var6_int = var6_int + (-this.field_i.field_x + param0.field_r) / 2;
            }
            var7 = param2 + (param0.field_l + this.field_e);
            if (param3.field_l == 2) {
              var6_int = var6_int + (-this.field_i.field_x + param0.field_r);
            }
            if (param3.field_a == 1) {
              var7 = var7 + (-this.field_i.field_s + param0.field_n) / 2;
            }
            if (param3.field_a == 2) {
              var7 = var7 + (-this.field_i.field_s + param0.field_n);
            }
            this.field_i.e(var6_int, var7);
          }
          var6 = param3.b(param0, (byte) -57);
          if (var6 != null &&
            param3.field_k != null &&
            this.field_f >= 0) {
            stackIn_20_0 = param3.field_k;
            stackIn_20_1 = var6;
            if (this.field_h != -2147483648) {
              stackIn_21_2 = this.field_h;
            } else {
              stackIn_21_2 = 0;
            }
            stackIn_23_2 = stackIn_21_2 + param3.field_n + (param4 + param0.field_o);
            if (this.field_e != -2147483648) {
              stackIn_24_3 = this.field_e;
            } else {
              stackIn_24_3 = 0;
            }
            stackIn_26_3 = stackIn_24_3 + (param3.field_b + (param0.field_l + param2));
            stackIn_26_4 = -param3.field_n + (param0.field_r - param3.field_h);
            stackIn_26_5 = -param3.field_b + param0.field_n - param3.field_j;
            stackIn_26_6 = this.field_f;
            stackIn_26_7 = this.field_a;
            if (this.field_c != -2147483648) {
              stackIn_27_8 = this.field_c;
            } else {
              stackIn_27_8 = 256;
            }
            ((vd) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_23_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_27_8, param3.field_l, param3.field_a, param3.field_d);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_31_0 = var6_ref;
          stackIn_31_1 = new StringBuilder().append("la.E(");
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
          throw bd.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, ub param3, la param4, qa param5) {
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
            param4.a(param3, false, param0, param5, param2);
            param4.a(0);
          }
          if (param1 < 72) {
            this.field_e = 76;
          }
          if (this.field_i != null) {
            param4.field_i = this.field_i;
          }
          if (this.field_f >= -1) {
            param4.field_f = this.field_f;
          }
          if (null != this.field_j) {
            param4.field_j = this.field_j;
          }
          if (this.field_e != -2147483648) {
            param4.field_e = this.field_e;
          }
          if (this.field_a >= -1) {
            param4.field_a = this.field_a;
          }
          if (this.field_h != -2147483648) {
            param4.field_h = this.field_h;
          }
          if (this.field_c == -2147483648) {
            return;
          }
          param4.field_c = this.field_c;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("la.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param5 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    la() {
        this.field_j = null;
        this.field_c = -2147483648;
        this.field_b = false;
        this.field_e = -2147483648;
        this.field_i = null;
        this.field_a = -2;
        this.field_h = -2147483648;
        this.field_f = -2;
    }

    static {
        field_d = true;
    }
}
