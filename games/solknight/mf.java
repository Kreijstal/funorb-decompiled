/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf extends ej {
    private int[] field_r;
    private int[] field_T;
    int[] field_z;
    int[] field_J;
    static String field_x;
    private int[] field_w;
    static String field_l;
    static String field_K;
    private hg[][] field_p;
    private int[] field_W;
    int[] field_U;
    private int[] field_B;
    static int field_A;
    private int[] field_S;
    private int[] field_o;
    private int field_q;
    static String field_n;
    private hg[][] field_O;
    private int field_M;
    private oi field_H;
    private int[] field_N;
    private int[] field_I;
    private int[] field_t;
    private int[] field_v;
    static String[] field_y;
    private int[] field_P;
    static String field_F;
    private int[] field_D;
    private qd field_C;
    private long field_E;
    private int field_u;
    private int field_G;
    private boolean field_R;
    private lh field_Q;
    private long field_s;
    private int field_L;
    private rl field_m;
    private boolean field_V;

    final synchronized boolean a(int param0, rl param1, me param2, da param3, int param4) {
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        ee var8_ref_ee = null;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        fc var12 = null;
        fc var13 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          param1.a();
          var6_int = 1;
          var7 = null;
          if (param0 > 0) {
            var7 = new int[]{param0};
          }
          var8_ref_ee = (ee) (param1.field_h.b(0));
          while (var8_ref_ee != null) {
            var9 = (int)var8_ref_ee.field_g;
            var12 = (fc) (this.field_C.a(true, (long)var9));
            if (var12 == null) {
              var13 = oa.a(-1803587230, var9, param3);
              if (var13 != null) {
                this.field_C.a((byte) 122, var13, (long)var9);
                if (!var13.a(param2, (int[]) (var7), var8_ref_ee.field_k, -124)) {
                  var6_int = 0;
                }
              } else {
                var6_int = 0;
              }
            } else {
              if (!var12.a(param2, (int[]) (var7), var8_ref_ee.field_k, -124)) {
                var6_int = 0;
                var8_ref_ee = (ee) (param1.field_h.c((byte) 118));
                continue;
              }
            }
            var8_ref_ee = (ee) (param1.field_h.c((byte) 118));
          }
          var8 = 25 / ((param4 + 49) / 43);
          if (var6_int != 0) {
            param1.b();
          }
          stackIn_18_0 = var6_int;
          return stackIn_18_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("mf.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(int param0, int[] param1, int param2, int param3, hg param4) {
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        g var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          param4.field_t = gj.field_s / param3;
          if (param4.field_k >= 0 && (null == param4.field_w ||
            param4.field_w.i())) {
            param4.a((byte) 104);
            param4.c(10);
            if (0 < param4.field_m) {
              if (param4 != this.field_O[param4.field_z][param4.field_m]) {
                return true;
              }
              this.field_O[param4.field_z][param4.field_m] = null;
            }
            return true;
          }
          var6_int = param4.field_n;
          if (0 < var6_int) {
            var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_S[param4.field_z]) + 0.5);
            if (0 > var6_int) {
              var6_int = 0;
            }
            param4.field_n = var6_int;
          }
          param4.field_w.f(this.a(param4, 1));
          var7 = param4.field_D;
          param4.field_q = param4.field_q + var7.field_m;
          param4.field_r = param4.field_r + 1;
          var8 = 0;
          var9 = 0.000005086263020833333 * (double)((param4.field_o - 60 << 8) + (param4.field_n * param4.field_l >> 12));
          if (0 < var7.field_c) {
            if (var7.field_g > 0) {
              param4.field_v = param4.field_v + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_g) * 128.0);
            } else {
              param4.field_v = param4.field_v + 128;
            }
            if (var7.field_c * param4.field_v >= 819200) {
              var8 = 1;
            }
          }
          if (null != var7.field_j) {
            if (var7.field_b <= 0) {
              param4.field_j = param4.field_j + 128;
            } else {
              param4.field_j = param4.field_j + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_b) * 128.0);
            }
            while (var7.field_j.length - 2 > param4.field_s) {
              if (param4.field_j > ((var7.field_j[param4.field_s + 2] & 255) << 8)) {
                param4.field_s = param4.field_s + 2;
                continue;
              }
              break;
            }
            if (param4.field_s == -2 + var7.field_j.length &&
              var7.field_j[1 + param4.field_s] == 0) {
              var8 = 1;
            }
          }
          if (param4.field_k >= 0 &&
            null != var7.field_i &&
            (1 & this.field_U[param4.field_z]) == 0 && (!(0 <= param4.field_m) ||
            param4 != this.field_O[param4.field_z][param4.field_m])) {
            if (0 >= var7.field_h) {
              param4.field_k = param4.field_k + 128;
            } else {
              param4.field_k = param4.field_k + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_h * var9));
            }
            while (-2 + var7.field_i.length > param4.field_A) {
              if ((65280 & var7.field_i[2 + param4.field_A] << 8) < param4.field_k) {
                param4.field_A = param4.field_A + 2;
                continue;
              }
              break;
            }
            if (var7.field_i.length - 2 == param4.field_A) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param4.field_w.a(param4.field_t, this.a(param4, (byte) -70), this.a(127, param4));
            return false;
          }
          param4.field_w.e(param4.field_t);
          if (param1 == null) {
            param4.field_w.a(param2);
          } else {
            param4.field_w.a(param1, param0, param2);
          }
          if (param4.field_w.h()) {
            this.field_Q.field_r.a(param4.field_w);
          }
          param4.a((byte) 112);
          if (param4.field_k >= 0) {
            param4.c(10);
            if (param4.field_m > 0 &&
              this.field_O[param4.field_z][param4.field_m] == param4) {
              this.field_O[param4.field_z][param4.field_m] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_63_0 = var6;
          stackIn_63_1 = new StringBuilder().append("mf.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(')').toString());
        }
    }

    private final void a(int param0, byte param1) {
        hg var3;
        int var4;
        int var5;
        var5 = SolKnight.field_L ? 1 : 0;
        var4 = 102 / ((param1 - 22) / 56);
        var3 = (hg) (this.field_Q.field_m.a((byte) 51));
        while (var3 != null) {
          if (param0 < 0 ||
            param0 == var3.field_z) {
            if (null != var3.field_w) {
              var3.field_w.e(gj.field_s / 100);
              if (var3.field_w.h()) {
                this.field_Q.field_r.a(var3.field_w);
              }
              var3.a((byte) 102);
            }
            if (var3.field_k < 0) {
              this.field_p[var3.field_z][var3.field_o] = null;
            }
            var3.c(10);
          }
          var3 = (hg) (this.field_Q.field_m.b(-18));
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = SolKnight.field_L ? 1 : 0;
        if (param1 < 0) {
          for (var4 = 0; var4 < 16; var4++) {
            this.field_D[var4] = param0;
          }
        } else {
          this.field_D[param1] = param0;
        }
        if (param2 != -129) {
          this.field_Q = (lh) null;
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 67 / ((10 - param0) / 61);
    }

    private final void c(int param0, int param1, int param2) {
        this.field_N[param2] = param0;
        if (param1 != 17208) {
          this.field_v = (int[]) null;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        hg stackIn_18_1 = null;
        boolean stackIn_19_2 = false;
        hg var5;
        int var6_int;
        sh var6;
        hg var7;
        hg var8;
        int var9;
        fc var10;
        fc var11;
        fc var12;
        var9 = SolKnight.field_L ? 1 : 0;
        this.b(param1, param0, 64, 127);
        if ((this.field_U[param0] & 2) != 0) {
          var5 = (hg) (this.field_Q.field_m.c((byte) 96));
          while (var5 != null) {
            if (param0 == var5.field_z &&
              0 > var5.field_k) {
              this.field_p[param0][var5.field_o] = null;
              this.field_p[param0][param1] = var5;
              var6_int = (var5.field_l * var5.field_n >> 12) + var5.field_h;
              var5.field_h = var5.field_h + (param1 - var5.field_o << 8);
              var5.field_n = 4096;
              var5.field_o = param1;
              var5.field_l = -var5.field_h + var6_int;
              return;
            }
            var5 = (hg) (this.field_Q.field_m.b((byte) 94));
          }
        }
        var10 = (fc) (this.field_C.a(true, (long)this.field_v[param0]));
        var11 = var10;
        var12 = var11;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_q[param1];
        if (var6 == null) {
          return;
        }
        var7 = new hg();
        var7.field_z = param0;
        var7.field_p = var11;
        var7.field_u = var6;
        var7.field_D = var10.field_i[param1];
        if (param3 != 26879) {
          this.c(12, -5);
        }
        var7.field_m = var10.field_h[param1];
        var7.field_o = param1;
        var7.field_i = param2 * param2 * (var10.field_j * var10.field_p[param1]) + 1024 >> 11;
        var7.field_x = 255 & var10.field_r[param1];
        var7.field_h = -(32767 & var10.field_s[param1]) + (param1 << 8);
        var7.field_v = 0;
        var7.field_s = 0;
        var7.field_A = 0;
        var7.field_k = -1;
        var7.field_j = 0;
        if (this.field_z[param0] != 0) {
          var7.field_w = qi.a(var6, this.a(var7, 1), 0, this.a(127, var7));
          stackIn_18_1 = var7;
          stackIn_19_2 = !(var12.field_s[param1] >= 0);
          this.a(stackIn_18_1, stackIn_19_2, false);
        } else {
          var7.field_w = qi.a(var6, this.a(var7, 1), this.a(var7, (byte) -70), this.a(127, var7));
        }
        if (0 > var12.field_s[param1]) {
          var7.field_w.d(-1);
        }
        if (var7.field_m >= 0) {
          var8 = this.field_O[param0][var7.field_m];
          if (var8 != null &&
            var8.field_k < 0) {
            this.field_p[param0][var8.field_o] = null;
            var8.field_k = 0;
          }
          this.field_O[param0][var7.field_m] = var7;
        }
        this.field_Q.field_m.a(var7, -7044);
        this.field_p[param0][param1] = var7;
        return;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var7 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          if (this.field_H.d()) {
            var4_int = this.field_H.field_c * this.field_M / gj.field_s;
            while (true) {
              var5 = (long)var4_int * (long)param2 + this.field_s;
              if (-var5 + this.field_E >= 0L) {
                this.field_s = var5;
                break;
              }
              var7 = (int)((-1L + ((long)var4_int + (-this.field_s + this.field_E))) / (long)var4_int);
              this.field_s = this.field_s + (long)var7 * (long)var4_int;
              this.field_Q.a(param0, param1, var7);
              this.c(false);
              param1 = param1 + var7;
              param2 = param2 - var7;
              if (!this.field_H.d()) {
                break;
              }
            }
          }
          this.field_Q.a(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("mf.AA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void e(int param0) {
        al var1 = (al) (cj.field_a.e((byte) 86));
        if (param0 != 4096) {
          mf.e(105);
        }
        if (var1 == null) {
          throw new IllegalStateException();
        }
        mi.a(var1.field_h, var1.field_k, var1.field_o);
        mi.f(var1.field_l, var1.field_j, var1.field_i, var1.field_m);
        var1.field_h = null;
        uc.field_a.a(var1, -7044);
    }

    public static void g(int param0) {
        field_x = null;
        field_F = null;
        field_l = null;
        field_K = null;
        field_y = null;
        int var1 = 106 / ((27 - param0) / 53);
        field_n = null;
    }

    final static void f(int param0) {
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        RuntimeException var1_ref = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          var1 = i.field_J;
          synchronized (var1) {
            if (param0 != -11214) {
              return;
            }
            pf.field_a = si.field_B;
            lf.field_c = lf.field_c + 1;
            if (0 > fg.field_b) {
              for (var2 = 0; var2 < 112; var2++) {
                fh.field_d[var2] = false;
              }
              fg.field_b = qd.field_d;
            } else {
              while (qd.field_d != fg.field_b) {
                var2 = ci.field_qb[qd.field_d];
                qd.field_d = 127 & qd.field_d + 1;
                if (var2 < 0) {
                  fh.field_d[~var2] = false;
                  continue;
                }
                fh.field_d[var2] = true;
              }
            }
            si.field_B = rh.field_e;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1_ref), "mf.MA(" + param0 + ')');
        }
    }

    private final int a(int param0, hg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 127) {
            mf.g(51);
          }
          var3_int = this.field_w[param1.field_z];
          if (var3_int < 8192) {
            stackIn_6_0 = var3_int * param1.field_x + 32 >> 6;
            return stackIn_6_0;
          }
          stackIn_4_0 = 16384 - ((128 - param1.field_x) * (-var3_int + 16384) + 32 >> 6);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("mf.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void b(byte param0, int param1, int param2) {
        this.field_P[param2] = param1;
        if (param0 >= -113) {
          this.d(58);
        }
        this.field_B[param2] = fi.a(param1, -128);
        this.e(param2, 28152, param1);
    }

    final void a(hg param0, boolean param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        try {
          if (param2) {
            this.field_t = (int[]) null;
          }
          var4_int = param0.field_u.field_i.length;
          if (param1 &&
            param0.field_u.field_k) {
            var6 = -param0.field_u.field_m + (var4_int + var4_int);
            var5 = (int)((long)var6 * (long)this.field_z[param0.field_z] >> 6);
            var4_int = var4_int << 8;
            if (var4_int <= var5) {
              param0.field_w.b(true);
              var5 = -1 + (var4_int + var4_int - var5);
            }
          } else {
            var5 = (int)((long)var4_int * (long)this.field_z[param0.field_z] >> 6);
          }
          param0.field_w.g(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("mf.LA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void b(int param0, byte param1) {
        this.field_M = param0;
        int var3 = 40 % ((-48 - param1) / 40);
    }

    private final int a(hg param0, int param1) {
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        g var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          if (param1 != 1) {
            this.field_z = (int[]) null;
          }
          var3_int = param0.field_h + (param0.field_n * param0.field_l >> 12);
          var3_int = var3_int + ((-8192 + this.field_N[param0.field_z]) * this.field_t[param0.field_z] >> 12);
          var4 = param0.field_D;
          if (var4.field_m > 0 && (!(var4.field_d <= 0) ||
            0 < this.field_W[param0.field_z])) {
            var5 = var4.field_d << 2;
            var6 = var4.field_f << 1;
            if (var6 > param0.field_r) {
              var5 = var5 * param0.field_r / var6;
            }
            var5 = var5 + (this.field_W[param0.field_z] >> 7);
            var7 = Math.sin((double)(param0.field_q & 511) * 0.01227184630308513);
            var3_int = var3_int + (int)((double)var5 * var7);
          }
          var5Lifetime1 = (int)((double)(param0.field_u.field_j * 256) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)gj.field_s + 0.5);
          stackIn_12_0 = (1 > var5Lifetime1) ? 1 : var5Lifetime1;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("mf.G(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized void b(boolean param0) {
        int var3 = SolKnight.field_L ? 1 : 0;
        if (!param0) {
          return;
        }
        fc var4 = (fc) (this.field_C.b(0));
        while (var4 != null) {
          var4.a(6890);
          var4 = (fc) (this.field_C.c((byte) 122));
        }
    }

    private final void a(int param0, int param1, int param2) {
        this.field_T[param2] = param1;
        if (param0 != 13127) {
          field_K = (String) null;
        }
        this.field_J[param2] = (int)(2097152.0 * Math.pow(2.0, (double)param1 * 0.00054931640625) + 0.5);
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = SolKnight.field_L ? 1 : 0;
        if (param1 != 28152) {
          this.field_P = (int[]) null;
        }
        if (this.field_v[param0] != param2) {
          this.field_v[param0] = param2;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_O[param0][var4] = null;
          }
        }
    }

    private final void g(int param0, int param1) {
        int var3;
        hg var4;
        int var5;
        var5 = SolKnight.field_L ? 1 : 0;
        var3 = 31 / ((param0 + 63) / 39);
        if ((this.field_U[param1] & 2) != 0) {
          var4 = (hg) (this.field_Q.field_m.a((byte) 51));
          while (var4 != null) {
            if (param1 == var4.field_z) {
              if (null != this.field_p[param1][var4.field_o]) {
                var4 = (hg) (this.field_Q.field_m.b(-50));
                continue;
              }
              if (0 > var4.field_k) {
                var4.field_k = 0;
              }
            }
            var4 = (hg) (this.field_Q.field_m.b(-50));
          }
        }
    }

    private final void e(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var4Lifetime3Lifetime1;
        int var4Lifetime3Lifetime2;
        int var5Lifetime3Lifetime1;
        int var5Lifetime3Lifetime2;
        var8 = SolKnight.field_L ? 1 : 0;
        var3 = param0 & 240;
        if (var3 == 128) {
          var4 = 15 & param0;
          var5 = (32549 & param0) >> 8;
          var6 = (8355990 & param0) >> 16;
          this.b(var5, var4, var6, 120);
          return;
        }
        if (144 == var3) {
          var4Lifetime1 = param0 & 15;
          var5Lifetime1 = (param0 & 32579) >> 8;
          var6Lifetime1 = 127 & param0 >> 16;
          if (var6Lifetime1 <= 0) {
            this.b(var5Lifetime1, var4Lifetime1, 64, -50);
          } else {
            this.a(var4Lifetime1, var5Lifetime1, var6Lifetime1, 26879);
          }
          return;
        }
        if (160 == var3) {
          var4Lifetime2 = param0 & 15;
          var5Lifetime2 = (param0 & 32598) >> 8;
          var6Lifetime2 = (param0 & 8351591) >> 16;
          this.c(var4Lifetime2, var5Lifetime2, var6Lifetime2, -93);
          return;
        }
        if (var3 != 176) {
          if (var3 == 192) {
            var4Lifetime3 = param0 & 15;
            var5Lifetime3 = (32680 & param0) >> 8;
            this.e(var4Lifetime3, 28152, var5Lifetime3 + this.field_B[var4Lifetime3]);
            return;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = param0 & 15;
            var5Lifetime3Lifetime1 = 127 & param0 >> 8;
            this.a((byte) -117, var4Lifetime3Lifetime1, var5Lifetime3Lifetime1);
            return;
          }
          if (var3 == 224) {
            var4Lifetime3Lifetime2 = param0 & 15;
            var5Lifetime3Lifetime2 = (param0 >> 9 & 16256) + (127 & param0 >> 8);
            this.c(var5Lifetime3Lifetime2, 17208, var4Lifetime3Lifetime2);
            return;
          }
          if (param1 < 73) {
            return;
          }
          var3 = param0 & 255;
          if (var3 != 255) {
            return;
          }
          this.a(128, true);
          return;
        }
        var4Lifetime4 = param0 & 15;
        var5Lifetime4 = 127 & param0 >> 8;
        var6Lifetime3 = param0 >> 16 & 127;
        if (var5Lifetime4 == 0) {
          this.field_B[var4Lifetime4] = fi.a(-2080769, this.field_B[var4Lifetime4]) + (var6Lifetime3 << 14);
        }
        if (var5Lifetime4 == 32) {
          this.field_B[var4Lifetime4] = (var6Lifetime3 << 7) + fi.a(this.field_B[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 1) {
          this.field_W[var4Lifetime4] = (var6Lifetime3 << 7) + fi.a(-16257, this.field_W[var4Lifetime4]);
        }
        if (33 == var5Lifetime4) {
          this.field_W[var4Lifetime4] = fi.a(this.field_W[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 5) {
          this.field_S[var4Lifetime4] = fi.a(-16257, this.field_S[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 37) {
          this.field_S[var4Lifetime4] = fi.a(this.field_S[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 7) {
          this.field_I[var4Lifetime4] = (var6Lifetime3 << 7) + fi.a(this.field_I[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 39) {
          this.field_I[var4Lifetime4] = fi.a(-128, this.field_I[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 10) {
          this.field_w[var4Lifetime4] = fi.a(this.field_w[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 42) {
          this.field_w[var4Lifetime4] = var6Lifetime3 + fi.a(this.field_w[var4Lifetime4], -128);
        }
        if (11 == var5Lifetime4) {
          this.field_r[var4Lifetime4] = (var6Lifetime3 << 7) + fi.a(this.field_r[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 43) {
          this.field_r[var4Lifetime4] = fi.a(this.field_r[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (64 == var5Lifetime4) {
          if (var6Lifetime3 < 64) {
            this.field_U[var4Lifetime4] = fi.a(this.field_U[var4Lifetime4], -2);
          } else {
            this.field_U[var4Lifetime4] = qk.a(this.field_U[var4Lifetime4], 1);
          }
        }
        if (var5Lifetime4 == 65) {
          if (64 > var6Lifetime3) {
            this.g(40, var4Lifetime4);
            this.field_U[var4Lifetime4] = fi.a(this.field_U[var4Lifetime4], -3);
          } else {
            this.field_U[var4Lifetime4] = qk.a(this.field_U[var4Lifetime4], 2);
          }
        }
        if (99 == var5Lifetime4) {
          this.field_o[var4Lifetime4] = fi.a(this.field_o[var4Lifetime4], 127) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 98) {
          this.field_o[var4Lifetime4] = fi.a(this.field_o[var4Lifetime4], 16256) + var6Lifetime3;
        }
        if (101 == var5Lifetime4) {
          this.field_o[var4Lifetime4] = (var6Lifetime3 << 7) + (16384 + fi.a(127, this.field_o[var4Lifetime4]));
        }
        if (100 == var5Lifetime4) {
          this.field_o[var4Lifetime4] = fi.a(this.field_o[var4Lifetime4], 16256) + (16384 + var6Lifetime3);
        }
        if (120 == var5Lifetime4) {
          this.a(var4Lifetime4, (byte) -122);
        }
        if (var5Lifetime4 == 121) {
          this.c(var4Lifetime4, -119);
        }
        if (var5Lifetime4 == 123) {
          this.f(-32471, var4Lifetime4);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.field_o[var4Lifetime4];
          if (16384 == var7) {
            this.field_t[var4Lifetime4] = fi.a(-16257, this.field_t[var4Lifetime4]) + (var6Lifetime3 << 7);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.field_o[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.field_t[var4Lifetime4] = var6Lifetime3 + fi.a(this.field_t[var4Lifetime4], -128);
          }
        }
        if (var5Lifetime4 == 16) {
          this.field_z[var4Lifetime4] = fi.a(-16257, this.field_z[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (48 == var5Lifetime4) {
          this.field_z[var4Lifetime4] = fi.a(this.field_z[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (81 == var5Lifetime4) {
          if (var6Lifetime3 < 64) {
            this.b(-4222, var4Lifetime4);
            this.field_U[var4Lifetime4] = fi.a(this.field_U[var4Lifetime4], -5);
          } else {
            this.field_U[var4Lifetime4] = qk.a(this.field_U[var4Lifetime4], 4);
          }
        }
        if (var5Lifetime4 == 17) {
          this.a(13127, (this.field_T[var4Lifetime4] & -16257) + (var6Lifetime3 << 7), var4Lifetime4);
        }
        if (var5Lifetime4 == 49) {
          this.a(13127, var6Lifetime3 + (this.field_T[var4Lifetime4] & -128), var4Lifetime4);
        }
    }

    private final void c(boolean param0) {
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = SolKnight.field_L ? 1 : 0;
        var2 = this.field_u;
        var3 = this.field_G;
        var4 = this.field_E;
        if (null != this.field_m &&
          this.field_L == var3) {
          this.a(93, this.field_V, this.field_R, this.field_m);
          this.c(param0);
          return;
        }
        while (true) {
          if (var3 != this.field_G) {
            this.field_E = var4;
            this.field_G = var3;
            this.field_u = var2;
            if (param0) {
              return;
            }
            if (null != this.field_m) {
              stackIn_26_0 = ~this.field_L;
              stackIn_26_1 = ~var3;
              if (stackIn_26_0 > stackIn_26_1) {
                this.field_u = -1;
                this.field_G = this.field_L;
                this.field_E = this.field_H.c(this.field_G);
              }
            }
            return;
          }
          while (var3 == this.field_H.field_h[var2]) {
            this.field_H.d(var2);
            var6 = this.field_H.e(var2);
            if (var6 != 1) {
              if ((128 & var6) != 0) {
                this.e(var6, 85);
              }
              this.field_H.a(var2);
              this.field_H.b(var2);
              continue;
            }
            this.field_H.b();
            this.field_H.b(var2);
            if (this.field_H.g()) {
              if (null != this.field_m) {
                this.a(this.field_R, this.field_m, true);
                this.c(false);
                return;
              }
              if (this.field_R &&
                0 != var3) {
                this.field_H.a(var4);
              } else {
                this.a(128, true);
                this.field_H.a();
                return;
              }
            }
            break;
          }
          var2 = this.field_H.f();
          var3 = this.field_H.field_h[var2];
          var4 = this.field_H.c(var3);
        }
    }

    final synchronized void a(byte param0) {
        if (param0 != 97) {
          return;
        }
        this.b(param0 ^ 225, true);
    }

    private final void f(int param0, int param1) {
        hg var3;
        int var4;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 != -32471) {
          return;
        }
        var3 = (hg) (this.field_Q.field_m.a((byte) 51));
        while (var3 != null) {
          if ((param1 < 0 ||
            param1 == var3.field_z) &&
            var3.field_k < 0) {
            this.field_p[var3.field_z][var3.field_o] = null;
            var3.field_k = 0;
          }
          var3 = (hg) (this.field_Q.field_m.b(-29));
        }
    }

    final synchronized void d(int param0, int param1, int param2) {
        if (param0 != -4474) {
          this.b(-93, -66, 21, -44);
        }
        this.b((byte) -114, param1, param2);
    }

    private final void b(int param0, int param1) {
        hg var3 = null;
        int var4 = SolKnight.field_L ? 1 : 0;
        if (param0 != -4222) {
          return;
        }
        if ((this.field_U[param1] & 4) != 0) {
          var3 = (hg) (this.field_Q.field_m.a((byte) 51));
          while (var3 != null) {
            if (param1 == var3.field_z) {
              var3.field_C = 0;
            }
            var3 = (hg) (this.field_Q.field_m.b(-123));
          }
        }
    }

    final synchronized ej b() {
        return null;
    }

    final synchronized boolean d(int param0) {
        if (param0 != 144) {
          this.field_p = (hg[][]) null;
        }
        return this.field_H.d();
    }

    final synchronized void d(int param0, int param1) {
        this.field_q = param1;
        if (param0 != 1349013231) {
          mf.f(13);
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int var6;
        hg var7;
        int var8;
        hg var9;
        var8 = SolKnight.field_L ? 1 : 0;
        var9 = this.field_p[param1][param0];
        if (var9 == null) {
          return;
        }
        {
          var6 = 32 / ((58 - param3) / 60);
          this.field_p[param1][param0] = null;
          if (0 != (this.field_U[param1] & 2)) {
            var7 = (hg) (this.field_Q.field_m.a((byte) 51));
            while (var7 != null) {
              if (var7.field_z == var9.field_z &&
                var7.field_k < 0 &&
                var7 != var9) {
                var9.field_k = 0;
                break;
              }
              var7 = (hg) (this.field_Q.field_m.b(-55));
            }
          } else {
            var9.field_k = 0;
          }
        }
    }

    private final synchronized void b(int param0, boolean param1) {
        this.field_H.a();
        this.field_m = null;
        this.a(param0 ^ 0, param1);
        if (param0 != 128) {
          this.a((byte) 32, -51, -95);
        }
    }

    private final void c(int param0, int param1) {
        int var4;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 < 0) {
          for (param0 = 0; param0 < 16; param0++) {
            this.c(param0, -123);
          }
          return;
        }
        this.field_I[param0] = 12800;
        this.field_w[param0] = 8192;
        this.field_r[param0] = 16383;
        this.field_N[param0] = 8192;
        this.field_W[param0] = 0;
        if (param1 >= -114) {
          return;
        }
        this.field_S[param0] = 8192;
        this.g(-114, param0);
        this.b(-4222, param0);
        this.field_U[param0] = 0;
        this.field_o[param0] = 32767;
        this.field_t[param0] = 256;
        this.field_z[param0] = 0;
        this.a(13127, 8192, param0);
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = SolKnight.field_L ? 1 : 0;
        int var3Lifetime1;
        if (param1) {
          this.a(-1, (byte) -71);
        } else {
          this.f(param0 - 32599, -1);
        }
        this.c(-1, param0 - 245);
        for (var3 = 0; var3 < 16; var3++) {
          this.field_v[var3] = this.field_P[var3];
        }
        if (param0 != 128) {
          this.d(38, -126, 2);
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < 16) {
          this.field_B[var5] = fi.a(-128, this.field_P[var5]);
          var5++;
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        int var5 = -121 / ((param3 + 33) / 36);
    }

    final boolean b(hg param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.field_w) {
            if (param1 == -1642423728) {
              return false;
            }
            return false;
          }
          if (param0.field_k >= 0) {
            param0.c(10);
            if (param0.field_m > 0) {
              if (this.field_O[param0.field_z][param0.field_m] != param0) {
                return true;
              }
              this.field_O[param0.field_z][param0.field_m] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("mf.PA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized void a(int param0, boolean param1, boolean param2, rl param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = SolKnight.field_L ? 1 : 0;
        try {
          if (param0 <= 85) {
            field_A = 42;
          }
          this.b(128, param1);
          this.field_H.a(param3.field_i);
          this.field_s = 0L;
          this.field_R = param2 ? true : false;
          var5_int = this.field_H.e();
          for (var6 = 0; var6 < var5_int; var6++) {
            this.field_H.d(var6);
            this.field_H.a(var6);
            this.field_H.b(var6);
          }
          this.field_u = this.field_H.f();
          this.field_G = this.field_H.field_h[this.field_u];
          this.field_E = this.field_H.c(this.field_G);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "mf.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(boolean param0, rl param1, boolean param2) {
        try {
          this.a(113, param2, param0, param1);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "mf.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final synchronized ej a() {
        return (ej) ((Object) this.field_Q);
    }

    private final int a(hg param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        g var9 = null;
        g var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.field_D[param0.field_z] == 0) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var9 = param0.field_D;
          var10 = var9;
          var4 = this.field_I[param0.field_z] * this.field_r[param0.field_z] + 4096 >> 13;
          var4 = var4 * var4 + 16384 >> 15;
          if (param1 != -70) {
            this.c(36, 17);
          }
          var4 = param0.field_i * var4 + 16384 >> 15;
          var4 = 128 + this.field_q * var4 >> 8;
          var4 = var4 * this.field_D[param0.field_z] + 128 >> 8;
          if (var10.field_c > 0) {
            var4 = (int)((double)var4 * Math.pow(0.5, (double)param0.field_v * 0.00001953125 * (double)var10.field_c) + 0.5);
          }
          if (var10.field_j != null) {
            var5 = param0.field_j;
            var6 = var10.field_j[1 + param0.field_s];
            if (param0.field_s < -2 + var10.field_j.length) {
              var7 = 65280 & var9.field_j[param0.field_s] << 8;
              var8 = 65280 & var10.field_j[param0.field_s + 2] << 8;
              var6 = var6 + (-var6 + var10.field_j[3 + param0.field_s]) * (var5 - var7) / (-var7 + var8);
            }
            var4 = var4 * var6 + 32 >> 6;
          }
          if (0 < param0.field_k &&
            var10.field_i != null) {
            var5Lifetime1 = param0.field_k;
            var6Lifetime1 = var10.field_i[param0.field_A + 1];
            if (param0.field_A < -2 + var10.field_i.length) {
              var7Lifetime1 = var9.field_i[param0.field_A] << 8 & 65280;
              var8Lifetime1 = (var10.field_i[param0.field_A + 2] & 255) << 8;
              var6Lifetime1 = var6Lifetime1 + (-var6Lifetime1 + var10.field_i[3 + param0.field_A]) * (var5Lifetime1 - var7Lifetime1) / (var8Lifetime1 - var7Lifetime1);
            }
            var4 = var4 * var6Lifetime1 + 32 >> 6;
          }
          stackIn_19_0 = var4;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("mf.J(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var6;
        int var5;
        boolean decompiledFrameRemainder0 = true;
        var6 = SolKnight.field_L ? 1 : 0;
        if (this.field_H.d()) {
          var2 = this.field_H.field_c * this.field_M / gj.field_s;
          while (true) {
            var3 = (long)param0 * (long)var2 + this.field_s;
            if (this.field_E - var3 >= 0L) {
              this.field_s = var3;
            } else {
              var5 = (int)((this.field_E - this.field_s - (-(long)var2 + 1L)) / (long)var2);
              this.field_s = this.field_s + (long)var5 * (long)var2;
              this.field_Q.a(var5);
              param0 = param0 - var5;
              this.c(false);
              if (this.field_H.d()) {
                continue;
              }
            }
            break;
          }
          this.field_Q.a(param0);
          decompiledFrameRemainder0 = false;
        }
        else {
          this.field_Q.a(param0);
        }

    }

    final synchronized int d() {
        return 0;
    }

    public mf() {
        this.field_T = new int[16];
        this.field_z = new int[16];
        this.field_r = new int[16];
        this.field_W = new int[16];
        this.field_U = new int[16];
        this.field_S = new int[16];
        this.field_O = new hg[16][128];
        this.field_N = new int[16];
        this.field_B = new int[16];
        this.field_I = new int[16];
        this.field_o = new int[16];
        this.field_M = 1000000;
        this.field_t = new int[16];
        this.field_w = new int[16];
        this.field_J = new int[16];
        this.field_P = new int[16];
        this.field_v = new int[16];
        this.field_p = new hg[16][128];
        this.field_D = new int[16];
        this.field_q = 256;
        this.field_H = new oi();
        this.field_Q = new lh(this);
        this.field_C = new qd(128);
        this.b(256, -1, -129);
        this.a(128, true);
    }

    static {
        field_l = "Play free version";
        field_A = 0;
        field_x = "OK";
        field_K = "Score";
        field_n = "Create a free account to start using this feature";
        field_y = new String[]{"SCATTER ROCKETS", "GUIDED MISSILES", "TORPEDOES", "RAIL GUN", "PULSE LASER", "PLASMA BOLT", "FUSION BEAM"};
        field_F = "Go Back";
    }
}
