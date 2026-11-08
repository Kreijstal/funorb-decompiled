/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SocketJs5Transport extends Js5Transport {
    static SceneWidget field_t;
    static int field_u;
    static int field_r;
    private BufferedSocket transport;
    static int[] field_q;

    final void reportIntegrityFailure(byte param0) {
        try {
          this.transport.close(-1);
        } catch (Exception exception) {
        }
        this.field_h = this.field_h + 1;
        if (param0 != 0) {
          field_r = 79;
        }
        this.field_m = -1;
        this.transport = null;
        this.field_a = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final static void resetRetryTimer(int param0) {
        LoginMethod.field_d = hm.monotonicMillis(64);
        if (param0 >= -11) {
          SocketJs5Transport.tickScorePopups(16);
        }
        LoginDialog.field_ob = 0;
    }

    final void attachTransport(Object param0, boolean param1, int param2) {
        try {
          RuntimeException stackIn_29_0 = null;
          StringBuilder stackIn_29_1 = null;
          String stackIn_30_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          Js5NetworkRequest var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          Js5NetworkRequest var4_refLifetime1;
          var6 = Pixelate.field_H ? 1 : 0;
          try {
            if (param2 != 8) {
              this.sendOpcodeSixControlPacket(-125);
            }
            if (this.transport != null) {
              try {
                this.transport.close(-1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.transport = null;
            }
            this.transport = (BufferedSocket) (param0);
            this.sendOpcodeSixControlPacket(0);
            this.sendStateControlPacket((byte) 73, param1);
            this.field_g.position = 0;
            this.field_c = null;
            while (true) {
              var4_ref = (Js5NetworkRequest) (this.field_f.removeFirst((byte) 80));
              if (var4_ref != null) {
                this.field_e.addLast(param2 ^ 84, var4_ref);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (Js5NetworkRequest) (this.field_p.removeFirst((byte) 80));
              if (var4_refLifetime1 != null) {
                this.field_l.addLast(param2 + 104, var4_refLifetime1);
                continue;
              }
              break;
            }
            if (0 != this.field_a) {
              try {
                this.field_b.position = 0;
                this.field_b.writeByte(160, 4);
                this.field_b.writeByte(160, (int) this.field_a);
                this.field_b.writeInt(0, param2 - 126);
                this.transport.write(this.field_b.payload.length, -89, 0, this.field_b.payload);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.transport.close(param2 ^ -9);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_h = this.field_h + 1;
                this.transport = null;
                this.field_m = -2;
              }
            }
            this.field_o = 0;
            this.field_k = hm.monotonicMillis(64);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_29_0 = var4_ref3;
            stackIn_29_1 = new StringBuilder().append("wn.D(");
            if (param0 == null) {
              stackIn_30_2 = "null";
            } else {
              stackIn_30_2 = "{...}";
            }
            throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean pollTransport(boolean param0) {
        try {
          int var2_int = 0;
          int stackIn_50_0 = 0;
          int stackIn_66_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          Js5NetworkRequest var2 = null;
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
          Js5NetworkRequest var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          int var17 = 0;
          Js5NetworkRequest var2Lifetime1;
          var16 = Pixelate.field_H ? 1 : 0;
          if (null != this.transport) {
            var2_long = hm.monotonicMillis(64);
            var4 = (int)(var2_long - this.field_k);
            this.field_k = var2_long;
            if (200 < var4) {
              var4 = 200;
            }
            this.field_o = this.field_o + var4;
            if (this.field_o > 30000) {
              try {
                this.transport.close(-1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.transport = null;
            }
          }
          if (this.transport == null) {
            if (this.getInFlightRequestCount(-97) != 0) {
              return false;
            }
            if (this.getPendingRequestCount((byte) 34) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.transport.checkWriteError((byte) -106);
            var2 = (Js5NetworkRequest) (this.field_e.first(61));
            while (var2 != null) {
              this.field_b.position = 0;
              this.field_b.writeByte(160, 1);
              this.field_b.writeLong40(var2.field_q, 109);
              this.transport.write(this.field_b.payload.length, -118, 0, this.field_b.payload);
              this.field_f.addLast(98, var2);
              var2 = (Js5NetworkRequest) (this.field_e.next(65151));
            }
            var2Lifetime1 = (Js5NetworkRequest) (this.field_l.first(72));
            while (var2Lifetime1 != null) {
              this.field_b.position = 0;
              this.field_b.writeByte(160, 0);
              this.field_b.writeLong40(var2Lifetime1.field_q, 91);
              this.transport.write(this.field_b.payload.length, -113, 0, this.field_b.payload);
              this.field_p.addLast(-114, var2Lifetime1);
              var2Lifetime1 = (Js5NetworkRequest) (this.field_l.next(65151));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.transport.available(-73);
              if (0 > var3_int) {
                throw new IOException();
              }
              if (0 != var3_int) {
                this.field_o = 0;
                var4 = 0;
                if (null == this.field_c) {
                  var4 = 10;
                } else {
                  if (this.field_c.field_H == 0) {
                    var4 = 1;
                  }
                }
                if (0 >= var4) {
                  var5 = -this.field_c.field_B + this.field_c.field_D.payload.length;
                  var6 = -this.field_c.field_H + 512;
                  if (var5 - this.field_c.field_D.position < var6) {
                    var6 = -this.field_c.field_D.position + var5;
                  }
                  if (var3_int < var6) {
                    var6 = var3_int;
                  }
                  this.transport.readFully(this.field_c.field_D.payload, this.field_c.field_D.position, (byte) 119, var6);
                  if (this.field_a != 0) {
                    var17 = 0;
                    var7 = var17;
                    while (var17 < var6) {
                      this.field_c.field_D.payload[this.field_c.field_D.position + var17] = (byte)DraggableWidget.intXor((int) this.field_c.field_D.payload[this.field_c.field_D.position + var17], (int) this.field_a);
                      var17++;
                    }
                  }
                  this.field_c.field_H = this.field_c.field_H + var6;
                  this.field_c.field_D.position = this.field_c.field_D.position + var6;
                  if (var5 != this.field_c.field_D.position) {
                    if (this.field_c.field_H == 512) {
                      this.field_c.field_H = 0;
                    }
                  } else {
                    this.field_c.unlinkSecondary(17);
                    this.field_c.field_v = false;
                    this.field_c = null;
                  }
                } else {
                  var5 = -this.field_g.position + var4;
                  if (var3_int < var5) {
                    var5 = var3_int;
                  }
                  this.transport.readFully(this.field_g.payload, this.field_g.position, (byte) 119, var5);
                  if (0 != this.field_a) {
                    for (var6 = 0; var5 > var6; var6++) {
                      this.field_g.payload[var6 + this.field_g.position] = (byte)DraggableWidget.intXor((int) this.field_g.payload[var6 + this.field_g.position], (int) this.field_a);
                    }
                  }
                  this.field_g.position = this.field_g.position + var5;
                  if (var4 <= this.field_g.position) {
                    if (null == this.field_c) {
                      this.field_g.position = 0;
                      var6 = this.field_g.readUnsignedByte(255);
                      var7 = this.field_g.readInt(0);
                      var8 = this.field_g.readUnsignedByte(255);
                      var9 = this.field_g.readInt(0);
                      var10 = 127 & var8;
                      stackIn_50_0 = ((var8 & 128) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_50_0;
                      var12 = ((long)var6 << 32) + (long)var7;
                      var14 = null;
                      if (var11 == 0) {
                        var14_ref = (Js5NetworkRequest) (this.field_f.first(96));
                        while (var14_ref != null) {
                          if (~var14_ref.field_q == ~var12) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (Js5NetworkRequest) (this.field_f.next(65151));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (Js5NetworkRequest) (this.field_p.first(62));
                        while (var14_ref != null) {
                          if (var14_ref.field_q == var12) {
                            break;
                          }
                          var14_ref = (Js5NetworkRequest) (this.field_p.next(65151));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_66_0 = (var10 == 0) ? 5 : 9;
                      var15 = stackIn_66_0;
                      this.field_c = var14_ref;
                      this.field_c.field_D = new PacketBuffer(var15 + var9 + this.field_c.field_B);
                      this.field_c.field_D.writeByte(160, var10);
                      this.field_c.field_D.writeInt(var9, -59);
                      this.field_c.field_H = 10;
                      this.field_g.position = 0;
                    } else {
                      if (this.field_c.field_H != 0) {
                        throw new IOException();
                      }
                      if (this.field_g.payload[0] == -1) {
                        this.field_c.field_H = 1;
                        this.field_g.position = 0;
                      } else {
                        this.field_c = null;
                      }
                    }
                  }
                }
                continue;
              }
              break;
            }
            if (param0) {
              SocketJs5Transport.tickScorePopups(-11);
            }
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.transport.close(-1);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_h = this.field_h + 1;
            this.transport = null;
            this.field_m = -2;
            if (0 == this.getInFlightRequestCount(-30) &&
              this.getPendingRequestCount((byte) 34) == 0) {
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

    public static void releaseStatics(int param0) {
        field_q = null;
        field_t = null;
        if (param0 <= 60) {
          SocketJs5Transport.resetRetryTimer(81);
        }
    }

    private final void sendOpcodeSixControlPacket(int param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (this.transport == null) {
            return;
          }
          try {
            this.field_b.position = 0;
            this.field_b.writeByte(160, 6);
            this.field_b.writeMedium(3, (byte) 109);
            this.field_b.writeShort(1276387944, 0);
            this.transport.write(this.field_b.payload.length, param0 ^ -103, param0, this.field_b.payload);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.transport.close(-1);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.transport = null;
            this.field_m = -2;
            this.field_h = this.field_h + 1;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void tickScorePopups(int param0) {
        int var2 = 0;
        ScorePopup[] var1 = null;
        ScorePopup var3 = null;
        int var4 = 0;
        ScorePopup[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          var5 = PuzzleThumbnail.field_n;
          var1 = var5;
          for (var2 = param0; var5.length > var2; var2++) {
            var3 = var5[var2];
            var3.tick(-110);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var1_ref), "wn.E(" + param0 + ')');
        }
    }

    final void closeTransport(byte param0) {
        int var2 = -89 % ((param0 - 82) / 33);
        if (this.transport != null) {
          this.transport.close(-1);
        }
    }

    private final void sendStateControlPacket(byte param0, boolean param1) {
        try {
          IOException iOException = null;
          PacketBuffer stackIn_7_0 = null;
          int stackIn_7_1 = 0;
          int stackIn_8_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (param0 != 73) {
            return;
          }
          if (this.transport == null) {
            return;
          }
          try {
            this.field_b.position = 0;
            stackIn_7_0 = this.field_b;
            stackIn_7_1 = 160;
            if (!param1) {
              stackIn_8_2 = 3;
            } else {
              stackIn_8_2 = 2;
            }
            ((PacketBuffer) (Object) stackIn_7_0).writeByte(stackIn_7_1, stackIn_8_2);
            this.field_b.writeLong40(0L, -59);
            this.transport.write(this.field_b.payload.length, -85, 0, this.field_b.payload);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.transport.close(-1);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_h = this.field_h + 1;
            this.field_m = -2;
            this.transport = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public SocketJs5Transport() {
    }

    static {
        field_u = 256;
        field_q = new int[8192];
    }
}
