/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cc {
    static long field_a;
    private int field_j;
    static aa[] field_m;
    static boolean[] field_c;
    private int field_e;
    static int[][] field_h;
    private boolean field_d;
    private boolean field_p;
    static vn field_b;
    int field_i;
    static vn field_k;
    private int field_o;
    int field_l;
    private int field_f;
    private int field_n;
    private boolean field_g;

    final void c(int param0) {
        if (param0 != 28497) {
          return;
        }
        this.field_o = 0;
        this.field_n = 0;
        this.field_p = true;
        this.field_e = 0;
    }

    final static void d(int param0) {
        if (!i.field_Y) {
          throw new IllegalStateException();
        }
        de.field_i = true;
        lk.a(false, param0 ^ 116);
        fl.field_a = param0;
    }

    final static void a(de param0, int param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = ZombieDawn.field_J;
          try {
            if (param1 != 10) {
              field_b = (vn) null;
            }
            var6 = new byte[24];
            var2 = var6;
            if (null != ce.field_t) {
              try {
                ce.field_t.a(param1 ^ 10, 0L);
                ce.field_t.a(85, var6);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var2[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
              param0.a(var2, 24, 0, -27843);
            } else {
              param0.a(var2, 24, 0, -27843);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref;
            stackIn_20_1 = new StringBuilder().append("cc.E(");
            if (param0 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw sh.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0, byte param1) {
        int stackIn_8_0 = 0;
        if (param1 > -127) {
          return -94;
        }
        if (70 < this.field_o &&
          0 < -this.field_l + param0 &&
          param0 - this.field_l < 40) {
          stackIn_8_0 = this.field_f;
        } else {
          stackIn_8_0 = -1;
        }
        return stackIn_8_0;
    }

    private final int a(int param0, boolean param1, int param2) {
        int var4 = Math.abs(this.field_l - (-20 + param0));
        if (param1) {
          return -34;
        }
        int var5 = -param2 + nh.field_P;
        int var6 = 60;
        float var7 = (float)(-(var4 * var4) - var5 * var5) + 8100.0f;
        if (0.0f < var7) {
          if (var7 > 8000.0f) {
            var7 = 8000.0f;
          }
          var6 = var6 + (int)(var7 / 8000.0f * 20.0f);
        }
        return var6;
    }

    final void b(int param0) {
        this.field_d = false;
        if (param0 != 2) {
          this.c(80);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_k = null;
        field_c = null;
        if (param0 != -27940) {
          return;
        }
        field_h = (int[][]) null;
        field_m = null;
    }

    final boolean a(boolean param0) {
        if (param0) {
          this.field_n = -81;
        }
        return this.field_d;
    }

    final boolean a(boolean param0, int param1, int param2) {
        boolean stackIn_7_0 = false;
        if (param0) {
          this.field_e = 127;
        }
        stackIn_7_0 = (-param1 + nh.field_P < 80) && (0 < param2 - this.field_l) && (-this.field_l + param2 < 40);
        return stackIn_7_0;
    }

    final int b(byte param0) {
        if (param0 >= -94) {
          field_a = -84L;
        }
        return this.field_f;
    }

    final void a(byte param0, int param1, int param2) {
        int stackIn_37_0 = 0;
        int var4;
        int var5;
        var5 = ZombieDawn.field_J;
        int fieldTemp$0 = this.field_j + 1;
        this.field_j = this.field_j + 1;
        if (50 == fieldTemp$0) {
          this.field_j = 0;
        }
        if (param0 < 102) {
          return;
        }
        if (this.field_i < this.field_l) {
          this.field_l = this.field_l - 2;
          if (this.field_i > this.field_l) {
            this.field_l = this.field_i;
          }
        }
        if (!this.field_p) {
          if (this.field_d) {
            this.field_o = 85;
          } else {
            if (param1 < 390) {
              stackIn_37_0 = 0;
            } else {
              stackIn_37_0 = this.a(param2, false, param1);
            }
            var4 = stackIn_37_0;
            if (this.field_g) {
              var4 = 80;
            }
            if (2 < Math.abs(var4 - this.field_o)) {
              if (this.field_o < var4) {
                this.field_o = this.field_o + 2;
              } else {
                this.field_o = this.field_o - 2;
              }
            } else {
              this.field_o = var4;
            }
            if (80 < this.field_o) {
              this.field_o = 80;
            }
            if (this.field_o < 60) {
              this.field_o = 60;
            }
          }
        } else {
          if (0 == this.field_n) {
            if (this.field_o < 80) {
              this.field_o = this.field_o + 3;
            } else {
              this.field_n = 1;
              this.field_e = 1;
            }
          } else {
            if (this.field_n >= 4) {
              if (this.field_n >= 6) {
                if (this.field_n >= 8) {
                  if (8 == this.field_n) {
                    var4 = this.a(param2, false, param1);
                    if (this.field_g) {
                      var4 = 80;
                    }
                    if (this.field_o > var4) {
                      this.field_o = this.field_o - 2;
                      if (var4 > this.field_o) {
                        this.field_o = var4;
                      }
                    } else {
                      this.field_p = false;
                    }
                  }
                } else {
                  this.field_n = this.field_n + 1;
                }
              } else {
                this.field_n = this.field_n + 1;
                if (this.field_n == 5) {
                  this.field_e = 2;
                }
              }
            } else {
              this.field_n = this.field_n + 1;
              if (this.field_n == 3) {
                this.field_e = 1;
              }
            }
          }
        }
        if (!this.field_d &&
          80 < this.field_o) {
          this.field_o = 80;
        }
        if (!this.field_p &&
          60 > this.field_o) {
          this.field_o = 60;
        }
    }

    final void b(boolean param0) {
        this.field_e = 2;
        this.field_d = true;
        this.field_p = param0 ? true : false;
    }

    final void a(byte param0) {
        vn stackIn_8_0 = null;
        int var2;
        vn var3;
        int var4;
        var4 = ZombieDawn.field_J;
        if (this.field_o <= 0) {
          return;
        }
        var2 = this.field_l;
        if (this.field_g) {
          var2 = var2 + vh.field_b;
        }
        if (!this.field_g) {
          stackIn_8_0 = kb.field_i[this.field_f];
        } else {
          stackIn_8_0 = jb.field_a[1 + this.field_f];
        }
        var3 = stackIn_8_0;
        so.a(nf.field_d, var2 - 5, -this.field_o + nh.field_P + 5);
        ni.field_b[this.field_e].b(var2, nh.field_P - this.field_o);
        if (2 == this.field_e) {
          if (this.field_d) {
            ni.field_b[this.field_e].b(var2, -this.field_o + nh.field_P, 96 + ae.field_c[this.field_j]);
          }
          if (!this.field_g) {
            var3.b(8 + var2, 24 - this.field_o + nh.field_P);
          } else {
            var3.d(var2 + 7, nh.field_P - (this.field_o - 24));
          }
          if (this.field_d) {
            var3.b(var2 + 8, nh.field_P - this.field_o + 24, 96 + ae.field_c[this.field_j]);
          }
          ni.field_b[3].b(var2, nh.field_P - this.field_o);
        } else {
          if (!this.field_g) {
            var3.e(var2 + 8, nh.field_P - 56, this.field_o * 3);
          } else {
            var3.d(7 + var2, this.field_o);
          }
        }
        if (param0 < 110) {
          field_c = (boolean[]) null;
        }
        return;
    }

    cc(int param0, int param1, boolean param2) {
        this(param0, param1);
        this.field_g = param2 ? true : false;
    }

    private cc(int param0, int param1) {
        this.field_d = false;
        this.field_p = false;
        this.field_l = param0;
        this.field_i = this.field_l;
        this.field_e = 2;
        this.field_o = 0;
        this.field_f = param1;
    }

    static {
        field_h = new int[][]{null, null, null, null, new int[]{4, 0, 3}, new int[]{5, 2, 6, 1, 7}, null, null, new int[]{12, 9, 14}, new int[]{15, 13, 10}};
        field_k = null;
        field_c = new boolean[14];
        field_b = new vn(195, 170);
    }
}
