/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ag implements Iterator {
    private w field_f;
    private w field_a;
    static int field_d;
    static String field_c;
    static nf field_e;
    private ak field_b;

    public static void b() {
        field_e = null;
        field_c = null;
    }

    public final boolean hasNext() {
        return ((ag) this).field_b.field_f != ((ag) this).field_f;
    }

    public final Object next() {
        w var1 = ((ag) this).field_f;
        if (((ag) this).field_b.field_f == var1) {
            var1 = null;
            ((ag) this).field_f = null;
        } else {
            ((ag) this).field_f = var1.field_k;
        }
        ((ag) this).field_a = var1;
        return (Object) (Object) var1;
    }

    public final void remove() {
        if (null == ((ag) this).field_a) {
            throw new IllegalStateException();
        }
        ((ag) this).field_a.a(12695);
        ((ag) this).field_a = null;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var1 = 0;
        var2 = 0;
        var3 = ii.field_h[0].field_q;
        var4 = ii.field_h[0].field_v;
        ii.field_h[0].g(var1, var2);
        var1 = 640 + -var3;
        ii.field_h[2].g(var1, var2);
        var2 = 480 + -var4;
        var1 = 0;
        if (param0 <= 40) {
          return;
        } else {
          ii.field_h[5].g(var1, var2);
          var1 = 640 + -var3;
          ii.field_h[7].g(var1, var2);
          var1 = 0;
          var2 = 0;
          ii.field_h[3].g(var1, var2);
          var1 = 640 - ii.field_h[4].field_q;
          ii.field_h[4].g(var1, var2);
          var1 = 0;
          var2 = 0;
          ii.field_h[1].g(var1, var2);
          var2 = 480 + -ii.field_h[6].field_v;
          ii.field_h[6].g(var1, var2);
          return;
        }
    }

    ag(ak param0) {
        ((ag) this).field_a = null;
        try {
            ((ag) this).field_b = param0;
            ((ag) this).field_a = null;
            ((ag) this).field_f = ((ag) this).field_b.field_f.field_k;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "ag.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = -1;
    }
}
