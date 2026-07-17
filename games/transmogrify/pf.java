/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pf implements Iterable {
    static byte[][] field_a;
    static int field_b;
    static ti[] field_h;
    static int field_g;
    ri field_e;
    static String field_c;
    static String field_f;
    static ti field_d;
    static String field_i;

    final ri a(boolean param0) {
        ri var2 = null;
        Object var3 = null;
        var2 = ((pf) this).field_e.field_h;
        if (((pf) this).field_e != var2) {
          if (param0) {
            var3 = null;
            ((pf) this).a(true, (ri) null);
            var2.b((byte) -74);
            return var2;
          } else {
            var2.b((byte) -74);
            return var2;
          }
        } else {
          return null;
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new wg((pf) this);
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        field_f = null;
        field_a = null;
        field_i = null;
        field_d = null;
    }

    private pf() throws Throwable {
        throw new Error();
    }

    final void a(boolean param0, ri param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (null == param1.field_g) {
                break L1;
              } else {
                param1.b((byte) -116);
                break L1;
              }
            }
            param1.field_g = ((pf) this).field_e.field_g;
            param1.field_h = ((pf) this).field_e;
            param1.field_g.field_h = param1;
            param1.field_h.field_g = param1;
            if (!param0) {
              break L0;
            } else {
              ri discarded$2 = ((pf) this).a(true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("pf.C(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new byte[1000][];
        field_g = -2147483648;
        field_f = "Sound: ";
        field_c = "Email: ";
        field_i = "Confirm Email:";
    }
}
