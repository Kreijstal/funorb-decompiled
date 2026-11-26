/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Bounce extends GameClient {
    static RgbSprite field_G;
    private int field_I;
    private boolean field_E;
    private int field_J;
    private boolean field_L;
    private int field_K;
    static String[] field_A;
    private int field_M;
    static int field_F;
    private int field_H;
    public static int field_N;

    private final void k(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (AccountCreationResultPanel.field_pb != null) {
            ij.a(AccountCreationResultPanel.field_pb, (byte) -123);
            AccountCreationResultPanel.field_pb = null;
            vc.e((byte) -44);
          }
          pa.field_c = fa.a((byte) -76, 1);
          IntrusiveNode.field_e = fa.a((byte) -76, 2);
          if (param0 != -16) {
            this.e(-122);
          }
          MidiPcmStream.field_D = fa.a((byte) -76, 5);
          ca.field_e = fa.a((byte) -76, 3);
          ub.field_a = fa.a((byte) -76, 4);
          va.field_c = fa.a((byte) -76, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) var2), "Bounce.MA(" + param0 + ')');
        }
    }

    private final boolean a(String param0, boolean param1, int param2, boolean param3, int param4, byte param5, int param6) {
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        try {
          var8_int = od.field_f.b(param0);
          param2 = param2 - var8_int / 2;
          if (param2 - 8 < uc.field_C &&
            param2 + 16 + var8_int >= uc.field_C &&
            ll.field_y > (-od.field_f.field_s + (param4 - 8)) &&
            (param4 + 16) >= ll.field_y &&
            param1) {
            param6 = 16777215;
          }
          if (param3) {
            param6 = 16777215;
          }
          if (param5 != 93) {
            return false;
          }
          od.field_f.b(param0, param2, param4, param6, -1);
          if (param6 == 16777215 &&
            this.field_K != 0 &&
            param1) {
            return true;
          }
          if (16777215 == param6 &&
            ng.field_a[84] &&
            param3) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_46_0 = var8;
          stackIn_46_1 = new StringBuilder().append("Bounce.QA(");
          if (param0 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void d(byte param0) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = field_N;
        try {
          Bounce.k((byte) -99);
          kc.clearStaticReferences(17345);
          nf.clearStaticReferences(-60);
          ab.clearStaticReferences((byte) -104);
          hi.a(false);
          ua.clearStaticReferences(-24750);
          jl.resetStaticState(87);
          GameClient.clearStaticReferences((byte) 115);
          ClientException.clearStaticReferences((byte) 72);
          AppletShell.e((byte) 118);
          ha.clearStaticReferences(false);
          MouseWheelInput.a((byte) 53);
          SoftwareRasterizer.clearStaticReferences();
          gk.b(false);
          ob.clearStaticReferences(640);
          PacketBuffer.clearStaticReferences((byte) -127);
          of.clearStaticReferences(true);
          dk.clearStaticReferences(true);
          je.a(-23556);
          mc.clearStaticReferences((byte) 47);
          pd.clearStaticReferences((byte) -119);
          nc.a(119);
          b.resetStaticState(76);
          bl.clearStaticReferences(37);
          va.resetStaticState(2);
          ej.clearStaticReferences(-64);
          bb.clearStaticReferences((byte) 25);
          pg.clearStaticReferences(false);
          sg.clearStaticReferences((byte) -112);
          AwtRasterBuffer.clearStaticReferences(-10);
          gi.clearStaticReferences(72);
          FullscreenFocusCanvas.clearStaticReferences(false);
          pb.clearDeclaredStaticReferences(-19);
          MidiPcmStream.clearStaticReferences(-112);
          v.clearStaticReferences(-8217);
          DiskCacheWorker.clearStaticReferences((byte) 74);
          jf.e(-18695);
          BufferedSocket.clearStaticReferences(-14582);
          Platform.clearStaticReferences((byte) 64);
          Slime.clearStaticReferences(100);
          qf.clearStaticReferences(-107);
          i.clearStaticReferences(118);
          AudioOutput.clearStaticReferences();
          mj.c(4);
          IntrusiveNode.a((byte) 110);
          CipherPacketBuffer.clearStaticReferences(0);
          og.clearStaticReferences((byte) 106);
          f.clearStaticReferences(-7355);
          uk.clearStaticReferences(113);
          kl.resetStaticState(0);
          oe.clearStaticReferences();
          MusicPatchPcmStream.resetStaticState(0);
          nl.clearStaticReferences((byte) 94);
          hf.clearStaticReferences((byte) 124);
          c.clearStaticReferences((byte) 56);
          l.a(3);
          pf.clearStaticReferences(-1);
          AccountCreationResultPanel.clearStaticReferences(false);
          db.n(260);
          ec.resetDeclaredStaticState(101);
          sh.clearDeclaredStaticReferences(5);
          gh.clearStaticReferences(true);
          k.clearStaticReferences((byte) -81);
          ci.a(false);
          q.clearStaticReferences((byte) -117);
          ve.clearStaticReferences((byte) 85);
          fk.resetStaticState((byte) 118);
          g.a(6623);
          qj.clearStaticReferences(-112);
          PcmResampler.clearStaticReferences(0);
          gg.clearStaticReferences();
          te.clearStaticReferences();
          VorbisFloor.clearStaticReferences();
          wa.clearStaticReferences(-13268);
          ub.clearStaticReferences((byte) -104);
          mi.clearStaticReferences((byte) -122);
          fd.a(false);
          oh.a((byte) -59);
          oc.clearStaticReferences(false);
          tj.clearStaticReferences();
          DualLinkNode.clearStaticReferences((byte) 115);
          li.clearStaticReferences(111);
          nk.clearStaticReferences(-74);
          bk.clearStaticReferences(-23);
          ag.a(-1);
          hd.clearStaticReferences(233);
          le.clearStaticReferences((byte) 90);
          gd.resetStaticState(255);
          ng.clearStaticReferences(2);
          SpriteGeometry.clearStaticReferences(65);
          qb.a((byte) -30);
          tb.clearStaticReferences((byte) 68);
          ml.clearStaticReferences(-1);
          NetworkArchiveRequest.a(false);
          SectorCacheStore.resetStaticState(11826);
          DiskArchiveRequest.clearStaticReferences(-94);
          ce.clearStaticReferences((byte) -49);
          ok.c(114);
          wb.clearStaticReferences((byte) 65);
          cf.clearStaticReferences(1);
          nh.releaseDeclaredStaticReferences((byte) -102);
          il.clearStaticReferences((byte) 126);
          qk.clearStaticReferences();
          ig.clearStaticReferences(1);
          a.clearStaticReferences(249);
          jk.a(-19800);
          if (param0 >= -98) {
            this.field_H = 17;
          }
          wj.resetStaticState(0);
          ij.a(true);
          ca.clearStaticReferences((byte) -86);
          ge.clearStaticReferences(-120);
          pe.clearStaticReferences(0);
          ih.clearDeclaredStaticReferences((byte) -58);
          hc.clearStaticReferences(true);
          DelegatingCanvas.clearStaticReferences((byte) -83);
          fi.clearStaticReferences(-14935);
          da.clearStaticReferences(-87);
          ad.clearStaticReferences();
          uj.resetStaticState((byte) 105);
          hh.resetStaticState(false);
          jj.clearStaticReferences(true);
          dl.clearStaticReferences((byte) 94);
          vb.clearStaticReferences(119);
          qi.clearStaticReferences(0);
          sj.clearStaticReferences((byte) 42);
          vg.a(8);
          ed.resetStaticState(19599);
          lk.clearDeclaredStaticReferences((byte) 122);
          ak.clearDeclaredStaticReferences(127);
          wk.clearStaticReferences((byte) 38);
          ri.a(-11673);
          lc.clearStaticReferences(36368);
          ea.b(17695);
          vk.a(3);
          re.clearStaticReferences(false);
          ne.c((byte) 100);
          od.clearStaticReferences(0);
          vd.clearStaticReferences(1567641170);
          ae.clearStaticReferences((byte) -119);
          fl.clearStaticReferences(8192);
          ta.resetStaticState(0);
          oa.clearStaticReferences(22085);
          ProxyAuthenticationRequiredException.resetStaticState(8191);
          ImageProducerRasterBuffer.resetStaticState(true);
          lb.resetStaticState((byte) -83);
          kj.clearStaticReferences(false);
          rj.clearStaticReferences(0);
          ch.clearStaticReferences(false);
          pa.clearStaticReferences(37);
          hb.clearStaticReferences((byte) 123);
          ba.clearStaticReferences((byte) 94);
          mh.resetStaticState(-16167);
          ll.clearStaticReferences((byte) -83);
          nd.a(true);
          vc.clearStaticReferences((byte) -6);
          la.clearStaticReferences((byte) -59);
          ff.a(-22756);
          al.clearDeclaredStaticReferences(24562);
          nb.clearStaticReferences(120);
          eb.clearStaticReferences(true);
          fh.a(false);
          d.f((byte) -112);
          SoundFilter.clearStaticReferences();
          kb.a(-9192);
          mb.resetDeclaredStaticState(60);
          DirectByteStorage.clearStaticReferences(11041);
          aj.clearStaticReferences(false);
          bj.clearStaticReferences(-119);
          se.a(true);
          eh.a((byte) 106);
          IterableNodeHashTable.a(-1);
          SecondaryNodeDeque.clearStaticReferences((byte) -53);
          eg.clearDeclaredStaticReferences(54);
          t.clearStaticReferences(-32504);
          ra.clearStaticReferences((byte) 120);
          ja.a(false);
          NodeHashTableIterator.clearStaticReferences(8832);
          SecondaryNodeDequeIterator.clearStaticReferences(true);
          sa.a(true);
          he.b((byte) -53);
          w.resetStaticState(62771140);
          qa.a(19108);
          jh.clearStaticReferences(-1);
          r.clearStaticReferences((byte) 51);
          tc.clearStaticReferences(false);
          wg.clearStaticReferences(13922);
          pj.clearStaticReferences(-4);
          jg.clearStaticReferences(-32572);
          fb.d(4);
          qg.clearStaticReferences((byte) 57);
          ld.clearStaticReferences(false);
          ke.a(-196);
          AccountRequestState.releaseStatics((byte) -114);
          AccountServiceResult.a((byte) -75);
          qh.clearStaticReferences((byte) -101);
          uf.a(32578);
          j.clearStaticReferences((byte) -87);
          uc.clearStaticReferences((byte) 28);
          ph.clearStaticReferences(0);
          ji.clearStaticReferences((byte) 11);
          qe.clearStaticReferences((byte) -86);
          lg.clearStaticReferences(-65);
          bi.clearStaticReferences(false);
          gf.clearStaticReferences(false);
          id.clearStaticReferences((byte) -72);
          jc.resetStaticState(true);
          kg.clearStaticReferences((byte) -64);
          bh.clearStaticReferences((byte) 120);
          AccountNameAvailabilityValidator.clearStaticReferences(0);
          bf.clearStaticReferences(0);
          nj.clearStaticReferences(22382);
          cl.clearStaticReferences(false);
          hg.d(-1);
          bd.clearStaticReferences((byte) -110);
          qc.clearStaticReferences(-96);
          ui.a(true);
          vf.a(0);
          ck.f((byte) -126);
          lj.clearStaticReferences(0);
          this.field_r = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) var2), "Bounce.HA(" + param0 + ')');
        }
        if (AppletShell.field_j != 0) {
          var3++;
          field_N = var3;
        }
    }

    private final void l(int param0) {
        int fieldTemp$0 = 0;
        Slime dupTemp$1 = null;
        Slime dupTemp$2 = null;
        Slime dupTemp$3 = null;
        Slime dupTemp$4 = null;
        Slime dupTemp$5 = null;
        Slime dupTemp$6 = null;
        Slime dupTemp$7 = null;
        Slime dupTemp$8 = null;
        Slime dupTemp$9 = null;
        Slime dupTemp$10 = null;
        Slime dupTemp$11 = null;
        Slime dupTemp$12 = null;
        Slime dupTemp$14 = null;
        Slime dupTemp$15 = null;
        Platform dupTemp$13 = null;
        boolean stackIn_225_0 = false;
        boolean stackIn_233_0 = false;
        MidiPcmStream stackIn_241_0 = null;
        be stackIn_242_1 = null;
        int stackIn_307_0 = 0;
        int stackIn_307_1 = 0;
        int stackIn_464_0 = 0;
        int stackIn_464_1 = 0;
        int stackIn_478_0 = 0;
        Throwable decompiledCaughtException = null;
        ie var2 = null;
        Object var2_ref = null;
        int var2_int = 0;
        RuntimeException var2_ref2 = null;
        int var3_int = 0;
        double var3 = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var10 = 0;
        Platform dupTemp$13Lifetime1;
        int stackIn_464_0Lifetime1;
        int stackIn_464_1Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var10 = field_N;
        try {
          if (~this.field_J != ~uc.field_C ||
            ll.field_y != this.field_M ||
            0 != SectorCacheStore.field_e) {
            this.field_J = uc.field_C;
            qf.field_b = -1;
            this.field_M = ll.field_y;
            this.field_L = true;
          }
          if (SectorCacheStore.field_e != 0) {
            this.field_K = 1;
            if (var10 != 0) {
              this.field_K = 0;
            }
          } else {
            this.field_K = 0;
          }
          if (ng.field_a[98]) {
            this.field_L = false;
            qf.field_b = 0;
          }
          if (ng.field_a[99]) {
            this.field_L = false;
            qf.field_b = 1;
          }
          jd.field_e = jd.field_e - 1;
          if (param0 >= -120) {
            return;
          }
          if (ng.field_a[84]) {
            this.field_L = false;
          }
          ec.field_cb = ec.field_cb + vd.field_a;
          if (hi.field_c >= 2) {
            if (ng.field_a[32] &&
              fa.field_c < 6000) {
              he.field_n[0].field_j = 300.0;
              he.field_n[0].field_q = 0.0;
              fa.field_c = fa.field_c + 10;
              ta.field_c = ta.field_c + 0.01;
            }
            if (ng.field_a[33] &&
              fa.field_c > 0) {
              he.field_n[0].field_q = 0.0;
              fa.field_c = fa.field_c - 10;
              he.field_n[0].field_j = 300.0;
              ta.field_c = ta.field_c - 0.01;
            }
          }
          if (SectorCacheStore.field_e != 0) {
            l.field_c = l.field_c - jd.field_e;
            vd.field_a = vd.field_a + 1;
          }
          if (fb.field_nb) {
            if (vc.d((byte) -18)) {
              AccountNameAvailabilityValidator.d(30432);
            }
            fb.field_nb = false;
          }
          if (ci.field_F.beginForward((byte) -75) != null) {
            fieldTemp$0 = this.field_H + 1;
            this.field_H = this.field_H + 1;
            if (fieldTemp$0 == 335) {
              this.field_H = 0;
              ci.field_F.removeFirst((byte) -52);
            }
          }
          ae.field_f = ae.field_f + 1;
          if (ae.field_f >= 256) {
            ae.field_f = ae.field_f - 256;
          }
          ff.field_C = ff.field_C + 0.1;
          if (256.0 <= ff.field_C) {
            ff.field_C = ff.field_C - 256.0;
          }
          eg.field_n = -16 + (int)(16.0 * Math.sin(ff.field_C));
          i.field_a = i.field_a + 1;
          qa.field_h = qa.field_h + 1;
          if (i.field_a >= 256) {
            i.field_a = i.field_a - 256;
          }
          if (256 < qa.field_h) {
            qa.field_h = 0;
            ne.field_w = ne.field_w + 1;
          }
          if (1 == vk.field_b) {
            ta.field_c = ta.field_c + 0.001;
            if (he.field_n[0].field_n > 0) {
              if (null == MusicPatchPcmStream.field_o ||
                !(0 >= fa.field_c)) {
                qf.field_c = qf.field_c + 1;
                fa.field_c = fa.field_c + 1;
                if (!(3.0 > 5.0 * Math.random())) {
                  l.field_c = l.field_c - (vd.field_a - 1);
                  jd.field_e = jd.field_e + 1;
                  if (var10 != 0) {
                    ec.field_cb = ec.field_cb + 1;
                  }
                } else {
                  ec.field_cb = ec.field_cb + 1;
                }
              }
              if (MusicPatchPcmStream.field_o == null) {
                if (fa.field_c == 1000) {
                  dk.a(false, 0, 255);
                }
                if (fa.field_c == 2500) {
                  dk.a(false, 1, 254);
                }
                if (fa.field_c == 4000) {
                  dk.a(false, 2, 253);
                }
                if (5000 == fa.field_c &&
                  SectorCacheStore.a(0, (byte) 88)) {
                  dk.a(false, 9, 246);
                }
                if (he.field_n[0].field_o < 95.0 &&
                  kg.field_f < 1000) {
                  kg.field_f = kg.field_f + 1;
                  vg.field_j = vg.field_j + 1;
                }
                if (he.field_n[0].field_o > 97.0 &&
                  1000 > hg.field_l) {
                  hg.field_l = hg.field_l + 1;
                  nb.field_a = nb.field_a + 1;
                }
                if (he.field_n[0].field_d > 0.0 &&
                  qe.field_f < 1000) {
                  qe.field_f = qe.field_f + 1;
                  ve.field_a = ve.field_a + 1;
                }
                if (kg.field_f == 1000) {
                  kg.field_f = 1001;
                  dk.a(false, 6, 249);
                }
                if (hg.field_l == 1000) {
                  hg.field_l = 1001;
                  dk.a(false, 5, 250);
                }
                if (qe.field_f == 1000) {
                  qe.field_f = 1001;
                  dk.a(false, 7, 248);
                }
                if (kg.field_f == 1001 &&
                  hg.field_l == 1001 &&
                  qe.field_f == 1001) {
                  kg.field_f = 1002;
                  dk.a(false, 8, 247);
                }
              }
            }
          }
          if (PcmResampler.field_g) {
            this.field_E = false;
          }
          if (this.field_E) {
            this.field_I = (9 * this.field_I + 100) / 10;
            if (this.field_I < 100) {
              this.field_I = this.field_I + 1;
              if (var10 != 0) {
                this.field_I = this.field_I * 9 / 10;
                if (0 < this.field_I) {
                  this.field_I = this.field_I - 1;
                }
              }
            }
          } else {
            this.field_I = this.field_I * 9 / 10;
            if (0 < this.field_I) {
              this.field_I = this.field_I - 1;
            }
          }
          if (null != MusicPatchPcmStream.field_o &&
            rj.field_j == -1) {
            MusicPatchPcmStream.field_o = MusicPatchPcmStream.field_o.a((byte) -77);
          }
          if (rj.field_j != -1 &&
            rj.field_j == 0) {
            var2 = gk.field_e;
            var3_int = var2.field_s + 200;
            var4 = 4 + var2.field_x + var2.field_F;
            var5 = gk.field_e.b(qe.field_c);
            var6 = 320 - var5 / 2;
            var7 = 3 * var4 + var3_int;
            if ((var6 - 8) < uc.field_C &&
              uc.field_C <= (var6 - (-16 - var5)) &&
              (var7 - 8 - gk.field_e.field_s) < ll.field_y &&
              ll.field_y <= 16 + var7 &&
              this.field_L &&
              1 == SectorCacheStore.field_e) {
              ProxyAuthenticationRequiredException.d(-6144);
              rj.field_j = 2;
            }
            var5Lifetime1 = gk.field_e.b(db.field_T);
            var6Lifetime1 = -(var5Lifetime1 / 2) + 320;
            var7Lifetime1 = var4 / 2 + 4 * var4 + var3_int + 32;
            if ((var6Lifetime1 - 8) < uc.field_C &&
              var5Lifetime1 + var6Lifetime1 + 16 >= uc.field_C &&
              (-8 + var7Lifetime1 - gk.field_e.field_s) < ll.field_y &&
              ll.field_y <= var7Lifetime1 + 16 &&
              this.field_L &&
              SectorCacheStore.field_e == 1) {
              MusicPatchPcmStream.field_o.field_l = false;
              if (!this.field_L) {
                MusicPatchPcmStream.field_o.field_n = 0;
              }
              rj.field_j = -1;
              kb.field_a = 0;
              MusicPatchPcmStream.field_o.field_e = false;
            }
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!q.g((byte) -15)))) {
            if (lh.field_f == 49) {
              stackIn_225_0 = !(wd.field_x);
              wd.field_x = stackIn_225_0;
            }
            if (lh.field_f == 70) {
              stackIn_233_0 = !(rd.field_a);
              rd.field_a = stackIn_233_0;
              var2_ref = jl.field_d;
              synchronized (var2_ref) {
                boolean decompiledSharedTail0 = !(!rd.field_a);
                if (!decompiledSharedTail0) {
                  ld.field_l.f(-22719);
                  decompiledSharedTail0 = (var10 != 0);
                }
                if (decompiledSharedTail0) {
                  stackIn_241_0 = ld.field_l;
                  if (!PcmResampler.field_g) {
                    stackIn_242_1 = AccountCreationResultPanel.field_mb;
                  } else {
                    stackIn_242_1 = wj.field_c;
                  }
                  ((MidiPcmStream) (Object) stackIn_241_0).a(stackIn_242_1, true, 54);
                }
                jl.field_d.flushAndMarkDrainCheck();
              }
            }
            if (MusicPatchPcmStream.field_o != null &&
              rj.field_j == -1) {
              if (n.field_m == 0) {
                if (lh.field_f == 98) {
                  MusicPatchPcmStream.field_o.a(-1, 12011);
                }
                if (lh.field_f == 99) {
                  MusicPatchPcmStream.field_o.a(1, 12011);
                }
                if (lh.field_f == 96) {
                  MusicPatchPcmStream.field_o.a(false, -31729, -1);
                }
                if (lh.field_f == 97) {
                  MusicPatchPcmStream.field_o.a(false, -31729, 1);
                }
                if (lh.field_f == 102 &&
                  !MusicPatchPcmStream.field_o.field_e) {
                  MusicPatchPcmStream.field_o.a(false, -31729, -16);
                }
                if (lh.field_f == 103 &&
                  !MusicPatchPcmStream.field_o.field_e) {
                  MusicPatchPcmStream.field_o.a(false, -31729, 16);
                }
                if (lh.field_f == 84) {
                  MusicPatchPcmStream.field_o.a(false, -31729, 0);
                }
              }
              if (lh.field_f == 13) {
                MusicPatchPcmStream.field_o.b(-1);
              }
            }
            if (84 != lh.field_f) {
              continue;
            }
            if (rj.field_j != 0) {
              continue;
            }
            stackIn_307_0 = 0;
            stackIn_307_1 = qf.field_b;
            if (var10 == 0) {
              if (stackIn_307_0 == stackIn_307_1) {
                ProxyAuthenticationRequiredException.d(-6144);
                rj.field_j = 2;
              }
              if (qf.field_b != 1) {
                continue;
              }
              MusicPatchPcmStream.field_o.field_l = false;
              kb.field_a = 0;
              MusicPatchPcmStream.field_o.field_e = false;
              rj.field_j = -1;
              if (this.field_L) {
                continue;
              }
              MusicPatchPcmStream.field_o.field_n = 0;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_307_0 = 0;
            stackIn_307_1 = fa.field_c;
          }
          if ((stackIn_307_0 < stackIn_307_1 ||
            !(vk.field_b <= 1)) &&
            (ng.field_a[13] ||
            jk.field_q != -1 &&
            (SectorCacheStore.field_e != 0 ||
            ng.field_a[83] ||
            ng.field_a[84])) && (PcmResampler.field_g &&
            MusicPatchPcmStream.field_o == null)) {
            PcmResampler.field_g = false;
            if (null == MusicPatchPcmStream.field_o) {
              MusicPatchPcmStream.field_o = new mj();
              if (var10 != 0) {
                MusicPatchPcmStream.field_o.field_b = true;
              }
            } else {
              MusicPatchPcmStream.field_o.field_b = true;
            }
            MusicPatchPcmStream.field_o.field_n = -1 + vk.field_b;
            if (vk.field_b == 1) {
              he.field_n[0].field_n = 0;
              this.c(false, fa.field_c);
              if (kb.field_a <= 0) {
                MusicPatchPcmStream.field_o.field_n = 11;
                MusicPatchPcmStream.field_o.field_e = true;
                if (var10 != 0) {
                  MusicPatchPcmStream.field_o.field_l = true;
                }
              } else {
                MusicPatchPcmStream.field_o.field_l = true;
              }
              jk.field_q = -1;
            }
            ta.field_c = 1.0;
            vk.field_b = 3;
            if (rd.field_a) {
              var2_ref = jl.field_d;
              synchronized (var2_ref) {
                ld.field_l.a(AccountCreationResultPanel.field_mb, true, 124);
                jl.field_d.flushAndMarkDrainCheck();
              }
            }
          }
          if (PcmResampler.field_g) {
            if (vk.field_b == 1) {
              if (ng.field_a[96] ||
                ng.field_a[nj.field_m]) {
                dupTemp$1 = he.field_n[0];
                dupTemp$1.field_c = dupTemp$1.field_c - 0.35;
              }
              if (ng.field_a[97] ||
                ng.field_a[ee.field_a]) {
                dupTemp$2 = he.field_n[0];
                dupTemp$2.field_c = dupTemp$2.field_c + 0.35;
              }
            }
            if (vk.field_b == 2) {
              if (ng.field_a[nj.field_m]) {
                dupTemp$3 = he.field_n[0];
                dupTemp$3.field_c = dupTemp$3.field_c - 0.35;
              }
              if (ng.field_a[ee.field_a]) {
                dupTemp$4 = he.field_n[0];
                dupTemp$4.field_c = dupTemp$4.field_c + 0.35;
              }
              if (ng.field_a[96]) {
                dupTemp$5 = he.field_n[1];
                dupTemp$5.field_c = dupTemp$5.field_c - 0.35;
              }
              if (ng.field_a[97]) {
                dupTemp$6 = he.field_n[1];
                dupTemp$6.field_c = dupTemp$6.field_c + 0.35;
              }
            }
            if (3 <= vk.field_b) {
              if (ng.field_a[nj.field_m]) {
                dupTemp$7 = he.field_n[0];
                dupTemp$7.field_c = dupTemp$7.field_c - 0.35;
              }
              if (ng.field_a[ee.field_a]) {
                dupTemp$8 = he.field_n[0];
                dupTemp$8.field_c = dupTemp$8.field_c + 0.35;
              }
              if (ng.field_a[nb.field_g]) {
                dupTemp$9 = he.field_n[2];
                dupTemp$9.field_c = dupTemp$9.field_c - 0.35;
              }
              if (ng.field_a[db.field_S]) {
                dupTemp$10 = he.field_n[2];
                dupTemp$10.field_c = dupTemp$10.field_c + 0.35;
              }
              if (ng.field_a[96]) {
                dupTemp$11 = he.field_n[1];
                dupTemp$11.field_c = dupTemp$11.field_c - 0.35;
              }
              if (ng.field_a[97]) {
                dupTemp$12 = he.field_n[1];
                dupTemp$12.field_c = dupTemp$12.field_c + 0.35;
              }
            }
          }
          ua.field_c[ua.field_b - 1].field_d = 6;
          ua.field_c[-2 + ua.field_b].field_d = 6;
          ua.field_c[ua.field_b - 3].field_d = 6;
          if (null == MusicPatchPcmStream.field_o ||
            !PcmResampler.field_g) {
            ca.a(false);
          }
          var2_int = 0;
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var2_int < vk.field_b) {
              stackIn_464_0 = ~he.field_n[var2_int].field_n;
              stackIn_464_1 = -1;
              if (var10 != 0) {
                if (stackIn_464_0 < stackIn_464_1) {
                  dupTemp$13 = ua.field_c[var2_int];
                  dupTemp$13.field_h = dupTemp$13.field_h - ta.field_c;
                  stackIn_478_0 = compareDoublesNaNResultNegative(-16.0, ua.field_c[var2_int].field_h);
                  break scanLoop1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_464_0 >= stackIn_464_1 &&
                  he.field_n[var2_int].field_p <= 0) {
                  he.field_n[var2_int].a(il.field_a, false);
                  he.field_n[var2_int].a(il.field_a, (byte) 106);
                } else {
                  if (null == MusicPatchPcmStream.field_o ||
                    !PcmResampler.field_g) {
                    he.field_n[var2_int].a(ua.field_c, nj.field_l, ua.field_b, il.field_a, ta.field_c, (byte) 90);
                  }
                  if (!PcmResampler.field_g) {
                    if (he.field_n[var2_int].field_h != 0) {
                      dupTemp$14 = he.field_n[var2_int];
                      dupTemp$14.field_c = dupTemp$14.field_c - 0.35;
                    } else {
                      dupTemp$15 = he.field_n[var2_int];
                      dupTemp$15.field_c = dupTemp$15.field_c + 0.35;
                    }
                    if (50.0 > he.field_n[var2_int].field_u) {
                      he.field_n[var2_int].field_h = 0;
                    }
                    if (462.0 < he.field_n[var2_int].field_u) {
                      he.field_n[var2_int].field_h = 1;
                    }
                  }
                }
                var2_int++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              var2_int = 0;
              while (true) {
                stackIn_464_0Lifetime1 = ~ua.field_b;
                stackIn_464_1Lifetime1 = ~var2_int;
                if (stackIn_464_0Lifetime1 >= stackIn_464_1Lifetime1) {
                  break;
                }
                dupTemp$13Lifetime1 = ua.field_c[var2_int];
                dupTemp$13Lifetime1.field_h = dupTemp$13Lifetime1.field_h - ta.field_c;
                stackIn_478_0 = compareDoublesNaNResultNegative(-16.0, ua.field_c[var2_int].field_h);
                if (var10 != 0) {
                  break scanLoop1;
                }
                if (stackIn_478_0 > 0) {
                  ua.field_c[var2_int].a(116, qb.a(true), (double)(int)(Math.random() * 384.0 + 64.0));
                  var3 = Math.random() * 32.0;
                  if (ua.field_c[(-4 + ua.field_b + var2_int) % (-3 + ua.field_b)].field_h + 32.0 + var3 > ua.field_c[var2_int].field_h) {
                    ua.field_c[var2_int].field_h = ua.field_c[(var2_int - (-ua.field_b + 4)) % (-3 + ua.field_b)].field_h + 32.0 + var3;
                  }
                }
                ua.field_c[var2_int].a(-64);
                var2_int++;
              }
            }
            stackIn_478_0 = 0;
            break;
          }
          if (stackIn_478_0 < wj.field_e) {
            wj.field_e = wj.field_e + 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) var2_ref2), "Bounce.OA(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        boolean stackIn_5_1 = false;
        int stackIn_71_1 = 0;
        boolean stackIn_72_2 = false;
        RuntimeException decompiledCaughtException = null;
        ke var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var3 = field_N;
        try {
          f.field_a.serviceOutput();
          jl.field_d.serviceOutput();
          stackIn_5_1 = (sj.field_f != null);
          this.a(stackIn_5_1, -73);
          if (ri.field_z) {
            this.k(-16);
            ri.field_z = false;
          }
          if (param0 != 37) {
            return;
          }
          if (sj.field_f != null &&
            sj.field_f.focusLost) {
            v.d((byte) 121);
            mh.a(sj.field_f, (byte) 80);
            sj.field_f.exitFullscreen((byte) -121, ck.field_e);
            sj.field_f = null;
            ch.field_h.requestFocus();
          }
          if (ci.k(-31077)) {
            this.g(0);
            if (!hi.a((byte) -118)) {
              return;
            }
            this.b(false, param0 + 3097);
            if (var3 == 0) {
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (AwtRasterBuffer.field_c) {
            if ((bh.field_d != null) &&
              (decompiledFrameRemainder0 = !(!bh.field_d.field_g))) {
              ui.field_g = ui.field_g | bh.field_d.field_k;
              kb.field_a = kb.field_a & ~bh.field_d.field_k;
              bh.field_d = null;
              if (0 < kb.field_a) {
                MusicPatchPcmStream.field_o.field_e = false;
                MusicPatchPcmStream.field_o.field_l = true;
              }
              ed.a((byte) -127);
              var2 = (ke) (IterableNodeHashTable.field_c.beginForward((byte) -104));
              while (null != var2) {
                re.a((byte) 109, var2, 4);
                var2 = (ke) (IterableNodeHashTable.field_c.nextForward((byte) 70));
                if (var3 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                decompiledFrameRemainder0 = (var3 != 0);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0)) {
              if (vc.d((byte) 122)) {
                var2_int = DiskCacheWorker.c(param0 + 88);
                if (var2_int == 2 &&
                  sj.field_f != null) {
                  mh.a(sj.field_f, (byte) 111);
                  sj.field_f.exitFullscreen((byte) -121, ck.field_e);
                  sj.field_f = null;
                  ch.field_h.requestFocus();
                }
                if (var2_int == 3) {
                  AccountNameAvailabilityValidator.d(30432);
                }
                if (4 == var2_int) {
                  nl.a((byte) 122);
                  fb.field_nb = true;
                }
                return;
              }
              if (!g.a(false)) {
                this.l(-124);
                decompiledFrameRemainder0 = (var3 != 0);
              }
              if (decompiledFrameRemainder0) {
                stackIn_71_1 = -119;
                stackIn_72_2 = (null != sj.field_f);
                var2_intLifetime2 = oj.a((GameClient) (this), stackIn_71_1, stackIn_72_2);
                if (1 != var2_intLifetime2) {
                  if (2 == var2_intLifetime2) {
                    if (null != sj.field_f) {
                      mh.a(sj.field_f, (byte) 103);
                      sj.field_f.exitFullscreen((byte) -115, ck.field_e);
                      sj.field_f = null;
                      ch.field_h.requestFocus();
                    }
                    tc.a(DiskCacheWorker.b(param0 ^ 37), 6091);
                    if ((var3 != 0) &&
                      (null != sj.field_f)) {
                      mh.a(sj.field_f, (byte) 121);
                      sj.field_f.exitFullscreen((byte) -127, ck.field_e);
                      sj.field_f = null;
                      ch.field_h.requestFocus();
                    }
                  }
                } else {
                  if (null != sj.field_f) {
                    mh.a(sj.field_f, (byte) 121);
                    sj.field_f.exitFullscreen((byte) -127, ck.field_e);
                    sj.field_f = null;
                    ch.field_h.requestFocus();
                  }
                }
                if (var3 != 0) {
                  this.b(true, 3134);
                }
              }
            }
          } else {
            this.b(true, 3134);
          }
          do {
            if (!s.a(true, ce.field_n)) {
              jj.a(0, true);
              break;
            }
            this.j(-4);
          } while (var3 == 0);
          if (!tb.e(-11)) {
            return;
          }
          var2_intLifetime1 = this.h(param0 ^ 36);
          if (var2_intLifetime1 == 0 ||
            var2_intLifetime1 == 1) {
            rk.a(3, (byte) -29);
            ih.a(4, -1);
          }
          if (var2_intLifetime1 != 2) {
            return;
          }
          vk.a(240, (RgbSprite[]) null, 320, gk.field_e.field_s, cl.field_p[0].field_o, od.field_f.field_s, gk.field_e.field_s, 3, 2, gk.field_e, od.field_f, (RgbSprite[]) null, cl.field_p[0].field_t, od.field_f.field_s);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) var2_ref), "Bounce.V(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        int incrementValue$0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_16_0 = false;
        boolean stackIn_25_0 = false;
        int stackIn_31_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_24_0;
        boolean stackOut_15_0;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = field_N;
        try {
          if (param5 <= param3) {
            return;
          }
          if (param1 <= (1 + param3)) {
            return;
          }
          if (param1 > (5 + param3) &&
            ~param0 != ~param4) {
            var7_int = (param4 & param0 & 1) + (param4 >> 1) + (param0 >> 1);
            var8 = param3;
            var9 = param4;
            var10 = param0;
            var11 = param3;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var11 >= param1))) {
              var12 = w.field_f[var11];
              stackOut_24_0 = param6;
              stackIn_44_0 = stackOut_24_0 ? 1 : 0;
              stackIn_25_0 = stackOut_24_0;
              if (var14 == 0) {
                if (stackIn_25_0) {
                  stackIn_31_0 = sj.field_j[var12];
                } else {
                  stackIn_31_0 = ij.field_b[var12];
                }
                var13 = stackIn_31_0;
                if (var7_int < var13) {
                  w.field_f[var11] = w.field_f[var8];
                  incrementValue$0 = var8;
                  var8++;
                  w.field_f[incrementValue$0] = var12;
                  if (var13 < var9) {
                    var9 = var13;
                  }
                } else {
                  if (var13 > var10) {
                    var10 = var13;
                  }
                }
                var11++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              Bounce.a(var9, var8, 22668, param3, param4, param5, param6);
              stackIn_44_0 = param0;
            }
            Bounce.a(stackIn_44_0, param1, param2, var8, var10, param5, param6);
            return;
          }
          var7_intLifetime1 = -1 + param1;
          scanLoop1: while (true) {
            stackIn_12_0 = ~var7_intLifetime1;
            scanLoop2: while (stackIn_12_0 < ~param3) {
              var8Lifetime1 = param3;
              while (var7_intLifetime1 > var8Lifetime1) {
                var9Lifetime1 = w.field_f[var8Lifetime1];
                var10Lifetime1 = w.field_f[1 + var8Lifetime1];
                stackOut_15_0 = hc.a(var9Lifetime1, param6, var10Lifetime1, (byte) 97);
                stackIn_12_0 = stackOut_15_0 ? 1 : 0;
                stackIn_16_0 = stackOut_15_0;
                if (var14 != 0) {
                  continue scanLoop2;
                }
                if (stackIn_16_0) {
                  w.field_f[var8Lifetime1] = var10Lifetime1;
                  w.field_f[1 + var8Lifetime1] = var9Lifetime1;
                }
                var8Lifetime1++;
              }
              var7_intLifetime1--;
              if (var14 == 0) {
                continue scanLoop1;
              }
              return;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) var7), "Bounce.RA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public final void init() {
        try {
          this.a(11, (byte) 122, "bouncedown");
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "Bounce.init()");
        }
    }

    final void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != f.field_a) {
            f.field_a.dispose();
          }
          if (jl.field_d != null) {
            jl.field_d.dispose();
          }
          if (param0 != -111) {
            this.field_E = true;
          }
          if (sj.field_f != null) {
            mh.a(sj.field_f, (byte) 101);
            sj.field_f.exitFullscreen((byte) -122, ck.field_e);
            sj.field_f = null;
            ch.field_h.requestFocus();
          }
          td.a((byte) 18);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) var2), "Bounce.CA(" + param0 + ')');
        }
    }

    public static void k(byte param0) {
        try {
          field_A = null;
          field_G = null;
          int var1_int = -98 / ((-25 - param0) / 60);
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "Bounce.SA(" + param0 + ')');
        }
    }

    private final void b(boolean param0, int param1) {
        Throwable decompiledCaughtException = null;
        PcmResampler var3 = null;
        Object var3_ref = null;
        int var3_int = 0;
        Object var3_ref2 = null;
        RuntimeException var3_ref3 = null;
        int var5 = 0;
        var5 = field_N;
        try {
          SectorCacheStore.a(32459);
          qe.a((byte) -37, va.field_a);
          if (ca.field_e != null) {
            if (null != pa.field_c && (!pa.field_c.c(-79) ||
              !pa.field_c.a((byte) -41))) {
              hg.a(hg.a(nl.field_a, pa.field_c, 130, AppletShell.field_k), -99, 10.0f);
              return;
            }
            if (IntrusiveNode.field_e != null && (!IntrusiveNode.field_e.c(51) ||
              !IntrusiveNode.field_e.a((byte) -109))) {
              hg.a(hg.a(nl.field_a, IntrusiveNode.field_e, 130, AppletShell.field_k), -114, 20.0f);
              return;
            }
            if (null != MidiPcmStream.field_D && (!MidiPcmStream.field_D.c(67) ||
              !MidiPcmStream.field_D.a((byte) -43))) {
              hg.a(hg.a(ke.field_n, MidiPcmStream.field_D, param1 ^ 3260, vk.field_e), -120, 30.0f);
              return;
            }
            if (ca.field_e != null && (!ca.field_e.c(param1 - 3027) ||
              !ca.field_e.a((byte) -113))) {
              hg.a(hg.a(ke.field_n, ca.field_e, 130, vk.field_e), param1 - 3156, 40.0f);
              return;
            }
            if (null != ub.field_a && (!ub.field_a.c(94) ||
              !ub.field_a.a((byte) -101))) {
              hg.a(hg.a(dk.field_b, ub.field_a, 130, fi.field_a), -86, 50.0f);
              return;
            }
            if (j.field_j != null && (!j.field_j.c(param1 - 3219) ||
              !j.field_j.b("basic", false))) {
              hg.a(fb.a((byte) -67, dk.field_b, fi.field_a, j.field_j, "basic"), -39, 60.0f);
              return;
            }
            if (va.field_c != null && (!va.field_c.c(param1 - 3244) ||
              !va.field_c.a((byte) -46))) {
              hg.a(fb.a((byte) -92, AccountNameAvailabilityValidator.field_k, vc.field_B, va.field_c, ""), param1 ^ -3159, 80.0f);
              return;
            }
            if (!param0) {
              return;
            }
            ed.a((byte) -127);
            hg.a(SecondaryNodeDequeIterator.field_a, param1 - 3248, 85.0f);
            this.e(4);
            var3 = new PcmResampler(22050, AudioOutput.field_r);
            il.field_a[0] = ei.a(pa.field_c, "", "dissolve1").b().resample(var3);
            il.field_a[3] = ei.a(pa.field_c, "", "slime_grows").b().resample(var3);
            il.field_a[4] = ei.a(pa.field_c, "", "slime_jump").b().resample(var3);
            il.field_a[5] = ei.a(pa.field_c, "", "slime_jump_large").b().resample(var3);
            il.field_a[6] = ei.a(pa.field_c, "", "slime_jump_small").b().resample(var3);
            il.field_a[7] = ei.a(pa.field_c, "", "slime_land").b().resample(var3);
            il.field_a[8] = ei.a(pa.field_c, "", "slime_reduces").b().resample(var3);
            il.field_a[9] = ei.a(pa.field_c, "", "squish").b().resample(var3);
            hg.a(SecondaryNodeDequeIterator.field_a, -21, 90.0f);
            this.e(4);
            il.field_a[11] = te.a(IntrusiveNode.field_e, "", "slime_eek").a().resample(var3);
            il.field_a[12] = te.a(IntrusiveNode.field_e, "", "slime_falls").a().resample(var3);
            il.field_a[13] = te.a(IntrusiveNode.field_e, "", "slime_laughs").a().resample(var3);
            il.field_a[14] = te.a(IntrusiveNode.field_e, "", "slime_ooh").a().resample(var3);
            il.field_a[15] = te.a(IntrusiveNode.field_e, "", "slime_ow").a().resample(var3);
            hg.a(va.field_g, -125, 95.0f);
            var3_ref = null;
            this.e(4);
            AccountCreationResultPanel.field_mb = be.a(ca.field_e, "", "bounce down title screen");
            wj.field_c = be.a(ca.field_e, "", "bounce");
            ca.field_e = null;
            cf.field_d = new i(pa.field_c, IntrusiveNode.field_e);
            IntrusiveNode.field_e = null;
            pa.field_c = null;
            vc.e((byte) -44);
            return;
          }
          if (MidiPcmStream.field_D != null) {
            if (!ld.field_l.a((byte) -122, cf.field_d, MidiPcmStream.field_D, AccountCreationResultPanel.field_mb, 176400)) {
              return;
            }
            if (!ld.field_l.a((byte) -124, cf.field_d, MidiPcmStream.field_D, wj.field_c, 176400)) {
              return;
            }
            ld.field_l.e(param1 ^ 3118);
            MidiPcmStream.field_D = null;
            cf.field_d = null;
            vc.e((byte) -44);
            return;
          }
          if (null == ub.field_a) {
            PcmResampler.field_g = false;
            var3_int = 0;
            do {
              if (!(var3_int < ua.field_b)) {
                ua.field_b = 0;
                break;
              }
              ua.field_c[var3_int] = new Platform();
              var3_int++;
            } while (var5 == 0);
            var3_int = 0;
            do {
              if (var3_int >= 480) {
                ua.field_c[ua.field_b].a(81, 6, (double)(int)(64.0 + Math.random() * 384.0));
                ua.field_b = ua.field_b + 1;
                ua.field_c[ua.field_b].a(89, 6, (double)(int)(Math.random() * 384.0 + 64.0));
                ua.field_b = ua.field_b + 1;
                ua.field_c[ua.field_b].a(60, 6, (double)(int)(384.0 * Math.random() + 64.0));
                ua.field_b = ua.field_b + 1;
                he.field_n[0] = new Slime();
                he.field_n[1] = new Slime();
                he.field_n[2] = new Slime();
                ui.a(50, (byte) 127);
                jl.field_h = this;
                break;
              }
              ua.field_c[ua.field_b].a(42, 0, (double)(int)(Math.random() * 384.0 + 64.0));
              ua.field_c[ua.field_b].field_h = (double)var3_int;
              ua.field_b = ua.field_b + 1;
              var3_int += 64;
            } while (var5 == 0);
            if (param1 != 3134) {
              this.field_E = true;
            }
            MusicPatchPcmStream.field_o = new mj();
            var3_ref2 = jl.field_d;
            synchronized (var3_ref2) {
              ld.field_l.g(jd.field_a / 2, 100);
              ld.field_l.a(AccountCreationResultPanel.field_mb, true, 85);
              jl.field_d.flushAndMarkDrainCheck();
            }
            if (!jh.b(767564065)) {
              bh.field_d = NetworkArchiveRequest.a(-97, 4);
            }
            AwtRasterBuffer.field_c = true;
            vc.e((byte) -44);
            return;
          }
          hg.a(he.field_i, -75, 99.0f);
          this.e(4);
          gk.field_e = q.a(param1 ^ -3135, va.field_c, "b12", ub.field_a, "");
          jh.field_s = q.a(-1, va.field_c, "comic20", ub.field_a, "");
          od.field_f = q.a(-1, va.field_c, "newfont", ub.field_a, "");
          l.field_e = nc.a("title", ub.field_a, "", 0);
          ej.field_a = nc.a("title_achievements", ub.field_a, "", param1 - 3134);
          AccountRequestState.field_b = nc.a("title_highscores", ub.field_a, "", 0);
          mi.field_k = nc.a("title_instructions", ub.field_a, "", 0);
          cl.field_p = SectorCacheStore.a(ub.field_a, "", (byte) -13, "frame");
          ig.field_d = SectorCacheStore.a(ub.field_a, "", (byte) 117, "frame_50");
          jc.field_n = nc.a("welldone", ub.field_a, "", param1 ^ 3134);
          ph.field_b = nc.a("betterluck", ub.field_a, "", 0);
          if (SectorCacheStore.a(0, (byte) 88)) {
            mb.field_q = nc.a("bg_halloween", ub.field_a, "", 0);
            uk.field_f = SectorCacheStore.a(ub.field_a, "", (byte) 118, "bats");
            if (var5 != 0) {
              mb.field_q = nc.a("background", ub.field_a, "", 0);
            }
          } else {
            mb.field_q = nc.a("background", ub.field_a, "", 0);
          }
          BufferedSocket.field_o = nc.a("wall", ub.field_a, "", param1 - 3134);
          PacketBuffer.field_j = nc.a("topspikes", ub.field_a, "", param1 ^ 3134);
          vb.field_m = SectorCacheStore.a(ub.field_a, "", (byte) -68, "squish");
          se.field_A = nc.a("spikes", ub.field_a, "", param1 ^ 3134);
          nc.a("scorebox", ub.field_a, "", 0);
          hd.field_a = SectorCacheStore.a(ub.field_a, "", (byte) -115, "pupils");
          ci.field_G = SectorCacheStore.a(ub.field_a, "", (byte) 111, "pops");
          Platform.field_a = SectorCacheStore.a(ub.field_a, "", (byte) 119, "players");
          va.field_d = SectorCacheStore.a(ub.field_a, "", (byte) -38, "newhighscore");
          re.field_a = nc.a("plat1", ub.field_a, "", 0);
          a.field_f = nc.a("plat1b", ub.field_a, "", 0);
          q.field_F = nc.a("plat2", ub.field_a, "", 0);
          ge.field_b = nc.a("eye", ub.field_a, "", 0);
          wj.field_d = SectorCacheStore.a(ub.field_a, "", (byte) -63, "mouths");
          ld.field_h = SectorCacheStore.a(ub.field_a, "", (byte) -116, "fire");
          w.field_c = SectorCacheStore.a(ub.field_a, "", (byte) -81, "burns");
          kc.field_c = nc.a("plat0", ub.field_a, "", 0);
          fd.field_n = SectorCacheStore.a(ub.field_a, "", (byte) 125, "plat3");
          nk.field_h = SectorCacheStore.a(ub.field_a, "", (byte) 117, "plat4");
          bd.field_j = SectorCacheStore.a(ub.field_a, "", (byte) 120, "plat4grw");
          wb.field_e = SectorCacheStore.a(ub.field_a, "", (byte) 10, "plat4shr");
          nl.field_d = SectorCacheStore.a(ub.field_a, "", (byte) -15, "plat4spi");
          nc.a("clickme", ub.field_a, "", param1 - 3134);
          DualLinkNode.field_h = SectorCacheStore.a(ub.field_a, "", (byte) 108, "achievements");
          cf.field_c = nc.a("unachieved", j.field_j, "basic", 0);
          nc.a("orbcoin", j.field_j, "basic", 0);
          pe.field_a = SectorCacheStore.a(ub.field_a, "", (byte) 114, "wins");
          mc.field_b = SectorCacheStore.a(ub.field_a, "", (byte) -94, "draw");
          nc.a("instructions", ub.field_a, "", 0);
          nc.a("highscorebutton", ub.field_a, "", 0);
          nc.a("1player", ub.field_a, "", 0);
          nc.a("2player", ub.field_a, "", param1 - 3134);
          nc.a("3player", ub.field_a, "", param1 - 3134);
          SectorCacheStore.a(ub.field_a, "", (byte) 114, "arrows");
          nc.a("fullscreen", ub.field_a, "", param1 ^ 3134);
          nc.a("musicon", ub.field_a, "", 0);
          nc.a("musicoff", ub.field_a, "", 0);
          nc.a("soundon", ub.field_a, "", 0);
          nc.a("soundoff", ub.field_a, "", param1 ^ 3134);
          nc.a("quitgame", ub.field_a, "", 0);
          nc.a("instruct", ub.field_a, "", 0);
          ec.a(gk.field_e, 4, 16777215, 0, od.field_f, 240, (RgbSprite[]) null, 8, 320, 20, -35, 20, (RgbSprite[]) null, 320, 16741888, 14, (RgbSprite[]) null, 8, 20, 16697912, 0);
          ag.field_c = 16777215;
          ub.field_a = null;
          DirectByteStorage.field_f = 16697912;
          IntrusiveDeque.field_a = 16741888;
          vc.e((byte) -44);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref3 = (RuntimeException) (Object) decompiledCaughtException;
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) var3_ref3), "Bounce.PA(" + param0 + ',' + param1 + ')');
        }
    }

    final void c(byte param0) {
        this.a(9, 0, 10, 3, 7, 8764, false, 8);
        AudioOutput.configureAudio(22050, true, 10);
        f.field_a = AudioOutput.createOutput(ck.field_e, (java.awt.Component) ((Object) ch.field_h), 0, 512);
        jl.field_d = AudioOutput.createOutput(ck.field_e, (java.awt.Component) ((Object) ch.field_h), 1, 22050);
        nj.field_l = new PcmStreamMixer();
        f.field_a.setRootStream(nj.field_l);
        bk.field_c = 1;
        ca.field_a = new int[1];
        eh.field_b = null;
        ld.field_l = new MidiPcmStream();
        if (param0 != -6) {
          return;
        }
        try {
          ld.field_l.b((byte) 114, 128, 9);
          jl.field_d.setRootStream(ld.field_l);
          ff.field_C = 0.0;
          eg.field_n = 0;
          this.a(true, false, 22422, false, false);
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "Bounce.EA(" + param0 + ')');
        }
    }

    private final void c(boolean param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0) {
            this.c((byte) -116);
          }
          if (0 < param1 &&
            !jh.b(767564065)) {
            ti.field_O = param1;
            qc.field_a = pb.a(new int[]{param1}, l.field_c, jd.field_e, vd.field_a, ec.field_cb, 3, 13, 65522, (byte) 98);
            pe.field_f = pe.a(3, 10, 1, -16947, 13);
          }
          if (jh.b(767564065)) {
            qf.field_b = 0;
            rj.field_j = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) var3), "Bounce.NA(" + param0 + ',' + param1 + ')');
        }
    }

    final void e(int param0) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        Object stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        ie stackIn_320_0 = null;
        int stackIn_320_1 = 0;
        boolean stackIn_320_2 = false;
        boolean stackIn_321_3 = false;
        boolean stackIn_325_4 = false;
        Object stackIn_328_0;
        String stackIn_328_1;
        boolean stackIn_328_2;
        int stackIn_328_3;
        boolean stackIn_329_4 = false;
        ie stackIn_332_0 = null;
        int stackIn_332_1 = 0;
        boolean stackIn_332_2 = false;
        boolean stackIn_333_3 = false;
        boolean stackIn_337_4 = false;
        Object stackIn_340_0;
        String stackIn_340_1;
        boolean stackIn_340_2;
        int stackIn_340_3;
        boolean stackIn_341_4 = false;
        ie stackIn_344_0 = null;
        boolean stackIn_345_1 = false;
        boolean stackIn_349_2 = false;
        int stackIn_362_0 = 0;
        boolean stackIn_363_1 = false;
        Throwable decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        Object var5 = null;
        ab var5_ref = null;
        int var6_int = 0;
        ie var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var6_intLifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        var9 = field_N;
        try {
          if (sj.field_f != null) {
            stackIn_5_0 = sj.field_f;
          } else {
            stackIn_5_0 = ch.field_h;
          }
          var2 = stackIn_5_0;
          if (ci.k(-31077)) {
            stackIn_11_0 = var2;
            if (null != sj.field_f) {
              stackIn_12_1 = true;
            } else {
              stackIn_12_1 = gk.field_f;
            }
            ke.a((java.awt.Canvas) (stackIn_11_0), stackIn_12_1, true);
            return;
          }
          if (!AwtRasterBuffer.field_c) {
            i.a((java.awt.Canvas) (var2), 0);
            return;
          }
          if (null != bh.field_d) {
            i.a((java.awt.Canvas) (var2), 0);
            return;
          }
          if (param0 != 4) {
            this.field_K = 119;
          }
          var3 = 64;
          mb.field_q.b(0, 0);
          SoftwareRasterizer.setClip(var3, 0, var3 + 512, 446);
          PacketBuffer.field_j.a(var3, eg.field_n);
          PacketBuffer.field_j.a(128 + var3, eg.field_n);
          PacketBuffer.field_j.a(var3 + 256, eg.field_n);
          PacketBuffer.field_j.a(384 + var3, eg.field_n);
          var4 = i.field_a / 8 % 8;
          var5_int = 0;
          do {
            if (640 <= var5_int) {
              SoftwareRasterizer.resetClip();
              BufferedSocket.field_o.a(-BufferedSocket.field_o.field_s + 640, 0);
              BufferedSocket.field_o.d(0, 0);
              SoftwareRasterizer.setClip(var3, 0, var3 + 512, 446);
              break;
            }
            var4 = (3 + var4) % 8;
            ld.field_h[var4].b(var5_int, 0, -741572379, var5_int % 20 + 128, 414);
            var5_int += 32;
          } while (var9 == 0);
          var5_int = 0;
          do {
            if (!(ua.field_b > var5_int)) {
              var5_int = 0;
              break;
            }
            ua.field_c[var5_int].a(1, var3);
            var5_int++;
          } while (var9 == 0);
          scanLoop1: while (true) {
            if (vk.field_b > var5_int) {
              he.field_n[var5_int].a(var5_int, false, var3);
              var5_int++;
              if (var9 == 0) {
                continue;
              }
            } else {
              if (MusicPatchPcmStream.field_o == null) {
                break scanLoop1;
              }
              he.field_n[0].field_n = 3;
              he.field_n[1].field_n = 3;
            }
            he.field_n[2].field_n = 3;
            break;
          }
          if (null != MusicPatchPcmStream.field_o &&
            MusicPatchPcmStream.field_o.field_d) {
            vk.field_b = 3;
          }
          regionExit2: {
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameCompleted1 = true;
            SoftwareRasterizer.resetClip();
            if (PcmResampler.field_g) {
              if (vk.field_b == 1 &&
                he.field_n[0].field_n > 1) {
                he.field_n[0].field_n = 1;
              }
              boolean decompiledFrameCompleted2 = true;
              if (vk.field_b > 0) {
                var5_int = 1;
                while (!(he.field_n[0].field_n <= var5_int)) {
                  Platform.field_a[0].b(8 * (var5_int * 2 - he.field_n[0].field_n) + var3 / 2, 0, param0 - 741572383, 32, var3 / 2 + 16);
                  var5_int++;
                  if (var9 != 0) {
                    decompiledFrameCompleted2 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted2) &&
                (vk.field_b > 1)) {
                var5_int = 1;
                while (!(var5_int >= he.field_n[1].field_n)) {
                  Platform.field_a[1].b(640 - var3 / 2 + (-he.field_n[1].field_n + 2 * var5_int) * 8, 0, -741572379, 32, var3 / 2 + 16);
                  var5_int++;
                  if (var9 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted1) &&
                (2 < vk.field_b)) {
                var5_int = 1;
                while (!(he.field_n[2].field_n <= var5_int)) {
                  Platform.field_a[2].b(8 * (var5_int * 2 - he.field_n[2].field_n) + var3 / 2, 0, -741572379, 32, 16 + var3 / 2 + 240);
                  var5_int++;
                  if (var9 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
              }
            }
            if ((decompiledFrameCompleted0) && (he.field_n[0].field_n > 0 &&
              he.field_n[1].field_n > 0 &&
              he.field_n[2].field_n > 0)) {
              break regionExit2;
            }
            if (-1 == jk.field_q) {
              var5_int = -1;
              if (he.field_n[0].field_n > 0) {
                var5_int = 0;
              }
              if (vk.field_b > 1) {
                if (he.field_n[1].field_n > 0 &&
                  var5_int == -1) {
                  var5_int = 1;
                }
                if (he.field_n[1].field_n > 0 &&
                  var5_int != 1) {
                  var5_int = -1;
                }
              }
              if (vk.field_b > 2) {
                if (he.field_n[2].field_n > 0 &&
                  var5_int == -1) {
                  var5_int = 2;
                }
                if (he.field_n[2].field_n > 0 &&
                  var5_int != 2) {
                  var5_int = -1;
                }
              }
              if (var5_int != -1) {
                wj.field_e = 1;
                jk.field_q = var5_int;
              }
              if (3 == vk.field_b &&
                he.field_n[0].field_n <= 0 &&
                he.field_n[1].field_n <= 0 &&
                he.field_n[2].field_n <= 0) {
                wj.field_e = 1;
                jk.field_q = 3;
              }
              if (2 == vk.field_b &&
                he.field_n[0].field_n <= 0 &&
                he.field_n[1].field_n <= 0) {
                jk.field_q = 3;
                wj.field_e = 1;
              }
              if (vk.field_b == 1 &&
                0 >= he.field_n[0].field_n) {
                wj.field_e = 1;
                jk.field_q = 4;
                if (ca.field_a[0] / 2 > fa.field_c) {
                  jk.field_q = 6;
                }
                if (ca.field_a[0] < fa.field_c) {
                  jk.field_q = 5;
                }
              }
              if (var9 == 0) {
                break regionExit2;
              }
            }
            if (wj.field_e > 255) {
              if (4 == jk.field_q ||
                5 == jk.field_q ||
                6 == jk.field_q) {
                eh.field_b = null;
                this.c(false, fa.field_c);
              }
              jk.field_q = -1;
              var5_int = 0;
              scanLoop3: while (true) {
                if (3 > var5_int) {
                  he.field_n[var5_int].a(true);
                  var5_int++;
                  if (var9 == 0) {
                    continue;
                  }
                } else {
                  if (!PcmResampler.field_g) {
                    break scanLoop3;
                  }
                  PcmResampler.field_g = false;
                }
                if (null != MusicPatchPcmStream.field_o) {
                  MusicPatchPcmStream.field_o.field_b = true;
                  if (var9 != 0) {
                    MusicPatchPcmStream.field_o = new mj();
                  }
                } else {
                  MusicPatchPcmStream.field_o = new mj();
                }
                if (vk.field_b == 1) {
                  if (kb.field_a <= 0) {
                    MusicPatchPcmStream.field_o.field_n = 11;
                    MusicPatchPcmStream.field_o.field_e = true;
                    if (var9 != 0) {
                      MusicPatchPcmStream.field_o.field_l = true;
                    }
                  } else {
                    MusicPatchPcmStream.field_o.field_l = true;
                  }
                }
                if (rd.field_a) {
                  var5 = jl.field_d;
                  synchronized (var5) {
                    ld.field_l.a(AccountCreationResultPanel.field_mb, true, param0 ^ 98);
                    jl.field_d.flushAndMarkDrainCheck();
                  }
                }
                break;
              }
              vk.field_b = 3;
              ta.field_c = 1.0;
            }
          }
          if (-1 != jk.field_q &&
            PcmResampler.field_g) {
            SoftwareRasterizer.fillRectangleAlpha(64, 0, 512, 480, 0, 64);
            if (jk.field_q == 0 ||
              jk.field_q == 1 ||
              jk.field_q == 2) {
              var5_int = wj.field_e / 5 % 5 + jk.field_q * 6;
              pe.field_a[var5_int].b(320, 0, -741572379, 128, 240);
            }
            if (jk.field_q == 3) {
              var5_int = wj.field_e / 20 % 8;
              mc.field_b[var5_int].b(320, 0, -741572379, 128, 240);
            }
            if (jk.field_q == 4) {
              jc.field_n.b(320, 0, -741572379, 128, 240);
            }
            if (jk.field_q == 5) {
              var5_int = wj.field_e / 5 % 5;
              va.field_d[var5_int].b(320, 0, -741572379, 128, 240);
            }
            if (6 == jk.field_q) {
              ph.field_b.b(320, 0, -741572379, 128, 240);
            }
          }
          boolean decompiledFrameRemainder1 = true;
          if ((PcmResampler.field_g) &&
            (decompiledFrameRemainder1 = (null != MusicPatchPcmStream.field_o)) &&
            (decompiledFrameRemainder1 = (rj.field_j == -1))) {
            MusicPatchPcmStream.field_o.a(23417);
            decompiledFrameRemainder1 = (var9 != 0);
          }
          if (decompiledFrameRemainder1) {
            SoftwareRasterizer.fillRectangleAlpha(var3, 0, 512, 480, 0, 112);
            if (bk.field_c == 1) {
            }
            if (3 != bk.field_c) {
            }
            if (bk.field_c == 2) {
            }
            SoftwareRasterizer.resetClip();
            if (null != MusicPatchPcmStream.field_o &&
              rj.field_j == -1) {
              MusicPatchPcmStream.field_o.a(23417);
            }
          }
          if (vk.field_b == 1 ||
            !PcmResampler.field_g) {
            if (he.field_n[0].field_n > 1) {
              he.field_n[0].field_n = 1;
            }
            if (PcmResampler.field_g) {
              var5_int = od.field_f.b(ui.field_j + "100000");
              SoftwareRasterizer.fillRectangle(-4 - var5_int / 2 + 322, 451, 8 + (var5_int - 4), 26, 0);
              ve.a(30, 449, ig.field_d, (byte) -100, var5_int + 8, -(var5_int / 2) + 316);
              var6_int = od.field_f.b(ui.field_j + fa.field_c);
              var7 = od.field_f.b(ui.field_j);
              od.field_f.b(ui.field_j, 320 - var6_int / 2, 471, 16777215, -1);
              od.field_f.b(Integer.toString(fa.field_c), var7 + (320 - var6_int / 2), 473, 16777215, -1);
            }
          }
          var5_ref = (ab) (ci.field_F.beginForward((byte) -48));
          if (var5_ref != null) {
            var7Lifetime1 = this.field_H;
            if (var7Lifetime1 < 80) {
              var6_intLifetime1 = var7Lifetime1 / 2 - 32;
              if (var9 != 0) {
                if (var7Lifetime1 >= 230) {
                  var6_intLifetime1 = 123 - var7Lifetime1 / 2;
                  var6_intLifetime1 = 8;
                } else {
                  var6_intLifetime1 = 8;
                }
              }
            } else {
              if (var7Lifetime1 >= 230) {
                var6_intLifetime1 = 123 - var7Lifetime1 / 2;
                if (var9 != 0) {
                  var6_intLifetime1 = 8;
                }
              } else {
                var6_intLifetime1 = 8;
              }
            }
            SoftwareRasterizer.drawRectangleOutline(4, var6_intLifetime1 - 4, 56 + od.field_f.b(lj.field_b[var5_ref.field_h]), 40, 0);
            SoftwareRasterizer.drawRectangleOutline(5, var6_intLifetime1 - 3, od.field_f.b(lj.field_b[var5_ref.field_h]) + 54, 38, 16741888);
            SoftwareRasterizer.drawRectangleOutline(6, var6_intLifetime1 - 2, 52 + od.field_f.b(lj.field_b[var5_ref.field_h]), 36, 0);
            DualLinkNode.field_h[var5_ref.field_h].b(8, var6_intLifetime1, 32, 32);
            od.field_f.b(lj.field_b[var5_ref.field_h], 47, var6_intLifetime1 + od.field_f.field_s, 0, 0);
            od.field_f.b(lj.field_b[var5_ref.field_h], 48, od.field_f.field_s + (-1 + var6_intLifetime1), 0, 0);
            od.field_f.b(lj.field_b[var5_ref.field_h], 48, od.field_f.field_s + var6_intLifetime1, 16746496, -1);
          }
          boolean decompiledFrameRemainder0 = true;
          if (-1 != rj.field_j) {
            if (rj.field_j == 2 ||
              rj.field_j == 3) {
              if (jh.b(767564065)) {
                if (rj.field_j == 3) {
                  rj.field_j = -1;
                  decompiledFrameRemainder0 = (var9 != 0);
                }
                if (decompiledFrameRemainder0) {
                  this.field_K = 0;
                  rj.field_j = 0;
                  decompiledFrameRemainder0 = (var9 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                bh.field_d = NetworkArchiveRequest.a(-77, 4);
                rj.field_j = -1;
                this.c(false, fa.field_c);
                decompiledFrameRemainder0 = (var9 != 0);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (rj.field_j == 0)) {
              var6 = gk.field_e;
              var7Lifetime2 = 200 + var6.field_s;
              var8 = var6.field_F + var6.field_x + 4;
              SoftwareRasterizer.fillRectangle(112, 190, 416, 64 + 5 * var8 + 20, 0);
              ve.a(84 + (5 * var8 + 6), 187, ig.field_d, (byte) -94, 422, 109);
              var6.a(tc.field_q, 320, var7Lifetime2, 16777088, -1);
              stackIn_320_0 = var6;
              stackIn_320_1 = param0 ^ 0;
              stackIn_320_2 = false;
              stackIn_321_3 = (kb.field_a != 0);
              stackIn_325_4 = (fa.field_c != 0);
              ((ie) (Object) stackIn_320_0).a(he.a(stackIn_320_1, stackIn_320_2, stackIn_321_3, stackIn_325_4), 320, var7Lifetime2 + var8, 16777088, -1);
              stackIn_328_0 = this;
              stackIn_328_1 = qe.field_c;
              stackIn_328_2 = this.field_L;
              stackIn_328_3 = 320;
              stackIn_329_4 = (qf.field_b == 0);
              discarded$0 = this.a(stackIn_328_1, stackIn_328_2, stackIn_328_3, stackIn_329_4, var7Lifetime2 + var8 * 3, (byte) 93, 13535232);
              stackIn_332_0 = var6;
              stackIn_332_1 = 59;
              stackIn_332_2 = false;
              stackIn_333_3 = (kb.field_a != 0);
              stackIn_337_4 = (0 != fa.field_c);
              ((ie) (Object) stackIn_332_0).a(ld.$cfr$intArgs$a$c7de0d339b2a(stackIn_332_1, stackIn_332_2, stackIn_333_3, stackIn_337_4), 320, 32 + (var7Lifetime2 + 3 * var8), 16777088, -1);
              stackIn_340_0 = this;
              stackIn_340_1 = db.field_T;
              stackIn_340_2 = this.field_L;
              stackIn_340_3 = 320;
              stackIn_341_4 = (qf.field_b == 1);
              discarded$1 = this.a(stackIn_340_1, stackIn_340_2, stackIn_340_3, stackIn_341_4, var8 / 2 + var7Lifetime2 + var8 * 4 + 32, (byte) 93, 13535232);
              stackIn_344_0 = var6;
              stackIn_345_1 = (fa.field_c != 0);
              stackIn_349_2 = (kb.field_a != 0);
              ((ie) (Object) stackIn_344_0).a(rk.a(stackIn_345_1, stackIn_349_2, 4, false), 320, 64 + (var8 * 4 + var7Lifetime2), 16777088, -1);
            }
          }
          boolean decompiledSharedTail0 = !(vc.d((byte) 119));
          if (!decompiledSharedTail0) {
            SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, 128);
            SoftwareRasterizer.fillRectangle(-7 - hj.a(24777) / 2 + 320, 240 - (nd.a(-21065) / 2 + 8), 14 + hj.a(24777), 16 + nd.a(-21065), 0);
            PacketBuffer.a(ig.field_d, 12, 12, (byte) -126);
            decompiledSharedTail0 = (var9 != 0);
          }
          if ((decompiledSharedTail0) &&
            (g.a(false))) {
            stackIn_362_0 = 125;
            stackIn_363_1 = (null != sj.field_f);
            ha.a(stackIn_362_0, stackIn_363_1);
          }
          qi.a((java.awt.Canvas) (var2), 0, 0, -25971);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) var2_ref), "Bounce.U(" + param0 + ')');
        }
    }

    public Bounce() {
        this.field_K = 0;
        this.field_H = 0;
    }

    static {
        field_G = new RgbSprite(270, 70);
        field_A = new String[]{"INSTRUCTIONS", "Stay alive for as long as possible by avoiding the ceiling above and the furnace below.", "Press the escape key to leave the game.", "The movement keys are shown at the sides of the screen.", "Normal Platform", "Bouncy Platform", "Pushes you into the air. The height you bounce depends on your size.", "Cloudy Platform", "Vanishes from under you unless you are small.", "Moving Platform", "Rolls you in the direction shown.", "Growth Platform", "Makes you expand letting you squish other players, <br>but you move slower.", "Shrinking Platform", "Shrinks you letting you slide faster.", "Spikey Platform", "Gives you horns to attack with.", "Watch out for Spike the spike!", "<gt> ", "", "", " Volume ", "", "ACHIEVEMENTS", "New Achievements this game", "Achievements for all time"};
        field_F = 0;
    }

    private static int compareDoublesNaNResultNegative(double left, double right) {
        return left > right ? 1 : (left == right ? 0 : -1);
    }
}
