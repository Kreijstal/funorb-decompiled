/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kg extends h {
    private tf field_p;
    static boolean field_q;
    static ci[] field_r;

    private final void a(int param0, boolean param1) {
        try {
          IOException iOException = null;
          dh stackIn_5_0 = null;
          int stackIn_6_1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (null == this.field_p) {
            return;
          }
          try {
            this.field_e.field_k = 0;
            stackIn_5_0 = this.field_e;
            if (param1) {
              stackIn_6_1 = 2;
            } else {
              stackIn_6_1 = 3;
            }
            ((dh) (Object) stackIn_5_0).i(stackIn_6_1, param0 - 99);
            this.field_e.b((long)param0, -2108648176);
            this.field_p.a(this.field_e.field_i.length, 0, (byte) -97, this.field_e.field_i);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_p.a((byte) -127);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_i = this.field_i + 1;
            this.field_p = null;
            this.field_l = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, Object param1, boolean param2) {
        try {
          RuntimeException stackIn_25_0 = null;
          StringBuilder stackIn_25_1 = null;
          String stackIn_26_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          nh var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          nh var4_refLifetime1;
          var6 = Terraphoenix.field_V;
          try {
            if (null != this.field_p) {
              try {
                this.field_p.a((byte) -127);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_p = null;
            }
            this.field_p = (tf) (param1);
            this.d(false);
            this.a(0, param2);
            this.field_k = null;
            this.field_o.field_k = 0;
            while (true) {
              var4_ref = (nh) (this.field_m.a((byte) -66));
              if (var4_ref != null) {
                this.field_b.a(param0 + 1456354992, var4_ref);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (nh) (this.field_g.a((byte) -61));
              if (var4_refLifetime1 != null) {
                this.field_a.a(param0 ^ -1456349328, var4_refLifetime1);
                continue;
              }
              break;
            }
            if (this.field_n != 0) {
              try {
                this.field_e.field_k = 0;
                this.field_e.i(4, -90);
                this.field_e.i((int) this.field_n, 68);
                this.field_e.e(0, 8959);
                this.field_p.a(this.field_e.field_i.length, 0, (byte) -97, this.field_e.field_i);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_p.a((byte) -123);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_p = null;
                this.field_l = -2;
                this.field_i = this.field_i + 1;
              }
            }
            this.field_h = 0;
            this.field_f = ll.a(1000);
            if (param0 != -1456343840) {
              field_q = false;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = var4_ref3;
            stackIn_25_1 = new StringBuilder().append("kg.H(").append(param0).append(',');
            if (param1 == null) {
              stackIn_26_2 = "null";
            } else {
              stackIn_26_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        if (param0 > -94) {
          field_r = (ci[]) null;
        }
        if (null != this.field_p) {
          this.field_p.a((byte) -126);
        }
    }

    private final void d(boolean param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (null == this.field_p) {
            return;
          }
          if (param0) {
            this.b(-29);
          }
          try {
            this.field_e.field_k = 0;
            this.field_e.i(6, -108);
            this.field_e.a(3, (byte) -89);
            this.field_e.h(-1564407352, 0);
            this.field_p.a(this.field_e.field_i.length, 0, (byte) -97, this.field_e.field_i);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_p.a((byte) -122);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_i = this.field_i + 1;
            this.field_l = -2;
            this.field_p = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0) {
        try {
          this.field_p.a((byte) -124);
        } catch (Exception exception) {
        }
        this.field_i = this.field_i + 1;
        this.field_l = -1;
        if (param0 != -12948) {
          this.d(true);
        }
        this.field_p = null;
        this.field_n = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final boolean c(boolean param0) {
        try {
          int var2_int = 0;
          int stackIn_43_0 = 0;
          int stackIn_59_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          nh var2 = null;
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
          nh var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          nh var2Lifetime1;
          var16 = Terraphoenix.field_V;
          if (null != this.field_p) {
            var2_long = ll.a(1000);
            var4 = (int)(var2_long - this.field_f);
            if (200 < var4) {
              var4 = 200;
            }
            this.field_f = var2_long;
            this.field_h = this.field_h + var4;
            if (this.field_h > 30000) {
              try {
                this.field_p.a((byte) 71);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_p = null;
            }
          }
          if (this.field_p == null) {
            if (this.c(96) == 0 &&
              0 == this.a((byte) -103)) {
              return true;
            }
            return false;
          }
          try {
            this.field_p.c(10509);
            var2 = (nh) (this.field_b.c(8192));
            while (var2 != null) {
              this.field_e.field_k = 0;
              this.field_e.i(1, -115);
              this.field_e.b(var2.field_m, -2108648176);
              this.field_p.a(this.field_e.field_i.length, 0, (byte) -97, this.field_e.field_i);
              this.field_m.a(11152, var2);
              var2 = (nh) (this.field_b.a(6273));
            }
            var2Lifetime1 = (nh) (this.field_a.c(8192));
            while (var2Lifetime1 != null) {
              this.field_e.field_k = 0;
              this.field_e.i(0, -124);
              this.field_e.b(var2Lifetime1.field_m, -2108648176);
              this.field_p.a(this.field_e.field_i.length, 0, (byte) -97, this.field_e.field_i);
              this.field_g.a(11152, var2Lifetime1);
              var2Lifetime1 = (nh) (this.field_a.a(6273));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_p.a(0);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (0 != var3_int) {
                this.field_h = 0;
                var4 = 0;
                if (null != this.field_k) {
                  if (this.field_k.field_F == 0) {
                    var4 = 1;
                  }
                } else {
                  var4 = 10;
                }
                if (var4 <= 0) {
                  var5 = this.field_k.field_H.field_i.length - this.field_k.field_G;
                  var6 = -this.field_k.field_F + 512;
                  if (var6 > var5 - this.field_k.field_H.field_k) {
                    var6 = var5 - this.field_k.field_H.field_k;
                  }
                  if (var3_int < var6) {
                    var6 = var3_int;
                  }
                  this.field_p.a(this.field_k.field_H.field_i, var6, this.field_k.field_H.field_k, (byte) 117);
                  if (this.field_n != 0) {
                    for (var7 = 0; var7 < var6; var7++) {
                      this.field_k.field_H.field_i[var7 + this.field_k.field_H.field_k] = (byte)sl.a((int) this.field_k.field_H.field_i[var7 + this.field_k.field_H.field_k], (int) this.field_n);
                    }
                  }
                  this.field_k.field_F = this.field_k.field_F + var6;
                  this.field_k.field_H.field_k = this.field_k.field_H.field_k + var6;
                  if (this.field_k.field_H.field_k != var5) {
                    if (512 == this.field_k.field_F) {
                      this.field_k.field_F = 0;
                    }
                  } else {
                    this.field_k.c((byte) 13);
                    this.field_k.field_A = false;
                    this.field_k = null;
                  }
                } else {
                  var5 = -this.field_o.field_k + var4;
                  if (var5 > var3_int) {
                    var5 = var3_int;
                  }
                  this.field_p.a(this.field_o.field_i, var5, this.field_o.field_k, (byte) 101);
                  if (this.field_n != 0) {
                    for (var6 = 0; var5 > var6; var6++) {
                      this.field_o.field_i[this.field_o.field_k + var6] = (byte)sl.a((int) this.field_o.field_i[this.field_o.field_k + var6], (int) this.field_n);
                    }
                  }
                  this.field_o.field_k = this.field_o.field_k + var5;
                  if (var4 <= this.field_o.field_k) {
                    if (this.field_k != null) {
                      if (this.field_k.field_F != 0) {
                        throw new IOException();
                      }
                      if (-1 != this.field_o.field_i[0]) {
                        this.field_k = null;
                      } else {
                        this.field_o.field_k = 0;
                        this.field_k.field_F = 1;
                      }
                    } else {
                      this.field_o.field_k = 0;
                      var6 = this.field_o.a(-16384);
                      var7 = this.field_o.f((byte) -107);
                      var8 = this.field_o.a(-16384);
                      var9 = this.field_o.f((byte) -107);
                      var10 = 127 & var8;
                      stackIn_43_0 = (0 == (128 & var8)) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_43_0;
                      var12 = (long)var7 + ((long)var6 << 32);
                      var14 = null;
                      if (var11 != 0) {
                        var14_ref = (nh) (this.field_g.c(8192));
                        while (var14_ref != null) {
                          if (var12 == var14_ref.field_m) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (nh) (this.field_g.a(6273));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (nh) (this.field_m.c(8192));
                        while (var14_ref != null) {
                          if (var14_ref.field_m == var12) {
                            break;
                          }
                          var14_ref = (nh) (this.field_m.a(6273));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_59_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_59_0;
                      this.field_k = var14_ref;
                      this.field_k.field_H = new dh(this.field_k.field_G + (var15 + var9));
                      this.field_k.field_H.i(var10, 89);
                      this.field_k.field_H.e(var9, 8959);
                      this.field_k.field_F = 10;
                      this.field_o.field_k = 0;
                    }
                  }
                }
                continue;
              }
              break;
            }
            if (param0) {
              return true;
            }
            field_r = (ci[]) null;
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_p.a((byte) 116);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_l = -2;
            this.field_p = null;
            this.field_i = this.field_i + 1;
            if (this.c(79) == 0 &&
              this.a((byte) -103) == 0) {
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

    public kg() {
    }

    public static void e(int param0) {
        if (param0 != 7087) {
          kg.e(96);
        }
        field_r = null;
    }

    static {
    }
}
