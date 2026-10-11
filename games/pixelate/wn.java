/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wn extends rf {
    static ak field_t;
    static int field_u;
    static int field_r;
    private mo field_s;
    static int[] field_q;

    final void e(byte param0) {
        try {
          this.field_s.b(-1);
        } catch (Exception exception) {
        }
        this.field_h = this.field_h + 1;
        if (param0 != 0) {
          field_r = 79;
        }
        this.field_m = -1;
        this.field_s = null;
        this.field_a = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final static void d(int param0) {
        io.field_d = hm.a(64);
        if (param0 >= -11) {
          wn.c(16);
        }
        on.field_ob = 0;
    }

    final void a(Object param0, boolean param1, int param2) {
        try {
          RuntimeException stackIn_29_0 = null;
          StringBuilder stackIn_29_1 = null;
          String stackIn_30_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          rj var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          rj var4_refLifetime1;
          var6 = Pixelate.field_H ? 1 : 0;
          try {
            if (param2 != 8) {
              this.e(-125);
            }
            if (this.field_s != null) {
              try {
                this.field_s.b(-1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_s = null;
            }
            this.field_s = (mo) (param0);
            this.e(0);
            this.a((byte) 73, param1);
            this.field_g.field_m = 0;
            this.field_c = null;
            while (true) {
              var4_ref = (rj) (this.field_f.a((byte) 80));
              if (var4_ref != null) {
                this.field_e.a(param2 ^ 84, var4_ref);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (rj) (this.field_p.a((byte) 80));
              if (var4_refLifetime1 != null) {
                this.field_l.a(param2 + 104, var4_refLifetime1);
                continue;
              }
              break;
            }
            if (0 != this.field_a) {
              try {
                this.field_b.field_m = 0;
                this.field_b.e(160, 4);
                this.field_b.e(160, (int) this.field_a);
                this.field_b.d(0, param2 - 126);
                this.field_s.a(this.field_b.field_k.length, -89, 0, this.field_b.field_k);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_s.b(param2 ^ -9);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_h = this.field_h + 1;
                this.field_s = null;
                this.field_m = -2;
              }
            }
            this.field_o = 0;
            this.field_k = hm.a(64);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_29_0 = var4_ref3;
            stackIn_29_1 = new StringBuilder().append("wn.D(");
            if (param0 == null) {
              stackIn_30_2 = "null";
            } else {
              stackIn_30_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(boolean param0) {
        try {
          int var2_int = 0;
          int stackIn_50_0 = 0;
          int stackIn_66_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          rj var2 = null;
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
          rj var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          int var17 = 0;
          rj var2Lifetime1;
          var16 = Pixelate.field_H ? 1 : 0;
          if (null != this.field_s) {
            var2_long = hm.a(64);
            var4 = (int)(var2_long - this.field_k);
            this.field_k = var2_long;
            if (200 < var4) {
              var4 = 200;
            }
            this.field_o = this.field_o + var4;
            if (this.field_o > 30000) {
              try {
                this.field_s.b(-1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_s = null;
            }
          }
          if (this.field_s == null) {
            if (this.b(-97) != 0) {
              return false;
            }
            if (this.a((byte) 34) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_s.b((byte) -106);
            var2 = (rj) (this.field_e.c(61));
            while (var2 != null) {
              this.field_b.field_m = 0;
              this.field_b.e(160, 1);
              this.field_b.a(var2.field_q, 109);
              this.field_s.a(this.field_b.field_k.length, -118, 0, this.field_b.field_k);
              this.field_f.a(98, var2);
              var2 = (rj) (this.field_e.a(65151));
            }
            var2Lifetime1 = (rj) (this.field_l.c(72));
            while (var2Lifetime1 != null) {
              this.field_b.field_m = 0;
              this.field_b.e(160, 0);
              this.field_b.a(var2Lifetime1.field_q, 91);
              this.field_s.a(this.field_b.field_k.length, -113, 0, this.field_b.field_k);
              this.field_p.a(-114, var2Lifetime1);
              var2Lifetime1 = (rj) (this.field_l.a(65151));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_s.a(-73);
              if (0 > var3_int) {
                throw new IOException();
              }
              if (0 != var3_int) {
                this.field_o = 0;
                var4 = 0;
                if (null == this.field_c) {
                  var4 = 10;
                } else {
                  if (this.field_c.field_H == 0) {
                    var4 = 1;
                  }
                }
                if (0 >= var4) {
                  var5 = -this.field_c.field_B + this.field_c.field_D.field_k.length;
                  var6 = -this.field_c.field_H + 512;
                  if (var5 - this.field_c.field_D.field_m < var6) {
                    var6 = -this.field_c.field_D.field_m + var5;
                  }
                  if (var3_int < var6) {
                    var6 = var3_int;
                  }
                  this.field_s.a(this.field_c.field_D.field_k, this.field_c.field_D.field_m, (byte) 119, var6);
                  if (this.field_a != 0) {
                    var17 = 0;
                    var7 = var17;
                    while (var17 < var6) {
                      this.field_c.field_D.field_k[this.field_c.field_D.field_m + var17] = (byte)bn.a((int) this.field_c.field_D.field_k[this.field_c.field_D.field_m + var17], (int) this.field_a);
                      var17++;
                    }
                  }
                  this.field_c.field_H = this.field_c.field_H + var6;
                  this.field_c.field_D.field_m = this.field_c.field_D.field_m + var6;
                  if (var5 != this.field_c.field_D.field_m) {
                    if (this.field_c.field_H == 512) {
                      this.field_c.field_H = 0;
                    }
                  } else {
                    this.field_c.e(17);
                    this.field_c.field_v = false;
                    this.field_c = null;
                  }
                } else {
                  var5 = -this.field_g.field_m + var4;
                  if (var3_int < var5) {
                    var5 = var3_int;
                  }
                  this.field_s.a(this.field_g.field_k, this.field_g.field_m, (byte) 119, var5);
                  if (0 != this.field_a) {
                    for (var6 = 0; var5 > var6; var6++) {
                      this.field_g.field_k[var6 + this.field_g.field_m] = (byte)bn.a((int) this.field_g.field_k[var6 + this.field_g.field_m], (int) this.field_a);
                    }
                  }
                  this.field_g.field_m = this.field_g.field_m + var5;
                  if (var4 <= this.field_g.field_m) {
                    if (null == this.field_c) {
                      this.field_g.field_m = 0;
                      var6 = this.field_g.f(255);
                      var7 = this.field_g.k(0);
                      var8 = this.field_g.f(255);
                      var9 = this.field_g.k(0);
                      var10 = 127 & var8;
                      stackIn_50_0 = ((var8 & 128) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_50_0;
                      var12 = ((long)var6 << 32) + (long)var7;
                      var14 = null;
                      if (var11 == 0) {
                        var14_ref = (rj) (this.field_f.c(96));
                        while (var14_ref != null) {
                          if (~var14_ref.field_q == ~var12) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (rj) (this.field_f.a(65151));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (rj) (this.field_p.c(62));
                        while (var14_ref != null) {
                          if (var14_ref.field_q == var12) {
                            break;
                          }
                          var14_ref = (rj) (this.field_p.a(65151));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_66_0 = (var10 == 0) ? 5 : 9;
                      var15 = stackIn_66_0;
                      this.field_c = var14_ref;
                      this.field_c.field_D = new we(var15 + var9 + this.field_c.field_B);
                      this.field_c.field_D.e(160, var10);
                      this.field_c.field_D.d(var9, -59);
                      this.field_c.field_H = 10;
                      this.field_g.field_m = 0;
                    } else {
                      if (this.field_c.field_H != 0) {
                        throw new IOException();
                      }
                      if (this.field_g.field_k[0] == -1) {
                        this.field_c.field_H = 1;
                        this.field_g.field_m = 0;
                      } else {
                        this.field_c = null;
                      }
                    }
                  }
                }
                continue;
              }
              break;
            }
            if (param0) {
              wn.c(-11);
            }
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_s.b(-1);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_h = this.field_h + 1;
            this.field_s = null;
            this.field_m = -2;
            if (0 == this.b(-30) &&
              this.a((byte) 34) == 0) {
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

    public static void f(int param0) {
        field_q = null;
        field_t = null;
        if (param0 <= 60) {
          wn.d(81);
        }
    }

    private final void e(int param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (this.field_s == null) {
            return;
          }
          try {
            this.field_b.field_m = 0;
            this.field_b.e(160, 6);
            this.field_b.a(3, (byte) 109);
            this.field_b.b(1276387944, 0);
            this.field_s.a(this.field_b.field_k.length, param0 ^ -103, param0, this.field_b.field_k);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_s.b(-1);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_s = null;
            this.field_m = -2;
            this.field_h = this.field_h + 1;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void c(int param0) {
        int var2 = 0;
        pj[] var1 = null;
        pj var3 = null;
        int var4 = 0;
        pj[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          var5 = up.field_n;
          var1 = var5;
          for (var2 = param0; var5.length > var2; var2++) {
            var3 = var5[var2];
            var3.a(-110);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "wn.E(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        int var2 = -89 % ((param0 - 82) / 33);
        if (this.field_s != null) {
          this.field_s.b(-1);
        }
    }

    private final void a(byte param0, boolean param1) {
        try {
          IOException iOException = null;
          we stackIn_7_0 = null;
          int stackIn_7_1 = 0;
          int stackIn_8_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (param0 != 73) {
            return;
          }
          if (this.field_s == null) {
            return;
          }
          try {
            this.field_b.field_m = 0;
            stackIn_7_0 = this.field_b;
            stackIn_7_1 = 160;
            if (!param1) {
              stackIn_8_2 = 3;
            } else {
              stackIn_8_2 = 2;
            }
            ((we) (Object) stackIn_7_0).e(stackIn_7_1, stackIn_8_2);
            this.field_b.a(0L, -59);
            this.field_s.a(this.field_b.field_k.length, -85, 0, this.field_b.field_k);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_s.b(-1);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_h = this.field_h + 1;
            this.field_m = -2;
            this.field_s = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public wn() {
    }

    static {
        field_u = 256;
        field_q = new int[8192];
    }
}
