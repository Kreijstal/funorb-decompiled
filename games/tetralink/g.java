/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends eb {
    private int field_R;
    private int[] field_r;
    private int[] field_V;
    int[] field_I;
    private int[] field_H;
    private int[] field_t;
    static String field_O;
    private dj field_A;
    private int[] field_v;
    static int field_s;
    private int[] field_K;
    private int field_X;
    private int[] field_M;
    private int[] field_u;
    private int[] field_Q;
    private int[] field_E;
    int[] field_T;
    private wj field_N;
    private oc[][] field_J;
    private int[] field_L;
    private oc[][] field_B;
    int[] field_G;
    private int[] field_w;
    private int[] field_W;
    private long field_C;
    private wn field_y;
    private boolean field_x;
    private int field_Y;
    private int field_S;
    private long field_D;
    private boolean field_U;
    private int field_F;
    private ri field_z;

    private final void b(byte param0) {
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_27_0Lifetime1;
        int stackIn_27_1Lifetime1;
        var7 = TetraLink.field_J;
        var2 = this.field_Y;
        if (param0 <= 19) {
          this.field_V = (int[]) null;
        }
        var3 = this.field_S;
        var4 = this.field_C;
        if (null != this.field_z &&
          ~this.field_F == ~var3) {
          this.a(this.field_z, 0, this.field_U, this.field_x);
          this.b((byte) 38);
          return;
        }
        L2: while (true) {
          stackIn_7_0 = ~var3;
          stackIn_7_1 = ~this.field_S;
          if (stackIn_7_0 == stackIn_7_1) {
            while (true) {
              stackIn_27_0 = var3;
              stackIn_27_1 = this.field_N.field_g[var2];
              if (stackIn_27_0 == stackIn_27_1) {
                this.field_N.f(var2);
                var6 = this.field_N.c(var2);
                stackIn_7_0 = -2;
                stackIn_7_1 = ~var6;
                if (stackIn_7_0 != stackIn_7_1) {
                  if ((128 & var6) != 0) {
                    this.f(91, var6);
                  }
                  this.field_N.e(var2);
                  this.field_N.b(var2);
                  continue;
                }
                this.field_N.c();
                this.field_N.b(var2);
                if (this.field_N.a()) {
                  if (this.field_z != null) {
                    this.a(this.field_x, this.field_z, (byte) 123);
                    this.b((byte) 108);
                    return;
                  }
                  if (this.field_x &&
                    var3 != 0) {
                    this.field_N.a(var4);
                  } else {
                    this.a(true, (byte) 127);
                    this.field_N.d();
                    return;
                  }
                }
              }
              break;
            }
            var2 = this.field_N.g();
            var3 = this.field_N.field_g[var2];
            var4 = this.field_N.d(var3);
            continue L2;
          }
          break;
        }
        this.field_C = var4;
        this.field_Y = var2;
        this.field_S = var3;
        if (this.field_z == null) {
          return;
        }
        stackIn_27_0Lifetime1 = var3;
        stackIn_27_1Lifetime1 = this.field_F;
        if (stackIn_27_0Lifetime1 > stackIn_27_1Lifetime1) {
          this.field_Y = -1;
          this.field_S = this.field_F;
          this.field_C = this.field_N.d(this.field_S);
        }
        return;
    }

    private final void f(int param0, int param1) {
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
        int var5Lifetime3Lifetime1;
        var8 = TetraLink.field_J;
        var3 = 240 & param1;
        if (128 == var3) {
          var4 = param1 & 15;
          var5 = param1 >> 8 & 127;
          var6 = (8323462 & param1) >> 16;
          this.a(var5, (byte) 77, var4, var6);
          return;
        }
        if (var3 == 144) {
          var4Lifetime1 = 15 & param1;
          var5Lifetime1 = (param1 & 32590) >> 8;
          var6Lifetime1 = (8359574 & param1) >> 16;
          if (var6Lifetime1 <= 0) {
            this.a(var5Lifetime1, (byte) 77, var4Lifetime1, 64);
          } else {
            this.a(var5Lifetime1, var6Lifetime1, -25798, var4Lifetime1);
          }
          return;
        }
        if (160 == var3) {
          var4Lifetime2 = param1 & 15;
          var5Lifetime2 = (param1 & 32674) >> 8;
          var6Lifetime2 = (param1 & 8343902) >> 16;
          this.a(false, var4Lifetime2, var5Lifetime2, var6Lifetime2);
          return;
        }
        if (var3 != 176) {
          if (var3 == 192) {
            var4Lifetime3 = 15 & param1;
            var5Lifetime3 = (32759 & param1) >> 8;
            this.c(var5Lifetime3 + this.field_M[var4Lifetime3], -2, var4Lifetime3);
            return;
          }
          if (var3 == 208) {
            var4Lifetime3Lifetime1 = 15 & param1;
            var5Lifetime3Lifetime1 = (32749 & param1) >> 8;
            this.a((byte) -62, var5Lifetime3Lifetime1, var4Lifetime3Lifetime1);
          } else {
            if (var3 == 224) {
              var4Lifetime3Lifetime1 = 15 & param1;
              var5Lifetime3Lifetime1 = ((param1 & 8323385) >> 9) + ((param1 & 32630) >> 8);
              this.d(-27508, var4Lifetime3Lifetime1, var5Lifetime3Lifetime1);
            } else {
              var3 = 255 & param1;
              if (var3 == 255) {
                this.a(true, (byte) 77);
              } else {
                if (param0 < 67) {
                  this.field_X = -10;
                }
              }
            }
          }
          return;
        }
        var4Lifetime4 = param1 & 15;
        var5Lifetime4 = param1 >> 8 & 127;
        var6Lifetime3 = 127 & param1 >> 16;
        if (var5Lifetime4 == 0) {
          this.field_M[var4Lifetime4] = pl.a(-2080769, this.field_M[var4Lifetime4]) + (var6Lifetime3 << 14);
        }
        if (32 == var5Lifetime4) {
          this.field_M[var4Lifetime4] = (var6Lifetime3 << 7) + pl.a(this.field_M[var4Lifetime4], -16257);
        }
        if (1 == var5Lifetime4) {
          this.field_t[var4Lifetime4] = pl.a(this.field_t[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 33) {
          this.field_t[var4Lifetime4] = pl.a(this.field_t[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (5 == var5Lifetime4) {
          this.field_V[var4Lifetime4] = pl.a(this.field_V[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 37) {
          this.field_V[var4Lifetime4] = pl.a(this.field_V[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 7) {
          this.field_u[var4Lifetime4] = pl.a(-16257, this.field_u[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 39) {
          this.field_u[var4Lifetime4] = var6Lifetime3 + pl.a(-128, this.field_u[var4Lifetime4]);
        }
        if (var5Lifetime4 == 10) {
          this.field_r[var4Lifetime4] = (var6Lifetime3 << 7) + pl.a(this.field_r[var4Lifetime4], -16257);
        }
        if (var5Lifetime4 == 42) {
          this.field_r[var4Lifetime4] = pl.a(this.field_r[var4Lifetime4], -128) + var6Lifetime3;
        }
        if (var5Lifetime4 == 11) {
          this.field_W[var4Lifetime4] = pl.a(this.field_W[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 43) {
          this.field_W[var4Lifetime4] = var6Lifetime3 + pl.a(-128, this.field_W[var4Lifetime4]);
        }
        if (64 == var5Lifetime4) {
          if (64 <= var6Lifetime3) {
            this.field_I[var4Lifetime4] = mc.a(this.field_I[var4Lifetime4], 1);
          } else {
            this.field_I[var4Lifetime4] = pl.a(this.field_I[var4Lifetime4], -2);
          }
        }
        if (65 == var5Lifetime4) {
          if (var6Lifetime3 >= 64) {
            this.field_I[var4Lifetime4] = mc.a(this.field_I[var4Lifetime4], 2);
          } else {
            this.a(var4Lifetime4, (byte) 116);
            this.field_I[var4Lifetime4] = pl.a(this.field_I[var4Lifetime4], -3);
          }
        }
        if (var5Lifetime4 == 99) {
          this.field_v[var4Lifetime4] = pl.a(127, this.field_v[var4Lifetime4]) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 98) {
          this.field_v[var4Lifetime4] = var6Lifetime3 + pl.a(16256, this.field_v[var4Lifetime4]);
        }
        if (var5Lifetime4 == 101) {
          this.field_v[var4Lifetime4] = pl.a(127, this.field_v[var4Lifetime4]) + 16384 + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 100) {
          this.field_v[var4Lifetime4] = var6Lifetime3 + 16384 + pl.a(16256, this.field_v[var4Lifetime4]);
        }
        if (var5Lifetime4 == 120) {
          this.b((byte) -119, var4Lifetime4);
        }
        if (121 == var5Lifetime4) {
          this.d(var4Lifetime4, 16384);
        }
        if (var5Lifetime4 == 123) {
          this.e(var4Lifetime4, -58);
        }
        if (var5Lifetime4 == 6) {
          var7 = this.field_v[var4Lifetime4];
          if (var7 == 16384) {
            this.field_K[var4Lifetime4] = (var6Lifetime3 << 7) + pl.a(this.field_K[var4Lifetime4], -16257);
          }
        }
        if (38 == var5Lifetime4) {
          var7Lifetime1 = this.field_v[var4Lifetime4];
          if (var7Lifetime1 == 16384) {
            this.field_K[var4Lifetime4] = var6Lifetime3 + pl.a(this.field_K[var4Lifetime4], -128);
          }
        }
        if (var5Lifetime4 == 16) {
          this.field_G[var4Lifetime4] = pl.a(this.field_G[var4Lifetime4], -16257) + (var6Lifetime3 << 7);
        }
        if (var5Lifetime4 == 48) {
          this.field_G[var4Lifetime4] = pl.a(-128, this.field_G[var4Lifetime4]) + var6Lifetime3;
        }
        if (var5Lifetime4 == 81) {
          if (64 > var6Lifetime3) {
            this.b(var4Lifetime4, 114);
            this.field_I[var4Lifetime4] = pl.a(this.field_I[var4Lifetime4], -5);
          } else {
            this.field_I[var4Lifetime4] = mc.a(this.field_I[var4Lifetime4], 4);
          }
        }
        if (var5Lifetime4 == 17) {
          this.f(var4Lifetime4, 13242, (-16257 & this.field_L[var4Lifetime4]) + (var6Lifetime3 << 7));
        }
        if (var5Lifetime4 == 49) {
          this.f(var4Lifetime4, 13242, var6Lifetime3 + (-128 & this.field_L[var4Lifetime4]));
          return;
        }
    }

    private final int a(oc param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        lm var9 = null;
        lm var10 = null;
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
          if (this.field_w[param0.field_n] == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var9 = param0.field_q;
          var10 = var9;
          var4 = 4096 + this.field_W[param0.field_n] * this.field_u[param0.field_n] >> 13;
          var4 = 16384 + var4 * var4 >> 15;
          var4 = 16384 + param0.field_J * var4 >> 15;
          var4 = var4 * this.field_X + 128 >> 8;
          var4 = var4 * this.field_w[param0.field_n] + 128 >> 8;
          if (var10.field_a > 0) {
            var4 = (int)((double)var4 * Math.pow(0.5, (double)var10.field_a * (0.00001953125 * (double)param0.field_t)) + 0.5);
          }
          if (param1 != 16402) {
            field_O = (String) null;
          }
          if (null != var10.field_d) {
            var5 = param0.field_o;
            var6 = var10.field_d[1 + param0.field_G];
            if (param0.field_G < (-2 + var10.field_d.length)) {
              var7 = var9.field_d[param0.field_G] << 8 & 65280;
              var8 = (var10.field_d[2 + param0.field_G] & 255) << 8;
              var6 = var6 + (var5 - var7) * (var10.field_d[3 + param0.field_G] - var6) / (var8 - var7);
            }
            var4 = 32 + var6 * var4 >> 6;
          }
          if (0 < param0.field_v &&
            null != var10.field_e) {
            var5Lifetime1 = param0.field_v;
            var6Lifetime1 = var10.field_e[param0.field_A + 1];
            if (param0.field_A < -2 + var10.field_e.length) {
              var7Lifetime1 = var9.field_e[param0.field_A] << 8 & 65280;
              var8Lifetime1 = (var10.field_e[param0.field_A + 2] & 255) << 8;
              var6Lifetime1 = var6Lifetime1 + (var5Lifetime1 - var7Lifetime1) * (-var6Lifetime1 + var10.field_e[param0.field_A + 3]) / (-var7Lifetime1 + var8Lifetime1);
            }
            var4 = 32 + var6Lifetime1 * var4 >> 6;
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("g.M(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(int param0, int param1) {
        oc var3_ref_oc;
        int var3;
        int var4;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_0Lifetime1;
        int stackIn_8_1Lifetime1;
        var4 = TetraLink.field_J;
        if ((this.field_I[param0] & 4) != 0) {
          var3_ref_oc = (oc) (this.field_y.field_u.c(false));
          while (var3_ref_oc != null) {
            stackIn_8_0 = param0;
            stackIn_8_1 = var3_ref_oc.field_n;
            if (stackIn_8_0 == stackIn_8_1) {
              var3_ref_oc.field_F = 0;
            }
            var3_ref_oc = (oc) (this.field_y.field_u.a((byte) -70));
          }
        }
        stackIn_8_0Lifetime1 = 65;
        stackIn_8_1Lifetime1 = (10 - param1) / 37;
        var3 = stackIn_8_0Lifetime1 / stackIn_8_1Lifetime1;
    }

    final static void c(int param0) {
        gm.field_d.a((byte) -92, hh.field_c.field_Hb - (kj.field_b ? ha.field_e + 2 + 42 : 0), 0, 18, 0);
        if (param0 != 1753) {
          field_s = 47;
        }
        qc.field_eb.a((byte) -93, 42 + ha.field_e, 0, 18, -40 + hh.field_c.field_Hb + (-ha.field_e - 2));
        hn.field_Q.a(hh.field_c.field_Hb, ha.field_e, hh.field_c.field_R - 20, true, 20, 0, 2);
    }

    private final int a(byte param0, oc param1) {
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
          var3_int = this.field_r[param1.field_n];
          var4 = -71 / ((-33 - param0) / 52);
          if (var3_int < 8192) {
            stackIn_4_0 = 32 + param1.field_r * var3_int >> 6;
            return stackIn_4_0;
          }
          stackIn_2_0 = -((-param1.field_r + 128) * (16384 - var3_int) + 32 >> 6) + 16384;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("g.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static oh[] a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = TetraLink.field_J;
        oh[] var7 = new oh[9];
        oh[] var4 = var7;
        var7[0] = ce.a(param1, param2, 0);
        for (var5 = 1; 9 > var5; var5++) {
          var7[var5] = var7[0];
        }
        var4[4] = ce.a(param0, 64, 0);
        if (param3 <= 44) {
          g.a(78, (byte) -73, -70);
        }
        return var4;
    }

    final synchronized void a(int param0) {
        int var2;
        long var3;
        int var6;
        int var5;
        boolean decompiledFrameCompleted0 = true;
        var6 = TetraLink.field_J;
        if (this.field_N.f()) {
          var2 = this.field_R * this.field_N.field_f / nk.field_k;
          while (true) {
            var3 = (long)param0 * (long)var2 + this.field_D;
            if (this.field_C - var3 >= 0L) {
              this.field_D = var3;
              break;
            }
            var5 = (int)((-1L + (long)var2 + this.field_C - this.field_D) / (long)var2);
            this.field_D = this.field_D + (long)var5 * (long)var2;
            this.field_y.a(var5);
            param0 = param0 - var5;
            this.b((byte) 110);
            if (this.field_N.f()) {
              continue;
            }
            this.field_y.a(param0);
            decompiledFrameCompleted0 = false;
            break;
          }
        }
        if (decompiledFrameCompleted0) {
          this.field_y.a(param0);
        }

    }

    final synchronized void a(int param0, int param1, byte param2) {
        if (param2 >= -95) {
          this.a((byte) 8, 116, 107);
        }
        this.a(param0, -121, param1);
    }

    public static void c(byte param0) {
        field_O = null;
        int var1 = -46 % ((54 - param0) / 62);
    }

    private final void a(byte param0, int param1, int param2) {
        if (param0 != -62) {
          this.d(96);
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = TetraLink.field_J;
        if (param2 <= 54) {
          return;
        }
        if (param1 >= 0) {
          this.field_w[param1] = param0;
        } else {
          for (var4 = 0; 16 > var4; var4++) {
            this.field_w[var4] = param0;
          }
        }
    }

    private final synchronized void a(int param0, boolean param1) {
        if (param0 != 487759088) {
          ah var4 = (ah) null;
          this.a((fa) null, (ri) null, (ah) null, -13, -73);
        }
        this.field_N.d();
        this.field_z = null;
        this.a(param1, (byte) 39);
    }

    final synchronized boolean d(byte param0) {
        int var2 = -65 / ((14 - param0) / 33);
        return this.field_N.f();
    }

    final boolean b(byte param0, oc param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 94) {
            field_s = -84;
          }
          if (null != param1.field_I) {
            return false;
          }
          if (param1.field_v >= 0) {
            param1.b(false);
            if (param1.field_C > 0 &&
              param1 == this.field_J[param1.field_n][param1.field_C]) {
              this.field_J[param1.field_n][param1.field_C] = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("g.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final synchronized int a() {
        return 0;
    }

    private final void f(int param0, int param1, int param2) {
        this.field_L[param0] = param2;
        if (param1 != 13242) {
          return;
        }
        this.field_T[param0] = (int)(0.5 + 2097152.0 * Math.pow(2.0, (double)param2 * 0.00054931640625));
    }

    final static void a(String[] args, String param1, int param2, byte param3) {
        String[] var4 = null;
        int var5 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = TetraLink.field_J;
        try {
          if (param3 != 3) {
            field_O = (String) null;
          }
          pi.field_a = ik.field_d;
          if (param2 != 255) {
            if (param2 >= 100 &&
              105 >= param2) {
              var4 = args;
              ia.a(var4, 10532);
              pm.field_f = ng.a((byte) -67, args);
              return;
            }
            pm.field_f = hj.a(param1, param2, false);
          } else {
            stackIn_7_0 = !(13 <= wh.field_k);
            pm.field_f = al.a(stackIn_7_0, 1);
            ia.a((String[]) null, param3 ^ 10535);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("g.H(");
          if (args == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        this.field_H[param0] = param2;
        this.field_M[param0] = pl.a(param2, -128);
        if (param1 >= -70) {
          this.a((byte) -28, 93);
        }
        this.c(param2, -2, param0);
    }

    final static void a(int param0, byte param1, int param2) {
        el var6 = null;
        el var7 = null;
        bc var4 = null;
        if (param2 != nd.field_Nb) {
          var6 = (el) (db.field_e.a((long)nd.field_Nb, 1));
          var7 = var6;
          if (var7 != null) {
            var7.field_fc = null;
          }
          nd.field_Nb = param2;
          var4 = nd.field_Lb;
          var4.f(param0, (byte) -92);
          var4.a(3, false);
          var4.a(11, false);
          var4.b(param2, false);
        }
        if (param1 > -113) {
          g.c((byte) -93);
        }
    }

    final static void e(int param0, int param1, int param2) {
        bc var3 = nd.field_Lb;
        var3.f(param2, (byte) -92);
        var3.a(3, false);
        var3.a(9, false);
        var3.b(param0, false);
        if (param1 > -122) {
          g.a(39, (byte) -68, -123);
        }
    }

    private final void b(byte param0, int param1) {
        oc var3;
        int var4;
        int var5;
        var5 = TetraLink.field_J;
        var4 = -66 / ((9 - param0) / 45);
        var3 = (oc) (this.field_y.field_u.c(false));
        while (var3 != null) {
          if (param1 < 0 ||
            var3.field_n == param1) {
            if (var3.field_I != null) {
              var3.field_I.g(nk.field_k / 100);
              if (var3.field_I.g()) {
                this.field_y.field_s.a(var3.field_I);
              }
              var3.a(77);
            }
            if (0 > var3.field_v) {
              this.field_B[var3.field_n][var3.field_E] = null;
            }
            var3.b(false);
          }
          var3 = (oc) (this.field_y.field_u.a((byte) -70));
        }
    }

    final synchronized void a(boolean param0, ri param1, byte param2) {
        try {
          this.a(param1, 0, true, param0);
          if (param2 <= 1) {
            this.field_W = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "g.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final synchronized eb c() {
        return null;
    }

    private final void a(int param0, byte param1) {
        int var3;
        oc var4;
        int var5;
        var5 = TetraLink.field_J;
        var3 = -107 / ((param1 + 65) / 51);
        if ((2 & this.field_I[param0]) != 0) {
          var4 = (oc) (this.field_y.field_u.c(false));
          while (var4 != null) {
            if (~var4.field_n == ~param0) {
              if (this.field_B[param0][var4.field_E] != null) {
                var4 = (oc) (this.field_y.field_u.a((byte) -70));
                continue;
              }
              if (var4.field_v < 0) {
                var4.field_v = 0;
              }
            }
            var4 = (oc) (this.field_y.field_u.a((byte) -70));
          }
        }
    }

    final synchronized void e(byte param0) {
        int var3 = TetraLink.field_J;
        if (param0 < 111) {
          this.a();
        }
        ng var4 = (ng) (this.field_A.b(84));
        while (var4 != null) {
          var4.b((byte) -118);
          var4 = (ng) (this.field_A.a(-1));
        }
    }

    final synchronized eb b() {
        return (eb) ((Object) this.field_y);
    }

    private final void a(int param0, int param1, int param2, int param3) {
        boolean stackIn_17_1 = false;
        oc stackIn_17_2 = null;
        Object stackIn_18_0;
        boolean stackIn_18_3;
        oc var5;
        int var6_int;
        wf var6;
        oc var7;
        oc var8;
        int var9;
        ng var10;
        ng var11;
        var9 = TetraLink.field_J;
        this.a(param0, (byte) 77, param3, 64);
        if ((this.field_I[param3] & 2) != 0) {
          var5 = (oc) (this.field_y.field_u.d(true));
          while (var5 != null) {
            if (param3 == var5.field_n &&
              var5.field_v < 0) {
              this.field_B[param3][var5.field_E] = null;
              this.field_B[param3][param0] = var5;
              var6_int = (var5.field_D * var5.field_u >> 12) + var5.field_x;
              var5.field_x = var5.field_x + (-var5.field_E + param0 << 8);
              var5.field_E = param0;
              var5.field_D = 4096;
              var5.field_u = -var5.field_x + var6_int;
              return;
            }
            var5 = (oc) (this.field_y.field_u.d((byte) 14));
          }
        }
        var10 = (ng) (this.field_A.a((long)this.field_E[param3], (byte) -43));
        var11 = var10;
        if (var11 == null) {
          return;
        }
        var6 = var10.field_z[param0];
        if (var6 == null) {
          return;
        }
        var7 = new oc();
        var7.field_B = var11;
        var7.field_y = var6;
        var7.field_n = param3;
        var7.field_q = var10.field_v[param0];
        if (param2 != -25798) {
          this.c(-115, -32);
        }
        var7.field_C = var10.field_p[param0];
        var7.field_E = param0;
        var7.field_J = var10.field_A[param0] * (var11.field_C * param1 * param1) + 1024 >> 11;
        var7.field_r = 255 & var10.field_w[param0];
        var7.field_x = (param0 << 8) - (32767 & var10.field_o[param0]);
        var7.field_A = 0;
        var7.field_o = 0;
        var7.field_v = -1;
        var7.field_G = 0;
        var7.field_t = 0;
        if (this.field_G[param3] != 0) {
          var7.field_I = ee.a(var6, this.a(-18511, var7), 0, this.a((byte) 24, var7));
          stackIn_17_1 = false;
          stackIn_17_2 = var7;
          if (var11.field_o[param0] >= 0) {
            stackIn_18_0 = this;
            stackIn_18_3 = false;
          } else {
            stackIn_18_0 = this;
            stackIn_18_3 = true;
          }
          this.a(stackIn_17_1, stackIn_17_2, stackIn_18_3);
        } else {
          var7.field_I = ee.a(var6, this.a(-18511, var7), this.a(var7, 16402), this.a((byte) 87, var7));
        }
        if (var11.field_o[param0] < 0) {
          var7.field_I.c(-1);
        }
        if (0 <= var7.field_C) {
          var8 = this.field_J[param3][var7.field_C];
          if (var8 != null &&
            var8.field_v < 0) {
            this.field_B[param3][var8.field_E] = null;
            var8.field_v = 0;
          }
          this.field_J[param3][var7.field_C] = var7;
        }
        this.field_y.field_u.a(var7, false);
        this.field_B[param3][param0] = var7;
        return;
    }

    final synchronized void a(byte param0, int param1) {
        int var3 = 97 / ((param0 - 45) / 38);
        this.field_X = param1;
    }

    private final void d(int param0, int param1, int param2) {
        if (param0 != -27508) {
          return;
        }
        this.field_Q[param1] = param2;
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        if (param0) {
          this.field_Y = -94;
        }
    }

    final boolean a(int param0, int[] param1, int param2, oc param3, int param4) {
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        lm var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_34_0Lifetime1;
        int stackIn_34_1Lifetime1;
        int stackIn_53_0Lifetime1;
        int stackIn_53_1Lifetime1;
        var11 = TetraLink.field_J;
        try {
          param3.field_s = nk.field_k / 100;
          if (0 <= param3.field_v && (null == param3.field_I ||
            param3.field_I.l())) {
            param3.a(-121);
            param3.b(false);
            if (param3.field_C > 0) {
              if (this.field_J[param3.field_n][param3.field_C] != param3) {
                return true;
              }
              this.field_J[param3.field_n][param3.field_C] = null;
            }
            return true;
          }
          var6_int = param3.field_D;
          if (var6_int > 0) {
            var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_V[param3.field_n]));
            if (var6_int < 0) {
              var6_int = 0;
            }
            param3.field_D = var6_int;
          }
          param3.field_I.d(this.a(-18511, param3));
          if (param4 != 21107) {
            this.field_G = (int[]) null;
          }
          var7 = param3.field_q;
          param3.field_p = param3.field_p + var7.field_k;
          param3.field_H = param3.field_H + 1;
          var8 = 0;
          var9 = 0.000005086263020833333 * (double)((param3.field_E - 60 << 8) + (param3.field_D * param3.field_u >> 12));
          if (0 < var7.field_a) {
            if (var7.field_i <= 0) {
              param3.field_t = param3.field_t + 128;
            } else {
              param3.field_t = param3.field_t + (int)(Math.pow(2.0, (double)var7.field_i * var9) * 128.0 + 0.5);
            }
            if (param3.field_t * var7.field_a >= 819200) {
              var8 = 1;
            }
          }
          if (var7.field_d != null) {
            if (var7.field_b > 0) {
              param3.field_o = param3.field_o + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_b));
            } else {
              param3.field_o = param3.field_o + 128;
            }
            while (true) {
              if (var7.field_d.length - 2 > param3.field_G) {
                stackIn_34_0 = ~param3.field_o;
                stackIn_34_1 = ~((255 & var7.field_d[2 + param3.field_G]) << 8);
                if (stackIn_34_0 < stackIn_34_1) {
                  param3.field_G = param3.field_G + 2;
                  continue;
                }
              }
              stackIn_34_0Lifetime1 = var7.field_d.length - 2;
              stackIn_34_1Lifetime1 = param3.field_G;
              if (stackIn_34_0Lifetime1 != stackIn_34_1Lifetime1) {
                break;
              }
              if (var7.field_d[param3.field_G + 1] != 0) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (0 <= param3.field_v &&
            var7.field_e != null &&
            (this.field_I[param3.field_n] & 1) == 0 && (!(param3.field_C >= 0) ||
            this.field_J[param3.field_n][param3.field_C] != param3)) {
            if (var7.field_j > 0) {
              param3.field_v = param3.field_v + (int)(128.0 * Math.pow(2.0, (double)var7.field_j * var9) + 0.5);
            } else {
              param3.field_v = param3.field_v + 128;
            }
            while (true) {
              if ((-2 + var7.field_e.length) > param3.field_A) {
                stackIn_53_0 = var7.field_e[param3.field_A + 2] << 8 & 65280;
                stackIn_53_1 = param3.field_v;
                if (stackIn_53_0 < stackIn_53_1) {
                  param3.field_A = param3.field_A + 2;
                  continue;
                }
              }
              stackIn_53_0Lifetime1 = param3.field_A;
              stackIn_53_1Lifetime1 = var7.field_e.length - 2;
              if (stackIn_53_0Lifetime1 != stackIn_53_1Lifetime1) {
                break;
              }
              var8 = 1;
              break;
            }
          }
          if (var8 == 0) {
            param3.field_I.a(param3.field_s, this.a(param3, 16402), this.a((byte) -118, param3));
            return false;
          }
          param3.field_I.g(param3.field_s);
          if (param1 != null) {
            param3.field_I.b(param1, param0, param2);
          } else {
            param3.field_I.a(param2);
          }
          if (param3.field_I.g()) {
            this.field_y.field_s.a(param3.field_I);
          }
          param3.a(59);
          if (param3.field_v >= 0) {
            param3.b(false);
            if (param3.field_C > 0 &&
              this.field_J[param3.field_n][param3.field_C] == param3) {
              this.field_J[param3.field_n][param3.field_C] = null;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_73_0 = var6;
          stackIn_73_1 = new StringBuilder().append("g.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void d(int param0, int param1) {
        int var4;
        var4 = TetraLink.field_J;
        if (0 > param0) {
          for (param0 = 0; param0 < 16; param0++) {
            this.d(param0, 16384);
          }
        } else {
          if (param1 != 16384) {
            this.b((byte) -88, 32);
          }
          this.field_u[param0] = 12800;
          this.field_r[param0] = 8192;
          this.field_W[param0] = 16383;
          this.field_Q[param0] = 8192;
          this.field_t[param0] = 0;
          this.field_V[param0] = 8192;
          this.a(param0, (byte) 94);
          this.b(param0, -52);
          this.field_I[param0] = 0;
          this.field_v[param0] = 32767;
          this.field_K[param0] = 256;
          this.field_G[param0] = 0;
          this.f(param0, param1 - 3142, 8192);
        }
    }

    private final synchronized void a(ri param0, int param1, boolean param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = TetraLink.field_J;
        try {
          this.a(487759088, param2);
          this.field_N.a(param0.field_o);
          this.field_x = param3 ? true : false;
          this.field_D = (long)param1;
          var5_int = this.field_N.e();
          for (var6 = 0; var5_int > var6; var6++) {
            this.field_N.f(var6);
            this.field_N.e(var6);
            this.field_N.b(var6);
          }
          this.field_Y = this.field_N.g();
          this.field_S = this.field_N.field_g[this.field_Y];
          this.field_C = this.field_N.d(this.field_S);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "g.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = TetraLink.field_J;
        if (~param0 != ~this.field_E[param2]) {
          this.field_E[param2] = param0;
          for (var4 = 0; var4 < 128; var4++) {
            this.field_J[param2][var4] = null;
          }
        }
        if (param1 != -2) {
          this.b(-10, -14);
        }
    }

    private final int a(int param0, oc param1) {
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        lm var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var5Lifetime1;
        try {
          var3_int = (param1.field_D * param1.field_u >> 12) + param1.field_x;
          var3_int = var3_int + (this.field_K[param1.field_n] * (-8192 + this.field_Q[param1.field_n]) >> 12);
          var4 = param1.field_q;
          if (var4.field_k > 0 && (!(var4.field_c <= 0) ||
            this.field_t[param1.field_n] > 0)) {
            var5 = var4.field_c << 2;
            var6 = var4.field_h << 1;
            if (param1.field_H < var6) {
              var5 = var5 * param1.field_H / var6;
            }
            var5 = var5 + (this.field_t[param1.field_n] >> 7);
            var7 = Math.sin((double)(param1.field_p & 511) * 0.01227184630308513);
            var3_int = var3_int + (int)(var7 * (double)var5);
          }
          var5Lifetime1 = (int)(0.5 + (double)(param1.field_y.field_o * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)nk.field_k);
          if (param0 != -18511) {
            this.field_v = (int[]) null;
          }
          stackIn_13_0 = (var5Lifetime1 < 1) ? 1 : var5Lifetime1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("g.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final synchronized boolean a(fa param0, ri param1, ah param2, int param3, int param4) {
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
        ch var8 = null;
        int var9 = 0;
        int var11 = 0;
        ng var12 = null;
        ng var13 = null;
        var11 = TetraLink.field_J;
        try {
          param1.a();
          var6_int = 1;
          var7 = null;
          if (param3 > ~param4) {
            var7 = new int[]{param4};
          }
          var8 = (ch) (param1.field_n.b(43));
          while (var8 != null) {
            boolean decompiledFrameRemainder0 = true;
            var9 = (int)var8.field_c;
            var12 = (ng) (this.field_A.a((long)var9, (byte) -43));
            if (var12 == null) {
              var13 = go.a(true, var9, param2);
              if (var13 == null) {
                var6_int = 0;
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_A.a((long)var9, -53, var13);
                decompiledFrameRemainder0 = !(var13.a((int[]) (var7), param0, (byte) -114, var8.field_p));
              }
            } else {
              decompiledFrameRemainder0 = !(var12.a((int[]) (var7), param0, (byte) -114, var8.field_p));
            }
            if (decompiledFrameRemainder0) {
              var6_int = 0;
            }
            var8 = (ch) (param1.field_n.a(-1));
          }
          if (var6_int != 0) {
            param1.b();
          }
          stackIn_19_0 = var6_int;
          return stackIn_19_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("g.SA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
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
          throw oi.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TetraLink.field_J;
        try {
          var2_int = param1.length();
          var3 = 0;
          if (param0 != -1) {
            field_s = 79;
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            var3 = rh.a(param1.charAt(var4), false) + (var3 << 5) - var3;
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("g.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final synchronized void d(int param0) {
        if (param0 <= 18) {
          String var3 = (String) null;
          g.a((String[]) null, (String) null, -80, (byte) 37);
        }
        this.a(487759088, true);
    }

    final synchronized void c(int param0, int param1) {
        this.field_R = param0;
        if (param1 > -9) {
          this.field_E = (int[]) null;
        }
    }

    private final void a(boolean param0, byte param1) {
        int var4 = TetraLink.field_J;
        int var3Lifetime1;
        if (param0) {
          this.b((byte) -100, -1);
        } else {
          this.e(-1, -120);
        }
        this.d(-1, 16384);
        int var3 = 0;
        if (param1 < 9) {
          this.a(-128, 56, -103, 34);
        }
        while (var3 < 16) {
          this.field_E[var3] = this.field_H[var3];
          var3++;
        }
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < 16) {
          this.field_M[var5] = pl.a(this.field_H[var5], -128);
          var5++;
        }
    }

    final void a(boolean param0, oc param1, boolean param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ri var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param1.field_y.field_s.length;
          if (param0) {
            var7 = (ri) null;
            this.a((ri) null, 123, false, false);
          }
          if (param2 &&
            param1.field_y.field_p) {
            var6 = -param1.field_y.field_q + var4_int + var4_int;
            var4_int = var4_int << 8;
            var5 = (int)((long)var6 * (long)this.field_G[param1.field_n] >> 6);
            if (var5 >= var4_int) {
              param1.field_I.a(true);
              var5 = -1 + var4_int + var4_int - var5;
            }
          } else {
            var5 = (int)((long)this.field_G[param1.field_n] * (long)var4_int >> 6);
          }
          param1.field_I.e(var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("g.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void e(int param0, int param1) {
        int var4 = TetraLink.field_J;
        if (param1 >= -12) {
          this.field_M = (int[]) null;
        }
        oc var3 = (oc) (this.field_y.field_u.c(false));
        while (var3 != null) {
          if ((param0 < 0 || ~param0 == ~var3.field_n) &&
            !(0 <= var3.field_v)) {
            this.field_B[var3.field_n][var3.field_E] = null;
            var3.field_v = 0;
          }
          var3 = (oc) (this.field_y.field_u.a((byte) -70));
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        long var5 = 0L;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var7 = 0;
        var8 = TetraLink.field_J;
        try {
          if (this.field_N.f()) {
            var4_int = this.field_R * this.field_N.field_f / nk.field_k;
            while (true) {
              var5 = this.field_D + (long)param2 * (long)var4_int;
              if (-var5 + this.field_C >= 0L) {
                this.field_D = var5;
              } else {
                var7 = (int)((-1L + ((long)var4_int + this.field_C - this.field_D)) / (long)var4_int);
                this.field_D = this.field_D + (long)var4_int * (long)var7;
                this.field_y.b(param0, param1, var7);
                param1 = param1 + var7;
                param2 = param2 - var7;
                this.b((byte) 111);
                if (this.field_N.f()) {
                  continue;
                }
              }
              break;
            }
            this.field_y.b(param0, param1, param2);
            return;
          }
          this.field_y.b(param0, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("g.BA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        oc var6 = null;
        int var7 = TetraLink.field_J;
        oc var8 = this.field_B[param2][param0];
        if (var8 == null) {
          return;
        }
        if (param1 != 77) {
          field_O = (String) null;
        }
        this.field_B[param2][param0] = null;
        if ((this.field_I[param2] & 2) == 0) {
          var8.field_v = 0;
        } else {
          var6 = (oc) (this.field_y.field_u.c(false));
          while (var6 != null) {
            if (var6.field_n == var8.field_n &&
              0 > var6.field_v &&
              var8 != var6) {
              var8.field_v = 0;
              break;
            }
            var6 = (oc) (this.field_y.field_u.a((byte) -70));
          }
        }
    }

    public g() {
        this.field_r = new int[16];
        this.field_I = new int[16];
        this.field_R = 1000000;
        this.field_t = new int[16];
        this.field_X = 256;
        this.field_M = new int[16];
        this.field_K = new int[16];
        this.field_u = new int[16];
        this.field_H = new int[16];
        this.field_J = new oc[16][128];
        this.field_V = new int[16];
        this.field_B = new oc[16][128];
        this.field_v = new int[16];
        this.field_E = new int[16];
        this.field_T = new int[16];
        this.field_Q = new int[16];
        this.field_L = new int[16];
        this.field_G = new int[16];
        this.field_w = new int[16];
        this.field_W = new int[16];
        this.field_N = new wj();
        this.field_y = new wn(this);
        this.field_A = new dj(128);
        this.b(256, -1, 61);
        this.a(true, (byte) 49);
    }

    static {
        field_s = 1;
    }
}
