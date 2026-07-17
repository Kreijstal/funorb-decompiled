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
        field_g = null;
    }

    final static void b(byte param0) {
        va.field_a = false;
        if (param0 < 97) {
            ae.a((byte) -19);
        }
    }

    public final void remove() {
        if (null == ((ae) this).field_h) {
            throw new IllegalStateException();
        }
        ((ae) this).field_h.d(3);
        ((ae) this).field_h = null;
    }

    public final Object next() {
        tk var1 = ((ae) this).field_e;
        if (((ae) this).field_a.field_a == var1) {
            var1 = null;
            ((ae) this).field_e = null;
        } else {
            ((ae) this).field_e = var1.field_s;
        }
        ((ae) this).field_h = var1;
        return (Object) (Object) var1;
    }

    public final boolean hasNext() {
        return ((ae) this).field_a.field_a != ((ae) this).field_e;
    }

    final static jp[] a(int param0, int param1, int param2, mf param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        jp[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp[] stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -23176) {
                break L1;
              } else {
                ae.a((byte) -84);
                break L1;
              }
            }
            if (ln.a(-107, param0, param3, param2)) {
              stackOut_5_0 = rd.c(117);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (jp[]) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("ae.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    ae(gp param0) {
        ((ae) this).field_h = null;
        try {
            ((ae) this).field_a = param0;
            ((ae) this).field_e = ((ae) this).field_a.field_a.field_s;
            ((ae) this).field_h = null;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ae.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Name";
        field_d = new im();
        field_c = new qh();
    }
}
