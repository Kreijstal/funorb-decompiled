/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class DungeonAssault extends in {
    static String field_H;
    static cn field_I;
    static String field_G;
    static String field_J;
    public static int field_K;

    public static void h(byte param0) {
        field_G = null;
        field_J = null;
        if (param0 != 114) {
          return;
        }
        try {
          field_I = null;
          field_H = null;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "DungeonAssault.E(" + param0 + ')');
        }
    }

    private final void c(boolean param0, byte param1) {
        int fieldTemp$0 = 0;
        boolean stackIn_16_0 = false;
        boolean stackIn_17_1 = false;
        int stackIn_106_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_127_0 = 0;
        int stackIn_131_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        Random var4_ref_Random = null;
        int var5 = 0;
        int var6 = 0;
        pj var9 = null;
        pj var10 = null;
        int stackIn_112_0Lifetime1;
        int stackIn_112_1Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        var6 = field_K;
        try {
          if (~fm.field_e == ~fm.field_a) {
            if (!param0) {
              if (co.field_G == null) {
                if (mn.field_b == -1) {
                  if (ik.field_e != null) {
                    ik.field_e.c(true);
                    while (ha.b((byte) 47)) {
                      ik.field_e.f();
                    }
                  }
                } else {
                  if (fc.a(mn.field_b, (byte) -120)) {
                    bf.field_f[mn.field_b].c(true);
                  }
                }
              } else {
                bd.field_f = bd.field_f + 1;
                if (bd.field_f == 64) {
                  af.a((byte) 40);
                }
              }
            }
            if (null != wl.field_a.e(-24172)) {
              fieldTemp$0 = ke.field_e + 1;
              ke.field_e = ke.field_e + 1;
              if (fieldTemp$0 == 335) {
                wl.field_a.b((byte) -124);
                sl.field_b = null;
                pa.field_a = null;
                ri.field_g = null;
              }
            }
          } else {
            if (fm.field_a == dg.field_H) {
              pk.field_t = pk.field_t + 1;
              if (pk.field_t == 16) {
                if (tl.field_d) {
                  dn.b(false);
                } else {
                  bj.i(81);
                }
                gm.field_d = null;
                fm.field_a = bn.field_n;
              }
            } else {
              if (~bn.field_n != ~fm.field_a) {
                pk.field_t = pk.field_t - 1;
                if (pk.field_t == 0) {
                  fm.field_a = fm.field_e;
                }
              } else {
                if (!ed.c(true)) {
                  vk.a((byte) -31);
                  gd.a(g.field_Hb, 0, sa.field_f, false);
                  stackIn_16_0 = ll.field_k;
                  stackIn_17_1 = !(nh.field_k < 2);
                  ll.field_k = stackIn_16_0 | stackIn_17_1;
                  if (tl.field_d) {
                    tl.field_d = false;
                    a.a(320, ne.field_c.field_N, ne.field_c, true, false, 8, 240, 2, 8, ne.field_c.field_E + ne.field_c.field_N, (cn[]) null, (cn[]) null);
                    if (cm.field_R != null) {
                      i.field_A.a((java.awt.Component) ((Object) cm.field_R), (byte) 51, false);
                    }
                  }
                  if (fc.a(dc.field_z, (byte) -120)) {
                    af.a((byte) 114);
                  }
                }
                fm.field_a = ii.field_F;
              }
            }
          }
          if (ik.field_e != null &&
            mn.field_b != -1) {
            ik.field_e.a(false, 251569954);
          }
          if (param1 != -69) {
            this.c(true, (byte) -64);
          }
          if (dc.field_z == -2) {
            var9 = new pj();
            var9.field_v = uk.a(0, new Random());
            for (var4 = 0; 49 > var4; var4++) {
              stackIn_112_0 = 0;
              stackIn_112_1 = oi.b(0, 5);
              if (stackIn_112_0 == stackIn_112_1 &&
                var9.field_h[var4].field_a == 0) {
                var9.field_h[var4] = new ai(ji.a(37, false, 4));
              }
            }
            if (null == gm.field_d) {
              stackIn_106_0 = 10000;
            } else {
              stackIn_106_0 = gm.field_d.field_N;
            }
            var4Lifetime2 = stackIn_106_0;
            var9.field_y = var4Lifetime2;
            var9.field_o = var4Lifetime2 / 10;
            var9.field_A[0] = new hb(0, 25);
            var9.field_A[1] = new hb(1, 27);
            var9.field_A[2] = new hb(2, 18);
            var9.field_A[3] = new hb(3, 19);
            var9.a(false, 4);
            ik.field_e = new go(false, var9);
            var5 = cm.field_Q ? 1 : 0;
            stackIn_110_0 = (!ve.a(false)) ? 0 : 12;
            gd.a(stackIn_110_0, 0, -1, var5 != 0);
          }
          stackIn_112_0Lifetime1 = 2;
          stackIn_112_1Lifetime1 = ~dc.field_z;
          if (stackIn_112_0Lifetime1 == stackIn_112_1Lifetime1) {
            var10 = new pj();
            if (!ed.c(true) &&
              gm.field_d.field_q == -1) {
              var10.field_v = new wm(gm.field_d.field_k);
              var10.field_h = gm.field_d.field_L;
            } else {
              var4_ref_Random = new Random();
              var10.field_v = uk.a(0, var4_ref_Random);
              var10.field_h = da.a(var10.field_v, (byte) 71, var4_ref_Random);
              if (ed.c(true)) {
                gm.field_d = new lb();
                gm.field_d.field_L = var10.field_h;
                gm.field_d.field_k = var10.field_v;
              }
            }
            var10.field_o = 1000;
            var10.field_A[0] = new hb(0, 1);
            var10.field_A[1] = new hb(1, 3);
            var10.field_A[2] = new hb(2, 4);
            var10.field_A[3] = new hb(3, 2);
            var10.a(false, 4);
            ha.d(1);
            ik.field_e = new go(false, var10);
            stackIn_127_0 = (!cm.field_Q) ? 0 : 1;
            var4Lifetime1 = stackIn_127_0;
            stackIn_131_0 = (!ve.a(false)) ? 0 : 12;
            gd.a(stackIn_131_0, 0, -1, var4Lifetime1 != 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var3), "DungeonAssault.H(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        int fieldTemp$0 = 0;
        boolean stackIn_44_1 = false;
        int stackIn_101_1 = 0;
        boolean stackIn_102_2 = false;
        boolean stackIn_139_0 = false;
        int stackIn_208_0 = 0;
        int stackIn_208_1 = 0;
        int stackIn_208_2 = 0;
        boolean stackIn_209_3;
        int stackIn_220_0 = 0;
        int stackIn_254_0 = 0;
        int stackIn_254_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        wj var4_ref_wj = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int var5 = 0;
        di[] var5_ref_di__ = null;
        int var6 = 0;
        int var7 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        Object var17 = null;
        ak var17_ref = null;
        int[] var18 = null;
        lb var19 = null;
        String var20 = null;
        pj var21 = null;
        int[] var22 = null;
        int[] var4_ref_int__Lifetime1;
        int[] var4_ref_int__Lifetime2;
        int stackIn_254_0Lifetime1;
        int stackIn_254_1Lifetime1;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var4Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        var17 = null;
        var7 = field_K;
        try {
          ib.b((byte) 31);
          mn.a((byte) -42);
          if (ef.field_h) {
            if (kj.field_n != 0 && (!(5 * kh.field_m.length / 2 <= kj.field_n) ||
              0 == la.field_g)) {
              fieldTemp$0 = kj.field_n + 1;
              kj.field_n = kj.field_n + 1;
              if (fieldTemp$0 >= 5 * kh.field_m.length) {
                kj.field_n = 0;
              }
            }
            if (0 != no.field_d) {
              kj.field_n = 1;
            }
            if (ao.a((byte) 79)) {
              if (!di.field_e) {
                i.field_A.a((java.awt.Component) ((Object) c.field_h), (byte) 61, true);
                di.field_e = true;
              }
            } else {
              if (c.field_h != gi.field_R ||
                di.field_e) {
                i.field_A.a((java.awt.Component) ((Object) c.field_h), (byte) 116, false);
                di.field_e = false;
                gi.field_R = c.field_h;
              }
            }
          }
          go.b((byte) 14);
          if (cm.field_R != null &&
            cm.field_R.field_g) {
            ib.a(930);
            hh.a((byte) -128);
          }
          stackIn_44_1 = (cm.field_R != null);
          this.a(stackIn_44_1, (byte) -74);
          if (ld.field_i) {
            bo.h(78);
            ld.field_i = false;
          }
          mo.field_a = mo.field_a + 1;
          if (ao.a((byte) -123)) {
            this.g((byte) 2);
            if (ao.a((byte) 121)) {
              return;
            }
          }
          if (param0 >= -89) {
            this.c(false, (byte) -112);
          }
          if (ef.field_h) {
            if (hc.b(1)) {
              if (!ib.a((byte) 84)) {
                if (!sl.b(15000)) {
                  if (!ue.b((byte) -93)) {
                    this.c(false, (byte) -69);
                  } else {
                    if (~fm.field_a == ~fm.field_e) {
                      var2_int = l.d(4570);
                      if (var2_int == 1) {
                        ik.a(bh.field_Q, 53, 0);
                      }
                      this.c(true, (byte) -69);
                    } else {
                      this.c(false, (byte) -69);
                    }
                  }
                } else {
                  stackIn_101_1 = 82;
                  stackIn_102_2 = (null != cm.field_R);
                  var2_int = this.b((byte) stackIn_101_1, stackIn_102_2);
                  if (1 == var2_int ||
                    2 == var2_int) {
                    if (null != cm.field_R) {
                      ib.a(930);
                    }
                    if (var2_int == 2) {
                      eg.a((byte) 120, m.c(true));
                    }
                  }
                  this.c(true, (byte) -69);
                }
              } else {
                up.c((byte) 126);
                if (~fm.field_e == ~fm.field_a) {
                  var2_int = mf.b(12210);
                  if (var2_int == 2) {
                    ib.a(930);
                  } else {
                    if (var2_int == 3) {
                      tl.field_d = false;
                      a.a(320, ne.field_c.field_N, ne.field_c, true, true, 8, 240, 2, 8, ne.field_c.field_E + ne.field_c.field_N, (cn[]) null, (cn[]) null);
                      if (cm.field_R != null) {
                        i.field_A.a((java.awt.Component) ((Object) cm.field_R), (byte) 86, false);
                      }
                    } else {
                      if (4 == var2_int) {
                        tl.field_d = true;
                        ik.a(ve.field_c, 86, 0);
                      }
                    }
                  }
                  this.c(true, (byte) -69);
                } else {
                  this.c(false, (byte) -69);
                }
              }
            } else {
              nb.a(22);
            }
          } else {
            td.a(pj.field_r, 121);
            if (this.h(0)) {
              ef.field_h = true;
            }
          }
          if (!ed.c(true)) {
            while (true) {
              var17_ref = (ak) (ll.field_i.b((byte) -124));
              if (var17_ref == null) {
                break;
              }
              vb.a(4, (byte) 84, var17_ref);
            }
          }
          L19: while (true) {
            stackIn_139_0 = di.a(uo.field_c, -1);
            if (stackIn_139_0) {
              stackIn_254_0 = -55;
              stackIn_254_1 = ~hc.field_c;
              if (stackIn_254_0 == stackIn_254_1) {
                var22 = wa.b(-1);
                var18 = var22;
                var2 = var18;
                var10 = var2;
                var4_ref_wj = ra.field_c;
                var5 = ((ec) ((Object) var4_ref_wj)).c(true);
                for (var6 = 0; var6 < var5; var6++) {
                  var10[var6] = ((ec) ((Object) var4_ref_wj)).h(-48);
                }
                if (wh.field_d) {
                  var11 = var2;
                  var12 = gj.field_c;
                  var4_ref_int__ = gj.field_c;
                  for (var5Lifetime2 = 0; 8 > var5Lifetime2; var5Lifetime2++) {
                    var11[var5Lifetime2] = nb.a(var11[var5Lifetime2], ~var12[var5Lifetime2]);
                  }
                  for (var3 = 0; var3 < ce.field_o.length; var3++) {
                    stackIn_139_0 = vl.a(var3, -67, var22);
                    if (stackIn_139_0) {
                      wl.field_a.a(new a(var3), false);
                    }
                  }
                }
                var13 = gj.field_c;
                var14 = var2;
                var4_ref_int__Lifetime1 = var2;
                for (var5Lifetime3 = 0; 8 > var5Lifetime3; var5Lifetime3++) {
                  var13[var5Lifetime3] = mp.a(var13[var5Lifetime3], var14[var5Lifetime3]);
                }
                var15 = bp.field_e;
                var16 = var2;
                var4_ref_int__Lifetime2 = var2;
                for (var5Lifetime4 = 0; var5Lifetime4 < 8; var5Lifetime4++) {
                  var15[var5Lifetime4] = mp.a(var15[var5Lifetime4], var16[var5Lifetime4]);
                }
                rf.field_S = true;
                continue L19;
              }
              if (hc.field_c == 55) {
                var19 = gm.field_d;
                gm.field_d = new lb(ra.field_c, 19);
                if (mn.field_b == 4 ||
                  dc.field_z == 4) {
                  jk.j((byte) 59);
                }
                if (5 == mn.field_b ||
                  dc.field_z == 5) {
                  u.a(1, var19);
                }
                if (mn.field_b == 2 ||
                  dc.field_z == 2) {
                  sh.a(27886, var19);
                }
                if (mn.field_b != 3 &&
                  dc.field_z != 3) {
                  continue L19;
                }
                hi.b(1);
                continue L19;
              }
              if (56 != hc.field_c &&
                57 != hc.field_c) {
                if (hc.field_c == 58) {
                  hm.a(0);
                  continue L19;
                }
                if (61 == hc.field_c) {
                  var20 = ra.field_c.a(-21030);
                  var3Lifetime2 = ra.field_c.k(0);
                  var4 = ra.field_c.c(true);
                  var5Lifetime1 = ra.field_c.h(-111);
                  stackIn_220_0 = (ra.field_c.c(true) != 1) ? 0 : 1;
                  var6Lifetime1 = stackIn_220_0;
                  if (2 != dc.field_z) {
                    continue L19;
                  }
                  ((bg) (bf.field_f[2])).a(var6Lifetime1 != 0, var4, 0, var5Lifetime1, var3Lifetime2, var20);
                  continue L19;
                }
                if (hc.field_c == 62) {
                  af.a((byte) 9);
                  var21 = new pj(ra.field_c, true);
                  if (null != ik.field_e &&
                    ik.field_e.field_Y.field_f == var21.field_f) {
                    ik.field_e = new go(true, var21, ik.field_e);
                  } else {
                    ik.field_e = new go(true, var21);
                  }
                  gd.a(dc.field_z, 0, -1, false);
                  kh.field_s = false;
                  nf.field_A = true;
                  continue L19;
                }
                if (hc.field_c != 72) {
                  if (nf.field_A &&
                    null != ik.field_e &&
                    ik.field_e.j(0)) {
                    continue L19;
                  }
                  this.d(true);
                  continue L19;
                }
                if (nf.field_A) {
                  af.a((byte) 14);
                  if (nf.field_A) {
                    nf.field_A = false;
                    ik.field_e.a(17158, false);
                    gh.field_f = true;
                  }
                }
                kh.field_s = false;
                continue L19;
              }
              var2_intLifetime1 = ra.field_c.f(-123);
              var3Lifetime3 = ra.field_c.f(-124);
              var4Lifetime1 = ra.field_c.c(true);
              var5_ref_di__ = new di[var4Lifetime1];
              for (var6Lifetime2 = 0; var4Lifetime1 > var6Lifetime2; var6Lifetime2++) {
                var5_ref_di__[var6Lifetime2] = mm.a(ra.field_c, false);
              }
              stackIn_208_0 = var2_intLifetime1;
              stackIn_208_1 = var3Lifetime3;
              stackIn_208_2 = 22;
              stackIn_209_3 = (hc.field_c == 57);
              ja.$cfr$intArgs$a$ed16b0445cf3(stackIn_208_0, stackIn_208_1, stackIn_208_2, stackIn_209_3, var5_ref_di__);
              continue L19;
            }
            break;
          }
          stackIn_254_0Lifetime1 = 0;
          stackIn_254_1Lifetime1 = 0;
          op.a(stackIn_254_0Lifetime1, stackIn_254_1Lifetime1);
          if (dm.c(81)) {
            var2_intLifetime2 = this.f((byte) 101);
            if (var2_intLifetime2 == 0 ||
              var2_intLifetime2 == 1) {
              if (!ed.c(true)) {
                gm.field_d = null;
              }
              if (var2_intLifetime2 == 1) {
                kh.field_s = true;
              } else {
                if (nf.field_A) {
                  gh.field_f = true;
                  gd.a(0, 0, 0, false);
                }
                kh.field_s = false;
              }
            }
            var3Lifetime1 = 0;
            if (var2_intLifetime2 == 2) {
              var3Lifetime1 = 1;
            }
            if (kh.field_s) {
              var3Lifetime1 = 1;
            }
            if (!dm.c(71)) {
              var3Lifetime1 = 0;
            }
            if (var3Lifetime1 != 0) {
              l.a(-1);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2_ref), "DungeonAssault.C(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        tc var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.a(false, 32, 8, 2, 17, 0, 5000, 1);
          var3 = new tc();
          var3.field_A.c((byte) 7, 128, 9);
          var3.field_B.c((byte) -120, 128, 9);
          af.a(true, var3, 22050, 22050, (java.awt.Component) ((Object) c.field_h), -126, 2048, i.field_A);
          cm.a(1.600000023841858f, 0.9200000166893005f, -7788, 0.10000000149011612f, 25.0f);
          he.field_p = 16711680;
          dc.field_l = 128;
          ui.field_b = 4473924;
          il.field_a = 255;
          om.field_a = 16777215;
          sm.field_c = 16776960;
          j.f((byte) -4);
          kd.b(0);
          this.b(true, (byte) -67);
          uo.field_c[70] = 0;
          uo.field_c[55] = 704;
          uo.field_c[57] = -2;
          uo.field_c[66] = 2;
          uo.field_c[54] = -1;
          uo.field_c[67] = 9;
          uo.field_c[62] = -2;
          uo.field_c[59] = 8;
          uo.field_c[56] = -2;
          uo.field_c[72] = 0;
          uo.field_c[65] = -1;
          kj.field_n = 0;
          uo.field_c[58] = 0;
          uo.field_c[61] = -1;
          uo.field_c[68] = 3;
          uo.field_c[63] = 10;
          if (param0 > -15) {
            return;
          }
          stackIn_6_0 = !(2 > nh.field_k);
          ll.field_k = stackIn_6_0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "DungeonAssault.A(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.a(32, "dungeonassault", 0);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "DungeonAssault.init()");
        }
    }

    final void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          DungeonAssault.h((byte) 114);
          a.a(23779);
          md.h(-4);
          tc.a((byte) -86);
          rl.a((byte) 75);
          vj.a(24243);
          nb.a((byte) 109);
          td.a(23);
          qe.a();
          te.a();
          gh.a(7);
          og.a(-129);
          sb.a((byte) -88);
          fo.a((byte) -73);
          t.a(-11353);
          jh.a();
          in.e(-1);
          b.b(-30719);
          kg.a(false);
          tl.a((byte) 50);
          mh.a(16);
          nl.a((byte) -109);
          gf.c();
          nh.a(param0);
          se.a();
          ig.a(-2898);
          dm.b(0);
          ec.i(25);
          kd.a((byte) -101);
          sp.a(true);
          ml.a((byte) 63);
          ri.a(105);
          sn.a(5);
          ib.d(507);
          ta.a(-84);
          to.a(0);
          kp.b(0);
          cg.a((byte) -117);
          la.c((byte) -97);
          op.a((byte) -120);
          mp.a((byte) 112);
          sl.a(105);
          gj.a((byte) 80);
          c.a(-9431);
          wk.b(false);
          ek.a((byte) -115);
          bn.a((byte) -122);
          go.f(10);
          lb.a((byte) 119);
          hi.a(-113);
          ea.a(0);
          ke.a(-123);
          n.a(3554);
          hb.a((byte) 3);
          ai.a((byte) 106);
          jc.a(0);
          ua.a((byte) 103);
          ne.b(-18880);
          qj.a(-2418);
          bc.a(24740);
          lc.a(true);
          ja.a(param0);
          lg.a(true);
          eh.a(73);
          sg.a((byte) -88);
          f.a(!param0);
          fp.a(-4126);
          pp.e(73);
          gd.e(0);
          nn.b((byte) -80);
          kl.a(117);
          rj.b(false);
          sa.b(false);
          ug.e(0);
          wa.c(23413);
          lp.a((byte) 16);
          vm.d();
          hg.d(26609);
          vn.e();
          cb.a(27525);
          ae.a((byte) -4);
          ko.d(-125);
          qk.a((byte) 127);
          uf.b(0);
          gm.a(-94);
          pj.e(126);
          mo.a(2);
          ul.a(true);
          jg.a((byte) -126);
          hd.b((byte) 117);
          uj.a(37);
          cd.a(-1);
          vc.a(-6058);
          mi.c(-128);
          fd.a((byte) 65);
          hl.a(50);
          rk.a(true);
          wj.n(7);
          qc.a(0);
          dd.c((byte) -40);
          en.a(0);
          d.a(0);
          p.d(!param0);
          ed.f((byte) -89);
          ih.e(-2431);
          bg.b(41);
          pd.c((byte) 71);
          le.a(103);
          di.a((byte) -78);
          db.c((byte) 127);
          wo.a((byte) 100);
          jm.a((byte) -123);
          ud.a((byte) -124);
          tk.b((byte) 10);
          ob.g(16);
          fi.a((byte) -106);
          qp.b((byte) 56);
          qd.a(true);
          ji.f((byte) -98);
          jb.p(-71);
          wi.i((byte) -97);
          jk.n(-18554);
          nk.n(2121792);
          rg.h((byte) -53);
          ia.b(!param0);
          dn.f((byte) -108);
          gk.b(param0);
          lh.a(-107);
          so.a((byte) 95);
          df.a(255);
          fj.a((byte) -75);
          ff.c(-103);
          hj.f(16744448);
          lo.a(114);
          ll.a((byte) 92);
          rd.b(true);
          s.a(-55);
          pa.a(2601);
          ka.a((byte) -67);
          bk.a(param0);
          il.a((byte) 111);
          bb.a((byte) 127);
          cc.b(-86);
          je.a(true);
          tm.a(-107);
          uk.a(0);
          qa.b(-2544);
          ld.a(false);
          hc.a(32);
          nm.n(38);
          vd.a((byte) -96);
          hh.b(1);
          re.c();
          jp.a();
          sm.a((byte) -118);
          qh.b((byte) 75);
          jj.a((byte) 80);
          rn.b(64);
          om.a(63);
          mn.b((byte) 94);
          jl.a((byte) -113);
          li.a(false);
          ok.f(-16218);
          tb.b((byte) -47);
          ql.b((byte) 20);
          ik.a(0);
          ra.a((byte) -114);
          un.a((byte) 23);
          ej.a();
          dc.a((byte) 108);
          oe.a(0);
          kn.a(0);
          nj.a((byte) 84);
          oh.a(37);
          an.c(-13023);
          jn.a(1);
          im.a(-1);
          l.a((byte) -24);
          lm.d((byte) -123);
          ck.b(!param0);
          da.a(6);
          sj.g((byte) -10);
          rf.b(param0);
          ii.e((byte) -21);
          dj.a((byte) 113);
          am.a(30111);
          nd.b();
          vb.a((byte) -69);
          nf.e((byte) 93);
          hk.a(-73);
          gb.a(32767);
          eg.d(-23658);
          hp.a(35);
          no.a((byte) -126);
          um.a(false);
          wl.a(98);
          fg.d(-102);
          kf.b(false);
          ag.a(16760896);
          ki.a((byte) -35);
          sf.c((byte) 114);
          lj.d(77);
          ro.f((byte) -88);
          oj.a((byte) -29);
          uo.a(-90);
          gl.c((byte) -105);
          oc.e(4296);
          dl.a(51);
          tp.h(35);
          up.a(false);
          em.c(true);
          ln.b(1148357992);
          co.e(96);
          ti.a(true);
          sh.a(false);
          vf.d(21);
          dg.b(false);
          uh.i((byte) -41);
          rm.m(4);
          hf.m(0);
          uc.c(false);
          gi.f((byte) -32);
          bh.f((byte) -106);
          ng.f((byte) 124);
          tn.h((byte) -89);
          rb.a(4935);
          ip.c((byte) 19);
          mf.a(5);
          cm.j(-119);
          mk.b(false);
          wg.a();
          kk.a(0);
          of.a((byte) 65);
          ah.a(-37);
          np.c((byte) -74);
          fk.d(67);
          j.g((byte) -7);
          eb.f((byte) 86);
          ol.a((byte) -96);
          fe.b((byte) -34);
          ep.a(124);
          bp.a(-1);
          oi.h(119);
          bj.h(31029);
          ad.a(1);
          qi.a(true);
          dh.a(20);
          wf.d((byte) -28);
          pb.e((byte) -78);
          ha.c(64);
          rc.a((byte) -127);
          rp.b((byte) -68);
          g.g(-101);
          oo.a(13054);
          bi.a();
          ho.a(0);
          id.a((byte) -90);
          fa.a(-28822);
          wm.a((byte) 112);
          gg.a(0);
          hm.d(269);
          tf.a(-1);
          k.a(true);
          fm.a(param0);
          cf.a(30);
          o.d(0);
          wh.b(96);
          na.c(-91);
          oa.a((byte) 126);
          mc.c(24);
          ic.d(4741);
          dk.a((byte) -107);
          sd.b(false);
          al.a((byte) 17);
          fn.d(1);
          mj.a(127);
          bo.c((byte) -36);
          pm.a(112);
          bl.d((byte) -128);
          jd.a(1);
          h.a((byte) 16);
          ac.a(19757);
          af.a(0);
          vk.b((byte) 75);
          wd.a(115);
          fl.a((byte) 63);
          gn.a(194);
          ie.d(-102);
          lf.d(-121);
          pk.e(88);
          ce.d((byte) 58);
          bf.a((byte) 85);
          me.a(36);
          ef.a((byte) 111);
          ao.d(10625);
          ba.a((byte) 117);
          ch.c(0);
          sc.b((byte) -94);
          vl.a((byte) -115);
          e.c((byte) 29);
          qf.b(-21);
          jf.a(!param0);
          fc.b(18677);
          bd.b(76);
          cp.c((byte) -66);
          u.c((byte) 96);
          lk.h(25161);
          kc.a(0);
          pe.a(9);
          ak.a(-120);
          ve.a(-125);
          r.a(-113);
          i.a((byte) 122);
          kj.a(-109);
          mm.a(127);
          ub.a((byte) 123);
          ue.a((byte) 36);
          pi.a(11877);
          tg.a(400);
          kh.e((byte) 102);
          vo.e(1);
          qm.d(false);
          ga.d((byte) 75);
          he.d((byte) 117);
          be.e(-15818);
          fb.a(25);
          ci.a(116);
          od.b((byte) 106);
          m.d(-1);
          ab.b(1781937827);
          this.field_p = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "DungeonAssault.B(" + param0 + ')');
        }
    }

    public DungeonAssault() {
    }

    private final boolean h(int param0) {
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        boolean stackIn_50_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_46_0Lifetime1;
        int stackIn_46_1Lifetime1;
        var3 = field_K;
        try {
          he.e(param0 - 23487);
          if (!tf.a((java.applet.Applet) (this), 1041792321)) {
            return false;
          }
          ai.a(param0 - 78);
          var2_int = param0;
          while (var2_int < 14) {
            stackIn_46_0 = ~var2_int;
            stackIn_46_1 = -5;
            if (stackIn_46_0 == stackIn_46_1) {
              bf.field_f[var2_int] = (qe) ((Object) new p());
            } else {
              if (var2_int == 5) {
                bf.field_f[var2_int] = (qe) ((Object) new ih());
              } else {
                if (var2_int == 2) {
                  bf.field_f[var2_int] = (qe) ((Object) new bg());
                } else {
                  if (var2_int != 3) {
                    if (var2_int == 13) {
                      bf.field_f[var2_int] = (qe) ((Object) new ud());
                    } else {
                      if (var2_int == 7) {
                        bf.field_f[var2_int] = (qe) ((Object) new fi());
                      } else {
                        bf.field_f[var2_int] = (qe) ((Object) new qc(var2_int));
                      }
                    }
                  } else {
                    bf.field_f[var2_int] = (qe) ((Object) new db());
                  }
                }
              }
            }
            var2_int++;
          }
          mn.field_b = 13;
          dc.field_z = 13;
          bf.field_f[13].b(false);
          if (ed.c(true)) {
            gm.field_d = null;
          }
          ag.a(50, 55);
          nf.d(param0 + 0);
          i.field_A.a((java.awt.Component) ((Object) c.field_h), (byte) 25, false);
          gi.field_R = c.field_h;
          ll.a(-26);
          stackIn_46_0Lifetime1 = nh.field_k;
          stackIn_46_1Lifetime1 = 2;
          stackIn_50_0 = !(stackIn_46_0Lifetime1 < stackIn_46_1Lifetime1);
          ll.field_k = stackIn_50_0;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "DungeonAssault.G(" + param0 + ')');
        }
    }

    final void c(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          wh.a(96);
          if (null != cm.field_R) {
            ib.a(930);
          }
          kp.a(1);
          if (!param0) {
            field_G = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "DungeonAssault.F(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        boolean stackIn_37_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        Object var3 = null;
        int var3_int = 0;
        a var3_ref = null;
        int var4_int = 0;
        long var4_long = 0L;
        cn var4 = null;
        int var5_int = 0;
        cn var5 = null;
        long var6_long = 0L;
        int var6 = 0;
        long var8 = 0L;
        int var10 = 0;
        java.awt.Canvas var11 = null;
        int var3_intLifetime1;
        int var4_intLifetime1;
        int var5_intLifetime1;
        var3 = null;
        var10 = field_K;
        try {
          var11 = fi.d(false);
          if (ao.a((byte) 72)) {
            mf.a((byte) -101, md.f(20), var11);
            return;
          }
          if (!ef.field_h) {
            g.a(var11, 18131);
            return;
          }
          if (param0 != 38) {
            this.c(true, (byte) -98);
          }
          if (!hc.b(1)) {
            tp.a(10, 100.0f, kj.field_m);
            g.a(var11, param0 + 18093);
            return;
          }
          li.field_k = li.field_k + 1;
          if (~fm.field_a != ~bn.field_n) {
            qp.a((byte) -24, mn.field_b, true);
            if (co.field_G != null) {
              co.field_G.a(true, bd.field_f);
              bd.field_f = bd.field_f + 1;
              if (bd.field_f == 64) {
                af.a((byte) 127);
              }
            }
          }
          if (ib.a((byte) 35)) {
            gf.g(0, 0, gf.field_i, gf.field_c);
            var3_int = 15 + la.a((byte) -105);
            var4_int = 30 + og.b(4);
            fm.a(ea.a((byte) 13), var3_int, var4_int, (byte) -127);
            ci.a((byte) -119);
          }
          if (!sl.b(15000)) {
            if (ue.b((byte) -112) &&
              !ib.a((byte) 109)) {
              gf.g(0, 0, gf.field_i, gf.field_c);
              rc.a(-126);
            }
          } else {
            if (cm.field_R == null) {
              stackIn_37_0 = rj.field_o;
            } else {
              stackIn_37_0 = true;
            }
            fl.a(stackIn_37_0, (byte) 120);
          }
          if (~fm.field_a != ~fm.field_e) {
            var3_intLifetime1 = pk.field_t * 256 / 16;
            if (var3_intLifetime1 > 0) {
              gf.b(0, 0, gf.field_i, gf.field_c, 0, var3_intLifetime1);
            }
          }
          var3_ref = (a) (wl.field_a.e(-24172));
          if (var3_ref != null) {
            if (null == sl.field_b) {
              ah.a(true, var3_ref.field_j);
            }
            var4_intLifetime1 = 0;
            if (40 <= ke.field_e) {
              if (80 > ke.field_e) {
                var5_int = (ke.field_e - 40 << 8) / 40;
                ri.field_g.d(8, 0, 32, 32, var5_int);
              } else {
                if (230 <= ke.field_e) {
                  if (ke.field_e >= 270) {
                    var4_intLifetime1 = 1;
                  } else {
                    var5_int = (-ke.field_e + 270 << 8) / 40;
                    var4_intLifetime1 = 1;
                    ri.field_g.d(8, 0, 32, 32, var5_int);
                  }
                } else {
                  ec.field_j[var3_ref.field_j].a(8, 0, 32, 32);
                }
              }
            }
            if ((1 & li.field_k) != 0) {
              sl.field_b.a();
            } else {
              if (var4_intLifetime1 == 0) {
                sl.field_b.a(pa.field_a, 0, 0);
              } else {
                sl.field_b.b();
              }
            }
            if (40 <= ke.field_e) {
              if (80 <= ke.field_e) {
                if (ke.field_e < 230) {
                  ne.field_c.a(ce.field_o[var3_ref.field_j], 48, 32 + ne.field_c.field_H >> 1, 0, -1, 128);
                } else {
                  if (270 > ke.field_e) {
                    var5_intLifetime1 = (-ke.field_e + 270 << 8) / 40;
                    ne.field_c.a(ce.field_o[var3_ref.field_j], 48, 32 + ne.field_c.field_H >> 1, 0, -1, var5_intLifetime1 >> 1);
                  }
                }
              } else {
                var5_intLifetime1 = (-40 + ke.field_e << 8) / 40;
                ne.field_c.a(ce.field_o[var3_ref.field_j], 48, 32 + ne.field_c.field_H >> 1, 0, -1, var5_intLifetime1 >> 1);
              }
            }
          }
          if (nh.field_k >= 2 &&
            ld.field_b) {
            ne.field_c.b(Integer.toString(bc.field_a), 20, 20, 16777215, 1);
            var4_long = Runtime.getRuntime().totalMemory();
            var6_long = Runtime.getRuntime().freeMemory();
            var8 = var4_long - var6_long;
            ne.field_c.b((int)(var8 >> 10) + "kb", 4, ne.field_c.field_H * 2 + 8, 16777215, -1);
            ne.field_c.b(tc.field_u, 20, 80, 16777215, 1);
          }
          var4 = kh.field_m[kj.field_n / 5];
          var5 = jg.field_c[kj.field_n / 5];
          if (hj.field_S != -1) {
            var6 = (int)((3.0 + Math.cos((double)((float)mo.field_a / 20.0f))) * 64.0);
            var5.b(hj.field_S, eh.field_h, var6);
            var4.h(hj.field_S, eh.field_h);
          }
          ob.a(0, param0 - 161, var11, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "DungeonAssault.D(" + param0 + ')');
        }
    }

    static {
        field_J = "Beastman";
        field_G = "<col=E5A634>Your title, </col><%0><col=E5A634>, will appear in the Dragons of Renown table.";
        field_H = "Trap";
    }
}
