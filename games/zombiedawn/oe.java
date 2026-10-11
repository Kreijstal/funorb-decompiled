/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oe {
    int field_g;
    int[] field_e;
    static String field_d;
    static String field_f;
    static af field_a;
    int field_b;
    static fn field_c;

    final int a(int param0) {
        int var2;
        int stackIn_5_0 = 0;
        var2 = -58 / ((10 - param0) / 54);
        if (this.field_e != null &&
          this.field_e.length != 0) {
          stackIn_5_0 = this.field_e[this.field_e.length - 1];
        } else {
          stackIn_5_0 = 0;
        }
        return stackIn_5_0;
    }

    final static void a(byte param0) {
        int var1 = ma.d((byte) 78);
        int var3 = 109 % ((param0 - 9) / 62);
        int var2 = bj.a(true);
        cl.field_b.a(var1 + (pg.field_o << 1), el.field_k - el.field_d, eb.field_c - pg.field_o, (byte) -128, (el.field_d << 1) + var2);
        ll.a(-67);
    }

    public static void c(int param0) {
        field_f = null;
        field_a = null;
        if (param0 != 15) {
          return;
        }
        field_c = null;
        field_d = null;
    }

    final static void a(int param0, int param1, mg param2) {
        am var3 = dp.field_e;
        if (param1 != -19004) {
          return;
        }
        try {
          var3.j(11, param0);
          var3.i(param2.field_h, 70);
          var3.i(param2.field_i, param1 + 19119);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "oe.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        try {
          ij.field_L = new u[15];
          ij.field_L[0] = new u(fb.field_w, 0, 0);
          var1_int = pb.a(so.field_a, 50, 1) + 30;
          var2 = 1;
          for (var3 = param0; 15 > var3; var3++) {
            ij.field_L[var3] = new u(cn.field_a, var2, var1_int);
            var1_int = var1_int + (pb.a(so.field_a, 100, param0 ^ 0) + 75);
            if (var3 == 7) {
              var2 = 2;
              var1_int = pb.a(so.field_a, 10, param0 + 0);
            }
          }
          ip.c(param0 ^ -63);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "oe.C(" + param0 + ')');
        }
    }

    final static void a(int param0, aa param1) {
        int var2_int = 0;
        aa var3 = null;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ZombieDawn.field_J;
        try {
          if (null == param1.field_k) {
            return;
          }
          if (param1.field_i != 0 ||
            param1.field_b != 0) {
            for (var2_int = 0; var2_int < tb.field_E; var2_int++) {
              var3 = cc.field_m[var2_int];
              if (var3.field_j == 2 &&
                var3.field_i == param1.field_i &&
                param1.field_b == var3.field_b) {
                return;
              }
            }
          }
          if (null != param1.field_e) {
          }
          if (param0 != 0) {
            field_c = (fn) null;
          }
          jk.a((byte) -126, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("oe.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = ZombieDawn.field_J;
        if (param1 != 0) {
          oe.a((byte) -32);
        }
        if (this.field_e != null &&
          this.field_e.length != 0) {
          for (var3 = 1; this.field_e.length > var3; var3++) {
            if ((this.field_e[var3] + this.field_e[-1 + var3] >> 1) > param0) {
              return -1 + var3;
            }
          }
          return this.field_e.length - 1;
        }
        return 0;
    }

    oe(int param0, int param1, int param2) {
        this.field_b = param0;
        this.field_e = new int[param2 + 1];
        this.field_g = param1;
    }

    static {
        field_d = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_f = "Next";
        field_a = new af();
    }
}
