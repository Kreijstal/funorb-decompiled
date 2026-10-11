/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pd extends th {
    private fl field_s;
    static String field_r;
    static String[][] field_t;

    final void b(int param0) {
        try {
          this.field_s.d(-15488);
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

    final boolean a(boolean param0) {
        try {
          int var2_int = 0;
          int stackIn_44_0 = 0;
          int stackIn_60_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          rh var2 = null;
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
          rh var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          rh var2Lifetime1;
          var16 = TetraLink.field_J;
          if (this.field_s != null) {
            var2_long = k.a(0);
            var4 = (int)(-this.field_f + var2_long);
            this.field_f = var2_long;
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_a = this.field_a + var4;
            if (this.field_a > 30000) {
              try {
                this.field_s.d(-15488);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_s = null;
            }
          }
          if (null == this.field_s) {
            if (0 != this.c((byte) -61)) {
              return false;
            }
            if (this.d(20) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_s.a(100);
            var2 = (rh) (this.field_k.a((byte) 90));
            while (var2 != null) {
              this.field_b.field_t = 0;
              this.field_b.a(1, false);
              this.field_b.a(var2.field_n, true);
              this.field_s.a(true, this.field_b.field_u.length, this.field_b.field_u, 0);
              this.field_j.a(var2, 0);
              var2 = (rh) (this.field_k.a(false));
            }
            var2Lifetime1 = (rh) (this.field_o.a((byte) -95));
            while (var2Lifetime1 != null) {
              this.field_b.field_t = 0;
              this.field_b.a(0, false);
              this.field_b.a(var2Lifetime1.field_n, true);
              this.field_s.a(true, this.field_b.field_u.length, this.field_b.field_u, 0);
              this.field_c.a(var2Lifetime1, 0);
              var2Lifetime1 = (rh) (this.field_o.a(false));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_s.f(0);
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
                  var5 = -this.field_q.field_H + this.field_q.field_K.field_u.length;
                  var6 = 512 - this.field_q.field_I;
                  if (-this.field_q.field_K.field_t + var5 < var6) {
                    var6 = -this.field_q.field_K.field_t + var5;
                  }
                  if (var6 > var3_int) {
                    var6 = var3_int;
                  }
                  this.field_s.a(this.field_q.field_K.field_t, var6, this.field_q.field_K.field_u, 0);
                  if (0 != this.field_n) {
                    for (var7 = 0; var7 < var6; var7++) {
                      this.field_q.field_K.field_u[var7 + this.field_q.field_K.field_t] = (byte)oj.a((int) this.field_q.field_K.field_u[var7 + this.field_q.field_K.field_t], (int) this.field_n);
                    }
                  }
                  this.field_q.field_K.field_t = this.field_q.field_K.field_t + var6;
                  this.field_q.field_I = this.field_q.field_I + var6;
                  if (var5 != this.field_q.field_K.field_t) {
                    if (this.field_q.field_I == 512) {
                      this.field_q.field_I = 0;
                    }
                  } else {
                    this.field_q.e(0);
                    this.field_q.field_v = false;
                    this.field_q = null;
                  }
                } else {
                  var5 = -this.field_m.field_t + var4;
                  if (var5 > var3_int) {
                    var5 = var3_int;
                  }
                  this.field_s.a(this.field_m.field_t, var5, this.field_m.field_u, 0);
                  if (this.field_n != 0) {
                    for (var6 = 0; var6 < var5; var6++) {
                      this.field_m.field_u[this.field_m.field_t + var6] = (byte)oj.a((int) this.field_m.field_u[this.field_m.field_t + var6], (int) this.field_n);
                    }
                  }
                  this.field_m.field_t = this.field_m.field_t + var5;
                  if (var4 <= this.field_m.field_t) {
                    if (this.field_q != null) {
                      if (this.field_q.field_I != 0) {
                        throw new IOException();
                      }
                      if (this.field_m.field_u[0] != -1) {
                        this.field_q = null;
                      } else {
                        this.field_q.field_I = 1;
                        this.field_m.field_t = 0;
                      }
                    } else {
                      this.field_m.field_t = 0;
                      var6 = this.field_m.d((byte) -99);
                      var7 = this.field_m.f(104);
                      var8 = this.field_m.d((byte) -99);
                      var9 = this.field_m.f(-125);
                      var10 = 127 & var8;
                      stackIn_44_0 = (0 == (128 & var8)) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_44_0;
                      var12 = ((long)var6 << 32) + (long)var7;
                      var14 = null;
                      if (var11 != 0) {
                        var14_ref = (rh) (this.field_c.a((byte) -109));
                        while (var14_ref != null) {
                          if (var12 == var14_ref.field_n) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (rh) (this.field_c.a(param0));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (rh) (this.field_j.a((byte) -93));
                        while (var14_ref != null) {
                          if (~var14_ref.field_n == ~var12) {
                            break;
                          }
                          var14_ref = (rh) (this.field_j.a(false));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_60_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_60_0;
                      this.field_q = var14_ref;
                      this.field_q.field_K = new bh(var15 + (var9 + this.field_q.field_H));
                      this.field_q.field_K.a(var10, false);
                      this.field_q.field_K.d(var9, (byte) -124);
                      this.field_m.field_t = 0;
                      this.field_q.field_I = 10;
                    }
                  }
                }
                continue;
              }
              break;
            }
            if (param0) {
              pd.e(81);
            }
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_s.d(-15488);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_h = this.field_h + 1;
            this.field_d = -2;
            this.field_s = null;
            if (this.c((byte) -114) == 0 &&
              this.d(20) == 0) {
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

    public static void e(int param0) {
        field_t = (String[][]) null;
        field_r = null;
        if (param0 != 0) {
          pd.b(true);
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final void a(byte param0) {
        if (param0 != 80) {
          field_r = (String) null;
        }
        if (this.field_s != null) {
          this.field_s.d(-15488);
        }
    }

    final void a(Object param0, boolean param1, byte param2) {
        try {
          RuntimeException stackIn_25_0 = null;
          StringBuilder stackIn_25_1 = null;
          String stackIn_26_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          rh var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          rh var4_refLifetime1;
          var6 = TetraLink.field_J;
          try {
            if (this.field_s != null) {
              try {
                this.field_s.d(-15488);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_s = null;
            }
            this.field_s = (fl) (param0);
            this.c(false);
            this.a(false, param1);
            if (param2 > -73) {
              field_r = (String) null;
            }
            this.field_m.field_t = 0;
            this.field_q = null;
            while (true) {
              var4_ref = (rh) (this.field_j.c(-15464));
              if (var4_ref != null) {
                this.field_k.a(var4_ref, 0);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (rh) (this.field_c.c(-15464));
              if (var4_refLifetime1 != null) {
                this.field_o.a(var4_refLifetime1, 0);
                continue;
              }
              break;
            }
            if (this.field_n != 0) {
              try {
                this.field_b.field_t = 0;
                this.field_b.a(4, false);
                this.field_b.a((int) this.field_n, false);
                this.field_b.d(0, (byte) -124);
                this.field_s.a(true, this.field_b.field_u.length, this.field_b.field_u, 0);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_s.d(-15488);
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
            this.field_f = k.a(0);
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
            throw oi.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(boolean param0) {
        uh.field_f = new hl(0L, (hl) null);
        if (kj.field_b) {
          uh.field_f.a((byte) -108, uh.field_e);
        }
        uh.field_f.a((byte) -112, hh.field_c);
        gg.field_j = new mk(nm.field_v, uh.field_f);
        if (param0) {
          pd.e(-120);
        }
        hn.field_P = new hl(0L, (hl) null);
        hn.field_P.a((byte) -92, gg.field_j.field_g);
        hn.field_P.a((byte) 68, gg.field_i);
        db.a(5);
    }

    private final void c(boolean param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (null == this.field_s) {
            return;
          }
          try {
            this.field_b.field_t = 0;
            this.field_b.a(6, param0);
            this.field_b.a(3, (byte) -66);
            this.field_b.b(0, param0);
            this.field_s.a(true, this.field_b.field_u.length, this.field_b.field_u, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_s.d(-15488);
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

    private final void a(boolean param0, boolean param1) {
        try {
          IOException iOException = null;
          bh stackIn_7_0 = null;
          int stackIn_8_1 = 0;
          fl stackIn_10_0 = null;
          boolean stackIn_11_1 = false;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.field_s == null) {
            return;
          }
          try {
            if (param0) {
              this.field_s = (fl) null;
            }
            this.field_b.field_t = 0;
            stackIn_7_0 = this.field_b;
            if (!param1) {
              stackIn_8_1 = 3;
            } else {
              stackIn_8_1 = 2;
            }
            ((bh) (Object) stackIn_7_0).a(stackIn_8_1, param0);
            this.field_b.a(0L, true);
            stackIn_10_0 = this.field_s;
            stackIn_11_1 = !(param0);
            ((fl) (Object) stackIn_10_0).a(stackIn_11_1, this.field_b.field_u.length, this.field_b.field_u, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_s.d(-15488);
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

    public pd() {
    }

    static {
    }
}
