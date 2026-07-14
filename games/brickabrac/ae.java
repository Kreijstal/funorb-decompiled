/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ae implements Iterator {
    private tk field_e;
    static int field_b;
    static im field_d;
    private gp field_a;
    static String field_i;
    private tk field_h;
    static qh field_c;
    static jp[][] field_g;
    static int field_f;

    public static void a(byte param0) {
        field_i = null;
        field_c = null;
        field_d = null;
        if (param0 < 55) {
            return;
        }
        field_g = null;
    }

    final static void b(byte param0) {
        va.field_a = false;
        if (param0 < 97) {
            ae.a((byte) -19);
        }
    }

    public final void remove() {
        if (null == ((ae) this).field_h) {
            throw new IllegalStateException();
        }
        ((ae) this).field_h.d(3);
        ((ae) this).field_h = null;
    }

    public final Object next() {
        tk var1 = ((ae) this).field_e;
        if (((ae) this).field_a.field_a == var1) {
            var1 = null;
            ((ae) this).field_e = null;
        } else {
            ((ae) this).field_e = var1.field_s;
        }
        ((ae) this).field_h = var1;
        return (Object) (Object) var1;
    }

    public final boolean hasNext() {
        return ((ae) this).field_a.field_a != ((ae) this).field_e;
    }

    final static jp[] a(int param0, int param1, int param2, mf param3) {
        if (param1 == -23176) {
          if (!ln.a(-107, param0, param3, param2)) {
            return null;
          } else {
            return rd.c(117);
          }
        } else {
          ae.a((byte) -84);
          if (!ln.a(-107, param0, param3, param2)) {
            return null;
          } else {
            return rd.c(117);
          }
        }
    }

    ae(gp param0) {
        ((ae) this).field_h = null;
        ((ae) this).field_a = param0;
        ((ae) this).field_e = ((ae) this).field_a.field_a.field_s;
        ((ae) this).field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Name";
        field_d = new im();
        field_c = new qh();
    }
}
