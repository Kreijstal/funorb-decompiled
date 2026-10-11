/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gv extends qda {
    private jqa field_t;
    static int[] field_q;
    static jpa field_s;
    static String field_r;
    static int field_u;
    static String field_v;
    static String[] field_w;

    public gv() {
    }

    public static void a(boolean param0) {
        field_v = null;
        field_q = null;
        field_s = null;
        field_r = null;
        if (param0) {
          return;
        }
        field_w = null;
    }

    final void a(int param0) {
        if (null != this.field_t) {
          this.field_t.a((byte) 105);
        }
        if (param0 != -21) {
          field_v = (String) null;
        }
    }

    final void a(Object param0, byte param1, boolean param2) {
        try {
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          qqa var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          qqa var4_refLifetime1;
          var6 = TombRacer.field_G ? 1 : 0;
          try {
            if (this.field_t != null) {
              try {
                this.field_t.a((byte) 105);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_t = null;
            }
            this.field_t = (jqa) (param0);
            this.g(param1 - 104);
            if (param1 != 54) {
              field_w = (String[]) null;
            }
            this.a((byte) 117, param2);
            this.field_h.field_h = 0;
            this.field_g = null;
            while (true) {
              var4_ref = (qqa) (this.field_m.c((byte) 121));
              if (var4_ref != null) {
                this.field_e.a(var4_ref, (byte) -81);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (qqa) (this.field_k.c((byte) 111));
              if (var4_refLifetime1 != null) {
                this.field_c.a(var4_refLifetime1, (byte) -104);
                continue;
              }
              break;
            }
            if (this.field_d != 0) {
              try {
                this.field_o.field_h = 0;
                this.field_o.i(4, param1 - 54);
                this.field_o.i((int) this.field_d, param1 ^ 54);
                this.field_o.a(0, (byte) -17);
                this.field_t.a(this.field_o.field_g, 0, this.field_o.field_g.length, 124);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_t.a((byte) 105);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_n = -2;
                this.field_t = null;
                this.field_a = this.field_a + 1;
              }
            }
            this.field_p = 0;
            this.field_j = bva.b((byte) -107);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var4_ref3;
            stackIn_26_1 = new StringBuilder().append("gv.D(");
            if (param0 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(byte param0, boolean param1) {
        try {
          IOException iOException = null;
          uia stackIn_4_0 = null;
          int stackIn_5_1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (null == this.field_t) {
            return;
          }
          try {
            this.field_o.field_h = 0;
            stackIn_4_0 = this.field_o;
            if (!param1) {
              stackIn_5_1 = 3;
            } else {
              stackIn_5_1 = 2;
            }
            ((uia) (Object) stackIn_4_0).i(stackIn_5_1, 0);
            this.field_o.a(true, 0L);
            this.field_t.a(this.field_o.field_g, 0, this.field_o.field_g.length, 124);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_t.a((byte) 105);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_t = null;
            this.field_a = this.field_a + 1;
            this.field_n = -2;
          }
          if (param0 != 117) {
            field_r = (String) null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10;
        int var11;
        if (param5 != 0) {
          gv.a(true);
        }
        boolean decompiledFrameRemainder0 = true;
        var10 = -(param2 * param7 / param8) + param6;
        if (var10 >= param0 &&
          param9 >= var10) {
          if (param3 > param6) {
            decompiledFrameRemainder0 = !(var10 < param6);
            if (decompiledFrameRemainder0) {
              decompiledFrameRemainder0 = !(var10 > param3);
            }
          } else {
            decompiledFrameRemainder0 = !(param3 > var10);
            if (decompiledFrameRemainder0) {
              decompiledFrameRemainder0 = !(var10 > param6);
            }
          }
          if (decompiledFrameRemainder0) {
            var11 = -(param2 << param1) / param8;
            if (var11 >= 0 &&
              1 << param1 > var11 && (param4 == -1 ||
              param4 > var11)) {
              return var11;
            }
          }
        }
        return param4;
    }

    final boolean c(int param0) {
        try {
          int var2_int = 0;
          int stackIn_59_0 = 0;
          int stackIn_75_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          qqa var2 = null;
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
          qqa var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          qqa var2Lifetime1;
          var16 = TombRacer.field_G ? 1 : 0;
          if (null != this.field_t) {
            var2_long = bva.b((byte) -107);
            var4 = (int)(-this.field_j + var2_long);
            this.field_j = var2_long;
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_p = this.field_p + var4;
            if (this.field_p > 30000) {
              try {
                this.field_t.a((byte) 105);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_t = null;
            }
          }
          if (this.field_t == null) {
            if (this.f(-3) != 0) {
              return false;
            }
            if (this.a((byte) 78) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_t.b(102);
            var2 = (qqa) (this.field_e.b((byte) 38));
            while (var2 != null) {
              this.field_o.field_h = 0;
              this.field_o.i(1, 0);
              this.field_o.a(true, var2.field_j);
              this.field_t.a(this.field_o.field_g, 0, this.field_o.field_g.length, 119);
              this.field_m.a(var2, (byte) -100);
              var2 = (qqa) (this.field_e.c(28));
            }
            var2Lifetime1 = (qqa) (this.field_c.b((byte) 38));
            while (var2Lifetime1 != null) {
              this.field_o.field_h = 0;
              this.field_o.i(0, 0);
              this.field_o.a(true, var2Lifetime1.field_j);
              this.field_t.a(this.field_o.field_g, 0, this.field_o.field_g.length, 101);
              this.field_k.a(var2Lifetime1, (byte) -99);
              var2Lifetime1 = (qqa) (this.field_c.c(28));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_t.c(0);
              if (0 > var3_int) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.field_p = 0;
                var4 = 0;
                if (this.field_g != null) {
                  if (this.field_g.field_s == 0) {
                    var4 = 1;
                  }
                } else {
                  var4 = 10;
                }
                if (var4 > 0) {
                  var5 = -this.field_h.field_h + var4;
                  if (var3_int < var5) {
                    var5 = var3_int;
                  }
                  this.field_t.a(0, this.field_h.field_h, this.field_h.field_g, var5);
                  if (0 != this.field_d) {
                    for (var6 = 0; var5 > var6; var6++) {
                      this.field_h.field_g[var6 + this.field_h.field_h] = (byte)kha.b((int) this.field_h.field_g[var6 + this.field_h.field_h], (int) this.field_d);
                    }
                  }
                  this.field_h.field_h = this.field_h.field_h + var5;
                  if (var4 <= this.field_h.field_h) {
                    if (this.field_g != null) {
                      if (this.field_g.field_s != 0) {
                        throw new IOException();
                      }
                      if (this.field_h.field_g[0] != -1) {
                        this.field_g = null;
                      } else {
                        this.field_g.field_s = 1;
                        this.field_h.field_h = 0;
                      }
                    } else {
                      this.field_h.field_h = 0;
                      var6 = this.field_h.h(255);
                      var7 = this.field_h.e(105);
                      var8 = this.field_h.h(255);
                      var9 = this.field_h.e(-60);
                      var10 = 127 & var8;
                      stackIn_59_0 = ((128 & var8) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_59_0;
                      var12 = ((long)var6 << 32) + (long)var7;
                      var14 = null;
                      if (var11 != 0) {
                        var14_ref = (qqa) (this.field_k.b((byte) 38));
                        while (var14_ref != null) {
                          if (~var14_ref.field_j == ~var12) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (qqa) (this.field_k.c(28));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (qqa) (this.field_m.b((byte) 38));
                        while (var14_ref != null) {
                          if (~var14_ref.field_j == ~var12) {
                            break;
                          }
                          var14_ref = (qqa) (this.field_m.c(28));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_75_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_75_0;
                      this.field_g = var14_ref;
                      this.field_g.field_r = new uia(var9 + var15 + this.field_g.field_q);
                      this.field_g.field_r.i(var10, 0);
                      this.field_g.field_r.a(var9, (byte) 119);
                      this.field_h.field_h = 0;
                      this.field_g.field_s = 10;
                    }
                  }
                } else {
                  var5 = this.field_g.field_r.field_g.length - this.field_g.field_q;
                  var6 = -this.field_g.field_s + 512;
                  if (var5 - this.field_g.field_r.field_h < var6) {
                    var6 = -this.field_g.field_r.field_h + var5;
                  }
                  if (var6 > var3_int) {
                    var6 = var3_int;
                  }
                  this.field_t.a(0, this.field_g.field_r.field_h, this.field_g.field_r.field_g, var6);
                  if (this.field_d != 0) {
                    for (var7 = 0; var7 < var6; var7++) {
                      this.field_g.field_r.field_g[this.field_g.field_r.field_h + var7] = (byte)kha.b((int) this.field_g.field_r.field_g[this.field_g.field_r.field_h + var7], (int) this.field_d);
                    }
                  }
                  this.field_g.field_s = this.field_g.field_s + var6;
                  this.field_g.field_r.field_h = this.field_g.field_r.field_h + var6;
                  if (var5 != this.field_g.field_r.field_h) {
                    if (this.field_g.field_s == 512) {
                      this.field_g.field_s = 0;
                    }
                  } else {
                    this.field_g.c(-7975);
                    this.field_g.field_m = false;
                    this.field_g = null;
                  }
                }
                continue;
              }
              break;
            }
            if (param0 <= 26) {
              gv.a(false);
            }
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_t.a((byte) 105);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_t = null;
            this.field_n = -2;
            this.field_a = this.field_a + 1;
            if (this.f(-3) == 0 &&
              this.a((byte) 78) == 0) {
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

    final void e(int param0) {
        try {
          this.field_t.a((byte) 105);
        } catch (Exception exception) {
        }
        this.field_t = null;
        this.field_a = this.field_a + 1;
        this.field_n = param0;
        this.field_d = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    private final void g(int param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (null == this.field_t) {
            return;
          }
          try {
            if (param0 > -48) {
              this.c(21);
            }
            this.field_o.field_h = 0;
            this.field_o.i(6, 0);
            this.field_o.h(-86, 3);
            this.field_o.f(-1477662136, 0);
            this.field_t.a(this.field_o.field_g, 0, this.field_o.field_g.length, 118);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_t.a((byte) 105);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_t = null;
            this.field_n = -2;
            this.field_a = this.field_a + 1;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_v = "You unlocked a new character!";
        field_r = "<%0> would need a rating of <%1> to play with the current options.";
        field_q = new int[8192];
    }
}
