/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MarkerSliderWidget extends InteractiveWidget {
    private GrowableIntArray markers;
    int horizontalPadding;
    private int maximumValue;
    int baselineOffsetY;
    static int[][] field_M;
    static String field_P;
    static ClientUiComponent field_N;
    static RgbSprite field_T;
    static String field_O;

    final int getMarker(int index, byte obfuscationGuard) {
        if (index < 0) {
          return -1;
        }
        if (index >= this.markers.size(-102)) {
          return -1;
        }
        if (obfuscationGuard == -47) {
          return this.markers.get(index, 652110180);
        }
        return -9;
    }

    final int getMarkerCount(byte obfuscationGuard) {
        if (obfuscationGuard != -39) {
          return -55;
        }
        return this.markers.size(obfuscationGuard ^ 85);
    }

    final boolean pointerPressed(int pointerX, int originX, int originY, int obfuscationGuard, Widget rootWidget, int pointerY, int button) {
        int var12 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard <= 103) {
            field_N = (ClientUiComponent) null;
          }
          if (!super.pointerPressed(pointerX, originX, originY, 122, rootWidget, pointerY, button)) {
            return false;
          }
          var8_int = -originX + (pointerX - this.horizontalPadding);
          var9 = -(this.horizontalPadding * 2) + this.width;
          if (var8_int > var9) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = this.maximumValue * var8_int / var9;
          if (button != 1) {
            if (button != 2) {
              return true;
            }
            var10 = 2147483647;
            var11 = -1;
            for (var12 = 0; this.markers.size(-125) > var12; var12++) {
              var13 = this.markers.get(var12, 652110180) - var8_int;
              var13 = var13 * var13;
              if (var13 < var10) {
                var10 = var13;
                var11 = var12;
              }
            }
            if (0 <= var11) {
              this.markers.removeAt(var11, -66);
            }
          } else {
            this.markers.append(26884, var8_int);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_32_0 = var8;
          stackIn_32_1 = new StringBuilder().append("pi.NA(").append(pointerX).append(',').append(originX).append(',').append(originY).append(',').append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(pointerY).append(',').append(button).append(')').toString());
        }
    }

    final int getMaximumValue(int obfuscationGuard) {
        if (obfuscationGuard == -1) {
          return this.maximumValue;
        }
        Widget var3 = (Widget) null;
        this.pointerPressed(104, -75, 118, -4, (Widget) null, 10, 30);
        return this.maximumValue;
    }

    public static void releaseStatics(byte obfuscationGuard) {
        field_O = null;
        field_P = null;
        field_M = (int[][]) null;
        if (obfuscationGuard != -63) {
          return;
        }
        field_N = null;
        field_T = null;
    }

    private MarkerSliderWidget() throws Throwable {
        throw new Error();
    }

    static {
        field_P = "Most units";
        field_M = new int[][]{null, null, null, new int[]{0, 0, -1, -1}, null, new int[]{0, -1, -1, -1, -1}};
        field_O = "Just play";
    }
}
