/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class k implements Iterator {
    private hf field_h;
    static int[] field_i;
    private int field_j;
    private hf field_c;
    static int field_g;
    private gi field_d;
    static tf field_e;
    static String field_k;
    static String field_b;
    static rf field_f;
    static dm field_a;

    public final void remove() {
        if (null == this.field_c) {
            throw new IllegalStateException();
        }
        this.field_c.a(false);
        this.field_c = null;
    }

    final static java.applet.Applet c(int param0) {
        if ((kg.field_m != null)) {
            return kg.field_m;
        }
        if (param0 <= 104) {
            k.a(83, 4, -82, 86, 115);
            return (java.applet.Applet) ((Object) qa.field_d);
        }
        return (java.applet.Applet) ((Object) qa.field_d);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        param0 += 2;
        param1 += 2;
        if (param3 == -27085) {
            param4 -= 4;
            param2 -= 4;
            var5 = param1 + param0 * vb.field_f;
            var6 = vb.field_f - param2;
            w.a(vb.field_c, var5, 0, 0, 0, 0, param2, param4, var6);
            return;
        }
        k.b(32);
        param4 -= 4;
        param2 -= 4;
        var5 = param1 + param0 * vb.field_f;
        var6 = vb.field_f - param2;
        w.a(vb.field_c, var5, 0, 0, 0, 0, param2, param4, var6);
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        int var2;
        hf var3;
        hf var4;
        var2 = Geoblox.field_C;
        if (this.field_d.field_a[this.field_j - 1] != this.field_h) {
          var4 = this.field_h;
          this.field_h = var4.field_b;
          this.field_c = var4;
          return var4;
        }
        do {
          if (this.field_j >= this.field_d.field_c) {
            return null;
          }
          fieldTemp$0 = this.field_j;
          this.field_j = this.field_j + 1;
          var3 = this.field_d.field_a[fieldTemp$0].field_b;
        } while (var3 == this.field_d.field_a[this.field_j - 1]);
        this.field_h = var3.field_b;
        this.field_c = var3;
        return var3;
    }

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        if (param0 != 0) {
            return;
        }
        field_a = null;
        field_f = null;
        field_i = null;
        field_k = null;
    }

    k(gi param0) {
        this.field_c = null;
        try {
            this.field_d = param0;
            this.a(-1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "k.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = Geoblox.field_C;
        if (this.field_d.field_a[this.field_j - 1] != this.field_h) {
          return true;
        }
        while (this.field_d.field_c > this.field_j) {
          fieldTemp$0 = this.field_j;
          this.field_j = this.field_j + 1;
          if (this.field_d.field_a[fieldTemp$0].field_b != this.field_d.field_a[this.field_j - 1]) {
            this.field_h = this.field_d.field_a[-1 + this.field_j].field_b;
            return true;
          }
          this.field_h = this.field_d.field_a[this.field_j - 1];
        }
        return false;
    }

    private final void a(int param0) {
        this.field_c = null;
        this.field_j = 1;
        this.field_h = this.field_d.field_a[0].field_b;
        if (param0 != -1) {
            this.remove();
            return;
        }
    }

    static {
        field_g = -1;
        field_e = new tf();
        field_k = "Log in";
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
