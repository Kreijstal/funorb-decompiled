/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cl extends vm {
    static boolean[] field_p;
    private BufferedSocket field_q;
    static String field_o;

    final boolean c(byte param0) {
        try {
          int var2_int = 0;
          int stackIn_63_0 = 0;
          int stackIn_79_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          qfa var2 = null;
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
          qfa var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          qfa var2Lifetime1;
          var16 = BachelorFridge.field_y;
          if (null != this.field_q) {
            var2_long = f.b((byte) 73);
            var4 = (int)(-this.field_b + var2_long);
            this.field_b = var2_long;
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_j = this.field_j + var4;
            if (30000 < this.field_j) {
              try {
                this.field_q.a((byte) 109);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_q = null;
            }
          }
          if (null == this.field_q) {
            if (this.d((byte) 0) != 0) {
              return false;
            }
            if (this.a(-117) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_q.c((byte) 34);
            var2 = (qfa) (this.field_f.a(-102));
            while (var2 != null) {
              this.field_n.position = 0;
              this.field_n.writeByte(1, 0);
              this.field_n.a(4096, var2.secondaryKey);
              this.field_q.a(0, this.field_n.payload, false, this.field_n.payload.length);
              this.field_a.a(var2, (byte) -64);
              var2 = (qfa) (this.field_f.a((byte) 108));
            }
            if (param0 != 69) {
              field_p = (boolean[]) null;
            }
            var2Lifetime1 = (qfa) (this.field_c.a(-78));
            while (var2Lifetime1 != null) {
              this.field_n.position = 0;
              this.field_n.writeByte(0, 0);
              this.field_n.a(param0 + 4027, var2Lifetime1.secondaryKey);
              this.field_q.a(0, this.field_n.payload, false, this.field_n.payload.length);
              this.field_l.a(var2Lifetime1, (byte) 90);
              var2Lifetime1 = (qfa) (this.field_c.a((byte) 94));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_q.b(-90);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (0 != var3_int) {
                this.field_j = 0;
                var4 = 0;
                if (this.field_h == null) {
                  var4 = 10;
                } else {
                  if (this.field_h.field_u == 0) {
                    var4 = 1;
                  }
                }
                if (0 < var4) {
                  var5 = var4 - this.field_d.position;
                  if (var5 > var3_int) {
                    var5 = var3_int;
                  }
                  this.field_q.a(this.field_d.position, (byte) 108, this.field_d.payload, var5);
                  if (0 != this.field_m) {
                    for (var6 = 0; var6 < var5; var6++) {
                      this.field_d.payload[var6 + this.field_d.position] = (byte)lt.a((int) this.field_d.payload[var6 + this.field_d.position], (int) this.field_m);
                    }
                  }
                  this.field_d.position = this.field_d.position + var5;
                  if (var4 <= this.field_d.position) {
                    if (this.field_h == null) {
                      this.field_d.position = 0;
                      var6 = this.field_d.readUnsignedByte(16711935);
                      var7 = this.field_d.readInt(106);
                      var8 = this.field_d.readUnsignedByte(16711935);
                      var9 = this.field_d.readInt(-127);
                      var10 = var8 & 127;
                      stackIn_63_0 = ((var8 & 128) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_63_0;
                      var12 = ((long)var6 << 32) + (long)var7;
                      var14 = null;
                      if (var11 != 0) {
                        var14_ref = (qfa) (this.field_l.a(-101));
                        while (var14_ref != null) {
                          if (~var14_ref.secondaryKey == ~var12) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (qfa) (this.field_l.a((byte) 103));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (qfa) (this.field_a.a(param0 - 163));
                        while (var14_ref != null) {
                          if (var14_ref.secondaryKey == var12) {
                            break;
                          }
                          var14_ref = (qfa) (this.field_a.a((byte) 120));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      this.field_h = var14_ref;
                      stackIn_79_0 = (var10 == 0) ? 5 : 9;
                      var15 = stackIn_79_0;
                      this.field_h.field_v = new PacketBuffer(var15 + var9 + this.field_h.field_s);
                      this.field_h.field_v.writeByte(var10, 0);
                      this.field_h.field_v.writeInt(var9, -1615464796);
                      this.field_h.field_u = 10;
                      this.field_d.position = 0;
                    } else {
                      if (this.field_h.field_u != 0) {
                        throw new IOException();
                      }
                      if (this.field_d.payload[0] != -1) {
                        this.field_h = null;
                      } else {
                        this.field_h.field_u = 1;
                        this.field_d.position = 0;
                      }
                    }
                  }
                } else {
                  var5 = this.field_h.field_v.payload.length - this.field_h.field_s;
                  var6 = 512 - this.field_h.field_u;
                  if (-this.field_h.field_v.position + var5 < var6) {
                    var6 = var5 - this.field_h.field_v.position;
                  }
                  if (var3_int < var6) {
                    var6 = var3_int;
                  }
                  this.field_q.a(this.field_h.field_v.position, (byte) 106, this.field_h.field_v.payload, var6);
                  if (this.field_m != 0) {
                    for (var7 = 0; var6 > var7; var7++) {
                      this.field_h.field_v.payload[var7 + this.field_h.field_v.position] = (byte)lt.a((int) this.field_h.field_v.payload[var7 + this.field_h.field_v.position], (int) this.field_m);
                    }
                  }
                  this.field_h.field_v.position = this.field_h.field_v.position + var6;
                  this.field_h.field_u = this.field_h.field_u + var6;
                  if (var5 == this.field_h.field_v.position) {
                    this.field_h.unlinkSecondary(0);
                    this.field_h.field_n = false;
                    this.field_h = null;
                  } else {
                    if (this.field_h.field_u == 512) {
                      this.field_h.field_u = 0;
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
              this.field_q.a((byte) 56);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_e = this.field_e + 1;
            this.field_k = -2;
            this.field_q = null;
            if (this.d((byte) 0) == 0 &&
              this.a(-116) == 0) {
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

    final void c(int param0) {
        if (null != this.field_q) {
          this.field_q.a((byte) 122);
        }
        if (param0 != 20) {
          cl.a(80, (byte) 57, -71);
        }
    }

    final void a(boolean param0, Object param1, int param2) {
        try {
          RuntimeException stackIn_29_0 = null;
          StringBuilder stackIn_29_1 = null;
          String stackIn_30_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          qfa var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          qfa var4_refLifetime1;
          var6 = BachelorFridge.field_y;
          try {
            if (this.field_q != null) {
              try {
                this.field_q.a((byte) 110);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_q = null;
            }
            this.field_q = (BufferedSocket) (param1);
            this.d(param2 ^ 16074);
            this.a(125, param0);
            this.field_h = null;
            if (param2 != 16008) {
              this.c(-28);
            }
            this.field_d.position = 0;
            while (true) {
              var4_ref = (qfa) (this.field_a.a(true));
              if (var4_ref != null) {
                this.field_f.a(var4_ref, (byte) -126);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (qfa) (this.field_l.a(true));
              if (var4_refLifetime1 != null) {
                this.field_c.a(var4_refLifetime1, (byte) -58);
                continue;
              }
              break;
            }
            if (this.field_m != 0) {
              try {
                this.field_n.position = 0;
                this.field_n.writeByte(4, 0);
                this.field_n.writeByte((int) this.field_m, 0);
                this.field_n.writeInt(0, param2 ^ -1615476692);
                this.field_q.a(0, this.field_n.payload, false, this.field_n.payload.length);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_q.a((byte) 52);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_e = this.field_e + 1;
                this.field_q = null;
                this.field_k = -2;
              }
            }
            this.field_j = 0;
            this.field_b = f.b((byte) 73);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_29_0 = var4_ref3;
            stackIn_29_1 = new StringBuilder().append("cl.I(").append(param0).append(',');
            if (param1 == null) {
              stackIn_30_2 = "null";
            } else {
              stackIn_30_2 = "{...}";
            }
            throw pe.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
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
            this.field_n.position = 0;
            this.field_n.writeByte(6, 0);
            this.field_n.writeMedium(-1607631824, 3);
            this.field_n.b(0, -124);
            this.field_q.a(0, this.field_n.payload, false, this.field_n.payload.length);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.a((byte) 83);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_k = -2;
            this.field_e = this.field_e + 1;
            this.field_q = null;
          }
          if (param0 < 23) {
            this.field_q = (BufferedSocket) null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        int var2 = -102 / ((param0 + 18) / 48);
        try {
          this.field_q.a((byte) 76);
        } catch (Exception exception) {
        }
        this.field_e = this.field_e + 1;
        this.field_k = -1;
        this.field_q = null;
        this.field_m = (byte)(int)(255.0 * Math.random() + 1.0);
    }

    public cl() {
    }

    final static int a(int param0, byte param1, int param2) {
        String var3 = TextInputWidget.field_E[param2][param0];
        var3 = var3.trim();
        var3 = var3.toLowerCase();
        if (param1 < 86) {
          return -113;
        }
        if (var3.equals("random")) {
          return -1;
        }
        return ((ji) (du.field_a.a(true, (long)var3.hashCode()))).field_h;
    }

    public static void releaseStatics(boolean param0) {
        field_p = null;
        if (param0) {
          field_p = (boolean[]) null;
        }
        field_o = null;
    }

    private final void a(int param0, boolean param1) {
        try {
          IOException iOException = null;
          int var3 = 0;
          PacketBuffer stackIn_5_0 = null;
          int stackIn_6_1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (null == this.field_q) {
            return;
          }
          try {
            this.field_n.position = 0;
            stackIn_5_0 = this.field_n;
            if (param1) {
              stackIn_6_1 = 2;
            } else {
              stackIn_6_1 = 3;
            }
            ((PacketBuffer) (Object) stackIn_5_0).writeByte(stackIn_6_1, 0);
            this.field_n.a(4096, 0L);
            this.field_q.a(0, this.field_n.payload, false, this.field_n.payload.length);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.a((byte) 123);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_q = null;
            this.field_k = -2;
            this.field_e = this.field_e + 1;
          }
          var3 = 81 % ((61 - param0) / 49);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static Sprite[] a(Sprite[] param0, boolean param1) {
        int var3 = 0;
        Sprite[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        Sprite[] var5 = null;
        Sprite[] stackIn_3_0 = null;
        Sprite[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          if (param1) {
            stackIn_3_0 = (Sprite[]) null;
            return stackIn_3_0;
          }
          var5 = new Sprite[param0.length];
          var2 = var5;
          for (var3 = 0; var3 < param0.length; var3++) {
            var5[var3] = new Sprite(param0[var3].field_n >> 1, param0[var3].field_o >> 1);
            var5[var3].b();
            param0[var3].drawHalfSize(0, 0);
          }
          hga.field_U.a((byte) 6);
          stackIn_8_0 = var2;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("cl.M(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = new boolean[64];
        field_o = "This game has been updated! Please reload this page.";
    }
}
