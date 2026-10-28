/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GzipDecoder {
    static boolean field_c;
    static int field_d;
    static int field_b;
    static int[] field_e;
    private java.util.zip.Inflater inflater;

    final static void initializeAccountUi(boolean guard, byte byteGuard, ResourceArchive sprites, ResourceArchive fonts, ResourceArchive buttons) {
        try {
          di.field_g = RasterBuffer.a((byte) 41, "");
          di.field_g.complete((byte) -128, false);
          wc.a(83, sprites, fonts, buttons);
          GrowableIntList.a((byte) -96);
          dn.field_q = RasterBuffer.field_g;
          if (byteGuard > -111) {
            GzipDecoder.isMembersAchievement(13, (byte) 34);
          }
          ui.field_b = RasterBuffer.field_g;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dh.D(" + guard + ',' + byteGuard + ',' + (sprites != null ? "{...}" : "null") + ',' + (fonts != null ? "{...}" : "null") + ',' + (buttons != null ? "{...}" : "null") + ')');
        }
    }

    final static DisplayModeInfo[] enumerateDisplayModes(int guard, SystemTaskService taskService) {
        String stackIn_22_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (!taskService.c(0)) {
            DisplayModeInfo[] stackIn_4_0 = new DisplayModeInfo[]{};
            return stackIn_4_0;
          }
          SystemTask var8 = taskService.a(5);
          while (var8.field_f == 0) {
            AchievementTracker.sleepMillis((byte) 101, 10L);
          }
          if (var8.field_f == 2) {
            DisplayModeInfo[] stackIn_10_0 = new DisplayModeInfo[]{};
            return stackIn_10_0;
          }
          if (guard != 6629) {
            DisplayModeInfo[] stackIn_13_0 = (DisplayModeInfo[]) null;
            return stackIn_13_0;
          }
          int[] var10 = (int[]) (var8.field_b);
          int[] var9 = var10;
          int[] var3 = var9;
          DisplayModeInfo[] var4 = new DisplayModeInfo[var10.length >> 2];
          for (int var5 = 0; var5 < var4.length; var5++) {
            DisplayModeInfo var6 = new DisplayModeInfo();
            var4[var5] = var6;
            var6.width = var3[var5 << 2];
            var6.height = var3[1 + (var5 << 2)];
            var6.bitDepth = var3[(var5 << 2) + 2];
            var6.refreshRate = var3[3 + (var5 << 2)];
          }
          DisplayModeInfo[] stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var2;
          StringBuilder stackIn_21_1 = new StringBuilder().append("dh.A(").append(guard).append(',');
          if (taskService == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public GzipDecoder() {
        this(-1, 1000000, 1000000);
    }

    final static boolean isMembersAchievement(int achievementId, byte guard) {
        try {
          int[] var2 = ProxySocketConnector.membersAchievementIds;
          int var3 = 0;
          if (guard < 26) {
            GzipDecoder.releaseStatics((byte) -79);
          }
          while (var3 < var2.length) {
            int var4 = var2[var3];
            if (achievementId == var4) {
              return true;
            }
            var3++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "dh.B(" + achievementId + ',' + guard + ')');
        }
    }

    public static void releaseStatics(byte guard) {
        field_e = null;
        int var1 = 61 % ((46 - guard) / 49);
    }

    final void decompress(int guard, byte[] destination, PacketBuffer input) {
        try {
          try {
            if (input.payload[input.position] != 31 ||
              input.payload[1 + input.position] != -117) {
              throw new RuntimeException("");
            }
            if (null == this.inflater) {
              this.inflater = new java.util.zip.Inflater(true);
            }
            try {
              this.inflater.setInput(input.payload, input.position + 10, input.payload.length + (-10 - input.position) - 8);
              this.inflater.inflate(destination);
            } catch (Exception exception) {
              this.inflater.reset();
              throw new RuntimeException("");
            }
            this.inflater.reset();
            int var4_int = -73 % ((13 - guard) / 58);
          } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "dh.C(" + guard + ',' + (destination != null ? "{...}" : "null") + ',' + (input != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private GzipDecoder(int param0, int param1, int param2) {
    }

    static {
        field_e = new int[]{1, 1, 2, 2};
        field_c = false;
        field_d = 0;
        field_b = 1;
    }
}
