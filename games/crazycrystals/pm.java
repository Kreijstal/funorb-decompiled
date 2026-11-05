/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm {
    private boolean field_g;
    static wb field_c;
    dl[] field_k;
    private int field_e;
    static am field_b;
    static int field_d;
    private int field_j;
    private int field_i;
    private int field_a;
    dl field_h;
    private int field_f;

    final pm c(int param0, int param1) {
        if (param0 >= -89) {
          this.a(-37);
          this.field_i = param1;
          return this;
        }
        this.field_i = param1;
        return this;
    }

    final static void a(int param0, we param1, byte param2) {
        md var5 = tp.field_f;
        var5.d(8, param0);
        var5.field_f = var5.field_f + 1;
        int var4 = var5.field_f;
        var5.a(true, 1);
        var5.a(true, param1.field_j);
        var5.a(param1.field_g, (byte) 106);
        var5.a(param1.field_m, param2 - 16455);
        var5.a(param1.field_i, -16384);
        if (param2 != 71) {
          return;
        }
        try {
          var5.a(param1.field_f, -16384);
          var5.a(param1.field_k, param2 - 16455);
          var5.b(var4, (byte) -58);
          var5.c((byte) 48, var5.field_f - var4);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pm.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final pm a(int param0, int param1) {
        if (param1 != 0) {
          field_b = (am) null;
          this.field_f = param0;
          return this;
        }
        this.field_f = param0;
        return this;
    }

    final pm a(boolean param0, boolean param1) {
        this.field_g = param1 ? true : false;
        if (param0) {
          return (pm) null;
        }
        return this;
    }

    final void a(int param0) {
        this.field_i = param0;
        this.field_e = 256;
        this.field_a = 0;
        this.field_f = -1;
        this.field_h = null;
        this.field_j = 0;
        this.field_k = null;
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 <= 25) {
          pm.a((byte) -63);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final pm a(int param0, dl[] param1) {
        RuntimeException var3 = null;
        pm stackIn_2_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 6) {
            stackIn_2_0 = (pm) null;
            return stackIn_2_0;
          }
          this.field_k = param1;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pm.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(fk param0, int param1, qm param2, int param3, int param4) {
        vc stackIn_20_0;
        String stackIn_20_1;
        int stackIn_20_2;
        int stackIn_20_3;
        int stackIn_21_4 = 0;
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
        int var7Lifetime1;
        try {
          oc.a(this.field_k, param2.field_f, param2.field_j + param3, param1 + param2.field_r, param2.field_g, -67);
          if (null != this.field_h) {
            var6_int = this.field_i + (param2.field_r + param1);
            if (param0.field_i == 1) {
              var6_int = var6_int + (-this.field_h.field_n + param2.field_g) / 2;
            }
            var7 = this.field_j + (param3 + param2.field_j);
            if (1 == param0.field_a) {
              var7 = var7 + (-this.field_h.field_o + param2.field_f) / 2;
            }
            if (param0.field_i == 2) {
              var6_int = var6_int + (-this.field_h.field_n + param2.field_g);
            }
            if (param0.field_a == 2) {
              var7 = var7 + (param2.field_f - this.field_h.field_o);
            }
            this.field_h.a(var6_int, var7);
          }
          var7Lifetime1 = -86 / ((param4 + 74) / 49);
          var6 = param0.d(param2, -1);
          if (var6 != null &&
            null != param0.field_p) {
            if (this.field_a < 0) {
              return;
            }
            stackIn_20_0 = param0.field_p;
            stackIn_20_1 = var6;
            stackIn_20_2 = param2.field_r;
            stackIn_20_3 = param1 + param0.field_o;
            if (this.field_i == -2147483648) {
              stackIn_21_4 = 0;
            } else {
              stackIn_21_4 = this.field_i;
            }
            stackIn_23_2 = stackIn_20_2 + (stackIn_20_3 + stackIn_21_4);
            if (this.field_j == -2147483648) {
              stackIn_24_3 = 0;
            } else {
              stackIn_24_3 = this.field_j;
            }
            stackIn_26_3 = stackIn_24_3 + (param2.field_j + (param3 + param0.field_n));
            stackIn_26_4 = -param0.field_h + (param2.field_g - param0.field_o);
            stackIn_26_5 = param2.field_f - (param0.field_n + param0.field_m);
            stackIn_26_6 = this.field_a;
            stackIn_26_7 = this.field_f;
            if (-2147483648 != this.field_e) {
              stackIn_27_8 = this.field_e;
            } else {
              stackIn_27_8 = 256;
            }
            ((vc) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_23_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_27_8, param0.field_i, param0.field_a, param0.field_j);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_31_0 = var6_ref;
          stackIn_31_1 = new StringBuilder().append("pm.J(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final pm d(int param0, int param1) {
        this.field_j = param1;
        if (param0 > -44) {
          this.field_h = (dl) null;
          return this;
        }
        return this;
    }

    final void a(pm param0, int param1) {
        try {
          param0.field_a = this.field_a;
          param0.field_f = this.field_f;
          param0.field_j = this.field_j;
          if (param1 >= -46) {
            this.field_i = -26;
          }
          param0.field_e = this.field_e;
          param0.field_h = this.field_h;
          param0.field_k = this.field_k;
          param0.field_i = this.field_i;
          param0.field_g = this.field_g;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "pm.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(fk param0, int param1, int param2, qm param3, int param4, pm param5) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        try {
          var7_int = 16 / ((72 - param2) / 54);
          if (this.field_g) {
            param5.a(param0, param4, param3, param1, 62);
            param5.a(0);
          }
          if (-1 <= this.field_f) {
            param5.field_f = this.field_f;
          }
          if (-2147483648 != this.field_j) {
            param5.field_j = this.field_j;
          }
          if (this.field_a >= -1) {
            param5.field_a = this.field_a;
          }
          if (this.field_e != -2147483648) {
            param5.field_e = this.field_e;
          }
          if (this.field_i != -2147483648) {
            param5.field_i = this.field_i;
          }
          if (this.field_h != null) {
            param5.field_h = this.field_h;
          }
          if (null == this.field_k) {
            return;
          }
          param5.field_k = this.field_k;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("pm.C(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final pm b(int param0, int param1) {
        this.field_a = param0;
        if (param1 > -19) {
          this.field_g = true;
          return this;
        }
        return this;
    }

    pm() {
        this.field_g = false;
        this.field_e = -2147483648;
        this.field_k = null;
        this.field_j = -2147483648;
        this.field_a = -2;
        this.field_i = -2147483648;
        this.field_h = null;
        this.field_f = -2;
    }

    static {
        field_c = new wb();
    }
}
