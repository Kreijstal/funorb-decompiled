/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lj implements Iterable {
    static int[] field_c;
    static String field_b;
    ta field_a;
    static int field_d;

    public static void b() {
        field_b = null;
        field_c = null;
        int var1 = 23;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new wo((lj) this);
    }

    final void a(ta param0, byte param1) {
        try {
            if (!(param0.field_j == null)) {
                param0.h(0);
            }
            param0.field_p = ((lj) this).field_a;
            param0.field_j = ((lj) this).field_a.field_j;
            param0.field_j.field_p = param0;
            if (param1 >= -13) {
                field_b = null;
            }
            param0.field_p.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "lj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(nj param0, byte param1) {
        synchronized (Torquing.field_v) {
            int var3 = 127 / ((17 - param1) / 41);
            Torquing.field_v.field_r.a((lf) (Object) param0);
        }
    }

    final static String a(byte[] param0) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = hk.a(param0.length, true, 0, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("lj.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + false + ')');
        }
        return stackIn_3_0;
    }

    final ta a(int param0) {
        ta var2 = null;
        var2 = ((lj) this).field_a.field_p;
        if (param0 == 4) {
          if (var2 == ((lj) this).field_a) {
            return null;
          } else {
            var2.h(0);
            return var2;
          }
        } else {
          ta discarded$7 = ((lj) this).a(121);
          if (var2 == ((lj) this).field_a) {
            return null;
          } else {
            var2.h(0);
            return var2;
          }
        }
    }

    private lj() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[4];
        field_b = "LEVEL:";
    }
}
