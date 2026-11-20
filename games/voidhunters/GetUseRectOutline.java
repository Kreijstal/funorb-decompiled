/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetUseRectOutline extends ConsoleCommand {
    final static void updateSocialAndLobbyPanels(boolean param0, int param1, int param2, int param3, boolean param4, int param5, int param6, boolean param7, boolean param8, boolean param9) {
        int var11;
        var11 = VoidHunters.field_G;
        if (param7) {
          SetUseDetailLines.field_o = GetVelocitySustain.field_p;
          GetMissionTimeLimit.updateLobbyPanelAnimation(param7, true);
          if (SoftwareTransform3D.field_b > 0) {
            FadingMidiPcmStream.updateLobbyAndTutorialInput(param0, param7, param5, (byte) 100);
          }
          SetAutozoomSpeedDivide.field_p.field_F = 1;
          SetAutozoomSpeedDivide.field_p.field_w = SetAutoAfkTimeout.field_q.field_w;
          if (CarouselPlayerEventFactory.field_a > 0) {
            ScrollPaneWidget.updateLobbyGameControls(param0, -99, param7, param5);
          }
          if (~SetExplosionPushMultiplier.field_p < param1) {
            ComponentCollision.updateCurrentLobbyControls(param5, (byte) 105, param8, param0, param7);
          }
          if (GetTorpedoProjectileDamage.field_o &&
            SetSpinningBladeSpindamageMultiplier.field_o.playerCount >= SetSpinningBladeSpindamageMultiplier.field_o.maxPlayers) {
            DualLinkNode.field_f.enabled = false;
            CarouselSlot.field_a.viewport.text = SetPhasedEnergyBeamPulsetime.field_q;
            GammaCorrection.collapseWidgetAndChildren(CarouselSlot.field_a.content, (byte) -93);
          } else {
            CarouselSlot.field_a.viewport.text = null;
            DualLinkNode.field_f.enabled = true;
            SetTorpedoProjectiles.updateLobbyPlayerList(param6, (byte) 1, CarouselSlot.field_a, param4, param5);
          }
        } else {
          if (GetShieldsDirectionalArcParticleLife.field_p != SoftwareRasterizer2D.width) {
            if (SoftwareRasterizer2D.height == SetClientSideDragging.field_q.height &&
              SetClientSideDragging.field_q.width == SoftwareRasterizer2D.width) {
              if (null == SetSpinningBladeSpindamageMultiplier.field_o) {
                if (null == SetThrusterParticleSpeedDownshift.field_o) {
                  SetGrapplingHookMinLength.layoutSocialAndLobbyPanels(5);
                } else {
                  ShipBodyFactory.layoutGameInterface((byte) 100, true);
                }
              } else {
                ShipBodyFactory.layoutGameInterface((byte) 100, false);
              }
            }
            if (!param7) {
              SetUseDetailLines.field_o = (GetShieldsDirectionalArcParticleLife.field_p - 640) / 2;
              GetMissionTimeLimit.updateLobbyPanelAnimation(param7, true);
              if (SoftwareTransform3D.field_b > 0) {
                FadingMidiPcmStream.updateLobbyAndTutorialInput(param0, param7, param5, (byte) 100);
              }
              SetAutozoomSpeedDivide.field_p.field_F = 1;
              SetAutozoomSpeedDivide.field_p.field_w = SetAutoAfkTimeout.field_q.field_w;
              if (CarouselPlayerEventFactory.field_a > 0) {
                ScrollPaneWidget.updateLobbyGameControls(param0, -99, param7, param5);
              }
              if (~SetExplosionPushMultiplier.field_p < param1) {
                ComponentCollision.updateCurrentLobbyControls(param5, (byte) 105, param8, param0, param7);
              }
              if (GetTorpedoProjectileDamage.field_o &&
                SetSpinningBladeSpindamageMultiplier.field_o.playerCount >= SetSpinningBladeSpindamageMultiplier.field_o.maxPlayers) {
                DualLinkNode.field_f.enabled = false;
                CarouselSlot.field_a.viewport.text = SetPhasedEnergyBeamPulsetime.field_q;
                GammaCorrection.collapseWidgetAndChildren(CarouselSlot.field_a.content, (byte) -93);
              } else {
                CarouselSlot.field_a.viewport.text = null;
                DualLinkNode.field_f.enabled = true;
                SetTorpedoProjectiles.updateLobbyPlayerList(param6, (byte) 1, CarouselSlot.field_a, param4, param5);
              }
            } else {
              SetUseDetailLines.field_o = GetVelocitySustain.field_p;
              GetMissionTimeLimit.updateLobbyPanelAnimation(param7, true);
              if (SoftwareTransform3D.field_b > 0) {
                FadingMidiPcmStream.updateLobbyAndTutorialInput(param0, param7, param5, (byte) 100);
              }
              SetAutozoomSpeedDivide.field_p.field_F = 1;
              SetAutozoomSpeedDivide.field_p.field_w = SetAutoAfkTimeout.field_q.field_w;
              if (CarouselPlayerEventFactory.field_a > 0) {
                ScrollPaneWidget.updateLobbyGameControls(param0, -99, param7, param5);
              }
              if (~SetExplosionPushMultiplier.field_p < param1) {
                ComponentCollision.updateCurrentLobbyControls(param5, (byte) 105, param8, param0, param7);
              }
              if (GetTorpedoProjectileDamage.field_o &&
                SetSpinningBladeSpindamageMultiplier.field_o.playerCount >= SetSpinningBladeSpindamageMultiplier.field_o.maxPlayers) {
                DualLinkNode.field_f.enabled = false;
                CarouselSlot.field_a.viewport.text = SetPhasedEnergyBeamPulsetime.field_q;
                GammaCorrection.collapseWidgetAndChildren(CarouselSlot.field_a.content, (byte) -93);
              } else {
                CarouselSlot.field_a.viewport.text = null;
                DualLinkNode.field_f.enabled = true;
                SetTorpedoProjectiles.updateLobbyPlayerList(param6, (byte) 1, CarouselSlot.field_a, param4, param5);
              }
            }
          } else {
            if (SoftwareRasterizer2D.height != SetGrapplingHookRopeBreakLength.field_p &&
              SoftwareRasterizer2D.height == SetClientSideDragging.field_q.height &&
              SetClientSideDragging.field_q.width == SoftwareRasterizer2D.width) {
              if (null == SetSpinningBladeSpindamageMultiplier.field_o) {
                if (null == SetThrusterParticleSpeedDownshift.field_o) {
                  SetGrapplingHookMinLength.layoutSocialAndLobbyPanels(5);
                } else {
                  ShipBodyFactory.layoutGameInterface((byte) 100, true);
                }
              } else {
                ShipBodyFactory.layoutGameInterface((byte) 100, false);
              }
            }
            if (!param7) {
              SetUseDetailLines.field_o = (GetShieldsDirectionalArcParticleLife.field_p - 640) / 2;
              GetMissionTimeLimit.updateLobbyPanelAnimation(param7, true);
              if (SoftwareTransform3D.field_b > 0) {
                FadingMidiPcmStream.updateLobbyAndTutorialInput(param0, param7, param5, (byte) 100);
              }
              SetAutozoomSpeedDivide.field_p.field_F = 1;
              SetAutozoomSpeedDivide.field_p.field_w = SetAutoAfkTimeout.field_q.field_w;
              if (CarouselPlayerEventFactory.field_a > 0) {
                ScrollPaneWidget.updateLobbyGameControls(param0, -99, param7, param5);
              }
              if (~SetExplosionPushMultiplier.field_p < param1) {
                ComponentCollision.updateCurrentLobbyControls(param5, (byte) 105, param8, param0, param7);
              }
              if (GetTorpedoProjectileDamage.field_o &&
                SetSpinningBladeSpindamageMultiplier.field_o.playerCount >= SetSpinningBladeSpindamageMultiplier.field_o.maxPlayers) {
                DualLinkNode.field_f.enabled = false;
                CarouselSlot.field_a.viewport.text = SetPhasedEnergyBeamPulsetime.field_q;
                GammaCorrection.collapseWidgetAndChildren(CarouselSlot.field_a.content, (byte) -93);
              } else {
                CarouselSlot.field_a.viewport.text = null;
                DualLinkNode.field_f.enabled = true;
                SetTorpedoProjectiles.updateLobbyPlayerList(param6, (byte) 1, CarouselSlot.field_a, param4, param5);
              }
            } else {
              SetUseDetailLines.field_o = GetVelocitySustain.field_p;
              GetMissionTimeLimit.updateLobbyPanelAnimation(param7, true);
              if (SoftwareTransform3D.field_b > 0) {
                FadingMidiPcmStream.updateLobbyAndTutorialInput(param0, param7, param5, (byte) 100);
              }
              SetAutozoomSpeedDivide.field_p.field_F = 1;
              SetAutozoomSpeedDivide.field_p.field_w = SetAutoAfkTimeout.field_q.field_w;
              if (CarouselPlayerEventFactory.field_a > 0) {
                ScrollPaneWidget.updateLobbyGameControls(param0, -99, param7, param5);
              }
              if (~SetExplosionPushMultiplier.field_p < param1) {
                ComponentCollision.updateCurrentLobbyControls(param5, (byte) 105, param8, param0, param7);
              }
              if (!GetTorpedoProjectileDamage.field_o) {
                CarouselSlot.field_a.viewport.text = null;
                DualLinkNode.field_f.enabled = true;
                SetTorpedoProjectiles.updateLobbyPlayerList(param6, (byte) 1, CarouselSlot.field_a, param4, param5);
              } else {
                if (SetSpinningBladeSpindamageMultiplier.field_o.playerCount < SetSpinningBladeSpindamageMultiplier.field_o.maxPlayers) {
                  CarouselSlot.field_a.viewport.text = null;
                  DualLinkNode.field_f.enabled = true;
                  SetTorpedoProjectiles.updateLobbyPlayerList(param6, (byte) 1, CarouselSlot.field_a, param4, param5);
                } else {
                  DualLinkNode.field_f.enabled = false;
                  CarouselSlot.field_a.viewport.text = SetPhasedEnergyBeamPulsetime.field_q;
                  GammaCorrection.collapseWidgetAndChildren(CarouselSlot.field_a.content, (byte) -93);
                }
              }
            }
          }
        }
        TiledSpriteTextureOperation.updateLobbyGameList(param2, param6, param4, param9, param5, param3, (byte) 119);
        SetTorpedoProjectiles.updateLobbyPlayerList(param6, (byte) 1, WaterTextures.field_f, param4, param5);
        GetMissionTerrainNebulaProbability.field_o = GetMissionTerrainNebulaProbability.field_o + 1;
    }

    GetUseRectOutline(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            GetUseRectOutline.updatePlayerGameDataLoading(true);
          }
          stackIn_3_0 = new ConsoleValue(SetPointDefenceLaserReload.field_o);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rl.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void updatePlayerGameDataLoading(boolean param0) {
        if (param0) {
          GetUseRectOutline.updateSocialAndLobbyPanels(true, 69, -111, -75, true, 23, 116, false, false, true);
        }
        if (TextLayout.playerGameDataLoaded) {
          return;
        }
        if (MessageFactory.playerGameDataRequest == null) {
          MessageFactory.playerGameDataRequest = ConstantMonochromeTextureOperation.requestClientData(true, 6);
        }
        if (!MessageFactory.playerGameDataRequest.complete) {
          return;
        }
        GraphicsToolkitSelector.loadPlayerGameData(-29365, MessageFactory.playerGameDataRequest.data);
        MessageFactory.playerGameDataRequest = null;
        TextLayout.playerGameDataLoaded = true;
        LoadingAnimationControl.finishAnimations((byte) -114);
        SetKeepTeamColours.initializeMenuScreens(15334);
    }

    static {
    }
}
