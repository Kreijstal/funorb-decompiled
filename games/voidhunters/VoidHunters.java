/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class VoidHunters extends NetworkGameClient {
    private int musicStingCooldown;
    private int menuMusicMixId;
    private Sprite cachedFrame;
    static int[] field_E;
    private int gameMusicMixId;
    public static int field_G;

    private final void setMenuMusicChannelLevels(int param0, MidiChannelLevels param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = field_G;
        try {
          if (this.menuMusicMixId == -1) {
            for (var4_int = 0; var4_int < param1.levels.length; var4_int++) {
              GetThrusterParticleLife.field_o.setChannelGain(param1.levels[var4_int], (byte) 18, var4_int);
            }
          } else {
            GetThrusterParticleLife.field_o.fadeToChannelLevels((byte) 125, 4000, param1);
          }
          this.menuMusicMixId = param2;
          if (param0 != -23134) {
            field_E = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("VoidHunters.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean checkDuplicateReference(boolean param0, Object param1) {
        int var3 = 0;
        Object[] fieldTemp$2 = null;
        int fieldTemp$3 = 0;
        int var2_int = 0;
        Object[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        Object[] var5 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = field_G;
        try {
          if (GetMissionTerrainNebulaProbability.field_q &&
            param1 != null) {
            var2_int = 0;
            while (var2_int < SetVelocitySustainMax.field_o) {
              if (SetFogOfWarOn.field_o[var2_int] != param1) {
                var2_int++;
                continue;
              }
              return true;
            }
            if (!param0) {
              field_E = (int[]) null;
            }
            if (~SetVelocitySustainMax.field_o == ~SetFogOfWarOn.field_o.length) {
              var5 = new Object[SetFogOfWarOn.field_o.length + 1];
              var2 = var5;
              for (var3 = 0; var3 < SetFogOfWarOn.field_o.length; var3++) {
                var5[var3] = SetFogOfWarOn.field_o[var3];
              }
              SetFogOfWarOn.field_o = var2;
            }
            fieldTemp$2 = SetFogOfWarOn.field_o;
            fieldTemp$3 = SetVelocitySustainMax.field_o;
            SetVelocitySustainMax.field_o = SetVelocitySustainMax.field_o + 1;
            fieldTemp$2[fieldTemp$3] = param1;
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("VoidHunters.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final static void updatePanelAnimations(int param0) {
        SetPlayerRepairAmount.e(param0 + 29129);
        if (param0 != -29130) {
          return;
        }
        GetUseBackground.a(param0 + 29129);
    }

    final static void updateChatInputDialog(int param0, int param1, int param2, int param3, String param4, int param5, boolean param6, boolean param7) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (0 != UiValueTrackRenderer.field_b.field_o &&
            !GetBloomThresholdPercentage.field_p) {
            SetFightersPerPlayerMaximum.field_p = true;
          }
          if (!param6) {
            field_E = (int[]) null;
          }
          if (SetFightersPerPlayerMaximum.field_p) {
            SetTorpedoRandomness.a(param0, param1, 20, param5, false, param3, param3, param4, param2);
            OneShotSound.field_l.updateInput(param7, 1332);
            if (!param7) {
              return;
            }
            if (GetMachineGunAimarc.field_q.field_o != 0) {
              SetFightersPerPlayerMaximum.field_p = false;
            }
            if (PartitionZoneFactoryHolder.field_a.field_o == 0) {
              return;
            }
            ChatInputResetter.clearChatInput(26718);
            SetFightersPerPlayerMaximum.field_p = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_16_0 = var8;
          stackIn_16_1 = new StringBuilder().append("VoidHunters.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final void applyShipCookie(boolean logGuard) {
        if (null != GetBombletSprayPushMultiplier.field_o) {
          return;
        }
        String var2 = AppletCookieReader.readCookie("fog_voidhunters_ship", 74, MissionList.b((byte) -125));
        GetDebrisThrowable.a(logGuard, "Ship cookie=" + var2);
        if (var2 != null) {
          SetInnateThrusters.a(0, GetResourceNodeCaptureTime.a(var2, true, true));
        }
    }

    public final void init() {
        this.startClient("voidhunters", -74, 27);
    }

    private final void handleServerPacket(int param0, int param1) {
        int stackIn_59_0 = 0;
        Object var3;
        int var4;
        Object var5;
        int var7;
        GameSession var8;
        int var4Lifetime1;
        int var4Lifetime2;
        Object var3Lifetime1;
        int var4Lifetime1Lifetime1;
        var7 = field_G;
        if (param0 == 9) {
          ColorKeyScaleTextureOperation.d(param1 + 991426336);
          HardpointMatch.field_d = false;
          AgeValidator.field_f = 6;
          BodyInZoneCondition.field_c = AccountNameAvailabilityReplies.field_b.readString(-1);
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param0 == 14) {
          GetDebrisThrowable.a(false, "Entering lobby");
          GetBombletSprayAimarc.a(UiComponent.field_o, SetUseOffscreenRendering.a(0), GetSalvoaim.a(8, (byte) -99), GetSalvoaim.a(2000, (byte) -116), SetUseOffscreenRendering.b(false), true, NetworkGameClient.field_A.length, 150, 1024, GetMissilesAcceleration.a(207));
          GetPhasedEnergyBeamAimarc.a(SetBombletSprayPushMultiplier.a(0), MissileLauncherWeaponDefinition.i((byte) -90), true);
          GraphicsPresentException.field_a = true;
          HardpointMatch.field_d = false;
          if (MatchingFieldValidator.field_g != null &&
            !MatchingFieldValidator.field_g.networked) {
            SecondaryNodeQueue.field_b = 0;
            GetSniperCannonProjectiles.chatVisible = false;
            SetDebrisSurvives.e((byte) -86);
            return;
          }
          if (MatchingFieldValidator.field_g == null) {
            ColorKeyScaleTextureOperation.d(param1 ^ 991426336);
            AgeValidator.field_f = -2;
            GetSniperCannonProjectiles.chatVisible = true;
            HardpointDefinition.a(true);
            decompiledFrameRemainder0 = false;
          }
          else {
            return;
          }
        }
        if (decompiledFrameRemainder0) {
          if (param0 == 15) {
            GetDebrisThrowable.a(false, "Leaving lobby");
            if (GraphicsPresentException.field_a) {
              ColorKeyScaleTextureOperation.d(991426348);
              FloatNoiseSliceGenerator.closeTransientMenusAndDialogs((byte) 110);
              SettingsInstance.clearChatHistory(-15400);
              AssassinationObjectiveText.field_b = true;
              GetThrusterSmallForce.field_o = false;
              GetMessageFadetime.field_o = false;
              SetMissionTerrainDebrisProbability.field_p = false;
              AgeValidator.field_f = 0;
              IntegerRecordWritePackets.field_a = true;
              GraphicsPresentException.field_a = false;
              HardpointDefinition.a(true);
            }
            HardpointMatch.field_d = false;
            SetMassDriverFireForce.field_o = false;
            return;
          }
          if (param0 == 10 &&
            GraphicsPresentException.field_a) {
            GetTeamSelectionSpeedup.a(13);
            GetDebrisThrowable.a(false, "Lobby packet");
            return;
          }
          if (param0 != 57 &&
            param0 != 58) {
            if (59 == param0) {
              GetDebrisThrowable.a(false, "Stop game packet");
              if (null != MatchingFieldValidator.field_g &&
                !MatchingFieldValidator.field_g.networked) {
                return;
              }
              GetDebrisThrowable.a(false, "Stop game! playing=" + GetThrusterSmallForce.field_o + ", spectating=" + SetMissionTerrainDebrisProbability.field_p);
              if (GetThrusterSmallForce.field_o ||
                SetMissionTerrainDebrisProbability.field_p ||
                FlipTextureOperation.field_l.isReceivingGameState(-28208)) {
                ColorKeyScaleTextureOperation.d(991426348);
                if (null == MatchingFieldValidator.field_g) {
                  GetThrusterSmallForce.field_o = false;
                }
                if (GetThrusterSmallForce.field_o) {
                  MatchingFieldValidator.field_g.saveHintsAndOpenMainMenu(false, -10510);
                }
                GetMessageFadetime.field_o = false;
                GetThrusterSmallForce.field_o = false;
                AgeValidator.field_f = -2;
                SetMissionTerrainDebrisProbability.field_p = false;
                IntegerRecordWritePackets.field_a = true;
                GetSniperCannonProjectiles.chatVisible = true;
                HardpointDefinition.a(true);
              }
              FlipTextureOperation.field_l.handleGameStopped(true);
              SetMassDriverFireForce.field_o = false;
              return;
            }
            var3 = null;
            if (!GetThrusterSmallForce.field_o) {
              if (SetMissionTerrainDebrisProbability.field_p) {
                var3 = ProxyAuthenticationException.field_a;
              }
            } else {
              var3 = MatchingFieldValidator.field_g;
            }
            if (param1 != 12) {
              this.cachedFrame = (Sprite) null;
            }
            if (param0 == 62) {
              GetDebrisThrowable.a(false, "Game finished packet");
              if (var3 != null) {
                stackIn_59_0 = (ModelFaceAttachment.a(false)) ? 7 : 0;
                GetNebulaFadesOutWhenClose.a(stackIn_59_0, false, (byte) -85, -1);
              }
              return;
            }
            if (param0 == 63) {
              var4 = AccountNameAvailabilityReplies.field_b.readUnsignedByte((byte) -107);
              if (var3 != null) {
                ((GameSession) (var3)).state.drawOfferMask = var4;
                decompiledFrameRemainder0 = (null != MatchingFieldValidator.field_g);
                if (decompiledFrameRemainder0) {
                  PolarDisplacementTextureOperation.updateDrawMenuLabel(-19057);
                }
              }
              if (decompiledFrameRemainder0) {
                return;
              }
            }
            if (decompiledFrameRemainder0) {
              if (param0 != 64) {
                if (param0 == 65) {
                  var4Lifetime1 = AccountNameAvailabilityReplies.field_b.readUnsignedByte((byte) -110);
                  if (var3 != null) {
                    ((GameSession) (var3)).state.rematchRequestMask = var4Lifetime1;
                    if (null == MatchingFieldValidator.field_g) {
                      return;
                    }
                    VariableCondition.updateRematchMenuLabel(param1 ^ -86);
                  }
                  return;
                }
                if (param0 == 66) {
                  var4Lifetime1Lifetime1 = AccountNameAvailabilityReplies.field_b.readUnsignedByte((byte) -128);
                  if (var3 != null) {
                    ((GameSession) (var3)).field_B = var4Lifetime1Lifetime1;
                    if (null == MatchingFieldValidator.field_g) {
                      return;
                    }
                    VariableCondition.updateRematchMenuLabel(-106);
                  }
                  return;
                }
                if (GetMpSandboxEnemySpawnLimit.a(-53, param0)) {
                  return;
                }
                if ((param0 == 11 ||
                  12 == param0) &&
                  (MatchingFieldValidator.field_g != null &&
                  MatchingFieldValidator.field_g.networked &&
                  GetThrusterSmallForce.field_o)) {
                  GetNebulaFadesOutWhenClose.a(-118, PendingScoreboardRequest.soundEffects[5]);
                }
                var5 = null;
                if (var3 != null) {
                  var5 = ((GameSession) (var3)).state.carouselInfo;
                }
                if (FlipTextureOperation.field_l.handlePacket(RequestNewestBlackboxRecording.field_p, AccountNameAvailabilityReplies.field_b, GetThrusterSmallForce.field_o, (byte) 7, param0, (CarouselCommongameInfo) (var5))) {
                  return;
                }
                this.dispatchCommonServerPacket(97);
                return;
              }
              var4Lifetime2 = AccountNameAvailabilityReplies.field_b.readUnsignedByte((byte) -90);
              if (var3 != null &&
                !FlipTextureOperation.field_l.isReceivingGameState(-28208)) {
                ((GameSession) (var3)).state.disconnectedPlayerMask = var4Lifetime2;
                return;
              }
              FlipTextureOperation.field_l.bufferDisconnectedPlayerMask(-29804, var4Lifetime2);
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            GetDebrisThrowable.a(false, "Start game packet");
            ColorKeyScaleTextureOperation.d(991426348);
            MatchingFieldValidator.field_g = null;
            ProxyAuthenticationException.field_a = null;
            var8 = SetPointDefenceLaserProjectileDamage.a(param0, FlipTextureOperation.field_l, AccountNameAvailabilityReplies.field_b, (byte) 120);
            var3Lifetime1 = var8;
            if (var8 != null) {
              GpuSprite.field_e = false;
              GetSniperCannonProjectiles.chatVisible = false;
              if (param0 == 57) {
                MatchingFieldValidator.field_g = (GameSession) (var3Lifetime1);
                GetThrusterSmallForce.field_o = true;
                PolarDisplacementTextureOperation.updateDrawMenuLabel(-19057);
                VariableCondition.updateRematchMenuLabel(-126);
                SetDebrisSurvives.e((byte) -76);
              } else {
                SetMissionTerrainDebrisProbability.field_p = true;
                ProxyAuthenticationException.field_a = var8;
              }
              SetMassDriverFireForce.field_o = false;
              AgeValidator.field_f = -1;
              GetMessageFadetime.field_o = true;
            }
            return;
          }
        }

    }

    final void updateGameTick(int param0) {
        boolean stackIn_7_1 = false;
        boolean stackIn_27_1 = false;
        int stackIn_69_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_85_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        ByteIndexedRecordWriteRequest var7;
        int var3Lifetime1;
        int var3Lifetime2;
        var6 = field_G;
        ProxySocketConnector.field_f = SetPedrosRepairModeSwitchtime.a(32);
        GetCountermeasureLauncherEnergyUsed.field_o = NormalMapTextureOperation.d(-2);
        SetReverbFeedback.e(200);
        if (psb.field_b != null &&
          psb.field_b.focusLost) {
          VariableCondition.b((byte) 116);
          ConsoleEvaluationException.a((byte) -115);
        }
        stackIn_7_1 = (psb.field_b != null);
        this.updateClientServices(stackIn_7_1, 9);
        if (GetMissionTerrainDebrisProbability.field_o) {
          TextureLineShape.field_i.requestResources((byte) 1);
          GetMissionTerrainDebrisProbability.field_o = false;
        }
        var2 = -40 % ((23 - param0) / 61);
        SetMinimapWidth.field_o = SetMinimapWidth.field_o + 1;
        if (GetUseTriFill.a(51)) {
          ComponentCollision.a("Servicing login...", (byte) -86);
          this.updateLoginUi(0);
          if (GetUseTriFill.a(119)) {
            return;
          }
        }
        if (!LegacyOpenGlEnvironmentReflectionEffect.field_e) {
          ComponentCollision.a("Servicing login_create_ui...", (byte) -85);
          GetLagOut.a(GetPointDefenceLaserPulsetime.field_o, 15877);
          ComponentCollision.a("Finished servicing login_create_ui...", (byte) -72);
          if (this.finishResourceLoading((byte) 125)) {
            LegacyOpenGlEnvironmentReflectionEffect.field_e = true;
          }
        } else {
          if (!Mission.b(-1)) {
            GetUseRectOutline.updatePlayerGameDataLoading(false);
            if (TextLayout.playerGameDataLoaded &&
              this.isTutorialEnabled(0) &&
              !TutorialHintStatus.hasAnyCompletedHints(-116)) {
              WaterNoiseGpuMaterialEffect.startOfflineGame(true, false);
            }
          } else {
            if (QuickChatMenuWidget.l(0)) {
              stackIn_27_1 = (psb.field_b != null);
              var3 = this.processLoginUi(stackIn_27_1, -9288);
              if (1 == var3 ||
                var3 == 2) {
                if (psb.field_b != null) {
                  VariableCondition.b((byte) -56);
                }
                if (2 == var3) {
                  VoidHunters.quitToWebsite(MissionList.b((byte) -118), 4);
                }
              }
              this.updateClientStateAndInput(true, -121);
            } else {
              if (!SoftwareFaceAttachment.isMessageBoxOpen(false)) {
                if (SetDebrisGroupColour.b(false)) {
                  this.updateClientStateAndInput(true, -126);
                } else {
                  this.updateClientStateAndInput(false, -124);
                }
              } else {
                if (ClassNameFormatter.field_b == ClassNameFormatter.field_a) {
                  var3 = LaunchFightersOrderDefinition.pollMenuAction(-31515);
                  if (var3 == 1) {
                    kua.field_e = true;
                    ta.a((byte) -121, 0);
                  }
                  this.updateClientStateAndInput(true, -127);
                } else {
                  this.updateClientStateAndInput(false, -122);
                }
              }
            }
          }
        }
        FlipTextureOperation.field_l.updateNetwork(RequestNewestBlackboxRecording.field_p, -114);
        if (!GetPhasedEnergyBeamPulsetime.isGuestMode((byte) 111)) {
          while (true) {
            var7 = (ByteIndexedRecordWriteRequest) (SetGrapplingHookCooldown.queuedByteIndexedRecordWrites.removeFirst(true));
            if (var7 == null) {
              break;
            }
            SetLaserReload.enqueueByteIndexedRecordWrite(4, var7, 0);
          }
        }
        while (GetSelfDestructTimer.readServerPacket(0, ta.serverPacketLengths)) {
          var3Lifetime1 = NetworkMessageState.incomingOpcode;
          this.handleServerPacket(var3Lifetime1, 12);
        }
        SetReverbWidth.flushNetworkOutput(0, -29008);
        if (GetSniperCannonProjectiles.chatVisible) {
        }
        if (null != FlipTextureOperation.field_l &&
          !GetThrusterSmallForce.field_o &&
          !SetMissionTerrainDebrisProbability.field_p &&
          FlipTextureOperation.field_l.dataReceiver.getProgressPercent(0) <= 0) {
          FlipTextureOperation.field_l.finishReceivingGameState((byte) -110);
        }
        boolean decompiledFrameRemainder0 = true;
        if ((DeveloperAccess.hasDeveloperAccess(2) ||
          (MatchingFieldValidator.field_g != null &&
          MatchingFieldValidator.field_g.state.carouselInfo.outOfSync ||
          ProxyAuthenticationException.field_a != null &&
          ProxyAuthenticationException.field_a.state.carouselInfo.outOfSync) &&
          null != FlipTextureOperation.field_l &&
          null == FlipTextureOperation.field_l.dataSender) && (SocketNetworkArchiveClient.g(-114) &&
          SetMachineGunEnergyUsed.field_o[82] &&
          SetMachineGunEnergyUsed.field_o[35])) {
          stackIn_69_0 = 1;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_69_0 = 0;
        }
        var3Lifetime2 = stackIn_69_0;
        if (var3Lifetime2 != 0) {
          FighterBayWeaponDefinition.l(-118);
        }
        if (SetWeaponProjectileSpeedMultiply.b(true)) {
          FlipTextureOperation.field_l.suspendServerUpdates((byte) -94);
          var4 = this.pollReconnect(109);
          if (var4 == 0 ||
            var4 == 1) {
            iwa.a((byte) -30, 2);
            GetSalvoDamageMultiplier.resendQueuedRecordRequests(50, 4);
            GetReverbGain.resendClientDataRequests(6, (byte) -52);
            RasterShapesTextureOperation.resendIntegerRecordRequests(5, 0);
            GetReverbDry.resetReflectionCheckQueue(-115);
            if (1 == var4) {
              if (MatchingFieldValidator.field_g == null ||
                MatchingFieldValidator.field_g.networked) {
                SetMassDriverFireForce.field_o = true;
                HardpointMatch.field_d = true;
              }
            } else {
              if (GraphicsPresentException.field_a) {
                IntegerRecordWritePackets.field_a = true;
                AssassinationObjectiveText.field_b = true;
                GetMessageFadetime.field_o = false;
                if (!GetThrusterSmallForce.field_o) {
                  stackIn_85_0 = (!ModelFaceAttachment.a(false)) ? 0 : 7;
                  GetNebulaFadesOutWhenClose.a(stackIn_85_0, false, (byte) -85, 0);
                } else {
                  BodyInZoneCondition.field_c = GetMissilesDamageSourceTeam.field_o;
                  stackIn_81_0 = (ModelFaceAttachment.a(false)) ? 7 : 0;
                  GetNebulaFadesOutWhenClose.a(stackIn_81_0, false, (byte) -85, 6);
                }
                ColorKeyScaleTextureOperation.d(991426348);
                lo.field_a[GetArmageddonTimerStart.field_o].resetSelection(false, 320, 0);
                GraphicsPresentException.field_a = false;
                GetThrusterSmallForce.field_o = false;
                SetMissionTerrainDebrisProbability.field_p = false;
                HardpointDefinition.a(true);
              }
              HardpointMatch.field_d = false;
              SetMassDriverFireForce.field_o = false;
            }
          }
          var5 = 0;
          if (2 == var4) {
            var5 = 1;
          }
          if (var3Lifetime2 != 0) {
            var5 = 1;
          }
          if (GraphicsPresentException.field_a ||
            HardpointMatch.field_d ||
            SetMassDriverFireForce.field_o) {
            var5 = 1;
          }
          if (!SetWeaponProjectileSpeedMultiply.b(true)) {
            var5 = 0;
          }
          if (var5 != 0) {
            NetworkArchiveRequest.f((byte) -119);
          }
        }
    }

    private final boolean isTutorialEnabled(int param0) {
        if (param0 != 0) {
          this.updateClientStateAndInput(true, 48);
        }
        return SetUseExtraBackground.showTutorial;
    }

    private final void setGameMusicChannelLevels(MidiChannelLevels param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = field_G;
        try {
          if (param1 != -19653) {
            this.menuMusicMixId = -9;
          }
          if (this.gameMusicMixId == -1) {
            for (var4_int = 0; param0.levels.length > var4_int; var4_int++) {
              LegacyOpenGlTurbulenceEffect.field_g.setChannelGain(param0.levels[var4_int], (byte) 18, var4_int);
            }
          } else {
            LegacyOpenGlTurbulenceEffect.field_g.fadeToChannelLevels((byte) -115, 4000, param0);
          }
          this.gameMusicMixId = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("VoidHunters.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void initializeGame(boolean param0) {
        this.initializeNetworkClient(false, 110, 92);
        TextureLineShape.field_i = new GameResourceLoader();
        MidiPcmStream var6 = new MidiPcmStream();
        var6.setDefaultProgram(128, (byte) 96, 9);
        GetThrusterParticleLife.field_o = new FadingMidiPcmStream();
        LegacyOpenGlTurbulenceEffect.field_g = new FadingMidiPcmStream(GetThrusterParticleLife.field_o);
        MidiPcmStream var3 = new MidiPcmStream();
        MidiCrossfadeStream var4 = new MidiCrossfadeStream(GetThrusterParticleLife.field_o, LegacyOpenGlTurbulenceEffect.field_g, var3);
        AppletReload.a((byte) -32, true, SetTorpedoProjectiles.field_o, (java.awt.Component) ((Object) igb.field_a), var4, 22050);
        ScreenSizeController var5 = new ScreenSizeController(new GameCanvasResizeListener());
        var5.minimumMemoryMegabytes = 0;
        var5.resizable = false;
        SetMissionTimeLimit.a(var5, 20);
        DebugRequestFactory.a((byte) 90, ta.serverPacketLengths, (NetworkGameClient) (this));
        SetNebulaProximityFadeDownshift.a(114, param0, false);
        FlipTextureOperation.field_l = new CarouselGameClient();
        GetCountermeasureLauncherAimarc.e((byte) 117);
        this.applyShipCookie(false);
        ArchiveIndexLoader.field_g = new ServerInfo();
        ArchiveIndexLoader.field_g.resetOptionStates((byte) -65);
        SetUseTriFill.field_o = GameKeyHandler.b(-89);
        SetGrapplingHookMaxExtension8Force.field_o = TextureCombineMappings.field_b;
        LobbyOptionCompatibilityRules.optionCombinations = GetPointDefenceLaserAimspeed.field_o;
        if (UiDraggableContainer.field_E) {
          GetGrapplingHooksDamageableBySourcePlayer.e((byte) -120);
          GetMissileLauncherProjectileLife.graphicsQuality = GetLagIn.getIntegerPreference(GetMissileLauncherProjectileLife.graphicsQuality, 68, "graphics_quality");
          PopupMenuWidget.applyGraphicsQualityPreset(false);
          LoopingSound.setSoundEffectVolume(GetLagIn.getIntegerPreference(RidgedNoiseVolumeGenerator.soundEffectVolume, 93, "fx_volume"), -13205);
          BitmapTextLayout.setMusicVolume(GetLagIn.getIntegerPreference(GetMutatorVotes.field_p, 21, "music_volume"), (byte) -99);
          GetMassDriverProjectiles.field_q = GetLagIn.getIntegerPreference(GetMassDriverProjectiles.field_q, 36, "graphics_mode");
        }
    }

    public static void clearSharedReferences(int param0) {
        field_E = null;
        if (param0 != 0) {
          String var2 = (String) null;
          VoidHunters.updateChatInputDialog(-6, -55, -125, 73, (String) null, -128, true, true);
        }
    }

    private final void updateMusicSelection(byte param0) {
        int stackIn_5_0 = 0;
        int var2;
        int var3;
        GameSession var4;
        int var5;
        int var6_int;
        MidiChannelLevels var6;
        int var7;
        int var8;
        MidiChannelLevels var9;
        MidiChannelLevels var10;
        MidiChannelLevels var11;
        var7 = field_G;
        if (MatchingFieldValidator.field_g == null &&
          null == ProxyAuthenticationException.field_a) {
          stackIn_5_0 = 0;
        } else {
          stackIn_5_0 = 1;
        }
        var2 = stackIn_5_0;
        var3 = 28 / ((-54 - param0) / 37);
        if (var2 != 0) {
          if (GetBurstFireMaxEnergy.field_p.selectedStream != LegacyOpenGlTurbulenceEffect.field_g &&
            this.musicStingCooldown <= 0) {
            GetBurstFireMaxEnergy.field_p.crossfadeToTrack(-126, CachedByteArray.musicTracks[1], 100, 1000000);
          }
          this.menuMusicMixId = -1;
        } else {
          if (GetBurstFireMaxEnergy.field_p.selectedStream != GetThrusterParticleLife.field_o) {
            GetBurstFireMaxEnergy.field_p.crossfadeToTrack(-127, CachedByteArray.musicTracks[0], 100, 1000000);
          }
          this.gameMusicMixId = -1;
        }
        if (this.musicStingCooldown > 0) {
          this.musicStingCooldown = this.musicStingCooldown - 1;
        }
        regionExit1: {
          if (var2 != 0) {
            if (BodyInZoneConditionFactory.a(false, GetArmageddonTimerStart.field_o)) {
              if (4 != this.gameMusicMixId) {
                var9 = new MidiChannelLevels();
                var9.levels[0] = 255;
                this.setGameMusicChannelLevels(var9, -19653, 4);
              }
            } else {
              var4 = MatchingFieldValidator.field_g;
              if (var4 == null) {
                var4 = ProxyAuthenticationException.field_a;
              }
              if (var4 != null) {
                var5 = var4.getMusicState(-18620);
                if (var5 == 5) {
                  if (this.musicStingCooldown <= 0) {
                    for (var6_int = 0; var6_int < 16; var6_int++) {
                      LegacyOpenGlTurbulenceEffect.field_g.setChannelGain(0, (byte) 18, var6_int);
                    }
                    AdminMessage.playMusicTrack(32, false, CachedByteArray.musicTracks[2]);
                    this.musicStingCooldown = 500;
                  }
                } else {
                  if (6 == var5 &&
                    this.musicStingCooldown <= 0) {
                    for (var6_int = 0; var6_int < 16; var6_int++) {
                      LegacyOpenGlTurbulenceEffect.field_g.setChannelGain(0, (byte) 18, var6_int);
                    }
                    AdminMessage.playMusicTrack(32, false, CachedByteArray.musicTracks[3]);
                    this.musicStingCooldown = 500;
                  }
                }
                if (~var5 != ~this.gameMusicMixId) {
                  var6 = new MidiChannelLevels();
                  if (0 == var5) {
                    var6.levels[0] = 255;
                    var6.levels[5] = 255;
                    var6.levels[8] = 255;
                    var6.levels[7] = 255;
                  } else {
                    switch (var5) {
                      case 1:
                        var6.levels[6] = 255;
                        var6.levels[7] = 255;
                        var6.levels[9] = 255;
                        var6.levels[10] = 255;
                        var6.levels[3] = 255;
                        var6.levels[0] = 255;
                        var6.levels[15] = 255;
                        var6.levels[8] = 255;
                        var6.levels[5] = 255;
                        break;
                      case 2:
                        var6.levels[14] = 255;
                        var6.levels[13] = 255;
                        var6.levels[15] = 255;
                        var6.levels[8] = 255;
                        var6.levels[11] = 255;
                        var6.levels[2] = 255;
                        var6.levels[12] = 255;
                        var6.levels[1] = 255;
                        break;
                      default:
                        this.setGameMusicChannelLevels(var6, -19653, var5);
                        break regionExit1;
                      case 3:
                        var6.levels[4] = 255;
                        break;
                    }
                  }
                  this.setGameMusicChannelLevels(var6, -19653, var5);
                }
              }
            }
          }
        }
        if (!BodyInZoneConditionFactory.a(false, GetArmageddonTimerStart.field_o)) {
          if (GetArmageddonTimerStart.field_o == -2 &&
            this.menuMusicMixId != 1) {
            var11 = new MidiChannelLevels();
            var11.levels[14] = 255;
            this.setMenuMusicChannelLevels(-23134, var11, 1);
          }
        } else {
          if (var2 == 0 &&
            this.menuMusicMixId != 0) {
            var10 = new MidiChannelLevels();
            var8 = 0;
            var5 = var8;
            while (var8 < var10.levels.length) {
              var10.levels[var8] = 255;
              var8++;
            }
            var10.levels[14] = 0;
            this.setMenuMusicChannelLevels(-23134, var10, 0);
          }
        }
    }

    final static void quitToWebsite(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
              if (param1 != 4) {
                return;
              }
              param0.getAppletContext().showDocument(OpenGlModel.updateUrlSessionSettings(var2, (byte) -89, param0), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("VoidHunters.T(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void clearClientResources(boolean param0) {
        VoidHunters.clearSharedReferences(0);
        NanosecondClock.clearSharedReferences(4);
        BitmapFont.clearSharedReferences();
        ToolkitRasterStateStack.clearSharedReferences(89);
        GameInterfaceText.clearSharedReferences(9502);
        ConsoleSettingsScript.clearSharedReferences(15873);
        BlueprintEditorText.clearSharedReferences(1);
        oua.clearSharedReferences(true);
        CarouselGameClient.clearSharedReferences(66);
        GraphicsToolkitSelector.clearSharedReferences(10970);
        SpriteArchiveDecoder.clearSharedReferences(2);
        FadingMidiPcmStream.clearSharedReferences(0);
        MidiCrossfadeStream.clearSharedReferences(98);
        btb.clearSharedReferences((byte) 94);
        LawViolationReportText.clearSharedReferences(-12407);
        sh.clearSharedReferences((byte) 89);
        LoginFormNavigation.clearSharedReferences(param0);
        GameInvitationText.clearSharedReferences(26986);
        ReturnToLobbyText.clearSharedReferences(114);
        ServerInfo.clearSharedReferences(true);
        ShipBlueprint.clearSharedReferences(0);
        GameKeyHandler.clearSharedReferences(-106);
        NetworkGameClient.clearSharedReferences(false);
        ClientException.clearSharedReferences(127);
        UrlJaggrabRequest.clearSharedReferences(-19766);
        MouseWheelInput.clearSharedReferences(-25692);
        SoftwareRasterizer2D.clearSharedReferences();
        ResourceArchive.clearSharedReferences((byte) 112);
        PacketBuffer.clearSharedReferences(-38);
        MonotonicMillisClock.clearSharedReferences(-101);
        TextureCombineMappings.clearSharedReferences((byte) 40);
        kia.clearSharedReferences(3553);
        CarouselConstantRequests.clearSharedReferences(32768);
        wja.clearSharedReferences(false);
        GpuVertexKeyBuffer.clearSharedReferences(23870);
        PartitionZoneFactoryHolder.clearSharedReferences(8);
        lmb.clearSharedReferences((byte) -53);
        ChatMessage.clearSharedReferences((byte) 75);
        nqa.clearSharedReferences((byte) -30);
        AppletRasterBuffer.clearSharedReferences(-23483);
        ArchiveRequestQueue.clearSharedReferences((byte) -108);
        FullscreenCanvas.clearSharedReferences(false);
        ScreenSizeController.clearSharedReferences((byte) 120);
        GameMenuScreen.clearSharedReferences(3);
        GameSession.clearSharedReferences(!param0 ? true : false);
        PlayerGameData.clearSharedReferences(-106);
        CommandConsole.clearSharedReferences((byte) -107);
        GameResourceLoader.clearSharedReferences(111);
        MenuBackgroundBattle.clearSharedReferences((byte) 101);
        mn.clearSharedReferences(-49);
        ShipComponent.clearSharedReferences(24388);
        iwa.clearSharedReferences((byte) -116);
        igb.clearSharedReferences(0);
        AppletCookieReader.clearSharedReferences(-47);
        ArmBehaviour.clearSharedReferences(-58);
        GrappleLauncherBehaviour.clearSharedReferences((byte) 114);
        ThrusterBehaviour.clearSharedReferences(-69);
        WeaponBehaviour.clearSharedReferences(!param0 ? true : false);
        fra.clearSharedReferences(2147483647);
        BoosterOrderText.clearSharedReferences(12472);
        SpecialOrderDefinition.clearSharedReferences((byte) -95);
        eqb.clearSharedReferences(65);
        TooltipDisplay.clearSharedReferences(param0);
        WorldDebugArrow.clearSharedReferences((byte) 26);
        CommonGameState.clearSharedReferences(28801);
        MissionBuilder.clearSharedReferences(1);
        MissionCondition.clearSharedReferences((byte) -110);
        MissionControl.clearSharedReferences((byte) -98);
        MissionEvent.clearSharedReferences((byte) -76);
        MissionState.clearSharedReferences(!param0 ? true : false);
        MissionVariable.clearSharedReferences((byte) -102);
        ObjectiveMarker.clearSharedReferences(30089);
        Asteroid.clearSharedReferences(3);
        Debris.clearSharedReferences((byte) -127);
        EscapePod.clearSharedReferences(3);
        PartitionZone.clearSharedReferences(true);
        PartitioningManager.clearSharedReferences(117);
        Projectile.clearSharedReferences(-124);
        ResourceNode.clearSharedReferences(false);
        ShipAI.clearSharedReferences(false);
        World.clearSharedReferences(3);
        SettingsChange.clearSharedReferences((byte) 61);
        SpawnChoice.clearSharedReferences(32);
        SpecialOrderSubmessage.clearSharedReferences(-120);
        ToolkitPolygonRasterizer.clearSharedReferences();
        LobbyOptionCompatibilityRules.clearSharedReferences(500);
        BaseObjectiveLabel.clearSharedReferences(-18013);
        Widget.clearSharedReferences(-2147483648);
        TutorialController.clearSharedReferences(39);
        TimingGraph.clearSharedReferences(-1);
        SoftwareFlatTriangleRasterizer.clearSharedReferences();
        LobbyGameContextMenuBuilder.clearSharedReferences((byte) 35);
        SettingsInstance.clearSharedReferences(17674);
        MissionList.clearSharedReferences(param0);
        AccountNameAvailabilityReplies.clearSharedReferences(114);
        qs.clearSharedReferences(true);
        joa.clearSharedReferences(26936);
        ComponentAttachmentPlan.clearSharedReferences(16606);
        ProjectileHit.clearSharedReferences(false);
        MovingObject.clearSharedReferences(true);
        SetVariableLabelAction.clearSharedReferences(112);
        TickCondition.clearSharedReferences((byte) -44);
        CarouselSlot.clearSharedReferences(false);
        MessageLog.clearSharedReferences(1);
        MapClearanceCircle.clearSharedReferences(true);
        MapClearanceRectangle.clearSharedReferences((byte) 127);
        AdjustBodyComponentsAction.clearSharedReferences((byte) 94);
        AdjustVariableAction.clearSharedReferences(true);
        AwardVictoryToTeamAction.clearSharedReferences(1);
        SetVariableAction.clearSharedReferences((byte) 24);
        SetShipTeamAction.clearSharedReferences((byte) 118);
        BodyDestroyedCondition.clearSharedReferences(6970);
        BodyInZoneCondition.clearSharedReferences(-15818);
        TeamNodeCondition.clearSharedReferences(-2684);
        ShipSpawnedCondition.clearSharedReferences((byte) 11);
        ShipTeamCondition.clearSharedReferences(-10570);
        VariableCondition.clearSharedReferences(-120);
        ComponentContact.clearSharedReferences((byte) 18);
        HardpointMatch.clearSharedReferences((byte) 87);
        AttachmentInputState.clearSharedReferences((byte) -66);
        ShieldInfoPool.clearSharedReferences(-127);
        AsteroidField.clearSharedReferences((byte) 48);
        GrapplingHook.clearSharedReferences((byte) -116);
        SpawnPoint.clearSharedReferences(51200);
        SpawnLocation.clearSharedReferences(12035);
        Hardpoint.clearSharedReferences(64);
        FixedPointTrigonometry.clearSharedReferences((byte) 70);
        pea.clearSharedReferences(true);
        sra.clearSharedReferences(96);
        ArchiveTextureProvider.clearSharedReferences(25498);
        SoundCache.clearSharedReferences((byte) -120);
        HuffmanCodec.clearSharedReferences(15060);
        tea.clearSharedReferences(!param0 ? true : false);
        MidiPcmStream.clearSharedReferences(!param0 ? true : false);
        NodeHashTable.clearSharedReferences((byte) 19);
        MidiNote.clearSharedReferences(-25815);
        MidiFileReader.clearSharedReferences();
        MusicPatchPcmStream.clearSharedReferences(false);
        AudioOutput.clearSharedReferences();
        GameCanvasResizeListener.clearSharedReferences(2);
        ChunkedDataReceiver.clearSharedReferences(100);
        GameReleaseStatistics.clearSharedReferences(95);
        DeveloperAccess.clearSharedReferences(2);
        SecondaryNodeHashTable.clearSharedReferences(1);
        spb.clearSharedReferences(0);
        AssassinationObjectiveText.clearSharedReferences((byte) 38);
        MenuInputState.clearSharedReferences(-1);
        LoopingSound.clearSharedReferences(2128263208);
        mba.clearSharedReferences((byte) 26);
        WidgetNode.clearSharedReferences(8);
        cwa.clearSharedReferences((byte) 74);
        MessageBoxState.clearSharedReferences(9911);
        ModalStack.clearSharedReferences((byte) -96);
        LoginTransitionDialog.clearSharedReferences(false);
        AccountCreationForm.clearSharedReferences(112);
        GuestPlayNoticePanel.clearSharedReferences((byte) 61);
        LoginForm.clearSharedReferences(3);
        ChoosePlayerNameForm.clearSharedReferences((byte) 115);
        AccountRequestText.clearSharedReferences((byte) -114);
        UiTheme.clearSharedReferences((byte) -29);
        AppletReload.clearSharedReferences(-127);
        RemoveEventAction.clearSharedReferences(-125);
        Cp1252Strings.clearSharedReferences(!param0 ? true : false);
        NineSliceSprite.clearSharedReferences(-22113);
        BufferedFile.clearSharedReferences(-73);
        lo.clearSharedReferences(true);
        psb.clearSharedReferences(false);
        LoginCredentials.clearSharedReferences(124);
        vw.clearSharedReferences((byte) 55);
        IntrusiveDequeIterator.clearSharedReferences(-20221);
        NetworkArchiveClient.clearSharedReferences(125);
        ArchiveDiskWorker.clearSharedReferences(63);
        ArchiveIndexLoader.clearSharedReferences(5);
        ppb.clearSharedReferences(37);
        ScrollBarWidget.clearSharedReferences((byte) 22);
        PopupMenuWidget.clearSharedReferences(0);
        ScrollableActionPanel.clearSharedReferences((byte) 127);
        PlayerContextMenu.clearSharedReferences((byte) -106);
        lwa.clearSharedReferences(0);
        IconTextWidget.clearSharedReferences(1);
        SocialTabsPanel.clearSharedReferences((byte) 42);
        TabbedWidget.clearSharedReferences(126);
        DualLinkNode.clearSharedReferences(-31049);
        DeveloperConsole.clearSharedReferences((byte) 78);
        ffb.clearSharedReferences(-106);
        TextInputWidget.clearSharedReferences((byte) 124);
        DateOfBirthEntryPanel.clearSharedReferences(-89);
        ToolkitCanvasContext.clearSharedReferences(true);
        PanelHeightQuery.clearSharedReferences(5);
        ebb.clearSharedReferences(23357);
        SpriteDimensions.clearSharedReferences(!param0 ? true : false);
        DisplayModeErrorDialog.clearSharedReferences((byte) -16);
        SoftwareSprite2D.clearSharedReferences(true);
        TutorialHintStatus.clearSharedReferences(0);
        lm.clearSharedReferences(127);
        FeatheredLineRasterizer.clearSharedReferences((byte) 80);
        QuickChatMenuWidget.clearSharedReferences(85);
        QuickChatCategoryLoader.clearSharedReferences((byte) -33);
        SystemNanoClock.clearSharedReferences((byte) -58);
        UnratedRematchText.clearSharedReferences(-128);
        ToolkitRasterStateCache.clearSharedReferences((byte) 122);
        LobbyInviteSuggestionText.clearSharedReferences(6947);
        UiToggleButtonRenderer.clearSharedReferences(22089);
        UiStatefulStyle.clearSharedReferences((byte) -18);
        UiAngleDialRenderer.clearSharedReferences(false);
        UiValueTrackRenderer.clearSharedReferences(true);
        UiTextStyle.clearSharedReferences(22540);
        UiComponent.clearSharedReferences((byte) 71);
        ModalPanel.clearSharedReferences((byte) -17);
        TextLayout.clearSharedReferences(54);
        DisplayModeDialog.clearSharedReferences(1);
        DisplayMode.clearSharedReferences((byte) -114);
        ResizableModalPanel.clearSharedReferences(-27545);
        UiComboBox.clearSharedReferences(-104);
        UiFocusableComponent.clearSharedReferences(124);
        UiContainer.clearSharedReferences(param0);
        UiArrayContainer.clearSharedReferences(0);
        CarouselSystemEvent.clearSharedReferences(-126);
        DebugMessage.clearSharedReferences(-113);
        DebugSendable.clearSharedReferences((byte) 104);
        DebugRequest.clearSharedReferences((byte) 46);
        CarouselSlotStateDump.clearSharedReferences(32);
        ServerTick.clearSharedReferences(16214);
        CarouselPlayerEvent.clearSharedReferences(9);
        PlayerLeave.clearSharedReferences(false);
        PlayerReady.clearSharedReferences((byte) -88);
        StringBuilderOutputStream.clearSharedReferences(false);
        ArchiveProvider.clearSharedReferences(-19);
        AudioPump.clearSharedReferences(-11954);
        PlayerVote.clearSharedReferences((byte) -98);
        SoftwarePolygonRasterizer.clearSharedReferences();
        ComponentBehaviour.clearSharedReferences(0);
        TimedSpecialOrderBehaviour.clearSharedReferences(126);
        uab.clearSharedReferences(0);
        VorbisSample.clearSharedReferences();
        LogoMesh.clearSharedReferences(118);
        ConvoyObjectiveText.clearSharedReferences((byte) 124);
        GuestPlayText.clearSharedReferences(0);
        LobbyThemeBuilder.clearSharedReferences((byte) -103);
        NativeLibraryLoader.clearSharedReferences(115);
        IntIndexTable.clearSharedReferences((byte) 127);
        ByteStorage.clearSharedReferences(1);
        Bzip2Decompressor.clearSharedReferences();
        Bzip2State.clearSharedReferences(53);
        fia.clearSharedReferences((byte) -28);
        VorbisFloor.clearSharedReferences();
        TutorialProgressState.clearSharedReferences((byte) 66);
        SoftLruCache.clearSharedReferences(118);
        SpritePadding.clearSharedReferences(0);
        CombatHelpText.clearSharedReferences(false);
        SocketConnector.clearSharedReferences((byte) -109);
        ProxyAuthenticationException.clearSharedReferences(91);
        MissionGenerationData.clearSharedReferences((byte) -125);
        TargetLock.clearSharedReferences(true);
        MapClearanceArea.clearSharedReferences((byte) -128);
        RoundResult.clearSharedReferences((byte) -128);
        lh.clearSharedReferences(15261);
        TeamShipComponentCondition.clearSharedReferences(-2404);
        LruNodeCache.clearSharedReferences(false);
        ProceduralTexture.clearSharedReferences(!param0 ? true : false);
        qeb.clearSharedReferences((byte) -122);
        tn.clearSharedReferences((byte) 110);
        ModelFaceAttachment.clearSharedReferences((byte) 124);
        AwardVictoryToWinnerAction.clearSharedReferences(0);
        OneShotSound.clearSharedReferences(true);
        SocketNetworkArchiveClient.clearSharedReferences(0);
        NetworkArchiveRequest.clearSharedReferences((byte) 114);
        DiskArchiveRequest.clearSharedReferences(100);
        CachedArchiveProvider.clearSharedReferences((byte) -110);
        SoundInstrument.clearSharedReferences();
        ValidatedTextField.clearSharedReferences(88);
        UiTextField.clearSharedReferences((byte) -128);
        StripedProgressBar.clearSharedReferences(16711935);
        HotspotTextWidget.clearSharedReferences(-30);
        ValidationStatusWidget.clearSharedReferences(-2459);
        UiToggleButton.clearSharedReferences(-125);
        TextFieldValidator.clearSharedReferences(-27183);
        LogoFinalFrameBottom.clearSharedReferences(false);
        Under13AccountNoticePanel.clearSharedReferences((byte) 77);
        PlayerRequestPackets.clearSharedReferences(-72);
        MidiEnvelope.clearSharedReferences(-17719);
        UiAngleDial.clearSharedReferences(6344);
        WhirlpoolDigest.clearSharedReferences(0);
        DateOfBirthTextFields.clearSharedReferences((byte) 106);
        DateOfBirthInput.clearSharedReferences((byte) -81);
        UiScrollPane.clearSharedReferences(1);
        IntrusiveNodeHashTable.clearSharedReferences((byte) -126);
        SecondaryNodeDeque.clearSharedReferences(!param0 ? true : false);
        SoftwareFramebuffer.clearSharedReferences(true);
        LegacyOpenGlTextureCache.clearSharedReferences(-120);
        LegacyOpenGlMaterialEffectManager.clearSharedReferences(param0);
        OpenGlPostProcessor.clearSharedReferences(1);
        OpenGlBloomEffect.clearSharedReferences(0);
        OpenGlInterleavedVertexBuffer.clearSharedReferences((byte) -26);
        OpenGlSprite.clearSharedReferences(1);
        OpenGlFramebuffer.clearSharedReferences(1);
        OpenGlTransform3D.clearSharedReferences(13);
        OpenGlCubeTexture.clearSharedReferences((byte) 81);
        GpuToolkit.clearSharedReferences((byte) -101);
        VertexAttribute.clearSharedReferences((byte) -84);
        GpuDataType.clearSharedReferences(17);
        WaterTextures.clearSharedReferences((byte) 108);
        GpuTransform3D.clearSharedReferences(108);
        TextureTransformMode.clearSharedReferences(17121);
        TextureCombineOperation.clearSharedReferences(-3696);
        atb.clearSharedReferences(true);
        GpuMaterialEffect.clearSharedReferences((byte) -96);
        GpuEnvironmentMapSource.clearSharedReferences(0);
        GpuQuadBuffers.clearSharedReferences((byte) 117);
        GpuVertexDeclaration.clearSharedReferences(8192);
        TextureCombineSource.clearSharedReferences((byte) 13);
        TextureCoordinateMode.clearSharedReferences((byte) -123);
        PrimitiveType.clearSharedReferences((byte) -125);
        OpenGlGpuToolkit.clearSharedReferences(771);
        OpenGlVertexBuffer.clearSharedReferences(-118);
        GrowableIntArray.clearSharedReferences(-1);
        BitmapTextLayout.clearSharedReferences(-2705);
        UiDraggableContainer.clearSharedReferences(-100);
        tda.clearSharedReferences(29914);
        FullscreenMembershipDialog.clearSharedReferences((byte) -123);
        UiViewport.clearSharedReferences(80);
        UiScrollBar.clearSharedReferences((byte) -7);
        ta.clearSharedReferences((byte) -109);
        DirectByteStorage.clearSharedReferences(-27982);
        QuickChatDynamicCommand.clearSharedReferences(41);
        StrongCacheReference.clearSharedReferences(5697);
        SoftCacheReference.clearSharedReferences(!param0 ? true : false);
        ProxySocketConnector.clearSharedReferences(true);
        MonochromeRowCache.clearSharedReferences(15325);
        SpriteTextureOperation.clearSharedReferences(-1);
        TextureSourceOperation.clearSharedReferences(65280);
        ul.clearSharedReferences(-23460);
        ConstantMonochromeTextureOperation.clearSharedReferences((byte) -85);
        ConstantColorTextureOperation.clearSharedReferences(-122);
        BricksTextureOperation.clearSharedReferences(true);
        BoxBlurTextureOperation.clearSharedReferences((byte) -72);
        CurveTextureOperation.clearSharedReferences((byte) 110);
        FlipTextureOperation.clearSharedReferences((byte) 113);
        HashNoiseTextureOperation.clearSharedReferences(262144);
        WeaveTextureOperation.clearSharedReferences(param0);
        CellularNoiseTextureOperation.clearSharedReferences((byte) 110);
        HerringboneTextureOperation.clearSharedReferences(!param0 ? true : false);
        HslAdjustTextureOperation.clearSharedReferences((byte) -117);
        TiledSpriteTextureOperation.clearSharedReferences(true);
        TileTextureOperation.clearSharedReferences(1);
        KaleidoscopeTextureOperation.clearSharedReferences(-6200);
        GrayscaleTextureOperation.clearSharedReferences((byte) -104);
        StripesTextureOperation.clearSharedReferences(-120);
        IrregularBricksTextureOperation.clearSharedReferences((byte) -118);
        RasterShapesTextureOperation.clearSharedReferences(false);
        RangeTextureOperation.clearSharedReferences(19);
        NormalMapTextureOperation.clearSharedReferences(false);
        PerlinNoiseTextureOperation.clearSharedReferences((byte) 86);
        PerlinNoiseVolumeGenerator.clearSharedReferences((byte) 78);
        EdgeMagnitudeTextureOperation.clearSharedReferences(-1210841460);
        CrossedWaveTextureOperation.clearSharedReferences((byte) -123);
        SoundFilter.clearSharedReferences();
        SecondaryNodeDequeIterator.clearSharedReferences((byte) -101);
        SoftwareTransform3D.clearSharedReferences(97);
        uva.clearSharedReferences();
        SoftwareDepthBuffer.clearSharedReferences(-16777216);
        SoftwareFaceAttachmentState.clearSharedReferences((byte) 111);
        ImageProducerRasterBuffer.clearSharedReferences((byte) -128);
        RenderResourceNode.clearSharedReferences((byte) -123);
        ComponentWordEncoder.clearSharedReferences((byte) -96);
        mb.clearSharedReferences((byte) -122);
        LegacyOpenGlShaderProgram.clearSharedReferences(8345);
        OpenGlTexture3D.clearSharedReferences((byte) 42);
        OpenGlRenderbuffer.clearSharedReferences(33);
        OpenGlPostEffect.clearSharedReferences(-95);
        LegacyOpenGlMaterialEffect.clearSharedReferences(-15081);
        LegacyOpenGlWaterTextures.clearSharedReferences(false);
        OpenGlModel.clearSharedReferences(-2);
        OpenGlFaceAttachment.clearSharedReferences(-4353);
        OpenGlNativeHeap.clearSharedReferences(-92);
        OpenGlSpriteTexture.clearSharedReferences((byte) 105);
        OpenGlPbuffer.clearSharedReferences(91);
        OpenGlDisplayLists.clearSharedReferences(-4509);
        ArbProgram.clearSharedReferences(false);
        EnvironmentMapSource.clearSharedReferences(26);
        OpenGlVertexBufferObject.clearSharedReferences(124);
        OpenGlBufferObject.clearSharedReferences(117);
        OpenGlClientVertexBuffer.clearSharedReferences(0);
        LegacyOpenGlTurbulenceEffect.clearSharedReferences((byte) -9);
        LegacyOpenGlScrollingNoiseEffect.clearSharedReferences(1);
        LegacyOpenGlUnlitEffect.clearSharedReferences((byte) 108);
        LegacyOpenGlEnvironmentReflectionEffect.clearSharedReferences(3168);
        LegacyOpenGlEnvironmentMappedWaterEffect.clearSharedReferences(true);
        LegacyOpenGlWaveWaterEffect.clearSharedReferences(13776);
        LegacyOpenGlShader.clearSharedReferences((byte) 90);
        TextureFilterMode.clearSharedReferences((byte) 88);
        GpuNativeHeap.clearSharedReferences(!param0 ? true : false);
        GpuFaceAttachmentState.clearSharedReferences(15);
        FloatGradientNoiseSliceGenerator.clearSharedReferences(-35);
        GpuSprite.clearSharedReferences(-81);
        UnlitGpuMaterialEffect.clearSharedReferences(0);
        WaterNoiseGpuMaterialEffect.clearSharedReferences((byte) 46);
        EnvironmentReflectionGpuMaterialEffect.clearSharedReferences(-18951);
        UnsupportedGpuMaterialEffect.clearSharedReferences(param0);
        RidgedNoiseVolumeGenerator.clearSharedReferences((byte) -19);
        FractalNoiseVolumeGenerator.clearSharedReferences(false);
        FloatNoiseSliceGenerator.clearSharedReferences((byte) 53);
        ArchiveIndexLoaderState.clearSharedReferences(13032);
        OpenGlGpuTexture2D.clearSharedReferences((byte) 42);
        OpenGlGpuRectangleTexture.clearSharedReferences(106);
        OpenGlGpuCubeTexture.clearSharedReferences(6);
        OpenGlGpuTexture3D.clearSharedReferences(148);
        OpenGlArbProgram.clearSharedReferences(-5709);
        OpenGlEnvironmentMappedWaterEffect.clearSharedReferences(-113);
        OpenGlVertexDeclaration.clearSharedReferences(23008);
        tb.clearSharedReferences(-75);
        pl.clearSharedReferences((byte) -109);
        PanelWidthQuery.clearSharedReferences((byte) 80);
        iob.clearSharedReferences(-5509);
        vhb.clearSharedReferences(21053);
        hla.clearSharedReferences((byte) 39);
        OpenGlGlyphMask.clearSharedReferences(20000000);
        OpenGlShader.clearSharedReferences((byte) 124);
        ToolkitRasterState.clearSharedReferences((byte) 120);
        CarouselCommongameInfoFactory.clearSharedReferences(111);
        MidiChannelLevels.clearSharedReferences((byte) -99);
        ShipFactory.clearSharedReferences((byte) 126);
        ServerInfoFactory.clearSharedReferences(-46);
        CommonArchiveId.clearSharedReferences(0);
        ThreeSliceButtonStyle.clearSharedReferences((byte) 121);
        UnderlinedLinkRenderer.clearSharedReferences((byte) -52);
        MaskedPasswordTextStyle.clearSharedReferences(17433);
        ActiveIconBorderRenderer.clearSharedReferences(118);
        AlphaContainer.clearSharedReferences(!param0 ? true : false);
        StateSpriteTextRenderer.clearSharedReferences(777);
        HighscoreTableRequest.clearSharedReferences(true);
        HighscoreValueRequest.clearSharedReferences(95);
        vu.clearSharedReferences((byte) 113);
        PendingScoreboardRequest.clearSharedReferences((byte) 119);
        ArchiveLoadRequest.clearSharedReferences((byte) -111);
        SpecialOrderButtonState.clearSharedReferences(false);
        ClientDataReadRequest.clearSharedReferences(127);
        ConsoleCommand.clearSharedReferences(true);
        ConsoleEvaluationException.clearSharedReferences(true);
        ConsoleCharacterStream.clearSharedReferences(0);
        kua.clearSharedReferences(181765988);
        GrappleLauncherBehaviourFactory.clearSharedReferences((byte) 120);
        ThrusterBehaviourFactory.clearSharedReferences((byte) 43);
        WeaponBehaviourFactory.clearSharedReferences(-30938);
        FireGrapplesOrderDefinition.clearSharedReferences(-3408);
        RecallGrapplesOrderDefinition.clearSharedReferences(102);
        ToggleShieldsOrderDefinition.clearSharedReferences(104);
        FireBoostersOrderDefinition.clearSharedReferences(34037);
        ScramblerPulseOrderDefinition.clearSharedReferences(108);
        ArmSelfDestructOrderDefinition.clearSharedReferences(false);
        SpawnEnemyShipOrderDefinition.clearSharedReferences(109);
        SaveShipDesignOrderDefinition.clearSharedReferences(110);
        BuildBlueprintOrderDefinition.clearSharedReferences(0);
        MessageFactory.clearSharedReferences(105);
        GameSnapshotFactory.clearSharedReferences(95);
        MatchResultsFactory.clearSharedReferences(-13);
        MissionActionFactory.clearSharedReferences(false);
        MissionBuilderFactory.clearSharedReferences((byte) 124);
        MissionConditionFactory.clearSharedReferences((byte) -80);
        MissionEventFactory.clearSharedReferences((byte) 21);
        MassDriverWeaponDefinition.clearSharedReferences(62);
        LaserWeaponDefinition.clearSharedReferences((byte) -125);
        TorpedoWeaponDefinition.clearSharedReferences((byte) 75);
        BombletSprayWeaponDefinition.clearSharedReferences((byte) 9);
        SpinningBladeWeaponDefinition.clearSharedReferences(8192);
        PhasedEnergyBeamWeaponDefinition.clearSharedReferences((byte) -22);
        MachineGunWeaponDefinition.clearSharedReferences(3);
        SniperCannonWeaponDefinition.clearSharedReferences(-36);
        PointDefenceLaserWeaponDefinition.clearSharedReferences(17036);
        CountermeasureLauncherWeaponDefinition.clearSharedReferences((byte) -81);
        ShipBodyFactory.clearSharedReferences((byte) -103);
        DebrisFactory.clearSharedReferences((byte) 124);
        EscapePodFactory.clearSharedReferences((byte) 80);
        NebulaFactory.clearSharedReferences((byte) -120);
        WorldFactory.clearSharedReferences(-121);
        SettingsChangeFactory.clearSharedReferences((byte) 120);
        SpawnChoiceFactory.clearSharedReferences(-109);
        SpecialOrderSubmessageFactory.clearSharedReferences(false);
        SoftwareRasterState.clearSharedReferences((byte) 44);
        SettingsInstanceFactory.clearSharedReferences(102);
        EmailAvailabilityCheck.clearSharedReferences((byte) 122);
        MovingObjectFactory.clearSharedReferences(126);
        MissionFactory.clearSharedReferences(false);
        SetVariableLabelActionFactory.clearSharedReferences(param0);
        TickConditionFactory.clearSharedReferences(false);
        CarouselSlotFactory.clearSharedReferences(92);
        MessageLogFactory.clearSharedReferences((byte) 27);
        AdjustVariableActionFactory.clearSharedReferences((byte) 27);
        AwardVictoryToTeamActionFactory.clearSharedReferences(2);
        SetVariableActionFactory.clearSharedReferences(-1);
        SetShipTeamActionFactory.clearSharedReferences(50);
        BodyDestroyedConditionFactory.clearSharedReferences(1);
        ShipTeamConditionFactory.clearSharedReferences(-18593);
        VariableConditionFactory.clearSharedReferences(50);
        ParticleFactory.clearSharedReferences(124);
        AsteroidFieldFactory.clearSharedReferences(-123);
        GrapplingHookFactory.clearSharedReferences((byte) -116);
        NebulaFieldFactory.clearSharedReferences((byte) 102);
        HardpointFactory.clearSharedReferences(8192);
        lsa.clearSharedReferences((byte) -92);
        dfa.clearSharedReferences((byte) 112);
        AccountRequestResult.clearSharedReferences(2);
        CarouselEventFactory.clearSharedReferences((byte) 43);
        DialogMessagePanel.clearSharedReferences(true);
        RemoveEventActionFactory.clearSharedReferences(-117);
        NumericLoginCredentials.clearSharedReferences((byte) 32);
        AlternateNumericLoginCredentials.clearSharedReferences(false);
        EmailLoginCredentials.clearSharedReferences((byte) 83);
        ByteIndexedRecordWriteRequest.clearSharedReferences(10);
        BlackBoxRecordingFactory.clearSharedReferences(false);
        IntegerArrayReadRequest.clearSharedReferences(true);
        ToolkitViewState.clearSharedReferences(1);
        UiVisualStyle.clearSharedReferences(24358);
        pbb.clearSharedReferences(-652030847);
        NullUiRenderer.clearSharedReferences(11227);
        UiComboBoxRenderer.clearSharedReferences((byte) 68);
        UiComboBoxList.clearSharedReferences(-102);
        CarouselSystemEventFactory.clearSharedReferences((byte) -110);
        DebugRequestFactory.clearSharedReferences(-19);
        ServerTickFactory.clearSharedReferences(true);
        CarouselPlayerEventFactory.clearSharedReferences(27167);
        PlayerJoinFactory.clearSharedReferences(-5254);
        PlayerLeaveFactory.clearSharedReferences(0);
        PlayerReadyFactory.clearSharedReferences((byte) -4);
        Lo.clearSharedReferences(301);
        SetLagVariant.clearSharedReferences(125);
        GetLagStandardDeviationIn.clearSharedReferences(true);
        GetLagStandardDeviationOut.clearSharedReferences(-2);
        LoadSettings.clearSharedReferences((byte) -100);
        LoadBlackboxRecording.clearSharedReferences(0);
        RequestNewestBlackboxRecording.clearSharedReferences(false);
        SetCarouselConstant.clearSharedReferences((byte) -105);
        GetLoadingMissions.clearSharedReferences(1);
        SetTrapMouse.clearSharedReferences(false);
        GetTabForScores.clearSharedReferences(-9028);
        SetTabForScores.clearSharedReferences(false);
        GetToggledScoreboard.clearSharedReferences(false);
        SetToggledScoreboard.clearSharedReferences((byte) 124);
        GetDebrisGroupColour.clearSharedReferences(23969);
        SetDebrisGroupColour.clearSharedReferences(7311);
        SetShipDirectionArrow.clearSharedReferences(0);
        SetShipAimLines.clearSharedReferences(-1);
        GetAllowShipSaving.clearSharedReferences(105);
        SetUseOffscreenRendering.clearSharedReferences(-2326);
        GetUseCircleFill.clearSharedReferences(2);
        SetUseCircleFill.clearSharedReferences(0);
        GetUseCircleOutline.clearSharedReferences((byte) -47);
        SetUseCircleOutline.clearSharedReferences((byte) 74);
        GetUseLines.clearSharedReferences(0);
        SetUseLines.clearSharedReferences(10);
        GetUseRectFill.clearSharedReferences(25837);
        SetUseRectFill.clearSharedReferences((byte) -5);
        GetUseTriFill.clearSharedReferences((byte) -125);
        SetUseTriFill.clearSharedReferences(100);
        GetUsePolygonFill.clearSharedReferences(9141);
        SetShowTutorial.clearSharedReferences(0);
        GetFps.clearSharedReferences(30465);
        GetRadialMenuRadius.clearSharedReferences(0);
        GetMinimapWidth.clearSharedReferences((byte) -93);
        GetMinimapHeight.clearSharedReferences((byte) 89);
        SetMinimapHeight.clearSharedReferences(param0);
        GetHealthBarWidth.clearSharedReferences(27358);
        SetHealthBarHeight.clearSharedReferences(0);
        GetReloadBarWidth.clearSharedReferences(1);
        SetReloadBarWidth.clearSharedReferences((byte) -31);
        GetReloadBarHeight.clearSharedReferences(123);
        SetReloadBarHeight.clearSharedReferences(!param0 ? true : false);
        GetSpecialOrderBarX.clearSharedReferences((byte) -115);
        SetSpecialOrderBarX.clearSharedReferences((byte) 4);
        GetSpecialOrderBoxHeight.clearSharedReferences(false);
        SetSpecialOrderBoxHeight.clearSharedReferences(0);
        GetMissionVariablesHudX.clearSharedReferences(18841);
        SetMissionVariablesHudX.clearSharedReferences(2);
        GetMissionVariablesHudY.clearSharedReferences(16224);
        GetAudioRangeCutoff.clearSharedReferences((byte) 98);
        SetAudioRangeCutoff.clearSharedReferences(param0);
        GetReverbGain.clearSharedReferences(34);
        SetReverbFeedback.clearSharedReferences(200);
        GetReverbDamp.clearSharedReferences((byte) 121);
        SetReverbDamp.clearSharedReferences((byte) -7);
        GetReverbWet.clearSharedReferences(-23714);
        SetReverbWet.clearSharedReferences((byte) 124);
        GetReverbWidth.clearSharedReferences(9839);
        GetBlueprintSaveTime.clearSharedReferences(-21447);
        SetBlueprintSaveTime.clearSharedReferences(0);
        GetMessageMaxage.clearSharedReferences((byte) -71);
        SetMessageFadetime.clearSharedReferences((byte) 32);
        GetMessageMax.clearSharedReferences(-122);
        SetMessageMax.clearSharedReferences(0);
        GetOndamageParticleSpeed.clearSharedReferences(30388);
        SetOndamageParticleSpeed.clearSharedReferences(2051507073);
        GetOndamageParticleLife.clearSharedReferences(-92);
        SetOndamageParticleLife.clearSharedReferences(-1);
        SetShieldsDirectionalHalfarcCuts.clearSharedReferences(-118);
        GetShieldsDirectionalArcParticleLife.clearSharedReferences(-23822);
        SetShieldsDirectionalArcParticleLife.clearSharedReferences(0);
        GetShieldsDirectionalArcParticleSpeedDownshift.clearSharedReferences((byte) -31);
        SetShieldsDirectionalArcParticleSpeedDownshift.clearSharedReferences(-32514);
        SetAutoAfkTimeout.clearSharedReferences(0);
        GetBuildViewAutozoomEndOnAction.clearSharedReferences(53562);
        GetNumStars.clearSharedReferences(95);
        SetNumStars.clearSharedReferences((byte) 84);
        GetUseSprites.clearSharedReferences(-91);
        SetUseBackground.clearSharedReferences(118);
        GetUseBackgroundInFullscreen.clearSharedReferences((byte) -29);
        SetUseBackgroundInFullscreen.clearSharedReferences(0);
        SetUseExtraBackground.clearSharedReferences(0);
        GetUseNiceTrails.clearSharedReferences(106);
        GetDebugLineLife.clearSharedReferences(25553);
        SetDebugLineLife.clearSharedReferences((byte) 116);
        GetUseFilledPolygons.clearSharedReferences((byte) 49);
        SetUseDetailLines.clearSharedReferences(0);
        GetBloomThresholdPercentage.clearSharedReferences(96);
        SetBloomThresholdPercentage.clearSharedReferences(false);
        GetBloomCoefficientPercentage.clearSharedReferences(256);
        SetBloomCoefficientPercentage.clearSharedReferences((byte) 107);
        GetAutozoomSpeedDivide.clearSharedReferences((byte) -15);
        SetAutozoomSpeedDivide.clearSharedReferences(101);
        GetAutozoomAmountMultiply.clearSharedReferences(-105);
        SetAutozoomAmountMultiply.clearSharedReferences(-122);
        GetNebulaProximityFadeDownshift.clearSharedReferences(param0);
        GetUseTrails.clearSharedReferences((byte) 63);
        SetUseTrails.clearSharedReferences((byte) 103);
        GetShipToShipRamDamage.clearSharedReferences(2);
        SetShipToShipRamDamage.clearSharedReferences(-128);
        GetTeamSelectionSpeedup.clearSharedReferences(3575);
        SetTeamSelectionSpeedup.clearSharedReferences((byte) -66);
        GetWaitForPlayers.clearSharedReferences((byte) 40);
        SetWaitForPlayers.clearSharedReferences((byte) -20);
        GetKeepTeamColours.clearSharedReferences(22829);
        SetKeepTeamColours.clearSharedReferences(false);
        SetDebrisCollision.clearSharedReferences((byte) -128);
        GetDebrisPartitioned.clearSharedReferences(false);
        GetDebrisCollisionDamage.clearSharedReferences((byte) -91);
        GetDebrisThrowable.clearSharedReferences((byte) -115);
        GetMissilesHitSourceTeam.clearSharedReferences((byte) 123);
        SetMissilesHitSourceTeam.clearSharedReferences(false);
        GetMissilesDamageSourceTeam.clearSharedReferences(111);
        SetMissilesDamageSourceTeam.clearSharedReferences(0);
        GetGrapplingHooksDamageableBySourcePlayer.clearSharedReferences(1);
        SetThrusterBindingMoveAndTurnHasOppositeMove.clearSharedReferences((byte) -96);
        SetNebulaFadesOutWhenClose.clearSharedReferences(2);
        GetDebrisFoundInPairs.clearSharedReferences((byte) -114);
        SetDebrisFoundInPairs.clearSharedReferences((byte) 32);
        SetFogOfWarOn.clearSharedReferences((byte) -104);
        SetUseModels.clearSharedReferences((byte) -57);
        GetInnateThrusters.clearSharedReferences(0);
        SetInnateThrusters.clearSharedReferences(21);
        SetThrusterAutobalancing.clearSharedReferences(-21968);
        SetBots.clearSharedReferences(true);
        GetDetachmentMode.clearSharedReferences(124);
        GetAutoaim.clearSharedReferences((byte) -115);
        GetSalvoaim.clearSharedReferences(87);
        SetSalvoaim.clearSharedReferences(false);
        GetFixedaim.clearSharedReferences((byte) -70);
        SetFixedaim.clearSharedReferences((byte) -49);
        GetSalvoUsesAllEnergy.clearSharedReferences(44);
        SetSalvoUsesAllEnergy.clearSharedReferences(0);
        GetSalvoHoldable.clearSharedReferences(-1721);
        SetSalvoHoldable.clearSharedReferences((byte) -127);
        GetPedrosRepairMode.clearSharedReferences((byte) -50);
        SetPedrosRepairMode.clearSharedReferences((byte) 53);
        GetShipPersistence.clearSharedReferences(33);
        SetShipPersistence.clearSharedReferences(-125);
        GetDebrisCarryOver.clearSharedReferences(68);
        SetDebrisCarryOver.clearSharedReferences(0);
        GetDebrisCarryOverPercentage.clearSharedReferences(-51);
        SetDebrisCarryOverPercentage.clearSharedReferences((byte) -119);
        SetDebrisSurvives.clearSharedReferences(0);
        SetClientSideDragging.clearSharedReferences(37);
        GetSalvoDamageMultiplier.clearSharedReferences((byte) -119);
        SetSalvoDamageMultiplier.clearSharedReferences(-126);
        SetSalvoRepairTimeMultiplier.clearSharedReferences(-1);
        GetMpSandboxEnemySpawnLimit.clearSharedReferences((byte) 32);
        SetMpSandboxEnemySpawnLimit.clearSharedReferences(-23436);
        GetMaxShipSize.clearSharedReferences(-100);
        GetFightersPerPlayerMaximum.clearSharedReferences(42);
        GetBurstFireMaxEnergy.clearSharedReferences(param0);
        SetBurstFireMaxEnergy.clearSharedReferences((byte) 7);
        SetShipSpawnInvulnerabilityTime.clearSharedReferences(46);
        GetFogOfWarSensorRange.clearSharedReferences((byte) -114);
        SetFogOfWarSensorRange.clearSharedReferences(122);
        GetThrusterBindingBalanceThreshold.clearSharedReferences((byte) 87);
        SetThrusterBindingBalanceThreshold.clearSharedReferences((byte) 76);
        GetComponentBreakingExplosionForceMultiplier.clearSharedReferences(3);
        SetPhysicsCollisionForceMultiplier.clearSharedReferences(124);
        SetPhysicsCollisionGrapplingHookForceMultiplier.clearSharedReferences((byte) 123);
        GetPhysicsCollisionPhantomForceMultiplier.clearSharedReferences(51);
        SetPhysicsCollisionPhantomForceMultiplier.clearSharedReferences(124);
        GetDebrisDetachmentForceMultiplier.clearSharedReferences(true);
        GetGrappleDebris.clearSharedReferences(54);
        SetGrappleDebris.clearSharedReferences((byte) 56);
        GetDebrisGrabbingRange.clearSharedReferences(55);
        SetDebrisGrabbingRange.clearSharedReferences((byte) 112);
        GetDebrisMax.clearSharedReferences((byte) -61);
        GetMissionVotes.clearSharedReferences((byte) -127);
        SetMissionVotes.clearSharedReferences(-78);
        GetMutatorVotes.clearSharedReferences((byte) 95);
        SetMutatorVotes.clearSharedReferences(122);
        GetMissionTimeLimit.clearSharedReferences(-75);
        SetArmageddonTimerStart.clearSharedReferences((byte) 126);
        SetArmageddonWarning.clearSharedReferences(true);
        GetArmageddonLength.clearSharedReferences((byte) 66);
        SetArmageddonLength.clearSharedReferences((byte) -41);
        GetMissionTerrainAsteroidProbability.clearSharedReferences((byte) -117);
        GetMissionTerrainDebrisProbability.clearSharedReferences(true);
        SetMissionTerrainDebrisProbability.clearSharedReferences(12124934);
        GetMissionTerrainSpaceProbability.clearSharedReferences(!param0 ? true : false);
        GetMissionTerrainVotingChancestep.clearSharedReferences(true);
        GetMissionDebrisDefaultProbability.clearSharedReferences(!param0 ? true : false);
        SetMissionDebrisDefaultProbability.clearSharedReferences(-10441);
        GetMissionDebrisVotingChancestep.clearSharedReferences(69);
        SetMissionDebrisVotingChancestep.clearSharedReferences((byte) 112);
        SetResourceNodeCaptureTime.clearSharedReferences(70);
        GetMissionResnetResourceTickTime.clearSharedReferences(-124);
        SetMassDriverRandomness.clearSharedReferences(true);
        GetLaserRandomness.clearSharedReferences(-26081);
        SetLaserRandomness.clearSharedReferences(!param0 ? true : false);
        GetBombletSprayRandomness.clearSharedReferences(-15435);
        SetBombletSprayRandomness.clearSharedReferences(-612363640);
        GetPhasedEnergyBeamRandomness.clearSharedReferences(76);
        SetPhasedEnergyBeamRandomness.clearSharedReferences(23518);
        GetSniperCannonRandomness.clearSharedReferences(-27645);
        SetSniperCannonRandomness.clearSharedReferences((byte) 42);
        GetMissileLauncherRandomness.clearSharedReferences(32);
        SetMissileLauncherRandomness.clearSharedReferences(122);
        GetPointDefenceLaserRandomness.clearSharedReferences(true);
        SetPointDefenceLaserRandomness.clearSharedReferences(6);
        GetCountermeasureLauncherRandomness.clearSharedReferences(80);
        SetCountermeasureLauncherRandomness.clearSharedReferences(1511754497);
        GetMassDriverProjectiles.clearSharedReferences(-110);
        GetLaserProjectiles.clearSharedReferences(32);
        SetLaserProjectiles.clearSharedReferences((byte) -96);
        GetBombletSprayProjectiles.clearSharedReferences(true);
        SetBombletSprayProjectiles.clearSharedReferences((byte) -27);
        SetPhasedEnergyBeamProjectiles.clearSharedReferences(-60);
        GetTorpedoProjectiles.clearSharedReferences(85);
        SetTorpedoProjectiles.clearSharedReferences(-28228);
        GetSniperCannonProjectiles.clearSharedReferences((byte) -119);
        SetSniperCannonProjectiles.clearSharedReferences((byte) -8);
        SetMissileLauncherProjectiles.clearSharedReferences(27154);
        GetPointDefenceLaserProjectiles.clearSharedReferences(0);
        SetPointDefenceLaserProjectiles.clearSharedReferences(88);
        SetCountermeasureLauncherProjectiles.clearSharedReferences(89);
        GetMassDriverProjectileLife.clearSharedReferences(21584);
        SetMassDriverProjectileLife.clearSharedReferences((byte) 127);
        SetTorpedoProjectileLife.clearSharedReferences((byte) 102);
        GetBombletSprayProjectileLife.clearSharedReferences(92);
        SetBombletSprayProjectileLife.clearSharedReferences((byte) -115);
        GetSniperCannonProjectileLife.clearSharedReferences(4);
        SetSniperCannonProjectileLife.clearSharedReferences((byte) -87);
        GetMissileLauncherProjectileLife.clearSharedReferences((byte) 127);
        SetMissileLauncherProjectileLife.clearSharedReferences(6425);
        GetCountermeasureLauncherProjectileLife.clearSharedReferences(-87);
        SetDefaultFiringLeeway.clearSharedReferences(!param0 ? true : false);
        SetSniperCannonFiringLeeway.clearSharedReferences((byte) -97);
        GetMassDriverFireForce.clearSharedReferences(127);
        SetMassDriverFireForce.clearSharedReferences((byte) 106);
        SetTorpedoFireForce.clearSharedReferences(false);
        GetBombletSprayFireForce.clearSharedReferences((byte) -91);
        GetPhasedEnergyBeamFireForce.clearSharedReferences(617169759);
        SetMachineGunFireForce.clearSharedReferences(0);
        SetSniperCannonFireForce.clearSharedReferences(-114);
        SetMissileLauncherFireForce.clearSharedReferences(-17297);
        SetPointDefenceLaserFireForce.clearSharedReferences(1600);
        SetCountermeasureLauncherFireForce.clearSharedReferences(107);
        GetMassDriverReload.clearSharedReferences(true);
        SetMassDriverReload.clearSharedReferences(-20005);
        GetTorpedoReload.clearSharedReferences(194);
        SetTorpedoReload.clearSharedReferences(109);
        GetLaserReload.clearSharedReferences((byte) 119);
        GetBombletSprayReload.clearSharedReferences(-20626);
        SetBombletSprayReload.clearSharedReferences(0);
        GetPhasedEnergyBeamReload.clearSharedReferences(-100);
        SetPhasedEnergyBeamReload.clearSharedReferences((byte) 101);
        SetMachineGunReload.clearSharedReferences((byte) -16);
        GetSniperCannonReload.clearSharedReferences(-1);
        GetFighterBayReload.clearSharedReferences(16086);
        GetPointDefenceLaserReload.clearSharedReferences(116);
        GetMassDriverAimspeed.clearSharedReferences(117);
        GetTorpedoAimspeed.clearSharedReferences((byte) 57);
        GetLaserAimspeed.clearSharedReferences(117);
        GetFighterBayAimspeed.clearSharedReferences((byte) 99);
        SetFighterBayAimspeed.clearSharedReferences((byte) 65);
        GetSpinningBladeAimspeed.clearSharedReferences((byte) -125);
        GetSniperCannonAimspeed.clearSharedReferences(100);
        GetBombletSprayAimspeed.clearSharedReferences((byte) 71);
        SetBombletSprayAimspeed.clearSharedReferences(15110);
        GetPhasedEnergyBeamAimspeed.clearSharedReferences(-29417);
        SetPhasedEnergyBeamAimspeed.clearSharedReferences(0);
        GetMachineGunAimspeed.clearSharedReferences(125);
        SetMachineGunAimspeed.clearSharedReferences((byte) -78);
        GetGrapplingHookAimspeed.clearSharedReferences(-1);
        GetMissileLauncherAimspeed.clearSharedReferences(127);
        SetMissileLauncherAimspeed.clearSharedReferences((byte) 53);
        GetPointDefenceLaserAimspeed.clearSharedReferences(-120);
        SetCountermeasureLauncherAimspeed.clearSharedReferences(-52);
        SetMassDriverAimarc.clearSharedReferences((byte) -25);
        GetTorpedoAimarc.clearSharedReferences((byte) 108);
        SetTorpedoAimarc.clearSharedReferences(63);
        GetLaserAimarc.clearSharedReferences((byte) -116);
        SetLaserAimarc.clearSharedReferences((byte) -80);
        GetFighterBayAimarc.clearSharedReferences(69);
        GetSpinningBladeAimarc.clearSharedReferences((byte) 92);
        SetSniperCannonAimarc.clearSharedReferences((byte) -99);
        GetBombletSprayAimarc.clearSharedReferences(-1);
        SetBombletSprayAimarc.clearSharedReferences((byte) -80);
        GetPhasedEnergyBeamAimarc.clearSharedReferences(16);
        GetMachineGunAimarc.clearSharedReferences(-116);
        SetMachineGunAimarc.clearSharedReferences(14675);
        SetGrapplingHookAimarc.clearSharedReferences(0);
        GetPointDefenceLaserAimarc.clearSharedReferences((byte) 21);
        SetPointDefenceLaserAimarc.clearSharedReferences((byte) 107);
        SetCountermeasureLauncherAimarc.clearSharedReferences(-92);
        GetMassDriverProjectileDamage.clearSharedReferences(!param0 ? true : false);
        SetMassDriverProjectileDamage.clearSharedReferences(9099);
        GetTorpedoProjectileDamage.clearSharedReferences(-124);
        SetTorpedoProjectileDamage.clearSharedReferences(0);
        GetLaserBeamProjectileDamage.clearSharedReferences(7848);
        GetMachineGunProjectileDamage.clearSharedReferences(0);
        SetMachineGunProjectileDamage.clearSharedReferences(146);
        SetSniperCannonProjectileDamage.clearSharedReferences((byte) 97);
        GetBombletSprayProjectileDamage.clearSharedReferences((byte) -102);
        SetBombletSprayProjectileDamage.clearSharedReferences((byte) -102);
        SetExplosionProjectileDamage.clearSharedReferences(-123);
        GetPointDefenceLaserProjectileDamage.clearSharedReferences((byte) -127);
        GetPointDefenceLaserProjectileInterceptDamage.clearSharedReferences(0);
        SetPointDefenceLaserProjectileInterceptDamage.clearSharedReferences(-982);
        GetMassDriverProjectileOndamageParticles.clearSharedReferences(-59);
        SetTorpedoProjectileOndamageParticles.clearSharedReferences(153);
        SetPhasedEnergyBeamProjectileOndamageParticles.clearSharedReferences(-2573);
        GetSniperCannonProjectileOndamageParticles.clearSharedReferences((byte) 15);
        SetSniperCannonProjectileOndamageParticles.clearSharedReferences(-17548);
        SetBombletSprayProjectileOndamageParticles.clearSharedReferences(76);
        SetPointDefenceLaserProjectileOndamageParticles.clearSharedReferences(0);
        GetMassDriverEnergyUsed.clearSharedReferences((byte) 118);
        SetMassDriverEnergyUsed.clearSharedReferences(!param0 ? true : false);
        GetLaserEnergyUsed.clearSharedReferences(0);
        SetLaserEnergyUsed.clearSharedReferences((byte) 92);
        GetBombletSprayEnergyUsed.clearSharedReferences((byte) 62);
        SetPhasedEnergyBeamEnergyUsed.clearSharedReferences(163);
        GetMachineGunEnergyUsed.clearSharedReferences(false);
        SetMachineGunEnergyUsed.clearSharedReferences(!param0 ? true : false);
        GetSniperCannonEnergyUsed.clearSharedReferences(118);
        SetSniperCannonEnergyUsed.clearSharedReferences((byte) -113);
        GetMissileLauncherEnergyUsed.clearSharedReferences(-10515);
        SetMissileLauncherEnergyUsed.clearSharedReferences(-17);
        GetCountermeasureLauncherEnergyUsed.clearSharedReferences(false);
        SetCountermeasureLauncherEnergyUsed.clearSharedReferences((byte) 28);
        GetPointDefenceLaserEnergyUsed.clearSharedReferences(12992);
        SetPointDefenceLaserEnergyUsed.clearSharedReferences((byte) -99);
        GetTorpedoAcceleration.clearSharedReferences(0);
        SetTorpedoAcceleration.clearSharedReferences(169);
        SetVelocitySustain.clearSharedReferences(-107);
        GetAngularVelocitySustain.clearSharedReferences((byte) 83);
        SetAngularVelocitySustain.clearSharedReferences(-25544);
        GetThrusterParticleSpeedDownshift.clearSharedReferences(176);
        SetThrusterParticleSpeedDownshift.clearSharedReferences((byte) 84);
        GetThrusterParticleLife.clearSharedReferences(177);
        SetThrusterParticleLife.clearSharedReferences(127);
        GetAngularForceDownshift.clearSharedReferences(64);
        SetAngularForceDownshift.clearSharedReferences((byte) -118);
        GetAngularVelocitySustainMax.clearSharedReferences(0);
        GetTorqueDownshift.clearSharedReferences(2);
        GetMomentOfInertiaPredivideDownshift.clearSharedReferences((byte) 126);
        SetMomentOfInertiaPredivideDownshift.clearSharedReferences((byte) 69);
        GetMomentOfInertiaPerpointCalcDownshift.clearSharedReferences(0);
        SetMomentOfInertiaPerpointCalcDownshift.clearSharedReferences(113);
        GetSpinningBladeTopSpeed.clearSharedReferences(-120);
        SetSpinningBladeTopSpeed.clearSharedReferences(-19013);
        SetSpinningBladeSpinupSpeed.clearSharedReferences(21942);
        GetSpinningBladeSpindamageMultiplier.clearSharedReferences(false);
        SetSpinningBladeSpindamageMultiplier.clearSharedReferences((byte) -122);
        GetPhasedEnergyBeamPulsetime.clearSharedReferences((byte) 51);
        SetPhasedEnergyBeamPulsetime.clearSharedReferences((byte) -71);
        GetPhasedEnergyBeamPulseFadetime.clearSharedReferences((byte) 65);
        GetMachineGunPulsetime.clearSharedReferences((byte) -28);
        SetMachineGunPulsetime.clearSharedReferences(-105);
        GetBombletSprayPushMultiplier.clearSharedReferences(-122);
        SetBombletSprayPushMultiplier.clearSharedReferences(0);
        GetExplosionPushMultiplier.clearSharedReferences(80);
        SetExplosionPushMultiplier.clearSharedReferences((byte) -89);
        GetAiFiringRangeUpshift.clearSharedReferences((byte) -118);
        SetAiFiringRangeUpshift.clearSharedReferences(26468);
        GetWorldWidthUpshift.clearSharedReferences(193);
        GetWeaponParticleSpeedDownshift.clearSharedReferences(-33);
        SetWeaponParticleSpeedDownshift.clearSharedReferences(7069);
        GetWeaponProjectileSpeedMultiply.clearSharedReferences((byte) -125);
        SetWeaponProjectileSpeedMultiply.clearSharedReferences(0);
        SetRespawnTime.clearSharedReferences(67);
        SetGrapplingHookMaxLength.clearSharedReferences((byte) -52);
        GetGrapplingHookFireForce.clearSharedReferences(0);
        SetGrapplingHookFireForce.clearSharedReferences((byte) 57);
        GetGrapplingHookSpringConstant.clearSharedReferences(true);
        SetGrapplingHookSpringConstant.clearSharedReferences(200);
        SetGrapplingHookMaxExtension8Force.clearSharedReferences(17231);
        GetGrapplingHookCooldown.clearSharedReferences(-120);
        SetGrapplingHookCooldown.clearSharedReferences((byte) -63);
        GetGrapplingHookRopeChangeRate.clearSharedReferences(-14010);
        GetGrapplingHookRopeBreakLength.clearSharedReferences(204);
        SetGrapplingHookRopeBreakLength.clearSharedReferences(235);
        GetMissilesCooldown.clearSharedReferences(124);
        GetMissilesExplosionPower.clearSharedReferences(3);
        SetMissilesExplosionPower.clearSharedReferences(0);
        SetMissilesAcceleration.clearSharedReferences(207);
        SetMissilesTopSpeed.clearSharedReferences((byte) -90);
        GetShieldsToggleCooldown.clearSharedReferences((byte) 123);
        SetShieldsDirectionalIdleEnergyUsage.clearSharedReferences((byte) 0);
        GetShieldsDirectionalArc.clearSharedReferences(-29044);
        SetShieldsDirectionalArc.clearSharedReferences((byte) 121);
        GetShieldsDamageEnergyConversion.clearSharedReferences((byte) -101);
        SetShieldsDamageEnergyConversion.clearSharedReferences(-126);
        GetRepairModeCooldown.clearSharedReferences((byte) 91);
        GetRepairModeActiveTime.clearSharedReferences(215);
        GetRepairModeRadius.clearSharedReferences(-99);
        SetRepairModeRadius.clearSharedReferences(-105);
        GetRepairModePower.clearSharedReferences(false);
        SetRepairModePower.clearSharedReferences((byte) -33);
        GetBoostersCooldown.clearSharedReferences((byte) -121);
        GetBoostersActiveTime.clearSharedReferences((byte) 84);
        SetCountermeasuresPulsetime.clearSharedReferences(-123);
        GetCountermeasuresCooldown.clearSharedReferences(221);
        SetCountermeasuresCooldown.clearSharedReferences(0);
        GetCountermeasuresPulseRadius.clearSharedReferences(16407);
        SetCountermeasuresPulseRadius.clearSharedReferences(-27266);
        GetSelfDestructTimer.clearSharedReferences(225);
        SetSelfDestructTimer.clearSharedReferences(-26016);
        GetPlayerRepairTime.clearSharedReferences(8);
        SetPlayerRepairTime.clearSharedReferences(14055);
        GetPlayerRepairAmount.clearSharedReferences(103);
        SetPlayerRepairAmount.clearSharedReferences(-128);
        GetAiRepairTime.clearSharedReferences(46);
        SetFighterRepairTime.clearSharedReferences(0);
        GetFighterRepairAmount.clearSharedReferences((byte) -106);
        SetFighterRepairAmount.clearSharedReferences((byte) -15);
        GetReadyRoomMissionTime.clearSharedReferences(232);
        GetReadyRoomMutatorTime.clearSharedReferences((byte) 49);
        SetReadyRoomMutatorTime.clearSharedReferences(233);
        GetReadyRoomTeamTime.clearSharedReferences((byte) 91);
        PlayerVoteFactory.clearSharedReferences(true);
        ComponentBehaviourFactory.clearSharedReferences(75);
        MissionGenerationDataFactory.clearSharedReferences(540800);
        TargetLockFactory.clearSharedReferences(-104);
        PartitionZoneListFactory.clearSharedReferences(-1);
        RoundResultFactory.clearSharedReferences(-1);
        TeamShipComponentConditionFactory.clearSharedReferences((byte) 67);
        UsernameAvailabilityValidator.clearSharedReferences(6312);
        PasswordValidator.clearSharedReferences((byte) 126);
        EmailSyntaxValidator.clearSharedReferences(2);
        AgeValidator.clearSharedReferences(68);
        MatchingFieldValidator.clearSharedReferences(1);
        ContentTransitionPhase.clearSharedReferences((byte) 94);
        TextHotspotRegion.clearSharedReferences((byte) -63);
        DebouncedInputValidator.clearSharedReferences(123);
        GpuFractalNoiseVolume.clearSharedReferences(2);
        GpuVertexBufferOwner.clearSharedReferences(-17471);
        GpuIndexBufferOwner.clearSharedReferences(-1);
        GpuFaceNormal.clearSharedReferences(84);
        AdminMessageFactory.clearSharedReferences(-115);
        CachedByteArray.clearSharedReferences(false);
        TextureRasterShape.clearSharedReferences(28378);
        TextureLineShape.clearSharedReferences(30826);
        TextureBezierShape.clearSharedReferences((byte) -127);
        TextureRectangleShape.clearSharedReferences((byte) 89);
        lkb.clearSharedReferences(199);
        OpenGlVertexNormal.clearSharedReferences(2);
        GameJoinNotificationText.clearSharedReferences(false);
        this.cachedFrame = null;
        this.host = null;
    }

    private final boolean finishResourceLoading(byte param0) {
        int var2 = 0;
        int var3 = field_G;
        int var2Lifetime1;
        AppletRasterBuffer.field_a = this;
        if (!TextureLineShape.field_i.unpackResources((byte) 68)) {
          return false;
        }
        ComponentCollision.a("Initing menus", (byte) -62);
        ConvoyObjectiveText.checkObfuscationGuard((byte) -111);
        for (var2 = 0; var2 < 10; var2++) {
          lo.field_a[var2] = new GameMenuScreen(var2);
        }
        AgeValidator.field_f = 0;
        GetArmageddonTimerStart.field_o = 0;
        GpuFaceAttachmentState.setTicksPerSecond(-106, 50);
        ComponentCollision.a("Playing music", (byte) -101);
        ConsoleSettingsScript.playLoopingMusicTrack(CachedByteArray.musicTracks[0], (byte) -114);
        if (param0 <= 124) {
          Object var4 = (Object) null;
          VoidHunters.checkDuplicateReference(true, (Object) null);
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 16; var2Lifetime1++) {
          GetThrusterParticleLife.field_o.setChannelGain(0, (byte) 18, var2Lifetime1);
        }
        AgeValidator.configureReverb(SetMissileLauncherEnergyUsed.field_p, GetMissileLauncherProjectiles.field_o, MapClearanceRectangleFactory.field_a, -131, ComponentAttachmentPlan.field_b, LoopingSound.field_n, CommonGameState.field_i);
        ComponentCollision.a("Initing audiohandler", (byte) -64);
        HighscoreTableRequest.initializeSoundQueues((byte) 89);
        MidiNote.resetFrameTiming(2096);
        ComponentCollision.a("Finished loadloop", (byte) -128);
        if (this.isTutorialEnabled(0) &&
          GetPhasedEnergyBeamPulsetime.isGuestMode((byte) 116)) {
          WaterNoiseGpuMaterialEffect.startOfflineGame(true, false);
        }
        return true;
    }

    final void shutdownGame(int param0) {
        GetBurstFireRegenerationRate.b(false);
        if (null != psb.field_b) {
          VariableCondition.b((byte) 86);
        }
        SecondaryNodeDequeIterator.a(1);
        if (param0 >= -102) {
          VoidHunters.getTeamName(63, 91);
        }
    }

    private final void updateClientStateAndInput(boolean param0, int param1) {
        int fieldTemp$0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_32_0 = 0;
        GameSession stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        boolean stackIn_44_2 = false;
        boolean stackIn_48_0 = false;
        int stackIn_59_0 = 0;
        IsaacPacketBuffer stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        int stackIn_119_2 = 0;
        boolean stackIn_133_0 = false;
        int stackIn_200_0 = 0;
        boolean stackOut_47_0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int[] var11;
        int[] var12;
        int var7Lifetime1;
        int var8Lifetime1;
        int stackIn_59_0Lifetime1;
        boolean stackIn_133_0Lifetime1;
        int var7Lifetime2;
        var10 = field_G;
        if (DeveloperAccess.hasDeveloperAccess(2)) {
          AgeValidator.configureReverb(SetMissileLauncherEnergyUsed.field_p, GetMissileLauncherProjectiles.field_o, MapClearanceRectangleFactory.field_a, -131, ComponentAttachmentPlan.field_b, LoopingSound.field_n, CommonGameState.field_i);
          if (SetMachineGunEnergyUsed.field_o[81] &&
            SetMachineGunEnergyUsed.field_o[102]) {
            SetInnateThrusters.a(0, new int[]{4});
          }
        }
        if (GetBuildViewAutozoomEndOnAction.a(61848) &&
          GetArmageddonTimerStart.field_o == 0 &&
          0 == AgeValidator.field_f) {
          GetDebrisThrowable.a(false, "Cookie ship found, so starting game");
          stackIn_10_0 = (ModelFaceAttachment.a(false)) ? 7 : 0;
          GetNebulaFadesOutWhenClose.a(stackIn_10_0, false, (byte) -85, -3);
        }
        if (ClassNameFormatter.field_b != ClassNameFormatter.field_a) {
          if (~ClassNameFormatter.field_a == ~SetBombletSprayEnergyUsed.field_o) {
            ScreenTransitionFade.progress = ScreenTransitionFade.progress + 1;
            if (16 == ScreenTransitionFade.progress) {
              if (!KaleidoscopeTextureOperation.field_i) {
                NodeHashTable.transitionGuestClientState(0);
              } else {
                ValidationStatusIcon.transitionGuestClientState(0);
              }
              ClassNameFormatter.field_a = QuickChatMenuWidget.field_wb;
            }
          } else {
            if (QuickChatMenuWidget.field_wb == ClassNameFormatter.field_a) {
              if (!GetPhasedEnergyBeamPulsetime.isGuestMode((byte) 102)) {
                SetMissionTerrainSpaceProbability.setMessageBoxOpen(false);
                AgeValidator.field_f = Transform3D.field_a;
                if (KaleidoscopeTextureOperation.field_i) {
                  AwardVictoryToTeamAction.a(-356, false);
                }
                if (kua.field_e) {
                  GetNebulaFadesOutWhenClose.a(AgeValidator.field_f, false, (byte) -85, -4);
                }
                if (BodyInZoneConditionFactory.a(false, AgeValidator.field_f)) {
                  ColorKeyScaleTextureOperation.d(991426348);
                }
              }
              ClassNameFormatter.field_a = SetShieldsDirectionalIdleEnergyUsage.field_p;
            } else {
              ScreenTransitionFade.progress = ScreenTransitionFade.progress - 1;
              if (ScreenTransitionFade.progress == 0) {
                ClassNameFormatter.field_a = ClassNameFormatter.field_b;
              }
            }
          }
        } else {
          var3 = 0;
          var4 = 0;
          if (DialogMessagePanel.field_C != null) {
            DialogMessagePanel.field_C.update(true, (byte) 77);
          }
          if (null != DialogMessagePanel.field_C &&
            DialogMessagePanel.field_C.isOpen(13462)) {
            stackIn_18_0 = 1;
          } else {
            stackIn_18_0 = 0;
          }
          boolean decompiledFrameRemainder0 = true;
          var5 = stackIn_18_0;
          if (SetNebulaProximityFadeDownshift.field_o &&
            null != MatchingFieldValidator.field_g &&
            GetArmageddonTimerStart.field_o == -1 &&
            AgeValidator.field_f == GetArmageddonTimerStart.field_o &&
            var5 == 0 && ((psb.field_b != null ||
            SetReverbDamp.field_o) &&
            (!MatchingFieldValidator.field_g.networked ||
            !GetSniperCannonProjectiles.chatVisible &&
            !SetFightersPerPlayerMaximum.field_p))) {
            stackIn_32_0 = 1;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_32_0 = 0;
          }
          var6 = stackIn_32_0;
          SetReadyRoomMissionTime.a(true, var6 != 0, GetBombletSprayEnergyUsed.field_p.width, GetBombletSprayEnergyUsed.field_p.height);
          if (!param0) {
            if (~AgeValidator.field_f != ~GetArmageddonTimerStart.field_o) {
              SetVariableAction.field_b = SetVariableAction.field_b + 1;
              if (32 == SetVariableAction.field_b) {
                ColorKeyScaleTextureOperation.d(991426348);
              }
            } else {
              if (GetArmageddonTimerStart.field_o != -1) {
                if (GetArmageddonTimerStart.field_o == -2) {
                  var3 = 1;
                } else {
                  if (BodyInZoneConditionFactory.a(false, GetArmageddonTimerStart.field_o)) {
                    lo.field_a[GetArmageddonTimerStart.field_o].update(0);
                  }
                }
              } else {
                if (GraphicsPresentException.field_a) {
                  var3 = 1;
                  var4 = 1;
                }
                if (!GraphicsPresentException.field_a ||
                  null != MatchingFieldValidator.field_g &&
                  !MatchingFieldValidator.field_g.networked) {
                  stackIn_43_0 = MatchingFieldValidator.field_g;
                  stackIn_43_1 = 81;
                  stackIn_44_2 = (var5 == 0);
                  ((GameSession) (Object) stackIn_43_0).updateSession((byte) stackIn_43_1, stackIn_44_2);
                  if (!GraphicsPresentException.field_a) {
                    while (UiAngleDial.pollKeyEvent(127)) {
                      stackOut_47_0 = GetSpinningBladeAimspeed.a(-22029);
                      stackIn_59_0 = stackOut_47_0 ? 1 : 0;
                      stackIn_48_0 = stackOut_47_0;
                      if (stackIn_48_0) {
                        continue;
                      }
                      MatchingFieldValidator.field_g.handleMenuHotkeys((byte) 121);
                    }
                  }
                }
              }
            }
          }
          stackIn_59_0Lifetime1 = 17043;
          GpuVertexBufferOwner.updateSoundQueues(stackIn_59_0Lifetime1);
          if (null != SniperCannonWeaponDefinition.menuBackgroundBattle) {
            SniperCannonWeaponDefinition.menuBackgroundBattle.update(0);
          }
          if (null != DialogMessagePanel.field_C &&
            DialogMessagePanel.field_C.isOpen(13462)) {
            var3 = 0;
            var4 = 0;
          }
          if (FlipTextureOperation.field_l.isReceivingGameState(-28208) ||
            !GetThrusterSmallForce.field_o &&
            !SetMissionTerrainDebrisProbability.field_p &&
            SetSpinningBladeSpindamageMultiplier.field_o != null &&
            SetSpinningBladeSpindamageMultiplier.field_o.field_fc) {
            var3 = 0;
            var4 = 0;
          }
          if (GraphicsPresentException.field_a &&
            !HardpointMatch.field_d &&
            !SetMassDriverFireForce.field_o) {
            if (GetThrusterSmallForce.field_o &&
              SetFightersPerPlayerMaximum.field_p) {
              var3 = 0;
            }
            GetShieldsDirectionalRadius.a((byte) 21, var3 != 0);
            if (SetMissionTerrainDebrisProbability.field_p) {
              ProxyAuthenticationException.field_a.updateSession((byte) 98, var4 != 0);
            }
            if (GetThrusterSmallForce.field_o) {
              if (MatchingFieldValidator.field_g == null) {
                GetThrusterSmallForce.field_o = false;
              } else {
                var7 = (-SoftwareRasterizer2D.width + GetBombletSprayEnergyUsed.field_p.width) / 2;
                var8 = (-SoftwareRasterizer2D.height + GetBombletSprayEnergyUsed.field_p.height) / 2;
                GetBombletSprayReload.a(-119, var8, var7);
                GetMutatorVotes.a(SetBombletSprayProjectileOndamageParticles.e((byte) 93), var4 != 0, SetThrusterForce.a(-99), 123);
                BodyDestroyedCondition.b(-1);
                if (MatchingFieldValidator.field_g.networked) {
                  MatchingFieldValidator.field_g.updateSession((byte) 89, var4 != 0);
                }
              }
            }
            var7Lifetime2 = 0;
            while (UiAngleDial.pollKeyEvent(127)) {
              if (GetSpinningBladeAimspeed.a(-22029)) {
                continue;
              }
              stackIn_133_0 = GetThrusterSmallForce.field_o;
              if (stackIn_133_0 &&
                SetBombletSprayProjectileDamage.field_o != 9 &&
                SetBombletSprayProjectileDamage.field_o != 10 &&
                SetBombletSprayProjectileDamage.field_o != 11) {
                if (!SetFightersPerPlayerMaximum.field_p) {
                  GpuSprite.field_e = false;
                }
                if (!SetFightersPerPlayerMaximum.field_p) {
                  if (!TiledSpriteTextureOperation.field_r) {
                    if (GetHealthBarWidth.field_q == SetBombletSprayProjectileDamage.field_o) {
                      var7Lifetime2 = 1;
                      GpuSprite.field_e = false;
                      SetFightersPerPlayerMaximum.field_p = true;
                      continue;
                    }
                    if (~GetGrappleDebris.field_p == ~SetBombletSprayProjectileDamage.field_o) {
                      SetFightersPerPlayerMaximum.field_p = true;
                      GpuSprite.field_e = true;
                      var7Lifetime2 = 1;
                      continue;
                    }
                  } else {
                    if (SetBombletSprayProjectileDamage.field_o == vu.field_Db) {
                      GpuSprite.field_e = false;
                      SetFightersPerPlayerMaximum.field_p = true;
                      var7Lifetime2 = 1;
                      continue;
                    }
                    if (GetBombletSprayProjectiles.field_p == SetBombletSprayProjectileDamage.field_o) {
                      var7Lifetime2 = 1;
                      GpuSprite.field_e = true;
                      SetFightersPerPlayerMaximum.field_p = true;
                      continue;
                    }
                  }
                }
                if (var7Lifetime2 != 0) {
                  RequestNewestBlackboxRecording.field_p.writeIsaacByte(24335, 69);
                  stackIn_118_0 = RequestNewestBlackboxRecording.field_p;
                  stackIn_118_1 = 0;
                  if (GpuSprite.field_e) {
                    stackIn_119_2 = 1;
                  } else {
                    stackIn_119_2 = 0;
                  }
                  ((IsaacPacketBuffer) (Object) stackIn_118_0).writeByte(stackIn_118_1, stackIn_119_2);
                }
                if (var7Lifetime2 == 0 && (SetBombletSprayProjectileDamage.field_o != 80 ||
                  SetFightersPerPlayerMaximum.field_p) && SetMassDriverEnergyUsed.a(13, 15, 12, (byte) 23)) {
                  continue;
                }
              } else {
                if (GetSniperCannonProjectiles.chatVisible &&
                  BricksTextureOperation.b(12, -2048, 13, 15)) {
                  continue;
                }
              }
              if (SetMissionTerrainDebrisProbability.field_p) {
                ProxyAuthenticationException.field_a.handleMenuHotkeys((byte) -111);
              }
              if (!GetThrusterSmallForce.field_o) {
                continue;
              }
              MatchingFieldValidator.field_g.handleMenuHotkeys((byte) -16);
            }
          }
          stackIn_133_0Lifetime1 = GraphicsPresentException.field_a;
          if (!stackIn_133_0Lifetime1) {
            VoidHunters.updatePanelAnimations(-29130);
          }
          if (GetSniperCannonProjectiles.chatVisible) {
            if (GetRepairModePower.field_o > SecondaryNodeQueue.field_b) {
              SecondaryNodeQueue.field_b = SecondaryNodeQueue.field_b + 1;
            }
          } else {
            if (0 < SecondaryNodeQueue.field_b) {
              SecondaryNodeQueue.field_b = SecondaryNodeQueue.field_b - 1;
            }
          }
          var7Lifetime1 = GetRepairModePower.field_o * GetRepairModePower.field_o;
          var8Lifetime1 = -(SecondaryNodeQueue.field_b * SecondaryNodeQueue.field_b) + var7Lifetime1;
          var9 = 120 * var8Lifetime1 / var7Lifetime1 + OpenGlRenderbuffer.field_v;
          GetDebrisProjectileCollision.a(0, var9);
          if (PlayerVote.field_c.first(0) != null) {
            fieldTemp$0 = MatchResultsFactory.field_b + 1;
            MatchResultsFactory.field_b = MatchResultsFactory.field_b + 1;
            if (fieldTemp$0 == 335) {
              MatchResultsFactory.field_b = 0;
              PlayerVote.field_c.removeFirst(true);
            }
          }
        }
        if (AgeValidator.field_f == -3) {
          WaterNoiseGpuMaterialEffect.startOfflineGame(false, false);
        }
        if (-4 == AgeValidator.field_f) {
          RequestNewestBlackboxRecording.field_p.writeIsaacByte(24335, 9);
          AgeValidator.field_f = GetArmageddonTimerStart.field_o;
          HardpointMatch.field_d = true;
          SecondaryNodeQueue.field_b = GetRepairModePower.field_o;
        }
        if (-5 == AgeValidator.field_f) {
          sh.a(SetSpinningBladeSpindamageMultiplier.field_o.getGameId((byte) -13), -1, 11);
          SetMassDriverFireForce.field_o = true;
          AgeValidator.field_f = GetArmageddonTimerStart.field_o;
        }
        if (param1 >= -117) {
          this.musicStingCooldown = -120;
        }
        if (SocketNetworkArchiveClient.field_n > 0) {
          SocketNetworkArchiveClient.field_n = SocketNetworkArchiveClient.field_n - 1;
        }
        this.updateMusicSelection((byte) -127);
        if (DeveloperAccess.hasDeveloperAccess(2) &&
          SetMachineGunEnergyUsed.field_o[1]) {
          OpenGlTexture1D.field_i = true;
        } else {
          if (DeveloperAccess.hasDeveloperAccess(2) &&
            SetMachineGunEnergyUsed.field_o[2]) {
            OpenGlTexture1D.field_i = false;
          }
        }
        if (DeveloperAccess.hasDeveloperAccess(2) &&
          SetMachineGunEnergyUsed.field_o[3]) {
          GetDebrisThrowable.a(false, "Selecting opengl toolkit...");
          var11 = new int[]{1};
          DateOfBirthInput.field_x.setBackendOptions(false, GetFighterRepairAmount.createBackendOptions(var11, 2));
          GetDebrisThrowable.a(false, "Done");
        }
        if (DeveloperAccess.hasDeveloperAccess(2) &&
          SetMachineGunEnergyUsed.field_o[4]) {
          GetDebrisThrowable.a(false, "Selecting java toolkit...");
          var12 = new int[]{0};
          DateOfBirthInput.field_x.setBackendOptions(false, GetFighterRepairAmount.createBackendOptions(var12, 2));
          GetDebrisThrowable.a(false, "Done");
        }
        if (DeveloperAccess.hasDeveloperAccess(2) &&
          SetMachineGunEnergyUsed.field_o[55] &&
          SetMachineGunEnergyUsed.field_o[82]) {
          BodyInZoneCondition.field_c = "This is a forced error, you pressed some crazy button combo";
          stackIn_200_0 = (!ModelFaceAttachment.a(false)) ? 0 : 7;
          GetNebulaFadesOutWhenClose.a(stackIn_200_0, false, (byte) -85, 6);
        }
    }

    private final void drawCachedCenteredFrame(int param0, int param1, int param2) {
        int var4;
        int var5;
        if (0 >= param2) {
          return;
        }
        if (param1 > 0 &&
          GetDebrisGroupColour.field_r != null) {
          var4 = (GetBombletSprayEnergyUsed.field_p.width - param2) / 2;
          var5 = (GetBombletSprayEnergyUsed.field_p.height - param1) / 2;
          if (null == this.cachedFrame ||
            ~param2 != ~this.cachedFrame.width ||
            ~this.cachedFrame.height != ~param1) {
            this.cachedFrame = new Sprite(0, 0);
            this.cachedFrame.width = param2;
            this.cachedFrame.paddedWidth = param2;
            this.cachedFrame.height = param1;
            this.cachedFrame.paddedHeight = param1;
            this.cachedFrame.pixels = GetDebrisGroupColour.field_r.readPixels(var4, var5, this.cachedFrame.width, this.cachedFrame.height);
          }
          this.cachedFrame.drawOpaque(SoftwareRasterizer2D.width / 2 - param2 / param0, SoftwareRasterizer2D.height / 2 - param1 / 2 - 1);
          return;
        }
    }

    final static String getTeamName(int param0, int param1) {
        if (param0 >= 0 &&
          !(GpuVertexBufferOwner.teamNames.length <= param0)) {
          return GpuVertexBufferOwner.teamNames[param0];
        }
        if (param1 != -1) {
          return (String) null;
        }
        return GpuVertexBufferOwner.teamNames[GpuVertexBufferOwner.teamNames.length - 1];
    }

    final void renderGameFrame(int param0) {
        try {
          int stackIn_81_0 = 0;
          boolean stackIn_82_1 = false;
          Throwable decompiledCaughtException = null;
          int var3_int = 0;
          IntegerNode var3 = null;
          int var4_int = 0;
          GraphicsPresentException var4 = null;
          int var5_int = 0;
          String var5 = null;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          ToolkitRasterStateStack var8_ref_kla = null;
          int var9 = 0;
          java.awt.Canvas var10 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          int var5_intLifetime3;
          int var6Lifetime1;
          int var6Lifetime2;
          int var7Lifetime1;
          int var7Lifetime2;
          int var8Lifetime1;
          int var6Lifetime1Lifetime1;
          int var7Lifetime1Lifetime1;
          var9 = field_G;
          GetBombletSprayEnergyUsed.field_p = SetThrusterBindingMoveAndTurnHasOppositeMove.e((byte) 102).getSize();
          RoundResult.field_e = false;
          var10 = SetThrusterBindingMoveAndTurnHasOppositeMove.e((byte) 101);
          if (null != DateOfBirthInput.field_x) {
            if (DebugRequestFactory.field_b != var10) {
              GetDebrisThrowable.a(false, "Canvas=" + var10 + " hashcode=" + var10.hashCode());
              DebugRequestFactory.field_b = var10;
            }
            if (DateOfBirthInput.field_x.updateForCanvas((byte) -128, var10) ||
              null != DateOfBirthInput.field_x.context &&
              DateOfBirthInput.field_x.context.toolkit != GetDebrisGroupColour.field_r) {
              GetSpinningBladeSpindamageMultiplier.a(-9934);
            }
          }
          if (GetUseTriFill.a(77)) {
            BuildBlueprintOrderDefinition.drawGameFrame(111, var10, SetMassDriverProjectileLife.a(0));
            return;
          }
          if (!LegacyOpenGlEnvironmentReflectionEffect.field_e) {
            GetPhasedEnergyBeamAimspeed.a(var10, true);
            return;
          }
          if (!Mission.b(-1)) {
            IncrementVariableAction.a(lwa.field_vb, -1, 100.0f);
            GetPhasedEnergyBeamAimspeed.a(var10, true);
            return;
          }
          if (OpenGlTexture1D.field_i) {
            GetDebrisGroupColour.field_r.updateFrame((int)(-GetSalvoaim.field_q + MonotonicMillisClock.currentTimeMillis(false)));
            if (ul.field_a == 1) {
              if (!GetDebrisGroupColour.field_r.isBloomEnabled()) {
                GetDebrisGroupColour.field_r.enableBloom();
              }
              GetDebrisGroupColour.field_r.setBloomParameters((float)CachedByteArray.field_m / 100.0f, 1.0f, (float)OpenGlVertexBufferObject.field_i / 100.0f);
            }
            GetDebrisGroupColour.field_r.clearColor(0);
            GetDebrisGroupColour.field_r.clearDepth();
          }
          SoftwareRasterizer2D.clear();
          if (~AgeValidator.field_f != ~GetArmageddonTimerStart.field_o) {
            if (SetVariableAction.field_b < 16) {
              UiStatefulStyle.a((byte) 88, SetShipTeamAction.field_f, false, GetArmageddonTimerStart.field_o);
            } else {
              UiStatefulStyle.a((byte) 88, GetMessageFadetime.field_o, false, AgeValidator.field_f);
            }
          } else {
            UiStatefulStyle.a((byte) 88, SetShipTeamAction.field_f, true, GetArmageddonTimerStart.field_o);
          }
          if (!SetShipTeamAction.field_f ||
            !GetMessageFadetime.field_o) {
            var3_int = (-SoftwareRasterizer2D.width + GetBombletSprayEnergyUsed.field_p.width) / 2;
            var4_int = (-SoftwareRasterizer2D.height + GetBombletSprayEnergyUsed.field_p.height) / 2;
            GetBombletSprayReload.a(-89, var4_int, var3_int);
            SpawnPointFactory.a(SetSalvoDamageMultiplier.e(83), true);
            BodyDestroyedCondition.b(-1);
          }
          var3 = (IntegerNode) (PlayerVote.field_c.first(0));
          if (var3 != null) {
            var5_int = MatchResultsFactory.field_b;
            if (var5_int < 80) {
              var4_int = -32 + var5_int / 2;
            } else {
              if (var5_int < 230) {
                var4_int = 8;
              } else {
                var4_int = -(var5_int / 2) + 123;
              }
            }
            lo.field_c[var3.value].drawScaled(8, var4_int, 32, 32);
          }
          if (param0 >= -79) {
            return;
          }
          if (DialogMessagePanel.field_C != null) {
            DialogMessagePanel.field_C.draw((byte) 95);
            if (DialogMessagePanel.field_C.isOpen(13462)) {
              RoundResult.field_e = true;
            }
          }
          if (SetReloadBarWidth.isCachedFrameAvailable((byte) -113)) {
            var4_int = (-SoftwareRasterizer2D.width + GetBombletSprayEnergyUsed.field_p.width) / 2;
            var5_intLifetime1 = (GetBombletSprayEnergyUsed.field_p.height - SoftwareRasterizer2D.height) / 2;
            if (OpenGlTexture1D.field_i) {
              GetDebrisGroupColour.field_r.clearColor(-16777216);
            }
            SetMassDriverProjectileDamage.a(var4_int, var5_intLifetime1, 143);
            ScreenSizeController.drawCachedFrame(false, 20637);
            RoundResult.field_e = true;
          }
          if (QuickChatMenuWidget.l(0)) {
            var4_int = (-SoftwareRasterizer2D.width + GetBombletSprayEnergyUsed.field_p.width) / 2;
            var5_intLifetime2 = (-SoftwareRasterizer2D.height + GetBombletSprayEnergyUsed.field_p.height) / 2;
            GetPhasedEnergyBeamFireForce.a(var4_int, 32, var5_intLifetime2);
            if (!RoundResult.field_e) {
              this.drawCachedCenteredFrame(2, 20 + PanelHeightQuery.getMaximumPanelHeight(true), PanelWidthQuery.getMaximumPanelWidth(-119));
            }
            PerlinNoiseTextureOperation.a(false, (byte) 71);
            RoundResult.field_e = true;
          } else {
            if (SoftwareFaceAttachment.isMessageBoxOpen(false)) {
              IntrusiveNode.a((Sprite[]) null, 8, 0, (Sprite[]) null, (Sprite[]) null, 8555923, 0, 15658751, 15658751, SetMpSandboxEnemySpawnLimit.field_p, SoftwareRasterizer2D.height / 2, 0, 0, -14109, SoftwareRasterizer2D.width / 2);
              var4_int = 16;
              var5_intLifetime2 = var4_int + SetUseNiceTrails.a(0);
              var6 = var4_int + SetShieldsDirectionalArc.a(-22954);
              var7 = GetBombletSprayEnergyUsed.field_p.width / 2 - var5_intLifetime2 / 2;
              var8 = -(var6 / 2) + GetBombletSprayEnergyUsed.field_p.height / 2;
              BlackBoxRecording.drawPanelBackground((byte) -115, 255, var6, var7, var8 - 1, var5_intLifetime2);
              if (this.cachedFrame == null) {
                this.cachedFrame = new Sprite(0, 0);
                this.cachedFrame.width = var5_intLifetime2;
                this.cachedFrame.paddedWidth = var5_intLifetime2;
                this.cachedFrame.height = var6;
                this.cachedFrame.paddedHeight = var6;
                this.cachedFrame.pixels = GetDebrisGroupColour.field_r.readPixels(var7, var8, this.cachedFrame.width, this.cachedFrame.height);
              }
              this.cachedFrame.drawOpaque(SoftwareRasterizer2D.width / 2 - var5_intLifetime2 / 2, SoftwareRasterizer2D.height / 2 - var6 / 2 - 1);
              SetMutatorVotes.f(-1321004447);
              RoundResult.field_e = true;
            }
          }
          if (ClassNameFormatter.field_a != ClassNameFormatter.field_b) {
            var4_int = 256 * ScreenTransitionFade.progress / 16;
            if (0 < var4_int) {
              SoftwareRasterizer2D.fillRectangleAlpha(0, 0, SoftwareRasterizer2D.width, SoftwareRasterizer2D.height, 0, var4_int);
            }
          }
          if (!RoundResult.field_e) {
            this.cachedFrame = null;
          }
          if (RoundResult.field_e &&
            OpenGlTexture1D.field_i) {
            var4_int = SoftwareRasterizer2D.width;
            var5_intLifetime3 = SoftwareRasterizer2D.height;
            if (this.cachedFrame != null) {
              var5_intLifetime3 = this.cachedFrame.height;
              var4_int = this.cachedFrame.width;
            }
            var6Lifetime1 = (-var4_int + GetBombletSprayEnergyUsed.field_p.width) / 2;
            var7Lifetime1 = (-var5_intLifetime3 + GetBombletSprayEnergyUsed.field_p.height) / 2;
            if (SetReloadBarWidth.isCachedFrameAvailable((byte) -116) &&
              this.cachedFrame != null) {
              var6Lifetime1 = GetExplosionProjectileOndamageParticles.e((byte) -24);
              var7Lifetime1 = RemoveEventActionFactory.b((byte) 102);
            }
            var8_ref_kla = ToolkitRasterStateCache.getStateStack(GetDebrisGroupColour.field_r, true);
            var8_ref_kla.pushClip(var6Lifetime1, var6Lifetime1 + var4_int, var7Lifetime1, var7Lifetime1 + var5_intLifetime3, (byte) -76);
            var7Lifetime1Lifetime1 = (-SoftwareRasterizer2D.height + GetBombletSprayEnergyUsed.field_p.height) / 2;
            var6Lifetime1Lifetime1 = (GetBombletSprayEnergyUsed.field_p.width - SoftwareRasterizer2D.width) / 2;
            GetDebrisGroupColour.field_r.writePixels(var6Lifetime1Lifetime1, var7Lifetime1Lifetime1, SoftwareRasterizer2D.width, SoftwareRasterizer2D.height, SoftwareRasterizer2D.pixels, 0, SoftwareRasterizer2D.width);
            var8_ref_kla.pop(true);
          }
          if (FlipTextureOperation.field_l.isReceivingGameState(-28208)) {
            var4_int = FlipTextureOperation.field_l.dataReceiver.getProgressPercent(0);
            var5 = SetReverbGain.a(GetGrapplingHookRopeBreakLength.field_q, new String[]{Integer.toString(var4_int)}, 106);
            var6Lifetime2 = 1;
            var7Lifetime2 = (GetBombletSprayEnergyUsed.field_p.width >> 1) - (tea.a(var6Lifetime2, var5, 13879) >> 1);
            var8Lifetime1 = (GetBombletSprayEnergyUsed.field_p.height >> 1) - (GetPointDefenceLaserProjectiles.a(false, var6Lifetime2) >> 1);
            BlackBoxRecording.drawPanelBackground((byte) -115, 200, MidiNote.a(var6Lifetime2, (byte) -121) * 8, var7Lifetime2 - 16, var8Lifetime1 - 5 * MidiNote.a(var6Lifetime2, (byte) -121), 32 + tea.a(var6Lifetime2, var5, 13879));
            SetSelfDestructPrepareToggleCooldown.a(var7Lifetime2, 1, var8Lifetime1, var5, var6Lifetime2, 16777215, (byte) -101);
          }
          stackIn_81_0 = 0;
          stackIn_82_1 = (GetUseDetailLines.field_o != -1) && (GetTorpedoReload.field_q != -1);
          ShieldBehaviourFactory.a(stackIn_81_0, stackIn_82_1);
          if (GetPointDefenceLaserProjectiles.a(1024, 11284)) {
            GetLagStandardDeviationOut.a(1, "FPS: " + Integer.toString(SoftwareFaceAttachment.field_a), 16777215, 20, 160, 4266);
          }
          if (OpenGlTexture1D.field_i) {
            try {
              GetDebrisGroupColour.field_r.present(-122);
            } catch (GraphicsPresentException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (GraphicsPresentException) (Object) decompiledCaughtException;
              var4.printStackTrace();
            }
          } else {
            SetSniperCannonAimarc.a(var10, 0, 0, 0);
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public VoidHunters() {
        this.musicStingCooldown = 0;
        this.cachedFrame = null;
        this.menuMusicMixId = -1;
        this.gameMusicMixId = -1;
    }

    static {
        field_E = new int[1];
    }
}
