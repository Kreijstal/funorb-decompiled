/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ou extends fd {
    private ut field_I;
    private ut field_D;
    static int field_y;
    private int field_F;
    private ut[] field_z;
    private int field_x;
    private int field_A;
    private int field_G;
    boolean field_w;
    int field_C;
    private ut field_v;
    private int field_H;
    private int field_E;
    static int field_B;

    private final ut a(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Kickabout.field_G;
        int var2 = this.field_i >> 1;
        if (param0) {
          this.field_D = (ut) null;
        }
        ut var3 = new ut(var2, this.field_i);
        iw.a(99, var3);
        for (var4 = 0; this.field_i > var4; var4++) {
          for (var5 = 0; var2 > var5; var5++) {
            var6 = (double)var5 * (double)var5 / (double)((this.field_i - var4) * var4);
            var8 = 1;
            if (var6 < 1.0) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = !(1.0 <= var6) ? (int)(255.0 * var6) : 255;
            }
            on.a(var5, var4, var8 << 8 | var8 | var8 << 16);
          }
        }
        ta.e(124);
        return var3;
    }

    final static void a(byte param0, sj param1) {
        int var3 = 0;
        int var4 = 0;
        kk var5 = null;
        int[] var6 = null;
        int var7 = 0;
        ml var8 = null;
        int var9 = 0;
        ml var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var7 = Kickabout.field_G;
        try {
          var8 = new ml(param1.a("", "logo.fo3d", 48));
          var10 = var8;
          var3 = var10.h((byte) -109);
          var10.p(-111);
          sq.field_H = ds.a(var10, (byte) -4);
          sm.field_l = new int[var3][];
          ba.field_n = new kk[var3];
          for (var4 = 0; var4 < var3; var4++) {
            ba.field_n[var4] = vi.a((byte) 80, var8);
          }
          var10.l((byte) -63);
          if (param0 != 49) {
            field_y = -86;
          }
          var9 = 0;
          var4Lifetime1 = var9;
          while (var3 > var9) {
            var5 = ba.field_n[var9];
            var5.a(6, 6, 256, 1, 6);
            var5.a(false);
            var6 = new int[]{var5.field_h + var5.field_y >> 1, var5.field_s + var5.field_x >> 1, var5.field_t + var5.field_w >> 1};
            sm.field_l[var9] = var6;
            var5.a(-var6[2], -var6[0], param0 ^ 49, -var6[1]);
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("ou.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void a(ut param0, int param1, byte param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = Kickabout.field_G;
        try {
          if (param2 != 124) {
            return;
          }
          var5_int = this.field_n + param1;
          pt.a(var5_int - this.field_v.field_q, -22914, param1 + this.field_v.field_q, this.field_i + param3, param3);
          for (var6 = param1 - this.field_H; var5_int > var6; var6 = var6 + param0.field_q) {
            param0.c(var6, param3);
          }
          ta.e(param2 - 1);
          if (on.field_b <= this.field_v.field_q + param1) {
            iw.a(param2 ^ -84, this.field_I);
            param0.c(-this.field_H, 0);
            param0.c(this.field_G * 2 - this.field_H, 0);
            this.field_D.e(0, 0);
            ta.e(117);
            this.field_I.c(param1, param3);
          }
          if (on.field_c >= var5_int - this.field_v.field_q) {
            iw.a(-107, this.field_I);
            for (var7 = this.field_n - this.field_v.field_q + this.field_H; var7 > this.field_G * 2; var7 = var7 - this.field_G * 2) {
            }
            param0.c(-var7, 0);
            param0.c(-var7 + 2 * this.field_G, 0);
            this.field_v.e(0, 0);
            ta.e(120);
            this.field_I.c(-this.field_v.field_q + var5_int, param3);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ou.F(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 != 0) {
          ou.a(-7);
        }
        wq.field_g = false;
        hk.field_G = false;
        qd.b(38, -1);
        mj.field_a = vj.field_a;
        wk.field_f = vj.field_a;
    }

    final void a(byte param0, int param1, int param2) {
        this.field_A = param1;
        this.field_F = 8355711 & param2 >> 1;
        if (param0 != 21) {
          sj var5 = (sj) null;
          ou.a((byte) -30, (sj) null);
        }
        this.field_E = param2;
        this.field_x = (16711422 & param1) >> 1;
        this.a((byte) 121);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a((byte) 121);
    }

    private final ut a(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = Kickabout.field_G;
        ut var14 = new ut(this.field_G * 2, this.field_i);
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        iw.a(-66, var14);
        if (param0 != -257) {
          return (ut) null;
        }
        int var5 = this.field_i >> 1;
        for (var6 = 0; this.field_i > var6; var6++) {
          var7 = (2 * this.field_G - 1) * (var6 >> 1) % (this.field_G * 2);
          var8 = param2 & 16711935;
          var9 = param2 & 65280;
          var10 = var6 - var5;
          var11 = (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0) + 128;
          var12 = var11 >= 256 ? var8 | var9 : (var11 * var8 & -16711936 | 16711680 & var9 * var11) >>> 8;
          on.f(var7, var6, this.field_G, var12);
          var9Lifetime1 = 65280 & param1;
          on.f(-(this.field_G * 2) + var7, var6, this.field_G, var12);
          var8Lifetime1 = param1 & 16711935;
          var12Lifetime1 = 256 > var11 ? (-16711936 & var11 * var8Lifetime1 | var11 * var9Lifetime1 & 16711680) >>> 8 : var8Lifetime1 | var9Lifetime1;
          on.f(var7 + this.field_G, var6, this.field_G, var12Lifetime1);
          on.f(-this.field_G + var7, var6, this.field_G, var12Lifetime1);
        }
        ta.e(122);
        return var14;
    }

    ou(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 1, param6 >> 1 & 8355711);
    }

    final static int b(int param0, int param1, int param2, int param3) {
        if (!(on.field_g < param1 + param0)) {
          return param1;
        }
        if (param1 + (param2 - param0) >= 0) {
          return -param0 + (param1 + param2);
        }
        if (param3 < 126) {
          ou.b(80, 123, -76, -16);
        }
        return -param0 + on.field_g;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (0 != param0) {
          return;
        }
        int var5 = this.field_t + param2;
        int var6 = param3 + this.field_g;
        this.a(this.field_z[0], var5, (byte) 124, var6);
        if (param1 != 65) {
          this.field_x = 38;
        }
        if (65536 > this.field_C) {
          pt.a(var5 + this.field_n, -22914, var5 + (this.field_C * this.field_n >> 16), this.field_i + var6, var6);
          this.a(this.field_z[1], var5, (byte) 124, var6);
          ta.e(127);
        }
    }

    final void a(byte param0, fd param1, int param2, int param3) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 != 12) {
            ou.a(27);
          }
          if (this.field_w) {
            this.field_H = this.field_H + 1;
            if (this.field_H <= this.field_G * 2) {
              return;
            }
            this.field_H = this.field_H - this.field_G * 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ou.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(byte param0) {
        if (param0 != 121) {
          return;
        }
        this.field_z = new ut[]{this.a(-257, this.field_A, this.field_E), this.a(-257, this.field_x, this.field_F)};
        this.field_v = this.a(false);
        this.field_D = this.field_v.f();
        this.field_I = new ut(this.field_i >> 1, this.field_i);
    }

    final static int b(int param0, int param1, int param2, boolean param3) {
        if (param1 != -1951459327) {
          return 80;
        }
        return hg.g(100);
    }

    private ou(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_G = param4;
        this.field_x = param8;
        this.field_A = param6;
        this.field_F = param7;
        this.field_E = param5;
        this.a(param3, 1, param0, param2, param1);
    }

    static {
    }
}
