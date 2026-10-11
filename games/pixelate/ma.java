/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends bg {
    static pd field_z;
    private int field_x;
    private int field_v;
    private int field_A;
    private boolean field_w;
    static jl field_y;
    private int field_r;
    static bb field_o;
    private int field_m;
    private int field_s;
    private int[] field_t;
    private int field_n;
    private int field_q;
    private int field_u;
    private int field_p;

    final static void d(byte param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        rl var4_ref_rl = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        rl var17 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        rl var17Lifetime1;
        rl var17Lifetime2;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Pixelate.field_H ? 1 : 0;
        try {
          bg.field_a = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = ck.field_b.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var1_int > var3; var3++) {
            var4_ref_rl = ck.field_b[var3];
            var17 = var4_ref_rl;
            var17Lifetime2 = var4_ref_rl;
            var4_ref_rl.a((byte) -17);
            g.a(var3, 67);
            var5 = var4_ref_rl.field_c + var4_ref_rl.field_b >> 1;
            var6 = var4_ref_rl.field_F + var4_ref_rl.field_t >> 1;
            var7 = var4_ref_rl.field_g + var4_ref_rl.field_x >> 1;
            var8 = bg.field_a[9] >> 2;
            var9 = bg.field_a[10] >> 2;
            var10_int = bg.field_a[11] >> 2;
            var11 = var8 * oe.field_Hb[3] + (var9 * oe.field_Hb[4] + var10_int * oe.field_Hb[5]) >> 14;
            var12 = var9 * oe.field_Hb[7] + var8 * oe.field_Hb[6] + oe.field_Hb[8] * var10_int >> 14;
            var13 = var10_int * oe.field_Hb[11] + var9 * oe.field_Hb[10] + var8 * oe.field_Hb[9] >> 14;
            var2[var3] = var13 * var7 + var11 * var5 + var12 * var6 >> 16;
          }
          if (param0 != 106) {
            field_z = (pd) null;
          }
          var3Lifetime1 = bg.field_a[9] >> 8;
          var4 = bg.field_a[10] >> 8;
          var5Lifetime1 = bg.field_a[11] >> 8;
          var6Lifetime1 = ga.field_f << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = mi.d(-4096, var6Lifetime1) >> 8;
          var9Lifetime1 = th.a(var6Lifetime1, param0 + 8085) >> 8;
          if (uf.field_d != -1 &&
            -1 != bg.field_k) {
            var9Lifetime1 = -128;
            var8Lifetime1 = -bg.field_k + 240;
            var7Lifetime1 = -320 + uf.field_d;
          }
          var10 = 256.0 / Math.sqrt((double)(var9Lifetime1 * var9Lifetime1 + var7Lifetime1 * var7Lifetime1 + var8Lifetime1 * var8Lifetime1));
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = -var4 + var8Lifetime1;
          var14 = var9Lifetime1 - var5Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var12Lifetime1 * var12Lifetime1 + var13Lifetime1 * var13Lifetime1 + var14 * var14));
          var14 = (int)((double)var14 * var10Lifetime1);
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          for (var15 = 0; var15 < ck.field_b.length; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < ck.field_b.length; var17_int++) {
              if (var21[var17_int] > var21[var16]) {
                var16 = var17_int;
              }
            }
            var21[var16] = -2147483648;
            var17Lifetime1 = ck.field_b[var16];
            g.a(var16, 100);
            for (var18 = 0; var18 < 3; var18++) {
              oe.field_Hb[var18] = oe.field_Hb[var18] + wc.field_p[var15][var18];
            }
            qm.a(var17Lifetime1, bg.field_a, false, oe.field_Hb, (byte) 98, true, false);
            uk.a(var14, var17Lifetime1, var12Lifetime1, var9Lifetime1, var8Lifetime1, var13Lifetime1, 20126, var7Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "ma.B(" + param0 + ')');
        }
    }

    public static void c(byte param0) {
        if (param0 > -95) {
          return;
        }
        field_y = null;
        field_z = null;
        field_o = null;
    }

    ma(int[] param0, boolean param1, int param2) {
        this(param0, param1, 615, 435 - param2);
    }

    final static boolean a(boolean param0) {
        long var1;
        long var3;
        int var5;
        int var6;
        var6 = Pixelate.field_H ? 1 : 0;
        var1 = hm.a(64);
        if (!param0) {
          ma.a(true);
        }
        var3 = -io.field_d + var1;
        if (30000L < var3) {
          io.field_d = var1;
          on.field_ob = 0;
          return true;
        }
        var5 = 3000;
        if (on.field_ob >= 7) {
          var5 = 12000;
        } else {
          if (on.field_ob >= 5) {
            var5 = 9000;
          } else {
            if (on.field_ob >= 3) {
              var5 = 6000;
            }
          }
        }
        if (var3 <= (long)var5) {
          return false;
        }
        on.field_ob = on.field_ob + 1;
        io.field_d = var1;
        return true;
    }

    final static void a(byte param0, long param1) {
        try {
          try {
            Thread.sleep(param1);
          } catch (InterruptedException interruptedException) {
          }
          if (param0 != 37) {
            field_o = (bb) null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean e(byte param0) {
        if (param0 != 37) {
          return true;
        }
        return to.field_s;
    }

    final void c(int param0) {
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int[] stackIn_22_0 = null;
        int var2;
        int var3;
        int var4;
        int[] var6;
        int var7;
        int var8;
        int[] var9;
        int[] var10;
        int var3Lifetime1;
        int var7Lifetime1;
        var8 = Pixelate.field_H ? 1 : 0;
        var2 = (this.field_v << 1) + (this.field_n >> 1);
        if (var2 < 0) {
          var2 = 0;
        }
        if (gd.field_h.length <= var2) {
          var2 = -1 + gd.field_h.length;
        }
        this.a(65, var2, this.field_m, this.field_n);
        t.f(320, this.field_m + 3, 19, 0, 128);
        t.f(321, 4 + this.field_m, 18, 16777215, 128);
        if (this.field_v != this.field_A) {
          if (this.field_A <= this.field_v) {
            stackIn_11_0 = this.field_A;
          } else {
            stackIn_11_0 = this.field_v;
          }
          var3 = stackIn_11_0;
          if (this.field_A > this.field_v) {
            stackIn_14_0 = this.field_A;
          } else {
            stackIn_14_0 = this.field_v;
          }
          var4 = stackIn_14_0;
          for (var5 = var3; var4 > var5; var5 += 2) {
            if (var5 != 0) {
              if (0 > var5) {
                stackIn_22_0 = kp.field_z;
              } else {
                stackIn_22_0 = kp.field_w;
              }
              var10 = stackIn_22_0;
              var9 = var10;
              var6 = var9;
              var7 = 31;
              var7Lifetime1 = 31 - 31 * Math.abs(-this.field_v + var5) / Math.abs(-this.field_A + this.field_v);
              if (var7Lifetime1 > 0) {
                t.a(320 + var5 << 4, this.field_m - 7 << 4, 64, var7Lifetime1, var10);
                t.a(320 + var5 << 4, this.field_m + 30 << 4, 64, var7Lifetime1, var10);
              }
            }
          }
        }
        var3Lifetime1 = 1;
        if (0 > this.field_v) {
          var3Lifetime1 = 0;
        }
        if (param0 != 2) {
          this.field_x = -37;
        }
        if (0 < this.field_v) {
          var3Lifetime1 = 2;
        }
        ll.field_m[var3Lifetime1].b(-8 + (this.field_v + 320), -10 + this.field_m);
    }

    final void a(int param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var6Lifetime1;
        var7 = Pixelate.field_H ? 1 : 0;
        super.a((byte) 21);
        if (param0 != 12804) {
          ma.c((byte) 73);
        }
        var3 = this.field_t[1] - this.field_t[0];
        if (var3 > 1024) {
          var3 = 1024;
        }
        if (var3 < -1024) {
          var3 = -1024;
        }
        var4 = var3 * 299 >> 10;
        if (this.field_w) {
          var4 = -var4;
        }
        if (var4 != this.field_r) {
          this.field_p = this.field_v;
          this.field_q = this.field_A;
          this.field_r = var4;
          var5 = Math.abs(-this.field_r + this.field_v);
          this.field_u = 60 * var5 / 640;
          this.field_x = 0;
          if (this.field_u < 1) {
            this.field_u = 1;
          }
          if (var5 < 128) {
            this.field_s = -(var5 * 20 >> 7);
          } else {
            this.field_s = -20;
          }
        } else {
          var5 = this.field_u * this.field_u;
          if (this.field_x < this.field_u) {
            this.field_x = this.field_x + 1;
            var6 = (this.field_u - this.field_x) * (this.field_u - this.field_x);
            this.field_v = this.field_r + (-this.field_r + this.field_p) * var6 / var5;
          }
          if (this.field_u > this.field_s) {
            this.field_s = this.field_s + 1;
            if (this.field_s > 0) {
              var6Lifetime1 = (this.field_u - this.field_s) * (-this.field_s + this.field_u);
              this.field_A = this.field_r + (-this.field_r + this.field_q) * var6Lifetime1 / var5;
            }
          }
        }
    }

    ma(int[] param0, boolean param1, int param2, int param3) {
        this.field_v = 0;
        this.field_r = 0;
        this.field_A = 0;
        this.field_q = 0;
        this.field_p = 0;
        try {
          this.field_n = param2;
          this.field_t = param0;
          this.field_m = param3;
          this.field_w = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_o = new bb();
    }
}
