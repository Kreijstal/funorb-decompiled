/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ae implements Iterator {
    private tk field_e;
    static int field_b;
    static im field_d;
    private gp field_a;
    static String field_i;
    private tk field_h;
    static qh field_c;
    static jp[][] field_g;
    static int field_f;

    public static void a(byte param0) {
        field_i = null;
        field_c = null;
        field_d = null;
        if (param0 < 55) {
          return;
        }
        field_g = (jp[][]) null;
    }

    final static void b(byte param0) {
        va.field_a = false;
        if (param0 < 97) {
          ae.a((byte) -19);
        }
    }

    public final void remove() {
        if (null == this.field_h) {
          throw new IllegalStateException();
        }
        this.field_h.d(3);
        this.field_h = null;
    }

    public final Object next() {
        Object var1 = this.field_e;
        if (this.field_a.field_a == var1) {
          var1 = null;
          this.field_e = null;
        } else {
          this.field_e = ((tk) (var1)).field_s;
        }
        this.field_h = (tk) (var1);
        return var1;
    }

    public final boolean hasNext() {
        return this.field_a.field_a != this.field_e;
    }

    final static jp[] a(int param0, int param1, int param2, mf param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        jp[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -23176) {
            ae.a((byte) -84);
          }
          if (ln.a(-107, param0, param3, param2)) {
            stackIn_6_0 = rd.c(117);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (jp[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ae.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    ae(gp param0) {
        this.field_h = null;
        try {
          this.field_a = param0;
          this.field_e = this.field_a.field_a.field_s;
          this.field_h = null;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ae.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Name";
        field_d = new im();
        field_c = new qh();
    }
}
