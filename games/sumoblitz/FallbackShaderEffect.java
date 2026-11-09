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
            FallbackShaderEffect.a(-3, -84, 61, -17, 112);
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
          this.toolkit.a(texture, guard - 18711);
          if (guard != 18834) {
            FallbackShaderEffect.d(true);
          }
          this.toolkit.h(74, combineMode);
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
                var2 = OpenGlCubeTexture.a("loginm3", (byte) -23);
                if (var2 != null) {
                  HotspotTextWidget.connectionTimedOutPleaseText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("loginm2", (byte) -23);
                if (var2 != null) {
                  GridWidgetContainer.errorConnectingToServerText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("loginm1", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("idlemessage20min", (byte) -23);
                if (var2 != null) {
                  NoiseSliceGenerator.weClosedTheConnectionText = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("error_js5crc", (byte) -23);
                if (null != var2) {
                  o.field_a = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("error_js5io", (byte) -23);
                if (null != var2) {
                  eg.field_n = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("error_js5connect_full", (byte) -23);
                if (var2 != null) {
                  ValidationMessageWidget.dataServerFullOrText = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("error_js5connect", (byte) -23);
                if (null != var2) {
                  ArrayWidgetContainer.unableToConnectToText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("login_gameupdated", (byte) -23);
                if (var2 != null) {
                  TextHotspot.thisGameHasBeenText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_unable", (byte) -23);
                if (null != var2) {
                  DisplayModeConfirmationDialog.unfortunatelyWeAreUnableText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_ineligible", (byte) -23);
                if (null != var2) {
                  rn.unfortunatelyYouAreNotText = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("usernameprompt", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("passwordprompt", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("andagainprompt", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("ticketing_read", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("ticketing_ignore", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("ticketing_oneunread", (byte) -23);
                if (var2 != null) {
                  FullscreenMembershipDialog.youHave1UnreadText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("ticketing_xunread", (byte) -23);
                if (var2 != null) {
                  ph.youHaveUnreadMessagesText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("ticketing_gotowebsite", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlEnvironmentWaterEffect.visitTheAccountManagementText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("ticketing_waitingformessages", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_on", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_friends", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_off", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_lobby", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_public", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_ignore", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_tips", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_private", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_x_entered_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_x_joined_your_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_x_entered_other_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_x_left_lobby", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_x_lost_con", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_x_cannot_join_full", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_x_cannot_join_inprogress", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_x_declined_invite", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_x_withdrew_request", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_x_removed", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_x_dropped_out", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_entered_other_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_game_is_full", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_game_has_started", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_you_declined_invite", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_invite_withdrawn", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_request_declined", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_request_withdrawn", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_all_players_have_left", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_lobby_name", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_lobby_rating", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_lobby_friend_add", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_lobby_friend_rm", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_lobby_name_add", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_lobby_name_rm", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_lobby_location", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_gamelist_all_games", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_gamelist_status", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_gamelist_owner", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_gamelist_players", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_gamelist_avg_rating", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_gamelist_options", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_gamelist_elapsed_time", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_play_rated", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_create_unrated", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_options", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_options_whocanjoin", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_options_players", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_options_dontmind", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_options_allow_spectate", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_options_ratedgametype", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("yes", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("no", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_invite_players", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("close", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("add_x_to_friends", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("add_x_to_ignore", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("rm_x_from_friends", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rm_x_from_ignore", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("send_pm_to_x", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("send_qc_to_x", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("send_pm", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("invite_accept_xs_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("invite_decline_xs_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("join_xs_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("join_request_xs_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("join_withdraw_request_xs_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_gameopt_kick_x_from_this_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_gameopt_withdraw_invite_to_x", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_gameopt_accept_x_into_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_gameopt_reject_x_from_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_gameopt_invite_x_to_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("report_x_for_abuse", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("unable_to_send_message_password_a", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("unable_to_send_message_password_b", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_lobby_show_all", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_lobby_friends_only", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_lobby_friends", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_lobby_hide", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_game_show_all", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_game_friends_only", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_game_friends", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_game_hide", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_pm_show_all", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_pm_friends_only", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_pm_friends", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mu_chat_invisible_and_silent_mode", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("you_have_been_removed_from_xs_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("your_rating_is_x", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("you_are_on_x_server", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("rated_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("unrated_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("rated_game_tips", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("searching_for_opponent_singular", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("searching_for_opponents_plural", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("find_opponent_singular", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("find_opponents_plural", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rated_game_tips_setup_singular", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("rated_game_tips_setup_plural", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("waiting_to_start_hint", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("your_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("game_full", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("join_requests_one", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("join_requests_many", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("xs_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("waiting_for_x_to_start_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("game_options_changed", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("players_x_of_y", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("message_lobby", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("quickchat_lobby", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("message_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("message_team", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("quickchat_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("kick", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("inviting_x", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("x_wants_to_join", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("accept", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("reject", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("invite", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("status_concluded", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("status_spectate", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("status_playing", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("status_join", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("status_private", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("status_full", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("players_in_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("you_are_invited_to_xs_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("asking_to_join_xs_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("who_can_join", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("you_can_join", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("you_can_ask_to_join", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("you_cannot_join_in_progress", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("you_can_spectate", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("you_can_not_spectate", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("spectate_xs_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("hide_players_in_xs_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("show_players_in_xs_game", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("connecting_to_friend_server_twoline", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("loading", (byte) -23);
                if (null != var2) {
                  ToolkitImageProducerBuffer.loadingText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("offline", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("multiconst_invite_only", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("multiconst_clan", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("multiconst_friends", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("multiconst_similar_rating", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("multiconst_open", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("no_options_available", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("reportabuse", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("presstabtochat", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("pressf10toquickchat", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("dob_chatdisabled", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("dob_enterforchat", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("tab_hidechattemporarily", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("esc_cancelprivatemessage", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("esc_cancelthisline", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("privatequickchat_from_x", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("privatequickchat_to_x", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("privatechat_blankarea_explanation", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("publicchat_unavailable_ratedgame", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("privatechat_friend_offline", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("privatechat_friend_notlisted", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("chatviewscrolledup", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("thisisrunescapeclan", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("thisisrunescapeclan_notowner", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("runescapeclan", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rated_membersonly", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_membersonly", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_1moreratedgame", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_moreratedgames", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_needrating", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_unratedonly", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_notunlocked", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_cannotbecombined1", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_cannotbecombined2", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_playernotmember", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_younotmember", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_playerneedsrating", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_youneedrating", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_playerneedsratedgames", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_youneedratedgames", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_playerneeds1ratedgame", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_youneed1ratedgame", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_playerhasntunlocked", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_youhaventunlocked", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_trychanging1", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_trychanging2", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_needchanging1", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_needchanging2", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_mightchange", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_playersdontqualify", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_playersdontqualify_selectgametab", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_unselectedoptions", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_pleaseselectoption1", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_pleaseselectoption2", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_badnumplayers", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_inviteplayers_or_trychanging1", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_inviteplayers_or_trychanging2", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_novalidcombos", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameopt_pleasetrychanging", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("ra_title", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("ra_mutethisplayer", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("ra_suggestmute", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("ra_intro", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("ra_intro_no_name", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("ra_explanation", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rule_pillar_0", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rule_0_0", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rule_0_1", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rule_0_2", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rule_0_3", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rule_0_4", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("rule_0_5", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rule_pillar_1", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rule_1_0", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rule_1_1", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rule_1_2", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rule_1_3", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rule_1_4", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rule_pillar_2", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rule_2_0", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rule_2_1", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("rule_2_2", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("createafreeaccount", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("cancel", (byte) -23);
                if (var2 != null) {
                  IntrusiveNodeHashTable.field_h = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("pleaselogintoplay", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("pleaselogin", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("pleaselogin_member", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("invaliduserorpass", (byte) -23);
                if (null != var2) {
                  ih.field_b = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("pleasetryagain", (byte) -23);
                if (null != var2) {
                  se.pleaseTryAgainInText = MusicVoice.a(param0 - 7, var2);
                }
            }
            void runChunk1() throws java.lang.RuntimeException {
                var2 = OpenGlCubeTexture.a("pleasereenterpass", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("playfreeversion", (byte) -23);
                if (var2 != null) {
                  LegacyWaterTextureResources.playFreeVersionText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("reloadgame", (byte) -23);
                if (var2 != null) {
                  vf.reloadGameText = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("toserverlist", (byte) -23);
                if (null != var2) {
                  lq.toServerListText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("tocustomersupport", (byte) -23);
                if (null != var2) {
                  PowerupTrailParticle.toCustomerSupportText = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("changedisplayname", (byte) -23);
                if (null != var2) {
                  pl.changeDisplayNameText = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("returntohomepage", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("justplay", (byte) -23);
                if (null != var2) {
                  EmptyWidgetRenderer.field_b = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("justplay_excl", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("login", (byte) -23);
                if (var2 != null) {
                  ma.logInText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("goback", (byte) -23);
                if (var2 != null) {
                  AgeValidator.goBackText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("otheroptions", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("proceed", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("connectingtoserver", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("pleasewait", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("logging_in", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlTexture2D.loggingInText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("reconnect", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("backtoerror", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("pleasecheckinternet", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("attemptingtoreconnect", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("connectionlost_reconnecting", (byte) -23);
                if (null != var2) {
                  qe.connectionLostAttemptingToText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("connectionlost_withreason", (byte) -23);
                if (null != var2) {
                  hh.connectionLostText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("passwordverificationrequired", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("invalidpass", (byte) -23);
                if (null != var2) {
                  RasterBuffer.invalidPasswordText = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("retry", (byte) -23);
                if (var2 != null) {
                  ii.retryText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("back", (byte) -23);
                if (var2 != null) {
                  FullscreenCanvas.backText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("exitfullscreenmode", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("quittowebsite", (byte) -23);
                if (null != var2) {
                  of.quitToWebsiteText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("connectionrestored", (byte) -23);
                if (var2 != null) {
                  ImageProducerRasterBuffer.connectionRestoredText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("warning_ifyouquit", (byte) -23);
                if (null != var2) {
                  rv.warningIfYouQuitText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("warning_ifyouquitorleavepage", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("resubscribe_withoutlosing_fs", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("resubscribe_withoutlosing", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("customersupport_withoutlosing_fs", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("customersupport_withoutlosing", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("js5help_withoutlosing_fs", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("js5help_withoutlosing", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("checkinternet_withoutlosing_fs", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("checkinternet_withoutlosing", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_intro", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_sameaccounttip_unnamed", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("dateofbirthprompt", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("fetchingcountrylist", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("countryprompt", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("countrylisterror", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("theonlypersonalquestions", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_submittingdata", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("check", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_pleasechooseausername", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("create_usernameblurb", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("checkingavailability", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("checking", (byte) -23);
                if (null != var2) {
                  SoftwareRenderTarget.checkingText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_namealreadytaken", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_sameaccounttip_named", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_nosuggestions", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alternativelygoback", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("create_available", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_willnowshowtermsandconditions", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("fetchingterms", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("termserror", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("create_iagree", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_idisagree", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_pleasescrolldowntoaccept", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_linkaddress", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("openinpopupwindow", (byte) -23);
                if (var2 != null) {
                  sb.openInPopupWindowText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create", (byte) -23);
                if (null != var2) {
                  TurbulenceNoise3D.createText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_pleasechooseapassword", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_passwordblurb", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_nevergivepassword", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("creatingyouraccount", (byte) -23);
                if (var2 != null) {
                  ClientException.creatingYourAccountText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_youmustaccept", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_passwordsdifferent", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_success", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("day", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("month", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("year", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("monthnames,0", (byte) -23);
                if (null != var2) {
                  lf.monthNames[0] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("monthnames,1", (byte) -23);
                if (null != var2) {
                  lf.monthNames[1] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("monthnames,2", (byte) -23);
                if (var2 != null) {
                  lf.monthNames[2] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("monthnames,3", (byte) -23);
                if (null != var2) {
                  lf.monthNames[3] = MusicVoice.a(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.a("monthnames,4", (byte) -23);
                if (null != var2) {
                  lf.monthNames[4] = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("monthnames,5", (byte) -23);
                if (var2 != null) {
                  lf.monthNames[5] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("monthnames,6", (byte) -23);
                if (var2 != null) {
                  lf.monthNames[6] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("monthnames,7", (byte) -23);
                if (var2 != null) {
                  lf.monthNames[7] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("monthnames,8", (byte) -23);
                if (param0 != 7) {
                  finished = true; return;
                }
                if (var2 != null) {
                  lf.monthNames[8] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("monthnames,9", (byte) -23);
                if (var2 != null) {
                  lf.monthNames[9] = MusicVoice.a(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.a("monthnames,10", (byte) -23);
                if (null != var2) {
                  lf.monthNames[10] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("monthnames,11", (byte) -23);
                if (null != var2) {
                  lf.monthNames[11] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_welcome", (byte) -23);
                if (null != var2) {
                  qn.creatingAJagexAccountText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_u13_welcome", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_createanaccount", (byte) -23);
                if (null != var2) {
                  IntrusiveNode.createAFreeAccountText = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("create_username", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_displayname", (byte) -23);
                if (var2 != null) {
                  un.playerNameText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_password", (byte) -23);
                if (var2 != null) {
                  pi.passwordText = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("create_password_confirm", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlTexture.confirmPasswordText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_email", (byte) -23);
                if (null != var2) {
                  HardwareTurbulentWaterNoise.emailLoginText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_email_confirm", (byte) -23);
                if (null != var2) {
                  pq.confirmEmailText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_age", (byte) -23);
                if (var2 != null) {
                  DropDownArrowRenderer.ageText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_u13_email", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_u13_email_confirm", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("create_dob", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_country", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alternatives_header", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alternatives_select", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_suggestions", (byte) -23);
                if (null != var2) {
                  NodeHashTableIterator.suggestedNamesText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_more_suggestions", (byte) -23);
                if (var2 != null) {
                  BufferedSocket.moreSuggestionsText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_select_alternative", (byte) -23);
                if (null != var2) {
                  TextureFilter.useThisAlternativeAsText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_optin_news", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlEnvironmentWaterEffect.pleaseSendMeNewsText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_agreeterms", (byte) -23);
                if (var2 != null) {
                  cn.byClickingCreateYouText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_u13terms", (byte) -23);
                if (null != var2) {
                  qv.asYouAreUnderText = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("login_username_email", (byte) -23);
                if (null != var2) {
                  OpenGlEnvironmentWaterEffect.loginText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("login_username", (byte) -23);
                if (null != var2) {
                  ph.usernameText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("login_email", (byte) -23);
                if (null != var2) {
                  ow.emailText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("login_username_tooltip", (byte) -23);
                if (var2 != null) {
                  cn.theAccountNameYouText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("login_password_tooltip", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("login_login_tooltip", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("login_create_tooltip", (byte) -23);
                if (var2 != null) {
                  DroneDebris.createYourOwnFreeText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("login_justplay_tooltip", (byte) -23);
                if (null != var2) {
                  hg.playTheGameWithoutText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("login_back_tooltip", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("login_no_displayname", (byte) -23);
                if (null != var2) {
                  gs.youNeedToChooseText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_username_tooltip", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("create_username_hint", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_displayname_tooltip", (byte) -23);
                if (var2 != null) {
                  ShaderEffect.enterTheNameYouText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_displayname_hint", (byte) -23);
                if (null != var2) {
                  oq.playerNamesCanBeText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_password_tooltip", (byte) -23);
                if (null != var2) {
                  pl.enterAPasswordForText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_password_hint", (byte) -23);
                if (null != var2) {
                  qw.passwordsMustBeBetweenText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_password_confirm_tooltip", (byte) -23);
                if (null != var2) {
                  InstrumentNoteMask.typeYourPasswordAgainText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_email_tooltip", (byte) -23);
                if (null != var2) {
                  pi.yourEmailAddressIsText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_email_confirm_tooltip", (byte) -23);
                if (var2 != null) {
                  SoftwareTransform3D.typeYourEmailAddressText = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("create_age_tooltip", (byte) -23);
                if (null != var2) {
                  ContentDialog.typeYourAgeInText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_optin_news_tooltip", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlShoreWaveWaterEffect.updatesWillSentToText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_u13_email_tooltip", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_u13_email_confirm_tooltip", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_dob_tooltip", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("create_country_tooltip", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_optin_tooltip", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_continue", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_username_unavailable", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlReflectionEffect.field_e = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("create_username_available", (byte) -23);
                if (null != var2) {
                  PrimitiveType.nameIsAvailableText = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alert_namelength", (byte) -23);
                if (null != var2) {
                  ValidatedTextInputWidget.namesShouldContainAText = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alert_namechars", (byte) -23);
                if (null != var2) {
                  MarkerTrackWidget.namesCanOnlyContainText = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alert_nameleadingspace", (byte) -23);
                if (null != var2) {
                  ProgressDialog.namesCannotStartOrText = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alert_doublespace", (byte) -23);
                if (var2 != null) {
                  ma.namesCannotContainConsecutiveText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alert_passchars", (byte) -23);
                if (var2 != null) {
                  ContentTransitionDialog.passwordsCanOnlyContainText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alert_passrepeated", (byte) -23);
                if (var2 != null) {
                  ScrollPane.thisPasswordContainsRepeatedText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alert_passlength", (byte) -23);
                if (null != var2) {
                  ArchiveIndex.passwordsMustBeBetweenText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alert_passcontainsname", (byte) -23);
                if (var2 != null) {
                  ValidationStatusWidget.thisPasswordContainsYourText = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alert_passcontainsemail", (byte) -23);
                if (var2 != null) {
                  pc.thisPasswordContainsYourText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alert_passcontainsname_partial", (byte) -23);
                if (var2 != null) {
                  mm.thisPasswordIsPartText = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alert_checkname", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alert_invalidemail", (byte) -23);
                if (null != var2) {
                  DroneDebris.pleaseCheckIfAddressText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alert_email_unavailable", (byte) -23);
                if (var2 != null) {
                  BeveledCheckboxRenderer.emailAddressIsUnavailableText = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alert_invaliddate", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alert_invalidage", (byte) -23);
                if (null != var2) {
                  gn.pleaseEnterYourAgeText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alert_yearrange", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_alert_mismatch", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlFloatPostProcessEffect.thisEntryDoesnTText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_passwordvalid", (byte) -23);
                if (var2 != null) {
                  ka.passwordIsValidText = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("create_emailvalid", (byte) -23);
                if (var2 != null) {
                  ProxySocketConnector.emailIsValidText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("create_account_success", (byte) -23);
                if (null != var2) {
                  vl.accountCreatedSuccessfullyText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("invalid_name", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("cannot_add_yourself", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("unable_to_add_friend", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("unable_to_add_ignore", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("unable_to_delete_friend", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("unable_to_delete_ignore", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("friendlistfull", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("friendlistdupe", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("friendnotfound", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("ignorelistfull", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("ignorelistdupe", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("ignorenotfound", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("removeignorefirst", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("removefriendfirst", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("enterfriend_add", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("enterfriend_del", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("enterignore_add", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("enterignore_del", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("text_removed_from_game", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("text_lobby_pleaselogin_free", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("opengl", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("sse", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("purejava", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("waitingfor_graphics", (byte) -23);
                if (var2 != null) {
                  ProgressDialog.waitingForGraphicsText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("waitingfor_models", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("waitingfor_fonts", (byte) -23);
                if (var2 != null) {
                  ToolkitRasterBuffer.waitingForFontsText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("waitingfor_soundeffects", (byte) -23);
                if (var2 != null) {
                  GameClientShell.waitingForSoundEffectsText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("waitingfor_music", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlPostProcessEffect.waitingForMusicText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("waitingfor_instruments", (byte) -23);
                if (var2 != null) {
                  jf.waitingForInstrumentsText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("waitingfor_levels", (byte) -23);
                if (var2 != null) {
                  ArenaPad.waitingForLevelsText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("waitingfor_extradata", (byte) -23);
                if (var2 != null) {
                  StatefulWidgetRenderer.waitingForExtraDataText = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("waitingfor_languages", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("waitingfor_textures", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("waitingfor_animations", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("loading_graphics", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlTurbulentTextureEffect.loadingGraphicsText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("loading_models", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("loading_fonts", (byte) -23);
                if (null != var2) {
                  ow.loadingFontsText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("loading_soundeffects", (byte) -23);
                if (var2 != null) {
                  VertexLayout.loadingSoundEffectsText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("loading_music", (byte) -23);
                if (var2 != null) {
                  MessageDialog.loadingMusicText = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("loading_instruments", (byte) -23);
                if (var2 != null) {
                  ArchiveIndex.loadingInstrumentsText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("loading_levels", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlNormalMapGenerator.loadingLevelsText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("loading_extradata", (byte) -23);
                if (null != var2) {
                  rd.loadingExtraDataText = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("loading_languages", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("loading_textures", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("loading_animations", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("unpacking_graphics", (byte) -23);
                if (null != var2) {
                  SoftwareTransform3D.unpackingGraphicsText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("unpacking_models", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("unpacking_soundeffects", (byte) -23);
                if (var2 != null) {
                  hv.unpackingSoundEffectsText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("unpacking_music", (byte) -23);
                if (null != var2) {
                  ClientException.unpackingMusicText = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("unpacking_levels", (byte) -23);
                if (null != var2) {
                  om.unpackingLevelsText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("unpacking_languages", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("unpacking_animations", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("unpacking_toolkit", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("instructions", (byte) -23);
                if (null != var2) {
                  WidgetTheme.instructionsText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("tutorial", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("playtutorial", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("sound_colon", (byte) -23);
                if (null != var2) {
                  TurbulenceNoise3D.soundText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("music_colon", (byte) -23);
                if (var2 != null) {
                  gu.musicText = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("fullscreen", (byte) -23);
                if (null != var2) {
                  ResourceArchive.field_j = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("screensize", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("highscores", (byte) -23);
                if (var2 != null) {
                  MouseInputHandler.field_a = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rankings", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("achievements", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlRenderbuffer.achievementsText = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("achievementsthisgame", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("achievementsthissession", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("watchintroduction", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("quit", (byte) -23);
                if (var2 != null) {
                  RasterBuffer.quitText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("login_createaccount", (byte) -23);
                if (var2 != null) {
                  OpenGlTexture3D.logInCreateAccountText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("tohighscores", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("returntomainmenu", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("returntopausemenu", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("returntooptionsmenu_notpaused", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mainmenu", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("pausemenu", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("optionsmenu_notpaused", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("menu", (byte) -23);
            }
            void runChunk2() throws java.lang.RuntimeException {
                if (var2 != null) {
                  RenderPresentationException.menuText = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("selectlevel", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("nextlevel", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("startgame", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("newgame", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("resumegame", (byte) -23);
                if (null != var2) {
                  WhirlpoolTables.resumeGameText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("resumetutorial", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("skip", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("skiptutorial", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("skipending", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("restartlevel", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("endtest", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("endgame", (byte) -23);
                if (null != var2) {
                  nj.endGameText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("endtutorial", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("ok", (byte) -23);
                if (null != var2) {
                  tf.field_a = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("on", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("off", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("previous", (byte) -23);
                if (null != var2) {
                  CompactMeshGeometry.previousText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("prev", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("next", (byte) -23);
                if (null != var2) {
                  FadingWidget.nextText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_colon", (byte) -23);
                if (var2 != null) {
                  field_g = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("hotseatmultiplayer", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("entermultiplayerlobby", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("singleplayergame", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("returntogame", (byte) -23);
                if (var2 != null) {
                  id.returnToGameText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("endgameresign", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("offerdraw", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("canceldraw", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("acceptdraw", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("resign", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("returntolobby", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("cont", (byte) -23);
                if (null != var2) {
                  wd.continueText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("continue_spectating", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("messages", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_fastest", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_medium", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_best", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_directx", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_opengl", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_java", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_quality_high", (byte) -23);
                if (null != var2) {
                  mn.highText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_quality_low", (byte) -23);
                if (null != var2) {
                  bc.lowText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_mode", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_quality", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mode", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("quality", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("keys", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("objective", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("currentobjective", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("pressescforpausemenu", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("pressescforpausemenuortoskiptutorial", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("pressescforoptionsmenu_doesntpause", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("pressescforoptionsmenu_doesntpause_short", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("powerups", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("latestlevel_suffix", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("unreachedlevel_name", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("unreachedlevel_cannotplayreason", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("unreachedlevel_cannotplayreason_shorter", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("unreachedworld_cannotplayreason", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("memberslevel_name", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("memberslevel_cannotplayreason", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("membersworld_cannotplayreason", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("unreachedlevel_createtip", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("unreachedlevel_createtip_line1", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("unreachedlevel_createtip_line2", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("unreachedlevel_logintip", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("memberslevel_logintip", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("displayname_none", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("levelxofy1", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("levelxofy2", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("levelxofy", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("ingame_level", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mouseoveranicon", (byte) -23);
                if (null != var2) {
                  hk.mouseOverAnIconText = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("notyetachieved", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlRidgedWaterEffect.notYetAchievedText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("achieved", (byte) -23);
                if (null != var2) {
                  NoiseSliceGenerator.achievedText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("orbpoints", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("orbcoins", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("orbpoints_colon", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("orbcoins_colon", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("achieved_colon_description", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("secretachievement", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("no_highscores", (byte) -23);
                if (null != var2) {
                  HardwareSpecularEffect.noHighscoresText = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("hs_name", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("hs_level", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("hs_fromlevel", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("hs_tolevel", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("hs_score", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("hs_end", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("ingame_score", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("score_colon", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_leavegame", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_offerrematch", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_offerrematch_unrated", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_acceptrematch", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_acceptrematch_unrated", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_cancelrematch", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_cancelrematch_unrated", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_rematchnewgame", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_rematchnewgame_unrated", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_x_wantstodraw", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_x_offersrematch", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_x_offersrematch_unrated", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_youofferrematch", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_youofferrematch_unrated", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_youofferdraw", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_youresigned", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_youresigned_rematch", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_x_hasresignedandleft", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_x_hasresigned_rematch", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_x_hasresigned", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_x_hasleft", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_x_haswon", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_youhavewon", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_gamedrawn", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_timeremaining", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_x_turn", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_yourturn", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("gameover", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_hidechat", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_showchat_nounread", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_showchat_unread1", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mp_showchat_unread2", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("click_to_quickchat", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("autorespond", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("quickchat_help", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("quickchat_help_title", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("quickchat_shortcut_help,0", (byte) -23);
                if (null != var2) {
                  IntrusiveNode.field_j[0] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("quickchat_shortcut_help,1", (byte) -23);
                if (null != var2) {
                  IntrusiveNode.field_j[1] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("quickchat_shortcut_help,2", (byte) -23);
                if (var2 != null) {
                  IntrusiveNode.field_j[2] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("quickchat_shortcut_help,3", (byte) -23);
                if (null != var2) {
                  IntrusiveNode.field_j[3] = MusicVoice.a(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.a("quickchat_shortcut_help,4", (byte) -23);
                if (null != var2) {
                  IntrusiveNode.field_j[4] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("quickchat_shortcut_help,5", (byte) -23);
                if (null != var2) {
                  IntrusiveNode.field_j[5] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("quickchat_shortcut_keys,0", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlTransform3D.field_h[0] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("quickchat_shortcut_keys,1", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlTransform3D.field_h[1] = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("quickchat_shortcut_keys,2", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlTransform3D.field_h[2] = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("quickchat_shortcut_keys,3", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlTransform3D.field_h[3] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("quickchat_shortcut_keys,4", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlTransform3D.field_h[4] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("quickchat_shortcut_keys,5", (byte) -23);
                if (null != var2) {
                  LegacyOpenGlTransform3D.field_h[5] = MusicVoice.a(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.a("keychar_the_character_under_questionmark", (byte) -23);
                if (var2 != null) {
                  SoftwareTransform3D.a(var2[0], (byte) -51);
                }
                var2 = OpenGlCubeTexture.a("rating_noratings", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rating_rating", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("rating_played", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("rating_won", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("rating_lost", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("rating_drawn", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("benefits_fullscreen", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("benefits_noadverts", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("benefits_price", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("members_expansion_benefits,0", (byte) -23);
                if (null != var2) {
                  mo.membershipBenefitLines[0] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("members_expansion_benefits,1", (byte) -23);
                if (var2 != null) {
                  mo.membershipBenefitLines[1] = MusicVoice.a(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.a("members_expansion_benefits,2", (byte) -23);
                if (null != var2) {
                  mo.membershipBenefitLines[2] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("members_expansion_price_top", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("members_expansion_price_bottom", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("reconnect_lost_seq,0", (byte) -23);
                if (null != var2) {
                  PlayerDrone.reconnectStatusFrames[0] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("reconnect_lost_seq,1", (byte) -23);
                if (var2 != null) {
                  PlayerDrone.reconnectStatusFrames[1] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("reconnect_lost_seq,2", (byte) -23);
                if (var2 != null) {
                  PlayerDrone.reconnectStatusFrames[2] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("reconnect_lost_seq,3", (byte) -23);
                if (null != var2) {
                  PlayerDrone.reconnectStatusFrames[3] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("reconnect_lost", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("reconnect_restored", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("reconnect_please_check", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("reconnect_wait", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("reconnect_retry", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("reconnect_resume", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("reconnect_or", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("reconnect_exitfs", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("reconnect_exitfs_quit", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("reconnect_quit", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("reconnect_check_fs", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("reconnect_check_nonfs", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("fs_accept_beforeaccept", (byte) -23);
                if (var2 != null) {
                  fd.clickText = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("fs_button_accept", (byte) -23);
                if (var2 != null) {
                  km.acceptText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("fs_accept_afteraccept", (byte) -23);
                if (null != var2) {
                  ws.toKeepFullscreenOrText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("fs_button_cancel", (byte) -23);
                if (var2 != null) {
                  up.cancelText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("fs_accept_aftercancel", (byte) -23);
                if (var2 != null) {
                  OpenGlShaderProgram.toReturnToTheText = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("fs_accept_countdown_sing", (byte) -23);
                if (null != var2) {
                  ClientExceptionSupport.ifYouDoNothingText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("fs_accept_countdown_pl", (byte) -23);
                if (null != var2) {
                  lq.field_a = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("fs_nonmember", (byte) -23);
                if (var2 != null) {
                  IntrusiveNode.fullscreenPlayIsAnText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("fs_button_close", (byte) -23);
                if (null != var2) {
                  DraggableWidget.closeText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("fs_button_members", (byte) -23);
                if (null != var2) {
                  AudioServiceThread.membersText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("fs_unavailable", (byte) -23);
                if (var2 != null) {
                  field_f = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("fs_unavailable_try_signed_applet", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlGraphicsToolkit.unfortunatelyYourConfigurationDoesnText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("fs_focus", (byte) -23);
                if (null != var2) {
                  LimitedRandomAccessFile.field_c = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("fs_focus_or_resolution", (byte) -23);
                if (null != var2) {
                  PasswordInputRenderer.unfortunatelyThereWasAText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("fs_timeout", (byte) -23);
                if (null != var2) {
                  OpenGlBuffer.fullscreenModeWasCancelledText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("fs_button_tryagain", (byte) -23);
                if (null != var2) {
                  FullscreenMembershipDialog.tryAgainText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_ui_fs_countdown", (byte) -23);
                if (var2 != null) {
                  PasswordInputRenderer.ifYouDoNothingText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mb_caption_title", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mb_including_gamename", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mb_full_access_1", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mb_full_access_2", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mb_achievement_count_1", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mb_achievement_count_2", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mb_exclusive_1", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mb_exclusive_2", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("me_extra_benefits", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("hs_friend_tip", (byte) -23);
                if (null != var2) {
                  LinkWidgetRenderer.friendsCanBeAddedText = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("hs_friend_tip_multi", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("hs_mode_name,0", (byte) -23);
                if (null != var2) {
                  PlayingSound.scoreFilterLabels[0] = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("hs_mode_name,1", (byte) -23);
                if (null != var2) {
                  PlayingSound.scoreFilterLabels[1] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("hs_mode_name,2", (byte) -23);
                if (null != var2) {
                  PlayingSound.scoreFilterLabels[2] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rating_mode_name,0", (byte) -23);
                if (null != var2) {
                  cj.leaderboardSortLabels[0] = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("rating_mode_name,1", (byte) -23);
                if (null != var2) {
                  cj.leaderboardSortLabels[1] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("rating_mode_long_name,0", (byte) -23);
                if (null != var2) {
                  NodeHashTableIterator.leaderboardSortStatusLabels[0] = MusicVoice.a(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.a("rating_mode_long_name,1", (byte) -23);
                if (var2 != null) {
                  NodeHashTableIterator.leaderboardSortStatusLabels[1] = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_config_fixed_size", (byte) -23);
                if (var2 != null) {
                  kp.classicText = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_config_resizable", (byte) -23);
                if (var2 != null) {
                  VertexLayout.resizableText = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_config_fullscreen", (byte) -23);
                if (var2 != null) {
                  PlayingSound.fullScreenText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_config_done", (byte) -23);
                if (var2 != null) {
                  DraggableWidget.backText = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_config_apply", (byte) -23);
                if (var2 != null) {
                  dn.applyText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_config_title", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_config_instruction", (byte) -23);
                if (var2 != null) {
                  sl.largeScreenSizesAndText = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("graphics_config_need_memory", (byte) -23);
                if (var2 != null) {
                  lw.moreMemoryIsRequiredText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("pleasewait_dotdotdot", (byte) -23);
                if (null != var2) {
                  mm.pleaseWaitText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("serviceunavailable", (byte) -23);
                if (null != var2) {
                  SectorCacheStore.serviceUnavailableText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("createtouse", (byte) -23);
                if (null != var2) {
                  InstrumentNoteMask.createAFreeAccountText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("achievementsoffline", (byte) -23);
                if (null != var2) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("warning", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("DEFAULT_PLAYER_NAME", (byte) -23);
                if (var2 != null) {
                  FullscreenMembershipDialog.playerText = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin1", (byte) -23);
                if (var2 != null) {
                  LegacyOpenGlNormalMapGenerator.youAreNotCurrentlyText = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin2,1", (byte) -23);
                if (var2 != null) {
                  pl.field_r[1] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin2,2", (byte) -23);
                if (null != var2) {
                  pl.field_r[2] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin2,3", (byte) -23);
                if (var2 != null) {
                  pl.field_r[3] = MusicVoice.a(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin2,4", (byte) -23);
                if (var2 != null) {
                  pl.field_r[4] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin2,5", (byte) -23);
                if (null != var2) {
                  pl.field_r[5] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin2,6", (byte) -23);
                if (null != var2) {
                  pl.field_r[6] = MusicVoice.a(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin2,7", (byte) -23);
                if (var2 != null) {
                  pl.field_r[7] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin3,1", (byte) -23);
                if (var2 != null) {
                  LabeledWidget.field_G[1] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin3,2", (byte) -23);
                if (var2 != null) {
                  LabeledWidget.field_G[2] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin3,3", (byte) -23);
                if (null != var2) {
                  LabeledWidget.field_G[3] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin3,4", (byte) -23);
                if (null != var2) {
                  LabeledWidget.field_G[4] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin3,5", (byte) -23);
                if (null != var2) {
                  LabeledWidget.field_G[5] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin3,6", (byte) -23);
                if (var2 != null) {
                  LabeledWidget.field_G[6] = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin3,7", (byte) -23);
                if (var2 != null) {
                  LabeledWidget.field_G[7] = MusicVoice.a(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.a("discard", (byte) -23);
                if (null != var2) {
                  vp.discardText = MusicVoice.a(param0 ^ 7, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin4,1", (byte) -23);
                if (null != var2) {
                  kr.field_f[1] = MusicVoice.a(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin4,2", (byte) -23);
                if (null != var2) {
                  kr.field_f[2] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin4,3", (byte) -23);
                if (var2 != null) {
                  kr.field_f[3] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin4,4", (byte) -23);
                if (var2 != null) {
                  kr.field_f[4] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin4,5", (byte) -23);
            }
            void runChunk3() throws java.lang.RuntimeException {
                if (var2 != null) {
                  kr.field_f[5] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin4,6", (byte) -23);
                if (var2 != null) {
                  kr.field_f[6] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin4,7", (byte) -23);
                if (var2 != null) {
                  kr.field_f[7] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin_notloggedin", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin_alternate,1", (byte) -23);
                if (var2 != null) {
                  ds.field_b[1] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin_alternate,2", (byte) -23);
                if (var2 != null) {
                  ds.field_b[2] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin_alternate,3", (byte) -23);
                if (null != var2) {
                  ds.field_b[3] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin_alternate,4", (byte) -23);
                if (var2 != null) {
                  ds.field_b[4] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin_alternate,5", (byte) -23);
                if (null != var2) {
                  ds.field_b[5] = MusicVoice.a(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin_alternate,6", (byte) -23);
                if (null != var2) {
                  ds.field_b[6] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("mustlogin_alternate,7", (byte) -23);
                if (null != var2) {
                  ds.field_b[7] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("subscription_cost_monthly,0", (byte) -23);
                if (null != var2) {
                  fa.field_c[0] = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("subscription_cost_monthly,1", (byte) -23);
                if (var2 != null) {
                  fa.field_c[1] = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("subscription_cost_monthly,2", (byte) -23);
                if (null != var2) {
                  fa.field_c[2] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("subscription_cost_monthly,3", (byte) -23);
                if (null != var2) {
                  fa.field_c[3] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("subscription_cost_monthly,4", (byte) -23);
                if (null != var2) {
                  fa.field_c[4] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("subscription_cost_monthly,5", (byte) -23);
                if (var2 != null) {
                  fa.field_c[5] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("subscription_cost_monthly,6", (byte) -23);
                if (null != var2) {
                  fa.field_c[6] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("subscription_cost_monthly,7", (byte) -23);
                if (null != var2) {
                  fa.field_c[7] = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("subscription_cost_monthly,8", (byte) -23);
                if (var2 != null) {
                  fa.field_c[8] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("subscription_cost_monthly,9", (byte) -23);
                if (null != var2) {
                  fa.field_c[9] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("subscription_cost_monthly,10", (byte) -23);
                if (null != var2) {
                  fa.field_c[10] = MusicVoice.a(param0 - 7, var2);
                }
                var2 = OpenGlCubeTexture.a("subscription_cost_monthly,11", (byte) -23);
                if (null != var2) {
                  fa.field_c[11] = MusicVoice.a(GzipDecompressor.bitwiseXor(param0, 7), var2);
                }
                var2 = OpenGlCubeTexture.a("subscription_cost_monthly,12", (byte) -23);
                if (var2 != null) {
                  fa.field_c[12] = MusicVoice.a(0, var2);
                }
                var2 = OpenGlCubeTexture.a("sentence_separator", (byte) -23);
                if (var2 != null) {
                  MusicVoice.a(0, var2);
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

    final static Sprite[] a(int param0, int param1, int param2, int param3, int param4) {
        Sprite dupTemp$2 = null;
        Sprite dupTemp$3 = null;
        Sprite[] var5 = null;
        RuntimeException var5_ref = null;
        Sprite[] stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new Sprite[9];
          dupTemp$2 = OpenGlAssemblyProgram.createSolidSprite(param1, param4, GzipDecompressor.bitwiseXor(param2, 3));
          var5[6] = dupTemp$2;
          var5[3] = dupTemp$2;
          var5[2] = dupTemp$2;
          var5[1] = dupTemp$2;
          var5[param2] = dupTemp$2;
          dupTemp$3 = OpenGlAssemblyProgram.createSolidSprite(param1, param0, 3);
          var5[8] = dupTemp$3;
          var5[7] = dupTemp$3;
          var5[5] = dupTemp$3;
          if (0 != param3) {
            var5[4] = OpenGlAssemblyProgram.createSolidSprite(64, param3, param2 + 3);
          }
          stackIn_5_0 = var5;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var5_ref), "ni.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
