/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SocketJs5Transport extends Js5Transport {
    static RotatedSpriteAsset field_r;
    static String field_p;
    private BufferedSocket field_q;

    public static void clearSharedReferences(boolean param0) {
        field_p = null;
        if (!param0) {
          return;
        }
        field_r = null;
    }

    private final void sendInitialization(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          Exception var3 = null;
          if (null == this.field_q) {
            return;
          }
          try {
            this.field_b.position = 0;
            this.field_b.writeByte(111, 6);
            this.field_b.writeMedium(3, false);
            this.field_b.writeShort(-652561784, 0);
            this.field_q.write(this.field_b.payload.length, this.field_b.payload, 0, 1);
            if (param0 <= 5) {
              field_p = (String) null;
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.close(21135);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_f = -2;
            this.field_c = this.field_c + 1;
            this.field_q = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void sendLoginState(boolean param0, int param1) {
        try {
          IOException iOException = null;
          PacketBuffer stackIn_4_0 = null;
          int stackIn_4_1 = 0;
          int stackIn_5_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (null == this.field_q) {
            return;
          }
          try {
            this.field_b.position = 0;
            stackIn_4_0 = this.field_b;
            stackIn_4_1 = 111;
            if (!param0) {
              stackIn_5_2 = 3;
            } else {
              stackIn_5_2 = 2;
            }
            ((PacketBuffer) (Object) stackIn_4_0).writeByte(stackIn_4_1, stackIn_5_2);
            if (param1 != -11526) {
              SocketJs5Transport.isNameSeparator(77, 'J');
            }
            this.field_b.writeLong40(-483502376, 0L);
            this.field_q.write(this.field_b.payload.length, this.field_b.payload, 0, 1);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.close(21135);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_f = -2;
            this.field_q = null;
            this.field_c = this.field_c + 1;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void attachConnection(Object param0, boolean param1, int param2) {
        try {
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          NetworkArchiveRequest var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          NetworkArchiveRequest var4_refLifetime1;
          var6 = HoldTheLine.field_D;
          try {
            if (this.field_q != null) {
              try {
                this.field_q.close(param2 ^ 21147);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_q = null;
            }
            this.field_q = (BufferedSocket) (param0);
            this.sendInitialization(param2 + 83);
            this.sendLoginState(param1, -11526);
            this.field_k.position = 0;
            this.field_m = null;
            while (true) {
              var4_ref = (NetworkArchiveRequest) (this.field_i.removeFirst((byte) 85));
              if (var4_ref != null) {
                this.field_d.addLast(-85, var4_ref);
                continue;
              }
              break;
            }
            if (param2 != 20) {
              field_r = (RotatedSpriteAsset) null;
            }
            while (true) {
              var4_refLifetime1 = (NetworkArchiveRequest) (this.field_e.removeFirst((byte) 84));
              if (var4_refLifetime1 != null) {
                this.field_g.addLast(-35, var4_refLifetime1);
                continue;
              }
              break;
            }
            if (this.field_l != 0) {
              try {
                this.field_b.position = 0;
                this.field_b.writeByte(111, 4);
                this.field_b.writeByte(111, (int) this.field_l);
                this.field_b.writeInt((byte) -58, 0);
                this.field_q.write(this.field_b.payload.length, this.field_b.payload, 0, 1);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_q.close(param2 + 21115);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_c = this.field_c + 1;
                this.field_q = null;
                this.field_f = -2;
              }
            }
            this.field_h = 0;
            this.field_j = bb.b(-1);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var4_ref3;
            stackIn_26_1 = new StringBuilder().append("ag.H(");
            if (param0 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw EntitySound.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(String param0, boolean param1, String param2) {
        try {
          if (sb.field_c != null) {
            sb.field_c.h((byte) -98);
          }
          lh.field_a = new LoginForm(param2, param0, param1, true, true);
          sm.field_c.a((UiWidget) (lh.field_a), (byte) -99);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ag.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean processRequests(byte param0) {
        try {
          int stackIn_46_0 = 0;
          int stackIn_60_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          int var2_int = 0;
          IOException var2 = null;
          NetworkArchiveRequest var3 = null;
          int var3_int = 0;
          Exception var3_ref = null;
          int var4 = 0;
          Exception var5_ref_Exception = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          long var13 = 0L;
          Object var15 = null;
          NetworkArchiveRequest var15_ref = null;
          int var16 = 0;
          int var17 = 0;
          int var18 = 0;
          NetworkArchiveRequest var3Lifetime1;
          var17 = HoldTheLine.field_D;
          if (this.field_q != null) {
            var2_long = bb.b(-1);
            var4 = (int)(-this.field_j + var2_long);
            this.field_j = var2_long;
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_h = this.field_h + var4;
            if (this.field_h > 30000) {
              try {
                this.field_q.close(21135);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_q = null;
            }
          }
          if (null == this.field_q) {
            if (this.b(20) != 0) {
              return false;
            }
            if (this.b(false) == 0) {
              return true;
            }
            return false;
          }
          try {
            var2_int = 51 % ((param0 - 24) / 56);
            this.field_q.checkWriteError(true);
            var3 = (NetworkArchiveRequest) (this.field_d.first(105));
            while (var3 != null) {
              this.field_b.position = 0;
              this.field_b.writeByte(111, 1);
              this.field_b.writeLong40(-483502376, var3.secondaryKey);
              this.field_q.write(this.field_b.payload.length, this.field_b.payload, 0, 1);
              this.field_i.addLast(123, var3);
              var3 = (NetworkArchiveRequest) (this.field_d.next(-100));
            }
            var3Lifetime1 = (NetworkArchiveRequest) (this.field_g.first(79));
            while (var3Lifetime1 != null) {
              this.field_b.position = 0;
              this.field_b.writeByte(111, 0);
              this.field_b.writeLong40(-483502376, var3Lifetime1.secondaryKey);
              this.field_q.write(this.field_b.payload.length, this.field_b.payload, 0, 1);
              this.field_e.addLast(126, var3Lifetime1);
              var3Lifetime1 = (NetworkArchiveRequest) (this.field_g.next(-54));
            }
            var3_int = 0;
            while (true) {
              if (var3_int >= 100) {
                return true;
              }
              var4 = this.field_q.available(false);
              if (var4 < 0) {
                throw new IOException();
              }
              if (var4 == 0) {
                return true;
              }
              this.field_h = 0;
              var5 = 0;
              if (null != this.field_m) {
                if (this.field_m.field_x == 0) {
                  var5 = 1;
                }
              } else {
                var5 = 10;
              }
              if (var5 <= 0) {
                var6 = -this.field_m.field_B + this.field_m.field_z.payload.length;
                var7 = -this.field_m.field_x + 512;
                if (-this.field_m.field_z.position + var6 < var7) {
                  var7 = var6 - this.field_m.field_z.position;
                }
                if (var4 < var7) {
                  var7 = var4;
                }
                this.field_q.readFully(this.field_m.field_z.payload, var7, this.field_m.field_z.position, -54);
                if (0 != this.field_l) {
                  var18 = 0;
                  var8 = var18;
                  while (var7 > var18) {
                    this.field_m.field_z.payload[this.field_m.field_z.position + var18] = (byte)Vector2i.xor((int) this.field_m.field_z.payload[this.field_m.field_z.position + var18], (int) this.field_l);
                    var18++;
                  }
                }
                this.field_m.field_z.position = this.field_m.field_z.position + var7;
                this.field_m.field_x = this.field_m.field_x + var7;
                if (var6 != this.field_m.field_z.position) {
                  if (this.field_m.field_x == 512) {
                    this.field_m.field_x = 0;
                  }
                } else {
                  this.field_m.unlinkSecondary((byte) -42);
                  this.field_m.field_u = false;
                  this.field_m = null;
                }
              } else {
                var6 = -this.field_k.position + var5;
                if (var6 > var4) {
                  var6 = var4;
                }
                this.field_q.readFully(this.field_k.payload, var6, this.field_k.position, 14);
                if (0 != this.field_l) {
                  for (var7 = 0; var6 > var7; var7++) {
                    this.field_k.payload[var7 + this.field_k.position] = (byte)Vector2i.xor((int) this.field_k.payload[var7 + this.field_k.position], (int) this.field_l);
                  }
                }
                this.field_k.position = this.field_k.position + var6;
                if (var5 <= this.field_k.position) {
                  if (null == this.field_m) {
                    this.field_k.position = 0;
                    var7 = this.field_k.readUnsignedByte((byte) -105);
                    var8 = this.field_k.readInt(94);
                    var9 = this.field_k.readUnsignedByte((byte) -55);
                    var10 = this.field_k.readInt(127);
                    var11 = 127 & var9;
                    stackIn_46_0 = ((128 & var9) == 0) ? 0 : 1;
                    boolean decompiledFrameRemainder0 = true;
                    boolean decompiledFrameCompleted0 = true;
                    var12 = stackIn_46_0;
                    var13 = ((long)var7 << 32) + (long)var8;
                    var15 = null;
                    if (var12 == 0) {
                      var15_ref = (NetworkArchiveRequest) (this.field_i.first(96));
                      while (var15_ref != null) {
                        if (var13 == var15_ref.secondaryKey) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        var15_ref = (NetworkArchiveRequest) (this.field_i.next(57));
                      }
                      decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                    }
                    if ((decompiledFrameRemainder0) &&
                      (decompiledFrameCompleted0)) {
                      var15_ref = (NetworkArchiveRequest) (this.field_e.first(71));
                      while (var15_ref != null) {
                        if (var13 == var15_ref.secondaryKey) {
                          break;
                        }
                        var15_ref = (NetworkArchiveRequest) (this.field_e.next(95));
                      }
                    }
                    if (var15_ref == null) {
                      throw new IOException();
                    }
                    stackIn_60_0 = (0 != var11) ? 9 : 5;
                    var16 = stackIn_60_0;
                    this.field_m = var15_ref;
                    this.field_m.field_z = new PacketBuffer(this.field_m.field_B + var10 + var16);
                    this.field_m.field_z.writeByte(111, var11);
                    this.field_m.field_z.writeInt((byte) -58, var10);
                    this.field_k.position = 0;
                    this.field_m.field_x = 10;
                  } else {
                    if (this.field_m.field_x != 0) {
                      throw new IOException();
                    }
                    if (this.field_k.payload[0] == -1) {
                      this.field_m.field_x = 1;
                      this.field_k.position = 0;
                    } else {
                      this.field_m = null;
                    }
                  }
                }
              }
              var3_int++;
            }
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2 = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.close(21135);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3_ref = (Exception) (Object) decompiledCaughtException;
            }
            this.field_f = -2;
            this.field_q = null;
            this.field_c = this.field_c + 1;
            if (this.b(126) != 0) {
              return false;
            }
            if (this.b(false) != 0) {
              return false;
            }
            return true;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean isNameSeparator(int param0, char param1) {
        boolean stackIn_8_0 = false;
        if (param0 != -2821) {
          return false;
        }
        stackIn_8_0 = (160 == param1) || (param1 == 32) || (95 == param1) || (45 == param1);
        return stackIn_8_0;
    }

    final void close(int param0) {
        if (param0 != 1) {
          this.field_q = (BufferedSocket) null;
        }
        if (null != this.field_q) {
          this.field_q.close(21135);
        }
    }

    public SocketJs5Transport() {
    }

    final void handleCorruptResponse(boolean param0) {
        try {
          this.field_q.close(21135);
        } catch (Exception exception) {
        }
        this.field_c = this.field_c + 1;
        this.field_f = -1;
        this.field_q = null;
        if (param0) {
          this.processRequests((byte) -72);
        }
        this.field_l = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    static {
        field_p = "<%0> kills remaining.";
    }
}
