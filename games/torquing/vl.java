/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vl implements Iterable {
    static String[] field_d;
    int field_e;
    private q field_b;
    static bm field_c;
    q[] field_a;

    final void a(long param0, byte param1, q param2) {
        q var5 = null;
        L0: {
          if (param2.field_h != null) {
            param2.f(0);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 < 7) {
          return;
        } else {
          var5 = ((vl) this).field_a[(int)((long)(((vl) this).field_e + -1) & param0)];
          param2.field_h = var5.field_h;
          param2.field_e = var5;
          param2.field_h.field_e = param2;
          param2.field_e.field_h = param2;
          param2.field_f = param0;
          return;
        }
    }

    final q a(long param0, int param1) {
        q var4 = null;
        int var5 = 0;
        q var6 = null;
        int var7 = 0;
        var7 = Torquing.field_u;
        var4 = ((vl) this).field_a[(int)((long)(((vl) this).field_e - 1) & param0)];
        ((vl) this).field_b = var4.field_e;
        var5 = -94 % ((24 - param1) / 41);
        L0: while (true) {
          if (((vl) this).field_b != var4) {
            if (((vl) this).field_b.field_f == param0) {
              var6 = ((vl) this).field_b;
              ((vl) this).field_b = ((vl) this).field_b.field_e;
              return var6;
            } else {
              ((vl) this).field_b = ((vl) this).field_b.field_e;
              continue L0;
            }
          } else {
            ((vl) this).field_b = null;
            return null;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != 93) {
            return;
        }
        field_c = null;
        field_d = null;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new dh((vl) this);
    }

    private vl() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[255];
        field_c = null;
    }
}
