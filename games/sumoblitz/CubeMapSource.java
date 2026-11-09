/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class CubeMapSource {
    static java.util.zip.CRC32 field_c;
    static volatile boolean field_a;
    static String challengeText;

    final static void releaseColorTables(boolean releaseHsv, boolean releaseHsl, int guard) {
        if (releaseHsv) {
          Sumoblitz.hsvTableUsers = Sumoblitz.hsvTableUsers - 1;
          if (0 == Sumoblitz.hsvTableUsers) {
            GzipDecompressor.field_b = null;
          }
        }
        if (guard != -1) {
          return;
        }
        if (releaseHsl) {
          LoginMethodPreference.hslTableUsers = LoginMethodPreference.hslTableUsers - 1;
          if (LoginMethodPreference.hslTableUsers == 0) {
            ReassignUpgradesScreen.hslToRgb = null;
          }
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 <= 12) {
          return;
        }
        challengeText = null;
        field_c = null;
    }

    final static void insertSecondaryAfter(DualLinkNode previous, int guard, DualLinkNode node) {
        if (null != node.secondaryPrevious) {
          node.unlinkSecondary(-5106);
        }
        if (guard != 2066481250) {
          return;
        }
        try {
          node.secondaryPrevious = previous;
          node.secondaryNext = previous.secondaryNext;
          node.secondaryPrevious.secondaryNext = node;
          node.secondaryNext.secondaryPrevious = node;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "pt.F(" + (previous != null ? "{...}" : "null") + ',' + guard + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    final static void decodeLoggingResponse(int guard) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        QueuedIntArrayRequest var4_ref_qv = null;
        FourIntUpdateRequest var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var8 = 0;
        IsaacPacketBuffer var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var10 = NativeLibraryExtractor.incomingPacket;
          if (guard != -22683) {
            return;
          }
          var2 = var10.readUnsignedByte(guard - 8619);
          var3 = var10.readUnsignedByte(-31302);
          if (var2 == 0) {
            var4_ref_qv = (QueuedIntArrayRequest) (MenuScreen.field_b.first(-95));
            if (var4_ref_qv == null) {
              LegacyOpenGlTextureCache.closeAccountSocket((byte) -127);
              return;
            }
            var5_int = HardwareBufferSet.accountPacketLength - var10.position;
            var12 = var4_ref_qv.values;
            var11 = var12;
            var6 = var11;
            if (var5_int > var12.length << 2) {
              var5_int = var12.length << 2;
            }
            for (var7 = 0; var7 < var5_int; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var10.readUnsignedByte(-31302) << LegacyOpenGlPostProcessManager.bitwiseAnd(768, var7 << 8));
            }
            var4_ref_qv.unlink(false);
            return;
          }
          if (1 == var2) {
            var4 = var10.readSignedSmart(-2858);
            var5 = (FourIntUpdateRequest) (HardwareCubeMapSource.field_d.first(-73));
            while (var5 != null) {
              if (var3 != var5.byteKey ||
                var4 != var5.smartKey) {
                var5 = (FourIntUpdateRequest) (HardwareCubeMapSource.field_d.next((byte) 18));
                continue;
              }
              break;
            }
            if (var5 != null) {
              var5.unlink(false);
              return;
            }
            LegacyOpenGlTextureCache.closeAccountSocket((byte) -114);
            return;
          }
          IntrusiveNode.reportClientError("LR1: " + VictoryScreen.accountPacketDiagnostic((byte) 126), (Throwable) null, 0);
          LegacyOpenGlTextureCache.closeAccountSocket((byte) -119);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "pt.I(" + guard + ')');
        }
    }

    protected CubeMapSource() throws Throwable {
        throw new Error();
    }

    final static String groupLoadingMessage(String groupName, ResourceArchive archive, String waitingText, boolean guard, String loadingText) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!guard) {
            field_c = (java.util.zip.CRC32) null;
          }
          if (!archive.loadIndex((byte) 127)) {
            stackIn_5_0 = (String) (waitingText);
            return stackIn_5_0;
          }
          stackIn_7_0 = loadingText + " - " + archive.namedGroupLoadPercent(groupName, (byte) 33) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("pt.E(");
          if (groupName == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (archive == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (waitingText == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(guard).append(',');
          if (loadingText == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_c = new java.util.zip.CRC32();
        challengeText = "challenge";
        field_a = true;
    }
}
