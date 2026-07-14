/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lm implements Iterable {
    static double field_a;
    jl field_b;
    static String field_d;
    static in field_e;
    static nf field_c;

    private lm() throws Throwable {
        throw new Error();
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new tm((lm) this);
    }

    final void a(jl param0, int param1) {
        L0: {
          if (null != param0.field_q) {
            param0.b(true);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != 18425) {
          return;
        } else {
          param0.field_o = ((lm) this).field_b;
          param0.field_q = ((lm) this).field_b.field_q;
          param0.field_q.field_o = param0;
          param0.field_o.field_q = param0;
          return;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 < 94) {
            lm.a((byte) 44);
            field_d = null;
            field_c = null;
            return;
        }
        field_d = null;
        field_c = null;
    }

    final jl a(int param0) {
        jl var2 = null;
        if (param0 == -29870) {
          var2 = ((lm) this).field_b.field_o;
          if (((lm) this).field_b == var2) {
            return null;
          } else {
            var2.b(true);
            return var2;
          }
        } else {
          jl discarded$2 = ((lm) this).a(-12);
          var2 = ((lm) this).field_b.field_o;
          if (((lm) this).field_b == var2) {
            return null;
          } else {
            var2.b(true);
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "This entry doesn't match";
    }
}
