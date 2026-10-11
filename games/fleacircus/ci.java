/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    static int[] field_c;
    private int[][] field_b;
    private int field_d;
    static boolean field_f;
    private int field_a;
    static String field_e;

    public static void a(byte param0) {
        if (param0 != 127) {
          return;
        }
        field_e = null;
        field_c = null;
    }

    final byte[] a(byte[] param0, int param1) {
        byte[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var15 = null;
        int[] var17 = null;
        int[] var19 = null;
        int var8Lifetime1;
        int var9Lifetime1;
        int var11Lifetime1;
        var12 = fleas.field_A ? 1 : 0;
        try {
          var3_int = -55 % ((param1 - 6) / 44);
          if (null != this.field_b) {
            var4 = 14 + (int)((long)this.field_a * (long)param0.length / (long)this.field_d);
            var17 = new int[var4];
            var15 = var17;
            var5 = var15;
            var6 = 0;
            var7 = 0;
            for (var8 = 0; param0.length > var8; var8++) {
              var9 = param0[var8];
              var19 = this.field_b[var7];
              for (var11 = 0; var11 < 14; var11++) {
                var5[var6 + var11] = var5[var6 + var11] + var9 * var19[var11];
              }
              var7 = var7 + this.field_a;
              var11Lifetime1 = var7 / this.field_d;
              var6 = var6 + var11Lifetime1;
              var7 = var7 - var11Lifetime1 * this.field_d;
            }
            param0 = new byte[var4];
            var13 = 0;
            var8Lifetime1 = var13;
            while (var13 < var4) {
              var9Lifetime1 = 32768 + var17[var13] >> 16;
              if (var9Lifetime1 >= -128) {
                if (var9Lifetime1 > 127) {
                  param0[var13] = (byte)127;
                } else {
                  param0[var13] = (byte)var9Lifetime1;
                }
              } else {
                param0[var13] = (byte)-128;
              }
              var13++;
            }
          }
          stackIn_17_0 = (byte[]) (param0);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("ci.A(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        if (param1 != 18308) {
          return -5;
        }
        if (null != this.field_b) {
          param0 = 6 + (int)((long)this.field_a * (long)param0 / (long)this.field_d);
        }
        return param0;
    }

    final int b(int param0, int param1) {
        if (null != this.field_b) {
          param0 = (int)((long)this.field_a * (long)param0 / (long)this.field_d);
        }
        if (param1 != 14698) {
          this.a(6, 33);
        }
        return param0;
    }

    ci(int param0, int param1) {
        int var4 = 0;
        int var3;
        int[] var5;
        double var6;
        int var8;
        int var9;
        double var10;
        double var12;
        double var14;
        if (param1 == param0) {
          return;
        }
        var3 = vc.a(param1, -1, param0);
        param0 = param0 / var3;
        param1 = param1 / var3;
        this.field_d = param0;
        this.field_a = param1;
        this.field_b = new int[param0][14];
        for (var4 = 0; var4 < param0; var4++) {
          var5 = this.field_b[var4];
          var6 = (double)var4 / (double)param0 + 6.0;
          var8 = (int)Math.floor(1.0 + (var6 - 7.0));
          if (var8 < 0) {
            var8 = 0;
          }
          var9 = (int)Math.ceil(var6 + 7.0);
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
            var14 = var14 * (Math.cos((-var6 + (double)var8) * 0.2243994752564138) * 0.46 + 0.54);
            var5[var8] = (int)Math.floor(0.5 + 65536.0 * var14);
            var8++;
          }
        }
        return;
    }

    static {
        field_f = true;
        field_c = new int[150];
    }
}
