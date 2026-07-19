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
        if (!(kg.field_m == null)) {
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
        if (param3 != -27085) {
          k.b(32);
          param4 -= 4;
          param2 -= 4;
          var5 = param1 + param0 * vb.field_f;
          var6 = vb.field_f + -param2;
          w.a(vb.field_c, var5, 0, 0, 0, 0, param2, param4, var6);
          return;
        } else {
          param4 -= 4;
          param2 -= 4;
          var5 = param1 + param0 * vb.field_f;
          var6 = vb.field_f + -param2;
          w.a(vb.field_c, var5, 0, 0, 0, 0, param2, param4, var6);
          return;
        }
    }

    public final Object next() {
        int fieldTemp$2 = 0;
        int var2 = 0;
        Object var3 = null;
        hf var3_ref = null;
        hf var4 = null;
        var2 = Geoblox.field_C;
        if (this.field_d.field_a[this.field_j + -1] == this.field_h) {
          L0: while (true) {
            if (this.field_j < this.field_d.field_c) {
              fieldTemp$2 = this.field_j;
              this.field_j = this.field_j + 1;
              var3_ref = this.field_d.field_a[fieldTemp$2].field_b;
              if (var3_ref == this.field_d.field_a[this.field_j - 1]) {
                continue L0;
              } else {
                this.field_h = var3_ref.field_b;
                this.field_c = var3_ref;
                return var3_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = this.field_h;
          this.field_h = var4.field_b;
          this.field_c = var4;
          return var4;
        }
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
        int fieldTemp$1 = 0;
        int var2 = 0;
        var2 = Geoblox.field_C;
        if (this.field_d.field_a[this.field_j - 1] == this.field_h) {
          L0: while (true) {
            if (this.field_d.field_c > this.field_j) {
              fieldTemp$1 = this.field_j;
              this.field_j = this.field_j + 1;
              if (this.field_d.field_a[fieldTemp$1].field_b != this.field_d.field_a[this.field_j - 1]) {
                this.field_h = this.field_d.field_a[-1 + this.field_j].field_b;
                return true;
              } else {
                this.field_h = this.field_d.field_a[this.field_j - 1];
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    private final void a(int param0) {
        this.field_c = null;
        this.field_j = 1;
        this.field_h = this.field_d.field_a[0].field_b;
        if (param0 == -1) {
          return;
        } else {
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
