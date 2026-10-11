/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc {
    private int field_a;
    static dj field_e;
    private int field_m;
    private boolean field_k;
    qb[] field_b;
    static kc field_c;
    static kc field_j;
    static String field_l;
    static String field_f;
    private int field_g;
    qb field_d;
    private int field_i;
    private int field_h;

    final void a(vc param0, boolean param1) {
        try {
          if (param1) {
            this.field_m = -107;
          }
          param0.field_b = this.field_b;
          param0.field_d = this.field_d;
          param0.field_i = this.field_i;
          param0.field_a = this.field_a;
          param0.field_m = this.field_m;
          param0.field_k = this.field_k;
          param0.field_g = this.field_g;
          param0.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vc.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final vc a(int param0, byte param1) {
        this.field_a = param0;
        if (param1 <= 114) {
          return (vc) null;
        }
        return this;
    }

    public static void b(int param0) {
        field_f = null;
        field_j = null;
        if (param0 == 202) {
          field_e = null;
          field_c = null;
          field_l = null;
          return;
        }
        vc.b(58);
        field_e = null;
        field_c = null;
        field_l = null;
    }

    final vc a(boolean param0, int param1) {
        if (param1 == -5859) {
          this.field_k = param0 ? true : false;
          return this;
        }
        this.b(21, 109);
        this.field_k = param0 ? true : false;
        return this;
    }

    final vc a(int param0, int param1) {
        this.field_h = param1;
        int var3 = 122 % ((38 - param0) / 46);
        return this;
    }

    final vc a(byte param0, qb[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_b = param1;
          if (param0 != -71) {
            this.a(3, 17);
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vc.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(int param0) {
        this.field_g = 0;
        this.field_i = 256;
        this.field_a = 0;
        if (param0 == -17238) {
          this.field_b = null;
          this.field_m = 0;
          this.field_d = null;
          this.field_h = -1;
          return;
        }
    }

    final void a(int param0, mj param1, byte param2, qm param3, int param4) {
        dj stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_22_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_25_3;
        int stackIn_25_4;
        int stackIn_25_5;
        int stackIn_25_6;
        int stackIn_25_7;
        int stackIn_26_8;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        try {
          gl.a(param3.field_k, param4 + param3.field_n, -27327, param3.field_v, this.field_b, param3.field_j + param0);
          var6_int = -37 / ((38 - param2) / 59);
          if (null != this.field_d) {
            var7_int = param3.field_n + param4 + this.field_g;
            if (param1.field_i == 1) {
              var7_int = var7_int + (-this.field_d.field_n + param3.field_v) / 2;
            }
            var8 = param0 + (param3.field_j + this.field_a);
            if (2 == param1.field_i) {
              var7_int = var7_int + (param3.field_v - this.field_d.field_n);
            }
            if (param1.field_a == 1) {
              var8 = var8 + (-this.field_d.field_w + param3.field_k) / 2;
            }
            if (param1.field_a == 2) {
              var8 = var8 + (-this.field_d.field_w + param3.field_k);
            }
            this.field_d.c(var7_int, var8);
          }
          var7 = param1.a(false, param3);
          if (var7 != null &&
            null != param1.field_g) {
            if (this.field_m < 0) {
              return;
            }
            stackIn_19_0 = param1.field_g;
            stackIn_19_1 = var7;
            stackIn_19_2 = param1.field_m + (param4 + param3.field_n);
            if (this.field_g != -2147483648) {
              stackIn_20_3 = this.field_g;
            } else {
              stackIn_20_3 = 0;
            }
            stackIn_22_2 = stackIn_19_2 + stackIn_20_3;
            if (-2147483648 != this.field_a) {
              stackIn_23_3 = this.field_a;
            } else {
              stackIn_23_3 = 0;
            }
            stackIn_25_3 = stackIn_23_3 + param1.field_f + (param0 + param3.field_j);
            stackIn_25_4 = -param1.field_l + (-param1.field_m + param3.field_v);
            stackIn_25_5 = -param1.field_f + param3.field_k - param1.field_d;
            stackIn_25_6 = this.field_m;
            stackIn_25_7 = this.field_h;
            if (this.field_i != -2147483648) {
              stackIn_26_8 = this.field_i;
            } else {
              stackIn_26_8 = 256;
            }
            ((dj) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_22_2, stackIn_25_3, stackIn_25_4, stackIn_25_5, stackIn_25_6, stackIn_25_7, stackIn_26_8, param1.field_i, param1.field_a, param1.field_h);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_30_0 = var6;
          stackIn_30_1 = new StringBuilder().append("vc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param4).append(')').toString());
        }
    }

    final vc c(int param0, int param1) {
        if (param0 != -1) {
          this.a(35, -108);
          this.field_g = param1;
          return this;
        }
        this.field_g = param1;
        return this;
    }

    final vc b(int param0, int param1) {
        if (param0 != 0) {
          this.a(-22, -123);
          this.field_m = param1;
          return this;
        }
        this.field_m = param1;
        return this;
    }

    final static void a(byte param0) {
        int var1 = (fh.field_g - 640) / 2;
        int var3 = -12 % ((-49 - param0) / 62);
        int var2 = ea.field_F * ea.field_F;
        int var4 = -(ce.field_h * ce.field_h) + var2;
        k.field_d.a(199, -(199 * var4 / var2) + var1, 90, -94 + (-120 + de.field_j), (byte) -120);
        fn.field_e.a(438, 202 + (var1 + 438 * var4 / var2), 0, -120 + de.field_j - 4, (byte) -120);
    }

    final void a(qm param0, int param1, vc param2, mj param3, int param4, int param5) {
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
          if (this.field_k) {
            param2.a(param1, param3, (byte) -62, param0, param5);
            param2.a(-17238);
          }
          if (this.field_m >= -1) {
            param2.field_m = this.field_m;
          }
          if (this.field_g != -2147483648) {
            param2.field_g = this.field_g;
          }
          if (this.field_h >= -1) {
            param2.field_h = this.field_h;
          }
          if (this.field_i != -2147483648) {
            param2.field_i = this.field_i;
          }
          if (null != this.field_d) {
            param2.field_d = this.field_d;
          }
          if (param4 != this.field_a) {
            param2.field_a = this.field_a;
          }
          if (null == this.field_b) {
            return;
          }
          param2.field_b = this.field_b;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("vc.F(");
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
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    vc() {
        this.field_m = -2;
        this.field_k = false;
        this.field_g = -2147483648;
        this.field_a = -2147483648;
        this.field_i = -2147483648;
        this.field_h = -2;
        this.field_d = null;
        this.field_b = null;
    }

    static {
        field_f = "Welcome, young apprentice, to the Grassy Hills training area. Here you will learn the basics of arcane combat for use in the tournament.";
        field_l = "FROM ONLY";
    }
}
