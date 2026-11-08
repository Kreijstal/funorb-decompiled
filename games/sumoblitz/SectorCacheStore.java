/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SectorCacheStore {
    static String serviceUnavailableText;
    private BufferedCacheFile dataFile;
    private int maxGroupLength;
    private int archiveId;
    private BufferedCacheFile indexFile;

    private final boolean writeSectors(byte[] bytes, boolean overwrite, int length, int groupId, int guard) {
        try {
          RuntimeException stackIn_72_0 = null;
          StringBuilder stackIn_72_1 = null;
          String stackIn_73_2 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Object var6 = null;
          RuntimeException var6_ref = null;
          int var7_int = 0;
          IOException var7 = null;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          EOFException var14 = null;
          int var16 = 0;
          var16 = Sumoblitz.field_L ? 1 : 0;
          try {
            var6 = this.dataFile;
            synchronized (var6) {
              if (guard != 255) {
                return false;
              }
              try {
                if (overwrite) {
                  if (this.indexFile.length((byte) -60) < (long)(groupId * 6 + 6)) {
                    return false;
                  }
                  this.indexFile.seek(-7564, (long)(6 * groupId));
                  this.indexFile.readFully(6, 0, HudMessage.field_t, -111);
                  var7_int = (HudMessage.field_t[3] << 16 & 16711680) + (HudMessage.field_t[4] << 8 & 65280) + (255 & HudMessage.field_t[5]);
                  if (0 >= var7_int ||
                    !((this.dataFile.length((byte) -60) / 520L) >= (long)var7_int)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.dataFile.length((byte) -60) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                HudMessage.field_t[1] = (byte)(length >> 8);
                HudMessage.field_t[4] = (byte)(var7_int >> 8);
                HudMessage.field_t[5] = (byte)var7_int;
                HudMessage.field_t[3] = (byte)(var7_int >> 16);
                HudMessage.field_t[2] = (byte)length;
                HudMessage.field_t[0] = (byte)(length >> 16);
                this.indexFile.seek(-7564, (long)(6 * groupId));
                this.indexFile.write(HudMessage.field_t, 6, (byte) -50, 0);
                var8 = 0;
                var9 = 0;
                scanLoop1: while (true) {
                  if (length > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (overwrite) {
                      this.dataFile.seek(-7564, (long)(var7_int * 520));
                      if (groupId <= 65535) {
                        try {
                          this.dataFile.readFully(8, 0, HudMessage.field_t, -64);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break scanLoop1;
                        }
                        var10 = (255 & HudMessage.field_t[6]) + (16711680 & HudMessage.field_t[4] << 16) + ((HudMessage.field_t[5] & 255) << 8);
                        var13 = HudMessage.field_t[7] & 255;
                        var11 = (HudMessage.field_t[1] & 255) + (65280 & HudMessage.field_t[0] << 8);
                        var12 = ((255 & HudMessage.field_t[2]) << 8) + (HudMessage.field_t[3] & 255);
                      } else {
                        try {
                          this.dataFile.readFully(10, 0, HudMessage.field_t, -108);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break scanLoop1;
                        }
                        var13 = HudMessage.field_t[9] & 255;
                        var10 = ((255 & HudMessage.field_t[7]) << 8) + (((HudMessage.field_t[6] & 255) << 16) + (255 & HudMessage.field_t[8]));
                        var11 = (255 & HudMessage.field_t[3]) + (HudMessage.field_t[1] << 16 & 16711680) + ((HudMessage.field_t[0] & 255) << 24) + (65280 & HudMessage.field_t[2] << 8);
                        var12 = (255 & HudMessage.field_t[5]) + ((255 & HudMessage.field_t[4]) << 8);
                      }
                      if ((groupId == var11 &&
                        var9 == var12 &&
                        var13 == this.archiveId) &&
                        (decompiledFrameRemainder0 = (!(0 <= var10) ||
                        !((long)var10 <= this.dataFile.length((byte) -60) / 520L)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (0 == var10) {
                      overwrite = false;
                      var10 = (int)((519L + this.dataFile.length((byte) -60)) / 520L);
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var10 == var7_int) {
                        var10++;
                      }
                    }
                    if (-var8 + length <= 512) {
                      var10 = 0;
                    }
                    if (groupId <= 65535) {
                      HudMessage.field_t[4] = (byte)(var10 >> 16);
                      HudMessage.field_t[5] = (byte)(var10 >> 8);
                      HudMessage.field_t[2] = (byte)(var9 >> 8);
                      HudMessage.field_t[0] = (byte)(groupId >> 8);
                      HudMessage.field_t[7] = (byte)this.archiveId;
                      HudMessage.field_t[6] = (byte)var10;
                      HudMessage.field_t[3] = (byte)var9;
                      HudMessage.field_t[1] = (byte)groupId;
                      this.dataFile.seek(guard - 7819, (long)(var7_int * 520));
                      this.dataFile.write(HudMessage.field_t, 8, (byte) 65, 0);
                      var11 = -var8 + length;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.dataFile.write(bytes, var11, (byte) -121, var8);
                      var8 = var8 + var11;
                    } else {
                      HudMessage.field_t[8] = (byte)var10;
                      HudMessage.field_t[7] = (byte)(var10 >> 8);
                      HudMessage.field_t[6] = (byte)(var10 >> 16);
                      HudMessage.field_t[3] = (byte)groupId;
                      HudMessage.field_t[9] = (byte)this.archiveId;
                      HudMessage.field_t[5] = (byte)var9;
                      HudMessage.field_t[0] = (byte)(groupId >> 24);
                      HudMessage.field_t[4] = (byte)(var9 >> 8);
                      HudMessage.field_t[1] = (byte)(groupId >> 16);
                      HudMessage.field_t[2] = (byte)(groupId >> 8);
                      this.dataFile.seek(-7564, (long)(var7_int * 520));
                      this.dataFile.write(HudMessage.field_t, 10, (byte) 126, 0);
                      var11 = length - var8;
                      if (510 < var11) {
                        var11 = 510;
                      }
                      this.dataFile.write(bytes, var11, (byte) 126, var8);
                      var8 = var8 + var11;
                    }
                    var9++;
                    var7_int = var10;
                    continue;
                  }
                  break;
                }
                return true;
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7 = (IOException) (Object) decompiledCaughtException;
                return false;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_72_0 = var6_ref;
            stackIn_72_1 = new StringBuilder().append("wl.A(");
            if (bytes == null) {
              stackIn_73_2 = "null";
            } else {
              stackIn_73_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(overwrite).append(',').append(length).append(',').append(groupId).append(',').append(guard).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.archiveId;
    }

    public static void releaseStatics(byte param0) {
        serviceUnavailableText = null;
        if (param0 != -90) {
          serviceUnavailableText = (String) null;
        }
    }

    final byte[] read(int guard, int groupId) {
        try {
          int var16 = 0;
          int incrementValue$2 = 0;
          Object var3 = null;
          Object var3_ref = null;
          int var4_int = 0;
          IOException var4 = null;
          int var5 = 0;
          byte[] var6 = null;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          int var14 = 0;
          int var15 = 0;
          Throwable var17 = null;
          int var18 = 0;
          Object stackIn_3_0 = null;
          Object stackIn_21_0 = null;
          Object stackIn_37_0 = null;
          byte[] stackIn_50_0 = null;
          Object stackIn_53_0 = null;
          Throwable decompiledCaughtException = null;
          int var9Lifetime1;
          var18 = Sumoblitz.field_L ? 1 : 0;
          var3_ref = this.dataFile;
          synchronized (var3_ref) {
            try {
              if (this.indexFile.length((byte) -60) < (long)(6 + groupId * 6)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.indexFile.seek(-7564, (long)(6 * groupId));
              this.indexFile.readFully(6, 0, HudMessage.field_t, -104);
              var4_int = (65280 & HudMessage.field_t[1] << 8) + (((255 & HudMessage.field_t[0]) << 16) + (255 & HudMessage.field_t[2]));
              var5 = ((255 & HudMessage.field_t[3]) << 16) + (65280 & HudMessage.field_t[4] << 8) + (255 & HudMessage.field_t[5]);
              if (var4_int < 0) {
                return null;
              }
              if (this.maxGroupLength < var4_int) {
                return null;
              }
              if (var5 <= 0) {
                return null;
              }
              if (this.dataFile.length((byte) -60) / 520L < (long)var5) {
                return null;
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var7 < var4_int) {
                if (var5 == 0) {
                  stackIn_21_0 = null;
                  return (byte[]) (stackIn_21_0);
                }
                this.dataFile.seek(-7564, (long)(var5 * 520));
                var9 = var4_int - var7;
                if (groupId <= 65535) {
                  var14 = 8;
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  this.dataFile.readFully(var9 + var14, 0, HudMessage.field_t, -55);
                  var11 = (255 & HudMessage.field_t[3]) + ((255 & HudMessage.field_t[2]) << 8);
                  var13 = HudMessage.field_t[7] & 255;
                  var12 = (255 & HudMessage.field_t[6]) + (((255 & HudMessage.field_t[5]) << 8) + (16711680 & HudMessage.field_t[4] << 16));
                  var10 = ((HudMessage.field_t[0] & 255) << 8) + (HudMessage.field_t[1] & 255);
                } else {
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  var14 = 10;
                  this.dataFile.readFully(var9 + var14, 0, HudMessage.field_t, -93);
                  var10 = (HudMessage.field_t[3] & 255) + (HudMessage.field_t[2] << 8 & 65280) + ((HudMessage.field_t[1] & 255) << 16) + ((HudMessage.field_t[0] & 255) << 24);
                  var13 = HudMessage.field_t[9] & 255;
                  var12 = (HudMessage.field_t[8] & 255) + (HudMessage.field_t[7] << 8 & 65280) + ((HudMessage.field_t[6] & 255) << 16);
                  var11 = ((255 & HudMessage.field_t[4]) << 8) + (HudMessage.field_t[5] & 255);
                }
                if (var10 != groupId) {
                  return null;
                }
                if (var11 != var8) {
                  return null;
                }
                if (var13 != this.archiveId) {
                  stackIn_37_0 = null;
                  return (byte[]) (stackIn_37_0);
                }
                if (var12 < 0) {
                  return null;
                }
                if ((long)var12 > this.dataFile.length((byte) -60) / 520L) {
                  return null;
                }
                var15 = var14 + var9;
                for (var16 = var14; var16 < var15; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = HudMessage.field_t[var16];
                }
                var5 = var12;
                var8++;
              }
              var9Lifetime1 = 9 % ((-33 - guard) / 59);
              stackIn_50_0 = var6;
              return stackIn_50_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_53_0 = null;
              return (byte[]) (stackIn_53_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean write(byte[] bytes, int groupId, int length, int guard) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.dataFile;
          synchronized (var5) {
            if (guard <= length &&
              this.maxGroupLength >= length) {
              var6 = this.writeSectors(bytes, true, length, groupId, 255) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.writeSectors(bytes, false, length, groupId, 255) ? 1 : 0;
              }
              stackIn_7_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_7_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("wl.D(");
          if (bytes == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(groupId).append(',').append(length).append(',').append(guard).append(')').toString());
        }
    }

    SectorCacheStore(int archive, BufferedCacheFile data, BufferedCacheFile index, int maxLength) {
        this.maxGroupLength = 65000;
        this.dataFile = null;
        this.indexFile = null;
        try {
          this.indexFile = index;
          this.dataFile = data;
          this.archiveId = archive;
          this.maxGroupLength = maxLength;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "wl.<init>(" + archive + ',' + (data != null ? "{...}" : "null") + ',' + (index != null ? "{...}" : "null") + ',' + maxLength + ')');
        }
    }

    static {
        serviceUnavailableText = "Service unavailable";
    }
}
