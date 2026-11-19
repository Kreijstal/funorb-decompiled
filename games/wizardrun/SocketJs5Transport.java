/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SocketJs5Transport extends Js5Transport {
    static BufferedRandomAccessFile[] field_o;
    private BufferedSocket field_p;
    static int field_r;
    static MidiTrack[] musicTracks;

    final void resetAfterError(boolean param0) {
        try {
          this.field_p.close((byte) 76);
        } catch (Exception exception) {
        }
        this.field_p = null;
        this.field_k = this.field_k + 1;
        this.field_n = -1;
        this.field_h = (byte)(int)(1.0 + 255.0 * Math.random());
        if (!param0) {
          field_o = (BufferedRandomAccessFile[]) null;
        }
    }

    final static PcmStreamMixer getAudioMixer(byte param0) {
        if (param0 <= 124) {
          SocketJs5Transport.releaseStatics(-10);
        }
        return AccountSocketHelpers.field_c;
    }

    final boolean service(byte param0) {
        try {
          int var2_int = 0;
          int stackIn_47_0 = 0;
          int stackIn_63_0 = 0;
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
          int var17 = 0;
          NetworkArchiveRequest var2Lifetime1;
          var16 = wizardrun.field_H;
          if (null != this.field_p) {
            var2_long = MonotonicClockHelpers.monotonicMillis((byte) 79);
            var4 = (int)(var2_long - this.field_d);
            if (200 < var4) {
              var4 = 200;
            }
            this.field_d = var2_long;
            this.field_f = this.field_f + var4;
            if (this.field_f > 30000) {
              try {
                this.field_p.close((byte) 76);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_p = null;
            }
          }
          if (null == this.field_p) {
            if (this.getPriorityRequestCount(-14289) != 0) {
              return false;
            }
            if (this.getNormalRequestCount((byte) -96) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_p.checkWriteError(param0 ^ 0);
            var2 = (NetworkArchiveRequest) (this.field_b.first(0));
            while (var2 != null) {
              this.field_i.position = 0;
              this.field_i.writeByte((byte) 11, 1);
              this.field_i.writeLong40(var2.secondaryKey, (byte) 122);
              this.field_p.write(this.field_i.payload.length, this.field_i.payload, 1, 0);
              this.field_a.addLast(var2, 14);
              var2 = (NetworkArchiveRequest) (this.field_b.next(14));
            }
            if (param0 != 0) {
              return false;
            }
            var2Lifetime1 = (NetworkArchiveRequest) (this.field_j.first(0));
            while (var2Lifetime1 != null) {
              this.field_i.position = 0;
              this.field_i.writeByte((byte) 11, 0);
              this.field_i.writeLong40(var2Lifetime1.secondaryKey, (byte) 123);
              this.field_p.write(this.field_i.payload.length, this.field_i.payload, 1, 0);
              this.field_m.addLast(var2Lifetime1, 14);
              var2Lifetime1 = (NetworkArchiveRequest) (this.field_j.next(94));
            }
            for (var2_int = 0; 100 > var2_int; var2_int++) {
              var3_int = this.field_p.available((byte) 89);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.field_f = 0;
                var4 = 0;
                if (null == this.field_c) {
                  var4 = 10;
                } else {
                  if (0 == this.field_c.blockOffset) {
                    var4 = 1;
                  }
                }
                if (var4 <= 0) {
                  var5 = this.field_c.packet.payload.length - this.field_c.padding;
                  var6 = 512 - this.field_c.blockOffset;
                  if (var5 - this.field_c.packet.position < var6) {
                    var6 = var5 - this.field_c.packet.position;
                  }
                  if (var6 > var3_int) {
                    var6 = var3_int;
                  }
                  this.field_p.readFully(this.field_c.packet.payload, -124, var6, this.field_c.packet.position);
                  if (this.field_h != 0) {
                    var17 = 0;
                    var7 = var17;
                    while (var17 < var6) {
                      this.field_c.packet.payload[this.field_c.packet.position + var17] = (byte)DiskCacheStore.xor((int) this.field_c.packet.payload[this.field_c.packet.position + var17], (int) this.field_h);
                      var17++;
                    }
                  }
                  this.field_c.packet.position = this.field_c.packet.position + var6;
                  this.field_c.blockOffset = this.field_c.blockOffset + var6;
                  if (this.field_c.packet.position != var5) {
                    if (this.field_c.blockOffset == 512) {
                      this.field_c.blockOffset = 0;
                    }
                  } else {
                    this.field_c.unlinkSecondary(false);
                    this.field_c.pending = false;
                    this.field_c = null;
                  }
                } else {
                  var5 = var4 - this.field_g.position;
                  if (var3_int < var5) {
                    var5 = var3_int;
                  }
                  this.field_p.readFully(this.field_g.payload, param0 - 105, var5, this.field_g.position);
                  if (this.field_h != 0) {
                    for (var6 = 0; var5 > var6; var6++) {
                      this.field_g.payload[this.field_g.position + var6] = (byte)DiskCacheStore.xor((int) this.field_g.payload[this.field_g.position + var6], (int) this.field_h);
                    }
                  }
                  this.field_g.position = this.field_g.position + var5;
                  if (this.field_g.position >= var4) {
                    if (null == this.field_c) {
                      this.field_g.position = 0;
                      var6 = this.field_g.readUnsignedByte(255);
                      var7 = this.field_g.readInt(param0 ^ 255);
                      var8 = this.field_g.readUnsignedByte(255);
                      var9 = this.field_g.readInt(255);
                      var10 = var8 & 127;
                      stackIn_47_0 = ((128 & var8) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_47_0;
                      var12 = ((long)var6 << 32) + (long)var7;
                      var14 = null;
                      if (var11 == 0) {
                        var14_ref = (NetworkArchiveRequest) (this.field_a.first(0));
                        while (var14_ref != null) {
                          if (var12 == var14_ref.secondaryKey) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (NetworkArchiveRequest) (this.field_a.next(42));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (NetworkArchiveRequest) (this.field_m.first(0));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.secondaryKey) {
                            break;
                          }
                          var14_ref = (NetworkArchiveRequest) (this.field_m.next(87));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_63_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_63_0;
                      this.field_c = var14_ref;
                      this.field_c.packet = new PacketBuffer(this.field_c.padding + var9 + var15);
                      this.field_c.packet.writeByte((byte) 11, var10);
                      this.field_c.packet.writeInt(var9, 613003928);
                      this.field_c.blockOffset = 10;
                      this.field_g.position = 0;
                    } else {
                      if (0 != this.field_c.blockOffset) {
                        throw new IOException();
                      }
                      if (this.field_g.payload[0] == -1) {
                        this.field_g.position = 0;
                        this.field_c.blockOffset = 1;
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
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_p.close((byte) 76);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_k = this.field_k + 1;
            this.field_p = null;
            this.field_n = -2;
            if (0 == this.getPriorityRequestCount(param0 - 14289) &&
              this.getNormalRequestCount((byte) -74) == 0) {
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

    private final void sendSetupPacket(int param0) {
        try {
          IOException iOException = null;
          int var2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          var2 = 66 / ((17 - param0) / 48);
          if (null == this.field_p) {
            return;
          }
          try {
            this.field_i.position = 0;
            this.field_i.writeByte((byte) 11, 6);
            this.field_i.writeMedium(3, false);
            this.field_i.writeShort(-1947079288, 0);
            this.field_p.write(this.field_i.payload.length, this.field_i.payload, 1, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_p.close((byte) 76);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_n = -2;
            this.field_k = this.field_k + 1;
            this.field_p = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 >= -126) {
          return;
        }
        EmailCheckRequest.field_h = 7;
        ProgressDialog.field_Y = param1;
        AccountPacketState.field_c = param0;
    }

    final void close(byte param0) {
        if (null != this.field_p) {
          this.field_p.close((byte) 76);
        }
        if (param0 > -73) {
          musicTracks = (MidiTrack[]) null;
        }
    }

    public static void releaseStatics(int param0) {
        musicTracks = null;
        field_o = null;
        if (param0 != -1) {
          SocketJs5Transport.a(-54, 7, -58);
        }
    }

    final static Sprite buildFirstDecodedSprite(int param0) {
        int var4_int = 0;
        int var5 = wizardrun.field_H;
        int var1 = MouseInputHandler.field_b[0] * ImageProducerRasterBuffer.field_k[0];
        byte[] var2 = TextFieldValidator.field_j[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
          var3[var4_int] = DecodedSpritePalette.palette[ResourceArchive.bitAnd((int) var2[var4_int], 255)];
        }
        Sprite var4 = new Sprite(ProgressDialog.field_bb, PlatformActor.field_v, GameMenu.field_q[0], AccountFormText.field_h[0], ImageProducerRasterBuffer.field_k[param0], MouseInputHandler.field_b[0], var3);
        ClientException.clearDecodedSpriteState(param0 ^ 0);
        return var4;
    }

    private final void sendLoginState(int param0, boolean param1) {
        try {
          IOException iOException = null;
          PacketBuffer stackIn_6_0 = null;
          int stackIn_6_1 = 0;
          int stackIn_7_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (null == this.field_p) {
            return;
          }
          try {
            if (param0 != 3) {
              this.field_p = (BufferedSocket) null;
            }
            this.field_i.position = 0;
            stackIn_6_0 = this.field_i;
            stackIn_6_1 = 11;
            if (param1) {
              stackIn_7_2 = 2;
            } else {
              stackIn_7_2 = 3;
            }
            ((PacketBuffer) (Object) stackIn_6_0).writeByte((byte) stackIn_6_1, stackIn_7_2);
            this.field_i.writeLong40(0L, (byte) 106);
            this.field_p.write(this.field_i.payload.length, this.field_i.payload, param0 ^ 2, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_p.close((byte) 76);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_k = this.field_k + 1;
            this.field_p = null;
            this.field_n = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public SocketJs5Transport() {
    }

    final void setConnection(boolean param0, Object param1, int param2) {
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
          var6 = wizardrun.field_H;
          try {
            if (null != this.field_p) {
              try {
                this.field_p.close((byte) 76);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_p = null;
            }
            if (param2 <= 118) {
              return;
            }
            this.field_p = (BufferedSocket) (param1);
            this.sendSetupPacket(-73);
            this.sendLoginState(3, param0);
            this.field_g.position = 0;
            this.field_c = null;
            while (true) {
              var4_ref = (NetworkArchiveRequest) (this.field_a.removeFirst(58));
              if (var4_ref != null) {
                this.field_b.addLast(var4_ref, 14);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (NetworkArchiveRequest) (this.field_m.removeFirst(70));
              if (var4_refLifetime1 != null) {
                this.field_j.addLast(var4_refLifetime1, 14);
                continue;
              }
              break;
            }
            if (this.field_h != 0) {
              try {
                this.field_i.position = 0;
                this.field_i.writeByte((byte) 11, 4);
                this.field_i.writeByte((byte) 11, (int) this.field_h);
                this.field_i.writeInt(0, 613003928);
                this.field_p.write(this.field_i.payload.length, this.field_i.payload, 1, 0);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_p.close((byte) 76);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_k = this.field_k + 1;
                this.field_n = -2;
                this.field_p = null;
              }
            }
            this.field_f = 0;
            this.field_d = MonotonicClockHelpers.monotonicMillis((byte) 50);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_27_0 = var4_ref3;
            stackIn_27_1 = new StringBuilder().append("sl.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_28_2 = "null";
            } else {
              stackIn_28_2 = "{...}";
            }
            throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
