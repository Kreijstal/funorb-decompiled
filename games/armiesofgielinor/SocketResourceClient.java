/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SocketResourceClient extends ResourceProtocolClient {
    static String field_w;
    static String field_v;
    private BufferedSocket socket;
    static String field_x;
    static String field_s;
    static ResourceArchive field_u;

    final void close(int obfuscationGuard) {
        if (obfuscationGuard != -5758) {
          this.d((byte) 55);
        }
        if (null != this.socket) {
          this.socket.close((byte) -45);
        }
    }

    final static void a(int param0, int param1) {
        CipherPacketBuffer var2 = vl.outgoingPacket;
        var2.writeCipheredOpcode(32161, param1);
        var2.writeByte(1, 2);
        var2.writeByte(param0 - 895, 4);
        var2.writeByte(1, LeaderEscortCondition.f(3));
        if (param0 != 896) {
          field_s = (String) null;
        }
    }

    final void attachTransport(Object transport, boolean sessionFlag, int obfuscationGuard) {
        try {
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          int var4_int = 0;
          RuntimeException var4_ref = null;
          NetworkResourceRequest var5 = null;
          IOException var5_ref = null;
          Exception var6 = null;
          int var7 = 0;
          NetworkResourceRequest var5Lifetime1;
          var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            if (null != this.socket) {
              try {
                this.socket.close((byte) -45);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.socket = null;
            }
            this.socket = (BufferedSocket) (transport);
            this.d((byte) 116);
            this.a(82, sessionFlag);
            this.activeResponse = null;
            var4_int = -66 / ((obfuscationGuard - 25) / 57);
            this.incomingHeader.position = 0;
            while (true) {
              var5 = (NetworkResourceRequest) (this.inFlightPriority.popFirst(11));
              if (var5 != null) {
                this.queuedPriority.addLast(var5, false);
                continue;
              }
              break;
            }
            while (true) {
              var5Lifetime1 = (NetworkResourceRequest) (this.inFlightNormal.popFirst(11));
              if (var5Lifetime1 != null) {
                this.queuedNormal.addLast(var5Lifetime1, false);
                continue;
              }
              break;
            }
            if (this.xorByte != 0) {
              try {
                this.outgoingRecord.position = 0;
                this.outgoingRecord.writeByte(1, 4);
                this.outgoingRecord.writeByte(1, (int) this.xorByte);
                this.outgoingRecord.writeInt((byte) -59, 0);
                this.socket.write(this.outgoingRecord.payload, (byte) 20, 0, this.outgoingRecord.payload.length);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var5_ref = (IOException) (Object) decompiledCaughtException;
                try {
                  this.socket.close((byte) -45);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6 = (Exception) (Object) decompiledCaughtException;
                }
                this.errorCount = this.errorCount + 1;
                this.socket = null;
                this.errorCode = -2;
              }
            }
            this.idleMillis = 0;
            this.lastPollMillis = vi.b(80);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var4_ref;
            stackIn_24_1 = new StringBuilder().append("ae.K(");
            if (transport == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw ig.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(sessionFlag).append(',').append(obfuscationGuard).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(int param0) {
        field_s = null;
        field_v = null;
        field_u = null;
        field_x = null;
        if (param0 != -4096) {
          field_w = (String) null;
        }
        field_w = null;
    }

    final static void a(long param0, int param1) {
        try {
          try {
            Thread.sleep(param0);
          } catch (InterruptedException interruptedException) {
          }
          if (param1 <= 3) {
            SocketResourceClient.b(90, 21);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public SocketResourceClient() {
    }

    final boolean poll(boolean checkWriteError) {
        try {
          int var2_int = 0;
          int stackIn_60_0 = 0;
          int stackIn_76_0 = 0;
          Throwable decompiledCaughtException = null;
          long now = 0L;
          NetworkResourceRequest priorityRequest = null;
          IOException var2_ref = null;
          int var3_int = 0;
          Exception var3 = null;
          int elapsedThenHeaderLength = 0;
          Exception var5_ref_Exception = null;
          int availableThenResponseLength = 0;
          int readCountThenArchiveId = 0;
          int groupIdThenByteIndex = 0;
          int flags = 0;
          int compressedLength = 0;
          int compressionType = 0;
          int normalResponseFlag = 0;
          long responseKey = 0L;
          Object var14 = null;
          NetworkResourceRequest matchedRequest = null;
          int responsePrefixLength = 0;
          int var16 = 0;
          NetworkResourceRequest normalRequest;
          var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          if (null != this.socket) {
            now = vi.b(-75);
            elapsedThenHeaderLength = (int)(-this.lastPollMillis + now);
            this.lastPollMillis = now;
            if (200 < elapsedThenHeaderLength) {
              elapsedThenHeaderLength = 200;
            }
            this.idleMillis = this.idleMillis + elapsedThenHeaderLength;
            if (30000 < this.idleMillis) {
              try {
                this.socket.close((byte) -45);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.socket = null;
            }
          }
          if (this.socket == null) {
            if (this.getPriorityCount(127) != 0) {
              return false;
            }
            if (this.getNormalCount(-110) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.socket.checkWriteError(checkWriteError);
            priorityRequest = (NetworkResourceRequest) (this.queuedPriority.first((byte) -117));
            while (priorityRequest != null) {
              this.outgoingRecord.position = 0;
              this.outgoingRecord.writeByte(1, 1);
              this.outgoingRecord.writeLong40(true, priorityRequest.secondaryKey);
              this.socket.write(this.outgoingRecord.payload, (byte) 20, 0, this.outgoingRecord.payload.length);
              this.inFlightPriority.addLast(priorityRequest, false);
              priorityRequest = (NetworkResourceRequest) (this.queuedPriority.next(24));
            }
            normalRequest = (NetworkResourceRequest) (this.queuedNormal.first((byte) -123));
            while (normalRequest != null) {
              this.outgoingRecord.position = 0;
              this.outgoingRecord.writeByte(1, 0);
              this.outgoingRecord.writeLong40(true, normalRequest.secondaryKey);
              this.socket.write(this.outgoingRecord.payload, (byte) 20, 0, this.outgoingRecord.payload.length);
              this.inFlightNormal.addLast(normalRequest, false);
              normalRequest = (NetworkResourceRequest) (this.queuedNormal.next(24));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.socket.available((byte) 43);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.idleMillis = 0;
                elapsedThenHeaderLength = 0;
                if (this.activeResponse != null) {
                  if (this.activeResponse.blockPosition == 0) {
                    elapsedThenHeaderLength = 1;
                  }
                } else {
                  elapsedThenHeaderLength = 10;
                }
                if (elapsedThenHeaderLength > 0) {
                  availableThenResponseLength = -this.incomingHeader.position + elapsedThenHeaderLength;
                  if (availableThenResponseLength > var3_int) {
                    availableThenResponseLength = var3_int;
                  }
                  this.socket.readFully(0, this.incomingHeader.position, availableThenResponseLength, this.incomingHeader.payload);
                  if (0 != this.xorByte) {
                    for (readCountThenArchiveId = 0; readCountThenArchiveId < availableThenResponseLength; readCountThenArchiveId++) {
                      this.incomingHeader.payload[this.incomingHeader.position + readCountThenArchiveId] = (byte)GrowthEvent.b((int) this.incomingHeader.payload[this.incomingHeader.position + readCountThenArchiveId], (int) this.xorByte);
                    }
                  }
                  this.incomingHeader.position = this.incomingHeader.position + availableThenResponseLength;
                  if (elapsedThenHeaderLength <= this.incomingHeader.position) {
                    if (null == this.activeResponse) {
                      this.incomingHeader.position = 0;
                      readCountThenArchiveId = this.incomingHeader.readUnsignedByte(0);
                      groupIdThenByteIndex = this.incomingHeader.readInt(1);
                      flags = this.incomingHeader.readUnsignedByte(0);
                      compressedLength = this.incomingHeader.readInt(1);
                      compressionType = 127 & flags;
                      stackIn_60_0 = ((flags & 128) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      normalResponseFlag = stackIn_60_0;
                      responseKey = (long)groupIdThenByteIndex + ((long)readCountThenArchiveId << 32);
                      var14 = null;
                      if (normalResponseFlag != 0) {
                        matchedRequest = (NetworkResourceRequest) (this.inFlightNormal.first((byte) -110));
                        while (matchedRequest != null) {
                          if (responseKey == matchedRequest.secondaryKey) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          matchedRequest = (NetworkResourceRequest) (this.inFlightNormal.next(24));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        matchedRequest = (NetworkResourceRequest) (this.inFlightPriority.first((byte) -106));
                        while (matchedRequest != null) {
                          if (responseKey == matchedRequest.secondaryKey) {
                            break;
                          }
                          matchedRequest = (NetworkResourceRequest) (this.inFlightPriority.next(24));
                        }
                      }
                      if (matchedRequest == null) {
                        throw new IOException();
                      }
                      this.activeResponse = matchedRequest;
                      stackIn_76_0 = (compressionType == 0) ? 5 : 9;
                      responsePrefixLength = stackIn_76_0;
                      this.activeResponse.responseBuffer = new PacketBuffer(responsePrefixLength + compressedLength + this.activeResponse.paddingBytes);
                      this.activeResponse.responseBuffer.writeByte(1, compressionType);
                      this.activeResponse.responseBuffer.writeInt((byte) -77, compressedLength);
                      this.incomingHeader.position = 0;
                      this.activeResponse.blockPosition = 10;
                    } else {
                      if (this.activeResponse.blockPosition != 0) {
                        throw new IOException();
                      }
                      if (this.incomingHeader.payload[0] != -1) {
                        this.activeResponse = null;
                      } else {
                        this.activeResponse.blockPosition = 1;
                        this.incomingHeader.position = 0;
                      }
                    }
                  }
                } else {
                  availableThenResponseLength = -this.activeResponse.paddingBytes + this.activeResponse.responseBuffer.payload.length;
                  readCountThenArchiveId = 512 - this.activeResponse.blockPosition;
                  if (-this.activeResponse.responseBuffer.position + availableThenResponseLength < readCountThenArchiveId) {
                    readCountThenArchiveId = availableThenResponseLength - this.activeResponse.responseBuffer.position;
                  }
                  if (readCountThenArchiveId > var3_int) {
                    readCountThenArchiveId = var3_int;
                  }
                  this.socket.readFully(0, this.activeResponse.responseBuffer.position, readCountThenArchiveId, this.activeResponse.responseBuffer.payload);
                  if (0 != this.xorByte) {
                    for (groupIdThenByteIndex = 0; readCountThenArchiveId > groupIdThenByteIndex; groupIdThenByteIndex++) {
                      this.activeResponse.responseBuffer.payload[this.activeResponse.responseBuffer.position + groupIdThenByteIndex] = (byte)GrowthEvent.b((int) this.activeResponse.responseBuffer.payload[this.activeResponse.responseBuffer.position + groupIdThenByteIndex], (int) this.xorByte);
                    }
                  }
                  this.activeResponse.blockPosition = this.activeResponse.blockPosition + readCountThenArchiveId;
                  this.activeResponse.responseBuffer.position = this.activeResponse.responseBuffer.position + readCountThenArchiveId;
                  if (this.activeResponse.responseBuffer.position == availableThenResponseLength) {
                    this.activeResponse.unlinkSecondary((byte) -76);
                    this.activeResponse.pending = false;
                    this.activeResponse = null;
                  } else {
                    if (this.activeResponse.blockPosition == 512) {
                      this.activeResponse.blockPosition = 0;
                    }
                  }
                }
                continue;
              }
              break;
            }
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.socket.close((byte) -45);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.errorCode = -2;
            this.errorCount = this.errorCount + 1;
            this.socket = null;
            if (this.getPriorityCount(106) == 0 &&
              this.getNormalCount(-109) == 0) {
              return true;
            }
            return false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d(byte param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (param0 <= 70) {
            return;
          }
          if (null == this.socket) {
            return;
          }
          try {
            this.outgoingRecord.position = 0;
            this.outgoingRecord.writeByte(1, 6);
            this.outgoingRecord.a(3, (byte) 58);
            this.outgoingRecord.writeShort(true, 0);
            this.socket.write(this.outgoingRecord.payload, (byte) 20, 0, this.outgoingRecord.payload.length);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.socket.close((byte) -45);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.errorCode = -2;
            this.socket = null;
            this.errorCount = this.errorCount + 1;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, boolean param1) {
        try {
          IOException iOException = null;
          PacketBuffer stackIn_6_0 = null;
          int stackIn_6_1 = 0;
          int stackIn_7_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (null == this.socket) {
            return;
          }
          try {
            if (param0 <= 5) {
              this.a(-74, true);
            }
            this.outgoingRecord.position = 0;
            stackIn_6_0 = this.outgoingRecord;
            stackIn_6_1 = 1;
            if (!param1) {
              stackIn_7_2 = 3;
            } else {
              stackIn_7_2 = 2;
            }
            ((PacketBuffer) (Object) stackIn_6_0).writeByte(stackIn_6_1, stackIn_7_2);
            this.outgoingRecord.writeLong40(true, 0L);
            this.socket.write(this.outgoingRecord.payload, (byte) 20, 0, this.outgoingRecord.payload.length);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.socket.close((byte) -45);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.errorCount = this.errorCount + 1;
            this.socket = null;
            this.errorCode = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int b(int param0, int param1) {
        param0 = param0 & 8191;
        if (param1 != 100) {
          field_v = (String) null;
        }
        if (param0 < 4096) {
          return param0 >= 2048 ? e.field_a[-param0 + 4096] : e.field_a[param0];
        }
        return param0 < 6144 ? -e.field_a[-4096 + param0] : -e.field_a[8192 - param0];
    }

    final void invalidateTransport(byte obfuscationGuard) {
        if (obfuscationGuard != 4) {
          return;
        }
        try {
          this.socket.close((byte) -45);
        } catch (Exception exception) {
        }
        this.socket = null;
        this.errorCode = -1;
        this.errorCount = this.errorCount + 1;
        this.xorByte = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final static void a(byte param0, RgbSprite[] param1, RgbSprite param2) {
        try {
          vg.field_q = param1;
          vg.field_q[0].i();
          vg.field_q[1].i();
          DeployEvent.field_z = param2;
          ac.field_m = vg.field_q[0].pixelHeight;
          if (param0 < 118) {
            field_x = (String) null;
          }
          CampaignProgress.field_b = vg.field_q[0].pixelWidth;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ae.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = "This can be used from turn <%0> onwards.";
        field_x = "Click on the gold-rimmed icons to navigate through the equipment.";
        field_v = "Show all private chat";
        field_s = "Service unavailable";
    }
}
