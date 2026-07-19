/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rr extends at {
    private int field_s;
    private fd field_o;
    private int field_u;
    private int field_k;
    private cq field_l;
    private int field_q;
    private int field_n;
    int field_w;
    static String field_r;
    private gj field_j;
    private int field_p;
    private int field_t;
    static String field_x;
    private boolean field_m;
    private int field_v;

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var2 = this.field_p + this.field_w * this.field_q;
          var3 = this.field_u - -(this.field_w * this.field_k);
          var2 = var2 + this.field_j.field_s.field_b;
          var3 = var3 + this.field_j.field_s.field_B;
          var4 = (this.field_w & 13) >> 1693919299;
          var5 = (via.a(this.field_w << 276779784, (byte) 65) >> 1841598381) + 64;
          if (this.field_w >= 0) {
            break L0;
          } else {
            L1: {
              var6 = var5;
              if (this.field_w <= -32) {
                break L1;
              } else {
                var6 = var6 * -this.field_w >> -343524283;
                break L1;
              }
            }
            nv.field_wb.b(var2 - -44, var3 + -var6);
            break L0;
          }
        }
        var6 = -(var5 >> 1416252450) + 64;
        if (param0 < -10) {
          var7 = -(var5 >> 1682445218) + 48;
          nk.a(this.field_j.field_s.field_y, -(var6 >> -1588607231) + (64 + var2), -(var7 >> -1532796703) + var3 - -24, var6, var7);
          if (this.field_m) {
            ho.field_j[var4].a(var2, -45 + (var3 - var5));
            return;
          } else {
            ho.field_j[var4].c(var2, -45 + (var3 - var5));
            return;
          }
        } else {
          this.field_m = true;
          var7 = -(var5 >> 1682445218) + 48;
          nk.a(this.field_j.field_s.field_y, -(var6 >> -1588607231) + (64 + var2), -(var7 >> -1532796703) + var3 - -24, var6, var7);
          if (this.field_m) {
            ho.field_j[var4].a(var2, -45 + (var3 - var5));
            return;
          } else {
            ho.field_j[var4].c(var2, -45 + (var3 - var5));
            return;
          }
        }
    }

    private final void e(int param0) {
        if (this.field_l == null) {
          if (param0 >= -54) {
            this.field_m = true;
            return;
          } else {
            return;
          }
        } else {
          id.a(97, this.field_l);
          if (param0 < -54) {
            return;
          } else {
            this.field_m = true;
            return;
          }
        }
    }

    public static void f(int param0) {
        if (param0 != -13421) {
            field_r = (String) null;
            field_x = null;
            field_r = null;
            return;
        }
        field_x = null;
        field_r = null;
    }

    final void d(int param0) {
        int var2 = this.field_w * this.field_q + this.field_p;
        int var3 = this.field_u - -(this.field_k * this.field_w);
        this.field_j.field_s.c(107, 240 + -var3, param0 - var2);
    }

    final static void a(int param0, eaa param1, int param2, Random param3) {
        int discarded$4 = 0;
        lh var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var4 = (lh) ((Object) param1.b((byte) 90));
            L1: while (true) {
              if (var4 == null) {
                if (param0 >= 120) {
                  break L0;
                } else {
                  rr.f(63);
                  return;
                }
              } else {
                L2: {
                  if (!var4.b(true)) {
                    break L2;
                  } else {
                    discarded$4 = kla.a(50, param3, -2147483648);
                    var4.field_p = (int)((double)(128 + kla.a(80000, param3, -2147483648)) * Math.sin(var4.field_r));
                    var4.field_g = (int)((double)(kla.a(40000, param3, -2147483648) + 128) * Math.cos(var4.field_r));
                    break L2;
                  }
                }
                var4 = (lh) ((Object) param1.c(0));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4_ref);
            stackOut_10_1 = new StringBuilder().append("rr.F(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final taa e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        taa var4 = null;
        if (param0 != -120) {
          this.field_w = 21;
          var2 = this.field_p - this.field_t * this.field_q;
          var3 = -(this.field_t * this.field_k) + this.field_u;
          var4 = new taa(this.field_j, 0, 0);
          var4.field_k = 320 - var2;
          var4.field_j = 240 - var3;
          return var4;
        } else {
          var2 = this.field_p - this.field_t * this.field_q;
          var3 = -(this.field_t * this.field_k) + this.field_u;
          var4 = new taa(this.field_j, 0, 0);
          var4.field_k = 320 - var2;
          var4.field_j = 240 - var3;
          return var4;
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        je var3 = null;
        L0: {
          var2 = -62 / ((param0 - 71) / 47);
          if (this.field_w != -this.field_t) {
            break L0;
          } else {
            var3 = je.a(rt.field_a[20], 256, 128);
            var3.d(-1);
            this.field_l = tw.a(var3, (byte) -36);
            break L0;
          }
        }
        int fieldTemp$2 = this.field_w + 1;
        this.field_w = this.field_w + 1;
        if (this.field_s > fieldTemp$2) {
          L1: {
            if (this.field_w == -15) {
              jja.a(192, -1, 1);
              break L1;
            } else {
              break L1;
            }
          }
          if (-1 != (this.field_w ^ -1)) {
            return false;
          } else {
            this.d((byte) 95);
            return false;
          }
        } else {
          this.e(-119);
          return true;
        }
    }

    private final void d(byte param0) {
        oia var2 = null;
        this.field_o.a(this.field_v, this.field_n, this.field_o.field_B.field_l.a(-27449, this.field_j), 0);
        if (param0 <= 87) {
          return;
        } else {
          var2 = new oia(this.field_j, this.field_v, this.field_n);
          ((kj) ((Object) var2)).a(0);
          return;
        }
    }

    rr(gj param0, fd param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        aj var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              this.field_j = param0;
              this.field_o = param1;
              this.field_v = param2;
              this.field_n = param3;
              var7 = this.field_j.field_s.a(this.field_n, (byte) 114, this.field_v);
              this.field_p = -this.field_j.field_s.field_b + var7.field_c;
              this.field_k = 2;
              this.field_u = -this.field_j.field_s.field_B + var7.field_a;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param4) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((rr) (this)).field_m = stackIn_4_1 != 0;
              this.field_q = this.field_k << 1666074369;
              if (!this.field_m) {
                this.field_s = ((this.field_j.field_h.field_z + -this.field_v) * 64 + 640) / this.field_q;
                this.field_t = (10 + this.field_v) * 64 / this.field_q;
                break L2;
              } else {
                this.field_t = 64 * (10 + this.field_n) / this.field_q;
                this.field_s = (640 + (-this.field_n + this.field_j.field_h.field_B) * 64) / this.field_q;
                break L2;
              }
            }
            L3: {
              if (!this.field_m) {
                break L3;
              } else {
                this.field_q = -this.field_q;
                break L3;
              }
            }
            this.field_w = -this.field_t;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var6);
            stackOut_11_1 = new StringBuilder().append("rr.<init>(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_x = "<%0> has been removed.";
    }
}
