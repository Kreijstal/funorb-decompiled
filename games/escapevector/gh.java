/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    final static void a(int param0, int param1, boolean param2, boolean param3) {
        gh.a(param0, param1, 0, param2, param3);
    }

    private final static void a(int param0, int param1, int param2, boolean param3, boolean param4) {
        int var6;
        int var7;
        int var5 = (param2 & 16711935) * (256 - param1) >>> 8 & 16711935;
        param2 = var5 | (param2 & 65280) * (256 - param1) >>> 8 & 65280;
        int var8 = 0;
        if (!param3) {
          var6 = 0;
        } else {
          var6 = (SoftwareRasterizer.width - 1) % param0;
          var8 = var8 + (param0 - 1);
        }
        if (!param4) {
          var7 = 0;
        } else {
          var7 = (SoftwareRasterizer.height - 1) % param0;
          var8 = var8 + (param0 - 1) * SoftwareRasterizer.width;
        }
        int var9 = var7 * SoftwareRasterizer.width + var6;
        int var10 = SoftwareRasterizer.width * param0 - (SoftwareRasterizer.width + param0 - 1) / param0 * param0;
        for (int var11 = var7; var11 < SoftwareRasterizer.height; var11 = var11 + param0) {
          for (int var12 = var6; var12 < SoftwareRasterizer.width; var12 = var12 + param0) {
            int var13 = SoftwareRasterizer.pixels[var9];
            int var14 = (var13 & 16711935) * param1 >>> 8 & 16711935;
            var13 = (var14 | (var13 & 65280) * param1 >>> 8 & 65280) + param2;
            int var15 = param0;
            int var16 = param0;
            int var17 = var9 - var8;
            int var18 = SoftwareRasterizer.width;
            if (!param3) {
              if (var15 > SoftwareRasterizer.width - var12) {
                var15 = SoftwareRasterizer.width - var12;
              }
            } else if (var15 > var12 + 1) {
              var17 = var17 + (var15 - var12 - 1);
              var15 = var12 + 1;
            }
            if (!param4) {
              if (var16 > SoftwareRasterizer.height - var11) {
                var16 = SoftwareRasterizer.height - var11;
              }
            } else if (var16 > var11 + 1) {
              var17 = var17 + (var16 - var11 - 1) * var18;
              var16 = var11 + 1;
            }
            var18 = var18 - var15;
            var15 = -var15;
            var16 = -var16;
            for (int var19 = var16; var19 < 0; var19++) {
              for (int var20 = var15; var20 < 0; var20++) {
                int incrementValue$0 = var17;
                var17++;
                SoftwareRasterizer.pixels[incrementValue$0] = var13;
              }
              var17 = var17 + var18;
            }
            var9 = var9 + param0;
          }
          var9 = var9 + var10;
        }
    }
}
