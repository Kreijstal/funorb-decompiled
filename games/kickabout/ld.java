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
        int var5 = Kickabout.field_G;
        int var3 = -1;
        if (param0 != -25) {
            ld.a((int[][][]) null, (int[][][]) null, (double[][][]) null, (int[][][]) null, (int[][][]) null, false);
        }
        for (var4_int = 0; var4_int < 9; var4_int++) {
            if (!(!ic.field_h.field_i[ic.field_h.field_q[var4_int]].c(-2))) {
                var3 = var4_int;
                break;
            }
        }
        hn var4 = new hn(0, new int[2]);
        ii.a(var4, 81);
        if (23 == cq.field_h.field_c) {
            ((qs) (Object) cq.field_h).a(param2, var3, param0 ^ -66, param1);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int[][][] param0, int[][][] param1, double[][][] param2, int[][][] param3, int[][][] param4, boolean param5) {
        int var6 = 0;
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
        var27 = Kickabout.field_G;
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
        L0: while (true) {
          if (32 < var17) {
            L1: {
              if (!param5) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            return;
          } else {
            var18 = 0;
            L2: while (true) {
              if (32 < var18) {
                var18 = 1;
                L3: while (true) {
                  if (-33 > (var18 ^ -1)) {
                    var17++;
                    continue L0;
                  } else {
                    var7 = 0;
                    var9 = 0;
                    var6 = 0;
                    var8 = 0;
                    var14 = 0.0;
                    var19 = 1;
                    L4: while (true) {
                      if (-33 > (var19 ^ -1)) {
                        var18++;
                        continue L3;
                      } else {
                        var14 = var14 + param2[var17][var18][var19];
                        var7 = var7 + param3[var17][var18][var19];
                        var8 = var8 + param4[var17][var18][var19];
                        var6 = var6 + param0[var17][var18][var19];
                        var9 = var9 + param1[var17][var18][var19];
                        var10[var19] = var10[var19] + var6;
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

    public static void a(byte param0) {
        field_j = null;
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
