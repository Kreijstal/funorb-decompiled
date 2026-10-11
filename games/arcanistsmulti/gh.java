/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends sg {
    private int[] field_p;
    private int[] field_R;
    static oc field_D;
    private int[] field_J;
    private int[] field_k;
    private int[] field_q;
    private int[] field_B;
    private o[][] field_A;
    private int field_r;
    private o[][] field_m;
    int[] field_s;
    private int[] field_S;
    private di field_F;
    private en field_N;
    int[] field_Q;
    private int field_v;
    int[] field_H;
    private int[] field_V;
    private int[] field_x;
    private int[] field_n;
    static byte[] field_E;
    static String field_O;
    private int[] field_P;
    private int[] field_I;
    private int[] field_y;
    static oc field_L;
    static int[] field_l;
    static String field_z;
    static String field_o;
    private long field_T;
    private long field_t;
    private hk field_G;
    private int field_U;
    private int field_K;
    private boolean field_u;
    private ha field_C;
    private boolean field_M;
    private int field_w;

    private final void a(int param0, int param1) {
        o var3;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != 0) {
          return;
        }
        var3 = (o) (this.field_G.field_l.b(param1 ^ 12623));
        while (var3 != null) {
          if (param0 < 0 ||
            param0 == var3.field_H) {
            if (null != var3.field_n) {
              var3.field_n.d(lb.field_r / 100);
              if (var3.field_n.h()) {
                this.field_G.field_n.b(var3.field_n);
              }
              var3.b(true);
            }
            if (var3.field_y < 0) {
              this.field_A[var3.field_H][var3.field_t] = null;
            }
            var3.a(true);
          }
          var3 = (o) (this.field_G.field_l.a(0));
        }
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != -66) {
          gh.d((byte) 98);
        }
        this.field_v = param0;
    }

    private final void e(int param0, int param1) {
        o var4 = null;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        int var3 = 118 % ((40 - param1) / 57);
        if ((this.field_Q[param0] & 4) != 0) {
          var4 = (o) (this.field_G.field_l.b(12623));
          while (var4 != null) {
            if (var4.field_H == param0) {
              var4.field_l = 0;
            }
            var4 = (o) (this.field_G.field_l.a(0));
          }
        }
    }

    private final void f(byte param0) {
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        int var6Lifetime1;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = this.field_U;
        var3 = this.field_K;
        var4 = this.field_t;
        if (this.field_C != null &&
          var3 == this.field_w) {
          this.a(-93, this.field_u, this.field_C, this.field_M);
          this.f((byte) 29);
          return;
        }
        while (true) {
          if (this.field_K != var3) {
            this.field_K = var3;
            this.field_t = var4;
            this.field_U = var2;
            if (null != this.field_C &&
              this.field_w < var3) {
              this.field_U = -1;
              this.field_K = this.field_w;
              this.field_t = this.field_N.b(this.field_K);
            }
            var6 = 62 / ((-75 - param0) / 48);
            return;
          }
          while (~this.field_N.field_d[var2] == ~var3) {
            this.field_N.f(var2);
            var6Lifetime1 = this.field_N.d(var2);
            if (var6Lifetime1 != 1) {
              if ((var6Lifetime1 & 128) != 0) {
                this.b(27257, var6Lifetime1);
              }
              this.field_N.a(var2);
              this.field_N.c(var2);
              continue;
            }
            this.field_N.g();
            this.field_N.c(var2);
            if (this.field_N.f()) {
              if (null != this.field_C) {
                this.a((byte) -96, this.field_u, this.field_C);
                this.f((byte) 124);
                return;
              }
              if (this.field_u &&
                var3 != 0) {
                this.field_N.a(var4);
              } else {
                this.a((byte) -120, true);
                this.field_N.c();
                return;
              }
            }
            break;
          }
          var2 = this.field_N.a();
          var3 = this.field_N.field_d[var2];
          var4 = this.field_N.b(var3);
        }
    }

    final synchronized boolean e(byte param0) {
        if (param0 != -8) {
          this.field_v = 62;
        }
        return this.field_N.e();
    }

    private final int b(int param0, o param1) {
        int stackIn_2_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ba var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = param1.field_I + (param1.field_i * param1.field_B >> 12);
          if (param0 >= -105) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var3_int = var3_int + ((this.field_x[param1.field_H] - 8192) * this.field_J[param1.field_H] >> 12);
          var4 = param1.field_x;
          if (var4.field_e > 0 && (!(var4.field_j <= 0) ||
            this.field_I[param1.field_H] > 0)) {
            var5 = var4.field_j << 2;
            var6 = var4.field_d << 1;
            if (var6 > param1.field_z) {
              var5 = param1.field_z * var5 / var6;
            }
            var5 = var5 + (this.field_I[param1.field_H] >> 7);
            var7 = Math.sin((double)(511 & param1.field_w) * 0.01227184630308513);
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          var5Lifetime1 = (int)(0.5 + (double)(param1.field_m.field_l * 256) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)lb.field_r);
          stackIn_13_0 = (var5Lifetime1 < 1) ? 1 : var5Lifetime1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("gh.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final synchronized void a(byte param0) {
        if (param0 > -103) {
          return;
        }
        this.a(true, false);
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
          java.applet.Applet var6 = (java.applet.Applet) null;
          gh.a(3, (java.applet.Applet) null);
        }
    }

    final synchronized void c(int param0) {
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 <= 119) {
          return;
        }
        fg var4 = (fg) (this.field_F.a(10));
        while (var4 != null) {
          var4.a(23257);
          var4 = (fg) (this.field_F.c(-64));
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int stackIn_19_1 = 0;
        boolean stackIn_20_2 = false;
        o var5;
        int var6_int;
        wf var6;
        o var7;
        o var8;
        int var9;
        java.applet.Applet var10;
        fg var11;
        fg var12;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        this.a(false, param0, 64, param2);
        if (0 != (2 & this.field_Q[param0])) {
          var5 = (o) (this.field_G.field_l.a(true));
          while (var5 != null) {
            if (param0 == var5.field_H &&
              var5.field_y < 0) {
              this.field_A[param0][var5.field_t] = null;
              this.field_A[param0][param2] = var5;
              var6_int = var5.field_I + (var5.field_i * var5.field_B >> 12);
              var5.field_I = var5.field_I + (param2 - var5.field_t << 8);
              var5.field_B = 4096;
              var5.field_i = var6_int - var5.field_I;
              var5.field_t = param2;
              return;
            }
            var5 = (o) (this.field_G.field_l.b((byte) 48));
          }
        }
        var11 = (fg) (this.field_F.a((long)this.field_q[param0], -74));
        var12 = var11;
        if (var12 == null) {
          return;
        }
        var6 = var11.field_p[param2];
        if (var6 == null) {
          return;
        }
        var7 = new o();
        var7.field_H = param0;
        var7.field_D = var12;
        var7.field_m = var6;
        var7.field_x = var11.field_n[param2];
        var7.field_k = var11.field_l[param2];
        if (param3 <= 120) {
          var10 = (java.applet.Applet) null;
          gh.a(-26, (java.applet.Applet) null);
        }
        var7.field_t = param2;
        var7.field_u = 1024 + param1 * (param1 * var12.field_r) * var11.field_h[param2] >> 11;
        var7.field_q = var11.field_j[param2] & 255;
        var7.field_I = (param2 << 8) - (32767 & var11.field_m[param2]);
        var7.field_y = -1;
        var7.field_h = 0;
        var7.field_v = 0;
        var7.field_p = 0;
        var7.field_j = 0;
        if (this.field_H[param0] == 0) {
          var7.field_n = kd.a(var6, this.b(-122, var7), this.a((byte) -128, var7), this.a(-127, var7));
        } else {
          var7.field_n = kd.a(var6, this.b(-127, var7), 0, this.a(-128, var7));
          stackIn_19_1 = 11132;
          stackIn_20_2 = !(var11.field_m[param2] >= 0);
          this.a(stackIn_19_1, stackIn_20_2, var7);
        }
        if (var11.field_m[param2] < 0) {
          var7.field_n.e(-1);
        }
        if (var7.field_k >= 0) {
          var8 = this.field_m[param0][var7.field_k];
          if (var8 != null &&
            var8.field_y < 0) {
            this.field_A[param0][var8.field_t] = null;
            var8.field_y = 0;
          }
          this.field_m[param0][var7.field_k] = var7;
        }
        this.field_G.field_l.b(var7, -1);
        this.field_A[param0][param2] = var7;
        return;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.field_N.e()) {
            var4_int = this.field_N.field_h * this.field_r / lb.field_r;
            while (true) {
              var5 = this.field_T + (long)param2 * (long)var4_int;
              if (0L <= this.field_t - var5) {
                this.field_T = var5;
                break;
              }
              var7 = (int)(((long)var4_int + (-this.field_T + this.field_t - 1L)) / (long)var4_int);
              this.field_T = this.field_T + (long)var4_int * (long)var7;
              this.field_G.a(param0, param1, var7);
              param2 = param2 - var7;
              param1 = param1 + var7;
              this.f((byte) 45);
              if (this.field_N.e()) {
                continue;
              }
              this.field_G.a(param0, param1, param2);
              return;
            }
          }
          this.field_G.a(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("gh.AA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, gi param1, eg param2, ha param3, int param4) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        int var8 = 0;
        vf var9 = null;
        int var10 = 0;
        fg var11 = null;
        int var12 = 0;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          param3.a();
          var6_int = 1;
          var8 = 73 % ((-55 - param4) / 50);
          var7 = null;
          if (param0 > 0) {
            var7 = new int[]{param0};
          }
          var9 = (vf) (param3.field_h.a(10));
          while (var9 != null) {
            var10 = (int)var9.field_e;
            var11 = (fg) (this.field_F.a((long)var10, -102));
            if (var11 == null) {
              var11 = mo.a((byte) -127, param2, var10);
              if (var11 != null) {
                this.field_F.a(var11, true, (long)var10);
              } else {
                var6_int = 0;
              }
            }
            if (var11 != null &&
              !var11.a(-99, param1, (int[]) (var7), var9.field_t)) {
              var6_int = 0;
            }
            var9 = (vf) (param3.field_h.c(-62));
          }
          if (var6_int != 0) {
            param3.b();
          }
          stackIn_17_0 = var6_int;
          return stackIn_17_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("gh.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(')').toString());
        }
    }

    final synchronized sg b() {
        return null;
    }

    final synchronized void b(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5;
        ha var6;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 < 0) {
          for (var4 = 0; var4 < 16; var4++) {
            this.field_B[var4] = param2;
          }
        } else {
          this.field_B[param0] = param2;
        }
        if (param1 != 69) {
          var6 = (ha) null;
          this.a((byte) -63, false, (ha) null);
        }
    }

    private final void d(int param0, int param1) {
        o var3;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != 27652) {
          this.field_w = -18;
        }
        var3 = (o) (this.field_G.field_l.b(param1 ^ 23883));
        while (var3 != null) {
          if ((param0 < 0 ||
            param0 == var3.field_H) &&
            0 > var3.field_y) {
            this.field_A[var3.field_H][var3.field_t] = null;
            var3.field_y = 0;
          }
          var3 = (o) (this.field_G.field_l.a(0));
        }
    }

    final static int a(int param0, byte param1, int param2) {
        if (param1 != 96) {
          u var7 = (u) null;
          gh.a(107, (u) null);
        }
        int var3 = param2 >> 16;
        int var4 = 65535 & param2;
        int var5 = param0 >> 16;
        int var6 = 65535 & param0;
        return param0 * var3 + (var5 * var4 + (var4 * var6 >> 16));
    }

    final static void a(int param0, dj param1, int param2, dj param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, qb[] param12, int param13, int param14, byte param15, int param16, qb[] param17, int param18, qb[] param19, int param20) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        java.applet.Applet var22 = null;
        try {
          ug.a((byte) 100, param8, param2, param7, param3, param14, param18, param10, param13, param6, param9, new ec(param12), param20, param1, new ec(param17), param11, param4, param16, param5, new ec(param19), param0);
          if (param15 >= -99) {
            var22 = (java.applet.Applet) null;
            gh.a(125, (java.applet.Applet) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_5_0 = var21;
          stackIn_5_1 = new StringBuilder().append("gh.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param20).append(')').toString());
        }
    }

    private final void b(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != 27257) {
          this.field_m = (o[][]) null;
        }
        var3 = param1 & 240;
        if (var3 == 128) {
          var4 = 15 & param1;
          var5 = 127 & param1 >> 8;
          var6 = (8361409 & param1) >> 16;
          this.a(false, var4, var6, var5);
          return;
        }
        if (144 == var3) {
          var4Lifetime1 = 15 & param1;
          var5Lifetime1 = 127 & param1 >> 8;
          var6Lifetime1 = param1 >> 16 & 127;
          if (var6Lifetime1 <= 0) {
            this.a(false, var4Lifetime1, 64, var5Lifetime1);
            return;
          }
          this.b(var4Lifetime1, var6Lifetime1, var5Lifetime1, param0 - 27131);
        } else {
          if (var3 == 160) {
            var4Lifetime1 = param1 & 15;
            var5Lifetime1 = param1 >> 8 & 127;
            var6Lifetime1 = (8363658 & param1) >> 16;
            this.a(var4Lifetime1, 0, var6Lifetime1, var5Lifetime1);
            return;
          }
          if (var3 != 176) {
            if (var3 == 192) {
              var4Lifetime1 = 15 & param1;
              var5Lifetime1 = (32738 & param1) >> 8;
              this.d(122, var5Lifetime1 + this.field_n[var4Lifetime1], var4Lifetime1);
              return;
            }
            if (var3 == 208) {
              var4Lifetime1 = param1 & 15;
              var5Lifetime1 = param1 >> 8 & 127;
              this.a(var5Lifetime1, var4Lifetime1, (byte) -25);
              return;
            }
            if (var3 == 224) {
              var4Lifetime1 = 15 & param1;
              var5Lifetime1 = ((8323387 & param1) >> 9) + (param1 >> 8 & 127);
              this.a(var5Lifetime1, var4Lifetime1, true);
              return;
            }
            var3 = param1 & 255;
            if (var3 != 255) {
              return;
            }
            this.a((byte) -103, true);
            return;
          }
          var4Lifetime1 = 15 & param1;
          var5Lifetime1 = param1 >> 8 & 127;
          var6Lifetime1 = (8387180 & param1) >> 16;
          if (0 == var5Lifetime1) {
            this.field_n[var4Lifetime1] = dg.a(-2080769, this.field_n[var4Lifetime1]) + (var6Lifetime1 << 14);
          }
          if (var5Lifetime1 == 32) {
            this.field_n[var4Lifetime1] = (var6Lifetime1 << 7) + dg.a(-16257, this.field_n[var4Lifetime1]);
          }
          if (var5Lifetime1 == 1) {
            this.field_I[var4Lifetime1] = dg.a(-16257, this.field_I[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 33) {
            this.field_I[var4Lifetime1] = dg.a(-128, this.field_I[var4Lifetime1]) + var6Lifetime1;
          }
          if (var5Lifetime1 == 5) {
            this.field_P[var4Lifetime1] = dg.a(-16257, this.field_P[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 37) {
            this.field_P[var4Lifetime1] = dg.a(this.field_P[var4Lifetime1], -128) + var6Lifetime1;
          }
          if (var5Lifetime1 == 7) {
            this.field_y[var4Lifetime1] = (var6Lifetime1 << 7) + dg.a(this.field_y[var4Lifetime1], -16257);
          }
          if (var5Lifetime1 == 39) {
            this.field_y[var4Lifetime1] = var6Lifetime1 + dg.a(this.field_y[var4Lifetime1], -128);
          }
          if (10 == var5Lifetime1) {
            this.field_S[var4Lifetime1] = dg.a(-16257, this.field_S[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 42) {
            this.field_S[var4Lifetime1] = var6Lifetime1 + dg.a(-128, this.field_S[var4Lifetime1]);
          }
          if (var5Lifetime1 == 11) {
            this.field_R[var4Lifetime1] = (var6Lifetime1 << 7) + dg.a(-16257, this.field_R[var4Lifetime1]);
          }
          if (var5Lifetime1 == 43) {
            this.field_R[var4Lifetime1] = var6Lifetime1 + dg.a(-128, this.field_R[var4Lifetime1]);
          }
          if (var5Lifetime1 == 64) {
            if (var6Lifetime1 < 64) {
              this.field_Q[var4Lifetime1] = dg.a(this.field_Q[var4Lifetime1], -2);
            } else {
              this.field_Q[var4Lifetime1] = fj.b(this.field_Q[var4Lifetime1], 1);
            }
          }
          if (var5Lifetime1 == 65) {
            if (var6Lifetime1 >= 64) {
              this.field_Q[var4Lifetime1] = fj.b(this.field_Q[var4Lifetime1], 2);
            } else {
              this.a((byte) -62, var4Lifetime1);
              this.field_Q[var4Lifetime1] = dg.a(this.field_Q[var4Lifetime1], -3);
            }
          }
          if (99 == var5Lifetime1) {
            this.field_V[var4Lifetime1] = (var6Lifetime1 << 7) + dg.a(127, this.field_V[var4Lifetime1]);
          }
          if (var5Lifetime1 == 98) {
            this.field_V[var4Lifetime1] = dg.a(16256, this.field_V[var4Lifetime1]) + var6Lifetime1;
          }
          if (var5Lifetime1 == 101) {
            this.field_V[var4Lifetime1] = dg.a(this.field_V[var4Lifetime1], 127) + (16384 + (var6Lifetime1 << 7));
          }
          if (var5Lifetime1 == 100) {
            this.field_V[var4Lifetime1] = var6Lifetime1 + (dg.a(16256, this.field_V[var4Lifetime1]) + 16384);
          }
          if (120 == var5Lifetime1) {
            this.a(var4Lifetime1, param0 ^ 27257);
          }
          if (var5Lifetime1 == 121) {
            this.c(268269032, var4Lifetime1);
          }
          if (var5Lifetime1 == 123) {
            this.d(var4Lifetime1, 27652);
          }
          if (6 == var5Lifetime1) {
            var7 = this.field_V[var4Lifetime1];
            if (var7 == 16384) {
              this.field_J[var4Lifetime1] = (var6Lifetime1 << 7) + dg.a(-16257, this.field_J[var4Lifetime1]);
            }
          }
          if (var5Lifetime1 == 38) {
            var7Lifetime1 = this.field_V[var4Lifetime1];
            if (16384 == var7Lifetime1) {
              this.field_J[var4Lifetime1] = var6Lifetime1 + dg.a(-128, this.field_J[var4Lifetime1]);
            }
          }
          if (var5Lifetime1 == 16) {
            this.field_H[var4Lifetime1] = (var6Lifetime1 << 7) + dg.a(-16257, this.field_H[var4Lifetime1]);
          }
          if (48 == var5Lifetime1) {
            this.field_H[var4Lifetime1] = var6Lifetime1 + dg.a(-128, this.field_H[var4Lifetime1]);
          }
          if (var5Lifetime1 == 81) {
            if (var6Lifetime1 < 64) {
              this.e(var4Lifetime1, param0 - 27298);
              this.field_Q[var4Lifetime1] = dg.a(this.field_Q[var4Lifetime1], -5);
            } else {
              this.field_Q[var4Lifetime1] = fj.b(this.field_Q[var4Lifetime1], 4);
            }
          }
          if (var5Lifetime1 == 17) {
            this.a(8387180, var4Lifetime1, (this.field_p[var4Lifetime1] & -16257) + (var6Lifetime1 << 7));
          }
          if (49 == var5Lifetime1) {
            this.a(8387180, var4Lifetime1, var6Lifetime1 + (-128 & this.field_p[var4Lifetime1]));
            return;
          }
        }
    }

    final synchronized int c() {
        return 0;
    }

    final void a(int param0, boolean param1, o param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param2.field_m.field_i.length;
          if (param0 != 11132) {
            return;
          }
          if (param1 &&
            param2.field_m.field_k) {
            var6 = -param2.field_m.field_j + (var4_int + var4_int);
            var4_int = var4_int << 8;
            var5 = (int)((long)this.field_H[param2.field_H] * (long)var6 >> 6);
            if (var5 >= var4_int) {
              var5 = -1 + var4_int + var4_int - var5;
              param2.field_n.b(true);
            }
          } else {
            var5 = (int)((long)this.field_H[param2.field_H] * (long)var4_int >> 6);
          }
          param2.field_n.f(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("gh.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final synchronized void a(boolean param0, boolean param1) {
        this.field_N.c();
        this.field_C = null;
        this.a((byte) -125, param0);
        if (param1) {
          this.field_B = (int[]) null;
        }
    }

    private final void a(byte param0, int param1) {
        o var3_ref_o = null;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if ((this.field_Q[param1] & 2) != 0) {
          var3_ref_o = (o) (this.field_G.field_l.b(12623));
          while (var3_ref_o != null) {
            if (~var3_ref_o.field_H == ~param1 &&
              this.field_A[param1][var3_ref_o.field_t] == null &&
              var3_ref_o.field_y < 0) {
              var3_ref_o.field_y = 0;
            }
            var3_ref_o = (o) (this.field_G.field_l.a(0));
          }
        }
        int var3 = -77 / ((param0 - 3) / 33);
    }

    final synchronized void b(int param0, int param1, int param2) {
        int var4 = -108 % ((param1 + 39) / 47);
        this.c(param0, param2, 1319989672);
    }

    private final void a(byte param0, boolean param1) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        int var3Lifetime1;
        if (param1) {
          this.a(-1, 0);
        } else {
          this.d(-1, 27652);
        }
        this.c(268269032, -1);
        int var3 = 0;
        if (param0 >= -86) {
          o var5 = (o) null;
          this.a(103, -78, 68, (int[]) null, (o) null);
        }
        while (var3 < 16) {
          this.field_q[var3] = this.field_k[var3];
          var3++;
        }
        int var6 = 0;
        var3Lifetime1 = var6;
        while (var6 < 16) {
          this.field_n[var6] = dg.a(this.field_k[var6], -128);
          var6++;
        }
    }

    final synchronized void a(byte param0, boolean param1, ha param2) {
        if (param0 != -96) {
          return;
        }
        try {
          this.a(-61, param1, param2, true);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gh.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        this.field_k[param1] = param0;
        if (param2 != 1319989672) {
          return;
        }
        this.field_n[param1] = dg.a(-128, param0);
        this.d(param2 - 1319989581, param0, param1);
    }

    final boolean a(int param0, int param1, int param2, int[] param3, o param4) {
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        ba var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          param4.field_C = lb.field_r / 100;
          if (param4.field_y >= 0 && (null == param4.field_n ||
            param4.field_n.k())) {
            param4.b(true);
            param4.a(true);
            if (0 < param4.field_k) {
              if (this.field_m[param4.field_H][param4.field_k] != param4) {
                return true;
              }
              this.field_m[param4.field_H][param4.field_k] = null;
            }
            return true;
          }
          var6_int = param4.field_B;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(16.0 * Math.pow(2.0, (double)this.field_P[param4.field_H] * 0.0004921259842519685) + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param4.field_B = var6_int;
          }
          param4.field_n.g(this.b(param1 ^ -24574, param4));
          var7 = param4.field_x;
          var8 = 0;
          param4.field_z = param4.field_z + 1;
          param4.field_w = param4.field_w + var7.field_e;
          var9 = (double)((-60 + param4.field_t << 8) + (param4.field_i * param4.field_B >> 12)) * 0.000005086263020833333;
          if (0 < var7.field_n) {
            if (var7.field_m <= 0) {
              param4.field_j = param4.field_j + 128;
            } else {
              param4.field_j = param4.field_j + (int)(128.0 * Math.pow(2.0, (double)var7.field_m * var9) + 0.5);
            }
            if (param4.field_j * var7.field_n >= 819200) {
              var8 = 1;
            }
          }
          if (null != var7.field_h) {
            if (var7.field_g <= 0) {
              param4.field_h = param4.field_h + 128;
            } else {
              param4.field_h = param4.field_h + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_g) * 128.0);
            }
            while (var7.field_h.length - 2 > param4.field_v) {
              if (param4.field_h > (65280 & var7.field_h[param4.field_v + 2] << 8)) {
                param4.field_v = param4.field_v + 2;
                continue;
              }
              break;
            }
            if (param4.field_v == -2 + var7.field_h.length &&
              var7.field_h[1 + param4.field_v] == 0) {
              var8 = 1;
            }
          }
          if (param4.field_y >= 0 &&
            null != var7.field_l &&
            (1 & this.field_Q[param4.field_H]) == 0 && (!(param4.field_k >= 0) ||
            param4 != this.field_m[param4.field_H][param4.field_k])) {
            if (0 >= var7.field_i) {
              param4.field_y = param4.field_y + 128;
            } else {
              param4.field_y = param4.field_y + (int)(128.0 * Math.pow(2.0, (double)var7.field_i * var9) + 0.5);
            }
            while (var7.field_l.length - 2 > param4.field_p) {
              if (param4.field_y > (var7.field_l[2 + param4.field_p] & 255) << 8) {
                param4.field_p = param4.field_p + 2;
                continue;
              }
              break;
            }
            if (param4.field_p == -2 + var7.field_l.length) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param4.field_n.a(param4.field_C, this.a((byte) -128, param4), this.a(param1 - 24592, param4));
            if (param1 == 24464) {
              return false;
            }
            return false;
          }
          param4.field_n.d(param4.field_C);
          if (param3 == null) {
            param4.field_n.a(param2);
          } else {
            param4.field_n.a(param3, param0, param2);
          }
          if (param4.field_n.h()) {
            this.field_G.field_n.b(param4.field_n);
          }
          param4.b(true);
          if (param4.field_y >= 0) {
            param4.a(true);
            if (0 < param4.field_k &&
              param4 == this.field_m[param4.field_H][param4.field_k]) {
              this.field_m[param4.field_H][param4.field_k] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_71_0 = var6;
          stackIn_71_1 = new StringBuilder().append("gh.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param4 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    final synchronized void b(int param0, byte param1) {
        this.field_r = param0;
        if (param1 >= -84) {
          field_D = (oc) null;
        }
    }

    private final int a(byte param0, o param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ba var9 = null;
        ba var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (0 == this.field_B[param1.field_H]) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var9 = param1.field_x;
          var10 = var9;
          var4 = 4096 + this.field_y[param1.field_H] * this.field_R[param1.field_H] >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = 16384 + param1.field_u * var4 >> 15;
          var4 = 128 + this.field_v * var4 >> 8;
          var4 = var4 * this.field_B[param1.field_H] + 128 >> 8;
          if (0 < var10.field_n) {
            var4 = (int)(0.5 + Math.pow(0.5, (double)param1.field_j * 0.00001953125 * (double)var10.field_n) * (double)var4);
          }
          if (var10.field_h != null) {
            var5 = param1.field_h;
            var6 = var10.field_h[1 + param1.field_v];
            if (-2 + var10.field_h.length > param1.field_v) {
              var7 = (255 & var9.field_h[param1.field_v]) << 8;
              var8 = (var10.field_h[param1.field_v + 2] & 255) << 8;
              var6 = var6 + (var5 - var7) * (-var6 + var10.field_h[3 + param1.field_v]) / (var8 - var7);
            }
            var4 = var6 * var4 + 32 >> 6;
          }
          if (param1.field_y > 0 &&
            null != var10.field_l) {
            var5Lifetime1 = param1.field_y;
            var6Lifetime1 = var10.field_l[param1.field_p + 1];
            if (param1.field_p < var10.field_l.length - 2) {
              var7Lifetime1 = (var9.field_l[param1.field_p] & 255) << 8;
              var8Lifetime1 = (var10.field_l[param1.field_p + 2] & 255) << 8;
              var6Lifetime1 = var6Lifetime1 + (-var6Lifetime1 + var10.field_l[param1.field_p + 3]) * (-var7Lifetime1 + var5Lifetime1) / (var8Lifetime1 - var7Lifetime1);
            }
            var4 = 32 + var6Lifetime1 * var4 >> 6;
          }
          if (param0 > -122) {
            this.field_x = (int[]) null;
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("gh.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        o var6 = null;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        o var8 = this.field_A[param1][param3];
        if (var8 == null) {
          return;
        }
        this.field_A[param1][param3] = null;
        if (0 == (2 & this.field_Q[param1])) {
          var8.field_y = 0;
        } else {
          var6 = (o) (this.field_G.field_l.b(12623));
          while (var6 != null) {
            if (var8.field_H == var6.field_H && var6.field_y < 0 &&
              var6 != var8) {
              var8.field_y = 0;
              break;
            }
            var6 = (o) (this.field_G.field_l.a(0));
          }
        }
        if (param0) {
          this.field_F = (di) null;
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var6;
        int var5;
        boolean decompiledFrameRemainder0 = true;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.field_N.e()) {
          var2 = this.field_r * this.field_N.field_h / lb.field_r;
          while (true) {
            var3 = this.field_T + (long)var2 * (long)param0;
            if (0L <= -var3 + this.field_t) {
              this.field_T = var3;
            } else {
              var5 = (int)((-1L + (-this.field_T + (this.field_t + (long)var2))) / (long)var2);
              this.field_T = this.field_T + (long)var2 * (long)var5;
              param0 = param0 - var5;
              this.field_G.a(var5);
              this.f((byte) -126);
              if (this.field_N.e()) {
                continue;
              }
            }
            break;
          }
          this.field_G.a(param0);
          decompiledFrameRemainder0 = false;
        }
        else {
          this.field_G.a(param0);
        }

    }

    private final void a(int param0, int param1, boolean param2) {
        this.field_x[param1] = param0;
        if (!param2) {
          this.field_I = (int[]) null;
        }
    }

    private final void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 <= 16) {
          return;
        }
        if (param1 != this.field_q[param2]) {
          this.field_q[param2] = param1;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_m[param2][var4] = null;
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          if (param0 != 2) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            gh.a(87, (java.applet.Applet) null);
          }
          um.a("", param1, 13680);
          mc.a(param0 ^ 30451, param1);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gh.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 < 49) {
          qb[] var2 = (qb[]) null;
          gh.a(-77, (dj) null, 44, (dj) null, 50, -28, 27, 16, 26, 104, 12, -16, (qb[]) null, -80, -75, (byte) -94, -15, (qb[]) null, 47, (qb[]) null, 87);
        }
        field_z = null;
        field_o = null;
        field_L = null;
        field_l = null;
        field_D = null;
        field_O = null;
        field_E = null;
    }

    private final synchronized void a(int param0, boolean param1, ha param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        this.a(param3, false);
        this.field_N.a(param2.field_g);
        if (param0 >= -49) {
          return;
        }
        try {
          this.field_u = param1 ? true : false;
          this.field_T = 0L;
          var5_int = this.field_N.d();
          for (var6 = 0; var5_int > var6; var6++) {
            this.field_N.f(var6);
            this.field_N.a(var6);
            this.field_N.c(var6);
          }
          this.field_U = this.field_N.a();
          this.field_K = this.field_N.field_d[this.field_U];
          this.field_t = this.field_N.b(this.field_K);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gh.MA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        this.field_p[param1] = param2;
        this.field_s[param1] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param2) * 2097152.0);
        if (param0 != 8387180) {
          this.a(-47, -57, false);
        }
    }

    final boolean a(boolean param0, o param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.field_n != null) {
            if (!param0) {
              gh.a(-58, (byte) 89, 75);
            }
            return false;
          }
          if (param1.field_y < 0) {
            return true;
          }
          param1.a(true);
          if (0 < param1.field_k &&
            param1 == this.field_m[param1.field_H][param1.field_k]) {
            this.field_m[param1.field_H][param1.field_k] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("gh.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 >= -4) {
          this.field_V = (int[]) null;
        }
    }

    private final int a(int param0, o param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -126) {
            stackIn_2_0 = -91;
            return stackIn_2_0;
          }
          var3_int = this.field_S[param1.field_H];
          if (8192 <= var3_int) {
            stackIn_7_0 = -(32 + (16384 - var3_int) * (-param1.field_q + 128) >> 6) + 16384;
            return stackIn_7_0;
          }
          stackIn_5_0 = 32 + var3_int * param1.field_q >> 6;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("gh.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final synchronized sg a() {
        return (sg) ((Object) this.field_G);
    }

    final static void a(int param0, u param1) {
        try {
          int var2_int = 66 / ((param0 + 27) / 62);
          kh.field_g = param1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "gh.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0, int param1) {
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 < 0) {
          for (param1 = 0; param1 < 16; param1++) {
            this.c(param0 ^ 0, param1);
          }
        } else {
          this.field_y[param1] = 12800;
          this.field_S[param1] = 8192;
          this.field_R[param1] = 16383;
          this.field_x[param1] = 8192;
          this.field_I[param1] = 0;
          this.field_P[param1] = 8192;
          this.a((byte) 121, param1);
          this.e(param1, param0 ^ -268269053);
          if (param0 != 268269032) {
            this.field_S = (int[]) null;
          }
          this.field_Q[param1] = 0;
          this.field_V[param1] = 32767;
          this.field_J[param1] = 256;
          this.field_H[param1] = 0;
          this.a(8387180, param1, 8192);
        }
    }

    public gh() {
        this.field_p = new int[16];
        this.field_k = new int[16];
        this.field_r = 1000000;
        this.field_A = new o[16][128];
        this.field_s = new int[16];
        this.field_v = 256;
        this.field_H = new int[16];
        this.field_x = new int[16];
        this.field_n = new int[16];
        this.field_J = new int[16];
        this.field_B = new int[16];
        this.field_V = new int[16];
        this.field_q = new int[16];
        this.field_m = new o[16][128];
        this.field_Q = new int[16];
        this.field_I = new int[16];
        this.field_R = new int[16];
        this.field_S = new int[16];
        this.field_P = new int[16];
        this.field_y = new int[16];
        this.field_N = new en();
        this.field_G = new hk(this);
        this.field_F = new di(128);
        this.b(-1, (byte) 69, 256);
        this.a((byte) -93, true);
    }

    static {
        field_O = "Auto-respond to <%0>";
        field_D = new oc();
        field_l = new int[]{2, 20, 21, 6, 5, 9};
        field_z = "Reject <%0> from this game";
        field_L = new oc();
        field_o = "Now, clicking near yourself will cause an explosion of arcane energy. Try using it on the target. If you miss, move closer and try again.";
    }
}
