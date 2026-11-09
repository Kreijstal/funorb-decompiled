/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareTransform3D extends Transform3D {
    static int[] field_c;
    static String typeYourEmailAddressText;
    static String unpackingGraphicsText;
    static RasterIndexedSprite[] field_f;
    static int field_b;

    final static void drawNineSlice(int x, Sprite[] sprites, byte guard, int y, int height, int width) {
        int var21 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (sprites == null) {
            return;
          }
          if (width > 0 &&
            height > 0) {
            if (sprites[3] == null) {
              stackIn_10_0 = 0;
            } else {
              stackIn_10_0 = sprites[3].field_z;
            }
            var6_int = stackIn_10_0;
            if (null == sprites[5]) {
              stackIn_13_0 = 0;
            } else {
              stackIn_13_0 = sprites[5].field_z;
            }
            var7 = stackIn_13_0;
            if (null == sprites[1]) {
              stackIn_16_0 = 0;
            } else {
              stackIn_16_0 = sprites[1].field_w;
            }
            var8 = stackIn_16_0;
            if (sprites[7] != null) {
              stackIn_19_0 = sprites[7].field_w;
            } else {
              stackIn_19_0 = 0;
            }
            var9 = stackIn_19_0;
            var10 = x + width;
            var11 = y + height;
            var12 = x + var6_int;
            var13 = var10 - var7;
            var14 = y + var8;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var16 > var17) {
              var17 = x + width * var6_int / (var7 + var6_int);
              var16 = x + width * var6_int / (var7 + var6_int);
            }
            var18 = var14;
            if (guard != -34) {
              field_b = 71;
            }
            var19 = var15;
            SoftwareRasterizer.saveClip(FullscreenDisplayMode.field_f);
            if (var19 < var18) {
              var19 = y + height * var8 / (var8 + var9);
              var18 = y + height * var8 / (var8 + var9);
            }
            if (sprites[0] != null) {
              SoftwareRasterizer.intersectClip(x, y, var16, var18);
              sprites[0].draw(x, y);
              SoftwareRasterizer.restoreClip(FullscreenDisplayMode.field_f);
            }
            if (null != sprites[2]) {
              SoftwareRasterizer.intersectClip(var17, y, var10, var18);
              sprites[2].draw(var13, y);
              SoftwareRasterizer.restoreClip(FullscreenDisplayMode.field_f);
            }
            if (sprites[6] != null) {
              SoftwareRasterizer.intersectClip(x, var19, var16, var11);
              sprites[6].draw(x, var15);
              SoftwareRasterizer.restoreClip(FullscreenDisplayMode.field_f);
            }
            if (null != sprites[8]) {
              SoftwareRasterizer.intersectClip(var17, var19, var10, var11);
              sprites[8].draw(var13, var15);
              SoftwareRasterizer.restoreClip(FullscreenDisplayMode.field_f);
            }
            if (sprites[1] != null &&
              0 != sprites[1].field_z) {
              SoftwareRasterizer.intersectClip(var16, y, var17, var18);
              for (var20 = var12; var13 > var20; var20 = var20 + sprites[1].field_z) {
                sprites[1].draw(var20, y);
              }
              SoftwareRasterizer.restoreClip(FullscreenDisplayMode.field_f);
            }
            if (sprites[7] != null &&
              sprites[7].field_z != 0) {
              SoftwareRasterizer.intersectClip(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + sprites[7].field_z) {
                sprites[7].draw(var20Lifetime1, var15);
              }
              SoftwareRasterizer.restoreClip(FullscreenDisplayMode.field_f);
            }
            if (null != sprites[3] &&
              sprites[3].field_w != 0) {
              SoftwareRasterizer.intersectClip(x, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + sprites[3].field_w) {
                sprites[3].draw(x, var20Lifetime2);
              }
              SoftwareRasterizer.restoreClip(FullscreenDisplayMode.field_f);
            }
            if (sprites[5] != null &&
              sprites[5].field_w != 0) {
              SoftwareRasterizer.intersectClip(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + sprites[5].field_w) {
                sprites[5].draw(var13, var20Lifetime3);
              }
              SoftwareRasterizer.restoreClip(FullscreenDisplayMode.field_f);
            }
            if (sprites[4] != null &&
              sprites[4].field_z != 0) {
              if (0 == sprites[4].field_w) {
                return;
              }
              SoftwareRasterizer.intersectClip(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + sprites[4].field_w) {
                for (var21 = var12; var13 > var21; var21 = var21 + sprites[4].field_z) {
                  sprites[4].draw(var21, var20Lifetime4);
                }
              }
              SoftwareRasterizer.restoreClip(FullscreenDisplayMode.field_f);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_77_0 = var6;
          stackIn_77_1 = new StringBuilder().append("kn.A(").append(x).append(',');
          if (sprites == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(guard).append(',').append(y).append(',').append(height).append(',').append(width).append(')').toString());
        }
    }

    final static char a(byte param0, byte param1) {
        int var3 = 0;
        int var2 = param0 & 255;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (param1 <= -29) {
          if (var2 >= 128 &&
            var2 < 160) {
            var3 = AccountCreationProgressDialog.CP1252_EXTENSION[var2 - 128];
            if (0 == var3) {
              var3 = 63;
            }
            var2 = var3;
          }
          return (char)var2;
        }
        return '^';
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        if (param0 != -1) {
          return;
        }
        field_c = null;
        typeYourEmailAddressText = null;
        unpackingGraphicsText = null;
    }

    SoftwareTransform3D() {
        this.a(56);
    }

    final static void a(boolean param0, int param1) {
        jv.a(true, (byte) -71, param0);
        int var2 = 48 % ((-25 - param1) / 41);
    }

    private final void a(int param0) {
        if (param0 != 56) {
          SoftwareTransform3D.releaseStatics(-32);
        }
    }

    final static void a(boolean param0, byte param1) {
        if (BeveledCheckboxRenderer.hasOpenDialogs(false)) {
          if (param1 != -122) {
            field_b = 120;
          }
          if (param0) {
            SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, 192);
          }
          pu.field_e.render(0, 0, false);
          return;
        }
    }

    static {
        typeYourEmailAddressText = "Type your email address again to make sure it's correct";
        field_c = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        unpackingGraphicsText = "Unpacking graphics";
    }
}
