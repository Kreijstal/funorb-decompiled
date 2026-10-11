/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static qj field_c;
    private int field_g;
    ti field_d;
    ti[] field_i;
    private int field_h;
    private int field_f;
    private int field_b;
    private boolean field_k;
    private int field_e;
    static int field_j;
    static String field_a;

    final ab b(int param0, byte param1) {
        int var3 = 104 / ((param1 + 55) / 45);
        this.field_e = param0;
        return this;
    }

    final void a(int param0, ab param1) {
        param1.field_k = this.field_k;
        param1.field_e = this.field_e;
        param1.field_d = this.field_d;
        param1.field_g = this.field_g;
        param1.field_f = this.field_f;
        param1.field_i = this.field_i;
        param1.field_h = this.field_h;
        if (param0 <= 68) {
          return;
        }
        try {
          param1.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ab.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ab a(ti[] param0, byte param1) {
        RuntimeException var3 = null;
        ab var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_i = param0;
          if (param1 != 32) {
            var4 = (ab) null;
            this.a(86, (ab) null);
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ab.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final ab a(int param0, int param1) {
        this.field_h = param1;
        if (param0 >= -53) {
          return (ab) null;
        }
        return this;
    }

    final ab a(int param0, boolean param1) {
        if (param1) {
          return (ab) null;
        }
        this.field_b = param0;
        return this;
    }

    final void a(byte param0, ki param1, int param2, qg param3, int param4) {
        kg stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_20_2;
        int stackIn_20_3;
        int stackIn_21_4 = 0;
        int stackIn_23_3;
        int stackIn_23_4;
        int stackIn_23_5;
        int stackIn_23_6;
        int stackIn_23_7;
        int stackIn_24_8;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var7Lifetime1;
        try {
          dk.a(param3.field_h, this.field_i, -28018, param3.field_p + param4, param3.field_n + param2, param3.field_l);
          if (null != this.field_d) {
            var6_int = this.field_f + param3.field_p + param4;
            var7 = param2 + param3.field_n + this.field_b;
            if (1 == param1.field_b) {
              var6_int = var6_int + (-this.field_d.field_r + param3.field_l) / 2;
            }
            if (param1.field_a == 1) {
              var7 = var7 + (param3.field_h - this.field_d.field_s) / 2;
            }
            if (param1.field_b == 2) {
              var6_int = var6_int + (param3.field_l - this.field_d.field_r);
            }
            if (param1.field_a == 2) {
              var7 = var7 + (param3.field_h - this.field_d.field_s);
            }
            this.field_d.c(var6_int, var7);
          }
          var6 = param1.c(param3, 82);
          var7Lifetime1 = -84 / ((-29 - param0) / 48);
          if (var6 != null &&
            null != param1.field_i &&
            this.field_h >= 0) {
            stackIn_17_0 = param1.field_i;
            stackIn_17_1 = var6;
            if (this.field_f == -2147483648) {
              stackIn_18_2 = 0;
            } else {
              stackIn_18_2 = this.field_f;
            }
            stackIn_20_2 = stackIn_18_2 + param3.field_p + (param4 + param1.field_h);
            stackIn_20_3 = param1.field_c + param3.field_n + param2;
            if (this.field_b != -2147483648) {
              stackIn_21_4 = this.field_b;
            } else {
              stackIn_21_4 = 0;
            }
            stackIn_23_3 = stackIn_20_3 + stackIn_21_4;
            stackIn_23_4 = param3.field_l + (-param1.field_h - param1.field_k);
            stackIn_23_5 = -param1.field_c + (param3.field_h - param1.field_d);
            stackIn_23_6 = this.field_h;
            stackIn_23_7 = this.field_e;
            if (this.field_g == -2147483648) {
              stackIn_24_8 = 256;
            } else {
              stackIn_24_8 = this.field_g;
            }
            ((kg) (Object) stackIn_17_0).a(stackIn_17_1, stackIn_20_2, stackIn_23_3, stackIn_23_4, stackIn_23_5, stackIn_23_6, stackIn_23_7, stackIn_24_8, param1.field_b, param1.field_a, param1.field_e);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_28_0 = var6_ref;
          stackIn_28_1 = new StringBuilder().append("ab.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0) {
        this.field_h = 0;
        this.field_d = null;
        this.field_b = 0;
        this.field_i = null;
        this.field_g = 256;
        this.field_f = 0;
        if (param0 == 313) {
          this.field_e = -1;
          return;
        }
        ab var3 = (ab) null;
        this.a(85, (ab) null);
        this.field_e = -1;
    }

    final ab a(boolean param0, int param1) {
        this.field_k = param0 ? true : false;
        if (param1 != 256) {
          return (ab) null;
        }
        return this;
    }

    final void a(ki param0, byte param1, int param2, int param3, ab param4, qg param5) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_k) {
            param4.a((byte) 105, param0, param3, param5, param2);
            param4.a(313);
          }
          if (this.field_b != -2147483648) {
            param4.field_b = this.field_b;
          }
          if (this.field_f != -2147483648) {
            param4.field_f = this.field_f;
          }
          if (this.field_g != -2147483648) {
            param4.field_g = this.field_g;
          }
          if (param1 >= -42) {
            this.a(false, 102);
          }
          if (this.field_i != null) {
            param4.field_i = this.field_i;
          }
          if (null != this.field_d) {
            param4.field_d = this.field_d;
          }
          if (this.field_h >= -1) {
            param4.field_h = this.field_h;
          }
          if (this.field_e < -1) {
            return;
          }
          param4.field_e = this.field_e;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("ab.J(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param5 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != -2147483648) {
          field_a = (String) null;
        }
    }

    final ab a(int param0, byte param1) {
        this.field_f = param0;
        int var3 = 22 / ((param1 - 36) / 50);
        return this;
    }

    ab() {
        this.field_d = null;
        this.field_g = -2147483648;
        this.field_h = -2;
        this.field_k = false;
        this.field_b = -2147483648;
        this.field_f = -2147483648;
        this.field_i = null;
        this.field_e = -2;
    }

    static {
        field_c = new qj();
        field_a = "Click";
    }
}
