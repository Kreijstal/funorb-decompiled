/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    static int field_b;
    static IntrusiveDeque field_a;
    static int field_c;

    public static void releaseStatics(byte param0) {
        if (param0 < 8) {
          field_a = (IntrusiveDeque) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          var5_int = param3 + param0;
          var6 = param1 + param2;
          if (SoftwareRasterizer.clipLeft >= param0) {
            stackIn_4_0 = SoftwareRasterizer.clipLeft;
          } else {
            stackIn_4_0 = param0;
          }
          var7 = stackIn_4_0;
          if (param1 > SoftwareRasterizer.clipTop) {
            stackIn_7_0 = param1;
          } else {
            stackIn_7_0 = SoftwareRasterizer.clipTop;
          }
          var8 = stackIn_7_0;
          if (SoftwareRasterizer.clipRight <= var5_int) {
            stackIn_10_0 = SoftwareRasterizer.clipRight;
          } else {
            stackIn_10_0 = var5_int;
          }
          var9 = stackIn_10_0;
          if (param4) {
            return;
          }
          if (SoftwareRasterizer.clipBottom <= var6) {
            stackIn_15_0 = SoftwareRasterizer.clipBottom;
          } else {
            stackIn_15_0 = var6;
          }
          var10 = stackIn_15_0;
          if (param0 >= SoftwareRasterizer.clipLeft &&
            SoftwareRasterizer.clipRight > param0) {
            var11 = param0 + var8 * SoftwareRasterizer.width;
            var12 = -var8 + var10 + 1 >> 1;
            while (true) {
              var12--;
              if (0 > var12) {
                break;
              }
              SoftwareRasterizer.pixels[var11] = 16777215;
              var11 = var11 + 2 * SoftwareRasterizer.width;
            }
          }
          if (SoftwareRasterizer.clipTop <= param1 &&
            SoftwareRasterizer.clipBottom > var6) {
            var11Lifetime1 = var7 + SoftwareRasterizer.width * param1;
            var12Lifetime1 = -var7 + (var9 + 1) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              SoftwareRasterizer.pixels[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (var5_int >= SoftwareRasterizer.clipLeft &&
            var5_int < SoftwareRasterizer.clipRight) {
            var11Lifetime2 = var5_int + (var8 + (-param0 + var5_int & 1)) * SoftwareRasterizer.width;
            var12Lifetime2 = var10 + 1 - var8 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              SoftwareRasterizer.pixels[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + 2 * SoftwareRasterizer.width;
            }
          }
          if (SoftwareRasterizer.clipTop <= param1) {
            if (SoftwareRasterizer.clipBottom <= var6) {
              return;
            }
            var11Lifetime3 = var7 + (var6 * SoftwareRasterizer.width + (-param1 + var6 & 1));
            var12Lifetime3 = var9 + 1 - var7 >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              SoftwareRasterizer.pixels[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var5), "nn.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_c = 3;
        field_a = new IntrusiveDeque();
    }
}
