/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static String field_j;
    private int field_i;
    t field_f;
    static int field_b;
    private int field_k;
    t[] field_g;
    private int field_h;
    private int field_c;
    private boolean field_e;
    static int field_a;
    private int field_d;

    final v a(int param0, boolean param1) {
        this.field_e = param1 ? true : false;
        if (param0 >= -69) {
          this.field_c = -25;
          return this;
        }
        return this;
    }

    final void a(int param0, byte param1, gm param2, v param3, int param4, se param5) {
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
          if (this.field_e) {
            param3.a(param0, param5, param2, param4, (byte) 114);
            param3.b((byte) -117);
          }
          if (null != this.field_g) {
            param3.field_g = this.field_g;
          }
          if (this.field_k >= -1) {
            param3.field_k = this.field_k;
          }
          if (param1 != 115) {
            return;
          }
          if (this.field_d != -2147483648) {
            param3.field_d = this.field_d;
          }
          if (this.field_i != -2147483648) {
            param3.field_i = this.field_i;
          }
          if (-1 <= this.field_c) {
            param3.field_c = this.field_c;
          }
          if (this.field_h != -2147483648) {
            param3.field_h = this.field_h;
          }
          if (null == this.field_f) {
            return;
          }
          param3.field_f = this.field_f;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("v.B(").append(param0).append(',').append(param1).append(',');
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
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final void a(byte param0, v param1) {
        try {
          param1.field_i = this.field_i;
          param1.field_e = this.field_e;
          param1.field_k = this.field_k;
          param1.field_c = this.field_c;
          param1.field_d = this.field_d;
          param1.field_g = this.field_g;
          param1.field_f = this.field_f;
          if (param0 > -84) {
            this.field_d = -106;
          }
          param1.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "v.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final v b(byte param0, int param1) {
        if (param0 <= 104) {
          return (v) null;
        }
        this.field_i = param1;
        return this;
    }

    final v a(int param0, byte param1) {
        if (param1 != -113) {
          this.a(-26, true);
          this.field_h = param0;
          return this;
        }
        this.field_h = param0;
        return this;
    }

    public static void a(byte param0) {
        int var1 = -114 / ((38 - param0) / 50);
        field_j = null;
    }

    final v a(int param0, int param1) {
        if (param1 == -26249) {
          this.field_c = param0;
          return this;
        }
        gm var4 = (gm) null;
        this.a(-73, (se) null, (gm) null, -90, (byte) 73);
        this.field_c = param0;
        return this;
    }

    final void a(int param0, se param1, gm param2, int param3, byte param4) {
        uc stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_23_3 = 0;
        int stackIn_25_2;
        int stackIn_25_3;
        int stackIn_25_4;
        int stackIn_26_5 = 0;
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
          rh.a(param3 + param2.field_w, param2.field_o, (byte) 71, param2.field_k + param0, param2.field_p, this.field_g);
          if (param4 < 108) {
            this.field_f = (t) null;
          }
          if (null != this.field_f) {
            var6_int = param3 + (param2.field_w + this.field_h);
            var7 = this.field_i + param2.field_k + param0;
            if (param1.field_f == 1) {
              var6_int = var6_int + (param2.field_p - this.field_f.field_w) / 2;
            }
            if (param1.field_g == 1) {
              var7 = var7 + (param2.field_o - this.field_f.field_u) / 2;
            }
            if (param1.field_f == 2) {
              var6_int = var6_int + (-this.field_f.field_w + param2.field_p);
            }
            if (param1.field_g == 2) {
              var7 = var7 + (param2.field_o - this.field_f.field_u);
            }
            this.field_f.d(var6_int, var7);
          }
          var6 = param1.c((byte) 65, param2);
          if (var6 != null &&
            null != param1.field_m) {
            if (0 > this.field_k) {
              return;
            }
            stackIn_22_0 = param1.field_m;
            stackIn_22_1 = var6;
            stackIn_22_2 = param2.field_w + param3 + param1.field_k;
            if (this.field_h != -2147483648) {
              stackIn_23_3 = this.field_h;
            } else {
              stackIn_23_3 = 0;
            }
            stackIn_25_2 = stackIn_22_2 + stackIn_23_3;
            stackIn_25_3 = param1.field_p + param0;
            stackIn_25_4 = param2.field_k;
            if (this.field_i == -2147483648) {
              stackIn_26_5 = 0;
            } else {
              stackIn_26_5 = this.field_i;
            }
            stackIn_28_3 = stackIn_25_3 + (stackIn_25_4 + stackIn_26_5);
            stackIn_28_4 = -param1.field_e - param1.field_k + param2.field_p;
            stackIn_28_5 = -param1.field_p + param2.field_o - param1.field_o;
            stackIn_28_6 = this.field_k;
            stackIn_28_7 = this.field_c;
            if (this.field_d == -2147483648) {
              stackIn_29_8 = 256;
            } else {
              stackIn_29_8 = this.field_d;
            }
            ((uc) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_25_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_28_7, stackIn_29_8, param1.field_f, param1.field_g, param1.field_a);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_33_0 = var6_ref;
          stackIn_33_1 = new StringBuilder().append("v.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void b(byte param0) {
        this.field_c = -1;
        this.field_g = null;
        this.field_f = null;
        if (param0 < -22) {
          this.field_h = 0;
          this.field_d = 256;
          this.field_i = 0;
          this.field_k = 0;
          return;
        }
        v.a((byte) 1);
        this.field_h = 0;
        this.field_d = 256;
        this.field_i = 0;
        this.field_k = 0;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        var15 = Torquing.field_u;
        try {
          if (param3 != 77) {
            return;
          }
          var5_int = 0;
          var6 = param4;
          var7 = -param4;
          var8 = -1;
          var9 = ln.a(qg.field_z, kn.field_e, param1 + param4, 119);
          var10 = ln.a(qg.field_z, kn.field_e, -param4 + param1, 94);
          di.a(var10, (byte) 74, param2, qd.field_a[param0], var9);
          while (var6 > var5_int) {
            var8 += 2;
            var7 = var7 + var8;
            if (0 < var7) {
              var6--;
              var7 = var7 - (var6 << 1);
              var11 = -var6 + param0;
              var12 = param0 + var6;
              if (var12 >= j.field_q &&
                var11 <= qk.field_p) {
                var13 = ln.a(qg.field_z, kn.field_e, param1 + var5_int, param3 ^ 29);
                var14 = ln.a(qg.field_z, kn.field_e, param1 - var5_int, 92);
                if (var12 <= qk.field_p) {
                  di.a(var14, (byte) -96, param2, qd.field_a[var12], var13);
                }
                if (j.field_q <= var11) {
                  di.a(var14, (byte) -93, param2, qd.field_a[var11], var13);
                }
              }
            }
            var5_int++;
            var11Lifetime1 = param0 - var5_int;
            var12Lifetime1 = param0 + var5_int;
            if (j.field_q > var12Lifetime1) {
              continue;
            }
            if (qk.field_p < var11Lifetime1) {
              continue;
            }
            var13Lifetime1 = ln.a(qg.field_z, kn.field_e, var6 + param1, param3 ^ 59);
            var14Lifetime1 = ln.a(qg.field_z, kn.field_e, param1 - var6, 100);
            if (qk.field_p >= var12Lifetime1) {
              di.a(var14Lifetime1, (byte) -119, param2, qd.field_a[var12Lifetime1], var13Lifetime1);
            }
            if (var11Lifetime1 < j.field_q) {
              continue;
            }
            di.a(var14Lifetime1, (byte) -120, param2, qd.field_a[var11Lifetime1], var13Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var5), "v.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final v a(byte param0, int param1) {
        if (param0 < 90) {
          this.a(-70, true);
          this.field_k = param1;
          return this;
        }
        this.field_k = param1;
        return this;
    }

    final v a(int param0, t[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2) {
            this.field_f = (t) null;
          }
          this.field_g = param1;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("v.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    v() {
        this.field_f = null;
        this.field_k = -2;
        this.field_h = -2147483648;
        this.field_c = -2;
        this.field_g = null;
        this.field_i = -2147483648;
        this.field_d = -2147483648;
        this.field_e = false;
    }

    static {
        field_b = 0;
        field_j = null;
    }
}
