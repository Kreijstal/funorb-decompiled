/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij implements wb {
    static mh field_b;
    static int field_d;
    static mh field_c;
    static mh field_e;
    static String field_f;
    static mh field_a;

    private final boolean d(boolean param0) {
        if (rf.field_g == null) {
            rf.field_g = cp.b(-2, 0, 2, 10, 3);
        }
        if (!param0) {
            return false;
        }
        if (rf.field_g.field_o) {
            be.field_a = true;
            r.field_A = true;
            if (null != rf.field_g.field_i) {
                if (null != rf.field_g.field_i[1][0]) {
                    r.field_A = false;
                    be.field_a = false;
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final void a(boolean param0) {
        boolean discarded$0 = false;
        vl.a(127, 50);
        pa var2 = new pa(cd.field_h);
        jp[] var3 = (jp[]) null;
        ie.a(1, (jp[]) null, vn.field_G, 240, af.field_A, 8, 2, nn.field_g, 0, 2, 100, 8, 0, 320, 0);
        hd.a(93, var2, 20, 20);
        if (param0) {
            discarded$0 = this.b((byte) -1);
        }
        jp[] var4 = (jp[]) null;
        nh.a((jp[]) null, 240, 8, 320, 0, nn.field_g, 2, 0, 1, af.field_A, 0, vn.field_G, 2, (byte) -110, 8);
        ka.a(20, -97, 20, var2);
        oa.a(jf.field_d, no.field_t, 2, j.field_jb, tk.field_k, wn.field_c, (jp[][]) null, gq.field_Rb, true, 1, jb.field_I, j.field_jb, wd.field_C, qh.field_h, 22287);
        ea.field_g = true;
        c.field_e = er.field_b;
        pn.b(-9, 200);
        op.a(new sb(), 0);
        td.g(0);
        qn.a(240, 0, 640, 0, -6532);
        bm.a(kh.field_i, qb.field_r, 24876, uj.field_o, gf.field_e, ki.field_f, i.field_s);
        oc.a(1, ob.field_D);
        hk.h((byte) 55);
        hk.a((byte) 115, ki.field_f);
        lp.field_rb = (gf) ((Object) bq.a(21, 28472));
        co.a((byte) -79, cd.field_g);
    }

    final static gf a(int param0, byte param1) {
        if (!(-1 != param0)) {
            return (gf) ((Object) pe.field_o);
        }
        if (1 == (param0 ^ -1)) {
            return (gf) ((Object) ki.field_p);
        }
        if (param1 > -5) {
            field_e = (mh) null;
        }
        return (gf) ((Object) bq.a(param0, 28472));
    }

    public static void c(boolean param0) {
        field_f = null;
        field_e = null;
        if (param0) {
            ij.c(true);
        }
        field_c = null;
        field_b = null;
        field_a = null;
    }

    public final boolean a(int param0) {
        int stackIn_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          if (hb.field_y) {
            break L0;
          } else {
            hb.field_y = gq.d((byte) -126);
            break L0;
          }
        }
        L1: {
          if (!jc.field_H) {
            jc.field_H = this.b((byte) 127);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param0 == 23570) {
            break L2;
          } else {
            this.a(true);
            break L2;
          }
        }
        L3: {
          if (!th.field_b) {
            th.field_b = this.d(true);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          L5: {
            if (!hb.field_y) {
              break L5;
            } else {
              if (!jc.field_H) {
                break L5;
              } else {
                if (!th.field_b) {
                  break L5;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                }
              }
            }
          }
          stackOut_14_0 = 0;
          stackIn_15_0 = stackOut_14_0;
          break L4;
        }
        return stackIn_15_0 != 0;
    }

    private final boolean b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = BrickABrac.field_J ? 1 : 0;
          if (null != fp.field_y) {
            break L0;
          } else {
            fp.field_y = new pe[2];
            var2 = 0;
            L1: while (true) {
              if (-3 >= (var2 ^ -1)) {
                break L0;
              } else {
                fp.field_y[var2] = fa.a(1, (byte) -72, var2, 5);
                var2++;
                continue L1;
              }
            }
          }
        }
        var2 = 1;
        var3 = 0;
        if (param0 == 127) {
          L2: while (true) {
            if ((var3 ^ -1) <= -3) {
              L3: {
                if (var2 != 0) {
                  fp.field_y = null;
                  break L3;
                } else {
                  break L3;
                }
              }
              return var2 != 0;
            } else {
              if (fp.field_y[var3] != null) {
                if (!fp.field_y[var3].field_v) {
                  var2 = 0;
                  var3++;
                  continue L2;
                } else {
                  L4: {
                    if (fp.field_y[var3].field_m[0] > hh.field_b[var3]) {
                      hh.field_b[var3] = fp.field_y[var3].field_m[0];
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  jj.field_d = jj.field_d | ln.a(na.field_L[var3], 0, true, hh.field_b[var3]);
                  if (!pg.c(param0 ^ 27)) {
                    hh.field_b[var3] = 0;
                    var3++;
                    continue L2;
                  } else {
                    hh.field_b[var3] = 0;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var3++;
                continue L2;
              }
            }
          }
        } else {
          return true;
        }
    }

    public final void b(boolean param0) {
        int stackIn_5_0 = 0;
        s stackIn_7_0 = null;
        mf stackIn_7_1 = null;
        s stackIn_8_0 = null;
        mf stackIn_8_1 = null;
        s stackIn_9_0 = null;
        mf stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        s stackOut_6_0 = null;
        mf stackOut_6_1 = null;
        s stackOut_8_0 = null;
        mf stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        s stackOut_7_0 = null;
        mf stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        L0: {
          if (null != qc.field_k) {
            L1: {
              if (param0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            og.a(stackIn_5_0 != 0, qc.field_k);
            qc.field_k = null;
            hc.b(2);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          uf.field_a = aj.a(3, true);
          ki.field_f = bq.a(-6, 0, false, 5, true);
          ul.field_l = aj.a(6, true);
          qb.field_r = aj.a(7, true);
          i.field_s = aj.a(8, param0);
          uj.field_o = aj.a(9, true);
          kh.field_i = aj.a(10, true);
          nl.field_a = aj.a(11, true);
          hp.field_i = aj.a(12, true);
          wd.field_C = aj.a(13, true);
          wn.a(gq.field_Rb, wn.field_c, 0);
          bh.field_tb = new s(82);
          bh.field_tb.a(tm.field_e, "basic", 125, ib.field_F, gq.field_Rb);
          bh.field_tb.a(tm.field_e, "lobby", 126, ib.field_F, gq.field_Rb);
          bh.field_tb.a(tm.field_e, "lobby", 124, ib.field_F, wn.field_c);
          bh.field_tb.a(tm.field_e, "kartika13", 125, ib.field_F, gq.field_Rb);
          bh.field_tb.a(tm.field_e, "basic", 126, ib.field_F, ki.field_f);
          bh.field_tb.a(vh.field_P, "basic", -126, m.field_k, ul.field_l);
          bh.field_tb.a(vh.field_P, "kartika13", 127, m.field_k, wn.field_c);
          bh.field_tb.a(qb.field_r, false, vi.field_n, wl.field_Q);
          bh.field_tb.a(i.field_s, false, vi.field_n, wl.field_Q);
          bh.field_tb.a(uj.field_o, false, kc.field_i, sg.field_m);
          bh.field_tb.a(kh.field_i, false, cm.field_n, bb.field_a);
          bh.field_tb.a(nl.field_a, false, fa.field_j, uo.field_a);
          bh.field_tb.a(hp.field_i, false, fa.field_j, uo.field_a);
          stackOut_6_0 = bh.field_tb;
          stackOut_6_1 = wd.field_C;
          stackIn_8_0 = stackOut_6_0;
          stackIn_8_1 = stackOut_6_1;
          stackIn_7_0 = stackOut_6_0;
          stackIn_7_1 = stackOut_6_1;
          if (param0) {
            stackOut_8_0 = (s) ((Object) stackIn_8_0);
            stackOut_8_1 = (mf) ((Object) stackIn_8_1);
            stackOut_8_2 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            stackIn_9_2 = stackOut_8_2;
            break L2;
          } else {
            stackOut_7_0 = (s) ((Object) stackIn_7_0);
            stackOut_7_1 = (mf) ((Object) stackIn_7_1);
            stackOut_7_2 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_9_2 = stackOut_7_2;
            break L2;
          }
        }
        ((s) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2 != 0, hp.field_k, qm.field_e);
        bh.field_tb.a(uf.field_a, false, hp.field_k, qm.field_e);
    }

    public final boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = BrickABrac.field_J ? 1 : 0;
          var2 = 1;
          var3 = be.field_c;
          if (0 != var3) {
            if (var3 != 1) {
              if (-3 != (var3 ^ -1)) {
                if (3 != var3) {
                  if (4 == var3) {
                    ai.a((byte) 24, 92.0f, vn.field_x);
                    sl.field_C.g(121);
                    sb.a(nl.field_a, hp.field_i, 2);
                    break L0;
                  } else {
                    if (var3 != 5) {
                      return true;
                    } else {
                      rj.a(new fk(uf.field_a.a(121, "", "huffman")), false);
                      uf.field_a = null;
                      break L0;
                    }
                  }
                } else {
                  ai.a((byte) 24, 90.0f, uk.field_u);
                  sl.field_C.g(106);
                  so.a(ki.field_f, gq.field_Rb, ul.field_l, 29137, wn.field_c);
                  break L0;
                }
              } else {
                ai.a((byte) 24, 88.0f, sf.field_bb);
                sl.field_C.g(124);
                var2 = var2 != 0 & wo.a(2) ? 1 : 0;
                break L0;
              }
            } else {
              ai.a((byte) 24, 82.0f, pi.field_s);
              sl.field_C.g(123);
              o.c(123);
              break L0;
            }
          } else {
            mc.a((byte) 115);
            uj.a(-1);
            lq.a(uj.field_o, kh.field_i, (byte) -38, i.field_s, qb.field_r);
            break L0;
          }
        }
        L1: {
          if (var2 != 0) {
            be.field_c = be.field_c + 1;
            break L1;
          } else {
            break L1;
          }
        }
        hc.b(2);
        if (param0 < -41) {
          return false;
        } else {
          field_a = (mh) null;
          return false;
        }
    }

    static {
        field_d = -1;
        field_f = "This password is part of your Player Name, and would be easy to guess";
    }
}
