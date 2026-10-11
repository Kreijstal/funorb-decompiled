/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    static ci field_b;
    static String field_e;
    static String field_c;
    static String[] field_a;
    static int field_d;

    final static int a(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 2) {
            stackIn_4_0 = ob.field_a[2047 & param1];
            return stackIn_4_0;
          }
          stackIn_2_0 = 77;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2), "ij.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static String a(String[] args, int param1, String param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_34_0 = 0;
        boolean stackIn_42_0 = false;
        String stackIn_61_0 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0;
        boolean stackOut_41_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = Terraphoenix.field_V;
        try {
          var3_int = param2.length();
          if (param1 != -1) {
            field_e = (String) null;
          }
          var4 = var3_int;
          var5 = 0;
          L1: while (true) {
            var6_int = param2.indexOf("<%", var5);
            stackIn_6_0 = ~var6_int;
            L2: while (true) {
              if (stackIn_6_0 > -1) {
                if (var11 == 0) {
                  break L2;
                }
              } else {
                var5 = 2 + var6_int;
              }
              while (var3_int > var5) {
                stackOut_13_0 = gb.a((byte) 41, param2.charAt(var5));
                stackIn_6_0 = stackOut_13_0 ? 1 : 0;
                stackIn_14_0 = stackOut_13_0;
                if (var11 != 0) {
                  continue L2;
                }
                if (stackIn_14_0) {
                  var5++;
                  continue;
                }
                break;
              }
              var7_ref_String = param2.substring(var6_int + 2, var5);
              if (!te.a((CharSequence) ((Object) var7_ref_String), true) &&
                var11 == 0) {
                continue L1;
              }
              if (var3_int > var5 &&
                param2.charAt(var5) == 62) {
                var5++;
                var8 = ta.a((CharSequence) ((Object) var7_ref_String), 112);
                var4 = var4 + (var6_int - var5 + args[var8].length());
              }
              if (var11 == 0) {
                continue L1;
              }
              break;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var5Lifetime1 = 0;
          var7 = 0;
          L10: while (true) {
            var8Lifetime1 = param2.indexOf("<%", var5Lifetime1);
            stackIn_34_0 = -1;
            L11: while (true) {
              if (stackIn_34_0 < ~var8Lifetime1) {
                if (var11 == 0) {
                  break L11;
                }
              } else {
                var5Lifetime1 = var8Lifetime1 + 2;
              }
              while (var3_int > var5Lifetime1) {
                stackOut_41_0 = gb.a((byte) 41, param2.charAt(var5Lifetime1));
                stackIn_34_0 = stackOut_41_0 ? 1 : 0;
                stackIn_42_0 = stackOut_41_0;
                if (var11 != 0) {
                  continue L11;
                }
                if (stackIn_42_0) {
                  var5Lifetime1++;
                  continue;
                }
                break;
              }
              var9 = param2.substring(var8Lifetime1 + 2, var5Lifetime1);
              if (!te.a((CharSequence) ((Object) var9), true) &&
                var11 == 0) {
                continue L10;
              }
              if (var5Lifetime1 < var3_int &&
                param2.charAt(var5Lifetime1) == 62) {
                var5Lifetime1++;
                var10 = ta.a((CharSequence) ((Object) var9), -103);
                discarded$0 = var6.append(param2.substring(var7, var8Lifetime1));
                discarded$1 = var6.append(args[var10]);
                var7 = var5Lifetime1;
              }
              if (var11 == 0) {
                continue L10;
              }
              break;
            }
            break;
          }
          discarded$2 = var6.append(param2.substring(var7));
          stackIn_61_0 = var6.toString();
          return stackIn_61_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_65_0 = var3;
          stackIn_65_1 = new StringBuilder().append("ij.C(");
          if (args == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(')').toString());
        }
    }

    final static void a(int param0, fa param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_2604_0;
            StringBuilder stackIn_2604_1;
            String stackIn_2605_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int param0;
            fa param1;
            boolean finished;
            $CfrPartitionedBody(int initialParam0, fa initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_2604_0 = null;
                this.stackIn_2604_1 = null;
                this.stackIn_2605_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                fh.field_d = param1;
                var2 = bc.a("loginm3", false);
                if (var2 != null) {
                  qk.field_f = ll.a(0, var2);
                }
                var2 = bc.a("loginm2", false);
                if (var2 != null) {
                  cl.field_I = ll.a(0, var2);
                }
                var2 = bc.a("loginm1", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("idlemessage20min", false);
                if (null != var2) {
                  ae.field_F = ll.a(0, var2);
                }
                var2 = bc.a("error_js5crc", false);
                if (null != var2) {
                  tj.field_ub = ll.a(0, var2);
                }
                var2 = bc.a("error_js5io", false);
                if (var2 != null) {
                  lb.field_a = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("error_js5connect_full", false);
                if (null != var2) {
                  j.field_P = ll.a(0, var2);
                }
                var2 = bc.a("error_js5connect", false);
                if (null != var2) {
                  ak.field_f = ll.a(0, var2);
                }
                var2 = bc.a("login_gameupdated", false);
                if (null != var2) {
                  sh.field_x = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("create_unable", false);
                if (var2 != null) {
                  kj.field_e = ll.a(0, var2);
                }
                var2 = bc.a("create_ineligible", false);
                if (var2 != null) {
                  ib.field_ab = ll.a(0, var2);
                }
                var2 = bc.a("usernameprompt", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("passwordprompt", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("andagainprompt", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("ticketing_read", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("ticketing_ignore", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("ticketing_oneunread", false);
                if (null != var2) {
                  ol.field_Lb = ll.a(0, var2);
                }
                var2 = bc.a("ticketing_xunread", false);
                if (var2 != null) {
                  na.field_X = ll.a(0, var2);
                }
                var2 = bc.a("ticketing_gotowebsite", false);
                if (var2 != null) {
                  mm.field_h = ll.a(0, var2);
                }
                var2 = bc.a("ticketing_waitingformessages", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("mu_chat_on", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_chat_friends", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_chat_off", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_chat_lobby", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("mu_chat_public", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("mu_chat_ignore", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_chat_tips", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("mu_chat_game", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_chat_private", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_x_entered_game", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_x_joined_your_game", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_x_entered_other_game", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_x_left_lobby", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_x_lost_con", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_x_cannot_join_full", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_x_cannot_join_inprogress", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_x_declined_invite", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("mu_x_withdrew_request", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_x_removed", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_x_dropped_out", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_entered_other_game", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_game_is_full", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_game_has_started", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_you_declined_invite", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_invite_withdrawn", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_request_declined", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_request_withdrawn", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_all_players_have_left", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("mu_lobby_name", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_lobby_rating", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_lobby_friend_add", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_lobby_friend_rm", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_lobby_name_add", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("mu_lobby_name_rm", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("mu_lobby_location", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_gamelist_all_games", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_gamelist_status", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_gamelist_owner", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_gamelist_players", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_gamelist_avg_rating", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_gamelist_options", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("mu_gamelist_elapsed_time", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("mu_play_rated", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("mu_create_unrated", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_options", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_options_whocanjoin", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("mu_options_players", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_options_dontmind", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("mu_options_allow_spectate", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_options_ratedgametype", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("yes", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("no", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_invite_players", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("close", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("add_x_to_friends", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("add_x_to_ignore", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rm_x_from_friends", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("rm_x_from_ignore", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("send_pm_to_x", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("send_qc_to_x", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("send_pm", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("invite_accept_xs_game", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("invite_decline_xs_game", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("join_xs_game", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("join_request_xs_game", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("join_withdraw_request_xs_game", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("mu_gameopt_kick_x_from_this_game", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_gameopt_withdraw_invite_to_x", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_gameopt_accept_x_into_game", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_gameopt_reject_x_from_game", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_gameopt_invite_x_to_game", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("report_x_for_abuse", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("unable_to_send_message_password_a", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("unable_to_send_message_password_b", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_chat_lobby_show_all", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_chat_lobby_friends_only", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_chat_lobby_friends", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_chat_lobby_hide", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_chat_game_show_all", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_chat_game_friends_only", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_chat_game_friends", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_chat_game_hide", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("mu_chat_pm_show_all", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_chat_pm_friends_only", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_chat_pm_friends", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mu_chat_invisible_and_silent_mode", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("you_have_been_removed_from_xs_game", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("your_rating_is_x", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("you_are_on_x_server", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rated_game", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("unrated_game", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rated_game_tips", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("searching_for_opponent_singular", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("searching_for_opponents_plural", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("find_opponent_singular", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("find_opponents_plural", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rated_game_tips_setup_singular", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rated_game_tips_setup_plural", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("waiting_to_start_hint", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("your_game", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("game_full", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("join_requests_one", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("join_requests_many", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("xs_game", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("waiting_for_x_to_start_game", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("game_options_changed", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("players_x_of_y", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("message_lobby", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("quickchat_lobby", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("message_game", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("message_team", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("quickchat_game", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("kick", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("inviting_x", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("x_wants_to_join", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("accept", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("reject", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("invite", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("status_concluded", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("status_spectate", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("status_playing", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("status_join", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("status_private", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("status_full", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("players_in_game", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("you_are_invited_to_xs_game", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("asking_to_join_xs_game", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("who_can_join", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("you_can_join", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("you_can_ask_to_join", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("you_cannot_join_in_progress", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("you_can_spectate", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("you_can_not_spectate", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("spectate_xs_game", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("hide_players_in_xs_game", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("show_players_in_xs_game", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("connecting_to_friend_server_twoline", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("loading", false);
                if (null != var2) {
                  hh.field_k = ll.a(0, var2);
                }
                var2 = bc.a("offline", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("multiconst_invite_only", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("multiconst_clan", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("multiconst_friends", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("multiconst_similar_rating", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("multiconst_open", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("no_options_available", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("reportabuse", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("presstabtochat", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("pressf10toquickchat", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("dob_chatdisabled", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("dob_enterforchat", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("tab_hidechattemporarily", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("esc_cancelprivatemessage", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("esc_cancelthisline", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("privatequickchat_from_x", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("privatequickchat_to_x", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("privatechat_blankarea_explanation", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("publicchat_unavailable_ratedgame", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("privatechat_friend_offline", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("privatechat_friend_notlisted", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("chatviewscrolledup", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("thisisrunescapeclan", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("thisisrunescapeclan_notowner", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("runescapeclan", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rated_membersonly", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_membersonly", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_1moreratedgame", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_moreratedgames", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("gameopt_needrating", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_unratedonly", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_notunlocked", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_cannotbecombined1", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_cannotbecombined2", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_playernotmember", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_younotmember", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_playerneedsrating", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_youneedrating", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_playerneedsratedgames", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_youneedratedgames", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_playerneeds1ratedgame", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_youneed1ratedgame", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_playerhasntunlocked", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_youhaventunlocked", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_trychanging1", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_trychanging2", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_needchanging1", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_needchanging2", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_mightchange", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_playersdontqualify", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_playersdontqualify_selectgametab", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_unselectedoptions", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_pleaseselectoption1", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_pleaseselectoption2", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_badnumplayers", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_inviteplayers_or_trychanging1", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("gameopt_inviteplayers_or_trychanging2", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("gameopt_novalidcombos", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameopt_pleasetrychanging", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("ra_title", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("ra_mutethisplayer", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("ra_suggestmute", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("ra_intro", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("ra_intro_no_name", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("ra_explanation", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("rule_pillar_0", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rule_0_0", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rule_0_1", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rule_0_2", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("rule_0_3", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rule_0_4", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("rule_0_5", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rule_pillar_1", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rule_1_0", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rule_1_1", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("rule_1_2", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("rule_1_3", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("rule_1_4", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rule_pillar_2", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rule_2_0", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rule_2_1", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rule_2_2", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("createafreeaccount", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("cancel", false);
                if (null != var2) {
                  lf.field_d = ll.a(0, var2);
                }
                var2 = bc.a("pleaselogintoplay", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("pleaselogin", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("pleaselogin_member", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("invaliduserorpass", false);
                if (var2 != null) {
                  bi.field_c = ll.a(0, var2);
                }
                var2 = bc.a("pleasetryagain", false);
                if (null != var2) {
                  ld.field_g = ll.a(0, var2);
                }
                var2 = bc.a("pleasereenterpass", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("playfreeversion", false);
                if (var2 != null) {
                  pl.field_V = ll.a(0, var2);
                }
                var2 = bc.a("reloadgame", false);
                if (null != var2) {
                  hf.field_u = ll.a(0, var2);
                }
                var2 = bc.a("toserverlist", false);
                if (var2 != null) {
                  mi.field_i = ll.a(0, var2);
                }
                var2 = bc.a("tocustomersupport", false);
                if (null != var2) {
                  fc.field_b = ll.a(0, var2);
                }
                var2 = bc.a("changedisplayname", false);
                if (var2 != null) {
                  ec.field_c = ll.a(0, var2);
                }
                var2 = bc.a("returntohomepage", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("justplay", false);
                if (null != var2) {
                  aj.field_c = ll.a(0, var2);
                }
                var2 = bc.a("justplay_excl", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("login", false);
                if (var2 != null) {
                  ik.field_a = ll.a(0, var2);
                }
                var2 = bc.a("goback", false);
                if (var2 != null) {
                  sl.field_f = ll.a(0, var2);
                }
                var2 = bc.a("otheroptions", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("proceed", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("connectingtoserver", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("pleasewait", false);
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("logging_in", false);
                if (var2 != null) {
                  fh.field_x = ll.a(0, var2);
                }
                var2 = bc.a("reconnect", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("backtoerror", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("pleasecheckinternet", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("attemptingtoreconnect", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("connectionlost_reconnecting", false);
                if (var2 != null) {
                  jh.field_o = ll.a(0, var2);
                }
                var2 = bc.a("connectionlost_withreason", false);
                if (var2 != null) {
                  fd.field_q = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("passwordverificationrequired", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("invalidpass", false);
                if (var2 != null) {
                  em.field_b = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("retry", false);
                if (null != var2) {
                  rb.field_c = ll.a(0, var2);
                }
                var2 = bc.a("back", false);
                if (var2 != null) {
                  gd.field_b = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("exitfullscreenmode", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("quittowebsite", false);
                if (var2 != null) {
                  ed.field_c = ll.a(0, var2);
                }
                var2 = bc.a("connectionrestored", false);
                if (var2 != null) {
                  si.field_pb = ll.a(0, var2);
                }
                var2 = bc.a("warning_ifyouquit", false);
                if (var2 != null) {
                  ie.field_c = ll.a(0, var2);
                }
                var2 = bc.a("warning_ifyouquitorleavepage", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("resubscribe_withoutlosing_fs", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("resubscribe_withoutlosing", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("customersupport_withoutlosing_fs", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("customersupport_withoutlosing", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("js5help_withoutlosing_fs", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("js5help_withoutlosing", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("checkinternet_withoutlosing_fs", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("checkinternet_withoutlosing", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_intro", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_sameaccounttip_unnamed", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("dateofbirthprompt", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("fetchingcountrylist", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("countryprompt", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("countrylisterror", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("theonlypersonalquestions", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("create_submittingdata", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("check", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_pleasechooseausername", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("create_usernameblurb", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("checkingavailability", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("checking", false);
                if (var2 != null) {
                  eg.field_k = ll.a(0, var2);
                }
                var2 = bc.a("create_namealreadytaken", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_sameaccounttip_named", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_nosuggestions", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_alternativelygoback", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("create_available", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_willnowshowtermsandconditions", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("fetchingterms", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("termserror", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_iagree", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_idisagree", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_pleasescrolldowntoaccept", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_linkaddress", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("openinpopupwindow", false);
                if (null != var2) {
                  ig.field_b = ll.a(0, var2);
                }
                var2 = bc.a("create", false);
                if (var2 != null) {
                  fm.field_a = ll.a(0, var2);
                }
                var2 = bc.a("create_pleasechooseapassword", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_passwordblurb", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                if (param0 != 3) {
                  finished = true; return;
                }
                var2 = bc.a("create_nevergivepassword", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("creatingyouraccount", false);
                if (null != var2) {
                  mm.field_d = ll.a(0, var2);
                }
                var2 = bc.a("create_youmustaccept", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_passwordsdifferent", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("create_success", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("day", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("month", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("year", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("monthnames,0", false);
                if (var2 != null) {
                  fd.field_i[0] = ll.a(0, var2);
                }
                var2 = bc.a("monthnames,1", false);
                if (var2 != null) {
                  fd.field_i[1] = ll.a(sl.a(param0, 3), var2);
                }
                var2 = bc.a("monthnames,2", false);
                if (var2 != null) {
                  fd.field_i[2] = ll.a(0, var2);
                }
                var2 = bc.a("monthnames,3", false);
                if (null != var2) {
                  fd.field_i[3] = ll.a(0, var2);
                }
                var2 = bc.a("monthnames,4", false);
                if (var2 != null) {
                  fd.field_i[4] = ll.a(0, var2);
                }
                var2 = bc.a("monthnames,5", false);
                if (var2 != null) {
                  fd.field_i[5] = ll.a(0, var2);
                }
                var2 = bc.a("monthnames,6", false);
                if (var2 != null) {
                  fd.field_i[6] = ll.a(sl.a(param0, 3), var2);
                }
                var2 = bc.a("monthnames,7", false);
                if (null != var2) {
                  fd.field_i[7] = ll.a(sl.a(param0, 3), var2);
                }
                var2 = bc.a("monthnames,8", false);
                if (var2 != null) {
                  fd.field_i[8] = ll.a(0, var2);
                }
                var2 = bc.a("monthnames,9", false);
                if (var2 != null) {
                  fd.field_i[9] = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("monthnames,10", false);
                if (var2 != null) {
                  fd.field_i[10] = ll.a(0, var2);
                }
                var2 = bc.a("monthnames,11", false);
                if (null != var2) {
                  fd.field_i[11] = ll.a(sl.a(param0, 3), var2);
                }
                var2 = bc.a("create_welcome", false);
                if (null != var2) {
                  gb.field_A = ll.a(0, var2);
                }
                var2 = bc.a("create_u13_welcome", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_createanaccount", false);
                if (var2 != null) {
                  td.field_j = ll.a(0, var2);
                }
                var2 = bc.a("create_username", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("create_displayname", false);
                if (null != var2) {
                  ag.field_b = ll.a(0, var2);
                }
                var2 = bc.a("create_password", false);
                if (var2 != null) {
                  eb.field_E = ll.a(0, var2);
                }
                var2 = bc.a("create_password_confirm", false);
                if (null != var2) {
                  ej.field_N = ll.a(0, var2);
                }
                var2 = bc.a("create_email", false);
                if (var2 != null) {
                  g.field_nb = ll.a(0, var2);
                }
                var2 = bc.a("create_email_confirm", false);
                if (null != var2) {
                  bh.field_h = ll.a(0, var2);
                }
                var2 = bc.a("create_age", false);
                if (null != var2) {
                  ig.field_d = ll.a(0, var2);
                }
                var2 = bc.a("create_u13_email", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("create_u13_email_confirm", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("create_dob", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_country", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("create_alternatives_header", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("create_alternatives_select", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_suggestions", false);
                if (var2 != null) {
                  tb.field_l = ll.a(0, var2);
                }
                var2 = bc.a("create_more_suggestions", false);
                if (null != var2) {
                  re.field_d = ll.a(0, var2);
                }
                var2 = bc.a("create_select_alternative", false);
                if (null != var2) {
                  g.field_ab = ll.a(0, var2);
                }
                var2 = bc.a("create_optin_news", false);
                if (var2 != null) {
                  p.field_b = ll.a(0, var2);
                }
                var2 = bc.a("create_agreeterms", false);
                if (null != var2) {
                  h.field_d = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("create_u13terms", false);
                if (var2 != null) {
                  rf.field_y = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("login_username_email", false);
                if (var2 != null) {
                  gb.field_D = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("login_username", false);
                if (var2 != null) {
                  mm.field_a = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("login_email", false);
                if (var2 != null) {
                  ed.field_b = ll.a(0, var2);
                }
                var2 = bc.a("login_username_tooltip", false);
                if (null != var2) {
                  hi.field_Z = ll.a(0, var2);
                }
                var2 = bc.a("login_password_tooltip", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("login_login_tooltip", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("login_create_tooltip", false);
                if (var2 != null) {
                  sj.field_d = ll.a(0, var2);
                }
                var2 = bc.a("login_justplay_tooltip", false);
                if (null != var2) {
                  qf.field_b = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("login_back_tooltip", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("login_no_displayname", false);
                if (var2 != null) {
                  wj.field_f = ll.a(0, var2);
                }
                var2 = bc.a("create_username_tooltip", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_username_hint", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("create_displayname_tooltip", false);
                if (var2 != null) {
                  p.field_g = ll.a(0, var2);
                }
                var2 = bc.a("create_displayname_hint", false);
                if (null != var2) {
                  im.field_b = ll.a(0, var2);
                }
                var2 = bc.a("create_password_tooltip", false);
                if (var2 != null) {
                  ki.field_Y = ll.a(0, var2);
                }
                var2 = bc.a("create_password_hint", false);
                if (null != var2) {
                  q.field_Kb = ll.a(0, var2);
                }
                var2 = bc.a("create_password_confirm_tooltip", false);
                if (null != var2) {
                  be.field_y = ll.a(0, var2);
                }
                var2 = bc.a("create_email_tooltip", false);
                if (null != var2) {
                  tg.field_h = ll.a(0, var2);
                }
                var2 = bc.a("create_email_confirm_tooltip", false);
                if (var2 != null) {
                  ga.field_p = ll.a(0, var2);
                }
                var2 = bc.a("create_age_tooltip", false);
                if (var2 != null) {
                  bl.field_c = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("create_optin_news_tooltip", false);
                if (null != var2) {
                  hd.field_j = ll.a(0, var2);
                }
                var2 = bc.a("create_u13_email_tooltip", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_u13_email_confirm_tooltip", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_dob_tooltip", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_country_tooltip", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_optin_tooltip", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_continue", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("create_username_unavailable", false);
                if (var2 != null) {
                  mg.field_m = ll.a(0, var2);
                }
                var2 = bc.a("create_username_available", false);
                if (null != var2) {
                  lk.field_e = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("create_alert_namelength", false);
                if (var2 != null) {
                  km.field_m = ll.a(0, var2);
                }
                var2 = bc.a("create_alert_namechars", false);
                if (var2 != null) {
                  gd.field_d = ll.a(0, var2);
                }
                var2 = bc.a("create_alert_nameleadingspace", false);
                if (var2 != null) {
                  vi.field_t = ll.a(0, var2);
                }
                var2 = bc.a("create_alert_doublespace", false);
                if (null != var2) {
                  fd.field_p = ll.a(0, var2);
                }
                var2 = bc.a("create_alert_passchars", false);
                if (null != var2) {
                  a.field_a = ll.a(0, var2);
                }
                var2 = bc.a("create_alert_passrepeated", false);
                if (var2 != null) {
                  ak.field_j = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("create_alert_passlength", false);
                if (null != var2) {
                  kh.field_M = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("create_alert_passcontainsname", false);
                if (null != var2) {
                  jd.field_i = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("create_alert_passcontainsemail", false);
                if (null != var2) {
                  mj.field_a = ll.a(0, var2);
                }
                var2 = bc.a("create_alert_passcontainsname_partial", false);
                if (null != var2) {
                  tc.field_b = ll.a(0, var2);
                }
                var2 = bc.a("create_alert_checkname", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("create_alert_invalidemail", false);
                if (null != var2) {
                  pb.field_c = ll.a(0, var2);
                }
                var2 = bc.a("create_alert_email_unavailable", false);
                if (var2 != null) {
                  fl.field_a = ll.a(0, var2);
                }
                var2 = bc.a("create_alert_invaliddate", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_alert_invalidage", false);
                if (var2 != null) {
                  le.field_m = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("create_alert_yearrange", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("create_alert_mismatch", false);
                if (null != var2) {
                  hl.field_e = ll.a(0, var2);
                }
                var2 = bc.a("create_passwordvalid", false);
                if (null != var2) {
                  nb.field_a = ll.a(0, var2);
                }
                var2 = bc.a("create_emailvalid", false);
                if (var2 != null) {
                  vd.field_p = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("create_account_success", false);
                if (null != var2) {
                  sh.field_q = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("invalid_name", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("cannot_add_yourself", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("unable_to_add_friend", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("unable_to_add_ignore", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("unable_to_delete_friend", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("unable_to_delete_ignore", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("friendlistfull", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("friendlistdupe", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("friendnotfound", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("ignorelistfull", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("ignorelistdupe", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("ignorenotfound", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("removeignorefirst", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("removefriendfirst", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("enterfriend_add", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("enterfriend_del", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("enterignore_add", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("enterignore_del", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("text_removed_from_game", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("text_lobby_pleaselogin_free", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("opengl", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("sse", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("purejava", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("waitingfor_graphics", false);
                if (var2 != null) {
                  be.field_w = ll.a(0, var2);
                }
                var2 = bc.a("waitingfor_models", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("waitingfor_fonts", false);
                if (var2 != null) {
                  vb.field_a = ll.a(0, var2);
                }
                var2 = bc.a("waitingfor_soundeffects", false);
                if (null != var2) {
                  me.field_h = ll.a(0, var2);
                }
                var2 = bc.a("waitingfor_music", false);
                if (null != var2) {
                  od.field_b = ll.a(0, var2);
                }
                var2 = bc.a("waitingfor_instruments", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("waitingfor_levels", false);
                if (var2 != null) {
                  ej.field_R = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("waitingfor_extradata", false);
                if (null != var2) {
                  jj.field_d = ll.a(0, var2);
                }
                var2 = bc.a("waitingfor_languages", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("waitingfor_textures", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("waitingfor_animations", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("loading_graphics", false);
                if (null != var2) {
                  bl.field_d = ll.a(0, var2);
                }
                var2 = bc.a("loading_models", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("loading_fonts", false);
                if (null != var2) {
                  ki.field_S = ll.a(0, var2);
                }
                var2 = bc.a("loading_soundeffects", false);
                if (null != var2) {
                  rk.field_b = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("loading_music", false);
                if (var2 != null) {
                  q.field_Nb = ll.a(0, var2);
                }
                var2 = bc.a("loading_instruments", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("loading_levels", false);
                if (var2 != null) {
                  kl.field_b = ll.a(0, var2);
                }
                var2 = bc.a("loading_extradata", false);
                if (var2 != null) {
                  li.field_b = ll.a(0, var2);
                }
                var2 = bc.a("loading_languages", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("loading_textures", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("loading_animations", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("unpacking_graphics", false);
                if (var2 != null) {
                  qe.field_h = ll.a(0, var2);
                }
                var2 = bc.a("unpacking_models", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("unpacking_soundeffects", false);
                if (null != var2) {
                  ia.field_q = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("unpacking_music", false);
                if (null != var2) {
                  td.field_e = ll.a(0, var2);
                }
                var2 = bc.a("unpacking_levels", false);
                if (var2 != null) {
                  u.field_f = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("unpacking_languages", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("unpacking_animations", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("unpacking_toolkit", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("instructions", false);
                if (null != var2) {
                  a.field_e = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("tutorial", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("playtutorial", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("sound_colon", false);
                if (var2 != null) {
                  sk.field_d = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("music_colon", false);
                if (var2 != null) {
                  qb.field_d = ll.a(0, var2);
                }
                var2 = bc.a("fullscreen", false);
                if (null != var2) {
                  uj.field_a = ll.a(0, var2);
                }
                var2 = bc.a("screensize", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("highscores", false);
                if (null != var2) {
                  bj.field_h = ll.a(0, var2);
                }
                var2 = bc.a("rankings", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("achievements", false);
                if (var2 != null) {
                  ra.field_j = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("achievementsthisgame", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("achievementsthissession", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("watchintroduction", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("quit", false);
                if (var2 != null) {
                  kh.field_I = ll.a(0, var2);
                }
                var2 = bc.a("login_createaccount", false);
                if (null != var2) {
                  ck.field_c = ll.a(0, var2);
                }
                var2 = bc.a("tohighscores", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("returntomainmenu", false);
                if (var2 != null) {
                  g.field_qb = ll.a(0, var2);
                }
                var2 = bc.a("returntopausemenu", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("returntooptionsmenu_notpaused", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mainmenu", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("pausemenu", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("optionsmenu_notpaused", false);
                if (null != var2) {
                  c.field_d = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("menu", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("selectlevel", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("nextlevel", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("startgame", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("newgame", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("resumegame", false);
                if (null != var2) {
                  va.field_c = ll.a(0, var2);
                }
                var2 = bc.a("resumetutorial", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("skip", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("skiptutorial", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("skipending", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("restartlevel", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("endtest", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("endgame", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("endtutorial", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("ok", false);
                if (null != var2) {
                  r.field_lb = ll.a(0, var2);
                }
                var2 = bc.a("on", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("off", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("previous", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("prev", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("next", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("graphics_colon", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("hotseatmultiplayer", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("entermultiplayerlobby", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("singleplayergame", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("returntogame", false);
                if (var2 != null) {
                  ib.field_bb = ll.a(0, var2);
                }
                var2 = bc.a("endgameresign", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("offerdraw", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("canceldraw", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("acceptdraw", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
            }
            void runChunk2() throws java.lang.RuntimeException {
                var2 = bc.a("resign", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("returntolobby", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("cont", false);
                if (null != var2) {
                  rj.field_e = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("continue_spectating", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("messages", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("graphics_fastest", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("graphics_medium", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("graphics_best", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("graphics_directx", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("graphics_opengl", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("graphics_java", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("graphics_quality_high", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("graphics_quality_low", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("graphics_mode", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("graphics_quality", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mode", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("quality", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("keys", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("objective", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("currentobjective", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("pressescforpausemenu", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("pressescforpausemenuortoskiptutorial", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("pressescforoptionsmenu_doesntpause", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("pressescforoptionsmenu_doesntpause_short", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("powerups", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("latestlevel_suffix", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("unreachedlevel_name", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("unreachedlevel_cannotplayreason", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("unreachedlevel_cannotplayreason_shorter", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("unreachedworld_cannotplayreason", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("memberslevel_name", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("memberslevel_cannotplayreason", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("membersworld_cannotplayreason", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("unreachedlevel_createtip", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("unreachedlevel_createtip_line1", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("unreachedlevel_createtip_line2", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("unreachedlevel_logintip", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("memberslevel_logintip", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("displayname_none", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("levelxofy1", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("levelxofy2", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("levelxofy", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("ingame_level", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("mouseoveranicon", false);
                if (null != var2) {
                  kk.field_a = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("notyetachieved", false);
                if (var2 != null) {
                  hf.field_z = ll.a(0, var2);
                }
                var2 = bc.a("achieved", false);
                if (null != var2) {
                  cf.field_b = ll.a(0, var2);
                }
                var2 = bc.a("orbpoints", false);
                if (var2 != null) {
                  i.field_e = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("orbcoins", false);
                if (null != var2) {
                  vj.field_L = ll.a(0, var2);
                }
                var2 = bc.a("orbpoints_colon", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("orbcoins_colon", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("achieved_colon_description", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("secretachievement", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("no_highscores", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("hs_name", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("hs_level", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("hs_fromlevel", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("hs_tolevel", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("hs_score", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("hs_end", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("ingame_score", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("score_colon", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("mp_leavegame", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_offerrematch", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_offerrematch_unrated", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_acceptrematch", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("mp_acceptrematch_unrated", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_cancelrematch", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_cancelrematch_unrated", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_rematchnewgame", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_rematchnewgame_unrated", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_x_wantstodraw", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("mp_x_offersrematch", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_x_offersrematch_unrated", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("mp_youofferrematch", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("mp_youofferrematch_unrated", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_youofferdraw", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_youresigned", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_youresigned_rematch", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_x_hasresignedandleft", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_x_hasresigned_rematch", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("mp_x_hasresigned", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_x_hasleft", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_x_haswon", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_youhavewon", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("mp_gamedrawn", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_timeremaining", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_x_turn", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_yourturn", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("gameover", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_hidechat", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_showchat_nounread", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_showchat_unread1", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mp_showchat_unread2", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("click_to_quickchat", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("autorespond", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("quickchat_help", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("quickchat_help_title", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("quickchat_shortcut_help,0", false);
                if (var2 != null) {
                  sd.field_d[0] = ll.a(0, var2);
                }
                var2 = bc.a("quickchat_shortcut_help,1", false);
                if (null != var2) {
                  sd.field_d[1] = ll.a(sl.a(param0, 3), var2);
                }
                var2 = bc.a("quickchat_shortcut_help,2", false);
                if (var2 != null) {
                  sd.field_d[2] = ll.a(0, var2);
                }
                var2 = bc.a("quickchat_shortcut_help,3", false);
                if (null != var2) {
                  sd.field_d[3] = ll.a(sl.a(param0, 3), var2);
                }
                var2 = bc.a("quickchat_shortcut_help,4", false);
                if (null != var2) {
                  sd.field_d[4] = ll.a(sl.a(param0, 3), var2);
                }
                var2 = bc.a("quickchat_shortcut_help,5", false);
                if (var2 != null) {
                  sd.field_d[5] = ll.a(0, var2);
                }
                var2 = bc.a("quickchat_shortcut_keys,0", false);
                if (var2 != null) {
                  uh.field_J[0] = ll.a(0, var2);
                }
                var2 = bc.a("quickchat_shortcut_keys,1", false);
                if (var2 != null) {
                  uh.field_J[1] = ll.a(0, var2);
                }
                var2 = bc.a("quickchat_shortcut_keys,2", false);
                if (null != var2) {
                  uh.field_J[2] = ll.a(0, var2);
                }
                var2 = bc.a("quickchat_shortcut_keys,3", false);
                if (var2 != null) {
                  uh.field_J[3] = ll.a(sl.a(param0, 3), var2);
                }
                var2 = bc.a("quickchat_shortcut_keys,4", false);
                if (var2 != null) {
                  uh.field_J[4] = ll.a(0, var2);
                }
                var2 = bc.a("quickchat_shortcut_keys,5", false);
                if (var2 != null) {
                  uh.field_J[5] = ll.a(0, var2);
                }
                var2 = bc.a("keychar_the_character_under_questionmark", false);
                if (null != var2) {
                  im.a(var2[0], -24538);
                }
                var2 = bc.a("rating_noratings", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rating_rating", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rating_played", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rating_won", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rating_lost", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("rating_drawn", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("benefits_fullscreen", false);
                if (var2 != null) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("benefits_noadverts", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("benefits_price", false);
                if (null != var2) {
                  bj.field_b = ll.a(0, var2);
                }
                var2 = bc.a("members_expansion_benefits,0", false);
                if (var2 != null) {
                  ua.field_c[0] = ll.a(0, var2);
                }
                var2 = bc.a("members_expansion_benefits,1", false);
                if (var2 != null) {
                  ua.field_c[1] = ll.a(0, var2);
                }
                var2 = bc.a("members_expansion_benefits,2", false);
                if (null != var2) {
                  ua.field_c[2] = ll.a(0, var2);
                }
                var2 = bc.a("members_expansion_price_top", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("members_expansion_price_bottom", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("reconnect_lost_seq,0", false);
                if (null != var2) {
                  na.field_db[0] = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("reconnect_lost_seq,1", false);
                if (null != var2) {
                  na.field_db[1] = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("reconnect_lost_seq,2", false);
                if (var2 != null) {
                  na.field_db[2] = ll.a(sl.a(param0, 3), var2);
                }
                var2 = bc.a("reconnect_lost_seq,3", false);
                if (var2 != null) {
                  na.field_db[3] = ll.a(0, var2);
                }
                var2 = bc.a("reconnect_lost", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("reconnect_restored", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("reconnect_please_check", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("reconnect_wait", false);
                if (null != var2) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("reconnect_retry", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("reconnect_resume", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("reconnect_or", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("reconnect_exitfs", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("reconnect_exitfs_quit", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("reconnect_quit", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("reconnect_check_fs", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("reconnect_check_nonfs", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("fs_accept_beforeaccept", false);
                if (null != var2) {
                  p.field_c = ll.a(0, var2);
                }
                var2 = bc.a("fs_button_accept", false);
                if (var2 != null) {
                  r.field_o = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("fs_accept_afteraccept", false);
                if (var2 != null) {
                  ga.field_l = ll.a(0, var2);
                }
                var2 = bc.a("fs_button_cancel", false);
                if (null != var2) {
                  q.field_Ob = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("fs_accept_aftercancel", false);
                if (null != var2) {
                  ql.field_h = ll.a(0, var2);
                }
                var2 = bc.a("fs_accept_countdown_sing", false);
                if (var2 != null) {
                  hj.field_H = ll.a(0, var2);
                }
                var2 = bc.a("fs_accept_countdown_pl", false);
                if (var2 != null) {
                  wj.field_b = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("fs_nonmember", false);
                if (null != var2) {
                  jm.field_d = ll.a(0, var2);
                }
                var2 = bc.a("fs_button_close", false);
                if (var2 != null) {
                  te.field_e = ll.a(0, var2);
                }
                var2 = bc.a("fs_button_members", false);
                if (null != var2) {
                  ak.field_g = ll.a(0, var2);
                }
                var2 = bc.a("fs_unavailable", false);
                if (null != var2) {
                  tc.field_d = ll.a(0, var2);
                }
                var2 = bc.a("fs_unavailable_try_signed_applet", false);
                if (var2 != null) {
                  ra.field_h = ll.a(0, var2);
                }
                var2 = bc.a("fs_focus", false);
                if (null != var2) {
                  tb.field_i = ll.a(0, var2);
                }
                var2 = bc.a("fs_focus_or_resolution", false);
                if (var2 != null) {
                  nf.field_a = ll.a(0, var2);
                }
                var2 = bc.a("fs_timeout", false);
                if (null != var2) {
                  va.field_a = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("fs_button_tryagain", false);
                if (null != var2) {
                  mk.field_h = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("graphics_ui_fs_countdown", false);
                if (null != var2) {
                  ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("mb_caption_title", false);
                if (null != var2) {
                  sb.field_l = ll.a(0, var2);
                }
                var2 = bc.a("mb_including_gamename", false);
                if (var2 != null) {
                  ia.field_p = ll.a(0, var2);
                }
                var2 = bc.a("mb_full_access_1", false);
                if (null != var2) {
                  d.field_J = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("mb_full_access_2", false);
                if (null != var2) {
                  ga.field_a = ll.a(0, var2);
                }
                var2 = bc.a("mb_achievement_count_1", false);
                if (null != var2) {
                  uj.field_b = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("mb_achievement_count_2", false);
                if (var2 != null) {
                  bd.field_j = ll.a(0, var2);
                }
                var2 = bc.a("mb_exclusive_1", false);
                if (null != var2) {
                  sl.field_c = ll.a(0, var2);
                }
                var2 = bc.a("mb_exclusive_2", false);
                if (null != var2) {
                  nj.field_k = ll.a(param0 ^ 3, var2);
                }
                var2 = bc.a("me_extra_benefits", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("hs_friend_tip", false);
                if (var2 != null) {
                  sl.field_a = ll.a(0, var2);
                }
                var2 = bc.a("hs_friend_tip_multi", false);
                if (var2 != null) {
                  ll.a(param0 - 3, var2);
                }
                var2 = bc.a("hs_mode_name,0", false);
                if (var2 != null) {
                  rb.field_b[0] = ll.a(0, var2);
                }
                var2 = bc.a("hs_mode_name,1", false);
                if (var2 != null) {
                  rb.field_b[1] = ll.a(0, var2);
                }
                var2 = bc.a("hs_mode_name,2", false);
                if (var2 != null) {
                  rb.field_b[2] = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("rating_mode_name,0", false);
                if (var2 != null) {
                  im.field_d[0] = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("rating_mode_name,1", false);
                if (null != var2) {
                  im.field_d[1] = ll.a(0, var2);
                }
                var2 = bc.a("rating_mode_long_name,0", false);
                if (var2 != null) {
                  le.field_o[0] = ll.a(0, var2);
                }
                var2 = bc.a("rating_mode_long_name,1", false);
                if (null != var2) {
                  le.field_o[1] = ll.a(0, var2);
                }
                var2 = bc.a("graphics_config_fixed_size", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("graphics_config_resizable", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("graphics_config_fullscreen", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("graphics_config_done", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("graphics_config_apply", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("graphics_config_title", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("graphics_config_instruction", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("graphics_config_need_memory", false);
                if (var2 != null) {
                  ll.a(0, var2);
                }
                var2 = bc.a("pleasewait_dotdotdot", false);
                if (null != var2) {
                  vd.field_o = ll.a(0, var2);
                }
                var2 = bc.a("serviceunavailable", false);
                if (var2 != null) {
                  r.field_bb = ll.a(0, var2);
                }
                var2 = bc.a("createtouse", false);
                if (var2 != null) {
                  dd.field_N = ll.a(0, var2);
                }
                var2 = bc.a("achievementsoffline", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("warning", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("DEFAULT_PLAYER_NAME", false);
                if (var2 != null) {
                  hd.field_k = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("mustlogin1", false);
                if (var2 != null) {
                  qf.field_a = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin2,1", false);
                if (var2 != null) {
                  kf.field_e[1] = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("mustlogin2,2", false);
                if (null != var2) {
                  kf.field_e[2] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin2,3", false);
                if (null != var2) {
                  kf.field_e[3] = ll.a(sl.a(param0, 3), var2);
                }
                var2 = bc.a("mustlogin2,4", false);
                if (var2 != null) {
                  kf.field_e[4] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin2,5", false);
                if (null != var2) {
                  kf.field_e[5] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin2,6", false);
                if (null != var2) {
                  kf.field_e[6] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin2,7", false);
                if (var2 != null) {
                  kf.field_e[7] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin3,1", false);
                if (var2 != null) {
                  ai.field_d[1] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin3,2", false);
                if (var2 != null) {
                  ai.field_d[2] = ll.a(sl.a(param0, 3), var2);
                }
                var2 = bc.a("mustlogin3,3", false);
                if (null != var2) {
                  ai.field_d[3] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin3,4", false);
                if (null != var2) {
                  ai.field_d[4] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin3,5", false);
                if (null != var2) {
                  ai.field_d[5] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin3,6", false);
                if (null != var2) {
                  ai.field_d[6] = ll.a(sl.a(param0, 3), var2);
                }
                var2 = bc.a("mustlogin3,7", false);
                if (null != var2) {
                  ai.field_d[7] = ll.a(sl.a(param0, 3), var2);
                }
                var2 = bc.a("discard", false);
                if (null != var2) {
                  vf.field_b = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin4,1", false);
                if (var2 != null) {
                  ug.field_a[1] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin4,2", false);
                if (null != var2) {
                  ug.field_a[2] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin4,3", false);
                if (var2 != null) {
                  ug.field_a[3] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin4,4", false);
                if (null != var2) {
                  ug.field_a[4] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin4,5", false);
                if (null != var2) {
                  ug.field_a[5] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin4,6", false);
                if (null != var2) {
                  ug.field_a[6] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin4,7", false);
                if (null != var2) {
                  ug.field_a[7] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin_notloggedin", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                var2 = bc.a("mustlogin_alternate,1", false);
                if (null != var2) {
                  fc.field_k[1] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin_alternate,2", false);
                if (var2 != null) {
                  fc.field_k[2] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin_alternate,3", false);
                if (var2 != null) {
                  fc.field_k[3] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin_alternate,4", false);
                if (null != var2) {
                  fc.field_k[4] = ll.a(sl.a(param0, 3), var2);
                }
                var2 = bc.a("mustlogin_alternate,5", false);
                if (var2 != null) {
                  fc.field_k[5] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin_alternate,6", false);
                if (null != var2) {
                  fc.field_k[6] = ll.a(0, var2);
                }
                var2 = bc.a("mustlogin_alternate,7", false);
                if (null != var2) {
                  fc.field_k[7] = ll.a(0, var2);
                }
                var2 = bc.a("subscription_cost_monthly,0", false);
                if (null != var2) {
                  oe.field_b[0] = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("subscription_cost_monthly,1", false);
                if (null != var2) {
                  oe.field_b[1] = ll.a(0, var2);
                }
                var2 = bc.a("subscription_cost_monthly,2", false);
                if (var2 != null) {
                  oe.field_b[2] = ll.a(0, var2);
                }
                var2 = bc.a("subscription_cost_monthly,3", false);
                if (null != var2) {
                  oe.field_b[3] = ll.a(0, var2);
                }
                var2 = bc.a("subscription_cost_monthly,4", false);
                if (var2 != null) {
                  oe.field_b[4] = ll.a(0, var2);
                }
                var2 = bc.a("subscription_cost_monthly,5", false);
                if (var2 != null) {
                  oe.field_b[5] = ll.a(0, var2);
                }
                var2 = bc.a("subscription_cost_monthly,6", false);
                if (var2 != null) {
                  oe.field_b[6] = ll.a(sl.a(param0, 3), var2);
                }
                var2 = bc.a("subscription_cost_monthly,7", false);
                if (null != var2) {
                  oe.field_b[7] = ll.a(0, var2);
                }
                var2 = bc.a("subscription_cost_monthly,8", false);
                if (null != var2) {
                  oe.field_b[8] = ll.a(param0 - 3, var2);
                }
                var2 = bc.a("subscription_cost_monthly,9", false);
                if (var2 != null) {
                  oe.field_b[9] = ll.a(sl.a(param0, 3), var2);
                }
                var2 = bc.a("subscription_cost_monthly,10", false);
                if (null != var2) {
                  oe.field_b[10] = ll.a(0, var2);
                }
                var2 = bc.a("subscription_cost_monthly,11", false);
                if (null != var2) {
                  oe.field_b[11] = ll.a(0, var2);
                }
                var2 = bc.a("subscription_cost_monthly,12", false);
                if (var2 != null) {
                  oe.field_b[12] = ll.a(0, var2);
                }
                var2 = bc.a("sentence_separator", false);
                if (null != var2) {
                  ll.a(0, var2);
                }
                fh.field_d = null;
            }
            void run() {
                var3 = Terraphoenix.field_V;
                try {
                  runChunk0();
                  if (finished) return;
                  runChunk1();
                  if (finished) return;
                  runChunk2();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_2604_0 = (RuntimeException) (var2_ref);
                  stackIn_2604_1 = new StringBuilder().append("ij.A(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_2605_2 = "null";
                  } else {
                    stackIn_2605_2 = "{...}";
                  }
                  throw qk.a((Throwable) ((Object) stackIn_2604_0), ((StringBuilder) (Object) stackIn_2604_1).append(stackIn_2605_2).append(')').toString());
                }
                if (eh.field_j) {
                  var3++;
                  Terraphoenix.field_V = var3;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 0;
          if (param3 != 2) {
            ij.a(82, (fa) null);
          }
          if (param2) {
            var4_int += 4;
          }
          if (param1) {
            var4_int += 2;
          }
          if (param0) {
            var4_int++;
          }
          stackIn_15_0 = ai.field_d[var4_int];
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var4), "ij.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0) {
        RuntimeException runtimeException = null;
        aa var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var1 = (aa) (vl.field_i.b((byte) -79));
          if (var1 == null) {
            throw new IllegalStateException();
          }
          l.a(var1.field_p, var1.field_h, var1.field_q);
          l.c(var1.field_o, var1.field_i, var1.field_l, var1.field_n);
          if (param0) {
            field_a = (String[]) null;
          }
          var1.field_p = null;
          pb.field_a.a(var1, -16611);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) runtimeException), "ij.F(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_b = null;
          field_a = null;
          field_e = null;
          if (param0 <= 62) {
            ij.a((String[]) null, -80, (String) null);
          }
          field_c = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "ij.B(" + param0 + ')');
        }
    }

    static {
        field_c = "AW-2 PG";
        field_e = "Start new game";
        field_a = new String[]{"In-game icons", "<col=fcfe7f>OBJECTIVES<br></col>Your objectives will be shown next to this icon above the game console.", "<col=fcfe7f>SOLDIER<br></col>All your soldiers have this icon above their heads.", "<col=fcfe7f>ENEMY<br></col>If an enemy can be seen by the currently selected soldier, their icon will have a red ring around it.", "<col=fcfe7f>HIDDEN TARGET<br></col>This icon shows where you have previously seen an enemy but can no longer pinpoint their position.", "<col=fcfe7f>ALLIED SOLDIER<br></col>These icons denote uncontrollable allies. They will attempt to help you in your objectives.", "<col=fcfe7f>LEVEL ICONS<br></col>Icons with these markers around them are either above or below the current level."};
    }
}
