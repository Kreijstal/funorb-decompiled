/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MarkerSliderWidget extends TextButton {
    static AccountConnectionState field_F;
    static String field_I;
    private GrowableIntList markers;
    int trackInset;
    int trackY;
    private int maximumValue;

    final boolean handleMousePress(int param0, byte param1, int param2, int param3, int param4, int param5, UiWidget param6) {
        int var13 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = wizardrun.field_H;
        try {
          var8_int = 49 / ((param1 - 12) / 36);
          if (!super.handleMousePress(param0, (byte) -103, param2, param3, param4, param5, param6)) {
            return false;
          }
          var9 = -this.trackInset - param0 + param2;
          var10 = -(2 * this.trackInset) + this.width;
          if (var9 > var10) {
            var9 = var10;
          }
          if (var9 < 0) {
            var9 = 0;
          }
          var9 = this.maximumValue * var9 / var10;
          if (param4 != 1) {
            if (param4 != 2) {
              return true;
            }
            var11 = 2147483647;
            var12 = -1;
            for (var13 = 0; var13 < this.markers.size(31); var13++) {
              var14 = -var9 + this.markers.get(-112, var13);
              var14 = var14 * var14;
              if (var11 > var14) {
                var12 = var13;
                var11 = var14;
              }
            }
            if (var12 >= 0) {
              this.markers.removeAt(-1, var12);
            }
          } else {
            this.markers.add(16711838, var9);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_27_0 = var8;
          stackIn_27_1 = new StringBuilder().append("vb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final int getMarker(int param0, int param1) {
        if (param0 != -10455) {
          this.trackY = 63;
        }
        if (param1 < 0 ||
          this.markers.size(param0 + 10327) <= param1) {
          return -1;
        }
        return this.markers.get(-126, param1);
    }

    final int getMarkerCount(int param0) {
        if (param0 != 0) {
          return 84;
        }
        return this.markers.size(-5);
    }

    final static Sprite[] createMarkerSliderFrame(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != -3) {
          return (Sprite[]) null;
        }
        return BeveledFrameFactory.createBeveledFrame(param4, param2, 1, true, 1, param3, 3, param1, 1);
    }

    final int getMaximumValue(int param0) {
        if (param0 != 1) {
          this.trackInset = -37;
        }
        return this.maximumValue;
    }

    public static void releaseStatics(byte param0) {
        if (param0 <= 125) {
          field_F = (AccountConnectionState) null;
        }
        field_I = null;
        field_F = null;
    }

    private MarkerSliderWidget() throws Throwable {
        throw new Error();
    }

    static {
        field_I = null;
        field_F = new AccountConnectionState();
    }
}
