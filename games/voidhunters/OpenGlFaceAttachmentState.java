/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlFaceAttachmentState {
    static boolean field_a;

    OpenGlFaceAttachmentState(int param0) {
    }

    final static void loadInterfaceTexts(boolean param0, ResourceArchive param1) {
        class InterfaceTextLoader {
            RuntimeException stackIn_2596_0;
            StringBuilder stackIn_2596_1;
            String stackIn_2597_2;
            RuntimeException decompiledCaughtException;
            byte[] resourceBytes;
            RuntimeException var2_ref;
            int var3;
            boolean obfuscationGuard;
            ResourceArchive textArchive;
            boolean finished;
            InterfaceTextLoader(boolean initialParam0, ResourceArchive initialParam1) {
                this.obfuscationGuard = initialParam0;
                this.textArchive = initialParam1;
                this.stackIn_2596_0 = null;
                this.stackIn_2596_1 = null;
                this.stackIn_2597_2 = null;
                this.decompiledCaughtException = null;
                this.resourceBytes = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void loadLoginLobbyAndChatTexts() throws java.lang.RuntimeException {
                TimingGraph.field_e = textArchive;
                resourceBytes = NetworkGameClient.loadNamedResource("loginm3", 23100);
                if (null != resourceBytes) {
                  SetSalvoRepairTimeMultiplier.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("loginm2", 23100);
                if (null != resourceBytes) {
                  UiToggleButtonRenderer.field_f = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("loginm1", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("idlemessage20min", 23100);
                if (resourceBytes != null) {
                  GetSpinningBladeSpindamageMultiplier.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("error_js5crc", 23100);
                if (resourceBytes != null) {
                  GetUseFilledPolygons.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("error_js5io", 23100);
                if (null != resourceBytes) {
                  IconTextWidget.field_wb = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("error_js5connect_full", 23100);
                if (null != resourceBytes) {
                  MissionControl.field_f = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("error_js5connect", 23100);
                if (resourceBytes != null) {
                  SetDebugLineLife.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("login_gameupdated", 23100);
                if (resourceBytes != null) {
                  RoundResult.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_unable", 23100);
                if (null != resourceBytes) {
                  CurveTextureOperation.field_j = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_ineligible", 23100);
                if (null != resourceBytes) {
                  GetMissionTerrainAsteroidProbability.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("usernameprompt", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("passwordprompt", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("andagainprompt", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("ticketing_read", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("ticketing_ignore", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("ticketing_oneunread", 23100);
                if (resourceBytes != null) {
                  ArmSelfDestructOrderDefinition.field_d = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("ticketing_xunread", 23100);
                if (resourceBytes != null) {
                  OpenGlVertexDeclaration.field_g = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("ticketing_gotowebsite", 23100);
                if (null != resourceBytes) {
                  GetMassDriverProjectileDamage.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("ticketing_waitingformessages", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_on", 23100);
                if (resourceBytes != null) {
                  GetMassDriverAimspeed.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_friends", 23100);
                if (null != resourceBytes) {
                  GetBloomCoefficientPercentage.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_off", 23100);
                if (resourceBytes != null) {
                  OpenGlNativeHeap.field_f = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_lobby", 23100);
                if (resourceBytes != null) {
                  UnsupportedGpuMaterialEffect.field_e = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_public", 23100);
                if (resourceBytes != null) {
                  SetTabForScores.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_ignore", 23100);
                if (null != resourceBytes) {
                  RequestNewestBlackboxRecording.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_tips", 23100);
                if (null != resourceBytes) {
                  SetMassDriverAimarc.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_game", 23100);
                if (resourceBytes != null) {
                  LobbyThemeBuilder.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_private", 23100);
                if (resourceBytes != null) {
                  GetAiRepairTime.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_x_entered_game", 23100);
                if (null != resourceBytes) {
                  DebugSendable.field_g = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_x_joined_your_game", 23100);
                if (resourceBytes != null) {
                  GameJoinNotificationText.playerJoinedGameText = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_x_entered_other_game", 23100);
                if (resourceBytes != null) {
                  WaterNoiseGpuMaterialEffect.field_e = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_x_left_lobby", 23100);
                if (null != resourceBytes) {
                  GetDebrisGroupColour.field_s = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_x_lost_con", 23100);
                if (null != resourceBytes) {
                  GetMassDriverProjectiles.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_x_cannot_join_full", 23100);
                if (resourceBytes != null) {
                  MassDriverWeaponDefinition.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_x_cannot_join_inprogress", 23100);
                if (null != resourceBytes) {
                  btb.field_c = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_x_declined_invite", 23100);
                if (resourceBytes != null) {
                  SetMissilesHitSourceTeam.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_x_withdrew_request", 23100);
                if (null != resourceBytes) {
                  TextLayout.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_x_removed", 23100);
                if (null != resourceBytes) {
                  GetMinimapHeight.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_x_dropped_out", 23100);
                if (resourceBytes != null) {
                  GpuIndexBufferOwner.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_entered_other_game", 23100);
                if (null != resourceBytes) {
                  GetLaserBeamProjectileDamage.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_game_is_full", 23100);
                if (null != resourceBytes) {
                  tda.field_O = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_game_has_started", 23100);
                if (resourceBytes != null) {
                  ProceduralTexture.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_you_declined_invite", 23100);
                if (resourceBytes != null) {
                  GetDebugLineLife.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_invite_withdrawn", 23100);
                if (resourceBytes != null) {
                  GetAudioRangeCutoff.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_request_declined", 23100);
                if (resourceBytes != null) {
                  GetSpinningBladeAimarc.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_request_withdrawn", 23100);
                if (null != resourceBytes) {
                  SetSniperCannonProjectileLife.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_all_players_have_left", 23100);
                if (resourceBytes != null) {
                  GetMissionTerrainDebrisProbability.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_lobby_name", 23100);
                if (resourceBytes != null) {
                  MaskedPasswordTextStyle.field_r = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_lobby_rating", 23100);
                if (null != resourceBytes) {
                  GetMessageMaxage.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_lobby_friend_add", 23100);
                if (null != resourceBytes) {
                  SetMissileLauncherEnergyUsed.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_lobby_friend_rm", 23100);
                if (resourceBytes != null) {
                  SetDefaultFiringLeeway.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_lobby_name_add", 23100);
                if (resourceBytes != null) {
                  SetMissilesTopSpeed.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_lobby_name_rm", 23100);
                if (null != resourceBytes) {
                  PlayerJoinFactory.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_lobby_location", 23100);
                if (null != resourceBytes) {
                  AppletRasterBuffer.field_e = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_gamelist_all_games", 23100);
                if (null != resourceBytes) {
                  SetMachineGunAimarc.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_gamelist_status", 23100);
                if (null != resourceBytes) {
                  GetLaserRandomness.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_gamelist_owner", 23100);
                if (resourceBytes != null) {
                  SpecialOrderButtonState.field_e = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_gamelist_players", 23100);
                if (null != resourceBytes) {
                  DebouncedInputValidator.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_gamelist_avg_rating", 23100);
                if (null != resourceBytes) {
                  MissionGenerationData.field_e = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_gamelist_options", 23100);
                if (resourceBytes != null) {
                  SetTrapMouse.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_gamelist_elapsed_time", 23100);
                if (resourceBytes != null) {
                  GameTextMetrics.elapsedTimeText = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_play_rated", 23100);
                if (null != resourceBytes) {
                  TextureRasterShape.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_create_unrated", 23100);
                if (resourceBytes != null) {
                  uab.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_options", 23100);
                if (resourceBytes != null) {
                  DisplayModeErrorDialog.field_J = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_options_whocanjoin", 23100);
                if (resourceBytes != null) {
                  GetMissionTerrainSpaceProbability.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_options_players", 23100);
                if (null != resourceBytes) {
                  GpuMaterialEffect.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_options_dontmind", 23100);
                if (resourceBytes != null) {
                  OpenGlBloomEffect.field_k = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_options_allow_spectate", 23100);
                if (null != resourceBytes) {
                  FixedPointTrigonometry.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_options_ratedgametype", 23100);
                if (resourceBytes != null) {
                  GetMassDriverProjectileOndamageParticles.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("yes", 23100);
                if (null != resourceBytes) {
                  SettingsInstanceFactory.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("no", 23100);
                if (resourceBytes != null) {
                  LoopingSound.field_j = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_invite_players", 23100);
                if (resourceBytes != null) {
                  FloatGradientNoiseSliceGenerator.field_d = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("close", 23100);
                if (resourceBytes != null) {
                  SetCountermeasureLauncherAimarc.field_s = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("add_x_to_friends", 23100);
                if (null != resourceBytes) {
                  SetAngularForceDownshift.field_r = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("add_x_to_ignore", 23100);
                if (null != resourceBytes) {
                  GpuMaterialEffect.field_c = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rm_x_from_friends", 23100);
                if (null != resourceBytes) {
                  GetAllowShipSaving.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rm_x_from_ignore", 23100);
                if (null != resourceBytes) {
                  HardpointMatch.field_c = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("send_pm_to_x", 23100);
                if (null != resourceBytes) {
                  SetSniperCannonProjectileLife.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("send_qc_to_x", 23100);
                if (resourceBytes != null) {
                  SetMissileLauncherFireForce.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("send_pm", 23100);
                if (resourceBytes != null) {
                  GetReadyRoomTeamTime.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("invite_accept_xs_game", 23100);
                if (null != resourceBytes) {
                  SetDebrisCollision.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("invite_decline_xs_game", 23100);
                if (null != resourceBytes) {
                  NullUiRenderer.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("join_xs_game", 23100);
                if (resourceBytes != null) {
                  LegacyOpenGlEnvironmentMappedWaterEffect.field_g = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("join_request_xs_game", 23100);
                if (null != resourceBytes) {
                  OpenGlShader.field_c = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("join_withdraw_request_xs_game", 23100);
                if (null != resourceBytes) {
                  ToolkitViewState.field_e = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_gameopt_kick_x_from_this_game", 23100);
                if (null != resourceBytes) {
                  GetRepairModeRadius.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_gameopt_withdraw_invite_to_x", 23100);
                if (resourceBytes != null) {
                  LegacyOpenGlShader.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_gameopt_accept_x_into_game", 23100);
                if (resourceBytes != null) {
                  SetWaitForPlayers.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_gameopt_reject_x_from_game", 23100);
                if (resourceBytes != null) {
                  AsteroidField.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_gameopt_invite_x_to_game", 23100);
                if (null != resourceBytes) {
                  GetSalvoHoldable.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("report_x_for_abuse", 23100);
                if (resourceBytes != null) {
                  NetworkArchiveClient.field_l = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unable_to_send_message_password_a", 23100);
                if (resourceBytes != null) {
                  SetCountermeasuresPulseRadius.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unable_to_send_message_password_b", 23100);
                if (null != resourceBytes) {
                  SetShieldsDamageEnergyConversion.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_lobby_show_all", 23100);
                if (null != resourceBytes) {
                  GetSniperCannonProjectileLife.field_s = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_lobby_friends_only", 23100);
                if (null != resourceBytes) {
                  UiVisualStyle.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_lobby_friends", 23100);
                if (resourceBytes != null) {
                  GetMissilesHitSourceTeam.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_lobby_hide", 23100);
                if (resourceBytes != null) {
                  tda.field_M = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_game_show_all", 23100);
                if (null != resourceBytes) {
                  SetBurstFireMaxEnergy.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_game_friends_only", 23100);
                if (resourceBytes != null) {
                  SetMassDriverEnergyUsed.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_game_friends", 23100);
                if (resourceBytes != null) {
                  GetPointDefenceLaserEnergyUsed.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_game_hide", 23100);
                if (resourceBytes != null) {
                  PasswordValidator.field_j = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_pm_show_all", 23100);
                if (null != resourceBytes) {
                  SetMassDriverReload.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_pm_friends_only", 23100);
                if (null != resourceBytes) {
                  SetMissilesAcceleration.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_pm_friends", 23100);
                if (resourceBytes != null) {
                  GetCountermeasureLauncherEnergyUsed.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mu_chat_invisible_and_silent_mode", 23100);
                if (resourceBytes != null) {
                  SetMissionDebrisVotingChancestep.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("you_have_been_removed_from_xs_game", 23100);
                if (resourceBytes != null) {
                  ToolkitRasterState.field_d = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("your_rating_is_x", 23100);
                if (resourceBytes != null) {
                  SetUseExtraBackground.field_t = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("you_are_on_x_server", 23100);
                if (resourceBytes != null) {
                  SetVelocitySustain.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rated_game", 23100);
                if (null != resourceBytes) {
                  GetTorpedoAimspeed.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unrated_game", 23100);
                if (null != resourceBytes) {
                  OpenGlClientVertexBuffer.field_c = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rated_game_tips", 23100);
                if (resourceBytes != null) {
                  PlayerContextMenu.field_j = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("searching_for_opponent_singular", 23100);
                if (null != resourceBytes) {
                  TickConditionFactory.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("searching_for_opponents_plural", 23100);
                if (resourceBytes != null) {
                  BodyDestroyedConditionFactory.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("find_opponent_singular", 23100);
                if (resourceBytes != null) {
                  FullscreenExit.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("find_opponents_plural", 23100);
                if (null != resourceBytes) {
                  SetAudioRangeCutoff.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rated_game_tips_setup_singular", 23100);
                if (null != resourceBytes) {
                  LobbyGameContextMenuBuilder.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rated_game_tips_setup_plural", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("waiting_to_start_hint", 23100);
                if (resourceBytes != null) {
                  UiComboBox.field_D = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("your_game", 23100);
                if (resourceBytes != null) {
                  GetLaserEnergyUsed.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("game_full", 23100);
                if (resourceBytes != null) {
                  SetPhasedEnergyBeamPulsetime.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("join_requests_one", 23100);
                if (null != resourceBytes) {
                  GetBombletSprayFireForce.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("join_requests_many", 23100);
                if (null != resourceBytes) {
                  SetUseCircleOutline.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("xs_game", 23100);
                if (null != resourceBytes) {
                  MonotonicMillisClock.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("waiting_for_x_to_start_game", 23100);
                if (null != resourceBytes) {
                  DebugSendable.field_h = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("game_options_changed", 23100);
                if (resourceBytes != null) {
                  SetPhasedEnergyBeamEnergyUsed.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("players_x_of_y", 23100);
                if (resourceBytes != null) {
                  GetArmageddonLength.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("message_lobby", 23100);
                if (resourceBytes != null) {
                  FlipTextureOperation.field_k = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("quickchat_lobby", 23100);
                if (null != resourceBytes) {
                  GameSession.field_D = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("message_game", 23100);
                if (null != resourceBytes) {
                  kia.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("message_team", 23100);
                if (null != resourceBytes) {
                  SetFighterBayAimspeed.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("quickchat_game", 23100);
                if (resourceBytes != null) {
                  CrossedWaveTextureOperation.field_k = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("kick", 23100);
                if (resourceBytes != null) {
                  GetBombletSprayRandomness.field_r = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("inviting_x", 23100);
                if (null != resourceBytes) {
                  GameInvitationText.invitingPlayerText = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("x_wants_to_join", 23100);
                if (resourceBytes != null) {
                  TeamShipComponentConditionFactory.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("accept", 23100);
                if (null != resourceBytes) {
                  SetAngularForceDownshift.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reject", 23100);
                if (resourceBytes != null) {
                  GetHealthBarWidth.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("invite", 23100);
                if (null != resourceBytes) {
                  GetGrappleDebris.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("status_concluded", 23100);
                if (null != resourceBytes) {
                  SetTorpedoAimarc.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("status_spectate", 23100);
                if (resourceBytes != null) {
                  GpuVertexBufferOwner.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("status_playing", 23100);
                if (null != resourceBytes) {
                  DateOfBirthInput.field_w = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("status_join", 23100);
                if (resourceBytes != null) {
                  FlipTextureOperation.field_j = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("status_private", 23100);
                if (resourceBytes != null) {
                  MouseWheelInput.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("status_full", 23100);
                if (resourceBytes != null) {
                  MonotonicMillisClock.field_c = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("players_in_game", 23100);
                if (resourceBytes != null) {
                  SoftwareSprite2D.field_c = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("you_are_invited_to_xs_game", 23100);
                if (null != resourceBytes) {
                  GetDebrisGroupColour.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("asking_to_join_xs_game", 23100);
                if (resourceBytes != null) {
                  SoftCacheReference.field_m = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("who_can_join", 23100);
                if (null != resourceBytes) {
                  GpuFaceAttachmentState.field_c = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("you_can_join", 23100);
                if (null != resourceBytes) {
                  ComponentContact.field_k = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("you_can_ask_to_join", 23100);
                if (null != resourceBytes) {
                  SpawnPoint.field_f = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("you_cannot_join_in_progress", 23100);
                if (resourceBytes != null) {
                  GetMissilesCooldown.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("you_can_spectate", 23100);
                if (resourceBytes != null) {
                  OpenGlSprite.field_h = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("you_can_not_spectate", 23100);
                if (resourceBytes != null) {
                  CarouselSystemEventFactory.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("spectate_xs_game", 23100);
                if (null != resourceBytes) {
                  GetMassDriverProjectileLife.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("hide_players_in_xs_game", 23100);
                if (null != resourceBytes) {
                  LoginFormNavigation.field_c = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("show_players_in_xs_game", 23100);
                if (null != resourceBytes) {
                  IntrusiveNodeHashTable.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("connecting_to_friend_server_twoline", 23100);
                if (null != resourceBytes) {
                  SetMachineGunPulsetime.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("loading", 23100);
                if (null != resourceBytes) {
                  SetFighterRepairTime.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("offline", 23100);
                if (resourceBytes != null) {
                  SetCountermeasuresPulseRadius.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("multiconst_invite_only", 23100);
                if (null != resourceBytes) {
                  LegacyOpenGlEnvironmentReflectionEffect.field_f = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("multiconst_clan", 23100);
                if (null != resourceBytes) {
                  GetAngularForceDownshift.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("multiconst_friends", 23100);
                if (resourceBytes != null) {
                  CarouselSlot.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("multiconst_similar_rating", 23100);
                if (null != resourceBytes) {
                  SetPointDefenceLaserProjectiles.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("multiconst_open", 23100);
                if (null != resourceBytes) {
                  GetCountermeasuresCooldown.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("no_options_available", 23100);
                if (null != resourceBytes) {
                  GetNumStars.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reportabuse", 23100);
                if (null != resourceBytes) {
                  SetShieldsDirectionalArcParticleSpeedDownshift.field_r = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("presstabtochat", 23100);
                if (resourceBytes != null) {
                  IconTextWidget.field_xb = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("pressf10toquickchat", 23100);
                if (resourceBytes != null) {
                  GameInterfaceText.quickChatShortcutText = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("dob_chatdisabled", 23100);
                if (resourceBytes != null) {
                  PasswordValidator.field_g = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("dob_enterforchat", 23100);
                if (null != resourceBytes) {
                  PlayerContextMenus.field_c = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("tab_hidechattemporarily", 23100);
                if (null != resourceBytes) {
                  GetMissionTerrainVotingChancestep.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("esc_cancelprivatemessage", 23100);
                if (resourceBytes != null) {
                  ChatMessage.field_l = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("esc_cancelthisline", 23100);
                if (resourceBytes != null) {
                  SetReverbWet.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("privatequickchat_from_x", 23100);
                if (resourceBytes != null) {
                  GetLaserAimspeed.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("privatequickchat_to_x", 23100);
                if (null != resourceBytes) {
                  UiComboBoxList.field_G = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("privatechat_blankarea_explanation", 23100);
                if (null != resourceBytes) {
                  MissionGenerationDataFactory.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("publicchat_unavailable_ratedgame", 23100);
                if (null != resourceBytes) {
                  GetRepairModePower.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("privatechat_friend_offline", 23100);
                if (resourceBytes != null) {
                  BodyDestroyedCondition.field_d = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("privatechat_friend_notlisted", 23100);
                if (null != resourceBytes) {
                  GraphicsToolkitSelector.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("chatviewscrolledup", 23100);
                if (null != resourceBytes) {
                  SetMomentOfInertiaPerpointCalcDownshift.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("thisisrunescapeclan", 23100);
                if (resourceBytes != null) {
                  SetAutoAfkTimeout.field_r = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("thisisrunescapeclan_notowner", 23100);
                if (resourceBytes != null) {
                  SetMissionVotes.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("runescapeclan", 23100);
                if (null != resourceBytes) {
                  GetDebrisGroupColour.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rated_membersonly", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_membersonly", 23100);
                if (null != resourceBytes) {
                  UiComboBoxRenderer.field_d = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_1moreratedgame", 23100);
                if (resourceBytes != null) {
                  MessageBoxState.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_moreratedgames", 23100);
                if (null != resourceBytes) {
                  AwardVictoryToTeamActionFactory.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_needrating", 23100);
                if (resourceBytes != null) {
                  SetPlayerRepairTime.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_unratedonly", 23100);
                if (null != resourceBytes) {
                  GetMessageMaxage.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_notunlocked", 23100);
                if (null != resourceBytes) {
                  CarouselEventFactory.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_cannotbecombined1", 23100);
                if (resourceBytes != null) {
                  fra.field_c = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_cannotbecombined2", 23100);
                if (null != resourceBytes) {
                  DialogMessagePanel.field_F = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_playernotmember", 23100);
                if (null != resourceBytes) {
                  UiToggleButton.field_B = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_younotmember", 23100);
                if (null != resourceBytes) {
                  PopupMenuWidget.field_Db = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_playerneedsrating", 23100);
                if (null != resourceBytes) {
                  TextureBezierShape.field_j = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_youneedrating", 23100);
                if (resourceBytes != null) {
                  GetMassDriverFireForce.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_playerneedsratedgames", 23100);
                if (null != resourceBytes) {
                  iwa.field_c = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_youneedratedgames", 23100);
                if (resourceBytes != null) {
                  SetBots.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_playerneeds1ratedgame", 23100);
                if (null != resourceBytes) {
                  GetAllowShipSaving.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_youneed1ratedgame", 23100);
                if (resourceBytes != null) {
                  VariableCondition.field_f = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_playerhasntunlocked", 23100);
                if (null != resourceBytes) {
                  GetKeepTeamColours.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_youhaventunlocked", 23100);
                if (resourceBytes != null) {
                  TabbedWidget.field_zb = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_trychanging1", 23100);
                if (resourceBytes != null) {
                  SetTorpedoProjectileLife.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_trychanging2", 23100);
                if (null != resourceBytes) {
                  SetMissilesHitSourceTeam.field_r = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_needchanging1", 23100);
                if (resourceBytes != null) {
                  GetCountermeasureLauncherRandomness.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_needchanging2", 23100);
                if (null != resourceBytes) {
                  ComponentBehaviour.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_mightchange", 23100);
                if (resourceBytes != null) {
                  SetMassDriverProjectileLife.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_playersdontqualify", 23100);
                if (resourceBytes != null) {
                  ClientDataReadRequest.field_e = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_playersdontqualify_selectgametab", 23100);
                if (resourceBytes != null) {
                  SetInnateThrusters.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_unselectedoptions", 23100);
                if (resourceBytes != null) {
                  SetPointDefenceLaserRandomness.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_pleaseselectoption1", 23100);
            }
            void loadAccountAndSocialTexts() throws java.lang.RuntimeException {
                if (null != resourceBytes) {
                  TextureBezierShape.field_g = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_pleaseselectoption2", 23100);
                if (resourceBytes != null) {
                  SetSalvoaim.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_badnumplayers", 23100);
                if (resourceBytes != null) {
                  UiDraggableContainer.field_A = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_inviteplayers_or_trychanging1", 23100);
                if (null != resourceBytes) {
                  PrimitiveType.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_inviteplayers_or_trychanging2", 23100);
                if (resourceBytes != null) {
                  LobbyInviteSuggestionText.inviteMorePlayersText = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_novalidcombos", 23100);
                if (resourceBytes != null) {
                  GetReloadBarWidth.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameopt_pleasetrychanging", 23100);
                if (null != resourceBytes) {
                  GetRepairModeCooldown.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("ra_title", 23100);
                if (resourceBytes != null) {
                  KaleidoscopeTextureOperation.field_j = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("ra_mutethisplayer", 23100);
                if (null != resourceBytes) {
                  GetPointDefenceLaserProjectiles.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("ra_suggestmute", 23100);
                if (null != resourceBytes) {
                  GetFighterBayAimarc.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("ra_intro", 23100);
                if (null != resourceBytes) {
                  GetPointDefenceLaserProjectileInterceptDamage.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("ra_intro_no_name", 23100);
                if (null != resourceBytes) {
                  GetPhysicsCollisionPhantomForceMultiplier.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("ra_explanation", 23100);
                if (resourceBytes != null) {
                  DualLinkNode.field_j = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rule_pillar_0", 23100);
                if (resourceBytes != null) {
                  GetGrapplingHookCooldown.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rule_0_0", 23100);
                if (resourceBytes != null) {
                  UiStatefulStyle.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rule_0_1", 23100);
                if (resourceBytes != null) {
                  MatchingFieldValidator.field_j = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rule_0_2", 23100);
                if (resourceBytes != null) {
                  GetMachineGunAimspeed.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rule_0_3", 23100);
                if (resourceBytes != null) {
                  SetUseExtraBackground.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rule_0_4", 23100);
                if (null != resourceBytes) {
                  AccountCreationForm.field_G = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rule_0_5", 23100);
                if (resourceBytes != null) {
                  GetDebrisCarryOver.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rule_pillar_1", 23100);
                if (resourceBytes != null) {
                  CrossedWaveTextureOperation.field_n = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rule_1_0", 23100);
                if (resourceBytes != null) {
                  SetExplosionProjectileDamage.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rule_1_1", 23100);
                if (resourceBytes != null) {
                  SetBots.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rule_1_2", 23100);
                if (resourceBytes != null) {
                  SettingsInstance.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rule_1_3", 23100);
                if (null != resourceBytes) {
                  EmailLoginCredentials.field_e = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rule_1_4", 23100);
                if (null != resourceBytes) {
                  GetSelfDestructTimer.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rule_pillar_2", 23100);
                if (resourceBytes != null) {
                  SetUseOffscreenRendering.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rule_2_0", 23100);
                if (null != resourceBytes) {
                  SetKeepTeamColours.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rule_2_1", 23100);
                if (null != resourceBytes) {
                  LawViolationReportText.lawViolationText = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rule_2_2", 23100);
                if (resourceBytes != null) {
                  PanelWidthQuery.field_d = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("createafreeaccount", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("cancel", 23100);
                if (null != resourceBytes) {
                  SetMissileLauncherProjectiles.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("pleaselogintoplay", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("pleaselogin", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("pleaselogin_member", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("invaliduserorpass", 23100);
                if (resourceBytes != null) {
                  SetPlayerRepairAmount.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("pleasetryagain", 23100);
                if (null != resourceBytes) {
                  SpritePadding.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("pleasereenterpass", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("playfreeversion", 23100);
                if (resourceBytes != null) {
                  GetBombletSprayProjectileLife.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reloadgame", 23100);
                if (resourceBytes != null) {
                  PhasedEnergyBeamWeaponDefinition.field_c = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("toserverlist", 23100);
                if (null != resourceBytes) {
                  AppletRasterBuffer.field_h = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("tocustomersupport", 23100);
                if (null != resourceBytes) {
                  SoftwareTransform3D.field_c = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("changedisplayname", 23100);
                if (resourceBytes != null) {
                  GetCountermeasureLauncherProjectileLife.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("returntohomepage", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("justplay", 23100);
                if (resourceBytes != null) {
                  GuestPlayText.justPlayText = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("justplay_excl", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("login", 23100);
                if (null != resourceBytes) {
                  GetBombletSprayProjectiles.field_s = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("goback", 23100);
                if (null != resourceBytes) {
                  SetTorpedoReload.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("otheroptions", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("proceed", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("connectingtoserver", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("pleasewait", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("logging_in", 23100);
                if (null != resourceBytes) {
                  SetMissionDebrisVotingChancestep.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reconnect", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("backtoerror", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("pleasecheckinternet", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("attemptingtoreconnect", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("connectionlost_reconnecting", 23100);
                if (null != resourceBytes) {
                  SetCountermeasureLauncherEnergyUsed.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("connectionlost_withreason", 23100);
                if (resourceBytes != null) {
                  SetPointDefenceLaserFireForce.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("passwordverificationrequired", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("invalidpass", 23100);
                if (resourceBytes != null) {
                  GetTorqueDownshift.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("retry", 23100);
                if (resourceBytes != null) {
                  SetSpecialOrderBoxHeight.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("back", 23100);
                if (resourceBytes != null) {
                  ArbProgram.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("exitfullscreenmode", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("quittowebsite", 23100);
                if (null != resourceBytes) {
                  GetFighterBayAimspeed.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("connectionrestored", 23100);
                if (null != resourceBytes) {
                  GetPointDefenceLaserAimarc.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("warning_ifyouquit", 23100);
                if (null != resourceBytes) {
                  GetSpecialOrderBoxHeight.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("warning_ifyouquitorleavepage", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("resubscribe_withoutlosing_fs", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("resubscribe_withoutlosing", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("customersupport_withoutlosing_fs", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("customersupport_withoutlosing", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("js5help_withoutlosing_fs", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("js5help_withoutlosing", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("checkinternet_withoutlosing_fs", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("checkinternet_withoutlosing", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_intro", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_sameaccounttip_unnamed", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("dateofbirthprompt", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("fetchingcountrylist", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("countryprompt", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("countrylisterror", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("theonlypersonalquestions", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_submittingdata", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("check", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_pleasechooseausername", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_usernameblurb", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("checkingavailability", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("checking", 23100);
                if (null != resourceBytes) {
                  IntrusiveNodeHashTable.field_c = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_namealreadytaken", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_sameaccounttip_named", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_nosuggestions", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alternativelygoback", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_available", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_willnowshowtermsandconditions", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("fetchingterms", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("termserror", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_iagree", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_idisagree", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_pleasescrolldowntoaccept", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_linkaddress", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("openinpopupwindow", 23100);
                if (resourceBytes != null) {
                  SetBombletSprayProjectileDamage.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create", 23100);
                if (null != resourceBytes) {
                  SettingsChange.field_d = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_pleasechooseapassword", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_passwordblurb", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_nevergivepassword", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("creatingyouraccount", 23100);
                if (resourceBytes != null) {
                  CommonGameState.field_c = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_youmustaccept", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_passwordsdifferent", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_success", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("day", 23100);
                if (null != resourceBytes) {
                  GetReadyRoomMissionTime.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("month", 23100);
                if (null != resourceBytes) {
                  GetBombletSprayAimspeed.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("year", 23100);
                if (null != resourceBytes) {
                  GetMissileLauncherRandomness.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("monthnames,0", 23100);
                if (resourceBytes != null) {
                  GetSniperCannonAimspeed.field_r[0] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("monthnames,1", 23100);
                if (null != resourceBytes) {
                  GetSniperCannonAimspeed.field_r[1] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("monthnames,2", 23100);
                if (null != resourceBytes) {
                  GetSniperCannonAimspeed.field_r[2] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("monthnames,3", 23100);
                if (resourceBytes != null) {
                  GetSniperCannonAimspeed.field_r[3] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("monthnames,4", 23100);
                if (resourceBytes != null) {
                  GetSniperCannonAimspeed.field_r[4] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("monthnames,5", 23100);
                if (resourceBytes != null) {
                  GetSniperCannonAimspeed.field_r[5] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("monthnames,6", 23100);
                if (null != resourceBytes) {
                  GetSniperCannonAimspeed.field_r[6] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("monthnames,7", 23100);
                if (null != resourceBytes) {
                  GetSniperCannonAimspeed.field_r[7] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("monthnames,8", 23100);
                if (resourceBytes != null) {
                  GetSniperCannonAimspeed.field_r[8] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("monthnames,9", 23100);
                if (resourceBytes != null) {
                  GetSniperCannonAimspeed.field_r[9] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("monthnames,10", 23100);
                if (null != resourceBytes) {
                  GetSniperCannonAimspeed.field_r[10] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("monthnames,11", 23100);
                if (resourceBytes != null) {
                  GetSniperCannonAimspeed.field_r[11] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_welcome", 23100);
                if (null != resourceBytes) {
                  NebulaFactory.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_u13_welcome", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_createanaccount", 23100);
                if (null != resourceBytes) {
                  TimedSpecialOrderBehaviour.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_username", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_displayname", 23100);
                if (null != resourceBytes) {
                  ByteStorageAccess.field_c = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_password", 23100);
                if (resourceBytes != null) {
                  RequestNewestBlackboxRecording.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_password_confirm", 23100);
                if (null != resourceBytes) {
                  ScramblerPulseOrderDefinition.field_d = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_email", 23100);
                if (null != resourceBytes) {
                  MissionState.field_h = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_email_confirm", 23100);
                if (null != resourceBytes) {
                  AppletCookieWriter.confirmEmailText = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_age", 23100);
                if (null != resourceBytes) {
                  CarouselSystemEventFactory.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_u13_email", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_u13_email_confirm", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_dob", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_country", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alternatives_header", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alternatives_select", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_suggestions", 23100);
                if (resourceBytes != null) {
                  SetShipTeamAction.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_more_suggestions", 23100);
                if (null != resourceBytes) {
                  GetPointDefenceLaserRandomness.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_select_alternative", 23100);
                if (resourceBytes != null) {
                  OpenGlRenderbuffer.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_optin_news", 23100);
                if (null != resourceBytes) {
                  UiComponent.field_m = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_agreeterms", 23100);
                if (resourceBytes != null) {
                  GetLaserProjectiles.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_u13terms", 23100);
                if (resourceBytes != null) {
                  SetCountermeasuresPulsetime.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("login_username_email", 23100);
                if (resourceBytes != null) {
                  RemoveEventActionFactory.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("login_username", 23100);
                if (resourceBytes != null) {
                  SetSpinningBladeTopSpeed.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("login_email", 23100);
                if (null != resourceBytes) {
                  WhirlpoolDigest.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("login_username_tooltip", 23100);
                if (resourceBytes != null) {
                  ToolkitRasterState.field_j = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("login_password_tooltip", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("login_login_tooltip", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("login_create_tooltip", 23100);
                if (resourceBytes != null) {
                  AdjustBodyComponentsAction.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("login_justplay_tooltip", 23100);
                if (null != resourceBytes) {
                  UiContainer.field_u = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("login_back_tooltip", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("login_no_displayname", 23100);
                if (resourceBytes != null) {
                  ChoosePlayerNameForm.instructionsText = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_username_tooltip", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_username_hint", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_displayname_tooltip", 23100);
                if (resourceBytes != null) {
                  FractalNoiseVolumeGenerator.field_m = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_displayname_hint", 23100);
                if (resourceBytes != null) {
                  Projectile.field_r = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_password_tooltip", 23100);
                if (resourceBytes != null) {
                  UiScrollPane.field_x = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_password_hint", 23100);
                if (null != resourceBytes) {
                  OpenGlVertexNormal.field_e = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_password_confirm_tooltip", 23100);
                if (resourceBytes != null) {
                  SetAngularForceDownshift.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_email_tooltip", 23100);
                if (null != resourceBytes) {
                  GetPointDefenceLaserProjectileInterceptDamage.field_s = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_email_confirm_tooltip", 23100);
                if (resourceBytes != null) {
                  AccountRequestText.confirmEmailTooltip = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_age_tooltip", 23100);
                if (resourceBytes != null) {
                  HashNoiseTextureOperation.field_j = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_optin_news_tooltip", 23100);
                if (null != resourceBytes) {
                  QuickChatCategoryLoader.field_f = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_u13_email_tooltip", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_u13_email_confirm_tooltip", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_dob_tooltip", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_country_tooltip", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_optin_tooltip", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_continue", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_username_unavailable", 23100);
                if (null != resourceBytes) {
                  GetLaserReload.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_username_available", 23100);
                if (null != resourceBytes) {
                  TutorialHintStatus.nameAvailableText = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alert_namelength", 23100);
                if (resourceBytes != null) {
                  GetInnateThrusters.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alert_namechars", 23100);
                if (null != resourceBytes) {
                  SetUseExtraBackground.field_u = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alert_nameleadingspace", 23100);
                if (null != resourceBytes) {
                  ArmBehaviour.field_d = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alert_doublespace", 23100);
                if (null != resourceBytes) {
                  ServerInfoFactory.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alert_passchars", 23100);
                if (null != resourceBytes) {
                  GetThrusterParticleSpeedDownshift.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alert_passrepeated", 23100);
                if (null != resourceBytes) {
                  ConsoleCharacterStream.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alert_passlength", 23100);
                if (null != resourceBytes) {
                  SetShipDirectionArrow.field_r = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alert_passcontainsname", 23100);
                if (null != resourceBytes) {
                  GetShieldsDirectionalArc.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alert_passcontainsemail", 23100);
                if (null != resourceBytes) {
                  NodeHashTable.field_f = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alert_passcontainsname_partial", 23100);
                if (resourceBytes != null) {
                  SetBombletSprayProjectileLife.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alert_checkname", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alert_invalidemail", 23100);
                if (null != resourceBytes) {
                  EscapePod.field_m = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alert_email_unavailable", 23100);
                if (resourceBytes != null) {
                  FullscreenMembershipDialog.field_N = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alert_invaliddate", 23100);
                if (null != resourceBytes) {
                  GetUseRectFill.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alert_invalidage", 23100);
                if (null != resourceBytes) {
                  SetSniperCannonProjectiles.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alert_yearrange", 23100);
                if (null != resourceBytes) {
                  ComponentBehaviourFactory.field_d = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_alert_mismatch", 23100);
                if (null != resourceBytes) {
                  ChatPermissions.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_passwordvalid", 23100);
                if (resourceBytes != null) {
                  SetGrapplingHookMaxLength.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_emailvalid", 23100);
                if (null != resourceBytes) {
                  ModelFaceAttachment.field_f = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("create_account_success", 23100);
                if (resourceBytes != null) {
                  SpecialOrderDefinition.field_c = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("invalid_name", 23100);
                if (null != resourceBytes) {
                  QuickChatMenuWidget.field_Cb = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("cannot_add_yourself", 23100);
                if (resourceBytes != null) {
                  GetUsePolygonFill.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unable_to_add_friend", 23100);
                if (resourceBytes != null) {
                  GetReverbWet.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unable_to_add_ignore", 23100);
                if (null != resourceBytes) {
                  SetSniperCannonProjectileOndamageParticles.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unable_to_delete_friend", 23100);
                if (null != resourceBytes) {
                  UiAngleDialRenderer.field_e = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unable_to_delete_ignore", 23100);
                if (resourceBytes != null) {
                  CarouselPlayerEventFactory.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("friendlistfull", 23100);
                if (resourceBytes != null) {
                  GetRepairModeCooldown.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("friendlistdupe", 23100);
                if (resourceBytes != null) {
                  dfa.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("friendnotfound", 23100);
                if (null != resourceBytes) {
                  SetSniperCannonAimarc.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("ignorelistfull", 23100);
                if (resourceBytes != null) {
                  GetBombletSprayAimarc.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("ignorelistdupe", 23100);
                if (resourceBytes != null) {
                  FloatNoiseSliceGenerator.field_c = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("ignorenotfound", 23100);
                if (resourceBytes != null) {
                  DisplayModeErrorDialog.field_L = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("removeignorefirst", 23100);
                if (resourceBytes != null) {
                  ChatPanelUpdater.removeFromIgnoreListFirstText = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("removefriendfirst", 23100);
                if (null != resourceBytes) {
                  GetLaserAimarc.field_r = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("enterfriend_add", 23100);
                if (resourceBytes != null) {
                  EdgeMagnitudeTextureOperation.field_i = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("enterfriend_del", 23100);
                if (resourceBytes != null) {
                  MissionEvent.field_e = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("enterignore_add", 23100);
                if (null != resourceBytes) {
                  LegacyOpenGlWaveWaterEffect.field_d = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("enterignore_del", 23100);
                if (null != resourceBytes) {
                  GetUseNiceTrails.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("text_removed_from_game", 23100);
                if (null != resourceBytes) {
                  GetMissilesDamageSourceTeam.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("text_lobby_pleaselogin_free", 23100);
                if (resourceBytes != null) {
                  IntrusiveDequeIterator.field_d = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("opengl", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("sse", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("purejava", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("waitingfor_graphics", 23100);
                if (null != resourceBytes) {
                  SetTorpedoProjectileOndamageParticles.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("waitingfor_models", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("waitingfor_fonts", 23100);
            }
            void loadLoadingMenuAndQuickChatTexts() throws java.lang.RuntimeException {
                if (null != resourceBytes) {
                  TorpedoWeaponDefinition.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("waitingfor_soundeffects", 23100);
                if (null != resourceBytes) {
                  SetRepairModePower.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("waitingfor_music", 23100);
                if (resourceBytes != null) {
                  CarouselSlotFactory.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("waitingfor_instruments", 23100);
                if (resourceBytes != null) {
                  GetMissilesCooldown.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("waitingfor_levels", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("waitingfor_extradata", 23100);
                if (null != resourceBytes) {
                  SetUseLines.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("waitingfor_languages", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("waitingfor_textures", 23100);
                if (null != resourceBytes) {
                  RangeTextureOperation.field_k = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("waitingfor_animations", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("loading_graphics", 23100);
                if (null != resourceBytes) {
                  ConstantMonochromeTextureOperation.field_k = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("loading_models", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("loading_fonts", 23100);
                if (resourceBytes != null) {
                  GetBombletSprayAimarc.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("loading_soundeffects", 23100);
                if (null != resourceBytes) {
                  LoadBlackboxRecording.field_r = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("loading_music", 23100);
                if (resourceBytes != null) {
                  GetBombletSprayProjectiles.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("loading_instruments", 23100);
                if (resourceBytes != null) {
                  StripedProgressBar.field_z = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("loading_levels", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("loading_extradata", 23100);
                if (null != resourceBytes) {
                  QuickChatHelpWindow.loadingExtraDataText = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("loading_languages", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("loading_textures", 23100);
                if (resourceBytes != null) {
                  GetThrusterParticleSpeedDownshift.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("loading_animations", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unpacking_graphics", 23100);
                if (null != resourceBytes) {
                  SetAutozoomSpeedDivide.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unpacking_models", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unpacking_soundeffects", 23100);
                if (resourceBytes != null) {
                  OpenGlVertexDeclaration.field_e = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unpacking_music", 23100);
                if (resourceBytes != null) {
                  GetBloomCoefficientPercentage.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unpacking_levels", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unpacking_languages", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unpacking_animations", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unpacking_toolkit", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("instructions", 23100);
                if (resourceBytes != null) {
                  SetMissilesExplosionPower.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("tutorial", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("playtutorial", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("sound_colon", 23100);
                if (null != resourceBytes) {
                  ArchiveLoadRequest.field_d = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("music_colon", 23100);
                if (resourceBytes != null) {
                  SaveShipDesignOrderDefinition.field_d = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("fullscreen", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("screensize", 23100);
                if (resourceBytes != null) {
                  DebugRequest.field_j = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("highscores", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rankings", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("achievements", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("achievementsthisgame", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("achievementsthissession", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("watchintroduction", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("quit", 23100);
                if (resourceBytes != null) {
                  SetBombletSprayRandomness.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("login_createaccount", 23100);
                if (null != resourceBytes) {
                  GetFightersPerPlayerMaximum.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("tohighscores", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("returntomainmenu", 23100);
                if (resourceBytes != null) {
                  GameInterfaceText.returnToMainMenuText = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("returntopausemenu", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("returntooptionsmenu_notpaused", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mainmenu", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("pausemenu", 23100);
                if (null != resourceBytes) {
                  SetSalvoaim.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("optionsmenu_notpaused", 23100);
                if (resourceBytes != null) {
                  SetMessageFadetime.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("menu", 23100);
                if (null != resourceBytes) {
                  ByteStorageAccess.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("selectlevel", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("nextlevel", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("startgame", 23100);
                if (resourceBytes != null) {
                  GetPhasedEnergyBeamAimspeed.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("newgame", 23100);
                if (resourceBytes != null) {
                  SetMessageMax.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("resumegame", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("resumetutorial", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("skip", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("skiptutorial", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("skipending", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("restartlevel", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("endtest", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("endgame", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("endtutorial", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("ok", 23100);
                if (null != resourceBytes) {
                  UiComboBoxList.field_K = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("on", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("off", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("previous", 23100);
                if (null != resourceBytes) {
                  SetUseLines.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("prev", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("next", 23100);
                if (resourceBytes != null) {
                  DateOfBirthTextFields.field_D = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_colon", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("hotseatmultiplayer", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("entermultiplayerlobby", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("singleplayergame", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("returntogame", 23100);
                if (resourceBytes != null) {
                  DialogMessagePanel.field_D = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("endgameresign", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("offerdraw", 23100);
                if (null != resourceBytes) {
                  PacketBuffer.field_f = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("canceldraw", 23100);
                if (resourceBytes != null) {
                  PlayerRequestPackets.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("acceptdraw", 23100);
                if (null != resourceBytes) {
                  SetShipDirectionArrow.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("resign", 23100);
                if (resourceBytes != null) {
                  PhasedEnergyBeamWeaponDefinition.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("returntolobby", 23100);
                if (resourceBytes != null) {
                  ReturnToLobbyText.returnToLobbyText = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("cont", 23100);
                if (null != resourceBytes) {
                  tn.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("continue_spectating", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("messages", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_fastest", 23100);
                if (resourceBytes != null) {
                  PlayerVote.field_d = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_medium", 23100);
                if (resourceBytes != null) {
                  SetMissileLauncherAimspeed.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_best", 23100);
                if (resourceBytes != null) {
                  MatchResultsFactory.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_directx", 23100);
                if (null != resourceBytes) {
                  GetDebrisMax.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_opengl", 23100);
                if (null != resourceBytes) {
                  LoginFormNavigation.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_java", 23100);
                if (resourceBytes != null) {
                  HotspotTextWidget.field_C = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_quality_high", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_quality_low", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_mode", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_quality", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mode", 23100);
                if (null != resourceBytes) {
                  MissionEvent.field_f = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("quality", 23100);
                if (null != resourceBytes) {
                  Widget.field_V = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("keys", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("objective", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("currentobjective", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("pressescforpausemenu", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("pressescforpausemenuortoskiptutorial", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("pressescforoptionsmenu_doesntpause", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("pressescforoptionsmenu_doesntpause_short", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("powerups", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("latestlevel_suffix", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unreachedlevel_name", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                if (!obfuscationGuard) {
                  field_a = true;
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unreachedlevel_cannotplayreason", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unreachedlevel_cannotplayreason_shorter", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unreachedworld_cannotplayreason", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("memberslevel_name", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("memberslevel_cannotplayreason", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("membersworld_cannotplayreason", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unreachedlevel_createtip", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unreachedlevel_createtip_line1", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unreachedlevel_createtip_line2", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("unreachedlevel_logintip", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("memberslevel_logintip", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("displayname_none", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("levelxofy1", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("levelxofy2", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("levelxofy", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("ingame_level", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mouseoveranicon", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("notyetachieved", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("achieved", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("orbpoints", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("orbcoins", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("orbpoints_colon", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("orbcoins_colon", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("achieved_colon_description", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("secretachievement", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("no_highscores", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("hs_name", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("hs_level", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("hs_fromlevel", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("hs_tolevel", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("hs_score", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("hs_end", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("ingame_score", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("score_colon", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_leavegame", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_offerrematch", 23100);
                if (null != resourceBytes) {
                  ByteStorageAccess.field_d = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_offerrematch_unrated", 23100);
                if (null != resourceBytes) {
                  UnratedRematchText.text = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_acceptrematch", 23100);
                if (resourceBytes != null) {
                  SetBlueprintSaveTime.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_acceptrematch_unrated", 23100);
                if (resourceBytes != null) {
                  BufferedFile.field_d = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_cancelrematch", 23100);
                if (null != resourceBytes) {
                  GetMachineGunAimarc.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_cancelrematch_unrated", 23100);
                if (resourceBytes != null) {
                  ConvoyObjectiveText.cancelUnratedRematchText = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_rematchnewgame", 23100);
                if (null != resourceBytes) {
                  SettingsChangeFactory.field_d = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_rematchnewgame_unrated", 23100);
                if (resourceBytes != null) {
                  SpawnEnemyShipOrderDefinition.field_e = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_x_wantstodraw", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_x_offersrematch", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_x_offersrematch_unrated", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_youofferrematch", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_youofferrematch_unrated", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_youofferdraw", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_youresigned", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_youresigned_rematch", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_x_hasresignedandleft", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_x_hasresigned_rematch", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_x_hasresigned", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_x_hasleft", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_x_haswon", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_youhavewon", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_gamedrawn", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_timeremaining", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_x_turn", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_yourturn", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("gameover", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_hidechat", 23100);
                if (null != resourceBytes) {
                  DateOfBirthTextFields.field_A = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_showchat_nounread", 23100);
                if (resourceBytes != null) {
                  VariableConditionFactory.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_showchat_unread1", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mp_showchat_unread2", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("click_to_quickchat", 23100);
                if (null != resourceBytes) {
                  DateOfBirthInput.field_y = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("autorespond", 23100);
                if (resourceBytes != null) {
                  SetMachineGunFireForce.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("quickchat_help", 23100);
                if (null != resourceBytes) {
                  SetPhasedEnergyBeamEnergyUsed.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("quickchat_help_title", 23100);
                if (resourceBytes != null) {
                  TextInputWidget.field_Jb = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("quickchat_shortcut_help,0", 23100);
                if (null != resourceBytes) {
                  Lo.field_q[0] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("quickchat_shortcut_help,1", 23100);
                if (null != resourceBytes) {
                  Lo.field_q[1] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("quickchat_shortcut_help,2", 23100);
                if (null != resourceBytes) {
                  Lo.field_q[2] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("quickchat_shortcut_help,3", 23100);
                if (resourceBytes != null) {
                  Lo.field_q[3] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("quickchat_shortcut_help,4", 23100);
                if (null != resourceBytes) {
                  Lo.field_q[4] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("quickchat_shortcut_help,5", 23100);
                if (null != resourceBytes) {
                  Lo.field_q[5] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("quickchat_shortcut_keys,0", 23100);
                if (resourceBytes != null) {
                  GetKeepTeamColours.field_r[0] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("quickchat_shortcut_keys,1", 23100);
                if (resourceBytes != null) {
                  GetKeepTeamColours.field_r[1] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("quickchat_shortcut_keys,2", 23100);
                if (resourceBytes != null) {
                  GetKeepTeamColours.field_r[2] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("quickchat_shortcut_keys,3", 23100);
                if (null != resourceBytes) {
                  GetKeepTeamColours.field_r[3] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("quickchat_shortcut_keys,4", 23100);
                if (null != resourceBytes) {
                  GetKeepTeamColours.field_r[4] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("quickchat_shortcut_keys,5", 23100);
                if (resourceBytes != null) {
                  GetKeepTeamColours.field_r[5] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("keychar_the_character_under_questionmark", 23100);
                if (resourceBytes != null) {
                  StripedProgressBar.field_B = GetMassDriverEnergyUsed.a(resourceBytes[0], 76);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rating_noratings", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rating_rating", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rating_played", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rating_won", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rating_lost", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rating_drawn", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("benefits_fullscreen", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("benefits_noadverts", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("benefits_price", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("members_expansion_benefits,0", 23100);
                if (resourceBytes != null) {
                  FullscreenCanvas.field_d[0] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("members_expansion_benefits,1", 23100);
                if (resourceBytes != null) {
                  FullscreenCanvas.field_d[1] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("members_expansion_benefits,2", 23100);
                if (resourceBytes != null) {
                  FullscreenCanvas.field_d[2] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("members_expansion_price_top", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("members_expansion_price_bottom", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reconnect_lost_seq,0", 23100);
                if (resourceBytes != null) {
                  OpenGlBloomEffect.field_l[0] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reconnect_lost_seq,1", 23100);
                if (null != resourceBytes) {
                  OpenGlBloomEffect.field_l[1] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reconnect_lost_seq,2", 23100);
                if (resourceBytes != null) {
                  OpenGlBloomEffect.field_l[2] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reconnect_lost_seq,3", 23100);
                if (null != resourceBytes) {
                  OpenGlBloomEffect.field_l[3] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reconnect_lost", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reconnect_restored", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reconnect_please_check", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reconnect_wait", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reconnect_retry", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reconnect_resume", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reconnect_or", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reconnect_exitfs", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reconnect_exitfs_quit", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reconnect_quit", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reconnect_check_fs", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("reconnect_check_nonfs", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("fs_accept_beforeaccept", 23100);
                if (resourceBytes != null) {
                  CarouselGameClient.field_g = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("fs_button_accept", 23100);
                if (resourceBytes != null) {
                  ServerInfoFactory.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("fs_accept_afteraccept", 23100);
                if (resourceBytes != null) {
                  GetFighterBayAimspeed.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("fs_button_cancel", 23100);
                if (null != resourceBytes) {
                  GetFighterRepairAmount.field_r = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("fs_accept_aftercancel", 23100);
                if (resourceBytes != null) {
                  SetReloadBarHeight.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("fs_accept_countdown_sing", 23100);
                if (null != resourceBytes) {
                  LogoMesh.field_M = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("fs_accept_countdown_pl", 23100);
                if (null != resourceBytes) {
                  SetPhasedEnergyBeamAimspeed.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("fs_nonmember", 23100);
                if (null != resourceBytes) {
                  TextureRectangleShape.field_j = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("fs_button_close", 23100);
                if (null != resourceBytes) {
                  MissionCondition.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("fs_button_members", 23100);
                if (resourceBytes != null) {
                  GetLaserBeamProjectileDamage.field_s = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("fs_unavailable", 23100);
                if (resourceBytes != null) {
                  StripesTextureOperation.field_n = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("fs_unavailable_try_signed_applet", 23100);
            }
            void loadDisplayMembershipAndProgressTexts() throws java.lang.RuntimeException {
                if (null != resourceBytes) {
                  UiArrayContainer.field_t = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("fs_focus", 23100);
                if (null != resourceBytes) {
                  RenderResourceNode.field_m = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("fs_focus_or_resolution", 23100);
                if (null != resourceBytes) {
                  WorldFactory.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("fs_timeout", 23100);
                if (resourceBytes != null) {
                  SetFighterRepairAmount.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("fs_button_tryagain", 23100);
                if (resourceBytes != null) {
                  GetShipToShipRamDamage.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_ui_fs_countdown", 23100);
                if (null != resourceBytes) {
                  GetDebrisMax.field_r = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mb_caption_title", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mb_including_gamename", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mb_full_access_1", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mb_full_access_2", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mb_achievement_count_1", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mb_achievement_count_2", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mb_exclusive_1", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mb_exclusive_2", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("me_extra_benefits", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("hs_friend_tip", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("hs_friend_tip_multi", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("hs_mode_name,0", 23100);
                if (null != resourceBytes) {
                  BuildBlueprintOrderDefinition.field_d[0] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("hs_mode_name,1", 23100);
                if (resourceBytes != null) {
                  BuildBlueprintOrderDefinition.field_d[1] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("hs_mode_name,2", 23100);
                if (null != resourceBytes) {
                  BuildBlueprintOrderDefinition.field_d[2] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rating_mode_name,0", 23100);
                if (resourceBytes != null) {
                  GetCountermeasuresPulseRadius.field_q[0] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rating_mode_name,1", 23100);
                if (null != resourceBytes) {
                  GetCountermeasuresPulseRadius.field_q[1] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rating_mode_long_name,0", 23100);
                if (resourceBytes != null) {
                  SetTorpedoReload.field_o[0] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("rating_mode_long_name,1", 23100);
                if (resourceBytes != null) {
                  SetTorpedoReload.field_o[1] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_config_fixed_size", 23100);
                if (resourceBytes != null) {
                  SetMissilesDamageSourceTeam.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_config_resizable", 23100);
                if (resourceBytes != null) {
                  SoundCache.field_b = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_config_fullscreen", 23100);
                if (null != resourceBytes) {
                  GetPointDefenceLaserReload.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_config_done", 23100);
                if (null != resourceBytes) {
                  TextureSourceOperation.field_l = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_config_apply", 23100);
                if (null != resourceBytes) {
                  SetVariableLabelActionFactory.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_config_title", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_config_instruction", 23100);
                if (null != resourceBytes) {
                  EnvironmentMapSource.field_a = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("graphics_config_need_memory", 23100);
                if (resourceBytes != null) {
                  GetMissionVariablesHudY.field_q = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("pleasewait_dotdotdot", 23100);
                if (resourceBytes != null) {
                  SetUseModels.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("serviceunavailable", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("createtouse", 23100);
                if (null != resourceBytes) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("achievementsoffline", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("warning", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("DEFAULT_PLAYER_NAME", 23100);
                if (resourceBytes != null) {
                  SetMachineGunReload.field_o = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin1", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin2,1", 23100);
                if (null != resourceBytes) {
                  ResizableModalPanel.field_F[1] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin2,2", 23100);
                if (null != resourceBytes) {
                  ResizableModalPanel.field_F[2] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin2,3", 23100);
                if (resourceBytes != null) {
                  ResizableModalPanel.field_F[3] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin2,4", 23100);
                if (null != resourceBytes) {
                  ResizableModalPanel.field_F[4] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin2,5", 23100);
                if (resourceBytes != null) {
                  ResizableModalPanel.field_F[5] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin2,6", 23100);
                if (null != resourceBytes) {
                  ResizableModalPanel.field_F[6] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin2,7", 23100);
                if (null != resourceBytes) {
                  ResizableModalPanel.field_F[7] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin3,1", 23100);
                if (null != resourceBytes) {
                  GetBombletSprayReload.field_p[1] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin3,2", 23100);
                if (resourceBytes != null) {
                  GetBombletSprayReload.field_p[2] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin3,3", 23100);
                if (null != resourceBytes) {
                  GetBombletSprayReload.field_p[3] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin3,4", 23100);
                if (resourceBytes != null) {
                  GetBombletSprayReload.field_p[4] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin3,5", 23100);
                if (resourceBytes != null) {
                  GetBombletSprayReload.field_p[5] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin3,6", 23100);
                if (resourceBytes != null) {
                  GetBombletSprayReload.field_p[6] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin3,7", 23100);
                if (resourceBytes != null) {
                  GetBombletSprayReload.field_p[7] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("discard", 23100);
                if (null != resourceBytes) {
                  GetSniperCannonProjectileOndamageParticles.field_p = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin4,1", 23100);
                if (resourceBytes != null) {
                  ChoosePlayerNameForm.field_w[1] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin4,2", 23100);
                if (null != resourceBytes) {
                  ChoosePlayerNameForm.field_w[2] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin4,3", 23100);
                if (null != resourceBytes) {
                  ChoosePlayerNameForm.field_w[3] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin4,4", 23100);
                if (resourceBytes != null) {
                  ChoosePlayerNameForm.field_w[4] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin4,5", 23100);
                if (null != resourceBytes) {
                  ChoosePlayerNameForm.field_w[5] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin4,6", 23100);
                if (null != resourceBytes) {
                  ChoosePlayerNameForm.field_w[6] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin4,7", 23100);
                if (null != resourceBytes) {
                  ChoosePlayerNameForm.field_w[7] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin_notloggedin", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin_alternate,1", 23100);
                if (null != resourceBytes) {
                  StrongCacheReference.field_n[1] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin_alternate,2", 23100);
                if (null != resourceBytes) {
                  StrongCacheReference.field_n[2] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin_alternate,3", 23100);
                if (null != resourceBytes) {
                  StrongCacheReference.field_n[3] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin_alternate,4", 23100);
                if (null != resourceBytes) {
                  StrongCacheReference.field_n[4] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin_alternate,5", 23100);
                if (null != resourceBytes) {
                  StrongCacheReference.field_n[5] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin_alternate,6", 23100);
                if (resourceBytes != null) {
                  StrongCacheReference.field_n[6] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("mustlogin_alternate,7", 23100);
                if (null != resourceBytes) {
                  StrongCacheReference.field_n[7] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("subscription_cost_monthly,0", 23100);
                if (resourceBytes != null) {
                  GpuToolkit.field_Yb[0] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("subscription_cost_monthly,1", 23100);
                if (resourceBytes != null) {
                  GpuToolkit.field_Yb[1] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("subscription_cost_monthly,2", 23100);
                if (null != resourceBytes) {
                  GpuToolkit.field_Yb[2] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("subscription_cost_monthly,3", 23100);
                if (null != resourceBytes) {
                  GpuToolkit.field_Yb[3] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("subscription_cost_monthly,4", 23100);
                if (resourceBytes != null) {
                  GpuToolkit.field_Yb[4] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("subscription_cost_monthly,5", 23100);
                if (null != resourceBytes) {
                  GpuToolkit.field_Yb[5] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("subscription_cost_monthly,6", 23100);
                if (null != resourceBytes) {
                  GpuToolkit.field_Yb[6] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("subscription_cost_monthly,7", 23100);
                if (null != resourceBytes) {
                  GpuToolkit.field_Yb[7] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("subscription_cost_monthly,8", 23100);
                if (null != resourceBytes) {
                  GpuToolkit.field_Yb[8] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("subscription_cost_monthly,9", 23100);
                if (resourceBytes != null) {
                  GpuToolkit.field_Yb[9] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("subscription_cost_monthly,10", 23100);
                if (resourceBytes != null) {
                  GpuToolkit.field_Yb[10] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("subscription_cost_monthly,11", 23100);
                if (resourceBytes != null) {
                  GpuToolkit.field_Yb[11] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("subscription_cost_monthly,12", 23100);
                if (resourceBytes != null) {
                  GpuToolkit.field_Yb[12] = Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                resourceBytes = NetworkGameClient.loadNamedResource("sentence_separator", 23100);
                if (resourceBytes != null) {
                  Cp1252Strings.decode((byte) -125, resourceBytes);
                }
                TimingGraph.field_e = null;
            }
            void run() {
                var3 = VoidHunters.field_G;
                try {
                  loadLoginLobbyAndChatTexts();
                  if (finished) return;
                  loadAccountAndSocialTexts();
                  if (finished) return;
                  loadLoadingMenuAndQuickChatTexts();
                  if (finished) return;
                  loadDisplayMembershipAndProgressTexts();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_2596_0 = (RuntimeException) (var2_ref);
                  stackIn_2596_1 = new StringBuilder().append("dga.A(").append(obfuscationGuard).append(',');
                  if (textArchive == null) {
                    stackIn_2597_2 = "null";
                  } else {
                    stackIn_2597_2 = "{...}";
                  }
                  throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_2596_0), ((StringBuilder) (Object) stackIn_2596_1).append(stackIn_2597_2).append(')').toString());
                }
                if (GameApplet.field_g) {
                  var3++;
                  VoidHunters.field_G = var3;
                }
            }
        }
        InterfaceTextLoader decompiledBody = new InterfaceTextLoader(param0, param1);
        decompiledBody.run();
    }

    static {
    }
}
