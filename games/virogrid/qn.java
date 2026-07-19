/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qn extends tg {
    static int field_K;
    int field_F;
    int field_N;
    int field_G;
    int field_Q;
    static p field_P;
    int field_O;
    int field_M;
    static eh field_I;
    static java.util.zip.CRC32 field_S;
    static String field_L;
    static km field_J;
    static km field_H;
    static pd field_R;

    public static void c(byte param0) {
        wm discarded$0 = null;
        field_I = null;
        field_R = null;
        field_H = null;
        field_L = null;
        field_S = null;
        if (param0 != -124) {
            hg var2 = (hg) null;
            discarded$0 = qn.a((hg) null, 93);
        }
        field_P = null;
        field_J = null;
    }

    final static wm a(hg param0, int param1) {
        int discarded$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        wm var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        wm stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        wm stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.c((byte) -78, 8);
            if (var2_int > 0) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                if (param1 == 13472) {
                  break L1;
                } else {
                  qn.c((byte) -24);
                  break L1;
                }
              }
              L2: {
                var3 = tk.a(1, param0) ? 1 : 0;
                var4 = tk.a(1, param0) ? 1 : 0;
                var5 = new wm();
                var5.field_h = (short)param0.c((byte) -78, 16);
                var5.field_l = c.a(var5.field_l, -27, 16, param0);
                var5.field_b = c.a(var5.field_b, -67, 16, param0);
                var5.field_H = c.a(var5.field_H, -35, 16, param0);
                var5.field_k = (short)param0.c((byte) -78, 16);
                var5.field_J = c.a(var5.field_J, -13, 16, param0);
                var5.field_e = c.a(var5.field_e, -6, 16, param0);
                var5.field_j = c.a(var5.field_j, -78, 16, param0);
                if (var3 != 0) {
                  var5.field_i = (short)param0.c((byte) -78, 16);
                  var5.field_A = c.a(var5.field_A, -77, 16, param0);
                  var5.field_G = c.a(var5.field_G, -51, 16, param0);
                  var5.field_D = c.a(var5.field_D, -13, 16, param0);
                  var5.field_y = c.a(var5.field_y, -110, 16, param0);
                  var5.field_I = c.a(var5.field_I, -41, 16, param0);
                  var5.field_K = c.a(var5.field_K, -15, 16, param0);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var4 != 0) {
                  discarded$1 = param0.c((byte) -78, 16);
                  var5.field_s = c.a(var5.field_s, -119, 16, param0);
                  var5.field_d = c.a(var5.field_d, -108, 16, param0);
                  var5.field_t = c.a(var5.field_t, param1 + -13589, 16, param0);
                  var5.field_x = c.a(var5.field_x, -120, 16, param0);
                  var5.field_O = c.a(var5.field_O, param1 + -13576, 16, param0);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (!tk.a(1, param0)) {
                  break L4;
                } else {
                  var5.field_S = c.a(var5.field_S, -27, 16, param0);
                  break L4;
                }
              }
              L5: {
                if (!tk.a(1, param0)) {
                  break L5;
                } else {
                  var5.field_z = ah.a(16, var5.field_z, param0, 8);
                  var6 = 0;
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var5.field_z.length) {
                      if (var6 == 0) {
                        var5.field_z = null;
                        break L5;
                      } else {
                        var5.field_a = (byte)(1 + var6);
                        break L5;
                      }
                    } else {
                      L7: {
                        if (var6 < (255 & var5.field_z[var7])) {
                          var6 = var5.field_z[var7] & 255;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackOut_24_0 = (wm) (var5);
              stackIn_25_0 = stackOut_24_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var2);
            stackOut_26_1 = new StringBuilder().append("qn.A(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
        return stackIn_25_0;
    }

    final boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var12 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = -this.field_M + (-this.field_l + (-param3 + param6));
                var9 = -this.field_N - this.field_u - (param5 - param4);
                if (this.field_F * this.field_F <= var9 * var9 + var8_int * var8_int) {
                  break L1;
                } else {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - bk.field_b;
                    if (0.0 <= var10) {
                      if (var10 > 0.0) {
                        var10 = var10 + 3.141592653589793 / (double)this.field_Q;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var10 = var10 - 3.141592653589793 / (double)this.field_Q;
                      break L2;
                    }
                  }
                  this.field_G = (int)(var10 * (double)this.field_Q / 6.283185307179586);
                  L3: while (true) {
                    if (this.field_Q > this.field_G) {
                      L4: while (true) {
                        if (0 <= this.field_G) {
                          break L1;
                        } else {
                          this.field_G = this.field_G + this.field_Q;
                          continue L4;
                        }
                      }
                    } else {
                      this.field_G = this.field_G - this.field_Q;
                      continue L3;
                    }
                  }
                }
              }
              stackOut_14_0 = 1;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var8);
            stackOut_16_1 = new StringBuilder().append("qn.NA(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_15_0 != 0;
    }

    private qn() throws Throwable {
        throw new Error();
    }

    static {
        field_K = 2;
        field_P = new p();
        field_L = "<%0> has resigned.";
        field_S = new java.util.zip.CRC32();
    }
}
