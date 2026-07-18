/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sr implements Iterable {
    gp field_b;
    static int field_a;
    static String field_d;
    static String field_c;

    public final Iterator iterator() {
        return (Iterator) (Object) new cf((sr) this);
    }

    final gp a(int param0) {
        gp var2 = null;
        var2 = ((sr) this).field_b.field_p;
        if (param0 < -3) {
          if (var2 == ((sr) this).field_b) {
            return null;
          } else {
            var2.a(-120);
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void a() {
        field_d = null;
        field_c = null;
    }

    final void a(byte param0, gp param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1.field_o != null) {
                param1.a(-120);
                break L1;
              } else {
                break L1;
              }
            }
            param1.field_p = ((sr) this).field_b;
            param1.field_o = ((sr) this).field_b.field_o;
            param1.field_o.field_p = param1;
            param1.field_p.field_o = param1;
            if (param0 >= 7) {
              break L0;
            } else {
              Iterator discarded$2 = ((sr) this).iterator();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("sr.C(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    sr() {
        ((sr) this).field_b = new gp();
        ((sr) this).field_b.field_p = ((sr) this).field_b;
        ((sr) this).field_b.field_o = ((sr) this).field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Please check if address is correct";
        field_c = "game over";
    }
}
