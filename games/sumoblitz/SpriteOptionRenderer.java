/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SpriteOptionRenderer extends TextWidgetRenderer {
    private RasterIndexedSprite[] stateSprites;
    static int[] field_o;
    static long field_n;

    final static int fullscreenDialogWidth(int guard) {
        if (guard != -25843) {
          IntrusiveDeque var2 = (IntrusiveDeque) null;
          SpriteOptionRenderer.emitBurstParticles(-92, -128, -112, -123, (IntrusiveDeque) null, -24);
          return -VertexStreamLayout.field_b + PlayingSound.field_n;
        }
        return -VertexStreamLayout.field_b + PlayingSound.field_n;
    }

    SpriteOptionRenderer(RasterIndexedSprite[] sprites) {
        try {
          this.font = kw.field_b;
          this.stateSprites = sprites;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "uv.<init>(" + (sprites != null ? "{...}" : "null") + ')');
        }
    }

    final static void emitBurstParticles(int color, int yQ8, int guard, int xQ8, IntrusiveDeque particles, int maxSpeed) {
        float[] dupTemp$2 = null;
        int var6_int = 0;
        float[] var7 = null;
        BurstParticle var8 = null;
        int var9 = 0;
        float[] var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        float[] var7Lifetime1;
        BurstParticle var8Lifetime1;
        float[] var7Lifetime2;
        float[] var7Lifetime1Lifetime1;
        int var6_intLifetime1;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          var6_int = 0;
          if (guard != -9) {
            return;
          }
          while (8 > var6_int) {
            var7 = new float[]{0.0f, (float)(-(ExpandingRingEffect.nextRandomInt(maxSpeed, HardwareGraphicsHeap.field_o, (byte) -96) + 1))};
            var13 = kt.a((byte) -115, var7, (float)(0.0 + (double)(2048.0f / (float)var6_int) * 0.017453292519943295));
            var12 = var13;
            var10 = var12;
            var7Lifetime2 = var10;
            var8 = new BurstParticle(24, xQ8, yQ8, color, (int)var13[0] << 8, (int)var13[1] << 8, 0);
            particles.addLast((IntrusiveNode) (var8), (byte) 39);
            var6_int++;
          }
          for (var6_intLifetime1 = 0; var6_intLifetime1 < 8; var6_intLifetime1++) {
            var7Lifetime1 = new float[]{0.0f, (float)(-(1 + ExpandingRingEffect.nextRandomInt(maxSpeed, HardwareGraphicsHeap.field_o, (byte) -96)))};
            dupTemp$2 = kt.a((byte) -92, var7Lifetime1, (float)(0.0 + 0.017453292519943295 * (double)(2048.0f / (float)var6_intLifetime1)));
            var11 = dupTemp$2;
            var7Lifetime1Lifetime1 = dupTemp$2;
            var8Lifetime1 = new BurstParticle(24, xQ8, yQ8, color, (int)var11[0] << 8, (int)var11[1] << 8, 1);
            particles.addLast((IntrusiveNode) (var8Lifetime1), (byte) 39);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("uv.B(").append(color).append(',').append(yQ8).append(',').append(guard).append(',').append(xQ8).append(',');
          if (particles == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(maxSpeed).append(')').toString());
        }
    }

    public final void renderWidget(UiWidget widget, int parentY, int guard, boolean isEnabled, int parentX) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RasterIndexedSprite var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        try {
          SoftwareRasterizer.drawRectangle(widget.x + parentX, widget.y + parentY, widget.width, widget.height, 10197915);
          if (isEnabled) {
            stackIn_6_0 = (((InteractiveWidget) (widget)).selected) ? 1 : 0;
          } else {
            stackIn_6_0 = 0;
          }
          var6_int = stackIn_6_0;
          if (guard != 5592405) {
            SpriteOptionRenderer.fullscreenDialogWidth(124);
          }
          if (isEnabled) {
            stackIn_14_0 = (widget.hasFocus(-1)) ? 1 : 0;
          } else {
            stackIn_14_0 = 0;
          }
          var7 = stackIn_14_0;
          var8 = 0;
          if (var7 != 0) {
            var8 = var8 | 2;
          }
          stackIn_19_0 = (var6_int != 0) ? 2394342 : 16777215;
          var9 = stackIn_19_0;
          if (var6_int != 0) {
            var8 = var8 | 1;
          }
          var10 = this.stateSprites[var8];
          var11 = parentX - (-widget.x - (widget.width - var10.width) / 2);
          var12 = (widget.height - var10.height) / 2 + (widget.y + parentY);
          var13 = widget.width / 2 + (parentX + widget.x);
          var10.draw(var11, var12);
          this.font.a(this.widgetText(true, widget), var13, parentY, var9, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_26_0 = var6;
          stackIn_26_1 = new StringBuilder().append("uv.A(");
          if (widget == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(parentY).append(',').append(guard).append(',').append(isEnabled).append(',').append(parentX).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -31) {
          field_n = -34L;
          field_o = null;
          return;
        }
        field_o = null;
    }

    final static int parseInt(int radix, CharSequence text, boolean allowLeadingPlus, byte guard) {
        int var8 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (radix >= 2 &&
            36 >= radix) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            if (guard > -78) {
              field_n = 102L;
            }
            var7 = text.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = text.charAt(var8);
              if ((var8 == 0) &&
                (45 == var9)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !allowLeadingPlus))) {
                if (var9 >= 48 &&
                  57 >= var9) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var9 >= radix) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var6 * radix + var9;
                if (var6 != var10 / radix) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_42_0 = var6;
            return stackIn_42_0;
          }
          throw new IllegalArgumentException("" + radix);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("uv.D(").append(radix).append(',');
          if (text == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(allowLeadingPlus).append(',').append(guard).append(')').toString());
        }
    }

    static {
    }
}
