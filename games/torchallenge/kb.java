/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb extends qd {
    int[] field_J;
    private int[] field_n;
    private int field_m;
    private int[] field_q;
    private int field_s;
    private int[] field_F;
    private int[] field_E;
    private dl[][] field_r;
    private int[] field_w;
    private int[] field_G;
    private int[] field_t;
    private int[] field_p;
    int[] field_y;
    private pc field_P;
    static fg field_O;
    private int[] field_L;
    private int[] field_D;
    private ha field_A;
    int[] field_N;
    private dl[][] field_v;
    private int[] field_u;
    private int[] field_R;
    private int[] field_o;
    private pg field_I;
    private boolean field_B;
    private long field_H;
    private int field_K;
    private long field_x;
    private int field_M;
    private ej field_C;
    private boolean field_Q;
    private int field_z;

    final static void a(String param0, String param1, byte param2) {
        if (param2 < 11) {
          return;
        }
        try {
          fl.a(-125, false, param0, param1);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "kb.LA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final synchronized void a(int param0, ej param1, boolean param2) {
        try {
          if (param0 != -8126) {
            this.field_I = (pg) null;
          }
          this.a(true, param2, param1, 28050);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "kb.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, boolean param1, dl param2) {
        int var4_int = 0;
        int var5 = 0;
        kb var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        try {
          if (param0 != 256) {
            var7 = (kb) null;
            kb.a(-76, -111, (uj) null, true, (java.awt.Component) null, (kb) null);
          }
          var4_int = param2.field_k.field_k.length;
          if (param1 &&
            param2.field_k.field_m) {
            var6 = -param2.field_k.field_n + (var4_int + var4_int);
            var4_int = var4_int << 8;
            var5 = (int)((long)var6 * (long)this.field_y[param2.field_G] >> 6);
            if (var5 >= var4_int) {
              param2.field_K.b(true);
              var5 = -1 + var4_int - (-var4_int + var5);
            }
          } else {
            var5 = (int)((long)this.field_y[param2.field_G] * (long)var4_int >> 6);
          }
          param2.field_K.d(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("kb.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        this.a(param0, param2, (byte) 120);
        int var4 = -4 / ((-76 - param1) / 43);
    }

    private final void b(int param0, byte param1, int param2) {
        if (param1 != -81) {
          this.field_L = (int[]) null;
        }
        this.field_n[param2] = param0;
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = TorChallenge.field_F ? 1 : 0;
        int var3Lifetime1;
        if (param1) {
          this.a(true, -1);
        } else {
          this.a(-1, (byte) 105);
        }
        this.a((byte) -97, -1);
        for (var3 = 0; 16 > var3; var3++) {
          this.field_t[var3] = this.field_q[var3];
        }
        if (param0 != -1863960953) {
          this.b();
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < 16) {
          this.field_F[var5] = jh.a(-128, this.field_q[var5]);
          var5++;
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
          param1.removeMouseListener(te.field_b);
          param1.removeMouseMotionListener(te.field_b);
          if (param0 != -25) {
            field_O = (fg) null;
          }
          param1.removeFocusListener(te.field_b);
          jc.field_h = 0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "kb.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = TorChallenge.field_F ? 1 : 0;
        if (0 <= param2) {
          this.field_w[param2] = param1;
        } else {
          for (var4 = 0; var4 < 16; var4++) {
            this.field_w[var4] = param1;
          }
        }
        if (param0 != -3262) {
          dl var6 = (dl) null;
          this.a(-32, true, (dl) null);
        }
    }

    private final synchronized void b(int param0, boolean param1) {
        this.field_P.e();
        this.field_C = null;
        this.a(param0 - 1863961209, param1);
        if (param0 != 256) {
          this.field_q = (int[]) null;
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
        var8 = TorChallenge.field_F ? 1 : 0;
        var3 = 240 & param0;
        if (var3 == 128) {
          var4 = 15 & param0;
          var5 = (param0 & 32514) >> 8;
          var6 = 127 & param0 >> 16;
          this.a(var4, var6, var5, 9208);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = 15 & param0;
          var5Lifetime1 = param0 >> 8 & 127;
          var6Lifetime1 = (8346425 & param0) >> 16;
          if (0 >= var6Lifetime1) {
            this.a(var4Lifetime1, 64, var5Lifetime1, 9208);
          } else {
            this.b(var6Lifetime1, -10825, var4Lifetime1, var5Lifetime1);
          }
          return;
        }
        if (var3 == 160) {
          var4Lifetime2 = param0 & 15;
          var5Lifetime2 = (param0 & 32695) >> 8;
          var6Lifetime2 = 127 & param0 >> 16;
          this.a(var4Lifetime2, (byte) -81, var6Lifetime2, var5Lifetime2);
          return;
        }
        if (176 != var3) {
          if (192 == var3) {
            var4Lifetime3 = param0 & 15;
            var5Lifetime3 = (32658 & param0) >> 8;
            this.a(this.field_F[var4Lifetime3] + var5Lifetime3, (byte) 122, var4Lifetime3);
            return;
          }
          if (param1 < 16) {
            this.a(-60, -64, -102);
          }
          if (208 == var3) {
            var4Lifetime3Lifetime1 = param0 & 15;
            var5Lifetime3Lifetime1 = (32585 & param0) >> 8;
            this.c(var4Lifetime3Lifetime1, (byte) -15, var5Lifetime3Lifetime1);
            return;
          }
          if (var3 == 224) {
            var4Lifetime3Lifetime2 = param0 & 15;
            var5Lifetime3Lifetime2 = ((param0 & 32732) >> 8) + (16256 & param0 >> 9);
            this.b(var5Lifetime3Lifetime2, (byte) -81, var4Lifetime3Lifetime2);
            return;
          }
          var3 = param0 & 255;
          if (var3 != 255) {
            return;
          }
          this.a(-1863960953, true);
          return;
        }
        var4Lifetime4 = 15 & param0;
        var5Lifetime4 = (32636 & param0) >> 8;
        var6Lifetime3 = 127 & param0 >> 16;
        if (var5Lifetime4 == 0) {
          this.field_F[var4Lifetime4] = jh.a(-2080769, this.field_F[var4Lifetime4]) + (var6Lifetime3 << 14);
        }
        if (32 == var5Lifetime4) {
          this.field_F[var4Lifetime4] = (var6Lifetime3 << 7) + jh.a(-16257, this.field_F[var4Lifetime4]);
        }
        if (1 == var5Lifetime4) {
          this.field_o[var4Lifetime4] = jh.a(-16257, this.field_o[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 33) {
          this.field_o[var4Lifetime4] = jh.a(-128, this.field_o[var4Lifetime4]) + var6Lifetime3;
        }
        if (5 == var5Lifetime4) {
          this.field_L[var4Lifetime4] = (var6Lifetime3 << 7) + jh.a(-16257, this.field_L[var4Lifetime4]);
        }
        if (37 == var5Lifetime4) {
          this.field_L[var4Lifetime4] = jh.a(-128, this.field_L[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 7) {
          this.field_E[var4Lifetime4] = jh.a(this.field_E[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 39) {
          this.field_E[var4Lifetime4] = jh.a(this.field_E[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 10) {
          this.field_R[var4Lifetime4] = (var6Lifetime3 << 7) + jh.a(this.field_R[var4Lifetime4], -16257);
        }
        if (42 == var5Lifetime4) {
          this.field_R[var4Lifetime4] = jh.a(this.field_R[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 11) {
          this.field_u[var4Lifetime4] = jh.a(-16257, this.field_u[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 43) {
          this.field_u[var4Lifetime4] = jh.a(-128, this.field_u[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 64) {
          if (var6Lifetime3 >= 64) {
            this.field_J[var4Lifetime4] = p.a(this.field_J[var4Lifetime4], 1);
          } else {
            this.field_J[var4Lifetime4] = jh.a(this.field_J[var4Lifetime4], -2);
          }
        }
        if (65 == var5Lifetime4) {
          if (var6Lifetime3 < 64) {
            this.c(var4Lifetime4, -101);
            this.field_J[var4Lifetime4] = jh.a(this.field_J[var4Lifetime4], -3);
          } else {
            this.field_J[var4Lifetime4] = p.a(this.field_J[var4Lifetime4], 2);
          }
        }
        if (var5Lifetime4 == 99) {
          this.field_D[var4Lifetime4] = (var6Lifetime3 << 7) + jh.a(this.field_D[var4Lifetime4], 127);
        }
        if (98 == var5Lifetime4) {
          this.field_D[var4Lifetime4] = var6Lifetime3 + jh.a(this.field_D[var4Lifetime4], 16256);
        }
        if (var5Lifetime4 == 101) {
          this.field_D[var4Lifetime4] = (var6Lifetime3 << 7) + (jh.a(this.field_D[var4Lifetime4], 127) + 16384);
        }
        if (var5Lifetime4 == 100) {
          this.field_D[var4Lifetime4] = var6Lifetime3 + (jh.a(this.field_D[var4Lifetime4], 16256) + 16384);
        }
        if (var5Lifetime4 == 120) {
          this.a(true, var4Lifetime4);
        }
        if (var5Lifetime4 == 121) {
          this.a((byte) -97, var4Lifetime4);
        }
        if (123 == var5Lifetime4) {
          this.a(var4Lifetime4, (byte) 125);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.field_D[var4Lifetime4];
          if (var7 == 16384) {
            this.field_p[var4Lifetime4] = jh.a(this.field_p[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.field_D[var4Lifetime4];
          if (16384 == var7Lifetime1) {
            this.field_p[var4Lifetime4] = var6Lifetime3 + jh.a(-128, this.field_p[var4Lifetime4]);
          }
        }
        if (16 == var5Lifetime4) {
          this.field_y[var4Lifetime4] = jh.a(this.field_y[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 48) {
          this.field_y[var4Lifetime4] = jh.a(-128, this.field_y[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 81) {
          if (64 <= var6Lifetime3) {
            this.field_J[var4Lifetime4] = p.a(this.field_J[var4Lifetime4], 4);
          } else {
            this.a(var4Lifetime4, -870);
            this.field_J[var4Lifetime4] = jh.a(this.field_J[var4Lifetime4], -5);
          }
        }
        if (var5Lifetime4 == 17) {
          this.c(11226, var4Lifetime4, (-16257 & this.field_G[var4Lifetime4]) + (var6Lifetime3 << 7));
        }
        if (var5Lifetime4 == 49) {
          this.c(11226, var4Lifetime4, (-128 & this.field_G[var4Lifetime4]) + var6Lifetime3);
          return;
        }
    }

    final synchronized void b(byte param0, int param1) {
        int var3 = 103 / ((param0 + 9) / 38);
        this.field_s = param1;
    }

    final synchronized int a() {
        return 0;
    }

    private final void a(byte param0, int param1) {
        int var4;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (param1 < 0) {
          for (param1 = 0; param1 < 16; param1++) {
            this.a((byte) -97, param1);
          }
        } else {
          this.field_E[param1] = 12800;
          this.field_R[param1] = 8192;
          this.field_u[param1] = 16383;
          this.field_n[param1] = 8192;
          this.field_o[param1] = 0;
          if (param0 != -97) {
            this.a(-16, (byte) -76);
          }
          this.field_L[param1] = 8192;
          this.c(param1, param0 ^ 15);
          this.a(param1, -870);
          this.field_J[param1] = 0;
          this.field_D[param1] = 32767;
          this.field_p[param1] = 256;
          this.field_y[param1] = 0;
          this.c(param0 + 11323, param1, 8192);
        }
    }

    private final void a(int param0, int param1) {
        dl var3 = null;
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (0 != (4 & this.field_J[param0])) {
          var3 = (dl) (this.field_I.field_o.c((byte) -22));
          while (var3 != null) {
            if (var3.field_G == param0) {
              var3.field_x = 0;
            }
            var3 = (dl) (this.field_I.field_o.c(-270));
          }
        }
        if (param1 != -870) {
          ej var5 = (ej) null;
          this.a(true, false, (ej) null, 51);
        }
    }

    final static void a(int param0, int param1, uj param2, boolean param3, java.awt.Component param4, kb param5) {
        try {
          if (param1 != 16239) {
            java.awt.Component var7 = (java.awt.Component) null;
            kb.a((byte) 92, (java.awt.Component) null);
          }
          bg.a(param5, param0, 1024, param0, param4, param2, -118, param3);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "kb.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var6;
        int var5;
        var6 = TorChallenge.field_F ? 1 : 0;
        if (this.field_P.d()) {
          var2 = this.field_s * this.field_P.field_h / kh.field_p;
          while (true) {
            var3 = this.field_H + (long)var2 * (long)param0;
            if (this.field_x - var3 >= 0L) {
              this.field_H = var3;
              break;
            }
            var5 = (int)((-1L + (this.field_x - this.field_H + (long)var2)) / (long)var2);
            this.field_H = this.field_H + (long)var5 * (long)var2;
            this.field_I.a(var5);
            param0 = param0 - var5;
            this.c(true);
            if (!this.field_P.d()) {
              break;
            }
          }
        }
        this.field_I.a(param0);
    }

    private final int a(int param0, dl param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = -11 / ((-58 - param0) / 47);
          var3_int = this.field_R[param1.field_G];
          if (8192 <= var3_int) {
            stackIn_4_0 = 16384 - ((16384 - var3_int) * (128 - param1.field_y) + 32 >> 6);
            return stackIn_4_0;
          }
          stackIn_2_0 = param1.field_y * var3_int + 32 >> 6;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kb.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final synchronized void a(boolean param0, boolean param1, ej param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = TorChallenge.field_F ? 1 : 0;
        try {
          this.b(256, param0);
          this.field_P.a(param2.field_i);
          this.field_H = 0L;
          this.field_B = param1 ? true : false;
          if (param3 != 28050) {
            this.a(true, 42);
          }
          var5_int = this.field_P.f();
          for (var6 = 0; var6 < var5_int; var6++) {
            this.field_P.e(var6);
            this.field_P.c(var6);
            this.field_P.f(var6);
          }
          this.field_M = this.field_P.c();
          this.field_K = this.field_P.field_f[this.field_M];
          this.field_x = this.field_P.b(this.field_K);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "kb.SA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final synchronized void c(int param0, boolean param1) {
        if (param1) {
          return;
        }
        this.field_m = param0;
    }

    private final void c(int param0, byte param1, int param2) {
        if (param1 != -15) {
          this.field_x = -108L;
        }
    }

    private final void c(int param0, int param1, int param2) {
        this.field_G[param1] = param2;
        if (param0 != 11226) {
          this.a(76, 50, -70);
        }
        this.field_N[param1] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param2) * 2097152.0);
    }

    final synchronized boolean d(int param0) {
        if (param0 != 0) {
          this.field_n = (int[]) null;
        }
        return this.field_P.d();
    }

    private final void a(boolean param0, int param1) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        dl var3 = (dl) (this.field_I.field_o.c((byte) -83));
        if (!param0) {
          ej var5 = (ej) null;
          this.a(-128, (ej) null, true);
        }
        while (var3 != null) {
          if (param1 < 0 ||
            param1 == var3.field_G) {
            if (var3.field_K != null) {
              var3.field_K.g(kh.field_p / 100);
              if (var3.field_K.l()) {
                this.field_I.field_u.a(var3.field_K);
              }
              var3.a(1047574608);
            }
            if (!(var3.field_F >= 0)) {
              this.field_r[var3.field_G][var3.field_p] = null;
            }
            var3.a(true);
          }
          var3 = (dl) (this.field_I.field_o.c(-270));
        }
    }

    private final void c(boolean param0) {
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = TorChallenge.field_F ? 1 : 0;
        var2 = this.field_M;
        var3 = this.field_K;
        var4 = this.field_x;
        if (this.field_C != null &&
          var3 == this.field_z) {
          this.a(this.field_Q, this.field_B, this.field_C, 28050);
          this.c(true);
          return;
        }
        if (!param0) {
          this.field_J = (int[]) null;
        }
        while (true) {
          if (this.field_K != var3) {
            this.field_M = var2;
            this.field_x = var4;
            this.field_K = var3;
            if (null != this.field_C) {
              stackIn_24_0 = ~this.field_z;
              stackIn_24_1 = ~var3;
              if (stackIn_24_0 > stackIn_24_1) {
                this.field_K = this.field_z;
                this.field_M = -1;
                this.field_x = this.field_P.b(this.field_K);
              }
            }
            return;
          }
          while (var3 == this.field_P.field_f[var2]) {
            this.field_P.e(var2);
            var6 = this.field_P.a(var2);
            if (var6 != 1) {
              if ((var6 & 128) != 0) {
                this.b(var6, 109);
              }
              this.field_P.c(var2);
              this.field_P.f(var2);
              continue;
            }
            this.field_P.g();
            this.field_P.f(var2);
            if (this.field_P.a()) {
              if (this.field_C != null) {
                this.a(-8126, this.field_C, this.field_B);
                this.c(true);
                return;
              }
              if (this.field_B &&
                var3 != 0) {
                this.field_P.a(var4);
              } else {
                this.a(-1863960953, true);
                this.field_P.e();
                return;
              }
            }
            break;
          }
          var2 = this.field_P.c();
          var3 = this.field_P.field_f[var2];
          var4 = this.field_P.b(var3);
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = TorChallenge.field_F ? 1 : 0;
        if (this.field_t[param2] != param0) {
          this.field_t[param2] = param0;
          for (var4 = 0; 128 > var4; var4++) {
            this.field_v[param2][var4] = null;
          }
        }
        if (param1 != 122) {
          int[] var6 = (int[]) null;
          this.b((int[]) null, -5, 97);
        }
    }

    private final void c(int param0, int param1) {
        dl var3;
        int var4;
        int[] var5;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (param1 >= -95) {
          var5 = (int[]) null;
          this.b((int[]) null, -23, -98);
        }
        if ((2 & this.field_J[param0]) != 0) {
          var3 = (dl) (this.field_I.field_o.c((byte) 113));
          while (var3 != null) {
            if (param0 == var3.field_G) {
              if (this.field_r[param0][var3.field_p] != null) {
                var3 = (dl) (this.field_I.field_o.c(-270));
                continue;
              }
              if (var3.field_F < 0) {
                var3.field_F = 0;
              }
            }
            var3 = (dl) (this.field_I.field_o.c(-270));
          }
        }
    }

    final synchronized void b(byte param0) {
        int discarded$0 = 0;
        this.b(256, true);
        if (param0 != 31) {
          dl var3 = (dl) null;
          discarded$0 = this.a((dl) null, false);
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          if (this.field_P.d()) {
            var4_int = this.field_P.field_h * this.field_s / kh.field_p;
            while (true) {
              var5 = this.field_H + (long)param2 * (long)var4_int;
              if (0L > -var5 + this.field_x) {
                var7 = (int)((-1L + (long)var4_int + (-this.field_H + this.field_x)) / (long)var4_int);
                this.field_H = this.field_H + (long)var7 * (long)var4_int;
                this.field_I.b(param0, param1, var7);
                this.c(true);
                param1 = param1 + var7;
                param2 = param2 - var7;
                if (this.field_P.d()) {
                  continue;
                }
              } else {
                this.field_H = var5;
              }
              break;
            }
            this.field_I.b(param0, param1, param2);
            return;
          }
          this.field_I.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("kb.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized boolean a(boolean param0, u param1, ej param2, lj param3, int param4) {
        int stackIn_13_0 = 0;
        lj stackIn_13_1 = null;
        boolean stackIn_14_2 = false;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        s var8 = null;
        int var9 = 0;
        int var11 = 0;
        fb var12 = null;
        fb var13 = null;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          param2.a();
          if (param0) {
            this.field_I = (pg) null;
          }
          var6_int = 1;
          var7 = null;
          if (param4 > 0) {
            var7 = new int[]{param4};
          }
          var8 = (s) (param2.field_j.a((byte) -73));
          while (var8 != null) {
            var9 = (int)var8.field_d;
            var12 = (fb) (this.field_A.a((byte) 92, (long)var9));
            if (var12 == null) {
              stackIn_13_0 = var9;
              stackIn_13_1 = (lj) (param3);
              stackIn_14_2 = !(param0);
              var13 = dh.a(stackIn_13_0, stackIn_13_1, stackIn_14_2);
              if (var13 == null) {
                var6_int = 0;
              } else {
                this.field_A.a(-104, var13, (long)var9);
                if (!var13.a(param1, (int[]) (var7), (byte) 94, var8.field_o)) {
                  var6_int = 0;
                }
              }
            } else {
              if (!var12.a(param1, (int[]) (var7), (byte) 94, var8.field_o)) {
                var6_int = 0;
                var8 = (s) (param2.field_j.a(-27377));
                continue;
              }
            }
            var8 = (s) (param2.field_j.a(-27377));
          }
          if (var6_int != 0) {
            param2.b();
          }
          stackIn_23_0 = var6_int;
          return stackIn_23_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_26_0 = var6;
          stackIn_26_1 = new StringBuilder().append("kb.KA(").append(param0).append(',');
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
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(byte param0, dl param1) {
        int stackIn_2_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ab var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = param1.field_u + (param1.field_m * param1.field_o >> 12);
          var3_int = var3_int + (this.field_p[param1.field_G] * (-8192 + this.field_n[param1.field_G]) >> 12);
          var4 = param1.field_I;
          if (param0 != 35) {
            stackIn_2_0 = -46;
            return stackIn_2_0;
          }
          if (var4.field_j > 0 && (!(0 >= var4.field_a) ||
            this.field_o[param1.field_G] > 0)) {
            var5 = var4.field_a << 2;
            var6 = var4.field_l << 1;
            if (param1.field_A < var6) {
              var5 = var5 * param1.field_A / var6;
            }
            var5 = var5 + (this.field_o[param1.field_G] >> 7);
            var7 = Math.sin(0.01227184630308513 * (double)(511 & param1.field_w));
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          var5Lifetime1 = (int)(0.5 + (double)(param1.field_k.field_j * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)kh.field_p);
          stackIn_13_0 = (var5Lifetime1 < 1) ? 1 : var5Lifetime1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("kb.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 <= 10) {
          this.field_p = (int[]) null;
        }
        this.field_q[param1] = param0;
        this.field_F[param1] = jh.a(param0, -128);
        this.a(param0, (byte) 122, param1);
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 109 % ((param1 + 2) / 52);
    }

    final boolean a(int param0, byte param1, int[] param2, int param3, dl param4) {
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ab var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          param4.field_z = kh.field_p / 100;
          if (param4.field_F >= 0 && (null == param4.field_K ||
            param4.field_K.j())) {
            param4.a(1047574608);
            param4.a(true);
            if (param4.field_i > 0 &&
              param4 == this.field_v[param4.field_G][param4.field_i]) {
              this.field_v[param4.field_G][param4.field_i] = null;
              return true;
            }
            return true;
          }
          var6_int = param4.field_m;
          var7 = 81 / ((-32 - param1) / 38);
          if (0 < var6_int) {
            var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_L[param4.field_G]));
            if (var6_int < 0) {
              var6_int = 0;
            }
            param4.field_m = var6_int;
          }
          param4.field_K.c(this.a((byte) 35, param4));
          var8 = param4.field_I;
          param4.field_A = param4.field_A + 1;
          param4.field_w = param4.field_w + var8.field_j;
          var9 = 0;
          var10 = (double)((param4.field_m * param4.field_o >> 12) + (-60 + param4.field_p << 8)) * 0.000005086263020833333;
          if (var8.field_i > 0) {
            if (var8.field_h <= 0) {
              param4.field_D = param4.field_D + 128;
            } else {
              param4.field_D = param4.field_D + (int)(0.5 + Math.pow(2.0, var10 * (double)var8.field_h) * 128.0);
            }
            if (var8.field_i * param4.field_D >= 819200) {
              var9 = 1;
            }
          }
          if (var8.field_k != null) {
            if (0 < var8.field_c) {
              param4.field_v = param4.field_v + (int)(128.0 * Math.pow(2.0, (double)var8.field_c * var10) + 0.5);
            } else {
              param4.field_v = param4.field_v + 128;
            }
            while (-2 + var8.field_k.length > param4.field_J) {
              if ((255 & var8.field_k[param4.field_J + 2]) << 8 < param4.field_v) {
                param4.field_J = param4.field_J + 2;
                continue;
              }
              break;
            }
            if (var8.field_k.length - 2 == param4.field_J &&
              var8.field_k[param4.field_J + 1] == 0) {
              var9 = 1;
            }
          }
          if (param4.field_F >= 0 &&
            var8.field_b != null &&
            0 == (1 & this.field_J[param4.field_G]) && (!(param4.field_i >= 0) ||
            param4 != this.field_v[param4.field_G][param4.field_i])) {
            if (var8.field_f > 0) {
              param4.field_F = param4.field_F + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var8.field_f * var10));
            } else {
              param4.field_F = param4.field_F + 128;
            }
            while (param4.field_B < -2 + var8.field_b.length) {
              if (param4.field_F > (65280 & var8.field_b[param4.field_B + 2] << 8)) {
                param4.field_B = param4.field_B + 2;
                continue;
              }
              break;
            }
            if (var8.field_b.length - 2 == param4.field_B) {
              var9 = 1;
            }
          }
          if (var9 == 0) {
            param4.field_K.a(param4.field_z, this.a(param4, true), this.a(80, param4));
            return false;
          }
          param4.field_K.g(param4.field_z);
          if (param2 != null) {
            param4.field_K.b(param2, param0, param3);
          } else {
            param4.field_K.a(param3);
          }
          if (param4.field_K.l()) {
            this.field_I.field_u.a(param4.field_K);
          }
          param4.a(1047574608);
          if (0 <= param4.field_F) {
            param4.a(true);
            if (param4.field_i > 0 &&
              this.field_v[param4.field_G][param4.field_i] == param4) {
              this.field_v[param4.field_G][param4.field_i] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_67_0 = var6;
          stackIn_67_1 = new StringBuilder().append("kb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
        }
    }

    private final int a(dl param0, boolean param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kb var9 = null;
        ab var10 = null;
        ab var11 = null;
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
          if (0 == this.field_w[param0.field_G]) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (!param1) {
            var9 = (kb) null;
            kb.a(-89, -61, (uj) null, false, (java.awt.Component) null, (kb) null);
          }
          var10 = param0.field_I;
          var11 = var10;
          var4 = 4096 + this.field_E[param0.field_G] * this.field_u[param0.field_G] >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = 16384 + var4 * param0.field_t >> 15;
          var4 = 128 + var4 * this.field_m >> 8;
          var4 = this.field_w[param0.field_G] * var4 + 128 >> 8;
          if (var11.field_i > 0) {
            var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, (double)param0.field_D * 0.00001953125 * (double)var11.field_i));
          }
          if (null != var11.field_k) {
            var5 = param0.field_v;
            var6 = var11.field_k[param0.field_J + 1];
            if (param0.field_J < var11.field_k.length - 2) {
              var7 = (var10.field_k[param0.field_J] & 255) << 8;
              var8 = 65280 & var11.field_k[2 + param0.field_J] << 8;
              var6 = var6 + (var5 - var7) * (var11.field_k[param0.field_J + 3] - var6) / (-var7 + var8);
            }
            var4 = 32 + var4 * var6 >> 6;
          }
          if (0 < param0.field_F &&
            var11.field_b != null) {
            var5Lifetime1 = param0.field_F;
            var6Lifetime1 = var11.field_b[param0.field_B + 1];
            if (-2 + var11.field_b.length > param0.field_B) {
              var7Lifetime1 = var10.field_b[param0.field_B] << 8 & 65280;
              var8Lifetime1 = var11.field_b[2 + param0.field_B] << 8 & 65280;
              var6Lifetime1 = var6Lifetime1 + (var11.field_b[param0.field_B + 3] - var6Lifetime1) * (-var7Lifetime1 + var5Lifetime1) / (-var7Lifetime1 + var8Lifetime1);
            }
            var4 = var4 * var6Lifetime1 + 32 >> 6;
          }
          stackIn_19_0 = var4;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("kb.A(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, byte param1) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (param1 <= 84) {
          return;
        }
        dl var3 = (dl) (this.field_I.field_o.c((byte) 120));
        while (var3 != null) {
          if ((0 > param0 || param0 == var3.field_G) &&
            var3.field_F < 0) {
            this.field_r[var3.field_G][var3.field_p] = null;
            var3.field_F = 0;
          }
          var3 = (dl) (this.field_I.field_o.c(-270));
        }
    }

    final synchronized qd b() {
        return null;
    }

    final synchronized qd c() {
        return (qd) ((Object) this.field_I);
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int discarded$0 = 0;
        int stackIn_17_1 = 0;
        boolean stackIn_18_2 = false;
        dl var5;
        int var6_int;
        fe var6;
        dl var7;
        dl var8;
        int var9;
        dl var10;
        fb var11;
        fb var12;
        var9 = TorChallenge.field_F ? 1 : 0;
        this.a(param2, 64, param3, 9208);
        if (0 != (this.field_J[param2] & 2)) {
          var5 = (dl) (this.field_I.field_o.b((byte) 65));
          while (var5 != null) {
            if (param2 == var5.field_G &&
              var5.field_F < 0) {
              this.field_r[param2][var5.field_p] = null;
              this.field_r[param2][param3] = var5;
              var6_int = var5.field_u + (var5.field_m * var5.field_o >> 12);
              var5.field_u = var5.field_u + (-var5.field_p + param3 << 8);
              var5.field_p = param3;
              var5.field_m = 4096;
              var5.field_o = var6_int - var5.field_u;
              return;
            }
            var5 = (dl) (this.field_I.field_o.e((byte) -112));
          }
        }
        var11 = (fb) (this.field_A.a((byte) 100, (long)this.field_t[param2]));
        var12 = var11;
        if (var12 == null) {
          return;
        }
        var6 = var11.field_k[param3];
        if (var6 == null) {
          return;
        }
        var7 = new dl();
        var7.field_G = param2;
        if (param1 != -10825) {
          var10 = (dl) null;
          discarded$0 = this.a((byte) 114, (dl) null);
        }
        var7.field_k = var6;
        var7.field_q = var11;
        var7.field_I = var11.field_o[param3];
        var7.field_i = var11.field_q[param3];
        var7.field_p = param3;
        var7.field_t = param0 * param0 * (var11.field_p * var11.field_l[param3]) + 1024 >> 11;
        var7.field_y = var11.field_n[param3] & 255;
        var7.field_u = (param3 << 8) - (var11.field_j[param3] & 32767);
        var7.field_B = 0;
        var7.field_v = 0;
        var7.field_J = 0;
        var7.field_F = -1;
        var7.field_D = 0;
        if (this.field_y[param2] != 0) {
          var7.field_K = nc.b(var6, this.a((byte) 35, var7), 0, this.a(96, var7));
          stackIn_17_1 = 256;
          stackIn_18_2 = !(var12.field_j[param3] >= 0);
          this.a(stackIn_17_1, stackIn_18_2, var7);
        } else {
          var7.field_K = nc.b(var6, this.a((byte) 35, var7), this.a(var7, true), this.a(param1 + 10713, var7));
        }
        if (var12.field_j[param3] < 0) {
          var7.field_K.e(-1);
        }
        if (var7.field_i >= 0) {
          var8 = this.field_v[param2][var7.field_i];
          if (var8 != null &&
            var8.field_F < 0) {
            this.field_r[param2][var8.field_p] = null;
            var8.field_F = 0;
          }
          this.field_v[param2][var7.field_i] = var7;
        }
        this.field_I.field_o.a(var7, -53);
        this.field_r[param2][param3] = var7;
        return;
    }

    final synchronized void b(boolean param0) {
        int var3 = TorChallenge.field_F ? 1 : 0;
        if (!param0) {
          this.field_r = (dl[][]) null;
        }
        fb var4 = (fb) (this.field_A.a((byte) -73));
        while (var4 != null) {
          var4.b((byte) -127);
          var4 = (fb) (this.field_A.a(-27377));
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        dl var6 = null;
        int var7 = TorChallenge.field_F ? 1 : 0;
        if (param3 != 9208) {
          this.field_x = 71L;
        }
        dl var8 = this.field_r[param0][param2];
        if (var8 == null) {
          return;
        }
        this.field_r[param0][param2] = null;
        if (0 == (this.field_J[param0] & 2)) {
          var8.field_F = 0;
        } else {
          var6 = (dl) (this.field_I.field_o.c((byte) 110));
          while (var6 != null) {
            if (var8.field_G == var6.field_G &&
              var6.field_F < 0 &&
              var8 != var6) {
              var8.field_F = 0;
              break;
            }
            var6 = (dl) (this.field_I.field_o.c(-270));
          }
        }
    }

    public static void c(int param0) {
        if (param0 != 128) {
          kb var2 = (kb) null;
          kb.a(116, 24, (uj) null, true, (java.awt.Component) null, (kb) null);
        }
        field_O = null;
    }

    final boolean a(dl param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.field_K) {
            if (param1 != 22) {
              this.field_z = -13;
            }
            return false;
          }
          if (0 > param0.field_F) {
            return true;
          }
          param0.a(true);
          if (param0.field_i > 0 &&
            param0 == this.field_v[param0.field_G][param0.field_i]) {
            this.field_v[param0.field_G][param0.field_i] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("kb.K(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    public kb() {
        this.field_J = new int[16];
        this.field_F = new int[16];
        this.field_q = new int[16];
        this.field_E = new int[16];
        this.field_r = new dl[16][128];
        this.field_y = new int[16];
        this.field_t = new int[16];
        this.field_L = new int[16];
        this.field_s = 1000000;
        this.field_m = 256;
        this.field_p = new int[16];
        this.field_G = new int[16];
        this.field_D = new int[16];
        this.field_n = new int[16];
        this.field_N = new int[16];
        this.field_w = new int[16];
        this.field_v = new dl[16][128];
        this.field_u = new int[16];
        this.field_R = new int[16];
        this.field_o = new int[16];
        this.field_P = new pc();
        this.field_I = new pg(this);
        this.field_A = new ha(128);
        this.a(-3262, 256, -1);
        this.a(-1863960953, true);
    }

    static {
    }
}
