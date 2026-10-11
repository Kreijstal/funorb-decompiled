/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class eg extends tk {
    static er[] field_r;
    static String field_t;
    private pm field_u;
    static String field_q;
    static int[][] field_s;

    final boolean d(int param0) {
        try {
          int var2_int = 0;
          int stackIn_50_0 = 0;
          int stackIn_66_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          ia var2 = null;
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
          ia var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          int var17 = 0;
          ia var2Lifetime1;
          var16 = Vertigo2.field_L ? 1 : 0;
          if (param0 != -3599) {
            field_q = (String) null;
          }
          if (this.field_u != null) {
            var2_long = gk.a(param0 + 3686);
            var4 = (int)(-this.field_k + var2_long);
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_k = var2_long;
            this.field_o = this.field_o + var4;
            if (this.field_o > 30000) {
              try {
                this.field_u.b(0);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_u = null;
            }
          }
          if (null == this.field_u) {
            if (this.d((byte) -109) != 0) {
              return false;
            }
            if (0 == this.b(param0 ^ 3598)) {
              return true;
            }
            return false;
          }
          try {
            this.field_u.c(-26206);
            var2 = (ia) (this.field_b.b((byte) -50));
            while (var2 != null) {
              this.field_f.field_u = 0;
              this.field_f.f(1, param0 ^ -3703);
              this.field_f.b((byte) 90, var2.field_n);
              this.field_u.a(0, this.field_f.field_p.length, param0 ^ -3646, this.field_f.field_p);
              this.field_a.a(false, var2);
              var2 = (ia) (this.field_b.a(true));
            }
            var2Lifetime1 = (ia) (this.field_d.b((byte) -50));
            while (var2Lifetime1 != null) {
              this.field_f.field_u = 0;
              this.field_f.f(0, 93);
              this.field_f.b((byte) 125, var2Lifetime1.field_n);
              this.field_u.a(0, this.field_f.field_p.length, -93, this.field_f.field_p);
              this.field_g.a(false, var2Lifetime1);
              var2Lifetime1 = (ia) (this.field_d.a(true));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_u.a(15166);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.field_o = 0;
                var4 = 0;
                if (null == this.field_h) {
                  var4 = 10;
                } else {
                  if (this.field_h.field_F == 0) {
                    var4 = 1;
                  }
                }
                if (var4 <= 0) {
                  var5 = this.field_h.field_J.field_p.length - this.field_h.field_B;
                  var6 = -this.field_h.field_F + 512;
                  if (var5 - this.field_h.field_J.field_u < var6) {
                    var6 = -this.field_h.field_J.field_u + var5;
                  }
                  if (var3_int < var6) {
                    var6 = var3_int;
                  }
                  this.field_u.a(this.field_h.field_J.field_p, false, var6, this.field_h.field_J.field_u);
                  if (this.field_l != 0) {
                    var17 = 0;
                    var7 = var17;
                    while (var17 < var6) {
                      this.field_h.field_J.field_p[this.field_h.field_J.field_u + var17] = (byte)tk.a((int) this.field_h.field_J.field_p[this.field_h.field_J.field_u + var17], (int) this.field_l);
                      var17++;
                    }
                  }
                  this.field_h.field_F = this.field_h.field_F + var6;
                  this.field_h.field_J.field_u = this.field_h.field_J.field_u + var6;
                  if (this.field_h.field_J.field_u != var5) {
                    if (this.field_h.field_F == 512) {
                      this.field_h.field_F = 0;
                    }
                  } else {
                    this.field_h.a(param0 ^ 3700);
                    this.field_h.field_z = false;
                    this.field_h = null;
                  }
                } else {
                  var5 = var4 - this.field_i.field_u;
                  if (var3_int < var5) {
                    var5 = var3_int;
                  }
                  this.field_u.a(this.field_i.field_p, false, var5, this.field_i.field_u);
                  if (this.field_l != 0) {
                    for (var6 = 0; var6 < var5; var6++) {
                      this.field_i.field_p[var6 + this.field_i.field_u] = (byte)tk.a((int) this.field_i.field_p[var6 + this.field_i.field_u], (int) this.field_l);
                    }
                  }
                  this.field_i.field_u = this.field_i.field_u + var5;
                  if (var4 <= this.field_i.field_u) {
                    if (this.field_h != null) {
                      if (this.field_h.field_F != 0) {
                        throw new IOException();
                      }
                      if (-1 != this.field_i.field_p[0]) {
                        this.field_h = null;
                      } else {
                        this.field_h.field_F = 1;
                        this.field_i.field_u = 0;
                      }
                    } else {
                      this.field_i.field_u = 0;
                      var6 = this.field_i.h(param0 + 3588);
                      var7 = this.field_i.b(true);
                      var8 = this.field_i.h(-11);
                      var9 = this.field_i.b(true);
                      var10 = var8 & 127;
                      stackIn_50_0 = ((128 & var8) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_50_0;
                      var12 = (long)var7 + ((long)var6 << 32);
                      var14 = null;
                      if (var11 == 0) {
                        var14_ref = (ia) (this.field_a.b((byte) -50));
                        while (var14_ref != null) {
                          if (~var14_ref.field_n == ~var12) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (ia) (this.field_a.a(true));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (ia) (this.field_g.b((byte) -50));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.field_n) {
                            break;
                          }
                          var14_ref = (ia) (this.field_g.a(true));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      this.field_h = var14_ref;
                      stackIn_66_0 = (0 == var10) ? 5 : 9;
                      var15 = stackIn_66_0;
                      this.field_h.field_J = new ed(var9 + (var15 + this.field_h.field_B));
                      this.field_h.field_J.f(var10, -127);
                      this.field_h.field_J.e(var9, param0 + 3599);
                      this.field_h.field_F = 10;
                      this.field_i.field_u = 0;
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
              this.field_u.b(param0 ^ -3599);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_m = this.field_m + 1;
            this.field_j = -2;
            this.field_u = null;
            if (this.d((byte) -102) == 0 &&
              this.b(-1) == 0) {
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

    final void a(Object param0, boolean param1, int param2) {
        try {
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          ia var4_ref = null;
          IOException var4_ref2 = null;
          int var4_int = 0;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          ia var4_refLifetime1;
          var6 = Vertigo2.field_L ? 1 : 0;
          try {
            if (this.field_u != null) {
              try {
                this.field_u.b(0);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_u = null;
            }
            this.field_u = (pm) (param0);
            this.g(0);
            this.a(param1, (byte) -50);
            this.field_h = null;
            this.field_i.field_u = 0;
            while (true) {
              var4_ref = (ia) (this.field_a.a(-67));
              if (var4_ref != null) {
                this.field_b.a(false, var4_ref);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (ia) (this.field_g.a(-75));
              if (var4_refLifetime1 != null) {
                this.field_d.a(false, var4_refLifetime1);
                continue;
              }
              break;
            }
            if (this.field_l != 0) {
              try {
                this.field_f.field_u = 0;
                this.field_f.f(4, -84);
                this.field_f.f((int) this.field_l, 115);
                this.field_f.e(0, 0);
                this.field_u.a(0, this.field_f.field_p.length, -87, this.field_f.field_p);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_u.b(0);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_m = this.field_m + 1;
                this.field_j = -2;
                this.field_u = null;
              }
            }
            this.field_o = 0;
            this.field_k = gk.a(111);
            var4_int = 76 / ((0 - param2) / 43);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var4_ref3;
            stackIn_24_1 = new StringBuilder().append("eg.G(");
            if (param0 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(int param0) {
        if (param0 != 3) {
          eg.h(116);
        }
        field_s = (int[][]) null;
        field_q = null;
        field_t = null;
        field_r = null;
    }

    final static boolean a(boolean param0, int param1, byte param2, int param3) {
        int var4;
        int var5;
        int var6;
        if (param0) {
          if (on.field_e[param1] < on.field_e[param3]) {
            return true;
          }
          if (on.field_e[param1] > on.field_e[param3]) {
            return false;
          }
          if (hm.field_A[param1] < hm.field_A[param3]) {
            return true;
          }
          if (hm.field_A[param1] > hm.field_A[param3]) {
            return false;
          }
        } else {
          if (hm.field_A[param3] > hm.field_A[param1]) {
            return true;
          }
          if (hm.field_A[param1] > hm.field_A[param3]) {
            return false;
          }
          if (on.field_e[param1] < on.field_e[param3]) {
            return true;
          }
          if (on.field_e[param3] < on.field_e[param1]) {
            return false;
          }
        }
        var4 = jf.field_N[param1] + li.field_g[param1] + ub.field_p[param1];
        var5 = jf.field_N[param3] + li.field_g[param3] + ub.field_p[param3];
        if (var5 > var4) {
          return true;
        }
        if (var5 < var4) {
          return false;
        }
        var6 = -30 / ((param2 - 0) / 39);
        return !(param3 <= param1);
    }

    private final void g(int param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (null == this.field_u) {
            return;
          }
          try {
            this.field_f.field_u = 0;
            this.field_f.f(6, 118);
            this.field_f.i(param0 ^ -1725083856, 3);
            this.field_f.d(0, param0 ^ -1783);
            this.field_u.a(param0, this.field_f.field_p.length, 34, this.field_f.field_p);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_u.b(param0 + 0);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_m = this.field_m + 1;
            this.field_u = null;
            this.field_j = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void e(int param0) {
        try {
          this.field_u.b(param0);
        } catch (Exception exception) {
        }
        this.field_u = null;
        this.field_m = this.field_m + 1;
        this.field_j = -1;
        this.field_l = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final static void a(int param0, ra param1) {
        if (param0 <= 76) {
          return;
        }
        try {
          il.field_g.b(param1);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "eg.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public eg() {
    }

    final void b(byte param0) {
        if (null != this.field_u) {
          this.field_u.b(0);
        }
        if (param0 != 9) {
          field_q = (String) null;
        }
    }

    private final void a(boolean param0, byte param1) {
        try {
          IOException iOException = null;
          ed stackIn_7_0 = null;
          int stackIn_8_1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.field_u == null) {
            return;
          }
          try {
            this.field_f.field_u = 0;
            if (param1 >= 0) {
              field_s = (int[][]) null;
            }
            stackIn_7_0 = this.field_f;
            if (!param0) {
              stackIn_8_1 = 3;
            } else {
              stackIn_8_1 = 2;
            }
            ((ed) (Object) stackIn_7_0).f(stackIn_8_1, 100);
            this.field_f.b((byte) 50, 0L);
            this.field_u.a(0, this.field_f.field_p.length, 26, this.field_f.field_p);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_u.b(0);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_m = this.field_m + 1;
            this.field_j = -2;
            this.field_u = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_t = null;
        field_q = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_s = new int[][]{new int[]{0, 0, 1, 6}, new int[]{0, 0, 1, 7}, new int[]{0, 0, 1, 5, 2, 2}, new int[]{0, 1, 1, 7, 2, 2}};
    }
}
