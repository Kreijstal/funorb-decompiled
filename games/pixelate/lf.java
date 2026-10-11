/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static int field_b;
    tf[] field_k;
    private int field_g;
    private int field_h;
    static String[] field_i;
    tf field_j;
    private int field_e;
    private int field_d;
    private boolean field_c;
    private int field_a;
    static fm field_f;

    final void a(lf param0, int param1, w param2, byte param3, int param4, ng param5) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        try {
          if (this.field_c) {
            param0.a(param4, param1, param5, (byte) 116, param2);
            param0.a(true);
          }
          if (this.field_d != -2147483648) {
            param0.field_d = this.field_d;
          }
          if (this.field_a != -2147483648) {
            param0.field_a = this.field_a;
          }
          if (this.field_h != -2147483648) {
            param0.field_h = this.field_h;
          }
          if (null != this.field_k) {
            param0.field_k = this.field_k;
          }
          var7_int = -122 % ((-27 - param3) / 39);
          if (this.field_g >= -1) {
            param0.field_g = this.field_g;
          }
          if (this.field_e >= -1) {
            param0.field_e = this.field_e;
          }
          if (this.field_j != null) {
            param0.field_j = this.field_j;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("lf.A(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        aj var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          var1 = (aj) (ma.field_o.c(1504642273));
          if (var1 == null) {
            return false;
          }
          var2 = 0;
          if (param0 != -91) {
            field_i = (String[]) null;
          }
          while (var2 < var1.field_s) {
            if (null != var1.field_l[var2] &&
              var1.field_l[var2].field_b == 0) {
              return false;
            }
            if (var1.field_v[var2] != null &&
              var1.field_v[var2].field_b == 0) {
              return false;
            }
            var2++;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "lf.I(" + param0 + ')');
        }
    }

    final lf a(tf[] param0, byte param1) {
        RuntimeException var3 = null;
        lf stackIn_2_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_k = param0;
          if (param1 == -65) {
            return this;
          }
          stackIn_2_0 = (lf) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("lf.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, ng param2, byte param3, w param4) {
        jl stackIn_18_0;
        String stackIn_18_1;
        int stackIn_18_2;
        int stackIn_18_3;
        int stackIn_19_4 = 0;
        int stackIn_21_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_24_6;
        int stackIn_24_7;
        int stackIn_25_8;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          dk.a(param2.field_E, param1 + param2.field_z, (byte) 75, param2.field_C, param0 + param2.field_p, this.field_k);
          if (null != this.field_j) {
            var6_int = this.field_d + (param2.field_z + param1);
            var7 = param2.field_p + param0 + this.field_h;
            if (param4.field_l == 1) {
              var6_int = var6_int + (-this.field_j.field_A + param2.field_E) / 2;
            }
            if (1 == param4.field_d) {
              var7 = var7 + (-this.field_j.field_B + param2.field_C) / 2;
            }
            if (param4.field_l == 2) {
              var6_int = var6_int + (param2.field_E - this.field_j.field_A);
            }
            if (2 == param4.field_d) {
              var7 = var7 + (-this.field_j.field_B + param2.field_C);
            }
            this.field_j.b(var6_int, var7);
          }
          var6 = param4.b(param2, -472248767);
          if (param3 < 115) {
            return;
          }
          if (var6 != null &&
            param4.field_a != null &&
            this.field_g >= 0) {
            stackIn_18_0 = param4.field_a;
            stackIn_18_1 = var6;
            stackIn_18_2 = param4.field_h;
            stackIn_18_3 = param1 + param2.field_z;
            if (this.field_d == -2147483648) {
              stackIn_19_4 = 0;
            } else {
              stackIn_19_4 = this.field_d;
            }
            stackIn_21_2 = stackIn_18_2 + (stackIn_18_3 + stackIn_19_4);
            if (this.field_h == -2147483648) {
              stackIn_22_3 = 0;
            } else {
              stackIn_22_3 = this.field_h;
            }
            stackIn_24_3 = stackIn_22_3 + (param4.field_k + param0 + param2.field_p);
            stackIn_24_4 = -param4.field_h + (param2.field_E - param4.field_c);
            stackIn_24_5 = -param4.field_f + (param2.field_C - param4.field_k);
            stackIn_24_6 = this.field_g;
            stackIn_24_7 = this.field_e;
            if (-2147483648 != this.field_a) {
              stackIn_25_8 = this.field_a;
            } else {
              stackIn_25_8 = 256;
            }
            ((jl) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_21_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_24_7, stackIn_25_8, param4.field_l, param4.field_d, param4.field_j);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_29_0 = var6_ref;
          stackIn_29_1 = new StringBuilder().append("lf.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final lf a(int param0, byte param1) {
        if (param1 != -68) {
          this.field_a = 97;
        }
        this.field_e = param0;
        return this;
    }

    final lf a(byte param0, int param1) {
        int var3 = -32 % ((56 - param0) / 46);
        this.field_d = param1;
        return this;
    }

    final void a(boolean param0) {
        if (!param0) {
          return;
        }
        this.field_g = 0;
        this.field_d = 0;
        this.field_e = -1;
        this.field_k = null;
        this.field_j = null;
        this.field_a = 256;
        this.field_h = 0;
    }

    final void a(lf param0, byte param1) {
        try {
          param0.field_h = this.field_h;
          param0.field_e = this.field_e;
          param0.field_d = this.field_d;
          param0.field_j = this.field_j;
          param0.field_a = this.field_a;
          int var3_int = 72 / ((param1 + 43) / 41);
          param0.field_g = this.field_g;
          param0.field_c = this.field_c;
          param0.field_k = this.field_k;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "lf.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final lf a(boolean param0, boolean param1) {
        if (!param0) {
          return (lf) null;
        }
        this.field_c = param1 ? true : false;
        return this;
    }

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_f = null;
        field_i = null;
    }

    final lf a(int param0, boolean param1) {
        this.field_h = param0;
        if (param1) {
          this.field_g = 122;
        }
        return this;
    }

    final lf a(int param0, int param1) {
        this.field_g = param0;
        if (param1 != 15115) {
          this.field_d = 118;
        }
        return this;
    }

    lf() {
        this.field_j = null;
        this.field_k = null;
        this.field_e = -2;
        this.field_g = -2;
        this.field_h = -2147483648;
        this.field_c = false;
        this.field_d = -2147483648;
        this.field_a = -2147483648;
    }

    static {
        field_i = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
