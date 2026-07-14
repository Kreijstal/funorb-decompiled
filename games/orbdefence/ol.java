/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ol implements Iterator {
    static ba field_f;
    private qe field_g;
    private o field_c;
    static int field_h;
    static int field_b;
    static int field_a;
    private o field_i;
    static int field_d;
    static int field_e;
    static int field_j;

    public final Object next() {
        o var1 = ((ol) this).field_i;
        if (var1 != ((ol) this).field_g.field_a) {
            ((ol) this).field_i = var1.field_f;
        } else {
            ((ol) this).field_i = null;
            var1 = null;
        }
        ((ol) this).field_c = var1;
        return (Object) (Object) var1;
    }

    public final boolean hasNext() {
        return ((ol) this).field_i != ((ol) this).field_g.field_a;
    }

    final static void a(int param0, qf param1, int param2) {
        int var4 = 0;
        Object var5 = null;
        se var6 = null;
        var6 = uk.field_b;
        var6.i(param2, 112);
        var6.field_i = var6.field_i + 1;
        var4 = var6.field_i;
        var6.a(1, param0 ^ 30243);
        var6.a(param1.field_j, -8);
        var6.f(-1, param1.field_i);
        var6.b(param1.field_g, -1);
        var6.b(param1.field_l, param0 + 30328);
        if (param0 != -30329) {
          var5 = null;
          ol.a((String) null, -82);
          var6.b(param1.field_f, -1);
          var6.b(param1.field_n, -1);
          int discarded$2 = var6.e(-18951, var4);
          var6.c((byte) -69, -var4 + var6.field_i);
          return;
        } else {
          var6.b(param1.field_f, -1);
          var6.b(param1.field_n, -1);
          int discarded$3 = var6.e(-18951, var4);
          var6.c((byte) -69, -var4 + var6.field_i);
          return;
        }
    }

    final static void a(String param0, int param1) {
        tj.field_a = param0;
        il.a(12, param1 ^ param1);
    }

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
            field_h = -20;
        }
    }

    ol(qe param0) {
        ((ol) this).field_c = null;
        ((ol) this).field_g = param0;
        ((ol) this).field_c = null;
        ((ol) this).field_i = ((ol) this).field_g.field_a.field_f;
    }

    public final void remove() {
        if (((ol) this).field_c == null) {
            throw new IllegalStateException();
        }
        ((ol) this).field_c.c(-1);
        ((ol) this).field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new ba(12, 0, 1, 0);
        field_e = 8;
        field_d = 2 * field_e;
        field_a = field_e / 2;
        field_j = 500;
    }
}
