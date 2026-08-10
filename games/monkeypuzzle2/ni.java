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
        return (Iterator) ((Object) new nd((ni) (this)));
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.f(8, 8);
            if (-1 <= (var2_int ^ -1)) {
              var3 = param1.f(param0 + -4, param0);
              var4 = new ed[var3];
              var5 = 0;
              L1: while (true) {
                if (var5 >= var3) {
                  stackIn_11_0 = (ed[]) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (vg.a(100, param1)) {
                      var6 = new ed();
                      param1.f(8, 24);
                      param1.f(8, 24);
                      var6.field_e = param1.f(8, 24);
                      param1.f(param0 + -4, 9);
                      param1.f(8, 12);
                      param1.f(8, 12);
                      param1.f(param0 + -4, 12);
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
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("ni.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ed[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_11_0;
        }
    }

    final void a(int param0, bf param1) {
        try {
            if (!(null == param1.field_e)) {
                param1.a(7847);
            }
            if (param0 != 12) {
                field_d = (String[]) null;
            }
            param1.field_g = this.field_b;
            param1.field_e = this.field_b.field_e;
            param1.field_e.field_g = param1;
            param1.field_g.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ni.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
            param0.removeKeyListener(wj.field_k);
            if (param1 > -123) {
                java.awt.Component var3 = (java.awt.Component) null;
                ni.a((java.awt.Component) null, (byte) -124);
            }
            param0.removeFocusListener(wj.field_k);
            vf.field_a = -1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ni.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final bf b(byte param0) {
        if (param0 > -73) {
            hb var3 = (hb) null;
            ni.a(109, (hb) null);
        }
        bf var2 = this.field_b.field_g;
        if (var2 == this.field_b) {
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
        if (param0 < 81) {
            return;
        }
        field_d = null;
    }

    static {
        field_d = new String[255];
        field_a = 0;
        field_c = new ai[4];
    }
}
