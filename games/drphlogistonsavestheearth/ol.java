/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    private dg field_b;
    static int field_h;
    private int field_g;
    static boolean field_d;
    static String[] field_i;
    static int[] field_f;
    private tc field_e;
    static ma field_a;
    private int field_c;
    static String field_j;

    public static void a(byte param0) {
        field_f = null;
        field_j = null;
        field_a = null;
        if (param0 >= -51) {
            ol.a(false);
            field_i = null;
            return;
        }
        field_i = null;
    }

    private final void a(int param0, wh param1) {
        if (param0 != -1) {
          L0: {
            field_h = -6;
            if (param1 != null) {
              param1.a(-16175);
              param1.f(64);
              ((ol) this).field_c = ((ol) this).field_c + param1.field_w;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (param1 != null) {
              param1.a(-16175);
              param1.f(64);
              ((ol) this).field_c = ((ol) this).field_c + param1.field_w;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(Object param0, long param1, int param2) {
        this.a(param1, 1, (byte) -94, param0);
        if (param2 <= 98) {
            Object var6 = null;
            this.a(-70L, 90, (byte) 66, (Object) null);
        }
    }

    final static void a(boolean param0) {
        int var2 = 0;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ff.field_Q = new he[][]{ph.field_a, ib.field_u, dh.field_S, fa.field_n, t.field_c, cm.field_Q, od.field_i, jd.field_M, we.field_b, ee.field_b, ae.field_lb, ad.field_s, ub.field_a, jj.field_a, nc.field_I, pf.field_c, wd.field_a, sd.field_c, ff.field_R, dm.field_y, wh.field_u, ng.field_b, g.field_q, pj.field_z, tl.field_Q, ld.field_d, eb.field_c, ri.field_h, el.field_vb, bk.field_j, ik.field_f, vc.field_b, ij.field_d, db.field_b, kf.field_e, af.field_e, uk.field_b, uf.field_j, bg.field_t, wd.field_f, ng.field_f, nj.field_d, wi.field_c, oi.field_g, jk.field_H, u.field_a, eh.field_b, oi.field_a, pj.field_B[0], pj.field_B[1], pj.field_B[2], nl.field_n[0], nl.field_n[1], nl.field_n[2], m.field_a, ki.field_a, ph.field_c[0], ph.field_c[1], ph.field_c[2], lf.field_e[0], lf.field_e[1], ca.field_bb, sf.field_m, sj.field_f, le.field_b, eb.field_a, wh.field_u, cm.field_L, ca.field_Y, pj.field_z, tl.field_Q, cf.field_g, eb.field_c, ri.field_h, el.field_vb, ei.field_k, ij.field_e};
        sh.field_c = new he[][]{ph.field_a, ib.field_u, dh.field_S, fa.field_n, t.field_c, cm.field_Q, od.field_i, jd.field_M, we.field_b, ee.field_b, ae.field_lb, ad.field_s, fa.field_k, j.field_db, mk.field_e, pf.field_c, wd.field_a, sd.field_c, ff.field_R, df.field_f, ah.field_L, mk.field_f, qg.field_U, bf.field_v, vg.field_h, rg.field_a, fi.field_e, jd.field_Q, r.field_e, nf.field_s, pc.field_c, vc.field_b, ij.field_d, db.field_b, kf.field_e, af.field_e, wk.field_m, uf.field_j, bg.field_t, wd.field_f, ng.field_f, nj.field_d, wi.field_c, oi.field_g, jk.field_H, wa.field_O, eh.field_b, mj.field_w, pj.field_B[0], pj.field_B[1], pj.field_B[2], nl.field_n[0], nl.field_n[1], nl.field_n[2], kc.field_l, ta.field_d, hc.field_M[0], hc.field_M[1], hc.field_M[2], kk.field_b[0], kk.field_b[1], ca.field_bb, sf.field_m, sj.field_f, le.field_b, fa.field_m, we.field_c, d.field_c, ek.field_l, oj.field_g, mh.field_g, u.field_c, ai.field_y, bk.field_d, ek.field_t, hh.field_c, lk.field_m};
        bb.field_h = new int[]{0, -1, 2, 3, 4, 5, -1, -1, -1, -1, -1, 10, 11, 12, 13, 18, 15, 16, 17, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 11, -1, 18, 2, 26, -1, 15, 2, 28, 28, -1, 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 11, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        if (!param0) {
          vj.field_g = new he[][]{ph.field_a, ib.field_u, dh.field_S, fa.field_n, t.field_c, cm.field_Q, od.field_i, jd.field_M, we.field_b, ee.field_b, ae.field_lb, ad.field_s, ub.field_a, jj.field_a, nc.field_I, pf.field_c, wd.field_a, sd.field_c, ff.field_R, rh.field_f, sd.field_d, tb.field_b, qf.field_e, dm.field_z, qd.field_Cb, gm.field_L, rb.field_c, sc.field_a, rd.field_A, re.field_i, re.field_h, vc.field_b, ij.field_d, db.field_b, kf.field_e, af.field_e, qb.field_a, uf.field_j, bg.field_t, wd.field_f, ng.field_f, nj.field_d, wi.field_c, oi.field_g, si.field_G, u.field_a, eh.field_b, oi.field_a, pj.field_B[0], pj.field_B[1], pj.field_B[2], nl.field_n[0], nl.field_n[1], nl.field_n[2], m.field_a, ki.field_a, ph.field_c[0], ph.field_c[1], ph.field_c[2], lf.field_e[0], lf.field_e[1], qf.field_g, qg.field_W, eg.field_f, ck.field_k, gi.field_d, lc.field_q, ca.field_V, ac.field_g, df.field_k, sl.field_x, qj.field_a, og.field_c, ck.field_d, DrPhlogistonSavesTheEarth.field_G, qa.field_S, nf.field_p};
          return;
        } else {
          field_j = null;
          vj.field_g = new he[][]{ph.field_a, ib.field_u, dh.field_S, fa.field_n, t.field_c, cm.field_Q, od.field_i, jd.field_M, we.field_b, ee.field_b, ae.field_lb, ad.field_s, ub.field_a, jj.field_a, nc.field_I, pf.field_c, wd.field_a, sd.field_c, ff.field_R, rh.field_f, sd.field_d, tb.field_b, qf.field_e, dm.field_z, qd.field_Cb, gm.field_L, rb.field_c, sc.field_a, rd.field_A, re.field_i, re.field_h, vc.field_b, ij.field_d, db.field_b, kf.field_e, af.field_e, qb.field_a, uf.field_j, bg.field_t, wd.field_f, ng.field_f, nj.field_d, wi.field_c, oi.field_g, si.field_G, u.field_a, eh.field_b, oi.field_a, pj.field_B[0], pj.field_B[1], pj.field_B[2], nl.field_n[0], nl.field_n[1], nl.field_n[2], m.field_a, ki.field_a, ph.field_c[0], ph.field_c[1], ph.field_c[2], lf.field_e[0], lf.field_e[1], qf.field_g, qg.field_W, eg.field_f, ck.field_k, gi.field_d, lc.field_q, ca.field_V, ac.field_g, df.field_k, sl.field_x, qj.field_a, og.field_c, ck.field_d, DrPhlogistonSavesTheEarth.field_G, qa.field_S, nf.field_p};
          return;
        }
    }

    final Object a(boolean param0, long param1) {
        Object var5 = null;
        rd var6 = null;
        wh var7 = null;
        var7 = (wh) (Object) ((ol) this).field_e.a(param1, -1);
        if (var7 != null) {
          var5 = var7.b((byte) 77);
          if (var5 == null) {
            var7.a(-16175);
            var7.f(64);
            ((ol) this).field_c = ((ol) this).field_c + var7.field_w;
            return null;
          } else {
            if (!param0) {
              return null;
            } else {
              L0: {
                if (var7.a((byte) 28)) {
                  var6 = new rd(var5, var7.field_w);
                  ((ol) this).field_e.a(var7.field_g, (gi) (Object) var6, 46);
                  ((ol) this).field_b.a((uh) (Object) var6, (byte) -76);
                  ((wh) (Object) var6).field_t = 0L;
                  var7.a(-16175);
                  var7.f(64);
                  break L0;
                } else {
                  ((ol) this).field_b.a((uh) (Object) var7, (byte) -100);
                  var7.field_t = 0L;
                  break L0;
                }
              }
              return var5;
            }
          }
        } else {
          return null;
        }
    }

    private final void a(long param0, int param1, byte param2, Object param3) {
        rd var6 = null;
        int var7 = 0;
        wh var8 = null;
        wh var10 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1 <= ((ol) this).field_g) {
          this.a(-1, param0);
          if (param2 <= -35) {
            ((ol) this).field_c = ((ol) this).field_c - param1;
            L0: while (true) {
              if (0 <= ((ol) this).field_c) {
                var6 = new rd(param3, param1);
                ((ol) this).field_e.a(param0, (gi) (Object) var6, 39);
                ((ol) this).field_b.a((uh) (Object) var6, (byte) -40);
                ((wh) (Object) var6).field_t = 0L;
                return;
              } else {
                var10 = (wh) (Object) ((ol) this).field_b.b(false);
                this.a(-1, var10);
                continue L0;
              }
            }
          } else {
            ol.a((byte) 110);
            ((ol) this).field_c = ((ol) this).field_c - param1;
            L1: while (true) {
              if (0 <= ((ol) this).field_c) {
                var6 = new rd(param3, param1);
                ((ol) this).field_e.a(param0, (gi) (Object) var6, 39);
                ((ol) this).field_b.a((uh) (Object) var6, (byte) -40);
                ((wh) (Object) var6).field_t = 0L;
                return;
              } else {
                var8 = (wh) (Object) ((ol) this).field_b.b(false);
                this.a(-1, var8);
                continue L1;
              }
            }
          }
        } else {
          throw new IllegalStateException();
        }
    }

    private final void a(int param0, long param1) {
        wh var4 = (wh) (Object) ((ol) this).field_e.a(param1, param0);
        this.a(param0 ^ 0, var4);
    }

    private ol() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_i = new String[]{"Use the arrow keys to move", "Use the 'SPACE' key to fire", "Use 'SHIFT' key or the 'Z', 'X', 'C' keys to switch weapons", "Hold the 'CTRL' key to charge the Verne Cannon", "Release the 'CTRL' key to fire the Verne Cannon", "The bombs won't work in space but, fortunately, I have finished installing rockets! You can select them with the 'SHIFT' or 'V' key."};
    }
}
