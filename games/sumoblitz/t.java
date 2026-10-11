/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class t extends gd {
    static boolean[] field_p;
    private dt field_r;
    static String field_s;
    static int field_q;

    final void a(boolean param0, byte param1, Object param2) {
        try {
          RuntimeException stackIn_27_0 = null;
          StringBuilder stackIn_27_1 = null;
          String stackIn_28_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          fv var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          fv var4_refLifetime1;
          var6 = Sumoblitz.field_L ? 1 : 0;
          try {
            if (this.field_r != null) {
              try {
                this.field_r.a((byte) -67);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_r = null;
            }
            this.field_r = (dt) (param2);
            this.e(0);
            this.a(71, param0);
            this.field_i = null;
            this.field_b.field_p = 0;
            while (true) {
              var4_ref = (fv) (this.field_h.b((byte) 72));
              if (var4_ref != null) {
                this.field_l.a((pj) (var4_ref), (byte) -128);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (fv) (this.field_g.b((byte) 72));
              if (var4_refLifetime1 != null) {
                this.field_f.a((pj) (var4_refLifetime1), (byte) -101);
                continue;
              }
              break;
            }
            if (param1 <= 90) {
              return;
            }
            if (this.field_m != 0) {
              try {
                this.field_n.field_p = 0;
                this.field_n.b((byte) 89, 4);
                this.field_n.b((byte) 36, (int) this.field_m);
                this.field_n.e(48, 0);
                this.field_r.a(0, -2, this.field_n.field_n, this.field_n.field_n.length);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_r.a((byte) -73);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_r = null;
                this.field_j = -2;
                this.field_d = this.field_d + 1;
              }
            }
            this.field_c = 0;
            this.field_e = wq.a(-78);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_27_0 = var4_ref3;
            stackIn_27_1 = new StringBuilder().append("t.F(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_28_2 = "null";
            } else {
              stackIn_28_2 = "{...}";
            }
            throw qo.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f(int param0) {
        field_p = null;
        field_s = null;
        if (param0 != 1) {
          t.f(-122);
        }
    }

    final void b(int param0) {
        try {
          this.field_r.a((byte) -65);
        } catch (Exception exception) {
        }
        this.field_j = -1;
        this.field_d = this.field_d + 1;
        this.field_r = null;
        this.field_m = (byte)(int)(1.0 + Math.random() * 255.0);
        if (param0 != 14702) {
          field_q = -47;
        }
    }

    final boolean c(byte param0) {
        try {
          int var2_int = 0;
          int stackIn_65_0 = 0;
          int stackIn_81_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          fv var2 = null;
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
          fv var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          fv var2Lifetime1;
          var16 = Sumoblitz.field_L ? 1 : 0;
          if (param0 <= 78) {
            return false;
          }
          if (this.field_r != null) {
            var2_long = wq.a(-113);
            var4 = (int)(var2_long - this.field_e);
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_e = var2_long;
            this.field_c = this.field_c + var4;
            if (30000 < this.field_c) {
              try {
                this.field_r.a((byte) -72);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_r = null;
            }
          }
          if (this.field_r == null) {
            if (this.d(-2115911413) != 0) {
              return false;
            }
            if (0 == this.a((byte) -86)) {
              return true;
            }
            return false;
          }
          try {
            this.field_r.b(-120);
            var2 = (fv) (this.field_l.a(32));
            while (var2 != null) {
              this.field_n.field_p = 0;
              this.field_n.b((byte) 55, 1);
              this.field_n.b(var2.field_l, 1105594440);
              this.field_r.a(0, -2, this.field_n.field_n, this.field_n.field_n.length);
              this.field_h.a((pj) (var2), (byte) -107);
              var2 = (fv) (this.field_l.d(-2));
            }
            var2Lifetime1 = (fv) (this.field_f.a(37));
            while (var2Lifetime1 != null) {
              this.field_n.field_p = 0;
              this.field_n.b((byte) 86, 0);
              this.field_n.b(var2Lifetime1.field_l, 1105594440);
              this.field_r.a(0, -2, this.field_n.field_n, this.field_n.field_n.length);
              this.field_g.a((pj) (var2Lifetime1), (byte) -103);
              var2Lifetime1 = (fv) (this.field_f.d(-2));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_r.c(-128);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.field_c = 0;
                var4 = 0;
                if (this.field_i == null) {
                  var4 = 10;
                } else {
                  if (0 == this.field_i.field_x) {
                    var4 = 1;
                  }
                }
                if (var4 > 0) {
                  var5 = -this.field_b.field_p + var4;
                  if (var3_int < var5) {
                    var5 = var3_int;
                  }
                  this.field_r.a(-114, this.field_b.field_p, var5, this.field_b.field_n);
                  if (0 != this.field_m) {
                    for (var6 = 0; var6 < var5; var6++) {
                      this.field_b.field_n[var6 + this.field_b.field_p] = (byte)jg.a((int) this.field_b.field_n[var6 + this.field_b.field_p], (int) this.field_m);
                    }
                  }
                  this.field_b.field_p = this.field_b.field_p + var5;
                  if (this.field_b.field_p >= var4) {
                    if (null == this.field_i) {
                      this.field_b.field_p = 0;
                      var6 = this.field_b.e(-31302);
                      var7 = this.field_b.c(true);
                      var8 = this.field_b.e(-31302);
                      var9 = this.field_b.c(true);
                      var10 = 127 & var8;
                      stackIn_65_0 = (0 == (128 & var8)) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_65_0;
                      var12 = ((long)var6 << 32) + (long)var7;
                      var14 = null;
                      if (var11 != 0) {
                        var14_ref = (fv) (this.field_g.a(64));
                        while (var14_ref != null) {
                          if (var14_ref.field_l == var12) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (fv) (this.field_g.d(-2));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (fv) (this.field_h.a(66));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.field_l) {
                            break;
                          }
                          var14_ref = (fv) (this.field_h.d(-2));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_81_0 = (0 == var10) ? 5 : 9;
                      var15 = stackIn_81_0;
                      this.field_i = var14_ref;
                      this.field_i.field_w = new fs(this.field_i.field_z + var15 + var9);
                      this.field_i.field_w.b((byte) 37, var10);
                      this.field_i.field_w.e(48, var9);
                      this.field_i.field_x = 10;
                      this.field_b.field_p = 0;
                    } else {
                      if (0 != this.field_i.field_x) {
                        throw new IOException();
                      }
                      if (this.field_b.field_n[0] == -1) {
                        this.field_i.field_x = 1;
                        this.field_b.field_p = 0;
                      } else {
                        this.field_i = null;
                      }
                    }
                  }
                } else {
                  var5 = this.field_i.field_w.field_n.length - this.field_i.field_z;
                  var6 = -this.field_i.field_x + 512;
                  if (var6 > var5 - this.field_i.field_w.field_p) {
                    var6 = var5 - this.field_i.field_w.field_p;
                  }
                  if (var3_int < var6) {
                    var6 = var3_int;
                  }
                  this.field_r.a(-115, this.field_i.field_w.field_p, var6, this.field_i.field_w.field_n);
                  if (this.field_m != 0) {
                    for (var7 = 0; var7 < var6; var7++) {
                      this.field_i.field_w.field_n[this.field_i.field_w.field_p + var7] = (byte)jg.a((int) this.field_i.field_w.field_n[this.field_i.field_w.field_p + var7], (int) this.field_m);
                    }
                  }
                  this.field_i.field_x = this.field_i.field_x + var6;
                  this.field_i.field_w.field_p = this.field_i.field_w.field_p + var6;
                  if (var5 != this.field_i.field_w.field_p) {
                    if (this.field_i.field_x == 512) {
                      this.field_i.field_x = 0;
                    }
                  } else {
                    this.field_i.c(-5106);
                    this.field_i.field_u = false;
                    this.field_i = null;
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
              this.field_r.a((byte) -60);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_r = null;
            this.field_d = this.field_d + 1;
            this.field_j = -2;
            if (0 == this.d(-2115911413) &&
              this.a((byte) -122) == 0) {
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
          fs stackIn_5_0 = null;
          int stackIn_5_1 = 0;
          int stackIn_6_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.field_r == null) {
            return;
          }
          try {
            this.field_n.field_p = 0;
            stackIn_5_0 = this.field_n;
            stackIn_5_1 = 46;
            if (!param1) {
              stackIn_6_2 = 3;
            } else {
              stackIn_6_2 = 2;
            }
            ((fs) (Object) stackIn_5_0).b((byte) stackIn_5_1, stackIn_6_2);
            this.field_n.b(0L, 1105594440);
            if (param0 < 63) {
              return;
            }
            this.field_r.a(0, -2, this.field_n.field_n, this.field_n.field_n.length);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_r.a((byte) -93);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_j = -2;
            this.field_d = this.field_d + 1;
            this.field_r = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void e(int param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (this.field_r == null) {
            return;
          }
          try {
            this.field_n.field_p = param0;
            this.field_n.b((byte) 19, 6);
            this.field_n.d(3, param0 + 102);
            this.field_n.b(param0 + 127, 0);
            this.field_r.a(0, -2, this.field_n.field_n, this.field_n.field_n.length);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_r.a((byte) -94);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_d = this.field_d + 1;
            this.field_j = -2;
            this.field_r = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public t() {
    }

    final void c(int param0) {
        if (param0 > -61) {
          field_q = 32;
        }
        if (null != this.field_r) {
          this.field_r.a((byte) -46);
        }
    }

    static {
        field_p = new boolean[25];
        field_s = null;
    }
}
