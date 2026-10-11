/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class g extends w {
    static int field_s;
    private td field_v;
    static String field_t;
    static double field_u;

    public g() {
    }

    public static void a(boolean param0) {
        field_t = null;
        if (param0) {
          field_s = 92;
        }
    }

    final void a(Object param0, boolean param1, byte param2) {
        try {
          RuntimeException stackIn_29_0 = null;
          StringBuilder stackIn_29_1 = null;
          String stackIn_30_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          fk var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          fk var4_refLifetime1;
          var6 = fleas.field_A ? 1 : 0;
          try {
            if (null != this.field_v) {
              try {
                this.field_v.h(0);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_v = null;
            }
            if (param2 != 105) {
              return;
            }
            this.field_v = (td) (param0);
            this.g(-79);
            this.a(param2 + 5, param1);
            this.field_p = null;
            this.field_f.field_i = 0;
            while (true) {
              var4_ref = (fk) (this.field_q.a(param2 ^ -30));
              if (var4_ref != null) {
                this.field_o.a(var4_ref, -1089421886);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (fk) (this.field_h.a(-122));
              if (var4_refLifetime1 != null) {
                this.field_n.a(var4_refLifetime1, param2 ^ -1089421909);
                continue;
              }
              break;
            }
            if (this.field_g != 0) {
              try {
                this.field_d.field_i = 0;
                this.field_d.a(-11, 4);
                this.field_d.a(param2 - 116, (int) this.field_g);
                this.field_d.a(0, (byte) -58);
                this.field_v.a((byte) -117, this.field_d.field_k.length, 0, this.field_d.field_k);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_v.h(0);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_b = -2;
                this.field_c = this.field_c + 1;
                this.field_v = null;
              }
            }
            this.field_k = 0;
            this.field_m = lj.a((byte) -67);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_29_0 = var4_ref3;
            stackIn_29_1 = new StringBuilder().append("g.L(");
            if (param0 == null) {
              stackIn_30_2 = "null";
            } else {
              stackIn_30_2 = "{...}";
            }
            throw pf.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(')').toString());
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
          ni stackIn_6_0 = null;
          int stackIn_6_1 = 0;
          int stackIn_7_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.field_v == null) {
            return;
          }
          try {
            this.field_d.field_i = 0;
            if (param0 <= 48) {
              this.b((byte) 48);
            }
            stackIn_6_0 = this.field_d;
            stackIn_6_1 = -11;
            if (param1) {
              stackIn_7_2 = 2;
            } else {
              stackIn_7_2 = 3;
            }
            ((ni) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_7_2);
            this.field_d.a(0L, (byte) -39);
            this.field_v.a((byte) -118, this.field_d.field_k.length, 0, this.field_d.field_k);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_v.h(0);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_v = null;
            this.field_b = -2;
            this.field_c = this.field_c + 1;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0) {
        try {
          this.field_v.h(0);
        } catch (Exception exception) {
        }
        this.field_c = this.field_c + 1;
        this.field_b = -1;
        this.field_v = null;
        this.field_g = (byte)(int)(1.0 + Math.random() * 255.0);
        int var2 = 116 / ((param0 + 29) / 47);
    }

    final void d(int param0) {
        if (null != this.field_v) {
          this.field_v.h(param0 + 14835);
        }
        if (param0 != -14835) {
          this.d(-128);
        }
    }

    final static int[] a(byte param0, int param1, int param2) {
        int var3 = jc.a(param2, 116);
        int var4 = we.a((byte) 75, param2);
        int var5 = jc.a(param1, 117);
        int var6 = 104 % ((53 - param0) / 58);
        int var7 = we.a((byte) 101, param1);
        int var8 = (int)((long)var5 * (long)var3 >> 16);
        int var9 = (int)((long)var7 * (long)var3 >> 16);
        int var10 = (int)((long)var4 * (long)var5 >> 16);
        int var11 = (int)((long)var7 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var7, 0, var5, var8, var4, -var9, -var10, var3, var11};
    }

    private final void g(int param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (this.field_v == null) {
            return;
          }
          if (param0 > -33) {
            field_t = (String) null;
          }
          try {
            this.field_d.field_i = 0;
            this.field_d.a(-11, 6);
            this.field_d.a(false, 3);
            this.field_d.b((byte) 75, 0);
            this.field_v.a((byte) -117, this.field_d.field_k.length, 0, this.field_d.field_k);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_v.h(0);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_b = -2;
            this.field_v = null;
            this.field_c = this.field_c + 1;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean b(byte param0) {
        try {
          int var2_int = 0;
          int stackIn_50_0 = 0;
          int stackIn_66_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          fk var2 = null;
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
          fk var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          fk var2Lifetime1;
          var16 = fleas.field_A ? 1 : 0;
          if (null != this.field_v) {
            var2_long = lj.a((byte) -24);
            var4 = (int)(-this.field_m + var2_long);
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_m = var2_long;
            this.field_k = this.field_k + var4;
            if (this.field_k > 30000) {
              try {
                this.field_v.h(0);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_v = null;
            }
          }
          if (null == this.field_v) {
            if (this.f(1) != 0) {
              return false;
            }
            if (this.e(-53) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_v.c(0);
            var2 = (fk) (this.field_o.b((byte) 113));
            while (var2 != null) {
              this.field_d.field_i = 0;
              this.field_d.a(-11, 1);
              this.field_d.a(var2.field_j, (byte) -39);
              this.field_v.a((byte) -122, this.field_d.field_k.length, 0, this.field_d.field_k);
              this.field_q.a(var2, -1089421886);
              var2 = (fk) (this.field_o.c((byte) 67));
            }
            if (param0 != 66) {
              this.g(-76);
            }
            var2Lifetime1 = (fk) (this.field_n.b((byte) 120));
            while (var2Lifetime1 != null) {
              this.field_d.field_i = 0;
              this.field_d.a(-11, 0);
              this.field_d.a(var2Lifetime1.field_j, (byte) -39);
              this.field_v.a((byte) -103, this.field_d.field_k.length, 0, this.field_d.field_k);
              this.field_h.a(var2Lifetime1, -1089421886);
              var2Lifetime1 = (fk) (this.field_n.c((byte) 117));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_v.e(-120);
              if (0 > var3_int) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.field_k = 0;
                var4 = 0;
                if (this.field_p != null) {
                  if (this.field_p.field_y == 0) {
                    var4 = 1;
                  }
                } else {
                  var4 = 10;
                }
                if (var4 <= 0) {
                  var5 = this.field_p.field_A.field_k.length - this.field_p.field_E;
                  var6 = -this.field_p.field_y + 512;
                  if (var5 - this.field_p.field_A.field_i < var6) {
                    var6 = -this.field_p.field_A.field_i + var5;
                  }
                  if (var6 > var3_int) {
                    var6 = var3_int;
                  }
                  this.field_v.a(var6, this.field_p.field_A.field_k, this.field_p.field_A.field_i, false);
                  if (0 != this.field_g) {
                    for (var7 = 0; var7 < var6; var7++) {
                      this.field_p.field_A.field_k[var7 + this.field_p.field_A.field_i] = (byte)df.a((int) this.field_p.field_A.field_k[var7 + this.field_p.field_A.field_i], (int) this.field_g);
                    }
                  }
                  this.field_p.field_y = this.field_p.field_y + var6;
                  this.field_p.field_A.field_i = this.field_p.field_A.field_i + var6;
                  if (this.field_p.field_A.field_i == var5) {
                    this.field_p.e(-100);
                    this.field_p.field_q = false;
                    this.field_p = null;
                  } else {
                    if (512 == this.field_p.field_y) {
                      this.field_p.field_y = 0;
                    }
                  }
                } else {
                  var5 = var4 - this.field_f.field_i;
                  if (var3_int < var5) {
                    var5 = var3_int;
                  }
                  this.field_v.a(var5, this.field_f.field_k, this.field_f.field_i, false);
                  if (this.field_g != 0) {
                    for (var6 = 0; var6 < var5; var6++) {
                      this.field_f.field_k[var6 + this.field_f.field_i] = (byte)df.a((int) this.field_f.field_k[var6 + this.field_f.field_i], (int) this.field_g);
                    }
                  }
                  this.field_f.field_i = this.field_f.field_i + var5;
                  if (this.field_f.field_i >= var4) {
                    if (this.field_p != null) {
                      if (this.field_p.field_y != 0) {
                        throw new IOException();
                      }
                      if (this.field_f.field_k[0] == -1) {
                        this.field_f.field_i = 0;
                        this.field_p.field_y = 1;
                      } else {
                        this.field_p = null;
                      }
                    } else {
                      this.field_f.field_i = 0;
                      var6 = this.field_f.e(false);
                      var7 = this.field_f.c((byte) 25);
                      var8 = this.field_f.e(false);
                      var9 = this.field_f.c((byte) 124);
                      var10 = 127 & var8;
                      stackIn_50_0 = ((var8 & 128) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_50_0;
                      var12 = (long)var7 + ((long)var6 << 32);
                      var14 = null;
                      if (var11 != 0) {
                        var14_ref = (fk) (this.field_h.b((byte) 120));
                        while (var14_ref != null) {
                          if (~var14_ref.field_j == ~var12) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (fk) (this.field_h.c((byte) 97));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (fk) (this.field_q.b((byte) 117));
                        while (var14_ref != null) {
                          if (var12 == var14_ref.field_j) {
                            break;
                          }
                          var14_ref = (fk) (this.field_q.c((byte) 71));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_66_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_66_0;
                      this.field_p = var14_ref;
                      this.field_p.field_A = new ni(this.field_p.field_E + var9 + var15);
                      this.field_p.field_A.a(-11, var10);
                      this.field_p.field_A.a(var9, (byte) -106);
                      this.field_f.field_i = 0;
                      this.field_p.field_y = 10;
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
              this.field_v.h(0);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_c = this.field_c + 1;
            this.field_b = -2;
            this.field_v = null;
            if (0 == this.f(1) &&
              this.e(-64) == 0) {
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

    static {
        field_s = 0;
        field_t = "Fleas get in each others' way, and can even climb over each other. If you have too many fleas together, be careful, as they can sometimes overflow out of the confined space they are in. On some levels you need to do this to win!";
        field_u = 0.0;
    }
}
