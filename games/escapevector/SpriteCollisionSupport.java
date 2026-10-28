/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteCollisionSupport {
    final static boolean spritesOverlap(Sprite first, int firstX, int firstY, Sprite second, int secondX, int secondY) {
        firstX = firstX + first.offsetX;
        secondX = secondX + second.offsetX;
        int var6 = secondX - firstX;
        int var7 = first.width;
        if (var6 < first.width) {
          int var8 = second.width;
          if (var6 > -second.width) {
            firstY = firstY + first.offsetY;
            secondY = secondY + second.offsetY;
            int var9 = secondY - firstY;
            int var10 = first.height;
            if (var9 < first.height) {
              int var11 = second.height;
              if (var9 > -second.height) {
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
                int[] var30 = first.pixels;
                int[] var31 = second.pixels;
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
