/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sr implements Iterable {
    gp field_b;
    static int field_a;
    static String field_d;
    static String field_c;

    public final Iterator iterator() {
        return (Iterator) (Object) new cf((sr) this);
    }

    final gp a(int param0) {
        gp var2 = null;
        var2 = ((sr) this).field_b.field_p;
        if (param0 < -3) {
          if (var2 == ((sr) this).field_b) {
            return null;
          } else {
            var2.a(-120);
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
            return;
        }
        field_c = null;
    }

    final void a(byte param0, gp param1) {
        L0: {
          if (param1.field_o != null) {
            param1.a(-120);
            break L0;
          } else {
            break L0;
          }
        }
        param1.field_p = ((sr) this).field_b;
        param1.field_o = ((sr) this).field_b.field_o;
        param1.field_o.field_p = param1;
        param1.field_p.field_o = param1;
        if (param0 < 7) {
          Iterator discarded$2 = ((sr) this).iterator();
          return;
        } else {
          return;
        }
    }

    sr() {
        ((sr) this).field_b = new gp();
        ((sr) this).field_b.field_p = ((sr) this).field_b;
        ((sr) this).field_b.field_o = ((sr) this).field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Please check if address is correct";
        field_c = "game over";
    }
}
