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
        int discarded$0 = -97;
        int discarded$1 = 22050;
        ac.a(vh.field_a, true, (java.awt.Component) (Object) cj.field_d, var3);
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
        tj var2_ref = null;
        int var3 = 0;
        String var4_ref_String = null;
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
              var17.a(512 + -(po.field_xb << 4), (byte) -128, true);
              break L0;
            } else {
              ke.field_c.b((byte) 120);
              ke.field_c.a((byte) -118);
              var17.a(po.field_xb << 4, (byte) 46, false);
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
                var2_ref = sg.field_jb;
                var3 = 380;
                var4_ref_String = jh.field_l;
                var5 = ((rb) (Object) var2_ref).b(var4_ref_String);
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
                  ((rb) (Object) var2_ref).a(var4_ref_String, bd.field_d, nh.field_G, 2, -1);
                  var13 = (int)(oj.field_d.field_b * (float)var3 / 100.0f);
                  bi.b(var8 + -(var3 / 2), 10 + var7, var3, 12, 0);
                  bi.f(-(var3 / 2) + var8, var7 + 10, var8 + (-(var3 / 2) - -var13), var7 - -22);
                  if (bd.field_e != 640) {
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
          if (lo.field_j < 2) {
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
                  var3 = (int)(var18.totalMemory() - var18.freeMemory()) >> 10;
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
        L0: {
          L1: {
            if (ke.field_c.field_d != 6) {
              break L1;
            } else {
              if (nk.a(8, kg.field_g)) {
                break L1;
              } else {
                ke.field_c = jj.c(3, 123);
                ca.a(false, true, 3);
                break L0;
              }
            }
          }
          if (dp.field_h != 2147483647) {
            ca.a(true, true, dp.field_h);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          if (param0 == 1235) {
            break L2;
          } else {
            ((ZombieDawn) this).field_F = true;
            break L2;
          }
        }
        L3: {
          int discarded$6 = 0;
          bh.a();
          if (0 < be.field_j) {
            oj.field_d.b(param0 + -1126, 1);
            break L3;
          } else {
            break L3;
          }
        }
    }

    final void g(boolean param0) {
        ag.a(-107, param0);
        int discarded$0 = 0;
        fh.i();
        int discarded$1 = -67;
        mf.a();
        ke.field_c = jj.c(11, 122);
        ca.a(true, true, 1);
        int discarded$34 = 3;
        int discarded$37 = 50;
        kp.a();
        if (!(ng.field_e)) {
            qb.a(false, 224);
            ZombieDawn.b(119, 288);
            ph.a((byte) 106, w.field_a[0]);
        }
        if (!ng.field_e) {
            if (!(po.w(13296))) {
                b discarded$38 = l.b(102, 4);
            }
        }
        int discarded$39 = -50;
        ep.c();
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
              if (~kj.field_c == ~nh.field_P) {
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
                if (~lf.field_h.field_w != ~bd.field_e) {
                  break L3;
                } else {
                  if (~lf.field_h.field_t == ~nh.field_P) {
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
            boolean discarded$2 = ((ZombieDawn) this).n(20);
            break L6;
          }
        }
        L7: {
          int discarded$3 = -80;
          if (!we.o()) {
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
                if (sg.field_eb.field_d != 0) {
                  break L9;
                } else {
                  sg.field_eb.a((byte) -115, param0);
                  break L9;
                }
              }
              po.field_xb = po.field_xb + 1;
              if (po.field_xb == 32) {
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
        int discarded$0 = 1;
        pg.c();
    }

    final boolean a(am param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 2) {
                break L1;
              } else {
                ZombieDawn.b(-101, 34);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("ZombieDawn.HA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_3_0 != 0;
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
          int discarded$170 = -61;
          vo.c();
          bi.a();
          rb.a();
          int discarded$171 = -98;
          am.j();
          ff.a(-1);
          sb.a(false);
          m.j((byte) -125);
          int discarded$172 = -12637;
          rn.a();
          int discarded$173 = 0;
          fo.a();
          cm.a(0);
          int discarded$174 = 85;
          he.a();
          ti.a(4);
          ua.a(-20441);
          al.c((byte) 2);
          nl.d((byte) 69);
          ph.a(-1);
          int discarded$175 = 85;
          tg.a();
          wb.f(false);
          aj.a((byte) 86);
          ke.b(40);
          int discarded$176 = -72;
          li.b();
          h.a(-14380);
          int discarded$177 = 103;
          uc.b();
          int discarded$178 = 108;
          dj.b();
          int discarded$179 = 41;
          ob.a();
          int discarded$180 = 13;
          mp.a();
          de.e(27291);
          int discarded$181 = -117;
          pd.a();
          int discarded$182 = 83;
          ne.a();
          gf.a(true);
          int discarded$183 = 0;
          wn.a();
          ha.a(127);
          hc.a((byte) -121);
          c.a(true);
          aa.a(-2008296413);
          ja.a(param0);
          int discarded$184 = 16;
          rk.a();
          ni.a(-1);
          int discarded$185 = -5;
          ln.a();
          int discarded$186 = 16;
          dh.a();
          int discarded$187 = 50;
          jk.c();
          int discarded$188 = 71;
          la.c();
          int discarded$189 = 49;
          lg.a();
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
          int discarded$190 = 126;
          jd.a();
          ta.a(false);
          mb.a();
          int discarded$191 = 118;
          ka.a();
          int discarded$192 = 1;
          ca.a();
          o.a(true);
          int discarded$193 = -54;
          fl.a();
          int discarded$194 = -112;
          kl.e();
          ac.d((byte) -104);
          int discarded$195 = -25585;
          fg.c();
          int discarded$196 = -95;
          pl.d();
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
          int discarded$197 = 105;
          gm.a();
          int discarded$198 = -974314864;
          dl.a();
          lf.a(-9742);
          jg.g();
          ip.c((byte) 10);
          qf.c();
          tp.d(0);
          int discarded$199 = 126;
          sc.a();
          int discarded$200 = 68;
          dd.a();
          jp.a(false);
          vd.a(128);
          int discarded$201 = -126;
          ng.b();
          nb.a(-107);
          int discarded$202 = 93;
          da.c();
          dc.a(-79);
          int discarded$203 = -86;
          mj.a();
          uk.a(-21);
          int discarded$204 = -99;
          ro.b();
          int discarded$205 = 112;
          vj.e();
          int discarded$206 = 0;
          ap.a();
          int discarded$207 = -115;
          ej.b();
          int discarded$208 = 60;
          wk.a();
          ub.c((byte) 93);
          uh.c((byte) 73);
          int discarded$209 = 97;
          qj.a();
          int discarded$210 = 54;
          kd.w();
          int discarded$211 = 60;
          ah.u();
          int discarded$212 = 122;
          on.a();
          int discarded$213 = 0;
          g.i();
          int discarded$214 = -125;
          kk.c();
          fb.h(237239984);
          ig.x(-96);
          int discarded$215 = -71;
          u.b();
          int discarded$216 = 28186;
          co.d();
          int discarded$217 = -9;
          ji.c();
          int discarded$218 = -79;
          qd.a();
          int discarded$219 = 6;
          d.a();
          int discarded$220 = -11486;
          nk.a();
          int discarded$221 = -6633;
          qb.a();
          hd.d((byte) -77);
          int discarded$222 = 123;
          ei.a();
          dn.h(0);
          i.m(10);
          int discarded$223 = 117;
          bh.c();
          int discarded$224 = 13;
          ma.c();
          nf.a(0);
          int discarded$225 = -103;
          gg.a();
          uo.c(-1640531527);
          int discarded$226 = 0;
          qn.a();
          int discarded$227 = -128;
          nd.a();
          td.a((byte) 94);
          int discarded$228 = 96;
          oc.a();
          je.a(2);
          int discarded$229 = -128;
          ce.d();
          mf.a(123);
          int discarded$230 = -51;
          vi.a();
          md.n(54);
          sa.g((byte) 88);
          int discarded$231 = 18072;
          cf.m();
          sg.b(false);
          int discarded$232 = -31;
          fk.e();
          int discarded$233 = 1;
          di.b();
          int discarded$234 = -31608;
          ih.a();
          int discarded$235 = 117;
          ui.b();
          int discarded$236 = 79;
          sl.a();
          int discarded$237 = 122;
          kj.a();
          int discarded$238 = -5;
          pg.d();
          so.a();
          int discarded$239 = -101;
          nm.b();
          int discarded$240 = -107;
          bb.a();
          int discarded$241 = 61;
          qc.a();
          re.a(param0);
          nc.d(-2135443998);
          ge.a(256);
          int discarded$242 = -51;
          vl.a();
          int discarded$243 = -68;
          qo.a();
          int discarded$244 = 27803;
          t.b();
          el.a(-1);
          vf.b(4056);
          cj.b(25808);
          int discarded$245 = 25;
          pa.d();
          int discarded$246 = -1;
          vg.a();
          lb.h((byte) -118);
          pn.k(-74);
          int discarded$247 = -29;
          nh.f();
          an.f(-119);
          int discarded$248 = 0;
          r.a();
          hp.f(84);
          int discarded$249 = 31;
          vh.a();
          jh.a(13192);
          ci.a(false);
          int discarded$250 = -98;
          w.a();
          en.a();
          int discarded$251 = 39;
          f.a();
          gd.a((byte) -45);
          p.a(false);
          int discarded$252 = 61;
          wi.a();
          int discarded$253 = 87;
          cl.a();
          int discarded$254 = 0;
          wh.a();
          int discarded$255 = 112;
          cb.e();
          pf.a((byte) 88);
          int discarded$256 = 0;
          rm.a();
          int discarded$257 = 113;
          to.a();
          mo.a(-76);
          rf.a(11021);
          lj.a();
          int discarded$258 = 0;
          ba.a();
          int discarded$259 = 128;
          n.a();
          ch.a(1426);
          il.a(4466);
          hj.a();
          qp.a((byte) 92);
          int discarded$260 = 3;
          dm.d();
          int discarded$261 = 25268;
          ia.a();
          int discarded$262 = -1;
          lc.a();
          int discarded$263 = 54;
          ed.a();
          int discarded$264 = 0;
          bm.a();
          sj.a(1222359528);
          hg.a(140);
          int discarded$265 = 26161;
          qg.a();
          int discarded$266 = -1;
          pi.d();
          int discarded$267 = 105;
          te.f();
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
          int discarded$268 = 1;
          be.c();
          int discarded$269 = 82;
          ea.a();
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
          int discarded$270 = 127;
          gn.a();
          int discarded$271 = 1;
          hk.b();
          int discarded$272 = 16777215;
          we.x();
          int discarded$273 = -106;
          ao.i();
          int discarded$274 = 114;
          gk.i();
          int discarded$275 = 95;
          me.x();
          int discarded$276 = 86;
          wo.w();
          oo.f((byte) 117);
          si.w(255);
          qk.v(15213);
          jo.o((byte) -73);
          ve.a();
          wc.o((byte) -73);
          ek.i(0);
          int discarded$277 = 91;
          dk.p();
          qm.a(0);
          int discarded$278 = 0;
          og.a();
          int discarded$279 = 79;
          na.a();
          wd.g(1445852592);
          int discarded$280 = 32;
          pj.f();
          ie.a();
          int discarded$281 = 0;
          q.c();
          int discarded$282 = 16604;
          ic.l();
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
          int discarded$283 = -86;
          hb.f();
          int discarded$284 = 0;
          kn.b();
          hm.g(-27476);
          int discarded$285 = 1569045130;
          np.a();
          wf.h(102);
          int discarded$286 = 12959;
          fm.a();
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
          int discarded$287 = 67;
          fe.a();
          int discarded$288 = 118;
          ho.a();
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
          int discarded$289 = -31113;
          po.v();
          int discarded$290 = 92;
          cn.a();
          hf.d((byte) -34);
          int discarded$291 = -103;
          rl.b();
          int discarded$292 = -1819016370;
          ad.b();
          int discarded$293 = -1;
          ij.g();
          qi.a(0);
          int discarded$294 = 0;
          nj.b();
          kf.m(4347);
          rg.g(13885);
          em.g((byte) -69);
          int discarded$295 = -119;
          kp.b();
          int discarded$296 = 1;
          cg.a();
          int discarded$297 = -109;
          ii.a();
          int discarded$298 = 42;
          bj.e();
          jl.e((byte) -113);
          se.c(32);
          int discarded$299 = 256;
          uj.a();
          int discarded$300 = 122;
          hl.a();
          int discarded$301 = 48;
          ag.a();
          int discarded$302 = -47;
          b.c();
          bo.c(7644);
          int discarded$303 = -90;
          tk.b();
          af.a(25752);
          int discarded$304 = -44;
          bg.c();
          int discarded$305 = -79;
          lo.c();
          int discarded$306 = 110;
          wg.a();
          int discarded$307 = -103;
          uf.a();
          jc.a(830);
          int discarded$308 = 0;
          rc.a();
          km.a((byte) 49);
          int discarded$309 = 94;
          hn.c();
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
          int discarded$310 = -72;
          mh.e();
          int discarded$311 = 114;
          k.c();
          int discarded$312 = -101;
          oh.g();
          int discarded$313 = -3;
          j.a();
          int discarded$314 = -24231;
          df.c();
          int discarded$315 = 0;
          ep.a();
          int discarded$316 = 2;
          nn.c();
          int discarded$317 = 80;
          sd.a();
          int discarded$318 = -25401;
          eo.a();
          int discarded$319 = -5364;
          tm.a();
          int discarded$320 = -27940;
          cc.a();
          int discarded$321 = 93;
          sn.a();
          bn.b(5);
          int discarded$322 = 25008;
          ld.d();
          l.b(-1);
          int discarded$323 = 1;
          sm.a();
          int discarded$324 = 1;
          e.b();
          int discarded$325 = 120;
          gj.a();
          int discarded$326 = 15;
          oe.c();
          int discarded$327 = 0;
          eb.a();
          int discarded$328 = -67;
          kh.a();
          int discarded$329 = -105;
          ud.a();
          int discarded$330 = 8;
          gl.a();
          int discarded$331 = -14311;
          oj.a();
          int discarded$332 = -123;
          s.c();
          int discarded$333 = 3;
          lm.i();
          int discarded$334 = 2021978896;
          jj.j();
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
        int discarded$335 = -2314;
        kg.d();
        mc.e((byte) -13);
        int discarded$336 = 1029;
        lk.d();
        int discarded$337 = 111;
        kb.d();
        int discarded$338 = -127;
        fj.e();
        wl.a((byte) -86);
        eg.c(-26441);
        int discarded$339 = -90;
        vk.a();
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
