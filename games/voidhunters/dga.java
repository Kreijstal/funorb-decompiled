/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dga {
    static boolean field_a;

    dga(int param0) {
    }

    final static void a(boolean param0, asb param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_2596_0;
            StringBuilder stackIn_2596_1;
            String stackIn_2597_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            boolean param0;
            asb param1;
            boolean finished;
            $CfrPartitionedBody(boolean initialParam0, asb initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_2596_0 = null;
                this.stackIn_2596_1 = null;
                this.stackIn_2597_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                hw.field_e = param1;
                var2 = NetworkGameClient.loadNamedResource("loginm3", 23100);
                if (null != var2) {
                  SetSalvoRepairTimeMultiplier.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("loginm2", 23100);
                if (null != var2) {
                  uv.field_f = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("loginm1", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("idlemessage20min", 23100);
                if (var2 != null) {
                  GetSpinningBladeSpindamageMultiplier.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("error_js5crc", 23100);
                if (var2 != null) {
                  GetUseFilledPolygons.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("error_js5io", 23100);
                if (null != var2) {
                  cna.field_wb = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("error_js5connect_full", 23100);
                if (null != var2) {
                  MissionControl.field_f = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("error_js5connect", 23100);
                if (var2 != null) {
                  SetDebugLineLife.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("login_gameupdated", 23100);
                if (var2 != null) {
                  RoundResult.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_unable", 23100);
                if (null != var2) {
                  owa.field_j = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_ineligible", 23100);
                if (null != var2) {
                  GetMissionTerrainAsteroidProbability.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("usernameprompt", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("passwordprompt", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("andagainprompt", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("ticketing_read", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("ticketing_ignore", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("ticketing_oneunread", 23100);
                if (var2 != null) {
                  nnb.field_d = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("ticketing_xunread", 23100);
                if (var2 != null) {
                  bva.field_g = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("ticketing_gotowebsite", 23100);
                if (null != var2) {
                  GetMassDriverProjectileDamage.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("ticketing_waitingformessages", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_on", 23100);
                if (var2 != null) {
                  GetMassDriverAimspeed.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_friends", 23100);
                if (null != var2) {
                  GetBloomCoefficientPercentage.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_off", 23100);
                if (var2 != null) {
                  gpa.field_f = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_lobby", 23100);
                if (var2 != null) {
                  bib.field_e = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_public", 23100);
                if (var2 != null) {
                  SetTabForScores.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_ignore", 23100);
                if (null != var2) {
                  RequestNewestBlackboxRecording.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_tips", 23100);
                if (null != var2) {
                  SetMassDriverAimarc.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_game", 23100);
                if (var2 != null) {
                  bd.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_private", 23100);
                if (var2 != null) {
                  GetAiRepairTime.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_x_entered_game", 23100);
                if (null != var2) {
                  DebugSendable.field_g = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_x_joined_your_game", 23100);
                if (var2 != null) {
                  dgb.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_x_entered_other_game", 23100);
                if (var2 != null) {
                  wu.field_e = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_x_left_lobby", 23100);
                if (null != var2) {
                  GetDebrisGroupColour.field_s = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_x_lost_con", 23100);
                if (null != var2) {
                  GetMassDriverProjectiles.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_x_cannot_join_full", 23100);
                if (var2 != null) {
                  fpb.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_x_cannot_join_inprogress", 23100);
                if (null != var2) {
                  btb.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_x_declined_invite", 23100);
                if (var2 != null) {
                  SetMissilesHitSourceTeam.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_x_withdrew_request", 23100);
                if (null != var2) {
                  ar.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_x_removed", 23100);
                if (null != var2) {
                  GetMinimapHeight.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_x_dropped_out", 23100);
                if (var2 != null) {
                  rv.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_entered_other_game", 23100);
                if (null != var2) {
                  GetLaserBeamProjectileDamage.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_game_is_full", 23100);
                if (null != var2) {
                  tda.field_O = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_game_has_started", 23100);
                if (var2 != null) {
                  ProceduralTexture.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_you_declined_invite", 23100);
                if (var2 != null) {
                  GetDebugLineLife.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_invite_withdrawn", 23100);
                if (var2 != null) {
                  GetAudioRangeCutoff.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_request_declined", 23100);
                if (var2 != null) {
                  GetSpinningBladeAimarc.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_request_withdrawn", 23100);
                if (null != var2) {
                  SetSniperCannonProjectileLife.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_all_players_have_left", 23100);
                if (var2 != null) {
                  GetMissionTerrainDebrisProbability.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_lobby_name", 23100);
                if (var2 != null) {
                  kpb.field_r = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_lobby_rating", 23100);
                if (null != var2) {
                  GetMessageMaxage.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_lobby_friend_add", 23100);
                if (null != var2) {
                  SetMissileLauncherEnergyUsed.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_lobby_friend_rm", 23100);
                if (var2 != null) {
                  SetDefaultFiringLeeway.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_lobby_name_add", 23100);
                if (var2 != null) {
                  SetMissilesTopSpeed.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_lobby_name_rm", 23100);
                if (null != var2) {
                  PlayerJoinFactory.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_lobby_location", 23100);
                if (null != var2) {
                  mab.field_e = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_gamelist_all_games", 23100);
                if (null != var2) {
                  SetMachineGunAimarc.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_gamelist_status", 23100);
                if (null != var2) {
                  GetLaserRandomness.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_gamelist_owner", 23100);
                if (var2 != null) {
                  lw.field_e = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_gamelist_players", 23100);
                if (null != var2) {
                  sc.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_gamelist_avg_rating", 23100);
                if (null != var2) {
                  MissionGenerationData.field_e = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_gamelist_options", 23100);
                if (var2 != null) {
                  SetTrapMouse.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_gamelist_elapsed_time", 23100);
                if (var2 != null) {
                  tea.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_play_rated", 23100);
                if (null != var2) {
                  ev.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_create_unrated", 23100);
                if (var2 != null) {
                  uab.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_options", 23100);
                if (var2 != null) {
                  mr.field_J = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_options_whocanjoin", 23100);
                if (var2 != null) {
                  GetMissionTerrainSpaceProbability.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_options_players", 23100);
                if (null != var2) {
                  uda.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_options_dontmind", 23100);
                if (var2 != null) {
                  mpb.field_k = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_options_allow_spectate", 23100);
                if (null != var2) {
                  kra.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_options_ratedgametype", 23100);
                if (var2 != null) {
                  GetMassDriverProjectileOndamageParticles.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("yes", 23100);
                if (null != var2) {
                  SettingsInstanceFactory.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("no", 23100);
                if (var2 != null) {
                  nl.field_j = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_invite_players", 23100);
                if (var2 != null) {
                  ko.field_d = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("close", 23100);
                if (var2 != null) {
                  SetCountermeasureLauncherAimarc.field_s = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("add_x_to_friends", 23100);
                if (null != var2) {
                  SetAngularForceDownshift.field_r = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("add_x_to_ignore", 23100);
                if (null != var2) {
                  uda.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rm_x_from_friends", 23100);
                if (null != var2) {
                  GetAllowShipSaving.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rm_x_from_ignore", 23100);
                if (null != var2) {
                  lu.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("send_pm_to_x", 23100);
                if (null != var2) {
                  SetSniperCannonProjectileLife.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("send_qc_to_x", 23100);
                if (var2 != null) {
                  SetMissileLauncherFireForce.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("send_pm", 23100);
                if (var2 != null) {
                  GetReadyRoomTeamTime.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("invite_accept_xs_game", 23100);
                if (null != var2) {
                  SetDebrisCollision.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("invite_decline_xs_game", 23100);
                if (null != var2) {
                  nrb.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("join_xs_game", 23100);
                if (var2 != null) {
                  ti.field_g = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("join_request_xs_game", 23100);
                if (null != var2) {
                  ue.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("join_withdraw_request_xs_game", 23100);
                if (null != var2) {
                  t.field_e = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_gameopt_kick_x_from_this_game", 23100);
                if (null != var2) {
                  GetRepairModeRadius.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_gameopt_withdraw_invite_to_x", 23100);
                if (var2 != null) {
                  ts.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_gameopt_accept_x_into_game", 23100);
                if (var2 != null) {
                  SetWaitForPlayers.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_gameopt_reject_x_from_game", 23100);
                if (var2 != null) {
                  AsteroidField.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_gameopt_invite_x_to_game", 23100);
                if (null != var2) {
                  GetSalvoHoldable.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("report_x_for_abuse", 23100);
                if (var2 != null) {
                  ona.field_l = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unable_to_send_message_password_a", 23100);
                if (var2 != null) {
                  SetCountermeasuresPulseRadius.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unable_to_send_message_password_b", 23100);
                if (null != var2) {
                  SetShieldsDamageEnergyConversion.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_lobby_show_all", 23100);
                if (null != var2) {
                  GetSniperCannonProjectileLife.field_s = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_lobby_friends_only", 23100);
                if (null != var2) {
                  vv.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_lobby_friends", 23100);
                if (var2 != null) {
                  GetMissilesHitSourceTeam.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_lobby_hide", 23100);
                if (var2 != null) {
                  tda.field_M = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_game_show_all", 23100);
                if (null != var2) {
                  SetBurstFireMaxEnergy.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_game_friends_only", 23100);
                if (var2 != null) {
                  SetMassDriverEnergyUsed.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_game_friends", 23100);
                if (var2 != null) {
                  GetPointDefenceLaserEnergyUsed.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_game_hide", 23100);
                if (var2 != null) {
                  ocb.field_j = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_pm_show_all", 23100);
                if (null != var2) {
                  SetMassDriverReload.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_pm_friends_only", 23100);
                if (null != var2) {
                  SetMissilesAcceleration.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_pm_friends", 23100);
                if (var2 != null) {
                  GetCountermeasureLauncherEnergyUsed.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mu_chat_invisible_and_silent_mode", 23100);
                if (var2 != null) {
                  SetMissionDebrisVotingChancestep.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("you_have_been_removed_from_xs_game", 23100);
                if (var2 != null) {
                  sja.field_d = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("your_rating_is_x", 23100);
                if (var2 != null) {
                  SetUseExtraBackground.field_t = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("you_are_on_x_server", 23100);
                if (var2 != null) {
                  SetVelocitySustain.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rated_game", 23100);
                if (null != var2) {
                  GetTorpedoAimspeed.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unrated_game", 23100);
                if (null != var2) {
                  dda.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rated_game_tips", 23100);
                if (var2 != null) {
                  hqb.field_j = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("searching_for_opponent_singular", 23100);
                if (null != var2) {
                  TickConditionFactory.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("searching_for_opponents_plural", 23100);
                if (var2 != null) {
                  BodyDestroyedConditionFactory.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("find_opponent_singular", 23100);
                if (var2 != null) {
                  spb.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("find_opponents_plural", 23100);
                if (null != var2) {
                  SetAudioRangeCutoff.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rated_game_tips_setup_singular", 23100);
                if (null != var2) {
                  aaa.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rated_game_tips_setup_plural", 23100);
                if (null != var2) {
                  qpa.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("waiting_to_start_hint", 23100);
                if (var2 != null) {
                  nva.field_D = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("your_game", 23100);
                if (var2 != null) {
                  GetLaserEnergyUsed.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("game_full", 23100);
                if (var2 != null) {
                  SetPhasedEnergyBeamPulsetime.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("join_requests_one", 23100);
                if (null != var2) {
                  GetBombletSprayFireForce.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("join_requests_many", 23100);
                if (null != var2) {
                  SetUseCircleOutline.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("xs_game", 23100);
                if (null != var2) {
                  wt.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("waiting_for_x_to_start_game", 23100);
                if (null != var2) {
                  DebugSendable.field_h = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("game_options_changed", 23100);
                if (var2 != null) {
                  SetPhasedEnergyBeamEnergyUsed.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("players_x_of_y", 23100);
                if (var2 != null) {
                  GetArmageddonLength.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("message_lobby", 23100);
                if (var2 != null) {
                  di.field_k = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("quickchat_lobby", 23100);
                if (null != var2) {
                  uca.field_D = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("message_game", 23100);
                if (null != var2) {
                  kia.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("message_team", 23100);
                if (null != var2) {
                  SetFighterBayAimspeed.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("quickchat_game", 23100);
                if (var2 != null) {
                  oqb.field_k = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("kick", 23100);
                if (var2 != null) {
                  GetBombletSprayRandomness.field_r = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("inviting_x", 23100);
                if (null != var2) {
                  gob.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("x_wants_to_join", 23100);
                if (var2 != null) {
                  TeamShipComponentConditionFactory.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("accept", 23100);
                if (null != var2) {
                  SetAngularForceDownshift.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reject", 23100);
                if (var2 != null) {
                  GetHealthBarWidth.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("invite", 23100);
                if (null != var2) {
                  GetGrappleDebris.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("status_concluded", 23100);
                if (null != var2) {
                  SetTorpedoAimarc.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("status_spectate", 23100);
                if (var2 != null) {
                  glb.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("status_playing", 23100);
                if (null != var2) {
                  vq.field_w = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("status_join", 23100);
                if (var2 != null) {
                  di.field_j = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("status_private", 23100);
                if (var2 != null) {
                  MouseWheelInput.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("status_full", 23100);
                if (var2 != null) {
                  wt.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("players_in_game", 23100);
                if (var2 != null) {
                  ija.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("you_are_invited_to_xs_game", 23100);
                if (null != var2) {
                  GetDebrisGroupColour.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("asking_to_join_xs_game", 23100);
                if (var2 != null) {
                  bna.field_m = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("who_can_join", 23100);
                if (null != var2) {
                  gib.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("you_can_join", 23100);
                if (null != var2) {
                  gda.field_k = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("you_can_ask_to_join", 23100);
                if (null != var2) {
                  SpawnPoint.field_f = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("you_cannot_join_in_progress", 23100);
                if (var2 != null) {
                  GetMissilesCooldown.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("you_can_spectate", 23100);
                if (var2 != null) {
                  tla.field_h = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("you_can_not_spectate", 23100);
                if (var2 != null) {
                  CarouselSystemEventFactory.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("spectate_xs_game", 23100);
                if (null != var2) {
                  GetMassDriverProjectileLife.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("hide_players_in_xs_game", 23100);
                if (null != var2) {
                  ot.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("show_players_in_xs_game", 23100);
                if (null != var2) {
                  nga.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("connecting_to_friend_server_twoline", 23100);
                if (null != var2) {
                  SetMachineGunPulsetime.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("loading", 23100);
                if (null != var2) {
                  SetFighterRepairTime.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("offline", 23100);
                if (var2 != null) {
                  SetCountermeasuresPulseRadius.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("multiconst_invite_only", 23100);
                if (null != var2) {
                  uob.field_f = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("multiconst_clan", 23100);
                if (null != var2) {
                  GetAngularForceDownshift.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("multiconst_friends", 23100);
                if (var2 != null) {
                  CarouselSlot.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("multiconst_similar_rating", 23100);
                if (null != var2) {
                  SetPointDefenceLaserProjectiles.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("multiconst_open", 23100);
                if (null != var2) {
                  GetCountermeasuresCooldown.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("no_options_available", 23100);
                if (null != var2) {
                  GetNumStars.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reportabuse", 23100);
                if (null != var2) {
                  SetShieldsDirectionalArcParticleSpeedDownshift.field_r = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("presstabtochat", 23100);
                if (var2 != null) {
                  cna.field_xb = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("pressf10toquickchat", 23100);
                if (var2 != null) {
                  bw.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("dob_chatdisabled", 23100);
                if (var2 != null) {
                  ocb.field_g = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("dob_enterforchat", 23100);
                if (null != var2) {
                  pea.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("tab_hidechattemporarily", 23100);
                if (null != var2) {
                  GetMissionTerrainVotingChancestep.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("esc_cancelprivatemessage", 23100);
                if (var2 != null) {
                  pgb.field_l = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("esc_cancelthisline", 23100);
                if (var2 != null) {
                  SetReverbWet.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("privatequickchat_from_x", 23100);
                if (var2 != null) {
                  GetLaserAimspeed.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("privatequickchat_to_x", 23100);
                if (null != var2) {
                  tia.field_G = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("privatechat_blankarea_explanation", 23100);
                if (null != var2) {
                  MissionGenerationDataFactory.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("publicchat_unavailable_ratedgame", 23100);
                if (null != var2) {
                  GetRepairModePower.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("privatechat_friend_offline", 23100);
                if (var2 != null) {
                  BodyDestroyedCondition.field_d = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("privatechat_friend_notlisted", 23100);
                if (null != var2) {
                  fab.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("chatviewscrolledup", 23100);
                if (null != var2) {
                  SetMomentOfInertiaPerpointCalcDownshift.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("thisisrunescapeclan", 23100);
                if (var2 != null) {
                  SetAutoAfkTimeout.field_r = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("thisisrunescapeclan_notowner", 23100);
                if (var2 != null) {
                  SetMissionVotes.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("runescapeclan", 23100);
                if (null != var2) {
                  GetDebrisGroupColour.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rated_membersonly", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_membersonly", 23100);
                if (null != var2) {
                  bpa.field_d = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_1moreratedgame", 23100);
                if (var2 != null) {
                  wia.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_moreratedgames", 23100);
                if (null != var2) {
                  AwardVictoryToTeamActionFactory.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_needrating", 23100);
                if (var2 != null) {
                  SetPlayerRepairTime.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_unratedonly", 23100);
                if (null != var2) {
                  GetMessageMaxage.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_notunlocked", 23100);
                if (null != var2) {
                  CarouselEventFactory.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_cannotbecombined1", 23100);
                if (var2 != null) {
                  fra.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_cannotbecombined2", 23100);
                if (null != var2) {
                  nna.field_F = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_playernotmember", 23100);
                if (null != var2) {
                  jla.field_B = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_younotmember", 23100);
                if (null != var2) {
                  aw.field_Db = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_playerneedsrating", 23100);
                if (null != var2) {
                  cp.field_j = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_youneedrating", 23100);
                if (var2 != null) {
                  GetMassDriverFireForce.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_playerneedsratedgames", 23100);
                if (null != var2) {
                  iwa.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_youneedratedgames", 23100);
                if (var2 != null) {
                  SetBots.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_playerneeds1ratedgame", 23100);
                if (null != var2) {
                  GetAllowShipSaving.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_youneed1ratedgame", 23100);
                if (var2 != null) {
                  VariableCondition.field_f = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_playerhasntunlocked", 23100);
                if (null != var2) {
                  GetKeepTeamColours.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_youhaventunlocked", 23100);
                if (var2 != null) {
                  ooa.field_zb = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_trychanging1", 23100);
                if (var2 != null) {
                  SetTorpedoProjectileLife.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_trychanging2", 23100);
                if (null != var2) {
                  SetMissilesHitSourceTeam.field_r = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_needchanging1", 23100);
                if (var2 != null) {
                  GetCountermeasureLauncherRandomness.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_needchanging2", 23100);
                if (null != var2) {
                  ComponentBehaviour.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_mightchange", 23100);
                if (var2 != null) {
                  SetMassDriverProjectileLife.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_playersdontqualify", 23100);
                if (var2 != null) {
                  kob.field_e = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_playersdontqualify_selectgametab", 23100);
                if (var2 != null) {
                  SetInnateThrusters.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_unselectedoptions", 23100);
                if (var2 != null) {
                  SetPointDefenceLaserRandomness.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_pleaseselectoption1", 23100);
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (null != var2) {
                  cp.field_g = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_pleaseselectoption2", 23100);
                if (var2 != null) {
                  SetSalvoaim.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_badnumplayers", 23100);
                if (var2 != null) {
                  ef.field_A = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_inviteplayers_or_trychanging1", 23100);
                if (null != var2) {
                  jra.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_inviteplayers_or_trychanging2", 23100);
                if (var2 != null) {
                  alb.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_novalidcombos", 23100);
                if (var2 != null) {
                  GetReloadBarWidth.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameopt_pleasetrychanging", 23100);
                if (null != var2) {
                  GetRepairModeCooldown.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("ra_title", 23100);
                if (var2 != null) {
                  hpb.field_j = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("ra_mutethisplayer", 23100);
                if (null != var2) {
                  GetPointDefenceLaserProjectiles.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("ra_suggestmute", 23100);
                if (null != var2) {
                  GetFighterBayAimarc.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("ra_intro", 23100);
                if (null != var2) {
                  GetPointDefenceLaserProjectileInterceptDamage.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("ra_intro_no_name", 23100);
                if (null != var2) {
                  GetPhysicsCollisionPhantomForceMultiplier.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("ra_explanation", 23100);
                if (var2 != null) {
                  DualLinkNode.field_j = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rule_pillar_0", 23100);
                if (var2 != null) {
                  GetGrapplingHookCooldown.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rule_0_0", 23100);
                if (var2 != null) {
                  uea.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rule_0_1", 23100);
                if (var2 != null) {
                  vqa.field_j = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rule_0_2", 23100);
                if (var2 != null) {
                  GetMachineGunAimspeed.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rule_0_3", 23100);
                if (var2 != null) {
                  SetUseExtraBackground.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rule_0_4", 23100);
                if (null != var2) {
                  rq.field_G = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rule_0_5", 23100);
                if (var2 != null) {
                  GetDebrisCarryOver.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rule_pillar_1", 23100);
                if (var2 != null) {
                  oqb.field_n = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rule_1_0", 23100);
                if (var2 != null) {
                  SetExplosionProjectileDamage.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rule_1_1", 23100);
                if (var2 != null) {
                  SetBots.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rule_1_2", 23100);
                if (var2 != null) {
                  SettingsInstance.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rule_1_3", 23100);
                if (null != var2) {
                  cfa.field_e = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rule_1_4", 23100);
                if (null != var2) {
                  GetSelfDestructTimer.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rule_pillar_2", 23100);
                if (var2 != null) {
                  SetUseOffscreenRendering.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rule_2_0", 23100);
                if (null != var2) {
                  SetKeepTeamColours.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rule_2_1", 23100);
                if (null != var2) {
                  bda.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rule_2_2", 23100);
                if (var2 != null) {
                  fk.field_d = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("createafreeaccount", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("cancel", 23100);
                if (null != var2) {
                  SetMissileLauncherProjectiles.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("pleaselogintoplay", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("pleaselogin", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("pleaselogin_member", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("invaliduserorpass", 23100);
                if (var2 != null) {
                  SetPlayerRepairAmount.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("pleasetryagain", 23100);
                if (null != var2) {
                  bbb.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("pleasereenterpass", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("playfreeversion", 23100);
                if (var2 != null) {
                  GetBombletSprayProjectileLife.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reloadgame", 23100);
                if (var2 != null) {
                  fma.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("toserverlist", 23100);
                if (null != var2) {
                  mab.field_h = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("tocustomersupport", 23100);
                if (null != var2) {
                  lia.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("changedisplayname", 23100);
                if (var2 != null) {
                  GetCountermeasureLauncherProjectileLife.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("returntohomepage", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("justplay", 23100);
                if (var2 != null) {
                  cjb.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("justplay_excl", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("login", 23100);
                if (null != var2) {
                  GetBombletSprayProjectiles.field_s = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("goback", 23100);
                if (null != var2) {
                  SetTorpedoReload.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("otheroptions", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("proceed", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("connectingtoserver", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("pleasewait", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("logging_in", 23100);
                if (null != var2) {
                  SetMissionDebrisVotingChancestep.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reconnect", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("backtoerror", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("pleasecheckinternet", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("attemptingtoreconnect", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("connectionlost_reconnecting", 23100);
                if (null != var2) {
                  SetCountermeasureLauncherEnergyUsed.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("connectionlost_withreason", 23100);
                if (var2 != null) {
                  SetPointDefenceLaserFireForce.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("passwordverificationrequired", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("invalidpass", 23100);
                if (var2 != null) {
                  GetTorqueDownshift.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("retry", 23100);
                if (var2 != null) {
                  SetSpecialOrderBoxHeight.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("back", 23100);
                if (var2 != null) {
                  ArbProgram.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("exitfullscreenmode", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("quittowebsite", 23100);
                if (null != var2) {
                  GetFighterBayAimspeed.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("connectionrestored", 23100);
                if (null != var2) {
                  GetPointDefenceLaserAimarc.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("warning_ifyouquit", 23100);
                if (null != var2) {
                  GetSpecialOrderBoxHeight.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("warning_ifyouquitorleavepage", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("resubscribe_withoutlosing_fs", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("resubscribe_withoutlosing", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("customersupport_withoutlosing_fs", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("customersupport_withoutlosing", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("js5help_withoutlosing_fs", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("js5help_withoutlosing", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("checkinternet_withoutlosing_fs", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("checkinternet_withoutlosing", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_intro", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_sameaccounttip_unnamed", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("dateofbirthprompt", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("fetchingcountrylist", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("countryprompt", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("countrylisterror", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("theonlypersonalquestions", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_submittingdata", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("check", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_pleasechooseausername", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_usernameblurb", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("checkingavailability", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("checking", 23100);
                if (null != var2) {
                  nga.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_namealreadytaken", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_sameaccounttip_named", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_nosuggestions", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alternativelygoback", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_available", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_willnowshowtermsandconditions", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("fetchingterms", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("termserror", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_iagree", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_idisagree", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_pleasescrolldowntoaccept", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_linkaddress", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("openinpopupwindow", 23100);
                if (var2 != null) {
                  SetBombletSprayProjectileDamage.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create", 23100);
                if (null != var2) {
                  SettingsChange.field_d = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_pleasechooseapassword", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_passwordblurb", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_nevergivepassword", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("creatingyouraccount", 23100);
                if (var2 != null) {
                  CommonGameState.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_youmustaccept", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_passwordsdifferent", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_success", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("day", 23100);
                if (null != var2) {
                  GetReadyRoomMissionTime.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("month", 23100);
                if (null != var2) {
                  GetBombletSprayAimspeed.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("year", 23100);
                if (null != var2) {
                  GetMissileLauncherRandomness.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("monthnames,0", 23100);
                if (var2 != null) {
                  GetSniperCannonAimspeed.field_r[0] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("monthnames,1", 23100);
                if (null != var2) {
                  GetSniperCannonAimspeed.field_r[1] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("monthnames,2", 23100);
                if (null != var2) {
                  GetSniperCannonAimspeed.field_r[2] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("monthnames,3", 23100);
                if (var2 != null) {
                  GetSniperCannonAimspeed.field_r[3] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("monthnames,4", 23100);
                if (var2 != null) {
                  GetSniperCannonAimspeed.field_r[4] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("monthnames,5", 23100);
                if (var2 != null) {
                  GetSniperCannonAimspeed.field_r[5] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("monthnames,6", 23100);
                if (null != var2) {
                  GetSniperCannonAimspeed.field_r[6] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("monthnames,7", 23100);
                if (null != var2) {
                  GetSniperCannonAimspeed.field_r[7] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("monthnames,8", 23100);
                if (var2 != null) {
                  GetSniperCannonAimspeed.field_r[8] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("monthnames,9", 23100);
                if (var2 != null) {
                  GetSniperCannonAimspeed.field_r[9] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("monthnames,10", 23100);
                if (null != var2) {
                  GetSniperCannonAimspeed.field_r[10] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("monthnames,11", 23100);
                if (var2 != null) {
                  GetSniperCannonAimspeed.field_r[11] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_welcome", 23100);
                if (null != var2) {
                  NebulaFactory.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_u13_welcome", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_createanaccount", 23100);
                if (null != var2) {
                  TimedSpecialOrderBehaviour.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_username", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_displayname", 23100);
                if (null != var2) {
                  ffb.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_password", 23100);
                if (var2 != null) {
                  RequestNewestBlackboxRecording.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_password_confirm", 23100);
                if (null != var2) {
                  lg.field_d = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_email", 23100);
                if (null != var2) {
                  MissionState.field_h = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_email_confirm", 23100);
                if (null != var2) {
                  qs.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_age", 23100);
                if (null != var2) {
                  CarouselSystemEventFactory.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_u13_email", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_u13_email_confirm", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_dob", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_country", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alternatives_header", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alternatives_select", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_suggestions", 23100);
                if (var2 != null) {
                  SetShipTeamAction.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_more_suggestions", 23100);
                if (null != var2) {
                  GetPointDefenceLaserRandomness.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_select_alternative", 23100);
                if (var2 != null) {
                  nv.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_optin_news", 23100);
                if (null != var2) {
                  shb.field_m = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_agreeterms", 23100);
                if (var2 != null) {
                  GetLaserProjectiles.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_u13terms", 23100);
                if (var2 != null) {
                  SetCountermeasuresPulsetime.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("login_username_email", 23100);
                if (var2 != null) {
                  RemoveEventActionFactory.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("login_username", 23100);
                if (var2 != null) {
                  SetSpinningBladeTopSpeed.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("login_email", 23100);
                if (null != var2) {
                  fj.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("login_username_tooltip", 23100);
                if (var2 != null) {
                  sja.field_j = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("login_password_tooltip", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("login_login_tooltip", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("login_create_tooltip", 23100);
                if (var2 != null) {
                  AdjustBodyComponentsAction.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("login_justplay_tooltip", 23100);
                if (null != var2) {
                  dqa.field_u = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("login_back_tooltip", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("login_no_displayname", 23100);
                if (var2 != null) {
                  waa.field_y = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_username_tooltip", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_username_hint", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_displayname_tooltip", 23100);
                if (var2 != null) {
                  gna.field_m = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_displayname_hint", 23100);
                if (var2 != null) {
                  Projectile.field_r = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_password_tooltip", 23100);
                if (var2 != null) {
                  sha.field_x = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_password_hint", 23100);
                if (null != var2) {
                  mmb.field_e = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_password_confirm_tooltip", 23100);
                if (var2 != null) {
                  SetAngularForceDownshift.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_email_tooltip", 23100);
                if (null != var2) {
                  GetPointDefenceLaserProjectileInterceptDamage.field_s = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_email_confirm_tooltip", 23100);
                if (var2 != null) {
                  dj.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_age_tooltip", 23100);
                if (var2 != null) {
                  lq.field_j = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_optin_news_tooltip", 23100);
                if (null != var2) {
                  jv.field_f = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_u13_email_tooltip", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_u13_email_confirm_tooltip", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_dob_tooltip", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_country_tooltip", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_optin_tooltip", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_continue", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_username_unavailable", 23100);
                if (null != var2) {
                  GetLaserReload.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_username_available", 23100);
                if (null != var2) {
                  uc.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alert_namelength", 23100);
                if (var2 != null) {
                  GetInnateThrusters.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alert_namechars", 23100);
                if (null != var2) {
                  SetUseExtraBackground.field_u = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alert_nameleadingspace", 23100);
                if (null != var2) {
                  ArmBehaviour.field_d = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alert_doublespace", 23100);
                if (null != var2) {
                  ServerInfoFactory.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alert_passchars", 23100);
                if (null != var2) {
                  GetThrusterParticleSpeedDownshift.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alert_passrepeated", 23100);
                if (null != var2) {
                  qab.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alert_passlength", 23100);
                if (null != var2) {
                  SetShipDirectionArrow.field_r = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alert_passcontainsname", 23100);
                if (null != var2) {
                  GetShieldsDirectionalArc.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alert_passcontainsemail", 23100);
                if (null != var2) {
                  gnb.field_f = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alert_passcontainsname_partial", 23100);
                if (var2 != null) {
                  SetBombletSprayProjectileLife.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alert_checkname", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alert_invalidemail", 23100);
                if (null != var2) {
                  EscapePod.field_m = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alert_email_unavailable", 23100);
                if (var2 != null) {
                  qh.field_N = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alert_invaliddate", 23100);
                if (null != var2) {
                  GetUseRectFill.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alert_invalidage", 23100);
                if (null != var2) {
                  SetSniperCannonProjectiles.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alert_yearrange", 23100);
                if (null != var2) {
                  ComponentBehaviourFactory.field_d = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_alert_mismatch", 23100);
                if (null != var2) {
                  lmb.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_passwordvalid", 23100);
                if (var2 != null) {
                  SetGrapplingHookMaxLength.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_emailvalid", 23100);
                if (null != var2) {
                  bqa.field_f = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("create_account_success", 23100);
                if (var2 != null) {
                  uj.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("invalid_name", 23100);
                if (null != var2) {
                  tjb.field_Cb = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("cannot_add_yourself", 23100);
                if (var2 != null) {
                  GetUsePolygonFill.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unable_to_add_friend", 23100);
                if (var2 != null) {
                  GetReverbWet.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unable_to_add_ignore", 23100);
                if (null != var2) {
                  SetSniperCannonProjectileOndamageParticles.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unable_to_delete_friend", 23100);
                if (null != var2) {
                  ei.field_e = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unable_to_delete_ignore", 23100);
                if (var2 != null) {
                  CarouselPlayerEventFactory.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("friendlistfull", 23100);
                if (var2 != null) {
                  GetRepairModeCooldown.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("friendlistdupe", 23100);
                if (var2 != null) {
                  dfa.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("friendnotfound", 23100);
                if (null != var2) {
                  SetSniperCannonAimarc.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("ignorelistfull", 23100);
                if (var2 != null) {
                  GetBombletSprayAimarc.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("ignorelistdupe", 23100);
                if (var2 != null) {
                  vjb.field_c = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("ignorenotfound", 23100);
                if (var2 != null) {
                  mr.field_L = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("removeignorefirst", 23100);
                if (var2 != null) {
                  mn.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("removefriendfirst", 23100);
                if (null != var2) {
                  GetLaserAimarc.field_r = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("enterfriend_add", 23100);
                if (var2 != null) {
                  hk.field_i = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("enterfriend_del", 23100);
                if (var2 != null) {
                  MissionEvent.field_e = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("enterignore_add", 23100);
                if (null != var2) {
                  mw.field_d = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("enterignore_del", 23100);
                if (null != var2) {
                  GetUseNiceTrails.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("text_removed_from_game", 23100);
                if (null != var2) {
                  GetMissilesDamageSourceTeam.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("text_lobby_pleaselogin_free", 23100);
                if (var2 != null) {
                  wc.field_d = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("opengl", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("sse", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("purejava", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("waitingfor_graphics", 23100);
                if (null != var2) {
                  SetTorpedoProjectileOndamageParticles.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("waitingfor_models", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("waitingfor_fonts", 23100);
            }
            void runChunk2() throws java.lang.RuntimeException {
                if (null != var2) {
                  wqb.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("waitingfor_soundeffects", 23100);
                if (null != var2) {
                  SetRepairModePower.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("waitingfor_music", 23100);
                if (var2 != null) {
                  CarouselSlotFactory.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("waitingfor_instruments", 23100);
                if (var2 != null) {
                  GetMissilesCooldown.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("waitingfor_levels", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("waitingfor_extradata", 23100);
                if (null != var2) {
                  SetUseLines.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("waitingfor_languages", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("waitingfor_textures", 23100);
                if (null != var2) {
                  koa.field_k = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("waitingfor_animations", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("loading_graphics", 23100);
                if (null != var2) {
                  drb.field_k = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("loading_models", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("loading_fonts", 23100);
                if (var2 != null) {
                  GetBombletSprayAimarc.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("loading_soundeffects", 23100);
                if (null != var2) {
                  LoadBlackboxRecording.field_r = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("loading_music", 23100);
                if (var2 != null) {
                  GetBombletSprayProjectiles.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("loading_instruments", 23100);
                if (var2 != null) {
                  ttb.field_z = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("loading_levels", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("loading_extradata", 23100);
                if (null != var2) {
                  lwa.field_vb = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("loading_languages", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("loading_textures", 23100);
                if (var2 != null) {
                  GetThrusterParticleSpeedDownshift.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("loading_animations", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unpacking_graphics", 23100);
                if (null != var2) {
                  SetAutozoomSpeedDivide.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unpacking_models", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unpacking_soundeffects", 23100);
                if (var2 != null) {
                  bva.field_e = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unpacking_music", 23100);
                if (var2 != null) {
                  GetBloomCoefficientPercentage.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unpacking_levels", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unpacking_languages", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unpacking_animations", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unpacking_toolkit", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("instructions", 23100);
                if (var2 != null) {
                  SetMissilesExplosionPower.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("tutorial", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("playtutorial", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("sound_colon", 23100);
                if (null != var2) {
                  ujb.field_d = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("music_colon", 23100);
                if (var2 != null) {
                  fpa.field_d = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("fullscreen", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("screensize", 23100);
                if (var2 != null) {
                  DebugRequest.field_j = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("highscores", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rankings", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("achievements", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("achievementsthisgame", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("achievementsthissession", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("watchintroduction", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("quit", 23100);
                if (var2 != null) {
                  SetBombletSprayRandomness.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("login_createaccount", 23100);
                if (null != var2) {
                  GetFightersPerPlayerMaximum.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("tohighscores", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("returntomainmenu", 23100);
                if (var2 != null) {
                  bw.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("returntopausemenu", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("returntooptionsmenu_notpaused", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mainmenu", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("pausemenu", 23100);
                if (null != var2) {
                  SetSalvoaim.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("optionsmenu_notpaused", 23100);
                if (var2 != null) {
                  SetMessageFadetime.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("menu", 23100);
                if (null != var2) {
                  ffb.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("selectlevel", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("nextlevel", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("startgame", 23100);
                if (var2 != null) {
                  GetPhasedEnergyBeamAimspeed.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("newgame", 23100);
                if (var2 != null) {
                  SetMessageMax.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("resumegame", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("resumetutorial", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("skip", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("skiptutorial", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("skipending", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("restartlevel", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("endtest", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("endgame", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("endtutorial", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("ok", 23100);
                if (null != var2) {
                  tia.field_K = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("on", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("off", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("previous", 23100);
                if (null != var2) {
                  SetUseLines.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("prev", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("next", 23100);
                if (var2 != null) {
                  ita.field_D = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_colon", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("hotseatmultiplayer", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("entermultiplayerlobby", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("singleplayergame", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("returntogame", 23100);
                if (var2 != null) {
                  nna.field_D = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("endgameresign", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("offerdraw", 23100);
                if (null != var2) {
                  PacketBuffer.field_f = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("canceldraw", 23100);
                if (var2 != null) {
                  ut.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("acceptdraw", 23100);
                if (null != var2) {
                  SetShipDirectionArrow.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("resign", 23100);
                if (var2 != null) {
                  fma.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("returntolobby", 23100);
                if (var2 != null) {
                  tua.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("cont", 23100);
                if (null != var2) {
                  tn.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("continue_spectating", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("messages", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_fastest", 23100);
                if (var2 != null) {
                  PlayerVote.field_d = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_medium", 23100);
                if (var2 != null) {
                  SetMissileLauncherAimspeed.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_best", 23100);
                if (var2 != null) {
                  MatchResultsFactory.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_directx", 23100);
                if (null != var2) {
                  GetDebrisMax.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_opengl", 23100);
                if (null != var2) {
                  ot.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_java", 23100);
                if (var2 != null) {
                  kja.field_C = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_quality_high", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_quality_low", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_mode", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_quality", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mode", 23100);
                if (null != var2) {
                  MissionEvent.field_f = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("quality", 23100);
                if (null != var2) {
                  llb.field_V = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("keys", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("objective", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("currentobjective", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("pressescforpausemenu", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("pressescforpausemenuortoskiptutorial", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("pressescforoptionsmenu_doesntpause", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("pressescforoptionsmenu_doesntpause_short", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("powerups", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("latestlevel_suffix", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unreachedlevel_name", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                if (!param0) {
                  field_a = true;
                }
                var2 = NetworkGameClient.loadNamedResource("unreachedlevel_cannotplayreason", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unreachedlevel_cannotplayreason_shorter", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unreachedworld_cannotplayreason", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("memberslevel_name", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("memberslevel_cannotplayreason", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("membersworld_cannotplayreason", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unreachedlevel_createtip", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unreachedlevel_createtip_line1", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unreachedlevel_createtip_line2", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("unreachedlevel_logintip", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("memberslevel_logintip", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("displayname_none", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("levelxofy1", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("levelxofy2", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("levelxofy", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("ingame_level", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mouseoveranicon", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("notyetachieved", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("achieved", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("orbpoints", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("orbcoins", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("orbpoints_colon", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("orbcoins_colon", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("achieved_colon_description", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("secretachievement", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("no_highscores", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("hs_name", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("hs_level", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("hs_fromlevel", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("hs_tolevel", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("hs_score", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("hs_end", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("ingame_score", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("score_colon", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_leavegame", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_offerrematch", 23100);
                if (null != var2) {
                  ffb.field_d = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_offerrematch_unrated", 23100);
                if (null != var2) {
                  eua.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_acceptrematch", 23100);
                if (var2 != null) {
                  SetBlueprintSaveTime.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_acceptrematch_unrated", 23100);
                if (var2 != null) {
                  gdb.field_d = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_cancelrematch", 23100);
                if (null != var2) {
                  GetMachineGunAimarc.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_cancelrematch_unrated", 23100);
                if (var2 != null) {
                  csa.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_rematchnewgame", 23100);
                if (null != var2) {
                  SettingsChangeFactory.field_d = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_rematchnewgame_unrated", 23100);
                if (var2 != null) {
                  pva.field_e = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_x_wantstodraw", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_x_offersrematch", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_x_offersrematch_unrated", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_youofferrematch", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_youofferrematch_unrated", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_youofferdraw", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_youresigned", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_youresigned_rematch", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_x_hasresignedandleft", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_x_hasresigned_rematch", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_x_hasresigned", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_x_hasleft", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_x_haswon", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_youhavewon", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_gamedrawn", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_timeremaining", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_x_turn", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_yourturn", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("gameover", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_hidechat", 23100);
                if (null != var2) {
                  ita.field_A = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_showchat_nounread", 23100);
                if (var2 != null) {
                  VariableConditionFactory.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_showchat_unread1", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mp_showchat_unread2", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("click_to_quickchat", 23100);
                if (null != var2) {
                  vq.field_y = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("autorespond", 23100);
                if (var2 != null) {
                  SetMachineGunFireForce.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("quickchat_help", 23100);
                if (null != var2) {
                  SetPhasedEnergyBeamEnergyUsed.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("quickchat_help_title", 23100);
                if (var2 != null) {
                  kw.field_Jb = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("quickchat_shortcut_help,0", 23100);
                if (null != var2) {
                  Lo.field_q[0] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("quickchat_shortcut_help,1", 23100);
                if (null != var2) {
                  Lo.field_q[1] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("quickchat_shortcut_help,2", 23100);
                if (null != var2) {
                  Lo.field_q[2] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("quickchat_shortcut_help,3", 23100);
                if (var2 != null) {
                  Lo.field_q[3] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("quickchat_shortcut_help,4", 23100);
                if (null != var2) {
                  Lo.field_q[4] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("quickchat_shortcut_help,5", 23100);
                if (null != var2) {
                  Lo.field_q[5] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("quickchat_shortcut_keys,0", 23100);
                if (var2 != null) {
                  GetKeepTeamColours.field_r[0] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("quickchat_shortcut_keys,1", 23100);
                if (var2 != null) {
                  GetKeepTeamColours.field_r[1] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("quickchat_shortcut_keys,2", 23100);
                if (var2 != null) {
                  GetKeepTeamColours.field_r[2] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("quickchat_shortcut_keys,3", 23100);
                if (null != var2) {
                  GetKeepTeamColours.field_r[3] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("quickchat_shortcut_keys,4", 23100);
                if (null != var2) {
                  GetKeepTeamColours.field_r[4] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("quickchat_shortcut_keys,5", 23100);
                if (var2 != null) {
                  GetKeepTeamColours.field_r[5] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("keychar_the_character_under_questionmark", 23100);
                if (var2 != null) {
                  ttb.field_B = GetMassDriverEnergyUsed.a(var2[0], 76);
                }
                var2 = NetworkGameClient.loadNamedResource("rating_noratings", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rating_rating", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rating_played", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rating_won", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rating_lost", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rating_drawn", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("benefits_fullscreen", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("benefits_noadverts", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("benefits_price", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("members_expansion_benefits,0", 23100);
                if (var2 != null) {
                  ufb.field_d[0] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("members_expansion_benefits,1", 23100);
                if (var2 != null) {
                  ufb.field_d[1] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("members_expansion_benefits,2", 23100);
                if (var2 != null) {
                  ufb.field_d[2] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("members_expansion_price_top", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("members_expansion_price_bottom", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reconnect_lost_seq,0", 23100);
                if (var2 != null) {
                  mpb.field_l[0] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reconnect_lost_seq,1", 23100);
                if (null != var2) {
                  mpb.field_l[1] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reconnect_lost_seq,2", 23100);
                if (var2 != null) {
                  mpb.field_l[2] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reconnect_lost_seq,3", 23100);
                if (null != var2) {
                  mpb.field_l[3] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reconnect_lost", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reconnect_restored", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reconnect_please_check", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reconnect_wait", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reconnect_retry", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reconnect_resume", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reconnect_or", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reconnect_exitfs", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reconnect_exitfs_quit", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reconnect_quit", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reconnect_check_fs", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("reconnect_check_nonfs", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("fs_accept_beforeaccept", 23100);
                if (var2 != null) {
                  kda.field_g = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("fs_button_accept", 23100);
                if (var2 != null) {
                  ServerInfoFactory.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("fs_accept_afteraccept", 23100);
                if (var2 != null) {
                  GetFighterBayAimspeed.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("fs_button_cancel", 23100);
                if (null != var2) {
                  GetFighterRepairAmount.field_r = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("fs_accept_aftercancel", 23100);
                if (var2 != null) {
                  SetReloadBarHeight.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("fs_accept_countdown_sing", 23100);
                if (null != var2) {
                  wma.field_M = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("fs_accept_countdown_pl", 23100);
                if (null != var2) {
                  SetPhasedEnergyBeamAimspeed.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("fs_nonmember", 23100);
                if (null != var2) {
                  dib.field_j = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("fs_button_close", 23100);
                if (null != var2) {
                  MissionCondition.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("fs_button_members", 23100);
                if (var2 != null) {
                  GetLaserBeamProjectileDamage.field_s = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("fs_unavailable", 23100);
                if (var2 != null) {
                  moa.field_n = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("fs_unavailable_try_signed_applet", 23100);
            }
            void runChunk3() throws java.lang.RuntimeException {
                if (null != var2) {
                  oda.field_t = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("fs_focus", 23100);
                if (null != var2) {
                  r.field_m = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("fs_focus_or_resolution", 23100);
                if (null != var2) {
                  WorldFactory.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("fs_timeout", 23100);
                if (var2 != null) {
                  SetFighterRepairAmount.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("fs_button_tryagain", 23100);
                if (var2 != null) {
                  GetShipToShipRamDamage.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_ui_fs_countdown", 23100);
                if (null != var2) {
                  GetDebrisMax.field_r = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mb_caption_title", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mb_including_gamename", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mb_full_access_1", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mb_full_access_2", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mb_achievement_count_1", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mb_achievement_count_2", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mb_exclusive_1", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mb_exclusive_2", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("me_extra_benefits", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("hs_friend_tip", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("hs_friend_tip_multi", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("hs_mode_name,0", 23100);
                if (null != var2) {
                  hka.field_d[0] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("hs_mode_name,1", 23100);
                if (var2 != null) {
                  hka.field_d[1] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("hs_mode_name,2", 23100);
                if (null != var2) {
                  hka.field_d[2] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rating_mode_name,0", 23100);
                if (var2 != null) {
                  GetCountermeasuresPulseRadius.field_q[0] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rating_mode_name,1", 23100);
                if (null != var2) {
                  GetCountermeasuresPulseRadius.field_q[1] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rating_mode_long_name,0", 23100);
                if (var2 != null) {
                  SetTorpedoReload.field_o[0] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("rating_mode_long_name,1", 23100);
                if (var2 != null) {
                  SetTorpedoReload.field_o[1] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_config_fixed_size", 23100);
                if (var2 != null) {
                  SetMissilesDamageSourceTeam.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_config_resizable", 23100);
                if (var2 != null) {
                  bmb.field_b = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_config_fullscreen", 23100);
                if (null != var2) {
                  GetPointDefenceLaserReload.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_config_done", 23100);
                if (null != var2) {
                  wv.field_l = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_config_apply", 23100);
                if (null != var2) {
                  SetVariableLabelActionFactory.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_config_title", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_config_instruction", 23100);
                if (null != var2) {
                  bkb.field_a = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("graphics_config_need_memory", 23100);
                if (var2 != null) {
                  GetMissionVariablesHudY.field_q = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("pleasewait_dotdotdot", 23100);
                if (var2 != null) {
                  SetUseModels.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("serviceunavailable", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("createtouse", 23100);
                if (null != var2) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("achievementsoffline", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("warning", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("DEFAULT_PLAYER_NAME", 23100);
                if (var2 != null) {
                  SetMachineGunReload.field_o = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin1", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin2,1", 23100);
                if (null != var2) {
                  iw.field_F[1] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin2,2", 23100);
                if (null != var2) {
                  iw.field_F[2] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin2,3", 23100);
                if (var2 != null) {
                  iw.field_F[3] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin2,4", 23100);
                if (null != var2) {
                  iw.field_F[4] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin2,5", 23100);
                if (var2 != null) {
                  iw.field_F[5] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin2,6", 23100);
                if (null != var2) {
                  iw.field_F[6] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin2,7", 23100);
                if (null != var2) {
                  iw.field_F[7] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin3,1", 23100);
                if (null != var2) {
                  GetBombletSprayReload.field_p[1] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin3,2", 23100);
                if (var2 != null) {
                  GetBombletSprayReload.field_p[2] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin3,3", 23100);
                if (null != var2) {
                  GetBombletSprayReload.field_p[3] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin3,4", 23100);
                if (var2 != null) {
                  GetBombletSprayReload.field_p[4] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin3,5", 23100);
                if (var2 != null) {
                  GetBombletSprayReload.field_p[5] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin3,6", 23100);
                if (var2 != null) {
                  GetBombletSprayReload.field_p[6] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin3,7", 23100);
                if (var2 != null) {
                  GetBombletSprayReload.field_p[7] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("discard", 23100);
                if (null != var2) {
                  GetSniperCannonProjectileOndamageParticles.field_p = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin4,1", 23100);
                if (var2 != null) {
                  waa.field_w[1] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin4,2", 23100);
                if (null != var2) {
                  waa.field_w[2] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin4,3", 23100);
                if (null != var2) {
                  waa.field_w[3] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin4,4", 23100);
                if (var2 != null) {
                  waa.field_w[4] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin4,5", 23100);
                if (null != var2) {
                  waa.field_w[5] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin4,6", 23100);
                if (null != var2) {
                  waa.field_w[6] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin4,7", 23100);
                if (null != var2) {
                  waa.field_w[7] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin_notloggedin", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin_alternate,1", 23100);
                if (null != var2) {
                  ska.field_n[1] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin_alternate,2", 23100);
                if (null != var2) {
                  ska.field_n[2] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin_alternate,3", 23100);
                if (null != var2) {
                  ska.field_n[3] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin_alternate,4", 23100);
                if (null != var2) {
                  ska.field_n[4] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin_alternate,5", 23100);
                if (null != var2) {
                  ska.field_n[5] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin_alternate,6", 23100);
                if (var2 != null) {
                  ska.field_n[6] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("mustlogin_alternate,7", 23100);
                if (null != var2) {
                  ska.field_n[7] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("subscription_cost_monthly,0", 23100);
                if (var2 != null) {
                  GpuToolkit.field_Yb[0] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("subscription_cost_monthly,1", 23100);
                if (var2 != null) {
                  GpuToolkit.field_Yb[1] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("subscription_cost_monthly,2", 23100);
                if (null != var2) {
                  GpuToolkit.field_Yb[2] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("subscription_cost_monthly,3", 23100);
                if (null != var2) {
                  GpuToolkit.field_Yb[3] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("subscription_cost_monthly,4", 23100);
                if (var2 != null) {
                  GpuToolkit.field_Yb[4] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("subscription_cost_monthly,5", 23100);
                if (null != var2) {
                  GpuToolkit.field_Yb[5] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("subscription_cost_monthly,6", 23100);
                if (null != var2) {
                  GpuToolkit.field_Yb[6] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("subscription_cost_monthly,7", 23100);
                if (null != var2) {
                  GpuToolkit.field_Yb[7] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("subscription_cost_monthly,8", 23100);
                if (null != var2) {
                  GpuToolkit.field_Yb[8] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("subscription_cost_monthly,9", 23100);
                if (var2 != null) {
                  GpuToolkit.field_Yb[9] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("subscription_cost_monthly,10", 23100);
                if (var2 != null) {
                  GpuToolkit.field_Yb[10] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("subscription_cost_monthly,11", 23100);
                if (var2 != null) {
                  GpuToolkit.field_Yb[11] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("subscription_cost_monthly,12", 23100);
                if (var2 != null) {
                  GpuToolkit.field_Yb[12] = qpa.a((byte) -125, var2);
                }
                var2 = NetworkGameClient.loadNamedResource("sentence_separator", 23100);
                if (var2 != null) {
                  qpa.a((byte) -125, var2);
                }
                hw.field_e = null;
            }
            void run() {
                var3 = VoidHunters.field_G;
                try {
                  runChunk0();
                  if (finished) return;
                  runChunk1();
                  if (finished) return;
                  runChunk2();
                  if (finished) return;
                  runChunk3();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_2596_0 = (RuntimeException) (var2_ref);
                  stackIn_2596_1 = new StringBuilder().append("dga.A(").append(param0).append(',');
                  if (param1 == null) {
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
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    static {
    }
}
