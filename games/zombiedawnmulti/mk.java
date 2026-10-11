/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    private boolean field_i;
    private int field_h;
    static ao field_g;
    private int field_m;
    private int field_f;
    static String[] field_c;
    private int field_a;
    ja field_k;
    private int field_j;
    ja[] field_e;
    static String field_n;
    static int field_d;
    static ul field_b;
    static String field_l;

    final mk a(int param0, int param1) {
        this.field_f = param0;
        if (param1 != 2147483647) {
          this.field_a = 30;
          return this;
        }
        return this;
    }

    final mk a(boolean param0, int param1) {
        this.field_i = param0 ? true : false;
        if (param1 != 2521) {
          return (mk) null;
        }
        return this;
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_l = null;
        field_g = null;
        field_n = null;
        int var1 = 9 % ((param0 + 74) / 48);
    }

    final mk a(ja[] param0, int param1) {
        RuntimeException var3 = null;
        mk stackIn_2_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_e = param0;
          if (param1 == 2147483647) {
            return this;
          }
          stackIn_2_0 = (mk) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mk.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String[] a(char param0, boolean param1, String param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var10 = (CharSequence) ((Object) param2);
          var3_int = ro.a(-125, param0, var10);
          var4 = new String[var3_int + 1];
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var3_int > var7; var7++) {
            for (var8 = var6; param2.charAt(var8) != param0; var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param2.substring(var6, var8);
            var6 = var8 + 1;
          }
          if (param1) {
            field_b = (ul) null;
          }
          var4[var3_int] = param2.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("mk.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        if (param0 == 11) {
          this.field_f = 0;
          this.field_j = 0;
          this.field_m = 0;
          this.field_e = null;
          this.field_a = 256;
          this.field_k = null;
          this.field_h = -1;
          return;
        }
        cf var3 = (cf) null;
        this.a(14, true, (jl) null, (cf) null, -114);
        this.field_f = 0;
        this.field_j = 0;
        this.field_m = 0;
        this.field_e = null;
        this.field_a = 256;
        this.field_k = null;
        this.field_h = -1;
    }

    final mk a(byte param0, int param1) {
        this.field_h = param1;
        int var3 = 73 / ((param0 + 40) / 34);
        return this;
    }

    final void a(int param0, boolean param1, jl param2, cf param3, int param4) {
        fm stackIn_22_0;
        String stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        int stackIn_23_4 = 0;
        int stackIn_25_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_28_3;
        int stackIn_28_4;
        int stackIn_28_5;
        int stackIn_28_6;
        int stackIn_28_7;
        int stackIn_29_8;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          s.a(param3.field_i + param4, 0, this.field_e, param3.field_y + param0, param3.field_w, param3.field_n);
          if (param1) {
            this.field_m = -63;
          }
          if (this.field_k != null) {
            var6_int = param3.field_y + (param0 + this.field_f);
            if (param2.field_d == 1) {
              var6_int = var6_int + (-this.field_k.field_z + param3.field_n) / 2;
            }
            var7 = this.field_j + (param3.field_i + param4);
            if (param2.field_a == 1) {
              var7 = var7 + (param3.field_w - this.field_k.field_u) / 2;
            }
            if (param2.field_d == 2) {
              var6_int = var6_int + (param3.field_n - this.field_k.field_z);
            }
            if (param2.field_a == 2) {
              var7 = var7 + (-this.field_k.field_u + param3.field_w);
            }
            this.field_k.g(var6_int, var7);
          }
          var6 = param2.d(param3, -9327);
          if (var6 != null &&
            param2.field_j != null) {
            if (this.field_m < 0) {
              return;
            }
            stackIn_22_0 = param2.field_j;
            stackIn_22_1 = var6;
            stackIn_22_2 = param0 + param3.field_y;
            stackIn_22_3 = param2.field_r;
            if (this.field_f == -2147483648) {
              stackIn_23_4 = 0;
            } else {
              stackIn_23_4 = this.field_f;
            }
            stackIn_25_2 = stackIn_22_2 + (stackIn_22_3 + stackIn_23_4);
            if (this.field_j != -2147483648) {
              stackIn_26_3 = this.field_j;
            } else {
              stackIn_26_3 = 0;
            }
            stackIn_28_3 = stackIn_26_3 + (param2.field_g + (param3.field_i + param4));
            stackIn_28_4 = -param2.field_r + param3.field_n - param2.field_n;
            stackIn_28_5 = param3.field_w - param2.field_g - param2.field_p;
            stackIn_28_6 = this.field_m;
            stackIn_28_7 = this.field_h;
            if (this.field_a != -2147483648) {
              stackIn_29_8 = this.field_a;
            } else {
              stackIn_29_8 = 256;
            }
            ((fm) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_25_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_29_8, param2.field_d, param2.field_a, param2.field_f);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_33_0 = var6_ref;
          stackIn_33_1 = new StringBuilder().append("mk.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, jl param3, cf param4, mk param5) {
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
          if (this.field_i) {
            param5.a(param1, false, param3, param4, param2);
            param5.a((byte) 11);
          }
          if (this.field_h >= -1) {
            param5.field_h = this.field_h;
          }
          if (this.field_k != null) {
            param5.field_k = this.field_k;
          }
          if (this.field_j != -2147483648) {
            param5.field_j = this.field_j;
          }
          if (this.field_a != -2147483648) {
            param5.field_a = this.field_a;
          }
          if (-2147483648 != this.field_f) {
            param5.field_f = this.field_f;
          }
          if (param0 != -11108) {
            this.b(-59, -41);
          }
          if (null != this.field_e) {
            param5.field_e = this.field_e;
          }
          if (-1 > this.field_m) {
            return;
          }
          param5.field_m = this.field_m;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("mk.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw fa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final void a(int param0, mk param1) {
        param1.field_m = this.field_m;
        param1.field_h = this.field_h;
        param1.field_i = this.field_i;
        if (param0 <= 72) {
          return;
        }
        try {
          param1.field_a = this.field_a;
          param1.field_j = this.field_j;
          param1.field_f = this.field_f;
          param1.field_k = this.field_k;
          param1.field_e = this.field_e;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "mk.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final mk b(int param0, int param1) {
        if (param1 != 0) {
          this.b(92, -13);
          this.field_m = param0;
          return this;
        }
        this.field_m = param0;
        return this;
    }

    final mk a(int param0, byte param1) {
        this.field_j = param0;
        if (param1 != 47) {
          return (mk) null;
        }
        return this;
    }

    mk() {
        this.field_h = -2;
        this.field_a = -2147483648;
        this.field_i = false;
        this.field_m = -2;
        this.field_k = null;
        this.field_j = -2147483648;
        this.field_f = -2147483648;
        this.field_e = null;
    }

    static {
        field_c = new String[]{"Showing by rating", "Showing by win percentage"};
        field_g = new ao(6, 0, 4, 2);
        field_n = "Tips";
        field_d = 64;
        field_l = "Rated game";
    }
}
