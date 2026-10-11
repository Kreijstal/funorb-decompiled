/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pj extends mi {
    private int field_I;
    private int field_J;
    static rc field_P;
    static ji field_G;
    private int field_N;
    static kl field_M;
    private boolean field_O;
    static String field_L;
    private boolean field_K;
    private int field_H;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = wizardrun.field_H;
        if (param7 < param0) {
          if (param0 < param4) {
            a.a(param6, param5, param0, param2, ed.field_k, param3, param4, -20476, param7);
          } else {
            if (param4 <= param7) {
              a.a(param3, param5, param7, param6, ed.field_k, param2, param0, -20476, param4);
            } else {
              a.a(param3, param5, param4, param2, ed.field_k, param6, param0, -20476, param7);
            }
          }
        } else {
          if (param7 < param4) {
            a.a(param6, param5, param7, param3, ed.field_k, param2, param4, -20476, param0);
          } else {
            if (param4 > param0) {
              a.a(param2, param5, param4, param3, ed.field_k, param6, param7, -20476, param0);
            } else {
              a.a(param2, param5, param0, param6, ed.field_k, param3, param7, -20476, param4);
            }
          }
        }
        if (param1 == 0) {
          return;
        }
        pj.g(24);
    }

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 102) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param3, param0, param2, true)) {
            this.a(109, param2, param0, param3);
            this.a(param3, param2, param0, (byte) -101);
            discarded$62 = param3.append(" revert=").append(this.field_K);
            if (this.field_N != 2147483647 &&
              this.field_J != 2147483647) {
              discarded$63 = param3.append(" to ").append(this.field_N).append(',').append(this.field_J);
            }
          }
          stackIn_10_0 = (StringBuilder) (param3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("pj.U(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_L = null;
        field_M = null;
        field_G = null;
        field_P = null;
        if (param0 < 103) {
          pj.g(-92);
        }
    }

    final void e(int param0) {
        super.e(param0);
        this.field_F.a(110, 0, this.field_n, this.field_r, 0);
        this.field_N = this.field_o;
        this.field_J = this.field_l;
    }

    final void a(int param0, int param1, int param2, int param3, ub param4, int param5) {
        try {
          super.a(param0, param1, param2, param3, param4, param5);
          this.field_q = 0;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "pj.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, int param2, ub param3) {
        int stackIn_17_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_24_1 = 0;
        int stackIn_25_2 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_F instanceof pl) ||
            ((pl) (this.field_F)).field_B) &&
            this.field_q == 1) {
            var5_int = -this.field_H + (pg.field_n - param2);
            var6 = -this.field_I + (fi.field_B - param1);
            if (this.field_o != var5_int ||
              this.field_l != var6) {
              this.field_l = var6;
              this.field_o = var5_int;
              if (this.field_s instanceof ah) {
                ((ah) (this.field_s)).a(param2, this, param1, param0 ^ 10000622);
              }
            }
          } else {
            if (this.field_K) {
              if (this.field_N != this.field_o) {
                var5_int = -this.field_o + this.field_N;
                stackIn_17_1 = this.field_o;
                if (2 < Math.abs(var5_int)) {
                  stackIn_18_2 = var5_int >> 1;
                } else {
                  if (var5_int > 0) {
                    stackIn_18_2 = 1;
                  } else {
                    stackIn_18_2 = -1;
                  }
                }
                this.field_o = stackIn_17_1 + stackIn_18_2;
              }
              if (this.field_J != this.field_l) {
                var5_int = this.field_J - this.field_l;
                stackIn_24_1 = this.field_l;
                if (Math.abs(var5_int) > 2) {
                  stackIn_25_2 = var5_int >> 1;
                } else {
                  if (var5_int > 0) {
                    stackIn_25_2 = 1;
                  } else {
                    stackIn_25_2 = -1;
                  }
                }
                this.field_l = stackIn_24_1 + stackIn_25_2;
              }
            }
          }
          super.a(param0, param1, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("pj.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, (byte) 48, param2, param3, param4, param5, param6) ? 1 : 0;
          var9 = -58 % ((12 - param1) / 36);
          if (var8_int != 0 &&
            this.field_O) {
            return true;
          }
          if (!this.b(param5, param2, 0, param0, param3)) {
            stackIn_10_0 = var8_int;
            return stackIn_10_0 != 0;
          }
          if (param4 == 1) {
            tg.field_h = this;
            this.field_H = param2 - this.field_o - param0;
            this.field_I = -this.field_l + param5 - param3;
          }
          this.field_q = param4;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("pj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void f(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        sc var4 = null;
        int var4_int = 0;
        int var5 = 0;
        dc var5_ref_dc = null;
        int[] var6 = null;
        int var8 = 0;
        mg var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = wizardrun.field_H;
        try {
          var9 = nk.field_N;
          if (param0 != -17144) {
            pj.f(16);
          }
          var2 = var9.f(255);
          var3 = var9.f(255);
          if (var2 == 0) {
            var4 = (sc) (tg.field_c.b((byte) 110));
            if (var4 == null) {
              ql.a(-64);
              return;
            }
            var5 = -var9.field_m + gd.field_c;
            var11 = var4.field_n;
            var10 = var11;
            var6 = var10;
            if (var5 > var11.length << 2) {
              var5 = var11.length << 2;
            }
            for (var7 = 0; var5 > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.f(255) << kl.b(768, var7 << 8));
            }
            var4.field_j = true;
            var4.a(false);
            return;
          }
          if (var2 != 1) {
            rg.a((Throwable) null, "LR1: " + ni.c(6), -562);
            ql.a(-66);
            return;
          }
          var4_int = var9.a(param0 + 37623);
          var5_ref_dc = (dc) (v.field_d.b((byte) 100));
          while (var5_ref_dc != null) {
            if (var5_ref_dc.field_k != var3 ||
              var4_int != var5_ref_dc.field_m) {
              var5_ref_dc = (dc) (v.field_d.d(param0 ^ -25336));
              continue;
            }
            break;
          }
          if (var5_ref_dc != null) {
            var5_ref_dc.a(false);
            return;
          }
          ql.a(-100);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "pj.NA(" + param0 + ')');
        }
    }

    private pj(int param0, int param1, int param2, int param3, bf param4, ce param5, ub param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_J = 2147483647;
        this.field_N = 2147483647;
        try {
          this.field_K = param7 ? true : false;
          this.field_O = param8 ? true : false;
          this.field_F = param6;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "pj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_P = new rc();
        field_L = "This password contains repeated characters, and would be easy to guess";
    }
}
