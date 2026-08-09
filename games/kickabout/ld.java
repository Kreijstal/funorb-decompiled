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
        int var4_int = 0;
        hn var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var3_int = -1;
              if (param0 == -25) {
                break L1;
              } else {
                ld.a((int[][][]) null, (int[][][]) null, (double[][][]) null, (int[][][]) null, (int[][][]) null, false);
                break L1;
              }
            }
            var4_int = 0;
            L2: while (true) {
              L3: {
                if (var4_int >= 9) {
                  break L3;
                } else {
                  if (ic.field_h.field_i[ic.field_h.field_q[var4_int]].c(-2)) {
                    var3_int = var4_int;
                    break L3;
                  } else {
                    var4_int++;
                    continue L2;
                  }
                }
              }
              L4: {
                var4 = new hn(0, new int[]{1 + param1, param2});
                ii.a(var4, 81);
                if (23 != cq.field_h.field_c) {
                  break L4;
                } else {
                  ((qs) ((Object) cq.field_h)).a(param2, var3_int, param0 ^ -66, param1);
                  break L4;
                }
              }
              break L0;
            }
          }
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
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
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
        var27 = Kickabout.field_G;
        try {
          L0: {
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
            var17 = 1;
            L1: while (true) {
              if (32 < var17) {
                L2: {
                  if (!param5) {
                    break L2;
                  } else {
                    field_g = (byte[]) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var18 = 0;
                L3: while (true) {
                  if (32 < var18) {
                    var18 = 1;
                    L4: while (true) {
                      if (-33 > (var18 ^ -1)) {
                        var17++;
                        continue L1;
                      } else {
                        var7 = 0;
                        var9 = 0;
                        var6_int = 0;
                        var8 = 0;
                        var14 = 0.0;
                        var19 = 1;
                        L5: while (true) {
                          if (-33 > (var19 ^ -1)) {
                            var18++;
                            continue L4;
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
                            param0[var17][var18][var19] = param0[var17 + -1][var18][var19] - -var40[var19];
                            param3[var17][var18][var19] = var41[var19] + param3[var17 - 1][var18][var19];
                            param4[var17][var18][var19] = param4[var17 - 1][var18][var19] - -var42[var19];
                            param1[var17][var18][var19] = param1[var17 - 1][var18][var19] - -var36[var19];
                            param2[var17][var18][var19] = var43[var19] + param2[var17 + -1][var18][var19];
                            var19++;
                            continue L5;
                          }
                        }
                      }
                    }
                  } else {
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
                    var18++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var6);

            stackIn_18_1 = new StringBuilder().append("ld.B(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param4 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), stackIn_31_2 + ',' + param5 + ')');
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
