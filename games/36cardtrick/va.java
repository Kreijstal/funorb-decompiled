/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class va implements Iterable {
    he field_a;

    final he a(boolean param0) {
        he var2 = null;
        var2 = ((va) this).field_a.field_h;
        if (!param0) {
          if (var2 == ((va) this).field_a) {
            return null;
          } else {
            var2.d(12);
            return var2;
          }
        } else {
          Iterator discarded$6 = ((va) this).iterator();
          if (var2 == ((va) this).field_a) {
            return null;
          } else {
            var2.d(12);
            return var2;
          }
        }
    }

    final void a(int param0, he param1) {
        try {
            if (null != param1.field_i) {
                param1.d(12);
            }
            param1.field_h = ((va) this).field_a;
            param1.field_i = ((va) this).field_a.field_i;
            param1.field_i.field_h = param1;
            if (param0 > -66) {
                ((va) this).field_a = null;
            }
            param1.field_h.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "va.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new rg((va) this);
    }

    final static int a() {
        return (int)(1000000000L / qb.field_f);
    }

    private va() throws Throwable {
        throw new Error();
    }

    static {
    }
}
