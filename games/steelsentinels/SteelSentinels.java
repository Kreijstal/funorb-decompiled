/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class SteelSentinels extends FunOrbClient {
    static String field_H;
    static String field_I;
    static SceneWidget field_J;
    public static int obfuscationControl;

    final void renderClient(byte param0) {
        int stackIn_134_0 = 0;
        boolean stackIn_135_1 = false;
        RuntimeException decompiledCaughtException = null;
        java.awt.Canvas var2 = null;
        RuntimeException var2_ref = null;
        SceneWidget var3 = null;
        NotificationMessage var3_ref = null;
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
          var2 = NanoTickClock.getActiveCanvas(false);
          if (QuickChatHelpDialog.shouldShowBootstrapLoadingScreen(0)) {
            DiskCacheRequest.renderStartupScreen(-111, var2, ParticleEffect.hasInputFocus(2));
            return;
          }
          if (!SceneWidget.field_pb) {
            LoadingScreenHelpers.drawLoadingScreen(var2, -28003);
            return;
          }
          if (!QuickChatCategoryCache.isPlayerDataReady(false)) {
            LoadingCaptionHelpers.setLoadingProgress(SentinelAnimationEditor.field_i, 100.0f, -21801);
            LoadingScreenHelpers.drawLoadingScreen(var2, -28003);
            return;
          }
          boolean decompiledFrameRemainder1 = true;
          this.loadGameGraphics(53);
          if (LoginForm.field_T != GzipDecoder.field_g) {
            if (LoginForm.field_T != 0) {
              if (GzipDecoder.field_g == 0) {
                AudioService.drawScreen(LoginForm.field_T, PlayingSound.field_w, false, 125);
                AudioService.drawScreen(GzipDecoder.field_g, PlayingSound.field_w, false, -40);
                decompiledFrameRemainder1 = (var13 != 0);
              }
              if (decompiledFrameRemainder1) {
                if (LoginForm.field_U >= 10) {
                  AudioService.drawScreen(GzipDecoder.field_g, Sprite.field_k, false, 86);
                  if (var13 != 0) {
                    AudioService.drawScreen(LoginForm.field_T, PlayingSound.field_w, false, -110);
                    AudioService.drawScreen(GzipDecoder.field_g, PlayingSound.field_w, false, -62);
                    AudioService.drawScreen(LoginForm.field_T, PlayingSound.field_w, false, -34);
                    AudioService.drawScreen(LoginForm.field_T, PlayingSound.field_w, true, -15);
                  }
                } else {
                  AudioService.drawScreen(LoginForm.field_T, PlayingSound.field_w, false, -110);
                  if (var13 != 0) {
                    AudioService.drawScreen(GzipDecoder.field_g, PlayingSound.field_w, false, -62);
                    AudioService.drawScreen(LoginForm.field_T, PlayingSound.field_w, false, -34);
                    AudioService.drawScreen(LoginForm.field_T, PlayingSound.field_w, true, -15);
                  }
                }
              }
            } else {
              AudioService.drawScreen(GzipDecoder.field_g, PlayingSound.field_w, false, -62);
              AudioService.drawScreen(LoginForm.field_T, PlayingSound.field_w, false, -34);
              if (var13 != 0) {
                AudioService.drawScreen(LoginForm.field_T, PlayingSound.field_w, true, -15);
              }
            }
          } else {
            AudioService.drawScreen(LoginForm.field_T, PlayingSound.field_w, true, -15);
          }
          if (!PlayingSound.field_w ||
            !Sprite.field_k) {
            boolean decompiledFrameCompleted0 = true;
            TextLayout.drawLobbyAndChatPanels(PasswordFieldPainter.isFeatureAllowed(8), 25104);
            if (LoginForm.field_T == -2) {
              var3 = PendingIntArrayRequest.getActiveOverlayWidget((byte) -66);
              if (var3 != null) {
                regionExit1: {
                  boolean decompiledFrameCompleted1 = true;
                  var4 = var3.field_Rb;
                  var5_int = var3.field_cb;
                  SoftwareRaster.setClip(var4 + 4, 4 + var5_int + 42, var3.field_Rb - 4 + var3.field_zb, var3.field_cb + (-4 + var3.field_Lb));
                  if (null == EmailSyntaxValidator.field_s ||
                    SoundAndUrlHelpers.field_e[101]) {
                    OptionMaskHelpers.field_g = -1;
                    EmailSyntaxValidator.field_s = new CombatWorld(-1, 1, new String[]{}, new int[][]{null}, false, 0, 0, 2, false, false);
                    EmailSyntaxValidator.field_s.computerPlayerCount = 2;
                    if (var13 == 0) {
                      break regionExit1;
                    }
                  }
                  var6_ref_ee = EmailSyntaxValidator.field_s;
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
                    var10.applyTeamColours(-28033);
                    var10.velocityY = 1000;
                    var10.field_Qb = 250;
                    var10.chooseSpawnX(-5);
                    var6_ref_ee.sentinels.addLast(3, var10);
                  }
                  var8 = 310;
                  var9 = (Sentinel) (var6_ref_ee.sentinels.first(13058));
                  while (null != var9) {
                    var9.hitTestAtPointer((byte) -22, var7, LobbySetupHelpers.field_f, DelegatingCanvas.field_c, var8);
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
                          var9_ref2.drawProjectile(var8, var7, 4);
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
                  SoftwareRaster.resetClip();
                }
              }
            }
            if (decompiledFrameCompleted0) {
              ProxySocketConnector.drawOverlayDialogs(false, PasswordFieldPainter.isFeatureAllowed(8));
            }
            ClientErrorSupport.updateOverlays(PasswordFieldPainter.isFeatureAllowed(8), (byte) -62);
          }
          var3_ref = (NotificationMessage) (SolidSpriteHelpers.field_b.first(13058));
          if (var3_ref != null) {
            var4Lifetime1 = 6;
            var5_intLifetime1 = 250;
            var6 = var4Lifetime1 * 2 + 64;
            var7Lifetime1 = 0;
            if (PendingPackedReply.field_o < var6) {
              var7Lifetime1 = var7Lifetime1 + (PendingPackedReply.field_o - var6);
            }
            var8Lifetime1 = -var5_intLifetime1 + 640;
            if ((500 - var6) < PendingPackedReply.field_o) {
              var7Lifetime1 = var7Lifetime1 + (500 + (-PendingPackedReply.field_o - var6));
            }
            SoftwareRaster.fillRectangleBlended(var8Lifetime1, var7Lifetime1, var5_intLifetime1, var6, 0, 192);
            SoftwareRaster.drawRectangleOutlineAlpha(var8Lifetime1, var7Lifetime1, var5_intLifetime1, var6, 39398, 192);
            if (var3_ref.field_q == null) {
              ValidationHelpWidget.field_lb.drawParagraph(var3_ref.field_u, var8Lifetime1 + var4Lifetime1, var7Lifetime1 + var4Lifetime1, -(2 * var4Lifetime1) + var5_intLifetime1, -(2 * var4Lifetime1) + var6, 52479, -1, 0, 1, 12);
              if (var13 != 0) {
                var3_ref.field_q.drawScaled(var8Lifetime1 + var4Lifetime1, var7Lifetime1 + var4Lifetime1, 64, 64);
                ValidationHelpWidget.field_lb.drawParagraph(var3_ref.field_u, var4Lifetime1 * 2 + var8Lifetime1 + 64, var7Lifetime1 + var4Lifetime1, -64 + (var5_intLifetime1 - var4Lifetime1 * 3), var6 - var4Lifetime1 * 2, 52479, -1, 0, 1, 12);
              }
            } else {
              var3_ref.field_q.drawScaled(var8Lifetime1 + var4Lifetime1, var7Lifetime1 + var4Lifetime1, 64, 64);
              ValidationHelpWidget.field_lb.drawParagraph(var3_ref.field_u, var4Lifetime1 * 2 + var8Lifetime1 + 64, var7Lifetime1 + var4Lifetime1, -64 + (var5_intLifetime1 - var4Lifetime1 * 3), var6 - var4Lifetime1 * 2, 52479, -1, 0, 1, 12);
            }
          }
          boolean decompiledFrameRemainder0 = true;
          var4Lifetime2 = 27 / ((param0 - 56) / 48);
          if (QuickChatMenu.isLegacyMenuOpen(true)) {
            SoftwareRaster.halveBrightnessRectangle(0, 0, SoftwareRaster.field_c, SoftwareRaster.field_j);
            RankingAndRasterHelpers.drawPopupMenuWithFrame(100);
            decompiledFrameRemainder0 = (var13 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (!StatSubmission.isReconnectStage((byte) 92)) {
              if ((LoginStateQueries.isMessageOverlayShown(-113)) &&
                (!QuickChatMenu.isLegacyMenuOpen(true))) {
                SoftwareRaster.halveBrightnessRectangle(0, 0, SoftwareRaster.field_c, SoftwareRaster.field_j);
                ClientUiHelpers.drawPopupMenu((byte) -95);
                if (var13 != 0) {
                  stackIn_134_0 = -64;
                  if (RewardValueHelpers.field_c != null) {
                    stackIn_135_1 = true;
                  } else {
                    stackIn_135_1 = DelayedServerPacket.field_q;
                  }
                  Js5NetworkRequest.drawDimmedOverlay(stackIn_134_0, stackIn_135_1);
                }
              }
            } else {
              stackIn_134_0 = -64;
              if (RewardValueHelpers.field_c != null) {
                stackIn_135_1 = true;
              } else {
                stackIn_135_1 = DelayedServerPacket.field_q;
              }
              Js5NetworkRequest.drawDimmedOverlay(stackIn_134_0, stackIn_135_1);
            }
          }
          if (SocialPacketHelpers.field_i != SocialPacketHelpers.field_h) {
            var5_intLifetime2 = 256 * SentinelDesigner.field_a / 16;
            if (var5_intLifetime2 > 0) {
              SoftwareRaster.fillRectangleBlended(0, 0, SoftwareRaster.field_c, SoftwareRaster.field_j, 0, var5_intLifetime2);
            }
          }
          if (DiskCacheWorker.field_l < MusicPatchPcmStream.field_v) {
            SoftwareRaster.drawRectangleOutlineAlpha(2, 2, 102, 15, 6710886, 128);
            SoftwareRaster.fillRectangle(3, 3, 100, 13, 0);
            SoftwareRaster.fillRectangle(4, 4, DiskCacheWorker.field_l * 33 + 33 * TickClock.field_g / ReflectionCheck.field_r, 11, 39398);
            if (BoundedUrlRequest.field_d != null) {
              var5 = SocketConnector.formatTemplate(ValidationHelpWidget.field_sb, -98, new String[]{Integer.toString(DiskCacheWorker.field_l * 33 + TickClock.field_g * 33 / ReflectionCheck.field_r)});
              BoundedUrlRequest.field_d.drawCentered(var5, 54, 12, 39398, 0);
              SoftwareRaster.setClip(3, 3, 33 * DiskCacheWorker.field_l + TickClock.field_g * 33 / ReflectionCheck.field_r, 17);
              BoundedUrlRequest.field_d.drawCentered(var5, 54, 12, 0, 39398);
              SoftwareRaster.resetClip();
            }
          }
          ScrollContainer.paintCanvasNow(0, 0, 28594, var2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var2_ref), "SteelSentinels.EA(" + param0 + ')');
        }
    }

    private final boolean loadClientResources(byte param0) {
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
          ClientUiHelpers.initializeMenuLabels(35);
          if (null != RasterSnapshot.field_x) {
            if (SessionUiHelpers.field_d.ensureIndex(true) &&
              SessionUiHelpers.field_d.isGroupLoadedByName("basic", (byte) 90)) {
              if (SessionUiHelpers.field_d.ensureIndex(true) &&
                SessionUiHelpers.field_d.isGroupLoadedByName("roman20", (byte) 90)) {
                if (MusicPatchPcmStream.field_t.ensureIndex(true) &&
                  MusicPatchPcmStream.field_t.isGroupLoadedByName("roman20", (byte) 90)) {
                  if (SessionUiHelpers.field_d.ensureIndex(true) &&
                    SessionUiHelpers.field_d.isGroupLoadedByName("lobby", (byte) 90)) {
                    if (SessionUiHelpers.field_d.ensureIndex(true) &&
                      SessionUiHelpers.field_d.isGroupLoadedByName("basicfont12", (byte) 90)) {
                      if (MusicPatchPcmStream.field_t.ensureIndex(true) &&
                        MusicPatchPcmStream.field_t.isGroupLoadedByName("basicfont12", (byte) 90)) {
                        if (MusicPatchPcmStream.field_t.ensureIndex(true) &&
                          MusicPatchPcmStream.field_t.isGroupLoadedByName("lobby", (byte) 90)) {
                          if (RasterSnapshot.field_x.ensureIndex(true) &&
                            RasterSnapshot.field_x.ensureAllGroupsAvailable(param0 ^ -43)) {
                            if (SceneWidgetNode.field_z.ensureIndex(true) &&
                              SceneWidgetNode.field_z.ensureAllGroupsAvailable(param0 ^ -43)) {
                              LoginCredentialHelpers.field_l = false;
                              if (ImageProducerRasterBuffer.field_t.ensureIndex(true) &&
                                ImageProducerRasterBuffer.field_t.ensureAllGroupsAvailable(25)) {
                                if (SectorCacheStore.field_i.ensureIndex(true) &&
                                  SectorCacheStore.field_i.ensureAllGroupsAvailable(param0 + 77)) {
                                  if (GrowableIntList.field_i.ensureIndex(true) &&
                                    GrowableIntList.field_i.ensureAllGroupsAvailable(25)) {
                                    if (DualNode.field_x.ensureIndex(true) &&
                                      DualNode.field_x.isGroupLoadedByName("basic", (byte) 90)) {
                                      if (LobbyStateHelpers.field_h.ensureIndex(true) &&
                                        LobbyStateHelpers.field_h.ensureAllGroupsAvailable(25)) {
                                        if (LobbySetupHelpers.field_a.ensureIndex(true) &&
                                          LobbySetupHelpers.field_a.isGroupLoadedByName("basic", (byte) 90)) {
                                          if (IsaacRandom.field_k.ensureIndex(true) &&
                                            IsaacRandom.field_k.ensureAllGroupsAvailable(25)) {
                                            if (BufferedRandomAccessFile.field_k.ensureIndex(true) &&
                                              BufferedRandomAccessFile.field_k.ensureAllGroupsAvailable(param0 + 77)) {
                                              LoadingScreenHelpers.dismissLoadingUi(-59);
                                              LoadingCaptionHelpers.setLoadingProgress(ResourceArchive.field_n, 82.0f, param0 ^ 21787);
                                              this.renderClient((byte) 111);
                                              RasterBuffer.field_e = new SoundCache(RasterSnapshot.field_x, SceneWidgetNode.field_z);
                                              RasterSnapshot.field_x = null;
                                              LobbyPlayer.resetFrameTimingHistory(0);
                                              return false;
                                            }
                                            LoadingCaptionHelpers.setLoadingProgress(ModalStack.formatArchiveLoadingProgress((byte) -128, SentinelAnimationEditor.field_i, ArchiveLoadStep.field_l, BufferedRandomAccessFile.field_k), 90.0f, -21801);
                                            return false;
                                          }
                                          LoadingCaptionHelpers.setLoadingProgress(ClientErrorSupport.formatArchiveGroupProgress(IsaacRandom.field_k, (byte) 94, "", SentinelAnimationEditor.field_i, ArchiveLoadStep.field_l), 85.0f, -21801);
                                          return false;
                                        }
                                        LoadingCaptionHelpers.setLoadingProgress(ClientErrorSupport.formatArchiveGroupProgress(LobbySetupHelpers.field_a, (byte) 108, "basic", DefaultQuickChatCacheHook.field_c, QuickChatPopupHelpers.field_c), 80.0f, -21801);
                                        return false;
                                      }
                                      LoadingCaptionHelpers.setLoadingProgress(ModalStack.formatArchiveLoadingProgress((byte) -78, LoadingScreenHelpers.field_f, NotificationMessage.field_t, LobbyStateHelpers.field_h), 75.0f, -21801);
                                      return false;
                                    }
                                    LoadingCaptionHelpers.setLoadingProgress(ClientErrorSupport.formatArchiveGroupProgress(DualNode.field_x, (byte) 94, "basic", LoadingScreenHelpers.field_f, NotificationMessage.field_t), 70.0f, -21801);
                                    return false;
                                  }
                                  LoadingCaptionHelpers.setLoadingProgress(ClientErrorSupport.formatArchiveGroupProgress(GrowableIntList.field_i, (byte) 101, "", ChatHistoryHelpers.field_f, AccountTermsPanel.field_P), 60.0f, -21801);
                                  return false;
                                }
                                LoadingCaptionHelpers.setLoadingProgress(ModalStack.formatArchiveLoadingProgress((byte) -103, ChatHistoryHelpers.field_f, AccountTermsPanel.field_P, SectorCacheStore.field_i), 45.0f, -21801);
                                return false;
                              }
                              LoadingCaptionHelpers.setLoadingProgress(ClientErrorSupport.formatArchiveGroupProgress(ImageProducerRasterBuffer.field_t, (byte) 99, "", PendingAckRequest.field_t, LoginHandshakeHelpers.field_a), 42.0f, -21801);
                              return false;
                            }
                            LoadingCaptionHelpers.setLoadingProgress(ClientErrorSupport.formatArchiveGroupProgress(SceneWidgetNode.field_z, (byte) 127, "", PendingAckRequest.field_t, LoginHandshakeHelpers.field_a), 40.0f, -21801);
                            return false;
                          }
                          LoadingCaptionHelpers.setLoadingProgress(ClientErrorSupport.formatArchiveGroupProgress(RasterSnapshot.field_x, (byte) 122, "", PendingAckRequest.field_t, LoginHandshakeHelpers.field_a), 20.0f, param0 - 21749);
                          return false;
                        }
                        LoadingCaptionHelpers.setLoadingProgress(ClientErrorSupport.formatArchiveGroupProgress(MusicPatchPcmStream.field_t, (byte) 116, "lobby", DefaultQuickChatCacheHook.field_c, QuickChatPopupHelpers.field_c), 17.0f, param0 - 21749);
                        return false;
                      }
                      LoadingCaptionHelpers.setLoadingProgress(ClientErrorSupport.formatArchiveGroupProgress(MusicPatchPcmStream.field_t, (byte) 97, "basicfont12", DefaultQuickChatCacheHook.field_c, QuickChatPopupHelpers.field_c), 15.0f, param0 - 21749);
                      return false;
                    }
                    LoadingCaptionHelpers.setLoadingProgress(ClientErrorSupport.formatArchiveGroupProgress(SessionUiHelpers.field_d, (byte) 120, "basicfont12", LoadingScreenHelpers.field_f, NotificationMessage.field_t), 14.0f, -21801);
                    return false;
                  }
                  LoadingCaptionHelpers.setLoadingProgress(ClientErrorSupport.formatArchiveGroupProgress(SessionUiHelpers.field_d, (byte) 104, "lobby", LoadingScreenHelpers.field_f, NotificationMessage.field_t), 13.0f, param0 - 21749);
                  return false;
                }
                LoadingCaptionHelpers.setLoadingProgress(ClientErrorSupport.formatArchiveGroupProgress(MusicPatchPcmStream.field_t, (byte) 111, "roman20", DefaultQuickChatCacheHook.field_c, QuickChatPopupHelpers.field_c), 12.0f, -21801);
                return false;
              }
              LoadingCaptionHelpers.setLoadingProgress(ClientErrorSupport.formatArchiveGroupProgress(SessionUiHelpers.field_d, (byte) 116, "roman20", LoadingScreenHelpers.field_f, NotificationMessage.field_t), 11.0f, param0 ^ 21787);
              return false;
            }
            LoadingCaptionHelpers.setLoadingProgress(ClientErrorSupport.formatArchiveGroupProgress(SessionUiHelpers.field_d, (byte) 116, "basic", LoadingScreenHelpers.field_f, NotificationMessage.field_t), 10.0f, -21801);
            return false;
          }
          if (ImageProducerRasterBuffer.field_t != null) {
            LoadingCaptionHelpers.setLoadingProgress(ResourceArchive.field_n, 85.0f, -21801);
            this.renderClient((byte) -116);
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
            LobbyPlayer.resetFrameTimingHistory(0);
            return false;
          }
          if (GrowableIntList.field_i != null) {
            LoadingCaptionHelpers.setLoadingProgress(QuickChatInputHelpers.field_a, 88.0f, -21801);
            this.renderClient((byte) 104);
            LoginCredentials.field_f = MusicTrack.load(GrowableIntList.field_i, "", "md_title_music");
            NodeHashTableIterator.field_i = MusicTrack.load(GrowableIntList.field_i, "", "war_zone");
            ByteStorage.field_e = MusicTrack.load(GrowableIntList.field_i, "", "lost_world");
            CipherPacketBuffer.field_z = MusicTrack.load(GrowableIntList.field_i, "", "cityscape");
            LoginHandshakeHelpers.field_e = MusicTrack.load(GrowableIntList.field_i, "", "thats_no_moon");
            SocketConnector.field_a = MusicTrack.load(GrowableIntList.field_i, "", "star_fleet");
            IterableNodeHashTable.field_f.prepareTrack(0, LoginCredentials.field_f, 21687, RasterBuffer.field_e, SectorCacheStore.field_i);
            IterableNodeHashTable.field_f.prepareTrack(0, NodeHashTableIterator.field_i, 21687, RasterBuffer.field_e, SectorCacheStore.field_i);
            IterableNodeHashTable.field_f.prepareTrack(0, ByteStorage.field_e, 21687, RasterBuffer.field_e, SectorCacheStore.field_i);
            IterableNodeHashTable.field_f.prepareTrack(0, CipherPacketBuffer.field_z, 21687, RasterBuffer.field_e, SectorCacheStore.field_i);
            IterableNodeHashTable.field_f.prepareTrack(0, LoginHandshakeHelpers.field_e, param0 + 21739, RasterBuffer.field_e, SectorCacheStore.field_i);
            IterableNodeHashTable.field_f.prepareTrack(0, SocketConnector.field_a, 21687, RasterBuffer.field_e, SectorCacheStore.field_i);
            IterableNodeHashTable.field_f.releasePatchSamples((byte) 25);
            GrowableIntList.field_i = null;
            SectorCacheStore.field_i = null;
            LobbyPlayer.resetFrameTimingHistory(0);
            return false;
          }
          if (LobbySetupHelpers.field_a == null) {
            if (null != IsaacRandom.field_k) {
              MusicPatchNode.setHuffmanCodec((byte) 106, new HuffmanDecoder(IsaacRandom.field_k.getFileByName("huffman", -742, "")));
              IsaacRandom.field_k = null;
              LobbyPlayer.resetFrameTimingHistory(0);
              return false;
            }
            BattleTerrain.buildPartCatalogue(false);
            GeneratedSpriteHelpers.createGeneratedSprites(0);
            var2_int = 0;
            do {
              if (23 <= var2_int) {
                LoginForm.field_T = 0;
                GzipDecoder.field_g = 0;
                ProxyAuthenticationException.setTargetFrameRate(50, (byte) -127);
                MusicTrackHelpers.changeMusicTrack(true, (byte) 92, 200, LoginCredentials.field_f);
                break;
              }
              GameKeyHandler.field_e[var2_int] = new SentinelDesigner(var2_int);
              var2_int++;
            } while (var6 == 0);
            if (!ByteArrayPoolHelpers.isAccountCreationMode(118)) {
              TickClock.field_i = RegistrationRequestDialog.queueOutgoingRequest(4, param0 + 20051);
            }
            LobbyPlayer.resetFrameTimingHistory(0);
            if (param0 != -52) {
              this.processGameTick(-1, true);
            }
            return true;
          }
          LoadingCaptionHelpers.setLoadingProgress(ArchiveIndex.field_i, 90.0f, param0 - 21749);
          this.renderClient((byte) 109);
          var2_array = ArchiveLoadSequence.loadIndexedSpritesByName(-126, "basic", DualNode.field_x, "ranks");
          LoginDialogHelpers.field_j = TransitionTimerHelpers.loadBinaryFontByName(MusicPatchPcmStream.field_t, "roman20", SessionUiHelpers.field_d, param0 + 51, "");
          NameCheckResult.field_f = UrlAndReplyHelpers.loadCoverageFontByName(DualNode.field_x, LobbySetupHelpers.field_a, (byte) -102, "biting30", "basic");
          DualNodeHashTable.field_h = TransitionTimerHelpers.loadBinaryFontByName(LobbySetupHelpers.field_a, "basic", DualNode.field_x, param0 ^ 51, "smallfont");
          BoundedUrlRequest.field_d = TransitionTimerHelpers.loadBinaryFontByName(LobbySetupHelpers.field_a, "basic", DualNode.field_x, -1, "tinyfont");
          ValidationHelpWidget.field_lb = TransitionTimerHelpers.loadBinaryFontByName(MusicPatchPcmStream.field_t, "basicfont12", SessionUiHelpers.field_d, param0 + 51, "");
          BirthDateEntryPanel.field_U = UrlAndReplyHelpers.loadCoverageFontByName(DualNode.field_x, LobbySetupHelpers.field_a, (byte) -93, "bitingfont", "basic");
          AlphaContainer.field_U = UrlAndReplyHelpers.loadCoverageFontByName(DualNode.field_x, LobbySetupHelpers.field_a, (byte) -84, "bitinghalf", "basic");
          SocialListPanel.field_Tb = PlayerContextMenu.loadPaletteFont(DualNode.field_x, LobbySetupHelpers.field_a, true, "basic", "menutitlefont");
          StatSubmission.loadSpritesByName("menu_overlays", "basic", (byte) -87, DualNode.field_x);
          LobbyGameDecoding.field_a = GameplayController.loadTiledFrameSprites(DualNode.field_x, (byte) 42, "frame", "basic");
          ClientGlobals.field_e = GameplayController.loadTiledFrameSprites(DualNode.field_x, (byte) -119, "frame_filled", "basic");
          GradientOutlineTextPainter.field_o = GameplayController.loadTiledFrameSprites(DualNode.field_x, (byte) -60, "button_frame", "basic");
          Js5Transport.field_l = GameplayController.loadTiledFrameSprites(DualNode.field_x, (byte) -122, "button_raised", "basic");
          IconLookupHelpers.field_e = GameplayController.loadTiledFrameSprites(DualNode.field_x, (byte) 36, "button_depressed", "basic");
          if (ByteArrayPoolHelpers.isAccountCreationMode(param0 ^ -44) ||
            !(SpriteLoadingHelpers.field_b > 0)) {
            var3 = ArchiveLoadSequence.loadIndexedSpritesByName(121, "basic", DualNode.field_x, "expansion");
            SocialListUiHelpers.field_c = new MembershipPromotionScreen((java.applet.Applet) (this), NameCheckResult.field_e, var3, SentinelDesigner.field_f);
          }
          ClientException.field_c = StatSubmission.loadSpritesByName("achievements_large", "basic", (byte) -79, DualNode.field_x);
          ProxyAuthenticationException.field_h = StatSubmission.loadSpritesByName("cursors", "basic", (byte) -54, DualNode.field_x);
          var3_int = 0;
          do {
            if (!(var3_int < ProxyAuthenticationException.field_h.length)) {
              ValidationHelpWidget.field_tb = PacketLoopHelpers.loadRgbSpriteByName(SessionUiHelpers.field_d, "basic", "unachieved", false);
              SingleChildContainer.field_P = PacketLoopHelpers.loadRgbSpriteByName(SessionUiHelpers.field_d, "basic", "locked", false);
              DropTargetWidget.field_G = PacketLoopHelpers.loadRgbSpriteByName(SessionUiHelpers.field_d, "basic", "orbcoin", false);
              GrowableIntList.field_d = new RgbSprite(40, 40);
              GrowableIntList.field_d.bindRasterTarget();
              ValidationHelpWidget.field_tb.drawScaled(0, 0, 40, 40);
              MusicCrossfadeStream.field_F = new RgbSprite(40, 40);
              MusicCrossfadeStream.field_F.bindRasterTarget();
              SingleChildContainer.field_P.drawScaled(0, 0, 40, 40);
              Checkbox.field_bb.bindRaster((byte) 126);
              PopupMenuHelpers.padToFourPixelAlignment(false, ValidationHelpWidget.field_tb);
              PopupMenuHelpers.padToFourPixelAlignment(false, SingleChildContainer.field_P);
              PopupMenuHelpers.padToFourPixelAlignment(false, DropTargetWidget.field_G);
              WhirlpoolHasher.field_o = new RgbSprite[5][];
              StatefulTextPainter.loadWarzoneSprites((ResourceArchive) null, 2, DualNode.field_x);
              Sprite.field_m = StatSubmission.loadSpritesByName("darkblueboxfilled", "basic", (byte) -52, DualNode.field_x);
              UrlAndReplyHelpers.field_f = StatSubmission.loadSpritesByName("obviousdarkbluebox", "basic", (byte) -56, DualNode.field_x);
              MatchingTextValidator.field_t = StatSubmission.loadSpritesByName("darkbluebox", "basic", (byte) -54, DualNode.field_x);
              LoadingStatusHelpers.field_e = StatSubmission.loadSpritesByName("darkerbluebox", "basic", (byte) -30, DualNode.field_x);
              FullscreenFocusCanvas.field_a = StatSubmission.loadSpritesByName("lightbluetabbox", "basic", (byte) -108, DualNode.field_x);
              SocialRequestHelpers.field_b = StatSubmission.loadSpritesByName("darkgrayboxfilled", "basic", (byte) -114, DualNode.field_x);
              QuickChatCategoryCache.field_d = StatSubmission.loadSpritesByName("darkgraybox", "basic", (byte) -67, DualNode.field_x);
              TutorialStepTable.field_g = StatSubmission.loadSpritesByName("sectiontab", "basic", (byte) -99, DualNode.field_x);
              AccountMessagePanel.field_Y = StatSubmission.loadSpritesByName("tabselected", "basic", (byte) -40, DualNode.field_x);
              Checkbox.field_X = StatSubmission.loadSpritesByName("tabunselected", "basic", (byte) -67, DualNode.field_x);
              QuickChatPhraseCache.field_f = StatSubmission.loadSpritesByName("tabmouseover", "basic", (byte) -71, DualNode.field_x);
              CachedTextLayout.field_E = StatSubmission.loadSpritesByName("sentinelimages", "basic", (byte) -111, DualNode.field_x);
              MatchingTextValidator.field_t[4] = null;
              UrlAndReplyHelpers.field_f[4] = null;
              AccountChoicePanel.field_T = StatSubmission.loadSpritesByName("greybox", "basic", (byte) -90, DualNode.field_x);
              AccountChoicePanel.field_T[4] = null;
              QuickChatPhraseDefinition.field_y = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "dropdown_mark", false);
              ResizableModalPanel.field_bb = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "button_cover", false);
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
            TextButton.field_N = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "goldstar", false);
            ReportAbuseDialog.field_ec = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "silverstar", false);
            PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "starfrigate", false);
            Checkbox.field_W = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "starcruiser", false);
            IterableDualNodeDeque.field_e = Checkbox.field_W.copyFlippedHorizontal();
            NodeIterator.field_c = ArchiveLoadSequence.loadIndexedSpritesByName(27, "basic", DualNode.field_x, "texticons");
            ModalPanel.field_X = new int[]{13, 13, 13, 13, 14, 14, 14, 13, 13, 15, 13, 13, 12, 13, 15, 13, 13, 13, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15};
            DualNodeHashTable.field_h.setInlineSprites(NodeIterator.field_c, ModalPanel.field_X);
            BoundedUrlRequest.field_d.setInlineSprites(NodeIterator.field_c, ModalPanel.field_X);
            BirthDateEntryPanel.field_U.setInlineSprites(NodeIterator.field_c, ModalPanel.field_X);
            ValidationHelpWidget.field_lb.setInlineSprites(NodeIterator.field_c, ModalPanel.field_X);
            stackIn_149_0 = param0;
            stackIn_149_1 = -5;
          }
          var3 = ArchiveLoadSequence.loadIndexedSpritesByName(stackIn_149_0 ^ stackIn_149_1, "basic", DualNode.field_x, "instr_texticons");
          SoundCache.field_a = new IndexedSprite[18];
          AlternateUsernameCredentials.field_w = new int[SoundCache.field_a.length];
          var4_int = 0;
          do {
            if (!(var4_int < SoundCache.field_a.length)) {
              ArraySupport.copy(var3, 0, SoundCache.field_a, 6, 2);
              SoundCache.field_a[17] = SoundCache.field_a[7];
              SocialListEntry.field_Zb = StatSubmission.loadSpritesByName("scrolldown", "basic", (byte) -87, DualNode.field_x);
              MusicCrossfadeStream.field_x = StatSubmission.loadSpritesByName("scrollup", "basic", (byte) -33, DualNode.field_x);
              MusicTrackHelpers.field_f = StatSubmission.loadSpritesByName("scrollbar", "basic", (byte) -95, DualNode.field_x);
              LoginCredentialHelpers.field_a = StatSubmission.loadSpritesByName("scrollvert", "basic", (byte) -104, DualNode.field_x);
              MouseInputHandler.field_k = StatSubmission.loadSpritesByName("frame_shiny", "basic", (byte) -123, DualNode.field_x);
              Js5ArchiveManager.field_c = StatSubmission.loadSpritesByName("frame_shiny_bright", "basic", (byte) -43, DualNode.field_x);
              ResourceArchive.field_b = StatSubmission.loadSpritesByName("frame_basic_bright", "basic", (byte) -128, DualNode.field_x);
              MembershipPromotionScreen.field_p = StatSubmission.loadSpritesByName("frame_basic_thin", "basic", (byte) -55, DualNode.field_x);
              KeyRoutingHelpers.field_b = StatSubmission.loadSpritesByName("frame_basic", "basic", (byte) -127, DualNode.field_x);
              TextButton.field_U = StatSubmission.loadSpritesByName("display_frame", "basic", (byte) -35, DualNode.field_x);
              TextButton.field_U[4] = null;
              LinkButtonPainter.field_d = StatSubmission.loadSpritesByName("config_tut_frame", "basic", (byte) -32, DualNode.field_x);
              LinkButtonPainter.field_d[4] = null;
              TextButton.field_Q = StatSubmission.loadSpritesByName("popup_frame", "basic", (byte) -94, DualNode.field_x);
              TextButton.field_Q[4] = null;
              CachedTextLayout.field_l = ArchiveLoadSequence.loadIndexedSpritesByName(125, "basic", DualNode.field_x, "mechbits");
              IterableDualNodeDeque.field_j = StatSubmission.loadSpritesByName("weaponclasses", "basic", (byte) -107, DualNode.field_x);
              IconLookupHelpers.field_d = ArchiveLoadSequence.loadIndexedSpritesByName(-123, "basic", DualNode.field_x, "batdrone");
              VerticalScrollbar.field_Zb = ArchiveLoadSequence.loadIndexedSpritesByName(param0 ^ 69, "basic", DualNode.field_x, "drones");
              AccountNoticeDialog.field_qb = ArchiveLoadSequence.loadIndexedSpritesByName(param0 + 163, "basic", DualNode.field_x, "bits_golem");
              Sentinel.field_nc = ArchiveLoadSequence.loadIndexedSpritesByName(42, "basic", DualNode.field_x, "bits_bird");
              PasswordFieldPainter.field_z = ArchiveLoadSequence.loadIndexedSpritesByName(-115, "basic", DualNode.field_x, "bits_slave");
              SpriteState.field_C = ArchiveLoadSequence.loadIndexedSpritesByName(125, "basic", DualNode.field_x, "bits_babel");
              FallingPickup.field_R = ArchiveLoadSequence.loadIndexedSpritesByName(-128, "basic", DualNode.field_x, "bits_valhalla");
              LobbyGame.field_Ec = ArchiveLoadSequence.loadIndexedSpritesByName(-128, "basic", DualNode.field_x, "bits_orbital");
              AlphaContainer.field_V = ArchiveLoadSequence.loadIndexedSpritesByName(61, "basic", DualNode.field_x, "bits_bertha");
              DisplayMode.field_b = ArchiveLoadSequence.loadIndexedSpritesByName(67, "basic", DualNode.field_x, "bits_smasher");
              MembershipPromotionScreen.field_c = ArchiveLoadSequence.loadIndexedSpritesByName(76, "basic", DualNode.field_x, "bits_scorpion");
              ParticleEffect.field_L = ArchiveLoadSequence.loadIndexedSpritesByName(-116, "basic", DualNode.field_x, "bits_hurricane");
              StatSubmission.field_u = ArchiveLoadSequence.loadIndexedSpritesByName(param0 - 65, "basic", DualNode.field_x, "bits_commando");
              Sprite.field_b = ArchiveLoadSequence.loadIndexedSpritesByName(param0 ^ -112, "basic", DualNode.field_x, "bits_turtle");
              ListRequestHelpers.field_c = ArchiveLoadSequence.loadIndexedSpritesByName(param0 + 19, "basic", DualNode.field_x, "droppod");
              ArchiveProvider.field_a = ArchiveLoadSequence.loadIndexedSpritesByName(param0 ^ -128, "basic", DualNode.field_x, "infantary");
              IsaacRandom.field_d = ArchiveLoadSequence.loadIndexedSpritesByName(-123, "basic", DualNode.field_x, "modules");
              break;
            }
            AlternateUsernameCredentials.field_w[var4_int] = 14;
            var4_int++;
          } while (var6 == 0);
          var3_array = PendingDataRequest.field_v;
          var3_array[0] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "instr_giantrobot", false);
          var3_array[1] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "instr_queue", false);
          var3_array[2] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "Basic", "instr_walk", false);
          var3_array[3] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "instr_jump", false);
          var3_array[4] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "instr_thrust", false);
          var3_array[5] = IsaacRandom.field_d[16].toRgbSprite();
          var3_array[6] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "instr_selweapon", false);
          var3_array[7] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "instr_target", false);
          var3_array[8] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "instr_noenergy", false);
          var3_array[9] = IsaacRandom.field_d[32].toRgbSprite();
          var3_array[10] = IsaacRandom.field_d[33].toRgbSprite();
          var3_array[11] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "instr_bigshieldicon", false);
          var3_array[12] = IsaacRandom.field_d[27].toRgbSprite();
          var3_array[13] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "instr_stats", false);
          var3_array[14] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "instr_chassis", false);
          var3_array[15] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "instr_components", false);
          var3_array[16] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "instr_weapons", false);
          var3_array[17] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "instr_modules", false);
          var3_array[18] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "instr_engineer", false);
          var3_array[19] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "instr_coop", false);
          var3_array[20] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "instr_team", false);
          var3_array[25] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "instr_techvalue", false);
          ArchiveProvider.field_b = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "logo_menu_chromakey", false);
          PendingPackedReply.field_z = (ArgbSprite) (ContextMenu.loadSprite("basic", -63, "main_lower_panel", DualNode.field_x));
          TextHotspotWidget.field_eb = (ArgbSprite) (ContextMenu.loadSprite("basic", param0 ^ 75, "main_title_panel", DualNode.field_x));
          CachedArchiveProvider.field_j = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "menu_mesh", false);
          MidiPcmStream.field_db = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "menu_titlebar", false);
          BirthDateEntryPanel.field_T = GameplayController.loadTiledFrameSprites(DualNode.field_x, (byte) -62, "menu_button_1", "basic");
          GameplayController.loadTiledFrameSprites(DualNode.field_x, (byte) 107, "empty_button", "basic");
          AccountNamePrompt.field_Ub = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "prevbtn", false);
          EmailValidationHelpers.field_b = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "nextbtn", false);
          CheckboxPainter.field_b = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "lobby_icon", false);
          DisplayMode.field_e = StatSubmission.loadSpritesByName("statbars", "basic", (byte) -13, DualNode.field_x);
          AccountChoicePanel.field_Z = StatSubmission.loadSpritesByName("tags", "basic", (byte) -50, DualNode.field_x);
          NodeHashTable.field_k = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "tagborder", false);
          MarkerSliderPainter.field_f = StatSubmission.loadSpritesByName("movekeys", "basic", (byte) -38, DualNode.field_x);
          ValidatedTextWidget.field_wb = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "shiftkey", false);
          TextLayout.field_e = StatSubmission.loadSpritesByName("config_tabs", "basic", (byte) -33, DualNode.field_x);
          RasterSnapshot.field_r[0] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "research_ring", false);
          DialWidgetPainter.field_q[0] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "research_icon", false);
          LinkButtonPainter.field_p = ArchiveLoadSequence.loadIndexedSpritesByName(param0 - 75, "basic", DualNode.field_x, "powerups");
          GeneratedSpriteHelpers.field_c = StatSubmission.loadSpritesByName("headings_bar", "basic", (byte) -26, DualNode.field_x);
          PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "solarite", false);
          Js5Transport.field_q = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "mansize", false);
          SpriteDrawHelpers.field_a = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "stripeybar", false);
          Js5Transport.field_r = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "hackbit", false);
          MouseInputHandler.field_d = StatSubmission.loadSpritesByName("pretty_button_lit", "basic", (byte) -111, DualNode.field_x);
          LobbyGame.field_Tb = StatSubmission.loadSpritesByName("pretty_button_unlit", "basic", (byte) -50, DualNode.field_x);
          AgeValidator.field_p = StatSubmission.loadSpritesByName("menu_border", "basic", (byte) -31, DualNode.field_x);
          SocialRequestHelpers.field_e = StatSubmission.loadSpritesByName("bin_icon", "basic", (byte) -14, DualNode.field_x);
          AccountChoicePanel.field_Q = StatSubmission.loadSpritesByName("faces_idle", "basic", (byte) -87, DualNode.field_x);
          WeightedCacheEntry.field_C = StatSubmission.loadSpritesByName("faces_talk", "basic", (byte) -97, DualNode.field_x);
          DesignerPageSetup.field_f = StatSubmission.loadSpritesByName("tutor_buttons", "basic", (byte) -125, DualNode.field_x);
          DialWidgetPainter.field_n = StatSubmission.loadSpritesByName("shields", "basic", (byte) -58, DualNode.field_x);
          AccountRegistrationPanel.field_gb = StatSubmission.loadSpritesByName("explosion", "basic", (byte) -34, DualNode.field_x);
          var3_array = ClientUiHelpers.loadRgbSpritesByName((byte) -115, "smoke", DualNode.field_x, "basic");
          LobbyPlayer.field_pc = new ArgbSprite[var3_array.length];
          var4_int = 0;
          do {
            if (var4_int >= var3_array.length) {
              AccountMessagePanel.field_S = StatSubmission.loadSpritesByName("plasma", "basic", (byte) -98, DualNode.field_x);
              StatSubmission.loadSpritesByName("dust", "basic", (byte) -81, DualNode.field_x);
              LoginDialog.field_Cb = ArchiveLoadSequence.loadIndexedSpritesByName(-120, "basic", DualNode.field_x, "crowns");
              ValidatedTextWidget.field_sb = new RgbSprite(32, 32);
              ValidatedTextWidget.field_sb.bindRasterTarget();
              DropTargetWidget.field_G.drawScaledAveraged(0, 0, 32, 32);
              Checkbox.field_bb.bindRaster((byte) 125);
              DropTargetWidget.field_G = null;
              break;
            }
            LobbyPlayer.field_pc[var4_int] = (ArgbSprite) (var3_array[var4_int]);
            var4_int++;
          } while (var6 == 0);
          var3_array2 = new RgbSprite[WeightedLruCache.field_m.length][];
          var4 = new RgbSprite[WeightedLruCache.field_m.length][];
          var5 = 0;
          do {
            if (!(WeightedLruCache.field_m.length > var5)) {
              ResourceArchive.initializeGameAssets(FriendListHelpers.field_c, (byte) 74, SessionUiHelpers.field_d, (int[]) null, BufferedRandomAccessFile.field_k, var4, true, 4, 3, ModalPanel.field_R, var2_array, DebouncedValidator.field_b, var3_array2, MusicPatchPcmStream.field_t, DelayedServerPacket.field_w, ParticleEffect.field_y, ImageProducerRasterBuffer.field_u);
              TutorialStepTable.setPromotionArchives(SessionUiHelpers.field_d, 111, MusicPatchPcmStream.field_t);
              ChatHistoryAllocator.allocateChatHistory(200, 126);
              LobbySetupHelpers.field_a = null;
              LobbyPlayer.resetFrameTimingHistory(param0 ^ -52);
              break;
            }
            var3_array2[var5] = StatSubmission.loadSpritesByName(WeightedLruCache.field_m[var5], "basic", (byte) -63, DualNode.field_x);
            var4[var5] = null;
            var5++;
          } while (var6 == 0);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var2), "SteelSentinels.OA(" + param0 + ')');
        }
    }

    final static RgbSprite[] createPanelFrameSprites(int param0, int param1, byte param2, int param3, int param4) {
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
          dupTemp$2 = SolidSpriteHelpers.createSolidSprite(param1, param3, 248);
          var5[6] = dupTemp$2;
          var5[3] = dupTemp$2;
          var5[2] = dupTemp$2;
          var5[1] = dupTemp$2;
          var5[0] = dupTemp$2;
          dupTemp$3 = SolidSpriteHelpers.createSolidSprite(param4, param3, 248);
          var5[8] = dupTemp$3;
          var5[7] = dupTemp$3;
          var5[5] = dupTemp$3;
          if (param0 != 0) {
            var5[4] = SolidSpriteHelpers.createSolidSprite(param0, 64, 248);
          }
          stackIn_8_0 = var5;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var5_ref), "SteelSentinels.QA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void loadGameGraphics(int param0) {
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
              DualNode.field_x.ensureFileAvailableByName((byte) -38, "lw_midground_01", "basic")) {
              TickClock.field_g = TickClock.field_g + 1;
              WhirlpoolHasher.field_o[1] = new RgbSprite[4];
              WhirlpoolHasher.field_o[1][0] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "lw_midground_01", false);
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (1 == TickClock.field_g &&
                DualNode.field_x.ensureFileAvailableByName((byte) 113, "lw_midground_02", "basic")) {
                TickClock.field_g = TickClock.field_g + 1;
                WhirlpoolHasher.field_o[1][1] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "lw_midground_02", false);
                decompiledFrameRemainder0 = (var3 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (2 != TickClock.field_g ||
                  !DualNode.field_x.ensureFileAvailableByName((byte) -78, "lw_midground_03", "basic")) {
                  if (TickClock.field_g == 3 &&
                    DualNode.field_x.ensureFileAvailableByName((byte) 101, "lw_midground_04", "basic")) {
                    TickClock.field_g = TickClock.field_g + 1;
                    WhirlpoolHasher.field_o[1][3] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "lw_midground_04", false);
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (TickClock.field_g != 4 ||
                      !DualNode.field_x.ensureFileAvailableByName((byte) -56, "ct_midground_01", "basic")) {
                      if (TickClock.field_g != 5 ||
                        !DualNode.field_x.ensureFileAvailableByName((byte) 102, "ct_midground_02", "basic")) {
                        if (TickClock.field_g != 6 ||
                          !DualNode.field_x.ensureFileAvailableByName((byte) -117, "ct_midground_03", "basic")) {
                          if (7 == TickClock.field_g &&
                            DualNode.field_x.ensureFileAvailableByName((byte) -57, "ct_midground_04", "basic")) {
                            TickClock.field_g = TickClock.field_g + 1;
                            WhirlpoolHasher.field_o[2][3] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "ct_midground_04", false);
                            decompiledFrameRemainder0 = (var3 != 0);
                          }
                          if (decompiledFrameRemainder0) {
                            if (TickClock.field_g == 8 &&
                              DualNode.field_x.ensureFileAvailableByName((byte) 107, "testsurface", "basic")) {
                              TickClock.field_g = TickClock.field_g + 1;
                              AccountRegistrationPanel.field_R = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "testsurface", false);
                              decompiledFrameRemainder0 = (var3 != 0);
                            }
                            if (decompiledFrameRemainder0) {
                              if (TickClock.field_g != 9 ||
                                !DualNode.field_x.ensureFileAvailableByName((byte) -63, "wz_texture", "basic")) {
                                if (TickClock.field_g == 10 &&
                                  DualNode.field_x.ensureFileAvailableByName((byte) -81, "lw_texture", "basic")) {
                                  TickClock.field_g = TickClock.field_g + 1;
                                  ValidatedTextWidget.field_rb[1] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "lw_texture", false);
                                  decompiledFrameRemainder0 = (var3 != 0);
                                }
                                if (decompiledFrameRemainder0) {
                                  if (11 == TickClock.field_g &&
                                    DualNode.field_x.ensureFileAvailableByName((byte) -113, "ct_texture", "basic")) {
                                    TickClock.field_g = TickClock.field_g + 1;
                                    ValidatedTextWidget.field_rb[2] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "ct_texture", false);
                                    decompiledFrameRemainder0 = (var3 != 0);
                                  }
                                  if ((decompiledFrameRemainder0) &&
                                    (decompiledFrameRemainder0 = (TickClock.field_g == 12)) &&
                                    (decompiledFrameRemainder0 = !(!DualNode.field_x.ensureFileAvailableByName((byte) 127, "mn_texture", "basic")))) {
                                    TickClock.field_g = TickClock.field_g + 1;
                                    ValidatedTextWidget.field_rb[3] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "mn_texture", false);
                                    decompiledFrameRemainder0 = (var3 != 0);
                                  }
                                }
                              }
                              if (decompiledFrameRemainder0) {
                                TickClock.field_g = TickClock.field_g + 1;
                                ValidatedTextWidget.field_rb = new RgbSprite[5];
                                ValidatedTextWidget.field_rb[0] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "wz_texture", false);
                                ValidatedTextWidget.field_rb[4] = ValidatedTextWidget.field_rb[0];
                                decompiledFrameRemainder0 = (var3 != 0);
                              }
                            }
                          }
                        }
                        if (decompiledFrameRemainder0) {
                          TickClock.field_g = TickClock.field_g + 1;
                          WhirlpoolHasher.field_o[2][2] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "ct_midground_03", false);
                          if (var3 != 0) {
                            TickClock.field_g = TickClock.field_g + 1;
                            WhirlpoolHasher.field_o[2][1] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "ct_midground_02", false);
                            TickClock.field_g = TickClock.field_g + 1;
                            WhirlpoolHasher.field_o[2] = new RgbSprite[4];
                            WhirlpoolHasher.field_o[2][0] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "ct_midground_01", false);
                            TickClock.field_g = TickClock.field_g + 1;
                            WhirlpoolHasher.field_o[1][2] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "lw_midground_03", false);
                          }
                        }
                      } else {
                        TickClock.field_g = TickClock.field_g + 1;
                        WhirlpoolHasher.field_o[2][1] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "ct_midground_02", false);
                        if (var3 != 0) {
                          TickClock.field_g = TickClock.field_g + 1;
                          WhirlpoolHasher.field_o[2] = new RgbSprite[4];
                          WhirlpoolHasher.field_o[2][0] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "ct_midground_01", false);
                          TickClock.field_g = TickClock.field_g + 1;
                          WhirlpoolHasher.field_o[1][2] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "lw_midground_03", false);
                        }
                      }
                    } else {
                      TickClock.field_g = TickClock.field_g + 1;
                      WhirlpoolHasher.field_o[2] = new RgbSprite[4];
                      WhirlpoolHasher.field_o[2][0] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "ct_midground_01", false);
                      if (var3 != 0) {
                        TickClock.field_g = TickClock.field_g + 1;
                        WhirlpoolHasher.field_o[1][2] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "lw_midground_03", false);
                      }
                    }
                  }
                } else {
                  TickClock.field_g = TickClock.field_g + 1;
                  WhirlpoolHasher.field_o[1][2] = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "basic", "lw_midground_03", false);
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
            LobbyStateHelpers.field_h != null) {
            ReflectionCheck.field_r = 23;
            DiskCacheWorker.field_l = 1;
            if (!LobbyStateHelpers.field_h.ensureIndex(true)) {
              return;
            }
            if (TickClock.field_g == 0 &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) -91, "wz_background.jpg", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              return;
            }
            if (TickClock.field_g == 1 &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) -40, "lw_background.jpg", "lostworld/")) {
              TickClock.field_g = TickClock.field_g + 1;
              return;
            }
            if (TickClock.field_g == 2 &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) 126, "ct_background.jpg", "city/")) {
              TickClock.field_g = TickClock.field_g + 1;
              return;
            }
            if (3 == TickClock.field_g &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) -48, "mn_background.jpg", "moon/")) {
              TickClock.field_g = TickClock.field_g + 1;
              return;
            }
            if (TickClock.field_g == 4 &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) 94, "wz_midground_01.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              WhirlpoolHasher.field_o[0] = new RgbSprite[4];
              WhirlpoolHasher.field_o[0][0] = (RgbSprite) ((Object) new ArgbSprite(LobbyStateHelpers.field_h.getFileByName("wz_midground_01.png", -742, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.getActiveCanvas(false))));
              return;
            }
            if (TickClock.field_g == 5 &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) 109, "wz_midground_02.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              WhirlpoolHasher.field_o[0][1] = (RgbSprite) ((Object) new ArgbSprite(LobbyStateHelpers.field_h.getFileByName("wz_midground_02.png", -742, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.getActiveCanvas(false))));
              return;
            }
            if (TickClock.field_g == 6 &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) 83, "wz_midground_03.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              WhirlpoolHasher.field_o[0][2] = (RgbSprite) ((Object) new ArgbSprite(LobbyStateHelpers.field_h.getFileByName("wz_midground_03.png", -742, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.getActiveCanvas(false))));
              return;
            }
            if (7 == TickClock.field_g &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) 118, "wz_midground_04.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              WhirlpoolHasher.field_o[0][3] = (RgbSprite) ((Object) new ArgbSprite(LobbyStateHelpers.field_h.getFileByName("wz_midground_04.png", TextAndBitHelpers.bitXor(param0, -721), "warzone/"), (java.awt.Component) ((Object) NanoTickClock.getActiveCanvas(false))));
              return;
            }
            if (TickClock.field_g == 8 &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) 88, "wz_foreground_01.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[0] = new RgbSprite[7];
              DelayedServerPacket.field_x[0][0] = (RgbSprite) ((Object) new ArgbSprite(LobbyStateHelpers.field_h.getFileByName("wz_foreground_01.png", param0 - 795, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.getActiveCanvas(false))));
              return;
            }
            if (9 == TickClock.field_g &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) 122, "wz_foreground_02.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[0][1] = (RgbSprite) ((Object) new ArgbSprite(LobbyStateHelpers.field_h.getFileByName("wz_foreground_02.png", param0 - 795, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.getActiveCanvas(false))));
              return;
            }
            if (TickClock.field_g == 10 &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) 84, "wz_foreground_03.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[0][2] = (RgbSprite) ((Object) new ArgbSprite(LobbyStateHelpers.field_h.getFileByName("wz_foreground_03.png", -742, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.getActiveCanvas(false))));
              return;
            }
            if (TickClock.field_g == 11 &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) 122, "wz_foreground_04.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[0][3] = (RgbSprite) ((Object) new ArgbSprite(LobbyStateHelpers.field_h.getFileByName("wz_foreground_04.png", -742, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.getActiveCanvas(false))));
              return;
            }
            if (TickClock.field_g == 12 &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) -76, "wz_foreground_05.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[0][4] = (RgbSprite) ((Object) new ArgbSprite(LobbyStateHelpers.field_h.getFileByName("wz_foreground_05.png", param0 - 795, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.getActiveCanvas(false))));
              return;
            }
            if (TickClock.field_g == 13 &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) 102, "wz_foreground_06.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[0][5] = (RgbSprite) ((Object) new ArgbSprite(LobbyStateHelpers.field_h.getFileByName("wz_foreground_06.png", -742, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.getActiveCanvas(false))));
              return;
            }
            if (TickClock.field_g == 14 &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) 93, "wz_foreground_07.png", "warzone/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[0][6] = (RgbSprite) ((Object) new ArgbSprite(LobbyStateHelpers.field_h.getFileByName("wz_foreground_07.png", -742, "warzone/"), (java.awt.Component) ((Object) NanoTickClock.getActiveCanvas(false))));
              return;
            }
            if (TickClock.field_g == 15 &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) -54, "sb_foreground_01.png", "fleetbattle/")) {
              DelayedServerPacket.field_x[1] = new RgbSprite[6];
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[1][0] = (RgbSprite) ((Object) new ArgbSprite(LobbyStateHelpers.field_h.getFileByName("sb_foreground_01.png", -742, "fleetbattle/"), (java.awt.Component) ((Object) NanoTickClock.getActiveCanvas(false))));
              return;
            }
            if (16 == TickClock.field_g &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) -68, "sb_foreground_02.png", "fleetbattle/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[1][1] = (RgbSprite) ((Object) new ArgbSprite(LobbyStateHelpers.field_h.getFileByName("sb_foreground_02.png", -742, "fleetbattle/"), (java.awt.Component) ((Object) NanoTickClock.getActiveCanvas(false))));
              return;
            }
            if (17 == TickClock.field_g &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) -121, "sb_foreground_03.png", "fleetbattle/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[1][2] = (RgbSprite) ((Object) new ArgbSprite(LobbyStateHelpers.field_h.getFileByName("sb_foreground_03.png", TextAndBitHelpers.bitXor(param0, -721), "fleetbattle/"), (java.awt.Component) ((Object) NanoTickClock.getActiveCanvas(false))));
              return;
            }
            if (18 == TickClock.field_g &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) -127, "sb_foreground_04.png", "fleetbattle/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[1][3] = (RgbSprite) ((Object) new ArgbSprite(LobbyStateHelpers.field_h.getFileByName("sb_foreground_04.png", TextAndBitHelpers.bitXor(param0, -721), "fleetbattle/"), (java.awt.Component) ((Object) NanoTickClock.getActiveCanvas(false))));
              return;
            }
            if (TickClock.field_g == 19 &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) -70, "sb_foreground_05.png", "fleetbattle/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[1][4] = (RgbSprite) ((Object) new ArgbSprite(LobbyStateHelpers.field_h.getFileByName("sb_foreground_05.png", TextAndBitHelpers.bitXor(param0, -721), "fleetbattle/"), (java.awt.Component) ((Object) NanoTickClock.getActiveCanvas(false))));
              return;
            }
            if (20 == TickClock.field_g &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) 126, "sb_foreground_06.png", "fleetbattle/")) {
              TickClock.field_g = TickClock.field_g + 1;
              DelayedServerPacket.field_x[1][5] = (RgbSprite) ((Object) new ArgbSprite(LobbyStateHelpers.field_h.getFileByName("sb_foreground_06.png", -742, "fleetbattle/"), (java.awt.Component) ((Object) NanoTickClock.getActiveCanvas(false))));
              return;
            }
            if (TickClock.field_g == 21 &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) -87, "planet.jpg", "fleetbattle/")) {
              TickClock.field_g = TickClock.field_g + 1;
              return;
            }
            if (TickClock.field_g == 22 &&
              LobbyStateHelpers.field_h.ensureFileAvailableByName((byte) 123, "moon.jpg", "fleetbattle/")) {
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
                SentinelAnimationEditor.field_q[1] = RasterBuffer.field_e.getSoundEffectByName("jumping", "", TextAndBitHelpers.bitXor(param0, 90));
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
                                                                    SentinelAnimationEditor.field_q[49] = RasterBuffer.field_e.getSoundEffectByName("damage_richochet", "", TextAndBitHelpers.bitXor(param0, -15));
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
                                                                                                  SentinelAnimationEditor.field_q[93] = RasterBuffer.field_e.getSoundEffectByName("trackloop", "", TextAndBitHelpers.bitXor(param0, 68));
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
                                                                                            SentinelAnimationEditor.field_q[88] = RasterBuffer.field_e.getSoundEffectByName("explosion_fireball_3", "", TextAndBitHelpers.bitXor(param0, -90));
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
                                                                                        SentinelAnimationEditor.field_q[84] = RasterBuffer.field_e.getSoundEffectByName("pause_menu_open", "", TextAndBitHelpers.bitXor(param0, -110));
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
                                                                              SentinelAnimationEditor.field_q[61] = RasterBuffer.field_e.getSoundEffectByName("air_death_missile", "", TextAndBitHelpers.bitXor(param0, 85));
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
                                                                SentinelAnimationEditor.field_q[47] = RasterBuffer.field_e.getSoundEffectByName("explosion_2", "", TextAndBitHelpers.bitXor(param0, -87));
                                                                TickClock.field_g = TickClock.field_g + 1;
                                                                if (var3 == 0) {
                                                                  break regionExit1;
                                                                }
                                                              }
                                                              SentinelAnimationEditor.field_q[68] = RasterBuffer.field_e.getSoundEffectByName("heavy_gun_2", "", TextAndBitHelpers.bitXor(param0, -27));
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
                                            SentinelAnimationEditor.field_q[27] = RasterBuffer.field_e.getSoundEffectByName("shield_hit", "", TextAndBitHelpers.bitXor(param0, -109));
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
                SentinelAnimationEditor.field_q[3] = RasterBuffer.field_e.getSoundEffectByName("footstep_1", "", TextAndBitHelpers.bitXor(param0, 75));
                TickClock.field_g = TickClock.field_g + 1;
                if (var3 == 0) {
                  break regionExit1;
                }
              }
              SentinelAnimationEditor.field_q[2] = RasterBuffer.field_e.getSoundEffectByName("thrusting", "", TextAndBitHelpers.bitXor(param0, 92));
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
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var2), "SteelSentinels.PA(" + param0 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_H = null;
        field_J = null;
        if (param0 != -10) {
          return;
        }
        try {
          field_I = null;
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "SteelSentinels.TA(" + param0 + ')');
        }
    }

    private final void openArchives(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (BirthDateEntryPanel.field_S != null) {
            SectorCacheStore.loadLocalizedText(0, BirthDateEntryPanel.field_S);
            BirthDateEntryPanel.field_S = null;
            LobbyPlayer.resetFrameTimingHistory(0);
          }
          IsaacRandom.field_k = SceneWidgetNode.openResourceArchive(-124, 3);
          DualNode.field_x = SceneWidgetNode.openResourceArchive(60, 5);
          LobbySetupHelpers.field_a = SceneWidgetNode.openResourceArchive(-90, 6);
          RasterSnapshot.field_x = SceneWidgetNode.openResourceArchive(55, 7);
          SceneWidgetNode.field_z = SceneWidgetNode.openResourceArchive(120, 8);
          var2_int = -77 % ((47 - param0) / 35);
          SectorCacheStore.field_i = SceneWidgetNode.openResourceArchive(-92, 9);
          GrowableIntList.field_i = SceneWidgetNode.openResourceArchive(-106, 10);
          BufferedRandomAccessFile.field_k = SceneWidgetNode.openResourceArchive(104, 11);
          ImageProducerRasterBuffer.field_t = SceneWidgetNode.openResourceArchive(125, 12);
          LobbyStateHelpers.field_h = SceneWidgetNode.openResourceArchive(70, 13);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var2), "SteelSentinels.RA(" + param0 + ')');
        }
    }

    final void shutdownClientServices(byte param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          ImageProducerRasterBuffer.shutdownAudioOutputs(7094);
          if (null != RewardValueHelpers.field_c) {
            SoundCache.exitFullscreen(0);
          }
          var2_int = 21 % ((param0 - 34) / 48);
          QuickChatPhraseDefinition.shutdownConnectionAndInput(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var2), "SteelSentinels.LA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.startWithDefaultSize(15, -28233, "steelsentinels");
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "SteelSentinels.init()");
        }
    }

    private final void processGameTick(int param0, boolean param1) {
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
          DualNodeDequeIterator.updateJinglePlayback(false);
          if (SocialPacketHelpers.field_h != SocialPacketHelpers.field_i) {
            if (~WeightedCacheEntry.field_G != ~SocialPacketHelpers.field_i) {
              if (LoginMethod.field_f == SocialPacketHelpers.field_i) {
                if (!ByteArrayPoolHelpers.isAccountCreationMode(12)) {
                  if (null != SettingSearchHelpers.field_c) {
                    TutorialStepTable.queueHighscoreSubmission(3, (byte) -114, SettingSearchHelpers.field_c);
                  }
                  GeneratedSpriteHelpers.hideMessageOverlay(-128);
                  GzipDecoder.field_g = SentinelDesigner.field_i;
                  if (CachedTextLayout.field_y) {
                    CachedTextLayout.field_y = false;
                    GradientOutlineTextPainter.requestFullscreen(-4, false);
                  }
                  if (ArchiveRequest.field_E &&
                    GzipDecoder.ownsSpecialPart(-52)) {
                    var3_int = GzipDecoder.field_g;
                    if (var3_int == 5 ||
                      var3_int == 6 ||
                      var3_int == 8) {
                      var3_int = SceneWidget.field_Jb;
                    }
                    IterableNodeHashTable.switchScreen(-4, false, -1, var3_int);
                  }
                  if (DropTargetWidget.isNonNegative(GzipDecoder.field_g, 0)) {
                    QuickChatHelpDialog.switchToRequestedScreen(true);
                  }
                }
                SocialPacketHelpers.field_i = ConditionalTextValue.field_b;
                decompiledFrameRemainder2 = (var8 != 0);
              }
              if (decompiledFrameRemainder2) {
                SentinelDesigner.field_a = SentinelDesigner.field_a - 1;
                decompiledFrameRemainder2 = (SentinelDesigner.field_a == 0);
                if (decompiledFrameRemainder2) {
                  SocialPacketHelpers.field_i = SocialPacketHelpers.field_h;
                  decompiledFrameRemainder2 = (var8 != 0);
                }
              }
            }
            if (decompiledFrameRemainder2) {
              SentinelDesigner.field_a = SentinelDesigner.field_a + 1;
              decompiledFrameRemainder2 = (SentinelDesigner.field_a == 16);
              if (decompiledFrameRemainder2) {
                if (!CachedTextLayout.field_y) {
                  ModalPanel.returnToLogin((byte) 113);
                  if (var8 != 0) {
                    EmailFormatError.returnToLoginDialog(param0 ^ 116);
                  }
                } else {
                  EmailFormatError.returnToLoginDialog(param0 ^ 116);
                }
                SocialPacketHelpers.field_i = LoginMethod.field_f;
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
                    BoundedUrlRequest.field_i.updateGame(-68, true);
                    while (UiContainer.pollKeyEvent(22759)) {
                      BoundedUrlRequest.field_i.handleKeyInput(97);
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
                    if (null != EmailSyntaxValidator.field_s &&
                      null != PendingIntArrayRequest.getActiveOverlayWidget((byte) -66)) {
                      EmailSyntaxValidator.field_s.advanceSimulation((byte) 27);
                      var5 = (Sentinel) (EmailSyntaxValidator.field_s.sentinels.first(13058));
                      while (null != var5) {
                        var5.field_vb = 0;
                        var5 = (Sentinel) (EmailSyntaxValidator.field_s.sentinels.next((byte) -80));
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
                    (DropTargetWidget.isNonNegative(LoginForm.field_T, param0 ^ 120))) {
                    GameKeyHandler.field_e[LoginForm.field_T].updateScreen(true);
                    if (var8 != 0) {
                      LoginForm.field_U = LoginForm.field_U + 1;
                      if (LoginForm.field_U == 20) {
                        QuickChatHelpDialog.switchToRequestedScreen(true);
                      }
                    }
                  }
                }
              } else {
                LoginForm.field_U = LoginForm.field_U + 1;
                if (LoginForm.field_U == 20) {
                  QuickChatHelpDialog.switchToRequestedScreen(true);
                }
              }
            }
            if ((decompiledFrameCompleted2) && (WeightedCacheEntry.field_H &&
              !SectorCacheStore.field_n &&
              !TextLayout.field_d)) {
              if (PendingPackedReply.field_y &&
                MusicTrackHelpers.field_g) {
                var3_int = 0;
              }
              BenefitsScreenHelpers.updateLobbyAndFlushRequests(13, var3_int != 0);
              if (CombatWorld.field_G ||
                PendingPackedReply.field_y) {
                LoginHandshakeHelpers.drawChatPanelAt((byte) 38, var4 != 0, 320, 180);
              }
              if (CombatWorld.field_G &&
                null != CachedTextLayout.field_A) {
                CachedTextLayout.field_A.updateGame(param0 ^ 37, var4 != 0);
              }
              if (PendingPackedReply.field_y) {
                BoundedUrlRequest.field_i.updateGame(-121, var4 != 0);
              }
              while (UiContainer.pollKeyEvent(22759)) {
                boolean decompiledFrameRemainder0 = true;
                if (TextHotspotRegion.field_v) {
                  if (PendingPackedReply.field_y ||
                    CombatWorld.field_G) {
                    decompiledFrameRemainder0 = !(!TextWidgetPainter.handleFrontEndKey(13, 15, 12, false));
                    if ((decompiledFrameRemainder0) &&
                      (var8 == 0)) {
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    ArchiveLoadSequence.dispatchKeyInput(13, (byte) 99, 12, 15);
                    decompiledFrameRemainder0 = (var8 != 0);
                  }
                }
                if ((decompiledFrameRemainder0) && ((PendingPackedReply.field_y ||
                  CombatWorld.field_G) && (MusicTrackHelpers.field_g ||
                  NameAvailabilityValidator.field_q == 80 ||
                  NameAvailabilityValidator.field_q == 10) && TextWidgetPainter.handleFrontEndKey(13, 15, 12, false))) {
                  continue;
                }
                stackIn_179_0 = MusicTrackHelpers.field_g;
                if (var8 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_179_0) {
                  continue;
                }
                if (CombatWorld.field_G) {
                  CachedTextLayout.field_A.handleKeyInput(73);
                }
                if (!PendingPackedReply.field_y) {
                  continue;
                }
                BoundedUrlRequest.field_i.handleKeyInput(51);
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_179_0 = WeightedCacheEntry.field_H;
            }
            if (!stackIn_179_0) {
              IntKeyLookup.tickOverlayAnimations((byte) -66);
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
            var7 = RequestResendHelpers.field_e + 120 * var6 / var5_int;
            SentinelDesigner.layoutLobbyBannerAt(0, var7);
            if (SolidSpriteHelpers.field_b.first(13058) != null) {
              fieldTemp$0 = PendingPackedReply.field_o + 1;
              PendingPackedReply.field_o = PendingPackedReply.field_o + 1;
              if (fieldTemp$0 == 500) {
                PendingPackedReply.field_o = 0;
                SolidSpriteHelpers.field_b.removeFirst(true);
              }
            }
          }
          if (param0 != 120) {
            this.openArchives(-19);
          }
          if (GzipDecoder.field_g == -3) {
            SettingSearchHelpers.field_c = null;
            var3 = GrowableIntList.field_l;
            var4_ref_String__ = new String[]{var3};
            var5_array = new int[var4_ref_String__.length][];
            var5_array[0] = DesignerPageTables.field_b;
            var6 = 1;
            while (true) {
              if (var6 < var4_ref_String__.length) {
                var5_array[var6] = DesignerPageTables.field_b;
                var6++;
                if (var8 == 0) {
                  continue;
                }
              } else {
                var6 = 0;
              }
              break;
            }
            var7 = OptionMaskHelpers.field_g;
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
            MusicTrackHelpers.field_g = false;
            stackIn_251_0 = null;
            stackIn_251_1 = null;
            stackIn_251_2 = false;
            stackIn_251_3 = var6;
            stackIn_251_4 = 1;
            stackIn_251_5 = var4_ref_String__;
            stackIn_251_6 = 0;
            stackIn_251_7 = false;
            stackIn_251_8 = var5_array;
            if (-1 != OptionMaskHelpers.field_g) {
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
            IterableNodeHashTable.switchScreen(-1, var7 != 0, -1, 0);
            Sprite.field_k = true;
          }
          if (-4 == GzipDecoder.field_g) {
            ClockAndCookieHelpers.field_g.writeCipheredOpcode(63, (byte) -117);
            ClockAndCookieHelpers.field_g.position = ClockAndCookieHelpers.field_g.position + 1;
            var3_int = ClockAndCookieHelpers.field_g.position;
            ClockAndCookieHelpers.field_g.writeByte((byte) 124, DesignerPageTables.field_b.length);
            var4 = 0;
            while (true) {
              if (var4 < DesignerPageTables.field_b.length) {
                ClockAndCookieHelpers.field_g.writeByte((byte) 127, DesignerPageTables.field_b[var4]);
                var4++;
                if (var8 == 0) {
                  continue;
                }
              } else {
                ClockAndCookieHelpers.field_g.backpatchByteLength((byte) 111, ClockAndCookieHelpers.field_g.position - var3_int);
                ClockAndCookieHelpers.field_g.writeCipheredOpcode(9, (byte) -117);
                SectorCacheStore.field_n = true;
                GzipDecoder.field_g = LoginForm.field_T;
              }
              break;
            }
            EmailCredentials.field_i = AudioService.field_h;
          }
          if (GzipDecoder.field_g == -5) {
            ChatMessage.sendShortSetting((byte) -43, 11, LoginEncryptionHelpers.field_b.getGameId(-26));
            TextLayout.field_d = true;
            GzipDecoder.field_g = LoginForm.field_T;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var3_ref), "SteelSentinels.SA(" + param0 + ',' + param1 + ')');
        }
    }

    final void initializeClient(int param0) {
        RuntimeException runtimeException = null;
        MidiPcmStream var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.initializeFramework(14, false, 5000, 71, 1, 0, 4, 2);
          var2 = new MidiPcmStream();
          var2.setChannelDefaultProgram(128, (byte) -123, 9);
          DisplayNameAndAudioHelpers.initializeAudio(-31, IterableDualNodeDeque.field_i, 22050, var2, true, (java.awt.Component) ((Object) ArchiveLoadStep.field_n));
          this.configureOptionalPacketHandlers(1, true, true, false, true, true, false);
          LoadoutHelpers.field_d = FunOrbClient.field_s;
          HuffmanDecoder.field_b = BirthDateEntryPanel.field_ab;
          SocketJs5Transport.field_B[66] = 1;
          SocketJs5Transport.field_B[61] = 1;
          SocketJs5Transport.field_B[67] = 32;
          NanoTickClock.field_x = MarkerSliderPainter.field_j;
          if (param0 != 26689) {
            this.updateClient(-47);
          }
          SocketJs5Transport.field_B[57] = -2;
          SocketJs5Transport.field_B[71] = 12;
          SocketJs5Transport.field_B[72] = 2;
          SocketJs5Transport.field_B[78] = -1;
          DesignerPageTables.field_b = ReflectionCheck.field_x;
          SoundAndUrlHelpers.field_b = SectorCacheStore.field_o;
          SocketJs5Transport.field_B[80] = 2;
          SocketJs5Transport.field_B[70] = 1;
          SocketJs5Transport.field_B[76] = 5;
          SocketJs5Transport.field_B[73] = 21;
          SocketJs5Transport.field_B[58] = -2;
          SocketJs5Transport.field_B[63] = 1;
          SocketJs5Transport.field_B[77] = -1;
          QuickChatHelpDialog.field_cc = FriendListHelpers.field_a;
          IconLookupHelpers.field_b = DiskCacheWorker.field_h;
          SocketJs5Transport.field_B[60] = -1;
          SocketJs5Transport.field_B[74] = 1;
          SocketJs5Transport.field_B[64] = 1;
          SocialPacketHelpers.field_b = DesignerPageTables.field_h;
          SocketJs5Transport.field_B[65] = 1;
          SocketJs5Transport.field_B[62] = 4;
          SocketJs5Transport.field_B[69] = 19;
          SocketJs5Transport.field_B[79] = 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "SteelSentinels.W(" + param0 + ')');
        }
    }

    public SteelSentinels() {
    }

    final void updateClient(int param0) {
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
          SoundCache.getInputFrameCount(-108);
          ScrollContainer.field_Vb = DateInputWidget.getPointerIdleTicks((byte) -86);
          Js5Transport.serviceAudio(false);
          if (RewardValueHelpers.field_c != null &&
            RewardValueHelpers.field_c.field_b) {
            SoundCache.exitFullscreen(param0 - 2);
            QuickChatPopupHelpers.refreshQuickChatPopupMenu(-5213);
          }
          if (param0 != 2) {
            this.init();
          }
          stackIn_13_1 = 5;
          stackIn_14_2 = (RewardValueHelpers.field_c != null);
          this.serviceFramework(stackIn_13_1, stackIn_14_2);
          if (MenuInputState.field_f) {
            this.openArchives(105);
            MenuInputState.field_f = false;
          }
          MouseWheelInput.field_c = MouseWheelInput.field_c + 1;
          if (QuickChatHelpDialog.shouldShowBootstrapLoadingScreen(0)) {
            this.updateLoginFlow(113);
            if (QuickChatHelpDialog.shouldShowBootstrapLoadingScreen(0)) {
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (SceneWidget.field_pb) {
            if (QuickChatCategoryCache.isPlayerDataReady(false)) {
              if (QuickChatMenu.isLegacyMenuOpen(true)) {
                if (SocialPacketHelpers.field_i == SocialPacketHelpers.field_h) {
                  var2_int = SocialListUiHelpers.pollMessageMenuSelection(0);
                  switch (var2_int) {
                    case 2:
                      SoundCache.exitFullscreen(0);
                    default:
                      break;
                    case 4:
                      CachedTextLayout.field_y = true;
                      DebouncedValidator.setDesignerMode(0, ValidationIndicator.field_bb, param0 + 8);
                      if (var15 == 0) {
                        break;
                      }
                    case 3:
                      CachedTextLayout.field_y = false;
                      GradientOutlineTextPainter.requestFullscreen(-4, true);
                      break;
                  }
                  this.processGameTick(param0 + 118, true);
                  decompiledFrameRemainder0 = (var15 != 0);
                }
                if (decompiledFrameRemainder0) {
                  this.processGameTick(param0 + 118, false);
                  decompiledFrameRemainder0 = (var15 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (!StatSubmission.isReconnectStage((byte) 100)) {
                  if (!LoginStateQueries.isMessageOverlayShown(-121)) {
                    this.processGameTick(120, false);
                    decompiledFrameRemainder0 = (var15 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (SocialPacketHelpers.field_i == SocialPacketHelpers.field_h) {
                      var2_int = PendingAckRequest.pollPopupMenuSelection((byte) 90);
                      if (var2_int == 1) {
                        ArchiveRequest.field_E = true;
                        DebouncedValidator.setDesignerMode(0, BirthDateEntryPanel.field_Q, param0 + 8);
                      }
                      this.processGameTick(param0 + 118, true);
                      decompiledFrameRemainder0 = (var15 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      this.processGameTick(param0 + 118, false);
                      decompiledFrameRemainder0 = (var15 != 0);
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  stackIn_77_1 = (null != RewardValueHelpers.field_c);
                  var2_int = this.pollAccountUiActions(stackIn_77_1, -3836);
                  if (var2_int == 1 ||
                    var2_int == 2) {
                    if (RewardValueHelpers.field_c != null) {
                      SoundCache.exitFullscreen(0);
                    }
                    if (var2_int == 2) {
                      NameTable.openQuitPage(true, Projectile.getApplet((byte) -21));
                    }
                  }
                  this.processGameTick(120, true);
                  if (var15 != 0) {
                    NotificationMessage.pollUnlockStateReply(param0 + 103);
                    ProxySocketConnector.serviceAccountInput(MeshMaterial.field_d, (byte) 104);
                    if (this.loadClientResources((byte) -52)) {
                      SceneWidget.field_pb = true;
                    }
                  }
                }
              }
            } else {
              NotificationMessage.pollUnlockStateReply(param0 + 103);
              if (var15 != 0) {
                ProxySocketConnector.serviceAccountInput(MeshMaterial.field_d, (byte) 104);
                if (this.loadClientResources((byte) -52)) {
                  SceneWidget.field_pb = true;
                }
              }
            }
          } else {
            ProxySocketConnector.serviceAccountInput(MeshMaterial.field_d, (byte) 104);
            if (this.loadClientResources((byte) -52)) {
              SceneWidget.field_pb = true;
            }
          }
          if (!ByteArrayPoolHelpers.isAccountCreationMode(92)) {
            do {
              var2 = (StatSubmission) (ChatHistoryAllocator.field_b.removeFirst(true));
              if (var2 == null) {
                if (var15 == 0) {
                  break;
                }
              } else {
                ProxySocketConnector.submitScoreRecord(4, (byte) 123, (StatSubmission) (var2));
              }
            } while (var15 == 0);
          }
          if (!ByteArrayPoolHelpers.isAccountCreationMode(74) &&
            Explosion.field_P != 0) {
            EmailFormatError.sendPendingStatUpdates((byte) -109);
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!PacketLoopHelpers.processIncomingPackets((byte) 54, SocketJs5Transport.field_B)))) {
            stackIn_440_0 = ArrayWidgetContainer.field_N;
            stackIn_440_1 = 9;
            if (var15 == 0) {
              if (stackIn_440_0 == stackIn_440_1) {
                QuickChatHelpDialog.switchToRequestedScreen(true);
                GzipDecoder.field_g = 11;
                SectorCacheStore.field_n = false;
                UiTheme.field_s = LoginConnectionStage.field_d.readString(1);
                continue;
              }
              if (ArrayWidgetContainer.field_N == 14) {
                QuickChatHelpDialog.switchToRequestedScreen(true);
                MeshMaterial.field_i = LoginEncryptionHelpers.computeLoadoutFlags(DesignerPageTables.field_b, DraggableWidget.field_G, (byte) 44);
                DelayedServerPacket.field_w[1] = (byte) 0;
                if ((MeshMaterial.field_i & SectorCacheStore.field_o[1][DelayedServerPacket.field_w[1]]) == 0) {
                  DelayedServerPacket.field_w[1] = (byte) 1;
                  if (SpriteLoadingHelpers.field_b > 0) {
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
                BufferedSocket.initializeLobbyState(DirectByteStorage.nextPowerOfTwo(2000, (byte) -32), DialWidget.field_db.length, SessionUiHelpers.getActiveWidget((byte) 50), 1024, DirectByteStorage.nextPowerOfTwo(12, (byte) -32), AccountTermsPanel.getActiveTabContent((byte) -127), ImageProducerRasterBuffer.field_u, (byte) -22, MidiPcmStream.getScrollContentWidget(3443), 150);
                Bzip2State.bindLobbyLists((byte) -98, HighscoreSubmission.getFriendListContent(800), ChatPanelSetupHelpers.getSocialListContent((byte) 121));
                SectorCacheStore.field_n = false;
                GzipDecoder.field_g = -2;
                WeightedCacheEntry.field_H = true;
                continue;
              }
              if (ArrayWidgetContainer.field_N == 15) {
                if (WeightedCacheEntry.field_H) {
                  QuickChatHelpDialog.switchToRequestedScreen(true);
                  TextButton.closeTransientDialogs(param0 ^ -12163);
                  IsaacRandom.clearChatHistory((byte) 124);
                  Sprite.field_k = false;
                  PendingPackedReply.field_y = false;
                  GzipDecoder.field_g = 0;
                  NodeIterator.field_d = true;
                  CombatWorld.field_G = false;
                  WeightedCacheEntry.field_H = false;
                  SettingSearchHelpers.field_e = true;
                  DateOfBirthValidator.closeAccountOverlay(103);
                }
                TextLayout.field_d = false;
                SectorCacheStore.field_n = false;
                continue;
              }
              if (ArrayWidgetContainer.field_N == 10 &&
                WeightedCacheEntry.field_H) {
                SocialPacketHelpers.handleSocialListPacket(11247);
                continue;
              }
              if (ArrayWidgetContainer.field_N == 80) {
                var2_int = LoginConnectionStage.field_d.readUnsignedByte((byte) -123);
                var3 = (byte)(255 & LoginConnectionStage.field_d.readUnsignedByte((byte) -123));
                if (null == LoginEncryptionHelpers.field_b) {
                  continue;
                }
                if (0 != var2_int) {
                  LoginEncryptionHelpers.field_b.field_Sb[var2_int] = (byte) var3;
                  continue;
                }
                LoginEncryptionHelpers.field_b.field_Ub = var3;
                DebouncedValidator.field_b[0] = var3;
                continue;
              }
              if (ArrayWidgetContainer.field_N == 11) {
                var2 = AgeValidator.readLoginReplyWithIntGuard(-62, false);
                WeightedCacheEntry.acceptChatMessage((ChatMessage) (var2), -92);
                if (HuffmanDecoder.field_a != 1) {
                  continue;
                }
                if (BoundedUrlRequest.field_i == null) {
                  continue;
                }
                if (ChatLineMenuHelpers.field_e == null) {
                  continue;
                }
                var3_ref = "";
                if (null != DialWidgetPainter.field_g) {
                  var4_ref = DialWidgetPainter.field_g;
                  if (UrlAndReplyHelpers.field_b == 1) {
                    var4_ref = "<img=0>" + (String) (var4_ref);
                  }
                  if (2 == UrlAndReplyHelpers.field_b) {
                    var4_ref = "<img=1>" + (String) (var4_ref);
                  }
                  var3_ref = (String) (var4_ref) + ": ";
                }
                var4_ref = (String) (var3_ref) + BitmapFont.escapeMarkup(WeightedCacheEntry.field_F);
                if (((ChatMessage) (var2)).field_g ||
                  !SocialStateHelpers.isIgnored(-122, ((ChatMessage) (var2)).field_p)) {
                  LinkButtonPainter.addTimedMessage(48127, (String) (var4_ref), (byte) 124);
                  NameValidationHelpers.field_e = NameValidationHelpers.field_e - 1;
                }
                continue;
              }
              if (ArrayWidgetContainer.field_N == 12) {
                AgeValidator.readLoginReplyWithIntGuard(-127, true);
                WeightedCacheEntry.acceptChatMessage(new ChatMessage(true), -93);
                continue;
              }
              if (ArrayWidgetContainer.field_N == 67) {
                var2 = ViewportController.createEightIntArray(true);
                var3 = 0;
                while (var3 < java.lang.reflect.Array.getLength(var2)) {
                  ((int[]) (var2))[var3] = LoginConnectionStage.field_d.readInt(0);
                  var3++;
                }
                var3_ref = var2;
                var4_ref = DirectByteStorage.field_m;
                var5 = 0;
                while (var5 < 8) {
                  ((int[]) (var3_ref))[var5] = ClientUiHelpers.bitAnd(((int[]) (var3_ref))[var5], ~((int[]) (var4_ref))[var5]);
                  var5++;
                }
                if (NameValidationHelpers.field_h) {
                  var3_ref = PatchNoteUsage.field_t;
                  var4_ref = var2;
                  var5 = 0;
                  while (var5 < 8) {
                    ((int[]) (var3_ref))[var5] = DateOfBirthValidator.bitOr(((int[]) (var3_ref))[var5], ((int[]) (var4_ref))[var5]);
                    var5++;
                  }
                }
                var3_ref = DirectByteStorage.field_m;
                var4_ref = var2;
                var5 = 0;
                while (var5 < 8) {
                  ((int[]) (var3_ref))[var5] = DateOfBirthValidator.bitOr(((int[]) (var3_ref))[var5], ((int[]) (var4_ref))[var5]);
                  var5++;
                }
                Projectile.refreshUnlockedPartFlags((byte) 10);
                continue;
              }
              if (ArrayWidgetContainer.field_N == 60) {
                PasswordFieldPainter.field_v = LoginConnectionStage.field_d.readInt(0);
                DraggableWidget.field_G = LoginConnectionStage.field_d.readInt(0);
                var2_int = 0;
                while (var2_int < 4) {
                  PendingAckRequest.field_D[var2_int] = LoginConnectionStage.field_d.readInt(0);
                  var2_int++;
                }
                var2_int = 0;
                while (2 > var2_int) {
                  ArchiveRequest.field_D[var2_int] = LoginConnectionStage.field_d.readInt(0);
                  var2_int++;
                }
                var2_int = 0;
                while (var2_int < LoginDialogHelpers.field_k.length) {
                  LoginDialogHelpers.field_k[var2_int] = 0;
                  var2_int++;
                }
                DateOfBirthValidator.clearSceneReferences(-30);
                continue;
              }
              if (ArrayWidgetContainer.field_N == 77) {
                var2_int = LoginConnectionStage.field_d.readUnsignedByte((byte) -123);
                CombatWorld.field_S = new int[var2_int];
                var3 = 0;
                while (var2_int > var3) {
                  CombatWorld.field_S[var3] = LoginConnectionStage.field_d.readUnsignedByte((byte) -123);
                  var3++;
                }
                continue;
              }
              if (ArrayWidgetContainer.field_N == 78) {
                var2_int = 0;
                while (var2_int < 3) {
                  QuickChatParameterType.field_f[var2_int] = LoginConnectionStage.field_d.readUnsignedByte((byte) -65);
                  var2_int++;
                }
                var2_int = 0;
                while (true) {
                  if (TrigonometryHelpers.field_a.length > var2_int) {
                    TrigonometryHelpers.field_a[var2_int] = LoginConnectionStage.field_d.readUnsignedShort((byte) -60);
                    var2_int++;
                    continue;
                  }
                  break;
                }
                if ((16 & QuickChatParameterType.field_f[0]) != 0) {
                  stackIn_278_0 = 1;
                } else {
                  stackIn_278_0 = 0;
                }
                var2_int = stackIn_278_0;
                QuickChatParameterType.field_f[0] = ClientUiHelpers.bitAnd(QuickChatParameterType.field_f[0], 15);
                if (PasswordRuleHelpers.field_d <= QuickChatParameterType.field_f[0]) {
                  if (var2_int == 0) {
                    NodeIterator.field_f = 1;
                  } else {
                    NodeIterator.field_f = 2;
                  }
                } else {
                  NodeIterator.field_f = 0;
                }
                if (!PacketBuffer.needsSpecialPartTutorial((byte) -79)) {
                  continue;
                }
                ClientGlobals.field_a = CombatWorld.field_k;
                continue;
              }
              if (ArrayWidgetContainer.field_N == 73) {
                var2_int = LoginConnectionStage.field_d.readUnsignedByte((byte) -63) - 1;
                var3 = LoginConnectionStage.field_d.readInt(0);
                var4 = LoginConnectionStage.field_d.readInt(0);
                var5 = LoginConnectionStage.field_d.readInt(0);
                var6 = LoginConnectionStage.field_d.readInt(0);
                var7 = LoginConnectionStage.field_d.readInt(0);
                if (var2_int < 2) {
                  SettingSearchHelpers.field_c = HighscoreSubmissionFactory.createHighscoreSubmission(var6, var4, var5, -var2_int + 65535, var7, param0 ^ 19, var2_int + 0, new int[]{var3}, 3);
                }
                LoginCredentialHelpers.field_d = null;
                DisplayNameAndAudioHelpers.ensureDefaultHighscoreTable(true);
                SolidSpriteHelpers.field_b.addLast(3, new NotificationMessage((RgbSprite) null, SocketConnector.formatTemplate(PasswordValidator.field_q, param0 - 102, new String[]{Integer.toString(var3 / 516)})));
                continue;
              }
              if (ArrayWidgetContainer.field_N == 72) {
                var2_int = LoginConnectionStage.field_d.readUnsignedShort((byte) -60);
                PasswordFieldPainter.field_v = PasswordFieldPainter.field_v + var2_int;
                if (var2_int <= 0) {
                  continue;
                }
                DateOfBirthValidator.clearSceneReferences(param0 - 44);
                MusicPatchNode.field_F = var2_int;
                continue;
              }
              if (ArrayWidgetContainer.field_N == 74 ||
                79 == ArrayWidgetContainer.field_N) {
                var2_int = LoginConnectionStage.field_d.readUnsignedByte((byte) -113);
                var3_ref = MarkerSliderPainter.field_o;
                if (79 == ArrayWidgetContainer.field_N) {
                  var3_ref = PendingByteArrayRequest.field_r;
                }
                SolidSpriteHelpers.field_b.addLast(3, new NotificationMessage((RgbSprite) null, SocketConnector.formatTemplate((String) (var3_ref), -105, new String[]{NameTable.field_e[var2_int]})));
                continue;
              }
              if (ArrayWidgetContainer.field_N == 70) {
                LoginConnectionStage.field_d.readUnsignedByte((byte) -67);
                continue;
              }
              if (ArrayWidgetContainer.field_N == 57 ||
                ArrayWidgetContainer.field_N == 58) {
                QuickChatHelpDialog.switchToRequestedScreen(true);
                var2_int = LoginConnectionStage.field_d.readInt(param0 - 2);
                var3 = LoginConnectionStage.field_d.readUnsignedByte((byte) -110);
                var4 = LoginConnectionStage.field_d.readUnsignedByte((byte) -74);
                var5 = LoginConnectionStage.field_d.readUnsignedByte((byte) -90);
                var6 = LoginConnectionStage.field_d.readUnsignedByte((byte) -102);
                stackIn_330_0 = ((var6 & 1) == 0) ? 0 : 1;
                var7 = stackIn_330_0;
                stackIn_334_0 = ((2 & var6) == 0) ? 0 : 1;
                var8 = stackIn_334_0;
                stackIn_338_0 = (0 == LoginConnectionStage.field_d.readUnsignedByte((byte) -81)) ? 0 : 1;
                var9 = stackIn_338_0;
                var10 = new String[LoginConnectionStage.field_d.readUnsignedByte((byte) -90)];
                var11_int = -2;
                var12 = new int[var10.length][];
                var13_int = 0;
                while (true) {
                  stackIn_340_0 = ~var13_int;
                  stackIn_340_1 = ~var10.length;
                  if (stackIn_340_0 > stackIn_340_1) {
                    var10[var13_int] = LoginConnectionStage.field_d.readPrefixedString((byte) 126);
                    array$0 = new int[LoginConnectionStage.field_d.readUnsignedByte((byte) -63)];
                    var12[var13_int] = array$0;
                    stackIn_351_0 = 0;
                    var14 = stackIn_351_0;
                    while (var14 < var12[var13_int].length) {
                      var12[var13_int][var14] = LoginConnectionStage.field_d.readUnsignedByte((byte) -123);
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
                var11_int = LoginConnectionStage.field_d.readByte((byte) -2);
                OptionMaskHelpers.field_g = -1;
                IconTextComponent.field_Yb = -2;
                MusicTrackHelpers.field_g = false;
                TextHotspotRegion.field_v = false;
                SettingSearchHelpers.field_c = null;
                stackIn_351_0 = -1;
                if (stackIn_351_0 == var11_int) {
                  var11_int = -2;
                }
                var13 = new GameplayController(true, var2_int, var3, var10, var11_int, var9 != 0, var12, var4, var5, var7 != 0, var8 != 0);
                var13.field_w = LoginConnectionStage.field_d.readInt(0);
                if (57 != ArrayWidgetContainer.field_N) {
                  CachedTextLayout.field_A = var13;
                  CombatWorld.field_G = true;
                  QuickChatHelpDialog.showAccountScene(0);
                } else {
                  BoundedUrlRequest.field_i = var13;
                  PendingPackedReply.field_y = true;
                  SocialPacketHelpers.updateWorldMenuLabel(2);
                  DraggableWidget.updateMatchStatusCaption(-1);
                  QuickChatHelpDialog.showAccountScene(0);
                }
                GzipDecoder.field_g = -1;
                TextLayout.field_d = false;
                Sprite.field_k = true;
                continue;
              }
              if (ArrayWidgetContainer.field_N == 59) {
                if (PendingPackedReply.field_y ||
                  CombatWorld.field_G) {
                  QuickChatHelpDialog.switchToRequestedScreen(true);
                  if (PendingPackedReply.field_y) {
                    BoundedUrlRequest.field_i.exitToMenuScreen((byte) -128, false);
                  }
                  SettingSearchHelpers.field_e = true;
                  GzipDecoder.field_g = -2;
                  CombatWorld.field_G = false;
                  PendingPackedReply.field_y = false;
                  Sprite.field_k = false;
                  TextHotspotRegion.field_v = true;
                  NameValidationHelpers.field_e = 0;
                  DateOfBirthValidator.closeAccountOverlay(104);
                }
                TextLayout.field_d = false;
                continue;
              }
              var2 = null;
              if (!PendingPackedReply.field_y) {
                if (CombatWorld.field_G) {
                  var2 = CachedTextLayout.field_A;
                }
              } else {
                var2 = BoundedUrlRequest.field_i;
              }
              if (null != var2) {
                if (ArrayWidgetContainer.field_N == 61) {
                  var3 = LoginConnectionStage.field_d.readUnsignedByte((byte) -117);
                  var4_ref = ((GameplayController) (var2)).world.findSentinelForPlayer(var3, -128);
                  var5_ref_je = (SentinelCommand) (((Sentinel) (var4_ref)).secondaryCommands.last(1063677678));
                  if (var5_ref_je != null) {
                    var5_ref_je.unlink(param0 ^ 6);
                  }
                  var5_ref_je = (SentinelCommand) (((Sentinel) (var4_ref)).pendingCommands.last(1063677678));
                  if (var5_ref_je == null) {
                    continue;
                  }
                  var5_ref_je.unlink(4);
                  continue;
                }
                if (ArrayWidgetContainer.field_N == 69) {
                  var3 = LoginConnectionStage.field_d.readUnsignedByte((byte) -85);
                  var4 = LoginConnectionStage.field_d.readUnsignedByte((byte) -80);
                  var5 = LoginConnectionStage.field_d.readUnsignedByte((byte) -120);
                  var6 = LoginConnectionStage.field_d.readInt(0);
                  var7 = LoginConnectionStage.field_d.readInt(0);
                  var8 = LoginConnectionStage.field_d.readInt(param0 ^ 2);
                  var9 = LoginConnectionStage.field_d.readInt(param0 ^ 2);
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
                if (ArrayWidgetContainer.field_N == 76) {
                  var3 = LoginConnectionStage.field_d.readUnsignedByte((byte) -120);
                  var4 = LoginConnectionStage.field_d.readInt(0);
                  ((GameplayController) (var2)).world.cancelPendingCommands(var4, 28669, var3);
                  continue;
                }
                if (ArrayWidgetContainer.field_N == 71) {
                  if (((GameplayController) (var2)).field_i - 100 > ((GameplayController) (var2)).field_w &&
                    ((GameplayController) (var2)).world.simulationTick < ((GameplayController) (var2)).field_w) {
                    ((GameplayController) (var2)).field_w = -100 + ((GameplayController) (var2)).field_i;
                  }
                  ((GameplayController) (var2)).field_i = LoginConnectionStage.field_d.readInt(param0 ^ 2);
                  var3 = LoginConnectionStage.field_d.readInt(0);
                  var4 = LoginConnectionStage.field_d.readInt(param0 - 2);
                  if (((GameplayController) (var2)).field_l >= ((GameplayController) (var2)).world.simulationTick) {
                    continue;
                  }
                  ((GameplayController) (var2)).field_j = var3;
                  ((GameplayController) (var2)).field_l = var4;
                  continue;
                }
                if (62 == ArrayWidgetContainer.field_N) {
                  ((GameplayController) (var2)).field_i = LoginConnectionStage.field_d.readInt(0);
                  ((GameplayController) (var2)).field_z = true;
                  continue;
                }
                if (ArrayWidgetContainer.field_N == 63) {
                  ((GameplayController) (var2)).world.field_V = LoginConnectionStage.field_d.readUnsignedByte((byte) -92);
                  if (null == BoundedUrlRequest.field_i) {
                    continue;
                  }
                  SocialPacketHelpers.updateWorldMenuLabel(2);
                  continue;
                }
                if (ArrayWidgetContainer.field_N == 64) {
                  ((GameplayController) (var2)).world.field_hb = LoginConnectionStage.field_d.readUnsignedByte((byte) -111);
                  continue;
                }
                if (ArrayWidgetContainer.field_N == 65) {
                  ((GameplayController) (var2)).world.field_X = LoginConnectionStage.field_d.readUnsignedByte((byte) -91);
                  if (null == BoundedUrlRequest.field_i) {
                    continue;
                  }
                  DraggableWidget.updateMatchStatusCaption(-1);
                  continue;
                }
                if (66 == ArrayWidgetContainer.field_N) {
                  ((GameplayController) (var2)).field_N = LoginConnectionStage.field_d.readUnsignedByte((byte) -85);
                  if (null == BoundedUrlRequest.field_i) {
                    continue;
                  }
                  DraggableWidget.updateMatchStatusCaption(-1);
                  continue;
                }
              }
              this.dispatchCommonPacket(param0 + 50);
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            SpriteDrawHelpers.flushOutgoingPackets(0, 0);
            stackIn_440_0 = -2;
            stackIn_440_1 = LoginForm.field_T;
          }
          if (stackIn_440_0 == stackIn_440_1 &&
            GzipDecoder.field_g == -2) {
            TextHotspotRegion.field_v = true;
          }
          if (TextHotspotRegion.field_v) {
            NameValidationHelpers.field_e = 0;
          }
          if (LoginStateQueries.isLoginFormActive(16731221)) {
            var2_int = this.pollGameConnection((byte) -112);
            if (0 == var2_int ||
              var2_int == 1) {
              DualNodeDequeIterator.resendQueuedRequests(2, -26077);
              DesignerPageTables.resendScoreRequests(true, 3);
              LobbyGame.resendAchievementMessages((byte) 86, 4);
              RequestResendHelpers.resendQueuedRequests(false, 6);
              ListRequestHelpers.resendQueuedListRequests(param0 - 74, 7);
              EmailValidationHelpers.resetReflectionCheckQueue((byte) -92);
              if (1 != var2_int) {
                if (WeightedCacheEntry.field_H) {
                  PendingPackedReply.field_y = false;
                  Sprite.field_k = false;
                  CombatWorld.field_G = false;
                  SettingSearchHelpers.field_e = true;
                  NodeIterator.field_d = true;
                  if (!PendingPackedReply.field_y) {
                    IterableNodeHashTable.switchScreen(0, false, param0 - 3, 0);
                    if (var15 != 0) {
                      UiTheme.field_s = PacketLoopHelpers.field_e;
                      IterableNodeHashTable.switchScreen(11, false, -1, 0);
                    }
                  } else {
                    UiTheme.field_s = PacketLoopHelpers.field_e;
                    IterableNodeHashTable.switchScreen(11, false, -1, 0);
                  }
                  QuickChatHelpDialog.switchToRequestedScreen(true);
                  GameKeyHandler.field_e[LoginForm.field_T].updatePointerSelection(false, 0, -102);
                  WeightedCacheEntry.field_H = false;
                  DateOfBirthValidator.closeAccountOverlay(12);
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
            if (!LoginStateQueries.isLoginFormActive(16731221)) {
              var3 = 0;
            }
            if (var3 != 0) {
              SessionExitHelpers.requestSessionExit(10);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) (var2), "SteelSentinels.DA(" + param0 + ')');
        }
    }

    final void releaseClientStatics(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          SteelSentinels.releaseStatics((byte) -10);
          NodeDeque.releaseStatics((byte) -29);
          LobbyGameDecoding.releaseStatics(0);
          FrameStyleHelpers.releaseStatics(true);
          PasswordRuleHelpers.releaseStatics((byte) -120);
          PopupMenuHelpers.releaseStatics(125);
          SceneWidget.releaseStatics(false);
          GameKeyHandler.releaseStatics((byte) 100);
          DesignerPageTables.releaseStatics(false);
          ClientErrorSupport.releaseStatics(false);
          DesignerPageSetup.releaseStatics(2);
          FunOrbClient.releaseStatics((byte) -111);
          ClientException.releaseStatics(false);
          GameApplet.releaseStatics(48);
          BoundedUrlRequest.releaseStatics((byte) -64);
          MouseInputHandler.releaseStatics(true);
          MouseWheelInput.releaseStatics(72);
          SoftwareRaster.releaseStatics();
          ResourceArchive.releaseStatics(false);
          ChatHistoryAllocator.releaseStatics(false);
          if (param0 < 22) {
            this.releaseClientStatics(48);
          }
          PacketBuffer.releaseStatics(-125);
          ClockAndCookieHelpers.releaseStatics(122);
          TeamColourTinter.releaseStatics(124);
          SessionExitHelpers.releaseStatics((byte) 84);
          SocialPacketHelpers.releaseStatics(127);
          ChatLineMenuHelpers.releaseStatics(80);
          KeyRoutingHelpers.releaseStatics(-67);
          UrlAndReplyHelpers.releaseStatics((byte) -34);
          TutorialStepTable.releaseStatics((byte) 56);
          ChatPanelHelpers.releaseStatics((byte) -119);
          ChatMessage.releaseStatics(2);
          LobbyStateHelpers.releaseStatics((byte) -88);
          ChatPanelSetupHelpers.releaseStatics((byte) -126);
          TickClock.releaseStatics(30);
          RasterBuffer.releaseStatics(690);
          ArchiveLoadSequence.releaseStatics(-1);
          FullscreenFocusCanvas.releaseStatics((byte) 30);
          ViewportController.releaseStatics((byte) -109);
          MembershipPromotionScreen.releaseStatics((byte) -82);
          SoundCache.releaseStatics(94);
          SentinelDesigner.releaseStatics((byte) -104);
          GameplayController.releaseStatics(750);
          ChatFilterPackingHelpers.releaseStatics(-107);
          LoginActionHelpers.releaseStatics(false);
          Js5Transport.releaseStatics((byte) -91);
          DiskCacheWorker.releaseStatics(-1);
          Js5ArchiveManager.releaseStatics((byte) -35);
          BufferedRandomAccessFile.releaseStatics(83);
          BufferedSocket.releaseStatics((byte) -45);
          MusicTrackHelpers.releaseStatics((byte) 79);
          IntrusiveNode.releaseStatics(4433);
          QuickChatPacketHelpers.releaseStatics(false);
          OptionMaskHelpers.releaseStatics(-1);
          TextAndBitHelpers.releaseStatics((byte) 80);
          ConditionalTextValue.releaseStatics(79);
          SettingSearchHelpers.releaseStatics(1);
          SocialStateHelpers.releaseStatics(-98);
          NumberParsingHelpers.releaseStatics((byte) 94);
          LoginCredentials.releaseStatics(-118);
          CipherPacketBuffer.releaseStatics(true);
          IsaacRandom.releaseStatics((byte) -94);
          SpriteDrawHelpers.releaseStatics(-102);
          ChatHistoryHelpers.releaseStatics((byte) 26);
          VerticalScrollbar.releaseStatics(0);
          SceneWidgetNode.releaseStatics((byte) 93);
          AssetDecoders.releaseStatics((byte) -60);
          CombatWorld.releaseStatics(0);
          ArticulatedPart.releaseStatics((byte) 20);
          MenuInputState.releaseStatics((byte) -18);
          SentinelAnimationEditor.releaseStatics(21841);
          NodeIterator.releaseStatics(5370);
          BitmapFont.releaseStatics();
          RequestResendHelpers.releaseStatics(-119);
          TrigonometryHelpers.releaseStatics(30706);
          QuickChatInputHelpers.releaseStatics(false);
          SentinelCommand.releaseStatics((byte) -110);
          Projectile.releaseStatics(31554);
          Sentinel.releaseStatics((byte) 58);
          BattleTerrain.releaseStatics(false);
          MidiPcmStream.releaseStatics(false);
          NodeHashTable.releaseStatics(96);
          MusicPatchNode.releaseStatics(0);
          MidiFileReader.releaseMessageTable();
          MusicPatchPcmStream.releaseStatics(-93);
          AudioOutput.releaseStatics();
          MusicCrossfadeStream.releaseStatics(false);
          LobbyGame.releaseStatics((byte) -65);
          DualNodeHashTable.releaseStatics((byte) -91);
          LobbyPlayer.releaseStatics(102);
          SocialRequestHelpers.releaseStatics((byte) 109);
          ArchiveIndex.releaseStatics(0);
          GzipDecoder.releaseStatics(-1);
          ArchiveProvider.releaseStatics(38);
          SpriteState.releaseStatics(573);
          DualNode.releaseStatics(8191);
          SpriteLoadingHelpers.releaseStatics(8192);
          SocialListUiHelpers.releaseStatics(0);
          ModalStack.releaseStatics((byte) 127);
          RegistrationRequestDialog.releaseStatics((byte) -29);
          LoadingProgressDialog.releaseStatics((byte) -47);
          LoginDialog.releaseStatics((byte) -111);
          AccountRequestDialog.releaseStatics((byte) 107);
          AccountRegistrationPanel.releaseStatics(false);
          AccountChoicePanel.releaseStatics(-48);
          LoginForm.releaseStatics(320);
          DisplayNameForm.releaseStatics(60);
          UiTheme.releaseStatics(103);
          ReflectionCheckHelpers.releaseStatics(-1);
          VorbisSample.releaseStatics();
          VorbisFloor.releaseStatics();
          InterfaceTextHelpers.releaseStatics((byte) -84);
          LoginStateQueries.releaseStatics(0);
          HighscoreSubmissionFactory.releaseStatics(true);
          Sprite.releaseStatics((byte) 66);
          PartInstruction.releaseStatics((byte) 17);
          FallingPickup.releaseStatics(-23261);
          MessageMenuHelpers.releaseStatics(-1);
          LoginCredentialHelpers.releaseStatics(-104);
          LoadoutHelpers.releaseStatics(0);
          IconLabelControl.releaseStatics(127);
          ContextMenu.releaseStatics(false);
          SocialListPanel.releaseStatics((byte) 91);
          PlayerContextMenu.releaseStatics(0);
          ReportAbuseDialog.releaseStatics(-114);
          LobbySetupHelpers.releaseStatics(1);
          HuffmanDecoder.releaseStatics(64);
          DisplayNameAndAudioHelpers.releaseStatics((byte) 37);
          FriendListHelpers.releaseStatics((byte) -83);
          SpriteFrame.releaseStatics(124);
          EmailValidationHelpers.releaseStatics(-1);
          GeneratedSpriteHelpers.releaseStatics(-111);
          AngleHelpers.releaseStatics((byte) -82);
          LoadingScreenHelpers.releaseStatics(true);
          TextAndMenuHelpers.releaseStatics((byte) -105);
          BirthDateEntryPanel.releaseStatics(true);
          NotificationMessage.releaseStatics(0);
          TableColumns.releaseStatics(-38);
          DualNodeDeque.releaseStatics((byte) 26);
          IconTextComponent.releaseStatics(15);
          SocialTabsPanel.releaseStatics(24);
          LoginEncryptionHelpers.releaseStatics(55);
          QuickChatHelpDialog.releaseStatics(-16);
          ParticleEffect.releaseStatics(-185837884);
          ReflectionCheck.releaseStatics((byte) 115);
          BoundedRandomAccessFile.releaseStatics(0);
          SolidSpriteHelpers.releaseStatics(-23333);
          QuickChatPopupHelpers.releaseStatics((byte) -88);
          BenefitsScreenHelpers.releaseStatics((byte) -112);
          AudioService.releaseStatics((byte) -63);
          SocketJs5Transport.releaseStatics(-2);
          Js5NetworkRequest.releaseStatics(10);
          SectorCacheStore.releaseStatics(15598);
          DiskCacheRequest.releaseStatics(-58);
          CachedArchiveProvider.releaseStatics(2);
          ChecksumAndFrameHelpers.releaseStatics(true);
          ArchiveRequest.releaseStatics((byte) 21);
          PopupMenuSupport.releaseStatics((byte) -114);
          AccountNoticeDialog.releaseStatics(0);
          MeshRasterState.releaseStatics();
          MeshMaterial.releaseStatics(-123);
          TriangleMesh.releaseStatics((byte) -117);
          SessionUiHelpers.releaseStatics(5);
          ClientUiHelpers.releaseStatics((byte) 24);
          SoundAndUrlHelpers.releaseStatics(true);
          LoadingStatusHelpers.releaseStatics(false);
          DelegatingCanvas.releaseStatics((byte) 61);
          LoadingCaptionHelpers.releaseStatics(23225);
          IntKeyLookup.releaseStatics((byte) -81);
          ByteStorage.releaseStatics(false);
          Bzip2Decoder.releaseStatics();
          Bzip2State.releaseStatics(-120);
          ByteArrayPoolHelpers.releaseStatics(42);
          PacketLoopHelpers.releaseStatics(0);
          CheckboxPainter.releaseStatics(true);
          StatefulTextPainter.releaseStatics(-21121);
          DialWidgetPainter.releaseStatics(0);
          MarkerSliderPainter.releaseStatics((byte) 105);
          TextLayout.releaseStatics(true);
          UiComponent.releaseStatics((byte) 19);
          TextButton.releaseStatics((byte) -105);
          SingleChildContainer.releaseStatics(475);
          ResizableModalPanel.releaseStatics((byte) 38);
          ModalPanel.releaseStatics((byte) 127);
          UiContainer.releaseStatics(-19969);
          TextSpriteHelpers.releaseStatics(-31914);
          MenuLayoutHelpers.releaseStatics(-3274);
          DefaultQuickChatCacheHook.releaseStatics(5);
          NameValidationHelpers.releaseStatics(0);
          QuickChatMenu.releaseStatics(-31097);
          QuickChatCategoryCache.releaseStatics((byte) -13);
          QuickChatPhraseCache.releaseStatics(272);
          QuickChatCategory.releaseStatics(1);
          QuickChatPhraseDefinition.releaseStatics(0);
          WeightedLruCache.releaseStatics((byte) 127);
          SocketConnector.releaseStatics(true);
          ProxyAuthenticationException.releaseStatics(-61);
          NanoTickClock.releaseStatics(0);
          ImageProducerRasterBuffer.releaseStatics(65280);
          SessionSeedHelpers.releaseStatics((byte) 99);
          DisplayMode.releaseStatics(-13);
          LoginHandshakeHelpers.releaseStatics((byte) -96);
          SynthInstrument.releaseStatics();
          PatchNoteUsage.releaseStatics((byte) 77);
          SentinelCommandSimulator.releaseStatics((byte) -98);
          Explosion.releaseStatics(-2107133436);
          WhirlpoolHasher.releaseStatics((byte) 121);
          RankingAndRasterHelpers.releaseStatics(false);
          TabbedPanel.releaseStatics((byte) -72);
          AccountNamePrompt.releaseStatics(true);
          MusicPatch.releaseStatics((byte) -73);
          MusicPatchEnvelope.releaseStatics(7);
          LabeledField.releaseStatics((byte) 67);
          ValidatedTextWidget.releaseStatics((byte) -108);
          EditableTextWidget.releaseStatics(true);
          ContentTransitionDialog.releaseStatics(-12930);
          StripedProgressBar.releaseStatics(-47);
          NameSuggestionsPanel.releaseStatics((byte) -42);
          TextHotspotWidget.releaseStatics(false);
          ValidationIndicator.releaseStatics(-30289);
          ValidationHelpWidget.releaseStatics(-3413);
          Checkbox.releaseStatics(108);
          TextFieldValidator.releaseStatics((byte) 103);
          RewardValueHelpers.releaseStatics((byte) 87);
          AccountTermsPanel.releaseStatics(false);
          DialWidget.releaseStatics((byte) -122);
          MarkerSlider.releaseStatics(32);
          LoginResultHelpers.releaseStatics(5);
          DateOfBirthValidator.releaseStatics(false);
          NumericDateInputWidget.releaseStatics(0);
          ArrayWidgetContainer.releaseStatics((byte) -68);
          DateInputWidget.releaseStatics(true);
          CachedTextLayout.releaseStatics(24);
          DirectByteStorage.releaseStatics(26);
          GrowableIntList.releaseStatics(122);
          DraggableWidget.releaseStatics(0);
          DropTargetWidget.releaseStatics(12);
          IterableNodeHashTable.releaseStatics((byte) -127);
          IterableDualNodeDeque.releaseStatics(true);
          WeightedCacheEntry.releaseStatics(-1008);
          QuickChatParameterType.releaseStatics(4314);
          StrongCacheEntry.releaseStatics(124);
          ProxySocketConnector.releaseStatics((byte) -117);
          AudioFilter.releaseStatics();
          LoginDialogHelpers.releaseStatics(false);
          NodeHashTableIterator.releaseStatics((byte) 22);
          DualNodeDequeIterator.releaseStatics((byte) 46);
          HighscoreTable.releaseStatics(90);
          HighscoreSubmission.releaseStatics(false);
          HighscoreColumnHeader.releaseStatics(108);
          RankingQuery.releaseStatics(20000000);
          PlayingSound.releaseStatics(100);
          PendingIntReplyRequest.releaseStatics(-89);
          ThreeSliceButtonPainter.releaseStatics(100);
          LinkButtonPainter.releaseStatics(false);
          GradientOutlineTextPainter.releaseStatics(9);
          PasswordFieldPainter.releaseStatics(-30874);
          SpriteCheckboxPainter.releaseStatics((byte) -86);
          AlphaContainer.releaseStatics(-13);
          SocialListEntry.releaseStatics(false);
          ArchiveLoadStep.releaseStatics(-104);
          PendingIntArrayRequest.releaseStatics(0);
          StatSubmission.releaseStatics((byte) 9);
          PendingByteArrayRequest.releaseStatics((byte) 127);
          PendingDataRequest.releaseStatics(false);
          NameCheckResult.releaseStatics(-127);
          LoginConnectionStage.releaseStatics(126);
          DelayedServerPacket.releaseStatics(-1341);
          LoginMethod.releaseStatics(7);
          UsernameCredentials.releaseStatics((byte) -119);
          AlternateUsernameCredentials.releaseStatics(28873);
          EmailCredentials.releaseStatics((byte) -116);
          TutorialStep.releaseStatics(false);
          ListRequestHelpers.releaseStatics(107);
          AccountRequestResult.releaseStatics((byte) -89);
          AccountMessagePanel.releaseStatics((byte) -90);
          RasterSnapshot.releaseStatics(-1);
          ClientGlobals.releaseStatics((byte) -27);
          NameTable.releaseStatics(-13375);
          LoadoutCostHelpers.releaseStatics((byte) 105);
          PendingPackedReply.releaseStatics(18601);
          PendingAckRequest.releaseStatics(3);
          WidgetStyleLayer.releaseStatics((byte) 12);
          TextLayoutLine.releaseStatics(-58);
          NameAvailabilityValidator.releaseStatics(1);
          PasswordValidator.releaseStatics((byte) -128);
          EmailSyntaxValidator.releaseStatics(18384);
          EmailAvailabilityValidator.releaseStatics((byte) 116);
          AgeValidator.releaseStatics(81);
          MatchingTextValidator.releaseStatics((byte) -113);
          IconLookupHelpers.releaseStatics(true);
          TextHotspotRegion.releaseStatics((byte) 29);
          TransitionTimerHelpers.releaseStatics((byte) 56);
          DebouncedValidator.releaseStatics(true);
          EmailFormatError.releaseStatics(8421504);
          this.field_t = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var2), "SteelSentinels.V(" + param0 + ')');
        }
    }

    static {
        field_I = "SPAWN DRONES";
        field_H = "Allow spectators?";
    }
}
