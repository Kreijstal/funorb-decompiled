/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tb extends v {
    static v field_p;
    static String[] field_r;
    private BufferedSocket field_q;
    static long field_n;
    static String field_o;

    final void a(byte param0, Object param1, boolean param2) {
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
          var6 = Bounce.field_N;
          try {
            if (null != this.field_q) {
              try {
                this.field_q.close((byte) -70);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_q = null;
            }
            this.field_q = (BufferedSocket) (param1);
            this.d(31383);
            this.a(param2, (byte) 119);
            this.field_c.position = 0;
            this.field_b = null;
            while (true) {
              var4_ref = (NetworkArchiveRequest) (this.field_e.a(param0 + 113));
              if (var4_ref != null) {
                this.field_i.a((byte) -78, var4_ref);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (NetworkArchiveRequest) (this.field_m.a(-1));
              if (var4_refLifetime1 != null) {
                this.field_h.a((byte) -78, var4_refLifetime1);
                continue;
              }
              break;
            }
            if (this.field_j != 0) {
              try {
                this.field_a.position = 0;
                this.field_a.writeByte(4, (byte) 79);
                this.field_a.writeByte((int) this.field_j, (byte) 103);
                this.field_a.writeInt(0, (byte) 65);
                this.field_q.queueWrite(this.field_a.payload.length, this.field_a.payload, 0, 0);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_q.close((byte) -70);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_l = this.field_l + 1;
                this.field_d = -2;
                this.field_q = null;
              }
            }
            if (param0 != -114) {
              return;
            }
            this.field_g = 0;
            this.field_k = fa.correctedCurrentTimeMillis(98);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_29_0 = var4_ref3;
            stackIn_29_1 = new StringBuilder().append("tb.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_30_2 = "null";
            } else {
              stackIn_30_2 = "{...}";
            }
            throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_r = null;
        field_o = null;
        field_p = null;
        int var1 = 3 % ((9 - param0) / 57);
    }

    final void a(int param0) {
        if (param0 > -76) {
          this.c((byte) 0);
        }
        if (this.field_q != null) {
          this.field_q.close((byte) -70);
        }
    }

    private final void a(boolean param0, byte param1) {
        try {
          IOException iOException = null;
          PacketBuffer stackIn_5_0 = null;
          int stackIn_6_1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.field_q == null) {
            return;
          }
          try {
            this.field_a.position = 0;
            stackIn_5_0 = this.field_a;
            if (!param0) {
              stackIn_6_1 = 3;
            } else {
              stackIn_6_1 = 2;
            }
            ((PacketBuffer) (Object) stackIn_5_0).writeByte(stackIn_6_1, (byte) 68);
            this.field_a.writeLong40(0L, (byte) -29);
            if (param1 != 119) {
              return;
            }
            this.field_q.queueWrite(this.field_a.payload.length, this.field_a.payload, 0, param1 ^ 119);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.close((byte) -70);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_d = -2;
            this.field_q = null;
            this.field_l = this.field_l + 1;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean e(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != -11) {
          tb.clearStaticReferences((byte) 123);
        }
        stackIn_7_0 = (mh.field_U >= 10) && (!pg.field_c) && (!ej.b(-27));
        return stackIn_7_0;
    }

    final void c(byte param0) {
        try {
          this.field_q.close((byte) -70);
        } catch (Exception exception) {
        }
        this.field_q = null;
        this.field_l = this.field_l + 1;
        if (param0 < 108) {
          field_n = -77L;
        }
        this.field_d = -1;
        this.field_j = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final boolean a(byte param0) {
        try {
          int var2_int = 0;
          int stackIn_49_0 = 0;
          int stackIn_64_0 = 0;
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
          var16 = Bounce.field_N;
          if (null != this.field_q) {
            var2_long = fa.correctedCurrentTimeMillis(param0 ^ -54);
            var4 = (int)(-this.field_k + var2_long);
            this.field_k = var2_long;
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_g = this.field_g + var4;
            if (this.field_g > 30000) {
              try {
                this.field_q.close((byte) -70);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_q = null;
            }
          }
          if (null == this.field_q) {
            if (this.c(-8217) == 0 &&
              0 == this.a(true)) {
              return true;
            }
            return false;
          }
          try {
            this.field_q.checkWriteError(-20);
            if (param0 != 71) {
              field_o = (String) null;
            }
            var2 = (NetworkArchiveRequest) (this.field_i.d(-80));
            while (var2 != null) {
              this.field_a.position = 0;
              this.field_a.writeByte(1, (byte) 87);
              this.field_a.writeLong40(var2.field_j, (byte) -29);
              this.field_q.queueWrite(this.field_a.payload.length, this.field_a.payload, 0, param0 ^ 71);
              this.field_e.a((byte) -78, var2);
              var2 = (NetworkArchiveRequest) (this.field_i.b(0));
            }
            var2Lifetime1 = (NetworkArchiveRequest) (this.field_h.d(-122));
            while (var2Lifetime1 != null) {
              this.field_a.position = 0;
              this.field_a.writeByte(0, (byte) 78);
              this.field_a.writeLong40(var2Lifetime1.field_j, (byte) -29);
              this.field_q.queueWrite(this.field_a.payload.length, this.field_a.payload, 0, 0);
              this.field_m.a((byte) -78, var2Lifetime1);
              var2Lifetime1 = (NetworkArchiveRequest) (this.field_h.b(param0 ^ 71));
            }
            for (var2_int = 0; 100 > var2_int; var2_int++) {
              var3_int = this.field_q.availableBytes(0);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int == 0) {
                return true;
              }
              this.field_g = 0;
              var4 = 0;
              if (null == this.field_b) {
                var4 = 10;
              } else {
                if (this.field_b.field_t == 0) {
                  var4 = 1;
                }
              }
              if (var4 <= 0) {
                var5 = -this.field_b.field_s + this.field_b.field_p.payload.length;
                var6 = -this.field_b.field_t + 512;
                if (var5 - this.field_b.field_p.position < var6) {
                  var6 = -this.field_b.field_p.position + var5;
                }
                if (var6 > var3_int) {
                  var6 = var3_int;
                }
                this.field_q.readFully(this.field_b.field_p.payload, true, var6, this.field_b.field_p.position);
                if (0 != this.field_j) {
                  for (var7 = 0; var7 < var6; var7++) {
                    this.field_b.field_p.payload[var7 + this.field_b.field_p.position] = (byte)Slime.a((int) this.field_b.field_p.payload[var7 + this.field_b.field_p.position], (int) this.field_j);
                  }
                }
                this.field_b.field_p.position = this.field_b.field_p.position + var6;
                this.field_b.field_t = this.field_b.field_t + var6;
                if (var5 != this.field_b.field_p.position) {
                  if (this.field_b.field_t == 512) {
                    this.field_b.field_t = 0;
                  }
                } else {
                  this.field_b.unlinkSecondary(param0 ^ 7);
                  this.field_b.field_n = false;
                  this.field_b = null;
                }
              } else {
                var5 = -this.field_c.position + var4;
                if (var3_int < var5) {
                  var5 = var3_int;
                }
                this.field_q.readFully(this.field_c.payload, true, var5, this.field_c.position);
                if (this.field_j != 0) {
                  for (var6 = 0; var5 > var6; var6++) {
                    this.field_c.payload[this.field_c.position + var6] = (byte)Slime.a((int) this.field_c.payload[this.field_c.position + var6], (int) this.field_j);
                  }
                }
                this.field_c.position = this.field_c.position + var5;
                if (var4 <= this.field_c.position) {
                  if (this.field_b != null) {
                    if (this.field_b.field_t != 0) {
                      throw new IOException();
                    }
                    if (this.field_c.payload[0] == -1) {
                      this.field_b.field_t = 1;
                      this.field_c.position = 0;
                    } else {
                      this.field_b = null;
                    }
                  } else {
                    this.field_c.position = 0;
                    var6 = this.field_c.readUnsignedByte((byte) -78);
                    var7 = this.field_c.readInt(-3);
                    var8 = this.field_c.readUnsignedByte((byte) -106);
                    var9 = this.field_c.readInt(param0 - 74);
                    var10 = 127 & var8;
                    stackIn_49_0 = ((var8 & 128) == 0) ? 0 : 1;
                    boolean decompiledFrameRemainder0 = true;
                    boolean decompiledFrameCompleted0 = true;
                    var11 = stackIn_49_0;
                    var12 = (long)var7 + ((long)var6 << 32);
                    var14 = null;
                    if (var11 == 0) {
                      var14_ref = (NetworkArchiveRequest) (this.field_e.d(param0 ^ -47));
                      while (var14_ref != null) {
                        if (var12 == var14_ref.field_j) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        var14_ref = (NetworkArchiveRequest) (this.field_e.b(0));
                      }
                      decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                    }
                    if ((decompiledFrameRemainder0) &&
                      (decompiledFrameCompleted0)) {
                      var14_ref = (NetworkArchiveRequest) (this.field_m.d(-92));
                      while (var14_ref != null) {
                        if (~var12 == ~var14_ref.field_j) {
                          break;
                        }
                        var14_ref = (NetworkArchiveRequest) (this.field_m.b(param0 ^ 71));
                      }
                    }
                    if (var14_ref == null) {
                      throw new IOException();
                    }
                    stackIn_64_0 = (var10 == 0) ? 5 : 9;
                    var15 = stackIn_64_0;
                    this.field_b = var14_ref;
                    this.field_b.field_p = new PacketBuffer(var15 + (var9 + this.field_b.field_s));
                    this.field_b.field_p.writeByte(var10, (byte) 126);
                    this.field_b.field_p.writeInt(var9, (byte) 76);
                    this.field_c.position = 0;
                    this.field_b.field_t = 10;
                  }
                }
              }
            }
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.close((byte) -70);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_d = -2;
            this.field_q = null;
            this.field_l = this.field_l + 1;
            if (0 == this.c(param0 ^ -8288) &&
              this.a(true) == 0) {
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

    private final void d(int param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (this.field_q == null) {
            return;
          }
          try {
            this.field_a.position = 0;
            this.field_a.writeByte(6, (byte) 97);
            this.field_a.writeMedium(3, param0 ^ 490710151);
            this.field_a.writeShort(-750655096, 0);
            this.field_q.queueWrite(this.field_a.payload.length, this.field_a.payload, 0, param0 ^ param0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.close((byte) -70);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_q = null;
            this.field_l = this.field_l + 1;
            this.field_d = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public tb() {
    }

    static {
        field_o = "Members";
        field_r = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
