/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    final static int a(int param0, int param1, int[] param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var21 = null;
        var12 = VoidHunters.field_G;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        if (param1 > -25) {
          var13 = null;
          int discarded$2 = tf.a(-23, -46, (int[]) null);
          var6_int = 0;
          L0: while (true) {
            if (param2.length <= var6_int) {
              var5 = var5 / (param2.length >> -1125813791);
              var4 = var4 / (param2.length >> -1873997695);
              var19 = new int[param2.length];
              var16 = var19;
              var15 = var16;
              var14 = var15;
              var6 = var14;
              var7 = 0;
              L1: while (true) {
                if (param2.length <= var7) {
                  var7 = 0;
                  L2: while (true) {
                    if (var7 >= var19.length + -2) {
                      var3 = var3 / 2;
                      return var3;
                    } else {
                      var8 = var19[var7] >> param0;
                      var9 = var6[1 + var7] >> param0;
                      var10 = var6[2 + var7] >> param0;
                      var11 = var6[var7 + 3] >> param0;
                      var3 = var3 + (var8 * var11 + -(var10 * var9));
                      var7 += 2;
                      continue L2;
                    }
                  }
                } else {
                  var6[var7] = -var4 + param2[var7];
                  var6[var7 + 1] = param2[1 + var7] - var5;
                  var7 += 2;
                  continue L1;
                }
              }
            } else {
              var7 = param2[var6_int];
              var4 = var4 + var7;
              var8 = param2[1 + var6_int];
              var5 = var5 + var8;
              var6_int += 2;
              continue L0;
            }
          }
        } else {
          var6_int = 0;
          L3: while (true) {
            if (param2.length <= var6_int) {
              var5 = var5 / (param2.length >> -1125813791);
              var4 = var4 / (param2.length >> -1873997695);
              var21 = new int[param2.length];
              var18 = var21;
              var15 = var18;
              var14 = var15;
              var6 = var14;
              var7 = 0;
              L4: while (true) {
                if (param2.length <= var7) {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var21.length + -2) {
                      var3 = var3 / 2;
                      return var3;
                    } else {
                      var8 = var21[var7] >> param0;
                      var9 = var6[1 + var7] >> param0;
                      var10 = var6[2 + var7] >> param0;
                      var11 = var6[var7 + 3] >> param0;
                      var3 = var3 + (var8 * var11 + -(var10 * var9));
                      var7 += 2;
                      continue L5;
                    }
                  }
                } else {
                  var6[var7] = -var4 + param2[var7];
                  var6[var7 + 1] = param2[1 + var7] - var5;
                  var7 += 2;
                  continue L4;
                }
              }
            } else {
              var7 = param2[var6_int];
              var4 = var4 + var7;
              var8 = param2[1 + var6_int];
              var5 = var5 + var8;
              var6_int += 2;
              continue L3;
            }
          }
        }
    }

    static {
    }
}
