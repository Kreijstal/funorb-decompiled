/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class NetworkGameClient extends GameApplet {
    private boolean field_v;
    private int field_m;
    private int field_q;
    private int field_p;
    String field_t;
    private boolean field_n;
    static bl[] field_w;
    private int field_s;
    private int field_o;
    private boolean field_r;
    private long field_x;
    private int field_l;
    static de field_k;
    static BitmapFont field_u;

    final void updateLoginFlow(byte param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var2_int = 0;
        int var3 = 0;
        boolean stackIn_26_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Main.field_T;
        try {
          if (!ri.b((byte) 23)) {
            if (!(DequeWidgetContainer.field_A < 10)) {
              if (lc.a((byte) -94)) {
                if (cd.field_e == 0) {
                  discarded$2 = this.processAccountUiActions(false, false, 10);
                  if (var3 != 0) {
                    AccountNameAvailabilityValidator.a(2, eg.field_f);
                    AccountRequestState.a((byte) 20);
                    stackIn_26_1 = (null != DiskCacheWorker.field_a);
                    discarded$3 = this.processAccountUiActions(stackIn_26_1, false, 10);
                  }
                } else {
                  AccountNameAvailabilityValidator.a(2, eg.field_f);
                  if (var3 != 0) {
                    AccountRequestState.a((byte) 20);
                    stackIn_26_1 = (null != DiskCacheWorker.field_a);
                    discarded$3 = this.processAccountUiActions(stackIn_26_1, false, 10);
                  }
                }
              } else {
                AccountRequestState.a((byte) 20);
                if (var3 != 0) {
                  stackIn_26_1 = (null != DiskCacheWorker.field_a);
                  discarded$3 = this.processAccountUiActions(stackIn_26_1, false, 10);
                }
              }
            }
          } else {
            stackIn_26_1 = (null != DiskCacheWorker.field_a);
            discarded$3 = this.processAccountUiActions(stackIn_26_1, false, 10);
          }
          var2_int = -98 % ((param0 + 32) / 51);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "c.A(" + param0 + ')');
        }
    }

    private final void enablePacketTwo(int param0) {
        try {
          nl.field_e[2] = true;
          int var2_int = -80 / ((param0 - 41) / 62);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "c.I(" + param0 + ')');
        }
    }

    private final static void loadSharedInterfaceText(int param0, ResourceArchive param1) {
        class ClientTextLoader {
            RuntimeException stackIn_2608_0;
            StringBuilder stackIn_2608_1;
            String stackIn_2609_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int param0;
            ResourceArchive param1;
            boolean finished;
            ClientTextLoader(int initialParam0, ResourceArchive initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_2608_0 = null;
                this.stackIn_2608_1 = null;
                this.stackIn_2609_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void loadLoginLobbyAndChatText() throws java.lang.RuntimeException {
                FrameTimer.field_d = param1;
                var2 = SectorCacheStore.a("loginm3", (byte) -127);
                if (null != var2) {
                  ImageProducerRasterBuffer.field_k = GzipInflater.a(var2, (byte) 81);
                }
                var2 = SectorCacheStore.a("loginm2", (byte) -127);
                if (var2 != null) {
                  e.field_f = GzipInflater.a(var2, (byte) 116);
                }
                var2 = SectorCacheStore.a("loginm1", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 92);
                }
                var2 = SectorCacheStore.a("idlemessage20min", (byte) -127);
                if (null != var2) {
                  ResizableModalDialog.field_S = GzipInflater.a(var2, (byte) 113);
                }
                var2 = SectorCacheStore.a("error_js5crc", (byte) -127);
                if (null != var2) {
                  kk.field_a = GzipInflater.a(var2, (byte) 120);
                }
                var2 = SectorCacheStore.a("error_js5io", (byte) -127);
                if (var2 != null) {
                  ma.field_b = GzipInflater.a(var2, (byte) 126);
                }
                var2 = SectorCacheStore.a("error_js5connect_full", (byte) -127);
                if (var2 != null) {
                  rh.field_g = GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("error_js5connect", (byte) -127);
                if (null != var2) {
                  ClientException.field_c = GzipInflater.a(var2, (byte) 108);
                }
                var2 = SectorCacheStore.a("login_gameupdated", (byte) -127);
                if (var2 != null) {
                  ve.field_b = GzipInflater.a(var2, (byte) 97);
                }
                var2 = SectorCacheStore.a("create_unable", (byte) -127);
                if (var2 != null) {
                  ResourceArchive.field_i = GzipInflater.a(var2, (byte) 116);
                }
                var2 = SectorCacheStore.a("create_ineligible", (byte) -127);
                if (var2 != null) {
                  ValidationStatusWidget.field_N = GzipInflater.a(var2, (byte) 121);
                }
                var2 = SectorCacheStore.a("usernameprompt", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("passwordprompt", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 81);
                }
                var2 = SectorCacheStore.a("andagainprompt", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("ticketing_read", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 84);
                }
                var2 = SectorCacheStore.a("ticketing_ignore", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 86);
                }
                var2 = SectorCacheStore.a("ticketing_oneunread", (byte) -127);
                if (var2 != null) {
                  dh.field_g = GzipInflater.a(var2, (byte) 122);
                }
                var2 = SectorCacheStore.a("ticketing_xunread", (byte) -127);
                if (null != var2) {
                  nc.field_a = GzipInflater.a(var2, (byte) 85);
                }
                var2 = SectorCacheStore.a("ticketing_gotowebsite", (byte) -127);
                if (null != var2) {
                  TextHotspotBounds.field_l = GzipInflater.a(var2, (byte) 79);
                }
                var2 = SectorCacheStore.a("ticketing_waitingformessages", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 109);
                }
                var2 = SectorCacheStore.a("mu_chat_on", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 125);
                }
                var2 = SectorCacheStore.a("mu_chat_friends", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 105);
                }
                var2 = SectorCacheStore.a("mu_chat_off", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 95);
                }
                var2 = SectorCacheStore.a("mu_chat_lobby", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 111);
                }
                var2 = SectorCacheStore.a("mu_chat_public", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("mu_chat_ignore", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 125);
                }
                var2 = SectorCacheStore.a("mu_chat_tips", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 108);
                }
                var2 = SectorCacheStore.a("mu_chat_game", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 90);
                }
                var2 = SectorCacheStore.a("mu_chat_private", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 110);
                }
                var2 = SectorCacheStore.a("mu_x_entered_game", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 86);
                }
                var2 = SectorCacheStore.a("mu_x_joined_your_game", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("mu_x_entered_other_game", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 111);
                }
                var2 = SectorCacheStore.a("mu_x_left_lobby", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 78);
                }
                var2 = SectorCacheStore.a("mu_x_lost_con", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 108);
                }
                var2 = SectorCacheStore.a("mu_x_cannot_join_full", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 110);
                }
                var2 = SectorCacheStore.a("mu_x_cannot_join_inprogress", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 84);
                }
                var2 = SectorCacheStore.a("mu_x_declined_invite", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("mu_x_withdrew_request", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 124);
                }
                var2 = SectorCacheStore.a("mu_x_removed", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 117);
                }
                var2 = SectorCacheStore.a("mu_x_dropped_out", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 114);
                }
                var2 = SectorCacheStore.a("mu_entered_other_game", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 79);
                }
                var2 = SectorCacheStore.a("mu_game_is_full", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 118);
                }
                var2 = SectorCacheStore.a("mu_game_has_started", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 102);
                }
                var2 = SectorCacheStore.a("mu_you_declined_invite", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 125);
                }
                var2 = SectorCacheStore.a("mu_invite_withdrawn", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 97);
                }
                var2 = SectorCacheStore.a("mu_request_declined", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 81);
                }
                var2 = SectorCacheStore.a("mu_request_withdrawn", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 109);
                }
                var2 = SectorCacheStore.a("mu_all_players_have_left", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("mu_lobby_name", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 94);
                }
                var2 = SectorCacheStore.a("mu_lobby_rating", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 110);
                }
                var2 = SectorCacheStore.a("mu_lobby_friend_add", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 101);
                }
                var2 = SectorCacheStore.a("mu_lobby_friend_rm", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 82);
                }
                var2 = SectorCacheStore.a("mu_lobby_name_add", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 123);
                }
                var2 = SectorCacheStore.a("mu_lobby_name_rm", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 114);
                }
                var2 = SectorCacheStore.a("mu_lobby_location", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 124);
                }
                var2 = SectorCacheStore.a("mu_gamelist_all_games", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 122);
                }
                var2 = SectorCacheStore.a("mu_gamelist_status", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 113);
                }
                var2 = SectorCacheStore.a("mu_gamelist_owner", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 123);
                }
                var2 = SectorCacheStore.a("mu_gamelist_players", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("mu_gamelist_avg_rating", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("mu_gamelist_options", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 86);
                }
                var2 = SectorCacheStore.a("mu_gamelist_elapsed_time", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 105);
                }
                var2 = SectorCacheStore.a("mu_play_rated", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 113);
                }
                var2 = SectorCacheStore.a("mu_create_unrated", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 116);
                }
                var2 = SectorCacheStore.a("mu_options", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 101);
                }
                var2 = SectorCacheStore.a("mu_options_whocanjoin", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 99);
                }
                var2 = SectorCacheStore.a("mu_options_players", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 84);
                }
                var2 = SectorCacheStore.a("mu_options_dontmind", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 107);
                }
                var2 = SectorCacheStore.a("mu_options_allow_spectate", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 111);
                }
                var2 = SectorCacheStore.a("mu_options_ratedgametype", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 118);
                }
                var2 = SectorCacheStore.a("yes", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 125);
                }
                var2 = SectorCacheStore.a("no", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 122);
                }
                var2 = SectorCacheStore.a("mu_invite_players", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 85);
                }
                var2 = SectorCacheStore.a("close", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 92);
                }
                var2 = SectorCacheStore.a("add_x_to_friends", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 123);
                }
                var2 = SectorCacheStore.a("add_x_to_ignore", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 101);
                }
                var2 = SectorCacheStore.a("rm_x_from_friends", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 97);
                }
                var2 = SectorCacheStore.a("rm_x_from_ignore", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 114);
                }
                var2 = SectorCacheStore.a("send_pm_to_x", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 110);
                }
                var2 = SectorCacheStore.a("send_qc_to_x", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 80);
                }
                var2 = SectorCacheStore.a("send_pm", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 90);
                }
                var2 = SectorCacheStore.a("invite_accept_xs_game", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 124);
                }
                var2 = SectorCacheStore.a("invite_decline_xs_game", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 121);
                }
                var2 = SectorCacheStore.a("join_xs_game", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 127);
                }
                var2 = SectorCacheStore.a("join_request_xs_game", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 102);
                }
                var2 = SectorCacheStore.a("join_withdraw_request_xs_game", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("mu_gameopt_kick_x_from_this_game", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 105);
                }
                var2 = SectorCacheStore.a("mu_gameopt_withdraw_invite_to_x", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 109);
                }
                var2 = SectorCacheStore.a("mu_gameopt_accept_x_into_game", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 125);
                }
                var2 = SectorCacheStore.a("mu_gameopt_reject_x_from_game", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 117);
                }
                var2 = SectorCacheStore.a("mu_gameopt_invite_x_to_game", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 118);
                }
                var2 = SectorCacheStore.a("report_x_for_abuse", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 90);
                }
                var2 = SectorCacheStore.a("unable_to_send_message_password_a", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 90);
                }
                var2 = SectorCacheStore.a("unable_to_send_message_password_b", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("mu_chat_lobby_show_all", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 114);
                }
                var2 = SectorCacheStore.a("mu_chat_lobby_friends_only", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 110);
                }
                var2 = SectorCacheStore.a("mu_chat_lobby_friends", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("mu_chat_lobby_hide", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 85);
                }
                var2 = SectorCacheStore.a("mu_chat_game_show_all", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 103);
                }
                var2 = SectorCacheStore.a("mu_chat_game_friends_only", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 118);
                }
                var2 = SectorCacheStore.a("mu_chat_game_friends", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 118);
                }
                var2 = SectorCacheStore.a("mu_chat_game_hide", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 80);
                }
                var2 = SectorCacheStore.a("mu_chat_pm_show_all", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("mu_chat_pm_friends_only", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 127);
                }
                var2 = SectorCacheStore.a("mu_chat_pm_friends", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("mu_chat_invisible_and_silent_mode", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 90);
                }
                var2 = SectorCacheStore.a("you_have_been_removed_from_xs_game", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 92);
                }
                var2 = SectorCacheStore.a("your_rating_is_x", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("you_are_on_x_server", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 102);
                }
                var2 = SectorCacheStore.a("rated_game", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("unrated_game", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 94);
                }
                var2 = SectorCacheStore.a("rated_game_tips", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 87);
                }
                var2 = SectorCacheStore.a("searching_for_opponent_singular", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 87);
                }
                var2 = SectorCacheStore.a("searching_for_opponents_plural", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("find_opponent_singular", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 92);
                }
                var2 = SectorCacheStore.a("find_opponents_plural", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("rated_game_tips_setup_singular", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 86);
                }
                var2 = SectorCacheStore.a("rated_game_tips_setup_plural", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("waiting_to_start_hint", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 117);
                }
                var2 = SectorCacheStore.a("your_game", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 102);
                }
                var2 = SectorCacheStore.a("game_full", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 110);
                }
                var2 = SectorCacheStore.a("join_requests_one", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 119);
                }
                var2 = SectorCacheStore.a("join_requests_many", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 126);
                }
                var2 = SectorCacheStore.a("xs_game", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 97);
                }
                var2 = SectorCacheStore.a("waiting_for_x_to_start_game", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 95);
                }
                var2 = SectorCacheStore.a("game_options_changed", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 105);
                }
                var2 = SectorCacheStore.a("players_x_of_y", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 114);
                }
                var2 = SectorCacheStore.a("message_lobby", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 103);
                }
                var2 = SectorCacheStore.a("quickchat_lobby", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("message_game", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 117);
                }
                var2 = SectorCacheStore.a("message_team", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 109);
                }
                var2 = SectorCacheStore.a("quickchat_game", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("kick", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("inviting_x", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("x_wants_to_join", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 112);
                }
                var2 = SectorCacheStore.a("accept", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 124);
                }
                var2 = SectorCacheStore.a("reject", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 122);
                }
                var2 = SectorCacheStore.a("invite", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 125);
                }
                var2 = SectorCacheStore.a("status_concluded", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("status_spectate", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 121);
                }
                var2 = SectorCacheStore.a("status_playing", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("status_join", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 106);
                }
                var2 = SectorCacheStore.a("status_private", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 111);
                }
                var2 = SectorCacheStore.a("status_full", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 78);
                }
                var2 = SectorCacheStore.a("players_in_game", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 119);
                }
                var2 = SectorCacheStore.a("you_are_invited_to_xs_game", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("asking_to_join_xs_game", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 110);
                }
                var2 = SectorCacheStore.a("who_can_join", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 98);
                }
                var2 = SectorCacheStore.a("you_can_join", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("you_can_ask_to_join", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 78);
                }
                var2 = SectorCacheStore.a("you_cannot_join_in_progress", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 108);
                }
                var2 = SectorCacheStore.a("you_can_spectate", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 108);
                }
                var2 = SectorCacheStore.a("you_can_not_spectate", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 79);
                }
                var2 = SectorCacheStore.a("spectate_xs_game", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 94);
                }
                var2 = SectorCacheStore.a("hide_players_in_xs_game", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 79);
                }
                var2 = SectorCacheStore.a("show_players_in_xs_game", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 81);
                }
                var2 = SectorCacheStore.a("connecting_to_friend_server_twoline", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 116);
                }
                var2 = SectorCacheStore.a("loading", (byte) -127);
                if (null != var2) {
                  FrameTimer.field_c = GzipInflater.a(var2, (byte) 120);
                }
                var2 = SectorCacheStore.a("offline", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 107);
                }
                var2 = SectorCacheStore.a("multiconst_invite_only", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 101);
                }
                var2 = SectorCacheStore.a("multiconst_clan", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 90);
                }
                var2 = SectorCacheStore.a("multiconst_friends", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 110);
                }
                var2 = SectorCacheStore.a("multiconst_similar_rating", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 94);
                }
                var2 = SectorCacheStore.a("multiconst_open", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 93);
                }
                var2 = SectorCacheStore.a("no_options_available", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("reportabuse", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 107);
                }
                var2 = SectorCacheStore.a("presstabtochat", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 86);
                }
                var2 = SectorCacheStore.a("pressf10toquickchat", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 98);
                }
                var2 = SectorCacheStore.a("dob_chatdisabled", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 79);
                }
                var2 = SectorCacheStore.a("dob_enterforchat", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 93);
                }
                var2 = SectorCacheStore.a("tab_hidechattemporarily", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 89);
                }
                var2 = SectorCacheStore.a("esc_cancelprivatemessage", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("esc_cancelthisline", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("privatequickchat_from_x", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 121);
                }
                var2 = SectorCacheStore.a("privatequickchat_to_x", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("privatechat_blankarea_explanation", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 97);
                }
                var2 = SectorCacheStore.a("publicchat_unavailable_ratedgame", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 94);
                }
                var2 = SectorCacheStore.a("privatechat_friend_offline", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 111);
                }
                var2 = SectorCacheStore.a("privatechat_friend_notlisted", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 99);
                }
                var2 = SectorCacheStore.a("chatviewscrolledup", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("thisisrunescapeclan", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 103);
                }
                var2 = SectorCacheStore.a("thisisrunescapeclan_notowner", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 94);
                }
                var2 = SectorCacheStore.a("runescapeclan", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("rated_membersonly", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 114);
                }
                var2 = SectorCacheStore.a("gameopt_membersonly", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 127);
                }
                var2 = SectorCacheStore.a("gameopt_1moreratedgame", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 97);
                }
                var2 = SectorCacheStore.a("gameopt_moreratedgames", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 99);
                }
                var2 = SectorCacheStore.a("gameopt_needrating", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 114);
                }
                var2 = SectorCacheStore.a("gameopt_unratedonly", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 90);
                }
                var2 = SectorCacheStore.a("gameopt_notunlocked", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 89);
                }
                var2 = SectorCacheStore.a("gameopt_cannotbecombined1", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 79);
                }
                var2 = SectorCacheStore.a("gameopt_cannotbecombined2", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 91);
                }
                var2 = SectorCacheStore.a("gameopt_playernotmember", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("gameopt_younotmember", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("gameopt_playerneedsrating", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("gameopt_youneedrating", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 95);
                }
                var2 = SectorCacheStore.a("gameopt_playerneedsratedgames", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 102);
                }
                var2 = SectorCacheStore.a("gameopt_youneedratedgames", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 81);
                }
                var2 = SectorCacheStore.a("gameopt_playerneeds1ratedgame", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 116);
                }
                var2 = SectorCacheStore.a("gameopt_youneed1ratedgame", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 102);
                }
                var2 = SectorCacheStore.a("gameopt_playerhasntunlocked", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("gameopt_youhaventunlocked", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 93);
                }
                var2 = SectorCacheStore.a("gameopt_trychanging1", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 106);
                }
                var2 = SectorCacheStore.a("gameopt_trychanging2", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 123);
                }
                var2 = SectorCacheStore.a("gameopt_needchanging1", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("gameopt_needchanging2", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 91);
                }
                var2 = SectorCacheStore.a("gameopt_mightchange", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 117);
                }
                var2 = SectorCacheStore.a("gameopt_playersdontqualify", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 106);
                }
                var2 = SectorCacheStore.a("gameopt_playersdontqualify_selectgametab", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 123);
                }
                var2 = SectorCacheStore.a("gameopt_unselectedoptions", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 94);
                }
                var2 = SectorCacheStore.a("gameopt_pleaseselectoption1", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 89);
                }
                var2 = SectorCacheStore.a("gameopt_pleaseselectoption2", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 89);
                }
                var2 = SectorCacheStore.a("gameopt_badnumplayers", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 114);
                }
                var2 = SectorCacheStore.a("gameopt_inviteplayers_or_trychanging1", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 122);
                }
                var2 = SectorCacheStore.a("gameopt_inviteplayers_or_trychanging2", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 82);
                }
                var2 = SectorCacheStore.a("gameopt_novalidcombos", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 84);
                }
                var2 = SectorCacheStore.a("gameopt_pleasetrychanging", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 112);
                }
                var2 = SectorCacheStore.a("ra_title", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 120);
                }
                var2 = SectorCacheStore.a("ra_mutethisplayer", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 87);
                }
                var2 = SectorCacheStore.a("ra_suggestmute", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 86);
                }
                var2 = SectorCacheStore.a("ra_intro", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 93);
                }
                var2 = SectorCacheStore.a("ra_intro_no_name", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 108);
                }
                var2 = SectorCacheStore.a("ra_explanation", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 117);
                }
                var2 = SectorCacheStore.a("rule_pillar_0", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 82);
                }
                var2 = SectorCacheStore.a("rule_0_0", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 87);
                }
                var2 = SectorCacheStore.a("rule_0_1", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 94);
                }
                var2 = SectorCacheStore.a("rule_0_2", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 119);
                }
                var2 = SectorCacheStore.a("rule_0_3", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 123);
                }
                var2 = SectorCacheStore.a("rule_0_4", (byte) -127);
            }
            void loadAccountFormsAndLoadingText() throws java.lang.RuntimeException {
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("rule_0_5", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 84);
                }
                var2 = SectorCacheStore.a("rule_pillar_1", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 89);
                }
                var2 = SectorCacheStore.a("rule_1_0", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("rule_1_1", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 103);
                }
                var2 = SectorCacheStore.a("rule_1_2", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 106);
                }
                var2 = SectorCacheStore.a("rule_1_3", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 103);
                }
                var2 = SectorCacheStore.a("rule_1_4", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 79);
                }
                var2 = SectorCacheStore.a("rule_pillar_2", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 102);
                }
                var2 = SectorCacheStore.a("rule_2_0", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 123);
                }
                var2 = SectorCacheStore.a("rule_2_1", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 105);
                }
                var2 = SectorCacheStore.a("rule_2_2", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("createafreeaccount", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 111);
                }
                var2 = SectorCacheStore.a("cancel", (byte) -127);
                if (null != var2) {
                  cj.field_m = GzipInflater.a(var2, (byte) 99);
                }
                var2 = SectorCacheStore.a("pleaselogintoplay", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 92);
                }
                var2 = SectorCacheStore.a("pleaselogin", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 123);
                }
                var2 = SectorCacheStore.a("pleaselogin_member", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 108);
                }
                var2 = SectorCacheStore.a("invaliduserorpass", (byte) -127);
                if (null != var2) {
                  jh.field_d = GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("pleasetryagain", (byte) -127);
                if (var2 != null) {
                  ph.field_a = GzipInflater.a(var2, (byte) 92);
                }
                var2 = SectorCacheStore.a("pleasereenterpass", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 108);
                }
                var2 = SectorCacheStore.a("playfreeversion", (byte) -127);
                if (null != var2) {
                  s.field_a = GzipInflater.a(var2, (byte) 86);
                }
                var2 = SectorCacheStore.a("reloadgame", (byte) -127);
                if (var2 != null) {
                  NetworkArchiveRequest.field_p = GzipInflater.a(var2, (byte) 90);
                }
                var2 = SectorCacheStore.a("toserverlist", (byte) -127);
                if (null != var2) {
                  sk.field_a = GzipInflater.a(var2, (byte) 114);
                }
                var2 = SectorCacheStore.a("tocustomersupport", (byte) -127);
                if (null != var2) {
                  jh.field_a = GzipInflater.a(var2, (byte) 102);
                }
                var2 = SectorCacheStore.a("changedisplayname", (byte) -127);
                if (null != var2) {
                  wf.field_a = GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("returntohomepage", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 78);
                }
                var2 = SectorCacheStore.a("justplay", (byte) -127);
                if (null != var2) {
                  oa.field_b = GzipInflater.a(var2, (byte) 125);
                }
                var2 = SectorCacheStore.a("justplay_excl", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 90);
                }
                var2 = SectorCacheStore.a("login", (byte) -127);
                if (var2 != null) {
                  q.field_f = GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("goback", (byte) -127);
                if (var2 != null) {
                  dl.field_j = GzipInflater.a(var2, (byte) 97);
                }
                var2 = SectorCacheStore.a("otheroptions", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 120);
                }
                var2 = SectorCacheStore.a("proceed", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 87);
                }
                var2 = SectorCacheStore.a("connectingtoserver", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("pleasewait", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("logging_in", (byte) -127);
                if (var2 != null) {
                  kj.field_q = GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("reconnect", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 84);
                }
                var2 = SectorCacheStore.a("backtoerror", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 89);
                }
                var2 = SectorCacheStore.a("pleasecheckinternet", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 122);
                }
                var2 = SectorCacheStore.a("attemptingtoreconnect", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("connectionlost_reconnecting", (byte) -127);
                if (null != var2) {
                  ni.field_e = GzipInflater.a(var2, (byte) 92);
                }
                var2 = SectorCacheStore.a("connectionlost_withreason", (byte) -127);
                if (var2 != null) {
                  UiWidget.field_p = GzipInflater.a(var2, (byte) 107);
                }
                var2 = SectorCacheStore.a("passwordverificationrequired", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("invalidpass", (byte) -127);
                if (null != var2) {
                  rl.field_t = GzipInflater.a(var2, (byte) 125);
                }
                var2 = SectorCacheStore.a("retry", (byte) -127);
                if (var2 != null) {
                  tc.field_c = GzipInflater.a(var2, (byte) 95);
                }
                var2 = SectorCacheStore.a("back", (byte) -127);
                if (var2 != null) {
                  uc.field_r = GzipInflater.a(var2, (byte) 125);
                }
                var2 = SectorCacheStore.a("exitfullscreenmode", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 85);
                }
                var2 = SectorCacheStore.a("quittowebsite", (byte) -127);
                if (var2 != null) {
                  pg.field_f = GzipInflater.a(var2, (byte) 107);
                }
                var2 = SectorCacheStore.a("connectionrestored", (byte) -127);
                if (var2 != null) {
                  RichTextWidget.field_E = GzipInflater.a(var2, (byte) 98);
                }
                var2 = SectorCacheStore.a("warning_ifyouquit", (byte) -127);
                if (null != var2) {
                  vg.field_c = GzipInflater.a(var2, (byte) 90);
                }
                var2 = SectorCacheStore.a("warning_ifyouquitorleavepage", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 102);
                }
                var2 = SectorCacheStore.a("resubscribe_withoutlosing_fs", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 123);
                }
                var2 = SectorCacheStore.a("resubscribe_withoutlosing", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 106);
                }
                var2 = SectorCacheStore.a("customersupport_withoutlosing_fs", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 110);
                }
                var2 = SectorCacheStore.a("customersupport_withoutlosing", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 118);
                }
                var2 = SectorCacheStore.a("js5help_withoutlosing_fs", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 124);
                }
                var2 = SectorCacheStore.a("js5help_withoutlosing", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 121);
                }
                var2 = SectorCacheStore.a("checkinternet_withoutlosing_fs", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("checkinternet_withoutlosing", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 84);
                }
                var2 = SectorCacheStore.a("create_intro", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 95);
                }
                var2 = SectorCacheStore.a("create_sameaccounttip_unnamed", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 101);
                }
                var2 = SectorCacheStore.a("dateofbirthprompt", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 111);
                }
                var2 = SectorCacheStore.a("fetchingcountrylist", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 107);
                }
                var2 = SectorCacheStore.a("countryprompt", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("countrylisterror", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 91);
                }
                var2 = SectorCacheStore.a("theonlypersonalquestions", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 103);
                }
                var2 = SectorCacheStore.a("create_submittingdata", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 80);
                }
                var2 = SectorCacheStore.a("check", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 101);
                }
                var2 = SectorCacheStore.a("create_pleasechooseausername", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 95);
                }
                var2 = SectorCacheStore.a("create_usernameblurb", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 105);
                }
                var2 = SectorCacheStore.a("checkingavailability", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("checking", (byte) -127);
                if (null != var2) {
                  AlphaWidgetContainer.field_C = GzipInflater.a(var2, (byte) 114);
                }
                var2 = SectorCacheStore.a("create_namealreadytaken", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 119);
                }
                var2 = SectorCacheStore.a("create_sameaccounttip_named", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 125);
                }
                var2 = SectorCacheStore.a("create_nosuggestions", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 98);
                }
                var2 = SectorCacheStore.a("create_alternativelygoback", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("create_available", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 91);
                }
                var2 = SectorCacheStore.a("create_willnowshowtermsandconditions", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 82);
                }
                var2 = SectorCacheStore.a("fetchingterms", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 89);
                }
                var2 = SectorCacheStore.a("termserror", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 127);
                }
                var2 = SectorCacheStore.a("create_iagree", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 119);
                }
                var2 = SectorCacheStore.a("create_idisagree", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 107);
                }
                var2 = SectorCacheStore.a("create_pleasescrolldowntoaccept", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 120);
                }
                var2 = SectorCacheStore.a("create_linkaddress", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("openinpopupwindow", (byte) -127);
                if (var2 != null) {
                  ni.field_b = GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("create", (byte) -127);
                if (null != var2) {
                  ResourceArchive.field_h = GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("create_pleasechooseapassword", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 112);
                }
                var2 = SectorCacheStore.a("create_passwordblurb", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 103);
                }
                var2 = SectorCacheStore.a("create_nevergivepassword", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 109);
                }
                var2 = SectorCacheStore.a("creatingyouraccount", (byte) -127);
                if (var2 != null) {
                  ResizableModalDialog.field_R = GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("create_youmustaccept", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 119);
                }
                var2 = SectorCacheStore.a("create_passwordsdifferent", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 101);
                }
                var2 = SectorCacheStore.a("create_success", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 122);
                }
                var2 = SectorCacheStore.a("day", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("month", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 85);
                }
                var2 = SectorCacheStore.a("year", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 101);
                }
                var2 = SectorCacheStore.a("monthnames,0", (byte) -127);
                if (var2 != null) {
                  se.field_O[0] = GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("monthnames,1", (byte) -127);
                if (var2 != null) {
                  se.field_O[1] = GzipInflater.a(var2, (byte) 81);
                }
                var2 = SectorCacheStore.a("monthnames,2", (byte) -127);
                if (var2 != null) {
                  se.field_O[2] = GzipInflater.a(var2, (byte) 89);
                }
                var2 = SectorCacheStore.a("monthnames,3", (byte) -127);
                if (null != var2) {
                  se.field_O[3] = GzipInflater.a(var2, (byte) 86);
                }
                var2 = SectorCacheStore.a("monthnames,4", (byte) -127);
                if (null != var2) {
                  se.field_O[4] = GzipInflater.a(var2, (byte) 120);
                }
                var2 = SectorCacheStore.a("monthnames,5", (byte) -127);
                if (var2 != null) {
                  se.field_O[5] = GzipInflater.a(var2, (byte) 90);
                }
                var2 = SectorCacheStore.a("monthnames,6", (byte) -127);
                if (var2 != null) {
                  se.field_O[6] = GzipInflater.a(var2, (byte) 86);
                }
                var2 = SectorCacheStore.a("monthnames,7", (byte) -127);
                if (var2 != null) {
                  se.field_O[7] = GzipInflater.a(var2, (byte) 110);
                }
                var2 = SectorCacheStore.a("monthnames,8", (byte) -127);
                if (null != var2) {
                  se.field_O[8] = GzipInflater.a(var2, (byte) 92);
                }
                var2 = SectorCacheStore.a("monthnames,9", (byte) -127);
                if (null != var2) {
                  se.field_O[9] = GzipInflater.a(var2, (byte) 122);
                }
                var2 = SectorCacheStore.a("monthnames,10", (byte) -127);
                if (null != var2) {
                  se.field_O[10] = GzipInflater.a(var2, (byte) 91);
                }
                var2 = SectorCacheStore.a("monthnames,11", (byte) -127);
                if (null != var2) {
                  se.field_O[11] = GzipInflater.a(var2, (byte) 109);
                }
                var2 = SectorCacheStore.a("create_welcome", (byte) -127);
                if (null != var2) {
                  FrameTimer.field_e = GzipInflater.a(var2, (byte) 105);
                }
                var2 = SectorCacheStore.a("create_u13_welcome", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 78);
                }
                var2 = SectorCacheStore.a("create_createanaccount", (byte) -127);
                if (var2 != null) {
                  mg.field_K = GzipInflater.a(var2, (byte) 99);
                }
                var2 = SectorCacheStore.a("create_username", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 82);
                }
                var2 = SectorCacheStore.a("create_displayname", (byte) -127);
                if (null != var2) {
                  TextLayout.field_a = GzipInflater.a(var2, (byte) 121);
                }
                var2 = SectorCacheStore.a("create_password", (byte) -127);
                if (null != var2) {
                  GrowableIntArray.field_b = GzipInflater.a(var2, (byte) 80);
                }
                var2 = SectorCacheStore.a("create_password_confirm", (byte) -127);
                if (null != var2) {
                  hk.field_c = GzipInflater.a(var2, (byte) 82);
                }
                var2 = SectorCacheStore.a("create_email", (byte) -127);
                if (var2 != null) {
                  cf.field_a = GzipInflater.a(var2, (byte) 127);
                }
                var2 = SectorCacheStore.a("create_email_confirm", (byte) -127);
                if (null != var2) {
                  mb.field_b = GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("create_age", (byte) -127);
                if (var2 != null) {
                  th.field_b = GzipInflater.a(var2, (byte) 105);
                }
                var2 = SectorCacheStore.a("create_u13_email", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 90);
                }
                var2 = SectorCacheStore.a("create_u13_email_confirm", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 127);
                }
                var2 = SectorCacheStore.a("create_dob", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 98);
                }
                var2 = SectorCacheStore.a("create_country", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 107);
                }
                var2 = SectorCacheStore.a("create_alternatives_header", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 91);
                }
                var2 = SectorCacheStore.a("create_alternatives_select", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 98);
                }
                var2 = SectorCacheStore.a("create_suggestions", (byte) -127);
                if (null != var2) {
                  cb.field_h = GzipInflater.a(var2, (byte) 95);
                }
                var2 = SectorCacheStore.a("create_more_suggestions", (byte) -127);
                if (null != var2) {
                  sh.field_f = GzipInflater.a(var2, (byte) 119);
                }
                var2 = SectorCacheStore.a("create_select_alternative", (byte) -127);
                if (null != var2) {
                  lb.field_e = GzipInflater.a(var2, (byte) 114);
                }
                var2 = SectorCacheStore.a("create_optin_news", (byte) -127);
                if (var2 != null) {
                  Main.field_M = GzipInflater.a(var2, (byte) 86);
                }
                var2 = SectorCacheStore.a("create_agreeterms", (byte) -127);
                if (null != var2) {
                  UiWidget.field_t = GzipInflater.a(var2, (byte) 81);
                }
                var2 = SectorCacheStore.a("create_u13terms", (byte) -127);
                if (null != var2) {
                  dd.field_h = GzipInflater.a(var2, (byte) 118);
                }
                var2 = SectorCacheStore.a("login_username_email", (byte) -127);
                if (var2 != null) {
                  LabeledWidgetContainer.field_F = GzipInflater.a(var2, (byte) 103);
                }
                var2 = SectorCacheStore.a("login_username", (byte) -127);
                if (null != var2) {
                  DiskArchiveRequest.field_q = GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("login_email", (byte) -127);
                if (null != var2) {
                  ja.field_d = GzipInflater.a(var2, (byte) 110);
                }
                var2 = SectorCacheStore.a("login_username_tooltip", (byte) -127);
                if (null != var2) {
                  sl.field_c = GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("login_password_tooltip", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 99);
                }
                var2 = SectorCacheStore.a("login_login_tooltip", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 80);
                }
                var2 = SectorCacheStore.a("login_create_tooltip", (byte) -127);
                if (var2 != null) {
                  bl.field_b = GzipInflater.a(var2, (byte) 81);
                }
                var2 = SectorCacheStore.a("login_justplay_tooltip", (byte) -127);
                if (null != var2) {
                  BitPacketBuffer.field_m = GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("login_back_tooltip", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 112);
                }
                var2 = SectorCacheStore.a("login_no_displayname", (byte) -127);
                if (var2 != null) {
                  DialogMessagePane.field_F = GzipInflater.a(var2, (byte) 94);
                }
                var2 = SectorCacheStore.a("create_username_tooltip", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 95);
                }
                var2 = SectorCacheStore.a("create_username_hint", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("create_displayname_tooltip", (byte) -127);
                if (var2 != null) {
                  re.field_h = GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("create_displayname_hint", (byte) -127);
                if (var2 != null) {
                  pk.field_c = GzipInflater.a(var2, (byte) 123);
                }
                var2 = SectorCacheStore.a("create_password_tooltip", (byte) -127);
                if (null != var2) {
                  db.field_f = GzipInflater.a(var2, (byte) 127);
                }
                var2 = SectorCacheStore.a("create_password_hint", (byte) -127);
                if (var2 != null) {
                  mc.field_a = GzipInflater.a(var2, (byte) 97);
                }
                var2 = SectorCacheStore.a("create_password_confirm_tooltip", (byte) -127);
                if (null != var2) {
                  ja.field_c = GzipInflater.a(var2, (byte) 80);
                }
                var2 = SectorCacheStore.a("create_email_tooltip", (byte) -127);
                if (null != var2) {
                  pf.field_g = GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("create_email_confirm_tooltip", (byte) -127);
                if (var2 != null) {
                  MouseWheelInput.field_b = GzipInflater.a(var2, (byte) 123);
                }
                var2 = SectorCacheStore.a("create_age_tooltip", (byte) -127);
                if (var2 != null) {
                  cc.field_b = GzipInflater.a(var2, (byte) 119);
                }
                var2 = SectorCacheStore.a("create_optin_news_tooltip", (byte) -127);
                if (var2 != null) {
                  nc.field_c = GzipInflater.a(var2, (byte) 105);
                }
                var2 = SectorCacheStore.a("create_u13_email_tooltip", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("create_u13_email_confirm_tooltip", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 97);
                }
                var2 = SectorCacheStore.a("create_dob_tooltip", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 123);
                }
                var2 = SectorCacheStore.a("create_country_tooltip", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 112);
                }
                var2 = SectorCacheStore.a("create_optin_tooltip", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 118);
                }
                var2 = SectorCacheStore.a("create_continue", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 108);
                }
                var2 = SectorCacheStore.a("create_username_unavailable", (byte) -127);
                if (null != var2) {
                  DialogMessagePane.field_K = GzipInflater.a(var2, (byte) 87);
                }
                var2 = SectorCacheStore.a("create_username_available", (byte) -127);
                if (null != var2) {
                  vd.field_k = GzipInflater.a(var2, (byte) 118);
                }
                var2 = SectorCacheStore.a("create_alert_namelength", (byte) -127);
                if (var2 != null) {
                  ke.field_b = GzipInflater.a(var2, (byte) 87);
                }
                var2 = SectorCacheStore.a("create_alert_namechars", (byte) -127);
                if (null != var2) {
                  nf.field_a = GzipInflater.a(var2, (byte) 86);
                }
                var2 = SectorCacheStore.a("create_alert_nameleadingspace", (byte) -127);
                if (var2 != null) {
                  AccountRegistrationPanel.field_P = GzipInflater.a(var2, (byte) 81);
                }
                var2 = SectorCacheStore.a("create_alert_doublespace", (byte) -127);
                if (null != var2) {
                  DequeWidgetContainer.field_B = GzipInflater.a(var2, (byte) 121);
                }
                var2 = SectorCacheStore.a("create_alert_passchars", (byte) -127);
                if (null != var2) {
                  InteractiveWidget.field_C = GzipInflater.a(var2, (byte) 79);
                }
                var2 = SectorCacheStore.a("create_alert_passrepeated", (byte) -127);
                if (null != var2) {
                  ContentTransitionDialog.field_fb = GzipInflater.a(var2, (byte) 95);
                }
                var2 = SectorCacheStore.a("create_alert_passlength", (byte) -127);
                if (var2 != null) {
                  s.field_b = GzipInflater.a(var2, (byte) 110);
                }
                var2 = SectorCacheStore.a("create_alert_passcontainsname", (byte) -127);
                if (null != var2) {
                  DraggableWidgetContainer.field_F = GzipInflater.a(var2, (byte) 92);
                }
                var2 = SectorCacheStore.a("create_alert_passcontainsemail", (byte) -127);
                if (null != var2) {
                  bj.field_u = GzipInflater.a(var2, (byte) 125);
                }
                var2 = SectorCacheStore.a("create_alert_passcontainsname_partial", (byte) -127);
                if (var2 != null) {
                  i.field_b = GzipInflater.a(var2, (byte) 101);
                }
                var2 = SectorCacheStore.a("create_alert_checkname", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 81);
                }
                var2 = SectorCacheStore.a("create_alert_invalidemail", (byte) -127);
                if (var2 != null) {
                  ha.field_c = GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("create_alert_email_unavailable", (byte) -127);
                if (var2 != null) {
                  IntrusiveDeque.field_b = GzipInflater.a(var2, (byte) 118);
                }
                var2 = SectorCacheStore.a("create_alert_invaliddate", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 87);
                }
                var2 = SectorCacheStore.a("create_alert_invalidage", (byte) -127);
                if (var2 != null) {
                  d.field_j = GzipInflater.a(var2, (byte) 90);
                }
                var2 = SectorCacheStore.a("create_alert_yearrange", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 93);
                }
                var2 = SectorCacheStore.a("create_alert_mismatch", (byte) -127);
                if (null != var2) {
                  r.field_r = GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("create_passwordvalid", (byte) -127);
                if (null != var2) {
                  ll.field_g = GzipInflater.a(var2, (byte) 101);
                }
                var2 = SectorCacheStore.a("create_emailvalid", (byte) -127);
                if (var2 != null) {
                  gi.field_g = GzipInflater.a(var2, (byte) 101);
                }
                var2 = SectorCacheStore.a("create_account_success", (byte) -127);
                if (null != var2) {
                  IntrusiveDeque.field_e = GzipInflater.a(var2, (byte) 125);
                }
                var2 = SectorCacheStore.a("invalid_name", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 102);
                }
                var2 = SectorCacheStore.a("cannot_add_yourself", (byte) -127);
                var3 = 22 / ((-14 - param0) / 59);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("unable_to_add_friend", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("unable_to_add_ignore", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 107);
                }
                var2 = SectorCacheStore.a("unable_to_delete_friend", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 111);
                }
                var2 = SectorCacheStore.a("unable_to_delete_ignore", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 78);
                }
                var2 = SectorCacheStore.a("friendlistfull", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 95);
                }
                var2 = SectorCacheStore.a("friendlistdupe", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 91);
                }
                var2 = SectorCacheStore.a("friendnotfound", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 101);
                }
                var2 = SectorCacheStore.a("ignorelistfull", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 99);
                }
                var2 = SectorCacheStore.a("ignorelistdupe", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 79);
                }
                var2 = SectorCacheStore.a("ignorenotfound", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 112);
                }
                var2 = SectorCacheStore.a("removeignorefirst", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 98);
                }
                var2 = SectorCacheStore.a("removefriendfirst", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 123);
                }
                var2 = SectorCacheStore.a("enterfriend_add", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 97);
                }
                var2 = SectorCacheStore.a("enterfriend_del", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 101);
                }
                var2 = SectorCacheStore.a("enterignore_add", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 80);
                }
                var2 = SectorCacheStore.a("enterignore_del", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 89);
                }
                var2 = SectorCacheStore.a("text_removed_from_game", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 112);
                }
                var2 = SectorCacheStore.a("text_lobby_pleaselogin_free", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 94);
                }
                var2 = SectorCacheStore.a("opengl", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 95);
                }
                var2 = SectorCacheStore.a("sse", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("purejava", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("waitingfor_graphics", (byte) -127);
                if (var2 != null) {
                  kf.field_j = GzipInflater.a(var2, (byte) 124);
                }
                var2 = SectorCacheStore.a("waitingfor_models", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 86);
                }
                var2 = SectorCacheStore.a("waitingfor_fonts", (byte) -127);
                if (var2 != null) {
                  LoginPanel.field_L = GzipInflater.a(var2, (byte) 99);
                }
                var2 = SectorCacheStore.a("waitingfor_soundeffects", (byte) -127);
                if (null != var2) {
                  eg.field_e = GzipInflater.a(var2, (byte) 125);
                }
                var2 = SectorCacheStore.a("waitingfor_music", (byte) -127);
                if (null != var2) {
                  ah.field_a = GzipInflater.a(var2, (byte) 98);
                }
                var2 = SectorCacheStore.a("waitingfor_instruments", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 109);
                }
                var2 = SectorCacheStore.a("waitingfor_levels", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 105);
                }
                var2 = SectorCacheStore.a("waitingfor_extradata", (byte) -127);
                if (var2 != null) {
                  tb.field_e = GzipInflater.a(var2, (byte) 92);
                }
                var2 = SectorCacheStore.a("waitingfor_languages", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 78);
                }
                var2 = SectorCacheStore.a("waitingfor_textures", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 122);
                }
                var2 = SectorCacheStore.a("waitingfor_animations", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 97);
                }
                var2 = SectorCacheStore.a("loading_graphics", (byte) -127);
                if (var2 != null) {
                  IntrusiveDeque.field_f = GzipInflater.a(var2, (byte) 121);
                }
                var2 = SectorCacheStore.a("loading_models", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 126);
                }
                var2 = SectorCacheStore.a("loading_fonts", (byte) -127);
                if (var2 != null) {
                  nc.field_b = GzipInflater.a(var2, (byte) 117);
                }
                var2 = SectorCacheStore.a("loading_soundeffects", (byte) -127);
                if (var2 != null) {
                  wd.field_a = GzipInflater.a(var2, (byte) 103);
                }
                var2 = SectorCacheStore.a("loading_music", (byte) -127);
                if (null != var2) {
                  dh.field_o = GzipInflater.a(var2, (byte) 99);
                }
                var2 = SectorCacheStore.a("loading_instruments", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 81);
                }
                var2 = SectorCacheStore.a("loading_levels", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 106);
                }
                var2 = SectorCacheStore.a("loading_extradata", (byte) -127);
                if (var2 != null) {
                  rj.field_w = GzipInflater.a(var2, (byte) 93);
                }
            }
            void loadMatchDisplayAndMembershipText() throws java.lang.RuntimeException {
                var2 = SectorCacheStore.a("loading_languages", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 97);
                }
                var2 = SectorCacheStore.a("loading_textures", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("loading_animations", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 109);
                }
                var2 = SectorCacheStore.a("unpacking_graphics", (byte) -127);
                if (var2 != null) {
                  lb.field_f = GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("unpacking_models", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("unpacking_soundeffects", (byte) -127);
                if (var2 != null) {
                  AccountRequestState.field_c = GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("unpacking_music", (byte) -127);
                if (null != var2) {
                  ModalDialogHost.field_A = GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("unpacking_levels", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 120);
                }
                var2 = SectorCacheStore.a("unpacking_languages", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 103);
                }
                var2 = SectorCacheStore.a("unpacking_animations", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 87);
                }
                var2 = SectorCacheStore.a("unpacking_toolkit", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("instructions", (byte) -127);
                if (null != var2) {
                  SectorCacheStore.field_e = GzipInflater.a(var2, (byte) 113);
                }
                var2 = SectorCacheStore.a("tutorial", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 82);
                }
                var2 = SectorCacheStore.a("playtutorial", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 99);
                }
                var2 = SectorCacheStore.a("sound_colon", (byte) -127);
                if (null != var2) {
                  td.field_a = GzipInflater.a(var2, (byte) 124);
                }
                var2 = SectorCacheStore.a("music_colon", (byte) -127);
                if (null != var2) {
                  lf.field_d = GzipInflater.a(var2, (byte) 90);
                }
                var2 = SectorCacheStore.a("fullscreen", (byte) -127);
                if (var2 != null) {
                  pg.field_b = GzipInflater.a(var2, (byte) 93);
                }
                var2 = SectorCacheStore.a("screensize", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("highscores", (byte) -127);
                if (var2 != null) {
                  AlphaWidgetContainer.field_D = GzipInflater.a(var2, (byte) 94);
                }
                var2 = SectorCacheStore.a("rankings", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 97);
                }
                var2 = SectorCacheStore.a("achievements", (byte) -127);
                if (null != var2) {
                  SectorCacheStore.field_a = GzipInflater.a(var2, (byte) 92);
                }
                var2 = SectorCacheStore.a("achievementsthisgame", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 112);
                }
                var2 = SectorCacheStore.a("achievementsthissession", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 116);
                }
                var2 = SectorCacheStore.a("watchintroduction", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 105);
                }
                var2 = SectorCacheStore.a("quit", (byte) -127);
                if (null != var2) {
                  ii.field_f = GzipInflater.a(var2, (byte) 105);
                }
                var2 = SectorCacheStore.a("login_createaccount", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 116);
                }
                var2 = SectorCacheStore.a("tohighscores", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 112);
                }
                var2 = SectorCacheStore.a("returntomainmenu", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("returntopausemenu", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("returntooptionsmenu_notpaused", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 95);
                }
                var2 = SectorCacheStore.a("mainmenu", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 107);
                }
                var2 = SectorCacheStore.a("pausemenu", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 81);
                }
                var2 = SectorCacheStore.a("optionsmenu_notpaused", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 78);
                }
                var2 = SectorCacheStore.a("menu", (byte) -127);
                if (null != var2) {
                  db.field_b = GzipInflater.a(var2, (byte) 121);
                }
                var2 = SectorCacheStore.a("selectlevel", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 102);
                }
                var2 = SectorCacheStore.a("nextlevel", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 91);
                }
                var2 = SectorCacheStore.a("startgame", (byte) -127);
                if (var2 != null) {
                  GuestPlayConfirmationForm.field_J = GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("newgame", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 121);
                }
                var2 = SectorCacheStore.a("resumegame", (byte) -127);
                if (null != var2) {
                  id.field_f = GzipInflater.a(var2, (byte) 103);
                }
                var2 = SectorCacheStore.a("resumetutorial", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("skip", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 93);
                }
                var2 = SectorCacheStore.a("skiptutorial", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 93);
                }
                var2 = SectorCacheStore.a("skipending", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 97);
                }
                var2 = SectorCacheStore.a("restartlevel", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 94);
                }
                var2 = SectorCacheStore.a("endtest", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 103);
                }
                var2 = SectorCacheStore.a("endgame", (byte) -127);
                if (null != var2) {
                  tf.field_m = GzipInflater.a(var2, (byte) 89);
                }
                var2 = SectorCacheStore.a("endtutorial", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 101);
                }
                var2 = SectorCacheStore.a("ok", (byte) -127);
                if (var2 != null) {
                  bl.field_g = GzipInflater.a(var2, (byte) 101);
                }
                var2 = SectorCacheStore.a("on", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 111);
                }
                var2 = SectorCacheStore.a("off", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("previous", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 101);
                }
                var2 = SectorCacheStore.a("prev", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 119);
                }
                var2 = SectorCacheStore.a("next", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("graphics_colon", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 85);
                }
                var2 = SectorCacheStore.a("hotseatmultiplayer", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 94);
                }
                var2 = SectorCacheStore.a("entermultiplayerlobby", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("singleplayergame", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("returntogame", (byte) -127);
                if (var2 != null) {
                  sh.field_h = GzipInflater.a(var2, (byte) 82);
                }
                var2 = SectorCacheStore.a("endgameresign", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 107);
                }
                var2 = SectorCacheStore.a("offerdraw", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 98);
                }
                var2 = SectorCacheStore.a("canceldraw", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 112);
                }
                var2 = SectorCacheStore.a("acceptdraw", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 90);
                }
                var2 = SectorCacheStore.a("resign", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 86);
                }
                var2 = SectorCacheStore.a("returntolobby", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 93);
                }
                var2 = SectorCacheStore.a("cont", (byte) -127);
                if (null != var2) {
                  bj.field_b = GzipInflater.a(var2, (byte) 106);
                }
                var2 = SectorCacheStore.a("continue_spectating", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 120);
                }
                var2 = SectorCacheStore.a("messages", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("graphics_fastest", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 82);
                }
                var2 = SectorCacheStore.a("graphics_medium", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 118);
                }
                var2 = SectorCacheStore.a("graphics_best", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 120);
                }
                var2 = SectorCacheStore.a("graphics_directx", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 94);
                }
                var2 = SectorCacheStore.a("graphics_opengl", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 89);
                }
                var2 = SectorCacheStore.a("graphics_java", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 99);
                }
                var2 = SectorCacheStore.a("graphics_quality_high", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 85);
                }
                var2 = SectorCacheStore.a("graphics_quality_low", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 109);
                }
                var2 = SectorCacheStore.a("graphics_mode", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 127);
                }
                var2 = SectorCacheStore.a("graphics_quality", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("mode", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 86);
                }
                var2 = SectorCacheStore.a("quality", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("keys", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 92);
                }
                var2 = SectorCacheStore.a("objective", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 116);
                }
                var2 = SectorCacheStore.a("currentobjective", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 85);
                }
                var2 = SectorCacheStore.a("pressescforpausemenu", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 87);
                }
                var2 = SectorCacheStore.a("pressescforpausemenuortoskiptutorial", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 93);
                }
                var2 = SectorCacheStore.a("pressescforoptionsmenu_doesntpause", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 119);
                }
                var2 = SectorCacheStore.a("pressescforoptionsmenu_doesntpause_short", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 109);
                }
                var2 = SectorCacheStore.a("powerups", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("latestlevel_suffix", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 102);
                }
                var2 = SectorCacheStore.a("unreachedlevel_name", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 80);
                }
                var2 = SectorCacheStore.a("unreachedlevel_cannotplayreason", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("unreachedlevel_cannotplayreason_shorter", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("unreachedworld_cannotplayreason", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 118);
                }
                var2 = SectorCacheStore.a("memberslevel_name", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("memberslevel_cannotplayreason", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 94);
                }
                var2 = SectorCacheStore.a("membersworld_cannotplayreason", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 89);
                }
                var2 = SectorCacheStore.a("unreachedlevel_createtip", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 99);
                }
                var2 = SectorCacheStore.a("unreachedlevel_createtip_line1", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 122);
                }
                var2 = SectorCacheStore.a("unreachedlevel_createtip_line2", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("unreachedlevel_logintip", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 123);
                }
                var2 = SectorCacheStore.a("memberslevel_logintip", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 87);
                }
                var2 = SectorCacheStore.a("displayname_none", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 124);
                }
                var2 = SectorCacheStore.a("levelxofy1", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 82);
                }
                var2 = SectorCacheStore.a("levelxofy2", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 108);
                }
                var2 = SectorCacheStore.a("levelxofy", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 91);
                }
                var2 = SectorCacheStore.a("ingame_level", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 105);
                }
                var2 = SectorCacheStore.a("mouseoveranicon", (byte) -127);
                if (var2 != null) {
                  id.field_d = GzipInflater.a(var2, (byte) 78);
                }
                var2 = SectorCacheStore.a("notyetachieved", (byte) -127);
                if (var2 != null) {
                  vd.field_n = GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("achieved", (byte) -127);
                if (null != var2) {
                  pk.field_b = GzipInflater.a(var2, (byte) 95);
                }
                var2 = SectorCacheStore.a("orbpoints", (byte) -127);
                if (null != var2) {
                  eg.field_a = GzipInflater.a(var2, (byte) 112);
                }
                var2 = SectorCacheStore.a("orbcoins", (byte) -127);
                if (var2 != null) {
                  nl.field_a = GzipInflater.a(var2, (byte) 91);
                }
                var2 = SectorCacheStore.a("orbpoints_colon", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 122);
                }
                var2 = SectorCacheStore.a("orbcoins_colon", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 111);
                }
                var2 = SectorCacheStore.a("achieved_colon_description", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 99);
                }
                var2 = SectorCacheStore.a("secretachievement", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 124);
                }
                var2 = SectorCacheStore.a("no_highscores", (byte) -127);
                if (null != var2) {
                  ModalDialogHost.field_F = GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("hs_name", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 97);
                }
                var2 = SectorCacheStore.a("hs_level", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("hs_fromlevel", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 105);
                }
                var2 = SectorCacheStore.a("hs_tolevel", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 122);
                }
                var2 = SectorCacheStore.a("hs_score", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 110);
                }
                var2 = SectorCacheStore.a("hs_end", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("ingame_score", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 119);
                }
                var2 = SectorCacheStore.a("score_colon", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 81);
                }
                var2 = SectorCacheStore.a("mp_leavegame", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 108);
                }
                var2 = SectorCacheStore.a("mp_offerrematch", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 89);
                }
                var2 = SectorCacheStore.a("mp_offerrematch_unrated", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("mp_acceptrematch", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 86);
                }
                var2 = SectorCacheStore.a("mp_acceptrematch_unrated", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 119);
                }
                var2 = SectorCacheStore.a("mp_cancelrematch", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 98);
                }
                var2 = SectorCacheStore.a("mp_cancelrematch_unrated", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("mp_rematchnewgame", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 124);
                }
                var2 = SectorCacheStore.a("mp_rematchnewgame_unrated", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("mp_x_wantstodraw", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 125);
                }
                var2 = SectorCacheStore.a("mp_x_offersrematch", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 78);
                }
                var2 = SectorCacheStore.a("mp_x_offersrematch_unrated", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 87);
                }
                var2 = SectorCacheStore.a("mp_youofferrematch", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 119);
                }
                var2 = SectorCacheStore.a("mp_youofferrematch_unrated", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 107);
                }
                var2 = SectorCacheStore.a("mp_youofferdraw", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 89);
                }
                var2 = SectorCacheStore.a("mp_youresigned", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 85);
                }
                var2 = SectorCacheStore.a("mp_youresigned_rematch", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("mp_x_hasresignedandleft", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 119);
                }
                var2 = SectorCacheStore.a("mp_x_hasresigned_rematch", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 99);
                }
                var2 = SectorCacheStore.a("mp_x_hasresigned", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("mp_x_hasleft", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 103);
                }
                var2 = SectorCacheStore.a("mp_x_haswon", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("mp_youhavewon", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("mp_gamedrawn", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 99);
                }
                var2 = SectorCacheStore.a("mp_timeremaining", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 108);
                }
                var2 = SectorCacheStore.a("mp_x_turn", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 91);
                }
                var2 = SectorCacheStore.a("mp_yourturn", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("gameover", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 106);
                }
                var2 = SectorCacheStore.a("mp_hidechat", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("mp_showchat_nounread", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 92);
                }
                var2 = SectorCacheStore.a("mp_showchat_unread1", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 106);
                }
                var2 = SectorCacheStore.a("mp_showchat_unread2", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 84);
                }
                var2 = SectorCacheStore.a("click_to_quickchat", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 84);
                }
                var2 = SectorCacheStore.a("autorespond", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("quickchat_help", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 92);
                }
                var2 = SectorCacheStore.a("quickchat_help_title", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 107);
                }
                var2 = SectorCacheStore.a("quickchat_shortcut_help,0", (byte) -127);
                if (var2 != null) {
                  ResizableModalDialog.field_L[0] = GzipInflater.a(var2, (byte) 90);
                }
                var2 = SectorCacheStore.a("quickchat_shortcut_help,1", (byte) -127);
                if (null != var2) {
                  ResizableModalDialog.field_L[1] = GzipInflater.a(var2, (byte) 93);
                }
                var2 = SectorCacheStore.a("quickchat_shortcut_help,2", (byte) -127);
                if (null != var2) {
                  ResizableModalDialog.field_L[2] = GzipInflater.a(var2, (byte) 94);
                }
                var2 = SectorCacheStore.a("quickchat_shortcut_help,3", (byte) -127);
                if (var2 != null) {
                  ResizableModalDialog.field_L[3] = GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("quickchat_shortcut_help,4", (byte) -127);
                if (null != var2) {
                  ResizableModalDialog.field_L[4] = GzipInflater.a(var2, (byte) 85);
                }
                var2 = SectorCacheStore.a("quickchat_shortcut_help,5", (byte) -127);
                if (null != var2) {
                  ResizableModalDialog.field_L[5] = GzipInflater.a(var2, (byte) 80);
                }
                var2 = SectorCacheStore.a("quickchat_shortcut_keys,0", (byte) -127);
                if (null != var2) {
                  AccountServiceResult.field_f[0] = GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("quickchat_shortcut_keys,1", (byte) -127);
                if (var2 != null) {
                  AccountServiceResult.field_f[1] = GzipInflater.a(var2, (byte) 118);
                }
                var2 = SectorCacheStore.a("quickchat_shortcut_keys,2", (byte) -127);
                if (var2 != null) {
                  AccountServiceResult.field_f[2] = GzipInflater.a(var2, (byte) 116);
                }
                var2 = SectorCacheStore.a("quickchat_shortcut_keys,3", (byte) -127);
                if (var2 != null) {
                  AccountServiceResult.field_f[3] = GzipInflater.a(var2, (byte) 79);
                }
                var2 = SectorCacheStore.a("quickchat_shortcut_keys,4", (byte) -127);
                if (var2 != null) {
                  AccountServiceResult.field_f[4] = GzipInflater.a(var2, (byte) 102);
                }
                var2 = SectorCacheStore.a("quickchat_shortcut_keys,5", (byte) -127);
                if (var2 != null) {
                  AccountServiceResult.field_f[5] = GzipInflater.a(var2, (byte) 111);
                }
                var2 = SectorCacheStore.a("keychar_the_character_under_questionmark", (byte) -127);
                if (var2 != null) {
                  cc.decodeCp1252Byte(var2[0], 63);
                }
                var2 = SectorCacheStore.a("rating_noratings", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 80);
                }
                var2 = SectorCacheStore.a("rating_rating", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 105);
                }
                var2 = SectorCacheStore.a("rating_played", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 84);
                }
                var2 = SectorCacheStore.a("rating_won", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 116);
                }
                var2 = SectorCacheStore.a("rating_lost", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 116);
                }
                var2 = SectorCacheStore.a("rating_drawn", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 114);
                }
                var2 = SectorCacheStore.a("benefits_fullscreen", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 127);
                }
                var2 = SectorCacheStore.a("benefits_noadverts", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 119);
                }
                var2 = SectorCacheStore.a("benefits_price", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("members_expansion_benefits,0", (byte) -127);
                if (var2 != null) {
                  AlphaWidgetContainer.field_B[0] = GzipInflater.a(var2, (byte) 93);
                }
                var2 = SectorCacheStore.a("members_expansion_benefits,1", (byte) -127);
                if (var2 != null) {
                  AlphaWidgetContainer.field_B[1] = GzipInflater.a(var2, (byte) 109);
                }
                var2 = SectorCacheStore.a("members_expansion_benefits,2", (byte) -127);
                if (var2 != null) {
                  AlphaWidgetContainer.field_B[2] = GzipInflater.a(var2, (byte) 121);
                }
                var2 = SectorCacheStore.a("members_expansion_price_top", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 93);
                }
                var2 = SectorCacheStore.a("members_expansion_price_bottom", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 109);
                }
                var2 = SectorCacheStore.a("reconnect_lost_seq,0", (byte) -127);
                if (null != var2) {
                  me.field_d[0] = GzipInflater.a(var2, (byte) 116);
                }
                var2 = SectorCacheStore.a("reconnect_lost_seq,1", (byte) -127);
                if (null != var2) {
                  me.field_d[1] = GzipInflater.a(var2, (byte) 118);
                }
                var2 = SectorCacheStore.a("reconnect_lost_seq,2", (byte) -127);
                if (null != var2) {
                  me.field_d[2] = GzipInflater.a(var2, (byte) 78);
                }
                var2 = SectorCacheStore.a("reconnect_lost_seq,3", (byte) -127);
                if (null != var2) {
                  me.field_d[3] = GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("reconnect_lost", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 124);
                }
                var2 = SectorCacheStore.a("reconnect_restored", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 114);
                }
                var2 = SectorCacheStore.a("reconnect_please_check", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 116);
                }
                var2 = SectorCacheStore.a("reconnect_wait", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 78);
                }
                var2 = SectorCacheStore.a("reconnect_retry", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 83);
                }
                var2 = SectorCacheStore.a("reconnect_resume", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 109);
                }
                var2 = SectorCacheStore.a("reconnect_or", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 82);
                }
                var2 = SectorCacheStore.a("reconnect_exitfs", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 118);
                }
                var2 = SectorCacheStore.a("reconnect_exitfs_quit", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 122);
                }
                var2 = SectorCacheStore.a("reconnect_quit", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 119);
                }
                var2 = SectorCacheStore.a("reconnect_check_fs", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 112);
                }
                var2 = SectorCacheStore.a("reconnect_check_nonfs", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("fs_accept_beforeaccept", (byte) -127);
                if (var2 != null) {
                  oa.field_c = GzipInflater.a(var2, (byte) 98);
                }
                var2 = SectorCacheStore.a("fs_button_accept", (byte) -127);
                if (var2 != null) {
                  qd.field_b = GzipInflater.a(var2, (byte) 111);
                }
                var2 = SectorCacheStore.a("fs_accept_afteraccept", (byte) -127);
                if (null != var2) {
                  AgeValidator.field_l = GzipInflater.a(var2, (byte) 84);
                }
                var2 = SectorCacheStore.a("fs_button_cancel", (byte) -127);
                if (var2 != null) {
                  gf.field_a = GzipInflater.a(var2, (byte) 85);
                }
                var2 = SectorCacheStore.a("fs_accept_aftercancel", (byte) -127);
                if (var2 != null) {
                  ll.field_b = GzipInflater.a(var2, (byte) 89);
                }
                var2 = SectorCacheStore.a("fs_accept_countdown_sing", (byte) -127);
                if (null != var2) {
                  rf.field_g = GzipInflater.a(var2, (byte) 116);
                }
                var2 = SectorCacheStore.a("fs_accept_countdown_pl", (byte) -127);
                if (null != var2) {
                  bf.field_b = GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("fs_nonmember", (byte) -127);
                if (var2 != null) {
                  BufferedRandomAccessFile.field_l = GzipInflater.a(var2, (byte) 117);
                }
                var2 = SectorCacheStore.a("fs_button_close", (byte) -127);
                if (var2 != null) {
                  gh.field_i = GzipInflater.a(var2, (byte) 93);
                }
                var2 = SectorCacheStore.a("fs_button_members", (byte) -127);
                if (null != var2) {
                  LabeledWidgetContainer.field_I = GzipInflater.a(var2, (byte) 120);
                }
                var2 = SectorCacheStore.a("fs_unavailable", (byte) -127);
                if (null != var2) {
                  oj.field_b = GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("fs_unavailable_try_signed_applet", (byte) -127);
                if (var2 != null) {
                  ll.field_a = GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("fs_focus", (byte) -127);
                if (null != var2) {
                  fe.field_d = GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("fs_focus_or_resolution", (byte) -127);
                if (var2 != null) {
                  GameApplet.field_f = GzipInflater.a(var2, (byte) 89);
                }
                var2 = SectorCacheStore.a("fs_timeout", (byte) -127);
                if (var2 != null) {
                  ij.field_b = GzipInflater.a(var2, (byte) 81);
                }
                var2 = SectorCacheStore.a("fs_button_tryagain", (byte) -127);
                if (null != var2) {
                  DisplayNameSelectionPanel.field_D = GzipInflater.a(var2, (byte) 124);
                }
                var2 = SectorCacheStore.a("graphics_ui_fs_countdown", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 97);
                }
                var2 = SectorCacheStore.a("mb_caption_title", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 91);
                }
                var2 = SectorCacheStore.a("mb_including_gamename", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 125);
                }
                var2 = SectorCacheStore.a("mb_full_access_1", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 103);
                }
                var2 = SectorCacheStore.a("mb_full_access_2", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 95);
                }
                var2 = SectorCacheStore.a("mb_achievement_count_1", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 106);
                }
                var2 = SectorCacheStore.a("mb_achievement_count_2", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 117);
                }
                var2 = SectorCacheStore.a("mb_exclusive_1", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 93);
                }
                var2 = SectorCacheStore.a("mb_exclusive_2", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 105);
                }
                var2 = SectorCacheStore.a("me_extra_benefits", (byte) -127);
            }
            void loadRankingsLoginAndSubscriptionText() throws java.lang.RuntimeException {
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 122);
                }
                var2 = SectorCacheStore.a("hs_friend_tip", (byte) -127);
                if (var2 != null) {
                  ij.field_d = GzipInflater.a(var2, (byte) 126);
                }
                var2 = SectorCacheStore.a("hs_friend_tip_multi", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 97);
                }
                var2 = SectorCacheStore.a("hs_mode_name,0", (byte) -127);
                if (var2 != null) {
                  jk.field_d[0] = GzipInflater.a(var2, (byte) 84);
                }
                var2 = SectorCacheStore.a("hs_mode_name,1", (byte) -127);
                if (null != var2) {
                  jk.field_d[1] = GzipInflater.a(var2, (byte) 97);
                }
                var2 = SectorCacheStore.a("hs_mode_name,2", (byte) -127);
                if (var2 != null) {
                  jk.field_d[2] = GzipInflater.a(var2, (byte) 81);
                }
                var2 = SectorCacheStore.a("rating_mode_name,0", (byte) -127);
                if (null != var2) {
                  MatchingFieldValidator.field_m[0] = GzipInflater.a(var2, (byte) 122);
                }
                var2 = SectorCacheStore.a("rating_mode_name,1", (byte) -127);
                if (var2 != null) {
                  MatchingFieldValidator.field_m[1] = GzipInflater.a(var2, (byte) 102);
                }
                var2 = SectorCacheStore.a("rating_mode_long_name,0", (byte) -127);
                if (var2 != null) {
                  TextLayout.field_c[0] = GzipInflater.a(var2, (byte) 119);
                }
                var2 = SectorCacheStore.a("rating_mode_long_name,1", (byte) -127);
                if (null != var2) {
                  TextLayout.field_c[1] = GzipInflater.a(var2, (byte) 80);
                }
                var2 = SectorCacheStore.a("graphics_config_fixed_size", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 78);
                }
                var2 = SectorCacheStore.a("graphics_config_resizable", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 85);
                }
                var2 = SectorCacheStore.a("graphics_config_fullscreen", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 89);
                }
                var2 = SectorCacheStore.a("graphics_config_done", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 124);
                }
                var2 = SectorCacheStore.a("graphics_config_apply", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 123);
                }
                var2 = SectorCacheStore.a("graphics_config_title", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 99);
                }
                var2 = SectorCacheStore.a("graphics_config_instruction", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 86);
                }
                var2 = SectorCacheStore.a("graphics_config_need_memory", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 111);
                }
                var2 = SectorCacheStore.a("pleasewait_dotdotdot", (byte) -127);
                if (var2 != null) {
                  GuestPlayConfirmationForm.field_H = GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("serviceunavailable", (byte) -127);
                if (var2 != null) {
                  t.field_f = GzipInflater.a(var2, (byte) 109);
                }
                var2 = SectorCacheStore.a("createtouse", (byte) -127);
                if (null != var2) {
                  MouseInputHandler.field_g = GzipInflater.a(var2, (byte) 117);
                }
                var2 = SectorCacheStore.a("achievementsoffline", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 100);
                }
                var2 = SectorCacheStore.a("warning", (byte) -127);
                if (null != var2) {
                  GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("DEFAULT_PLAYER_NAME", (byte) -127);
                if (var2 != null) {
                  vd.field_l = GzipInflater.a(var2, (byte) 105);
                }
                var2 = SectorCacheStore.a("mustlogin1", (byte) -127);
                if (var2 != null) {
                  d.field_e = GzipInflater.a(var2, (byte) 124);
                }
                var2 = SectorCacheStore.a("mustlogin2,1", (byte) -127);
                if (var2 != null) {
                  DefaultTextWidgetRenderer.field_a[1] = GzipInflater.a(var2, (byte) 126);
                }
                var2 = SectorCacheStore.a("mustlogin2,2", (byte) -127);
                if (null != var2) {
                  DefaultTextWidgetRenderer.field_a[2] = GzipInflater.a(var2, (byte) 102);
                }
                var2 = SectorCacheStore.a("mustlogin2,3", (byte) -127);
                if (null != var2) {
                  DefaultTextWidgetRenderer.field_a[3] = GzipInflater.a(var2, (byte) 80);
                }
                var2 = SectorCacheStore.a("mustlogin2,4", (byte) -127);
                if (null != var2) {
                  DefaultTextWidgetRenderer.field_a[4] = GzipInflater.a(var2, (byte) 115);
                }
                var2 = SectorCacheStore.a("mustlogin2,5", (byte) -127);
                if (var2 != null) {
                  DefaultTextWidgetRenderer.field_a[5] = GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("mustlogin2,6", (byte) -127);
                if (var2 != null) {
                  DefaultTextWidgetRenderer.field_a[6] = GzipInflater.a(var2, (byte) 123);
                }
                var2 = SectorCacheStore.a("mustlogin2,7", (byte) -127);
                if (null != var2) {
                  DefaultTextWidgetRenderer.field_a[7] = GzipInflater.a(var2, (byte) 84);
                }
                var2 = SectorCacheStore.a("mustlogin3,1", (byte) -127);
                if (null != var2) {
                  bf.field_d[1] = GzipInflater.a(var2, (byte) 98);
                }
                var2 = SectorCacheStore.a("mustlogin3,2", (byte) -127);
                if (null != var2) {
                  bf.field_d[2] = GzipInflater.a(var2, (byte) 102);
                }
                var2 = SectorCacheStore.a("mustlogin3,3", (byte) -127);
                if (var2 != null) {
                  bf.field_d[3] = GzipInflater.a(var2, (byte) 113);
                }
                var2 = SectorCacheStore.a("mustlogin3,4", (byte) -127);
                if (null != var2) {
                  bf.field_d[4] = GzipInflater.a(var2, (byte) 106);
                }
                var2 = SectorCacheStore.a("mustlogin3,5", (byte) -127);
                if (null != var2) {
                  bf.field_d[5] = GzipInflater.a(var2, (byte) 119);
                }
                var2 = SectorCacheStore.a("mustlogin3,6", (byte) -127);
                if (null != var2) {
                  bf.field_d[6] = GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("mustlogin3,7", (byte) -127);
                if (var2 != null) {
                  bf.field_d[7] = GzipInflater.a(var2, (byte) 80);
                }
                var2 = SectorCacheStore.a("discard", (byte) -127);
                if (null != var2) {
                  gg.field_c = GzipInflater.a(var2, (byte) 86);
                }
                var2 = SectorCacheStore.a("mustlogin4,1", (byte) -127);
                if (var2 != null) {
                  sb.field_b[1] = GzipInflater.a(var2, (byte) 88);
                }
                var2 = SectorCacheStore.a("mustlogin4,2", (byte) -127);
                if (var2 != null) {
                  sb.field_b[2] = GzipInflater.a(var2, (byte) 80);
                }
                var2 = SectorCacheStore.a("mustlogin4,3", (byte) -127);
                if (var2 != null) {
                  sb.field_b[3] = GzipInflater.a(var2, (byte) 81);
                }
                var2 = SectorCacheStore.a("mustlogin4,4", (byte) -127);
                if (var2 != null) {
                  sb.field_b[4] = GzipInflater.a(var2, (byte) 94);
                }
                var2 = SectorCacheStore.a("mustlogin4,5", (byte) -127);
                if (null != var2) {
                  sb.field_b[5] = GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("mustlogin4,6", (byte) -127);
                if (var2 != null) {
                  sb.field_b[6] = GzipInflater.a(var2, (byte) 124);
                }
                var2 = SectorCacheStore.a("mustlogin4,7", (byte) -127);
                if (var2 != null) {
                  sb.field_b[7] = GzipInflater.a(var2, (byte) 117);
                }
                var2 = SectorCacheStore.a("mustlogin_notloggedin", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 85);
                }
                var2 = SectorCacheStore.a("mustlogin_alternate,1", (byte) -127);
                if (var2 != null) {
                  LoginPanel.field_N[1] = GzipInflater.a(var2, (byte) 109);
                }
                var2 = SectorCacheStore.a("mustlogin_alternate,2", (byte) -127);
                if (null != var2) {
                  LoginPanel.field_N[2] = GzipInflater.a(var2, (byte) 105);
                }
                var2 = SectorCacheStore.a("mustlogin_alternate,3", (byte) -127);
                if (null != var2) {
                  LoginPanel.field_N[3] = GzipInflater.a(var2, (byte) 80);
                }
                var2 = SectorCacheStore.a("mustlogin_alternate,4", (byte) -127);
                if (null != var2) {
                  LoginPanel.field_N[4] = GzipInflater.a(var2, (byte) 96);
                }
                var2 = SectorCacheStore.a("mustlogin_alternate,5", (byte) -127);
                if (var2 != null) {
                  LoginPanel.field_N[5] = GzipInflater.a(var2, (byte) 79);
                }
                var2 = SectorCacheStore.a("mustlogin_alternate,6", (byte) -127);
                if (var2 != null) {
                  LoginPanel.field_N[6] = GzipInflater.a(var2, (byte) 117);
                }
                var2 = SectorCacheStore.a("mustlogin_alternate,7", (byte) -127);
                if (var2 != null) {
                  LoginPanel.field_N[7] = GzipInflater.a(var2, (byte) 98);
                }
                var2 = SectorCacheStore.a("subscription_cost_monthly,0", (byte) -127);
                if (var2 != null) {
                  ContentTransitionDialog.field_ib[0] = GzipInflater.a(var2, (byte) 110);
                }
                var2 = SectorCacheStore.a("subscription_cost_monthly,1", (byte) -127);
                if (var2 != null) {
                  ContentTransitionDialog.field_ib[1] = GzipInflater.a(var2, (byte) 95);
                }
                var2 = SectorCacheStore.a("subscription_cost_monthly,2", (byte) -127);
                if (null != var2) {
                  ContentTransitionDialog.field_ib[2] = GzipInflater.a(var2, (byte) 93);
                }
                var2 = SectorCacheStore.a("subscription_cost_monthly,3", (byte) -127);
                if (var2 != null) {
                  ContentTransitionDialog.field_ib[3] = GzipInflater.a(var2, (byte) 80);
                }
                var2 = SectorCacheStore.a("subscription_cost_monthly,4", (byte) -127);
                if (var2 != null) {
                  ContentTransitionDialog.field_ib[4] = GzipInflater.a(var2, (byte) 85);
                }
                var2 = SectorCacheStore.a("subscription_cost_monthly,5", (byte) -127);
                if (var2 != null) {
                  ContentTransitionDialog.field_ib[5] = GzipInflater.a(var2, (byte) 125);
                }
                var2 = SectorCacheStore.a("subscription_cost_monthly,6", (byte) -127);
                if (null != var2) {
                  ContentTransitionDialog.field_ib[6] = GzipInflater.a(var2, (byte) 120);
                }
                var2 = SectorCacheStore.a("subscription_cost_monthly,7", (byte) -127);
                if (var2 != null) {
                  ContentTransitionDialog.field_ib[7] = GzipInflater.a(var2, (byte) 104);
                }
                var2 = SectorCacheStore.a("subscription_cost_monthly,8", (byte) -127);
                if (var2 != null) {
                  ContentTransitionDialog.field_ib[8] = GzipInflater.a(var2, (byte) 99);
                }
                var2 = SectorCacheStore.a("subscription_cost_monthly,9", (byte) -127);
                if (null != var2) {
                  ContentTransitionDialog.field_ib[9] = GzipInflater.a(var2, (byte) 123);
                }
                var2 = SectorCacheStore.a("subscription_cost_monthly,10", (byte) -127);
                if (var2 != null) {
                  ContentTransitionDialog.field_ib[10] = GzipInflater.a(var2, (byte) 106);
                }
                var2 = SectorCacheStore.a("subscription_cost_monthly,11", (byte) -127);
                if (var2 != null) {
                  ContentTransitionDialog.field_ib[11] = GzipInflater.a(var2, (byte) 127);
                }
                var2 = SectorCacheStore.a("subscription_cost_monthly,12", (byte) -127);
                if (null != var2) {
                  ContentTransitionDialog.field_ib[12] = GzipInflater.a(var2, (byte) 110);
                }
                var2 = SectorCacheStore.a("sentence_separator", (byte) -127);
                if (var2 != null) {
                  GzipInflater.a(var2, (byte) 109);
                }
                FrameTimer.field_d = null;
                finished = true; return;
            }
            void run() {
                try {
                  loadLoginLobbyAndChatText();
                  if (finished) return;
                  loadAccountFormsAndLoadingText();
                  if (finished) return;
                  loadMatchDisplayAndMembershipText();
                  if (finished) return;
                  loadRankingsLoginAndSubscriptionText();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_2608_0 = (RuntimeException) (var2_ref);
                  stackIn_2608_1 = new StringBuilder().append("c.U(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_2609_2 = "null";
                  } else {
                    stackIn_2609_2 = "{...}";
                  }
                  throw ma.wrapException((Throwable) ((Object) stackIn_2608_0), ((StringBuilder) (Object) stackIn_2608_1).append(stackIn_2609_2).append(')').toString());
                }
            }
        }
        ClientTextLoader decompiledBody = new ClientTextLoader(param0, param1);
        decompiledBody.run();
    }

    final void configureOptionalPacketHandlers(boolean param0, int param1, boolean param2, boolean param3, boolean param4) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          this.enableDefaultPacketHandlers(param1 - 11472, false);
          if (param2) {
            this.enablePacketOne(108);
          }
          if (param3) {
            this.enablePacketTwo(param1 ^ 116);
          }
          if (param1 != 2) {
            this.field_t = (String) null;
          }
          if (param4) {
            this.enablePacketFour((byte) -58);
          }
          if (param0) {
            this.enablePacketFive((byte) 43);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var6), "c.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void enablePacketFive(byte param0) {
        try {
          nl.field_e[5] = true;
          if (param0 != 43) {
            this.field_r = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "c.H(" + param0 + ')');
        }
    }

    final void dispatchCommonPacket(byte param0) {
        int stackIn_82_0 = 0;
        boolean stackIn_83_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        vk var3 = null;
        int var4 = 0;
        var4 = Main.field_T;
        try {
          if (param0 <= 85) {
            this.field_v = true;
          }
          var2_int = pd.field_l;
          if (var2_int < 64 &&
            nl.field_e[var2_int]) {
            if (var2_int != 0) {
              if (var2_int != 1) {
                if (var2_int != 2) {
                  if (var2_int == 3) {
                    ValidationStatusWidget.i(0);
                    if (var4 == 0) {
                      return;
                    }
                  }
                  if (var2_int != 4) {
                    if (var2_int != 5) {
                      if (var2_int != 6) {
                        if (var2_int == 7) {
                          this.readSessionCookieUpdate((byte) -122);
                          if (var4 == 0) {
                            return;
                          }
                        }
                        if (var2_int == 8) {
                          td.a(EmailFormatValidator.field_j, (byte) -121, al.field_a, jk.field_a);
                          if (var4 == 0) {
                            return;
                          }
                        }
                        if (var2_int == 16) {
                          t.a((byte) 86);
                          if (var4 == 0) {
                            return;
                          }
                        }
                        if (var2_int != 11 &&
                          var2_int != 12) {
                          if (var2_int != 13) {
                            if (var2_int == 17) {
                              this.i((byte) -47);
                              if (var4 == 0) {
                                return;
                              }
                            }
                            if (var2_int == 18) {
                              bc.a(-464379825);
                              if (var4 == 0) {
                                return;
                              }
                            }
                            DebouncedFieldValidator.a((Throwable) null, (byte) -85, "MGS1: " + aj.a((byte) 92));
                            mc.a((byte) -125);
                            if (var4 == 0) {
                              return;
                            }
                          }
                          rh.a(0);
                          if (var4 == 0) {
                            return;
                          }
                        }
                        stackIn_82_0 = 24881;
                        stackIn_83_1 = (var2_int == 12);
                        var3 = tl.a(stackIn_82_0, stackIn_83_1);
                        vg.a(var3, -1);
                        if (var4 == 0) {
                          return;
                        }
                      }
                      ByteArrayStore.a(-28037);
                      if (var4 == 0) {
                        return;
                      }
                    }
                    DiskCacheWorker.a(-124);
                    if (var4 == 0) {
                      return;
                    }
                  }
                  f.b(-1);
                  if (var4 == 0) {
                    return;
                  }
                }
                mg.b((byte) -127);
                if (var4 == 0) {
                  return;
                }
              }
              DelegatingCanvas.a(0);
              return;
            }
            return;
          }
          DebouncedFieldValidator.a((Throwable) null, (byte) -79, "MGS2: " + aj.a((byte) 92));
          mc.a((byte) -126);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "c.B(" + param0 + ')');
        }
    }

    private final void enablePacketOne(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 <= 85) {
            this.field_v = false;
          }
          nl.field_e[1] = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "c.E(" + param0 + ')');
        }
    }

    final static boolean b(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var1), "c.K(" + param0 + ')');
        }
    }

    final int attemptReconnect(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_b) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          if (!SpriteGeometry.b((byte) 34)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (ve.field_a) {
            stackIn_8_0 = -1;
            return stackIn_8_0;
          }
          var2_int = ha.a(this.field_r, td.a(-2), 94, true, this.field_p, ij.a((byte) 117));
          if (-1 == var2_int) {
            stackIn_13_0 = -1;
            return stackIn_13_0;
          }
          if (0 != var2_int &&
            var2_int != 1) {
            if (!ve.field_e) {
              this.showErrorPage((byte) -60, "reconnect");
            }
            wd.a(31668);
            if (param0) {
              field_u = (BitmapFont) null;
            }
            AccountServiceResult.a(var2_int, -9, e.field_a);
            ve.field_a = true;
            mf.field_j = 15000L + id.correctedCurrentTimeMillis(72);
            stackIn_36_0 = var2_int;
            return stackIn_36_0;
          }
          if (cd.field_e == 11 &&
            BitPacketBuffer.field_n == 0) {
            al.a(-53);
          }
          stackIn_28_0 = var2_int;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "c.G(" + param0 + ')');
        }
    }

    final int a(boolean param0, byte param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          var3_int = 33 % ((-19 - param1) / 43);
          stackIn_1_0 = this.processAccountUiActions(param0, true, 10);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var3), "c.M(" + param0 + ',' + param1 + ')');
        }
    }

    final void serviceFramework(byte param0, boolean param1) {
        int stackIn_38_0 = 0;
        String stackIn_200_0 = null;
        int stackIn_200_1 = 0;
        boolean stackIn_201_2 = false;
        boolean stackIn_205_3;
        RuntimeException decompiledCaughtException = null;
        java.awt.Container var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        java.awt.Dimension var4_ref_java_awt_Dimension = null;
        int var4 = 0;
        int var5 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        var5 = Main.field_T;
        try {
          if (DropTargetWidgetContainer.field_A != null) {
            if (null == DiskCacheWorker.field_a) {
              var3 = ProgressMessageDialog.t(3);
              var4_ref_java_awt_Dimension = var3.getSize();
              DropTargetWidgetContainer.field_A.a(var4_ref_java_awt_Dimension.height, (byte) 115, var4_ref_java_awt_Dimension.width);
            }
            DropTargetWidgetContainer.field_A.b(5718);
          }
          i.a(-125);
          rf.c(-54);
          if (!th.a(true) &&
            cd.field_e != 11) {
            BoundedRandomAccessFile.a(false);
          }
          if (Main.field_V != null) {
            eg.field_f = Main.field_V.pollRotation(-119);
          }
          if (DequeWidgetContainer.j(7)) {
            var3_int = 1200 * SecondaryNodeDeque.a(22018);
            if (this.field_v ||
              !(var3_int >= PasswordValidator.h(-1)) &&
              !(dj.c(0) <= var3_int)) {
              this.field_v = false;
              mc.a((byte) -128);
              wd.a(31668);
              AccountServiceResult.a(2, -9, ResizableModalDialog.field_S);
              DropTargetWidgetContainer.j(-9636);
              ve.field_a = true;
              mf.field_j = 15000L + id.correctedCurrentTimeMillis(74);
            }
          }
          if (-1 == BitPacketBuffer.field_n ||
            BitPacketBuffer.field_n == 0) {
            stackIn_38_0 = (BitPacketBuffer.field_n != -1) ? 0 : 1;
            var3_intLifetime1 = stackIn_38_0;
            BitPacketBuffer.field_n = DirectByteArrayStore.c(0);
            if (var3_intLifetime1 != 0 &&
              BitPacketBuffer.field_n == 0 &&
              cd.field_e == 11 &&
              !SpriteGeometry.b((byte) 34)) {
              al.a(-76);
            }
            if (-1 != BitPacketBuffer.field_n &&
              0 != BitPacketBuffer.field_n) {
              mf.field_j = id.correctedCurrentTimeMillis(54) + 15000L;
            }
          }
          boolean decompiledFrameRemainder1 = true;
          var3_intLifetime2 = 14 / ((param0 - 5) / 57);
          if (-1 != BitPacketBuffer.field_n &&
            BitPacketBuffer.field_n != 0) {
            if (10 > DequeWidgetContainer.field_A) {
              if (BitPacketBuffer.field_n == 3) {
                this.showErrorPage((byte) -115, "js5crc");
                decompiledFrameRemainder1 = (var5 != 0);
              }
              if (decompiledFrameRemainder1) {
                if (BitPacketBuffer.field_n != 4) {
                  if (BitPacketBuffer.field_n != 2) {
                    if (5 == BitPacketBuffer.field_n) {
                      this.showErrorPage((byte) -121, "outofdate");
                      decompiledFrameRemainder1 = (var5 != 0);
                    }
                    if (decompiledFrameRemainder1) {
                      this.showErrorPage((byte) -95, "js5connect");
                      decompiledFrameRemainder1 = (var5 != 0);
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    this.showErrorPage((byte) -64, "js5connect_full");
                    decompiledFrameRemainder1 = (var5 != 0);
                  }
                }
                if (decompiledFrameRemainder1) {
                  this.showErrorPage((byte) -36, "js5io");
                  decompiledFrameRemainder1 = (var5 != 0);
                }
              }
            }
            if ((decompiledFrameRemainder1) &&
              (cd.field_e >= 10)) {
              boolean decompiledFrameRemainder0 = true;
              wd.a(31668);
              if (BitPacketBuffer.field_n == 3) {
                AccountServiceResult.a(256, -9, kk.field_a);
                decompiledFrameRemainder0 = (var5 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (4 != BitPacketBuffer.field_n) {
                  if (BitPacketBuffer.field_n != 2) {
                    if (BitPacketBuffer.field_n != 5) {
                      AccountServiceResult.a(256, -9, ClientException.field_c);
                      if (var5 != 0) {
                        AccountServiceResult.a(5, -9, ve.field_b);
                        AccountServiceResult.a(256, -9, rh.field_g);
                        AccountServiceResult.a(256, -9, ma.field_b);
                      }
                    } else {
                      AccountServiceResult.a(5, -9, ve.field_b);
                      if (var5 != 0) {
                        AccountServiceResult.a(256, -9, rh.field_g);
                        AccountServiceResult.a(256, -9, ma.field_b);
                      }
                    }
                  } else {
                    AccountServiceResult.a(256, -9, rh.field_g);
                    if (var5 != 0) {
                      AccountServiceResult.a(256, -9, ma.field_b);
                    }
                  }
                } else {
                  AccountServiceResult.a(256, -9, ma.field_b);
                }
              }
              ve.field_a = true;
            }
          }
          if ((BitPacketBuffer.field_n != -1 &&
            BitPacketBuffer.field_n != 0 ||
            SpriteGeometry.b((byte) 34)) &&
            mf.field_j <= id.correctedCurrentTimeMillis(59)) {
            ve.field_a = false;
            if (BitPacketBuffer.field_n != -1 &&
              BitPacketBuffer.field_n != 0) {
              BitPacketBuffer.field_n = -1;
              ContentTransitionDialog.c(true);
            }
          }
          if (BitPacketBuffer.field_n == 0 &&
            !SpriteGeometry.b((byte) 34)) {
            sg.field_b = false;
          }
          if (DequeWidgetContainer.field_A == 0 &&
            eh.a(37)) {
            DequeWidgetContainer.field_A = 1;
          }
          if (DequeWidgetContainer.field_A == 1) {
            if (EditableTextField.field_I != 0) {
              lb.field_a = aj.a(1, jj.field_b);
            }
            jk.field_c = DraggableWidgetContainer.a(true, eb.field_f, 1, false, 2147483647);
            aa.field_db = DraggableWidgetContainer.a(true, jh.field_b, 1, false, 2147483647);
            sg.field_a = DraggableWidgetContainer.a(true, ia.field_e, 1, false, 2147483647);
            DequeWidgetContainer.field_A = 2;
            EditableTextField.field_H = jk.field_c;
          }
          if (DequeWidgetContainer.field_A == 2) {
            if (null != lb.field_a &&
              lb.field_a.ensureIndexLoaded(4)) {
              if (lb.field_a.hasGroupName(0, "")) {
                if (lb.field_a.tryLoadGroupByName(4, "")) {
                  NetworkGameClient.loadSharedInterfaceText(-106, lb.field_a);
                  lb.field_a = null;
                  AccountNameAvailabilityValidator.b((byte) -40);
                  if (var5 != 0) {
                    lb.field_a = null;
                  }
                }
              } else {
                lb.field_a = null;
              }
            }
            if (lb.field_a == null) {
              DequeWidgetContainer.field_A = 3;
            }
          }
          if (DequeWidgetContainer.field_A == 3 &&
            uh.a(jk.field_c, sg.field_a, aa.field_db, 2) &&
            sk.a((byte) 33, sg.field_a)) {
            sg.a((byte) -12);
            ad.a(51);
            LabeledWidgetContainer.field_G = FrameTimer.field_c;
            GuestPlayConfirmationForm.field_K = false;
            cj.a(aa.field_db, RichTextWidget.field_F, sg.field_a, jk.field_c, 126);
            if (PacketBuffer.field_h ||
              null != cj.field_k) {
              stackIn_200_0 = cj.field_k;
              stackIn_200_1 = 1024;
              stackIn_201_2 = !(PacketBuffer.field_h);
              stackIn_205_3 = !(PacketBuffer.field_h);
              mb.a(stackIn_200_0, stackIn_200_1, stackIn_201_2, stackIn_205_3);
            }
            if (sl.field_a) {
              lc.a(4);
            }
            if (ContentTransitionDialog.field_hb == null) {
              ContentTransitionDialog.field_hb = ProgressMessageDialog.r(77);
              FullscreenFocusCanvas.field_a = fd.a(-28506);
            }
            ca.a(sg.field_a, ContentTransitionDialog.field_hb, FullscreenFocusCanvas.field_a, 0);
            aa.field_db = null;
            jk.field_c = null;
            sg.field_a = null;
            SingleChildWidgetContainer.a((java.applet.Applet) (this), 18478);
            AccountNameAvailabilityValidator.b((byte) -77);
            DequeWidgetContainer.field_A = 10;
          }
          if (10 == DequeWidgetContainer.field_A) {
            if (0 != EditableTextField.field_I) {
              ue.field_a = aj.a(1, bf.field_a);
            }
            DequeWidgetContainer.field_A = 11;
          }
          if (DequeWidgetContainer.field_A == 11) {
            boolean decompiledSharedTail0 = (null != ue.field_a &&
              (!(ue.field_a.ensureIndexLoaded(4)) ||
              !(ue.field_a.tryLoadAllGroups((byte) 56))));
            if (!decompiledSharedTail0) {
              DequeWidgetContainer.field_A = 12;
              kj.field_P = true;
              decompiledSharedTail0 = (var5 != 0);
            }
            if (decompiledSharedTail0) {
              ug.a(0.0f, 106, pf.a(ue.field_a, FullscreenFocusCanvas.field_d, MatchingFieldValidator.field_j, true));
            }
          }
          if (12 == DequeWidgetContainer.field_A &&
            !kj.field_P) {
            DequeWidgetContainer.field_A = 13;
          }
          if (DequeWidgetContainer.field_A == 13) {
            var4 = 1;
            if (null != rh.field_l) {
              var4 = rh.field_l.a(110) ? 1 : 0;
              ug.a(rh.field_l.field_g, 115, rh.field_l.field_i);
            }
            if (var4 != 0) {
              DequeWidgetContainer.field_A = 20;
            }
          }
          if (!param1 &&
            vd.field_w) {
            AccountCreationResultPanel.a(tb.field_c, (byte) -108);
            this.d(-1775094552);
            BufferedRandomAccessFile.a(tb.field_c, -1);
          }
          if (nl.field_e[8]) {
            Main.l((byte) 89);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var3_ref), "c.F(" + param0 + ',' + param1 + ')');
        }
    }

    private final void initializePacketLengths(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 < 75) {
            this.field_n = true;
          }
          ad.field_t[4] = -1;
          ad.field_t[12] = -1;
          ad.field_t[3] = -1;
          ad.field_t[16] = -1;
          ad.field_t[13] = -1;
          ad.field_t[17] = -1;
          ad.field_t[1] = 16;
          ad.field_t[9] = -1;
          ad.field_t[18] = 1;
          ad.field_t[7] = -1;
          ad.field_t[2] = -2;
          ad.field_t[5] = -1;
          ad.field_t[8] = -2;
          ad.field_t[10] = -1;
          ad.field_t[6] = -2;
          ad.field_t[11] = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "c.O(" + param0 + ')');
        }
    }

    private final void enableDefaultPacketHandlers(int param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          nl.field_e[0] = true;
          nl.field_e[8] = param1;
          nl.field_e[16] = true;
          nl.field_e[7] = true;
          nl.field_e[17] = true;
          nl.field_e[18] = true;
          if (param0 != -11470) {
            this.field_x = 86L;
          }
          nl.field_e[3] = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var3), "c.P(" + param0 + ',' + param1 + ')');
        }
    }

    private final static boolean h(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -58) {
            stackIn_4_0 = lf.field_b;
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var1), "c.N(" + param0 + ')');
        }
    }

    private final void readAppletParameters(int param0, String param1, int param2, int param3, int param4) {
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        Throwable decompiledCaughtException = null;
        String var6 = null;
        Exception var6_ref = null;
        RuntimeException var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        try {
          try {
            if (!this.allowAppletStartup((byte) -123)) {
              return;
            }
            this.field_t = this.getCodeBase().getHost();
            var6 = this.field_t.toLowerCase();
            stackIn_10_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_r = stackIn_10_1;
            this.field_o = Integer.parseInt(this.getParameter("gameport1"));
            this.field_s = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (null != var7) {
              this.field_q = Integer.parseInt(var7);
            }
            this.field_l = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_x = Long.parseLong(this.getParameter("instanceid"));
            this.field_n = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_m = Integer.parseInt(var8);
            }
            if (param0 >= ~this.field_m) {
              this.field_m = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_p = Integer.parseInt(var9);
            }
            sl.field_a = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.startApplet((byte) 106, param1, param4, this.field_l, param3, param2, 32);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            DebouncedFieldValidator.a((Throwable) ((Object) var6_ref), (byte) -72, (String) null);
            this.showErrorPage((byte) -77, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_32_0 = var6_ref2;
          stackIn_32_1 = new StringBuilder().append("c.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void i(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = EmailFormatValidator.field_j.readUnsignedByte(50);
          stackIn_4_0 = ((1 & var2_int) == 0) ? 0 : 1;
          var3 = stackIn_4_0;
          var4 = al.field_a - 1;
          var5 = new byte[var4];
          if (param0 != -47) {
            this.attemptReconnect(false);
          }
          EmailFormatValidator.field_j.readCipheredBytes(0, var5, 28040, var4);
          IntrusiveDeque.a(PasswordValidator.g(-117), -25573, GzipInflater.a(var5, (byte) 89), var3 != 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) runtimeException), "c.D(" + param0 + ')');
        }
    }

    final void a(int param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.readAppletParameters(-6, param1, 640, param0, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("c.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void readSessionCookieUpdate(byte param0) {
        String var2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (param0 > -75) {
            this.field_l = -59;
          }
          var2 = sb.a(-3871);
          h.a(PasswordValidator.g(-121), (byte) 68, var2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2_ref), "c.T(" + param0 + ')');
        }
    }

    public static void g(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_u = null;
          field_k = null;
          if (param0 <= 60) {
            NetworkGameClient.g((byte) 43);
          }
          field_w = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var1), "c.R(" + param0 + ')');
        }
    }

    final void initializeFramework(int param0, int param1, int param2, int param3, int param4, byte param5, boolean param6, int param7) {
        RuntimeException runtimeException = null;
        java.awt.Frame var9 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new java.awt.Frame("Jagex");
          var9.pack();
          var9.dispose();
          if (param5 <= 109) {
            field_u = (BitmapFont) null;
          }
          this.setBackground(java.awt.Color.black);
          EditableTextField.field_I = this.field_m;
          KeyboardInputHandler.a(-115, EditableTextField.field_I);
          vd.a(this.field_l, EditableTextField.field_I, param6, this.field_x, this.field_q, 124, this.field_t, 5000, this.field_s, param2, this.field_o, 5000, jk.field_a, this.field_n);
          eb.a(jk.field_a, this.field_l, param2, this.field_t, this.field_q, (byte) -62, EditableTextField.field_I, this.field_s, this.field_o);
          wh.a(192);
          Main.field_V = PasswordValidator.c((byte) 100);
          BufferedRandomAccessFile.a(tb.field_c, -1);
          jh.field_b = param0;
          bf.field_a = param7;
          ia.field_e = param3;
          jj.field_b = param4;
          eb.field_f = param1;
          this.initializePacketLengths(90);
          uh.clearStaticReferences((byte) -79);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) runtimeException), "c.V(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    protected NetworkGameClient() {
    }

    private final void enablePacketFour(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 >= -45) {
            this.field_r = true;
          }
          nl.field_e[4] = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.wrapException((Throwable) ((Object) var2), "c.L(" + param0 + ')');
        }
    }

    private final int processAccountUiActions(boolean param0, boolean param1, int param2) {
        try {
          int stackIn_105_0 = 0;
          int stackIn_108_0 = 0;
          int stackIn_110_0 = 0;
          Throwable decompiledCaughtException = null;
          int var4_int = 0;
          RuntimeException var4 = null;
          int var5_int = 0;
          Exception var5 = null;
          Boolean var6 = null;
          PacketBuffer var6_ref = null;
          String var7 = null;
          int var8 = 0;
          var8 = Main.field_T;
          try {
            var4_int = TextLayout.a(EditableTextField.field_I, eg.field_f, param0, true);
            if (var4_int == 0) {
              throw new IllegalStateException();
            }
            if (var4_int == 1) {
              var5_int = ti.a(GzipInflater.a(-23339), a.e(48), param2 ^ 10);
              if (-1 != var5_int) {
                q.a(ll.field_f, var5_int, -106, e.field_a);
                ll.field_f = null;
                e.field_a = null;
              }
              var6 = DualLinkNode.a(59);
              if (var6 != null) {
                TextHotspotBounds.a(param2 + 24978, var6.booleanValue());
              }
            }
            if (var4_int == 2) {
              var5_int = qa.a(NetworkGameClient.h((byte) -58), ij.a((byte) 120), ja.a(-7705), de.a(565192680), td.a(-2), true, this.field_p);
              if (var5_int != -1) {
                sj.a(44, e.field_a, ll.field_f, var5_int);
                e.field_a = null;
                ll.field_f = null;
              }
            }
            if (var4_int == 3) {
              if (BitPacketBuffer.field_n != -1 &&
                BitPacketBuffer.field_n != 0) {
                BitPacketBuffer.field_n = -1;
                ContentTransitionDialog.c(true);
              }
              if (param1) {
                ve.field_a = false;
              }
              if (!param1 ||
                var8 != 0) {
                var5_int = ha.a(this.field_r, td.a(-2), 29, false, this.field_p, ij.a((byte) 114));
                if (var5_int != -1) {
                  boolean decompiledSharedTail1 = (var5_int == 0);
                  if (!decompiledSharedTail1) {
                    AccountServiceResult.a(var5_int, param2 ^ -3, e.field_a);
                    e.field_a = null;
                    decompiledSharedTail1 = (var8 != 0);
                  }
                  if (decompiledSharedTail1) {
                    kb.field_f = cd.field_a;
                    al.a(-19);
                    cd.field_e = 10;
                    vg.field_d = false;
                  }
                }
              }}
            if (var4_int == 4) {
              if (!RichTextWidget.field_F) {
                cd.field_e = 10;
                vg.field_d = true;
                if (var8 != 0) {
                  PacketBuffer.a(PasswordValidator.g(-119), (byte) 104);
                }
              } else {
                PacketBuffer.a(PasswordValidator.g(-119), (byte) 104);
              }
            }
            if (var4_int == 5) {
              PacketBuffer.a((byte) -124, PasswordValidator.g(-126));
            }
            if (var4_int == 6 &&
              GuestPlayConfirmationForm.field_K) {
              cd.field_e = 10;
            }
            if (7 == var4_int) {
              gg.a(PasswordValidator.g(-119), 7380);
            }
            if (8 == var4_int) {
              PacketBuffer.a(PasswordValidator.g(-125), (byte) 76);
            }
            if (9 == var4_int) {
              ProgressDialog.a(PasswordValidator.g(-127), (byte) -85);
            }
            if (param2 == var4_int) {
              NetworkArchiveRequest.field_r.writeCipheredByte(17, 0);
            }
            if (var4_int == 11) {
              wh.a(PasswordValidator.g(-125), 63);
            }
            if (12 == var4_int) {
              ValidationStatusWidget.a(PasswordValidator.g(param2 - 130), wd.b(-108), -31);
            }
            if (13 == var4_int) {
              try {
                if (TextLineMetrics.field_d == null) {
                  TextLineMetrics.field_d = new rf(jk.field_a, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                }
                var5_int = TextLineMetrics.field_d.a(true) ? 1 : 0;
                if (var5_int != 0) {
                  var6_ref = TextLineMetrics.field_d.a(-55);
                  boolean decompiledSharedTail0 = (null != var6_ref);
                  if (!decompiledSharedTail0) {
                    ok.a(param2 ^ 574, (String) null);
                    decompiledSharedTail0 = (var8 != 0);
                  }
                  if (decompiledSharedTail0) {
                    var7 = NameSuggestionsPanel.decodeCp1252String(255, 0, var6_ref.payload, var6_ref.position);
                    ok.a(564, var7);
                  }
                  TextLineMetrics.field_d = null;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5 = (Exception) (Object) decompiledCaughtException;
                DebouncedFieldValidator.a((Throwable) ((Object) var5), (byte) -104, "S1");
                ok.a(param2 + 554, (String) null);
                TextLineMetrics.field_d = null;
              }
            }
            if (var4_int == 15) {
              cd.field_e = 10;
            }
            if (16 == var4_int) {
              stackIn_105_0 = 1;
              return stackIn_105_0;
            }
            if (var4_int != 17) {
              stackIn_110_0 = 0;
              return stackIn_110_0;
            }
            stackIn_108_0 = 2;
            return stackIn_108_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            throw ma.wrapException((Throwable) ((Object) var4), "c.S(" + param0 + ',' + param1 + ',' + param2 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        int var0 = 0;
        field_w = new bl[255];
        for (var0 = 0; var0 < field_w.length; var0++) {
          field_w[var0] = new bl();
        }
        field_k = new de(2, 4, 4, 0);
    }
}
