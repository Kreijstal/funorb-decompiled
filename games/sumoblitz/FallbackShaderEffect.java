/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FallbackShaderEffect extends ShaderEffect {
    static String field_g;
    static SpriteData[] field_h;
    static String field_f;
    static IntrusiveDeque sceneryParticles;

    final void setParameters(int guard, int parameters1, int parameters0) {
        try {
          if (guard != 34023) {
            FallbackShaderEffect.createBeveledPanelSprites(-3, -84, 61, -17, 112);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ni.F(" + guard + ',' + parameters1 + ',' + parameters0 + ')');
        }
    }

    final void bindTexture(int combineMode, int guard, GpuTexture texture) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.toolkit.bindTexture(texture, guard - 18711);
          if (guard != 18834) {
            FallbackShaderEffect.d(true);
          }
          this.toolkit.setTextureCombineMode(74, combineMode);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ni.E(").append(combineMode).append(',').append(guard).append(',');
          if (texture == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    FallbackShaderEffect(HardwareGraphicsToolkit owner) {
        super(owner);
    }

    final void disable(boolean guard) {
        try {
          if (guard) {
            this.disable(false);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ni.D(" + guard + ')');
        }
    }

    final static void a(int param0, ResourceArchive param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_2612_0;
            StringBuilder stackIn_2612_1;
            String stackIn_2613_2;
            boolean stackIn_2621_0;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int param0;
            ResourceArchive param1;
            boolean finished;
            $CfrPartitionedBody(int initialParam0, ResourceArchive initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_2612_0 = null;
                this.stackIn_2612_1 = null;
                this.stackIn_2613_2 = null;
                this.stackIn_2621_0 = false;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                ToolkitRasterBuffer.field_q = param1;
                var2 = OpenGlCubeTexture.fetchNamedAsset("loginm3", (byte) -23);
                if (var2 != null) {
                  HotspotTextWidget.connectionTimedOutPleaseText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("loginm2", (byte) -23);
                if (var2 != null) {
                  GridWidgetContainer.errorConnectingToServerText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("loginm1", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("idlemessage20min", (byte) -23);
                if (var2 != null) {
                  NoiseSliceGenerator.weClosedTheConnectionText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("error_js5crc", (byte) -23);
                if (null != var2) {
                  LevelCompletionSupport.field_a = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("error_js5io", (byte) -23);
                if (null != var2) {
                  ServerIntArrayRequest.field_n = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("error_js5connect_full", (byte) -23);
                if (var2 != null) {
                  ValidationMessageWidget.dataServerFullOrText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("error_js5connect", (byte) -23);
                if (null != var2) {
                  ArrayWidgetContainer.unableToConnectToText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("login_gameupdated", (byte) -23);
                if (var2 != null) {
                  TextHotspot.thisGameHasBeenText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_unable", (byte) -23);
                if (null != var2) {
                  DisplayModeConfirmationDialog.unfortunatelyWeAreUnableText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_ineligible", (byte) -23);
                if (null != var2) {
                  HudMessageSupport.unfortunatelyYouAreNotText = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("usernameprompt", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("passwordprompt", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("andagainprompt", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("ticketing_read", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("ticketing_ignore", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("ticketing_oneunread", (byte) -23);
                if (var2 != null) {
                  FullscreenMembershipDialog.youHave1UnreadText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("ticketing_xunread", (byte) -23);
                if (var2 != null) {
                  LruNodeCache.youHaveUnreadMessagesText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("ticketing_gotowebsite", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlEnvironmentWaterEffect.visitTheAccountManagementText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("ticketing_waitingformessages", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_on", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_friends", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_off", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_lobby", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_public", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_ignore", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_tips", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_private", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_x_entered_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_x_joined_your_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_x_entered_other_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_x_left_lobby", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_x_lost_con", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_x_cannot_join_full", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_x_cannot_join_inprogress", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_x_declined_invite", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_x_withdrew_request", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_x_removed", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_x_dropped_out", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_entered_other_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_game_is_full", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_game_has_started", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_you_declined_invite", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_invite_withdrawn", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_request_declined", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_request_withdrawn", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_all_players_have_left", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_lobby_name", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_lobby_rating", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_lobby_friend_add", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_lobby_friend_rm", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_lobby_name_add", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_lobby_name_rm", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_lobby_location", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_gamelist_all_games", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_gamelist_status", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_gamelist_owner", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_gamelist_players", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_gamelist_avg_rating", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_gamelist_options", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_gamelist_elapsed_time", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_play_rated", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_create_unrated", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_options", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_options_whocanjoin", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_options_players", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_options_dontmind", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_options_allow_spectate", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_options_ratedgametype", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("yes", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("no", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_invite_players", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("close", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("add_x_to_friends", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("add_x_to_ignore", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rm_x_from_friends", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rm_x_from_ignore", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("send_pm_to_x", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("send_qc_to_x", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("send_pm", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("invite_accept_xs_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("invite_decline_xs_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("join_xs_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("join_request_xs_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("join_withdraw_request_xs_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_gameopt_kick_x_from_this_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_gameopt_withdraw_invite_to_x", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_gameopt_accept_x_into_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_gameopt_reject_x_from_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_gameopt_invite_x_to_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("report_x_for_abuse", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unable_to_send_message_password_a", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unable_to_send_message_password_b", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_lobby_show_all", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_lobby_friends_only", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_lobby_friends", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_lobby_hide", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_game_show_all", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_game_friends_only", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_game_friends", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_game_hide", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_pm_show_all", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_pm_friends_only", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_pm_friends", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mu_chat_invisible_and_silent_mode", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("you_have_been_removed_from_xs_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("your_rating_is_x", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("you_are_on_x_server", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rated_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unrated_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rated_game_tips", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("searching_for_opponent_singular", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("searching_for_opponents_plural", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("find_opponent_singular", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("find_opponents_plural", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rated_game_tips_setup_singular", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rated_game_tips_setup_plural", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("waiting_to_start_hint", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("your_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("game_full", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("join_requests_one", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("join_requests_many", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("xs_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("waiting_for_x_to_start_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("game_options_changed", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("players_x_of_y", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("message_lobby", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("quickchat_lobby", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("message_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("message_team", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("quickchat_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("kick", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("inviting_x", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("x_wants_to_join", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("accept", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reject", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("invite", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("status_concluded", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("status_spectate", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("status_playing", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("status_join", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("status_private", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("status_full", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("players_in_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("you_are_invited_to_xs_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("asking_to_join_xs_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("who_can_join", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("you_can_join", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("you_can_ask_to_join", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("you_cannot_join_in_progress", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("you_can_spectate", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("you_can_not_spectate", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("spectate_xs_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("hide_players_in_xs_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("show_players_in_xs_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("connecting_to_friend_server_twoline", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("loading", (byte) -23);
                if (null != var2) {
                  ToolkitImageProducerBuffer.loadingText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("offline", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("multiconst_invite_only", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("multiconst_clan", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("multiconst_friends", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("multiconst_similar_rating", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("multiconst_open", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("no_options_available", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reportabuse", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("presstabtochat", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("pressf10toquickchat", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("dob_chatdisabled", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("dob_enterforchat", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("tab_hidechattemporarily", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("esc_cancelprivatemessage", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("esc_cancelthisline", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("privatequickchat_from_x", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("privatequickchat_to_x", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("privatechat_blankarea_explanation", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("publicchat_unavailable_ratedgame", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("privatechat_friend_offline", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("privatechat_friend_notlisted", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("chatviewscrolledup", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("thisisrunescapeclan", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("thisisrunescapeclan_notowner", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("runescapeclan", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rated_membersonly", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_membersonly", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_1moreratedgame", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_moreratedgames", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_needrating", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_unratedonly", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_notunlocked", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_cannotbecombined1", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_cannotbecombined2", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_playernotmember", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_younotmember", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_playerneedsrating", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_youneedrating", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_playerneedsratedgames", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_youneedratedgames", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_playerneeds1ratedgame", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_youneed1ratedgame", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_playerhasntunlocked", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_youhaventunlocked", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_trychanging1", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_trychanging2", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_needchanging1", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_needchanging2", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_mightchange", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_playersdontqualify", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_playersdontqualify_selectgametab", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_unselectedoptions", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_pleaseselectoption1", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_pleaseselectoption2", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_badnumplayers", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_inviteplayers_or_trychanging1", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_inviteplayers_or_trychanging2", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_novalidcombos", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameopt_pleasetrychanging", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("ra_title", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("ra_mutethisplayer", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("ra_suggestmute", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("ra_intro", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("ra_intro_no_name", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("ra_explanation", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rule_pillar_0", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rule_0_0", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rule_0_1", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rule_0_2", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rule_0_3", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rule_0_4", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rule_0_5", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rule_pillar_1", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rule_1_0", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rule_1_1", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rule_1_2", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rule_1_3", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rule_1_4", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rule_pillar_2", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rule_2_0", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rule_2_1", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rule_2_2", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("createafreeaccount", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("cancel", (byte) -23);
                if (var2 != null) {
                  IntrusiveNodeHashTable.field_h = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("pleaselogintoplay", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("pleaselogin", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("pleaselogin_member", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("invaliduserorpass", (byte) -23);
                if (null != var2) {
                  LoginDialogState.field_b = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("pleasetryagain", (byte) -23);
                if (null != var2) {
                  LoginCredentials.pleaseTryAgainInText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
            }
            void runChunk1() throws java.lang.RuntimeException {
                var2 = OpenGlCubeTexture.fetchNamedAsset("pleasereenterpass", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("playfreeversion", (byte) -23);
                if (var2 != null) {
                  LegacyWaterTextureResources.playFreeVersionText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reloadgame", (byte) -23);
                if (var2 != null) {
                  DisplayModeFailure.reloadGameText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("toserverlist", (byte) -23);
                if (null != var2) {
                  IntroFinalFrameResources.toServerListText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("tocustomersupport", (byte) -23);
                if (null != var2) {
                  PowerupTrailParticle.toCustomerSupportText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("changedisplayname", (byte) -23);
                if (null != var2) {
                  IsaacPacketBuffer.changeDisplayNameText = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("returntohomepage", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("justplay", (byte) -23);
                if (null != var2) {
                  EmptyWidgetRenderer.field_b = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("justplay_excl", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("login", (byte) -23);
                if (var2 != null) {
                  LoginTextResources.logInText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("goback", (byte) -23);
                if (var2 != null) {
                  AgeValidator.goBackText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("otheroptions", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("proceed", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("connectingtoserver", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("pleasewait", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("logging_in", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlTexture2D.loggingInText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reconnect", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("backtoerror", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("pleasecheckinternet", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("attemptingtoreconnect", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("connectionlost_reconnecting", (byte) -23);
                if (null != var2) {
                  PerlinNoiseFactory.connectionLostAttemptingToText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("connectionlost_withreason", (byte) -23);
                if (null != var2) {
                  ProxyAuthenticationRequiredException.connectionLostText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("passwordverificationrequired", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("invalidpass", (byte) -23);
                if (null != var2) {
                  RasterBuffer.invalidPasswordText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("retry", (byte) -23);
                if (var2 != null) {
                  AppletFocusState.retryText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("back", (byte) -23);
                if (var2 != null) {
                  FullscreenCanvas.backText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("exitfullscreenmode", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("quittowebsite", (byte) -23);
                if (null != var2) {
                  HiscoreRequest.quitToWebsiteText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("connectionrestored", (byte) -23);
                if (var2 != null) {
                  ImageProducerRasterBuffer.connectionRestoredText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("warning_ifyouquit", (byte) -23);
                if (null != var2) {
                  AccountCreationNavigation.warningIfYouQuitText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("warning_ifyouquitorleavepage", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("resubscribe_withoutlosing_fs", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("resubscribe_withoutlosing", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("customersupport_withoutlosing_fs", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("customersupport_withoutlosing", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("js5help_withoutlosing_fs", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("js5help_withoutlosing", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("checkinternet_withoutlosing_fs", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("checkinternet_withoutlosing", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_intro", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_sameaccounttip_unnamed", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("dateofbirthprompt", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("fetchingcountrylist", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("countryprompt", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("countrylisterror", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("theonlypersonalquestions", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_submittingdata", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("check", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_pleasechooseausername", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_usernameblurb", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("checkingavailability", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("checking", (byte) -23);
                if (null != var2) {
                  SoftwareRenderTarget.checkingText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_namealreadytaken", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_sameaccounttip_named", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_nosuggestions", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alternativelygoback", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_available", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_willnowshowtermsandconditions", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("fetchingterms", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("termserror", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_iagree", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_idisagree", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_pleasescrolldowntoaccept", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_linkaddress", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("openinpopupwindow", (byte) -23);
                if (var2 != null) {
                  GameDefinitionLoader.openInPopupWindowText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create", (byte) -23);
                if (null != var2) {
                  TurbulenceNoise3D.createText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_pleasechooseapassword", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_passwordblurb", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_nevergivepassword", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("creatingyouraccount", (byte) -23);
                if (var2 != null) {
                  ClientException.creatingYourAccountText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_youmustaccept", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_passwordsdifferent", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_success", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("day", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("month", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("year", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("monthnames,0", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlRenderBufferSet.monthNames[0] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("monthnames,1", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlRenderBufferSet.monthNames[1] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("monthnames,2", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlRenderBufferSet.monthNames[2] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("monthnames,3", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlRenderBufferSet.monthNames[3] = MusicVoice.decodeCp1252(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("monthnames,4", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlRenderBufferSet.monthNames[4] = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("monthnames,5", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlRenderBufferSet.monthNames[5] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("monthnames,6", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlRenderBufferSet.monthNames[6] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("monthnames,7", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlRenderBufferSet.monthNames[7] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("monthnames,8", (byte) -23);
                if (param0 != 7) {
                  finished = true; return;
                }
                if (var2 != null) {
                  LegacyOpenGlRenderBufferSet.monthNames[8] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("monthnames,9", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlRenderBufferSet.monthNames[9] = MusicVoice.decodeCp1252(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("monthnames,10", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlRenderBufferSet.monthNames[10] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("monthnames,11", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlRenderBufferSet.monthNames[11] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_welcome", (byte) -23);
                if (null != var2) {
                  NineSlicePanel.creatingAJagexAccountText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_u13_welcome", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_createanaccount", (byte) -23);
                if (null != var2) {
                  IntrusiveNode.createAFreeAccountText = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_username", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_displayname", (byte) -23);
                if (var2 != null) {
                  ScoreMultiplierTable.playerNameText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_password", (byte) -23);
                if (var2 != null) {
                  ArenaDefinitionCodec.passwordText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_password_confirm", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlTexture.confirmPasswordText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_email", (byte) -23);
                if (null != var2) {
                  HardwareTurbulentWaterNoise.emailLoginText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_email_confirm", (byte) -23);
                if (null != var2) {
                  StripedProgressWidget.confirmEmailText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_age", (byte) -23);
                if (var2 != null) {
                  DropDownArrowRenderer.ageText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_u13_email", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_u13_email_confirm", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_dob", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_country", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alternatives_header", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alternatives_select", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_suggestions", (byte) -23);
                if (null != var2) {
                  NodeHashTableIterator.suggestedNamesText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_more_suggestions", (byte) -23);
                if (var2 != null) {
                  BufferedSocket.moreSuggestionsText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_select_alternative", (byte) -23);
                if (null != var2) {
                  TextureFilter.useThisAlternativeAsText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_optin_news", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlEnvironmentWaterEffect.pleaseSendMeNewsText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_agreeterms", (byte) -23);
                if (var2 != null) {
                  SocialContact.byClickingCreateYouText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_u13terms", (byte) -23);
                if (null != var2) {
                  QueuedIntArrayRequest.asYouAreUnderText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("login_username_email", (byte) -23);
                if (null != var2) {
                  OpenGlEnvironmentWaterEffect.loginText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("login_username", (byte) -23);
                if (null != var2) {
                  LruNodeCache.usernameText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("login_email", (byte) -23);
                if (null != var2) {
                  HuffmanDecoder.emailText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("login_username_tooltip", (byte) -23);
                if (var2 != null) {
                  SocialContact.theAccountNameYouText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("login_password_tooltip", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("login_login_tooltip", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("login_create_tooltip", (byte) -23);
                if (var2 != null) {
                  DroneDebris.createYourOwnFreeText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("login_justplay_tooltip", (byte) -23);
                if (null != var2) {
                  GameProgressUpdate.playTheGameWithoutText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("login_back_tooltip", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("login_no_displayname", (byte) -23);
                if (null != var2) {
                  MouseInputRegistration.youNeedToChooseText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_username_tooltip", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_username_hint", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_displayname_tooltip", (byte) -23);
                if (var2 != null) {
                  ShaderEffect.enterTheNameYouText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_displayname_hint", (byte) -23);
                if (null != var2) {
                  QuickChatPhrase.playerNamesCanBeText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_password_tooltip", (byte) -23);
                if (null != var2) {
                  IsaacPacketBuffer.enterAPasswordForText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_password_hint", (byte) -23);
                if (null != var2) {
                  DroneEscalationSupport.passwordsMustBeBetweenText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_password_confirm_tooltip", (byte) -23);
                if (null != var2) {
                  InstrumentNoteMask.typeYourPasswordAgainText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_email_tooltip", (byte) -23);
                if (null != var2) {
                  ArenaDefinitionCodec.yourEmailAddressIsText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_email_confirm_tooltip", (byte) -23);
                if (var2 != null) {
                  SoftwareTransform3D.typeYourEmailAddressText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_age_tooltip", (byte) -23);
                if (null != var2) {
                  ContentDialog.typeYourAgeInText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_optin_news_tooltip", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlShoreWaveWaterEffect.updatesWillSentToText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_u13_email_tooltip", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_u13_email_confirm_tooltip", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_dob_tooltip", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_country_tooltip", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_optin_tooltip", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_continue", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_username_unavailable", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlReflectionEffect.field_e = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_username_available", (byte) -23);
                if (null != var2) {
                  PrimitiveType.nameIsAvailableText = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alert_namelength", (byte) -23);
                if (null != var2) {
                  ValidatedTextInputWidget.namesShouldContainAText = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alert_namechars", (byte) -23);
                if (null != var2) {
                  MarkerTrackWidget.namesCanOnlyContainText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alert_nameleadingspace", (byte) -23);
                if (null != var2) {
                  ProgressDialog.namesCannotStartOrText = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alert_doublespace", (byte) -23);
                if (var2 != null) {
                  LoginTextResources.namesCannotContainConsecutiveText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alert_passchars", (byte) -23);
                if (var2 != null) {
                  ContentTransitionDialog.passwordsCanOnlyContainText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alert_passrepeated", (byte) -23);
                if (var2 != null) {
                  ScrollPane.thisPasswordContainsRepeatedText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alert_passlength", (byte) -23);
                if (null != var2) {
                  ArchiveIndex.passwordsMustBeBetweenText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alert_passcontainsname", (byte) -23);
                if (var2 != null) {
                  ValidationStatusWidget.thisPasswordContainsYourText = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alert_passcontainsemail", (byte) -23);
                if (var2 != null) {
                  FriendListState.thisPasswordContainsYourText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alert_passcontainsname_partial", (byte) -23);
                if (var2 != null) {
                  AccountRequestState.thisPasswordIsPartText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alert_checkname", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alert_invalidemail", (byte) -23);
                if (null != var2) {
                  DroneDebris.pleaseCheckIfAddressText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alert_email_unavailable", (byte) -23);
                if (var2 != null) {
                  BeveledCheckboxRenderer.emailAddressIsUnavailableText = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alert_invaliddate", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alert_invalidage", (byte) -23);
                if (null != var2) {
                  ArchiveLoadRequirement.pleaseEnterYourAgeText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alert_yearrange", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_alert_mismatch", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlFloatPostProcessEffect.thisEntryDoesnTText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_passwordvalid", (byte) -23);
                if (var2 != null) {
                  RenderBufferSet.passwordIsValidText = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_emailvalid", (byte) -23);
                if (var2 != null) {
                  ProxySocketConnector.emailIsValidText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("create_account_success", (byte) -23);
                if (null != var2) {
                  ArenaDefinition.accountCreatedSuccessfullyText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("invalid_name", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("cannot_add_yourself", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unable_to_add_friend", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unable_to_add_ignore", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unable_to_delete_friend", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unable_to_delete_ignore", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("friendlistfull", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("friendlistdupe", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("friendnotfound", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("ignorelistfull", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("ignorelistdupe", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("ignorenotfound", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("removeignorefirst", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("removefriendfirst", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("enterfriend_add", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("enterfriend_del", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("enterignore_add", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("enterignore_del", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("text_removed_from_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("text_lobby_pleaselogin_free", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("opengl", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("sse", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("purejava", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("waitingfor_graphics", (byte) -23);
                if (var2 != null) {
                  ProgressDialog.waitingForGraphicsText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("waitingfor_models", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("waitingfor_fonts", (byte) -23);
                if (var2 != null) {
                  ToolkitRasterBuffer.waitingForFontsText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("waitingfor_soundeffects", (byte) -23);
                if (var2 != null) {
                  GameClientShell.waitingForSoundEffectsText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("waitingfor_music", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlPostProcessEffect.waitingForMusicText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("waitingfor_instruments", (byte) -23);
                if (var2 != null) {
                  ContentTransitionPhase.waitingForInstrumentsText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("waitingfor_levels", (byte) -23);
                if (var2 != null) {
                  ArenaPad.waitingForLevelsText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("waitingfor_extradata", (byte) -23);
                if (var2 != null) {
                  StatefulWidgetRenderer.waitingForExtraDataText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("waitingfor_languages", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("waitingfor_textures", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("waitingfor_animations", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("loading_graphics", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlTurbulentTextureEffect.loadingGraphicsText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("loading_models", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("loading_fonts", (byte) -23);
                if (null != var2) {
                  HuffmanDecoder.loadingFontsText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("loading_soundeffects", (byte) -23);
                if (var2 != null) {
                  VertexLayout.loadingSoundEffectsText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("loading_music", (byte) -23);
                if (var2 != null) {
                  MessageDialog.loadingMusicText = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("loading_instruments", (byte) -23);
                if (var2 != null) {
                  ArchiveIndex.loadingInstrumentsText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("loading_levels", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlNormalMapGenerator.loadingLevelsText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("loading_extradata", (byte) -23);
                if (null != var2) {
                  ReflectionCheck.loadingExtraDataText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("loading_languages", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("loading_textures", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("loading_animations", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unpacking_graphics", (byte) -23);
                if (null != var2) {
                  SoftwareTransform3D.unpackingGraphicsText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unpacking_models", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unpacking_soundeffects", (byte) -23);
                if (var2 != null) {
                  ProjectionMode.unpackingSoundEffectsText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unpacking_music", (byte) -23);
                if (null != var2) {
                  ClientException.unpackingMusicText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unpacking_levels", (byte) -23);
                if (null != var2) {
                  DroneWaveDefinition.unpackingLevelsText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unpacking_languages", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unpacking_animations", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unpacking_toolkit", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("instructions", (byte) -23);
                if (null != var2) {
                  WidgetTheme.instructionsText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("tutorial", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("playtutorial", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("sound_colon", (byte) -23);
                if (null != var2) {
                  TurbulenceNoise3D.soundText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("music_colon", (byte) -23);
                if (var2 != null) {
                  HardwareBufferSet.musicText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("fullscreen", (byte) -23);
                if (null != var2) {
                  ResourceArchive.field_j = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("screensize", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("highscores", (byte) -23);
                if (var2 != null) {
                  MouseInputHandler.field_a = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rankings", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("achievements", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlRenderbuffer.achievementsText = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("achievementsthisgame", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("achievementsthissession", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("watchintroduction", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("quit", (byte) -23);
                if (var2 != null) {
                  RasterBuffer.quitText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("login_createaccount", (byte) -23);
                if (var2 != null) {
                  OpenGlTexture3D.logInCreateAccountText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("tohighscores", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("returntomainmenu", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("returntopausemenu", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("returntooptionsmenu_notpaused", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mainmenu", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("pausemenu", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("optionsmenu_notpaused", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("menu", (byte) -23);
            }
            void runChunk2() throws java.lang.RuntimeException {
                if (var2 != null) {
                  RenderPresentationException.menuText = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("selectlevel", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("nextlevel", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("startgame", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("newgame", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("resumegame", (byte) -23);
                if (null != var2) {
                  WhirlpoolTables.resumeGameText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("resumetutorial", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("skip", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("skiptutorial", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("skipending", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("restartlevel", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("endtest", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("endgame", (byte) -23);
                if (null != var2) {
                  RendererPreference.endGameText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("endtutorial", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("ok", (byte) -23);
                if (null != var2) {
                  TextureTransformMode.field_a = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("on", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("off", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("previous", (byte) -23);
                if (null != var2) {
                  CompactMeshGeometry.previousText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("prev", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("next", (byte) -23);
                if (null != var2) {
                  FadingWidget.nextText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_colon", (byte) -23);
                if (var2 != null) {
                  field_g = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("hotseatmultiplayer", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("entermultiplayerlobby", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("singleplayergame", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("returntogame", (byte) -23);
                if (var2 != null) {
                  SessionStatisticsSubmission.returnToGameText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("endgameresign", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("offerdraw", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("canceldraw", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("acceptdraw", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("resign", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("returntolobby", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("cont", (byte) -23);
                if (null != var2) {
                  EmailCredentials.continueText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("continue_spectating", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("messages", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_fastest", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_medium", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_best", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_directx", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_opengl", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_java", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_quality_high", (byte) -23);
                if (null != var2) {
                  ArchiveLoadingStage.highText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_quality_low", (byte) -23);
                if (null != var2) {
                  DiskCacheDataFile.lowText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_mode", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_quality", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mode", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("quality", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("keys", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("objective", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("currentobjective", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("pressescforpausemenu", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("pressescforpausemenuortoskiptutorial", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("pressescforoptionsmenu_doesntpause", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("pressescforoptionsmenu_doesntpause_short", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("powerups", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("latestlevel_suffix", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unreachedlevel_name", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unreachedlevel_cannotplayreason", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unreachedlevel_cannotplayreason_shorter", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unreachedworld_cannotplayreason", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("memberslevel_name", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("memberslevel_cannotplayreason", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("membersworld_cannotplayreason", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unreachedlevel_createtip", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unreachedlevel_createtip_line1", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unreachedlevel_createtip_line2", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("unreachedlevel_logintip", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("memberslevel_logintip", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("displayname_none", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("levelxofy1", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("levelxofy2", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("levelxofy", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("ingame_level", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mouseoveranicon", (byte) -23);
                if (null != var2) {
                  ActiveCanvasProvider.mouseOverAnIconText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("notyetachieved", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlRidgedWaterEffect.notYetAchievedText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("achieved", (byte) -23);
                if (null != var2) {
                  NoiseSliceGenerator.achievedText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("orbpoints", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("orbcoins", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("orbpoints_colon", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("orbcoins_colon", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("achieved_colon_description", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("secretachievement", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("no_highscores", (byte) -23);
                if (null != var2) {
                  HardwareSpecularEffect.noHighscoresText = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("hs_name", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("hs_level", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("hs_fromlevel", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("hs_tolevel", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("hs_score", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("hs_end", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("ingame_score", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("score_colon", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_leavegame", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_offerrematch", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_offerrematch_unrated", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_acceptrematch", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_acceptrematch_unrated", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_cancelrematch", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_cancelrematch_unrated", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_rematchnewgame", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_rematchnewgame_unrated", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_x_wantstodraw", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_x_offersrematch", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_x_offersrematch_unrated", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_youofferrematch", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_youofferrematch_unrated", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_youofferdraw", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_youresigned", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_youresigned_rematch", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_x_hasresignedandleft", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_x_hasresigned_rematch", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_x_hasresigned", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_x_hasleft", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_x_haswon", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_youhavewon", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_gamedrawn", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_timeremaining", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_x_turn", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_yourturn", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("gameover", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_hidechat", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_showchat_nounread", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_showchat_unread1", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mp_showchat_unread2", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("click_to_quickchat", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("autorespond", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("quickchat_help", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("quickchat_help_title", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("quickchat_shortcut_help,0", (byte) -23);
                if (null != var2) {
                  IntrusiveNode.field_j[0] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("quickchat_shortcut_help,1", (byte) -23);
                if (null != var2) {
                  IntrusiveNode.field_j[1] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("quickchat_shortcut_help,2", (byte) -23);
                if (var2 != null) {
                  IntrusiveNode.field_j[2] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("quickchat_shortcut_help,3", (byte) -23);
                if (null != var2) {
                  IntrusiveNode.field_j[3] = MusicVoice.decodeCp1252(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("quickchat_shortcut_help,4", (byte) -23);
                if (null != var2) {
                  IntrusiveNode.field_j[4] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("quickchat_shortcut_help,5", (byte) -23);
                if (null != var2) {
                  IntrusiveNode.field_j[5] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("quickchat_shortcut_keys,0", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlTransform3D.field_h[0] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("quickchat_shortcut_keys,1", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlTransform3D.field_h[1] = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("quickchat_shortcut_keys,2", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlTransform3D.field_h[2] = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("quickchat_shortcut_keys,3", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlTransform3D.field_h[3] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("quickchat_shortcut_keys,4", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlTransform3D.field_h[4] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("quickchat_shortcut_keys,5", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlTransform3D.field_h[5] = MusicVoice.decodeCp1252(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("keychar_the_character_under_questionmark", (byte) -23);
                if (var2 != null) {
                  SoftwareTransform3D.decodeCp1252Byte(var2[0], (byte) -51);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rating_noratings", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rating_rating", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rating_played", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rating_won", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rating_lost", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rating_drawn", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("benefits_fullscreen", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("benefits_noadverts", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("benefits_price", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("members_expansion_benefits,0", (byte) -23);
                if (null != var2) {
                  PerlinNoise2D.membershipBenefitLines[0] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("members_expansion_benefits,1", (byte) -23);
                if (var2 != null) {
                  PerlinNoise2D.membershipBenefitLines[1] = MusicVoice.decodeCp1252(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("members_expansion_benefits,2", (byte) -23);
                if (null != var2) {
                  PerlinNoise2D.membershipBenefitLines[2] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("members_expansion_price_top", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("members_expansion_price_bottom", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reconnect_lost_seq,0", (byte) -23);
                if (null != var2) {
                  PlayerDrone.reconnectStatusFrames[0] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reconnect_lost_seq,1", (byte) -23);
                if (var2 != null) {
                  PlayerDrone.reconnectStatusFrames[1] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reconnect_lost_seq,2", (byte) -23);
                if (var2 != null) {
                  PlayerDrone.reconnectStatusFrames[2] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reconnect_lost_seq,3", (byte) -23);
                if (null != var2) {
                  PlayerDrone.reconnectStatusFrames[3] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reconnect_lost", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reconnect_restored", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reconnect_please_check", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reconnect_wait", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reconnect_retry", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reconnect_resume", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reconnect_or", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reconnect_exitfs", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reconnect_exitfs_quit", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reconnect_quit", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reconnect_check_fs", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("reconnect_check_nonfs", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("fs_accept_beforeaccept", (byte) -23);
                if (var2 != null) {
                  NanoTickClock.clickText = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("fs_button_accept", (byte) -23);
                if (var2 != null) {
                  FourStatHiscoreRequest.acceptText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("fs_accept_afteraccept", (byte) -23);
                if (null != var2) {
                  ClientStackTraceFormatter.toKeepFullscreenOrText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("fs_button_cancel", (byte) -23);
                if (var2 != null) {
                  IntroMeshProjection.cancelText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("fs_accept_aftercancel", (byte) -23);
                if (var2 != null) {
                  OpenGlShaderProgram.toReturnToTheText = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("fs_accept_countdown_sing", (byte) -23);
                if (null != var2) {
                  ClientExceptionSupport.ifYouDoNothingText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("fs_accept_countdown_pl", (byte) -23);
                if (null != var2) {
                  IntroFinalFrameResources.field_a = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("fs_nonmember", (byte) -23);
                if (var2 != null) {
                  IntrusiveNode.fullscreenPlayIsAnText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("fs_button_close", (byte) -23);
                if (null != var2) {
                  DraggableWidget.closeText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("fs_button_members", (byte) -23);
                if (null != var2) {
                  AudioServiceThread.membersText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("fs_unavailable", (byte) -23);
                if (var2 != null) {
                  field_f = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("fs_unavailable_try_signed_applet", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlGraphicsToolkit.unfortunatelyYourConfigurationDoesnText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("fs_focus", (byte) -23);
                if (null != var2) {
                  LimitedRandomAccessFile.field_c = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("fs_focus_or_resolution", (byte) -23);
                if (null != var2) {
                  PasswordInputRenderer.unfortunatelyThereWasAText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("fs_timeout", (byte) -23);
                if (null != var2) {
                  OpenGlBuffer.fullscreenModeWasCancelledText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("fs_button_tryagain", (byte) -23);
                if (null != var2) {
                  FullscreenMembershipDialog.tryAgainText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_ui_fs_countdown", (byte) -23);
                if (var2 != null) {
                  PasswordInputRenderer.ifYouDoNothingText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mb_caption_title", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mb_including_gamename", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mb_full_access_1", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mb_full_access_2", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mb_achievement_count_1", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mb_achievement_count_2", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mb_exclusive_1", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mb_exclusive_2", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("me_extra_benefits", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("hs_friend_tip", (byte) -23);
                if (null != var2) {
                  LinkWidgetRenderer.friendsCanBeAddedText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("hs_friend_tip_multi", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("hs_mode_name,0", (byte) -23);
                if (null != var2) {
                  PlayingSound.scoreFilterLabels[0] = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("hs_mode_name,1", (byte) -23);
                if (null != var2) {
                  PlayingSound.scoreFilterLabels[1] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("hs_mode_name,2", (byte) -23);
                if (null != var2) {
                  PlayingSound.scoreFilterLabels[2] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rating_mode_name,0", (byte) -23);
                if (null != var2) {
                  RendererStateSnapshot.leaderboardSortLabels[0] = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rating_mode_name,1", (byte) -23);
                if (null != var2) {
                  RendererStateSnapshot.leaderboardSortLabels[1] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rating_mode_long_name,0", (byte) -23);
                if (null != var2) {
                  NodeHashTableIterator.leaderboardSortStatusLabels[0] = MusicVoice.decodeCp1252(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("rating_mode_long_name,1", (byte) -23);
                if (var2 != null) {
                  NodeHashTableIterator.leaderboardSortStatusLabels[1] = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_config_fixed_size", (byte) -23);
                if (var2 != null) {
                  StatisticsSubmissionSupport.classicText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_config_resizable", (byte) -23);
                if (var2 != null) {
                  VertexLayout.resizableText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_config_fullscreen", (byte) -23);
                if (var2 != null) {
                  PlayingSound.fullScreenText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_config_done", (byte) -23);
                if (var2 != null) {
                  DraggableWidget.backText = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_config_apply", (byte) -23);
                if (var2 != null) {
                  LoadingStatusText.applyText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_config_title", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_config_instruction", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlClientVertexBuffer.largeScreenSizesAndText = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("graphics_config_need_memory", (byte) -23);
                if (var2 != null) {
                  CanvasResizeState.moreMemoryIsRequiredText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("pleasewait_dotdotdot", (byte) -23);
                if (null != var2) {
                  AccountRequestState.pleaseWaitText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("serviceunavailable", (byte) -23);
                if (null != var2) {
                  SectorCacheStore.serviceUnavailableText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("createtouse", (byte) -23);
                if (null != var2) {
                  InstrumentNoteMask.createAFreeAccountText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("achievementsoffline", (byte) -23);
                if (null != var2) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("warning", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("DEFAULT_PLAYER_NAME", (byte) -23);
                if (var2 != null) {
                  FullscreenMembershipDialog.playerText = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin1", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlNormalMapGenerator.youAreNotCurrentlyText = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin2,1", (byte) -23);
                if (var2 != null) {
                  IsaacPacketBuffer.field_r[1] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin2,2", (byte) -23);
                if (null != var2) {
                  IsaacPacketBuffer.field_r[2] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin2,3", (byte) -23);
                if (var2 != null) {
                  IsaacPacketBuffer.field_r[3] = MusicVoice.decodeCp1252(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin2,4", (byte) -23);
                if (var2 != null) {
                  IsaacPacketBuffer.field_r[4] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin2,5", (byte) -23);
                if (null != var2) {
                  IsaacPacketBuffer.field_r[5] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin2,6", (byte) -23);
                if (null != var2) {
                  IsaacPacketBuffer.field_r[6] = MusicVoice.decodeCp1252(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin2,7", (byte) -23);
                if (var2 != null) {
                  IsaacPacketBuffer.field_r[7] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin3,1", (byte) -23);
                if (var2 != null) {
                  LabeledWidget.field_G[1] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin3,2", (byte) -23);
                if (var2 != null) {
                  LabeledWidget.field_G[2] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin3,3", (byte) -23);
                if (null != var2) {
                  LabeledWidget.field_G[3] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin3,4", (byte) -23);
                if (null != var2) {
                  LabeledWidget.field_G[4] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin3,5", (byte) -23);
                if (null != var2) {
                  LabeledWidget.field_G[5] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin3,6", (byte) -23);
                if (var2 != null) {
                  LabeledWidget.field_G[6] = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin3,7", (byte) -23);
                if (var2 != null) {
                  LabeledWidget.field_G[7] = MusicVoice.decodeCp1252(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("discard", (byte) -23);
                if (null != var2) {
                  DroneVariantScoring.discardText = MusicVoice.decodeCp1252(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin4,1", (byte) -23);
                if (null != var2) {
                  RasterColorTables.field_f[1] = MusicVoice.decodeCp1252(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin4,2", (byte) -23);
                if (null != var2) {
                  RasterColorTables.field_f[2] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin4,3", (byte) -23);
                if (var2 != null) {
                  RasterColorTables.field_f[3] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin4,4", (byte) -23);
                if (var2 != null) {
                  RasterColorTables.field_f[4] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin4,5", (byte) -23);
            }
            void runChunk3() throws java.lang.RuntimeException {
                if (var2 != null) {
                  RasterColorTables.field_f[5] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin4,6", (byte) -23);
                if (var2 != null) {
                  RasterColorTables.field_f[6] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin4,7", (byte) -23);
                if (var2 != null) {
                  RasterColorTables.field_f[7] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin_notloggedin", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin_alternate,1", (byte) -23);
                if (var2 != null) {
                  LoginCredentialFactory.field_b[1] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin_alternate,2", (byte) -23);
                if (var2 != null) {
                  LoginCredentialFactory.field_b[2] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin_alternate,3", (byte) -23);
                if (null != var2) {
                  LoginCredentialFactory.field_b[3] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin_alternate,4", (byte) -23);
                if (var2 != null) {
                  LoginCredentialFactory.field_b[4] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin_alternate,5", (byte) -23);
                if (null != var2) {
                  LoginCredentialFactory.field_b[5] = MusicVoice.decodeCp1252(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin_alternate,6", (byte) -23);
                if (null != var2) {
                  LoginCredentialFactory.field_b[6] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("mustlogin_alternate,7", (byte) -23);
                if (null != var2) {
                  LoginCredentialFactory.field_b[7] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("subscription_cost_monthly,0", (byte) -23);
                if (null != var2) {
                  AppletTickHistory.field_c[0] = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("subscription_cost_monthly,1", (byte) -23);
                if (var2 != null) {
                  AppletTickHistory.field_c[1] = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("subscription_cost_monthly,2", (byte) -23);
                if (null != var2) {
                  AppletTickHistory.field_c[2] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("subscription_cost_monthly,3", (byte) -23);
                if (null != var2) {
                  AppletTickHistory.field_c[3] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("subscription_cost_monthly,4", (byte) -23);
                if (null != var2) {
                  AppletTickHistory.field_c[4] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("subscription_cost_monthly,5", (byte) -23);
                if (var2 != null) {
                  AppletTickHistory.field_c[5] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("subscription_cost_monthly,6", (byte) -23);
                if (null != var2) {
                  AppletTickHistory.field_c[6] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("subscription_cost_monthly,7", (byte) -23);
                if (null != var2) {
                  AppletTickHistory.field_c[7] = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("subscription_cost_monthly,8", (byte) -23);
                if (var2 != null) {
                  AppletTickHistory.field_c[8] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("subscription_cost_monthly,9", (byte) -23);
                if (null != var2) {
                  AppletTickHistory.field_c[9] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("subscription_cost_monthly,10", (byte) -23);
                if (null != var2) {
                  AppletTickHistory.field_c[10] = MusicVoice.decodeCp1252(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("subscription_cost_monthly,11", (byte) -23);
                if (null != var2) {
                  AppletTickHistory.field_c[11] = MusicVoice.decodeCp1252(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("subscription_cost_monthly,12", (byte) -23);
                if (var2 != null) {
                  AppletTickHistory.field_c[12] = MusicVoice.decodeCp1252(0, var2);
                }
                var2 = OpenGlCubeTexture.fetchNamedAsset("sentence_separator", (byte) -23);
                if (var2 != null) {
                  MusicVoice.decodeCp1252(0, var2);
                }
                ToolkitRasterBuffer.field_q = null;
            }
            void run() {
                var3 = Sumoblitz.field_L ? 1 : 0;
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
                  stackIn_2612_0 = (RuntimeException) (var2_ref);
                  stackIn_2612_1 = new StringBuilder().append("ni.C(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_2613_2 = "null";
                  } else {
                    stackIn_2613_2 = "{...}";
                  }
                  throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_2612_0), ((StringBuilder) (Object) stackIn_2612_1).append(stackIn_2613_2).append(')').toString());
                }
                if (var3 != 0) {
                  stackIn_2621_0 = (!GameApplet.field_o);
                  GameApplet.field_o = stackIn_2621_0;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    final void refreshState(boolean lighting, byte guard) {
        try {
          if (guard > -71) {
            this.setParameters(-51, -107, -8);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ni.A(" + lighting + ',' + guard + ')');
        }
    }

    final void enable(boolean lighting, int guard) {
        try {
          if (guard != 20186) {
            this.refreshState(false, (byte) 126);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ni.J(" + lighting + ',' + guard + ')');
        }
    }

    public static void d(boolean param0) {
        field_g = null;
        sceneryParticles = null;
        if (param0) {
          return;
        }
        try {
          field_h = null;
          field_f = null;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ni.N(" + param0 + ')');
        }
    }

    final static Sprite[] createBeveledPanelSprites(int darkColor, int borderSize, int guard, int backgroundColor, int lightColor) {
        Sprite dupTemp$2 = null;
        Sprite dupTemp$3 = null;
        Sprite[] var5 = null;
        RuntimeException var5_ref = null;
        Sprite[] stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new Sprite[9];
          dupTemp$2 = OpenGlAssemblyProgram.createSolidSprite(borderSize, lightColor, GzipDecompressor.bitwiseXor(guard, 3));
          var5[6] = dupTemp$2;
          var5[3] = dupTemp$2;
          var5[2] = dupTemp$2;
          var5[1] = dupTemp$2;
          var5[guard] = dupTemp$2;
          dupTemp$3 = OpenGlAssemblyProgram.createSolidSprite(borderSize, darkColor, 3);
          var5[8] = dupTemp$3;
          var5[7] = dupTemp$3;
          var5[5] = dupTemp$3;
          if (0 != backgroundColor) {
            var5[4] = OpenGlAssemblyProgram.createSolidSprite(64, backgroundColor, guard + 3);
          }
          stackIn_5_0 = var5;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var5_ref), "ni.H(" + darkColor + ',' + borderSize + ',' + guard + ',' + backgroundColor + ',' + lightColor + ')');
        }
    }

    final boolean isSupported(byte guard) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard >= -8) {
            this.bindTexture(8, 82, (GpuTexture) null);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "ni.G(" + guard + ')');
        }
    }

    static {
        field_g = "Graphics: ";
        field_f = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
