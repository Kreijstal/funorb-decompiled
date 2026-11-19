/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MarkerSlider extends TextButton {
    static int field_G;
    int field_H;
    private GrowableIntList field_K;
    private int field_J;
    int field_I;

    final int getMarkerCount(byte param0) {
        if (param0 != 104) {
          return 115;
        }
        return this.field_K.size(-123);
    }

    final boolean handleMousePress(int param0, int param1, int param2, UiWidget param3, byte param4, int param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = HoldTheLine.field_D;
        try {
          if (!super.handleMousePress(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -this.field_I - param0 + param5;
          var9 = this.width - 2 * this.field_I;
          if (var8_int > var9) {
            var8_int = var9;
          }
          if (var8_int < 0) {
            var8_int = 0;
          }
          var8_int = var8_int * this.field_J / var9;
          if (param6 != 1) {
            if (2 != param6) {
              return true;
            }
            var10 = 2147483647;
            var11 = -1;
            for (var12 = 0; var12 < this.field_K.size(-113); var12++) {
              var13 = this.field_K.get((byte) 35, var12) - var8_int;
              var13 = var13 * var13;
              if (var10 > var13) {
                var11 = var12;
                var10 = var13;
              }
            }
            if (var11 >= 0) {
              this.field_K.removeAt(var11, (byte) 12);
            }
          } else {
            this.field_K.add(var8_int, (byte) 123);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_25_0 = var8;
          stackIn_25_1 = new StringBuilder().append("km.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int getMaximum(int param0) {
        if (param0 != 0) {
          field_G = 127;
        }
        return this.field_J;
    }

    private MarkerSlider() throws Throwable {
        throw new Error();
    }

    final int getMarker(boolean param0, int param1) {
        if (param0) {
          this.field_I = -11;
        }
        if (param1 < 0 ||
          param1 >= this.field_K.size(-115)) {
          return -1;
        }
        return this.field_K.get((byte) 100, param1);
    }

    static {
        field_G = 66;
    }
}
