/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends qb {
    private int field_L;
    private wa field_W;
    private int[] field_O;
    private int[] field_q;
    private lp[][] field_u;
    private int[] field_J;
    private int[] field_U;
    private int[] field_m;
    private lp[][] field_r;
    private int field_x;
    private int[] field_N;
    private int[] field_K;
    int[] field_Q;
    private vm field_A;
    private int[] field_s;
    private int[] field_I;
    int[] field_o;
    private int[] field_n;
    private int[] field_V;
    private int[] field_B;
    private int[] field_P;
    static int[] field_E;
    int[] field_G;
    static fd field_w;
    private long field_F;
    private boolean field_T;
    private long field_z;
    private int field_t;
    private int field_p;
    static qk field_y;
    private hg field_R;
    private vh field_S;
    private int field_v;
    private boolean field_D;
    static String[] field_M;

    final synchronized void d(int param0) {
        this.c(true, 100);
        if (param0 >= -78) {
          this.b(false, -122);
        }
    }

    private final void a(int param0, byte param1, int param2) {
        if (param1 != 78) {
          this.f(61);
        }
    }

    private final void a(int param0, int param1, int param2) {
        this.field_O[param2] = param1;
        this.field_Q[param2] = (int)(0.5 + 2097152.0 * Math.pow((double)param0, 0.00054931640625 * (double)param1));
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        lp var6;
        int var7;
        lp var8;
        var7 = DungeonAssault.field_K;
        var8 = this.field_u[param2][param1];
        if (var8 == null) {
          return;
        }
        if (!param0) {
          this.b((int[]) null, -89, 102);
        }
        boolean decompiledFrameCompleted0 = true;
        this.field_u[param2][param1] = null;
        if ((this.field_G[param2] & 2) != 0) {
          var6 = (lp) (this.field_R.field_q.e(-24172));
          while (true) {
            if (var6 != null) {
              if (var7 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (var6.field_p == var8.field_p &&
                var6.field_r < 0 &&
                var6 != var8) {
                var8.field_r = 0;
              } else {
                var6 = (lp) (this.field_R.field_q.a(4));
                continue;
              }
            }
            break;
          }
          if ((decompiledFrameCompleted0) &&
            (var7 != 0)) {
            var8.field_r = 0;
          }
        } else {
          var8.field_r = 0;
        }

    }

    final synchronized void a(vh param0, int param1, boolean param2) {
        try {
          this.a(true, -16257, param0, param2);
          if (param1 != 20938) {
            ug.a(false, 34, (CharSequence) null);
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ug.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        if (param0 < 70) {
          return;
        }
        if (param1 != this.field_P[param2]) {
          this.field_P[param2] = param1;
          var4 = 0;
          while (var4 < 128) {
            this.field_r[param2][var4] = null;
            var4++;
            if (var5 != 0) {
              break;
            }
          }
        }
    }

    private final void a(int param0, boolean param1) {
        lp var3;
        int var4;
        lp stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        var4 = DungeonAssault.field_K;
        if (param1) {
          this.field_Q = (int[]) null;
        }
        var3 = (lp) (this.field_R.field_q.e(-24172));
        while (var3 != null) {
          if (var4 == 0) {
            if (param0 < 0 ||
              var3.field_p == param0) {
              if (null != var3.field_v) {
                var3.field_v.f(vn.field_t / 100);
                if (var3.field_v.e()) {
                  this.field_R.field_o.b(var3.field_v);
                }
                stackIn_14_0 = var3;
                stackIn_15_1 = !(param1);
                ((lp) (Object) stackIn_14_0).b(stackIn_15_1);
              }
              if (var3.field_r < 0) {
                this.field_u[var3.field_p][var3.field_y] = null;
              }
              var3.a(param1);
            }
            var3 = (lp) (this.field_R.field_q.a(4));
            continue;
          }
          break;
        }
    }

    final synchronized boolean b(byte param0) {
        if (param0 >= -116) {
          this.field_q = (int[]) null;
        }
        return this.field_A.g();
    }

    private final void b(byte param0, int param1, int param2) {
        this.field_J[param2] = param1;
        this.field_K[param2] = nb.a(-128, param1);
        if (param0 >= -54) {
          this.field_N = (int[]) null;
        }
        this.a((byte) 114, param1, param2);
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param3 < 62) {
          this.f(-63, 116);
        }
    }

    final synchronized void f(int param0) {
        int var3 = 0;
        kk var4 = null;
        var3 = DungeonAssault.field_K;
        if (param0 != -50) {
          this.a(100, (byte) 104, 28);
        }
        var4 = (kk) (this.field_W.a(true));
        while (var4 != null) {
          var4.a((byte) -97);
          var4 = (kk) (this.field_W.a(4318));
          if (var3 == 0) {
            continue;
          }
          break;
        }
    }

    final synchronized int a() {
        return 0;
    }

    private final void d(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var4 = DungeonAssault.field_K;
        if (param0) {
          this.a(-1, false);
        }
        if (!param0 ||
          var4 != 0) {
          this.b(true, -1);
        }
        this.e(-1, 0);
        var3 = 0;
        do {
          if (16 <= var3) {
            if (param1 != 16) {
              this.a((lp) null, 42);
            }
            break;
          }
          this.field_P[var3] = this.field_J[var3];
          var3++;
        } while (var4 == 0);
        var5 = 0;
        var3 = var5;
        while (var5 < 16) {
          this.field_K[var5] = nb.a(this.field_J[var5], -128);
          var5++;
          if (var4 == 0) {
            continue;
          }
          break;
        }
        return;
    }

    private final void b(int param0, int param1, int param2, int param3) {
        lp stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        lp stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        boolean stackIn_19_3 = false;
        lp stackOut_3_0;
        int var5;
        lp var6;
        int var7_int;
        va var7;
        lp var8;
        lp var9;
        int var10;
        kk var11;
        kk var12;
        L0: {
          var10 = DungeonAssault.field_K;
          this.a(true, param2, param3, 64);
          var5 = 109 / ((57 - param1) / 44);
          if (0 != (2 & this.field_G[param3])) {
            var6 = (lp) (this.field_R.field_q.d(-14205));
            while (var6 != null) {
              stackOut_3_0 = var6;
              stackIn_9_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (var10 != 0) {
                break L0;
              }
              if (stackIn_4_0.field_p == param3 &&
                var6.field_r < 0) {
                this.field_u[param3][var6.field_y] = null;
                this.field_u[param3][param2] = var6;
                var7_int = var6.field_s + (var6.field_w * var6.field_J >> 12);
                var6.field_s = var6.field_s + (param2 - var6.field_y << 8);
                var6.field_y = param2;
                var6.field_J = var7_int - var6.field_s;
                var6.field_w = 4096;
                return;
              }
              var6 = (lp) (this.field_R.field_q.g(20));
            }
          }
          stackIn_9_0 = this.field_W.a((long)this.field_P[param3], 8);
        }
        var11 = (kk) (stackIn_9_0);
        var12 = var11;
        if (var12 == null) {
          return;
        }
        var7 = var11.field_k[param2];
        if (var7 == null) {
          return;
        }
        var8 = new lp();
        var8.field_x = var12;
        var8.field_I = var7;
        var8.field_p = param3;
        var8.field_A = var11.field_n[param2];
        var8.field_D = var11.field_o[param2];
        var8.field_y = param2;
        var8.field_t = 1024 + var11.field_m[param2] * var12.field_j * (param0 * param0) >> 11;
        var8.field_i = var11.field_p[param2] & 255;
        var8.field_s = (param2 << 8) - (32767 & var11.field_r[param2]);
        var8.field_r = -1;
        var8.field_j = 0;
        var8.field_u = 0;
        var8.field_k = 0;
        var8.field_l = 0;
        if (0 != this.field_o[param3]) {
          var8.field_v = ni.a(var7, this.a((byte) 46, var8), 0, this.a(var8, false));
          stackIn_18_1 = var8;
          stackIn_18_2 = 4917;
          stackIn_19_3 = !(var11.field_r[param2] >= 0);
          this.a(stackIn_18_1, stackIn_18_2, stackIn_19_3);
          if (var10 != 0) {
            var8.field_v = ni.a(var7, this.a((byte) 78, var8), this.b(var8, 0), this.a(var8, false));
          }
        } else {
          var8.field_v = ni.a(var7, this.a((byte) 78, var8), this.b(var8, 0), this.a(var8, false));
        }
        if (var11.field_r[param2] < 0) {
          var8.field_v.e(-1);
        }
        if (var8.field_D >= 0) {
          var9 = this.field_r[param3][var8.field_D];
          if (var9 != null &&
            var9.field_r < 0) {
            this.field_u[param3][var9.field_y] = null;
            var9.field_r = 0;
          }
          this.field_r[param3][var8.field_D] = var8;
        }
        this.field_R.field_q.a(var8, false);
        this.field_u[param3][param2] = var8;
        return;
    }

    private final void f(int param0, int param1) {
        int var3;
        lp var4;
        int var5;
        var5 = DungeonAssault.field_K;
        var3 = 13 / ((param1 + 35) / 49);
        if ((this.field_G[param0] & 4) != 0) {
          var4 = (lp) (this.field_R.field_q.e(-24172));
          while (var4 != null) {
            if (var5 != 0) {
              break;
            }
            if (param0 == var4.field_p) {
              var4.field_m = 0;
            }
            var4 = (lp) (this.field_R.field_q.a(4));
          }
        }
    }

    final boolean a(lp param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_v != null) {
            if (param1 != -16257) {
              this.field_r = (lp[][]) null;
            }
            return false;
          }
          if (0 <= param0.field_r) {
            param0.a(false);
            if (param0.field_D > 0 &&
              param0 == this.field_r[param0.field_p][param0.field_D]) {
              this.field_r[param0.field_p][param0.field_D] = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ug.P(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        this.field_B[param2] = param1;
        if (param0) {
          ug.a(false, 29);
        }
    }

    private final synchronized void c(boolean param0, int param1) {
        this.field_A.c();
        if (param1 <= 27) {
          return;
        }
        this.field_S = null;
        this.d(param0, 16);
    }

    private final int a(byte param0, lp param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        of var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = (param1.field_J * param1.field_w >> 12) + param1.field_s;
          var3_int = var3_int + ((-8192 + this.field_B[param1.field_p]) * this.field_I[param1.field_p] >> 12);
          if (param0 <= 2) {
            this.b((int[]) null, 108, -85);
          }
          var4 = param1.field_A;
          if (var4.field_i > 0 && (!(var4.field_h <= 0) ||
            this.field_U[param1.field_p] > 0)) {
            var5 = var4.field_h << 2;
            var6 = var4.field_a << 1;
            if (param1.field_G < var6) {
              var5 = param1.field_G * var5 / var6;
            }
            var5 = var5 + (this.field_U[param1.field_p] >> 7);
            var7 = Math.sin((double)(param1.field_E & 511) * 0.01227184630308513);
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          var5Lifetime1 = (int)((double)(256 * param1.field_I.field_n) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)vn.field_t + 0.5);
          stackIn_13_0 = (var5Lifetime1 < 1) ? 1 : var5Lifetime1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ug.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        boolean decompiledFrameCompleted0 = true;
        var5 = DungeonAssault.field_K;
        if (param1 >= 0) {
          this.field_V[param1] = param0;
        }
        if (param1 < 0 ||
          var5 != 0) {
          var4 = 0;
          while (var4 < 16) {
            this.field_V[var4] = param0;
            var4++;
            if (var5 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
        }
        if (decompiledFrameCompleted0) {
          var4Lifetime1 = 54 / ((-2 - param2) / 60);
        }

    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = DungeonAssault.field_K;
        try {
          if (this.field_A.g()) {
            var4_int = this.field_A.field_c * this.field_x / vn.field_t;
            while (true) {
              var5 = this.field_z + (long)param2 * (long)var4_int;
              if (this.field_F - var5 >= 0L) {
                this.field_z = var5;
                if (var8 == 0) {
                  break;
                }
              }
              var7 = (int)(((long)var4_int + this.field_F - this.field_z - 1L) / (long)var4_int);
              this.field_z = this.field_z + (long)var4_int * (long)var7;
              this.field_R.b(param0, param1, var7);
              this.a((byte) -24);
              param1 = param1 + var7;
              param2 = param2 - var7;
              if (!this.field_A.g()) {
                break;
              }
              if (var8 == 0) {
                continue;
              }
              this.field_R.b(param0, param1, param2);
              return;
            }
          }
          this.field_R.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ug.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void e(int param0, int param1) {
        int var4 = DungeonAssault.field_K;
        if (param1 <= param0) {
          this.field_q[param0] = 12800;
          this.field_n[param0] = 8192;
          this.field_m[param0] = 16383;
          this.field_B[param0] = 8192;
          this.field_U[param0] = 0;
          this.field_s[param0] = 8192;
          this.d(param0, -1);
          this.f(param0, param1 - 108);
          this.field_G[param0] = 0;
          this.field_N[param0] = 32767;
          this.field_I[param0] = 256;
          this.field_o[param0] = 0;
          this.a(2, 8192, param0);
          return;
        }
        param0 = 0;
        do {
          if (16 <= param0) {
            return;
          }
          this.e(param0, param1 + 0);
          param0++;
        } while (var4 == 0);
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        String stackIn_10_0 = null;
        int stackIn_13_0 = 0;
        String stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var5 = DungeonAssault.field_K;
        try {
          var3 = cm.a(param0, -125, param2);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var4 < param2.length())))) {
            stackOut_6_0 = rp.a(param2.charAt(var4), (byte) -120);
            stackIn_13_0 = stackOut_6_0 ? 1 : 0;
            stackIn_7_0 = stackOut_6_0;
            if (var5 == 0) {
              if (!stackIn_7_0) {
                stackIn_10_0 = me.field_a;
                return stackIn_10_0;
              }
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_13_0 = param1;
          }
          if (stackIn_13_0 <= -39) {
            return null;
          }
          stackIn_16_0 = (String) null;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("ug.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final synchronized qb d() {
        return (qb) ((Object) this.field_R);
    }

    final synchronized void c(byte param0, int param1, int param2) {
        this.b((byte) -87, param1, param2);
        int var4 = -56 % ((param0 + 57) / 43);
    }

    private final synchronized void a(boolean param0, int param1, vh param2, boolean param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = DungeonAssault.field_K;
        try {
          this.c(param0, param1 + 16353);
          this.field_A.a(param2.field_i);
          this.field_z = 0L;
          if (param1 != -16257) {
            this.a((vh) null, -111, false);
          }
          stackIn_6_1 = (param3);
          this.field_T = stackIn_6_1;
          var5_int = this.field_A.a();
          var6 = 0;
          while (var5_int > var6) {
            this.field_A.d(var6);
            this.field_A.b(var6);
            this.field_A.a(var6);
            var6++;
            if (var7 != 0) {
              return;
            }
          }
          this.field_p = this.field_A.b();
          this.field_t = this.field_A.field_d[this.field_p];
          this.field_F = this.field_A.e(this.field_t);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("ug.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized qb c() {
        return null;
    }

    private final void b(boolean param0, int param1) {
        lp var3;
        int var4;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        var4 = DungeonAssault.field_K;
        var3 = (lp) (this.field_R.field_q.e(-24172));
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
          stackIn_10_0 = -1;
          stackIn_10_1 = ~param1;
          if (var4 == 0) {
            if ((stackIn_10_0 < stackIn_10_1 ||
              param1 == var3.field_p) &&
              var3.field_r < 0) {
              this.field_u[var3.field_p][var3.field_y] = null;
              var3.field_r = 0;
            }
            var3 = (lp) (this.field_R.field_q.a(4));
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_10_0 = param0 ? 1 : 0;
          stackIn_10_1 = 1;
        }
        if (stackIn_10_0 != stackIn_10_1) {
          this.field_x = 27;
        }
        return;
    }

    final synchronized void c(int param0, int param1) {
        if (param1 != 24509) {
          return;
        }
        this.field_L = param0;
    }

    public static void e(int param0) {
        field_E = null;
        field_y = null;
        field_M = null;
        if (param0 != 0) {
          ug.a(true, -75);
        }
        field_w = null;
    }

    private final void a(byte param0) {
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = DungeonAssault.field_K;
        if (param0 != -24) {
          this.field_V = (int[]) null;
        }
        var2 = this.field_p;
        var3 = this.field_t;
        var4 = this.field_F;
        if (this.field_S != null &&
          this.field_v == var3) {
          this.a(this.field_D, -16257, this.field_S, this.field_T);
          this.a((byte) -24);
          return;
        }
        while (true) {
          if (this.field_t != var3) {
            this.field_t = var3;
            this.field_F = var4;
            this.field_p = var2;
            if (null != this.field_S) {
              stackIn_9_0 = var3;
              stackIn_9_1 = this.field_v;
              if (stackIn_9_0 > stackIn_9_1) {
                this.field_p = -1;
                this.field_t = this.field_v;
                this.field_F = this.field_A.e(this.field_t);
              }
            }
            return;
          }
          while (true) {
            stackIn_15_0 = this.field_A.field_d[var2];
            stackIn_15_1 = var3;
            if (var7 != 0) {
              if (stackIn_15_0 > stackIn_15_1) {
                this.field_p = -1;
                this.field_t = this.field_v;
                this.field_F = this.field_A.e(this.field_t);
              }
              return;
            }
            if (stackIn_15_0 == stackIn_15_1) {
              this.field_A.d(var2);
              var6 = this.field_A.c(var2);
              stackIn_19_0 = 1;
              stackIn_19_1 = var6;
              if (stackIn_19_0 != stackIn_19_1) {
                if ((128 & var6) != 0) {
                  this.a(var6, 16384);
                }
                this.field_A.b(var2);
                this.field_A.a(var2);
                continue;
              } else {
                this.field_A.e();
                this.field_A.a(var2);
                if (this.field_A.f()) {
                  if (null != this.field_S) {
                    this.a(this.field_S, 20938, this.field_T);
                    this.a((byte) -24);
                    return;
                  }
                  if (this.field_T &&
                    0 != var3) {
                    this.field_A.a(var4);
                  } else {
                    this.d(true, 16);
                    this.field_A.c();
                    return;
                  }
                }
              }
            }
            break;
          }
          var2 = this.field_A.b();
          var3 = this.field_A.field_d[var2];
          var4 = this.field_A.e(var3);
        }
    }

    final boolean a(int param0, int param1, int param2, lp param3, int[] param4) {
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        of var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        var12 = DungeonAssault.field_K;
        try {
          param3.field_H = vn.field_t / 100;
          if (param3.field_r >= 0 && (null == param3.field_v ||
            param3.field_v.f())) {
            param3.b(true);
            param3.a(false);
            if (param3.field_D > 0) {
              if (this.field_r[param3.field_p][param3.field_D] != param3) {
                return true;
              }
              this.field_r[param3.field_p][param3.field_D] = null;
            }
            return true;
          }
          var6_int = param3.field_w;
          if (0 < var6_int) {
            var6_int = var6_int - (int)(Math.pow(2.0, 0.0004921259842519685 * (double)this.field_s[param3.field_p]) * 16.0 + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param3.field_w = var6_int;
          }
          param3.field_v.g(this.a((byte) 119, param3));
          var7 = param3.field_A;
          param3.field_E = param3.field_E + var7.field_i;
          var8 = 0;
          param3.field_G = param3.field_G + 1;
          var9 = (double)((param3.field_J * param3.field_w >> 12) + (-60 + param3.field_y << 8)) * 0.000005086263020833333;
          if (0 < var7.field_c) {
            boolean decompiledSharedTail2 = !(0 >= var7.field_b);
            if (!decompiledSharedTail2) {
              param3.field_k = param3.field_k + 128;
              decompiledSharedTail2 = (var12 != 0);
            }
            if (decompiledSharedTail2) {
              param3.field_k = param3.field_k + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_b));
            }
            if (819200 <= param3.field_k * var7.field_c) {
              var8 = 1;
            }
          }
          if (var7.field_n != null) {
            boolean decompiledSharedTail1 = !(var7.field_e <= 0);
            if (!decompiledSharedTail1) {
              param3.field_u = param3.field_u + 128;
              decompiledSharedTail1 = (var12 != 0);
            }
            if (decompiledSharedTail1) {
              param3.field_u = param3.field_u + (int)(Math.pow(2.0, var9 * (double)var7.field_e) * 128.0 + 0.5);
            }
            while (true) {
              boolean decompiledFrameRemainder1 = true;
              if (param3.field_l < var7.field_n.length - 2) {
                stackIn_34_0 = ~param3.field_u;
                stackIn_34_1 = ~((var7.field_n[param3.field_l + 2] & 255) << 8);
                decompiledFrameRemainder1 = (var12 == 0);
                if ((decompiledFrameRemainder1) &&
                  (stackIn_34_0 < stackIn_34_1)) {
                  param3.field_l = param3.field_l + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder1) {
                stackIn_34_0 = var7.field_n.length - 2;
                stackIn_34_1 = param3.field_l;
              }
              if (stackIn_34_0 != stackIn_34_1) {
                break;
              }
              if (var7.field_n[1 + param3.field_l] != 0) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (param3.field_r >= 0 &&
            null != var7.field_o &&
            (1 & this.field_G[param3.field_p]) == 0 && (!(param3.field_D >= 0) ||
            this.field_r[param3.field_p][param3.field_D] != param3)) {
            boolean decompiledSharedTail0 = !(0 >= var7.field_m);
            if (!decompiledSharedTail0) {
              param3.field_r = param3.field_r + 128;
              decompiledSharedTail0 = (var12 != 0);
            }
            if (decompiledSharedTail0) {
              param3.field_r = param3.field_r + (int)(Math.pow(2.0, var9 * (double)var7.field_m) * 128.0 + 0.5);
            }
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var7.field_o.length - 2 > param3.field_j) {
                stackIn_53_0 = ~((var7.field_o[param3.field_j + 2] & 255) << 8);
                stackIn_53_1 = ~param3.field_r;
                decompiledFrameRemainder0 = (var12 == 0);
                if ((decompiledFrameRemainder0) &&
                  (stackIn_53_0 > stackIn_53_1)) {
                  param3.field_j = param3.field_j + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_53_0 = param3.field_j;
                stackIn_53_1 = var7.field_o.length - 2;
              }
              if (stackIn_53_0 != stackIn_53_1) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          var11 = -89 % ((param0 + 80) / 44);
          if (var8 == 0) {
            param3.field_v.a(param3.field_H, this.b(param3, 0), this.a(param3, false));
            return false;
          }
          param3.field_v.f(param3.field_H);
          if (param4 != null) {
            param3.field_v.b(param4, param1, param2);
            if (var12 != 0) {
              param3.field_v.a(param2);
            }
          } else {
            param3.field_v.a(param2);
          }
          if (param3.field_v.e()) {
            this.field_R.field_o.b(param3.field_v);
          }
          param3.b(true);
          if (param3.field_r >= 0) {
            param3.a(false);
            if (0 < param3.field_D &&
              this.field_r[param3.field_p][param3.field_D] == param3) {
              this.field_r[param3.field_p][param3.field_D] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_75_0 = var6;
          stackIn_75_1 = new StringBuilder().append("ug.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          stackIn_78_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',');
          if (param4 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1) {
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
        var8 = DungeonAssault.field_K;
        var3 = param0 & 240;
        if (var3 == 128) {
          var4 = 15 & param0;
          var5 = (32667 & param0) >> 8;
          var6 = (8372321 & param0) >> 16;
          this.a(true, var5, var4, var6);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = param0 & 15;
          var5Lifetime1 = param0 >> 8 & 127;
          var6Lifetime1 = (param0 & 8385741) >> 16;
          if (0 >= var6Lifetime1) {
            this.a(true, var5Lifetime1, var4Lifetime1, 64);
            if (var8 == 0) {
              return;
            }
          }
          this.b(var6Lifetime1, -29, var5Lifetime1, var4Lifetime1);
          return;
        }
        if (var3 == 160) {
          var4Lifetime2 = param0 & 15;
          var5Lifetime2 = (param0 & 32616) >> 8;
          var6Lifetime2 = param0 >> 16 & 127;
          this.a(var5Lifetime2, var6Lifetime2, var4Lifetime2, 73);
          return;
        }
        if (176 != var3) {
          if (var3 == 192) {
            var4Lifetime3 = 15 & param0;
            var5Lifetime3 = 127 & param0 >> 8;
            this.a((byte) 106, this.field_K[var4Lifetime3] + var5Lifetime3, var4Lifetime3);
            return;
          }
          if (param1 != 16384) {
            this.field_m = (int[]) null;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = param0 & 15;
            var5Lifetime3Lifetime1 = 127 & param0 >> 8;
            this.a(var5Lifetime3Lifetime1, (byte) 78, var4Lifetime3Lifetime1);
            return;
          }
          if (224 == var3) {
            var4Lifetime3Lifetime2 = param0 & 15;
            var5Lifetime3Lifetime2 = (param0 >> 9 & 16256) + ((32761 & param0) >> 8);
            this.a(false, var5Lifetime3Lifetime2, var4Lifetime3Lifetime2);
            return;
          }
          var3 = 255 & param0;
          if (var3 != 255) {
            return;
          }
          this.d(true, 16);
          return;
        }
        var4Lifetime4 = 15 & param0;
        var5Lifetime4 = param0 >> 8 & 127;
        var6Lifetime3 = (param0 & 8364021) >> 16;
        if (0 == var5Lifetime4) {
          this.field_K[var4Lifetime4] = (var6Lifetime3 << 14) + nb.a(this.field_K[var4Lifetime4], -2080769);
        }
        if (32 == var5Lifetime4) {
          this.field_K[var4Lifetime4] = (var6Lifetime3 << 7) + nb.a(this.field_K[var4Lifetime4], -16257);
        }
        if (1 == var5Lifetime4) {
          this.field_U[var4Lifetime4] = (var6Lifetime3 << 7) + nb.a(this.field_U[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 33) {
          this.field_U[var4Lifetime4] = nb.a(-128, this.field_U[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 5) {
          this.field_s[var4Lifetime4] = (var6Lifetime3 << 7) + nb.a(this.field_s[var4Lifetime4], -16257);
        }
        if (37 == var5Lifetime4) {
          this.field_s[var4Lifetime4] = var6Lifetime3 + nb.a(-128, this.field_s[var4Lifetime4]);
        }
        if (var5Lifetime4 == 7) {
          this.field_q[var4Lifetime4] = (var6Lifetime3 << 7) + nb.a(this.field_q[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 39) {
          this.field_q[var4Lifetime4] = nb.a(-128, this.field_q[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 10) {
          this.field_n[var4Lifetime4] = (var6Lifetime3 << 7) + nb.a(this.field_n[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 42) {
          this.field_n[var4Lifetime4] = var6Lifetime3 + nb.a(-128, this.field_n[var4Lifetime4]);
        }
        if (var5Lifetime4 == 11) {
          this.field_m[var4Lifetime4] = (var6Lifetime3 << 7) + nb.a(this.field_m[var4Lifetime4], -16257);
        }
        if (43 == var5Lifetime4) {
          this.field_m[var4Lifetime4] = var6Lifetime3 + nb.a(-128, this.field_m[var4Lifetime4]);
        }
        if (64 == var5Lifetime4) {
          if (var6Lifetime3 >= 64) {
            this.field_G[var4Lifetime4] = mp.a(this.field_G[var4Lifetime4], 1);
            if (var8 != 0) {
              this.field_G[var4Lifetime4] = nb.a(this.field_G[var4Lifetime4], -2);
            }
          } else {
            this.field_G[var4Lifetime4] = nb.a(this.field_G[var4Lifetime4], -2);
          }
        }
        if (var5Lifetime4 == 65) {
          if (64 <= var6Lifetime3) {
            this.field_G[var4Lifetime4] = mp.a(this.field_G[var4Lifetime4], 2);
            if (var8 != 0) {
              this.d(var4Lifetime4, -1);
              this.field_G[var4Lifetime4] = nb.a(this.field_G[var4Lifetime4], -3);
            }
          } else {
            this.d(var4Lifetime4, -1);
            this.field_G[var4Lifetime4] = nb.a(this.field_G[var4Lifetime4], -3);
          }
        }
        if (var5Lifetime4 == 99) {
          this.field_N[var4Lifetime4] = (var6Lifetime3 << 7) + nb.a(127, this.field_N[var4Lifetime4]);
        }
        if (var5Lifetime4 == 98) {
          this.field_N[var4Lifetime4] = nb.a(16256, this.field_N[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 101) {
          this.field_N[var4Lifetime4] = (var6Lifetime3 << 7) + 16384 + nb.a(this.field_N[var4Lifetime4], 127);
        }
        if (var5Lifetime4 == 100) {
          this.field_N[var4Lifetime4] = nb.a(this.field_N[var4Lifetime4], 16256) + (16384 + var6Lifetime3);
        }
        if (120 == var5Lifetime4) {
          this.a(var4Lifetime4, false);
        }
        if (121 == var5Lifetime4) {
          this.e(var4Lifetime4, 0);
        }
        if (var5Lifetime4 == 123) {
          this.b(true, var4Lifetime4);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.field_N[var4Lifetime4];
          if (var7 == 16384) {
            this.field_I[var4Lifetime4] = nb.a(-16257, this.field_I[var4Lifetime4]) + (var6Lifetime3 << 7);
          }
        }
        if (38 == var5Lifetime4) {
          var7Lifetime1 = this.field_N[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.field_I[var4Lifetime4] = nb.a(-128, this.field_I[var4Lifetime4]) + var6Lifetime3;
          }
        }
        if (var5Lifetime4 == 16) {
          this.field_o[var4Lifetime4] = nb.a(-16257, this.field_o[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 48) {
          this.field_o[var4Lifetime4] = nb.a(-128, this.field_o[var4Lifetime4]) + var6Lifetime3;
        }
        if (81 == var5Lifetime4) {
          if (var6Lifetime3 < 64) {
            this.f(var4Lifetime4, param1 ^ 16418);
            this.field_G[var4Lifetime4] = nb.a(this.field_G[var4Lifetime4], -5);
            if (var8 != 0) {
              this.field_G[var4Lifetime4] = mp.a(this.field_G[var4Lifetime4], 4);
            }
          } else {
            this.field_G[var4Lifetime4] = mp.a(this.field_G[var4Lifetime4], 4);
          }
        }
        if (var5Lifetime4 == 17) {
          this.a(2, (-16257 & this.field_O[var4Lifetime4]) + (var6Lifetime3 << 7), var4Lifetime4);
        }
        if (var5Lifetime4 == 49) {
          this.a(2, var6Lifetime3 + (this.field_O[var4Lifetime4] & -128), var4Lifetime4);
        }
    }

    final static int a(boolean param0, int param1) {
        if (!param0) {
          return 34;
        }
        if (65536L <= (long)param1) {
          if ((long)param1 >= 16777216L) {
            if ((long)param1 >= 268435456L) {
              if ((long)param1 < 1073741824L) {
                return lc.field_h[param1 >> 22] >> 1;
              }
              return lc.field_h[param1 >> 24];
            }
            if ((long)param1 >= 67108864L) {
              return lc.field_h[param1 >> 20] >> 2;
            }
            return lc.field_h[param1 >> 18] >> 3;
          }
          if ((long)param1 >= 1048576L) {
            if ((long)param1 < 4194304L) {
              return lc.field_h[param1 >> 14] >> 5;
            }
            return lc.field_h[param1 >> 16] >> 4;
          }
          if ((long)param1 < 262144L) {
            return lc.field_h[param1 >> 10] >> 7;
          }
          return lc.field_h[param1 >> 12] >> 6;
        }
        if (256L > (long)param1) {
          if (param1 < 0) {
            return -1;
          }
          return lc.field_h[param1] >> 12;
        }
        if ((long)param1 >= 4096L) {
          if ((long)param1 >= 16384L) {
            return lc.field_h[param1 >> 8] >> 8;
          }
          return lc.field_h[param1 >> 6] >> 9;
        }
        if ((long)param1 < 1024L) {
          return lc.field_h[param1 >> 2] >> 11;
        }
        return lc.field_h[param1 >> 4] >> 10;
    }

    private final int a(lp param0, boolean param1) {
        int discarded$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            discarded$1 = this.b((lp) null, 45);
          }
          var3_int = this.field_n[param0.field_p];
          if (var3_int >= 8192) {
            stackIn_6_0 = -((-param0.field_i + 128) * (-var3_int + 16384) + 32 >> 6) + 16384;
            return stackIn_6_0;
          }
          stackIn_4_0 = 32 + var3_int * param0.field_i >> 6;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ug.S(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void d(int param0, int param1) {
        lp var3;
        int var4;
        var4 = DungeonAssault.field_K;
        if (param1 != ~(this.field_G[param0] & 2)) {
          var3 = (lp) (this.field_R.field_q.e(-24172));
          while (var3 != null) {
            if (var4 != 0) {
              break;
            }
            if (param0 == var3.field_p &&
              this.field_u[param0][var3.field_y] == null &&
              var3.field_r < 0) {
              var3.field_r = 0;
            }
            var3 = (lp) (this.field_R.field_q.a(4));
          }
        }
    }

    final synchronized void b(int param0, int param1) {
        this.field_x = param0;
        if (param1 != 0) {
          this.a(true, -114, (vh) null, false);
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        boolean decompiledFrameCompleted0 = true;
        var6 = DungeonAssault.field_K;
        if (this.field_A.g()) {
          var2 = this.field_x * this.field_A.field_c / vn.field_t;
          while (true) {
            var3 = (long)param0 * (long)var2 + this.field_z;
            if (this.field_F - var3 >= 0L) {
              this.field_z = var3;
              if (var6 == 0) {
                break;
              }
            }
            var5 = (int)((-1L + (long)var2 + this.field_F - this.field_z) / (long)var2);
            this.field_z = this.field_z + (long)var5 * (long)var2;
            this.field_R.a(var5);
            param0 = param0 - var5;
            this.a((byte) -24);
            if (!this.field_A.g() &&
              var6 == 0) {
              break;
            }
            if (var6 == 0) {
              continue;
            }
            this.field_R.a(param0);
            decompiledFrameCompleted0 = false;
            break;
          }
        }
        if (decompiledFrameCompleted0) {
          this.field_R.a(param0);
        }

    }

    final synchronized boolean a(boolean param0, lc param1, nh param2, int param3, vh param4) {
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        mk var8 = null;
        int var9 = 0;
        kk var10 = null;
        int var11 = 0;
        var11 = DungeonAssault.field_K;
        try {
          param4.a();
          if (param0) {
            this.field_u = (lp[][]) null;
          }
          var6_int = 1;
          var7 = null;
          if (param3 > 0) {
            var7 = new int[]{param3};
          }
          var8 = (mk) (param4.field_j.a(true));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 == null))) {
            var9 = (int)var8.field_h;
            var10 = (kk) (this.field_W.a((long)var9, 8));
            if (var11 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (var10 == null) {
                var10 = dl.a((byte) 110, var9, param2);
                if (var10 == null) {
                  var6_int = 0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  this.field_W.a(var10, 12460, (long)var9);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (!var10.a((byte) 45, param1, (int[]) (var7), var8.field_k))) {
                var6_int = 0;
              }
              var8 = (mk) (param4.field_j.a(4318));
              continue;
            }
            break;
          }
          if ((decompiledNaturalLoopExit0) &&
            (var6_int != 0)) {
            param4.b();
          }
          stackIn_21_0 = var6_int;
          return stackIn_21_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_24_0 = var6;
          stackIn_24_1 = new StringBuilder().append("ug.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    private final int b(lp param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        of var9 = null;
        of var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.field_V[param0.field_p] == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var9 = param0.field_A;
          var10 = var9;
          var4 = 4096 + this.field_q[param0.field_p] * this.field_m[param0.field_p] >> 13;
          var4 = var4 * var4 + 16384 >> 15;
          var4 = 16384 + var4 * param0.field_t >> 15;
          var4 = var4 * this.field_L + 128 >> 8;
          var4 = this.field_V[param0.field_p] * var4 + 128 >> 8;
          if (var10.field_c > 0) {
            var4 = (int)(Math.pow(0.5, (double)param0.field_k * 0.00001953125 * (double)var10.field_c) * (double)var4 + 0.5);
          }
          if (null != var10.field_n) {
            var5 = param0.field_u;
            var6 = var10.field_n[param0.field_l + 1];
            if (param0.field_l < var10.field_n.length - 2) {
              var7 = 65280 & var9.field_n[param0.field_l] << 8;
              var8 = (255 & var10.field_n[2 + param0.field_l]) << 8;
              var6 = var6 + (-var6 + var10.field_n[3 + param0.field_l]) * (-var7 + var5) / (var8 - var7);
            }
            var4 = var6 * var4 + 32 >> 6;
          }
          if (param1 < param0.field_r &&
            null != var10.field_o) {
            var5Lifetime1 = param0.field_r;
            var6Lifetime1 = var10.field_o[1 + param0.field_j];
            if (param0.field_j < -2 + var10.field_o.length) {
              var7Lifetime1 = (255 & var9.field_o[param0.field_j]) << 8;
              var8Lifetime1 = (var10.field_o[param0.field_j + 2] & 255) << 8;
              var6Lifetime1 = var6Lifetime1 + (-var7Lifetime1 + var5Lifetime1) * (-var6Lifetime1 + var10.field_o[param0.field_j + 3]) / (var8Lifetime1 - var7Lifetime1);
            }
            var4 = var4 * var6Lifetime1 + 32 >> 6;
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("ug.BA(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(lp param0, int param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param0.field_I.field_k.length;
          boolean decompiledSharedTail0 = (!(param2) ||
            !(param0.field_I.field_j));
          if (!decompiledSharedTail0) {
            var6 = -param0.field_I.field_l + var4_int + var4_int;
            var5 = (int)((long)var6 * (long)this.field_o[param0.field_p] >> 6);
            var4_int = var4_int << 8;
            if (var5 >= var4_int) {
              param0.field_v.b(true);
              var5 = var4_int + var4_int - 1 - var5;
            }
            decompiledSharedTail0 = (DungeonAssault.field_K != 0);
          }
          if (decompiledSharedTail0) {
            var5 = (int)((long)var4_int * (long)this.field_o[param0.field_p] >> 6);
          }
          param0.field_v.i(var5);
          if (param1 != 4917) {
            this.a(false, (lc) null, (nh) null, 98, (vh) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("ug.IA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public ug() {
        this.field_L = 256;
        this.field_q = new int[16];
        this.field_u = new lp[16][128];
        this.field_O = new int[16];
        this.field_I = new int[16];
        this.field_K = new int[16];
        this.field_m = new int[16];
        this.field_x = 1000000;
        this.field_r = new lp[16][128];
        this.field_V = new int[16];
        this.field_J = new int[16];
        this.field_U = new int[16];
        this.field_Q = new int[16];
        this.field_N = new int[16];
        this.field_B = new int[16];
        this.field_s = new int[16];
        this.field_P = new int[16];
        this.field_n = new int[16];
        this.field_G = new int[16];
        this.field_o = new int[16];
        this.field_A = new vm();
        this.field_R = new hg(this);
        this.field_W = new wa(128);
        this.a(256, -1, (byte) -84);
        this.d(true, 16);
    }

    ug(ug param0) {
        this.field_L = 256;
        this.field_q = new int[16];
        this.field_u = new lp[16][128];
        this.field_O = new int[16];
        this.field_I = new int[16];
        this.field_K = new int[16];
        this.field_m = new int[16];
        this.field_x = 1000000;
        this.field_r = new lp[16][128];
        this.field_V = new int[16];
        this.field_J = new int[16];
        this.field_U = new int[16];
        this.field_Q = new int[16];
        this.field_N = new int[16];
        this.field_B = new int[16];
        this.field_s = new int[16];
        this.field_P = new int[16];
        this.field_n = new int[16];
        this.field_G = new int[16];
        this.field_o = new int[16];
        this.field_A = new vm();
        this.field_R = new hg(this);
        try {
          this.field_W = param0.field_W;
          this.a(256, -1, (byte) -63);
          this.d(true, 16);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "ug.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_E = rb.b(0, 0, 64);
        field_w = new fd(2);
        field_M = new String[]{"Hoard Room", "Well done! By reaching the <%highlight>hoard room</col> you have claimed possession of this dungeon. It is now yours to defend against other players. When you raid the dungeon of another player, their dragon will occupy this central tile instead, and you will have the opportunity to steal a portion of their Treasure and Renown.<br><br><%command>For now, end this game (by clicking Exit) and we will move on to Dungeon Construction.</col>"};
    }
}
