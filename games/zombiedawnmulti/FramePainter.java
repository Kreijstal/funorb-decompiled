/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class FramePainter {
    private Sprite[] field_d;
    static String field_f;
    static UiComponent field_b;
    static String field_a;
    static String field_e;
    static int field_c;

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_f = null;
        field_a = null;
        int var1 = 100 / ((param0 + 82) / 37);
        field_e = null;
    }

    final void drawFrame(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 12018) {
          return;
        }
        StatusAndMeshHelpers.drawNineSliceFrame(param0, 0, this.field_d, param1, param3, param2);
    }

    final static int randomColour(int param0) {
        if (param0 != -27486) {
          return -94;
        }
        return RandomHelpers.nextBoundedInt((byte) 99, RasterEffectHelpers.field_a, 256) << 16 | RandomHelpers.nextBoundedInt((byte) -91, RasterEffectHelpers.field_a, 256) << 8 | RandomHelpers.nextBoundedInt((byte) -97, RasterEffectHelpers.field_a, 256);
    }

    final static boolean isOnlineFriendOrLobbyPlayer(long param0, String param1, int param2) {
        SocialListRow var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 2) {
            var5 = (byte[]) null;
            FramePainter.decodeSpriteSheet((byte) 9, (byte[]) null);
          }
          var4 = PackedArrayHelpers.findListEntryByName(param1, false);
          if (var4 != null &&
            var4.field_Nb != null) {
            return true;
          }
          stackIn_10_0 = (JaggrabDownloader.field_c != null) && (FullscreenErrorDialog.findLobbyPlayer(param0, (byte) -81) != null);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("pd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    FramePainter(Sprite[] param0) {
        try {
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "pd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void decodeSpriteSheet(byte param0, byte[] param1) {
        byte dupTemp$1 = 0;
        byte dupTemp$0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        PacketBuffer var16 = null;
        PacketBuffer var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var16 = new PacketBuffer(param1);
          var17 = var16;
          var17.position = -2 + param1.length;
          ArchiveRequest.field_v = var17.readUnsignedShort((byte) 69);
          FullscreenFocusCanvas.field_h = new boolean[ArchiveRequest.field_v];
          PowerupCommand.field_o = new int[ArchiveRequest.field_v];
          PacketBuffer.field_i = new int[ArchiveRequest.field_v];
          if (param0 <= 82) {
            field_e = (String) null;
          }
          SpriteAlphaBuffers.field_b = new byte[ArchiveRequest.field_v][];
          ThreeSliceButtonPainter.field_w = new int[ArchiveRequest.field_v];
          MatchingTextValidator.field_t = new byte[ArchiveRequest.field_v][];
          AppearanceScreen.field_p = new int[ArchiveRequest.field_v];
          var17.position = param1.length - 7 - 8 * ArchiveRequest.field_v;
          ContentTransitionDialog.field_nb = var17.readUnsignedShort((byte) 69);
          SpriteDecodeGlobals.field_a = var17.readUnsignedShort((byte) 69);
          var3 = 1 + (var17.readUnsignedByte(31365) & 255);
          for (var4 = 0; var4 < ArchiveRequest.field_v; var4++) {
            PacketBuffer.field_i[var4] = var16.readUnsignedShort((byte) 69);
          }
          for (var4Lifetime1 = 0; ArchiveRequest.field_v > var4Lifetime1; var4Lifetime1++) {
            PowerupCommand.field_o[var4Lifetime1] = var17.readUnsignedShort((byte) 69);
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < ArchiveRequest.field_v; var4Lifetime2++) {
            ThreeSliceButtonPainter.field_w[var4Lifetime2] = var17.readUnsignedShort((byte) 69);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < ArchiveRequest.field_v; var4Lifetime3++) {
            AppearanceScreen.field_p[var4Lifetime3] = var17.readUnsignedShort((byte) 69);
          }
          var17.position = -(var3 * 3) - 4 + (param1.length - 8 * ArchiveRequest.field_v);
          UsernameAvailabilityValidator.field_t = new int[var3];
          for (var4Lifetime4 = 1; var4Lifetime4 < var3; var4Lifetime4++) {
            UsernameAvailabilityValidator.field_t[var4Lifetime4] = var17.readUnsignedMedium(128);
            if (UsernameAvailabilityValidator.field_t[var4Lifetime4] == 0) {
              UsernameAvailabilityValidator.field_t[var4Lifetime4] = 1;
            }
          }
          var17.position = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < ArchiveRequest.field_v; var4Lifetime5++) {
            var5 = ThreeSliceButtonPainter.field_w[var4Lifetime5];
            var6 = AppearanceScreen.field_p[var4Lifetime5];
            var7 = var6 * var5;
            var20 = new byte[var7];
            var18 = var20;
            var8 = var18;
            MatchingTextValidator.field_t[var4Lifetime5] = var20;
            var21 = new byte[var7];
            var19 = var21;
            var9 = var19;
            SpriteAlphaBuffers.field_b[var4Lifetime5] = var21;
            var10 = 0;
            var11 = var17.readUnsignedByte(31365);
            stackIn_24_0 = -1;
            stackIn_24_1 = ~(1 & var11);
            if (stackIn_24_0 == stackIn_24_1) {
              for (var12 = 0; var7 > var12; var12++) {
                var8[var12] = var17.readByte(-249699580);
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var7 > var12; var12++) {
                  dupTemp$1 = var17.readByte(-249699580);
                  var9[var12] = dupTemp$1;
                  var13 = dupTemp$1;
                  stackIn_33_0 = var10;
                  if (var13 == -1) {
                    stackIn_34_1 = 0;
                  } else {
                    stackIn_34_1 = 1;
                  }
                  var10 = stackIn_33_0 | stackIn_34_1;
                }
              }
            } else {
              for (var12 = 0; var5 > var12; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var13 * var5 + var12] = var17.readByte(-249699580);
                }
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var12 < var5; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$0 = var17.readByte(-249699580);
                    var9[var12 + var5 * var13] = dupTemp$0;
                    var14 = dupTemp$0;
                    stackIn_48_0 = var10;
                    if (var14 == -1) {
                      stackIn_49_1 = 0;
                    } else {
                      stackIn_49_1 = 1;
                    }
                    var10 = stackIn_48_0 | stackIn_49_1;
                  }
                }
              }
            }
            FullscreenFocusCanvas.field_h[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("pd.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    static {
        field_f = "This is your RuneScape clan if you have one.";
        field_a = "Waiting for extra data";
        field_e = "Press TAB to chat or F10 to open Quick Chat.";
        field_c = 67;
    }
}
