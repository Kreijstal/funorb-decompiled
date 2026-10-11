/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    final static boolean a(o param0, int param1, int param2, o param3, int param4, int param5) {
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
        int[] var31;
        param1 = param1 + param0.field_u;
        param4 = param4 + param3.field_u;
        var6 = param4 - param1;
        var7 = param0.field_z;
        if (var6 < param0.field_z) {
          var8 = param3.field_z;
          if (var6 > -param3.field_z) {
            param2 = param2 + param0.field_v;
            param5 = param5 + param3.field_v;
            var9 = param5 - param2;
            var10 = param0.field_p;
            if (var9 < param0.field_p) {
              var11 = param3.field_p;
              if (var9 > -param3.field_p) {
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
                var30 = param0.field_B;
                var31 = param3.field_B;
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
