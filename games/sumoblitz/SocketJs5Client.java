/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SocketJs5Client extends Js5Client {
    static boolean[] field_p;
    private BufferedSocket socket;
    static String field_s;
    static int field_q;

    final void attachConnection(boolean loggedIn, byte guard, Object connection) {
        try {
          RuntimeException stackIn_27_0 = null;
          StringBuilder stackIn_27_1 = null;
          String stackIn_28_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          NetworkResourceRequest var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          NetworkResourceRequest var4_refLifetime1;
          var6 = Sumoblitz.field_L ? 1 : 0;
          try {
            if (this.socket != null) {
              try {
                this.socket.close((byte) -67);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.socket = null;
            }
            this.socket = (BufferedSocket) (connection);
            this.sendConnectionPreamble(0);
            this.sendLoginState(71, loggedIn);
            this.currentResponse = null;
            this.responseHeader.position = 0;
            while (true) {
              var4_ref = (NetworkResourceRequest) (this.urgentInFlight.removeFirst((byte) 72));
              if (var4_ref != null) {
                this.urgentQueued.addLast((DualLinkNode) (var4_ref), (byte) -128);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (NetworkResourceRequest) (this.backgroundInFlight.removeFirst((byte) 72));
              if (var4_refLifetime1 != null) {
                this.backgroundQueued.addLast((DualLinkNode) (var4_refLifetime1), (byte) -101);
                continue;
              }
              break;
            }
            if (guard <= 90) {
              return;
            }
            if (this.xorKey != 0) {
              try {
                this.requestBuffer.position = 0;
                this.requestBuffer.writeByte((byte) 89, 4);
                this.requestBuffer.writeByte((byte) 36, (int) this.xorKey);
                this.requestBuffer.writeInt(48, 0);
                this.socket.write(0, -2, this.requestBuffer.payload, this.requestBuffer.payload.length);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.socket.close((byte) -73);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.socket = null;
                this.failureCode = -2;
                this.failureCount = this.failureCount + 1;
              }
            }
            this.idleMillis = 0;
            this.lastServiceMillis = wq.monotonicTimeMillis(-78);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_27_0 = var4_ref3;
            stackIn_27_1 = new StringBuilder().append("t.F(").append(loggedIn).append(',').append(guard).append(',');
            if (connection == null) {
              stackIn_28_2 = "null";
            } else {
              stackIn_28_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        field_p = null;
        field_s = null;
        if (param0 != 1) {
          SocketJs5Client.releaseStatics(-122);
        }
    }

    final void invalidateConnection(int guard) {
        try {
          this.socket.close((byte) -65);
        } catch (Exception exception) {
        }
        this.failureCode = -1;
        this.failureCount = this.failureCount + 1;
        this.socket = null;
        this.xorKey = (byte)(int)(1.0 + Math.random() * 255.0);
        if (guard != 14702) {
          field_q = -47;
        }
    }

    final boolean service(byte guard) {
        try {
          int var2_int = 0;
          int stackIn_65_0 = 0;
          int stackIn_81_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          NetworkResourceRequest var2 = null;
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
          NetworkResourceRequest var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          NetworkResourceRequest var2Lifetime1;
          var16 = Sumoblitz.field_L ? 1 : 0;
          if (guard <= 78) {
            return false;
          }
          if (this.socket != null) {
            var2_long = wq.monotonicTimeMillis(-113);
            var4 = (int)(var2_long - this.lastServiceMillis);
            if (var4 > 200) {
              var4 = 200;
            }
            this.lastServiceMillis = var2_long;
            this.idleMillis = this.idleMillis + var4;
            if (30000 < this.idleMillis) {
              try {
                this.socket.close((byte) -72);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.socket = null;
            }
          }
          if (this.socket == null) {
            if (this.urgentRequestCount(-2115911413) != 0) {
              return false;
            }
            if (0 == this.backgroundRequestCount((byte) -86)) {
              return true;
            }
            return false;
          }
          try {
            this.socket.checkWriteError(-120);
            var2 = (NetworkResourceRequest) (this.urgentQueued.first(32));
            while (var2 != null) {
              this.requestBuffer.position = 0;
              this.requestBuffer.writeByte((byte) 55, 1);
              this.requestBuffer.writeLong40(var2.secondaryKey, 1105594440);
              this.socket.write(0, -2, this.requestBuffer.payload, this.requestBuffer.payload.length);
              this.urgentInFlight.addLast((DualLinkNode) (var2), (byte) -107);
              var2 = (NetworkResourceRequest) (this.urgentQueued.next(-2));
            }
            var2Lifetime1 = (NetworkResourceRequest) (this.backgroundQueued.first(37));
            while (var2Lifetime1 != null) {
              this.requestBuffer.position = 0;
              this.requestBuffer.writeByte((byte) 86, 0);
              this.requestBuffer.writeLong40(var2Lifetime1.secondaryKey, 1105594440);
              this.socket.write(0, -2, this.requestBuffer.payload, this.requestBuffer.payload.length);
              this.backgroundInFlight.addLast((DualLinkNode) (var2Lifetime1), (byte) -103);
              var2Lifetime1 = (NetworkResourceRequest) (this.backgroundQueued.next(-2));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.socket.available(-128);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.idleMillis = 0;
                var4 = 0;
                if (this.currentResponse == null) {
                  var4 = 10;
                } else {
                  if (0 == this.currentResponse.blockPosition) {
                    var4 = 1;
                  }
                }
                if (var4 > 0) {
                  var5 = -this.responseHeader.position + var4;
                  if (var3_int < var5) {
                    var5 = var3_int;
                  }
                  this.socket.readFully(-114, this.responseHeader.position, var5, this.responseHeader.payload);
                  if (0 != this.xorKey) {
                    for (var6 = 0; var6 < var5; var6++) {
                      this.responseHeader.payload[var6 + this.responseHeader.position] = (byte)GzipDecompressor.bitwiseXor((int) this.responseHeader.payload[var6 + this.responseHeader.position], (int) this.xorKey);
                    }
                  }
                  this.responseHeader.position = this.responseHeader.position + var5;
                  if (this.responseHeader.position >= var4) {
                    if (null == this.currentResponse) {
                      this.responseHeader.position = 0;
                      var6 = this.responseHeader.readUnsignedByte(-31302);
                      var7 = this.responseHeader.readInt(true);
                      var8 = this.responseHeader.readUnsignedByte(-31302);
                      var9 = this.responseHeader.readInt(true);
                      var10 = 127 & var8;
                      stackIn_65_0 = (0 == (128 & var8)) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_65_0;
                      var12 = ((long)var6 << 32) + (long)var7;
                      var14 = null;
                      if (var11 != 0) {
                        var14_ref = (NetworkResourceRequest) (this.backgroundInFlight.first(64));
                        while (var14_ref != null) {
                          if (var14_ref.secondaryKey == var12) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (NetworkResourceRequest) (this.backgroundInFlight.next(-2));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (NetworkResourceRequest) (this.urgentInFlight.first(66));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.secondaryKey) {
                            break;
                          }
                          var14_ref = (NetworkResourceRequest) (this.urgentInFlight.next(-2));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_81_0 = (0 == var10) ? 5 : 9;
                      var15 = stackIn_81_0;
                      this.currentResponse = var14_ref;
                      this.currentResponse.response = new PacketBuffer(this.currentResponse.paddingBytes + var15 + var9);
                      this.currentResponse.response.writeByte((byte) 37, var10);
                      this.currentResponse.response.writeInt(48, var9);
                      this.currentResponse.blockPosition = 10;
                      this.responseHeader.position = 0;
                    } else {
                      if (0 != this.currentResponse.blockPosition) {
                        throw new IOException();
                      }
                      if (this.responseHeader.payload[0] == -1) {
                        this.currentResponse.blockPosition = 1;
                        this.responseHeader.position = 0;
                      } else {
                        this.currentResponse = null;
                      }
                    }
                  }
                } else {
                  var5 = this.currentResponse.response.payload.length - this.currentResponse.paddingBytes;
                  var6 = -this.currentResponse.blockPosition + 512;
                  if (var6 > var5 - this.currentResponse.response.position) {
                    var6 = var5 - this.currentResponse.response.position;
                  }
                  if (var3_int < var6) {
                    var6 = var3_int;
                  }
                  this.socket.readFully(-115, this.currentResponse.response.position, var6, this.currentResponse.response.payload);
                  if (this.xorKey != 0) {
                    for (var7 = 0; var7 < var6; var7++) {
                      this.currentResponse.response.payload[this.currentResponse.response.position + var7] = (byte)GzipDecompressor.bitwiseXor((int) this.currentResponse.response.payload[this.currentResponse.response.position + var7], (int) this.xorKey);
                    }
                  }
                  this.currentResponse.blockPosition = this.currentResponse.blockPosition + var6;
                  this.currentResponse.response.position = this.currentResponse.response.position + var6;
                  if (var5 != this.currentResponse.response.position) {
                    if (this.currentResponse.blockPosition == 512) {
                      this.currentResponse.blockPosition = 0;
                    }
                  } else {
                    this.currentResponse.unlinkSecondary(-5106);
                    this.currentResponse.pending = false;
                    this.currentResponse = null;
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
              this.socket.close((byte) -60);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.socket = null;
            this.failureCount = this.failureCount + 1;
            this.failureCode = -2;
            if (0 == this.urgentRequestCount(-2115911413) &&
              this.backgroundRequestCount((byte) -122) == 0) {
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

    private final void sendLoginState(int guard, boolean loggedIn) {
        try {
          IOException iOException = null;
          PacketBuffer stackIn_5_0 = null;
          int stackIn_5_1 = 0;
          int stackIn_6_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.socket == null) {
            return;
          }
          try {
            this.requestBuffer.position = 0;
            stackIn_5_0 = this.requestBuffer;
            stackIn_5_1 = 46;
            if (!loggedIn) {
              stackIn_6_2 = 3;
            } else {
              stackIn_6_2 = 2;
            }
            ((PacketBuffer) (Object) stackIn_5_0).writeByte((byte) stackIn_5_1, stackIn_6_2);
            this.requestBuffer.writeLong40(0L, 1105594440);
            if (guard < 63) {
              return;
            }
            this.socket.write(0, -2, this.requestBuffer.payload, this.requestBuffer.payload.length);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.socket.close((byte) -93);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.failureCode = -2;
            this.failureCount = this.failureCount + 1;
            this.socket = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void sendConnectionPreamble(int guard) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (this.socket == null) {
            return;
          }
          try {
            this.requestBuffer.position = guard;
            this.requestBuffer.writeByte((byte) 19, 6);
            this.requestBuffer.writeMedium(3, guard + 102);
            this.requestBuffer.writeShort(guard + 127, 0);
            this.socket.write(0, -2, this.requestBuffer.payload, this.requestBuffer.payload.length);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.socket.close((byte) -94);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.failureCount = this.failureCount + 1;
            this.failureCode = -2;
            this.socket = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public SocketJs5Client() {
    }

    final void closeConnection(int guard) {
        if (guard > -61) {
          field_q = 32;
        }
        if (null != this.socket) {
          this.socket.close((byte) -46);
        }
    }

    static {
        field_p = new boolean[25];
        field_s = null;
    }
}
