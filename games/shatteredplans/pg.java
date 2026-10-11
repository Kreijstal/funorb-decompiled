/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends qs {
    private int field_K;
    private int field_H;
    static String field_E;
    static int[][] field_A;
    private boolean field_I;
    private nq field_G;
    private String field_L;
    private int field_D;
    static int field_J;
    static byte[] field_C;
    static String field_F;

    final String c(boolean param0) {
        int var2 = this.field_z.field_k ? 1 : 0;
        this.field_z.field_k = this.field_k;
        String var3 = this.field_z.c(param0);
        this.field_z.field_k = var2 != 0 ? true : false;
        return var3;
    }

    pg(int param0, int param1, int param2, int param3, vg param4, boolean param5, int param6, int param7, nq param8, int param9, String param10) {
        super(param0, param1, param2, param3, (iq) null, (ko) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          this.field_z = param4;
          this.field_L = param10;
          this.field_D = param9;
          this.field_H = param6;
          this.field_G = param8;
          this.field_K = param7;
          stackIn_4_1 = (param5);
          this.field_I = stackIn_4_1;
          var12_int = -this.field_K + this.field_H;
          var13 = this.field_G.c(param10, var12_int, this.field_G.field_J) + this.field_K * 2;
          if (param3 < var13) {
            this.a(param1, var13, (byte) 102, param0, param2);
          } else {
            var13 = param3;
          }
          if (!this.field_I) {
            stackIn_10_0 = 2 * this.field_K + this.field_H;
          } else {
            stackIn_10_0 = 0;
          }
          var14 = stackIn_10_0;
          this.field_z.a((-param3 + var13 >> 1) + this.field_K, param3 - 2 * this.field_K, (byte) 115, var14, -this.field_H + param2 - 3 * this.field_K);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("pg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void f(byte param0) {
        if (param0 != -43) {
          return;
        }
        field_F = null;
        field_C = null;
        field_A = (int[][]) null;
        field_E = null;
    }

    final static bi[] a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8) {
        int var14 = 0;
        int var9;
        bi[] var10;
        bi[] var11_ref_bi__;
        int var11;
        int var12;
        bi var13;
        int var15;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        var9 = param1 + param2 + param7;
        var10 = new bi[]{new bi(var9, var9), new bi(param6, var9), new bi(var9, var9), new bi(var9, param6), new bi(64, 64), new bi(var9, param6), new bi(var9, var9), new bi(param6, var9), new bi(var9, var9)};
        var11_ref_bi__ = var10;
        for (var12 = 0; var11_ref_bi__.length > var12; var12++) {
          var13 = var11_ref_bi__[var12];
          for (var14 = 0; var14 < var13.field_B.length; var14++) {
            var13.field_B[var14] = param5;
          }
        }
        for (var11 = 0; var11 < param7; var11++) {
          for (var12Lifetime1 = 0; var9 > var12Lifetime1; var12Lifetime1++) {
            var10[6].field_B[var12Lifetime1 + (-1 + (var9 - var11)) * var9] = param4;
            var10[8].field_B[var12Lifetime1 + var9 * (-1 - var11 + var9)] = param4;
            var10[2].field_B[-1 + (var9 - var11 + var9 * var12Lifetime1)] = param4;
            var10[8].field_B[var9 * var12Lifetime1 - var11 - (-var9 + 1)] = param4;
          }
        }
        for (var11Lifetime1 = 0; param7 > var11Lifetime1; var11Lifetime1++) {
          for (var12Lifetime2 = 0; var12Lifetime2 < var9; var12Lifetime2++) {
            var10[0].field_B[var9 * var11Lifetime1 + var12Lifetime2] = param8;
            var10[0].field_B[var11Lifetime1 + var12Lifetime2 * var9] = param8;
            if ((var9 - var11Lifetime1) > var12Lifetime2) {
              var10[2].field_B[var9 * var11Lifetime1 + var12Lifetime2] = param8;
              var10[6].field_B[var11Lifetime1 + var9 * var12Lifetime2] = param8;
            }
          }
        }
        for (var11Lifetime2 = 0; var11Lifetime2 < param6; var11Lifetime2++) {
          for (var12Lifetime3 = 0; var12Lifetime3 < param7; var12Lifetime3++) {
            var10[7].field_B[(var9 - var12Lifetime3 - 1) * param6 + var11Lifetime2] = param4;
            var10[5].field_B[var9 + (-1 - var12Lifetime3) + var11Lifetime2 * var9] = param4;
            var10[1].field_B[var12Lifetime3 * param6 + var11Lifetime2] = param8;
            var10[3].field_B[var12Lifetime3 + var9 * var11Lifetime2] = param8;
          }
        }
        var11Lifetime3 = 0;
        if (param3 != -41) {
          pg.a(-7, 17, -29, (byte) 74, -118, 12, 82, -100, -35);
        }
        while (var11Lifetime3 < param6 >> 1) {
          for (var12Lifetime4 = 0; param1 > var12Lifetime4; var12Lifetime4++) {
            var10[1].field_B[param6 * (-1 - var12Lifetime4 + var9) + var11Lifetime3] = param0;
            var10[3].field_B[-1 + var9 - var12Lifetime4 + var11Lifetime3 * var9] = param0;
            var10[7].field_B[var11Lifetime3 + param6 * var12Lifetime4] = param0;
            var10[5].field_B[var9 * var11Lifetime3 + var12Lifetime4] = param0;
          }
          var11Lifetime3++;
        }
        return var10;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 != 28654) {
            field_C = (byte[]) null;
          }
          if ((param1 <= 0 ||
            param1 >= 128) &&
            (param1 < 160 ||
            param1 > 255)) {
            if (0 != param1) {
              var6 = tl.field_p;
              var2 = var6;
              var3 = 0;
              while (var3 < var6.length) {
                var4 = var6[var3];
                if (param1 != var4) {
                  var3++;
                  continue;
                }
                return true;
              }
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "pg.D(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_m + param3;
        if (param1 != -11857) {
          pg.a(40, -66, 111, (byte) -124, 52, 3, 0, 73, -122);
        }
        int var6 = this.field_q + param2;
        super.a(param0, param1 ^ 0, param2, param3);
        if (0 != param0) {
          return;
        }
        int var7 = !this.field_I ? 0 : -(2 * this.field_K) + (-this.field_H + this.field_x);
        this.field_G.a(this.field_L, var5 + var7 + this.field_K, var6 + this.field_K, this.field_H - this.field_K, this.field_n - this.field_K * 2, this.field_D, -1, !this.field_I ? 2 : 0, 1, this.field_G.field_J);
    }

    static {
        field_E = "Press F10 to open Quick Chat.";
        field_C = new byte[]{(byte)5, (byte)7, (byte)4, (byte)5, (byte)2};
        field_F = "Neutral homeworld";
    }
}
