/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    db field_j;
    private boolean field_e;
    private int field_d;
    static char[] field_l;
    private int field_g;
    static mb field_k;
    private int field_a;
    static String field_c;
    private int field_i;
    private int field_b;
    static String field_h;
    db[] field_f;

    final void a(n param0, int param1) {
        param0.field_f = this.field_f;
        param0.field_j = this.field_j;
        if (param1 != -25682) {
          return;
        }
        try {
          param0.field_e = this.field_e;
          param0.field_g = this.field_g;
          param0.field_i = this.field_i;
          param0.field_d = this.field_d;
          param0.field_b = this.field_b;
          param0.field_a = this.field_a;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "n.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final n a(byte param0, int param1) {
        this.field_b = param1;
        if (param0 != 101) {
          return (n) null;
        }
        return this;
    }

    public static void b(int param0) {
        field_k = null;
        field_h = null;
        field_c = null;
        if (param0 != 23887) {
          return;
        }
        field_l = null;
    }

    final n b(byte param0, int param1) {
        int var3 = -27 / ((param0 + 70) / 50);
        this.field_g = param1;
        return this;
    }

    final n a(boolean param0, int param1) {
        this.field_e = param0 ? true : false;
        if (param1 <= 101) {
          field_h = (String) null;
          return this;
        }
        return this;
    }

    final void a(int param0) {
        this.field_d = 0;
        this.field_g = 0;
        this.field_b = -1;
        this.field_a = 256;
        this.field_f = null;
        if (param0 >= 69) {
          this.field_i = 0;
          this.field_j = null;
          return;
        }
    }

    final n a(int param0, int param1) {
        this.field_i = param0;
        int var3 = 72 / ((param1 - 9) / 52);
        return this;
    }

    final void a(lh param0, w param1, int param2, int param3, int param4) {
        le stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_23_2;
        int stackIn_23_3;
        int stackIn_23_4;
        int stackIn_23_5;
        int stackIn_24_6 = 0;
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
          if (param3 >= -94) {
            field_k = (mb) null;
          }
          gf.a(param1.field_t + param2, param1.field_v, this.field_f, param1.field_j, param1.field_o + param4, (byte) 91);
          if (null != this.field_j) {
            var6_int = this.field_i + (param1.field_t + param2);
            var7 = this.field_g + param1.field_o + param4;
            if (param0.field_p == 1) {
              var6_int = var6_int + (-this.field_j.field_r + param1.field_j) / 2;
            }
            if (2 == param0.field_p) {
              var6_int = var6_int + (-this.field_j.field_r + param1.field_j);
            }
            if (param0.field_m == 1) {
              var7 = var7 + (param1.field_v - this.field_j.field_x) / 2;
            }
            if (param0.field_m == 2) {
              var7 = var7 + (-this.field_j.field_x + param1.field_v);
            }
            this.field_j.d(var6_int, var7);
          }
          var6 = param0.c(349, param1);
          if (var6 != null &&
            null != param0.field_f) {
            if (this.field_d < 0) {
              return;
            }
            stackIn_20_0 = param0.field_f;
            stackIn_20_1 = var6;
            if (this.field_i == -2147483648) {
              stackIn_21_2 = 0;
            } else {
              stackIn_21_2 = this.field_i;
            }
            stackIn_23_2 = stackIn_21_2 + (param0.field_a + param2) + param1.field_t;
            stackIn_23_3 = param0.field_d;
            stackIn_23_4 = param4;
            stackIn_23_5 = param1.field_o;
            if (this.field_g == -2147483648) {
              stackIn_24_6 = 0;
            } else {
              stackIn_24_6 = this.field_g;
            }
            stackIn_26_3 = stackIn_23_3 + (stackIn_23_4 + (stackIn_23_5 + stackIn_24_6));
            stackIn_26_4 = -param0.field_r - param0.field_a + param1.field_j;
            stackIn_26_5 = -param0.field_d + param1.field_v - param0.field_o;
            stackIn_26_6 = this.field_d;
            stackIn_26_7 = this.field_b;
            if (this.field_a != -2147483648) {
              stackIn_27_8 = this.field_a;
            } else {
              stackIn_27_8 = 256;
            }
            ((le) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_23_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_27_8, param0.field_p, param0.field_m, param0.field_n);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_31_0 = var6_ref;
          stackIn_31_1 = new StringBuilder().append("n.L(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final n a(int param0, byte param1) {
        this.field_d = param0;
        if (param1 > -72) {
          field_k = (mb) null;
          return this;
        }
        return this;
    }

    final n a(byte param0, db[] param1) {
        RuntimeException var3 = null;
        n stackIn_2_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -101) {
            stackIn_2_0 = (n) null;
            return stackIn_2_0;
          }
          this.field_f = param1;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("n.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static boolean c(int param0) {
        if (param0 != -2147483648) {
          n.b(29);
          if (null == da.field_a) {
            return false;
          }
          if (da.field_a.a(0)) {
            return true;
          }
          return false;
        }
        if (null == da.field_a) {
          return false;
        }
        if (da.field_a.a(0)) {
          return true;
        }
        return false;
    }

    final static void b(int param0, int param1) {
        int var3 = 0;
        f var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param1 != -1) {
            return;
          }
          var4 = (f) (dj.field_c.a(true));
          while (var4 != null) {
            ch.a(18391, param0, var4);
            var4 = (f) (dj.field_c.f(2));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "n.M(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, n param1, byte param2, int param3, lh param4, w param5) {
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
          if (this.field_e) {
            param1.a(param4, param5, param0, param2 - 191, param3);
            param1.a(101);
          }
          if (-1 <= this.field_d) {
            param1.field_d = this.field_d;
          }
          if (this.field_j != null) {
            param1.field_j = this.field_j;
          }
          if (this.field_g != -2147483648) {
            param1.field_g = this.field_g;
          }
          if (this.field_a != -2147483648) {
            param1.field_a = this.field_a;
          }
          if (-2147483648 != this.field_i) {
            param1.field_i = this.field_i;
          }
          if (-1 <= this.field_b) {
            param1.field_b = this.field_b;
          }
          if (param2 != 76) {
            return;
          }
          if (this.field_f == null) {
            return;
          }
          param1.field_f = this.field_f;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("n.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param5 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    n() {
        this.field_j = null;
        this.field_g = -2147483648;
        this.field_e = false;
        this.field_d = -2;
        this.field_i = -2147483648;
        this.field_a = -2147483648;
        this.field_b = -2;
        this.field_f = null;
    }

    static {
        field_c = "Click";
        field_l = new char[]{(char)91, (char)93, (char)35};
        field_h = "Continue";
    }
}
