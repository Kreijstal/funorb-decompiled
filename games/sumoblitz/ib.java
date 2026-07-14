/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib extends rq {
    private float field_e;
    static int[][] field_g;
    private sk field_f;

    final void a(byte param0) {
        ut var2 = null;
        ut var3 = null;
        L0: {
          if (((ib) this).field_b.t(-80) != 0) {
            break L0;
          } else {
            var2 = ((ib) this).field_b.H(26453);
            ((ib) this).field_b.g(1, -128);
            var3 = ((ib) this).field_b.B(0);
            var3.a(0, (eu) (Object) var2);
            var3.a(0.125f, 0.125f, -126, 1.0f);
            var3.a((byte) 96, ((ib) this).field_e, 0.0f, 0.0f);
            ((ib) this).field_b.a(ip.field_y, 28880);
            ((ib) this).field_b.g(0, -122);
            break L0;
          }
        }
        if (param0 >= -47) {
          ((ib) this).field_e = -0.03486540541052818f;
          return;
        } else {
          return;
        }
    }

    ib(aw param0, sk param1) {
        super(param0);
        ((ib) this).field_e = 0.0f;
        ((ib) this).field_f = param1;
    }

    final boolean b(byte param0) {
        if (param0 >= -8) {
            ((ib) this).field_e = -0.8005875945091248f;
            return ((ib) this).field_f.c(51);
        }
        return ((ib) this).field_f.c(51);
    }

    public static void e(int param0) {
        if (param0 != 1) {
            ib.d(48);
            field_g = null;
            return;
        }
        field_g = null;
    }

    final void c(boolean param0) {
        ((ib) this).field_b.g(1, -115);
        if (param0) {
          return;
        } else {
          ((ib) this).field_b.a((byte) -83, vi.field_v, vi.field_v);
          ((ib) this).field_b.a(jq.field_a, 0, 0);
          ((ib) this).field_b.a(jq.field_a, 0, true);
          ((ib) this).field_b.c(1, 110);
          ((ib) this).field_b.a((ed) null, 95);
          ((ib) this).field_b.g(0, -111);
          ((ib) this).field_b.a(jq.field_a, 0, true);
          return;
        }
    }

    final void a(int param0, int param1, ed param2) {
        if (param1 != 18834) {
          ((ib) this).field_f = null;
          ((ib) this).field_b.a(param2, 126);
          return;
        } else {
          ((ib) this).field_b.a(param2, 126);
          return;
        }
    }

    final void a(boolean param0, int param1) {
        ((ib) this).field_b.g(1, -119);
        ((ib) this).field_b.a((byte) -83, lf.field_e, cv.field_F);
        ((ib) this).field_b.a((byte) 111, 0, true, false, jq.field_a);
        ((ib) this).field_b.a(ta.field_a, 0, true);
        ((ib) this).field_b.c(0, param1 ^ 20151);
        ((ib) this).field_b.g(0, -124);
        if (param1 != 20186) {
          ((ib) this).field_f = null;
          ((ib) this).field_b.a(false, -16777216);
          ((ib) this).field_b.a(mm.field_h, 0, true);
          ((ib) this).a((byte) -107);
          return;
        } else {
          ((ib) this).field_b.a(false, -16777216);
          ((ib) this).field_b.a(mm.field_h, 0, true);
          ((ib) this).a((byte) -107);
          return;
        }
    }

    final static void d(int param0) {
        if (gk.field_o != null) {
          wr.a(true, (java.awt.Canvas) (Object) gk.field_o);
          if (param0 == 1) {
            gk.field_o.a(false, lt.field_m);
            gk.field_o = null;
            if (vv.field_b != null) {
              vv.field_b.e(2);
              qn.field_f.requestFocus();
              return;
            } else {
              qn.field_f.requestFocus();
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Sumoblitz.field_L ? 1 : 0;
          ((ib) this).field_b.g(1, -117);
          if (param0 == 34023) {
            break L0;
          } else {
            ((ib) this).a(43, 107, 112);
            break L0;
          }
        }
        if ((128 & param2) == 0) {
          if ((1 & param1) != 1) {
            if (!((ib) this).field_f.field_g) {
              ((ib) this).field_b.a((ed) (Object) ((ib) this).field_f.field_d[0], 108);
              ((ib) this).field_b.g(0, -113);
              return;
            } else {
              ((ib) this).field_b.a((ed) (Object) ((ib) this).field_f.field_f, 126);
              ((ib) this).field_b.g(0, -113);
              return;
            }
          } else {
            if (!((ib) this).field_f.field_g) {
              var4 = ((ib) this).field_b.field_kc % 4000 * 16 / 4000;
              ((ib) this).field_b.a((ed) (Object) ((ib) this).field_f.field_d[var4], 93);
              ((ib) this).field_b.g(0, -113);
              return;
            } else {
              ((ib) this).field_e = (float)(((ib) this).field_b.field_kc % 4000) / 4000.0f;
              ((ib) this).field_b.a((ed) (Object) ((ib) this).field_f.field_f, 122);
              ((ib) this).field_b.g(0, -113);
              return;
            }
          }
        } else {
          ((ib) this).field_b.a((ed) null, 97);
          ((ib) this).field_b.g(0, -113);
          return;
        }
    }

    final void a(boolean param0, byte param1) {
        if (param1 > -71) {
          ((ib) this).a((byte) 54);
          ((ib) this).field_b.a((byte) -83, lf.field_e, vi.field_v);
          return;
        } else {
          ((ib) this).field_b.a((byte) -83, lf.field_e, vi.field_v);
          return;
        }
    }

    static {
    }
}
