/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class f extends vk {
    static String field_x;
    static int[] field_w;
    static SceneWidget field_y;
    private sg field_F;
    static String field_u;
    static int[] field_B;
    static rf field_D;
    static String field_E;
    static java.util.zip.CRC32 field_G;
    static ArticulatedPart field_A;
    static int field_v;
    static String field_z;

    final void b(int param0) {
        if (param0 < 61) {
          Object var3 = (Object) null;
          this.a((Object) null, true, 56);
        }
        if (this.field_F != null) {
          this.field_F.b(12110);
        }
    }

    private final void a(boolean param0, boolean param1) {
        try {
          PacketBuffer stackIn_5_0 = null;
          int stackIn_5_1 = 0;
          int stackIn_6_2 = 0;
          Throwable decompiledCaughtException = null;
          IOException var3 = null;
          Exception var4 = null;
          if (this.field_F == null) {
            return;
          }
          try {
            this.field_o.position = 0;
            stackIn_5_0 = this.field_o;
            stackIn_5_1 = 111;
            if (param1) {
              stackIn_6_2 = 2;
            } else {
              stackIn_6_2 = 3;
            }
            ((PacketBuffer) (Object) stackIn_5_0).writeByte((byte) stackIn_5_1, stackIn_6_2);
            this.field_o.a(0L, (byte) 120);
            this.field_F.a(this.field_o.payload.length, this.field_o.payload, -100, 0);
            if (!param0) {
              this.b(3);
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_F.b(12110);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_t = -2;
            this.field_f = this.field_f + 1;
            this.field_F = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(int param0) {
        field_B = null;
        field_y = null;
        field_x = null;
        field_w = null;
        field_E = null;
        field_u = null;
        field_G = null;
        field_D = null;
        field_A = null;
        field_z = null;
        if (param0 != -2) {
          field_z = (String) null;
        }
    }

    final void a(Object param0, boolean param1, int param2) {
        try {
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          int var4_int = 0;
          RuntimeException var4_ref = null;
          qa var5 = null;
          IOException var5_ref = null;
          Exception var6 = null;
          int var7 = 0;
          qa var5Lifetime1;
          var7 = SteelSentinels.obfuscationControl;
          try {
            if (null != this.field_F) {
              try {
                this.field_F.b(12110);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_F = null;
            }
            this.field_F = (sg) (param0);
            var4_int = 98 % ((param2 + 72) / 32);
            this.f(123);
            this.a(true, param1);
            this.field_c.position = 0;
            this.field_d = null;
            while (true) {
              var5 = (qa) (this.field_a.removeFirst(25));
              if (var5 != null) {
                this.field_m.addLast((byte) 58, var5);
                continue;
              }
              break;
            }
            while (true) {
              var5Lifetime1 = (qa) (this.field_p.removeFirst(54));
              if (var5Lifetime1 != null) {
                this.field_j.addLast((byte) 45, var5Lifetime1);
                continue;
              }
              break;
            }
            if (this.field_n != 0) {
              try {
                this.field_o.position = 0;
                this.field_o.writeByte((byte) 116, 4);
                this.field_o.writeByte((byte) 114, (int) this.field_n);
                this.field_o.writeInt(true, 0);
                this.field_F.a(this.field_o.payload.length, this.field_o.payload, -100, 0);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var5_ref = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_F.b(12110);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_F = null;
                this.field_f = this.field_f + 1;
                this.field_t = -2;
              }
            }
            this.field_i = 0;
            this.field_e = mm.a(-108);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var4_ref;
            stackIn_26_1 = new StringBuilder().append("f.G(");
            if (param0 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(boolean param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            field_E = (String) null;
          }
          stackIn_3_0 = bg.a((byte) 80, true, param1, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("f.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean a(CharSequence param0, int param1, boolean param2) {
        int var6 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SteelSentinels.obfuscationControl;
        try {
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (1 > var3_int) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          var4 = ui.a(1, param0);
          if (var4 != null &&
            var4.length() >= 1) {
            if (!jd.a(var4.charAt(0), -33) &&
              !jd.a(var4.charAt(-1 + var4.length()), -33)) {
              if (param1 != 4) {
                f.e(1);
              }
              var5 = 0;
              for (var6 = 0; var6 < param0.length(); var6++) {
                var7 = param0.charAt(var6);
                if (!jd.a((char) var7, param1 - 37)) {
                  var5 = 0;
                } else {
                  var5++;
                }
                if (2 <= var5 &&
                  !param2) {
                  return false;
                }
              }
              if (0 >= var5) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("f.I(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void f(int param0) {
        try {
          IOException iOException = null;
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (this.field_F == null) {
            return;
          }
          try {
            this.field_o.position = 0;
            this.field_o.writeByte((byte) 111, 6);
            this.field_o.e(31, 3);
            this.field_o.writeShort(0, 90);
            var2_int = -85 / ((-22 - param0) / 42);
            this.field_F.a(this.field_o.payload.length, this.field_o.payload, -100, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_F.b(12110);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_f = this.field_f + 1;
            this.field_F = null;
            this.field_t = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        Exception exception = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          this.field_F.b(12110);
          if (param0 != 14900) {
            var3 = (Object) null;
            this.a((Object) null, true, 90);
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        this.field_t = -1;
        this.field_f = this.field_f + 1;
        this.field_F = null;
        this.field_n = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    final boolean d(byte param0) {
        try {
          int var3_int = 0;
          int stackIn_62_0 = 0;
          int stackIn_78_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          int var2_int = 0;
          IOException var2 = null;
          qa var3 = null;
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
          qa var15_ref = null;
          int var16 = 0;
          int var17 = 0;
          qa var3Lifetime1;
          var17 = SteelSentinels.obfuscationControl;
          if (null != this.field_F) {
            var2_long = mm.a(52);
            var4 = (int)(-this.field_e + var2_long);
            this.field_e = var2_long;
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_i = this.field_i + var4;
            if (this.field_i > 30000) {
              try {
                this.field_F.b(12110);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_F = null;
            }
          }
          if (this.field_F == null) {
            if (this.a((byte) 16) != 0) {
              return false;
            }
            if (this.d(-21033) == 0) {
              return true;
            }
            return false;
          }
          try {
            var2_int = -82 % ((78 - param0) / 33);
            this.field_F.a(true);
            var3 = (qa) (this.field_m.first(22));
            while (var3 != null) {
              this.field_o.position = 0;
              this.field_o.writeByte((byte) 111, 1);
              this.field_o.a(var3.field_w, (byte) 120);
              this.field_F.a(this.field_o.payload.length, this.field_o.payload, -100, 0);
              this.field_a.addLast((byte) 121, var3);
              var3 = (qa) (this.field_m.next(false));
            }
            var3Lifetime1 = (qa) (this.field_j.first(22));
            while (var3Lifetime1 != null) {
              this.field_o.position = 0;
              this.field_o.writeByte((byte) 110, 0);
              this.field_o.a(var3Lifetime1.field_w, (byte) 120);
              this.field_F.a(this.field_o.payload.length, this.field_o.payload, -100, 0);
              this.field_p.addLast((byte) 106, var3Lifetime1);
              var3Lifetime1 = (qa) (this.field_j.next(false));
            }
            for (var3_int = 0; var3_int < 100; var3_int++) {
              var4 = this.field_F.a(-114);
              if (0 > var4) {
                throw new IOException();
              }
              if (var4 != 0) {
                this.field_i = 0;
                var5 = 0;
                if (this.field_d == null) {
                  var5 = 10;
                } else {
                  if (this.field_d.field_I == 0) {
                    var5 = 1;
                  }
                }
                if (0 < var5) {
                  var6 = var5 - this.field_c.position;
                  if (var6 > var4) {
                    var6 = var4;
                  }
                  this.field_F.a(this.field_c.position, var6, this.field_c.payload, -256);
                  if (0 != this.field_n) {
                    for (var7 = 0; var7 < var6; var7++) {
                      this.field_c.payload[this.field_c.position + var7] = (byte)bi.a((int) this.field_c.payload[this.field_c.position + var7], (int) this.field_n);
                    }
                  }
                  this.field_c.position = this.field_c.position + var6;
                  if (this.field_c.position >= var5) {
                    if (this.field_d != null) {
                      if (this.field_d.field_I != 0) {
                        throw new IOException();
                      }
                      if (this.field_c.payload[0] != -1) {
                        this.field_d = null;
                      } else {
                        this.field_d.field_I = 1;
                        this.field_c.position = 0;
                      }
                    } else {
                      this.field_c.position = 0;
                      var7 = this.field_c.readUnsignedByte((byte) -86);
                      var8 = this.field_c.readInt(0);
                      var9 = this.field_c.readUnsignedByte((byte) -113);
                      var10 = this.field_c.readInt(0);
                      var11 = var9 & 127;
                      stackIn_62_0 = (0 == (var9 & 128)) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var12 = stackIn_62_0;
                      var13 = ((long)var7 << 32) + (long)var8;
                      var15 = null;
                      if (var12 != 0) {
                        var15_ref = (qa) (this.field_p.first(22));
                        while (var15_ref != null) {
                          if (~var15_ref.field_w == ~var13) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var15_ref = (qa) (this.field_p.next(false));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var15_ref = (qa) (this.field_a.first(22));
                        while (var15_ref != null) {
                          if (var15_ref.field_w == var13) {
                            break;
                          }
                          var15_ref = (qa) (this.field_a.next(false));
                        }
                      }
                      if (var15_ref == null) {
                        throw new IOException();
                      }
                      stackIn_78_0 = (var11 != 0) ? 9 : 5;
                      var16 = stackIn_78_0;
                      this.field_d = var15_ref;
                      this.field_d.field_G = new PacketBuffer(var16 + (var10 + this.field_d.field_K));
                      this.field_d.field_G.writeByte((byte) 125, var11);
                      this.field_d.field_G.writeInt(true, var10);
                      this.field_c.position = 0;
                      this.field_d.field_I = 10;
                    }
                  }
                } else {
                  var6 = -this.field_d.field_K + this.field_d.field_G.payload.length;
                  var7 = 512 - this.field_d.field_I;
                  if (var7 > var6 - this.field_d.field_G.position) {
                    var7 = -this.field_d.field_G.position + var6;
                  }
                  if (var7 > var4) {
                    var7 = var4;
                  }
                  this.field_F.a(this.field_d.field_G.position, var7, this.field_d.field_G.payload, -256);
                  if (this.field_n != 0) {
                    for (var8 = 0; var7 > var8; var8++) {
                      this.field_d.field_G.payload[this.field_d.field_G.position + var8] = (byte)bi.a((int) this.field_d.field_G.payload[this.field_d.field_G.position + var8], (int) this.field_n);
                    }
                  }
                  this.field_d.field_G.position = this.field_d.field_G.position + var7;
                  this.field_d.field_I = this.field_d.field_I + var7;
                  if (var6 != this.field_d.field_G.position) {
                    if (this.field_d.field_I == 512) {
                      this.field_d.field_I = 0;
                    }
                  } else {
                    this.field_d.unlinkDual(480);
                    this.field_d.field_z = false;
                    this.field_d = null;
                  }
                }
                continue;
              }
              break;
            }
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2 = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_F.b(12110);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3_ref = (Exception) (Object) decompiledCaughtException;
            }
            this.field_f = this.field_f + 1;
            this.field_F = null;
            this.field_t = -2;
            if (this.a((byte) 16) == 0 &&
              0 == this.d(-21033)) {
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

    public f() {
    }

    static {
        field_B = new int[256];
        field_u = "<%0> is already on your friend list.";
        field_D = new rf();
        field_E = "<%0> sec";
        field_G = new java.util.zip.CRC32();
        field_v = 0;
        field_z = "Skip mission";
    }
}
