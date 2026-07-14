/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class iq {
    private int field_c;
    private String field_d;
    private int field_f;
    static Random field_e;
    int field_i;
    static long field_h;
    static int[] field_g;
    static String field_b;
    static pu[] field_a;

    final static boolean a(int param0, String param1) {
        int var2 = 0;
        if (-2 != (param1.length() ^ -1)) {
          return false;
        } else {
          if (param0 == 30) {
            var2 = param1.charAt(0);
            if (Character.isLowerCase((char) var2)) {
              return true;
            } else {
              return false;
            }
          } else {
            iq.c(70);
            var2 = param1.charAt(0);
            if (Character.isLowerCase((char) var2)) {
              return true;
            } else {
              return false;
            }
          }
        }
    }

    final void a(int param0) {
        if (wg.a(-33, db.a(true, ((iq) this).field_f), db.a(true, ((iq) this).field_f + ((iq) this).field_i), u.a(((iq) this).field_c, (byte) 94), u.a(30 + ((iq) this).field_c, (byte) 94))) {
          fe.a(db.a(true, ((iq) this).field_f), u.a(((iq) this).field_c, (byte) 94), ((iq) this).field_i, 30, il.field_s, ci.field_e, 0, 0);
          fe.c(((iq) this).field_d, db.a(true, ((iq) this).field_i / 2 + ((iq) this).field_f), u.a(((iq) this).field_c - -30, (byte) 94), param0, true);
          return;
        } else {
          fe.a(db.a(true, ((iq) this).field_f), u.a(((iq) this).field_c, (byte) 94), ((iq) this).field_i, 30, il.field_s, nd.field_b, 0, 0);
          fe.c(((iq) this).field_d, db.a(true, ((iq) this).field_i / 2 + ((iq) this).field_f), u.a(((iq) this).field_c - -30, (byte) 94), param0, true);
          return;
        }
    }

    final static void b(int param0) {
        if (bl.field_b) {
          it.field_b = true;
          if (param0 != -20267) {
            iq.c(56);
            wc.a(false, -49);
            p.field_b = 0;
            return;
          } else {
            wc.a(false, -49);
            p.field_b = 0;
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    public static void c(int param0) {
        field_e = null;
        if (param0 != 0) {
          field_e = null;
          field_a = null;
          field_g = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_g = null;
          field_b = null;
          return;
        }
    }

    iq(String param0, int param1, int param2, int param3) {
        ((iq) this).field_c = param2;
        ((iq) this).field_f = param1;
        ((iq) this).field_i = param3;
        ((iq) this).field_d = param0;
    }

    final boolean a(byte param0) {
        int var2 = -106 / ((param0 - 17) / 39);
        return wg.a(-33, db.a(true, ((iq) this).field_f), db.a(true, ((iq) this).field_f - -((iq) this).field_i), u.a(((iq) this).field_c, (byte) 94), u.a(((iq) this).field_c + 30, (byte) 94));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new Random();
        field_b = "Owned";
    }
}
