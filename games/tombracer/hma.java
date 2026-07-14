/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hma implements Iterable {
    static String field_e;
    static int[] field_f;
    static int field_a;
    od field_d;
    private od field_c;
    static jea field_b;

    final od c(int param0) {
        Object var3 = null;
        if (param0 <= 89) {
          var3 = null;
          ((hma) this).a((od) null, -48);
          return this.a((byte) 121, (od) null);
        } else {
          return this.a((byte) 121, (od) null);
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new rba((hma) this);
    }

    final void a(byte param0) {
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        L0: while (true) {
          if (((hma) this).field_d.field_g == ((hma) this).field_d) {
            if (param0 != 84) {
              field_f = null;
              return;
            } else {
              return;
            }
          } else {
            ((hma) this).field_d.field_g.c(-7975);
            continue L0;
          }
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_b = null;
        field_e = null;
        if (param0 != 8192) {
            hma.b(101);
        }
    }

    final od b(byte param0) {
        od var2 = null;
        if (param0 > 44) {
          var2 = ((hma) this).field_d.field_g;
          if (var2 == ((hma) this).field_d) {
            return null;
          } else {
            var2.c(-7975);
            return var2;
          }
        } else {
          return null;
        }
    }

    private final od a(byte param0, od param1) {
        od var4 = null;
        int var3 = 77 / ((param0 - 2) / 56);
        if (param1 == null) {
            var4 = ((hma) this).field_d.field_g;
        } else {
            var4 = param1;
        }
        if (!(var4 != ((hma) this).field_d)) {
            ((hma) this).field_c = null;
            return null;
        }
        ((hma) this).field_c = var4.field_g;
        return var4;
    }

    final void a(od param0, int param1) {
        L0: {
          if (param0.field_f != null) {
            param0.c(-7975);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_f = ((hma) this).field_d.field_f;
        param0.field_g = ((hma) this).field_d;
        param0.field_f.field_g = param0;
        if (param1 != -11396) {
          return;
        } else {
          param0.field_g.field_f = param0;
          return;
        }
    }

    hma() {
        ((hma) this).field_d = new od();
        ((hma) this).field_d.field_g = ((hma) this).field_d;
        ((hma) this).field_d.field_f = ((hma) this).field_d;
    }

    final od a(int param0) {
        od var2 = null;
        var2 = ((hma) this).field_c;
        if (var2 == ((hma) this).field_d) {
          ((hma) this).field_c = null;
          return null;
        } else {
          if (param0 >= -77) {
            return null;
          } else {
            ((hma) this).field_c = var2.field_g;
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[8192];
        field_e = null;
        field_a = 9;
    }
}
