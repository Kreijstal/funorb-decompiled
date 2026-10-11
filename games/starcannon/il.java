/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il {
    private int field_l;
    static id[] field_e;
    private boolean field_m;
    static int field_i;
    private int field_j;
    private int field_b;
    static String field_f;
    private int field_h;
    static int field_g;
    private int field_a;
    hl field_d;
    hl[] field_c;
    static tj field_k;

    final void a(il param0, int param1) {
        try {
          param0.field_a = this.field_a;
          param0.field_b = this.field_b;
          param0.field_h = this.field_h;
          param0.field_d = this.field_d;
          param0.field_c = this.field_c;
          param0.field_j = this.field_j;
          param0.field_m = this.field_m;
          if (param1 != -2147483648) {
            this.field_b = 55;
          }
          param0.field_l = this.field_l;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "il.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final il a(int param0, int param1) {
        if (param0 != 256) {
          this.field_d = (hl) null;
          this.field_j = param1;
          return this;
        }
        this.field_j = param1;
        return this;
    }

    final void a(il param0, int param1, int param2, uj param3, int param4, w param5) {
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
          if (param4 != -1) {
            il.b(111);
          }
          if (this.field_m) {
            param0.a(param1, 21, param2, param5, param3);
            param0.a(30644);
          }
          if (this.field_a >= -1) {
            param0.field_a = this.field_a;
          }
          if (this.field_b != -2147483648) {
            param0.field_b = this.field_b;
          }
          if (this.field_h != -2147483648) {
            param0.field_h = this.field_h;
          }
          if (null != this.field_d) {
            param0.field_d = this.field_d;
          }
          if (null != this.field_c) {
            param0.field_c = this.field_c;
          }
          if (-2147483648 != this.field_j) {
            param0.field_j = this.field_j;
          }
          if (this.field_l < -1) {
            return;
          }
          param0.field_l = this.field_l;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("il.D(");
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
          throw sd.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final il a(byte param0, int param1) {
        this.field_l = param1;
        if (param0 > -77) {
          hl[] var4 = (hl[]) null;
          this.a((hl[]) null, (byte) -15);
          return this;
        }
        return this;
    }

    final il c(int param0, int param1) {
        if (param1 != 2) {
          return (il) null;
        }
        this.field_a = param0;
        return this;
    }

    final il a(int param0, boolean param1) {
        if (param0 <= -29) {
          this.field_m = param1 ? true : false;
          return this;
        }
        this.a(52, true);
        this.field_m = param1 ? true : false;
        return this;
    }

    final void a(int param0, int param1, int param2, w param3, uj param4) {
        qe stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_19_2 = 0;
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
          ba.a(param4.field_f, this.field_c, (byte) 86, param4.field_s + param0, param4.field_i, param4.field_j + param2);
          if (null != this.field_d) {
            var6_int = param0 + param4.field_s + this.field_h;
            if (param3.field_h == 1) {
              var6_int = var6_int + (-this.field_d.field_x + param4.field_i) / 2;
            }
            var7 = param2 + param4.field_j + this.field_j;
            if (param3.field_a == 1) {
              var7 = var7 + (-this.field_d.field_q + param4.field_f) / 2;
            }
            if (param3.field_h == 2) {
              var6_int = var6_int + (param4.field_i - this.field_d.field_x);
            }
            if (param3.field_a == 2) {
              var7 = var7 + (-this.field_d.field_q + param4.field_f);
            }
            this.field_d.e(var6_int, var7);
          }
          var6 = param3.a(param4, false);
          if (param1 < 13) {
            return;
          }
          if (var6 != null &&
            param3.field_f != null &&
            this.field_a >= 0) {
            stackIn_18_0 = param3.field_f;
            stackIn_18_1 = var6;
            if (this.field_h == -2147483648) {
              stackIn_19_2 = 0;
            } else {
              stackIn_19_2 = this.field_h;
            }
            stackIn_21_2 = stackIn_19_2 + (param3.field_d + (param0 + param4.field_s));
            if (this.field_j == -2147483648) {
              stackIn_22_3 = 0;
            } else {
              stackIn_22_3 = this.field_j;
            }
            stackIn_24_3 = stackIn_22_3 + param3.field_e + (param2 + param4.field_j);
            stackIn_24_4 = -param3.field_o - param3.field_d + param4.field_i;
            stackIn_24_5 = -param3.field_e + param4.field_f - param3.field_b;
            stackIn_24_6 = this.field_a;
            stackIn_24_7 = this.field_l;
            if (this.field_b == -2147483648) {
              stackIn_25_8 = 256;
            } else {
              stackIn_25_8 = this.field_b;
            }
            ((qe) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_21_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, stackIn_24_6, stackIn_24_7, stackIn_25_8, param3.field_h, param3.field_a, param3.field_k);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_29_0 = var6_ref;
          stackIn_29_1 = new StringBuilder().append("il.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param4 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final il a(hl[] param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -74) {
            field_k = (tj) null;
          }
          this.field_c = param0;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("il.K(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final il b(int param0, int param1) {
        this.field_h = param0;
        int var3 = -45 / ((param1 - 10) / 53);
        return this;
    }

    public static void b(int param0) {
        if (param0 == 2147483647) {
          field_k = null;
          field_f = null;
          field_e = null;
          return;
        }
        field_k = (tj) null;
        field_k = null;
        field_f = null;
        field_e = null;
    }

    final void a(int param0) {
        this.field_l = -1;
        this.field_h = 0;
        this.field_a = 0;
        if (param0 == 30644) {
          this.field_j = 0;
          this.field_d = null;
          this.field_c = null;
          this.field_b = 256;
          return;
        }
        this.a(8, true);
        this.field_j = 0;
        this.field_d = null;
        this.field_c = null;
        this.field_b = 256;
    }

    il() {
        this.field_b = -2147483648;
        this.field_h = -2147483648;
        this.field_j = -2147483648;
        this.field_m = false;
        this.field_c = null;
        this.field_d = null;
        this.field_a = -2;
        this.field_l = -2;
    }

    static {
        field_f = "Please check if address is correct";
    }
}
