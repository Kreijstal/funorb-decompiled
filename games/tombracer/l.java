/*
 * Decompiled by CFR-JS 0.4.0.
 */
class l extends cg {
    private ji field_r;
    int[] field_M;
    int[] field_q;
    private int[] field_l;
    private int[] field_k;
    private int[] field_D;
    private int[] field_J;
    private int[] field_O;
    private int[] field_A;
    private int[] field_z;
    private rta[][] field_n;
    private int[] field_F;
    private int[] field_m;
    private maa field_w;
    private int[] field_o;
    private int field_G;
    private int[] field_y;
    int[] field_u;
    private int field_H;
    static jea field_K;
    private rta[][] field_I;
    private int[] field_N;
    private int[] field_L;
    private int field_j;
    private int field_p;
    private long field_E;
    private long field_B;
    private et field_v;
    private boolean field_t;
    private int field_C;
    private boolean field_s;
    private qua field_x;

    final synchronized void d(int param0, int param1, int param2) {
        this.c(param1, 125, param0);
        if (param2 != 32460) {
          this.field_E = -39L;
        }
    }

    private final int b(int param0, rta param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2421) {
            this.field_t = true;
          }
          var3_int = this.field_A[param1.field_k];
          if (var3_int >= 8192) {
            stackIn_6_0 = 16384 - ((128 - param1.field_h) * (-var3_int + 16384) + 32 >> 6);
            return stackIn_6_0;
          }
          stackIn_4_0 = var3_int * param1.field_h + 32 >> 6;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("l.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final synchronized boolean a(byte param0) {
        if (param0 > -70) {
          this.a((byte) -3, 35, 27);
        }
        return this.field_w.g();
    }

    private final int a(rta param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        bq var9 = null;
        bq var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (0 == this.field_N[param0.field_k]) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var9 = param0.field_v;
          var10 = var9;
          var4 = 4096 + this.field_L[param0.field_k] * this.field_y[param0.field_k] >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = param0.field_s * var4 + 16384 >> 15;
          if (param1 < 71) {
            stackIn_6_0 = -110;
            return stackIn_6_0;
          }
          var4 = this.field_G * var4 + 128 >> 8;
          var4 = var4 * this.field_N[param0.field_k] + 128 >> 8;
          if (var10.field_n > 0) {
            var4 = (int)(0.5 + Math.pow(0.5, 0.00001953125 * (double)param0.field_f * (double)var10.field_n) * (double)var4);
          }
          if (null != var10.field_m) {
            var5 = param0.field_A;
            var6 = var10.field_m[param0.field_w + 1];
            if (param0.field_w < (var10.field_m.length - 2)) {
              var7 = 65280 & var9.field_m[param0.field_w] << 8;
              var8 = var10.field_m[2 + param0.field_w] << 8 & 65280;
              var6 = var6 + (var5 - var7) * (-var6 + var10.field_m[3 + param0.field_w]) / (var8 - var7);
            }
            var4 = var6 * var4 + 32 >> 6;
          }
          if (0 < param0.field_t &&
            null != var10.field_g) {
            var5Lifetime1 = param0.field_t;
            var6Lifetime1 = var10.field_g[1 + param0.field_i];
            if ((-2 + var10.field_g.length) > param0.field_i) {
              var7Lifetime1 = (var9.field_g[param0.field_i] & 255) << 8;
              var8Lifetime1 = (var10.field_g[param0.field_i + 2] & 255) << 8;
              var6Lifetime1 = var6Lifetime1 + (var5Lifetime1 - var7Lifetime1) * (var10.field_g[param0.field_i + 3] - var6Lifetime1) / (-var7Lifetime1 + var8Lifetime1);
            }
            var4 = 32 + var4 * var6Lifetime1 >> 6;
          }
          stackIn_21_0 = var4;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("l.KA(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized void a(int param0, int param1) {
        int var3 = 87 / ((param1 - 53) / 54);
        this.field_G = param0;
    }

    final boolean c(int param0, rta param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.field_x != null) {
            if (param0 != 15) {
              this.field_y = (int[]) null;
            }
            return false;
          }
          if (param1.field_t < 0) {
            return true;
          }
          param1.p(70);
          if (param1.field_z > 0 &&
            this.field_n[param1.field_k][param1.field_z] == param1) {
            this.field_n[param1.field_k][param1.field_z] = null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("l.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        if (param0 != 0) {
          l.a(8, -95, (java.awt.Canvas) null, (d) null, -74);
        }
        field_K = null;
    }

    private final void d(int param0, int param1) {
        rta var3;
        int var4;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        boolean decompiledFrameCompleted0 = true;
        var4 = TombRacer.field_G ? 1 : 0;
        if ((this.field_M[param1] & 2) != 0) {
          var3 = (rta) (this.field_v.field_l.f(-80));
          while (var3 != null) {
            stackIn_11_0 = param1;
            stackIn_11_1 = var3.field_k;
            if (var4 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (stackIn_11_0 == stackIn_11_1 &&
              this.field_I[param1][var3.field_m] == null &&
              0 > var3.field_t) {
              var3.field_t = 0;
            }
            var3 = (rta) (this.field_v.field_l.e(123));
          }
        }
        if (decompiledFrameCompleted0) {
          stackIn_11_0 = param0;
          stackIn_11_1 = -44;
        }
        if (stackIn_11_0 > stackIn_11_1) {
          this.a((byte) -62);
        }
    }

    final static ha a(int param0, int param1, java.awt.Canvas param2, d param3, int param4) {
        RuntimeException var5 = null;
        sfa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 127) {
            l.c(-1);
          }
          stackIn_3_0 = new sfa(param2, param3, param4, param0);
          return (ha) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("l.JA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void c(int param0, int param1) {
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
        int var4Lifetime1Lifetime1;
        int var4Lifetime1Lifetime2;
        int var4Lifetime1Lifetime3;
        int var5Lifetime1Lifetime1;
        int var5Lifetime1Lifetime2;
        int var5Lifetime1Lifetime3;
        int var6Lifetime1Lifetime1;
        int var6Lifetime1Lifetime2;
        int var4Lifetime1Lifetime2Lifetime1;
        int var4Lifetime1Lifetime2Lifetime2;
        int var5Lifetime1Lifetime2Lifetime1;
        int var5Lifetime1Lifetime2Lifetime2;
        var8 = TombRacer.field_G ? 1 : 0;
        var3 = 240 & param0;
        if (var3 == param1) {
          var4 = 15 & param0;
          var5 = 127 & param0 >> 8;
          var6 = (8386231 & param0) >> 16;
          this.a(var5, var4, var6, 0);
          return;
        }
        L0: {
          if (144 == var3) {
            var4Lifetime1 = 15 & param0;
            var5Lifetime1 = 127 & param0 >> 8;
            var6Lifetime1 = (param0 & 8342499) >> 16;
            if (var6Lifetime1 <= 0) {
              this.a(var5Lifetime1, var4Lifetime1, 64, 0);
              if (var8 == 0) {
                break L0;
              }
            }
            this.b(var5Lifetime1, 0, var4Lifetime1, var6Lifetime1);
            return;
          }
          if (var3 == 160) {
            var4Lifetime1Lifetime1 = param0 & 15;
            var5Lifetime1Lifetime1 = (32529 & param0) >> 8;
            var6Lifetime1Lifetime1 = (param0 & 8342767) >> 16;
            this.a(var6Lifetime1Lifetime1, (byte) -104, var4Lifetime1Lifetime1, var5Lifetime1Lifetime1);
            return;
          }
          if (var3 != 176) {
            if (var3 == 192) {
              var4Lifetime1Lifetime2 = 15 & param0;
              var5Lifetime1Lifetime2 = (32618 & param0) >> 8;
              this.a(var4Lifetime1Lifetime2, true, this.field_l[var4Lifetime1Lifetime2] + var5Lifetime1Lifetime2);
              return;
            }
            if (208 == var3) {
              var4Lifetime1Lifetime2Lifetime1 = 15 & param0;
              var5Lifetime1Lifetime2Lifetime1 = (32632 & param0) >> 8;
              this.b(var4Lifetime1Lifetime2Lifetime1, var5Lifetime1Lifetime2Lifetime1, 98);
              return;
            }
            if (var3 == 224) {
              var4Lifetime1Lifetime2Lifetime2 = 15 & param0;
              var5Lifetime1Lifetime2Lifetime2 = (16256 & param0 >> 9) + ((param0 & 32646) >> 8);
              this.a(var4Lifetime1Lifetime2Lifetime2, (byte) 109, var5Lifetime1Lifetime2Lifetime2);
              return;
            }
            var3 = param0 & 255;
            if (var3 != 255) {
              return;
            }
            this.a(true, -121);
            return;
          }
          var4Lifetime1Lifetime3 = 15 & param0;
          var5Lifetime1Lifetime3 = 127 & param0 >> 8;
          var6Lifetime1Lifetime2 = (param0 & 8338047) >> 16;
          if (var5Lifetime1Lifetime3 == 0) {
            this.field_l[var4Lifetime1Lifetime3] = sea.c(this.field_l[var4Lifetime1Lifetime3], -2080769) + (var6Lifetime1Lifetime2 << 14);
          }
          if (var5Lifetime1Lifetime3 == 32) {
            this.field_l[var4Lifetime1Lifetime3] = sea.c(-16257, this.field_l[var4Lifetime1Lifetime3]) + (var6Lifetime1Lifetime2 << 7);
          }
          if (var5Lifetime1Lifetime3 == 1) {
            this.field_m[var4Lifetime1Lifetime3] = sea.c(this.field_m[var4Lifetime1Lifetime3], -16257) + (var6Lifetime1Lifetime2 << 7);
          }
          if (var5Lifetime1Lifetime3 == 33) {
            this.field_m[var4Lifetime1Lifetime3] = sea.c(this.field_m[var4Lifetime1Lifetime3], -128) + var6Lifetime1Lifetime2;
          }
          if (5 == var5Lifetime1Lifetime3) {
            this.field_z[var4Lifetime1Lifetime3] = sea.c(-16257, this.field_z[var4Lifetime1Lifetime3]) + (var6Lifetime1Lifetime2 << 7);
          }
          if (var5Lifetime1Lifetime3 == 37) {
            this.field_z[var4Lifetime1Lifetime3] = sea.c(-128, this.field_z[var4Lifetime1Lifetime3]) + var6Lifetime1Lifetime2;
          }
          if (var5Lifetime1Lifetime3 == 7) {
            this.field_L[var4Lifetime1Lifetime3] = sea.c(-16257, this.field_L[var4Lifetime1Lifetime3]) + (var6Lifetime1Lifetime2 << 7);
          }
          if (var5Lifetime1Lifetime3 == 39) {
            this.field_L[var4Lifetime1Lifetime3] = var6Lifetime1Lifetime2 + sea.c(this.field_L[var4Lifetime1Lifetime3], -128);
          }
          if (10 == var5Lifetime1Lifetime3) {
            this.field_A[var4Lifetime1Lifetime3] = (var6Lifetime1Lifetime2 << 7) + sea.c(-16257, this.field_A[var4Lifetime1Lifetime3]);
          }
          if (var5Lifetime1Lifetime3 == 42) {
            this.field_A[var4Lifetime1Lifetime3] = var6Lifetime1Lifetime2 + sea.c(-128, this.field_A[var4Lifetime1Lifetime3]);
          }
          if (var5Lifetime1Lifetime3 == 11) {
            this.field_y[var4Lifetime1Lifetime3] = sea.c(this.field_y[var4Lifetime1Lifetime3], -16257) + (var6Lifetime1Lifetime2 << 7);
          }
          if (var5Lifetime1Lifetime3 == 43) {
            this.field_y[var4Lifetime1Lifetime3] = var6Lifetime1Lifetime2 + sea.c(-128, this.field_y[var4Lifetime1Lifetime3]);
          }
          switch (var5Lifetime1Lifetime3) {
            case 64:
              if (var6Lifetime1Lifetime2 < 64) {
                this.field_M[var4Lifetime1Lifetime3] = sea.c(this.field_M[var4Lifetime1Lifetime3], -2);
                if (var8 != 0) {
                  this.field_M[var4Lifetime1Lifetime3] = fh.a(this.field_M[var4Lifetime1Lifetime3], 1);
                }
              } else {
                this.field_M[var4Lifetime1Lifetime3] = fh.a(this.field_M[var4Lifetime1Lifetime3], 1);
              }
              break;
            case 65:
              if (var6Lifetime1Lifetime2 < 64) {
                this.d(-108, var4Lifetime1Lifetime3);
                this.field_M[var4Lifetime1Lifetime3] = sea.c(this.field_M[var4Lifetime1Lifetime3], -3);
                if (var8 != 0) {
                  this.field_M[var4Lifetime1Lifetime3] = fh.a(this.field_M[var4Lifetime1Lifetime3], 2);
                }
              } else {
                this.field_M[var4Lifetime1Lifetime3] = fh.a(this.field_M[var4Lifetime1Lifetime3], 2);
              }
              break;
            case 99:
              this.field_J[var4Lifetime1Lifetime3] = sea.c(127, this.field_J[var4Lifetime1Lifetime3]) + (var6Lifetime1Lifetime2 << 7);
              break;
            case 98:
              this.field_J[var4Lifetime1Lifetime3] = var6Lifetime1Lifetime2 + sea.c(this.field_J[var4Lifetime1Lifetime3], 16256);
              break;
            case 101:
              this.field_J[var4Lifetime1Lifetime3] = (var6Lifetime1Lifetime2 << 7) + sea.c(this.field_J[var4Lifetime1Lifetime3], 127) + 16384;
              break;
            case 100:
              this.field_J[var4Lifetime1Lifetime3] = 16384 + (sea.c(this.field_J[var4Lifetime1Lifetime3], 16256) + var6Lifetime1Lifetime2);
              break;
            case 120:
              this.b(true, var4Lifetime1Lifetime3);
              break;
            case 121:
              this.a((byte) 101, var4Lifetime1Lifetime3);
              break;
            case 123:
              this.b(var4Lifetime1Lifetime3, 92);
              break;
            case 6:
              var7 = this.field_J[var4Lifetime1Lifetime3];
              if (var7 == 16384) {
                this.field_F[var4Lifetime1Lifetime3] = (var6Lifetime1Lifetime2 << 7) + sea.c(this.field_F[var4Lifetime1Lifetime3], -16257);
              }
              break;
            case 38:
              var7Lifetime1 = this.field_J[var4Lifetime1Lifetime3];
              if (16384 == var7Lifetime1) {
                this.field_F[var4Lifetime1Lifetime3] = sea.c(this.field_F[var4Lifetime1Lifetime3], -128) + var6Lifetime1Lifetime2;
              }
              break;
            case 16:
              this.field_q[var4Lifetime1Lifetime3] = (var6Lifetime1Lifetime2 << 7) + sea.c(-16257, this.field_q[var4Lifetime1Lifetime3]);
              break;
            case 48:
              this.field_q[var4Lifetime1Lifetime3] = var6Lifetime1Lifetime2 + sea.c(this.field_q[var4Lifetime1Lifetime3], -128);
              break;
            case 81:
              if (var6Lifetime1Lifetime2 < 64) {
                this.e(28583, var4Lifetime1Lifetime3);
                this.field_M[var4Lifetime1Lifetime3] = sea.c(this.field_M[var4Lifetime1Lifetime3], -5);
                if (var8 != 0) {
                  this.field_M[var4Lifetime1Lifetime3] = fh.a(this.field_M[var4Lifetime1Lifetime3], 4);
                }
              } else {
                this.field_M[var4Lifetime1Lifetime3] = fh.a(this.field_M[var4Lifetime1Lifetime3], 4);
              }
              break;
            case 17:
              this.a(var4Lifetime1Lifetime3, (-16257 & this.field_o[var4Lifetime1Lifetime3]) + (var6Lifetime1Lifetime2 << 7), (byte) -78);
              break;
            case 49:
              this.a(var4Lifetime1Lifetime3, (-128 & this.field_o[var4Lifetime1Lifetime3]) + var6Lifetime1Lifetime2, (byte) -78);
              return;
            default:
              break;
          }
        }
    }

    private final void a(byte param0, int param1) {
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1 < 0) {
          param1 = 0;
          do {
            if (16 <= param1) {
              return;
            }
            this.a((byte) 91, param1);
            param1++;
          } while (var4 == 0);
          return;
        }
        this.field_L[param1] = 12800;
        this.field_A[param1] = 8192;
        if (param0 <= 86) {
          this.e(27, 5);
        }
        this.field_y[param1] = 16383;
        this.field_D[param1] = 8192;
        this.field_m[param1] = 0;
        this.field_z[param1] = 8192;
        this.d(-50, param1);
        this.e(28583, param1);
        this.field_M[param1] = 0;
        this.field_J[param1] = 32767;
        this.field_F[param1] = 256;
        this.field_q[param1] = 0;
        this.a(param1, 8192, (byte) -78);
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != 55) {
          this.e(61, 49);
        }
        this.field_H = param0;
    }

    final synchronized void a(qua param0, boolean param1, byte param2) {
        if (param2 != 80) {
          return;
        }
        try {
          this.a(param1, param0, (byte) 40, true);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "l.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 != -78) {
          field_K = (jea) null;
        }
        this.field_o[param0] = param1;
        this.field_u[param0] = (int)(2097152.0 * Math.pow(2.0, (double)param1 * 0.00054931640625) + 0.5);
    }

    private final void a(int param0, int param1, int param2, int param3) {
        rta var6 = null;
        int var7 = 0;
        rta var8 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        var8 = this.field_I[param1][param0];
        if (var8 == null) {
          return;
        }
        boolean decompiledFrameCompleted0 = true;
        this.field_I[param1][param0] = null;
        if ((this.field_M[param1] & 2) != param3) {
          var6 = (rta) (this.field_v.field_l.f(param3 ^ -80));
          while (true) {
            if (var6 != null) {
              if (var7 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (var6.field_k == var8.field_k &&
                var6.field_t < 0 &&
                var6 != var8) {
                var8.field_t = 0;
              } else {
                var6 = (rta) (this.field_v.field_l.e(param3 ^ 113));
                continue;
              }
            }
            break;
          }
          if ((decompiledFrameCompleted0) &&
            (var7 != 0)) {
            var8.field_t = 0;
          }
        } else {
          var8.field_t = 0;
        }

    }

    final static int a(int param0, int param1, int param2) {
        if (param2 != 20048) {
          field_K = (jea) null;
        }
        int var3 = param0 >>> 24;
        int var4 = 255 - var3;
        param0 = (var3 * (param0 & 16711935) & -16711936 | var3 * (65280 & param0) & 16711680) >>> 8;
        return ((var4 * (param1 & 65280) & 16711680 | -16711936 & var4 * (16711935 & param1)) >>> 8) + param0;
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (!param1) {
          this.b(-1, 47);
        }
        if (~this.field_k[param0] != ~param2) {
          this.field_k[param0] = param2;
          var4 = 0;
          while (var4 < 128) {
            this.field_n[param0][var4] = null;
            var4++;
            if (var5 != 0) {
              break;
            }
          }
        }
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1 >= -114) {
          return;
        }
        if (param0) {
          this.b(true, -1);
        }
        if (!param0 ||
          var4 != 0) {
          this.b(-1, 117);
        }
        this.a((byte) 110, -1);
        var3 = 0;
        do {
          if (var3 >= 16) {
            var3 = 0;
            break;
          }
          this.field_k[var3] = this.field_O[var3];
          var3++;
        } while (var4 == 0);
        while (var3 < 16) {
          this.field_l[var3] = sea.c(this.field_O[var3], -128);
          var3++;
          if (var4 == 0) {
            continue;
          }
          break;
        }
        return;
    }

    final synchronized void b(int param0) {
        this.a(-191040664, true);
        if (param0 != 2) {
          this.e(110);
        }
    }

    synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_w.g()) {
            var4_int = this.field_w.field_e * this.field_H / kta.field_d;
            while (true) {
              var5 = (long)var4_int * (long)param2 + this.field_E;
              if (this.field_B - var5 >= 0L) {
                this.field_E = var5;
                if (var8 == 0) {
                  break;
                }
              }
              var7 = (int)((-1L - this.field_E + (this.field_B + (long)var4_int)) / (long)var4_int);
              this.field_E = this.field_E + (long)var4_int * (long)var7;
              this.field_v.b(param0, param1, var7);
              param2 = param2 - var7;
              this.d(125);
              param1 = param1 + var7;
              if (!this.field_w.g()) {
                break;
              }
              if (var8 == 0) {
                continue;
              }
              this.field_v.b(param0, param1, param2);
              return;
            }
          }
          this.field_v.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("l.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int b(byte param0) {
        if (param0 <= 118) {
          return 11;
        }
        return this.field_G;
    }

    private final void b(boolean param0, int param1) {
        rta var3;
        int var4;
        int stackIn_16_0 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var3 = (rta) (this.field_v.field_l.f(-80));
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var3 == null))) {
          stackIn_16_0 = param1;
          if (var4 == 0) {
            if (stackIn_16_0 < 0 ||
              param1 == var3.field_k) {
              if (null != var3.field_x) {
                var3.field_x.d(kta.field_d / 100);
                if (var3.field_x.m()) {
                  this.field_v.field_m.a(var3.field_x);
                }
                var3.a(5806);
              }
              if (var3.field_t < 0) {
                this.field_I[var3.field_k][var3.field_m] = null;
              }
              var3.p(100);
            }
            var3 = (rta) (this.field_v.field_l.e(118));
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_16_0 = param0 ? 1 : 0;
        }
        if (stackIn_16_0 != 1) {
          this.a(-124, (byte) 75, -116, -85);
        }
        return;
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        boolean decompiledFrameCompleted0 = true;
        var6 = TombRacer.field_G ? 1 : 0;
        if (this.field_w.g()) {
          var2 = this.field_H * this.field_w.field_e / kta.field_d;
          while (true) {
            var3 = this.field_E + (long)var2 * (long)param0;
            if (-var3 + this.field_B >= 0L) {
              this.field_E = var3;
              if (var6 == 0) {
                break;
              }
            }
            var5 = (int)((-1L + (long)var2 + (-this.field_E + this.field_B)) / (long)var2);
            this.field_E = this.field_E + (long)var5 * (long)var2;
            param0 = param0 - var5;
            this.field_v.a(var5);
            this.d(124);
            if (!this.field_w.g() &&
              var6 == 0) {
              break;
            }
            if (var6 == 0) {
              continue;
            }
            this.field_v.a(param0);
            decompiledFrameCompleted0 = false;
            break;
          }
        }
        if (decompiledFrameCompleted0) {
          this.field_v.a(param0);
        }

    }

    private final int a(int param0, rta param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        bq var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          if (param0 >= -60) {
            this.field_n = (rta[][]) null;
          }
          var3_int = (param1.field_u * param1.field_o >> 12) + param1.field_q;
          var3_int = var3_int + (this.field_F[param1.field_k] * (-8192 + this.field_D[param1.field_k]) >> 12);
          var4 = param1.field_v;
          if (0 < var4.field_d && (!(var4.field_l <= 0) ||
            this.field_m[param1.field_k] > 0)) {
            var5 = var4.field_l << 2;
            var6 = var4.field_j << 1;
            if (var6 > param1.field_l) {
              var5 = param1.field_l * var5 / var6;
            }
            var5 = var5 + (this.field_m[param1.field_k] >> 7);
            var7 = Math.sin((double)(511 & param1.field_p) * 0.01227184630308513);
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          var5Lifetime1 = (int)((double)(256 * param1.field_n.field_j) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)kta.field_d + 0.5);
          stackIn_13_0 = (var5Lifetime1 < 1) ? 1 : var5Lifetime1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("l.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void e(int param0, int param1) {
        rta var3;
        int var4;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        boolean decompiledFrameCompleted0 = true;
        var4 = TombRacer.field_G ? 1 : 0;
        if ((4 & this.field_M[param1]) != 0) {
          var3 = (rta) (this.field_v.field_l.f(-80));
          while (var3 != null) {
            stackIn_8_0 = ~var3.field_k;
            stackIn_8_1 = ~param1;
            if (var4 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (stackIn_8_0 == stackIn_8_1) {
              var3.field_r = 0;
            }
            var3 = (rta) (this.field_v.field_l.e(126));
          }
        }
        if (decompiledFrameCompleted0) {
          stackIn_8_0 = param0;
          stackIn_8_1 = 28583;
        }
        if (stackIn_8_0 != stackIn_8_1) {
          this.field_u = (int[]) null;
        }
    }

    private final void b(int param0, int param1) {
        rta var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        var3 = (rta) (this.field_v.field_l.f(-80));
        if (param1 < 57) {
          this.field_t = true;
        }
        while (var3 != null) {
          if (var4 == 0) {
            if ((0 > param0 ||
              param0 == var3.field_k) &&
              0 > var3.field_t) {
              this.field_I[var3.field_k][var3.field_m] = null;
              var3.field_t = 0;
            }
            var3 = (rta) (this.field_v.field_l.e(110));
            continue;
          }
          break;
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        int var5 = -31 % ((-47 - param1) / 56);
    }

    final synchronized int a() {
        return 0;
    }

    final boolean a(rta param0, int[] param1, int param2, byte param3, int param4) {
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_85_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        bq var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          param0.field_B = kta.field_d / 100;
          if (param0.field_t >= 0 && (null == param0.field_x ||
            param0.field_x.e())) {
            param0.a(5806);
            param0.p(39);
            if (param0.field_z > 0 &&
              param0 == this.field_n[param0.field_k][param0.field_z]) {
              this.field_n[param0.field_k][param0.field_z] = null;
              return true;
            }
            return true;
          }
          var6_int = param0.field_u;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_z[param0.field_k]) + 0.5);
            if (var6_int < 0) {
              var6_int = 0;
            }
            param0.field_u = var6_int;
          }
          param0.field_x.f(this.a(-74, param0));
          var7 = param0.field_v;
          param0.field_p = param0.field_p + var7.field_d;
          if (param3 != 6) {
            this.c(94, 39);
          }
          var8 = 0;
          param0.field_l = param0.field_l + 1;
          var9 = (double)((param0.field_m - 60 << 8) + (param0.field_u * param0.field_o >> 12)) * 0.000005086263020833333;
          if (var7.field_n > 0) {
            if (var7.field_c > 0) {
              param0.field_f = param0.field_f + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_c) * 128.0);
              if (var11 != 0) {
                param0.field_f = param0.field_f + 128;
              }
            } else {
              param0.field_f = param0.field_f + 128;
            }
            if (param0.field_f * var7.field_n >= 819200) {
              var8 = 1;
            }
          }
          if (null != var7.field_m) {
            boolean decompiledSharedTail0 = !(var7.field_i <= 0);
            if (!decompiledSharedTail0) {
              param0.field_A = param0.field_A + 128;
              decompiledSharedTail0 = (var11 != 0);
            }
            if (decompiledSharedTail0) {
              param0.field_A = param0.field_A + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_i) + 0.5);
            }
            while (true) {
              boolean decompiledFrameRemainder1 = true;
              if (var7.field_m.length - 2 > param0.field_w) {
                stackIn_38_0 = ~param0.field_A;
                stackIn_38_1 = ~((255 & var7.field_m[param0.field_w + 2]) << 8);
                decompiledFrameRemainder1 = (var11 == 0);
                if ((decompiledFrameRemainder1) &&
                  (stackIn_38_0 < stackIn_38_1)) {
                  param0.field_w = param0.field_w + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder1) {
                stackIn_38_0 = -2 + var7.field_m.length;
                stackIn_38_1 = param0.field_w;
              }
              if (stackIn_38_0 != stackIn_38_1) {
                break;
              }
              if (0 != var7.field_m[1 + param0.field_w]) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (param0.field_t >= 0 &&
            var7.field_g != null &&
            0 == (1 & this.field_M[param0.field_k]) && (!(0 <= param0.field_z) ||
            param0 != this.field_n[param0.field_k][param0.field_z])) {
            if (var7.field_f > 0) {
              param0.field_t = param0.field_t + (int)(128.0 * Math.pow(2.0, (double)var7.field_f * var9) + 0.5);
              if (var11 != 0) {
                param0.field_t = param0.field_t + 128;
              }
            } else {
              param0.field_t = param0.field_t + 128;
            }
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (-2 + var7.field_g.length > param0.field_i) {
                stackIn_57_0 = 65280 & var7.field_g[param0.field_i + 2] << 8;
                stackIn_57_1 = param0.field_t;
                decompiledFrameRemainder0 = (var11 == 0);
                if ((decompiledFrameRemainder0) &&
                  (stackIn_57_0 < stackIn_57_1)) {
                  param0.field_i = param0.field_i + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_57_0 = param0.field_i;
                stackIn_57_1 = -2 + var7.field_g.length;
              }
              if (stackIn_57_0 != stackIn_57_1) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (var8 == 0) {
            param0.field_x.a(param0.field_B, this.a(param0, 83), this.b(-2421, param0));
            return false;
          }
          param0.field_x.d(param0.field_B);
          if (param1 == null) {
            param0.field_x.a(param4);
            if (var11 != 0) {
              param0.field_x.b(param1, param2, param4);
            }
          } else {
            param0.field_x.b(param1, param2, param4);
          }
          if (param0.field_x.m()) {
            this.field_v.field_m.a(param0.field_x);
          }
          param0.a(param3 ^ 5800);
          if (param0.field_t >= 0) {
            param0.p(69);
            if (param0.field_z > 0 &&
              param0 == this.field_n[param0.field_k][param0.field_z]) {
              this.field_n[param0.field_k][param0.field_z] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_81_0 = var6;
          stackIn_81_1 = new StringBuilder().append("l.MA(");
          if (param0 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          stackIn_84_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',');
          if (param1 == null) {
            stackIn_85_2 = "null";
          } else {
            stackIn_85_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final synchronized cg b() {
        return (cg) ((Object) this.field_v);
    }

    final synchronized void e(int param0) {
        int var3 = 0;
        tn var4 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        var4 = (tn) (this.field_r.d(param0));
        while (var4 != null) {
          var4.a(false);
          var4 = (tn) (this.field_r.c(param0 ^ 20806));
          if (var3 == 0) {
            continue;
          }
          break;
        }
    }

    final synchronized boolean a(int param0, qua param1, cn param2, nda param3, int param4) {
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
        jk var8 = null;
        int var9 = 0;
        tn var10 = null;
        int var11 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          param1.b();
          var6_int = 1;
          var7 = null;
          if (0 < param0) {
            var7 = new int[]{param0};
          }
          var8 = (jk) (param1.field_f.d(param4));
          L2: while (true) {
            if (var8 != null) {
              var9 = (int)var8.field_d;
              var10 = (tn) (this.field_r.a((byte) -97, (long)var9));
              if (var11 == 0) {
                boolean decompiledFrameRemainder0 = true;
                if (var10 == null) {
                  var10 = rb.a(param2, var9, 15);
                  if (var10 == null) {
                    var6_int = 0;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    this.field_r.a((long)var9, 102, var10);
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (!var10.a(param4 - 5853, var8.field_f, param3, (int[]) (var7)))) {
                  var6_int = 0;
                }
                var8 = (jk) (param1.field_f.c(param4 ^ 20806));
                continue;
              }
            } else {
              if (var6_int == 0) {
                break L2;
              }
            }
            param1.a();
            break;
          }
          stackIn_20_0 = var6_int;
          return stackIn_20_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("l.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param4).append(')').toString());
        }
    }

    synchronized void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 != -105) {
          this.b(-101, 68);
        }
        if (param2 >= 0) {
          this.field_N[param2] = param1;
        }
        if (param2 < 0 ||
          var5 != 0) {
          var4 = 0;
          while (var4 < 16) {
            this.field_N[var4] = param1;
            var4++;
            if (var5 != 0) {
              break;
            }
          }
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int discarded$0 = 0;
        this.field_D[param0] = param2;
        if (param1 <= 75) {
          discarded$0 = this.b(-126, (rta) null);
        }
    }

    private final void d(int param0) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param0 < 109) {
          this.field_s = false;
        }
        var2 = this.field_j;
        var3 = this.field_p;
        var4 = this.field_B;
        if (this.field_x != null &&
          ~var3 == ~this.field_C) {
          this.a(this.field_t, this.field_x, (byte) 40, this.field_s);
          this.d(111);
          return;
        }
        while (true) {
          stackIn_7_0 = var3;
          stackIn_7_1 = this.field_p;
          L5: {
            if (stackIn_7_0 == stackIn_7_1) {
              L8: while (true) {
                stackIn_30_0 = this.field_w.field_a[var2];
                stackIn_30_1 = var3;
                if (var7 != 0) {
                  break L5;
                }
                if (stackIn_30_0 == stackIn_30_1) {
                  this.field_w.e(var2);
                  var6 = this.field_w.b(var2);
                  stackIn_7_0 = var6;
                  stackIn_7_1 = 1;
                  if (stackIn_7_0 == stackIn_7_1) {
                    this.field_w.e();
                    this.field_w.f(var2);
                    if (!this.field_w.d() &&
                      var7 == 0) {
                      break L8;
                    }
                    if (this.field_x != null) {
                      this.a(this.field_x, this.field_t, (byte) 80);
                      this.d(119);
                      return;
                    }
                    if (this.field_t &&
                      var3 != 0) {
                      this.field_w.a(var4);
                      break L8;
                    }
                    this.a(true, -127);
                    this.field_w.a();
                    return;
                  }
                  if (0 != (var6 & 128)) {
                    this.c(var6, 128);
                  }
                  this.field_w.c(var2);
                  this.field_w.f(var2);
                  continue;
                }
                break;
              }
              var2 = this.field_w.f();
              var3 = this.field_w.field_a[var2];
              var4 = this.field_w.d(var3);
              continue;
            }
            this.field_p = var3;
            this.field_B = var4;
            this.field_j = var2;
            if (this.field_x == null) {
              return;
            }
            stackIn_30_0 = ~this.field_C;
            stackIn_30_1 = ~var3;
          }
          if (stackIn_30_0 > stackIn_30_1) {
            this.field_j = -1;
            this.field_p = this.field_C;
            this.field_B = this.field_w.d(this.field_p);
          }
          return;
        }
    }

    final synchronized cg c() {
        return null;
    }

    private final void b(int param0, int param1, int param2) {
        if (param2 != 98) {
          this.a((byte) 90);
        }
    }

    synchronized void a(boolean param0, qua param1, byte param2, boolean param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          this.a(-191040664, param3);
          this.field_w.a(param1.field_g);
          this.field_E = 0L;
          stackIn_4_1 = (param0);
          this.field_t = stackIn_4_1;
          var5_int = this.field_w.c();
          var6 = 0;
          do {
            if (var5_int <= var6) {
              this.field_j = this.field_w.f();
              this.field_p = this.field_w.field_a[this.field_j];
              break;
            }
            this.field_w.e(var6);
            this.field_w.c(var6);
            this.field_w.f(var6);
            var6++;
          } while (var7 == 0);
          if (param2 != 40) {
            return;
          }
          this.field_B = this.field_w.d(this.field_p);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_16_0 = runtimeException;
          stackIn_16_1 = new StringBuilder().append("l.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param1 <= 101) {
          this.field_u = (int[]) null;
        }
        this.field_O[param0] = param2;
        this.field_l[param0] = sea.c(-128, param2);
        this.a(param0, true, param2);
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int stackIn_16_1 = 0;
        rta stackIn_16_2 = null;
        boolean stackIn_17_3 = false;
        rta var5;
        int var6_int;
        u var6;
        rta var7;
        rta var8;
        int var9;
        tn var10;
        tn var11;
        var9 = TombRacer.field_G ? 1 : 0;
        this.a(param0, param2, 64, 0);
        if ((this.field_M[param2] & 2) != 0) {
          var5 = (rta) (this.field_v.field_l.b(param1 + 3));
          while (var5 != null) {
            if (~param2 == ~var5.field_k &&
              var5.field_t < 0) {
              this.field_I[param2][var5.field_m] = null;
              this.field_I[param2][param0] = var5;
              var6_int = (var5.field_o * var5.field_u >> 12) + var5.field_q;
              var5.field_q = var5.field_q + (-var5.field_m + param0 << 8);
              var5.field_o = var6_int - var5.field_q;
              var5.field_m = param0;
              var5.field_u = 4096;
              return;
            }
            var5 = (rta) (this.field_v.field_l.a(-1));
            if (var9 == 0) {
              continue;
            }
            break;
          }
        }
        var10 = (tn) (this.field_r.a((byte) -117, (long)this.field_k[param2]));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_h[param0];
        if (var6 == null) {
          return;
        }
        var7 = new rta();
        var7.field_k = param2;
        var7.field_y = var11;
        var7.field_n = var6;
        var7.field_v = var10.field_m[param0];
        var7.field_z = var10.field_f[param0];
        var7.field_m = param0;
        var7.field_s = 1024 + var10.field_j[param0] * var11.field_i * (param3 * param3) >> 11;
        var7.field_h = var10.field_l[param0] & 255;
        var7.field_q = (param0 << 8) - (32767 & var10.field_g[param0]);
        var7.field_t = -1;
        var7.field_i = 0;
        var7.field_w = param1;
        var7.field_A = 0;
        var7.field_f = 0;
        if (0 != this.field_q[param2]) {
          var7.field_x = qia.a(var6, this.a(-101, var7), 0, this.b(-2421, var7));
          stackIn_16_1 = 95;
          stackIn_16_2 = var7;
          stackIn_17_3 = !(0 <= var10.field_g[param0]);
          this.a((byte) stackIn_16_1, stackIn_16_2, stackIn_17_3);
          if (var9 != 0) {
            var7.field_x = qia.a(var6, this.a(param1 - 71, var7), this.a(var7, 113), this.b(-2421, var7));
          }
        } else {
          var7.field_x = qia.a(var6, this.a(param1 - 71, var7), this.a(var7, 113), this.b(-2421, var7));
        }
        if (0 > var10.field_g[param0]) {
          var7.field_x.b(-1);
        }
        if (var7.field_z >= 0) {
          var8 = this.field_n[param2][var7.field_z];
          if (var8 != null &&
            0 > var8.field_t) {
            this.field_I[param2][var8.field_m] = null;
            var8.field_t = 0;
          }
          this.field_n[param2][var7.field_z] = var7;
        }
        this.field_v.field_l.b((byte) -68, var7);
        this.field_I[param2][param0] = var7;
        return;
    }

    private final synchronized void a(int param0, boolean param1) {
        this.field_w.a();
        if (param0 != -191040664) {
          return;
        }
        this.field_x = null;
        this.a(param1, -124);
    }

    final void a(byte param0, rta param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.field_n.field_i.length;
          var6 = -81 / ((param0 - 45) / 49);
          boolean decompiledSharedTail0 = (!(param2) ||
            !(param1.field_n.field_h));
          if (!decompiledSharedTail0) {
            var7 = -param1.field_n.field_k + var4_int + var4_int;
            var5 = (int)((long)this.field_q[param1.field_k] * (long)var7 >> 6);
            var4_int = var4_int << 8;
            if (var5 >= var4_int) {
              var5 = -var5 + (var4_int + (var4_int - 1));
              param1.field_x.a(true);
            }
            decompiledSharedTail0 = (TombRacer.field_G);
          }
          if (decompiledSharedTail0) {
            var5 = (int)((long)this.field_q[param1.field_k] * (long)var4_int >> 6);
          }
          param1.field_x.c(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("l.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    protected l() {
        this.field_l = new int[16];
        this.field_q = new int[16];
        this.field_J = new int[16];
        this.field_F = new int[16];
        this.field_M = new int[16];
        this.field_o = new int[16];
        this.field_n = new rta[16][128];
        this.field_k = new int[16];
        this.field_z = new int[16];
        this.field_m = new int[16];
        this.field_y = new int[16];
        this.field_u = new int[16];
        this.field_A = new int[16];
        this.field_I = new rta[16][128];
        this.field_D = new int[16];
        this.field_N = new int[16];
        this.field_G = 256;
        this.field_O = new int[16];
        this.field_H = 1000000;
        this.field_L = new int[16];
        this.field_w = new maa();
        this.field_v = new et(this);
        this.field_r = new ji(128);
        this.a((byte) -105, 256, -1);
        this.a(true, -116);
    }

    l(l param0) {
        this.field_l = new int[16];
        this.field_q = new int[16];
        this.field_J = new int[16];
        this.field_F = new int[16];
        this.field_M = new int[16];
        this.field_o = new int[16];
        this.field_n = new rta[16][128];
        this.field_k = new int[16];
        this.field_z = new int[16];
        this.field_m = new int[16];
        this.field_y = new int[16];
        this.field_u = new int[16];
        this.field_A = new int[16];
        this.field_I = new rta[16][128];
        this.field_D = new int[16];
        this.field_N = new int[16];
        this.field_G = 256;
        this.field_O = new int[16];
        this.field_H = 1000000;
        this.field_L = new int[16];
        this.field_w = new maa();
        this.field_v = new et(this);
        try {
          this.field_r = param0.field_r;
          this.a((byte) -105, 256, -1);
          this.a(true, -119);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "l.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
