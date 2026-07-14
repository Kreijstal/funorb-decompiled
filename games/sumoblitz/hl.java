/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hl implements Iterable {
    static ki field_d;
    pj field_c;
    static volatile int field_b;
    static boolean field_e;
    private pj field_a;

    final pj b(byte param0) {
        pj var2 = null;
        if (param0 == -61) {
          var2 = ((hl) this).field_c.field_m;
          if (var2 == ((hl) this).field_c) {
            return null;
          } else {
            var2.c(param0 + -5045);
            return var2;
          }
        } else {
          hl.a(102);
          var2 = ((hl) this).field_c.field_m;
          if (var2 == ((hl) this).field_c) {
            return null;
          } else {
            var2.c(param0 + -5045);
            return var2;
          }
        }
    }

    private final pj a(pj param0, int param1) {
        pj var3 = null;
        if (param1 != -1) {
            hl.a(-51);
            if (param0 != null) {
                var3 = param0;
            } else {
                var3 = ((hl) this).field_c.field_m;
            }
            if (!(var3 != ((hl) this).field_c)) {
                ((hl) this).field_a = null;
                return null;
            }
            ((hl) this).field_a = var3.field_m;
            return var3;
        }
        if (param0 != null) {
            var3 = param0;
        } else {
            var3 = ((hl) this).field_c.field_m;
        }
        if (!(var3 != ((hl) this).field_c)) {
            ((hl) this).field_a = null;
            return null;
        }
        ((hl) this).field_a = var3.field_m;
        return var3;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new vv((hl) this);
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 >= -59) {
            hl.a(-11);
        }
    }

    final pj b(int param0) {
        if (param0 != -1) {
            return null;
        }
        return this.a((pj) null, param0 + 0);
    }

    final pj a(byte param0) {
        pj var2 = null;
        var2 = ((hl) this).field_a;
        if (((hl) this).field_c == var2) {
          ((hl) this).field_a = null;
          return null;
        } else {
          if (param0 != -122) {
            return null;
          } else {
            ((hl) this).field_a = var2.field_m;
            return var2;
          }
        }
    }

    hl() {
        ((hl) this).field_c = new pj();
        ((hl) this).field_c.field_o = ((hl) this).field_c;
        ((hl) this).field_c.field_m = ((hl) this).field_c;
    }

    final void a(pj param0, byte param1) {
        L0: {
          if (param0.field_o != null) {
            param0.c(-5106);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_m = ((hl) this).field_c;
        param0.field_o = ((hl) this).field_c.field_o;
        if (param1 >= -103) {
          return;
        } else {
          param0.field_o.field_m = param0;
          param0.field_m.field_o = param0;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
    }
}
