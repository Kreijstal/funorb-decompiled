/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends kj {
    private int field_j;
    static String field_m;
    static int field_i;
    private int field_l;
    private int field_h;
    private int field_k;
    static int field_g;

    public static void b(byte param0) {
        field_m = null;
        if (param0 != 81) {
          field_i = 92;
        }
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 != 106) {
          field_g = -31;
        }
        int var4 = param1 * this.field_k >> 12;
        int var5 = this.field_l * param1 >> 12;
        int var6 = param0 * this.field_j >> 12;
        int var7 = param0 * this.field_h >> 12;
        ko.a(this.field_c, var7, this.field_e, var5, var6, -2910, var4);
    }

    ll(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        this.field_h = param3;
        this.field_k = param0;
        this.field_j = param1;
        this.field_l = param2;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = this.field_k * param0 >> 12;
        if (param2 > -101) {
          return;
        }
        int var5 = this.field_l * param0 >> 12;
        int var6 = this.field_j * param1 >> 12;
        int var7 = param1 * this.field_h >> 12;
        ii.a(var6, var5, var7, this.field_e, var4, 2124, this.field_c, this.field_a);
    }

    final static double[] a(double[][] param0, double[] param1, byte param2) {
        int var16 = 0;
        double[] stackIn_11_0 = null;
        int stackIn_31_0 = 0;
        Object stackIn_48_0 = null;
        Object stackIn_51_0 = null;
        double[] stackIn_65_0 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        double[] var4 = null;
        int var5 = 0;
        double[] var6_ref_double__ = null;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        double var14 = 0.0;
        double var17 = 0.0;
        int var19 = 0;
        double[] var20 = null;
        int var21 = 0;
        double[][] var28 = null;
        int[] var29 = null;
        var19 = Torquing.field_u;
        try {
          var3_int = param0.length;
          var4 = new double[var3_int];
          var5 = 1;
          var6_ref_double__ = param1;
          for (var7 = 0; var7 < var6_ref_double__.length; var7++) {
            var8 = var6_ref_double__[var7];
            if (0.0 > var8) {
              var5 = 0;
            }
          }
          if (var5 != 0) {
            stackIn_11_0 = var4;
            return stackIn_11_0;
          }
          var6 = param0.length * param0.length;
          var7 = 2 * var3_int + 2;
          var28 = new double[var3_int][var7];
          var29 = new int[var3_int];
          for (var10 = 0; var10 < var3_int; var10++) {
            var28[var10][var10] = 1.0;
            for (var11 = 0; var11 < var3_int; var11++) {
              var28[var10][var11 + var3_int] = -param0[var10][var11];
            }
            var28[var10][2 * var3_int] = -1.0;
            var28[var10][1 + 2 * var3_int] = param1[var10];
            var29[var10] = var10;
          }
          if (param2 < 118) {
            var20 = (double[]) null;
            ll.a((double[][]) null, (double[]) null, (byte) 59);
          }
          var10 = 0;
          for (var11 = 1; var3_int > var11; var11++) {
            if (param1[var10] > param1[var11]) {
              var10 = var11;
            }
          }
          var11 = var10;
          var12 = cp.a(var7, var10, -53, var3_int * 2, var3_int, var28, var29);
          do {
            if (var3_int <= var12) {
              stackIn_31_0 = -var3_int + var12;
            } else {
              stackIn_31_0 = var3_int + var12;
            }
            var13 = stackIn_31_0;
            var10 = -1;
            var14 = Double.POSITIVE_INFINITY;
            for (var16 = 0; var3_int > var16; var16++) {
              if (0.0 < var28[var16][var13]) {
                var17 = var28[var16][1 + var3_int * 2] / var28[var16][var13];
                if (!(var17 < var14)) {
                  if (var17 == var14 && (var12 == var10 ||
                    var16 == var3_int * 2)) {
                    var10 = var16;
                  }
                } else {
                  var14 = var17;
                  var10 = var16;
                }
              }
            }
            if (var10 == -1) {
              stackIn_48_0 = null;
              return (double[]) (stackIn_48_0);
            }
            var6--;
            if (var6 == 0) {
              stackIn_51_0 = null;
              return (double[]) (stackIn_51_0);
            }
            var12 = cp.a(var7, var10, -127, var13, var3_int, var28, var29);
          } while (var3_int * 2 != var12 &&
            Math.abs(var28[var11][var3_int * 2 + 1]) > 1e-15);
          var21 = 0;
          var13 = var21;
          while (var21 < var3_int) {
            if (var29[var21] >= var3_int &&
              var3_int * 2 > var29[var21]) {
              var4[var29[var21] - var3_int] = var28[var21][1 + 2 * var3_int];
            }
            var21++;
          }
          stackIn_65_0 = var4;
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_68_0 = var3;
          stackIn_68_1 = new StringBuilder().append("ll.E(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = param2 * this.field_k >> 12;
        int var5 = this.field_l * param2 >> 12;
        int var6 = param1 * this.field_j >> 12;
        if (param0 <= 7) {
          return;
        }
        int var7 = this.field_h * param1 >> 12;
        kl.a(var5, 16011, var4, var6, var7, this.field_a);
    }

    static {
        field_m = "Play the game without logging in just yet";
        field_i = -1;
    }
}
