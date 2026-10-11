/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm {
    static String field_c;
    static jf field_f;
    static boolean field_e;
    static ea[] field_g;
    private int field_h;
    private int field_b;
    private int[][] field_a;
    static String field_d;

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        field_f = null;
        if (param0 != -7) {
          wm.a(false);
        }
        field_d = null;
    }

    final byte[] a(boolean param0, byte[] param1) {
        byte[] stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int var7Lifetime1;
        int var8Lifetime1;
        int var10Lifetime1;
        var11 = MinerDisturbance.field_ab;
        try {
          if (!param0) {
            this.field_h = -34;
          }
          if (this.field_a != null) {
            var3_int = 14 + (int)((long)this.field_h * (long)param1.length / (long)this.field_b);
            var16 = new int[var3_int];
            var14 = var16;
            var4 = var14;
            var5 = 0;
            var6 = 0;
            for (var7 = 0; param1.length > var7; var7++) {
              var8 = param1[var7];
              var18 = this.field_a[var6];
              for (var10 = 0; var10 < 14; var10++) {
                var4[var5 + var10] = var4[var5 + var10] + var8 * var18[var10];
              }
              var6 = var6 + this.field_h;
              var10Lifetime1 = var6 / this.field_b;
              var6 = var6 - this.field_b * var10Lifetime1;
              var5 = var5 + var10Lifetime1;
            }
            param1 = new byte[var3_int];
            var12 = 0;
            var7Lifetime1 = var12;
            while (var12 < var3_int) {
              var8Lifetime1 = 32768 + var16[var12] >> 16;
              if (-128 > var8Lifetime1) {
                param1[var12] = (byte)-128;
              } else {
                if (var8Lifetime1 > 127) {
                  param1[var12] = (byte)127;
                } else {
                  param1[var12] = (byte)var8Lifetime1;
                }
              }
              var12++;
            }
          }
          stackIn_20_0 = (byte[]) (param1);
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("wm.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final int b(int param0, byte param1) {
        if (this.field_a != null) {
          param0 = (int)((long)param0 * (long)this.field_h / (long)this.field_b);
        }
        if (param1 < 4) {
          return -99;
        }
        return param0;
    }

    final static void a(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = MinerDisturbance.field_ab;
        try {
          for (var1_int = -1 + ke.field_X.length; var1_int >= 0; var1_int--) {
            ke.field_X[var1_int] = false;
          }
          if (param0) {
            wm.a(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "wm.D(" + param0 + ')');
        }
    }

    final int a(int param0, byte param1) {
        if (null != this.field_a) {
          param0 = 6 + (int)((long)param0 * (long)this.field_h / (long)this.field_b);
        }
        if (param1 > -98) {
          this.b(96, (byte) -119);
        }
        return param0;
    }

    wm(int param0, int param1) {
        int var4 = 0;
        int var3;
        int[] var5;
        double var6;
        int var8;
        int var9;
        double var10;
        double var12;
        double var14;
        if (param0 == param1) {
          return;
        }
        var3 = sa.a(param1, param0, 0);
        param0 = param0 / var3;
        param1 = param1 / var3;
        this.field_b = param0;
        this.field_h = param1;
        this.field_a = new int[param0][14];
        for (var4 = 0; var4 < param0; var4++) {
          var5 = this.field_a[var4];
          var6 = (double)var4 / (double)param0 + 6.0;
          var8 = (int)Math.floor(-7.0 + var6 + 1.0);
          if (var8 < 0) {
            var8 = 0;
          }
          var9 = (int)Math.ceil(7.0 + var6);
          if (var9 > 14) {
            var9 = 14;
          }
          var10 = (double)param1 / (double)param0;
          while (var9 > var8) {
            var12 = 3.141592653589793 * (-var6 + (double)var8);
            var14 = var10;
            if (-0.0001 > var12 ||
              0.0001 < var12) {
              var14 = var14 * (Math.sin(var12) / var12);
            }
            var14 = var14 * (0.54 + Math.cos((-var6 + (double)var8) * 0.2243994752564138) * 0.46);
            var5[var8] = (int)Math.floor(0.5 + var14 * 65536.0);
            var8++;
          }
        }
        return;
    }

    static {
        field_c = "Player Name: ";
    }
}
