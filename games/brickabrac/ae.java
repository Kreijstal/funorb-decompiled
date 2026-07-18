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
        Object stackIn_2_0 = null;
        jp[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (ln.a(-107, param0, param3, param2)) {
              int discarded$2 = 117;
              stackOut_3_0 = rd.c();
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (jp[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ae.B(").append(param0).append(',').append(-23176).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    ae(gp param0) {
        ((ae) this).field_h = null;
        try {
            ((ae) this).field_a = param0;
            ((ae) this).field_e = ((ae) this).field_a.field_a.field_s;
            ((ae) this).field_h = null;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ae.<init>(" + (param0 != null ? "{...}" : "null") + ')');
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
