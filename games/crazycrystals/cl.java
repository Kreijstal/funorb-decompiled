/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cl extends hk {
    private int field_h;
    static int field_o;
    private int field_f;
    static int[] field_j;
    static String field_i;
    private int field_l;
    static ko field_m;
    private int field_k;
    static dl[] field_n;
    private int field_g;

    final void a(byte param0) {
        int var2 = 0;
        if (-1 > (this.field_h ^ -1)) {
          L0: {
            tb.field_d.a(d.field_b[this.field_k], 100, 128 * gi.field_m, this.field_l / this.field_h);
            this.field_k = this.field_k + 1;
            this.field_l = 0;
            this.field_h = 0;
            if ((this.field_f ^ -1) < -1) {
              tb.field_d.a(cj.field_x, 100, gi.field_m * 128, this.field_g / this.field_f);
              this.field_f = 0;
              this.field_g = 0;
              break L0;
            } else {
              break L0;
            }
          }
          var2 = 63 / ((29 - param0) / 42);
          return;
        } else {
          L1: {
            if ((this.field_f ^ -1) < -1) {
              tb.field_d.a(cj.field_x, 100, gi.field_m * 128, this.field_g / this.field_f);
              this.field_f = 0;
              this.field_g = 0;
              break L1;
            } else {
              break L1;
            }
          }
          var2 = 63 / ((29 - param0) / 42);
          return;
        }
    }

    final void a(int param0, int param1, ta param2) {
        ln var4 = null;
        int var5 = 0;
        try {
            var4 = (ln) (vm.field_j[param0].elementAt(r.field_i[param0]));
            if (param1 != 23041505) {
                field_m = (ko) null;
            }
            var5 = (18 + (m.field_l[param0] * 16384 + 73728)) / 37;
            if (var4.field_e < 0) {
                this.field_g = this.field_g + var5;
                this.field_f = this.field_f + 1;
            } else {
                this.field_l = this.field_l + var5;
                this.field_h = this.field_h + 1;
            }
            r.field_i[param0] = r.field_i[param0] + 1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "cl.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, ta param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (ma.field_n.length <= var3_int) {
                if (param0 == 19) {
                  break L0;
                } else {
                  this.field_l = 31;
                  return;
                }
              } else {
                fo.field_m[var3_int] = param1.field_g;
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("cl.L(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final pb b(byte param0) {
        if (param0 <= -127) {
            return null;
        }
        return (pb) null;
    }

    public static void c(int param0) {
        field_n = null;
        field_j = null;
        field_m = null;
        int var1 = -67 % ((param0 - -39) / 47);
        field_i = null;
    }

    cl() {
        this.field_h = 0;
        this.field_f = 0;
        this.field_l = 0;
        this.field_k = 0;
        this.field_g = 0;
    }

    static {
        field_o = 0;
        field_i = "You don't have to kill spiders, but you get points if you do. Here's a spider for you to practise on.";
    }
}
