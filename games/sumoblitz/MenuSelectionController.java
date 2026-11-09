/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuSelectionController {
    static int[] field_h;
    private int repeatDelay;
    private int heldButton;
    int itemCount;
    private boolean mouseMode;
    static ResourceArchive field_c;
    private int pressedButton;
    private int keyCode;
    int selectedIndex;

    final static void createRendererAssets(boolean guard) {
        GraphicsToolkit var2 = MatchingTextValidator.field_h.getToolkit(-117);
        LegacyOpenGlEffect.field_c = var2.createFont(SocketConnector.field_a, SecondaryNodeHashTable.field_g, true);
        MessageDialog.field_db = var2.createFont(VertexStreamLayout.field_c, ArchiveLoadingStage.field_b, true);
        GameTrackPlayback.field_a = var2.createFont(AccountConnectionPhase.field_a, OpenGlTransparentWaterEffect.field_i, true);
        QueuedIntArrayRequest.field_k = var2.createFont(sv.field_a, LegacyOpenGlReflectionEffect.field_j, true);
        hc.field_e = var2.createFont(LoginTextResources.field_b, DropDownWidget.field_F, true);
        ForceFieldRingEffect.field_t = var2.createFont(IntroLightingLookup.field_b, ProxySocketConnector.field_f, true);
        up.field_c = DroneDebris.createToolkitSprites(NameSuggestionsPanel.field_F, var2, 28513);
        ResizingDialog.field_H = DroneDebris.createToolkitSprites(MidiNoteMixer.field_q, var2, 28513);
        DroneEscalationSupport.field_a = DroneDebris.createToolkitSprites(SoftwareRenderTarget.field_b, var2, 28513);
        pi.field_d = ResizingDialog.a(var2, CompactMeshGeometry.field_N, (byte) -11);
        EnemyDroneFactory.field_a = ResizingDialog.a(var2, MusicCrossfadeStream.field_p, (byte) -11);
        MouseWheelInput.field_b = ResizingDialog.a(var2, IntrusiveNode.field_d, (byte) -11);
        CacheReferenceNode.field_y = ResizingDialog.a(var2, OpenGlCubeTexture.field_i, (byte) -11);
        BlendMode.field_b = ResizingDialog.a(var2, hc.field_b, (byte) -11);
        CacheIoWorker.field_b = ResizingDialog.a(var2, oi.field_d, (byte) -11);
        vm.field_a = DroneDebris.createToolkitSprites(TextLayoutLine.field_c, var2, 28513);
        HudMessage.field_s = DroneDebris.createToolkitSprites(LoginMethodPreference.field_c, var2, 28513);
        SpriteState.field_B = DroneDebris.createToolkitSprites(ResourceRequest.field_r, var2, 28513);
        SecondaryNodeDequeIterator.field_a = DroneDebris.createToolkitSprites(IsaacCipher.field_d, var2, 28513);
        IntrusiveDeque.field_c = DroneDebris.createToolkitSprites(ProxyAuthenticationRequiredException.field_a, var2, 28513);
        IsaacCipher.field_j = DroneDebris.createToolkitSprites(WaterTextureResources.field_c, var2, 28513);
        LegacyOpenGlTexture1D.field_k = DroneDebris.createToolkitSprites(LegacyOpenGlFloatPostProcessEffect.field_o, var2, 28513);
        LegacyOpenGlSpriteMask.field_e = ResizingDialog.a(var2, IntrusiveDequeCursor.field_e, (byte) -11);
        HudMessage.field_m = ResizingDialog.a(var2, LegacyOpenGlPostProcessEffect.field_k, (byte) -11);
        LegacyCubeMapSource.field_e = ResizingDialog.a(var2, BufferedSocket.field_n, (byte) -11);
        LegacyOpenGlTexture.field_e = DroneDebris.createToolkitSprites(RasterStateFrame.field_l, var2, 28513);
        ContentDialog.field_ab = DroneDebris.createToolkitSprites(LegacyOpenGlTextureCache.field_e, var2, 28513);
        ProjectionMode.field_d = DroneDebris.createToolkitSprites(HardwareTurbulentWaterNoise.field_w, var2, 28513);
        TextHotspot.field_n = DroneDebris.createToolkitSprites(StatefulWidgetRenderer.field_r, var2, 28513);
        MenuScreen.field_a = DroneDebris.createToolkitSprites(RasterColorTables.field_b, var2, 28513);
        HardwareTextureCache.field_e = DroneDebris.createToolkitSprites(DisplayModeConfirmationDialog.field_V, var2, 28513);
        if (guard) {
          field_c = (ResourceArchive) null;
          QuickChatCommand.field_e = DroneDebris.createToolkitSprites(LruNodeCache.field_a, var2, 28513);
          ProxyAuthenticationRequiredException.field_e = DroneDebris.createToolkitSprites(CachedTextLayout.field_h, var2, 28513);
          HardwareRidgedWaterNoise.field_A = DroneDebris.createToolkitSprites(RendererSession.field_b, var2, 28513);
          up.field_e = DroneDebris.createToolkitSprites(FullscreenDisplayMode.field_c, var2, 28513);
          UnderageAccountInfoPanel.field_B = ResizingDialog.a(var2, ServerDataReadRequest.field_k, (byte) -11);
          DroneDebris.createToolkitSprites(Transform3D.field_a, var2, 28513);
          IntrusiveDeque.field_d = ResizingDialog.a(var2, ToolkitRasterStateFrame.field_a, (byte) -11);
          MusicCrossfadeStream.field_q = DroneDebris.createToolkitSprites(EnemyDroneFactory.field_c, var2, 28513);
          ResizingDialog.a(var2, HiscorePlayerName.field_d, (byte) -11);
          DroneDebris.createToolkitSprites(DroneChargeParticle.field_v, var2, 28513);
          IntroductionOverlaySupport.field_a = ResizingDialog.a(var2, FullscreenMembershipDialog.field_T, (byte) -11);
          CachedArchiveProvider.field_j = DroneDebris.createToolkitSprites(UiStyle.field_v, var2, 28513);
          OpenGlBuffer.field_g = DroneDebris.createToolkitSprites(LegacyOpenGlRenderbuffer.field_w, var2, 28513);
          ResizingDialog.a(var2, EmailAvailabilityRequest.field_g, (byte) -11);
          ResizingDialog.a(var2, HardwareTurbulentWaterNoise.field_t, (byte) -11);
          ResizingDialog.a(var2, ShaderEffect.field_c, (byte) -11);
          im.field_a = ResizingDialog.a(var2, SpriteStripButtonRenderer.field_p, (byte) -11);
          ArchiveLoadingStage.field_j = ResizingDialog.a(var2, pc.field_c, (byte) -11);
          PlayingSound.field_l = ResizingDialog.a(var2, no.field_c, (byte) -11);
          ProjectionMode.field_b = ResizingDialog.a(var2, LabeledWidget.field_E, (byte) -11);
          OpenGlEnvironmentWaterEffect.field_i = ResizingDialog.a(var2, ArchiveLoadingStage.field_c, (byte) -11);
          AccountServiceResult.field_f = ResizingDialog.a(var2, SceneryParticle.field_C, (byte) -11);
          TextureMetadata.field_a = ResizingDialog.a(var2, wf.field_a, (byte) -11);
          DirectByteArrayStorage.field_d = ResizingDialog.a(var2, RidgedNoise3D.field_p, (byte) -11);
          TextCaretLayout.field_a = ResizingDialog.a(var2, UnderageAccountInfoPanel.field_C, (byte) -11);
          OpenGlIndexBuffer.field_p = DroneDebris.createToolkitSprites(MouseInputHandler.field_b, var2, 28513);
          RidgedNoise3D.field_w = DroneDebris.createToolkitSprites(SoftLruCache.field_a, var2, 28513);
          IsaacCipher.field_f = DroneDebris.createToolkitSprites(LegacyOpenGlCubeTexture.field_n, var2, 28513);
          TurbulenceNoise3D.field_k = DroneDebris.createToolkitSprites(FallbackShaderEffect.field_h, var2, 28513);
          ResizingDialog.a(var2, ArchiveCatalog.field_f, (byte) -11);
          ResizingDialog.a(var2, MusicVoice.field_o, (byte) -11);
          DirectByteArrayStorage.field_e = ResizingDialog.a(var2, VertexBufferReference.field_c, (byte) -11);
          DroneDebris.createToolkitSprites(BigBurstaProgress.attractorSpriteData, var2, 28513);
          LegacyOpenGlTextureCache.field_f = ResizingDialog.a(var2, IntList.field_e, (byte) -11);
          OpenGlTexture3D.field_p = DroneDebris.createToolkitSprites(FullscreenMembershipDialog.field_S, var2, 28513);
          DroneDebris.createToolkitSprites(ByteArrayStorage.field_a, var2, 28513);
          ArchiveProvider.field_a = DroneDebris.createToolkitSprites(ScrollViewport.field_C, var2, 28513);
          EnemyDroneFactory.field_b = DroneDebris.createToolkitSprites(pc.field_b, var2, 28513);
          IntroductionOverlaySupport.field_e = DroneDebris.createToolkitSprites(ScrollPane.field_F, var2, 28513);
          LevelCompletionSupport.field_b = DroneDebris.createToolkitSprites(DroneWaveDefinition.field_m, var2, 28513);
          HardwareSpecularEffect.field_f = DroneDebris.createToolkitSprites(ke.field_c, var2, 28513);
          OpenGlUnderwaterEffect.field_t = ResizingDialog.a(var2, PasswordValidator.field_i, (byte) -11);
          LegacyOpenGlSpriteTexture.field_r = DroneDebris.createToolkitSprites(hc.field_a, var2, 28513);
          ArenaDefinition.field_c = ResizingDialog.a(var2, RasterStateFrame.field_o, (byte) -11);
          DelegatingCanvas.field_b = new ToolkitSprite[]{ArchiveLoadingStage.field_j, PlayingSound.field_l, ProjectionMode.field_b};
          PasswordValidator.field_j = new ToolkitSprite[]{AccountServiceResult.field_f, TextureMetadata.field_a, DirectByteArrayStorage.field_d};
          Sumoblitz.field_J = DroneDebris.createToolkitSprites(StripedProgressWidget.field_F, var2, 28513);
          return;
        }
        QuickChatCommand.field_e = DroneDebris.createToolkitSprites(LruNodeCache.field_a, var2, 28513);
        ProxyAuthenticationRequiredException.field_e = DroneDebris.createToolkitSprites(CachedTextLayout.field_h, var2, 28513);
        HardwareRidgedWaterNoise.field_A = DroneDebris.createToolkitSprites(RendererSession.field_b, var2, 28513);
        up.field_e = DroneDebris.createToolkitSprites(FullscreenDisplayMode.field_c, var2, 28513);
        UnderageAccountInfoPanel.field_B = ResizingDialog.a(var2, ServerDataReadRequest.field_k, (byte) -11);
        DroneDebris.createToolkitSprites(Transform3D.field_a, var2, 28513);
        IntrusiveDeque.field_d = ResizingDialog.a(var2, ToolkitRasterStateFrame.field_a, (byte) -11);
        MusicCrossfadeStream.field_q = DroneDebris.createToolkitSprites(EnemyDroneFactory.field_c, var2, 28513);
        ResizingDialog.a(var2, HiscorePlayerName.field_d, (byte) -11);
        DroneDebris.createToolkitSprites(DroneChargeParticle.field_v, var2, 28513);
        IntroductionOverlaySupport.field_a = ResizingDialog.a(var2, FullscreenMembershipDialog.field_T, (byte) -11);
        CachedArchiveProvider.field_j = DroneDebris.createToolkitSprites(UiStyle.field_v, var2, 28513);
        OpenGlBuffer.field_g = DroneDebris.createToolkitSprites(LegacyOpenGlRenderbuffer.field_w, var2, 28513);
        ResizingDialog.a(var2, EmailAvailabilityRequest.field_g, (byte) -11);
        ResizingDialog.a(var2, HardwareTurbulentWaterNoise.field_t, (byte) -11);
        ResizingDialog.a(var2, ShaderEffect.field_c, (byte) -11);
        im.field_a = ResizingDialog.a(var2, SpriteStripButtonRenderer.field_p, (byte) -11);
        ArchiveLoadingStage.field_j = ResizingDialog.a(var2, pc.field_c, (byte) -11);
        PlayingSound.field_l = ResizingDialog.a(var2, no.field_c, (byte) -11);
        ProjectionMode.field_b = ResizingDialog.a(var2, LabeledWidget.field_E, (byte) -11);
        OpenGlEnvironmentWaterEffect.field_i = ResizingDialog.a(var2, ArchiveLoadingStage.field_c, (byte) -11);
        AccountServiceResult.field_f = ResizingDialog.a(var2, SceneryParticle.field_C, (byte) -11);
        TextureMetadata.field_a = ResizingDialog.a(var2, wf.field_a, (byte) -11);
        DirectByteArrayStorage.field_d = ResizingDialog.a(var2, RidgedNoise3D.field_p, (byte) -11);
        TextCaretLayout.field_a = ResizingDialog.a(var2, UnderageAccountInfoPanel.field_C, (byte) -11);
        OpenGlIndexBuffer.field_p = DroneDebris.createToolkitSprites(MouseInputHandler.field_b, var2, 28513);
        RidgedNoise3D.field_w = DroneDebris.createToolkitSprites(SoftLruCache.field_a, var2, 28513);
        IsaacCipher.field_f = DroneDebris.createToolkitSprites(LegacyOpenGlCubeTexture.field_n, var2, 28513);
        TurbulenceNoise3D.field_k = DroneDebris.createToolkitSprites(FallbackShaderEffect.field_h, var2, 28513);
        ResizingDialog.a(var2, ArchiveCatalog.field_f, (byte) -11);
        ResizingDialog.a(var2, MusicVoice.field_o, (byte) -11);
        DirectByteArrayStorage.field_e = ResizingDialog.a(var2, VertexBufferReference.field_c, (byte) -11);
        DroneDebris.createToolkitSprites(BigBurstaProgress.attractorSpriteData, var2, 28513);
        LegacyOpenGlTextureCache.field_f = ResizingDialog.a(var2, IntList.field_e, (byte) -11);
        OpenGlTexture3D.field_p = DroneDebris.createToolkitSprites(FullscreenMembershipDialog.field_S, var2, 28513);
        DroneDebris.createToolkitSprites(ByteArrayStorage.field_a, var2, 28513);
        ArchiveProvider.field_a = DroneDebris.createToolkitSprites(ScrollViewport.field_C, var2, 28513);
        EnemyDroneFactory.field_b = DroneDebris.createToolkitSprites(pc.field_b, var2, 28513);
        IntroductionOverlaySupport.field_e = DroneDebris.createToolkitSprites(ScrollPane.field_F, var2, 28513);
        LevelCompletionSupport.field_b = DroneDebris.createToolkitSprites(DroneWaveDefinition.field_m, var2, 28513);
        HardwareSpecularEffect.field_f = DroneDebris.createToolkitSprites(ke.field_c, var2, 28513);
        OpenGlUnderwaterEffect.field_t = ResizingDialog.a(var2, PasswordValidator.field_i, (byte) -11);
        LegacyOpenGlSpriteTexture.field_r = DroneDebris.createToolkitSprites(hc.field_a, var2, 28513);
        ArenaDefinition.field_c = ResizingDialog.a(var2, RasterStateFrame.field_o, (byte) -11);
        DelegatingCanvas.field_b = new ToolkitSprite[]{ArchiveLoadingStage.field_j, PlayingSound.field_l, ProjectionMode.field_b};
        PasswordValidator.field_j = new ToolkitSprite[]{AccountServiceResult.field_f, TextureMetadata.field_a, DirectByteArrayStorage.field_d};
        Sumoblitz.field_J = DroneDebris.createToolkitSprites(StripedProgressWidget.field_F, var2, 28513);
    }

    final boolean isActivated(int guard) {
        if (guard != -31260) {
          return false;
        }
        if (this.pressedButton != 0) {
          return true;
        }
        if (this.keyCode == 84) {
          return true;
        }
        if (this.keyCode != 83) {
          return false;
        }
        return true;
    }

    final static void updateDroneBoundaryAndDestruction(byte guard) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        Drone var3 = null;
        Drone var4 = null;
        Drone var5 = null;
        int var6 = 0;
        Drone var4Lifetime1;
        Drone var4Lifetime2;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var1_int = -63 / ((-56 - guard) / 60);
          if (null != SpriteMask.drones) {
            for (var2 = 0; ServerDataWriteRequest.droneSlotLimit > var2; var2++) {
              var3 = SpriteMask.drones[var2];
              var4 = var3;
              var4Lifetime1 = var3;
              if (var3 != null) {
                if (var3.destructionTicks == 0 && (!(-var3.radiusQ8 + var3.xQ8 >= 6656) ||
                  !(var3.yQ8 - var3.radiusQ8 >= 6656) ||
                  !(var3.xQ8 + var3.radiusQ8 <= 157184) ||
                  !(116224 >= var3.radiusQ8 + var3.yQ8)) && !var3.isBlastActive(91)) {
                  if (1 != var3.variant) {
                    SecondaryNodeQueue.a(var3, (byte) 113);
                  } else {
                    if (-var3.radiusQ8 + var3.xQ8 < 6656) {
                      CheckboxWidget.handleArenaBoundaryHit(-1, var3);
                    } else {
                      if (6656 > -var3.radiusQ8 + var3.yQ8) {
                        CheckboxWidget.handleArenaBoundaryHit(-1, var3);
                      } else {
                        if (157184 < var3.xQ8 + var3.radiusQ8) {
                          CheckboxWidget.handleArenaBoundaryHit(-1, var3);
                        } else {
                          if (var3.radiusQ8 + var3.yQ8 > 116224) {
                            CheckboxWidget.handleArenaBoundaryHit(-1, var3);
                          } else {
                            SecondaryNodeQueue.a(var3, (byte) 113);
                          }
                        }
                      }
                    }
                  }
                }
                if (var3.destructionTicks == 2 && (var3.droneType == 4 ||
                  var3.variant == 6)) {
                  var4Lifetime2 = EnemyDroneFactory.createEnemyDrone(var3.field_u, var3.xQ8, var3.field_e, (byte) 84, var3.yQ8);
                  var5 = EnemyDroneFactory.createEnemyDrone(var3.field_u, var3.xQ8, var3.field_e, (byte) 84, var3.yQ8);
                  HardwareUnlitEffect.a(var4Lifetime2, false);
                  HardwareUnlitEffect.a(var5, false);
                }
                if (var3.destructionTicks > 100) {
                  if (MessageDialog.arcadeMode) {
                    DroneEscalationSupport.spawnEscalatedEnemy(94, var3);
                  }
                  SpriteMask.drones[var2] = null;
                }
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "er.K(" + guard + ')');
        }
    }

    final boolean isEndPressed(int guard) {
        if (guard == 103) {
          return this.keyCode == 103 ? true : false;
        }
        this.selectedIndex = -121;
        return this.keyCode == 103 ? true : false;
    }

    final void resetSelection(boolean mouseMode, int guard, int mouseIndex, int keyboardIndex) {
        int var5 = 25 / ((12 - guard) / 34);
        this.heldButton = 0;
        this.mouseMode = mouseMode ? true : false;
        if (!this.mouseMode) {
          this.selectedIndex = keyboardIndex;
          return;
        }
        this.selectedIndex = mouseIndex;
    }

    final boolean isRightPressed(int guard) {
        if (guard == 116224) {
          return this.keyCode == 97 ? true : false;
        }
        field_h = (int[]) null;
        return this.keyCode == 97 ? true : false;
    }

    final boolean isPointerHeld(byte guard) {
        if (guard == 52) {
          return this.heldButton != 0 ? true : false;
        }
        this.handleVerticalNavigation((byte) 47);
        return this.heldButton != 0 ? true : false;
    }

    final boolean isLeftPressed(int guard) {
        if (guard != 2542) {
          return false;
        }
        return this.keyCode == 96 ? true : false;
    }

    final void setKeyboardSelection(int guard, int index) {
        if (this.heldButton == 0) {
          this.selectedIndex = index;
          this.mouseMode = false;
          if (guard != -31865) {
            this.handleHorizontalNavigation(-89);
            return;
          }
          return;
        }
        if (guard == -31865) {
          return;
        }
        this.handleHorizontalNavigation(-89);
    }

    final void handleVerticalNavigation(byte guard) {
        this.keyCode = 0;
        if (guard < 28) {
          this.isActivated(-107);
        }
        this.pressedButton = 0;
        if (this.heldButton == 0 &&
          TextureCombineOperation.field_a == 98) {
          if (this.selectedIndex <= 0) {
            this.selectedIndex = this.itemCount;
          }
          this.selectedIndex = this.selectedIndex - 1;
          this.mouseMode = false;
        }
        if (0 == this.heldButton) {
          this.keyCode = TextureCombineOperation.field_a;
        }
        if (this.heldButton != 0) {
          return;
        }
        if (99 != TextureCombineOperation.field_a) {
          return;
        }
        this.selectedIndex = this.selectedIndex + 1;
        if (this.selectedIndex >= this.itemCount) {
          this.selectedIndex = 0;
        }
        this.mouseMode = false;
    }

    final void handleHorizontalNavigation(int guard) {
        this.pressedButton = 0;
        this.keyCode = 0;
        if (this.heldButton == 0) {
          this.keyCode = TextureCombineOperation.field_a;
        }
        if (guard > -18) {
          this.setKeyboardSelection(-114, -72);
        }
        if (this.heldButton == 0 &&
          TextureCombineOperation.field_a == 96) {
          if (this.selectedIndex <= 0) {
            this.selectedIndex = this.itemCount;
          }
          this.selectedIndex = this.selectedIndex - 1;
          this.mouseMode = false;
        }
        if (0 != this.heldButton) {
          return;
        }
        if (TextureCombineOperation.field_a != 97) {
          return;
        }
        this.selectedIndex = this.selectedIndex + 1;
        if (this.selectedIndex >= this.itemCount) {
          this.selectedIndex = 0;
        }
        this.mouseMode = false;
    }

    final boolean isHomePressed(int guard) {
        if (guard != -103) {
          return true;
        }
        return this.keyCode == 102 ? true : false;
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          field_h = (int[]) null;
          field_c = null;
          field_h = null;
          return;
        }
        field_c = null;
        field_h = null;
    }

    final void captureKey(int guard) {
        this.pressedButton = 0;
        this.keyCode = 0;
        if (guard >= -12) {
          return;
        }
        if (0 == this.heldButton) {
          this.keyCode = TextureCombineOperation.field_a;
        }
    }

    final void updatePointerSelection(boolean guard, int pressedIndex, int hoveredIndex) {
        if (this.itemCount <= hoveredIndex) {
          throw new IllegalArgumentException();
        }
        if (this.itemCount <= pressedIndex) {
          throw new IllegalArgumentException();
        }
        this.pressedButton = 0;
        this.keyCode = 0;
        if (ActiveCanvasProvider.field_c != 0) {
          this.mouseMode = true;
          this.selectedIndex = pressedIndex;
          this.pressedButton = ActiveCanvasProvider.field_c;
          this.repeatDelay = AccountRequestState.field_f;
          this.heldButton = ActiveCanvasProvider.field_c;
        }
        if (this.heldButton == 0) {
          if (!guard) {
            this.selectedIndex = -114;
            if (ActiveCanvasProvider.field_c == 0 &&
              0 == HotspotTextWidget.activePointerButton) {
              this.heldButton = 0;
            }
            if (this.heldButton == 0) {
              if (!this.mouseMode &&
                !LegacyOpenGlClientVertexBuffer.field_d) {
                return;
              }
              if (hoveredIndex < 0) {
                if (this.mouseMode) {
                  this.selectedIndex = -1;
                }
              } else {
                if (this.selectedIndex != hoveredIndex) {
                  this.mouseMode = true;
                  this.selectedIndex = hoveredIndex;
                } else {
                  this.mouseMode = true;
                  this.selectedIndex = hoveredIndex;
                }
              }
            }
            return;
          }
          if (ActiveCanvasProvider.field_c == 0 &&
            0 == HotspotTextWidget.activePointerButton) {
            this.heldButton = 0;
            if (this.heldButton == 0) {
              if (!this.mouseMode &&
                !LegacyOpenGlClientVertexBuffer.field_d) {
                return;
              }
              if (hoveredIndex < 0) {
                if (this.mouseMode) {
                  this.selectedIndex = -1;
                }
              } else {
                if (this.selectedIndex != hoveredIndex) {
                  this.mouseMode = true;
                  this.selectedIndex = hoveredIndex;
                } else {
                  this.mouseMode = true;
                  this.selectedIndex = hoveredIndex;
                }
              }
            }
            return;
          }
          if (this.heldButton != 0) {
            return;
          }
          if (this.mouseMode) {
            if (hoveredIndex < 0) {
              if (!this.mouseMode) {
                return;
              }
              this.selectedIndex = -1;
              return;
            }
            if (this.selectedIndex != hoveredIndex) {
            }
            this.mouseMode = true;
            this.selectedIndex = hoveredIndex;
            return;
          }
          if (!LegacyOpenGlClientVertexBuffer.field_d) {
            return;
          }
          if (hoveredIndex < 0) {
            if (this.mouseMode) {
              this.selectedIndex = -1;
            }
          } else {
            if (this.selectedIndex != hoveredIndex) {
            }
            this.mouseMode = true;
            this.selectedIndex = hoveredIndex;
          }
          return;
        }
        if (HotspotTextWidget.activePointerButton != 0) {
          if (this.repeatDelay <= 0) {
            this.repeatDelay = IntList.field_h;
          }
          this.repeatDelay = this.repeatDelay - 1;
        }
        if (!guard) {
          this.selectedIndex = -114;
          if (ActiveCanvasProvider.field_c != 0) {
            if (this.heldButton == 0) {
              if (!this.mouseMode &&
                !LegacyOpenGlClientVertexBuffer.field_d) {
                return;
              }
              if (hoveredIndex < 0) {
                if (this.mouseMode) {
                  this.selectedIndex = -1;
                }
              } else {
                if (this.selectedIndex != hoveredIndex) {
                  this.mouseMode = true;
                  this.selectedIndex = hoveredIndex;
                } else {
                  this.mouseMode = true;
                  this.selectedIndex = hoveredIndex;
                }
              }
            }
            return;
          }
          if (0 == HotspotTextWidget.activePointerButton) {
            this.heldButton = 0;
          }
          if (this.heldButton == 0) {
            if (!this.mouseMode &&
              !LegacyOpenGlClientVertexBuffer.field_d) {
              return;
            }
            if (hoveredIndex < 0) {
              if (this.mouseMode) {
                this.selectedIndex = -1;
              }
            } else {
              if (this.selectedIndex != hoveredIndex) {
                this.mouseMode = true;
                this.selectedIndex = hoveredIndex;
              } else {
                this.mouseMode = true;
                this.selectedIndex = hoveredIndex;
              }
            }
          }
          return;
        }
        if (ActiveCanvasProvider.field_c == 0 &&
          0 == HotspotTextWidget.activePointerButton) {
          this.heldButton = 0;
          if (this.heldButton != 0) {
            return;
          }
          if (!this.mouseMode &&
            !LegacyOpenGlClientVertexBuffer.field_d) {
            return;
          }
        } else {
          if (this.heldButton != 0) {
            return;
          }
          if (!this.mouseMode &&
            !LegacyOpenGlClientVertexBuffer.field_d) {
            return;
          }
        }
        if (hoveredIndex < 0) {
          if (!this.mouseMode) {
            return;
          }
          this.selectedIndex = -1;
          return;
        }
        if (this.selectedIndex != hoveredIndex) {
        }
        this.mouseMode = true;
        this.selectedIndex = hoveredIndex;
    }

    MenuSelectionController(int entryCount) {
        this.mouseMode = false;
        this.selectedIndex = 0;
        this.itemCount = entryCount;
    }

    static {
    }
}
