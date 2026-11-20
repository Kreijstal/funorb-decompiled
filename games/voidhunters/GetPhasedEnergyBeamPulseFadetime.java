/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetPhasedEnergyBeamPulseFadetime extends ConsoleCommand {
    static String field_o;

    public static void clearSharedReferences(byte param0) {
        if (param0 <= 58) {
          GetPhasedEnergyBeamPulseFadetime.clearSharedReferences((byte) 89);
        }
        field_o = null;
    }

    GetPhasedEnergyBeamPulseFadetime(String param0, Class[] param1, String param2) {
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
            field_o = (String) null;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.getSettingValueText(187, 101));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ju.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static int sendAndPollLogin(boolean param0, int param1, String param2, byte param3, boolean param4, String param5) {
        try {
          int stackIn_4_0 = 0;
          int stackIn_28_0 = 0;
          boolean stackIn_39_0 = false;
          boolean stackIn_42_0 = false;
          boolean stackIn_45_0 = false;
          boolean stackIn_50_0 = false;
          int stackIn_77_0 = 0;
          int stackIn_87_0 = 0;
          int stackIn_89_0 = 0;
          int stackIn_100_0 = 0;
          int stackIn_102_0 = 0;
          RuntimeException stackIn_105_0 = null;
          StringBuilder stackIn_105_1 = null;
          String stackIn_106_2 = null;
          StringBuilder stackIn_108_1 = null;
          String stackIn_109_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          String var12 = null;
          CharSequence var13 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = VoidHunters.field_G;
          try {
            if (SetShipSpawnInvulnerabilityTime.field_o == null &&
              !OpenGlModel.pollSocketRequest(param4, (byte) -11)) {
              stackIn_4_0 = -1;
              return stackIn_4_0;
            }
            if (TextureCombineMappings.loginStage == SetBombletSprayReload.field_p) {
              if (!param4) {
                OpenGlGpuCubeTexture.loginCredentials = SetMissileLauncherProjectileLife.createLoginCredentials(param2, param5, false, (byte) -70);
              } else {
                var11 = (String) null;
                OpenGlGpuCubeTexture.loginCredentials = SetFullMissionSet.createLoginCredentials(96, SetTorpedoAimarc.field_p, (String) null, false, param5);
              }
              RequestNewestBlackboxRecording.field_p.position = 0;
              RequestNewestBlackboxRecording.field_p.writeByte(param3 ^ 13, 14);
              RequestNewestBlackboxRecording.field_p.writeByte(0, OpenGlGpuCubeTexture.loginCredentials.getType((byte) 56).wireId);
              TileTextureOperation.flushSocketOutput(-1, 117);
              TextureCombineMappings.loginStage = SetSpecialOrderBoxHeight.field_o;
            }
            if (SetSpecialOrderBoxHeight.field_o == TextureCombineMappings.loginStage &&
              ShipBlueprint.pollReplyBytes(1, 30000)) {
              var6_int = AccountNameAvailabilityReplies.field_b.readUnsignedByte((byte) -121);
              if (var6_int != 0) {
                PartitioningManagerFactory.field_a = -1;
                TextureCombineMappings.loginStage = TextInputWidget.field_xb;
                NetworkMessageState.incomingOpcode = var6_int;
              } else {
                TextureCombineMappings.loginStage = ModalStack.field_w;
              }
              AccountNameAvailabilityReplies.field_b.position = 0;
            }
            if (ModalStack.field_w == TextureCombineMappings.loginStage &&
              ShipBlueprint.pollReplyBytes(8, param3 ^ 30013)) {
              SetMissileLauncherRandomness.field_p = AccountNameAvailabilityReplies.field_b.readLong(255);
              AccountNameAvailabilityReplies.field_b.position = 0;
              UiContainer.sendLoginPacket(-87, param0, param4, OpenGlGpuCubeTexture.loginCredentials, param1);
              TextureCombineMappings.loginStage = LegacyOpenGlShaderProgram.field_a;
            }
            boolean decompiledFrameRemainder0 = true;
            if (TextureCombineMappings.loginStage == LegacyOpenGlShaderProgram.field_a &&
              ShipBlueprint.pollReplyBytes(1, 30000)) {
              var6_intLifetime1 = AccountNameAvailabilityReplies.field_b.readUnsignedByte((byte) -110);
              NetworkMessageState.incomingOpcode = var6_intLifetime1;
              AccountNameAvailabilityReplies.field_b.position = 0;
              GetFighterBayAimspeed.requestedPlayerName = null;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (var6_intLifetime1 != 8) {
                  PartitioningManagerFactory.field_a = -1;
                  TextureCombineMappings.loginStage = TextInputWidget.field_xb;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  FighterBayWeaponDefinition.closeGameConnection(-122);
                  SetShowTutorial.field_o = false;
                  stackIn_28_0 = var6_intLifetime1;
                  return stackIn_28_0;
                }
              }
              if (decompiledFrameRemainder0) {
                PartitioningManagerFactory.field_a = -1;
                TextureCombineMappings.loginStage = UiFocusableComponent.readingAccountDetails;
              }
            }
            if (TextureCombineMappings.loginStage == UiFocusableComponent.readingAccountDetails &&
              PlayerJoinFactory.pollIncomingPacketPayload((byte) 113)) {
              SetTorpedoAimarc.field_p = AccountNameAvailabilityReplies.field_b.readLong(255);
              SetLagVariant.passwordForChatFilter = param5;
              SetAngularVelocitySustain.field_p = AccountNameAvailabilityReplies.field_b.readUnsignedByte((byte) -94);
              FireGrapplesOrderDefinition.field_d = AccountNameAvailabilityReplies.field_b.readUnsignedByte((byte) -106);
              GetDebrisCarryOver.field_o = AccountNameAvailabilityReplies.field_b.readUnsignedShort(param3 + 1856);
              var12 = AccountNameAvailabilityReplies.field_b.readNullableString(0);
              var7 = AccountNameAvailabilityReplies.field_b.readUnsignedByte((byte) -106);
              if ((var7 & 1) != 0) {
                ImageProducerRasterBuffer.persistRandomDat((byte) 111);
              }
              if (!param4) {
                stackIn_39_0 = ((8 & var7) != 0);
                GetBloomThresholdPercentage.field_p = stackIn_39_0;
                stackIn_42_0 = ((var7 & 2) != 0);
                ConsoleSettingsScript.quickChatOnly = stackIn_42_0;
                stackIn_45_0 = ((var7 & 4) != 0);
                GetFightersPerPlayerMaximum.field_r = stackIn_45_0;
                if (GetBloomThresholdPercentage.field_p) {
                  ConsoleSettingsScript.quickChatOnly = true;
                }
              }
              stackIn_50_0 = ((16 & var7) != 0);
              SetMissilesHitSourceTeam.field_p = stackIn_50_0;
              if (GetBombletSprayReload.field_q) {
                AccountNameAvailabilityReplies.field_b.readUnsignedByte((byte) -117);
                AccountNameAvailabilityReplies.field_b.readUnsignedByte((byte) -91);
                AccountNameAvailabilityReplies.field_b.readInt(86);
                TeamNodeCondition.field_e = AccountNameAvailabilityReplies.field_b.readUnsignedShort(1869);
                GetRepairModeActiveTime.field_o = new byte[TeamNodeCondition.field_e];
                for (var8 = 0; TeamNodeCondition.field_e > var8; var8++) {
                  GetRepairModeActiveTime.field_o[var8] = AccountNameAvailabilityReplies.field_b.readByte((byte) -114);
                }
              }
              IntIndexTable.field_a = AccountNameAvailabilityReplies.field_b.readString(param3 ^ -14);
              var13 = (CharSequence) ((Object) IntIndexTable.field_a);
              ByteStorageAccess.field_e = ConstantColorTextureOperation.normalizeName(false, var13);
              SetClientSideDragging.field_p = AccountNameAvailabilityReplies.field_b.readUnsignedByte((byte) -94);
              TextureCombineMappings.loginStage = GetOndamageParticleSpeed.loggedIn;
              if (OpenGlGpuCubeTexture.loginCredentials.getType((byte) 124) == GetSalvoDamageMultiplier.emailCredentialType) {
                SetFighterBayAimspeed.field_o.writeCookie(MissionList.getApplet((byte) -106), param3 ^ 13);
              } else {
                if (OpenGlGpuCubeTexture.loginCredentials.getType((byte) 112) == GetTorpedoReload.numericCredentialType) {
                  SetShowTutorial.field_p.writeCookie(MissionList.getApplet((byte) -103), 0);
                }
              }
              SetShowTutorial.field_o = false;
              if (var12 != null) {
                SetNebulaProximityFadeDownshift.writeSettingsCookie(MissionList.getApplet((byte) -94), var12, -1);
              }
              if (GetDebrisCarryOver.field_o <= 0 &&
                !GetFightersPerPlayerMaximum.field_r) {
                try {
                  AppletJavaScriptBridge.call(MissionList.getApplet((byte) -87), "unzap", param3 ^ 12337);
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  AppletJavaScriptBridge.call(new Object[]{SecondaryNodeQueue.decodeBase37Name(SetTorpedoAimarc.field_p, -127)}, MissionList.getApplet((byte) -92), "zap", (byte) 108);
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (GetDebrisCarryOver.field_o > 0) {
                GetRespawnTime.field_o = true;
              }
              RequestNewestBlackboxRecording.field_p.initializeCipher(18794, FireGrapplesOrderDefinition.field_e);
              for (var8Lifetime1 = 0; 4 > var8Lifetime1; var8Lifetime1++) {
                FireGrapplesOrderDefinition.field_e[var8Lifetime1] = FireGrapplesOrderDefinition.field_e[var8Lifetime1] + 50;
              }
              AccountNameAvailabilityReplies.field_b.initializeCipher(18794, FireGrapplesOrderDefinition.field_e);
              stackIn_77_0 = NetworkMessageState.incomingOpcode;
              return stackIn_77_0;
            }
            if (TextureCombineMappings.loginStage == TextInputWidget.field_xb &&
              PlayerJoinFactory.pollIncomingPacketPayload((byte) 113)) {
              FighterBayWeaponDefinition.closeGameConnection(-117);
              if (NetworkMessageState.incomingOpcode == 7 &&
                !SetShowTutorial.field_o) {
                SetShowTutorial.field_o = true;
                stackIn_89_0 = -1;
                return stackIn_89_0;
              }
              if (NetworkMessageState.incomingOpcode == 7) {
                NetworkMessageState.incomingOpcode = 3;
              }
              GameJoinNotificationText.field_b = AccountNameAvailabilityReplies.field_b.readString(-1);
              SetShowTutorial.field_o = false;
              stackIn_87_0 = NetworkMessageState.incomingOpcode;
              return stackIn_87_0;
            }
            if (param3 != 13) {
              var10 = (String) null;
              GetPhasedEnergyBeamPulseFadetime.sendAndPollLogin(true, 44, (String) null, (byte) 29, true, (String) null);
            }
            if (null == SetShipSpawnInvulnerabilityTime.field_o) {
              if (SetShowTutorial.field_o) {
                if (LegacyOpenGlWaveWaterEffect.getNetworkReadIdleMillis(0) > 30000L) {
                  GameJoinNotificationText.field_b = SetSalvoRepairTimeMultiplier.field_o;
                } else {
                  GameJoinNotificationText.field_b = UiToggleButtonRenderer.field_f;
                }
                SetShowTutorial.field_o = false;
                stackIn_100_0 = 3;
                return stackIn_100_0;
              }
              var6_intLifetime2 = SetNebulaProximityFadeDownshift.field_p;
              SetNebulaProximityFadeDownshift.field_p = SoftwareRasterStateRestorer.field_d;
              SoftwareRasterStateRestorer.field_d = var6_intLifetime2;
              SetShowTutorial.field_o = true;
            }
            stackIn_102_0 = -1;
            return stackIn_102_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_105_0 = var6;
            stackIn_105_1 = new StringBuilder().append("ju.C(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_106_2 = "null";
            } else {
              stackIn_106_2 = "{...}";
            }
            stackIn_108_1 = ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_109_2 = "null";
            } else {
              stackIn_109_2 = "{...}";
            }
            throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_108_1).append(stackIn_109_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_o = "Press CTRL-R to reconnect";
    }
}
