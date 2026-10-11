/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wh extends ona {
    private lpb field_p;
    static kb field_o;
    static int field_n;

    final boolean e(int param0) {
        try {
          int var2_int = 0;
          int stackIn_62_0 = 0;
          int stackIn_78_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          km var2 = null;
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
          km var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          km var2Lifetime1;
          var16 = VoidHunters.field_G;
          if (this.field_p != null) {
            var2_long = wt.a(false);
            var4 = (int)(var2_long - this.field_h);
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_h = var2_long;
            this.field_m = this.field_m + var4;
            if (this.field_m > 30000) {
              try {
                this.field_p.b(param0 + 1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_p = null;
            }
          }
          if (null == this.field_p) {
            if (0 != this.f(param0 ^ 13223)) {
              return false;
            }
            if (this.b(-3666) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_p.a((byte) 115);
            var2 = (km) (this.field_a.a((byte) -54));
            while (var2 != null) {
              this.field_e.field_e = 0;
              this.field_e.c(0, 1);
              this.field_e.a(117, var2.field_i);
              this.field_p.a(0, this.field_e.field_h, this.field_e.field_h.length, 0);
              this.field_d.a(var2, -84);
              var2 = (km) (this.field_a.a(param0 + 1900));
            }
            var2Lifetime1 = (km) (this.field_c.a((byte) -54));
            while (var2Lifetime1 != null) {
              this.field_e.field_e = 0;
              this.field_e.c(0, 0);
              this.field_e.a(100, var2Lifetime1.field_i);
              this.field_p.a(0, this.field_e.field_h, this.field_e.field_h.length, 0);
              this.field_f.a(var2Lifetime1, -65);
              var2Lifetime1 = (km) (this.field_c.a(1900));
            }
            for (var2_int = param0; var2_int < 100; var2_int++) {
              var3_int = this.field_p.c(0);
              if (0 > var3_int) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.field_m = 0;
                var4 = 0;
                if (null == this.field_b) {
                  var4 = 10;
                } else {
                  if (this.field_b.field_r == 0) {
                    var4 = 1;
                  }
                }
                if (0 < var4) {
                  var5 = -this.field_i.field_e + var4;
                  if (var5 > var3_int) {
                    var5 = var3_int;
                  }
                  this.field_p.a(-122, this.field_i.field_e, var5, this.field_i.field_h);
                  if (0 != this.field_j) {
                    for (var6 = 0; var6 < var5; var6++) {
                      this.field_i.field_h[this.field_i.field_e + var6] = (byte)mgb.a((int) this.field_i.field_h[this.field_i.field_e + var6], (int) this.field_j);
                    }
                  }
                  this.field_i.field_e = this.field_i.field_e + var5;
                  if (var4 <= this.field_i.field_e) {
                    if (this.field_b != null) {
                      if (0 != this.field_b.field_r) {
                        throw new IOException();
                      }
                      if (this.field_i.field_h[0] != -1) {
                        this.field_b = null;
                      } else {
                        this.field_i.field_e = 0;
                        this.field_b.field_r = 1;
                      }
                    } else {
                      this.field_i.field_e = 0;
                      var6 = this.field_i.e((byte) -126);
                      var7 = this.field_i.h(125);
                      var8 = this.field_i.e((byte) -125);
                      var9 = this.field_i.h(24);
                      var10 = var8 & 127;
                      stackIn_62_0 = ((128 & var8) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_62_0;
                      var12 = (long)var7 + ((long)var6 << 32);
                      var14 = null;
                      if (var11 == 0) {
                        var14_ref = (km) (this.field_d.a((byte) -54));
                        while (var14_ref != null) {
                          if (~var14_ref.field_i == ~var12) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (km) (this.field_d.a(1900));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (km) (this.field_f.a((byte) -54));
                        while (var14_ref != null) {
                          if (var14_ref.field_i == var12) {
                            break;
                          }
                          var14_ref = (km) (this.field_f.a(1900));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_78_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_78_0;
                      this.field_b = var14_ref;
                      this.field_b.field_p = new ds(this.field_b.field_q + var9 + var15);
                      this.field_b.field_p.c(0, var10);
                      this.field_b.field_p.d(var9, param0 + 332614536);
                      this.field_i.field_e = 0;
                      this.field_b.field_r = 10;
                    }
                  }
                } else {
                  var5 = -this.field_b.field_q + this.field_b.field_p.field_h.length;
                  var6 = 512 - this.field_b.field_r;
                  if (var6 > var5 - this.field_b.field_p.field_e) {
                    var6 = -this.field_b.field_p.field_e + var5;
                  }
                  if (var6 > var3_int) {
                    var6 = var3_int;
                  }
                  this.field_p.a(param0 ^ -126, this.field_b.field_p.field_e, var6, this.field_b.field_p.field_h);
                  if (this.field_j != 0) {
                    for (var7 = 0; var7 < var6; var7++) {
                      this.field_b.field_p.field_h[var7 + this.field_b.field_p.field_e] = (byte)mgb.a((int) this.field_b.field_p.field_h[var7 + this.field_b.field_p.field_e], (int) this.field_j);
                    }
                  }
                  this.field_b.field_r = this.field_b.field_r + var6;
                  this.field_b.field_p.field_e = this.field_b.field_p.field_e + var6;
                  if (var5 != this.field_b.field_p.field_e) {
                    if (this.field_b.field_r == 512) {
                      this.field_b.field_r = 0;
                    }
                  } else {
                    this.field_b.d((byte) -35);
                    this.field_b.field_n = false;
                    this.field_b = null;
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
              this.field_p.b(1);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_g = this.field_g + 1;
            this.field_p = null;
            this.field_k = -2;
            if (this.f(13223) == 0 &&
              this.b(param0 - 3666) == 0) {
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

    private final void a(byte param0, boolean param1) {
        try {
          IOException iOException = null;
          ds stackIn_6_0 = null;
          int stackIn_6_1 = 0;
          int stackIn_7_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (param0 != -65) {
            return;
          }
          if (this.field_p == null) {
            return;
          }
          try {
            this.field_e.field_e = 0;
            stackIn_6_0 = this.field_e;
            stackIn_6_1 = 0;
            if (param1) {
              stackIn_7_2 = 2;
            } else {
              stackIn_7_2 = 3;
            }
            ((ds) (Object) stackIn_6_0).c(stackIn_6_1, stackIn_7_2);
            this.field_e.a(param0 ^ -50, 0L);
            this.field_p.a(0, this.field_e.field_h, this.field_e.field_h.length, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_p.b(1);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_k = -2;
            this.field_g = this.field_g + 1;
            this.field_p = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(int param0) {
        field_o = null;
        if (param0 != 0) {
          wh.g(-53);
        }
    }

    private final void i(int param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (this.field_p == null) {
            return;
          }
          try {
            this.field_e.field_e = 0;
            this.field_e.c(0, 6);
            this.field_e.a(3, (byte) 125);
            this.field_e.a(0, true);
            this.field_p.a(param0 ^ param0, this.field_e.field_h, this.field_e.field_h.length, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_p.b(1);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_g = this.field_g + 1;
            this.field_p = null;
            this.field_k = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public wh() {
    }

    final void a(byte param0) {
        try {
          this.field_p.b(1);
        } catch (Exception exception) {
        }
        this.field_g = this.field_g + 1;
        this.field_p = null;
        this.field_k = -1;
        if (param0 != -25) {
          field_o = (kb) null;
        }
        this.field_j = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final static boolean g(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 > -113) {
          wh.a(-4, (byte) 35, 31);
        }
        stackIn_6_0 = (null != ov.field_o) && (sp.field_o == tc.field_c);
        return stackIn_6_0;
    }

    final static boolean a(int param0, byte param1, int param2) {
        boolean stackIn_6_0 = false;
        if (param1 < 90) {
          field_o = (kb) null;
        }
        stackIn_6_0 = ((2048 & param2) != 0) && (0 != (55 & param0));
        return stackIn_6_0;
    }

    final void a(int param0) {
        if (param0 <= 105) {
          field_n = 115;
        }
        if (null != this.field_p) {
          this.field_p.b(1);
        }
    }

    final void a(Object param0, boolean param1, boolean param2) {
        try {
          RuntimeException stackIn_27_0 = null;
          StringBuilder stackIn_27_1 = null;
          String stackIn_28_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          km var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          km var4_refLifetime1;
          var6 = VoidHunters.field_G;
          try {
            if (null != this.field_p) {
              try {
                this.field_p.b(1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_p = null;
            }
            this.field_p = (lpb) (param0);
            this.i(7571);
            this.a((byte) -65, param1);
            this.field_b = null;
            this.field_i.field_e = 0;
            while (true) {
              var4_ref = (km) (this.field_d.b((byte) 87));
              if (var4_ref != null) {
                this.field_a.a(var4_ref, -116);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (km) (this.field_f.b((byte) 109));
              if (var4_refLifetime1 != null) {
                this.field_c.a(var4_refLifetime1, -86);
                continue;
              }
              break;
            }
            if (0 != this.field_j) {
              try {
                this.field_e.field_e = 0;
                this.field_e.c(0, 4);
                this.field_e.c(0, (int) this.field_j);
                this.field_e.d(0, 332614536);
                this.field_p.a(0, this.field_e.field_h, this.field_e.field_h.length, 0);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_p.b(1);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_p = null;
                this.field_g = this.field_g + 1;
                this.field_k = -2;
              }
            }
            this.field_m = 0;
            if (param2) {
              wh.h(-98);
            }
            this.field_h = wt.a(param2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_27_0 = var4_ref3;
            stackIn_27_1 = new StringBuilder().append("wh.E(");
            if (param0 == null) {
              stackIn_28_2 = "null";
            } else {
              stackIn_28_2 = "{...}";
            }
            throw rta.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_o = new kb(2);
        field_n = 0;
    }
}
