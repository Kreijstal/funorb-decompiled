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
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        hn var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            var3_int = -1;
            var4_int = 0;
            L1: while (true) {
              L2: {
                if (var4_int >= 9) {
                  break L2;
                } else {
                  if (ic.field_h.field_i[ic.field_h.field_q[var4_int]].c(-2)) {
                    var3_int = var4_int;
                    break L2;
                  } else {
                    var4_int++;
                    continue L1;
                  }
                }
              }
              L3: {
                var4 = new hn(0, new int[2]);
                ii.a(var4, 81);
                if (23 != cq.field_h.field_c) {
                  break L3;
                } else {
                  ((qs) (Object) cq.field_h).a(param2, var3_int, 89, param1);
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "ld.A(" + -25 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int[][][] param0, int[][][] param1, double[][][] param2, int[][][] param3, int[][][] param4, boolean param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        double var14 = 0.0;
        double[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        double[] var19_ref_double__ = null;
        int var19 = 0;
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
        int[] var44 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        double[] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        double[] var59 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var27 = Kickabout.field_G;
        try {
          L0: {
            var56 = new int[33];
            var48 = var56;
            var40 = var48;
            var32 = var40;
            var10 = var32;
            var57 = new int[33];
            var49 = var57;
            var41 = var49;
            var33 = var41;
            var11 = var33;
            var58 = new int[33];
            var50 = var58;
            var42 = var50;
            var34 = var42;
            var12 = var34;
            var52 = new int[33];
            var44 = var52;
            var36 = var44;
            var28 = var36;
            var13 = var28;
            var59 = new double[33];
            var51 = var59;
            var43 = var51;
            var35 = var43;
            var16 = var35;
            var17 = 1;
            L1: while (true) {
              if (32 < var17) {
                break L0;
              } else {
                var18 = 0;
                L2: while (true) {
                  if (32 < var18) {
                    var18 = 1;
                    L3: while (true) {
                      if (var18 > 32) {
                        var17++;
                        continue L1;
                      } else {
                        var7 = 0;
                        var9 = 0;
                        var6_int = 0;
                        var8 = 0;
                        var14 = 0.0;
                        var19 = 1;
                        L4: while (true) {
                          if (var19 > 32) {
                            var18++;
                            continue L3;
                          } else {
                            var14 = var14 + param2[var17][var18][var19];
                            var7 = var7 + param3[var17][var18][var19];
                            var8 = var8 + param4[var17][var18][var19];
                            var6_int = var6_int + param0[var17][var18][var19];
                            var9 = var9 + param1[var17][var18][var19];
                            var10[var19] = var10[var19] + var6_int;
                            var11[var19] = var11[var19] + var7;
                            var12[var19] = var12[var19] + var8;
                            var13[var19] = var13[var19] + var9;
                            var16[var19] = var16[var19] + var14;
                            param0[var17][var18][var19] = param0[var17 + -1][var18][var19] - -var56[var19];
                            param3[var17][var18][var19] = var57[var19] + param3[var17 - 1][var18][var19];
                            param4[var17][var18][var19] = param4[var17 - 1][var18][var19] - -var58[var19];
                            param1[var17][var18][var19] = param1[var17 - 1][var18][var19] - -var52[var19];
                            param2[var17][var18][var19] = var59[var19] + param2[var17 + -1][var18][var19];
                            var19++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var19_ref_double__ = var16;
                    var20 = var18;
                    var55 = var10;
                    var22 = var18;
                    var54 = var11;
                    var24 = var18;
                    var53 = var12;
                    var52[var18] = 0;
                    var26 = var18;
                    var53[var26] = 0;
                    var54[var24] = 0;
                    var55[var22] = 0;
                    var19_ref_double__[var20] = 0.0;
                    var18++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("ld.B(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          L9: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + false + ')');
        }
    }

    public static void a(byte param0) {
        field_j = null;
        field_b = null;
        field_e = null;
        field_f = null;
        field_i = null;
        field_d = null;
        field_a = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "<%0> and <%1> have ended on a draw with <%2> goal(s) each.";
        field_b = new ld();
        field_g = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        field_i = "Unfortunately we are unable to create an account for you at this time.";
        field_e = new int[8192];
        field_h = field_g.length;
    }
}
