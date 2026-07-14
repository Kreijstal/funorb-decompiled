/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vl implements Iterator {
    static tf field_d;
    static in field_c;
    static int[] field_h;
    private lk field_e;
    private ln field_f;
    private ln field_b;
    static th field_a;
    static String field_g;

    public final Object next() {
        ln var1 = ((vl) this).field_b;
        if (((vl) this).field_e.field_i != var1) {
            ((vl) this).field_b = var1.field_n;
        } else {
            ((vl) this).field_b = null;
            var1 = null;
        }
        ((vl) this).field_f = var1;
        return (Object) (Object) var1;
    }

    public final void remove() {
        if (!(((vl) this).field_f != null)) {
            throw new IllegalStateException();
        }
        ((vl) this).field_f.a((byte) -42);
        ((vl) this).field_f = null;
    }

    public static void a(byte param0) {
        field_h = null;
        field_a = null;
        field_d = null;
        field_g = null;
        if (param0 != 68) {
            return;
        }
        field_c = null;
    }

    public final boolean hasNext() {
        return ((vl) this).field_e.field_i != ((vl) this).field_b;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = HoldTheLine.field_D;
        if (param0 == 0) {
          if (bl.field_r == null) {
            tc.c();
            tc.c();
            tc.c();
            ra.field_hb.a(224, 112, 192, 256);
            var1 = 0;
            L0: while (true) {
              if (32 <= var1) {
                nm.field_c.b(ek.field_q, 320, 392, 0, -1);
                return;
              } else {
                var2 = ce.a(-14646, nm.field_b);
                tc.b(var1 / 2 + 184, 398 - var1, var2, 12517567);
                tc.b(var2 + (var1 / 2 + 184), 398 + -var1, -var2 + 256, 7274607);
                var1++;
                continue L0;
              }
            }
          } else {
            bl.field_r.a();
            return;
          }
        } else {
          field_h = null;
          if (bl.field_r == null) {
            tc.c();
            tc.c();
            tc.c();
            ra.field_hb.a(224, 112, 192, 256);
            var1 = 0;
            L1: while (true) {
              if (32 <= var1) {
                nm.field_c.b(ek.field_q, 320, 392, 0, -1);
                return;
              } else {
                var2 = ce.a(-14646, nm.field_b);
                tc.b(var1 / 2 + 184, 398 - var1, var2, 12517567);
                tc.b(var2 + (var1 / 2 + 184), 398 + -var1, -var2 + 256, 7274607);
                var1++;
                continue L1;
              }
            }
          } else {
            bl.field_r.a();
            return;
          }
        }
    }

    vl(lk param0) {
        ((vl) this).field_f = null;
        ((vl) this).field_e = param0;
        ((vl) this).field_b = ((vl) this).field_e.field_i.field_n;
        ((vl) this).field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new th(256);
    }
}
