/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sl extends na {
    static si[] field_o;
    private hi field_p;
    static int field_r;
    static ji[] field_q;

    final void a(boolean param0) {
        try {
          this.field_p.b((byte) 76);
        } catch (Exception exception) {
        }
        this.field_p = null;
        this.field_k = this.field_k + 1;
        this.field_n = -1;
        this.field_h = (byte)(int)(1.0 + 255.0 * Math.random());
        if (!param0) {
          field_o = (si[]) null;
        }
    }

    final static vi d(byte param0) {
        if (param0 <= 124) {
          sl.e(-10);
        }
        return ol.field_c;
    }

    final boolean b(byte param0) {
        try {
          int var2_int = 0;
          int stackIn_47_0 = 0;
          int stackIn_63_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          fi var2 = null;
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
          fi var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          int var17 = 0;
          fi var2Lifetime1;
          var16 = wizardrun.field_H;
          if (null != this.field_p) {
            var2_long = d.a((byte) 79);
            var4 = (int)(var2_long - this.field_d);
            if (200 < var4) {
              var4 = 200;
            }
            this.field_d = var2_long;
            this.field_f = this.field_f + var4;
            if (this.field_f > 30000) {
              try {
                this.field_p.b((byte) 76);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_p = null;
            }
          }
          if (null == this.field_p) {
            if (this.d(-14289) != 0) {
              return false;
            }
            if (this.c((byte) -96) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_p.a(param0 ^ 0);
            var2 = (fi) (this.field_b.a(0));
            while (var2 != null) {
              this.field_i.field_m = 0;
              this.field_i.b((byte) 11, 1);
              this.field_i.a(var2.field_o, (byte) 122);
              this.field_p.a(this.field_i.field_k.length, this.field_i.field_k, 1, 0);
              this.field_a.a(var2, 14);
              var2 = (fi) (this.field_b.d(14));
            }
            if (param0 != 0) {
              return false;
            }
            var2Lifetime1 = (fi) (this.field_j.a(0));
            while (var2Lifetime1 != null) {
              this.field_i.field_m = 0;
              this.field_i.b((byte) 11, 0);
              this.field_i.a(var2Lifetime1.field_o, (byte) 123);
              this.field_p.a(this.field_i.field_k.length, this.field_i.field_k, 1, 0);
              this.field_m.a(var2Lifetime1, 14);
              var2Lifetime1 = (fi) (this.field_j.d(94));
            }
            for (var2_int = 0; 100 > var2_int; var2_int++) {
              var3_int = this.field_p.c((byte) 89);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.field_f = 0;
                var4 = 0;
                if (null == this.field_c) {
                  var4 = 10;
                } else {
                  if (0 == this.field_c.field_z) {
                    var4 = 1;
                  }
                }
                if (var4 <= 0) {
                  var5 = this.field_c.field_C.field_k.length - this.field_c.field_D;
                  var6 = 512 - this.field_c.field_z;
                  if (var5 - this.field_c.field_C.field_m < var6) {
                    var6 = var5 - this.field_c.field_C.field_m;
                  }
                  if (var6 > var3_int) {
                    var6 = var3_int;
                  }
                  this.field_p.a(this.field_c.field_C.field_k, -124, var6, this.field_c.field_C.field_m);
                  if (this.field_h != 0) {
                    var17 = 0;
                    var7 = var17;
                    while (var17 < var6) {
                      this.field_c.field_C.field_k[this.field_c.field_C.field_m + var17] = (byte)sg.a((int) this.field_c.field_C.field_k[this.field_c.field_C.field_m + var17], (int) this.field_h);
                      var17++;
                    }
                  }
                  this.field_c.field_C.field_m = this.field_c.field_C.field_m + var6;
                  this.field_c.field_z = this.field_c.field_z + var6;
                  if (this.field_c.field_C.field_m != var5) {
                    if (this.field_c.field_z == 512) {
                      this.field_c.field_z = 0;
                    }
                  } else {
                    this.field_c.b(false);
                    this.field_c.field_s = false;
                    this.field_c = null;
                  }
                } else {
                  var5 = var4 - this.field_g.field_m;
                  if (var3_int < var5) {
                    var5 = var3_int;
                  }
                  this.field_p.a(this.field_g.field_k, param0 - 105, var5, this.field_g.field_m);
                  if (this.field_h != 0) {
                    for (var6 = 0; var5 > var6; var6++) {
                      this.field_g.field_k[this.field_g.field_m + var6] = (byte)sg.a((int) this.field_g.field_k[this.field_g.field_m + var6], (int) this.field_h);
                    }
                  }
                  this.field_g.field_m = this.field_g.field_m + var5;
                  if (this.field_g.field_m >= var4) {
                    if (null == this.field_c) {
                      this.field_g.field_m = 0;
                      var6 = this.field_g.f(255);
                      var7 = this.field_g.i(param0 ^ 255);
                      var8 = this.field_g.f(255);
                      var9 = this.field_g.i(255);
                      var10 = var8 & 127;
                      stackIn_47_0 = ((128 & var8) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_47_0;
                      var12 = ((long)var6 << 32) + (long)var7;
                      var14 = null;
                      if (var11 == 0) {
                        var14_ref = (fi) (this.field_a.a(0));
                        while (var14_ref != null) {
                          if (var12 == var14_ref.field_o) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (fi) (this.field_a.d(42));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (fi) (this.field_m.a(0));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.field_o) {
                            break;
                          }
                          var14_ref = (fi) (this.field_m.d(87));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_63_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_63_0;
                      this.field_c = var14_ref;
                      this.field_c.field_C = new va(this.field_c.field_D + var9 + var15);
                      this.field_c.field_C.b((byte) 11, var10);
                      this.field_c.field_C.f(var9, 613003928);
                      this.field_c.field_z = 10;
                      this.field_g.field_m = 0;
                    } else {
                      if (0 != this.field_c.field_z) {
                        throw new IOException();
                      }
                      if (this.field_g.field_k[0] == -1) {
                        this.field_g.field_m = 0;
                        this.field_c.field_z = 1;
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
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_p.b((byte) 76);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_k = this.field_k + 1;
            this.field_p = null;
            this.field_n = -2;
            if (0 == this.d(param0 - 14289) &&
              this.c((byte) -74) == 0) {
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

    private final void f(int param0) {
        try {
          IOException iOException = null;
          int var2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          var2 = 66 / ((17 - param0) / 48);
          if (null == this.field_p) {
            return;
          }
          try {
            this.field_i.field_m = 0;
            this.field_i.b((byte) 11, 6);
            this.field_i.a(3, false);
            this.field_i.b(-1947079288, 0);
            this.field_p.a(this.field_i.field_k.length, this.field_i.field_k, 1, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_p.b((byte) 76);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_n = -2;
            this.field_k = this.field_k + 1;
            this.field_p = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 >= -126) {
          return;
        }
        sf.field_h = 7;
        hk.field_Y = param1;
        n.field_c = param0;
    }

    final void a(byte param0) {
        if (null != this.field_p) {
          this.field_p.b((byte) 76);
        }
        if (param0 > -73) {
          field_q = (ji[]) null;
        }
    }

    public static void e(int param0) {
        field_q = null;
        field_o = null;
        if (param0 != -1) {
          sl.a(-54, 7, -58);
        }
    }

    final static o g(int param0) {
        int var4_int = 0;
        int var5 = wizardrun.field_H;
        int var1 = tf.field_b[0] * cg.field_k[0];
        byte[] var2 = mf.field_j[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
          var3[var4_int] = ic.field_b[kl.b((int) var2[var4_int], 255)];
        }
        o var4 = new o(hk.field_bb, eg.field_v, ph.field_q[0], ne.field_h[0], cg.field_k[param0], tf.field_b[0], var3);
        eb.a(param0 ^ 0);
        return var4;
    }

    private final void a(int param0, boolean param1) {
        try {
          IOException iOException = null;
          va stackIn_6_0 = null;
          int stackIn_6_1 = 0;
          int stackIn_7_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (null == this.field_p) {
            return;
          }
          try {
            if (param0 != 3) {
              this.field_p = (hi) null;
            }
            this.field_i.field_m = 0;
            stackIn_6_0 = this.field_i;
            stackIn_6_1 = 11;
            if (param1) {
              stackIn_7_2 = 2;
            } else {
              stackIn_7_2 = 3;
            }
            ((va) (Object) stackIn_6_0).b((byte) stackIn_6_1, stackIn_7_2);
            this.field_i.a(0L, (byte) 106);
            this.field_p.a(this.field_i.field_k.length, this.field_i.field_k, param0 ^ 2, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_p.b((byte) 76);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_k = this.field_k + 1;
            this.field_p = null;
            this.field_n = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public sl() {
    }

    final void a(boolean param0, Object param1, int param2) {
        try {
          RuntimeException stackIn_27_0 = null;
          StringBuilder stackIn_27_1 = null;
          String stackIn_28_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          fi var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          fi var4_refLifetime1;
          var6 = wizardrun.field_H;
          try {
            if (null != this.field_p) {
              try {
                this.field_p.b((byte) 76);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_p = null;
            }
            if (param2 <= 118) {
              return;
            }
            this.field_p = (hi) (param1);
            this.f(-73);
            this.a(3, param0);
            this.field_g.field_m = 0;
            this.field_c = null;
            while (true) {
              var4_ref = (fi) (this.field_a.b(58));
              if (var4_ref != null) {
                this.field_b.a(var4_ref, 14);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (fi) (this.field_m.b(70));
              if (var4_refLifetime1 != null) {
                this.field_j.a(var4_refLifetime1, 14);
                continue;
              }
              break;
            }
            if (this.field_h != 0) {
              try {
                this.field_i.field_m = 0;
                this.field_i.b((byte) 11, 4);
                this.field_i.b((byte) 11, (int) this.field_h);
                this.field_i.f(0, 613003928);
                this.field_p.a(this.field_i.field_k.length, this.field_i.field_k, 1, 0);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_p.b((byte) 76);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_k = this.field_k + 1;
                this.field_n = -2;
                this.field_p = null;
              }
            }
            this.field_f = 0;
            this.field_d = d.a((byte) 50);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_27_0 = var4_ref3;
            stackIn_27_1 = new StringBuilder().append("sl.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_28_2 = "null";
            } else {
              stackIn_28_2 = "{...}";
            }
            throw bd.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
