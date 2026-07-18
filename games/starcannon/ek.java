/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ek implements Iterable {
    int field_c;
    static long field_d;
    private rf field_e;
    static java.applet.Applet field_b;
    rf[] field_a;

    final rf a(long param0, int param1) {
        rf var4 = null;
        rf var5 = null;
        int var6 = 0;
        var6 = StarCannon.field_A;
        var4 = ((ek) this).field_a[(int)(param0 & (long)(((ek) this).field_c - param1))];
        ((ek) this).field_e = var4.field_a;
        L0: while (true) {
          if (var4 != ((ek) this).field_e) {
            if (~param0 != ~((ek) this).field_e.field_b) {
              ((ek) this).field_e = ((ek) this).field_e.field_a;
              continue L0;
            } else {
              var5 = ((ek) this).field_e;
              ((ek) this).field_e = ((ek) this).field_e.field_a;
              return var5;
            }
          } else {
            ((ek) this).field_e = null;
            return null;
          }
        }
    }

    public static void a(boolean param0) {
        field_b = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = 0;
          if ((param1 & 7) != 0) {
            var2 = 8 + -(7 & param1);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 23201) {
          int discarded$2 = ek.a(-51, -124);
          var3 = var2 + param1;
          return var3;
        } else {
          var3 = var2 + param1;
          return var3;
        }
    }

    final void a(long param0, int param1, rf param2) {
        rf var5 = null;
        try {
            if (null != param2.field_d) {
                param2.b(4);
            }
            var5 = ((ek) this).field_a[(int)(param0 & (long)(param1 + ((ek) this).field_c))];
            param2.field_a = var5;
            param2.field_d = var5.field_d;
            param2.field_d.field_a = param2;
            param2.field_a.field_d = param2;
            param2.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ek.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a() {
        return !qa.field_a.b(false);
    }

    private ek() throws Throwable {
        throw new Error();
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new wh((ek) this);
    }

    static {
    }
}
