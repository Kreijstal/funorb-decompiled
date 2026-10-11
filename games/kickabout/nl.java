/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nl extends mo {
    int field_n;
    private int field_g;
    int field_I;
    int field_J;
    int field_v;
    int field_x;
    int field_h;
    int field_K;
    int field_j;
    boolean field_O;
    int field_r;
    int field_z;
    static int field_p;
    int field_C;
    int field_o;
    private int field_D;
    int field_M;
    boolean field_y;
    private int field_A;
    int field_G;
    boolean field_l;
    int field_m;
    int field_B;
    int field_w;
    int field_q;
    private int field_t;
    boolean field_s;
    up field_N;
    static tf field_f;
    int field_P;
    int field_u;
    int field_F;
    int field_L;
    int field_k;
    static hu field_i;

    final boolean b(boolean param0) {
        if (param0) {
          this.field_L = -114;
        }
        return (3 & (this.field_G >> 2 ^ this.field_G)) == 3 ? true : false;
    }

    public static void e(byte param0) {
        field_i = null;
        field_f = null;
        if (param0 > -49) {
          nl.a(true, (byte) -47);
        }
    }

    final boolean e(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 292603688) {
          this.field_z = -70;
        }
        stackIn_7_0 = ((3 & (this.field_G >> 2 ^ this.field_G)) != 0) || (this.field_u == 4);
        return stackIn_7_0;
    }

    void a(int param0, la[] param1, boolean param2, boolean param3) {
        boolean stackIn_6_1 = false;
        int stackIn_22_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_60_0 = 0;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_92_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var13 = null;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var7Lifetime6;
        int var8Lifetime1;
        int var7Lifetime7;
        var9 = Kickabout.field_G;
        try {
          if (this.field_C > 0) {
            this.field_C = this.field_C - 1;
          }
          stackIn_6_1 = (param2);
          this.field_l = stackIn_6_1;
          if (this.field_u != 0) {
            this.field_L = this.field_L - 1;
          }
          var5_int = 0;
          var6 = 0;
          if (3 == this.field_u ||
            this.field_u == 12 ||
            this.field_u == 13) {
            if (!this.field_s) {
              if (this.field_N.a((byte) 44, this.field_y) &&
                this.field_G != 0) {
                this.a(this.field_G, param0 ^ 26212);
                if (this.field_n != 0 &&
                  this.field_j != 0) {
                  stackIn_22_0 = this.field_D;
                } else {
                  stackIn_22_0 = this.field_q;
                }
                var7 = stackIn_22_0;
                this.field_m = this.field_n * var7;
                this.field_k = this.field_j * var7;
              }
              var7Lifetime7 = this.field_k;
              var8 = this.field_m;
              if (this.field_l) {
                var7Lifetime7 = var7Lifetime7 << 1;
                var8 = var8 << 1;
              }
              var5_int = var7Lifetime7;
              var6 = var8;
            } else {
              var5_int = this.field_r;
              var6 = this.field_B;
            }
          }
          if (this.field_u == 5) {
            var7Lifetime1 = -(this.field_o << 14) + 327680;
            if (this.field_t - var7Lifetime1 > this.field_M) {
              var5_int = var7Lifetime1;
            }
            if (this.field_t + var7Lifetime1 < this.field_M) {
              var5_int = -var7Lifetime1;
            }
          }
          if (param0 == this.field_u) {
            this.a(this.field_h, 26214);
          }
          if (this.field_u == 4) {
            if (this.field_n != 0 &&
              this.field_j != 0) {
              stackIn_40_0 = this.field_g;
            } else {
              stackIn_40_0 = this.field_A;
            }
            var7Lifetime2 = stackIn_40_0 << 1;
            if (this.field_N.b(this.field_y, 100)) {
              this.a(this.field_G, 26214);
            }
            var6 = var7Lifetime2 * this.field_n;
            var5_int = var7Lifetime2 * this.field_j;
          }
          stackIn_46_0 = (this.field_u != 0) ? 0 : 1;
          var7Lifetime3 = stackIn_46_0;
          stackIn_48_0 = var7Lifetime3;
          if (this.field_u != 1) {
            stackIn_49_1 = 0;
          } else {
            stackIn_49_1 = 1;
          }
          var7Lifetime4 = stackIn_48_0 | stackIn_49_1;
          stackIn_51_0 = var7Lifetime4;
          if (this.field_u != 11) {
            stackIn_52_1 = 0;
          } else {
            stackIn_52_1 = 1;
          }
          var7Lifetime5 = stackIn_51_0 | stackIn_52_1;
          stackIn_54_0 = var7Lifetime5;
          if (this.field_u != 14) {
            stackIn_55_1 = 0;
          } else {
            stackIn_55_1 = 1;
          }
          var7Lifetime6 = stackIn_54_0 | stackIn_55_1;
          if (var7Lifetime6 != 0 &&
            this.e(292603688)) {
            if (!this.b(false)) {
              stackIn_60_0 = this.field_A;
            } else {
              stackIn_60_0 = this.field_g;
            }
            var8Lifetime1 = stackIn_60_0;
            if (this.field_l) {
              var8Lifetime1 = var8Lifetime1 * 5 >> 2;
            }
            if (param3) {
              var8Lifetime1 = 9 * var8Lifetime1 / 10;
            }
            this.a(this.field_G, 26214);
            if (this.field_u == 14) {
              var8Lifetime1 = 73728;
            }
            if (1 == this.field_u) {
              if (!this.field_N.c(this.field_y, (byte) -62)) {
                var8Lifetime1 = var8Lifetime1 >> 2;
              } else {
                var8Lifetime1 = var8Lifetime1 >> 1;
              }
            }
            if (this.field_u == 11) {
              var8Lifetime1 = io.field_q[this.field_N.field_q] * 3 >> 1;
              if (this.b(false)) {
                var8Lifetime1 = var8Lifetime1 * 181 >> 8;
              }
            }
            var6 = this.field_n * var8Lifetime1;
            var5_int = var8Lifetime1 * this.field_j;
          }
          var13 = lt.a(var5_int, var6, param1, -61, this.field_v, this.field_w, this.field_M, this.field_K);
          this.field_w = var13[1];
          this.field_M = var13[0];
          this.field_v = var13[2];
          if (this.field_K != var13[5]) {
            if (this.field_K <= 0 &&
              var13[5] >= 0) {
              this.field_v = 0;
              this.field_K = 0;
            } else {
              this.field_K = var13[5];
            }
          }
          if (this.field_v != 0) {
            this.field_K = this.field_K - 26214;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_91_0 = var5;
          stackIn_91_1 = new StringBuilder().append("nl.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_92_2 = "null";
          } else {
            stackIn_92_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_91_0), ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(int param0, byte param1) {
        int var9 = 0;
        int var3 = this.field_N.d(this.field_y, param1 ^ -68);
        int var4 = var3 * 14 / 100;
        if (param1 != -68) {
          nl.e((byte) 48);
        }
        int var5 = -var4 + 14;
        int var6 = this.c((byte) -99);
        param0 = (var5 + param0) % var6;
        int var7 = var6 >> 1;
        int var8 = var7 < param0 ? -param0 + var6 : param0;
        if (var5 > var8) {
          return 0;
        }
        if (-var4 + var7 >= var8) {
          var9 = (var8 - var5 << 8) / (var7 - (var5 + var4));
          return var9;
        }
        return 256;
    }

    final int b(byte param0) {
        int var2 = this.field_N.h(0);
        var2 = fj.a(-40, var2 ^ this.field_A);
        var2 = fj.a(-40, this.field_g ^ var2);
        var2 = fj.a(-40, var2 ^ this.field_q);
        var2 = fj.a(-40, var2 ^ this.field_D);
        var2 = fj.a(-40, var2 ^ this.field_M);
        if (param0 > -61) {
          this.a((byte) -7, -29);
        }
        var2 = fj.a(-40, this.field_w ^ var2);
        var2 = fj.a(-40, var2 ^ this.field_v);
        var2 = fj.a(-40, var2 ^ this.field_K);
        var2 = fj.a(-40, this.field_I ^ var2);
        var2 = fj.a(-40, var2 ^ this.field_o);
        var2 = fj.a(-40, var2 ^ this.field_t);
        var2 = fj.a(-40, this.field_G ^ var2);
        var2 = fj.a(-40, this.field_h ^ var2);
        var2 = fj.a(-40, var2 ^ this.field_j);
        var2 = fj.a(-40, var2 ^ this.field_n);
        var2 = fj.a(-40, var2 ^ this.field_u);
        var2 = fj.a(-40, this.field_L ^ var2);
        var2 = fj.a(-40, this.field_C ^ var2);
        var2 = fj.a(-40, var2 ^ this.field_z);
        var2 = fj.a(-40, this.field_x ^ var2);
        var2 = fj.a(-40, this.field_P ^ var2);
        var2 = fj.a(-40, var2 ^ (!this.field_O ? 0 : 1));
        var2 = fj.a(-40, var2 ^ this.field_k);
        var2 = fj.a(-40, var2 ^ this.field_m);
        var2 = fj.a(-40, var2 ^ (!this.field_s ? 0 : 1));
        var2 = fj.a(-40, var2 ^ this.field_r);
        var2 = fj.a(-40, var2 ^ this.field_B);
        var2 = fj.a(-40, this.field_J ^ var2);
        var2 = fj.a(-40, var2 ^ (this.field_y ? 1 : 0));
        var2 = fj.a(-40, var2 ^ (this.field_l ? 1 : 0));
        return var2;
    }

    final int a(boolean param0) {
        if (!param0) {
          this.field_q = 85;
        }
        return this.field_w >> 16;
    }

    final void a(int param0, ml param1) {
        try {
          this.field_M = param1.l(26, param0 ^ -13927);
          this.field_w = param1.l(27, 59);
          this.field_v = hq.a(22531, 30, param1, 0);
          this.field_K = ew.a((byte) 125, 17, param1, 0, 24, 25);
          this.field_G = param1.l(4, 59);
          this.field_n = param1.l(2, 59) - 1;
          this.field_j = -1 + param1.l(2, param0 + 13977);
          this.field_u = hq.a(param0 ^ -28255, kb.a(14, false), param1, 0);
          this.field_L = hq.a(22531, 8, param1, 0);
          this.field_C = hq.a(22531, 9, param1, 0);
          this.field_I = param1.l(3, param0 ^ -13927);
          this.field_O = mu.a(param1, (byte) -39);
          this.field_s = mu.a(param1, (byte) -39);
          this.field_k = mk.a(param1, 30, (byte) 6, 18);
          this.field_m = mk.a(param1, 30, (byte) 6, 18);
          this.field_r = mk.a(param1, 30, (byte) 6, 18);
          this.field_B = mk.a(param1, 30, (byte) 6, 18);
          this.field_h = param1.l(4, 59);
          this.field_z = param1.l(9, 59) - 5;
          this.field_x = aq.a(11, -30273, param1);
          if (param0 != -13918) {
            ml var4 = (ml) null;
            this.b(-70, (ml) null);
          }
          this.field_P = aq.a(11, -30273, param1);
          this.field_A = param1.l(32, param0 + 13977);
          this.field_g = param1.l(32, 59);
          this.field_q = param1.l(32, 59);
          this.field_D = param1.l(32, 59);
          this.field_o = param1.l(12, 59);
          this.field_t = param1.l(26, 59);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "nl.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, mo param1) {
        nl var4 = null;
        try {
          var4 = (nl) (param1);
          this.field_n = var4.field_n;
          this.field_w = var4.field_w;
          this.field_O = var4.field_O;
          this.field_L = var4.field_L;
          this.field_t = var4.field_t;
          this.field_B = var4.field_B;
          this.field_I = var4.field_I;
          this.field_C = var4.field_C;
          this.field_j = var4.field_j;
          this.field_r = var4.field_r;
          this.field_q = var4.field_q;
          this.field_s = var4.field_s;
          this.field_F = var4.field_F;
          this.field_A = var4.field_A;
          this.field_z = var4.field_z;
          this.field_P = var4.field_P;
          this.field_D = var4.field_D;
          this.field_o = var4.field_o;
          this.field_v = var4.field_v;
          this.field_g = var4.field_g;
          this.field_G = var4.field_G;
          if (param0 > -52) {
            this.b(-65, -41);
          }
          this.field_K = var4.field_K;
          this.field_u = var4.field_u;
          this.field_h = var4.field_h;
          this.field_x = var4.field_x;
          this.field_k = var4.field_k;
          this.field_m = var4.field_m;
          this.field_M = var4.field_M;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "nl.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, ml param1) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (mu.a(param1, (byte) -39)) {
            this.field_M = this.field_M + ew.a((byte) 125, 19, param1, 0, 23, 30);
            this.field_w = this.field_w + ew.a((byte) 125, 19, param1, 0, 23, 30);
            this.field_v = this.field_v + ew.a((byte) 125, 19, param1, 0, 23, 30);
          }
          this.field_K = mk.a(param1, 25, (byte) 6, 0);
          if (mu.a(param1, (byte) -39)) {
            this.field_G = param1.l(4, 59);
            this.field_n = -1 + param1.l(2, param0 ^ 50);
            this.field_j = param1.l(2, 59) - 1;
          }
          if (mu.a(param1, (byte) -39)) {
            this.field_u = param1.l(kb.a(14, false), 59);
            this.field_L = param1.l(8, param0 ^ 50);
          }
          this.field_C = hq.a(param0 ^ 22538, param0, param1, 0);
          if (mu.a(param1, (byte) -39)) {
            this.field_I = param1.l(3, 59);
          }
          if (mu.a(param1, (byte) -39)) {
            this.field_O = mu.a(param1, (byte) -39);
            this.field_h = param1.l(4, 59);
            this.field_z = -5 + param1.l(9, 59);
            this.field_x = aq.a(11, -30273, param1);
            this.field_P = aq.a(11, -30273, param1);
          }
          if (mu.a(param1, (byte) -39)) {
            this.field_s = mu.a(param1, (byte) -39);
            this.field_k = mk.a(param1, 30, (byte) 6, 18);
            this.field_m = mk.a(param1, 30, (byte) 6, 18);
            this.field_r = mk.a(param1, 30, (byte) 6, 18);
            this.field_B = mk.a(param1, 30, (byte) 6, 18);
          }
          if (mu.a(param1, (byte) -39)) {
            this.field_A = param1.l(32, param0 ^ 50);
            this.field_g = param1.l(32, 59);
            this.field_q = param1.l(32, 59);
            this.field_D = param1.l(32, 59);
          }
          if (this.field_J == 4 &&
            mu.a(param1, (byte) -39)) {
            this.field_o = param1.l(4, 59);
            this.field_t = param1.l(26, param0 + 50);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("nl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final boolean d(byte param0) {
        boolean stackIn_8_0 = false;
        if (param0 <= 94) {
          this.c((byte) 63);
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_u != 0 && (this.field_u != 4 ||
          !this.field_N.a((byte) 44, this.field_y))) {
          stackIn_8_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    final int f(int param0) {
        if (param0 > -88) {
          this.d((byte) -120);
        }
        return this.field_M >> 16;
    }

    final void c(int param0, int param1) {
        this.a((byte) -31, param1);
        this.field_G = param0 > this.field_M ? 8 : 2;
        this.field_t = param0;
        this.a(this.field_G, 26214);
        this.field_L = this.field_L + this.field_o * 2;
    }

    final void a(int param0, int param1) {
        if (param0 == 0) {
          return;
        }
        this.field_j = 0;
        this.field_n = 0;
        if (param1 != 26214) {
          nl.a(true, (byte) 88);
        }
        if ((param0 & 4) > 0) {
          this.field_n = this.field_n - 1;
        }
        if (0 < (1 & param0)) {
          this.field_n = this.field_n + 1;
        }
        if ((param0 & 2) > 0) {
          this.field_j = this.field_j - 1;
        }
        if (0 < (8 & param0)) {
          this.field_j = this.field_j + 1;
        }
        if (this.field_j == 0 &&
          0 == this.field_n) {
          this.field_n = 1;
        }
    }

    final void b(int param0, int param1) {
        this.a((byte) -31, 3);
        this.field_k = (we.a(param0, false) >> 8) * (this.field_q >> 8);
        this.field_m = (ei.a(param0, (byte) -23) >> 8) * (this.field_q >> 8);
        if (this.field_G == 0) {
          this.a(en.b(param0, -25147), 26214);
        }
        this.field_L = this.field_L + this.field_N.a(this.field_y, 0) / 5;
        this.field_F = param1;
        this.field_s = false;
    }

    final int c(byte param0) {
        String discarded$0 = null;
        if (param0 != -99) {
          discarded$0 = this.c(-72);
        }
        int var2 = -this.field_N.d(this.field_y, 0) + 100;
        return 80 + 120 * var2 / 100;
    }

    final int a(byte param0) {
        if (param0 != -99) {
          this.f(-27);
        }
        return 200 - (this.field_N.d(this.field_y, (byte) -127) * 2 - 120) + vf.field_I[4];
    }

    final void a(boolean param0, up param1, int param2) {
        boolean stackIn_3_1 = false;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          this.field_N = param1;
          stackIn_3_1 = (param0);
          this.field_y = stackIn_3_1;
          this.field_J = this.field_N.field_q;
          if (this.field_N.c(this.field_y, param2 - 109)) {
            stackIn_6_0 = 3;
          } else {
            stackIn_6_0 = this.field_J;
          }
          var4_int = stackIn_6_0;
          this.field_A = ea.field_j[var4_int] + (io.field_q[var4_int] - ea.field_j[var4_int]) * this.field_N.d(this.field_y, (byte) -84) / 100;
          if (this.field_N.a((byte) 44, this.field_y)) {
            stackIn_9_0 = 0;
          } else {
            stackIn_9_0 = this.field_J;
          }
          var5 = stackIn_9_0;
          this.field_q = g.field_b[var5] + (-g.field_b[var5] + pv.field_J[var5]) * this.field_N.a(this.field_y, param2 - 3) / 100;
          if (param2 != 3) {
            this.field_m = 74;
          }
          this.field_g = 181 * (this.field_A >> 8);
          this.field_D = (this.field_q >> 8) * 181;
          this.a(this.field_G, 26214);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("nl.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    private final String c(int param0) {
        if (this.field_J == 0) {
          return "Tank";
        }
        if (param0 != 9) {
          this.field_J = 110;
        }
        if (1 == this.field_J) {
          return "Htshot";
        }
        if (this.field_J == 3) {
          return "Ranger";
        }
        if (2 == this.field_J) {
          return "Elite";
        }
        if (4 != this.field_J) {
          return "Invalid[" + this.field_J + "]";
        }
        return "Keeper";
    }

    final static char a(boolean param0, byte param1) {
        int var3 = 0;
        int var2 = 255 & param1;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (128 <= var2 &&
          var2 < 160) {
          var3 = ts.field_c[-128 + var2];
          if (0 == var3) {
            var3 = 63;
          }
          var2 = var3;
        }
        if (!param0) {
          return (char)var2;
        }
        return '￘';
    }

    final void a(byte param0, int param1) {
        String discarded$0 = null;
        this.field_u = param1;
        this.field_L = vf.field_I[this.field_u];
        if (this.field_l) {
          if (8 == this.field_u) {
            this.field_L = this.field_L + 60;
          }
          if (3 == this.field_u) {
            this.field_L = this.field_L + 10;
          }
        }
        if (param0 != -31) {
          discarded$0 = this.c(false);
        }
    }

    private final String c(boolean param0) {
        if (0 == this.field_u) {
          return "Idle";
        }
        if (1 == this.field_u) {
          return "ACTION_CHARGE_KICK";
        }
        if (this.field_u == 2) {
          return "ACTION_KICK";
        }
        if (this.field_u == 3) {
          return "ACTION_TACKLE";
        }
        if (4 == this.field_u) {
          return "ACTION_DASH";
        }
        if (this.field_u == 5) {
          return "ACTION_DIVE";
        }
        if (this.field_u == 6) {
          return "ACTION_DIVE_STAND";
        }
        if (this.field_u == 7) {
          return "ACTION_FALL_TACKLED";
        }
        if (this.field_u == 8) {
          return "ACTION_PAUSE_TACKLED";
        }
        if (this.field_u == 9) {
          return "ACTION_STAND_TACKLED";
        }
        if (this.field_u == 10) {
          return "ACTION_TACKLE_STAND";
        }
        if (this.field_u == 11) {
          return "ACTION_RUN_HOME";
        }
        if (!param0) {
          return (String) null;
        }
        if (this.field_u == 12) {
          return "ACTION_TACKLE_SUCCESS";
        }
        if (this.field_u == 13) {
          return "ACTION_HEADER";
        }
        if (14 == this.field_u) {
          return "ACTION_KEEPER_SHUFFLE";
        }
        return "Invalid(" + this.field_u + ")";
    }

    public final String toString() {
        StringBuilder discarded$34 = null;
        StringBuilder discarded$130 = null;
        StringBuilder var2 = new StringBuilder("AgentFootballer[" + this.c(9) + "]");
        StringBuilder discarded$0 = var2.append("\n\t\tloc=\t[");
        eh.a(this.field_M, 100, var2);
        StringBuilder discarded$1 = var2.append(", ");
        eh.a(this.field_w, 100, var2);
        StringBuilder discarded$2 = var2.append(", ");
        eh.a(this.field_v, 100, var2);
        StringBuilder discarded$3 = var2.append(", ");
        eh.a(this.field_K, 100, var2);
        StringBuilder discarded$4 = var2.append(", " + this.field_C + "]");
        StringBuilder discarded$5 = var2.append("\n\t\tspd=[");
        eh.a(this.field_A, 100, var2);
        StringBuilder discarded$6 = var2.append(", ");
        eh.a(this.field_g, 100, var2);
        StringBuilder discarded$7 = var2.append(", ");
        eh.a(this.field_q, 100, var2);
        StringBuilder discarded$8 = var2.append(", ");
        eh.a(this.field_D, 100, var2);
        StringBuilder discarded$9 = var2.append("]");
        StringBuilder discarded$10 = var2.append("\n\t\tstathash=" + this.field_N.h(0));
        StringBuilder discarded$33 = var2.append("\n\t\tact=\t[" + this.field_L + ", " + this.c(true) + ", ai_wait=" + this.field_I + "]");
        if (4 == this.field_J) {
          discarded$34 = var2.append("\n\t\tkeeperstate=[" + this.field_o + "," + this.field_t + "]");
        }
        StringBuilder discarded$35 = var2.append("\n\t\tdirec=\t[");
        gn.a(this.field_G, -28745, 4, var2);
        StringBuilder discarded$36 = var2.append(',');
        gn.a(this.field_h, -28745, 4, var2);
        StringBuilder discarded$37 = var2.append("," + this.field_j + "," + this.field_n + "]");
        StringBuilder discarded$38 = var2.append("\n\t\tkick=\t[" + this.field_z + "," + this.field_x + "," + this.field_P + "," + this.field_O + "]");
        StringBuilder discarded$129 = var2.append("\n\t\ttackle=\t[" + this.field_k + "," + this.field_m + "," + this.field_s + "," + this.field_r + "," + this.field_B + "]");
        if (this.field_l) {
          discarded$130 = var2.append("\n\t\tMEGAMODE");
        }
        StringBuilder discarded$131 = var2.append("\n\t\t" + (this.field_y ? "" : "!") + "member, " + (!this.field_l ? "!" : "") + "mega");
        return var2.toString();
    }

    public nl() {
        this.field_o = 0;
        this.field_l = false;
        this.field_F = -1;
    }

    final int d(int param0) {
        int var2 = 0;
        if (this.field_j > 0) {
          var2 = var2 | 8;
        }
        if (this.field_j < 0) {
          var2 = var2 | 2;
        }
        if (0 < this.field_n) {
          var2 = var2 | 1;
        }
        if (param0 != 5339) {
          this.field_u = 35;
        }
        if (this.field_n < 0) {
          var2 = var2 | 4;
        }
        return var2;
    }

    static {
        field_p = 0;
        field_f = new tf();
    }
}
