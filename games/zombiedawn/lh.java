/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lh extends pc {
    private gm field_n;

    private final void f(int param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (param0 > -54) {
            return;
          }
          if (null == this.field_n) {
            return;
          }
          try {
            this.field_b.field_j = 0;
            this.field_b.i(6, 13);
            this.field_b.c(3, -105);
            this.field_b.a(0, (byte) 105);
            this.field_n.a(this.field_b.field_h.length, true, 0, this.field_b.field_h);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_n.a(100);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_e = -2;
            this.field_h = this.field_h + 1;
            this.field_n = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean c(int param0) {
        try {
          int var2_int = 0;
          int stackIn_65_0 = 0;
          int stackIn_81_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          og var2 = null;
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
          og var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          og var2Lifetime1;
          var16 = ZombieDawn.field_J;
          if (null != this.field_n) {
            var2_long = pd.a(param0 - 22805);
            var4 = (int)(var2_long - this.field_g);
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_g = var2_long;
            this.field_i = this.field_i + var4;
            if (this.field_i > 30000) {
              try {
                this.field_n.a(-59);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_n = null;
            }
          }
          if (param0 != -21) {
            return true;
          }
          if (null == this.field_n) {
            if (this.e(-1216122784) != 0) {
              return false;
            }
            if (this.a(true) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_n.c((byte) 85);
            var2 = (og) (this.field_a.c((byte) 34));
            while (var2 != null) {
              this.field_b.field_j = 0;
              this.field_b.i(1, 114);
              this.field_b.b(var2.field_n, param0 ^ -21);
              this.field_n.a(this.field_b.field_h.length, true, 0, this.field_b.field_h);
              this.field_l.a(var2, (byte) -117);
              var2 = (og) (this.field_a.a((byte) 117));
            }
            var2Lifetime1 = (og) (this.field_f.c((byte) 34));
            while (var2Lifetime1 != null) {
              this.field_b.field_j = 0;
              this.field_b.i(0, -123);
              this.field_b.b(var2Lifetime1.field_n, 0);
              this.field_n.a(this.field_b.field_h.length, true, 0, this.field_b.field_h);
              this.field_m.a(var2Lifetime1, (byte) -95);
              var2Lifetime1 = (og) (this.field_f.a((byte) 112));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_n.b((byte) -59);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.field_i = 0;
                var4 = 0;
                if (this.field_d != null) {
                  if (this.field_d.field_v == 0) {
                    var4 = 1;
                  }
                } else {
                  var4 = 10;
                }
                if (var4 > 0) {
                  var5 = -this.field_j.field_j + var4;
                  if (var5 > var3_int) {
                    var5 = var3_int;
                  }
                  this.field_n.a(this.field_j.field_j, var5, this.field_j.field_h, 0);
                  if (this.field_c != 0) {
                    for (var6 = 0; var6 < var5; var6++) {
                      this.field_j.field_h[var6 + this.field_j.field_j] = (byte)rd.b((int) this.field_j.field_h[var6 + this.field_j.field_j], (int) this.field_c);
                    }
                  }
                  this.field_j.field_j = this.field_j.field_j + var5;
                  if (this.field_j.field_j >= var4) {
                    if (null != this.field_d) {
                      if (this.field_d.field_v != 0) {
                        throw new IOException();
                      }
                      if (this.field_j.field_h[0] == -1) {
                        this.field_j.field_j = 0;
                        this.field_d.field_v = 1;
                      } else {
                        this.field_d = null;
                      }
                    } else {
                      this.field_j.field_j = 0;
                      var6 = this.field_j.d((byte) -127);
                      var7 = this.field_j.c(param0 ^ -111);
                      var8 = this.field_j.d((byte) -117);
                      var9 = this.field_j.c(-121);
                      var10 = 127 & var8;
                      stackIn_65_0 = ((128 & var8) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_65_0;
                      var12 = (long)var7 + ((long)var6 << 32);
                      var14 = null;
                      if (var11 != 0) {
                        var14_ref = (og) (this.field_m.c((byte) 34));
                        while (var14_ref != null) {
                          if (var12 == var14_ref.field_n) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (og) (this.field_m.a((byte) 122));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (og) (this.field_l.c((byte) 34));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.field_n) {
                            break;
                          }
                          var14_ref = (og) (this.field_l.a((byte) 125));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_81_0 = (0 != var10) ? 9 : 5;
                      var15 = stackIn_81_0;
                      this.field_d = var14_ref;
                      this.field_d.field_w = new de(this.field_d.field_C + var9 + var15);
                      this.field_d.field_w.i(var10, -100);
                      this.field_d.field_w.h(-120, var9);
                      this.field_d.field_v = 10;
                      this.field_j.field_j = 0;
                    }
                  }
                } else {
                  var5 = this.field_d.field_w.field_h.length - this.field_d.field_C;
                  var6 = 512 - this.field_d.field_v;
                  if (var6 > -this.field_d.field_w.field_j + var5) {
                    var6 = var5 - this.field_d.field_w.field_j;
                  }
                  if (var6 > var3_int) {
                    var6 = var3_int;
                  }
                  this.field_n.a(this.field_d.field_w.field_j, var6, this.field_d.field_w.field_h, 0);
                  if (this.field_c != 0) {
                    for (var7 = 0; var6 > var7; var7++) {
                      this.field_d.field_w.field_h[var7 + this.field_d.field_w.field_j] = (byte)rd.b((int) this.field_d.field_w.field_h[var7 + this.field_d.field_w.field_j], (int) this.field_c);
                    }
                  }
                  this.field_d.field_w.field_j = this.field_d.field_w.field_j + var6;
                  this.field_d.field_v = this.field_d.field_v + var6;
                  if (this.field_d.field_w.field_j == var5) {
                    this.field_d.c((byte) -15);
                    this.field_d.field_q = false;
                    this.field_d = null;
                  } else {
                    if (512 == this.field_d.field_v) {
                      this.field_d.field_v = 0;
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
              this.field_n.a(param0 - 52);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_n = null;
            this.field_e = -2;
            this.field_h = this.field_h + 1;
            if (this.e(param0 - 1216122763) == 0 &&
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

    private final void a(int param0, boolean param1) {
        try {
          IOException iOException = null;
          de stackIn_4_0 = null;
          int stackIn_5_1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (null == this.field_n) {
            return;
          }
          try {
            this.field_b.field_j = 0;
            stackIn_4_0 = this.field_b;
            if (param1) {
              stackIn_5_1 = 2;
            } else {
              stackIn_5_1 = 3;
            }
            ((de) (Object) stackIn_4_0).i(stackIn_5_1, -98);
            this.field_b.b(0L, 0);
            this.field_n.a(this.field_b.field_h.length, true, 0, this.field_b.field_h);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_n.a(-103);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_e = -2;
            this.field_h = this.field_h + 1;
            this.field_n = null;
          }
          if (param0 < 58) {
            this.field_n = (gm) null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, Object param1, int param2) {
        try {
          RuntimeException stackIn_25_0 = null;
          StringBuilder stackIn_25_1 = null;
          String stackIn_26_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          og var4_ref = null;
          IOException var4_ref2 = null;
          int var4_int = 0;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          og var4_refLifetime1;
          var6 = ZombieDawn.field_J;
          try {
            if (this.field_n != null) {
              try {
                this.field_n.a(100);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_n = null;
            }
            this.field_n = (gm) (param1);
            this.f(-87);
            this.a(67, param0);
            this.field_j.field_j = 0;
            this.field_d = null;
            while (true) {
              var4_ref = (og) (this.field_l.a(116));
              if (var4_ref != null) {
                this.field_a.a(var4_ref, (byte) -120);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (og) (this.field_m.a(-61));
              if (var4_refLifetime1 != null) {
                this.field_f.a(var4_refLifetime1, (byte) -97);
                continue;
              }
              break;
            }
            if (0 != this.field_c) {
              try {
                this.field_b.field_j = 0;
                this.field_b.i(4, 29);
                this.field_b.i((int) this.field_c, -112);
                this.field_b.h(-104, 0);
                this.field_n.a(this.field_b.field_h.length, true, 0, this.field_b.field_h);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_n.a(69);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_n = null;
                this.field_e = -2;
                this.field_h = this.field_h + 1;
              }
            }
            var4_int = -50 % ((-1 - param2) / 63);
            this.field_i = 0;
            this.field_g = pd.a(-22826);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = var4_ref3;
            stackIn_25_1 = new StringBuilder().append("lh.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_26_2 = "null";
            } else {
              stackIn_26_2 = "{...}";
            }
            throw sh.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        try {
          this.field_n.a(123);
        } catch (Exception exception) {
        }
        this.field_e = -1;
        this.field_h = this.field_h + 1;
        this.field_n = null;
        this.field_c = (byte)(int)(1.0 + 255.0 * Math.random());
        if (param0 > -89) {
          this.field_n = (gm) null;
        }
    }

    final void d(int param0) {
        if (null != this.field_n) {
          this.field_n.a(108);
        }
        if (param0 != 31239) {
          this.a(-79, true);
        }
    }

    public lh() {
    }

    static {
    }
}
