/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bk extends Js5Transport {
    static String[] field_q;
    static sf field_r;
    static int field_s;
    private pj field_t;

    final void a(Object param0, boolean param1, byte param2) {
        try {
          String stackIn_40_2 = null;
          boolean decompiledRegionSelector0 = false;
          Throwable decompiledCaughtException = null;
          int var6 = EscapeVector.obfuscationControl;
          try {
            if (null != this.field_t) {
              try {
                this.field_t.c(12497);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                Exception var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_t = null;
            }
            if (param2 >= -80) {
              return;
            }
            this.field_t = (pj) (param0);
            this.f(78);
            this.a(param1, false);
            this.field_c = null;
            this.field_o.position = 0;
            scanLoop1: while (true) {
              boolean decompiledFrameRemainder0 = true;
              Js5NetworkRequest var4_ref = (Js5NetworkRequest) (this.field_l.removeFirst((byte) -75));
              if (var4_ref != null) {
                this.field_p.addLast(-1, var4_ref);
                if (var6 != 0) {
                  if (var4_ref != null) {
                    this.field_j.addLast(-1, var4_ref);
                    break scanLoop1;
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                while (true) {
                  Js5NetworkRequest var4_refLifetime1 = (Js5NetworkRequest) (this.field_n.removeFirst((byte) -75));
                  if (var4_refLifetime1 == null) {
                    break;
                  }
                  this.field_j.addLast(-1, var4_refLifetime1);
                  if (var6 != 0) {
                    break scanLoop1;
                  }
                }
              }
              if (this.field_m != 0) {
                try {
                  this.field_e.position = 0;
                  this.field_e.f(4, -123);
                  this.field_e.f((int) this.field_m, -123);
                  this.field_e.a((byte) 125, 0);
                  this.field_t.a(this.field_e.payload.length, 0, this.field_e.payload, 5000);
                  decompiledRegionSelector0 = false;
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  IOException var4_ref2 = (IOException) (Object) decompiledCaughtException;
                  try {
                    this.field_t.c(12497);
                  } catch (java.lang.Exception decompiledCaughtParameter2) {
                    decompiledCaughtException = decompiledCaughtParameter2;
                    Exception var5 = (Exception) (Object) decompiledCaughtException;
                  }
                  this.field_g = this.field_g + 1;
                  this.field_d = -2;
                  this.field_t = null;
                  decompiledRegionSelector0 = true;
                }
                if (decompiledRegionSelector0) {
                }
              }
              break;
            }
            this.field_f = 0;
            this.field_k = td.b(128);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            RuntimeException var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_39_0 = var4_ref3;
            StringBuilder stackIn_39_1 = new StringBuilder().append("bk.F(");
            if (param0 == null) {
              stackIn_40_2 = "null";
            } else {
              stackIn_40_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(int param0) {
        try {
          field_q = null;
          if (param0 != -24811) {
            field_q = (String[]) null;
          }
          field_r = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "bk.Q(" + param0 + ')');
        }
    }

    private final void a(boolean param0, boolean param1) {
        try {
          int stackIn_6_1 = 0;
          Throwable decompiledCaughtException = null;
          try {
            if (null == this.field_t) {
              return;
            }
            try {
              this.field_e.position = 0;
              PacketBuffer stackIn_5_0 = this.field_e;
              stackIn_6_1 = (!param0) ? (3) : (2);
              ((PacketBuffer) (Object) stackIn_5_0).f(stackIn_6_1, -123);
              this.field_e.a(0L, 125);
              if (param1) {
                bk.g(90);
              }
              this.field_t.a(this.field_e.payload.length, 0, this.field_e.payload, 5000);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              IOException var3 = (IOException) (Object) decompiledCaughtException;
              try {
                this.field_t.c(12497);
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                Exception var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_t = null;
              this.field_d = -2;
              this.field_g = this.field_g + 1;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            RuntimeException var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw t.a((Throwable) ((Object) var3_ref), "bk.N(" + param0 + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ij a(int param0, boolean param1, int param2, int param3, int param4) {
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int var6 = EscapeVector.obfuscationControl;
        try {
          ij var5 = (ij) (qd.field_n.first(false));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var5))) {
            stackIn_11_0 = ~param0;
            stackIn_11_1 = ~var5.field_n;
            if (var6 == 0) {
              if (stackIn_11_0 == stackIn_11_1) {
                ij stackIn_8_0 = var5;
                return stackIn_8_0;
              }
              var5 = (ij) (qd.field_n.next((byte) 70));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_11_0 = param1 ? 1 : 0;
            stackIn_11_1 = 1;
          }
          if (stackIn_11_0 != stackIn_11_1) {
            field_q = (String[]) null;
          }
          ij var5Lifetime1 = new ij();
          var5Lifetime1.field_j = param4;
          var5Lifetime1.field_n = param0;
          var5Lifetime1.field_h = param2;
          qd.field_n.addLast(-12328, var5Lifetime1);
          aj.a(124, param3, var5Lifetime1);
          ij stackIn_15_0 = var5Lifetime1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var5_ref), "bk.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(byte param0) {
        Throwable decompiledCaughtException = null;
        try {
          try {
            this.field_t.c(12497);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            Exception var2 = (Exception) (Object) decompiledCaughtException;
          }
          this.field_g = this.field_g + 1;
          if (param0 >= -108) {
            bk.h(-33);
          }
          this.field_d = -1;
          this.field_t = null;
          this.field_m = (byte)(int)(1.0 + 255.0 * Math.random());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "bk.B(" + param0 + ')');
        }
    }

    final void a(int param0) {
        try {
          if (param0 != 0) {
            this.a(-28);
          }
          if (this.field_t != null) {
            this.field_t.c(12497);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "bk.E(" + param0 + ')');
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        try {
          if (param1) {
            int stackIn_2_0 = 36;
            return stackIn_2_0;
          }
          int var3_int = param2 >>> 31;
          int stackIn_4_0 = (param2 + var3_int) / param0 - var3_int;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "bk.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void g(int param0) {
        tg stackIn_63_0 = null;
        tg stackIn_63_1 = null;
        int stackIn_63_2 = 0;
        int var8 = EscapeVector.obfuscationControl;
        try {
          CipherPacketBuffer var1 = om.field_g;
          int var2 = var1.readUnsignedByte(param0 ^ 0);
          if (param0 == var2) {
            if (null == ml.field_a) {
              ml.field_a = new nn(128);
              qc.field_Ab = 0;
            }
            boolean stackIn_12_0 = !(var1.readUnsignedByte(0) != 1);
            boolean var3_int = stackIn_12_0;
            String var4_ref_String = var1.c(false);
            if (var3_int) {
              var1.c(false);
            }
            tg var5 = gf.a(var4_ref_String, (byte) -125);
            String var6 = var1.c(false);
            String var7 = sf.a(-123, (CharSequence) ((Object) var4_ref_String));
            if (null == var7) {
              var7 = var4_ref_String;
            }
            if (var5 == null) {
              var5 = gf.a(var6, (byte) 114);
              if (null != var5) {
                ml.field_a.a((long)var7.hashCode(), var5, 26);
              }
            }
            if (null == var5) {
              var5 = new tg();
              ml.field_a.a((long)var7.hashCode(), var5, 37);
              int fieldTemp$0 = qc.field_Ab;
              qc.field_Ab = qc.field_Ab + 1;
              var5.field_pb = fieldTemp$0;
              jd.field_a.addLast(-12328, var5);
            }
            var5.field_ob = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              if (RasterSnapshot.field_g == 1) {
                RasterSnapshot.field_g = 2;
              }
              return;
            }
            if (var2 == 3) {
              if (RasterSnapshot.field_g == 2) {
                RasterSnapshot.field_g = 1;
              }
              return;
            }
            if (4 != var2) {
              pf.a(false, "F1: " + hf.b((byte) -76), (Throwable) null);
              nm.a(16);
              return;
            }
            RasterSnapshot.field_g = 1;
            Object var3 = var1.c(false);
            di.field_f = ((String) (var3)).intern();
            int var4 = var1.readUnsignedByte(0);
            ii.a((byte) 16, var4);
            return;
          }
          if (bm.field_b == null) {
            bm.field_b = new nn(128);
            ua.field_a = 0;
          }
          Object var3Lifetime1 = var1.c(false);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          String var4_ref_StringLifetime1 = var1.c(false);
          String var5_ref = var1.c(false);
          tg var6_ref = fk.a(param0 ^ -1465, var4_ref_StringLifetime1);
          if (var6_ref == null) {
            var6_ref = fk.a(-1465, var5_ref);
            if (var6_ref != null) {
              bm.field_b.a((long)sf.a(-88, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), var6_ref, 25);
            }
          }
          if (null == var6_ref) {
            var6_ref = new tg();
            bm.field_b.a((long)sf.a(-109, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), var6_ref, param0 ^ 123);
            int fieldTemp$1 = ua.field_a;
            ua.field_a = ua.field_a + 1;
            var6_ref.field_pb = fieldTemp$1;
            ji.field_c.addLast(-12328, var6_ref);
          }
          if (null != var3Lifetime1) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6_ref.field_ob = var4_ref_StringLifetime1;
          var6_ref.field_lb = (String) (var3Lifetime1);
          var6_ref.unlink((byte) -14);
          tg var7_ref = (tg) (ji.field_c.first(false));
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (null != var7_ref) {
              stackIn_63_0 = var6_ref;
              stackIn_63_1 = var7_ref;
              stackIn_63_2 = -7457;
              decompiledFrameRemainder0 = (var8 == 0);
              if (decompiledFrameRemainder0 &&
                EscapeVector.a(stackIn_63_0, stackIn_63_1, stackIn_63_2)) {
                var7_ref = (tg) (ji.field_c.next((byte) 70));
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (var7_ref == null) {
                break scanLoop1;
              }
              stackIn_63_0 = var6_ref;
              stackIn_63_1 = var7_ref;
              stackIn_63_2 = -7;
            }
            EscapeVector.insertNodeBeforeWithIntGuard((IntrusiveNode) (stackIn_63_0), (IntrusiveNode) (stackIn_63_1), stackIn_63_2);
            if (var8 == 0) {
              return;
            }
            break;
          }
          ji.field_c.addLast(param0 ^ -12328, var6_ref);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "bk.M(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          try {
            if (null == this.field_t) {
              return;
            }
            try {
              this.field_e.position = 0;
              this.field_e.f(6, -123);
              int var2_int = 45 % ((-48 - param0) / 39);
              this.field_e.b(1743120456, 3);
              this.field_e.h(82, 0);
              this.field_t.a(this.field_e.payload.length, 0, this.field_e.payload, 5000);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              IOException var2 = (IOException) (Object) decompiledCaughtException;
              try {
                this.field_t.c(12497);
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                Exception var3 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_g = this.field_g + 1;
              this.field_d = -2;
              this.field_t = null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            RuntimeException var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw t.a((Throwable) ((Object) var2_ref), "bk.L(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean d(int param0) {
        try {
          int stackIn_122_0 = 0;
          int stackIn_143_0 = 0;
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          Js5NetworkRequest var14_ref = null;
          int var16 = EscapeVector.obfuscationControl;
          try {
            if (null != this.field_t) {
              long var2_long = td.b(param0 + 4122);
              var4 = (int)(-this.field_k + var2_long);
              this.field_k = var2_long;
              if (var4 > 200) {
                var4 = 200;
              }
              this.field_f = this.field_f + var4;
              if (30000 < this.field_f) {
                try {
                  this.field_t.c(param0 + 16491);
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  Exception var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                }
                this.field_t = null;
              }
            }
            if (null == this.field_t) {
              if (0 == this.a(true) &&
                this.a((byte) 88) == 0) {
                return true;
              }
              return false;
            }
            try {
              this.field_t.a((byte) 123);
              Js5NetworkRequest var2 = (Js5NetworkRequest) (this.field_p.first(0));
              scanLoop1: while (true) {
                if (var2 != null) {
                  this.field_e.position = 0;
                  this.field_e.f(1, -123);
                  this.field_e.a(var2.secondaryKey, -118);
                  this.field_t.a(this.field_e.payload.length, 0, this.field_e.payload, 5000);
                  this.field_l.addLast(param0 + 3993, var2);
                  var2 = (Js5NetworkRequest) (this.field_p.next((byte) -101));
                  if (var16 != 0) {
                    break scanLoop1;
                  }
                  if (var16 == 0) {
                    continue;
                  }
                }
                var2 = (Js5NetworkRequest) (this.field_j.first(param0 ^ param0));
                break;
              }
              while (var2 != null) {
                this.field_e.position = 0;
                this.field_e.f(0, -123);
                this.field_e.a(var2.secondaryKey, -3);
                this.field_t.a(this.field_e.payload.length, 0, this.field_e.payload, 5000);
                this.field_n.addLast(-1, var2);
                var2 = (Js5NetworkRequest) (this.field_j.next((byte) -43));
                if (var16 == 0) {
                  continue;
                }
                break;
              }
              int var2_int = 0;
              scanLoop2: while (true) {
                if (var2_int < 100) {
                  int var3_int = this.field_t.b(param0 + 3876);
                  stackIn_143_0 = var3_int;
                  if (var16 != 0) {
                    break scanLoop2;
                  }
                  if (stackIn_143_0 < 0) {
                    throw new IOException();
                  }
                  if (var3_int != 0) {
                    this.field_f = 0;
                    var4 = 0;
                    if (this.field_c == null) {
                      var4 = 10;
                      if (var16 != 0 &&
                        this.field_c.field_F == 0) {
                        var4 = 1;
                      }
                    } else if (this.field_c.field_F == 0) {
                      var4 = 1;
                    }
                    boolean decompiledFrameRemainder1 = true;
                    if (var4 <= 0) {
                      int var5 = this.field_c.field_A.payload.length - this.field_c.field_y;
                      int var6 = -this.field_c.field_F + 512;
                      if ((-this.field_c.field_A.position + var5) < var6) {
                        var6 = var5 - this.field_c.field_A.position;
                      }
                      if (var6 > var3_int) {
                        var6 = var3_int;
                      }
                      boolean decompiledFrameCompleted4 = true;
                      this.field_t.a(this.field_c.field_A.position, var6, this.field_c.field_A.payload, (byte) -49);
                      if (this.field_m != 0) {
                        int var7 = 0;
                        while (var6 > var7) {
                          this.field_c.field_A.payload[var7 + this.field_c.field_A.position] = (byte)PacketBuffer.a((int) this.field_c.field_A.payload[var7 + this.field_c.field_A.position], (int) this.field_m);
                          var7++;
                          if (var16 != 0) {
                            decompiledFrameCompleted4 = false;
                            break;
                          }
                          if (var16 == 0) {
                            continue;
                          }
                          break;
                        }
                      }
                      if (decompiledFrameCompleted4) {
                        this.field_c.field_F = this.field_c.field_F + var6;
                        this.field_c.field_A.position = this.field_c.field_A.position + var6;
                      }
                      if (~var5 == ~this.field_c.field_A.position) {
                        this.field_c.unlinkSecondary(-110);
                        this.field_c.field_u = false;
                        this.field_c = null;
                        decompiledFrameRemainder1 = (var16 != 0);
                      }
                      if (decompiledFrameRemainder1 &&
                        (decompiledFrameRemainder1 = (this.field_c.field_F == 512))) {
                        this.field_c.field_F = 0;
                      }
                    }
                    if (decompiledFrameRemainder1 &&
                      (!(var4 <= 0) ||
                      var16 != 0)) {
                      int var5Lifetime1 = var4 - this.field_o.position;
                      if (var3_int < var5Lifetime1) {
                        var5Lifetime1 = var3_int;
                      }
                      boolean decompiledFrameCompleted3 = true;
                      this.field_t.a(this.field_o.position, var5Lifetime1, this.field_o.payload, (byte) -49);
                      if (this.field_m != 0) {
                        int var6Lifetime1 = 0;
                        while (var6Lifetime1 < var5Lifetime1) {
                          this.field_o.payload[var6Lifetime1 + this.field_o.position] = (byte)PacketBuffer.a((int) this.field_o.payload[var6Lifetime1 + this.field_o.position], (int) this.field_m);
                          var6Lifetime1++;
                          if (var16 != 0) {
                            decompiledFrameCompleted3 = false;
                            break;
                          }
                          if (var16 == 0) {
                            continue;
                          }
                          break;
                        }
                      }
                      if (decompiledFrameCompleted3) {
                        this.field_o.position = this.field_o.position + var5Lifetime1;
                      }
                      if (this.field_o.position >= var4) {
                        if (this.field_c == null) {
                          this.field_o.position = 0;
                          int var6Lifetime1Lifetime1 = this.field_o.readUnsignedByte(0);
                          int var7Lifetime1 = this.field_o.readInt(-5053);
                          int var8 = this.field_o.readUnsignedByte(0);
                          int var9 = this.field_o.readInt(-5053);
                          int var10 = var8 & 127;
                          boolean stackIn_95_0 = !(0 == (128 & var8));
                          boolean decompiledFrameCompleted2 = true;
                          boolean decompiledFrameCompleted0 = true;
                          boolean decompiledFrameRemainder0 = true;
                          boolean decompiledFrameCompleted1 = true;
                          boolean var11 = stackIn_95_0;
                          long var12 = (long)var7Lifetime1 + ((long)var6Lifetime1Lifetime1 << 32);
                          Object var14 = null;
                          if (var11) {
                            var14_ref = (Js5NetworkRequest) (this.field_n.first(0));
                            while (var14_ref != null) {
                              stackIn_122_0 = compareLongs(var12, var14_ref.secondaryKey);
                              if (var16 != 0) {
                                decompiledFrameCompleted2 = false;
                                break;
                              }
                              if (stackIn_122_0 == 0 &&
                                var16 == 0) {
                                decompiledFrameCompleted1 = false;
                                break;
                              }
                              var14_ref = (Js5NetworkRequest) (this.field_n.next((byte) 106));
                            }
                            if (decompiledFrameCompleted2) {
                              decompiledFrameRemainder0 = !(decompiledFrameCompleted1);
                            }
                          }
                          if (decompiledFrameRemainder0 &&
                            decompiledFrameCompleted2 &&
                            decompiledFrameCompleted1) {
                            var14_ref = (Js5NetworkRequest) (this.field_l.first(0));
                            while (null != var14_ref) {
                              stackIn_122_0 = compareLongs(~var12, ~var14_ref.secondaryKey);
                              if (var16 != 0) {
                                decompiledFrameCompleted0 = false;
                                break;
                              }
                              if (stackIn_122_0 == 0 &&
                                var16 == 0) {
                                break;
                              }
                              var14_ref = (Js5NetworkRequest) (this.field_l.next((byte) -52));
                              if (var16 == 0) {
                                continue;
                              }
                              break;
                            }
                          }
                          if (decompiledFrameCompleted2 &&
                            decompiledFrameCompleted0) {
                            if (null == var14_ref) {
                              throw new IOException();
                            }
                            this.field_c = var14_ref;
                            stackIn_122_0 = -1;
                          }
                          int stackIn_126_0 = (stackIn_122_0 != ~var10) ? 9 : 5;
                          int var15 = stackIn_126_0;
                          this.field_c.field_A = new PacketBuffer(var15 + (var9 + this.field_c.field_y));
                          this.field_c.field_A.f(var10, -123);
                          this.field_c.field_A.a((byte) 125, var9);
                          this.field_c.field_F = 10;
                          this.field_o.position = 0;
                          decompiledFrameRemainder1 = (var16 != 0);
                        }
                        if (decompiledFrameRemainder1) {
                          if (0 == this.field_c.field_F) {
                            if (this.field_o.payload[0] != -1) {
                              this.field_c = null;
                              decompiledFrameRemainder1 = (var16 != 0);
                            }
                            if (decompiledFrameRemainder1) {
                              this.field_o.position = 0;
                              this.field_c.field_F = 1;
                              decompiledFrameRemainder1 = (var16 != 0);
                            }
                          }
                          if (decompiledFrameRemainder1) {
                            throw new IOException();
                          }
                        }
                      }
                    }
                    var2_int++;
                    if (var16 == 0) {
                      continue;
                    }
                  }
                }
                stackIn_143_0 = 1;
                break;
              }
              return stackIn_143_0 != 0;
            } catch (java.io.IOException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              IOException var2_ref = (IOException) (Object) decompiledCaughtException;
              try {
                this.field_t.c(12497);
              } catch (java.lang.Exception decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                Exception var3 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_t = null;
              this.field_d = -2;
              this.field_g = this.field_g + 1;
              if (this.a(true) == 0 &&
                this.a((byte) 88) == 0) {
                return true;
              }
              return false;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            RuntimeException var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            throw t.a((Throwable) ((Object) var2_ref2), "bk.I(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static Object a(boolean param0, byte[] param1, int param2) {
        String stackIn_18_2 = null;
        try {
          if (param2 != 9) {
            Object stackIn_2_0 = (Object) null;
            return stackIn_2_0;
          }
          if (null == param1) {
            Object stackIn_5_0 = null;
            return stackIn_5_0;
          }
          if (param1.length > 136) {
            km var3 = new km();
            ((fh) ((Object) var3)).a(true, param1);
            km stackIn_8_0 = var3;
            return stackIn_8_0;
          }
          if (param0) {
            byte[] stackIn_13_0 = pn.a(param2 - 9, param1);
            return stackIn_13_0;
          }
          byte[] stackIn_11_0 = (byte[]) (param1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var3_ref;
          StringBuilder stackIn_17_1 = new StringBuilder().append("bk.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public bk() {
    }

    static {
        field_q = new String[]{"Well done, commander. You have secured all the stolen technology stored in the aliens' outer system.<delay><br>Your mission is complete."};
    }

    private static int compareLongs(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
