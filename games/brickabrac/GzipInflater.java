/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class GzipInflater {
    private java.util.zip.Inflater inflater;
    static RgbSprite[] field_a;
    static boolean showRenderRateDiagnostic;
    static UiComponent field_d;
    static int field_e;
    static RgbSprite[][] desertCapsSprites;
    static String[] field_c;

    private GzipInflater(int param0, int param1, int param2) {
    }

    public GzipInflater() {
        this(-1, 1000000, 1000000);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        if (param5 < -51) {
          ResourceRequest.a(param6, param3, param4, 2, 196, param2, param0, 76, param1);
          return;
        }
        GzipInflater.a(39, -27, -77, 50, -59, (byte) -97, -42);
        ResourceRequest.a(param6, param3, param4, 2, 196, param2, param0, 76, param1);
    }

    final static void a(int param0, String param1, boolean param2, int param3, int param4, int param5, int param6, int param7, PlatformServices param8, byte param9, boolean param10, long param11, int param12, int param13) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            LogoRenderHelpers.incomingPackets = new BitPacketBuffer(param4);
            TextFieldValidator.outgoingPackets = new BitPacketBuffer(param5);
            ContentTransitionLayer.field_ob = param6;
            MeshAudioHelpers.field_h = param1;
            FramedMenuScreen.field_s = param8;
            ArchiveIndex.field_e = param0;
            FarmBackground.field_u = param2;
            MainMenuScreen.field_x = param7;
            if (param9 <= 121) {
              GzipInflater.b(47);
            }
            SocketConnector.field_b = param13;
            DebouncedValidationSource.field_a = param12;
            DialogMessagePanel.field_O = param10;
            LevelSelectScreen.field_E = param11;
            IntArrayRequest.field_r = param3;
            if (null == FramedMenuScreen.field_s.field_k) {
              return;
            }
            try {
              ResourceArchiveFactory.field_a = new BufferedFile(FramedMenuScreen.field_s.field_k, 64, 0);
              return;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var15.toString());
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var15_ref;
            stackIn_15_1 = new StringBuilder().append("im.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            if (param8 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        desertCapsSprites = (RgbSprite[][]) null;
        field_c = null;
        if (param0 != -32) {
          return;
        }
        field_d = null;
        field_a = null;
    }

    final static void b(int param0) {
        TextValidationHelpers.field_a = LobbyOverlayHelpers.field_i;
        if (param0 != -8) {
          GzipInflater.a(42);
        }
    }

    final void inflateGzip(byte[] output, int obfuscationGuard, PacketBuffer packet) {
        try {
          try {
            if (packet.data[packet.position] != 31 ||
              -117 != packet.data[packet.position + 1]) {
              throw new RuntimeException("");
            }
            if (this.inflater == null) {
              this.inflater = new java.util.zip.Inflater(true);
            }
            if (obfuscationGuard != -20555) {
              GzipInflater.b(-99);
            }
            try {
              this.inflater.setInput(packet.data, packet.position + 10, packet.data.length + (-8 - packet.position) - 10);
              this.inflater.inflate(output);
            } catch (Exception exception) {
              this.inflater.reset();
              throw new RuntimeException("");
            }
            this.inflater.reset();
          } catch (RuntimeException runtimeException) {
            throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "im.A(" + (output != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + (packet != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        showRenderRateDiagnostic = false;
    }
}
