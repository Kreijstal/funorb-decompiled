/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    private int field_j;
    private int field_h;
    static int field_l;
    private int field_b;
    private sg field_u;
    private int field_q;
    private float field_c;
    private int field_s;
    private int field_v;
    static ig field_p;
    private int field_o;
    private int field_d;
    private int field_k;
    static go field_m;
    static String field_t;
    static String field_i;
    private int field_x;
    private int field_e;
    private int field_g;
    private int field_n;
    private int field_f;
    private int field_w;
    static int[] field_r;
    private boolean field_a;

    public static void e(int param0) {
        if (param0 < 8) {
            field_p = (ig) null;
        }
        field_i = null;
        field_m = null;
        field_r = null;
        field_p = null;
        field_t = null;
    }

    final void b(int param0) {
        int fieldTemp$1 = 0;
        if (null != rn.field_f) {
          return;
        } else {
          L0: {
            if ((vl.field_h ^ -1) >= -1) {
              this.field_a = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (!this.field_a) {
            L1: {
              L2: {
                if (ng.field_d >= this.field_b) {
                  break L2;
                } else {
                  bl.field_a = (-ng.field_d + this.field_b) / 2;
                  if (!ZombieDawnMulti.field_E) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-1 > (this.field_b ^ -1)) {
                bl.field_a = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              L4: {
                if (this.field_k != ng.field_d) {
                  break L4;
                } else {
                  if (pi.field_i == this.field_w) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              this.field_u.a((byte) -89, this.field_w, this.field_k);
              break L3;
            }
            return;
          } else {
            fieldTemp$1 = this.field_v - 1;
            this.field_v = this.field_v - 1;
            if (-1 > (fieldTemp$1 ^ -1)) {
              return;
            } else {
              this.field_v = this.field_g;
              if (this.field_f > mk.field_d) {
                this.field_a = false;
                return;
              } else {
                if (param0 != -12371) {
                  return;
                } else {
                  this.c(0);
                  return;
                }
              }
            }
          }
        }
    }

    final static void a(boolean param0) {
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_67_3 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        int statePc = 0;
        ja var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var5_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        ja var9 = null;
        int var10 = 0;
        ja var11 = null;
        ja var12 = null;
        String var14 = null;
        ja var16 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (pl.field_C == null) {
                        statePc = 15;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (!pl.field_C.a((byte) -124)) {
                        statePc = 15;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (!pl.field_C.a(false, "benefits")) {
                        statePc = 15;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (lb.field_d == null) {
                        statePc = 15;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!lb.field_d.a((byte) -108)) {
                        statePc = 15;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    if (lb.field_d.a(false, "benefits")) {
                        statePc = 8;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ag.field_b = fl.a("benefits", "headline", pl.field_C, 11091);
                    pn.field_a = fl.a("benefits", "blurbpane", pl.field_C, 11091);
                    ha.field_l = fl.a("benefits", "button", pl.field_C, 11091);
                    ig.field_e = fl.a("benefits", "signup_text", pl.field_C, 11091);
                    ia.field_y = fl.a("benefits", "menu_text", pl.field_C, 11091);
                    er.field_j = fl.a("benefits", "button_frame", pl.field_C, 11091);
                    fa.field_Tb = fl.a("benefits", "arrow", pl.field_C, 11091);
                    dc.field_Lb = (fm) ((Object) pj.a(pl.field_C, 4, lb.field_d, "large_font", "benefits"));
                    gf.field_e = (fm) ((Object) pj.a(pl.field_C, 4, lb.field_d, "small_font", "benefits"));
                    var27 = oo.field_i;
                    var2 = oo.field_b;
                    var3 = oo.field_l;
                    oo.a(b.field_f);
                    var11 = new ja(fa.field_Tb.field_x - -4, 4 + fa.field_Tb.field_w);
                    var11.a();
                    fa.field_Tb.i(2, 2, hk.field_e);
                    sq.a(5, var11.field_x, 2, var11.field_w, var11, 1, 0, 0);
                    fa.field_Tb = var11;
                    mb.field_j = fa.field_Tb.f();
                    var12 = new ja(195, 221);
                    var6 = var12.field_x / 2;
                    var12.a();
                    dc.field_Lb.b(vl.a(t.field_b, new String[]{ql.field_e}, 2), var6, 40, 16777215, -1);
                    gf.field_e.b(vl.a(ob.field_w, new String[]{ql.field_e}, 2), var6, 60, 16777215, -1);
                    dc.field_Lb.b(vl.a(ck.field_c, new String[]{eo.field_b}, 2), var6, 110, 16777215, -1);
                    gf.field_e.b(vl.a(wc.field_G, new String[]{eo.field_b}, 2), var6, 130, 16777215, -1);
                    dc.field_Lb.b(sn.field_Yb, var6, 180, 16777215, -1);
                    gf.field_e.b(um.field_f, var6, 200, 16777215, -1);
                    sq.a(5, var12.field_x, 3, var12.field_w, var12, 1, 0, 0);
                    pn.field_a.a();
                    var12.g(-pn.field_a.field_r + 18, 241 - pn.field_a.field_y);
                    var7 = 0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (nj.field_a.length <= var7) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ao.field_h[var7].a();
                    gf.field_e.a(nj.field_a[var7], 3, 3, ao.field_h[var7].field_x - 6, -6 + ao.field_h[var7].field_w, hk.field_e, -1, 1, 1, gf.field_e.field_C - -gf.field_e.field_r);
                    sq.a(5, ao.field_h[var7].field_x, 3, ao.field_h[var7].field_w, ao.field_h[var7], 1, 0, 0);
                    var7++;
                    if (var10 != 0) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var10 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    nj.field_a = null;
                    kg.field_j = ig.field_e.c();
                    kg.field_j.a();
                    pi.a((byte) -115, 0, 64, oo.field_b, oo.field_l * 2 / 3, 0);
                    oo.a(var27, var2, var3);
                    oo.b(b.field_f);
                    jp.field_d = (ha.field_l.field_x + -er.field_j.field_x) / 2 + 231;
                    cr.field_j = (-er.field_j.field_w + ha.field_l.field_w) / 2 + 390;
                    sq.field_O = (-er.field_j.field_w + ha.field_l.field_w) / 2 + 390;
                    pl.field_C = null;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    il.field_k = (ha.field_l.field_x + -er.field_j.field_x) / 2 + 434;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (rq.field_v == null) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return;
                }
                case 18: {
                    if (q.field_c == null) {
                        statePc = 31;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (dc.field_Lb == null) {
                        statePc = 31;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var28 = oo.field_i;
                    var2 = oo.field_b;
                    var3 = oo.field_l;
                    oo.a(b.field_f);
                    var14 = vl.a(eh.field_h, new String[]{vk.field_L[hj.field_f]}, 2);
                    var5 = dc.field_Lb.c(var14, ol.field_p);
                    var6 = dc.field_Lb.a(var14, ol.field_p, dc.field_Lb.field_C + dc.field_Lb.field_r);
                    var7 = (-var5 + ol.field_p) / 2 + pg.field_c;
                    var8 = (ai.field_a + -var6) / 2 + em.field_bb;
                    var7 -= 3;
                    var5 += 6;
                    var8 -= 3;
                    var6 += 6;
                    if (0 <= var7) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var9_int = -var7;
                    pg.field_c = pg.field_c + var9_int;
                    var5 = var5 + var9_int * 2;
                    q.field_c.field_r = q.field_c.field_r + var9_int;
                    ed.field_b = ed.field_b - var9_int;
                    var7 = var7 + var9_int;
                    q.field_c.field_z = q.field_c.field_z + 2 * var9_int;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (q.field_c.field_z < var7 + var5) {
                        statePc = 24;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var9_int = var7 - (-var5 + q.field_c.field_z);
                    ed.field_b = ed.field_b - var9_int;
                    var7 = var7 + var9_int;
                    pg.field_c = pg.field_c + var9_int;
                    var5 = var5 + 2 * var9_int;
                    q.field_c.field_r = q.field_c.field_r + var9_int;
                    q.field_c.field_z = q.field_c.field_z + var9_int * 2;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (0 <= var8) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var9_int = -var8;
                    var8 = var8 + var9_int;
                    q.field_c.field_y = q.field_c.field_y + var9_int;
                    pn.field_e = pn.field_e - var9_int;
                    q.field_c.field_u = q.field_c.field_u + 2 * var9_int;
                    var6 = var6 + var9_int * 2;
                    em.field_bb = em.field_bb + var9_int;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    if (q.field_c.field_u < var6 + var8) {
                        statePc = 29;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var9_int = -q.field_c.field_u + (var8 - -var6);
                    q.field_c.field_u = q.field_c.field_u + var9_int * 2;
                    q.field_c.field_y = q.field_c.field_y + var9_int;
                    var8 = var8 + var9_int;
                    var6 = var6 + 2 * var9_int;
                    pn.field_e = pn.field_e - var9_int;
                    em.field_bb = em.field_bb + var9_int;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    q.field_c.j();
                    var9 = new ja(q.field_c.field_z, q.field_c.field_u);
                    var9.a();
                    dc.field_Lb.a(var14, pg.field_c, em.field_bb, ol.field_p, ai.field_a, 16777215, -1, 1, 1, dc.field_Lb.field_r + dc.field_Lb.field_C);
                    sq.a(5, var9.field_z, 3, var9.field_u, var9, 1, 0, 0);
                    q.field_c.a();
                    var9.g(0, 0);
                    ej.field_j = new ja(640, 480);
                    ej.field_j.a();
                    q.field_c.d(ed.field_b + (q.field_c.field_z >> -2139018463), pn.field_e + (q.field_c.field_u >> 326108097), qd.field_N, 4096);
                    q.field_c = null;
                    ej.field_j.d();
                    oo.a(var28, var2, var3);
                    oo.b(b.field_f);
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (null == ie.field_ib) {
                        statePc = 35;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (null != gf.field_e) {
                        statePc = 34;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 34: {
                    var29 = oo.field_i;
                    var2 = oo.field_b;
                    var3 = oo.field_l;
                    oo.a(b.field_f);
                    var16 = new ja(412, 43);
                    var5_ref_String = vl.a(vk.field_F, new String[]{ie.field_ib}, 2);
                    ie.field_ib = null;
                    var16.a();
                    gf.field_e.a(var5_ref_String, 3, 3, var16.field_x + -6, -6 + var16.field_w, 16777215, -1, 0, 1, gf.field_e.field_C - -gf.field_e.field_r);
                    sq.a(5, var16.field_x, 3, var16.field_w, var16, 1, 0, 0);
                    rq.field_v.a();
                    var16.g(-rq.field_v.field_r + 199, -rq.field_v.field_y + 83);
                    oo.a(var29, var2, var3);
                    oo.b(b.field_f);
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (null == bd.field_e) {
                        statePc = 38;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (null == gf.field_e) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var30 = oo.field_i;
                    var2 = oo.field_b;
                    var3 = oo.field_l;
                    oo.a(b.field_f);
                    var4 = 6 + gf.field_e.c(tf.field_Cb, 640);
                    var5 = 20 + (var4 - -bd.field_e.field_z);
                    var6 = 427 - var5 / 2;
                    var7 = var6 - (-bd.field_e.field_z - 20);
                    rq.field_v.a();
                    gf.field_e.c(tf.field_Cb, var7 + -rq.field_v.field_r, gf.field_e.field_r + (gf.field_e.field_C + -rq.field_v.field_y + 155), 16777215, -1);
                    sq.a(5, var4, 3, 50, rq.field_v, 1, -4 + var7 + -rq.field_v.field_r, -rq.field_v.field_y + 155);
                    var8 = -rq.field_v.field_y + (155 + -((-gf.field_e.field_r + (-gf.field_e.field_C + (-3 + bd.field_e.field_u))) / 2));
                    bd.field_e.g(var6 + -rq.field_v.field_r, var8);
                    oo.a(var30, var2, var3);
                    oo.b(b.field_f);
                    bd.field_e = null;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    oo.a(b.field_f);
                    oo.b(16, 16, 608, 112, 15, gg.field_c, pf.field_c);
                    oo.b(231, 144, 393, 232, 15, gg.field_c, pf.field_c);
                    if (null != ag.field_b) {
                        statePc = 40;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 40: {
                    ag.field_b.g(0, 0);
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    if (null == pn.field_a) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    pn.field_a.g(0, 0);
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    rq.field_v.g(0, 0);
                    if (null == ej.field_j) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    ej.field_j.g(0, 0);
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (ha.field_l == null) {
                        statePc = 60;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (er.field_j == null) {
                        statePc = 60;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    ha.field_l.g(231, 390);
                    var1 = ig.field_e;
                    if (gl.field_H.field_d == 0) {
                        statePc = 49;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var1 = kg.field_j;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    var1.g(0, 0);
                    stackIn_52_0 = 105;
                    stackIn_51_0 = stackIn_52_0;
                    stackIn_52_1 = fn.field_c;
                    stackIn_51_1 = stackIn_52_1;
                    if (gl.field_H.field_d != 0) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    stackIn_53_0 = stackIn_51_0;
                    stackIn_53_1 = stackIn_51_1;
                    stackIn_53_2 = 4;
                    statePc = 53;
                    continue stateLoop;
                }
                case 52: {
                    stackIn_53_0 = stackIn_52_0;
                    stackIn_53_1 = stackIn_52_1;
                    stackIn_53_2 = 3;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var2 = (q.a((byte) stackIn_53_0, stackIn_53_1 << stackIn_53_2) * 40 >> 505315792) + 40;
                    if ((var2 ^ -1) < -1) {
                        statePc = 55;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 55: {
                    ha.field_l.e(230, 389, var2);
                    ha.field_l.e(232, 389, var2);
                    ha.field_l.e(232, 391, var2);
                    ha.field_l.e(230, 391, var2);
                    var1.e(1, 1, var2);
                    var1.e(-1, 1, var2);
                    var1.e(1, -1, var2);
                    var1.e(-1, -1, var2);
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    stackIn_58_0 = jp.field_d;
                    stackIn_57_0 = stackIn_58_0;
                    stackIn_58_1 = cr.field_j;
                    stackIn_57_1 = stackIn_58_1;
                    stackIn_58_2 = -59;
                    stackIn_57_2 = stackIn_58_2;
                    if (gl.field_H.field_d != 0) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackIn_59_0 = stackIn_57_0;
                    stackIn_59_1 = stackIn_57_1;
                    stackIn_59_2 = stackIn_57_2;
                    stackIn_59_3 = 1;
                    statePc = 59;
                    continue stateLoop;
                }
                case 58: {
                    stackIn_59_0 = stackIn_58_0;
                    stackIn_59_1 = stackIn_58_1;
                    stackIn_59_2 = stackIn_58_2;
                    stackIn_59_3 = 0;
                    statePc = 59;
                    continue stateLoop;
                }
                case 59: {
                    bc.a(stackIn_59_0, stackIn_59_1, (byte) stackIn_59_2, stackIn_59_3 != 0);
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (null == ha.field_l) {
                        statePc = 68;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (er.field_j == null) {
                        statePc = 68;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    ha.field_l.g(434, 390);
                    ia.field_y.g(0, 0);
                    if (1 != gl.field_H.field_d) {
                        statePc = 64;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    pi.a((byte) -122, 436, 64, -4 + ha.field_l.field_x, ha.field_l.field_w * 7 / 12, 392);
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    stackIn_66_0 = il.field_k;
                    stackIn_65_0 = stackIn_66_0;
                    stackIn_66_1 = sq.field_O;
                    stackIn_65_1 = stackIn_66_1;
                    stackIn_66_2 = -59;
                    stackIn_65_2 = stackIn_66_2;
                    if (1 != gl.field_H.field_d) {
                        statePc = 66;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    stackIn_67_0 = stackIn_65_0;
                    stackIn_67_1 = stackIn_65_1;
                    stackIn_67_2 = stackIn_65_2;
                    stackIn_67_3 = 1;
                    statePc = 67;
                    continue stateLoop;
                }
                case 66: {
                    stackIn_67_0 = stackIn_66_0;
                    stackIn_67_1 = stackIn_66_1;
                    stackIn_67_2 = stackIn_66_2;
                    stackIn_67_3 = 0;
                    statePc = 67;
                    continue stateLoop;
                }
                case 67: {
                    bc.a(stackIn_67_0, stackIn_67_1, (byte) stackIn_67_2, stackIn_67_3 != 0);
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (null != fa.field_Tb) {
                        statePc = 70;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var1_int = -(fa.field_Tb.field_u / 2) + 357;
                    fa.field_Tb.g(269 - fa.field_Tb.field_z, var1_int);
                    mb.field_j.g(586, var1_int);
                    if (var1_int >= bo.field_d) {
                        statePc = 82;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (bo.field_d >= var1_int - -fa.field_Tb.field_w) {
                        statePc = 82;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var2 = 40 + (40 * q.a((byte) -47, fn.field_c << -1016290268) >> 715507184);
                    if ((var2 ^ -1) < -1) {
                        statePc = 74;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (269 - fa.field_Tb.field_x >= bd.field_g) {
                        statePc = 77;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (269 > bd.field_g) {
                        statePc = 81;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (bd.field_g <= 586) {
                        statePc = 82;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (586 + fa.field_Tb.field_x <= bd.field_g) {
                        statePc = 82;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    mb.field_j.e(585, -1 + var1_int, var2);
                    mb.field_j.e(587, var1_int - 1, var2);
                    mb.field_j.e(585, var1_int - -1, var2);
                    mb.field_j.e(587, 1 + var1_int, var2);
                    if (var10 == 0) {
                        statePc = 82;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    fa.field_Tb.e(-fa.field_Tb.field_z + 268, var1_int + -1, var2);
                    fa.field_Tb.e(1 + (-fa.field_Tb.field_z + 269), var1_int + -1, var2);
                    fa.field_Tb.e(-fa.field_Tb.field_z + 268, 1 + var1_int, var2);
                    fa.field_Tb.e(269 - fa.field_Tb.field_z + 1, var1_int - -1, var2);
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    cd.c((byte) -57);
                    if (param0) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    return;
                }
                case 84: {
                    ao.field_h[gf.field_g].g(269, 340);
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ll f(int param0) {
        this.field_x = pi.field_i;
        this.field_j = ng.field_d;
        this.field_u.a((byte) -26, this.field_q, this.field_e);
        hn.field_h = false;
        ll var2 = u.a(param0 + 10386, pl.field_J, this.field_q, 0, param0, this.field_e);
        if (var2 == null) {
            this.d(param0 + -44);
        }
        return var2;
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 71 % ((param1 - 20) / 54);
        this.field_b = param0;
        this.field_d = param2;
    }

    private final void c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = this.field_b;
        var3 = this.field_d;
        if (!this.a(0)) {
          this.field_a = false;
          return;
        } else {
          L0: {
            L1: {
              if (var2 <= this.field_o) {
                break L1;
              } else {
                var2 = this.field_o;
                if (var5 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (var2 >= this.field_s) {
              break L0;
            } else {
              var2 = this.field_s;
              break L0;
            }
          }
          L2: {
            L3: {
              if (var3 > this.field_n) {
                break L3;
              } else {
                if (var3 < this.field_h) {
                  var3 = this.field_h;
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  break L2;
                }
              }
            }
            var3 = this.field_n;
            break L2;
          }
          L4: {
            if (0.0f >= this.field_c) {
              break L4;
            } else {
              L5: {
                var4 = (int)(0.5f + (float)var3 * this.field_c);
                if (var4 > var2) {
                  break L5;
                } else {
                  if (var2 > var4) {
                    var2 = var4;
                    if (var5 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              var3 = (int)((float)var2 / this.field_c);
              break L4;
            }
          }
          L6: {
            L7: {
              if (var2 != ng.field_d) {
                break L7;
              } else {
                if (var3 == pi.field_i) {
                  break L6;
                } else {
                  break L7;
                }
              }
            }
            this.field_u.a((byte) -27, var3, var2);
            break L6;
          }
          L8: {
            if (this.field_b <= param0) {
              break L8;
            } else {
              bl.field_a = (-ng.field_d + this.field_b) / 2;
              break L8;
            }
          }
          return;
        }
    }

    private ok() throws Throwable {
        throw new Error();
    }

    final void d(int param0) {
        if (param0 > -3) {
            return;
        }
        this.field_u.a((byte) -85, this.field_x, this.field_j);
    }

    final static void a(int param0, int param1, ga param2, int param3, int param4, int param5) {
        if (op.field_m.field_c) {
            return;
        }
        if (df.field_I) {
            cf.field_s.a(param1, -11513, 0, param5, param4);
            return;
        }
        try {
            if (param0 >= -95) {
                ok.e(112);
            }
            param2.b((byte) -35, 59);
            param2.a(param3, (byte) -87);
            param2.a(123, param5);
            param2.a(param4, (byte) -112);
            param2.a(param1, (byte) -50);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ok.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0) {
        int stackIn_5_0 = 0;
        if (param0 != 0) {
          return true;
        } else {
          L0: {
            L1: {
              if (mk.field_d < this.field_f) {
                break L1;
              } else {
                if (0 >= vl.field_h) {
                  break L1;
                } else {
                  stackIn_5_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_5_0 = 0;
            break L0;
          }
          return stackIn_5_0 != 0;
        }
    }

    static {
        field_t = "Famished";
        field_i = "Your powerups will last longer if you have this trait equipped.";
        field_r = new int[8192];
    }
}
