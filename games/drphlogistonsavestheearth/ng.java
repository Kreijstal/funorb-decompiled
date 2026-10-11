/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static he[] field_f;
    private int field_g;
    static he[] field_b;
    private int field_e;
    private int[][] field_a;
    static k field_c;
    static String[] field_d;

    final byte[] a(byte[] param0, byte param1) {
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
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
        String var12 = null;
        int var13 = 0;
        int[] var15 = null;
        int[] var17 = null;
        int[] var19 = null;
        int var7Lifetime1;
        int var8Lifetime1;
        int var10Lifetime1;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param1 != -128) {
            var12 = (String) null;
            ng.a((String) null, 126);
          }
          if (this.field_a != null) {
            var3_int = 14 + (int)((long)param0.length * (long)this.field_e / (long)this.field_g);
            var17 = new int[var3_int];
            var15 = var17;
            var4 = var15;
            var5 = 0;
            var6 = 0;
            for (var7 = 0; param0.length > var7; var7++) {
              var8 = param0[var7];
              var19 = this.field_a[var6];
              for (var10 = 0; var10 < 14; var10++) {
                var4[var5 + var10] = var4[var5 + var10] + var19[var10] * var8;
              }
              var6 = var6 + this.field_e;
              var10Lifetime1 = var6 / this.field_g;
              var6 = var6 - var10Lifetime1 * this.field_g;
              var5 = var5 + var10Lifetime1;
            }
            param0 = new byte[var3_int];
            var13 = 0;
            var7Lifetime1 = var13;
            while (var13 < var3_int) {
              var8Lifetime1 = var17[var13] + 32768 >> 16;
              if (var8Lifetime1 < -128) {
                param0[var13] = (byte)-128;
              } else {
                if (127 >= var8Lifetime1) {
                  param0[var13] = (byte)var8Lifetime1;
                } else {
                  param0[var13] = (byte)127;
                }
              }
              var13++;
            }
          }
          stackIn_19_0 = (byte[]) (param0);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_22_0 = var3;
          stackIn_22_1 = new StringBuilder().append("ng.A(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, byte param1) {
        if (this.field_a != null) {
          param0 = (int)((long)param0 * (long)this.field_e / (long)this.field_g) + 6;
        }
        if (param1 != 101) {
          field_c = (k) null;
        }
        return param0;
    }

    final static og a(String param0, int param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        og stackIn_5_0 = null;
        og stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (hg.field_ub == lc.field_h) {
            stackIn_2_0 = null;
            return (og) (stackIn_2_0);
          }
          if (param1 != 3582) {
            stackIn_5_0 = (og) null;
            return stackIn_5_0;
          }
          if (wg.field_u == lc.field_h &&
            param0.equals(cm.field_I)) {
            lc.field_h = pj.field_D;
            stackIn_9_0 = kf.field_a;
            return stackIn_9_0;
          }
          kf.field_a = null;
          cm.field_I = param0;
          lc.field_h = hg.field_ub;
          stackIn_11_0 = null;
          return (og) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ng.D(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(byte param0, int param1) {
        if (this.field_a != null) {
          param1 = (int)((long)param1 * (long)this.field_e / (long)this.field_g);
        }
        if (param0 != -128) {
          return 107;
        }
        return param1;
    }

    ng(int param0, int param1) {
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
        var3 = qe.a((byte) 26, param0, param1);
        param1 = param1 / var3;
        param0 = param0 / var3;
        this.field_a = new int[param0][14];
        this.field_g = param0;
        this.field_e = param1;
        for (var4 = 0; param0 > var4; var4++) {
          var5 = this.field_a[var4];
          var6 = 6.0 + (double)var4 / (double)param0;
          var8 = (int)Math.floor(var6 - 7.0 + 1.0);
          if (var8 < 0) {
            var8 = 0;
          }
          var9 = (int)Math.ceil(7.0 + var6);
          if (14 < var9) {
            var9 = 14;
          }
          var10 = (double)param1 / (double)param0;
          while (var9 > var8) {
            var12 = ((double)var8 - var6) * 3.141592653589793;
            var14 = var10;
            if (var12 < -0.0001 ||
              0.0001 < var12) {
              var14 = var14 * (Math.sin(var12) / var12);
            }
            var14 = var14 * (0.46 * Math.cos(0.2243994752564138 * ((double)var8 - var6)) + 0.54);
            var5[var8] = (int)Math.floor(var14 * 65536.0 + 0.5);
            var8++;
          }
        }
        return;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
          field_c = (k) null;
        }
        field_d = null;
        field_c = null;
        field_f = null;
    }

    static {
    }
}
