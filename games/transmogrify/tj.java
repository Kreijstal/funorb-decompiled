/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tj extends uh {
    static int[] field_w;
    private gj field_x;
    static String field_t;
    static String field_A;
    static int field_u;
    static ti field_s;
    static String field_z;
    static int field_y;
    static String field_v;

    final boolean c(byte param0) {
        try {
          int var2_int = 0;
          int stackIn_65_0 = 0;
          int stackIn_81_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          pj var2 = null;
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
          pj var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          pj var2Lifetime1;
          var16 = Transmogrify.field_A ? 1 : 0;
          if (null != this.field_x) {
            var2_long = lk.a(0);
            var4 = (int)(-this.field_l + var2_long);
            this.field_l = var2_long;
            if (200 < var4) {
              var4 = 200;
            }
            this.field_b = this.field_b + var4;
            if (this.field_b > 30000) {
              try {
                this.field_x.a(true);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_x = null;
            }
          }
          if (null == this.field_x) {
            if (0 != this.a((byte) -68)) {
              return false;
            }
            if (this.e(-10236) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_x.d(-60);
            if (param0 <= 115) {
              return false;
            }
            var2 = (pj) (this.field_c.b((byte) 125));
            while (var2 != null) {
              this.field_i.field_h = 0;
              this.field_i.f(6389, 1);
              this.field_i.a(var2.field_j, true);
              this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
              this.field_h.a((byte) -128, var2);
              var2 = (pj) (this.field_c.a(97));
            }
            var2Lifetime1 = (pj) (this.field_a.b((byte) 114));
            while (var2Lifetime1 != null) {
              this.field_i.field_h = 0;
              this.field_i.f(6389, 0);
              this.field_i.a(var2Lifetime1.field_j, true);
              this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
              this.field_n.a((byte) -128, var2Lifetime1);
              var2Lifetime1 = (pj) (this.field_a.a(104));
            }
            for (var2_int = 0; 100 > var2_int; var2_int++) {
              var3_int = this.field_x.a((byte) -119);
              if (0 > var3_int) {
                throw new IOException();
              }
              if (0 != var3_int) {
                this.field_b = 0;
                var4 = 0;
                if (this.field_e != null) {
                  if (this.field_e.field_C == 0) {
                    var4 = 1;
                  }
                } else {
                  var4 = 10;
                }
                if (var4 > 0) {
                  var5 = -this.field_g.field_h + var4;
                  if (var5 > var3_int) {
                    var5 = var3_int;
                  }
                  this.field_x.a(this.field_g.field_h, var5, this.field_g.field_g, 5768);
                  if (this.field_m != 0) {
                    for (var6 = 0; var5 > var6; var6++) {
                      this.field_g.field_g[var6 + this.field_g.field_h] = (byte)ak.a((int) this.field_g.field_g[var6 + this.field_g.field_h], (int) this.field_m);
                    }
                  }
                  this.field_g.field_h = this.field_g.field_h + var5;
                  if (var4 <= this.field_g.field_h) {
                    if (this.field_e == null) {
                      this.field_g.field_h = 0;
                      var6 = this.field_g.d((byte) 56);
                      var7 = this.field_g.c((byte) -125);
                      var8 = this.field_g.d((byte) 90);
                      var9 = this.field_g.c((byte) -104);
                      var10 = 127 & var8;
                      stackIn_65_0 = ((var8 & 128) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_65_0;
                      var12 = ((long)var6 << 32) + (long)var7;
                      var14 = null;
                      if (var11 == 0) {
                        var14_ref = (pj) (this.field_h.b((byte) 124));
                        while (var14_ref != null) {
                          if (var12 == var14_ref.field_j) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (pj) (this.field_h.a(119));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (pj) (this.field_n.b((byte) 127));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.field_j) {
                            break;
                          }
                          var14_ref = (pj) (this.field_n.a(83));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      this.field_e = var14_ref;
                      stackIn_81_0 = (var10 == 0) ? 5 : 9;
                      var15 = stackIn_81_0;
                      this.field_e.field_B = new oa(var15 + (var9 + this.field_e.field_z));
                      this.field_e.field_B.f(6389, var10);
                      this.field_e.field_B.a(-112, var9);
                      this.field_g.field_h = 0;
                      this.field_e.field_C = 10;
                    } else {
                      if (0 != this.field_e.field_C) {
                        throw new IOException();
                      }
                      if (this.field_g.field_g[0] == -1) {
                        this.field_g.field_h = 0;
                        this.field_e.field_C = 1;
                      } else {
                        this.field_e = null;
                      }
                    }
                  }
                } else {
                  var5 = -this.field_e.field_z + this.field_e.field_B.field_g.length;
                  var6 = -this.field_e.field_C + 512;
                  if (var5 - this.field_e.field_B.field_h < var6) {
                    var6 = var5 - this.field_e.field_B.field_h;
                  }
                  if (var6 > var3_int) {
                    var6 = var3_int;
                  }
                  this.field_x.a(this.field_e.field_B.field_h, var6, this.field_e.field_B.field_g, 5768);
                  if (this.field_m != 0) {
                    for (var7 = 0; var7 < var6; var7++) {
                      this.field_e.field_B.field_g[var7 + this.field_e.field_B.field_h] = (byte)ak.a((int) this.field_e.field_B.field_g[var7 + this.field_e.field_B.field_h], (int) this.field_m);
                    }
                  }
                  this.field_e.field_B.field_h = this.field_e.field_B.field_h + var6;
                  this.field_e.field_C = this.field_e.field_C + var6;
                  if (this.field_e.field_B.field_h != var5) {
                    if (this.field_e.field_C == 512) {
                      this.field_e.field_C = 0;
                    }
                  } else {
                    this.field_e.b((byte) -79);
                    this.field_e.field_m = false;
                    this.field_e = null;
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
              this.field_x.a(true);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_p = this.field_p + 1;
            this.field_k = -2;
            this.field_x = null;
            if (this.a((byte) 87) == 0 &&
              this.e(-10236) == 0) {
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

    final void a(boolean param0, Object param1, int param2) {
        try {
          RuntimeException stackIn_29_0 = null;
          StringBuilder stackIn_29_1 = null;
          String stackIn_30_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          pj var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          pj var4_refLifetime1;
          var6 = Transmogrify.field_A ? 1 : 0;
          try {
            if (this.field_x != null) {
              try {
                this.field_x.a(true);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_x = null;
            }
            this.field_x = (gj) (param1);
            this.a(false);
            this.a(3, param0);
            this.field_e = null;
            if (param2 != 20) {
              return;
            }
            this.field_g.field_h = 0;
            while (true) {
              var4_ref = (pj) (this.field_h.d(-31914));
              if (var4_ref != null) {
                this.field_c.a((byte) -128, var4_ref);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (pj) (this.field_n.d(param2 - 31934));
              if (var4_refLifetime1 != null) {
                this.field_a.a((byte) -128, var4_refLifetime1);
                continue;
              }
              break;
            }
            if (this.field_m != 0) {
              try {
                this.field_i.field_h = 0;
                this.field_i.f(6389, 4);
                this.field_i.f(6389, (int) this.field_m);
                this.field_i.a(-122, 0);
                this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_x.a(true);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_p = this.field_p + 1;
                this.field_k = -2;
                this.field_x = null;
              }
            }
            this.field_b = 0;
            this.field_l = lk.a(param2 - 20);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_29_0 = var4_ref3;
            stackIn_29_1 = new StringBuilder().append("tj.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_30_2 = "null";
            } else {
              stackIn_30_2 = "{...}";
            }
            throw ch.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void d(int param0) {
        try {
          this.field_x.a(true);
          int var2_int = 19 % ((81 - param0) / 34);
        } catch (Exception exception) {
        }
        this.field_k = -1;
        this.field_x = null;
        this.field_p = this.field_p + 1;
        this.field_m = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    private final void a(int param0, boolean param1) {
        try {
          IOException iOException = null;
          oa stackIn_6_0 = null;
          int stackIn_6_1 = 0;
          int stackIn_7_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.field_x == null) {
            return;
          }
          try {
            if (param0 != 3) {
              this.a(-2, false);
            }
            this.field_i.field_h = 0;
            stackIn_6_0 = this.field_i;
            stackIn_6_1 = 6389;
            if (param1) {
              stackIn_7_2 = 2;
            } else {
              stackIn_7_2 = 3;
            }
            ((oa) (Object) stackIn_6_0).f(stackIn_6_1, stackIn_7_2);
            this.field_i.a(0L, true);
            this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_x.a(true);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_p = this.field_p + 1;
            this.field_k = -2;
            this.field_x = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0) {
        try {
          IOException iOException = null;
          gj stackIn_10_0 = null;
          boolean stackIn_11_1 = false;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (param0) {
            this.a(-105);
          }
          if (this.field_x == null) {
            return;
          }
          try {
            this.field_i.field_h = 0;
            this.field_i.f(6389, 6);
            this.field_i.i(3, 45);
            this.field_i.c(0, -159688920);
            this.field_x.a((byte) 9, this.field_i.field_g, this.field_i.field_g.length, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              stackIn_10_0 = this.field_x;
              stackIn_11_1 = !(param0);
              ((gj) (Object) stackIn_10_0).a(stackIn_11_1);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_x = null;
            this.field_p = this.field_p + 1;
            this.field_k = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        if (null != this.field_x) {
          this.field_x.a(true);
        }
        if (param0 != -2025316960) {
          field_A = (String) null;
        }
    }

    public tj() {
    }

    public static void d(byte param0) {
        field_z = null;
        field_w = null;
        field_v = null;
        int var1 = 109 % ((49 - param0) / 45);
        field_t = null;
        field_A = null;
        field_s = null;
    }

    static {
        field_w = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_t = "Create a free account to start using this feature";
        field_z = "Submit for ";
        field_A = "Please enter your age in years";
        field_v = null;
    }
}
