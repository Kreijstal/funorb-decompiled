/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class DiskArchiveCache {
    private BufferedRandomAccessFile dataFile;
    private int maximumEntryLength;
    private int archiveId;
    private BufferedRandomAccessFile indexFile;

    final boolean write(byte[] bytes, byte methodGuard, int entryId, int length) {
        Object dataFileMonitor = null;
        RuntimeException writeFailureForContext = null;
        int writeSucceeded = 0;
        Throwable unusedThrowableSnapshot = null;
        kj unusedAudioConfigurationSnapshot = null;
        int writeSucceededBeforeReturn = 0;
        RuntimeException writeFailureBeforeContext = null;
        StringBuilder writeMessagePrefix = null;
        String bytesDescription = null;
        Throwable caughtWriteFailure = null;
        try {
          dataFileMonitor = this.dataFile;
          synchronized (dataFileMonitor) {
            L0: {
              if (0 <= length) {
                if (length <= this.maximumEntryLength) {
                  if (methodGuard != -53) {
                    unusedAudioConfigurationSnapshot = (kj) null;
                    DiskArchiveCache.a((java.awt.Component) null, (PlatformTaskDispatcher) null, false, (kj) null, false, -103);
                  }
                  writeSucceeded = this.writeEntryChain(255, length, entryId, bytes, true) ? 1 : 0;
                  if (writeSucceeded == 0) {
                    writeSucceeded = this.writeEntryChain(255, length, entryId, bytes, false) ? 1 : 0;
                  }
                  writeSucceededBeforeReturn = writeSucceeded;
                  break L0;
                }
              }
              throw new IllegalArgumentException();
            }
          }
          return writeSucceededBeforeReturn != 0;
        } catch (java.lang.RuntimeException writeFailure) {
          caughtWriteFailure = writeFailure;
          writeFailureForContext = (RuntimeException) (Object) caughtWriteFailure;
          writeFailureBeforeContext = (RuntimeException) (writeFailureForContext);
          writeMessagePrefix = new StringBuilder().append("jh.A(");
          if (bytes == null) {
            bytesDescription = "null";
          } else {
            bytesDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) writeFailureBeforeContext), ((StringBuilder) (Object) writeMessagePrefix).append(bytesDescription).append(',').append(methodGuard).append(',').append(entryId).append(',').append(length).append(')').toString());
        }
    }

    final byte[] read(int entryId, byte methodGuard) {
        try {
            int sectorByteIndex = 0;
            int destinationIndexBeforeIncrement = 0;
            Object nullForMissingIndex = null;
            Object nullForOversizedEntry = null;
            Object nullForMissingSector = null;
            byte[] bytesBeforeReturn = null;
            Object nullAfterIoFailure = null;
            Throwable caughtReadFailure = null;
            Object dataFileMonitor = null;
            int entryLength = 0;
            IOException readIoFailure = null;
            int sectorNumber = 0;
            byte[] bytes = null;
            int bytesCopied = 0;
            int chunkNumber = 0;
            int payloadLength = 0;
            int headerEntryId = 0;
            int headerChunkNumber = 0;
            int nextSectorNumber = 0;
            int headerArchiveId = 0;
            int headerLength = 0;
            int sectorReadLength = 0;
            int unusedClientGuardSnapshot = 0;
            unusedClientGuardSnapshot = Geoblox.field_C;
            dataFileMonitor = this.dataFile;
            synchronized (dataFileMonitor) {
              try {
                if (~this.indexFile.length((byte) 46) > ~(long)(entryId * 6 + 6)) {
                  nullForMissingIndex = null;
                  return (byte[]) ((Object) nullForMissingIndex);
                }
                if (methodGuard > -14) {
                  this.dataFile = (BufferedRandomAccessFile) null;
                }
                this.indexFile.seek(-128, (long)(6 * entryId));
                this.indexFile.readFully(dj.diskSectorBuffer, 6, 0, 9868);
                entryLength = (dj.diskSectorBuffer[2] & 255) + (((255 & dj.diskSectorBuffer[0]) << 16) + (dj.diskSectorBuffer[1] << 8 & 65280));
                sectorNumber = (dj.diskSectorBuffer[3] << 16 & 16711680) + (65280 & dj.diskSectorBuffer[4] << 8) + (255 & dj.diskSectorBuffer[5]);
                if (entryLength < 0) {
                  return null;
                }
                if (this.maximumEntryLength < entryLength) {
                  nullForOversizedEntry = null;
                  return (byte[]) ((Object) nullForOversizedEntry);
                }
                if (sectorNumber <= 0) {
                  return null;
                }
                if ((long)sectorNumber > this.dataFile.length((byte) 46) / 520L) {
                  return null;
                }
                bytes = new byte[entryLength];
                bytesCopied = 0;
                chunkNumber = 0;
                while (true) {
                  if (bytesCopied >= entryLength) {
                    bytesBeforeReturn = (byte[]) (bytes);
                    return bytesBeforeReturn;
                  }
                  if (sectorNumber == 0) {
                    nullForMissingSector = null;
                    return (byte[]) ((Object) nullForMissingSector);
                  }
                  this.dataFile.seek(0, (long)(520 * sectorNumber));
                  payloadLength = -bytesCopied + entryLength;
                  if (65535 < entryId) {
                    if (510 < payloadLength) {
                      payloadLength = 510;
                    }
                    headerLength = 10;
                    this.dataFile.readFully(dj.diskSectorBuffer, payloadLength + headerLength, 0, 9868);
                    headerEntryId = (255 & dj.diskSectorBuffer[3]) + ((65280 & dj.diskSectorBuffer[2] << 8) + (-16777216 & dj.diskSectorBuffer[0] << 24) + (16711680 & dj.diskSectorBuffer[1] << 16));
                    headerChunkNumber = (255 & dj.diskSectorBuffer[5]) + (65280 & dj.diskSectorBuffer[4] << 8);
                    headerArchiveId = dj.diskSectorBuffer[9] & 255;
                    nextSectorNumber = ((dj.diskSectorBuffer[7] & 255) << 8) + ((16711680 & dj.diskSectorBuffer[6] << 16) + (dj.diskSectorBuffer[8] & 255));
                  } else {
                    headerLength = 8;
                    if (payloadLength > 512) {
                      payloadLength = 512;
                    }
                    this.dataFile.readFully(dj.diskSectorBuffer, payloadLength + headerLength, 0, 9868);
                    nextSectorNumber = (255 & dj.diskSectorBuffer[6]) + (((dj.diskSectorBuffer[4] & 255) << 16) + ((255 & dj.diskSectorBuffer[5]) << 8));
                    headerChunkNumber = (255 & dj.diskSectorBuffer[3]) + (dj.diskSectorBuffer[2] << 8 & 65280);
                    headerArchiveId = 255 & dj.diskSectorBuffer[7];
                    headerEntryId = (dj.diskSectorBuffer[1] & 255) + ((dj.diskSectorBuffer[0] & 255) << 8);
                  }
                  if (headerEntryId != entryId) {
                    return null;
                  }
                  if (headerChunkNumber != chunkNumber) {
                    return null;
                  }
                  if (this.archiveId != headerArchiveId) {
                    return null;
                  }
                  if (nextSectorNumber < 0) {
                    return null;
                  }
                  if (this.dataFile.length((byte) 46) / 520L < (long)nextSectorNumber) {
                    return null;
                  }
                  sectorReadLength = payloadLength + headerLength;
                  chunkNumber++;
                  for (sectorByteIndex = headerLength; sectorByteIndex < sectorReadLength; sectorByteIndex++) {
                    destinationIndexBeforeIncrement = bytesCopied;
                    bytesCopied++;
                    bytes[destinationIndexBeforeIncrement] = dj.diskSectorBuffer[sectorByteIndex];
                  }
                  sectorNumber = nextSectorNumber;
                  continue;
                }
              } catch (java.io.IOException readIOException) {
                caughtReadFailure = readIOException;
                readIoFailure = (IOException) (Object) caughtReadFailure;
                nullAfterIoFailure = null;
                return (byte[]) ((Object) nullAfterIoFailure);
              }
            }
        } catch (RuntimeException | Error uncheckedReadFailure) {
            throw uncheckedReadFailure;
        } catch (Throwable checkedReadFailure) {
            throw new RuntimeException(checkedReadFailure);
        }
    }

    private final boolean writeEntryChain(int methodGuard, int length, int entryId, byte[] bytes, boolean reuseExistingChain) {
        try {
            RuntimeException writeFailureBeforeContext = null;
            StringBuilder writeMessagePrefix = null;
            String bytesDescription = null;
            int smallHeaderEofState = 0;
            int largeHeaderEofState = 0;
            Throwable caughtWriteFailure = null;
            Object dataFileMonitor = null;
            RuntimeException writeFailureForContext = null;
            int sectorNumber = 0;
            IOException writeIoFailure = null;
            int bytesWritten = 0;
            int chunkNumber = 0;
            int nextSectorNumber = 0;
            int headerEntryIdOrPayloadLength = 0;
            int headerChunkNumber = 0;
            int headerArchiveId = 0;
            EOFException headerEofFailure = null;
            int unusedClientGuardSnapshot = 0;
            unusedClientGuardSnapshot = Geoblox.field_C;
            try {
              dataFileMonitor = this.dataFile;
              synchronized (dataFileMonitor) {
                try {
                  L0: {
                    if (reuseExistingChain) {
                      if (this.indexFile.length((byte) 46) < (long)(6 + entryId * 6)) {
                        return false;
                      }
                      this.indexFile.seek(methodGuard - 228, (long)(entryId * 6));
                      this.indexFile.readFully(dj.diskSectorBuffer, 6, 0, 9868);
                      sectorNumber = (dj.diskSectorBuffer[5] & 255) + (((255 & dj.diskSectorBuffer[4]) << 8) + ((255 & dj.diskSectorBuffer[3]) << 16));
                      if (sectorNumber > 0) {
                        if (this.dataFile.length((byte) 46) / 520L >= (long)sectorNumber) {
                          break L0;
                        }
                      }
                      return false;
                    }
                    sectorNumber = (int)((this.dataFile.length((byte) 46) + 519L) / 520L);
                    if (sectorNumber == 0) {
                      sectorNumber = 1;
                    }
                  }
                  dj.diskSectorBuffer[3] = (byte)(sectorNumber >> 16);
                  dj.diskSectorBuffer[2] = (byte)length;
                  dj.diskSectorBuffer[1] = (byte)(length >> 8);
                  if (methodGuard != 255) {
                    this.indexFile = (BufferedRandomAccessFile) null;
                  }
                  dj.diskSectorBuffer[4] = (byte)(sectorNumber >> 8);
                  dj.diskSectorBuffer[5] = (byte)sectorNumber;
                  dj.diskSectorBuffer[0] = (byte)(length >> 16);
                  this.indexFile.seek(methodGuard - 380, (long)(entryId * 6));
                  this.indexFile.write(6, 0, dj.diskSectorBuffer, false);
                  bytesWritten = 0;
                  chunkNumber = 0;
                  while (true) {
                    L4: {
                      if (length > bytesWritten) {
                        L5: {
                          nextSectorNumber = 0;
                          if (reuseExistingChain) {
                            this.dataFile.seek(methodGuard - 191, (long)(520 * sectorNumber));
                            if (65535 >= entryId) {
                              try {
                                this.dataFile.readFully(dj.diskSectorBuffer, 8, 0, 9868);
                                smallHeaderEofState = 0;
                              } catch (java.io.EOFException smallHeaderEofException) {
                                caughtWriteFailure = smallHeaderEofException;
                                headerEofFailure = (EOFException) (Object) caughtWriteFailure;
                                smallHeaderEofState = 1;
                              }
                              if (!(smallHeaderEofState == 0)) {
                                break L4;
                              }
                              headerEntryIdOrPayloadLength = ((255 & dj.diskSectorBuffer[0]) << 8) + (255 & dj.diskSectorBuffer[1]);
                              headerChunkNumber = (dj.diskSectorBuffer[3] & 255) + ((255 & dj.diskSectorBuffer[2]) << 8);
                              headerArchiveId = 255 & dj.diskSectorBuffer[7];
                              nextSectorNumber = (dj.diskSectorBuffer[6] & 255) + ((65280 & dj.diskSectorBuffer[5] << 8) + (16711680 & dj.diskSectorBuffer[4] << 16));
                            } else {
                              try {
                                this.dataFile.readFully(dj.diskSectorBuffer, 10, 0, 9868);
                                largeHeaderEofState = 0;
                              } catch (java.io.EOFException largeHeaderEofException) {
                                caughtWriteFailure = largeHeaderEofException;
                                headerEofFailure = (EOFException) (Object) caughtWriteFailure;
                                largeHeaderEofState = 1;
                              }
                              if (!(largeHeaderEofState == 0)) {
                                break L4;
                              }
                              headerEntryIdOrPayloadLength = (65280 & dj.diskSectorBuffer[2] << 8) + (((255 & dj.diskSectorBuffer[0]) << 24) + (((dj.diskSectorBuffer[1] & 255) << 16) + (255 & dj.diskSectorBuffer[3])));
                              headerArchiveId = dj.diskSectorBuffer[9] & 255;
                              nextSectorNumber = (dj.diskSectorBuffer[8] & 255) + ((255 & dj.diskSectorBuffer[6]) << 16) + (65280 & dj.diskSectorBuffer[7] << 8);
                              headerChunkNumber = (dj.diskSectorBuffer[4] << 8 & 65280) + (255 & dj.diskSectorBuffer[5]);
                            }
                            if (headerEntryIdOrPayloadLength == entryId) {
                              if (chunkNumber == headerChunkNumber) {
                                if (headerArchiveId == this.archiveId) {
                                  if (nextSectorNumber >= 0) {
                                    if (~(this.dataFile.length((byte) 46) / 520L) <= ~(long)nextSectorNumber) {
                                      break L5;
                                    }
                                  }
                                  return false;
                                }
                              }
                            }
                            return false;
                          }
                        }
                        if (nextSectorNumber == 0) {
                          reuseExistingChain = false;
                          nextSectorNumber = (int)((519L + this.dataFile.length((byte) 46)) / 520L);
                          if (nextSectorNumber == 0) {
                            nextSectorNumber++;
                          }
                          if (sectorNumber == nextSectorNumber) {
                            nextSectorNumber++;
                          }
                        }
                        if (512 >= -bytesWritten + length) {
                          nextSectorNumber = 0;
                        }
                        if (entryId <= 65535) {
                          dj.diskSectorBuffer[4] = (byte)(nextSectorNumber >> 16);
                          dj.diskSectorBuffer[2] = (byte)(chunkNumber >> 8);
                          dj.diskSectorBuffer[0] = (byte)(entryId >> 8);
                          dj.diskSectorBuffer[7] = (byte)this.archiveId;
                          dj.diskSectorBuffer[1] = (byte)entryId;
                          dj.diskSectorBuffer[5] = (byte)(nextSectorNumber >> 8);
                          dj.diskSectorBuffer[3] = (byte)chunkNumber;
                          dj.diskSectorBuffer[6] = (byte)nextSectorNumber;
                          this.dataFile.seek(-97, (long)(520 * sectorNumber));
                          this.dataFile.write(8, 0, dj.diskSectorBuffer, false);
                          headerEntryIdOrPayloadLength = length - bytesWritten;
                          if (512 < headerEntryIdOrPayloadLength) {
                            headerEntryIdOrPayloadLength = 512;
                          }
                          this.dataFile.write(headerEntryIdOrPayloadLength, bytesWritten, bytes, false);
                          bytesWritten = bytesWritten + headerEntryIdOrPayloadLength;
                        } else {
                          dj.diskSectorBuffer[6] = (byte)(nextSectorNumber >> 16);
                          dj.diskSectorBuffer[5] = (byte)chunkNumber;
                          dj.diskSectorBuffer[2] = (byte)(entryId >> 8);
                          dj.diskSectorBuffer[9] = (byte)this.archiveId;
                          dj.diskSectorBuffer[4] = (byte)(chunkNumber >> 8);
                          dj.diskSectorBuffer[1] = (byte)(entryId >> 16);
                          dj.diskSectorBuffer[7] = (byte)(nextSectorNumber >> 8);
                          dj.diskSectorBuffer[8] = (byte)nextSectorNumber;
                          dj.diskSectorBuffer[3] = (byte)entryId;
                          dj.diskSectorBuffer[0] = (byte)(entryId >> 24);
                          this.dataFile.seek(73, (long)(sectorNumber * 520));
                          this.dataFile.write(10, 0, dj.diskSectorBuffer, false);
                          headerEntryIdOrPayloadLength = length - bytesWritten;
                          if (510 < headerEntryIdOrPayloadLength) {
                            headerEntryIdOrPayloadLength = 510;
                          }
                          this.dataFile.write(headerEntryIdOrPayloadLength, bytesWritten, bytes, false);
                          bytesWritten = bytesWritten + headerEntryIdOrPayloadLength;
                        }
                        sectorNumber = nextSectorNumber;
                        chunkNumber++;
                        continue;
                      }
                    }
                    return true;
                  }
                } catch (java.io.IOException writeIOException) {
                  caughtWriteFailure = writeIOException;
                  writeIoFailure = (IOException) (Object) caughtWriteFailure;
                  return false;
                }
              }
            } catch (java.lang.RuntimeException writeFailure) {
              caughtWriteFailure = writeFailure;
              writeFailureForContext = (RuntimeException) (Object) caughtWriteFailure;
              writeFailureBeforeContext = (RuntimeException) (writeFailureForContext);
              writeMessagePrefix = new StringBuilder().append("jh.C(").append(methodGuard).append(',').append(length).append(',').append(entryId).append(',');
              if (bytes == null) {
                bytesDescription = "null";
              } else {
                bytesDescription = "{...}";
              }
              throw t.a((Throwable) ((Object) writeFailureBeforeContext), ((StringBuilder) (Object) writeMessagePrefix).append(bytesDescription).append(',').append(reuseExistingChain).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedWriteFailure) {
            throw uncheckedWriteFailure;
        } catch (Throwable checkedWriteFailure) {
            throw new RuntimeException(checkedWriteFailure);
        }
    }

    public final String toString() {
        return "" + this.archiveId;
    }

    final static void a(java.awt.Component param0, PlatformTaskDispatcher param1, boolean param2, kj param3, boolean param4, int param5) {
        AudioOutput.a(param5, param4, 10);
        fj.field_p = AudioOutput.a(param1, param0, 0, 22050);
        if (param2) {
            return;
        }
        try {
            oh.field_a = AudioOutput.a(param1, param0, 1, 1000);
            WhirlpoolHash.field_d = new ob();
            oh.field_a.b(WhirlpoolHash.field_d);
            uh.field_y = param3;
            wg.a(-15346, oc.field_c);
            ag.a(j.field_gb, (byte) -67);
            fj.field_p.b(param3);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "jh.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    DiskArchiveCache(int archiveId, BufferedRandomAccessFile dataFile, BufferedRandomAccessFile indexFile, int maximumEntryLength) {
        this.dataFile = null;
        this.maximumEntryLength = 65000;
        this.indexFile = null;
        try {
            this.maximumEntryLength = maximumEntryLength;
            this.dataFile = dataFile;
            this.indexFile = indexFile;
            this.archiveId = archiveId;
        } catch (RuntimeException constructionFailure) {
            throw t.a((Throwable) ((Object) constructionFailure), "jh.<init>(" + archiveId + ',' + (dataFile != null ? "{...}" : "null") + ',' + (indexFile != null ? "{...}" : "null") + ',' + maximumEntryLength + ')');
        }
    }

    static {
    }
}
