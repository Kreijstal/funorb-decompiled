/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj extends di {
    private int[] field_p;
    static int field_u;
    private int[] field_x;
    int[] field_o;
    private int[] field_n;
    private int[] field_y;
    private mh field_j;
    int[] field_L;
    private int[] field_C;
    private int[] field_F;
    int[] field_D;
    private int[] field_A;
    private int[] field_Q;
    private int[] field_v;
    private int[] field_w;
    private int[] field_G;
    private he[][] field_t;
    static int field_E;
    private int field_k;
    static String field_B;
    private int[] field_J;
    static hj field_N;
    private int[] field_H;
    static kc field_m;
    private he[][] field_I;
    private qi field_S;
    private int field_K;
    private long field_R;
    private jg field_O;
    private boolean field_z;
    private int field_s;
    private int field_q;
    private long field_l;
    private fj field_M;
    private boolean field_r;
    private int field_P;

    private final void b(int param0, int param1, int param2, int param3) {
        he var6;
        int var7;
        he var8;
        var7 = OrbDefence.field_D ? 1 : 0;
        var8 = this.field_I[param3][param1];
        if (var8 == null) {
          return;
        }
        this.field_I[param3][param1] = null;
        if (param2 != -16257) {
          return;
        }
        {
          if ((this.field_o[param3] & 2) != 0) {
            var6 = (he) (this.field_O.field_k.b((byte) -75));
            while (var6 != null) {
              if (var8.field_F == var6.field_F &&
                var6.field_n < 0 &&
                var8 != var6) {
                var8.field_n = 0;
                break;
              }
              var6 = (he) (this.field_O.field_k.d(853));
            }
          } else {
            var8.field_n = 0;
          }
        }
    }

    private final void a(byte param0, int param1) {
        he var3;
        int var4;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 >= -40) {
          return;
        }
        if (0 != (this.field_o[param1] & 2)) {
          var3 = (he) (this.field_O.field_k.b((byte) 121));
          while (var3 != null) {
            if (var3.field_F == param1) {
              if (null != this.field_I[param1][var3.field_h]) {
                var3 = (he) (this.field_O.field_k.d(853));
                continue;
              }
              if (var3.field_n < 0) {
                var3.field_n = 0;
              }
            }
            var3 = (he) (this.field_O.field_k.d(853));
          }
        }
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = OrbDefence.field_D ? 1 : 0;
        int var3Lifetime1;
        if (param1) {
          this.a(-1, (byte) -109);
        } else {
          this.b((byte) -12, -1);
        }
        this.b(-1, (byte) 102);
        for (var3 = 0; 16 > var3; var3++) {
          this.field_F[var3] = this.field_J[var3];
        }
        if (param0 != 28034) {
          this.field_o = (int[]) null;
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < 16) {
          this.field_H[var5] = vi.a(-128, this.field_J[var5]);
          var5++;
        }
    }

    private final void a(byte param0) {
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = OrbDefence.field_D ? 1 : 0;
        if (param0 >= -50) {
          return;
        }
        var2 = this.field_q;
        var3 = this.field_s;
        var4 = this.field_R;
        if (this.field_M != null &&
          this.field_P == var3) {
          this.a(this.field_z, -112, this.field_r, this.field_M);
          this.a((byte) -90);
          return;
        }
        while (true) {
          if (var3 != this.field_s) {
            this.field_s = var3;
            this.field_q = var2;
            this.field_R = var4;
            if (this.field_M != null) {
              stackIn_24_0 = this.field_P;
              stackIn_24_1 = var3;
              if (stackIn_24_0 < stackIn_24_1) {
                this.field_s = this.field_P;
                this.field_q = -1;
                this.field_R = this.field_S.f(this.field_s);
              }
            }
            return;
          }
          while (~this.field_S.field_i[var2] == ~var3) {
            this.field_S.c(var2);
            var6 = this.field_S.b(var2);
            if (var6 != 1) {
              if ((128 & var6) != 0) {
                this.c(var6, (byte) 93);
              }
              this.field_S.d(var2);
              this.field_S.a(var2);
              continue;
            }
            this.field_S.g();
            this.field_S.a(var2);
            if (this.field_S.c()) {
              if (null != this.field_M) {
                this.a(-23335, this.field_z, this.field_M);
                this.a((byte) -115);
                return;
              }
              if (this.field_z &&
                0 != var3) {
                this.field_S.b(var4);
              } else {
                this.a(28034, true);
                this.field_S.e();
                return;
              }
            }
            break;
          }
          var2 = this.field_S.d();
          var3 = this.field_S.field_i[var2];
          var4 = this.field_S.f(var3);
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = OrbDefence.field_D ? 1 : 0;
        if (param0 != this.field_F[param2]) {
          this.field_F[param2] = param0;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_t[param2][var4] = null;
          }
        }
        if (param1 != -129) {
          this.a();
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var7 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          if (this.field_S.b()) {
            var4_int = this.field_K * this.field_S.field_f / la.field_c;
            while (true) {
              var5 = (long)param2 * (long)var4_int + this.field_l;
              if (0L <= -var5 + this.field_R) {
                this.field_l = var5;
                break;
              }
              var7 = (int)((-1L + ((long)var4_int - this.field_l) + this.field_R) / (long)var4_int);
              this.field_l = this.field_l + (long)var7 * (long)var4_int;
              this.field_O.b(param0, param1, var7);
              param1 = param1 + var7;
              param2 = param2 - var7;
              this.a((byte) -58);
              if (this.field_S.b()) {
                continue;
              }
              this.field_O.b(param0, param1, param2);
              return;
            }
          }
          this.field_O.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("lj.B(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1) {
        he var3 = null;
        int var4 = OrbDefence.field_D ? 1 : 0;
        if ((this.field_o[param1] & 4) != 0) {
          var3 = (he) (this.field_O.field_k.b((byte) 115));
          while (var3 != null) {
            if (param1 == var3.field_F) {
              var3.field_i = 0;
            }
            var3 = (he) (this.field_O.field_k.d(853));
          }
        }
        if (param0 < 103) {
          this.field_L = (int[]) null;
        }
    }

    final synchronized void b(int param0, int param1) {
        if (param1 < 103) {
          fj var4 = (fj) null;
          this.a((ki) null, (vd) null, (byte) -88, (fj) null, 47);
        }
        this.field_k = param0;
    }

    final void a(he param0, boolean param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param0.field_D.field_g.length;
          if (param1 &&
            param0.field_D.field_k) {
            var6 = var4_int + var4_int - param0.field_D.field_i;
            var5 = (int)((long)this.field_D[param0.field_F] * (long)var6 >> 6);
            var4_int = var4_int << 8;
            if (var4_int <= var5) {
              var5 = -var5 + (-1 + var4_int + var4_int);
              param0.field_l.c(true);
            }
          } else {
            var5 = (int)((long)this.field_D[param0.field_F] * (long)var4_int >> 6);
          }
          if (param2 != 9929) {
            this.field_j = (mh) null;
          }
          param0.field_l.e(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("lj.Q(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized di d() {
        return null;
    }

    final synchronized di a() {
        return (di) ((Object) this.field_O);
    }

    private final int a(byte param0, he param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        rc var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = param1.field_k + (param1.field_z * param1.field_A >> 12);
          var3_int = var3_int + (this.field_v[param1.field_F] * (-8192 + this.field_Q[param1.field_F]) >> 12);
          var4 = param1.field_x;
          if (var4.field_h > 0 && (!(0 >= var4.field_j) ||
            this.field_n[param1.field_F] > 0)) {
            var5 = var4.field_j << 2;
            var6 = var4.field_b << 1;
            if (var6 > param1.field_v) {
              var5 = var5 * param1.field_v / var6;
            }
            var5 = var5 + (this.field_n[param1.field_F] >> 7);
            var7 = Math.sin((double)(511 & param1.field_E) * 0.01227184630308513);
            var3_int = var3_int + (int)((double)var5 * var7);
          }
          var5Lifetime1 = (int)((double)(param1.field_D.field_h * 256) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)la.field_c + 0.5);
          if (param0 != 54) {
            this.field_p = (int[]) null;
          }
          stackIn_13_0 = (1 > var5Lifetime1) ? 1 : var5Lifetime1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("lj.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final synchronized void a(boolean param0, int param1, boolean param2, fj param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = OrbDefence.field_D ? 1 : 0;
        try {
          this.a(param2, 8841);
          this.field_S.a(param3.field_f);
          this.field_l = 0L;
          this.field_z = param0 ? true : false;
          if (param1 >= -56) {
            he var8 = (he) null;
            this.a((he) null, false, -61);
          }
          var5_int = this.field_S.f();
          for (var6 = 0; var5_int > var6; var6++) {
            this.field_S.c(var6);
            this.field_S.d(var6);
            this.field_S.a(var6);
          }
          this.field_q = this.field_S.d();
          this.field_s = this.field_S.field_i[this.field_q];
          this.field_R = this.field_S.f(this.field_s);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "lj.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0, byte param1) {
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
        var8 = OrbDefence.field_D ? 1 : 0;
        var3 = 240 & param0;
        if (var3 == 128) {
          var4 = 15 & param0;
          var5 = 127 & param0 >> 8;
          var6 = param0 >> 16 & 127;
          this.b(var6, var5, -16257, var4);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = 15 & param0;
          var5Lifetime1 = (param0 & 32722) >> 8;
          var6Lifetime1 = 127 & param0 >> 16;
          if (var6Lifetime1 > 0) {
            this.a(var4Lifetime1, var5Lifetime1, (byte) 96, var6Lifetime1);
          } else {
            this.b(64, var5Lifetime1, -16257, var4Lifetime1);
          }
          return;
        }
        if (var3 == 160) {
          var4Lifetime2 = param0 & 15;
          var5Lifetime2 = 127 & param0 >> 8;
          var6Lifetime2 = (param0 & 8384371) >> 16;
          this.a(var4Lifetime2, -17615, var6Lifetime2, var5Lifetime2);
          return;
        }
        if (var3 != 176) {
          if (var3 == 192) {
            var4Lifetime3 = param0 & 15;
            var5Lifetime3 = param0 >> 8 & 127;
            this.c(var5Lifetime3 + this.field_H[var4Lifetime3], -129, var4Lifetime3);
            return;
          }
          if (param1 != 93) {
            this.field_M = (fj) null;
          }
          if (208 == var3) {
            var4Lifetime3Lifetime1 = param0 & 15;
            var5Lifetime3Lifetime1 = param0 >> 8 & 127;
            this.a(var4Lifetime3Lifetime1, true, var5Lifetime3Lifetime1);
            return;
          }
          if (var3 == 224) {
            var4Lifetime3Lifetime2 = 15 & param0;
            var5Lifetime3Lifetime2 = (16256 & param0 >> 9) + (127 & param0 >> 8);
            this.a(var4Lifetime3Lifetime2, 78, var5Lifetime3Lifetime2);
            return;
          }
          var3 = param0 & 255;
          if (var3 != 255) {
            return;
          }
          this.a(28034, true);
          return;
        }
        var4Lifetime4 = 15 & param0;
        var5Lifetime4 = param0 >> 8 & 127;
        var6Lifetime3 = (8354193 & param0) >> 16;
        if (var5Lifetime4 == 0) {
          this.field_H[var4Lifetime4] = vi.a(-2080769, this.field_H[var4Lifetime4]) + (var6Lifetime3 << 14);
        }
        if (var5Lifetime4 == 32) {
          this.field_H[var4Lifetime4] = (var6Lifetime3 << 7) + vi.a(this.field_H[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 1) {
          this.field_n[var4Lifetime4] = vi.a(this.field_n[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (33 == var5Lifetime4) {
          this.field_n[var4Lifetime4] = var6Lifetime3 + vi.a(this.field_n[var4Lifetime4], -128);
        }
        if (var5Lifetime4 == 5) {
          this.field_G[var4Lifetime4] = (var6Lifetime3 << 7) + vi.a(this.field_G[var4Lifetime4], -16257);
        }
        if (37 == var5Lifetime4) {
          this.field_G[var4Lifetime4] = vi.a(-128, this.field_G[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 7) {
          this.field_w[var4Lifetime4] = vi.a(this.field_w[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 39) {
          this.field_w[var4Lifetime4] = vi.a(-128, this.field_w[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 10) {
          this.field_y[var4Lifetime4] = (var6Lifetime3 << 7) + vi.a(-16257, this.field_y[var4Lifetime4]);
        }
        if (var5Lifetime4 == 42) {
          this.field_y[var4Lifetime4] = vi.a(-128, this.field_y[var4Lifetime4]) + var6Lifetime3;
        }
        if (11 == var5Lifetime4) {
          this.field_x[var4Lifetime4] = (var6Lifetime3 << 7) + vi.a(this.field_x[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 43) {
          this.field_x[var4Lifetime4] = var6Lifetime3 + vi.a(this.field_x[var4Lifetime4], -128);
        }
        if (var5Lifetime4 == 64) {
          if (64 > var6Lifetime3) {
            this.field_o[var4Lifetime4] = vi.a(this.field_o[var4Lifetime4], -2);
          } else {
            this.field_o[var4Lifetime4] = ge.a(this.field_o[var4Lifetime4], 1);
          }
        }
        if (65 == var5Lifetime4) {
          if (var6Lifetime3 < 64) {
            this.a((byte) -66, var4Lifetime4);
            this.field_o[var4Lifetime4] = vi.a(this.field_o[var4Lifetime4], -3);
          } else {
            this.field_o[var4Lifetime4] = ge.a(this.field_o[var4Lifetime4], 2);
          }
        }
        if (var5Lifetime4 == 99) {
          this.field_p[var4Lifetime4] = (var6Lifetime3 << 7) + vi.a(this.field_p[var4Lifetime4], 127);
        }
        if (98 == var5Lifetime4) {
          this.field_p[var4Lifetime4] = var6Lifetime3 + vi.a(16256, this.field_p[var4Lifetime4]);
        }
        if (var5Lifetime4 == 101) {
          this.field_p[var4Lifetime4] = (var6Lifetime3 << 7) + 16384 + vi.a(127, this.field_p[var4Lifetime4]);
        }
        if (var5Lifetime4 == 100) {
          this.field_p[var4Lifetime4] = vi.a(16256, this.field_p[var4Lifetime4]) + (16384 + var6Lifetime3);
        }
        if (var5Lifetime4 == 120) {
          this.a(var4Lifetime4, (byte) -82);
        }
        if (121 == var5Lifetime4) {
          this.b(var4Lifetime4, (byte) 121);
        }
        if (var5Lifetime4 == 123) {
          this.b((byte) -12, var4Lifetime4);
        }
        if (6 == var5Lifetime4) {
          var7 = this.field_p[var4Lifetime4];
          if (var7 == 16384) {
            this.field_v[var4Lifetime4] = (var6Lifetime3 << 7) + vi.a(-16257, this.field_v[var4Lifetime4]);
          }
        }
        if (var5Lifetime4 == 38) {
          var7Lifetime1 = this.field_p[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.field_v[var4Lifetime4] = vi.a(-128, this.field_v[var4Lifetime4]) + var6Lifetime3;
          }
        }
        if (var5Lifetime4 == 16) {
          this.field_D[var4Lifetime4] = vi.a(this.field_D[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 48) {
          this.field_D[var4Lifetime4] = var6Lifetime3 + vi.a(-128, this.field_D[var4Lifetime4]);
        }
        if (var5Lifetime4 == 81) {
          if (64 <= var6Lifetime3) {
            this.field_o[var4Lifetime4] = ge.a(this.field_o[var4Lifetime4], 4);
          } else {
            this.a(120, var4Lifetime4);
            this.field_o[var4Lifetime4] = vi.a(this.field_o[var4Lifetime4], -5);
          }
        }
        if (var5Lifetime4 == 17) {
          this.b(var4Lifetime4, (var6Lifetime3 << 7) + (-16257 & this.field_C[var4Lifetime4]), param1 - 166);
        }
        if (var5Lifetime4 != 49) {
          return;
        }
        this.b(var4Lifetime4, (-128 & this.field_C[var4Lifetime4]) + var6Lifetime3, param1 - 208);
    }

    private final synchronized void b(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (param2 < 0) {
          for (var4 = 0; var4 < 16; var4++) {
            this.field_A[var4] = param0;
          }
        } else {
          this.field_A[param2] = param0;
        }
        if (param1) {
          this.a((byte) 102, -79);
        }
    }

    final synchronized void a(int param0, int param1, byte param2) {
        this.b(param1, param0, (byte) -114);
        if (param2 <= 63) {
          fj var5 = (fj) null;
          this.a(13, false, (fj) null);
        }
    }

    final synchronized void a(boolean param0, fj param1, int param2, boolean param3, int param4, int param5) {
        int var7_int = 0;
        int var8 = 0;
        if (!this.field_S.b()) {
          this.a(-23335, param3, param1);
          return;
        }
        try {
          this.field_z = param3 ? true : false;
          this.field_M = param1;
          if (param5 > -103) {
            fj var9 = (fj) null;
            this.a(true, -73, true, (fj) null);
          }
          this.field_r = param0 ? true : false;
          var7_int = this.field_S.a(this.field_l) * param4;
          var8 = this.field_S.field_f * param2;
          var7_int = (-1 + (var7_int + var8)) / var8 * var8;
          this.field_P = ((param4 >> 1) + var7_int) / param4;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "lj.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        he stackIn_18_1 = null;
        boolean stackIn_19_2 = false;
        he var5;
        int var6_int;
        dl var6;
        he var7;
        int var8;
        he var9;
        int var10;
        ik var11;
        ik var12;
        var10 = OrbDefence.field_D ? 1 : 0;
        this.b(64, param1, -16257, param0);
        if ((2 & this.field_o[param0]) != 0) {
          var5 = (he) (this.field_O.field_k.d((byte) -122));
          while (var5 != null) {
            if (param0 == var5.field_F &&
              var5.field_n < 0) {
              this.field_I[param0][var5.field_h] = null;
              this.field_I[param0][param1] = var5;
              var6_int = var5.field_k + (var5.field_z * var5.field_A >> 12);
              var5.field_k = var5.field_k + (param1 - var5.field_h << 8);
              var5.field_A = 4096;
              var5.field_z = -var5.field_k + var6_int;
              var5.field_h = param1;
              return;
            }
            var5 = (he) (this.field_O.field_k.b(10708));
          }
        }
        var11 = (ik) (this.field_j.a((long)this.field_F[param0], -1));
        var12 = var11;
        if (var12 == null) {
          return;
        }
        var6 = var11.field_g[param1];
        if (var6 == null) {
          return;
        }
        var7 = new he();
        var7.field_D = var6;
        var7.field_F = param0;
        var7.field_g = var11;
        var7.field_x = var11.field_f[param1];
        var7.field_f = var11.field_h[param1];
        var7.field_h = param1;
        var8 = 14 / ((-10 - param2) / 43);
        var7.field_t = var11.field_j[param1] * (var12.field_l * param3 * param3) + 1024 >> 11;
        var7.field_q = 255 & var11.field_k[param1];
        var7.field_k = -(32767 & var11.field_m[param1]) + (param1 << 8);
        var7.field_m = 0;
        var7.field_B = 0;
        var7.field_j = 0;
        var7.field_n = -1;
        var7.field_s = 0;
        if (this.field_D[param0] != 0) {
          var7.field_l = bb.a(var6, this.a((byte) 54, var7), 0, this.b(2, var7));
          stackIn_18_1 = var7;
          stackIn_19_2 = !(var12.field_m[param1] >= 0);
          this.a(stackIn_18_1, stackIn_19_2, 9929);
        } else {
          var7.field_l = bb.a(var6, this.a((byte) 54, var7), this.a(-24531, var7), this.b(2, var7));
        }
        if (var12.field_m[param1] < 0) {
          var7.field_l.d(-1);
        }
        if (var7.field_f >= 0) {
          var9 = this.field_t[param0][var7.field_f];
          if (var9 != null &&
            var9.field_n < 0) {
            this.field_I[param0][var9.field_h] = null;
            var9.field_n = 0;
          }
          this.field_t[param0][var7.field_f] = var7;
        }
        this.field_O.field_k.a(-73, var7);
        this.field_I[param0][param1] = var7;
        return;
    }

    final synchronized void b(byte param0) {
        int var3 = OrbDefence.field_D ? 1 : 0;
        if (param0 <= 24) {
          this.field_t = (he[][]) null;
        }
        ik var4 = (ik) (this.field_j.a((byte) 125));
        while (var4 != null) {
          var4.c(false);
          var4 = (ik) (this.field_j.c((byte) -87));
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        if (!param1) {
          this.field_A = (int[]) null;
        }
    }

    final synchronized int c() {
        return 0;
    }

    final synchronized boolean f(int param0) {
        if (param0 >= -20) {
          field_N = (hj) null;
        }
        return this.field_S.b();
    }

    private final synchronized void a(boolean param0, int param1) {
        if (param1 != 8841) {
          this.field_A = (int[]) null;
        }
        this.field_S.e();
        this.field_M = null;
        this.a(param1 ^ 20235, param0);
    }

    final synchronized void c(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        boolean decompiledFrameCompleted0 = true;
        var6 = OrbDefence.field_D ? 1 : 0;
        if (this.field_S.b()) {
          var2 = this.field_K * this.field_S.field_f / la.field_c;
          while (true) {
            var3 = (long)param0 * (long)var2 + this.field_l;
            if (this.field_R - var3 >= 0L) {
              this.field_l = var3;
              break;
            }
            var5 = (int)((-1L - this.field_l + (this.field_R + (long)var2)) / (long)var2);
            this.field_l = this.field_l + (long)var2 * (long)var5;
            param0 = param0 - var5;
            this.field_O.c(var5);
            this.a((byte) -105);
            if (this.field_S.b()) {
              continue;
            }
            this.field_O.c(param0);
            decompiledFrameCompleted0 = false;
            break;
          }
        }
        if (decompiledFrameCompleted0) {
          this.field_O.c(param0);
        }

    }

    private final void a(int param0, int param1, int param2) {
        if (param1 <= 49) {
          return;
        }
        this.field_Q[param0] = param2;
    }

    private final void a(int param0, byte param1) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param1 >= -66) {
          return;
        }
        he var3 = (he) (this.field_O.field_k.b((byte) 114));
        while (var3 != null) {
          if (param0 < 0 ||
            param0 == var3.field_F) {
            if (null != var3.field_l) {
              var3.field_l.f(la.field_c / 100);
              if (var3.field_l.e()) {
                this.field_O.field_m.a(var3.field_l);
              }
              var3.d(5);
            }
            if (!(0 <= var3.field_n)) {
              this.field_I[var3.field_F][var3.field_h] = null;
            }
            var3.b(57);
          }
          var3 = (he) (this.field_O.field_k.d(853));
        }
    }

    final boolean a(int param0, he param1, int param2, int param3, int[] param4) {
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        rc var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          param1.field_w = la.field_c / 100;
          if (param1.field_n >= 0 && (null == param1.field_l ||
            param1.field_l.k())) {
            param1.d(param0 ^ 4165);
            param1.b(57);
            if (param1.field_f > 0) {
              if (this.field_t[param1.field_F][param1.field_f] != param1) {
                return true;
              }
              this.field_t[param1.field_F][param1.field_f] = null;
            }
            return true;
          }
          var6_int = param1.field_A;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(0.5 + Math.pow(2.0, 0.0004921259842519685 * (double)this.field_G[param1.field_F]) * 16.0);
            if (0 > var6_int) {
              var6_int = 0;
            }
            param1.field_A = var6_int;
          }
          param1.field_l.h(this.a((byte) 54, param1));
          if (param0 != 4160) {
            this.a((byte) 116);
          }
          var7 = param1.field_x;
          param1.field_E = param1.field_E + var7.field_h;
          param1.field_v = param1.field_v + 1;
          var8 = 0;
          var9 = 0.000005086263020833333 * (double)((param1.field_A * param1.field_z >> 12) + (param1.field_h - 60 << 8));
          if (var7.field_c > 0) {
            if (0 < var7.field_k) {
              param1.field_s = param1.field_s + (int)(Math.pow(2.0, (double)var7.field_k * var9) * 128.0 + 0.5);
            } else {
              param1.field_s = param1.field_s + 128;
            }
            if (819200 <= param1.field_s * var7.field_c) {
              var8 = 1;
            }
          }
          if (null != var7.field_l) {
            if (0 < var7.field_g) {
              param1.field_B = param1.field_B + (int)(0.5 + Math.pow(2.0, (double)var7.field_g * var9) * 128.0);
            } else {
              param1.field_B = param1.field_B + 128;
            }
            while (var7.field_l.length - 2 > param1.field_m) {
              if ((var7.field_l[param1.field_m + 2] << 8 & 65280) < param1.field_B) {
                param1.field_m = param1.field_m + 2;
                continue;
              }
              break;
            }
            if (-2 + var7.field_l.length == param1.field_m &&
              var7.field_l[1 + param1.field_m] == 0) {
              var8 = 1;
            }
          }
          if (param1.field_n >= 0 &&
            null != var7.field_e &&
            0 == (this.field_o[param1.field_F] & 1) && (!(param1.field_f >= 0) ||
            param1 != this.field_t[param1.field_F][param1.field_f])) {
            if (var7.field_f > 0) {
              param1.field_n = param1.field_n + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_f * var9));
            } else {
              param1.field_n = param1.field_n + 128;
            }
            while (param1.field_j < var7.field_e.length - 2) {
              if (((var7.field_e[param1.field_j + 2] & 255) << 8) < param1.field_n) {
                param1.field_j = param1.field_j + 2;
                continue;
              }
              break;
            }
            if (-2 + var7.field_e.length == param1.field_j) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param1.field_l.a(param1.field_w, this.a(-24531, param1), this.b(2, param1));
            return false;
          }
          param1.field_l.f(param1.field_w);
          if (param4 == null) {
            param1.field_l.c(param3);
          } else {
            param1.field_l.b(param4, param2, param3);
          }
          if (param1.field_l.e()) {
            this.field_O.field_m.a(param1.field_l);
          }
          param1.d(5);
          if (0 <= param1.field_n) {
            param1.b(param0 - 4103);
            if (param1.field_f > 0 &&
              param1 == this.field_t[param1.field_F][param1.field_f]) {
              this.field_t[param1.field_F][param1.field_f] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_69_0 = var6;
          stackIn_69_1 = new StringBuilder().append("lj.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    final static void c(boolean param0) {
        hf var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        hf var1Lifetime1;
        var2 = OrbDefence.field_D ? 1 : 0;
        try {
          cd.field_w.a();
          wf.field_b.a();
          kg.field_f = kg.field_f - 1;
          if (kg.field_f == 0) {
            kg.field_f = 200;
            var1 = (hf) (ba.field_b.b((byte) -28));
            while (var1 != null) {
              if (!var1.field_f.b(true)) {
                var1.b(57);
              }
              var1 = (hf) (ba.field_b.d(853));
            }
            if (bg.field_a != null) {
              var1Lifetime1 = (hf) (bg.field_a.b((byte) 126));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_f.b(true)) {
                  var1Lifetime1.b(57);
                }
                var1Lifetime1 = (hf) (bg.field_a.d(853));
              }
            }
          }
          if (ml.field_c != null &&
            !ml.field_c.f(-114)) {
            ll.field_a = null;
          }
          if (param0) {
            field_N = (hj) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1_ref), "lj.OA(" + param0 + ')');
        }
    }

    final static java.net.URL a(String param0, java.net.URL param1, int param2, String param3, byte param4) {
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
          RuntimeException stackIn_47_0 = null;
          StringBuilder stackIn_47_1 = null;
          String stackIn_48_2 = null;
          StringBuilder stackIn_50_1 = null;
          String stackIn_51_2 = null;
          StringBuilder stackIn_53_1 = null;
          String stackIn_54_2 = null;
          Throwable decompiledCaughtException = null;
          String var5 = null;
          RuntimeException var5_ref = null;
          int var6 = 0;
          int var7_int = 0;
          StringBuilder var7 = null;
          Exception var8 = null;
          int var9 = 0;
          var9 = OrbDefence.field_D ? 1 : 0;
          try {
            var5 = param1.getFile();
            var6 = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var5.regionMatches(var6, "/l=", 0, 3)) {
                var7_int = var5.indexOf('/', var6 + 1);
                if ((var7_int >= 0) &&
                  (decompiledFrameRemainder0 = !(0 > param2))) {
                  var5 = var5.substring(0, var6) + var5.substring(var7_int);
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (var7_int >= 0) {
                    var6 = var7_int;
                    continue;
                  }
                }
                if (var5.regionMatches(var6, "/p=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (0 <= var7_int) {
                    if (param0 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue;
                    }
                    var6 = var7_int;
                    continue;
                  }
                }
                if (var5.regionMatches(var6, "/s=", 0, 3) ||
                  var5.regionMatches(var6, "/c=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if ((0 <= var7_int) &&
                    (decompiledFrameRemainder0 = (param3 != null))) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue;
                  }
                }
                if (decompiledFrameRemainder0) {
                  var7 = new StringBuilder(var6);
                  discarded$0 = var7.append(var5.substring(0, var6));
                  if (param2 > 0) {
                    discarded$1 = var7.append("/l=");
                    discarded$2 = var7.append(Integer.toString(param2));
                  }
                  if (param4 != 72) {
                    field_E = 10;
                  }
                  if (param0 != null &&
                    0 < param0.length()) {
                    discarded$3 = var7.append("/p=");
                    discarded$4 = var7.append(param0);
                  }
                  if (param3 != null &&
                    0 < param3.length()) {
                    discarded$5 = var7.append("/s=");
                    discarded$6 = var7.append(param3);
                  }
                  if (var5.length() <= var6) {
                    discarded$7 = var7.append('/');
                  } else {
                    discarded$8 = var7.append(var5.substring(var6, var5.length()));
                  }
                  try {
                    stackIn_42_0 = new java.net.URL(param1, var7.toString());
                    return stackIn_42_0;
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    stackIn_44_0 = (java.net.URL) (param1);
                    return stackIn_44_0;
                  }
                }
              }
              var6 = var7_int;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_47_0 = var5_ref;
            stackIn_47_1 = new StringBuilder().append("lj.TA(");
            if (param0 == null) {
              stackIn_48_2 = "null";
            } else {
              stackIn_48_2 = "{...}";
            }
            stackIn_50_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
            if (param1 == null) {
              stackIn_51_2 = "null";
            } else {
              stackIn_51_2 = "{...}";
            }
            stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_54_2 = "null";
            } else {
              stackIn_54_2 = "{...}";
            }
            throw dd.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0, int param1, byte param2) {
        this.field_J[param0] = param1;
        if (param2 >= -79) {
          this.field_s = 6;
        }
        this.field_H[param0] = vi.a(param1, -128);
        this.c(param1, -129, param0);
    }

    public static void d(int param0) {
        field_m = null;
        if (param0 <= 109) {
          field_u = 113;
        }
        field_N = null;
        field_B = null;
    }

    final synchronized void e(int param0) {
        this.a(true, 8841);
        if (param0 <= 61) {
          he var3 = (he) null;
          this.a((he) null, false, -3);
        }
    }

    private final void b(int param0, byte param1) {
        int var4;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 < 0) {
          for (param0 = 0; param0 < 16; param0++) {
            this.b(param0, (byte) 86);
          }
        } else {
          this.field_w[param0] = 12800;
          this.field_y[param0] = 8192;
          this.field_x[param0] = 16383;
          this.field_Q[param0] = 8192;
          this.field_n[param0] = 0;
          this.field_G[param0] = 8192;
          this.a((byte) -75, param0);
          this.a(126, param0);
          this.field_o[param0] = 0;
          this.field_p[param0] = 32767;
          this.field_v[param0] = 256;
          if (param1 <= 77) {
            this.field_Q = (int[]) null;
          }
          this.field_D[param0] = 0;
          this.b(param0, 8192, -93);
        }
    }

    private final int a(int param0, he param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        rc var9 = null;
        rc var10 = null;
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
          if (this.field_A[param1.field_F] == 0) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var9 = param1.field_x;
          var10 = var9;
          var4 = this.field_w[param1.field_F] * this.field_x[param1.field_F] + 4096 >> 13;
          var4 = var4 * var4 + 16384 >> 15;
          var4 = 16384 + var4 * param1.field_t >> 15;
          var4 = this.field_k * var4 + 128 >> 8;
          var4 = 128 + this.field_A[param1.field_F] * var4 >> 8;
          if (var10.field_c > 0) {
            var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, (double)param1.field_s * 0.00001953125 * (double)var10.field_c));
          }
          if (null != var10.field_l) {
            var5 = param1.field_B;
            var6 = var10.field_l[param1.field_m + 1];
            if (param1.field_m < -2 + var10.field_l.length) {
              var7 = var9.field_l[param1.field_m] << 8 & 65280;
              var8 = var10.field_l[2 + param1.field_m] << 8 & 65280;
              var6 = var6 + (var10.field_l[param1.field_m + 3] - var6) * (var5 - var7) / (var8 - var7);
            }
            var4 = var6 * var4 + 32 >> 6;
          }
          if (param1.field_n > 0 &&
            null != var10.field_e) {
            var5Lifetime1 = param1.field_n;
            var6Lifetime1 = var10.field_e[1 + param1.field_j];
            if (param1.field_j < -2 + var10.field_e.length) {
              var7Lifetime1 = var9.field_e[param1.field_j] << 8 & 65280;
              var8Lifetime1 = (var10.field_e[param1.field_j + 2] & 255) << 8;
              var6Lifetime1 = var6Lifetime1 + (var10.field_e[3 + param1.field_j] - var6Lifetime1) * (-var7Lifetime1 + var5Lifetime1) / (-var7Lifetime1 + var8Lifetime1);
            }
            var4 = var4 * var6Lifetime1 + 32 >> 6;
          }
          if (param0 != -24531) {
            this.field_s = 60;
          }
          stackIn_19_0 = var4;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("lj.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final boolean a(he param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 64) {
            this.b(-32, -64, (byte) -45);
          }
          if (null != param0.field_l) {
            return false;
          }
          if (param0.field_n < 0) {
            return true;
          }
          param0.b(57);
          if (0 < param0.field_f &&
            this.field_t[param0.field_F][param0.field_f] == param0) {
            this.field_t[param0.field_F][param0.field_f] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("lj.P(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int b(int param0, he param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.field_y[param1.field_F];
          if (param0 != 2) {
            field_N = (hj) null;
          }
          if (var3_int >= 8192) {
            stackIn_6_0 = 16384 - ((16384 - var3_int) * (128 - param1.field_q) + 32 >> 6);
            return stackIn_6_0;
          }
          stackIn_4_0 = param1.field_q * var3_int + 32 >> 6;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("lj.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void b(int param0, int param1, int param2) {
        this.field_C[param0] = param1;
        this.field_L[param0] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param1) * 2097152.0);
        if (param2 > -58) {
          this.field_G = (int[]) null;
        }
    }

    final synchronized boolean a(ki param0, vd param1, byte param2, fj param3, int param4) {
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
        mc var8 = null;
        int var9 = 0;
        int var11 = 0;
        ik var12 = null;
        ik var13 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          param3.b();
          var6_int = 1;
          var7 = null;
          if (param4 > 0) {
            var7 = new int[]{param4};
          }
          var8 = (mc) (param3.field_g.a((byte) 122));
          if (param2 != 31) {
            return false;
          }
          while (var8 != null) {
            var9 = (int)var8.field_d;
            var12 = (ik) (this.field_j.a((long)var9, -1));
            if (var12 == null) {
              var13 = le.a(var9, param0, 10);
              if (var13 == null) {
                var6_int = 0;
              } else {
                this.field_j.a((long)var9, (byte) -104, var13);
                if (!var13.a(-78, param1, (int[]) (var7), var8.field_h)) {
                  var6_int = 0;
                }
              }
            } else {
              if (!var12.a(-78, param1, (int[]) (var7), var8.field_h)) {
                var6_int = 0;
                var8 = (mc) (param3.field_g.c((byte) -94));
                continue;
              }
            }
            var8 = (mc) (param3.field_g.c((byte) -94));
          }
          if (var6_int != 0) {
            param3.a();
          }
          stackIn_21_0 = var6_int;
          return stackIn_21_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_24_0 = var6;
          stackIn_24_1 = new StringBuilder().append("lj.CA(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void b(byte param0, int param1) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != -12) {
          return;
        }
        he var3 = (he) (this.field_O.field_k.b((byte) 126));
        while (var3 != null) {
          if ((param1 < 0 || param1 == var3.field_F) &&
            var3.field_n < 0) {
            this.field_I[var3.field_F][var3.field_h] = null;
            var3.field_n = 0;
          }
          var3 = (he) (this.field_O.field_k.d(853));
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param1 != -17615) {
          this.field_Q = (int[]) null;
        }
    }

    private final synchronized void a(int param0, boolean param1, fj param2) {
        try {
          this.a(param1, -122, true, param2);
          if (param0 != -23335) {
            this.field_x = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "lj.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public lj() {
        this.field_p = new int[16];
        this.field_o = new int[16];
        this.field_C = new int[16];
        this.field_y = new int[16];
        this.field_L = new int[16];
        this.field_A = new int[16];
        this.field_w = new int[16];
        this.field_G = new int[16];
        this.field_Q = new int[16];
        this.field_x = new int[16];
        this.field_J = new int[16];
        this.field_n = new int[16];
        this.field_v = new int[16];
        this.field_D = new int[16];
        this.field_k = 256;
        this.field_t = new he[16][128];
        this.field_I = new he[16][128];
        this.field_F = new int[16];
        this.field_H = new int[16];
        this.field_K = 1000000;
        this.field_S = new qi();
        this.field_O = new jg(this);
        this.field_j = new mh(128);
        this.b(256, false, -1);
        this.a(28034, true);
    }

    static {
        field_B = "SOLAR BLAST";
        field_E = 0;
    }
}
