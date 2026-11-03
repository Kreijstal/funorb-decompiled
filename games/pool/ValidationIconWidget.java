/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ValidationIconWidget extends ButtonWidget {
    private int animationTicks;
    static Random field_P;
    private ValidationProvider validationProvider;
    static String goback;
    static UiComponent field_U;
    static int field_V;
    static String fsUnavailableTrySignedApplet;
    static String unpackingModels;
    static BitmapFont field_O;

    final static void a(boolean param0, String param1, int param2, int param3, long param4, int param5) {
        int var7_int = 0;
        try {
          JaggrabDownloader.field_j.writeCipheredOpcode(false, param3);
          JaggrabDownloader.field_j.position = JaggrabDownloader.field_j.position + 1;
          int var8 = 55 % ((param5 + 38) / 51);
          var7_int = JaggrabDownloader.field_j.position;
          JaggrabDownloader.field_j.writeLong(param4, (byte) -79);
          JaggrabDownloader.field_j.a(-9946, param1);
          JaggrabDownloader.field_j.writeByte(param2, false);
          JaggrabDownloader.field_j.writeByte(!param0 ? 0 : 1, false);
          JaggrabDownloader.field_j.writeByteLengthPrefix(JaggrabDownloader.field_j.position - var7_int, true);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "lc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String getHoverText(int param0) {
        if (this.pointerInside) {
          return this.validationProvider.getDebouncedValidationMessage(98);
        }
        if (param0 <= -10) {
          return null;
        }
        return (String) null;
    }

    public static void releaseStatics(byte param0) {
        field_P = null;
        goback = null;
        fsUnavailableTrySignedApplet = null;
        int var1 = -32 / ((29 - param0) / 48);
        field_U = null;
        field_O = null;
        unpackingModels = null;
    }

    ValidationIconWidget(ValidationProvider param0) {
        try {
          this.validationProvider = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "lc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean requestKeyboardFocus(UiWidget param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -87 % ((param1 + 43) / 47);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("lc.M(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final void updatePointerState(UiWidget param0, int param1, int param2, int param3) {
        try {
          this.animationTicks = this.animationTicks + 1;
          super.updatePointerState(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "lc.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void renderWidget(int param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        na var9;
        int var10;
        int var11;
        int var12;
        Sprite var13;
        Sprite var14;
        Sprite var15;
        var12 = Pool.field_O;
        super.renderWidget(param0, (byte) -122, param2, param3);
        if (param0 != 0) {
          return;
        }
        var5 = (this.widgetWidth >> 1) + (this.widgetX + param2);
        var7 = 1 % ((-42 - param1) / 53);
        var6 = (this.widgetHeight >> 1) + (param3 + this.widgetY);
        var9 = this.validationProvider.getDebouncedValidationState(-31873);
        if (ji.field_h != var9 &&
          Js5Transport.field_k != var9) {
          if (var9 == gp.field_d) {
            var15 = bo.field_a[2];
            var15.drawAdditive(-(var15.field_z >> 1) + var5, var6 - (var15.field_A >> 1), 256);
          } else if (var9 == ProxySocketConnector.field_e) {
            var14 = bo.field_a[1];
            var14.drawAdditive(-(var14.field_z >> 1) + var5, -(var14.field_A >> 1) + var6, 256);
          }
        } else {
          var13 = bo.field_a[0];
          var10 = var13.field_w << 1;
          var11 = var13.field_y << 1;
          if (null != sm.field_z &&
            sm.field_z.field_z >= var10 &&
            sm.field_z.field_A >= var11) {
            CueAim.a(104, sm.field_z);
            SoftwareRasterizer.clear();
          } else {
            sm.field_z = new Sprite(var10, var11);
            CueAim.a(56, sm.field_z);
          }
          var13.b(112, 144, var13.field_w << 4, var13.field_y << 4, -this.animationTicks << 10, 4096);
          TriangleMesh.a(112);
          sm.field_z.drawAdditive(-var13.field_w + var5, var6 - var13.field_y, 256);
        }
    }

    final static int a(int param0, int param1, eh param2, oj param3) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var8 = 0;
        var8 = Pool.field_O;
        try {
          if (param2 != null &&
            param2.field_z != null &&
            param3 != null &&
            param2.field_A == param3.field_l) {
            var4_int = param3.field_z.length;
            var5 = param2.field_z[param0].length / var4_int;
            for (var6 = param1; var6 < var5; var6++) {
              boolean decompiledFrameCompleted0 = true;
              if (param3.field_w == param2.field_q[param0][var6] &&
                BallEvent.a((byte) 3, param2.field_m[param0][var6])) {
                for (var7 = 0; var7 < var4_int; var7++) {
                  if (param3.field_z[var7] != param2.field_z[param0][var7 + var6 * var4_int]) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_18_0 = var6;
                  return stackIn_18_0;
                }
              }
            }
            stackIn_21_0 = -1;
            return stackIn_21_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("lc.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
        field_P = new Random();
        field_V = 20;
        goback = "Go Back";
        fsUnavailableTrySignedApplet = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        unpackingModels = "Unpacking models";
    }
}
