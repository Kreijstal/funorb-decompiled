/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareRenderTarget implements RenderTarget {
    int height;
    private SoftwareRenderBuffer buffer;
    static IntrusiveDeque field_f;
    int[] pixels;
    int width;
    static int field_h;
    static SpriteData[] field_b;
    static String checkingText;

    public static void releaseStatics(int param0) {
        checkingText = null;
        field_b = null;
        field_f = null;
        if (param0 != 5423) {
          SoftwareRenderTarget.drawGouraudTriangle(-118, -104, 102, (byte) -57, 11, -58, -86, -66, -88, -10, 127, 84, -31, 35, 34, 22);
        }
    }

    final static void drawGouraudTriangle(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var16 = 0;
        int var17 = Sumoblitz.field_L ? 1 : 0;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var16Lifetime4;
        int var16Lifetime5;
        if (param12 >= param8) {
          if (param12 < param2) {
            LruNodeCache.rasterizeGouraudTriangle(param15, param11, param7, param1, SoftwareRasterizer.pixels, param4, param13, param9, param14, param5, param0, param10, param2, param8, (byte) -48, param6, param12);
            var16 = 70 % ((68 - param3) / 35);
            return;
          }
          if (param2 > param8) {
            LruNodeCache.rasterizeGouraudTriangle(param15, param4, param14, param9, SoftwareRasterizer.pixels, param11, param13, param1, param7, param0, param5, param10, param12, param8, (byte) -48, param6, param2);
            var16Lifetime4 = 70 % ((68 - param3) / 35);
            return;
          }
          LruNodeCache.rasterizeGouraudTriangle(param0, param4, param14, param9, SoftwareRasterizer.pixels, param13, param11, param6, param10, param15, param5, param7, param12, param2, (byte) -48, param1, param8);
          var16Lifetime5 = 70 % ((68 - param3) / 35);
          return;
        }
        if (param2 > param8) {
          LruNodeCache.rasterizeGouraudTriangle(param5, param11, param7, param1, SoftwareRasterizer.pixels, param13, param4, param6, param10, param15, param0, param14, param2, param12, (byte) -48, param9, param8);
          var16Lifetime1 = 70 % ((68 - param3) / 35);
          return;
        }
        if (param12 >= param2) {
          LruNodeCache.rasterizeGouraudTriangle(param0, param13, param10, param6, SoftwareRasterizer.pixels, param4, param11, param9, param14, param5, param15, param7, param8, param2, (byte) -48, param1, param12);
          var16Lifetime2 = 70 % ((68 - param3) / 35);
          return;
        }
        LruNodeCache.rasterizeGouraudTriangle(param5, param13, param10, param6, SoftwareRasterizer.pixels, param11, param4, param1, param7, param0, param15, param14, param8, param12, (byte) -48, param9, param2);
        var16Lifetime3 = 70 % ((68 - param3) / 35);
    }

    SoftwareRenderTarget(SoftwareGraphicsToolkit toolkit, ToolkitSprite sprite, SoftwareRenderBuffer renderBuffer) {
        RuntimeException var4 = null;
        SoftwareArgbSprite var5 = null;
        SoftwareRgbSprite var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (sprite instanceof SoftwareRgbSprite) {
            var6 = (SoftwareRgbSprite) (sprite);
            this.width = var6.width;
            this.height = var6.height;
            this.pixels = var6.field_E;
          } else {
            if (!(sprite instanceof SoftwareArgbSprite)) {
              throw new RuntimeException();
            }
            var5 = (SoftwareArgbSprite) (sprite);
            this.width = var5.width;
            this.pixels = var5.field_E;
            this.height = var5.height;
          }
          if (renderBuffer == null) {
            return;
          }
          this.buffer = renderBuffer;
          if (this.width == this.buffer.width &&
            this.height == this.buffer.height) {
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("hi.<init>(");
          if (toolkit == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (sprite == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (renderBuffer == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_f = new IntrusiveDeque();
        checkingText = "Checking";
    }
}
