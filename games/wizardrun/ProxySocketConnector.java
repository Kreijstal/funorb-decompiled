/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ProxySocketConnector extends SocketConnector {
    static QuickChatDynamicCommand field_f;
    static ProgressDialog field_e;
    private java.net.ProxySelector field_g;

    final static void loadClientText(int param0, ResourceArchive param1) {
        class ClientTextLoader {
            RuntimeException stackIn_2617_0;
            StringBuilder stackIn_2617_1;
            String stackIn_2618_2;
            boolean stackIn_2626_0;
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
                this.stackIn_2617_0 = null;
                this.stackIn_2617_1 = null;
                this.stackIn_2618_2 = null;
                this.stackIn_2626_0 = false;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void loadLoginAccountAndReportTexts() throws java.lang.RuntimeException {
                FramedButtonPainter.field_r = param1;
                var2 = AchievementUnlock.loadNamedResource("loginm3", (byte) -113);
                if (var2 != null) {
                  ArchiveLoadingStage.field_b = AccountFormTextHelpers.a((byte) 115, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("loginm2", (byte) -114);
                if (var2 != null) {
                  TextLayoutLine.field_d = AccountFormTextHelpers.a((byte) 108, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("loginm1", (byte) -108);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 118, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("idlemessage20min", (byte) -99);
                if (null != var2) {
                  RasterBuffer.field_e = AccountFormTextHelpers.a((byte) 110, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("error_js5crc", (byte) -115);
                if (var2 != null) {
                  ScoreSubmission.field_r = AccountFormTextHelpers.a((byte) 106, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("error_js5io", (byte) -102);
                if (var2 != null) {
                  MusicPatchLoader.field_f = AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("error_js5connect_full", (byte) -109);
                if (var2 != null) {
                  AccountFormText.field_d = AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("error_js5connect", (byte) -118);
                if (var2 != null) {
                  SingleChildWidget.field_C = AccountFormTextHelpers.a((byte) 96, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("login_gameupdated", (byte) -110);
                if (var2 != null) {
                  LoginChoicePanel.field_L = AccountFormTextHelpers.a((byte) 118, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_unable", (byte) -119);
                if (var2 != null) {
                  NameAvailabilityFactory.field_b = AccountFormTextHelpers.a((byte) 119, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_ineligible", (byte) -113);
                if (null != var2) {
                  HyperlinkPainter.field_f = AccountFormTextHelpers.a((byte) 108, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("usernameprompt", (byte) -106);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 91, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("passwordprompt", (byte) -126);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 110, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("andagainprompt", (byte) -98);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("ticketing_read", (byte) -124);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 86, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("ticketing_ignore", (byte) -117);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 125, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("ticketing_oneunread", (byte) -121);
                if (var2 != null) {
                  SocketConnector.field_d = AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("ticketing_xunread", (byte) -115);
                if (var2 != null) {
                  RankingRequest.field_m = AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("ticketing_gotowebsite", (byte) -111);
                if (null != var2) {
                  IntrusiveDequeCursor.field_c = AccountFormTextHelpers.a((byte) 113, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("ticketing_waitingformessages", (byte) -118);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_on", (byte) -115);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 85, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_friends", (byte) -120);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_off", (byte) -116);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 99, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_lobby", (byte) -117);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 96, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_public", (byte) -115);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_ignore", (byte) -98);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 99, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_tips", (byte) -127);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 109, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_game", (byte) -128);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 114, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_private", (byte) -107);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_x_entered_game", (byte) -115);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 115, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_x_joined_your_game", (byte) -111);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 101, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_x_entered_other_game", (byte) -103);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 127, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_x_left_lobby", (byte) -95);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_x_lost_con", (byte) -103);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 86, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_x_cannot_join_full", (byte) -117);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 115, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_x_cannot_join_inprogress", (byte) -110);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_x_declined_invite", (byte) -98);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_x_withdrew_request", (byte) -106);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 101, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_x_removed", (byte) -111);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 108, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_x_dropped_out", (byte) -98);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 127, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_entered_other_game", (byte) -100);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_game_is_full", (byte) -119);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 108, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_game_has_started", (byte) -113);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 114, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_you_declined_invite", (byte) -108);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 94, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_invite_withdrawn", (byte) -119);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 85, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_request_declined", (byte) -109);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 123, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_request_withdrawn", (byte) -127);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_all_players_have_left", (byte) -101);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 105, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_lobby_name", (byte) -123);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 90, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_lobby_rating", (byte) -125);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 98, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_lobby_friend_add", (byte) -106);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 115, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_lobby_friend_rm", (byte) -122);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_lobby_name_add", (byte) -100);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 114, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_lobby_name_rm", (byte) -110);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 101, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_lobby_location", (byte) -114);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 117, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_gamelist_all_games", (byte) -101);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 125, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_gamelist_status", (byte) -110);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 116, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_gamelist_owner", (byte) -119);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 121, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_gamelist_players", (byte) -124);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 85, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_gamelist_avg_rating", (byte) -118);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 124, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_gamelist_options", (byte) -116);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 115, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_gamelist_elapsed_time", (byte) -111);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 125, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_play_rated", (byte) -123);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 90, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_create_unrated", (byte) -117);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 114, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_options", (byte) -96);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 118, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_options_whocanjoin", (byte) -107);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 86, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_options_players", (byte) -109);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 103, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_options_dontmind", (byte) -126);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 111, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_options_allow_spectate", (byte) -126);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 113, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_options_ratedgametype", (byte) -115);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("yes", (byte) -122);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("no", (byte) -124);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 115, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_invite_players", (byte) -113);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("close", (byte) -104);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("add_x_to_friends", (byte) -120);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 95, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("add_x_to_ignore", (byte) -114);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rm_x_from_friends", (byte) -103);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 105, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rm_x_from_ignore", (byte) -117);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("send_pm_to_x", (byte) -111);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("send_qc_to_x", (byte) -118);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("send_pm", (byte) -111);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 108, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("invite_accept_xs_game", (byte) -101);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 127, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("invite_decline_xs_game", (byte) -106);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 106, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("join_xs_game", (byte) -110);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 118, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("join_request_xs_game", (byte) -128);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("join_withdraw_request_xs_game", (byte) -95);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 125, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_gameopt_kick_x_from_this_game", (byte) -124);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 112, var2);
                }
                if (param0 != 0) {
                  finished = true; return;
                }
                var2 = AchievementUnlock.loadNamedResource("mu_gameopt_withdraw_invite_to_x", (byte) -98);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 113, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_gameopt_accept_x_into_game", (byte) -120);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 102, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_gameopt_reject_x_from_game", (byte) -100);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_gameopt_invite_x_to_game", (byte) -107);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("report_x_for_abuse", (byte) -118);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unable_to_send_message_password_a", (byte) -111);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 127, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unable_to_send_message_password_b", (byte) -127);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_lobby_show_all", (byte) -98);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_lobby_friends_only", (byte) -128);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 119, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_lobby_friends", (byte) -100);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_lobby_hide", (byte) -119);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_game_show_all", (byte) -112);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 108, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_game_friends_only", (byte) -114);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 114, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_game_friends", (byte) -99);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 110, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_game_hide", (byte) -113);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_pm_show_all", (byte) -110);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_pm_friends_only", (byte) -119);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 86, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_pm_friends", (byte) -104);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 124, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mu_chat_invisible_and_silent_mode", (byte) -96);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 99, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("you_have_been_removed_from_xs_game", (byte) -100);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 121, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("your_rating_is_x", (byte) -110);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 90, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("you_are_on_x_server", (byte) -122);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rated_game", (byte) -122);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unrated_game", (byte) -102);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rated_game_tips", (byte) -107);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 87, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("searching_for_opponent_singular", (byte) -122);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 86, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("searching_for_opponents_plural", (byte) -99);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("find_opponent_singular", (byte) -102);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("find_opponents_plural", (byte) -95);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 116, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rated_game_tips_setup_singular", (byte) -128);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 117, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rated_game_tips_setup_plural", (byte) -99);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 111, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("waiting_to_start_hint", (byte) -123);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 115, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("your_game", (byte) -107);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 111, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("game_full", (byte) -125);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("join_requests_one", (byte) -100);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("join_requests_many", (byte) -116);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 108, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("xs_game", (byte) -99);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("waiting_for_x_to_start_game", (byte) -107);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 90, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("game_options_changed", (byte) -118);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 124, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("players_x_of_y", (byte) -118);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 86, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("message_lobby", (byte) -116);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 115, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("quickchat_lobby", (byte) -110);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 95, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("message_game", (byte) -105);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 105, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("message_team", (byte) -128);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("quickchat_game", (byte) -128);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("kick", (byte) -125);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("inviting_x", (byte) -101);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("x_wants_to_join", (byte) -105);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 106, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("accept", (byte) -99);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 103, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reject", (byte) -104);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 86, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("invite", (byte) -108);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 102, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("status_concluded", (byte) -98);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 103, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("status_spectate", (byte) -120);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 95, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("status_playing", (byte) -125);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 116, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("status_join", (byte) -116);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("status_private", (byte) -127);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("status_full", (byte) -97);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("players_in_game", (byte) -98);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 117, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("you_are_invited_to_xs_game", (byte) -109);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("asking_to_join_xs_game", (byte) -103);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("who_can_join", (byte) -97);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 93, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("you_can_join", (byte) -113);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 95, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("you_can_ask_to_join", (byte) -118);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("you_cannot_join_in_progress", (byte) -95);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("you_can_spectate", (byte) -96);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("you_can_not_spectate", (byte) -124);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 95, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("spectate_xs_game", (byte) -111);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 127, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("hide_players_in_xs_game", (byte) -111);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 116, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("show_players_in_xs_game", (byte) -115);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 114, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("connecting_to_friend_server_twoline", (byte) -112);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 106, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("loading", (byte) -108);
                if (null != var2) {
                  NameSuggestionsPanel.field_G = AccountFormTextHelpers.a((byte) 101, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("offline", (byte) -106);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 104, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("multiconst_invite_only", (byte) -113);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 109, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("multiconst_clan", (byte) -103);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 93, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("multiconst_friends", (byte) -111);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 124, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("multiconst_similar_rating", (byte) -106);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 86, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("multiconst_open", (byte) -110);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("no_options_available", (byte) -113);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reportabuse", (byte) -100);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 118, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("presstabtochat", (byte) -124);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 95, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("pressf10toquickchat", (byte) -98);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("dob_chatdisabled", (byte) -95);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 93, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("dob_enterforchat", (byte) -117);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("tab_hidechattemporarily", (byte) -107);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("esc_cancelprivatemessage", (byte) -106);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("esc_cancelthisline", (byte) -118);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 116, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("privatequickchat_from_x", (byte) -112);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 106, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("privatequickchat_to_x", (byte) -121);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 117, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("privatechat_blankarea_explanation", (byte) -118);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 103, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("publicchat_unavailable_ratedgame", (byte) -112);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("privatechat_friend_offline", (byte) -99);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 104, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("privatechat_friend_notlisted", (byte) -95);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 111, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("chatviewscrolledup", (byte) -121);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 96, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("thisisrunescapeclan", (byte) -97);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 121, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("thisisrunescapeclan_notowner", (byte) -115);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("runescapeclan", (byte) -112);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 93, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rated_membersonly", (byte) -125);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 90, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_membersonly", (byte) -107);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_1moreratedgame", (byte) -118);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 113, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_moreratedgames", (byte) -96);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_needrating", (byte) -122);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_unratedonly", (byte) -113);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_notunlocked", (byte) -97);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 109, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_cannotbecombined1", (byte) -102);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 102, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_cannotbecombined2", (byte) -120);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 93, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_playernotmember", (byte) -111);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_younotmember", (byte) -123);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_playerneedsrating", (byte) -124);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_youneedrating", (byte) -95);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 86, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_playerneedsratedgames", (byte) -113);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 109, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_youneedratedgames", (byte) -124);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 86, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_playerneeds1ratedgame", (byte) -104);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 121, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_youneed1ratedgame", (byte) -107);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_playerhasntunlocked", (byte) -114);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_youhaventunlocked", (byte) -103);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 115, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_trychanging1", (byte) -107);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_trychanging2", (byte) -101);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 101, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_needchanging1", (byte) -120);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 105, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_needchanging2", (byte) -97);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 86, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_mightchange", (byte) -119);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 109, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_playersdontqualify", (byte) -104);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 114, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_playersdontqualify_selectgametab", (byte) -105);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 90, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_unselectedoptions", (byte) -108);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 114, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_pleaseselectoption1", (byte) -109);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 87, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_pleaseselectoption2", (byte) -99);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_badnumplayers", (byte) -98);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_inviteplayers_or_trychanging1", (byte) -115);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_inviteplayers_or_trychanging2", (byte) -101);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_novalidcombos", (byte) -118);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 99, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameopt_pleasetrychanging", (byte) -124);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 84, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("ra_title", (byte) -123);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 98, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("ra_mutethisplayer", (byte) -103);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 85, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("ra_suggestmute", (byte) -99);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 102, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("ra_intro", (byte) -95);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 99, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("ra_intro_no_name", (byte) -98);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 114, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("ra_explanation", (byte) -100);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 117, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rule_pillar_0", (byte) -114);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 103, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rule_0_0", (byte) -128);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 123, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rule_0_1", (byte) -117);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rule_0_2", (byte) -102);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 85, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rule_0_3", (byte) -118);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 87, var2);
                }
            }
            void loadRuleSocialAndResourceTexts() throws java.lang.RuntimeException {
                var2 = AchievementUnlock.loadNamedResource("rule_0_4", (byte) -127);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 111, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rule_0_5", (byte) -128);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 124, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rule_pillar_1", (byte) -103);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 94, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rule_1_0", (byte) -116);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rule_1_1", (byte) -109);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 119, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rule_1_2", (byte) -112);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 105, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rule_1_3", (byte) -104);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 118, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rule_1_4", (byte) -121);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rule_pillar_2", (byte) -104);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 109, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rule_2_0", (byte) -106);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 117, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rule_2_1", (byte) -127);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rule_2_2", (byte) -98);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 96, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("createafreeaccount", (byte) -101);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 114, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("cancel", (byte) -128);
                if (null != var2) {
                  StringPaddingHelpers.field_a = AccountFormTextHelpers.a((byte) 111, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("pleaselogintoplay", (byte) -123);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("pleaselogin", (byte) -116);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("pleaselogin_member", (byte) -117);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 119, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("invaliduserorpass", (byte) -116);
                if (var2 != null) {
                  DateFormattingHelpers.field_a = AccountFormTextHelpers.a((byte) 115, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("pleasetryagain", (byte) -121);
                if (var2 != null) {
                  MeshMaterial.field_g = AccountFormTextHelpers.a((byte) 113, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("pleasereenterpass", (byte) -97);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 90, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("playfreeversion", (byte) -113);
                if (var2 != null) {
                  NodeHashTableIterator.field_b = AccountFormTextHelpers.a((byte) 96, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reloadgame", (byte) -116);
                if (null != var2) {
                  GameApplet.field_j = AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("toserverlist", (byte) -109);
                if (var2 != null) {
                  CheckboxPainter.field_g = AccountFormTextHelpers.a((byte) 118, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("tocustomersupport", (byte) -117);
                if (null != var2) {
                  EmailLoginCredentials.field_h = AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("changedisplayname", (byte) -120);
                if (var2 != null) {
                  SecondaryNodeDeque.field_a = AccountFormTextHelpers.a((byte) 84, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("returntohomepage", (byte) -104);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 102, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("justplay", (byte) -119);
                if (var2 != null) {
                  DualLinkDeque.field_b = AccountFormTextHelpers.a((byte) 116, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("justplay_excl", (byte) -111);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 116, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("login", (byte) -119);
                if (null != var2) {
                  ByteStorage.field_a = AccountFormTextHelpers.a((byte) 98, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("goback", (byte) -123);
                if (null != var2) {
                  SpriteAlphaState.field_c = AccountFormTextHelpers.a((byte) 110, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("otheroptions", (byte) -118);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 119, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("proceed", (byte) -109);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 94, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("connectingtoserver", (byte) -101);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 98, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("pleasewait", (byte) -103);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("logging_in", (byte) -102);
                if (var2 != null) {
                  LoginCredentialKind.field_c = AccountFormTextHelpers.a((byte) 104, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reconnect", (byte) -123);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 91, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("backtoerror", (byte) -112);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("pleasecheckinternet", (byte) -123);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 113, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("attemptingtoreconnect", (byte) -111);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 121, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("connectionlost_reconnecting", (byte) -114);
                if (var2 != null) {
                  LoginCredentials.field_f = AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("connectionlost_withreason", (byte) -119);
                if (null != var2) {
                  MeshMaterial.field_d = AccountFormTextHelpers.a((byte) 110, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("passwordverificationrequired", (byte) -121);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 106, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("invalidpass", (byte) -95);
                if (null != var2) {
                  PcmResampler.field_f = AccountFormTextHelpers.a((byte) 127, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("retry", (byte) -119);
                if (var2 != null) {
                  LoadingMessageHelpers.field_a = AccountFormTextHelpers.a((byte) 91, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("back", (byte) -104);
                if (null != var2) {
                  IsaacRandom.field_h = AccountFormTextHelpers.a((byte) 93, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("exitfullscreenmode", (byte) -95);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 117, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("quittowebsite", (byte) -119);
                if (var2 != null) {
                  ReflectionCheck.field_q = AccountFormTextHelpers.a((byte) 99, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("connectionrestored", (byte) -105);
                if (var2 != null) {
                  BrowserUrlLauncher.field_d = AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("warning_ifyouquit", (byte) -123);
                if (var2 != null) {
                  BrowserUrlLauncher.field_a = AccountFormTextHelpers.a((byte) 90, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("warning_ifyouquitorleavepage", (byte) -110);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("resubscribe_withoutlosing_fs", (byte) -122);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 85, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("resubscribe_withoutlosing", (byte) -112);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 103, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("customersupport_withoutlosing_fs", (byte) -126);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 87, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("customersupport_withoutlosing", (byte) -115);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("js5help_withoutlosing_fs", (byte) -104);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 127, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("js5help_withoutlosing", (byte) -118);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 123, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("checkinternet_withoutlosing_fs", (byte) -98);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("checkinternet_withoutlosing", (byte) -117);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_intro", (byte) -104);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 99, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_sameaccounttip_unnamed", (byte) -100);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 90, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("dateofbirthprompt", (byte) -95);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 110, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("fetchingcountrylist", (byte) -116);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 110, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("countryprompt", (byte) -124);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 121, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("countrylisterror", (byte) -124);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 115, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("theonlypersonalquestions", (byte) -121);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 105, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_submittingdata", (byte) -127);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 95, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("check", (byte) -119);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 127, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_pleasechooseausername", (byte) -102);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 103, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_usernameblurb", (byte) -101);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("checkingavailability", (byte) -107);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 116, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("checking", (byte) -97);
                if (var2 != null) {
                  PasswordFieldPainter.field_v = AccountFormTextHelpers.a((byte) 109, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_namealreadytaken", (byte) -107);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 124, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_sameaccounttip_named", (byte) -108);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_nosuggestions", (byte) -116);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alternativelygoback", (byte) -102);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_available", (byte) -97);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_willnowshowtermsandconditions", (byte) -112);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 125, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("fetchingterms", (byte) -112);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("termserror", (byte) -103);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_iagree", (byte) -107);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 108, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_idisagree", (byte) -104);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 109, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_pleasescrolldowntoaccept", (byte) -114);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 96, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_linkaddress", (byte) -122);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 109, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("openinpopupwindow", (byte) -126);
                if (var2 != null) {
                  AccountCreationForm.field_R = AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create", (byte) -97);
                if (null != var2) {
                  UiThemeSetupHelpers.field_d = AccountFormTextHelpers.a((byte) 99, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_pleasechooseapassword", (byte) -96);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 90, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_passwordblurb", (byte) -101);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 85, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_nevergivepassword", (byte) -110);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 87, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("creatingyouraccount", (byte) -123);
                if (var2 != null) {
                  ProgressQuery.field_o = AccountFormTextHelpers.a((byte) 102, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_youmustaccept", (byte) -115);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_passwordsdifferent", (byte) -109);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 99, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_success", (byte) -97);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 116, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("day", (byte) -126);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 106, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("month", (byte) -98);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 84, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("year", (byte) -112);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("monthnames,0", (byte) -110);
                if (null != var2) {
                  IsaacPacketBuffer.field_q[0] = AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("monthnames,1", (byte) -97);
                if (var2 != null) {
                  IsaacPacketBuffer.field_q[1] = AccountFormTextHelpers.a((byte) 101, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("monthnames,2", (byte) -106);
                if (null != var2) {
                  IsaacPacketBuffer.field_q[2] = AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("monthnames,3", (byte) -112);
                if (var2 != null) {
                  IsaacPacketBuffer.field_q[3] = AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("monthnames,4", (byte) -115);
                if (var2 != null) {
                  IsaacPacketBuffer.field_q[4] = AccountFormTextHelpers.a((byte) 94, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("monthnames,5", (byte) -96);
                if (var2 != null) {
                  IsaacPacketBuffer.field_q[5] = AccountFormTextHelpers.a((byte) 98, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("monthnames,6", (byte) -102);
                if (null != var2) {
                  IsaacPacketBuffer.field_q[6] = AccountFormTextHelpers.a((byte) 125, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("monthnames,7", (byte) -98);
                if (var2 != null) {
                  IsaacPacketBuffer.field_q[7] = AccountFormTextHelpers.a((byte) 124, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("monthnames,8", (byte) -103);
                if (null != var2) {
                  IsaacPacketBuffer.field_q[8] = AccountFormTextHelpers.a((byte) 91, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("monthnames,9", (byte) -128);
                if (var2 != null) {
                  IsaacPacketBuffer.field_q[9] = AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("monthnames,10", (byte) -106);
                if (null != var2) {
                  IsaacPacketBuffer.field_q[10] = AccountFormTextHelpers.a((byte) 118, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("monthnames,11", (byte) -122);
                if (var2 != null) {
                  IsaacPacketBuffer.field_q[11] = AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_welcome", (byte) -116);
                if (var2 != null) {
                  RankingStatsDecoder.field_c = AccountFormTextHelpers.a((byte) 109, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_u13_welcome", (byte) -118);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 93, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_createanaccount", (byte) -108);
                if (null != var2) {
                  WhirlpoolHasher.field_h = AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_username", (byte) -95);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_displayname", (byte) -123);
                if (null != var2) {
                  AccountConsentPanel.field_E = AccountFormTextHelpers.a((byte) 110, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_password", (byte) -104);
                if (var2 != null) {
                  WhirlpoolHasher.field_d = AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_password_confirm", (byte) -107);
                if (var2 != null) {
                  RasterBuffer.field_i = AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_email", (byte) -100);
                if (var2 != null) {
                  NameAvailabilityFactory.field_d = AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_email_confirm", (byte) -97);
                if (null != var2) {
                  ErrorReportingHelpers.field_b = AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_age", (byte) -95);
                if (var2 != null) {
                  Base37Codec.field_a = AccountFormTextHelpers.a((byte) 103, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_u13_email", (byte) -95);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 104, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_u13_email_confirm", (byte) -111);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 110, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_dob", (byte) -124);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 85, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_country", (byte) -110);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alternatives_header", (byte) -117);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 103, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alternatives_select", (byte) -126);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 118, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_suggestions", (byte) -106);
                if (var2 != null) {
                  ArchiveRequest.field_p = AccountFormTextHelpers.a((byte) 119, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_more_suggestions", (byte) -110);
                if (var2 != null) {
                  PlatformActor.field_t = AccountFormTextHelpers.a((byte) 94, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_select_alternative", (byte) -112);
                if (null != var2) {
                  LevelDecodingHelpers.field_a = AccountFormTextHelpers.a((byte) 124, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_optin_news", (byte) -95);
                if (var2 != null) {
                  SettingsCookieReader.field_e = AccountFormTextHelpers.a((byte) 94, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_agreeterms", (byte) -110);
                if (null != var2) {
                  NineSliceFrame.field_b = AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_u13terms", (byte) -118);
                if (var2 != null) {
                  KeyboardQueueConsumer.field_b = AccountFormTextHelpers.a((byte) 116, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("login_username_email", (byte) -128);
                if (null != var2) {
                  ScoreSubmission.field_j = AccountFormTextHelpers.a((byte) 95, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("login_username", (byte) -111);
                if (var2 != null) {
                  FriendOrderingHelpers.field_b = AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("login_email", (byte) -120);
                if (null != var2) {
                  ProgressSubmission.field_q = AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("login_username_tooltip", (byte) -121);
                if (null != var2) {
                  MouseInputHandler.field_a = AccountFormTextHelpers.a((byte) 102, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("login_password_tooltip", (byte) -128);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 91, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("login_login_tooltip", (byte) -128);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("login_create_tooltip", (byte) -110);
                if (var2 != null) {
                  DelayedServerPacket.field_i = AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("login_justplay_tooltip", (byte) -128);
                if (var2 != null) {
                  ProxyAuthenticationException.field_a = AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("login_back_tooltip", (byte) -111);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("login_no_displayname", (byte) -112);
                if (null != var2) {
                  MouseWheelInput.field_d = AccountFormTextHelpers.a((byte) 116, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_username_tooltip", (byte) -127);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 96, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_username_hint", (byte) -105);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 121, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_displayname_tooltip", (byte) -125);
                if (null != var2) {
                  DiskCacheWorker.field_a = AccountFormTextHelpers.a((byte) 95, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_displayname_hint", (byte) -119);
                if (var2 != null) {
                  MonotonicClockHelpers.field_b = AccountFormTextHelpers.a((byte) 108, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_password_tooltip", (byte) -128);
                if (null != var2) {
                  GameShell.field_v = AccountFormTextHelpers.a((byte) 111, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_password_hint", (byte) -100);
                if (null != var2) {
                  LabeledField.field_H = AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_password_confirm_tooltip", (byte) -125);
                if (null != var2) {
                  GameMenu.field_s = AccountFormTextHelpers.a((byte) 94, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_email_tooltip", (byte) -103);
                if (null != var2) {
                  SettingsCookieReader.field_c = AccountFormTextHelpers.a((byte) 115, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_email_confirm_tooltip", (byte) -109);
                if (var2 != null) {
                  LogoAnimationLoader.field_e = AccountFormTextHelpers.a((byte) 116, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_age_tooltip", (byte) -104);
                if (null != var2) {
                  GameGraphicsResources.field_c = AccountFormTextHelpers.a((byte) 123, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_optin_news_tooltip", (byte) -117);
                if (var2 != null) {
                  Js5Index.field_o = AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_u13_email_tooltip", (byte) -98);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_u13_email_confirm_tooltip", (byte) -118);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_dob_tooltip", (byte) -106);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 121, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_country_tooltip", (byte) -104);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 124, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_optin_tooltip", (byte) -121);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 98, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_continue", (byte) -109);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 108, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_username_unavailable", (byte) -116);
                if (var2 != null) {
                  ArchiveLoadingPlan.field_e = AccountFormTextHelpers.a((byte) 94, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_username_available", (byte) -105);
                if (var2 != null) {
                  GameKeyHandler.field_d = AccountFormTextHelpers.a((byte) 115, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alert_namelength", (byte) -118);
                if (var2 != null) {
                  ValidationIndicator.field_J = AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alert_namechars", (byte) -106);
                if (var2 != null) {
                  AccountCreationForm.field_Q = AccountFormTextHelpers.a((byte) 108, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alert_nameleadingspace", (byte) -126);
                if (var2 != null) {
                  FullscreenFailureKind.field_c = AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alert_doublespace", (byte) -96);
                if (null != var2) {
                  WidgetPainter.field_g = AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alert_passchars", (byte) -112);
                if (var2 != null) {
                  ProgressSubmission.field_o = AccountFormTextHelpers.a((byte) 123, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alert_passrepeated", (byte) -126);
                if (null != var2) {
                  DraggableWidget.field_L = AccountFormTextHelpers.a((byte) 86, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alert_passlength", (byte) -121);
                if (var2 != null) {
                  QuickChatDynamicCommand.field_d = AccountFormTextHelpers.a((byte) 110, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alert_passcontainsname", (byte) -100);
                if (var2 != null) {
                  NetworkArchiveRequest.field_v = AccountFormTextHelpers.a((byte) 105, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alert_passcontainsemail", (byte) -98);
                if (var2 != null) {
                  NodeHashTableIterator.field_c = AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alert_passcontainsname_partial", (byte) -119);
                if (null != var2) {
                  LoginPacketBuilder.field_d = AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alert_checkname", (byte) -104);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alert_invalidemail", (byte) -112);
                if (var2 != null) {
                  ContentTransitionPhase.field_b = AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alert_email_unavailable", (byte) -113);
                if (var2 != null) {
                  IntrusiveNode.field_d = AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alert_invaliddate", (byte) -95);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alert_invalidage", (byte) -107);
                if (null != var2) {
                  WeightedLruCache.field_a = AccountFormTextHelpers.a((byte) 101, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alert_yearrange", (byte) -95);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 91, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_alert_mismatch", (byte) -108);
                if (null != var2) {
                  LogoAnimationLoader.field_h = AccountFormTextHelpers.a((byte) 85, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_passwordvalid", (byte) -118);
                if (var2 != null) {
                  RadialSelectorWidget.field_F = AccountFormTextHelpers.a((byte) 110, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_emailvalid", (byte) -115);
                if (null != var2) {
                  MarkerSliderPainter.field_h = AccountFormTextHelpers.a((byte) 124, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("create_account_success", (byte) -108);
                if (var2 != null) {
                  SpriteButtonPainter.field_v = AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("invalid_name", (byte) -125);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("cannot_add_yourself", (byte) -107);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 103, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unable_to_add_friend", (byte) -107);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 84, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unable_to_add_ignore", (byte) -96);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unable_to_delete_friend", (byte) -124);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 106, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unable_to_delete_ignore", (byte) -99);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 96, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("friendlistfull", (byte) -103);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 84, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("friendlistdupe", (byte) -110);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 91, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("friendnotfound", (byte) -118);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 94, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("ignorelistfull", (byte) -106);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 96, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("ignorelistdupe", (byte) -109);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 119, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("ignorenotfound", (byte) -107);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 99, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("removeignorefirst", (byte) -105);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("removefriendfirst", (byte) -122);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 98, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("enterfriend_add", (byte) -112);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("enterfriend_del", (byte) -103);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 104, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("enterignore_add", (byte) -125);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 90, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("enterignore_del", (byte) -113);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 95, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("text_removed_from_game", (byte) -126);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 99, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("text_lobby_pleaselogin_free", (byte) -97);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("opengl", (byte) -109);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 108, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("sse", (byte) -116);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("purejava", (byte) -128);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 123, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("waitingfor_graphics", (byte) -117);
                if (var2 != null) {
                  FramedButtonPainter.field_q = AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("waitingfor_models", (byte) -111);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("waitingfor_fonts", (byte) -120);
                if (var2 != null) {
                  IndexedSpriteArrayFactory.field_d = AccountFormTextHelpers.a((byte) 124, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("waitingfor_soundeffects", (byte) -99);
                if (null != var2) {
                  RadixParsingHelpers.field_d = AccountFormTextHelpers.a((byte) 110, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("waitingfor_music", (byte) -117);
                if (var2 != null) {
                  FriendLookupState.field_d = AccountFormTextHelpers.a((byte) 117, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("waitingfor_instruments", (byte) -114);
                if (var2 != null) {
                  IndexedSpriteState.field_g = AccountFormTextHelpers.a((byte) 87, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("waitingfor_levels", (byte) -102);
                if (var2 != null) {
                  FriendEntry.field_gb = AccountFormTextHelpers.a((byte) 115, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("waitingfor_extradata", (byte) -117);
                if (null != var2) {
                  AlternateUsernameLoginCredentials.field_o = AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("waitingfor_languages", (byte) -111);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 93, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("waitingfor_textures", (byte) -122);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("waitingfor_animations", (byte) -96);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 115, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("loading_graphics", (byte) -97);
                if (null != var2) {
                  HyperlinkPainter.field_e = AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("loading_models", (byte) -111);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 95, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("loading_fonts", (byte) -123);
                if (var2 != null) {
                  ThrowableFormattingHelpers.field_d = AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("loading_soundeffects", (byte) -126);
                if (var2 != null) {
                  MenuController.field_i = AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("loading_music", (byte) -108);
                if (var2 != null) {
                  ByteArrayPool.field_e = AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("loading_instruments", (byte) -96);
                if (null != var2) {
                  EncryptedLoginHelpers.field_d = AccountFormTextHelpers.a((byte) 84, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("loading_levels", (byte) -115);
                if (var2 != null) {
                  WhirlpoolHasher.field_e = AccountFormTextHelpers.a((byte) 111, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("loading_extradata", (byte) -109);
            }
            void loadLoadingFullscreenAndMembershipTexts() throws java.lang.RuntimeException {
                if (var2 != null) {
                  WidgetTheme.field_s = AccountFormTextHelpers.a((byte) 94, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("loading_languages", (byte) -99);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 91, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("loading_textures", (byte) -120);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 119, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("loading_animations", (byte) -122);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 116, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unpacking_graphics", (byte) -111);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unpacking_models", (byte) -111);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unpacking_soundeffects", (byte) -103);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 86, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unpacking_music", (byte) -125);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unpacking_levels", (byte) -108);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 119, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unpacking_languages", (byte) -116);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unpacking_animations", (byte) -123);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 102, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unpacking_toolkit", (byte) -101);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 101, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("instructions", (byte) -101);
                if (var2 != null) {
                  MidiNote.field_o = AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("tutorial", (byte) -125);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 117, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("playtutorial", (byte) -117);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 119, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("sound_colon", (byte) -114);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 99, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("music_colon", (byte) -104);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 125, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("fullscreen", (byte) -99);
                if (var2 != null) {
                  AccountProgressDialog.field_lb = AccountFormTextHelpers.a((byte) 87, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("screensize", (byte) -106);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 113, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("highscores", (byte) -127);
                if (var2 != null) {
                  WrappedTextLayout.field_m = AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rankings", (byte) -115);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 119, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("achievements", (byte) -128);
                if (var2 != null) {
                  AgeValidator.field_k = AccountFormTextHelpers.a((byte) 85, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("achievementsthisgame", (byte) -97);
                if (null != var2) {
                  DisplayModeInfo.field_b = AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("achievementsthissession", (byte) -117);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 127, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("watchintroduction", (byte) -110);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 118, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("quit", (byte) -112);
                if (var2 != null) {
                  FriendLookupState.field_e = AccountFormTextHelpers.a((byte) 101, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("login_createaccount", (byte) -100);
                if (var2 != null) {
                  DiskCacheWorker.field_d = AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("tohighscores", (byte) -100);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 119, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("returntomainmenu", (byte) -126);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("returntopausemenu", (byte) -101);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 108, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("returntooptionsmenu_notpaused", (byte) -112);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mainmenu", (byte) -123);
                if (null != var2) {
                  EditableTextWidget.field_G = AccountFormTextHelpers.a((byte) 123, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("pausemenu", (byte) -123);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 95, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("optionsmenu_notpaused", (byte) -98);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 108, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("menu", (byte) -95);
                if (var2 != null) {
                  AccountFormText.field_a = AccountFormTextHelpers.a((byte) 84, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("selectlevel", (byte) -98);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 124, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("nextlevel", (byte) -104);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 121, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("startgame", (byte) -127);
                if (null != var2) {
                  ProgressQuery.field_l = AccountFormTextHelpers.a((byte) 121, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("newgame", (byte) -101);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 118, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("resumegame", (byte) -122);
                if (null != var2) {
                  AccountCreationForm.field_K = AccountFormTextHelpers.a((byte) 117, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("resumetutorial", (byte) -122);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 109, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("skip", (byte) -122);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 101, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("skiptutorial", (byte) -108);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 118, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("skipending", (byte) -104);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 109, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("restartlevel", (byte) -115);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 84, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("endtest", (byte) -106);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("endgame", (byte) -127);
                if (var2 != null) {
                  WidgetTheme.field_o = AccountFormTextHelpers.a((byte) 103, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("endtutorial", (byte) -113);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 125, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("ok", (byte) -100);
                if (null != var2) {
                  KeyboardShutdownHelpers.field_b = AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("on", (byte) -109);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("off", (byte) -122);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 91, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("previous", (byte) -118);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 86, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("prev", (byte) -123);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 85, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("next", (byte) -117);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 85, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_colon", (byte) -100);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 102, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("hotseatmultiplayer", (byte) -113);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 117, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("entermultiplayerlobby", (byte) -119);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 103, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("singleplayergame", (byte) -120);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("returntogame", (byte) -99);
                if (var2 != null) {
                  UrlPacketDownloader.field_a = AccountFormTextHelpers.a((byte) 90, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("endgameresign", (byte) -106);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 106, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("offerdraw", (byte) -108);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 85, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("canceldraw", (byte) -114);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 87, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("acceptdraw", (byte) -116);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 102, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("resign", (byte) -124);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("returntolobby", (byte) -122);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 93, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("cont", (byte) -97);
                if (null != var2) {
                  ThreePieceFrameHelpers.field_e = AccountFormTextHelpers.a((byte) 106, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("continue_spectating", (byte) -95);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 99, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("messages", (byte) -113);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_fastest", (byte) -117);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_medium", (byte) -128);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 94, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_best", (byte) -113);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 96, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_directx", (byte) -125);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 109, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_opengl", (byte) -119);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_java", (byte) -113);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 94, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_quality_high", (byte) -101);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 84, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_quality_low", (byte) -99);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 98, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_mode", (byte) -103);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_quality", (byte) -99);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mode", (byte) -100);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 90, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("quality", (byte) -124);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 84, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("keys", (byte) -118);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 106, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("objective", (byte) -123);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("currentobjective", (byte) -124);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("pressescforpausemenu", (byte) -112);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("pressescforpausemenuortoskiptutorial", (byte) -110);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("pressescforoptionsmenu_doesntpause", (byte) -97);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 98, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("pressescforoptionsmenu_doesntpause_short", (byte) -96);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 117, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("powerups", (byte) -114);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 119, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("latestlevel_suffix", (byte) -110);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 90, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unreachedlevel_name", (byte) -96);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 96, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unreachedlevel_cannotplayreason", (byte) -124);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 98, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unreachedlevel_cannotplayreason_shorter", (byte) -123);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 118, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unreachedworld_cannotplayreason", (byte) -111);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 101, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("memberslevel_name", (byte) -124);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("memberslevel_cannotplayreason", (byte) -125);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 98, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("membersworld_cannotplayreason", (byte) -118);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 85, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unreachedlevel_createtip", (byte) -95);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 102, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unreachedlevel_createtip_line1", (byte) -113);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 95, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unreachedlevel_createtip_line2", (byte) -114);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 101, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("unreachedlevel_logintip", (byte) -102);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("memberslevel_logintip", (byte) -108);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 85, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("displayname_none", (byte) -108);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 103, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("levelxofy1", (byte) -95);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 93, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("levelxofy2", (byte) -122);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("levelxofy", (byte) -117);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 99, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("ingame_level", (byte) -99);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mouseoveranicon", (byte) -113);
                if (var2 != null) {
                  Bzip2State.field_r = AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("notyetachieved", (byte) -107);
                if (null != var2) {
                  LoginMethodPreference.field_b = AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("achieved", (byte) -116);
                if (null != var2) {
                  RankingWorkspaceHelpers.field_c = AccountFormTextHelpers.a((byte) 99, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("orbpoints", (byte) -104);
                if (var2 != null) {
                  ResourceArchive.field_e = AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("orbcoins", (byte) -107);
                if (var2 != null) {
                  AccountFormTextHelpers.field_a = AccountFormTextHelpers.a((byte) 108, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("orbpoints_colon", (byte) -109);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 116, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("orbcoins_colon", (byte) -125);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 118, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("achieved_colon_description", (byte) -101);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 95, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("secretachievement", (byte) -96);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 95, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("no_highscores", (byte) -123);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("hs_name", (byte) -128);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 127, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("hs_level", (byte) -96);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 104, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("hs_fromlevel", (byte) -96);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 91, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("hs_tolevel", (byte) -108);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 113, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("hs_score", (byte) -128);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("hs_end", (byte) -125);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 94, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("ingame_score", (byte) -115);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 123, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("score_colon", (byte) -128);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 93, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_leavegame", (byte) -122);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 90, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_offerrematch", (byte) -122);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 101, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_offerrematch_unrated", (byte) -102);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 104, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_acceptrematch", (byte) -116);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 111, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_acceptrematch_unrated", (byte) -126);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 109, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_cancelrematch", (byte) -102);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 109, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_cancelrematch_unrated", (byte) -108);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 109, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_rematchnewgame", (byte) -106);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_rematchnewgame_unrated", (byte) -126);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 90, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_x_wantstodraw", (byte) -98);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_x_offersrematch", (byte) -117);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_x_offersrematch_unrated", (byte) -101);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 98, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_youofferrematch", (byte) -121);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_youofferrematch_unrated", (byte) -100);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 90, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_youofferdraw", (byte) -118);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 103, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_youresigned", (byte) -116);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 125, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_youresigned_rematch", (byte) -110);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 108, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_x_hasresignedandleft", (byte) -124);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_x_hasresigned_rematch", (byte) -125);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 115, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_x_hasresigned", (byte) -112);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 119, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_x_hasleft", (byte) -108);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 104, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_x_haswon", (byte) -99);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 121, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_youhavewon", (byte) -106);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_gamedrawn", (byte) -110);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 85, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_timeremaining", (byte) -114);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_x_turn", (byte) -123);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 125, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_yourturn", (byte) -100);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("gameover", (byte) -112);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 84, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_hidechat", (byte) -127);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 87, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_showchat_nounread", (byte) -125);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_showchat_unread1", (byte) -110);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 87, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mp_showchat_unread2", (byte) -108);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("click_to_quickchat", (byte) -105);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("autorespond", (byte) -121);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 117, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("quickchat_help", (byte) -107);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 125, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("quickchat_help_title", (byte) -95);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 113, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("quickchat_shortcut_help,0", (byte) -107);
                if (null != var2) {
                  LoginCredentialKind.field_d[0] = AccountFormTextHelpers.a((byte) 111, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("quickchat_shortcut_help,1", (byte) -118);
                if (null != var2) {
                  LoginCredentialKind.field_d[1] = AccountFormTextHelpers.a((byte) 91, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("quickchat_shortcut_help,2", (byte) -106);
                if (null != var2) {
                  LoginCredentialKind.field_d[2] = AccountFormTextHelpers.a((byte) 104, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("quickchat_shortcut_help,3", (byte) -95);
                if (null != var2) {
                  LoginCredentialKind.field_d[3] = AccountFormTextHelpers.a((byte) 85, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("quickchat_shortcut_help,4", (byte) -114);
                if (null != var2) {
                  LoginCredentialKind.field_d[4] = AccountFormTextHelpers.a((byte) 106, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("quickchat_shortcut_help,5", (byte) -123);
                if (null != var2) {
                  LoginCredentialKind.field_d[5] = AccountFormTextHelpers.a((byte) 102, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("quickchat_shortcut_keys,0", (byte) -119);
                if (null != var2) {
                  ImageProducerRasterBuffer.field_o[0] = AccountFormTextHelpers.a((byte) 101, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("quickchat_shortcut_keys,1", (byte) -122);
                if (null != var2) {
                  ImageProducerRasterBuffer.field_o[1] = AccountFormTextHelpers.a((byte) 127, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("quickchat_shortcut_keys,2", (byte) -119);
                if (var2 != null) {
                  ImageProducerRasterBuffer.field_o[2] = AccountFormTextHelpers.a((byte) 119, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("quickchat_shortcut_keys,3", (byte) -117);
                if (var2 != null) {
                  ImageProducerRasterBuffer.field_o[3] = AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("quickchat_shortcut_keys,4", (byte) -120);
                if (var2 != null) {
                  ImageProducerRasterBuffer.field_o[4] = AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("quickchat_shortcut_keys,5", (byte) -106);
                if (null != var2) {
                  ImageProducerRasterBuffer.field_o[5] = AccountFormTextHelpers.a((byte) 119, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("keychar_the_character_under_questionmark", (byte) -117);
                if (null != var2) {
                  SavedDataSubmission.decodeCp1252Byte((byte) -26, var2[0]);
                }
                var2 = AchievementUnlock.loadNamedResource("rating_noratings", (byte) -107);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 97, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rating_rating", (byte) -96);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rating_played", (byte) -105);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 115, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rating_won", (byte) -119);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rating_lost", (byte) -112);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 127, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rating_drawn", (byte) -116);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 116, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("benefits_fullscreen", (byte) -101);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 104, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("benefits_noadverts", (byte) -95);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 106, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("benefits_price", (byte) -104);
                if (var2 != null) {
                  BufferedRandomAccessFile.field_b = AccountFormTextHelpers.a((byte) 123, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("members_expansion_benefits,0", (byte) -119);
                if (null != var2) {
                  MeshLightingHelpers.field_a[0] = AccountFormTextHelpers.a((byte) 121, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("members_expansion_benefits,1", (byte) -111);
                if (null != var2) {
                  MeshLightingHelpers.field_a[1] = AccountFormTextHelpers.a((byte) 87, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("members_expansion_benefits,2", (byte) -118);
                if (null != var2) {
                  MeshLightingHelpers.field_a[2] = AccountFormTextHelpers.a((byte) 105, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("members_expansion_price_top", (byte) -112);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 90, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("members_expansion_price_bottom", (byte) -96);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reconnect_lost_seq,0", (byte) -119);
                if (null != var2) {
                  Crc32Helpers.field_a[0] = AccountFormTextHelpers.a((byte) 96, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reconnect_lost_seq,1", (byte) -116);
                if (var2 != null) {
                  Crc32Helpers.field_a[1] = AccountFormTextHelpers.a((byte) 105, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reconnect_lost_seq,2", (byte) -119);
                if (var2 != null) {
                  Crc32Helpers.field_a[2] = AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reconnect_lost_seq,3", (byte) -102);
                if (var2 != null) {
                  Crc32Helpers.field_a[3] = AccountFormTextHelpers.a((byte) 123, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reconnect_lost", (byte) -121);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 98, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reconnect_restored", (byte) -104);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 102, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reconnect_please_check", (byte) -112);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 117, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reconnect_wait", (byte) -96);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 108, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reconnect_retry", (byte) -115);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 86, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reconnect_resume", (byte) -128);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reconnect_or", (byte) -116);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 116, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reconnect_exitfs", (byte) -121);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 116, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reconnect_exitfs_quit", (byte) -109);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 124, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reconnect_quit", (byte) -124);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reconnect_check_fs", (byte) -105);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 114, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("reconnect_check_nonfs", (byte) -100);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 119, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("fs_accept_beforeaccept", (byte) -104);
                if (var2 != null) {
                  QuickChatDynamicCommand.field_c = AccountFormTextHelpers.a((byte) 121, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("fs_button_accept", (byte) -95);
                if (var2 != null) {
                  MeshMaterial.field_a = AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("fs_accept_afteraccept", (byte) -106);
                if (var2 != null) {
                  MidiEnvelope.field_g = AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("fs_button_cancel", (byte) -95);
                if (null != var2) {
                  RadialSelectorPainter.field_h = AccountFormTextHelpers.a((byte) 101, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("fs_accept_aftercancel", (byte) -126);
                if (null != var2) {
                  StripedProgressBar.field_E = AccountFormTextHelpers.a((byte) 123, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("fs_accept_countdown_sing", (byte) -120);
                if (null != var2) {
                  Bzip2State.field_e = AccountFormTextHelpers.a((byte) 95, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("fs_accept_countdown_pl", (byte) -114);
                if (var2 != null) {
                  MenuController.field_k = AccountFormTextHelpers.a((byte) 110, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("fs_nonmember", (byte) -128);
                if (null != var2) {
                  FramedButtonPainter.field_s = AccountFormTextHelpers.a((byte) 102, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("fs_button_close", (byte) -114);
                if (null != var2) {
                  wizardrun.field_F = AccountFormTextHelpers.a((byte) 103, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("fs_button_members", (byte) -106);
                if (null != var2) {
                  MouseWheelInput.field_e = AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("fs_unavailable", (byte) -103);
                if (var2 != null) {
                  ThreePieceFrameHelpers.field_c = AccountFormTextHelpers.a((byte) 113, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("fs_unavailable_try_signed_applet", (byte) -124);
                if (null != var2) {
                  FullscreenController.field_b = AccountFormTextHelpers.a((byte) 106, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("fs_focus", (byte) -95);
                if (var2 != null) {
                  SocketConnector.field_b = AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("fs_focus_or_resolution", (byte) -107);
                if (var2 != null) {
                  ArchiveCatalog.field_c = AccountFormTextHelpers.a((byte) 126, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("fs_timeout", (byte) -100);
                if (null != var2) {
                  DialogLayer.field_G = AccountFormTextHelpers.a((byte) 121, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("fs_button_tryagain", (byte) -99);
                if (null != var2) {
                  SavedDataRequest.field_n = AccountFormTextHelpers.a((byte) 125, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_ui_fs_countdown", (byte) -107);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mb_caption_title", (byte) -102);
                if (null != var2) {
                  FullscreenFailureKind.field_b = AccountFormTextHelpers.a((byte) 125, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mb_including_gamename", (byte) -112);
                if (null != var2) {
                  RasterBuffer.field_b = AccountFormTextHelpers.a((byte) 125, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mb_full_access_1", (byte) -116);
                if (var2 != null) {
                  RankingRequest.field_l = AccountFormTextHelpers.a((byte) 116, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mb_full_access_2", (byte) -116);
                if (var2 != null) {
                  PcmResampler.field_g = AccountFormTextHelpers.a((byte) 113, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mb_achievement_count_1", (byte) -97);
                if (null != var2) {
                  RankingWorkspaceHelpers.field_b = AccountFormTextHelpers.a((byte) 84, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mb_achievement_count_2", (byte) -101);
                if (var2 != null) {
                  AlternateUsernameLoginCredentials.field_q = AccountFormTextHelpers.a((byte) 104, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mb_exclusive_1", (byte) -116);
                if (null != var2) {
                  DisplayNameValidator.field_p = AccountFormTextHelpers.a((byte) 111, var2);
                }
            }
            void loadScoresRatingsAndSubscriptionTexts() throws java.lang.RuntimeException {
                var2 = AchievementUnlock.loadNamedResource("mb_exclusive_2", (byte) -101);
                if (var2 != null) {
                  AchievementUnlock.field_i = AccountFormTextHelpers.a((byte) 103, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("me_extra_benefits", (byte) -102);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 96, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("hs_friend_tip", (byte) -127);
                if (null != var2) {
                  UiSpriteThemeHelpers.field_e = AccountFormTextHelpers.a((byte) 94, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("hs_friend_tip_multi", (byte) -106);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 114, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("hs_mode_name,0", (byte) -112);
                if (var2 != null) {
                  NodeHashTableIterator.field_l[0] = AccountFormTextHelpers.a((byte) 109, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("hs_mode_name,1", (byte) -111);
                if (var2 != null) {
                  NodeHashTableIterator.field_l[1] = AccountFormTextHelpers.a((byte) 119, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("hs_mode_name,2", (byte) -120);
                if (null != var2) {
                  NodeHashTableIterator.field_l[2] = AccountFormTextHelpers.a((byte) 125, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rating_mode_name,0", (byte) -107);
                if (null != var2) {
                  NameCheckHelpers.field_c[0] = AccountFormTextHelpers.a((byte) 92, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rating_mode_name,1", (byte) -109);
                if (null != var2) {
                  NameCheckHelpers.field_c[1] = AccountFormTextHelpers.a((byte) 103, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rating_mode_long_name,0", (byte) -115);
                if (var2 != null) {
                  ContentTransitionDialog.field_eb[0] = AccountFormTextHelpers.a((byte) 96, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("rating_mode_long_name,1", (byte) -126);
                if (var2 != null) {
                  ContentTransitionDialog.field_eb[1] = AccountFormTextHelpers.a((byte) 105, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_config_fixed_size", (byte) -115);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 127, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_config_resizable", (byte) -110);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 115, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_config_fullscreen", (byte) -118);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 108, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_config_done", (byte) -122);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_config_apply", (byte) -122);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 105, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_config_title", (byte) -117);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 106, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_config_instruction", (byte) -109);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 86, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("graphics_config_need_memory", (byte) -127);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 119, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("pleasewait_dotdotdot", (byte) -102);
                if (null != var2) {
                  GameShell.field_u = AccountFormTextHelpers.a((byte) 96, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("serviceunavailable", (byte) -110);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 109, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("createtouse", (byte) -104);
                if (var2 != null) {
                  CheckboxPainter.field_n = AccountFormTextHelpers.a((byte) 96, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("achievementsoffline", (byte) -112);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 103, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("warning", (byte) -114);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("DEFAULT_PLAYER_NAME", (byte) -98);
                if (null != var2) {
                  RasterSnapshot.field_i = AccountFormTextHelpers.a((byte) 105, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin1", (byte) -126);
                if (var2 != null) {
                  FullscreenFailureDialog.field_U = AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin2,1", (byte) -96);
                if (var2 != null) {
                  NanoTickClock.field_p[1] = AccountFormTextHelpers.a((byte) 113, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin2,2", (byte) -108);
                if (null != var2) {
                  NanoTickClock.field_p[2] = AccountFormTextHelpers.a((byte) 96, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin2,3", (byte) -117);
                if (var2 != null) {
                  NanoTickClock.field_p[3] = AccountFormTextHelpers.a((byte) 115, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin2,4", (byte) -112);
                if (var2 != null) {
                  NanoTickClock.field_p[4] = AccountFormTextHelpers.a((byte) 116, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin2,5", (byte) -125);
                if (var2 != null) {
                  NanoTickClock.field_p[5] = AccountFormTextHelpers.a((byte) 87, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin2,6", (byte) -112);
                if (null != var2) {
                  NanoTickClock.field_p[6] = AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin2,7", (byte) -118);
                if (null != var2) {
                  NanoTickClock.field_p[7] = AccountFormTextHelpers.a((byte) 100, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin3,1", (byte) -120);
                if (null != var2) {
                  IntrusiveDeque.field_e[1] = AccountFormTextHelpers.a((byte) 98, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin3,2", (byte) -120);
                if (null != var2) {
                  IntrusiveDeque.field_e[2] = AccountFormTextHelpers.a((byte) 96, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin3,3", (byte) -114);
                if (null != var2) {
                  IntrusiveDeque.field_e[3] = AccountFormTextHelpers.a((byte) 94, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin3,4", (byte) -120);
                if (var2 != null) {
                  IntrusiveDeque.field_e[4] = AccountFormTextHelpers.a((byte) 86, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin3,5", (byte) -105);
                if (var2 != null) {
                  IntrusiveDeque.field_e[5] = AccountFormTextHelpers.a((byte) 93, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin3,6", (byte) -125);
                if (var2 != null) {
                  IntrusiveDeque.field_e[6] = AccountFormTextHelpers.a((byte) 108, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin3,7", (byte) -113);
                if (var2 != null) {
                  IntrusiveDeque.field_e[7] = AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("discard", (byte) -109);
                if (null != var2) {
                  ContentTransitionDialog.field_X = AccountFormTextHelpers.a((byte) 106, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin4,1", (byte) -98);
                if (var2 != null) {
                  DiskCacheRequest.field_y[1] = AccountFormTextHelpers.a((byte) 98, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin4,2", (byte) -119);
                if (null != var2) {
                  DiskCacheRequest.field_y[2] = AccountFormTextHelpers.a((byte) 109, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin4,3", (byte) -104);
                if (null != var2) {
                  DiskCacheRequest.field_y[3] = AccountFormTextHelpers.a((byte) 95, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin4,4", (byte) -103);
                if (var2 != null) {
                  DiskCacheRequest.field_y[4] = AccountFormTextHelpers.a((byte) 124, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin4,5", (byte) -120);
                if (null != var2) {
                  DiskCacheRequest.field_y[5] = AccountFormTextHelpers.a((byte) 99, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin4,6", (byte) -100);
                if (null != var2) {
                  DiskCacheRequest.field_y[6] = AccountFormTextHelpers.a((byte) 107, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin4,7", (byte) -105);
                if (var2 != null) {
                  DiskCacheRequest.field_y[7] = AccountFormTextHelpers.a((byte) 120, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin_notloggedin", (byte) -120);
                if (null != var2) {
                  AccountFormTextHelpers.a((byte) 94, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin_alternate,1", (byte) -128);
                if (var2 != null) {
                  HighscorePlayer.field_a[1] = AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin_alternate,2", (byte) -99);
                if (var2 != null) {
                  HighscorePlayer.field_a[2] = AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin_alternate,3", (byte) -96);
                if (var2 != null) {
                  HighscorePlayer.field_a[3] = AccountFormTextHelpers.a((byte) 89, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin_alternate,4", (byte) -109);
                if (null != var2) {
                  HighscorePlayer.field_a[4] = AccountFormTextHelpers.a((byte) 121, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin_alternate,5", (byte) -118);
                if (null != var2) {
                  HighscorePlayer.field_a[5] = AccountFormTextHelpers.a((byte) 113, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin_alternate,6", (byte) -111);
                if (null != var2) {
                  HighscorePlayer.field_a[6] = AccountFormTextHelpers.a((byte) 106, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("mustlogin_alternate,7", (byte) -97);
                if (var2 != null) {
                  HighscorePlayer.field_a[7] = AccountFormTextHelpers.a((byte) 101, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("subscription_cost_monthly,0", (byte) -109);
                if (null != var2) {
                  ArchiveLoadingPlan.field_d[0] = AccountFormTextHelpers.a((byte) 118, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("subscription_cost_monthly,1", (byte) -96);
                if (null != var2) {
                  ArchiveLoadingPlan.field_d[1] = AccountFormTextHelpers.a((byte) 101, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("subscription_cost_monthly,2", (byte) -122);
                if (null != var2) {
                  ArchiveLoadingPlan.field_d[2] = AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("subscription_cost_monthly,3", (byte) -119);
                if (null != var2) {
                  ArchiveLoadingPlan.field_d[3] = AccountFormTextHelpers.a((byte) 93, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("subscription_cost_monthly,4", (byte) -117);
                if (var2 != null) {
                  ArchiveLoadingPlan.field_d[4] = AccountFormTextHelpers.a((byte) 122, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("subscription_cost_monthly,5", (byte) -108);
                if (null != var2) {
                  ArchiveLoadingPlan.field_d[5] = AccountFormTextHelpers.a((byte) 94, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("subscription_cost_monthly,6", (byte) -126);
                if (null != var2) {
                  ArchiveLoadingPlan.field_d[6] = AccountFormTextHelpers.a((byte) 106, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("subscription_cost_monthly,7", (byte) -116);
                if (null != var2) {
                  ArchiveLoadingPlan.field_d[7] = AccountFormTextHelpers.a((byte) 84, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("subscription_cost_monthly,8", (byte) -122);
                if (null != var2) {
                  ArchiveLoadingPlan.field_d[8] = AccountFormTextHelpers.a((byte) 94, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("subscription_cost_monthly,9", (byte) -102);
                if (var2 != null) {
                  ArchiveLoadingPlan.field_d[9] = AccountFormTextHelpers.a((byte) 87, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("subscription_cost_monthly,10", (byte) -122);
                if (var2 != null) {
                  ArchiveLoadingPlan.field_d[10] = AccountFormTextHelpers.a((byte) 91, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("subscription_cost_monthly,11", (byte) -127);
                if (null != var2) {
                  ArchiveLoadingPlan.field_d[11] = AccountFormTextHelpers.a((byte) 112, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("subscription_cost_monthly,12", (byte) -115);
                if (var2 != null) {
                  ArchiveLoadingPlan.field_d[12] = AccountFormTextHelpers.a((byte) 88, var2);
                }
                var2 = AchievementUnlock.loadNamedResource("sentence_separator", (byte) -107);
                if (var2 != null) {
                  AccountFormTextHelpers.a((byte) 93, var2);
                }
                FramedButtonPainter.field_r = null;
            }
            void run() {
                var3 = wizardrun.field_H;
                try {
                  loadLoginAccountAndReportTexts();
                  if (finished) return;
                  loadRuleSocialAndResourceTexts();
                  if (finished) return;
                  loadLoadingFullscreenAndMembershipTexts();
                  if (finished) return;
                  loadScoresRatingsAndSubscriptionTexts();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_2617_0 = (RuntimeException) (var2_ref);
                  stackIn_2617_1 = new StringBuilder().append("ea.G(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_2618_2 = "null";
                  } else {
                    stackIn_2618_2 = "{...}";
                  }
                  throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_2617_0), ((StringBuilder) (Object) stackIn_2617_1).append(stackIn_2618_2).append(')').toString());
                }
                if (var3 != 0) {
                  stackIn_2626_0 = (!GameApplet.field_h);
                  GameApplet.field_h = stackIn_2626_0;
                }
            }
        }
        ClientTextLoader decompiledBody = new ClientTextLoader(param0, param1);
        decompiledBody.run();
    }

    public static void releaseStatics(int param0) {
        try {
          field_f = null;
          field_e = null;
          if (param0 != 4) {
            ProxySocketConnector.c(14);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ea.F(" + param0 + ')');
        }
    }

    final java.net.Socket connect(byte param0) throws IOException {
        int stackIn_8_0 = 0;
        java.net.ProxySelector stackIn_12_0;
        java.net.URI stackIn_12_1;
        java.net.URI stackIn_12_2;
        StringBuilder stackIn_12_3;
        java.net.URI stackIn_13_1 = null;
        java.net.URI stackIn_13_2 = null;
        String stackIn_13_4 = null;
        java.net.ProxySelector stackIn_16_0;
        java.net.URI stackIn_16_1;
        java.net.URI stackIn_16_2;
        StringBuilder stackIn_16_3;
        java.net.URI stackIn_17_1;
        java.net.URI stackIn_17_2;
        String stackIn_17_4;
        java.net.Socket stackIn_20_0 = null;
        java.net.Socket stackIn_23_0 = null;
        java.net.Socket stackIn_33_0 = null;
        java.net.Socket stackIn_42_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        Object var7 = null;
        Object[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        java.net.Socket var12 = null;
        ProxyAuthenticationException var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        var13 = wizardrun.field_H;
        try {
          var2_int = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")) ? 1 : 0;
          if (var2_int == 0) {
            System.setProperty("java.net.useSystemProxies", "true");
          }
          stackIn_8_0 = (443 != this.field_c) ? 0 : 1;
          var5 = stackIn_8_0;
          try {
            stackIn_12_0 = this.field_g;
            stackIn_12_1 = null;
            stackIn_12_2 = null;
            stackIn_12_3 = new StringBuilder();
            if (var5 == 0) {
              stackIn_13_1 = null;
              stackIn_13_2 = null;
              stackIn_13_4 = "http";
            } else {
              stackIn_13_1 = null;
              stackIn_13_2 = null;
              stackIn_13_4 = "https";
            }
            var3 = ((java.net.ProxySelector) (Object) stackIn_12_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_12_3).append(stackIn_13_4).append("://").append(this.field_a).toString()));
            stackIn_16_0 = this.field_g;
            stackIn_16_1 = null;
            stackIn_16_2 = null;
            stackIn_16_3 = new StringBuilder();
            if (var5 != 0) {
              stackIn_17_1 = null;
              stackIn_17_2 = null;
              stackIn_17_4 = "http";
            } else {
              stackIn_17_1 = null;
              stackIn_17_2 = null;
              stackIn_17_4 = "https";
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_16_0).select(new java.net.URI(((StringBuilder) (Object) stackIn_16_3).append(stackIn_17_4).append("://").append(this.field_a).toString()));
          } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
            stackIn_20_0 = this.openSocket(-14394);
            return stackIn_20_0;
          }
          if (param0 != -128) {
            stackIn_23_0 = (java.net.Socket) null;
            return stackIn_23_0;
          }
          var3.addAll((Collection) ((Object) var4));
          var6_array = var3.toArray();
          var7 = null;
          var8 = var6_array;
          var9 = 0;
          scanLoop1: while (true) {
            if (var9 < var8.length) {
              var10 = var8[var9];
              var11 = (java.net.Proxy) (var10);
              try {
                var12 = this.connectViaProxy(param0 + 133, var11);
                stackIn_42_0 = var12;
                if (var13 != 0) {
                  decompiledRegionSelector0 = 0;
                } else {
                  if (stackIn_42_0 != null) {
                    stackIn_33_0 = var12;
                    return stackIn_33_0;
                  }
                  decompiledRegionSelector0 = 1;
                }
              } catch (ProxyAuthenticationException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var12_ref = (ProxyAuthenticationException) (Object) decompiledCaughtException;
                var7 = var12_ref;
                decompiledRegionSelector0 = 1;
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var12_ref2 = (IOException) (Object) decompiledCaughtException;
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
                break scanLoop1;
              }
              var9++;
              if (var13 == 0) {
                continue;
              }
            }
            if (var7 != null) {
              throw ProxySocketConnector.<RuntimeException>rethrowUnchecked((Throwable) var7);
            }
            stackIn_42_0 = this.openSocket(-14394);
            break;
          }
          return stackIn_42_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
          decompiledCaughtException = decompiledCaughtParameter3;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var2), "ea.A(" + param0 + ')');
        }
    }

    final static void c(int param0) {
        try {
          OpacityWidget.setAccountWorkflowState((byte) 67, 17);
          if (param0 != -31722) {
            field_e = (ProgressDialog) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ea.H(" + param0 + ')');
        }
    }

    private final java.net.Socket connectViaProxy(int param0, java.net.Proxy param1) throws IOException {
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        java.net.Socket stackIn_20_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        Throwable decompiledCaughtException = null;
        java.net.SocketAddress var3 = null;
        RuntimeException var3_ref = null;
        java.net.InetSocketAddress var4 = null;
        Object var5 = null;
        Class var6 = null;
        Exception var6_ref = null;
        java.lang.reflect.Method var7 = null;
        Object var8 = null;
        java.lang.reflect.Method var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        String var12 = null;
        String var13 = null;
        try {
          if (param1.type() == java.net.Proxy.Type.DIRECT) {
            stackIn_2_0 = this.openSocket(-14394);
            return stackIn_2_0;
          }
          if (param0 != 5) {
            this.field_g = (java.net.ProxySelector) null;
          }
          var3 = param1.address();
          if (!((Object) var3 instanceof java.net.InetSocketAddress)) {
            stackIn_9_0 = null;
            return (java.net.Socket) (stackIn_9_0);
          }
          var4 = (java.net.InetSocketAddress) ((Object) var3);
          if (param1.type() != java.net.Proxy.Type.HTTP) {
            if (param1.type() != java.net.Proxy.Type.SOCKS) {
              stackIn_25_0 = null;
              return (java.net.Socket) (stackIn_25_0);
            }
            var5 = new java.net.Socket(param1);
            ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_a, this.field_c)));
            stackIn_23_0 = var5;
            return (java.net.Socket) (stackIn_23_0);
          }
          var5 = null;
          try {
            var6 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
            var7 = var6.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
            var7.setAccessible(true);
            var8 = var7.invoke((Object) null, new Object[]{var4.getHostName(), new Integer(var4.getPort())});
            if (null != var8) {
              var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
              var9.setAccessible(true);
              if (((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                var10 = var6.getDeclaredMethod("getHeaderName", new Class[]{});
                var10.setAccessible(true);
                var11 = var6.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                var11.setAccessible(true);
                var12 = (String) (var10.invoke(var8, new Object[]{}));
                var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_a + "/"), "https"}));
                var5 = var12 + ": " + var13;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
          }
          stackIn_20_0 = this.openHttpTunnel((byte) 112, var4.getPort(), var4.getHostName(), (String) (var5));
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_29_0 = var3_ref;
          stackIn_29_1 = new StringBuilder().append("ea.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    private final java.net.Socket openHttpTunnel(byte param0, int param1, String param2, String param3) throws IOException {
        java.net.Socket stackIn_20_0 = null;
        Object stackIn_41_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.Socket var5 = null;
        RuntimeException var5_ref = null;
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = wizardrun.field_H;
        try {
          var5 = new java.net.Socket(param2, param1);
          var5.setSoTimeout(10000);
          var6 = var5.getOutputStream();
          boolean decompiledSharedTail0 = (param3 == null);
          if (!decompiledSharedTail0) {
            var6.write(("CONNECT " + this.field_a + ":" + this.field_c + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
            decompiledSharedTail0 = (var12 != 0);
          }
          if (decompiledSharedTail0) {
            var6.write(("CONNECT " + this.field_a + ":" + this.field_c + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
          }
          var6.flush();
          var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var5.getInputStream())));
          if (param0 != 112) {
            field_e = (ProgressDialog) null;
          }
          boolean decompiledFrameRemainder0 = true;
          var8 = var7.readLine();
          if (null != var8) {
            if ((!var8.startsWith("HTTP/1.0 200") &&
              !var8.startsWith("HTTP/1.1 200")) &&
              (decompiledFrameRemainder0 = (var8.startsWith("HTTP/1.0 407") ||
              var8.startsWith("HTTP/1.1 407")))) {
              var9 = 0;
              var10 = "proxy-authenticate: ";
              var8 = var7.readLine();
              while (var8 != null) {
                if (var9 < 50) {
                  if (var8.toLowerCase().startsWith(var10)) {
                    var8 = var8.substring(var10.length()).trim();
                    var11 = var8.indexOf(' ');
                    if (var11 != -1) {
                      var8 = var8.substring(0, var11);
                    }
                    throw new ProxyAuthenticationException(var8);
                  }
                  var8 = var7.readLine();
                  var9++;
                  if (var12 == 0) {
                    continue;
                  }
                }
                break;
              }
              throw new ProxyAuthenticationException("");
            }
            if (decompiledFrameRemainder0) {
              stackIn_20_0 = var5;
              return stackIn_20_0;
            }
          }
          var6.close();
          var7.close();
          var5.close();
          stackIn_41_0 = null;
          return (java.net.Socket) (stackIn_41_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_45_0 = var5_ref;
          stackIn_45_1 = new StringBuilder().append("ea.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param3 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(')').toString());
        }
    }

    ProxySocketConnector() {
        try {
          this.field_g = java.net.ProxySelector.getDefault();
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ea.<init>()");
        }
    }

    static {
        field_f = new QuickChatDynamicCommand(1, 2, 2, 0);
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException rethrowUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
