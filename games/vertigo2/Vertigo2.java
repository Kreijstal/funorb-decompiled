/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Vertigo2 extends GameShell {
    static tj field_E;
    static int[][] field_J;
    static String[] field_H;
    static String field_K;
    static String field_D;
    static String[] field_I;
    static String field_F;
    static ArgbSprite field_C;
    static UiPanel field_M;
    static String[] field_G;
    public static boolean field_L;

    private final void p(int param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = field_L ? 1 : 0;
        try {
          if (param0 != 50) {
            return;
          }
          ap.field_d = new bl(40, 100, 260, 300, DefaultTextWidgetRenderer.field_s, qr.field_h, IntrusiveNode.field_m, tb.field_d, pc.field_c);
          ap.field_d.field_K = ar.field_a;
          ap.field_d.field_J = 0;
          ap.field_d.field_F = 16777215;
          ap.field_d.field_y = new boolean[50];
          ap.field_d.field_m = 5921370;
          ap.field_d.field_P = 16777215;
          ap.field_d.field_x = 15637810;
          ap.field_d.field_k = new String[50];
          ap.field_d.field_I = 16777215;
          for (var2_int = 0; var2_int < ap.field_d.field_k.length; var2_int++) {
            ap.field_d.field_k[var2_int] = Vertigo2.a(new String[]{Integer.toString(1 + var2_int)}, ClientException.field_b, 103);
          }
          ap.field_d.field_u = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.wrapClientException((Throwable) ((Object) var2), "Vertigo2.F(" + param0 + ')');
        }
    }

    final void updateClient(int param0) {
        boolean discarded$0 = false;
        int var12_int = 0;
        boolean stackIn_8_1 = false;
        boolean stackIn_37_1 = false;
        int stackIn_125_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object var3_ref = null;
        int var4 = 0;
        pp var4_ref_pp = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        GameplayScreen var12 = null;
        int var13 = 0;
        int var14 = 0;
        ub var15 = null;
        Object var16 = null;
        nf var16_ref = null;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var6Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var16 = null;
        var14 = field_L ? 1 : 0;
        try {
          jq.a((byte) 29);
          AccountRegistrationPanel.field_M = PlayerAvatarRenderer.getMouseIdleTicks((byte) 119);
          ArrayWidgetContainer.h(0);
          var2_int = -90 % ((-13 - param0) / 47);
          if (dc.field_L != null &&
            dc.field_L.field_e) {
            cp.a((byte) 126);
            DelegatingCanvas.a(96);
          }
          stackIn_8_1 = (dc.field_L != null);
          this.c(stackIn_8_1, -6);
          if (hh.field_c) {
            this.l((byte) 123);
            hh.field_c = false;
          }
          ProxyAuthenticationRequiredException.field_f = ProxyAuthenticationRequiredException.field_f + 1;
          if (cp.a(-109)) {
            this.m(-105);
            if (cp.a(-1)) {
              if (tk.c((byte) -94)) {
                discarded$0 = this.a(16777215, false);
              }
              return;
            }
          }
          if (!ProxyAuthenticationRequiredException.field_a) {
            UiWidget.a((byte) -107, uo.field_h);
            if (this.a(16777215, true)) {
              ProxyAuthenticationRequiredException.field_a = true;
            }
          } else {
            if (!SpriteState.i(11)) {
              DiskCacheWorker.a((byte) 44);
            } else {
              if (!kg.h(114)) {
                if (!pq.b(0)) {
                  if (!DialogMessagePane.e((byte) 99)) {
                    this.d(false, -97);
                  } else {
                    if (DiskCacheWorker.field_a != DiskCacheWorker.field_f) {
                      this.d(false, -104);
                    } else {
                      var3 = Vertigo2.p((byte) -78);
                      if (var3 == 1) {
                        ad.field_h = true;
                        ip.a((byte) -71, oc.field_x, 0);
                      }
                      this.d(true, -110);
                    }
                  }
                } else {
                  stackIn_37_1 = (dc.field_L != null);
                  var3 = this.b(stackIn_37_1, 125);
                  if (var3 == 1 ||
                    var3 == 2) {
                    if (null != dc.field_L) {
                      cp.a((byte) 127);
                    }
                    if (var3 == 2) {
                      sf.a((java.applet.Applet) (this), -85);
                    }
                  }
                  this.d(true, -107);
                }
              } else {
                if (DiskCacheWorker.field_a != DiskCacheWorker.field_f) {
                  this.d(false, -111);
                } else {
                  var3 = ValidationStatusIcon.e((byte) -116);
                  if (var3 != 2) {
                    if (var3 == 3) {
                      SocketConnector.a(9790, true);
                    } else {
                      if (var3 == 4) {
                        jo.field_d = true;
                        ip.a((byte) -65, LoginPanel.field_I, 0);
                      }
                    }
                  } else {
                    cp.a((byte) 125);
                  }
                  this.d(true, -93);
                }
              }
            }
          }
          if (!ag.b(49)) {
            while (true) {
              var16_ref = (nf) (ProgressDialog.field_eb.removeLast((byte) -43));
              if (var16_ref != null) {
                DebouncedFieldValidator.a(4, var16_ref, 4);
                continue;
              }
              break;
            }
            while (true) {
              var15 = (ub) (WidgetWrapper.field_D.removeLast((byte) -43));
              if (var15 == null) {
                break;
              }
              jk.a(5, (byte) 44, var15);
            }
          }
          while (true) {
            if (!j.a(0, ok.field_d)) {
              lf.d(75, 0);
              if (eo.field_o) {
                wg.field_g = 0;
              }
              if (DefaultTextWidgetRenderer.b((byte) -81)) {
                var3Lifetime1 = this.h((byte) -127);
                if (var3Lifetime1 == 0 ||
                  var3Lifetime1 == 1) {
                  en.a(true);
                  if (1 == var3Lifetime1) {
                    kj.field_C = true;
                    ProxyAuthenticationRequiredException.field_b = true;
                  } else {
                    if (NameSuggestionsPanel.field_P) {
                      an.field_c = true;
                      sk.field_g = true;
                      lc.field_d = false;
                      if (LevelRenderer.field_b) {
                        HuffmanCodec.field_i = qp.field_c;
                        gj.a((byte) -103, false, LevelRenderer.field_n, 11);
                      } else {
                        gj.a((byte) 124, false, LevelRenderer.field_n, 0);
                      }
                      g.b(7);
                      fh.field_y[lc.field_b].a(-91, false, 0);
                      PacketBuffer.field_q = false;
                      LevelRenderer.field_b = false;
                      NameSuggestionsPanel.field_P = false;
                      vl.a(-115);
                      ki.a((byte) -72);
                      ua.a(-5141);
                    }
                    kj.field_C = false;
                    ProxyAuthenticationRequiredException.field_b = false;
                  }
                }
                var4 = 0;
                if (2 == var3Lifetime1) {
                  var4 = 1;
                }
                if (NameSuggestionsPanel.field_P ||
                  ProxyAuthenticationRequiredException.field_b ||
                  kj.field_C) {
                  var4 = 1;
                }
                if (!DefaultTextWidgetRenderer.b((byte) -81)) {
                  var4 = 0;
                }
                if (var4 != 0) {
                  wp.a(10);
                }
              }
              return;
            }
            if (lc.field_f == 69) {
              if (SocketConnector.field_c == null) {
                SocketConnector.field_c = new short[50];
              }
              for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 50; var3Lifetime1Lifetime1++) {
                SocketConnector.field_c[var3Lifetime1Lifetime1] = (short)SoundCache.field_f.readUnsignedShort((byte) -11);
                if (0 == SocketConnector.field_c[var3Lifetime1Lifetime1]) {
                  SocketConnector.field_c[var3Lifetime1Lifetime1] = (short)30000;
                }
              }
              continue;
            }
            if (9 == lc.field_f) {
              g.b(7);
              ProxyAuthenticationRequiredException.field_b = false;
              LevelRenderer.field_n = 11;
              kj.field_C = false;
              ProxyAuthenticationRequiredException.field_b = false;
              HuffmanCodec.field_i = SoundCache.field_f.readString(128);
              continue;
            }
            if (lc.field_f == 14) {
              g.b(7);
              so.a(un.b((byte) 114), 3, 150, 1024, re.c(-1087), rm.field_A, th.a(true), qp.roundUpPowerOfTwo(2000, 70), 113, qp.roundUpPowerOfTwo(8, 72));
              wn.a(-122, SecondaryNodeDequeIterator.a(true), pp.a(12));
              ProxyAuthenticationRequiredException.field_b = false;
              NameSuggestionsPanel.field_P = true;
              LevelRenderer.field_n = -2;
              continue;
            }
            if (lc.field_f == 15) {
              if (NameSuggestionsPanel.field_P) {
                g.b(7);
                ki.a((byte) -128);
                ua.a(-5141);
                LevelRenderer.field_b = false;
                PacketBuffer.field_q = false;
                LevelRenderer.field_n = 0;
                NameSuggestionsPanel.field_P = false;
                lc.field_d = false;
                sk.field_g = true;
                an.field_c = true;
                vl.a(-127);
              }
              kj.field_C = false;
              ProxyAuthenticationRequiredException.field_b = false;
              continue;
            }
            if (lc.field_f == 10 &&
              NameSuggestionsPanel.field_P) {
              tq.a((byte) -66);
              continue;
            }
            if (lc.field_f == 67) {
              var3Lifetime1Lifetime2 = SoundCache.field_f.readInt(true);
              var3Lifetime1Lifetime2 = var3Lifetime1Lifetime2 & ~ml.field_z;
              if (ResizableModalDialog.field_V) {
                for (var4Lifetime1 = 0; BlastDebrisModel.field_i.length > var4Lifetime1; var4Lifetime1++) {
                  if ((1 << var4Lifetime1 & var3Lifetime1Lifetime2) != 0) {
                    LevelRenderable.field_b.addFirst(new fa(var4Lifetime1), false);
                  }
                }
              }
              ml.field_z = ml.field_z | var3Lifetime1Lifetime2;
              jq.field_e = jq.field_e | var3Lifetime1Lifetime2;
              continue;
            }
            if (lc.field_f != 57 &&
              58 != lc.field_f) {
              if (lc.field_f == 59) {
                if (LevelRenderer.field_b ||
                  PacketBuffer.field_q) {
                  g.b(7);
                  if (LevelRenderer.field_b) {
                    ln.field_d.a(2, false);
                  }
                  an.field_c = true;
                  wg.field_g = 0;
                  eo.field_o = true;
                  lc.field_d = false;
                  PacketBuffer.field_q = false;
                  LevelRenderer.field_n = -2;
                  LevelRenderer.field_b = false;
                  vl.a(-118);
                }
                kj.field_C = false;
                continue;
              }
              var3_ref = null;
              if (LevelRenderer.field_b) {
                var3_ref = ln.field_d;
              } else {
                if (PacketBuffer.field_q) {
                  var3_ref = AccountCreationResultPanel.field_pb;
                }
              }
              if (var3_ref != null) {
                if (lc.field_f == 70) {
                  var4_ref_pp = new pp(((GameplayScreen) (var3_ref)).field_D.field_z);
                  var4_ref_pp.a((byte) -8, ((GameplayScreen) (var3_ref)).field_B, SoundCache.field_f);
                  ((GameplayScreen) (var3_ref)).a(10, var4_ref_pp);
                  continue;
                }
                if (lc.field_f == 62) {
                  var4Lifetime2 = SoundCache.field_f.readSignedByte(88);
                  var5 = SoundCache.field_f.readUnsignedByte(-11);
                  var6 = SoundCache.field_f.readUnsignedByte(-11);
                  ((GameplayScreen) (var3_ref)).field_D.finishMatch((byte) 2, var4Lifetime2);
                  ((GameplayScreen) (var3_ref)).field_D.field_g = var6;
                  ((GameplayScreen) (var3_ref)).field_D.field_f = var5;
                  var7 = var3_ref;
                  if (2 != ((GameplayScreen) (var7)).field_D.field_j) {
                    gj.a((byte) -81, true, LevelRenderer.field_n, 15);
                    continue;
                  }
                  gj.a((byte) 63, true, LevelRenderer.field_n, 16);
                  continue;
                }
                if (lc.field_f == 63) {
                  ((GameplayScreen) (var3_ref)).field_D.field_d = SoundCache.field_f.readUnsignedByte(-11);
                  if (ln.field_d == null) {
                    continue;
                  }
                  jc.b(10);
                  continue;
                }
                if (lc.field_f == 64) {
                  ((GameplayScreen) (var3_ref)).field_D.field_u = SoundCache.field_f.readUnsignedByte(-11);
                  continue;
                }
                if (lc.field_f == 65) {
                  ((GameplayScreen) (var3_ref)).field_D.field_t = SoundCache.field_f.readUnsignedByte(-11);
                  if (ln.field_d == null) {
                    continue;
                  }
                  mq.b(true);
                  continue;
                }
                if (lc.field_f == 66) {
                  ((GameplayScreen) (var3_ref)).field_h = SoundCache.field_f.readUnsignedByte(-11);
                  if (null == ln.field_d) {
                    continue;
                  }
                  mq.b(true);
                  continue;
                }
              }
              this.g(-109);
              continue;
            }
            g.b(7);
            var3Lifetime1Lifetime3 = SoundCache.field_f.readUnsignedByte(-11);
            var4Lifetime3 = SoundCache.field_f.readUnsignedByte(-11);
            var5Lifetime1 = SoundCache.field_f.readUnsignedByte(-11);
            var6Lifetime1 = SoundCache.field_f.readUnsignedByte(-11);
            var7_int = SoundCache.field_f.readUnsignedShort((byte) -11);
            var8 = SoundCache.field_f.readUnsignedShort((byte) -11);
            stackIn_125_0 = (SoundCache.field_f.readUnsignedByte(-11) == 0) ? 0 : 1;
            var9 = stackIn_125_0;
            var10 = -2 + SoundCache.field_f.readUnsignedByte(-11);
            var11 = new String[SoundCache.field_f.readUnsignedByte(-11)];
            for (var12_int = 0; var12_int < var11.length; var12_int++) {
              var11[var12_int] = SoundCache.field_f.readString(128);
            }
            uh.field_Xb = null;
            j.field_n = null;
            var12 = new GameplayScreen(true, var11, var10, var9 != 0, var3Lifetime1Lifetime3, var4Lifetime3, var5Lifetime1, var6Lifetime1);
            var12.field_D.field_f = var7_int;
            var12.field_D.field_g = var8;
            var13 = SoundCache.field_f.readUnsignedByte(-11);
            if (var13 == 1) {
              var12.a(16, SoundCache.field_f.readUnsignedByte(-11));
              var12.field_D.field_q = SoundCache.field_f.readInt(true);
              var12.a(SoundCache.field_f, 101);
            }
            if (an.field_c) {
              ln.field_d = null;
              AccountCreationResultPanel.field_pb = null;
              an.field_c = false;
            }
            if (lc.field_f == 57) {
              LevelRenderer.field_b = true;
              ln.field_d = var12;
              jc.b(10);
              mq.b(true);
              mb.b((byte) -110);
            } else {
              AccountCreationResultPanel.field_pb = var12;
              PacketBuffer.field_q = true;
            }
            lc.field_d = true;
            kj.field_C = false;
            LevelRenderer.field_n = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.wrapClientException((Throwable) ((Object) var2), "Vertigo2.G(" + param0 + ')');
        }
    }

    private final void loadBackgroundImages(byte param0) {
        AccountRequestState.a(11579, nn.field_y);
        Sprite var7 = new Sprite(nn.field_y.getFileByName("", "nebula_2_v2.jpg", 0), (java.awt.Component) ((Object) DisplayNameSelectionPanel.field_F));
        Sprite var8 = var7;
        Sprite var3 = new Sprite(nn.field_y.getFileByName("", "nebula_1.jpg", 0), (java.awt.Component) ((Object) DisplayNameSelectionPanel.field_F));
        Sprite var4 = new Sprite(nn.field_y.getFileByName("", "planet_1.jpg", 0), (java.awt.Component) ((Object) DisplayNameSelectionPanel.field_F));
        Sprite var5 = new Sprite(nn.field_y.getFileByName("", "stars.jpg", 0), (java.awt.Component) ((Object) DisplayNameSelectionPanel.field_F));
        Sprite var6 = new Sprite(nn.field_y.getFileByName("", "asteroids.jpg", 0), (java.awt.Component) ((Object) DisplayNameSelectionPanel.field_F));
        qr.field_l = new rp(true, new Sprite[]{var7, var3, var4, var5, var7.copy(), var6});
        RegistrationAgreementPane.field_N = new Sprite(640, 480);
        RegistrationAgreementPane.field_N.bindAsRenderTarget();
        var8.drawOpaque(0, 0);
        if (param0 > -89) {
          return;
        }
        try {
          var3.drawOpaque(var8.field_y, 0);
          var4.drawOpaque(0, var8.field_t);
          var5.drawOpaque(var8.field_y, var8.field_t);
          TextLayout.field_g.a(-128);
          nn.field_y = null;
          this.renderClientFrame(-17);
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "Vertigo2.L(" + param0 + ')');
        }
    }

    final void disposeClient(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ModalDialog.k(8);
          if (param0 >= -113) {
            this.disposeClient((byte) 27);
          }
          if (null != dc.field_L) {
            cp.a((byte) 124);
          }
          StripedProgressWidget.i(-1733144127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.wrapClientException((Throwable) ((Object) var2), "Vertigo2.Q(" + param0 + ')');
        }
    }

    private final void loadSoundEffects(int param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = field_L ? 1 : 0;
        try {
          on.field_b[0][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_menu_select").toPcmSample();
          on.field_b[1][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_explode").toPcmSample();
          if (param0 != 19804) {
            return;
          }
          on.field_b[2][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_deflate").toPcmSample();
          on.field_b[3] = new PcmSample[2];
          on.field_b[3][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_teleport").toPcmSample();
          on.field_b[3][1] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_teleport_2").toPcmSample();
          on.field_b[5][0] = VorbisSample.loadByName(mj.field_b, "", "whee").decodeAllToPcm();
          on.field_b[6][0] = VorbisSample.loadByName(mj.field_b, "", "v_fall").decodeAllToPcm();
          on.field_b[7][0] = VorbisSample.loadByName(mj.field_b, "", "v_extra_life").decodeAllToPcm();
          on.field_b[8][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_paint_collect").toPcmSample();
          this.loadSoundEffectVariants(1, "v_brush", 4, 9);
          on.field_b[10] = new PcmSample[4];
          on.field_b[10][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_rocket_pack_start").toPcmSample();
          on.field_b[10][1] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_rocket_pack_end").toPcmSample();
          on.field_b[10][2] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_rocket_pack_ready").toPcmSample();
          on.field_b[10][3] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_rocket_pack_loop").toPcmSample();
          this.loadSoundEffectVariants(1, "v_jump", 3, 11);
          on.field_b[12][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_sticky_block").toPcmSample();
          this.loadSoundEffectVariants(1, "v_land", 2, 13);
          on.field_b[14][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_trampoline_jump").toPcmSample();
          on.field_b[15][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_spring_jump").toPcmSample();
          on.field_b[16][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_flip_brush").toPcmSample();
          on.field_b[17][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_coin_collect").toPcmSample();
          on.field_b[18][0] = on.field_b[5][0];
          on.field_b[19][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_spring_jump_power_up").toPcmSample();
          on.field_b[20][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_dynamite_collect").toPcmSample();
          on.field_b[21][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_crumble_platform").toPcmSample();
          on.field_b[22][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_teleporter_loop").toPcmSample();
          on.field_b[23][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_fan_loop").toPcmSample();
          on.field_b[24][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_spikes").toPcmSample();
          on.field_b[25] = new PcmSample[3];
          on.field_b[25][0] = VorbisSample.loadByName(mj.field_b, "", "v_hmm_easy").decodeAllToPcm();
          on.field_b[25][1] = VorbisSample.loadByName(mj.field_b, "", "v_yeah").decodeAllToPcm();
          on.field_b[25][2] = VorbisSample.loadByName(mj.field_b, "", "v_phew").decodeAllToPcm();
          on.field_b[26][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_paint_runout").toPcmSample();
          on.field_b[27] = new PcmSample[3];
          on.field_b[27][0] = VorbisSample.loadByName(mj.field_b, "", "v_near_edge_1").decodeAllToPcm();
          on.field_b[27][1] = VorbisSample.loadByName(mj.field_b, "", "v_near_edge_2").decodeAllToPcm();
          on.field_b[27][2] = VorbisSample.loadByName(mj.field_b, "", "v_near_edge_3").decodeAllToPcm();
          on.field_b[28][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_last_block").toPcmSample();
          on.field_b[29][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", "v_level_select").toPcmSample();
          rr.field_B[0] = SamplePlaybackStream.createForPlaybackRate(on.field_b[23][0], 100, 96);
          rr.field_B[1] = SamplePlaybackStream.createForPlaybackRate(on.field_b[22][0], 100, 96);
          rr.field_B[0].setLoopCount(-1);
          rr.field_B[1].setLoopCount(-1);
          rr.field_B[2] = SamplePlaybackStream.createForPlaybackRate(on.field_b[10][3], 100, 96);
          rr.field_B[2].setLoopCount(-1);
          op.field_d = MusicTrack.load(le.field_f, "", "vertigo2_theme");
          up.field_B[0] = MusicTrack.load(le.field_f, "", "vertigo2_level_1");
          up.field_B[1] = MusicTrack.load(le.field_f, "", "vertigo2_level_2");
          up.field_B[2] = MusicTrack.load(le.field_f, "", "vertigo2_level_3");
          kc.field_b = MusicTrack.load(le.field_f, "", "vertigo2_lvl_complete_jingle");
          MatchingFieldValidator.field_o = MusicTrack.load(le.field_f, "", "vertigo2_lvl_start_jingle");
          DiskArchiveRequest.field_D = MusicTrack.load(le.field_f, "", "vertigo2_game_over_jingle");
          MusicTrack.load(le.field_f, "", "vertigo2_multiplayer_lvl_lost_jingle");
          MusicTrack.load(le.field_f, "", "vertigo2_time_running_out_jingle");
          qc.field_v.prepareTrackSamples(0, jk.field_b, op.field_d, re.field_d, (byte) 75);
          for (var2_int = 0; var2_int < up.field_B.length; var2_int++) {
            qc.field_v.prepareTrackSamples(0, jk.field_b, up.field_B[var2_int], re.field_d, (byte) 56);
          }
          mj.field_b = null;
          DualLinkNode.field_s = null;
          this.renderClientFrame(-17);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.wrapClientException((Throwable) ((Object) var2), "Vertigo2.N(" + param0 + ')');
        }
    }

    private final void o(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = field_L ? 1 : 0;
        try {
          FullscreenFocusCanvas.field_d = new bl(40, 100, 260, 300, DefaultTextWidgetRenderer.field_s, qr.field_h, IntrusiveNode.field_m, tb.field_d, pc.field_c);
          if (param0 < 80) {
            field_C = (ArgbSprite) null;
          }
          FullscreenFocusCanvas.field_d.field_F = 16777215;
          FullscreenFocusCanvas.field_d.field_P = 16777215;
          FullscreenFocusCanvas.field_d.field_I = 16777215;
          FullscreenFocusCanvas.field_d.field_m = 5921370;
          FullscreenFocusCanvas.field_d.field_y = new boolean[50];
          FullscreenFocusCanvas.field_d.field_k = new String[50];
          FullscreenFocusCanvas.field_d.field_x = 15637810;
          FullscreenFocusCanvas.field_d.field_J = 0;
          for (var2_int = 0; var2_int < FullscreenFocusCanvas.field_d.field_k.length; var2_int++) {
            FullscreenFocusCanvas.field_d.field_k[var2_int] = Vertigo2.a(new String[]{Integer.toString(var2_int + 1)}, bl.field_o, -121);
          }
          FullscreenFocusCanvas.field_d.field_u = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.wrapClientException((Throwable) ((Object) var2), "Vertigo2.E(" + param0 + ')');
        }
    }

    final void initializeClient(int param0) {
        MidiPcmStream var3 = null;
        try {
          this.a(4, 0, 19, 1, false, -16, 2, 64);
          var3 = new MidiPcmStream();
          var3.setChannelProgram(9, true, 128);
          nr.a(true, var3, 22050, gi.field_s, 1024, (java.awt.Component) ((Object) DisplayNameSelectionPanel.field_F));
          DiskCacheWorker.field_c = 4473924;
          oi.field_b = 16777215;
          SecondaryNodeDeque.field_a = 16777215;
          vg.field_d = 128;
          ImageProducerRasterBuffer.field_m = 16777215;
          vm.field_b = param0;
          this.a(true, false, true, true, false, false, true);
          ok.field_d[9] = -1;
          ok.field_d[65] = 1;
          ok.field_d[64] = 1;
          ok.field_d[63] = 1;
          ok.field_d[58] = -2;
          ok.field_d[10] = -1;
          ok.field_d[66] = 1;
          ok.field_d[57] = -2;
          ok.field_d[67] = 4;
          ok.field_d[62] = 3;
          ok.field_d[70] = -2;
          ok.field_d[69] = 100;
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "Vertigo2.S(" + param0 + ')');
        }
    }

    private final void loadFonts(byte param0) {
        u[] var2 = null;
        int var3 = 0;
        int var4_int = 0;
        int var9 = 0;
        u[] var11 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        Sprite[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Sprite[] var10 = null;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var4_intLifetime3;
        int var4_intLifetime4;
        int var4_intLifetime5;
        var9 = field_L ? 1 : 0;
        try {
          tk.field_c = (BitmapFont) ((Object) w.a(DropTargetWidgetContainer.field_G, ml.field_y, "", "kartika13", 119));
          vj.field_b = BitPacketBuffer.a("achievementsgame", MovingLevelTile.field_u, (byte) 34, "");
          var11 = new u[19];
          var2 = var11;
          var11[0] = vl.a(0, "", MovingLevelTile.field_u, "keys_esc");
          var11[1] = vl.a(0, "", MovingLevelTile.field_u, "keys_right");
          var2[2] = vl.a(tk.a((int) param0, 31), "", MovingLevelTile.field_u, "keys_left");
          var11[3] = vl.a(0, "", MovingLevelTile.field_u, "keys_down");
          var11[4] = vl.a(0, "", MovingLevelTile.field_u, "keys_up");
          var11[5] = vl.a(0, "", MovingLevelTile.field_u, "keys_space");
          var11[6] = vl.a(0, "", MovingLevelTile.field_u, "keys_ctrl");
          var11[7] = vl.a(0, "", MovingLevelTile.field_u, "keys_enter");
          var11[8] = vl.a(0, "", MovingLevelTile.field_u, "keys_shift");
          var2[9] = vl.a(tk.a((int) param0, 31), "", MovingLevelTile.field_u, "keys_w");
          var11[10] = vl.a(0, "", MovingLevelTile.field_u, "keys_a");
          var11[11] = vl.a(0, "", MovingLevelTile.field_u, "keys_s");
          var11[12] = vl.a(0, "", MovingLevelTile.field_u, "keys_d");
          var11[13] = vl.a(0, "", MovingLevelTile.field_u, "keys_f1");
          var11[14] = vl.a(0, "", MovingLevelTile.field_u, "keys_q");
          var11[15] = vl.a(0, "", MovingLevelTile.field_u, "keys_e");
          var11[16] = vl.a(0, "", MovingLevelTile.field_u, "keys_lt");
          var2[17] = vl.a(param0 - 31, "", MovingLevelTile.field_u, "keys_gt");
          var2[18] = vl.a(tk.a((int) param0, 31), "", MovingLevelTile.field_u, "keys_f12");
          tk.field_c.setInlineSprites(var2, (int[]) null);
          fa.field_s = lm.a("", param0 + 23078, "button_purple_frame", MovingLevelTile.field_u);
          uk.field_r = lm.a("", 23109, "button_blue_frame", MovingLevelTile.field_u);
          mn.field_o = new Sprite[3];
          mn.field_o[0] = tn.a("button_start_blue", MovingLevelTile.field_u, -117, "");
          mn.field_o[1] = tn.a("button_middle_blue", MovingLevelTile.field_u, -108, "");
          mn.field_o[2] = tn.a("button_end_blue", MovingLevelTile.field_u, tk.a((int) param0, -102), "");
          if (param0 != 31) {
            field_I = (String[]) null;
          }
          sq.field_a = new Sprite[3];
          sq.field_a[0] = tn.a("button_start_grey", MovingLevelTile.field_u, -111, "");
          sq.field_a[1] = tn.a("button_middle_grey", MovingLevelTile.field_u, -114, "");
          sq.field_a[2] = tn.a("button_end_grey", MovingLevelTile.field_u, -128, "");
          ln.field_b = new Sprite[3];
          ln.field_b[0] = tn.a("button_start_purple", MovingLevelTile.field_u, -126, "");
          ln.field_b[1] = tn.a("button_middle_purple", MovingLevelTile.field_u, tk.a((int) param0, -83), "");
          ln.field_b[2] = tn.a("button_end_purple", MovingLevelTile.field_u, tk.a((int) param0, -84), "");
          IntrusiveDequeCursor.field_b = tn.a("unachieved", ml.field_y, -94, "basic");
          IsaacCipher.field_f = tn.a("orbcoin", ml.field_y, -83, "basic");
          uh.a(false, IntrusiveDequeCursor.field_b);
          uh.a(false, IsaacCipher.field_f);
          uq.field_a = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "menu_base", "", (byte) 98));
          ie.field_Hb = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "game_complete", "", (byte) 98));
          la.field_a = (BitmapFont) ((Object) ContentTransitionDialog.a(MovingLevelTile.field_u, 12, vi.field_n, "", "title_font"));
          DefaultTextWidgetRenderer.field_s = new wn(w.a(vi.field_n, MovingLevelTile.field_u, "interface_font", "", param0 + 96));
          cd.field_b = tn.a("options_brush_01", MovingLevelTile.field_u, -94, "");
          or.field_b = tn.a("options_brush_02", MovingLevelTile.field_u, -103, "");
          tb.field_d = tn.a("levelselect_tab", MovingLevelTile.field_u, -110, "");
          qr.field_h = tn.a("levelselect_arrow_normal", MovingLevelTile.field_u, -126, "");
          IntrusiveNode.field_m = tn.a("levelselect_arrow_pressed", MovingLevelTile.field_u, -121, "");
          pc.field_c = null;
          qp.field_h = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "interface_box_mid", "", (byte) 98));
          ValidationStatusWidget.field_W = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "interface_box_end", "", (byte) 98));
          ln.field_f = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "interface_box_rend", "", (byte) 98));
          var3 = tk.field_c.field_z + tk.field_c.field_M;
          GzipDecompressor.field_c = new Sprite(var3, var3);
          GzipDecompressor.field_c.bindAsRenderTarget();
          IsaacCipher.field_f.drawDownscaledAreaAveraged(0, 0, var3, var3);
          IsaacCipher.field_f = null;
          TextLayout.field_g.a(param0 + 77);
          for (var4_int = 0; var4_int < mb.field_q.length; var4_int++) {
            if (null != mb.field_q[var4_int]) {
              th.field_f[var4_int] = an.b(118, mb.field_q[var4_int]);
            }
          }
          for (var4_intLifetime1 = 0; var4_intLifetime1 < td.field_l.length; var4_intLifetime1++) {
            ea.field_d[var4_intLifetime1] = an.b(119, td.field_l[var4_intLifetime1]);
          }
          tn.field_i = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "interface_lives", "", (byte) 98));
          RandomAccessCacheFile.field_j = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "interface_jetpack", "", (byte) 98));
          be.field_n = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "interface_dynamite", "", (byte) 98));
          uo.field_e = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "interface_bucket_6", "", (byte) 98));
          NameSuggestionsPanel.field_L = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "lobby_logo", "", (byte) 98));
          BufferedRandomAccessFile.field_c = new ArgbSprite[5];
          LevelSimulation.field_y = new ArgbSprite[5];
          for (var4_intLifetime2 = 0; 5 > var4_intLifetime2; var4_intLifetime2++) {
            BufferedRandomAccessFile.field_c[var4_intLifetime2] = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "interface_bucket_" + (-var4_intLifetime2 + 5), "", (byte) 98));
          }
          for (var4_intLifetime3 = 0; var4_intLifetime3 < 5; var4_intLifetime3++) {
            LevelSimulation.field_y[var4_intLifetime3] = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "interface_bucket_blue_" + (-var4_intLifetime3 + 5), "", (byte) 98));
          }
          sf.field_b = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "star", "", (byte) 98));
          LevelRenderer.field_o = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "cloud", "", (byte) 98));
          field_C = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "planet1", "", (byte) 98));
          TextureOperator.field_p = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "planet2", "", (byte) 98));
          jf.field_M = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "nebula", "", (byte) 98));
          mp.field_a = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "instructions_how_to_play", "", (byte) 98));
          IntrusiveNode.field_i = new ArgbSprite[aa.field_Sb.length];
          for (var4_intLifetime4 = 0; aa.field_Sb.length > var4_intLifetime4; var4_intLifetime4++) {
            IntrusiveNode.field_i[var4_intLifetime4] = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "instructions_block_" + var4_intLifetime4, "", (byte) 98));
          }
          vj.field_g = new ArgbSprite[LevelRenderable.field_e.length];
          for (var4_intLifetime5 = 0; LevelRenderable.field_e.length > var4_intLifetime5; var4_intLifetime5++) {
            vj.field_g[var4_intLifetime5] = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "instructions_item_" + var4_intLifetime5, "", (byte) 98));
          }
          eq.field_F = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "maintitle", "", (byte) 98));
          MusicPatchPcmStream.a(MovingLevelTile.field_u, "timeattack_complete", "", (byte) 98);
          hh.field_a = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "timeattack_bronze", "", (byte) 98));
          kq.field_Kb = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "timeattack_silver", "", (byte) 98));
          MouseWheelInput.field_c = (ArgbSprite) (MusicPatchPcmStream.a(MovingLevelTile.field_u, "timeattack_gold", "", (byte) 98));
          var4 = new Sprite[][]{new Sprite[]{tn.a("coop_icon", MovingLevelTile.field_u, -79, ""), tn.a("versus_icon", MovingLevelTile.field_u, -108, "")}, gk.a(MovingLevelTile.field_u, "", "start_icon", true), gk.a(MovingLevelTile.field_u, "", "end_icon", true)};
          mh.a(true, var4, fd.field_q, 3, DropTargetWidgetContainer.field_G, m.field_z, true, BlastDebrisBatch.field_e, PlayerState.field_V, IsaacCipher.field_e, var4, 2, IsaacCipher.field_e, rm.field_A, ml.field_y);
          jl.field_g = (Sprite) ((Object) NameSuggestionsPanel.field_L);
          FullscreenNoticeType.a((byte) -111, 200);
          DirectByteStorage.field_g = true;
          FullscreenStatusDialog.field_W = eg.field_s;
          dl.field_b = vg.field_c;
          be.a(-103, uk.field_r, 320, 20, 16766751, 10, 5, 16777215, (Sprite[]) null, 8, fa.field_s, 8, DefaultTextWidgetRenderer.field_s.field_f, 280, 16777215);
          var5 = tk.field_c.field_t + tk.field_c.field_M;
          var6 = tk.field_c.field_t;
          var7 = DefaultTextWidgetRenderer.field_s.field_f.field_t + DefaultTextWidgetRenderer.field_s.field_f.field_M;
          var8 = DefaultTextWidgetRenderer.field_s.field_f.field_t;
          var10 = (Sprite[]) null;
          ua.a(12, uk.field_r, 320, var7, 480, 240, 10, fa.field_s, 12, DefaultTextWidgetRenderer.field_s.field_f, 0, var5, 16777215, 16777215, 16777215, var6, (Sprite[]) null, 0, var8, (byte) 92, tk.field_c);
          di.b((byte) -90);
          MovingLevelTile.field_u = null;
          this.renderClientFrame(param0 - 48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wn.wrapClientException((Throwable) ((Object) var2_ref), "Vertigo2.H(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.a(20, 0, "vertigo2");
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "Vertigo2.init()");
        }
    }

    final void clearClientResources(byte param0) {
        try {
          Vertigo2.m((byte) 25);
          GameKeyHandler.clearStaticReferences((byte) 92);
          ir.clearStaticReferences(false);
          bc.clearStaticReferences(7);
          rc.clearStaticReferences(true);
          GameApplet.c((byte) 26);
          MouseInputHandler.clearStaticReferences(-31417);
          TriangleRasterizer.clearStaticReferences();
          nr.b((byte) 120);
          fa.clearStaticReferences((byte) -128);
          IntrusiveDeque.clearStaticReferences(0);
          SoftwareRasterizer.clearStaticReferences();
          tl.clearStaticReferences(true);
          Archive.clearStaticReferences(-54);
          BitmapFont.clearStaticReferences();
          lh.clearStaticReferences((byte) 41);
          MidiPcmStream.clearStaticReferences(97);
          mh.clearStaticReferences(-1);
          VorbisSample.clearStaticReferences();
          SoundCache.clearStaticReferences((byte) 76);
          HuffmanCodec.clearStaticReferences((byte) -125);
          n.clearStaticReferences(69);
          ib.resetStaticState((byte) -35);
          fr.clearStaticReferences(false);
          kh.clearStaticReferences(false);
          kc.clearStaticReferences(false);
          bf.resetStaticState(104);
          ci.clearStaticReferences(64);
          GameShell.clearStaticReferences(true);
          mr.c(true);
          gn.clearStaticReferences((byte) 37);
          mf.a(9000);
          vm.resetStaticState(-586);
          gh.clearStaticReferences((byte) 121);
          ea.a((byte) -28);
          as.clearStaticReferences(-92);
          ag.clearStaticReferences(-2883);
          dj.clearStaticReferences(16363);
          ti.a(24260);
          ni.clearStaticReferences(false);
          pp.clearStaticReferences(87);
          sc.a(4);
          ClientException.clearStaticReferences(0);
          JaggrabClient.a((byte) -3);
          MouseWheelInput.clearStaticReferences(0);
          sk.resetStaticState((byte) 0);
          PacketBuffer.clearStaticReferences(105);
          gk.clearStaticReferences(-1060);
          le.clearStaticReferences((byte) -87);
          ip.clearStaticReferences(-1423419167);
          mm.a((byte) 114);
          ki.clearStaticReferences(-7);
          eb.clearStaticReferences((byte) 15);
          ja.clearStaticReferences(127);
          tn.clearStaticReferences(-101);
          FrameTimer.clearStaticReferences(0);
          RasterBuffer.clearStaticReferences(-18390);
          th.clearStaticReferences((byte) -123);
          FullscreenFocusCanvas.clearStaticReferences(8462);
          ar.clearStaticReferences(0);
          wn.clearStaticReferences(23744);
          bl.clearStaticReferences((byte) -50);
          fo.clearStaticReferences((byte) 123);
          GameplayScreen.a(false);
          rp.a(-78);
          an.a(true);
          IntrusiveNode.clearDeclaredStaticReferences(55);
          jl.clearStaticReferences(6);
          pe.clearStaticReferences(true);
          MidiFileReader.clearStaticReferences();
          MusicPatchPcmStream.resetStaticState(0);
          AudioOutput.clearStaticReferences();
          CrossfadingMidiPcmStream.e(-257);
          MenuSelectionCursor.clearStaticReferences(true);
          fh.discardDeclaredStaticReferences(-90);
          mp.clearStaticReferences(-127);
          ca.clearStaticReferences((byte) -90);
          UiPanel.clearStaticReferences(false);
          uh.clearStaticReferences((byte) -69);
          SecondaryNodeHashTable.clearStaticReferences(0);
          bs.b((byte) 100);
          BitPacketBuffer.releaseDeclaredStaticReferences(116);
          jd.clearStaticReferences(-109);
          tk.clearStaticReferences((byte) 95);
          DiskCacheWorker.a(false);
          kr.c(5);
          BufferedRandomAccessFile.clearStaticReferences(33);
          ff.resetStaticState((byte) 120);
          GzipDecompressor.clearStaticReferences(-102);
          ab.resetStaticState(0);
          pd.clearStaticReferences(1000000);
          ModalDialogHost.clearStaticReferences(-25849);
          AccountCreationResultPanel.releaseDeclaredStaticReferences(12705);
          ProgressDialog.clearStaticReferences(-15691);
          StandardContentDialog.m(11840);
          ProgressMessageDialog.clearStaticReferences(-74);
          AccountRegistrationPanel.resetStaticState(4);
          GuestPlayConfirmationForm.clearStaticReferences(-120);
          LoginPanel.a((byte) -103);
          DisplayNameSelectionPanel.a((byte) -125);
          qj.clearStaticReferences((byte) 56);
          mc.resetStaticState(-119);
          ok.clearStaticReferences(2);
          tb.clearStaticReferences(30272);
          la.clearStaticReferences(false);
          ui.a(64);
          he.clearStaticReferences((byte) -125);
          wj.clearStaticReferences(-112);
          wg.d(-900429434);
          go.clearStaticReferences(-128);
          PlayerState.clearStaticReferences(511);
          LevelRenderer.clearStaticReferences(1);
          LevelSimulation.clearStaticReferences(0);
          MatchSession.clearStaticReferences(1);
          me.clearStaticReferences(6457);
          or.clearStaticReferences((byte) 87);
          SynthesizerVoice.clearStaticReferences();
          VorbisFloor.clearStaticReferences();
          DualLinkNode.releaseDeclaredStaticReferences(52);
          fq.clearStaticReferences(-126);
          SpriteState.a((byte) 115);
          ua.clearStaticReferences((byte) 114);
          vd.clearStaticReferences(-115);
          sm.clearStaticReferences((byte) 76);
          ie.clearStaticReferences(-115);
          kq.k(112);
          dm.l(-1);
          b.clearStaticReferences(-90);
          od.clearStaticReferences(-23936);
          cb.clearDeclaredStaticReferences(false);
          gm.clearStaticReferences(0);
          nk.clearStaticReferences((byte) -67);
          lb.clearStaticReferences((byte) -120);
          mj.clearStaticReferences(18641);
          l.clearStaticReferences(false);
          fc.clearStaticReferences();
          Model.clearStaticReferences();
          op.clearStaticReferences(0);
          LevelTile.clearLevelTileGlobals(false);
          cd.a(123);
          LevelRenderable.clearStaticReferences((byte) 9);
          dl.clearStaticReferences((byte) -119);
          PlayerAvatarRenderer.clearStaticReferences(2);
          ha.clearStaticReferences((byte) -123);
          in.clearStaticReferences(0);
          lc.clearStaticReferences(30015);
          ap.a((byte) 25);
          en.clearStaticReferences(4096);
          tq.clearStaticReferences(13597);
          v.clearStaticReferences(-18);
          IsaacCipher.clearStaticReferences(124);
          on.a(true);
          bo.a(103);
          hd.clearStaticReferences(1);
          BirthDateChatEnableForm.releaseDeclaredStaticReferences(30560);
          np.clearStaticReferences((byte) 123);
          MovingLevelTile.clearStaticReferences(107);
          p.clearStaticReferences(0);
          tm.clearStaticReferences(127);
          eg.clearStaticReferences(3);
          ak.clearStaticReferences(-56);
          NetworkArchiveRequest.resetStaticState(-20657);
          SectorCacheStore.clearStaticReferences(115);
          DiskArchiveRequest.j(-124);
          uk.clearStaticReferences((byte) -101);
          RandomAccessCacheFile.clearStaticReferences(false);
          ln.clearStaticReferences(-47);
          vj.a(-11590);
          ArchiveRequest.resetStaticState(false);
          DelegatingCanvas.resetStaticState(4);
          ce.clearStaticReferences(true);
          TextureOperator.clearStaticReferences(true);
          pq.clearStaticReferences(-1);
          ByteStorage.clearStaticReferences(-1);
          Bzip2Decompressor.clearStaticReferences();
          Bzip2State.clearStaticReferences((byte) 111);
          al.a(-1216);
          gl.clearStaticReferences(true);
          PcmOutputWorker.clearStaticReferences((byte) -100);
          oc.clearStaticReferences(-27171);
          SoundFilter.clearStaticReferences();
          DefaultTextWidgetRenderer.clearStaticReferences(60);
          uc.clearStaticReferences(91);
          kn.clearStaticReferences(true);
          mq.clearStaticReferences(true);
          td.clearStaticReferences((byte) 122);
          jo.clearStaticReferences(2);
          IntrusiveDequeCursor.clearStaticReferences(-98);
          UiWidget.b((byte) -73);
          WidgetWrapper.e((byte) -122);
          TextLayout.c((byte) 76);
          LabeledWidgetContainer.h(2);
          ValidatedTextField.clearStaticReferences(-17131);
          ResizableModalDialog.resetStaticState(-6);
          StripedProgressWidget.clearStaticReferences(false);
          NameSuggestionsPanel.clearStaticReferences((byte) -110);
          RichTextWidget.a((byte) -53);
          ValidationStatusIcon.clearStaticReferences((byte) -45);
          ValidationStatusWidget.clearStaticReferences(111);
          ck.clearStaticReferences(true);
          TextFieldValidator.clearDeclaredStaticReferences((byte) -124);
          ad.resetStaticState(true);
          RegistrationAgreementPane.clearStaticReferences(1);
          jk.clearStaticReferences(2);
          FullscreenStatusDialog.clearStaticReferences((byte) 123);
          uq.clearStaticReferences(-6872);
          jp.clearStaticReferences(true);
          pb.a(16711935);
          vg.clearStaticReferences(0);
          to.clearStaticReferences(84);
          sf.clearStaticReferences((byte) 4);
          qf.a((byte) -126);
          hh.clearStaticReferences(-72);
          aa.clearStaticReferences(-29238);
          uo.clearStaticReferences((byte) -122);
          jn.clearStaticReferences(54);
          ud.clearStaticReferences((byte) -37);
          BirthDateValidator.clearDeclaredStaticReferences(-3);
          NumericDateInputWidget.clearDeclaredStaticReferences(false);
          ArrayWidgetContainer.clearStaticReferences(46);
          kl.clearDeclaredStaticReferences(true);
          un.clearStaticReferences(-67);
          po.clearStaticReferences((byte) -43);
          no.clearStaticReferences((byte) -111);
          cp.clearStaticReferences((byte) -128);
          vc.clearStaticReferences(0);
          kf.clearStaticReferences(61);
          eh.clearStaticReferences((byte) -84);
          q.clearStaticReferences(0);
          lo.clearStaticReferences((byte) -102);
          SocketConnector.a(-1);
          ProxyAuthenticationRequiredException.clearStaticReferences((byte) 127);
          NanoFrameTimer.clearDeclaredStaticReferences(116);
          ImageProducerRasterBuffer.clearDeclaredStaticReferences(-48);
          gb.a(19199);
          cl.clearStaticReferences((byte) 124);
          fm.a((byte) 72);
          oi.clearStaticReferences((byte) 88);
          mb.clearStaticReferences(-26523);
          g.clearStaticReferences(false);
          sg.a((byte) -49);
          sj.clearStaticReferences(110);
          ul.clearStaticReferences();
          bd.clearStaticReferences(4);
          ao.clearStaticReferences(0);
          jf.clearStaticReferences(false);
          kk.a(true);
          aq.clearStaticReferences(-121);
          wh.clearStaticReferences(9724);
          h.clearStaticReferences(1);
          pc.clearStaticReferences(0);
          ld.clearStaticReferences(1151);
          tc.clearStaticReferences(118);
          DateInputWidget.clearStaticReferences(false);
          lp.clearStaticReferences(86);
          te.clearStaticReferences(-30443);
          lf.clearStaticReferences((byte) 107);
          w.clearStaticReferences(2);
          ol.h(127);
          di.clearStaticReferences(0);
          eq.clearStaticReferences(11902);
          vf.clearStaticReferences((byte) 36);
          hr.clearStaticReferences(93);
          kj.clearStaticReferences((byte) -96);
          jm.clearStaticReferences((byte) 43);
          ek.clearStaticReferences(-88);
          ec.clearStaticReferences((byte) 60);
          fn.clearStaticReferences(4096);
          nb.g(0);
          dc.g(64);
          up.clearStaticReferences(-3144);
          jb.resetStaticState((byte) -118);
          qk.clearDeclaredStaticReferences(true);
          bp.clearStaticReferences(7750);
          rm.clearStaticReferences(16145);
          gj.clearStaticReferences((byte) -70);
          so.resetStaticState(-13533);
          rr.clearStaticReferences((byte) 123);
          m.g(2);
          bb.clearStaticReferences((byte) 76);
          f.clearStaticReferences((byte) -98);
          dp.clearStaticReferences(-102);
          lm.clearStaticReferences((byte) 121);
          qo.clearStaticReferences((byte) -128);
          bm.clearDeclaredStaticReferences(true);
          ii.clearStaticReferences(125);
          hm.b(true);
          bq.clearStaticReferences(13);
          kg.clearStaticReferences((byte) -118);
          rb.clearStaticReferences(true);
          se.clearDeclaredStaticReferences(true);
          wb.clearStaticReferences((byte) -33);
          md.clearStaticReferences(-101);
          DirectByteStorage.resetStaticState((byte) -54);
          RichTextLayout.clearStaticReferences((byte) 53);
          re.resetStaticState(-124);
          DropTargetWidgetContainer.clearStaticReferences((byte) 101);
          ng.b(16952);
          IterableNodeHashTable.clearStaticReferences(false);
          SecondaryNodeDeque.clearStaticReferences(true);
          qc.clearStaticReferences(0);
          ve.clearStaticReferences((byte) -126);
          oq.resetStaticState(false);
          ProxySocketConnector.clearStaticReferences(false);
          mo.clearStaticReferences(92);
          ah.a((byte) -128);
          gi.clearStaticReferences(false);
          eo.clearDeclaredStaticReferences(0);
          tf.clearDeclaredStaticReferences(84);
          wm.b(86);
          NodeHashTableIterator.resetStaticState(-24);
          SecondaryNodeDequeIterator.clearStaticReferences(116);
          hj.a((byte) -123);
          qn.clearStaticReferences((byte) 54);
          hq.resetStaticState(false);
          nf.a((byte) -90);
          bk.clearStaticReferences(0);
          tj.clearStaticReferences(true);
          hl.clearStaticReferences((byte) -118);
          be.a(-1);
          ub.clearStaticReferences(false);
          AccountRequestState.releaseStatics(0);
          AccountServiceResult.clearStaticReferences(-81);
          s.clearStaticReferences((byte) -118);
          if (param0 <= 103) {
            field_J = (int[][]) null;
          }
          vi.clearStaticReferences((byte) -92);
          vl.clearStaticReferences((byte) -11);
          tp.clearStaticReferences(-10045);
          ri.clearStaticReferences(7139);
          gg.clearStaticReferences((byte) -83);
          vo.clearStaticReferences(true);
          jc.clearStaticReferences(28373);
          ml.clearDeclaredStaticReferences(-15);
          om.c((byte) 122);
          kb.clearStaticReferences(96);
          AlphaWidgetContainer.clearStaticReferences(-12477);
          qp.a(-19721);
          DialogMessagePane.clearStaticReferences((byte) -126);
          BlastDebrisModel.resetStaticState((byte) -114);
          BlastDebrisBatch.clearBlastDebrisBatchGlobals(11579568);
          nn.clearStaticReferences(5);
          ej.clearStaticReferences(113);
          c.b(122);
          nd.clearDeclaredStaticReferences(-44);
          wi.clearDeclaredStaticReferences(93);
          e.clearStaticReferences(-120);
          TextLineMetrics.a(false);
          AccountNameAvailabilityValidator.c((byte) -114);
          PasswordValidator.g(3);
          EmailFormatValidator.clearStaticReferences((byte) -73);
          ConfirmedEmailAvailabilityValidator.resetStaticState(-118);
          AgeValidator.clearDeclaredStaticReferences(-27799);
          MatchingFieldValidator.clearDeclaredStaticReferences(29492);
          sq.a(26371);
          TextHotspotBounds.clearStaticReferences(-8105);
          ba.clearStaticReferences(3);
          DebouncedFieldValidator.clearStaticReferences(21283);
          FullscreenNoticeType.clearStaticReferences(3);
          j.clearStaticReferences(0);
          hn.clearStaticReferences((byte) 72);
          mn.clearStaticReferences(6);
          fd.clearStaticReferences(-16836);
          km.h(83);
          jq.clearStaticReferences(-113);
          nh.clearStaticReferences(false);
          gd.resetStaticState(true);
          qr.clearStaticReferences(false);
          pl.clearStaticReferences(true);
          wp.resetStaticState(10);
          this.field_u = null;
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "Vertigo2.J(" + param0 + ')');
        }
    }

    public Vertigo2() {
    }

    final void renderClientFrame(int param0) {
        int stackIn_53_0 = 0;
        boolean stackIn_82_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4_int = 0;
        fa var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        java.awt.Canvas var8 = null;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        var7 = field_L ? 1 : 0;
        try {
          var8 = gn.a(param0 - 22781);
          if (cp.a(96)) {
            bp.a(240, RichTextLayout.b(param0 ^ -108), var8);
            return;
          }
          if (param0 != -17) {
            this.loadBackgroundImages((byte) 108);
          }
          if (!ProxyAuthenticationRequiredException.field_a) {
            an.a(-1243, var8);
            return;
          }
          if (!SpriteState.i(param0 + 28)) {
            ProxySocketConnector.a(false, 100.0f, EmailFormatValidator.field_n);
            an.a(-1243, var8);
            return;
          }
          var3 = 1;
          if (lc.field_b != -1 ||
            LevelRenderer.field_n != -1) {
            var3 = 0;
          }
          if (LevelRenderer.field_n == lc.field_b) {
            if (lc.field_b >= 0) {
              if (IntrusiveDequeCursor.a(18055, lc.field_b)) {
                ca.a(var3 != 0, -16237);
              } else {
                wn.field_b.a(0);
              }
              if (lc.field_b >= 0) {
                fh.field_y[lc.field_b].b((byte) -114);
              }
            } else {
              if (IntrusiveDequeCursor.a(param0 + 18072, lc.field_b)) {
                ca.a(var3 != 0, -16237);
              } else {
                wn.field_b.a(0);
              }
            }
          } else {
            if (vl.field_c >= 16) {
              if (IntrusiveDequeCursor.a(18055, lc.field_b)) {
                ca.a(var3 != 0, -16237);
              } else {
                wn.field_b.a(0);
              }
              if (0 <= LevelRenderer.field_n) {
                fh.field_y[LevelRenderer.field_n].b((byte) -114);
              }
            } else {
              if (IntrusiveDequeCursor.a(param0 ^ -18072, lc.field_b)) {
                ca.a(var3 != 0, param0 - 16220);
              } else {
                wn.field_b.a(0);
              }
              if (lc.field_b >= 0) {
                fh.field_y[lc.field_b].b((byte) -114);
              }
            }
          }
          if (vl.field_c != 0 ||
            0 != Bzip2State.field_r) {
            if (vl.field_c == 0) {
              stackIn_53_0 = Bzip2State.field_r;
            } else {
              stackIn_53_0 = vl.field_c;
            }
            var4_int = stackIn_53_0;
            if (var4_int > 16) {
              var4_int = -var4_int + 32;
            }
            if (0 > var4_int) {
              var4_int = -var4_int;
            }
            var4_int = var4_int << 2;
            SoftwareRasterizer.blurRectangle(var4_int, var4_int, 0, 0, 640, 480);
            SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 1, var4_int << 2);
          }
          if (!SectorCacheStore.field_g ||
            !lc.field_d) {
            ff.a(m.h(-124), 11182);
          }
          var4 = (fa) (LevelRenderable.field_b.beginBackward((byte) 100));
          if (var4 != null) {
            var6 = ConfirmedEmailAvailabilityValidator.field_l;
            if (var6 < 80) {
              var5 = -32 + var6 / 2;
            } else {
              if (var6 < 230) {
                var5 = 8;
              } else {
                var5 = -(var6 / 2) + 123;
              }
            }
            vj.field_b[var4.field_n].drawQuarterSizeAveraged(158, var5);
            DefaultTextWidgetRenderer.field_s.a(16777215, (byte) 85, -1, 198, BlastDebrisModel.field_i[var4.field_n], var5 + DefaultTextWidgetRenderer.field_s.field_j);
          }
          if (kg.h(param0 ^ -111)) {
            var5Lifetime1 = oi.a(-110) + 30;
            var6Lifetime1 = 30 + AccountNameAvailabilityValidator.a(true);
            MusicPatchPcmStream.a(var6Lifetime1, var5Lifetime1, -(var6Lifetime1 / 2) + 240, -(var5Lifetime1 / 2) + 320, 82, 210);
            eb.b(-14732);
          } else {
            if (pq.b(0)) {
              if (null == dc.field_L) {
                stackIn_82_0 = MenuSelectionCursor.field_g;
              } else {
                stackIn_82_0 = true;
              }
              hr.a(stackIn_82_0, true);
            } else {
              if (DialogMessagePane.e((byte) 99)) {
                var5Lifetime1 = 30 + IterableNodeHashTable.a((byte) -72);
                var6Lifetime1 = f.b(false) + 30;
                MusicPatchPcmStream.a(var6Lifetime1, var5Lifetime1, -(var6Lifetime1 / 2) + 270, 320 - var5Lifetime1 / 2, -77, 210);
                bk.b((byte) -101);
              }
            }
          }
          if (DiskCacheWorker.field_a != DiskCacheWorker.field_f) {
            var5Lifetime2 = 256 * ok.field_c / 16;
            if (0 < var5Lifetime2) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_e, SoftwareRasterizer.field_j, 0, var5Lifetime2);
            }
          }
          ByteStorage.a(0, (byte) -88, var8, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.wrapClientException((Throwable) ((Object) var2), "Vertigo2.B(" + param0 + ')');
        }
    }

    public static void m(byte param0) {
        field_D = null;
        field_E = null;
        field_K = null;
        field_M = null;
        field_I = null;
        field_G = null;
        if (param0 <= 18) {
          return;
        }
        try {
          field_F = null;
          field_J = (int[][]) null;
          field_C = null;
          field_H = null;
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "Vertigo2.M(" + param0 + ')');
        }
    }

    private final static int p(byte param0) {
        int var1_int = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var3 = field_L ? 1 : 0;
        try {
          if (param0 != -78) {
            field_G = (String[]) null;
          }
          var1_int = 0;
          while (NodeHashTableIterator.a(false)) {
            kg.field_G.d((byte) 88);
            if (!kg.field_G.a(84)) {
              continue;
            }
            var1_int = 1;
          }
          kg.field_G.a((byte) -29, StripedProgressWidget.a(gb.field_d, true, PacketBuffer.field_n), StripedProgressWidget.a(no.field_e, true, ModalDialogHost.field_N));
          if (kg.field_G.a(84)) {
            var1_int = 1;
          }
          var2 = 0;
          if (var1_int != 0 &&
            kg.field_G.selectedIndex >= 0) {
            var2 = rc.field_c[kg.field_G.selectedIndex];
            if (var2 == 2) {
              lb.a(11141);
            }
          }
          stackIn_17_0 = var2;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.wrapClientException((Throwable) ((Object) var1), "Vertigo2.R(" + param0 + ')');
        }
    }

    private final void l(byte param0) {
        try {
          if (IntrusiveDequeCursor.field_c != null) {
            ah.a(98, IntrusiveDequeCursor.field_c);
            IntrusiveDequeCursor.field_c = null;
            di.b((byte) -44);
          }
          gi.field_p = BufferedSocket.a(3, 124);
          MovingLevelTile.field_u = BufferedSocket.a(5, 125);
          vi.field_n = BufferedSocket.a(6, 123);
          DualLinkNode.field_s = BufferedSocket.a(7, 123);
          mj.field_b = BufferedSocket.a(8, 127);
          re.field_d = BufferedSocket.a(9, 126);
          le.field_f = BufferedSocket.a(10, 124);
          pp.field_s = BufferedSocket.a(11, 124);
          nn.field_y = BufferedSocket.a(12, 123);
          m.field_z = BufferedSocket.a(13, 126);
          np.field_Kb = BufferedSocket.a(14, 123);
          ml.field_u = BufferedSocket.a(15, 123);
          tl.field_c = BufferedSocket.a(16, 124);
          int var2_int = -39 / ((param0 - 70) / 42);
          ii.field_C = BufferedSocket.a(17, 124);
          BlastDebrisModel.field_o = BufferedSocket.a(18, 123);
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "Vertigo2.O(" + param0 + ')');
        }
    }

    private final void k(byte param0) {
        try {
          int var2_int = -22 / ((48 - param0) / 60);
          ei.a(pp.field_s, (byte) -81);
          pp.field_s = null;
          this.renderClientFrame(-17);
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "Vertigo2.P(" + param0 + ')');
        }
    }

    private final void loadSoundEffectVariants(int param0, String param1, int param2, int param3) {
        PcmSample[] array$1 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = field_L ? 1 : 0;
        try {
          array$1 = new PcmSample[param0 + param2];
          on.field_b[param3] = array$1;
          on.field_b[param3][0] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", param1).toPcmSample();
          for (var5_int = 1; param2 >= var5_int; var5_int++) {
            on.field_b[param3][var5_int] = SynthesizedSoundEffect.loadByName(DualLinkNode.field_s, "", param1 + var5_int).toPcmSample();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("Vertigo2.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(int param0, boolean param1) {
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = field_L ? 1 : 0;
        try {
          TextLayout.a((byte) -52);
          if (null == DualLinkNode.field_s) {
            mn.a(false);
            if (null != MovingLevelTile.field_u) {
              ProxySocketConnector.a(false, 86.0f, nh.field_p);
              this.renderClientFrame(-17);
              TriangleRasterizer.setTextureProvider(new nr(BlastDebrisModel.field_o, ii.field_C, MovingLevelTile.field_u, 13, false));
              ii.field_C = null;
              this.loadFonts((byte) 31);
            }
            if (null != pp.field_s) {
              ProxySocketConnector.a(false, 90.0f, cp.field_a);
              this.renderClientFrame(param0 ^ -16777200);
              this.k((byte) 109);
            }
            if (nn.field_y != null) {
              ProxySocketConnector.a(false, 92.0f, RasterBuffer.field_g);
              this.renderClientFrame(-17);
              this.loadBackgroundImages((byte) -121);
            }
            if (null != tl.field_c) {
              ProxySocketConnector.a(false, 95.0f, ByteStorage.field_f);
              this.renderClientFrame(param0 - 16777232);
              w.a(ml.field_u, np.field_Kb, tl.field_c, (byte) 59);
              tl.field_c = null;
              ml.field_u = null;
              np.field_Kb = null;
            }
            if (null != gi.field_p) {
              ProxySocketConnector.a(false, 98.0f, fa.field_v);
              this.renderClientFrame(-17);
              AccountServiceResult.a(new HuffmanCodec(gi.field_p.getFileByName("", "huffman", 0)), (byte) 98);
              gi.field_p = null;
              di.b((byte) 126);
              return false;
            }
            kr.a(-3645);
            if (param0 != 16777215) {
              this.loadBackgroundImages((byte) 93);
            }
            for (var3_int = 0; var3_int < 23; var3_int++) {
              fh.field_y[var3_int] = new fo(var3_int);
            }
            lc.field_b = 0;
            vc.a(0);
            DefaultTextWidgetRenderer.a(50, (byte) 119);
            ProxyAuthenticationRequiredException.field_a = true;
            this.o((byte) 117);
            this.p(50);
            di.b((byte) 91);
            MovingLevelTile.playMusicTrackLooped(108, op.field_d);
            hj.a(128, (byte) 126);
            wn.field_b = new an();
            ng.a(-10236);
            return true;
          }
          if (ml.field_y.ensureIndexLoaded(0) &&
            ml.field_y.tryLoadGroupByName("basic", 0)) {
            if (!ml.field_y.tryLoadGroupByName("roman20", param0 ^ 16777215)) {
              ProxySocketConnector.a(false, 4.0f, FullscreenStatusDialog.a(vc.field_a, (byte) 66, ml.field_y, vd.field_c, "roman20"));
              return false;
            }
            if (DropTargetWidgetContainer.field_G.ensureIndexLoaded(0) &&
              DropTargetWidgetContainer.field_G.tryLoadGroupByName("roman20", 0)) {
              if (!ml.field_y.tryLoadGroupByName("kartika13", 0)) {
                ProxySocketConnector.a(false, 6.0f, FullscreenStatusDialog.a(vc.field_a, (byte) 103, ml.field_y, vd.field_c, "kartika13"));
                return false;
              }
              if (DropTargetWidgetContainer.field_G.ensureIndexLoaded(param0 ^ 16777215) &&
                DropTargetWidgetContainer.field_G.tryLoadGroupByName("kartika13", 0)) {
                if (!ml.field_y.tryLoadGroupByName("comic20", param0 ^ 16777215)) {
                  ProxySocketConnector.a(false, 8.0f, FullscreenStatusDialog.a(vc.field_a, (byte) 47, ml.field_y, vd.field_c, "comic20"));
                  return false;
                }
                if (DropTargetWidgetContainer.field_G.ensureIndexLoaded(param0 ^ 16777215) &&
                  DropTargetWidgetContainer.field_G.tryLoadGroupByName("comic20", param0 ^ 16777215)) {
                  if (ml.field_y.ensureIndexLoaded(0) &&
                    ml.field_y.tryLoadGroupByName("lobby", 0)) {
                    if (DropTargetWidgetContainer.field_G.ensureIndexLoaded(0) &&
                      DropTargetWidgetContainer.field_G.tryLoadGroupByName("lobby", 0)) {
                      if (DualLinkNode.field_s.ensureIndexLoaded(0) &&
                        DualLinkNode.field_s.tryLoadGroupByName("", 0)) {
                        if (mj.field_b.ensureIndexLoaded(0) &&
                          mj.field_b.tryLoadGroupByName("", 0)) {
                          if (re.field_d.ensureIndexLoaded(param0 - 16777215) &&
                            re.field_d.tryLoadAllGroups((byte) -112)) {
                            if (le.field_f.ensureIndexLoaded(param0 - 16777215) &&
                              le.field_f.tryLoadGroupByName("", 0)) {
                              if (MovingLevelTile.field_u.ensureIndexLoaded(param0 - 16777215) &&
                                MovingLevelTile.field_u.tryLoadGroupByName("", param0 ^ 16777215)) {
                                if (vi.field_n.ensureIndexLoaded(0) &&
                                  vi.field_n.tryLoadGroupByName("", 0)) {
                                  if (gi.field_p.ensureIndexLoaded(param0 ^ 16777215) &&
                                    gi.field_p.tryLoadGroupByName("", param0 ^ 16777215)) {
                                    if (pp.field_s.ensureIndexLoaded(param0 ^ 16777215) &&
                                      pp.field_s.tryLoadGroupByName("", param0 ^ 16777215)) {
                                      if (np.field_Kb.ensureIndexLoaded(0) &&
                                        np.field_Kb.tryLoadAllGroups((byte) -112)) {
                                        if (tl.field_c.ensureIndexLoaded(param0 ^ 16777215) &&
                                          tl.field_c.tryLoadAllGroups((byte) -112)) {
                                          if (ml.field_u.ensureIndexLoaded(0) &&
                                            ml.field_u.tryLoadAllGroups((byte) -112)) {
                                            if (ii.field_C.ensureIndexLoaded(0) &&
                                              ii.field_C.tryLoadAllGroups((byte) -112)) {
                                              if (BlastDebrisModel.field_o.ensureIndexLoaded(param0 - 16777215) &&
                                                BlastDebrisModel.field_o.tryLoadAllGroups((byte) -112)) {
                                                if (nn.field_y.ensureIndexLoaded(0) &&
                                                  nn.field_y.tryLoadGroupByName("", 0)) {
                                                  if (m.field_z.ensureIndexLoaded(param0 ^ 16777215) &&
                                                    m.field_z.tryLoadAllGroups((byte) -112)) {
                                                    ProxySocketConnector.a(false, 78.0f, AccountCreationResultPanel.field_sb);
                                                    if (!param1) {
                                                      return false;
                                                    }
                                                    le.a(468713154);
                                                    this.renderClientFrame(-17);
                                                    jk.field_b = new SoundCache(DualLinkNode.field_s, mj.field_b);
                                                    this.loadSoundEffects(19804);
                                                    DualLinkNode.field_s = null;
                                                    di.b((byte) 109);
                                                    return false;
                                                  }
                                                  ProxySocketConnector.a(false, 73.0f, ProgressDialog.a(m.field_z, EmailFormatValidator.field_n, vj.field_a, 274));
                                                  return false;
                                                }
                                                ProxySocketConnector.a(false, 72.0f, FullscreenStatusDialog.a(eq.field_E, (byte) 109, nn.field_y, bm.field_D, ""));
                                                return false;
                                              }
                                              ProxySocketConnector.a(false, 68.0f, ProgressDialog.a(ii.field_C, ua.field_g, AccountRequestState.field_d, 274));
                                              return false;
                                            }
                                            ProxySocketConnector.a(false, 67.0f, ProgressDialog.a(ii.field_C, ua.field_g, AccountRequestState.field_d, param0 ^ 16776941));
                                            return false;
                                          }
                                          ProxySocketConnector.a(false, 66.0f, ProgressDialog.a(ml.field_u, kq.field_Vb, bb.field_G, 274));
                                          return false;
                                        }
                                        ProxySocketConnector.a(false, 65.0f, ProgressDialog.a(tl.field_c, kq.field_Vb, bb.field_G, param0 - 16776941));
                                        return false;
                                      }
                                      ProxySocketConnector.a(false, 60.0f, ProgressDialog.a(np.field_Kb, kq.field_Vb, bb.field_G, 274));
                                      return false;
                                    }
                                    ProxySocketConnector.a(false, 56.0f, FullscreenStatusDialog.a(StandardContentDialog.field_ib, (byte) 52, pp.field_s, ec.field_D, ""));
                                    return false;
                                  }
                                  ProxySocketConnector.a(false, 55.0f, FullscreenStatusDialog.a(vj.field_a, (byte) 114, gi.field_p, EmailFormatValidator.field_n, ""));
                                  return false;
                                }
                                ProxySocketConnector.a(false, 54.0f, FullscreenStatusDialog.a(vc.field_a, (byte) 54, vi.field_n, vd.field_c, ""));
                                return false;
                              }
                              ProxySocketConnector.a(false, 50.0f, FullscreenStatusDialog.a(ib.field_b, (byte) 112, MovingLevelTile.field_u, me.field_b, ""));
                              return false;
                            }
                            ProxySocketConnector.a(false, 40.0f, FullscreenStatusDialog.a(tm.field_c, (byte) 109, le.field_f, lo.field_b, ""));
                            return false;
                          }
                          ProxySocketConnector.a(false, 35.0f, en.a(false, tm.field_c, re.field_d, 0, lo.field_b));
                          return false;
                        }
                        ProxySocketConnector.a(false, 30.0f, FullscreenStatusDialog.a(lc.field_c, (byte) 35, mj.field_b, DebouncedFieldValidator.field_a, ""));
                        return false;
                      }
                      ProxySocketConnector.a(false, 12.0f, FullscreenStatusDialog.a(lc.field_c, (byte) 95, DualLinkNode.field_s, DebouncedFieldValidator.field_a, ""));
                      return false;
                    }
                    ProxySocketConnector.a(false, 11.0f, FullscreenStatusDialog.a(vc.field_a, (byte) 119, DropTargetWidgetContainer.field_G, vd.field_c, "lobby"));
                    return false;
                  }
                  ProxySocketConnector.a(false, 10.0f, FullscreenStatusDialog.a(ib.field_b, (byte) 50, ml.field_y, me.field_b, "lobby"));
                  return false;
                }
                ProxySocketConnector.a(false, 9.0f, FullscreenStatusDialog.a(vc.field_a, (byte) 39, DropTargetWidgetContainer.field_G, vd.field_c, "comic20"));
                return false;
              }
              ProxySocketConnector.a(false, 7.0f, FullscreenStatusDialog.a(vc.field_a, (byte) 64, DropTargetWidgetContainer.field_G, vd.field_c, "kartika13"));
              return false;
            }
            ProxySocketConnector.a(false, 5.0f, FullscreenStatusDialog.a(vc.field_a, (byte) 37, DropTargetWidgetContainer.field_G, vd.field_c, "roman20"));
            return false;
          }
          ProxySocketConnector.a(false, 1.0f, FullscreenStatusDialog.a(ib.field_b, (byte) 60, ml.field_y, me.field_b, "basic"));
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.wrapClientException((Throwable) ((Object) var3), "Vertigo2.K(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(boolean param0, int param1) {
        int fieldTemp$0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_145_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        PlayerState var7_ref_wo = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6_intLifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        int var7Lifetime2Lifetime1;
        var10 = field_L ? 1 : 0;
        try {
          wn.field_b.b(8);
          var3_int = 0;
          if (DiskCacheWorker.field_f != DiskCacheWorker.field_a) {
            if (DiskCacheWorker.field_f == no.field_c) {
              ok.field_c = ok.field_c + 1;
              if (16 == ok.field_c) {
                if (!jo.field_d) {
                  SoundCache.a(-5);
                } else {
                  BlastDebrisBatch.openStartupLogin(-106);
                }
                DiskCacheWorker.field_f = go.field_h;
              }
            } else {
              if (go.field_h == DiskCacheWorker.field_f) {
                if (!ag.b(49)) {
                  if (uh.field_Xb != null) {
                    nr.a(3, -22754, uh.field_Xb);
                  }
                  if (j.field_n != null) {
                    nr.a(3, -22754, j.field_n);
                  }
                  lb.a(11141);
                  LevelRenderer.field_n = lp.field_C;
                  if (jo.field_d) {
                    SocketConnector.a(9790, false);
                  }
                  if (ad.field_h) {
                    gj.a((byte) 61, false, LevelRenderer.field_n, -4);
                  }
                  if (al.a(LevelRenderer.field_n, (byte) -94)) {
                    g.b(7);
                  }
                }
                DiskCacheWorker.field_f = ak.field_e;
              } else {
                ok.field_c = ok.field_c - 1;
                if (ok.field_c == 0) {
                  DiskCacheWorker.field_f = DiskCacheWorker.field_a;
                }
              }
            }
          } else {
            var4 = 0;
            var5 = 0;
            if (!param0) {
              if (LevelRenderer.field_n == lc.field_b) {
                if (lc.field_b == -1) {
                  if (!NameSuggestionsPanel.field_P) {
                    ln.field_d.a(true, true);
                    var3_int = 1;
                    while (NodeHashTableIterator.a(false)) {
                      ln.field_d.a((byte) 115);
                    }
                  } else {
                    var4 = 1;
                    var5 = 1;
                  }
                } else {
                  if (lc.field_b != -2) {
                    if (al.a(lc.field_b, (byte) -94)) {
                      fh.field_y[lc.field_b].e((byte) -125);
                    }
                  } else {
                    var4 = 1;
                  }
                }
              } else {
                vl.field_c = vl.field_c + 1;
                if (32 == vl.field_c) {
                  g.b(7);
                }
              }
            }
            if (NameSuggestionsPanel.field_P &&
              !ProxyAuthenticationRequiredException.field_b &&
              !kj.field_C) {
              if (LevelRenderer.field_b &&
                MouseWheelInput.field_a) {
                var4 = 0;
              }
              hj.a(1726, var4 != 0);
              if (PacketBuffer.field_q) {
                AccountCreationResultPanel.field_pb.a(var5 != 0, true);
                var3_int = 1;
              }
              if (LevelRenderer.field_b) {
                la.a(180, var5 != 0, (byte) -120, 320);
                ln.field_d.a(var5 != 0, true);
                var3_int = 1;
              }
              while (NodeHashTableIterator.a(false)) {
                if (eo.field_o) {
                  if (!LevelRenderer.field_b) {
                    gh.a(12, 12, 13, 15);
                  } else {
                    if (jm.a(15, 13, 915, 12)) {
                      continue;
                    }
                  }
                }
                if (PacketBuffer.field_q) {
                  AccountCreationResultPanel.field_pb.a((byte) 115);
                }
                if (!LevelRenderer.field_b) {
                  continue;
                }
                ln.field_d.a((byte) 115);
              }
            }
            if (!NameSuggestionsPanel.field_P) {
              wn.c(-2618);
            }
            if (eo.field_o) {
              if (ld.field_b > sg.field_e) {
                sg.field_e = sg.field_e + 1;
              }
            } else {
              if (0 < sg.field_e) {
                sg.field_e = sg.field_e - 1;
              }
            }
            var6_int = ld.field_b * ld.field_b;
            var7 = -(sg.field_e * sg.field_e) + var6_int;
            var8 = AccountRegistrationPanel.field_E + 120 * var7 / var6_int;
            jf.c(var8, 91);
            if (LevelRenderable.field_b.beginBackward((byte) 100) != null) {
              fieldTemp$0 = ConfirmedEmailAvailabilityValidator.field_l + 1;
              ConfirmedEmailAvailabilityValidator.field_l = ConfirmedEmailAvailabilityValidator.field_l + 1;
              if (335 == fieldTemp$0) {
                ConfirmedEmailAvailabilityValidator.field_l = 0;
                LevelRenderable.field_b.removeLast((byte) -43);
              }
            }
          }
          if (-3 == LevelRenderer.field_n) {
            uh.field_Xb = null;
            j.field_n = null;
            var4Lifetime1 = FullscreenFocusCanvas.field_d.field_t;
            if (var4Lifetime1 < 0) {
              var4Lifetime1 = 0;
            }
            var5Lifetime1 = 0;
            if (ValidationStatusWidget.field_V == null) {
              var6 = PacketBuffer.field_o;
            } else {
              var6 = ValidationStatusWidget.field_V;
            }
            ln.field_d = new GameplayScreen(false, new String[]{var6}, 0, false, var5Lifetime1, var4Lifetime1, var4Lifetime1, -1);
            stackIn_105_0 = (!BufferedSocket.field_d) ? 0 : 1;
            var7Lifetime1 = stackIn_105_0;
            gj.a((byte) 54, var7Lifetime1 != 0, LevelRenderer.field_n, -1);
            lc.field_d = false;
          }
          if (param1 > -92) {
            return;
          }
          if (LevelRenderer.field_n == -7) {
            if (!ln.field_d.field_D.field_r.field_f[0].isOutOfLives((byte) 117)) {
              var4Lifetime2 = ln.field_d.field_D.field_l[0].field_p;
              var5Lifetime2 = ln.field_d.field_D.field_l[0].field_W;
              var6_intLifetime1 = -var5Lifetime2 + var4Lifetime2;
              ln.field_d.field_D.field_l[0].field_W = var4Lifetime2;
              if (var6_intLifetime1 != 0) {
                var7Lifetime2 = var6_intLifetime1;
                if (null != ln.field_d &&
                  ln.field_d.field_B >= 0 &&
                  null == AccountCreationResultPanel.field_pb) {
                  var8Lifetime1 = ln.field_d.field_s % 3;
                  if (0 == var8Lifetime1) {
                    gi.field_u = gi.field_u + var7Lifetime2;
                  } else {
                    if (var8Lifetime1 == 1) {
                      RichTextWidget.field_R = RichTextWidget.field_R - var7Lifetime2;
                    } else {
                      var9 = var7Lifetime2 / 3;
                      RichTextWidget.field_R = RichTextWidget.field_R - (-var9 + var7Lifetime2);
                      gi.field_u = gi.field_u + var9;
                    }
                  }
                }
              }
              ln.field_d.field_D.advanceOrReloadLevel(30113, true);
              ln.field_d.e(-111);
              if (ln.field_d.field_D.field_j == 0) {
                var7_ref_wo = ln.field_d.field_D.field_r.field_f[0];
                var7_ref_wo.setLives(true, var7_ref_wo.getLives(-32768) - 1);
              }
              stackIn_133_0 = (!BufferedSocket.field_d) ? 0 : 1;
              var7Lifetime2Lifetime1 = stackIn_133_0;
              gj.a((byte) -70, var7Lifetime2Lifetime1 != 0, LevelRenderer.field_n, -1);
              lc.field_d = false;
            } else {
              stackIn_113_0 = (!BufferedSocket.field_d) ? 0 : 1;
              var4Lifetime2 = stackIn_113_0;
              gj.a((byte) -112, var4Lifetime2 != 0, LevelRenderer.field_n, -1);
              lc.field_d = false;
            }
          }
          if (-6 == LevelRenderer.field_n) {
            uh.field_Xb = null;
            j.field_n = null;
            var4Lifetime3 = ap.field_d.field_t;
            if (var4Lifetime3 < 0) {
              var4Lifetime3 = 0;
            }
            var5Lifetime3 = 3;
            if (null == ValidationStatusWidget.field_V) {
              var6 = PacketBuffer.field_o;
            } else {
              var6 = ValidationStatusWidget.field_V;
            }
            ln.field_d = new GameplayScreen(false, new String[]{var6}, 0, false, var5Lifetime3, var4Lifetime3, var4Lifetime3, 1);
            stackIn_145_0 = (!BufferedSocket.field_d) ? 0 : 1;
            var7Lifetime3 = stackIn_145_0;
            gj.a((byte) 91, var7Lifetime3 != 0, LevelRenderer.field_n, -1);
            lc.field_d = false;
          }
          if (LevelRenderer.field_n == -4) {
            uh.field_Wb.writeCipheredByte(9, 127);
            sg.field_e = ld.field_b;
            ProxyAuthenticationRequiredException.field_b = true;
            LevelRenderer.field_n = lc.field_b;
          }
          if (LevelRenderer.field_n == -5) {
            qk.d(gd.field_j.a((byte) -38), 11, 18964);
            kj.field_C = true;
            LevelRenderer.field_n = lc.field_b;
          }
          if (var3_int == 0) {
            AccountRequestState.a(-11747);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.wrapClientException((Throwable) ((Object) var3), "Vertigo2.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static String a(String[] args, String param1, int param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int stackIn_6_0 = 0;
        String stackIn_35_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var12 = field_L ? 1 : 0;
        try {
          var3_int = param1.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param1.indexOf("<%", var5);
            if (var6_int >= 0) {
              stackIn_6_0 = var6_int + 2;
              for (var5 = stackIn_6_0; var5 < var3_int; var5++) {
                if (ab.a(false, param1.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param1.substring(var6_int + 2, var5);
              if (!JaggrabClient.a((CharSequence) ((Object) var7_ref_String), -124)) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (param1.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = SecondaryNodeDequeIterator.a(109, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (-var5 + var6_int + args[var8].length());
              continue;
            }
            break;
          }
          var8Lifetime1 = -43 % ((-70 - param2) / 42);
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          while (true) {
            var9 = param1.indexOf("<%", var5Lifetime1);
            if (0 > var9) {
              discarded$2 = var6.append(param1.substring(var7));
              stackIn_35_0 = var6.toString();
              return stackIn_35_0;
            }
            for (var5Lifetime1 = 2 + var9; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (ab.a(false, param1.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var10 = param1.substring(2 + var9, var5Lifetime1);
            if (!JaggrabClient.a((CharSequence) ((Object) var10), 112)) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (param1.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var11 = SecondaryNodeDequeIterator.a(92, (CharSequence) ((Object) var10));
            discarded$0 = var6.append(param1.substring(var7, var9));
            var7 = var5Lifetime1;
            discarded$1 = var6.append(args[var11]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("Vertigo2.D(");
          if (args == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_43_0 = stackIn_39_0;
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param1 == null) {
            stackIn_44_0 = stackIn_43_0;
            stackIn_44_2 = "null";
          } else {
            stackIn_44_0 = stackIn_39_0;
            stackIn_44_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        java.awt.Canvas var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          rm.a((byte) -89, (java.awt.Component) ((Object) param0));
          AccountRequestState.a((java.awt.Component) ((Object) param0), param1 + 140);
          if (param1 != -35) {
            var3 = (java.awt.Canvas) null;
            Vertigo2.a((java.awt.Canvas) null, (byte) 15);
          }
          if (th.field_g != null) {
            th.field_g.detach((java.awt.Component) ((Object) param0), param1 + 35);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("Vertigo2.I(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_E = new tj();
        field_I = new String[255];
        field_D = "<%0> won!";
        field_K = "You cannot add yourself!";
        field_J = new int[16][65536];
        field_G = new String[]{"&***", "none", "colt", "dna", "loopy", "portal", "bassoon", "toxic", "kebab", "diesel", "focus", "moss", "quay", "oink", "rook", "coal", "fly", "harp", "driver", "blunt", "flash", "plum", "drill", "potter", "walking", "trim", "cluster", "fry", "bumpy", "belize", "hive"};
        field_H = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
