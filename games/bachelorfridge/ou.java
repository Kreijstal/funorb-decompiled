/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ou implements Iterable {
    eo field_a;
    static ee[] field_d;
    static int field_b;
    static String field_c;

    final eo a(int param0) {
        eo var2 = null;
        Object var3 = null;
        if (param0 == 24383) {
          var2 = ((ou) this).field_a.field_m;
          if (((ou) this).field_a == var2) {
            return null;
          } else {
            var2.b(param0 + -24383);
            return var2;
          }
        } else {
          var3 = null;
          ((ou) this).a((eo) null, (byte) -80);
          var2 = ((ou) this).field_a.field_m;
          if (((ou) this).field_a == var2) {
            return null;
          } else {
            var2.b(param0 + -24383);
            return var2;
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new ev((ou) this);
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        if (param0 > -101) {
            ou.b(24);
        }
    }

    ou() {
        ((ou) this).field_a = new eo();
        ((ou) this).field_a.field_i = ((ou) this).field_a;
        ((ou) this).field_a.field_m = ((ou) this).field_a;
    }

    final void a(eo param0, byte param1) {
        try {
            if (!(null == param0.field_i)) {
                param0.b(0);
            }
            param0.field_m = ((ou) this).field_a;
            param0.field_i = ((ou) this).field_a.field_i;
            param0.field_i.field_m = param0;
            if (param1 != -118) {
                eo discarded$0 = ((ou) this).a(42);
            }
            param0.field_m.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ou.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Game options";
    }
}
