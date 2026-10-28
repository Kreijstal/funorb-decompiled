/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ji {
    static IntrusiveDeque field_c;
    static String field_a;
    static MouseWheelInput field_b;

    final static ResourceArchive a(boolean param0, int param1, boolean param2, int param3, boolean param4, byte param5) {
        try {
          Object var6 = null;
          try {
            var6 = null;
            if (null != IntPoint.field_d.field_b) {
              ArchivePreloader.field_h = new BufferedRandomAccessFile(IntPoint.field_d.field_b, 5200, 0);
              IntPoint.field_d.field_b = null;
              var6 = new SectorCacheStore(255, ArchivePreloader.field_h, new BufferedRandomAccessFile(IntPoint.field_d.field_x, 12000, 0), 2097152);
            }
            if (param5 != 114) {
              field_a = (String) null;
            }
            Object var7 = null;
            if (ArchivePreloader.field_h != null) {
              if (bg.field_e == null) {
                bg.field_e = new BufferedRandomAccessFile[IntPoint.field_d.field_u.length];
              }
              if (bg.field_e[param1] == null) {
                bg.field_e[param1] = new BufferedRandomAccessFile(IntPoint.field_d.field_u[param1], 12000, 0);
                IntPoint.field_d.field_u[param1] = null;
              }
              var7 = new SectorCacheStore(param1, ArchivePreloader.field_h, bg.field_e[param1], 2097152);
            }
            CachedArchiveProvider var8 = FullscreenFocusCanvas.field_e.archiveProvider(param2, 255, (SectorCacheStore) (var6), param1, (SectorCacheStore) (var7));
            if (param0) {
              var8.b((byte) -49);
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

    final static void a(boolean param0) {
        if (param0) {
          if (SocketJs5Transport.field_r != null) {
            SocketJs5Transport.field_r.a((byte) 33);
          }
          return;
        }
        field_a = (String) null;
        if (SocketJs5Transport.field_r != null) {
          SocketJs5Transport.field_r.a((byte) 33);
        }
    }

    final static void a(boolean param0, int param1) {
        if (null != SocketJs5Transport.field_r) {
          SocketJs5Transport.field_r.b(-1, param1);
          if (!param0) {
            field_a = (String) null;
            return;
          }
          return;
        }
        if (param0) {
          return;
        }
        field_a = (String) null;
    }

    final static int a(int param0, BinaryBitmapFont param1, String[] param2, int param3, int param4, int param5, int param6) {
        String stackIn_9_2 = null;
        String stackIn_12_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          int var7_int = param3 + param5;
          for (int var8 = param6; param4 > var8; var8++) {
            String var9 = param2[var8];
            int var10 = SeekerMine.a(var9, 16777215, param1);
            var7_int = var7_int + (var10 + param0);
          }
          int stackIn_5_0 = var7_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var7;
          StringBuilder stackIn_8_1 = new StringBuilder().append("ji.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          StringBuilder stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static int a(int param0, int param1, byte[] param2) {
        String stackIn_8_2 = null;
        try {
          if (param0 == 255) {
            int stackIn_4_0 = SpriteCheckboxPainter.crc32(param2, (byte) -95, param1, 0);
            return stackIn_4_0;
          }
          int stackIn_2_0 = 72;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var3;
          StringBuilder stackIn_7_1 = new StringBuilder().append("ji.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
    }
}
