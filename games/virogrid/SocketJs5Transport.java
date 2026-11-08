/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SocketJs5Transport extends Js5Transport {
    static TypeCode field_z;
    static String textViewcontrolsRight;
    static String field_A;
    static String field_w;
    private BufferedSocket field_B;
    static String field_y;
    static boolean field_x;

    final void resetAfterValidationFailure(byte param0) {
        try {
          this.field_B.close(4155);
        } catch (Exception exception) {
        }
        this.field_b = -1;
        this.field_l = this.field_l + 1;
        this.field_B = null;
        this.field_g = (byte)(int)(Math.random() * 255.0 + 1.0);
        if (param0 <= 81) {
          SocketJs5Transport.releaseStatics(false);
        }
    }

    final static int bitLength(int param0, byte param1) {
        int var2;
        var2 = 0;
        if (param0 < 0 ||
          param0 >= 65536) {
          var2 += 16;
          param0 = param0 >>> 16;
        }
        if (param0 >= 256) {
          param0 = param0 >>> 8;
          var2 += 8;
        }
        if (param0 >= 16) {
          var2 += 4;
          param0 = param0 >>> 4;
        }
        if (param0 >= 4) {
          var2 += 2;
          param0 = param0 >>> 2;
        }
        if (param1 >= -40) {
          return -21;
        }
        if (param0 >= 1) {
          param0 = param0 >>> 1;
          var2++;
        }
        return param0 + var2;
    }

    public static void releaseStatics(boolean param0) {
        textViewcontrolsRight = null;
        field_z = null;
        field_A = null;
        if (!param0) {
          SocketJs5Transport.findPopupMenuRowAt(125, 76, (byte) -34);
        }
        field_y = null;
        field_w = null;
    }

    private final void sendStateControlPacket(boolean param0, int param1) {
        try {
          IOException iOException = null;
          PacketBuffer stackIn_6_0 = null;
          int stackIn_7_1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.field_B == null) {
            return;
          }
          try {
            this.field_t.position = 0;
            if (param1 != -13919) {
              field_w = (String) null;
            }
            stackIn_6_0 = this.field_t;
            if (param0) {
              stackIn_7_1 = 2;
            } else {
              stackIn_7_1 = 3;
            }
            ((PacketBuffer) (Object) stackIn_6_0).writeByte(stackIn_7_1, -97);
            this.field_t.writeLong40(0L, 65280);
            this.field_B.write(this.field_t.payload, 0, 0, this.field_t.payload.length);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_B.close(4155);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_l = this.field_l + 1;
            this.field_B = null;
            this.field_b = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int findPopupMenuRowAt(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          var3_int = 97 % ((param2 + 57) / 61);
          var4 = 0;
          var5 = FullscreenState.field_a;
          while (var4 < DrawOfferMenuHelpers.field_c.length) {
            var6 = FrameSkin.field_h[var4];
            if (0 <= var6) {
              var7 = SectorCacheStore.measureText(1492912648, true, DrawOfferMenuHelpers.field_c[var4]);
              var8 = -(var7 >> 1) + PendingHighscoreRequest.field_q;
              var5 = var5 + BitwiseHelpers.field_d;
              if (RasterBuffer.rectContains(-Js5Archive.field_d + var8, param1, (Js5Archive.field_d << 1) + var7, true, var5, param0, DebouncedValidator.field_c + (DelayedPacket.field_j << 1))) {
                stackIn_7_0 = var6;
                return stackIn_7_0;
              }
              var5 = var5 + (DebouncedValidator.field_c + (DelayedPacket.field_j << 1) + BitwiseHelpers.field_d);
            } else {
              var5 = var5 + LongAndTextLoginPayload.field_m;
            }
            var4++;
          }
          stackIn_11_0 = -1;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var3), "pn.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void closeConnection(int param0) {
        if (param0 <= 17) {
          return;
        }
        if (null != this.field_B) {
          this.field_B.close(4155);
        }
    }

    final void setConnection(int param0, boolean param1, Object param2) {
        try {
          RuntimeException stackIn_29_0 = null;
          StringBuilder stackIn_29_1 = null;
          String stackIn_30_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          NetworkArchiveRequest var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          NetworkArchiveRequest var4_refLifetime1;
          var6 = Virogrid.field_F ? 1 : 0;
          try {
            if (null != this.field_B) {
              try {
                this.field_B.close(4155);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_B = null;
            }
            this.field_B = (BufferedSocket) (param2);
            this.sendInitControlPacket(false);
            this.sendStateControlPacket(param1, -13919);
            this.field_n.position = 0;
            this.field_d = null;
            while (true) {
              var4_ref = (NetworkArchiveRequest) (this.field_c.removeFirst((byte) -103));
              if (var4_ref != null) {
                this.field_i.addLast(var4_ref, (byte) 93);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (NetworkArchiveRequest) (this.field_h.removeFirst((byte) -103));
              if (var4_refLifetime1 != null) {
                this.field_p.addLast(var4_refLifetime1, (byte) 119);
                continue;
              }
              break;
            }
            if (0 != this.field_g) {
              try {
                this.field_t.position = 0;
                this.field_t.writeByte(4, 97);
                this.field_t.writeByte((int) this.field_g, -101);
                this.field_t.writeInt(0, (byte) -42);
                this.field_B.write(this.field_t.payload, 0, 0, this.field_t.payload.length);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_B.close(4155);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_l = this.field_l + 1;
                this.field_b = -2;
                this.field_B = null;
              }
            }
            this.field_k = 0;
            if (param0 >= 0) {
              textViewcontrolsRight = (String) null;
            }
            this.field_f = ClockAndTextHelpers.monotonicMillis(-9986);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_29_0 = var4_ref3;
            stackIn_29_1 = new StringBuilder().append("pn.J(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_30_2 = "null";
            } else {
              stackIn_30_2 = "{...}";
            }
            throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void measureToggleLabelWidth(boolean param0) {
        AccountTermsPanel.field_L = ReflectionCheckHelpers.standardFont.textWidth(LoginDialog.field_pb[14]);
        if (param0) {
          SocketJs5Transport.bitLength(-7, (byte) 94);
        }
        int var1 = ReflectionCheckHelpers.standardFont.textWidth(LoginDialog.field_pb[15]);
        if (!(var1 <= AccountTermsPanel.field_L)) {
          AccountTermsPanel.field_L = var1;
        }
    }

    final boolean poll(int param0) {
        try {
          int var2_int = 0;
          int stackIn_60_0 = 0;
          int stackIn_75_0 = 0;
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
          var16 = Virogrid.field_F ? 1 : 0;
          if (this.field_B != null) {
            var2_long = ClockAndTextHelpers.monotonicMillis(-9986);
            var4 = (int)(-this.field_f + var2_long);
            if (200 < var4) {
              var4 = 200;
            }
            this.field_f = var2_long;
            this.field_k = this.field_k + var4;
            if (this.field_k > 30000) {
              try {
                this.field_B.close(4155);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_B = null;
            }
          }
          if (null == this.field_B) {
            if (this.getInFlightRequestCount((byte) -16) == 0 &&
              this.prefetchCount(109) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_B.checkWriteError(-110);
            if (param0 > -9) {
              field_w = (String) null;
            }
            var2 = (NetworkArchiveRequest) (this.field_i.first(-1));
            while (var2 != null) {
              this.field_t.position = 0;
              this.field_t.writeByte(1, -83);
              this.field_t.writeLong40(var2.field_j, 65280);
              this.field_B.write(this.field_t.payload, 0, 0, this.field_t.payload.length);
              this.field_c.addLast(var2, (byte) 93);
              var2 = (NetworkArchiveRequest) (this.field_i.next(26605));
            }
            var2Lifetime1 = (NetworkArchiveRequest) (this.field_p.first(-1));
            while (var2Lifetime1 != null) {
              this.field_t.position = 0;
              this.field_t.writeByte(0, 104);
              this.field_t.writeLong40(var2Lifetime1.field_j, 65280);
              this.field_B.write(this.field_t.payload, 0, 0, this.field_t.payload.length);
              this.field_h.addLast(var2Lifetime1, (byte) 99);
              var2Lifetime1 = (NetworkArchiveRequest) (this.field_p.next(26605));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_B.available(31479);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.field_k = 0;
                var4 = 0;
                if (null != this.field_d) {
                  if (this.field_d.field_C == 0) {
                    var4 = 1;
                  }
                } else {
                  var4 = 10;
                }
                if (0 < var4) {
                  var5 = -this.field_n.position + var4;
                  if (var5 > var3_int) {
                    var5 = var3_int;
                  }
                  this.field_B.readFully(var5, this.field_n.payload, -1, this.field_n.position);
                  if (this.field_g != 0) {
                    for (var6 = 0; var6 < var5; var6++) {
                      this.field_n.payload[this.field_n.position + var6] = (byte)GzipDecompressor.bitXor((int) this.field_n.payload[this.field_n.position + var6], (int) this.field_g);
                    }
                  }
                  this.field_n.position = this.field_n.position + var5;
                  if (var4 <= this.field_n.position) {
                    if (this.field_d != null) {
                      if (this.field_d.field_C != 0) {
                        throw new IOException();
                      }
                      if (this.field_n.payload[0] != -1) {
                        this.field_d = null;
                      } else {
                        this.field_d.field_C = 1;
                        this.field_n.position = 0;
                      }
                    } else {
                      this.field_n.position = 0;
                      var6 = this.field_n.readUnsignedByte(11132);
                      var7 = this.field_n.readInt((byte) 103);
                      var8 = this.field_n.readUnsignedByte(11132);
                      var9 = this.field_n.readInt((byte) 116);
                      var10 = 127 & var8;
                      stackIn_60_0 = ((128 & var8) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_60_0;
                      var12 = ((long)var6 << 32) + (long)var7;
                      var14 = null;
                      if (var11 != 0) {
                        var14_ref = (NetworkArchiveRequest) (this.field_h.first(-1));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.field_j) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (NetworkArchiveRequest) (this.field_h.next(26605));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (NetworkArchiveRequest) (this.field_c.first(-1));
                        while (var14_ref != null) {
                          if (var12 == var14_ref.field_j) {
                            break;
                          }
                          var14_ref = (NetworkArchiveRequest) (this.field_c.next(26605));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_75_0 = (var10 == 0) ? 5 : 9;
                      var15 = stackIn_75_0;
                      this.field_d = var14_ref;
                      this.field_d.field_B = new PacketBuffer(var15 + var9 + this.field_d.field_A);
                      this.field_d.field_B.writeByte(var10, 55);
                      this.field_d.field_B.writeInt(var9, (byte) -42);
                      this.field_n.position = 0;
                      this.field_d.field_C = 10;
                    }
                  }
                } else {
                  var5 = -this.field_d.field_A + this.field_d.field_B.payload.length;
                  var6 = 512 - this.field_d.field_C;
                  if (-this.field_d.field_B.position + var5 < var6) {
                    var6 = -this.field_d.field_B.position + var5;
                  }
                  if (var3_int < var6) {
                    var6 = var3_int;
                  }
                  this.field_B.readFully(var6, this.field_d.field_B.payload, -1, this.field_d.field_B.position);
                  if (this.field_g != 0) {
                    for (var7 = 0; var6 > var7; var7++) {
                      this.field_d.field_B.payload[this.field_d.field_B.position + var7] = (byte)GzipDecompressor.bitXor((int) this.field_d.field_B.payload[this.field_d.field_B.position + var7], (int) this.field_g);
                    }
                  }
                  this.field_d.field_C = this.field_d.field_C + var6;
                  this.field_d.field_B.position = this.field_d.field_B.position + var6;
                  if (var5 == this.field_d.field_B.position) {
                    this.field_d.unlinkSecondary(23);
                    this.field_d.field_t = false;
                    this.field_d = null;
                  } else {
                    if (512 == this.field_d.field_C) {
                      this.field_d.field_C = 0;
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
              this.field_B.close(4155);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_l = this.field_l + 1;
            this.field_B = null;
            this.field_b = -2;
            if (this.getInFlightRequestCount((byte) 116) != 0) {
              return false;
            }
            if (this.prefetchCount(108) == 0) {
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

    public SocketJs5Transport() {
    }

    private final void sendInitControlPacket(boolean param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (null == this.field_B) {
            return;
          }
          try {
            this.field_t.position = 0;
            this.field_t.writeByte(6, 122);
            this.field_t.writeMedium(3, param0);
            this.field_t.writeShort((byte) -76, 0);
            this.field_B.write(this.field_t.payload, 0, 0, this.field_t.payload.length);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_B.close(4155);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_l = this.field_l + 1;
            this.field_B = null;
            this.field_b = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_w = "Your email address is used to identify this account";
        textViewcontrolsRight = "Rotate camera right";
        field_A = "<%0> wants to join";
        field_y = "This is your RuneScape clan if you have one.";
        field_z = new TypeCode(4, 1, 1, 1);
    }
}
