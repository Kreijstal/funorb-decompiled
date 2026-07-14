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
        int var2 = 0;
        int var3 = 0;
        ed[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        ed var6 = null;
        int var7 = 0;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = param1.f(8, 8);
        if (-1 <= (var2 ^ -1)) {
          var3 = param1.f(param0 + -4, param0);
          var4 = new ed[var3];
          var5 = 0;
          L0: while (true) {
            if (var5 >= var3) {
              return var4;
            } else {
              if (vg.a(100, param1)) {
                var6 = new ed();
                int discarded$6 = param1.f(8, 24);
                int discarded$7 = param1.f(8, 24);
                var6.field_e = param1.f(8, 24);
                int discarded$8 = param1.f(param0 + -4, 9);
                int discarded$9 = param1.f(8, 12);
                int discarded$10 = param1.f(8, 12);
                int discarded$11 = param1.f(param0 + -4, 12);
                var4[var5] = var6;
                var5++;
                continue L0;
              } else {
                var6_int = param1.f(param0 ^ 4, qg.a((byte) 105, var5 + -1));
                var4[var5] = var4[var6_int];
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, bf param1) {
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
    }

    final static void a(java.awt.Component param0, byte param1) {
        param0.removeKeyListener((java.awt.event.KeyListener) (Object) wj.field_k);
        if (param1 > -123) {
            Object var3 = null;
            ni.a((java.awt.Component) null, (byte) -124);
        }
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) wj.field_k);
        vf.field_a = -1;
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
        if (param0 < 81) {
            return;
        }
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
