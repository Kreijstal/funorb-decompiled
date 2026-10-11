/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class c extends fj {
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
    static ee field_u;

    final void k(byte param0) {
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
            if (!(g.field_A < 10)) {
              if (lc.a((byte) -94)) {
                if (cd.field_e == 0) {
                  discarded$2 = this.a(false, false, 10);
                  if (var3 != 0) {
                    hj.a(2, eg.field_f);
                    sc.a((byte) 20);
                    stackIn_26_1 = (null != gj.field_a);
                    discarded$3 = this.a(stackIn_26_1, false, 10);
                  }
                } else {
                  hj.a(2, eg.field_f);
                  if (var3 != 0) {
                    sc.a((byte) 20);
                    stackIn_26_1 = (null != gj.field_a);
                    discarded$3 = this.a(stackIn_26_1, false, 10);
                  }
                }
              } else {
                sc.a((byte) 20);
                if (var3 != 0) {
                  stackIn_26_1 = (null != gj.field_a);
                  discarded$3 = this.a(stackIn_26_1, false, 10);
                }
              }
            }
          } else {
            stackIn_26_1 = (null != gj.field_a);
            discarded$3 = this.a(stackIn_26_1, false, 10);
          }
          var2_int = -98 % ((param0 + 32) / 51);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "c.A(" + param0 + ')');
        }
    }

    private final void h(int param0) {
        try {
          nl.field_e[2] = true;
          int var2_int = -80 / ((param0 - 41) / 62);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "c.I(" + param0 + ')');
        }
    }

    private final static void a(int param0, qk param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_2608_0;
            StringBuilder stackIn_2608_1;
            String stackIn_2609_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int param0;
            qk param1;
            boolean finished;
            $CfrPartitionedBody(int initialParam0, qk initialParam1) {
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
            void runChunk0() throws java.lang.RuntimeException {
                gk.field_d = param1;
                var2 = hc.a("loginm3", (byte) -127);
                if (null != var2) {
                  jf.field_k = ge.a(var2, (byte) 81);
                }
                var2 = hc.a("loginm2", (byte) -127);
                if (var2 != null) {
                  e.field_f = ge.a(var2, (byte) 116);
                }
                var2 = hc.a("loginm1", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 92);
                }
                var2 = hc.a("idlemessage20min", (byte) -127);
                if (null != var2) {
                  jc.field_S = ge.a(var2, (byte) 113);
                }
                var2 = hc.a("error_js5crc", (byte) -127);
                if (null != var2) {
                  kk.field_a = ge.a(var2, (byte) 120);
                }
                var2 = hc.a("error_js5io", (byte) -127);
                if (var2 != null) {
                  ma.field_b = ge.a(var2, (byte) 126);
                }
                var2 = hc.a("error_js5connect_full", (byte) -127);
                if (var2 != null) {
                  rh.field_g = ge.a(var2, (byte) 104);
                }
                var2 = hc.a("error_js5connect", (byte) -127);
                if (null != var2) {
                  ac.field_c = ge.a(var2, (byte) 108);
                }
                var2 = hc.a("login_gameupdated", (byte) -127);
                if (var2 != null) {
                  ve.field_b = ge.a(var2, (byte) 97);
                }
                var2 = hc.a("create_unable", (byte) -127);
                if (var2 != null) {
                  qk.field_i = ge.a(var2, (byte) 116);
                }
                var2 = hc.a("create_ineligible", (byte) -127);
                if (var2 != null) {
                  pa.field_N = ge.a(var2, (byte) 121);
                }
                var2 = hc.a("usernameprompt", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 100);
                }
                var2 = hc.a("passwordprompt", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 81);
                }
                var2 = hc.a("andagainprompt", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 83);
                }
                var2 = hc.a("ticketing_read", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 84);
                }
                var2 = hc.a("ticketing_ignore", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 86);
                }
                var2 = hc.a("ticketing_oneunread", (byte) -127);
                if (var2 != null) {
                  dh.field_g = ge.a(var2, (byte) 122);
                }
                var2 = hc.a("ticketing_xunread", (byte) -127);
                if (null != var2) {
                  nc.field_a = ge.a(var2, (byte) 85);
                }
                var2 = hc.a("ticketing_gotowebsite", (byte) -127);
                if (null != var2) {
                  fk.field_l = ge.a(var2, (byte) 79);
                }
                var2 = hc.a("ticketing_waitingformessages", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 109);
                }
                var2 = hc.a("mu_chat_on", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 125);
                }
                var2 = hc.a("mu_chat_friends", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 105);
                }
                var2 = hc.a("mu_chat_off", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 95);
                }
                var2 = hc.a("mu_chat_lobby", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 111);
                }
                var2 = hc.a("mu_chat_public", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 88);
                }
                var2 = hc.a("mu_chat_ignore", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 125);
                }
                var2 = hc.a("mu_chat_tips", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 108);
                }
                var2 = hc.a("mu_chat_game", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 90);
                }
                var2 = hc.a("mu_chat_private", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 110);
                }
                var2 = hc.a("mu_x_entered_game", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 86);
                }
                var2 = hc.a("mu_x_joined_your_game", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 104);
                }
                var2 = hc.a("mu_x_entered_other_game", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 111);
                }
                var2 = hc.a("mu_x_left_lobby", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 78);
                }
                var2 = hc.a("mu_x_lost_con", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 108);
                }
                var2 = hc.a("mu_x_cannot_join_full", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 110);
                }
                var2 = hc.a("mu_x_cannot_join_inprogress", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 84);
                }
                var2 = hc.a("mu_x_declined_invite", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 104);
                }
                var2 = hc.a("mu_x_withdrew_request", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 124);
                }
                var2 = hc.a("mu_x_removed", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 117);
                }
                var2 = hc.a("mu_x_dropped_out", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 114);
                }
                var2 = hc.a("mu_entered_other_game", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 79);
                }
                var2 = hc.a("mu_game_is_full", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 118);
                }
                var2 = hc.a("mu_game_has_started", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 102);
                }
                var2 = hc.a("mu_you_declined_invite", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 125);
                }
                var2 = hc.a("mu_invite_withdrawn", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 97);
                }
                var2 = hc.a("mu_request_declined", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 81);
                }
                var2 = hc.a("mu_request_withdrawn", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 109);
                }
                var2 = hc.a("mu_all_players_have_left", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 88);
                }
                var2 = hc.a("mu_lobby_name", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 94);
                }
                var2 = hc.a("mu_lobby_rating", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 110);
                }
                var2 = hc.a("mu_lobby_friend_add", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 101);
                }
                var2 = hc.a("mu_lobby_friend_rm", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 82);
                }
                var2 = hc.a("mu_lobby_name_add", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 123);
                }
                var2 = hc.a("mu_lobby_name_rm", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 114);
                }
                var2 = hc.a("mu_lobby_location", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 124);
                }
                var2 = hc.a("mu_gamelist_all_games", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 122);
                }
                var2 = hc.a("mu_gamelist_status", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 113);
                }
                var2 = hc.a("mu_gamelist_owner", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 123);
                }
                var2 = hc.a("mu_gamelist_players", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 104);
                }
                var2 = hc.a("mu_gamelist_avg_rating", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 100);
                }
                var2 = hc.a("mu_gamelist_options", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 86);
                }
                var2 = hc.a("mu_gamelist_elapsed_time", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 105);
                }
                var2 = hc.a("mu_play_rated", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 113);
                }
                var2 = hc.a("mu_create_unrated", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 116);
                }
                var2 = hc.a("mu_options", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 101);
                }
                var2 = hc.a("mu_options_whocanjoin", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 99);
                }
                var2 = hc.a("mu_options_players", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 84);
                }
                var2 = hc.a("mu_options_dontmind", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 107);
                }
                var2 = hc.a("mu_options_allow_spectate", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 111);
                }
                var2 = hc.a("mu_options_ratedgametype", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 118);
                }
                var2 = hc.a("yes", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 125);
                }
                var2 = hc.a("no", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 122);
                }
                var2 = hc.a("mu_invite_players", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 85);
                }
                var2 = hc.a("close", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 92);
                }
                var2 = hc.a("add_x_to_friends", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 123);
                }
                var2 = hc.a("add_x_to_ignore", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 101);
                }
                var2 = hc.a("rm_x_from_friends", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 97);
                }
                var2 = hc.a("rm_x_from_ignore", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 114);
                }
                var2 = hc.a("send_pm_to_x", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 110);
                }
                var2 = hc.a("send_qc_to_x", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 80);
                }
                var2 = hc.a("send_pm", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 90);
                }
                var2 = hc.a("invite_accept_xs_game", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 124);
                }
                var2 = hc.a("invite_decline_xs_game", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 121);
                }
                var2 = hc.a("join_xs_game", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 127);
                }
                var2 = hc.a("join_request_xs_game", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 102);
                }
                var2 = hc.a("join_withdraw_request_xs_game", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 96);
                }
                var2 = hc.a("mu_gameopt_kick_x_from_this_game", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 105);
                }
                var2 = hc.a("mu_gameopt_withdraw_invite_to_x", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 109);
                }
                var2 = hc.a("mu_gameopt_accept_x_into_game", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 125);
                }
                var2 = hc.a("mu_gameopt_reject_x_from_game", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 117);
                }
                var2 = hc.a("mu_gameopt_invite_x_to_game", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 118);
                }
                var2 = hc.a("report_x_for_abuse", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 90);
                }
                var2 = hc.a("unable_to_send_message_password_a", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 90);
                }
                var2 = hc.a("unable_to_send_message_password_b", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 100);
                }
                var2 = hc.a("mu_chat_lobby_show_all", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 114);
                }
                var2 = hc.a("mu_chat_lobby_friends_only", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 110);
                }
                var2 = hc.a("mu_chat_lobby_friends", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 83);
                }
                var2 = hc.a("mu_chat_lobby_hide", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 85);
                }
                var2 = hc.a("mu_chat_game_show_all", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 103);
                }
                var2 = hc.a("mu_chat_game_friends_only", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 118);
                }
                var2 = hc.a("mu_chat_game_friends", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 118);
                }
                var2 = hc.a("mu_chat_game_hide", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 80);
                }
                var2 = hc.a("mu_chat_pm_show_all", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 104);
                }
                var2 = hc.a("mu_chat_pm_friends_only", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 127);
                }
                var2 = hc.a("mu_chat_pm_friends", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 96);
                }
                var2 = hc.a("mu_chat_invisible_and_silent_mode", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 90);
                }
                var2 = hc.a("you_have_been_removed_from_xs_game", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 92);
                }
                var2 = hc.a("your_rating_is_x", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 104);
                }
                var2 = hc.a("you_are_on_x_server", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 102);
                }
                var2 = hc.a("rated_game", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 100);
                }
                var2 = hc.a("unrated_game", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 94);
                }
                var2 = hc.a("rated_game_tips", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 87);
                }
                var2 = hc.a("searching_for_opponent_singular", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 87);
                }
                var2 = hc.a("searching_for_opponents_plural", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 96);
                }
                var2 = hc.a("find_opponent_singular", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 92);
                }
                var2 = hc.a("find_opponents_plural", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 104);
                }
                var2 = hc.a("rated_game_tips_setup_singular", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 86);
                }
                var2 = hc.a("rated_game_tips_setup_plural", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 96);
                }
                var2 = hc.a("waiting_to_start_hint", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 117);
                }
                var2 = hc.a("your_game", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 102);
                }
                var2 = hc.a("game_full", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 110);
                }
                var2 = hc.a("join_requests_one", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 119);
                }
                var2 = hc.a("join_requests_many", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 126);
                }
                var2 = hc.a("xs_game", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 97);
                }
                var2 = hc.a("waiting_for_x_to_start_game", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 95);
                }
                var2 = hc.a("game_options_changed", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 105);
                }
                var2 = hc.a("players_x_of_y", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 114);
                }
                var2 = hc.a("message_lobby", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 103);
                }
                var2 = hc.a("quickchat_lobby", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 115);
                }
                var2 = hc.a("message_game", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 117);
                }
                var2 = hc.a("message_team", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 109);
                }
                var2 = hc.a("quickchat_game", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 88);
                }
                var2 = hc.a("kick", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 100);
                }
                var2 = hc.a("inviting_x", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 83);
                }
                var2 = hc.a("x_wants_to_join", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 112);
                }
                var2 = hc.a("accept", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 124);
                }
                var2 = hc.a("reject", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 122);
                }
                var2 = hc.a("invite", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 125);
                }
                var2 = hc.a("status_concluded", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 115);
                }
                var2 = hc.a("status_spectate", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 121);
                }
                var2 = hc.a("status_playing", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 115);
                }
                var2 = hc.a("status_join", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 106);
                }
                var2 = hc.a("status_private", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 111);
                }
                var2 = hc.a("status_full", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 78);
                }
                var2 = hc.a("players_in_game", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 119);
                }
                var2 = hc.a("you_are_invited_to_xs_game", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 100);
                }
                var2 = hc.a("asking_to_join_xs_game", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 110);
                }
                var2 = hc.a("who_can_join", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 98);
                }
                var2 = hc.a("you_can_join", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 88);
                }
                var2 = hc.a("you_can_ask_to_join", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 78);
                }
                var2 = hc.a("you_cannot_join_in_progress", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 108);
                }
                var2 = hc.a("you_can_spectate", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 108);
                }
                var2 = hc.a("you_can_not_spectate", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 79);
                }
                var2 = hc.a("spectate_xs_game", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 94);
                }
                var2 = hc.a("hide_players_in_xs_game", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 79);
                }
                var2 = hc.a("show_players_in_xs_game", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 81);
                }
                var2 = hc.a("connecting_to_friend_server_twoline", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 116);
                }
                var2 = hc.a("loading", (byte) -127);
                if (null != var2) {
                  gk.field_c = ge.a(var2, (byte) 120);
                }
                var2 = hc.a("offline", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 107);
                }
                var2 = hc.a("multiconst_invite_only", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 101);
                }
                var2 = hc.a("multiconst_clan", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 90);
                }
                var2 = hc.a("multiconst_friends", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 110);
                }
                var2 = hc.a("multiconst_similar_rating", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 94);
                }
                var2 = hc.a("multiconst_open", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 93);
                }
                var2 = hc.a("no_options_available", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 96);
                }
                var2 = hc.a("reportabuse", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 107);
                }
                var2 = hc.a("presstabtochat", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 86);
                }
                var2 = hc.a("pressf10toquickchat", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 98);
                }
                var2 = hc.a("dob_chatdisabled", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 79);
                }
                var2 = hc.a("dob_enterforchat", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 93);
                }
                var2 = hc.a("tab_hidechattemporarily", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 89);
                }
                var2 = hc.a("esc_cancelprivatemessage", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 100);
                }
                var2 = hc.a("esc_cancelthisline", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 115);
                }
                var2 = hc.a("privatequickchat_from_x", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 121);
                }
                var2 = hc.a("privatequickchat_to_x", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 115);
                }
                var2 = hc.a("privatechat_blankarea_explanation", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 97);
                }
                var2 = hc.a("publicchat_unavailable_ratedgame", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 94);
                }
                var2 = hc.a("privatechat_friend_offline", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 111);
                }
                var2 = hc.a("privatechat_friend_notlisted", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 99);
                }
                var2 = hc.a("chatviewscrolledup", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 96);
                }
                var2 = hc.a("thisisrunescapeclan", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 103);
                }
                var2 = hc.a("thisisrunescapeclan_notowner", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 94);
                }
                var2 = hc.a("runescapeclan", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 83);
                }
                var2 = hc.a("rated_membersonly", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 114);
                }
                var2 = hc.a("gameopt_membersonly", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 127);
                }
                var2 = hc.a("gameopt_1moreratedgame", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 97);
                }
                var2 = hc.a("gameopt_moreratedgames", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 99);
                }
                var2 = hc.a("gameopt_needrating", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 114);
                }
                var2 = hc.a("gameopt_unratedonly", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 90);
                }
                var2 = hc.a("gameopt_notunlocked", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 89);
                }
                var2 = hc.a("gameopt_cannotbecombined1", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 79);
                }
                var2 = hc.a("gameopt_cannotbecombined2", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 91);
                }
                var2 = hc.a("gameopt_playernotmember", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 83);
                }
                var2 = hc.a("gameopt_younotmember", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 100);
                }
                var2 = hc.a("gameopt_playerneedsrating", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 96);
                }
                var2 = hc.a("gameopt_youneedrating", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 95);
                }
                var2 = hc.a("gameopt_playerneedsratedgames", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 102);
                }
                var2 = hc.a("gameopt_youneedratedgames", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 81);
                }
                var2 = hc.a("gameopt_playerneeds1ratedgame", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 116);
                }
                var2 = hc.a("gameopt_youneed1ratedgame", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 102);
                }
                var2 = hc.a("gameopt_playerhasntunlocked", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 104);
                }
                var2 = hc.a("gameopt_youhaventunlocked", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 93);
                }
                var2 = hc.a("gameopt_trychanging1", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 106);
                }
                var2 = hc.a("gameopt_trychanging2", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 123);
                }
                var2 = hc.a("gameopt_needchanging1", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 83);
                }
                var2 = hc.a("gameopt_needchanging2", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 91);
                }
                var2 = hc.a("gameopt_mightchange", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 117);
                }
                var2 = hc.a("gameopt_playersdontqualify", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 106);
                }
                var2 = hc.a("gameopt_playersdontqualify_selectgametab", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 123);
                }
                var2 = hc.a("gameopt_unselectedoptions", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 94);
                }
                var2 = hc.a("gameopt_pleaseselectoption1", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 89);
                }
                var2 = hc.a("gameopt_pleaseselectoption2", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 89);
                }
                var2 = hc.a("gameopt_badnumplayers", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 114);
                }
                var2 = hc.a("gameopt_inviteplayers_or_trychanging1", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 122);
                }
                var2 = hc.a("gameopt_inviteplayers_or_trychanging2", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 82);
                }
                var2 = hc.a("gameopt_novalidcombos", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 84);
                }
                var2 = hc.a("gameopt_pleasetrychanging", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 112);
                }
                var2 = hc.a("ra_title", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 120);
                }
                var2 = hc.a("ra_mutethisplayer", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 87);
                }
                var2 = hc.a("ra_suggestmute", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 86);
                }
                var2 = hc.a("ra_intro", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 93);
                }
                var2 = hc.a("ra_intro_no_name", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 108);
                }
                var2 = hc.a("ra_explanation", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 117);
                }
                var2 = hc.a("rule_pillar_0", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 82);
                }
                var2 = hc.a("rule_0_0", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 87);
                }
                var2 = hc.a("rule_0_1", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 94);
                }
                var2 = hc.a("rule_0_2", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 119);
                }
                var2 = hc.a("rule_0_3", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 123);
                }
                var2 = hc.a("rule_0_4", (byte) -127);
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (null != var2) {
                  ge.a(var2, (byte) 100);
                }
                var2 = hc.a("rule_0_5", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 84);
                }
                var2 = hc.a("rule_pillar_1", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 89);
                }
                var2 = hc.a("rule_1_0", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 88);
                }
                var2 = hc.a("rule_1_1", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 103);
                }
                var2 = hc.a("rule_1_2", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 106);
                }
                var2 = hc.a("rule_1_3", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 103);
                }
                var2 = hc.a("rule_1_4", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 79);
                }
                var2 = hc.a("rule_pillar_2", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 102);
                }
                var2 = hc.a("rule_2_0", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 123);
                }
                var2 = hc.a("rule_2_1", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 105);
                }
                var2 = hc.a("rule_2_2", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 115);
                }
                var2 = hc.a("createafreeaccount", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 111);
                }
                var2 = hc.a("cancel", (byte) -127);
                if (null != var2) {
                  cj.field_m = ge.a(var2, (byte) 99);
                }
                var2 = hc.a("pleaselogintoplay", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 92);
                }
                var2 = hc.a("pleaselogin", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 123);
                }
                var2 = hc.a("pleaselogin_member", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 108);
                }
                var2 = hc.a("invaliduserorpass", (byte) -127);
                if (null != var2) {
                  jh.field_d = ge.a(var2, (byte) 88);
                }
                var2 = hc.a("pleasetryagain", (byte) -127);
                if (var2 != null) {
                  ph.field_a = ge.a(var2, (byte) 92);
                }
                var2 = hc.a("pleasereenterpass", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 108);
                }
                var2 = hc.a("playfreeversion", (byte) -127);
                if (null != var2) {
                  s.field_a = ge.a(var2, (byte) 86);
                }
                var2 = hc.a("reloadgame", (byte) -127);
                if (var2 != null) {
                  na.field_p = ge.a(var2, (byte) 90);
                }
                var2 = hc.a("toserverlist", (byte) -127);
                if (null != var2) {
                  sk.field_a = ge.a(var2, (byte) 114);
                }
                var2 = hc.a("tocustomersupport", (byte) -127);
                if (null != var2) {
                  jh.field_a = ge.a(var2, (byte) 102);
                }
                var2 = hc.a("changedisplayname", (byte) -127);
                if (null != var2) {
                  wf.field_a = ge.a(var2, (byte) 88);
                }
                var2 = hc.a("returntohomepage", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 78);
                }
                var2 = hc.a("justplay", (byte) -127);
                if (null != var2) {
                  oa.field_b = ge.a(var2, (byte) 125);
                }
                var2 = hc.a("justplay_excl", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 90);
                }
                var2 = hc.a("login", (byte) -127);
                if (var2 != null) {
                  q.field_f = ge.a(var2, (byte) 100);
                }
                var2 = hc.a("goback", (byte) -127);
                if (var2 != null) {
                  dl.field_j = ge.a(var2, (byte) 97);
                }
                var2 = hc.a("otheroptions", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 120);
                }
                var2 = hc.a("proceed", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 87);
                }
                var2 = hc.a("connectingtoserver", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 115);
                }
                var2 = hc.a("pleasewait", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 96);
                }
                var2 = hc.a("logging_in", (byte) -127);
                if (var2 != null) {
                  kj.field_q = ge.a(var2, (byte) 104);
                }
                var2 = hc.a("reconnect", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 84);
                }
                var2 = hc.a("backtoerror", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 89);
                }
                var2 = hc.a("pleasecheckinternet", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 122);
                }
                var2 = hc.a("attemptingtoreconnect", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 83);
                }
                var2 = hc.a("connectionlost_reconnecting", (byte) -127);
                if (null != var2) {
                  ni.field_e = ge.a(var2, (byte) 92);
                }
                var2 = hc.a("connectionlost_withreason", (byte) -127);
                if (var2 != null) {
                  lk.field_p = ge.a(var2, (byte) 107);
                }
                var2 = hc.a("passwordverificationrequired", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 88);
                }
                var2 = hc.a("invalidpass", (byte) -127);
                if (null != var2) {
                  rl.field_t = ge.a(var2, (byte) 125);
                }
                var2 = hc.a("retry", (byte) -127);
                if (var2 != null) {
                  tc.field_c = ge.a(var2, (byte) 95);
                }
                var2 = hc.a("back", (byte) -127);
                if (var2 != null) {
                  uc.field_r = ge.a(var2, (byte) 125);
                }
                var2 = hc.a("exitfullscreenmode", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 85);
                }
                var2 = hc.a("quittowebsite", (byte) -127);
                if (var2 != null) {
                  pg.field_f = ge.a(var2, (byte) 107);
                }
                var2 = hc.a("connectionrestored", (byte) -127);
                if (var2 != null) {
                  dg.field_E = ge.a(var2, (byte) 98);
                }
                var2 = hc.a("warning_ifyouquit", (byte) -127);
                if (null != var2) {
                  vg.field_c = ge.a(var2, (byte) 90);
                }
                var2 = hc.a("warning_ifyouquitorleavepage", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 102);
                }
                var2 = hc.a("resubscribe_withoutlosing_fs", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 123);
                }
                var2 = hc.a("resubscribe_withoutlosing", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 106);
                }
                var2 = hc.a("customersupport_withoutlosing_fs", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 110);
                }
                var2 = hc.a("customersupport_withoutlosing", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 118);
                }
                var2 = hc.a("js5help_withoutlosing_fs", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 124);
                }
                var2 = hc.a("js5help_withoutlosing", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 121);
                }
                var2 = hc.a("checkinternet_withoutlosing_fs", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 88);
                }
                var2 = hc.a("checkinternet_withoutlosing", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 84);
                }
                var2 = hc.a("create_intro", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 95);
                }
                var2 = hc.a("create_sameaccounttip_unnamed", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 101);
                }
                var2 = hc.a("dateofbirthprompt", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 111);
                }
                var2 = hc.a("fetchingcountrylist", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 107);
                }
                var2 = hc.a("countryprompt", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 104);
                }
                var2 = hc.a("countrylisterror", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 91);
                }
                var2 = hc.a("theonlypersonalquestions", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 103);
                }
                var2 = hc.a("create_submittingdata", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 80);
                }
                var2 = hc.a("check", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 101);
                }
                var2 = hc.a("create_pleasechooseausername", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 95);
                }
                var2 = hc.a("create_usernameblurb", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 105);
                }
                var2 = hc.a("checkingavailability", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 88);
                }
                var2 = hc.a("checking", (byte) -127);
                if (null != var2) {
                  n.field_C = ge.a(var2, (byte) 114);
                }
                var2 = hc.a("create_namealreadytaken", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 119);
                }
                var2 = hc.a("create_sameaccounttip_named", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 125);
                }
                var2 = hc.a("create_nosuggestions", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 98);
                }
                var2 = hc.a("create_alternativelygoback", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 115);
                }
                var2 = hc.a("create_available", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 91);
                }
                var2 = hc.a("create_willnowshowtermsandconditions", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 82);
                }
                var2 = hc.a("fetchingterms", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 89);
                }
                var2 = hc.a("termserror", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 127);
                }
                var2 = hc.a("create_iagree", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 119);
                }
                var2 = hc.a("create_idisagree", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 107);
                }
                var2 = hc.a("create_pleasescrolldowntoaccept", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 120);
                }
                var2 = hc.a("create_linkaddress", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 83);
                }
                var2 = hc.a("openinpopupwindow", (byte) -127);
                if (var2 != null) {
                  ni.field_b = ge.a(var2, (byte) 83);
                }
                var2 = hc.a("create", (byte) -127);
                if (null != var2) {
                  qk.field_h = ge.a(var2, (byte) 96);
                }
                var2 = hc.a("create_pleasechooseapassword", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 112);
                }
                var2 = hc.a("create_passwordblurb", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 103);
                }
                var2 = hc.a("create_nevergivepassword", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 109);
                }
                var2 = hc.a("creatingyouraccount", (byte) -127);
                if (var2 != null) {
                  jc.field_R = ge.a(var2, (byte) 100);
                }
                var2 = hc.a("create_youmustaccept", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 119);
                }
                var2 = hc.a("create_passwordsdifferent", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 101);
                }
                var2 = hc.a("create_success", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 122);
                }
                var2 = hc.a("day", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 88);
                }
                var2 = hc.a("month", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 85);
                }
                var2 = hc.a("year", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 101);
                }
                var2 = hc.a("monthnames,0", (byte) -127);
                if (var2 != null) {
                  se.field_O[0] = ge.a(var2, (byte) 96);
                }
                var2 = hc.a("monthnames,1", (byte) -127);
                if (var2 != null) {
                  se.field_O[1] = ge.a(var2, (byte) 81);
                }
                var2 = hc.a("monthnames,2", (byte) -127);
                if (var2 != null) {
                  se.field_O[2] = ge.a(var2, (byte) 89);
                }
                var2 = hc.a("monthnames,3", (byte) -127);
                if (null != var2) {
                  se.field_O[3] = ge.a(var2, (byte) 86);
                }
                var2 = hc.a("monthnames,4", (byte) -127);
                if (null != var2) {
                  se.field_O[4] = ge.a(var2, (byte) 120);
                }
                var2 = hc.a("monthnames,5", (byte) -127);
                if (var2 != null) {
                  se.field_O[5] = ge.a(var2, (byte) 90);
                }
                var2 = hc.a("monthnames,6", (byte) -127);
                if (var2 != null) {
                  se.field_O[6] = ge.a(var2, (byte) 86);
                }
                var2 = hc.a("monthnames,7", (byte) -127);
                if (var2 != null) {
                  se.field_O[7] = ge.a(var2, (byte) 110);
                }
                var2 = hc.a("monthnames,8", (byte) -127);
                if (null != var2) {
                  se.field_O[8] = ge.a(var2, (byte) 92);
                }
                var2 = hc.a("monthnames,9", (byte) -127);
                if (null != var2) {
                  se.field_O[9] = ge.a(var2, (byte) 122);
                }
                var2 = hc.a("monthnames,10", (byte) -127);
                if (null != var2) {
                  se.field_O[10] = ge.a(var2, (byte) 91);
                }
                var2 = hc.a("monthnames,11", (byte) -127);
                if (null != var2) {
                  se.field_O[11] = ge.a(var2, (byte) 109);
                }
                var2 = hc.a("create_welcome", (byte) -127);
                if (null != var2) {
                  gk.field_e = ge.a(var2, (byte) 105);
                }
                var2 = hc.a("create_u13_welcome", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 78);
                }
                var2 = hc.a("create_createanaccount", (byte) -127);
                if (var2 != null) {
                  mg.field_K = ge.a(var2, (byte) 99);
                }
                var2 = hc.a("create_username", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 82);
                }
                var2 = hc.a("create_displayname", (byte) -127);
                if (null != var2) {
                  mj.field_a = ge.a(var2, (byte) 121);
                }
                var2 = hc.a("create_password", (byte) -127);
                if (null != var2) {
                  fl.field_b = ge.a(var2, (byte) 80);
                }
                var2 = hc.a("create_password_confirm", (byte) -127);
                if (null != var2) {
                  hk.field_c = ge.a(var2, (byte) 82);
                }
                var2 = hc.a("create_email", (byte) -127);
                if (var2 != null) {
                  cf.field_a = ge.a(var2, (byte) 127);
                }
                var2 = hc.a("create_email_confirm", (byte) -127);
                if (null != var2) {
                  mb.field_b = ge.a(var2, (byte) 88);
                }
                var2 = hc.a("create_age", (byte) -127);
                if (var2 != null) {
                  th.field_b = ge.a(var2, (byte) 105);
                }
                var2 = hc.a("create_u13_email", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 90);
                }
                var2 = hc.a("create_u13_email_confirm", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 127);
                }
                var2 = hc.a("create_dob", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 98);
                }
                var2 = hc.a("create_country", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 107);
                }
                var2 = hc.a("create_alternatives_header", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 91);
                }
                var2 = hc.a("create_alternatives_select", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 98);
                }
                var2 = hc.a("create_suggestions", (byte) -127);
                if (null != var2) {
                  cb.field_h = ge.a(var2, (byte) 95);
                }
                var2 = hc.a("create_more_suggestions", (byte) -127);
                if (null != var2) {
                  sh.field_f = ge.a(var2, (byte) 119);
                }
                var2 = hc.a("create_select_alternative", (byte) -127);
                if (null != var2) {
                  lb.field_e = ge.a(var2, (byte) 114);
                }
                var2 = hc.a("create_optin_news", (byte) -127);
                if (var2 != null) {
                  Main.field_M = ge.a(var2, (byte) 86);
                }
                var2 = hc.a("create_agreeterms", (byte) -127);
                if (null != var2) {
                  lk.field_t = ge.a(var2, (byte) 81);
                }
                var2 = hc.a("create_u13terms", (byte) -127);
                if (null != var2) {
                  dd.field_h = ge.a(var2, (byte) 118);
                }
                var2 = hc.a("login_username_email", (byte) -127);
                if (var2 != null) {
                  ck.field_F = ge.a(var2, (byte) 103);
                }
                var2 = hc.a("login_username", (byte) -127);
                if (null != var2) {
                  ab.field_q = ge.a(var2, (byte) 100);
                }
                var2 = hc.a("login_email", (byte) -127);
                if (null != var2) {
                  ja.field_d = ge.a(var2, (byte) 110);
                }
                var2 = hc.a("login_username_tooltip", (byte) -127);
                if (null != var2) {
                  sl.field_c = ge.a(var2, (byte) 83);
                }
                var2 = hc.a("login_password_tooltip", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 99);
                }
                var2 = hc.a("login_login_tooltip", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 80);
                }
                var2 = hc.a("login_create_tooltip", (byte) -127);
                if (var2 != null) {
                  bl.field_b = ge.a(var2, (byte) 81);
                }
                var2 = hc.a("login_justplay_tooltip", (byte) -127);
                if (null != var2) {
                  w.field_m = ge.a(var2, (byte) 115);
                }
                var2 = hc.a("login_back_tooltip", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 112);
                }
                var2 = hc.a("login_no_displayname", (byte) -127);
                if (var2 != null) {
                  ui.field_F = ge.a(var2, (byte) 94);
                }
                var2 = hc.a("create_username_tooltip", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 95);
                }
                var2 = hc.a("create_username_hint", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 115);
                }
                var2 = hc.a("create_displayname_tooltip", (byte) -127);
                if (var2 != null) {
                  re.field_h = ge.a(var2, (byte) 104);
                }
                var2 = hc.a("create_displayname_hint", (byte) -127);
                if (var2 != null) {
                  pk.field_c = ge.a(var2, (byte) 123);
                }
                var2 = hc.a("create_password_tooltip", (byte) -127);
                if (null != var2) {
                  db.field_f = ge.a(var2, (byte) 127);
                }
                var2 = hc.a("create_password_hint", (byte) -127);
                if (var2 != null) {
                  mc.field_a = ge.a(var2, (byte) 97);
                }
                var2 = hc.a("create_password_confirm_tooltip", (byte) -127);
                if (null != var2) {
                  ja.field_c = ge.a(var2, (byte) 80);
                }
                var2 = hc.a("create_email_tooltip", (byte) -127);
                if (null != var2) {
                  pf.field_g = ge.a(var2, (byte) 83);
                }
                var2 = hc.a("create_email_confirm_tooltip", (byte) -127);
                if (var2 != null) {
                  te.field_b = ge.a(var2, (byte) 123);
                }
                var2 = hc.a("create_age_tooltip", (byte) -127);
                if (var2 != null) {
                  cc.field_b = ge.a(var2, (byte) 119);
                }
                var2 = hc.a("create_optin_news_tooltip", (byte) -127);
                if (var2 != null) {
                  nc.field_c = ge.a(var2, (byte) 105);
                }
                var2 = hc.a("create_u13_email_tooltip", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 88);
                }
                var2 = hc.a("create_u13_email_confirm_tooltip", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 97);
                }
                var2 = hc.a("create_dob_tooltip", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 123);
                }
                var2 = hc.a("create_country_tooltip", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 112);
                }
                var2 = hc.a("create_optin_tooltip", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 118);
                }
                var2 = hc.a("create_continue", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 108);
                }
                var2 = hc.a("create_username_unavailable", (byte) -127);
                if (null != var2) {
                  ui.field_K = ge.a(var2, (byte) 87);
                }
                var2 = hc.a("create_username_available", (byte) -127);
                if (null != var2) {
                  vd.field_k = ge.a(var2, (byte) 118);
                }
                var2 = hc.a("create_alert_namelength", (byte) -127);
                if (var2 != null) {
                  ke.field_b = ge.a(var2, (byte) 87);
                }
                var2 = hc.a("create_alert_namechars", (byte) -127);
                if (null != var2) {
                  nf.field_a = ge.a(var2, (byte) 86);
                }
                var2 = hc.a("create_alert_nameleadingspace", (byte) -127);
                if (var2 != null) {
                  kl.field_P = ge.a(var2, (byte) 81);
                }
                var2 = hc.a("create_alert_doublespace", (byte) -127);
                if (null != var2) {
                  g.field_B = ge.a(var2, (byte) 121);
                }
                var2 = hc.a("create_alert_passchars", (byte) -127);
                if (null != var2) {
                  hl.field_C = ge.a(var2, (byte) 79);
                }
                var2 = hc.a("create_alert_passrepeated", (byte) -127);
                if (null != var2) {
                  ta.field_fb = ge.a(var2, (byte) 95);
                }
                var2 = hc.a("create_alert_passlength", (byte) -127);
                if (var2 != null) {
                  s.field_b = ge.a(var2, (byte) 110);
                }
                var2 = hc.a("create_alert_passcontainsname", (byte) -127);
                if (null != var2) {
                  qi.field_F = ge.a(var2, (byte) 92);
                }
                var2 = hc.a("create_alert_passcontainsemail", (byte) -127);
                if (null != var2) {
                  bj.field_u = ge.a(var2, (byte) 125);
                }
                var2 = hc.a("create_alert_passcontainsname_partial", (byte) -127);
                if (var2 != null) {
                  i.field_b = ge.a(var2, (byte) 101);
                }
                var2 = hc.a("create_alert_checkname", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 81);
                }
                var2 = hc.a("create_alert_invalidemail", (byte) -127);
                if (var2 != null) {
                  ha.field_c = ge.a(var2, (byte) 88);
                }
                var2 = hc.a("create_alert_email_unavailable", (byte) -127);
                if (var2 != null) {
                  bk.field_b = ge.a(var2, (byte) 118);
                }
                var2 = hc.a("create_alert_invaliddate", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 87);
                }
                var2 = hc.a("create_alert_invalidage", (byte) -127);
                if (var2 != null) {
                  d.field_j = ge.a(var2, (byte) 90);
                }
                var2 = hc.a("create_alert_yearrange", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 93);
                }
                var2 = hc.a("create_alert_mismatch", (byte) -127);
                if (null != var2) {
                  r.field_r = ge.a(var2, (byte) 96);
                }
                var2 = hc.a("create_passwordvalid", (byte) -127);
                if (null != var2) {
                  ll.field_g = ge.a(var2, (byte) 101);
                }
                var2 = hc.a("create_emailvalid", (byte) -127);
                if (var2 != null) {
                  gi.field_g = ge.a(var2, (byte) 101);
                }
                var2 = hc.a("create_account_success", (byte) -127);
                if (null != var2) {
                  bk.field_e = ge.a(var2, (byte) 125);
                }
                var2 = hc.a("invalid_name", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 102);
                }
                var2 = hc.a("cannot_add_yourself", (byte) -127);
                var3 = 22 / ((-14 - param0) / 59);
                if (null != var2) {
                  ge.a(var2, (byte) 96);
                }
                var2 = hc.a("unable_to_add_friend", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 104);
                }
                var2 = hc.a("unable_to_add_ignore", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 107);
                }
                var2 = hc.a("unable_to_delete_friend", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 111);
                }
                var2 = hc.a("unable_to_delete_ignore", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 78);
                }
                var2 = hc.a("friendlistfull", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 95);
                }
                var2 = hc.a("friendlistdupe", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 91);
                }
                var2 = hc.a("friendnotfound", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 101);
                }
                var2 = hc.a("ignorelistfull", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 99);
                }
                var2 = hc.a("ignorelistdupe", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 79);
                }
                var2 = hc.a("ignorenotfound", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 112);
                }
                var2 = hc.a("removeignorefirst", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 98);
                }
                var2 = hc.a("removefriendfirst", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 123);
                }
                var2 = hc.a("enterfriend_add", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 97);
                }
                var2 = hc.a("enterfriend_del", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 101);
                }
                var2 = hc.a("enterignore_add", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 80);
                }
                var2 = hc.a("enterignore_del", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 89);
                }
                var2 = hc.a("text_removed_from_game", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 112);
                }
                var2 = hc.a("text_lobby_pleaselogin_free", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 94);
                }
                var2 = hc.a("opengl", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 95);
                }
                var2 = hc.a("sse", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 96);
                }
                var2 = hc.a("purejava", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 83);
                }
                var2 = hc.a("waitingfor_graphics", (byte) -127);
                if (var2 != null) {
                  kf.field_j = ge.a(var2, (byte) 124);
                }
                var2 = hc.a("waitingfor_models", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 86);
                }
                var2 = hc.a("waitingfor_fonts", (byte) -127);
                if (var2 != null) {
                  ak.field_L = ge.a(var2, (byte) 99);
                }
                var2 = hc.a("waitingfor_soundeffects", (byte) -127);
                if (null != var2) {
                  eg.field_e = ge.a(var2, (byte) 125);
                }
                var2 = hc.a("waitingfor_music", (byte) -127);
                if (null != var2) {
                  ah.field_a = ge.a(var2, (byte) 98);
                }
                var2 = hc.a("waitingfor_instruments", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 109);
                }
                var2 = hc.a("waitingfor_levels", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 105);
                }
                var2 = hc.a("waitingfor_extradata", (byte) -127);
                if (var2 != null) {
                  tb.field_e = ge.a(var2, (byte) 92);
                }
                var2 = hc.a("waitingfor_languages", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 78);
                }
                var2 = hc.a("waitingfor_textures", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 122);
                }
                var2 = hc.a("waitingfor_animations", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 97);
                }
                var2 = hc.a("loading_graphics", (byte) -127);
                if (var2 != null) {
                  bk.field_f = ge.a(var2, (byte) 121);
                }
                var2 = hc.a("loading_models", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 126);
                }
                var2 = hc.a("loading_fonts", (byte) -127);
                if (var2 != null) {
                  nc.field_b = ge.a(var2, (byte) 117);
                }
                var2 = hc.a("loading_soundeffects", (byte) -127);
                if (var2 != null) {
                  wd.field_a = ge.a(var2, (byte) 103);
                }
                var2 = hc.a("loading_music", (byte) -127);
                if (null != var2) {
                  dh.field_o = ge.a(var2, (byte) 99);
                }
                var2 = hc.a("loading_instruments", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 81);
                }
                var2 = hc.a("loading_levels", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 106);
                }
                var2 = hc.a("loading_extradata", (byte) -127);
                if (var2 != null) {
                  rj.field_w = ge.a(var2, (byte) 93);
                }
            }
            void runChunk2() throws java.lang.RuntimeException {
                var2 = hc.a("loading_languages", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 97);
                }
                var2 = hc.a("loading_textures", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 88);
                }
                var2 = hc.a("loading_animations", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 109);
                }
                var2 = hc.a("unpacking_graphics", (byte) -127);
                if (var2 != null) {
                  lb.field_f = ge.a(var2, (byte) 104);
                }
                var2 = hc.a("unpacking_models", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 100);
                }
                var2 = hc.a("unpacking_soundeffects", (byte) -127);
                if (var2 != null) {
                  sc.field_c = ge.a(var2, (byte) 104);
                }
                var2 = hc.a("unpacking_music", (byte) -127);
                if (null != var2) {
                  j.field_A = ge.a(var2, (byte) 83);
                }
                var2 = hc.a("unpacking_levels", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 120);
                }
                var2 = hc.a("unpacking_languages", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 103);
                }
                var2 = hc.a("unpacking_animations", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 87);
                }
                var2 = hc.a("unpacking_toolkit", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 83);
                }
                var2 = hc.a("instructions", (byte) -127);
                if (null != var2) {
                  hc.field_e = ge.a(var2, (byte) 113);
                }
                var2 = hc.a("tutorial", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 82);
                }
                var2 = hc.a("playtutorial", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 99);
                }
                var2 = hc.a("sound_colon", (byte) -127);
                if (null != var2) {
                  td.field_a = ge.a(var2, (byte) 124);
                }
                var2 = hc.a("music_colon", (byte) -127);
                if (null != var2) {
                  lf.field_d = ge.a(var2, (byte) 90);
                }
                var2 = hc.a("fullscreen", (byte) -127);
                if (var2 != null) {
                  pg.field_b = ge.a(var2, (byte) 93);
                }
                var2 = hc.a("screensize", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 83);
                }
                var2 = hc.a("highscores", (byte) -127);
                if (var2 != null) {
                  n.field_D = ge.a(var2, (byte) 94);
                }
                var2 = hc.a("rankings", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 97);
                }
                var2 = hc.a("achievements", (byte) -127);
                if (null != var2) {
                  hc.field_a = ge.a(var2, (byte) 92);
                }
                var2 = hc.a("achievementsthisgame", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 112);
                }
                var2 = hc.a("achievementsthissession", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 116);
                }
                var2 = hc.a("watchintroduction", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 105);
                }
                var2 = hc.a("quit", (byte) -127);
                if (null != var2) {
                  ii.field_f = ge.a(var2, (byte) 105);
                }
                var2 = hc.a("login_createaccount", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 116);
                }
                var2 = hc.a("tohighscores", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 112);
                }
                var2 = hc.a("returntomainmenu", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 115);
                }
                var2 = hc.a("returntopausemenu", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 100);
                }
                var2 = hc.a("returntooptionsmenu_notpaused", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 95);
                }
                var2 = hc.a("mainmenu", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 107);
                }
                var2 = hc.a("pausemenu", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 81);
                }
                var2 = hc.a("optionsmenu_notpaused", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 78);
                }
                var2 = hc.a("menu", (byte) -127);
                if (null != var2) {
                  db.field_b = ge.a(var2, (byte) 121);
                }
                var2 = hc.a("selectlevel", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 102);
                }
                var2 = hc.a("nextlevel", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 91);
                }
                var2 = hc.a("startgame", (byte) -127);
                if (var2 != null) {
                  tj.field_J = ge.a(var2, (byte) 115);
                }
                var2 = hc.a("newgame", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 121);
                }
                var2 = hc.a("resumegame", (byte) -127);
                if (null != var2) {
                  id.field_f = ge.a(var2, (byte) 103);
                }
                var2 = hc.a("resumetutorial", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 96);
                }
                var2 = hc.a("skip", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 93);
                }
                var2 = hc.a("skiptutorial", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 93);
                }
                var2 = hc.a("skipending", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 97);
                }
                var2 = hc.a("restartlevel", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 94);
                }
                var2 = hc.a("endtest", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 103);
                }
                var2 = hc.a("endgame", (byte) -127);
                if (null != var2) {
                  tf.field_m = ge.a(var2, (byte) 89);
                }
                var2 = hc.a("endtutorial", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 101);
                }
                var2 = hc.a("ok", (byte) -127);
                if (var2 != null) {
                  bl.field_g = ge.a(var2, (byte) 101);
                }
                var2 = hc.a("on", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 111);
                }
                var2 = hc.a("off", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 115);
                }
                var2 = hc.a("previous", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 101);
                }
                var2 = hc.a("prev", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 119);
                }
                var2 = hc.a("next", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 100);
                }
                var2 = hc.a("graphics_colon", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 85);
                }
                var2 = hc.a("hotseatmultiplayer", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 94);
                }
                var2 = hc.a("entermultiplayerlobby", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 104);
                }
                var2 = hc.a("singleplayergame", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 104);
                }
                var2 = hc.a("returntogame", (byte) -127);
                if (var2 != null) {
                  sh.field_h = ge.a(var2, (byte) 82);
                }
                var2 = hc.a("endgameresign", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 107);
                }
                var2 = hc.a("offerdraw", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 98);
                }
                var2 = hc.a("canceldraw", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 112);
                }
                var2 = hc.a("acceptdraw", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 90);
                }
                var2 = hc.a("resign", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 86);
                }
                var2 = hc.a("returntolobby", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 93);
                }
                var2 = hc.a("cont", (byte) -127);
                if (null != var2) {
                  bj.field_b = ge.a(var2, (byte) 106);
                }
                var2 = hc.a("continue_spectating", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 120);
                }
                var2 = hc.a("messages", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 115);
                }
                var2 = hc.a("graphics_fastest", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 82);
                }
                var2 = hc.a("graphics_medium", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 118);
                }
                var2 = hc.a("graphics_best", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 120);
                }
                var2 = hc.a("graphics_directx", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 94);
                }
                var2 = hc.a("graphics_opengl", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 89);
                }
                var2 = hc.a("graphics_java", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 99);
                }
                var2 = hc.a("graphics_quality_high", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 85);
                }
                var2 = hc.a("graphics_quality_low", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 109);
                }
                var2 = hc.a("graphics_mode", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 127);
                }
                var2 = hc.a("graphics_quality", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 115);
                }
                var2 = hc.a("mode", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 86);
                }
                var2 = hc.a("quality", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 115);
                }
                var2 = hc.a("keys", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 92);
                }
                var2 = hc.a("objective", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 116);
                }
                var2 = hc.a("currentobjective", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 85);
                }
                var2 = hc.a("pressescforpausemenu", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 87);
                }
                var2 = hc.a("pressescforpausemenuortoskiptutorial", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 93);
                }
                var2 = hc.a("pressescforoptionsmenu_doesntpause", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 119);
                }
                var2 = hc.a("pressescforoptionsmenu_doesntpause_short", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 109);
                }
                var2 = hc.a("powerups", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 104);
                }
                var2 = hc.a("latestlevel_suffix", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 102);
                }
                var2 = hc.a("unreachedlevel_name", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 80);
                }
                var2 = hc.a("unreachedlevel_cannotplayreason", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 83);
                }
                var2 = hc.a("unreachedlevel_cannotplayreason_shorter", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 104);
                }
                var2 = hc.a("unreachedworld_cannotplayreason", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 118);
                }
                var2 = hc.a("memberslevel_name", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 100);
                }
                var2 = hc.a("memberslevel_cannotplayreason", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 94);
                }
                var2 = hc.a("membersworld_cannotplayreason", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 89);
                }
                var2 = hc.a("unreachedlevel_createtip", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 99);
                }
                var2 = hc.a("unreachedlevel_createtip_line1", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 122);
                }
                var2 = hc.a("unreachedlevel_createtip_line2", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 83);
                }
                var2 = hc.a("unreachedlevel_logintip", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 123);
                }
                var2 = hc.a("memberslevel_logintip", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 87);
                }
                var2 = hc.a("displayname_none", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 124);
                }
                var2 = hc.a("levelxofy1", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 82);
                }
                var2 = hc.a("levelxofy2", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 108);
                }
                var2 = hc.a("levelxofy", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 91);
                }
                var2 = hc.a("ingame_level", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 105);
                }
                var2 = hc.a("mouseoveranicon", (byte) -127);
                if (var2 != null) {
                  id.field_d = ge.a(var2, (byte) 78);
                }
                var2 = hc.a("notyetachieved", (byte) -127);
                if (var2 != null) {
                  vd.field_n = ge.a(var2, (byte) 83);
                }
                var2 = hc.a("achieved", (byte) -127);
                if (null != var2) {
                  pk.field_b = ge.a(var2, (byte) 95);
                }
                var2 = hc.a("orbpoints", (byte) -127);
                if (null != var2) {
                  eg.field_a = ge.a(var2, (byte) 112);
                }
                var2 = hc.a("orbcoins", (byte) -127);
                if (var2 != null) {
                  nl.field_a = ge.a(var2, (byte) 91);
                }
                var2 = hc.a("orbpoints_colon", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 122);
                }
                var2 = hc.a("orbcoins_colon", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 111);
                }
                var2 = hc.a("achieved_colon_description", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 99);
                }
                var2 = hc.a("secretachievement", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 124);
                }
                var2 = hc.a("no_highscores", (byte) -127);
                if (null != var2) {
                  j.field_F = ge.a(var2, (byte) 100);
                }
                var2 = hc.a("hs_name", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 97);
                }
                var2 = hc.a("hs_level", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 83);
                }
                var2 = hc.a("hs_fromlevel", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 105);
                }
                var2 = hc.a("hs_tolevel", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 122);
                }
                var2 = hc.a("hs_score", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 110);
                }
                var2 = hc.a("hs_end", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 88);
                }
                var2 = hc.a("ingame_score", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 119);
                }
                var2 = hc.a("score_colon", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 81);
                }
                var2 = hc.a("mp_leavegame", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 108);
                }
                var2 = hc.a("mp_offerrematch", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 89);
                }
                var2 = hc.a("mp_offerrematch_unrated", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 115);
                }
                var2 = hc.a("mp_acceptrematch", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 86);
                }
                var2 = hc.a("mp_acceptrematch_unrated", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 119);
                }
                var2 = hc.a("mp_cancelrematch", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 98);
                }
                var2 = hc.a("mp_cancelrematch_unrated", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 83);
                }
                var2 = hc.a("mp_rematchnewgame", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 124);
                }
                var2 = hc.a("mp_rematchnewgame_unrated", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 100);
                }
                var2 = hc.a("mp_x_wantstodraw", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 125);
                }
                var2 = hc.a("mp_x_offersrematch", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 78);
                }
                var2 = hc.a("mp_x_offersrematch_unrated", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 87);
                }
                var2 = hc.a("mp_youofferrematch", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 119);
                }
                var2 = hc.a("mp_youofferrematch_unrated", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 107);
                }
                var2 = hc.a("mp_youofferdraw", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 89);
                }
                var2 = hc.a("mp_youresigned", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 85);
                }
                var2 = hc.a("mp_youresigned_rematch", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 100);
                }
                var2 = hc.a("mp_x_hasresignedandleft", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 119);
                }
                var2 = hc.a("mp_x_hasresigned_rematch", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 99);
                }
                var2 = hc.a("mp_x_hasresigned", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 104);
                }
                var2 = hc.a("mp_x_hasleft", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 103);
                }
                var2 = hc.a("mp_x_haswon", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 96);
                }
                var2 = hc.a("mp_youhavewon", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 100);
                }
                var2 = hc.a("mp_gamedrawn", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 99);
                }
                var2 = hc.a("mp_timeremaining", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 108);
                }
                var2 = hc.a("mp_x_turn", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 91);
                }
                var2 = hc.a("mp_yourturn", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 88);
                }
                var2 = hc.a("gameover", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 106);
                }
                var2 = hc.a("mp_hidechat", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 100);
                }
                var2 = hc.a("mp_showchat_nounread", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 92);
                }
                var2 = hc.a("mp_showchat_unread1", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 106);
                }
                var2 = hc.a("mp_showchat_unread2", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 84);
                }
                var2 = hc.a("click_to_quickchat", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 84);
                }
                var2 = hc.a("autorespond", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 100);
                }
                var2 = hc.a("quickchat_help", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 92);
                }
                var2 = hc.a("quickchat_help_title", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 107);
                }
                var2 = hc.a("quickchat_shortcut_help,0", (byte) -127);
                if (var2 != null) {
                  jc.field_L[0] = ge.a(var2, (byte) 90);
                }
                var2 = hc.a("quickchat_shortcut_help,1", (byte) -127);
                if (null != var2) {
                  jc.field_L[1] = ge.a(var2, (byte) 93);
                }
                var2 = hc.a("quickchat_shortcut_help,2", (byte) -127);
                if (null != var2) {
                  jc.field_L[2] = ge.a(var2, (byte) 94);
                }
                var2 = hc.a("quickchat_shortcut_help,3", (byte) -127);
                if (var2 != null) {
                  jc.field_L[3] = ge.a(var2, (byte) 115);
                }
                var2 = hc.a("quickchat_shortcut_help,4", (byte) -127);
                if (null != var2) {
                  jc.field_L[4] = ge.a(var2, (byte) 85);
                }
                var2 = hc.a("quickchat_shortcut_help,5", (byte) -127);
                if (null != var2) {
                  jc.field_L[5] = ge.a(var2, (byte) 80);
                }
                var2 = hc.a("quickchat_shortcut_keys,0", (byte) -127);
                if (null != var2) {
                  nk.field_f[0] = ge.a(var2, (byte) 104);
                }
                var2 = hc.a("quickchat_shortcut_keys,1", (byte) -127);
                if (var2 != null) {
                  nk.field_f[1] = ge.a(var2, (byte) 118);
                }
                var2 = hc.a("quickchat_shortcut_keys,2", (byte) -127);
                if (var2 != null) {
                  nk.field_f[2] = ge.a(var2, (byte) 116);
                }
                var2 = hc.a("quickchat_shortcut_keys,3", (byte) -127);
                if (var2 != null) {
                  nk.field_f[3] = ge.a(var2, (byte) 79);
                }
                var2 = hc.a("quickchat_shortcut_keys,4", (byte) -127);
                if (var2 != null) {
                  nk.field_f[4] = ge.a(var2, (byte) 102);
                }
                var2 = hc.a("quickchat_shortcut_keys,5", (byte) -127);
                if (var2 != null) {
                  nk.field_f[5] = ge.a(var2, (byte) 111);
                }
                var2 = hc.a("keychar_the_character_under_questionmark", (byte) -127);
                if (var2 != null) {
                  cc.a(var2[0], 63);
                }
                var2 = hc.a("rating_noratings", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 80);
                }
                var2 = hc.a("rating_rating", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 105);
                }
                var2 = hc.a("rating_played", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 84);
                }
                var2 = hc.a("rating_won", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 116);
                }
                var2 = hc.a("rating_lost", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 116);
                }
                var2 = hc.a("rating_drawn", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 114);
                }
                var2 = hc.a("benefits_fullscreen", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 127);
                }
                var2 = hc.a("benefits_noadverts", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 119);
                }
                var2 = hc.a("benefits_price", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 115);
                }
                var2 = hc.a("members_expansion_benefits,0", (byte) -127);
                if (var2 != null) {
                  n.field_B[0] = ge.a(var2, (byte) 93);
                }
                var2 = hc.a("members_expansion_benefits,1", (byte) -127);
                if (var2 != null) {
                  n.field_B[1] = ge.a(var2, (byte) 109);
                }
                var2 = hc.a("members_expansion_benefits,2", (byte) -127);
                if (var2 != null) {
                  n.field_B[2] = ge.a(var2, (byte) 121);
                }
                var2 = hc.a("members_expansion_price_top", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 93);
                }
                var2 = hc.a("members_expansion_price_bottom", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 109);
                }
                var2 = hc.a("reconnect_lost_seq,0", (byte) -127);
                if (null != var2) {
                  me.field_d[0] = ge.a(var2, (byte) 116);
                }
                var2 = hc.a("reconnect_lost_seq,1", (byte) -127);
                if (null != var2) {
                  me.field_d[1] = ge.a(var2, (byte) 118);
                }
                var2 = hc.a("reconnect_lost_seq,2", (byte) -127);
                if (null != var2) {
                  me.field_d[2] = ge.a(var2, (byte) 78);
                }
                var2 = hc.a("reconnect_lost_seq,3", (byte) -127);
                if (null != var2) {
                  me.field_d[3] = ge.a(var2, (byte) 96);
                }
                var2 = hc.a("reconnect_lost", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 124);
                }
                var2 = hc.a("reconnect_restored", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 114);
                }
                var2 = hc.a("reconnect_please_check", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 116);
                }
                var2 = hc.a("reconnect_wait", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 78);
                }
                var2 = hc.a("reconnect_retry", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 83);
                }
                var2 = hc.a("reconnect_resume", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 109);
                }
                var2 = hc.a("reconnect_or", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 82);
                }
                var2 = hc.a("reconnect_exitfs", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 118);
                }
                var2 = hc.a("reconnect_exitfs_quit", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 122);
                }
                var2 = hc.a("reconnect_quit", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 119);
                }
                var2 = hc.a("reconnect_check_fs", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 112);
                }
                var2 = hc.a("reconnect_check_nonfs", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 104);
                }
                var2 = hc.a("fs_accept_beforeaccept", (byte) -127);
                if (var2 != null) {
                  oa.field_c = ge.a(var2, (byte) 98);
                }
                var2 = hc.a("fs_button_accept", (byte) -127);
                if (var2 != null) {
                  qd.field_b = ge.a(var2, (byte) 111);
                }
                var2 = hc.a("fs_accept_afteraccept", (byte) -127);
                if (null != var2) {
                  ai.field_l = ge.a(var2, (byte) 84);
                }
                var2 = hc.a("fs_button_cancel", (byte) -127);
                if (var2 != null) {
                  gf.field_a = ge.a(var2, (byte) 85);
                }
                var2 = hc.a("fs_accept_aftercancel", (byte) -127);
                if (var2 != null) {
                  ll.field_b = ge.a(var2, (byte) 89);
                }
                var2 = hc.a("fs_accept_countdown_sing", (byte) -127);
                if (null != var2) {
                  rf.field_g = ge.a(var2, (byte) 116);
                }
                var2 = hc.a("fs_accept_countdown_pl", (byte) -127);
                if (null != var2) {
                  bf.field_b = ge.a(var2, (byte) 88);
                }
                var2 = hc.a("fs_nonmember", (byte) -127);
                if (var2 != null) {
                  tk.field_l = ge.a(var2, (byte) 117);
                }
                var2 = hc.a("fs_button_close", (byte) -127);
                if (var2 != null) {
                  gh.field_i = ge.a(var2, (byte) 93);
                }
                var2 = hc.a("fs_button_members", (byte) -127);
                if (null != var2) {
                  ck.field_I = ge.a(var2, (byte) 120);
                }
                var2 = hc.a("fs_unavailable", (byte) -127);
                if (null != var2) {
                  oj.field_b = ge.a(var2, (byte) 104);
                }
                var2 = hc.a("fs_unavailable_try_signed_applet", (byte) -127);
                if (var2 != null) {
                  ll.field_a = ge.a(var2, (byte) 104);
                }
                var2 = hc.a("fs_focus", (byte) -127);
                if (null != var2) {
                  fe.field_d = ge.a(var2, (byte) 88);
                }
                var2 = hc.a("fs_focus_or_resolution", (byte) -127);
                if (var2 != null) {
                  fj.field_f = ge.a(var2, (byte) 89);
                }
                var2 = hc.a("fs_timeout", (byte) -127);
                if (var2 != null) {
                  ij.field_b = ge.a(var2, (byte) 81);
                }
                var2 = hc.a("fs_button_tryagain", (byte) -127);
                if (null != var2) {
                  fh.field_D = ge.a(var2, (byte) 124);
                }
                var2 = hc.a("graphics_ui_fs_countdown", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 97);
                }
                var2 = hc.a("mb_caption_title", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 91);
                }
                var2 = hc.a("mb_including_gamename", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 125);
                }
                var2 = hc.a("mb_full_access_1", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 103);
                }
                var2 = hc.a("mb_full_access_2", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 95);
                }
                var2 = hc.a("mb_achievement_count_1", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 106);
                }
                var2 = hc.a("mb_achievement_count_2", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 117);
                }
                var2 = hc.a("mb_exclusive_1", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 93);
                }
                var2 = hc.a("mb_exclusive_2", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 105);
                }
                var2 = hc.a("me_extra_benefits", (byte) -127);
            }
            void runChunk3() throws java.lang.RuntimeException {
                if (null != var2) {
                  ge.a(var2, (byte) 122);
                }
                var2 = hc.a("hs_friend_tip", (byte) -127);
                if (var2 != null) {
                  ij.field_d = ge.a(var2, (byte) 126);
                }
                var2 = hc.a("hs_friend_tip_multi", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 97);
                }
                var2 = hc.a("hs_mode_name,0", (byte) -127);
                if (var2 != null) {
                  jk.field_d[0] = ge.a(var2, (byte) 84);
                }
                var2 = hc.a("hs_mode_name,1", (byte) -127);
                if (null != var2) {
                  jk.field_d[1] = ge.a(var2, (byte) 97);
                }
                var2 = hc.a("hs_mode_name,2", (byte) -127);
                if (var2 != null) {
                  jk.field_d[2] = ge.a(var2, (byte) 81);
                }
                var2 = hc.a("rating_mode_name,0", (byte) -127);
                if (null != var2) {
                  fg.field_m[0] = ge.a(var2, (byte) 122);
                }
                var2 = hc.a("rating_mode_name,1", (byte) -127);
                if (var2 != null) {
                  fg.field_m[1] = ge.a(var2, (byte) 102);
                }
                var2 = hc.a("rating_mode_long_name,0", (byte) -127);
                if (var2 != null) {
                  mj.field_c[0] = ge.a(var2, (byte) 119);
                }
                var2 = hc.a("rating_mode_long_name,1", (byte) -127);
                if (null != var2) {
                  mj.field_c[1] = ge.a(var2, (byte) 80);
                }
                var2 = hc.a("graphics_config_fixed_size", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 78);
                }
                var2 = hc.a("graphics_config_resizable", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 85);
                }
                var2 = hc.a("graphics_config_fullscreen", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 89);
                }
                var2 = hc.a("graphics_config_done", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 124);
                }
                var2 = hc.a("graphics_config_apply", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 123);
                }
                var2 = hc.a("graphics_config_title", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 99);
                }
                var2 = hc.a("graphics_config_instruction", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 86);
                }
                var2 = hc.a("graphics_config_need_memory", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 111);
                }
                var2 = hc.a("pleasewait_dotdotdot", (byte) -127);
                if (var2 != null) {
                  tj.field_H = ge.a(var2, (byte) 88);
                }
                var2 = hc.a("serviceunavailable", (byte) -127);
                if (var2 != null) {
                  t.field_f = ge.a(var2, (byte) 109);
                }
                var2 = hc.a("createtouse", (byte) -127);
                if (null != var2) {
                  ag.field_g = ge.a(var2, (byte) 117);
                }
                var2 = hc.a("achievementsoffline", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 100);
                }
                var2 = hc.a("warning", (byte) -127);
                if (null != var2) {
                  ge.a(var2, (byte) 96);
                }
                var2 = hc.a("DEFAULT_PLAYER_NAME", (byte) -127);
                if (var2 != null) {
                  vd.field_l = ge.a(var2, (byte) 105);
                }
                var2 = hc.a("mustlogin1", (byte) -127);
                if (var2 != null) {
                  d.field_e = ge.a(var2, (byte) 124);
                }
                var2 = hc.a("mustlogin2,1", (byte) -127);
                if (var2 != null) {
                  ek.field_a[1] = ge.a(var2, (byte) 126);
                }
                var2 = hc.a("mustlogin2,2", (byte) -127);
                if (null != var2) {
                  ek.field_a[2] = ge.a(var2, (byte) 102);
                }
                var2 = hc.a("mustlogin2,3", (byte) -127);
                if (null != var2) {
                  ek.field_a[3] = ge.a(var2, (byte) 80);
                }
                var2 = hc.a("mustlogin2,4", (byte) -127);
                if (null != var2) {
                  ek.field_a[4] = ge.a(var2, (byte) 115);
                }
                var2 = hc.a("mustlogin2,5", (byte) -127);
                if (var2 != null) {
                  ek.field_a[5] = ge.a(var2, (byte) 96);
                }
                var2 = hc.a("mustlogin2,6", (byte) -127);
                if (var2 != null) {
                  ek.field_a[6] = ge.a(var2, (byte) 123);
                }
                var2 = hc.a("mustlogin2,7", (byte) -127);
                if (null != var2) {
                  ek.field_a[7] = ge.a(var2, (byte) 84);
                }
                var2 = hc.a("mustlogin3,1", (byte) -127);
                if (null != var2) {
                  bf.field_d[1] = ge.a(var2, (byte) 98);
                }
                var2 = hc.a("mustlogin3,2", (byte) -127);
                if (null != var2) {
                  bf.field_d[2] = ge.a(var2, (byte) 102);
                }
                var2 = hc.a("mustlogin3,3", (byte) -127);
                if (var2 != null) {
                  bf.field_d[3] = ge.a(var2, (byte) 113);
                }
                var2 = hc.a("mustlogin3,4", (byte) -127);
                if (null != var2) {
                  bf.field_d[4] = ge.a(var2, (byte) 106);
                }
                var2 = hc.a("mustlogin3,5", (byte) -127);
                if (null != var2) {
                  bf.field_d[5] = ge.a(var2, (byte) 119);
                }
                var2 = hc.a("mustlogin3,6", (byte) -127);
                if (null != var2) {
                  bf.field_d[6] = ge.a(var2, (byte) 96);
                }
                var2 = hc.a("mustlogin3,7", (byte) -127);
                if (var2 != null) {
                  bf.field_d[7] = ge.a(var2, (byte) 80);
                }
                var2 = hc.a("discard", (byte) -127);
                if (null != var2) {
                  gg.field_c = ge.a(var2, (byte) 86);
                }
                var2 = hc.a("mustlogin4,1", (byte) -127);
                if (var2 != null) {
                  sb.field_b[1] = ge.a(var2, (byte) 88);
                }
                var2 = hc.a("mustlogin4,2", (byte) -127);
                if (var2 != null) {
                  sb.field_b[2] = ge.a(var2, (byte) 80);
                }
                var2 = hc.a("mustlogin4,3", (byte) -127);
                if (var2 != null) {
                  sb.field_b[3] = ge.a(var2, (byte) 81);
                }
                var2 = hc.a("mustlogin4,4", (byte) -127);
                if (var2 != null) {
                  sb.field_b[4] = ge.a(var2, (byte) 94);
                }
                var2 = hc.a("mustlogin4,5", (byte) -127);
                if (null != var2) {
                  sb.field_b[5] = ge.a(var2, (byte) 96);
                }
                var2 = hc.a("mustlogin4,6", (byte) -127);
                if (var2 != null) {
                  sb.field_b[6] = ge.a(var2, (byte) 124);
                }
                var2 = hc.a("mustlogin4,7", (byte) -127);
                if (var2 != null) {
                  sb.field_b[7] = ge.a(var2, (byte) 117);
                }
                var2 = hc.a("mustlogin_notloggedin", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 85);
                }
                var2 = hc.a("mustlogin_alternate,1", (byte) -127);
                if (var2 != null) {
                  ak.field_N[1] = ge.a(var2, (byte) 109);
                }
                var2 = hc.a("mustlogin_alternate,2", (byte) -127);
                if (null != var2) {
                  ak.field_N[2] = ge.a(var2, (byte) 105);
                }
                var2 = hc.a("mustlogin_alternate,3", (byte) -127);
                if (null != var2) {
                  ak.field_N[3] = ge.a(var2, (byte) 80);
                }
                var2 = hc.a("mustlogin_alternate,4", (byte) -127);
                if (null != var2) {
                  ak.field_N[4] = ge.a(var2, (byte) 96);
                }
                var2 = hc.a("mustlogin_alternate,5", (byte) -127);
                if (var2 != null) {
                  ak.field_N[5] = ge.a(var2, (byte) 79);
                }
                var2 = hc.a("mustlogin_alternate,6", (byte) -127);
                if (var2 != null) {
                  ak.field_N[6] = ge.a(var2, (byte) 117);
                }
                var2 = hc.a("mustlogin_alternate,7", (byte) -127);
                if (var2 != null) {
                  ak.field_N[7] = ge.a(var2, (byte) 98);
                }
                var2 = hc.a("subscription_cost_monthly,0", (byte) -127);
                if (var2 != null) {
                  ta.field_ib[0] = ge.a(var2, (byte) 110);
                }
                var2 = hc.a("subscription_cost_monthly,1", (byte) -127);
                if (var2 != null) {
                  ta.field_ib[1] = ge.a(var2, (byte) 95);
                }
                var2 = hc.a("subscription_cost_monthly,2", (byte) -127);
                if (null != var2) {
                  ta.field_ib[2] = ge.a(var2, (byte) 93);
                }
                var2 = hc.a("subscription_cost_monthly,3", (byte) -127);
                if (var2 != null) {
                  ta.field_ib[3] = ge.a(var2, (byte) 80);
                }
                var2 = hc.a("subscription_cost_monthly,4", (byte) -127);
                if (var2 != null) {
                  ta.field_ib[4] = ge.a(var2, (byte) 85);
                }
                var2 = hc.a("subscription_cost_monthly,5", (byte) -127);
                if (var2 != null) {
                  ta.field_ib[5] = ge.a(var2, (byte) 125);
                }
                var2 = hc.a("subscription_cost_monthly,6", (byte) -127);
                if (null != var2) {
                  ta.field_ib[6] = ge.a(var2, (byte) 120);
                }
                var2 = hc.a("subscription_cost_monthly,7", (byte) -127);
                if (var2 != null) {
                  ta.field_ib[7] = ge.a(var2, (byte) 104);
                }
                var2 = hc.a("subscription_cost_monthly,8", (byte) -127);
                if (var2 != null) {
                  ta.field_ib[8] = ge.a(var2, (byte) 99);
                }
                var2 = hc.a("subscription_cost_monthly,9", (byte) -127);
                if (null != var2) {
                  ta.field_ib[9] = ge.a(var2, (byte) 123);
                }
                var2 = hc.a("subscription_cost_monthly,10", (byte) -127);
                if (var2 != null) {
                  ta.field_ib[10] = ge.a(var2, (byte) 106);
                }
                var2 = hc.a("subscription_cost_monthly,11", (byte) -127);
                if (var2 != null) {
                  ta.field_ib[11] = ge.a(var2, (byte) 127);
                }
                var2 = hc.a("subscription_cost_monthly,12", (byte) -127);
                if (null != var2) {
                  ta.field_ib[12] = ge.a(var2, (byte) 110);
                }
                var2 = hc.a("sentence_separator", (byte) -127);
                if (var2 != null) {
                  ge.a(var2, (byte) 109);
                }
                gk.field_d = null;
                finished = true; return;
            }
            void run() {
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
                  stackIn_2608_0 = (RuntimeException) (var2_ref);
                  stackIn_2608_1 = new StringBuilder().append("c.U(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_2609_2 = "null";
                  } else {
                    stackIn_2609_2 = "{...}";
                  }
                  throw ma.a((Throwable) ((Object) stackIn_2608_0), ((StringBuilder) (Object) stackIn_2608_1).append(stackIn_2609_2).append(')').toString());
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    final void a(boolean param0, int param1, boolean param2, boolean param3, boolean param4) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          this.a(param1 - 11472, false);
          if (param2) {
            this.i(108);
          }
          if (param3) {
            this.h(param1 ^ 116);
          }
          if (param1 != 2) {
            this.field_t = (String) null;
          }
          if (param4) {
            this.e((byte) -58);
          }
          if (param0) {
            this.d((byte) 43);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var6), "c.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void d(byte param0) {
        try {
          nl.field_e[5] = true;
          if (param0 != 43) {
            this.field_r = true;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "c.H(" + param0 + ')');
        }
    }

    final void f(byte param0) {
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
                    pa.i(0);
                    if (var4 == 0) {
                      return;
                    }
                  }
                  if (var2_int != 4) {
                    if (var2_int != 5) {
                      if (var2_int != 6) {
                        if (var2_int == 7) {
                          this.j((byte) -122);
                          if (var4 == 0) {
                            return;
                          }
                        }
                        if (var2_int == 8) {
                          td.a(rd.field_j, (byte) -121, al.field_a, jk.field_a);
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
                            k.a((Throwable) null, (byte) -85, "MGS1: " + aj.a((byte) 92));
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
                      vf.a(-28037);
                      if (var4 == 0) {
                        return;
                      }
                    }
                    gj.a(-124);
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
              ce.a(0);
              return;
            }
            return;
          }
          k.a((Throwable) null, (byte) -79, "MGS2: " + aj.a((byte) 92));
          mc.a((byte) -126);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "c.B(" + param0 + ')');
        }
    }

    private final void i(int param0) {
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
          throw ma.a((Throwable) ((Object) var2), "c.E(" + param0 + ')');
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
          throw ma.a((Throwable) ((Object) var1), "c.K(" + param0 + ')');
        }
    }

    final int c(boolean param0) {
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
          if (!ie.b((byte) 34)) {
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
              this.a((byte) -60, "reconnect");
            }
            wd.a(31668);
            if (param0) {
              field_u = (ee) null;
            }
            nk.a(var2_int, -9, e.field_a);
            ve.field_a = true;
            mf.field_j = 15000L + id.a(72);
            stackIn_36_0 = var2_int;
            return stackIn_36_0;
          }
          if (cd.field_e == 11 &&
            w.field_n == 0) {
            al.a(-53);
          }
          stackIn_28_0 = var2_int;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "c.G(" + param0 + ')');
        }
    }

    final int a(boolean param0, byte param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          var3_int = 33 % ((-19 - param1) / 43);
          stackIn_1_0 = this.a(param0, true, 10);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "c.M(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
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
          if (wc.field_A != null) {
            if (null == gj.field_a) {
              var3 = af.t(3);
              var4_ref_java_awt_Dimension = var3.getSize();
              wc.field_A.a(var4_ref_java_awt_Dimension.height, (byte) 115, var4_ref_java_awt_Dimension.width);
            }
            wc.field_A.b(5718);
          }
          i.a(-125);
          rf.c(-54);
          if (!th.a(true) &&
            cd.field_e != 11) {
            wk.a(false);
          }
          if (Main.field_V != null) {
            eg.field_f = Main.field_V.b(-119);
          }
          if (g.j(7)) {
            var3_int = 1200 * va.a(22018);
            if (this.field_v ||
              !(var3_int >= mk.h(-1)) &&
              !(dj.c(0) <= var3_int)) {
              this.field_v = false;
              mc.a((byte) -128);
              wd.a(31668);
              nk.a(2, -9, jc.field_S);
              wc.j(-9636);
              ve.field_a = true;
              mf.field_j = 15000L + id.a(74);
            }
          }
          if (-1 == w.field_n ||
            w.field_n == 0) {
            stackIn_38_0 = (w.field_n != -1) ? 0 : 1;
            var3_intLifetime1 = stackIn_38_0;
            w.field_n = ei.c(0);
            if (var3_intLifetime1 != 0 &&
              w.field_n == 0 &&
              cd.field_e == 11 &&
              !ie.b((byte) 34)) {
              al.a(-76);
            }
            if (-1 != w.field_n &&
              0 != w.field_n) {
              mf.field_j = id.a(54) + 15000L;
            }
          }
          boolean decompiledFrameRemainder1 = true;
          var3_intLifetime2 = 14 / ((param0 - 5) / 57);
          if (-1 != w.field_n &&
            w.field_n != 0) {
            if (10 > g.field_A) {
              if (w.field_n == 3) {
                this.a((byte) -115, "js5crc");
                decompiledFrameRemainder1 = (var5 != 0);
              }
              if (decompiledFrameRemainder1) {
                if (w.field_n != 4) {
                  if (w.field_n != 2) {
                    if (5 == w.field_n) {
                      this.a((byte) -121, "outofdate");
                      decompiledFrameRemainder1 = (var5 != 0);
                    }
                    if (decompiledFrameRemainder1) {
                      this.a((byte) -95, "js5connect");
                      decompiledFrameRemainder1 = (var5 != 0);
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    this.a((byte) -64, "js5connect_full");
                    decompiledFrameRemainder1 = (var5 != 0);
                  }
                }
                if (decompiledFrameRemainder1) {
                  this.a((byte) -36, "js5io");
                  decompiledFrameRemainder1 = (var5 != 0);
                }
              }
            }
            if ((decompiledFrameRemainder1) &&
              (cd.field_e >= 10)) {
              boolean decompiledFrameRemainder0 = true;
              wd.a(31668);
              if (w.field_n == 3) {
                nk.a(256, -9, kk.field_a);
                decompiledFrameRemainder0 = (var5 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (4 != w.field_n) {
                  if (w.field_n != 2) {
                    if (w.field_n != 5) {
                      nk.a(256, -9, ac.field_c);
                      if (var5 != 0) {
                        nk.a(5, -9, ve.field_b);
                        nk.a(256, -9, rh.field_g);
                        nk.a(256, -9, ma.field_b);
                      }
                    } else {
                      nk.a(5, -9, ve.field_b);
                      if (var5 != 0) {
                        nk.a(256, -9, rh.field_g);
                        nk.a(256, -9, ma.field_b);
                      }
                    }
                  } else {
                    nk.a(256, -9, rh.field_g);
                    if (var5 != 0) {
                      nk.a(256, -9, ma.field_b);
                    }
                  }
                } else {
                  nk.a(256, -9, ma.field_b);
                }
              }
              ve.field_a = true;
            }
          }
          if ((w.field_n != -1 &&
            w.field_n != 0 ||
            ie.b((byte) 34)) &&
            mf.field_j <= id.a(59)) {
            ve.field_a = false;
            if (w.field_n != -1 &&
              w.field_n != 0) {
              w.field_n = -1;
              ta.c(true);
            }
          }
          if (w.field_n == 0 &&
            !ie.b((byte) 34)) {
            sg.field_b = false;
          }
          if (g.field_A == 0 &&
            eh.a(37)) {
            g.field_A = 1;
          }
          if (g.field_A == 1) {
            if (hf.field_I != 0) {
              lb.field_a = aj.a(1, jj.field_b);
            }
            jk.field_c = qi.a(true, eb.field_f, 1, false, 2147483647);
            aa.field_db = qi.a(true, jh.field_b, 1, false, 2147483647);
            sg.field_a = qi.a(true, ia.field_e, 1, false, 2147483647);
            g.field_A = 2;
            hf.field_H = jk.field_c;
          }
          if (g.field_A == 2) {
            if (null != lb.field_a &&
              lb.field_a.b(4)) {
              if (lb.field_a.c(0, "")) {
                if (lb.field_a.b(4, "")) {
                  c.a(-106, lb.field_a);
                  lb.field_a = null;
                  hj.b((byte) -40);
                  if (var5 != 0) {
                    lb.field_a = null;
                  }
                }
              } else {
                lb.field_a = null;
              }
            }
            if (lb.field_a == null) {
              g.field_A = 3;
            }
          }
          if (g.field_A == 3 &&
            uh.a(jk.field_c, sg.field_a, aa.field_db, 2) &&
            sk.a((byte) 33, sg.field_a)) {
            sg.a((byte) -12);
            ad.a(51);
            ck.field_G = gk.field_c;
            tj.field_K = false;
            cj.a(aa.field_db, dg.field_F, sg.field_a, jk.field_c, 126);
            if (pb.field_h ||
              null != cj.field_k) {
              stackIn_200_0 = cj.field_k;
              stackIn_200_1 = 1024;
              stackIn_201_2 = !(pb.field_h);
              stackIn_205_3 = !(pb.field_h);
              mb.a(stackIn_200_0, stackIn_200_1, stackIn_201_2, stackIn_205_3);
            }
            if (sl.field_a) {
              lc.a(4);
            }
            if (ta.field_hb == null) {
              ta.field_hb = af.r(77);
              oe.field_a = fd.a(-28506);
            }
            ca.a(sg.field_a, ta.field_hb, oe.field_a, 0);
            aa.field_db = null;
            jk.field_c = null;
            sg.field_a = null;
            qg.a((java.applet.Applet) (this), 18478);
            hj.b((byte) -77);
            g.field_A = 10;
          }
          if (10 == g.field_A) {
            if (0 != hf.field_I) {
              ue.field_a = aj.a(1, bf.field_a);
            }
            g.field_A = 11;
          }
          if (g.field_A == 11) {
            boolean decompiledSharedTail0 = (null != ue.field_a &&
              (!(ue.field_a.b(4)) ||
              !(ue.field_a.a((byte) 56))));
            if (!decompiledSharedTail0) {
              g.field_A = 12;
              kj.field_P = true;
              decompiledSharedTail0 = (var5 != 0);
            }
            if (decompiledSharedTail0) {
              ug.a(0.0f, 106, pf.a(ue.field_a, oe.field_d, fg.field_j, true));
            }
          }
          if (12 == g.field_A &&
            !kj.field_P) {
            g.field_A = 13;
          }
          if (g.field_A == 13) {
            var4 = 1;
            if (null != rh.field_l) {
              var4 = rh.field_l.a(110) ? 1 : 0;
              ug.a(rh.field_l.field_g, 115, rh.field_l.field_i);
            }
            if (var4 != 0) {
              g.field_A = 20;
            }
          }
          if (!param1 &&
            vd.field_w) {
            bg.a(tb.field_c, (byte) -108);
            this.d(-1775094552);
            tk.a(tb.field_c, -1);
          }
          if (nl.field_e[8]) {
            Main.l((byte) 89);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3_ref), "c.F(" + param0 + ',' + param1 + ')');
        }
    }

    private final void g(int param0) {
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
          throw ma.a((Throwable) ((Object) var2), "c.O(" + param0 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
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
          throw ma.a((Throwable) ((Object) var3), "c.P(" + param0 + ',' + param1 + ')');
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
          throw ma.a((Throwable) ((Object) var1), "c.N(" + param0 + ')');
        }
    }

    private final void a(int param0, String param1, int param2, int param3, int param4) {
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
            if (!this.c((byte) -123)) {
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
            this.a((byte) 106, param1, param4, this.field_l, param3, param2, 32);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            k.a((Throwable) ((Object) var6_ref), (byte) -72, (String) null);
            this.a((byte) -77, "crash");
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
          throw ma.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
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
          var2_int = rd.field_j.f(50);
          stackIn_4_0 = ((1 & var2_int) == 0) ? 0 : 1;
          var3 = stackIn_4_0;
          var4 = al.field_a - 1;
          var5 = new byte[var4];
          if (param0 != -47) {
            this.c(false);
          }
          rd.field_j.b(0, var5, 28040, var4);
          bk.a(mk.g(-117), -25573, ge.a(var5, (byte) 89), var3 != 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) runtimeException), "c.D(" + param0 + ')');
        }
    }

    final void a(int param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(-6, param1, 640, param0, param2);
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
          throw ma.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void j(byte param0) {
        String var2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (param0 > -75) {
            this.field_l = -59;
          }
          var2 = sb.a(-3871);
          h.a(mk.g(-121), (byte) 68, var2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "c.T(" + param0 + ')');
        }
    }

    public static void g(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_u = null;
          field_k = null;
          if (param0 <= 60) {
            c.g((byte) 43);
          }
          field_w = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "c.R(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, boolean param6, int param7) {
        RuntimeException runtimeException = null;
        java.awt.Frame var9 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new java.awt.Frame("Jagex");
          var9.pack();
          var9.dispose();
          if (param5 <= 109) {
            field_u = (ee) null;
          }
          this.setBackground(java.awt.Color.black);
          hf.field_I = this.field_m;
          be.a(-115, hf.field_I);
          vd.a(this.field_l, hf.field_I, param6, this.field_x, this.field_q, 124, this.field_t, 5000, this.field_s, param2, this.field_o, 5000, jk.field_a, this.field_n);
          eb.a(jk.field_a, this.field_l, param2, this.field_t, this.field_q, (byte) -62, hf.field_I, this.field_s, this.field_o);
          wh.a(192);
          Main.field_V = mk.c((byte) 100);
          tk.a(tb.field_c, -1);
          jh.field_b = param0;
          bf.field_a = param7;
          ia.field_e = param3;
          jj.field_b = param4;
          eb.field_f = param1;
          this.g(90);
          uh.b((byte) -79);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) runtimeException), "c.V(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    protected c() {
    }

    private final void e(byte param0) {
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
          throw ma.a((Throwable) ((Object) var2), "c.L(" + param0 + ')');
        }
    }

    private final int a(boolean param0, boolean param1, int param2) {
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
          pb var6_ref = null;
          String var7 = null;
          int var8 = 0;
          var8 = Main.field_T;
          try {
            var4_int = mj.a(hf.field_I, eg.field_f, param0, true);
            if (var4_int == 0) {
              throw new IllegalStateException();
            }
            if (var4_int == 1) {
              var5_int = ti.a(ge.a(-23339), a.e(48), param2 ^ 10);
              if (-1 != var5_int) {
                q.a(ll.field_f, var5_int, -106, e.field_a);
                ll.field_f = null;
                e.field_a = null;
              }
              var6 = he.a(59);
              if (var6 != null) {
                fk.a(param2 + 24978, var6.booleanValue());
              }
            }
            if (var4_int == 2) {
              var5_int = qa.a(c.h((byte) -58), ij.a((byte) 120), ja.a(-7705), de.a(565192680), td.a(-2), true, this.field_p);
              if (var5_int != -1) {
                sj.a(44, e.field_a, ll.field_f, var5_int);
                e.field_a = null;
                ll.field_f = null;
              }
            }
            if (var4_int == 3) {
              if (w.field_n != -1 &&
                w.field_n != 0) {
                w.field_n = -1;
                ta.c(true);
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
                    nk.a(var5_int, param2 ^ -3, e.field_a);
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
              if (!dg.field_F) {
                cd.field_e = 10;
                vg.field_d = true;
                if (var8 != 0) {
                  pb.a(mk.g(-119), (byte) 104);
                }
              } else {
                pb.a(mk.g(-119), (byte) 104);
              }
            }
            if (var4_int == 5) {
              pb.a((byte) -124, mk.g(-126));
            }
            if (var4_int == 6 &&
              tj.field_K) {
              cd.field_e = 10;
            }
            if (7 == var4_int) {
              gg.a(mk.g(-119), 7380);
            }
            if (8 == var4_int) {
              pb.a(mk.g(-125), (byte) 76);
            }
            if (9 == var4_int) {
              rk.a(mk.g(-127), (byte) -85);
            }
            if (param2 == var4_int) {
              na.field_r.h(17, 0);
            }
            if (var4_int == 11) {
              wh.a(mk.g(-125), 63);
            }
            if (12 == var4_int) {
              pa.a(mk.g(param2 - 130), wd.b(-108), -31);
            }
            if (13 == var4_int) {
              try {
                if (di.field_d == null) {
                  di.field_d = new rf(jk.field_a, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                }
                var5_int = di.field_d.a(true) ? 1 : 0;
                if (var5_int != 0) {
                  var6_ref = di.field_d.a(-55);
                  boolean decompiledSharedTail0 = (null != var6_ref);
                  if (!decompiledSharedTail0) {
                    ok.a(param2 ^ 574, (String) null);
                    decompiledSharedTail0 = (var8 != 0);
                  }
                  if (decompiledSharedTail0) {
                    var7 = bd.a(255, 0, var6_ref.field_g, var6_ref.field_i);
                    ok.a(564, var7);
                  }
                  di.field_d = null;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5 = (Exception) (Object) decompiledCaughtException;
                k.a((Throwable) ((Object) var5), (byte) -104, "S1");
                ok.a(param2 + 554, (String) null);
                di.field_d = null;
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
            throw ma.a((Throwable) ((Object) var4), "c.S(" + param0 + ',' + param1 + ',' + param2 + ')');
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
