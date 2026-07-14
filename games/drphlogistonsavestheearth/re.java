/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class re implements Iterator {
    static String field_j;
    static he field_d;
    private gi field_a;
    private gi field_f;
    static he[] field_h;
    static int field_g;
    static he[] field_i;
    static int field_e;
    private tc field_b;
    static String field_c;
    private int field_k;

    private final void a(int param0) {
        int var2 = -6 / ((-2 - param0) / 38);
        ((re) this).field_f = null;
        ((re) this).field_k = 1;
        ((re) this).field_a = ((re) this).field_b.field_h[0].field_e;
    }

    public static void b(int param0) {
        if (param0 != 967) {
            return;
        }
        field_j = null;
        field_h = null;
        field_i = null;
        field_c = null;
        field_d = null;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (((re) this).field_b.field_h[((re) this).field_k + -1] == ((re) this).field_a) {
          L0: while (true) {
            if (((re) this).field_b.field_c > ((re) this).field_k) {
              ((re) this).field_k = ((re) this).field_k + 1;
              if (((re) this).field_b.field_h[((re) this).field_k].field_e != ((re) this).field_b.field_h[-1 + ((re) this).field_k]) {
                ((re) this).field_a = ((re) this).field_b.field_h[-1 + ((re) this).field_k].field_e;
                return true;
              } else {
                ((re) this).field_a = ((re) this).field_b.field_h[-1 + ((re) this).field_k];
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

    public final Object next() {
        int var2 = 0;
        gi var3 = null;
        gi var4 = null;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (((re) this).field_b.field_h[-1 + ((re) this).field_k] == ((re) this).field_a) {
          L0: while (true) {
            if (((re) this).field_b.field_c > ((re) this).field_k) {
              ((re) this).field_k = ((re) this).field_k + 1;
              var3 = ((re) this).field_b.field_h[((re) this).field_k].field_e;
              if (((re) this).field_b.field_h[((re) this).field_k - 1] == var3) {
                continue L0;
              } else {
                ((re) this).field_f = var3;
                ((re) this).field_a = var3.field_e;
                return (Object) (Object) var3;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = ((re) this).field_a;
          ((re) this).field_f = var4;
          ((re) this).field_a = var4.field_e;
          return (Object) (Object) var4;
        }
    }

    final static void a(boolean param0) {
        cf.a((byte) -107);
        sg.field_a = param0 ? true : false;
        pj.field_F = true;
        ng.field_c.j(300);
        nc.a(field_c, false, (byte) 79);
    }

    public final void remove() {
        if (!(null != ((re) this).field_f)) {
            throw new IllegalStateException();
        }
        ((re) this).field_f.a(-16175);
        ((re) this).field_f = null;
    }

    final static byte[] a(String param0, int param1) {
        if (param1 < 121) {
            re.a(true);
            return o.field_l.a("", param0, 24874);
        }
        return o.field_l.a("", param0, 24874);
    }

    re(tc param0) {
        ((re) this).field_f = null;
        ((re) this).field_b = param0;
        this.a(-116);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Mouse over an icon for details";
        field_c = "Connection lost - attempting to reconnect";
    }
}
