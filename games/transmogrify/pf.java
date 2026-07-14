/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pf implements Iterable {
    static byte[][] field_a;
    static int field_b;
    static ti[] field_h;
    static int field_g;
    ri field_e;
    static String field_c;
    static String field_f;
    static ti field_d;
    static String field_i;

    final ri a(boolean param0) {
        ri var2 = null;
        Object var3 = null;
        var2 = ((pf) this).field_e.field_h;
        if (((pf) this).field_e != var2) {
          if (param0) {
            var3 = null;
            ((pf) this).a(true, (ri) null);
            var2.b((byte) -74);
            return var2;
          } else {
            var2.b((byte) -74);
            return var2;
          }
        } else {
          return null;
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new wg((pf) this);
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        field_f = null;
        field_a = null;
        field_i = null;
        if (param0 != 17205) {
          field_h = null;
          field_d = null;
          return;
        } else {
          field_d = null;
          return;
        }
    }

    private pf() throws Throwable {
        throw new Error();
    }

    final void a(boolean param0, ri param1) {
        if (null == param1.field_g) {
          param1.field_g = ((pf) this).field_e.field_g;
          param1.field_h = ((pf) this).field_e;
          param1.field_g.field_h = param1;
          param1.field_h.field_g = param1;
          if (param0) {
            ri discarded$4 = ((pf) this).a(true);
            return;
          } else {
            return;
          }
        } else {
          param1.b((byte) -116);
          param1.field_g = ((pf) this).field_e.field_g;
          param1.field_h = ((pf) this).field_e;
          param1.field_g.field_h = param1;
          param1.field_h.field_g = param1;
          if (!param0) {
            return;
          } else {
            ri discarded$5 = ((pf) this).a(true);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new byte[1000][];
        field_g = -2147483648;
        field_f = "Sound: ";
        field_c = "Email: ";
        field_i = "Confirm Email:";
    }
}
