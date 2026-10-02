/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    static IndexedSprite[] field_a;

    public static void a(int param0) {
        if (param0 >= -127) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, boolean param1, Sprite param2, int param3, int param4, int param5) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
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
        try {
          var6_int = param2.width;
          var7 = param2.height;
          var8 = 0;
          var9 = 0;
          if (param1) {
            var10 = param2.field_s;
            var11 = param2.field_o;
            var12 = (var10 << 16) / param4;
            var13 = (var11 << 16) / param0;
            if (param2.trimX > 0) {
              var14 = ((param2.trimX << 16) + (var12 - 1)) / var12;
              var8 = var8 + (-(param2.trimX << 16) + var12 * var14);
              param5 = param5 + var14;
            }
            if (var6_int < var10) {
              param4 = (var12 + ((var6_int << 16) + (-var8 - 1))) / var12;
            }
            if (param2.trimY > 0) {
              var14 = ((param2.trimY << 16) + var13 - 1) / var13;
              var9 = var9 + (var14 * var13 - (param2.trimY << 16));
              param3 = param3 + var14;
            }
            if (var11 > var7) {
              param0 = (var13 + (-var9 + (var7 << 16)) - 1) / var13;
            }
            var14 = param5 + SoftwareRasterizer.stride * param3;
            var15 = SoftwareRasterizer.stride - param4;
            if (SoftwareRasterizer.clipBottom < param3 + param0) {
              param0 = param0 - (-SoftwareRasterizer.clipBottom + param3 + param0);
            }
            if (SoftwareRasterizer.clipTop > param3) {
              var16 = SoftwareRasterizer.clipTop - param3;
              var9 = var9 + var13 * var16;
              param0 = param0 - var16;
              var14 = var14 + SoftwareRasterizer.stride * var16;
            }
            if (param4 + param5 > SoftwareRasterizer.clipRight) {
              var16 = param5 + (param4 - SoftwareRasterizer.clipRight);
              var15 = var15 + var16;
              param4 = param4 - var16;
            }
            if (param5 < SoftwareRasterizer.clipLeft) {
              var16 = SoftwareRasterizer.clipLeft - param5;
              var14 = var14 + var16;
              var15 = var15 + var16;
              var8 = var8 + var16 * var12;
              param4 = param4 - var16;
            }
            lc.a(var8, param0, SoftwareRasterizer.framebuffer, var12, var13, var6_int, var9, var15, var14, param4, (byte) -104, param2.pixels, 0);
            return;
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_26_0 = (RuntimeException) (var6);

          stackIn_26_1 = new StringBuilder().append("ek.A(").append(param0).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
            stackIn_27_2 = "null";
          } else {
            stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
    }
}
