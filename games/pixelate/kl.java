/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kl implements Iterable {
    static String field_c;
    fa[] field_e;
    private fa field_b;
    int field_a;
    static String field_d;

    final static void a(int param0) {
        ce.field_d = 0;
        oo.field_d = true;
        if (param0 != 7500) {
            kl.a((byte) -13);
        }
    }

    final static int a(int param0, int param1) {
        int var2 = param1;
        if (0 == param0) {
            var2 = io.field_e;
        }
        if (!(1 != param0)) {
            var2 = gh.field_v;
        }
        if (!(2 != param0)) {
            var2 = ib.field_e;
        }
        return var2;
    }

    final fa a(int param0, long param1) {
        fa var4 = null;
        fa var5 = null;
        int var6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        var4 = this.field_e[(int)((long)(this.field_a - param0) & param1)];
        this.field_b = var4.field_a;
        L0: while (true) {
          if (this.field_b != var4) {
            if (this.field_b.field_e != param1) {
              this.field_b = this.field_b.field_a;
              continue L0;
            } else {
              var5 = this.field_b;
              this.field_b = this.field_b.field_a;
              return var5;
            }
          } else {
            this.field_b = null;
            return null;
          }
        }
    }

    final void a(fa param0, long param1, int param2) {
        fa var5 = null;
        try {
            if (!(param0.field_h == null)) {
                param0.c(2779);
            }
            var5 = this.field_e[(int)(param1 & (long)(param2 + this.field_a))];
            param0.field_h = var5.field_h;
            param0.field_a = var5;
            param0.field_h.field_a = param0;
            param0.field_e = param1;
            param0.field_a.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "kl.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 >= -74) {
            field_c = (String) null;
            field_d = null;
            field_c = null;
            return;
        }
        field_d = null;
        field_c = null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new sh((kl) (this)));
    }

    kl(int param0) {
        int var2 = 0;
        fa dupTemp$0 = null;
        fa var3 = null;
        this.field_a = param0;
        this.field_e = new fa[param0];
        for (var2 = 0; param0 > var2; var2++) {
            dupTemp$0 = new fa();
            var3 = dupTemp$0;
            this.field_e[var2] = dupTemp$0;
            var3.field_a = var3;
            var3.field_h = var3;
        }
    }

    final static void a(byte param0) {
        int fieldTemp$2 = 0;
        if (7500 <= jd.field_r) {
          L0: {
            fieldTemp$2 = ko.field_hb + 1;
            ko.field_hb = ko.field_hb + 1;
            if (fieldTemp$2 == jm.field_g.length) {
              ko.field_hb = 0;
              break L0;
            } else {
              break L0;
            }
          }
          wh.e(-89, jm.field_g[ko.field_hb]);
          jd.field_r = 0;
          if (param0 > -73) {
            field_d = (String) null;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_c = "This is <%0>'s RuneScape clan if they have one.";
        field_d = "GFX: High Detail";
    }
}
