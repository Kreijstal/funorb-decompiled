/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends ee {
    static od field_T;
    private int field_V;
    private double field_S;
    static String field_U;
    private da field_W;
    private int field_R;
    private da field_Q;

    final boolean a(boolean param0, pm param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_U = (String) null;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("u.CB(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final boolean f(int param0) {
        if (param0 >= -54) {
            return true;
        }
        return false;
    }

    final double a(int param0, boolean param1, double param2) {
        if (param0 == 14170) {
          this.field_S = this.field_S - param2;
          if (0.0 >= this.field_S) {
            this.d(10797);
            return -this.field_S;
          } else {
            return 0.0;
          }
        } else {
          this.a(96, -108);
          this.field_S = this.field_S - param2;
          if (0.0 >= this.field_S) {
            this.d(10797);
            return -this.field_S;
          } else {
            return 0.0;
          }
        }
    }

    final void g(int param0) {
        double var2 = 0.0;
        double var4 = 0.0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        u var9 = null;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        int var16 = 0;
        ka var18 = null;
        ka var19 = null;
        var16 = Confined.field_J ? 1 : 0;
        if ((this.field_V ^ -1) > -3) {
          L0: {
            var2 = 0.25 * this.field_M;
            var4 = var2 * 16.0 / 1.0;
            var6 = (int)(-this.field_S / var4);
            if (0 > var6) {
              var6 = 0;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var6 > 4) {
              var6 = 4;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            this.field_S = this.field_S + var4 * (double)var6;
            if (this.field_V == 0) {
              var7 = ha.field_f[1] - -(4 * ha.field_f[2]);
              break L2;
            } else {
              var7 = ha.field_f[2];
              break L2;
            }
          }
          this.field_A.a((byte) 50, var7 * var6);
          var8 = 0;
          L3: while (true) {
            if (-var6 + 4 > var8) {
              var9 = new u(this.field_A, this.field_E, this.field_t, this.field_D, 0.6299605249474366 * this.field_C, var2, this.field_V + 1);
              var10 = 1.998 * Math.random() - 0.999;
              var12 = Math.sqrt(1.0 - var10 * var10) * 0.04;
              var14 = 6.283185307179586 * Math.random();
              var9.field_K = Math.sin(var14) * var12;
              var9.field_G = Math.cos(var14) * var12;
              var9.field_L = var10 * 0.04;
              ri.a((rk) (this), param0 + -26402, var9);
              if (this.field_S < 0.0) {
                hn.field_I = false;
                this.field_S = -var9.a(14170, true, -this.field_S);
                hn.field_I = true;
                var8++;
                continue L3;
              } else {
                var8++;
                continue L3;
              }
            } else {
              L4: {
                if (!hn.field_I) {
                  break L4;
                } else {
                  var19 = this.a((byte) 120, jn.field_U, 1.0);
                  var19.field_M.field_m = 96 >> this.field_V;
                  break L4;
                }
              }
              if (param0 != 26402) {
                this.a(84, -0.09469503278387087);
                this.field_A.a((byte) 50, ha.field_f[this.field_V]);
                return;
              } else {
                this.field_A.a((byte) 50, ha.field_f[this.field_V]);
                return;
              }
            }
          }
        } else {
          L5: {
            if (!hn.field_I) {
              break L5;
            } else {
              var18 = this.a((byte) 120, jn.field_U, 1.0);
              var18.field_M.field_m = 96 >> this.field_V;
              break L5;
            }
          }
          if (param0 != 26402) {
            this.a(84, -0.09469503278387087);
            this.field_A.a((byte) 50, ha.field_f[this.field_V]);
            return;
          } else {
            this.field_A.a((byte) 50, ha.field_f[this.field_V]);
            return;
          }
        }
    }

    private u(hn param0, double param1, double param2, double param3, double param4, double param5, int param6) {
        super(param0, param1, param2, param3, param4, param5);
        double var13_double = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        this.field_W = new da();
        this.field_Q = new da();
        try {
            this.field_V = param6;
            this.field_R = (int)(Math.random() * 3.99);
            this.field_S = 16.0 * param5 / 1.0;
            var13_double = -0.999 + Math.random() * 1.998;
            var15 = Math.sqrt(1.0 - var13_double * var13_double);
            var17 = 2.0 * (Math.random() * 3.141592653589793);
            this.field_Q.a(0.1 * Math.random(), var13_double, var15 * Math.sin(var17), Math.cos(var17) * var15, 7);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "u.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        if (this.field_N) {
            return;
        }
        try {
            if (param2 > -5) {
                this.field_Q = (da) null;
            }
            this.a(bf.field_R[this.field_V][this.field_R], this.field_W, param4, (byte) 64, param1, param0, param3, 128);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "u.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(pm param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 72) {
                break L1;
              } else {
                u.h((byte) 61);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("u.WA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final boolean c(int param0) {
        if (param0 != 5) {
            return true;
        }
        return true;
    }

    final void a(int param0, double param1) {
        int var4 = 92 % ((-16 - param0) / 34);
    }

    final void a(int param0, int param1) {
        this.field_W.a(param0 ^ -11789, this.field_Q);
        super.a(param0, param1);
        if (!(0.0 <= this.field_D)) {
            this.field_s = 2;
            this.field_z = true;
        }
    }

    public static void h(byte param0) {
        field_T = null;
        field_U = null;
        if (param0 != -118) {
            field_T = (od) null;
        }
    }

    u(hn param0, double param1, double param2, double param3) {
        this(param0, param1, param2, param3, 0.4, 1.0, 0);
        double var8_double = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        try {
            var8_double = 1.998 * Math.random() - 0.999;
            var10 = Math.sqrt(-(var8_double * var8_double) + 1.0);
            var12 = Math.random() * 6.283185307179586;
            var14 = Math.sin(var12) * var10;
            var16 = var10 * Math.cos(var12);
            var10 = Math.pow(Math.random(), 0.3333333333333333) * 0.01;
            this.field_G = var10 * var16;
            this.field_L = var10 * var8_double;
            this.field_K = var10 * var14;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "u.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_U = "<col=FFFFFF>Ctrl</col> also still works.";
    }
}
