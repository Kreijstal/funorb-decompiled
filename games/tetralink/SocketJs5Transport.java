/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SocketJs5Transport extends Js5Transport {
    private BufferedSocket field_s;
    static String field_r;
    static String[][] field_t;

    final void resetAfterValidationFailure(int param0) {
        try {
          this.field_s.close(-15488);
        } catch (Exception exception) {
        }
        this.field_h = this.field_h + 1;
        if (param0 != 0) {
          return;
        }
        this.field_d = -1;
        this.field_s = null;
        this.field_n = (byte)(int)(255.0 * Math.random() + 1.0);
    }

    final boolean poll(boolean param0) {
        try {
          int var2_int = 0;
          int stackIn_44_0 = 0;
          int stackIn_60_0 = 0;
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
          var16 = TetraLink.field_J;
          if (this.field_s != null) {
            var2_long = ClockAndTextHelpers.monotonicMillis(0);
            var4 = (int)(-this.field_f + var2_long);
            this.field_f = var2_long;
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_a = this.field_a + var4;
            if (this.field_a > 30000) {
              try {
                this.field_s.close(-15488);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_s = null;
            }
          }
          if (null == this.field_s) {
            if (0 != this.getInFlightRequestCount((byte) -61)) {
              return false;
            }
            if (this.prefetchCount(20) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_s.checkWriteError(100);
            var2 = (NetworkArchiveRequest) (this.field_k.first((byte) 90));
            while (var2 != null) {
              this.field_b.position = 0;
              this.field_b.writeByte(1, false);
              this.field_b.writeFiveByteLong(var2.secondaryKey, true);
              this.field_s.write(true, this.field_b.payload.length, this.field_b.payload, 0);
              this.field_j.addLast(var2, 0);
              var2 = (NetworkArchiveRequest) (this.field_k.next(false));
            }
            var2Lifetime1 = (NetworkArchiveRequest) (this.field_o.first((byte) -95));
            while (var2Lifetime1 != null) {
              this.field_b.position = 0;
              this.field_b.writeByte(0, false);
              this.field_b.writeFiveByteLong(var2Lifetime1.secondaryKey, true);
              this.field_s.write(true, this.field_b.payload.length, this.field_b.payload, 0);
              this.field_c.addLast(var2Lifetime1, 0);
              var2Lifetime1 = (NetworkArchiveRequest) (this.field_o.next(false));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_s.available(0);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.field_a = 0;
                var4 = 0;
                if (null != this.field_q) {
                  if (this.field_q.field_I == 0) {
                    var4 = 1;
                  }
                } else {
                  var4 = 10;
                }
                if (var4 <= 0) {
                  var5 = -this.field_q.field_H + this.field_q.field_K.payload.length;
                  var6 = 512 - this.field_q.field_I;
                  if (-this.field_q.field_K.position + var5 < var6) {
                    var6 = -this.field_q.field_K.position + var5;
                  }
                  if (var6 > var3_int) {
                    var6 = var3_int;
                  }
                  this.field_s.readFully(this.field_q.field_K.position, var6, this.field_q.field_K.payload, 0);
                  if (0 != this.field_n) {
                    for (var7 = 0; var7 < var6; var7++) {
                      this.field_q.field_K.payload[var7 + this.field_q.field_K.position] = (byte)IsaacCipher.bitXor((int) this.field_q.field_K.payload[var7 + this.field_q.field_K.position], (int) this.field_n);
                    }
                  }
                  this.field_q.field_K.position = this.field_q.field_K.position + var6;
                  this.field_q.field_I = this.field_q.field_I + var6;
                  if (var5 != this.field_q.field_K.position) {
                    if (this.field_q.field_I == 512) {
                      this.field_q.field_I = 0;
                    }
                  } else {
                    this.field_q.unlinkSecondary(0);
                    this.field_q.field_v = false;
                    this.field_q = null;
                  }
                } else {
                  var5 = -this.field_m.position + var4;
                  if (var5 > var3_int) {
                    var5 = var3_int;
                  }
                  this.field_s.readFully(this.field_m.position, var5, this.field_m.payload, 0);
                  if (this.field_n != 0) {
                    for (var6 = 0; var6 < var5; var6++) {
                      this.field_m.payload[this.field_m.position + var6] = (byte)IsaacCipher.bitXor((int) this.field_m.payload[this.field_m.position + var6], (int) this.field_n);
                    }
                  }
                  this.field_m.position = this.field_m.position + var5;
                  if (var4 <= this.field_m.position) {
                    if (this.field_q != null) {
                      if (this.field_q.field_I != 0) {
                        throw new IOException();
                      }
                      if (this.field_m.payload[0] != -1) {
                        this.field_q = null;
                      } else {
                        this.field_q.field_I = 1;
                        this.field_m.position = 0;
                      }
                    } else {
                      this.field_m.position = 0;
                      var6 = this.field_m.readUnsignedByte((byte) -99);
                      var7 = this.field_m.readInt(104);
                      var8 = this.field_m.readUnsignedByte((byte) -99);
                      var9 = this.field_m.readInt(-125);
                      var10 = 127 & var8;
                      stackIn_44_0 = (0 == (128 & var8)) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_44_0;
                      var12 = ((long)var6 << 32) + (long)var7;
                      var14 = null;
                      if (var11 != 0) {
                        var14_ref = (NetworkArchiveRequest) (this.field_c.first((byte) -109));
                        while (var14_ref != null) {
                          if (var12 == var14_ref.secondaryKey) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (NetworkArchiveRequest) (this.field_c.next(param0));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (NetworkArchiveRequest) (this.field_j.first((byte) -93));
                        while (var14_ref != null) {
                          if (~var14_ref.secondaryKey == ~var12) {
                            break;
                          }
                          var14_ref = (NetworkArchiveRequest) (this.field_j.next(false));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_60_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_60_0;
                      this.field_q = var14_ref;
                      this.field_q.field_K = new PacketBuffer(var15 + (var9 + this.field_q.field_H));
                      this.field_q.field_K.writeByte(var10, false);
                      this.field_q.field_K.writeInt(var9, (byte) -124);
                      this.field_m.position = 0;
                      this.field_q.field_I = 10;
                    }
                  }
                }
                continue;
              }
              break;
            }
            if (param0) {
              SocketJs5Transport.releaseStatics(81);
            }
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_s.close(-15488);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_h = this.field_h + 1;
            this.field_d = -2;
            this.field_s = null;
            if (this.getInFlightRequestCount((byte) -114) == 0 &&
              this.prefetchCount(20) == 0) {
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
        field_t = (String[][]) null;
        field_r = null;
        if (param0 != 0) {
          SocketJs5Transport.buildLobbyRoot(true);
        }
    }

    static long bitAnd(long param0, long param1) {
        return param0 & param1;
    }

    final void closeConnection(byte param0) {
        if (param0 != 80) {
          field_r = (String) null;
        }
        if (this.field_s != null) {
          this.field_s.close(-15488);
        }
    }

    final void setConnection(Object param0, boolean param1, byte param2) {
        try {
          RuntimeException stackIn_25_0 = null;
          StringBuilder stackIn_25_1 = null;
          String stackIn_26_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          NetworkArchiveRequest var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          NetworkArchiveRequest var4_refLifetime1;
          var6 = TetraLink.field_J;
          try {
            if (this.field_s != null) {
              try {
                this.field_s.close(-15488);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_s = null;
            }
            this.field_s = (BufferedSocket) (param0);
            this.sendInitControlPacket(false);
            this.sendStateControlPacket(false, param1);
            if (param2 > -73) {
              field_r = (String) null;
            }
            this.field_m.position = 0;
            this.field_q = null;
            while (true) {
              var4_ref = (NetworkArchiveRequest) (this.field_j.removeFirst(-15464));
              if (var4_ref != null) {
                this.field_k.addLast(var4_ref, 0);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (NetworkArchiveRequest) (this.field_c.removeFirst(-15464));
              if (var4_refLifetime1 != null) {
                this.field_o.addLast(var4_refLifetime1, 0);
                continue;
              }
              break;
            }
            if (this.field_n != 0) {
              try {
                this.field_b.position = 0;
                this.field_b.writeByte(4, false);
                this.field_b.writeByte((int) this.field_n, false);
                this.field_b.writeInt(0, (byte) -124);
                this.field_s.write(true, this.field_b.payload.length, this.field_b.payload, 0);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_s.close(-15488);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_d = -2;
                this.field_h = this.field_h + 1;
                this.field_s = null;
              }
            }
            this.field_a = 0;
            this.field_f = ClockAndTextHelpers.monotonicMillis(0);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = var4_ref3;
            stackIn_25_1 = new StringBuilder().append("pd.B(");
            if (param0 == null) {
              stackIn_26_2 = "null";
            } else {
              stackIn_26_2 = "{...}";
            }
            throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void buildLobbyRoot(boolean param0) {
        GameClock.field_f = new UiComponent(0L, (UiComponent) null);
        if (IntroFinalFrameHelpers.field_b) {
          GameClock.field_f.addChild((byte) -108, GameClock.field_e);
        }
        GameClock.field_f.addChild((byte) -112, TextMetricsGlobals.field_c);
        PasswordLoginCredentials.field_j = new SocialTabsPanel(ReflectionCheck.field_v, GameClock.field_f);
        if (param0) {
          SocketJs5Transport.releaseStatics(-120);
        }
        DateInputWidget.field_P = new UiComponent(0L, (UiComponent) null);
        DateInputWidget.field_P.addChild((byte) -92, PasswordLoginCredentials.field_j.field_g);
        DateInputWidget.field_P.addChild((byte) 68, PasswordLoginCredentials.field_i);
        QuickChatCommandType.layoutLobbyWidgets(5);
    }

    private final void sendInitControlPacket(boolean param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (null == this.field_s) {
            return;
          }
          try {
            this.field_b.position = 0;
            this.field_b.writeByte(6, param0);
            this.field_b.writeMedium(3, (byte) -66);
            this.field_b.writeShort(0, param0);
            this.field_s.write(true, this.field_b.payload.length, this.field_b.payload, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_s.close(-15488);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_d = -2;
            this.field_s = null;
            this.field_h = this.field_h + 1;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void sendStateControlPacket(boolean param0, boolean param1) {
        try {
          IOException iOException = null;
          PacketBuffer stackIn_7_0 = null;
          int stackIn_8_1 = 0;
          BufferedSocket stackIn_10_0 = null;
          boolean stackIn_11_1 = false;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.field_s == null) {
            return;
          }
          try {
            if (param0) {
              this.field_s = (BufferedSocket) null;
            }
            this.field_b.position = 0;
            stackIn_7_0 = this.field_b;
            if (!param1) {
              stackIn_8_1 = 3;
            } else {
              stackIn_8_1 = 2;
            }
            ((PacketBuffer) (Object) stackIn_7_0).writeByte(stackIn_8_1, param0);
            this.field_b.writeFiveByteLong(0L, true);
            stackIn_10_0 = this.field_s;
            stackIn_11_1 = !(param0);
            ((BufferedSocket) (Object) stackIn_10_0).write(stackIn_11_1, this.field_b.payload.length, this.field_b.payload, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_s.close(-15488);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_s = null;
            this.field_h = this.field_h + 1;
            this.field_d = -2;
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
    }
}
