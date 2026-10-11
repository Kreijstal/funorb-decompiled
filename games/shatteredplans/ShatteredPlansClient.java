/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class ShatteredPlansClient extends tl {
    static int[] field_E;
    static in field_H;
    static String field_L;
    private pf field_G;
    static boolean field_K;
    static String field_J;
    private int field_I;
    public static boolean field_F;

    final static boolean a(int param0, long param1, String param2) {
        ve var4 = null;
        RuntimeException var4_ref = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 16) {
            return false;
          }
          var4 = hb.a((byte) -90, param2);
          if (var4 != null &&
            var4.field_xb != null) {
            return true;
          }
          stackIn_12_0 = (null != np.field_a) && (ik.a(-101, param1) != null);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("ShatteredPlansClient.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(boolean param0) {
        if (param0) {
          this.a(-37);
        }
        kf.e(120);
        if (null != bj.field_K) {
          ej.c(0);
        }
        w.f((byte) 89);
    }

    final void c(int param0) {
        this.a(param0 + 257, 1, 14, 25, false, 0, 2, 4);
        h var3 = new h();
        var3.field_u.d(128, (byte) -110, 9);
        var3.field_r.d(128, (byte) -110, 9);
        var3.field_u.c(598, wm.field_b);
        var3.field_r.c(param0 ^ -599, wm.field_b);
        da.a((java.awt.Component) ((Object) tm.field_i), fa.field_W, var3, 1102, false, 22050, 22050, true);
        rm.field_b = 2458760;
        wo.field_a = 2805974;
        em.field_j = 2458760;
        ih.field_b = 2458760;
        ah.field_P = 2458760;
        es.field_n = 2805974;
        em.a(us.b(0), 1);
        this.a(false, true, -2839, true, true, false, false);
        td.field_K = hi.field_a;
        ae.field_a[71] = 4;
        ae.field_a[74] = -2;
        ae.field_a[58] = -2;
        ae.field_a[10] = -1;
        ae.field_a[63] = 1;
        ae.field_a[69] = 1;
        ae.field_a[64] = 1;
        ae.field_a[72] = 0;
        ae.field_a[70] = -2;
        ae.field_a[67] = -2;
        ae.field_a[9] = -1;
        ae.field_a[73] = 3;
        ae.field_a[66] = 15;
        ae.field_a[68] = param0;
        fl.field_h = ed.field_f;
        ae.field_a[62] = 1;
        ae.field_a[61] = 1;
        ae.field_a[65] = 1;
    }

    final void a(int param0) {
        try {
          int fieldTemp$0 = 0;
          int fieldTemp$1 = 0;
          int var11_int = 0;
          boolean stackIn_7_1 = false;
          boolean stackIn_45_1 = false;
          boolean stackIn_46_2 = false;
          int stackIn_97_0 = 0;
          int stackIn_97_1 = 0;
          int stackIn_102_0 = 0;
          int stackIn_105_0 = 0;
          km stackIn_111_0 = null;
          kq stackIn_114_0 = null;
          int stackIn_118_0 = 0;
          km stackIn_126_0 = null;
          boolean stackIn_127_1 = false;
          int stackIn_150_0 = 0;
          int stackIn_150_1 = 0;
          int stackIn_167_0 = 0;
          int stackIn_172_0 = 0;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          int var2 = 0;
          int var3 = 0;
          lq var3_ref_lq = null;
          Object var4_ref = null;
          int var4 = 0;
          vr var5_ref_vr = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          String[] var10 = null;
          km var11 = null;
          kq var12 = null;
          km var13 = null;
          int var14 = 0;
          jn var15 = null;
          kr var15_ref = null;
          Exception var15_ref2 = null;
          int var16 = 0;
          int stackIn_97_0Lifetime1;
          int stackIn_97_1Lifetime1;
          int var3Lifetime1;
          var16 = field_F ? 1 : 0;
          po.b(-87);
          l.field_f = po.b(-80);
          ql.a(-26848);
          if (null != bj.field_K &&
            bj.field_K.field_c) {
            ej.c(0);
            kq.g(4);
          }
          stackIn_7_1 = (null != bj.field_K);
          this.a(stackIn_7_1, 77);
          if (um.field_n) {
            this.c(false);
            um.field_n = false;
          }
          cl.field_n = cl.field_n + 1;
          if (uf.a(false)) {
            this.j((byte) -123);
            if (uf.a(false)) {
              if (ik.field_h) {
                return;
              }
              if (wb.b(91)) {
                ik.field_h = this.c(82, false);
              }
              return;
            }
          }
          var2 = 0;
          if (!ik.field_h) {
            te.a(0, so.field_o);
            if (this.c(82, true)) {
              ik.field_h = true;
            }
          } else {
            if (!m.f((byte) 122)) {
              tc.f((byte) 125);
            } else {
              if (gl.field_e) {
                if (!sq.a(false)) {
                  if (kh.f((byte) -67)) {
                    var2 = 1;
                    stackIn_45_1 = true;
                    stackIn_46_2 = (bj.field_K != null);
                    var3 = this.a(stackIn_45_1, stackIn_46_2);
                    if (var3 == 1 ||
                      var3 == 2) {
                      if (bj.field_K != null) {
                        ej.c(0);
                      }
                      if (2 == var3) {
                        da.a(1, (java.applet.Applet) (this));
                      }
                    }
                    this.b(false, true);
                  } else {
                    if (i.c(0)) {
                      var2 = 1;
                      if (~jb.field_c != ~jb.field_g) {
                        this.b(false, false);
                      } else {
                        var3 = ch.a(106);
                        if (var3 == 1) {
                          ns.field_ob = true;
                          qk.a(se.field_a, 0, (byte) 122);
                        }
                        this.b(false, true);
                      }
                    } else {
                      this.b(false, false);
                    }
                  }
                } else {
                  boolean decompiledFrameRemainder1 = true;
                  if (~jb.field_g != ~jb.field_c) {
                    this.b(false, false);
                  } else {
                    var3 = cq.d(false);
                    if (var3 == 2) {
                      ej.c(0);
                    } else {
                      if (3 == var3) {
                        ne.field_s = false;
                        m.a(8, 13421772, rm.field_b, 8, mp.field_b.field_K, mr.field_i, 240, mp.field_b.field_K + mp.field_b.field_q, mr.field_i, 320, mp.field_b, mp.field_b, 0, mp.field_b.field_K, ah.field_P, mp.field_b.field_q + mp.field_b.field_K, 0, 2, 480, (bi[]) null, es.field_n);
                        fm.a(true, -1);
                      } else {
                        if (var3 != 4) {
                          this.b(false, true);
                          decompiledFrameRemainder1 = false;
                        }
                        else {
                          ne.field_s = true;
                          qk.a(wi.field_b, 0, (byte) 125);
                        }
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      this.b(false, true);
                    }
                  }
                  var2 = 1;
                }
              } else {
                if (!w.d(true)) {
                  s.a(1);
                }
                gl.field_e = true;
              }
            }
          }
          if (var2 != 0) {
            if (gg.field_a > eb.field_b) {
              fieldTemp$0 = eb.field_b + jl.field_U;
              eb.field_b = eb.field_b + jl.field_U;
              if (gg.field_a < fieldTemp$0) {
                eb.field_b = gg.field_a;
              }
            }
          } else {
            if (0 < eb.field_b) {
              fieldTemp$1 = eb.field_b - jl.field_U;
              eb.field_b = eb.field_b - jl.field_U;
              if (fieldTemp$1 < 0) {
                eb.field_b = 0;
              }
            }
          }
          if (!w.d(true)) {
            while (true) {
              var3_ref_lq = (lq) (jq.field_a.h(54));
              if (var3_ref_lq == null) {
                break;
              }
              gd.a(var3_ref_lq, 1500005281, 4);
            }
          }
          var3Lifetime1 = -87 % ((15 - param0) / 35);
          L17: while (di.a(ae.field_a, 1)) {
            stackIn_150_0 = -10;
            stackIn_150_1 = ~ej.field_e;
            if (stackIn_150_0 == stackIn_150_1) {
              rn.a(1048576);
              md.field_Q = false;
              gr.field_o = 10;
              oi.field_c = sa.field_a.e(-1);
              continue;
            }
            if (ej.field_e == 14) {
              rn.a(1048576);
              be.a(a.a(20605), js.a(2000, (byte) 122), pe.m(42), 1024, js.a(6, (byte) 122), (byte) -122, hn.field_j.length, bb.a((byte) 100), pg.field_C, 150);
              sj.a((byte) 77, js.b((byte) 121), fl.a(83));
              mf.field_p = true;
              md.field_Q = false;
              gr.field_o = -2;
              continue;
            }
            if (15 == ej.field_e) {
              if (mf.field_p) {
                rn.a(1048576);
                rh.a((byte) -122);
                qn.b(112);
                ta.a(0, 0, (byte) 96, false);
                mf.field_p = false;
                lg.field_b = true;
                cs.field_i = false;
                kc.field_d = false;
                v.field_b = false;
                ak.field_A = true;
                wm.a(0);
              }
              is.field_a = false;
              md.field_Q = false;
              continue;
            }
            if (ej.field_e == 10 &&
              mf.field_p) {
              rp.h(112);
              continue;
            }
            if (ej.field_e == 71) {
              if (!hg.field_r) {
                continue;
              }
              var4 = sa.field_a.a(16711680);
              var4 = var4 & ~vq.field_a;
              var5 = 0;
              while (var5 < 25) {
                var6 = 1 << var5;
                stackIn_97_0 = ~(var6 & var4);
                stackIn_97_1 = -1;
                if (stackIn_97_0 != stackIn_97_1) {
                  this.field_G.a((byte) -113, new he(var5));
                }
                var5++;
              }
              stackIn_97_0Lifetime1 = vq.field_a;
              stackIn_97_1Lifetime1 = var4;
              vq.field_a = stackIn_97_0Lifetime1 | stackIn_97_1Lifetime1;
              continue L17;
            }
            if (58 != ej.field_e) {
              if (60 != ej.field_e) {
                var4_ref = null;
                if (!v.field_b) {
                  if (kc.field_d) {
                    var4_ref = in.field_g;
                  }
                } else {
                  var4_ref = ce.field_x;
                }
                if (var4_ref != null &&
                  ((km) (var4_ref)).c(14759)) {
                  continue;
                }
                this.e((byte) -84);
                continue;
              }
              if (v.field_b ||
                kc.field_d) {
                rn.a(1048576);
                if (v.field_b) {
                  ce.field_x.a(false, false);
                }
                lg.field_b = true;
                v.field_b = false;
                gr.field_o = -2;
                cs.field_i = false;
                kc.field_d = false;
                ge.field_n = true;
                wm.a(0);
              }
              is.field_a = false;
              continue;
            }
            rn.a(1048576);
            var4 = sa.field_a.j(-93);
            var5_ref_vr = kj.a((byte) -85, sa.field_a);
            var6 = sa.field_a.g(-2852);
            stackIn_102_0 = (sa.field_a.j(-95) == 0) ? 0 : 1;
            var7 = stackIn_102_0;
            var8 = sa.field_a.g(-2852);
            stackIn_105_0 = (var8 < 0) ? 0 : 1;
            var9 = stackIn_105_0;
            var10 = new String[sa.field_a.j(-128)];
            for (var11_int = 0; var11_int < var10.length; var11_int++) {
              var10[var11_int] = sa.field_a.e((byte) -111);
            }
            tq.field_b = null;
            if (var9 == 0) {
              stackIn_111_0 = in.field_g;
            } else {
              stackIn_111_0 = ce.field_x;
            }
            var11 = stackIn_111_0;
            if (var11 == null) {
              stackIn_114_0 = null;
            } else {
              stackIn_114_0 = var11.field_Y;
            }
            var12 = stackIn_114_0;
            var13 = new km(true, false, var4, var5_ref_vr, var6, var10, var8, var7 != 0, var12);
            var14 = 1;
            if (var13.field_n != null) {
              stackIn_118_0 = (1 != sa.field_a.j(-122)) ? 0 : 1;
              var14 = stackIn_118_0;
            }
            try {
              var13.field_P.a(sa.field_a, var13.field_n, false);
              decompiledRegionSelector0 = 0;
            } catch (jn decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var15 = (jn) (Object) decompiledCaughtException;
              jq.a(-29901, (Throwable) ((Object) var15), "Map Generation failed when receiving initial game state from server.");
              q.g(-96);
              decompiledRegionSelector0 = 1;
            } catch (kr decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var15_ref = (kr) (Object) decompiledCaughtException;
              jq.a(-29901, (Throwable) ((Object) var15_ref), "Gamestate received from server is invalid.");
              q.g(-96);
              decompiledRegionSelector0 = 1;
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var15_ref2 = (Exception) (Object) decompiledCaughtException;
              jq.a(-29901, (Throwable) ((Object) var15_ref2), "Error receiving gamestate from server.");
              q.g(-119);
              decompiledRegionSelector0 = 1;
            }
            if (decompiledRegionSelector0 != 0) {
              continue;
            }
            var13.b((byte) -81);
            stackIn_126_0 = var13;
            stackIn_127_1 = (var14 != 0);
            stackIn_126_0.field_L = stackIn_127_1;
            if (var9 != 0) {
              v.field_b = true;
              ce.field_x = var13;
              ri.k(8);
              wp.a(-2);
              qf.b((byte) -98);
            } else {
              in.field_g = var13;
              kc.field_d = true;
            }
            ta.a(0, -1, (byte) 96, false);
            ge.field_n = false;
            cs.field_i = true;
            is.field_a = false;
          }
          stackIn_150_0 = 0;
          stackIn_150_1 = 82;
          d.$cfr$intArgs$a$a6964d7afeb1(stackIn_150_0, stackIn_150_1);
          if (null != ur.field_zb &&
            ur.field_zb.field_j) {
            vq.field_a = vq.field_a | ur.field_zb.field_h;
            oe.field_e = ur.field_zb.field_l;
            ur.field_zb = null;
            hg.field_r = true;
          }
          if (vr.field_c == -2 &&
            gr.field_o != -1) {
            ge.field_n = true;
          }
          if (ge.field_n) {
          }
          boolean decompiledFrameRemainder0 = true;
          if (!se.field_g && ((ce.field_x == null ||
            !ce.field_x.field_j) &&
            (in.field_g == null ||
            !in.field_g.field_j))) {
            stackIn_167_0 = 0;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_167_0 = 1;
          }
          var4 = stackIn_167_0;
          if (var4 != 0 &&
            di.field_p[82] &&
            di.field_p[73]) {
            stackIn_172_0 = 1;
          } else {
            stackIn_172_0 = 0;
          }
          var5 = stackIn_172_0;
          if (var5 != 0) {
            q.g(-108);
          }
          if (jc.f(-11)) {
            var6 = this.i((byte) 16);
            if (var6 == 0 ||
              var6 == 1) {
              vs.a(4, (byte) -103);
              se.a(7, true);
              oq.a(6, 37);
              ef.a(true);
              if (1 == var6) {
                is.field_a = true;
                md.field_Q = true;
              } else {
                if (mf.field_p) {
                  lg.field_b = true;
                  cs.field_i = false;
                  ak.field_A = true;
                  if (!v.field_b) {
                    ta.a(0, 0, (byte) 96, false);
                  } else {
                    oi.field_c = ch.field_a;
                    ta.a(0, 10, (byte) 96, false);
                  }
                  rn.a(1048576);
                  mj.field_Hb[vr.field_c].a(0, (byte) 84, false);
                  kc.field_d = false;
                  v.field_b = false;
                  mf.field_p = false;
                  wm.a(0);
                }
                md.field_Q = false;
                is.field_a = false;
              }
            }
            var7 = 0;
            if (var6 == 2) {
              var7 = 1;
            }
            if (var5 != 0) {
              var7 = 1;
            }
            if (mf.field_p ||
              md.field_Q ||
              is.field_a) {
              var7 = 1;
            }
            if (var7 != 0) {
              oh.b(-11);
            }
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void l(int param0) {
        int var2_int = 0;
        int var3 = field_F ? 1 : 0;
        wg.field_e = new rl();
        wg.field_e.a("<col=2F5FBF>", 27275, "key");
        wg.field_e.a("<col=FF8080>", 27275, "highlight");
        wg.field_e.a("<col=2F5FBF>", 27275, "glossary");
        for (var2_int = 0; var2_int < 4; var2_int++) {
          wg.field_e.a(re.a("<col=<%0>><%1></col>", 4371, new String[]{Integer.toString(gm.field_k[var2_int], 16), h.field_x[var2_int].toLowerCase()}), 27275, "resource" + var2_int);
          wg.field_e.a(re.a("<col=<%0>><%1></col>", param0 ^ 4370, new String[]{Integer.toString(gm.field_k[var2_int], 16), h.field_x[var2_int]}), 27275, "Resource" + var2_int);
        }
        wg.field_e.a(field_L, 27275, "territories");
        wg.field_e.a(dm.field_c, 27275, "uioptions");
        wg.field_e.a(ba.field_a, 27275, "fleetinfo");
        wg.field_e.a(ib.field_c, param0 ^ 27274, "projects");
        wg.field_e.a(vj.field_B, 27275, "diplomacy");
        wg.field_e.a(uq.field_l, 27275, "messages");
        wg.field_e.a(Integer.toString(gm.field_k[0], 16), 27275, "colmetal");
        wg.field_e.a(Integer.toString(gm.field_k[1], 16), 27275, "colbiomass");
        wg.field_e.a(Integer.toString(gm.field_k[2], 16), 27275, "colenergy");
        wg.field_e.a(Integer.toString(gm.field_k[3], 16), 27275, "colexotics");
        String var2 = "<col=<%0>><%1></col>";
        wg.field_e.a(re.a(var2, 4371, new String[]{Integer.toString(gm.field_k[0], 16), or.field_d[0].toLowerCase()}), 27275, "project_metal");
        wg.field_e.a(re.a(var2, 4371, new String[]{Integer.toString(gm.field_k[1], 16), or.field_d[param0].toLowerCase()}), 27275, "project_biomass");
        wg.field_e.a(re.a(var2, 4371, new String[]{Integer.toString(gm.field_k[2], 16), or.field_d[2].toLowerCase()}), 27275, "project_energy");
        wg.field_e.a(re.a(var2, 4371, new String[]{Integer.toString(gm.field_k[0], 16), or.field_d[0]}), 27275, "Project_Metal");
        wg.field_e.a(re.a(var2, 4371, new String[]{Integer.toString(gm.field_k[1], 16), or.field_d[1]}), param0 + 27274, "Project_Biomass");
        wg.field_e.a(re.a(var2, 4371, new String[]{Integer.toString(gm.field_k[2], 16), or.field_d[2]}), 27275, "Project_Energy");
        wg.field_e.a(re.a(var2, 4371, new String[]{Integer.toString(gm.field_k[3], 16), or.field_d[3]}), param0 ^ 27274, "Project_Exotics");
        wg.field_e.a(re.a(var2, 4371, new String[]{Integer.toString(gm.field_k[0], 16), or.field_d[0].toUpperCase()}), 27275, "PROJECT_METAL");
        wg.field_e.a(re.a(var2, param0 ^ 4370, new String[]{Integer.toString(gm.field_k[1], 16), or.field_d[1].toUpperCase()}), 27275, "PROJECT_BIOMASS");
        wg.field_e.a(re.a(var2, param0 ^ 4370, new String[]{Integer.toString(gm.field_k[2], 16), or.field_d[2].toUpperCase()}), param0 ^ 27274, "PROJECT_ENERGY");
        wg.field_e.a(re.a(var2, param0 + 4370, new String[]{Integer.toString(gm.field_k[3], 16), or.field_d[3].toUpperCase()}), 27275, "PROJECT_EXOTICS");
    }

    private final boolean c(int param0, boolean param1) {
        int var3 = 0;
        boolean stackIn_77_0 = false;
        int var4;
        var4 = field_F ? 1 : 0;
        na.a((byte) 51);
        if (null == cm.field_a) {
          if (m.field_z != null) {
            nj.a(75.0f, 2, cq.field_I);
            this.d(1);
            ii.a(m.field_z, df.field_n, param0 - 47);
            df.field_n = null;
            m.field_z = null;
            u.c(126);
            return false;
          }
          if (ti.field_g != null) {
            nj.a(90.0f, 2, cc.field_p);
            this.d(1);
            ck.a(ms.field_d, (java.applet.Applet) (this), kl.field_s, rl.field_f, ti.field_g, la.field_k, (byte) -8);
            rl.field_f = null;
            ti.field_g = null;
            la.field_k = null;
            u.c(122);
            return false;
          }
          if (nh.field_l != null) {
            oi.a((byte) -126, nh.field_l);
            nh.field_l = null;
            u.c(125);
            return false;
          }
          if (null != ai.field_c) {
            ph.a(ai.field_c, param0 - 167);
            mh.field_h = oq.a(ai.field_c.a(true, "starnames.txt", ""), (byte) -17);
            ai.field_c = null;
            u.c(121);
            return false;
          }
          if (null != oi.field_h) {
            jd.a(1, new fm(oi.field_h.a(true, "huffman", "")));
            oi.field_h = null;
            u.c(126);
            return false;
          }
          this.l(1);
          er.a(true);
          qf.a((byte) -125);
          for (var3 = 0; 14 > var3; var3++) {
            mj.field_Hb[var3] = new sm(var3);
          }
          if (param0 != 82) {
            this.l(64);
          }
          gr.field_o = 0;
          stackIn_77_0 = !(bs.field_b < 2);
          se.field_g = stackIn_77_0;
          uc.field_A = -1;
          vr.field_c = 0;
          de.field_j = -1;
          hk.a(50, (byte) 52);
          ec.b(param0 ^ -86, 50);
          u.c(122);
          jo.a(32767, hk.field_nb, true, 1048576);
          return true;
        }
        if (kl.field_s.b((byte) 127) &&
          kl.field_s.a("basic", -70)) {
          if (kl.field_s.b((byte) -45) &&
            kl.field_s.a("lobby", param0 + 16)) {
            if (rl.field_f.b((byte) 120) &&
              rl.field_f.a("lobby", param0 ^ -62)) {
              if (cm.field_a.b((byte) 120) &&
                cm.field_a.a(param0 - 83)) {
                if (ld.field_m.b((byte) -70) &&
                  ld.field_m.a(param0 - 83)) {
                  if (df.field_n.b((byte) 111) &&
                    df.field_n.a(param0 - 83)) {
                    if (m.field_z.b((byte) -121) &&
                      m.field_z.a(-1)) {
                      if (ms.field_d.b((byte) -81) &&
                        ms.field_d.a("", -67)) {
                        if (nh.field_l.b((byte) -19) &&
                          nh.field_l.a(param0 ^ -83)) {
                          if (ti.field_g.b((byte) -79) &&
                            ti.field_g.a(-1)) {
                            if (ai.field_c.b((byte) -40) &&
                              ai.field_c.a(param0 ^ -83)) {
                              if (oi.field_h.b((byte) -125) &&
                                oi.field_h.a(-1)) {
                                if (la.field_k.b((byte) -87) &&
                                  la.field_k.a(-1)) {
                                  dp.e(-23771);
                                  nj.a(65.0f, 2, jp.field_xb);
                                  this.d(param0 - 81);
                                  if (!param1) {
                                    return false;
                                  }
                                  vo.a(ld.field_m, cm.field_a, param0 + 18);
                                  cm.field_a = null;
                                  ld.field_m = null;
                                  u.c(122);
                                  return false;
                                }
                                nj.a(75.0f, 2, nc.a(ed.field_e, la.field_k, param0 ^ 118, jh.field_v));
                                return false;
                              }
                              nj.a(75.0f, 2, bh.a("", oi.field_h, (byte) 77, ed.field_e, jh.field_v));
                              return false;
                            }
                            nj.a(75.0f, 2, bh.a("", ai.field_c, (byte) 39, ed.field_e, jh.field_v));
                            return false;
                          }
                          nj.a(75.0f, 2, bh.a("", ti.field_g, (byte) 12, fa.field_J, ii.field_r));
                          return false;
                        }
                        nj.a(75.0f, 2, bh.a("", nh.field_l, (byte) 61, fa.field_J, ii.field_r));
                        return false;
                      }
                      nj.a(75.0f, 2, bh.a("", ms.field_d, (byte) 11, fa.field_J, ii.field_r));
                      return false;
                    }
                    nj.a(60.0f, param0 - 80, bh.a("", m.field_z, (byte) 62, le.field_a, hc.field_b));
                    return false;
                  }
                  nj.a(45.0f, 2, ve.a(df.field_n, 0, le.field_a, hc.field_b, param0 - 15012));
                  return false;
                }
                nj.a(40.0f, 2, bh.a("", ld.field_m, (byte) 47, kh.field_Db, k.field_e));
                return false;
              }
              nj.a(20.0f, 2, bh.a("", cm.field_a, (byte) 117, kh.field_Db, k.field_e));
              return false;
            }
            nj.a(17.0f, 2, bh.a("lobby", rl.field_f, (byte) 94, rq.field_h, on.field_h));
            return false;
          }
          nj.a(13.0f, 2, bh.a("lobby", kl.field_s, (byte) 19, fa.field_J, ii.field_r));
          return false;
        }
        nj.a(10.0f, param0 ^ 80, bh.a("basic", kl.field_s, (byte) 38, fa.field_J, ii.field_r));
        return false;
    }

    final void g(int param0) {
        ShatteredPlansClient.m((byte) -46);
        he.a(23811);
        pf.c(0);
        tg.a(82);
        wi.a((byte) 111);
        no.a(-6);
        h.d(param0 ^ 24068);
        id.a((byte) -77);
        va.a(102);
        kq.d(param0 ^ -24389);
        kr.a((byte) 16);
        vr.a(true);
        l.a((byte) -98);
        rl.a(param0 ^ -24069);
        jq.a((byte) -102);
        uo.a(true);
        jf.a((byte) -23);
        wo.a((byte) -103);
        vo.a(256);
        tl.k(-38);
        rg.b(108);
        kf.b(param0 ^ -24187);
        r.a(0);
        ed.a(param0 ^ -24150);
        ib.a(param0 ^ -24163);
        gf.c();
        bc.b(-466);
        gg.a(param0 + 24069);
        ob.a((byte) 78);
        pr.b(21455);
        bs.a(53);
        sa.b(2029303720);
        ba.a(0);
        kd.a(109);
        ss.a(1);
        je.a(1);
        dk.a((byte) 125);
        nf.b((byte) -25);
        hq.a(108);
        fp.a((byte) 47);
        uh.a(param0 ^ -24161);
        eb.b(-1314558012);
        cp.b(false);
        ar.a(16967);
        rn.a(true);
        tj.a((byte) 124);
        ej.a(false);
        ke.b((byte) -127);
        um.a((byte) -17);
        ui.c(-26088);
        oh.a(true);
        c.b();
        nq.a();
        sj.a((byte) -106);
        dm.a(false);
        pl.a(param0 ^ -17251);
        nb.a((byte) 123);
        dh.a((byte) -98);
        of.b(64);
        ud.a(127);
        aj.a(21805);
        ij.a((byte) -29);
        io.a((byte) 120);
        sm.f(-25370);
        km.h(11);
        te.a(param0 + 24069);
        nn.a((byte) 63);
        ga.d(-17876);
        ti.b(0);
        qq.a(-109);
        pi.b();
        ap.f();
        d.a(-28065);
        np.b(true);
        hm.d(false);
        v.a(3);
        wp.a((byte) -90);
        ae.b(-17358);
        qr.e(-14115);
        fb.h(32);
        in.a(true);
        mj.g(-4923);
        qn.a(-989994556);
        ue.a(18031);
        rs.h(2616);
        ur.f((byte) -118);
        ul.g(param0 ^ -24045);
        am.g(param0 + 47949);
        fc.a((byte) -87);
        ub.g(param0 ^ param0);
        kh.g(param0 ^ 24070);
        wg.a((byte) -117);
        ci.a(true);
        s.a((byte) 114);
        lc.a(false);
        ig.a((byte) 92);
        ta.a((byte) 118);
        tc.e(true);
        oj.q(-17682);
        eo.h((byte) -94);
        hk.p(param0 + 24089);
        ns.j((byte) -121);
        aa.a((byte) 32);
        cq.a((byte) 121);
        ri.a((byte) -73);
        e.b(param0 + 2129445);
        sp.a(3);
        wc.a(-23092);
        ea.a((byte) -109);
        fs.a(param0 ^ -24065);
        ho.a(520);
        dc.e((byte) -67);
        ln.e(param0 ^ -24069);
        mg.g((byte) -106);
        qa.e(21758);
        an.b(true);
        fm.a(110);
        ia.c(param0 ^ 28675);
        tr.g(0);
        jj.c(45);
        hp.b((byte) -64);
        nh.b((byte) 59);
        me.a(true);
        jb.a(30);
        vs.a(param0 ^ -24162);
        oo.a(4);
        mk.a((byte) -58);
        ds.a(false);
        ms.a(param0 ^ 24068);
        sl.l(0);
        ai.a((byte) 1);
        po.a((byte) 87);
        mh.a(-117);
        qj.a((byte) -20);
        or.b(126);
        sg.f((byte) 34);
        wh.b(true);
        tb.a(58);
        nl.a(-87);
        q.f((byte) 125);
        jp.g(param0 + 23965);
        dd.a(param0 ^ 27074);
        dg.f((byte) -124);
        ka.d((byte) 79);
        hi.f(param0 ^ 24118);
        as.a(param0 ^ -24081);
        vn.a((byte) 68);
        sd.f(-28714);
        eg.a(param0 + 24195);
        hj.a((byte) 12);
        ne.c(false);
        qi.a(0);
        nr.a((byte) 48);
        k.a(0);
        hb.c((byte) -122);
        sf.a((byte) 82);
        db.d(param0 ^ -8957);
        wb.a(-79);
        wm.a(false);
        mi.a((byte) 99);
        ls.a(param0 - 4458);
        qg.c(-124);
        ph.a((byte) 118);
        ad.a(18973);
        em.a(param0 + 24072);
        rh.a(5);
        fe.g(128);
        kb.d(true);
        vd.a((byte) -124);
        uc.e((byte) 106);
        ff.e((byte) -68);
        lp.f(1546006977);
        qk.f(104);
        jh.d((byte) 124);
        os.d(true);
        qh.d((byte) 6);
        lo.l(0);
        pc.d(84);
        hs.b(0);
        vl.b((byte) -80);
        vi.d(-10);
        el.a(-5731);
        se.a((byte) -37);
        ck.a(100);
        eh.i(-105);
        df.d(9768448);
        bq.b(1);
        ii.e(997342595);
        eq.a((byte) -70);
        ra.a(false);
        bf.a((byte) -57);
        vh.a((byte) 110);
        jg.b(-102);
        bd.h(-110);
        lh.f(5);
        gd.b(param0 + 24189);
        tm.d(param0 ^ 11083);
        tq.b(param0 ^ 10214);
        de.a((byte) 102);
        sq.a((byte) 127);
        jd.a(14077);
        fi.a(param0 + 24110);
        sn.a(param0 ^ -24146);
        cs.a(-93);
        a.a((byte) 15);
        rf.c(true);
        qc.f(-126);
        tk.d(false);
        ua.a(4);
        ak.h(param0 + 24092);
        p.b((byte) 114);
        gp.a((byte) 123);
        jc.g(param0 ^ 6520);
        ng.a(-109);
        bo.p(param0 ^ -24069);
        o.a((byte) -77);
        wn.b();
        fd.a();
        hc.a((byte) 66);
        sr.a((byte) -74);
        nm.a((byte) 4);
        im.a(-27153);
        oe.a(param0 ^ -24069);
        uk.a((byte) 91);
        af.a(param0 ^ 24068);
        bb.b((byte) 26);
        cm.a((byte) -26);
        le.a(124);
        lb.a();
        na.b((byte) -105);
        lr.b(3);
        gi.a(32);
        tf.a(false);
        gn.b(true);
        i.b(16711935);
        tp.a((byte) 49);
        qo.a(-109);
        vg.d(0);
        kg.d(true);
        qs.a((byte) 109);
        jl.o(-123);
        w.m(-1);
        f.j(param0 ^ -24192);
        on.b(22256);
        wl.a((byte) 85);
        kn.a();
        ab.a((byte) -121);
        mq.b((byte) 127);
        ch.b((byte) 72);
        hr.a(5);
        vm.g(param0 ^ 2556);
        jo.a(true);
        re.a((byte) 125);
        si.e((byte) -117);
        dp.f((byte) -50);
        ol.a(false);
        li.a((byte) 23);
        lg.b(101);
        gs.b((byte) 78);
        ge.a(6);
        us.a(param0 ^ -24069);
        gl.a(param0 + 24155);
        er.a(0);
        t.a((byte) -11);
        ei.a((byte) -81);
        we.a(-122);
        lm.a(true);
        vp.e((byte) -21);
        cn.e(true);
        ep.b(640);
        be.a((byte) 123);
        pk.a();
        kl.d(-62);
        ac.e(-127);
        co.d((byte) -99);
        wf.a((byte) -122);
        n.a(11209);
        br.d(59114);
        kc.a(false);
        pg.f((byte) -43);
        fa.l(5);
        go.k(102);
        il.h((byte) 88);
        md.j(-125);
        bj.a(param0 ^ -32120);
        ts.a((byte) -104);
        hl.a((byte) 107);
        ah.i(4096);
        lk.h(-22429);
        ml.d((byte) -65);
        bk.a(param0 + 26631);
        pe.a((byte) -75);
        rp.a(4);
        td.a(-104);
        en.a(-5);
        cr.a((byte) 41);
        mr.a(false);
        rd.a(-90);
        sh.b((byte) 87);
        es.a(param0 ^ 24068);
        so.d(2);
        qe.a((byte) 93);
        di.c(true);
        js.c((byte) 115);
        ja.d((byte) 124);
        wd.e(false);
        ek.a(-1);
        cj.c(false);
        j.i(19333);
        sc.f((byte) 97);
        rj.i(388178881);
        hg.c(false);
        ma.i(30);
        ca.a(2105376);
        ji.g((byte) -113);
        la.a((byte) 36);
        cb.a((byte) 104);
        hn.a(19568);
        fr.i(-950540796);
        vj.f((byte) 111);
        rm.a(-1215);
        up.a(param0 ^ -24167);
        mc.d(false);
        gq.a(118);
        m.e(-120);
        pa.d(1);
        nc.d(param0 + 24068);
        oi.a(-1);
        fh.a();
        ef.a(0);
        fl.b(param0 + 24068);
        ip.a(124);
        jr.a(1885);
        wj.a((byte) 59);
        wq.a((byte) -36);
        gr.a(-47);
        gm.a((byte) -111);
        qf.a(9952);
        uq.a(param0 + 24123);
        bh.a(0);
        oq.a(param0 + 24098);
        qp.b((byte) -128);
        rq.b(-110);
        ce.b(true);
        og.a(-1);
        cg.j(124);
        ve.g(0);
        uf.a((byte) 68);
        hd.a((byte) -99);
        vc.a(-67);
        nd.a(true);
        ks.a((byte) 127);
        fg.b(param0 ^ -24186);
        sk.a(param0 + 24021);
        gb.a((byte) -115);
        lq.a((byte) 67);
        ld.a(16711680);
        fk.a((byte) 93);
        mp.a(param0 + 16160);
        kj.a(1);
        cf.a(240);
        bg.a(16928);
        kp.b((byte) -47);
        jm.d(22595);
        ee.a(false);
        cl.a(16777215);
        un.a(11);
        dn.d((byte) -107);
        pd.b(0);
        vf.a(17593);
        wa.a(param0 ^ -14291);
        ih.a(-1);
        rk.a(-13095);
        aq.a((byte) 107);
        wk.a((byte) 70);
        ha.a(4324);
        ec.b(true);
        cc.d(param0 + 24324);
        mm.e(param0 + 23978);
        mf.f(0);
        mb.d(127);
        fj.d(param0 + 24147);
        oa.b(78);
        ql.a((byte) -53);
        u.b(-31);
        da.b((byte) -37);
        ro.a((byte) -92);
        this.field_s = null;
        this.field_G = null;
    }

    public static void m(byte param0) {
        if (param0 != -46) {
          field_L = (String) null;
        }
        field_H = null;
        field_L = null;
        field_J = null;
        field_E = null;
    }

    public final void init() {
        this.a("shatteredplans", 15, (byte) 112);
    }

    private final void b(boolean param0, boolean param1) {
        int fieldTemp$0 = 0;
        boolean stackIn_47_0 = false;
        boolean stackIn_82_0 = false;
        int stackIn_102_0 = 0;
        int stackIn_107_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        String var9;
        String[] var11;
        String[] var12;
        int var4Lifetime1;
        int var4Lifetime2;
        boolean stackIn_47_0Lifetime1;
        var8 = field_F ? 1 : 0;
        if (~jb.field_c != ~jb.field_g) {
          if (jb.field_g != po.field_f) {
            if (~jb.field_g == ~gs.field_d) {
              if (!w.d(true)) {
                if (null != tq.field_b) {
                  ks.a(20, tq.field_b, 3);
                }
                stackIn_82_0 = !(bs.field_b < 2);
                se.field_g = stackIn_82_0;
                gr.field_o = sh.field_b;
                jc.a(75, id.a(2, kl.field_s, "basic", "unachieved"));
                oi.a(!param0);
                if (ne.field_s) {
                  ne.field_s = false;
                  m.a(8, 13421772, rm.field_b, 8, mp.field_b.field_K, mr.field_i, 240, mp.field_b.field_q + mp.field_b.field_K, mr.field_i, 320, mp.field_b, mp.field_b, 0, mp.field_b.field_K, ah.field_P, mp.field_b.field_q + mp.field_b.field_K, 0, 2, 480, (bi[]) null, es.field_n);
                  fm.a(false, -1);
                }
                if (ns.field_ob) {
                  ta.a(gr.field_o, -6, (byte) 96, false);
                }
                if (nh.a((byte) -111, gr.field_o)) {
                  rn.a(1048576);
                }
                s.a(1);
              }
              ns.field_ob = false;
              ne.field_s = false;
              jb.field_g = o.field_n;
            } else {
              na.field_F = na.field_F - 1;
              if (na.field_F == 0) {
                jb.field_g = jb.field_c;
              }
            }
          } else {
            na.field_F = na.field_F + 1;
            if (na.field_F == 16) {
              if (ne.field_s) {
                oq.a(param0);
              } else {
                if (!ns.field_ob) {
                  si.f((byte) -91);
                } else {
                  si.f((byte) -91);
                }
              }
              jb.field_g = gs.field_d;
            }
          }
        } else {
          var3 = 0;
          var4 = 0;
          if (!param1) {
            if (vr.field_c == gr.field_o) {
              if (vr.field_c != -1) {
                if (vr.field_c != -2) {
                  if (vr.field_c == -3) {
                    ub.f((byte) 93);
                  } else {
                    if (nh.a((byte) -121, vr.field_c)) {
                      mj.field_Hb[vr.field_c].i(2664);
                    }
                  }
                } else {
                  var3 = 1;
                }
              } else {
                if (!mf.field_p) {
                  ce.field_x.b(true, true);
                  while (cc.$cfr$intArgs$e$296a4c2b494e(55)) {
                    ce.field_x.g(-86);
                  }
                } else {
                  var3 = 1;
                  var4 = 1;
                }
              }
            } else {
              if (eh.field_Q != 0 ||
                !nh.a((byte) -76, vr.field_c) ||
                mj.field_Hb[vr.field_c].a((byte) 95)) {
                eh.field_Q = eh.field_Q + 1;
              }
              if (eh.field_Q == 32) {
                rn.a(1048576);
              }
            }
          }
          if (mf.field_p &&
            !md.field_Q &&
            !is.field_a) {
            if (v.field_b &&
              sr.field_h) {
              var3 = 0;
            }
            cf.a(2, var3 != 0);
            if (kc.field_d) {
              in.field_g.b(var4 != 0, true);
            }
            if (v.field_b) {
              cf.a(320, 8, 180, var4 != 0);
              ce.field_x.b(var4 != 0, true);
            }
            while (cc.$cfr$intArgs$e$296a4c2b494e(55)) {
              if (v.field_b) {
                if (gn.a(13, -9861, 12, 15)) {
                  continue;
                }
              } else {
                qf.a(0, 13, 15, 12);
              }
              stackIn_47_0 = kc.field_d;
              if (stackIn_47_0) {
                in.field_g.g(-98);
              }
              if (!v.field_b) {
                continue;
              }
              ce.field_x.g(-99);
            }
          }
          stackIn_47_0Lifetime1 = mf.field_p;
          if (!stackIn_47_0Lifetime1) {
            af.b(0);
          }
          if (!ge.field_n) {
            if (fl.field_h > 0) {
              fl.field_h = fl.field_h - 1;
            }
          } else {
            if (fl.field_h < ed.field_f) {
              fl.field_h = fl.field_h + 1;
            }
          }
          var5 = ed.field_f * ed.field_f;
          var6 = -(fl.field_h * fl.field_h) + var5;
          var7 = 120 * var6 / var5 + fs.field_z;
          fa.a(var7, (byte) -47);
          if (uc.field_v > 0) {
            uc.field_v = uc.field_v - 1;
          }
          if (this.field_G.d(0) != null) {
            fieldTemp$0 = this.field_I + 1;
            this.field_I = this.field_I + 1;
            if (fieldTemp$0 == 335) {
              this.field_I = 0;
              this.field_G.h(64);
            }
          }
        }
        if (param0) {
          var9 = (String) null;
          ShatteredPlansClient.a(64, 68L, (String) null);
        }
        if (gr.field_o == -4) {
          tq.field_b = null;
          var11 = new String[]{hn.field_f[0], hn.field_f[1], hn.field_f[2], hn.field_f[3]};
          ce.field_x = new km(false, false, (int) ga.field_w[0], td.field_K, hj.field_k, var11, 0, false, (kq) null);
          stackIn_102_0 = (!uh.field_i) ? 0 : 1;
          var4Lifetime1 = stackIn_102_0;
          ta.a(0, -1, (byte) 96, var4Lifetime1 != 0);
          cs.field_i = true;
        }
        if (gr.field_o == -5) {
          tq.field_b = null;
          var12 = new String[]{hn.field_f[0]};
          ce.field_x = new km(false, true, 0, hi.field_a, 0, var12, 0, false, (kq) null);
          stackIn_107_0 = (!uh.field_i) ? 0 : 1;
          var4Lifetime2 = stackIn_107_0;
          ta.a(0, -1, (byte) 96, var4Lifetime2 != 0);
          cs.field_i = true;
        }
        if (gr.field_o == -7) {
          tk.a(11, np.field_a.g(-79), (byte) -2);
          gr.field_o = vr.field_c;
          is.field_a = true;
        }
    }

    private final void c(boolean param0) {
        if (ka.field_e != null) {
          ee.a(-47, ka.field_e);
          ka.field_e = null;
          u.c(121);
        }
        oi.field_h = io.a(3, 50);
        ms.field_d = rm.a(5, true, param0, !param0 ? true : false, false);
        nh.field_l = io.a(6, 93);
        ti.field_g = io.a(7, 110);
        cm.field_a = io.a(8, 90);
        ld.field_m = io.a(9, 28);
        df.field_n = io.a(10, 55);
        m.field_z = io.a(11, 67);
        ai.field_c = io.a(12, 28);
        la.field_k = io.a(13, 52);
    }

    final void d(int param0) {
        Object stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_18_0 = false;
        boolean stackIn_28_0 = false;
        int stackIn_69_0 = 0;
        boolean stackIn_71_1 = false;
        Object var2;
        he var3_ref_he;
        int var3_int;
        long var3;
        String var4;
        int var5_int;
        long var5;
        int var6;
        int var7_int;
        long var7;
        int var8;
        int var9;
        int var10;
        int var11;
        bi var13;
        int var14;
        int[] var18;
        var14 = field_F ? 1 : 0;
        if (bj.field_K != null) {
          stackIn_3_0 = bj.field_K;
        } else {
          stackIn_3_0 = tm.field_i;
        }
        var2 = stackIn_3_0;
        if (uf.a(false)) {
          if (bj.field_K == null) {
            stackIn_7_0 = br.field_i;
          } else {
            stackIn_7_0 = true;
          }
          no.a(stackIn_7_0, 10, (java.awt.Canvas) (var2));
          return;
        }
        if (!ik.field_h) {
          pa.a(9242, (java.awt.Canvas) (var2));
          return;
        }
        if (!m.f((byte) 116)) {
          nj.a(100.0f, 2, jh.field_v);
          pa.a(9242, (java.awt.Canvas) (var2));
          return;
        }
        if (~gr.field_o != ~vr.field_c) {
          stackIn_28_0 = (-1 == vr.field_c);
          u.a(stackIn_28_0, false);
          if (~vr.field_c != ~gr.field_o ||
            -2 != vr.field_c) {
            ShatteredPlansClient.n((byte) 67);
          }
          if (nh.a((byte) -105, vr.field_c) &&
            !nh.a((byte) -123, gr.field_o)) {
            mj.field_Hb[vr.field_c].b(94, 128 * eh.field_Q / 32);
          } else {
            if (!nh.a((byte) -75, vr.field_c) &&
              nh.a((byte) -127, gr.field_o)) {
              mj.field_Hb[gr.field_o].b(89, -(eh.field_Q * 128 / 32) + 128);
            } else {
              if (nh.a((byte) -125, vr.field_c) &&
                nh.a((byte) -74, gr.field_o)) {
                mj.field_Hb[vr.field_c].c(gr.field_o, -6469, 128 * eh.field_Q / 32);
              }
            }
          }
        } else {
          if (vr.field_c != -2) {
            stackIn_18_0 = (vr.field_c == -1);
            u.a(stackIn_18_0, false);
            if (vr.field_c != gr.field_o ||
              vr.field_c != -2) {
              ShatteredPlansClient.n((byte) 67);
            }
            if (nh.a((byte) -99, vr.field_c)) {
              mj.field_Hb[vr.field_c].g(-121);
            }
          } else {
            gf.b();
          }
        }
        if (gr.field_o != vr.field_c) {
          if (gr.field_o == -2) {
            gf.c(0, 0, 640, 480, 0, 256 * eh.field_Q / 32);
          } else {
            if (vr.field_c == -2) {
              gf.c(0, 0, 640, 480, 0, -(256 * eh.field_Q / 32) + 256);
            }
          }
        }
        if (!cj.field_x ||
          !cs.field_i) {
          qr.a(me.a(30), (byte) 111);
        }
        if (eb.field_b > 0) {
          gf.c(0, 0, 640, 480, 0, eb.field_b);
        }
        if (sq.a(false)) {
          ts.a(sa.a(-27572), param0 ^ -2, mg.e(param0 ^ -84));
          kd.a((byte) -119);
        } else {
          if (kh.f((byte) -67)) {
            stackIn_69_0 = 95;
            stackIn_71_1 = (null != bj.field_K) || (br.field_i);
            fs.$cfr$intArgs$a$7ffe4b125357(stackIn_69_0, stackIn_71_1);
          } else {
            if (!i.c(0)) {
              if (!this.field_G.g(27)) {
                var3_ref_he = (he) (this.field_G.d(param0 ^ 1));
                var4 = ud.field_a[var3_ref_he.field_k];
                var5_int = mp.field_b.c(var4) + 50;
                var6 = 36;
                var7_int = 10 + var5_int / 2;
                var8 = 10;
                var9 = this.field_I;
                if (303 < var9) {
                  var9 = 335 - var9;
                } else {
                  if (var9 > 32) {
                    var9 = 32;
                  }
                }
                var10 = re.a(0, 32, var9, var5_int, param0 ^ 1);
                var11 = 10 + (var5_int - var10 >> 1);
                var18 = new int[4];
                gf.a(var18);
                ga.a(var6, var8, var11, (byte) -78, var10);
                gf.d(var11, var8, var10 + var11, var8 + var6);
                var13 = oi.a(var3_ref_he.field_k, (byte) 66);
                var13.f(-36 + (var7_int + var5_int / 2), 4 + var8);
                mp.field_b.d(var4, -(var5_int / 2) + (var7_int + 10), -2 + (mp.field_b.field_J + var6 >> 1) + var8, 2805974, -1);
                gf.b(var18);
              }
            } else {
              ts.a(gq.c(-118), param0 - 2, ah.h(param0 + 107));
              rg.a(94);
            }
          }
        }
        if (jb.field_g != jb.field_c) {
          var3_int = na.field_F * 256 / 16;
          if (var3_int > 0) {
            gf.c(0, 0, gf.field_b, gf.field_k, 0, var3_int);
          }
        }
        if (mm.field_n &&
          se.field_g) {
          mp.field_b.d(Integer.toString(rq.field_i), 4, 4 + mp.field_b.field_J, 16777215, -1);
          var3 = Runtime.getRuntime().totalMemory();
          var5 = Runtime.getRuntime().freeMemory();
          var7 = -var5 + var3;
          mp.field_b.d((int)(var7 >> 10) + "kb", 4, 2 * mp.field_b.field_J + 8, 16777215, -1);
        }
        if (param0 != 1) {
          this.a(true);
        }
        mc.a(110, 0, (java.awt.Canvas) (var2), 0);
    }

    public ShatteredPlansClient() {
        this.field_G = new pf();
        this.field_I = 0;
    }

    private final static void n(byte param0) {
        int var1 = 0;
        int var2 = 0;
        double var3 = 0.0;
        int var2Lifetime1;
        if (-3 != vr.field_c) {
          if (ce.field_x != null ||
            in.field_g != null) {
            return;
          }
          var1 = -320 + (cl.field_n % 640 << 1);
          var2 = -320 + var1;
          if (param0 != 67) {
            return;
          }
          var3 = (Math.cos(3.141592653589793 * (double)var2 / 640.0) + 1.0) * 12.0;
          if (var3 > 16.0) {
            var3 = var3 + 5.0 * (var3 - 16.0);
          }
          so.a(param0 - 67, (640 - in.field_f.field_o) / 2, 10, jf.field_a);
          var2Lifetime1 = (int)var3;
          in.field_f.c((640 - in.field_f.field_o) / 2, 10, 256);
          return;
        }
    }

    static {
        field_K = true;
        field_L = "Production";
        field_J = "Target: <%0> points";
    }
}
