/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qi implements Iterable {
    static double field_a;
    static cn[] field_f;
    static String field_h;
    static int field_b;
    static pn field_e;
    static cn field_i;
    private ne field_j;
    static String field_c;
    ne[] field_d;
    int field_g;

    public final Iterator iterator() {
        return (Iterator) (Object) new ho((qi) this);
    }

    final void a(long param0, byte param1, ne param2) {
        ne var5 = null;
        if (param2.field_a != null) {
            param2.a(false);
        }
        if (param1 > -127) {
            return;
        }
        try {
            var5 = ((qi) this).field_d[(int)(param0 & (long)(-1 + ((qi) this).field_g))];
            param2.field_a = var5.field_a;
            param2.field_e = var5;
            param2.field_a.field_e = param2;
            param2.field_e.field_a = param2;
            param2.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "qi.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final ne a(int param0, long param1) {
        ne var4 = null;
        ne var5 = null;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        var4 = ((qi) this).field_d[(int)((long)(((qi) this).field_g - param0) & param1)];
        ((qi) this).field_j = var4.field_e;
        L0: while (true) {
          if (((qi) this).field_j != var4) {
            if (~((qi) this).field_j.field_h != ~param1) {
              ((qi) this).field_j = ((qi) this).field_j.field_e;
              continue L0;
            } else {
              var5 = ((qi) this).field_j;
              ((qi) this).field_j = ((qi) this).field_j.field_e;
              return var5;
            }
          } else {
            ((qi) this).field_j = null;
            return null;
          }
        }
    }

    private qi() throws Throwable {
        throw new Error();
    }

    public static void a() {
        field_c = null;
        field_e = null;
        field_h = null;
        field_i = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0.0;
        field_h = "The <%0> is undamaged!";
        field_c = "Years spent studying the dark arts, in service to the corrupt human nobles of the west, have given the sorceress the knowledge to tame the elements and turn them against her foes.";
    }
}
