/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sd implements Iterable {
    private pi field_h;
    static int[] field_g;
    int field_f;
    static String field_e;
    static ed field_d;
    pi[] field_b;
    static int[] field_c;
    static ta field_a;

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_g = null;
        field_c = null;
        field_a = null;
    }

    final void a(long param0, boolean param1, pi param2) {
        if (!(null == param2.field_c)) {
            param2.b(34);
        }
        pi var5 = ((sd) this).field_b[(int)(param0 & (long)(((sd) this).field_f + -1))];
        if (!param1) {
            return;
        }
        try {
            param2.field_c = var5.field_c;
            param2.field_f = var5;
            param2.field_c.field_f = param2;
            param2.field_d = param0;
            param2.field_f.field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "sd.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final pi a(int param0, long param1) {
        pi var4 = null;
        pi var5 = null;
        int var6 = 0;
        var6 = MinerDisturbance.field_ab;
        var4 = ((sd) this).field_b[(int)((long)(-1 + ((sd) this).field_f) & param1)];
        ((sd) this).field_h = var4.field_f;
        L0: while (true) {
          if (((sd) this).field_h == var4) {
            ((sd) this).field_h = null;
            if (param0 < -53) {
              return null;
            } else {
              return null;
            }
          } else {
            if (~param1 != ~((sd) this).field_h.field_d) {
              ((sd) this).field_h = ((sd) this).field_h.field_f;
              continue L0;
            } else {
              var5 = ((sd) this).field_h;
              ((sd) this).field_h = ((sd) this).field_h.field_f;
              return var5;
            }
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new gb((sd) this);
    }

    private sd() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Start Game";
        field_c = new int[25];
        field_g = new int[8192];
        field_a = new ta();
    }
}
