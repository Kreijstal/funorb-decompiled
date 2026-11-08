/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameModeSelectScreen extends MenuScreen {
    private int field_t;
    static PacketBuffer field_v;
    private GameModeCard field_o;
    static ResourceArchive field_u;
    static bd field_s;
    private GameModeCard field_p;
    static String[] field_r;
    static String[] field_q;

    final static void loadTextTable(int param0, ResourceArchive param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_2602_0;
            StringBuilder stackIn_2602_1;
            String stackIn_2603_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int var4;
            int param0;
            ResourceArchive param1;
            boolean finished;
            $CfrPartitionedBody(int initialParam0, ResourceArchive initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_2602_0 = null;
                this.stackIn_2602_1 = null;
                this.stackIn_2603_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
                this.var4 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                AsyncValidationResult.field_b = param1;
                var2 = vd.getGameTextFile("loginm3", 0);
                if (var2 != null) {
                  ValidationIndicator.field_N = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("loginm2", param0 ^ 31873);
                if (var2 != null) {
                  TextTableInitializer.field_b = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("loginm1", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("idlemessage20min", 0);
                if (null != var2) {
                  hm.field_c = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("error_js5crc", param0 - 31873);
                if (null != var2) {
                  wo.field_e = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("error_js5io", 0);
                if (var2 != null) {
                  TabbedPanel.field_Ib = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("error_js5connect_full", 0);
                if (var2 != null) {
                  SectorCacheStore.field_g = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("error_js5connect", 0);
                if (null != var2) {
                  JaggrabDownloader.field_k = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("login_gameupdated", 0);
                if (null != var2) {
                  aq.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_unable", param0 - 31873);
                if (null != var2) {
                  ph.field_m = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_ineligible", 0);
                if (var2 != null) {
                  AudioService.field_b = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("usernameprompt", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("passwordprompt", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("andagainprompt", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("ticketing_read", 0);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("ticketing_ignore", param0 ^ 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("ticketing_oneunread", param0 ^ 31873);
                if (var2 != null) {
                  MainMenuScreen.field_o = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("ticketing_xunread", 0);
                if (null != var2) {
                  SpriteState.field_v = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("ticketing_gotowebsite", param0 ^ 31873);
                if (null != var2) {
                  GameApplet.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("ticketing_waitingformessages", param0 ^ 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_chat_on", 0);
                if (null != var2) {
                  EmailConfirmationValidator.field_m = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_chat_friends", 0);
                if (var2 != null) {
                  NameSuggestionsPanel.field_J = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_chat_off", 0);
                if (null != var2) {
                  GrowableIntList.field_e = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("mu_chat_lobby", 0);
                if (var2 != null) {
                  TimerBar.field_m = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_chat_public", 0);
                if (null != var2) {
                  em.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_chat_ignore", 0);
                if (var2 != null) {
                  AsyncValidationResult.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_chat_tips", 0);
                if (null != var2) {
                  UiContainer.field_H = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_chat_game", param0 ^ 31873);
                if (null != var2) {
                  PairedTextColumns.field_Gb = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mu_chat_private", 0);
                if (null != var2) {
                  mc.field_n = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_x_entered_game", 0);
                if (null != var2) {
                  StatusBar.field_f = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("mu_x_joined_your_game", 0);
                if (var2 != null) {
                  SpriteState.field_w = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mu_x_entered_other_game", param0 ^ 31873);
                if (var2 != null) {
                  CachedArchiveProvider.field_v = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_x_left_lobby", 0);
                if (var2 != null) {
                  KeyboardInputHandler.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_x_lost_con", param0 ^ 31873);
                if (var2 != null) {
                  JaggrabDownloader.field_p = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mu_x_cannot_join_full", 0);
                if (var2 != null) {
                  EmailConfirmationValidator.field_n = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_x_cannot_join_inprogress", 0);
                if (var2 != null) {
                  ClientContextMenu.field_e = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_x_declined_invite", 0);
                if (var2 != null) {
                  an.field_d = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("mu_x_withdrew_request", 0);
                if (null != var2) {
                  SecondaryNodeHashTable.field_e = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_x_removed", param0 ^ 31873);
                if (var2 != null) {
                  li.field_j = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("mu_x_dropped_out", 0);
                if (var2 != null) {
                  un.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_entered_other_game", 0);
                if (var2 != null) {
                  LoadingProgressDialog.field_ib = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mu_game_is_full", 0);
                if (null != var2) {
                  nh.field_c = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mu_game_has_started", 0);
                if (null != var2) {
                  gq.field_l = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("mu_you_declined_invite", 0);
                if (var2 != null) {
                  PairedTextColumns.field_Eb = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mu_invite_withdrawn", 0);
                if (null != var2) {
                  jb.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_request_declined", 0);
                if (null != var2) {
                  EditableTextWidget.field_O = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("mu_request_withdrawn", 0);
                if (var2 != null) {
                  AccountNamePrompt.field_Gb = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_all_players_have_left", 0);
                if (null != var2) {
                  Puzzle.field_m = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_lobby_name", 0);
                if (null != var2) {
                  qn.field_m = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_lobby_rating", param0 ^ 31873);
                if (null != var2) {
                  rh.field_m = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("mu_lobby_friend_add", 0);
                if (null != var2) {
                  SceneWidgetNode.field_u = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_lobby_friend_rm", 0);
                if (null != var2) {
                  OptionsScreen.field_q = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_lobby_name_add", 0);
                if (null != var2) {
                  qh.field_e = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("mu_lobby_name_rm", param0 - 31873);
                if (null != var2) {
                  NanoTickClock.field_n = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_lobby_location", 0);
                if (var2 != null) {
                  ScrollContainer.field_Jb = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_gamelist_all_games", 0);
                if (var2 != null) {
                  TimerBar.field_n = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("mu_gamelist_status", 0);
                if (null != var2) {
                  OptionsScreen.field_w = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_gamelist_owner", 0);
                if (null != var2) {
                  ViewportController.field_u = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_gamelist_players", 0);
                if (null != var2) {
                  nk.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_gamelist_avg_rating", param0 - 31873);
                if (null != var2) {
                  MusicPatchPcmStream.field_q = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_gamelist_options", 0);
                if (null != var2) {
                  MatchController.field_b = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mu_gamelist_elapsed_time", 0);
                if (null != var2) {
                  df.field_m = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_play_rated", 0);
                if (var2 != null) {
                  DualLinkNode.field_m = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_create_unrated", param0 - 31873);
                if (var2 != null) {
                  NightToRememberBackground.field_r = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_options", 0);
                if (null != var2) {
                  og.field_n = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("mu_options_whocanjoin", 0);
                if (var2 != null) {
                  cd.field_f = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_options_players", 0);
                if (var2 != null) {
                  pk.field_e = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("mu_options_dontmind", param0 - 31873);
                if (var2 != null) {
                  fg.field_a = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mu_options_allow_spectate", 0);
                if (null != var2) {
                  LobbyGame.field_Xb = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_options_ratedgametype", 0);
                if (null != var2) {
                  MatchController.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("yes", 0);
                if (var2 != null) {
                  ij.field_t = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("no", 0);
                if (var2 != null) {
                  ValidatedTextWidget.field_eb = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mu_invite_players", param0 - 31873);
                if (null != var2) {
                  WhirlpoolHasher.field_k = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("close", 0);
                if (null != var2) {
                  NameAvailabilityValidator.field_o = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("add_x_to_friends", 0);
                if (var2 != null) {
                  ji.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("add_x_to_ignore", 0);
                if (var2 != null) {
                  ff.field_e = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rm_x_from_friends", 0);
                if (null != var2) {
                  ni.field_p = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rm_x_from_ignore", 0);
                if (null != var2) {
                  DelegatingCanvas.field_a = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("send_pm_to_x", param0 - 31873);
                if (var2 != null) {
                  nf.field_e = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("send_qc_to_x", 0);
                if (null != var2) {
                  TextTableInitializer.field_f = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("send_pm", param0 ^ 31873);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("invite_accept_xs_game", 0);
                if (null != var2) {
                  fp.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("invite_decline_xs_game", param0 ^ 31873);
                if (var2 != null) {
                  oi.field_a = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("join_xs_game", param0 ^ 31873);
                if (null != var2) {
                  SecondaryNodeHashTable.field_f = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("join_request_xs_game", 0);
                if (var2 != null) {
                  PlayerBoard.field_o = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("join_withdraw_request_xs_game", 0);
                if (null != var2) {
                  AccountNamePrompt.field_Jb = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_gameopt_kick_x_from_this_game", param0 ^ 31873);
                if (var2 != null) {
                  vf.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_gameopt_withdraw_invite_to_x", 0);
                if (var2 != null) {
                  ResourceArchive.field_j = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_gameopt_accept_x_into_game", 0);
                if (null != var2) {
                  ValidationHelpWidget.field_V = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_gameopt_reject_x_from_game", 0);
                if (null != var2) {
                  SoundCache.field_f = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_gameopt_invite_x_to_game", 0);
                if (null != var2) {
                  ImageProducerRasterBuffer.field_m = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("report_x_for_abuse", 0);
                if (null != var2) {
                  IndexedSpriteState.field_j = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("unable_to_send_message_password_a", 0);
                if (var2 != null) {
                  mp.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("unable_to_send_message_password_b", 0);
                if (var2 != null) {
                  fd.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_chat_lobby_show_all", param0 ^ 31873);
                if (var2 != null) {
                  dg.field_e = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_chat_lobby_friends_only", param0 - 31873);
                if (null != var2) {
                  gd.field_j = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("mu_chat_lobby_friends", param0 ^ 31873);
                if (var2 != null) {
                  IntKeyLookup.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_chat_lobby_hide", 0);
                if (null != var2) {
                  BufferedRandomAccessFile.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_chat_game_show_all", 0);
                if (null != var2) {
                  EmergentBehaviourBackground.field_m = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_chat_game_friends_only", param0 ^ 31873);
                if (null != var2) {
                  m.field_l = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_chat_game_friends", param0 ^ 31873);
                if (var2 != null) {
                  cl.field_i = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mu_chat_game_hide", 0);
                if (null != var2) {
                  NameAvailabilityValidator.field_n = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_chat_pm_show_all", 0);
                if (null != var2) {
                  vd.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_chat_pm_friends_only", param0 - 31873);
                if (null != var2) {
                  ByteStorage.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_chat_pm_friends", 0);
                if (null != var2) {
                  ge.field_e = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mu_chat_invisible_and_silent_mode", param0 ^ 31873);
                if (var2 != null) {
                  sf.field_a = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("you_have_been_removed_from_xs_game", param0 ^ 31873);
                if (var2 != null) {
                  ek.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("your_rating_is_x", 0);
                if (var2 != null) {
                  oi.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("you_are_on_x_server", param0 - 31873);
                if (null != var2) {
                  ke.field_e = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("rated_game", 0);
                if (null != var2) {
                  RisingBubble.field_d = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("unrated_game", param0 ^ 31873);
                if (null != var2) {
                  StatefulTextPainter.field_t = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rated_game_tips", param0 - 31873);
                if (var2 != null) {
                  ScoreMarkerDemo.field_g = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("searching_for_opponent_singular", 0);
                if (null != var2) {
                  oi.field_b = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("searching_for_opponents_plural", param0 - 31873);
                if (var2 != null) {
                  AgeValidator.field_o = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("find_opponent_singular", 0);
                if (null != var2) {
                  EmailValidator.field_n = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("find_opponents_plural", param0 - 31873);
                if (var2 != null) {
                  MatchingTextValidator.field_x = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rated_game_tips_setup_singular", 0);
                if (var2 != null) {
                  AccountRequestDialog.field_sb = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rated_game_tips_setup_plural", 0);
                if (var2 != null) {
                  HuffmanCodec.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("waiting_to_start_hint", 0);
                if (var2 != null) {
                  dn.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("your_game", 0);
                if (var2 != null) {
                  DelegatingCanvas.field_g = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("game_full", param0 - 31873);
                if (var2 != null) {
                  fo.field_m = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("join_requests_one", 0);
                if (null != var2) {
                  sm.field_k = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("join_requests_many", 0);
                if (null != var2) {
                  d.field_a = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("xs_game", 0);
                if (var2 != null) {
                  HowToPlayScreen.field_q = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("waiting_for_x_to_start_game", param0 ^ 31873);
                if (null != var2) {
                  qh.field_a = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("game_options_changed", 0);
                if (null != var2) {
                  AudioService.field_i = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("players_x_of_y", 0);
                if (null != var2) {
                  ReportAbuseDialog.field_Gb = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("message_lobby", 0);
                if (null != var2) {
                  EmailConfirmationValidator.field_s = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("quickchat_lobby", param0 - 31873);
                if (var2 != null) {
                  MatchHud.field_h = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("message_game", 0);
                if (var2 != null) {
                  InputQueue.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("message_team", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("quickchat_game", 0);
                if (null != var2) {
                  TabbedPanel.field_Eb = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("kick", 0);
                if (null != var2) {
                  MenuInputState.field_m = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("inviting_x", 0);
                if (var2 != null) {
                  ByteStorage.field_e = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("x_wants_to_join", 0);
                if (var2 != null) {
                  ModalPanel.field_O = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("accept", 0);
                if (null != var2) {
                  DisplayNameForm.field_M = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("reject", 0);
                if (var2 != null) {
                  QuickChatPhraseCache.field_e = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("invite", 0);
                if (var2 != null) {
                  ih.field_b = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("status_concluded", 0);
                if (null != var2) {
                  IntKeyLookup.field_g = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("status_spectate", param0 - 31873);
                if (null != var2) {
                  GrowableIntList.field_g = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("status_playing", param0 ^ 31873);
                if (var2 != null) {
                  DialWidgetPainter.field_j = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("status_join", 0);
                if (var2 != null) {
                  Checkbox.field_S = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("status_private", 0);
                if (var2 != null) {
                  HighscoresScreen.field_s = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("status_full", param0 - 31873);
                if (null != var2) {
                  ki.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("players_in_game", 0);
                if (null != var2) {
                  TabbedPanel.field_Fb = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("you_are_invited_to_xs_game", 0);
                if (null != var2) {
                  JavaRandomHelpers.field_a = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("asking_to_join_xs_game", 0);
                if (var2 != null) {
                  NodeHashTable.field_h = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("who_can_join", 0);
                if (var2 != null) {
                  DisplayNameForm.field_R = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("you_can_join", param0 - 31873);
                if (var2 != null) {
                  StatusBar.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("you_can_ask_to_join", 0);
                if (null != var2) {
                  he.field_e = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("you_cannot_join_in_progress", param0 - 31873);
                if (var2 != null) {
                  ClientException.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("you_can_spectate", 0);
                if (var2 != null) {
                  SecondaryNodeDequeIterator.field_a = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("you_can_not_spectate", 0);
                if (null != var2) {
                  DialWidgetPainter.field_i = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("spectate_xs_game", 0);
                if (null != var2) {
                  ReportAbuseDialog.field_Kb = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("hide_players_in_xs_game", param0 - 31873);
                if (var2 != null) {
                  DateInputWidget.field_M = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("show_players_in_xs_game", 0);
                if (var2 != null) {
                  AlphaContainer.field_J = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("connecting_to_friend_server_twoline", 0);
                if (var2 != null) {
                  ih.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("loading", 0);
                if (null != var2) {
                  FullscreenFocusCanvas.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("offline", 0);
                if (null != var2) {
                  LoadingStepTracker.field_g = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("multiconst_invite_only", 0);
                if (var2 != null) {
                  CipherPacketBuffer.field_t = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("multiconst_clan", 0);
                if (null != var2) {
                  IntrusiveDequeCursor.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("multiconst_friends", 0);
                if (null != var2) {
                  cl.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("multiconst_similar_rating", 0);
                if (null != var2) {
                  QuickChatCategoryCache.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("multiconst_open", 0);
                if (var2 != null) {
                  QuickChatPhraseCache.field_g = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("no_options_available", 0);
                if (var2 != null) {
                  ln.field_l = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("reportabuse", param0 ^ 31873);
                if (null != var2) {
                  nd.field_a = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("presstabtochat", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("pressf10toquickchat", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("dob_chatdisabled", 0);
                if (var2 != null) {
                  ef.field_d = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("dob_enterforchat", 0);
                if (null != var2) {
                  UiComponent.field_v = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("tab_hidechattemporarily", param0 - 31873);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("esc_cancelprivatemessage", 0);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("esc_cancelthisline", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("privatequickchat_from_x", param0 ^ 31873);
                if (null != var2) {
                  sk.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("privatequickchat_to_x", 0);
                if (var2 != null) {
                  dg.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("privatechat_blankarea_explanation", param0 - 31873);
                if (null != var2) {
                  MatchHud.field_m = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("publicchat_unavailable_ratedgame", 0);
                if (null != var2) {
                  AccountChoicePanel.field_P = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("privatechat_friend_offline", param0 - 31873);
                if (null != var2) {
                  GameApplet.field_m = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("privatechat_friend_notlisted", param0 - 31873);
                if (null != var2) {
                  fg.field_d = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("chatviewscrolledup", 0);
                if (null != var2) {
                  NameSuggestionsPanel.field_M = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("thisisrunescapeclan", param0 ^ 31873);
                if (var2 != null) {
                  ClientContextMenu.field_g = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("thisisrunescapeclan_notowner", param0 - 31873);
                if (var2 != null) {
                  IterableNodeHashTable.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("runescapeclan", 0);
                if (var2 != null) {
                  ri.field_g = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("rated_membersonly", param0 ^ 31873);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_membersonly", 0);
                if (var2 != null) {
                  NodeHashTable.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_1moreratedgame", 0);
                if (null != var2) {
                  PlayerBoard.field_l = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_moreratedgames", 0);
                if (var2 != null) {
                  DualLinkDeque.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_needrating", 0);
                if (var2 != null) {
                  SocketConnector.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_unratedonly", param0 - 31873);
                if (null != var2) {
                  ByteStorage.field_f = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("gameopt_notunlocked", 0);
                if (var2 != null) {
                  TwistedLogicBackground.field_o = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_cannotbecombined1", param0 - 31873);
                if (null != var2) {
                  ki.field_a = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_cannotbecombined2", 0);
                if (null != var2) {
                  LobbyPlayer.field_Kb = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_playernotmember", 0);
                if (null != var2) {
                  rh.field_w = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_younotmember", 0);
                if (null != var2) {
                  JaggrabDownloader.field_g = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_playerneedsrating", 0);
                if (null != var2) {
                  BackgroundScene.field_e = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_youneedrating", param0 ^ 31873);
                if (var2 != null) {
                  jn.field_m = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_playerneedsratedgames", param0 - 31873);
                if (null != var2) {
                  UiTheme.field_l = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_youneedratedgames", 0);
                if (null != var2) {
                  JaggrabDownloader.field_f = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_playerneeds1ratedgame", param0 ^ 31873);
                if (null != var2) {
                  jm.field_k = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("gameopt_youneed1ratedgame", param0 ^ 31873);
                if (null != var2) {
                  ReportAbuseDialog.field_Mb = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("gameopt_playerhasntunlocked", 0);
                if (var2 != null) {
                  MarkerSliderPainter.field_i = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("gameopt_youhaventunlocked", 0);
                if (var2 != null) {
                  ArchiveProvider.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_trychanging1", 0);
                if (var2 != null) {
                  BoardParticle.field_q = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_trychanging2", 0);
                if (null != var2) {
                  WeightedLruCache.field_i = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_needchanging1", param0 ^ 31873);
                if (null != var2) {
                  PacketBuffer.field_l = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_needchanging2", 0);
                if (null != var2) {
                  DirectByteStorage.field_i = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_mightchange", param0 - 31873);
                if (null != var2) {
                  ff.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_playersdontqualify", 0);
                if (null != var2) {
                  CipherPacketBuffer.field_u = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_playersdontqualify_selectgametab", 0);
                if (var2 != null) {
                  li.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_unselectedoptions", 0);
                if (null != var2) {
                  ji.field_a = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_pleaseselectoption1", 0);
                if (null != var2) {
                  sm.field_n = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_pleaseselectoption2", 0);
                if (null != var2) {
                  SpriteState.field_x = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_badnumplayers", 0);
                if (var2 != null) {
                  aq.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_inviteplayers_or_trychanging1", param0 ^ 31873);
                if (var2 != null) {
                  ff.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_inviteplayers_or_trychanging2", 0);
                if (var2 != null) {
                  fg.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_novalidcombos", 0);
                if (var2 != null) {
                  IconTextComponent.field_Gb = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameopt_pleasetrychanging", 0);
                if (null != var2) {
                  ij.field_p = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("ra_title", param0 ^ 31873);
                if (var2 != null) {
                  MatchingTextValidator.field_m = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("ra_mutethisplayer", 0);
                if (null != var2) {
                  nh.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("ra_suggestmute", 0);
                if (var2 != null) {
                  ClientContextMenu.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("ra_intro", 0);
                if (null != var2) {
                  ge.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("ra_intro_no_name", param0 - 31873);
                if (null != var2) {
                  SocialListEntry.field_Lb = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("ra_explanation", param0 ^ 31873);
                if (var2 != null) {
                  CachedTextLayout.field_j = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("rule_pillar_0", 0);
                if (var2 != null) {
                  DirectByteStorage.field_l = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rule_0_0", 0);
                if (null != var2) {
                  Vector3.field_j = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rule_0_1", 0);
                if (null != var2) {
                  ke.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rule_0_2", 0);
                if (null != var2) {
                  wf.field_a = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rule_0_3", 0);
                if (null != var2) {
                  TextWidgetPainter.field_m = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rule_0_4", 0);
                if (var2 != null) {
                  dq.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rule_0_5", 0);
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (null != var2) {
                  UiContainer.field_G = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rule_pillar_1", 0);
                if (var2 != null) {
                  MusicPatchPcmStream.field_t = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rule_1_0", 0);
                if (var2 != null) {
                  StatefulTextPainter.field_u = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rule_1_1", param0 ^ 31873);
                if (var2 != null) {
                  IntKeyLookup.field_i = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rule_1_2", 0);
                if (var2 != null) {
                  ScrollContainer.field_Eb = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rule_1_3", param0 - 31873);
                if (null != var2) {
                  nk.field_h = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rule_1_4", 0);
                if (null != var2) {
                  NodeHashTableIterator.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rule_pillar_2", 0);
                if (var2 != null) {
                  IsaacRandom.field_j = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("rule_2_0", 0);
                if (null != var2) {
                  CachedTextLayout.field_n = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("rule_2_1", 0);
                if (null != var2) {
                  nk.field_g = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("rule_2_2", 0);
                if (null != var2) {
                  DualLinkDeque.field_d = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("createafreeaccount", param0 - 31873);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("cancel", 0);
                if (null != var2) {
                  IntrusiveNode.field_f = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("pleaselogintoplay", 0);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("pleaselogin", param0 ^ 31873);
                if (var2 != null) {
                  QuickChatMenu.field_Ib = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("pleaselogin_member", 0);
                if (null != var2) {
                  InputQueue.field_a = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("invaliduserorpass", param0 - 31873);
                if (null != var2) {
                  bo.field_b = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("pleasetryagain", 0);
                if (null != var2) {
                  IsaacRandom.field_a = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("pleasereenterpass", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("playfreeversion", param0 ^ 31873);
                if (var2 != null) {
                  StripedProgressBar.field_X = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("reloadgame", 0);
                if (var2 != null) {
                  BackgroundScene.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("toserverlist", 0);
                if (null != var2) {
                  gd.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("tocustomersupport", 0);
                if (var2 != null) {
                  TextTableInitializer.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("changedisplayname", param0 - 31873);
                if (var2 != null) {
                  RankingTableRequest.field_q = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("returntohomepage", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("justplay", 0);
                if (var2 != null) {
                  fc.field_c = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("justplay_excl", 0);
                if (var2 != null) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("login", param0 - 31873);
                if (null != var2) {
                  WhirlpoolHasher.field_m = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("goback", 0);
                if (var2 != null) {
                  MatchController.field_v = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("otheroptions", 0);
                if (null != var2) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("proceed", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("connectingtoserver", 0);
                if (null != var2) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("pleasewait", 0);
                if (var2 != null) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("logging_in", param0 - 31873);
                if (null != var2) {
                  TriangleMesh.field_e = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("reconnect", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("backtoerror", param0 ^ 31873);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("pleasecheckinternet", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("attemptingtoreconnect", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("connectionlost_reconnecting", 0);
                if (null != var2) {
                  SecondaryNodeDequeIterator.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("connectionlost_withreason", 0);
                if (null != var2) {
                  vf.field_a = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("passwordverificationrequired", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("invalidpass", 0);
                if (null != var2) {
                  mp.field_e = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("retry", 0);
                if (var2 != null) {
                  bo.field_k = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("back", 0);
                if (null != var2) {
                  bo.field_f = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("exitfullscreenmode", param0 - 31873);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("quittowebsite", 0);
                if (null != var2) {
                  FullscreenFocusCanvas.field_e = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("connectionrestored", 0);
                if (null != var2) {
                  GameResultsScreen.field_D = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("warning_ifyouquit", 0);
                if (null != var2) {
                  ed.field_a = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("warning_ifyouquitorleavepage", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("resubscribe_withoutlosing_fs", 0);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("resubscribe_withoutlosing", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("customersupport_withoutlosing_fs", param0 ^ 31873);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("customersupport_withoutlosing", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("js5help_withoutlosing_fs", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("js5help_withoutlosing", param0 - 31873);
                if (var2 != null) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("checkinternet_withoutlosing_fs", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("checkinternet_withoutlosing", 0);
                if (var2 != null) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("create_intro", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_sameaccounttip_unnamed", 0);
                if (null != var2) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("dateofbirthprompt", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("fetchingcountrylist", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("countryprompt", param0 - 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("countrylisterror", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("theonlypersonalquestions", param0 - 31873);
                if (var2 != null) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("create_submittingdata", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("check", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_pleasechooseausername", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_usernameblurb", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("checkingavailability", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("checking", 0);
                if (null != var2) {
                  NameAvailabilityValidator.field_m = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("create_namealreadytaken", param0 - 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_sameaccounttip_named", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_nosuggestions", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_alternativelygoback", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_available", param0 - 31873);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_willnowshowtermsandconditions", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("fetchingterms", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("termserror", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_iagree", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_idisagree", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_pleasescrolldowntoaccept", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_linkaddress", 0);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("openinpopupwindow", 0);
                if (var2 != null) {
                  IntrusiveNode.field_g = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create", 0);
                if (null != var2) {
                  hm.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_pleasechooseapassword", param0 - 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_passwordblurb", param0 - 31873);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_nevergivepassword", param0 ^ 31873);
                if (var2 != null) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("creatingyouraccount", param0 ^ 31873);
                if (null != var2) {
                  hm.field_e = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_youmustaccept", param0 - 31873);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("create_passwordsdifferent", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_success", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("day", param0 ^ 31873);
                if (var2 != null) {
                  ij.field_r = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("month", 0);
                if (null != var2) {
                  fc.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("year", param0 - 31873);
                if (var2 != null) {
                  ji.field_e = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("monthnames,0", 0);
                if (null != var2) {
                  dh.field_c[0] = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("monthnames,1", param0 - 31873);
                if (null != var2) {
                  dh.field_c[1] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("monthnames,2", 0);
                if (var2 != null) {
                  dh.field_c[2] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("monthnames,3", 0);
                if (null != var2) {
                  dh.field_c[3] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("monthnames,4", 0);
                if (var2 != null) {
                  dh.field_c[4] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("monthnames,5", param0 - 31873);
                if (var2 != null) {
                  dh.field_c[5] = of.a(var2, DraggableWidget.a(param0, 31872));
                }
                var2 = vd.getGameTextFile("monthnames,6", 0);
                if (null != var2) {
                  dh.field_c[6] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("monthnames,7", 0);
                if (null != var2) {
                  dh.field_c[7] = of.a(var2, DraggableWidget.a(param0, 31872));
                }
                var2 = vd.getGameTextFile("monthnames,8", 0);
                if (null != var2) {
                  dh.field_c[8] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("monthnames,9", 0);
                if (var2 != null) {
                  dh.field_c[9] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("monthnames,10", param0 - 31873);
                if (null != var2) {
                  dh.field_c[10] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("monthnames,11", 0);
                if (null != var2) {
                  dh.field_c[11] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_welcome", 0);
                if (null != var2) {
                  ClientContextMenu.field_n = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_u13_welcome", 0);
                if (var2 != null) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("create_createanaccount", 0);
                if (var2 != null) {
                  AlphaContainer.field_M = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("create_username", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_displayname", param0 ^ 31873);
                if (null != var2) {
                  BufferedSocket.field_i = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_password", 0);
                if (null != var2) {
                  AccountRequestDialog.field_qb = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_password_confirm", 0);
                if (null != var2) {
                  r.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_email", 0);
                if (var2 != null) {
                  DialWidget.field_S = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_email_confirm", 0);
                if (var2 != null) {
                  mp.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_age", 0);
                if (null != var2) {
                  TriangleMesh.field_O = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_u13_email", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_u13_email_confirm", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_dob", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_country", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_alternatives_header", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_alternatives_select", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_suggestions", 0);
                if (null != var2) {
                  JavaRandomHelpers.field_c = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("create_more_suggestions", param0 ^ 31873);
                if (null != var2) {
                  d.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_select_alternative", param0 - 31873);
                if (null != var2) {
                  LoginMethod.field_a = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_optin_news", param0 ^ 31873);
                if (null != var2) {
                  CanvasRasterBuffer.field_j = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_agreeterms", 0);
                if (null != var2) {
                  DelegatingCanvas.field_f = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_u13terms", param0 - 31873);
                if (var2 != null) {
                  IndexedSpriteState.field_e = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("login_username_email", 0);
                if (null != var2) {
                  ui.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("login_username", 0);
                if (null != var2) {
                  MusicPatch.field_k = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("login_email", 0);
                if (null != var2) {
                  AchievementsScreen.field_r = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("login_username_tooltip", param0 ^ 31873);
                if (null != var2) {
                  rm.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("login_password_tooltip", 0);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("login_login_tooltip", param0 - 31873);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("login_create_tooltip", param0 - 31873);
                if (null != var2) {
                  KeyboardInputHandler.field_a = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("login_justplay_tooltip", param0 - 31873);
                if (null != var2) {
                  PuzzleThumbnail.field_q = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("login_back_tooltip", 0);
                if (var2 != null) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("login_no_displayname", 0);
                if (null != var2) {
                  PlayerController.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_username_tooltip", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_username_hint", param0 - 31873);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_displayname_tooltip", 0);
                if (var2 != null) {
                  StatusBar.field_i = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_displayname_hint", 0);
                if (var2 != null) {
                  na.field_a = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_password_tooltip", 0);
                if (var2 != null) {
                  QuickChatMenu.field_Eb = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("create_password_hint", 0);
                if (null != var2) {
                  PictureStrip.field_i = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_password_confirm_tooltip", param0 - 31873);
                if (var2 != null) {
                  Puzzle.field_f = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_email_tooltip", 0);
                if (null != var2) {
                  LabeledField.field_N = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_email_confirm_tooltip", 0);
                if (null != var2) {
                  jf.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_age_tooltip", 0);
                if (null != var2) {
                  IntrusiveDeque.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_optin_news_tooltip", param0 ^ 31873);
                if (var2 != null) {
                  mc.field_o = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("create_u13_email_tooltip", 0);
                if (var2 != null) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("create_u13_email_confirm_tooltip", param0 ^ 31873);
                if (var2 != null) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("create_dob_tooltip", param0 ^ 31873);
                if (var2 != null) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("create_country_tooltip", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_optin_tooltip", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_continue", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_username_unavailable", 0);
                if (var2 != null) {
                  ek.field_e = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_username_available", param0 ^ 31873);
                if (null != var2) {
                  MusicCrossfadeStream.field_L = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("create_alert_namelength", 0);
                if (null != var2) {
                  em.field_b = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("create_alert_namechars", 0);
                if (null != var2) {
                  DualLinkDeque.field_g = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("create_alert_nameleadingspace", 0);
                if (null != var2) {
                  MatchController.field_k = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_alert_doublespace", 0);
                if (var2 != null) {
                  AsyncValidationResult.field_f = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_alert_passchars", 0);
                if (var2 != null) {
                  ResizableModalPanel.field_R = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("create_alert_passrepeated", param0 ^ 31873);
                if (var2 != null) {
                  AgeValidator.field_n = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("create_alert_passlength", 0);
                if (var2 != null) {
                  MusicCrossfadeStream.field_y = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_alert_passcontainsname", 0);
                if (var2 != null) {
                  StrongCacheReference.field_w = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_alert_passcontainsemail", param0 ^ 31873);
                if (null != var2) {
                  ki.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_alert_passcontainsname_partial", param0 ^ 31873);
                if (var2 != null) {
                  pk.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_alert_checkname", 0);
                if (var2 != null) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("create_alert_invalidemail", 0);
                if (null != var2) {
                  QuickChatPhraseDefinition.field_A = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_alert_email_unavailable", param0 - 31873);
                if (var2 != null) {
                  SpriteCheckboxPainter.field_e = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("create_alert_invaliddate", 0);
                if (var2 != null) {
                  RankingTableRequest.field_p = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_alert_invalidage", 0);
                if (null != var2) {
                  mc.field_t = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("create_alert_yearrange", 0);
                if (null != var2) {
                  TextLayout.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_alert_mismatch", 0);
                if (var2 != null) {
                  sk.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_passwordvalid", 0);
                if (null != var2) {
                  cd.field_a = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_emailvalid", 0);
                if (var2 != null) {
                  e.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("create_account_success", 0);
                if (null != var2) {
                  ValidatedTextWidget.field_jb = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("invalid_name", param0 - 31873);
                if (var2 != null) {
                  qn.field_n = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("cannot_add_yourself", param0 - 31873);
                if (null != var2) {
                  GrowableIntList.field_h = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("unable_to_add_friend", 0);
                if (var2 != null) {
                  Bzip2State.field_C = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("unable_to_add_ignore", 0);
                if (var2 != null) {
                  WeightedLruCache.field_d = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("unable_to_delete_friend", 0);
                if (null != var2) {
                  qg.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("unable_to_delete_ignore", 0);
                if (null != var2) {
                  JavaRandomHelpers.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("friendlistfull", 0);
                if (null != var2) {
                  MarkerSlider.field_Q = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("friendlistdupe", 0);
                if (null != var2) {
                  BufferedSocket.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("friendnotfound", param0 ^ 31873);
                if (null != var2) {
                  AccountMessagePanel.field_R = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("ignorelistfull", 0);
                if (null != var2) {
                  ViewportController.field_k = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("ignorelistdupe", 0);
                if (null != var2) {
                  SpriteState.field_H = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("ignorenotfound", 0);
                if (var2 != null) {
                  ug.field_p = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("removeignorefirst", 0);
                if (null != var2) {
                  EmergentBehaviourBackground.field_r = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("removefriendfirst", 0);
                if (null != var2) {
                  ArchiveProvider.field_b = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("enterfriend_add", 0);
                if (null != var2) {
                  BackgroundScene.field_j = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("enterfriend_del", 0);
                if (var2 != null) {
                  hp.field_Fb = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("enterignore_add", param0 - 31873);
                if (var2 != null) {
                  GameplayScreen.field_p = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("enterignore_del", 0);
                if (var2 != null) {
                  ProxyAuthenticationException.field_f = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("text_removed_from_game", 0);
                if (var2 != null) {
                  IntrusiveDeque.field_a = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("text_lobby_pleaselogin_free", 0);
                if (var2 != null) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("opengl", param0 - 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("sse", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("purejava", param0 - 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("waitingfor_graphics", param0 ^ 31873);
                if (null != var2) {
                  SocialListEntry.field_Mb = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("waitingfor_models", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("waitingfor_fonts", 0);
                if (var2 != null) {
                  CanvasRasterBuffer.field_f = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("waitingfor_soundeffects", 0);
                if (var2 != null) {
                  l.field_u = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("waitingfor_music", 0);
                if (var2 != null) {
                  fq.field_p = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("waitingfor_instruments", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("waitingfor_levels", param0 ^ 31873);
                if (var2 != null) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("waitingfor_extradata", 0);
                if (var2 != null) {
                  jd.field_p = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("waitingfor_languages", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("waitingfor_textures", param0 - 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("waitingfor_animations", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("loading_graphics", 0);
                if (var2 != null) {
                  PasswordValidator.field_q = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("loading_models", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("loading_fonts", 0);
                if (null != var2) {
                  CipherPacketBuffer.field_x = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("loading_soundeffects", param0 ^ 31873);
                if (null != var2) {
                  EmergentBehaviourBackground.field_n = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("loading_music", 0);
                if (null != var2) {
                  AccountChoicePanel.field_I = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("loading_instruments", param0 ^ 31873);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("loading_levels", 0);
                if (null != var2) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("loading_extradata", 0);
                if (var2 != null) {
                  em.field_a = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("loading_languages", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("loading_textures", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("loading_animations", 0);
                if (null != var2) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("unpacking_graphics", 0);
                if (null != var2) {
                  CachedTextLayout.field_g = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("unpacking_models", 0);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("unpacking_soundeffects", 0);
                if (var2 != null) {
                  rh.field_r = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("unpacking_music", param0 - 31873);
                if (var2 != null) {
                  ff.field_f = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("unpacking_levels", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("unpacking_languages", param0 - 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("unpacking_animations", param0 - 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("unpacking_toolkit", param0 ^ 31873);
                if (var2 != null) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("instructions", 0);
                if (var2 != null) {
                  cm.field_l = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("tutorial", param0 ^ 31873);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("playtutorial", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("sound_colon", param0 ^ 31873);
                if (var2 != null) {
                  HowToPlayScreen.field_p = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("music_colon", param0 - 31873);
                if (null != var2) {
                  ScoreMarkerDemo.field_e = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("fullscreen", 0);
                if (var2 != null) {
                  wk.field_f = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("screensize", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("highscores", 0);
                if (var2 != null) {
                  CacheReference.field_u = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("rankings", 0);
                if (null != var2) {
                  MatchHud.field_l = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("achievements", 0);
                if (null != var2) {
                  SecondaryNodeDeque.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("achievementsthisgame", param0 ^ 31873);
                if (var2 != null) {
                  of.a(var2, 1);
                }
            }
            void runChunk2() throws java.lang.RuntimeException {
                var2 = vd.getGameTextFile("achievementsthissession", param0 ^ 31873);
                if (var2 != null) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("watchintroduction", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("quit", 0);
                if (null != var2) {
                  cl.field_c = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("login_createaccount", 0);
                if (null != var2) {
                  td.field_a = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("tohighscores", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("returntomainmenu", 0);
                if (null != var2) {
                  AccountChoicePanel.field_K = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("returntopausemenu", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("returntooptionsmenu_notpaused", 0);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mainmenu", 0);
                if (var2 != null) {
                  gq.field_m = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("pausemenu", 0);
                if (var2 != null) {
                  FullscreenFocusCanvas.field_b = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("optionsmenu_notpaused", param0 ^ 31873);
                if (null != var2) {
                  TextFieldValidator.field_k = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("menu", param0 - 31873);
                if (var2 != null) {
                  ge.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("selectlevel", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("nextlevel", param0 - 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("startgame", param0 - 31873);
                if (var2 != null) {
                  DateInputWidget.field_J = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("newgame", 0);
                if (null != var2) {
                  LoadingStepTracker.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("resumegame", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("resumetutorial", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("skip", param0 ^ 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("skiptutorial", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("skipending", param0 - 31873);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("restartlevel", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("endtest", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("endgame", 0);
                if (var2 != null) {
                  ih.field_e = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("endtutorial", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("ok", 0);
                if (null != var2) {
                  ig.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("on", param0 ^ 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("off", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("previous", 0);
                if (null != var2) {
                  PasswordFieldPainter.field_z = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("prev", param0 - 31873);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("next", 0);
                if (var2 != null) {
                  qh.field_f = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("graphics_colon", 0);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("hotseatmultiplayer", param0 ^ 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("entermultiplayerlobby", 0);
                if (null != var2) {
                  CheckboxPainter.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("singleplayergame", 0);
                if (null != var2) {
                  TabbedPanel.field_Nb = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("returntogame", 0);
                if (null != var2) {
                  sk.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("endgameresign", 0);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("offerdraw", 0);
                if (var2 != null) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("canceldraw", 0);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("acceptdraw", 0);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("resign", 0);
                if (null != var2) {
                  FallingPieceView.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("returntolobby", 0);
                if (null != var2) {
                  ra.field_f = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("cont", 0);
                if (null != var2) {
                  MusicCrossfadeStream.field_J = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("continue_spectating", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("messages", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("graphics_fastest", param0 - 31873);
                if (null != var2) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("graphics_medium", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("graphics_best", param0 ^ 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("graphics_directx", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("graphics_opengl", param0 ^ 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("graphics_java", param0 - 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("graphics_quality_high", 0);
                if (var2 != null) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("graphics_quality_low", 0);
                if (null != var2) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("graphics_mode", 0);
                if (null != var2) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("graphics_quality", 0);
                if (null != var2) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("mode", param0 - 31873);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("quality", param0 - 31873);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("keys", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("objective", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("currentobjective", 0);
                if (var2 != null) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("pressescforpausemenu", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("pressescforpausemenuortoskiptutorial", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("pressescforoptionsmenu_doesntpause", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("pressescforoptionsmenu_doesntpause_short", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("powerups", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("latestlevel_suffix", param0 ^ 31873);
                if (var2 != null) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("unreachedlevel_name", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("unreachedlevel_cannotplayreason", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("unreachedlevel_cannotplayreason_shorter", param0 - 31873);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("unreachedworld_cannotplayreason", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("memberslevel_name", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("memberslevel_cannotplayreason", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("membersworld_cannotplayreason", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("unreachedlevel_createtip", 0);
                if (null != var2) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("unreachedlevel_createtip_line1", 0);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("unreachedlevel_createtip_line2", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("unreachedlevel_logintip", 0);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("memberslevel_logintip", param0 - 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("displayname_none", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("levelxofy1", param0 - 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("levelxofy2", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("levelxofy", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("ingame_level", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mouseoveranicon", 0);
                if (null != var2) {
                  th.field_a = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("notyetachieved", param0 ^ 31873);
                if (null != var2) {
                  PicturePreview.field_t = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("achieved", param0 - 31873);
                if (var2 != null) {
                  ViewportController.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("orbpoints", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("orbcoins", 0);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("orbpoints_colon", param0 - 31873);
                if (null != var2) {
                  MainMenuScreen.field_p = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("orbcoins_colon", 0);
                if (null != var2) {
                  DisplayNameForm.field_K = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("achieved_colon_description", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("secretachievement", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("no_highscores", 0);
                if (null != var2) {
                  wo.field_a = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("hs_name", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("hs_level", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("hs_fromlevel", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("hs_tolevel", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("hs_score", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("hs_end", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("ingame_score", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("score_colon", param0 ^ 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_leavegame", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_offerrematch", 0);
                if (null != var2) {
                  dq.field_c = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mp_offerrematch_unrated", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_acceptrematch", 0);
                if (var2 != null) {
                  ConditionalTextValue.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_acceptrematch_unrated", param0 - 31873);
                if (null != var2) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("mp_cancelrematch", param0 ^ 31873);
                if (null != var2) {
                  fg.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_cancelrematch_unrated", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_rematchnewgame", 0);
                if (var2 != null) {
                  EmergentBehaviourBackground.field_t = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_rematchnewgame_unrated", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_x_wantstodraw", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_x_offersrematch", 0);
                if (null != var2) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("mp_x_offersrematch_unrated", 0);
                if (var2 != null) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mp_youofferrematch", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_youofferrematch_unrated", param0 ^ 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_youofferdraw", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_youresigned", param0 ^ 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_youresigned_rematch", param0 - 31873);
                if (var2 != null) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mp_x_hasresignedandleft", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_x_hasresigned_rematch", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_x_hasresigned", 0);
                if (var2 != null) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mp_x_hasleft", param0 - 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_x_haswon", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_youhavewon", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_gamedrawn", param0 ^ 31873);
                if (var2 != null) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mp_timeremaining", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_x_turn", param0 ^ 31873);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_yourturn", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("gameover", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_hidechat", param0 - 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mp_showchat_nounread", 0);
                if (null != var2) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("mp_showchat_unread1", 0);
                if (var2 != null) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("mp_showchat_unread2", param0 - 31873);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("click_to_quickchat", param0 - 31873);
                if (var2 != null) {
                  JaggrabDownloader.field_i = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("autorespond", param0 ^ 31873);
                if (null != var2) {
                  NodeHashTable.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("quickchat_help", param0 ^ 31873);
                if (null != var2) {
                  ui.field_g = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("quickchat_help_title", 0);
                if (null != var2) {
                  TextFieldValidator.field_g = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("quickchat_shortcut_help,0", param0 - 31873);
                if (null != var2) {
                  TextLayout.field_c[0] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("quickchat_shortcut_help,1", param0 - 31873);
                if (null != var2) {
                  TextLayout.field_c[1] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("quickchat_shortcut_help,2", param0 ^ 31873);
                if (null != var2) {
                  TextLayout.field_c[2] = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("quickchat_shortcut_help,3", 0);
                if (var2 != null) {
                  TextLayout.field_c[3] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("quickchat_shortcut_help,4", 0);
                if (var2 != null) {
                  TextLayout.field_c[4] = of.a(var2, DraggableWidget.a(param0, 31872));
                }
                var2 = vd.getGameTextFile("quickchat_shortcut_help,5", 0);
                if (null != var2) {
                  TextLayout.field_c[5] = of.a(var2, DraggableWidget.a(param0, 31872));
                }
                var2 = vd.getGameTextFile("quickchat_shortcut_keys,0", 0);
                if (null != var2) {
                  SpriteState.field_I[0] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("quickchat_shortcut_keys,1", 0);
                if (var2 != null) {
                  SpriteState.field_I[1] = of.a(var2, DraggableWidget.a(param0, 31872));
                }
                var2 = vd.getGameTextFile("quickchat_shortcut_keys,2", 0);
                if (var2 != null) {
                  SpriteState.field_I[2] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("quickchat_shortcut_keys,3", 0);
                if (var2 != null) {
                  SpriteState.field_I[3] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("quickchat_shortcut_keys,4", 0);
                if (null != var2) {
                  SpriteState.field_I[4] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("quickchat_shortcut_keys,5", param0 - 31873);
                if (var2 != null) {
                  SpriteState.field_I[5] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("keychar_the_character_under_questionmark", 0);
                if (null != var2) {
                  PieceTiming.field_d = cm.decodeCp1252Byte(var2[0], 63);
                }
                var2 = vd.getGameTextFile("rating_noratings", 0);
                if (var2 != null) {
                  SpriteState.field_z = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rating_rating", 0);
                if (null != var2) {
                  MarkerSliderPainter.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rating_played", 0);
                if (null != var2) {
                  TextHotspotWidget.field_N = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rating_won", 0);
                if (null != var2) {
                  wa.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rating_lost", 0);
                if (null != var2) {
                  ab.field_e = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("rating_drawn", 0);
                if (var2 != null) {
                  IntrusiveNode.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("benefits_fullscreen", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("benefits_noadverts", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("benefits_price", 0);
                if (var2 != null) {
                  jm.field_p = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("members_expansion_benefits,0", param0 ^ 31873);
                if (var2 != null) {
                  DateInputWidget.field_I[0] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("members_expansion_benefits,1", param0 - 31873);
                if (null != var2) {
                  DateInputWidget.field_I[1] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("members_expansion_benefits,2", 0);
                if (null != var2) {
                  DateInputWidget.field_I[2] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("members_expansion_price_top", param0 - 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("members_expansion_price_bottom", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("reconnect_lost_seq,0", 0);
                if (var2 != null) {
                  CanvasRasterBuffer.field_c[0] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("reconnect_lost_seq,1", 0);
                if (var2 != null) {
                  CanvasRasterBuffer.field_c[1] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("reconnect_lost_seq,2", 0);
                if (null != var2) {
                  CanvasRasterBuffer.field_c[2] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("reconnect_lost_seq,3", param0 ^ 31873);
                if (null != var2) {
                  CanvasRasterBuffer.field_c[3] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("reconnect_lost", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("reconnect_restored", param0 - 31873);
                if (var2 != null) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("reconnect_please_check", param0 ^ 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("reconnect_wait", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("reconnect_retry", param0 - 31873);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("reconnect_resume", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("reconnect_or", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("reconnect_exitfs", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("reconnect_exitfs_quit", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("reconnect_quit", param0 ^ 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("reconnect_check_fs", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("reconnect_check_nonfs", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("fs_accept_beforeaccept", 0);
                if (var2 != null) {
                  vf.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("fs_button_accept", param0 - 31873);
                if (var2 != null) {
                  MusicPatch.field_q = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("fs_accept_afteraccept", 0);
                if (var2 != null) {
                  QuickChatPhraseCache.field_n = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("fs_button_cancel", param0 - 31873);
                if (var2 != null) {
                  vm.field_g = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("fs_accept_aftercancel", param0 ^ 31873);
                if (var2 != null) {
                  DirectByteStorage.field_m = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("fs_accept_countdown_sing", 0);
                if (null != var2) {
                  DualLinkNode.field_n = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("fs_accept_countdown_pl", 0);
                if (var2 != null) {
                  BirthDateEntryPanel.field_R = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("fs_nonmember", 0);
                if (var2 != null) {
                  l.field_t = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("fs_button_close", 0);
                if (var2 != null) {
                  TabbedPanel.field_Hb = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("fs_button_members", 0);
                if (null != var2) {
                  ln.field_k = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("fs_unavailable", param0 ^ 31873);
                if (var2 != null) {
                  el.field_c = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("fs_unavailable_try_signed_applet", param0 - 31873);
                if (var2 != null) {
                  TextLayoutLine.field_a = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("fs_focus", 0);
                if (null != var2) {
                  l.field_o = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("fs_focus_or_resolution", param0 ^ 31873);
                if (var2 != null) {
                  ViewportController.field_e = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("fs_timeout", 0);
                if (var2 != null) {
                  CanvasRasterBuffer.field_k = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("fs_button_tryagain", param0 - 31873);
                if (var2 != null) {
                  StatusBar.field_b = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("graphics_ui_fs_countdown", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mb_caption_title", param0 - 31873);
                if (null != var2) {
                  ri.field_i = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mb_including_gamename", 0);
                if (null != var2) {
                  dk.field_f = of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("mb_full_access_1", param0 ^ 31873);
                if (var2 != null) {
                  MusicCrossfadeStream.field_s = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mb_full_access_2", 0);
                if (var2 != null) {
                  TimerBarDemo.field_n = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mb_achievement_count_1", 0);
                if (null != var2) {
                  ab.field_d = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mb_achievement_count_2", 0);
                if (var2 != null) {
                  BoardView.field_l = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mb_exclusive_1", 0);
                if (var2 != null) {
                  UiComponent.field_w = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mb_exclusive_2", 0);
                if (var2 != null) {
                  ri.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("me_extra_benefits", 0);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("hs_friend_tip", 0);
                if (var2 != null) {
                  MenuInputState.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("hs_friend_tip_multi", param0 ^ 31873);
                if (null != var2) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("hs_mode_name,0", 0);
                if (var2 != null) {
                  LoadingStepTracker.field_k[0] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("hs_mode_name,1", 0);
                if (null != var2) {
                  LoadingStepTracker.field_k[1] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("hs_mode_name,2", 0);
                if (null != var2) {
                  LoadingStepTracker.field_k[2] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rating_mode_name,0", 0);
                if (var2 != null) {
                  dg.field_c[0] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rating_mode_name,1", 0);
                if (null != var2) {
                  dg.field_c[1] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rating_mode_long_name,0", 0);
                if (null != var2) {
                  DualLinkNode.field_k[0] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("rating_mode_long_name,1", param0 ^ 31873);
                if (null != var2) {
                  DualLinkNode.field_k[1] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("graphics_config_fixed_size", 0);
                if (null != var2) {
                  of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("graphics_config_resizable", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("graphics_config_fullscreen", param0 - 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("graphics_config_done", 0);
                if (var2 != null) {
                  of.a(var2, param0 ^ 31872);
                }
                var2 = vd.getGameTextFile("graphics_config_apply", param0 - 31873);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("graphics_config_title", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("graphics_config_instruction", 0);
                if (null != var2) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("graphics_config_need_memory", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("pleasewait_dotdotdot", param0 ^ param0);
                if (var2 != null) {
                  GrowableIntList.field_b = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("serviceunavailable", param0 - 31873);
                if (null != var2) {
                  MenuInputState.field_l = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("createtouse", param0 - 31873);
                if (null != var2) {
                  ScoreMarkerDemo.field_h = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("achievementsoffline", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("warning", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("DEFAULT_PLAYER_NAME", 0);
                if (var2 != null) {
                  cd.field_d = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin1", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin2,1", 0);
                if (null != var2) {
                  fp.field_a[1] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin2,2", param0 ^ 31873);
                if (var2 != null) {
                  fp.field_a[2] = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mustlogin2,3", 0);
                if (null != var2) {
                  fp.field_a[3] = of.a(var2, DraggableWidget.a(param0, 31872));
                }
                var2 = vd.getGameTextFile("mustlogin2,4", 0);
                if (var2 != null) {
                  fp.field_a[4] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin2,5", 0);
                if (var2 != null) {
                  fp.field_a[5] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin2,6", param0 - 31873);
                if (null != var2) {
                  fp.field_a[6] = of.a(var2, DraggableWidget.a(param0, 31872));
                }
                var2 = vd.getGameTextFile("mustlogin2,7", 0);
                if (var2 != null) {
                  fp.field_a[7] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin3,1", 0);
                if (var2 != null) {
                  WidgetStyleLayer.field_i[1] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin3,2", 0);
                if (null != var2) {
                  WidgetStyleLayer.field_i[2] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin3,3", 0);
                if (null != var2) {
                  WidgetStyleLayer.field_i[3] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin3,4", 0);
                if (var2 != null) {
                  WidgetStyleLayer.field_i[4] = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mustlogin3,5", 0);
                if (var2 != null) {
                  WidgetStyleLayer.field_i[5] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin3,6", 0);
                if (var2 != null) {
                  WidgetStyleLayer.field_i[6] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin3,7", 0);
                if (null != var2) {
                  WidgetStyleLayer.field_i[7] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("discard", 0);
                if (null != var2) {
                  ScoreMarkerDemo.field_i = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin4,1", 0);
                if (var2 != null) {
                  TextTableInitializer.field_a[1] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin4,2", param0 ^ 31873);
                if (null != var2) {
                  TextTableInitializer.field_a[2] = of.a(var2, DraggableWidget.a(param0, 31872));
                }
                var2 = vd.getGameTextFile("mustlogin4,3", 0);
                if (null != var2) {
                  TextTableInitializer.field_a[3] = of.a(var2, 1);
                }
            }
            void runChunk3() throws java.lang.RuntimeException {
                var2 = vd.getGameTextFile("mustlogin4,4", 0);
                if (var2 != null) {
                  TextTableInitializer.field_a[4] = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mustlogin4,5", 0);
                if (null != var2) {
                  TextTableInitializer.field_a[5] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin4,6", 0);
                if (null != var2) {
                  TextTableInitializer.field_a[6] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin4,7", 0);
                if (var2 != null) {
                  TextTableInitializer.field_a[7] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin_notloggedin", 0);
                if (null != var2) {
                  EmailValidator.field_p = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin_alternate,1", 0);
                if (var2 != null) {
                  MouseWheelHandler.field_a[1] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin_alternate,2", 0);
                if (var2 != null) {
                  MouseWheelHandler.field_a[2] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin_alternate,3", 0);
                if (null != var2) {
                  MouseWheelHandler.field_a[3] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin_alternate,4", 0);
                if (var2 != null) {
                  MouseWheelHandler.field_a[4] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("mustlogin_alternate,5", 0);
                if (var2 != null) {
                  MouseWheelHandler.field_a[5] = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mustlogin_alternate,6", 0);
                if (var2 != null) {
                  MouseWheelHandler.field_a[6] = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("mustlogin_alternate,7", 0);
                if (null != var2) {
                  MouseWheelHandler.field_a[7] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("subscription_cost_monthly,0", param0 - 31873);
                if (null != var2) {
                  wp.field_b[0] = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("subscription_cost_monthly,1", 0);
                if (null != var2) {
                  wp.field_b[1] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("subscription_cost_monthly,2", 0);
                if (var2 != null) {
                  wp.field_b[2] = of.a(var2, DraggableWidget.a(param0, 31872));
                }
                var2 = vd.getGameTextFile("subscription_cost_monthly,3", 0);
                if (var2 != null) {
                  wp.field_b[3] = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("subscription_cost_monthly,4", param0 ^ 31873);
                if (null != var2) {
                  wp.field_b[4] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("subscription_cost_monthly,5", 0);
                if (var2 != null) {
                  wp.field_b[5] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("subscription_cost_monthly,6", 0);
                if (null != var2) {
                  wp.field_b[6] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("subscription_cost_monthly,7", param0 - 31873);
                if (var2 != null) {
                  wp.field_b[7] = of.a(var2, param0 - 31872);
                }
                var2 = vd.getGameTextFile("subscription_cost_monthly,8", 0);
                if (null != var2) {
                  wp.field_b[8] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("subscription_cost_monthly,9", 0);
                if (null != var2) {
                  wp.field_b[9] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("subscription_cost_monthly,10", param0 ^ 31873);
                if (var2 != null) {
                  wp.field_b[10] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("subscription_cost_monthly,11", param0 - 31873);
                if (null != var2) {
                  wp.field_b[11] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("subscription_cost_monthly,12", 0);
                if (var2 != null) {
                  wp.field_b[12] = of.a(var2, 1);
                }
                var2 = vd.getGameTextFile("sentence_separator", 0);
                if (var2 != null) {
                  of.a(var2, 1);
                }
                AsyncValidationResult.field_b = null;
            }
            void run() {
                var3 = Pixelate.field_H ? 1 : 0;
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
                  stackIn_2602_0 = (RuntimeException) (var2_ref);
                  stackIn_2602_1 = new StringBuilder().append("uk.B(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_2603_2 = "null";
                  } else {
                    stackIn_2603_2 = "{...}";
                  }
                  throw aa.addExceptionContext((Throwable) ((Object) stackIn_2602_0), ((StringBuilder) (Object) stackIn_2602_1).append(stackIn_2603_2).append(')').toString());
                }
                if (var3 != 0) {
                  var4 = GameApplet.field_l;
                  var4++;
                  GameApplet.field_l = var4;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    public static void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_r = null;
          if (param0) {
            field_r = (String[]) null;
          }
          field_q = null;
          field_u = null;
          field_s = null;
          field_v = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var1), "uk.E(" + param0 + ')');
        }
    }

    final void handleNavigation(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          var2_int = this.field_g.selectedIndex;
          if (param0 > -35) {
            GameModeSelectScreen.loadTextTable(-67, (ResourceArchive) null);
          }
          if (ke.field_a != 96 &&
            ke.field_a != 97 &&
            ke.field_a != 98 &&
            99 != ke.field_a) {
            super.handleNavigation(-92);
            if (var3 == 0) {
              return;
            }
          }
          if (var2_int != -1) {
            if (96 == ke.field_a &&
              1 == var2_int) {
              this.field_g.selectIndex(false, 0);
            }
            if (ke.field_a == 97 &&
              0 == var2_int) {
              this.field_g.selectIndex(false, 1);
            }
            if (98 == ke.field_a &&
              2 == var2_int) {
              this.field_g.selectIndex(false, this.field_t);
            }
            if (ke.field_a != 99) {
              return;
            }
            if (2 <= var2_int) {
              return;
            }
            this.field_t = var2_int;
            this.field_g.selectIndex(false, 2);
            if (var3 == 0) {
              return;
            }
          }
          this.field_g.selectIndex(false, 2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var2), "uk.C(" + param0 + ')');
        }
    }

    final static void renderTriangleMesh(int param0, TriangleMesh param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_26_0 = 0;
        int[] stackIn_29_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        jk stackIn_65_0 = null;
        int stackIn_73_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_85_2 = null;
        RuntimeException decompiledCaughtException = null;
        TriangleMesh var8 = null;
        int[] var8_array = null;
        RuntimeException var8_ref = null;
        byte[] var9 = null;
        int[] var9_array = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        jk var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int stackIn_33_0Lifetime1;
        int stackIn_33_1Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        int var15Lifetime3;
        var40 = Pixelate.field_H ? 1 : 0;
        try {
          var8 = param1;
          if (var8.field_n != null &&
            1 < var8.field_B) {
            var9 = var8.field_n;
            pk.orderFacesByGroup(var9, 0, ConditionalTextValue.field_i, 77, 0);
            if (var40 != 0) {
              InputQueue.compactMeshBlocks(0);
            }
          } else {
            InputQueue.compactMeshBlocks(0);
          }
          if (param6 != 20126) {
            field_u = (ResourceArchive) null;
          }
          var8_array = new int[param1.field_a];
          var9_array = new int[param1.field_a];
          var10 = GrowableIntList.field_i;
          var11 = IconTextComponent.field_Ib;
          var12 = SocketJs5Transport.field_q;
          var13 = 0;
          while (param1.field_a > var13) {
            var14 = var11[var13] * param4 + param7 * var10[var13] + param3 * var12[var13] >> 8;
            stackIn_33_0 = ~var14;
            stackIn_33_1 = -1;
            if (var40 != 0) {
              if (stackIn_33_0 <= stackIn_33_1) {
                return;
              }
              var14 = nd.field_c[var13];
              var15 = param1.field_h[var14];
              var16 = param1.field_I[var14];
              var17 = param1.field_o[var14];
              return;
            }
            if (stackIn_33_0 > stackIn_33_1) {
              var14 = -var14;
            }
            if (var14 >= 0) {
              if (var14 >= 128) {
                stackIn_26_0 = 256;
              } else {
                stackIn_26_0 = 128 + var14;
              }
            } else {
              stackIn_26_0 = 128;
            }
            var14Lifetime2 = stackIn_26_0;
            var15Lifetime2 = var12[var13] * param0 + var10[var13] * param2 + param5 * var11[var13] >> 8;
            stackIn_29_0 = nk.field_d;
            if (var15Lifetime2 < 0) {
              stackIn_30_1 = -var15Lifetime2;
            } else {
              stackIn_30_1 = var15Lifetime2;
            }
            var15Lifetime3 = stackIn_29_0[stackIn_30_1];
            var14Lifetime2 = var14Lifetime2 * (256 - var15Lifetime3) >>> 8;
            var8_array[var13] = var14Lifetime2;
            var9_array[var13] = var15Lifetime3;
            var13++;
            if (var40 == 0) {
              continue;
            }
            break;
          }
          var13Lifetime1 = 0;
          while (true) {
            stackIn_33_0Lifetime1 = ~var13Lifetime1;
            stackIn_33_1Lifetime1 = ~mp.field_b;
            if (stackIn_33_0Lifetime1 <= stackIn_33_1Lifetime1) {
              break;
            }
            var14Lifetime1 = nd.field_c[var13Lifetime1];
            var15Lifetime1 = param1.field_h[var14Lifetime1];
            var16Lifetime1 = param1.field_I[var14Lifetime1];
            var17Lifetime1 = param1.field_o[var14Lifetime1];
            if (var40 != 0) {
              return;
            }
            if (param1.field_J[var14Lifetime1] < GrowableIntList.field_i.length) {
              stackIn_41_0 = param1.field_J[var14Lifetime1];
            } else {
              stackIn_41_0 = -1;
            }
            var18 = stackIn_41_0;
            if (param1.field_s[var14Lifetime1] >= GrowableIntList.field_i.length) {
              stackIn_45_0 = -1;
            } else {
              stackIn_45_0 = param1.field_s[var14Lifetime1];
            }
            var19 = stackIn_45_0;
            if (GrowableIntList.field_i.length > param1.field_i[var14Lifetime1]) {
              stackIn_49_0 = param1.field_i[var14Lifetime1];
            } else {
              stackIn_49_0 = -1;
            }
            var20 = stackIn_49_0;
            if (null != qn.field_q &&
              param1.field_l != null &&
              param1.field_l.length > var14Lifetime1 &&
              param1.field_l[var14Lifetime1] != -1 &&
              qn.field_q.length > param1.field_l[var14Lifetime1]) {
              stackIn_65_0 = qn.field_q[param1.field_l[var14Lifetime1]];
            } else {
              stackIn_65_0 = null;
            }
            var21 = stackIn_65_0;
            var22 = ArchiveProvider.field_a[var15Lifetime1];
            var23 = FallingPieceView.field_m[var15Lifetime1];
            var24 = ArchiveProvider.field_a[var16Lifetime1];
            var25 = FallingPieceView.field_m[var16Lifetime1];
            var26 = ArchiveProvider.field_a[var17Lifetime1];
            var27 = FallingPieceView.field_m[var17Lifetime1];
            if (~var19 == ~var18 &&
              ~var20 == ~var19) {
              var28 = var8_array[var18];
              var29 = var9_array[var18];
              if (null != var21) {
                stackIn_73_0 = var21.field_b;
              } else {
                stackIn_73_0 = 8355711;
              }
              var30 = stackIn_73_0;
              var31 = 16711935 & var30;
              var32 = 65280 & var30;
              var33 = (var28 * var31 & -16711857) >>> 8 | (16711885 & var28 * var32) >>> 8;
              var33 = var33 + 65793 * var29;
              ln.a(var26, var25, var24, var23, var27, 8355711 & var33 >> 1, 100, var22);
            } else {
              var28 = var8_array[var18];
              var29 = var8_array[var19];
              var30 = var8_array[var20];
              var31 = var9_array[var18];
              var32 = var9_array[var19];
              var33 = var9_array[var20];
              if (null != var21) {
                stackIn_78_0 = var21.field_b;
              } else {
                stackIn_78_0 = 8355711;
              }
              var34 = stackIn_78_0;
              var35 = var34 & 16711935;
              var36 = var34 & 65280;
              var37 = (var28 * var36 & 16711765) >>> 8 | (-16711730 & var35 * var28) >>> 8;
              var38 = -755040001 & var29 * var35 >>> 8 | (16711829 & var29 * var36) >>> 8;
              var39 = (var35 * var30 & -16711856) >>> 8 | var36 * var30 >>> 8 & -620691712;
              var38 = var38 + var32 * 65793;
              var37 = var37 + var31 * 65793;
              var39 = var39 + 65793 * var33;
              wa.a(var27, var25, var24, var39 >> 16, var37 >> 16, var23, 255 & var38, 255 & var38 >> 8, var26, var37 & 255, var22, -128, 255 & var39, 255 & var39 >> 8, (65289 & var37) >> 8, var38 >> 16);
            }
            var13Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_84_0 = var8_ref;
          stackIn_84_1 = new StringBuilder().append("uk.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_85_2 = "null";
          } else {
            stackIn_85_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_84_0), ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void onCancel(byte param0) {
        try {
          la.changeScreen(this.field_l, TickClock.field_a, false, -25528);
          if (param0 > -13) {
            this.draw(57);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "uk.L(" + param0 + ')');
        }
    }

    final void enterScreen(int param0, int param1, boolean param2) {
        try {
          this.field_t = 0;
          this.field_p.resetHighlight((byte) -54);
          this.field_o.resetHighlight((byte) -84);
          super.enterScreen(param0, 0, param2);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "uk.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void handleInput(byte param0) {
        GameModeCard stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        GameModeCard stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean stackIn_10_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          super.handleInput((byte) -95);
          stackIn_3_0 = this.field_p;
          stackIn_3_1 = -127;
          stackIn_4_2 = (this.field_g.selectedIndex == 0);
          ((GameModeCard) (Object) stackIn_3_0).animateHighlight((byte) stackIn_3_1, stackIn_4_2);
          if (param0 >= -64) {
            return;
          }
          stackIn_9_0 = this.field_o;
          stackIn_9_1 = -125;
          stackIn_10_2 = (this.field_g.selectedIndex == 1);
          ((GameModeCard) (Object) stackIn_9_0).animateHighlight((byte) stackIn_9_1, stackIn_10_2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var2), "uk.O(" + param0 + ')');
        }
    }

    GameModeSelectScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        int var9Lifetime1;
        int var10Lifetime1;
        this.field_t = 0;
        try {
          var7 = new int[256];
          var8 = new int[128];
          var9 = 16742912;
          for (var10 = 0; var7.length > var10; var10++) {
            var7[var10] = cm.bitAnd(var10 * cm.bitAnd(var9, 65280), 16711680) + cm.bitAnd(-16711936, cm.bitAnd(16711935, var9) * var10) >> 8;
          }
          var9Lifetime1 = 39168;
          for (var10Lifetime1 = 0; var8.length > var10Lifetime1; var10Lifetime1++) {
            var8[var10Lifetime1] = cm.bitAnd(cm.bitAnd(var9Lifetime1, 16711935) * var10Lifetime1, -16711936) + cm.bitAnd(cm.bitAnd(var9Lifetime1, 65280) * var10Lifetime1, 16711680) >> 8;
          }
          this.field_p = new GameModeCard(0, 126, var7);
          this.field_o = new GameModeCard(1, 370, var8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_14_0 = var7_ref;
          stackIn_14_1 = new StringBuilder().append("uk.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void draw(int param0) {
        GameModeCard var2 = null;
        String var3 = null;
        GameModeCard stackIn_12_0 = null;
        String stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          NumericDateInputWidget.field_W[3].drawTransparent(0, 45);
          if (param0 != 11) {
            return;
          }
          this.drawDefaultBackdrop((byte) -110);
          this.drawRows((byte) -71);
          if (0 >= this.field_p.field_c &&
            this.field_o.field_c <= 0) {
            return;
          }
          if (this.field_p.field_c <= this.field_o.field_c) {
            stackIn_12_0 = this.field_o;
          } else {
            stackIn_12_0 = this.field_p;
          }
          var2 = stackIn_12_0;
          if (this.field_p != var2) {
            stackIn_16_0 = ge.field_a;
          } else {
            stackIn_16_0 = jm.field_s;
          }
          var3 = stackIn_16_0;
          var2.drawDescriptionBanner(-18879, var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var2_ref), "uk.H(" + param0 + ')');
        }
    }

    final void drawRow(byte param0, boolean param1, int param2) {
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 > -116) {
            field_q = (String[]) null;
          }
          if (param2 == 0) {
            this.field_p.draw(false);
            if (var5 == 0) {
              return;
            }
          }
          if (1 == param2) {
            this.field_o.draw(false);
            if (var5 == 0) {
              return;
            }
          }
          if (param2 == 2) {
            this.drawMenuButton(param1, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var4), "uk.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int rowAt(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_p.containsPoint(param0, param1, -119)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          if (this.field_o.containsPoint(param0, param1, -115)) {
            stackIn_5_0 = 1;
            return stackIn_5_0;
          }
          if (param2 >= -110) {
            stackIn_8_0 = -123;
            return stackIn_8_0;
          }
          if (super.rowAt(param0, param1, -128) == 2) {
            stackIn_13_0 = 2;
            return stackIn_13_0;
          }
          stackIn_15_0 = -1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.addExceptionContext((Throwable) ((Object) var4), "uk.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_q = new String[]{"Enter the multiplayer lobby to compete in a <col=FF9900>head-to-head race</col>! You'll see your opponent's grid next to yours as you both try to make the target picture as quickly as possible. "};
        field_v = new PacketBuffer(256);
    }
}
