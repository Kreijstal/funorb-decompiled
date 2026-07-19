/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vb implements Iterable {
    static volatile int field_b;
    static String field_a;
    fl field_c;

    final fl a(byte param0) {
        fl var2 = null;
        if (param0 == 102) {
          var2 = this.field_c.field_j;
          if (this.field_c == var2) {
            return null;
          } else {
            var2.d(param0 ^ 25);
            return var2;
          }
        } else {
          field_a = (String) null;
          var2 = this.field_c.field_j;
          if (this.field_c == var2) {
            return null;
          } else {
            var2.d(param0 ^ 25);
            return var2;
          }
        }
    }

    final void a(boolean param0, fl param1) {
        Iterator discarded$0 = null;
        try {
            if (param0) {
                discarded$0 = this.iterator();
            }
            if (!(param1.field_i == null)) {
                param1.d(96);
            }
            param1.field_i = this.field_c.field_i;
            param1.field_j = this.field_c;
            param1.field_i.field_j = param1;
            param1.field_j.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "vb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new rm((vb) (this)));
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 <= 39) {
            vb.b((byte) -113);
        }
    }

    private vb() throws Throwable {
        throw new Error();
    }

    static {
        field_b = -1;
        field_a = "Collectables";
    }
}
