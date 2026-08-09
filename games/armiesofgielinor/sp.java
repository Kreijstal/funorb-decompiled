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
            return (java.awt.Container) ((Object) g.field_f);
        }
        if (param0 != 0) {
            field_g = (String) null;
            return (java.awt.Container) ((Object) ag.d((byte) -124));
        }
        return (java.awt.Container) ((Object) ag.d((byte) -124));
    }

    final static d a(kl param0, int param1, int param2, int param3, kl param4) {
        RuntimeException var5 = null;
        d stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                field_e = 2.5194855074937275;
                break L1;
              }
            }
            if (kp.a(false, param3, param0, param1)) {
              stackIn_6_0 = gm.a(param4.a((byte) 58, param1, param3), 126);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("sp.C(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    public final void remove() {
        if (!(null != this.field_a)) {
            throw new IllegalStateException();
        }
        this.field_a.c((byte) -76);
        this.field_a = null;
    }

    final static je b(byte param0) {
        if (param0 >= -80) {
            sp.b((byte) -47);
            return bv.field_x.field_Jb;
        }
        return bv.field_x.field_Jb;
    }

    public final boolean hasNext() {
        return this.field_f != this.field_c.field_f;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 > -60) {
            sp.b((byte) -85);
            field_g = null;
            return;
        }
        field_g = null;
    }

    public final Object next() {
        Object var1 = this.field_f;
        if (this.field_c.field_f != var1) {
            this.field_f = ((ms) (var1)).field_s;
        } else {
            var1 = null;
            this.field_f = null;
        }
        this.field_a = (ms) (var1);
        return var1;
    }

    sp(wg param0) {
        this.field_a = null;
        try {
            this.field_c = param0;
            this.field_a = null;
            this.field_f = this.field_c.field_f.field_s;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "sp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "This unit has no use for this accessory.";
        field_g = "Drawn";
        field_b = 0;
        field_e = 0.0;
    }
}
