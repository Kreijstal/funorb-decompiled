/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ArchiveFactorySupport {
    static IntrusiveDeque field_c;
    static String field_a;
    static MouseWheelInput field_b;

    final static ResourceArchive createArchive(boolean param0, int param1, boolean param2, int param3, boolean param4, byte param5) {
        try {
          Object var6 = null;
          try {
            var6 = null;
            if (null != IntPoint.field_d.cacheDataFile) {
              ArchivePreloader.field_h = new BufferedRandomAccessFile(IntPoint.field_d.cacheDataFile, 5200, 0);
              IntPoint.field_d.cacheDataFile = null;
              var6 = new SectorCacheStore(255, ArchivePreloader.field_h, new BufferedRandomAccessFile(IntPoint.field_d.masterIndexFile, 12000, 0), 2097152);
            }
            if (param5 != 114) {
              field_a = (String) null;
            }
            Object var7 = null;
            if (ArchivePreloader.field_h != null) {
              if (CampaignLoadingSupport.field_e == null) {
                CampaignLoadingSupport.field_e = new BufferedRandomAccessFile[IntPoint.field_d.cacheIndexFiles.length];
              }
              if (CampaignLoadingSupport.field_e[param1] == null) {
                CampaignLoadingSupport.field_e[param1] = new BufferedRandomAccessFile(IntPoint.field_d.cacheIndexFiles[param1], 12000, 0);
                IntPoint.field_d.cacheIndexFiles[param1] = null;
              }
              var7 = new SectorCacheStore(param1, ArchivePreloader.field_h, CampaignLoadingSupport.field_e[param1], 2097152);
            }
            CachedArchiveProvider var8 = FullscreenFocusCanvas.field_e.archiveProvider(param2, 255, (SectorCacheStore) (var6), param1, (SectorCacheStore) (var7));
            if (param0) {
              var8.startPrefetch((byte) -49);
            }
            ResourceArchive stackIn_17_0 = new ResourceArchive(var8, param4, param3);
            return stackIn_17_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            Throwable decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int guard) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (guard != 2097152) {
          field_a = (String) null;
        }
    }

    final static void advanceSessionCounters(boolean guard) {
        if (guard) {
          if (SocketJs5Transport.field_r != null) {
            SocketJs5Transport.field_r.advanceCounters((byte) 33);
          }
          return;
        }
        field_a = (String) null;
        if (SocketJs5Transport.field_r != null) {
          SocketJs5Transport.field_r.advanceCounters((byte) 33);
        }
    }

    final static void addSessionCounterOffset(boolean guard, int offset) {
        if (null != SocketJs5Transport.field_r) {
          SocketJs5Transport.field_r.addOffset(-1, offset);
          if (!guard) {
            field_a = (String) null;
            return;
          }
          return;
        }
        if (guard) {
          return;
        }
        field_a = (String) null;
    }

    final static int buttonRowWidth(int spacing, BinaryBitmapFont font, String[] labels, int leftPadding, int endIndex, int rightPadding, int startIndex) {
        String stackIn_9_2 = null;
        String stackIn_12_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          int var7_int = leftPadding + rightPadding;
          for (int var8 = startIndex; endIndex > var8; var8++) {
            String var9 = labels[var8];
            int var10 = SeekerMine.paddedButtonTextWidth(var9, 16777215, font);
            var7_int = var7_int + (var10 + spacing);
          }
          int stackIn_5_0 = var7_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var7;
          StringBuilder stackIn_8_1 = new StringBuilder().append("ji.F(").append(spacing).append(',');
          if (font == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          StringBuilder stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (labels == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(leftPadding).append(',').append(endIndex).append(',').append(rightPadding).append(',').append(startIndex).append(')').toString());
        }
    }

    final static int crc32Prefix(int guard, int length, byte[] bytes) {
        String stackIn_8_2 = null;
        try {
          if (guard == 255) {
            int stackIn_4_0 = SpriteCheckboxPainter.crc32(bytes, (byte) -95, length, 0);
            return stackIn_4_0;
          }
          int stackIn_2_0 = 72;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var3;
          StringBuilder stackIn_7_1 = new StringBuilder().append("ji.B(").append(guard).append(',').append(length).append(',');
          if (bytes == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
    }
}
