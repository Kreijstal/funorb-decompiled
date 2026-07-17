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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        kf stackOut_2_0 = null;
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
            L1: {
              var2 = new kf(param1, (ma) (Object) param1);
              oj.field_o.b((byte) -74, (ma) (Object) var2);
              if (param0 == -24296) {
                break L1;
              } else {
                mn.a(-16);
                break L1;
              }
            }
            qf.field_d.b((kd) (Object) param1);
            stackOut_2_0 = (kf) var2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("mn.A(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    public final boolean hasNext() {
        return ((mn) this).field_f.field_d != ((mn) this).field_c;
    }

    final static boolean a() {
        return !ig.field_j.a(114);
    }

    public final void remove() {
        if (!(null != ((mn) this).field_b)) {
            throw new IllegalStateException();
        }
        ((mn) this).field_b.a(false);
        ((mn) this).field_b = null;
    }

    public final Object next() {
        rg var1 = ((mn) this).field_c;
        if (((mn) this).field_f.field_d == var1) {
            var1 = null;
            ((mn) this).field_c = null;
        } else {
            ((mn) this).field_c = var1.field_q;
        }
        ((mn) this).field_b = var1;
        return (Object) (Object) var1;
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
        ((mn) this).field_b = null;
        try {
            ((mn) this).field_f = param0;
            ((mn) this).field_c = ((mn) this).field_f.field_d.field_q;
            ((mn) this).field_b = null;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "mn.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Catching breath!";
    }
}
