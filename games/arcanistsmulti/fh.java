/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fh implements Iterator {
    static String field_d;
    private tf field_b;
    static String field_a;
    static int field_e;
    private tf field_c;
    static int field_g;
    private gb field_h;
    static String field_f;
    static ho field_i;

    public final void remove() {
        if (null == ((fh) this).field_b) {
            throw new IllegalStateException();
        }
        ((fh) this).field_b.a((byte) 88);
        ((fh) this).field_b = null;
    }

    public static void a(byte param0) {
        if (param0 < 20) {
            return;
        }
        field_f = null;
        field_i = null;
        field_a = null;
        field_d = null;
    }

    public final Object next() {
        tf var1 = ((fh) this).field_c;
        if (var1 != ((fh) this).field_h.field_g) {
            ((fh) this).field_c = var1.field_l;
        } else {
            ((fh) this).field_c = null;
            var1 = null;
        }
        ((fh) this).field_b = var1;
        return (Object) (Object) var1;
    }

    final static void a(int param0, dl param1, java.awt.Frame param2) {
        og var3 = null;
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 == 100) {
          L0: while (true) {
            var3 = param1.a(param2, 6);
            L1: while (true) {
              if (var3.field_e != 0) {
                if (-2 == (var3.field_e ^ -1)) {
                  param2.setVisible(false);
                  param2.dispose();
                  return;
                } else {
                  ao.a(100L, 1);
                  continue L0;
                }
              } else {
                ao.a(10L, 1);
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    public final boolean hasNext() {
        return ((fh) this).field_c != ((fh) this).field_h.field_g;
    }

    fh(gb param0) {
        ((fh) this).field_b = null;
        ((fh) this).field_h = param0;
        ((fh) this).field_b = null;
        ((fh) this).field_c = ((fh) this).field_h.field_g.field_l;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
        field_a = "Enter name of player to add to list";
        field_d = "Book of Frost";
        field_f = "Asking to join <%0>'s game...";
    }
}
