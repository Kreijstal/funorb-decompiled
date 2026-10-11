/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp extends kj {
    private int field_m;
    private int field_n;
    private int field_k;
    private int field_o;
    private int field_p;
    private int field_l;
    private int field_j;
    static String field_i;
    static String field_h;
    private int field_g;

    public static void b(int param0) {
        field_h = null;
        field_i = null;
        if (param0 != 2092666604) {
          int[] var2 = (int[]) null;
          cp.a(-67, 118, -41, -44, -77, (double[][]) null, (int[]) null);
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = this.field_n * param1 >> 12;
        int var5 = param0 * this.field_g >> 12;
        int var6 = param1 * this.field_k >> 12;
        int var7 = param0 * this.field_m >> 12;
        int var8 = param1 * this.field_l >> 12;
        int var9 = this.field_p * param0 >> 12;
        int var10 = param1 * this.field_j >> 12;
        if (param2 != 106) {
          this.field_g = -74;
        }
        int var11 = param0 * this.field_o >> 12;
        qh.a(var10, 7503, var4, var11, var5, var6, var7, var9, this.field_c, var8);
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 <= 7) {
          this.a(-123, 3, -45);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 >= -101) {
          this.a(-52, -40, -79);
        }
    }

    cp(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        super(-1, param8, param9);
        this.field_l = param4;
        this.field_g = param1;
        this.field_k = param2;
        this.field_n = param0;
        this.field_j = param6;
        this.field_m = param3;
        this.field_o = param7;
        this.field_p = param5;
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, double[][] param5, int[] param6) {
        double[] dupTemp$1 = null;
        int var12 = 0;
        double[] dupTemp$0 = null;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var7_double = 0.0;
        RuntimeException var7 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var13 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        var13 = Torquing.field_u;
        try {
          var7_double = param5[param1][param3];
          for (var9 = 0; param0 > var9; var9++) {
            dupTemp$1 = param5[param1];
            dupTemp$1[var9] = dupTemp$1[var9] / var7_double;
          }
          if (param2 >= -19) {
            field_h = (String) null;
          }
          for (var9Lifetime1 = 0; param4 > var9Lifetime1; var9Lifetime1++) {
            if (var9Lifetime1 != param1) {
              var10 = param5[var9Lifetime1][param3];
              for (var12 = 0; var12 < param0; var12++) {
                dupTemp$0 = param5[var9Lifetime1];
                dupTemp$0[var12] = dupTemp$0[var12] - var10 * param5[param1][var12];
              }
            }
          }
          var9Lifetime2 = param6[param1];
          param6[param1] = param3;
          stackIn_14_0 = var9Lifetime2;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_17_0 = var7;
          stackIn_17_1 = new StringBuilder().append("cp.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param6 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_i = "Torquing";
        field_h = "Email is valid";
    }
}
