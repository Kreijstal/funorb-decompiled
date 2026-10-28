/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class EscapeVector extends NetworkGameClient {
    static String field_z;
    public static int obfuscationControl;

    final void renderClient(byte guard) {
        try {
          int var2_int = -74 / ((-71 - guard) / 55);
          GameAppletShell.field_k = false;
          this.renderFrame(-27273);
          jd.a((byte) -54);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "EscapeVector.O(" + guard + ')');
        }
    }

    final void updateClient(int guard) {
        int var4 = obfuscationControl;
        try {
          if (ik.field_h[1]) {
            gk.field_c = false;
          }
          if (ik.field_h[2]) {
            gk.field_c = true;
          }
          int var2_int = 119 % ((guard + 39) / 33);
          if (null != IsaacRandom.field_d &&
            IsaacRandom.field_d.field_c) {
            ri.a(-25123);
            oj.a((byte) 97);
          }
          UiContainer.field_C.d();
          ig.field_l.d();
          int stackIn_16_1 = -1;
          boolean stackIn_17_2 = (null != IsaacRandom.field_d);
          this.a(stackIn_16_1, stackIn_17_2);
          if (of.field_b) {
            this.f(true);
            of.field_b = false;
          }
          SelfDestructEffects.field_s = false;
          IntValueNode.field_j = false;
          r.field_y = false;
          if (!ii.b(16836)) {
            boolean decompiledFrameRemainder0 = true;
            if (!uk.field_h) {
              this.n((byte) -96);
            } else if (mb.b((byte) -120)) {
              if (!mj.a((byte) 79)) {
                if (da.c((byte) -127)) {
                  if (BoundedRandomAccessFile.activeSession != null) {
                    BoundedRandomAccessFile.activeSession.stopSessionAudio((byte) -41);
                  }
                  boolean stackIn_42_1 = (IsaacRandom.field_d != null);
                  int var3 = this.a(stackIn_42_1, -556);
                  if (var3 == 1) {
                    ri.a(-25123);
                  }
                  if (var3 == 2) {
                    if (IsaacRandom.field_d != null) {
                      ri.a(-25123);
                    }
                    gk.a(-9787, PointCloudEffect.d((byte) -119));
                  }
                  decompiledFrameRemainder0 = (var4 != 0);
                }
                if (decompiledFrameRemainder0) {
                  mb.a((byte) -90);
                  this.updateSessionMusic(1);
                  decompiledFrameRemainder0 = (var4 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (BoundedRandomAccessFile.activeSession == null) {
                  pf.e((byte) -125);
                }
                if (mj.field_d == 0) {
                  sj.a(8192, (byte) 51);
                }
                IntValueNode.field_j = true;
                if (null != BoundedRandomAccessFile.activeSession &&
                  20 <= mj.field_d) {
                  IntValueNode.field_j = false;
                }
                if (1000 > mj.field_d) {
                  mj.field_d = mj.field_d + 1;
                }
                int var3Lifetime2 = SpriteOffset.b(-14);
                if (var3Lifetime2 == 2) {
                  ri.a(-25123);
                }
                if (var3Lifetime2 == 3) {
                  eo.a(24, true);
                }
                if (var3Lifetime2 == 4) {
                  da.a((byte) -112);
                }
                if (!mj.a((byte) 92)) {
                  if (null != BoundedRandomAccessFile.activeSession) {
                    da.field_c.b(ch.field_a.field_j, 320);
                    if (var4 != 0) {
                      pl.field_q.b(-26480, pl.field_q.field_b.field_j);
                    }
                  } else {
                    pl.field_q.b(-26480, pl.field_q.field_b.field_j);
                  }
                  mj.field_d = 0;
                  gi.a((byte) -67);
                }
                if (var4 != 0) {
                  ac.a(25972, mg.field_f);
                  km.b((byte) -59);
                  this.n((byte) -96);
                }
              }
            } else {
              ac.a(25972, mg.field_f);
              km.b((byte) -59);
              if (var4 != 0) {
                this.n((byte) -96);
              }
            }
            while (true) {
              if (BufferedRandomAccessFile.a(wd.field_u, 109)) {
                this.f(127);
                if (var4 == 0) {
                  continue;
                }
              } else {
                ClientException.a(0, 30785);
              }
              break;
            }
            if (um.a(17830)) {
              this.k((byte) -67);
              if (var4 != 0) {
                this.j(-9926);
                if (!ii.b(16836) &&
                  mj.a((byte) 125)) {
                  eo.a(24, true);
                }
              }
            }
          } else {
            this.j(-9926);
            if (!ii.b(16836) &&
              mj.a((byte) 125)) {
              eo.a(24, true);
            }
          }
          if (dj.field_c != null &&
            !r.field_y) {
            dj.field_c.g(2048);
            dj.field_c = null;
          }
          if (null != mb.field_a &&
            !IntValueNode.field_j) {
            mb.field_a.g(2048);
            mb.field_a = null;
          }
          if (!SelfDestructEffects.field_s) {
            int var3Lifetime1 = 0;
            while (!(gd.field_K.length <= var3Lifetime1)) {
              if (var4 != 0) {
                return;
              }
              if (gd.field_K[var3Lifetime1] != null) {
                gd.field_K[var3Lifetime1].g(256);
                gd.field_K[var3Lifetime1] = null;
              }
              var3Lifetime1++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.H(" + guard + ')');
        }
    }

    public static void l(byte param0) {
        try {
          field_z = null;
          if (param0 >= -76) {
            EscapeVector.a((String) null, 38, -112, (byte) -73);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "EscapeVector.CB(" + param0 + ')');
        }
    }

    final void releaseClientStatics(byte guard) {
        try {
          EscapeVector.l((byte) -95);
          GameKeyHandler.a(47);
          nm.a(false);
          ek.a(69);
          dj.a((byte) -116);
          NetworkGameClient.i((byte) -73);
          ClientException.a(false);
          GameAppletShell.d((byte) -111);
          BoundedUrlRequest.b(-1);
          eg.a(-1);
          MouseWheelInput.a((byte) 104);
          SoftwareRasterizer.a();
          ResourceArchive.c(124);
          BitmapFont.a();
          nb.a(-111);
          PacketBuffer.a((byte) 70);
          td.a(128);
          dl.b((byte) -96);
          bg.a(13);
          rc.a(-49153);
          an.a(18);
          gm.a(8192);
          be.a((byte) -127);
          bm.a((byte) 110);
          ii.a(20);
          gi.c(-13885);
          mg.a(true);
          um.a(false);
          j.a(-76);
          ok.a(true);
          eo.b((byte) -72);
          RasterBuffer.a((byte) 107);
          uc.a((byte) -59);
          FullscreenFocusCanvas.a((byte) 71);
          pk.b(false);
          ak.c((byte) 77);
          dn.h(-1);
          ta.f(0);
          en.a(1);
          kg.f(80);
          p.b(99);
          Js5Transport.e(-4470);
          DiskCacheWorker.b(-4);
          sk.b(true);
          BufferedRandomAccessFile.b((byte) 123);
          pj.b((byte) 6);
          IntrusiveDeque.b(true);
          TrackerMusicDefinition.b(-32408);
          TrackerMusicPlayer.d();
          AudioOutput.e();
          GameplaySession.f((byte) 69);
          t.b((byte) -34);
          ig.h(-60);
          pf.a(459);
          tf.a(-92);
          wc.a((byte) 49);
          PcmResampler.releaseStatics(104);
          uj.a((byte) -106);
          jj.b(9);
          LevelObject.a(false);
          IntrusiveNode.c(-71);
          SpriteState.f(-363232252);
          DualLinkNode.a((byte) -11);
          IndexedSpriteState.b(-26317);
          ji.a(2097152);
          AudioService.b((byte) -58);
          gn.b(false);
          vd.c((byte) 80);
          sl.a(127);
          le.a(91);
          ArchiveIndex.a((byte) 18);
          dh.a((byte) 124);
          ArchiveProvider.releaseStatics((byte) 123);
          mj.a(true);
          jc.b(-1);
          gk.a((byte) -98);
          ug.a(true);
          ke.a(-71);
          wk.a(false);
          da.a(0);
          kc.a(-28377);
          tb.o(0);
          qc.t(-106);
          w.n(300);
          ng.j((byte) 124);
          pn.q(-5);
          AccountRegistrationPanel.l(-125);
          h.k(96);
          oi.h((byte) 95);
          sn.a((byte) -118);
          uf.b(-27204);
          pa.a((byte) 103);
          dk.g(1);
          qe.b(0);
          we.a();
          in.a();
          u.a();
          SoundCache.a((byte) -72);
          IntrusiveNodeHashTable.releaseStatics(0);
          kh.a((byte) 65);
          ac.c(105);
          DynamicTerrainRenderer.d(3);
          SelfDestructEffects.d(-12548);
          PointCloudEffect.h(109);
          Minimap.a(68);
          TetherHumStream.e(-1600199832);
          LaserGateSpan.a((byte) -107);
          HudMessage.a((byte) -85);
          RockBuster.a((byte) 102);
          SeekerMine.a(false);
          co.a((byte) 63);
          cd.f(-1);
          fd.a((byte) 86);
          se.a((byte) 23);
          cb.a(-13379);
          bn.a(true);
          lh.a((byte) 26);
          nl.a(16558);
          fk.a(124);
          vj.a(-102);
          CipherPacketBuffer.releaseStatics(106);
          DialogueScreen.a(true);
          IsaacRandom.releaseStatics((byte) -88);
          bk.h(-24811);
          Js5NetworkRequest.d((byte) 34);
          SectorCacheStore.a(true);
          CachedArchiveProvider.c((byte) 8);
          BoundedRandomAccessFile.b(1);
          e.b(32153);
          ArchiveRequest.releaseStatics(5);
          on.a(127);
          tm.n(-23008);
          TextWidgetPainter.b(-24239);
          bi.c();
          ri.b(-117);
          ui.a(true);
          ia.a(true);
          ml.a(-117);
          aa.b((byte) -96);
          mm.b(56);
          cf.a(3);
          rd.a(-56);
          bc.a(0);
          ua.a(0);
          pc.a(true);
          ol.g(4095);
          nn.b((byte) 103);
          hd.a(127);
          mh.a(true);
          fh.a((byte) 86);
          Bzip2Decoder.a();
          Bzip2State.a(8192);
          mn.a((byte) 96);
          jd.b((byte) 77);
          ej.a(26);
          CheckboxPainter.a((byte) -44);
          he.a(true);
          sc.a((byte) -76);
          ve.a(0);
          TextLayout.b(0);
          UiComponent.releaseStatics((byte) 58);
          TextButton.j(1);
          r.a((byte) 58);
          vg.i((byte) -112);
          bb.h((byte) 127);
          UiContainer.g((byte) -68);
          wf.a(false);
          ch.a(-5691);
          wa.a(false);
          QuickChatPhraseDefinition.f(95);
          v.a((byte) -87);
          ff.a(100);
          fa.a(true);
          b.a((byte) 118);
          ph.a((byte) 106);
          aj.a(0);
          ti.a((byte) -101);
          kb.a(true);
          qf.b(116);
          ImageProducerRasterBuffer.f(-1);
          vi.a(119);
          ja.a(123);
          id.b(-17129);
          sf.a(false);
          fg.a((byte) -119);
          IntValueNode.a(true);
          WhirlpoolHasher.releaseStatics(true);
          sj.a((byte) 123);
          of.a(122);
          pb.a(false);
          qj.b(-10497);
          ki.l(88);
          gd.i((byte) -87);
          EditableTextWidget.f((byte) -96);
          fj.n(-11555);
          jm.a((byte) 127);
          rh.j(-24896);
          oj.e((byte) 113);
          lf.a((byte) 113);
          bo.a((byte) 105);
          TextFieldValidator.f(-16187);
          jf.j(1);
          eb.a(true);
          q.a((byte) 59);
          cl.a();
          cj.a(17159);
          wh.a(true);
          km.c(-4);
          kn.c(true);
          ni.l(-105);
          qa.e((byte) 59);
          om.a(5468);
          qm.a((byte) 126);
          vb.b((byte) 99);
          sh.f(0);
          vk.g(28);
          jb.c(true);
          mc.a(8123);
          hb.a(false);
          rm.a(true);
          ij.d(-83);
          ik.d(65535);
          di.b(0);
          ll.a((byte) -77);
          ck.a((byte) -31);
          ha.a((byte) 97);
          re.c(-11967);
          un.a((byte) -93);
          ae.a(1);
          md.l(119);
          tg.h(0);
          rl.d(29152);
          qk.a((byte) -79);
          gj.b(3355);
          me.k(0);
          je.a(-109);
          jl.a(-30082);
          gl.b(false);
          wd.d(94);
          tc.e(96);
          gf.b(12474);
          gb.b(-5);
          ea.b((byte) 118);
          ci.b(4);
          mb.a(4);
          qh.a(7);
          TerrainMap.a(-126);
          uk.a(-1);
          IntPoint.a(-3217);
          jh.a(false);
          qd.b(false);
          ObjectSpriteSet.a(122);
          SpriteOffset.a(122);
          RasterSnapshot.a((byte) 75);
          al.a(-128);
          lm.b((byte) -10);
          d.a((byte) 65);
          qi.j(8);
          oh.a((byte) -20);
          wi.a(64);
          SeekerPulseStream.a((byte) -43);
          ee.a(false);
          ld.b((byte) -71);
          pl.c(256);
          bh.d(11);
          dc.a(false);
          cc.d(50);
          ei.e(-116);
          bd.d(-119);
          if (guard >= -52) {
            this.p(-97);
          }
          ef.a(59);
          vl.a(-19467);
          kf.c((byte) 0);
          nk.g(29779);
          hi.g(14);
          dg.g(0);
          kl.g(-17);
          lb.g(-17318);
          TerrainMaskSupport.a((byte) 14);
          bl.d(255);
          DebouncedValidator.b(true);
          tk.b(31167);
          this.field_s = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.E(" + guard + ')');
        }
    }

    private final void n(byte param0) {
        int var3 = obfuscationControl;
        try {
          ac.a(param0 ^ -25900, mg.field_f);
          if (null == fh.field_g) {
            gn.a(-122);
            dn.a(TextLayout.field_f, param0 ^ -17595, 70.0f);
            this.renderClient((byte) -128);
            fh.field_g = oi.a(param0 ^ -92, sn.field_c, "", "fonts_squarish16", IndexedSpriteState.field_j);
            sn.field_c = null;
            ea.field_f = fe.a("", IndexedSpriteState.field_j, "titles_escape", true);
            ArchiveIndex.field_o = fe.a("", IndexedSpriteState.field_j, "titles_vector", true);
            oi.field_O = fe.a("", IndexedSpriteState.field_j, "titles_achievements", true);
            lf.field_I = fe.a("", IndexedSpriteState.field_j, "titles_achievements_this_game", true);
            DynamicTerrainRenderer.field_w = fe.a("", IndexedSpriteState.field_j, "titles_highscores", true);
            jf.field_H = fe.a("", IndexedSpriteState.field_j, "titles_instructions", true);
            kb.field_c = fe.a("", IndexedSpriteState.field_j, "titles_retrieval_levels", true);
            p.field_c = fe.a("", IndexedSpriteState.field_j, "titles_retribution_levels", true);
            oj.field_Q = fe.a("", IndexedSpriteState.field_j, "titles_simulator_levels", true);
            TextWidgetPainter.field_j = fe.a("", IndexedSpriteState.field_j, "titles_select_level_set", true);
            pj.field_g = kh.a(IndexedSpriteState.field_j, (byte) 123, "", "level_set_icons");
            this.m((byte) 125);
            Js5NetworkRequest.field_H = fe.a("", IndexedSpriteState.field_j, "seeker_mine", true);
            SelfDestructEffects.field_b = fe.a("", IndexedSpriteState.field_j, "seeker_mine_glow", true);
            ResourceArchive.field_m = fe.a("", IndexedSpriteState.field_j, "rock_buster", true);
            IntPoint.field_b = fe.a("", IndexedSpriteState.field_j, "interface_level_complete", true);
            ij.field_g = fe.a("", IndexedSpriteState.field_j, "interface_game_over", true);
            mc.field_d = kh.a(IndexedSpriteState.field_j, (byte) 124, "", "achievements");
            bn.a(mc.field_d, 0);
            CheckboxPainter.field_c = fe.a("basic", ve.field_h, "unachieved", true);
            rm.field_e = fe.a("basic", ve.field_h, "locked", true);
            qh.field_l = new Sprite(CheckboxPainter.field_c.fullWidth, CheckboxPainter.field_c.fullHeight);
            qh.field_l.f();
            mb.a(fe.a("", IndexedSpriteState.field_j, "achievements_next_page_button", true), -84);
            RasterSnapshot.field_m = new Sprite[mc.field_d.length];
            int var2_int = 0;
            while (mc.field_d.length > var2_int) {
              RasterSnapshot.field_m[var2_int] = new Sprite(32, 32);
              RasterSnapshot.field_m[var2_int].g();
              mc.field_d[var2_int].a(0, 0, 32, 32);
              var2_int++;
              if (var3 != 0) {
                return;
              }
            }
            id.field_a = new Sprite(32, 32);
            id.field_a.g();
            CheckboxPainter.field_c.a(0, 0, 32, 32);
            uj.field_b = new Sprite(32, 32);
            uj.field_b.g();
            rm.field_e.a(0, 0, 32, 32);
            md.field_D.a(param0 ^ -35);
            this.g(false);
            vd.field_f = kh.a(IndexedSpriteState.field_j, (byte) 123, "", "level_complete_tick");
            FullscreenFocusCanvas.field_a = ae.a("scrshots", "", (byte) -48, IndexedSpriteState.field_j);
            ve.field_h = null;
            SpriteOffset.a((byte) 92);
            return;
          }
          if (null != ff.field_i) {
            if (null == fj.field_eb) {
              dn.a(q.field_H, param0 + 17733, 90.0f);
              this.renderClient((byte) 48);
              SoundCache var2_ref = new SoundCache(CheckboxPainter.field_h, jm.field_I);
              jm.field_I = null;
              CheckboxPainter.field_h = null;
              fj.field_eb = nm.a(2, "", var2_ref, PointCloudEffect.field_D, "music/menu");
              EditableTextWidget.field_O = nm.a(param0 ^ -94, "", var2_ref, PointCloudEffect.field_D, "music/briefing");
              wc.field_d = nm.a(2, "", var2_ref, PointCloudEffect.field_D, "music/panic");
              ObjectSpriteSet.field_d = new TrackerMusicDefinition[5];
              ObjectSpriteSet.field_d[0] = nm.a(2, "", var2_ref, PointCloudEffect.field_D, "music/oss_area_1");
              ObjectSpriteSet.field_d[1] = nm.a(2, "", var2_ref, PointCloudEffect.field_D, "music/oss_area_2");
              ObjectSpriteSet.field_d[2] = nm.a(2, "", var2_ref, PointCloudEffect.field_D, "music/oss_area_3");
              ObjectSpriteSet.field_d[3] = nm.a(2, "", var2_ref, PointCloudEffect.field_D, "music/oss_area_4");
              ObjectSpriteSet.field_d[4] = nm.a(PacketBuffer.a((int) param0, -94), "", var2_ref, PointCloudEffect.field_D, "music/simulator");
              PointCloudEffect.field_D = null;
              SpriteOffset.a((byte) 93);
              return;
            }
            if (null == ld.field_h) {
              dn.a(qa.field_H, param0 ^ -17595, 100.0f);
              this.renderClient((byte) -127);
              ld.field_h = bg.a(UiContainer.field_B, ld.field_h, he.field_u, 0);
              UiContainer.field_B = null;
              SpriteOffset.a((byte) 51);
              return;
            }
            qi.a(50, true);
            pl.field_q = new t();
            CheckboxPainter.field_l = new ig(1, vh.f(param0 ^ -35));
            UiComponent.field_o = new pf(true);
            rc.field_a = new ak(false, 1);
            if (param0 != -96) {
              field_z = (String) null;
            }
            da.field_b = new ta();
            qk.field_e = new dn(true);
            GameplaySession.c((byte) 115);
            fg.c(0);
            this.l(param0 + 95);
            uk.field_h = true;
            vl.b(1, 0);
            return;
          }
          dn.a(qf.field_n, 17637, 80.0f);
          this.renderClient((byte) 7);
          PcmResampler var2 = new PcmResampler(22050, AudioOutput.field_q);
          ff.field_i = kj.a(CheckboxPainter.field_h, "", "write-text").a().resample(var2);
          en.field_d = kj.a(CheckboxPainter.field_h, "", "cursor").a().resample(var2);
          bm.field_a = kj.a(CheckboxPainter.field_h, "", "interference").a().resample(var2);
          qh.field_i = kj.a(CheckboxPainter.field_h, "", "interference_300ms").a().resample(var2);
          nn.field_g = kj.a(CheckboxPainter.field_h, "", "mainmenu_formation").a().resample(var2);
          ArchiveRequest.field_w = kj.a(CheckboxPainter.field_h, "", "mouseover").a().resample(var2);
          b.field_b = kj.a(CheckboxPainter.field_h, "", "level_indicator").a().resample(var2);
          pc.field_a = kj.a(CheckboxPainter.field_h, "", "button_formation").a().resample(var2);
          uf.field_g = kj.a(CheckboxPainter.field_h, "", "frame-appear").a().resample(var2);
          QuickChatPhraseDefinition.field_t = kj.a(CheckboxPainter.field_h, "", "photo-blob-grow").a().resample(var2);
          vd.field_g = kj.a(CheckboxPainter.field_h, "", "photo-body-explode").a().resample(var2);
          ArchiveProvider.field_d = kj.a(CheckboxPainter.field_h, "", "grid_effect_1").a().resample(var2);
          pa.field_b = kj.a(CheckboxPainter.field_h, "", "grid_effect_2").a().resample(var2);
          PcmResampler.field_g = in.a(jm.field_I, "", "pixelate").b().resample(var2);
          oj.field_N = kj.a(CheckboxPainter.field_h, "", "gas-pump").a().resample(var2);
          ng.field_mb = kj.a(CheckboxPainter.field_h, "", "gas-burn").a().resample(var2);
          TerrainMaskSupport.field_e = kj.a(CheckboxPainter.field_h, "", "left-foot-down").a().resample(var2);
          ri.field_b = kj.a(CheckboxPainter.field_h, "", "right-foot-down").a().resample(var2);
          ni.field_M = kj.a(CheckboxPainter.field_h, "", "ship-fire").a().resample(var2);
          gn.field_e = kj.a(CheckboxPainter.field_h, "", "ship-fire-three").a().resample(var2);
          uk.field_j = kj.a(CheckboxPainter.field_h, "", "alien-fire").a().resample(var2);
          Bzip2State.field_G = kj.a(CheckboxPainter.field_h, "", "shield").a().resample(var2);
          co.field_d = kj.a(CheckboxPainter.field_h, "", "shield_impact").a().resample(var2);
          gm.field_b = kj.a(CheckboxPainter.field_h, "", "shield_empty").a().resample(var2);
          qa.field_E = kj.a(CheckboxPainter.field_h, "", "fuel-start").a().resample(var2);
          lm.field_d = kj.a(CheckboxPainter.field_h, "", "fuel-filling").a().resample(var2);
          al.field_b = kj.a(CheckboxPainter.field_h, "", "fuel-stop").a().resample(var2);
          SpriteOffset.field_f = kj.a(CheckboxPainter.field_h, "", "fuel-full").a().resample(var2);
          fg.field_a = kj.a(CheckboxPainter.field_h, "", "crate-attach").a().resample(var2);
          ObjectSpriteSet.field_c = kj.a(CheckboxPainter.field_h, "", "tether-tighten").a().resample(var2);
          bc.field_c = kj.a(CheckboxPainter.field_h, "", "tether-release").a().resample(var2);
          nm.field_a = kj.a(CheckboxPainter.field_h, "", "powerup-collect").a().resample(var2);
          vi.field_c = kj.a(CheckboxPainter.field_h, "", "repeller-active").a().resample(var2);
          w.field_hb = kj.a(CheckboxPainter.field_h, "", "magnet-active").a().resample(var2);
          of.field_h = kj.a(CheckboxPainter.field_h, "", "laser").a().resample(var2);
          IntrusiveNodeHashTable.field_a = kj.a(CheckboxPainter.field_h, "", "explosion-ship").a().resample(var2);
          RasterBuffer.field_c = kj.a(CheckboxPainter.field_h, "", "explosion_5_seconds").a().resample(var2);
          pa.field_a = in.a(jm.field_I, "", "beeping").b().resample(var2);
          this.a(param0 + 97, var2);
          ci.field_a = kj.a(CheckboxPainter.field_h, "", "mine_inactive_hum_2").a().resample(var2);
          qi.field_J = kj.a(CheckboxPainter.field_h, "", "100Hz square").a();
          ve.field_d = kj.a(CheckboxPainter.field_h, "", "explosion-seeker-mine").a().resample(var2);
          kf.field_p = kj.a(CheckboxPainter.field_h, "", "rockbuster").a().resample(var2);
          td.field_c = kj.a(CheckboxPainter.field_h, "", "explosion-rock-buster").a().resample(var2);
          jh.field_k = kj.a(CheckboxPainter.field_h, "", "level_complete").a().resample(var2);
          pl.field_o = kj.a(CheckboxPainter.field_h, "", "level_complete_score").a().resample(var2);
          SpriteOffset.a((byte) 106);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref2), "EscapeVector.FB(" + param0 + ')');
        }
    }

    private final void l(int param0) {
        try {
          if (param0 != -1) {
            field_z = (String) null;
          }
          nb.a((java.applet.Applet) (this), 1585176, (byte) -125, 6340704, vj.field_c, 192);
          aj.field_a = new fe((java.applet.Applet) (this), sh.field_r, FullscreenFocusCanvas.field_a, vj.field_c);
          FullscreenFocusCanvas.field_a = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.AB(" + param0 + ')');
        }
    }

    final static void insertNodeBefore(IntrusiveNode node, IntrusiveNode before, byte guard) {
        String stackIn_12_2 = null;
        String stackIn_16_2 = null;
        try {
          if (node.previous != null) {
            node.unlink((byte) -69);
          }
          if (guard != -7) {
            return;
          }
          node.previous = before.previous;
          node.next = before;
          node.previous.next = node;
          node.next.previous = node;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_11_0 = runtimeException;
          StringBuilder stackIn_11_1 = new StringBuilder().append("EscapeVector.WA(");
          if (node == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (before == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(')').toString());
        }
    }

    private final void o(int param0) {
        try {
          jm.field_K[param0] = fe.a("", IndexedSpriteState.field_j, "sprites_fuel_glow", true);
          jm.field_K[2] = fe.a("", IndexedSpriteState.field_j, "sprites_turret_glow", true);
          jm.field_K[3] = fe.a("", IndexedSpriteState.field_j, "sprites_magnet_glow", true);
          jm.field_K[4] = fe.a("", IndexedSpriteState.field_j, "sprites_repeller_glow", true);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "EscapeVector.DB(" + param0 + ')');
        }
    }

    final static MouseWheelInput n(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          try {
            if (param0 != 13) {
              MouseWheelInput stackIn_2_0 = (MouseWheelInput) null;
              return stackIn_2_0;
            }
            try {
              MouseWheelInput stackIn_4_0 = (MouseWheelInput) (Class.forName("MouseWheelHandler").newInstance());
              return stackIn_4_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var1 = decompiledCaughtException;
              Object stackIn_6_0 = null;
              return (MouseWheelInput) (stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw t.a((Throwable) ((Object) var1_ref), "EscapeVector.GB(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(boolean param0) {
        try {
          if (IsaacRandom.field_d != null) {
            ri.a(-25123);
          }
          if (!param0) {
            field_z = (String) null;
          }
          if (UiContainer.field_C != null) {
            UiContainer.field_C.c();
          }
          if (ig.field_l != null) {
            ig.field_l.c();
          }
          di.a(1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.B(" + param0 + ')');
        }
    }

    private final void f(boolean param0) {
        try {
          if (null != mg.field_c) {
            qc.a(8, mg.field_c);
            mg.field_c = null;
            SpriteOffset.a((byte) 57);
          }
          IndexedSpriteState.field_j = ve.a(1, 0, param0, 1, true);
          sn.field_c = mj.a(6, -125);
          CheckboxPainter.field_h = mj.a(2, -126);
          jm.field_I = mj.a(3, -127);
          PointCloudEffect.field_D = mj.a(4, -126);
          UiContainer.field_B = mj.a(10, -124);
          he.field_u = mj.a(5, -128);
          gj.a((byte) 57, ei.field_m, ve.field_h);
          uf.a(ve.field_h, ei.field_m, (byte) -96);
          DualLinkNode.field_n = new uc(70);
          DualLinkNode.field_n.a(ve.field_h, TextFieldValidator.field_l, DebouncedValidator.field_d, "basic", 14826);
          DualLinkNode.field_n.a(IndexedSpriteState.field_j, TextFieldValidator.field_l, DebouncedValidator.field_d, "", 14826);
          DualLinkNode.field_n.a(IndexedSpriteState.field_j, TextFieldValidator.field_l, DebouncedValidator.field_d, "scrshots", 14826);
          DualLinkNode.field_n.a(sn.field_c, CipherPacketBuffer.field_o, qf.field_h, "", 14826);
          DualLinkNode.field_n.a(bd.field_g, (byte) -125, gm.field_d, CheckboxPainter.field_h);
          DualLinkNode.field_n.a(bd.field_g, (byte) -115, gm.field_d, jm.field_I);
          DualLinkNode.field_n.a(bm.field_f, (byte) -119, uc.field_d, PointCloudEffect.field_D);
          DualLinkNode.field_n.a(cd.field_r, (byte) -121, ek.field_b, UiContainer.field_B);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.HB(" + param0 + ')');
        }
    }

    final static boolean a(tg param0, tg param1, int param2) {
        String stackIn_31_2 = null;
        String stackIn_35_2 = null;
        int var4 = obfuscationControl;
        try {
          if (param2 != -7457) {
            field_z = (String) null;
          }
          int var3_int = -param1.field_pb + param0.field_pb;
          if (param0.field_lb == di.field_f) {
            var3_int -= 200;
          } else if (null == param0.field_lb) {
            var3_int += 200;
            if (var4 != 0) {
              var3_int -= 200;
            }
          }
          if (di.field_f == param1.field_lb) {
            var3_int += 200;
          } else if (param1.field_lb == null) {
            var3_int -= 200;
            if (var4 != 0) {
              var3_int += 200;
            }
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_30_0 = var3;
          StringBuilder stackIn_30_1 = new StringBuilder().append("EscapeVector.TA(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          StringBuilder stackIn_34_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, PcmResampler param1) {
        String stackIn_6_2 = null;
        try {
          sf.field_e[0] = kj.a(CheckboxPainter.field_h, "", "explosion-fuel-tank").a().resample(param1);
          sf.field_e[param0] = kj.a(CheckboxPainter.field_h, "", "explosion-crate").a().resample(param1);
          PcmSample dupTemp$8 = kj.a(CheckboxPainter.field_h, "", "explosion-magnet-repeller").a().resample(param1);
          sf.field_e[4] = dupTemp$8;
          sf.field_e[3] = dupTemp$8;
          sf.field_e[2] = kj.a(CheckboxPainter.field_h, "", "explosion-turret").a().resample(param1);
          PcmSample dupTemp$9 = kj.a(CheckboxPainter.field_h, "", "explosion-tnt").a().resample(param1);
          sf.field_e[8] = dupTemp$9;
          sf.field_e[5] = dupTemp$9;
          PcmSample dupTemp$10 = kj.a(CheckboxPainter.field_h, "", "explosion-laser").a().resample(param1);
          sf.field_e[7] = dupTemp$10;
          sf.field_e[6] = dupTemp$10;
          PcmSample dupTemp$11 = kj.a(CheckboxPainter.field_h, "", "explosion-powerup").a().resample(param1);
          sf.field_e[13] = dupTemp$11;
          sf.field_e[12] = dupTemp$11;
          sf.field_e[11] = dupTemp$11;
          sf.field_e[10] = dupTemp$11;
          sf.field_e[9] = dupTemp$11;
          this.a((byte) -60, sf.field_e[0]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("EscapeVector.LB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void renderFrame(int guard) {
        int var9 = obfuscationControl;
        try {
          DialogueScreen var2 = qa.f((byte) -49);
          java.awt.Canvas var3 = AccountRegistrationPanel.i((byte) 10);
          if (guard != -27273) {
            field_z = (String) null;
          }
          boolean var4 = (UiComponent.g(11187));
          if (ii.b(16836)) {
            gb.a((var4), (byte) 92, var3);
            return;
          }
          if (!uk.field_h) {
            TextFieldValidator.a(var3, 0);
            return;
          }
          if (!mb.b((byte) -64)) {
            dn.a(ff.field_a, 17637, 100.0f);
            TextFieldValidator.a(var3, 0);
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (var2 != null) {
            var2.drawDialogue(107);
            decompiledFrameRemainder0 = (var9 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (BoundedRandomAccessFile.activeSession != null) {
              BoundedRandomAccessFile.activeSession.renderSession(0);
            }
            if (wk.field_c) {
              SoftwareRasterizer.clearFramebuffer();
              aj.field_a.c(-76);
              decompiledFrameRemainder0 = (var9 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (!TextLayout.field_b) {
                if (SelfDestructEffects.field_q >= 0) {
                  CheckboxPainter.field_l.e(3);
                  decompiledFrameRemainder0 = (var9 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (!PacketBuffer.field_h) {
                    if (e.field_a) {
                      da.field_b.i(3);
                      decompiledFrameRemainder0 = (var9 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      if (CheckboxPainter.field_n) {
                        rc.field_a.a(false);
                        decompiledFrameRemainder0 = (var9 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        if (ch.field_b) {
                          qk.field_e.c((byte) 120);
                          decompiledFrameRemainder0 = (var9 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          if (null != da.field_c) {
                            da.field_c.d((byte) 126);
                            decompiledFrameRemainder0 = (var9 != 0);
                          }
                          if (decompiledFrameRemainder0 &&
                            null != pl.field_q) {
                            pl.field_q.a((byte) -16);
                            if (var9 != 0) {
                              this.e(false);
                              UiComponent.field_o.d(100);
                            }
                          }
                        }
                      }
                    }
                  } else {
                    this.e(false);
                    if (var9 != 0) {
                      UiComponent.field_o.d(100);
                    }
                  }
                }
              } else {
                UiComponent.field_o.d(100);
              }
            }
          }
          if (SelfDestructEffects.field_k &&
            null != BoundedRandomAccessFile.activeSession &&
            BoundedRandomAccessFile.activeSession.easyMode) {
            fh.field_g.c("EASY PEASY MODE IS ON", 320, 40, 16744576, -1);
          }
          if (SelfDestructEffects.field_k &&
            null != BoundedRandomAccessFile.activeSession &&
            BoundedRandomAccessFile.activeSession.timeHackMode) {
            fh.field_g.c("TIME HACK MODE IS ON", 320, 40, 16744576, -1);
          }
          if (2 <= mg.field_b &&
            gk.field_c) {
            fh.field_g.b("FPS: " + Bzip2State.field_p, 636, 100, 16777215, 0);
            fh.field_g.b("LPS: " + qf.field_j, 636, 120, 16777215, 0);
            long var5 = Runtime.getRuntime().totalMemory();
            long var7 = Runtime.getRuntime().freeMemory();
            fh.field_g.b((var5 - var7) / 1000L + " kB / " + var5 / 1000L + " kB", 636, 140, 16777215, 0);
          }
          if (da.c((byte) -106) &&
            !mj.a((byte) 122)) {
            mh.a((byte) -111, (var4));
          }
          nn.a(var3, 0, -1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "EscapeVector.BB(" + guard + ')');
        }
    }

    private final void e(boolean param0) {
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_7 = 0;
        int stackIn_38_8 = 0;
        int stackIn_42_0 = 0;
        int stackIn_46_7 = 0;
        int stackIn_50_8 = 0;
        int stackIn_54_2 = 0;
        int stackIn_58_2 = 0;
        try {
          SoftwareRasterizer.clearFramebuffer();
          SelfDestructEffects.b(2);
          String var2 = nk.field_r;
          boolean var3 = (TrackerMusicDefinition.field_f.b(110));
          boolean stackIn_3_0 = var3;
          int stackIn_3_1 = 4;
          boolean stackIn_4_2 = (null != IntValueNode.field_i);
          String var4 = dn.a((stackIn_3_0), stackIn_3_1, stackIn_4_2, ua.field_c.d(17523));
          boolean stackIn_7_0 = var3;
          boolean stackIn_7_1 = ua.field_c.d(17523);
          int stackIn_7_2 = -8;
          boolean stackIn_8_3 = (null != IntValueNode.field_i);
          String var5 = qd.chooseAlternateClickPromptWithIntGuard((stackIn_7_0), stackIn_7_1, stackIn_7_2, stackIn_8_3);
          boolean stackIn_11_0 = var3;
          boolean stackIn_12_1 = (IntValueNode.field_i != null);
          String var6 = ik.a((stackIn_11_0), stackIn_12_1, (byte) -112, ua.field_c.d(17523));
          int var7 = fh.field_g.b(var2);
          int var8 = fh.field_g.b(var4);
          if (var8 > var7) {
            var7 = var8;
          }
          int var8Lifetime1 = fh.field_g.b(var5);
          if (var8Lifetime1 > var7) {
            var7 = var8Lifetime1;
          }
          int var8Lifetime2 = fh.field_g.b(var6);
          if (var8Lifetime2 > var7) {
            var7 = var8Lifetime2;
          }
          int var8Lifetime3 = var7 / 2 + 25;
          if (40 > mj.field_d) {
            stackIn_26_0 = -mj.field_d + 40;
          } else {
            stackIn_26_0 = 0;
          }
          fc.a(stackIn_26_0, -var8Lifetime3 + 320, var8Lifetime3 + 321, 405, true, 29788, true, 6324320, 3162160, 0, 195, true);
          if (20 <= mj.field_d) {
            stackIn_30_0 = 0;
          } else {
            stackIn_30_0 = (20 - mj.field_d) * 2;
          }
          int stackIn_33_1 = 240;
          int stackIn_33_2 = 400;
          int stackIn_33_3 = 289;
          boolean stackIn_33_4 = true;
          int stackIn_33_5 = 29788;
          boolean stackIn_33_6 = false;
          stackIn_34_7 = (di.field_d.field_h == 0) ? (16777215) : (6340704);
          stackIn_38_8 = (di.field_d.field_h == 0) ? (8421504) : (3170352);
          fc.a(stackIn_30_0, stackIn_33_1, stackIn_33_2, stackIn_33_3, stackIn_33_4, stackIn_33_5, stackIn_33_6, stackIn_34_7, stackIn_38_8, 1, 262, param0);
          if (mj.field_d >= 30) {
            stackIn_42_0 = 0;
          } else {
            stackIn_42_0 = 2 * (30 - mj.field_d);
          }
          int stackIn_45_1 = 280;
          int stackIn_45_2 = 360;
          int stackIn_45_3 = 359;
          boolean stackIn_45_4 = true;
          int stackIn_45_5 = 29788;
          boolean stackIn_45_6 = false;
          stackIn_46_7 = (di.field_d.field_h == 1) ? (16777215) : (6340704);
          stackIn_50_8 = (di.field_d.field_h == 1) ? (8421504) : (3170352);
          fc.a(stackIn_42_0, stackIn_45_1, stackIn_45_2, stackIn_45_3, stackIn_45_4, stackIn_45_5, stackIn_45_6, stackIn_46_7, stackIn_50_8, 2, 332, false);
          pb.a(4);
          fh.field_g.c(var2, 320, 235, 10551200, -1);
          fh.field_g.c(var4, 320, 255, 10551200, -1);
          int stackIn_53_0 = 285;
          String stackIn_53_1 = IntrusiveDeque.field_e;
          stackIn_54_2 = (di.field_d.field_h != 0) ? (6340704) : (16777215);
          lb.a(stackIn_53_0, stackIn_53_1, stackIn_54_2, -128, 320);
          fh.field_g.c(var5, 320, 325, 10551200, -1);
          int stackIn_57_0 = 355;
          String stackIn_57_1 = sj.field_j;
          stackIn_58_2 = (di.field_d.field_h == 1) ? (16777215) : (6340704);
          lb.a(stackIn_57_0, stackIn_57_1, stackIn_58_2, -118, 320);
          fh.field_g.c(var6, 320, 385, 10551200, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "EscapeVector.UA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.a("escapevector", 640, 12);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "EscapeVector.init()");
        }
    }

    final void initializeClient(byte guard) {
        try {
          this.a(0, 11, 8, 7, 21, (byte) -99, false, 9);
          AudioOutput.a(22050, true, 10);
          UiContainer.field_C = AudioOutput.a(NetworkGameClient.field_r, (java.awt.Component) ((Object) of.field_d), 0, 1024);
          ig.field_l = AudioOutput.a(NetworkGameClient.field_r, (java.awt.Component) ((Object) of.field_d), 1, 22050);
          ObjectSpriteSet.field_e = new PcmStreamMixer();
          UiContainer.field_C.b(ObjectSpriteSet.field_e);
          pl.field_n = new PcmStreamMixer();
          SoundCache.field_a = new ReverbPcmStream(pl.field_n);
          SoundCache.field_a.d(0.9399999976158142f);
          SoundCache.field_a.b(14.826103210449219f);
          ObjectSpriteSet.field_e.addSubstream(SoundCache.field_a);
          nb.field_c = new PcmStreamMixer();
          BoundedRandomAccessFile.field_b = new ReverbPcmStream(nb.field_c);
          if (guard != -97) {
            EscapeVector.a((String) null, 31, 49, (byte) 88);
          }
          BoundedRandomAccessFile.field_b.d(0.9399999976158142f);
          BoundedRandomAccessFile.field_b.b(14.826103210449219f);
          ig.field_l.b(BoundedRandomAccessFile.field_b);
          this.a(true, (byte) -35, true, true, true);
          ua.field_c = new kg();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.P(" + guard + ')');
        }
    }

    public EscapeVector() {
    }

    private final void p(int param0) {
        try {
          mb.field_f[0] = fe.a("", IndexedSpriteState.field_j, "sprites_fuel", true);
          mb.field_f[1] = fe.a("", IndexedSpriteState.field_j, "sprites_crate", true);
          mb.field_f[2] = fe.a("", IndexedSpriteState.field_j, "sprites_turret", true);
          mb.field_f[3] = fe.a("", IndexedSpriteState.field_j, "sprites_magnet", true);
          mb.field_f[4] = fe.a("", IndexedSpriteState.field_j, "sprites_repeller", true);
          mb.field_f[5] = fe.a("", IndexedSpriteState.field_j, "sprites_tnt", true);
          mb.field_f[6] = fe.a("", IndexedSpriteState.field_j, "sprites_laser_left", true);
          int var2_int = -111 / ((60 - param0) / 58);
          mb.field_f[7] = fe.a("", IndexedSpriteState.field_j, "sprites_laser_right", true);
          mb.field_f[8] = fe.a("", IndexedSpriteState.field_j, "sprites_barrier", true);
          mb.field_f[9] = fe.a("", IndexedSpriteState.field_j, "sprites_powerup_shield", true);
          mb.field_f[10] = fe.a("", IndexedSpriteState.field_j, "sprites_powerup_triple_shot", true);
          mb.field_f[11] = fe.a("", IndexedSpriteState.field_j, "sprites_powerup_thrust", true);
          mb.field_f[12] = fe.a("", IndexedSpriteState.field_j, "sprites_powerup_one_rockbuster", true);
          mb.field_f[13] = fe.a("", IndexedSpriteState.field_j, "sprites_powerup_five_rockbusters", true);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "EscapeVector.MB(" + param0 + ')');
        }
    }

    private final void updateSessionMusic(int guard) {
        int var4 = obfuscationControl;
        try {
          DialogueScreen var2 = qa.f((byte) -49);
          if (guard != 1) {
            return;
          }
          if (var2 != null &&
            !var2.fullWidthScene) {
            if (lf.field_H != 1) {
              TerrainMap.a(40, EditableTextWidget.field_O, true, (byte) -101);
              lf.field_H = 1;
            }
            if (-1 + var2.dialogueLines.length > var2.dialogueIndex) {
              return;
            }
            if (var2.field_C != var2.revealedLine) {
              return;
            }
            wa.a(40 * var2.field_t / 100, 32471);
            if (var4 == 0) {
              return;
            }
          }
          if (null != var2 ||
            BoundedRandomAccessFile.activeSession == null) {
            if (0 == lf.field_H) {
              return;
            }
            TerrainMap.a(64, fj.field_eb, true, (byte) -63);
            lf.field_H = 0;
            if (var4 == 0) {
              return;
            }
          }
          boolean stackIn_37_0 = !(lf.field_H == 2);
          boolean var3 = stackIn_37_0;
          if (BoundedRandomAccessFile.activeSession != null) {
            BoundedRandomAccessFile.activeSession.e((var3), 0);
          }
          lf.field_H = 2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "EscapeVector.EB(" + guard + ')');
        }
    }

    final static void a(String param0, int param1, int param2, byte param3) {
        String stackIn_6_2 = null;
        try {
          fh.field_g.c(param0, -1 + param1, -1 + param2, 0, -1, 64);
          fh.field_g.c(param0, 1 + param1, -1 + param2, 0, -1, 64);
          fh.field_g.c(param0, -1 + param1, param2 + 1, 0, -1, 64);
          fh.field_g.c(param0, 1 + param1, 1 + param2, 0, -1, 64);
          int var4_int = 71 % ((52 - param3) / 53);
          fh.field_g.a(param0, param1, param2, 16777215, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("EscapeVector.JB(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void g(boolean param0) {
        try {
          if (param0) {
            this.m((byte) 29);
          }
          km.field_k = fe.a("", IndexedSpriteState.field_j, "classic_level_select_bg", true);
          aj.field_c = fe.a("", IndexedSpriteState.field_j, "vengeance_level_select_bg", true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.VA(" + param0 + ')');
        }
    }

    private final void a(byte param0, PcmSample param1) {
        String stackIn_14_2 = null;
        int var5 = obfuscationControl;
        try {
          int var3_int = 0;
          if (param0 >= -17) {
            this.releaseClientStatics((byte) -2);
          }
          while (3 > var3_int) {
            int var4 = var3_int + 14;
            sf.field_e[var4] = param1;
            var3_int++;
            if (var5 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_13_0 = runtimeException;
          StringBuilder stackIn_13_1 = new StringBuilder().append("EscapeVector.KB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void m(byte param0) {
        try {
          this.p(-28);
          int var2_int = 116 / ((-30 - param0) / 47);
          this.o(0);
          qh.a(IndexedSpriteState.field_j, (byte) -23);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "EscapeVector.IB(" + param0 + ')');
        }
    }

    static {
        field_z = "Members' Expansion";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void insertNodeBeforeWithIntGuard(IntrusiveNode node, IntrusiveNode before, int guard) {
        String stackIn_12_2 = null;
        String stackIn_16_2 = null;
        try {
          if (node.previous != null) {
            node.unlink((byte) -69);
          }
          if (guard != -7) {
            return;
          }
          node.previous = before.previous;
          node.next = before;
          node.previous.next = node;
          node.next.previous = node;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_11_0 = runtimeException;
          StringBuilder stackIn_11_1 = new StringBuilder().append("EscapeVector.WA(");
          if (node == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (before == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(')').toString());
        }
    }
}
