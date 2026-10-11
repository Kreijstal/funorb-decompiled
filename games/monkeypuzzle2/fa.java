/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fa extends wl {
    static int field_r;
    static int field_p;
    private id field_o;
    static int field_q;

    private final void a(boolean param0, byte param1) {
        try {
          IOException iOException = null;
          Object var5 = null;
          gk stackIn_5_0 = null;
          int stackIn_6_1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (null == this.field_o) {
            return;
          }
          try {
            this.field_l.field_h = 0;
            stackIn_5_0 = this.field_l;
            if (!param0) {
              stackIn_6_1 = 3;
            } else {
              stackIn_6_1 = 2;
            }
            ((gk) (Object) stackIn_5_0).b(stackIn_6_1, -49152);
            this.field_l.a(0L, -1268490168);
            this.field_o.a(this.field_l.field_g, 0, (byte) 46, this.field_l.field_g.length);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_o.a((byte) 73);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_b = this.field_b + 1;
            this.field_a = -2;
            this.field_o = null;
          }
          if (param1 != 109) {
            var5 = (Object) null;
            this.a(-90, false, (Object) null);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        try {
          this.field_o.a((byte) 73);
          if (param0 != 20) {
            this.field_o = (id) null;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        this.field_b = this.field_b + 1;
        this.field_o = null;
        this.field_a = -1;
        this.field_m = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    final boolean a(byte param0) {
        try {
          int var2_int = 0;
          int stackIn_63_0 = 0;
          int stackIn_79_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          ob var2 = null;
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
          ob var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          ob var2Lifetime1;
          var16 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (this.field_o != null) {
            var2_long = pf.a(0);
            var4 = (int)(-this.field_e + var2_long);
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_e = var2_long;
            this.field_h = this.field_h + var4;
            if (this.field_h > 30000) {
              try {
                this.field_o.a((byte) 73);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_o = null;
            }
          }
          if (this.field_o == null) {
            if (this.c(24547) == 0 &&
              this.d((byte) -25) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_o.b((byte) 86);
            var2 = (ob) (this.field_n.a(true));
            while (var2 != null) {
              this.field_l.field_h = 0;
              this.field_l.b(1, -49152);
              this.field_l.a(var2.field_f, -1268490168);
              this.field_o.a(this.field_l.field_g, 0, (byte) 80, this.field_l.field_g.length);
              this.field_j.a(var2, (byte) 95);
              var2 = (ob) (this.field_n.c((byte) -75));
            }
            var2Lifetime1 = (ob) (this.field_i.a(true));
            while (var2Lifetime1 != null) {
              this.field_l.field_h = 0;
              this.field_l.b(0, -49152);
              this.field_l.a(var2Lifetime1.field_f, -1268490168);
              this.field_o.a(this.field_l.field_g, 0, (byte) 83, this.field_l.field_g.length);
              this.field_c.a(var2Lifetime1, (byte) 127);
              var2Lifetime1 = (ob) (this.field_i.c((byte) -75));
            }
            if (param0 >= -33) {
              this.b((byte) -60);
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_o.c(126);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int == 0) {
                return true;
              }
              this.field_h = 0;
              var4 = 0;
              if (null != this.field_k) {
                if (this.field_k.field_p == 0) {
                  var4 = 1;
                }
              } else {
                var4 = 10;
              }
              if (var4 > 0) {
                var5 = -this.field_g.field_h + var4;
                if (var3_int < var5) {
                  var5 = var3_int;
                }
                this.field_o.a(var5, true, this.field_g.field_g, this.field_g.field_h);
                if (this.field_m != 0) {
                  for (var6 = 0; var5 > var6; var6++) {
                    this.field_g.field_g[this.field_g.field_h + var6] = (byte)gi.a((int) this.field_g.field_g[this.field_g.field_h + var6], (int) this.field_m);
                  }
                }
                this.field_g.field_h = this.field_g.field_h + var5;
                if (var4 <= this.field_g.field_h) {
                  if (this.field_k == null) {
                    this.field_g.field_h = 0;
                    var6 = this.field_g.a((byte) 114);
                    var7 = this.field_g.e(14);
                    var8 = this.field_g.a((byte) 114);
                    var9 = this.field_g.e(-107);
                    var10 = 127 & var8;
                    stackIn_63_0 = ((128 & var8) == 0) ? 0 : 1;
                    boolean decompiledFrameRemainder0 = true;
                    boolean decompiledFrameCompleted0 = true;
                    var11 = stackIn_63_0;
                    var12 = ((long)var6 << 32) + (long)var7;
                    var14 = null;
                    if (var11 != 0) {
                      var14_ref = (ob) (this.field_c.a(true));
                      while (var14_ref != null) {
                        if (var12 == var14_ref.field_f) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        var14_ref = (ob) (this.field_c.c((byte) -75));
                      }
                      decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                    }
                    if ((decompiledFrameRemainder0) &&
                      (decompiledFrameCompleted0)) {
                      var14_ref = (ob) (this.field_j.a(true));
                      while (var14_ref != null) {
                        if (~var12 == ~var14_ref.field_f) {
                          break;
                        }
                        var14_ref = (ob) (this.field_j.c((byte) -75));
                      }
                    }
                    if (var14_ref == null) {
                      throw new IOException();
                    }
                    this.field_k = var14_ref;
                    stackIn_79_0 = (var10 != 0) ? 9 : 5;
                    var15 = stackIn_79_0;
                    this.field_k.field_o = new gk(this.field_k.field_q + var9 + var15);
                    this.field_k.field_o.b(var10, -49152);
                    this.field_k.field_o.a(-803539344, var9);
                    this.field_g.field_h = 0;
                    this.field_k.field_p = 10;
                  } else {
                    if (0 != this.field_k.field_p) {
                      throw new IOException();
                    }
                    if (-1 != this.field_g.field_g[0]) {
                      this.field_k = null;
                    } else {
                      this.field_g.field_h = 0;
                      this.field_k.field_p = 1;
                    }
                  }
                }
              } else {
                var5 = this.field_k.field_o.field_g.length - this.field_k.field_q;
                var6 = 512 - this.field_k.field_p;
                if (-this.field_k.field_o.field_h + var5 < var6) {
                  var6 = -this.field_k.field_o.field_h + var5;
                }
                if (var6 > var3_int) {
                  var6 = var3_int;
                }
                this.field_o.a(var6, true, this.field_k.field_o.field_g, this.field_k.field_o.field_h);
                if (this.field_m != 0) {
                  for (var7 = 0; var7 < var6; var7++) {
                    this.field_k.field_o.field_g[this.field_k.field_o.field_h + var7] = (byte)gi.a((int) this.field_k.field_o.field_g[this.field_k.field_o.field_h + var7], (int) this.field_m);
                  }
                }
                this.field_k.field_p = this.field_k.field_p + var6;
                this.field_k.field_o.field_h = this.field_k.field_o.field_h + var6;
                if (this.field_k.field_o.field_h == var5) {
                  this.field_k.a(7847);
                  this.field_k.field_j = false;
                  this.field_k = null;
                } else {
                  if (this.field_k.field_p == 512) {
                    this.field_k.field_p = 0;
                  }
                }
              }
            }
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_o.a((byte) 73);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_b = this.field_b + 1;
            this.field_o = null;
            this.field_a = -2;
            if (this.c(24547) == 0 &&
              this.d((byte) -25) == 0) {
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

    final void a(int param0, boolean param1, Object param2) {
        try {
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          ob var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          ob var4_refLifetime1;
          var6 = MonkeyPuzzle2.field_F ? 1 : 0;
          try {
            if (this.field_o != null) {
              try {
                this.field_o.a((byte) 73);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_o = null;
            }
            this.field_o = (id) (param2);
            this.e(-1);
            this.a(param1, (byte) 109);
            this.field_k = null;
            this.field_g.field_h = 0;
            while (true) {
              var4_ref = (ob) (this.field_j.a((byte) -120));
              if (var4_ref != null) {
                this.field_n.a(var4_ref, (byte) -108);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (ob) (this.field_c.a((byte) -120));
              if (var4_refLifetime1 != null) {
                this.field_i.a(var4_refLifetime1, (byte) -9);
                continue;
              }
              break;
            }
            if (this.field_m != 0) {
              try {
                this.field_l.field_h = 0;
                this.field_l.b(4, -49152);
                this.field_l.b((int) this.field_m, -49152);
                this.field_l.a(-803539344, 0);
                this.field_o.a(this.field_l.field_g, 0, (byte) 57, this.field_l.field_g.length);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_o.a((byte) 73);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_o = null;
                this.field_a = -2;
                this.field_b = this.field_b + 1;
              }
            }
            if (param0 >= -84) {
              field_r = 64;
            }
            this.field_h = 0;
            this.field_e = pf.a(0);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var4_ref3;
            stackIn_26_1 = new StringBuilder().append("fa.E(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw la.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        if (this.field_o != null) {
          this.field_o.a((byte) 73);
        }
        if (param0 != 7) {
          this.a(false, (byte) -93);
        }
    }

    public fa() {
    }

    private final void e(int param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (param0 != -1) {
            return;
          }
          if (this.field_o == null) {
            return;
          }
          try {
            this.field_l.field_h = 0;
            this.field_l.b(6, -49152);
            this.field_l.e(param0 + 122, 3);
            this.field_l.c(0, 113);
            this.field_o.a(this.field_l.field_g, 0, (byte) 23, this.field_l.field_g.length);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_o.a((byte) 73);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_b = this.field_b + 1;
            this.field_a = -2;
            this.field_o = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void f(int param0) {
        int var2 = 0;
        he var3 = (he) (mb.field_e.a((byte) -117));
        he var1 = var3;
        if (var1 != null) {
          var2 = em.field_B;
          lb.a(10, pl.field_j, (byte) -128, wc.field_e, var2, ii.field_B);
          ie.field_b[var3.field_h].b(25, var2 + 15);
          pl.field_e.a(rb.field_hb[var3.field_h], 67, var2 + 15, pl.field_j - 72, ii.field_B - 30, 1, -1, 1, 1, pl.field_e.field_C + pl.field_e.field_D);
        }
        if (param0 != 1) {
          fa.f(47);
        }
    }

    static {
        field_r = 0;
    }
}
