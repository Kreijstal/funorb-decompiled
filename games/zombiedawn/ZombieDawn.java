/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class ZombieDawn extends m {
    private boolean field_F;
    static dj field_H;
    static long[] field_E;
    private StringBuilder field_I;
    private StringBuilder field_G;
    static rb field_K;
    static String field_D;
    public static int field_J;

    final void b(byte param0) {
        ((ZombieDawn) this).a(41, 7, 11, false, 9, 0, 1, 10);
        int var2 = 89 / ((35 - param0) / 49);
        oj.field_d = new tl();
        ((ZombieDawn) this).a((ug) (Object) oj.field_d, (byte) 14);
        rj var3 = new rj();
        var3.a(128, (byte) -128, 9);
        ac.a(vh.field_a, true, (java.awt.Component) (Object) cj.field_d, var3, 22050, -97);
        ((ZombieDawn) this).a(false, true, true, false, -6046);
    }

    final boolean n(int param0) {
        if (param0 != 10) {
            field_E = null;
            return false;
        }
        return false;
    }

    public final boolean a(char param0, int param1, int param2) {
        if (null != ke.field_c) {
            if (!(sg.field_eb != ke.field_c)) {
                return ke.field_c.a(param1, 65793, param0);
            }
        }
        if (param2 != 20) {
            return true;
        }
        return false;
    }

    public final void a(int param0) {
        al var2 = null;
        int var3 = 0;
        String var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        al var17 = null;
        Runtime var18 = null;
        al stackIn_5_0 = null;
        al stackOut_4_0 = null;
        al stackOut_3_0 = null;
        L0: {
          var16 = field_J;
          bi.d();
          if (sg.field_eb != ke.field_c) {
            L1: {
              if (ke.field_c.field_d == 0) {
                stackOut_4_0 = sg.field_eb;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = ke.field_c;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var17 = stackIn_5_0;
              var2 = var17;
              if (!oj.field_d.field_n) {
                break L2;
              } else {
                if (po.field_xb < 16) {
                  break L2;
                } else {
                  po.field_xb = 15;
                  break L2;
                }
              }
            }
            if (16 <= po.field_xb) {
              sg.field_eb.b((byte) 108);
              sg.field_eb.a((byte) -102);
              var17.a(512 + -(po.field_xb << -1880089340), (byte) -128, true);
              break L0;
            } else {
              ke.field_c.b((byte) 120);
              ke.field_c.a((byte) -118);
              var17.a(po.field_xb << -626509916, (byte) 46, false);
              break L0;
            }
          } else {
            ke.field_c.b((byte) 112);
            ke.field_c.a((byte) -86);
            break L0;
          }
        }
        L3: {
          L4: {
            if (!oj.field_d.field_n) {
              break L4;
            } else {
              L5: {
                if (0.0f < oj.field_d.field_b) {
                  break L5;
                } else {
                  if (!((ZombieDawn) this).field_F) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                ((ZombieDawn) this).field_F = true;
                var2 = (al) (Object) sg.field_jb;
                var3 = 380;
                var4_ref = jh.field_l;
                var5 = ((rb) (Object) var2).b(var4_ref);
                if (var3 > var5) {
                  var5 = var3 + 20;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                L8: {
                  var6 = 100;
                  var7 = nh.field_G;
                  var8 = bd.field_d;
                  var9 = -(var6 / 2) + var7;
                  var10 = -(var5 / 2) + var8 - 10;
                  var11 = 10 + (var5 / 2 + var8);
                  var12 = var6 / 2 + var7;
                  g.a(var9, (byte) 99, var11, var12, var10);
                  if (bd.field_e != 640) {
                    break L8;
                  } else {
                    if (480 == nh.field_P) {
                      qk.field_Hb[0].e(0, 0);
                      qk.field_Hb[0].b(0, 0, 256);
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var13 = bd.field_e / 128;
                var14 = nh.field_P / 96;
                qk.field_Hb[0].a(-var13, -var14, 2 * var13 + bd.field_e, var14 * 2 + nh.field_P);
                qk.field_Hb[0].b(-var13, -var14, bd.field_e - -(2 * var13), var14 * 2 + nh.field_P, 150);
                break L7;
              }
              L9: {
                L10: {
                  bi.f(var10, var9, var8, var7);
                  pf.field_f.b(var10, var9);
                  bi.f(var8, var9, var11, var7);
                  pf.field_f.b(-pf.field_f.field_w + var11, var9);
                  bi.f(var10, var7, var8, var12);
                  pf.field_f.b(var10, -pf.field_f.field_t + var12);
                  bi.f(var8, var7, var11, var12);
                  pf.field_f.b(var11 + -pf.field_f.field_w, -pf.field_f.field_t + var12);
                  bi.f(var10, var9, var11, var12);
                  ((rb) (Object) var2).a(var4_ref, bd.field_d, nh.field_G, 2, -1);
                  var13 = (int)(oj.field_d.field_b * (float)var3 / 100.0f);
                  bi.b(var8 + -(var3 / 2), 10 + var7, var3, 12, 0);
                  bi.f(-(var3 / 2) + var8, var7 + 10, var8 + (-(var3 / 2) - -var13), var7 - -22);
                  if (-641 != (bd.field_e ^ -1)) {
                    break L10;
                  } else {
                    if (480 != nh.field_P) {
                      break L10;
                    } else {
                      qk.field_Hb[3].e(0, 0);
                      qk.field_Hb[3].b(0, 0, 150);
                      break L9;
                    }
                  }
                }
                var14 = bd.field_e / 128;
                var15 = nh.field_P / 96;
                qk.field_Hb[3].a(-var14, -var15, var14 * 2 + bd.field_e, 2 * var15 + nh.field_P);
                qk.field_Hb[3].b(-var14, -var15, 2 * var14 + bd.field_e, 2 * var15 + nh.field_P, 150);
                break L9;
              }
              bi.c(-(var3 / 2) + var8, var7 - -10, var3, 12, 4458504);
              pa.a(param0 ^ 26807);
              break L3;
            }
          }
          ((ZombieDawn) this).field_F = false;
          break L3;
        }
        L11: {
          if ((lo.field_j ^ -1) > -3) {
            break L11;
          } else {
            if (bn.field_f) {
              L12: {
                if (((ZombieDawn) this).field_G == null) {
                  ((ZombieDawn) this).field_G = new StringBuilder("Mem: 00000KiB");
                  ((ZombieDawn) this).field_I = new StringBuilder("FPS: 00");
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (tp.field_p % 50L == 0L) {
                  var18 = Runtime.getRuntime();
                  var3 = (int)(var18.totalMemory() - var18.freeMemory()) >> -1221530038;
                  var4 = mf.field_d;
                  var5 = 9;
                  L14: while (true) {
                    if (var5 <= 4) {
                      var5 = 6;
                      L15: while (true) {
                        if (var5 <= 4) {
                          break L13;
                        } else {
                          ((ZombieDawn) this).field_I.setCharAt(var5, (char)(48 + var4 % 10));
                          var4 = var4 / 10;
                          var5--;
                          continue L15;
                        }
                      }
                    } else {
                      ((ZombieDawn) this).field_G.setCharAt(var5, (char)(var3 % 10 - -48));
                      var3 = var3 / 10;
                      var5--;
                      continue L14;
                    }
                  }
                } else {
                  break L13;
                }
              }
              pc.field_k.c(((ZombieDawn) this).field_G.toString(), 5, 20, 16777215, 1);
              pc.field_k.c(((ZombieDawn) this).field_I.toString(), 5, 35, 16777215, 1);
              break L11;
            } else {
              break L11;
            }
          }
        }
        L16: {
          if (param0 == -14964) {
            break L16;
          } else {
            ((ZombieDawn) this).field_G = null;
            break L16;
          }
        }
    }

    public ZombieDawn() {
        sa.field_Y = (ZombieDawn) this;
    }

    final void o(int param0) {
        if (ke.field_c.field_d == 6) {
            // ifne L40
            ke.field_c = jj.c(3, 123);
            ca.a(false, true, 3);
        } else {
            if (!((dp.field_h ^ -1) == -2147483648)) {
                ca.a(true, true, dp.field_h);
            }
        }
        if (param0 != 1235) {
            ((ZombieDawn) this).field_F = true;
        }
        bh.a(0);
        if (!(0 >= be.field_j)) {
            oj.field_d.b(param0 + -1126, 1);
        }
    }

    final void g(boolean param0) {
        ag.a(-107, param0);
        fh.i(0);
        mf.a((byte) -67);
        ke.field_c = jj.c(11, 122);
        ca.a(true, true, 1);
        kp.a(50, (byte) 3);
        if (!(ng.field_e)) {
            qb.a(false, 224);
            ZombieDawn.b(119, 288);
            ph.a((byte) 106, w.field_a[0]);
        }
        if (!ng.field_e) {
            if (!(po.w(13296))) {
                b discarded$0 = l.b(102, 4);
            }
        }
        ep.c((byte) -50);
    }

    final void a(int param0, int param1) {
        if (param1 < 27) {
            field_K = null;
        }
    }

    public final void a(boolean param0, boolean param1) {
        int var4 = 0;
        wg var5 = null;
        L0: {
          L1: {
            var4 = field_J;
            tp.field_p = tp.field_p + 1L;
            if (bd.field_e != te.field_eb) {
              break L1;
            } else {
              if (kj.field_c == nh.field_P) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            nh.field_P = kj.field_c;
            bd.field_e = te.field_eb;
            vh.field_b = (-640 + bd.field_e) / 2;
            qj.field_d = bd.field_e;
            me.field_Bb = nh.field_P;
            id.field_M = (nh.field_P - 480) / 2;
            nh.field_I = nh.field_P / 24 - -2;
            bd.field_a = bd.field_e / 24 - -2;
            bd.field_d = bd.field_e / 2;
            nh.field_G = nh.field_P / 2;
            if (lf.field_h == null) {
              break L2;
            } else {
              L3: {
                if (lf.field_h.field_w != bd.field_e) {
                  break L3;
                } else {
                  if (lf.field_h.field_t == nh.field_P) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              lf.field_h = null;
              lf.field_h = new vn(bd.field_e, nh.field_P);
              break L2;
            }
          }
          on.field_q = -1;
          break L0;
        }
        L4: {
          if (!po.w(13296)) {
            L5: while (true) {
              var5 = (wg) (Object) dn.field_D.f(123);
              if (var5 != null) {
                dd.a(5, var5, -62);
                continue L5;
              } else {
                break L4;
              }
            }
          } else {
            break L4;
          }
        }
        L6: {
          oj.field_d.e(47);
          if (!param1) {
            break L6;
          } else {
            boolean discarded$1 = ((ZombieDawn) this).n(20);
            break L6;
          }
        }
        L7: {
          if (!we.o((byte) -80)) {
            break L7;
          } else {
            param0 = false;
            break L7;
          }
        }
        if (!oj.field_d.field_n) {
          L8: {
            if (ke.field_c == sg.field_eb) {
              ke.field_c.a((byte) -102, param0);
              break L8;
            } else {
              L9: {
                if (sg.field_eb.field_d != -1) {
                  break L9;
                } else {
                  sg.field_eb.a((byte) -115, param0);
                  break L9;
                }
              }
              po.field_xb = po.field_xb + 1;
              if (-33 == po.field_xb) {
                L10: {
                  if (ke.field_c.field_d == 3) {
                    bd.field_m = null;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                ke.field_c.a(sg.field_eb, 72);
                ke.field_c = sg.field_eb;
                po.field_xb = 0;
                break L8;
              } else {
                break L8;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void c(int param0) {
        kl.c(-16861);
        if (param0 != 16850) {
            return;
        }
        pg.c(1);
    }

    final boolean a(am param0, int param1, int param2) {
        if (param2 != 2) {
            ZombieDawn.b(-101, 34);
        }
        return false;
    }

    final static void b(int param0, int param1) {
        ce.field_u = param1;
        if (!(uh.field_o == null)) {
            uh.field_o.a(param1, (byte) -64);
        }
        if (param0 < 112) {
            ZombieDawn.b(-94, 83);
        }
        if (null != nc.field_p) {
            nc.field_p.a((byte) 122, param1);
        }
    }

    final static void q(int param0) {
        if (param0 != -10401) {
            ZombieDawn.k((byte) 6);
        }
        bm.field_d.b(20, (ga) (Object) new di());
    }

    final void c(boolean param0) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        L0: {
          ZombieDawn.k((byte) 114);
          mk.b(4);
          vo.c((byte) -61);
          bi.a();
          rb.a();
          am.j(-98);
          ff.a(-1);
          sb.a(false);
          m.j((byte) -125);
          rn.a(-12637);
          fo.a(false);
          cm.a(0);
          he.a((byte) 85);
          ti.a(4);
          ua.a(-20441);
          al.c((byte) 2);
          nl.d((byte) 69);
          ph.a(-1);
          tg.a((byte) 85);
          wb.f(false);
          aj.a((byte) 86);
          ke.b(40);
          li.b(-72);
          h.a(-14380);
          uc.b(103);
          dj.b(108);
          ob.a(41);
          mp.a(13);
          de.e(27291);
          pd.a((byte) -117);
          ne.a((byte) 83);
          gf.a(true);
          wn.a(0);
          ha.a(127);
          hc.a((byte) -121);
          c.a(true);
          aa.a(-2008296413);
          ja.a(param0);
          rk.a(16);
          ni.a(-1);
          ln.a(-5);
          dh.a(16);
          jk.c(50);
          la.c(71);
          lg.a((byte) 49);
          ae.a(false);
          if (param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          hi.f(stackIn_3_0 != 0);
          tl.d(123);
          le.b((byte) 61);
          jd.a((byte) 126);
          ta.a(false);
          mb.a();
          ka.a((byte) 118);
          ca.a(true);
          o.a(true);
          fl.a((byte) -54);
          kl.e((byte) -112);
          ac.d((byte) -104);
          fg.c(-25585);
          pl.d((byte) -95);
          if (param0) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          pc.b(stackIn_6_0 != 0);
          sh.a((byte) -122);
          bp.a(-16785);
          sf.c(0);
          gm.a((byte) 105);
          dl.a(-974314864);
          lf.a(-9742);
          jg.g();
          ip.c((byte) 10);
          qf.c();
          tp.d(0);
          sc.a(126);
          dd.a((byte) 68);
          jp.a(false);
          vd.a(128);
          ng.b((byte) -126);
          nb.a(-107);
          da.c((byte) 93);
          dc.a(-79);
          mj.a((byte) -86);
          uk.a(-21);
          ro.b((byte) -99);
          vj.e((byte) 112);
          ap.a(false);
          ej.b((byte) -115);
          wk.a(60);
          ub.c((byte) 93);
          uh.c((byte) 73);
          qj.a(97);
          kd.w(54);
          ah.u(60);
          on.a((byte) 122);
          g.i(0);
          kk.c((byte) -125);
          fb.h(237239984);
          ig.x(-96);
          u.b(-71);
          co.d(28186);
          ji.c(-9);
          qd.a(-79);
          d.a(6);
          nk.a(-11486);
          qb.a(-6633);
          hd.d((byte) -77);
          ei.a(123);
          dn.h(0);
          i.m(10);
          bh.c(117);
          ma.c((byte) 13);
          nf.a(0);
          gg.a((byte) -103);
          uo.c(-1640531527);
          qn.a(0);
          nd.a(-128);
          td.a((byte) 94);
          oc.a(96);
          je.a(2);
          ce.d(-128);
          mf.a(123);
          vi.a(-51);
          md.n(54);
          sa.g((byte) 88);
          cf.m(18072);
          sg.b(false);
          fk.e((byte) -31);
          di.b(true);
          ih.a(-31608);
          ui.b(117);
          sl.a(79);
          kj.a((byte) 122);
          pg.d(-5);
          so.a();
          nm.b(-101);
          bb.a(-107);
          qc.a((byte) 61);
          re.a(param0);
          nc.d(-2135443998);
          ge.a(256);
          vl.a((byte) -51);
          qo.a((byte) -68);
          t.b(27803);
          el.a(-1);
          vf.b(4056);
          cj.b(25808);
          pa.d((byte) 25);
          vg.a(-1);
          lb.h((byte) -118);
          pn.k(-74);
          nh.f((byte) -29);
          an.f(-119);
          r.a(0);
          hp.f(84);
          vh.a((byte) 31);
          jh.a(13192);
          ci.a(false);
          w.a((byte) -98);
          en.a();
          f.a((byte) 39);
          gd.a((byte) -45);
          p.a(false);
          wi.a((byte) 61);
          cl.a((byte) 87);
          wh.a(0);
          cb.e(112);
          pf.a((byte) 88);
          rm.a(0);
          to.a((byte) 113);
          mo.a(-76);
          rf.a(11021);
          lj.a();
          ba.a(false);
          n.a(128);
          ch.a(1426);
          il.a(4466);
          hj.a();
          qp.a((byte) 92);
          dm.d(3);
          ia.a(25268);
          lc.a(-1);
          ed.a((byte) 54);
          bm.a(0);
          sj.a(1222359528);
          hg.a(140);
          qg.a(26161);
          pi.d(-1);
          te.f((byte) 105);
          id.i(-72);
          tf.c(-12220);
          if (param0) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          kc.c(stackIn_9_0 != 0);
          mm.e((byte) 47);
          ck.d(1);
          be.c(true);
          ea.a((byte) 82);
          if (param0) {
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = 1;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          no.b(stackIn_12_0 != 0);
          gn.a(127);
          hk.b(true);
          we.x(16777215);
          ao.i(-106);
          gk.i(114);
          me.x(95);
          wo.w(86);
          oo.f((byte) 117);
          si.w(255);
          qk.v(15213);
          jo.o((byte) -73);
          ve.a();
          wc.o((byte) -73);
          ek.i(0);
          dk.p((byte) 91);
          qm.a(0);
          og.a(false);
          na.a((byte) 79);
          wd.g(1445852592);
          pj.f(32);
          ie.a();
          q.c(false);
          ic.l(16604);
          if (param0) {
            stackOut_14_0 = 0;
            stackIn_15_0 = stackOut_14_0;
            break L4;
          } else {
            stackOut_13_0 = 1;
            stackIn_15_0 = stackOut_13_0;
            break L4;
          }
        }
        L5: {
          tb.d(stackIn_15_0 != 0);
          ki.g((byte) 122);
          hb.f(-86);
          kn.b(false);
          hm.g(-27476);
          np.a(1569045130);
          wf.h(102);
          fm.a(12959);
          if (param0) {
            stackOut_17_0 = 0;
            stackIn_18_0 = stackOut_17_0;
            break L5;
          } else {
            stackOut_16_0 = 1;
            stackIn_18_0 = stackOut_16_0;
            break L5;
          }
        }
        L6: {
          pm.a(stackIn_18_0 != 0);
          fe.a(67);
          ho.a((byte) 118);
          if (param0) {
            stackOut_20_0 = 0;
            stackIn_21_0 = stackOut_20_0;
            break L6;
          } else {
            stackOut_19_0 = 1;
            stackIn_21_0 = stackOut_19_0;
            break L6;
          }
        }
        L7: {
          bd.a(stackIn_21_0 != 0);
          vb.f((byte) -104);
          po.v(-31113);
          cn.a(92);
          hf.d((byte) -34);
          rl.b(-103);
          ad.b(-1819016370);
          ij.g(-1);
          qi.a(0);
          nj.b(false);
          kf.m(4347);
          rg.g(13885);
          em.g((byte) -69);
          kp.b((byte) -119);
          cg.a(true);
          ii.a((byte) -109);
          bj.e(42);
          jl.e((byte) -113);
          se.c(32);
          uj.a(256);
          hl.a((byte) 122);
          ag.a((byte) 48);
          b.c((byte) -47);
          bo.c(7644);
          tk.b(-90);
          af.a(25752);
          bg.c((byte) -44);
          lo.c((byte) -79);
          wg.a(110);
          uf.a(-103);
          jc.a(830);
          rc.a(0);
          km.a((byte) 49);
          hn.c((byte) 94);
          if (param0) {
            stackOut_23_0 = 0;
            stackIn_24_0 = stackOut_23_0;
            break L7;
          } else {
            stackOut_22_0 = 1;
            stackIn_24_0 = stackOut_22_0;
            break L7;
          }
        }
        L8: {
          vm.a(stackIn_24_0 != 0);
          dp.a(true);
          tc.c(-26642);
          jm.a(param0);
          jb.a(-59);
          mh.e((byte) -72);
          k.c(114);
          oh.g(-101);
          j.a((byte) -3);
          df.c(-24231);
          ep.a(0);
          nn.c(2);
          sd.a(80);
          eo.a(-25401);
          tm.a(-5364);
          cc.a(-27940);
          sn.a((byte) 93);
          bn.b(5);
          ld.d(25008);
          l.b(-1);
          sm.a(true);
          e.b(true);
          gj.a(120);
          oe.c(15);
          eb.a(false);
          kh.a(-67);
          ud.a((byte) -105);
          gl.a(8);
          oj.a(-14311);
          s.c((byte) -123);
          lm.i(3);
          jj.j(2021978896);
          a.b((byte) 105);
          if (param0) {
            stackOut_26_0 = 0;
            stackIn_27_0 = stackOut_26_0;
            break L8;
          } else {
            stackOut_25_0 = 1;
            stackIn_27_0 = stackOut_25_0;
            break L8;
          }
        }
        ql.b(stackIn_27_0 != 0);
        kg.d(-2314);
        mc.e((byte) -13);
        lk.d(1029);
        kb.d(111);
        fj.e((byte) -127);
        wl.a((byte) -86);
        eg.c(-26441);
        vk.a((byte) -90);
        ((ZombieDawn) this).field_u = null;
        ((ZombieDawn) this).field_I = null;
        ((ZombieDawn) this).field_G = null;
    }

    public final void init() {
        ((ZombieDawn) this).a(12, 108, "zombiedawn");
    }

    public static void k(byte param0) {
        field_K = null;
        field_H = null;
        field_D = null;
        field_E = null;
        if (param0 <= 109) {
            field_E = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new long[32];
        field_D = "Score";
    }
}
