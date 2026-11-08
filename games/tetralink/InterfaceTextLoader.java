/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InterfaceTextLoader {
    static String field_b;
    static String field_a;
    static DraggableWidget field_c;
    static IntrusiveDeque field_d;

    final static void loadInterfaceText(int param0, Archive param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_2605_0;
            StringBuilder stackIn_2605_1;
            String stackIn_2606_2;
            boolean stackIn_2614_0;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int param0;
            Archive param1;
            boolean finished;
            $CfrPartitionedBody(int initialParam0, Archive initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_2605_0 = null;
                this.stackIn_2605_1 = null;
                this.stackIn_2606_2 = null;
                this.stackIn_2614_0 = false;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                CachedArchiveSource.field_e = param1;
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -76, "loginm3");
                if (var2 != null) {
                  StrongCacheEntry.field_G = SocialListEntry.decodeExtendedString(var2, -47);
                }
                var2 = PendingListRequest.readNamedRootFile(-92, "loginm2");
                if (var2 != null) {
                  TextureCache.field_d = SocialListEntry.decodeExtendedString(var2, -64);
                }
                var2 = PendingListRequest.readNamedRootFile(-74, "loginm1");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -75);
                }
                var2 = PendingListRequest.readNamedRootFile(-115, "idlemessage20min");
                if (null != var2) {
                  LruTextureCache.field_c = SocialListEntry.decodeExtendedString(var2, -116);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 75, "error_js5crc");
                if (var2 != null) {
                  IterableNodeHashTable.field_c = SocialListEntry.decodeExtendedString(var2, param0 ^ -96);
                }
                var2 = PendingListRequest.readNamedRootFile(-110, "error_js5io");
                if (null != var2) {
                  PieceDropAnimation.field_p = SocialListEntry.decodeExtendedString(var2, -50);
                }
                var2 = PendingListRequest.readNamedRootFile(-74, "error_js5connect_full");
                if (var2 != null) {
                  IntrusiveDeque.field_g = SocialListEntry.decodeExtendedString(var2, -66);
                }
                var2 = PendingListRequest.readNamedRootFile(-92, "error_js5connect");
                if (null != var2) {
                  SpriteCheckboxPainter.field_a = SocialListEntry.decodeExtendedString(var2, -66);
                }
                var2 = PendingListRequest.readNamedRootFile(-118, "login_gameupdated");
                if (null != var2) {
                  AccountTermsPanel.field_O = SocialListEntry.decodeExtendedString(var2, -56);
                }
                var2 = PendingListRequest.readNamedRootFile(-122, "create_unable");
                if (var2 != null) {
                  ClockAndTextHelpers.field_d = SocialListEntry.decodeExtendedString(var2, -46);
                }
                var2 = PendingListRequest.readNamedRootFile(-115, "create_ineligible");
                if (null != var2) {
                  StrongCacheEntry.field_K = SocialListEntry.decodeExtendedString(var2, -100);
                }
                var2 = PendingListRequest.readNamedRootFile(-103, "usernameprompt");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -103);
                }
                var2 = PendingListRequest.readNamedRootFile(-94, "passwordprompt");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -76);
                }
                var2 = PendingListRequest.readNamedRootFile(-89, "andagainprompt");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 51);
                }
                var2 = PendingListRequest.readNamedRootFile(-119, "ticketing_read");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -107);
                }
                var2 = PendingListRequest.readNamedRootFile(-84, "ticketing_ignore");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -49);
                }
                var2 = PendingListRequest.readNamedRootFile(-98, "ticketing_oneunread");
                if (var2 != null) {
                  StatusRequestHelpers.field_g = SocialListEntry.decodeExtendedString(var2, -107);
                }
                var2 = PendingListRequest.readNamedRootFile(-90, "ticketing_xunread");
                if (null != var2) {
                  ArchiveRequest.field_z = SocialListEntry.decodeExtendedString(var2, -128);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 97, "ticketing_gotowebsite");
                if (var2 != null) {
                  ValidatedTextWidget.field_eb = SocialListEntry.decodeExtendedString(var2, -126);
                }
                var2 = PendingListRequest.readNamedRootFile(-127, "ticketing_waitingformessages");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 108);
                }
                var2 = PendingListRequest.readNamedRootFile(-96, "mu_chat_on");
                if (var2 != null) {
                  IsaacCipher.field_h = SocialListEntry.decodeExtendedString(var2, -92);
                }
                var2 = PendingListRequest.readNamedRootFile(-96, "mu_chat_friends");
                if (var2 != null) {
                  MiscTextGlobals.field_a = SocialListEntry.decodeExtendedString(var2, -40);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -88, "mu_chat_off");
                if (var2 != null) {
                  SocialTabsPanel.field_f = SocialListEntry.decodeExtendedString(var2, -87);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -125, "mu_chat_lobby");
                if (var2 != null) {
                  ReflectionCheck.field_v = SocialListEntry.decodeExtendedString(var2, param0 ^ -91);
                }
                var2 = PendingListRequest.readNamedRootFile(-88, "mu_chat_public");
                if (var2 != null) {
                  MusicCrossfadeStream.field_v = SocialListEntry.decodeExtendedString(var2, param0 ^ -123);
                }
                var2 = PendingListRequest.readNamedRootFile(-75, "mu_chat_ignore");
                if (var2 != null) {
                  WeightedLruCache.field_g = SocialListEntry.decodeExtendedString(var2, -76);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 103, "mu_chat_tips");
                if (null != var2) {
                  ReflectionCheckHelpers.field_a = SocialListEntry.decodeExtendedString(var2, -63);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -103, "mu_chat_game");
                if (var2 != null) {
                  KeyHandlerHelpers.field_e = SocialListEntry.decodeExtendedString(var2, -76);
                }
                var2 = PendingListRequest.readNamedRootFile(-81, "mu_chat_private");
                if (var2 != null) {
                  SoundMixerHelpers.field_b = SocialListEntry.decodeExtendedString(var2, -74);
                }
                var2 = PendingListRequest.readNamedRootFile(-76, "mu_x_entered_game");
                if (var2 != null) {
                  DualLinkNodeHashTable.field_k = SocialListEntry.decodeExtendedString(var2, param0 ^ -77);
                }
                var2 = PendingListRequest.readNamedRootFile(-112, "mu_x_joined_your_game");
                if (null != var2) {
                  LabelPairWidget.field_Mb = SocialListEntry.decodeExtendedString(var2, -93);
                }
                var2 = PendingListRequest.readNamedRootFile(-96, "mu_x_entered_other_game");
                if (null != var2) {
                  EmailAvailabilityValidator.field_z = SocialListEntry.decodeExtendedString(var2, param0 ^ -103);
                }
                var2 = PendingListRequest.readNamedRootFile(-128, "mu_x_left_lobby");
                if (null != var2) {
                  RsaKeyAndTextGlobals.field_d = SocialListEntry.decodeExtendedString(var2, -69);
                }
                var2 = PendingListRequest.readNamedRootFile(-116, "mu_x_lost_con");
                if (null != var2) {
                  ErrorPrintHelpers.field_f = SocialListEntry.decodeExtendedString(var2, param0 ^ -78);
                }
                var2 = PendingListRequest.readNamedRootFile(-110, "mu_x_cannot_join_full");
                if (var2 != null) {
                  CameraAndChatHelpers.field_d = SocialListEntry.decodeExtendedString(var2, -127);
                }
                var2 = PendingListRequest.readNamedRootFile(-74, "mu_x_cannot_join_inprogress");
                if (null != var2) {
                  LoginCredentials.field_c = SocialListEntry.decodeExtendedString(var2, -101);
                }
                var2 = PendingListRequest.readNamedRootFile(-95, "mu_x_declined_invite");
                if (var2 != null) {
                  JoinStatusTextHelpers.field_i = SocialListEntry.decodeExtendedString(var2, -111);
                }
                var2 = PendingListRequest.readNamedRootFile(-103, "mu_x_withdrew_request");
                if (var2 != null) {
                  FontAndBrightnessHelpers.field_d = SocialListEntry.decodeExtendedString(var2, param0 - 80);
                }
                var2 = PendingListRequest.readNamedRootFile(-104, "mu_x_removed");
                if (var2 != null) {
                  SoundMixerHelpers.field_a = SocialListEntry.decodeExtendedString(var2, -116);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -107, "mu_x_dropped_out");
                if (var2 != null) {
                  ConditionalTextValue.field_e = SocialListEntry.decodeExtendedString(var2, -86);
                }
                var2 = PendingListRequest.readNamedRootFile(-86, "mu_entered_other_game");
                if (var2 != null) {
                  QuickChatMenu.field_Lb = SocialListEntry.decodeExtendedString(var2, -112);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -77, "mu_game_is_full");
                if (null != var2) {
                  TextWidgetPainter.field_l = SocialListEntry.decodeExtendedString(var2, -79);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 99, "mu_game_has_started");
                if (null != var2) {
                  UiWidget.field_q = SocialListEntry.decodeExtendedString(var2, -85);
                }
                var2 = PendingListRequest.readNamedRootFile(-124, "mu_you_declined_invite");
                if (var2 != null) {
                  BufferedSocket.field_h = SocialListEntry.decodeExtendedString(var2, param0 ^ -95);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -111, "mu_invite_withdrawn");
                if (null != var2) {
                  BufferedFile.field_c = SocialListEntry.decodeExtendedString(var2, param0 ^ -93);
                }
                var2 = PendingListRequest.readNamedRootFile(-77, "mu_request_declined");
                if (null != var2) {
                  LobbyPlayerEntry.field_ec = SocialListEntry.decodeExtendedString(var2, -101);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -98, "mu_request_withdrawn");
                if (null != var2) {
                  BevelFrameSpriteFactory.field_a = SocialListEntry.decodeExtendedString(var2, -44);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -73, "mu_all_players_have_left");
                if (var2 != null) {
                  TextLayoutLine.field_l = SocialListEntry.decodeExtendedString(var2, -72);
                }
                var2 = PendingListRequest.readNamedRootFile(-99, "mu_lobby_name");
                if (var2 != null) {
                  FullscreenCanvasHelpers.field_o = SocialListEntry.decodeExtendedString(var2, -38);
                }
                var2 = PendingListRequest.readNamedRootFile(-105, "mu_lobby_rating");
                if (var2 != null) {
                  NameSeparatorHelpers.field_c = SocialListEntry.decodeExtendedString(var2, -49);
                }
                var2 = PendingListRequest.readNamedRootFile(-80, "mu_lobby_friend_add");
                if (var2 != null) {
                  RasterBuffer.field_d = SocialListEntry.decodeExtendedString(var2, -94);
                }
                var2 = PendingListRequest.readNamedRootFile(-77, "mu_lobby_friend_rm");
                if (var2 != null) {
                  CheckboxWidget.field_S = SocialListEntry.decodeExtendedString(var2, -100);
                }
                var2 = PendingListRequest.readNamedRootFile(-124, "mu_lobby_name_add");
                if (var2 != null) {
                  CheckboxWidget.field_Q = SocialListEntry.decodeExtendedString(var2, -75);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 109, "mu_lobby_name_rm");
                if (null != var2) {
                  MarkerSlider.field_P = SocialListEntry.decodeExtendedString(var2, param0 - 66);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -112, "mu_lobby_location");
                if (var2 != null) {
                  FullscreenFocusCanvas.field_g = SocialListEntry.decodeExtendedString(var2, -105);
                }
                var2 = PendingListRequest.readNamedRootFile(-106, "mu_gamelist_all_games");
                if (null != var2) {
                  MenuReturnHelpers.field_f = SocialListEntry.decodeExtendedString(var2, param0 - 43);
                }
                var2 = PendingListRequest.readNamedRootFile(-96, "mu_gamelist_status");
                if (null != var2) {
                  LoginCredentialType.field_c = SocialListEntry.decodeExtendedString(var2, -121);
                }
                var2 = PendingListRequest.readNamedRootFile(-101, "mu_gamelist_owner");
                if (var2 != null) {
                  Archive.field_c = SocialListEntry.decodeExtendedString(var2, -75);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -105, "mu_gamelist_players");
                if (null != var2) {
                  LobbyListHelpers.field_b = SocialListEntry.decodeExtendedString(var2, param0 ^ -115);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -80, "mu_gamelist_avg_rating");
                if (var2 != null) {
                  ArchiveRequest.field_E = SocialListEntry.decodeExtendedString(var2, -82);
                }
                var2 = PendingListRequest.readNamedRootFile(-81, "mu_gamelist_options");
                if (var2 != null) {
                  TwoColumnListPanel.field_Mb = SocialListEntry.decodeExtendedString(var2, -123);
                }
                var2 = PendingListRequest.readNamedRootFile(-101, "mu_gamelist_elapsed_time");
                if (null != var2) {
                  ChatPanelSlideHelpers.field_i = SocialListEntry.decodeExtendedString(var2, -90);
                }
                var2 = PendingListRequest.readNamedRootFile(-102, "mu_play_rated");
                if (var2 != null) {
                  LoadingStageHook.field_b = SocialListEntry.decodeExtendedString(var2, -53);
                }
                var2 = PendingListRequest.readNamedRootFile(-79, "mu_create_unrated");
                if (var2 != null) {
                  LoginDialog.field_pb = SocialListEntry.decodeExtendedString(var2, -53);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -89, "mu_options");
                if (var2 != null) {
                  PatchNoteUsage.field_n = SocialListEntry.decodeExtendedString(var2, -124);
                }
                var2 = PendingListRequest.readNamedRootFile(-106, "mu_options_whocanjoin");
                if (var2 != null) {
                  RasterBuffer.field_b = SocialListEntry.decodeExtendedString(var2, param0 ^ -53);
                }
                var2 = PendingListRequest.readNamedRootFile(-79, "mu_options_players");
                if (var2 != null) {
                  AccountCreationDialog.field_zb = SocialListEntry.decodeExtendedString(var2, -66);
                }
                var2 = PendingListRequest.readNamedRootFile(-90, "mu_options_dontmind");
                if (null != var2) {
                  ReflectionCheckHelpers.field_c = SocialListEntry.decodeExtendedString(var2, -49);
                }
                var2 = PendingListRequest.readNamedRootFile(-93, "mu_options_allow_spectate");
                if (null != var2) {
                  TriangleSpanHelpers.field_i = SocialListEntry.decodeExtendedString(var2, param0 - 68);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 124, "mu_options_ratedgametype");
                if (null != var2) {
                  field_a = SocialListEntry.decodeExtendedString(var2, -86);
                }
                var2 = PendingListRequest.readNamedRootFile(-98, "yes");
                if (null != var2) {
                  ReportAbuseDialog.field_Zb = SocialListEntry.decodeExtendedString(var2, -124);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -110, "no");
                if (var2 != null) {
                  LinkTextPainter.field_d = SocialListEntry.decodeExtendedString(var2, param0 - 115);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -96, "mu_invite_players");
                if (var2 != null) {
                  TransitionPhase.field_c = SocialListEntry.decodeExtendedString(var2, -42);
                }
                var2 = PendingListRequest.readNamedRootFile(-124, "close");
                if (var2 != null) {
                  TetraLink.field_O = SocialListEntry.decodeExtendedString(var2, -92);
                }
                var2 = PendingListRequest.readNamedRootFile(-89, "add_x_to_friends");
                if (var2 != null) {
                  BoardAnimator.field_i = SocialListEntry.decodeExtendedString(var2, -112);
                }
                var2 = PendingListRequest.readNamedRootFile(-75, "add_x_to_ignore");
                if (null != var2) {
                  LabelPairWidget.field_Nb = SocialListEntry.decodeExtendedString(var2, param0 - 64);
                }
                var2 = PendingListRequest.readNamedRootFile(-100, "rm_x_from_friends");
                if (var2 != null) {
                  WidgetTheme.field_j = SocialListEntry.decodeExtendedString(var2, -74);
                }
                var2 = PendingListRequest.readNamedRootFile(-108, "rm_x_from_ignore");
                if (null != var2) {
                  ProgressMessageDialog.field_nb = SocialListEntry.decodeExtendedString(var2, -114);
                }
                var2 = PendingListRequest.readNamedRootFile(-112, "send_pm_to_x");
                if (var2 != null) {
                  ValidationState.field_a = SocialListEntry.decodeExtendedString(var2, param0 ^ -110);
                }
                var2 = PendingListRequest.readNamedRootFile(-119, "send_qc_to_x");
                if (var2 != null) {
                  StatusRequestHelpers.field_b = SocialListEntry.decodeExtendedString(var2, param0 - 83);
                }
                var2 = PendingListRequest.readNamedRootFile(-89, "send_pm");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -45);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 98, "invite_accept_xs_game");
                if (var2 != null) {
                  Bzip2State.field_b = SocialListEntry.decodeExtendedString(var2, -112);
                }
                var2 = PendingListRequest.readNamedRootFile(-94, "invite_decline_xs_game");
                if (null != var2) {
                  SocketConnector.field_b = SocialListEntry.decodeExtendedString(var2, -72);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -84, "join_xs_game");
                if (var2 != null) {
                  HighscoreQuery.field_o = SocialListEntry.decodeExtendedString(var2, -81);
                }
                var2 = PendingListRequest.readNamedRootFile(-95, "join_request_xs_game");
                if (var2 != null) {
                  MenuReturnHelpers.field_g = SocialListEntry.decodeExtendedString(var2, -84);
                }
                var2 = PendingListRequest.readNamedRootFile(-99, "join_withdraw_request_xs_game");
                if (null != var2) {
                  NameSeparatorHelpers.field_e = SocialListEntry.decodeExtendedString(var2, -123);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -86, "mu_gameopt_kick_x_from_this_game");
                if (var2 != null) {
                  OpacityWidget.field_P = SocialListEntry.decodeExtendedString(var2, -96);
                }
                var2 = PendingListRequest.readNamedRootFile(-82, "mu_gameopt_withdraw_invite_to_x");
                if (var2 != null) {
                  ValidationStatusIcon.field_P = SocialListEntry.decodeExtendedString(var2, -113);
                }
                var2 = PendingListRequest.readNamedRootFile(-95, "mu_gameopt_accept_x_into_game");
                if (null != var2) {
                  MusicTrackHelpers.field_a = SocialListEntry.decodeExtendedString(var2, -120);
                }
                var2 = PendingListRequest.readNamedRootFile(-120, "mu_gameopt_reject_x_from_game");
                if (null != var2) {
                  ByteStorage.field_c = SocialListEntry.decodeExtendedString(var2, -90);
                }
                var2 = PendingListRequest.readNamedRootFile(-86, "mu_gameopt_invite_x_to_game");
                if (var2 != null) {
                  IconLabelItem.field_Lb = SocialListEntry.decodeExtendedString(var2, -81);
                }
                var2 = PendingListRequest.readNamedRootFile(-121, "report_x_for_abuse");
                if (var2 != null) {
                  IntKeyLookup.field_a = SocialListEntry.decodeExtendedString(var2, -51);
                }
                var2 = PendingListRequest.readNamedRootFile(-85, "unable_to_send_message_password_a");
                if (null != var2) {
                  IntroFinalFrameHelpers.field_c = SocialListEntry.decodeExtendedString(var2, -50);
                }
                var2 = PendingListRequest.readNamedRootFile(-103, "unable_to_send_message_password_b");
                if (null != var2) {
                  RandomAccessCacheFile.field_a = SocialListEntry.decodeExtendedString(var2, -80);
                }
                var2 = PendingListRequest.readNamedRootFile(-90, "mu_chat_lobby_show_all");
                if (var2 != null) {
                  QuickChatHelpDialog.field_Qb = SocialListEntry.decodeExtendedString(var2, -108);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 126, "mu_chat_lobby_friends_only");
                if (null != var2) {
                  ScreenDrawHelpers.field_b = SocialListEntry.decodeExtendedString(var2, -50);
                }
                var2 = PendingListRequest.readNamedRootFile(-123, "mu_chat_lobby_friends");
                if (var2 != null) {
                  GameClock.field_d = SocialListEntry.decodeExtendedString(var2, -118);
                }
                var2 = PendingListRequest.readNamedRootFile(-119, "mu_chat_lobby_hide");
                if (var2 != null) {
                  LoginCredentialType.field_b = SocialListEntry.decodeExtendedString(var2, -103);
                }
                var2 = PendingListRequest.readNamedRootFile(-84, "mu_chat_game_show_all");
                if (null != var2) {
                  TwoColumnListPanel.field_Ob = SocialListEntry.decodeExtendedString(var2, -83);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -121, "mu_chat_game_friends_only");
                if (var2 != null) {
                  LoadingScreenRenderHelpers.field_a = SocialListEntry.decodeExtendedString(var2, -75);
                }
                var2 = PendingListRequest.readNamedRootFile(-119, "mu_chat_game_friends");
                if (null != var2) {
                  ChatMessage.field_t = SocialListEntry.decodeExtendedString(var2, -52);
                }
                var2 = PendingListRequest.readNamedRootFile(-112, "mu_chat_game_hide");
                if (null != var2) {
                  SpriteState.field_H = SocialListEntry.decodeExtendedString(var2, -86);
                }
                var2 = PendingListRequest.readNamedRootFile(-98, "mu_chat_pm_show_all");
                if (null != var2) {
                  CacheEntry.field_A = SocialListEntry.decodeExtendedString(var2, -77);
                }
                var2 = PendingListRequest.readNamedRootFile(-111, "mu_chat_pm_friends_only");
                if (null != var2) {
                  TextureEntry.field_a = SocialListEntry.decodeExtendedString(var2, param0 - 110);
                }
                var2 = PendingListRequest.readNamedRootFile(-96, "mu_chat_pm_friends");
                if (null != var2) {
                  LoginMethod.field_a = SocialListEntry.decodeExtendedString(var2, param0 - 82);
                }
                var2 = PendingListRequest.readNamedRootFile(-90, "mu_chat_invisible_and_silent_mode");
                if (var2 != null) {
                  IntrusiveNode.field_a = SocialListEntry.decodeExtendedString(var2, param0 - 127);
                }
                var2 = PendingListRequest.readNamedRootFile(-120, "you_have_been_removed_from_xs_game");
                if (null != var2) {
                  ChatPanelSlideHelpers.field_f = SocialListEntry.decodeExtendedString(var2, param0 ^ -41);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -73, "your_rating_is_x");
                if (var2 != null) {
                  DelegatingCanvas.field_b = SocialListEntry.decodeExtendedString(var2, param0 ^ -113);
                }
                var2 = PendingListRequest.readNamedRootFile(-111, "you_are_on_x_server");
                if (null != var2) {
                  DefaultQuickChatContext.field_a = SocialListEntry.decodeExtendedString(var2, -117);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 97, "rated_game");
                if (var2 != null) {
                  EmailSyntaxValidator.field_u = SocialListEntry.decodeExtendedString(var2, param0 ^ -80);
                }
                var2 = PendingListRequest.readNamedRootFile(-80, "unrated_game");
                if (var2 != null) {
                  MenuInputState.field_h = SocialListEntry.decodeExtendedString(var2, -80);
                }
                var2 = PendingListRequest.readNamedRootFile(-122, "rated_game_tips");
                if (var2 != null) {
                  MarkerSlider.field_R = SocialListEntry.decodeExtendedString(var2, -51);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -92, "searching_for_opponent_singular");
                if (null != var2) {
                  Js5ArchiveManager.field_i = SocialListEntry.decodeExtendedString(var2, -49);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 112, "searching_for_opponents_plural");
                if (var2 != null) {
                  SpriteState.field_I = SocialListEntry.decodeExtendedString(var2, -69);
                }
                var2 = PendingListRequest.readNamedRootFile(-98, "find_opponent_singular");
                if (null != var2) {
                  LobbyGame.field_Ob = SocialListEntry.decodeExtendedString(var2, param0 - 56);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 75, "find_opponents_plural");
                if (var2 != null) {
                  MatchingTextValidator.field_q = SocialListEntry.decodeExtendedString(var2, -54);
                }
                var2 = PendingListRequest.readNamedRootFile(-88, "rated_game_tips_setup_singular");
                if (var2 != null) {
                  ConnectionTimingHelpers.field_c = SocialListEntry.decodeExtendedString(var2, -78);
                }
                var2 = PendingListRequest.readNamedRootFile(-75, "rated_game_tips_setup_plural");
                if (null != var2) {
                  ContentTransitionDialog.field_cb = SocialListEntry.decodeExtendedString(var2, param0 ^ -65);
                }
                var2 = PendingListRequest.readNamedRootFile(-102, "waiting_to_start_hint");
                if (null != var2) {
                  GameSession.field_o = SocialListEntry.decodeExtendedString(var2, param0 ^ -104);
                }
                var2 = PendingListRequest.readNamedRootFile(-95, "your_game");
                if (null != var2) {
                  TextureEntry.field_d = SocialListEntry.decodeExtendedString(var2, -108);
                }
                var2 = PendingListRequest.readNamedRootFile(-115, "game_full");
                if (var2 != null) {
                  MatchingTextValidator.field_s = SocialListEntry.decodeExtendedString(var2, -57);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 98, "join_requests_one");
                if (null != var2) {
                  SocketConnector.field_d = SocialListEntry.decodeExtendedString(var2, -113);
                }
                var2 = PendingListRequest.readNamedRootFile(-124, "join_requests_many");
                if (null != var2) {
                  GameRoomPanelHelpers.field_e = SocialListEntry.decodeExtendedString(var2, param0 ^ -63);
                }
                var2 = PendingListRequest.readNamedRootFile(-99, "xs_game");
                if (var2 != null) {
                  GameKeyHandler.field_e = SocialListEntry.decodeExtendedString(var2, -108);
                }
                var2 = PendingListRequest.readNamedRootFile(-94, "waiting_for_x_to_start_game");
                if (null != var2) {
                  ReportAbuseDialog.field_Xb = SocialListEntry.decodeExtendedString(var2, -94);
                }
                var2 = PendingListRequest.readNamedRootFile(-75, "game_options_changed");
                if (var2 != null) {
                  AccountCreationResultHelpers.field_a = SocialListEntry.decodeExtendedString(var2, -103);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -80, "players_x_of_y");
                if (var2 != null) {
                  StatusRequestHelpers.field_c = SocialListEntry.decodeExtendedString(var2, param0 - 107);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -103, "message_lobby");
                if (var2 != null) {
                  ChatLayoutHelpers.field_f = SocialListEntry.decodeExtendedString(var2, -62);
                }
                var2 = PendingListRequest.readNamedRootFile(-113, "quickchat_lobby");
                if (null != var2) {
                  BitPacketBuffer.field_x = SocialListEntry.decodeExtendedString(var2, -43);
                }
                var2 = PendingListRequest.readNamedRootFile(-106, "message_game");
                if (null != var2) {
                  ChatPanelSlideHelpers.field_d = SocialListEntry.decodeExtendedString(var2, -53);
                }
                var2 = PendingListRequest.readNamedRootFile(-95, "message_team");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -76);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -83, "quickchat_game");
                if (var2 != null) {
                  RasterTargetHelpers.field_d = SocialListEntry.decodeExtendedString(var2, param0 - 61);
                }
                var2 = PendingListRequest.readNamedRootFile(-85, "kick");
                if (var2 != null) {
                  LoadingScreenHelpers.field_e = SocialListEntry.decodeExtendedString(var2, -84);
                }
                var2 = PendingListRequest.readNamedRootFile(-126, "inviting_x");
                if (var2 != null) {
                  LobbyUpdateHelpers.field_a = SocialListEntry.decodeExtendedString(var2, -69);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -89, "x_wants_to_join");
                if (null != var2) {
                  DateOfBirthValidator.field_l = SocialListEntry.decodeExtendedString(var2, -67);
                }
                var2 = PendingListRequest.readNamedRootFile(-89, "accept");
                if (null != var2) {
                  ReflectionCheck.field_A = SocialListEntry.decodeExtendedString(var2, -82);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 75, "reject");
                if (null != var2) {
                  JoinStatusTextHelpers.field_d = SocialListEntry.decodeExtendedString(var2, -77);
                }
                var2 = PendingListRequest.readNamedRootFile(-76, "invite");
                if (var2 != null) {
                  GzipDecompressor.field_e = SocialListEntry.decodeExtendedString(var2, -126);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -105, "status_concluded");
                if (var2 != null) {
                  SocialListEntry.field_Pb = SocialListEntry.decodeExtendedString(var2, -121);
                }
                var2 = PendingListRequest.readNamedRootFile(-108, "status_spectate");
                if (null != var2) {
                  DualLinkNodeHashTable.field_m = SocialListEntry.decodeExtendedString(var2, -43);
                }
                var2 = PendingListRequest.readNamedRootFile(-93, "status_playing");
                if (null != var2) {
                  StripedProgressBar.field_V = SocialListEntry.decodeExtendedString(var2, -42);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 98, "status_join");
                if (null != var2) {
                  LobbyGame.field_Sb = SocialListEntry.decodeExtendedString(var2, -67);
                }
                var2 = PendingListRequest.readNamedRootFile(-104, "status_private");
                if (var2 != null) {
                  IconLabelItem.field_Kb = SocialListEntry.decodeExtendedString(var2, -72);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -76, "status_full");
                if (null != var2) {
                  QuickChatMenu.field_Vb = SocialListEntry.decodeExtendedString(var2, -107);
                }
                var2 = PendingListRequest.readNamedRootFile(-94, "players_in_game");
                if (null != var2) {
                  DialWidgetPainter.field_e = SocialListEntry.decodeExtendedString(var2, -86);
                }
                var2 = PendingListRequest.readNamedRootFile(-120, "you_are_invited_to_xs_game");
                if (null != var2) {
                  MenuThemeHelpers.field_b = SocialListEntry.decodeExtendedString(var2, param0 - 129);
                }
                var2 = PendingListRequest.readNamedRootFile(-86, "asking_to_join_xs_game");
                if (var2 != null) {
                  DebouncedValidator.field_g = SocialListEntry.decodeExtendedString(var2, -124);
                }
                var2 = PendingListRequest.readNamedRootFile(-83, "who_can_join");
                if (null != var2) {
                  KeyEventHelpers.field_c = SocialListEntry.decodeExtendedString(var2, -75);
                }
                var2 = PendingListRequest.readNamedRootFile(-122, "you_can_join");
                if (var2 != null) {
                  TopLevelContainerHelpers.field_c = SocialListEntry.decodeExtendedString(var2, param0 - 47);
                }
                var2 = PendingListRequest.readNamedRootFile(-127, "you_can_ask_to_join");
                if (var2 != null) {
                  JoinGameTextGlobals.field_d = SocialListEntry.decodeExtendedString(var2, param0 ^ -62);
                }
                var2 = PendingListRequest.readNamedRootFile(-112, "you_cannot_join_in_progress");
                if (var2 != null) {
                  EmailSyntaxValidator.field_x = SocialListEntry.decodeExtendedString(var2, -68);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 120, "you_can_spectate");
                if (var2 != null) {
                  DefaultQuickChatContext.field_d = SocialListEntry.decodeExtendedString(var2, -75);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 87, "you_can_not_spectate");
                if (null != var2) {
                  IconLabelItem.field_Pb = SocialListEntry.decodeExtendedString(var2, -97);
                }
                var2 = PendingListRequest.readNamedRootFile(-113, "spectate_xs_game");
                if (var2 != null) {
                  SpriteState.field_y = SocialListEntry.decodeExtendedString(var2, -77);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 86, "hide_players_in_xs_game");
                if (var2 != null) {
                  TriangleSpanHelpers.field_h = SocialListEntry.decodeExtendedString(var2, -58);
                }
                var2 = PendingListRequest.readNamedRootFile(-84, "show_players_in_xs_game");
                if (var2 != null) {
                  LoadingStatusHelpers.field_b = SocialListEntry.decodeExtendedString(var2, -123);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -105, "connecting_to_friend_server_twoline");
                if (var2 != null) {
                  AnimationSkeleton.field_t = SocialListEntry.decodeExtendedString(var2, -75);
                }
                var2 = PendingListRequest.readNamedRootFile(-107, "loading");
                if (null != var2) {
                  FullscreenFocusCanvas.field_f = SocialListEntry.decodeExtendedString(var2, -47);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 95, "offline");
                if (null != var2) {
                  QuickChatPhraseDefinition.field_t = SocialListEntry.decodeExtendedString(var2, -114);
                }
                var2 = PendingListRequest.readNamedRootFile(-121, "multiconst_invite_only");
                if (null != var2) {
                  GraphicsSettings.field_k = SocialListEntry.decodeExtendedString(var2, -82);
                }
                var2 = PendingListRequest.readNamedRootFile(-123, "multiconst_clan");
                if (var2 != null) {
                  QuickChatMenuFactory.field_f = SocialListEntry.decodeExtendedString(var2, -98);
                }
                var2 = PendingListRequest.readNamedRootFile(-128, "multiconst_friends");
                if (var2 != null) {
                  LobbyGame.field_dc = SocialListEntry.decodeExtendedString(var2, -108);
                }
                var2 = PendingListRequest.readNamedRootFile(-128, "multiconst_similar_rating");
                if (var2 != null) {
                  HuffmanCodec.field_d = SocialListEntry.decodeExtendedString(var2, -127);
                }
                var2 = PendingListRequest.readNamedRootFile(-122, "multiconst_open");
                if (var2 != null) {
                  HighscoreQuery.field_A = SocialListEntry.decodeExtendedString(var2, param0 ^ -64);
                }
                var2 = PendingListRequest.readNamedRootFile(-75, "no_options_available");
                if (var2 != null) {
                  ContextMenu.field_Kb = SocialListEntry.decodeExtendedString(var2, param0 - 73);
                }
                var2 = PendingListRequest.readNamedRootFile(-95, "reportabuse");
                if (null != var2) {
                  RasterTargetHelpers.field_f = SocialListEntry.decodeExtendedString(var2, param0 ^ -75);
                }
                var2 = PendingListRequest.readNamedRootFile(-100, "presstabtochat");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -71);
                }
                var2 = PendingListRequest.readNamedRootFile(-86, "pressf10toquickchat");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -54);
                }
                var2 = PendingListRequest.readNamedRootFile(-95, "dob_chatdisabled");
                if (var2 != null) {
                  WidgetStyleLayer.field_l = SocialListEntry.decodeExtendedString(var2, -114);
                }
                var2 = PendingListRequest.readNamedRootFile(-117, "dob_enterforchat");
                if (null != var2) {
                  UiWidget.field_G = SocialListEntry.decodeExtendedString(var2, -117);
                }
                var2 = PendingListRequest.readNamedRootFile(-122, "tab_hidechattemporarily");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -76);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -118, "esc_cancelprivatemessage");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -90);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -107, "esc_cancelthisline");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -65);
                }
                var2 = PendingListRequest.readNamedRootFile(-85, "privatequickchat_from_x");
                if (var2 != null) {
                  IntrusiveNode.field_h = SocialListEntry.decodeExtendedString(var2, -72);
                }
                var2 = PendingListRequest.readNamedRootFile(-80, "privatequickchat_to_x");
                if (var2 != null) {
                  GrowableIntList.field_b = SocialListEntry.decodeExtendedString(var2, param0 - 76);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 104, "privatechat_blankarea_explanation");
                if (null != var2) {
                  ArrayWidgetContainer.field_L = SocialListEntry.decodeExtendedString(var2, param0 ^ -123);
                }
                var2 = PendingListRequest.readNamedRootFile(-84, "publicchat_unavailable_ratedgame");
                if (var2 != null) {
                  SettingsCookieHelpers.field_b = SocialListEntry.decodeExtendedString(var2, -101);
                }
                var2 = PendingListRequest.readNamedRootFile(-108, "privatechat_friend_offline");
                if (null != var2) {
                  ArchiveGroupHelpers.field_c = SocialListEntry.decodeExtendedString(var2, param0 - 90);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 103, "privatechat_friend_notlisted");
                if (var2 != null) {
                  LoginPanel.field_Z = SocialListEntry.decodeExtendedString(var2, param0 - 62);
                }
                var2 = PendingListRequest.readNamedRootFile(-122, "chatviewscrolledup");
                if (null != var2) {
                  TabbedPanel.field_Nb = SocialListEntry.decodeExtendedString(var2, -86);
                }
                var2 = PendingListRequest.readNamedRootFile(-78, "thisisrunescapeclan");
                if (null != var2) {
                  TextLayoutLine.field_f = SocialListEntry.decodeExtendedString(var2, -49);
                }
                var2 = PendingListRequest.readNamedRootFile(-87, "thisisrunescapeclan_notowner");
                if (null != var2) {
                  MenuInputState.field_e = SocialListEntry.decodeExtendedString(var2, -73);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -97, "runescapeclan");
                if (null != var2) {
                  MusicPatch.field_y = SocialListEntry.decodeExtendedString(var2, -61);
                }
                var2 = PendingListRequest.readNamedRootFile(-83, "rated_membersonly");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -66);
                }
                var2 = PendingListRequest.readNamedRootFile(-121, "gameopt_membersonly");
                if (var2 != null) {
                  PendingSubmission.field_q = SocialListEntry.decodeExtendedString(var2, param0 ^ -50);
                }
                var2 = PendingListRequest.readNamedRootFile(-120, "gameopt_1moreratedgame");
                if (null != var2) {
                  PacketDiagnosticsHelpers.field_r = SocialListEntry.decodeExtendedString(var2, -41);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 112, "gameopt_moreratedgames");
                if (var2 != null) {
                  ByteStorage.field_b = SocialListEntry.decodeExtendedString(var2, param0 ^ -73);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 122, "gameopt_needrating");
                if (var2 != null) {
                  RsaKeyAndTextGlobals.field_b = SocialListEntry.decodeExtendedString(var2, -96);
                }
                var2 = PendingListRequest.readNamedRootFile(-124, "gameopt_unratedonly");
                if (null != var2) {
                  MessageDialogContent.field_M = SocialListEntry.decodeExtendedString(var2, -96);
                }
                var2 = PendingListRequest.readNamedRootFile(-85, "gameopt_notunlocked");
                if (null != var2) {
                  GameKeyHandler.field_f = SocialListEntry.decodeExtendedString(var2, -43);
                }
                var2 = PendingListRequest.readNamedRootFile(-116, "gameopt_cannotbecombined1");
                if (null != var2) {
                  ClientException.field_c = SocialListEntry.decodeExtendedString(var2, -110);
                }
                var2 = PendingListRequest.readNamedRootFile(-85, "gameopt_cannotbecombined2");
                if (var2 != null) {
                  IntroFinalFrameHelpers.field_e = SocialListEntry.decodeExtendedString(var2, -93);
                }
                var2 = PendingListRequest.readNamedRootFile(-95, "gameopt_playernotmember");
                if (var2 != null) {
                  EmailSyntaxValidator.field_w = SocialListEntry.decodeExtendedString(var2, -108);
                }
                var2 = PendingListRequest.readNamedRootFile(-111, "gameopt_younotmember");
                if (null != var2) {
                  PasswordLengthHelpers.field_b = SocialListEntry.decodeExtendedString(var2, param0 - 116);
                }
                var2 = PendingListRequest.readNamedRootFile(-94, "gameopt_playerneedsrating");
                if (var2 != null) {
                  LoginPanel.field_Y = SocialListEntry.decodeExtendedString(var2, -87);
                }
                var2 = PendingListRequest.readNamedRootFile(-128, "gameopt_youneedrating");
                if (var2 != null) {
                  TextButton.field_M = SocialListEntry.decodeExtendedString(var2, param0 - 109);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -128, "gameopt_playerneedsratedgames");
                if (var2 != null) {
                  PasswordFieldPainter.field_C = SocialListEntry.decodeExtendedString(var2, -101);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -106, "gameopt_youneedratedgames");
                if (null != var2) {
                  NameSeparatorHelpers.field_d = SocialListEntry.decodeExtendedString(var2, -76);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -113, "gameopt_playerneeds1ratedgame");
                if (null != var2) {
                  ClockAndTextHelpers.field_b = SocialListEntry.decodeExtendedString(var2, -103);
                }
                var2 = PendingListRequest.readNamedRootFile(-88, "gameopt_youneed1ratedgame");
                if (var2 != null) {
                  ErrorPrintHelpers.field_d = SocialListEntry.decodeExtendedString(var2, -125);
                }
                var2 = PendingListRequest.readNamedRootFile(-119, "gameopt_playerhasntunlocked");
                if (null != var2) {
                  HighscoreSubmission.field_o = SocialListEntry.decodeExtendedString(var2, param0 - 62);
                }
                var2 = PendingListRequest.readNamedRootFile(-80, "gameopt_youhaventunlocked");
                if (var2 != null) {
                  DualLinkDeque.field_b = SocialListEntry.decodeExtendedString(var2, -119);
                }
                var2 = PendingListRequest.readNamedRootFile(-91, "gameopt_trychanging1");
                if (null != var2) {
                  LoginPanel.field_O = SocialListEntry.decodeExtendedString(var2, -44);
                }
                var2 = PendingListRequest.readNamedRootFile(-98, "gameopt_trychanging2");
                if (null != var2) {
                  ArchiveIndex.field_p = SocialListEntry.decodeExtendedString(var2, -99);
                }
                var2 = PendingListRequest.readNamedRootFile(-86, "gameopt_needchanging1");
                if (var2 != null) {
                  ScreenDrawHelpers.field_c = SocialListEntry.decodeExtendedString(var2, -119);
                }
                var2 = PendingListRequest.readNamedRootFile(-117, "gameopt_needchanging2");
                if (var2 != null) {
                  NineSliceFrame.field_f = SocialListEntry.decodeExtendedString(var2, -85);
                }
                var2 = PendingListRequest.readNamedRootFile(-97, "gameopt_mightchange");
                if (null != var2) {
                  GrowableIntList.field_i = SocialListEntry.decodeExtendedString(var2, -51);
                }
                var2 = PendingListRequest.readNamedRootFile(-87, "gameopt_playersdontqualify");
                if (null != var2) {
                  JoinStatusTextHelpers.field_b = SocialListEntry.decodeExtendedString(var2, -126);
                }
                var2 = PendingListRequest.readNamedRootFile(-86, "gameopt_playersdontqualify_selectgametab");
                if (var2 != null) {
                  ClientException.field_b = SocialListEntry.decodeExtendedString(var2, -101);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -105, "gameopt_unselectedoptions");
                if (var2 != null) {
                  ChatLayoutHelpers.field_b = SocialListEntry.decodeExtendedString(var2, -93);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 127, "gameopt_pleaseselectoption1");
                if (var2 != null) {
                  ConditionalTextValue.field_f = SocialListEntry.decodeExtendedString(var2, -48);
                }
                var2 = PendingListRequest.readNamedRootFile(-91, "gameopt_pleaseselectoption2");
                if (null != var2) {
                  LoginCredentials.field_d = SocialListEntry.decodeExtendedString(var2, -122);
                }
                var2 = PendingListRequest.readNamedRootFile(-98, "gameopt_badnumplayers");
                if (null != var2) {
                  DualLinkNode.field_q = SocialListEntry.decodeExtendedString(var2, -49);
                }
                var2 = PendingListRequest.readNamedRootFile(-99, "gameopt_inviteplayers_or_trychanging1");
                if (var2 != null) {
                  IntrusiveNode.field_d = SocialListEntry.decodeExtendedString(var2, -45);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -109, "gameopt_inviteplayers_or_trychanging2");
                if (null != var2) {
                  HighscoreSubmission.field_p = SocialListEntry.decodeExtendedString(var2, -95);
                }
                var2 = PendingListRequest.readNamedRootFile(-127, "gameopt_novalidcombos");
                if (var2 != null) {
                  NameEntryPopup.field_Nb = SocialListEntry.decodeExtendedString(var2, -117);
                }
                var2 = PendingListRequest.readNamedRootFile(-81, "gameopt_pleasetrychanging");
                if (null != var2) {
                  CanvasAndErrorHelpers.field_a = SocialListEntry.decodeExtendedString(var2, -64);
                }
                var2 = PendingListRequest.readNamedRootFile(-82, "ra_title");
                if (var2 != null) {
                  CanvasAndErrorHelpers.field_h = SocialListEntry.decodeExtendedString(var2, -40);
                }
                var2 = PendingListRequest.readNamedRootFile(-91, "ra_mutethisplayer");
                if (var2 != null) {
                  TextureCache.field_e = SocialListEntry.decodeExtendedString(var2, -97);
                }
                var2 = PendingListRequest.readNamedRootFile(-74, "ra_suggestmute");
                if (var2 != null) {
                  StripedProgressBar.field_I = SocialListEntry.decodeExtendedString(var2, param0 ^ -45);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 115, "ra_intro");
                if (null != var2) {
                  field_b = SocialListEntry.decodeExtendedString(var2, -66);
                }
                var2 = PendingListRequest.readNamedRootFile(-80, "ra_intro_no_name");
                if (null != var2) {
                  StringPadHelpers.field_d = SocialListEntry.decodeExtendedString(var2, -126);
                }
                var2 = PendingListRequest.readNamedRootFile(-102, "ra_explanation");
                if (null != var2) {
                  BackgroundSparkle.field_p = SocialListEntry.decodeExtendedString(var2, -39);
                }
                var2 = PendingListRequest.readNamedRootFile(-126, "rule_pillar_0");
                if (null != var2) {
                  GameOptionTextTables.field_b = SocialListEntry.decodeExtendedString(var2, -77);
                }
                var2 = PendingListRequest.readNamedRootFile(-92, "rule_0_0");
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (null != var2) {
                  ReflectionCheckHelpers.field_e = SocialListEntry.decodeExtendedString(var2, -108);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 85, "rule_0_1");
                if (null != var2) {
                  MouseInputHandler.field_f = SocialListEntry.decodeExtendedString(var2, -82);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -82, "rule_0_2");
                if (null != var2) {
                  NodeHashTable.field_d = SocialListEntry.decodeExtendedString(var2, -72);
                }
                var2 = PendingListRequest.readNamedRootFile(-127, "rule_0_3");
                if (null != var2) {
                  FlaggedTextValue.field_a = SocialListEntry.decodeExtendedString(var2, -47);
                }
                var2 = PendingListRequest.readNamedRootFile(-117, "rule_0_4");
                if (null != var2) {
                  RasterBuffer.field_a = SocialListEntry.decodeExtendedString(var2, -114);
                }
                var2 = PendingListRequest.readNamedRootFile(-118, "rule_0_5");
                if (null != var2) {
                  LoadingScreenRenderHelpers.field_b = SocialListEntry.decodeExtendedString(var2, param0 - 91);
                }
                var2 = PendingListRequest.readNamedRootFile(-100, "rule_pillar_1");
                if (var2 != null) {
                  DirectByteStorage.field_j = SocialListEntry.decodeExtendedString(var2, param0 - 49);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -103, "rule_1_0");
                if (null != var2) {
                  ScrollPane.field_Lb = SocialListEntry.decodeExtendedString(var2, -92);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -77, "rule_1_1");
                if (null != var2) {
                  AudioPumpThread.field_e = SocialListEntry.decodeExtendedString(var2, -107);
                }
                var2 = PendingListRequest.readNamedRootFile(-116, "rule_1_2");
                if (var2 != null) {
                  QuickChatMenuFactory.field_c = SocialListEntry.decodeExtendedString(var2, -44);
                }
                var2 = PendingListRequest.readNamedRootFile(-94, "rule_1_3");
                if (var2 != null) {
                  WidgetNode.field_v = SocialListEntry.decodeExtendedString(var2, -49);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 121, "rule_1_4");
                if (var2 != null) {
                  TransitionPhase.field_e = SocialListEntry.decodeExtendedString(var2, -47);
                }
                var2 = PendingListRequest.readNamedRootFile(-94, "rule_pillar_2");
                if (null != var2) {
                  RasterStackHelpers.field_f = SocialListEntry.decodeExtendedString(var2, -95);
                }
                var2 = PendingListRequest.readNamedRootFile(-77, "rule_2_0");
                if (null != var2) {
                  ReflectionCheck.field_p = SocialListEntry.decodeExtendedString(var2, -68);
                }
                var2 = PendingListRequest.readNamedRootFile(-116, "rule_2_1");
                if (null != var2) {
                  GameBoard.field_a = SocialListEntry.decodeExtendedString(var2, -64);
                }
                var2 = PendingListRequest.readNamedRootFile(-123, "rule_2_2");
                if (null != var2) {
                  PopupAndStripHelpers.field_b = SocialListEntry.decodeExtendedString(var2, param0 ^ -102);
                }
                var2 = PendingListRequest.readNamedRootFile(-117, "createafreeaccount");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -127);
                }
                var2 = PendingListRequest.readNamedRootFile(-93, "cancel");
                if (null != var2) {
                  FlaggedTextValue.field_c = SocialListEntry.decodeExtendedString(var2, -116);
                }
                var2 = PendingListRequest.readNamedRootFile(-112, "pleaselogintoplay");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -58);
                }
                var2 = PendingListRequest.readNamedRootFile(-78, "pleaselogin");
                if (var2 != null) {
                  NameEntryPopup.field_Mb = SocialListEntry.decodeExtendedString(var2, -89);
                }
                var2 = PendingListRequest.readNamedRootFile(-112, "pleaselogin_member");
                if (null != var2) {
                  LoadingScreenHelpers.field_d = SocialListEntry.decodeExtendedString(var2, -67);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -77, "invaliduserorpass");
                if (null != var2) {
                  NotificationToast.field_r = SocialListEntry.decodeExtendedString(var2, -93);
                }
                var2 = PendingListRequest.readNamedRootFile(-83, "pleasetryagain");
                if (var2 != null) {
                  PlayingSound.field_s = SocialListEntry.decodeExtendedString(var2, -123);
                }
                var2 = PendingListRequest.readNamedRootFile(-90, "pleasereenterpass");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -107);
                }
                var2 = PendingListRequest.readNamedRootFile(-91, "playfreeversion");
                if (var2 != null) {
                  QuickChatPhraseCache.field_d = SocialListEntry.decodeExtendedString(var2, -58);
                }
                var2 = PendingListRequest.readNamedRootFile(-126, "reloadgame");
                if (var2 != null) {
                  ContentTransitionDialog.field_hb = SocialListEntry.decodeExtendedString(var2, -90);
                }
                var2 = PendingListRequest.readNamedRootFile(-127, "toserverlist");
                if (null != var2) {
                  UiComponent.field_C = SocialListEntry.decodeExtendedString(var2, -59);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 100, "tocustomersupport");
                if (var2 != null) {
                  GameBoard.field_c = SocialListEntry.decodeExtendedString(var2, -72);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -76, "changedisplayname");
                if (null != var2) {
                  AccountTextGlobals.field_d = SocialListEntry.decodeExtendedString(var2, param0 ^ -102);
                }
                var2 = PendingListRequest.readNamedRootFile(-110, "returntohomepage");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -100);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -112, "justplay");
                if (var2 != null) {
                  PasswordLengthHelpers.field_d = SocialListEntry.decodeExtendedString(var2, param0 ^ -112);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 96, "justplay_excl");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -85);
                }
                var2 = PendingListRequest.readNamedRootFile(-89, "login");
                if (null != var2) {
                  GameOptionTextTables.field_a = SocialListEntry.decodeExtendedString(var2, -60);
                }
                var2 = PendingListRequest.readNamedRootFile(-75, "goback");
                if (null != var2) {
                  GameApplet.field_n = SocialListEntry.decodeExtendedString(var2, -65);
                }
                var2 = PendingListRequest.readNamedRootFile(-105, "otheroptions");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -103);
                }
                var2 = PendingListRequest.readNamedRootFile(-76, "proceed");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -124);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -87, "connectingtoserver");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -47);
                }
                var2 = PendingListRequest.readNamedRootFile(-126, "pleasewait");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -83);
                }
                var2 = PendingListRequest.readNamedRootFile(-96, "logging_in");
                if (var2 != null) {
                  WeightedLruCache.field_d = SocialListEntry.decodeExtendedString(var2, -86);
                }
                var2 = PendingListRequest.readNamedRootFile(-78, "reconnect");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 94);
                }
                var2 = PendingListRequest.readNamedRootFile(-100, "backtoerror");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -88);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 82, "pleasecheckinternet");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -88);
                }
                var2 = PendingListRequest.readNamedRootFile(-83, "attemptingtoreconnect");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -91);
                }
                var2 = PendingListRequest.readNamedRootFile(-127, "connectionlost_reconnecting");
                if (null != var2) {
                  TriangleMesh.field_n = SocialListEntry.decodeExtendedString(var2, -117);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -126, "connectionlost_withreason");
                if (null != var2) {
                  DateOfBirthPanel.field_U = SocialListEntry.decodeExtendedString(var2, -116);
                }
                var2 = PendingListRequest.readNamedRootFile(-84, "passwordverificationrequired");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -54);
                }
                var2 = PendingListRequest.readNamedRootFile(-110, "invalidpass");
                if (null != var2) {
                  HotspotTextWidget.field_R = SocialListEntry.decodeExtendedString(var2, -56);
                }
                var2 = PendingListRequest.readNamedRootFile(-127, "retry");
                if (var2 != null) {
                  CacheEntry.field_v = SocialListEntry.decodeExtendedString(var2, -81);
                }
                var2 = PendingListRequest.readNamedRootFile(-120, "back");
                if (null != var2) {
                  ResizableDialog.field_T = SocialListEntry.decodeExtendedString(var2, param0 ^ -60);
                }
                var2 = PendingListRequest.readNamedRootFile(-95, "exitfullscreenmode");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -86);
                }
                var2 = PendingListRequest.readNamedRootFile(-105, "quittowebsite");
                if (var2 != null) {
                  GameClock.field_a = SocialListEntry.decodeExtendedString(var2, -70);
                }
                var2 = PendingListRequest.readNamedRootFile(-89, "connectionrestored");
                if (var2 != null) {
                  HighscoreQuery.field_t = SocialListEntry.decodeExtendedString(var2, -116);
                }
                var2 = PendingListRequest.readNamedRootFile(-92, "warning_ifyouquit");
                if (null != var2) {
                  HotspotTextWidget.field_Y = SocialListEntry.decodeExtendedString(var2, param0 - 92);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 104, "warning_ifyouquitorleavepage");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -55);
                }
                var2 = PendingListRequest.readNamedRootFile(-81, "resubscribe_withoutlosing_fs");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 65);
                }
                var2 = PendingListRequest.readNamedRootFile(-122, "resubscribe_withoutlosing");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -115);
                }
                var2 = PendingListRequest.readNamedRootFile(-90, "customersupport_withoutlosing_fs");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 61);
                }
                var2 = PendingListRequest.readNamedRootFile(-76, "customersupport_withoutlosing");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -86);
                }
                var2 = PendingListRequest.readNamedRootFile(-74, "js5help_withoutlosing_fs");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -77);
                }
                var2 = PendingListRequest.readNamedRootFile(-86, "js5help_withoutlosing");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -92);
                }
                var2 = PendingListRequest.readNamedRootFile(-110, "checkinternet_withoutlosing_fs");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -123);
                }
                var2 = PendingListRequest.readNamedRootFile(-128, "checkinternet_withoutlosing");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -40);
                }
                var2 = PendingListRequest.readNamedRootFile(-112, "create_intro");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -75);
                }
                var2 = PendingListRequest.readNamedRootFile(-82, "create_sameaccounttip_unnamed");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -89);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 98, "dateofbirthprompt");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -98);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -114, "fetchingcountrylist");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -50);
                }
                var2 = PendingListRequest.readNamedRootFile(-87, "countryprompt");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -77);
                }
                var2 = PendingListRequest.readNamedRootFile(-81, "countrylisterror");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -42);
                }
                var2 = PendingListRequest.readNamedRootFile(-108, "theonlypersonalquestions");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -56);
                }
                var2 = PendingListRequest.readNamedRootFile(-128, "create_submittingdata");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -122);
                }
                var2 = PendingListRequest.readNamedRootFile(-99, "check");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -68);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 93, "create_pleasechooseausername");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -100);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 93, "create_usernameblurb");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -92);
                }
                var2 = PendingListRequest.readNamedRootFile(-100, "checkingavailability");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 66);
                }
                var2 = PendingListRequest.readNamedRootFile(-96, "checking");
                if (null != var2) {
                  LoginCredentialType.field_a = SocialListEntry.decodeExtendedString(var2, -122);
                }
                var2 = PendingListRequest.readNamedRootFile(-75, "create_namealreadytaken");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -92);
                }
                var2 = PendingListRequest.readNamedRootFile(-95, "create_sameaccounttip_named");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -52);
                }
                var2 = PendingListRequest.readNamedRootFile(-119, "create_nosuggestions");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 99);
                }
                var2 = PendingListRequest.readNamedRootFile(-100, "create_alternativelygoback");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -120);
                }
                var2 = PendingListRequest.readNamedRootFile(-84, "create_available");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -56);
                }
                var2 = PendingListRequest.readNamedRootFile(-111, "create_willnowshowtermsandconditions");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -78);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 113, "fetchingterms");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -124);
                }
                var2 = PendingListRequest.readNamedRootFile(-104, "termserror");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -50);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 109, "create_iagree");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -38);
                }
                var2 = PendingListRequest.readNamedRootFile(-127, "create_idisagree");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -110);
                }
                var2 = PendingListRequest.readNamedRootFile(-120, "create_pleasescrolldowntoaccept");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 108);
                }
                var2 = PendingListRequest.readNamedRootFile(-89, "create_linkaddress");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -83);
                }
                var2 = PendingListRequest.readNamedRootFile(-74, "openinpopupwindow");
                if (var2 != null) {
                  PlayingSound.field_o = SocialListEntry.decodeExtendedString(var2, -76);
                }
                var2 = PendingListRequest.readNamedRootFile(-89, "create");
                if (var2 != null) {
                  PlayerContextMenu.field_k = SocialListEntry.decodeExtendedString(var2, -40);
                }
                var2 = PendingListRequest.readNamedRootFile(-99, "create_pleasechooseapassword");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -54);
                }
                var2 = PendingListRequest.readNamedRootFile(-117, "create_passwordblurb");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -67);
                }
                var2 = PendingListRequest.readNamedRootFile(-84, "create_nevergivepassword");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -88);
                }
                var2 = PendingListRequest.readNamedRootFile(-90, "creatingyouraccount");
                if (null != var2) {
                  SharedPanelFactory.field_a = SocialListEntry.decodeExtendedString(var2, -116);
                }
                var2 = PendingListRequest.readNamedRootFile(-97, "create_youmustaccept");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -114);
                }
                var2 = PendingListRequest.readNamedRootFile(-84, "create_passwordsdifferent");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -121);
                }
                var2 = PendingListRequest.readNamedRootFile(-118, "create_success");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -96);
                }
                var2 = PendingListRequest.readNamedRootFile(-95, "day");
                if (null != var2) {
                  TextureCache.field_k = SocialListEntry.decodeExtendedString(var2, -82);
                }
                var2 = PendingListRequest.readNamedRootFile(-83, "month");
                if (null != var2) {
                  StripedProgressBar.field_Z = SocialListEntry.decodeExtendedString(var2, -72);
                }
                var2 = PendingListRequest.readNamedRootFile(-117, "year");
                if (var2 != null) {
                  RasterStackHelpers.field_h = SocialListEntry.decodeExtendedString(var2, param0 - 38);
                }
                var2 = PendingListRequest.readNamedRootFile(-109, "monthnames,0");
                if (var2 != null) {
                  QuickChatCategoryCache.field_c[0] = SocialListEntry.decodeExtendedString(var2, -41);
                }
                var2 = PendingListRequest.readNamedRootFile(-118, "monthnames,1");
                if (var2 != null) {
                  QuickChatCategoryCache.field_c[1] = SocialListEntry.decodeExtendedString(var2, -43);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -77, "monthnames,2");
                if (null != var2) {
                  QuickChatCategoryCache.field_c[2] = SocialListEntry.decodeExtendedString(var2, param0 - 79);
                }
                var2 = PendingListRequest.readNamedRootFile(-78, "monthnames,3");
                if (var2 != null) {
                  QuickChatCategoryCache.field_c[3] = SocialListEntry.decodeExtendedString(var2, IsaacCipher.bitXor(param0, -73));
                }
                var2 = PendingListRequest.readNamedRootFile(-74, "monthnames,4");
                if (null != var2) {
                  QuickChatCategoryCache.field_c[4] = SocialListEntry.decodeExtendedString(var2, IsaacCipher.bitXor(param0, -119));
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -86, "monthnames,5");
                if (var2 != null) {
                  QuickChatCategoryCache.field_c[5] = SocialListEntry.decodeExtendedString(var2, -74);
                }
                var2 = PendingListRequest.readNamedRootFile(-91, "monthnames,6");
                if (null != var2) {
                  QuickChatCategoryCache.field_c[6] = SocialListEntry.decodeExtendedString(var2, -41);
                }
                var2 = PendingListRequest.readNamedRootFile(-108, "monthnames,7");
                if (var2 != null) {
                  QuickChatCategoryCache.field_c[7] = SocialListEntry.decodeExtendedString(var2, -114);
                }
                var2 = PendingListRequest.readNamedRootFile(-83, "monthnames,8");
                if (var2 != null) {
                  QuickChatCategoryCache.field_c[8] = SocialListEntry.decodeExtendedString(var2, -83);
                }
                var2 = PendingListRequest.readNamedRootFile(-96, "monthnames,9");
                if (var2 != null) {
                  QuickChatCategoryCache.field_c[9] = SocialListEntry.decodeExtendedString(var2, IsaacCipher.bitXor(param0, -47));
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 119, "monthnames,10");
                if (var2 != null) {
                  QuickChatCategoryCache.field_c[10] = SocialListEntry.decodeExtendedString(var2, -111);
                }
                var2 = PendingListRequest.readNamedRootFile(-112, "monthnames,11");
                if (var2 != null) {
                  QuickChatCategoryCache.field_c[11] = SocialListEntry.decodeExtendedString(var2, IsaacCipher.bitXor(param0, -91));
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -107, "create_welcome");
                if (var2 != null) {
                  CachedTextLayout.field_m = SocialListEntry.decodeExtendedString(var2, param0 - 46);
                }
                var2 = PendingListRequest.readNamedRootFile(-88, "create_u13_welcome");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -63);
                }
                var2 = PendingListRequest.readNamedRootFile(-111, "create_createanaccount");
                if (var2 != null) {
                  AccountTextGlobals.field_f = SocialListEntry.decodeExtendedString(var2, param0 - 72);
                }
                var2 = PendingListRequest.readNamedRootFile(-102, "create_username");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 48);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -127, "create_displayname");
                if (null != var2) {
                  FullscreenFocusCanvas.field_e = SocialListEntry.decodeExtendedString(var2, param0 - 57);
                }
                var2 = PendingListRequest.readNamedRootFile(-106, "create_password");
                if (var2 != null) {
                  MenuStyleHelpers.field_a = SocialListEntry.decodeExtendedString(var2, -102);
                }
                var2 = PendingListRequest.readNamedRootFile(-105, "create_password_confirm");
                if (null != var2) {
                  ConfirmPasswordTextGlobals.field_e = SocialListEntry.decodeExtendedString(var2, -89);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -104, "create_email");
                if (var2 != null) {
                  LoadingScreenHelpers.field_c = SocialListEntry.decodeExtendedString(var2, param0 ^ -57);
                }
                var2 = PendingListRequest.readNamedRootFile(-99, "create_email_confirm");
                if (null != var2) {
                  ReportAbuseDialog.field_Pb = SocialListEntry.decodeExtendedString(var2, -84);
                }
                var2 = PendingListRequest.readNamedRootFile(-74, "create_age");
                if (var2 != null) {
                  MessageDialogContent.field_P = SocialListEntry.decodeExtendedString(var2, -102);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 96, "create_u13_email");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -117);
                }
                var2 = PendingListRequest.readNamedRootFile(-102, "create_u13_email_confirm");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -57);
                }
                var2 = PendingListRequest.readNamedRootFile(-98, "create_dob");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -60);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 98, "create_country");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -93);
                }
                var2 = PendingListRequest.readNamedRootFile(-120, "create_alternatives_header");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -46);
                }
                var2 = PendingListRequest.readNamedRootFile(-82, "create_alternatives_select");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -58);
                }
                var2 = PendingListRequest.readNamedRootFile(-77, "create_suggestions");
                if (var2 != null) {
                  AudioPumpThread.field_c = SocialListEntry.decodeExtendedString(var2, -113);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -77, "create_more_suggestions");
                if (null != var2) {
                  FullscreenErrorDialog.field_ab = SocialListEntry.decodeExtendedString(var2, -106);
                }
                var2 = PendingListRequest.readNamedRootFile(-127, "create_select_alternative");
                if (var2 != null) {
                  LoadingResourceHelpers.field_a = SocialListEntry.decodeExtendedString(var2, -50);
                }
                var2 = PendingListRequest.readNamedRootFile(-126, "create_optin_news");
                if (var2 != null) {
                  DiskCacheWorker.field_e = SocialListEntry.decodeExtendedString(var2, -82);
                }
                var2 = PendingListRequest.readNamedRootFile(-107, "create_agreeterms");
                if (null != var2) {
                  PieceDropAnimation.field_t = SocialListEntry.decodeExtendedString(var2, -115);
                }
                var2 = PendingListRequest.readNamedRootFile(-119, "create_u13terms");
                if (null != var2) {
                  DualLinkNodeHashTable.field_e = SocialListEntry.decodeExtendedString(var2, -120);
                }
                var2 = PendingListRequest.readNamedRootFile(-119, "login_username_email");
                if (var2 != null) {
                  HighscoreQuery.field_n = SocialListEntry.decodeExtendedString(var2, -58);
                }
                var2 = PendingListRequest.readNamedRootFile(-80, "login_username");
                if (null != var2) {
                  RasterStackHelpers.field_i = SocialListEntry.decodeExtendedString(var2, param0 ^ -57);
                }
                var2 = PendingListRequest.readNamedRootFile(-98, "login_email");
                if (var2 != null) {
                  PendingReplyNode.field_t = SocialListEntry.decodeExtendedString(var2, -67);
                }
                var2 = PendingListRequest.readNamedRootFile(-82, "login_username_tooltip");
                if (var2 != null) {
                  CheckboxWidget.field_T = SocialListEntry.decodeExtendedString(var2, param0 - 41);
                }
                var2 = PendingListRequest.readNamedRootFile(-99, "login_password_tooltip");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 38);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -78, "login_login_tooltip");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -84);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 90, "login_create_tooltip");
                if (null != var2) {
                  DefaultQuickChatContext.field_e = SocialListEntry.decodeExtendedString(var2, -72);
                }
                var2 = PendingListRequest.readNamedRootFile(-125, "login_justplay_tooltip");
                if (var2 != null) {
                  SecondaryNodeDeque.field_a = SocialListEntry.decodeExtendedString(var2, param0 ^ -43);
                }
                var2 = PendingListRequest.readNamedRootFile(-84, "login_back_tooltip");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -127);
                }
                var2 = PendingListRequest.readNamedRootFile(-101, "login_no_displayname");
                if (null != var2) {
                  ChatMessage.field_m = SocialListEntry.decodeExtendedString(var2, -120);
                }
                var2 = PendingListRequest.readNamedRootFile(-109, "create_username_tooltip");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -115);
                }
                var2 = PendingListRequest.readNamedRootFile(-92, "create_username_hint");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -100);
                }
                var2 = PendingListRequest.readNamedRootFile(-110, "create_displayname_tooltip");
                if (null != var2) {
                  SecondaryNodeDequeIterator.field_c = SocialListEntry.decodeExtendedString(var2, param0 ^ -59);
                }
                var2 = PendingListRequest.readNamedRootFile(-85, "create_displayname_hint");
                if (null != var2) {
                  AccountTextGlobals.field_c = SocialListEntry.decodeExtendedString(var2, param0 - 82);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 83, "create_password_tooltip");
                if (var2 != null) {
                  PasswordFieldPainter.field_D = SocialListEntry.decodeExtendedString(var2, -82);
                }
                var2 = PendingListRequest.readNamedRootFile(-87, "create_password_hint");
                if (var2 != null) {
                  IntKeyLookup.field_f = SocialListEntry.decodeExtendedString(var2, -106);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -124, "create_password_confirm_tooltip");
                if (param0 != 1) {
                  InterfaceTextLoader.loadInterfaceText(-92, (Archive) null);
                }
                if (null != var2) {
                  QuickChatMenuFactory.field_e = SocialListEntry.decodeExtendedString(var2, -100);
                }
                var2 = PendingListRequest.readNamedRootFile(-93, "create_email_tooltip");
                if (null != var2) {
                  FontAndFrameStyleHelpers.field_c = SocialListEntry.decodeExtendedString(var2, -128);
                }
                var2 = PendingListRequest.readNamedRootFile(-107, "create_email_confirm_tooltip");
                if (null != var2) {
                  AnimationFrameSet.field_t = SocialListEntry.decodeExtendedString(var2, -120);
                }
                var2 = PendingListRequest.readNamedRootFile(-122, "create_age_tooltip");
                if (var2 != null) {
                  DateInputWidget.field_N = SocialListEntry.decodeExtendedString(var2, -53);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 91, "create_optin_news_tooltip");
                if (var2 != null) {
                  ChatMessageReader.field_a = SocialListEntry.decodeExtendedString(var2, param0 ^ -40);
                }
                var2 = PendingListRequest.readNamedRootFile(-123, "create_u13_email_tooltip");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -44);
                }
                var2 = PendingListRequest.readNamedRootFile(-97, "create_u13_email_confirm_tooltip");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 119);
                }
                var2 = PendingListRequest.readNamedRootFile(-118, "create_dob_tooltip");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -123);
                }
                var2 = PendingListRequest.readNamedRootFile(-104, "create_country_tooltip");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -42);
                }
                var2 = PendingListRequest.readNamedRootFile(-109, "create_optin_tooltip");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -49);
                }
                var2 = PendingListRequest.readNamedRootFile(-101, "create_continue");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -44);
                }
                var2 = PendingListRequest.readNamedRootFile(-126, "create_username_unavailable");
                if (var2 != null) {
                  FullscreenErrorDialog.field_fb = SocialListEntry.decodeExtendedString(var2, -73);
                }
                var2 = PendingListRequest.readNamedRootFile(-92, "create_username_available");
                if (var2 != null) {
                  ClientProtocolStage.field_e = SocialListEntry.decodeExtendedString(var2, param0 - 121);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -73, "create_alert_namelength");
                if (var2 != null) {
                  CommonUiHelpers.field_e = SocialListEntry.decodeExtendedString(var2, -71);
                }
                var2 = PendingListRequest.readNamedRootFile(-79, "create_alert_namechars");
                if (null != var2) {
                  DelayedIncomingPacket.field_t = SocialListEntry.decodeExtendedString(var2, -114);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -118, "create_alert_nameleadingspace");
                if (var2 != null) {
                  DraggableWidget.field_U = SocialListEntry.decodeExtendedString(var2, -109);
                }
                var2 = PendingListRequest.readNamedRootFile(-128, "create_alert_doublespace");
                if (null != var2) {
                  GameOptionControls.field_i = SocialListEntry.decodeExtendedString(var2, -51);
                }
                var2 = PendingListRequest.readNamedRootFile(-112, "create_alert_passchars");
                if (null != var2) {
                  SharedPanelFactory.field_d = SocialListEntry.decodeExtendedString(var2, param0 ^ -55);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 108, "create_alert_passrepeated");
                if (null != var2) {
                  ScreenSwitchHelpers.field_d = SocialListEntry.decodeExtendedString(var2, -126);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 97, "create_alert_passlength");
                if (var2 != null) {
                  LongAndTextCredentials.field_i = SocialListEntry.decodeExtendedString(var2, -85);
                }
                var2 = PendingListRequest.readNamedRootFile(-116, "create_alert_passcontainsname");
                if (var2 != null) {
                  IsaacCipher.field_f = SocialListEntry.decodeExtendedString(var2, param0 - 111);
                }
                var2 = PendingListRequest.readNamedRootFile(-128, "create_alert_passcontainsemail");
                if (var2 != null) {
                  DisplayMode.field_l = SocialListEntry.decodeExtendedString(var2, param0 - 120);
                }
                var2 = PendingListRequest.readNamedRootFile(-104, "create_alert_passcontainsname_partial");
                if (null != var2) {
                  GameSession.field_h = SocialListEntry.decodeExtendedString(var2, -53);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -125, "create_alert_checkname");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -48);
                }
                var2 = PendingListRequest.readNamedRootFile(-85, "create_alert_invalidemail");
                if (null != var2) {
                  LoadingStepTracker.field_j = SocialListEntry.decodeExtendedString(var2, -94);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 123, "create_alert_email_unavailable");
                if (var2 != null) {
                  MouseInputHandler.field_c = SocialListEntry.decodeExtendedString(var2, -78);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -88, "create_alert_invaliddate");
                if (var2 != null) {
                  ReflectionCheck.field_y = SocialListEntry.decodeExtendedString(var2, -112);
                }
                var2 = PendingListRequest.readNamedRootFile(-93, "create_alert_invalidage");
                if (null != var2) {
                  SparkParticle.field_o = SocialListEntry.decodeExtendedString(var2, param0 - 114);
                }
                var2 = PendingListRequest.readNamedRootFile(-118, "create_alert_yearrange");
                if (var2 != null) {
                  ConfirmPasswordTextGlobals.field_d = SocialListEntry.decodeExtendedString(var2, -54);
                }
                var2 = PendingListRequest.readNamedRootFile(-92, "create_alert_mismatch");
                if (null != var2) {
                  LoginPanel.field_N = SocialListEntry.decodeExtendedString(var2, param0 ^ -126);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 111, "create_passwordvalid");
                if (null != var2) {
                  ResizableDialog.field_W = SocialListEntry.decodeExtendedString(var2, -92);
                }
                var2 = PendingListRequest.readNamedRootFile(-109, "create_emailvalid");
                if (null != var2) {
                  AnimationSequence.field_h = SocialListEntry.decodeExtendedString(var2, param0 ^ -114);
                }
                var2 = PendingListRequest.readNamedRootFile(-106, "create_account_success");
                if (var2 != null) {
                  DropTargetWidget.field_N = SocialListEntry.decodeExtendedString(var2, param0 - 42);
                }
                var2 = PendingListRequest.readNamedRootFile(-77, "invalid_name");
                if (null != var2) {
                  WidgetNode.field_u = SocialListEntry.decodeExtendedString(var2, -116);
                }
                var2 = PendingListRequest.readNamedRootFile(-123, "cannot_add_yourself");
                if (var2 != null) {
                  UiComponent.field_A = SocialListEntry.decodeExtendedString(var2, -64);
                }
                var2 = PendingListRequest.readNamedRootFile(-85, "unable_to_add_friend");
                if (var2 != null) {
                  LobbyGame.field_qc = SocialListEntry.decodeExtendedString(var2, -112);
                }
                var2 = PendingListRequest.readNamedRootFile(-74, "unable_to_add_ignore");
                if (var2 != null) {
                  AnimationFrameSet.field_w = SocialListEntry.decodeExtendedString(var2, param0 - 106);
                }
                var2 = PendingListRequest.readNamedRootFile(-89, "unable_to_delete_friend");
                if (null != var2) {
                  DropTargetWidget.field_Q = SocialListEntry.decodeExtendedString(var2, -83);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -86, "unable_to_delete_ignore");
                if (var2 != null) {
                  LoginProgressHelpers.field_a = SocialListEntry.decodeExtendedString(var2, -64);
                }
                var2 = PendingListRequest.readNamedRootFile(-78, "friendlistfull");
                if (var2 != null) {
                  MouseInputHandler.field_g = SocialListEntry.decodeExtendedString(var2, param0 - 94);
                }
                var2 = PendingListRequest.readNamedRootFile(-110, "friendlistdupe");
                if (null != var2) {
                  DelayedIncomingPacket.field_n = SocialListEntry.decodeExtendedString(var2, -45);
                }
                var2 = PendingListRequest.readNamedRootFile(-79, "friendnotfound");
                if (null != var2) {
                  SecondaryNodeDequeIterator.field_b = SocialListEntry.decodeExtendedString(var2, -60);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 116, "ignorelistfull");
                if (null != var2) {
                  CanvasAndErrorHelpers.field_c = SocialListEntry.decodeExtendedString(var2, -113);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 119, "ignorelistdupe");
                if (var2 != null) {
                  UiComponent.field_B = SocialListEntry.decodeExtendedString(var2, -110);
                }
                var2 = PendingListRequest.readNamedRootFile(-98, "ignorenotfound");
                if (var2 != null) {
                  MiscTextGlobals.field_e = SocialListEntry.decodeExtendedString(var2, -104);
                }
                var2 = PendingListRequest.readNamedRootFile(-90, "removeignorefirst");
                if (null != var2) {
                  NetworkArchiveRequest.field_J = SocialListEntry.decodeExtendedString(var2, -71);
                }
                var2 = PendingListRequest.readNamedRootFile(-107, "removefriendfirst");
                if (var2 != null) {
                  TwoColumnListPanel.field_Vb = SocialListEntry.decodeExtendedString(var2, -78);
                }
                var2 = PendingListRequest.readNamedRootFile(-112, "enterfriend_add");
                if (var2 != null) {
                  NineSliceFrameHelpers.field_d = SocialListEntry.decodeExtendedString(var2, -106);
                }
                var2 = PendingListRequest.readNamedRootFile(-74, "enterfriend_del");
                if (var2 != null) {
                  ChatMessageReader.field_g = SocialListEntry.decodeExtendedString(var2, param0 ^ -80);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 110, "enterignore_add");
                if (null != var2) {
                  PendingListRequest.field_p = SocialListEntry.decodeExtendedString(var2, -73);
                }
                var2 = PendingListRequest.readNamedRootFile(-125, "enterignore_del");
                if (var2 != null) {
                  MouseInputHandler.field_d = SocialListEntry.decodeExtendedString(var2, param0 ^ -120);
                }
                var2 = PendingListRequest.readNamedRootFile(-123, "text_removed_from_game");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 100);
                }
                var2 = PendingListRequest.readNamedRootFile(-91, "text_lobby_pleaselogin_free");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 98);
                }
                var2 = PendingListRequest.readNamedRootFile(-116, "opengl");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -111);
                }
                var2 = PendingListRequest.readNamedRootFile(-125, "sse");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -103);
                }
                var2 = PendingListRequest.readNamedRootFile(-85, "purejava");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 64);
                }
                var2 = PendingListRequest.readNamedRootFile(-91, "waitingfor_graphics");
                if (null != var2) {
                  QuickChatCategory.field_C = SocialListEntry.decodeExtendedString(var2, -64);
                }
                var2 = PendingListRequest.readNamedRootFile(-83, "waitingfor_models");
                if (null != var2) {
                  LobbyOverlayHelpers.field_a = SocialListEntry.decodeExtendedString(var2, param0 ^ -127);
                }
                var2 = PendingListRequest.readNamedRootFile(-77, "waitingfor_fonts");
                if (var2 != null) {
                  QuickChatHelpDialog.field_Kb = SocialListEntry.decodeExtendedString(var2, -96);
                }
                var2 = PendingListRequest.readNamedRootFile(-105, "waitingfor_soundeffects");
                if (var2 != null) {
                  MidiNote.field_w = SocialListEntry.decodeExtendedString(var2, -38);
                }
                var2 = PendingListRequest.readNamedRootFile(-105, "waitingfor_music");
                if (var2 != null) {
                  MouseWheelInput.field_a = SocialListEntry.decodeExtendedString(var2, param0 ^ -79);
                }
                var2 = PendingListRequest.readNamedRootFile(-118, "waitingfor_instruments");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -80);
                }
                var2 = PendingListRequest.readNamedRootFile(-91, "waitingfor_levels");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -118);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 112, "waitingfor_extradata");
                if (var2 != null) {
                  BufferedSocket.field_a = SocialListEntry.decodeExtendedString(var2, -81);
                }
                var2 = PendingListRequest.readNamedRootFile(-96, "waitingfor_languages");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -37);
                }
                var2 = PendingListRequest.readNamedRootFile(-98, "waitingfor_textures");
                if (var2 != null) {
                  NetworkArchiveRequest.field_L = SocialListEntry.decodeExtendedString(var2, -116);
                }
                var2 = PendingListRequest.readNamedRootFile(-123, "waitingfor_animations");
                if (var2 != null) {
                  LobbyListHelpers.field_f = SocialListEntry.decodeExtendedString(var2, -102);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 96, "loading_graphics");
                if (null != var2) {
                  NameAlphabetTable.field_c = SocialListEntry.decodeExtendedString(var2, param0 ^ -119);
                }
                var2 = PendingListRequest.readNamedRootFile(-112, "loading_models");
                if (var2 != null) {
                  DirectByteStorage.field_k = SocialListEntry.decodeExtendedString(var2, -85);
                }
                var2 = PendingListRequest.readNamedRootFile(-128, "loading_fonts");
                if (var2 != null) {
                  TextMetricsGlobals.field_a = SocialListEntry.decodeExtendedString(var2, param0 ^ -95);
                }
                var2 = PendingListRequest.readNamedRootFile(-112, "loading_soundeffects");
                if (null != var2) {
                  TextHighlightSpan.field_t = SocialListEntry.decodeExtendedString(var2, -113);
                }
                var2 = PendingListRequest.readNamedRootFile(-110, "loading_music");
                if (var2 != null) {
                  KeyHandlerHelpers.field_g = SocialListEntry.decodeExtendedString(var2, param0 ^ -95);
                }
                var2 = PendingListRequest.readNamedRootFile(-112, "loading_instruments");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -41);
                }
                var2 = PendingListRequest.readNamedRootFile(-90, "loading_levels");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -98);
                }
                var2 = PendingListRequest.readNamedRootFile(-111, "loading_extradata");
                if (var2 != null) {
                  QueuedListRequest.field_w = SocialListEntry.decodeExtendedString(var2, -61);
                }
                var2 = PendingListRequest.readNamedRootFile(-88, "loading_languages");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -118);
                }
                var2 = PendingListRequest.readNamedRootFile(-126, "loading_textures");
                if (null != var2) {
                  MusicPatch.field_x = SocialListEntry.decodeExtendedString(var2, param0 - 64);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 114, "loading_animations");
                if (var2 != null) {
                  ContentTransitionDialog.field_kb = SocialListEntry.decodeExtendedString(var2, -61);
                }
                var2 = PendingListRequest.readNamedRootFile(-117, "unpacking_graphics");
                if (null != var2) {
                  LoginCredentials.field_e = SocialListEntry.decodeExtendedString(var2, -53);
                }
                var2 = PendingListRequest.readNamedRootFile(-84, "unpacking_models");
                if (null != var2) {
                  PasswordLengthHelpers.field_e = SocialListEntry.decodeExtendedString(var2, -118);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -84, "unpacking_soundeffects");
                if (null != var2) {
                  TwoColumnListPanel.field_Ub = SocialListEntry.decodeExtendedString(var2, param0 - 114);
                }
                var2 = PendingListRequest.readNamedRootFile(-98, "unpacking_music");
                if (null != var2) {
                  InsetTextPainter.field_r = SocialListEntry.decodeExtendedString(var2, -88);
                }
                var2 = PendingListRequest.readNamedRootFile(-100, "unpacking_levels");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -102);
                }
                var2 = PendingListRequest.readNamedRootFile(-80, "unpacking_languages");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -88);
                }
                var2 = PendingListRequest.readNamedRootFile(-127, "unpacking_animations");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -56);
                }
                var2 = PendingListRequest.readNamedRootFile(-122, "unpacking_toolkit");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -98);
                }
            }
            void runChunk2() throws java.lang.RuntimeException {
                var2 = PendingListRequest.readNamedRootFile(-123, "instructions");
                if (var2 != null) {
                  MiscTextGlobals.field_d = SocialListEntry.decodeExtendedString(var2, -80);
                }
                var2 = PendingListRequest.readNamedRootFile(-85, "tutorial");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -49);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 103, "playtutorial");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -100);
                }
                var2 = PendingListRequest.readNamedRootFile(-107, "sound_colon");
                if (var2 != null) {
                  SingleChildWidget.field_M = SocialListEntry.decodeExtendedString(var2, -99);
                }
                var2 = PendingListRequest.readNamedRootFile(-76, "music_colon");
                if (var2 != null) {
                  IntrusiveDequeCursor.field_c = SocialListEntry.decodeExtendedString(var2, -70);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 109, "fullscreen");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -125);
                }
                var2 = PendingListRequest.readNamedRootFile(-95, "screensize");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 100);
                }
                var2 = PendingListRequest.readNamedRootFile(-120, "highscores");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -127);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 126, "rankings");
                if (var2 != null) {
                  ValidatedTextWidget.field_db = SocialListEntry.decodeExtendedString(var2, param0 - 124);
                }
                var2 = PendingListRequest.readNamedRootFile(-97, "achievements");
                if (null != var2) {
                  NetworkGameClient.field_x = SocialListEntry.decodeExtendedString(var2, -115);
                }
                var2 = PendingListRequest.readNamedRootFile(-96, "achievementsthisgame");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -83);
                }
                var2 = PendingListRequest.readNamedRootFile(-127, "achievementsthissession");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -41);
                }
                var2 = PendingListRequest.readNamedRootFile(-110, "watchintroduction");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -120);
                }
                var2 = PendingListRequest.readNamedRootFile(-76, "quit");
                if (var2 != null) {
                  MusicPatch.field_E = SocialListEntry.decodeExtendedString(var2, -115);
                }
                var2 = PendingListRequest.readNamedRootFile(-86, "login_createaccount");
                if (null != var2) {
                  UiComponent.field_ub = SocialListEntry.decodeExtendedString(var2, -52);
                }
                var2 = PendingListRequest.readNamedRootFile(-101, "tohighscores");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -63);
                }
                var2 = PendingListRequest.readNamedRootFile(-82, "returntomainmenu");
                if (null != var2) {
                  AccountWelcomePanel.field_K = SocialListEntry.decodeExtendedString(var2, -43);
                }
                var2 = PendingListRequest.readNamedRootFile(-110, "returntopausemenu");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -68);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 81, "returntooptionsmenu_notpaused");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -67);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -115, "mainmenu");
                if (var2 != null) {
                  AudioPumpThread.field_b = SocialListEntry.decodeExtendedString(var2, -105);
                }
                var2 = PendingListRequest.readNamedRootFile(-85, "pausemenu");
                if (null != var2) {
                  PacketBuffer.field_o = SocialListEntry.decodeExtendedString(var2, -46);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -117, "optionsmenu_notpaused");
                if (var2 != null) {
                  BevelFrameSpriteFactory.field_c = SocialListEntry.decodeExtendedString(var2, -79);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -127, "menu");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -98);
                }
                var2 = PendingListRequest.readNamedRootFile(-99, "selectlevel");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 82);
                }
                var2 = PendingListRequest.readNamedRootFile(-77, "nextlevel");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -85);
                }
                var2 = PendingListRequest.readNamedRootFile(-99, "startgame");
                if (null != var2) {
                  ProgressMessageDialog.field_pb = SocialListEntry.decodeExtendedString(var2, param0 - 107);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 87, "newgame");
                if (null != var2) {
                  LoginPanel.field_T = SocialListEntry.decodeExtendedString(var2, -111);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -128, "resumegame");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -124);
                }
                var2 = PendingListRequest.readNamedRootFile(-117, "resumetutorial");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 65);
                }
                var2 = PendingListRequest.readNamedRootFile(-112, "skip");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -111);
                }
                var2 = PendingListRequest.readNamedRootFile(-121, "skiptutorial");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -90);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -103, "skipending");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -54);
                }
                var2 = PendingListRequest.readNamedRootFile(-87, "restartlevel");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 110);
                }
                var2 = PendingListRequest.readNamedRootFile(-127, "endtest");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -57);
                }
                var2 = PendingListRequest.readNamedRootFile(-121, "endgame");
                if (var2 != null) {
                  IntroFinalFrameHelpers.field_a = SocialListEntry.decodeExtendedString(var2, param0 ^ -78);
                }
                var2 = PendingListRequest.readNamedRootFile(-96, "endtutorial");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -66);
                }
                var2 = PendingListRequest.readNamedRootFile(-111, "ok");
                if (null != var2) {
                  TooltipTextGlobals.field_b = SocialListEntry.decodeExtendedString(var2, -37);
                }
                var2 = PendingListRequest.readNamedRootFile(-112, "on");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -99);
                }
                var2 = PendingListRequest.readNamedRootFile(-109, "off");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -51);
                }
                var2 = PendingListRequest.readNamedRootFile(-86, "previous");
                if (null != var2) {
                  OpacityWidget.field_O = SocialListEntry.decodeExtendedString(var2, -88);
                }
                var2 = PendingListRequest.readNamedRootFile(-102, "prev");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -122);
                }
                var2 = PendingListRequest.readNamedRootFile(-127, "next");
                if (var2 != null) {
                  CachedArchiveSource.field_h = SocialListEntry.decodeExtendedString(var2, param0 - 42);
                }
                var2 = PendingListRequest.readNamedRootFile(-74, "graphics_colon");
                if (var2 != null) {
                  WeightedLruCache.field_f = SocialListEntry.decodeExtendedString(var2, -46);
                }
                var2 = PendingListRequest.readNamedRootFile(-124, "hotseatmultiplayer");
                if (null != var2) {
                  AlternateLongAndTextCredentials.field_q = SocialListEntry.decodeExtendedString(var2, -68);
                }
                var2 = PendingListRequest.readNamedRootFile(-100, "entermultiplayerlobby");
                if (var2 != null) {
                  RasterSnapshot.field_n = SocialListEntry.decodeExtendedString(var2, -96);
                }
                var2 = PendingListRequest.readNamedRootFile(-76, "singleplayergame");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -81);
                }
                var2 = PendingListRequest.readNamedRootFile(-117, "returntogame");
                if (var2 != null) {
                  MusicPatchEnvelope.field_l = SocialListEntry.decodeExtendedString(var2, -108);
                }
                var2 = PendingListRequest.readNamedRootFile(-116, "endgameresign");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -83);
                }
                var2 = PendingListRequest.readNamedRootFile(-87, "offerdraw");
                if (var2 != null) {
                  DirectByteStorage.field_f = SocialListEntry.decodeExtendedString(var2, -101);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -85, "canceldraw");
                if (null != var2) {
                  GameRoomPanelHelpers.field_f = SocialListEntry.decodeExtendedString(var2, -111);
                }
                var2 = PendingListRequest.readNamedRootFile(-123, "acceptdraw");
                if (var2 != null) {
                  StripedProgressBar.field_O = SocialListEntry.decodeExtendedString(var2, -108);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 123, "resign");
                if (null != var2) {
                  MenuScreen.field_a = SocialListEntry.decodeExtendedString(var2, -81);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -116, "returntolobby");
                if (null != var2) {
                  LoginDialog.field_ob = SocialListEntry.decodeExtendedString(var2, -95);
                }
                var2 = PendingListRequest.readNamedRootFile(-75, "cont");
                if (var2 != null) {
                  TextWidgetPainter.field_e = SocialListEntry.decodeExtendedString(var2, -91);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -117, "continue_spectating");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -43);
                }
                var2 = PendingListRequest.readNamedRootFile(-108, "messages");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -66);
                }
                var2 = PendingListRequest.readNamedRootFile(-80, "graphics_fastest");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -47);
                }
                var2 = PendingListRequest.readNamedRootFile(-111, "graphics_medium");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -73);
                }
                var2 = PendingListRequest.readNamedRootFile(-102, "graphics_best");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -91);
                }
                var2 = PendingListRequest.readNamedRootFile(-121, "graphics_directx");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -122);
                }
                var2 = PendingListRequest.readNamedRootFile(-116, "graphics_opengl");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -77);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -122, "graphics_java");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 58);
                }
                var2 = PendingListRequest.readNamedRootFile(-113, "graphics_quality_high");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -46);
                }
                var2 = PendingListRequest.readNamedRootFile(-98, "graphics_quality_low");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -73);
                }
                var2 = PendingListRequest.readNamedRootFile(-122, "graphics_mode");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -68);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -89, "graphics_quality");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -98);
                }
                var2 = PendingListRequest.readNamedRootFile(-95, "mode");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -115);
                }
                var2 = PendingListRequest.readNamedRootFile(-76, "quality");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -87);
                }
                var2 = PendingListRequest.readNamedRootFile(-79, "keys");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -49);
                }
                var2 = PendingListRequest.readNamedRootFile(-108, "objective");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -122);
                }
                var2 = PendingListRequest.readNamedRootFile(-100, "currentobjective");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -117);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 87, "pressescforpausemenu");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -87);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -73, "pressescforpausemenuortoskiptutorial");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -95);
                }
                var2 = PendingListRequest.readNamedRootFile(-77, "pressescforoptionsmenu_doesntpause");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -62);
                }
                var2 = PendingListRequest.readNamedRootFile(-89, "pressescforoptionsmenu_doesntpause_short");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -80);
                }
                var2 = PendingListRequest.readNamedRootFile(-122, "powerups");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -91);
                }
                var2 = PendingListRequest.readNamedRootFile(-80, "latestlevel_suffix");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 39);
                }
                var2 = PendingListRequest.readNamedRootFile(-111, "unreachedlevel_name");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -120);
                }
                var2 = PendingListRequest.readNamedRootFile(-109, "unreachedlevel_cannotplayreason");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -42);
                }
                var2 = PendingListRequest.readNamedRootFile(-114, "unreachedlevel_cannotplayreason_shorter");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 85);
                }
                var2 = PendingListRequest.readNamedRootFile(-80, "unreachedworld_cannotplayreason");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -97);
                }
                var2 = PendingListRequest.readNamedRootFile(-78, "memberslevel_name");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -119);
                }
                var2 = PendingListRequest.readNamedRootFile(-111, "memberslevel_cannotplayreason");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -120);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -112, "membersworld_cannotplayreason");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -107);
                }
                var2 = PendingListRequest.readNamedRootFile(-82, "unreachedlevel_createtip");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 49);
                }
                var2 = PendingListRequest.readNamedRootFile(-104, "unreachedlevel_createtip_line1");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -44);
                }
                var2 = PendingListRequest.readNamedRootFile(-118, "unreachedlevel_createtip_line2");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 71);
                }
                var2 = PendingListRequest.readNamedRootFile(-118, "unreachedlevel_logintip");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -121);
                }
                var2 = PendingListRequest.readNamedRootFile(-89, "memberslevel_logintip");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -55);
                }
                var2 = PendingListRequest.readNamedRootFile(-101, "displayname_none");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -55);
                }
                var2 = PendingListRequest.readNamedRootFile(-77, "levelxofy1");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -109);
                }
                var2 = PendingListRequest.readNamedRootFile(-99, "levelxofy2");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -124);
                }
                var2 = PendingListRequest.readNamedRootFile(-103, "levelxofy");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -116);
                }
                var2 = PendingListRequest.readNamedRootFile(-97, "ingame_level");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -84);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -91, "mouseoveranicon");
                if (var2 != null) {
                  ReportAbuseDialog.field_Lb = SocialListEntry.decodeExtendedString(var2, -82);
                }
                var2 = PendingListRequest.readNamedRootFile(-89, "notyetachieved");
                if (null != var2) {
                  NetworkGameClient.field_D = SocialListEntry.decodeExtendedString(var2, -52);
                }
                var2 = PendingListRequest.readNamedRootFile(-124, "achieved");
                if (null != var2) {
                  CommonUiHelpers.field_f = SocialListEntry.decodeExtendedString(var2, -81);
                }
                var2 = PendingListRequest.readNamedRootFile(-81, "orbpoints");
                if (null != var2) {
                  EmailAvailabilityValidator.field_B = SocialListEntry.decodeExtendedString(var2, -45);
                }
                var2 = PendingListRequest.readNamedRootFile(-95, "orbcoins");
                if (var2 != null) {
                  DisplayMode.field_c = SocialListEntry.decodeExtendedString(var2, -88);
                }
                var2 = PendingListRequest.readNamedRootFile(-103, "orbpoints_colon");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -88);
                }
                var2 = PendingListRequest.readNamedRootFile(-128, "orbcoins_colon");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 115);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -121, "achieved_colon_description");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -74);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 75, "secretachievement");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -123);
                }
                var2 = PendingListRequest.readNamedRootFile(-91, "no_highscores");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -69);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -112, "hs_name");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -52);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 95, "hs_level");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -109);
                }
                var2 = PendingListRequest.readNamedRootFile(-79, "hs_fromlevel");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -128);
                }
                var2 = PendingListRequest.readNamedRootFile(-96, "hs_tolevel");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -37);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 82, "hs_score");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -40);
                }
                var2 = PendingListRequest.readNamedRootFile(-124, "hs_end");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -60);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 111, "ingame_score");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -74);
                }
                var2 = PendingListRequest.readNamedRootFile(-91, "score_colon");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -87);
                }
                var2 = PendingListRequest.readNamedRootFile(-86, "mp_leavegame");
                if (null != var2) {
                  DraggableWidget.field_P = SocialListEntry.decodeExtendedString(var2, -111);
                }
                var2 = PendingListRequest.readNamedRootFile(-117, "mp_offerrematch");
                if (var2 != null) {
                  PieceDropAnimation.field_w = SocialListEntry.decodeExtendedString(var2, -93);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -73, "mp_offerrematch_unrated");
                if (null != var2) {
                  EmailSyntaxValidator.field_r = SocialListEntry.decodeExtendedString(var2, -105);
                }
                var2 = PendingListRequest.readNamedRootFile(-126, "mp_acceptrematch");
                if (var2 != null) {
                  DelayedIncomingPacket.field_q = SocialListEntry.decodeExtendedString(var2, -117);
                }
                var2 = PendingListRequest.readNamedRootFile(-116, "mp_acceptrematch_unrated");
                if (null != var2) {
                  FaceNormal.field_c = SocialListEntry.decodeExtendedString(var2, -112);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 125, "mp_cancelrematch");
                if (null != var2) {
                  PendingReplyNode.field_s = SocialListEntry.decodeExtendedString(var2, -100);
                }
                var2 = PendingListRequest.readNamedRootFile(-104, "mp_cancelrematch_unrated");
                if (null != var2) {
                  WidgetTheme.field_a = SocialListEntry.decodeExtendedString(var2, param0 ^ -92);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -91, "mp_rematchnewgame");
                if (var2 != null) {
                  StatefulWidgetRenderer.field_v = SocialListEntry.decodeExtendedString(var2, -52);
                }
                var2 = PendingListRequest.readNamedRootFile(-127, "mp_rematchnewgame_unrated");
                if (null != var2) {
                  DisplayNameForm.field_M = SocialListEntry.decodeExtendedString(var2, -39);
                }
                var2 = PendingListRequest.readNamedRootFile(-100, "mp_x_wantstodraw");
                if (null != var2) {
                  BitPacketBuffer.field_v = SocialListEntry.decodeExtendedString(var2, -89);
                }
                var2 = PendingListRequest.readNamedRootFile(-83, "mp_x_offersrematch");
                if (null != var2) {
                  PatchNoteUsage.field_o = SocialListEntry.decodeExtendedString(var2, -49);
                }
                var2 = PendingListRequest.readNamedRootFile(-107, "mp_x_offersrematch_unrated");
                if (var2 != null) {
                  DisplayNameForm.field_P = SocialListEntry.decodeExtendedString(var2, param0 - 129);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -113, "mp_youofferrematch");
                if (var2 != null) {
                  Renderable.field_c = SocialListEntry.decodeExtendedString(var2, -96);
                }
                var2 = PendingListRequest.readNamedRootFile(-122, "mp_youofferrematch_unrated");
                if (var2 != null) {
                  IndexedSpriteState.field_i = SocialListEntry.decodeExtendedString(var2, -92);
                }
                var2 = PendingListRequest.readNamedRootFile(-78, "mp_youofferdraw");
                if (var2 != null) {
                  TextLayoutLine.field_g = SocialListEntry.decodeExtendedString(var2, -105);
                }
                var2 = PendingListRequest.readNamedRootFile(-89, "mp_youresigned");
                if (null != var2) {
                  SpriteCheckboxPainter.field_b = SocialListEntry.decodeExtendedString(var2, -102);
                }
                var2 = PendingListRequest.readNamedRootFile(-83, "mp_youresigned_rematch");
                if (null != var2) {
                  StrongCacheEntry.field_H = SocialListEntry.decodeExtendedString(var2, -93);
                }
                var2 = PendingListRequest.readNamedRootFile(-120, "mp_x_hasresignedandleft");
                if (null != var2) {
                  NameSeparatorHelpers.field_f = SocialListEntry.decodeExtendedString(var2, -58);
                }
                var2 = PendingListRequest.readNamedRootFile(-119, "mp_x_hasresigned_rematch");
                if (null != var2) {
                  WidgetStyleLayer.field_d = SocialListEntry.decodeExtendedString(var2, -88);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -93, "mp_x_hasresigned");
                if (null != var2) {
                  ArrayWidgetContainer.field_M = SocialListEntry.decodeExtendedString(var2, param0 ^ -83);
                }
                var2 = PendingListRequest.readNamedRootFile(-84, "mp_x_hasleft");
                if (null != var2) {
                  InputDetachHelpers.field_d = SocialListEntry.decodeExtendedString(var2, -126);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -82, "mp_x_haswon");
                if (var2 != null) {
                  TextLayoutLine.field_b = SocialListEntry.decodeExtendedString(var2, -42);
                }
                var2 = PendingListRequest.readNamedRootFile(-96, "mp_youhavewon");
                if (var2 != null) {
                  IntrusiveNode.field_g = SocialListEntry.decodeExtendedString(var2, -66);
                }
                var2 = PendingListRequest.readNamedRootFile(-100, "mp_gamedrawn");
                if (null != var2) {
                  IntKeyLookup.field_e = SocialListEntry.decodeExtendedString(var2, param0 - 114);
                }
                var2 = PendingListRequest.readNamedRootFile(-122, "mp_timeremaining");
                if (var2 != null) {
                  ArchiveFactoryHelpers.field_f = SocialListEntry.decodeExtendedString(var2, -54);
                }
                var2 = PendingListRequest.readNamedRootFile(-74, "mp_x_turn");
                if (var2 != null) {
                  NanoTickClock.field_l = SocialListEntry.decodeExtendedString(var2, -110);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 120, "mp_yourturn");
                if (null != var2) {
                  ClientProtocolStage.field_f = SocialListEntry.decodeExtendedString(var2, -56);
                }
                var2 = PendingListRequest.readNamedRootFile(-122, "gameover");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -128);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 77, "mp_hidechat");
                if (null != var2) {
                  StringPadHelpers.field_b = SocialListEntry.decodeExtendedString(var2, -120);
                }
                var2 = PendingListRequest.readNamedRootFile(-86, "mp_showchat_nounread");
                if (var2 != null) {
                  ChatMessage.field_d = SocialListEntry.decodeExtendedString(var2, param0 - 87);
                }
                var2 = PendingListRequest.readNamedRootFile(-111, "mp_showchat_unread1");
                if (null != var2) {
                  NineSliceFrame.field_c = SocialListEntry.decodeExtendedString(var2, param0 - 70);
                }
                var2 = PendingListRequest.readNamedRootFile(-91, "mp_showchat_unread2");
                if (var2 != null) {
                  AgeValidator.field_q = SocialListEntry.decodeExtendedString(var2, param0 ^ -55);
                }
                var2 = PendingListRequest.readNamedRootFile(-76, "click_to_quickchat");
                if (var2 != null) {
                  PacketBuffer.field_n = SocialListEntry.decodeExtendedString(var2, -43);
                }
                var2 = PendingListRequest.readNamedRootFile(-106, "autorespond");
                if (var2 != null) {
                  LoginPanel.field_bb = SocialListEntry.decodeExtendedString(var2, -47);
                }
                var2 = PendingListRequest.readNamedRootFile(-101, "quickchat_help");
                if (var2 != null) {
                  ProxySocketConnector.field_m = SocialListEntry.decodeExtendedString(var2, -52);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 89, "quickchat_help_title");
                if (null != var2) {
                  SocketConnector.field_h = SocialListEntry.decodeExtendedString(var2, -40);
                }
                var2 = PendingListRequest.readNamedRootFile(-89, "quickchat_shortcut_help,0");
                if (var2 != null) {
                  NetworkGameClient.field_C[0] = SocialListEntry.decodeExtendedString(var2, -43);
                }
                var2 = PendingListRequest.readNamedRootFile(-88, "quickchat_shortcut_help,1");
                if (var2 != null) {
                  NetworkGameClient.field_C[1] = SocialListEntry.decodeExtendedString(var2, param0 - 80);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 113, "quickchat_shortcut_help,2");
                if (var2 != null) {
                  NetworkGameClient.field_C[2] = SocialListEntry.decodeExtendedString(var2, -68);
                }
                var2 = PendingListRequest.readNamedRootFile(-82, "quickchat_shortcut_help,3");
                if (var2 != null) {
                  NetworkGameClient.field_C[3] = SocialListEntry.decodeExtendedString(var2, param0 - 120);
                }
                var2 = PendingListRequest.readNamedRootFile(-98, "quickchat_shortcut_help,4");
                if (var2 != null) {
                  NetworkGameClient.field_C[4] = SocialListEntry.decodeExtendedString(var2, -127);
                }
                var2 = PendingListRequest.readNamedRootFile(-110, "quickchat_shortcut_help,5");
                if (var2 != null) {
                  NetworkGameClient.field_C[5] = SocialListEntry.decodeExtendedString(var2, -84);
                }
                var2 = PendingListRequest.readNamedRootFile(-82, "quickchat_shortcut_keys,0");
                if (var2 != null) {
                  TextMetricsGlobals.field_d[0] = SocialListEntry.decodeExtendedString(var2, -127);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -109, "quickchat_shortcut_keys,1");
                if (var2 != null) {
                  TextMetricsGlobals.field_d[1] = SocialListEntry.decodeExtendedString(var2, param0 - 108);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -79, "quickchat_shortcut_keys,2");
                if (var2 != null) {
                  TextMetricsGlobals.field_d[2] = SocialListEntry.decodeExtendedString(var2, -114);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -94, "quickchat_shortcut_keys,3");
                if (null != var2) {
                  TextMetricsGlobals.field_d[3] = SocialListEntry.decodeExtendedString(var2, -67);
                }
                var2 = PendingListRequest.readNamedRootFile(-120, "quickchat_shortcut_keys,4");
                if (null != var2) {
                  TextMetricsGlobals.field_d[4] = SocialListEntry.decodeExtendedString(var2, -85);
                }
                var2 = PendingListRequest.readNamedRootFile(-74, "quickchat_shortcut_keys,5");
                if (null != var2) {
                  TextMetricsGlobals.field_d[5] = SocialListEntry.decodeExtendedString(var2, -58);
                }
                var2 = PendingListRequest.readNamedRootFile(-110, "keychar_the_character_under_questionmark");
                if (null != var2) {
                  NameSeparatorHelpers.field_a = SocialTabsPanel.decodeSingleByteCharacter((byte) -13, var2[0]);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -121, "rating_noratings");
                if (null != var2) {
                  StringPadHelpers.field_c = SocialListEntry.decodeExtendedString(var2, param0 - 62);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 76, "rating_rating");
                if (null != var2) {
                  SpriteState.field_w = SocialListEntry.decodeExtendedString(var2, -119);
                }
                var2 = PendingListRequest.readNamedRootFile(-115, "rating_played");
                if (null != var2) {
                  AccountServerResult.field_j = SocialListEntry.decodeExtendedString(var2, -100);
                }
                var2 = PendingListRequest.readNamedRootFile(-117, "rating_won");
                if (var2 != null) {
                  ConnectionTimingHelpers.field_d = SocialListEntry.decodeExtendedString(var2, param0 - 53);
                }
                var2 = PendingListRequest.readNamedRootFile(-105, "rating_lost");
                if (null != var2) {
                  IndexedSpriteHelpers.field_a = SocialListEntry.decodeExtendedString(var2, param0 - 41);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -101, "rating_drawn");
                if (var2 != null) {
                  TextLayout.field_b = SocialListEntry.decodeExtendedString(var2, -98);
                }
                var2 = PendingListRequest.readNamedRootFile(-119, "benefits_fullscreen");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 46);
                }
                var2 = PendingListRequest.readNamedRootFile(-94, "benefits_noadverts");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 55);
                }
                var2 = PendingListRequest.readNamedRootFile(-95, "benefits_price");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -51);
                }
                var2 = PendingListRequest.readNamedRootFile(-128, "members_expansion_benefits,0");
                if (var2 != null) {
                  AnimationFrameSet.field_A[0] = SocialListEntry.decodeExtendedString(var2, -89);
                }
                var2 = PendingListRequest.readNamedRootFile(-114, "members_expansion_benefits,1");
                if (var2 != null) {
                  AnimationFrameSet.field_A[1] = SocialListEntry.decodeExtendedString(var2, -38);
                }
                var2 = PendingListRequest.readNamedRootFile(-99, "members_expansion_benefits,2");
                if (null != var2) {
                  AnimationFrameSet.field_A[2] = SocialListEntry.decodeExtendedString(var2, -40);
                }
                var2 = PendingListRequest.readNamedRootFile(-81, "members_expansion_price_top");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 43);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -81, "members_expansion_price_bottom");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -41);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -87, "reconnect_lost_seq,0");
                if (var2 != null) {
                  PendingReplyNode.field_o[0] = SocialListEntry.decodeExtendedString(var2, -109);
                }
                var2 = PendingListRequest.readNamedRootFile(-91, "reconnect_lost_seq,1");
                if (null != var2) {
                  PendingReplyNode.field_o[1] = SocialListEntry.decodeExtendedString(var2, -47);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -81, "reconnect_lost_seq,2");
                if (null != var2) {
                  PendingReplyNode.field_o[2] = SocialListEntry.decodeExtendedString(var2, -112);
                }
                var2 = PendingListRequest.readNamedRootFile(-105, "reconnect_lost_seq,3");
                if (null != var2) {
                  PendingReplyNode.field_o[3] = SocialListEntry.decodeExtendedString(var2, -105);
                }
                var2 = PendingListRequest.readNamedRootFile(-77, "reconnect_lost");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 104);
                }
                var2 = PendingListRequest.readNamedRootFile(-112, "reconnect_restored");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 104);
                }
                var2 = PendingListRequest.readNamedRootFile(-91, "reconnect_please_check");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -73);
                }
                var2 = PendingListRequest.readNamedRootFile(-119, "reconnect_wait");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -68);
                }
                var2 = PendingListRequest.readNamedRootFile(-118, "reconnect_retry");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -90);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -98, "reconnect_resume");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -114);
                }
                var2 = PendingListRequest.readNamedRootFile(-107, "reconnect_or");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -60);
                }
                var2 = PendingListRequest.readNamedRootFile(-101, "reconnect_exitfs");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -40);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -120, "reconnect_exitfs_quit");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -68);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -93, "reconnect_quit");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -71);
                }
                var2 = PendingListRequest.readNamedRootFile(-82, "reconnect_check_fs");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -93);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -103, "reconnect_check_nonfs");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -51);
                }
                var2 = PendingListRequest.readNamedRootFile(-125, "fs_accept_beforeaccept");
                if (null != var2) {
                  HighscoreSubmission.field_n = SocialListEntry.decodeExtendedString(var2, param0 ^ -60);
                }
                var2 = PendingListRequest.readNamedRootFile(-111, "fs_button_accept");
                if (null != var2) {
                  TriangleSpanHelpers.field_g = SocialListEntry.decodeExtendedString(var2, -90);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -125, "fs_accept_afteraccept");
                if (var2 != null) {
                  IndexedSpriteState.field_g = SocialListEntry.decodeExtendedString(var2, -101);
                }
                var2 = PendingListRequest.readNamedRootFile(-89, "fs_button_cancel");
                if (null != var2) {
                  AccountCreationForm.field_Q = SocialListEntry.decodeExtendedString(var2, -81);
                }
                var2 = PendingListRequest.readNamedRootFile(-75, "fs_accept_aftercancel");
                if (null != var2) {
                  MenuReturnHelpers.field_b = SocialListEntry.decodeExtendedString(var2, -95);
                }
                var2 = PendingListRequest.readNamedRootFile(-128, "fs_accept_countdown_sing");
                if (var2 != null) {
                  RsaKeyAndTextGlobals.field_g = SocialListEntry.decodeExtendedString(var2, param0 ^ -77);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 115, "fs_accept_countdown_pl");
                if (var2 != null) {
                  DualLinkNode.field_p = SocialListEntry.decodeExtendedString(var2, -98);
                }
                var2 = PendingListRequest.readNamedRootFile(-113, "fs_nonmember");
                if (null != var2) {
                  LobbyResourceHelpers.field_b = SocialListEntry.decodeExtendedString(var2, -99);
                }
                var2 = PendingListRequest.readNamedRootFile(-104, "fs_button_close");
                if (null != var2) {
                  DebouncedValidator.field_a = SocialListEntry.decodeExtendedString(var2, -94);
                }
                var2 = PendingListRequest.readNamedRootFile(-120, "fs_button_members");
                if (null != var2) {
                  LoadingProgressDialog.field_X = SocialListEntry.decodeExtendedString(var2, -91);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 104, "fs_unavailable");
                if (var2 != null) {
                  ChatPanelSlideHelpers.field_b = SocialListEntry.decodeExtendedString(var2, -44);
                }
                var2 = PendingListRequest.readNamedRootFile(-127, "fs_unavailable_try_signed_applet");
                if (null != var2) {
                  MusicPatchPcmStream.field_v = SocialListEntry.decodeExtendedString(var2, -60);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 106, "fs_focus");
                if (var2 != null) {
                  MiscTextGlobals.field_c = SocialListEntry.decodeExtendedString(var2, -124);
                }
                var2 = PendingListRequest.readNamedRootFile(-126, "fs_focus_or_resolution");
                if (null != var2) {
                  AgeValidator.field_s = SocialListEntry.decodeExtendedString(var2, -38);
                }
                var2 = PendingListRequest.readNamedRootFile(-94, "fs_timeout");
                if (var2 != null) {
                  PendingSubmission.field_p = SocialListEntry.decodeExtendedString(var2, -52);
                }
                var2 = PendingListRequest.readNamedRootFile(-79, "fs_button_tryagain");
                if (null != var2) {
                  PasswordValidator.field_q = SocialListEntry.decodeExtendedString(var2, -40);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 82, "graphics_ui_fs_countdown");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -122);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 100, "mb_caption_title");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -72);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 126, "mb_including_gamename");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -88);
                }
                var2 = PendingListRequest.readNamedRootFile(-101, "mb_full_access_1");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -90);
                }
                var2 = PendingListRequest.readNamedRootFile(-80, "mb_full_access_2");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 101);
                }
                var2 = PendingListRequest.readNamedRootFile(-88, "mb_achievement_count_1");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -121);
                }
                var2 = PendingListRequest.readNamedRootFile(-88, "mb_achievement_count_2");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 70);
                }
                var2 = PendingListRequest.readNamedRootFile(-113, "mb_exclusive_1");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -92);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -107, "mb_exclusive_2");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -51);
                }
                var2 = PendingListRequest.readNamedRootFile(-85, "me_extra_benefits");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 121);
                }
                var2 = PendingListRequest.readNamedRootFile(-90, "hs_friend_tip");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -45);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 86, "hs_friend_tip_multi");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 65);
                }
                var2 = PendingListRequest.readNamedRootFile(-118, "hs_mode_name,0");
                if (null != var2) {
                  DirectByteStorage.field_h[0] = SocialListEntry.decodeExtendedString(var2, -117);
                }
                var2 = PendingListRequest.readNamedRootFile(-121, "hs_mode_name,1");
                if (null != var2) {
                  DirectByteStorage.field_h[1] = SocialListEntry.decodeExtendedString(var2, param0 - 56);
                }
                var2 = PendingListRequest.readNamedRootFile(-118, "hs_mode_name,2");
                if (null != var2) {
                  DirectByteStorage.field_h[2] = SocialListEntry.decodeExtendedString(var2, -42);
                }
                var2 = PendingListRequest.readNamedRootFile(-102, "rating_mode_name,0");
                if (var2 != null) {
                  LongAndTextCredentials.field_g[0] = SocialListEntry.decodeExtendedString(var2, param0 - 127);
                }
                var2 = PendingListRequest.readNamedRootFile(-110, "rating_mode_name,1");
                if (var2 != null) {
                  LongAndTextCredentials.field_g[1] = SocialListEntry.decodeExtendedString(var2, -68);
                }
                var2 = PendingListRequest.readNamedRootFile(-92, "rating_mode_long_name,0");
                if (null != var2) {
                  NumericDateInputWidget.field_Z[0] = SocialListEntry.decodeExtendedString(var2, -79);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 79, "rating_mode_long_name,1");
                if (var2 != null) {
                  NumericDateInputWidget.field_Z[1] = SocialListEntry.decodeExtendedString(var2, -124);
                }
                var2 = PendingListRequest.readNamedRootFile(-77, "graphics_config_fixed_size");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -41);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 124, "graphics_config_resizable");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -44);
                }
                var2 = PendingListRequest.readNamedRootFile(-97, "graphics_config_fullscreen");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -80);
                }
                var2 = PendingListRequest.readNamedRootFile(-103, "graphics_config_done");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -55);
                }
                var2 = PendingListRequest.readNamedRootFile(-94, "graphics_config_apply");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -53);
                }
                var2 = PendingListRequest.readNamedRootFile(-102, "graphics_config_title");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 49);
                }
                var2 = PendingListRequest.readNamedRootFile(-78, "graphics_config_instruction");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -49);
                }
                var2 = PendingListRequest.readNamedRootFile(-88, "graphics_config_need_memory");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 ^ -99);
                }
                var2 = PendingListRequest.readNamedRootFile(-117, "pleasewait_dotdotdot");
                if (var2 != null) {
                  WidgetStyleLayer.field_m = SocialListEntry.decodeExtendedString(var2, param0 ^ -113);
                }
                var2 = PendingListRequest.readNamedRootFile(-86, "serviceunavailable");
                if (var2 != null) {
                  WidgetTheme.field_l = SocialListEntry.decodeExtendedString(var2, -107);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 80, "createtouse");
                if (null != var2) {
                  NodeHashTable.field_c = SocialListEntry.decodeExtendedString(var2, -128);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -84, "achievementsoffline");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, param0 - 80);
                }
                var2 = PendingListRequest.readNamedRootFile(-89, "warning");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -37);
                }
                var2 = PendingListRequest.readNamedRootFile(-103, "DEFAULT_PLAYER_NAME");
                if (null != var2) {
                  FontAndBrightnessHelpers.field_a = SocialListEntry.decodeExtendedString(var2, -111);
                }
                var2 = PendingListRequest.readNamedRootFile(-95, "mustlogin1");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -84);
                }
                var2 = PendingListRequest.readNamedRootFile(-117, "mustlogin2,1");
            }
            void runChunk3() throws java.lang.RuntimeException {
                if (null != var2) {
                  ReflectionCheckHelpers.field_b[1] = SocialListEntry.decodeExtendedString(var2, -77);
                }
                var2 = PendingListRequest.readNamedRootFile(-79, "mustlogin2,2");
                if (var2 != null) {
                  ReflectionCheckHelpers.field_b[2] = SocialListEntry.decodeExtendedString(var2, -41);
                }
                var2 = PendingListRequest.readNamedRootFile(-111, "mustlogin2,3");
                if (var2 != null) {
                  ReflectionCheckHelpers.field_b[3] = SocialListEntry.decodeExtendedString(var2, -81);
                }
                var2 = PendingListRequest.readNamedRootFile(-78, "mustlogin2,4");
                if (null != var2) {
                  ReflectionCheckHelpers.field_b[4] = SocialListEntry.decodeExtendedString(var2, -53);
                }
                var2 = PendingListRequest.readNamedRootFile(-125, "mustlogin2,5");
                if (null != var2) {
                  ReflectionCheckHelpers.field_b[5] = SocialListEntry.decodeExtendedString(var2, -75);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 124, "mustlogin2,6");
                if (null != var2) {
                  ReflectionCheckHelpers.field_b[6] = SocialListEntry.decodeExtendedString(var2, -117);
                }
                var2 = PendingListRequest.readNamedRootFile(-123, "mustlogin2,7");
                if (var2 != null) {
                  ReflectionCheckHelpers.field_b[7] = SocialListEntry.decodeExtendedString(var2, -108);
                }
                var2 = PendingListRequest.readNamedRootFile(-83, "mustlogin3,1");
                if (var2 != null) {
                  IndexedSpriteHelpers.field_b[1] = SocialListEntry.decodeExtendedString(var2, -57);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -122, "mustlogin3,2");
                if (var2 != null) {
                  IndexedSpriteHelpers.field_b[2] = SocialListEntry.decodeExtendedString(var2, IsaacCipher.bitXor(param0, -74));
                }
                var2 = PendingListRequest.readNamedRootFile(-78, "mustlogin3,3");
                if (var2 != null) {
                  IndexedSpriteHelpers.field_b[3] = SocialListEntry.decodeExtendedString(var2, -49);
                }
                var2 = PendingListRequest.readNamedRootFile(-100, "mustlogin3,4");
                if (var2 != null) {
                  IndexedSpriteHelpers.field_b[4] = SocialListEntry.decodeExtendedString(var2, param0 - 109);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 82, "mustlogin3,5");
                if (var2 != null) {
                  IndexedSpriteHelpers.field_b[5] = SocialListEntry.decodeExtendedString(var2, param0 - 63);
                }
                var2 = PendingListRequest.readNamedRootFile(-86, "mustlogin3,6");
                if (null != var2) {
                  IndexedSpriteHelpers.field_b[6] = SocialListEntry.decodeExtendedString(var2, IsaacCipher.bitXor(param0, -49));
                }
                var2 = PendingListRequest.readNamedRootFile(-107, "mustlogin3,7");
                if (var2 != null) {
                  IndexedSpriteHelpers.field_b[7] = SocialListEntry.decodeExtendedString(var2, -60);
                }
                var2 = PendingListRequest.readNamedRootFile(-76, "discard");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -61);
                }
                var2 = PendingListRequest.readNamedRootFile(-89, "mustlogin4,1");
                if (null != var2) {
                  PasswordValidator.field_x[1] = SocialListEntry.decodeExtendedString(var2, param0 - 82);
                }
                var2 = PendingListRequest.readNamedRootFile(-120, "mustlogin4,2");
                if (null != var2) {
                  PasswordValidator.field_x[2] = SocialListEntry.decodeExtendedString(var2, -121);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -98, "mustlogin4,3");
                if (var2 != null) {
                  PasswordValidator.field_x[3] = SocialListEntry.decodeExtendedString(var2, -45);
                }
                var2 = PendingListRequest.readNamedRootFile(-101, "mustlogin4,4");
                if (var2 != null) {
                  PasswordValidator.field_x[4] = SocialListEntry.decodeExtendedString(var2, IsaacCipher.bitXor(param0, -108));
                }
                var2 = PendingListRequest.readNamedRootFile(-82, "mustlogin4,5");
                if (null != var2) {
                  PasswordValidator.field_x[5] = SocialListEntry.decodeExtendedString(var2, -83);
                }
                var2 = PendingListRequest.readNamedRootFile(-117, "mustlogin4,6");
                if (null != var2) {
                  PasswordValidator.field_x[6] = SocialListEntry.decodeExtendedString(var2, -105);
                }
                var2 = PendingListRequest.readNamedRootFile(-115, "mustlogin4,7");
                if (var2 != null) {
                  PasswordValidator.field_x[7] = SocialListEntry.decodeExtendedString(var2, -98);
                }
                var2 = PendingListRequest.readNamedRootFile(-113, "mustlogin_notloggedin");
                if (var2 != null) {
                  SocialListEntry.decodeExtendedString(var2, -90);
                }
                var2 = PendingListRequest.readNamedRootFile(-112, "mustlogin_alternate,1");
                if (null != var2) {
                  TopLevelContainerHelpers.field_g[1] = SocialListEntry.decodeExtendedString(var2, -100);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 119, "mustlogin_alternate,2");
                if (null != var2) {
                  TopLevelContainerHelpers.field_g[2] = SocialListEntry.decodeExtendedString(var2, -77);
                }
                var2 = PendingListRequest.readNamedRootFile(-92, "mustlogin_alternate,3");
                if (var2 != null) {
                  TopLevelContainerHelpers.field_g[3] = SocialListEntry.decodeExtendedString(var2, -118);
                }
                var2 = PendingListRequest.readNamedRootFile(-126, "mustlogin_alternate,4");
                if (null != var2) {
                  TopLevelContainerHelpers.field_g[4] = SocialListEntry.decodeExtendedString(var2, IsaacCipher.bitXor(param0, -61));
                }
                var2 = PendingListRequest.readNamedRootFile(-119, "mustlogin_alternate,5");
                if (null != var2) {
                  TopLevelContainerHelpers.field_g[5] = SocialListEntry.decodeExtendedString(var2, IsaacCipher.bitXor(param0, -80));
                }
                var2 = PendingListRequest.readNamedRootFile(-88, "mustlogin_alternate,6");
                if (var2 != null) {
                  TopLevelContainerHelpers.field_g[6] = SocialListEntry.decodeExtendedString(var2, IsaacCipher.bitXor(param0, -84));
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -117, "mustlogin_alternate,7");
                if (var2 != null) {
                  TopLevelContainerHelpers.field_g[7] = SocialListEntry.decodeExtendedString(var2, -53);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -85, "subscription_cost_monthly,0");
                if (var2 != null) {
                  NameAvailabilityValidator.field_r[0] = SocialListEntry.decodeExtendedString(var2, -127);
                }
                var2 = PendingListRequest.readNamedRootFile(-107, "subscription_cost_monthly,1");
                if (var2 != null) {
                  NameAvailabilityValidator.field_r[1] = SocialListEntry.decodeExtendedString(var2, IsaacCipher.bitXor(param0, -83));
                }
                var2 = PendingListRequest.readNamedRootFile(-120, "subscription_cost_monthly,2");
                if (null != var2) {
                  NameAvailabilityValidator.field_r[2] = SocialListEntry.decodeExtendedString(var2, -44);
                }
                var2 = PendingListRequest.readNamedRootFile(-123, "subscription_cost_monthly,3");
                if (var2 != null) {
                  NameAvailabilityValidator.field_r[3] = SocialListEntry.decodeExtendedString(var2, -50);
                }
                var2 = PendingListRequest.readNamedRootFile(-75, "subscription_cost_monthly,4");
                if (var2 != null) {
                  NameAvailabilityValidator.field_r[4] = SocialListEntry.decodeExtendedString(var2, -89);
                }
                var2 = PendingListRequest.readNamedRootFile(-121, "subscription_cost_monthly,5");
                if (var2 != null) {
                  NameAvailabilityValidator.field_r[5] = SocialListEntry.decodeExtendedString(var2, IsaacCipher.bitXor(param0, -49));
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 112, "subscription_cost_monthly,6");
                if (null != var2) {
                  NameAvailabilityValidator.field_r[6] = SocialListEntry.decodeExtendedString(var2, -118);
                }
                var2 = PendingListRequest.readNamedRootFile(-94, "subscription_cost_monthly,7");
                if (var2 != null) {
                  NameAvailabilityValidator.field_r[7] = SocialListEntry.decodeExtendedString(var2, -97);
                }
                var2 = PendingListRequest.readNamedRootFile(-98, "subscription_cost_monthly,8");
                if (var2 != null) {
                  NameAvailabilityValidator.field_r[8] = SocialListEntry.decodeExtendedString(var2, -68);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 86, "subscription_cost_monthly,9");
                if (null != var2) {
                  NameAvailabilityValidator.field_r[9] = SocialListEntry.decodeExtendedString(var2, -88);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 ^ -125, "subscription_cost_monthly,10");
                if (var2 != null) {
                  NameAvailabilityValidator.field_r[10] = SocialListEntry.decodeExtendedString(var2, -65);
                }
                var2 = PendingListRequest.readNamedRootFile(param0 - 121, "subscription_cost_monthly,11");
                if (var2 != null) {
                  NameAvailabilityValidator.field_r[11] = SocialListEntry.decodeExtendedString(var2, -124);
                }
                var2 = PendingListRequest.readNamedRootFile(-121, "subscription_cost_monthly,12");
                if (null != var2) {
                  NameAvailabilityValidator.field_r[12] = SocialListEntry.decodeExtendedString(var2, IsaacCipher.bitXor(param0, -37));
                }
                var2 = PendingListRequest.readNamedRootFile(-85, "sentence_separator");
                if (null != var2) {
                  SocialListEntry.decodeExtendedString(var2, -72);
                }
                CachedArchiveSource.field_e = null;
            }
            void run() {
                var3 = TetraLink.field_J;
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
                  stackIn_2605_0 = (RuntimeException) (var2_ref);
                  stackIn_2605_1 = new StringBuilder().append("gi.A(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_2606_2 = "null";
                  } else {
                    stackIn_2606_2 = "{...}";
                  }
                  throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_2605_0), ((StringBuilder) (Object) stackIn_2605_1).append(stackIn_2606_2).append(')').toString());
                }
                if (var3 != 0) {
                  stackIn_2614_0 = (!GameApplet.field_l);
                  GameApplet.field_l = stackIn_2614_0;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    final static boolean isValidPlayerName(boolean param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_19_0 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0;
        var3 = TetraLink.field_J;
        try {
          if (!ViewportController.isValidDisplayName(true, param0, param1)) {
            return false;
          }
          if (param0) {
            InterfaceTextLoader.initializeSessionServices(14, 36, 67, 82, (PlatformTaskDispatcher) null, -10, (String) null, -2, 20);
          }
          var2_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param1.length() > var2_int)))) {
            stackOut_11_0 = AccountServerResult.isAllowedNameCharacter(3010, param1.charAt(var2_int));
            stackIn_19_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (var3 == 0) {
              if (!stackIn_12_0) {
                return false;
              }
              var2_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_19_0 = true;
          }
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("gi.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static void initializeSessionServices(int param0, int param1, int param2, int param3, PlatformTaskDispatcher param4, int param5, String param6, int param7, int param8) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          TwoColumnListPanel.field_Lb = param6;
          if (param2 != 1) {
            field_d = (IntrusiveDeque) null;
          }
          IntrusiveDeque.field_f = param3;
          LruTextureCache.field_l = param8;
          ModelMergeHelpers.field_g = param0;
          ArchiveProvider.field_d = param7;
          SocialListEntry.field_Nb = param5;
          LoadingProgressDialog.field_ab = param4;
          GraphicsSettings.field_f = param1;
          Renderable.field_e = (Js5Transport) ((Object) new SocketJs5Transport());
          FullscreenErrorDialog.field_X = new DiskCacheWorker(param4);
          CacheEntry.field_u = new Js5ArchiveManager(Renderable.field_e, FullscreenErrorDialog.field_X);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_8_0 = var9;
          stackIn_8_1 = new StringBuilder().append("gi.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_c = null;
          field_b = null;
          if (param0 != 14914) {
            InterfaceTextLoader.releaseStatics(-86);
          }
          field_a = null;
          field_d = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var1), "gi.C(" + param0 + ')');
        }
    }

    static {
        field_a = "Match by...";
        field_b = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_d = null;
    }
}
