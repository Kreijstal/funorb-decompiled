/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    final static boolean a(qb param0, int param1, int param2, ll param3, int param4, int param5) {
        int var22 = 0;
        int var23 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int[] var30;
        byte[] var31;
        param1 = param1 + param0.field_x;
        param4 = param4 + param3.field_j;
        var6 = param4 - param1;
        var7 = param0.field_q;
        if (var6 < param0.field_q) {
          var8 = param3.field_h;
          if (var6 > -param3.field_h) {
            param2 = param2 + param0.field_o;
            param5 = param5 + param3.field_f;
            var9 = param5 - param2;
            var10 = param0.field_y;
            if (var9 < param0.field_y) {
              var11 = param3.field_c;
              if (var9 > -param3.field_c) {
                stackIn_9_0 = (var6 > 0) ? var6 : 0;
                var12 = stackIn_9_0;
                var13 = var6 + var8;
                if (var13 > var7) {
                  var13 = var7;
                }
                stackIn_14_0 = (var9 > 0) ? var9 : 0;
                var14 = stackIn_14_0;
                var15 = var9 + var11;
                if (var15 > var10) {
                  var15 = var10;
                }
                var13 = var13 - var12;
                var15 = var15 - var14;
                var16 = var14 * var7 + var12;
                var17 = var7 - var13;
                var18 = (var14 - var9) * var8 + (var12 - var6);
                var19 = var8 - var13;
                var30 = param0.field_A;
                var31 = param3.field_m;
                for (var22 = var15; var22 > 0; var22--) {
                  for (var23 = var13; var23 > 0; var23--) {
                    if (var30[var16] != 0 &&
                      var31[var18] != 0) {
                      return true;
                    }
                    var16++;
                    var18++;
                  }
                  var16 = var16 + var17;
                  var18 = var18 + var19;
                }
                return false;
              }
            }
            return false;
          }
        }
        return false;
    }
}
