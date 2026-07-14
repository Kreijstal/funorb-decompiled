/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wh implements Iterator {
    private rf field_a;
    static int[] field_e;
    private ek field_b;
    private int field_c;
    private rf field_d;

    final static void b(int param0) {
        qb.b(-1);
        ic.field_a = true;
        if (param0 <= 63) {
          wh.a(false);
          tc.field_x = true;
          ti.field_b.l(26756);
          sc.a(false, (byte) 118, ui.field_n);
          return;
        } else {
          tc.field_x = true;
          ti.field_b.l(26756);
          sc.a(false, (byte) 118, ui.field_n);
          return;
        }
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = StarCannon.field_A;
        if (((wh) this).field_a == ((wh) this).field_b.field_a[((wh) this).field_c + -1]) {
          L0: while (true) {
            if (((wh) this).field_b.field_c > ((wh) this).field_c) {
              ((wh) this).field_c = ((wh) this).field_c + 1;
              if (((wh) this).field_b.field_a[((wh) this).field_c].field_a != ((wh) this).field_b.field_a[((wh) this).field_c + -1]) {
                ((wh) this).field_a = ((wh) this).field_b.field_a[-1 + ((wh) this).field_c].field_a;
                return true;
              } else {
                ((wh) this).field_a = ((wh) this).field_b.field_a[((wh) this).field_c + -1];
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    private final void a(int param0) {
        ((wh) this).field_a = ((wh) this).field_b.field_a[0].field_a;
        ((wh) this).field_c = 1;
        if (param0 != -17399) {
          this.a(-19);
          ((wh) this).field_d = null;
          return;
        } else {
          ((wh) this).field_d = null;
          return;
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
            return;
        }
        Object var2 = null;
        java.net.URL discarded$0 = wh.a(124, (java.net.URL) null, (java.applet.Applet) null);
    }

    final static java.net.URL a(int param0, java.net.URL param1, java.applet.Applet param2) {
        String var3 = null;
        String var4 = null;
        if (param0 == 127) {
          L0: {
            var3 = null;
            var4 = null;
            if (null == qi.field_b) {
              break L0;
            } else {
              if (qi.field_b.equals((Object) (Object) param2.getParameter("settings"))) {
                break L0;
              } else {
                var3 = qi.field_b;
                var4 = var3;
                var4 = var3;
                break L0;
              }
            }
          }
          if (null != vk.field_v) {
            if (vk.field_v.equals((Object) (Object) param2.getParameter("session"))) {
              return ig.a(var3, -1, var4, param1, 1);
            } else {
              var4 = vk.field_v;
              return ig.a(var3, -1, var4, param1, 1);
            }
          } else {
            return ig.a(var3, -1, var4, param1, 1);
          }
        } else {
          return null;
        }
    }

    public final Object next() {
        rf var1 = null;
        int var2 = 0;
        var2 = StarCannon.field_A;
        if (((wh) this).field_b.field_a[((wh) this).field_c + -1] == ((wh) this).field_a) {
          L0: while (true) {
            if (((wh) this).field_b.field_c > ((wh) this).field_c) {
              ((wh) this).field_c = ((wh) this).field_c + 1;
              var1 = ((wh) this).field_b.field_a[((wh) this).field_c].field_a;
              if (((wh) this).field_b.field_a[-1 + ((wh) this).field_c] == var1) {
                continue L0;
              } else {
                ((wh) this).field_d = var1;
                ((wh) this).field_a = var1.field_a;
                return (Object) (Object) var1;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = ((wh) this).field_a;
          ((wh) this).field_d = var1;
          ((wh) this).field_a = var1.field_a;
          return (Object) (Object) var1;
        }
    }

    public final void remove() {
        if (((wh) this).field_d == null) {
            throw new IllegalStateException();
        }
        ((wh) this).field_d.b(4);
        ((wh) this).field_d = null;
    }

    wh(ek param0) {
        ((wh) this).field_d = null;
        ((wh) this).field_b = param0;
        this.a(-17399);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
