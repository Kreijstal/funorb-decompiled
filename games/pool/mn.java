/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mn implements Iterator {
    static vh field_e;
    static int field_a;
    private rg field_b;
    static int field_g;
    private rg field_c;
    static String field_d;
    private qi field_f;

    final static kf a(int param0, nb param1) {
        kf var2 = null;
        RuntimeException var2_ref = null;
        kf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = new kf(param1, param1);
              oj.field_o.b((byte) -74, var2);
              if (param0 == -24296) {
                break L1;
              } else {
                mn.a(-16);
                break L1;
              }
            }
            qf.field_d.b(param1);
            stackIn_3_0 = (kf) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("mn.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final boolean hasNext() {
        return this.field_f.field_d != this.field_c;
    }

    final static boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (!param0) {
          L0: {
            mn.a(69);
            if (ig.field_j.a(114)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (ig.field_j.a(114)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final void remove() {
        if (!(null != this.field_b)) {
            throw new IllegalStateException();
        }
        this.field_b.a(false);
        this.field_b = null;
    }

    public final Object next() {
        Object var1 = this.field_c;
        if (this.field_f.field_d == var1) {
            var1 = null;
            this.field_c = null;
        } else {
            this.field_c = ((rg) (var1)).field_q;
        }
        this.field_b = (rg) (var1);
        return var1;
    }

    public static void a(int param0) {
        if (param0 != 19000) {
            field_g = 83;
            field_e = null;
            field_d = null;
            return;
        }
        field_e = null;
        field_d = null;
    }

    mn(qi param0) {
        this.field_b = null;
        try {
            this.field_f = param0;
            this.field_c = this.field_f.field_d.field_q;
            this.field_b = null;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "mn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Catching breath!";
    }
}
