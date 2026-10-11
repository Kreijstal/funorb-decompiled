/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends tj {
    int[] field_t;
    private int[] field_s;
    private int[] field_L;
    static String field_q;
    private id field_w;
    private int[] field_A;
    private int[] field_m;
    private int field_G;
    private int[] field_z;
    static int field_F;
    static int field_H;
    private int[] field_u;
    private int[] field_M;
    private og field_p;
    int[] field_o;
    static int[] field_T;
    private ck[][] field_r;
    private int[] field_C;
    private int[] field_P;
    private int[] field_J;
    static ef field_U;
    private int[] field_I;
    private int[] field_B;
    private ck[][] field_R;
    private int field_O;
    private int[] field_W;
    int[] field_S;
    private bl field_x;
    private long field_v;
    private boolean field_K;
    private int field_X;
    private long field_n;
    private int field_Q;
    private int field_V;
    private vi field_y;
    private boolean field_E;

    private final void d(int param0, int param1) {
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
        var8 = HoldTheLine.field_D;
        var3 = param1 & 240;
        if (var3 == 128) {
          var4 = param1 & 15;
          var5 = (param1 & 32716) >> 8;
          var6 = (param1 & 8325097) >> 16;
          this.b(var5, var6, var4, 26410);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = 15 & param1;
          var5Lifetime1 = 127 & param1 >> 8;
          var6Lifetime1 = (8371051 & param1) >> 16;
          if (var6Lifetime1 <= 0) {
            this.b(var5Lifetime1, 64, var4Lifetime1, 26410);
            return;
          }
          this.a(var6Lifetime1, var4Lifetime1, var5Lifetime1, (byte) 108);
        } else {
          if (var3 == 160) {
            var4Lifetime1 = param1 & 15;
            var5Lifetime1 = 127 & param1 >> 8;
            var6Lifetime1 = 127 & param1 >> 16;
            this.a(var5Lifetime1, var6Lifetime1, param0 ^ -14275, var4Lifetime1);
            return;
          }
          if (var3 != 176) {
            if (192 == var3) {
              var4Lifetime1 = param1 & 15;
              var5Lifetime1 = 127 & param1 >> 8;
              this.b(param0 + 14189, var5Lifetime1 + this.field_C[var4Lifetime1], var4Lifetime1);
              return;
            }
            if (var3 == 208) {
              var4Lifetime1 = 15 & param1;
              var5Lifetime1 = param1 >> 8 & 127;
              this.a(param0 ^ 14287, var5Lifetime1, var4Lifetime1);
              return;
            }
            if (var3 == 224) {
              var4Lifetime1 = 15 & param1;
              var5Lifetime1 = ((param1 & 8323286) >> 9) + ((param1 & 32634) >> 8);
              this.a(var5Lifetime1, var4Lifetime1, (byte) -116);
              return;
            }
            if (param0 != -14238) {
              return;
            }
            var3 = param1 & 255;
            if (var3 != 255) {
              return;
            }
            this.b(16, true);
            return;
          }
          var4Lifetime1 = param1 & 15;
          var5Lifetime1 = (32552 & param1) >> 8;
          var6Lifetime1 = 127 & param1 >> 16;
          if (var5Lifetime1 == 0) {
            this.field_C[var4Lifetime1] = pk.a(-2080769, this.field_C[var4Lifetime1]) + (var6Lifetime1 << 14);
          }
          if (32 == var5Lifetime1) {
            this.field_C[var4Lifetime1] = (var6Lifetime1 << 7) + pk.a(this.field_C[var4Lifetime1], -16257);
          }
          if (1 == var5Lifetime1) {
            this.field_M[var4Lifetime1] = pk.a(-16257, this.field_M[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (33 == var5Lifetime1) {
            this.field_M[var4Lifetime1] = var6Lifetime1 + pk.a(-128, this.field_M[var4Lifetime1]);
          }
          if (var5Lifetime1 == 5) {
            this.field_P[var4Lifetime1] = pk.a(this.field_P[var4Lifetime1], -16257) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 37) {
            this.field_P[var4Lifetime1] = pk.a(-128, this.field_P[var4Lifetime1]) + var6Lifetime1;
          }
          if (7 == var5Lifetime1) {
            this.field_W[var4Lifetime1] = pk.a(this.field_W[var4Lifetime1], -16257) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 39) {
            this.field_W[var4Lifetime1] = var6Lifetime1 + pk.a(-128, this.field_W[var4Lifetime1]);
          }
          if (var5Lifetime1 == 10) {
            this.field_L[var4Lifetime1] = (var6Lifetime1 << 7) + pk.a(-16257, this.field_L[var4Lifetime1]);
          }
          if (42 == var5Lifetime1) {
            this.field_L[var4Lifetime1] = var6Lifetime1 + pk.a(this.field_L[var4Lifetime1], -128);
          }
          if (var5Lifetime1 == 11) {
            this.field_m[var4Lifetime1] = pk.a(-16257, this.field_m[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 43) {
            this.field_m[var4Lifetime1] = var6Lifetime1 + pk.a(-128, this.field_m[var4Lifetime1]);
          }
          if (var5Lifetime1 == 64) {
            if (var6Lifetime1 < 64) {
              this.field_o[var4Lifetime1] = pk.a(this.field_o[var4Lifetime1], -2);
            } else {
              this.field_o[var4Lifetime1] = kc.a(this.field_o[var4Lifetime1], 1);
            }
          }
          if (var5Lifetime1 == 65) {
            if (var6Lifetime1 >= 64) {
              this.field_o[var4Lifetime1] = kc.a(this.field_o[var4Lifetime1], 2);
            } else {
              this.c(var4Lifetime1, 2097152);
              this.field_o[var4Lifetime1] = pk.a(this.field_o[var4Lifetime1], -3);
            }
          }
          if (var5Lifetime1 == 99) {
            this.field_J[var4Lifetime1] = (var6Lifetime1 << 7) + pk.a(127, this.field_J[var4Lifetime1]);
          }
          if (var5Lifetime1 == 98) {
            this.field_J[var4Lifetime1] = pk.a(this.field_J[var4Lifetime1], 16256) + var6Lifetime1;
          }
          if (var5Lifetime1 == 101) {
            this.field_J[var4Lifetime1] = 16384 + pk.a(127, this.field_J[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 100) {
            this.field_J[var4Lifetime1] = 16384 + (pk.a(16256, this.field_J[var4Lifetime1]) + var6Lifetime1);
          }
          if (var5Lifetime1 == 120) {
            this.b(var4Lifetime1, (byte) -120);
          }
          if (var5Lifetime1 == 121) {
            this.a(var4Lifetime1, (byte) -33);
          }
          if (123 == var5Lifetime1) {
            this.a(var4Lifetime1, 95);
          }
          if (var5Lifetime1 == 6) {
            var7 = this.field_J[var4Lifetime1];
            if (var7 == 16384) {
              this.field_A[var4Lifetime1] = pk.a(this.field_A[var4Lifetime1], -16257) + (var6Lifetime1 << 7);
            }
          }
          if (38 == var5Lifetime1) {
            var7Lifetime1 = this.field_J[var4Lifetime1];
            if (var7Lifetime1 == 16384) {
              this.field_A[var4Lifetime1] = pk.a(this.field_A[var4Lifetime1], -128) + var6Lifetime1;
            }
          }
          if (var5Lifetime1 == 16) {
            this.field_S[var4Lifetime1] = pk.a(-16257, this.field_S[var4Lifetime1]) + (var6Lifetime1 << 7);
          }
          if (var5Lifetime1 == 48) {
            this.field_S[var4Lifetime1] = pk.a(this.field_S[var4Lifetime1], -128) + var6Lifetime1;
          }
          if (81 == var5Lifetime1) {
            if (64 > var6Lifetime1) {
              this.a((byte) 91, var4Lifetime1);
              this.field_o[var4Lifetime1] = pk.a(this.field_o[var4Lifetime1], -5);
            } else {
              this.field_o[var4Lifetime1] = kc.a(this.field_o[var4Lifetime1], 4);
            }
          }
          if (var5Lifetime1 == 17) {
            this.e(param0 ^ 14237, var4Lifetime1, (-16257 & this.field_I[var4Lifetime1]) + (var6Lifetime1 << 7));
          }
          if (var5Lifetime1 == 49) {
            this.e(-1, var4Lifetime1, var6Lifetime1 + (this.field_I[var4Lifetime1] & -128));
            return;
          }
        }
    }

    final synchronized void a(int param0, boolean param1) {
        this.field_G = param0;
        if (param1) {
          CharSequence var4 = (CharSequence) null;
          kf.a((CharSequence) null, (byte) -9);
        }
    }

    final synchronized void e(int param0) {
        int var3 = HoldTheLine.field_D;
        ch var4 = (ch) (this.field_p.a(param0));
        while (var4 != null) {
          var4.e(-8346);
          var4 = (ch) (this.field_p.b(-1));
        }
    }

    final synchronized tj b() {
        return null;
    }

    private final void b(int param0, byte param1) {
        int var4 = HoldTheLine.field_D;
        if (param1 >= -111) {
          field_F = 43;
        }
        ck var3 = (ck) (this.field_x.field_q.b((byte) 101));
        while (var3 != null) {
          if (param0 < 0 ||
            var3.field_p == param0) {
            if (var3.field_t != null) {
              var3.field_t.f(lo.field_l / 100);
              if (var3.field_t.g()) {
                this.field_x.field_p.a(var3.field_t);
              }
              var3.b((byte) -110);
            }
            if (!(var3.field_z >= 0)) {
              this.field_R[var3.field_p][var3.field_u] = null;
            }
            var3.d(0);
          }
          var3 = (ck) (this.field_x.field_q.c((byte) -52));
        }
    }

    final synchronized boolean a(int param0, ld param1, vi param2, boolean param3, gn param4) {
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        be var8 = null;
        int var9 = 0;
        int var11 = 0;
        ch var12 = null;
        ch var13 = null;
        var11 = HoldTheLine.field_D;
        try {
          param2.a();
          if (param3) {
            this.field_v = 89L;
          }
          var6_int = 1;
          var7 = null;
          if (0 < param0) {
            var7 = new int[]{param0};
          }
          var8 = (be) (param2.field_i.a(0));
          while (var8 != null) {
            boolean decompiledFrameRemainder0 = true;
            var9 = (int)var8.field_f;
            var12 = (ch) (this.field_p.a((byte) 124, (long)var9));
            if (var12 == null) {
              var13 = vd.a(param4, 65535, var9);
              if (var13 == null) {
                var6_int = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_p.a(var13, (long)var9, param3);
                decompiledFrameRemainder0 = !(var13.a(90, (int[]) (var7), var8.field_k, param1));
              }
            } else {
              decompiledFrameRemainder0 = !(var12.a(90, (int[]) (var7), var8.field_k, param1));
            }
            if (decompiledFrameRemainder0) {
              var6_int = 0;
            }
            var8 = (be) (param2.field_i.b(-1));
          }
          if (var6_int != 0) {
            param2.b();
          }
          stackIn_22_0 = var6_int;
          return stackIn_22_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_25_0 = var6;
          stackIn_25_1 = new StringBuilder().append("kf.QA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final synchronized boolean c(byte param0) {
        int var2 = -76 % ((-64 - param0) / 62);
        return this.field_w.e();
    }

    private final int b(boolean param0, ck param1) {
        int discarded$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        ck var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var4 = (ck) null;
            discarded$1 = this.a((ck) null, 88);
          }
          var3_int = this.field_L[param1.field_p];
          if (8192 <= var3_int) {
            stackIn_6_0 = 16384 - (32 + (-param1.field_y + 128) * (16384 - var3_int) >> 6);
            return stackIn_6_0;
          }
          stackIn_4_0 = var3_int * param1.field_y + 32 >> 6;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("kf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = HoldTheLine.field_D;
        if (param0 != -49) {
          return;
        }
        if (param1 != this.field_u[param2]) {
          this.field_u[param2] = param1;
          for (var4 = 0; 128 > var4; var4++) {
            this.field_r[param2][var4] = null;
          }
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = HoldTheLine.field_D;
        try {
          if (this.field_w.e()) {
            var4_int = this.field_O * this.field_w.field_a / lo.field_l;
            while (true) {
              var5 = (long)var4_int * (long)param2 + this.field_n;
              if (this.field_v - var5 >= 0L) {
                this.field_n = var5;
                break;
              }
              var7 = (int)((this.field_v + (-this.field_n + (long)var4_int - 1L)) / (long)var4_int);
              this.field_n = this.field_n + (long)var4_int * (long)var7;
              this.field_x.b(param0, param1, var7);
              param2 = param2 - var7;
              param1 = param1 + var7;
              this.b((byte) 9);
              if (this.field_w.e()) {
                continue;
              }
              this.field_x.b(param0, param1, param2);
              return;
            }
          }
          this.field_x.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("kf.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        if (param0 > -54) {
          this.b(117, -92, -50, -101);
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param2 != 128) {
          return;
        }
        this.field_z[param1] = param0;
        this.field_C[param1] = pk.a(param0, -128);
        this.b(param2 ^ -177, param0, param1);
    }

    private final void a(int param0, byte param1) {
        int var4;
        var4 = HoldTheLine.field_D;
        if (param0 < 0) {
          for (param0 = 0; param0 < 16; param0++) {
            this.a(param0, (byte) -33);
          }
          return;
        }
        this.field_W[param0] = 12800;
        this.field_L[param0] = 8192;
        this.field_m[param0] = 16383;
        this.field_B[param0] = 8192;
        this.field_M[param0] = 0;
        this.field_P[param0] = 8192;
        this.c(param0, 2097152);
        this.a((byte) 91, param0);
        if (param1 != -33) {
          return;
        }
        this.field_o[param0] = 0;
        this.field_J[param0] = 32767;
        this.field_A[param0] = 256;
        this.field_S[param0] = 0;
        this.e(-1, param0, 8192);
    }

    final synchronized int c() {
        return 0;
    }

    public static void a(byte param0) {
        if (param0 != -104) {
          return;
        }
        field_U = null;
        field_T = null;
        field_q = null;
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        var6 = HoldTheLine.field_D;
        if (this.field_w.e()) {
          var2 = this.field_w.field_a * this.field_O / lo.field_l;
          while (true) {
            var3 = this.field_n + (long)param0 * (long)var2;
            if (this.field_v - var3 >= 0L) {
              this.field_n = var3;
              break;
            }
            var5 = (int)(((long)var2 + (-this.field_n + this.field_v - 1L)) / (long)var2);
            this.field_n = this.field_n + (long)var2 * (long)var5;
            param0 = param0 - var5;
            this.field_x.a(var5);
            this.b((byte) 9);
            if (!this.field_w.e()) {
              break;
            }
          }
        }
        this.field_x.a(param0);
    }

    final boolean a(boolean param0, ck param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return false;
          }
          if (param1.field_t != null) {
            return false;
          }
          if (param1.field_z >= 0) {
            param1.d(0);
            if (param1.field_k > 0 &&
              param1 == this.field_r[param1.field_p][param1.field_k]) {
              this.field_r[param1.field_p][param1.field_k] = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("kf.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void b(byte param0) {
        int var2;
        int var3;
        long var4;
        int var6;
        int var7;
        var7 = HoldTheLine.field_D;
        var2 = this.field_Q;
        var3 = this.field_X;
        var4 = this.field_v;
        if (this.field_y != null &&
          this.field_V == var3) {
          this.a(this.field_y, this.field_K, this.field_E, 57);
          this.b((byte) 9);
          return;
        }
        while (true) {
          if (this.field_X != var3) {
            this.field_Q = var2;
            if (param0 != 9) {
              this.field_G = -73;
            }
            this.field_X = var3;
            this.field_v = var4;
            if (this.field_y != null &&
              var3 > this.field_V) {
              this.field_Q = -1;
              this.field_X = this.field_V;
              this.field_v = this.field_w.a(this.field_X);
            }
            return;
          }
          while (~var3 == ~this.field_w.field_c[var2]) {
            this.field_w.e(var2);
            var6 = this.field_w.b(var2);
            if (1 != var6) {
              if ((var6 & 128) != 0) {
                this.d(param0 ^ -14229, var6);
              }
              this.field_w.c(var2);
              this.field_w.d(var2);
              continue;
            }
            this.field_w.c();
            this.field_w.d(var2);
            if (this.field_w.g()) {
              if (this.field_y != null) {
                this.a(-2128027000, this.field_y, this.field_K);
                this.b((byte) 9);
                return;
              }
              if (this.field_K &&
                var3 != 0) {
                this.field_w.a(var4);
              } else {
                this.b(16, true);
                this.field_w.b();
                return;
              }
            }
            break;
          }
          var2 = this.field_w.f();
          var3 = this.field_w.field_c[var2];
          var4 = this.field_w.a(var3);
        }
    }

    final synchronized void f(int param0) {
        if (param0 > -123) {
          this.d(-107, -6);
        }
        this.a(false, true);
    }

    private final void e(int param0, int param1, int param2) {
        if (param0 != -1) {
          this.a(44, -22, (byte) 103);
        }
        this.field_I[param1] = param2;
        this.field_t[param1] = (int)(0.5 + Math.pow(2.0, (double)param2 * 0.00054931640625) * 2097152.0);
    }

    final synchronized void b(int param0, int param1) {
        this.field_O = param0;
        if (param1 != 2) {
          this.field_w = (id) null;
        }
    }

    final synchronized void d(int param0, int param1, int param2) {
        this.c(param0, param2, 128);
        if (param1 != -13549) {
          field_H = -43;
        }
    }

    private final void a(int param0, int param1, byte param2) {
        this.field_B[param1] = param0;
        int var4 = 99 / ((6 - param2) / 58);
    }

    private final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        int var3Lifetime1;
        if (param1) {
          this.b(-1, (byte) -112);
        } else {
          this.a(-1, param0 - 91);
        }
        this.a(-1, (byte) -33);
        for (var3 = 0; var3 < 16; var3++) {
          this.field_u[var3] = this.field_z[var3];
        }
        if (param0 != 16) {
          this.b(31, 118, -86);
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < 16) {
          this.field_C[var5] = pk.a(this.field_z[var5], -128);
          var5++;
        }
    }

    final synchronized void a(int param0, vi param1, boolean param2) {
        try {
          this.a(param1, param2, true, 79);
          if (param0 != -2128027000) {
            this.field_E = true;
          }
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "kf.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final synchronized tj a() {
        return (tj) ((Object) this.field_x);
    }

    private final void a(byte param0, int param1) {
        ck var3 = null;
        int var4 = HoldTheLine.field_D;
        if (param0 != 91) {
          return;
        }
        if (0 != (4 & this.field_o[param1])) {
          var3 = (ck) (this.field_x.field_q.b((byte) 99));
          while (var3 != null) {
            if (param1 == var3.field_p) {
              var3.field_v = 0;
            }
            var3 = (ck) (this.field_x.field_q.c((byte) -47));
          }
        }
    }

    private final void a(int param0, int param1) {
        int var5 = HoldTheLine.field_D;
        int var3 = 2 / ((-7 - param1) / 40);
        ck var4 = (ck) (this.field_x.field_q.b((byte) 106));
        while (var4 != null) {
          if ((param0 < 0 || param0 == var4.field_p) &&
            var4.field_z < 0) {
            this.field_R[var4.field_p][var4.field_u] = null;
            var4.field_z = 0;
          }
          var4 = (ck) (this.field_x.field_q.c((byte) 91));
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        int stackIn_19_1 = 0;
        ck stackIn_19_2 = null;
        Object stackIn_20_0;
        boolean stackIn_20_3;
        ck var5;
        int var6_int;
        el var6;
        ck var7;
        ck var8;
        int var9;
        ch var10;
        ch var11;
        var9 = HoldTheLine.field_D;
        this.b(param2, 64, param1, 26410);
        if (param3 < 94) {
          this.field_C = (int[]) null;
        }
        if ((2 & this.field_o[param1]) != 0) {
          var5 = (ck) (this.field_x.field_q.d((byte) 124));
          while (var5 != null) {
            if (var5.field_p == param1 &&
              var5.field_z < 0) {
              this.field_R[param1][var5.field_u] = null;
              this.field_R[param1][param2] = var5;
              var6_int = (var5.field_n * var5.field_B >> 12) + var5.field_x;
              var5.field_x = var5.field_x + (param2 - var5.field_u << 8);
              var5.field_u = param2;
              var5.field_n = 4096;
              var5.field_B = -var5.field_x + var6_int;
              return;
            }
            var5 = (ck) (this.field_x.field_q.c(-4140));
          }
        }
        var10 = (ch) (this.field_p.a((byte) 115, (long)this.field_u[param1]));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_s[param2];
        if (var6 == null) {
          return;
        }
        var7 = new ck();
        var7.field_s = var6;
        var7.field_o = var11;
        var7.field_p = param1;
        var7.field_C = var10.field_o[param2];
        var7.field_k = var10.field_v[param2];
        var7.field_u = param2;
        var7.field_i = param0 * (param0 * var11.field_j * var10.field_k[param2]) + 1024 >> 11;
        var7.field_y = 255 & var10.field_l[param2];
        var7.field_x = (param2 << 8) - (var10.field_q[param2] & 32767);
        var7.field_A = 0;
        var7.field_q = 0;
        var7.field_w = 0;
        var7.field_l = 0;
        var7.field_z = -1;
        if (this.field_S[param1] == 0) {
          var7.field_t = db.b(var6, this.a(var7, (byte) -121), this.a(var7, -78), this.b(false, var7));
        } else {
          var7.field_t = db.b(var6, this.a(var7, (byte) 26), 0, this.b(false, var7));
          stackIn_19_1 = 2;
          stackIn_19_2 = var7;
          if (0 <= var10.field_q[param2]) {
            stackIn_20_0 = this;
            stackIn_20_3 = false;
          } else {
            stackIn_20_0 = this;
            stackIn_20_3 = true;
          }
          this.a(stackIn_19_1, stackIn_19_2, stackIn_20_3);
        }
        if (var10.field_q[param2] < 0) {
          var7.field_t.g(-1);
        }
        if (var7.field_k >= 0) {
          var8 = this.field_r[param1][var7.field_k];
          if (var8 != null &&
            var8.field_z < 0) {
            this.field_R[param1][var8.field_u] = null;
            var8.field_z = 0;
          }
          this.field_r[param1][var7.field_k] = var7;
        }
        this.field_x.field_q.a((byte) -128, var7);
        this.field_R[param1][param2] = var7;
        return;
    }

    private final synchronized void a(boolean param0, boolean param1) {
        this.field_w.b();
        this.field_y = null;
        if (param0) {
          this.field_R = (ck[][]) null;
        }
        this.b(16, param1);
    }

    final synchronized void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = HoldTheLine.field_D;
        int var4Lifetime1;
        if (0 <= param1) {
          this.field_s[param1] = param2;
        } else {
          for (var4 = 0; var4 < 16; var4++) {
            this.field_s[var4] = param2;
          }
        }
        var4Lifetime1 = -113 % ((param0 + 18) / 60);
    }

    final boolean a(int[] param0, ck param1, int param2, int param3, int param4) {
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        ik var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = HoldTheLine.field_D;
        try {
          param1.field_r = lo.field_l / 100;
          if (0 <= param1.field_z && (param1.field_t == null ||
            param1.field_t.e())) {
            param1.b((byte) -95);
            param1.d(0);
            if (0 < param1.field_k) {
              if (param1 != this.field_r[param1.field_p][param1.field_k]) {
                return true;
              }
              this.field_r[param1.field_p][param1.field_k] = null;
            }
            return true;
          }
          var6_int = param1.field_n;
          if (param3 >= -41) {
            this.field_t = (int[]) null;
          }
          if (0 < var6_int) {
            var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_P[param1.field_p]));
            if (0 > var6_int) {
              var6_int = 0;
            }
            param1.field_n = var6_int;
          }
          param1.field_t.h(this.a(param1, (byte) -127));
          var7 = param1.field_C;
          param1.field_j = param1.field_j + var7.field_m;
          param1.field_m = param1.field_m + 1;
          var8 = 0;
          var9 = (double)((param1.field_B * param1.field_n >> 12) + (param1.field_u - 60 << 8)) * 0.000005086263020833333;
          if (var7.field_b > 0) {
            if (0 >= var7.field_c) {
              param1.field_w = param1.field_w + 128;
            } else {
              param1.field_w = param1.field_w + (int)(128.0 * Math.pow(2.0, (double)var7.field_c * var9) + 0.5);
            }
            if (819200 <= param1.field_w * var7.field_b) {
              var8 = 1;
            }
          }
          if (var7.field_l != null) {
            if (0 < var7.field_d) {
              param1.field_A = param1.field_A + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_d) + 0.5);
            } else {
              param1.field_A = param1.field_A + 128;
            }
            while (var7.field_l.length - 2 > param1.field_l) {
              if ((var7.field_l[param1.field_l + 2] << 8 & 65280) < param1.field_A) {
                param1.field_l = param1.field_l + 2;
                continue;
              }
              break;
            }
            if (-2 + var7.field_l.length == param1.field_l &&
              var7.field_l[1 + param1.field_l] == 0) {
              var8 = 1;
            }
          }
          if (0 <= param1.field_z &&
            var7.field_g != null &&
            (1 & this.field_o[param1.field_p]) == 0 && (!(param1.field_k >= 0) ||
            this.field_r[param1.field_p][param1.field_k] != param1)) {
            if (0 >= var7.field_n) {
              param1.field_z = param1.field_z + 128;
            } else {
              param1.field_z = param1.field_z + (int)(128.0 * Math.pow(2.0, (double)var7.field_n * var9) + 0.5);
            }
            while (-2 + var7.field_g.length > param1.field_q) {
              if (param1.field_z > (var7.field_g[param1.field_q + 2] << 8 & 65280)) {
                param1.field_q = param1.field_q + 2;
                continue;
              }
              break;
            }
            if (param1.field_q == var7.field_g.length - 2) {
              var8 = 1;
            }
          }
          if (var8 == 0) {
            param1.field_t.a(param1.field_r, this.a(param1, 72), this.b(false, param1));
            return false;
          }
          param1.field_t.f(param1.field_r);
          if (param0 == null) {
            param1.field_t.a(param2);
          } else {
            param1.field_t.b(param0, param4, param2);
          }
          if (param1.field_t.g()) {
            this.field_x.field_p.a(param1.field_t);
          }
          param1.b((byte) -92);
          if (param1.field_z >= 0) {
            param1.d(0);
            if (param1.field_k > 0 &&
              this.field_r[param1.field_p][param1.field_k] == param1) {
              this.field_r[param1.field_p][param1.field_k] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_71_0 = var6;
          stackIn_71_1 = new StringBuilder().append("kf.BA(");
          if (param0 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param1 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(ck param0, byte param1) {
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ik var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        int var6Lifetime1;
        try {
          var3_int = param0.field_x + (param0.field_n * param0.field_B >> 12);
          var3_int = var3_int + (this.field_A[param0.field_p] * (-8192 + this.field_B[param0.field_p]) >> 12);
          var4 = param0.field_C;
          var5 = 37 / ((param1 + 58) / 60);
          if (var4.field_m > 0 && (!(var4.field_h <= 0) ||
            this.field_M[param0.field_p] > 0)) {
            var6 = var4.field_h << 2;
            var7 = var4.field_j << 1;
            if (param0.field_m < var7) {
              var6 = var6 * param0.field_m / var7;
            }
            var6 = var6 + (this.field_M[param0.field_p] >> 7);
            var8 = Math.sin((double)(param0.field_j & 511) * 0.01227184630308513);
            var3_int = var3_int + (int)((double)var6 * var8);
          }
          var6Lifetime1 = (int)(0.5 + (double)(256 * param0.field_s.field_j) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)lo.field_l);
          stackIn_11_0 = (var6Lifetime1 < 1) ? 1 : var6Lifetime1;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("kf.AA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(CharSequence param0, byte param1) {
        int var7 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HoldTheLine.field_D;
        try {
          if (param0 == null) {
            return null;
          }
          var2_int = 0;
          var3 = param0.length();
          while (var2_int < var3) {
            if (ag.a(-2821, param0.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          var4 = 106 % ((param1 - 45) / 45);
          while (var2_int < var3) {
            if (ag.a(-2821, param0.charAt(var3 - 1))) {
              var3--;
              continue;
            }
            break;
          }
          var5 = var3 - var2_int;
          if (1 > var5) {
            return null;
          }
          if (var5 > 12) {
            stackIn_16_0 = null;
            return (String) (stackIn_16_0);
          }
          var6 = new StringBuilder(var5);
          for (var7 = var2_int; var3 > var7; var7++) {
            var8 = param0.charAt(var7);
            if (sd.a((char) var8, (byte) -116)) {
              var9 = ba.a(true, (char) var8);
              if (0 != var9) {
                discarded$0 = var6.append((char) var9);
              }
            }
          }
          if (var6.length() != 0) {
            return var6.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("kf.IA(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void c(int param0, int param1) {
        ck var3 = null;
        int var4 = HoldTheLine.field_D;
        if (param1 != 2097152) {
          this.b(121, 39, -127);
        }
        if (0 != (2 & this.field_o[param0])) {
          var3 = (ck) (this.field_x.field_q.b((byte) 100));
          while (var3 != null) {
            if (param0 == var3.field_p &&
              this.field_R[param0][var3.field_u] == null &&
              0 > var3.field_z) {
              var3.field_z = 0;
            }
            var3 = (ck) (this.field_x.field_q.c((byte) -38));
          }
        }
    }

    final void a(int param0, ck param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        try {
          var4_int = param1.field_s.field_n.length;
          if (param2 &&
            param1.field_s.field_k) {
            var6 = var4_int + var4_int - param1.field_s.field_m;
            var5 = (int)((long)this.field_S[param1.field_p] * (long)var6 >> 6);
            var4_int = var4_int << 8;
            if (var4_int <= var5) {
              var5 = -var5 + var4_int + var4_int - 1;
              param1.field_t.a(true);
            }
          } else {
            var5 = (int)((long)var4_int * (long)this.field_S[param1.field_p] >> 6);
          }
          if (param0 != 2) {
            this.a((byte) -59, 8);
          }
          param1.field_t.k(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("kf.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int a(ck param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ik var10 = null;
        ik var11 = null;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          if (this.field_s[param0.field_p] == 0) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var10 = param0.field_C;
          var11 = var10;
          var4 = this.field_W[param0.field_p] * this.field_m[param0.field_p] + 4096 >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = var4 * param0.field_i + 16384 >> 15;
          var5 = -91 / ((-16 - param1) / 51);
          var4 = this.field_G * var4 + 128 >> 8;
          var4 = this.field_s[param0.field_p] * var4 + 128 >> 8;
          if (0 < var11.field_b) {
            var4 = (int)((double)var4 * Math.pow(0.5, (double)var11.field_b * ((double)param0.field_w * 0.00001953125)) + 0.5);
          }
          if (var11.field_l != null) {
            var6 = param0.field_A;
            var7 = var11.field_l[param0.field_l + 1];
            if (param0.field_l < var11.field_l.length - 2) {
              var8 = var10.field_l[param0.field_l] << 8 & 65280;
              var9 = 65280 & var11.field_l[2 + param0.field_l] << 8;
              var7 = var7 + (-var8 + var6) * (-var7 + var11.field_l[param0.field_l + 3]) / (var9 - var8);
            }
            var4 = var4 * var7 + 32 >> 6;
          }
          if (param0.field_z > 0 &&
            var11.field_g != null) {
            var6Lifetime1 = param0.field_z;
            var7Lifetime1 = var11.field_g[1 + param0.field_q];
            if (param0.field_q < var11.field_g.length - 2) {
              var8Lifetime1 = (var10.field_g[param0.field_q] & 255) << 8;
              var9Lifetime1 = (var11.field_g[param0.field_q + 2] & 255) << 8;
              var7Lifetime1 = var7Lifetime1 + (-var8Lifetime1 + var6Lifetime1) * (var11.field_g[3 + param0.field_q] - var7Lifetime1) / (-var8Lifetime1 + var9Lifetime1);
            }
            var4 = 32 + var7Lifetime1 * var4 >> 6;
          }
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("kf.L(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        ck var6;
        int var7;
        ck var8;
        var7 = HoldTheLine.field_D;
        var8 = this.field_R[param2][param0];
        if (var8 == null) {
          return;
        }
        if (param3 != 26410) {
          this.a(82, 108, -74);
        }
        {
          this.field_R[param2][param0] = null;
          if (0 != (this.field_o[param2] & 2)) {
            var6 = (ck) (this.field_x.field_q.b((byte) 117));
            while (var6 != null) {
              if (var8.field_p == var6.field_p &&
                var6.field_z < 0 &&
                var8 != var6) {
                var8.field_z = 0;
                break;
              }
              var6 = (ck) (this.field_x.field_q.c((byte) 122));
            }
          } else {
            var8.field_z = 0;
          }
        }
    }

    private final synchronized void a(vi param0, boolean param1, boolean param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = HoldTheLine.field_D;
        try {
          if (param3 < 39) {
            this.field_S = (int[]) null;
          }
          this.a(false, param2);
          this.field_w.a(param0.field_j);
          this.field_K = param1 ? true : false;
          this.field_n = 0L;
          var5_int = this.field_w.a();
          for (var6 = 0; var6 < var5_int; var6++) {
            this.field_w.e(var6);
            this.field_w.c(var6);
            this.field_w.d(var6);
          }
          this.field_Q = this.field_w.f();
          this.field_X = this.field_w.field_c[this.field_Q];
          this.field_v = this.field_w.a(this.field_X);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "kf.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param2 < 59) {
          this.field_r = (ck[][]) null;
        }
    }

    public kf() {
        this.field_t = new int[16];
        this.field_A = new int[16];
        this.field_L = new int[16];
        this.field_m = new int[16];
        this.field_s = new int[16];
        this.field_u = new int[16];
        this.field_z = new int[16];
        this.field_M = new int[16];
        this.field_o = new int[16];
        this.field_P = new int[16];
        this.field_I = new int[16];
        this.field_C = new int[16];
        this.field_B = new int[16];
        this.field_G = 256;
        this.field_r = new ck[16][128];
        this.field_R = new ck[16][128];
        this.field_O = 1000000;
        this.field_S = new int[16];
        this.field_J = new int[16];
        this.field_W = new int[16];
        this.field_w = new id();
        this.field_x = new bl(this);
        this.field_p = new og(128);
        this.a((byte) 99, -1, 256);
        this.b(16, true);
    }

    kf(kf param0) {
        this.field_t = new int[16];
        this.field_A = new int[16];
        this.field_L = new int[16];
        this.field_m = new int[16];
        this.field_s = new int[16];
        this.field_u = new int[16];
        this.field_z = new int[16];
        this.field_M = new int[16];
        this.field_o = new int[16];
        this.field_P = new int[16];
        this.field_I = new int[16];
        this.field_C = new int[16];
        this.field_B = new int[16];
        this.field_G = 256;
        this.field_r = new ck[16][128];
        this.field_R = new ck[16][128];
        this.field_O = 1000000;
        this.field_S = new int[16];
        this.field_J = new int[16];
        this.field_W = new int[16];
        this.field_w = new id();
        this.field_x = new bl(this);
        try {
          this.field_p = param0.field_p;
          this.a((byte) 91, -1, 256);
          this.b(16, true);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "kf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_T = new int[8192];
        field_F = 0;
    }
}
