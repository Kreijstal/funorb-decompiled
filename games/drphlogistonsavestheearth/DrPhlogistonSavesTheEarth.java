/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class DrPhlogistonSavesTheEarth extends sl {
    static nh field_J;
    static vd field_F;
    static long field_I;
    static String field_L;
    static int field_K;
    private int field_H;
    static String field_E;
    private boolean field_C;
    static he[] field_G;
    public static boolean field_D;

    public final void init() {
        try {
          this.a(12, "drphlogistonsavestheearth", (byte) 12);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "DrPhlogistonSavesTheEarth.init()");
        }
    }

    private final he[] a(he param0, byte param1) {
        he[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        he[] stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new he[1];
          var4 = -95 / ((param1 - 56) / 32);
          var3[0] = be.a(param0);
          var3[0].c();
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.PA(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void d(boolean param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_D ? 1 : 0;
        try {
          we.a(qa.field_O, -106, 82.0f);
          bd.field_P = qk.a("", kf.field_d, "weapongattlinggun", true);
          le.field_d = qk.a("", kf.field_d, "weapongattlinggun2", true);
          qf.field_b = qk.a("", kf.field_d, "weapongattlinggun3", param0);
          lh.field_p = qk.a("", kf.field_d, "weaponhomingmissile", true);
          nc.field_K = qk.a("", kf.field_d, "weaponbomb", true);
          f.field_i = cl.a("", kf.field_d, -116, "weaponmegacannonshot");
          oj.field_c = ij.a("bulletspark", (byte) 96, kf.field_d, "");
          hb.field_a = new nh(15, 15);
          hb.field_a.c();
          wj.b(7, 7, 7, 8388608);
          lb.field_C.a(123);
          oi.field_d = new nh(20, 20);
          oi.field_d.c();
          wj.b(9, 9, 6, 61568);
          lb.field_C.a(119);
          li.field_i = new nh(10, 10);
          li.field_i.c();
          wj.b(5, 5, 5, 8421504);
          lb.field_C.a(122);
          al.field_b = new nh(800, 32);
          al.field_b.c();
          wj.g(0, 7, 800, 16711680);
          wj.g(0, 8, 800, 16776960);
          wj.g(0, 9, 800, 16777215);
          wj.g(0, 10, 800, 16777215);
          wj.g(0, 11, 800, 16776960);
          wj.g(0, 12, 800, 16711680);
          lb.field_C.a(101);
          kc.field_p = new nh(32, 430);
          kc.field_p.c();
          var2_int = 0;
          do {
            if (var2_int >= 16) {
              lb.field_C.a(98);
              kc.field_q = new nh(800, 20);
              kc.field_q.c();
              wj.g(0, 6, 800, 65280);
              wj.g(0, 7, 800, 65280);
              wj.g(0, 8, 800, 65535);
              wj.g(0, 9, 800, 16777215);
              wj.g(0, 10, 800, 16777215);
              wj.g(0, 11, 800, 65535);
              wj.g(0, 12, 800, 65280);
              wj.g(0, 13, 800, 65280);
              lb.field_C.a(127);
              qa.field_M = new nh(20, 20);
              qa.field_M.c();
              wj.b(9, 9, 6, 8421376);
              lb.field_C.a(104);
              nd.field_L = new nh(20, 20);
              nd.field_L.c();
              wj.b(9, 9, 6, 8421376);
              lb.field_C.a(97);
              sa.field_c = new nh(20, 20);
              sa.field_c.c();
              wj.b(9, 9, 6, 8388736);
              lb.field_C.a(110);
              field_J = sa.field_c;
              mh.field_c = nd.field_L;
              jj.field_c = new nh(800, 32);
              jj.field_c.c();
              break;
            }
            wj.c(var2_int, 430 * (-var2_int + 16) / 16, 430, 16711680 + var2_int * 4096);
            wj.c(-var2_int + 31, (6880 - 430 * var2_int) / 16, 430, 16711680 + 4096 * var2_int);
            var2_int++;
          } while (var3 == 0);
          var2_int = 0;
          while (var2_int < 16) {
            wj.g(0, var2_int, 800, 4096 * var2_int + 16711680);
            wj.g(0, 32 - var2_int, 800, 16711680 + 4096 * var2_int);
            var2_int++;
            if (var3 != 0) {
              return;
            }
          }
          wj.g(0, 16, 800, 16777215);
          lb.field_C.a(117);
          am.field_o = new nh(8, 8);
          am.field_o.c();
          wj.b(4, 4, 4, 65535);
          lb.field_C.a(111);
          ik.field_b = new nh(3, 3);
          ik.field_b.c();
          wj.b(1, 1, 1, 65408);
          lb.field_C.a(105);
          cj.field_d = new nh(256, 256);
          lb.field_C.a(111);
          db.field_e = new nh(1, 1);
          ii.field_b = ij.a("playerfxspawn", (byte) 78, kf.field_d, "");
          ub.a(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) runtimeException), "DrPhlogistonSavesTheEarth.GB(" + param0 + ')');
        }
    }

    private final he[] a(int param0, int param1, he param2) {
        he[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        he[] stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = field_D ? 1 : 0;
        try {
          if (param0 != -1745) {
            field_G = (he[]) null;
          }
          var4 = new he[param1];
          var5 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (param1 <= var5))) {
            stackIn_11_0 = var4;
            if (var6 == 0) {
              stackIn_11_0[var5] = param2;
              var5++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_11_0 = var4;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.MB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void c(byte param0) {
        boolean discarded$0 = false;
        boolean stackIn_21_1 = false;
        int stackIn_82_1 = 0;
        boolean stackIn_83_2 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        je var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = field_D ? 1 : 0;
        try {
          ia.a((byte) 9);
          if (this.field_C &&
            !s.field_a.e(16)) {
            sc.a(-1, true, ad.field_q);
          }
          if (df.field_l != null &&
            df.field_l.field_h) {
            qk.a(true);
            vj.b((byte) 72);
          }
          if (param0 != 35) {
            this.a((he[]) null, 93, (he[]) null);
          }
          stackIn_21_1 = (df.field_l != null);
          this.a(stackIn_21_1, 55);
          if (nd.field_Q) {
            this.p(-119);
            nd.field_Q = false;
          }
          ni.field_x = ni.field_x + 1;
          lf.field_b = lf.field_b + 1;
          if (kh.a(false)) {
            this.m(-128);
            if (kh.a(false)) {
              if (bj.a(13)) {
                discarded$0 = this.b(false, -111);
              }
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (!this.field_C) {
            ui.a(ma.field_sb, param0 - 34);
            decompiledFrameRemainder0 = !(!this.b(true, param0 ^ -88));
            if (decompiledFrameRemainder0) {
              this.field_C = true;
              decompiledFrameRemainder0 = (var5 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            boolean decompiledSharedTail0 = !(a.a(param0 ^ -27336));
            if (!decompiledSharedTail0) {
              if (pf.a((byte) 97)) {
                var2_int = (int)(32.0 * ji.a(65535, (double)ni.field_x / 25.0) + 224.0);
                var3 = 3 * var2_int / 4;
                pj.field_E = var2_int + ((var3 << 16) + (var3 << 8));
                var2_int = (int)(224.0 + pj.a((double)ni.field_x / 25.0, param0 ^ 32803) * 32.0);
                a.field_i = var2_int << 16;
                if (ul.field_a == 0) {
                  var4 = qg.n((byte) 46);
                  switch (var4) {
                    case 2:
                      qk.a(true);
                    default:
                      break;
                    case 4:
                      wl.a(-2, 0, 108);
                      if (var5 == 0) {
                        break;
                      }
                    case 3:
                      s.a(true, (byte) -121);
                      break;
                  }
                  if (var5 != 0) {
                    this.v(-8755);
                  }
                } else {
                  this.v(-8755);
                }
                if (!pf.a((byte) 97)) {
                  th.field_a[hl.field_f].a(true, (byte) 98);
                }
                decompiledFrameRemainder0 = (var5 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (!bb.a((byte) -103)) {
                  this.v(param0 - 8790);
                  decompiledFrameRemainder0 = (var5 != 0);
                }
                if (decompiledFrameRemainder0) {
                  stackIn_82_1 = 5017;
                  stackIn_83_2 = (null != df.field_l);
                  var2_int = this.b(stackIn_82_1, stackIn_83_2);
                  if (var2_int == 1 ||
                    var2_int == 2) {
                    if (null != df.field_l) {
                      hb.a(-5, df.field_l);
                      df.field_l.a(sb.field_d, true);
                      df.field_l = null;
                    }
                    if (var2_int == 2) {
                      DrPhlogistonSavesTheEarth.a(nb.a(-106), -117);
                    }
                  }
                  decompiledSharedTail0 = (var5 != 0);
                }
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledSharedTail0)) {
              hc.b((byte) -51);
              if (a.a(-27365)) {
                bh.b(-95);
                gf.b((byte) 86);
                if (hl.field_f == 9 &&
                  ej.field_h == 0) {
                  hl.field_f = 2;
                  ek.a(-114, false, 2);
                }
              }
            }
          }
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          if (!oh.a(0)) {
            while (true) {
              var2 = (je) (nf.field_x.d(180479896));
              if (var2 == null) {
                break;
              }
              wb.a(true, 4, var2);
              if (var5 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted1) {
            while (th.a(false, vi.field_a)) {
              this.c(true);
              if (var5 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              qj.a(0, 14656);
            }
          }
          if (sb.b(-11)) {
            var2_int = this.b(false);
            if (var2_int == 0 ||
              var2_int == 1) {
              el.a(false, 2);
              ka.a(3, (byte) -40);
              i.a(4, 0);
              dj.a(false, 5);
            }
            if (var2_int == 2) {
              am.e(11);
            }
          }
          if (vi.field_c != null &&
            vi.field_c.field_i) {
            if (gf.field_D < vi.field_c.field_j[0]) {
              gf.field_D = vi.field_c.field_j[0];
            }
            vi.field_c = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2_ref), "DrPhlogistonSavesTheEarth.BA(" + param0 + ')');
        }
    }

    private final void o(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_D ? 1 : 0;
        try {
          we.a(qa.field_O, -89, 88.0f);
          of.field_x = eh.a("", (byte) -61, kf.field_d, "poweruplife");
          od.field_k = eh.a("", (byte) -66, kf.field_d, "poweruppoints100");
          qc.field_a = eh.a("", (byte) -56, kf.field_d, "poweruppoints1000");
          p.field_e = eh.a("", (byte) -31, kf.field_d, "poweruppoints5000");
          c.field_a[0] = eh.a("", (byte) -47, kf.field_d, "powerupx2");
          c.field_a[1] = eh.a("", (byte) -23, kf.field_d, "powerupx3");
          c.field_a[2] = eh.a("", (byte) -96, kf.field_d, "powerupx4");
          c.field_a[3] = eh.a("", (byte) -92, kf.field_d, "powerupx5");
          c.field_a[4] = eh.a("", (byte) -55, kf.field_d, "powerupx6");
          ri.field_b = eh.a("", (byte) -71, kf.field_d, "powerupshield");
          re.field_d = eh.a("", (byte) -110, kf.field_d, "powerupweapon");
          si.f(10);
          di.field_b = ij.a("awardarray_big", (byte) 63, kf.field_d, "");
          var2_int = 0;
          do {
            if (!(di.field_b.length > var2_int)) {
              tl.field_P = eh.a("basic", (byte) -53, ph.field_b, "unachieved");
              ce.field_b = eh.a("basic", (byte) -39, ph.field_b, "orbcoin");
              ge.field_d = eh.a("basic", (byte) -55, ph.field_b, "locked");
              ol.a(false);
              break;
            }
            di.field_b[var2_int].c();
            var2_int++;
          } while (var3 == 0);
          var2_int = 0;
          while (9 > var2_int) {
            eb.field_e[var2_int] = new nh(64, 64);
            var2_int++;
            if (var3 != 0) {
              return;
            }
          }
          eb.field_e[0].c();
          wj.f(0, 0, 64, 64, 10836, 21672);
          oi.field_f.a(0, 0, 256, 64);
          eb.field_e[1].c();
          wj.f(0, 0, 64, 64, 262656, 11754240);
          sg.field_e.a(0, 0, 256, 64);
          eb.field_e[2].c();
          wj.f(0, 0, 64, 64, 258, 13932);
          uk.field_h.a(0, 0, 256, 64);
          eb.field_e[3].c();
          nb.field_b.a(0, 0);
          kl.field_R[0].d(0, 0);
          eb.field_e[4].c();
          nb.field_b.a(0, 0);
          sh.field_b.d(-715, -185);
          od.field_i[0].a(10, 5);
          eb.field_e[5].c();
          nb.field_b.a(0, 0);
          be.a(sh.field_b, -715, -75);
          eb.field_e[6].c();
          wj.f(0, 0, 64, 64, 7091712, 131328);
          vi.field_g.a(0, 0, 256, 64);
          var2_int = -13 % ((param0 - 56) / 56);
          eb.field_e[7].c();
          wj.f(0, 0, 64, 64, 27648, 512);
          vi.field_g.a(0, 0, 256, 64);
          eb.field_e[8].c();
          wj.f(0, 0, 64, 64, 27648, 512);
          vi.field_g.a(-30, 0, 256, 64);
          md.field_f = new nh(64, 64);
          md.field_f.c();
          wj.f(0, 0, 64, 64, 2897296, 0);
          cb.field_b.b("?", 32, 32, 16777215, 1);
          wi.field_a = new nh(64, 64);
          wi.field_a.c();
          wj.f(0, 0, 64, 64, 2897296, 0);
          cb.field_b.b("?", 32, 32, 16777215, 1);
          ge.field_d.b(32, 32);
          lb.field_C.a(103);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) runtimeException), "DrPhlogistonSavesTheEarth.VA(" + param0 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          DrPhlogistonSavesTheEarth.u(-16387);
          vd.a(true);
          dk.a(24);
          tb.a((byte) 35);
          ul.a((byte) 8);
          rk.a((byte) 52);
          gd.a(-27770);
          ld.e((byte) 39);
          ij.a(15596);
          sl.j(26395);
          gl.a(false);
          li.c(-1);
          fi.a(125);
          fe.a((byte) 119);
          aj.a(45);
          oi.a((byte) 86);
          wj.d();
          vj.c(0);
          pc.a(13302);
          bc.a(66);
          od.d(4);
          la.a((byte) 0);
          lf.a(-127);
          le.a(param0);
          oe.a(5);
          kf.a(23050);
          th.a((byte) 111);
          al.a(false);
          oh.a(false);
          bj.a(true);
          we.a((byte) 120);
          qh.a(1);
          ab.a(false);
          m.a(!param0);
          na.a((byte) -33);
          sb.a((byte) 33);
          q.a(25270);
          wg.b(2);
          ng.a(0);
          cf.a(-127);
          mk.a(0);
          j.h(24342);
          nb.a((byte) 76);
          i.a((byte) -118);
          gb.b(6);
          n.b(-31553);
          df.c(110);
          ge.a(false);
          qe.c(0);
          oj.a(false);
          fj.d(57);
          gf.a(param0);
          ib.a(9);
          bf.c((byte) -114);
          td.a(869637800);
          ck.a(7268);
          gi.b(10589);
          ug.h(-921185753);
          tg.a(0);
          cc.a((byte) -8);
          rl.f();
          am.f(-112);
          ml.a(!param0);
          id.e();
          eb.a(5);
          ql.a((byte) -114);
          of.g(1024);
          gk.a(false);
          d.a((byte) 39);
          rf.a();
          ui.a(-19662);
          rg.a((byte) -20);
          di.a((byte) 27);
          ea.a(0);
          kh.a((byte) -63);
          mg.a((byte) 5);
          wd.a(99);
          eg.a(-1);
          qj.a((byte) -126);
          k.g((byte) 52);
          qd.o(9791);
          tf.c(false);
          el.n(20);
          ma.n(19678);
          v.j(3);
          ff.i(-1);
          wa.j(-11179);
          ah.k(-988);
          a.b(2);
          sf.a(param0);
          ub.a((byte) -119);
          s.a(7);
          fb.a(256);
          cb.a((byte) 122);
          mf.g(-62);
          uh.d(-24338);
          lh.p(0);
          jj.a(111);
          nk.a();
          sg.a((byte) -57);
          tk.b();
          gj.b();
          ha.a((byte) 69);
          pe.b(0);
          be.a();
          hi.b(109);
          aa.a(1);
          ee.a(1);
          ii.a(110);
          db.a((byte) 89);
          u.a((byte) 50);
          t.a((byte) -114);
          ta.b(1441320386);
          cl.d(0);
          hl.e(108);
          cm.a((byte) -113);
          ik.a(0);
          bi.a((byte) 119);
          de.d(117);
          pf.b(-79);
          c.a((byte) -58);
          lb.h(30);
          fl.a(118);
          qc.a(24937);
          ae.n(1);
          kk.a((byte) 44);
          l.a(0);
          uc.c();
          sh.a((byte) 119);
          ej.a(12018);
          ja.a(93);
          fc.a(-60);
          af.a(4);
          pd.a(false);
          mh.a((byte) -9);
          r.a((byte) 11);
          ce.a(-105);
          hc.c((byte) -98);
          hm.c(-99);
          ua.a((byte) 50);
          rc.a(2);
          qf.a((byte) 64);
          bh.a(67);
          gh.a();
          lc.b((byte) 111);
          sc.a(-63);
          ki.a(true);
          hb.a((byte) 101);
          ch.b((byte) 94);
          lg.a((byte) -119);
          fm.a(-109);
          vg.f((byte) -102);
          hf.f(7966);
          si.g(6714);
          ca.m(-2110416344);
          bd.a((byte) -120);
          pj.f(-86);
          rh.b(-2);
          ob.a((byte) 52);
          cj.a(-95);
          ai.h(-30463);
          p.a(-29912);
          ac.a((byte) -91);
          ol.a((byte) -116);
          eh.a((byte) -84);
          wi.a(2);
          ji.a(true);
          ph.a(1);
          hj.a(-20385);
          qk.b(65280);
          bk.b(66);
          fa.e(-57);
          ga.a((byte) -4);
          wb.b(34);
          gg.b(-339514552);
          nj.b(0);
          ig.e(-15877);
          ri.a(param0);
          dh.j(3);
          qg.n(-1);
          kl.j((byte) 78);
          jf.h((byte) 127);
          hd.b(false);
          jd.a((byte) 108);
          qa.a((byte) 122);
          gm.h(-112);
          ci.i(-76);
          nc.a((byte) 126);
          ei.d(1);
          md.a(75);
          ih.l(288);
          nd.b(true);
          tl.a((byte) -39);
          da.a();
          hh.a(false);
          o.a((byte) 99);
          jc.c((byte) 56);
          rb.a(0);
          pi.j(2147483647);
          jk.j(7624);
          sa.a(250);
          tc.a(-9292);
          dg.a(true);
          wh.c((byte) -86);
          rd.g(-125);
          ka.c(26713);
          pa.a(-1);
          re.b(967);
          oa.a(71);
          vb.d(4);
          bg.a((byte) 102);
          sj.a(true);
          kc.a((byte) -1);
          ie.c(78);
          uk.a(false);
          mj.c(2147483647);
          dm.d((byte) -126);
          ue.a(117);
          dl.j(0);
          hg.h(-15);
          b.d(-382);
          uf.a((byte) -60);
          f.d(-1);
          je.a((byte) 19);
          nl.a((byte) -106);
          vc.a(0);
          bb.b(param0);
          wk.d(80);
          qb.a(false);
          og.a(120);
          sd.a(2);
          lk.a(-27996);
          ll.d((byte) 104);
          dd.a(false);
          ia.b(27174);
          ek.e(-126);
          uj.d(1);
          jl.d(65535);
          kj.a(14970);
          mi.b((byte) 91);
          ad.e(0);
          ni.d((byte) 125);
          g.b(true);
          nf.d((byte) -95);
          cd.b((byte) -47);
          fk.a((byte) 111);
          vh.a(84);
          dc.c(88);
          vi.a(2823);
          this.field_z = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "DrPhlogistonSavesTheEarth.W(" + param0 + ')');
        }
    }

    final static boolean t(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 18137) {
            return true;
          }
          stackIn_10_0 = (uj.field_j != null) && (tl.field_O.a(false));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "DrPhlogistonSavesTheEarth.IB(" + param0 + ')');
        }
    }

    private final void p(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != df.field_m) {
            q.a(df.field_m, 255);
            df.field_m = null;
            tc.a((byte) 86);
          }
          kf.field_d = al.a(3, 1);
          aa.field_b = al.a(3, 2);
          ua.field_b = al.a(3, 3);
          ui.field_a = al.a(3, 4);
          df.field_a = al.a(3, 5);
          mh.field_a = al.a(3, 6);
          ff.field_P = al.a(3, 7);
          s.c((byte) 126);
          var2_int = -107 % ((-65 - param0) / 41);
          gd.a(si.field_E, 255, ph.field_b);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "DrPhlogistonSavesTheEarth.RA(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 176) {
            stackIn_2_0 = -7;
            return stackIn_2_0;
          }
          var3_int = param0 >> 31 & param1 - 1;
          stackIn_4_0 = (param0 + (param0 >>> 31)) % param1 + var3_int;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var3), "DrPhlogistonSavesTheEarth.SA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final he[] a(he[] param0, int param1) {
        he[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        he[] stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = field_D ? 1 : 0;
        try {
          var3 = new he[param0.length];
          if (param1 != 65793) {
            this.h(-112);
          }
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 >= var3.length))) {
            var3[var4] = param0[var4].e();
            stackIn_11_0 = var3;
            if (var5 == 0) {
              ((he) (Object) stackIn_11_0[var4]).d();
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_11_0 = var3;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.CB(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, he[] param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = field_D ? 1 : 0;
        try {
          if (param1 == null) {
            return;
          }
          var3_int = 0;
          if (param0 < 80) {
            field_J = (nh) null;
          }
          while (param1.length > var3_int) {
            param1[var3_int].c();
            var3_int++;
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_16_0 = runtimeException;
          stackIn_16_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void h(int param0) {
        Object stackIn_5_0 = null;
        boolean stackIn_12_0 = false;
        int stackIn_86_0 = 0;
        boolean stackIn_87_1 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        var4 = field_D ? 1 : 0;
        try {
          if (df.field_l != null) {
            stackIn_5_0 = df.field_l;
          } else {
            stackIn_5_0 = n.field_g;
          }
          var2 = stackIn_5_0;
          if (kh.a(false)) {
            if (null == df.field_l) {
              stackIn_12_0 = pj.field_C;
            } else {
              stackIn_12_0 = true;
            }
            o.a(stackIn_12_0, 320, (java.awt.Canvas) (var2));
            return;
          }
          if (!this.field_C) {
            dh.a(41, (java.awt.Canvas) (var2));
            return;
          }
          if (!a.a(-27365)) {
            we.a(ia.field_b, -119, 100.0f);
            dh.a(21, (java.awt.Canvas) (var2));
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (r.field_d == hl.field_f) {
            if (hl.field_f == -1) {
              sd.field_a.y(6212);
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              th.field_a[hl.field_f].f(-8448);
              decompiledFrameRemainder0 = (var4 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if (16 > ue.field_b) {
              if (hl.field_f != -1) {
                th.field_a[hl.field_f].f(-8448);
                if (var4 != 0) {
                  sd.field_a.y(6212);
                }
              } else {
                sd.field_a.y(6212);
              }
              be.a(ue.field_b * 15 + 1);
              be.a(0, 0, 640, 480, 14713896, ue.field_b * 10);
              if (var4 != 0) {
                lf.field_b = 0;
                if (r.field_d != -1) {
                  th.field_a[r.field_d].f(-8448);
                  sd.field_a.y(6212);
                } else {
                  sd.field_a.y(6212);
                }
                be.a(15 * (-ue.field_b + 32 + 1));
                be.a(0, 0, 640, 480, 22070844, -(10 * ue.field_b) + 320);
              }
            } else {
              lf.field_b = 0;
              if (r.field_d != -1) {
                th.field_a[r.field_d].f(-8448);
                if (var4 != 0) {
                  sd.field_a.y(6212);
                }
              } else {
                sd.field_a.y(6212);
              }
              be.a(15 * (-ue.field_b + 32 + 1));
              be.a(0, 0, 640, 480, 22070844, -(10 * ue.field_b) + 320);
            }
            if (ue.field_b == 0 &&
              r.field_d == 11) {
              ti.a(true, 0);
            }
          }
          if (pf.a((byte) 97)) {
            wj.a(0, 0, wj.field_k, wj.field_c);
            ug.a(ca.field_W[0].field_y, ca.field_W[0].field_w, ca.field_W, 37);
          }
          if (0 != ul.field_a) {
            var3 = 256 * ue.field_b / 32;
            if (var3 > 0) {
              wj.d(0, 0, wj.field_k, wj.field_c, 0, var3);
            }
          }
          if (!bb.a((byte) -103) ||
            pf.a((byte) 97)) {
            if ((fl.b(73)) &&
              (!pf.a((byte) 97))) {
              wj.a(0, 0, wj.field_k, wj.field_c);
              qe.a(ca.field_W[0].field_y, ca.field_W[0].field_w, ca.field_W, (byte) -76);
              if (var4 != 0) {
                stackIn_86_0 = 91;
                if (df.field_l != null) {
                  stackIn_87_1 = true;
                } else {
                  stackIn_87_1 = pj.field_C;
                }
                dh.$cfr$intArgs$a$7ffe4b125357(stackIn_86_0, stackIn_87_1);
              }
            }
          } else {
            stackIn_86_0 = 91;
            if (df.field_l != null) {
              stackIn_87_1 = true;
            } else {
              stackIn_87_1 = pj.field_C;
            }
            dh.$cfr$intArgs$a$7ffe4b125357(stackIn_86_0, stackIn_87_1);
          }
          if (nj.field_j >= 2) {
            a.field_g.c(qj.field_c + " lps", 15, 15, 16777215, 65793);
          }
          DrPhlogistonSavesTheEarth.a(param0, -74, (java.awt.Canvas) (var2), 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2_ref), "DrPhlogistonSavesTheEarth.LA(" + param0 + ')');
        }
    }

    private final void v(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = field_D ? 1 : 0;
        try {
          if (param0 != -8755) {
            field_F = (vd) null;
          }
          if (ul.field_a == 0) {
            if (~r.field_d != ~hl.field_f) {
              ue.field_b = ue.field_b + 1;
              if (ue.field_b != 32) {
                return;
              }
              if (hl.field_f == 2) {
                ob.field_b = null;
              }
              hl.field_f = r.field_d;
              ue.field_b = 0;
              if (var3 == 0) {
                return;
              }
            }
            if (hl.field_f == -1) {
              sd.field_a.r(param0 ^ 8794);
              if (var3 == 0) {
                return;
              }
            }
            th.field_a[hl.field_f].l(-14689);
            if (var3 == 0) {
              return;
            }
          }
          if (ul.field_a == 1) {
            ue.field_b = ue.field_b + 1;
            if (ue.field_b != 32) {
              return;
            }
            if (!pf.a((byte) 97)) {
              cj.b(8227);
              if (var3 != 0) {
                og.a((byte) 78);
              }
            } else {
              og.a((byte) 78);
            }
            ul.field_a = 2;
            if (var3 == 0) {
              return;
            }
          }
          if (ul.field_a != 2) {
            if (ue.field_b <= 0) {
              ul.field_a = 0;
            }
            ue.field_b = ue.field_b - 1;
            if (var3 == 0) {
              return;
            }
          }
          if (!oh.a(param0 + 8755)) {
            ri.field_f = ge.a(4, (byte) -125);
            if (null != sd.field_a) {
              bf.field_h = sd.field_a.j((byte) -68);
            }
            hl.field_f = hg.field_sb;
            eb.a((byte) 20);
            li.b(param0 + 8638);
            if (hl.field_f == -2) {
              hl.field_f = 0;
              s.a(false, (byte) -122);
              if (var3 != 0) {
                hl.field_f = tf.field_jb;
              }
            }
          } else {
            hl.field_f = tf.field_jb;
          }
          ek.a(-114, false, hl.field_f);
          ul.field_a = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "DrPhlogistonSavesTheEarth.LB(" + param0 + ')');
        }
    }

    private final void k(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = field_D ? 1 : 0;
        try {
          we.a(qa.field_O, -80, 68.0f);
          mk.field_g[0] = eh.a("", (byte) -66, kf.field_d, "act_screen_intro_1_part_1");
          mk.field_g[1] = eh.a("", (byte) -90, kf.field_d, "act_screen_intro_1_part_2");
          mk.field_g[2] = eh.a("", (byte) -99, kf.field_d, "act_screen_intro_1_part_3");
          mk.field_g[3] = eh.a("", (byte) -90, kf.field_d, "act_screen_intro_1_part_4");
          mk.field_g[4] = eh.a("", (byte) -110, kf.field_d, "act_screen_intro_1_part_5");
          mk.field_g[5] = eh.a("", (byte) -75, kf.field_d, "act_screen_intro_1_part_6");
          mk.field_g[6] = eh.a("", (byte) -23, kf.field_d, "act_screen_intro_1_part_7");
          mk.field_g[7] = eh.a("", (byte) -65, kf.field_d, "act_screen_intro_1_part_8");
          wb.field_a[0] = eh.a("", (byte) -92, kf.field_d, "act_screen_intro_2");
          gl.field_b[0] = eh.a("", (byte) -127, kf.field_d, "act_screen_intro_3");
          pc.field_b[0] = eh.a("", (byte) -35, kf.field_d, "act_screen_intro_4_part_1");
          pc.field_b[1] = eh.a("", (byte) -102, kf.field_d, "act_screen_intro_4_part_2");
          pc.field_b[2] = eh.a("", (byte) -61, kf.field_d, "act_screen_intro_4_part_3");
          ge.field_p[0] = eh.a("", (byte) -93, kf.field_d, "act_screen_intro_5");
          th.field_b[0] = eh.a("", (byte) -31, kf.field_d, "act_screen_intro_6");
          v.field_W[0] = eh.a("", (byte) -100, kf.field_d, "act_screen_intro_7_part_1");
          v.field_W[1] = eh.a("", (byte) -75, kf.field_d, "act_screen_intro_7_part_2");
          v.field_W[2] = eh.a("", (byte) -50, kf.field_d, "act_screen_intro_7_part_3");
          ie.field_x[0] = eh.a("", (byte) -122, kf.field_d, "act_screen_intro_8");
          rg.field_c[0] = eh.a("", (byte) -84, kf.field_d, "act_screen_intro_9");
          if (param0 != 22) {
            return;
          }
          l.field_f[0][0] = eh.a("", (byte) -78, kf.field_d, "act_screen_death_1");
          l.field_f[1][0] = l.field_f[0][0];
          l.field_f[2][0] = l.field_f[0][0];
          l.field_f[3][0] = eh.a("", (byte) -105, kf.field_d, "act_screen_death_4");
          l.field_f[4][0] = l.field_f[3][0];
          l.field_f[5][0] = l.field_f[3][0];
          l.field_f[6][0] = eh.a("", (byte) -49, kf.field_d, "act_screen_death_7");
          l.field_f[7][0] = l.field_f[6][0];
          l.field_f[8][0] = l.field_f[6][0];
          l.field_f[0][1] = eh.a("", (byte) -101, kf.field_d, "act_screen_death_boss_123");
          l.field_f[1][1] = l.field_f[0][1];
          l.field_f[2][1] = l.field_f[0][1];
          l.field_f[3][1] = eh.a("", (byte) -96, kf.field_d, "act_screen_death_boss_456");
          l.field_f[4][1] = l.field_f[3][1];
          l.field_f[5][1] = l.field_f[3][1];
          l.field_f[6][1] = eh.a("", (byte) -34, kf.field_d, "act_screen_death_boss_789");
          l.field_f[7][1] = l.field_f[6][1];
          l.field_f[8][1] = l.field_f[6][1];
          hh.field_d[2] = eh.a("", (byte) -114, kf.field_d, "act_screen_completion_1");
          hh.field_d[5] = eh.a("", (byte) -83, kf.field_d, "act_screen_completion_2");
          hh.field_d[8] = eh.a("", (byte) -111, kf.field_d, "act_screen_completion_3");
          al.field_c = eh.a("", (byte) -95, kf.field_d, "act_screen_completion_4");
          var2_int = 0;
          while (9 > var2_int) {
            if (var4 != 0) {
              return;
            }
            var3 = 0;
            while (2 > var3) {
              rc.field_a[var2_int][var3] = new nh(l.field_f[var2_int][var3].field_h / 4, l.field_f[var2_int][var3].field_c / 4);
              rc.field_a[var2_int][var3].c();
              l.field_f[var2_int][var3].b(0, 0);
              var3++;
            }
            var2_int++;
          }
          dc.field_a = new nh(al.field_c.field_h / 4, al.field_c.field_c / 4);
          dc.field_a.c();
          al.field_c.b(0, 0);
          lb.field_C.a(98);
          rh.field_h = hh.field_d[2];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) runtimeException), "DrPhlogistonSavesTheEarth.TA(" + param0 + ')');
        }
    }

    private final void a(he[] param0, int param1, he[] param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = field_D ? 1 : 0;
        try {
          if (param1 != 0) {
            field_E = (String) null;
          }
          var4_int = param2.length - 1;
          while (0 <= var4_int) {
            param2[var4_int].d(param0[var4_int].field_k - param2[var4_int].field_k);
            var4_int--;
            if (var5 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.UA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          try {
            var4 = param2.getGraphics();
            lb.field_C.a(var4, param3, param0, 255);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
          }
          if (param1 > -67) {
            field_G = (he[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var4_ref2;
          stackIn_10_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.OB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void j(byte param0) {
        RuntimeException decompiledCaughtException = null;
        kb var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        kb var2Lifetime1;
        kb var2Lifetime2;
        kb var2Lifetime3;
        kb var2Lifetime4;
        kb var2Lifetime5;
        kb var2Lifetime6;
        kb var2Lifetime7;
        kb var2Lifetime8;
        kb var2Lifetime9;
        kb var2Lifetime10;
        kb var2Lifetime11;
        kb var2Lifetime12;
        kb var2Lifetime13;
        kb var2Lifetime14;
        kb var2Lifetime15;
        kb var2Lifetime16;
        kb var2Lifetime17;
        kb var2Lifetime18;
        kb var2Lifetime19;
        kb var2Lifetime20;
        kb var2Lifetime21;
        kb var2Lifetime22;
        kb var2Lifetime23;
        kb var2Lifetime24;
        kb var2Lifetime25;
        kb var2Lifetime26;
        kb var2Lifetime27;
        kb var2Lifetime28;
        kb var2Lifetime29;
        kb var2Lifetime30;
        kb var2Lifetime31;
        kb var2Lifetime32;
        kb var2Lifetime33;
        kb var2Lifetime34;
        kb var2Lifetime35;
        kb var2Lifetime36;
        kb var2Lifetime37;
        kb var2Lifetime38;
        kb var2Lifetime39;
        kb var2Lifetime40;
        kb var2Lifetime41;
        kb var2Lifetime42;
        kb var2Lifetime43;
        kb var2Lifetime44;
        kb var2Lifetime45;
        kb var2Lifetime46;
        kb var2Lifetime47;
        kb var2Lifetime48;
        kb var2Lifetime49;
        kb var2Lifetime50;
        kb var2Lifetime51;
        try {
          we.a(sl.field_s, -79, 50.0f);
          this.h(0);
          nl.field_r[0] = kb.a(aa.field_b, "", "menu_select").a().a(qk.field_g);
          var2 = kb.a(aa.field_b, "", "DrP_1_gatling_gun_fire");
          if (null != var2) {
            nl.field_r[1] = var2.a().a(qk.field_g);
          }
          var2Lifetime1 = kb.a(aa.field_b, "", "DrP_2_drop_bomb");
          if (var2Lifetime1 != null) {
            nl.field_r[2] = var2Lifetime1.a().a(qk.field_g);
          }
          var2Lifetime2 = kb.a(aa.field_b, "", "DrP_3_sonic_canon_fire");
          if (null != var2Lifetime2) {
            nl.field_r[3] = var2Lifetime2.a().a(qk.field_g);
          }
          var2Lifetime3 = kb.a(aa.field_b, "", "DrP_4_homing_missile_fire");
          if (var2Lifetime3 != null) {
            nl.field_r[4] = var2Lifetime3.a().a(qk.field_g);
          }
          nl.field_r[5] = wi.a(2205, 100, 100);
          var2Lifetime4 = kb.a(aa.field_b, "", "DrP_6_mega_canon_fire");
          if (var2Lifetime4 != null) {
            nl.field_r[6] = var2Lifetime4.a().a(qk.field_g);
          }
          var2Lifetime5 = kb.a(aa.field_b, "", "DrP_7_loose_life");
          if (var2Lifetime5 != null) {
            nl.field_r[7] = var2Lifetime5.a().a(qk.field_g);
          }
          nl.field_r[8] = tk.a(ua.field_b, "", "DrP_8_respawn").c().a(qk.field_g);
          var2Lifetime6 = kb.a(aa.field_b, "", "DrP_9_final_death");
          if (null != var2Lifetime6) {
            nl.field_r[9] = var2Lifetime6.a().a(qk.field_g);
          }
          var2Lifetime7 = kb.a(aa.field_b, "", "DrP_10_tripod_hit");
          if (null != var2Lifetime7) {
            nl.field_r[10] = var2Lifetime7.a().a(qk.field_g);
          }
          var2Lifetime8 = kb.a(aa.field_b, "", "DrP_11_tripod_fire");
          if (var2Lifetime8 != null) {
            nl.field_r[11] = var2Lifetime8.a().a(qk.field_g);
          }
          var2Lifetime9 = kb.a(aa.field_b, "", "DrP_12_probes_hit");
          if (var2Lifetime9 != null) {
            nl.field_r[12] = var2Lifetime9.a().a(qk.field_g);
          }
          nl.field_r[13] = tk.a(ua.field_b, "", "DrP_13_probes_die").c().a(qk.field_g);
          var2Lifetime10 = kb.a(aa.field_b, "", "DrP_14_glider_fire");
          if (null != var2Lifetime10) {
            nl.field_r[14] = var2Lifetime10.a().a(qk.field_g);
          }
          var2Lifetime11 = kb.a(aa.field_b, "", "DrP_15_glider_die");
          if (var2Lifetime11 != null) {
            nl.field_r[15] = var2Lifetime11.a().a(qk.field_g);
          }
          var2Lifetime12 = kb.a(aa.field_b, "", "DrP_16_shredder_hit");
          if (null != var2Lifetime12) {
            nl.field_r[16] = var2Lifetime12.a().a(qk.field_g);
          }
          var2Lifetime13 = kb.a(aa.field_b, "", "DrP_17_shredder_die");
          if (var2Lifetime13 != null) {
            nl.field_r[17] = var2Lifetime13.a().a(qk.field_g);
          }
          var2Lifetime14 = kb.a(aa.field_b, "", "DrP_18_as_bot_hit");
          if (var2Lifetime14 != null) {
            nl.field_r[18] = var2Lifetime14.a().a(qk.field_g);
          }
          var2Lifetime15 = kb.a(aa.field_b, "", "DrP_19_as_bot_fire");
          if (null != var2Lifetime15) {
            nl.field_r[19] = var2Lifetime15.a().a(qk.field_g);
          }
          nl.field_r[20] = tk.a(ua.field_b, "", "DrP_20_as_bot_die").c().a(qk.field_g);
          nl.field_r[21] = tk.a(ua.field_b, "", "DrP_21_dropship_move").c().a(qk.field_g);
          nl.field_r[22] = tk.a(ua.field_b, "", "DrP_22_dropship_chrg").c().a(qk.field_g);
          var2Lifetime16 = kb.a(aa.field_b, "", "DrP_23_dropship_spawn");
          if (var2Lifetime16 != null) {
            nl.field_r[23] = var2Lifetime16.a().a(qk.field_g);
          }
          var2Lifetime17 = kb.a(aa.field_b, "", "DrP_24_dropship_fire");
          if (var2Lifetime17 != null) {
            nl.field_r[24] = var2Lifetime17.a().a(qk.field_g);
          }
          var2Lifetime18 = kb.a(aa.field_b, "", "DrP_25_dropship_hit");
          if (null != var2Lifetime18) {
            nl.field_r[25] = var2Lifetime18.a().a(qk.field_g);
          }
          nl.field_r[26] = tk.a(ua.field_b, "", "DrP_26_dropship_die").c().a(qk.field_g);
          var2Lifetime19 = kb.a(aa.field_b, "", "DrP_27_spacemine_exp");
          if (null != var2Lifetime19) {
            nl.field_r[27] = var2Lifetime19.a().a(qk.field_g);
          }
          var2Lifetime20 = kb.a(aa.field_b, "", "DrP_28_miner_hit");
          if (var2Lifetime20 != null) {
            nl.field_r[28] = var2Lifetime20.a().a(qk.field_g);
          }
          nl.field_r[29] = tk.a(ua.field_b, "", "DrP_29_miner_move").c().a(qk.field_g);
          var2Lifetime21 = kb.a(aa.field_b, "", "DrP_30_miner_die");
          if (null != var2Lifetime21) {
            nl.field_r[30] = var2Lifetime21.a().a(qk.field_g);
          }
          var2Lifetime22 = kb.a(aa.field_b, "", "DrP_31_asteroid_hit");
          if (var2Lifetime22 != null) {
            nl.field_r[31] = var2Lifetime22.a().a(qk.field_g);
          }
          var2Lifetime23 = kb.a(aa.field_b, "", "DrP_32b_asteroid_dest");
          if (null != var2Lifetime23) {
            nl.field_r[32] = var2Lifetime23.a().a(qk.field_g);
          }
          nl.field_r[33] = tk.a(ua.field_b, "", "DrP_33_battlecarr_move").c().a(qk.field_g);
          nl.field_r[34] = tk.a(ua.field_b, "", "DrP_34_battlecarr_charge").c().a(qk.field_g);
          var2Lifetime24 = kb.a(aa.field_b, "", "DrP_35_battlecarr_fire");
          if (var2Lifetime24 != null) {
            nl.field_r[35] = var2Lifetime24.a().a(qk.field_g);
          }
          var2Lifetime25 = kb.a(aa.field_b, "", "DrP_36_battlecarr_spawn");
          if (null != var2Lifetime25) {
            nl.field_r[36] = var2Lifetime25.a().a(qk.field_g);
          }
          var2Lifetime26 = kb.a(aa.field_b, "", "DrP_37_battlecarr_hit");
          if (var2Lifetime26 != null) {
            nl.field_r[37] = var2Lifetime26.a().a(qk.field_g);
          }
          nl.field_r[38] = tk.a(ua.field_b, "", "DrP_38_battlecarr_die").c().a(qk.field_g);
          nl.field_r[39] = tk.a(ua.field_b, "", "DrP_39_bunkers_hit").c().a(qk.field_g);
          var2Lifetime27 = kb.a(aa.field_b, "", "DrP_40_bunkers_die");
          if (null != var2Lifetime27) {
            nl.field_r[40] = var2Lifetime27.a().a(qk.field_g);
          }
          var2Lifetime28 = kb.a(aa.field_b, "", "DrP_41_combtank_fire");
          if (var2Lifetime28 != null) {
            nl.field_r[41] = var2Lifetime28.a().a(qk.field_g);
          }
          var2Lifetime29 = kb.a(aa.field_b, "", "DrP_42_combtank_hit");
          if (var2Lifetime29 != null) {
            nl.field_r[42] = var2Lifetime29.a().a(qk.field_g);
          }
          var2Lifetime30 = kb.a(aa.field_b, "", "DrP_43_combtank_die");
          if (var2Lifetime30 != null) {
            nl.field_r[43] = var2Lifetime30.a().a(qk.field_g);
          }
          var2Lifetime31 = kb.a(aa.field_b, "", "DrP_44_battank_fire");
          if (var2Lifetime31 != null) {
            nl.field_r[44] = var2Lifetime31.a().a(qk.field_g);
          }
          var2Lifetime32 = kb.a(aa.field_b, "", "DrP_45_battank_hit");
          if (var2Lifetime32 != null) {
            nl.field_r[45] = var2Lifetime32.a().a(qk.field_g);
          }
          var2Lifetime33 = kb.a(aa.field_b, "", "DrP_46_battank_die");
          if (var2Lifetime33 != null) {
            nl.field_r[46] = var2Lifetime33.a().a(qk.field_g);
          }
          nl.field_r[47] = tk.a(ua.field_b, "", "DrP_47_attackcop_move").c().a(qk.field_g);
          var2Lifetime34 = kb.a(aa.field_b, "", "DrP_48_attackcop_fire");
          if (null != var2Lifetime34) {
            nl.field_r[48] = var2Lifetime34.a().a(qk.field_g);
          }
          var2Lifetime35 = kb.a(aa.field_b, "", "DrP_49_attackcop_hit");
          if (var2Lifetime35 != null) {
            nl.field_r[49] = var2Lifetime35.a().a(qk.field_g);
          }
          nl.field_r[50] = tk.a(ua.field_b, "", "DrP_50_attackcop_die").c().a(qk.field_g);
          nl.field_r[51] = tk.a(ua.field_b, "", "DrP_51_doomcop_move").c().a(qk.field_g);
          var2Lifetime36 = kb.a(aa.field_b, "", "DrP_52_doomcop_fire");
          if (var2Lifetime36 != null) {
            nl.field_r[52] = var2Lifetime36.a().a(qk.field_g);
          }
          var2Lifetime37 = kb.a(aa.field_b, "", "DrP_53_doomcop_hit");
          if (null != var2Lifetime37) {
            nl.field_r[53] = var2Lifetime37.a().a(qk.field_g);
          }
          nl.field_r[54] = tk.a(ua.field_b, "", "DrP_54_doomcop_die").c().a(qk.field_g);
          var2Lifetime38 = kb.a(aa.field_b, "", "DrP_55_floatbat_move");
          if (null != var2Lifetime38) {
            nl.field_r[55] = var2Lifetime38.a().a(qk.field_g);
          }
          nl.field_r[56] = tk.a(ua.field_b, "", "DrP_56_floatbat_chrg").c().a(qk.field_g);
          var2Lifetime39 = kb.a(aa.field_b, "", "DrP_57_floatbat_fire");
          if (null != var2Lifetime39) {
            nl.field_r[57] = var2Lifetime39.a().a(qk.field_g);
          }
          var2Lifetime40 = kb.a(aa.field_b, "", "DrP_58_floatbat_spawn");
          if (null != var2Lifetime40) {
            nl.field_r[58] = var2Lifetime40.a().a(qk.field_g);
          }
          var2Lifetime41 = kb.a(aa.field_b, "", "DrP_59_floatbat_hit");
          if (null != var2Lifetime41) {
            nl.field_r[59] = var2Lifetime41.a().a(qk.field_g);
          }
          nl.field_r[60] = tk.a(ua.field_b, "", "DrP_60_floatbat_die").c().a(qk.field_g);
          var2Lifetime42 = kb.a(aa.field_b, "", "DrP_61_alcomship_move");
          if (var2Lifetime42 != null) {
            nl.field_r[61] = var2Lifetime42.a().a(qk.field_g);
          }
          nl.field_r[62] = tk.a(ua.field_b, "", "DrP_62_alcomship_chrg").c().a(qk.field_g);
          var2Lifetime43 = kb.a(aa.field_b, "", "DrP_63_alcomship_fire");
          if (null != var2Lifetime43) {
            nl.field_r[63] = var2Lifetime43.a().a(qk.field_g);
          }
          var2Lifetime44 = kb.a(aa.field_b, "", "DrP_64_alcomship_spawn");
          if (null != var2Lifetime44) {
            nl.field_r[64] = var2Lifetime44.a().a(qk.field_g);
          }
          var2Lifetime45 = kb.a(aa.field_b, "", "DrP_65_alcomship_fire2");
          if (var2Lifetime45 != null) {
            nl.field_r[65] = var2Lifetime45.a().a(qk.field_g);
          }
          var2Lifetime46 = kb.a(aa.field_b, "", "DrP_66_alcomship_hit");
          if (null != var2Lifetime46) {
            nl.field_r[66] = var2Lifetime46.a().a(qk.field_g);
          }
          nl.field_r[67] = tk.a(ua.field_b, "", "DrP_67_alcomship_die").c().a(qk.field_g);
          var2Lifetime47 = kb.a(aa.field_b, "", "DrP_68_humbuild_hit");
          if (var2Lifetime47 != null) {
            nl.field_r[68] = var2Lifetime47.a().a(qk.field_g);
          }
          if (var2Lifetime47 != null) {
            nl.field_r[69] = var2Lifetime47.a().a(qk.field_g);
          }
          var2Lifetime48 = kb.a(aa.field_b, "", "DrP_70_allpowerups");
          if (var2Lifetime48 != null) {
            nl.field_r[70] = var2Lifetime48.a().a(qk.field_g);
          }
          var2Lifetime49 = kb.a(aa.field_b, "", "DrP_32c_asteroid_dest");
          var3 = 47 / ((param0 - 19) / 45);
          if (var2Lifetime49 != null) {
            nl.field_r[71] = var2Lifetime49.a().a(qk.field_g);
          }
          var2Lifetime50 = kb.a(aa.field_b, "", "DrP_32a_asteroid_dest");
          if (var2Lifetime50 != null) {
            nl.field_r[72] = var2Lifetime50.a().a(qk.field_g);
          }
          var2Lifetime51 = kb.a(aa.field_b, "", "drp_71_tesla_coil");
          if (var2Lifetime51 != null) {
            nl.field_r[73] = var2Lifetime51.a().a(qk.field_g);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2_ref), "DrPhlogistonSavesTheEarth.KB(" + param0 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              if (param1 > -92) {
                DrPhlogistonSavesTheEarth.t(-37);
              }
              var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
              param0.getAppletContext().showDocument(kk.a(var2, param0, 4767999), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var2_ref2;
            stackIn_10_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.JB(");
            if (param0 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void h(byte param0) {
        we.a(qa.field_O, -77, 60.0f);
        ni.field_q = kc.a(ff.field_P, kf.field_d, "", param0 ^ -116, "font");
        if (param0 != -83) {
          return;
        }
        try {
          a.field_g = kc.a(ff.field_P, kf.field_d, "", 85, "small_font");
          ji.field_d = kc.a(ff.field_P, kf.field_d, "", -101, "bottomheavy32");
          cb.field_b = kc.a(ff.field_P, kf.field_d, "", -95, "scriptfont");
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "DrPhlogistonSavesTheEarth.NB(" + param0 + ')');
        }
    }

    private final void s(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          we.a(qa.field_O, -111, 95.0f);
          nc.field_M = qk.a("", kf.field_d, "mb_foreground", true);
          eb.field_g = qk.a("", kf.field_d, "mb_logo", true);
          qk.a("", kf.field_d, "mb_transparency_layer", true);
          qk.a("", kf.field_d, "mb_signup_button_frame", true);
          v.field_Y = qk.a("", kf.field_d, "mb_price_background", true);
          qk.a("", kf.field_d, "mb_menu_button_frame", true);
          cm.field_R = new nh[8];
          cm.field_R[0] = qk.a("", kf.field_d, "mb_screenshot_1", true);
          cm.field_R[1] = qk.a("", kf.field_d, "mb_screenshot_2", true);
          cm.field_R[2] = qk.a("", kf.field_d, "mb_screenshot_3", true);
          cm.field_R[3] = qk.a("", kf.field_d, "mb_screenshot_4", true);
          cm.field_R[4] = qk.a("", kf.field_d, "mb_screenshot_5", true);
          if (param0 != -23796) {
            this.s(-63);
          }
          cm.field_R[5] = qk.a("", kf.field_d, "mb_screenshot_6", true);
          cm.field_R[6] = qk.a("", kf.field_d, "mb_screenshot_7", true);
          cm.field_R[7] = qk.a("", kf.field_d, "mb_screenshot_8", true);
          sg.field_e.h();
          uk.field_h.h();
          oi.field_f.h();
          nj.field_o.h();
          cc.field_w.h();
          b.field_k.h();
          lb.field_C.a(107);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "DrPhlogistonSavesTheEarth.EB(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ek.d(-2);
          if (null != df.field_l) {
            hb.a(-5, df.field_l);
            df.field_l.a(sb.field_d, true);
          }
          sb.b((byte) 67);
          if (param0 > -120) {
            field_I = 81L;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2), "DrPhlogistonSavesTheEarth.AA(" + param0 + ')');
        }
    }

    final void a(int param0) {
        ug var2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (param0 != 32) {
            field_J = (nh) null;
          }
          this.a(8, 4, false, 7320, 0, 11, 10, 9);
          var2 = new ug();
          var2.d(9, 128, param0 ^ 85);
          var2.a(oa.field_b, (byte) -13);
          dc.a(sb.field_d, 22050, true, var2, (byte) -92, (java.awt.Component) ((Object) n.field_g));
          a.field_i = 16711680;
          pj.field_E = 11184895;
          b.field_h = 16777215;
          this.a(true, false, true, true, -6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var2_ref), "DrPhlogistonSavesTheEarth.MA(" + param0 + ')');
        }
    }

    private final he[] a(byte param0, he[] param1) {
        he[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        he[] stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = field_D ? 1 : 0;
        try {
          var3 = new he[param1.length];
          if (param0 != -105) {
            this.d(true);
          }
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 >= param1.length))) {
            stackIn_11_0 = var3;
            if (var5 == 0) {
              stackIn_11_0[var4] = param1[var4].a();
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_11_0 = var3;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("DrPhlogistonSavesTheEarth.AB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void u(int param0) {
        field_E = null;
        field_F = null;
        if (param0 != -16387) {
          return;
        }
        try {
          field_J = null;
          field_L = null;
          field_G = null;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "DrPhlogistonSavesTheEarth.QA(" + param0 + ')');
        }
    }

    private final void r(int param0) {
        try {
          we.a(qa.field_O, -126, 62.0f);
          ea.field_c = eh.a("", (byte) -92, kf.field_d, "gameinterface");
          fk.field_m = eh.a("", (byte) -78, kf.field_d, "get_ready_window");
          ph.field_h = eh.a("", (byte) -40, kf.field_d, "title_screen");
          qj.field_f = eh.a("", (byte) -126, kf.field_d, "title_screen_chars");
          rk.field_a = eh.a("", (byte) -99, kf.field_d, "slider_background");
          oi.field_h = eh.a("", (byte) -100, kf.field_d, "slider_foreground");
          gg.field_d = eh.a("", (byte) -84, kf.field_d, "title_text_highscore_screen");
          we.field_g = eh.a("", (byte) -61, kf.field_d, "title_text_instructions_screen");
          qe.field_k = eh.a("", (byte) -87, kf.field_d, "title_text_achievements_screen");
          el.field_ub = eh.a("", (byte) -23, kf.field_d, "title_text_achievements_this_game_screen");
          jk.field_L = eh.a("", (byte) -100, kf.field_d, "title_text_level_select_screen");
          cj.field_g = eh.a("", (byte) -24, kf.field_d, "title_text_world_complete");
          eh.a("", (byte) -91, kf.field_d, "title_text_members_benefits");
          oj.field_d = eh.a("", (byte) -54, kf.field_d, "title_text_log_in");
          pi.field_S = ij.a("numbers", (byte) 111, kf.field_d, "");
          t.field_a = eh.a("", (byte) -65, kf.field_d, "claw");
          bb.field_b = t.field_a.e();
          bb.field_b.g();
          la.field_a = t.field_a.e();
          la.field_a.f();
          ri.field_o = bb.field_b.e();
          ri.field_o.f();
          ek.field_m = eh.a("", (byte) -115, kf.field_d, "claw_h_bar");
          cl.field_t = eh.a("", (byte) -57, kf.field_d, "claw_v_bar");
          tb.field_d = cl.field_t.e();
          tb.field_d.g();
          jl.field_h = eh.a("", (byte) -89, kf.field_d, "help_key_shift");
          wg.field_c = eh.a("", (byte) -49, kf.field_d, "help_key_ctrl");
          na.field_c = eh.a("", (byte) -33, kf.field_d, "help_key_space");
          ul.field_h = eh.a("", (byte) -82, kf.field_d, "help_key_z");
          qb.field_d = eh.a("", (byte) -72, kf.field_d, "help_key_x");
          lk.field_k = eh.a("", (byte) -98, kf.field_d, "help_key_c");
          lb.field_D = eh.a("", (byte) -69, kf.field_d, "help_key_v");
          ki.field_b = eh.a("", (byte) -40, kf.field_d, "help_key_up");
          si.field_D = ki.field_b.e();
          si.field_D.i();
          fk.field_l = si.field_D.e();
          fk.field_l.i();
          lc.field_s = fk.field_l.e();
          lc.field_s.i();
          dh.field_R[0] = eh.a("", (byte) -66, kf.field_d, "game_interface_weapon_gatling_gun");
          dh.field_R[1] = eh.a("", (byte) -33, kf.field_d, "game_interface_weapon_bomb");
          dh.field_R[param0] = eh.a("", (byte) -45, kf.field_d, "game_interface_weapon_sonic");
          dh.field_R[3] = eh.a("", (byte) -25, kf.field_d, "game_interface_weapon_missile");
          al.field_a[0] = eh.a("", (byte) -48, kf.field_d, "tutorial_dp_happy");
          al.field_a[1] = eh.a("", (byte) -27, kf.field_d, "tutorial_dp_det");
          al.field_a[2] = eh.a("", (byte) -103, kf.field_d, "tutorial_cp_happy");
          al.field_a[3] = eh.a("", (byte) -113, kf.field_d, "tutorial_cp_det");
          ca.field_W = la.a("", kf.field_d, "frame", -82);
          ch.field_z = la.a("", kf.field_d, "frame_button", -53);
          ee.field_c = la.a("", kf.field_d, "frame_button_dn", -54);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "DrPhlogistonSavesTheEarth.BB(" + param0 + ')');
        }
    }

    private final void i(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_D ? 1 : 0;
        try {
          we.a(qa.field_O, -105, 78.0f);
          ph.field_a = ij.a("alientripod", (byte) 69, kf.field_d, "");
          af.field_e = new he[ph.field_a.length];
          var2_int = 0;
          do {
            if (!(ph.field_a.length > var2_int)) {
              ib.field_u = ij.a("alienprobe", (byte) 77, kf.field_d, "");
              bg.field_t = ij.a("aliendeathprobe", (byte) 73, kf.field_d, "");
              dh.field_S = ij.a("aliendeathglider", (byte) 113, kf.field_d, "");
              mj.field_w = this.a((byte) -105, dh.field_S);
              wd.field_f = ij.a("aliendoomglider", (byte) 114, kf.field_d, "");
              fa.field_n = ij.a("alienshredder", (byte) 118, kf.field_d, "");
              t.field_c = ij.a("alienassaultbot", (byte) 127, kf.field_d, "");
              cm.field_Q = ij.a("aliendropship", (byte) 58, kf.field_d, "");
              od.field_i = ij.a("alienspacemine", (byte) 101, kf.field_d, "");
              uf.field_j = ij.a("alienspacemineseeking", (byte) 89, kf.field_d, "");
              ng.field_f = ij.a("alienparamine", (byte) 112, kf.field_d, "");
              jd.field_M = ij.a("alienminer", (byte) 77, kf.field_d, "");
              vd.field_g = ij.a("alienminer_door", (byte) 63, kf.field_d, "");
              we.field_b = be.b(eh.a("", (byte) -36, kf.field_d, "alienasteroid_1"), 64);
              ee.field_b = be.b(eh.a("", (byte) -92, kf.field_d, "alienasteroid_2"), 64);
              ae.field_lb = be.b(eh.a("", (byte) -81, kf.field_d, "alienasteroid_3"), 64);
              ad.field_s = ij.a("alienbattlecarrier", (byte) 54, kf.field_d, "");
              ib.field_r = ij.a("alienbattlecarrier_side_arms", (byte) 85, kf.field_d, "");
              mi.field_i = ij.a("alienbattlecarrier_middle_arms", (byte) 90, kf.field_d, "");
              fa.field_k = ij.a("alienbunker", (byte) 123, kf.field_d, "");
              ub.field_a = be.a(eh.a("", (byte) -111, kf.field_d, "alienbunker_rubble"), fa.field_k.length);
              ib.field_j = new he[fa.field_k.length];
              rh.field_l = new he[fa.field_k.length];
              break;
            }
            ph.field_a[var2_int].c();
            af.field_e[var2_int] = ph.field_a[var2_int].a();
            var2_int++;
          } while (var3 == 0);
          var2_int = 0;
          do {
            if (!(var2_int < ib.field_j.length)) {
              lb.field_C.a(100);
              wk.field_m = ij.a("alienbunker_big", (byte) 123, kf.field_d, "");
              this.a(99, wk.field_m);
              break;
            }
            fa.field_k[var2_int].c();
            ub.field_a[var2_int].c();
            ib.field_j[var2_int] = fa.field_k[var2_int].e();
            ib.field_j[var2_int].c(128);
            rh.field_l[var2_int] = ub.field_a[var2_int].e();
            rh.field_l[var2_int].c(128);
            var2_int++;
          } while (var3 == 0);
          if (param0 >= -110) {
            this.field_C = false;
          }
          qb.field_a = be.a(eh.a("", (byte) -80, kf.field_d, "alienbunker_big_rubble"), wk.field_m.length);
          this.a(85, qb.field_a);
          uk.field_b = be.a(eh.a("", (byte) -34, kf.field_d, "alienbunker_big_fire_mask"), wk.field_m.length);
          this.a(99, uk.field_b);
          j.field_db = ij.a("aliencombattank", (byte) 105, kf.field_d, "");
          var2_int = 0;
          do {
            if (!(j.field_db.length > var2_int)) {
              jj.field_a = be.a(eh.a("", (byte) -110, kf.field_d, "aliencombattank_rubble"), j.field_db.length);
              break;
            }
            j.field_db[var2_int].c();
            var2_int++;
          } while (var3 == 0);
          var2_int = 0;
          do {
            if (!(var2_int < jj.field_a.length)) {
              mk.field_e = ij.a("alienbattletank", (byte) 62, kf.field_d, "");
              break;
            }
            jj.field_a[var2_int].c();
            var2_int++;
          } while (var3 == 0);
          var2_int = 0;
          do {
            if (!(var2_int < mk.field_e.length)) {
              nc.field_I = be.a(eh.a("", (byte) -42, kf.field_d, "alienbattletank_rubble"), mk.field_e.length);
              break;
            }
            mk.field_e[var2_int].c();
            var2_int++;
          } while (var3 == 0);
          var2_int = 0;
          while (nc.field_I.length > var2_int) {
            nc.field_I[var2_int].c();
            var2_int++;
            if (var3 != 0) {
              return;
            }
          }
          pf.field_c = ij.a("alienattackcopter", (byte) 113, kf.field_d, "");
          wd.field_a = ij.a("aliendoomcopter", (byte) 118, kf.field_d, "");
          sd.field_c = ij.a("alienflyingbattlestation", (byte) 111, kf.field_d, "");
          ff.field_R = ij.a("alienalienbattleship", (byte) 84, kf.field_d, "");
          nj.field_d = ij.a("alien_meteor", (byte) 82, kf.field_d, "");
          wi.field_c = ij.a("alien_abductor", (byte) 94, kf.field_d, "");
          wa.field_O = ij.a("scenery_tile_tesla_coil", (byte) 64, kf.field_d, "");
          u.field_a = this.a(-1745, 2, eh.a("", (byte) -55, kf.field_d, "scenery_tile_tesla_coil_broken"));
          this.a(122, u.field_a);
          jk.field_H = this.a(wa.field_O, 65793);
          si.field_G = this.a(u.field_a, 65793);
          eh.field_b = ij.a("alien_cargo_ship", (byte) 101, kf.field_d, "");
          pj.field_B[0] = ij.a("scenery_tile_mothership_girder_1", (byte) 89, kf.field_d, "");
          pj.field_B[1] = ij.a("scenery_tile_mothership_girder_2", (byte) 110, kf.field_d, "");
          pj.field_B[2] = ij.a("scenery_tile_mothership_girder_3", (byte) 116, kf.field_d, "");
          nl.field_n[0] = ij.a("scenery_tile_mothership_background_1", (byte) 72, kf.field_d, "");
          nl.field_n[1] = ij.a("scenery_tile_mothership_window", (byte) 78, kf.field_d, "");
          nl.field_n[2] = ij.a("scenery_tile_mothership_background_3", (byte) 107, kf.field_d, "");
          kc.field_l = ij.a("scenery_tile_mothership_antennae_yagi", (byte) 54, kf.field_d, "");
          ta.field_d = ij.a("scenery_tile_mothership_antennae_parabolic", (byte) 109, kf.field_d, "");
          m.field_a = ij.a("scenery_tile_mothership_antennae_yagi_broken", (byte) 90, kf.field_d, "");
          ki.field_a = ij.a("scenery_tile_mothership_antennae_parabolic_broken", (byte) 83, kf.field_d, "");
          hc.field_M[0] = ij.a("scenery_tile_mothership_platform_1", (byte) 110, kf.field_d, "");
          hc.field_M[1] = ij.a("scenery_tile_mothership_platform_2", (byte) 102, kf.field_d, "");
          hc.field_M[2] = ij.a("scenery_tile_mothership_platform_3", (byte) 72, kf.field_d, "");
          kk.field_b[0] = ij.a("scenery_tile_mothership_scenery_1", (byte) 64, kf.field_d, "");
          kk.field_b[1] = ij.a("scenery_tile_mothership_scenery_2", (byte) 82, kf.field_d, "");
          lf.field_e[0] = ij.a("scenery_tile_mothership_scenery_1_broken", (byte) 118, kf.field_d, "");
          lf.field_e[1] = ij.a("scenery_tile_mothership_scenery_2_broken", (byte) 68, kf.field_d, "");
          this.a(kk.field_b[0], 0, lf.field_e[0]);
          this.a(kk.field_b[1], 0, lf.field_e[1]);
          ca.field_bb = ij.a("scenery_tile_mothership_docking_platform", (byte) 82, kf.field_d, "");
          sf.field_m = ij.a("scenery_tile_mothership_gun_turret_base", (byte) 83, kf.field_d, "");
          sf.field_m[0].c();
          lc.field_i = be.b(eh.a("", (byte) -26, kf.field_d, "scenery_tile_mothership_gun_turret"), 32);
          bh.field_b = new he[1];
          bh.field_b[0] = sf.field_m[0].e();
          bh.field_b[0].f();
          bh.field_b[0].c();
          sj.field_f = sf.field_m;
          jk.field_I = be.b(eh.a("", (byte) -47, kf.field_d, "scenery_tile_mothership_missile_launcher"), 32);
          qf.field_g = this.a(-1745, 4, eh.a("", (byte) -78, kf.field_d, "scenery_tile_mothership_docking_platform_broken"));
          qg.field_W = ij.a("scenery_tile_mothership_gun_turret_broken", (byte) 114, kf.field_d, "");
          tl.field_I = new he[1];
          tl.field_I[0] = qg.field_W[0].e();
          tl.field_I[0].f();
          eg.field_f = qg.field_W;
          le.field_b = ij.a("scenery_tile_smokestack", (byte) 114, kf.field_d, "");
          ck.field_k = ij.a("scenery_tile_smokestack_broken", (byte) 59, kf.field_d, "");
          le.field_b[0].c();
          ck.field_k[0].c();
          ad.field_v = new he[1];
          bh.field_e = new he[1];
          ad.field_v[0] = le.field_b[0].a();
          bh.field_e[0] = ck.field_k[0].a();
          this.a(124, pj.field_B[0]);
          this.a(97, pj.field_B[1]);
          this.a(97, pj.field_B[2]);
          this.a(98, nl.field_n[0]);
          this.a(91, nl.field_n[1]);
          this.a(118, nl.field_n[2]);
          this.a(118, kc.field_l);
          this.a(99, ta.field_d);
          this.a(107, m.field_a);
          this.a(121, ki.field_a);
          this.a(82, hc.field_M[0]);
          this.a(98, hc.field_M[1]);
          this.a(127, hc.field_M[2]);
          this.a(95, ph.field_c[0]);
          this.a(98, ph.field_c[1]);
          this.a(82, ph.field_c[2]);
          this.a(102, ca.field_bb);
          this.a(86, sf.field_m);
          this.a(107, sj.field_f);
          this.a(81, qf.field_g);
          this.a(99, qg.field_W);
          this.a(98, eg.field_f);
          oi.field_a = ij.a("human_abductee_male", (byte) 67, kf.field_d, "");
          cc.field_y = ij.a("human_abductee_female", (byte) 87, kf.field_d, "");
          og.field_e = ij.a("human_abductee_baby", (byte) 95, kf.field_d, "");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) runtimeException), "DrPhlogistonSavesTheEarth.DB(" + param0 + ')');
        }
    }

    public DrPhlogistonSavesTheEarth() {
        this.field_H = 0;
        this.field_C = false;
    }

    private final boolean b(boolean param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = field_D ? 1 : 0;
        try {
          if (null != aa.field_b) {
            if (aa.field_b.a(0) &&
              aa.field_b.c((byte) 79)) {
              if (ua.field_b.a(0) &&
                ua.field_b.c((byte) 21)) {
                if (ui.field_a.a(0) &&
                  ui.field_a.c((byte) 56)) {
                  if (df.field_a.a(0) &&
                    df.field_a.c((byte) 53)) {
                    if (kf.field_d.a(0) &&
                      kf.field_d.c((byte) 84)) {
                      if (mh.field_a.a(0) &&
                        mh.field_a.c((byte) 64)) {
                        if (ff.field_P.a(0) &&
                          ff.field_P.c((byte) 109)) {
                          if (ph.field_b.a(0) &&
                            ph.field_b.a(255, "basic")) {
                            if (!param0) {
                              return false;
                            }
                            bh.b(77);
                            cf.field_c = new cf(aa.field_b, ua.field_b);
                            qk.field_g = new ng(22050, id.field_d);
                            this.j((byte) -30);
                            aa.field_b = null;
                            return false;
                          }
                          we.a(qg.a(td.field_o, sa.field_b, 34, "basic", ph.field_b), -118, 48.0f);
                          return false;
                        }
                        we.a(qg.a(bh.field_d, ij.field_a, 34, "", ff.field_P), -127, 45.0f);
                        return false;
                      }
                      we.a(qg.a(l.field_s, hl.field_e, 34, "", mh.field_a), -115, 40.0f);
                      return false;
                    }
                    we.a(qg.a(td.field_o, sa.field_b, 34, "", kf.field_d), -118, 18.0f);
                    return false;
                  }
                  we.a(qg.a(qd.field_Fb, r.field_a, 34, "", df.field_a), -105, 13.0f);
                  return false;
                }
                we.a(hj.a(qd.field_Fb, ui.field_a, r.field_a, 0, 17733), -83, 10.0f);
                return false;
              }
              we.a(qg.a(wi.field_h, ig.field_o, 34, "", ua.field_b), -105, 8.0f);
              return false;
            }
            we.a(qg.a(wi.field_h, ig.field_o, 34, "", aa.field_b), -88, 5.0f);
            return false;
          }
          if (null != ua.field_b) {
            qk.field_g = null;
            ua.field_b = null;
            tc.a((byte) 86);
            return false;
          }
          if (null != df.field_a) {
            we.a(ai.field_x, -83, 55.0f);
            this.h(0);
            ad.field_q = ok.a(df.field_a, "", "Dr_Phlogiston_Title");
            s.field_a.a(0, ui.field_a, 0, ad.field_q, cf.field_c);
            ki.field_c = ok.a(df.field_a, "", "Dr_Phlogiston_Earth");
            s.field_a.a(0, ui.field_a, 0, ki.field_c, cf.field_c);
            hi.field_l = ok.a(df.field_a, "", "Dr_Phlogiston_Space");
            s.field_a.a(0, ui.field_a, 0, hi.field_l, cf.field_c);
            le.field_e = ok.a(df.field_a, "", "Dr_Phlogiston_Alien");
            s.field_a.a(0, ui.field_a, 0, le.field_e, cf.field_c);
            lh.field_l = ok.a(df.field_a, "", "Dr_Phlogiston_Boss_Break");
            dm.field_x = ok.a(df.field_a, "", "Dr_Phlogiston_GameOver_jingle");
            s.field_a.a(0, ui.field_a, 0, dm.field_x, cf.field_c);
            ml.field_l = ok.a(df.field_a, "", "Dr_Phlogiston_GameComplete_jingle");
            s.field_a.a(0, ui.field_a, 0, ml.field_l, cf.field_c);
            s.field_a.b((byte) 47);
            cf.field_c = null;
            df.field_a = null;
            ui.field_a = null;
            tc.a((byte) 86);
            return false;
          }
          if (null != kf.field_d) {
            if (this.field_H == 0) {
              this.h((byte) -83);
            }
            if (this.field_H == 1) {
              this.r(2);
            }
            if (2 == this.field_H) {
              this.k((byte) 22);
            }
            if (this.field_H == 3) {
              this.q(-11666);
            }
            if (this.field_H == 4) {
              this.i((byte) -125);
            }
            if (this.field_H == 5) {
              this.d(true);
            }
            if (this.field_H == 6) {
              this.o(125);
            }
            if (this.field_H == 7) {
              this.s(-23796);
            }
            if (this.field_H == 8) {
              kf.field_d = null;
            }
            this.field_H = this.field_H + 1;
            tc.a((byte) 86);
            return false;
          }
          if (null != mh.field_a) {
            var3_int = 0;
            do {
              if (var3_int >= 9) {
                mh.field_a = null;
                tc.a((byte) 86);
                break;
              }
              bi.field_K[var3_int] = new mk(mh.field_a.a("", "AchirdAttacks_level_" + (1 + var3_int) + ".lvl", 24874), var3_int % 3 + 1);
              var3_int++;
            } while (var10 == 0);
            return false;
          }
          var3_int = 0;
          do {
            if (13 <= var3_int) {
              hl.field_f = 0;
              s.c((byte) 88);
              var3_int = 3072;
              break;
            }
            th.field_a[var3_int] = new ld(var3_int);
            var3_int++;
          } while (var10 == 0);
          var4 = 30;
          var5 = 15;
          var6 = 10;
          var7 = -2;
          var8 = v.field_Y.field_y - 20;
          var9 = v.field_Y.field_w - 20;
          gl.a(var9, var8, (byte) -96, var5, var4, v.field_Y, var7, var6, var3_int);
          gg.a(1000, cm.field_R);
          bi.a(ml.field_j, 121, nc.field_M);
          if (param1 > -91) {
            field_L = (String) null;
          }
          pi.a(eb.field_g, 21914);
          wb.a((java.applet.Applet) (this), 2, 1052688, 150, ej.field_e, 15488514);
          ah.a((byte) 109, 50);
          k.a(0, 50);
          if (!oh.a(0)) {
            ri.field_f = ge.a(4, (byte) -79);
            vi.field_c = ck.a(0, 5, 1, true);
          }
          tc.a((byte) 86);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var3), "DrPhlogistonSavesTheEarth.FB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void q(int param0) {
        nh dupTemp$1 = null;
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = field_D ? 1 : 0;
        try {
          we.a(qa.field_O, -103, 73.0f);
          bc.field_d = new nh(50, 300);
          q.field_f = new he(50, 300, 2);
          var2_int = q.field_f.field_d * 260;
          var3 = -1 + q.field_f.field_m.length;
          var4 = var2_int;
          do {
            if (var3 < var4) {
              v.field_O = new nh(640, 430);
              v.field_O.c();
              var4 = 336 * wj.field_k;
              break;
            }
            q.field_f.field_m[var4] = (byte) 1;
            var4++;
          } while (var6 == 0);
          var5 = 0;
          do {
            if (var5 >= 2000) {
              var5 = 0;
              break;
            }
            wj.field_l[hi.a(var4, param0 + 11670, pd.field_c)] = 65793 * (hi.a(254, 4, pd.field_c) + 1);
            var5++;
          } while (var6 == 0);
          do {
            if (430 <= var5) {
              lb.field_C.a(125);
              nb.field_b = new nh(640, 430);
              nb.field_b.c();
              break;
            }
            wj.e(0, var5, 640, 258 * ((9 + var5) / 7), (var5 + 435) / 3);
            var5++;
          } while (var6 == 0);
          var5 = 0;
          do {
            if (var5 >= 1500) {
              var5 = 0;
              break;
            }
            wj.field_l[hi.a(wj.field_l.length, qk.a(param0, -11670), pd.field_c)] = hi.a(256, 4, pd.field_c) * 65793;
            var5++;
          } while (var6 == 0);
          do {
            if (var5 >= 500) {
              var5 = 0;
              break;
            }
            wj.field_l[hi.a(wj.field_l.length, 4, pd.field_c)] = 131329 * hi.a(128, 4, pd.field_c);
            var5++;
          } while (var6 == 0);
          do {
            if (var5 >= 500) {
              lb.field_C.a(96);
              sg.field_e = eh.a("", (byte) -103, kf.field_d, "background_bath");
              uk.field_h = eh.a("", (byte) -52, kf.field_d, "background_london");
              oi.field_f = eh.a("", (byte) -121, kf.field_d, "background_brighton");
              nj.field_o = eh.a("", (byte) -97, kf.field_d, "midground_earth");
              hc.field_K = cl.a("", kf.field_d, -116, "background_space");
              dupTemp$1 = hc.field_K[1];
              dupTemp$1.field_D = dupTemp$1.field_D + 800;
              break;
            }
            wj.field_l[hi.a(wj.field_l.length, 4, pd.field_c)] = hi.a(128, 4, pd.field_c) * 65794;
            var5++;
          } while (var6 == 0);
          if (param0 != -11666) {
            return;
          }
          sh.field_b = qk.a("", kf.field_d, "midground_space", true);
          vi.field_g = eh.a("", (byte) -111, kf.field_d, "background_alien");
          gb.field_e = eh.a("", (byte) -79, kf.field_d, "background_alien_8");
          ha.field_b = eh.a("", (byte) -112, kf.field_d, "background_alien_9");
          q.field_e = qk.a("", kf.field_d, "scenery_earth_background_clouds_lit", true);
          kl.field_R[0] = qk.a("", kf.field_d, "scenery_space_background_asteroid_1", true);
          kl.field_R[1] = qk.a("", kf.field_d, "scenery_space_background_asteroid_2", true);
          kl.field_R[2] = qk.a("", kf.field_d, "scenery_space_background_asteroid_3", true);
          kl.field_R[3] = qk.a("", kf.field_d, "scenery_space_background_asteroid_4", true);
          kl.field_R[4] = qk.a("", kf.field_d, "scenery_space_background_asteroid_5", true);
          si.field_F = qk.a("", kf.field_d, "background_space_comet", true);
          cc.field_w = eh.a("", (byte) -89, kf.field_d, "midground_alien");
          b.field_k = eh.a("", (byte) -45, kf.field_d, "midground_alien_8");
          nf.field_v = eh.a("", (byte) -77, kf.field_d, "midground_alien_9");
          kh.field_e = eh.a("", (byte) -116, kf.field_d, "playership");
          kh.field_e.d(3);
          ri.field_e = kh.field_e.field_k;
          am.field_l = kh.field_e.field_d;
          am.field_p = am.field_l / 2;
          ri.field_q = ri.field_e / 2;
          df.field_f = this.a(eh.a("", (byte) -85, kf.field_d, "scenery_tile_earth_1"), (byte) 88);
          ah.field_L = this.a(eh.a("", (byte) -118, kf.field_d, "scenery_tile_earth_2"), (byte) 103);
          mk.field_f = this.a(eh.a("", (byte) -120, kf.field_d, "scenery_tile_earth_3"), (byte) -60);
          qg.field_U = this.a(eh.a("", (byte) -126, kf.field_d, "scenery_tile_earth_4"), (byte) 24);
          bf.field_v = this.a(eh.a("", (byte) -106, kf.field_d, "scenery_tile_earth_5"), (byte) 113);
          vg.field_h = this.a(eh.a("", (byte) -55, kf.field_d, "scenery_tile_earth_6"), (byte) -124);
          rg.field_a = this.a(eh.a("", (byte) -29, kf.field_d, "scenery_tile_earth_7"), (byte) 120);
          fi.field_e = this.a(eh.a("", (byte) -127, kf.field_d, "scenery_tile_earth_8"), (byte) -29);
          jd.field_Q = this.a(eh.a("", (byte) -82, kf.field_d, "scenery_tile_earth_9"), (byte) 118);
          r.field_e = this.a(eh.a("", (byte) -49, kf.field_d, "scenery_tile_earth_10"), (byte) 127);
          nf.field_s = ij.a("scenery_tile_earth_11", (byte) 99, kf.field_d, "");
          nf.field_s[0].c();
          pc.field_c = new he[1];
          pc.field_c[0] = nf.field_s[0].e();
          pc.field_c[0].g();
          rh.field_f = this.a(eh.a("", (byte) -109, kf.field_d, "scenery_tile_earth_1_rubble"), (byte) -34);
          sd.field_d = this.a(eh.a("", (byte) -112, kf.field_d, "scenery_tile_earth_2_rubble"), (byte) 110);
          tb.field_b = this.a(eh.a("", (byte) -78, kf.field_d, "scenery_tile_earth_3_rubble"), (byte) -20);
          qf.field_e = this.a(eh.a("", (byte) -36, kf.field_d, "scenery_tile_earth_4_rubble"), (byte) -48);
          dm.field_z = this.a(eh.a("", (byte) -76, kf.field_d, "scenery_tile_earth_5_rubble"), (byte) -23);
          qd.field_Cb = this.a(eh.a("", (byte) -107, kf.field_d, "scenery_tile_earth_6_rubble"), (byte) 90);
          gm.field_L = this.a(eh.a("", (byte) -77, kf.field_d, "scenery_tile_earth_7_rubble"), (byte) -97);
          rb.field_c = this.a(eh.a("", (byte) -57, kf.field_d, "scenery_tile_earth_8_rubble"), (byte) -40);
          sc.field_a = this.a(eh.a("", (byte) -61, kf.field_d, "scenery_tile_earth_9_rubble"), (byte) 103);
          rd.field_A = this.a(eh.a("", (byte) -29, kf.field_d, "scenery_tile_earth_10_rubble"), (byte) -77);
          re.field_i = ij.a("scenery_tile_earth_11_rubble", (byte) 84, kf.field_d, "");
          re.field_i[0].c();
          re.field_h = new he[1];
          re.field_h[0] = re.field_i[0].e();
          re.field_h[0].g();
          dm.field_y = this.a(eh.a("", (byte) -69, kf.field_d, "scenery_tile_earth_1_fire_mask"), (byte) 105);
          wh.field_u = this.a(eh.a("", (byte) -31, kf.field_d, "scenery_tile_earth_2_fire_mask"), (byte) -120);
          ng.field_b = this.a(eh.a("", (byte) -68, kf.field_d, "scenery_tile_earth_3_fire_mask"), (byte) 17);
          g.field_q = this.a(eh.a("", (byte) -70, kf.field_d, "scenery_tile_earth_4_fire_mask"), (byte) -124);
          pj.field_z = this.a(eh.a("", (byte) -123, kf.field_d, "scenery_tile_earth_5_fire_mask"), (byte) 98);
          tl.field_Q = this.a(eh.a("", (byte) -108, kf.field_d, "scenery_tile_earth_6_fire_mask"), (byte) -7);
          ld.field_d = this.a(eh.a("", (byte) -71, kf.field_d, "scenery_tile_earth_7_fire_mask"), (byte) 1);
          eb.field_c = this.a(eh.a("", (byte) -61, kf.field_d, "scenery_tile_earth_8_fire_mask"), (byte) -28);
          ri.field_h = this.a(eh.a("", (byte) -53, kf.field_d, "scenery_tile_earth_9_fire_mask"), (byte) 119);
          el.field_vb = this.a(eh.a("", (byte) -25, kf.field_d, "scenery_tile_earth_10_fire_mask"), (byte) -126);
          bk.field_j = ij.a("scenery_tile_earth_11_fire_mask", (byte) 73, kf.field_d, "");
          bk.field_j[0].c();
          ik.field_f = new he[1];
          ik.field_f[0] = bk.field_j[0].e();
          ik.field_f[0].g();
          fa.field_m = this.a(eh.a("", (byte) -30, kf.field_d, "scenery_tile_earth_bath_01"), (byte) -35);
          we.field_c = this.a(eh.a("", (byte) -107, kf.field_d, "scenery_tile_earth_bath_02"), (byte) -7);
          d.field_c = ij.a("scenery_tile_earth_bath_03", (byte) 115, kf.field_d, "");
          d.field_c[0].c();
          ek.field_l = this.a(eh.a("", (byte) -89, kf.field_d, "scenery_tile_earth_bath_04"), (byte) -110);
          oj.field_g = this.a(eh.a("", (byte) -117, kf.field_d, "scenery_tile_earth_bath_05"), (byte) -24);
          mh.field_g = this.a(eh.a("", (byte) -58, kf.field_d, "scenery_tile_earth_bath_06"), (byte) 101);
          u.field_c = this.a(eh.a("", (byte) -93, kf.field_d, "scenery_tile_earth_bath_07"), (byte) 112);
          ai.field_y = this.a(eh.a("", (byte) -43, kf.field_d, "scenery_tile_earth_bath_08"), (byte) 117);
          bk.field_d = this.a(eh.a("", (byte) -80, kf.field_d, "scenery_tile_earth_bath_09"), (byte) 23);
          ek.field_t = this.a(eh.a("", (byte) -59, kf.field_d, "scenery_tile_earth_bath_10"), (byte) 103);
          hh.field_c = ij.a("scenery_tile_earth_bath_11", (byte) 71, kf.field_d, "");
          hh.field_c[0].c();
          lk.field_m = new he[1];
          lk.field_m[0] = hh.field_c[0].e();
          lk.field_m[0].g();
          gi.field_d = ij.a("scenery_tile_earth_bath_01_broken", (byte) 108, kf.field_d, "");
          gi.field_d[0].c();
          lc.field_q = ij.a("scenery_tile_earth_bath_02_broken", (byte) 92, kf.field_d, "");
          lc.field_q[0].c();
          ca.field_V = ij.a("scenery_tile_earth_bath_03_broken", (byte) 86, kf.field_d, "");
          ca.field_V[0].c();
          ac.field_g = ij.a("scenery_tile_earth_bath_04_broken", (byte) 109, kf.field_d, "");
          ac.field_g[0].c();
          df.field_k = this.a(eh.a("", (byte) -59, kf.field_d, "scenery_tile_earth_bath_05_broken"), (byte) -88);
          sl.field_x = ij.a("scenery_tile_earth_bath_06_broken", (byte) 80, kf.field_d, "");
          sl.field_x[0].c();
          qj.field_a = this.a(eh.a("", (byte) -81, kf.field_d, "scenery_tile_earth_bath_07_broken"), (byte) 102);
          og.field_c = ij.a("scenery_tile_earth_bath_08_broken", (byte) 120, kf.field_d, "");
          og.field_c[0].c();
          ck.field_d = this.a(eh.a("", (byte) -39, kf.field_d, "scenery_tile_earth_bath_09_broken"), (byte) 89);
          field_G = this.a(eh.a("", (byte) -71, kf.field_d, "scenery_tile_earth_bath_10_broken"), (byte) 7);
          qa.field_S = ij.a("scenery_tile_earth_bath_11_broken", (byte) 61, kf.field_d, "");
          qa.field_S[0].c();
          nf.field_p = new he[1];
          nf.field_p[0] = hh.field_c[0].e();
          nf.field_p[0].g();
          eb.field_a = ij.a("scenery_tile_earth_bath_01_fire_mask", (byte) 121, kf.field_d, "");
          eb.field_a[0].c();
          wb.field_b = ij.a("scenery_tile_earth_bath_02_fire_mask", (byte) 108, kf.field_d, "");
          wb.field_b[0].c();
          cm.field_L = ij.a("scenery_tile_earth_bath_03_fire_mask", (byte) 75, kf.field_d, "");
          cm.field_L[0].c();
          ca.field_Y = ij.a("scenery_tile_earth_bath_04_fire_mask", (byte) 106, kf.field_d, "");
          ca.field_Y[0].c();
          oj.field_f = ij.a("scenery_tile_earth_bath_05_fire_mask", (byte) 114, kf.field_d, "");
          oj.field_f[0].c();
          ld.field_f = ij.a("scenery_tile_earth_bath_06_fire_mask", (byte) 60, kf.field_d, "");
          ld.field_f[0].c();
          cf.field_g = this.a(eh.a("", (byte) -48, kf.field_d, "scenery_tile_earth_bath_07_fire_mask"), (byte) 101);
          cf.field_g[0].c();
          ri.field_r = ij.a("scenery_tile_earth_bath_08_fire_mask", (byte) 62, kf.field_d, "");
          ri.field_r[0].c();
          cl.field_n = ij.a("scenery_tile_earth_bath_09_fire_mask", (byte) 102, kf.field_d, "");
          cl.field_n[0].c();
          kj.field_g = ij.a("scenery_tile_earth_bath_10_fire_mask", (byte) 120, kf.field_d, "");
          kj.field_g[0].c();
          ei.field_k = ij.a("scenery_tile_earth_bath_11_fire_mask", (byte) 125, kf.field_d, "");
          ei.field_k[0].c();
          ij.field_e = new he[1];
          ij.field_e[0] = ei.field_k[0].e();
          ij.field_e[0].g();
          vc.field_b = ij.a("scenery_tile_alien_1", (byte) 107, kf.field_d, "");
          ij.field_d = ij.a("scenery_tile_alien_2", (byte) 103, kf.field_d, "");
          db.field_b = ij.a("scenery_tile_alien_3", (byte) 112, kf.field_d, "");
          kf.field_e = ij.a("scenery_tile_alien_4", (byte) 72, kf.field_d, "");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) runtimeException), "DrPhlogistonSavesTheEarth.HB(" + param0 + ')');
        }
    }

    static {
        field_L = "Resume Game";
        field_E = "Retry";
        field_F = new vd();
    }
}
