/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class DebugTuningSupport {
    static UiComponent field_b;
    static BitmapFont field_d;
    static String discard;
    static String fsTimeout;
    static String waitingforExtradata;
    static boolean field_g;
    static int field_a;

    final static float scaleByPowerOfTwo(int param0, int param1, int param2) {
        if (param0 != -1) {
          return -0.7121016979217529f;
        }
        return (float)param2 / (float)(1 << param1);
    }

    public static void releaseStatics(int param0) {
        discard = null;
        field_d = null;
        waitingforExtradata = null;
        field_b = null;
        fsTimeout = null;
        if (param0 != -1) {
          DebugTuningSupport.releaseStatics(73);
        }
    }

    final static void requestAccountInterface(int param0) {
        if (PlasmaTableScene.field_ab == 10) {
          MaxLengthTextInputWidget.beginReconnect(false);
          PlasmaTableScene.field_ab = 11;
        } else {
          if (!RasterStateSupport.acceptsClientGuard(-114)) {
            MaxLengthTextInputWidget.beginReconnect(false);
            PlasmaTableScene.field_ab = 11;
          }
        }
        if (param0 != 11) {
          DebugTuningSupport.scaleByPowerOfTwo(48, 16, -49);
        }
        PasswordValidator.field_o = true;
    }

    final static void createDebugSliders(int param0) {
        if (DebugOverlayLayoutSupport.field_a != null) {
          if (!TextLineLayout.field_c[59]) {
            return;
          }
          DebugOverlayLayoutSupport.field_a = new DebugTuningSlider[11];
          DebugOverlayLayoutSupport.field_a[0] = new DebugTuningSlider(0.0f, 1.0f, 0);
          DebugOverlayLayoutSupport.field_a[1] = new DebugTuningSlider(0.0f, 1.0f, 1);
          DebugOverlayLayoutSupport.field_a[2] = new DebugTuningSlider(0.0f, 1.0f, 2);
          DebugOverlayLayoutSupport.field_a[3] = new DebugTuningSlider(0.0f, 1.0f, 3);
          if (param0 >= -73) {
            field_a = -42;
            DebugOverlayLayoutSupport.field_a[4] = new DebugTuningSlider(0.0f, 0.5f, 4);
            DebugOverlayLayoutSupport.field_a[5] = new DebugTuningSlider(0.0f, 0.0625f, 5);
            DebugOverlayLayoutSupport.field_a[6] = new DebugTuningSlider(0.0f, 4.0f, 6);
            DebugOverlayLayoutSupport.field_a[7] = new DebugTuningSlider(0.0f, 2.0f, 7);
            DebugOverlayLayoutSupport.field_a[8] = new DebugTuningSlider(0.5f, 1.0f, 8);
            DebugOverlayLayoutSupport.field_a[9] = new DebugTuningSlider(0.0f, 15.0f, 9);
            DebugOverlayLayoutSupport.field_a[10] = new DebugTuningSlider(0.0f, 0.25f, 10);
            return;
          }
          DebugOverlayLayoutSupport.field_a[4] = new DebugTuningSlider(0.0f, 0.5f, 4);
          DebugOverlayLayoutSupport.field_a[5] = new DebugTuningSlider(0.0f, 0.0625f, 5);
          DebugOverlayLayoutSupport.field_a[6] = new DebugTuningSlider(0.0f, 4.0f, 6);
          DebugOverlayLayoutSupport.field_a[7] = new DebugTuningSlider(0.0f, 2.0f, 7);
          DebugOverlayLayoutSupport.field_a[8] = new DebugTuningSlider(0.5f, 1.0f, 8);
          DebugOverlayLayoutSupport.field_a[9] = new DebugTuningSlider(0.0f, 15.0f, 9);
          DebugOverlayLayoutSupport.field_a[10] = new DebugTuningSlider(0.0f, 0.25f, 10);
          return;
        }
        DebugOverlayLayoutSupport.field_a = new DebugTuningSlider[11];
        DebugOverlayLayoutSupport.field_a[0] = new DebugTuningSlider(0.0f, 1.0f, 0);
        DebugOverlayLayoutSupport.field_a[1] = new DebugTuningSlider(0.0f, 1.0f, 1);
        DebugOverlayLayoutSupport.field_a[2] = new DebugTuningSlider(0.0f, 1.0f, 2);
        DebugOverlayLayoutSupport.field_a[3] = new DebugTuningSlider(0.0f, 1.0f, 3);
        if (param0 < -73) {
          DebugOverlayLayoutSupport.field_a[4] = new DebugTuningSlider(0.0f, 0.5f, 4);
          DebugOverlayLayoutSupport.field_a[5] = new DebugTuningSlider(0.0f, 0.0625f, 5);
          DebugOverlayLayoutSupport.field_a[6] = new DebugTuningSlider(0.0f, 4.0f, 6);
          DebugOverlayLayoutSupport.field_a[7] = new DebugTuningSlider(0.0f, 2.0f, 7);
          DebugOverlayLayoutSupport.field_a[8] = new DebugTuningSlider(0.5f, 1.0f, 8);
          DebugOverlayLayoutSupport.field_a[9] = new DebugTuningSlider(0.0f, 15.0f, 9);
          DebugOverlayLayoutSupport.field_a[10] = new DebugTuningSlider(0.0f, 0.25f, 10);
          return;
        }
        field_a = -42;
        DebugOverlayLayoutSupport.field_a[4] = new DebugTuningSlider(0.0f, 0.5f, 4);
        DebugOverlayLayoutSupport.field_a[5] = new DebugTuningSlider(0.0f, 0.0625f, 5);
        DebugOverlayLayoutSupport.field_a[6] = new DebugTuningSlider(0.0f, 4.0f, 6);
        DebugOverlayLayoutSupport.field_a[7] = new DebugTuningSlider(0.0f, 2.0f, 7);
        DebugOverlayLayoutSupport.field_a[8] = new DebugTuningSlider(0.5f, 1.0f, 8);
        DebugOverlayLayoutSupport.field_a[9] = new DebugTuningSlider(0.0f, 15.0f, 9);
        DebugOverlayLayoutSupport.field_a[10] = new DebugTuningSlider(0.0f, 0.25f, 10);
    }

    final static void flushClientPackets(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          if (param1 != 0) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (Atan2Support.field_c != null) {
            if (param0 >= 0) {
              decompiledFrameRemainder0 = (RankingsScreen.field_J == GradientPaletteSupport.field_a);
              if ((decompiledFrameRemainder0) && (JaggrabDownloader.field_j.position == 0 &&
                MonotonicClock.monotonicTimeMillis((byte) -108) > AccountCreationForm.field_Q + 10000L)) {
                JaggrabDownloader.field_j.writeCipheredOpcode(false, param0);
              }
            } else {
              if (JaggrabDownloader.field_j.position == 0 &&
                MonotonicClock.monotonicTimeMillis((byte) -108) > AccountCreationForm.field_Q + 10000L) {
                JaggrabDownloader.field_j.writeCipheredOpcode(false, param0);
              }
            }
            if (decompiledFrameRemainder0) {
              if (JaggrabDownloader.field_j.position > 0) {
                try {
                  Atan2Support.field_c.write(JaggrabDownloader.field_j.payload, (byte) 70, JaggrabDownloader.field_j.position, 0);
                  AccountCreationForm.field_Q = MonotonicClock.monotonicTimeMillis((byte) -111);
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  ShotEvent.closeClientSocket(-74);
                }
                JaggrabDownloader.field_j.position = 0;
              }
              return;
            }
          }
          JaggrabDownloader.field_j.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean readBoolean(byte param0, PacketBuffer param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.readUnsignedByte(-112);
          stackIn_3_0 = (var2_int == 1) ? 1 : 0;
          var3 = stackIn_3_0;
          var4 = 127 / ((13 - param0) / 63);
          stackIn_4_0 = var3;
          return stackIn_4_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("de.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static int adjustWidthForRightEdge(int param0, int param1, int param2, int param3) {
        if (!(param0 + param2 > SoftwareRasterizer.width)) {
          return param2;
        }
        if (param1 + param2 - param0 >= 0) {
          return param2 + (param1 - param0);
        }
        if (param3 == 0) {
          return SoftwareRasterizer.width - param0;
        }
        discard = (String) null;
        return SoftwareRasterizer.width - param0;
    }

    static {
        waitingforExtradata = "Waiting for extra data";
        fsTimeout = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        discard = "Discard";
        field_g = false;
    }
}
