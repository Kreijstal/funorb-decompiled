/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hf extends un {
    private vf field_s;
    static int field_r;

    private final void a(boolean param0, boolean param1) {
        try {
          IOException iOException = null;
          ResourceArchive var5 = null;
          PacketBuffer stackIn_4_0 = null;
          int stackIn_4_1 = 0;
          int stackIn_5_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.field_s == null) {
            return;
          }
          try {
            this.field_l.position = 0;
            stackIn_4_0 = this.field_l;
            stackIn_4_1 = -1336879960;
            if (param0) {
              stackIn_5_2 = 2;
            } else {
              stackIn_5_2 = 3;
            }
            ((PacketBuffer) (Object) stackIn_4_0).writeByte(stackIn_4_1, stackIn_5_2);
            this.field_l.a((byte) -64, 0L);
            this.field_s.a(this.field_l.payload.length, 0, -104, this.field_l.payload);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_s.a(1);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_e = -2;
            this.field_s = null;
            this.field_j = this.field_j + 1;
          }
          if (!param1) {
            var5 = (ResourceArchive) null;
            hf.a(120, (ResourceArchive) null, -58, -76);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, boolean param1, Object param2) {
        try {
          RuntimeException stackIn_27_0 = null;
          StringBuilder stackIn_27_1 = null;
          String stackIn_28_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          gp var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          gp var4_refLifetime1;
          var6 = AceOfSkies.obfuscationControl ? 1 : 0;
          try {
            if (null != this.field_s) {
              try {
                this.field_s.a(1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_s = null;
            }
            this.field_s = (vf) (param2);
            this.d((byte) -116);
            if (param0 != 3006) {
              this.d((byte) 116);
            }
            this.a(param1, true);
            this.field_a = null;
            this.field_h.position = 0;
            while (true) {
              var4_ref = (gp) (this.field_g.b(param0 ^ -17386));
              if (var4_ref != null) {
                this.field_b.a(2, var4_ref);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (gp) (this.field_n.b(-18520));
              if (var4_refLifetime1 != null) {
                this.field_d.a(2, var4_refLifetime1);
                continue;
              }
              break;
            }
            if (this.field_k != 0) {
              try {
                this.field_l.position = 0;
                this.field_l.writeByte(-1336879960, 4);
                this.field_l.writeByte(param0 - 1336882966, (int) this.field_k);
                this.field_l.writeInt((byte) 87, 0);
                this.field_s.a(this.field_l.payload.length, 0, 35, this.field_l.payload);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_s.a(1);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_j = this.field_j + 1;
                this.field_e = -2;
                this.field_s = null;
              }
            }
            this.field_p = 0;
            this.field_m = kh.a(-59);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_27_0 = var4_ref3;
            stackIn_27_1 = new StringBuilder().append("hf.H(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_28_2 = "null";
            } else {
              stackIn_28_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(int param0, int param1, int param2, byte[] param3) {
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var12 = new char[param1];
          var11 = var12;
          var4 = var11;
          var5 = 0;
          var6 = 0;
          var7 = -15 / ((-55 - param0) / 53);
          while (param1 > var6) {
            var8 = 255 & param3[var6 + param2];
            if (var8 != 0) {
              if (var8 >= 128 &&
                160 > var8) {
                var9 = te.field_e[-128 + var8];
                if (var9 == 0) {
                  var9 = 63;
                }
                var8 = var9;
              }
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$1] = (char)var8;
            }
            var6++;
          }
          stackIn_14_0 = new String(var12, 0, var5);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_17_0 = var4_ref;
          stackIn_17_1 = new StringBuilder().append("hf.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void c(byte param0) {
        try {
          this.field_s.a(1);
        } catch (Exception exception) {
        }
        this.field_e = -1;
        int var2 = 25 % ((39 - param0) / 57);
        this.field_j = this.field_j + 1;
        this.field_s = null;
        this.field_k = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    public hf() {
    }

    final boolean f(int param0) {
        try {
          int var2_int = 0;
          int stackIn_62_0 = 0;
          int stackIn_77_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          gp var2 = null;
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
          gp var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          gp var2Lifetime1;
          var16 = AceOfSkies.obfuscationControl ? 1 : 0;
          if (this.field_s != null) {
            var2_long = kh.a(-97);
            var4 = (int)(-this.field_m + var2_long);
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_m = var2_long;
            this.field_p = this.field_p + var4;
            if (30000 < this.field_p) {
              try {
                this.field_s.a(1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_s = null;
            }
          }
          if (this.field_s == null) {
            if (0 == this.b(param0 - 1048142560) &&
              this.c(-77) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_s.b((byte) 107);
            var2 = (gp) (this.field_b.b((byte) 123));
            while (var2 != null) {
              this.field_l.position = 0;
              this.field_l.writeByte(-1336879960, 1);
              this.field_l.a((byte) -106, var2.field_i);
              this.field_s.a(this.field_l.payload.length, 0, -103, this.field_l.payload);
              this.field_g.a(param0 + 2, var2);
              var2 = (gp) (this.field_b.e(31542));
            }
            var2Lifetime1 = (gp) (this.field_d.b((byte) 69));
            while (var2Lifetime1 != null) {
              this.field_l.position = 0;
              this.field_l.writeByte(-1336879960, 0);
              this.field_l.a((byte) -59, var2Lifetime1.field_i);
              this.field_s.a(this.field_l.payload.length, 0, 52, this.field_l.payload);
              this.field_n.a(param0 + 2, var2Lifetime1);
              var2Lifetime1 = (gp) (this.field_d.e(31542));
            }
            for (var2_int = param0; var2_int < 100; var2_int++) {
              var3_int = this.field_s.b(-125);
              if (0 > var3_int) {
                throw new IOException();
              }
              if (0 != var3_int) {
                this.field_p = 0;
                var4 = 0;
                if (this.field_a == null) {
                  var4 = 10;
                } else {
                  if (this.field_a.field_x == 0) {
                    var4 = 1;
                  }
                }
                if (var4 > 0) {
                  var5 = var4 - this.field_h.position;
                  if (var3_int < var5) {
                    var5 = var3_int;
                  }
                  this.field_s.a(this.field_h.position, var5, this.field_h.payload, true);
                  if (0 != this.field_k) {
                    for (var6 = 0; var6 < var5; var6++) {
                      this.field_h.payload[var6 + this.field_h.position] = (byte)id.a((int) this.field_h.payload[var6 + this.field_h.position], (int) this.field_k);
                    }
                  }
                  this.field_h.position = this.field_h.position + var5;
                  if (this.field_h.position >= var4) {
                    if (this.field_a != null) {
                      if (this.field_a.field_x != 0) {
                        throw new IOException();
                      }
                      if (this.field_h.payload[0] == -1) {
                        this.field_h.position = 0;
                        this.field_a.field_x = 1;
                      } else {
                        this.field_a = null;
                      }
                    } else {
                      this.field_h.position = 0;
                      var6 = this.field_h.readUnsignedByte(-72);
                      var7 = this.field_h.readInt((byte) 125);
                      var8 = this.field_h.readUnsignedByte(-104);
                      var9 = this.field_h.readInt((byte) 127);
                      var10 = var8 & 127;
                      stackIn_62_0 = ((128 & var8) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_62_0;
                      var12 = (long)var7 + ((long)var6 << 32);
                      var14 = null;
                      if (var11 != 0) {
                        var14_ref = (gp) (this.field_n.b((byte) 86));
                        while (var14_ref != null) {
                          if (var12 == var14_ref.field_i) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (gp) (this.field_n.e(param0 ^ 31542));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (gp) (this.field_g.b((byte) 81));
                        while (var14_ref != null) {
                          if (var12 == var14_ref.field_i) {
                            break;
                          }
                          var14_ref = (gp) (this.field_g.e(31542));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      this.field_a = var14_ref;
                      stackIn_77_0 = (var10 == 0) ? 5 : 9;
                      var15 = stackIn_77_0;
                      this.field_a.field_u = new PacketBuffer(this.field_a.field_z + var9 + var15);
                      this.field_a.field_u.writeByte(-1336879960, var10);
                      this.field_a.field_u.writeInt((byte) 79, var9);
                      this.field_a.field_x = 10;
                      this.field_h.position = 0;
                    }
                  }
                } else {
                  var5 = this.field_a.field_u.payload.length - this.field_a.field_z;
                  var6 = 512 - this.field_a.field_x;
                  if (var6 > var5 - this.field_a.field_u.position) {
                    var6 = -this.field_a.field_u.position + var5;
                  }
                  if (var6 > var3_int) {
                    var6 = var3_int;
                  }
                  this.field_s.a(this.field_a.field_u.position, var6, this.field_a.field_u.payload, true);
                  if (this.field_k != 0) {
                    for (var7 = 0; var7 < var6; var7++) {
                      this.field_a.field_u.payload[var7 + this.field_a.field_u.position] = (byte)id.a((int) this.field_a.field_u.payload[var7 + this.field_a.field_u.position], (int) this.field_k);
                    }
                  }
                  this.field_a.field_u.position = this.field_a.field_u.position + var6;
                  this.field_a.field_x = this.field_a.field_x + var6;
                  if (var5 == this.field_a.field_u.position) {
                    this.field_a.d(-125);
                    this.field_a.field_p = false;
                    this.field_a = null;
                  } else {
                    if (this.field_a.field_x == 512) {
                      this.field_a.field_x = 0;
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
              this.field_s.a(param0 + 1);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_e = -2;
            this.field_s = null;
            this.field_j = this.field_j + 1;
            if (this.b(-1048142560) == 0 &&
              this.c(-113) == 0) {
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
          if (this.field_s == null) {
            return;
          }
          try {
            this.field_l.position = 0;
            if (param0 > -19) {
              field_r = -17;
            }
            this.field_l.writeByte(-1336879960, 6);
            this.field_l.writeMedium(0, 3);
            this.field_l.writeShort(0, 23385);
            this.field_s.a(this.field_l.payload.length, 0, 60, this.field_l.payload);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_s.a(1);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_s = null;
            this.field_e = -2;
            this.field_j = this.field_j + 1;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        if (null != this.field_s) {
          this.field_s.a(1);
        }
        if (param0 > -101) {
          this.field_s = (vf) null;
        }
    }

    final static ll[] a(int param0, ResourceArchive param1, int param2, int param3) {
        RuntimeException var4 = null;
        ll[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 1) {
            field_r = 92;
          }
          if (!tn.a(param1, (byte) -127, param3, param2)) {
            return null;
          }
          stackIn_6_0 = HighscoreNameEntry.a(param0 ^ 1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("hf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
