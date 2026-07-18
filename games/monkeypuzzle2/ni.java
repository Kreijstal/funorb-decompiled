/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ni implements Iterable {
    bf field_b;
    static java.applet.Applet field_e;
    static String[] field_d;
    static int field_a;
    static ai[] field_c;

    public final Iterator iterator() {
        return (Iterator) (Object) new nd((ni) this);
    }

    final static ed[] a(int param0, hb param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ed[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        ed var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        ed[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        ed[] stackOut_10_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.f(8, 8);
            if (var2_int <= 0) {
              var3 = param1.f(param0 + -4, param0);
              var4 = new ed[var3];
              var5 = 0;
              L1: while (true) {
                if (var5 >= var3) {
                  stackOut_10_0 = (ed[]) var4;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  L2: {
                    if (vg.a(100, param1)) {
                      var6 = new ed();
                      int discarded$12 = param1.f(8, 24);
                      int discarded$13 = param1.f(8, 24);
                      var6.field_e = param1.f(8, 24);
                      int discarded$14 = param1.f(param0 + -4, 9);
                      int discarded$15 = param1.f(8, 12);
                      int discarded$16 = param1.f(8, 12);
                      int discarded$17 = param1.f(param0 + -4, 12);
                      var4[var5] = var6;
                      break L2;
                    } else {
                      var6_int = param1.f(param0 ^ 4, qg.a((byte) 105, var5 + -1));
                      var4[var5] = var4[var6_int];
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (ed[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("ni.C(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw la.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0;
    }

    final void a(int param0, bf param1) {
        try {
            if (!(null == param1.field_e)) {
                param1.a(7847);
            }
            if (param0 != 12) {
                field_d = null;
            }
            param1.field_g = ((ni) this).field_b;
            param1.field_e = ((ni) this).field_b.field_e;
            param1.field_e.field_g = param1;
            param1.field_g.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "ni.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
            param0.removeKeyListener((java.awt.event.KeyListener) (Object) wj.field_k);
            param0.removeFocusListener((java.awt.event.FocusListener) (Object) wj.field_k);
            vf.field_a = -1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "ni.D(" + (param0 != null ? "{...}" : "null") + ',' + -124 + ')');
        }
    }

    final bf b(byte param0) {
        if (param0 > -73) {
            Object var3 = null;
            ed[] discarded$0 = ni.a(109, (hb) null);
        }
        bf var2 = ((ni) this).field_b.field_g;
        if (var2 == ((ni) this).field_b) {
            return null;
        }
        var2.a(7847);
        return var2;
    }

    private ni() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[255];
        field_a = 0;
        field_c = new ai[4];
    }
}
