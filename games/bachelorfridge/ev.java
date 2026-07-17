/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ev implements Iterator {
    private eo field_c;
    private ou field_b;
    private eo field_a;

    public final void remove() {
        if (null == ((ev) this).field_a) {
            throw new IllegalStateException();
        }
        ((ev) this).field_a.b(0);
        ((ev) this).field_a = null;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = BachelorFridge.field_y;
        try {
          L0: {
            pga.field_b = new js(128);
            var1_int = 0;
            L1: while (true) {
              if (fla.field_t.length <= var1_int) {
                break L0;
              } else {
                pga.field_b.a((long)fla.field_t[var1_int].hashCode(), (byte) 61, (bw) (Object) new ji(var1_int));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "ev.A(" + 80 + 41);
        }
    }

    public final boolean hasNext() {
        return ((ev) this).field_b.field_a != ((ev) this).field_c;
    }

    final static sba a(int param0, int param1, vr param2, vr param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        sba stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        sba stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param0 == 128) {
              if (g.a(param4, param1, -30744, param2)) {
                stackOut_6_0 = wa.a(param0 + -21359, param3.b(-38, param4, param1));
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (sba) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ev.B(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param4 + 41);
        }
        return stackIn_7_0;
    }

    public final Object next() {
        eo var1 = ((ev) this).field_c;
        if (((ev) this).field_b.field_a != var1) {
            ((ev) this).field_c = var1.field_m;
        } else {
            ((ev) this).field_c = null;
            var1 = null;
        }
        ((ev) this).field_a = var1;
        return (Object) (Object) var1;
    }

    ev(ou param0) {
        ((ev) this).field_a = null;
        try {
            ((ev) this).field_b = param0;
            ((ev) this).field_c = ((ev) this).field_b.field_a.field_m;
            ((ev) this).field_a = null;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ev.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
