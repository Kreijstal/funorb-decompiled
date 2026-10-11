/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends lj {
    private int[] field_M;
    int[] field_q;
    private int[] field_C;
    private int[] field_N;
    private fk field_G;
    private int[] field_I;
    private il field_z;
    static pd field_Q;
    private int[] field_o;
    private int[] field_s;
    int[] field_S;
    private int[] field_F;
    private int[] field_A;
    private sh[][] field_O;
    private sh[][] field_J;
    static String field_y;
    private int[] field_n;
    private int field_l;
    private int[] field_u;
    private int field_P;
    int[] field_D;
    private int[] field_L;
    private int[] field_m;
    private int[] field_w;
    private long field_x;
    private int field_H;
    private vd field_t;
    private long field_r;
    private boolean field_p;
    private int field_E;
    private tk field_v;
    private int field_B;
    private boolean field_R;

    final synchronized void d(int param0) {
        int var3 = Terraphoenix.field_V;
        qd var4 = (qd) (this.field_z.a((byte) 117));
        while (var4 != null) {
          var4.d((byte) 39);
          var4 = (qd) (this.field_z.a(true));
        }
        if (param0 != -32499) {
          this.c();
        }
    }

    private final void b(int param0, int param1) {
        int discarded$0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        sh var9;
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
        var8 = Terraphoenix.field_V;
        if (param1 != -18) {
          var9 = (sh) null;
          discarded$0 = this.a((byte) 16, (sh) null);
        }
        var3 = 240 & param0;
        if (var3 == 128) {
          var4 = 15 & param0;
          var5 = 127 & param0 >> 8;
          var6 = param0 >> 16 & 127;
          this.a(var5, (byte) 117, var6, var4);
          return;
        }
        if (144 == var3) {
          var4Lifetime1 = param0 & 15;
          var5Lifetime1 = param0 >> 8 & 127;
          var6Lifetime1 = 127 & param0 >> 16;
          if (var6Lifetime1 > 0) {
            this.a(var6Lifetime1, var5Lifetime1, var4Lifetime1, (byte) 53);
          } else {
            this.a(var5Lifetime1, (byte) 121, 64, var4Lifetime1);
          }
          return;
        }
        if (var3 == 160) {
          var4Lifetime2 = 15 & param0;
          var5Lifetime2 = (32688 & param0) >> 8;
          var6Lifetime2 = (param0 & 8358526) >> 16;
          this.a(var6Lifetime2, var5Lifetime2, -16257, var4Lifetime2);
          return;
        }
        if (var3 != 176) {
          if (var3 == 192) {
            var4Lifetime3 = param0 & 15;
            var5Lifetime3 = param0 >> 8 & 127;
            this.a(var5Lifetime3 + this.field_u[var4Lifetime3], var4Lifetime3, (byte) 8);
            return;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = 15 & param0;
            var5Lifetime3Lifetime1 = (32679 & param0) >> 8;
            this.b(var5Lifetime3Lifetime1, 3, var4Lifetime3Lifetime1);
            return;
          }
          if (var3 == 224) {
            var4Lifetime3Lifetime2 = param0 & 15;
            var5Lifetime3Lifetime2 = ((8323556 & param0) >> 9) + (param0 >> 8 & 127);
            this.a(var4Lifetime3Lifetime2, var5Lifetime3Lifetime2, true);
            return;
          }
          var3 = 255 & param0;
          if (var3 != 255) {
            return;
          }
          this.a(true, param1 - 12484);
          return;
        }
        var4Lifetime4 = 15 & param0;
        var5Lifetime4 = (param0 & 32748) >> 8;
        var6Lifetime3 = param0 >> 16 & 127;
        if (0 == var5Lifetime4) {
          this.field_u[var4Lifetime4] = (var6Lifetime3 << 14) + dg.a(-2080769, this.field_u[var4Lifetime4]);
        }
        if (var5Lifetime4 == 32) {
          this.field_u[var4Lifetime4] = dg.a(-16257, this.field_u[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 1) {
          this.field_A[var4Lifetime4] = dg.a(-16257, this.field_A[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 33) {
          this.field_A[var4Lifetime4] = var6Lifetime3 + dg.a(this.field_A[var4Lifetime4], -128);
        }
        if (var5Lifetime4 == 5) {
          this.field_m[var4Lifetime4] = (var6Lifetime3 << 7) + dg.a(this.field_m[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 37) {
          this.field_m[var4Lifetime4] = var6Lifetime3 + dg.a(this.field_m[var4Lifetime4], -128);
        }
        if (7 == var5Lifetime4) {
          this.field_I[var4Lifetime4] = (var6Lifetime3 << 7) + dg.a(-16257, this.field_I[var4Lifetime4]);
        }
        if (var5Lifetime4 == 39) {
          this.field_I[var4Lifetime4] = var6Lifetime3 + dg.a(-128, this.field_I[var4Lifetime4]);
        }
        if (var5Lifetime4 == 10) {
          this.field_w[var4Lifetime4] = (var6Lifetime3 << 7) + dg.a(this.field_w[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 42) {
          this.field_w[var4Lifetime4] = var6Lifetime3 + dg.a(-128, this.field_w[var4Lifetime4]);
        }
        if (11 == var5Lifetime4) {
          this.field_N[var4Lifetime4] = (var6Lifetime3 << 7) + dg.a(this.field_N[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 43) {
          this.field_N[var4Lifetime4] = var6Lifetime3 + dg.a(this.field_N[var4Lifetime4], -128);
        }
        if (var5Lifetime4 == 64) {
          if (var6Lifetime3 < 64) {
            this.field_q[var4Lifetime4] = dg.a(this.field_q[var4Lifetime4], -2);
          } else {
            this.field_q[var4Lifetime4] = ei.b(this.field_q[var4Lifetime4], 1);
          }
        }
        if (var5Lifetime4 == 65) {
          if (var6Lifetime3 >= 64) {
            this.field_q[var4Lifetime4] = ei.b(this.field_q[var4Lifetime4], 2);
          } else {
            this.c(var4Lifetime4, 122);
            this.field_q[var4Lifetime4] = dg.a(this.field_q[var4Lifetime4], -3);
          }
        }
        if (var5Lifetime4 == 99) {
          this.field_M[var4Lifetime4] = dg.a(127, this.field_M[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 98) {
          this.field_M[var4Lifetime4] = var6Lifetime3 + dg.a(16256, this.field_M[var4Lifetime4]);
        }
        if (var5Lifetime4 == 101) {
          this.field_M[var4Lifetime4] = (var6Lifetime3 << 7) + (dg.a(127, this.field_M[var4Lifetime4]) + 16384);
        }
        if (var5Lifetime4 == 100) {
          this.field_M[var4Lifetime4] = var6Lifetime3 + (16384 + dg.a(16256, this.field_M[var4Lifetime4]));
        }
        if (var5Lifetime4 == 120) {
          this.b((byte) -125, var4Lifetime4);
        }
        if (121 == var5Lifetime4) {
          this.a((byte) 100, var4Lifetime4);
        }
        if (var5Lifetime4 == 123) {
          this.d(var4Lifetime4, param1 + 68);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.field_M[var4Lifetime4];
          if (16384 == var7) {
            this.field_n[var4Lifetime4] = dg.a(-16257, this.field_n[var4Lifetime4]) + (var6Lifetime3 << 7);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.field_M[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.field_n[var4Lifetime4] = dg.a(this.field_n[var4Lifetime4], -128) + var6Lifetime3;
          }
        }
        if (var5Lifetime4 == 16) {
          this.field_S[var4Lifetime4] = (var6Lifetime3 << 7) + dg.a(-16257, this.field_S[var4Lifetime4]);
        }
        if (var5Lifetime4 == 48) {
          this.field_S[var4Lifetime4] = var6Lifetime3 + dg.a(-128, this.field_S[var4Lifetime4]);
        }
        if (81 == var5Lifetime4) {
          if (var6Lifetime3 < 64) {
            this.a(var4Lifetime4, false);
            this.field_q[var4Lifetime4] = dg.a(this.field_q[var4Lifetime4], -5);
          } else {
            this.field_q[var4Lifetime4] = ei.b(this.field_q[var4Lifetime4], 4);
          }
        }
        if (var5Lifetime4 == 17) {
          this.a((byte) -81, var4Lifetime4, (this.field_L[var4Lifetime4] & -16257) + (var6Lifetime3 << 7));
        }
        if (49 == var5Lifetime4) {
          this.a((byte) -83, var4Lifetime4, (-128 & this.field_L[var4Lifetime4]) + var6Lifetime3);
        }
    }

    private final void d(int param0, int param1) {
        sh var3;
        int var4;
        var4 = Terraphoenix.field_V;
        if (param1 < 9) {
          return;
        }
        var3 = (sh) (this.field_t.field_n.d(9272));
        while (var3 != null) {
          if ((0 > param0 ||
            param0 == var3.field_v) &&
            var3.field_h < 0) {
            this.field_J[var3.field_v][var3.field_w] = null;
            var3.field_h = 0;
          }
          var3 = (sh) (this.field_t.field_n.e((byte) -119));
        }
    }

    final synchronized lj c() {
        return (lj) ((Object) this.field_t);
    }

    final synchronized void a(boolean param0, byte param1, tk param2) {
        try {
          this.a(param0, param2, true, 0);
          int var4_int = 46 / ((param1 - 83) / 41);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "wl.Q(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static ud a(fa param0, int param1, fa param2, int param3, int param4) {
        RuntimeException var5 = null;
        String var6 = null;
        ud stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 > -21) {
            var6 = (String) null;
            wl.a((java.net.URL) null, (String) null, (String) null, true, -103);
          }
          if (!vh.a(param1, param3, param2, true)) {
            return null;
          }
          stackIn_6_0 = fm.a(param0.b(param1, 127, param3), 38);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wl.J(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(boolean param0) {
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = Terraphoenix.field_V;
        var2 = this.field_H;
        var3 = this.field_E;
        var4 = this.field_r;
        if (null != this.field_v &&
          var3 == this.field_B) {
          this.a(this.field_p, this.field_v, this.field_R, 0);
          this.a(true);
          return;
        }
        while (true) {
          if (var3 != this.field_E) {
            if (!param0) {
              this.field_E = 104;
            }
            this.field_H = var2;
            this.field_r = var4;
            this.field_E = var3;
            if (this.field_v != null &&
              this.field_B < var3) {
              this.field_E = this.field_B;
              this.field_H = -1;
              this.field_r = this.field_G.b(this.field_E);
            }
            return;
          }
          while (var3 == this.field_G.field_c[var2]) {
            this.field_G.c(var2);
            var6 = this.field_G.f(var2);
            if (var6 != 1) {
              if (0 != (128 & var6)) {
                this.b(var6, -18);
              }
              this.field_G.a(var2);
              this.field_G.e(var2);
              continue;
            }
            this.field_G.d();
            this.field_G.e(var2);
            if (this.field_G.b()) {
              if (null != this.field_v) {
                this.a(this.field_p, (byte) 124, this.field_v);
                this.a(true);
                return;
              }
              if (this.field_p &&
                var3 != 0) {
                this.field_G.a(var4);
              } else {
                this.a(true, -12502);
                this.field_G.c();
                return;
              }
            }
            break;
          }
          var2 = this.field_G.f();
          var3 = this.field_G.field_c[var2];
          var4 = this.field_G.b(var3);
        }
    }

    private final void a(int param0, boolean param1) {
        sh var3 = null;
        int var4 = Terraphoenix.field_V;
        if (param1) {
          return;
        }
        if (0 != (4 & this.field_q[param0])) {
          var3 = (sh) (this.field_t.field_n.d(9272));
          while (var3 != null) {
            if (param0 == var3.field_v) {
              var3.field_A = 0;
            }
            var3 = (sh) (this.field_t.field_n.e((byte) -119));
          }
        }
    }

    final synchronized int d() {
        return 0;
    }

    private final void c(int param0, int param1) {
        sh var3_ref_sh;
        int var4;
        int var3;
        var4 = Terraphoenix.field_V;
        if ((2 & this.field_q[param0]) != 0) {
          var3_ref_sh = (sh) (this.field_t.field_n.d(9272));
          while (var3_ref_sh != null) {
            if (~param0 == ~var3_ref_sh.field_v) {
              if (this.field_J[param0][var3_ref_sh.field_w] != null) {
                var3_ref_sh = (sh) (this.field_t.field_n.e((byte) -119));
                continue;
              }
              if (var3_ref_sh.field_h < 0) {
                var3_ref_sh.field_h = 0;
              }
            }
            var3_ref_sh = (sh) (this.field_t.field_n.e((byte) -119));
          }
        }
        var3 = 115 / ((55 - param1) / 56);
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Terraphoenix.field_V;
        try {
          if (this.field_G.e()) {
            var4_int = this.field_l * this.field_G.field_e / nk.field_u;
            while (true) {
              var5 = this.field_x + (long)param2 * (long)var4_int;
              if (-var5 + this.field_r < 0L) {
                var7 = (int)((this.field_r - this.field_x - (-(long)var4_int + 1L)) / (long)var4_int);
                this.field_x = this.field_x + (long)var7 * (long)var4_int;
                this.field_t.a(param0, param1, var7);
                param1 = param1 + var7;
                this.a(true);
                param2 = param2 - var7;
                if (this.field_G.e()) {
                  continue;
                }
              } else {
                this.field_x = var5;
              }
              break;
            }
            this.field_t.a(param0, param1, param2);
            return;
          }
          this.field_t.a(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("wl.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param2 != -16257) {
          this.a(111, 117, (byte) -26);
        }
    }

    private final void b(byte param0, int param1) {
        int var4 = Terraphoenix.field_V;
        sh var3 = (sh) (this.field_t.field_n.d(9272));
        while (var3 != null) {
          if (param1 < 0 ||
            param1 == var3.field_v) {
            if (null != var3.field_k) {
              var3.field_k.c(nk.field_u / 100);
              if (var3.field_k.k()) {
                this.field_t.field_m.a(var3.field_k);
              }
              var3.c((byte) -111);
            }
            if (var3.field_h < 0) {
              this.field_J[var3.field_v][var3.field_w] = null;
            }
            var3.b((byte) 12);
          }
          var3 = (sh) (this.field_t.field_n.e((byte) -119));
        }
        if (param0 > -111) {
          this.field_M = (int[]) null;
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        boolean stackIn_17_1 = false;
        sh var5;
        qd var5_ref;
        int var6;
        gg var7;
        sh var8;
        sh var9;
        int var10;
        qd var11;
        qd var12;
        int var6Lifetime1;
        var10 = Terraphoenix.field_V;
        this.a(param1, (byte) 119, 64, param2);
        if ((2 & this.field_q[param2]) != 0) {
          var5 = (sh) (this.field_t.field_n.c((byte) -81));
          while (var5 != null) {
            if (param2 == var5.field_v &&
              var5.field_h < 0) {
              this.field_J[param2][var5.field_w] = null;
              this.field_J[param2][param1] = var5;
              var6 = var5.field_j + (var5.field_D * var5.field_u >> 12);
              var5.field_j = var5.field_j + (-var5.field_w + param1 << 8);
              var5.field_u = 4096;
              var5.field_w = param1;
              var5.field_D = -var5.field_j + var6;
              return;
            }
            var5 = (sh) (this.field_t.field_n.b(-87));
          }
        }
        var11 = (qd) (this.field_z.a((byte) 46, (long)this.field_s[param2]));
        var12 = var11;
        var5_ref = var12;
        if (var12 == null) {
          return;
        }
        var6Lifetime1 = 23 / ((-44 - param3) / 52);
        var7 = var11.field_n[param1];
        if (var7 == null) {
          return;
        }
        var8 = new sh();
        var8.field_B = var12;
        var8.field_v = param2;
        var8.field_F = var7;
        var8.field_m = var11.field_q[param1];
        var8.field_C = var11.field_m[param1];
        var8.field_w = param1;
        var8.field_s = 1024 + param0 * param0 * (var11.field_k * var11.field_s[param1]) >> 11;
        var8.field_p = 255 & var11.field_r[param1];
        var8.field_j = -(var11.field_p[param1] & 32767) + (param1 << 8);
        var8.field_i = 0;
        var8.field_t = 0;
        var8.field_o = 0;
        var8.field_G = 0;
        var8.field_h = -1;
        if (this.field_S[param2] == 0) {
          var8.field_k = lh.a(var7, this.a((byte) 92, var8), this.a(var8, (byte) -49), this.a(true, var8));
        } else {
          var8.field_k = lh.a(var7, this.a((byte) 78, var8), 0, this.a(true, var8));
          stackIn_17_1 = !(var11.field_p[param1] >= 0);
          this.a(stackIn_17_1, var8, 120);
        }
        if (var11.field_p[param1] < 0) {
          var8.field_k.g(-1);
        }
        if (var8.field_C >= 0) {
          var9 = this.field_O[param2][var8.field_C];
          if (var9 != null &&
            var9.field_h < 0) {
            this.field_J[param2][var9.field_w] = null;
            var9.field_h = 0;
          }
          this.field_O[param2][var8.field_C] = var8;
        }
        this.field_t.field_n.a(var8, -16611);
        this.field_J[param2][param1] = var8;
        return;
    }

    private final synchronized void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = Terraphoenix.field_V;
        if (!param1) {
          this.a(80, -97, true);
        }
        if (param0 < 0) {
          for (var4 = 0; var4 < 16; var4++) {
            this.field_C[var4] = param2;
          }
        } else {
          this.field_C[param0] = param2;
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var6;
        int var5;
        boolean decompiledFrameRemainder0 = true;
        var6 = Terraphoenix.field_V;
        if (this.field_G.e()) {
          var2 = this.field_G.field_e * this.field_l / nk.field_u;
          while (true) {
            var3 = (long)param0 * (long)var2 + this.field_x;
            if (0L <= this.field_r - var3) {
              this.field_x = var3;
            } else {
              var5 = (int)(((long)var2 - this.field_x + (this.field_r - 1L)) / (long)var2);
              this.field_x = this.field_x + (long)var5 * (long)var2;
              this.field_t.a(var5);
              param0 = param0 - var5;
              this.a(true);
              if (this.field_G.e()) {
                continue;
              }
            }
            break;
          }
          this.field_t.a(param0);
          decompiledFrameRemainder0 = false;
        }
        else {
          this.field_t.a(param0);
        }

    }

    private final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = Terraphoenix.field_V;
        if (param2 != 8) {
          this.a((byte) -97, -97, 22);
        }
        if (this.field_s[param1] != param0) {
          this.field_s[param1] = param0;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_O[param1][var4] = null;
          }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        this.field_L[param1] = param2;
        this.field_D[param1] = (int)(Math.pow(2.0, (double)param2 * 0.00054931640625) * 2097152.0 + 0.5);
        if (param0 > -15) {
          this.a(false);
        }
    }

    private final int a(boolean param0, sh param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            var4 = (String) null;
            wl.a((java.net.URL) null, (String) null, (String) null, true, 17);
          }
          var3_int = this.field_w[param1.field_v];
          if (8192 > var3_int) {
            stackIn_6_0 = 32 + param1.field_p * var3_int >> 6;
            return stackIn_6_0;
          }
          stackIn_4_0 = -(32 + (128 - param1.field_p) * (16384 - var3_int) >> 6) + 16384;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("wl.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static int a(boolean param0, CharSequence param1, boolean param2, int param3) {
        int var8 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Terraphoenix.field_V;
        try {
          if (param3 >= 2 &&
            36 >= param3) {
            var4_int = 0;
            var5 = param2 ? 1 : 0;
            var6 = 0;
            var7 = param1.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param1.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param0))) {
                if (48 <= var9 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  90 >= var9) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  122 >= var9) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (param3 <= var9) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = param3 * var6 + var9;
                if (var10 / param3 != var6) {
                  throw new NumberFormatException();
                }
                var5 = 1;
                var6 = var10;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_37_0 = var6;
            return stackIn_37_0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_40_0 = var4;
          stackIn_40_1 = new StringBuilder().append("wl.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(byte param0, int[] param1, int param2, sh param3, int param4) {
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        gm var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = Terraphoenix.field_V;
        try {
          param3.field_y = nk.field_u / 100;
          if (0 <= param3.field_h && (null == param3.field_k ||
            param3.field_k.i())) {
            param3.c((byte) -120);
            param3.b((byte) 12);
            if (param3.field_C > 0) {
              if (param3 != this.field_O[param3.field_v][param3.field_C]) {
                return true;
              }
              this.field_O[param3.field_v][param3.field_C] = null;
            }
            return true;
          }
          if (param0 < 76) {
            return false;
          }
          var6_int = param3.field_u;
          if (0 < var6_int) {
            var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, (double)this.field_m[param3.field_v] * 0.0004921259842519685));
            if (var6_int < 0) {
              var6_int = 0;
            }
            param3.field_u = var6_int;
          }
          param3.field_k.f(this.a((byte) 72, param3));
          var7 = param3.field_m;
          var8 = 0;
          param3.field_l = param3.field_l + 1;
          param3.field_r = param3.field_r + var7.field_d;
          var9 = 0.000005086263020833333 * (double)((-60 + param3.field_w << 8) + (param3.field_D * param3.field_u >> 12));
          if (var7.field_i > 0) {
            if (var7.field_e <= 0) {
              param3.field_o = param3.field_o + 128;
            } else {
              param3.field_o = param3.field_o + (int)(Math.pow(2.0, var9 * (double)var7.field_e) * 128.0 + 0.5);
            }
            if (var7.field_i * param3.field_o >= 819200) {
              var8 = 1;
            }
          }
          if (var7.field_h != null) {
            if (var7.field_b <= 0) {
              param3.field_i = param3.field_i + 128;
            } else {
              param3.field_i = param3.field_i + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_b * var9));
            }
            while (var7.field_h.length - 2 > param3.field_G) {
              if ((var7.field_h[2 + param3.field_G] & 255) << 8 < param3.field_i) {
                param3.field_G = param3.field_G + 2;
                continue;
              }
              break;
            }
            if (param3.field_G == var7.field_h.length - 2 &&
              var7.field_h[param3.field_G + 1] == 0) {
              var8 = 1;
            }
          }
          if (param3.field_h >= 0 &&
            null != var7.field_g &&
            (this.field_q[param3.field_v] & 1) == 0 && (!(param3.field_C >= 0) ||
            this.field_O[param3.field_v][param3.field_C] != param3)) {
            if (var7.field_k > 0) {
              param3.field_h = param3.field_h + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_k) * 128.0);
            } else {
              param3.field_h = param3.field_h + 128;
            }
            while (param3.field_t < var7.field_g.length - 2) {
              if (param3.field_h > ((255 & var7.field_g[param3.field_t + 2]) << 8)) {
                param3.field_t = param3.field_t + 2;
                continue;
              }
              break;
            }
            if (var7.field_g.length - 2 == param3.field_t) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param3.field_k.a(param3.field_y, this.a(param3, (byte) -49), this.a(true, param3));
            return false;
          }
          param3.field_k.c(param3.field_y);
          if (param1 == null) {
            param3.field_k.a(param2);
          } else {
            param3.field_k.a(param1, param4, param2);
          }
          if (param3.field_k.k()) {
            this.field_t.field_m.a(param3.field_k);
          }
          param3.c((byte) -120);
          if (0 <= param3.field_h) {
            param3.b((byte) 12);
            if (param3.field_C > 0 &&
              this.field_O[param3.field_v][param3.field_C] == param3) {
              this.field_O[param3.field_v][param3.field_C] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_70_0 = var6;
          stackIn_70_1 = new StringBuilder().append("wl.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_y = null;
        if (param0 <= 40) {
          CharSequence var2 = (CharSequence) null;
          wl.a(true, (CharSequence) null, true, -55);
        }
        field_Q = null;
    }

    final synchronized lj a() {
        return null;
    }

    final void a(boolean param0, sh param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 < 91) {
            this.field_S = (int[]) null;
          }
          var4_int = param1.field_F.field_k.length;
          if (param0 &&
            param1.field_F.field_i) {
            var6 = -param1.field_F.field_j + var4_int + var4_int;
            var4_int = var4_int << 8;
            var5 = (int)((long)this.field_S[param1.field_v] * (long)var6 >> 6);
            if (var5 >= var4_int) {
              param1.field_k.a(true);
              var5 = -var5 + (-1 + (var4_int + var4_int));
            }
          } else {
            var5 = (int)((long)var4_int * (long)this.field_S[param1.field_v] >> 6);
          }
          param1.field_k.d(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("wl.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = -19 % ((param1 + 81) / 36);
    }

    private final synchronized void a(boolean param0, tk param1, boolean param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = Terraphoenix.field_V;
        try {
          this.a(param2, (byte) 92);
          this.field_G.a(param1.field_i);
          this.field_x = 0L;
          this.field_p = param0 ? true : false;
          var5_int = this.field_G.g();
          for (var6 = param3; var5_int > var6; var6++) {
            this.field_G.c(var6);
            this.field_G.a(var6);
            this.field_G.e(var6);
          }
          this.field_H = this.field_G.f();
          this.field_E = this.field_G.field_c[this.field_H];
          this.field_r = this.field_G.b(this.field_E);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "wl.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(sh param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gm var9 = null;
        gm var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (this.field_C[param0.field_v] == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var9 = param0.field_m;
          var10 = var9;
          var4 = this.field_I[param0.field_v] * this.field_N[param0.field_v] + 4096 >> 13;
          var4 = var4 * var4 + 16384 >> 15;
          if (param1 != -49) {
            stackIn_6_0 = 2;
            return stackIn_6_0;
          }
          var4 = 16384 + param0.field_s * var4 >> 15;
          var4 = var4 * this.field_P + 128 >> 8;
          var4 = 128 + this.field_C[param0.field_v] * var4 >> 8;
          if (0 < var10.field_i) {
            var4 = (int)(0.5 + Math.pow(0.5, (double)var10.field_i * (0.00001953125 * (double)param0.field_o)) * (double)var4);
          }
          if (var10.field_h != null) {
            var5 = param0.field_i;
            var6 = var10.field_h[1 + param0.field_G];
            if (var10.field_h.length - 2 > param0.field_G) {
              var7 = (255 & var9.field_h[param0.field_G]) << 8;
              var8 = (255 & var10.field_h[2 + param0.field_G]) << 8;
              var6 = var6 + (-var6 + var10.field_h[param0.field_G + 3]) * (var5 - var7) / (var8 - var7);
            }
            var4 = var6 * var4 + 32 >> 6;
          }
          if (0 < param0.field_h &&
            null != var10.field_g) {
            var5Lifetime1 = param0.field_h;
            var6Lifetime1 = var10.field_g[param0.field_t + 1];
            if (var10.field_g.length - 2 > param0.field_t) {
              var7Lifetime1 = (var9.field_g[param0.field_t] & 255) << 8;
              var8Lifetime1 = 65280 & var10.field_g[2 + param0.field_t] << 8;
              var6Lifetime1 = var6Lifetime1 + (var5Lifetime1 - var7Lifetime1) * (-var6Lifetime1 + var10.field_g[3 + param0.field_t]) / (var8Lifetime1 - var7Lifetime1);
            }
            var4 = var4 * var6Lifetime1 + 32 >> 6;
          }
          stackIn_23_0 = var4;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("wl.PA(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final static java.net.URL a(java.net.URL param0, String param1, String param2, boolean param3, int param4) {
        try {
          StringBuilder discarded$0 = null;
          StringBuilder discarded$1 = null;
          StringBuilder discarded$2 = null;
          StringBuilder discarded$3 = null;
          StringBuilder discarded$4 = null;
          StringBuilder discarded$5 = null;
          StringBuilder discarded$6 = null;
          StringBuilder discarded$7 = null;
          StringBuilder discarded$8 = null;
          java.net.URL stackIn_42_0 = null;
          java.net.URL stackIn_44_0 = null;
          java.net.URL stackIn_46_0 = null;
          RuntimeException stackIn_49_0 = null;
          StringBuilder stackIn_49_1 = null;
          String stackIn_50_2 = null;
          StringBuilder stackIn_52_1 = null;
          String stackIn_53_2 = null;
          StringBuilder stackIn_55_1 = null;
          String stackIn_56_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          var9 = Terraphoenix.field_V;
          try {
            var5 = param0.getFile();
            var6 = 0;
            while (true) {
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', 1 + var6);
                if (var7_int >= 0) {
                  if (param4 >= 0) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                  var6 = var7_int;
                  continue;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/a=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                decompiledFrameRemainder0 = !(var7_int >= 0);
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/p=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if ((var7_int >= 0) &&
                    (decompiledFrameRemainder0 = (param2 != null))) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (var5.regionMatches(var6, "/s=", 0, 3) ||
                    var5.regionMatches(var6, "/c=", 0, 3)) {
                    var7_int = var5.indexOf('/', var6 + 1);
                    if (0 <= var7_int) {
                      if (param1 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue;
                      }
                      var6 = var7_int;
                      continue;
                    }
                  }
                  var7 = new StringBuilder(var6);
                  discarded$0 = var7.append(var5.substring(0, var6));
                  if (param4 > 0) {
                    discarded$1 = var7.append("/l=");
                    discarded$2 = var7.append(Integer.toString(param4));
                  }
                  if (param2 != null &&
                    param2.length() > 0) {
                    discarded$3 = var7.append("/p=");
                    discarded$4 = var7.append(param2);
                  }
                  if (param1 != null &&
                    param1.length() > 0) {
                    discarded$5 = var7.append("/s=");
                    discarded$6 = var7.append(param1);
                  }
                  if (var6 >= var5.length()) {
                    discarded$7 = var7.append('/');
                  } else {
                    discarded$8 = var7.append(var5.substring(var6, var5.length()));
                  }
                  if (param3) {
                    stackIn_42_0 = (java.net.URL) null;
                    return stackIn_42_0;
                  }
                  try {
                    stackIn_44_0 = new java.net.URL(param0, var7.toString());
                    return stackIn_44_0;
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackIn_46_0 = (java.net.URL) (param0);
                    return stackIn_46_0;
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_49_0 = var5_ref;
            stackIn_49_1 = new StringBuilder().append("wl.HA(");
            if (param0 == null) {
              stackIn_50_2 = "null";
            } else {
              stackIn_50_2 = "{...}";
            }
            stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',');
            if (param1 == null) {
              stackIn_53_2 = "null";
            } else {
              stackIn_53_2 = "{...}";
            }
            stackIn_55_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',');
            if (param2 == null) {
              stackIn_56_2 = "null";
            } else {
              stackIn_56_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = Terraphoenix.field_V;
        int var3Lifetime1;
        if (param0) {
          this.b((byte) -127, -1);
        } else {
          this.d(-1, param1 + 12574);
        }
        this.a((byte) 100, -1);
        for (var3 = 0; 16 > var3; var3++) {
          this.field_s[var3] = this.field_o[var3];
        }
        if (param1 != -12502) {
          this.a(0, -41, 111);
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < 16) {
          this.field_u[var5] = dg.a(-128, this.field_o[var5]);
          var5++;
        }
    }

    private final void a(byte param0, int param1) {
        int var4;
        var4 = Terraphoenix.field_V;
        if (param0 != 100) {
          this.field_C = (int[]) null;
        }
        if (param1 < 0) {
          for (param1 = 0; 16 > param1; param1++) {
            this.a((byte) 100, param1);
          }
        } else {
          this.field_I[param1] = 12800;
          this.field_w[param1] = 8192;
          this.field_N[param1] = 16383;
          this.field_F[param1] = 8192;
          this.field_A[param1] = 0;
          this.field_m[param1] = 8192;
          this.c(param1, 117);
          this.a(param1, false);
          this.field_q[param1] = 0;
          this.field_M[param1] = 32767;
          this.field_n[param1] = 256;
          this.field_S[param1] = 0;
          this.a((byte) -55, param1, 8192);
        }
    }

    final boolean a(sh param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 16384) {
            this.field_F = (int[]) null;
          }
          if (param0.field_k != null) {
            return false;
          }
          if (param0.field_h < 0) {
            return true;
          }
          param0.b((byte) 12);
          if (0 < param0.field_C &&
            param0 == this.field_O[param0.field_v][param0.field_C]) {
            this.field_O[param0.field_v][param0.field_C] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("wl.R(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized void a(boolean param0, byte param1) {
        this.field_G.c();
        this.field_v = null;
        this.a(param0, -12502);
        if (param1 <= 73) {
          this.field_l = 42;
        }
    }

    private final int a(byte param0, sh param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        gm var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          if (param0 < 59) {
            this.d();
          }
          var3_int = param1.field_j + (param1.field_u * param1.field_D >> 12);
          var3_int = var3_int + (this.field_n[param1.field_v] * (this.field_F[param1.field_v] - 8192) >> 12);
          var4 = param1.field_m;
          if (0 < var4.field_d && (!(var4.field_m <= 0) ||
            this.field_A[param1.field_v] > 0)) {
            var5 = var4.field_m << 2;
            var6 = var4.field_c << 1;
            if (param1.field_l < var6) {
              var5 = var5 * param1.field_l / var6;
            }
            var5 = var5 + (this.field_A[param1.field_v] >> 7);
            var7 = Math.sin(0.01227184630308513 * (double)(param1.field_r & 511));
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          var5Lifetime1 = (int)(0.5 + (double)(256 * param1.field_F.field_l) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)nk.field_u);
          stackIn_13_0 = (1 > var5Lifetime1) ? 1 : var5Lifetime1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("wl.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final synchronized boolean a(fa param0, da param1, tk param2, int param3, int param4) {
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        sb var8 = null;
        int var9 = 0;
        int var11 = 0;
        qd var12 = null;
        qd var13 = null;
        var11 = Terraphoenix.field_V;
        try {
          param2.a();
          var6_int = 1;
          var7 = null;
          if (0 < param4) {
            var7 = new int[]{param4};
          }
          if (param3 != 128) {
            this.a(true, (byte) -20);
          }
          var8 = (sb) (param2.field_h.a((byte) 117));
          while (var8 != null) {
            var9 = (int)var8.field_g;
            var12 = (qd) (this.field_z.a((byte) 46, (long)var9));
            if (var12 == null) {
              var13 = kf.a(var9, (byte) 122, param0);
              if (var13 == null) {
                var6_int = 0;
              } else {
                this.field_z.a(var13, (long)var9, (byte) -81);
                if (!var13.a(var8.field_o, (int[]) (var7), 0, param1)) {
                  var6_int = 0;
                }
              }
            } else {
              if (!var12.a(var8.field_o, (int[]) (var7), 0, param1)) {
                var6_int = 0;
                var8 = (sb) (param2.field_h.a(true));
                continue;
              }
            }
            var8 = (sb) (param2.field_h.a(true));
          }
          if (var6_int != 0) {
            param2.b();
          }
          stackIn_20_0 = var6_int;
          return stackIn_20_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("wl.K(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void c(int param0, int param1, int param2) {
        this.field_o[param0] = param1;
        this.field_u[param0] = dg.a(-128, param1);
        if (param2 != -5368) {
          return;
        }
        this.a(param1, param0, (byte) 8);
    }

    final synchronized boolean c(int param0) {
        if (param0 >= -90) {
          tk var3 = (tk) null;
          this.a(true, (tk) null, false, 78);
        }
        return this.field_G.e();
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        sh var7 = null;
        int var8 = Terraphoenix.field_V;
        sh var9 = this.field_J[param3][param0];
        if (var9 == null) {
          return;
        }
        this.field_J[param3][param0] = null;
        int var6 = 37 / ((param1 - 40) / 61);
        if ((2 & this.field_q[param3]) == 0) {
          var9.field_h = 0;
        } else {
          var7 = (sh) (this.field_t.field_n.d(9272));
          while (var7 != null) {
            if (var7.field_v == var9.field_v &&
              var7.field_h < 0 &&
              var7 != var9) {
              var9.field_h = 0;
              break;
            }
            var7 = (sh) (this.field_t.field_n.e((byte) -119));
          }
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        if (!param2) {
          this.b(-80, -105);
        }
        this.field_F[param0] = param1;
    }

    final synchronized void e(int param0, int param1) {
        if (param1 >= -83) {
          return;
        }
        this.field_P = param0;
    }

    final synchronized void a(int param0, int param1, int param2) {
        this.c(param0, param1, -5368);
        if (param2 > -8) {
          this.c(-93, 57);
        }
    }

    public wl() {
        this.field_q = new int[16];
        this.field_S = new int[16];
        this.field_N = new int[16];
        this.field_A = new int[16];
        this.field_F = new int[16];
        this.field_l = 1000000;
        this.field_O = new sh[16][128];
        this.field_s = new int[16];
        this.field_n = new int[16];
        this.field_C = new int[16];
        this.field_I = new int[16];
        this.field_J = new sh[16][128];
        this.field_M = new int[16];
        this.field_L = new int[16];
        this.field_P = 256;
        this.field_m = new int[16];
        this.field_D = new int[16];
        this.field_u = new int[16];
        this.field_o = new int[16];
        this.field_w = new int[16];
        this.field_G = new fk();
        this.field_t = new vd(this);
        this.field_z = new il(128);
        this.a(-1, true, 256);
        this.a(true, -12502);
    }

    static {
        field_y = "HC-3 FG";
    }
}
