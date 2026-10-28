/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CoverageBitmapFont extends BitmapFont {
    private byte[][] field_O;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        int var9 = param1 + param2 * SoftwareRasterizer.width;
        int var10 = SoftwareRasterizer.width - param3;
        int var11 = 0;
        int var12 = 0;
        if (param2 < SoftwareRasterizer.clipTop) {
          int var13 = SoftwareRasterizer.clipTop - param2;
          param4 = param4 - var13;
          param2 = SoftwareRasterizer.clipTop;
          var12 = var12 + var13 * param3;
          var9 = var9 + var13 * SoftwareRasterizer.width;
        }
        if (param2 + param4 > SoftwareRasterizer.clipBottom) {
          param4 = param4 - (param2 + param4 - SoftwareRasterizer.clipBottom);
        }
        if (param1 < SoftwareRasterizer.clipLeft) {
          int var13Lifetime1 = SoftwareRasterizer.clipLeft - param1;
          param3 = param3 - var13Lifetime1;
          param1 = SoftwareRasterizer.clipLeft;
          var12 = var12 + var13Lifetime1;
          var9 = var9 + var13Lifetime1;
          var11 = var11 + var13Lifetime1;
          var10 = var10 + var13Lifetime1;
        }
        if (param1 + param3 > SoftwareRasterizer.clipRight) {
          int var13Lifetime2 = param1 + param3 - SoftwareRasterizer.clipRight;
          param3 = param3 - var13Lifetime2;
          var11 = var11 + var13Lifetime2;
          var10 = var10 + var13Lifetime2;
        }
        if (param3 > 0 &&
          param4 > 0) {
          if (!param7) {
            CoverageBitmapFont.a(SoftwareRasterizer.pixels, this.field_O[param0], param5, var12, var9, param3, param4, var10, var11, param6);
          } else {
            ih.a(SoftwareRasterizer.pixels, this.field_O[param0], param5, var12, var9, param3, param4, var10, var11, param6);
          }
          return;
        }
    }

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        for (int var10 = -param6; var10 < 0; var10++) {
          for (int var11 = -param5; var11 < 0; var11++) {
            int incrementValue$11 = param3;
            param3++;
            int var12 = (255 & param1[incrementValue$11]) * param9 >> 8;
            if (var12 == 0) {
              param4++;
            } else {
              int var13 = ((param2 & 16711935) * var12 & -16711936) + ((param2 & 65280) * var12 & 16711680) >> 8;
              var12 = 256 - var12;
              int var14 = param0[param4];
              int incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = (((var14 & 16711935) * var12 & -16711936) + ((var14 & 65280) * var12 & 16711680) >> 8) + var13;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final static byte[][] a(int[] param0, byte[][] param1) {
        for (int var2_int = 0; var2_int < param0.length; var2_int++) {
          int var3 = param0[var2_int];
          int var4_int = (var3 >> 15 & 510) + (var3 & 255);
          param0[var2_int] = var4_int / 3 + (var3 >> 8 & 255) >> 1;
        }
        byte[][] var2 = param1;
        for (int var3Lifetime1 = 0; var3Lifetime1 < var2.length; var3Lifetime1++) {
          byte[] var4 = var2[var3Lifetime1];
          for (int var5 = 0; var5 < var4.length; var5++) {
            int var6 = var4[var5];
            if (var6 != 0) {
              var4[var5] = (byte)param0[var6];
            }
          }
        }
        return param1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int var8 = param1 + param2 * SoftwareRasterizer.width;
        int var9 = SoftwareRasterizer.width - param3;
        int var10 = 0;
        int var11 = 0;
        if (param2 < SoftwareRasterizer.clipTop) {
          int var12 = SoftwareRasterizer.clipTop - param2;
          param4 = param4 - var12;
          param2 = SoftwareRasterizer.clipTop;
          var11 = var11 + var12 * param3;
          var8 = var8 + var12 * SoftwareRasterizer.width;
        }
        if (param2 + param4 > SoftwareRasterizer.clipBottom) {
          param4 = param4 - (param2 + param4 - SoftwareRasterizer.clipBottom);
        }
        if (param1 < SoftwareRasterizer.clipLeft) {
          int var12Lifetime1 = SoftwareRasterizer.clipLeft - param1;
          param3 = param3 - var12Lifetime1;
          param1 = SoftwareRasterizer.clipLeft;
          var11 = var11 + var12Lifetime1;
          var8 = var8 + var12Lifetime1;
          var10 = var10 + var12Lifetime1;
          var9 = var9 + var12Lifetime1;
        }
        if (param1 + param3 > SoftwareRasterizer.clipRight) {
          int var12Lifetime2 = param1 + param3 - SoftwareRasterizer.clipRight;
          param3 = param3 - var12Lifetime2;
          var10 = var10 + var12Lifetime2;
          var9 = var9 + var12Lifetime2;
        }
        if (param3 > 0 &&
          param4 > 0) {
          if (!param6) {
            CoverageBitmapFont.a(SoftwareRasterizer.pixels, this.field_O[param0], param5, var11, var8, param3, param4, var9, var10);
          } else {
            ih.a(SoftwareRasterizer.pixels, this.field_O[param0], param5, var11, var8, param3, param4, var9, var10);
          }
          return;
        }
    }

    CoverageBitmapFont(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4, int[] param5, byte[][] param6) {
        super(param0, param1, param2, param3, param4);
        this.field_O = new byte[256][];
        this.field_O = CoverageBitmapFont.a(param5, param6);
    }

    private final static void a(int[] param0, byte[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        for (int var9 = -param6; var9 < 0; var9++) {
          for (int var10 = -param5; var10 < 0; var10++) {
            int incrementValue$11 = param3;
            param3++;
            int var11 = 255 & param1[incrementValue$11];
            if (var11 == 0) {
              param4++;
            } else {
              int var12 = ((param2 & 16711935) * var11 & -16711936) + ((param2 & 65280) * var11 & 16711680) >> 8;
              var11 = 256 - var11;
              int var13 = param0[param4];
              int incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = (((var13 & 16711935) * var11 & -16711936) + ((var13 & 65280) * var11 & 16711680) >> 8) + var12;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }
}
