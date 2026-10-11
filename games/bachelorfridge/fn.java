/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends k {
    private int field_l;
    private int[] field_p;
    private int field_o;
    private int field_q;
    static cf field_m;
    static int[] field_k;
    static pia field_n;

    final static void a(byte param0, int param1, java.math.BigInteger param2, java.math.BigInteger param3, lu param4, byte[] param5, int param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = BachelorFridge.field_y;
        try {
          var7_int = vn.a(-9938, param6);
          if (null == fj.field_i) {
            fj.field_i = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = fj.field_i.nextInt();
          }
          if (null == rl.field_p ||
            !(var7_int <= rl.field_p.field_h.length)) {
            rl.field_p = new lu(var7_int);
          }
          rl.field_p.field_g = 0;
          if (param0 != -68) {
            field_k = (int[]) null;
          }
          rl.field_p.a(param1, -108, param6, param5);
          rl.field_p.a(var7_int, false);
          rl.field_p.a(var13, 0);
          if (null == gu.field_a ||
            !(gu.field_a.field_h.length >= 100)) {
            gu.field_a = new lu(100);
          }
          gu.field_a.field_g = 0;
          gu.field_a.d(10, param0 + 68);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            gu.field_a.e(var13[var11], -1615464796);
            var11++;
          }
          gu.field_a.b(param6, param0 ^ 53);
          gu.field_a.a(param3, 0, param2);
          param4.a(0, -82, gu.field_a.field_g, gu.field_a.field_h);
          param4.a(0, param0 ^ 35, rl.field_p.field_g, rl.field_p.field_h);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("fn.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param5 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param6).append(')').toString());
        }
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = BachelorFridge.field_y;
        try {
          var4_int = param2;
          if (var4_int == 0) {
            this.field_l = param1.e((byte) 87);
          } else {
            if (1 != var4_int) {
              if (var4_int == 2) {
                this.field_o = param1.e((byte) 117);
              }
            } else {
              this.field_q = param1.e((byte) 81);
            }
          }
          if (param0 != -71) {
            field_k = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("fn.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void f(byte param0) {
        if (param0 < 75) {
          kv var2 = (kv) null;
          fn.a(-79, (byte) 41, 48, -26, -58, (kv) null);
        }
        field_k = null;
        field_n = null;
        field_m = null;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, kv param5) {
        int var7 = 0;
        int var8 = 0;
        int var6_int = 0;
        int var9 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var9 = BachelorFridge.field_y;
        try {
          param4 -= 3;
          var6_int = 0;
          if (param1 != 11) {
            return;
          }
          for (var7 = 0; var7 < param5.field_p; var7++) {
            for (var8 = 0; var8 < param2; var8++) {
              if (param5.field_v[var6_int] > 0) {
                tla.a(param3 + var8, param1 - 1898743715, param0, param4 + var7, 255 & param5.field_v[var6_int]);
              }
              var6_int++;
            }
            var6_int = var6_int + (param5.field_q - param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("fn.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final int[] a(int param0, int param1) {
        int var7 = 0;
        int[] var26 = null;
        int[] var9 = null;
        int[] var25 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var5 = 0;
        int var4 = 0;
        int var6 = 0;
        int var17 = BachelorFridge.field_y;
        if (param1 != 0) {
          this.field_o = 4;
        }
        int[] var18 = this.field_j.a(param0, param1 - 1);
        int[] var3 = var18;
        if (this.field_j.field_m) {
          var7 = this.field_l * qna.field_k >> 12;
          var26 = this.a(0, param0 - 1 & it.field_r, (byte) 125);
          var9 = this.a(0, param0, (byte) 120);
          var25 = this.a(0, it.field_r & param0 + 1, (byte) 109);
          for (var11 = 0; hh.field_d > var11; var11++) {
            var12 = var7 * (var25[var11] - var26[var11]) >> 12;
            var13 = var7 * (-var9[1 + var11 & wp.field_r] + var9[wp.field_r & -1 + var11]) >> 12;
            var14 = var13 >> 4;
            if (var14 < 0) {
              var14 = -var14;
            }
            var15 = var12 >> 4;
            if (var14 > 255) {
              var14 = 255;
            }
            if (var15 < 0) {
              var15 = -var15;
            }
            if (255 < var15) {
              var15 = 255;
            }
            var16 = ti.field_a[(var15 * (var15 + 1) >> 1) + var14] & 255;
            var5 = var12 * var16 >> 8;
            var4 = var16 * var13 >> 8;
            var6 = var16 * 4096 >> 8;
            var4 = var4 * this.field_p[0] >> 12;
            var6 = this.field_p[2] * var6 >> 12;
            var5 = var5 * this.field_p[1] >> 12;
            var18[var11] = var5 + var4 + var6;
          }
        }
        return var18;
    }

    public fn() {
        super(1, true);
        this.field_l = 4096;
        this.field_p = new int[3];
        this.field_q = 3216;
        this.field_o = 3216;
    }

    private final void e(byte param0) {
        double var2 = Math.cos((double)((float)this.field_o / 4096.0f));
        this.field_p[0] = (int)(var2 * Math.sin((double)((float)this.field_q / 4096.0f)) * 4096.0);
        this.field_p[1] = (int)(var2 * Math.cos((double)((float)this.field_q / 4096.0f)) * 4096.0);
        this.field_p[2] = (int)(Math.sin((double)((float)this.field_o / 4096.0f)) * 4096.0);
        int var4 = this.field_p[0] * this.field_p[0] >> 12;
        int var5 = this.field_p[1] * this.field_p[1] >> 12;
        int var6 = this.field_p[2] * this.field_p[2] >> 12;
        int var8 = -28 % ((param0 + 21) / 62);
        int var7 = (int)(Math.sqrt((double)(var4 - (-var5 - var6) >> 12)) * 4096.0);
        if (var7 != 0) {
          this.field_p[2] = (this.field_p[2] << 12) / var7;
          this.field_p[0] = (this.field_p[0] << 12) / var7;
          this.field_p[1] = (this.field_p[1] << 12) / var7;
        }
    }

    final void d(byte param0) {
        if (param0 != -68) {
          kv var3 = (kv) null;
          fn.a(90, (byte) 41, -54, -20, 63, (kv) null);
        }
        this.e((byte) -97);
    }

    static {
        field_m = new cf();
    }
}
