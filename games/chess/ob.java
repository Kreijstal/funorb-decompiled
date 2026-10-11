/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ob extends wm {
    static int field_t;
    static hg field_v;
    static String field_r;
    static int field_C;
    static String field_y;
    static boolean field_w;
    static String field_z;
    static int[] field_u;
    private hn field_s;
    static rk field_B;
    static String field_x;
    static String field_A;

    public static void b(boolean param0) {
        if (param0) {
          field_z = (String) null;
        }
        field_B = null;
        field_x = null;
        field_r = null;
        field_y = null;
        field_z = null;
        field_u = null;
        field_v = null;
        field_A = null;
    }

    final static void f(int param0) {
        int var1_int = 0;
        int var2 = Chess.field_G;
        int var1_intLifetime1;
        try {
          v.field_e.b((byte) 40);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            vj.field_f[var1_int] = 0L;
          }
          for (var1_intLifetime1 = param0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            fi.field_d[var1_intLifetime1] = 0L;
          }
          hk.field_M = 0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ob.P(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        if (param0 != -103) {
          field_t = -117;
        }
        if (null != this.field_s) {
          this.field_s.a(-1);
        }
    }

    final void a(byte param0, Object param1, boolean param2) {
        try {
          RuntimeException stackIn_28_0 = null;
          StringBuilder stackIn_28_1 = null;
          String stackIn_29_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          cc var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          cc var4_refLifetime1;
          var6 = Chess.field_G;
          try {
            if (null != this.field_s) {
              try {
                this.field_s.a(-1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_s = null;
            }
            this.field_s = (hn) (param1);
            this.c((byte) 67);
            this.a(param2, true);
            this.field_h = null;
            this.field_a.field_l = 0;
            while (true) {
              var4_ref = (cc) (this.field_e.a((byte) -75));
              if (var4_ref != null) {
                this.field_o.a(0, var4_ref);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (cc) (this.field_p.a((byte) -75));
              if (var4_refLifetime1 != null) {
                this.field_f.a(0, var4_refLifetime1);
                continue;
              }
              break;
            }
            if (this.field_k != 0) {
              try {
                this.field_l.field_l = 0;
                this.field_l.c(4, (byte) 83);
                this.field_l.c((int) this.field_k, (byte) 57);
                this.field_l.d(0, (byte) -81);
                this.field_s.a(0, this.field_l.field_o.length, (byte) -92, this.field_l.field_o);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_s.a(-1);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_g = this.field_g + 1;
                this.field_c = -2;
                this.field_s = null;
              }
            }
            this.field_m = 0;
            if (param0 != 45) {
              return;
            }
            this.field_d = ud.a(2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_28_0 = var4_ref3;
            stackIn_28_1 = new StringBuilder().append("ob.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_29_2 = "null";
            } else {
              stackIn_29_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0) {
        try {
          if (param0 != 0) {
            this.c((byte) -61);
          }
          this.field_s.a(~param0);
        } catch (Exception exception) {
        }
        this.field_c = -1;
        this.field_s = null;
        this.field_g = this.field_g + 1;
        this.field_k = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    private final void c(byte param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (null == this.field_s) {
            return;
          }
          try {
            this.field_l.field_l = 0;
            this.field_l.c(6, (byte) 51);
            this.field_l.c(param0 ^ -68, 3);
            this.field_l.b(0, 93);
            if (param0 != 67) {
              return;
            }
            this.field_s.a(0, this.field_l.field_o.length, (byte) -92, this.field_l.field_o);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_s.a(-1);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_s = null;
            this.field_g = this.field_g + 1;
            this.field_c = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String d(byte param0) {
        if (ci.field_ub == g.field_a) {
          return jd.field_d;
        }
        if (ci.field_ub == vl.field_A) {
          return lc.field_e;
        }
        if (param0 > -98) {
          ob.d((byte) 73);
        }
        if (!pi.field_c.b((byte) 107)) {
          return lc.field_e;
        }
        return pi.field_a;
    }

    private final void a(boolean param0, boolean param1) {
        try {
          IOException iOException = null;
          p stackIn_5_0 = null;
          int stackIn_6_1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.field_s == null) {
            return;
          }
          try {
            this.field_l.field_l = 0;
            stackIn_5_0 = this.field_l;
            if (!param0) {
              stackIn_6_1 = 3;
            } else {
              stackIn_6_1 = 2;
            }
            ((p) (Object) stackIn_5_0).c(stackIn_6_1, (byte) -65);
            if (!param1) {
              return;
            }
            this.field_l.a(0L, 1392038664);
            this.field_s.a(0, this.field_l.field_o.length, (byte) -92, this.field_l.field_o);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_s.a(-1);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_c = -2;
            this.field_g = this.field_g + 1;
            this.field_s = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean b(int param0) {
        try {
          int var2_int = 0;
          int stackIn_51_0 = 0;
          int stackIn_66_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          cc var2 = null;
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
          cc var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          cc var2Lifetime1;
          var16 = Chess.field_G;
          if (this.field_s != null) {
            var2_long = ud.a(2);
            var4 = (int)(var2_long - this.field_d);
            this.field_d = var2_long;
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_m = this.field_m + var4;
            if (this.field_m > 30000) {
              try {
                this.field_s.a(-1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_s = null;
            }
          }
          if (null == this.field_s) {
            if (0 != this.d(param0 ^ -17145)) {
              return false;
            }
            if (this.a(-3151) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_s.a((byte) -41);
            var2 = (cc) (this.field_o.b(-22585));
            if (param0 != -31259) {
              return true;
            }
            while (var2 != null) {
              this.field_l.field_l = 0;
              this.field_l.c(1, (byte) -52);
              this.field_l.a(var2.field_l, 1392038664);
              this.field_s.a(0, this.field_l.field_o.length, (byte) -92, this.field_l.field_o);
              this.field_e.a(0, var2);
              var2 = (cc) (this.field_o.b((byte) -73));
            }
            var2Lifetime1 = (cc) (this.field_f.b(-22585));
            while (var2Lifetime1 != null) {
              this.field_l.field_l = 0;
              this.field_l.c(0, (byte) -110);
              this.field_l.a(var2Lifetime1.field_l, 1392038664);
              this.field_s.a(0, this.field_l.field_o.length, (byte) -92, this.field_l.field_o);
              this.field_p.a(0, var2Lifetime1);
              var2Lifetime1 = (cc) (this.field_f.b((byte) -93));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_s.c(0);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.field_m = 0;
                var4 = 0;
                if (this.field_h == null) {
                  var4 = 10;
                } else {
                  if (this.field_h.field_w == 0) {
                    var4 = 1;
                  }
                }
                if (0 >= var4) {
                  var5 = -this.field_h.field_x + this.field_h.field_y.field_o.length;
                  var6 = 512 - this.field_h.field_w;
                  if (var6 > -this.field_h.field_y.field_l + var5) {
                    var6 = var5 - this.field_h.field_y.field_l;
                  }
                  if (var3_int < var6) {
                    var6 = var3_int;
                  }
                  this.field_s.a(this.field_h.field_y.field_o, var6, (byte) -87, this.field_h.field_y.field_l);
                  if (this.field_k != 0) {
                    for (var7 = 0; var7 < var6; var7++) {
                      this.field_h.field_y.field_o[var7 + this.field_h.field_y.field_l] = (byte)dm.a((int) this.field_h.field_y.field_o[var7 + this.field_h.field_y.field_l], (int) this.field_k);
                    }
                  }
                  this.field_h.field_y.field_l = this.field_h.field_y.field_l + var6;
                  this.field_h.field_w = this.field_h.field_w + var6;
                  if (this.field_h.field_y.field_l == var5) {
                    this.field_h.d(-1);
                    this.field_h.field_s = false;
                    this.field_h = null;
                  } else {
                    if (this.field_h.field_w == 512) {
                      this.field_h.field_w = 0;
                    }
                  }
                } else {
                  var5 = -this.field_a.field_l + var4;
                  if (var5 > var3_int) {
                    var5 = var3_int;
                  }
                  this.field_s.a(this.field_a.field_o, var5, (byte) -87, this.field_a.field_l);
                  if (this.field_k != 0) {
                    for (var6 = 0; var5 > var6; var6++) {
                      this.field_a.field_o[var6 + this.field_a.field_l] = (byte)dm.a((int) this.field_a.field_o[var6 + this.field_a.field_l], (int) this.field_k);
                    }
                  }
                  this.field_a.field_l = this.field_a.field_l + var5;
                  if (var4 <= this.field_a.field_l) {
                    if (this.field_h == null) {
                      this.field_a.field_l = 0;
                      var6 = this.field_a.i(-102);
                      var7 = this.field_a.e((byte) -99);
                      var8 = this.field_a.i(-126);
                      var9 = this.field_a.e((byte) -110);
                      var10 = 127 & var8;
                      stackIn_51_0 = ((128 & var8) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_51_0;
                      var12 = (long)var7 + ((long)var6 << 32);
                      var14 = null;
                      if (var11 == 0) {
                        var14_ref = (cc) (this.field_e.b(-22585));
                        while (var14_ref != null) {
                          if (~var14_ref.field_l == ~var12) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (cc) (this.field_e.b((byte) -106));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (cc) (this.field_p.b(-22585));
                        while (var14_ref != null) {
                          if (~var14_ref.field_l == ~var12) {
                            break;
                          }
                          var14_ref = (cc) (this.field_p.b((byte) -73));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_66_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_66_0;
                      this.field_h = var14_ref;
                      this.field_h.field_y = new p(var9 + var15 + this.field_h.field_x);
                      this.field_h.field_y.c(var10, (byte) 90);
                      this.field_h.field_y.d(var9, (byte) -81);
                      this.field_a.field_l = 0;
                      this.field_h.field_w = 10;
                    } else {
                      if (this.field_h.field_w != 0) {
                        throw new IOException();
                      }
                      if (this.field_a.field_o[0] == -1) {
                        this.field_a.field_l = 0;
                        this.field_h.field_w = 1;
                      } else {
                        this.field_h = null;
                      }
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
              this.field_s.a(param0 ^ 31258);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_g = this.field_g + 1;
            this.field_c = -2;
            this.field_s = null;
            if (this.d(14562) == 0 &&
              0 == this.a(param0 + 28108)) {
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

    public ob() {
    }

    static {
        field_t = 2;
        field_r = "Game options";
        field_y = "Quick Chat Help";
        field_v = new hg(10, 2, 2, 0);
        field_u = new int[8192];
        field_x = "You have not yet unlocked this option for use.";
        field_A = "(1 player wants to join)";
    }
}
