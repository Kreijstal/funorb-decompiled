/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rja extends mv {
    private gj field_p;
    private ce field_q;
    static int field_o;

    final void d(int param0) {
        if (param0 < 16) {
            rja.a(-101, 125, -52);
        }
    }

    final static void a(int param0, int param1, int param2) {
        pf var3 = null;
        if (param2 != 1) {
          return;
        } else {
          var3 = sja.field_fb;
          var3.c(param0, (byte) 99);
          var3.d(3, 0);
          var3.d(9, 0);
          var3.b(param1, -127);
          return;
        }
    }

    rja(gj param0, ce param1) {
        super(param0, (vja) (Object) param1);
        ad var3 = null;
        ad var5 = null;
        ((rja) this).field_p = param0;
        ((rja) this).field_q = param1;
        var5 = ((rja) this).field_q.field_l.a(-27449, ((rja) this).field_p);
        var3 = var5;
        if (!var5.field_s.i(-84)) {
          var5.field_s.d(((rja) this).field_q.field_k, (byte) -106);
          var5.b(-1, 1);
          if (((rja) this).field_q.field_r) {
            var5.a(16777152, 14, m.field_c);
            ((rja) this).a(27799, (at) (Object) new qf(((rja) this).field_p, ((rja) this).field_q.field_l, ((rja) this).field_q.field_k, ((rja) this).field_q.field_q, ((rja) this).field_q.field_v, false));
          } else {
            if (!((rja) this).field_q.field_n) {
              oha discarded$1 = al.a(109, ((rja) this).field_q.field_k);
              ((rja) this).f(-120);
              ((rja) this).a(27799, (at) (Object) new qf(((rja) this).field_p, ((rja) this).field_q.field_l, ((rja) this).field_q.field_k, ((rja) this).field_q.field_q, ((rja) this).field_q.field_v, false));
            } else {
              var5.a(16761024, 110, dc.field_o);
              ((rja) this).a(27799, (at) (Object) new qf(((rja) this).field_p, ((rja) this).field_q.field_l, ((rja) this).field_q.field_k, ((rja) this).field_q.field_q, ((rja) this).field_q.field_v, false));
            }
          }
        } else {
        }
    }

    static {
    }
}
