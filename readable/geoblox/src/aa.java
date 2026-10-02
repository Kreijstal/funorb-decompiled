/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static int field_a;
    static int field_b;

    final static boolean a(Sprite param0, int param1, int param2, Sprite param3, int param4, int param5) {
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
        param1 = param1 + param0.trimX;
        param4 = param4 + param3.trimX;
        var6 = param4 - param1;
        var7 = param0.width;
        if (var6 < param0.width) {
          var8 = param3.width;
          if (var6 > -param3.width) {
            param2 = param2 + param0.trimY;
            param5 = param5 + param3.trimY;
            var9 = param5 - param2;
            var10 = param0.height;
            if (var9 < param0.height) {
              var11 = param3.height;
              if (var9 > -param3.height) {
                if (var6 > 0) {
                  stackIn_9_0 = var6;
                } else {
                  stackIn_9_0 = 0;
                }
                var12 = stackIn_9_0;
                var13 = var6 + var8;
                if (var13 > var7) {
                  var13 = var7;
                }
                if (var9 > 0) {
                  stackIn_14_0 = var9;
                } else {
                  stackIn_14_0 = 0;
                }
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
                var30 = param0.pixels;
                var31 = param3.pixels;
                for (var22 = var15; var22 > 0; var22--) {
                  L7: for (var23 = var13; var23 > 0; var23--) {
                    if (var30[var16] == 0) {
                      var16++;
                      var18++;
                      continue L7;
                    }
                    if (var31[var18] != 0) {
                      field_a = param1 + var12 + var13 - var23;
                      field_b = param2 + var14 + var15 - var22;
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
