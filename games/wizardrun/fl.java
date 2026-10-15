/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends k {
    private int[] field_C;
    private int field_r;
    private int[] field_O;
    int[] field_o;
    private int[] field_w;
    private int[] field_R;
    static int field_M;
    static java.applet.Applet field_F;
    private int[] field_D;
    int[] field_y;
    private int[] field_v;
    static int field_u;
    private int[] field_P;
    private int[] field_N;
    int[] field_Q;
    private int[] field_t;
    private int[] field_B;
    private int[] field_I;
    private vk[][] field_J;
    private vk[][] field_S;
    private wf field_E;
    private int[] field_L;
    private int[] field_z;
    static int field_V;
    private int field_m;
    private ab field_G;
    private boolean field_U;
    private int field_p;
    static byte[][][] field_T;
    private long field_n;
    private long field_K;
    static java.awt.Frame field_H;
    private int field_s;
    private he field_A;
    private ji field_x;
    private int field_W;
    private boolean field_q;

    private final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        boolean decompiledFrameCompleted0 = true;
        var5 = wizardrun.field_H;
        if (param1 != this.field_P[param2]) {
          this.field_P[param2] = param1;
          var4 = 0;
          while (var4 < 128) {
            this.field_J[param2][var4] = null;
            var4++;
            if (var5 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
        }
        if ((decompiledFrameCompleted0) &&
          (param0 != -129)) {
          this.c(93, -111, 85);
        }

    }

    private final int a(vk param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.field_B[param0.field_F];
          if (param1 < 54) {
            this.a(-24);
          }
          if (var3_int >= 8192) {
            stackIn_6_0 = -((-var3_int + 16384) * (128 - param0.field_B) + 32 >> 6) + 16384;
            return stackIn_6_0;
          }
          stackIn_4_0 = 32 + param0.field_B * var3_int >> 6;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("fl.CA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized boolean a(kl param0, int param1, ue param2, ji param3, int param4) {
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Object var7 = null;
        pb var8 = null;
        int var9 = 0;
        h var10 = null;
        int var11 = 0;
        var11 = wizardrun.field_H;
        try {
          param3.a();
          var6_int = 1;
          var7 = null;
          if (param1 > ~param4) {
            var7 = new int[]{param4};
          }
          var8 = (pb) (param3.field_i.b((byte) 61));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 == null))) {
            var9 = (int)var8.field_e;
            var10 = (h) (this.field_G.a(1, (long)var9));
            if (var11 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (var10 == null) {
                var10 = ld.a(param1 + 82, var9, param0);
                if (var10 == null) {
                  var6_int = 0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  this.field_G.a(var10, -9, (long)var9);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (!var10.a(var8.field_j, param2, -75, (int[]) (var7)))) {
                var6_int = 0;
              }
              var8 = (pb) (param3.field_i.b(1));
              continue;
            }
            break;
          }
          if ((decompiledNaturalLoopExit0) &&
            (var6_int != 0)) {
            param3.b();
          }
          stackIn_19_0 = var6_int;
          return stackIn_19_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("fl.FA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(')').toString());
        }
    }

    final synchronized k c() {
        return null;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int stackIn_19_1 = 0;
        boolean stackIn_20_2 = false;
        vk var5;
        int var6_int;
        je var6;
        vk var7;
        vk var8;
        int var9;
        h var10;
        h var11;
        var9 = wizardrun.field_H;
        this.a(param3, 64, param0, (byte) -16);
        if ((this.field_y[param0] & 2) != 0) {
          var5 = (vk) (this.field_A.field_p.a((byte) 11));
          while (var5 != null) {
            if (param0 == var5.field_F &&
              var5.field_j < 0) {
              this.field_S[param0][var5.field_k] = null;
              this.field_S[param0][param3] = var5;
              var6_int = var5.field_z + (var5.field_y * var5.field_I >> 12);
              var5.field_z = var5.field_z + (-var5.field_k + param3 << 8);
              var5.field_k = param3;
              var5.field_I = -var5.field_z + var6_int;
              var5.field_y = 4096;
              return;
            }
            var5 = (vk) (this.field_A.field_p.a(102));
            if (var9 == 0) {
              continue;
            }
            break;
          }
        }
        var10 = (h) (this.field_G.a(1, (long)this.field_P[param0]));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_k[param3];
        if (var6 == null) {
          return;
        }
        var7 = new vk();
        var7.field_C = var11;
        var7.field_F = param0;
        var7.field_v = var6;
        var7.field_i = var10.field_t[param3];
        var7.field_t = var10.field_l[param3];
        var7.field_k = param3;
        var7.field_D = 1024 + param1 * (param1 * var11.field_n) * var10.field_q[param3] >> 11;
        var7.field_B = 255 & var10.field_o[param3];
        var7.field_z = -(var10.field_r[param3] & 32767) + (param3 << 8);
        var7.field_m = 0;
        var7.field_K = 0;
        var7.field_j = -1;
        var7.field_n = 0;
        var7.field_s = param2;
        if (this.field_o[param0] == 0) {
          var7.field_w = uj.a(var6, this.a(-822, var7), this.a(var7, -98), this.a(var7, (byte) 105));
          if (var9 != 0) {
            var7.field_w = uj.a(var6, this.a(param2 ^ -822, var7), 0, this.a(var7, (byte) 79));
            stackIn_19_1 = 15;
            stackIn_20_2 = !(var10.field_r[param3] >= 0);
            this.a(stackIn_19_1, stackIn_20_2, var7);
          }
        } else {
          var7.field_w = uj.a(var6, this.a(param2 ^ -822, var7), 0, this.a(var7, (byte) 79));
          stackIn_19_1 = 15;
          stackIn_20_2 = !(var10.field_r[param3] >= 0);
          this.a(stackIn_19_1, stackIn_20_2, var7);
        }
        if (0 > var10.field_r[param3]) {
          var7.field_w.e(-1);
        }
        if (var7.field_t >= 0) {
          var8 = this.field_J[param0][var7.field_t];
          if (var8 != null &&
            var8.field_j < 0) {
            this.field_S[param0][var8.field_k] = null;
            var8.field_j = 0;
          }
          this.field_J[param0][var7.field_t] = var7;
        }
        this.field_A.field_p.a(var7, false);
        this.field_S[param0][param3] = var7;
        return;
    }

    final synchronized void b(boolean param0) {
        int var3 = 0;
        h var4 = null;
        var3 = wizardrun.field_H;
        if (!param0) {
          this.a(-72, 96);
        }
        var4 = (h) (this.field_G.b((byte) -87));
        while (var4 != null) {
          var4.a(-106);
          var4 = (h) (this.field_G.b(1));
          if (var3 == 0) {
            continue;
          }
          break;
        }
    }

    private final void c(boolean param0) {
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = wizardrun.field_H;
        var2 = this.field_p;
        var3 = this.field_s;
        var4 = this.field_n;
        if (this.field_x != null &&
          var3 == this.field_W) {
          this.a(this.field_U, this.field_q, 0, this.field_x);
          this.c(false);
          return;
        }
        while (true) {
          if (this.field_s != var3) {
            this.field_n = var4;
            this.field_s = var3;
            this.field_p = var2;
            if (param0) {
              this.b(true);
            }
            if (null != this.field_x) {
              stackIn_9_0 = var3;
              stackIn_9_1 = this.field_W;
              if (stackIn_9_0 > stackIn_9_1) {
                this.field_p = -1;
                this.field_s = this.field_W;
                this.field_n = this.field_E.e(this.field_s);
              }
            }
            return;
          }
          while (true) {
            stackIn_15_0 = this.field_E.field_h[var2];
            stackIn_15_1 = var3;
            if (var7 != 0) {
              if (stackIn_15_0 > stackIn_15_1) {
                this.field_p = -1;
                this.field_s = this.field_W;
                this.field_n = this.field_E.e(this.field_s);
              }
              return;
            }
            if (stackIn_15_0 == stackIn_15_1) {
              this.field_E.a(var2);
              var6 = this.field_E.d(var2);
              stackIn_19_0 = -2;
              stackIn_19_1 = ~var6;
              if (stackIn_19_0 == stackIn_19_1) {
                this.field_E.g();
                this.field_E.c(var2);
                if (this.field_E.f()) {
                  if (this.field_x != null) {
                    this.a(this.field_U, -76, this.field_x);
                    this.c(false);
                    return;
                  }
                  if (this.field_U &&
                    0 != var3) {
                    this.field_E.a(var4);
                  } else {
                    this.a(true, (byte) -91);
                    this.field_E.e();
                    return;
                  }
                }
              } else {
                if ((var6 & 128) != 0) {
                  this.e(var6, 12035);
                }
                this.field_E.b(var2);
                this.field_E.c(var2);
                continue;
              }
            }
            break;
          }
          var2 = this.field_E.b();
          var3 = this.field_E.field_h[var2];
          var4 = this.field_E.e(var3);
        }
    }

    final void a(int param0, boolean param1, vk param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.field_v.field_k.length;
          boolean decompiledSharedTail0 = (param1 &&
            param2.field_v.field_j);
          if (!decompiledSharedTail0) {
            var5 = (int)((long)var4_int * (long)this.field_o[param2.field_F] >> 6);
            decompiledSharedTail0 = (wizardrun.field_H != 0);
          }
          if (decompiledSharedTail0) {
            var6 = -param2.field_v.field_n + var4_int + var4_int;
            var5 = (int)((long)this.field_o[param2.field_F] * (long)var6 >> 6);
            var4_int = var4_int << 8;
            if (var4_int <= var5) {
              param2.field_w.b(true);
              var5 = -var5 + (var4_int + var4_int) - 1;
            }
          }
          if (param0 != 15) {
            this.a(true, -14, (ji) null);
          }
          param2.field_w.g(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("fl.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final int a(int param0, vk param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        q var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = param1.field_z + (param1.field_I * param1.field_y >> 12);
          var3_int = var3_int + ((-8192 + this.field_I[param1.field_F]) * this.field_D[param1.field_F] >> 12);
          var4 = param1.field_i;
          if (var4.field_k > 0 && (!(var4.field_e <= 0) ||
            0 < this.field_C[param1.field_F])) {
            var5 = var4.field_e << 2;
            var6 = var4.field_a << 1;
            if (param1.field_q < var6) {
              var5 = var5 * param1.field_q / var6;
            }
            var5 = var5 + (this.field_C[param1.field_F] >> 7);
            var7 = Math.sin(0.01227184630308513 * (double)(param1.field_x & 511));
            var3_int = var3_int + (int)((double)var5 * var7);
          }
          var5Lifetime1 = (int)((double)(256 * param1.field_v.field_m) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)c.field_l + 0.5);
          if (param0 != -822) {
            this.a();
          }
          stackIn_13_0 = (var5Lifetime1 < 1) ? 1 : var5Lifetime1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("fl.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void c(int param0, int param1, int param2) {
        this.field_z[param0] = param2;
        if (param1 <= 113) {
          this.field_U = false;
        }
        this.field_Q[param0] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param2) + 0.5);
    }

    private final void b(int param0, int param1, int param2, byte param3) {
        if (param3 <= 71) {
          this.field_Q = (int[]) null;
        }
    }

    private final void c(int param0, int param1) {
        vk var3;
        int var4;
        var4 = wizardrun.field_H;
        if (param0 != 256) {
          return;
        }
        if ((2 & this.field_y[param1]) != 0) {
          var3 = (vk) (this.field_A.field_p.b((byte) 91));
          while (var3 != null) {
            if (var4 != 0) {
              break;
            }
            if (param1 == var3.field_F &&
              this.field_S[param1][var3.field_k] == null &&
              var3.field_j < 0) {
              var3.field_j = 0;
            }
            var3 = (vk) (this.field_A.field_p.d(param0 ^ 8448));
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
        var8 = wizardrun.field_H;
        var3 = 240 & param0;
        if (var3 == 128) {
          var4 = 15 & param0;
          var5 = param0 >> 8 & 127;
          var6 = 127 & param0 >> 16;
          this.a(var5, var6, var4, (byte) -16);
          return;
        }
        if (144 == var3) {
          var4Lifetime1 = param0 & 15;
          var5Lifetime1 = param0 >> 8 & 127;
          var6Lifetime1 = param0 >> 16 & 127;
          if (var6Lifetime1 > 0) {
            this.a(var4Lifetime1, var6Lifetime1, 0, var5Lifetime1);
            if (var8 == 0) {
              return;
            }
          }
          this.a(var5Lifetime1, 64, var4Lifetime1, (byte) -16);
          return;
        }
        if (var3 == 160) {
          var4Lifetime2 = 15 & param0;
          var5Lifetime2 = 127 & param0 >> 8;
          var6Lifetime2 = (8323853 & param0) >> 16;
          this.b(var4Lifetime2, var6Lifetime2, var5Lifetime2, (byte) 118);
          return;
        }
        if (176 != var3) {
          if (192 == var3) {
            var4Lifetime3 = param0 & 15;
            var5Lifetime3 = 127 & param0 >> 8;
            this.e(-129, var5Lifetime3 + this.field_w[var4Lifetime3], var4Lifetime3);
            return;
          }
          if (param1 != 12035) {
            this.field_K = -72L;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = 15 & param0;
            var5Lifetime3Lifetime1 = 127 & param0 >> 8;
            this.d(var5Lifetime3Lifetime1, 2, var4Lifetime3Lifetime1);
            return;
          }
          if (var3 == 224) {
            var4Lifetime3Lifetime2 = param0 & 15;
            var5Lifetime3Lifetime2 = (param0 >> 8 & 127) + ((param0 & 8323516) >> 9);
            this.b(var4Lifetime3Lifetime2, var5Lifetime3Lifetime2, 38);
            return;
          }
          var3 = param0 & 255;
          if (var3 != 255) {
            return;
          }
          this.a(true, (byte) -78);
          return;
        }
        var4Lifetime4 = 15 & param0;
        var5Lifetime4 = (param0 & 32628) >> 8;
        var6Lifetime3 = (param0 & 8367717) >> 16;
        if (var5Lifetime4 == 0) {
          this.field_w[var4Lifetime4] = (var6Lifetime3 << 14) + kl.b(this.field_w[var4Lifetime4], -2080769);
        }
        if (var5Lifetime4 == 32) {
          this.field_w[var4Lifetime4] = (var6Lifetime3 << 7) + kl.b(this.field_w[var4Lifetime4], -16257);
        }
        if (1 == var5Lifetime4) {
          this.field_C[var4Lifetime4] = kl.b(this.field_C[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 33) {
          this.field_C[var4Lifetime4] = var6Lifetime3 + kl.b(-128, this.field_C[var4Lifetime4]);
        }
        if (var5Lifetime4 == 5) {
          this.field_t[var4Lifetime4] = (var6Lifetime3 << 7) + kl.b(-16257, this.field_t[var4Lifetime4]);
        }
        if (var5Lifetime4 == 37) {
          this.field_t[var4Lifetime4] = var6Lifetime3 + kl.b(-128, this.field_t[var4Lifetime4]);
        }
        if (7 == var5Lifetime4) {
          this.field_N[var4Lifetime4] = kl.b(-16257, this.field_N[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 39) {
          this.field_N[var4Lifetime4] = kl.b(-128, this.field_N[var4Lifetime4]) + var6Lifetime3;
        }
        if (10 == var5Lifetime4) {
          this.field_B[var4Lifetime4] = (var6Lifetime3 << 7) + kl.b(this.field_B[var4Lifetime4], -16257);
        }
        if (42 == var5Lifetime4) {
          this.field_B[var4Lifetime4] = kl.b(this.field_B[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 11) {
          this.field_v[var4Lifetime4] = (var6Lifetime3 << 7) + kl.b(-16257, this.field_v[var4Lifetime4]);
        }
        if (var5Lifetime4 == 43) {
          this.field_v[var4Lifetime4] = kl.b(-128, this.field_v[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 64) {
          if (var6Lifetime3 >= 64) {
            this.field_y[var4Lifetime4] = sd.a(this.field_y[var4Lifetime4], 1);
            if (var8 != 0) {
              this.field_y[var4Lifetime4] = kl.b(this.field_y[var4Lifetime4], -2);
            }
          } else {
            this.field_y[var4Lifetime4] = kl.b(this.field_y[var4Lifetime4], -2);
          }
        }
        if (var5Lifetime4 == 65) {
          if (64 > var6Lifetime3) {
            this.c(256, var4Lifetime4);
            this.field_y[var4Lifetime4] = kl.b(this.field_y[var4Lifetime4], -3);
            if (var8 != 0) {
              this.field_y[var4Lifetime4] = sd.a(this.field_y[var4Lifetime4], 2);
            }
          } else {
            this.field_y[var4Lifetime4] = sd.a(this.field_y[var4Lifetime4], 2);
          }
        }
        if (99 == var5Lifetime4) {
          this.field_L[var4Lifetime4] = (var6Lifetime3 << 7) + kl.b(127, this.field_L[var4Lifetime4]);
        }
        if (98 == var5Lifetime4) {
          this.field_L[var4Lifetime4] = var6Lifetime3 + kl.b(16256, this.field_L[var4Lifetime4]);
        }
        if (101 == var5Lifetime4) {
          this.field_L[var4Lifetime4] = kl.b(127, this.field_L[var4Lifetime4]) + (16384 + (var6Lifetime3 << 7));
        }
        if (var5Lifetime4 == 100) {
          this.field_L[var4Lifetime4] = kl.b(this.field_L[var4Lifetime4], 16256) + (16384 + var6Lifetime3);
        }
        if (var5Lifetime4 == 120) {
          this.d(param1 - 12035, var4Lifetime4);
        }
        if (var5Lifetime4 == 121) {
          this.a(var4Lifetime4, (byte) 21);
        }
        if (123 == var5Lifetime4) {
          this.g(var4Lifetime4, -1);
        }
        if (6 == var5Lifetime4) {
          var7 = this.field_L[var4Lifetime4];
          if (var7 == 16384) {
            this.field_D[var4Lifetime4] = (var6Lifetime3 << 7) + kl.b(this.field_D[var4Lifetime4], -16257);
          }
        }
        if (38 == var5Lifetime4) {
          var7Lifetime1 = this.field_L[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.field_D[var4Lifetime4] = kl.b(this.field_D[var4Lifetime4], -128) + var6Lifetime3;
          }
        }
        if (16 == var5Lifetime4) {
          this.field_o[var4Lifetime4] = (var6Lifetime3 << 7) + kl.b(this.field_o[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 48) {
          this.field_o[var4Lifetime4] = kl.b(-128, this.field_o[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 81) {
          if (var6Lifetime3 >= 64) {
            this.field_y[var4Lifetime4] = sd.a(this.field_y[var4Lifetime4], 4);
            if (var8 != 0) {
              this.b(-1, var4Lifetime4);
              this.field_y[var4Lifetime4] = kl.b(this.field_y[var4Lifetime4], -5);
            }
          } else {
            this.b(-1, var4Lifetime4);
            this.field_y[var4Lifetime4] = kl.b(this.field_y[var4Lifetime4], -5);
          }
        }
        if (17 == var5Lifetime4) {
          this.c(var4Lifetime4, param1 ^ 12154, (var6Lifetime3 << 7) + (this.field_z[var4Lifetime4] & -16257));
        }
        if (var5Lifetime4 != 49) {
          return;
        }
        this.c(var4Lifetime4, param1 ^ 12148, (-128 & this.field_z[var4Lifetime4]) + var6Lifetime3);
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameCompleted0 = true;
        var6 = wizardrun.field_H;
        if (this.field_E.c()) {
          var2 = this.field_r * this.field_E.field_d / c.field_l;
          while (true) {
            var3 = (long)var2 * (long)param0 + this.field_K;
            if (-var3 + this.field_n >= 0L) {
              this.field_K = var3;
              if (var6 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
              break;
            }
            var5 = (int)((-1L + ((long)var2 + this.field_n - this.field_K)) / (long)var2);
            this.field_K = this.field_K + (long)var5 * (long)var2;
            this.field_A.a(var5);
            param0 = param0 - var5;
            this.c(false);
            if (!this.field_E.c() &&
              var6 == 0) {
              break;
            }
            if (var6 == 0) {
              continue;
            }
            this.field_A.a(param0);
            decompiledFrameCompleted0 = false;
            break;
          }
        }
        if ((decompiledFrameCompleted1) &&
          (decompiledFrameCompleted0)) {
          this.field_A.a(param0);
        }

    }

    final synchronized void a(int param0, int param1, byte param2) {
        if (param2 != 108) {
          return;
        }
        this.f(param0, param1, 1);
    }

    final synchronized void a(boolean param0, int param1, ji param2) {
        try {
          if (param1 >= -75) {
            this.field_r = -65;
          }
          this.a(param0, true, 0, param2);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "fl.T(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void d(int param0) {
        this.a(true, true);
        if (param0 >= -20) {
          field_T = (byte[][][]) null;
        }
    }

    public static void c(int param0) {
        int var1 = -95 / ((param0 + 33) / 63);
        field_F = null;
        field_H = null;
        field_T = (byte[][][]) null;
    }

    private final void g(int param0, int param1) {
        vk var3;
        int var4;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        var4 = wizardrun.field_H;
        var3 = (vk) (this.field_A.field_p.b((byte) 110));
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
          stackIn_10_0 = -1;
          stackIn_10_1 = ~param0;
          if (var4 == 0) {
            if ((stackIn_10_0 < stackIn_10_1 ||
              param0 == var3.field_F) &&
              var3.field_j < 0) {
              this.field_S[var3.field_F][var3.field_k] = null;
              var3.field_j = 0;
            }
            var3 = (vk) (this.field_A.field_p.d(param1 ^ -8193));
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_10_0 = param1;
          stackIn_10_1 = -1;
        }
        if (stackIn_10_0 != stackIn_10_1) {
          this.field_y = (int[]) null;
        }
        return;
    }

    private final synchronized void a(boolean param0, boolean param1, int param2, ji param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = wizardrun.field_H;
        try {
          this.a(true, param1);
          this.field_E.a(param3.field_j);
          stackIn_4_1 = (param0);
          this.field_U = stackIn_4_1;
          this.field_K = (long)param2;
          var5_int = this.field_E.d();
          var6 = 0;
          while (var5_int > var6) {
            this.field_E.a(var6);
            this.field_E.b(var6);
            this.field_E.c(var6);
            var6++;
            if (var7 != 0) {
              return;
            }
          }
          this.field_p = this.field_E.b();
          this.field_s = this.field_E.field_h[this.field_p];
          this.field_n = this.field_E.e(this.field_s);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("fl.IA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final synchronized void a(boolean param0, boolean param1) {
        this.field_E.e();
        this.field_x = null;
        this.a(param1, (byte) -71);
        if (!param0) {
          this.a((int[]) null, -66, -74);
        }
    }

    final boolean b(int param0, vk param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            return false;
          }
          if (null != param1.field_w) {
            return false;
          }
          if (param1.field_j >= 0) {
            param1.a(false);
            if (param1.field_t > 0 &&
              this.field_J[param1.field_F][param1.field_t] == param1) {
              this.field_J[param1.field_F][param1.field_t] = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("fl.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final synchronized void a(int param0, int param1) {
        this.field_m = param1;
        if (param0 != -1) {
          this.field_J = (vk[][]) null;
        }
    }

    private final void f(int param0, int param1, int param2) {
        this.field_O[param1] = param0;
        this.field_w[param1] = kl.b(param0, -128);
        if (param2 != 1) {
          this.field_o = (int[]) null;
        }
        this.e(param2 ^ -130, param0, param1);
    }

    private final void a(int param0, byte param1) {
        int var4 = wizardrun.field_H;
        if (param0 >= 0) {
        } else {
          param0 = 0;
          do {
            if (param0 >= 16) {
              return;
            }
            this.a(param0, (byte) 21);
            param0++;
          } while (var4 == 0);
          return;
        }
        this.field_N[param0] = 12800;
        this.field_B[param0] = 8192;
        if (param1 == 21) {
          this.field_v[param0] = 16383;
          this.field_I[param0] = 8192;
          this.field_C[param0] = 0;
          this.field_t[param0] = 8192;
          this.c(256, param0);
          this.b(-1, param0);
          this.field_y[param0] = 0;
          this.field_L[param0] = 32767;
          this.field_D[param0] = 256;
          this.field_o[param0] = 0;
          this.c(param0, param1 + 103, 8192);
          return;
        }
    }

    final boolean a(int param0, int[] param1, vk param2, int param3, int param4) {
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        q var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = wizardrun.field_H;
        try {
          param2.field_E = c.field_l / 100;
          if (param2.field_j >= 0 && (null == param2.field_w ||
            param2.field_w.g())) {
            param2.a(0);
            param2.a(false);
            if (0 < param2.field_t &&
              param2 == this.field_J[param2.field_F][param2.field_t]) {
              this.field_J[param2.field_F][param2.field_t] = null;
              return true;
            }
            return true;
          }
          var6_int = param2.field_y;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_t[param2.field_F]) + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param2.field_y = var6_int;
          }
          param2.field_w.d(this.a(-822, param2));
          var7 = param2.field_i;
          param2.field_q = param2.field_q + 1;
          param2.field_x = param2.field_x + var7.field_k;
          var8 = 0;
          var9 = (double)((-60 + param2.field_k << 8) + (param2.field_I * param2.field_y >> 12)) * 0.000005086263020833333;
          if (var7.field_h > 0) {
            if (var7.field_d > 0) {
              param2.field_m = param2.field_m + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_d * var9));
              if (var11 != 0) {
                param2.field_m = param2.field_m + 128;
              }
            } else {
              param2.field_m = param2.field_m + 128;
            }
            if (var7.field_h * param2.field_m >= 819200) {
              var8 = 1;
            }
          }
          if (null != var7.field_f) {
            boolean decompiledSharedTail1 = !(var7.field_i <= 0);
            if (!decompiledSharedTail1) {
              param2.field_K = param2.field_K + 128;
              decompiledSharedTail1 = (var11 != 0);
            }
            if (decompiledSharedTail1) {
              param2.field_K = param2.field_K + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_i));
            }
            while (true) {
              boolean decompiledFrameRemainder1 = true;
              if (param2.field_n < var7.field_f.length - 2) {
                stackIn_35_0 = (255 & var7.field_f[2 + param2.field_n]) << 8;
                stackIn_35_1 = param2.field_K;
                decompiledFrameRemainder1 = (var11 == 0);
                if ((decompiledFrameRemainder1) &&
                  (stackIn_35_0 < stackIn_35_1)) {
                  param2.field_n = param2.field_n + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder1) {
                stackIn_35_0 = var7.field_f.length - 2;
                stackIn_35_1 = param2.field_n;
              }
              if (stackIn_35_0 != stackIn_35_1) {
                break;
              }
              if (var7.field_f[param2.field_n + 1] != 0) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (param2.field_j >= param0 &&
            null != var7.field_c &&
            (this.field_y[param2.field_F] & 1) == 0 && (!(param2.field_t >= 0) ||
            param2 != this.field_J[param2.field_F][param2.field_t])) {
            boolean decompiledSharedTail0 = !(0 >= var7.field_j);
            if (!decompiledSharedTail0) {
              param2.field_j = param2.field_j + 128;
              decompiledSharedTail0 = (var11 != 0);
            }
            if (decompiledSharedTail0) {
              param2.field_j = param2.field_j + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_j) * 128.0);
            }
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var7.field_c.length - 2 > param2.field_s) {
                stackIn_55_0 = param2.field_j;
                stackIn_55_1 = var7.field_c[2 + param2.field_s] << 8 & 65280;
                decompiledFrameRemainder0 = (var11 == 0);
                if ((decompiledFrameRemainder0) &&
                  (stackIn_55_0 > stackIn_55_1)) {
                  param2.field_s = param2.field_s + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_55_0 = param2.field_s;
                stackIn_55_1 = -2 + var7.field_c.length;
              }
              if (stackIn_55_0 != stackIn_55_1) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (var8 == 0) {
            param2.field_w.a(param2.field_E, this.a(param2, -109), this.a(param2, (byte) 59));
            return false;
          }
          param2.field_w.f(param2.field_E);
          if (param1 != null) {
            param2.field_w.a(param1, param4, param3);
            if (var11 != 0) {
              param2.field_w.a(param3);
            }
          } else {
            param2.field_w.a(param3);
          }
          if (param2.field_w.i()) {
            this.field_A.field_o.a(param2.field_w);
          }
          param2.a(0);
          if (param2.field_j >= 0) {
            param2.a(false);
            if (param2.field_t > 0 &&
              this.field_J[param2.field_F][param2.field_t] == param2) {
              this.field_J[param2.field_F][param2.field_t] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_76_0 = var6;
          stackIn_76_1 = new StringBuilder().append("fl.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',');
          if (param2 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_76_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        boolean decompiledFrameCompleted0 = true;
        var5 = wizardrun.field_H;
        if (param2 < 0) {
          var4 = 0;
          while (var4 < 16) {
            this.field_R[var4] = param0;
            var4++;
            if (var5 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
          if ((decompiledFrameCompleted0) &&
            (var5 != 0)) {
            this.field_R[param2] = param0;
          }
        } else {
          this.field_R[param2] = param0;
        }
        if (param1 <= 99) {
          field_T = (byte[][][]) null;
        }
    }

    final synchronized int d() {
        return 0;
    }

    final static void f(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = wizardrun.field_H;
        try {
          wizardrun.a(true, (byte) 11, param0, lg.field_d, dg.field_d, rb.field_e, 0);
          var2_int = 0;
          if (param1 != 16) {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "fl.QA(" + param0 + ',' + param1 + ')');
        }
        stackIn_5_0 = lg.field_d;
        try {
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (stackIn_5_0 <= var2_int))) {
            sj.field_m[param0 + var2_int] = var2_int;
            var2_int++;
            if (var3 == 0) {
              stackIn_5_0 = lg.field_d;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            wizardrun.a(false, (byte) 11, param0 + param0, lg.field_d + param0, gf.field_W, dj.field_b, param0);
          }
          if (lg.field_d > param0) {
            lg.field_d = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var2), "fl.QA(" + param0 + ',' + param1 + ')');
        }
    }

    private final int a(vk param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        q var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          var3_int = 123 / ((49 - param1) / 44);
          if (this.field_R[param0.field_F] == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var4 = param0.field_i;
          var5 = 4096 + this.field_N[param0.field_F] * this.field_v[param0.field_F] >> 13;
          var5 = var5 * var5 + 16384 >> 15;
          var5 = 16384 + param0.field_D * var5 >> 15;
          var5 = 128 + this.field_m * var5 >> 8;
          var5 = 128 + var5 * this.field_R[param0.field_F] >> 8;
          if (var4.field_h > 0) {
            var5 = (int)((double)var5 * Math.pow(0.5, (double)var4.field_h * ((double)param0.field_m * 0.00001953125)) + 0.5);
          }
          if (null != var4.field_f) {
            var6 = param0.field_K;
            var7 = var4.field_f[1 + param0.field_n];
            if (param0.field_n < -2 + var4.field_f.length) {
              var8 = (var4.field_f[param0.field_n] & 255) << 8;
              var9 = (255 & var4.field_f[param0.field_n + 2]) << 8;
              var7 = var7 + (-var7 + var4.field_f[param0.field_n + 3]) * (var6 - var8) / (-var8 + var9);
            }
            var5 = var5 * var7 + 32 >> 6;
          }
          if (param0.field_j > 0 &&
            null != var4.field_c) {
            var6Lifetime1 = param0.field_j;
            var7Lifetime1 = var4.field_c[1 + param0.field_s];
            if (var4.field_c.length - 2 > param0.field_s) {
              var8Lifetime1 = var4.field_c[param0.field_s] << 8 & 65280;
              var9Lifetime1 = (var4.field_c[param0.field_s + 2] & 255) << 8;
              var7Lifetime1 = var7Lifetime1 + (var6Lifetime1 - var8Lifetime1) * (var4.field_c[3 + param0.field_s] - var7Lifetime1) / (-var8Lifetime1 + var9Lifetime1);
            }
            var5 = var7Lifetime1 * var5 + 32 >> 6;
          }
          stackIn_18_0 = var5;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("fl.U(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        vk var6 = null;
        int var7 = 0;
        vk var8 = null;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        var7 = wizardrun.field_H;
        var8 = this.field_S[param2][param0];
        if (var8 == null) {
          return;
        }
        boolean decompiledFrameCompleted0 = true;
        this.field_S[param2][param0] = null;
        if ((this.field_y[param2] & 2) != 0) {
          var6 = (vk) (this.field_A.field_p.b((byte) 84));
          while (true) {
            if (var6 != null) {
              stackIn_16_0 = ~var8.field_F;
              stackIn_16_1 = ~var6.field_F;
              if (var7 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_16_0 == stackIn_16_1 &&
                var6.field_j < 0 &&
                var6 != var8) {
                var8.field_j = 0;
              } else {
                var6 = (vk) (this.field_A.field_p.d(8192));
                continue;
              }
            }
            break;
          }
          if ((decompiledFrameCompleted0) &&
            (var7 != 0)) {
            var8.field_j = 0;
          }
        } else {
          var8.field_j = 0;
        }
        if (decompiledFrameCompleted0) {
          stackIn_16_0 = param3;
          stackIn_16_1 = -16;
        }
        if (stackIn_16_0 != stackIn_16_1) {
          this.field_P = (int[]) null;
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        var8 = wizardrun.field_H;
        try {
          if (this.field_E.c()) {
            var4_int = this.field_r * this.field_E.field_d / c.field_l;
            while (true) {
              var5 = this.field_K + (long)param2 * (long)var4_int;
              if (this.field_n - var5 >= 0L) {
                this.field_K = var5;
                if (var8 != 0) {
                  return;
                }
                break;
              }
              var7 = (int)((-1L + (long)var4_int + (-this.field_K + this.field_n)) / (long)var4_int);
              this.field_K = this.field_K + (long)var7 * (long)var4_int;
              this.field_A.a(param0, param1, var7);
              param1 = param1 + var7;
              param2 = param2 - var7;
              this.c(false);
              if (!this.field_E.c() &&
                var8 == 0) {
                break;
              }
              if (var8 == 0) {
                continue;
              }
              this.field_A.a(param0, param1, param2);
              return;
            }
          }
          this.field_A.a(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("fl.D(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void b(int param0, int param1, int param2) {
        this.field_I[param0] = param1;
        if (param2 != 38) {
          this.d(11, -69, 19);
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = wizardrun.field_H;
        if (!param0) {
          this.g(-1, -1);
          if (var4 != 0) {
            this.d(0, -1);
          }
        } else {
          this.d(0, -1);
        }
        this.a(-1, (byte) 21);
        var3 = 0;
        do {
          if (16 <= var3) {
            var3 = 0;
            break;
          }
          this.field_P[var3] = this.field_O[var3];
          var3++;
        } while (var4 == 0);
        if (param1 > -62) {
          this.f(-85, 122, -57);
        }
        while (16 > var3) {
          this.field_w[var3] = kl.b(this.field_O[var3], -128);
          var3++;
          if (var4 == 0) {
            continue;
          }
          break;
        }
        return;
    }

    private final void b(int param0, int param1) {
        vk var3;
        int var4;
        var4 = wizardrun.field_H;
        if (param0 != ~(4 & this.field_y[param1])) {
          var3 = (vk) (this.field_A.field_p.b((byte) 55));
          while (var3 != null) {
            if (var4 != 0) {
              break;
            }
            if (param1 == var3.field_F) {
              var3.field_H = 0;
            }
            var3 = (vk) (this.field_A.field_p.d(8192));
          }
        }
    }

    final synchronized k a() {
        return (k) ((Object) this.field_A);
    }

    private final void d(int param0, int param1) {
        vk var3;
        int var4;
        var4 = wizardrun.field_H;
        if (param0 != 0) {
          return;
        }
        var3 = (vk) (this.field_A.field_p.b((byte) 92));
        while (var3 != null) {
          if (var4 == 0) {
            if (param1 < 0 ||
              var3.field_F == param1) {
              if (var3.field_w != null) {
                var3.field_w.f(c.field_l / 100);
                if (var3.field_w.i()) {
                  this.field_A.field_o.a(var3.field_w);
                }
                var3.a(0);
              }
              if (var3.field_j < 0) {
                this.field_S[var3.field_F][var3.field_k] = null;
              }
              var3.a(false);
            }
            var3 = (vk) (this.field_A.field_p.d(8192));
            continue;
          }
          break;
        }
        return;
    }

    private final void d(int param0, int param1, int param2) {
        if (param1 != 2) {
          fl.f(67, -78);
        }
    }

    public fl() {
        this.field_r = 1000000;
        this.field_D = new int[16];
        this.field_R = new int[16];
        this.field_Q = new int[16];
        this.field_w = new int[16];
        this.field_N = new int[16];
        this.field_y = new int[16];
        this.field_B = new int[16];
        this.field_t = new int[16];
        this.field_P = new int[16];
        this.field_S = new vk[16][128];
        this.field_I = new int[16];
        this.field_C = new int[16];
        this.field_v = new int[16];
        this.field_z = new int[16];
        this.field_O = new int[16];
        this.field_J = new vk[16][128];
        this.field_m = 256;
        this.field_L = new int[16];
        this.field_o = new int[16];
        this.field_E = new wf();
        this.field_A = new he(this);
        this.field_G = new ab(128);
        this.a(256, 114, -1);
        this.a(true, (byte) -67);
    }

    static {
        sk.a(16062, 50);
    }
}
