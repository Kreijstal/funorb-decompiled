/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ih extends ej {
    static vl field_x;
    static String field_z;
    static String field_u;
    static bd field_v;
    static volatile boolean field_s;
    private td field_t;
    static int field_w;
    static oc[] field_y;

    final boolean e(int param0) {
        try {
          int var2_int = 0;
          int stackIn_50_0 = 0;
          int stackIn_64_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          lm var2 = null;
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
          lm var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          int var17 = 0;
          lm var2Lifetime1;
          var16 = HostileSpawn.field_I ? 1 : 0;
          if (null != this.field_t) {
            var2_long = hn.a((byte) 80);
            var4 = (int)(-this.field_c + var2_long);
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_c = var2_long;
            this.field_f = this.field_f + var4;
            if (this.field_f > 30000) {
              try {
                this.field_t.a(37);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_t = null;
            }
          }
          if (param0 >= -75) {
            return true;
          }
          if (this.field_t == null) {
            if (this.c((byte) 122) == 0 &&
              this.b((byte) -34) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_t.a((byte) -55);
            var2 = (lm) (this.field_b.d((byte) -35));
            while (var2 != null) {
              this.field_m.field_i = 0;
              this.field_m.d(124, 1);
              this.field_m.a(-113, var2.field_h);
              this.field_t.a(this.field_m.field_n.length, this.field_m.field_n, (byte) -63, 0);
              this.field_j.a(var2, -126);
              var2 = (lm) (this.field_b.b((byte) -59));
            }
            var2Lifetime1 = (lm) (this.field_l.d((byte) -35));
            while (var2Lifetime1 != null) {
              this.field_m.field_i = 0;
              this.field_m.d(100, 0);
              this.field_m.a(-127, var2Lifetime1.field_h);
              this.field_t.a(this.field_m.field_n.length, this.field_m.field_n, (byte) -127, 0);
              this.field_a.a(var2Lifetime1, 56);
              var2Lifetime1 = (lm) (this.field_l.b((byte) -114));
            }
            for (var2_int = 0; 100 > var2_int; var2_int++) {
              var3_int = this.field_t.b((byte) 59);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.field_f = 0;
                var4 = 0;
                if (null != this.field_p) {
                  if (this.field_p.field_x == 0) {
                    var4 = 1;
                  }
                } else {
                  var4 = 10;
                }
                if (var4 <= 0) {
                  var5 = this.field_p.field_C.field_n.length - this.field_p.field_B;
                  var6 = -this.field_p.field_x + 512;
                  if (var5 - this.field_p.field_C.field_i < var6) {
                    var6 = -this.field_p.field_C.field_i + var5;
                  }
                  if (var3_int < var6) {
                    var6 = var3_int;
                  }
                  this.field_t.a(-1, this.field_p.field_C.field_n, this.field_p.field_C.field_i, var6);
                  if (this.field_r != 0) {
                    var17 = 0;
                    var7 = var17;
                    while (var17 < var6) {
                      this.field_p.field_C.field_n[this.field_p.field_C.field_i + var17] = (byte)bm.a((int) this.field_p.field_C.field_n[this.field_p.field_C.field_i + var17], (int) this.field_r);
                      var17++;
                    }
                  }
                  this.field_p.field_x = this.field_p.field_x + var6;
                  this.field_p.field_C.field_i = this.field_p.field_C.field_i + var6;
                  if (this.field_p.field_C.field_i != var5) {
                    if (this.field_p.field_x == 512) {
                      this.field_p.field_x = 0;
                    }
                  } else {
                    this.field_p.c(-1);
                    this.field_p.field_v = false;
                    this.field_p = null;
                  }
                } else {
                  var5 = var4 - this.field_i.field_i;
                  if (var5 > var3_int) {
                    var5 = var3_int;
                  }
                  this.field_t.a(-1, this.field_i.field_n, this.field_i.field_i, var5);
                  if (this.field_r != 0) {
                    for (var6 = 0; var5 > var6; var6++) {
                      this.field_i.field_n[var6 + this.field_i.field_i] = (byte)bm.a((int) this.field_i.field_n[var6 + this.field_i.field_i], (int) this.field_r);
                    }
                  }
                  this.field_i.field_i = this.field_i.field_i + var5;
                  if (this.field_i.field_i >= var4) {
                    if (null == this.field_p) {
                      this.field_i.field_i = 0;
                      var6 = this.field_i.l(32270);
                      var7 = this.field_i.d(8195);
                      var8 = this.field_i.l(32270);
                      var9 = this.field_i.d(8195);
                      var10 = var8 & 127;
                      stackIn_50_0 = ((128 & var8) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_50_0;
                      var12 = ((long)var6 << 32) + (long)var7;
                      var14 = null;
                      if (var11 != 0) {
                        var14_ref = (lm) (this.field_a.d((byte) -35));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.field_h) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (lm) (this.field_a.b((byte) -18));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (lm) (this.field_j.d((byte) -35));
                        while (var14_ref != null) {
                          if (var14_ref.field_h == var12) {
                            break;
                          }
                          var14_ref = (lm) (this.field_j.b((byte) -52));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_64_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_64_0;
                      this.field_p = var14_ref;
                      this.field_p.field_C = new vi(var15 + (var9 + this.field_p.field_B));
                      this.field_p.field_C.d(122, var10);
                      this.field_p.field_C.b(var9, 25251);
                      this.field_p.field_x = 10;
                      this.field_i.field_i = 0;
                    } else {
                      if (this.field_p.field_x != 0) {
                        throw new IOException();
                      }
                      if (this.field_i.field_n[0] != -1) {
                        this.field_p = null;
                      } else {
                        this.field_i.field_i = 0;
                        this.field_p.field_x = 1;
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
              this.field_t.a(-98);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_t = null;
            this.field_k = this.field_k + 1;
            this.field_e = -2;
            if (this.c((byte) 122) == 0 &&
              0 == this.b((byte) -34)) {
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

    final void a(byte param0) {
        if (null != this.field_t) {
          this.field_t.a(-105);
        }
        int var2 = -92 % ((param0 + 63) / 63);
    }

    final void c(int param0) {
        try {
          if (param0 != 194) {
            this.e(57);
          }
          this.field_t.a(-114);
        } catch (Exception exception) {
        }
        this.field_e = -1;
        this.field_t = null;
        this.field_k = this.field_k + 1;
        this.field_r = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    private final void g(int param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (this.field_t == null) {
            return;
          }
          try {
            this.field_m.field_i = 0;
            this.field_m.d(param0 + 74, 6);
            this.field_m.e(3, -91);
            this.field_m.a((byte) -119, 0);
            this.field_t.a(this.field_m.field_n.length, this.field_m.field_n, (byte) 32, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_t.a(-54);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_k = this.field_k + 1;
            this.field_t = null;
            this.field_e = -2;
          }
          if (param0 != 24) {
            this.field_t = (td) null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0, byte param1, Object param2) {
        try {
          RuntimeException stackIn_28_0 = null;
          StringBuilder stackIn_28_1 = null;
          String stackIn_29_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          lm var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          lm var4_refLifetime1;
          var6 = HostileSpawn.field_I ? 1 : 0;
          try {
            if (null != this.field_t) {
              try {
                this.field_t.a(-98);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_t = null;
            }
            this.field_t = (td) (param2);
            this.g(24);
            this.a((byte) 47, param0);
            this.field_p = null;
            this.field_i.field_i = 0;
            while (true) {
              var4_ref = (lm) (this.field_j.a((byte) 27));
              if (var4_ref != null) {
                this.field_b.a(var4_ref, 40);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (lm) (this.field_a.a((byte) 27));
              if (var4_refLifetime1 != null) {
                this.field_l.a(var4_refLifetime1, -127);
                continue;
              }
              break;
            }
            if (param1 != 75) {
              field_v = (bd) null;
            }
            if (this.field_r != 0) {
              try {
                this.field_m.field_i = 0;
                this.field_m.d(106, 4);
                this.field_m.d(param1 ^ 52, (int) this.field_r);
                this.field_m.b(0, 25251);
                this.field_t.a(this.field_m.field_n.length, this.field_m.field_n, (byte) 87, 0);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_t.a(-95);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_k = this.field_k + 1;
                this.field_e = -2;
                this.field_t = null;
              }
            }
            this.field_f = 0;
            this.field_c = hn.a((byte) 80);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_28_0 = var4_ref3;
            stackIn_28_1 = new StringBuilder().append("ih.C(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_29_2 = "null";
            } else {
              stackIn_29_2 = "{...}";
            }
            throw wg.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        oj var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var8Lifetime1;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          var5 = 24 + uj.field_p.field_e;
          var6 = uj.field_p.field_g;
          if (param0 != -15587) {
            return;
          }
          for (var2_int = 0; rc.field_e > var2_int; var2_int++) {
            boolean decompiledFrameRemainder0 = true;
            var7 = re.field_n[var2_int];
            var3 = -var5 + (int)(24.0 * ((double)var7.field_j.field_e + var7.field_l.field_f));
            var4 = -var6 + (int)((var7.field_l.field_a + (double)var7.field_j.field_g) * 24.0);
            if (var3 >= -96 &&
              var4 >= -96 &&
              var3 <= 736 &&
              576 >= var4 &&
              0 == ue.field_d) {
              var9 = var7.field_i;
              if (var9 != 129 &&
                var9 != 131 &&
                var9 != 133) {
                if ((var9 == 128 ||
                  var9 == 130 ||
                  var9 == 132)) {
                  var3 = var7.field_j.field_e * 24 - var5;
                  var4 = 24 * var7.field_j.field_g - var6;
                  var3 += 24;
                  var4 += 12;
                  var8 = var7.field_e / 2;
                  if (var8 >= 6) {
                    var8 = 5;
                  }
                  var7.field_H[var8].a(true, 128, 0, var3, var4);
                  var7.field_u.a(true, 128, 0, var3, var4);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                var3 = var7.field_j.field_e * 24 - var5;
                var4 = 24 * var7.field_j.field_g - var6;
                var3 += 12;
                var8Lifetime1 = var7.field_e / 2;
                if (var8Lifetime1 >= 6) {
                  var8Lifetime1 = 5;
                }
                var7.field_H[var8Lifetime1].a(true, 128, 64, var3, var4);
                var7.field_u.a(true, 128, 0, var3, var4);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "ih.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, boolean param1) {
        try {
          IOException iOException = null;
          vi stackIn_4_0 = null;
          int stackIn_4_1 = 0;
          int stackIn_5_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (null == this.field_t) {
            return;
          }
          try {
            this.field_m.field_i = 0;
            stackIn_4_0 = this.field_m;
            stackIn_4_1 = 123;
            if (param1) {
              stackIn_5_2 = 2;
            } else {
              stackIn_5_2 = 3;
            }
            ((vi) (Object) stackIn_4_0).d(stackIn_4_1, stackIn_5_2);
            this.field_m.a(-121, 0L);
            this.field_t.a(this.field_m.field_n.length, this.field_m.field_n, (byte) -105, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_t.a(param0 ^ 127);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_e = -2;
            this.field_k = this.field_k + 1;
            this.field_t = null;
          }
          if (param0 != 47) {
            this.a((byte) -29);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f(int param0) {
        if (param0 != 200) {
          field_x = (vl) null;
        }
        field_x = null;
        field_u = null;
        field_z = null;
        field_y = null;
        field_v = null;
    }

    public ih() {
    }

    final static int a(oc param0, byte param1, oc param2) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -69) {
            ih.a(-70, -116);
          }
          if (param0.field_g >= param2.field_g) {
            stackIn_5_0 = param0.field_g - param2.field_g;
          } else {
            stackIn_5_0 = param2.field_g - param0.field_g;
          }
          if (param2.field_e > param0.field_e) {
            stackIn_8_1 = -param0.field_e + param2.field_e;
          } else {
            stackIn_8_1 = -param2.field_e + param0.field_e;
          }
          stackIn_9_0 = stackIn_5_0 + stackIn_8_1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ih.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_u = "Activate the reactor on this level, or seal off the breach from environmental controls.";
        field_s = false;
        field_z = "This door is sealed from the other side. I'll have to find another way around.";
        field_x = new vl();
        field_w = 9;
    }
}
