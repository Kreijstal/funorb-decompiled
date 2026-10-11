/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ef extends lk {
    static String field_s;
    static int field_t;
    static String field_v;
    static String field_q;
    private k field_w;
    static boolean field_r;
    static vn field_u;

    final void a(byte param0) {
        try {
          this.field_w.d(param0 ^ -23482);
        } catch (Exception exception) {
        }
        this.field_o = -1;
        if (param0 != 0) {
          field_q = (String) null;
        }
        this.field_w = null;
        this.field_i = this.field_i + 1;
        this.field_a = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    private final void a(int param0, boolean param1) {
        try {
          IOException iOException = null;
          Object var5 = null;
          wk stackIn_7_0 = null;
          int stackIn_8_1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.field_w == null) {
            return;
          }
          try {
            if (param0 >= -41) {
              var5 = (Object) null;
              this.a(false, true, (Object) null);
            }
            this.field_c.field_g = 0;
            stackIn_7_0 = this.field_c;
            if (!param1) {
              stackIn_8_1 = 3;
            } else {
              stackIn_8_1 = 2;
            }
            ((wk) (Object) stackIn_7_0).f(stackIn_8_1, (byte) -62);
            this.field_c.a((byte) -118, 0L);
            this.field_w.a(this.field_c.field_j.length, 0, (byte) 122, this.field_c.field_j);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_w.d(-23482);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_o = -2;
            this.field_i = this.field_i + 1;
            this.field_w = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0) {
        if (param0 != 16711422) {
          return;
        }
        if (null != this.field_w) {
          this.field_w.d(param0 ^ -16688456);
        }
    }

    final void a(boolean param0, boolean param1, Object param2) {
        try {
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          vk var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          vk var4_refLifetime1;
          var6 = ArcanistsMulti.field_G ? 1 : 0;
          try {
            if (this.field_w != null) {
              try {
                this.field_w.d(-23482);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_w = null;
            }
            this.field_w = (k) (param2);
            this.d((byte) 113);
            this.a(-101, param0);
            this.field_n = null;
            this.field_e.field_g = 0;
            while (true) {
              var4_ref = (vk) (this.field_g.a((byte) 118));
              if (var4_ref != null) {
                this.field_b.a(var4_ref, 15893);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (vk) (this.field_m.a((byte) 124));
              if (var4_refLifetime1 != null) {
                this.field_f.a(var4_refLifetime1, 15893);
                continue;
              }
              break;
            }
            if (this.field_a != 0) {
              try {
                this.field_c.field_g = 0;
                this.field_c.f(4, (byte) -116);
                this.field_c.f((int) this.field_a, (byte) -67);
                this.field_c.a(0, (byte) -101);
                this.field_w.a(this.field_c.field_j.length, 0, (byte) 122, this.field_c.field_j);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_w.d(-23482);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_i = this.field_i + 1;
                this.field_o = -2;
                this.field_w = null;
              }
            }
            this.field_k = 0;
            if (!param1) {
              field_q = (String) null;
            }
            this.field_p = qj.b(-26572);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var4_ref3;
            stackIn_26_1 = new StringBuilder().append("ef.G(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ll a(int[] param0, byte param1, ll param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ll var4 = null;
        ll stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 15 / ((param1 - 29) / 49);
          var4 = new ll(0, 0, 0);
          var4.field_m = param2.field_m;
          var4.field_j = param2.field_j;
          var4.field_f = param2.field_f;
          var4.field_k = param2.field_k;
          var4.field_l = param0;
          var4.field_c = param2.field_c;
          var4.field_h = param2.field_h;
          var4.field_g = param2.field_g;
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ef.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean e(int param0) {
        try {
          int var2_int = 0;
          int stackIn_53_0 = 0;
          int stackIn_70_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          vk var2 = null;
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
          vk var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          int var17 = 0;
          vk var2Lifetime1;
          var16 = ArcanistsMulti.field_G ? 1 : 0;
          if (this.field_w != null) {
            var2_long = qj.b(-26572);
            var4 = (int)(-this.field_p + var2_long);
            this.field_p = var2_long;
            if (200 < var4) {
              var4 = 200;
            }
            this.field_k = this.field_k + var4;
            if (this.field_k > 30000) {
              try {
                this.field_w.d(-23482);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_w = null;
            }
          }
          if (null == this.field_w) {
            if (this.b((byte) 88) != 0) {
              return false;
            }
            if (this.a(-89) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_w.a(false);
            var2 = (vk) (this.field_b.b(96));
            while (var2 != null) {
              this.field_c.field_g = 0;
              this.field_c.f(1, (byte) -64);
              this.field_c.a((byte) -127, var2.field_k);
              this.field_w.a(this.field_c.field_j.length, 0, (byte) 116, this.field_c.field_j);
              this.field_g.a(var2, 15893);
              var2 = (vk) (this.field_b.e(-30));
            }
            if (param0 != -3145) {
              this.c(80);
            }
            var2Lifetime1 = (vk) (this.field_f.b(63));
            while (var2Lifetime1 != null) {
              this.field_c.field_g = 0;
              this.field_c.f(0, (byte) -68);
              this.field_c.a((byte) -121, var2Lifetime1.field_k);
              this.field_w.a(this.field_c.field_j.length, 0, (byte) 116, this.field_c.field_j);
              this.field_m.a(var2Lifetime1, 15893);
              var2Lifetime1 = (vk) (this.field_f.e(param0 + 3265));
            }
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3_int = this.field_w.b(param0 ^ -3145);
              if (0 > var3_int) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.field_k = 0;
                var4 = 0;
                if (null == this.field_n) {
                  var4 = 10;
                } else {
                  if (this.field_n.field_x == 0) {
                    var4 = 1;
                  }
                }
                if (var4 <= 0) {
                  var5 = this.field_n.field_A.field_j.length - this.field_n.field_y;
                  var6 = -this.field_n.field_x + 512;
                  if (var6 > -this.field_n.field_A.field_g + var5) {
                    var6 = -this.field_n.field_A.field_g + var5;
                  }
                  if (var6 > var3_int) {
                    var6 = var3_int;
                  }
                  this.field_w.a(this.field_n.field_A.field_j, (byte) -123, this.field_n.field_A.field_g, var6);
                  if (this.field_a != 0) {
                    var17 = 0;
                    var7 = var17;
                    while (var6 > var17) {
                      this.field_n.field_A.field_j[this.field_n.field_A.field_g + var17] = (byte)hh.a((int) this.field_n.field_A.field_j[this.field_n.field_A.field_g + var17], (int) this.field_a);
                      var17++;
                    }
                  }
                  this.field_n.field_x = this.field_n.field_x + var6;
                  this.field_n.field_A.field_g = this.field_n.field_A.field_g + var6;
                  if (var5 == this.field_n.field_A.field_g) {
                    this.field_n.a((byte) 88);
                    this.field_n.field_p = false;
                    this.field_n = null;
                  } else {
                    if (this.field_n.field_x == 512) {
                      this.field_n.field_x = 0;
                    }
                  }
                } else {
                  var5 = var4 - this.field_e.field_g;
                  if (var3_int < var5) {
                    var5 = var3_int;
                  }
                  this.field_w.a(this.field_e.field_j, (byte) -125, this.field_e.field_g, var5);
                  if (0 != this.field_a) {
                    for (var6 = 0; var5 > var6; var6++) {
                      this.field_e.field_j[this.field_e.field_g + var6] = (byte)hh.a((int) this.field_e.field_j[this.field_e.field_g + var6], (int) this.field_a);
                    }
                  }
                  this.field_e.field_g = this.field_e.field_g + var5;
                  if (this.field_e.field_g >= var4) {
                    if (this.field_n == null) {
                      this.field_e.field_g = 0;
                      var6 = this.field_e.e((byte) -104);
                      var7 = this.field_e.d(-10674);
                      var8 = this.field_e.e((byte) 63);
                      var9 = this.field_e.d(-10674);
                      var10 = var8 & 127;
                      stackIn_53_0 = ((var8 & 128) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_53_0;
                      var12 = (long)var7 + ((long)var6 << 32);
                      var14 = null;
                      if (var11 == 0) {
                        var14_ref = (vk) (this.field_g.b(54));
                        while (var14_ref != null) {
                          if (~var14_ref.field_k == ~var12) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (vk) (this.field_g.e(124));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (vk) (this.field_m.b(54));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.field_k) {
                            break;
                          }
                          var14_ref = (vk) (this.field_m.e(-6));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      this.field_n = var14_ref;
                      stackIn_70_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_70_0;
                      this.field_n.field_A = new wk(var15 + (var9 + this.field_n.field_y));
                      this.field_n.field_A.f(var10, (byte) -62);
                      this.field_n.field_A.a(var9, (byte) -101);
                      this.field_e.field_g = 0;
                      this.field_n.field_x = 10;
                    } else {
                      if (this.field_n.field_x != 0) {
                        throw new IOException();
                      }
                      if (-1 == this.field_e.field_j[0]) {
                        this.field_e.field_g = 0;
                        this.field_n.field_x = 1;
                      } else {
                        this.field_n = null;
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
              this.field_w.d(-23482);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_w = null;
            this.field_o = -2;
            this.field_i = this.field_i + 1;
            if (this.b((byte) 88) != 0) {
              return false;
            }
            if (this.a(-120) != 0) {
              return false;
            }
            return true;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ef() {
    }

    private final void d(byte param0) {
        try {
          IOException iOException = null;
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (this.field_w == null) {
            return;
          }
          try {
            this.field_c.field_g = 0;
            this.field_c.f(6, (byte) -18);
            var2_int = 1 % ((param0 - 54) / 43);
            this.field_c.a((byte) -120, 3);
            this.field_c.c(0, (byte) -66);
            this.field_w.a(this.field_c.field_j.length, 0, (byte) 117, this.field_c.field_j);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_w.d(-23482);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_i = this.field_i + 1;
            this.field_w = null;
            this.field_o = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void g(int param0) {
        field_u = null;
        field_q = null;
        field_s = null;
        field_v = null;
        if (param0 != -1) {
          ef.g(65);
        }
    }

    static {
        field_v = "Game options changed (<%0>)";
        field_s = "Quick Chat game";
        field_q = "Rating";
        field_r = true;
        field_u = new vn();
    }
}
