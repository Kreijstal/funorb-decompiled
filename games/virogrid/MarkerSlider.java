/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MarkerSlider extends TextButton {
    static GameOptions field_H;
    private GrowableIntList field_I;
    int field_K;
    private int field_G;
    int field_J;
    static int[] field_F;
    static int field_N;
    static String field_L;
    static String field_M;

    final static void updateCameraMatrix(byte param0) {
        if (param0 == -44) {
          HotspotTextWidget.field_K = CameraProjectionMath.createLookAtCamera(SoundPlaybackHelpers.field_d, new double[]{0.0, 0.0, 0.0}, new double[]{0.0, 1.0, 0.0});
          PlayingSound.field_j = CameraProjectionMath.toFixedCamera(HotspotTextWidget.field_K);
          return;
        }
    }

    public static void releaseStatics(int param0) {
        field_H = null;
        if (param0 > 112) {
          field_M = null;
          field_L = null;
          field_F = null;
          return;
        }
        MarkerSlider.changeScreen(-40, -4, false, -93);
        field_M = null;
        field_L = null;
        field_F = null;
    }

    final static boolean beginReconnectGracePeriod(boolean param0) {
        if (!param0) {
          return false;
        }
        return TextEncodingHelpers.beginReconnectGracePeriod(-31609);
    }

    final int getMarkerPosition(int param0, int param1) {
        if (~param1 > param0) {
          return -1;
        }
        if (param1 < this.field_I.size(false)) {
          return this.field_I.get(param1, (byte) -104);
        }
        return -1;
    }

    final int getMarkerCount(byte param0) {
        if (param0 >= -19) {
          return 121;
        }
        return this.field_I.size(false);
    }

    final boolean handlePointerPress(UiWidget param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var12 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Virogrid.field_F ? 1 : 0;
        try {
          if (!super.handlePointerPress(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          var8_int = -this.field_J + param6 - param3;
          var9 = -(this.field_J * 2) + this.field_g;
          if (var9 < var8_int) {
            var8_int = var9;
          }
          if (0 > var8_int) {
            var8_int = 0;
          }
          var8_int = var8_int * this.field_G / var9;
          if (param1 != 1) {
            if (2 != param1) {
              return true;
            }
            var10 = 2147483647;
            var11 = -1;
            for (var12 = 0; this.field_I.size(param2) > var12; var12++) {
              var13 = -var8_int + this.field_I.get(var12, (byte) -18);
              var13 = var13 * var13;
              if (var10 > var13) {
                var10 = var13;
                var11 = var12;
              }
            }
            if (var11 >= 0) {
              this.field_I.removeAt((byte) 99, var11);
            }
          } else {
            this.field_I.add(-1, var8_int);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_27_0 = var8;
          stackIn_27_1 = new StringBuilder().append("gb.NA(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void changeScreen(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        LoginMethodHelpers.field_e = param1;
        GameClock.field_c = param3;
        ClientEnvironmentHelpers.field_l = 0;
        if (NanoTickClock.isNonNegative(param0 ^ -95, GameClock.field_c)) {
          var4 = 0;
          DateOfBirthValidator.field_j[GameClock.field_c].updatePointerSelection((byte) 119, var4, param2);
        }
        if (GameClock.field_c == -4) {
          TooltipAndOptionsHelpers.field_c = 84.0f;
          SingleChildWidget.field_z = 3.1415927410125732f;
          BitCountAndDialogHelpers.field_c = 2;
        }
        if (param0 == -2) {
          return;
        }
        field_H = (GameOptions) null;
    }

    final int getMaxValue(int param0) {
        if (param0 != 2147483647) {
          this.field_G = 123;
          return this.field_G;
        }
        return this.field_G;
    }

    private MarkerSlider() throws Throwable {
        throw new Error();
    }

    static {
        field_L = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_N = 9;
        field_M = "Players: <%0>/<%1>";
    }
}
