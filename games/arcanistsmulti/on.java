/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    static java.awt.Canvas field_c;
    static int field_g;
    static int field_h;
    String field_f;
    static String field_a;
    boolean field_j;
    String field_e;
    static String field_d;
    static String field_i;
    static String field_b;

    final static void a(int param0, int param1, boolean param2, boolean param3, ha param4) {
        io stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          stackIn_3_0 = gg.field_h;
          stackIn_4_1 = !(param2);
          ((io) (Object) stackIn_3_0).a(stackIn_4_1, 1000000, (byte) -85, param1, param0, param4);
          if (!param3) {
            field_b = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("on.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_c = null;
          if (param0 != 3) {
            on.a(-25);
          }
          field_b = null;
          field_i = null;
          field_a = null;
          field_d = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "on.D(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -26 % ((param2 + 32) / 53);
          if (param0 == 0) {
            if (param1 == 0) {
              stackIn_5_0 = 0;
              return stackIn_5_0;
            }
            if (param1 < 0) {
              stackIn_10_0 = -2048;
              return stackIn_10_0;
            }
            stackIn_8_0 = 2048;
            return stackIn_8_0;
          }
          if (param0 < 0) {
            if (param1 == 0) {
              stackIn_26_0 = 4096;
              return stackIn_26_0;
            }
            if (0 <= param1) {
              stackIn_31_0 = -cc.a(param1, -param0, -87) + 4096;
              return stackIn_31_0;
            }
            stackIn_29_0 = -4096 + cc.a(-param1, -param0, -110);
            return stackIn_29_0;
          }
          if (param1 == 0) {
            stackIn_16_0 = 0;
            return stackIn_16_0;
          }
          if (param1 < 0) {
            stackIn_21_0 = -cc.a(-param1, param0, -90);
            return stackIn_21_0;
          }
          stackIn_19_0 = cc.a(param1, param0, -127);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "on.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static long a(long param0, long param1) {
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          stackIn_1_0 = param0 & param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "on.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, eg param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_2624_0;
            StringBuilder stackIn_2624_1;
            String stackIn_2625_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            byte param0;
            eg param1;
            boolean finished;
            $CfrPartitionedBody(byte initialParam0, eg initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_2624_0 = null;
                this.stackIn_2624_1 = null;
                this.stackIn_2625_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                ld.field_q = param1;
                var2 = fg.a("loginm3", (byte) -45);
                if (null != var2) {
                  tg.field_a = sc.a((byte) 101, var2);
                }
                var2 = fg.a("loginm2", (byte) -45);
                if (var2 != null) {
                  wl.field_R = sc.a((byte) 100, var2);
                }
                var2 = fg.a("loginm1", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 123, var2);
                }
                var2 = fg.a("idlemessage20min", (byte) -45);
                if (null != var2) {
                  rl.field_j = sc.a((byte) 91, var2);
                }
                var2 = fg.a("error_js5crc", (byte) -45);
                if (null != var2) {
                  hn.field_e = sc.a((byte) 88, var2);
                }
                var2 = fg.a("error_js5io", (byte) -45);
                if (null != var2) {
                  le.field_N = sc.a((byte) 89, var2);
                }
                var2 = fg.a("error_js5connect_full", (byte) -45);
                if (var2 != null) {
                  ib.field_p = sc.a((byte) 109, var2);
                }
                var2 = fg.a("error_js5connect", (byte) -45);
                if (null != var2) {
                  dd.field_a = sc.a((byte) 99, var2);
                }
                var2 = fg.a("login_gameupdated", (byte) -45);
                if (var2 != null) {
                  s.field_d = sc.a((byte) 104, var2);
                }
                var2 = fg.a("create_unable", (byte) -45);
                if (null != var2) {
                  fo.field_c = sc.a((byte) 90, var2);
                }
                var2 = fg.a("create_ineligible", (byte) -45);
                if (null != var2) {
                  g.field_c = sc.a((byte) 97, var2);
                }
                var2 = fg.a("usernameprompt", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 97, var2);
                }
                var2 = fg.a("passwordprompt", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 116, var2);
                }
                var2 = fg.a("andagainprompt", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 117, var2);
                }
                var2 = fg.a("ticketing_read", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 117, var2);
                }
                var2 = fg.a("ticketing_ignore", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 90, var2);
                }
                var2 = fg.a("ticketing_oneunread", (byte) -45);
                if (var2 != null) {
                  re.field_k = sc.a((byte) 105, var2);
                }
                var2 = fg.a("ticketing_xunread", (byte) -45);
                if (null != var2) {
                  sk.field_g = sc.a((byte) 127, var2);
                }
                var2 = fg.a("ticketing_gotowebsite", (byte) -45);
                if (var2 != null) {
                  nl.field_Hb = sc.a((byte) 127, var2);
                }
                var2 = fg.a("ticketing_waitingformessages", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 99, var2);
                }
                var2 = fg.a("mu_chat_on", (byte) -45);
                if (var2 != null) {
                  nb.field_e = sc.a((byte) 114, var2);
                }
                var2 = fg.a("mu_chat_friends", (byte) -45);
                if (null != var2) {
                  u.field_d = sc.a((byte) 93, var2);
                }
                var2 = fg.a("mu_chat_off", (byte) -45);
                if (null != var2) {
                  ag.field_A = sc.a((byte) 87, var2);
                }
                var2 = fg.a("mu_chat_lobby", (byte) -45);
                if (var2 != null) {
                  lj.field_p = sc.a((byte) 92, var2);
                }
                var2 = fg.a("mu_chat_public", (byte) -45);
                if (null != var2) {
                  qm.field_m = sc.a((byte) 106, var2);
                }
                var2 = fg.a("mu_chat_ignore", (byte) -45);
                if (null != var2) {
                  lm.field_g = sc.a((byte) 99, var2);
                }
                var2 = fg.a("mu_chat_tips", (byte) -45);
                if (var2 != null) {
                  ab.field_r = sc.a((byte) 117, var2);
                }
                var2 = fg.a("mu_chat_game", (byte) -45);
                if (var2 != null) {
                  ec.field_b = sc.a((byte) 120, var2);
                }
                var2 = fg.a("mu_chat_private", (byte) -45);
                if (var2 != null) {
                  he.field_c = sc.a((byte) 117, var2);
                }
                var2 = fg.a("mu_x_entered_game", (byte) -45);
                if (null != var2) {
                  kb.field_e = sc.a((byte) 101, var2);
                }
                var2 = fg.a("mu_x_joined_your_game", (byte) -45);
                if (var2 != null) {
                  rj.field_h = sc.a((byte) 126, var2);
                }
                var2 = fg.a("mu_x_entered_other_game", (byte) -45);
                if (var2 != null) {
                  ij.field_Gb = sc.a((byte) 114, var2);
                }
                var2 = fg.a("mu_x_left_lobby", (byte) -45);
                if (var2 != null) {
                  q.field_M = sc.a((byte) 109, var2);
                }
                var2 = fg.a("mu_x_lost_con", (byte) -45);
                if (var2 != null) {
                  gm.field_n = sc.a((byte) 127, var2);
                }
                var2 = fg.a("mu_x_cannot_join_full", (byte) -45);
                if (null != var2) {
                  b.field_b = sc.a((byte) 90, var2);
                }
                var2 = fg.a("mu_x_cannot_join_inprogress", (byte) -45);
                if (null != var2) {
                  ho.field_d = sc.a((byte) 115, var2);
                }
                var2 = fg.a("mu_x_declined_invite", (byte) -45);
                if (var2 != null) {
                  c.field_c = sc.a((byte) 103, var2);
                }
                var2 = fg.a("mu_x_withdrew_request", (byte) -45);
                if (null != var2) {
                  ui.field_w = sc.a((byte) 92, var2);
                }
                var2 = fg.a("mu_x_removed", (byte) -45);
                if (null != var2) {
                  so.field_n = sc.a((byte) 122, var2);
                }
                var2 = fg.a("mu_x_dropped_out", (byte) -45);
                if (var2 != null) {
                  qo.field_d = sc.a((byte) 98, var2);
                }
                var2 = fg.a("mu_entered_other_game", (byte) -45);
                if (null != var2) {
                  fm.field_a = sc.a((byte) 112, var2);
                }
                var2 = fg.a("mu_game_is_full", (byte) -45);
                if (null != var2) {
                  rf.field_k = sc.a((byte) 118, var2);
                }
                var2 = fg.a("mu_game_has_started", (byte) -45);
                if (null != var2) {
                  mm.field_v = sc.a((byte) 102, var2);
                }
                var2 = fg.a("mu_you_declined_invite", (byte) -45);
                if (var2 != null) {
                  mf.field_f = sc.a((byte) 90, var2);
                }
                var2 = fg.a("mu_invite_withdrawn", (byte) -45);
                if (var2 != null) {
                  v.field_n = sc.a((byte) 127, var2);
                }
                var2 = fg.a("mu_request_declined", (byte) -45);
                if (null != var2) {
                  oj.field_c = sc.a((byte) 123, var2);
                }
                var2 = fg.a("mu_request_withdrawn", (byte) -45);
                if (null != var2) {
                  wd.field_f = sc.a((byte) 107, var2);
                }
                var2 = fg.a("mu_all_players_have_left", (byte) -45);
                if (var2 != null) {
                  ji.field_k = sc.a((byte) 122, var2);
                }
                var2 = fg.a("mu_lobby_name", (byte) -45);
                if (null != var2) {
                  hb.field_Bb = sc.a((byte) 113, var2);
                }
                var2 = fg.a("mu_lobby_rating", (byte) -45);
                if (var2 != null) {
                  ef.field_q = sc.a((byte) 100, var2);
                }
                var2 = fg.a("mu_lobby_friend_add", (byte) -45);
                if (var2 != null) {
                  ln.field_T = sc.a((byte) 121, var2);
                }
                var2 = fg.a("mu_lobby_friend_rm", (byte) -45);
                if (null != var2) {
                  vk.field_z = sc.a((byte) 96, var2);
                }
                var2 = fg.a("mu_lobby_name_add", (byte) -45);
                if (null != var2) {
                  dm.field_I = sc.a((byte) 92, var2);
                }
                var2 = fg.a("mu_lobby_name_rm", (byte) -45);
                if (null != var2) {
                  wl.field_M = sc.a((byte) 113, var2);
                }
                var2 = fg.a("mu_lobby_location", (byte) -45);
                if (null != var2) {
                  hc.field_d = sc.a((byte) 98, var2);
                }
                var2 = fg.a("mu_gamelist_all_games", (byte) -45);
                if (var2 != null) {
                  hb.field_Ib = sc.a((byte) 113, var2);
                }
                var2 = fg.a("mu_gamelist_status", (byte) -45);
                if (var2 != null) {
                  of.field_k = sc.a((byte) 118, var2);
                }
                var2 = fg.a("mu_gamelist_owner", (byte) -45);
                if (null != var2) {
                  lc.field_c = sc.a((byte) 87, var2);
                }
                var2 = fg.a("mu_gamelist_players", (byte) -45);
                if (var2 != null) {
                  ba.field_c = sc.a((byte) 106, var2);
                }
                var2 = fg.a("mu_gamelist_avg_rating", (byte) -45);
                if (null != var2) {
                  dk.field_h = sc.a((byte) 125, var2);
                }
                var2 = fg.a("mu_gamelist_options", (byte) -45);
                if (var2 != null) {
                  g.field_b = sc.a((byte) 111, var2);
                }
                var2 = fg.a("mu_gamelist_elapsed_time", (byte) -45);
                if (var2 != null) {
                  kh.field_a = sc.a((byte) 122, var2);
                }
                var2 = fg.a("mu_play_rated", (byte) -45);
                if (null != var2) {
                  fi.field_f = sc.a((byte) 91, var2);
                }
                var2 = fg.a("mu_create_unrated", (byte) -45);
                if (var2 != null) {
                  ga.field_t = sc.a((byte) 119, var2);
                }
                var2 = fg.a("mu_options", (byte) -45);
                if (var2 != null) {
                  o.field_o = sc.a((byte) 108, var2);
                }
                var2 = fg.a("mu_options_whocanjoin", (byte) -45);
                if (null != var2) {
                  gg.field_i = sc.a((byte) 100, var2);
                }
                var2 = fg.a("mu_options_players", (byte) -45);
                if (var2 != null) {
                  w.field_Bb = sc.a((byte) 111, var2);
                }
                var2 = fg.a("mu_options_dontmind", (byte) -45);
                if (null != var2) {
                  ij.field_Rb = sc.a((byte) 116, var2);
                }
                var2 = fg.a("mu_options_allow_spectate", (byte) -45);
                if (null != var2) {
                  gb.field_b = sc.a((byte) 101, var2);
                }
                var2 = fg.a("mu_options_ratedgametype", (byte) -45);
                if (var2 != null) {
                  fm.field_e = sc.a((byte) 122, var2);
                }
                var2 = fg.a("yes", (byte) -45);
                if (null != var2) {
                  cf.field_d = sc.a((byte) 110, var2);
                }
                var2 = fg.a("no", (byte) -45);
                if (null != var2) {
                  nh.field_B = sc.a((byte) 95, var2);
                }
                var2 = fg.a("mu_invite_players", (byte) -45);
                if (var2 != null) {
                  mb.field_O = sc.a((byte) 107, var2);
                }
                var2 = fg.a("close", (byte) -45);
                if (var2 != null) {
                  f.field_i = sc.a((byte) 92, var2);
                }
                var2 = fg.a("add_x_to_friends", (byte) -45);
                if (var2 != null) {
                  ArcanistsMulti.field_F = sc.a((byte) 87, var2);
                }
                var2 = fg.a("add_x_to_ignore", (byte) -45);
                if (var2 != null) {
                  tn.field_Lb = sc.a((byte) 107, var2);
                }
                var2 = fg.a("rm_x_from_friends", (byte) -45);
                if (null != var2) {
                  ke.field_F = sc.a((byte) 126, var2);
                }
                var2 = fg.a("rm_x_from_ignore", (byte) -45);
                if (var2 != null) {
                  ja.field_t = sc.a((byte) 112, var2);
                }
                var2 = fg.a("send_pm_to_x", (byte) -45);
                if (null != var2) {
                  mb.field_S = sc.a((byte) 93, var2);
                }
                var2 = fg.a("send_qc_to_x", (byte) -45);
                if (null != var2) {
                  bh.field_b = sc.a((byte) 123, var2);
                }
                var2 = fg.a("send_pm", (byte) -45);
                if (var2 != null) {
                  ji.field_e = sc.a((byte) 102, var2);
                }
                var2 = fg.a("invite_accept_xs_game", (byte) -45);
                if (null != var2) {
                  na.field_Sb = sc.a((byte) 125, var2);
                }
                var2 = fg.a("invite_decline_xs_game", (byte) -45);
                if (null != var2) {
                  mk.field_I = sc.a((byte) 93, var2);
                }
                var2 = fg.a("join_xs_game", (byte) -45);
                if (null != var2) {
                  ec.field_a = sc.a((byte) 87, var2);
                }
                var2 = fg.a("join_request_xs_game", (byte) -45);
                if (var2 != null) {
                  bm.field_i = sc.a((byte) 90, var2);
                }
                var2 = fg.a("join_withdraw_request_xs_game", (byte) -45);
                if (var2 != null) {
                  hl.field_h = sc.a((byte) 121, var2);
                }
                var2 = fg.a("mu_gameopt_kick_x_from_this_game", (byte) -45);
                if (var2 != null) {
                  gg.field_a = sc.a((byte) 111, var2);
                }
                var2 = fg.a("mu_gameopt_withdraw_invite_to_x", (byte) -45);
                if (null != var2) {
                  na.field_gc = sc.a((byte) 87, var2);
                }
                var2 = fg.a("mu_gameopt_accept_x_into_game", (byte) -45);
                if (null != var2) {
                  se.field_L = sc.a((byte) 89, var2);
                }
                var2 = fg.a("mu_gameopt_reject_x_from_game", (byte) -45);
                if (null != var2) {
                  gh.field_z = sc.a((byte) 92, var2);
                }
                var2 = fg.a("mu_gameopt_invite_x_to_game", (byte) -45);
                if (null != var2) {
                  nh.field_x = sc.a((byte) 123, var2);
                }
                var2 = fg.a("report_x_for_abuse", (byte) -45);
                if (null != var2) {
                  ad.field_b = sc.a((byte) 121, var2);
                }
                var2 = fg.a("unable_to_send_message_password_a", (byte) -45);
                if (null != var2) {
                  cd.field_q = sc.a((byte) 106, var2);
                }
                var2 = fg.a("unable_to_send_message_password_b", (byte) -45);
                if (var2 != null) {
                  rg.field_b = sc.a((byte) 120, var2);
                }
                var2 = fg.a("mu_chat_lobby_show_all", (byte) -45);
                if (var2 != null) {
                  oh.field_q = sc.a((byte) 124, var2);
                }
                var2 = fg.a("mu_chat_lobby_friends_only", (byte) -45);
                if (null != var2) {
                  fg.field_g = sc.a((byte) 107, var2);
                }
                var2 = fg.a("mu_chat_lobby_friends", (byte) -45);
                if (var2 != null) {
                  cj.field_c = sc.a((byte) 114, var2);
                }
                var2 = fg.a("mu_chat_lobby_hide", (byte) -45);
                if (var2 != null) {
                  jg.field_j = sc.a((byte) 93, var2);
                }
                var2 = fg.a("mu_chat_game_show_all", (byte) -45);
                if (var2 != null) {
                  ug.field_f = sc.a((byte) 86, var2);
                }
                var2 = fg.a("mu_chat_game_friends_only", (byte) -45);
                if (null != var2) {
                  go.field_a = sc.a((byte) 115, var2);
                }
                var2 = fg.a("mu_chat_game_friends", (byte) -45);
                if (null != var2) {
                  wa.field_Hb = sc.a((byte) 103, var2);
                }
                var2 = fg.a("mu_chat_game_hide", (byte) -45);
                if (var2 != null) {
                  dm.field_J = sc.a((byte) 109, var2);
                }
                var2 = fg.a("mu_chat_pm_show_all", (byte) -45);
                if (var2 != null) {
                  w.field_Jb = sc.a((byte) 119, var2);
                }
                var2 = fg.a("mu_chat_pm_friends_only", (byte) -45);
                if (null != var2) {
                  va.field_d = sc.a((byte) 90, var2);
                }
                var2 = fg.a("mu_chat_pm_friends", (byte) -45);
                if (null != var2) {
                  lk.field_l = sc.a((byte) 90, var2);
                }
                var2 = fg.a("mu_chat_invisible_and_silent_mode", (byte) -45);
                if (null != var2) {
                  ol.field_c = sc.a((byte) 121, var2);
                }
                var2 = fg.a("you_have_been_removed_from_xs_game", (byte) -45);
                if (var2 != null) {
                  i.field_b = sc.a((byte) 105, var2);
                }
                var2 = fg.a("your_rating_is_x", (byte) -45);
                if (var2 != null) {
                  gi.field_j = sc.a((byte) 89, var2);
                }
                var2 = fg.a("you_are_on_x_server", (byte) -45);
                if (var2 != null) {
                  e.field_C = sc.a((byte) 126, var2);
                }
                var2 = fg.a("rated_game", (byte) -45);
                if (null != var2) {
                  ri.field_c = sc.a((byte) 116, var2);
                }
                var2 = fg.a("unrated_game", (byte) -45);
                if (var2 != null) {
                  n.field_h = sc.a((byte) 91, var2);
                }
                var2 = fg.a("rated_game_tips", (byte) -45);
                if (null != var2) {
                  j.field_e = sc.a((byte) 102, var2);
                }
                var2 = fg.a("searching_for_opponent_singular", (byte) -45);
                if (var2 != null) {
                  ql.field_e = sc.a((byte) 113, var2);
                }
                var2 = fg.a("searching_for_opponents_plural", (byte) -45);
                if (null != var2) {
                  bb.field_f = sc.a((byte) 94, var2);
                }
                var2 = fg.a("find_opponent_singular", (byte) -45);
                if (var2 != null) {
                  ah.field_d = sc.a((byte) 113, var2);
                }
                var2 = fg.a("find_opponents_plural", (byte) -45);
                if (null != var2) {
                  fi.field_b = sc.a((byte) 109, var2);
                }
                var2 = fg.a("rated_game_tips_setup_singular", (byte) -45);
                if (null != var2) {
                  bi.field_W = sc.a((byte) 91, var2);
                }
                var2 = fg.a("rated_game_tips_setup_plural", (byte) -45);
                if (var2 != null) {
                  km.field_g = sc.a((byte) 110, var2);
                }
                var2 = fg.a("waiting_to_start_hint", (byte) -45);
                if (null != var2) {
                  me.field_R = sc.a((byte) 126, var2);
                }
                var2 = fg.a("your_game", (byte) -45);
                if (null != var2) {
                  fb.field_c = sc.a((byte) 94, var2);
                }
                var2 = fg.a("game_full", (byte) -45);
                if (var2 != null) {
                  ck.field_f = sc.a((byte) 97, var2);
                }
                var2 = fg.a("join_requests_one", (byte) -45);
                if (var2 != null) {
                  qk.field_pb = sc.a((byte) 99, var2);
                }
                var2 = fg.a("join_requests_many", (byte) -45);
                if (var2 != null) {
                  mm.field_y = sc.a((byte) 100, var2);
                }
                var2 = fg.a("xs_game", (byte) -45);
                if (var2 != null) {
                  ul.field_j = sc.a((byte) 87, var2);
                }
                var2 = fg.a("waiting_for_x_to_start_game", (byte) -45);
                if (null != var2) {
                  uf.field_b = sc.a((byte) 105, var2);
                }
                var2 = fg.a("game_options_changed", (byte) -45);
                if (null != var2) {
                  ef.field_v = sc.a((byte) 107, var2);
                }
                var2 = fg.a("players_x_of_y", (byte) -45);
                if (null != var2) {
                  ug.field_h = sc.a((byte) 103, var2);
                }
                var2 = fg.a("message_lobby", (byte) -45);
                if (null != var2) {
                  jd.field_i = sc.a((byte) 103, var2);
                }
                var2 = fg.a("quickchat_lobby", (byte) -45);
                if (var2 != null) {
                  lk.field_h = sc.a((byte) 114, var2);
                }
                var2 = fg.a("message_game", (byte) -45);
                if (null != var2) {
                  vk.field_v = sc.a((byte) 100, var2);
                }
                var2 = fg.a("message_team", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 113, var2);
                }
                var2 = fg.a("quickchat_game", (byte) -45);
                if (var2 != null) {
                  ef.field_s = sc.a((byte) 89, var2);
                }
                var2 = fg.a("kick", (byte) -45);
                if (var2 != null) {
                  ej.field_L = sc.a((byte) 127, var2);
                }
                var2 = fg.a("inviting_x", (byte) -45);
                if (null != var2) {
                  mf.field_h = sc.a((byte) 124, var2);
                }
                var2 = fg.a("x_wants_to_join", (byte) -45);
                if (null != var2) {
                  rl.field_n = sc.a((byte) 109, var2);
                }
                var2 = fg.a("accept", (byte) -45);
                if (null != var2) {
                  dh.field_Nb = sc.a((byte) 108, var2);
                }
                var2 = fg.a("reject", (byte) -45);
                if (var2 != null) {
                  qc.field_f = sc.a((byte) 114, var2);
                }
                var2 = fg.a("invite", (byte) -45);
                if (var2 != null) {
                  ah.field_a = sc.a((byte) 107, var2);
                }
                var2 = fg.a("status_concluded", (byte) -45);
                if (var2 != null) {
                  nh.field_y = sc.a((byte) 106, var2);
                }
                var2 = fg.a("status_spectate", (byte) -45);
                if (null != var2) {
                  ol.field_b = sc.a((byte) 93, var2);
                }
                var2 = fg.a("status_playing", (byte) -45);
                if (null != var2) {
                  kl.field_x = sc.a((byte) 118, var2);
                }
                var2 = fg.a("status_join", (byte) -45);
                if (null != var2) {
                  qn.field_pb = sc.a((byte) 122, var2);
                }
                var2 = fg.a("status_private", (byte) -45);
                if (null != var2) {
                  ti.field_C = sc.a((byte) 105, var2);
                }
                var2 = fg.a("status_full", (byte) -45);
                if (null != var2) {
                  lo.field_z = sc.a((byte) 125, var2);
                }
                var2 = fg.a("players_in_game", (byte) -45);
                if (null != var2) {
                  ad.field_a = sc.a((byte) 94, var2);
                }
                var2 = fg.a("you_are_invited_to_xs_game", (byte) -45);
                if (var2 != null) {
                  dk.field_i = sc.a((byte) 119, var2);
                }
                var2 = fg.a("asking_to_join_xs_game", (byte) -45);
                if (null != var2) {
                  fh.field_f = sc.a((byte) 117, var2);
                }
                var2 = fg.a("who_can_join", (byte) -45);
                if (null != var2) {
                  field_a = sc.a((byte) 114, var2);
                }
                var2 = fg.a("you_can_join", (byte) -45);
                if (null != var2) {
                  qo.field_g = sc.a((byte) 94, var2);
                }
                var2 = fg.a("you_can_ask_to_join", (byte) -45);
                if (var2 != null) {
                  fi.field_g = sc.a((byte) 104, var2);
                }
                var2 = fg.a("you_cannot_join_in_progress", (byte) -45);
                if (var2 != null) {
                  pc.field_c = sc.a((byte) 101, var2);
                }
                var2 = fg.a("you_can_spectate", (byte) -45);
                if (var2 != null) {
                  sk.field_d = sc.a((byte) 125, var2);
                }
                var2 = fg.a("you_can_not_spectate", (byte) -45);
                if (null != var2) {
                  bh.field_d = sc.a((byte) 110, var2);
                }
                var2 = fg.a("spectate_xs_game", (byte) -45);
                if (var2 != null) {
                  gm.field_i = sc.a((byte) 93, var2);
                }
                var2 = fg.a("hide_players_in_xs_game", (byte) -45);
                if (null != var2) {
                  rc.field_o = sc.a((byte) 89, var2);
                }
                var2 = fg.a("show_players_in_xs_game", (byte) -45);
                if (null != var2) {
                  rd.field_f = sc.a((byte) 107, var2);
                }
                var2 = fg.a("connecting_to_friend_server_twoline", (byte) -45);
                if (var2 != null) {
                  le.field_db = sc.a((byte) 87, var2);
                }
                var2 = fg.a("loading", (byte) -45);
                if (null != var2) {
                  hn.field_l = sc.a((byte) 102, var2);
                }
                var2 = fg.a("offline", (byte) -45);
                if (var2 != null) {
                  nk.field_o = sc.a((byte) 115, var2);
                }
                var2 = fg.a("multiconst_invite_only", (byte) -45);
                if (var2 != null) {
                  wm.field_F = sc.a((byte) 117, var2);
                }
                var2 = fg.a("multiconst_clan", (byte) -45);
                if (var2 != null) {
                  ne.field_a = sc.a((byte) 88, var2);
                }
                var2 = fg.a("multiconst_friends", (byte) -45);
                if (var2 != null) {
                  um.field_d = sc.a((byte) 99, var2);
                }
                var2 = fg.a("multiconst_similar_rating", (byte) -45);
                if (var2 != null) {
                  lj.field_m = sc.a((byte) 110, var2);
                }
                var2 = fg.a("multiconst_open", (byte) -45);
                if (null != var2) {
                  io.field_C = sc.a((byte) 118, var2);
                }
                var2 = fg.a("no_options_available", (byte) -45);
                if (var2 != null) {
                  db.field_c = sc.a((byte) 118, var2);
                }
                var2 = fg.a("reportabuse", (byte) -45);
                if (var2 != null) {
                  qn.field_nb = sc.a((byte) 127, var2);
                }
                var2 = fg.a("presstabtochat", (byte) -45);
                if (null != var2) {
                  aj.field_i = sc.a((byte) 112, var2);
                }
                var2 = fg.a("pressf10toquickchat", (byte) -45);
                if (null != var2) {
                  ra.field_l = sc.a((byte) 121, var2);
                }
                var2 = fg.a("dob_chatdisabled", (byte) -45);
                if (null != var2) {
                  rk.field_N = sc.a((byte) 113, var2);
                }
                var2 = fg.a("dob_enterforchat", (byte) -45);
                if (null != var2) {
                  sm.field_b = sc.a((byte) 119, var2);
                }
                var2 = fg.a("tab_hidechattemporarily", (byte) -45);
                if (null != var2) {
                  fe.field_k = sc.a((byte) 89, var2);
                }
                var2 = fg.a("esc_cancelprivatemessage", (byte) -45);
                if (var2 != null) {
                  dk.field_b = sc.a((byte) 94, var2);
                }
                var2 = fg.a("esc_cancelthisline", (byte) -45);
                if (var2 != null) {
                  um.field_e = sc.a((byte) 103, var2);
                }
                var2 = fg.a("privatequickchat_from_x", (byte) -45);
                if (null != var2) {
                  pk.field_f = sc.a((byte) 110, var2);
                }
                var2 = fg.a("privatequickchat_to_x", (byte) -45);
                if (var2 != null) {
                  ge.field_n = sc.a((byte) 86, var2);
                }
                var2 = fg.a("privatechat_blankarea_explanation", (byte) -45);
                if (var2 != null) {
                  tn.field_Db = sc.a((byte) 109, var2);
                }
                var2 = fg.a("publicchat_unavailable_ratedgame", (byte) -45);
                if (var2 != null) {
                  fn.field_i = sc.a((byte) 99, var2);
                }
                var2 = fg.a("privatechat_friend_offline", (byte) -45);
                if (var2 != null) {
                  oo.field_m = sc.a((byte) 98, var2);
                }
                var2 = fg.a("privatechat_friend_notlisted", (byte) -45);
                if (var2 != null) {
                  qc.field_b = sc.a((byte) 91, var2);
                }
                var2 = fg.a("chatviewscrolledup", (byte) -45);
                if (null != var2) {
                  oa.field_a = sc.a((byte) 104, var2);
                }
                var2 = fg.a("thisisrunescapeclan", (byte) -45);
                if (null != var2) {
                  vh.field_m = sc.a((byte) 102, var2);
                }
                var2 = fg.a("thisisrunescapeclan_notowner", (byte) -45);
                if (var2 != null) {
                  ed.field_tb = sc.a((byte) 120, var2);
                }
                var2 = fg.a("runescapeclan", (byte) -45);
                if (var2 != null) {
                  n.field_c = sc.a((byte) 121, var2);
                }
                var2 = fg.a("rated_membersonly", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 89, var2);
                }
                var2 = fg.a("gameopt_membersonly", (byte) -45);
                if (var2 != null) {
                  ff.field_g = sc.a((byte) 96, var2);
                }
                var2 = fg.a("gameopt_1moreratedgame", (byte) -45);
                if (var2 != null) {
                  ta.field_a = sc.a((byte) 112, var2);
                }
                var2 = fg.a("gameopt_moreratedgames", (byte) -45);
                if (null != var2) {
                  wa.field_Db = sc.a((byte) 101, var2);
                }
                var2 = fg.a("gameopt_needrating", (byte) -45);
                if (null != var2) {
                  hf.field_m = sc.a((byte) 94, var2);
                }
                var2 = fg.a("gameopt_unratedonly", (byte) -45);
                if (var2 != null) {
                  kl.field_D = sc.a((byte) 117, var2);
                }
                var2 = fg.a("gameopt_notunlocked", (byte) -45);
                if (null != var2) {
                  ji.field_a = sc.a((byte) 91, var2);
                }
                var2 = fg.a("gameopt_cannotbecombined1", (byte) -45);
                if (var2 != null) {
                  gf.field_jb = sc.a((byte) 87, var2);
                }
                var2 = fg.a("gameopt_cannotbecombined2", (byte) -45);
                if (var2 != null) {
                  qk.field_qb = sc.a((byte) 88, var2);
                }
                var2 = fg.a("gameopt_playernotmember", (byte) -45);
                if (var2 != null) {
                  qm.field_p = sc.a((byte) 93, var2);
                }
                var2 = fg.a("gameopt_younotmember", (byte) -45);
                if (var2 != null) {
                  wl.field_P = sc.a((byte) 120, var2);
                }
                var2 = fg.a("gameopt_playerneedsrating", (byte) -45);
                if (var2 != null) {
                  um.field_c = sc.a((byte) 121, var2);
                }
                var2 = fg.a("gameopt_youneedrating", (byte) -45);
                if (var2 != null) {
                  to.field_n = sc.a((byte) 111, var2);
                }
                var2 = fg.a("gameopt_playerneedsratedgames", (byte) -45);
                if (null != var2) {
                  s.field_b = sc.a((byte) 97, var2);
                }
                var2 = fg.a("gameopt_youneedratedgames", (byte) -45);
                if (var2 != null) {
                  df.field_A = sc.a((byte) 105, var2);
                }
                var2 = fg.a("gameopt_playerneeds1ratedgame", (byte) -45);
                if (var2 != null) {
                  nm.field_g = sc.a((byte) 106, var2);
                }
                var2 = fg.a("gameopt_youneed1ratedgame", (byte) -45);
                if (null != var2) {
                  kj.field_a = sc.a((byte) 103, var2);
                }
                var2 = fg.a("gameopt_playerhasntunlocked", (byte) -45);
                if (null != var2) {
                  nm.field_a = sc.a((byte) 87, var2);
                }
                var2 = fg.a("gameopt_youhaventunlocked", (byte) -45);
                if (null != var2) {
                  cg.field_Rb = sc.a((byte) 99, var2);
                }
                var2 = fg.a("gameopt_trychanging1", (byte) -45);
                if (null != var2) {
                  vg.field_t = sc.a((byte) 116, var2);
                }
                var2 = fg.a("gameopt_trychanging2", (byte) -45);
                if (var2 != null) {
                  ie.field_Ub = sc.a((byte) 93, var2);
                }
                var2 = fg.a("gameopt_needchanging1", (byte) -45);
                if (null != var2) {
                  wl.field_I = sc.a((byte) 93, var2);
                }
                var2 = fg.a("gameopt_needchanging2", (byte) -45);
                if (null != var2) {
                  bd.field_d = sc.a((byte) 105, var2);
                }
                var2 = fg.a("gameopt_mightchange", (byte) -45);
                if (var2 != null) {
                  tl.field_c = sc.a((byte) 105, var2);
                }
            }
            void runChunk1() throws java.lang.RuntimeException {
                var2 = fg.a("gameopt_playersdontqualify", (byte) -45);
                if (var2 != null) {
                  ea.field_G = sc.a((byte) 107, var2);
                }
                var2 = fg.a("gameopt_playersdontqualify_selectgametab", (byte) -45);
                if (null != var2) {
                  q.field_O = sc.a((byte) 91, var2);
                }
                var2 = fg.a("gameopt_unselectedoptions", (byte) -45);
                if (var2 != null) {
                  hd.field_c = sc.a((byte) 89, var2);
                }
                var2 = fg.a("gameopt_pleaseselectoption1", (byte) -45);
                if (null != var2) {
                  fo.field_b = sc.a((byte) 95, var2);
                }
                var2 = fg.a("gameopt_pleaseselectoption2", (byte) -45);
                if (null != var2) {
                  rf.field_g = sc.a((byte) 106, var2);
                }
                var2 = fg.a("gameopt_badnumplayers", (byte) -45);
                if (var2 != null) {
                  field_i = sc.a((byte) 117, var2);
                }
                var2 = fg.a("gameopt_inviteplayers_or_trychanging1", (byte) -45);
                if (var2 != null) {
                  hb.field_Hb = sc.a((byte) 104, var2);
                }
                var2 = fg.a("gameopt_inviteplayers_or_trychanging2", (byte) -45);
                if (null != var2) {
                  oj.field_d = sc.a((byte) 96, var2);
                }
                var2 = fg.a("gameopt_novalidcombos", (byte) -45);
                if (null != var2) {
                  nm.field_f = sc.a((byte) 122, var2);
                }
                var2 = fg.a("gameopt_pleasetrychanging", (byte) -45);
                if (null != var2) {
                  cd.field_s = sc.a((byte) 106, var2);
                }
                var2 = fg.a("ra_title", (byte) -45);
                if (var2 != null) {
                  qj.field_e = sc.a((byte) 111, var2);
                }
                var2 = fg.a("ra_mutethisplayer", (byte) -45);
                if (var2 != null) {
                  no.field_wb = sc.a((byte) 86, var2);
                }
                var2 = fg.a("ra_suggestmute", (byte) -45);
                if (null != var2) {
                  vd.field_a = sc.a((byte) 108, var2);
                }
                var2 = fg.a("ra_intro", (byte) -45);
                if (null != var2) {
                  da.field_e = sc.a((byte) 116, var2);
                }
                var2 = fg.a("ra_intro_no_name", (byte) -45);
                if (null != var2) {
                  mn.field_x = sc.a((byte) 90, var2);
                }
                var2 = fg.a("ra_explanation", (byte) -45);
                if (var2 != null) {
                  rf.field_q = sc.a((byte) 127, var2);
                }
                var2 = fg.a("rule_pillar_0", (byte) -45);
                if (null != var2) {
                  ri.field_e = sc.a((byte) 90, var2);
                }
                var2 = fg.a("rule_0_0", (byte) -45);
                if (var2 != null) {
                  lf.field_h = sc.a((byte) 100, var2);
                }
                var2 = fg.a("rule_0_1", (byte) -45);
                if (null != var2) {
                  pa.field_c = sc.a((byte) 113, var2);
                }
                var2 = fg.a("rule_0_2", (byte) -45);
                if (null != var2) {
                  aa.field_i = sc.a((byte) 118, var2);
                }
                var2 = fg.a("rule_0_3", (byte) -45);
                if (var2 != null) {
                  jb.field_r = sc.a((byte) 120, var2);
                }
                var2 = fg.a("rule_0_4", (byte) -45);
                if (null != var2) {
                  gg.field_d = sc.a((byte) 122, var2);
                }
                var2 = fg.a("rule_0_5", (byte) -45);
                if (null != var2) {
                  cc.field_c = sc.a((byte) 124, var2);
                }
                var2 = fg.a("rule_pillar_1", (byte) -45);
                if (var2 != null) {
                  ul.field_s = sc.a((byte) 107, var2);
                }
                var2 = fg.a("rule_1_0", (byte) -45);
                if (var2 != null) {
                  kn.field_sb = sc.a((byte) 93, var2);
                }
                var2 = fg.a("rule_1_1", (byte) -45);
                if (var2 != null) {
                  lc.field_e = sc.a((byte) 107, var2);
                }
                var2 = fg.a("rule_1_2", (byte) -45);
                if (var2 != null) {
                  h.field_E = sc.a((byte) 99, var2);
                }
                var2 = fg.a("rule_1_3", (byte) -45);
                if (null != var2) {
                  ve.field_r = sc.a((byte) 111, var2);
                }
                var2 = fg.a("rule_1_4", (byte) -45);
                if (null != var2) {
                  bg.field_b = sc.a((byte) 95, var2);
                }
                var2 = fg.a("rule_pillar_2", (byte) -45);
                if (var2 != null) {
                  ed.field_Db = sc.a((byte) 106, var2);
                }
                var2 = fg.a("rule_2_0", (byte) -45);
                if (null != var2) {
                  wi.field_g = sc.a((byte) 95, var2);
                }
                var2 = fg.a("rule_2_1", (byte) -45);
                if (var2 != null) {
                  ja.field_w = sc.a((byte) 108, var2);
                }
                var2 = fg.a("rule_2_2", (byte) -45);
                if (null != var2) {
                  sa.field_Gb = sc.a((byte) 98, var2);
                }
                var2 = fg.a("createafreeaccount", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 113, var2);
                }
                var2 = fg.a("cancel", (byte) -45);
                if (null != var2) {
                  sa.field_Eb = sc.a((byte) 87, var2);
                }
                var2 = fg.a("pleaselogintoplay", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 93, var2);
                }
                var2 = fg.a("pleaselogin", (byte) -45);
                if (null != var2) {
                  ud.field_o = sc.a((byte) 111, var2);
                }
                var2 = fg.a("pleaselogin_member", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 93, var2);
                }
                var2 = fg.a("invaliduserorpass", (byte) -45);
                if (null != var2) {
                  ul.field_v = sc.a((byte) 106, var2);
                }
                var2 = fg.a("pleasetryagain", (byte) -45);
                if (null != var2) {
                  si.field_n = sc.a((byte) 86, var2);
                }
                var2 = fg.a("pleasereenterpass", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 108, var2);
                }
                var2 = fg.a("playfreeversion", (byte) -45);
                if (null != var2) {
                  ad.field_e = sc.a((byte) 107, var2);
                }
                var2 = fg.a("reloadgame", (byte) -45);
                if (var2 != null) {
                  ee.field_f = sc.a((byte) 124, var2);
                }
                var2 = fg.a("toserverlist", (byte) -45);
                if (null != var2) {
                  bd.field_b = sc.a((byte) 124, var2);
                }
                var2 = fg.a("tocustomersupport", (byte) -45);
                if (var2 != null) {
                  ea.field_B = sc.a((byte) 110, var2);
                }
                var2 = fg.a("changedisplayname", (byte) -45);
                if (null != var2) {
                  fk.field_j = sc.a((byte) 90, var2);
                }
                var2 = fg.a("returntohomepage", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 111, var2);
                }
                var2 = fg.a("justplay", (byte) -45);
                if (null != var2) {
                  rc.field_n = sc.a((byte) 125, var2);
                }
                var2 = fg.a("justplay_excl", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 118, var2);
                }
                var2 = fg.a("login", (byte) -45);
                if (var2 != null) {
                  w.field_Qb = sc.a((byte) 105, var2);
                }
                var2 = fg.a("goback", (byte) -45);
                if (null != var2) {
                  kn.field_rb = sc.a((byte) 127, var2);
                }
                var2 = fg.a("otheroptions", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 119, var2);
                }
                var2 = fg.a("proceed", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 114, var2);
                }
                var2 = fg.a("connectingtoserver", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 116, var2);
                }
                var2 = fg.a("pleasewait", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 92, var2);
                }
                var2 = fg.a("logging_in", (byte) -45);
                if (var2 != null) {
                  bj.field_qb = sc.a((byte) 103, var2);
                }
                var2 = fg.a("reconnect", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 127, var2);
                }
                var2 = fg.a("backtoerror", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 118, var2);
                }
                var2 = fg.a("pleasecheckinternet", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 107, var2);
                }
                var2 = fg.a("attemptingtoreconnect", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 115, var2);
                }
                var2 = fg.a("connectionlost_reconnecting", (byte) -45);
                if (null != var2) {
                  fi.field_a = sc.a((byte) 118, var2);
                }
                var2 = fg.a("connectionlost_withreason", (byte) -45);
                if (null != var2) {
                  wa.field_Eb = sc.a((byte) 117, var2);
                }
                var2 = fg.a("passwordverificationrequired", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 104, var2);
                }
                var2 = fg.a("invalidpass", (byte) -45);
                if (null != var2) {
                  nj.field_f = sc.a((byte) 91, var2);
                }
                var2 = fg.a("retry", (byte) -45);
                if (null != var2) {
                  sk.field_b = sc.a((byte) 115, var2);
                }
                var2 = fg.a("back", (byte) -45);
                if (var2 != null) {
                  ae.field_b = sc.a((byte) 110, var2);
                }
                var2 = fg.a("exitfullscreenmode", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 94, var2);
                }
                var2 = fg.a("quittowebsite", (byte) -45);
                if (var2 != null) {
                  ki.field_u = sc.a((byte) 107, var2);
                }
                var2 = fg.a("connectionrestored", (byte) -45);
                if (null != var2) {
                  ul.field_k = sc.a((byte) 117, var2);
                }
                var2 = fg.a("warning_ifyouquit", (byte) -45);
                if (var2 != null) {
                  fo.field_e = sc.a((byte) 91, var2);
                }
                var2 = fg.a("warning_ifyouquitorleavepage", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 108, var2);
                }
                var2 = fg.a("resubscribe_withoutlosing_fs", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 110, var2);
                }
                var2 = fg.a("resubscribe_withoutlosing", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 114, var2);
                }
                var2 = fg.a("customersupport_withoutlosing_fs", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 103, var2);
                }
                var2 = fg.a("customersupport_withoutlosing", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 123, var2);
                }
                var2 = fg.a("js5help_withoutlosing_fs", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 94, var2);
                }
                var2 = fg.a("js5help_withoutlosing", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 87, var2);
                }
                var2 = fg.a("checkinternet_withoutlosing_fs", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 109, var2);
                }
                var2 = fg.a("checkinternet_withoutlosing", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 122, var2);
                }
                var2 = fg.a("create_intro", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 115, var2);
                }
                var2 = fg.a("create_sameaccounttip_unnamed", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 88, var2);
                }
                var2 = fg.a("dateofbirthprompt", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 93, var2);
                }
                var2 = fg.a("fetchingcountrylist", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 102, var2);
                }
                var2 = fg.a("countryprompt", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 88, var2);
                }
                var2 = fg.a("countrylisterror", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 113, var2);
                }
                var2 = fg.a("theonlypersonalquestions", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 90, var2);
                }
                var2 = fg.a("create_submittingdata", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 103, var2);
                }
                var2 = fg.a("check", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 91, var2);
                }
                var2 = fg.a("create_pleasechooseausername", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 113, var2);
                }
                var2 = fg.a("create_usernameblurb", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 105, var2);
                }
                var2 = fg.a("checkingavailability", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 119, var2);
                }
                var2 = fg.a("checking", (byte) -45);
                if (var2 != null) {
                  ea.field_D = sc.a((byte) 104, var2);
                }
                var2 = fg.a("create_namealreadytaken", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 97, var2);
                }
                var2 = fg.a("create_sameaccounttip_named", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 95, var2);
                }
                var2 = fg.a("create_nosuggestions", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 120, var2);
                }
                var2 = fg.a("create_alternativelygoback", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 97, var2);
                }
                var2 = fg.a("create_available", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 94, var2);
                }
                var2 = fg.a("create_willnowshowtermsandconditions", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 112, var2);
                }
                var2 = fg.a("fetchingterms", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 121, var2);
                }
                var2 = fg.a("termserror", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 126, var2);
                }
                var2 = fg.a("create_iagree", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 105, var2);
                }
                var2 = fg.a("create_idisagree", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 118, var2);
                }
                var2 = fg.a("create_pleasescrolldowntoaccept", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 120, var2);
                }
                var2 = fg.a("create_linkaddress", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 104, var2);
                }
                var2 = fg.a("openinpopupwindow", (byte) -45);
                if (var2 != null) {
                  mm.field_s = sc.a((byte) 102, var2);
                }
                var2 = fg.a("create", (byte) -45);
                if (var2 != null) {
                  wm.field_G = sc.a((byte) 120, var2);
                }
                var2 = fg.a("create_pleasechooseapassword", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 102, var2);
                }
                var2 = fg.a("create_passwordblurb", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 108, var2);
                }
                var2 = fg.a("create_nevergivepassword", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 108, var2);
                }
                var2 = fg.a("creatingyouraccount", (byte) -45);
                if (null != var2) {
                  qe.field_l = sc.a((byte) 116, var2);
                }
                var2 = fg.a("create_youmustaccept", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 107, var2);
                }
                var2 = fg.a("create_passwordsdifferent", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 94, var2);
                }
                var2 = fg.a("create_success", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 127, var2);
                }
                var2 = fg.a("day", (byte) -45);
                if (null != var2) {
                  ne.field_f = sc.a((byte) 120, var2);
                }
                var2 = fg.a("month", (byte) -45);
                if (null != var2) {
                  ud.field_y = sc.a((byte) 97, var2);
                }
                var2 = fg.a("year", (byte) -45);
                if (var2 != null) {
                  rc.field_g = sc.a((byte) 119, var2);
                }
                var2 = fg.a("monthnames,0", (byte) -45);
                if (var2 != null) {
                  rb.field_p[0] = sc.a((byte) 122, var2);
                }
                var2 = fg.a("monthnames,1", (byte) -45);
                if (var2 != null) {
                  rb.field_p[1] = sc.a((byte) 88, var2);
                }
                var2 = fg.a("monthnames,2", (byte) -45);
                if (null != var2) {
                  rb.field_p[2] = sc.a((byte) 100, var2);
                }
                var2 = fg.a("monthnames,3", (byte) -45);
                if (null != var2) {
                  rb.field_p[3] = sc.a((byte) 114, var2);
                }
                var2 = fg.a("monthnames,4", (byte) -45);
                if (var2 != null) {
                  rb.field_p[4] = sc.a((byte) 123, var2);
                }
                var2 = fg.a("monthnames,5", (byte) -45);
                if (var2 != null) {
                  rb.field_p[5] = sc.a((byte) 104, var2);
                }
                var2 = fg.a("monthnames,6", (byte) -45);
                if (null != var2) {
                  rb.field_p[6] = sc.a((byte) 127, var2);
                }
                var2 = fg.a("monthnames,7", (byte) -45);
                if (var2 != null) {
                  rb.field_p[7] = sc.a((byte) 98, var2);
                }
                var2 = fg.a("monthnames,8", (byte) -45);
                if (var2 != null) {
                  rb.field_p[8] = sc.a((byte) 87, var2);
                }
                var2 = fg.a("monthnames,9", (byte) -45);
                if (var2 != null) {
                  rb.field_p[9] = sc.a((byte) 114, var2);
                }
                var2 = fg.a("monthnames,10", (byte) -45);
                if (null != var2) {
                  rb.field_p[10] = sc.a((byte) 100, var2);
                }
                var2 = fg.a("monthnames,11", (byte) -45);
                if (var2 != null) {
                  rb.field_p[11] = sc.a((byte) 118, var2);
                }
                var2 = fg.a("create_welcome", (byte) -45);
                if (var2 != null) {
                  qe.field_j = sc.a((byte) 118, var2);
                }
                var2 = fg.a("create_u13_welcome", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 87, var2);
                }
                var2 = fg.a("create_createanaccount", (byte) -45);
                if (var2 != null) {
                  ib.field_t = sc.a((byte) 89, var2);
                }
                var2 = fg.a("create_username", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 105, var2);
                }
                var2 = fg.a("create_displayname", (byte) -45);
                if (null != var2) {
                  ch.field_h = sc.a((byte) 127, var2);
                }
                var2 = fg.a("create_password", (byte) -45);
                if (null != var2) {
                  eh.field_a = sc.a((byte) 89, var2);
                }
                var2 = fg.a("create_password_confirm", (byte) -45);
                if (var2 != null) {
                  le.field_A = sc.a((byte) 113, var2);
                }
                var2 = fg.a("create_email", (byte) -45);
                if (var2 != null) {
                  bk.field_K = sc.a((byte) 95, var2);
                }
                var2 = fg.a("create_email_confirm", (byte) -45);
                if (null != var2) {
                  dn.field_Gb = sc.a((byte) 89, var2);
                }
                var2 = fg.a("create_age", (byte) -45);
                if (null != var2) {
                  ka.field_n = sc.a((byte) 116, var2);
                }
                var2 = fg.a("create_u13_email", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 92, var2);
                }
                var2 = fg.a("create_u13_email_confirm", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 114, var2);
                }
                var2 = fg.a("create_dob", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 102, var2);
                }
                var2 = fg.a("create_country", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 120, var2);
                }
                var2 = fg.a("create_alternatives_header", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 116, var2);
                }
                var2 = fg.a("create_alternatives_select", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 114, var2);
                }
                var2 = fg.a("create_suggestions", (byte) -45);
                if (var2 != null) {
                  ji.field_f = sc.a((byte) 90, var2);
                }
                var2 = fg.a("create_more_suggestions", (byte) -45);
                if (null != var2) {
                  pc.field_d = sc.a((byte) 113, var2);
                }
                var2 = fg.a("create_select_alternative", (byte) -45);
                if (null != var2) {
                  si.field_q = sc.a((byte) 121, var2);
                }
                var2 = fg.a("create_optin_news", (byte) -45);
                if (null != var2) {
                  rj.field_c = sc.a((byte) 94, var2);
                }
                var2 = fg.a("create_agreeterms", (byte) -45);
                if (null != var2) {
                  fn.field_d = sc.a((byte) 110, var2);
                }
                var2 = fg.a("create_u13terms", (byte) -45);
                if (null != var2) {
                  ud.field_r = sc.a((byte) 92, var2);
                }
                var2 = fg.a("login_username_email", (byte) -45);
                if (null != var2) {
                  jl.field_b = sc.a((byte) 121, var2);
                }
                var2 = fg.a("login_username", (byte) -45);
                if (var2 != null) {
                  wh.field_b = sc.a((byte) 106, var2);
                }
                var2 = fg.a("login_email", (byte) -45);
                if (var2 != null) {
                  cn.field_H = sc.a((byte) 92, var2);
                }
                var2 = fg.a("login_username_tooltip", (byte) -45);
                if (var2 != null) {
                  ln.field_L = sc.a((byte) 118, var2);
                }
                var2 = fg.a("login_password_tooltip", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 127, var2);
                }
                var2 = fg.a("login_login_tooltip", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 102, var2);
                }
                var2 = fg.a("login_create_tooltip", (byte) -45);
                if (var2 != null) {
                  dh.field_Bb = sc.a((byte) 93, var2);
                }
                var2 = fg.a("login_justplay_tooltip", (byte) -45);
                if (var2 != null) {
                  hj.field_c = sc.a((byte) 115, var2);
                }
                var2 = fg.a("login_back_tooltip", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 116, var2);
                }
                var2 = fg.a("login_no_displayname", (byte) -45);
                if (var2 != null) {
                  wl.field_H = sc.a((byte) 86, var2);
                }
                var2 = fg.a("create_username_tooltip", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 113, var2);
                }
                var2 = fg.a("create_username_hint", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 121, var2);
                }
                var2 = fg.a("create_displayname_tooltip", (byte) -45);
                if (null != var2) {
                  eh.field_b = sc.a((byte) 124, var2);
                }
                var2 = fg.a("create_displayname_hint", (byte) -45);
                if (null != var2) {
                  bj.field_kb = sc.a((byte) 86, var2);
                }
                var2 = fg.a("create_password_tooltip", (byte) -45);
                if (null != var2) {
                  ao.field_c = sc.a((byte) 116, var2);
                }
                var2 = fg.a("create_password_hint", (byte) -45);
                if (null != var2) {
                  rm.field_p = sc.a((byte) 120, var2);
                }
                var2 = fg.a("create_password_confirm_tooltip", (byte) -45);
                if (null != var2) {
                  nk.field_j = sc.a((byte) 115, var2);
                }
                var2 = fg.a("create_email_tooltip", (byte) -45);
                if (null != var2) {
                  jk.field_s = sc.a((byte) 103, var2);
                }
                var2 = fg.a("create_email_confirm_tooltip", (byte) -45);
                if (var2 != null) {
                  dn.field_Fb = sc.a((byte) 112, var2);
                }
                var2 = fg.a("create_age_tooltip", (byte) -45);
                if (null != var2) {
                  lc.field_k = sc.a((byte) 99, var2);
                }
                var2 = fg.a("create_optin_news_tooltip", (byte) -45);
                if (null != var2) {
                  ce.field_l = sc.a((byte) 103, var2);
                }
                var2 = fg.a("create_u13_email_tooltip", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 107, var2);
                }
                var2 = fg.a("create_u13_email_confirm_tooltip", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 95, var2);
                }
                var2 = fg.a("create_dob_tooltip", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 125, var2);
                }
                var2 = fg.a("create_country_tooltip", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 94, var2);
                }
                var2 = fg.a("create_optin_tooltip", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 107, var2);
                }
                var2 = fg.a("create_continue", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 105, var2);
                }
                var2 = fg.a("create_username_unavailable", (byte) -45);
                if (null != var2) {
                  ec.field_e = sc.a((byte) 107, var2);
                }
                var2 = fg.a("create_username_available", (byte) -45);
                if (var2 != null) {
                  wk.field_i = sc.a((byte) 112, var2);
                }
                var2 = fg.a("create_alert_namelength", (byte) -45);
                if (null != var2) {
                  lm.field_c = sc.a((byte) 108, var2);
                }
                var2 = fg.a("create_alert_namechars", (byte) -45);
                if (null != var2) {
                  mb.field_N = sc.a((byte) 93, var2);
                }
                var2 = fg.a("create_alert_nameleadingspace", (byte) -45);
                if (var2 != null) {
                  ua.field_H = sc.a((byte) 112, var2);
                }
                var2 = fg.a("create_alert_doublespace", (byte) -45);
                if (null != var2) {
                  ff.field_e = sc.a((byte) 93, var2);
                }
                var2 = fg.a("create_alert_passchars", (byte) -45);
                if (var2 != null) {
                  cm.field_h = sc.a((byte) 93, var2);
                }
                var2 = fg.a("create_alert_passrepeated", (byte) -45);
                if (var2 != null) {
                  ko.field_g = sc.a((byte) 92, var2);
                }
                var2 = fg.a("create_alert_passlength", (byte) -45);
                if (var2 != null) {
                  ji.field_i = sc.a((byte) 106, var2);
                }
                var2 = fg.a("create_alert_passcontainsname", (byte) -45);
                if (var2 != null) {
                  rg.field_f = sc.a((byte) 125, var2);
                }
                var2 = fg.a("create_alert_passcontainsemail", (byte) -45);
                if (null != var2) {
                  wj.field_c = sc.a((byte) 106, var2);
                }
                var2 = fg.a("create_alert_passcontainsname_partial", (byte) -45);
                if (var2 != null) {
                  cj.field_e = sc.a((byte) 124, var2);
                }
                var2 = fg.a("create_alert_checkname", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 127, var2);
                }
                var2 = fg.a("create_alert_invalidemail", (byte) -45);
                if (null != var2) {
                  gl.field_f = sc.a((byte) 115, var2);
                }
                var2 = fg.a("create_alert_email_unavailable", (byte) -45);
                if (null != var2) {
                  oj.field_b = sc.a((byte) 90, var2);
                }
                var2 = fg.a("create_alert_invaliddate", (byte) -45);
                if (null != var2) {
                  gl.field_d = sc.a((byte) 107, var2);
                }
                var2 = fg.a("create_alert_invalidage", (byte) -45);
                if (null != var2) {
                  gf.field_V = sc.a((byte) 125, var2);
                }
                var2 = fg.a("create_alert_yearrange", (byte) -45);
                if (var2 != null) {
                  af.field_Kb = sc.a((byte) 88, var2);
                }
                var2 = fg.a("create_alert_mismatch", (byte) -45);
                if (null != var2) {
                  lf.field_i = sc.a((byte) 115, var2);
                }
                var2 = fg.a("create_passwordvalid", (byte) -45);
                if (var2 != null) {
                  hk.field_r = sc.a((byte) 86, var2);
                }
                var2 = fg.a("create_emailvalid", (byte) -45);
                if (var2 != null) {
                  nh.field_v = sc.a((byte) 125, var2);
                }
                var2 = fg.a("create_account_success", (byte) -45);
                if (var2 != null) {
                  aa.field_h = sc.a((byte) 93, var2);
                }
                var2 = fg.a("invalid_name", (byte) -45);
                if (var2 != null) {
                  fn.field_h = sc.a((byte) 108, var2);
                }
                var2 = fg.a("cannot_add_yourself", (byte) -45);
                if (null != var2) {
                  sd.field_l = sc.a((byte) 114, var2);
                }
                var2 = fg.a("unable_to_add_friend", (byte) -45);
                if (null != var2) {
                  nm.field_e = sc.a((byte) 103, var2);
                }
                var2 = fg.a("unable_to_add_ignore", (byte) -45);
                if (var2 != null) {
                  vi.field_K = sc.a((byte) 118, var2);
                }
                var2 = fg.a("unable_to_delete_friend", (byte) -45);
                if (var2 != null) {
                  oo.field_E = sc.a((byte) 98, var2);
                }
                var2 = fg.a("unable_to_delete_ignore", (byte) -45);
                if (null != var2) {
                  rk.field_L = sc.a((byte) 122, var2);
                }
                var2 = fg.a("friendlistfull", (byte) -45);
                if (var2 != null) {
                  rg.field_e = sc.a((byte) 112, var2);
                }
                var2 = fg.a("friendlistdupe", (byte) -45);
                if (var2 != null) {
                  gj.field_e = sc.a((byte) 101, var2);
                }
                var2 = fg.a("friendnotfound", (byte) -45);
                if (var2 != null) {
                  rd.field_c = sc.a((byte) 126, var2);
                }
                var2 = fg.a("ignorelistfull", (byte) -45);
                if (null != var2) {
                  nh.field_u = sc.a((byte) 91, var2);
                }
                var2 = fg.a("ignorelistdupe", (byte) -45);
                if (var2 != null) {
                  sc.field_bb = sc.a((byte) 108, var2);
                }
                var2 = fg.a("ignorenotfound", (byte) -45);
                if (null != var2) {
                  k.field_f = sc.a((byte) 106, var2);
                }
                var2 = fg.a("removeignorefirst", (byte) -45);
                if (var2 != null) {
                  r.field_a = sc.a((byte) 100, var2);
                }
                var2 = fg.a("removefriendfirst", (byte) -45);
                if (null != var2) {
                  ga.field_q = sc.a((byte) 111, var2);
                }
                var2 = fg.a("enterfriend_add", (byte) -45);
                if (null != var2) {
                  dg.field_v = sc.a((byte) 106, var2);
                }
                var2 = fg.a("enterfriend_del", (byte) -45);
                if (var2 != null) {
                  af.field_Gb = sc.a((byte) 103, var2);
                }
                var2 = fg.a("enterignore_add", (byte) -45);
            }
            void runChunk2() throws java.lang.RuntimeException {
                if (var2 != null) {
                  fh.field_a = sc.a((byte) 124, var2);
                }
                var2 = fg.a("enterignore_del", (byte) -45);
                if (null != var2) {
                  wd.field_i = sc.a((byte) 106, var2);
                }
                var2 = fg.a("text_removed_from_game", (byte) -45);
                if (null != var2) {
                  we.field_e = sc.a((byte) 116, var2);
                }
                var2 = fg.a("text_lobby_pleaselogin_free", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 92, var2);
                }
                var2 = fg.a("opengl", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 90, var2);
                }
                var2 = fg.a("sse", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 91, var2);
                }
                var2 = fg.a("purejava", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 112, var2);
                }
                var2 = fg.a("waitingfor_graphics", (byte) -45);
                if (null != var2) {
                  sc.field_Z = sc.a((byte) 92, var2);
                }
                var2 = fg.a("waitingfor_models", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 102, var2);
                }
                var2 = fg.a("waitingfor_fonts", (byte) -45);
                if (var2 != null) {
                  wh.field_a = sc.a((byte) 89, var2);
                }
                var2 = fg.a("waitingfor_soundeffects", (byte) -45);
                if (var2 != null) {
                  fn.field_a = sc.a((byte) 99, var2);
                }
                var2 = fg.a("waitingfor_music", (byte) -45);
                if (var2 != null) {
                  kh.field_e = sc.a((byte) 113, var2);
                }
                var2 = fg.a("waitingfor_instruments", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 121, var2);
                }
                var2 = fg.a("waitingfor_levels", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 106, var2);
                }
                var2 = fg.a("waitingfor_extradata", (byte) -45);
                if (var2 != null) {
                  di.field_c = sc.a((byte) 126, var2);
                }
                var2 = fg.a("waitingfor_languages", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 117, var2);
                }
                var2 = fg.a("waitingfor_textures", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 115, var2);
                }
                var2 = fg.a("waitingfor_animations", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 106, var2);
                }
                var2 = fg.a("loading_graphics", (byte) -45);
                if (var2 != null) {
                  gd.field_nb = sc.a((byte) 94, var2);
                }
                var2 = fg.a("loading_models", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 95, var2);
                }
                var2 = fg.a("loading_fonts", (byte) -45);
                if (null != var2) {
                  ra.field_d = sc.a((byte) 91, var2);
                }
                var2 = fg.a("loading_soundeffects", (byte) -45);
                if (var2 != null) {
                  mj.field_v = sc.a((byte) 120, var2);
                }
                var2 = fg.a("loading_music", (byte) -45);
                if (var2 != null) {
                  ii.field_e = sc.a((byte) 99, var2);
                }
                var2 = fg.a("loading_instruments", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 125, var2);
                }
                var2 = fg.a("loading_levels", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 98, var2);
                }
                var2 = fg.a("loading_extradata", (byte) -45);
                if (var2 != null) {
                  mm.field_t = sc.a((byte) 100, var2);
                }
                var2 = fg.a("loading_languages", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 119, var2);
                }
                var2 = fg.a("loading_textures", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 91, var2);
                }
                var2 = fg.a("loading_animations", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 114, var2);
                }
                var2 = fg.a("unpacking_graphics", (byte) -45);
                if (null != var2) {
                  hi.field_c = sc.a((byte) 115, var2);
                }
                var2 = fg.a("unpacking_models", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 102, var2);
                }
                var2 = fg.a("unpacking_soundeffects", (byte) -45);
                if (var2 != null) {
                  sn.field_N = sc.a((byte) 95, var2);
                }
                var2 = fg.a("unpacking_music", (byte) -45);
                if (null != var2) {
                  vi.field_J = sc.a((byte) 115, var2);
                }
                var2 = fg.a("unpacking_levels", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 116, var2);
                }
                var2 = fg.a("unpacking_languages", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 118, var2);
                }
                var2 = fg.a("unpacking_animations", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 110, var2);
                }
                var2 = fg.a("unpacking_toolkit", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 101, var2);
                }
                var2 = fg.a("instructions", (byte) -45);
                if (null != var2) {
                  he.field_b = sc.a((byte) 123, var2);
                }
                var2 = fg.a("tutorial", (byte) -45);
                if (var2 != null) {
                  nj.field_g = sc.a((byte) 113, var2);
                }
                var2 = fg.a("playtutorial", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 103, var2);
                }
                var2 = fg.a("sound_colon", (byte) -45);
                if (null != var2) {
                  sd.field_g = sc.a((byte) 109, var2);
                }
                var2 = fg.a("music_colon", (byte) -45);
                if (var2 != null) {
                  th.field_i = sc.a((byte) 114, var2);
                }
                var2 = fg.a("fullscreen", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 111, var2);
                }
                var2 = fg.a("screensize", (byte) -45);
                if (null != var2) {
                  mb.field_Z = sc.a((byte) 109, var2);
                }
                var2 = fg.a("highscores", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 88, var2);
                }
                var2 = fg.a("rankings", (byte) -45);
                if (null != var2) {
                  da.field_a = sc.a((byte) 123, var2);
                }
                var2 = fg.a("achievements", (byte) -45);
                if (null != var2) {
                  he.field_g = sc.a((byte) 121, var2);
                }
                var2 = fg.a("achievementsthisgame", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 122, var2);
                }
                var2 = fg.a("achievementsthissession", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 110, var2);
                }
                var2 = fg.a("watchintroduction", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 125, var2);
                }
                var2 = fg.a("quit", (byte) -45);
                if (var2 != null) {
                  tm.field_f = sc.a((byte) 126, var2);
                }
                var2 = fg.a("login_createaccount", (byte) -45);
                if (null != var2) {
                  ArcanistsMulti.field_H = sc.a((byte) 113, var2);
                }
                var2 = fg.a("tohighscores", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 116, var2);
                }
                var2 = fg.a("returntomainmenu", (byte) -45);
                if (var2 != null) {
                  ti.field_M = sc.a((byte) 100, var2);
                }
                var2 = fg.a("returntopausemenu", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 115, var2);
                }
                var2 = fg.a("returntooptionsmenu_notpaused", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 92, var2);
                }
                var2 = fg.a("mainmenu", (byte) -45);
                if (null != var2) {
                  se.field_J = sc.a((byte) 115, var2);
                }
                var2 = fg.a("pausemenu", (byte) -45);
                if (var2 != null) {
                  ja.field_r = sc.a((byte) 107, var2);
                }
                var2 = fg.a("optionsmenu_notpaused", (byte) -45);
                if (null != var2) {
                  q.field_I = sc.a((byte) 115, var2);
                }
                var2 = fg.a("menu", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 95, var2);
                }
                var2 = fg.a("selectlevel", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 92, var2);
                }
                var2 = fg.a("nextlevel", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 87, var2);
                }
                var2 = fg.a("startgame", (byte) -45);
                if (null != var2) {
                  nn.field_m = sc.a((byte) 90, var2);
                }
                var2 = fg.a("newgame", (byte) -45);
                if (null != var2) {
                  sl.field_K = sc.a((byte) 103, var2);
                }
                var2 = fg.a("resumegame", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 126, var2);
                }
                var2 = fg.a("resumetutorial", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 117, var2);
                }
                var2 = fg.a("skip", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 105, var2);
                }
                var2 = fg.a("skiptutorial", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 107, var2);
                }
                var2 = fg.a("skipending", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 108, var2);
                }
                var2 = fg.a("restartlevel", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 101, var2);
                }
                var2 = fg.a("endtest", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 125, var2);
                }
                var2 = fg.a("endgame", (byte) -45);
                if (var2 != null) {
                  ed.field_xb = sc.a((byte) 120, var2);
                }
                var2 = fg.a("endtutorial", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 119, var2);
                }
                var2 = fg.a("ok", (byte) -45);
                if (null != var2) {
                  im.field_f = sc.a((byte) 126, var2);
                }
                var2 = fg.a("on", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 91, var2);
                }
                var2 = fg.a("off", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 89, var2);
                }
                var2 = fg.a("previous", (byte) -45);
                if (null != var2) {
                  ab.field_q = sc.a((byte) 94, var2);
                }
                var2 = fg.a("prev", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 110, var2);
                }
                var2 = fg.a("next", (byte) -45);
                if (null != var2) {
                  mn.field_w = sc.a((byte) 86, var2);
                }
                var2 = fg.a("graphics_colon", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 90, var2);
                }
                var2 = fg.a("hotseatmultiplayer", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 120, var2);
                }
                var2 = fg.a("entermultiplayerlobby", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 88, var2);
                }
                var2 = fg.a("singleplayergame", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 91, var2);
                }
                var2 = fg.a("returntogame", (byte) -45);
                if (null != var2) {
                  r.field_e = sc.a((byte) 108, var2);
                }
                var2 = fg.a("endgameresign", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 118, var2);
                }
                var2 = fg.a("offerdraw", (byte) -45);
                if (null != var2) {
                  cn.field_K = sc.a((byte) 98, var2);
                }
                var2 = fg.a("canceldraw", (byte) -45);
                if (null != var2) {
                  uh.field_s = sc.a((byte) 93, var2);
                }
                var2 = fg.a("acceptdraw", (byte) -45);
                if (null != var2) {
                  pe.field_Nb = sc.a((byte) 116, var2);
                }
                var2 = fg.a("resign", (byte) -45);
                if (null != var2) {
                  eg.field_d = sc.a((byte) 89, var2);
                }
                var2 = fg.a("returntolobby", (byte) -45);
                if (null != var2) {
                  gb.field_a = sc.a((byte) 100, var2);
                }
                var2 = fg.a("cont", (byte) -45);
                if (null != var2) {
                  qn.field_lb = sc.a((byte) 92, var2);
                }
                var2 = fg.a("continue_spectating", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 89, var2);
                }
                var2 = fg.a("messages", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 115, var2);
                }
                var2 = fg.a("graphics_fastest", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 104, var2);
                }
                var2 = fg.a("graphics_medium", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 114, var2);
                }
                var2 = fg.a("graphics_best", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 95, var2);
                }
                var2 = fg.a("graphics_directx", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 112, var2);
                }
                var2 = fg.a("graphics_opengl", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 106, var2);
                }
                var2 = fg.a("graphics_java", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 90, var2);
                }
                var2 = fg.a("graphics_quality_high", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 103, var2);
                }
                var2 = fg.a("graphics_quality_low", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 109, var2);
                }
                var2 = fg.a("graphics_mode", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 126, var2);
                }
                var2 = fg.a("graphics_quality", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 126, var2);
                }
                var2 = fg.a("mode", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 95, var2);
                }
                var2 = fg.a("quality", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 90, var2);
                }
                var2 = fg.a("keys", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 107, var2);
                }
                var2 = fg.a("objective", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 98, var2);
                }
                var2 = fg.a("currentobjective", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 126, var2);
                }
                var2 = fg.a("pressescforpausemenu", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 88, var2);
                }
                var2 = fg.a("pressescforpausemenuortoskiptutorial", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 124, var2);
                }
                var2 = fg.a("pressescforoptionsmenu_doesntpause", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 117, var2);
                }
                var2 = fg.a("pressescforoptionsmenu_doesntpause_short", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 99, var2);
                }
                var2 = fg.a("powerups", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 127, var2);
                }
                var2 = fg.a("latestlevel_suffix", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 115, var2);
                }
                var2 = fg.a("unreachedlevel_name", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 99, var2);
                }
                var2 = fg.a("unreachedlevel_cannotplayreason", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 122, var2);
                }
                var2 = fg.a("unreachedlevel_cannotplayreason_shorter", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 97, var2);
                }
                var2 = fg.a("unreachedworld_cannotplayreason", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 124, var2);
                }
                var2 = fg.a("memberslevel_name", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 105, var2);
                }
                var2 = fg.a("memberslevel_cannotplayreason", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 109, var2);
                }
                var2 = fg.a("membersworld_cannotplayreason", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 91, var2);
                }
                var2 = fg.a("unreachedlevel_createtip", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 116, var2);
                }
                var2 = fg.a("unreachedlevel_createtip_line1", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 88, var2);
                }
                var2 = fg.a("unreachedlevel_createtip_line2", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 107, var2);
                }
                var2 = fg.a("unreachedlevel_logintip", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 105, var2);
                }
                var2 = fg.a("memberslevel_logintip", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 111, var2);
                }
                var2 = fg.a("displayname_none", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 116, var2);
                }
                var2 = fg.a("levelxofy1", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 123, var2);
                }
                var2 = fg.a("levelxofy2", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 103, var2);
                }
                var2 = fg.a("levelxofy", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 124, var2);
                }
                var2 = fg.a("ingame_level", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 114, var2);
                }
                var2 = fg.a("mouseoveranicon", (byte) -45);
                if (null != var2) {
                  qo.field_c = sc.a((byte) 102, var2);
                }
                var2 = fg.a("notyetachieved", (byte) -45);
                if (null != var2) {
                  ld.field_l = sc.a((byte) 94, var2);
                }
                var2 = fg.a("achieved", (byte) -45);
                if (var2 != null) {
                  rk.field_H = sc.a((byte) 112, var2);
                }
                var2 = fg.a("orbpoints", (byte) -45);
                if (var2 != null) {
                  lo.field_x = sc.a((byte) 118, var2);
                }
                var2 = fg.a("orbcoins", (byte) -45);
                if (var2 != null) {
                  uk.field_c = sc.a((byte) 122, var2);
                }
                var2 = fg.a("orbpoints_colon", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 111, var2);
                }
                var2 = fg.a("orbcoins_colon", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 88, var2);
                }
                var2 = fg.a("achieved_colon_description", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 94, var2);
                }
                var2 = fg.a("secretachievement", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 106, var2);
                }
                var2 = fg.a("no_highscores", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 96, var2);
                }
                var2 = fg.a("hs_name", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 113, var2);
                }
                var2 = fg.a("hs_level", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 104, var2);
                }
                var2 = fg.a("hs_fromlevel", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 94, var2);
                }
                var2 = fg.a("hs_tolevel", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 113, var2);
                }
                var2 = fg.a("hs_score", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 109, var2);
                }
                var2 = fg.a("hs_end", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 96, var2);
                }
                var2 = fg.a("ingame_score", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 101, var2);
                }
                var2 = fg.a("score_colon", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 101, var2);
                }
                var2 = fg.a("mp_leavegame", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 116, var2);
                }
                var2 = fg.a("mp_offerrematch", (byte) -45);
                if (null != var2) {
                  ra.field_n = sc.a((byte) 118, var2);
                }
                var2 = fg.a("mp_offerrematch_unrated", (byte) -45);
                if (null != var2) {
                  nl.field_Bb = sc.a((byte) 113, var2);
                }
                var2 = fg.a("mp_acceptrematch", (byte) -45);
                if (null != var2) {
                  mo.field_g = sc.a((byte) 111, var2);
                }
                var2 = fg.a("mp_acceptrematch_unrated", (byte) -45);
                if (var2 != null) {
                  ng.field_H = sc.a((byte) 106, var2);
                }
                var2 = fg.a("mp_cancelrematch", (byte) -45);
                if (null != var2) {
                  eh.field_d = sc.a((byte) 87, var2);
                }
                var2 = fg.a("mp_cancelrematch_unrated", (byte) -45);
                if (var2 != null) {
                  vm.field_e = sc.a((byte) 116, var2);
                }
                var2 = fg.a("mp_rematchnewgame", (byte) -45);
                if (null != var2) {
                  rb.field_m = sc.a((byte) 108, var2);
                }
                var2 = fg.a("mp_rematchnewgame_unrated", (byte) -45);
                if (null != var2) {
                  so.field_b = sc.a((byte) 117, var2);
                }
                var2 = fg.a("mp_x_wantstodraw", (byte) -45);
                if (null != var2) {
                  ph.field_d = sc.a((byte) 124, var2);
                }
                var2 = fg.a("mp_x_offersrematch", (byte) -45);
                if (null != var2) {
                  tj.field_y = sc.a((byte) 113, var2);
                }
                var2 = fg.a("mp_x_offersrematch_unrated", (byte) -45);
                if (var2 != null) {
                  pb.field_i = sc.a((byte) 117, var2);
                }
                var2 = fg.a("mp_youofferrematch", (byte) -45);
                if (null != var2) {
                  vi.field_R = sc.a((byte) 108, var2);
                }
                var2 = fg.a("mp_youofferrematch_unrated", (byte) -45);
                if (null != var2) {
                  mk.field_K = sc.a((byte) 115, var2);
                }
                var2 = fg.a("mp_youofferdraw", (byte) -45);
                if (null != var2) {
                  nn.field_t = sc.a((byte) 98, var2);
                }
                var2 = fg.a("mp_youresigned", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 91, var2);
                }
                var2 = fg.a("mp_youresigned_rematch", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 96, var2);
                }
                var2 = fg.a("mp_x_hasresignedandleft", (byte) -45);
                if (null != var2) {
                  qc.field_g = sc.a((byte) 108, var2);
                }
                var2 = fg.a("mp_x_hasresigned_rematch", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 94, var2);
                }
                var2 = fg.a("mp_x_hasresigned", (byte) -45);
                if (var2 != null) {
                  lc.field_a = sc.a((byte) 114, var2);
                }
                var2 = fg.a("mp_x_hasleft", (byte) -45);
                if (var2 != null) {
                  cn.field_Q = sc.a((byte) 124, var2);
                }
                var2 = fg.a("mp_x_haswon", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 121, var2);
                }
                var2 = fg.a("mp_youhavewon", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 104, var2);
                }
                var2 = fg.a("mp_gamedrawn", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 116, var2);
                }
                var2 = fg.a("mp_timeremaining", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 114, var2);
                }
                var2 = fg.a("mp_x_turn", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 111, var2);
                }
                var2 = fg.a("mp_yourturn", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 117, var2);
                }
                var2 = fg.a("gameover", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 97, var2);
                }
                var2 = fg.a("mp_hidechat", (byte) -45);
                if (null != var2) {
                  rm.field_a = sc.a((byte) 119, var2);
                }
                var2 = fg.a("mp_showchat_nounread", (byte) -45);
                if (var2 != null) {
                  bm.field_b = sc.a((byte) 104, var2);
                }
                var2 = fg.a("mp_showchat_unread1", (byte) -45);
                if (null != var2) {
                  am.field_a = sc.a((byte) 127, var2);
                }
                var2 = fg.a("mp_showchat_unread2", (byte) -45);
                if (var2 != null) {
                  ig.field_d = sc.a((byte) 94, var2);
                }
                var2 = fg.a("click_to_quickchat", (byte) -45);
                if (null != var2) {
                  sb.field_b = sc.a((byte) 120, var2);
                }
                var2 = fg.a("autorespond", (byte) -45);
                if (null != var2) {
                  gh.field_O = sc.a((byte) 97, var2);
                }
                var2 = fg.a("quickchat_help", (byte) -45);
                if (var2 != null) {
                  mo.field_j = sc.a((byte) 104, var2);
                }
                var2 = fg.a("quickchat_help_title", (byte) -45);
                if (var2 != null) {
                  li.field_H = sc.a((byte) 109, var2);
                }
                var2 = fg.a("quickchat_shortcut_help,0", (byte) -45);
                if (var2 != null) {
                  me.field_L[0] = sc.a((byte) 101, var2);
                }
                var2 = fg.a("quickchat_shortcut_help,1", (byte) -45);
                if (var2 != null) {
                  me.field_L[1] = sc.a((byte) 102, var2);
                }
                var2 = fg.a("quickchat_shortcut_help,2", (byte) -45);
                if (null != var2) {
                  me.field_L[2] = sc.a((byte) 102, var2);
                }
                var2 = fg.a("quickchat_shortcut_help,3", (byte) -45);
                if (var2 != null) {
                  me.field_L[3] = sc.a((byte) 104, var2);
                }
                var2 = fg.a("quickchat_shortcut_help,4", (byte) -45);
                if (var2 != null) {
                  me.field_L[4] = sc.a((byte) 89, var2);
                }
                var2 = fg.a("quickchat_shortcut_help,5", (byte) -45);
                if (var2 != null) {
                  me.field_L[5] = sc.a((byte) 114, var2);
                }
                var2 = fg.a("quickchat_shortcut_keys,0", (byte) -45);
                if (null != var2) {
                  no.field_vb[0] = sc.a((byte) 87, var2);
                }
                var2 = fg.a("quickchat_shortcut_keys,1", (byte) -45);
                if (var2 != null) {
                  no.field_vb[1] = sc.a((byte) 91, var2);
                }
                var2 = fg.a("quickchat_shortcut_keys,2", (byte) -45);
                if (null != var2) {
                  no.field_vb[2] = sc.a((byte) 90, var2);
                }
                var2 = fg.a("quickchat_shortcut_keys,3", (byte) -45);
                if (null != var2) {
                  no.field_vb[3] = sc.a((byte) 103, var2);
                }
                var2 = fg.a("quickchat_shortcut_keys,4", (byte) -45);
                if (null != var2) {
                  no.field_vb[4] = sc.a((byte) 123, var2);
                }
                var2 = fg.a("quickchat_shortcut_keys,5", (byte) -45);
                if (var2 != null) {
                  no.field_vb[5] = sc.a((byte) 120, var2);
                }
                var2 = fg.a("keychar_the_character_under_questionmark", (byte) -45);
                if (var2 != null) {
                  se.field_E = hm.a(var2[0], 46);
                }
                var2 = fg.a("rating_noratings", (byte) -45);
                if (null != var2) {
                  rm.field_d = sc.a((byte) 102, var2);
                }
                var2 = fg.a("rating_rating", (byte) -45);
                if (null != var2) {
                  rd.field_d = sc.a((byte) 109, var2);
                }
                var2 = fg.a("rating_played", (byte) -45);
                if (null != var2) {
                  ej.field_H = sc.a((byte) 109, var2);
                }
                var2 = fg.a("rating_won", (byte) -45);
                if (null != var2) {
                  oo.field_o = sc.a((byte) 88, var2);
                }
                var2 = fg.a("rating_lost", (byte) -45);
                if (null != var2) {
                  fc.field_d = sc.a((byte) 89, var2);
                }
                var2 = fg.a("rating_drawn", (byte) -45);
                if (var2 != null) {
                  sl.field_N = sc.a((byte) 121, var2);
                }
                var2 = fg.a("benefits_fullscreen", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 115, var2);
                }
                var2 = fg.a("benefits_noadverts", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 119, var2);
                }
                var2 = fg.a("benefits_price", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 99, var2);
                }
                var2 = fg.a("members_expansion_benefits,0", (byte) -45);
                if (var2 != null) {
                  nf.field_qb[0] = sc.a((byte) 108, var2);
                }
                var2 = fg.a("members_expansion_benefits,1", (byte) -45);
                if (var2 != null) {
                  nf.field_qb[1] = sc.a((byte) 98, var2);
                }
                var2 = fg.a("members_expansion_benefits,2", (byte) -45);
                if (var2 != null) {
                  nf.field_qb[2] = sc.a((byte) 115, var2);
                }
                var2 = fg.a("members_expansion_price_top", (byte) -45);
                if (var2 != null) {
                  vc.field_l = sc.a((byte) 111, var2);
                }
                var2 = fg.a("members_expansion_price_bottom", (byte) -45);
                if (null != var2) {
                  ph.field_b = sc.a((byte) 109, var2);
                }
                var2 = fg.a("reconnect_lost_seq,0", (byte) -45);
                if (var2 != null) {
                  oo.field_v[0] = sc.a((byte) 115, var2);
                }
                var2 = fg.a("reconnect_lost_seq,1", (byte) -45);
                if (null != var2) {
                  oo.field_v[1] = sc.a((byte) 117, var2);
                }
                var2 = fg.a("reconnect_lost_seq,2", (byte) -45);
                if (var2 != null) {
                  oo.field_v[2] = sc.a((byte) 93, var2);
                }
                var2 = fg.a("reconnect_lost_seq,3", (byte) -45);
                if (var2 != null) {
                  oo.field_v[3] = sc.a((byte) 110, var2);
                }
                var2 = fg.a("reconnect_lost", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 89, var2);
                }
                var2 = fg.a("reconnect_restored", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 100, var2);
                }
                var2 = fg.a("reconnect_please_check", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 104, var2);
                }
                var2 = fg.a("reconnect_wait", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 90, var2);
                }
                var2 = fg.a("reconnect_retry", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 98, var2);
                }
                var2 = fg.a("reconnect_resume", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 120, var2);
                }
                var2 = fg.a("reconnect_or", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 121, var2);
                }
                var2 = fg.a("reconnect_exitfs", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 107, var2);
                }
                var2 = fg.a("reconnect_exitfs_quit", (byte) -45);
            }
            void runChunk3() throws java.lang.RuntimeException {
                if (var2 != null) {
                  sc.a((byte) 102, var2);
                }
                var2 = fg.a("reconnect_quit", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 112, var2);
                }
                var2 = fg.a("reconnect_check_fs", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 127, var2);
                }
                var2 = fg.a("reconnect_check_nonfs", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 90, var2);
                }
                var2 = fg.a("fs_accept_beforeaccept", (byte) -45);
                if (var2 != null) {
                  tc.field_C = sc.a((byte) 120, var2);
                }
                var2 = fg.a("fs_button_accept", (byte) -45);
                if (var2 != null) {
                  ln.field_R = sc.a((byte) 120, var2);
                }
                var2 = fg.a("fs_accept_afteraccept", (byte) -45);
                if (null != var2) {
                  li.field_G = sc.a((byte) 127, var2);
                }
                var2 = fg.a("fs_button_cancel", (byte) -45);
                if (null != var2) {
                  ki.field_t = sc.a((byte) 90, var2);
                }
                var2 = fg.a("fs_accept_aftercancel", (byte) -45);
                if (null != var2) {
                  we.field_d = sc.a((byte) 121, var2);
                }
                var2 = fg.a("fs_accept_countdown_sing", (byte) -45);
                if (var2 != null) {
                  dm.field_F = sc.a((byte) 98, var2);
                }
                var2 = fg.a("fs_accept_countdown_pl", (byte) -45);
                if (null != var2) {
                  bo.field_b = sc.a((byte) 88, var2);
                }
                var2 = fg.a("fs_nonmember", (byte) -45);
                if (var2 != null) {
                  oc.field_d = sc.a((byte) 124, var2);
                }
                var2 = fg.a("fs_button_close", (byte) -45);
                if (null != var2) {
                  dd.field_e = sc.a((byte) 109, var2);
                }
                var2 = fg.a("fs_button_members", (byte) -45);
                if (var2 != null) {
                  la.field_e = sc.a((byte) 99, var2);
                }
                var2 = fg.a("fs_unavailable", (byte) -45);
                if (var2 != null) {
                  of.field_l = sc.a((byte) 115, var2);
                }
                var2 = fg.a("fs_unavailable_try_signed_applet", (byte) -45);
                if (null != var2) {
                  wi.field_j = sc.a((byte) 103, var2);
                }
                var2 = fg.a("fs_focus", (byte) -45);
                if (null != var2) {
                  ki.field_w = sc.a((byte) 115, var2);
                }
                var2 = fg.a("fs_focus_or_resolution", (byte) -45);
                if (var2 != null) {
                  ch.field_f = sc.a((byte) 109, var2);
                }
                var2 = fg.a("fs_timeout", (byte) -45);
                if (var2 != null) {
                  fl.field_d = sc.a((byte) 109, var2);
                }
                var2 = fg.a("fs_button_tryagain", (byte) -45);
                if (null != var2) {
                  sl.field_R = sc.a((byte) 125, var2);
                }
                var2 = fg.a("graphics_ui_fs_countdown", (byte) -45);
                if (null != var2) {
                  p.field_f = sc.a((byte) 104, var2);
                }
                var2 = fg.a("mb_caption_title", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 104, var2);
                }
                var2 = fg.a("mb_including_gamename", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 102, var2);
                }
                var2 = fg.a("mb_full_access_1", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 104, var2);
                }
                var2 = fg.a("mb_full_access_2", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 90, var2);
                }
                var2 = fg.a("mb_achievement_count_1", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 120, var2);
                }
                var2 = fg.a("mb_achievement_count_2", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 103, var2);
                }
                var2 = fg.a("mb_exclusive_1", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 103, var2);
                }
                var2 = fg.a("mb_exclusive_2", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 127, var2);
                }
                var2 = fg.a("me_extra_benefits", (byte) -45);
                if (var2 != null) {
                  mm.field_r = sc.a((byte) 124, var2);
                }
                var2 = fg.a("hs_friend_tip", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 126, var2);
                }
                var2 = fg.a("hs_friend_tip_multi", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 99, var2);
                }
                var2 = fg.a("hs_mode_name,0", (byte) -45);
                if (null != var2) {
                  lh.field_e[0] = sc.a((byte) 116, var2);
                }
                var2 = fg.a("hs_mode_name,1", (byte) -45);
                if (null != var2) {
                  lh.field_e[1] = sc.a((byte) 125, var2);
                }
                var2 = fg.a("hs_mode_name,2", (byte) -45);
                if (null != var2) {
                  lh.field_e[2] = sc.a((byte) 102, var2);
                }
                var2 = fg.a("rating_mode_name,0", (byte) -45);
                if (null != var2) {
                  mk.field_P[0] = sc.a((byte) 124, var2);
                }
                var2 = fg.a("rating_mode_name,1", (byte) -45);
                if (null != var2) {
                  mk.field_P[1] = sc.a((byte) 125, var2);
                }
                var2 = fg.a("rating_mode_long_name,0", (byte) -45);
                if (var2 != null) {
                  re.field_t[0] = sc.a((byte) 121, var2);
                }
                var2 = fg.a("rating_mode_long_name,1", (byte) -45);
                if (null != var2) {
                  re.field_t[1] = sc.a((byte) 109, var2);
                }
                var2 = fg.a("graphics_config_fixed_size", (byte) -45);
                if (var2 != null) {
                  ci.field_b = sc.a((byte) 97, var2);
                }
                var2 = fg.a("graphics_config_resizable", (byte) -45);
                if (var2 != null) {
                  fo.field_f = sc.a((byte) 108, var2);
                }
                var2 = fg.a("graphics_config_fullscreen", (byte) -45);
                if (null != var2) {
                  oj.field_g = sc.a((byte) 126, var2);
                }
                var2 = fg.a("graphics_config_done", (byte) -45);
                if (null != var2) {
                  lm.field_a = sc.a((byte) 89, var2);
                }
                var2 = fg.a("graphics_config_apply", (byte) -45);
                if (null != var2) {
                  hj.field_e = sc.a((byte) 98, var2);
                }
                var2 = fg.a("graphics_config_title", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 114, var2);
                }
                var2 = fg.a("graphics_config_instruction", (byte) -45);
                if (null != var2) {
                  field_b = sc.a((byte) 115, var2);
                }
                var2 = fg.a("graphics_config_need_memory", (byte) -45);
                if (var2 != null) {
                  tm.field_c = sc.a((byte) 122, var2);
                }
                var2 = fg.a("pleasewait_dotdotdot", (byte) -45);
                if (var2 != null) {
                  ba.field_f = sc.a((byte) 101, var2);
                }
                var2 = fg.a("serviceunavailable", (byte) -45);
                if (var2 != null) {
                  rk.field_R = sc.a((byte) 114, var2);
                }
                var2 = fg.a("createtouse", (byte) -45);
                if (var2 != null) {
                  hg.field_c = sc.a((byte) 88, var2);
                }
                if (param0 != -84) {
                  finished = true; return;
                }
                var2 = fg.a("achievementsoffline", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 96, var2);
                }
                var2 = fg.a("warning", (byte) -45);
                if (null != var2) {
                  sc.a((byte) 103, var2);
                }
                var2 = fg.a("DEFAULT_PLAYER_NAME", (byte) -45);
                if (var2 != null) {
                  ob.field_ib = sc.a((byte) 92, var2);
                }
                var2 = fg.a("mustlogin1", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 86, var2);
                }
                var2 = fg.a("mustlogin2,1", (byte) -45);
                if (null != var2) {
                  ff.field_f[1] = sc.a((byte) 121, var2);
                }
                var2 = fg.a("mustlogin2,2", (byte) -45);
                if (var2 != null) {
                  ff.field_f[2] = sc.a((byte) 120, var2);
                }
                var2 = fg.a("mustlogin2,3", (byte) -45);
                if (null != var2) {
                  ff.field_f[3] = sc.a((byte) 94, var2);
                }
                var2 = fg.a("mustlogin2,4", (byte) -45);
                if (var2 != null) {
                  ff.field_f[4] = sc.a((byte) 87, var2);
                }
                var2 = fg.a("mustlogin2,5", (byte) -45);
                if (null != var2) {
                  ff.field_f[5] = sc.a((byte) 101, var2);
                }
                var2 = fg.a("mustlogin2,6", (byte) -45);
                if (var2 != null) {
                  ff.field_f[6] = sc.a((byte) 113, var2);
                }
                var2 = fg.a("mustlogin2,7", (byte) -45);
                if (null != var2) {
                  ff.field_f[7] = sc.a((byte) 116, var2);
                }
                var2 = fg.a("mustlogin3,1", (byte) -45);
                if (null != var2) {
                  kb.field_c[1] = sc.a((byte) 97, var2);
                }
                var2 = fg.a("mustlogin3,2", (byte) -45);
                if (null != var2) {
                  kb.field_c[2] = sc.a((byte) 100, var2);
                }
                var2 = fg.a("mustlogin3,3", (byte) -45);
                if (null != var2) {
                  kb.field_c[3] = sc.a((byte) 109, var2);
                }
                var2 = fg.a("mustlogin3,4", (byte) -45);
                if (null != var2) {
                  kb.field_c[4] = sc.a((byte) 113, var2);
                }
                var2 = fg.a("mustlogin3,5", (byte) -45);
                if (null != var2) {
                  kb.field_c[5] = sc.a((byte) 89, var2);
                }
                var2 = fg.a("mustlogin3,6", (byte) -45);
                if (null != var2) {
                  kb.field_c[6] = sc.a((byte) 116, var2);
                }
                var2 = fg.a("mustlogin3,7", (byte) -45);
                if (var2 != null) {
                  kb.field_c[7] = sc.a((byte) 106, var2);
                }
                var2 = fg.a("discard", (byte) -45);
                if (var2 != null) {
                  lh.field_a = sc.a((byte) 121, var2);
                }
                var2 = fg.a("mustlogin4,1", (byte) -45);
                if (null != var2) {
                  md.field_a[1] = sc.a((byte) 127, var2);
                }
                var2 = fg.a("mustlogin4,2", (byte) -45);
                if (null != var2) {
                  md.field_a[2] = sc.a((byte) 87, var2);
                }
                var2 = fg.a("mustlogin4,3", (byte) -45);
                if (null != var2) {
                  md.field_a[3] = sc.a((byte) 122, var2);
                }
                var2 = fg.a("mustlogin4,4", (byte) -45);
                if (null != var2) {
                  md.field_a[4] = sc.a((byte) 103, var2);
                }
                var2 = fg.a("mustlogin4,5", (byte) -45);
                if (null != var2) {
                  md.field_a[5] = sc.a((byte) 106, var2);
                }
                var2 = fg.a("mustlogin4,6", (byte) -45);
                if (null != var2) {
                  md.field_a[6] = sc.a((byte) 112, var2);
                }
                var2 = fg.a("mustlogin4,7", (byte) -45);
                if (var2 != null) {
                  md.field_a[7] = sc.a((byte) 120, var2);
                }
                var2 = fg.a("mustlogin_notloggedin", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 88, var2);
                }
                var2 = fg.a("mustlogin_alternate,1", (byte) -45);
                if (null != var2) {
                  jl.field_g[1] = sc.a((byte) 86, var2);
                }
                var2 = fg.a("mustlogin_alternate,2", (byte) -45);
                if (var2 != null) {
                  jl.field_g[2] = sc.a((byte) 99, var2);
                }
                var2 = fg.a("mustlogin_alternate,3", (byte) -45);
                if (null != var2) {
                  jl.field_g[3] = sc.a((byte) 91, var2);
                }
                var2 = fg.a("mustlogin_alternate,4", (byte) -45);
                if (null != var2) {
                  jl.field_g[4] = sc.a((byte) 89, var2);
                }
                var2 = fg.a("mustlogin_alternate,5", (byte) -45);
                if (null != var2) {
                  jl.field_g[5] = sc.a((byte) 112, var2);
                }
                var2 = fg.a("mustlogin_alternate,6", (byte) -45);
                if (null != var2) {
                  jl.field_g[6] = sc.a((byte) 98, var2);
                }
                var2 = fg.a("mustlogin_alternate,7", (byte) -45);
                if (null != var2) {
                  jl.field_g[7] = sc.a((byte) 101, var2);
                }
                var2 = fg.a("subscription_cost_monthly,0", (byte) -45);
                if (var2 != null) {
                  gk.field_f[0] = sc.a((byte) 88, var2);
                }
                var2 = fg.a("subscription_cost_monthly,1", (byte) -45);
                if (var2 != null) {
                  gk.field_f[1] = sc.a((byte) 90, var2);
                }
                var2 = fg.a("subscription_cost_monthly,2", (byte) -45);
                if (null != var2) {
                  gk.field_f[2] = sc.a((byte) 88, var2);
                }
                var2 = fg.a("subscription_cost_monthly,3", (byte) -45);
                if (null != var2) {
                  gk.field_f[3] = sc.a((byte) 122, var2);
                }
                var2 = fg.a("subscription_cost_monthly,4", (byte) -45);
                if (var2 != null) {
                  gk.field_f[4] = sc.a((byte) 86, var2);
                }
                var2 = fg.a("subscription_cost_monthly,5", (byte) -45);
                if (var2 != null) {
                  gk.field_f[5] = sc.a((byte) 113, var2);
                }
                var2 = fg.a("subscription_cost_monthly,6", (byte) -45);
                if (var2 != null) {
                  gk.field_f[6] = sc.a((byte) 92, var2);
                }
                var2 = fg.a("subscription_cost_monthly,7", (byte) -45);
                if (var2 != null) {
                  gk.field_f[7] = sc.a((byte) 102, var2);
                }
                var2 = fg.a("subscription_cost_monthly,8", (byte) -45);
                if (null != var2) {
                  gk.field_f[8] = sc.a((byte) 102, var2);
                }
                var2 = fg.a("subscription_cost_monthly,9", (byte) -45);
                if (var2 != null) {
                  gk.field_f[9] = sc.a((byte) 107, var2);
                }
                var2 = fg.a("subscription_cost_monthly,10", (byte) -45);
                if (var2 != null) {
                  gk.field_f[10] = sc.a((byte) 127, var2);
                }
                var2 = fg.a("subscription_cost_monthly,11", (byte) -45);
                if (var2 != null) {
                  gk.field_f[11] = sc.a((byte) 115, var2);
                }
                var2 = fg.a("subscription_cost_monthly,12", (byte) -45);
                if (var2 != null) {
                  gk.field_f[12] = sc.a((byte) 101, var2);
                }
                var2 = fg.a("sentence_separator", (byte) -45);
                if (var2 != null) {
                  sc.a((byte) 114, var2);
                }
                ld.field_q = null;
            }
            void run() {
                var3 = ArcanistsMulti.field_G ? 1 : 0;
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
                  stackIn_2624_0 = (RuntimeException) (var2_ref);
                  stackIn_2624_1 = new StringBuilder().append("on.A(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_2625_2 = "null";
                  } else {
                    stackIn_2625_2 = "{...}";
                  }
                  throw aa.a((Throwable) ((Object) stackIn_2624_0), ((StringBuilder) (Object) stackIn_2624_1).append(stackIn_2625_2).append(')').toString());
                }
                if (dc.field_b != 0) {
                  ArcanistsMulti.field_G = (var3 == 0);
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    static {
        field_g = -1;
        field_a = "Who can join";
        field_i = "You do not have a suitable number of players for the current options.";
        field_b = "Large screen sizes and high resolutions may cause the game to run slowly. If so, try using lower resolutions or screen sizes.";
    }
}
