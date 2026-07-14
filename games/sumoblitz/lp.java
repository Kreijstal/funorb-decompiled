/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp extends ak {
    final void b(int param0) {
        super.b(param0);
    }

    public lp() {
        super(11);
    }

    final void a(int param0, ha param1, int param2) {
        wo.a(up.field_c, 360, -5, -16777216, 3, param1, 650, 50, 1, true);
        be.field_t.a(tt.field_k, param0 << -299376424 | 5023231, -1, 105, 320, 0);
        hc.field_e.a(tt.field_k, -1, -1, 105, 320, 0);
        int discarded$0 = qv.field_k.a(100, 5023231 | param0 << 730099416, 0, 200, 220, (int[]) null, (hr[]) null, 90, -1, 0, 0, -8787, ps.field_b.toUpperCase() + " " + in.field_z + "<br>" + tj.field_l.toUpperCase() + " " + dp.b(jk.field_a, -23620), (aa) null, 1, 1);
        int discarded$1 = uq.field_a.a(100, -1, 0, 200, 220, (int[]) null, (hr[]) null, 90, -1, 0, 0, -8787, ps.field_b.toUpperCase() + " " + in.field_z + "<br>" + tj.field_l.toUpperCase() + " " + dp.b(jk.field_a, param2 + -21265), (aa) null, 1, 1);
        super.a(param0, param1, param2);
    }

    final static void a(boolean param0) {
        if (param0) {
          if (jt.field_u <= 0) {
            if (0 == jt.field_u) {
              pd.field_p = un.field_a[0];
              nv.field_a = 0;
              return;
            } else {
              return;
            }
          } else {
            jt.field_u = jt.field_u - 1;
            if (0 == jt.field_u) {
              pd.field_p = un.field_a[0];
              nv.field_a = 0;
              return;
            } else {
              return;
            }
          }
        } else {
          lp.a(true);
          if (jt.field_u > 0) {
            jt.field_u = jt.field_u - 1;
            if (0 != jt.field_u) {
              return;
            } else {
              pd.field_p = un.field_a[0];
              nv.field_a = 0;
              return;
            }
          } else {
            if (0 == jt.field_u) {
              pd.field_p = un.field_a[0];
              nv.field_a = 0;
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
    }
}
