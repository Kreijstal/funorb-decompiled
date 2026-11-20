/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SocketNetworkArchiveClient extends NetworkArchiveClient {
    private BufferedSocket connection;
    static TextureFormat field_o;
    static int field_n;

    final boolean processRequests(int param0) {
        try {
          int var2_int = 0;
          int stackIn_62_0 = 0;
          int stackIn_78_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          NetworkArchiveRequest var2 = null;
          IOException var2_ref = null;
          int var3_int = 0;
          Exception var3 = null;
          int var4 = 0;
          Exception var5_ref_Exception = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          long var12 = 0L;
          Object var14 = null;
          NetworkArchiveRequest var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          NetworkArchiveRequest var2Lifetime1;
          var16 = VoidHunters.field_G;
          if (this.connection != null) {
            var2_long = MonotonicMillisClock.currentTimeMillis(false);
            var4 = (int)(var2_long - this.lastProcessTime);
            if (var4 > 200) {
              var4 = 200;
            }
            this.lastProcessTime = var2_long;
            this.idleMillis = this.idleMillis + var4;
            if (this.idleMillis > 30000) {
              try {
                this.connection.close(param0 + 1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.connection = null;
            }
          }
          if (null == this.connection) {
            if (0 != this.getPriorityRequestCount(param0 ^ 13223)) {
              return false;
            }
            if (this.getBackgroundRequestCount(-3666) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.connection.checkWriteError((byte) 115);
            var2 = (NetworkArchiveRequest) (this.priorityQueue.first((byte) -54));
            while (var2 != null) {
              this.commandBuffer.position = 0;
              this.commandBuffer.writeByte(0, 1);
              this.commandBuffer.writeLong40(117, var2.secondaryKey);
              this.connection.write(0, this.commandBuffer.payload, this.commandBuffer.payload.length, 0);
              this.priorityInFlight.addLast(var2, -84);
              var2 = (NetworkArchiveRequest) (this.priorityQueue.next(param0 + 1900));
            }
            var2Lifetime1 = (NetworkArchiveRequest) (this.backgroundQueue.first((byte) -54));
            while (var2Lifetime1 != null) {
              this.commandBuffer.position = 0;
              this.commandBuffer.writeByte(0, 0);
              this.commandBuffer.writeLong40(100, var2Lifetime1.secondaryKey);
              this.connection.write(0, this.commandBuffer.payload, this.commandBuffer.payload.length, 0);
              this.backgroundInFlight.addLast(var2Lifetime1, -65);
              var2Lifetime1 = (NetworkArchiveRequest) (this.backgroundQueue.next(1900));
            }
            for (var2_int = param0; var2_int < 100; var2_int++) {
              var3_int = this.connection.available(0);
              if (0 > var3_int) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.idleMillis = 0;
                var4 = 0;
                if (null == this.currentRequest) {
                  var4 = 10;
                } else {
                  if (this.currentRequest.blockPosition == 0) {
                    var4 = 1;
                  }
                }
                if (0 < var4) {
                  var5 = -this.responseHeader.position + var4;
                  if (var5 > var3_int) {
                    var5 = var3_int;
                  }
                  this.connection.readFully(-122, this.responseHeader.position, var5, this.responseHeader.payload);
                  if (0 != this.responseXorKey) {
                    for (var6 = 0; var6 < var5; var6++) {
                      this.responseHeader.payload[this.responseHeader.position + var6] = (byte)SetFixedaim.xorBits((int) this.responseHeader.payload[this.responseHeader.position + var6], (int) this.responseXorKey);
                    }
                  }
                  this.responseHeader.position = this.responseHeader.position + var5;
                  if (var4 <= this.responseHeader.position) {
                    if (this.currentRequest != null) {
                      if (0 != this.currentRequest.blockPosition) {
                        throw new IOException();
                      }
                      if (this.responseHeader.payload[0] != -1) {
                        this.currentRequest = null;
                      } else {
                        this.responseHeader.position = 0;
                        this.currentRequest.blockPosition = 1;
                      }
                    } else {
                      this.responseHeader.position = 0;
                      var6 = this.responseHeader.readUnsignedByte((byte) -126);
                      var7 = this.responseHeader.readInt(125);
                      var8 = this.responseHeader.readUnsignedByte((byte) -125);
                      var9 = this.responseHeader.readInt(24);
                      var10 = var8 & 127;
                      stackIn_62_0 = ((128 & var8) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_62_0;
                      var12 = (long)var7 + ((long)var6 << 32);
                      var14 = null;
                      if (var11 == 0) {
                        var14_ref = (NetworkArchiveRequest) (this.priorityInFlight.first((byte) -54));
                        while (var14_ref != null) {
                          if (~var14_ref.secondaryKey == ~var12) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (NetworkArchiveRequest) (this.priorityInFlight.next(1900));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (NetworkArchiveRequest) (this.backgroundInFlight.first((byte) -54));
                        while (var14_ref != null) {
                          if (var14_ref.secondaryKey == var12) {
                            break;
                          }
                          var14_ref = (NetworkArchiveRequest) (this.backgroundInFlight.next(1900));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_78_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_78_0;
                      this.currentRequest = var14_ref;
                      this.currentRequest.buffer = new PacketBuffer(this.currentRequest.padding + var9 + var15);
                      this.currentRequest.buffer.writeByte(0, var10);
                      this.currentRequest.buffer.writeInt(var9, param0 + 332614536);
                      this.responseHeader.position = 0;
                      this.currentRequest.blockPosition = 10;
                    }
                  }
                } else {
                  var5 = -this.currentRequest.padding + this.currentRequest.buffer.payload.length;
                  var6 = 512 - this.currentRequest.blockPosition;
                  if (var6 > var5 - this.currentRequest.buffer.position) {
                    var6 = -this.currentRequest.buffer.position + var5;
                  }
                  if (var6 > var3_int) {
                    var6 = var3_int;
                  }
                  this.connection.readFully(param0 ^ -126, this.currentRequest.buffer.position, var6, this.currentRequest.buffer.payload);
                  if (this.responseXorKey != 0) {
                    for (var7 = 0; var7 < var6; var7++) {
                      this.currentRequest.buffer.payload[var7 + this.currentRequest.buffer.position] = (byte)SetFixedaim.xorBits((int) this.currentRequest.buffer.payload[var7 + this.currentRequest.buffer.position], (int) this.responseXorKey);
                    }
                  }
                  this.currentRequest.blockPosition = this.currentRequest.blockPosition + var6;
                  this.currentRequest.buffer.position = this.currentRequest.buffer.position + var6;
                  if (var5 != this.currentRequest.buffer.position) {
                    if (this.currentRequest.blockPosition == 512) {
                      this.currentRequest.blockPosition = 0;
                    }
                  } else {
                    this.currentRequest.unlinkSecondary((byte) -35);
                    this.currentRequest.pending = false;
                    this.currentRequest = null;
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
              this.connection.close(1);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.errorCount = this.errorCount + 1;
            this.connection = null;
            this.errorStatus = -2;
            if (this.getPriorityRequestCount(13223) == 0 &&
              this.getBackgroundRequestCount(param0 - 3666) == 0) {
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

    private final void sendConnectionMode(byte param0, boolean param1) {
        try {
          IOException iOException = null;
          PacketBuffer stackIn_6_0 = null;
          int stackIn_6_1 = 0;
          int stackIn_7_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (param0 != -65) {
            return;
          }
          if (this.connection == null) {
            return;
          }
          try {
            this.commandBuffer.position = 0;
            stackIn_6_0 = this.commandBuffer;
            stackIn_6_1 = 0;
            if (param1) {
              stackIn_7_2 = 2;
            } else {
              stackIn_7_2 = 3;
            }
            ((PacketBuffer) (Object) stackIn_6_0).writeByte(stackIn_6_1, stackIn_7_2);
            this.commandBuffer.writeLong40(param0 ^ -50, 0L);
            this.connection.write(0, this.commandBuffer.payload, this.commandBuffer.payload.length, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.connection.close(1);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.errorStatus = -2;
            this.errorCount = this.errorCount + 1;
            this.connection = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void clearSharedReferences(int param0) {
        field_o = null;
        if (param0 != 0) {
          SocketNetworkArchiveClient.g(-53);
        }
    }

    private final void sendConnectionInit(int param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (this.connection == null) {
            return;
          }
          try {
            this.commandBuffer.position = 0;
            this.commandBuffer.writeByte(0, 6);
            this.commandBuffer.writeMedium(3, (byte) 125);
            this.commandBuffer.writeShort(0, true);
            this.connection.write(param0 ^ param0, this.commandBuffer.payload, this.commandBuffer.payload.length, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.connection.close(1);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.errorCount = this.errorCount + 1;
            this.connection = null;
            this.errorStatus = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public SocketNetworkArchiveClient() {
    }

    final void resetAfterValidationFailure(byte param0) {
        try {
          this.connection.close(1);
        } catch (Exception exception) {
        }
        this.errorCount = this.errorCount + 1;
        this.connection = null;
        this.errorStatus = -1;
        if (param0 != -25) {
          field_o = (TextureFormat) null;
        }
        this.responseXorKey = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final static boolean g(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 > -113) {
          SocketNetworkArchiveClient.a(-4, (byte) 35, 31);
        }
        stackIn_6_0 = (null != SetShipSpawnInvulnerabilityTime.field_o) && (GetOndamageParticleSpeed.field_o == tc.field_c);
        return stackIn_6_0;
    }

    final static boolean a(int param0, byte param1, int param2) {
        boolean stackIn_6_0 = false;
        if (param1 < 90) {
          field_o = (TextureFormat) null;
        }
        stackIn_6_0 = ((2048 & param2) != 0) && (0 != (55 & param0));
        return stackIn_6_0;
    }

    final void close(int param0) {
        if (param0 <= 105) {
          field_n = 115;
        }
        if (null != this.connection) {
          this.connection.close(1);
        }
    }

    final void setConnection(Object param0, boolean param1, boolean param2) {
        try {
          RuntimeException stackIn_27_0 = null;
          StringBuilder stackIn_27_1 = null;
          String stackIn_28_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          NetworkArchiveRequest var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          NetworkArchiveRequest var4_refLifetime1;
          var6 = VoidHunters.field_G;
          try {
            if (null != this.connection) {
              try {
                this.connection.close(1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.connection = null;
            }
            this.connection = (BufferedSocket) (param0);
            this.sendConnectionInit(7571);
            this.sendConnectionMode((byte) -65, param1);
            this.currentRequest = null;
            this.responseHeader.position = 0;
            while (true) {
              var4_ref = (NetworkArchiveRequest) (this.priorityInFlight.removeFirst((byte) 87));
              if (var4_ref != null) {
                this.priorityQueue.addLast(var4_ref, -116);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (NetworkArchiveRequest) (this.backgroundInFlight.removeFirst((byte) 109));
              if (var4_refLifetime1 != null) {
                this.backgroundQueue.addLast(var4_refLifetime1, -86);
                continue;
              }
              break;
            }
            if (0 != this.responseXorKey) {
              try {
                this.commandBuffer.position = 0;
                this.commandBuffer.writeByte(0, 4);
                this.commandBuffer.writeByte(0, (int) this.responseXorKey);
                this.commandBuffer.writeInt(0, 332614536);
                this.connection.write(0, this.commandBuffer.payload, this.commandBuffer.payload.length, 0);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.connection.close(1);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.connection = null;
                this.errorCount = this.errorCount + 1;
                this.errorStatus = -2;
              }
            }
            this.idleMillis = 0;
            if (param2) {
              SocketNetworkArchiveClient.clearSharedReferences(-98);
            }
            this.lastProcessTime = MonotonicMillisClock.currentTimeMillis(param2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_27_0 = var4_ref3;
            stackIn_27_1 = new StringBuilder().append("wh.E(");
            if (param0 == null) {
              stackIn_28_2 = "null";
            } else {
              stackIn_28_2 = "{...}";
            }
            throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_o = new TextureFormat(2);
        field_n = 0;
    }
}
