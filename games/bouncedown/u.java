/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static String field_a;
    static String field_f;
    private int field_c;
    static String field_d;
    private int field_e;
    static boolean field_g;
    private int[][] field_b;

    public static void a(int param0) {
        if (param0 != 0) {
          field_a = (String) null;
        }
        field_a = null;
        field_d = null;
        field_f = null;
    }

    final int a(int param0, int param1) {
        if (param1 != 6) {
          return 61;
        }
        if (null != this.field_b) {
          param0 = 6 + (int)((long)param0 * (long)this.field_c / (long)this.field_e);
        }
        return param0;
    }

    final static void a(byte param0) {
        kb.b(808);
        oh.a(param0 + 110, 4);
        if (param0 != -10) {
          field_a = (String) null;
        }
    }

    final byte[] a(byte[] param0, boolean param1) {
        byte[] stackIn_20_0 = null;
        byte[] stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
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
        var11 = Bounce.field_N;
        try {
          if (this.field_b != null) {
            var3_int = 14 + (int)((long)param0.length * (long)this.field_c / (long)this.field_e);
            var16 = new int[var3_int];
            var14 = var16;
            var4 = var14;
            var5 = 0;
            var6 = 0;
            for (var7 = 0; param0.length > var7; var7++) {
              var8 = param0[var7];
              var18 = this.field_b[var6];
              for (var10 = 0; 14 > var10; var10++) {
                var4[var10 + var5] = var4[var10 + var5] + var18[var10] * var8;
              }
              var6 = var6 + this.field_c;
              var10Lifetime1 = var6 / this.field_e;
              var5 = var5 + var10Lifetime1;
              var6 = var6 - this.field_e * var10Lifetime1;
            }
            param0 = new byte[var3_int];
            var12 = 0;
            var7Lifetime1 = var12;
            while (var3_int > var12) {
              var8Lifetime1 = var16[var12] + 32768 >> 16;
              if (var8Lifetime1 < -128) {
                param0[var12] = (byte)-128;
              } else {
                if (127 >= var8Lifetime1) {
                  param0[var12] = (byte)var8Lifetime1;
                } else {
                  param0[var12] = (byte)127;
                }
              }
              var12++;
            }
          }
          if (param1) {
            stackIn_22_0 = (byte[]) (param0);
            return stackIn_22_0;
          }
          stackIn_20_0 = (byte[]) null;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("u.D(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    u(int param0, int param1) {
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
        var3 = ed.a(param0, (byte) -104, param1);
        param0 = param0 / var3;
        param1 = param1 / var3;
        this.field_c = param1;
        this.field_b = new int[param0][14];
        this.field_e = param0;
        for (var4 = 0; var4 < param0; var4++) {
          var5 = this.field_b[var4];
          var6 = (double)var4 / (double)param0 + 6.0;
          var8 = (int)Math.floor(1.0 + (-7.0 + var6));
          if (var8 < 0) {
            var8 = 0;
          }
          var9 = (int)Math.ceil(7.0 + var6);
          if (14 < var9) {
            var9 = 14;
          }
          var10 = (double)param1 / (double)param0;
          while (var8 < var9) {
            var12 = ((double)var8 - var6) * 3.141592653589793;
            var14 = var10;
            if (-0.0001 > var12 ||
              0.0001 < var12) {
              var14 = var14 * (Math.sin(var12) / var12);
            }
            var14 = var14 * (0.54 + 0.46 * Math.cos(0.2243994752564138 * (-var6 + (double)var8)));
            var5[var8] = (int)Math.floor(0.5 + 65536.0 * var14);
            var8++;
          }
        }
        return;
    }

    final static tg a(int param0, gk param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            u.a((byte) -10);
          }
          if (c.a(param1, false, param3, param2)) {
            return ne.a(true);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("u.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(boolean param0, int param1) {
        if (this.field_b != null) {
          param1 = (int)((long)param1 * (long)this.field_c / (long)this.field_e);
        }
        if (param0) {
          return -13;
        }
        return param1;
    }

    static {
        field_f = "Player 1";
        field_a = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
