/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropDownArrowRenderer implements WidgetRenderer {
    static String ageText;
    static qr field_b;

    public static void releaseStatics(byte param0) {
        if (param0 >= -100) {
          DropDownArrowRenderer.releaseStatics((byte) -19);
        }
        ageText = null;
        field_b = null;
    }

    public final void renderWidget(UiWidget widget, int parentY, int guard, boolean isEnabled, int parentX) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var6_intLifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != 5592405) {
            DropDownArrowRenderer.releaseStatics((byte) 119);
          }
          for (var6_int = 0; widget.height >= var6_int; var6_int++) {
            var7 = 152 + 48 * var6_int / widget.height;
            var8 = var7 << 16 | var7 << 8 | var7;
            SoftwareRasterizer.drawHorizontalLine(parentX + widget.x, var6_int + widget.y + parentY, widget.width, var8);
          }
          for (var6_intLifetime1 = 1; var6_intLifetime1 <= 5; var6_intLifetime1++) {
            var7Lifetime1 = -(widget.width >> 1) + (widget.width + (parentX + widget.x) + (-5 + var6_intLifetime1));
            var8Lifetime1 = -(2 * var6_intLifetime1) + (widget.width >> 1);
            var9 = (-4 + widget.height >> 1) + (parentY + widget.y + var6_intLifetime1);
            if (var9 >= SoftwareRasterizer.clipTop &&
              SoftwareRasterizer.clipBottom > var9) {
              if (SoftwareRasterizer.clipLeft < var7Lifetime1) {
                SoftwareRasterizer.pixels[var9 * SoftwareRasterizer.width - (-var7Lifetime1 + 1)] = LegacyOpenGlPostProcessManager.bitwiseAnd(16711422, SoftwareRasterizer.pixels[var7Lifetime1 + (var9 * SoftwareRasterizer.width - 1)]) >> 1;
              }
              if (var7Lifetime1 + var8Lifetime1 < SoftwareRasterizer.clipRight) {
                SoftwareRasterizer.pixels[var8Lifetime1 + (var9 * SoftwareRasterizer.width + var7Lifetime1)] = LegacyOpenGlPostProcessManager.bitwiseAnd(8355711, SoftwareRasterizer.pixels[var9 * SoftwareRasterizer.width + var7Lifetime1 + var8Lifetime1] >> 1);
              }
            }
            SoftwareRasterizer.drawHorizontalLine(var7Lifetime1, var9, var8Lifetime1, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("fm.A(");
          if (widget == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(parentY).append(',').append(guard).append(',').append(isEnabled).append(',').append(parentX).append(')').toString());
        }
    }

    static {
        ageText = "Age:";
        field_b = new qr();
    }
}
