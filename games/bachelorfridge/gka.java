/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gka extends at {
    static String field_m;
    private gj field_p;
    private ns field_o;
    static rga field_n;
    private boolean field_j;
    private taa field_k;
    private mr field_l;
    private boolean field_q;
    static String field_r;

    final static void a(int param0, int param1) {
        int var2 = 0;
        var2 = -95 / ((12 - param0) / 62);
        bs.field_k = param1;
        if (null == uf.field_c) {
          if (null != kw.field_j) {
            kw.field_j.a(param1, true);
            return;
          } else {
            return;
          }
        } else {
          uf.field_c.a(23679, param1);
          if (null == kw.field_j) {
            return;
          } else {
            kw.field_j.a(param1, true);
            return;
          }
        }
    }

    public static void e(int param0) {
        field_r = null;
        field_m = null;
        if (param0 != -3) {
            field_n = null;
            field_n = null;
            return;
        }
        field_n = null;
    }

    private final void d(int param0) {
        if (param0 < 80) {
            ((gka) this).field_k = null;
        }
    }

    final static rk a(lu param0, int param1) {
        int var2 = 0;
        rk var3 = null;
        var2 = param0.b(16711935);
        if (var2 == param1) {
          return null;
        } else {
          var3 = new rk(gfa.field_a[var2]);
          var3.a(param0, false);
          return var3;
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        ad var3 = null;
        if (!((gka) this).field_k.a((byte) -106)) {
          L0: {
            var2 = 112 % ((71 - param0) / 47);
            if (!((gka) this).field_q) {
              ((gka) this).field_q = true;
              wf.a(43, (byte) 126);
              break L0;
            } else {
              break L0;
            }
          }
          if (!((gka) this).field_j) {
            ((gka) this).field_p.field_s.field_d = ((gka) this).field_p.field_s.field_d - 2;
            if (0 <= ((gka) this).field_p.field_s.field_d) {
              return false;
            } else {
              var3 = ((gka) this).field_o.field_n.a(-27449, ((gka) this).field_p);
              ((gka) this).field_k = new taa(((gka) this).field_p, var3);
              ((gka) this).a(27799, (at) (Object) ((gka) this).field_k);
              ((gka) this).field_j = true;
              ((gka) this).field_l = new mr(((gka) this).field_p, ((gka) this).field_o, var3.field_s.field_x, var3.field_s.field_J);
              return false;
            }
          } else {
            ((gka) this).a(27799, (at) (Object) new fha((kj) (Object) ((gka) this).field_l));
            this.d(91);
            return true;
          }
        } else {
          return false;
        }
    }

    gka(gj param0, ns param1) {
        ((gka) this).field_q = false;
        ((gka) this).field_p = param0;
        ((gka) this).field_o = param1;
        ((gka) this).field_k = new taa(((gka) this).field_p, (((gka) this).field_p.field_h.field_z >> -155576383) - 1, -3);
        ((gka) this).a(27799, (at) (Object) ((gka) this).field_k);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Kick <%0> from this game";
        field_n = new rga();
        field_r = "Fly captured!";
    }
}
