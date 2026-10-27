/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln {
    final static boolean a(Sprite param0, int param1, int param2, Sprite param3, int param4, int param5) {
        param1 = param1 + param0.offsetX;
        param4 = param4 + param3.offsetX;
        int var6 = param4 - param1;
        int var7 = param0.width;
        if (var6 < param0.width) {
          int var8 = param3.width;
          if (var6 > -param3.width) {
            param2 = param2 + param0.offsetY;
            param5 = param5 + param3.offsetY;
            int var9 = param5 - param2;
            int var10 = param0.height;
            if (var9 < param0.height) {
              int var11 = param3.height;
              if (var9 > -param3.height) {
                int stackIn_9_0 = (var6 > 0) ? var6 : 0;
                int var12 = stackIn_9_0;
                int var13 = var6 + var8;
                if (var13 > var7) {
                  var13 = var7;
                }
                int stackIn_14_0 = (var9 > 0) ? var9 : 0;
                int var14 = stackIn_14_0;
                int var15 = var9 + var11;
                if (var15 > var10) {
                  var15 = var10;
                }
                var13 = var13 - var12;
                var15 = var15 - var14;
                int var16 = var14 * var7 + var12;
                int var17 = var7 - var13;
                int var18 = (var14 - var9) * var8 + (var12 - var6);
                int var19 = var8 - var13;
                int[] var30 = param0.pixels;
                int[] var31 = param3.pixels;
                for (int var22 = var15; var22 > 0; var22--) {
                  for (int var23 = var13; var23 > 0; var23--) {
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
