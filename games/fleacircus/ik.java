/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik extends wi {
    int field_S;
    boolean[] field_t;
    int field_r;
    private dd field_y;
    private int field_I;
    private boolean field_L;
    private dd field_q;
    static double field_G;
    int field_s;
    String[] field_z;
    private int field_B;
    int field_x;
    int field_Q;
    int field_u;
    private int field_v;
    int field_w;
    fa field_D;
    private int field_P;
    private boolean field_A;
    int field_H;
    private String field_M;
    boolean field_J;
    int field_O;
    int field_F;
    static boolean field_R;
    static String field_C;
    private dd field_K;
    private dd field_E;
    private int field_N;

    final static pd a(sf param0, byte param1) {
        RuntimeException var2 = null;
        pd stackIn_2_0 = null;
        pd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -84) {
            stackIn_4_0 = sg.a((byte) 20, ie.a(param0, 100, 96));
            return stackIn_4_0;
          }
          stackIn_2_0 = (pd) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ik.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        vh var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          if (param1 != 110) {
            ik.a(-105, (byte) 117);
          }
          var2 = (vh) (al.field_e.c((byte) 47));
          while (var2 != null) {
            fleas.a(param0, var2, param1 ^ 108);
            var2 = (vh) (al.field_e.b((byte) -105));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2_ref), "ik.B(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1) {
        if (param1 < 94) {
          field_R = false;
        }
        if (param0 < 0) {
          return false;
        }
        if (this.field_t.length > param0) {
          return this.field_t[param0];
        }
        return false;
    }

    final void c(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_10_0 = 0;
        String stackIn_16_0 = null;
        int stackIn_19_0 = 0;
        float stackIn_25_0 = 0.0f;
        int stackIn_26_1 = 0;
        dd stackIn_31_0 = null;
        dd stackIn_34_0 = null;
        int var2;
        int var3;
        int var4;
        float var5;
        String var5_ref_String;
        int var6;
        dd var7;
        dd var8;
        int var9;
        int var4Lifetime1;
        int var6Lifetime1;
        var9 = fleas.field_A ? 1 : 0;
        gb.a(ia.field_q);
        gb.a(this.field_l, this.field_a + this.field_D.field_N, this.field_l - (-this.field_n + this.field_P), this.field_a + this.field_d);
        var2 = this.field_D.field_N + this.field_a;
        var3 = 0;
        while (true) {
          if (this.field_z.length <= var3 &&
            this.field_a + this.field_d < var2) {
            gb.b(ia.field_q);
            var3 = -this.field_P + this.field_l + this.field_n;
            var4 = this.field_D.field_N + this.field_a;
            gb.g(var3, var4, this.field_P, this.field_d - this.field_D.field_N, this.field_s & k.field_a, this.field_s >>> ii.field_b);
            gb.g(var3, var4, this.field_P, this.field_P, k.field_a & this.field_s, this.field_s >>> ii.field_b);
            if (null != this.field_q) {
              this.field_q.d(var3, var4, this.field_P, this.field_d - this.field_D.field_N);
            }
            gb.g(var3, this.field_a - (-this.field_d + this.field_P), this.field_P, this.field_P, k.field_a & this.field_s, this.field_s >>> ii.field_b);
            var5 = (float)this.field_x / (float)(-1 + this.field_z.length);
            stackIn_25_0 = (float)this.field_P;
            if (null != this.field_K) {
              stackIn_26_1 = 2 * this.field_K.field_r;
            } else {
              stackIn_26_1 = this.field_P;
            }
            var6 = (int)(stackIn_25_0 + (float)(-stackIn_26_1 - 2 * this.field_P + (this.field_d - this.field_D.field_N)) * var5);
            if (this.field_E != null &&
              this.field_y != null) {
              if (this.field_A) {
                stackIn_31_0 = this.field_y;
              } else {
                stackIn_31_0 = this.field_E;
              }
              var7 = stackIn_31_0;
              if (!this.field_L) {
                stackIn_34_0 = this.field_E;
              } else {
                stackIn_34_0 = this.field_y;
              }
              var8 = stackIn_34_0;
              var7.d(var3, var4);
              var8.b(var3, -var8.field_r + this.field_d + this.field_a);
            }
            if (null == this.field_K) {
              gb.g(var3, var4 + var6, this.field_P, this.field_P, this.field_r & k.field_a, this.field_r >>> ii.field_b);
              gb.e(var3, var4 + var6, this.field_P, this.field_P, k.field_a & this.field_F, this.field_F >>> ii.field_b);
            } else {
              this.field_K.d(-(this.field_K.field_x / 2) + var3 + this.field_P / 2, var6 + var4 + this.field_K.field_r / 2);
            }
            gb.e(this.field_l, this.field_a, this.field_n, this.field_d, this.field_I & k.field_a, this.field_I >>> ii.field_b);
            gb.e(param0 + this.field_l, this.field_a - 1, this.field_n + 2, 2 + this.field_d, k.field_a & this.field_N, this.field_N >>> ii.field_b);
            return;
          }
          stackIn_5_0 = ~var3;
          stackIn_5_1 = ~this.field_x;
          if (stackIn_5_0 != stackIn_5_1) {
            if ((var3 & 1) != 0) {
              stackIn_10_0 = this.field_u;
            } else {
              stackIn_10_0 = this.field_w;
            }
          } else {
            stackIn_10_0 = this.field_O;
          }
          var4Lifetime1 = stackIn_10_0;
          gb.g(this.field_l, -this.field_S + var2, -this.field_P + this.field_n, this.field_D.field_N, var4Lifetime1 & k.field_a, var4Lifetime1 >>> ii.field_b);
          if (this.field_z.length > var3) {
            if (!this.field_t[var3] &&
              null != this.field_M) {
              stackIn_16_0 = this.field_M;
            } else {
              stackIn_16_0 = this.field_z[var3];
            }
            var5_ref_String = stackIn_16_0;
            if (this.field_t[var3]) {
              stackIn_19_0 = this.field_Q;
            } else {
              stackIn_19_0 = this.field_H;
            }
            var6Lifetime1 = stackIn_19_0;
            this.field_D.a(var5_ref_String, this.field_l + 5, -this.field_D.field_K + (this.field_D.field_N + var2) - this.field_S, k.field_a & var6Lifetime1, -1, var6Lifetime1 >>> ii.field_b);
          }
          var3++;
          var2 = var2 + this.field_D.field_N;
        }
    }

    final void e(int param0) {
        boolean stackIn_6_1 = false;
        boolean stackIn_37_1 = false;
        boolean stackIn_79_1 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        double var5_double;
        int var6;
        double var7;
        double var9;
        int var11;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        var11 = fleas.field_A ? 1 : 0;
        this.field_J = false;
        this.field_A = false;
        this.field_L = false;
        var2 = -1 + this.field_d / this.field_D.field_N;
        var3 = this.field_D.field_N * (this.field_z.length - var2);
        if (!this.field_k) {
          this.field_B = 0;
          this.field_v = 0;
          this.field_g = false;
          this.field_c = false;
          return;
        }
        stackIn_6_1 = (kc.field_f == 1) && (this.a((byte) 103));
        this.field_g = stackIn_6_1;
        if (param0 != 99) {
          this.e(1);
        }
        this.field_B = this.field_B - 1;
        this.field_v = this.field_v - 1;
        var4 = this.field_x;
        if (this.field_i &&
          0 <= this.field_x &&
          this.field_z.length > this.field_x) {
          if (ei.field_H[98]) {
            if (this.field_v < 0) {
              this.field_x = this.field_x - 1;
              this.field_v = ij.field_L;
            }
          } else {
            if (!ei.field_H[99]) {
              this.field_v = -1;
            } else {
              if (this.field_v < 0) {
                this.field_x = this.field_x + 1;
                this.field_v = ij.field_L;
              }
            }
          }
          if (0 > this.field_x) {
            this.field_x = 0;
          }
          if (this.field_x >= this.field_z.length) {
            this.field_x = -1 + this.field_z.length;
          }
        }
        if (!this.field_g) {
          if (kc.field_f == 1) {
            this.field_i = false;
          }
          if (0 > this.field_x) {
            this.field_x = 0;
          }
          if (this.field_z.length <= this.field_x) {
            this.field_x = this.field_z.length - 1;
          }
          stackIn_37_1 = (this.field_x != var4);
          this.field_J = stackIn_37_1;
          if (this.field_x >= var2 / 2) {
            if (this.field_z.length - this.field_x >= var2 / 2) {
              var5 = var3 * (-(var2 / 2) + this.field_x) / (-var2 + this.field_z.length);
            } else {
              var5 = var3;
            }
          } else {
            var5 = 0;
          }
          if (this.field_S != var5) {
            var6 = this.field_S - var5;
            if (var6 / 4 == 0) {
              if (var6 / 2 != 0) {
                this.field_S = this.field_S - var6 / 2;
              } else {
                this.field_S = this.field_S - var6;
              }
            } else {
              this.field_S = this.field_S - var6 / 4;
            }
          }
          return;
        }
        this.field_i = true;
        if (this.field_a + this.field_D.field_N >= kc.field_b) {
          return;
        }
        if (ag.field_f < this.field_l - (-this.field_n + this.field_P)) {
          if (jk.field_r != 0) {
            var5Lifetime1 = this.field_S + (-this.field_a - (this.field_D.field_N - kc.field_b));
            this.field_x = var5Lifetime1 / this.field_D.field_N;
          }
        } else {
          if (kc.field_b > this.field_D.field_N + (this.field_a + this.field_P)) {
            if (-this.field_P + (this.field_d + this.field_a) > kc.field_b) {
              this.field_B = -1;
              var5_double = (double)(-this.field_D.field_N + (-this.field_a + kc.field_b - (this.field_P + this.field_P / 2)));
              if (var5_double < 0.0) {
                var5_double = 0.0;
              }
              var7 = (double)(-this.field_P + (-(this.field_P * 2) + (-this.field_D.field_N + this.field_d)));
              if (var5_double > var7) {
                var5_double = var7;
              }
              var9 = var5_double / var7;
              this.field_x = (int)(var9 * (double)(-1 + this.field_z.length));
            } else {
              if (this.field_B < 0) {
                this.field_x = this.field_x + 1;
                this.field_B = ij.field_L;
              }
              this.field_L = true;
            }
          } else {
            this.field_A = true;
            if (this.field_B < 0) {
              this.field_x = this.field_x - 1;
              this.field_B = ij.field_L;
            }
          }
        }
        if (var3 < this.field_S) {
          this.field_S = var3;
        }
        if (0 > this.field_x) {
          this.field_x = 0;
        }
        if (this.field_z.length <= this.field_x) {
          this.field_x = this.field_z.length - 1;
        }
        stackIn_79_1 = (this.field_x != var4);
        this.field_J = stackIn_79_1;
        if (this.field_x >= var2 / 2) {
          if (this.field_z.length - this.field_x >= var2 / 2) {
            var5Lifetime2 = var3 * (-(var2 / 2) + this.field_x) / (-var2 + this.field_z.length);
          } else {
            var5Lifetime2 = var3;
          }
        } else {
          var5Lifetime2 = 0;
        }
        if (this.field_S != var5Lifetime2) {
          var6Lifetime1 = this.field_S - var5Lifetime2;
          if (var6Lifetime1 / 4 == 0) {
            if (var6Lifetime1 / 2 != 0) {
              this.field_S = this.field_S - var6Lifetime1 / 2;
            } else {
              this.field_S = this.field_S - var6Lifetime1;
            }
          } else {
            this.field_S = this.field_S - var6Lifetime1 / 4;
          }
        }
        return;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void d(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          if (param0 <= 104) {
            ik.d(69);
          }
          var5 = ge.field_e;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1_ref), "ik.E(" + param0 + ')');
        }
    }

    public static void b(boolean param0) {
        field_C = null;
        if (param0) {
          ik.d(41);
        }
    }

    ik(int param0, int param1, int param2, int param3, fa param4, dd param5, dd param6, dd param7, dd param8) {
        int stackIn_4_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_I = 0;
        this.field_r = -16727809;
        this.field_s = -257908576;
        this.field_u = -252645136;
        this.field_Q = -16777215;
        this.field_A = false;
        this.field_B = 0;
        this.field_v = 0;
        this.field_M = null;
        this.field_H = -8355712;
        this.field_x = -1;
        this.field_L = false;
        this.field_t = new boolean[]{};
        this.field_F = -16777215;
        this.field_z = new String[]{};
        this.field_O = -2147434304;
        this.field_w = -1;
        this.field_J = false;
        this.field_N = 0;
        try {
          this.field_n = param2;
          this.field_D = param4;
          this.field_a = param1;
          this.field_d = param3;
          this.field_l = param0;
          this.field_K = param7;
          this.field_q = param8;
          this.field_y = param6;
          if (param5 == null) {
            stackIn_4_1 = this.field_D.field_N;
          } else {
            stackIn_4_1 = param5.field_x;
          }
          this.field_P = stackIn_4_1;
          this.field_E = param5;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_8_0 = var10;
          stackIn_8_1 = new StringBuilder().append("ik.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param5 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param6 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param7 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param8 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_G = Math.atan2(1.0, 0.0);
        field_R = true;
        field_C = "Not yet reached";
    }
}
