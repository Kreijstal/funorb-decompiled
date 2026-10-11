/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aia extends vg {
    private int field_i;
    private int field_w;
    private int field_g;
    private int field_u;
    private int field_m;
    static String field_j;
    static String field_v;
    private boolean field_l;
    static int[] field_t;
    private int field_r;
    private int field_s;
    private int field_n;
    private int field_f;
    private int field_h;
    private int field_p;
    private int field_q;
    private int field_k;
    private int field_o;

    final void a(int param0, int param1, int param2, byte param3) {
        this.field_i = 0;
        int var5 = -52 % ((param3 - 44) / 36);
        this.field_k = 0;
    }

    final int f(int param0) {
        if (param0 != 0) {
          this.field_l = true;
        }
        return this.field_r;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, fsa param5, la param6) {
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        qea var17 = null;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_k > 0) {
            this.field_k = this.field_k - 1;
            return;
          }
          var17 = param6.q(57);
          if (param6.a(-1553494544).f(8, 10915)) {
            this.field_o = 100 + var17.a(50, 0);
          }
          var9 = this.a(0) ? 1 : 0;
          var10 = this.h(21302) ? 1 : 0;
          if (param4 > -55) {
            this.g(-9);
          }
          var11 = 0;
          if (var9 == 0 &&
            var10 == 0 &&
            var17.a(500, 0) == 0) {
            var11 = 1;
          }
          if (this.field_h > 0) {
            this.field_h = this.field_h - 1;
            if (this.field_h == 0) {
              var11 = 1;
              if (0 < this.field_i) {
                this.field_o = this.field_i;
                this.field_i = 0;
              }
            }
          }
          if (var11 != 0 &&
            !this.field_l) {
            this.field_p = 0;
            this.field_s = 0;
            if (var10 == 0 &&
              var9 == 0) {
              this.a(param6, -92);
            }
            return;
          }
          if (this.field_l) {
            var12 = 65536;
            this.field_s = var12 * ne.field_f[this.field_f][0];
            this.field_p = var12 * ne.field_f[this.field_f][1];
          }
          if (0 == this.field_s &&
            0 == this.field_p) {
            if (var9 == 0) {
              var13 = var17.a(8, 0);
              var12Lifetime1 = var17.a(32768, 0) + 32768;
            } else {
              var12Lifetime1 = 196608;
              var13 = var17.a(8, 0);
            }
            this.field_f = var13;
            this.field_s = var12Lifetime1 * ne.field_f[this.field_f][0];
            this.field_p = ne.field_f[this.field_f][1] * var12Lifetime1;
            if (0 < this.field_i) {
              if (this.field_s != 0 &&
                lw.a(this.field_s, (byte) -87) == lw.a(-this.field_n + this.field_u, (byte) -87)) {
                this.field_s = -this.field_s;
                this.field_f = sw.a(this.field_f, 6);
              }
              if (this.field_p != 0 &&
                lw.a(this.field_p, (byte) -95) == lw.a(this.field_m - this.field_r, (byte) -93)) {
                this.field_p = -this.field_p;
                this.field_f = ona.b(0, this.field_f);
              }
            }
            if (0 != this.field_s &&
              this.field_p != 0) {
              this.field_s = 180 * (this.field_s >> 8);
              this.field_p = 180 * (this.field_p >> 8);
            }
            this.field_h = var17.a(75, 0) + 25;
          }
          if (0 < this.field_i) {
            this.field_i = this.field_i - 1;
          }
          var12Lifetime2 = this.field_n;
          this.field_n = this.field_n + this.field_s;
          var13Lifetime1 = this.field_r;
          this.field_r = this.field_r + this.field_p;
          var14 = (-this.field_q + param1) / 2;
          if (-var14 > this.field_n) {
            this.field_n = -var14;
            this.field_h = 1;
          }
          var15 = (-this.field_q + param2) / 2;
          if (var14 < this.field_n) {
            this.field_h = 1;
            this.field_n = var14;
          }
          if (-var15 > this.field_r) {
            this.field_r = -var15;
            this.field_h = 1;
          }
          if (this.field_r > var15) {
            this.field_h = 1;
            this.field_r = var15;
          }
          if (var12Lifetime2 == this.field_n &&
            this.field_r == var13Lifetime1) {
            return;
          }
          if (param6.a((ffa) null, this.field_q, 2, 1, param3 + this.field_r, param0 + this.field_n, false, param5, this.field_q)) {
            this.field_o = this.field_o + 2;
            this.field_o = et.b(75, this.field_o, 125);
            if (this.h(21302)) {
              this.field_n = (this.field_n - var12Lifetime2) / 4 + var12Lifetime2;
              this.field_r = var13Lifetime1 + (-var13Lifetime1 + this.field_r) / 4;
            } else {
              this.field_p = 0;
              this.field_n = var12Lifetime2;
              this.field_r = var13Lifetime1;
              this.field_s = 0;
            }
          } else {
            if (this.field_o > 0) {
              this.field_o = this.field_o - 1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_79_0 = var8;
          stackIn_79_1 = new StringBuilder().append("aia.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_82_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',');
          if (param6 == null) {
            stackIn_83_2 = "null";
          } else {
            stackIn_83_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_82_1).append(stackIn_83_2).append(')').toString());
        }
    }

    final int g(int param0) {
        if (param0 != 0) {
          return -7;
        }
        return this.field_q;
    }

    final void c(int param0) {
        int var2 = -1 / ((param0 - 75) / 51);
        this.field_s = -this.field_s;
        this.field_n = -this.field_n;
        this.field_u = -this.field_u;
        this.field_f = sw.a(this.field_f, 6);
    }

    final void a(int param0, boolean param1, int param2, int param3, hca param4) {
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var7Lifetime1;
        try {
          if (param4.q(122)) {
            return;
          }
          if (param4.k((byte) -127) <= 0) {
            this.field_w = this.field_w + 1;
            if (this.field_w > 20) {
              this.field_g = 0;
            }
          } else {
            this.field_w = 0;
            this.field_g = this.field_g + 1;
          }
          stackIn_9_0 = (param4.g(false) < 196608) ? 0 : 1;
          var6_int = stackIn_9_0;
          if (param1) {
            stackIn_13_0 = (15 > this.field_g) ? 0 : 1;
            var7 = stackIn_13_0;
            if (this.a(-196609, param4, param2, param3) &&
              var6_int != 0 &&
              var7 != 0) {
              param4.a(2, (byte) 97, 7);
            }
          }
          this.field_l = false;
          if (!this.a(0) &&
            !this.h(21302) &&
            var6_int != 0 &&
            param1 &&
            0 < this.field_g) {
            var7Lifetime1 = param3 + this.field_n;
            var8 = this.field_r + param2;
            var9 = -var7Lifetime1 + param4.d(3);
            var10 = -var8 + param4.e(9648);
            this.field_f = uqa.a(var9, var10, -111);
            this.field_l = true;
          }
          if (param0 <= 98) {
            this.d(5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_29_0 = var6;
          stackIn_29_1 = new StringBuilder().append("aia.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static int e(int param0) {
        if (null == baa.field_d.field_i) {
          kh.a(true, ska.field_r, kva.field_s);
          return 4;
        }
        if (kra.field_a == baa.field_d.field_i.field_b) {
          return 0;
        }
        if (nj.field_t == baa.field_d.field_i.field_b) {
          return 2;
        }
        if (baa.field_d.field_i.field_b == paa.field_z) {
          return 1;
        }
        if (baa.field_d.field_i.field_b == vea.field_c) {
          return 3;
        }
        if (baa.field_d.field_i.field_b == laa.field_x) {
          return 4;
        }
        if (param0 != 5) {
          byte[] var2 = (byte[]) null;
          aia.a((byte[]) null, 116, 108, 51);
        }
        if (daa.field_d != baa.field_d.field_i.field_b) {
          return -1;
        }
        return 5;
    }

    final int a(byte param0) {
        if (param0 < 32) {
          this.field_q = 85;
        }
        return this.field_n;
    }

    private final boolean h(int param0) {
        if (param0 != 21302) {
          this.field_m = 121;
        }
        return 20 < this.field_o ? true : false;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        if (!param3) {
          la var6 = (la) null;
          this.a(-51, -111, -16, -86, (byte) -10, (fsa) null, (la) null);
        }
        this.field_p = 0;
        if (0 == this.field_i) {
          this.field_s = 0;
        }
        this.field_i = 200;
        this.field_k = 0;
        this.field_u = param0;
        this.field_m = param2;
    }

    public static void i(int param0) {
        field_v = null;
        field_t = null;
        int var1 = 12 % ((-7 - param0) / 47);
        field_j = null;
    }

    final int d(int param0) {
        if (param0 != 2) {
          this.field_u = 118;
        }
        return this.field_f;
    }

    final static int a(byte[] param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5Lifetime1;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = -1;
          for (var5 = param3; param1 > var5; var5++) {
            var4_int = coa.field_q[(var4_int ^ param0[var5]) & 255] ^ var4_int >>> 8;
          }
          var5Lifetime1 = -75 % ((param2 + 33) / 55);
          var4_int = ~var4_int;
          stackIn_5_0 = var4_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("aia.N(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(int param0, hca param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -196609) {
            this.field_r = 31;
          }
          stackIn_3_0 = io.a(param1.c(-28) / 2, this.field_r + param2, (byte) -63, param1.a((byte) 55) / 2, this.field_n + param3, param1.e(9648), this.field_q / 2, this.field_q / 2, param1.d(3));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("aia.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(la param0, int param1) {
        try {
          if (param1 > -72) {
            this.g(-8);
          }
          this.field_k = 50 + param0.q(-120).a(50, 0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "aia.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0) {
        if (param0 != 0) {
          this.g(-80);
        }
        return 0 < this.field_i ? true : false;
    }

    final boolean b(int param0) {
        if (param0 != 180) {
          hca var3 = (hca) null;
          this.a(79, false, 55, 0, (hca) null);
        }
        return 0 < this.field_k ? true : false;
    }

    aia(int param0, int param1, int param2) {
        this.field_n = param0;
        this.field_q = param2;
        this.field_r = param1;
    }

    static {
        field_t = new int[16384];
        field_v = "You are not currently logged in to the<nbsp>game.";
    }
}
