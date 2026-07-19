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
        o var1 = null;
        var1 = this.field_i;
        if (var1 != this.field_g.field_a) {
          this.field_i = var1.field_f;
          if (OrbDefence.field_D) {
            this.field_i = null;
            var1 = null;
            this.field_c = var1;
            return var1;
          } else {
            this.field_c = var1;
            return var1;
          }
        } else {
          this.field_i = null;
          var1 = null;
          this.field_c = var1;
          return var1;
        }
    }

    public final boolean hasNext() {
        return this.field_i != this.field_g.field_a;
    }

    final static void a(int param0, qf param1, int param2) {
        se var6 = null;
        int var4 = 0;
        int discarded$0 = 0;
        try {
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
                String var5 = (String) null;
                ol.a((String) null, -82);
            }
            var6.b(param1.field_f, -1);
            var6.b(param1.field_n, -1);
            discarded$0 = var6.e(-18951, var4);
            var6.c((byte) -69, -var4 + var6.field_i);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ol.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(String param0, int param1) {
        try {
            tj.field_a = param0;
            il.a(12, param1 ^ param1);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ol.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
            field_h = -20;
        }
    }

    ol(qe param0) {
        this.field_c = null;
        try {
            this.field_g = param0;
            this.field_c = null;
            this.field_i = this.field_g.field_a.field_f;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "ol.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void remove() {
        if (this.field_c == null) {
            throw new IllegalStateException();
        }
        this.field_c.c(-1);
        this.field_c = null;
    }

    static {
        field_f = new ba(12, 0, 1, 0);
        field_e = 8;
        field_d = 2 * field_e;
        field_a = field_e / 2;
        field_j = 500;
    }
}
