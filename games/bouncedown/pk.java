/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends wf {
    private int[] field_M;
    private int[] field_k;
    private int[] field_q;
    private int[] field_t;
    private kl[][] field_C;
    private int[] field_r;
    private int[] field_H;
    private kl[][] field_O;
    private int field_n;
    private int[] field_N;
    private uk field_u;
    private oe field_w;
    static gk field_D;
    private int field_I;
    private int[] field_B;
    int[] field_K;
    private int[] field_z;
    private int[] field_J;
    private int[] field_E;
    private int[] field_m;
    int[] field_s;
    private int[] field_y;
    int[] field_l;
    private int field_A;
    private long field_P;
    private long field_L;
    private int field_p;
    private boolean field_F;
    private ka field_o;
    private be field_v;
    private int field_G;
    private boolean field_x;

    private final void c(byte param0, int param1, int param2) {
        int var4 = -30 % ((-7 - param0) / 62);
        this.field_M[param2] = param1;
        this.field_N[param2] = da.b(param1, -128);
        this.a((byte) -82, param2, param1);
    }

    final synchronized void a(be param0, boolean param1, int param2) {
        try {
          if (param2 < 49) {
            this.field_N = (int[]) null;
          }
          this.a(param0, true, param1, true);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "pk.IA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized int b() {
        return 0;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        var8 = Bounce.field_N;
        try {
          if (this.field_w.d()) {
            var4_int = this.field_w.field_b * this.field_n / e.field_r;
            while (true) {
              var5 = (long)param2 * (long)var4_int + this.field_P;
              if (0L <= -var5 + this.field_L) {
                this.field_P = var5;
                if (var8 != 0) {
                  return;
                }
                break;
              }
              var7 = (int)(((long)var4_int + (this.field_L - this.field_P - 1L)) / (long)var4_int);
              this.field_P = this.field_P + (long)var7 * (long)var4_int;
              this.field_o.a(param0, param1, var7);
              param2 = param2 - var7;
              param1 = param1 + var7;
              this.b((byte) -126);
              if (!this.field_w.d()) {
                break;
              }
              if (var8 == 0) {
                continue;
              }
              this.field_o.a(param0, param1, param2);
              return;
            }
          }
          this.field_o.a(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("pk.P(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(String param0, String param1, int param2) {
        try {
          if (null != nk.field_a) {
            nk.field_a.a(true);
          }
          if (param2 >= -1) {
            field_D = (gk) null;
          }
          vk.field_c = new ci(param1, param0, false, true, true);
          ed.field_c.a(10768, vk.field_c);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "pk.FA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = Bounce.field_N;
        if (param2 >= param0) {
          this.field_r[param2] = param1;
        }
        if (param2 < param0 ||
          var5 != 0) {
          var4 = 0;
          while (16 > var4) {
            this.field_r[var4] = param1;
            var4++;
            if (var5 != 0) {
              break;
            }
          }
        }
    }

    private final int b(kl param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ch var9 = null;
        ch var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        try {
          if (0 == this.field_r[param0.field_E]) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var9 = param0.field_o;
          var10 = var9;
          var4 = this.field_J[param0.field_E] * this.field_q[param0.field_E] + 4096 >> 13;
          var4 = var4 * var4 + 16384 >> 15;
          if (param1 != 68) {
            stackIn_6_0 = -77;
            return stackIn_6_0;
          }
          var4 = param0.field_n * var4 + 16384 >> 15;
          var4 = 128 + this.field_I * var4 >> 8;
          var4 = this.field_r[param0.field_E] * var4 + 128 >> 8;
          if (var10.field_k > 0) {
            var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, 0.00001953125 * (double)param0.field_A * (double)var10.field_k));
          }
          if (null != var10.field_e) {
            var5 = param0.field_q;
            var6 = var10.field_e[1 + param0.field_s];
            if (param0.field_s < -2 + var10.field_e.length) {
              var7 = 65280 & var9.field_e[param0.field_s] << 8;
              var8 = (255 & var10.field_e[2 + param0.field_s]) << 8;
              var6 = var6 + (var5 - var7) * (var10.field_e[3 + param0.field_s] - var6) / (var8 - var7);
            }
            var4 = var4 * var6 + 32 >> 6;
          }
          if (param0.field_C > 0 &&
            null != var10.field_i) {
            var5Lifetime1 = param0.field_C;
            var6Lifetime1 = var10.field_i[param0.field_y + 1];
            if (param0.field_y < -2 + var10.field_i.length) {
              var7Lifetime1 = (255 & var9.field_i[param0.field_y]) << 8;
              var8Lifetime1 = (255 & var10.field_i[2 + param0.field_y]) << 8;
              var6Lifetime1 = var6Lifetime1 + (-var6Lifetime1 + var10.field_i[param0.field_y + 3]) * (var5Lifetime1 - var7Lifetime1) / (-var7Lifetime1 + var8Lifetime1);
            }
            var4 = var6Lifetime1 * var4 + 32 >> 6;
          }
          stackIn_22_0 = var4;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("pk.D(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized void a(be param0, boolean param1, boolean param2, boolean param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        be var8 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Bounce.field_N;
        try {
          this.a(param1, 104);
          this.field_w.a(param0.field_h);
          this.field_P = 0L;
          stackIn_4_1 = (param2);
          this.field_F = stackIn_4_1;
          var5_int = this.field_w.e();
          if (!param3) {
            var8 = (be) null;
            this.a((be) null, true, -97);
          }
          var6 = 0;
          while (var6 < var5_int) {
            this.field_w.e(var6);
            this.field_w.a(var6);
            this.field_w.c(var6);
            var6++;
            if (var7 != 0) {
              return;
            }
          }
          this.field_p = this.field_w.c();
          this.field_A = this.field_w.field_d[this.field_p];
          this.field_L = this.field_w.f(this.field_A);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("pk.H(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void b(int param0, int param1) {
        kl var3;
        int var4;
        var4 = Bounce.field_N;
        var3 = (kl) (this.field_o.field_m.a((byte) -102));
        if (param0 != 0) {
          this.field_t = (int[]) null;
        }
        while (var3 != null) {
          if (var4 == 0) {
            if ((param1 < 0 ||
              param1 == var3.field_E) &&
              0 > var3.field_C) {
              this.field_C[var3.field_E][var3.field_r] = null;
              var3.field_C = 0;
            }
            var3 = (kl) (this.field_o.field_m.d((byte) -46));
            continue;
          }
          break;
        }
    }

    final boolean a(kl param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_i != null) {
            if (param1 != 8335400) {
              this.field_E = (int[]) null;
            }
            return false;
          }
          if (param0.field_C >= 0) {
            param0.c(param1 ^ 8335402);
            if (param0.field_z > 0) {
              if (param0 != this.field_O[param0.field_E][param0.field_z]) {
                return true;
              }
              this.field_O[param0.field_E][param0.field_z] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("pk.U(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        this.field_w.b();
        if (param1 < 18) {
          this.field_I = -90;
        }
        this.field_v = null;
        this.b(param0, -1);
    }

    private final void c(int param0, int param1) {
        kl var3;
        int var4;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        boolean decompiledFrameCompleted0 = true;
        var4 = Bounce.field_N;
        if ((2 & this.field_l[param0]) != 0) {
          var3 = (kl) (this.field_o.field_m.a((byte) -67));
          while (var3 != null) {
            stackIn_13_0 = var3.field_E;
            stackIn_13_1 = param0;
            if (var4 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (stackIn_13_0 == stackIn_13_1 &&
              this.field_C[param0][var3.field_r] == null &&
              var3.field_C < 0) {
              var3.field_C = 0;
            }
            var3 = (kl) (this.field_o.field_m.d((byte) 123));
          }
        }
        if (decompiledFrameCompleted0) {
          stackIn_13_0 = param1;
          stackIn_13_1 = 20974;
        }
        if (stackIn_13_0 != stackIn_13_1) {
          this.c();
        }
    }

    final boolean a(int[] param0, int param1, int param2, kl param3, byte param4) {
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ch var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = Bounce.field_N;
        try {
          param3.field_j = e.field_r / 100;
          var6_int = 83 % ((param4 - 37) / 52);
          if (0 <= param3.field_C && (param3.field_i == null ||
            param3.field_i.e())) {
            param3.d(0);
            param3.c(2);
            if (param3.field_z > 0) {
              if (param3 != this.field_O[param3.field_E][param3.field_z]) {
                return true;
              }
              this.field_O[param3.field_E][param3.field_z] = null;
            }
            return true;
          }
          var7 = param3.field_x;
          if (var7 > 0) {
            var7 = var7 - (int)(16.0 * Math.pow(2.0, (double)this.field_m[param3.field_E] * 0.0004921259842519685) + 0.5);
            if (var7 < 0) {
              var7 = 0;
            }
            param3.field_x = var7;
          }
          param3.field_i.e(this.a(param3, true));
          var8 = param3.field_o;
          param3.field_v = param3.field_v + var8.field_c;
          var9 = 0;
          param3.field_p = param3.field_p + 1;
          var10 = 0.000005086263020833333 * (double)((param3.field_r - 60 << 8) + (param3.field_h * param3.field_x >> 12));
          if (var8.field_k > 0) {
            if (0 < var8.field_g) {
              param3.field_A = param3.field_A + (int)(Math.pow(2.0, (double)var8.field_g * var10) * 128.0 + 0.5);
              if (var12 != 0) {
                param3.field_A = param3.field_A + 128;
              }
            } else {
              param3.field_A = param3.field_A + 128;
            }
            if (var8.field_k * param3.field_A >= 819200) {
              var9 = 1;
            }
          }
          if (var8.field_e != null) {
            boolean decompiledSharedTail1 = !(0 >= var8.field_l);
            if (!decompiledSharedTail1) {
              param3.field_q = param3.field_q + 128;
              decompiledSharedTail1 = (var12 != 0);
            }
            if (decompiledSharedTail1) {
              param3.field_q = param3.field_q + (int)(128.0 * Math.pow(2.0, var10 * (double)var8.field_l) + 0.5);
            }
            while (true) {
              boolean decompiledFrameRemainder1 = true;
              if (param3.field_s < var8.field_e.length - 2) {
                stackIn_36_0 = ~param3.field_q;
                stackIn_36_1 = ~(65280 & var8.field_e[param3.field_s + 2] << 8);
                decompiledFrameRemainder1 = (var12 == 0);
                if ((decompiledFrameRemainder1) &&
                  (stackIn_36_0 < stackIn_36_1)) {
                  param3.field_s = param3.field_s + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder1) {
                stackIn_36_0 = param3.field_s;
                stackIn_36_1 = -2 + var8.field_e.length;
              }
              if (stackIn_36_0 != stackIn_36_1) {
                break;
              }
              if (0 != var8.field_e[param3.field_s + 1]) {
                break;
              }
              var9 = 1;
              break;
            }
          }
          if (param3.field_C >= 0 &&
            var8.field_i != null &&
            (this.field_l[param3.field_E] & 1) == 0 && (!(param3.field_z >= 0) ||
            this.field_O[param3.field_E][param3.field_z] != param3)) {
            boolean decompiledSharedTail0 = !(var8.field_b <= 0);
            if (!decompiledSharedTail0) {
              param3.field_C = param3.field_C + 128;
              decompiledSharedTail0 = (var12 != 0);
            }
            if (decompiledSharedTail0) {
              param3.field_C = param3.field_C + (int)(Math.pow(2.0, (double)var8.field_b * var10) * 128.0 + 0.5);
            }
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var8.field_i.length - 2 > param3.field_y) {
                stackIn_56_0 = var8.field_i[2 + param3.field_y] << 8 & 65280;
                stackIn_56_1 = param3.field_C;
                decompiledFrameRemainder0 = (var12 == 0);
                if ((decompiledFrameRemainder0) &&
                  (stackIn_56_0 < stackIn_56_1)) {
                  param3.field_y = param3.field_y + 2;
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_56_0 = var8.field_i.length - 2;
                stackIn_56_1 = param3.field_y;
              }
              if (stackIn_56_0 != stackIn_56_1) {
                break;
              }
              var9 = 1;
              break;
            }
          }
          if (var9 == 0) {
            param3.field_i.a(param3.field_j, this.b(param3, (byte) 68), this.a(param3, (byte) 53));
            return false;
          }
          param3.field_i.i(param3.field_j);
          if (param0 != null) {
            param3.field_i.a(param0, param2, param1);
            if (var12 != 0) {
              param3.field_i.a(param1);
            }
          } else {
            param3.field_i.a(param1);
          }
          if (param3.field_i.k()) {
            this.field_o.field_l.a(param3.field_i);
          }
          param3.d(0);
          if (param3.field_C >= 0) {
            param3.c(2);
            if (0 < param3.field_z &&
              this.field_O[param3.field_E][param3.field_z] == param3) {
              this.field_O[param3.field_E][param3.field_z] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_77_0 = var6;
          stackIn_77_1 = new StringBuilder().append("pk.LA(");
          if (param0 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0, String param1) {
        try {
          int var2_int = 57 / ((param0 + 73) / 52);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "pk.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var5;
        int var6;
        boolean decompiledFrameCompleted0 = true;
        var6 = Bounce.field_N;
        if (this.field_w.d()) {
          var2 = this.field_n * this.field_w.field_b / e.field_r;
          while (true) {
            var3 = (long)var2 * (long)param0 + this.field_P;
            if (-var3 + this.field_L >= 0L) {
              this.field_P = var3;
              if (var6 == 0) {
                break;
              }
            }
            var5 = (int)((-1L + ((long)var2 + (-this.field_P + this.field_L))) / (long)var2);
            this.field_P = this.field_P + (long)var5 * (long)var2;
            this.field_o.a(var5);
            param0 = param0 - var5;
            this.b((byte) -123);
            if (!this.field_w.d() &&
              var6 == 0) {
              break;
            }
            if (var6 == 0) {
              continue;
            }
            this.field_o.a(param0);
            decompiledFrameCompleted0 = false;
            break;
          }
        }
        if (decompiledFrameCompleted0) {
          this.field_o.a(param0);
        }

    }

    final synchronized wf c() {
        return null;
    }

    private final void b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Bounce.field_N;
        if (!param0) {
          this.b(0, -1);
          if (var4 != 0) {
            this.a(-1, 2099140935);
          }
        } else {
          this.a(-1, 2099140935);
        }
        this.f(param1, -66);
        var3 = 0;
        do {
          if (var3 >= 16) {
            var3 = 0;
            break;
          }
          this.field_z[var3] = this.field_M[var3];
          var3++;
        } while (var4 == 0);
        while (var3 < 16) {
          this.field_N[var3] = da.b(this.field_M[var3], -128);
          var3++;
          if (var4 == 0) {
            continue;
          }
          break;
        }
        return;
    }

    private final void a(int param0, int param1) {
        kl var3;
        int var4;
        var4 = Bounce.field_N;
        var3 = (kl) (this.field_o.field_m.a((byte) -49));
        if (param1 != 2099140935) {
          this.f(75);
        }
        while (var3 != null) {
          if (var4 == 0) {
            if (param0 < 0 ||
              param0 == var3.field_E) {
              if (null != var3.field_i) {
                var3.field_i.i(e.field_r / 100);
                if (var3.field_i.k()) {
                  this.field_o.field_l.a(var3.field_i);
                }
                var3.d(0);
              }
              if (0 > var3.field_C) {
                this.field_C[var3.field_E][var3.field_r] = null;
              }
              var3.c(2);
            }
            var3 = (kl) (this.field_o.field_m.d((byte) 75));
            continue;
          }
          break;
        }
    }

    private final void b(byte param0) {
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Bounce.field_N;
        var2 = this.field_p;
        var3 = this.field_A;
        if (param0 > -41) {
          this.field_H = (int[]) null;
        }
        var4 = this.field_L;
        if (null != this.field_v &&
          this.field_G == var3) {
          this.a(this.field_v, this.field_x, this.field_F, true);
          this.b((byte) -108);
          return;
        }
        while (true) {
          if (this.field_A != var3) {
            this.field_L = var4;
            this.field_A = var3;
            this.field_p = var2;
            if (this.field_v != null) {
              stackIn_9_0 = ~var3;
              stackIn_9_1 = ~this.field_G;
              if (stackIn_9_0 < stackIn_9_1) {
                this.field_A = this.field_G;
                this.field_p = -1;
                this.field_L = this.field_w.f(this.field_A);
              }
            }
            return;
          }
          while (true) {
            stackIn_16_0 = this.field_w.field_d[var2];
            stackIn_16_1 = var3;
            if (var7 != 0) {
              if (stackIn_16_0 < stackIn_16_1) {
                this.field_A = this.field_G;
                this.field_p = -1;
                this.field_L = this.field_w.f(this.field_A);
              }
              return;
            }
            if (stackIn_16_0 == stackIn_16_1) {
              this.field_w.e(var2);
              var6 = this.field_w.d(var2);
              stackIn_21_0 = ~var6;
              stackIn_21_1 = -2;
              if (stackIn_21_0 != stackIn_21_1) {
                if ((var6 & 128) != 0) {
                  this.e(32755, var6);
                }
                this.field_w.a(var2);
                this.field_w.c(var2);
                continue;
              } else {
                this.field_w.f();
                this.field_w.c(var2);
                if (this.field_w.a()) {
                  if (this.field_v != null) {
                    this.a(this.field_v, this.field_F, 71);
                    this.b((byte) -126);
                    return;
                  }
                  if (this.field_F &&
                    var3 != 0) {
                    this.field_w.a(var4);
                  } else {
                    this.b(true, -1);
                    this.field_w.b();
                    return;
                  }
                }
              }
            }
            break;
          }
          var2 = this.field_w.c();
          var3 = this.field_w.field_d[var2];
          var4 = this.field_w.f(var3);
        }
    }

    final synchronized void e(int param0) {
        int var3 = 0;
        rj var4 = null;
        var3 = Bounce.field_N;
        if (param0 != 16) {
          this.field_E = (int[]) null;
        }
        var4 = (rj) (this.field_u.b(0));
        while (var4 != null) {
          var4.e(125);
          var4 = (rj) (this.field_u.a(-1));
          if (var3 == 0) {
            continue;
          }
          break;
        }
    }

    final synchronized wf d() {
        return (wf) ((Object) this.field_o);
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        kl stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        kl stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        Object stackIn_23_0;
        boolean stackIn_23_3;
        kl stackOut_3_0;
        kl var5;
        int var6_int;
        ue var6;
        kl var7;
        kl var8;
        int var9;
        rj var10;
        rj var11;
        boolean decompiledFrameCompleted0 = true;
        var9 = Bounce.field_N;
        this.b(param3, param2, 64, 0);
        if ((this.field_l[param3] & 2) != 0) {
          var5 = (kl) (this.field_o.field_m.b((byte) 60));
          while (var5 != null) {
            stackOut_3_0 = var5;
            stackIn_9_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var9 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (stackIn_4_0.field_E == param3 &&
              var5.field_C < 0) {
              this.field_C[param3][var5.field_r] = null;
              this.field_C[param3][param2] = var5;
              var6_int = var5.field_l + (var5.field_h * var5.field_x >> 12);
              var5.field_l = var5.field_l + (-var5.field_r + param2 << 8);
              var5.field_x = 4096;
              var5.field_r = param2;
              var5.field_h = var6_int - var5.field_l;
              return;
            }
            var5 = (kl) (this.field_o.field_m.a(-18158));
          }
        }
        if (decompiledFrameCompleted0) {
          stackIn_9_0 = this.field_u.a(48, (long)this.field_z[param3]);
        }
        var10 = (rj) (stackIn_9_0);
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_k[param2];
        if (var6 == null) {
          return;
        }
        var7 = new kl();
        var7.field_E = param3;
        var7.field_D = var11;
        var7.field_w = var6;
        var7.field_o = var10.field_l[param2];
        var7.field_z = var10.field_i[param2];
        var7.field_r = param2;
        var7.field_n = var11.field_m * (param1 * param1 * var10.field_o[param2]) + 1024 >> 11;
        var7.field_k = 255 & var10.field_r[param2];
        var7.field_l = (param2 << 8) - (32767 & var10.field_n[param2]);
        var7.field_s = 0;
        var7.field_y = 0;
        var7.field_q = 0;
        var7.field_C = -1;
        var7.field_A = 0;
        if (!param0) {
          pk.d(-32);
        }
        if (this.field_s[param3] == 0) {
          var7.field_i = pi.a(var6, this.a(var7, true), this.b(var7, (byte) 68), this.a(var7, (byte) 53));
          if (var9 != 0) {
            var7.field_i = pi.a(var6, this.a(var7, true), 0, this.a(var7, (byte) 53));
            stackIn_22_1 = var7;
            stackIn_22_2 = -117;
            if (var10.field_n[param2] >= 0) {
              stackIn_23_0 = this;
              stackIn_23_3 = false;
            } else {
              stackIn_23_0 = this;
              stackIn_23_3 = true;
            }
            this.a(stackIn_22_1, (byte) stackIn_22_2, stackIn_23_3);
          }
        } else {
          var7.field_i = pi.a(var6, this.a(var7, true), 0, this.a(var7, (byte) 53));
          stackIn_22_1 = var7;
          stackIn_22_2 = -117;
          if (var10.field_n[param2] >= 0) {
            stackIn_23_0 = this;
            stackIn_23_3 = false;
          } else {
            stackIn_23_0 = this;
            stackIn_23_3 = true;
          }
          this.a(stackIn_22_1, (byte) stackIn_22_2, stackIn_23_3);
        }
        if (var10.field_n[param2] < 0) {
          var7.field_i.f(-1);
        }
        if (var7.field_z >= 0) {
          var8 = this.field_O[param3][var7.field_z];
          if (var8 != null &&
            var8.field_C < 0) {
            this.field_C[param3][var8.field_r] = null;
            var8.field_C = 0;
          }
          this.field_O[param3][var7.field_z] = var7;
        }
        this.field_o.field_m.a(1, var7);
        this.field_C[param3][param2] = var7;
        return;
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
        var8 = Bounce.field_N;
        var3 = param1 & 240;
        if (param0 != 32755) {
          this.field_A = -20;
        }
        if (128 == var3) {
          var4 = 15 & param1;
          var5 = (32542 & param1) >> 8;
          var6 = (param1 & 8374679) >> 16;
          this.b(var4, var5, var6, 0);
          return;
        }
        if (144 == var3) {
          var4Lifetime1 = 15 & param1;
          var5Lifetime1 = param1 >> 8 & 127;
          var6Lifetime1 = (8335400 & param1) >> 16;
          if (var6Lifetime1 > 0) {
            this.a(true, var6Lifetime1, var5Lifetime1, var4Lifetime1);
            if (var8 == 0) {
              return;
            }
          }
          this.b(var4Lifetime1, var5Lifetime1, 64, 0);
          return;
        }
        if (var3 == 160) {
          var4Lifetime2 = param1 & 15;
          var5Lifetime2 = (32755 & param1) >> 8;
          var6Lifetime2 = 127 & param1 >> 16;
          this.a(var4Lifetime2, 128, var6Lifetime2, var5Lifetime2);
          return;
        }
        if (var3 != 176) {
          if (192 == var3) {
            var4Lifetime3 = param1 & 15;
            var5Lifetime3 = param1 >> 8 & 127;
            this.a((byte) -88, var4Lifetime3, var5Lifetime3 + this.field_N[var4Lifetime3]);
            return;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = 15 & param1;
            var5Lifetime3Lifetime1 = param1 >> 8 & 127;
            this.b(23882, var5Lifetime3Lifetime1, var4Lifetime3Lifetime1);
            return;
          }
          if (var3 == 224) {
            var4Lifetime3Lifetime2 = param1 & 15;
            var5Lifetime3Lifetime2 = ((8323429 & param1) >> 9) + (param1 >> 8 & 127);
            this.a(var4Lifetime3Lifetime2, (byte) 126, var5Lifetime3Lifetime2);
            return;
          }
          var3 = param1 & 255;
          if (var3 != 255) {
            return;
          }
          this.b(true, -1);
          return;
        }
        var4Lifetime4 = 15 & param1;
        var5Lifetime4 = 127 & param1 >> 8;
        var6Lifetime3 = (param1 & 8377708) >> 16;
        if (0 == var5Lifetime4) {
          this.field_N[var4Lifetime4] = (var6Lifetime3 << 14) + da.b(-2080769, this.field_N[var4Lifetime4]);
        }
        if (var5Lifetime4 == 32) {
          this.field_N[var4Lifetime4] = da.b(-16257, this.field_N[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (1 == var5Lifetime4) {
          this.field_E[var4Lifetime4] = (var6Lifetime3 << 7) + da.b(this.field_E[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 33) {
          this.field_E[var4Lifetime4] = da.b(-128, this.field_E[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 5) {
          this.field_m[var4Lifetime4] = (var6Lifetime3 << 7) + da.b(-16257, this.field_m[var4Lifetime4]);
        }
        if (var5Lifetime4 == 37) {
          this.field_m[var4Lifetime4] = var6Lifetime3 + da.b(this.field_m[var4Lifetime4], -128);
        }
        if (7 == var5Lifetime4) {
          this.field_J[var4Lifetime4] = (var6Lifetime3 << 7) + da.b(-16257, this.field_J[var4Lifetime4]);
        }
        if (var5Lifetime4 == 39) {
          this.field_J[var4Lifetime4] = var6Lifetime3 + da.b(this.field_J[var4Lifetime4], -128);
        }
        if (var5Lifetime4 == 10) {
          this.field_k[var4Lifetime4] = (var6Lifetime3 << 7) + da.b(this.field_k[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 42) {
          this.field_k[var4Lifetime4] = var6Lifetime3 + da.b(this.field_k[var4Lifetime4], -128);
        }
        if (var5Lifetime4 == 11) {
          this.field_q[var4Lifetime4] = (var6Lifetime3 << 7) + da.b(-16257, this.field_q[var4Lifetime4]);
        }
        if (var5Lifetime4 == 43) {
          this.field_q[var4Lifetime4] = da.b(-128, this.field_q[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 64) {
          if (var6Lifetime3 >= 64) {
            this.field_l[var4Lifetime4] = ge.a(this.field_l[var4Lifetime4], 1);
            if (var8 != 0) {
              this.field_l[var4Lifetime4] = da.b(this.field_l[var4Lifetime4], -2);
            }
          } else {
            this.field_l[var4Lifetime4] = da.b(this.field_l[var4Lifetime4], -2);
          }
        }
        if (65 == var5Lifetime4) {
          if (var6Lifetime3 >= 64) {
            this.field_l[var4Lifetime4] = ge.a(this.field_l[var4Lifetime4], 2);
            if (var8 != 0) {
              this.c(var4Lifetime4, 20974);
              this.field_l[var4Lifetime4] = da.b(this.field_l[var4Lifetime4], -3);
            }
          } else {
            this.c(var4Lifetime4, 20974);
            this.field_l[var4Lifetime4] = da.b(this.field_l[var4Lifetime4], -3);
          }
        }
        if (var5Lifetime4 == 99) {
          this.field_t[var4Lifetime4] = (var6Lifetime3 << 7) + da.b(127, this.field_t[var4Lifetime4]);
        }
        if (var5Lifetime4 == 98) {
          this.field_t[var4Lifetime4] = da.b(16256, this.field_t[var4Lifetime4]) + var6Lifetime3;
        }
        if (101 == var5Lifetime4) {
          this.field_t[var4Lifetime4] = (var6Lifetime3 << 7) + (16384 + da.b(127, this.field_t[var4Lifetime4]));
        }
        if (var5Lifetime4 == 100) {
          this.field_t[var4Lifetime4] = da.b(16256, this.field_t[var4Lifetime4]) + 16384 + var6Lifetime3;
        }
        if (var5Lifetime4 == 120) {
          this.a(var4Lifetime4, 2099140935);
        }
        if (var5Lifetime4 == 121) {
          this.f(var4Lifetime4, -35);
        }
        if (var5Lifetime4 == 123) {
          this.b(param0 - 32755, var4Lifetime4);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.field_t[var4Lifetime4];
          if (var7 == 16384) {
            this.field_H[var4Lifetime4] = da.b(-16257, this.field_H[var4Lifetime4]) + (var6Lifetime3 << 7);
          }
        }
        if (38 == var5Lifetime4) {
          var7Lifetime1 = this.field_t[var4Lifetime4];
          if (16384 == var7Lifetime1) {
            this.field_H[var4Lifetime4] = da.b(this.field_H[var4Lifetime4], -128) + var6Lifetime3;
          }
        }
        if (16 == var5Lifetime4) {
          this.field_s[var4Lifetime4] = (var6Lifetime3 << 7) + da.b(this.field_s[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 48) {
          this.field_s[var4Lifetime4] = da.b(this.field_s[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 81) {
          if (var6Lifetime3 >= 64) {
            this.field_l[var4Lifetime4] = ge.a(this.field_l[var4Lifetime4], 4);
            if (var8 != 0) {
              this.d(80, var4Lifetime4);
              this.field_l[var4Lifetime4] = da.b(this.field_l[var4Lifetime4], -5);
            }
          } else {
            this.d(80, var4Lifetime4);
            this.field_l[var4Lifetime4] = da.b(this.field_l[var4Lifetime4], -5);
          }
        }
        if (var5Lifetime4 == 17) {
          this.a(true, (this.field_B[var4Lifetime4] & -16257) + (var6Lifetime3 << 7), var4Lifetime4);
        }
        if (var5Lifetime4 != 49) {
          return;
        }
        this.a(true, var6Lifetime3 + (-128 & this.field_B[var4Lifetime4]), var4Lifetime4);
    }

    public static void d(int param0) {
        if (param0 >= -44) {
          return;
        }
        field_D = null;
    }

    final synchronized void b(byte param0, int param1, int param2) {
        if (param0 <= 14) {
          return;
        }
        this.c((byte) -79, param1, param2);
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = Bounce.field_N;
        if (param0 >= -53) {
          this.field_y = (int[]) null;
        }
        if (this.field_z[param1] != param2) {
          this.field_z[param1] = param2;
          var4 = 0;
          while (var4 < 128) {
            this.field_O[param1][var4] = null;
            var4++;
            if (var5 != 0) {
              break;
            }
          }
        }
    }

    private final int a(kl param0, boolean param1) {
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ch var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = (param0.field_x * param0.field_h >> 12) + param0.field_l;
          var3_int = var3_int + (this.field_H[param0.field_E] * (this.field_y[param0.field_E] - 8192) >> 12);
          var4 = param0.field_o;
          if (var4.field_c > 0 && (!(var4.field_f <= 0) ||
            this.field_E[param0.field_E] > 0)) {
            var5 = var4.field_f << 2;
            var6 = var4.field_d << 1;
            if (var6 > param0.field_p) {
              var5 = var5 * param0.field_p / var6;
            }
            var5 = var5 + (this.field_E[param0.field_E] >> 7);
            var7 = Math.sin((double)(param0.field_v & 511) * 0.01227184630308513);
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          if (!param1) {
            stackIn_10_0 = -85;
            return stackIn_10_0;
          }
          var5Lifetime1 = (int)(0.5 + (double)(param0.field_w.field_k * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)e.field_r);
          stackIn_14_0 = (var5Lifetime1 >= 1) ? var5Lifetime1 : 1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("pk.O(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(int param0, int param1, int param2) {
        if (param0 != 23882) {
          this.field_A = -99;
        }
    }

    final synchronized void f(int param0) {
        int discarded$0 = 0;
        this.a(true, 60);
        if (param0 != -22719) {
          kl var3 = (kl) null;
          discarded$0 = this.a((kl) null, false);
        }
    }

    private final void a(int param0, byte param1, int param2) {
        this.field_y[param0] = param2;
        if (param1 < 100) {
          field_D = (gk) null;
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        kl var6;
        int var7;
        kl var8;
        var7 = Bounce.field_N;
        var8 = this.field_C[param0][param1];
        if (var8 == null) {
          return;
        }
        boolean decompiledFrameCompleted0 = true;
        this.field_C[param0][param1] = null;
        if (param3 != (2 & this.field_l[param0])) {
          var6 = (kl) (this.field_o.field_m.a((byte) -73));
          while (true) {
            if (var6 != null) {
              if (var7 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (var6.field_E == var8.field_E &&
                0 > var6.field_C &&
                var6 != var8) {
                var8.field_C = 0;
              } else {
                var6 = (kl) (this.field_o.field_m.d((byte) 73));
                continue;
              }
            }
            break;
          }
          if ((decompiledFrameCompleted0) &&
            (var7 != 0)) {
            var8.field_C = 0;
          }
        } else {
          var8.field_C = 0;
        }

    }

    final void a(kl param0, byte param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -114) {
            return;
          }
          var4_int = param0.field_w.field_h.length;
          boolean decompiledSharedTail0 = (!(param2) ||
            !(param0.field_w.field_j));
          if (!decompiledSharedTail0) {
            var6 = -param0.field_w.field_i + var4_int + var4_int;
            var5 = (int)((long)this.field_s[param0.field_E] * (long)var6 >> 6);
            var4_int = var4_int << 8;
            if (var4_int <= var5) {
              param0.field_i.a(true);
              var5 = -1 + var4_int + (var4_int - var5);
            }
            decompiledSharedTail0 = (Bounce.field_N != 0);
          }
          if (decompiledSharedTail0) {
            var5 = (int)((long)this.field_s[param0.field_E] * (long)var4_int >> 6);
          }
          param0.field_i.g(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("pk.DA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void d(int param0, int param1) {
        kl var3;
        int var4;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        boolean decompiledFrameCompleted0 = true;
        var4 = Bounce.field_N;
        if (0 != (4 & this.field_l[param1])) {
          var3 = (kl) (this.field_o.field_m.a((byte) -71));
          while (var3 != null) {
            stackIn_9_0 = var3.field_E;
            stackIn_9_1 = param1;
            if (var4 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (stackIn_9_0 == stackIn_9_1) {
              var3.field_u = 0;
            }
            var3 = (kl) (this.field_o.field_m.d((byte) -40));
          }
        }
        if (decompiledFrameCompleted0) {
          stackIn_9_0 = param0;
          stackIn_9_1 = 25;
        }
        if (stackIn_9_0 <= stackIn_9_1) {
          this.field_m = (int[]) null;
        }
    }

    private final int a(kl param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 53) {
            this.a(-12);
          }
          var3_int = this.field_k[param0.field_E];
          if (var3_int < 8192) {
            stackIn_6_0 = var3_int * param0.field_k + 32 >> 6;
            return stackIn_6_0;
          }
          stackIn_4_0 = -(32 + (16384 - var3_int) * (128 - param0.field_k) >> 6) + 16384;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("pk.I(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param1 != 128) {
          this.field_I = 110;
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        this.field_B[param2] = param1;
        if (param0) {
          this.field_K[param2] = (int)(2097152.0 * Math.pow(2.0, (double)param1 * 0.00054931640625) + 0.5);
          return;
        }
    }

    final synchronized boolean a(byte param0, i param1, gk param2, be param3, int param4) {
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
        kj var8 = null;
        int var9 = 0;
        int var11 = 0;
        rj var12 = null;
        rj var13 = null;
        var11 = Bounce.field_N;
        try {
          param3.b();
          var6_int = 1;
          var7 = null;
          if (param4 > 0) {
            var7 = new int[]{param4};
          }
          var8 = (kj) (param3.field_g.b(0));
          if (param0 > -89) {
            return false;
          }
          L2: while (true) {
            if (var8 != null) {
              var9 = (int)var8.field_d;
              var12 = (rj) (this.field_u.a(124, (long)var9));
              if (var11 == 0) {
                boolean decompiledFrameRemainder0 = true;
                if (var12 == null) {
                  var13 = fj.a(param2, 0, var9);
                  if (var13 == null) {
                    var6_int = 0;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    this.field_u.a((long)var9, 46, var13);
                    decompiledFrameRemainder0 = !(var13.a((byte) 112, var8.field_h, (int[]) (var7), param1));
                  }
                } else {
                  decompiledFrameRemainder0 = !(var12.a((byte) 112, var8.field_h, (int[]) (var7), param1));
                }
                if (decompiledFrameRemainder0) {
                  var6_int = 0;
                }
                var8 = (kj) (param3.field_g.a(-1));
                continue;
              }
            } else {
              if (var6_int == 0) {
                break L2;
              }
            }
            param3.a();
            break;
          }
          stackIn_21_0 = var6_int;
          return stackIn_21_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_24_0 = var6;
          stackIn_24_1 = new StringBuilder().append("pk.G(").append(param0).append(',');
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
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param4).append(')').toString());
        }
    }

    final synchronized void g(int param0, int param1) {
        int discarded$0 = 0;
        if (param1 != 100) {
          kl var4 = (kl) null;
          discarded$0 = this.a((kl) null, (byte) -18);
        }
        this.field_I = param0;
    }

    private final void f(int param0, int param1) {
        int var4 = Bounce.field_N;
        if (param0 >= 0) {
          this.field_J[param0] = 12800;
          this.field_k[param0] = 8192;
          this.field_q[param0] = 16383;
          if (param1 > 0) {
            this.field_A = -66;
          }
          this.field_y[param0] = 8192;
          this.field_E[param0] = 0;
          this.field_m[param0] = 8192;
          this.c(param0, 20974);
          this.d(110, param0);
          this.field_l[param0] = 0;
          this.field_t[param0] = 32767;
          this.field_H[param0] = 256;
          this.field_s[param0] = 0;
          this.a(true, 8192, param0);
          return;
        }
        param0 = 0;
        do {
          if (param0 >= 16) {
            return;
          }
          this.f(param0, -15);
          param0++;
        } while (var4 == 0);
    }

    public pk() {
        this.field_M = new int[16];
        this.field_t = new int[16];
        this.field_H = new int[16];
        this.field_O = new kl[16][128];
        this.field_k = new int[16];
        this.field_q = new int[16];
        this.field_n = 1000000;
        this.field_K = new int[16];
        this.field_z = new int[16];
        this.field_I = 256;
        this.field_J = new int[16];
        this.field_E = new int[16];
        this.field_r = new int[16];
        this.field_B = new int[16];
        this.field_m = new int[16];
        this.field_C = new kl[16][128];
        this.field_s = new int[16];
        this.field_y = new int[16];
        this.field_N = new int[16];
        this.field_l = new int[16];
        this.field_w = new oe();
        this.field_o = new ka(this);
        this.field_u = new uk(128);
        this.a(0, 256, -1);
        this.b(true, -1);
    }

    static {
    }
}
