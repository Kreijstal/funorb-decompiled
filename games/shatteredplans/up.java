/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class up implements Iterable {
    static int[] field_b;
    static int field_d;
    static String field_c;
    df field_a;
    static String field_e;

    public final Iterator iterator() {
        return (Iterator) (Object) new ip((up) this);
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = 115 / ((23 - param0) / 47);
        field_e = null;
    }

    final void a(df param0, int param1) {
        try {
            if (null != param0.field_j) {
                param0.a(param1 ^ 22);
            }
            param0.field_j = ((up) this).field_a.field_j;
            if (param1 != 6) {
                df discarded$0 = ((up) this).a((byte) 95);
            }
            param0.field_h = ((up) this).field_a;
            param0.field_j.field_h = param0;
            param0.field_h.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "up.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final df a(byte param0) {
        df var2 = null;
        Object var3 = null;
        var2 = ((up) this).field_a.field_h;
        if (param0 == -20) {
          if (((up) this).field_a == var2) {
            return null;
          } else {
            var2.a(16);
            return var2;
          }
        } else {
          var3 = null;
          ((up) this).a((df) null, 90);
          if (((up) this).field_a == var2) {
            return null;
          } else {
            var2.a(16);
            return var2;
          }
        }
    }

    up() {
        ((up) this).field_a = new df();
        ((up) this).field_a.field_j = ((up) this).field_a;
        ((up) this).field_a.field_h = ((up) this).field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{2, 21, 22, 7, 6, 11, 12, 14};
        field_c = "Hide private chat and appear offline to friends";
        field_e = "The game options are not all set.";
    }
}
