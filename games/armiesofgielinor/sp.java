/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sp implements Iterator {
    static String field_d;
    private ms field_a;
    private wg field_c;
    static String field_g;
    static int field_b;
    private ms field_f;
    static double field_e;

    final static java.awt.Container a(int param0) {
        if (!(null == g.field_f)) {
            return (java.awt.Container) (Object) g.field_f;
        }
        field_g = null;
        return (java.awt.Container) (Object) ag.d((byte) -124);
    }

    final static d a(kl param0, int param1, int param2, int param3, kl param4) {
        RuntimeException var5 = null;
        d stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        d stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (kp.a(false, param3, param0, param1)) {
              stackOut_3_0 = gm.a(param4.a((byte) 58, param1, param3), 126);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("sp.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(0).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_4_0;
    }

    public final void remove() {
        if (!(null != ((sp) this).field_a)) {
            throw new IllegalStateException();
        }
        ((sp) this).field_a.c((byte) -76);
        ((sp) this).field_a = null;
    }

    final static je b(byte param0) {
        if (param0 >= -80) {
            je discarded$0 = sp.b((byte) -47);
            return bv.field_x.field_Jb;
        }
        return bv.field_x.field_Jb;
    }

    public final boolean hasNext() {
        return ((sp) this).field_f != ((sp) this).field_c.field_f;
    }

    public static void a(byte param0) {
        field_d = null;
        field_g = null;
    }

    public final Object next() {
        ms var1 = ((sp) this).field_f;
        if (((sp) this).field_c.field_f != var1) {
            ((sp) this).field_f = var1.field_s;
        } else {
            var1 = null;
            ((sp) this).field_f = null;
        }
        ((sp) this).field_a = var1;
        return (Object) (Object) var1;
    }

    sp(wg param0) {
        ((sp) this).field_a = null;
        try {
            ((sp) this).field_c = param0;
            ((sp) this).field_a = null;
            ((sp) this).field_f = ((sp) this).field_c.field_f.field_s;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "sp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "This unit has no use for this accessory.";
        field_g = "Drawn";
        field_b = 0;
        field_e = 0.0;
    }
}
