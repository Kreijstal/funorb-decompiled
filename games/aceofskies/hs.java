/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hs implements Iterable {
    wt field_c;
    private wt field_b;
    static int[] field_a;

    final static boolean a(boolean param0, int param1, int param2) {
        if (!param0) {
          boolean discarded$2 = hs.a(true, -18, 122);
          return to.b(-7493, param1, param2) & la.a(param2, param1, (byte) 70);
        } else {
          return to.b(-7493, param1, param2) & la.a(param2, param1, (byte) 70);
        }
    }

    final void a(wt param0, byte param1) {
        if (!(null == ((wt) param0).field_f)) {
            param0.d(-114);
        }
        param0.field_j = ((hs) this).field_c;
        param0.field_f = ((hs) this).field_c.field_f;
        ((wt) param0).field_f.field_j = param0;
        int var3 = 43 % ((-3 - param1) / 51);
        ((wt) param0).field_j.field_f = param0;
    }

    public static void a(byte param0) {
        if (param0 != -127) {
            return;
        }
        field_a = null;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new js((hs) this);
    }

    final wt a(boolean param0) {
        wt var2 = null;
        var2 = ((hs) this).field_b;
        if (var2 == ((hs) this).field_c) {
          ((hs) this).field_b = null;
          return null;
        } else {
          ((hs) this).field_b = ((wt) var2).field_j;
          if (!param0) {
            return (wt) null;
          } else {
            return var2;
          }
        }
    }

    private final wt a(wt param0, int param1) {
        wt var3 = null;
        if (param1 != 128) {
            ((hs) this).field_c = (wt) null;
            if (param0 == null) {
                var3 = ((hs) this).field_c.field_j;
            } else {
                var3 = param0;
            }
            if (!(((hs) this).field_c != var3)) {
                ((hs) this).field_b = null;
                return null;
            }
            ((hs) this).field_b = ((wt) var3).field_j;
            return var3;
        }
        if (param0 == null) {
            var3 = ((hs) this).field_c.field_j;
        } else {
            var3 = param0;
        }
        if (!(((hs) this).field_c != var3)) {
            ((hs) this).field_b = null;
            return null;
        }
        ((hs) this).field_b = ((wt) var3).field_j;
        return var3;
    }

    final wt a(int param0) {
        int var2 = -23 / ((param0 - -5) / 45);
        return this.a((wt) null, 128);
    }

    final wt b(boolean param0) {
        wt var2 = null;
        var2 = ((hs) this).field_c.field_j;
        if (var2 != ((hs) this).field_c) {
          var2.d(-119);
          if (param0) {
            return (wt) null;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    hs() {
        ((hs) this).field_c = new wt();
        ((hs) this).field_c.field_j = ((hs) this).field_c;
        ((hs) this).field_c.field_f = ((hs) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[128];
    }
}
