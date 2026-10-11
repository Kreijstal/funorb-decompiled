/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static ld field_b;
    static String field_d;
    static String field_a;
    static long field_c;
    static int[][] field_j;
    static String field_i;
    static byte[] field_g;
    static int field_h;
    static int[] field_e;
    static gm field_f;

    final static void a(byte param0, int param1, int param2) {
        int var4_int = 0;
        int var3_int = 0;
        hn var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = Kickabout.field_G;
        try {
          var3_int = -1;
          if (param0 != -25) {
            ld.a((int[][][]) null, (int[][][]) null, (double[][][]) null, (int[][][]) null, (int[][][]) null, false);
          }
          for (var4_int = 0; var4_int < 9; var4_int++) {
            if (!ic.field_h.field_i[ic.field_h.field_q[var4_int]].c(-2)) {
              continue;
            }
            var3_int = var4_int;
            break;
          }
          var4 = new hn(0, new int[]{1 + param1, param2});
          ii.a(var4, 81);
          if (23 == cq.field_h.field_c) {
            ((qs) (cq.field_h)).a(param2, var3_int, param0 ^ -66, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "ld.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int[][][] param0, int[][][] param1, double[][][] param2, int[][][] param3, int[][][] param4, boolean param5) {
        int var17 = 0;
        int var19 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        double var14 = 0.0;
        double[] var16 = null;
        int var18 = 0;
        double[] var19_ref_double__ = null;
        int var20 = 0;
        int var22 = 0;
        int var24 = 0;
        int var26 = 0;
        int var27 = 0;
        int[] var28 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        double[] var35 = null;
        int[] var36 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        double[] var43 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int var18Lifetime1;
        var27 = Kickabout.field_G;
        try {
          var40 = new int[33];
          var32 = var40;
          var10 = var32;
          var41 = new int[33];
          var33 = var41;
          var11 = var33;
          var42 = new int[33];
          var34 = var42;
          var12 = var34;
          var36 = new int[33];
          var28 = var36;
          var13 = var28;
          var43 = new double[33];
          var35 = var43;
          var16 = var35;
          for (var17 = 1; 32 >= var17; var17++) {
            for (var18 = 0; 32 >= var18; var18++) {
              var19_ref_double__ = var16;
              var20 = var18;
              var49 = var10;
              var22 = var18;
              var48 = var11;
              var24 = var18;
              var47 = var12;
              var36[var18] = 0;
              var26 = var18;
              var47[var26] = 0;
              var48[var24] = 0;
              var49[var22] = 0;
              var19_ref_double__[var20] = 0.0;
            }
            for (var18Lifetime1 = 1; var18Lifetime1 <= 32; var18Lifetime1++) {
              var7 = 0;
              var9 = 0;
              var6_int = 0;
              var8 = 0;
              var14 = 0.0;
              for (var19 = 1; var19 <= 32; var19++) {
                var14 = var14 + param2[var17][var18Lifetime1][var19];
                var7 = var7 + param3[var17][var18Lifetime1][var19];
                var8 = var8 + param4[var17][var18Lifetime1][var19];
                var6_int = var6_int + param0[var17][var18Lifetime1][var19];
                var9 = var9 + param1[var17][var18Lifetime1][var19];
                var10[var19] = var10[var19] + var6_int;
                var11[var19] = var11[var19] + var7;
                var12[var19] = var12[var19] + var8;
                var13[var19] = var13[var19] + var9;
                var16[var19] = var16[var19] + var14;
                param0[var17][var18Lifetime1][var19] = param0[var17 - 1][var18Lifetime1][var19] + var40[var19];
                param3[var17][var18Lifetime1][var19] = var41[var19] + param3[var17 - 1][var18Lifetime1][var19];
                param4[var17][var18Lifetime1][var19] = param4[var17 - 1][var18Lifetime1][var19] + var42[var19];
                param1[var17][var18Lifetime1][var19] = param1[var17 - 1][var18Lifetime1][var19] + var36[var19];
                param2[var17][var18Lifetime1][var19] = var43[var19] + param2[var17 - 1][var18Lifetime1][var19];
              }
            }
          }
          if (param5) {
            field_g = (byte[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_18_0 = var6;
          stackIn_18_1 = new StringBuilder().append("ld.B(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param4 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_j = (int[][]) null;
        field_b = null;
        field_e = null;
        field_f = null;
        field_i = null;
        if (param0 != 112) {
          ld.a((byte) -12, 82, -66);
        }
        field_d = null;
        field_a = null;
        field_g = null;
    }

    static {
        field_d = "<%0> and <%1> have ended on a draw with <%2> goal(s) each.";
        field_b = new ld();
        field_g = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        field_i = "Unfortunately we are unable to create an account for you at this time.";
        field_e = new int[8192];
        field_h = field_g.length;
    }
}
