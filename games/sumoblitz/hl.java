/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hl implements Iterable {
    static ki field_d;
    pj field_c;
    static volatile int field_b;
    static boolean field_e;
    private pj field_a;

    final pj b(byte param0) {
        pj var2 = null;
        pj var2Lifetime1;
        if (param0 != -61) {
          hl.a(102);
          var2 = this.field_c.field_m;
          if (var2 != this.field_c) {
            var2.c(param0 - 5045);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_c.field_m;
        if (var2Lifetime1 != this.field_c) {
          var2Lifetime1.c(param0 - 5045);
          return var2Lifetime1;
        }
        return null;
    }

    private final pj a(pj param0, int param1) {
        pj var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        pj stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            hl.a(-51);
          }
          if (param0 == null) {
            var3 = this.field_c.field_m;
          } else {
            var3 = param0;
          }
          if (var3 == this.field_c) {
            this.field_a = null;
            stackIn_8_0 = null;
            return (pj) (stackIn_8_0);
          }
          this.field_a = var3.field_m;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("hl.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new vv(this));
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 >= -59) {
          hl.a(-11);
        }
    }

    final pj b(int param0) {
        if (param0 != -1) {
          return (pj) null;
        }
        return this.a((pj) null, param0 + 0);
    }

    final pj a(byte param0) {
        pj var2 = this.field_a;
        if (this.field_c == var2) {
          this.field_a = null;
          return null;
        }
        if (param0 == -122) {
          this.field_a = var2.field_m;
          return var2;
        }
        return (pj) null;
    }

    hl() {
        this.field_c = new pj();
        this.field_c.field_o = this.field_c;
        this.field_c.field_m = this.field_c;
    }

    final void a(pj param0, byte param1) {
        if (param0.field_o != null) {
          param0.c(-5106);
        }
        param0.field_m = this.field_c;
        param0.field_o = this.field_c.field_o;
        if (param1 >= -103) {
          return;
        }
        try {
          param0.field_o.field_m = param0;
          param0.field_m.field_o = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "hl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = -1;
    }
}
