/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComboBoxArrowRenderer implements UiRenderer {
    static String protectVipText;

    public final void drawComponent(int param0, UiComponent param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var6_intLifetime1;
        int var6_intLifetime2;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = VoidHunters.field_G;
        try {
          for (var6_int = 0; param1.height >= var6_int; var6_int++) {
            var7 = 152 + 48 * var6_int / param1.height;
            var8 = var7 | (var7 << 8 | var7 << 16);
            SoftwareRasterizer2D.drawHorizontalLine(param1.x + param2, var6_int + param1.y + param3, param1.width, var8);
          }
          for (var6_intLifetime1 = 1; 5 >= var6_intLifetime1; var6_intLifetime1++) {
            var7Lifetime1 = var6_intLifetime1 - 5 + (param1.x + param2 + (param1.width - (param1.width >> 1)));
            var8Lifetime1 = -(2 * var6_intLifetime1) + (param1.width >> 1);
            var9 = (param1.height - 4 >> 1) + (param3 - (-param1.y - var6_intLifetime1));
            if (SoftwareRasterizer2D.clipTop <= var9 &&
              var9 < SoftwareRasterizer2D.clipBottom) {
              if (var7Lifetime1 > SoftwareRasterizer2D.clipLeft) {
                SoftwareRasterizer2D.pixels[-1 + (var9 * SoftwareRasterizer2D.width + var7Lifetime1)] = MenuBackgroundBattle.andBits(8355711, SoftwareRasterizer2D.pixels[-1 + var9 * SoftwareRasterizer2D.width + var7Lifetime1] >> 1);
              }
              if (SoftwareRasterizer2D.clipRight > var7Lifetime1 + var8Lifetime1) {
                SoftwareRasterizer2D.pixels[SoftwareRasterizer2D.width * var9 - (-var7Lifetime1 - var8Lifetime1)] = MenuBackgroundBattle.andBits(SoftwareRasterizer2D.pixels[var8Lifetime1 + var7Lifetime1 + SoftwareRasterizer2D.width * var9] >> 1, 8355711);
              }
            }
            SoftwareRasterizer2D.drawHorizontalLine(var7Lifetime1, var9, var8Lifetime1, 0);
          }
          var6_intLifetime2 = 113 / ((-27 - param0) / 35);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("pbb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static GraphicsToolkit createOpenGlGpuToolkit(ResourceArchive param0, int param1, int param2, TextureProvider param3, java.awt.Canvas param4) {
        RuntimeException var5 = null;
        long var6 = 0L;
        OpenGlGpuToolkit var8 = null;
        jaggl.OpenGL var9 = null;
        GraphicsToolkit stackIn_11_0 = null;
        OpenGlGpuToolkit stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!GetBots.loadHardwareRendererLibraries((byte) 121)) {
            throw new RuntimeException("");
          }
          if (!RasterBuffer.tryLoadNativeLibrary("jaggl", (byte) 114)) {
            throw new RuntimeException("");
          }
          var9 = new jaggl.OpenGL();
          var6 = var9.init(param4, 8, 8, 8, 24, 0, param1);
          if (var6 == 0L) {
            throw new RuntimeException("");
          }
          var8 = new OpenGlGpuToolkit(var9, param4, var6, param3, param0, param1);
          if (param2 != -1588388127) {
            stackIn_11_0 = (GraphicsToolkit) null;
            return stackIn_11_0;
          }
          var8.initializeGpuResources(-31089);
          stackIn_13_0 = var8;
          return (GraphicsToolkit) ((Object) stackIn_13_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("pbb.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        protectVipText = null;
        if (param0 != -652030847) {
          java.awt.Canvas var2 = (java.awt.Canvas) null;
          UiComboBoxArrowRenderer.createOpenGlGpuToolkit((ResourceArchive) null, 54, 122, (TextureProvider) null, (java.awt.Canvas) null);
          return;
        }
    }

    static {
        protectVipText = "Protect your VIP";
    }
}
