/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jq extends k {
    static du field_l;
    static int[] field_k;

    final void a(byte param0, lu param1, int param2) {
        if (!(-1 != (param2 ^ -1))) {
            ((jq) this).field_f = (param1.b(16711935) ^ -1) == -2 ? true : false;
        }
        if (param0 != -71) {
            int[] discarded$0 = ((jq) this).a(-28, -75);
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        if (-12 == (jv.field_j ^ -1)) {
            dja.b(false);
        }
        nl.a(qd.field_q, mp.field_p, wk.field_b, -36);
        if (param1 > -122) {
            field_k = null;
        }
        av.a(0, -77, param0, 0);
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var9 = BachelorFridge.field_y;
          var3 = ((jq) this).field_j.a(param0, -1);
          if (((jq) this).field_j.field_m) {
            var15 = ((jq) this).a(0, param0, (byte) 116);
            var14 = ((jq) this).a(1, param0, (byte) 115);
            var13 = ((jq) this).a(2, param0, (byte) 118);
            var7 = 0;
            L1: while (true) {
              if (var7 >= hh.field_d) {
                break L0;
              } else {
                var8 = var13[var7];
                if ((var8 ^ -1) == -4097) {
                  var3[var7] = var15[var7];
                  var7++;
                  continue L1;
                } else {
                  if (0 != var8) {
                    var3[var7] = var8 * var15[var7] + var14[var7] * (-var8 + 4096) >> -2069743956;
                    var7++;
                    continue L1;
                  } else {
                    var3[var7] = var14[var7];
                    var7++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (param1 == 0) {
            break L2;
          } else {
            field_l = null;
            break L2;
          }
        }
        return var3;
    }

    final int[][] a(boolean param0, int param1) {
        int[][] var3 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var31 = null;
        int[][] var41 = null;
        int[][] var51 = null;
        int[][] var52 = null;
        int[][] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int[] var60 = null;
        L0: {
          var19 = BachelorFridge.field_y;
          var51 = ((jq) this).field_h.a(param1, -858);
          var41 = var51;
          var31 = var41;
          var21 = var31;
          var20 = var21;
          var3 = var20;
          if (!((jq) this).field_h.field_b) {
            break L0;
          } else {
            var54 = ((jq) this).a(2, param1, (byte) 114);
            var52 = ((jq) this).a((byte) -112, 0, param1);
            var53 = ((jq) this).a((byte) -98, 1, param1);
            var7 = var51[0];
            var8 = var51[1];
            var9 = var51[2];
            var55 = var52[0];
            var56 = var52[1];
            var57 = var52[2];
            var58 = var53[0];
            var59 = var53[1];
            var60 = var53[2];
            var16 = 0;
            L1: while (true) {
              if (hh.field_d <= var16) {
                break L0;
              } else {
                var17 = var54[var16];
                if (4096 != var17) {
                  var58 = var53[0];
                  if (var17 == 0) {
                    var58 = var53[0];
                    var7[var16] = var58[var16];
                    var8[var16] = var59[var16];
                    var9[var16] = var60[var16];
                    var16++;
                    continue L1;
                  } else {
                    var18 = -var17 + 4096;
                    var7[var16] = var55[var16] * var17 - -(var18 * var58[var16]) >> -867195412;
                    var8[var16] = var59[var16] * var18 + var17 * var56[var16] >> -1538485556;
                    var9[var16] = var60[var16] * var18 + var57[var16] * var17 >> -208183220;
                    var16++;
                    continue L1;
                  }
                } else {
                  var7[var16] = var55[var16];
                  var8[var16] = var56[var16];
                  var9[var16] = var57[var16];
                  var16++;
                  continue L1;
                }
              }
            }
          }
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            field_k = null;
            break L2;
          }
        }
        return var3;
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_k = null;
        }
        field_k = null;
        field_l = null;
    }

    final static rga a(byte param0, String param1) {
        int var5 = 0;
        String var6 = null;
        rga var7 = null;
        int var8 = BachelorFridge.field_y;
        int var2 = param1.length();
        if (!(var2 != -1)) {
            return uc.field_j;
        }
        if (-256 < var2) {
            return rm.field_c;
        }
        String[] var3 = fda.a(-1, '.', param1);
        if (-3 < (var3.length ^ -1)) {
            return uc.field_j;
        }
        String[] var4 = var3;
        if (param0 < 19) {
            field_k = null;
        }
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = ol.a(var6, 5431);
            if (!(var7 == null)) {
                return var7;
            }
        }
        return lia.a(-58, var3[var3.length - 1]);
    }

    public jq() {
        super(3, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new du(14, 0, 4, 1);
    }
}
