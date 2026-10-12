/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SectorCacheStore {
    private int maximumEntryLength;
    static String field_h;
    static String field_d;
    private BufferedFile indexFile;
    static String field_f;
    static IndexedSprite[][] field_j;
    static String field_k;
    private BufferedFile dataFile;
    private int archiveId;
    static GameplayController field_a;
    static boolean field_e;
    static String field_i;

    final boolean write(int obfuscationGuard, int length, byte[] bytes, int entryId) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        Throwable var8 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.dataFile;
          synchronized (var5) {
            if (length >= 0 &&
              this.maximumEntryLength >= length) {
              var6 = this.writeSectors(entryId, bytes, true, length, (byte) -52) ? 1 : 0;
              var7 = -85 % ((obfuscationGuard + 68) / 56);
              if (var6 == 0) {
                var6 = this.writeSectors(entryId, bytes, false, length, (byte) 104) ? 1 : 0;
              }
              stackIn_8_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_8_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_13_0 = var5_ref;
          stackIn_13_1 = new StringBuilder().append("bc.D(").append(obfuscationGuard).append(',').append(length).append(',');
          if (bytes == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(entryId).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 != 2858) {
          mo var2 = (mo) null;
          SectorCacheStore.a(-95, (mo) null);
        }
        ng.x(90);
    }

    final static void a(int param0, mo param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            MoveAttackRequest.field_D[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; var2_intLifetime1 < lk.field_h; var2_intLifetime1++) {
            if (param1.field_b == an.field_F[var2_intLifetime1].field_b) {
              dupTemp$3 = an.field_F[var2_intLifetime1].a(true);
              MoveAttackRequest.field_D[dupTemp$3] = MoveAttackRequest.field_D[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param1.a(true);
          MoveAttackRequest.field_D[dupTemp$0] = MoveAttackRequest.field_D[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; var3 < lk.field_h; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (~param1.field_b == ~an.field_F[var3].field_b) {
              var4 = an.field_F[var3].a(true);
              if (MoveAttackRequest.field_D[var4] > AnimationPlayer.field_g) {
                MoveAttackRequest.field_D[var4] = MoveAttackRequest.field_D[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              an.field_F[incrementValue$2] = an.field_F[var3];
            }
          }
          lk.field_h = var2_intLifetime2;
          if (param0 != 3208) {
            field_k = (String) null;
          }
          fieldTemp$1 = lk.field_h;
          lk.field_h = lk.field_h + 1;
          an.field_F[fieldTemp$1] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("bc.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final boolean writeSectors(int entryId, byte[] bytes, boolean reuseSectors, int length, byte obfuscationGuard) {
        try {
          RuntimeException stackIn_69_0 = null;
          StringBuilder stackIn_69_1 = null;
          String stackIn_70_2 = null;
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
          int var14 = 0;
          EOFException var15 = null;
          int var17 = 0;
          var17 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            var6 = this.dataFile;
            synchronized (var6) {
              try {
                if (reuseSectors) {
                  if (this.indexFile.length(true) < (long)(6 * entryId + 6)) {
                    return false;
                  }
                  this.indexFile.seek(-1, (long)(entryId * 6));
                  this.indexFile.readFully(0, tn.field_db, (byte) -103, 6);
                  var7_int = ((255 & tn.field_db[3]) << 16) + (tn.field_db[4] << 8 & 65280) + (tn.field_db[5] & 255);
                  if (var7_int <= 0 ||
                    !((long)var7_int <= this.dataFile.length(true) / 520L)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((519L + this.dataFile.length(true)) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                tn.field_db[2] = (byte)length;
                tn.field_db[5] = (byte)var7_int;
                tn.field_db[3] = (byte)(var7_int >> 16);
                tn.field_db[1] = (byte)(length >> 8);
                tn.field_db[4] = (byte)(var7_int >> 8);
                var8 = 27 / ((66 - obfuscationGuard) / 35);
                tn.field_db[0] = (byte)(length >> 16);
                this.indexFile.seek(-1, (long)(entryId * 6));
                this.indexFile.write(6, 0, (byte) 56, tn.field_db);
                var9 = 0;
                var10 = 0;
                scanLoop1: while (true) {
                  if (length > var9) {
                    boolean decompiledFrameRemainder0 = true;
                    var11 = 0;
                    if (reuseSectors) {
                      this.dataFile.seek(-1, (long)(520 * var7_int));
                      if (65535 >= entryId) {
                        try {
                          this.dataFile.readFully(0, tn.field_db, (byte) -103, 8);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var15 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break scanLoop1;
                        }
                        var13 = (tn.field_db[3] & 255) + (65280 & tn.field_db[2] << 8);
                        var11 = (255 & tn.field_db[6]) + ((16711680 & tn.field_db[4] << 16) + (tn.field_db[5] << 8 & 65280));
                        var12 = (255 & tn.field_db[1]) + ((255 & tn.field_db[0]) << 8);
                        var14 = tn.field_db[7] & 255;
                      } else {
                        try {
                          this.dataFile.readFully(0, tn.field_db, (byte) -103, 10);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var15 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break scanLoop1;
                        }
                        var11 = (255 & tn.field_db[8]) + (16711680 & tn.field_db[6] << 16) + (65280 & tn.field_db[7] << 8);
                        var12 = (255 & tn.field_db[3]) + ((tn.field_db[1] << 16 & 16711680) + (((255 & tn.field_db[0]) << 24) + ((255 & tn.field_db[2]) << 8)));
                        var14 = tn.field_db[9] & 255;
                        var13 = ((255 & tn.field_db[4]) << 8) + (tn.field_db[5] & 255);
                      }
                      if ((entryId == var12 &&
                        var10 == var13 &&
                        var14 == this.archiveId) &&
                        (decompiledFrameRemainder0 = (!(var11 >= 0) ||
                        !(this.dataFile.length(true) / 520L >= (long)var11)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var11 == 0) {
                      var11 = (int)((this.dataFile.length(true) + 519L) / 520L);
                      reuseSectors = false;
                      if (var11 == 0) {
                        var11++;
                      }
                      if (var7_int == var11) {
                        var11++;
                      }
                    }
                    if (length - var9 <= 512) {
                      var11 = 0;
                    }
                    if (entryId > 65535) {
                      tn.field_db[6] = (byte)(var11 >> 16);
                      tn.field_db[0] = (byte)(entryId >> 24);
                      tn.field_db[3] = (byte)entryId;
                      tn.field_db[4] = (byte)(var10 >> 8);
                      tn.field_db[9] = (byte)this.archiveId;
                      tn.field_db[1] = (byte)(entryId >> 16);
                      tn.field_db[7] = (byte)(var11 >> 8);
                      tn.field_db[2] = (byte)(entryId >> 8);
                      tn.field_db[5] = (byte)var10;
                      tn.field_db[8] = (byte)var11;
                      this.dataFile.seek(-1, (long)(var7_int * 520));
                      this.dataFile.write(10, 0, (byte) 63, tn.field_db);
                      var12 = -var9 + length;
                      if (510 < var12) {
                        var12 = 510;
                      }
                      this.dataFile.write(var12, var9, (byte) 110, bytes);
                      var9 = var9 + var12;
                    } else {
                      tn.field_db[2] = (byte)(var10 >> 8);
                      tn.field_db[0] = (byte)(entryId >> 8);
                      tn.field_db[3] = (byte)var10;
                      tn.field_db[1] = (byte)entryId;
                      tn.field_db[7] = (byte)this.archiveId;
                      tn.field_db[4] = (byte)(var11 >> 16);
                      tn.field_db[6] = (byte)var11;
                      tn.field_db[5] = (byte)(var11 >> 8);
                      this.dataFile.seek(-1, (long)(var7_int * 520));
                      this.dataFile.write(8, 0, (byte) 44, tn.field_db);
                      var12 = length - var9;
                      if (var12 > 512) {
                        var12 = 512;
                      }
                      this.dataFile.write(var12, var9, (byte) 78, bytes);
                      var9 = var9 + var12;
                    }
                    var7_int = var11;
                    var10++;
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
            stackIn_69_0 = var6_ref;
            stackIn_69_1 = new StringBuilder().append("bc.F(").append(entryId).append(',');
            if (bytes == null) {
              stackIn_70_2 = "null";
            } else {
              stackIn_70_2 = "{...}";
            }
            throw ig.addExceptionContext((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(reuseSectors).append(',').append(length).append(',').append(obfuscationGuard).append(')').toString());
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

    final byte[] read(int obfuscationGuard, int entryId) {
        try {
          int var16 = 0;
          int incrementValue$2 = 0;
          Object var3 = null;
          Object dataMonitor = null;
          int entryLength = 0;
          int sector = 0;
          byte[] bytes = null;
          int bytesRead = 0;
          int chunkIndex = 0;
          int payloadLength = 0;
          int headerEntryId = 0;
          int headerChunkIndex = 0;
          int nextSector = 0;
          int headerArchiveId = 0;
          int headerLength = 0;
          int readEnd = 0;
          int var18 = 0;
          Object stackIn_3_0 = null;
          Object stackIn_43_0 = null;
          byte[] stackIn_49_0 = null;
          Object stackIn_52_0 = null;
          Throwable decompiledCaughtException = null;
          IOException var4 = null;
          var18 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          dataMonitor = this.dataFile;
          synchronized (dataMonitor) {
            try {
              if ((long)(6 * entryId + 6) > this.indexFile.length(true)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.indexFile.seek(-1, (long)(6 * entryId));
              this.indexFile.readFully(0, tn.field_db, (byte) -103, 6);
              entryLength = (tn.field_db[0] << 16 & 16711680) + (tn.field_db[1] << 8 & 65280) + (tn.field_db[2] & 255);
              sector = (tn.field_db[3] << 16 & 16711680) - (-(65280 & tn.field_db[4] << 8) - (255 & tn.field_db[5]));
              if (0 > entryLength) {
                return null;
              }
              if (entryLength > this.maximumEntryLength) {
                return null;
              }
              if (obfuscationGuard >= sector) {
                return null;
              }
              if ((long)sector > this.dataFile.length(true) / 520L) {
                return null;
              }
              bytes = new byte[entryLength];
              bytesRead = 0;
              chunkIndex = 0;
              while (entryLength > bytesRead) {
                if (sector == 0) {
                  return null;
                }
                this.dataFile.seek(-1, (long)(sector * 520));
                payloadLength = entryLength - bytesRead;
                if (65535 < entryId) {
                  if (payloadLength > 510) {
                    payloadLength = 510;
                  }
                  headerLength = 10;
                  this.dataFile.readFully(0, tn.field_db, (byte) -103, payloadLength + headerLength);
                  headerChunkIndex = (65280 & tn.field_db[4] << 8) + (tn.field_db[5] & 255);
                  headerArchiveId = tn.field_db[9] & 255;
                  nextSector = ((tn.field_db[7] & 255) << 8) + (16711680 & tn.field_db[6] << 16) + (255 & tn.field_db[8]);
                  headerEntryId = ((tn.field_db[0] & 255) << 24) - (-((tn.field_db[1] & 255) << 16) - ((tn.field_db[2] & 255) << 8)) + (tn.field_db[3] & 255);
                } else {
                  headerLength = 8;
                  if (payloadLength > 512) {
                    payloadLength = 512;
                  }
                  this.dataFile.readFully(0, tn.field_db, (byte) -103, headerLength + payloadLength);
                  headerEntryId = (255 & tn.field_db[1]) + ((tn.field_db[0] & 255) << 8);
                  headerChunkIndex = (255 & tn.field_db[3]) + ((tn.field_db[2] & 255) << 8);
                  headerArchiveId = tn.field_db[7] & 255;
                  nextSector = (tn.field_db[6] & 255) + ((255 & tn.field_db[5]) << 8) + (16711680 & tn.field_db[4] << 16);
                }
                if (headerEntryId != entryId) {
                  return null;
                }
                if (chunkIndex != headerChunkIndex) {
                  return null;
                }
                if (headerArchiveId != this.archiveId) {
                  return null;
                }
                if (0 > nextSector) {
                  return null;
                }
                if ((long)nextSector > this.dataFile.length(true) / 520L) {
                  stackIn_43_0 = null;
                  return (byte[]) (stackIn_43_0);
                }
                readEnd = payloadLength + headerLength;
                chunkIndex++;
                sector = nextSector;
                for (var16 = headerLength; var16 < readEnd; var16++) {
                  incrementValue$2 = bytesRead;
                  bytesRead++;
                  bytes[incrementValue$2] = tn.field_db[var16];
                }
              }
              stackIn_49_0 = bytes;
              return stackIn_49_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_52_0 = null;
              return (byte[]) (stackIn_52_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    SectorCacheStore(int archiveId, BufferedFile dataFile, BufferedFile indexFile, int maximumEntryLength) {
        this.maximumEntryLength = 65000;
        this.dataFile = null;
        this.indexFile = null;
        try {
          this.dataFile = dataFile;
          this.indexFile = indexFile;
          this.archiveId = archiveId;
          this.maximumEntryLength = maximumEntryLength;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "bc.<init>(" + archiveId + ',' + (dataFile != null ? "{...}" : "null") + ',' + (indexFile != null ? "{...}" : "null") + ',' + maximumEntryLength + ')');
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_k = null;
        if (param0 != 1) {
          SectorCacheStore.b(11);
        }
        field_f = null;
        field_h = null;
        field_j = (IndexedSprite[][]) null;
        field_i = null;
        field_d = null;
    }

    static {
        field_d = "Invalid name";
        field_h = "Talons are of no use to ground units.";
        field_f = "Please wait";
        field_k = "Spectate <%0>'s game";
        field_i = "Unpacking graphics";
    }
}
