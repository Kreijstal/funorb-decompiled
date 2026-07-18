/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hs implements Iterable {
    wt field_c;
    private wt field_b;
    static int[] field_a;

    final static boolean a(boolean param0, int param1, int param2) {
        return to.b(-7493, param1, param2) & la.a(param2, param1, (byte) 70);
    }

    final void a(wt param0, byte param1) {
        try {
            if (!(null == param0.field_f)) {
                param0.d(-114);
            }
            param0.field_j = ((hs) this).field_c;
            param0.field_f = ((hs) this).field_c.field_f;
            param0.field_f.field_j = param0;
            int var3_int = 43 % ((-3 - param1) / 51);
            param0.field_j.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "hs.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new js((hs) this);
    }

    final wt a(boolean param0) {
        wt var2 = null;
        var2 = ((hs) this).field_b;
        if (var2 == ((hs) this).field_c) {
          ((hs) this).field_b = null;
          return null;
        } else {
          ((hs) this).field_b = var2.field_j;
          if (!param0) {
            return null;
          } else {
            return var2;
          }
        }
    }

    private final wt a(wt param0, int param1) {
        wt var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        wt stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        wt stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                var3 = param0;
                break L1;
              } else {
                var3 = ((hs) this).field_c.field_j;
                break L1;
              }
            }
            if (((hs) this).field_c == var3) {
              ((hs) this).field_b = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (wt) (Object) stackIn_6_0;
            } else {
              ((hs) this).field_b = var3.field_j;
              stackOut_7_0 = (wt) var3;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("hs.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + 128 + ')');
        }
        return stackIn_8_0;
    }

    final wt a(int param0) {
        int var2 = -23 / ((param0 - -5) / 45);
        return this.a((wt) null, 128);
    }

    final wt b(boolean param0) {
        wt var2 = null;
        var2 = ((hs) this).field_c.field_j;
        if (var2 != ((hs) this).field_c) {
          var2.d(-119);
          if (param0) {
            return null;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    hs() {
        ((hs) this).field_c = new wt();
        ((hs) this).field_c.field_j = ((hs) this).field_c;
        ((hs) this).field_c.field_f = ((hs) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[128];
    }
}
