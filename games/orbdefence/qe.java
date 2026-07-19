/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qe implements Iterable {
    static hj field_c;
    static hj field_b;
    o field_a;

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        if (!param0) {
            field_b = (hj) null;
        }
    }

    final static boolean b(int param0) {
        boolean discarded$0 = false;
        if (param0 != 14388) {
            discarded$0 = qe.b(106);
            return vh.field_j;
        }
        return vh.field_j;
    }

    final void a(o param0, int param1) {
        boolean discarded$0 = false;
        try {
            if (param1 != 21693) {
                discarded$0 = qe.b(92);
            }
            if (!(param0.field_g == null)) {
                param0.c(-1);
            }
            param0.field_f = this.field_a;
            param0.field_g = this.field_a.field_g;
            param0.field_g.field_f = param0;
            param0.field_f.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "qe.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new ol((qe) (this)));
    }

    final o a(int param0) {
        int var2 = 0;
        o var3 = null;
        var2 = 13 % ((21 - param0) / 47);
        var3 = this.field_a.field_f;
        if (this.field_a == var3) {
          return null;
        } else {
          var3.c(-1);
          return var3;
        }
    }

    private qe() throws Throwable {
        throw new Error();
    }

    static {
    }
}
