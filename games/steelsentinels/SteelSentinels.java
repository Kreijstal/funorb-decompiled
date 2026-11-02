/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class SteelSentinels extends FunOrbClient {
    static String field_H;
    static String field_I;
    static SceneWidget field_J;
    public static int obfuscationControl;

    final void a(byte param0) {
        int stackIn_134_0 = 0;
        boolean stackIn_135_1 = false;
        RuntimeException decompiledCaughtException = null;
        java.awt.Canvas var2 = null;
        RuntimeException var2_ref = null;
        SceneWidget var3 = null;
        ai var3_ref = null;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        CombatWorld var6_ref_ee = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Sentinel var9 = null;
        ParticleEffect var9_ref = null;
        Projectile var9_ref2 = null;
        Sentinel var10 = null;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5_intLifetime1;
        int var5_intLifetime2;
        int var7Lifetime1;
        int var8Lifetime1;
        var13 = obfuscationControl;
        try {
          var2 = NanoTickClock.a(false);
          if (QuickChatHelpDialog.j(0)) {
            DiskCacheRequest.a(-111, var2, ParticleEffect.g(2));
            return;
          }
          if (!SceneWidget.field_pb) {
            en.a(var2, -28003);
            return;
          }
          if (!QuickChatCategoryCache.a(false)) {
            mc.a(SentinelAnimationEditor.field_i, 100.0f, -21801);
            en.a(var2, -28003);
            return;
          }
          boolean decompiledFrameRemainder1 = true;
          this.n(53);
          if (LoginForm.field_T != GzipDecoder.field_g) {
            if (LoginForm.field_T != 0) {
              if (GzipDecoder.field_g == 0) {
                AudioService.a(LoginForm.field_T, pc.field_w, false, 125);
                AudioService.a(GzipDecoder.field_g, pc.field_w, false, -40);
                decompiledFrameRemainder1 = (var13 != 0);
              }
              if (decompiledFrameRemainder1) {
                if (LoginForm.field_U >= 10) {
                  AudioService.a(GzipDecoder.field_g, Sprite.field_k, false, 86);
                  if (var13 != 0) {
                    AudioService.a(LoginForm.field_T, pc.field_w, false, -110);
                    AudioService.a(GzipDecoder.field_g, pc.field_w, false, -62);
                    AudioService.a(LoginForm.field_T, pc.field_w, false, -34);
                    AudioService.a(LoginForm.field_T, pc.field_w, true, -15);
                  }
                } else {
                  AudioService.a(LoginForm.field_T, pc.field_w, false, -110);
                  if (var13 != 0) {
                    AudioService.a(GzipDecoder.field_g, pc.field_w, false, -62);
                    AudioService.a(LoginForm.field_T, pc.field_w, false, -34);
                    AudioService.a(LoginForm.field_T, pc.field_w, true, -15);
                  }
                }
              }
            } else {
              AudioService.a(GzipDecoder.field_g, pc.field_w, false, -62);
              AudioService.a(LoginForm.field_T, pc.field_w, false, -34);
              if (var13 != 0) {
                AudioService.a(LoginForm.field_T, pc.field_w, true, -15);
              }
            }
          } else {
            AudioService.a(LoginForm.field_T, pc.field_w, true, -15);
          }
          if (!pc.field_w ||
            !Sprite.field_k) {
            boolean decompiledFrameCompleted0 = true;
            TextLayout.a(PasswordFieldPainter.c(8), 25104);
            if (LoginForm.field_T == -2) {
              var3 = hl.a((byte) -66);
              if (var3 != null) {
                regionExit1: {
                  boolean decompiledFrameCompleted1 = true;
                  var4 = var3.field_Rb;
                  var5_int = var3.field_cb;
                  SoftwareRaster.setClip(var4 + 4, 4 + var5_int + 42, var3.field_Rb - 4 + var3.field_zb, var3.field_cb + (-4 + var3.field_Lb));
                  if (null == ih.field_s ||
                    fc.field_e[101]) {
                    di.field_g = -1;
                    ih.field_s = new CombatWorld(-1, 1, new String[]{}, new int[][]{null}, false, 0, 0, 2, false, false);
                    ih.field_s.computerPlayerCount = 2;
                    if (var13 == 0) {
                      break regionExit1;
                    }
                  }
                  var6_ref_ee = ih.field_s;
                  var7 = var4 - 2;
                  if (var6_ref_ee.sentinels.size((byte) -128) < 2) {
                    var9_int = -100000;
                    var10 = new Sentinel(0, var9_int, var6_ref_ee);
                    var11 = 0;
                    if (var6_ref_ee.sentinels.first(13058) != null) {
                      var11 = -((Sentinel) (var6_ref_ee.sentinels.first(13058))).teamId + 1;
                    }
                    var12 = ReflectionCheck.field_v;
                    if (0.5 > Math.random()) {
                      var12 = ReflectionCheck.field_x;
                    }
                    if (0.3 > Math.random()) {
                      var12 = ReflectionCheck.field_P;
                    }
                    if (0.1 > Math.random()) {
                      var12 = ReflectionCheck.field_N;
                    }
                    if (0.1 > Math.random()) {
                      var12 = ReflectionCheck.field_O;
                    }
                    var10.configureDesign(var12, true, false, -1, var11);
                    var10.field_Nb = 10;
                    var10.d(-28033);
                    var10.velocityY = 1000;
                    var10.field_Qb = 250;
                    var10.j(-5);
                    var6_ref_ee.sentinels.addLast(3, var10);
                  }
                  var8 = 310;
                  var9 = (Sentinel) (var6_ref_ee.sentinels.first(13058));
                  while (null != var9) {
                    var9.a((byte) -22, var7, oh.field_f, DelegatingCanvas.field_c, var8);
                    var9 = (Sentinel) (var6_ref_ee.sentinels.next((byte) -119));
                    if (var13 != 0) {
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                  }
                  if (decompiledFrameCompleted1) {
                    var9_ref = (ParticleEffect) (var6_ref_ee.particles.first(13058));
                    while (true) {
                      if (null != var9_ref) {
                        var9_ref.drawParticle(var7, var8, true, (byte) -89);
                        var9_ref = (ParticleEffect) (var6_ref_ee.particles.next((byte) -112));
                        if (var13 == 0) {
                          continue;
                        }
                      } else {
                        var9_ref2 = (Projectile) (var6_ref_ee.field_db.first(13058));
                        while (null != var9_ref2) {
                          var9_ref2.a(var8, var7, 4);
                          var9_ref2 = (Projectile) (var6_ref_ee.field_db.next((byte) -39));
                          if (var13 != 0) {
                            break regionExit1;
                          }
                        }
                        var9_ref = (ParticleEffect) (var6_ref_ee.particles.first(13058));
                      }
                      break;
                    }
                    while (var9_ref != null) {
                      var9_ref.drawParticle(var7, var8, false, (byte) 31);
                      var9_ref = (ParticleEffect) (var6_ref_ee.particles.next((byte) -82));
                      if (var13 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                    }
                  }
                }
                if (decompiledFrameCompleted0) {
                  SoftwareRaster.c();
                }
              }
            }
            if (decompiledFrameCompleted0) {
              ProxySocketConnector.a(false, PasswordFieldPainter.c(8));
            }
            ci.a(PasswordFieldPainter.c(8), (byte) -62);
          }
          var3_ref = (ai) (bd.field_b.first(13058));
          if (var3_ref != null) {
            var4Lifetime1 = 6;
            var5_intLifetime1 = 250;
            var6 = var4Lifetime1 * 2 + 64;
            var7Lifetime1 = 0;
            if (ob.field_o < var6) {
              var7Lifetime1 = var7Lifetime1 + (ob.field_o - var6);
            }
            var8Lifetime1 = -var5_intLifetime1 + 640;
            if ((500 - var6) < ob.field_o) {
              var7Lifetime1 = var7Lifetime1 + (500 + (-ob.field_o - var6));
            }
            SoftwareRaster.c(var8Lifetime1, var7Lifetime1, var5_intLifetime1, var6, 0, 192);
            SoftwareRaster.h(var8Lifetime1, var7Lifetime1, var5_intLifetime1, var6, 39398, 192);
            if (var3_ref.field_q == null) {
              ValidationHelpWidget.field_lb.a(var3_ref.field_u, var8Lifetime1 + var4Lifetime1, var7Lifetime1 + var4Lifetime1, -(2 * var4Lifetime1) + var5_intLifetime1, -(2 * var4Lifetime1) + var6, 52479, -1, 0, 1, 12);
              if (var13 != 0) {
                var3_ref.field_q.drawScaled(var8Lifetime1 + var4Lifetime1, var7Lifetime1 + var4Lifetime1, 64, 64);
                ValidationHelpWidget.field_lb.a(var3_ref.field_u, var4Lifetime1 * 2 + var8Lifetime1 + 64, var7Lifetime1 + var4Lifetime1, -64 + (var5_intLifetime1 - var4Lifetime1 * 3), var6 - var4Lifetime1 * 2, 52479, -1, 0, 1, 12);
              }
            } else {
              var3_ref.field_q.drawScaled(var8Lifetime1 + var4Lifetime1, var7Lifetime1 + var4Lifetime1, 64, 64);
              ValidationHelpWidget.field_lb.a(var3_ref.field_u, var4Lifetime1 * 2 + var8Lifetime1 + 64, var7Lifetime1 + var4Lifetime1, -64 + (var5_intLifetime1 - var4Lifetime1 * 3), var6 - var4Lifetime1 * 2, 52479, -1, 0, 1, 12);
            }
          }
          boolean decompiledFrameRemainder0 = true;
          var4Lifetime2 = 27 / ((param0 - 56) / 48);
          if (QuickChatMenu.b(true)) {
            SoftwareRaster.f(0, 0, SoftwareRaster.field_c, SoftwareRaster.field_j);
            qf.a(100);
            decompiledFrameRemainder0 = (var13 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (!cf.c((byte) 92)) {
              if ((ri.b(-113)) &&
                (!QuickChatMenu.b(true))) {
                SoftwareRaster.f(0, 0, SoftwareRaster.field_c, SoftwareRaster.field_j);
                ec.a((byte) -95);
                if (var13 != 0) {
                  stackIn_134_0 = -64;
                  if (wb.field_c != null) {
                    stackIn_135_1 = true;
                  } else {
                    stackIn_135_1 = DelayedServerPacket.field_q;
                  }
                  Js5NetworkRequest.$cfr$intArgs$a$7ffe4b125357(stackIn_134_0, stackIn_135_1);
                }
              }
            } else {
              stackIn_134_0 = -64;
              if (wb.field_c != null) {
                stackIn_135_1 = true;
              } else {
                stackIn_135_1 = DelayedServerPacket.field_q;
              }
              Js5NetworkRequest.$cfr$intArgs$a$7ffe4b125357(stackIn_134_0, stackIn_135_1);
            }
          }
          if (in.field_i != in.field_h) {
            var5_intLifetime2 = 256 * SentinelDesigner.field_a / 16;
            if (var5_intLifetime2 > 0) {
              SoftwareRaster.c(0, 0, SoftwareRaster.field_c, SoftwareRaster.field_j, 0, var5_intLifetime2);
            }
          }
          if (DiskCacheWorker.field_l < MusicPatchPcmStream.field_v) {
            SoftwareRaster.h(2, 2, 102, 15, 6710886, 128);
            SoftwareRaster.a(3, 3, 100, 13, 0);
            SoftwareRaster.a(4, 4, DiskCacheWorker.field_l * 33 + 33 * TickClock.field_g / ReflectionCheck.field_r, 11, 39398);
            if (BoundedUrlRequest.field_d != null) {
              var5 = SocketConnector.a(ValidationHelpWidget.field_sb, -98, new String[]{Integer.toString(DiskCacheWorker.field_l * 33 + TickClock.field_g * 33 / ReflectionCheck.field_r)});
              BoundedUrlRequest.field_d.drawCentered(var5, 54, 12, 39398, 0);
              SoftwareRaster.setClip(3, 3, 33 * DiskCacheWorker.field_l + TickClock.field_g * 33 / ReflectionCheck.field_r, 17);
              BoundedUrlRequest.field_d.drawCentered(var5, 54, 12, 0, 39398);
              SoftwareRaster.c();
            }
          }
          ScrollContainer.a(0, 0, 28594, var2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2_ref), "SteelSentinels.EA(" + param0 + ')');
        }
    }

    private final boolean k(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var6 = 0;
        int stackIn_149_0 = 0;
        int stackIn_149_1 = 0;
        RuntimeException decompiledCaughtException = null;
        IndexedSprite[] var2_array = null;
        IndexedSprite[] var3 = null;
        int var3_int = 0;
        RgbSprite[] var3_array = null;
        RgbSprite[][] var3_array2 = null;
        int var4_int = 0;
        RgbSprite[][] var4 = null;
        int var5 = 0;
        var6 = obfuscationControl;
        try {
          ec.a(35);
          if (null != RasterSnapshot.field_x) {
            if (tm.field_d.ensureIndex(true) &&
              tm.field_d.a("basic", (byte) 90)) {
              if (tm.field_d.ensureIndex(true) &&
                tm.field_d.a("roman20", (byte) 90)) {
                if (MusicPatchPcmStream.field_t.ensureIndex(true) &&
                  MusicPatchPcmStream.field_t.a("roman20", (byte) 90)) {
                  if (tm.field_d.ensureIndex(true) &&
                    tm.field_d.a("lobby", (byte) 90)) {
                    if (tm.field_d.ensureIndex(true) &&
                      tm.field_d.a("basicfont12", (byte) 90)) {
                      if (MusicPatchPcmStream.field_t.ensureIndex(true) &&
                        MusicPatchPcmStream.field_t.a("basicfont12", (byte) 90)) {
                        if (MusicPatchPcmStream.field_t.ensureIndex(true) &&
                          MusicPatchPcmStream.field_t.a("lobby", (byte) 90)) {
                          if (RasterSnapshot.field_x.ensureIndex(true) &&
                            RasterSnapshot.field_x.ensureAllGroupsAvailable(param0 ^ -43)) {
                            if (SceneWidgetNode.field_z.ensureIndex(true) &&
                              SceneWidgetNode.field_z.ensureAllGroupsAvailable(param0 ^ -43)) {
                              qi.field_l = false;
                              if (ImageProducerRasterBuffer.field_t.ensureIndex(true) &&
                                ImageProducerRasterBuffer.field_t.ensureAllGroupsAvailable(25)) {
                                if (SectorCacheStore.field_i.ensureIndex(true) &&
                                  SectorCacheStore.field_i.ensureAllGroupsAvailable(param0 + 77)) {
                                  if (GrowableIntList.field_i.ensureIndex(true) &&
                                    GrowableIntList.field_i.ensureAllGroupsAvailable(25)) {
                                    if (DualNode.field_x.ensureIndex(true) &&
                                      DualNode.field_x.a("basic", (byte) 90)) {
                                      if (im.field_h.ensureIndex(true) &&
                                        im.field_h.ensureAllGroupsAvailable(25)) {
                                        if (oh.field_a.ensureIndex(true) &&
                                          oh.field_a.a("basic", (byte) 90)) {
                                          if (IsaacRandom.field_k.ensureIndex(true) &&
                                            IsaacRandom.field_k.ensureAllGroupsAvailable(25)) {
                                            if (BufferedRandomAccessFile.field_k.ensureIndex(true) &&
                                              BufferedRandomAccessFile.field_k.ensureAllGroupsAvailable(param0 + 77)) {
                                              en.a(-59);
                                              mc.a(ResourceArchive.field_n, 82.0f, param0 ^ 21787);
                                              this.a((byte) 111);
                                              RasterBuffer.field_e = new SoundCache(RasterSnapshot.field_x, SceneWidgetNode.field_z);
                                              RasterSnapshot.field_x = null;
                                              cc.j(0);
                                              return false;
                                            }
                                            mc.a(ModalStack.a((byte) -128, SentinelAnimationEditor.field_i, sl.field_l, BufferedRandomAccessFile.field_k), 90.0f, -21801);
                                            return false;
                                          }
                                          mc.a(ci.a(IsaacRandom.field_k, (byte) 94, "", SentinelAnimationEditor.field_i, sl.field_l), 85.0f, -21801);
                                          return false;
                                        }
                                        mc.a(ci.a(oh.field_a, (byte) 108, "basic", kb.field_c, og.field_c), 80.0f, -21801);
                                        return false;
                                      }
                                      mc.a(ModalStack.a((byte) -78, en.field_f, ai.field_t, im.field_h), 75.0f, -21801);
                                      return false;
                                    }
                                    mc.a(ci.a(DualNode.field_x, (byte) 94, "basic", en.field_f, ai.field_t), 70.0f, -21801);
                                    return false;
                                  }
                                  mc.a(ci.a(GrowableIntList.field_i, (byte) 101, "", tf.field_f, AccountTermsPanel.field_P), 60.0f, -21801);
                                  return false;
                                }
                                mc.a(ModalStack.a((byte) -103, tf.field_f, AccountTermsPanel.field_P, SectorCacheStore.field_i), 45.0f, -21801);
                                return false;
                              }
                              mc.a(ci.a(ImageProducerRasterBuffer.field_t, (byte) 99, "", rn.field_t, ue.field_a), 42.0f, -21801);
                              return false;
                            }
                            mc.a(ci.a(SceneWidgetNode.field_z, (byte) 127, "", rn.field_t, ue.field_a), 40.0f, -21801);
                            return false;
                          }
                          mc.a(ci.a(RasterSnapshot.field_x, (byte) 122, "", rn.field_t, ue.field_a), 20.0f, param0 - 21749);
                          return false;
                        }
                        mc.a(ci.a(MusicPatchPcmStream.field_t, (byte) 116, "lobby", kb.field_c, og.field_c), 17.0f, param0 - 21749);
                        return false;
                      }
                      mc.a(ci.a(MusicPatchPcmStream.field_t, (byte) 97, "basicfont12", kb.field_c, og.field_c), 15.0f, param0 - 21749);
                      return false;
                    }
                    mc.a(ci.a(tm.field_d, (byte) 120, "basicfont12", en.field_f, ai.field_t), 14.0f, -21801);
                    return false;
                  }
                  mc.a(ci.a(tm.field_d, (byte) 104, "lobby", en.field_f, ai.field_t), 13.0f, param0 - 21749);
                  return false;
                }
                mc.a(ci.a(MusicPatchPcmStream.field_t, (byte) 111, "roman20", kb.field_c, og.field_c), 12.0f, -21801);
                return false;
              }
              mc.a(ci.a(tm.field_d, (byte) 116, "roman20", en.field_f, ai.field_t), 11.0f, param0 ^ 21787);
              return false;
            }
            mc.a(ci.a(tm.field_d, (byte) 116, "basic", en.field_f, ai.field_t), 10.0f, -21801);
            return false;
          }
          if (ImageProducerRasterBuffer.field_t != null) {
            mc.a(ResourceArchive.field_n, 85.0f, -21801);
            this.a((byte) -116);
            SentinelAnimationEditor.field_q[71] = VorbisSample.loadNamed(ImageProducerRasterBuffer.field_t, "default", "deploying_in").decodeAllToPcm();
            SentinelAnimationEditor.field_q[72] = VorbisSample.loadNamed(ImageProducerRasterBuffer.field_t, "default", "five").decodeAllToPcm();
            SentinelAnimationEditor.field_q[73] = VorbisSample.loadNamed(ImageProducerRasterBuffer.field_t, "default", "four").decodeAllToPcm();
            SentinelAnimationEditor.field_q[74] = VorbisSample.loadNamed(ImageProducerRasterBuffer.field_t, "default", "three").decodeAllToPcm();
            SentinelAnimationEditor.field_q[75] = VorbisSample.loadNamed(ImageProducerRasterBuffer.field_t, "default", "two").decodeAllToPcm();
            SentinelAnimationEditor.field_q[76] = VorbisSample.loadNamed(ImageProducerRasterBuffer.field_t, "default", "one").decodeAllToPcm();
            SentinelAnimationEditor.field_q[77] = VorbisSample.loadNamed(ImageProducerRasterBuffer.field_t, "default", "chassis_upgrade_available").decodeAllToPcm();
            SentinelAnimationEditor.field_q[78] = VorbisSample.loadNamed(ImageProducerRasterBuffer.field_t, "default", "armour_level_critical").decodeAllToPcm();
            SentinelAnimationEditor.field_q[79] = VorbisSample.loadNamed(ImageProducerRasterBuffer.field_t, "default", "target_acquired").decodeAllToPcm();
            SentinelAnimationEditor.field_q[80] = VorbisSample.loadNamed(ImageProducerRasterBuffer.field_t, "default", "target_lock_failed").decodeAllToPcm();
            SentinelAnimationEditor.field_q[81] = VorbisSample.loadNamed(ImageProducerRasterBuffer.field_t, "default", "warning").decodeAllToPcm();
            SentinelAnimationEditor.field_q[82] = VorbisSample.loadNamed(ImageProducerRasterBuffer.field_t, "default", "energy_low").decodeAllToPcm();
            SentinelAnimationEditor.field_q[83] = VorbisSample.loadNamed(ImageProducerRasterBuffer.field_t, "default", "shield_depleted").decodeAllToPcm();
            ImageProducerRasterBuffer.field_t = null;
            cc.j(0);
            return false;
          }
          if (GrowableIntList.field_i != null) {
            mc.a(ba.field_a, 88.0f, -21801);
            this.a((byte) 104);
            LoginCredentials.field_f = MusicTrack.load(GrowableIntList.field_i, "", "md_title_music");
            NodeHashTableIterator.field_i = MusicTrack.load(GrowableIntList.field_i, "", "war_zone");
            ByteStorage.field_e = MusicTrack.load(GrowableIntList.field_i, "", "lost_world");
            CipherPacketBuffer.field_z = MusicTrack.load(GrowableIntList.field_i, "", "cityscape");
            ue.field_e = MusicTrack.load(GrowableIntList.field_i, "", "thats_no_moon");
            SocketConnector.field_a = MusicTrack.load(GrowableIntList.field_i, "", "star_fleet");
            IterableNodeHashTable.field_f.a(0, LoginCredentials.field_f, 21687, RasterBuffer.field_e, SectorCacheStore.field_i);
            IterableNodeHashTable.field_f.a(0, NodeHashTableIterator.field_i, 21687, RasterBuffer.field_e, SectorCacheStore.field_i);
            IterableNodeHashTable.field_f.a(0, ByteStorage.field_e, 21687, RasterBuffer.field_e, SectorCacheStore.field_i);
            IterableNodeHashTable.field_f.a(0, CipherPacketBuffer.field_z, 21687, RasterBuffer.field_e, SectorCacheStore.field_i);
            IterableNodeHashTable.field_f.a(0, ue.field_e, param0 + 21739, RasterBuffer.field_e, SectorCacheStore.field_i);
            IterableNodeHashTable.field_f.a(0, SocketConnector.field_a, 21687, RasterBuffer.field_e, SectorCacheStore.field_i);
            IterableNodeHashTable.field_f.a((byte) 25);
            GrowableIntList.field_i = null;
            SectorCacheStore.field_i = null;
            cc.j(0);
            return false;
          }
          if (oh.field_a == null) {
            if (null != IsaacRandom.field_k) {
              MusicPatchNode.a((byte) 106, new HuffmanDecoder(IsaacRandom.field_k.a("huffman", -742, "")));
              IsaacRandom.field_k = null;
              cc.j(0);
              return false;
            }
            BattleTerrain.a(false);
            gf.a(0);
            var2_int = 0;
            do {
              if (23 <= var2_int) {
                LoginForm.field_T = 0;
                GzipDecoder.field_g = 0;
                ProxyAuthenticationException.a(50, (byte) -127);
                jn.a(true, (byte) 92, 200, LoginCredentials.field_f);
                break;
              }
              GameKeyHandler.field_e[var2_int] = new SentinelDesigner(var2_int);
              var2_int++;
            } while (var6 == 0);
            if (!ni.b(118)) {
              TickClock.field_i = RegistrationRequestDialog.a(4, param0 + 20051);
            }
            cc.j(0);
            if (param0 != -52) {
              this.b(-1, true);
            }
            return true;
          }
          mc.a(ArchiveIndex.field_i, 90.0f, param0 - 21749);
          this.a((byte) 109);
          var2_array = cj.a(-126, "basic", DualNode.field_x, "ranks");
          va.field_j = vd.a(MusicPatchPcmStream.field_t, "roman20", tm.field_d, param0 + 51, "");
          dm.field_f = be.a(DualNode.field_x, oh.field_a, (byte) -102, "biting30", "basic");
          dk.field_h = vd.a(oh.field_a, "basic", DualNode.field_x, param0 ^ 51, "smallfont");
          BoundedUrlRequest.field_d = vd.a(oh.field_a, "basic", DualNode.field_x, -1, "tinyfont");
          ValidationHelpWidget.field_lb = vd.a(MusicPatchPcmStream.field_t, "basicfont12", tm.field_d, param0 + 51, "");
          pl.field_U = be.a(DualNode.field_x, oh.field_a, (byte) -93, "bitingfont", "basic");
          AlphaContainer.field_U = be.a(DualNode.field_x, oh.field_a, (byte) -84, "bitinghalf", "basic");
          SocialListPanel.field_Tb = dd.a(DualNode.field_x, oh.field_a, true, "basic", "menutitlefont");
          cf.a("menu_overlays", "basic", (byte) -87, DualNode.field_x);
          wd.field_a = GameplayController.a(DualNode.field_x, (byte) 42, "frame", "basic");
          km.field_e = GameplayController.a(DualNode.field_x, (byte) -119, "frame_filled", "basic");
          GradientOutlineTextPainter.field_o = GameplayController.a(DualNode.field_x, (byte) -60, "button_frame", "basic");
          Js5Transport.field_l = GameplayController.a(DualNode.field_x, (byte) -122, "button_raised", "basic");
          ja.field_e = GameplayController.a(DualNode.field_x, (byte) 36, "button_depressed", "basic");
          if (ni.b(param0 ^ -44) ||
            !(rd.field_b > 0)) {
            var3 = cj.a(121, "basic", DualNode.field_x, "expansion");
            eh.field_c = new MembershipPromotionScreen((java.applet.Applet) (this), dm.field_e, var3, SentinelDesigner.field_f);
          }
          ClientException.field_c = cf.a("achievements_large", "basic", (byte) -79, DualNode.field_x);
          ProxyAuthenticationException.field_h = cf.a("cursors", "basic", (byte) -54, DualNode.field_x);
          var3_int = 0;
          do {
            if (!(var3_int < ProxyAuthenticationException.field_h.length)) {
              ValidationHelpWidget.field_tb = rl.a(tm.field_d, "basic", "unachieved", false);
              SingleChildContainer.field_P = rl.a(tm.field_d, "basic", "locked", false);
              DropTargetWidget.field_G = rl.a(tm.field_d, "basic", "orbcoin", false);
              GrowableIntList.field_d = new RgbSprite(40, 40);
              GrowableIntList.field_d.bindRasterTarget();
              ValidationHelpWidget.field_tb.drawScaled(0, 0, 40, 40);
              MusicCrossfadeStream.field_F = new RgbSprite(40, 40);
              MusicCrossfadeStream.field_F.bindRasterTarget();
              SingleChildContainer.field_P.drawScaled(0, 0, 40, 40);
              Checkbox.field_bb.b((byte) 126);
              rg.a(false, ValidationHelpWidget.field_tb);
              rg.a(false, SingleChildContainer.field_P);
              rg.a(false, DropTargetWidget.field_G);
              WhirlpoolHasher.field_o = new RgbSprite[5][];
              StatefulTextPainter.a((ResourceArchive) null, 2, DualNode.field_x);
              Sprite.field_m = cf.a("darkblueboxfilled", "basic", (byte) -52, DualNode.field_x);
              be.field_f = cf.a("obviousdarkbluebox", "basic", (byte) -56, DualNode.field_x);
              MatchingTextValidator.field_t = cf.a("darkbluebox", "basic", (byte) -54, DualNode.field_x);
              sa.field_e = cf.a("darkerbluebox", "basic", (byte) -30, DualNode.field_x);
              FullscreenFocusCanvas.field_a = cf.a("lightbluetabbox", "basic", (byte) -108, DualNode.field_x);
              lj.field_b = cf.a("darkgrayboxfilled", "basic", (byte) -114, DualNode.field_x);
              QuickChatCategoryCache.field_d = cf.a("darkgraybox", "basic", (byte) -67, DualNode.field_x);
              pa.field_g = cf.a("sectiontab", "basic", (byte) -99, DualNode.field_x);
              AccountMessagePanel.field_Y = cf.a("tabselected", "basic", (byte) -40, DualNode.field_x);
              Checkbox.field_X = cf.a("tabunselected", "basic", (byte) -67, DualNode.field_x);
              QuickChatPhraseCache.field_f = cf.a("tabmouseover", "basic", (byte) -71, DualNode.field_x);
              CachedTextLayout.field_E = cf.a("sentinelimages", "basic", (byte) -111, DualNode.field_x);
              MatchingTextValidator.field_t[4] = null;
              be.field_f[4] = null;
              AccountChoicePanel.field_T = cf.a("greybox", "basic", (byte) -90, DualNode.field_x);
              AccountChoicePanel.field_T[4] = null;
              QuickChatPhraseDefinition.field_y = rl.a(DualNode.field_x, "basic", "dropdown_mark", false);
              ResizableModalPanel.field_bb = rl.a(DualNode.field_x, "basic", "button_cover", false);
              break;
            }
            ProxyAuthenticationException.field_h[var3_int].normalizeCanvas();
            var3_int++;
          } while (var6 == 0);
          var3_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(ResizableModalPanel.field_bb.field_E.length > var3_int)))) {
            stackIn_149_0 = ~ResizableModalPanel.field_bb.field_E[var3_int];
            stackIn_149_1 = -16777216;
            if (var6 == 0) {
              if (stackIn_149_0 == stackIn_149_1) {
                ResizableModalPanel.field_bb.field_E[var3_int] = 0;
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            TextButton.field_N = rl.a(DualNode.field_x, "basic", "goldstar", false);
            ReportAbuseDialog.field_ec = rl.a(DualNode.field_x, "basic", "silverstar", false);
            rl.a(DualNode.field_x, "basic", "starfrigate", false);
            Checkbox.field_W = rl.a(DualNode.field_x, "basic", "starcruiser", false);
            IterableDualNodeDeque.field_e = Checkbox.field_W.copyFlippedHorizontal();
            NodeIterator.field_c = cj.a(27, "basic", DualNode.field_x, "texticons");
            ModalPanel.field_X = new int[]{13, 13, 13, 13, 14, 14, 14, 13, 13, 15, 13, 13, 12, 13, 15, 13, 13, 13, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15};
            dk.field_h.a(NodeIterator.field_c, ModalPanel.field_X);
            BoundedUrlRequest.field_d.a(NodeIterator.field_c, ModalPanel.field_X);
            pl.field_U.a(NodeIterator.field_c, ModalPanel.field_X);
            ValidationHelpWidget.field_lb.a(NodeIterator.field_c, ModalPanel.field_X);
            stackIn_149_0 = param0;
            stackIn_149_1 = -5;
          }
          var3 = cj.a(stackIn_149_0 ^ stackIn_149_1, "basic", DualNode.field_x, "instr_texticons");
          SoundCache.field_a = new IndexedSprite[18];
          AlternateUsernameCredentials.field_w = new int[SoundCache.field_a.length];
          var4_int = 0;
          do {
            if (!(var4_int < SoundCache.field_a.length)) {
              ArraySupport.copy(var3, 0, SoundCache.field_a, 6, 2);
              SoundCache.field_a[17] = SoundCache.field_a[7];
              SocialListEntry.field_Zb = cf.a("scrolldown", "basic", (byte) -87, DualNode.field_x);
              MusicCrossfadeStream.field_x = cf.a("scrollup", "basic", (byte) -33, DualNode.field_x);
              jn.field_f = cf.a("scrollbar", "basic", (byte) -95, DualNode.field_x);
              qi.field_a = cf.a("scrollvert", "basic", (byte) -104, DualNode.field_x);
              MouseInputHandler.field_k = cf.a("frame_shiny", "basic", (byte) -123, DualNode.field_x);
              Js5ArchiveManager.field_c = cf.a("frame_shiny_bright", "basic", (byte) -43, DualNode.field_x);
              ResourceArchive.field_b = cf.a("frame_basic_bright", "basic", (byte) -128, DualNode.field_x);
              MembershipPromotionScreen.field_p = cf.a("frame_basic_thin", "basic", (byte) -55, DualNode.field_x);
              vh.field_b = cf.a("frame_basic", "basic", (byte) -127, DualNode.field_x);
              TextButton.field_U = cf.a("display_frame", "basic", (byte) -35, DualNode.field_x);
              TextButton.field_U[4] = null;
              LinkButtonPainter.field_d = cf.a("config_tut_frame", "basic", (byte) -32, DualNode.field_x);
              LinkButtonPainter.field_d[4] = null;
              TextButton.field_Q = cf.a("popup_frame", "basic", (byte) -94, DualNode.field_x);
              TextButton.field_Q[4] = null;
              CachedTextLayout.field_l = cj.a(125, "basic", DualNode.field_x, "mechbits");
              IterableDualNodeDeque.field_j = cf.a("weaponclasses", "basic", (byte) -107, DualNode.field_x);
              ja.field_d = cj.a(-123, "basic", DualNode.field_x, "batdrone");
              VerticalScrollbar.field_Zb = cj.a(param0 ^ 69, "basic", DualNode.field_x, "drones");
              AccountNoticeDialog.field_qb = cj.a(param0 + 163, "basic", DualNode.field_x, "bits_golem");
              Sentinel.field_nc = cj.a(42, "basic", DualNode.field_x, "bits_bird");
              PasswordFieldPainter.field_z = cj.a(-115, "basic", DualNode.field_x, "bits_slave");
              wi.field_C = cj.a(125, "basic", DualNode.field_x, "bits_babel");
              ne.field_R = cj.a(-128, "basic", DualNode.field_x, "bits_valhalla");
              hk.field_Ec = cj.a(-128, "basic", DualNode.field_x, "bits_orbital");
              AlphaContainer.field_V = cj.a(61, "basic", DualNode.field_x, "bits_bertha");
              vc.field_b = cj.a(67, "basic", DualNode.field_x, "bits_smasher");
              MembershipPromotionScreen.field_c = cj.a(76, "basic", DualNode.field_x, "bits_scorpion");
              ParticleEffect.field_L = cj.a(-116, "basic", DualNode.field_x, "bits_hurricane");
              cf.field_u = cj.a(param0 - 65, "basic", DualNode.field_x, "bits_commando");
              Sprite.field_b = cj.a(param0 ^ -112, "basic", DualNode.field_x, "bits_turtle");
              ml.field_c = cj.a(param0 + 19, "basic", DualNode.field_x, "droppod");
              ArchiveProvider.field_a = cj.a(param0 ^ -128, "basic", DualNode.field_x, "infantary");
              IsaacRandom.field_d = cj.a(-123, "basic", DualNode.field_x, "modules");
              break;
            }
            AlternateUsernameCredentials.field_w[var4_int] = 14;
            var4_int++;
          } while (var6 == 0);
          var3_array = rh.field_v;
          var3_array[0] = rl.a(DualNode.field_x, "basic", "instr_giantrobot", false);
          var3_array[1] = rl.a(DualNode.field_x, "basic", "instr_queue", false);
          var3_array[2] = rl.a(DualNode.field_x, "Basic", "instr_walk", false);
          var3_array[3] = rl.a(DualNode.field_x, "basic", "instr_jump", false);
          var3_array[4] = rl.a(DualNode.field_x, "basic", "instr_thrust", false);
          var3_array[5] = IsaacRandom.field_d[16].toRgbSprite();
          var3_array[6] = rl.a(DualNode.field_x, "basic", "instr_selweapon", false);
          var3_array[7] = rl.a(DualNode.field_x, "basic", "instr_target", false);
          var3_array[8] = rl.a(DualNode.field_x, "basic", "instr_noenergy", false);
          var3_array[9] = IsaacRandom.field_d[32].toRgbSprite();
          var3_array[10] = IsaacRandom.field_d[33].toRgbSprite();
          var3_array[11] = rl.a(DualNode.field_x, "basic", "instr_bigshieldicon", false);
          var3_array[12] = IsaacRandom.field_d[27].toRgbSprite();
          var3_array[13] = rl.a(DualNode.field_x, "basic", "instr_stats", false);
          var3_array[14] = rl.a(DualNode.field_x, "basic", "instr_chassis", false);
          var3_array[15] = rl.a(DualNode.field_x, "basic", "instr_components", false);
          var3_array[16] = rl.a(DualNode.field_x, "basic", "instr_weapons", false);
          var3_array[17] = rl.a(DualNode.field_x, "basic", "instr_modules", false);
          var3_array[18] = rl.a(DualNode.field_x, "basic", "instr_engineer", false);
          var3_array[19] = rl.a(DualNode.field_x, "basic", "instr_coop", false);
          var3_array[20] = rl.a(DualNode.field_x, "basic", "instr_team", false);
          var3_array[25] = rl.a(DualNode.field_x, "basic", "instr_techvalue", false);
          ArchiveProvider.field_b = rl.a(DualNode.field_x, "basic", "logo_menu_chromakey", false);
          ob.field_z = (ArgbSprite) (dn.a("basic", -63, "main_lower_panel", DualNode.field_x));
          TextHotspotWidget.field_eb = (ArgbSprite) (dn.a("basic", param0 ^ 75, "main_title_panel", DualNode.field_x));
          CachedArchiveProvider.field_j = rl.a(DualNode.field_x, "basic", "menu_mesh", false);
          MidiPcmStream.field_db = rl.a(DualNode.field_x, "basic", "menu_titlebar", false);
          pl.field_T = GameplayController.a(DualNode.field_x, (byte) -62, "menu_button_1", "basic");
          GameplayController.a(DualNode.field_x, (byte) 107, "empty_button", "basic");
          AccountNamePrompt.field_Ub = rl.a(DualNode.field_x, "basic", "prevbtn", false);
          gm.field_b = rl.a(DualNode.field_x, "basic", "nextbtn", false);
          CheckboxPainter.field_b = rl.a(DualNode.field_x, "basic", "lobby_icon", false);
          vc.field_e = cf.a("statbars", "basic", (byte) -13, DualNode.field_x);
          AccountChoicePanel.field_Z = cf.a("tags", "basic", (byte) -50, DualNode.field_x);
          NodeHashTable.field_k = rl.a(DualNode.field_x, "basic", "tagborder", false);
          MarkerSliderPainter.field_f = cf.a("movekeys", "basic", (byte) -38, DualNode.field_x);
          ValidatedTextWidget.field_wb = rl.a(DualNode.field_x, "basic", "shiftkey", false);
          TextLayout.field_e = cf.a("config_tabs", "basic", (byte) -33, DualNode.field_x);
          RasterSnapshot.field_r[0] = rl.a(DualNode.field_x, "basic", "research_ring", false);
          DialWidgetPainter.field_q[0] = rl.a(DualNode.field_x, "basic", "research_icon", false);
          LinkButtonPainter.field_p = cj.a(param0 - 75, "basic", DualNode.field_x, "powerups");
          gf.field_c = cf.a("headings_bar", "basic", (byte) -26, DualNode.field_x);
          rl.a(DualNode.field_x, "basic", "solarite", false);
          Js5Transport.field_q = rl.a(DualNode.field_x, "basic", "mansize", false);
          gj.field_a = rl.a(DualNode.field_x, "basic", "stripeybar", false);
          Js5Transport.field_r = rl.a(DualNode.field_x, "basic", "hackbit", false);
          MouseInputHandler.field_d = cf.a("pretty_button_lit", "basic", (byte) -111, DualNode.field_x);
          hk.field_Tb = cf.a("pretty_button_unlit", "basic", (byte) -50, DualNode.field_x);
          eb.field_p = cf.a("menu_border", "basic", (byte) -31, DualNode.field_x);
          lj.field_e = cf.a("bin_icon", "basic", (byte) -14, DualNode.field_x);
          AccountChoicePanel.field_Q = cf.a("faces_idle", "basic", (byte) -87, DualNode.field_x);
          WeightedCacheEntry.field_C = cf.a("faces_talk", "basic", (byte) -97, DualNode.field_x);
          am.field_f = cf.a("tutor_buttons", "basic", (byte) -125, DualNode.field_x);
          DialWidgetPainter.field_n = cf.a("shields", "basic", (byte) -58, DualNode.field_x);
          AccountRegistrationPanel.field_gb = cf.a("explosion", "basic", (byte) -34, DualNode.field_x);
          var3_array = ec.a((byte) -115, "smoke", DualNode.field_x, "basic");
          cc.field_pc = new ArgbSprite[var3_array.length];
          var4_int = 0;
          do {
            if (var4_int >= var3_array.length) {
              AccountMessagePanel.field_S = cf.a("plasma", "basic", (byte) -98, DualNode.field_x);
              cf.a("dust", "basic", (byte) -81, DualNode.field_x);
              LoginDialog.field_Cb = cj.a(-120, "basic", DualNode.field_x, "crowns");
              ValidatedTextWidget.field_sb = new RgbSprite(32, 32);
              ValidatedTextWidget.field_sb.bindRasterTarget();
              DropTargetWidget.field_G.b(0, 0, 32, 32);
              Checkbox.field_bb.b((byte) 125);
              DropTargetWidget.field_G = null;
              break;
            }
            cc.field_pc[var4_int] = (ArgbSprite) (var3_array[var4_int]);
            var4_int++;
          } while (var6 == 0);
          var3_array2 = new RgbSprite[WeightedLruCache.field_m.length][];
          var4 = new RgbSprite[WeightedLruCache.field_m.length][];
          var5 = 0;
          do {
            if (!(WeightedLruCache.field_m.length > var5)) {
              ResourceArchive.a(te.field_c, (byte) 74, tm.field_d, (int[]) null, BufferedRandomAccessFile.field_k, var4, true, 4, 3, ModalPanel.field_R, var2_array, DebouncedValidator.field_b, var3_array2, MusicPatchPcmStream.field_t, DelayedServerPacket.field_w, ParticleEffect.field_y, ImageProducerRasterBuffer.field_u);
              pa.a(tm.field_d, 111, MusicPatchPcmStream.field_t);
              un.a(200, 126);
              oh.field_a = null;
              cc.j(param0 ^ -52);
              break;
            }
            var3_array2[var5] = cf.a(WeightedLruCache.field_m[var5], "basic", (byte) -63, DualNode.field_x);
            var4[var5] = null;
            var5++;
          } while (var6 == 0);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "SteelSentinels.OA(" + param0 + ')');
        }
    }

    final static RgbSprite[] a(int param0, int param1, byte param2, int param3, int param4) {
        RgbSprite dupTemp$2 = null;
        RgbSprite dupTemp$3 = null;
        RgbSprite[] var5 = null;
        RuntimeException var5_ref = null;
        RgbSprite[] stackIn_2_0 = null;
        RgbSprite[] stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new RgbSprite[9];
          if (param2 != -62) {
            stackIn_2_0 = (RgbSprite[]) null;
            return stackIn_2_0;
          }
          dupTemp$2 = bd.a(param1, param3, 248);
          var5[6] = dupTemp$2;
          var5[3] = dupTemp$2;
          var5[2] = dupTemp$2;
          var5[1] = dupTemp$2;
          var5[0] = dupTemp$2;
          dupTemp$3 = bd.a(param4, param3, 248);
          var5[8] = dupTemp$3;
          var5[7] = dupTemp$3;
          var5[5] = dupTemp$3;
          if (param0 != 0) {
            var5[4] = bd.a(param0, 64, 248);
          }
          stackIn_8_0 = var5;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var5_ref), "SteelSentinels.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void n(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = obfuscationControl;
        try {
          MusicPatchPcmStream.field_v = 3;
          if (param0 != 53) {
            return;
          }
          if (DualNode.field_x != null) {
            ReflectionCheck.field_r = 13;
            DiskCacheWorker.field_l = 0;
            if (!DualNode.field_x.ensureIndex(true)) {
              return;
            }
            boolean decompiledFrameRemainder0 = true;
            if (TickClock.field_g == 0 &&
              DualNode.field_x.a((byte) -38, "lw_midground_01", "basic")) {
              TickClock.field_g = TickClock.field_g + 1;
              WhirlpoolHasher.field_o[1] = new RgbSprite[4];
              WhirlpoolHasher.field_o[1][0] = rl.a(DualNode.field_x, "basic", "lw_midground_01", false);
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (1 == TickClock.field_g &&
                DualNode.field_x.a((byte) 113, "lw_midground_02", "basic")) {
                TickClock.field_g = TickClock.field_g + 1;
                WhirlpoolHasher.field_o[1][1] = rl.a(DualNode.field_x, "basic", "lw_midground_02", false);
                decompiledFrameRemainder0 = (var3 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (2 != TickClock.field_g ||
                  !DualNode.field_x.a((byte) -78, "lw_midground_03", "basic")) {
                  if (TickClock.field_g == 3 &&
                    DualNode.field_x.a((byte) 101, "lw_midground_04", "basic")) {
                    TickClock.field_g = TickClock.field_g + 1;
                    WhirlpoolHasher.field_o[1][3] = rl.a(DualNode.field_x, "basic", "lw_midground_04", false);
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (TickClock.field_g != 4 ||
                      !DualNode.field_x.a((byte) -56, "ct_midground_01", "basic")) {
                      if (TickClock.field_g != 5 ||
                        !DualNode.field_x.a((byte) 102, "ct_midground_02", "basic")) {
                        if (TickClock.field_g != 6 ||
                          !DualNode.field_x.a((byte) -117, "ct_midground_03", "basic")) {
                          if (7 == TickClock.field_g &&
                            DualNode.field_x.a((byte) -57, "ct_midground_04", "basic")) {
                            TickClock.field_g = TickClock.field_g + 1;
                            WhirlpoolHasher.field_o[2][3] = rl.a(DualNode.field_x, "basic", "ct_midground_04", false);
                            decompiledFrameRemainder0 = (var3 != 0);
                          }
                          if (decompiledFrameRemainder0) {
                            if (TickClock.field_g == 8 &&
                              DualNode.field_x.a((byte) 107, "testsurface", "basic")) {
                              TickClock.field_g = TickClock.field_g + 1;
                              AccountRegistrationPanel.field_R = rl.a(DualNode.field_x, "basic", "testsurface", false);
                              decompiledFrameRemainder0 = (var3 != 0);
                            }
                            if (decompiledFrameRemainder0) {
                              if (TickClock.field_g != 9 ||
                                !DualNode.field_x.a((byte) -63, "wz_texture", "basic")) {
                                if (TickClock.field_g == 10 &&
                                  DualNode.field_x.a((byte) -81, "lw_texture", "basic")) {
                                  TickClock.field_g = TickClock.field_g + 1;
                                  ValidatedTextWidget.field_rb[1] = rl.a(DualNode.field_x, "basic", "lw_texture", false);
                                  decompiledFrameRemainder0 = (var3 != 0);
                                }
                                if (decompiledFrameRemainder0) {
                                  if (11 == TickClock.field_g &&
                                    DualNode.field_x.a((byte) -113, "ct_texture", "basic")) {
                                    TickClock.field_g = TickClock.field_g + 1;
                                    ValidatedTextWidget.field_rb[2] = rl.a(DualNode.field_x, "basic", "ct_texture", false);
                                    decompiledFrameRemainder0 = (var3 != 0);
                                  }
                                  if ((decompiledFrameRemainder0) &&
                                    (decompiledFrameRemainder0 = (TickClock.field_g == 12)) &&
                                    (decompiledFrameRemainder0 = !(!DualNode.field_x.a((byte) 127, "mn_texture", "basic")))) {
                                    TickClock.field_g = TickClock.field_g + 1;
                                    ValidatedTextWidget.field_rb[3] = rl.a(DualNode.field_x, "basic", "mn_texture", false);
                                    decompiledFrameRemainder0 = (var3 != 0);
                                  }
                                }
                              }
                              if (decompiledFrameRemainder0) {
                                TickClock.field_g = TickClock.field_g + 1;
                                ValidatedTextWidget.field_rb = new RgbSprite[5];
                                ValidatedTextWidget.field_rb[0] = rl.a(DualNode.field_x, "basic", "wz_texture", false);
                                ValidatedTextWidget.field_rb[4] = ValidatedTextWidget.field_rb[0];
                                decompiledFrameRemainder0 = (var3 != 0);
                              }
                            }
                          }
                        }
                        if (decompiledFrameRemainder0) {
                          TickClock.field_g = TickClock.field_g + 1;
                          WhirlpoolHasher.field_o[2][2] = rl.a(DualNode.field_x, "basic", "ct_midground_03", false);
                          if (var3 != 0) {
                            TickClock.field_g = TickClock.field_g + 1;
                            WhirlpoolHasher.field_o[2][1] = rl.a(DualNode.field_x, "basic", "ct_midground_02", false);
                            TickClock.field_g = TickClock.field_g + 1;
                            WhirlpoolHasher.field_o[2] = new RgbSprite[4];
                            WhirlpoolHasher.field_o[2][0] = rl.a(DualNode.field_x, "basic", "ct_midground_01", false);
                            TickClock.field_g = TickClock.field_g + 1;
                            WhirlpoolHasher.field_o[1][2] = rl.a(DualNode.field_x, "basic", "lw_midground_03", false);
                          }
                        }
                      } else {
                        TickClock.field_g = TickClock.field_g + 1;
                        WhirlpoolHasher.field_o[2][1] = rl.a(DualNode.field_x, "basic", "ct_midground_02", false);
                        if (var3 != 0) {
                          TickClock.field_g = TickClock.field_g + 1;
                          WhirlpoolHasher.field_o[2] = new RgbSprite[4];
                          WhirlpoolHasher.field_o[2][0] = rl.a(DualNode.field_x, "basic", "ct_midground_01", false);
                          TickClock.field_g = TickClock.field_g + 1;
                          WhirlpoolHasher.field_o[1][2] = rl.a(DualNode.field_x, "basic", "lw_midground_03", false);
                        }
                      }
                    } else {
                      TickClock.field_g = TickClock.field_g + 1;
                      WhirlpoolHasher.field_o[2] = new RgbSprite[4];
                      WhirlpoolHasher.field_o[2][0] = rl.a(DualNode.field_x, "basic", "ct_midground_01", false);
                      if (var3 != 0) {
                        TickClock.field_g = TickClock.field_g + 1;
                        WhirlpoolHasher.field_o[1][2] = rl.a(DualNode.field_x, "basic", "lw_midground_03", false);
                      }
                    }
                  }
                } else {
                  TickClock.field_g = TickClock.field_g + 1;
                  WhirlpoolHasher.field_o[1][2] = rl.a(DualNode.field_x, "basic", "lw_midground_03", false);
                }
              }
            }
            if (13 == TickClock.field_g) {
              DualNode.field_x = null;
              DiskCacheWorker.field_l = DiskCacheWorker.field_l + 1;
              TickClock.field_g = 0;
            }
            return;
          }
          if (DiskCacheWorker.field_l == 1 &&
            im.field_h != null) {
            ReflectionCheck.field_r = 23;
            DiskCacheWorker.field_l = 1;
            if (!im.field_h.ensureIndex(true)) {
              return;
            }
            if (TickClock.field_g == 0 &&
              im.field_h.a((byte) -91, "wz_background.jpg", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              return;
            }
            if (TickClock.field_g == 1 &&
              im.field_h.a((byte) -40, "lw_background.jpg", "lostworld/")) {
              TickClock.field_g = TickClock.field_g + 1;
              return;
            }
            if (TickClock.field_g == 2 &&
              im.field_h.a((byte) 126, "ct_background.jpg", "city/")) {
              TickClock.field_g = TickClock.field_g + 1;
              return;
            }
            if (3 == TickClock.field_g &&
              im.field_h.a((byte) -48, "mn_background.jpg", "moon/")) {
              TickClock.field_g = TickClock.field_g + 1;
              return;
            }
            if (TickClock.field_g == 4 &&
              im.field_h.a((byte) 94, "wz_midground_01.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              WhirlpoolHasher.field_o[0] = new RgbSprite[4];
              WhirlpoolHasher.field_o[0][0] = (RgbSprite) ((Object) new ArgbSprite(im.field_h.a("wz_midground_01.png", -742, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.a(false))));
              return;
            }
            if (TickClock.field_g == 5 &&
              im.field_h.a((byte) 109, "wz_midground_02.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              WhirlpoolHasher.field_o[0][1] = (RgbSprite) ((Object) new ArgbSprite(im.field_h.a("wz_midground_02.png", -742, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.a(false))));
              return;
            }
            if (TickClock.field_g == 6 &&
              im.field_h.a((byte) 83, "wz_midground_03.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              WhirlpoolHasher.field_o[0][2] = (RgbSprite) ((Object) new ArgbSprite(im.field_h.a("wz_midground_03.png", -742, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.a(false))));
              return;
            }
            if (7 == TickClock.field_g &&
              im.field_h.a((byte) 118, "wz_midground_04.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              WhirlpoolHasher.field_o[0][3] = (RgbSprite) ((Object) new ArgbSprite(im.field_h.a("wz_midground_04.png", bi.a(param0, -721), "warzone/"), (java.awt.Component) ((Object) NanoTickClock.a(false))));
              return;
            }
            if (TickClock.field_g == 8 &&
              im.field_h.a((byte) 88, "wz_foreground_01.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[0] = new RgbSprite[7];
              DelayedServerPacket.field_x[0][0] = (RgbSprite) ((Object) new ArgbSprite(im.field_h.a("wz_foreground_01.png", param0 - 795, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.a(false))));
              return;
            }
            if (9 == TickClock.field_g &&
              im.field_h.a((byte) 122, "wz_foreground_02.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[0][1] = (RgbSprite) ((Object) new ArgbSprite(im.field_h.a("wz_foreground_02.png", param0 - 795, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.a(false))));
              return;
            }
            if (TickClock.field_g == 10 &&
              im.field_h.a((byte) 84, "wz_foreground_03.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[0][2] = (RgbSprite) ((Object) new ArgbSprite(im.field_h.a("wz_foreground_03.png", -742, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.a(false))));
              return;
            }
            if (TickClock.field_g == 11 &&
              im.field_h.a((byte) 122, "wz_foreground_04.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[0][3] = (RgbSprite) ((Object) new ArgbSprite(im.field_h.a("wz_foreground_04.png", -742, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.a(false))));
              return;
            }
            if (TickClock.field_g == 12 &&
              im.field_h.a((byte) -76, "wz_foreground_05.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[0][4] = (RgbSprite) ((Object) new ArgbSprite(im.field_h.a("wz_foreground_05.png", param0 - 795, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.a(false))));
              return;
            }
            if (TickClock.field_g == 13 &&
              im.field_h.a((byte) 102, "wz_foreground_06.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[0][5] = (RgbSprite) ((Object) new ArgbSprite(im.field_h.a("wz_foreground_06.png", -742, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.a(false))));
              return;
            }
            if (TickClock.field_g == 14 &&
              im.field_h.a((byte) 93, "wz_foreground_07.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[0][6] = (RgbSprite) ((Object) new ArgbSprite(im.field_h.a("wz_foreground_07.png", -742, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.a(false))));
              return;
            }
            if (TickClock.field_g == 15 &&
              im.field_h.a((byte) -54, "sb_foreground_01.png", "fleetbattle/")) {
              DelayedServerPacket.field_x[1] = new RgbSprite[6];
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[1][0] = (RgbSprite) ((Object) new ArgbSprite(im.field_h.a("sb_foreground_01.png", -742, "fleetbattle/"), (java.awt.Component) ((Object) NanoTickClock.a(false))));
              return;
            }
            if (16 == TickClock.field_g &&
              im.field_h.a((byte) -68, "sb_foreground_02.png", "fleetbattle/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[1][1] = (RgbSprite) ((Object) new ArgbSprite(im.field_h.a("sb_foreground_02.png", -742, "fleetbattle/"), (java.awt.Component) ((Object) NanoTickClock.a(false))));
              return;
            }
            if (17 == TickClock.field_g &&
              im.field_h.a((byte) -121, "sb_foreground_03.png", "fleetbattle/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[1][2] = (RgbSprite) ((Object) new ArgbSprite(im.field_h.a("sb_foreground_03.png", bi.a(param0, -721), "fleetbattle/"), (java.awt.Component) ((Object) NanoTickClock.a(false))));
              return;
            }
            if (18 == TickClock.field_g &&
              im.field_h.a((byte) -127, "sb_foreground_04.png", "fleetbattle/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[1][3] = (RgbSprite) ((Object) new ArgbSprite(im.field_h.a("sb_foreground_04.png", bi.a(param0, -721), "fleetbattle/"), (java.awt.Component) ((Object) NanoTickClock.a(false))));
              return;
            }
            if (TickClock.field_g == 19 &&
              im.field_h.a((byte) -70, "sb_foreground_05.png", "fleetbattle/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[1][4] = (RgbSprite) ((Object) new ArgbSprite(im.field_h.a("sb_foreground_05.png", bi.a(param0, -721), "fleetbattle/"), (java.awt.Component) ((Object) NanoTickClock.a(false))));
              return;
            }
            if (20 == TickClock.field_g &&
              im.field_h.a((byte) 126, "sb_foreground_06.png", "fleetbattle/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[1][5] = (RgbSprite) ((Object) new ArgbSprite(im.field_h.a("sb_foreground_06.png", -742, "fleetbattle/"), (java.awt.Component) ((Object) NanoTickClock.a(false))));
              return;
            }
            if (TickClock.field_g == 21 &&
              im.field_h.a((byte) -87, "planet.jpg", "fleetbattle/")) {
              TickClock.field_g = TickClock.field_g + 1;
              return;
            }
            if (TickClock.field_g == 22 &&
              im.field_h.a((byte) 123, "moon.jpg", "fleetbattle/")) {
              TickClock.field_g = TickClock.field_g + 1;
              return;
            }
            if (TickClock.field_g == 23) {
              TickClock.field_g = 0;
              DiskCacheWorker.field_l = DiskCacheWorker.field_l + 1;
            }
            return;
          }
          if (DiskCacheWorker.field_l == 2 &&
            RasterBuffer.field_e != null) {
            regionExit1: {
              ReflectionCheck.field_r = 90;
              if (TickClock.field_g == 0) {
                SentinelAnimationEditor.field_q[0] = RasterBuffer.field_e.getSoundEffectByName("menu_select", "", -123);
                TickClock.field_g = TickClock.field_g + 1;
                if (var3 == 0) {
                  break regionExit1;
                }
              }
              if (TickClock.field_g == 1) {
                SentinelAnimationEditor.field_q[1] = RasterBuffer.field_e.getSoundEffectByName("jumping", "", bi.a(param0, 90));
                TickClock.field_g = TickClock.field_g + 1;
                if (var3 == 0) {
                  break regionExit1;
                }
              }
              if (TickClock.field_g != 2) {
                if (3 != TickClock.field_g) {
                  if (TickClock.field_g == 4) {
                    SentinelAnimationEditor.field_q[4] = RasterBuffer.field_e.getSoundEffectByName("drop_pod", "", -121);
                    TickClock.field_g = TickClock.field_g + 1;
                    if (var3 == 0) {
                      break regionExit1;
                    }
                  }
                  if (TickClock.field_g != 5) {
                    if (TickClock.field_g == 6) {
                      SentinelAnimationEditor.field_q[6] = RasterBuffer.field_e.getSoundEffectByName("footstep_5", "", 100);
                      TickClock.field_g = TickClock.field_g + 1;
                      if (var3 == 0) {
                        break regionExit1;
                      }
                    }
                    if (TickClock.field_g != 7) {
                      if (8 == TickClock.field_g) {
                        SentinelAnimationEditor.field_q[8] = RasterBuffer.field_e.getSoundEffectByName("respawn", "", -28);
                        TickClock.field_g = TickClock.field_g + 1;
                        if (var3 == 0) {
                          break regionExit1;
                        }
                      }
                      if (TickClock.field_g != 9) {
                        if (10 != TickClock.field_g) {
                          if (11 != TickClock.field_g) {
                            if (12 == TickClock.field_g) {
                              SentinelAnimationEditor.field_q[12] = RasterBuffer.field_e.getSoundEffectByName("proxy_grenade_launcher", "", 105);
                              TickClock.field_g = TickClock.field_g + 1;
                              if (var3 == 0) {
                                break regionExit1;
                              }
                            }
                            if (TickClock.field_g != 13) {
                              if (TickClock.field_g != 14) {
                                if (15 == TickClock.field_g) {
                                  SentinelAnimationEditor.field_q[15] = RasterBuffer.field_e.getSoundEffectByName("pulse_laser", "", -118);
                                  TickClock.field_g = TickClock.field_g + 1;
                                  if (var3 == 0) {
                                    break regionExit1;
                                  }
                                }
                                if (TickClock.field_g != 16) {
                                  if (TickClock.field_g == 17) {
                                    SentinelAnimationEditor.field_q[17] = RasterBuffer.field_e.getSoundEffectByName("emp_rocket_impact", "", 112);
                                    TickClock.field_g = TickClock.field_g + 1;
                                    if (var3 == 0) {
                                      break regionExit1;
                                    }
                                  }
                                  if (TickClock.field_g == 18) {
                                    SentinelAnimationEditor.field_q[18] = RasterBuffer.field_e.getSoundEffectByName("flak_repeater", "", 124);
                                    TickClock.field_g = TickClock.field_g + 1;
                                    if (var3 == 0) {
                                      break regionExit1;
                                    }
                                  }
                                  if (19 == TickClock.field_g) {
                                    SentinelAnimationEditor.field_q[19] = RasterBuffer.field_e.getSoundEffectByName("plasma_spray", "", -50);
                                    TickClock.field_g = TickClock.field_g + 1;
                                    if (var3 == 0) {
                                      break regionExit1;
                                    }
                                  }
                                  if (TickClock.field_g != 20) {
                                    if (TickClock.field_g == 21) {
                                      SentinelAnimationEditor.field_q[21] = RasterBuffer.field_e.getSoundEffectByName("electron_cannon", "", param0 - 135);
                                      TickClock.field_g = TickClock.field_g + 1;
                                      if (var3 == 0) {
                                        break regionExit1;
                                      }
                                    }
                                    if (TickClock.field_g == 22) {
                                      SentinelAnimationEditor.field_q[22] = RasterBuffer.field_e.getSoundEffectByName("sword", "", 113);
                                      TickClock.field_g = TickClock.field_g + 1;
                                      if (var3 == 0) {
                                        break regionExit1;
                                      }
                                    }
                                    if (TickClock.field_g != 23) {
                                      if (TickClock.field_g != 24) {
                                        if (TickClock.field_g != 25) {
                                          if (TickClock.field_g != 26) {
                                            if (27 != TickClock.field_g) {
                                              if (TickClock.field_g != 28) {
                                                if (29 == TickClock.field_g) {
                                                  SentinelAnimationEditor.field_q[29] = RasterBuffer.field_e.getSoundEffectByName("shield_loop", "", 122);
                                                  TickClock.field_g = TickClock.field_g + 1;
                                                  if (var3 == 0) {
                                                    break regionExit1;
                                                  }
                                                }
                                                if (30 == TickClock.field_g) {
                                                  SentinelAnimationEditor.field_q[30] = RasterBuffer.field_e.getSoundEffectByName("mine_inactive_hum_2", "", -105);
                                                  TickClock.field_g = TickClock.field_g + 1;
                                                  if (var3 == 0) {
                                                    break regionExit1;
                                                  }
                                                }
                                                if (TickClock.field_g == 31) {
                                                  SentinelAnimationEditor.field_q[31] = RasterBuffer.field_e.getSoundEffectByName("lightning_cannon", "", 123);
                                                  TickClock.field_g = TickClock.field_g + 1;
                                                  if (var3 == 0) {
                                                    break regionExit1;
                                                  }
                                                }
                                                if (32 == TickClock.field_g) {
                                                  SentinelAnimationEditor.field_q[32] = RasterBuffer.field_e.getSoundEffectByName("heavy_cannon_3", "", -86);
                                                  TickClock.field_g = TickClock.field_g + 1;
                                                  if (var3 == 0) {
                                                    break regionExit1;
                                                  }
                                                }
                                                if (TickClock.field_g != 33) {
                                                  if (TickClock.field_g == 34) {
                                                    SentinelAnimationEditor.field_q[34] = RasterBuffer.field_e.getSoundEffectByName("heavy_cannon_1", "", -109);
                                                    TickClock.field_g = TickClock.field_g + 1;
                                                    if (var3 == 0) {
                                                      break regionExit1;
                                                    }
                                                  }
                                                  if (TickClock.field_g != 35) {
                                                    if (TickClock.field_g == 36) {
                                                      SentinelAnimationEditor.field_q[36] = RasterBuffer.field_e.getSoundEffectByName("heavy_gun_3", "", param0 - 94);
                                                      TickClock.field_g = TickClock.field_g + 1;
                                                      if (var3 == 0) {
                                                        break regionExit1;
                                                      }
                                                    }
                                                    if (TickClock.field_g == 37) {
                                                      SentinelAnimationEditor.field_q[37] = RasterBuffer.field_e.getSoundEffectByName("air_mine", "", -78);
                                                      TickClock.field_g = TickClock.field_g + 1;
                                                      if (var3 == 0) {
                                                        break regionExit1;
                                                      }
                                                    }
                                                    if (TickClock.field_g == 38) {
                                                      SentinelAnimationEditor.field_q[38] = RasterBuffer.field_e.getSoundEffectByName("heavy_gun_1", "", 126);
                                                      TickClock.field_g = TickClock.field_g + 1;
                                                      if (var3 == 0) {
                                                        break regionExit1;
                                                      }
                                                    }
                                                    if (TickClock.field_g != 39) {
                                                      if (TickClock.field_g == 40) {
                                                        SentinelAnimationEditor.field_q[40] = RasterBuffer.field_e.getSoundEffectByName("rail_repeater", "", 118);
                                                        TickClock.field_g = TickClock.field_g + 1;
                                                        if (var3 == 0) {
                                                          break regionExit1;
                                                        }
                                                      }
                                                      if (41 != TickClock.field_g) {
                                                        if (TickClock.field_g == 42) {
                                                          SentinelAnimationEditor.field_q[42] = RasterBuffer.field_e.getSoundEffectByName("plasma_cannon", "", 104);
                                                          TickClock.field_g = TickClock.field_g + 1;
                                                          if (var3 == 0) {
                                                            break regionExit1;
                                                          }
                                                        }
                                                        if (43 != TickClock.field_g) {
                                                          if (TickClock.field_g != 44) {
                                                            if (TickClock.field_g != 45) {
                                                              if (TickClock.field_g == 46) {
                                                                SentinelAnimationEditor.field_q[67] = RasterBuffer.field_e.getSoundEffectByName("laser_beam", "", 110);
                                                                TickClock.field_g = TickClock.field_g + 1;
                                                                if (var3 == 0) {
                                                                  break regionExit1;
                                                                }
                                                              }
                                                              if (TickClock.field_g != 47) {
                                                                if (TickClock.field_g == 48) {
                                                                  SentinelAnimationEditor.field_q[46] = RasterBuffer.field_e.getSoundEffectByName("flak_cannon_3", "", 103);
                                                                  TickClock.field_g = TickClock.field_g + 1;
                                                                  if (var3 == 0) {
                                                                    break regionExit1;
                                                                  }
                                                                }
                                                                if (49 != TickClock.field_g) {
                                                                  if (TickClock.field_g == 50) {
                                                                    SentinelAnimationEditor.field_q[48] = RasterBuffer.field_e.getSoundEffectByName("explosion_1", "", 110);
                                                                    TickClock.field_g = TickClock.field_g + 1;
                                                                    if (var3 == 0) {
                                                                      break regionExit1;
                                                                    }
                                                                  }
                                                                  if (TickClock.field_g == 51) {
                                                                    SentinelAnimationEditor.field_q[49] = RasterBuffer.field_e.getSoundEffectByName("damage_richochet", "", bi.a(param0, -15));
                                                                    TickClock.field_g = TickClock.field_g + 1;
                                                                    if (var3 == 0) {
                                                                      break regionExit1;
                                                                    }
                                                                  }
                                                                  if (TickClock.field_g == 52) {
                                                                    SentinelAnimationEditor.field_q[50] = RasterBuffer.field_e.getSoundEffectByName("damage_plasma_burn", "", 113);
                                                                    TickClock.field_g = TickClock.field_g + 1;
                                                                    if (var3 == 0) {
                                                                      break regionExit1;
                                                                    }
                                                                  }
                                                                  if (53 != TickClock.field_g) {
                                                                    if (TickClock.field_g == 54) {
                                                                      SentinelAnimationEditor.field_q[52] = RasterBuffer.field_e.getSoundEffectByName("explosion_4", "", 122);
                                                                      TickClock.field_g = TickClock.field_g + 1;
                                                                      if (var3 == 0) {
                                                                        break regionExit1;
                                                                      }
                                                                    }
                                                                    if (TickClock.field_g != 55) {
                                                                      if (TickClock.field_g != 56) {
                                                                        if (TickClock.field_g == 57) {
                                                                          SentinelAnimationEditor.field_q[55] = RasterBuffer.field_e.getSoundEffectByName("damage_debris_hitting_ground", "", -32);
                                                                          TickClock.field_g = TickClock.field_g + 1;
                                                                          if (var3 == 0) {
                                                                            break regionExit1;
                                                                          }
                                                                        }
                                                                        if (TickClock.field_g == 58) {
                                                                          SentinelAnimationEditor.field_q[56] = RasterBuffer.field_e.getSoundEffectByName("explosion_3", "", -82);
                                                                          TickClock.field_g = TickClock.field_g + 1;
                                                                          if (var3 == 0) {
                                                                            break regionExit1;
                                                                          }
                                                                        }
                                                                        if (TickClock.field_g != 59) {
                                                                          if (60 != TickClock.field_g) {
                                                                            if (TickClock.field_g == 61) {
                                                                              SentinelAnimationEditor.field_q[59] = RasterBuffer.field_e.getSoundEffectByName("rail_cannon", "", 122);
                                                                              TickClock.field_g = TickClock.field_g + 1;
                                                                              if (var3 == 0) {
                                                                                break regionExit1;
                                                                              }
                                                                            }
                                                                            if (TickClock.field_g != 62) {
                                                                              if (TickClock.field_g != 63) {
                                                                                if (64 == TickClock.field_g) {
                                                                                  SentinelAnimationEditor.field_q[62] = RasterBuffer.field_e.getSoundEffectByName("fusion_cannon", "", -56);
                                                                                  TickClock.field_g = TickClock.field_g + 1;
                                                                                  if (var3 == 0) {
                                                                                    break regionExit1;
                                                                                  }
                                                                                }
                                                                                if (TickClock.field_g != 65) {
                                                                                  if (TickClock.field_g != 66) {
                                                                                    if (TickClock.field_g != 67) {
                                                                                      if (TickClock.field_g != 68) {
                                                                                        if (TickClock.field_g == 69) {
                                                                                          SentinelAnimationEditor.field_q[69] = RasterBuffer.field_e.getSoundEffectByName("Add_order", "", 118);
                                                                                          TickClock.field_g = TickClock.field_g + 1;
                                                                                          if (var3 == 0) {
                                                                                            break regionExit1;
                                                                                          }
                                                                                        }
                                                                                        if (70 != TickClock.field_g) {
                                                                                          if (TickClock.field_g == 71) {
                                                                                            SentinelAnimationEditor.field_q[85] = RasterBuffer.field_e.getSoundEffectByName("pause_menu_close", "", -92);
                                                                                            TickClock.field_g = TickClock.field_g + 1;
                                                                                            if (var3 == 0) {
                                                                                              break regionExit1;
                                                                                            }
                                                                                          }
                                                                                          if (72 == TickClock.field_g) {
                                                                                            SentinelAnimationEditor.field_q[86] = RasterBuffer.field_e.getSoundEffectByName("explosion_fireball_1", "", 100);
                                                                                            TickClock.field_g = TickClock.field_g + 1;
                                                                                            if (var3 == 0) {
                                                                                              break regionExit1;
                                                                                            }
                                                                                          }
                                                                                          if (TickClock.field_g != 73) {
                                                                                            if (74 != TickClock.field_g) {
                                                                                              if (TickClock.field_g != 75) {
                                                                                                if (TickClock.field_g == 76) {
                                                                                                  SentinelAnimationEditor.field_q[90] = RasterBuffer.field_e.getSoundEffectByName("steam", "", -108);
                                                                                                  TickClock.field_g = TickClock.field_g + 1;
                                                                                                  if (var3 == 0) {
                                                                                                    break regionExit1;
                                                                                                  }
                                                                                                }
                                                                                                if (TickClock.field_g == 77) {
                                                                                                  SentinelAnimationEditor.field_q[91] = RasterBuffer.field_e.getSoundEffectByName("flak_explosion_500ms", "", 95);
                                                                                                  TickClock.field_g = TickClock.field_g + 1;
                                                                                                  if (var3 == 0) {
                                                                                                    break regionExit1;
                                                                                                  }
                                                                                                }
                                                                                                if (TickClock.field_g != 78) {
                                                                                                  if (TickClock.field_g != 79) {
                                                                                                    if (TickClock.field_g != 80) {
                                                                                                      if (TickClock.field_g != 81) {
                                                                                                        if (TickClock.field_g != 82) {
                                                                                                          if (TickClock.field_g != 83) {
                                                                                                            if (TickClock.field_g == 84) {
                                                                                                              SentinelAnimationEditor.field_q[98] = RasterBuffer.field_e.getSoundEffectByName("main_menu_disappear", "", 93);
                                                                                                              TickClock.field_g = TickClock.field_g + 1;
                                                                                                              if (var3 == 0) {
                                                                                                                break regionExit1;
                                                                                                              }
                                                                                                            }
                                                                                                            if (TickClock.field_g != 85) {
                                                                                                              if (TickClock.field_g != 86) {
                                                                                                                if (TickClock.field_g == 87) {
                                                                                                                  SentinelAnimationEditor.field_q[102] = RasterBuffer.field_e.getSoundEffectByName("power_up", "", 102);
                                                                                                                  TickClock.field_g = TickClock.field_g + 1;
                                                                                                                  if (var3 == 0) {
                                                                                                                    break regionExit1;
                                                                                                                  }
                                                                                                                }
                                                                                                                if (TickClock.field_g == 88) {
                                                                                                                  SentinelAnimationEditor.field_q[103] = RasterBuffer.field_e.getSoundEffectByName("energy_sword_part_1", "", param0 + 47);
                                                                                                                  TickClock.field_g = TickClock.field_g + 1;
                                                                                                                  if (var3 == 0) {
                                                                                                                    break regionExit1;
                                                                                                                  }
                                                                                                                }
                                                                                                                if (TickClock.field_g != 89) {
                                                                                                                  break regionExit1;
                                                                                                                }
                                                                                                                SentinelAnimationEditor.field_q[104] = RasterBuffer.field_e.getSoundEffectByName("new_nuke_explosion", "", 100);
                                                                                                                TickClock.field_g = TickClock.field_g + 1;
                                                                                                                if (var3 == 0) {
                                                                                                                  break regionExit1;
                                                                                                                }
                                                                                                              }
                                                                                                              SentinelAnimationEditor.field_q[100] = RasterBuffer.field_e.getSoundEffectByName("Menu_engineering_select_part", "", -28);
                                                                                                              TickClock.field_g = TickClock.field_g + 1;
                                                                                                              if (var3 == 0) {
                                                                                                                break regionExit1;
                                                                                                              }
                                                                                                            }
                                                                                                            SentinelAnimationEditor.field_q[99] = RasterBuffer.field_e.getSoundEffectByName("Menu_engineering_select_chassis", "", -112);
                                                                                                            TickClock.field_g = TickClock.field_g + 1;
                                                                                                            if (var3 == 0) {
                                                                                                              break regionExit1;
                                                                                                            }
                                                                                                          }
                                                                                                          SentinelAnimationEditor.field_q[97] = RasterBuffer.field_e.getSoundEffectByName("Mouseover", "", 120);
                                                                                                          TickClock.field_g = TickClock.field_g + 1;
                                                                                                          if (var3 == 0) {
                                                                                                            break regionExit1;
                                                                                                          }
                                                                                                        }
                                                                                                        SentinelAnimationEditor.field_q[96] = RasterBuffer.field_e.getSoundEffectByName("Main_menu_appear", "", 104);
                                                                                                        TickClock.field_g = TickClock.field_g + 1;
                                                                                                        if (var3 == 0) {
                                                                                                          break regionExit1;
                                                                                                        }
                                                                                                      }
                                                                                                      SentinelAnimationEditor.field_q[95] = RasterBuffer.field_e.getSoundEffectByName("Button_press", "", -49);
                                                                                                      TickClock.field_g = TickClock.field_g + 1;
                                                                                                      if (var3 == 0) {
                                                                                                        break regionExit1;
                                                                                                      }
                                                                                                    }
                                                                                                    SentinelAnimationEditor.field_q[94] = RasterBuffer.field_e.getSoundEffectByName("damage_plasma_burn2", "", -79);
                                                                                                    TickClock.field_g = TickClock.field_g + 1;
                                                                                                    if (var3 == 0) {
                                                                                                      break regionExit1;
                                                                                                    }
                                                                                                  }
                                                                                                  SentinelAnimationEditor.field_q[93] = RasterBuffer.field_e.getSoundEffectByName("trackloop", "", bi.a(param0, 68));
                                                                                                  TickClock.field_g = TickClock.field_g + 1;
                                                                                                  if (var3 == 0) {
                                                                                                    break regionExit1;
                                                                                                  }
                                                                                                }
                                                                                                SentinelAnimationEditor.field_q[92] = RasterBuffer.field_e.getSoundEffectByName("hoverloop", "", param0 + 59);
                                                                                                TickClock.field_g = TickClock.field_g + 1;
                                                                                                if (var3 == 0) {
                                                                                                  break regionExit1;
                                                                                                }
                                                                                              }
                                                                                              SentinelAnimationEditor.field_q[89] = RasterBuffer.field_e.getSoundEffectByName("explosion_fireball_4", "", -85);
                                                                                              TickClock.field_g = TickClock.field_g + 1;
                                                                                              if (var3 == 0) {
                                                                                                break regionExit1;
                                                                                              }
                                                                                            }
                                                                                            SentinelAnimationEditor.field_q[88] = RasterBuffer.field_e.getSoundEffectByName("explosion_fireball_3", "", bi.a(param0, -90));
                                                                                            TickClock.field_g = TickClock.field_g + 1;
                                                                                            if (var3 == 0) {
                                                                                              break regionExit1;
                                                                                            }
                                                                                          }
                                                                                          SentinelAnimationEditor.field_q[87] = RasterBuffer.field_e.getSoundEffectByName("explosion_fireball_2", "", -125);
                                                                                          TickClock.field_g = TickClock.field_g + 1;
                                                                                          if (var3 == 0) {
                                                                                            break regionExit1;
                                                                                          }
                                                                                        }
                                                                                        SentinelAnimationEditor.field_q[84] = RasterBuffer.field_e.getSoundEffectByName("pause_menu_open", "", bi.a(param0, -110));
                                                                                        TickClock.field_g = TickClock.field_g + 1;
                                                                                        if (var3 == 0) {
                                                                                          break regionExit1;
                                                                                        }
                                                                                      }
                                                                                      SentinelAnimationEditor.field_q[66] = RasterBuffer.field_e.getSoundEffectByName("ultra_gun", "", 123);
                                                                                      TickClock.field_g = TickClock.field_g + 1;
                                                                                      if (var3 == 0) {
                                                                                        break regionExit1;
                                                                                      }
                                                                                    }
                                                                                    SentinelAnimationEditor.field_q[65] = RasterBuffer.field_e.getSoundEffectByName("doomsday_cannon", "", -83);
                                                                                    TickClock.field_g = TickClock.field_g + 1;
                                                                                    if (var3 == 0) {
                                                                                      break regionExit1;
                                                                                    }
                                                                                  }
                                                                                  SentinelAnimationEditor.field_q[64] = RasterBuffer.field_e.getSoundEffectByName("solaris_laser", "", -116);
                                                                                  TickClock.field_g = TickClock.field_g + 1;
                                                                                  if (var3 == 0) {
                                                                                    break regionExit1;
                                                                                  }
                                                                                }
                                                                                SentinelAnimationEditor.field_q[63] = RasterBuffer.field_e.getSoundEffectByName("EMP_cannon", "", -61);
                                                                                TickClock.field_g = TickClock.field_g + 1;
                                                                                if (var3 == 0) {
                                                                                  break regionExit1;
                                                                                }
                                                                              }
                                                                              SentinelAnimationEditor.field_q[61] = RasterBuffer.field_e.getSoundEffectByName("air_death_missile", "", bi.a(param0, 85));
                                                                              TickClock.field_g = TickClock.field_g + 1;
                                                                              if (var3 == 0) {
                                                                                break regionExit1;
                                                                              }
                                                                            }
                                                                            SentinelAnimationEditor.field_q[60] = RasterBuffer.field_e.getSoundEffectByName("class_DEATH_nuke", "", -113);
                                                                            TickClock.field_g = TickClock.field_g + 1;
                                                                            if (var3 == 0) {
                                                                              break regionExit1;
                                                                            }
                                                                          }
                                                                          SentinelAnimationEditor.field_q[58] = RasterBuffer.field_e.getSoundEffectByName("howitzer", "", -53);
                                                                          TickClock.field_g = TickClock.field_g + 1;
                                                                          if (var3 == 0) {
                                                                            break regionExit1;
                                                                          }
                                                                        }
                                                                        SentinelAnimationEditor.field_q[57] = RasterBuffer.field_e.getSoundEffectByName("destructor_rocket", "", 100);
                                                                        TickClock.field_g = TickClock.field_g + 1;
                                                                        if (var3 == 0) {
                                                                          break regionExit1;
                                                                        }
                                                                      }
                                                                      SentinelAnimationEditor.field_q[54] = RasterBuffer.field_e.getSoundEffectByName("explosion_6", "", 96);
                                                                      TickClock.field_g = TickClock.field_g + 1;
                                                                      if (var3 == 0) {
                                                                        break regionExit1;
                                                                      }
                                                                    }
                                                                    SentinelAnimationEditor.field_q[53] = RasterBuffer.field_e.getSoundEffectByName("explosion_5", "", 117);
                                                                    TickClock.field_g = TickClock.field_g + 1;
                                                                    if (var3 == 0) {
                                                                      break regionExit1;
                                                                    }
                                                                  }
                                                                  SentinelAnimationEditor.field_q[51] = RasterBuffer.field_e.getSoundEffectByName("damage_scraping_metal", "", -108);
                                                                  TickClock.field_g = TickClock.field_g + 1;
                                                                  if (var3 == 0) {
                                                                    break regionExit1;
                                                                  }
                                                                }
                                                                SentinelAnimationEditor.field_q[47] = RasterBuffer.field_e.getSoundEffectByName("explosion_2", "", bi.a(param0, -87));
                                                                TickClock.field_g = TickClock.field_g + 1;
                                                                if (var3 == 0) {
                                                                  break regionExit1;
                                                                }
                                                              }
                                                              SentinelAnimationEditor.field_q[68] = RasterBuffer.field_e.getSoundEffectByName("heavy_gun_2", "", bi.a(param0, -27));
                                                              TickClock.field_g = TickClock.field_g + 1;
                                                              if (var3 == 0) {
                                                                break regionExit1;
                                                              }
                                                            }
                                                            SentinelAnimationEditor.field_q[45] = RasterBuffer.field_e.getSoundEffectByName("heavy_cannon_2", "", param0 + 62);
                                                            TickClock.field_g = TickClock.field_g + 1;
                                                            if (var3 == 0) {
                                                              break regionExit1;
                                                            }
                                                          }
                                                          SentinelAnimationEditor.field_q[44] = RasterBuffer.field_e.getSoundEffectByName("heavy_rocket_launch", "", param0 + 63);
                                                          TickClock.field_g = TickClock.field_g + 1;
                                                          if (var3 == 0) {
                                                            break regionExit1;
                                                          }
                                                        }
                                                        SentinelAnimationEditor.field_q[43] = RasterBuffer.field_e.getSoundEffectByName("rifled_sniper_cannon", "", 120);
                                                        TickClock.field_g = TickClock.field_g + 1;
                                                        if (var3 == 0) {
                                                          break regionExit1;
                                                        }
                                                      }
                                                      SentinelAnimationEditor.field_q[41] = RasterBuffer.field_e.getSoundEffectByName("mine_proximity_2", "", -72);
                                                      TickClock.field_g = TickClock.field_g + 1;
                                                      if (var3 == 0) {
                                                        break regionExit1;
                                                      }
                                                    }
                                                    SentinelAnimationEditor.field_q[39] = RasterBuffer.field_e.getSoundEffectByName("flak_cannon_1", "", 95);
                                                    TickClock.field_g = TickClock.field_g + 1;
                                                    if (var3 == 0) {
                                                      break regionExit1;
                                                    }
                                                  }
                                                  SentinelAnimationEditor.field_q[35] = RasterBuffer.field_e.getSoundEffectByName("morter", "", -67);
                                                  TickClock.field_g = TickClock.field_g + 1;
                                                  if (var3 == 0) {
                                                    break regionExit1;
                                                  }
                                                }
                                                SentinelAnimationEditor.field_q[33] = RasterBuffer.field_e.getSoundEffectByName("flak_cannon_2", "", -103);
                                                TickClock.field_g = TickClock.field_g + 1;
                                                if (var3 == 0) {
                                                  break regionExit1;
                                                }
                                              }
                                              SentinelAnimationEditor.field_q[28] = RasterBuffer.field_e.getSoundEffectByName("EDD_teleport", "", 103);
                                              TickClock.field_g = TickClock.field_g + 1;
                                              if (var3 == 0) {
                                                break regionExit1;
                                              }
                                            }
                                            SentinelAnimationEditor.field_q[27] = RasterBuffer.field_e.getSoundEffectByName("shield_hit", "", bi.a(param0, -109));
                                            TickClock.field_g = TickClock.field_g + 1;
                                            if (var3 == 0) {
                                              break regionExit1;
                                            }
                                          }
                                          SentinelAnimationEditor.field_q[26] = RasterBuffer.field_e.getSoundEffectByName("ballistic_target_tracking_module", "", param0 - 176);
                                          TickClock.field_g = TickClock.field_g + 1;
                                          if (var3 == 0) {
                                            break regionExit1;
                                          }
                                        }
                                        SentinelAnimationEditor.field_q[25] = RasterBuffer.field_e.getSoundEffectByName("attach_component", "", -57);
                                        TickClock.field_g = TickClock.field_g + 1;
                                        if (var3 == 0) {
                                          break regionExit1;
                                        }
                                      }
                                      SentinelAnimationEditor.field_q[24] = RasterBuffer.field_e.getSoundEffectByName("hammer", "", -57);
                                      TickClock.field_g = TickClock.field_g + 1;
                                      if (var3 == 0) {
                                        break regionExit1;
                                      }
                                    }
                                    SentinelAnimationEditor.field_q[23] = RasterBuffer.field_e.getSoundEffectByName("energy_sword_part_2", "", -41);
                                    TickClock.field_g = TickClock.field_g + 1;
                                    if (var3 == 0) {
                                      break regionExit1;
                                    }
                                  }
                                  SentinelAnimationEditor.field_q[20] = RasterBuffer.field_e.getSoundEffectByName("light_rocket_launch", "", -56);
                                  TickClock.field_g = TickClock.field_g + 1;
                                  if (var3 == 0) {
                                    break regionExit1;
                                  }
                                }
                                SentinelAnimationEditor.field_q[16] = RasterBuffer.field_e.getSoundEffectByName("mini_gun", "", 127);
                                TickClock.field_g = TickClock.field_g + 1;
                                if (var3 == 0) {
                                  break regionExit1;
                                }
                              }
                              SentinelAnimationEditor.field_q[14] = RasterBuffer.field_e.getSoundEffectByName("rapier_missle", "", param0 + 68);
                              TickClock.field_g = TickClock.field_g + 1;
                              if (var3 == 0) {
                                break regionExit1;
                              }
                            }
                            SentinelAnimationEditor.field_q[13] = RasterBuffer.field_e.getSoundEffectByName("gauss_gun", "", -110);
                            TickClock.field_g = TickClock.field_g + 1;
                            if (var3 == 0) {
                              break regionExit1;
                            }
                          }
                          SentinelAnimationEditor.field_q[11] = RasterBuffer.field_e.getSoundEffectByName("landing", "", 121);
                          TickClock.field_g = TickClock.field_g + 1;
                          if (var3 == 0) {
                            break regionExit1;
                          }
                        }
                        SentinelAnimationEditor.field_q[10] = RasterBuffer.field_e.getSoundEffectByName("footstep_3", "", param0 + 64);
                        TickClock.field_g = TickClock.field_g + 1;
                        if (var3 == 0) {
                          break regionExit1;
                        }
                      }
                      SentinelAnimationEditor.field_q[9] = RasterBuffer.field_e.getSoundEffectByName("death", "", param0 - 141);
                      TickClock.field_g = TickClock.field_g + 1;
                      if (var3 == 0) {
                        break regionExit1;
                      }
                    }
                    SentinelAnimationEditor.field_q[7] = RasterBuffer.field_e.getSoundEffectByName("footstep_2", "", 111);
                    TickClock.field_g = TickClock.field_g + 1;
                    if (var3 == 0) {
                      break regionExit1;
                    }
                  }
                  SentinelAnimationEditor.field_q[5] = RasterBuffer.field_e.getSoundEffectByName("footstep_4", "", 125);
                  TickClock.field_g = TickClock.field_g + 1;
                  if (var3 == 0) {
                    break regionExit1;
                  }
                }
                SentinelAnimationEditor.field_q[3] = RasterBuffer.field_e.getSoundEffectByName("footstep_1", "", bi.a(param0, 75));
                TickClock.field_g = TickClock.field_g + 1;
                if (var3 == 0) {
                  break regionExit1;
                }
              }
              SentinelAnimationEditor.field_q[2] = RasterBuffer.field_e.getSoundEffectByName("thrusting", "", bi.a(param0, 92));
              TickClock.field_g = TickClock.field_g + 1;
            }
            if (TickClock.field_g == 90) {
              TickClock.field_g = 0;
              DiskCacheWorker.field_l = DiskCacheWorker.field_l + 1;
              RasterBuffer.field_e = null;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "SteelSentinels.PA(" + param0 + ')');
        }
    }

    public static void j(byte param0) {
        field_H = null;
        field_J = null;
        if (param0 != -10) {
          return;
        }
        try {
          field_I = null;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "SteelSentinels.TA(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (pl.field_S != null) {
            SectorCacheStore.a(0, pl.field_S);
            pl.field_S = null;
            cc.j(0);
          }
          IsaacRandom.field_k = SceneWidgetNode.a(-124, 3);
          DualNode.field_x = SceneWidgetNode.a(60, 5);
          oh.field_a = SceneWidgetNode.a(-90, 6);
          RasterSnapshot.field_x = SceneWidgetNode.a(55, 7);
          SceneWidgetNode.field_z = SceneWidgetNode.a(120, 8);
          var2_int = -77 % ((47 - param0) / 35);
          SectorCacheStore.field_i = SceneWidgetNode.a(-92, 9);
          GrowableIntList.field_i = SceneWidgetNode.a(-106, 10);
          BufferedRandomAccessFile.field_k = SceneWidgetNode.a(104, 11);
          ImageProducerRasterBuffer.field_t = SceneWidgetNode.a(125, 12);
          im.field_h = SceneWidgetNode.a(70, 13);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "SteelSentinels.RA(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ImageProducerRasterBuffer.d(7094);
          if (null != wb.field_c) {
            SoundCache.c(0);
          }
          var2_int = 21 % ((param0 - 34) / 48);
          QuickChatPhraseDefinition.h(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "SteelSentinels.LA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.a(15, -28233, "steelsentinels");
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "SteelSentinels.init()");
        }
    }

    private final void b(int param0, boolean param1) {
        int fieldTemp$0 = 0;
        boolean stackIn_179_0 = false;
        GameplayController stackIn_251_0;
        GameplayController stackIn_251_1;
        boolean stackIn_251_2;
        int stackIn_251_3;
        int stackIn_251_4;
        String[] stackIn_251_5;
        int stackIn_251_6;
        boolean stackIn_251_7;
        int[][] stackIn_251_8;
        GameplayController stackIn_252_0;
        GameplayController stackIn_252_1;
        int stackIn_252_9;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        Sentinel var5 = null;
        int var5_int = 0;
        int[][] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = obfuscationControl;
        try {
          boolean decompiledFrameRemainder2 = true;
          DualNodeDequeIterator.a(false);
          if (in.field_h != in.field_i) {
            if (~WeightedCacheEntry.field_G != ~in.field_i) {
              if (LoginMethod.field_f == in.field_i) {
                if (!ni.b(12)) {
                  if (null != lc.field_c) {
                    pa.a(3, (byte) -114, lc.field_c);
                  }
                  gf.c(-128);
                  GzipDecoder.field_g = SentinelDesigner.field_i;
                  if (CachedTextLayout.field_y) {
                    CachedTextLayout.field_y = false;
                    GradientOutlineTextPainter.a(-4, false);
                  }
                  if (ArchiveRequest.field_E &&
                    GzipDecoder.b(-52)) {
                    var3_int = GzipDecoder.field_g;
                    if (var3_int == 5 ||
                      var3_int == 6 ||
                      var3_int == 8) {
                      var3_int = SceneWidget.field_Jb;
                    }
                    IterableNodeHashTable.a(-4, false, -1, var3_int);
                  }
                  if (DropTargetWidget.a(GzipDecoder.field_g, 0)) {
                    QuickChatHelpDialog.b(true);
                  }
                }
                in.field_i = ik.field_b;
                decompiledFrameRemainder2 = (var8 != 0);
              }
              if (decompiledFrameRemainder2) {
                SentinelDesigner.field_a = SentinelDesigner.field_a - 1;
                decompiledFrameRemainder2 = (SentinelDesigner.field_a == 0);
                if (decompiledFrameRemainder2) {
                  in.field_i = in.field_h;
                  decompiledFrameRemainder2 = (var8 != 0);
                }
              }
            }
            if (decompiledFrameRemainder2) {
              SentinelDesigner.field_a = SentinelDesigner.field_a + 1;
              decompiledFrameRemainder2 = (SentinelDesigner.field_a == 16);
              if (decompiledFrameRemainder2) {
                if (!CachedTextLayout.field_y) {
                  ModalPanel.a((byte) 113);
                  if (var8 != 0) {
                    ef.a(param0 ^ 116);
                  }
                } else {
                  ef.a(param0 ^ 116);
                }
                in.field_i = LoginMethod.field_f;
                decompiledFrameRemainder2 = (var8 != 0);
              }
            }
          }
          if (decompiledFrameRemainder2) {
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameCompleted2 = true;
            boolean decompiledFrameRemainder1 = true;
            var3_int = 0;
            var4 = 0;
            if (!param1) {
              if (~GzipDecoder.field_g == ~LoginForm.field_T) {
                if (LoginForm.field_T == -1) {
                  if ((!WeightedCacheEntry.field_H) &&
                    (decompiledFrameRemainder1 = (null != BoundedUrlRequest.field_i))) {
                    BoundedUrlRequest.field_i.c(-68, true);
                    while (UiContainer.f(22759)) {
                      BoundedUrlRequest.field_i.g(97);
                      if (var8 != 0) {
                        decompiledFrameCompleted2 = false;
                        break;
                      }
                    }
                    decompiledFrameRemainder1 = !(decompiledFrameCompleted2);
                  }
                  if ((decompiledFrameRemainder1) &&
                    (decompiledFrameCompleted2)) {
                    var4 = 1;
                    var3_int = 1;
                    decompiledFrameRemainder1 = (var8 != 0);
                  }
                }
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameCompleted2)) {
                  if (LoginForm.field_T == -2) {
                    boolean decompiledFrameCompleted1 = true;
                    if (null != ih.field_s &&
                      null != hl.a((byte) -66)) {
                      ih.field_s.advanceSimulation((byte) 27);
                      var5 = (Sentinel) (ih.field_s.sentinels.first(13058));
                      while (null != var5) {
                        var5.field_vb = 0;
                        var5 = (Sentinel) (ih.field_s.sentinels.next((byte) -80));
                        if (var8 != 0) {
                          decompiledFrameCompleted1 = false;
                          break;
                        }
                      }
                    }
                    if (decompiledFrameCompleted1) {
                      var3_int = 1;
                    }
                    decompiledFrameRemainder1 = (var8 != 0);
                  }
                  if ((decompiledFrameRemainder1) &&
                    (DropTargetWidget.a(LoginForm.field_T, param0 ^ 120))) {
                    GameKeyHandler.field_e[LoginForm.field_T].b(true);
                    if (var8 != 0) {
                      LoginForm.field_U = LoginForm.field_U + 1;
                      if (LoginForm.field_U == 20) {
                        QuickChatHelpDialog.b(true);
                      }
                    }
                  }
                }
              } else {
                LoginForm.field_U = LoginForm.field_U + 1;
                if (LoginForm.field_U == 20) {
                  QuickChatHelpDialog.b(true);
                }
              }
            }
            if ((decompiledFrameCompleted2) && (WeightedCacheEntry.field_H &&
              !SectorCacheStore.field_n &&
              !TextLayout.field_d)) {
              if (ob.field_y &&
                jn.field_g) {
                var3_int = 0;
              }
              la.a(13, var3_int != 0);
              if (CombatWorld.field_G ||
                ob.field_y) {
                ue.a((byte) 38, var4 != 0, 320, 180);
              }
              if (CombatWorld.field_G &&
                null != CachedTextLayout.field_A) {
                CachedTextLayout.field_A.c(param0 ^ 37, var4 != 0);
              }
              if (ob.field_y) {
                BoundedUrlRequest.field_i.c(-121, var4 != 0);
              }
              while (UiContainer.f(22759)) {
                boolean decompiledFrameRemainder0 = true;
                if (TextHotspotRegion.field_v) {
                  if (ob.field_y ||
                    CombatWorld.field_G) {
                    decompiledFrameRemainder0 = !(!TextWidgetPainter.a(13, 15, 12, false));
                    if ((decompiledFrameRemainder0) &&
                      (var8 == 0)) {
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    cj.a(13, (byte) 99, 12, 15);
                    decompiledFrameRemainder0 = (var8 != 0);
                  }
                }
                if ((decompiledFrameRemainder0) && ((ob.field_y ||
                  CombatWorld.field_G) && (jn.field_g ||
                  NameAvailabilityValidator.field_q == 80 ||
                  NameAvailabilityValidator.field_q == 10) && TextWidgetPainter.a(13, 15, 12, false))) {
                  continue;
                }
                stackIn_179_0 = jn.field_g;
                if (var8 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_179_0) {
                  continue;
                }
                if (CombatWorld.field_G) {
                  CachedTextLayout.field_A.g(73);
                }
                if (!ob.field_y) {
                  continue;
                }
                BoundedUrlRequest.field_i.g(51);
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_179_0 = WeightedCacheEntry.field_H;
            }
            if (!stackIn_179_0) {
              IntKeyLookup.d((byte) -66);
            }
            if (!TextHotspotRegion.field_v) {
              if (!(EmailCredentials.field_i <= 0)) {
                EmailCredentials.field_i = EmailCredentials.field_i - 1;
                if ((var8 != 0) &&
                  (EmailCredentials.field_i < AudioService.field_h)) {
                  EmailCredentials.field_i = EmailCredentials.field_i + 1;
                }
              }
            } else {
              if (EmailCredentials.field_i < AudioService.field_h) {
                EmailCredentials.field_i = EmailCredentials.field_i + 1;
              }
            }
            var5_int = AudioService.field_h * AudioService.field_h;
            var6 = var5_int - EmailCredentials.field_i * EmailCredentials.field_i;
            var7 = vf.field_e + 120 * var6 / var5_int;
            SentinelDesigner.d(0, var7);
            if (bd.field_b.first(13058) != null) {
              fieldTemp$0 = ob.field_o + 1;
              ob.field_o = ob.field_o + 1;
              if (fieldTemp$0 == 500) {
                ob.field_o = 0;
                bd.field_b.a(true);
              }
            }
          }
          if (param0 != 120) {
            this.m(-19);
          }
          if (GzipDecoder.field_g == -3) {
            lc.field_c = null;
            var3 = GrowableIntList.field_l;
            var4_ref_String__ = new String[]{var3};
            var5_array = new int[var4_ref_String__.length][];
            var5_array[0] = uc.field_b;
            var6 = 1;
            while (true) {
              if (var6 < var4_ref_String__.length) {
                var5_array[var6] = uc.field_b;
                var6++;
                if (var8 == 0) {
                  continue;
                }
              } else {
                var6 = 0;
              }
              break;
            }
            var7 = di.field_g;
            switch ((var8 == 0
              || var7 == -1
              || var7 == 0
              || var7 == 1
              || var7 == 3
              || var7 == 5
              || var7 == 7
              || var7 == 10
              ) ? var7 : -2) {
              case 0:
                var5_array[0] = ReflectionCheck.field_v;
                var6 = 16;
                if (var8 == 0) {
                  break;
                }
              case 1:
                var5_array[0] = ReflectionCheck.field_v;
                var6 = 16;
                if (var8 == 0) {
                  break;
                }
              case 7:
                var6 = 16;
                if (var8 == 0) {
                  break;
                }
              case 4:
                var6 = 16;
                if (var8 == 0) {
                  break;
                }
              case 3:
              case 5:
                var5_array[0] = ReflectionCheck.field_C[QuickChatHelpDialog.field_Ub + 10 * DirectByteStorage.field_j];
                var6 = 16;
                if (var8 == 0) {
                  break;
                }
              case 10:
                var6 = ReflectionCheck.field_t[10 * DirectByteStorage.field_j + QuickChatHelpDialog.field_Ub][1];
                var5_array[0] = ReflectionCheck.field_C[QuickChatHelpDialog.field_Ub + DirectByteStorage.field_j * 10];
                if (var8 == 0) {
                  break;
                }
              case -1:
                var6 = 0;
              default:
                break;
            }
            TextHotspotRegion.field_v = false;
            jn.field_g = false;
            stackIn_251_0 = null;
            stackIn_251_1 = null;
            stackIn_251_2 = false;
            stackIn_251_3 = var6;
            stackIn_251_4 = 1;
            stackIn_251_5 = var4_ref_String__;
            stackIn_251_6 = 0;
            stackIn_251_7 = false;
            stackIn_251_8 = var5_array;
            if (-1 != di.field_g) {
              stackIn_252_0 = null;
              stackIn_252_1 = null;
              stackIn_252_9 = 0;
            } else {
              stackIn_252_0 = null;
              stackIn_252_1 = null;
              stackIn_252_9 = 3;
            }
            BoundedUrlRequest.field_i = new GameplayController(stackIn_251_2, stackIn_251_3, stackIn_251_4, stackIn_251_5, stackIn_251_6, stackIn_251_7, stackIn_251_8, stackIn_252_9, 2, false, false);
            var7 = ArticulatedPart.field_B ? 1 : 0;
            IterableNodeHashTable.a(-1, var7 != 0, -1, 0);
            Sprite.field_k = true;
          }
          if (-4 == GzipDecoder.field_g) {
            mm.field_g.writeCipheredOpcode(63, (byte) -117);
            mm.field_g.position = mm.field_g.position + 1;
            var3_int = mm.field_g.position;
            mm.field_g.writeByte((byte) 124, uc.field_b.length);
            var4 = 0;
            while (true) {
              if (var4 < uc.field_b.length) {
                mm.field_g.writeByte((byte) 127, uc.field_b[var4]);
                var4++;
                if (var8 == 0) {
                  continue;
                }
              } else {
                mm.field_g.backpatchByteLength((byte) 111, mm.field_g.position - var3_int);
                mm.field_g.writeCipheredOpcode(9, (byte) -117);
                SectorCacheStore.field_n = true;
                GzipDecoder.field_g = LoginForm.field_T;
              }
              break;
            }
            EmailCredentials.field_i = AudioService.field_h;
          }
          if (GzipDecoder.field_g == -5) {
            na.a((byte) -43, 11, nf.field_b.j(-26));
            TextLayout.field_d = true;
            GzipDecoder.field_g = LoginForm.field_T;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3_ref), "SteelSentinels.SA(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0) {
        RuntimeException runtimeException = null;
        MidiPcmStream var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(14, false, 5000, 71, 1, 0, 4, 2);
          var2 = new MidiPcmStream();
          var2.b(128, (byte) -123, 9);
          qm.a(-31, IterableDualNodeDeque.field_i, 22050, var2, true, (java.awt.Component) ((Object) sl.field_n));
          this.a(1, true, true, false, true, true, false);
          ad.field_d = FunOrbClient.field_s;
          HuffmanDecoder.field_b = pl.field_ab;
          SocketJs5Transport.field_B[66] = 1;
          SocketJs5Transport.field_B[61] = 1;
          SocketJs5Transport.field_B[67] = 32;
          NanoTickClock.field_x = MarkerSliderPainter.field_j;
          if (param0 != 26689) {
            this.c(-47);
          }
          SocketJs5Transport.field_B[57] = -2;
          SocketJs5Transport.field_B[71] = 12;
          SocketJs5Transport.field_B[72] = 2;
          SocketJs5Transport.field_B[78] = -1;
          uc.field_b = ReflectionCheck.field_x;
          fc.field_b = SectorCacheStore.field_o;
          SocketJs5Transport.field_B[80] = 2;
          SocketJs5Transport.field_B[70] = 1;
          SocketJs5Transport.field_B[76] = 5;
          SocketJs5Transport.field_B[73] = 21;
          SocketJs5Transport.field_B[58] = -2;
          SocketJs5Transport.field_B[63] = 1;
          SocketJs5Transport.field_B[77] = -1;
          QuickChatHelpDialog.field_cc = te.field_a;
          ja.field_b = DiskCacheWorker.field_h;
          SocketJs5Transport.field_B[60] = -1;
          SocketJs5Transport.field_B[74] = 1;
          SocketJs5Transport.field_B[64] = 1;
          in.field_b = uc.field_h;
          SocketJs5Transport.field_B[65] = 1;
          SocketJs5Transport.field_B[62] = 4;
          SocketJs5Transport.field_B[69] = 19;
          SocketJs5Transport.field_B[79] = 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "SteelSentinels.W(" + param0 + ')');
        }
    }

    public SteelSentinels() {
    }

    final void c(int param0) {
        int[] array$0 = null;
        int stackIn_13_1 = 0;
        boolean stackIn_14_2 = false;
        boolean stackIn_77_1 = false;
        int stackIn_278_0 = 0;
        int stackIn_330_0 = 0;
        int stackIn_334_0 = 0;
        int stackIn_338_0 = 0;
        int stackIn_340_0 = 0;
        int stackIn_340_1 = 0;
        int stackIn_351_0 = 0;
        int stackIn_440_0 = 0;
        int stackIn_440_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        Object var3_ref = null;
        Object var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        SentinelCommand var5_ref_je = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        SentinelCommand var10_ref = null;
        int var11_int = 0;
        Sentinel var11 = null;
        int[][] var12 = null;
        int var13_int = 0;
        GameplayController var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = obfuscationControl;
        try {
          SoundCache.b(-108);
          ScrollContainer.field_Vb = DateInputWidget.a((byte) -86);
          Js5Transport.a(false);
          if (wb.field_c != null &&
            wb.field_c.field_b) {
            SoundCache.c(param0 - 2);
            og.a(-5213);
          }
          if (param0 != 2) {
            this.init();
          }
          stackIn_13_1 = 5;
          stackIn_14_2 = (wb.field_c != null);
          this.a(stackIn_13_1, stackIn_14_2);
          if (MenuInputState.field_f) {
            this.m(105);
            MenuInputState.field_f = false;
          }
          MouseWheelInput.field_c = MouseWheelInput.field_c + 1;
          if (QuickChatHelpDialog.j(0)) {
            this.k(113);
            if (QuickChatHelpDialog.j(0)) {
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (SceneWidget.field_pb) {
            if (QuickChatCategoryCache.a(false)) {
              if (QuickChatMenu.b(true)) {
                if (in.field_i == in.field_h) {
                  var2_int = eh.a(0);
                  switch (var2_int) {
                    case 2:
                      SoundCache.c(0);
                    default:
                      break;
                    case 4:
                      CachedTextLayout.field_y = true;
                      DebouncedValidator.a(0, ValidationIndicator.field_bb, param0 + 8);
                      if (var15 == 0) {
                        break;
                      }
                    case 3:
                      CachedTextLayout.field_y = false;
                      GradientOutlineTextPainter.a(-4, true);
                      break;
                  }
                  this.b(param0 + 118, true);
                  decompiledFrameRemainder0 = (var15 != 0);
                }
                if (decompiledFrameRemainder0) {
                  this.b(param0 + 118, false);
                  decompiledFrameRemainder0 = (var15 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (!cf.c((byte) 100)) {
                  if (!ri.b(-121)) {
                    this.b(120, false);
                    decompiledFrameRemainder0 = (var15 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (in.field_i == in.field_h) {
                      var2_int = rn.c((byte) 90);
                      if (var2_int == 1) {
                        ArchiveRequest.field_E = true;
                        DebouncedValidator.a(0, pl.field_Q, param0 + 8);
                      }
                      this.b(param0 + 118, true);
                      decompiledFrameRemainder0 = (var15 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      this.b(param0 + 118, false);
                      decompiledFrameRemainder0 = (var15 != 0);
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  stackIn_77_1 = (null != wb.field_c);
                  var2_int = this.a(stackIn_77_1, -3836);
                  if (var2_int == 1 ||
                    var2_int == 2) {
                    if (wb.field_c != null) {
                      SoundCache.c(0);
                    }
                    if (var2_int == 2) {
                      t.a(true, Projectile.d((byte) -21));
                    }
                  }
                  this.b(120, true);
                  if (var15 != 0) {
                    ai.d(param0 + 103);
                    ProxySocketConnector.a(jj.field_d, (byte) 104);
                    if (this.k((byte) -52)) {
                      SceneWidget.field_pb = true;
                    }
                  }
                }
              }
            } else {
              ai.d(param0 + 103);
              if (var15 != 0) {
                ProxySocketConnector.a(jj.field_d, (byte) 104);
                if (this.k((byte) -52)) {
                  SceneWidget.field_pb = true;
                }
              }
            }
          } else {
            ProxySocketConnector.a(jj.field_d, (byte) 104);
            if (this.k((byte) -52)) {
              SceneWidget.field_pb = true;
            }
          }
          if (!ni.b(92)) {
            do {
              var2 = (cf) (un.field_b.a(true));
              if (var2 == null) {
                if (var15 == 0) {
                  break;
                }
              } else {
                ProxySocketConnector.a(4, (byte) 123, (cf) (var2));
              }
            } while (var15 == 0);
          }
          if (!ni.b(74) &&
            Explosion.field_P != 0) {
            ef.a((byte) -109);
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!rl.a((byte) 54, SocketJs5Transport.field_B)))) {
            stackIn_440_0 = ch.field_N;
            stackIn_440_1 = 9;
            if (var15 == 0) {
              if (stackIn_440_0 == stackIn_440_1) {
                QuickChatHelpDialog.b(true);
                GzipDecoder.field_g = 11;
                SectorCacheStore.field_n = false;
                UiTheme.field_s = rf.field_d.h(1);
                continue;
              }
              if (ch.field_N == 14) {
                QuickChatHelpDialog.b(true);
                jj.field_i = nf.a(uc.field_b, DraggableWidget.field_G, (byte) 44);
                DelayedServerPacket.field_w[1] = (byte) 0;
                if ((jj.field_i & SectorCacheStore.field_o[1][DelayedServerPacket.field_w[1]]) == 0) {
                  DelayedServerPacket.field_w[1] = (byte) 1;
                  if (rd.field_b > 0) {
                    DelayedServerPacket.field_w[1] = (byte) 2;
                  }
                }
                if (DelayedServerPacket.field_w[1] == 0) {
                  DebouncedValidator.field_b[0] = 4;
                }
                if (1 == DelayedServerPacket.field_w[1]) {
                  DebouncedValidator.field_b[0] = 6;
                }
                if (DelayedServerPacket.field_w[1] == 2) {
                  DebouncedValidator.field_b[0] = 12;
                }
                BufferedSocket.a(DirectByteStorage.a(2000, (byte) -32), DialWidget.field_db.length, tm.a((byte) 50), 1024, DirectByteStorage.a(12, (byte) -32), AccountTermsPanel.a((byte) -127), ImageProducerRasterBuffer.field_u, (byte) -22, MidiPcmStream.f(3443), 150);
                Bzip2State.a((byte) -98, tc.d(800), wn.b((byte) 121));
                SectorCacheStore.field_n = false;
                GzipDecoder.field_g = -2;
                WeightedCacheEntry.field_H = true;
                continue;
              }
              if (ch.field_N == 15) {
                if (WeightedCacheEntry.field_H) {
                  QuickChatHelpDialog.b(true);
                  TextButton.f(param0 ^ -12163);
                  IsaacRandom.b((byte) 124);
                  Sprite.field_k = false;
                  ob.field_y = false;
                  GzipDecoder.field_g = 0;
                  NodeIterator.field_d = true;
                  CombatWorld.field_G = false;
                  WeightedCacheEntry.field_H = false;
                  lc.field_e = true;
                  DateOfBirthValidator.c(103);
                }
                TextLayout.field_d = false;
                SectorCacheStore.field_n = false;
                continue;
              }
              if (ch.field_N == 10 &&
                WeightedCacheEntry.field_H) {
                in.a(11247);
                continue;
              }
              if (ch.field_N == 80) {
                var2_int = rf.field_d.readUnsignedByte((byte) -123);
                var3 = (byte)(255 & rf.field_d.readUnsignedByte((byte) -123));
                if (null == nf.field_b) {
                  continue;
                }
                if (0 != var2_int) {
                  nf.field_b.field_Sb[var2_int] = (byte) var3;
                  continue;
                }
                nf.field_b.field_Ub = var3;
                DebouncedValidator.field_b[0] = var3;
                continue;
              }
              if (ch.field_N == 11) {
                var2 = eb.$cfr$intArgs$a$9d0e4b5217c4(-62, false);
                WeightedCacheEntry.a((na) (var2), -92);
                if (HuffmanDecoder.field_a != 1) {
                  continue;
                }
                if (BoundedUrlRequest.field_i == null) {
                  continue;
                }
                if (ph.field_e == null) {
                  continue;
                }
                var3_ref = "";
                if (null != DialWidgetPainter.field_g) {
                  var4_ref = DialWidgetPainter.field_g;
                  if (be.field_b == 1) {
                    var4_ref = "<img=0>" + (String) (var4_ref);
                  }
                  if (2 == be.field_b) {
                    var4_ref = "<img=1>" + (String) (var4_ref);
                  }
                  var3_ref = (String) (var4_ref) + ": ";
                }
                var4_ref = (String) (var3_ref) + BitmapFont.escapeMarkup(WeightedCacheEntry.field_F);
                if (((na) (var2)).field_g ||
                  !o.a(-122, ((na) (var2)).field_p)) {
                  LinkButtonPainter.a(48127, (String) (var4_ref), (byte) 124);
                  ln.field_e = ln.field_e - 1;
                }
                continue;
              }
              if (ch.field_N == 12) {
                eb.$cfr$intArgs$a$9d0e4b5217c4(-127, true);
                WeightedCacheEntry.a(new na(true), -93);
                continue;
              }
              if (ch.field_N == 67) {
                var2 = ViewportController.a(true);
                var3 = 0;
                while (var3 < java.lang.reflect.Array.getLength(var2)) {
                  ((int[]) (var2))[var3] = rf.field_d.readInt(0);
                  var3++;
                }
                var3_ref = var2;
                var4_ref = DirectByteStorage.field_m;
                var5 = 0;
                while (var5 < 8) {
                  ((int[]) (var3_ref))[var5] = ec.a(((int[]) (var3_ref))[var5], ~((int[]) (var4_ref))[var5]);
                  var5++;
                }
                if (ln.field_h) {
                  var3_ref = ce.field_t;
                  var4_ref = var2;
                  var5 = 0;
                  while (var5 < 8) {
                    ((int[]) (var3_ref))[var5] = DateOfBirthValidator.a(((int[]) (var3_ref))[var5], ((int[]) (var4_ref))[var5]);
                    var5++;
                  }
                }
                var3_ref = DirectByteStorage.field_m;
                var4_ref = var2;
                var5 = 0;
                while (var5 < 8) {
                  ((int[]) (var3_ref))[var5] = DateOfBirthValidator.a(((int[]) (var3_ref))[var5], ((int[]) (var4_ref))[var5]);
                  var5++;
                }
                Projectile.c((byte) 10);
                continue;
              }
              if (ch.field_N == 60) {
                PasswordFieldPainter.field_v = rf.field_d.readInt(0);
                DraggableWidget.field_G = rf.field_d.readInt(0);
                var2_int = 0;
                while (var2_int < 4) {
                  rn.field_D[var2_int] = rf.field_d.readInt(0);
                  var2_int++;
                }
                var2_int = 0;
                while (2 > var2_int) {
                  ArchiveRequest.field_D[var2_int] = rf.field_d.readInt(0);
                  var2_int++;
                }
                var2_int = 0;
                while (var2_int < va.field_k.length) {
                  va.field_k[var2_int] = 0;
                  var2_int++;
                }
                DateOfBirthValidator.d(-30);
                continue;
              }
              if (ch.field_N == 77) {
                var2_int = rf.field_d.readUnsignedByte((byte) -123);
                CombatWorld.field_S = new int[var2_int];
                var3 = 0;
                while (var2_int > var3) {
                  CombatWorld.field_S[var3] = rf.field_d.readUnsignedByte((byte) -123);
                  var3++;
                }
                continue;
              }
              if (ch.field_N == 78) {
                var2_int = 0;
                while (var2_int < 3) {
                  fm.field_f[var2_int] = rf.field_d.readUnsignedByte((byte) -65);
                  var2_int++;
                }
                var2_int = 0;
                while (true) {
                  if (jh.field_a.length > var2_int) {
                    jh.field_a[var2_int] = rf.field_d.readUnsignedShort((byte) -60);
                    var2_int++;
                    continue;
                  }
                  break;
                }
                if ((16 & fm.field_f[0]) != 0) {
                  stackIn_278_0 = 1;
                } else {
                  stackIn_278_0 = 0;
                }
                var2_int = stackIn_278_0;
                fm.field_f[0] = ec.a(fm.field_f[0], 15);
                if (fj.field_d <= fm.field_f[0]) {
                  if (var2_int == 0) {
                    NodeIterator.field_f = 1;
                  } else {
                    NodeIterator.field_f = 2;
                  }
                } else {
                  NodeIterator.field_f = 0;
                }
                if (!PacketBuffer.h((byte) -79)) {
                  continue;
                }
                km.field_a = CombatWorld.field_k;
                continue;
              }
              if (ch.field_N == 73) {
                var2_int = rf.field_d.readUnsignedByte((byte) -63) - 1;
                var3 = rf.field_d.readInt(0);
                var4 = rf.field_d.readInt(0);
                var5 = rf.field_d.readInt(0);
                var6 = rf.field_d.readInt(0);
                var7 = rf.field_d.readInt(0);
                if (var2_int < 2) {
                  lc.field_c = tj.a(var6, var4, var5, -var2_int + 65535, var7, param0 ^ 19, var2_int + 0, new int[]{var3}, 3);
                }
                qi.field_d = null;
                qm.a(true);
                bd.field_b.addLast(3, new ai((RgbSprite) null, SocketConnector.a(PasswordValidator.field_q, param0 - 102, new String[]{Integer.toString(var3 / 516)})));
                continue;
              }
              if (ch.field_N == 72) {
                var2_int = rf.field_d.readUnsignedShort((byte) -60);
                PasswordFieldPainter.field_v = PasswordFieldPainter.field_v + var2_int;
                if (var2_int <= 0) {
                  continue;
                }
                DateOfBirthValidator.d(param0 - 44);
                MusicPatchNode.field_F = var2_int;
                continue;
              }
              if (ch.field_N == 74 ||
                79 == ch.field_N) {
                var2_int = rf.field_d.readUnsignedByte((byte) -113);
                var3_ref = MarkerSliderPainter.field_o;
                if (79 == ch.field_N) {
                  var3_ref = c.field_r;
                }
                bd.field_b.addLast(3, new ai((RgbSprite) null, SocketConnector.a((String) (var3_ref), -105, new String[]{t.field_e[var2_int]})));
                continue;
              }
              if (ch.field_N == 70) {
                rf.field_d.readUnsignedByte((byte) -67);
                continue;
              }
              if (ch.field_N == 57 ||
                ch.field_N == 58) {
                QuickChatHelpDialog.b(true);
                var2_int = rf.field_d.readInt(param0 - 2);
                var3 = rf.field_d.readUnsignedByte((byte) -110);
                var4 = rf.field_d.readUnsignedByte((byte) -74);
                var5 = rf.field_d.readUnsignedByte((byte) -90);
                var6 = rf.field_d.readUnsignedByte((byte) -102);
                stackIn_330_0 = ((var6 & 1) == 0) ? 0 : 1;
                var7 = stackIn_330_0;
                stackIn_334_0 = ((2 & var6) == 0) ? 0 : 1;
                var8 = stackIn_334_0;
                stackIn_338_0 = (0 == rf.field_d.readUnsignedByte((byte) -81)) ? 0 : 1;
                var9 = stackIn_338_0;
                var10 = new String[rf.field_d.readUnsignedByte((byte) -90)];
                var11_int = -2;
                var12 = new int[var10.length][];
                var13_int = 0;
                while (true) {
                  stackIn_340_0 = ~var13_int;
                  stackIn_340_1 = ~var10.length;
                  if (stackIn_340_0 > stackIn_340_1) {
                    var10[var13_int] = rf.field_d.e((byte) 126);
                    array$0 = new int[rf.field_d.readUnsignedByte((byte) -63)];
                    var12[var13_int] = array$0;
                    stackIn_351_0 = 0;
                    var14 = stackIn_351_0;
                    while (var14 < var12[var13_int].length) {
                      var12[var13_int][var14] = rf.field_d.readUnsignedByte((byte) -123);
                      stackIn_340_0 = ~var12[var13_int][var14];
                      stackIn_340_1 = -256;
                      if (stackIn_340_0 == stackIn_340_1) {
                        var12[var13_int][var14] = -1;
                      }
                      var14++;
                    }
                    var13_int++;
                    continue;
                  }
                  break;
                }
                var11_int = rf.field_d.readByte((byte) -2);
                di.field_g = -1;
                IconTextComponent.field_Yb = -2;
                jn.field_g = false;
                TextHotspotRegion.field_v = false;
                lc.field_c = null;
                stackIn_351_0 = -1;
                if (stackIn_351_0 == var11_int) {
                  var11_int = -2;
                }
                var13 = new GameplayController(true, var2_int, var3, var10, var11_int, var9 != 0, var12, var4, var5, var7 != 0, var8 != 0);
                var13.field_w = rf.field_d.readInt(0);
                if (57 != ch.field_N) {
                  CachedTextLayout.field_A = var13;
                  CombatWorld.field_G = true;
                  QuickChatHelpDialog.l(0);
                } else {
                  BoundedUrlRequest.field_i = var13;
                  ob.field_y = true;
                  in.c(2);
                  DraggableWidget.i(-1);
                  QuickChatHelpDialog.l(0);
                }
                GzipDecoder.field_g = -1;
                TextLayout.field_d = false;
                Sprite.field_k = true;
                continue;
              }
              if (ch.field_N == 59) {
                if (ob.field_y ||
                  CombatWorld.field_G) {
                  QuickChatHelpDialog.b(true);
                  if (ob.field_y) {
                    BoundedUrlRequest.field_i.a((byte) -128, false);
                  }
                  lc.field_e = true;
                  GzipDecoder.field_g = -2;
                  CombatWorld.field_G = false;
                  ob.field_y = false;
                  Sprite.field_k = false;
                  TextHotspotRegion.field_v = true;
                  ln.field_e = 0;
                  DateOfBirthValidator.c(104);
                }
                TextLayout.field_d = false;
                continue;
              }
              var2 = null;
              if (!ob.field_y) {
                if (CombatWorld.field_G) {
                  var2 = CachedTextLayout.field_A;
                }
              } else {
                var2 = BoundedUrlRequest.field_i;
              }
              if (null != var2) {
                if (ch.field_N == 61) {
                  var3 = rf.field_d.readUnsignedByte((byte) -117);
                  var4_ref = ((GameplayController) (var2)).world.findSentinelForPlayer(var3, -128);
                  var5_ref_je = (SentinelCommand) (((Sentinel) (var4_ref)).secondaryCommands.b(1063677678));
                  if (var5_ref_je != null) {
                    var5_ref_je.unlink(param0 ^ 6);
                  }
                  var5_ref_je = (SentinelCommand) (((Sentinel) (var4_ref)).pendingCommands.b(1063677678));
                  if (var5_ref_je == null) {
                    continue;
                  }
                  var5_ref_je.unlink(4);
                  continue;
                }
                if (ch.field_N == 69) {
                  var3 = rf.field_d.readUnsignedByte((byte) -85);
                  var4 = rf.field_d.readUnsignedByte((byte) -80);
                  var5 = rf.field_d.readUnsignedByte((byte) -120);
                  var6 = rf.field_d.readInt(0);
                  var7 = rf.field_d.readInt(0);
                  var8 = rf.field_d.readInt(param0 ^ 2);
                  var9 = rf.field_d.readInt(param0 ^ 2);
                  if (var5 == 255) {
                    var5 = -1;
                  }
                  var10_ref = new SentinelCommand(var4, var5, var6);
                  var10_ref.aimAngle = var9;
                  var10_ref.targetWorldX = var7;
                  var10_ref.targetWorldY = var8;
                  var11 = ((GameplayController) (var2)).world.findSentinelForPlayer(var3, -128);
                  if (var4 == 10) {
                  }
                  if (null == var11) {
                    continue;
                  }
                  var11.scheduleCommand((byte) 79, var10_ref);
                  continue;
                }
                if (ch.field_N == 76) {
                  var3 = rf.field_d.readUnsignedByte((byte) -120);
                  var4 = rf.field_d.readInt(0);
                  ((GameplayController) (var2)).world.a(var4, 28669, var3);
                  continue;
                }
                if (ch.field_N == 71) {
                  if (((GameplayController) (var2)).field_i - 100 > ((GameplayController) (var2)).field_w &&
                    ((GameplayController) (var2)).world.simulationTick < ((GameplayController) (var2)).field_w) {
                    ((GameplayController) (var2)).field_w = -100 + ((GameplayController) (var2)).field_i;
                  }
                  ((GameplayController) (var2)).field_i = rf.field_d.readInt(param0 ^ 2);
                  var3 = rf.field_d.readInt(0);
                  var4 = rf.field_d.readInt(param0 - 2);
                  if (((GameplayController) (var2)).field_l >= ((GameplayController) (var2)).world.simulationTick) {
                    continue;
                  }
                  ((GameplayController) (var2)).field_j = var3;
                  ((GameplayController) (var2)).field_l = var4;
                  continue;
                }
                if (62 == ch.field_N) {
                  ((GameplayController) (var2)).field_i = rf.field_d.readInt(0);
                  ((GameplayController) (var2)).field_z = true;
                  continue;
                }
                if (ch.field_N == 63) {
                  ((GameplayController) (var2)).world.field_V = rf.field_d.readUnsignedByte((byte) -92);
                  if (null == BoundedUrlRequest.field_i) {
                    continue;
                  }
                  in.c(2);
                  continue;
                }
                if (ch.field_N == 64) {
                  ((GameplayController) (var2)).world.field_hb = rf.field_d.readUnsignedByte((byte) -111);
                  continue;
                }
                if (ch.field_N == 65) {
                  ((GameplayController) (var2)).world.field_X = rf.field_d.readUnsignedByte((byte) -91);
                  if (null == BoundedUrlRequest.field_i) {
                    continue;
                  }
                  DraggableWidget.i(-1);
                  continue;
                }
                if (66 == ch.field_N) {
                  ((GameplayController) (var2)).field_N = rf.field_d.readUnsignedByte((byte) -85);
                  if (null == BoundedUrlRequest.field_i) {
                    continue;
                  }
                  DraggableWidget.i(-1);
                  continue;
                }
              }
              this.h(param0 + 50);
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            gj.a(0, 0);
            stackIn_440_0 = -2;
            stackIn_440_1 = LoginForm.field_T;
          }
          if (stackIn_440_0 == stackIn_440_1 &&
            GzipDecoder.field_g == -2) {
            TextHotspotRegion.field_v = true;
          }
          if (TextHotspotRegion.field_v) {
            ln.field_e = 0;
          }
          if (ri.a(16731221)) {
            var2_int = this.i((byte) -112);
            if (0 == var2_int ||
              var2_int == 1) {
              DualNodeDequeIterator.a(2, -26077);
              uc.a(true, 3);
              hk.a((byte) 86, 4);
              vf.a(false, 6);
              ml.a(param0 - 74, 7);
              gm.a((byte) -92);
              if (1 != var2_int) {
                if (WeightedCacheEntry.field_H) {
                  ob.field_y = false;
                  Sprite.field_k = false;
                  CombatWorld.field_G = false;
                  lc.field_e = true;
                  NodeIterator.field_d = true;
                  if (!ob.field_y) {
                    IterableNodeHashTable.a(0, false, param0 - 3, 0);
                    if (var15 != 0) {
                      UiTheme.field_s = rl.field_e;
                      IterableNodeHashTable.a(11, false, -1, 0);
                    }
                  } else {
                    UiTheme.field_s = rl.field_e;
                    IterableNodeHashTable.a(11, false, -1, 0);
                  }
                  QuickChatHelpDialog.b(true);
                  GameKeyHandler.field_e[LoginForm.field_T].a(false, 0, -102);
                  WeightedCacheEntry.field_H = false;
                  DateOfBirthValidator.c(12);
                }
                SectorCacheStore.field_n = false;
                TextLayout.field_d = false;
                if (var15 != 0) {
                  SectorCacheStore.field_n = true;
                  TextLayout.field_d = true;
                }
              } else {
                SectorCacheStore.field_n = true;
                TextLayout.field_d = true;
              }
            }
            var3 = 0;
            if (var2_int == 2) {
              var3 = 1;
            }
            if (WeightedCacheEntry.field_H ||
              SectorCacheStore.field_n ||
              TextLayout.field_d) {
              var3 = 1;
            }
            if (!ri.a(16731221)) {
              var3 = 0;
            }
            if (var3 != 0) {
              of.a(10);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (var2), "SteelSentinels.DA(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          SteelSentinels.j((byte) -10);
          NodeDeque.c((byte) -29);
          wd.a(0);
          hf.a(true);
          fj.a((byte) -120);
          rg.c(125);
          SceneWidget.a(false);
          GameKeyHandler.a((byte) 100);
          uc.a(false);
          ci.a(false);
          am.a(2);
          FunOrbClient.h((byte) -111);
          ClientException.a(false);
          GameApplet.e(48);
          BoundedUrlRequest.a((byte) -64);
          MouseInputHandler.a(true);
          MouseWheelInput.c(72);
          SoftwareRaster.a();
          ResourceArchive.b(false);
          un.a(false);
          if (param0 < 22) {
            this.a(48);
          }
          PacketBuffer.d(-125);
          mm.b(122);
          fl.a(124);
          of.a((byte) 84);
          in.b(127);
          ph.a(80);
          vh.a(-67);
          be.a((byte) -34);
          pa.a((byte) 56);
          ib.a((byte) -119);
          na.a(2);
          im.a((byte) -88);
          wn.a((byte) -126);
          TickClock.b(30);
          RasterBuffer.a(690);
          cj.a(-1);
          FullscreenFocusCanvas.b((byte) 30);
          ViewportController.b((byte) -109);
          MembershipPromotionScreen.a((byte) -82);
          SoundCache.a(94);
          SentinelDesigner.h((byte) -104);
          GameplayController.b(750);
          nd.a(-107);
          hh.a(false);
          Js5Transport.c((byte) -91);
          DiskCacheWorker.b(-1);
          Js5ArchiveManager.a((byte) -35);
          BufferedRandomAccessFile.a(83);
          BufferedSocket.a((byte) -45);
          jn.a((byte) 79);
          IntrusiveNode.c(4433);
          cd.a(false);
          di.a(-1);
          bi.a((byte) 80);
          ik.b(79);
          lc.b(1);
          o.a(-98);
          dj.a((byte) 94);
          LoginCredentials.a(-118);
          CipherPacketBuffer.e(true);
          IsaacRandom.a((byte) -94);
          gj.a(-102);
          tf.a((byte) 26);
          VerticalScrollbar.j(0);
          SceneWidgetNode.c((byte) 93);
          ve.b((byte) -60);
          CombatWorld.g(0);
          ArticulatedPart.d((byte) 20);
          MenuInputState.d((byte) -18);
          SentinelAnimationEditor.c(21841);
          NodeIterator.e(5370);
          BitmapFont.releaseStatics();
          vf.a(-119);
          jh.a(30706);
          ba.a(false);
          SentinelCommand.a((byte) -110);
          Projectile.h(31554);
          Sentinel.c((byte) 58);
          BattleTerrain.b(false);
          MidiPcmStream.a(false);
          NodeHashTable.c(96);
          MusicPatchNode.e(0);
          MidiFileReader.releaseMessageTable();
          MusicPatchPcmStream.e(-93);
          AudioOutput.releaseStatics();
          MusicCrossfadeStream.b(false);
          hk.d((byte) -65);
          dk.b((byte) -91);
          cc.k(102);
          lj.a((byte) 109);
          ArchiveIndex.a(0);
          GzipDecoder.a(-1);
          ArchiveProvider.b(38);
          wi.g(573);
          DualNode.f(8191);
          rd.a(8192);
          eh.b(0);
          ModalStack.f((byte) 127);
          RegistrationRequestDialog.o((byte) -29);
          LoadingProgressDialog.l((byte) -47);
          LoginDialog.m((byte) -111);
          AccountRequestDialog.n((byte) 107);
          AccountRegistrationPanel.a(false);
          AccountChoicePanel.i(-48);
          LoginForm.l(320);
          DisplayNameForm.j(60);
          UiTheme.a(103);
          uj.a(-1);
          VorbisSample.releaseStatics();
          VorbisFloor.releaseStatics();
          dg.a((byte) -84);
          ri.d(0);
          tj.a(true);
          Sprite.a((byte) 66);
          PartInstruction.a((byte) 17);
          ne.g(-23261);
          oc.a(-1);
          qi.a(-104);
          ad.a(0);
          IconLabelControl.j(127);
          dn.b(false);
          SocialListPanel.d((byte) 91);
          dd.a(0);
          ReportAbuseDialog.j(-114);
          oh.a(1);
          HuffmanDecoder.a(64);
          qm.a((byte) 37);
          te.a((byte) -83);
          ak.a(124);
          gm.a(-1);
          gf.b(-111);
          rb.a((byte) -82);
          en.a(true);
          kk.a((byte) -105);
          pl.c(true);
          ai.e(0);
          dc.a(-38);
          DualNodeDeque.b((byte) 26);
          IconTextComponent.j(15);
          uf.a(24);
          nf.a(55);
          QuickChatHelpDialog.k(-16);
          ParticleEffect.h(-185837884);
          ReflectionCheck.a((byte) 115);
          BoundedRandomAccessFile.b(0);
          bd.a(-23333);
          og.a((byte) -88);
          la.a((byte) -112);
          AudioService.a((byte) -63);
          SocketJs5Transport.e(-2);
          Js5NetworkRequest.h(10);
          SectorCacheStore.a(15598);
          DiskCacheRequest.i(-58);
          CachedArchiveProvider.c(2);
          ok.a(true);
          ArchiveRequest.e((byte) 21);
          se.a((byte) -114);
          AccountNoticeDialog.l(0);
          lf.b();
          jj.b(-123);
          pe.a((byte) -117);
          tm.a(5);
          ec.b((byte) 24);
          fc.a(true);
          sa.a(false);
          DelegatingCanvas.b((byte) 61);
          mc.a(23225);
          IntKeyLookup.b((byte) -81);
          ByteStorage.a(false);
          Bzip2Decoder.releaseStatics();
          Bzip2State.a(-120);
          ni.a(42);
          rl.a(0);
          CheckboxPainter.a(true);
          StatefulTextPainter.c(-21121);
          DialWidgetPainter.a(0);
          MarkerSliderPainter.b((byte) 105);
          TextLayout.a(true);
          UiComponent.c((byte) 19);
          TextButton.a((byte) -105);
          SingleChildContainer.g(475);
          ResizableModalPanel.k((byte) 38);
          ModalPanel.h((byte) 127);
          UiContainer.g(-19969);
          qe.a(-31914);
          sh.a(-3274);
          kb.a(5);
          ln.b(0);
          QuickChatMenu.k(-31097);
          QuickChatCategoryCache.a((byte) -13);
          QuickChatPhraseCache.a(272);
          QuickChatCategory.g(1);
          QuickChatPhraseDefinition.g(0);
          WeightedLruCache.a((byte) 127);
          SocketConnector.a(true);
          ProxyAuthenticationException.a(-61);
          NanoTickClock.c(0);
          ImageProducerRasterBuffer.b(65280);
          ed.a((byte) 99);
          vc.b(-13);
          ue.b((byte) -96);
          SynthInstrument.releaseStatics();
          ce.a((byte) 77);
          SentinelCommandSimulator.a((byte) -98);
          Explosion.h(-2107133436);
          WhirlpoolHasher.a((byte) 121);
          qf.a(false);
          TabbedPanel.d((byte) -72);
          AccountNamePrompt.b(true);
          MusicPatch.c((byte) -73);
          MusicPatchEnvelope.a(7);
          LabeledField.f((byte) 67);
          ValidatedTextWidget.i((byte) -108);
          EditableTextWidget.d(true);
          ContentTransitionDialog.l(-12930);
          StripedProgressBar.g(-47);
          NameSuggestionsPanel.a((byte) -42);
          TextHotspotWidget.c(false);
          ValidationIndicator.h(-30289);
          ValidationHelpWidget.h(-3413);
          Checkbox.g(108);
          TextFieldValidator.c((byte) 103);
          wb.a((byte) 87);
          AccountTermsPanel.a(false);
          DialWidget.f((byte) -122);
          MarkerSlider.g(32);
          cl.a(5);
          DateOfBirthValidator.d(false);
          NumericDateInputWidget.l(0);
          ch.a((byte) -68);
          DateInputWidget.c(true);
          CachedTextLayout.a(24);
          DirectByteStorage.b(26);
          GrowableIntList.a(122);
          DraggableWidget.h(0);
          DropTargetWidget.h(12);
          IterableNodeHashTable.a((byte) -127);
          IterableDualNodeDeque.a(true);
          WeightedCacheEntry.g(-1008);
          fm.a(4314);
          StrongCacheEntry.i(124);
          ProxySocketConnector.c((byte) -117);
          AudioFilter.releaseStatics();
          va.a(false);
          NodeHashTableIterator.a((byte) 22);
          DualNodeDequeIterator.a((byte) 46);
          kf.d(90);
          tc.a(false);
          hg.a(108);
          ud.d(20000000);
          pc.f(100);
          jm.d(-89);
          ThreeSliceButtonPainter.b(100);
          LinkButtonPainter.a(false);
          GradientOutlineTextPainter.b(9);
          PasswordFieldPainter.d(-30874);
          SpriteCheckboxPainter.a((byte) -86);
          AlphaContainer.h(-13);
          SocialListEntry.b(false);
          sl.a(-104);
          hl.e(0);
          cf.a((byte) 9);
          c.a((byte) 127);
          rh.b(false);
          dm.a(-127);
          rf.c(126);
          DelayedServerPacket.d(-1341);
          LoginMethod.a(7);
          UsernameCredentials.b((byte) -119);
          AlternateUsernameCredentials.c(28873);
          EmailCredentials.b((byte) -116);
          sf.a(false);
          ml.a(107);
          e.a((byte) -89);
          AccountMessagePanel.a((byte) -90);
          RasterSnapshot.d(-1);
          km.a((byte) -27);
          t.a(-13375);
          hm.a((byte) 105);
          ob.d(18601);
          rn.d(3);
          WidgetStyleLayer.b((byte) 12);
          TextLayoutLine.c(-58);
          NameAvailabilityValidator.c(1);
          PasswordValidator.d((byte) -128);
          ih.c(18384);
          EmailAvailabilityValidator.d((byte) 116);
          eb.c(81);
          MatchingTextValidator.d((byte) -113);
          ja.a(true);
          TextHotspotRegion.a((byte) 29);
          vd.b((byte) 56);
          DebouncedValidator.c(true);
          ef.b(8421504);
          this.field_t = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "SteelSentinels.V(" + param0 + ')');
        }
    }

    static {
        field_I = "SPAWN DRONES";
        field_H = "Allow spectators?";
    }
}
