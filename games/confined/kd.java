/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kd extends jf {
    private vd field_p;
    static ci field_t;
    static String field_q;
    static String field_s;
    static double field_r;

    private final void e(int param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (this.field_p == null) {
            return;
          }
          try {
            this.field_i.field_n = 0;
            this.field_i.f(94, 6);
            this.field_i.a((byte) 120, 3);
            if (param0 != 22112) {
              return;
            }
            this.field_i.c(0, 8);
            this.field_p.a(this.field_i.field_m.length, false, this.field_i.field_m, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_p.a(1);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_a = this.field_a + 1;
            this.field_p = null;
            this.field_e = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void d(int param0) {
        if (param0 >= -57) {
          kd.d((byte) -7);
        }
        if (null != this.field_p) {
          this.field_p.a(1);
        }
    }

    public static void d(byte param0) {
        if (param0 <= 86) {
          kd.d((byte) 68);
        }
        field_s = null;
        field_t = null;
        field_q = null;
    }

    final void a(boolean param0, Object param1, byte param2) {
        try {
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          tn var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          tn var4_refLifetime1;
          var6 = Confined.field_J ? 1 : 0;
          try {
            if (this.field_p != null) {
              try {
                this.field_p.a(param2 ^ -66);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_p = null;
            }
            this.field_p = (vd) (param1);
            if (param2 != -65) {
              kd.d((byte) -56);
            }
            this.e(22112);
            this.a(param2 + 67, param0);
            this.field_m.field_n = 0;
            this.field_f = null;
            while (true) {
              var4_ref = (tn) (this.field_j.c(false));
              if (var4_ref != null) {
                this.field_o.a(var4_ref, (byte) -101);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (tn) (this.field_n.c(false));
              if (var4_refLifetime1 != null) {
                this.field_g.a(var4_refLifetime1, (byte) 127);
                continue;
              }
              break;
            }
            if (this.field_d != 0) {
              try {
                this.field_i.field_n = 0;
                this.field_i.f(param2 ^ -43, 4);
                this.field_i.f(param2 ^ -43, (int) this.field_d);
                this.field_i.d(-104, 0);
                this.field_p.a(this.field_i.field_m.length, false, this.field_i.field_m, 0);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_p.a(1);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_e = -2;
                this.field_p = null;
                this.field_a = this.field_a + 1;
              }
            }
            this.field_l = 0;
            this.field_h = ri.a(param2 ^ 66);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var4_ref3;
            stackIn_26_1 = new StringBuilder().append("kd.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) {
        try {
          this.field_p.a(1);
        } catch (Exception exception) {
        }
        this.field_a = this.field_a + 1;
        if (!param0) {
          field_r = -1.6995276062907998;
        }
        this.field_e = -1;
        this.field_p = null;
        this.field_d = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    private final void a(int param0, boolean param1) {
        try {
          IOException iOException = null;
          kg stackIn_6_0 = null;
          int stackIn_6_1 = 0;
          int stackIn_7_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.field_p == null) {
            return;
          }
          try {
            this.field_i.field_n = 0;
            if (param0 != 2) {
              return;
            }
            stackIn_6_0 = this.field_i;
            stackIn_6_1 = 90;
            if (!param1) {
              stackIn_7_2 = 3;
            } else {
              stackIn_7_2 = 2;
            }
            ((kg) (Object) stackIn_6_0).f(stackIn_6_1, stackIn_7_2);
            this.field_i.a(0L, param0 + 8848);
            this.field_p.a(this.field_i.field_m.length, false, this.field_i.field_m, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_p.a(1);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_a = this.field_a + 1;
            this.field_p = null;
            this.field_e = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public kd() {
    }

    final static void a(byte param0, int param1, ca param2) {
        hb var3 = null;
        try {
          var3 = vh.field_a;
          var3.b(true, param1);
          var3.f(111, 2);
          var3.f(100, 0);
          var3.f(119, param2.field_m);
          int var4 = 2 % ((-44 - param0) / 35);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "kd.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final boolean a(byte param0) {
        try {
          int var2_int = 0;
          int stackIn_60_0 = 0;
          int stackIn_75_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          tn var2 = null;
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
          tn var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          tn var2Lifetime1;
          var16 = Confined.field_J ? 1 : 0;
          if (this.field_p != null) {
            var2_long = ri.a(-3);
            var4 = (int)(-this.field_h + var2_long);
            this.field_h = var2_long;
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_l = this.field_l + var4;
            if (this.field_l > 30000) {
              try {
                this.field_p.a(1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_p = null;
            }
          }
          if (this.field_p == null) {
            if (0 == this.a(-28475) &&
              0 == this.c((byte) -5)) {
              return true;
            }
            return false;
          }
          try {
            this.field_p.b(110);
            if (param0 < 11) {
              field_q = (String) null;
            }
            var2 = (tn) (this.field_o.d(92));
            while (var2 != null) {
              this.field_i.field_n = 0;
              this.field_i.f(95, 1);
              this.field_i.a(var2.field_r, 8850);
              this.field_p.a(this.field_i.field_m.length, false, this.field_i.field_m, 0);
              this.field_j.a(var2, (byte) -114);
              var2 = (tn) (this.field_o.a((byte) -113));
            }
            var2Lifetime1 = (tn) (this.field_g.d(-94));
            while (var2Lifetime1 != null) {
              this.field_i.field_n = 0;
              this.field_i.f(90, 0);
              this.field_i.a(var2Lifetime1.field_r, 8850);
              this.field_p.a(this.field_i.field_m.length, false, this.field_i.field_m, 0);
              this.field_n.a(var2Lifetime1, (byte) 117);
              var2Lifetime1 = (tn) (this.field_g.a((byte) -119));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_p.c((byte) -99);
              if (0 > var3_int) {
                throw new IOException();
              }
              if (var3_int == 0) {
                return true;
              }
              this.field_l = 0;
              var4 = 0;
              if (this.field_f == null) {
                var4 = 10;
              } else {
                if (0 == this.field_f.field_B) {
                  var4 = 1;
                }
              }
              if (0 < var4) {
                var5 = -this.field_m.field_n + var4;
                if (var3_int < var5) {
                  var5 = var3_int;
                }
                this.field_p.a(this.field_m.field_m, 49, var5, this.field_m.field_n);
                if (this.field_d != 0) {
                  for (var6 = 0; var5 > var6; var6++) {
                    this.field_m.field_m[this.field_m.field_n + var6] = (byte)km.a((int) this.field_m.field_m[this.field_m.field_n + var6], (int) this.field_d);
                  }
                }
                this.field_m.field_n = this.field_m.field_n + var5;
                if (this.field_m.field_n >= var4) {
                  if (this.field_f == null) {
                    this.field_m.field_n = 0;
                    var6 = this.field_m.c(32);
                    var7 = this.field_m.f((byte) 70);
                    var8 = this.field_m.c(32);
                    var9 = this.field_m.f((byte) 59);
                    var10 = var8 & 127;
                    stackIn_60_0 = (0 == (var8 & 128)) ? 0 : 1;
                    boolean decompiledFrameRemainder0 = true;
                    boolean decompiledFrameCompleted0 = true;
                    var11 = stackIn_60_0;
                    var12 = ((long)var6 << 32) + (long)var7;
                    var14 = null;
                    if (var11 == 0) {
                      var14_ref = (tn) (this.field_j.d(-97));
                      while (var14_ref != null) {
                        if (~var14_ref.field_r == ~var12) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        var14_ref = (tn) (this.field_j.a((byte) -117));
                      }
                      decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                    }
                    if ((decompiledFrameRemainder0) &&
                      (decompiledFrameCompleted0)) {
                      var14_ref = (tn) (this.field_n.d(-103));
                      while (var14_ref != null) {
                        if (var14_ref.field_r == var12) {
                          break;
                        }
                        var14_ref = (tn) (this.field_n.a((byte) -7));
                      }
                    }
                    if (var14_ref == null) {
                      throw new IOException();
                    }
                    stackIn_75_0 = (var10 == 0) ? 5 : 9;
                    var15 = stackIn_75_0;
                    this.field_f = var14_ref;
                    this.field_f.field_A = new kg(var9 + (var15 + this.field_f.field_z));
                    this.field_f.field_A.f(127, var10);
                    this.field_f.field_A.d(-86, var9);
                    this.field_f.field_B = 10;
                    this.field_m.field_n = 0;
                  } else {
                    if (this.field_f.field_B != 0) {
                      throw new IOException();
                    }
                    if (this.field_m.field_m[0] != -1) {
                      this.field_f = null;
                    } else {
                      this.field_m.field_n = 0;
                      this.field_f.field_B = 1;
                    }
                  }
                }
              } else {
                var5 = this.field_f.field_A.field_m.length - this.field_f.field_z;
                var6 = -this.field_f.field_B + 512;
                if (var6 > -this.field_f.field_A.field_n + var5) {
                  var6 = -this.field_f.field_A.field_n + var5;
                }
                if (var3_int < var6) {
                  var6 = var3_int;
                }
                this.field_p.a(this.field_f.field_A.field_m, -99, var6, this.field_f.field_A.field_n);
                if (this.field_d != 0) {
                  for (var7 = 0; var7 < var6; var7++) {
                    this.field_f.field_A.field_m[this.field_f.field_A.field_n + var7] = (byte)km.a((int) this.field_f.field_A.field_m[this.field_f.field_A.field_n + var7], (int) this.field_d);
                  }
                }
                this.field_f.field_B = this.field_f.field_B + var6;
                this.field_f.field_A.field_n = this.field_f.field_A.field_n + var6;
                if (var5 != this.field_f.field_A.field_n) {
                  if (this.field_f.field_B == 512) {
                    this.field_f.field_B = 0;
                  }
                } else {
                  this.field_f.b(true);
                  this.field_f.field_v = false;
                  this.field_f = null;
                }
              }
            }
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_p.a(1);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_a = this.field_a + 1;
            this.field_p = null;
            this.field_e = -2;
            if (0 == this.a(-28475) &&
              this.c((byte) -5) == 0) {
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

    static {
        field_q = "<col=FFFFFF>Power shots:</col> this upgrade makes your basic weapon a lot more powerful for 30 seconds. The tunnel has never looked so bright.";
        field_s = "Rapid fire";
        field_t = new ci();
    }
}
