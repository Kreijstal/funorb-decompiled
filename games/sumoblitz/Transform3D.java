/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class Transform3D {
    static SpriteData[] field_a;

    final static int registrationAge(byte guard) {
        if (guard != -97) {
          return -56;
        }
        return IntroFinalFrameResources.field_d;
    }

    public static void releaseStatics(boolean param0) {
        field_a = null;
        if (param0) {
          field_a = (SpriteData[]) null;
        }
    }

    final static void uploadIntMipmaps(int guard, int height, int width, int target, int[] pixels, int internalFormat, int type, int format) {
        int var26 = 0;
        int var27 = 0;
        int incrementValue$4 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var28 = 0;
        var28 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (width > 0 &&
            !IntegerMath.isSingleBitOrZero(width, -113)) {
            throw new IllegalArgumentException("");
          }
          if (height > 0 &&
            !IntegerMath.isSingleBitOrZero(height, -108)) {
            throw new IllegalArgumentException("");
          }
          if (32993 != format) {
            throw new IllegalArgumentException("");
          }
          var8_int = 0;
          if (guard > -64) {
            return;
          }
          stackIn_16_0 = (width < height) ? width : height;
          var9 = stackIn_16_0;
          var10 = width >> 1;
          var11 = height >> 1;
          var12 = pixels;
          var13 = new int[var11 * var10];
          while (true) {
            jaggl.OpenGL.glTexImage2Di(target, var8_int, internalFormat, width, height, 0, format, type, var12, 0);
            if (var9 <= 1) {
              return;
            }
            var15 = 0;
            var24 = 0;
            var25 = width + var24;
            var14 = var13;
            for (var26 = 0; var26 < var11; var26++) {
              for (var27 = 0; var10 > var27; var27++) {
                var16 = var12[var24++];
                var17 = var12[var24++];
                var18 = var12[var25++];
                var21 = var16 >> 8 & 255;
                var19 = var12[var25++];
                var23 = var16 >> 24 & 255;
                var22 = 255 & var16;
                var20 = var16 >> 16 & 255;
                var20 = var20 + ((var17 & 16749302) >> 16);
                var23 = var23 + (var17 >> 24 & 255);
                var21 = var21 + ((65490 & var17) >> 8);
                var22 = var22 + (255 & var17);
                var23 = var23 + (255 & var18 >> 24);
                var21 = var21 + ((65476 & var18) >> 8);
                var22 = var22 + (var18 & 255);
                var20 = var20 + (255 & var18 >> 16);
                var21 = var21 + (var19 >> 8 & 255);
                var23 = var23 + (var19 >> 24 & 255);
                var22 = var22 + (255 & var19);
                var20 = var20 + (255 & var19 >> 16);
                incrementValue$4 = var15;
                var15++;
                var13[incrementValue$4] = LegacyOpenGlInterleavedStream.bitwiseOr(LegacyOpenGlInterleavedStream.bitwiseOr(LegacyOpenGlPostProcessManager.bitwiseAnd(var21, 1020) << 6, LegacyOpenGlInterleavedStream.bitwiseOr(LegacyOpenGlPostProcessManager.bitwiseAnd(16711680, var20 << 14), LegacyOpenGlPostProcessManager.bitwiseAnd(1020, var23) << 22)), LegacyOpenGlPostProcessManager.bitwiseAnd(var22 >> 2, 255));
              }
              var24 = var24 + width;
              var25 = var25 + width;
            }
            var13 = var12;
            width = var10;
            height = var11;
            var12 = var14;
            var8_int++;
            var10 = var10 >> 1;
            var11 = var11 >> 1;
            var9 = var9 >> 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_29_0 = var8;
          stackIn_29_1 = new StringBuilder().append("eu.BA(").append(guard).append(',').append(height).append(',').append(width).append(',').append(target).append(',');
          if (pixels == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(internalFormat).append(',').append(type).append(',').append(format).append(')').toString());
        }
    }

    static {
    }
}
