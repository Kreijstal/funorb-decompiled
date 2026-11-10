/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TranslatedUiText {
    static int[] field_f;
    static int[] field_c;
    static String field_b;
    static double[] field_a;
    static double[] field_d;
    static PaletteBitmapFont field_e;

    public static void releaseStatics(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_b = null;
          field_f = null;
          if (param0 > -76) {
            field_a = (double[]) null;
          }
          field_a = null;
          field_d = null;
          field_c = null;
          field_e = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "ah.A(" + param0 + ')');
        }
    }

    final static void loadTranslatedStrings(boolean param0, ResourceArchive param1) {
        class TranslatedTextLoader {
            RuntimeException stackIn_2608_0;
            StringBuilder stackIn_2608_1;
            String stackIn_2609_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            boolean param0;
            ResourceArchive param1;
            boolean finished;
            TranslatedTextLoader(boolean initialParam0, ResourceArchive initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_2608_0 = null;
                this.stackIn_2608_1 = null;
                this.stackIn_2609_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
            }
            void loadLobbyChatAndGameOptionText() throws java.lang.RuntimeException {
                WidgetStyleLayer.field_b = param1;
                var2 = ChaseEvent.readTextResourceBytes("loginm3", (byte) 83);
                if (null != var2) {
                  EffectResistedEvent.field_l = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("loginm2", (byte) 83);
                if (var2 != null) {
                  CipherPacketBuffer.field_w = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("loginm1", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("idlemessage20min", (byte) 83);
                if (null != var2) {
                  LayoutCenterHelpers.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("error_js5crc", (byte) 83);
                if (var2 != null) {
                  IndexedSpriteState.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("error_js5io", (byte) 83);
                if (null != var2) {
                  MenuStyleHelpers.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("error_js5connect_full", (byte) 83);
                if (null != var2) {
                  IntHashIndex.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("error_js5connect", (byte) 83);
                if (var2 != null) {
                  PowerupBar.field_j = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("login_gameupdated", (byte) 83);
                if (var2 != null) {
                  MouseInputHandler.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_unable", (byte) 83);
                if (null != var2) {
                  SimUnit.field_Y = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_ineligible", (byte) 83);
                if (null != var2) {
                  MusicPatchPcmStream.field_p = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("usernameprompt", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("passwordprompt", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("andagainprompt", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("ticketing_read", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("ticketing_ignore", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("ticketing_oneunread", (byte) 83);
                if (var2 != null) {
                  PlayerProfile.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("ticketing_xunread", (byte) 83);
                if (null != var2) {
                  ResizableDialog.field_cb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("ticketing_gotowebsite", (byte) 83);
                if (null != var2) {
                  StateIconLabel.field_Nb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("ticketing_waitingformessages", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_on", (byte) 83);
                if (var2 != null) {
                  DisplayNameRequestHelpers.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_friends", (byte) 83);
                if (var2 != null) {
                  BufferedFile.field_p = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_off", (byte) 83);
                if (null != var2) {
                  SpriteDecodeGlobals.field_h = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_lobby", (byte) 83);
                if (null != var2) {
                  MessageDialog.field_vb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_public", (byte) 83);
                if (var2 != null) {
                  BrowserPageHelpers.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_ignore", (byte) 83);
                if (null != var2) {
                  LobbyDrawHelpers.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_tips", (byte) 83);
                if (null != var2) {
                  WidgetStyleLayer.field_n = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_game", (byte) 83);
                if (null != var2) {
                  RasterBuffer.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_private", (byte) 83);
                if (var2 != null) {
                  BitPackedArrayHelpers.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_x_entered_game", (byte) 83);
                if (null != var2) {
                  TextDecodeHelpers.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_x_joined_your_game", (byte) 83);
                if (var2 != null) {
                  Js5Transport.field_o = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_x_entered_other_game", (byte) 83);
                if (null != var2) {
                  SpriteHotspot.field_l = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_x_left_lobby", (byte) 83);
                if (var2 != null) {
                  NavigationGrid.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_x_lost_con", (byte) 83);
                if (var2 != null) {
                  TextInputValidator.field_l = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_x_cannot_join_full", (byte) 83);
                if (var2 != null) {
                  KeyboardStateHelpers.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_x_cannot_join_inprogress", (byte) 83);
                if (null != var2) {
                  SocialRequestHelpers.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_x_declined_invite", (byte) 83);
                if (null != var2) {
                  ScrollPane.field_Fb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_x_withdrew_request", (byte) 83);
                if (var2 != null) {
                  TabbedOverlayPanel.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_x_removed", (byte) 83);
                if (var2 != null) {
                  ClientTickHelpers.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_x_dropped_out", (byte) 83);
                if (var2 != null) {
                  Waypoint.field_i = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_entered_other_game", (byte) 83);
                if (var2 != null) {
                  CipherPacketBuffer.field_q = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_game_is_full", (byte) 83);
                if (null != var2) {
                  HumanView.field_ob = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_game_has_started", (byte) 83);
                if (!param0) {
                  finished = true; return;
                }
                if (null != var2) {
                  GameWorld.field_w = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_you_declined_invite", (byte) 83);
                if (null != var2) {
                  PropObject.field_I = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_invite_withdrawn", (byte) 83);
                if (var2 != null) {
                  GrowableIntList.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_request_declined", (byte) 83);
                if (null != var2) {
                  LoginPacketHelpers.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_request_withdrawn", (byte) 83);
                if (null != var2) {
                  SimEntity.field_I = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_all_players_have_left", (byte) 83);
                if (null != var2) {
                  UsernameSuggestionsPanel.field_K = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_lobby_name", (byte) 83);
                if (null != var2) {
                  GameScreen.field_r = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_lobby_rating", (byte) 83);
                if (var2 != null) {
                  MeltdownPuddleView.field_j = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_lobby_friend_add", (byte) 83);
                if (null != var2) {
                  TutorialAndMenuHelpers.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_lobby_friend_rm", (byte) 83);
                if (var2 != null) {
                  PlayModeChoiceDialog.field_I = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_lobby_name_add", (byte) 83);
                if (var2 != null) {
                  ProgramNoteUsage.field_i = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_lobby_name_rm", (byte) 83);
                if (var2 != null) {
                  TabbedOverlayPanel.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_lobby_location", (byte) 83);
                if (null != var2) {
                  PowerupBar.field_h = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_gamelist_all_games", (byte) 83);
                if (null != var2) {
                  AttackEvent.field_j = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_gamelist_status", (byte) 83);
                if (var2 != null) {
                  ColourPickerWidget.field_Nb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_gamelist_owner", (byte) 83);
                if (null != var2) {
                  GameWorld.field_p = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_gamelist_players", (byte) 83);
                if (null != var2) {
                  LobbyUpdateHandler.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_gamelist_avg_rating", (byte) 83);
                if (null != var2) {
                  StatefulTextPainter.field_t = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_gamelist_options", (byte) 83);
                if (null != var2) {
                  PortalEntryEvent.field_k = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_gamelist_elapsed_time", (byte) 83);
                if (var2 != null) {
                  PropObject.field_N = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_play_rated", (byte) 83);
                if (null != var2) {
                  ContextMenu.field_Gb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_create_unrated", (byte) 83);
                if (null != var2) {
                  TertiaryLinkNode.field_t = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_options", (byte) 83);
                if (null != var2) {
                  LobbyUiSetupHelpers.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_options_whocanjoin", (byte) 83);
                if (null != var2) {
                  ProgramNoteUsage.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_options_players", (byte) 83);
                if (null != var2) {
                  LevelFileEntry.field_n = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_options_dontmind", (byte) 83);
                if (var2 != null) {
                  VerticalScrollbar.field_Mb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_options_allow_spectate", (byte) 83);
                if (var2 != null) {
                  PowerupCommand.field_j = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_options_ratedgametype", (byte) 83);
                if (null != var2) {
                  SoundStopHelpers.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("yes", (byte) 83);
                if (null != var2) {
                  PowerupEvent.field_k = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("no", (byte) 83);
                if (var2 != null) {
                  ArchiveIndex.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_invite_players", (byte) 83);
                if (var2 != null) {
                  ObjectFactoryHelpers.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("close", (byte) 83);
                if (null != var2) {
                  IntHashIndex.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("add_x_to_friends", (byte) 83);
                if (var2 != null) {
                  IntrusiveDeque.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("add_x_to_ignore", (byte) 83);
                if (null != var2) {
                  IndexedSpriteState.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rm_x_from_friends", (byte) 83);
                if (var2 != null) {
                  ZombieDetonation.field_j = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rm_x_from_ignore", (byte) 83);
                if (var2 != null) {
                  PlayingSound.field_l = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("send_pm_to_x", (byte) 83);
                if (null != var2) {
                  UpgradeAccessHelpers.field_i = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("send_qc_to_x", (byte) 83);
                if (var2 != null) {
                  TextLayout.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("send_pm", (byte) 83);
                if (null != var2) {
                  MenuScreen.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("invite_accept_xs_game", (byte) 83);
                if (var2 != null) {
                  FontPaletteHelpers.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("invite_decline_xs_game", (byte) 83);
                if (var2 != null) {
                  ArchiveLoadStep.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("join_xs_game", (byte) 83);
                if (var2 != null) {
                  FeatureSupportHelpers.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("join_request_xs_game", (byte) 83);
                if (var2 != null) {
                  RandomHelpers.field_o = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("join_withdraw_request_xs_game", (byte) 83);
                if (var2 != null) {
                  IdleTickHelpers.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_gameopt_kick_x_from_this_game", (byte) 83);
                if (null != var2) {
                  MiasmaParticle.field_I = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_gameopt_withdraw_invite_to_x", (byte) 83);
                if (null != var2) {
                  ClockAndScreenHelpers.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_gameopt_accept_x_into_game", (byte) 83);
                if (null != var2) {
                  AchievementsScreen.field_p = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_gameopt_reject_x_from_game", (byte) 83);
                if (var2 != null) {
                  MusicPatchLoadHelpers.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_gameopt_invite_x_to_game", (byte) 83);
                if (null != var2) {
                  SimZombie.field_qb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("report_x_for_abuse", (byte) 83);
                if (null != var2) {
                  StateIconLabel.field_Jb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unable_to_send_message_password_a", (byte) 83);
                if (null != var2) {
                  TutorialAndMenuHelpers.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unable_to_send_message_password_b", (byte) 83);
                if (var2 != null) {
                  IsaacRandom.field_l = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_lobby_show_all", (byte) 83);
                if (null != var2) {
                  SoundEffectInstance.field_k = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_lobby_friends_only", (byte) 83);
                if (var2 != null) {
                  DetonationTarget.field_k = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_lobby_friends", (byte) 83);
                if (null != var2) {
                  LaboratoryScreen.field_o = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_lobby_hide", (byte) 83);
                if (null != var2) {
                  MiasmaPuff.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_game_show_all", (byte) 83);
                if (null != var2) {
                  WeightedLruCache.field_h = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_game_friends_only", (byte) 83);
                if (null != var2) {
                  DialWidgetPainter.field_n = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_game_friends", (byte) 83);
                if (null != var2) {
                  MiasmaPuff.field_r = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_game_hide", (byte) 83);
                if (null != var2) {
                  UpgradeAccessHelpers.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_pm_show_all", (byte) 83);
                if (null != var2) {
                  QuickChatCommandType.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_pm_friends_only", (byte) 83);
                if (null != var2) {
                  EffectResistedEvent.field_i = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_pm_friends", (byte) 83);
                if (var2 != null) {
                  SupportPageHelpers.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mu_chat_invisible_and_silent_mode", (byte) 83);
                if (null != var2) {
                  ArchiveLoadStep.field_n = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("you_have_been_removed_from_xs_game", (byte) 83);
                if (null != var2) {
                  ReflectionCheckRequest.field_h = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("your_rating_is_x", (byte) 83);
                if (var2 != null) {
                  QuickChatCategoryDefinition.field_v = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("you_are_on_x_server", (byte) 83);
                if (var2 != null) {
                  ProgramNoteUsage.field_m = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rated_game", (byte) 83);
                if (null != var2) {
                  WidgetStyleLayer.field_l = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unrated_game", (byte) 83);
                if (null != var2) {
                  RandomHelpers.field_m = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rated_game_tips", (byte) 83);
                if (var2 != null) {
                  GameScreen.field_K = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("searching_for_opponent_singular", (byte) 83);
                if (null != var2) {
                  MusicPatch.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("searching_for_opponents_plural", (byte) 83);
                if (var2 != null) {
                  KeyMapHelpers.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("find_opponent_singular", (byte) 83);
                if (var2 != null) {
                  DualLinkNode.field_n = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("find_opponents_plural", (byte) 83);
                if (null != var2) {
                  NameEntryPopup.field_Jb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rated_game_tips_setup_singular", (byte) 83);
                if (var2 != null) {
                  ImageProducerRasterBuffer.field_i = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rated_game_tips_setup_plural", (byte) 83);
                if (null != var2) {
                  InstructionsScreen.field_l = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("waiting_to_start_hint", (byte) 83);
                if (var2 != null) {
                  QuickChatCategoryDefinition.field_t = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("your_game", (byte) 83);
                if (null != var2) {
                  ClientException.field_l = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("game_full", (byte) 83);
                if (null != var2) {
                  ChatMessage.field_p = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("join_requests_one", (byte) 83);
                if (null != var2) {
                  PendingIntArrayRequest.field_k = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("join_requests_many", (byte) 83);
                if (null != var2) {
                  ValidationIconWidget.field_R = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("xs_game", (byte) 83);
                if (null != var2) {
                  GameEvent.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("waiting_for_x_to_start_game", (byte) 83);
                if (null != var2) {
                  TextLayout.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("game_options_changed", (byte) 83);
                if (null != var2) {
                  SimZombie.field_pb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("players_x_of_y", (byte) 83);
                if (null != var2) {
                  EffectAudioHelpers.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("message_lobby", (byte) 83);
                if (null != var2) {
                  SpriteHotspot.field_j = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("quickchat_lobby", (byte) 83);
                if (var2 != null) {
                  HotspotTextWidget.field_P = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("message_game", (byte) 83);
                if (var2 != null) {
                  CredentialKind.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("message_team", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("quickchat_game", (byte) 83);
                if (var2 != null) {
                  LobbySlideLayout.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("kick", (byte) 83);
                if (var2 != null) {
                  SoundCache.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("inviting_x", (byte) 83);
                if (var2 != null) {
                  FontPaletteHelpers.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("x_wants_to_join", (byte) 83);
                if (var2 != null) {
                  RankingEntry.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("accept", (byte) 83);
                if (null != var2) {
                  FadingDialog.field_J = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reject", (byte) 83);
                if (null != var2) {
                  LevelFileListHolder.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("invite", (byte) 83);
                if (var2 != null) {
                  LevelEncodingHelpers.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("status_concluded", (byte) 83);
                if (var2 != null) {
                  FontPaletteHelpers.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("status_spectate", (byte) 83);
                if (var2 != null) {
                  SocketJs5Transport.field_u = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("status_playing", (byte) 83);
                if (var2 != null) {
                  PlayerContextMenu.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("status_join", (byte) 83);
                if (var2 != null) {
                  ClientShellHelpers.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("status_private", (byte) 83);
                if (null != var2) {
                  LoginStartHelpers.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("status_full", (byte) 83);
                if (var2 != null) {
                  MeltdownPuddle.field_j = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("players_in_game", (byte) 83);
                if (null != var2) {
                  PowerupBar.field_k = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("you_are_invited_to_xs_game", (byte) 83);
                if (null != var2) {
                  SpriteDecodeGlobals.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("asking_to_join_xs_game", (byte) 83);
                if (var2 != null) {
                  ArchiveIndex.field_k = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("who_can_join", (byte) 83);
                if (null != var2) {
                  KeyMapHelpers.field_h = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("you_can_join", (byte) 83);
                if (null != var2) {
                  DirectByteStorage.field_j = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("you_can_ask_to_join", (byte) 83);
                if (var2 != null) {
                  RandomHelpers.field_i = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("you_cannot_join_in_progress", (byte) 83);
                if (null != var2) {
                  PasswordCheckHelpers.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("you_can_spectate", (byte) 83);
                if (null != var2) {
                  TextDecodeHelpers.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("you_can_not_spectate", (byte) 83);
                if (null != var2) {
                  GameScreen.field_E = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("spectate_xs_game", (byte) 83);
                if (var2 != null) {
                  SoundEffectInstance.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("hide_players_in_xs_game", (byte) 83);
                if (null != var2) {
                  GameApplet.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("show_players_in_xs_game", (byte) 83);
                if (var2 != null) {
                  FriendListHelpers.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("connecting_to_friend_server_twoline", (byte) 83);
                if (var2 != null) {
                  SingleChildWidget.field_D = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("loading", (byte) 83);
                if (var2 != null) {
                  SpriteDecodeGlobals.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("offline", (byte) 83);
                if (var2 != null) {
                  CredentialKind.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("multiconst_invite_only", (byte) 83);
                if (var2 != null) {
                  LobbyUiSetupHelpers.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("multiconst_clan", (byte) 83);
                if (var2 != null) {
                  ChatMessage.field_m = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("multiconst_friends", (byte) 83);
                if (null != var2) {
                  ResizableDialog.field_W = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("multiconst_similar_rating", (byte) 83);
                if (var2 != null) {
                  LobbyPlayer.field_Xb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("multiconst_open", (byte) 83);
                if (var2 != null) {
                  IntroScreen.field_s = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("no_options_available", (byte) 83);
                if (var2 != null) {
                  DialWidgetPainter.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reportabuse", (byte) 83);
                if (null != var2) {
                  SecondaryNodeDequeIterator.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("presstabtochat", (byte) 83);
                if (null != var2) {
                  FramePainter.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("pressf10toquickchat", (byte) 83);
                if (null != var2) {
                  GameScreen.field_v = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("dob_chatdisabled", (byte) 83);
                if (null != var2) {
                  ByteStorage.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("dob_enterforchat", (byte) 83);
                if (var2 != null) {
                  DualLinkNode.field_m = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("tab_hidechattemporarily", (byte) 83);
                if (null != var2) {
                  DialWidgetPainter.field_o = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("esc_cancelprivatemessage", (byte) 83);
                if (var2 != null) {
                  LobbyDrawHelpers.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("esc_cancelthisline", (byte) 83);
                if (var2 != null) {
                  WeightedLruCache.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("privatequickchat_from_x", (byte) 83);
                if (null != var2) {
                  PulseEffect.field_n = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("privatequickchat_to_x", (byte) 83);
                if (var2 != null) {
                  LobbySlideLayout.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("privatechat_blankarea_explanation", (byte) 83);
                if (var2 != null) {
                  LevelUpgradeHelpers.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("publicchat_unavailable_ratedgame", (byte) 83);
                if (null != var2) {
                  GlintButtonHelpers.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("privatechat_friend_offline", (byte) 83);
                if (null != var2) {
                  FrameCycleAnimation.field_k = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("privatechat_friend_notlisted", (byte) 83);
                if (null != var2) {
                  ProgressDialog.field_jb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("chatviewscrolledup", (byte) 83);
                if (null != var2) {
                  IntrusiveDequeCursor.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("thisisrunescapeclan", (byte) 83);
                if (null != var2) {
                  FramePainter.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("thisisrunescapeclan_notowner", (byte) 83);
                if (var2 != null) {
                  KeyMapHelpers.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("runescapeclan", (byte) 83);
                if (var2 != null) {
                  PowerupProgressCard.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rated_membersonly", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_membersonly", (byte) 83);
                if (var2 != null) {
                  ReportAbuseDialog.field_Ub = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_1moreratedgame", (byte) 83);
                if (null != var2) {
                  BrowserPageHelpers.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_moreratedgames", (byte) 83);
                if (var2 != null) {
                  DualLinkNodeHashTable.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_needrating", (byte) 83);
                if (var2 != null) {
                  LobbyPlayer.field_Rb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_unratedonly", (byte) 83);
                if (var2 != null) {
                  BirthDateEntryPanel.field_H = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_notunlocked", (byte) 83);
                if (null != var2) {
                  PopupMenuBuilder.field_L = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_cannotbecombined1", (byte) 83);
                if (var2 != null) {
                  WeightedLruCache.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_cannotbecombined2", (byte) 83);
                if (var2 != null) {
                  GameWorld.field_q = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_playernotmember", (byte) 83);
                if (null != var2) {
                  PortalEntryEvent.field_n = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_younotmember", (byte) 83);
                if (null != var2) {
                  ClickMarker.field_s = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_playerneedsrating", (byte) 83);
                if (var2 != null) {
                  SimEntity.field_y = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_youneedrating", (byte) 83);
                if (null != var2) {
                  RankingEntry.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_playerneedsratedgames", (byte) 83);
                if (null != var2) {
                  DialWidgetPainter.field_m = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_youneedratedgames", (byte) 83);
                if (var2 != null) {
                  CheckboxPainter.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_playerneeds1ratedgame", (byte) 83);
                if (null != var2) {
                  TerrainEffectZone.field_o = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_youneed1ratedgame", (byte) 83);
                if (var2 != null) {
                  UpgradeAccessHelpers.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_playerhasntunlocked", (byte) 83);
                if (null != var2) {
                  SocketJs5Transport.field_r = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_youhaventunlocked", (byte) 83);
                if (null != var2) {
                  MeshMaterial.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_trychanging1", (byte) 83);
                if (var2 != null) {
                  SimArmedHuman.field_Cb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_trychanging2", (byte) 83);
                if (var2 != null) {
                  RandomAccessCacheFile.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_needchanging1", (byte) 83);
                if (null != var2) {
                  PlayModeChoiceDialog.field_L = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_needchanging2", (byte) 83);
                if (var2 != null) {
                  MusicVoice.field_u = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_mightchange", (byte) 83);
                if (var2 != null) {
                  ScrollBar.field_Ob = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_playersdontqualify", (byte) 83);
                if (null != var2) {
                  ChatMessage.field_s = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_playersdontqualify_selectgametab", (byte) 83);
                if (var2 != null) {
                  FullscreenSupport.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_unselectedoptions", (byte) 83);
                if (null != var2) {
                  DiskCacheWorker.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_pleaseselectoption1", (byte) 83);
                if (var2 != null) {
                  MenuStyleHelpers.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_pleaseselectoption2", (byte) 83);
                if (null != var2) {
                  NetworkGameClient.field_n = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_badnumplayers", (byte) 83);
                if (var2 != null) {
                  LobbyUiSetupHelpers.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_inviteplayers_or_trychanging1", (byte) 83);
                if (var2 != null) {
                  LoginStartHelpers.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_inviteplayers_or_trychanging2", (byte) 83);
                if (var2 != null) {
                  ClickMarker.field_k = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_novalidcombos", (byte) 83);
                if (null != var2) {
                  FontPaletteHelpers.field_k = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameopt_pleasetrychanging", (byte) 83);
            }
            void loadReportAbuseAndAccountCreationText() throws java.lang.RuntimeException {
                if (var2 != null) {
                  ClientException.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("ra_title", (byte) 83);
                if (null != var2) {
                  KeyMapHelpers.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("ra_mutethisplayer", (byte) 83);
                if (null != var2) {
                  PhantomDecoy.field_I = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("ra_suggestmute", (byte) 83);
                if (null != var2) {
                  NameEntryPopup.field_Kb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("ra_intro", (byte) 83);
                if (null != var2) {
                  SettingsCookieHelpers.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("ra_intro_no_name", (byte) 83);
                if (null != var2) {
                  ArchiveProvider.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("ra_explanation", (byte) 83);
                if (null != var2) {
                  MeltdownPuddle.field_q = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rule_pillar_0", (byte) 83);
                if (null != var2) {
                  EmailLoginCredentials.field_q = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rule_0_0", (byte) 83);
                if (var2 != null) {
                  QuickChatMenu.field_Lb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rule_0_1", (byte) 83);
                if (var2 != null) {
                  DiskArchiveRequest.field_z = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rule_0_2", (byte) 83);
                if (null != var2) {
                  UpgradeAccessHelpers.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rule_0_3", (byte) 83);
                if (null != var2) {
                  ProgramNoteUsage.field_l = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rule_0_4", (byte) 83);
                if (null != var2) {
                  HuffmanCodec.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rule_0_5", (byte) 83);
                if (null != var2) {
                  RandomHelpers.field_h = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rule_pillar_1", (byte) 83);
                if (var2 != null) {
                  OptionsMenuScreen.field_p = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rule_1_0", (byte) 83);
                if (var2 != null) {
                  EmailLoginCredentials.field_n = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rule_1_1", (byte) 83);
                if (null != var2) {
                  EffectVolumeHelpers.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rule_1_2", (byte) 83);
                if (var2 != null) {
                  PortalEntryEvent.field_o = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rule_1_3", (byte) 83);
                if (var2 != null) {
                  DropTargetWidget.field_E = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rule_1_4", (byte) 83);
                if (var2 != null) {
                  GameSimulation.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rule_pillar_2", (byte) 83);
                if (var2 != null) {
                  SpriteHotspot.field_p = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rule_2_0", (byte) 83);
                if (var2 != null) {
                  MenuFrameHelpers.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rule_2_1", (byte) 83);
                if (var2 != null) {
                  ClickMarker.field_p = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rule_2_2", (byte) 83);
                if (null != var2) {
                  GameResultsScreen.field_D = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("createafreeaccount", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("cancel", (byte) 83);
                if (var2 != null) {
                  NoticeMenuHelpers.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("pleaselogintoplay", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("pleaselogin", (byte) 83);
                if (null != var2) {
                  MusicVoice.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("pleaselogin_member", (byte) 83);
                if (null != var2) {
                  BufferedSocket.field_o = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("invaliduserorpass", (byte) 83);
                if (var2 != null) {
                  NodeHashTable.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("pleasetryagain", (byte) 83);
                if (var2 != null) {
                  SettingsCookieHelpers.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("pleasereenterpass", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("playfreeversion", (byte) 83);
                if (null != var2) {
                  GlintButtonHelpers.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reloadgame", (byte) 83);
                if (var2 != null) {
                  PulseEffect.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("toserverlist", (byte) 83);
                if (null != var2) {
                  SimArmedHuman.field_zb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("tocustomersupport", (byte) 83);
                if (null != var2) {
                  MarkerSliderWidget.field_S = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("changedisplayname", (byte) 83);
                if (null != var2) {
                  RasterSnapshot.field_l = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("returntohomepage", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("justplay", (byte) 83);
                if (null != var2) {
                  DebouncedValidationProvider.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("justplay_excl", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("login", (byte) 83);
                if (null != var2) {
                  UiComponentNode.field_s = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("goback", (byte) 83);
                if (null != var2) {
                  ThreeSliceButtonPainter.field_v = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("otheroptions", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("proceed", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("connectingtoserver", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("pleasewait", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("logging_in", (byte) 83);
                if (null != var2) {
                  StatefulTextPainter.field_v = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reconnect", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("backtoerror", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("pleasecheckinternet", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("attemptingtoreconnect", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("connectionlost_reconnecting", (byte) 83);
                if (var2 != null) {
                  ArchiveAvailabilityHelpers.field_i = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("connectionlost_withreason", (byte) 83);
                if (var2 != null) {
                  UiComponent.field_Eb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("passwordverificationrequired", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("invalidpass", (byte) 83);
                if (null != var2) {
                  RasterStackHelpers.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("retry", (byte) 83);
                if (null != var2) {
                  LevelFileList.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("back", (byte) 83);
                if (null != var2) {
                  ContextMenu.field_Zb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("exitfullscreenmode", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("quittowebsite", (byte) 83);
                if (var2 != null) {
                  TextDecodeHelpers.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("connectionrestored", (byte) 83);
                if (null != var2) {
                  DualLinkDeque.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("warning_ifyouquit", (byte) 83);
                if (var2 != null) {
                  LevelFileEntry.field_p = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("warning_ifyouquitorleavepage", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("resubscribe_withoutlosing_fs", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("resubscribe_withoutlosing", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("customersupport_withoutlosing_fs", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("customersupport_withoutlosing", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("js5help_withoutlosing_fs", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("js5help_withoutlosing", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("checkinternet_withoutlosing_fs", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("checkinternet_withoutlosing", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_intro", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_sameaccounttip_unnamed", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("dateofbirthprompt", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("fetchingcountrylist", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("countryprompt", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("countrylisterror", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("theonlypersonalquestions", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_submittingdata", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("check", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_pleasechooseausername", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_usernameblurb", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("checkingavailability", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("checking", (byte) 83);
                if (var2 != null) {
                  SpriteHotspot.field_n = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_namealreadytaken", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_sameaccounttip_named", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_nosuggestions", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alternativelygoback", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_available", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_willnowshowtermsandconditions", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("fetchingterms", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("termserror", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_iagree", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_idisagree", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_pleasescrolldowntoaccept", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_linkaddress", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("openinpopupwindow", (byte) 83);
                if (var2 != null) {
                  TextLayout.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create", (byte) 83);
                if (null != var2) {
                  ClientProtocolStage.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_pleasechooseapassword", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_passwordblurb", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_nevergivepassword", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("creatingyouraccount", (byte) 83);
                if (null != var2) {
                  ZombieDrop.field_M = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_youmustaccept", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_passwordsdifferent", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_success", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("day", (byte) 83);
                if (null != var2) {
                  SettingsCookieHelpers.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("month", (byte) 83);
                if (var2 != null) {
                  KeyboardListenerHelpers.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("year", (byte) 83);
                if (var2 != null) {
                  CheckboxPainter.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("monthnames,0", (byte) 83);
                if (null != var2) {
                  MenuFrameHelpers.field_g[0] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("monthnames,1", (byte) 83);
                if (var2 != null) {
                  MenuFrameHelpers.field_g[1] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("monthnames,2", (byte) 83);
                if (null != var2) {
                  MenuFrameHelpers.field_g[2] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("monthnames,3", (byte) 83);
                if (var2 != null) {
                  MenuFrameHelpers.field_g[3] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("monthnames,4", (byte) 83);
                if (null != var2) {
                  MenuFrameHelpers.field_g[4] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("monthnames,5", (byte) 83);
                if (var2 != null) {
                  MenuFrameHelpers.field_g[5] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("monthnames,6", (byte) 83);
                if (var2 != null) {
                  MenuFrameHelpers.field_g[6] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("monthnames,7", (byte) 83);
                if (var2 != null) {
                  MenuFrameHelpers.field_g[7] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("monthnames,8", (byte) 83);
                if (var2 != null) {
                  MenuFrameHelpers.field_g[8] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("monthnames,9", (byte) 83);
                if (null != var2) {
                  MenuFrameHelpers.field_g[9] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("monthnames,10", (byte) 83);
                if (null != var2) {
                  MenuFrameHelpers.field_g[10] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("monthnames,11", (byte) 83);
                if (null != var2) {
                  MenuFrameHelpers.field_g[11] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_welcome", (byte) 83);
                if (null != var2) {
                  UnitView.field_H = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_u13_welcome", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_createanaccount", (byte) 83);
                if (null != var2) {
                  ChatPanelSetupHelpers.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_username", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_displayname", (byte) 83);
                if (null != var2) {
                  PasswordValidator.field_w = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_password", (byte) 83);
                if (null != var2) {
                  ButtonWidget.field_D = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_password_confirm", (byte) 83);
                if (var2 != null) {
                  MouseInputHandler.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_email", (byte) 83);
                if (var2 != null) {
                  InflaterDecompressor.field_i = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_email_confirm", (byte) 83);
                if (var2 != null) {
                  QuitPageHelpers.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_age", (byte) 83);
                if (var2 != null) {
                  SoundStopHelpers.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_u13_email", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_u13_email_confirm", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_dob", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_country", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alternatives_header", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alternatives_select", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_suggestions", (byte) 83);
                if (null != var2) {
                  CredentialKind.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_more_suggestions", (byte) 83);
                if (var2 != null) {
                  ResizableDialog.field_ab = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_select_alternative", (byte) 83);
                if (null != var2) {
                  MessageDialogContent.field_I = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_optin_news", (byte) 83);
                if (null != var2) {
                  BrowserPageHelpers.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_agreeterms", (byte) 83);
                if (null != var2) {
                  MarkerSliderPainter.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_u13terms", (byte) 83);
                if (null != var2) {
                  ArchiveProvider.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("login_username_email", (byte) 83);
                if (var2 != null) {
                  SimPortal.field_M = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("login_username", (byte) 83);
                if (var2 != null) {
                  ClickMarker.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("login_email", (byte) 83);
                if (null != var2) {
                  ReportAbuseDialog.field_Gb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("login_username_tooltip", (byte) 83);
                if (var2 != null) {
                  ArchiveLoadSequence.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("login_password_tooltip", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("login_login_tooltip", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("login_create_tooltip", (byte) 83);
                if (var2 != null) {
                  LoginForm.field_I = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("login_justplay_tooltip", (byte) 83);
                if (var2 != null) {
                  AwtEventPumpHelpers.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("login_back_tooltip", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("login_no_displayname", (byte) 83);
                if (null != var2) {
                  GrowableIntList.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_username_tooltip", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_username_hint", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_displayname_tooltip", (byte) 83);
                if (var2 != null) {
                  AccountTextGlobals.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_displayname_hint", (byte) 83);
                if (null != var2) {
                  MusicPatchLoadHelpers.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_password_tooltip", (byte) 83);
                if (null != var2) {
                  SpriteHotspot.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_password_hint", (byte) 83);
                if (null != var2) {
                  RankingEntry.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_password_confirm_tooltip", (byte) 83);
                if (var2 != null) {
                  ChatAndOptionHelpers.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_email_tooltip", (byte) 83);
                if (null != var2) {
                  AlignedIconLabel.field_Nb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_email_confirm_tooltip", (byte) 83);
                if (var2 != null) {
                  IsaacRandom.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_age_tooltip", (byte) 83);
                if (null != var2) {
                  SocketConnector.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_optin_news_tooltip", (byte) 83);
                if (var2 != null) {
                  ClientProtocolStage.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_u13_email_tooltip", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_u13_email_confirm_tooltip", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_dob_tooltip", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_country_tooltip", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_optin_tooltip", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_continue", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_username_unavailable", (byte) 83);
                if (var2 != null) {
                  SettingsCookieHelpers.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_username_available", (byte) 83);
                if (var2 != null) {
                  MusicPatchPcmStream.field_j = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alert_namelength", (byte) 83);
                if (var2 != null) {
                  DialWidgetPainter.field_q = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alert_namechars", (byte) 83);
                if (var2 != null) {
                  ClickMarkerParticle.field_i = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alert_nameleadingspace", (byte) 83);
                if (null != var2) {
                  IntrusiveDeque.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alert_doublespace", (byte) 83);
                if (null != var2) {
                  FrameCycleAnimation.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alert_passchars", (byte) 83);
                if (null != var2) {
                  AccountTextGlobals.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alert_passrepeated", (byte) 83);
                if (null != var2) {
                  LevelFileEntry.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alert_passlength", (byte) 83);
                if (var2 != null) {
                  PlayerContextMenu.field_k = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alert_passcontainsname", (byte) 83);
                if (null != var2) {
                  ScreenSizeGlobals.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alert_passcontainsemail", (byte) 83);
                if (null != var2) {
                  ThreeSliceButtonPainter.field_z = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alert_passcontainsname_partial", (byte) 83);
                if (null != var2) {
                  ScrollPane.field_Hb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alert_checkname", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alert_invalidemail", (byte) 83);
                if (null != var2) {
                  DefaultQuickChatContext.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alert_email_unavailable", (byte) 83);
                if (var2 != null) {
                  StrongCacheEntry.field_z = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alert_invaliddate", (byte) 83);
                if (var2 != null) {
                  MarkerSliderWidget.field_T = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alert_invalidage", (byte) 83);
                if (var2 != null) {
                  QuickChatCategoryDefinition.field_z = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alert_yearrange", (byte) 83);
                if (var2 != null) {
                  PasswordValidator.field_v = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_alert_mismatch", (byte) 83);
                if (var2 != null) {
                  AwtEventPumpHelpers.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_passwordvalid", (byte) 83);
                if (var2 != null) {
                  PopupMenuBuilder.field_y = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_emailvalid", (byte) 83);
                if (null != var2) {
                  LevelFileEntry.field_h = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("create_account_success", (byte) 83);
                if (null != var2) {
                  DualLinkNode.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("invalid_name", (byte) 83);
                if (var2 != null) {
                  PendingIntArrayRequest.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("cannot_add_yourself", (byte) 83);
                if (null != var2) {
                  ConditionalTextValue.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unable_to_add_friend", (byte) 83);
                if (null != var2) {
                  ProgressBarWidget.field_G = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unable_to_add_ignore", (byte) 83);
                if (null != var2) {
                  DialWidgetPainter.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unable_to_delete_friend", (byte) 83);
                if (null != var2) {
                  UiWidget.field_p = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unable_to_delete_ignore", (byte) 83);
                if (null != var2) {
                  SceneObject.field_A = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("friendlistfull", (byte) 83);
                if (var2 != null) {
                  HuffmanCodec.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("friendlistdupe", (byte) 83);
                if (null != var2) {
                  ReportDialogGlobals.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("friendnotfound", (byte) 83);
                if (var2 != null) {
                  SpriteHotspot.field_i = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("ignorelistfull", (byte) 83);
                if (var2 != null) {
                  IntrusiveDeque.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("ignorelistdupe", (byte) 83);
                if (var2 != null) {
                  BitPackedArrayHelpers.field_i = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("ignorenotfound", (byte) 83);
                if (var2 != null) {
                  MouseWheelInput.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("removeignorefirst", (byte) 83);
                if (null != var2) {
                  PowerupEvent.field_r = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("removefriendfirst", (byte) 83);
                if (null != var2) {
                  BitPackedArrayHelpers.field_h = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("enterfriend_add", (byte) 83);
                if (var2 != null) {
                  DialSelectorWidget.field_Z = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("enterfriend_del", (byte) 83);
                if (null != var2) {
                  AccountCreationForm.field_Q = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("enterignore_add", (byte) 83);
                if (null != var2) {
                  ArrayWidgetGroup.field_K = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("enterignore_del", (byte) 83);
                if (var2 != null) {
                  DebouncedValidationProvider.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("text_removed_from_game", (byte) 83);
                if (var2 != null) {
                  GameScreen.field_V = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("text_lobby_pleaselogin_free", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("opengl", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("sse", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("purejava", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("waitingfor_graphics", (byte) 83);
                if (var2 != null) {
                  GlintButtonHelpers.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("waitingfor_models", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("waitingfor_fonts", (byte) 83);
                if (var2 != null) {
                  DisplayMode.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("waitingfor_soundeffects", (byte) 83);
                if (var2 != null) {
                  PowerupBar.field_i = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("waitingfor_music", (byte) 83);
                if (var2 != null) {
                  PasswordTextPainter.field_A = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("waitingfor_instruments", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("waitingfor_levels", (byte) 83);
                if (var2 != null) {
                  SocialRequestHelpers.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("waitingfor_extradata", (byte) 83);
                if (null != var2) {
                  FramePainter.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("waitingfor_languages", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("waitingfor_textures", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("waitingfor_animations", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("loading_graphics", (byte) 83);
                if (null != var2) {
                  LayoutCenterHelpers.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("loading_models", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("loading_fonts", (byte) 83);
                if (null != var2) {
                  GlintButtonHelpers.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("loading_soundeffects", (byte) 83);
                if (null != var2) {
                  ArmedHumanView.field_tb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("loading_music", (byte) 83);
                if (var2 != null) {
                  SharedTransportGlobals.field_d = GameHud.decodeText(-2739, var2);
                }
            }
            void loadLoadingRatingsAndReconnectText() throws java.lang.RuntimeException {
                var2 = ChaseEvent.readTextResourceBytes("loading_instruments", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("loading_levels", (byte) 83);
                if (null != var2) {
                  SpriteAlphaBuffers.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("loading_extradata", (byte) 83);
                if (null != var2) {
                  StatusAndMeshHelpers.field_h = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("loading_languages", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("loading_textures", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("loading_animations", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unpacking_graphics", (byte) 83);
                if (var2 != null) {
                  LevelFileListHolder.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unpacking_models", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unpacking_soundeffects", (byte) 83);
                if (null != var2) {
                  PackedArrayHelpers.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unpacking_music", (byte) 83);
                if (var2 != null) {
                  SoundCache.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unpacking_levels", (byte) 83);
                if (null != var2) {
                  ClockAndScreenHelpers.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unpacking_languages", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unpacking_animations", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unpacking_toolkit", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("instructions", (byte) 83);
                if (var2 != null) {
                  ScoreUpdateEvent.field_l = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("tutorial", (byte) 83);
                if (var2 != null) {
                  ClickMarker.field_m = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("playtutorial", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("sound_colon", (byte) 83);
                if (var2 != null) {
                  ScrollPaneWithFooter.field_Fb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("music_colon", (byte) 83);
                if (var2 != null) {
                  DialogLayer.field_K = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("fullscreen", (byte) 83);
                if (var2 != null) {
                  ScrollPaneWithFooter.field_Lb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("screensize", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("highscores", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rankings", (byte) 83);
                if (null != var2) {
                  MusicPatchLoadHelpers.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("achievements", (byte) 83);
                if (null != var2) {
                  FightEvent.field_p = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("achievementsthisgame", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("achievementsthissession", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("watchintroduction", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("quit", (byte) 83);
                if (var2 != null) {
                  PendingIntArrayReply.field_i = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("login_createaccount", (byte) 83);
                if (var2 != null) {
                  PowerupEvent.field_n = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("tohighscores", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("returntomainmenu", (byte) 83);
                if (null != var2) {
                  SecondaryNodeDeque.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("returntopausemenu", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("returntooptionsmenu_notpaused", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mainmenu", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("pausemenu", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("optionsmenu_notpaused", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("menu", (byte) 83);
                if (null != var2) {
                  UiComponentNode.field_t = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("selectlevel", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("nextlevel", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("startgame", (byte) 83);
                if (null != var2) {
                  Waypoint.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("newgame", (byte) 83);
                if (var2 != null) {
                  CachedArchiveSource.field_C = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("resumegame", (byte) 83);
                if (var2 != null) {
                  DraggableWidget.field_K = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("resumetutorial", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("skip", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("skiptutorial", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("skipending", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("restartlevel", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("endtest", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("endgame", (byte) 83);
                if (null != var2) {
                  TextPopupHelpers.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("endtutorial", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("ok", (byte) 83);
                if (null != var2) {
                  SupportPageHelpers.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("on", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("off", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("previous", (byte) 83);
                if (null != var2) {
                  NetworkGameClient.field_r = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("prev", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("next", (byte) 83);
                if (var2 != null) {
                  LevelFileList.field_h = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_colon", (byte) 83);
                if (null != var2) {
                  FadingDialog.field_L = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("hotseatmultiplayer", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("entermultiplayerlobby", (byte) 83);
                if (null != var2) {
                  HuffmanCodec.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("singleplayergame", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("returntogame", (byte) 83);
                if (null != var2) {
                  ZombieDrop.field_T = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("endgameresign", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("offerdraw", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("canceldraw", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("acceptdraw", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("resign", (byte) 83);
                if (var2 != null) {
                  GameWorld.field_B = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("returntolobby", (byte) 83);
                if (var2 != null) {
                  CredentialKind.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("cont", (byte) 83);
                if (var2 != null) {
                  LoginDialog.field_xb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("continue_spectating", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("messages", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_fastest", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_medium", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_best", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_directx", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_opengl", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_java", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_quality_high", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_quality_low", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_mode", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_quality", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mode", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("quality", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("keys", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("objective", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("currentobjective", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("pressescforpausemenu", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("pressescforpausemenuortoskiptutorial", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("pressescforoptionsmenu_doesntpause", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("pressescforoptionsmenu_doesntpause_short", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("powerups", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("latestlevel_suffix", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unreachedlevel_name", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unreachedlevel_cannotplayreason", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unreachedlevel_cannotplayreason_shorter", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unreachedworld_cannotplayreason", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("memberslevel_name", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("memberslevel_cannotplayreason", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("membersworld_cannotplayreason", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unreachedlevel_createtip", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unreachedlevel_createtip_line1", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unreachedlevel_createtip_line2", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("unreachedlevel_logintip", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("memberslevel_logintip", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("displayname_none", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("levelxofy1", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("levelxofy2", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("levelxofy", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("ingame_level", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mouseoveranicon", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("notyetachieved", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("achieved", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("orbpoints", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("orbcoins", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("orbpoints_colon", (byte) 83);
                if (var2 != null) {
                  ZombieDetonation.field_q = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("orbcoins_colon", (byte) 83);
                if (var2 != null) {
                  RankingsRequest.field_n = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("achieved_colon_description", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("secretachievement", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("no_highscores", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("hs_name", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("hs_level", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("hs_fromlevel", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("hs_tolevel", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("hs_score", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("hs_end", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("ingame_score", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("score_colon", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_leavegame", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_offerrematch", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_offerrematch_unrated", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_acceptrematch", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_acceptrematch_unrated", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_cancelrematch", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_cancelrematch_unrated", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_rematchnewgame", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_rematchnewgame_unrated", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_x_wantstodraw", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_x_offersrematch", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_x_offersrematch_unrated", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_youofferrematch", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_youofferrematch_unrated", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_youofferdraw", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_youresigned", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_youresigned_rematch", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_x_hasresignedandleft", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_x_hasresigned_rematch", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_x_hasresigned", (byte) 83);
                if (null != var2) {
                  MoveOrderMarker.field_i = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_x_hasleft", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_x_haswon", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_youhavewon", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_gamedrawn", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_timeremaining", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_x_turn", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_yourturn", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("gameover", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_hidechat", (byte) 83);
                if (null != var2) {
                  SceneObject.field_x = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_showchat_nounread", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_showchat_unread1", (byte) 83);
                if (null != var2) {
                  TextValidationFailure.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mp_showchat_unread2", (byte) 83);
                if (null != var2) {
                  MiasmaPuff.field_q = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("click_to_quickchat", (byte) 83);
                if (null != var2) {
                  UiWidget.field_v = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("autorespond", (byte) 83);
                if (var2 != null) {
                  TertiaryLinkNode.field_u = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("quickchat_help", (byte) 83);
                if (null != var2) {
                  ProgressBarWidget.field_I = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("quickchat_help_title", (byte) 83);
                if (null != var2) {
                  DualLinkNode.field_j = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("quickchat_shortcut_help,0", (byte) 83);
                if (null != var2) {
                  ClickMarker.field_h[0] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("quickchat_shortcut_help,1", (byte) 83);
                if (null != var2) {
                  ClickMarker.field_h[1] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("quickchat_shortcut_help,2", (byte) 83);
                if (var2 != null) {
                  ClickMarker.field_h[2] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("quickchat_shortcut_help,3", (byte) 83);
                if (null != var2) {
                  ClickMarker.field_h[3] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("quickchat_shortcut_help,4", (byte) 83);
                if (null != var2) {
                  ClickMarker.field_h[4] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("quickchat_shortcut_help,5", (byte) 83);
                if (var2 != null) {
                  ClickMarker.field_h[5] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("quickchat_shortcut_keys,0", (byte) 83);
                if (null != var2) {
                  LobbyRequestHelpers.field_c[0] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("quickchat_shortcut_keys,1", (byte) 83);
                if (var2 != null) {
                  LobbyRequestHelpers.field_c[1] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("quickchat_shortcut_keys,2", (byte) 83);
                if (var2 != null) {
                  LobbyRequestHelpers.field_c[2] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("quickchat_shortcut_keys,3", (byte) 83);
                if (null != var2) {
                  LobbyRequestHelpers.field_c[3] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("quickchat_shortcut_keys,4", (byte) 83);
                if (var2 != null) {
                  LobbyRequestHelpers.field_c[4] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("quickchat_shortcut_keys,5", (byte) 83);
                if (var2 != null) {
                  LobbyRequestHelpers.field_c[5] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("keychar_the_character_under_questionmark", (byte) 83);
                if (var2 != null) {
                  ScorePopup.field_I = QuickChatCategoryDefinition.decodeExtendedByteChar(var2[0], -1);
                }
                var2 = ChaseEvent.readTextResourceBytes("rating_noratings", (byte) 83);
                if (var2 != null) {
                  GameKeyHandler.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rating_rating", (byte) 83);
                if (null != var2) {
                  LoginDialog.field_tb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rating_played", (byte) 83);
                if (var2 != null) {
                  FontPaletteHelpers.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rating_won", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rating_lost", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rating_drawn", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("benefits_fullscreen", (byte) 83);
                if (null != var2) {
                  SupportPageHelpers.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("benefits_noadverts", (byte) 83);
                if (null != var2) {
                  DateInputWidget.field_K = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("benefits_price", (byte) 83);
                if (var2 != null) {
                  HuffmanCodec.field_h = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("members_expansion_benefits,0", (byte) 83);
                if (null != var2) {
                  LoginCredentials.field_k[0] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("members_expansion_benefits,1", (byte) 83);
                if (var2 != null) {
                  LoginCredentials.field_k[1] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("members_expansion_benefits,2", (byte) 83);
                if (var2 != null) {
                  LoginCredentials.field_k[2] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("members_expansion_price_top", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("members_expansion_price_bottom", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reconnect_lost_seq,0", (byte) 83);
                if (null != var2) {
                  ColourPickerWidget.field_Ib[0] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reconnect_lost_seq,1", (byte) 83);
                if (var2 != null) {
                  ColourPickerWidget.field_Ib[1] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reconnect_lost_seq,2", (byte) 83);
                if (null != var2) {
                  ColourPickerWidget.field_Ib[2] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reconnect_lost_seq,3", (byte) 83);
                if (null != var2) {
                  ColourPickerWidget.field_Ib[3] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reconnect_lost", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reconnect_restored", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reconnect_please_check", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reconnect_wait", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reconnect_retry", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reconnect_resume", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reconnect_or", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reconnect_exitfs", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reconnect_exitfs_quit", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reconnect_quit", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reconnect_check_fs", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("reconnect_check_nonfs", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("fs_accept_beforeaccept", (byte) 83);
                if (var2 != null) {
                  AchievementsScreen.field_q = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("fs_button_accept", (byte) 83);
                if (null != var2) {
                  HudSpriteStore.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("fs_accept_afteraccept", (byte) 83);
                if (null != var2) {
                  QuitPageHelpers.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("fs_button_cancel", (byte) 83);
                if (null != var2) {
                  DefaultQuickChatContext.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("fs_accept_aftercancel", (byte) 83);
                if (null != var2) {
                  SoundEffectInstance.field_h = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("fs_accept_countdown_sing", (byte) 83);
                if (var2 != null) {
                  MusicPatchPcmStream.field_l = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("fs_accept_countdown_pl", (byte) 83);
                if (var2 != null) {
                  FullscreenSupport.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("fs_nonmember", (byte) 83);
                if (var2 != null) {
                  RankingEntry.field_e = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("fs_button_close", (byte) 83);
                if (null != var2) {
                  LoginCredentials.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("fs_button_members", (byte) 83);
                if (null != var2) {
                  ObjectFactoryHelpers.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("fs_unavailable", (byte) 83);
                if (null != var2) {
                  ArmedHumanView.field_sb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("fs_unavailable_try_signed_applet", (byte) 83);
                if (null != var2) {
                  NanoTickClock.field_j = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("fs_focus", (byte) 83);
                if (var2 != null) {
                  ValidatedTextInputWidget.field_cb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("fs_focus_or_resolution", (byte) 83);
                if (null != var2) {
                  UiTheme.field_r = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("fs_timeout", (byte) 83);
                if (var2 != null) {
                  CipherPacketBuffer.field_t = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("fs_button_tryagain", (byte) 83);
                if (var2 != null) {
                  LayoutCenterHelpers.field_d = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_ui_fs_countdown", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mb_caption_title", (byte) 83);
                if (var2 != null) {
                  AccountCreationDialog.field_Cb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mb_including_gamename", (byte) 83);
                if (var2 != null) {
                  DialogLayer.field_F = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mb_full_access_1", (byte) 83);
                if (null != var2) {
                  ByteStorage.field_b = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mb_full_access_2", (byte) 83);
                if (var2 != null) {
                  QuickChatCategoryDefinition.field_w = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mb_achievement_count_1", (byte) 83);
                if (var2 != null) {
                  LobbyUpdateHandler.field_c = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mb_achievement_count_2", (byte) 83);
                if (var2 != null) {
                  ScorePopup.field_G = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mb_exclusive_1", (byte) 83);
                if (var2 != null) {
                  ContextMenu.field_Yb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mb_exclusive_2", (byte) 83);
                if (var2 != null) {
                  ClickMarkerParticle.field_f = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("me_extra_benefits", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("hs_friend_tip", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("hs_friend_tip_multi", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("hs_mode_name,0", (byte) 83);
                if (var2 != null) {
                  UiComponent.field_C[0] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("hs_mode_name,1", (byte) 83);
                if (var2 != null) {
                  UiComponent.field_C[1] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("hs_mode_name,2", (byte) 83);
                if (var2 != null) {
                  UiComponent.field_C[2] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rating_mode_name,0", (byte) 83);
                if (var2 != null) {
                  QueuedListRequest.field_j[0] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rating_mode_name,1", (byte) 83);
            }
            void loadGraphicsLoginPromptAndSubscriptionText() throws java.lang.RuntimeException {
                if (var2 != null) {
                  QueuedListRequest.field_j[1] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rating_mode_long_name,0", (byte) 83);
                if (var2 != null) {
                  WidgetStyleLayer.field_c[0] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("rating_mode_long_name,1", (byte) 83);
                if (null != var2) {
                  WidgetStyleLayer.field_c[1] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_config_fixed_size", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_config_resizable", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_config_fullscreen", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_config_done", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_config_apply", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_config_title", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_config_instruction", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("graphics_config_need_memory", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("pleasewait_dotdotdot", (byte) 83);
                if (var2 != null) {
                  PortalEntryEvent.field_l = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("serviceunavailable", (byte) 83);
                if (var2 != null) {
                  PlayerLoadout.field_g = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("createtouse", (byte) 83);
                if (var2 != null) {
                  PhaseChangeEvent.field_j = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("achievementsoffline", (byte) 83);
                if (var2 != null) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("warning", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("DEFAULT_PLAYER_NAME", (byte) 83);
                if (var2 != null) {
                  ArmedHumanView.field_vb = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin1", (byte) 83);
                if (null != var2) {
                  MeshMaterial.field_a = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin2,1", (byte) 83);
                if (var2 != null) {
                  ViewFactoryHelpers.field_d[1] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin2,2", (byte) 83);
                if (null != var2) {
                  ViewFactoryHelpers.field_d[2] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin2,3", (byte) 83);
                if (null != var2) {
                  ViewFactoryHelpers.field_d[3] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin2,4", (byte) 83);
                if (var2 != null) {
                  ViewFactoryHelpers.field_d[4] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin2,5", (byte) 83);
                if (var2 != null) {
                  ViewFactoryHelpers.field_d[5] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin2,6", (byte) 83);
                if (null != var2) {
                  ViewFactoryHelpers.field_d[6] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin2,7", (byte) 83);
                if (null != var2) {
                  ViewFactoryHelpers.field_d[7] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin3,1", (byte) 83);
                if (var2 != null) {
                  PlayingSound.field_n[1] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin3,2", (byte) 83);
                if (var2 != null) {
                  PlayingSound.field_n[2] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin3,3", (byte) 83);
                if (null != var2) {
                  PlayingSound.field_n[3] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin3,4", (byte) 83);
                if (var2 != null) {
                  PlayingSound.field_n[4] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin3,5", (byte) 83);
                if (var2 != null) {
                  PlayingSound.field_n[5] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin3,6", (byte) 83);
                if (null != var2) {
                  PlayingSound.field_n[6] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin3,7", (byte) 83);
                if (null != var2) {
                  PlayingSound.field_n[7] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("discard", (byte) 83);
                if (var2 != null) {
                  FriendListHelpers.field_s = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin4,1", (byte) 83);
                if (null != var2) {
                  ByteStorage.field_f[1] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin4,2", (byte) 83);
                if (var2 != null) {
                  ByteStorage.field_f[2] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin4,3", (byte) 83);
                if (var2 != null) {
                  ByteStorage.field_f[3] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin4,4", (byte) 83);
                if (var2 != null) {
                  ByteStorage.field_f[4] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin4,5", (byte) 83);
                if (var2 != null) {
                  ByteStorage.field_f[5] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin4,6", (byte) 83);
                if (null != var2) {
                  ByteStorage.field_f[6] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin4,7", (byte) 83);
                if (var2 != null) {
                  ByteStorage.field_f[7] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin_notloggedin", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin_alternate,1", (byte) 83);
                if (var2 != null) {
                  ProgressBarWidget.field_P[1] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin_alternate,2", (byte) 83);
                if (var2 != null) {
                  ProgressBarWidget.field_P[2] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin_alternate,3", (byte) 83);
                if (null != var2) {
                  ProgressBarWidget.field_P[3] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin_alternate,4", (byte) 83);
                if (null != var2) {
                  ProgressBarWidget.field_P[4] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin_alternate,5", (byte) 83);
                if (null != var2) {
                  ProgressBarWidget.field_P[5] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin_alternate,6", (byte) 83);
                if (null != var2) {
                  ProgressBarWidget.field_P[6] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("mustlogin_alternate,7", (byte) 83);
                if (var2 != null) {
                  ProgressBarWidget.field_P[7] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("subscription_cost_monthly,0", (byte) 83);
                if (null != var2) {
                  DialogLayer.field_L[0] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("subscription_cost_monthly,1", (byte) 83);
                if (var2 != null) {
                  DialogLayer.field_L[1] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("subscription_cost_monthly,2", (byte) 83);
                if (null != var2) {
                  DialogLayer.field_L[2] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("subscription_cost_monthly,3", (byte) 83);
                if (var2 != null) {
                  DialogLayer.field_L[3] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("subscription_cost_monthly,4", (byte) 83);
                if (null != var2) {
                  DialogLayer.field_L[4] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("subscription_cost_monthly,5", (byte) 83);
                if (var2 != null) {
                  DialogLayer.field_L[5] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("subscription_cost_monthly,6", (byte) 83);
                if (var2 != null) {
                  DialogLayer.field_L[6] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("subscription_cost_monthly,7", (byte) 83);
                if (null != var2) {
                  DialogLayer.field_L[7] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("subscription_cost_monthly,8", (byte) 83);
                if (null != var2) {
                  DialogLayer.field_L[8] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("subscription_cost_monthly,9", (byte) 83);
                if (var2 != null) {
                  DialogLayer.field_L[9] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("subscription_cost_monthly,10", (byte) 83);
                if (null != var2) {
                  DialogLayer.field_L[10] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("subscription_cost_monthly,11", (byte) 83);
                if (var2 != null) {
                  DialogLayer.field_L[11] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("subscription_cost_monthly,12", (byte) 83);
                if (null != var2) {
                  DialogLayer.field_L[12] = GameHud.decodeText(-2739, var2);
                }
                var2 = ChaseEvent.readTextResourceBytes("sentence_separator", (byte) 83);
                if (null != var2) {
                  GameHud.decodeText(-2739, var2);
                }
                WidgetStyleLayer.field_b = null;
                finished = true; return;
            }
            void run() {
                try {
                  loadLobbyChatAndGameOptionText();
                  if (finished) return;
                  loadReportAbuseAndAccountCreationText();
                  if (finished) return;
                  loadLoadingRatingsAndReconnectText();
                  if (finished) return;
                  loadGraphicsLoginPromptAndSubscriptionText();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_2608_0 = (RuntimeException) (var2_ref);
                  stackIn_2608_1 = new StringBuilder().append("ah.C(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_2609_2 = "null";
                  } else {
                    stackIn_2609_2 = "{...}";
                  }
                  throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_2608_0), ((StringBuilder) (Object) stackIn_2608_1).append(stackIn_2609_2).append(')').toString());
                }
            }
        }
        TranslatedTextLoader decompiledBody = new TranslatedTextLoader(param0, param1);
        decompiledBody.run();
    }

    final static void showTipPage(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_24_0 = false;
        int stackIn_35_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_23_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var2_intLifetime1;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (DiskCacheWorker.field_b == 21 &&
            WeightedLruCache.field_g) {
            return;
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          TextValidationFailure.field_d = DiskCacheWorker.field_b;
          SimHuman.field_pb = 0;
          DiskCacheWorker.field_b = param1;
          fieldTemp$0 = SimHuman.field_pb;
          SimHuman.field_pb = SimHuman.field_pb + 1;
          ButtonWidget.field_I[fieldTemp$0] = 0;
          if (!(DiskCacheWorker.field_b >= 0) ||
            !(19 > DiskCacheWorker.field_b)) {
            if (DiskCacheWorker.field_b == -1) {
              stackIn_14_0 = 0;
            } else {
              stackIn_14_0 = LayoutCenterHelpers.field_g[DiskCacheWorker.field_b].length;
            }
            SimHuman.field_pb = stackIn_14_0;
            var2_int = 0;
            while (var2_int < SimHuman.field_pb) {
              ButtonWidget.field_I[var2_int] = var2_int;
              var2_int++;
              if (var4 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              decompiledFrameRemainder0 = (var4 != 0);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted0)) {
            var2_intLifetime1 = 0;
            var3 = 32;
            while (true) {
              if (38 >= var3) {
                stackOut_23_0 = EffectAudioHelpers.hasPowerupFlag(DiskCacheWorker.field_b, -20, var3);
                stackIn_35_0 = stackOut_23_0 ? 1 : 0;
                stackIn_24_0 = stackOut_23_0;
                if (var4 == 0) {
                  if (stackIn_24_0) {
                    var2_intLifetime1++;
                    if (FullscreenFocusCanvas.field_k.isResearchable(param0 + 213, var3)) {
                      fieldTemp$1 = SimHuman.field_pb;
                      SimHuman.field_pb = SimHuman.field_pb + 1;
                      ButtonWidget.field_I[fieldTemp$1] = var2_intLifetime1;
                    }
                  }
                  var3++;
                  continue;
                }
              } else {
                stackIn_35_0 = ~SimHuman.field_pb;
              }
              if (stackIn_35_0 >= ~LayoutCenterHelpers.field_g[DiskCacheWorker.field_b].length) {
                break;
              }
              SimHuman.field_pb = LayoutCenterHelpers.field_g[DiskCacheWorker.field_b].length;
              break;
            }
          }
          if (decompiledFrameCompleted0) {
            FadingDialog.setTutorialTipPage(-17306, 0);
          }
          if (param0 != -86) {
            TranslatedUiText.showTipPage((byte) 4, 55);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "ah.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        int var0 = 0;
        field_f = new int[16384];
        field_c = new int[]{90, 490, 830, 1170, 1510, 1970};
        field_b = "Go to Next Level!";
        field_a = new double[65536];
        field_d = new double[65536];
        for (var0 = 0; 65536 > var0; var0++) {
          field_d[var0] = Math.sin(3.141592653589793 * (double)var0 / 32768.0);
          field_a[var0] = Math.cos((double)var0 * 3.141592653589793 / 32768.0);
        }
    }
}
