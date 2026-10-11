/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ts extends td {
    static sna field_r;
    static String field_q;
    static String field_p;

    ts(int param0, aga param1, nq param2) {
        super(param0, param1);
        try {
          this.field_j = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ts.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.awt.Frame a(int param0, ht param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        lba[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        lba[] var10 = null;
        eh var11 = null;
        var9 = BachelorFridge.field_y;
        try {
          if (!param1.b(34)) {
            return null;
          }
          if (0 == param5) {
            var10 = we.a((byte) -57, param1);
            var6 = var10;
            if (var6 == null) {
              stackIn_7_0 = null;
              return (java.awt.Frame) (stackIn_7_0);
            }
            var7_int = 0;
            for (var8 = 0; var8 < var10.length; var8++) {
              if (var10[var8].field_d == param2 &&
                var10[var8].field_e == param0 && ((0 == param3 ||
                param3 == var10[var8].field_b) &&
                (var7_int == 0 ||
                !(var10[var8].field_a <= param5)))) {
                var7_int = 1;
                param5 = var10[var8].field_a;
              }
            }
            if (var7_int == 0) {
              stackIn_27_0 = null;
              return (java.awt.Frame) (stackIn_27_0);
            }
          }
          var11 = param1.a(param5, param2, param4 ^ 124, param0, param3);
          while (var11.field_f == 0) {
            gda.a(false, 10L);
          }
          var7 = (java.awt.Frame) (var11.field_e);
          if (var7 == null) {
            stackIn_33_0 = null;
            return (java.awt.Frame) (stackIn_33_0);
          }
          if (param4 != var11.field_f) {
            return var7;
          }
          gv.a(-111, param1, var7);
          stackIn_37_0 = null;
          return (java.awt.Frame) (stackIn_37_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_40_0 = var6_ref;
          stackIn_40_1 = new StringBuilder().append("ts.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        field_p = null;
        field_q = null;
        field_r = null;
        if (!param0) {
          field_q = (String) null;
        }
    }

    final ii a(op param0, int param1) {
        aga var3 = null;
        RuntimeException var3_ref = null;
        aga var4 = null;
        lca var5 = null;
        int var6 = 0;
        int var7 = 0;
        ii stackIn_2_0 = null;
        ew stackIn_5_0 = null;
        lca stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3) {
            stackIn_2_0 = (ii) null;
            return stackIn_2_0;
          }
          var3 = this.field_h.a(61, param0);
          var4 = this.field_j.a(param1 ^ 96, param0);
          if (var4 == null) {
            stackIn_5_0 = new ew(new nq(var3));
            return (ii) ((Object) stackIn_5_0);
          }
          var5 = new lca(this.field_g, new nq(var3), this.field_j);
          var6 = var4.c(param1 ^ 119);
          var7 = kla.a(var6, param0.field_w, param1 + 2147483645);
          var5.field_o.a(new ela(new nq(var4), var7), true);
          stackIn_7_0 = var5;
          return (ii) ((Object) stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ts.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_q = "Real-life threats";
        field_p = "OFFERED DRAW";
    }
}
