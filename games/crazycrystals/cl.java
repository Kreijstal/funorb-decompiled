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
        int var2Lifetime1;
        if (this.field_h <= 0) {
          if (this.field_f > 0) {
            tb.field_d.a(cj.field_x, 100, gi.field_m * 128, this.field_g / this.field_f);
            this.field_f = 0;
            this.field_g = 0;
          }
          var2 = 63 / ((29 - param0) / 42);
          return;
        }
        tb.field_d.a(d.field_b[this.field_k], 100, 128 * gi.field_m, this.field_l / this.field_h);
        this.field_k = this.field_k + 1;
        this.field_l = 0;
        this.field_h = 0;
        if (this.field_f > 0) {
          tb.field_d.a(cj.field_x, 100, gi.field_m * 128, this.field_g / this.field_f);
          this.field_f = 0;
          this.field_g = 0;
        }
        var2Lifetime1 = 63 / ((29 - param0) / 42);
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = CrazyCrystals.field_B;
        try {
          for (var3_int = 0; ma.field_n.length > var3_int; var3_int++) {
            fo.field_m[var3_int] = param1.field_g;
          }
          if (param0 == 19) {
            return;
          }
          this.field_l = 31;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("cl.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
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
        int var1 = -67 % ((param0 + 39) / 47);
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
