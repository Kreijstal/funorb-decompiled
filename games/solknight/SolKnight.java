/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class SolKnight extends ab {
    static fg field_D;
    private static Archive field_I;
    static volatile int field_G;
    static int[] field_K;
    static int[] field_E;
    public static boolean field_L;

    final void disposeClient(int param0) {
        int discarded$0 = 0;
        try {
          StandardContentDialog.n(0);
          if (null != dj.field_k) {
            ProxySocketConnector.d(param0 ^ -14996);
          }
          if (param0 != -1) {
            discarded$0 = this.b(-29, true);
          }
          ValidationStatusWidget.c(false);
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "SolKnight.M(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != wc.field_b) {
            ue.a(wc.field_b, 0);
            wc.field_b = null;
            mh.a(param0 + 8191);
          }
          fh.field_c = IsaacRandom.a(param0, 89);
          AccountServiceResult.field_g = IsaacRandom.a(2, 74);
          ProxySocketConnector.field_h = IsaacRandom.a(3, 125);
          NetworkArchiveRequest.field_u = IsaacRandom.a(4, 109);
          ValidatedTextField.field_cb = IsaacRandom.a(5, 90);
          field_I = IsaacRandom.a(7, 124);
          FullscreenStatusDialog.a(ai.field_b, -111, pl.field_d);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw MusicPatch.wrapClientException((Throwable) ((Object) var2), "SolKnight.Q(" + param0 + ')');
        }
    }

    final void updateClient(int param0) {
        int discarded$0 = 0;
        int stackIn_7_1 = 0;
        boolean stackIn_8_2 = false;
        boolean stackIn_55_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        bl var5 = null;
        int var2_intLifetime1;
        int var3Lifetime1;
        var4 = field_L ? 1 : 0;
        try {
          ja.b(200);
          if (dj.field_k != null &&
            dj.field_k.field_a) {
            ProxySocketConnector.d(14995);
            EditableTextField.a((byte) 80);
          }
          stackIn_7_1 = -3;
          stackIn_8_2 = (null != dj.field_k);
          this.a(stackIn_7_1, stackIn_8_2);
          if (RasterBuffer.field_c) {
            this.m(1);
            RasterBuffer.field_c = false;
          }
          if (bl.a((byte) -81)) {
            this.c(true);
            if (bl.a((byte) -81)) {
              if (LoginPanel.h(119)) {
                discarded$0 = this.b(0, false);
              }
              return;
            }
            if (!il.b(507)) {
              ConfirmedEmailAvailabilityValidator.field_q = kb.a(4, (byte) 106);
            }
          }
          if (na.field_b) {
            if (null != ConfirmedEmailAvailabilityValidator.field_q) {
              if (ConfirmedEmailAvailabilityValidator.field_q.field_k) {
                SecondaryNodeDequeIterator.field_d = SecondaryNodeDequeIterator.field_d & ~ConfirmedEmailAvailabilityValidator.field_q.field_m;
                ah.field_f = ah.field_f | ConfirmedEmailAvailabilityValidator.field_q.field_m;
                ConfirmedEmailAvailabilityValidator.field_q = null;
                FullscreenFocusCanvas.a((byte) 81);
                h.a((byte) 92);
                if (7 == kd.currentScreenIndex &&
                  SecondaryNodeDequeIterator.field_d == 0) {
                  kd.currentScreenIndex = 2;
                  PacketBuffer.a(false, 2, -127);
                }
              }
            } else {
              if (!RandomAccessCacheFile.b((byte) -104)) {
                if (IntrusiveNode.b((byte) 89)) {
                  stackIn_55_0 = (dj.field_k != null);
                  var2_int = ByteStorage.a(stackIn_55_0, (byte) 20, (ab) (this));
                  if (var2_int != 2364824) {
                    if (1 == var2_int ||
                      2 == var2_int) {
                      if (dj.field_k != null) {
                        ProxySocketConnector.d(14995);
                      }
                      if (2 == var2_int) {
                        he.a(-1, ia.g(-35));
                      }
                    }
                  } else {
                    GuestPlayConfirmationForm.h(-109);
                  }
                } else {
                  this.h((byte) -108);
                }
              } else {
                if (je.field_d != 0) {
                  this.h((byte) -108);
                } else {
                  var2_int = BufferedSocket.c(119);
                  if (var2_int == 2) {
                    ProxySocketConnector.d(14995);
                  } else {
                    if (var2_int == 3) {
                      ta.a(false, 320, w.field_b, 2, SocketConnector.field_g.field_s + SocketConnector.field_g.field_F, SocketConnector.field_g, 8, BufferedSocket.field_b.field_s + BufferedSocket.field_b.field_F, BufferedSocket.field_b.field_F, w.field_b, 8, 240, BufferedSocket.field_b, SocketConnector.field_g.field_F, true);
                    } else {
                      if (var2_int == 4) {
                        LoginPanel.a((byte) -14, -2, 0);
                      }
                    }
                  }
                }
                if (!RandomAccessCacheFile.b((byte) -106)) {
                  vd.screens[kd.currentScreenIndex].b(true, 3367);
                }
              }
            }
          } else {
            ta.a((byte) 61, AgeValidator.field_n);
            var2_int = this.b(0, true);
            if (pb.field_c != var2_int) {
              mh.a(8192);
            }
            if (var2_int == FullscreenNoticeType.field_d) {
              na.field_b = true;
            }
          }
          if (na.field_b &&
            !NameSuggestionsPanel.field_I.isMidiReady(144)) {
            ValidationStatusWidget.a((byte) -96, 0, true);
          }
          if (!il.b(507)) {
            while (true) {
              var5 = (bl) (w.field_a.removeLast(0));
              if (var5 == null) {
                break;
              }
              sj.a(4, var5, -7471);
            }
          }
          while (MouseWheelInput.a(AccountRequestState.field_b, 122)) {
            this.d(true);
          }
          qf.a(0, 0);
          var2_intLifetime1 = 0;
          if (qc.a(34)) {
            var3 = this.g(0);
            if (var3 == 2) {
              var2_intLifetime1 = 1;
            }
          }
          if (var2_intLifetime1 != 0) {
            aa.a(BufferedSocket.field_b.field_F, (byte) -93, BufferedSocket.field_b, SocketConnector.field_g.field_F + SocketConnector.field_g.field_s, 8, w.field_b, 320, 8, BufferedSocket.field_b.field_F + BufferedSocket.field_b.field_s, SocketConnector.field_g, w.field_b, SocketConnector.field_g.field_F, 2, 240);
          }
          var3Lifetime1 = 55 % ((51 - param0) / 39);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw MusicPatch.wrapClientException((Throwable) ((Object) var2), "SolKnight.K(" + param0 + ')');
        }
    }

    final void clearClientResources(byte param0) {
        try {
          SolKnight.n(2325);
          hc.clearStaticReferences(25850);
          ak.clearStaticReferences(3327);
          GameKeyHandler.b(1);
          pl.clearStaticReferences(-5045);
          eb.a((byte) 113);
          rg.clearStaticReferences((byte) -40);
          ab.clearStaticReferences((byte) -99);
          ClientException.resetStaticState((byte) 125);
          GameApplet.d((byte) -41);
          na.a(-13357);
          MouseWheelInput.b(18609);
          SoftwareRasterizer.clearStaticReferences();
          Archive.clearStaticReferences(-127);
          BitmapFont.clearStaticReferences();
          bk.clearStaticReferences((byte) 84);
          vc.clearStaticReferences(true);
          PacketBuffer.clearBufferStatics(-11);
          je.resetStaticState((byte) 64);
          cj.clearStaticReferences(-26497);
          ah.a(true);
          mh.clearStaticReferences(92);
          dd.clearStaticReferences(true);
          kh.resetStaticState(true);
          b.resetStaticState(-11709);
          hf.clearStaticReferences(0);
          k.a(-23354);
          uc.clearStaticReferences(99);
          wc.clearStaticReferences(false);
          FrameTimer.clearDeclaredStaticReferences(0);
          RasterBuffer.clearStaticReferences(0);
          gl.clearStaticReferences((byte) 95);
          SoundCache.clearStaticReferences((byte) 56);
          MenuScreen.clearStaticReferences((byte) 101);
          ek.clearStaticReferences(117);
          IntrusiveDeque.resetStaticState((byte) -128);
          va.clearStaticReferences((byte) 0);
          DiskCacheWorker.clearStaticReferences(3);
          ne.clearStaticReferences(30731);
          BufferedCacheFile.clearStaticReferences(true);
          BufferedSocket.clearStaticReferences((byte) 84);
          PcmPlayerService.clearStaticReferences();
          MidiPcmStream.clearDeclaredStaticReferences(103);
          CrossfadingMidiPcmStream.clearStaticReferences(false);
          IntrusiveNode.clearStaticReferences(12516);
          qd.clearStaticReferences(4);
          MusicPatchNode.clearDeclaredStaticReferences(8192);
          MidiFileReader.clearStaticReferences();
          MusicPatchPcmStream.clearDeclaredStaticReferences(-94);
          rd.a(127);
          sf.clearStaticReferences((byte) 123);
          ma.clearStaticReferences(true);
          w.clearStaticReferences((byte) 53);
          d.a(-121);
          vd.clearStaticReferences((byte) 57);
          kk.clearStaticReferences(-1);
          ja.a((byte) -43);
          ArchiveIndex.clearStaticReferences(0);
          GzipDecompressor.clearStaticReferences(false);
          ArchiveSource.resetStaticState(8355711);
          pg.resetStaticState((byte) 127);
          he.a(false);
          jc.clearStaticReferences(1731);
          ModalDialogHost.clearStaticReferences((byte) 30);
          AccountCreationResultPanel.discardDeclaredStaticReferences(6);
          ProgressDialog.discardDeclaredStaticReferences(121);
          StandardContentDialog.discardDeclaredStaticReferences(-1);
          ProgressMessageDialog.clearDeclaredStaticReferences((byte) -107);
          AccountRegistrationPanel.clearStaticReferences(false);
          GuestPlayConfirmationForm.e((byte) -102);
          LoginPanel.clearStaticReferences((byte) 97);
          DisplayNameSelectionPanel.h(60);
          mb.b(-694484242);
          aj.clearStaticReferences((byte) -63);
          VorbisSample.clearStaticReferences();
          VorbisFloor.clearStaticReferences();
          SynthesizerVoice.clearStaticReferences();
          u.clearStaticReferences(2);
          ch.clearStaticReferences(-114);
          id.clearStaticReferences((byte) 109);
          SpriteState.clearStaticReferences(false);
          DualLinkNode.d(-1);
          ph.a(-20542);
          ub.clearStaticReferences(37);
          lk.clearStaticReferences(true);
          ac.a(-15180);
          ed.a(4);
          wa.clearStaticReferences(-2);
          wb.clearStaticReferences(-55);
          la.resetStaticState((byte) 74);
          IsaacRandom.clearStaticReferences(-122);
          ti.clearStaticReferences(103);
          PcmOutputWorker.clearStaticReferences((byte) -90);
          ea.d(false);
          hl.a((byte) -113);
          NetworkArchiveRequest.resetStaticState(-74);
          SectorCacheStore.resetStaticState((byte) 102);
          DiskArchiveRequest.releaseDeclaredStaticReferences(80);
          CachedArchiveSource.clearStaticReferences((byte) 0);
          RandomAccessCacheFile.resetStaticState(119);
          qj.a(-126);
          ArchiveRequest.clearDeclaredStaticReferences(-106);
          pf.clearStaticReferences((byte) -104);
          FullscreenStatusDialog.discardDeclaredStaticReferences(-1);
          DefaultTextWidgetRenderer.clearStaticReferences(0);
          hk.clearStaticReferences();
          ai.clearStaticReferences(-78);
          cf.resetStaticState((byte) -87);
          uh.resetStaticState(-18662);
          vh.a(false);
          eh.clearStaticReferences((byte) 58);
          ji.a((byte) -102);
          cg.clearStaticReferences(-24856);
          kd.clearStaticReferences((byte) -95);
          l.clearStaticReferences(95);
          jj.resetStaticState(0);
          jh.clearStaticReferences(-86);
          DelegatingCanvas.clearStaticReferences(-127);
          og.clearStaticReferences(65);
          qg.clearStaticReferences(false);
          int var2_int = -89 / ((-28 - param0) / 59);
          ByteStorage.clearStaticReferences((byte) 94);
          Bzip2Decompressor.clearStaticReferences();
          Bzip2State.clearStaticReferences((byte) -37);
          di.clearDeclaredStaticReferences(7);
          ByteArrayPoolSupport.a((byte) -108);
          bj.clearStaticReferences(50);
          td.clearStaticReferences(false);
          ql.clearDeclaredStaticReferences(1);
          sj.clearStaticReferences(1);
          TextLayout.clearStaticReferences(-25616);
          UiWidget.e(-24922);
          InteractiveWidget.clearDeclaredStaticReferences(85);
          SingleChildWidgetContainer.i(126);
          ResizableModalDialog.releaseDeclaredStaticReferences(73);
          ModalDialog.clearDeclaredStaticReferences(112);
          WidgetContainer.resetStaticState(false);
          gd.clearStaticReferences(103);
          mj.clearStaticReferences((byte) 11);
          ba.clearDeclaredStaticReferences(71);
          cd.a(8192);
          oc.clearStaticReferences(255);
          v.clearStaticReferences((byte) -97);
          h.a(-94);
          ta.b((byte) 14);
          fh.a((byte) 58);
          SocketConnector.b(100);
          ProxyAuthenticationRequiredException.clearStaticReferences(-107);
          NanoFrameTimer.clearStaticReferences(-108);
          ImageProducerRasterBuffer.b(768);
          uj.clearStaticReferences(1);
          MidiNoteMask.clearDeclaredStaticReferences(-120);
          fi.clearStaticReferences(-18120);
          MusicPatch.a((byte) 124);
          MusicPatchEnvelope.a(-6960);
          LabeledWidgetContainer.d((byte) -61);
          ValidatedTextField.clearStaticReferences((byte) -80);
          EditableTextField.releaseDeclaredStaticReferences(106);
          ContentTransitionDialog.clearStaticReferences((byte) 87);
          StripedProgressWidget.clearStaticReferences((byte) 113);
          NameSuggestionsPanel.clearStaticReferences((byte) -88);
          RichTextWidget.a(2);
          ValidationStatusIcon.clearStaticReferences((byte) 110);
          ValidationStatusWidget.releaseDeclaredStaticReferences(-124);
          tg.releaseDeclaredStaticReferences(22722);
          TextFieldValidator.clearDeclaredStaticReferences(30514);
          nb.clearStaticReferences(19161);
          RegistrationAgreementPane.i(-28528);
          be.a(-3);
          hh.clearStaticReferences((byte) 54);
          SoundFilter.clearStaticReferences();
          fb.a(true);
          RichTextLayout.resetStaticState(-14275);
          DirectByteStorage.clearStaticReferences(0);
          GrowableIntArray.resetStaticState(1);
          DraggableWidgetContainer.clearStaticReferences(false);
          DropTargetWidgetContainer.clearDeclaredStaticReferences(114);
          ff.clearStaticReferences(255);
          IterableNodeHashTable.clearStaticReferences(7903);
          SecondaryNodeDeque.clearStaticReferences((byte) -61);
          pe.clearDeclaredStaticReferences(99);
          tk.i(123);
          ProxySocketConnector.clearStaticReferences(-25904);
          ok.clearStaticReferences(-15739);
          NodeHashTableIterator.clearStaticReferences(5);
          SecondaryNodeDequeIterator.a(0);
          sd.clearStaticReferences((byte) -114);
          qc.clearStaticReferences(false);
          fa.resetStaticState(true);
          ud.resetStaticState(5010);
          m.clearDeclaredStaticReferences(0);
          gh.d(-1);
          ri.resetStaticState(false);
          uf.clearDeclaredStaticReferences(22645);
          bg.f(-24631);
          pb.clearStaticReferences(83);
          AlphaWidgetContainer.clearStaticReferences((byte) 45);
          dj.clearDeclaredStaticReferences(-77);
          rh.resetStaticState(0);
          ib.clearDeclaredStaticReferences(0);
          bl.a(0);
          AccountRequestState.clearStaticReferences(11051);
          AccountServiceResult.a(true);
          ce.clearStaticReferences(true);
          kb.clearStaticReferences((byte) 15);
          sa.clearStaticReferences((byte) -116);
          DialogMessagePane.a((byte) -127);
          fg.clearStaticReferences((byte) -115);
          il.clearStaticReferences(2113536);
          vb.d(20364);
          jb.clearStaticReferences(22174);
          FullscreenNoticeType.clearStaticReferences(0);
          fj.clearDeclaredStaticReferences(-13);
          lc.a(-53);
          wi.a(-26923);
          ob.clearStaticReferences(false);
          bf.clearStaticReferences((byte) 119);
          TextLineMetrics.clearStaticReferences(-3390);
          PasswordValidator.j(8191);
          EmailFormatValidator.clearStaticReferences((byte) 82);
          ConfirmedEmailAvailabilityValidator.clearStaticReferences(true);
          AgeValidator.e((byte) -123);
          MatchingFieldValidator.releaseDeclaredStaticReferences(732);
          wh.clearStaticReferences(25817);
          TextHotspotBounds.a(26333);
          qf.a(10351);
          DebouncedFieldValidator.clearStaticReferences(350);
          pc.clearStaticReferences((byte) -121);
          this.field_x = null;
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "SolKnight.G(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.a("solknight", 11, 8);
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "SolKnight.init()");
        }
    }

    private final int b(int param0, boolean param1) {
        int var5_int = 0;
        Sprite dupTemp$0 = null;
        int var14 = 0;
        int var16 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_86_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Sprite[] var4 = null;
        Sprite var5 = null;
        int var6 = 0;
        Sprite var6_ref_o = null;
        Sprite var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Sprite var11 = null;
        int var12 = 0;
        int var13 = 0;
        Sprite var15 = null;
        Sprite[] var18 = null;
        Sprite var19 = null;
        Sprite var20 = null;
        Sprite var21 = null;
        int var3_intLifetime1;
        int var3_intLifetime1Lifetime1;
        var16 = field_L ? 1 : 0;
        try {
          kb.b((byte) -128);
          if (null != AccountServiceResult.field_g) {
            if (pl.field_d.ensureIndexLoaded((byte) -121) &&
              pl.field_d.tryLoadGroupByName(2, "basic")) {
              if (AccountServiceResult.field_g.ensureIndexLoaded((byte) -121) &&
                AccountServiceResult.field_g.tryLoadAllGroups(true)) {
                if (ProxySocketConnector.field_h.ensureIndexLoaded((byte) -121) &&
                  ProxySocketConnector.field_h.tryLoadAllGroups(true)) {
                  if (NetworkArchiveRequest.field_u.ensureIndexLoaded((byte) -121) &&
                    NetworkArchiveRequest.field_u.tryLoadAllGroups(true)) {
                    if (ValidatedTextField.field_cb.ensureIndexLoaded((byte) -121) &&
                      ValidatedTextField.field_cb.tryLoadAllGroups(true)) {
                      if (fh.field_c.ensureIndexLoaded((byte) -121) &&
                        fh.field_c.tryLoadAllGroups(true)) {
                        if (field_I.ensureIndexLoaded((byte) -121) &&
                          field_I.tryLoadAllGroups(true)) {
                          TextFieldValidator.a((byte) 102, SocketConnector.field_e, 65.0f);
                          this.renderClientFrame(-11633);
                          if (!param1) {
                            stackIn_44_0 = pb.field_c;
                            return stackIn_44_0;
                          }
                          FullscreenFocusCanvas.a((byte) 81);
                          qc.field_s = new SoundCache(AccountServiceResult.field_g, ProxySocketConnector.field_h);
                          bf.field_b[0] = VorbisSample.loadByName(ProxySocketConnector.field_h, "", "combo_power").decodeAllToPcm();
                          bf.field_b[1] = VorbisSample.loadByName(ProxySocketConnector.field_h, "", "mega_power").decodeAllToPcm();
                          bf.field_b[2] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "load_weapon").toPcmSample();
                          bf.field_b[3] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "rocket_launcher").toPcmSample();
                          bf.field_b[4] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "explosion").toPcmSample();
                          bf.field_b[5] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "laser").toPcmSample();
                          bf.field_b[6] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "asteroid_proximity").toPcmSample();
                          bf.field_b[7] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "scatter_separates").toPcmSample();
                          bf.field_b[8] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "homing_missile_launch").toPcmSample();
                          bf.field_b[9] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "nuke_explode").toPcmSample();
                          bf.field_b[10] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "nuke_load").toPcmSample();
                          bf.field_b[11] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "railgun_fire_and_load").toPcmSample();
                          bf.field_b[12] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "planet_explode").toPcmSample();
                          bf.field_b[13] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "menu_mouseover").toPcmSample();
                          bf.field_b[14] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "menu_select").toPcmSample();
                          bf.field_b[15] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "scatter_launcher").toPcmSample();
                          bf.field_b[16] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "laser_impact_burn").toPcmSample();
                          bf.field_b[17] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "plasma_fire").toPcmSample();
                          bf.field_b[18] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "plasma_charge").toPcmSample();
                          bf.field_b[19] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "fusion_charge").toPcmSample();
                          bf.field_b[20] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "fusion_fire").toPcmSample();
                          bf.field_b[21] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "asteroid_tiny_rotate").toPcmSample();
                          bf.field_b[22] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "asteroid_small_rotate").toPcmSample();
                          bf.field_b[23] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "asteroid_medium_rotate").toPcmSample();
                          bf.field_b[24] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "asteroid_large_rotate").toPcmSample();
                          bf.field_b[25] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "asteroid_huge_rotate").toPcmSample();
                          bf.field_b[26] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "explosion_huge").toPcmSample();
                          bf.field_b[27] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "explosion_large").toPcmSample();
                          bf.field_b[28] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "explosion_medium").toPcmSample();
                          bf.field_b[29] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "explosion_small").toPcmSample();
                          bf.field_b[30] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "explosion_tiny").toPcmSample();
                          bf.field_b[31] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "railgun_impact").toPcmSample();
                          bf.field_b[32] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "plasma_impact").toPcmSample();
                          bf.field_b[33] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "plasma_impact_upgraded").toPcmSample();
                          bf.field_b[34] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "nuke_explode_upgraded").toPcmSample();
                          bf.field_b[35] = SynthesizedSoundEffect.loadByName(AccountServiceResult.field_g, "", "sol_sword").toPcmSample();
                          AccountServiceResult.field_g = null;
                          ProxySocketConnector.field_h = null;
                          stackIn_46_0 = MusicPatch.field_o;
                          return stackIn_46_0;
                        }
                        TextFieldValidator.a((byte) 102, ab.a(field_I, ValidatedTextField.field_bb, ri.field_d, "", false), 60.0f);
                        stackIn_39_0 = pb.field_c;
                        return stackIn_39_0;
                      }
                      TextFieldValidator.a((byte) 102, ab.a(fh.field_c, vb.field_i, IsaacRandom.field_e, "", false), 50.0f);
                      stackIn_34_0 = pb.field_c;
                      return stackIn_34_0;
                    }
                    TextFieldValidator.a((byte) 102, ab.a(ValidatedTextField.field_cb, DropTargetWidgetContainer.field_L, je.field_b, "", false), 40.0f);
                    stackIn_29_0 = pb.field_c;
                    return stackIn_29_0;
                  }
                  TextFieldValidator.a((byte) 102, ok.a(0, -18884, je.field_b, NetworkArchiveRequest.field_u, DropTargetWidgetContainer.field_L), 30.0f);
                  stackIn_24_0 = pb.field_c;
                  return stackIn_24_0;
                }
                TextFieldValidator.a((byte) 102, ab.a(ProxySocketConnector.field_h, l.field_b, rd.field_a, "", false), 20.0f);
                stackIn_19_0 = pb.field_c;
                return stackIn_19_0;
              }
              TextFieldValidator.a((byte) 102, ab.a(AccountServiceResult.field_g, l.field_b, rd.field_a, "", false), 10.0f);
              stackIn_13_0 = pb.field_c;
              return stackIn_13_0;
            }
            TextFieldValidator.a((byte) 102, ab.a(pl.field_d, vb.field_i, IsaacRandom.field_e, "basic", false), 3.0f);
            stackIn_8_0 = pb.field_c;
            return stackIn_8_0;
          }
          if (ValidatedTextField.field_cb != null) {
            TextFieldValidator.a((byte) 102, AccountRegistrationPanel.field_E, 75.0f);
            this.renderClientFrame(param0 - 11633);
            StripedProgressWidget.field_M[0] = MusicTrack.load(ValidatedTextField.field_cb, "", "sol knight title");
            StripedProgressWidget.field_M[1] = MusicTrack.load(ValidatedTextField.field_cb, "", "sol_ingame_1");
            StripedProgressWidget.field_M[2] = MusicTrack.load(ValidatedTextField.field_cb, "", "sol_ingame_2");
            StripedProgressWidget.field_M[3] = MusicTrack.load(ValidatedTextField.field_cb, "", "sol_ingame_3");
            StripedProgressWidget.field_M[4] = MusicTrack.load(ValidatedTextField.field_cb, "", "sol knight gameover jingle");
            StripedProgressWidget.field_M[5] = MusicTrack.load(ValidatedTextField.field_cb, "", "sol knight victory jingle");
            ValidatedTextField.field_cb = null;
            stackIn_49_0 = MusicPatch.field_o;
            return stackIn_49_0;
          }
          if (null != NetworkArchiveRequest.field_u) {
            for (var3_int = 0; 6 > var3_int; var3_int++) {
              if (null != StripedProgressWidget.field_M[var3_int] &&
                !NameSuggestionsPanel.field_I.prepareTrackSamples(176400, StripedProgressWidget.field_M[var3_int], qc.field_s, NetworkArchiveRequest.field_u, -122)) {
                stackIn_56_0 = MusicPatch.field_o;
                return stackIn_56_0;
              }
            }
            NameSuggestionsPanel.field_I.releasePatchSampleIds(true);
            NetworkArchiveRequest.field_u = null;
            qc.field_s = null;
            stackIn_59_0 = MusicPatch.field_o;
            return stackIn_59_0;
          }
          if (pl.field_d != null) {
            TextFieldValidator.a((byte) 102, RichTextWidget.field_N, 90.0f);
            this.renderClientFrame(-11633);
            jc.field_b = Asteroid.a("unachieved", "basic", pl.field_d, (byte) -127);
            nb.field_a = Asteroid.a("locked", "basic", pl.field_d, (byte) -117);
            u.field_c = Asteroid.a("orbcoin", "basic", pl.field_d, (byte) -115);
            AccountRequestState.a(124, jc.field_b);
            AccountRequestState.a(115, nb.field_a);
            AccountRequestState.a(123, u.field_c);
            pl.field_d = null;
            ai.field_b = null;
            stackIn_64_0 = MusicPatch.field_o;
            return stackIn_64_0;
          }
          if (fh.field_c == null) {
            jh.a(-1);
            for (var3_intLifetime1 = param0; 10 > var3_intLifetime1; var3_intLifetime1++) {
              vd.screens[var3_intLifetime1] = new MenuScreen(var3_intLifetime1);
            }
            kd.currentScreenIndex = 0;
            vh.a(24, 50);
            bj.a(50, -127);
            FullscreenStatusDialog.field_W = new int[500];
            for (var3_intLifetime1Lifetime1 = 0; FullscreenStatusDialog.field_W.length > var3_intLifetime1Lifetime1; var3_intLifetime1Lifetime1 += 2) {
              FullscreenStatusDialog.field_W[var3_intLifetime1Lifetime1] = -640 + bk.a(1280, jb.field_g, (byte) -108);
              FullscreenStatusDialog.field_W[1 + var3_intLifetime1Lifetime1] = bk.a(720, jb.field_g, (byte) 69);
            }
            kh.field_d = 255;
            pg.field_e = true;
            stackIn_86_0 = FullscreenNoticeType.field_d;
            return stackIn_86_0;
          }
          BufferedSocket.field_b = lc.a(fh.field_c, 1, "b24", "", field_I);
          SocketConnector.field_g = lc.a(fh.field_c, 1, "b12", "", field_I);
          td.field_e = SecondaryNodeDeque.a(fh.field_c, -18362, "guns", "");
          GrowableIntArray.field_d = Asteroid.a("husk", "", fh.field_c, (byte) -125);
          uh.field_l = SecondaryNodeDeque.a(fh.field_c, -18362, "stars", "");
          wi.field_i = SecondaryNodeDeque.a(fh.field_c, param0 - 18362, "asteroids", "");
          hf.field_c = SecondaryNodeDeque.a(fh.field_c, -18362, "ammo", "");
          Bzip2State.field_n = Asteroid.a("sword", "", fh.field_c, (byte) -124);
          Bzip2State.field_p = eb.a(false, Asteroid.a("shield_packed", "", fh.field_c, (byte) -127), 72);
          qd.field_f = SecondaryNodeDeque.a(fh.field_c, -18362, "overlays", "");
          Asteroid.a("space", "", fh.field_c, (byte) -128);
          IterableNodeHashTable.field_g = SecondaryNodeDeque.a(fh.field_c, -18362, "explosion", "");
          NameSuggestionsPanel.field_F = SecondaryNodeDeque.a(fh.field_c, -18362, "nukeexplosion", "");
          ak.field_e = new Sprite[8];
          ak.field_e[0] = Asteroid.a("pluto", "", fh.field_c, (byte) -123);
          ak.field_e[1] = Asteroid.a("neptune", "", fh.field_c, (byte) -110);
          ak.field_e[2] = Asteroid.a("uranus", "", fh.field_c, (byte) -127);
          ak.field_e[3] = Asteroid.a("saturn", "", fh.field_c, (byte) -125);
          ak.field_e[4] = Asteroid.a("jupiter", "", fh.field_c, (byte) -117);
          ak.field_e[5] = Asteroid.a("asteroid", "", fh.field_c, (byte) -113);
          ak.field_e[6] = Asteroid.a("mars", "", fh.field_c, (byte) -111);
          ak.field_e[7] = Asteroid.a("earth", "", fh.field_c, (byte) -125);
          v.a(param0 ^ -98, ai.field_c, Asteroid.a("mbfg", "", fh.field_c, (byte) -121));
          rg.a(SecondaryNodeDeque.a(fh.field_c, -18362, "mbsshots", ""), -40);
          ak.a(80, 0, ql.field_s, true, 16776960, ia.g(param0 + 113));
          var19 = new Sprite(152, 152);
          var20 = var19;
          var20.bindAsRenderTarget();
          ak.field_e[4].drawScaledAveraged(0, 0, 152, 152);
          ai.a(10, SocketConnector.field_g, 31, 132, 132, 16776960, -122, 10, var20, 0, 5500);
          dd.field_c = SecondaryNodeDeque.a(fh.field_c, param0 ^ -18362, "uberframe", "");
          this.a(dd.field_c, (byte) 31);
          dd.field_c = null;
          w.field_b = SecondaryNodeDeque.a(fh.field_c, -18362, "buttonframe", "");
          IterableNodeHashTable.field_f = SecondaryNodeDeque.a(fh.field_c, -18362, "achievements", "");
          var18 = IterableNodeHashTable.field_f;
          var4 = var18;
          for (var5_int = 0; var18.length > var5_int; var5_int++) {
            var6_ref_o = var18[var5_int];
            AccountRequestState.a(param0 + 120, var6_ref_o);
          }
          var21 = Bzip2State.field_p;
          var5 = Bzip2State.field_n;
          var6 = 316 * var21.field_q / var5.field_r;
          dupTemp$0 = new Sprite(var6, 316);
          h.field_b = dupTemp$0;
          var7 = dupTemp$0;
          var7.bindAsRenderTarget();
          var5.drawScaledAveraged(var6 - 316 * var5.field_q / var5.field_r >> 1, 0, var5.field_q * 316 / var5.field_r, 316);
          var21.drawScaledAveraged(0, 3 * (316 - 316 * var21.field_r / var5.field_r) / 5, var6, var21.field_r * 316 / var5.field_r);
          var8 = 40;
          var9 = 191;
          var10 = -8 - var8 * var7.field_q / var7.field_r + var9;
          var11 = new Sprite(var9, var8);
          var11.bindAsRenderTarget();
          var7.drawScaledAveraged(0, 0, var8 * var7.field_q / var7.field_r, var8);
          var12 = var10 * qd.field_f[0].field_r / qd.field_f[0].field_q;
          qd.field_f[0].drawScaledAveraged(var7.field_q * var8 / var7.field_r + 8, -var12 + var8 >> 1, var10, var12);
          ah.a(var11, false);
          var13 = BufferedSocket.field_b.field_m;
          pg.field_a = new Sprite(var13, var13);
          pg.field_a.bindAsRenderTarget();
          u.field_c.drawScaledAveraged(0, 0, var13, var13);
          u.field_c = null;
          eh.field_b = new Sprite[IterableNodeHashTable.field_g.length];
          for (var14 = 0; IterableNodeHashTable.field_g.length > var14; var14++) {
            var15 = IterableNodeHashTable.field_g[var14];
            eh.field_b[var14] = new Sprite(var15.field_p, var15.field_t);
            eh.field_b[var14].bindAsRenderTarget();
            var15.drawSilhouette(-var15.field_s, -var15.field_n, 65793);
            var15.drawWithOpacity(-var15.field_s, -var15.field_n, 64);
            SoftwareRasterizer.grayscaleRectangle(0, 0, SoftwareRasterizer.field_a, SoftwareRasterizer.field_d);
          }
          Bzip2State.field_e.setAsRasterTarget(true);
          fh.field_c = null;
          field_I = null;
          stackIn_76_0 = MusicPatch.field_o;
          return stackIn_76_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw MusicPatch.wrapClientException((Throwable) ((Object) var3), "SolKnight.S(" + param0 + ',' + param1 + ')');
        }
    }

    final void initializeClient(int param0) {
        this.a(0, false, 6, 9, true, 16, 10, 8);
        MidiPcmStream var2 = new MidiPcmStream();
        var2.setChannelProgram(-4474, 128, 9);
        GameApplet.a(var2, (java.awt.Component) ((Object) EmailFormatValidator.field_q), true, (byte) -40, 22050, wh.field_c);
        hc.field_d = 16777088;
        if (param0 != -31680) {
          return;
        }
        try {
          FrameTimer.field_c = 16776960;
          pb.field_b = 16777215;
          this.a((byte) -38, true, false, false, false);
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "SolKnight.H(" + param0 + ')');
        }
    }

    public SolKnight() {
    }

    private final void h(byte param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var2_intLifetime1;
        var3 = field_L ? 1 : 0;
        try {
          if (0 == (SectorCacheStore.field_i & 1073741824)) {
            SectorCacheStore.field_i = SectorCacheStore.field_i + 2048;
            NetworkArchiveRequest.field_t = NetworkArchiveRequest.field_t + fa.field_f;
          } else {
            var2_int = bk.a(SectorCacheStore.field_i >>> 11, jb.field_g, (byte) -102);
            SectorCacheStore.field_i = SectorCacheStore.field_i - (var2_int << 11);
            NetworkArchiveRequest.field_t = NetworkArchiveRequest.field_t - fa.field_f * var2_int;
          }
          if (param0 != -108) {
            return;
          }
          if (wb.field_c != 0) {
            if (0 < (PacketBuffer.field_j << 17) + lc.field_h) {
              lc.field_h = lc.field_h + (PacketBuffer.field_j << 17);
              NetworkArchiveRequest.field_t = NetworkArchiveRequest.field_t + PacketBuffer.field_j * ud.field_k;
            } else {
              NetworkArchiveRequest.field_t = NetworkArchiveRequest.field_t - PacketBuffer.field_j * ud.field_k;
              lc.field_h = lc.field_h - (PacketBuffer.field_j << 17);
            }
          }
          if (je.field_d == 0) {
            if (ClientException.field_b > 0) {
              ClientException.field_b = ClientException.field_b - 1;
              if (ClientException.field_b == 385) {
                mb.a(true, 35, 256);
              }
            }
            if (ClientException.field_b >= 0) {
              SingleChildWidgetContainer.field_E = 240 - ClientException.field_b;
              ArchiveSource.field_c = -160;
              if (SingleChildWidgetContainer.field_E < 0) {
                SingleChildWidgetContainer.field_E = 0;
              }
            }
            if (0 < kh.field_d) {
              kh.field_d = kh.field_d - 1;
              kh.field_d = kh.field_d * 9 / 10;
            }
            if (kd.currentScreenIndex != ri.field_f) {
              NameSuggestionsPanel.field_H = NameSuggestionsPanel.field_H + 1;
              if (32 == NameSuggestionsPanel.field_H) {
                if (kd.currentScreenIndex == 2) {
                  kh.field_c = null;
                }
                if (kd.currentScreenIndex == 8 &&
                  9 == ri.field_f) {
                  ah.field_f = 0;
                  SecondaryNodeDequeIterator.field_d = 0;
                  w.field_a.clear(true);
                }
                NameSuggestionsPanel.field_H = 0;
                kd.currentScreenIndex = ri.field_f;
              }
            } else {
              if (kd.currentScreenIndex != -1) {
                vd.screens[kd.currentScreenIndex].c(0);
                if (kd.currentScreenIndex == 0) {
                  BufferedCacheFile.a(true);
                }
              } else {
                BufferedCacheFile.a(true);
              }
            }
            if (!(0 > ClientException.field_b) ||
              pg.field_e &&
              kd.currentScreenIndex != -1) {
              var4 = 1;
              var2_intLifetime1 = var4;
              while (FullscreenStatusDialog.field_W.length > var4) {
                FullscreenStatusDialog.field_W[var4] = FullscreenStatusDialog.field_W[var4] - 1;
                if (FullscreenStatusDialog.field_W[var4] < 0) {
                  FullscreenStatusDialog.field_W[var4] = FullscreenStatusDialog.field_W[var4] + 720;
                }
                var4 += 2;
              }
            }
            if (lc.field_t.beginBackward((byte) 51) != null) {
              fieldTemp$0 = DelegatingCanvas.field_e + 1;
              DelegatingCanvas.field_e = DelegatingCanvas.field_e + 1;
              if (290 == fieldTemp$0) {
                DelegatingCanvas.field_e = 0;
                lc.field_t.removeLast(0);
                return;
              }
            }
          } else {
            if (1 == je.field_d) {
              NameSuggestionsPanel.field_H = NameSuggestionsPanel.field_H + 1;
              if (NameSuggestionsPanel.field_H != 32) {
                return;
              }
              if (!RandomAccessCacheFile.b((byte) -104)) {
                nh.a((byte) 3);
              } else {
                Archive.showLoginForm(true);
              }
              je.field_d = 2;
              return;
            }
            if (je.field_d == 2) {
              if (!il.b(507)) {
                if (lk.field_e > 0) {
                  ah.b(true);
                }
                kd.currentScreenIndex = h.field_g;
                if (kd.currentScreenIndex == -2) {
                  kd.currentScreenIndex = 0;
                  ta.a(false, 320, w.field_b, 2, SocketConnector.field_g.field_s + SocketConnector.field_g.field_F, SocketConnector.field_g, 8, BufferedSocket.field_b.field_F + BufferedSocket.field_b.field_s, BufferedSocket.field_b.field_F, w.field_b, 8, 240, BufferedSocket.field_b, SocketConnector.field_g.field_F, false);
                }
              } else {
                kd.currentScreenIndex = SoundCache.field_b;
              }
              ri.field_f = kd.currentScreenIndex;
              je.field_d = 3;
              return;
            }
            NameSuggestionsPanel.field_H = NameSuggestionsPanel.field_H - 1;
            if (NameSuggestionsPanel.field_H == 0) {
              je.field_d = 0;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw MusicPatch.wrapClientException((Throwable) ((Object) var2), "SolKnight.R(" + param0 + ')');
        }
    }

    final void renderClientFrame(int param0) {
        Object stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean stackIn_10_2 = false;
        int stackIn_79_0 = 0;
        boolean stackIn_80_1 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4_int = 0;
        la var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = field_L ? 1 : 0;
        try {
          if (dj.field_k != null) {
            stackIn_5_0 = dj.field_k;
          } else {
            stackIn_5_0 = EmailFormatValidator.field_q;
          }
          var2 = stackIn_5_0;
          if (bl.a((byte) -81)) {
            stackIn_9_0 = var2;
            stackIn_9_1 = 105;
            if (dj.field_k != null) {
              stackIn_10_2 = true;
            } else {
              stackIn_10_2 = wh.field_b;
            }
            IntrusiveDeque.a((java.awt.Canvas) (stackIn_9_0), stackIn_9_1, stackIn_10_2);
            return;
          }
          if (!na.field_b) {
            ih.a(param0 ^ -31842, (java.awt.Canvas) (var2));
            return;
          }
          if (ConfirmedEmailAvailabilityValidator.field_q != null) {
            TextFieldValidator.a((byte) 102, bg.field_t, 100.0f);
            ih.a(20753, (java.awt.Canvas) (var2));
            return;
          }
          SoftwareRasterizer.fillRectangleVerticalGradient(-320 - ArchiveSource.field_c, -SingleChildWidgetContainer.field_E, 1280, 720, 0, il.field_e[kb.field_b]);
          ValidationStatusIcon.field_O = ValidationStatusIcon.field_O + 1;
          var3 = 0;
          if (FullscreenStatusDialog.field_W.length < ValidationStatusIcon.field_O) {
            ValidationStatusIcon.field_O = 0;
          }
          var4_int = 0;
          if (param0 != -11633) {
            return;
          }
          while (var4_int < FullscreenStatusDialog.field_W.length) {
            var3++;
            if (var3 >= 5) {
              var3 = 0;
            }
            var5 = 320 + (-ArchiveSource.field_c + FullscreenStatusDialog.field_W[var4_int]);
            var6 = -SingleChildWidgetContainer.field_E + FullscreenStatusDialog.field_W[1 + var4_int];
            var7 = var4_int - ValidationStatusIcon.field_O;
            if (-FullscreenStatusDialog.field_W.length / 2 > var7) {
              var7 = var7 + FullscreenStatusDialog.field_W.length;
            }
            if (FullscreenStatusDialog.field_W.length / 2 < var7) {
              var7 = var7 - FullscreenStatusDialog.field_W.length;
            }
            if (var7 < 0) {
              var7 = -var7;
            }
            if (var7 > 255) {
              var7 = 255;
            }
            uh.field_l[var3].drawAdditive(var5, var6, var7);
            var4_int += 2;
          }
          if (kd.currentScreenIndex == ri.field_f) {
            if (kd.currentScreenIndex == -1) {
              d.a(true, (byte) -48);
            } else {
              vd.screens[kd.currentScreenIndex].d(582);
            }
          } else {
            if (16 > NameSuggestionsPanel.field_H) {
              if (kd.currentScreenIndex == -1) {
                d.a(false, (byte) -48);
              } else {
                vd.screens[kd.currentScreenIndex].d(582);
              }
              ll.a(1 + NameSuggestionsPanel.field_H, 256, false, false);
              SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 16769381, NameSuggestionsPanel.field_H << 4);
            } else {
              if (ri.field_f != -1) {
                vd.screens[ri.field_f].d(582);
              } else {
                d.a(false, (byte) -48);
              }
              ll.a(1 - NameSuggestionsPanel.field_H + 32, 256, false, false);
              SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 16769381, 32 - NameSuggestionsPanel.field_H << 4);
            }
          }
          var4 = (la) (lc.field_t.beginBackward((byte) 51));
          if (var4 != null) {
            var6Lifetime1 = DelegatingCanvas.field_e;
            if (var6Lifetime1 >= 70) {
              if (var6Lifetime1 >= 220) {
                var5Lifetime1 = var6Lifetime1 + 190;
              } else {
                var5Lifetime1 = 410;
              }
            } else {
              var5Lifetime1 = 480 - var6Lifetime1;
            }
            var7Lifetime1 = SocketConnector.field_g.stringWidth(BufferedCacheFile.field_m[var4.field_h]);
            uj.a(60 + var7Lifetime1, 70, -60 - var7Lifetime1 + 640 >> 1, ContentTransitionDialog.field_fb, var5Lifetime1, 2);
            IterableNodeHashTable.field_f[var4.field_h].drawQuarterSize(304, 10 + SocketConnector.field_g.field_s + (SocketConnector.field_g.field_F + var5Lifetime1));
            SocketConnector.field_g.drawCentred(BufferedCacheFile.field_m[var4.field_h], 320, var5Lifetime1 + SocketConnector.field_g.field_F + 8, 16776960, 1);
          }
          if (RandomAccessCacheFile.b((byte) -115)) {
            SoftwareRasterizer.darkenRectangleHalf(0, 0, SoftwareRasterizer.field_a, SoftwareRasterizer.field_d);
            ai.a(h.field_d, (byte) -83, h.field_d[0].field_t, h.field_d[0].field_p);
          }
          if (je.field_d != 0) {
            var5Lifetime2 = NameSuggestionsPanel.field_H * 256 / 32;
            if (0 < var5Lifetime2) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_a, SoftwareRasterizer.field_d, 0, var5Lifetime2);
            }
          }
          if (ProgressDialog.g((byte) -94) &&
            !RandomAccessCacheFile.b((byte) -104)) {
            stackIn_79_0 = 25899;
            if (null != dj.field_k) {
              stackIn_80_1 = true;
            } else {
              stackIn_80_1 = wh.field_b;
            }
            ph.a(stackIn_79_0, stackIn_80_1);
          }
          uf.a((byte) 99, 0, 0, (java.awt.Canvas) (var2));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw MusicPatch.wrapClientException((Throwable) ((Object) var2_ref), "SolKnight.D(" + param0 + ')');
        }
    }

    public static void n(int param0) {
        try {
          field_K = null;
          if (param0 != 2325) {
            SolKnight.n(-100);
          }
          field_D = null;
          field_E = null;
          field_I = null;
        } catch (RuntimeException runtimeException) {
          throw MusicPatch.wrapClientException((Throwable) ((Object) runtimeException), "SolKnight.T(" + param0 + ')');
        }
    }

    private final void a(Sprite[] param0, byte param1) {
        int var3_int = 0;
        Sprite dupTemp$0 = null;
        int var15_int = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        Sprite var4 = null;
        Sprite var5 = null;
        Sprite var6 = null;
        Sprite var7 = null;
        Sprite var8 = null;
        Sprite var9 = null;
        int var10 = 0;
        Sprite[] var11 = null;
        int var12_int = 0;
        Sprite var12 = null;
        Sprite var13 = null;
        Sprite var15 = null;
        Sprite var16 = null;
        int var16_int = 0;
        Sprite var17 = null;
        Sprite var18 = null;
        Sprite var19 = null;
        Sprite var20 = null;
        Sprite var21 = null;
        Sprite var22 = null;
        Sprite var23 = null;
        Sprite var24 = null;
        Sprite var25 = null;
        Sprite var26 = null;
        Sprite var27 = null;
        Sprite var28 = null;
        Sprite var29 = null;
        Sprite var30 = null;
        Sprite var31 = null;
        int var32 = 0;
        Sprite var33 = null;
        Sprite var34 = null;
        Sprite var35 = null;
        Sprite var36 = null;
        Sprite var38 = null;
        Sprite[] var40 = null;
        Sprite var41 = null;
        Sprite var42 = null;
        Sprite var43 = null;
        int[] var48 = null;
        int[] var49 = null;
        int var12_intLifetime1;
        var32 = field_L ? 1 : 0;
        try {
          for (var3_int = 0; var3_int < param0.length; var3_int++) {
            var33 = param0[var3_int];
            var4 = var33;
            var4.field_r = var33.field_t;
            var4.field_q = var33.field_p;
            var5 = var4;
            var4.field_n = 0;
            var5.field_s = 0;
          }
          var34 = param0[0];
          var35 = wc.a(var34, 0);
          var36 = wc.a(var35, 0);
          var6 = param0[2];
          var7 = wc.a(var6, 0);
          var8 = wc.a(var7, 0);
          var9 = wc.a(var8, 0);
          PasswordValidator.field_k = param0[3];
          DropTargetWidgetContainer.field_H = wc.a(wc.a(PasswordValidator.field_k, 0), 0);
          h.field_d = new Sprite[9];
          h.field_d[2] = var7;
          h.field_d[0] = var34;
          h.field_d[1] = param0[1];
          h.field_d[8] = var36;
          h.field_d[6] = var9;
          h.field_d[5] = wc.a(h.field_d[1], 0);
          h.field_d[7] = wc.a(h.field_d[5], 0);
          h.field_d[3] = wc.a(h.field_d[7], 0);
          h.field_d[4] = new Sprite(32, 32);
          var10 = -106 % ((param1 - 77) / 40);
          var48 = h.field_d[4].field_v;
          for (var12_int = 0; var48.length > var12_int; var12_int++) {
            var48[var12_int] = 1;
          }
          GrowableIntArray.field_b = new Sprite[9];
          GrowableIntArray.field_b[2] = var7;
          GrowableIntArray.field_b[0] = var6;
          GrowableIntArray.field_b[5] = h.field_d[5];
          GrowableIntArray.field_b[6] = var9;
          GrowableIntArray.field_b[4] = h.field_d[4];
          GrowableIntArray.field_b[7] = h.field_d[7];
          GrowableIntArray.field_b[8] = var8;
          GrowableIntArray.field_b[1] = h.field_d[1];
          GrowableIntArray.field_b[3] = h.field_d[3];
          var40 = new Sprite[param0.length];
          var11 = var40;
          for (var12_intLifetime1 = 0; var12_intLifetime1 < param0.length; var12_intLifetime1++) {
            dupTemp$0 = param0[var12_intLifetime1].copy();
            var11[var12_intLifetime1] = dupTemp$0;
            var38 = dupTemp$0;
            var13 = var38;
            var49 = var38.field_v;
            for (var15_int = 0; var15_int < var49.length; var15_int++) {
              var16_int = var49[var15_int];
              if (~(65535 & var16_int) != ~(var16_int >> 8 & 65535)) {
                if (var16_int == 1) {
                  var49[var15_int] = 0;
                }
              } else {
                var49[var15_int] = 0;
              }
            }
            var38.trimTransparentBorders();
            var13.field_q = var38.field_p;
            var13.field_r = var38.field_t;
            var13.field_n = 0;
            var15 = var13;
            var15.field_s = 0;
          }
          var12 = new Sprite(29, 29);
          Sprite.copyRegion(var40[0], var12, 4, 0, 0, 0, 29, 29);
          Sprite.copyRegion(var40[0], var12, 0, 4, 0, 0, 10, 29);
          var41 = wc.a(var12, 0);
          var42 = wc.a(var41, 0);
          var43 = wc.a(var42, 0);
          var16 = GuestPlayConfirmationForm.a(var40[2], 30, 0, 0, 29, 29);
          var17 = wc.a(var16, 0);
          var18 = wc.a(var17, 0);
          var19 = wc.a(var18, 0);
          var20 = var40[1];
          var21 = wc.a(var20, 0);
          var22 = wc.a(var21, 0);
          var23 = wc.a(var22, 0);
          var24 = ProgressDialog.a(var12.field_r - var20.field_r, var20, 0, 0, 0, 0);
          var25 = ProgressDialog.a(0, var21, var41.field_q - var21.field_q, 0, 0, 0);
          var26 = ProgressDialog.a(0, var22, 0, 0, 0, var42.field_r - var22.field_r);
          var27 = ProgressDialog.a(0, var23, 0, var43.field_q - var23.field_q, 0, 0);
          var28 = GuestPlayConfirmationForm.a(var16, 30, 0, 0, var40[1].field_t, var40[1].field_t);
          var29 = wc.a(var28, 0);
          var30 = wc.a(var29, 0);
          var31 = wc.a(var30, 0);
          ContentTransitionDialog.field_fb = new Sprite[9];
          ContentTransitionDialog.field_fb[5] = var25;
          ContentTransitionDialog.field_fb[2] = var41;
          ContentTransitionDialog.field_fb[0] = var12;
          ContentTransitionDialog.field_fb[3] = var27;
          ContentTransitionDialog.field_fb[1] = var24;
          ContentTransitionDialog.field_fb[6] = GuestPlayConfirmationForm.a(var19, 30, var19.field_r - var31.field_r, 0, var12.field_q, var31.field_r);
          ContentTransitionDialog.field_fb[7] = var22;
          ContentTransitionDialog.field_fb[8] = GuestPlayConfirmationForm.a(var18, 30, var18.field_r - var31.field_r, 0, var41.field_q, var31.field_r);
          GameApplet.field_f = new Sprite[9];
          GameApplet.field_f[0] = GuestPlayConfirmationForm.a(var16, 30, 0, 0, var43.field_q, var29.field_r);
          GameApplet.field_f[3] = var27;
          GameApplet.field_f[7] = var26;
          GameApplet.field_f[2] = var29;
          GameApplet.field_f[1] = var20;
          GameApplet.field_f[6] = var43;
          GameApplet.field_f[5] = var21;
          GameApplet.field_f[8] = GuestPlayConfirmationForm.a(var18, 30, 0, var18.field_q - var29.field_q, var29.field_q, var43.field_r);
          TextLineMetrics.field_d = new Sprite[9];
          TextLineMetrics.field_d[0] = var28;
          TextLineMetrics.field_d[1] = var20;
          TextLineMetrics.field_d[2] = GuestPlayConfirmationForm.a(var17, 30, 0, 0, var42.field_q, var28.field_r);
          TextLineMetrics.field_d[3] = var23;
          TextLineMetrics.field_d[5] = var25;
          TextLineMetrics.field_d[6] = GuestPlayConfirmationForm.a(var19, 30, 0, 0, var28.field_q, var42.field_r);
          TextLineMetrics.field_d[8] = var42;
          TextLineMetrics.field_d[7] = GameApplet.field_f[7];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("SolKnight.U(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw MusicPatch.wrapClientException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_E = new int[4];
        field_G = 0;
        field_D = new fg("");
    }
}
