/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class AceOfSkies extends NetworkGameClient {
    static volatile boolean field_J;
    public static boolean obfuscationControl;

    public final void init() {
        try {
          this.a((byte) -60, "aceofskies", 13);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "AceOfSkies.init()");
        }
    }

    private final boolean a(byte param0, boolean param1) {
        Object stackIn_109_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        var5 = obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          var3_int = -35 / ((param0 - 1) / 48);
          qq.a((byte) -100);
          if (jk.field_b != null) {
            if (hg.field_x.b((byte) 95) &&
              hg.field_x.c("basic", -14012)) {
              if (!hg.field_x.c("arialbold14", -14012)) {
                fh.a(-124, 4.0f, qo.a(bk.field_g, "arialbold14", hg.field_x, 13525, ks.field_c));
                return false;
              }
              if (fg.field_t.b((byte) -119) &&
                fg.field_t.c("arialbold14", -14012)) {
                if (!hg.field_x.c("arial13", -14012)) {
                  fh.a(-65, 4.0f, qo.a(bk.field_g, "arial13", hg.field_x, 13525, ks.field_c));
                  return false;
                }
                if (fg.field_t.b((byte) -127) &&
                  fg.field_t.c("arial13", -14012)) {
                  if (jk.field_b.b((byte) 100) &&
                    jk.field_b.b(0)) {
                    if (ub.field_f.b((byte) -73) &&
                      ub.field_f.b(0)) {
                      if (ot.field_b.b((byte) 87) &&
                        ot.field_b.b(0)) {
                        if (od.field_x.b((byte) -57) &&
                          od.field_x.b(0)) {
                          if (wi.field_a.b((byte) 92) &&
                            wi.field_a.b(0)) {
                            if (iq.field_e.b((byte) -111) &&
                              iq.field_e.b(0)) {
                              fh.a(-112, 65.0f, er.field_c);
                              this.renderGame(150);
                              decompiledFrameRemainder0 = !(param1);
                              if (decompiledFrameRemainder0) {
                                return false;
                              }
                            }
                            if (decompiledFrameRemainder0) {
                              fh.a(-117, 55.0f, qo.a(bk.field_g, "", iq.field_e, 13525, ks.field_c));
                              return false;
                            }
                          }
                          if (decompiledFrameRemainder0) {
                            fh.a(-91, 45.0f, qo.a(co.field_j, "", wi.field_a, 13525, lm.field_b));
                            return false;
                          }
                        }
                        if (decompiledFrameRemainder0) {
                          fh.a(-65, 40.0f, qo.a(rq.field_a, "", od.field_x, 13525, ei.field_c));
                          return false;
                        }
                      }
                      if (decompiledFrameRemainder0) {
                        fh.a(-117, 30.0f, SmokeParticle.a(ff.field_a, 0, fn.field_b, ot.field_b, 81));
                        return false;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      fh.a(-99, 20.0f, qo.a(pr.field_a, "", ub.field_f, 13525, ResourceArchive.field_c));
                      return false;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    fh.a(-86, 10.0f, qo.a(pr.field_a, "", jk.field_b, 13525, ResourceArchive.field_c));
                    return false;
                  }
                }
                if (decompiledFrameRemainder0) {
                  fh.a(-46, 5.0f, qo.a(bk.field_g, "arial13", fg.field_t, 13525, ks.field_c));
                  return false;
                }
              }
              if (decompiledFrameRemainder0) {
                fh.a(-86, 5.0f, qo.a(bk.field_g, "arialbold14", fg.field_t, 13525, ks.field_c));
                return false;
              }
            }
            if (decompiledFrameRemainder0) {
              fh.a(-110, 3.0f, qo.a(co.field_j, "basic", hg.field_x, 13525, lm.field_b));
              return false;
            }
          }
          if (jk.field_b != null) {
            as.a(-110);
            qn.field_c = new SoundCache(jk.field_b, ub.field_f);
            jf.a(-4, ub.field_f, jk.field_b);
            jk.field_b = null;
            ub.field_f = null;
            te.a(34);
            return false;
          }
          if (od.field_x != null) {
            tg.field_a = new MusicTrack[3];
            tg.field_a[0] = MusicTrack.a(od.field_x, "", "aos_main_title");
            tg.field_a[1] = MusicTrack.a(od.field_x, "", "aos level_channels_v2");
            tg.field_a[2] = MusicTrack.a(od.field_x, "", "aos boss level");
            od.field_x = null;
            te.a(102);
            return false;
          }
          if (null == ot.field_b) {
            if (hg.field_x != null) {
              pe.a(iq.field_e, (byte) 77, hg.field_x, wi.field_a);
              MenuScreen.a((byte) -56, wi.field_a, iq.field_e);
              iq.field_e = null;
              hg.field_x = null;
              wi.field_a = null;
              ec.a(10, 10, ka.field_a, 40, hn.field_a, bo.field_a, so.field_b, rg.field_F, wt.field_h, sh.field_u >> 1, gp.field_w >> 1, 92, nl.field_t, 10, 20);
              te.a(62);
              return false;
            }
            if (av.a(true)) {
              var4 = 0;
              while (true) {
                if (var4 < 8) {
                  aa.menuScreens[var4] = new MenuScreen(var4);
                  var4++;
                  if (var5 == 0) {
                    continue;
                  }
                } else {
                  po.activeMenuId = 0;
                  tm.b(50, -113);
                }
                break;
              }
              nb.a(10536, 50);
            }
            if (FlightSession.rendererManager.a((byte) 113) == null) {
              FlightSession.rendererManager.a(-23);
              return false;
            }
            ScoreSubmission.a(118);
            sg.flightSession = new FlightSession();
            m.a(tg.field_a[0], 27966, true);
            return true;
          }
          var4Lifetime1 = 0;
          while (true) {
            if (var4Lifetime1 >= 3) {
              var4Lifetime1 = 0;
              break;
            }
            if (var5 == 0) {
              if (tg.field_a[var4Lifetime1] != null &&
                !wt.field_e.field_n.a(-1, 176400, tg.field_a[var4Lifetime1], ot.field_b, qn.field_c)) {
                te.a(74);
                return false;
              }
              var4Lifetime1++;
              continue;
            }
            break;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4Lifetime1 >= 3))) {
            stackIn_109_0 = null;
            if (var5 == 0) {
              if (stackIn_109_0 != tg.field_a[var4Lifetime1] &&
                !wt.field_e.field_p.a(-1, 176400, tg.field_a[var4Lifetime1], ot.field_b, qn.field_c)) {
                te.a(120);
                return false;
              }
              var4Lifetime1++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            wt.field_e.field_n.g(0);
            wt.field_e.field_p.g(0);
            qn.field_c = null;
            stackIn_109_0 = null;
          }
          ot.field_b = (ResourceArchive) (stackIn_109_0);
          te.a(77);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "AceOfSkies.J(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1, fn param2, boolean param3, int param4) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          if (param4 != -12209) {
            return;
          }
          bm.field_w[0] = vr.field_h.nextInt();
          bm.field_w[1] = vr.field_h.nextInt();
          fa.field_c.position = 0;
          bm.field_w[3] = (int)of.field_a;
          bm.field_w[2] = (int)(of.field_a >> 32);
          fa.field_c.writeInt((byte) 50, bm.field_w[0]);
          fa.field_c.writeInt((byte) 41, bm.field_w[1]);
          fa.field_c.writeInt((byte) 113, bm.field_w[2]);
          fa.field_c.writeInt((byte) 45, bm.field_w[3]);
          vi.a((byte) -1, fa.field_c);
          fa.field_c.writeShort(param0, 23385);
          param2.a(fa.field_c, true);
          q.outgoingPacket.position = 0;
          if (param1) {
            q.outgoingPacket.writeByte(-1336879960, 18);
          }
          if (!param1 ||
            obfuscationControl) {
            q.outgoingPacket.writeByte(-1336879960, 16);
          }
          q.outgoingPacket.position = q.outgoingPacket.position + 2;
          var5_int = q.outgoingPacket.position;
          q.outgoingPacket.writeInt((byte) 126, ub.field_g);
          q.outgoingPacket.writeLong((byte) -102, fs.field_a);
          var6 = 0;
          if (te.field_h) {
            var6 = var6 | 1;
          }
          if (HighscoreNameEntry.field_a) {
            var6 = var6 | 4;
          }
          if (param3) {
            var6 = var6 | 8;
          }
          if (fb.field_b != null) {
            var6 = var6 | 16;
          }
          q.outgoingPacket.writeByte(-1336879960, var6);
          var7 = ao.a(bm.m(114), false);
          if (null == var7) {
            var7 = "";
          }
          q.outgoingPacket.a(param4 ^ 12191, var7);
          if (fb.field_b != null) {
            q.outgoingPacket.a(false, fb.field_b);
          }
          gn.a(hp.field_j, pb.field_a, q.outgoingPacket, fa.field_c, param4 + 12313);
          q.outgoingPacket.a(false, q.outgoingPacket.position - var5_int);
          fr.a(param4 + 12171, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("AceOfSkies.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void advanceGame(int obfuscationGuard) {
        int fieldTemp$0 = 0;
        FlightSession stackIn_23_0 = null;
        boolean stackIn_23_1 = false;
        boolean stackIn_24_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = obfuscationControl ? 1 : 0;
        try {
          if (ln.field_d >= 2 &&
            lp.heldKeys[41]) {
            tt.field_a = true;
            hg.field_D = 16777215;
          }
          if (obfuscationGuard != 9046) {
            this.g((byte) -122);
          }
          if (MenuScreen.field_g.first(obfuscationGuard + 268426409) != null) {
            fieldTemp$0 = hp.field_h + 1;
            hp.field_h = hp.field_h + 1;
            if (fieldTemp$0 == 256) {
              hp.field_h = 0;
              MenuScreen.field_g.removeFirst(obfuscationGuard ^ 9001);
            }
          }
          if (bg.field_b == 0) {
            stackIn_23_0 = sg.flightSession;
            stackIn_23_1 = true;
            stackIn_24_2 = (po.activeMenuId == -1);
            ((FlightSession) (Object) stackIn_23_0).advanceSession(stackIn_23_1, stackIn_24_2);
            if (po.activeMenuId != ci.nextMenuId) {
              ec.menuTransitionTicks = ec.menuTransitionTicks + 1;
              if (ec.menuTransitionTicks != 40) {
                return;
              }
              if (po.activeMenuId == 2) {
                ql.activeHighscoreQuery = null;
              }
              po.activeMenuId = ci.nextMenuId;
              ec.menuTransitionTicks = 0;
              if (var3 == 0) {
                return;
              }
            }
            if (-1 == po.activeMenuId) {
              return;
            }
            aa.menuScreens[po.activeMenuId].advanceMenu(-25039);
            if (var3 == 0) {
              return;
            }
          }
          if (bg.field_b == 1) {
            ec.menuTransitionTicks = ec.menuTransitionTicks + 1;
            if (40 != ec.menuTransitionTicks) {
              return;
            }
            if (gi.a(true)) {
              mo.a(-1316);
              if (var3 != 0) {
                qj.c((byte) 9);
              }
            } else {
              qj.c((byte) 9);
            }
            bg.field_b = 2;
            if (var3 == 0) {
              return;
            }
          }
          if (bg.field_b != 2) {
            ec.menuTransitionTicks = ec.menuTransitionTicks - 1;
            if (ec.menuTransitionTicks != 0) {
              return;
            }
            bg.field_b = 0;
            if (var3 == 0) {
              return;
            }
          }
          if (!cn.b(true)) {
            fa.field_b = sc.a(false, 4);
            if (sg.flightSession != null) {
              sg.flightSession.submitFinalScore(-8);
            }
            po.activeMenuId = qo.field_c;
            if (po.activeMenuId == -2) {
              po.activeMenuId = 0;
              ql.a((byte) -103, false);
              if (var3 != 0) {
                po.activeMenuId = ru.field_b;
              }
            }
          } else {
            po.activeMenuId = ru.field_b;
          }
          ec.menuTransitionTicks = 39;
          ci.nextMenuId = po.activeMenuId;
          bg.field_b = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "AceOfSkies.G(" + obfuscationGuard + ')');
        }
    }

    final void a(int param0) {
        RuntimeException runtimeException = null;
        MidiPcmStream var2 = null;
        MidiPcmStream var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(-13, 2, 18, 10, 3, 0, 1);
          var2 = new MidiPcmStream();
          var3 = new MidiPcmStream();
          var2.a(128, false, 9);
          var3.a(128, false, 9);
          wu.a(22050, true, (java.awt.Component) ((Object) ci.field_f), pt.field_b, 32767, new jt(var2, var3));
          if (param0 != 28060) {
            AceOfSkies.a(-33, true, (fn) null, true, 99);
          }
          so.field_b = 16777215;
          hn.field_a = 15632639;
          nl.field_t = 16777215;
          this.a((byte) 62, false, true, true, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "AceOfSkies.I(" + param0 + ')');
        }
    }

    final void d(int param0) {
        RuntimeException runtimeException = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = obfuscationControl ? 1 : 0;
        try {
          iq.a((byte) -126);
          IntrusiveDeque.f(param0 - 39323);
          lp.a((byte) -70);
          bo.a(18598);
          GraphicsRenderer.a(true);
          pd.a(62);
          RendererManager.a(true);
          vl.b(8664);
          ru.a((byte) 76);
          jp.a(true);
          oi.a(2801);
          hu.a((byte) -118);
          bs.a(127);
          tr.a(-79);
          NetworkGameClient.o(param0 ^ -31983);
          ClientException.a(false);
          GameAppletShell.b((byte) 104);
          cc.a(param0 ^ -19469);
          rq.a(param0 ^ 19471);
          qg.a(param0 ^ 19558);
          vp.c();
          ResourceArchive.c((byte) -73);
          nc.a(480);
          so.a((byte) -108);
          PacketBuffer.a(true);
          qh.a(-92);
          hq.a(2483);
          dt.c(13748);
          uj.a((byte) 34);
          ic.a((byte) -122);
          ut.a((byte) 105);
          ho.a((byte) -90);
          kg.a(18567);
          s.a((byte) 125);
          fj.a(param0 - 31434);
          at.a(-7978);
          pj.a((byte) 48);
          ca.b(0);
          ef.a(0);
          SoundCache.a(false);
          MenuScreen.c((byte) 85);
          FlightSession.releaseStaticReferences(32458);
          ji.a(0);
          IntrusiveNode.b(-45);
          un.d(6);
          dk.a(param0 - 19473);
          wq.b(param0 - 34460);
          gh.b(0);
          vf.c((byte) -128);
          BitmapFont.a(5);
          vs.a(126);
          MidiPcmStream.e(-543142776);
          ph.c(82);
          ft.a((byte) 101);
          k.b();
          um.a((byte) 113);
          tk.a();
          rn.a(false);
          MenuInputState.c(-126);
          ou.e(108);
          mg.a(0);
          mf.a((byte) -56);
          hc.a();
          fd.a((byte) 89);
          mm.a((byte) 104);
          ArchiveIndex.a(0);
          ei.a(false);
          ArchiveProvider.a(-61);
          ln.a((byte) -109);
          vu.a(true);
          ur.a(8192);
          ks.a((byte) 109);
          se.a((byte) 123);
          lt.k(110);
          jq.m(85);
          ng.j(11617);
          ad.e(false);
          oo.g((byte) 105);
          wd.h(11663);
          tn.a((byte) -110);
          ce.i(96);
          ep.g(-33);
          cd.c(0);
          sa.a(-128);
          ld.a((byte) 62);
          t.c();
          qn.a(-122);
          Bullet.c(24);
          ScorchMark.a((byte) -44);
          FlightBody.a(true);
          Aircraft.b(20);
          Pickup.b(256);
          SmokeParticle.b(0);
          fb.a((byte) 52);
          CipherPacketBuffer.l((byte) 122);
          we.b(param0 - 19469);
          pu.a(240);
          sg.a((byte) 110);
          tt.a(20525);
          gn.a((byte) -72);
          eo.a((byte) 50);
          fn.a((byte) -5);
          aa.a(0);
          hn.a(0);
          pr.a(param0 - 19552);
          mr.a(0);
          ve.a((byte) 64);
          hb.a(-12029);
          pn.a(9);
          th.a();
          ar.b();
          wt.a(14349);
          df.a(-103);
          er.d(-61);
          gp.c((byte) 78);
          bl.d(-126);
          fg.b((byte) 122);
          fs.a((byte) 117);
          pb.a((byte) -53);
          ag.a((byte) 34);
          nu.a(false);
          re.c();
          nh.a(-101);
          me.a((byte) 127);
          wu.a(true);
          rr.a(6537);
          qs.a((byte) 118);
          wi.a(-80);
          b.a((byte) 28);
          dd.a(param0 ^ -14224);
          v.a(32342);
          td.a(-12546);
          di.a(false);
          es.a(1020);
          GameCanvas.a(true);
          qa.a(-7);
          IntKeyLookup.a(88);
          af.a(-124);
          on.a();
          bd.a(16);
          bb.a(-15388);
          kn.b(-1);
          lj.a(true);
          vi.a(false);
          mi.g(111);
          to.a(0);
          rg.d(true);
          gm.a((byte) -76);
          ab.c(true);
          an.b(32041);
          bg.a(2334);
          wc.a(false);
          jr.a(false);
          op.a(6337);
          gq.a(6408);
          kq.a(param0 - 18291);
          is.a(-92);
          tg.a((byte) 109);
          jm.a(105);
          dp.d((byte) -55);
          rm.a((byte) 127);
          ub.a(false);
          wb.a(true);
          ml.a(0);
          dh.a((byte) -116);
          bt.b(4);
          nq.a(true);
          uh.a(-102);
          bc.j(14912);
          kk.c(true);
          bm.d((byte) -106);
          dg.k(12);
          ek.d(false);
          pi.a(4096);
          kb.h(param0 + 1927864887);
          vo.d(14695);
          fk.a((byte) 28);
          rs.d((byte) 105);
          cn.a(-96);
          pf.b(true);
          ge.a();
          rj.a(true);
          oe.a(param0 ^ 21630);
          lb.b(24);
          ao.a(param0 - 19411);
          wl.y(32598);
          eb.b(64);
          vr.a(116);
          lu.a((byte) -3);
          hp.c((byte) -66);
          jk.a(param0 ^ 14407);
          cs.a(true);
          tm.a(-128);
          tj.b((byte) -95);
          rt.c((byte) -63);
          ee.a(false);
          q.d(-107);
          rl.a(param0 - 32254);
          la.a((byte) -86);
          em.a(true);
          ec.b(0);
          qo.c((byte) 23);
          st.b((byte) -112);
          as.b(param0 - 19344);
          sb.a(126);
          sk.a((byte) 91);
          hr.a(true);
          lm.b(-8192);
          fa.a(false);
          po.c(-30534);
          hd.a(30714);
          jb.a(param0 - 46603);
          ia.a(-6411);
          jc.W(param0 ^ 19581);
          cg.g(-33);
          vg.b(0);
          ku.c(85);
          ot.b((byte) -44);
          hg.j(65793);
          sh.d((byte) -66);
          ej.a(-29373);
          lc.a(true);
          hs.a((byte) -127);
          he.f(param0 ^ param0);
          qj.d((byte) -122);
          mb.g(255);
          av.a((byte) -44);
          iu.a((byte) 119);
          ff.a((byte) 8);
          ui.a();
          ac.a(-28819);
          ka.a((byte) -126);
          r.f(27354);
          du.j(param0 - 19583);
          in.a(true);
          eq.d(-118);
          hh.a(30);
          qe.a(5575);
          nb.b(126);
          gt.e(param0 ^ -19569);
          si.a(true);
          or.a((byte) 63);
          lk.c(34962);
          fu.b((byte) 89);
          om.b(-21649);
          bk.b(66);
          ud.a(false);
          ql.a((byte) -58);
          uf.a((byte) -77);
          ij.b(1822);
          ju.d(122);
          rc.b(param0 ^ -15995);
          np.c(9216);
          ne.b(param0 - 19447);
          g.b(103);
          sd.b(0);
          ci.c((byte) -47);
          aq.a(32683);
          pg.a(true);
          ke.a(param0 - 19345);
          gi.a(-12085);
          ns.a(-24169);
          ol.b(127);
          rp.a(16523);
          cf.f(-95);
          u.b(true);
          ta.b(true);
          ae.c((byte) 15);
          lg.c((byte) -75);
          gg.a(true);
          qd.d(param0 - 12162);
          ai.a(-28739);
          na.a(param0 ^ 21852);
          ik.b(true);
          qp.b(true);
          mh.a(126);
          kf.g(param0 + 5851);
          mo.b(39);
          lo.c((byte) 125);
          io.a(param0 - 52006);
          ua.d(107);
          ro.d((byte) 80);
          tq.b(400);
          pe.a(19592);
          js.a((byte) 116);
          nj.a((byte) -59);
          dc.c(param0 ^ -19509);
          qk.a(0);
          vj.a(1);
          mq.a(20370);
          fo.a(25613);
          HighscoreQuery.a((byte) 35);
          HighscoreNameEntry.b(-11760);
          SoundPlayback.a(32081);
          qb.a(true);
          wg.a(true);
          sl.b(111);
          ul.a((byte) -128);
          jf.a((byte) -50);
          hi.k(-86);
          cl.a((byte) -98);
          ht.a(-91);
          qq.b((byte) 116);
          HudMessage.a((byte) 117);
          oc.a((byte) 121);
          mj.a(3);
          dq.a(122);
          id.a((byte) 106);
          m.a(256);
          jn.h(-89);
          SteeringMode.a(false);
          gu.a(false);
          pm.b(93);
          ko.c(0);
          ki.b(64);
          lh.a(param0 ^ 18173);
          wo.a(-125);
          uk.a(250);
          te.a(false);
          ds.a(-93);
          sc.b(126);
          co.a(-13392);
          mp.c((byte) -11);
          fh.c(true);
          ii.c((byte) -22);
          vn.c((byte) 101);
          uu.e(param0 ^ 27864);
          jo.a((byte) -125);
          pt.a(0);
          li.b((byte) -90);
          ah.c((byte) -27);
          ms.a((byte) -15);
          od.d((byte) -96);
          aj.c((byte) 113);
          bi.a(false);
          this.field_w = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "AceOfSkies.C(" + param0 + ')');
        }
        if (GameAppletShell.field_a != 0) {
          obfuscationControl = (var3 == 0);
        }
    }

    private final void g(byte param0) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != fn.field_a) {
            wu.a(-113, fn.field_a);
            fn.field_a = null;
            te.a(38);
          }
          ClientException.field_e = true;
          wi.field_a = ot.a(-28, 4);
          iq.field_e = ot.a(-65, 5);
          jk.field_b = ot.a(-31, 6);
          ub.field_f = ot.a(-76, 7);
          ot.field_b = ot.a(-62, 8);
          od.field_x = ot.a(-81, 9);
          if (param0 <= 43) {
            return;
          }
          ci.gameRandom = new Random(kh.a(-99));
          FlightSession.rendererManager = new RendererManager(11, 12, (d) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "AceOfSkies.F(" + param0 + ')');
        }
    }

    final static long a(CharSequence param0, int param1) {
        int stackIn_38_0 = 0;
        long stackIn_47_0 = 0L;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_38_0Lifetime1;
        var7 = obfuscationControl ? 1 : 0;
        try {
          if (param1 > -12) {
            AceOfSkies.a((CharSequence) null, -113);
          }
          var2_long = 0L;
          var4 = param0.length();
          var5 = 0;
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var4 > var5) {
              var2_long = var2_long * 37L;
              var6 = param0.charAt(var5);
              stackIn_38_0 = var6;
              if (var7 != 0) {
                if (stackIn_38_0 == 0) {
                  stackIn_47_0 = var2_long;
                  break scanLoop1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_38_0 >= 65 &&
                  var6 <= 90) {
                  var2_long = var2_long + (long)(-65 + (1 + var6));
                } else if (97 <= var6 &&
                  var6 <= 122) {
                  var2_long = var2_long + (long)(-97 + (var6 + 1));
                } else {
                  if (var6 >= 48 &&
                    57 >= var6) {
                    var2_long = var2_long + (long)(var6 - 21);
                  }
                }
                if (var2_long < 177917621779460413L ||
                  var7 != 0) {
                  var5++;
                  continue;
                }
              }
            }
            if (decompiledFrameRemainder0) {
              while (true) {
                stackIn_38_0Lifetime1 = $cfr$lcmp(0L, var2_long % 37L);
                if (stackIn_38_0Lifetime1 != 0) {
                  break;
                }
                stackIn_47_0 = var2_long;
                if (var7 != 0) {
                  break scanLoop1;
                }
                if (stackIn_47_0 == 0L) {
                  break;
                }
                var2_long = var2_long / 37L;
              }
            }
            stackIn_47_0 = var2_long;
            break;
          }
          return stackIn_47_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_51_0 = var2;
          stackIn_51_1 = new StringBuilder().append("AceOfSkies.D(");
          if (param0 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param1).append(')').toString());
        }
    }

    final void renderGame(int obfuscationGuard) {
        try {
          boolean stackIn_54_0 = false;
          Throwable decompiledCaughtException = null;
          java.awt.Canvas var2 = null;
          RuntimeException var2_ref = null;
          int var3 = 0;
          GraphicsRenderer var4 = null;
          int var5_int = 0;
          iq var5 = null;
          int var6_int = 0;
          String var6 = null;
          lp var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          int var10 = 0;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var10 = obfuscationControl ? 1 : 0;
          try {
            var2 = fa.a(-8213);
            vp.a();
            var3 = 0;
            if (im.a(true)) {
              pu.a((byte) 21, var2, lh.a((byte) -94));
              return;
            }
            if (!gq.field_f) {
              hj.a(var2, -12);
              return;
            }
            if (!b.b((byte) -94)) {
              fh.a(-42, 100.0f, bd.field_I);
              hj.a(var2, -12);
              return;
            }
            if (FlightSession.rendererManager.a(122)) {
              ScoreSubmission.a(39);
            }
            var4 = FlightSession.rendererManager.a((byte) 127);
            sg.flightSession.renderSession(-16711936, false, var4);
            if (~po.activeMenuId != ~ci.nextMenuId) {
              if (po.activeMenuId != -1 &&
                ec.menuTransitionTicks < 30) {
                var5_int = ec.menuTransitionTicks;
                var5_int = (int)(480.0 * Math.cos(3.141592653589793 * (double)var5_int / 2.0 / 30.0));
                aa.menuScreens[po.activeMenuId].drawMenu(-var5_int + 480, var4, -4);
              }
              if ((ci.nextMenuId != -1) &&
                (!(ec.menuTransitionTicks <= 10))) {
                var5_intLifetime2 = ec.menuTransitionTicks - 40;
                var5_intLifetime2 = (int)(480.0 * Math.cos(3.141592653589793 * (double)var5_intLifetime2 / 2.0 / 30.0));
                aa.menuScreens[ci.nextMenuId].drawMenu(-var5_intLifetime2 + 480, var4, obfuscationGuard - 154);
                if ((var10 != 0) &&
                  (po.activeMenuId != -1)) {
                  aa.menuScreens[po.activeMenuId].drawMenu(0, var4, -4);
                }
              }
            } else {
              if (po.activeMenuId != -1) {
                aa.menuScreens[po.activeMenuId].drawMenu(0, var4, -4);
              }
            }
            if (gi.a(true)) {
              var3 = 1;
              vp.f(0, 0, vp.field_i, vp.field_c);
              ee.c((byte) 14);
            }
            if (0 != bg.field_b) {
              var3 = 1;
              var5_intLifetime1 = 256 * ec.menuTransitionTicks / 40;
              if (var5_intLifetime1 > 0) {
                vp.b(0, 0, vp.field_i, vp.field_c, 0, var5_intLifetime1);
              }
            }
            if (jf.a(obfuscationGuard + 14850) &&
              !gi.a(true)) {
              var3 = 1;
              if (jf.field_a != null) {
                stackIn_54_0 = true;
              } else {
                stackIn_54_0 = im.field_e;
              }
              ls.a(stackIn_54_0, (byte) -37);
            }
            if (ln.field_d >= 2 &&
              lb.field_e) {
              PacketBuffer.field_j.a(16777215, 1, 20, Integer.toString(wk.field_f), obfuscationGuard ^ 18877, 20);
            }
            var5 = (iq) (MenuScreen.field_g.first(268435455));
            if (null != var5) {
              var7 = hp.field_h;
              if (var7 < 64) {
                var6_int = var7 * 255 / 64;
                if (var10 != 0) {
                  if (var7 <= 192) {
                    var6_int = 255;
                    var6_int = (192 - var7) * 255 / 64;
                  } else {
                    var6_int = (192 - var7) * 255 / 64;
                  }
                }
              } else {
                if (var7 <= 192) {
                  var6_int = 255;
                  if (var10 != 0) {
                    var6_int = (192 - var7) * 255 / 64;
                  }
                } else {
                  var6_int = (192 - var7) * 255 / 64;
                }
              }
              var8 = 45;
              boolean decompiledSharedTail0 = !(var5.field_f < 0);
              if (!decompiledSharedTail0) {
                var9 = ab.field_r;
                decompiledSharedTail0 = (var10 != 0);
              }
              if (decompiledSharedTail0) {
                var9 = lb.field_a[var5.field_f];
                aa.field_a[var5.field_f].a(53 + (-180 + sh.field_u), 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                var8 += 65;
              }
              PacketBuffer.field_j.a(0, -180 + sh.field_u, var6_int << 24, true, var6_int << 24, 1, var8 - 1, 18, 0, (RenderSprite[]) null, (aa) null, 0, (int[]) null, 170, 150, var9);
              PacketBuffer.field_j.a(0, -180 + sh.field_u, var6_int << 24, true, var6_int << 24, 1, 1 + var8, 18, 0, (RenderSprite[]) null, (aa) null, 0, (int[]) null, 170, 150, var9);
              PacketBuffer.field_j.a(0, sh.field_u - 180, 16777215 | var6_int << 24, true, -1, 1, var8, 18, 0, (RenderSprite[]) null, (aa) null, 0, (int[]) null, 170, 150, var9);
            }
            if (var3 != 0) {
              if (0 == bg.field_b && (!jf.a(15000) ||
                gi.a(true))) {
                mg.a(var4, obfuscationGuard ^ 1150040055);
                if (var10 != 0) {
                  hh.a(obfuscationGuard ^ 105, var4);
                }
              } else {
                hh.a(obfuscationGuard ^ 105, var4);
              }
            }
            if (mj.field_b &&
              ln.field_d >= 2) {
              var6 = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024L + "kb/" + Runtime.getRuntime().totalMemory() / 1024L + "kb";
              PacketBuffer.field_j.a(var6, -1, -16777216, sh.field_u - 10, 45, (byte) 92);
              PacketBuffer.field_j.a(Integer.toString(wk.field_f), -1, -16777216, sh.field_u - 10, 60, (byte) 92);
            }
            if (obfuscationGuard != 150) {
              field_J = false;
            }
            try {
              var4.e(obfuscationGuard - 239);
            } catch (lp decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = (lp) (Object) decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw pn.a((Throwable) ((Object) var2_ref), "AceOfSkies.A(" + obfuscationGuard + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0) {
        boolean discarded$0 = false;
        boolean stackIn_15_1 = false;
        boolean stackIn_78_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        oc var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = obfuscationControl ? 1 : 0;
        try {
          we.a(200);
          if (param0 != 5883) {
            AceOfSkies.a((CharSequence) null, -79);
          }
          if (null != jf.field_a &&
            jf.field_a.field_b) {
            tt.b(-32546);
            hi.j(8585);
          }
          stackIn_15_1 = (jf.field_a != null);
          this.b(stackIn_15_1, (byte) 95);
          if (jn.field_t) {
            this.g((byte) 124);
            jn.field_t = false;
          }
          if (im.a(true)) {
            this.i(4);
            if (im.a(true)) {
              if (jr.a((byte) 32)) {
                discarded$0 = this.a((byte) 59, false);
              }
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (!gq.field_f) {
            ic.a(nh.field_e, false);
            decompiledFrameRemainder0 = !(!this.a((byte) -62, true));
            if (decompiledFrameRemainder0) {
              gq.field_f = true;
              decompiledFrameRemainder0 = (var3 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            boolean decompiledSharedTail0 = !(b.b((byte) -119));
            if (!decompiledSharedTail0) {
              if (gi.a(true)) {
                if (0 == bg.field_b) {
                  var2_int = oj.f(5);
                  switch (var2_int) {
                    case 3:
                      ql.a((byte) -81, true);
                    default:
                      break;
                    case 4:
                      mo.a(-1316);
                      if (var3 == 0) {
                        break;
                      }
                    case 2:
                      tt.b(-32546);
                      break;
                  }
                  if (!gi.a(true)) {
                    aa.menuScreens[po.activeMenuId].open(true, 1);
                  }
                  decompiledFrameRemainder0 = (var3 != 0);
                }
                if (decompiledFrameRemainder0) {
                  this.advanceGame(param0 + 3163);
                  decompiledFrameRemainder0 = (var3 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (!jf.a(param0 + 9117)) {
                  this.advanceGame(param0 ^ 13741);
                  decompiledFrameRemainder0 = (var3 != 0);
                }
                if (decompiledFrameRemainder0) {
                  stackIn_78_1 = (null != jf.field_a);
                  var2_int = this.a(stackIn_78_1, param0 - 5990);
                  if (var2_int == 1 ||
                    2 == var2_int) {
                    if (jf.field_a != null) {
                      tt.b(-32546);
                    }
                    if (var2_int == 2) {
                      rr.a((byte) -77, bm.m(114));
                    }
                  }
                  decompiledSharedTail0 = (var3 != 0);
                }
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledSharedTail0)) {
              jn.g(4);
              if (b.b((byte) -127)) {
                hl.a(-1889);
                tq.b(true);
                if (po.activeMenuId == 5 &&
                  r.field_n == 0) {
                  po.activeMenuId = 2;
                  Bullet.requestMenu((byte) -92, 2, false);
                }
                if (gi.a(true)) {
                  ql.a((byte) -88, true);
                }
              }
            }
          }
          if (!cn.b(true)) {
            do {
              var2 = (oc) (sb.field_c.removeFirst(121));
              if (null == var2) {
                if (var3 == 0) {
                  break;
                }
              } else {
                pn.a(var2, (byte) -117, 4);
              }
            } while (var3 == 0);
          }
          do {
            if (!ka.a((byte) 93, ho.field_d)) {
              fr.a(-100, 0);
              break;
            }
            this.f((byte) -106);
          } while (var3 == 0);
          if (dg.j(param0 ^ 31428)) {
            var2_int = this.p(16637);
            if (var2_int == 2) {
              rc.c((byte) 127);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2_ref), "AceOfSkies.H(" + param0 + ')');
        }
    }

    public AceOfSkies() {
    }

    final void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          dt.a(0);
          if (jf.field_a != null) {
            tt.b(-32546);
          }
          vl.a(-26317);
          if (param0 > -95) {
            field_J = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "AceOfSkies.E(" + param0 + ')');
        }
    }

    static {
        field_J = true;
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
