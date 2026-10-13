/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class FileCacheStore {
    private BufferedFile dataFile;
    static String field_e;
    private int storeId;
    private int maxEntryBytes;
    private BufferedFile indexFile;

    public static void a(byte param0) {
        field_e = null;
        if (param0 != 47) {
          field_e = (String) null;
        }
    }

    final boolean write(byte obfuscationGuard, byte[] data, int length, int entryId) {
        Object var5 = null;
        Object var5_ref = null;
        RuntimeException var5_ref2 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5_ref = this.dataFile;
          synchronized (var5_ref) {
            if (length >= 0 &&
              this.maxEntryBytes >= length) {
              if (obfuscationGuard > -116) {
                return true;
              }
              var6 = this.writeSectors(data, entryId, true, true, length) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.writeSectors(data, entryId, false, true, length) ? 1 : 0;
              }
              stackIn_12_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_12_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = var5_ref2;
          stackIn_17_1 = new StringBuilder().append("ve.C(").append(obfuscationGuard).append(',');
          if (data == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(length).append(',').append(entryId).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        if (param0 != -21835160) {
          FileCacheStore.b(-54);
        }
        return LevelSelectScreen.a(qn.field_n, kb.field_Qb, 21);
    }

    final static void a(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (lj.mouseInput != null) {
          var1 = lj.mouseInput;
          synchronized (var1) {
            lj.mouseInput = null;
          }
        }
        if (param0 != 5) {
          field_e = (String) null;
        }
    }

    public final String toString() {
        return "" + this.storeId;
    }

    private final boolean writeSectors(byte[] data, int entryId, boolean reuseSectors, boolean obfuscationGuard, int length) {
        try {
          RuntimeException stackIn_71_0 = null;
          StringBuilder stackIn_71_1 = null;
          String stackIn_72_2 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Object var6 = null;
          RuntimeException var6_ref = null;
          int sector = 0;
          IOException var7 = null;
          int bytesWritten = 0;
          int chunkIndex = 0;
          int nextSector = 0;
          int headerEntryOrPayloadLength = 0;
          int headerChunkIndex = 0;
          int headerStoreId = 0;
          EOFException var14 = null;
          int clientBranchFlag = 0;
          clientBranchFlag = BrickABrac.field_J ? 1 : 0;
          try {
            var6 = this.dataFile;
            synchronized (var6) {
              try {
                if (reuseSectors) {
                  if ((long)(6 + entryId * 6) > this.indexFile.length((byte) 115)) {
                    return false;
                  }
                  this.indexFile.seek(0, (long)(entryId * 6));
                  this.indexFile.readFully(6, 0, 120, tf.cacheSectorScratch);
                  sector = (255 & tf.cacheSectorScratch[5]) + ((255 & tf.cacheSectorScratch[3]) << 16) + (65280 & tf.cacheSectorScratch[4] << 8);
                  if (0 >= sector ||
                    !((long)sector <= this.dataFile.length((byte) 71) / 520L)) {
                    return false;
                  }
                } else {
                  sector = (int)((519L + this.dataFile.length((byte) 62)) / 520L);
                  if (0 == sector) {
                    sector = 1;
                  }
                }
                tf.cacheSectorScratch[0] = (byte)(length >> 16);
                tf.cacheSectorScratch[4] = (byte)(sector >> 8);
                tf.cacheSectorScratch[5] = (byte)sector;
                tf.cacheSectorScratch[2] = (byte)length;
                if (!obfuscationGuard) {
                  FileCacheStore.a((byte) 8);
                }
                tf.cacheSectorScratch[1] = (byte)(length >> 8);
                tf.cacheSectorScratch[3] = (byte)(sector >> 16);
                this.indexFile.seek(0, (long)(entryId * 6));
                this.indexFile.write(tf.cacheSectorScratch, 0, 6, -1);
                bytesWritten = 0;
                chunkIndex = 0;
                scanLoop1: while (true) {
                  if (length > bytesWritten) {
                    boolean decompiledFrameRemainder0 = true;
                    nextSector = 0;
                    if (reuseSectors) {
                      this.dataFile.seek(0, (long)(520 * sector));
                      if (65535 >= entryId) {
                        try {
                          this.dataFile.readFully(8, 0, 121, tf.cacheSectorScratch);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break scanLoop1;
                        }
                        headerStoreId = 255 & tf.cacheSectorScratch[7];
                        headerChunkIndex = (tf.cacheSectorScratch[2] << 8 & 65280) + (255 & tf.cacheSectorScratch[3]);
                        nextSector = ((255 & tf.cacheSectorScratch[5]) << 8) + ((tf.cacheSectorScratch[4] & 255) << 16) + (tf.cacheSectorScratch[6] & 255);
                        headerEntryOrPayloadLength = ((255 & tf.cacheSectorScratch[0]) << 8) + (255 & tf.cacheSectorScratch[1]);
                      } else {
                        try {
                          this.dataFile.readFully(10, 0, 119, tf.cacheSectorScratch);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break scanLoop1;
                        }
                        headerEntryOrPayloadLength = ((tf.cacheSectorScratch[2] & 255) << 8) + ((16711680 & tf.cacheSectorScratch[1] << 16) + (-16777216 & tf.cacheSectorScratch[0] << 24)) + (tf.cacheSectorScratch[3] & 255);
                        nextSector = (255 & tf.cacheSectorScratch[8]) + ((tf.cacheSectorScratch[6] << 16 & 16711680) + (tf.cacheSectorScratch[7] << 8 & 65280));
                        headerChunkIndex = (255 & tf.cacheSectorScratch[5]) + ((255 & tf.cacheSectorScratch[4]) << 8);
                        headerStoreId = tf.cacheSectorScratch[9] & 255;
                      }
                      if ((entryId == headerEntryOrPayloadLength &&
                        headerChunkIndex == chunkIndex &&
                        this.storeId == headerStoreId) &&
                        (decompiledFrameRemainder0 = (!(nextSector >= 0) ||
                        !((long)nextSector <= (this.dataFile.length((byte) 29) / 520L))))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (0 == nextSector) {
                      nextSector = (int)((519L + this.dataFile.length((byte) 85)) / 520L);
                      reuseSectors = false;
                      if (nextSector == 0) {
                        nextSector++;
                      }
                      if (sector == nextSector) {
                        nextSector++;
                      }
                    }
                    if (length - bytesWritten <= 512) {
                      nextSector = 0;
                    }
                    if (entryId <= 65535) {
                      tf.cacheSectorScratch[6] = (byte)nextSector;
                      tf.cacheSectorScratch[1] = (byte)entryId;
                      tf.cacheSectorScratch[5] = (byte)(nextSector >> 8);
                      tf.cacheSectorScratch[0] = (byte)(entryId >> 8);
                      tf.cacheSectorScratch[3] = (byte)chunkIndex;
                      tf.cacheSectorScratch[2] = (byte)(chunkIndex >> 8);
                      tf.cacheSectorScratch[7] = (byte)this.storeId;
                      tf.cacheSectorScratch[4] = (byte)(nextSector >> 16);
                      this.dataFile.seek(0, (long)(520 * sector));
                      this.dataFile.write(tf.cacheSectorScratch, 0, 8, -1);
                      headerEntryOrPayloadLength = length - bytesWritten;
                      if (headerEntryOrPayloadLength > 512) {
                        headerEntryOrPayloadLength = 512;
                      }
                      this.dataFile.write(data, bytesWritten, headerEntryOrPayloadLength, -1);
                      bytesWritten = bytesWritten + headerEntryOrPayloadLength;
                    } else {
                      tf.cacheSectorScratch[5] = (byte)chunkIndex;
                      tf.cacheSectorScratch[8] = (byte)nextSector;
                      tf.cacheSectorScratch[1] = (byte)(entryId >> 16);
                      tf.cacheSectorScratch[6] = (byte)(nextSector >> 16);
                      tf.cacheSectorScratch[0] = (byte)(entryId >> 24);
                      tf.cacheSectorScratch[9] = (byte)this.storeId;
                      tf.cacheSectorScratch[7] = (byte)(nextSector >> 8);
                      tf.cacheSectorScratch[2] = (byte)(entryId >> 8);
                      tf.cacheSectorScratch[3] = (byte)entryId;
                      tf.cacheSectorScratch[4] = (byte)(chunkIndex >> 8);
                      this.dataFile.seek(0, (long)(520 * sector));
                      this.dataFile.write(tf.cacheSectorScratch, 0, 10, -1);
                      headerEntryOrPayloadLength = length - bytesWritten;
                      if (510 < headerEntryOrPayloadLength) {
                        headerEntryOrPayloadLength = 510;
                      }
                      this.dataFile.write(data, bytesWritten, headerEntryOrPayloadLength, -1);
                      bytesWritten = bytesWritten + headerEntryOrPayloadLength;
                    }
                    chunkIndex++;
                    sector = nextSector;
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
            stackIn_71_0 = var6_ref;
            stackIn_71_1 = new StringBuilder().append("ve.D(");
            if (data == null) {
              stackIn_72_2 = "null";
            } else {
              stackIn_72_2 = "{...}";
            }
            throw qb.addExceptionContext((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(entryId).append(',').append(reuseSectors).append(',').append(obfuscationGuard).append(',').append(length).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final byte[] read(int obfuscationGuard, int entryId) {
        try {
          int sectorByteIndex = 0;
          int incrementValue$2 = 0;
          Object var3 = null;
          Object var3_ref = null;
          int entryLength = 0;
          IOException var4 = null;
          int sector = 0;
          byte[] data = null;
          int bytesRead = 0;
          int chunkIndex = 0;
          int payloadLength = 0;
          int headerEntryId = 0;
          int headerChunkIndex = 0;
          int nextSector = 0;
          int headerStoreId = 0;
          int headerSize = 0;
          int sectorDataEnd = 0;
          Throwable var17 = null;
          int clientBranchFlag = 0;
          Object stackIn_3_0 = null;
          Object stackIn_37_0 = null;
          Object stackIn_43_0 = null;
          byte[] stackIn_50_0 = null;
          Object stackIn_53_0 = null;
          Throwable decompiledCaughtException = null;
          clientBranchFlag = BrickABrac.field_J ? 1 : 0;
          var3_ref = this.dataFile;
          synchronized (var3_ref) {
            try {
              if ((long)(6 * entryId + 6) > this.indexFile.length((byte) 53)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.indexFile.seek(0, (long)(entryId * 6));
              this.indexFile.readFully(6, 0, 127, tf.cacheSectorScratch);
              entryLength = (tf.cacheSectorScratch[2] & 255) + ((tf.cacheSectorScratch[1] & 255) << 8) + (16711680 & tf.cacheSectorScratch[0] << 16);
              sector = (tf.cacheSectorScratch[5] & 255) + (tf.cacheSectorScratch[3] << 16 & 16711680) + ((tf.cacheSectorScratch[4] & 255) << 8);
              if (entryLength < 0) {
                return null;
              }
              if (this.maxEntryBytes < entryLength) {
                return null;
              }
              if (sector <= 0) {
                return null;
              }
              if ((long)sector > (this.dataFile.length((byte) 66) / 520L)) {
                return null;
              }
              data = new byte[entryLength];
              bytesRead = 0;
              chunkIndex = obfuscationGuard;
              while (bytesRead < entryLength) {
                if (sector == 0) {
                  return null;
                }
                this.dataFile.seek(0, (long)(520 * sector));
                payloadLength = entryLength - bytesRead;
                if (entryId <= 65535) {
                  if (512 < payloadLength) {
                    payloadLength = 512;
                  }
                  headerSize = 8;
                  this.dataFile.readFully(payloadLength + headerSize, 0, 126, tf.cacheSectorScratch);
                  headerEntryId = ((tf.cacheSectorScratch[0] & 255) << 8) + (tf.cacheSectorScratch[1] & 255);
                  headerStoreId = tf.cacheSectorScratch[7] & 255;
                  headerChunkIndex = (tf.cacheSectorScratch[3] & 255) + ((tf.cacheSectorScratch[2] & 255) << 8);
                  nextSector = ((tf.cacheSectorScratch[4] & 255) << 16) - (-((255 & tf.cacheSectorScratch[5]) << 8) - (tf.cacheSectorScratch[6] & 255));
                } else {
                  headerSize = 10;
                  if (510 < payloadLength) {
                    payloadLength = 510;
                  }
                  this.dataFile.readFully(headerSize + payloadLength, 0, obfuscationGuard ^ 117, tf.cacheSectorScratch);
                  headerChunkIndex = ((255 & tf.cacheSectorScratch[4]) << 8) + (255 & tf.cacheSectorScratch[5]);
                  headerStoreId = tf.cacheSectorScratch[9] & 255;
                  nextSector = ((255 & tf.cacheSectorScratch[7]) << 8) + ((tf.cacheSectorScratch[6] & 255) << 16) + (tf.cacheSectorScratch[8] & 255);
                  headerEntryId = (tf.cacheSectorScratch[3] & 255) + (((tf.cacheSectorScratch[1] & 255) << 16) + (tf.cacheSectorScratch[0] << 24 & -16777216) + (tf.cacheSectorScratch[2] << 8 & 65280));
                }
                if (entryId != headerEntryId) {
                  return null;
                }
                if (chunkIndex != headerChunkIndex) {
                  return null;
                }
                if (headerStoreId != this.storeId) {
                  stackIn_37_0 = null;
                  return (byte[]) (stackIn_37_0);
                }
                if (nextSector < 0) {
                  return null;
                }
                if ((long)nextSector > this.dataFile.length((byte) 70) / 520L) {
                  stackIn_43_0 = null;
                  return (byte[]) (stackIn_43_0);
                }
                sectorDataEnd = headerSize + payloadLength;
                chunkIndex++;
                for (sectorByteIndex = headerSize; sectorByteIndex < sectorDataEnd; sectorByteIndex++) {
                  incrementValue$2 = bytesRead;
                  bytesRead++;
                  data[incrementValue$2] = tf.cacheSectorScratch[sectorByteIndex];
                }
                sector = nextSector;
              }
              stackIn_50_0 = data;
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

    FileCacheStore(int storeId, BufferedFile dataFile, BufferedFile indexFile, int maxEntryBytes) {
        this.dataFile = null;
        this.maxEntryBytes = 65000;
        this.indexFile = null;
        try {
          this.maxEntryBytes = maxEntryBytes;
          this.storeId = storeId;
          this.indexFile = indexFile;
          this.dataFile = dataFile;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "ve.<init>(" + storeId + ',' + (dataFile != null ? "{...}" : "null") + ',' + (indexFile != null ? "{...}" : "null") + ',' + maxEntryBytes + ')');
        }
    }

    static {
        field_e = "This option cannot be combined with the current settings for:  ";
    }
}
