/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TranslatedUiText {
    static Js5ArchiveManager field_m;
    static String field_k;
    static QuickChatDynamicCommand field_g;
    static String field_c;
    static int[] field_b;
    static String[] field_f;
    static String[] field_i;
    static boolean field_d;
    static boolean field_e;
    static int field_n;
    static String field_o;
    static int field_j;
    static int field_h;
    static byte[][][] field_l;
    static int field_a;

    final static QuickChatCategoryDefinition findRootQuickChatCategory(int obfuscationGuard) {
        int var1_int = 0;
        QuickChatCategoryDefinition var2 = null;
        QuickChatCategoryDefinition stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var1 = null;
        RuntimeException var1_ref = null;
        try {
          try {
            var1_int = 0;
            while (true) {
              var2 = DisplayNamePanel.field_N.getDefinition((byte) -55, var1_int);
              if (var2.rootMarker) {
                stackIn_5_0 = var2;
                return stackIn_5_0;
              }
              var1_int++;
            }
          } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
            if (obfuscationGuard != 2) {
              TranslatedUiText.resendRankingsRequests(94, (byte) 12);
            }
            stackIn_11_0 = null;
            return (QuickChatCategoryDefinition) (stackIn_11_0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref), "nk.A(" + obfuscationGuard + ')');
        }
    }

    final static void hideSocialNamePopup(int obfuscationGuard) {
        try {
          PasswordInputPainter.field_C = null;
          if (obfuscationGuard != -31384) {
            TranslatedUiText.releaseStatics(103);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "nk.F(" + obfuscationGuard + ')');
        }
    }

    final static void requestLoginTransition(String message, int resumeScreenId, byte obfuscationGuard) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          EmailAvailabilityValidator.field_s = ChatInputSupport.field_b;
          SocialListEntry.field_Ub = resumeScreenId;
          if (obfuscationGuard <= 74) {
            field_h = -97;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("nk.C(");
          if (message == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(resumeScreenId).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void loadLocalizedStrings(ResourceArchive archive, int obfuscationGuard) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_2626_0;
            StringBuilder stackIn_2626_1;
            String stackIn_2627_2;
            boolean stackIn_2635_0;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            ResourceArchive param0;
            int param1;
            boolean finished;
            $CfrPartitionedBody(ResourceArchive initialParam0, int initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_2626_0 = null;
                this.stackIn_2626_1 = null;
                this.stackIn_2627_2 = null;
                this.stackIn_2635_0 = false;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                EmailAvailabilityValidator.field_r = param0;
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 123, "loginm3");
                if (var2 != null) {
                  TabbedPane.loginm3 = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -99, "loginm2");
                if (null != var2) {
                  DialWidget.loginm2 = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 118, "loginm1");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 96, "idlemessage20min");
                if (var2 != null) {
                  IterableNodeHashTable.idlemessage20min = Cp1252DecodingSupport.decodeBytesToString(var2, -125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 95, "error_js5crc");
                if (null != var2) {
                  LoginRequiredScreen.errorJs5crc = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -41, "error_js5io");
                if (var2 != null) {
                  LocalGameSetupScreen.errorJs5io = Cp1252DecodingSupport.decodeBytesToString(var2, -71);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -109, "error_js5connect_full");
                if (null != var2) {
                  PackedColorSupport.errorJs5connectFull = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20942);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 97, "error_js5connect");
                if (var2 != null) {
                  FontPaletteSupport.errorJs5connect = Cp1252DecodingSupport.decodeBytesToString(var2, -68);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -55, "login_gameupdated");
                if (null != var2) {
                  GlowParticle.loginGameupdated = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -119, "create_unable");
                if (var2 != null) {
                  FadingDialog.createUnable = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21104);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 99, "create_ineligible");
                if (var2 != null) {
                  NodeHashTableIterator.createIneligible = Cp1252DecodingSupport.decodeBytesToString(var2, 14);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -59, "usernameprompt");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -77);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 106, "passwordprompt");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -34, "andagainprompt");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -11);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 126, "ticketing_read");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21023);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 117, "ticketing_ignore");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -80, "ticketing_oneunread");
                if (null != var2) {
                  DialRenderer.ticketingOneunread = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -53, "ticketing_xunread");
                if (null != var2) {
                  CollisionContact.ticketingXunread = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 97, "ticketing_gotowebsite");
                if (var2 != null) {
                  CacheEntry.ticketingGotowebsite = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -68, "ticketing_waitingformessages");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -59);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -79, "mu_chat_on");
                if (var2 != null) {
                  AccountCreationDialog.muChatOn = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -87, "mu_chat_friends");
                if (var2 != null) {
                  ProjectedLineSupport.muChatFriends = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21136);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 108, "mu_chat_off");
                if (var2 != null) {
                  KillerRules.muChatOff = Cp1252DecodingSupport.decodeBytesToString(var2, -20);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 95, "mu_chat_lobby");
                if (var2 != null) {
                  BirthDateValidator.muChatLobby = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20950);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -116, "mu_chat_public");
                if (var2 != null) {
                  SingleChildWidget.muChatPublic = Cp1252DecodingSupport.decodeBytesToString(var2, 10);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -73, "mu_chat_ignore");
                if (null != var2) {
                  BrowserUrlSupport.muChatIgnore = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 126, "mu_chat_tips");
                if (var2 != null) {
                  ArchiveBootstrapSupport.muChatTips = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -30, "mu_chat_game");
                if (null != var2) {
                  Camera.muChatGame = Cp1252DecodingSupport.decodeBytesToString(var2, -79);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -44, "mu_chat_private");
                if (null != var2) {
                  MidiPcmStream.muChatPrivate = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -110, "mu_x_entered_game");
                if (var2 != null) {
                  ChatInputSupport.muXEnteredGame = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21006);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -100, "mu_x_joined_your_game");
                if (var2 != null) {
                  CachedArchiveSource.muXJoinedYourGame = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 106, "mu_x_entered_other_game");
                if (var2 != null) {
                  MenuLabelSupport.muXEnteredOtherGame = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 121, "mu_x_left_lobby");
                if (null != var2) {
                  DisplayModeSupport.muXLeftLobby = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21054);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 100, "mu_x_lost_con");
                if (null != var2) {
                  ArchiveProvider.muXLostCon = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20888);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 125, "mu_x_cannot_join_full");
                if (null != var2) {
                  ViewportController.muXCannotJoinFull = Cp1252DecodingSupport.decodeBytesToString(var2, -109);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 118, "mu_x_cannot_join_inprogress");
                if (null != var2) {
                  ProxyConnectorSupport.muXCannotJoinInprogress = Cp1252DecodingSupport.decodeBytesToString(var2, -27);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -123, "mu_x_declined_invite");
                if (var2 != null) {
                  StrongCacheEntry.muXDeclinedInvite = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 94, "mu_x_withdrew_request");
                if (var2 != null) {
                  ThemeSelectScreen.muXWithdrewRequest = Cp1252DecodingSupport.decodeBytesToString(var2, -77);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -103, "mu_x_removed");
                if (null != var2) {
                  Under13NoticePanel.muXRemoved = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -33, "mu_x_dropped_out");
                if (var2 != null) {
                  SectorCacheStore.muXDroppedOut = Cp1252DecodingSupport.decodeBytesToString(var2, -96);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 100, "mu_entered_other_game");
                if (null != var2) {
                  DebugSliderInputSupport.muEnteredOtherGame = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 123, "mu_game_is_full");
                if (var2 != null) {
                  MouseHandler.muGameIsFull = Cp1252DecodingSupport.decodeBytesToString(var2, -56);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 106, "mu_game_has_started");
                if (var2 != null) {
                  RankingsProtocolSupport.muGameHasStarted = Cp1252DecodingSupport.decodeBytesToString(var2, -110);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 126, "mu_you_declined_invite");
                if (null != var2) {
                  EightBallRules.muYouDeclinedInvite = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 122, "mu_invite_withdrawn");
                if (null != var2) {
                  CachedArchiveSource.muInviteWithdrawn = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -123, "mu_request_declined");
                if (var2 != null) {
                  ViewportController.muRequestDeclined = Cp1252DecodingSupport.decodeBytesToString(var2, -31);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 108, "mu_request_withdrawn");
                if (null != var2) {
                  PlasmaBallSkin.muRequestWithdrawn = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21140);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -102, "mu_all_players_have_left");
                if (null != var2) {
                  PacketBuffer.muAllPlayersHaveLeft = Cp1252DecodingSupport.decodeBytesToString(var2, -58);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -77, "mu_lobby_name");
                if (null != var2) {
                  MenuScreenBase.muLobbyName = Cp1252DecodingSupport.decodeBytesToString(var2, -104);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -114, "mu_lobby_rating");
                if (null != var2) {
                  IntKeyLookup.muLobbyRating = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20892);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -117, "mu_lobby_friend_add");
                if (var2 != null) {
                  StateIconLabel.muLobbyFriendAdd = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 109, "mu_lobby_friend_rm");
                if (var2 != null) {
                  PacketBuffer.muLobbyFriendRm = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -81, "mu_lobby_name_add");
                if (null != var2) {
                  ScreenProjectionSupport.muLobbyNameAdd = Cp1252DecodingSupport.decodeBytesToString(var2, -63);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 98, "mu_lobby_name_rm");
                if (var2 != null) {
                  LookupRetrySupport.muLobbyNameRm = Cp1252DecodingSupport.decodeBytesToString(var2, -74);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -76, "mu_lobby_location");
                if (null != var2) {
                  LobbyPanelLayoutSupport.muLobbyLocation = Cp1252DecodingSupport.decodeBytesToString(var2, -41);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 121, "mu_gamelist_all_games");
                if (var2 != null) {
                  PlasmaBallSkin.muGamelistAllGames = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -48, "mu_gamelist_status");
                if (null != var2) {
                  IntKeyLookup.muGamelistStatus = Cp1252DecodingSupport.decodeBytesToString(var2, -77);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 96, "mu_gamelist_owner");
                if (var2 != null) {
                  ByteStorage.muGamelistOwner = Cp1252DecodingSupport.decodeBytesToString(var2, -29);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 94, "mu_gamelist_players");
                if (var2 != null) {
                  Cp1252DecodingSupport.muGamelistPlayers = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21140);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 115, "mu_gamelist_avg_rating");
                if (null != var2) {
                  FixedPointVectorSupport.muGamelistAvgRating = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 109, "mu_gamelist_options");
                if (var2 != null) {
                  LabeledChildWidget.muGamelistOptions = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -49, "mu_gamelist_elapsed_time");
                if (var2 != null) {
                  LoginMethod.muGamelistElapsedTime = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 121, "mu_play_rated");
                if (var2 != null) {
                  AccountMenuText.muPlayRated = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 117, "mu_create_unrated");
                if (var2 != null) {
                  ArchiveProvider.muCreateUnrated = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -95, "mu_options");
                if (var2 != null) {
                  ArchiveRequest.muOptions = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -123, "mu_options_whocanjoin");
                if (var2 != null) {
                  DelayedServerPacket.muOptionsWhocanjoin = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21119);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 108, "mu_options_players");
                if (null != var2) {
                  ArchiveAvailabilitySupport.muOptionsPlayers = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -85, "mu_options_dontmind");
                if (null != var2) {
                  AudioService.muOptionsDontmind = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 123, "mu_options_allow_spectate");
                if (null != var2) {
                  BitmapTextLayout.muOptionsAllowSpectate = Cp1252DecodingSupport.decodeBytesToString(var2, -18);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 112, "mu_options_ratedgametype");
                if (var2 != null) {
                  NameNormalizationSupport.muOptionsRatedgametype = Cp1252DecodingSupport.decodeBytesToString(var2, -50);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -103, "yes");
                if (null != var2) {
                  MeshSymmetrySupport.yes = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -78, "no");
                if (null != var2) {
                  ByteStorage.no = Cp1252DecodingSupport.decodeBytesToString(var2, -41);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 119, "mu_invite_players");
                if (var2 != null) {
                  LimitedRandomAccessFile.muInvitePlayers = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -71, "close");
                if (var2 != null) {
                  ChatInputSupport.close = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21104);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 113, "add_x_to_friends");
                if (var2 != null) {
                  QuickChatHelpDialog.addXToFriends = Cp1252DecodingSupport.decodeBytesToString(var2, -99);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 95, "add_x_to_ignore");
                if (null != var2) {
                  MenuScreenBase.addXToIgnore = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21087);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -70, "rm_x_from_friends");
                if (null != var2) {
                  FaceNormal.rmXFromFriends = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 98, "rm_x_from_ignore");
                if (var2 != null) {
                  AccountProtocolStage.rmXFromIgnore = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 125, "send_pm_to_x");
                if (var2 != null) {
                  NineSliceFrameSupport.sendPmToX = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -65, "send_qc_to_x");
                if (null != var2) {
                  TutorialController.sendQcToX = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 126, "send_pm");
                if (null != var2) {
                  RankingsProtocolSupport.sendPm = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 98, "invite_accept_xs_game");
                if (var2 != null) {
                  BallEvent.inviteAcceptXsGame = Cp1252DecodingSupport.decodeBytesToString(var2, -103);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 121, "invite_decline_xs_game");
                if (null != var2) {
                  QuickChatDynamicCommand.inviteDeclineXsGame = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21037);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -56, "join_xs_game");
                if (var2 != null) {
                  LongAndTextLoginPayload.joinXsGame = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 116, "join_request_xs_game");
                if (var2 != null) {
                  ShotEvent.joinRequestXsGame = Cp1252DecodingSupport.decodeBytesToString(var2, -4);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 127, "join_withdraw_request_xs_game");
                if (null != var2) {
                  MarkerSliderPainter.joinWithdrawRequestXsGame = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -75, "mu_gameopt_kick_x_from_this_game");
                if (var2 != null) {
                  ChatInputSupport.muGameoptKickXFromThisGame = Cp1252DecodingSupport.decodeBytesToString(var2, -9);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 125, "mu_gameopt_withdraw_invite_to_x");
                if (null != var2) {
                  MenuScreenBase.muGameoptWithdrawInviteToX = Cp1252DecodingSupport.decodeBytesToString(var2, -7);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 105, "mu_gameopt_accept_x_into_game");
                if (null != var2) {
                  UsernameSuggestionSupport.muGameoptAcceptXIntoGame = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -95, "mu_gameopt_reject_x_from_game");
                if (var2 != null) {
                  ProjectedVertex.muGameoptRejectXFromGame = Cp1252DecodingSupport.decodeBytesToString(var2, -53);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -29, "mu_gameopt_invite_x_to_game");
                if (var2 != null) {
                  IterableDualLinkDeque.muGameoptInviteXToGame = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21025);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -41, "report_x_for_abuse");
                if (var2 != null) {
                  NetworkGameClient.reportXForAbuse = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20951);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 126, "unable_to_send_message_password_a");
                if (var2 != null) {
                  QuickChatDynamicCommand.unableToSendMessagePasswordA = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -70, "unable_to_send_message_password_b");
                if (null != var2) {
                  DebugTuningSlider.unableToSendMessagePasswordB = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21097);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -78, "mu_chat_lobby_show_all");
                if (var2 != null) {
                  IntrusiveDeque.muChatLobbyShowAll = Cp1252DecodingSupport.decodeBytesToString(var2, -2);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 124, "mu_chat_lobby_friends_only");
                if (var2 != null) {
                  ProjectedLineSupport.muChatLobbyFriendsOnly = Cp1252DecodingSupport.decodeBytesToString(var2, -106);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -90, "mu_chat_lobby_friends");
                if (null != var2) {
                  CollisionContact.muChatLobbyFriends = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -114, "mu_chat_lobby_hide");
                if (var2 != null) {
                  Pool.muChatLobbyHide = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 20995);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -106, "mu_chat_game_show_all");
                if (var2 != null) {
                  IntegerRecordProtocolSupport.muChatGameShowAll = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -97, "mu_chat_game_friends_only");
                if (var2 != null) {
                  IntKeyLookup.muChatGameFriendsOnly = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -88, "mu_chat_game_friends");
                if (null != var2) {
                  RenderingInitializationSupport.muChatGameFriends = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21138);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 107, "mu_chat_game_hide");
                if (var2 != null) {
                  TextLayout.muChatGameHide = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20979);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -68, "mu_chat_pm_show_all");
                if (var2 != null) {
                  MusicPatchEnvelope.muChatPmShowAll = Cp1252DecodingSupport.decodeBytesToString(var2, -71);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -63, "mu_chat_pm_friends_only");
                if (null != var2) {
                  FreePlayRules.muChatPmFriendsOnly = Cp1252DecodingSupport.decodeBytesToString(var2, -13);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -68, "mu_chat_pm_friends");
                if (var2 != null) {
                  MeshSymmetrySupport.muChatPmFriends = Cp1252DecodingSupport.decodeBytesToString(var2, 2);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 103, "mu_chat_invisible_and_silent_mode");
                if (var2 != null) {
                  EmailAvailabilityValidator.muChatInvisibleAndSilentMode = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21104);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 95, "you_have_been_removed_from_xs_game");
                if (var2 != null) {
                  LoginEncryptionSupport.youHaveBeenRemovedFromXsGame = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 95, "your_rating_is_x");
                if (null != var2) {
                  RatingTextState.yourRatingIsX = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 107, "you_are_on_x_server");
                if (var2 != null) {
                  UiWidget.youAreOnXServer = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -80, "rated_game");
                if (null != var2) {
                  ScrollPane.ratedGame = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -73, "unrated_game");
                if (var2 != null) {
                  PackedColorSupport.unratedGame = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 117, "rated_game_tips");
                if (null != var2) {
                  CheckboxPainter.ratedGameTips = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -88, "searching_for_opponent_singular");
                if (var2 != null) {
                  BallEvent.searchingForOpponentSingular = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -121, "searching_for_opponents_plural");
                if (null != var2) {
                  Cp1252CharacterSupport.searchingForOpponentsPlural = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -93, "find_opponent_singular");
                if (null != var2) {
                  KeyHandler.findOpponentSingular = Cp1252DecodingSupport.decodeBytesToString(var2, -10);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 93, "find_opponents_plural");
                if (null != var2) {
                  TutorialController.findOpponentsPlural = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21069);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 105, "rated_game_tips_setup_singular");
                if (null != var2) {
                  TutorialStep.ratedGameTipsSetupSingular = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21139);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -42, "rated_game_tips_setup_plural");
                if (null != var2) {
                  LabeledChildWidget.ratedGameTipsSetupPlural = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 105, "waiting_to_start_hint");
                if (var2 != null) {
                  ChatPanelSupport.waitingToStartHint = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 95, "your_game");
                if (var2 != null) {
                  AccountDisplayNameSupport.yourGame = Cp1252DecodingSupport.decodeBytesToString(var2, -126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 103, "game_full");
                if (null != var2) {
                  ProjectedVertex.gameFull = Cp1252DecodingSupport.decodeBytesToString(var2, -116);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -33, "join_requests_one");
                if (null != var2) {
                  ProxyAuthenticationRequiredException.joinRequestsOne = Cp1252DecodingSupport.decodeBytesToString(var2, -56);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 114, "join_requests_many");
                if (var2 != null) {
                  TutorialController.joinRequestsMany = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21139);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 110, "xs_game");
                if (var2 != null) {
                  ChatInputSupport.xsGame = Cp1252DecodingSupport.decodeBytesToString(var2, 2);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -95, "waiting_for_x_to_start_game");
                if (var2 != null) {
                  PasswordValidator.waitingForXToStartGame = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21070);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 98, "game_options_changed");
                if (var2 != null) {
                  WireframeQuad.gameOptionsChanged = Cp1252DecodingSupport.decodeBytesToString(var2, -94);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -66, "players_x_of_y");
                if (null != var2) {
                  HotspotRectangle.playersXOfY = Cp1252DecodingSupport.decodeBytesToString(var2, 13);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -92, "message_lobby");
                if (null != var2) {
                  PauseMenuScreen.messageLobby = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20958);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -31, "quickchat_lobby");
                if (null != var2) {
                  IntLookupQuery.quickchatLobby = Cp1252DecodingSupport.decodeBytesToString(var2, -60);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -66, "message_game");
                if (null != var2) {
                  DialRenderer.messageGame = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -94, "message_team");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 7);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -96, "quickchat_game");
                if (null != var2) {
                  LoginRequiredScreen.quickchatGame = Cp1252DecodingSupport.decodeBytesToString(var2, -115);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -100, "kick");
                if (null != var2) {
                  WireframeQuad.kick = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 93, "inviting_x");
                if (null != var2) {
                  IntrusiveNode.invitingX = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21100);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -80, "x_wants_to_join");
                if (var2 != null) {
                  FullscreenDisplayMode.xWantsToJoin = Cp1252DecodingSupport.decodeBytesToString(var2, -61);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 93, "accept");
                if (null != var2) {
                  BrowserCookieSupport.accept = Cp1252DecodingSupport.decodeBytesToString(var2, 13);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -35, "reject");
                if (var2 != null) {
                  HotspotRectangle.reject = Cp1252DecodingSupport.decodeBytesToString(var2, -47);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -94, "invite");
                if (null != var2) {
                  PlayerContextMenu.invite = Cp1252DecodingSupport.decodeBytesToString(var2, -92);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -105, "status_concluded");
                if (null != var2) {
                  ChatMessage.statusConcluded = Cp1252DecodingSupport.decodeBytesToString(var2, -34);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -93, "status_spectate");
                if (null != var2) {
                  KillerRules.statusSpectate = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21138);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 127, "status_playing");
                if (null != var2) {
                  DiskArchiveRequest.statusPlaying = Cp1252DecodingSupport.decodeBytesToString(var2, -4);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 115, "status_join");
                if (null != var2) {
                  MidiPcmStream.statusJoin = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 123, "status_private");
                if (var2 != null) {
                  ThemeSelectScreen.statusPrivate = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21098);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 96, "status_full");
                if (var2 != null) {
                  Pocket.statusFull = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -78, "players_in_game");
                if (var2 != null) {
                  ResizableDialog.playersInGame = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 126, "you_are_invited_to_xs_game");
                if (var2 != null) {
                  AppletUrlSupport.youAreInvitedToXsGame = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 109, "asking_to_join_xs_game");
                if (null != var2) {
                  TextLayout.askingToJoinXsGame = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21017);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 111, "who_can_join");
                if (null != var2) {
                  SharedRateScaleSupport.whoCanJoin = Cp1252DecodingSupport.decodeBytesToString(var2, -18);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -123, "you_can_join");
                if (null != var2) {
                  DebouncedValidationProvider.youCanJoin = Cp1252DecodingSupport.decodeBytesToString(var2, -12);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 118, "you_can_ask_to_join");
                if (null != var2) {
                  LobbyPlayer.youCanAskToJoin = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -120, "you_cannot_join_in_progress");
                if (var2 != null) {
                  Cp1252DecodingSupport.youCannotJoinInProgress = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -126, "you_can_spectate");
                if (null != var2) {
                  OpacityWidget.youCanSpectate = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21076);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 95, "you_can_not_spectate");
                if (null != var2) {
                  MirroredSceneSupport.youCanNotSpectate = Cp1252DecodingSupport.decodeBytesToString(var2, 11);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 108, "spectate_xs_game");
                if (null != var2) {
                  PacketBuffer.spectateXsGame = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -100, "hide_players_in_xs_game");
                if (var2 != null) {
                  BirthDatePromptPanel.hidePlayersInXsGame = Cp1252DecodingSupport.decodeBytesToString(var2, -8);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 126, "show_players_in_xs_game");
                if (null != var2) {
                  LoginPayloadFactory.showPlayersInXsGame = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -56, "connecting_to_friend_server_twoline");
                if (var2 != null) {
                  CheckboxWidget.connectingToFriendServerTwoline = Cp1252DecodingSupport.decodeBytesToString(var2, -4);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -98, "loading");
                if (null != var2) {
                  UiComponentNode.loading = Cp1252DecodingSupport.decodeBytesToString(var2, -78);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 104, "offline");
                if (null != var2) {
                  ArchiveLoadStep.offline = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -41, "multiconst_invite_only");
                if (var2 != null) {
                  ArchiveAvailabilitySupport.multiconstInviteOnly = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21138);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -51, "multiconst_clan");
                if (null != var2) {
                  UsernameAvailabilityValidator.multiconstClan = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21139);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -60, "multiconst_friends");
                if (null != var2) {
                  DialogLayer.multiconstFriends = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21088);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 121, "multiconst_similar_rating");
                if (var2 != null) {
                  ChatReplacementSupport.multiconstSimilarRating = Cp1252DecodingSupport.decodeBytesToString(var2, 9);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -36, "multiconst_open");
                if (null != var2) {
                  CipherPacketBuffer.multiconstOpen = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -81, "no_options_available");
                if (var2 != null) {
                  SectorCacheStore.noOptionsAvailable = Cp1252DecodingSupport.decodeBytesToString(var2, 14);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -92, "reportabuse");
                if (null != var2) {
                  HuffmanCodec.reportabuse = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21003);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 110, "presstabtochat");
                if (null != var2) {
                  ModelTableScene.presstabtochat = Cp1252DecodingSupport.decodeBytesToString(var2, -73);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -47, "pressf10toquickchat");
                if (null != var2) {
                  PaletteFontLoader.pressf10toquickchat = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21140);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -30, "dob_chatdisabled");
                if (null != var2) {
                  WeightedLruCache.dobChatdisabled = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 116, "dob_enterforchat");
                if (var2 != null) {
                  WireframeQuad.dobEnterforchat = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21023);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 101, "tab_hidechattemporarily");
                if (null != var2) {
                  IntegerRecordProtocolSupport.tabHidechattemporarily = Cp1252DecodingSupport.decodeBytesToString(var2, -84);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 97, "esc_cancelprivatemessage");
                if (null != var2) {
                  IsaacCipher.escCancelprivatemessage = Cp1252DecodingSupport.decodeBytesToString(var2, -32);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 125, "esc_cancelthisline");
                if (null != var2) {
                  SlidingPanelSupport.escCancelthisline = Cp1252DecodingSupport.decodeBytesToString(var2, -1);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 119, "privatequickchat_from_x");
                if (var2 != null) {
                  UiComponent.privatequickchatFromX = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 127, "privatequickchat_to_x");
                if (var2 != null) {
                  SpriteSheetLoadSupport.privatequickchatToX = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20987);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -104, "privatechat_blankarea_explanation");
                if (null != var2) {
                  RankingsProtocolSupport.privatechatBlankareaExplanation = Cp1252DecodingSupport.decodeBytesToString(var2, -48);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 94, "publicchat_unavailable_ratedgame");
                if (null != var2) {
                  ProjectedLineSupport.publicchatUnavailableRatedgame = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20970);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 117, "privatechat_friend_offline");
                if (null != var2) {
                  IterableNodeHashTable.privatechatFriendOffline = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21023);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -51, "privatechat_friend_notlisted");
                if (null != var2) {
                  LookupRetrySupport.privatechatFriendNotlisted = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21136);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 95, "chatviewscrolledup");
                if (var2 != null) {
                  NineBallRules.chatviewscrolledup = Cp1252DecodingSupport.decodeBytesToString(var2, -34);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -69, "thisisrunescapeclan");
                if (null != var2) {
                  MusicCrossfadeStream.thisisrunescapeclan = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21084);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 114, "thisisrunescapeclan_notowner");
                if (var2 != null) {
                  NetworkGameClient.thisisrunescapeclanNotowner = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21139);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -53, "runescapeclan");
                if (var2 != null) {
                  ChatInputSupport.runescapeclan = Cp1252DecodingSupport.decodeBytesToString(var2, -55);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 105, "rated_membersonly");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20958);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 122, "gameopt_membersonly");
                if (var2 != null) {
                  ChatMessageLine.gameoptMembersonly = Cp1252DecodingSupport.decodeBytesToString(var2, -62);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 119, "gameopt_1moreratedgame");
                if (null != var2) {
                  TickClock.gameopt1moreratedgame = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21004);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 98, "gameopt_moreratedgames");
                if (var2 != null) {
                  PotEvent.gameoptMoreratedgames = Cp1252DecodingSupport.decodeBytesToString(var2, -59);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -86, "gameopt_needrating");
                if (null != var2) {
                  PasswordInputPainter.gameoptNeedrating = Cp1252DecodingSupport.decodeBytesToString(var2, -89);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -65, "gameopt_unratedonly");
                if (null != var2) {
                  CanvasInputSupport.gameoptUnratedonly = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21136);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -66, "gameopt_notunlocked");
                if (null != var2) {
                  GlowParticle.gameoptNotunlocked = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 105, "gameopt_cannotbecombined1");
                if (var2 != null) {
                  AgeValidator.gameoptCannotbecombined1 = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 94, "gameopt_cannotbecombined2");
                if (null != var2) {
                  SocketConnector.gameoptCannotbecombined2 = Cp1252DecodingSupport.decodeBytesToString(var2, -49);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 98, "gameopt_playernotmember");
                if (var2 != null) {
                  TransformRotationSupport.gameoptPlayernotmember = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21085);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -41, "gameopt_younotmember");
                if (var2 != null) {
                  AccountWelcomePanel.gameoptYounotmember = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -118, "gameopt_playerneedsrating");
                if (null != var2) {
                  QuickChatNavigationSupport.gameoptPlayerneedsrating = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -86, "gameopt_youneedrating");
                if (null != var2) {
                  WhirlpoolHasher.gameoptYouneedrating = Cp1252DecodingSupport.decodeBytesToString(var2, -93);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -45, "gameopt_playerneedsratedgames");
                if (var2 != null) {
                  PasswordInputPainter.gameoptPlayerneedsratedgames = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21138);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -29, "gameopt_youneedratedgames");
                if (null != var2) {
                  PolarObject.gameoptYouneedratedgames = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -87, "gameopt_playerneeds1ratedgame");
                if (null != var2) {
                  Atan2Support.gameoptPlayerneeds1ratedgame = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 20993);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -119, "gameopt_youneed1ratedgame");
                if (null != var2) {
                  AccountDisplayNameSupport.gameoptYouneed1ratedgame = Cp1252DecodingSupport.decodeBytesToString(var2, -61);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -32, "gameopt_playerhasntunlocked");
                if (null != var2) {
                  QuaternionRotationSupport.gameoptPlayerhasntunlocked = Cp1252DecodingSupport.decodeBytesToString(var2, -41);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -106, "gameopt_youhaventunlocked");
                if (var2 != null) {
                  Pocket.gameoptYouhaventunlocked = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 105, "gameopt_trychanging1");
                if (null != var2) {
                  ProxyConnectorSupport.gameoptTrychanging1 = Cp1252DecodingSupport.decodeBytesToString(var2, -37);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 94, "gameopt_trychanging2");
                if (var2 != null) {
                  Quaternion.gameoptTrychanging2 = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20890);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -116, "gameopt_needchanging1");
                if (null != var2) {
                  QuickChatCategoryDefinition.gameoptNeedchanging1 = Cp1252DecodingSupport.decodeBytesToString(var2, -97);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -43, "gameopt_needchanging2");
                if (null != var2) {
                  LookupRetrySupport.gameoptNeedchanging2 = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 116, "gameopt_mightchange");
                if (var2 != null) {
                  LoginTextValue.gameoptMightchange = Cp1252DecodingSupport.decodeBytesToString(var2, -47);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -102, "gameopt_playersdontqualify");
                if (var2 != null) {
                  QuickChatHelpDialog.gameoptPlayersdontqualify = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20919);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -108, "gameopt_playersdontqualify_selectgametab");
                if (var2 != null) {
                  PacketDiagnosticsSupport.gameoptPlayersdontqualifySelectgametab = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20885);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -73, "gameopt_unselectedoptions");
                if (null != var2) {
                  VertexNormal.gameoptUnselectedoptions = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -123, "gameopt_pleaseselectoption1");
                if (null != var2) {
                  ArrayWidgetGroup.gameoptPleaseselectoption1 = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 116, "gameopt_pleaseselectoption2");
                if (null != var2) {
                  SingleChildWidget.gameoptPleaseselectoption2 = Cp1252DecodingSupport.decodeBytesToString(var2, -96);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 99, "gameopt_badnumplayers");
                if (var2 != null) {
                  NameEntryPopup.gameoptBadnumplayers = Cp1252DecodingSupport.decodeBytesToString(var2, -100);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 124, "gameopt_inviteplayers_or_trychanging1");
                if (null != var2) {
                  EmailAvailabilityValidator.gameoptInviteplayersOrTrychanging1 = Cp1252DecodingSupport.decodeBytesToString(var2, -53);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -92, "gameopt_inviteplayers_or_trychanging2");
                if (var2 != null) {
                  ArchiveAvailabilitySupport.gameoptInviteplayersOrTrychanging2 = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21097);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -98, "gameopt_novalidcombos");
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (null != var2) {
                  LoginResponse.field_a = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21098);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 93, "gameopt_pleasetrychanging");
                if (null != var2) {
                  RatingTextState.gameoptPleasetrychanging = Cp1252DecodingSupport.decodeBytesToString(var2, -116);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 116, "ra_title");
                if (var2 != null) {
                  GzipDecoder.raTitle = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -71, "ra_mutethisplayer");
                if (var2 != null) {
                  DialWidget.raMutethisplayer = Cp1252DecodingSupport.decodeBytesToString(var2, -23);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 122, "ra_suggestmute");
                if (null != var2) {
                  AccountStateQuery.raSuggestmute = Cp1252DecodingSupport.decodeBytesToString(var2, -24);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 117, "ra_intro");
                if (null != var2) {
                  TransformRotationSupport.raIntro = Cp1252DecodingSupport.decodeBytesToString(var2, -6);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -85, "ra_intro_no_name");
                if (null != var2) {
                  ChatInputSupport.raIntroNoName = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21097);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 125, "ra_explanation");
                if (var2 != null) {
                  Ball.raExplanation = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21104);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -83, "rule_pillar_0");
                if (var2 != null) {
                  ShotRecord.rulePillar0 = Cp1252DecodingSupport.decodeBytesToString(var2, -5);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -105, "rule_0_0");
                if (null != var2) {
                  DateInputWidget.rule00 = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 111, "rule_0_1");
                if (var2 != null) {
                  ArchiveAvailabilitySupport.rule01 = Cp1252DecodingSupport.decodeBytesToString(var2, -127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -43, "rule_0_2");
                if (var2 != null) {
                  UiComponentNode.rule02 = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 115, "rule_0_3");
                if (var2 != null) {
                  CheckboxWidget.rule03 = Cp1252DecodingSupport.decodeBytesToString(var2, -23);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 98, "rule_0_4");
                if (var2 != null) {
                  Atan2Support.rule04 = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 107, "rule_0_5");
                if (var2 != null) {
                  PlayingSound.rule05 = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 108, "rule_pillar_1");
                if (var2 != null) {
                  HotspotRectangle.rulePillar1 = Cp1252DecodingSupport.decodeBytesToString(var2, -37);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -39, "rule_1_0");
                if (null != var2) {
                  MouseHandler.rule10 = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21098);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 98, "rule_1_1");
                if (var2 != null) {
                  NanoTickClock.rule11 = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21137);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -67, "rule_1_2");
                if (null != var2) {
                  ContextMenu.rule12 = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -108, "rule_1_3");
                if (null != var2) {
                  Under13NoticePanel.rule13 = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 110, "rule_1_4");
                if (var2 != null) {
                  ModelInstance.rule14 = Cp1252DecodingSupport.decodeBytesToString(var2, -56);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -75, "rule_pillar_2");
                if (var2 != null) {
                  MembershipBenefitsScreen.rulePillar2 = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -54, "rule_2_0");
                if (null != var2) {
                  NineSliceFrame.rule20 = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -93, "rule_2_1");
                if (null != var2) {
                  BeveledFrameSpriteFactory.rule21 = Cp1252DecodingSupport.decodeBytesToString(var2, -126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 115, "rule_2_2");
                if (null != var2) {
                  LoginResponse.rule22 = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 125, "createafreeaccount");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -46);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 99, "cancel");
                if (null != var2) {
                  OptionsScreen.cancel = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21098);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 119, "pleaselogintoplay");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -61);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -30, "pleaselogin");
                if (null != var2) {
                  VertexProjectionSupport.pleaselogin = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20910);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 108, "pleaselogin_member");
                if (null != var2) {
                  AppletUrlSupport.pleaseloginMember = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21138);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 114, "invaliduserorpass");
                if (var2 != null) {
                  HighScoreRequest.invaliduserorpass = Cp1252DecodingSupport.decodeBytesToString(var2, -108);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 107, "pleasetryagain");
                if (null != var2) {
                  BufferedFile.pleasetryagain = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 97, "pleasereenterpass");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20929);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 110, "playfreeversion");
                if (null != var2) {
                  StatefulTextPainter.playfreeversion = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 103, "reloadgame");
                if (null != var2) {
                  NodeHashTableIterator.reloadgame = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -95, "toserverlist");
                if (null != var2) {
                  UiComponentNode.toserverlist = Cp1252DecodingSupport.decodeBytesToString(var2, -84);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 97, "tocustomersupport");
                if (var2 != null) {
                  ChoiceButtonSupport.tocustomersupport = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -44, "changedisplayname");
                if (null != var2) {
                  StatefulTextPainter.changedisplayname = Cp1252DecodingSupport.decodeBytesToString(var2, -40);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 94, "returntohomepage");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -109, "justplay");
                if (var2 != null) {
                  MultiHandleSliderWidget.justplay = Cp1252DecodingSupport.decodeBytesToString(var2, 8);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 109, "justplay_excl");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 101, "login");
                if (null != var2) {
                  CollisionContact.login = Cp1252DecodingSupport.decodeBytesToString(var2, 1);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 114, "goback");
                if (var2 != null) {
                  ValidationIconWidget.goback = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 125, "otheroptions");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 114, "proceed");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -106);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -86, "connectingtoserver");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20992);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -38, "pleasewait");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 3);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -49, "logging_in");
                if (var2 != null) {
                  DebouncedValidationProvider.loggingIn = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 116, "reconnect");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -81);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -28, "backtoerror");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 101, "pleasecheckinternet");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -108);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 115, "attemptingtoreconnect");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -60);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 118, "connectionlost_reconnecting");
                if (var2 != null) {
                  IntegerSyntaxSupport.connectionlostReconnecting = Cp1252DecodingSupport.decodeBytesToString(var2, -25);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -114, "connectionlost_withreason");
                if (var2 != null) {
                  DialogLayer.connectionlostWithreason = Cp1252DecodingSupport.decodeBytesToString(var2, -65);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -86, "passwordverificationrequired");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -128);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -93, "invalidpass");
                if (var2 != null) {
                  ThreeSliceButtonPainter.invalidpass = Cp1252DecodingSupport.decodeBytesToString(var2, -23);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 123, "retry");
                if (null != var2) {
                  QuickChatPhraseDefinition.retry = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 103, "back");
                if (null != var2) {
                  CueStick.back = Cp1252DecodingSupport.decodeBytesToString(var2, -80);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -65, "exitfullscreenmode");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -125, "quittowebsite");
                if (null != var2) {
                  FullscreenDisplayMode.quittowebsite = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21140);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 126, "connectionrestored");
                if (null != var2) {
                  ScreenProjectionSupport.connectionrestored = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21136);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 107, "warning_ifyouquit");
                if (var2 != null) {
                  StateIconLabel.warningIfyouquit = Cp1252DecodingSupport.decodeBytesToString(var2, 13);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 122, "warning_ifyouquitorleavepage");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -109, "resubscribe_withoutlosing_fs");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -50, "resubscribe_withoutlosing");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 106, "customersupport_withoutlosing_fs");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -72, "customersupport_withoutlosing");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -80, "js5help_withoutlosing_fs");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21138);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 112, "js5help_withoutlosing");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21100);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -88, "checkinternet_withoutlosing_fs");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -48, "checkinternet_withoutlosing");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -78);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -81, "create_intro");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20986);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 104, "create_sameaccounttip_unnamed");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 112, "dateofbirthprompt");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 121, "fetchingcountrylist");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 127, "countryprompt");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -122, "countrylisterror");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21043);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 119, "theonlypersonalquestions");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -26);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 110, "create_submittingdata");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 115, "check");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -76, "create_pleasechooseausername");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 116, "create_usernameblurb");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -85);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -110, "checkingavailability");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -6);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 104, "checking");
                if (var2 != null) {
                  IntegerRecordSubmission.checking = Cp1252DecodingSupport.decodeBytesToString(var2, 10);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 96, "create_namealreadytaken");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                if (param1 != -21013) {
                  TranslatedUiText.loadLocalizedStrings((ResourceArchive) null, -20);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -70, "create_sameaccounttip_named");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 125, "create_nosuggestions");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -97);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -103, "create_alternativelygoback");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 105, "create_available");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21107);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -41, "create_willnowshowtermsandconditions");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -26);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 105, "fetchingterms");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21140);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -79, "termserror");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20895);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -34, "create_iagree");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -31, "create_idisagree");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -94, "create_pleasescrolldowntoaccept");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -127, "create_linkaddress");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -89);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 123, "openinpopupwindow");
                if (var2 != null) {
                  DelegatingCanvas.openinpopupwindow = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21138);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -82, "create");
                if (var2 != null) {
                  SpriteState.create = Cp1252DecodingSupport.decodeBytesToString(var2, -59);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 122, "create_pleasechooseapassword");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 107, "create_passwordblurb");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 93, "create_nevergivepassword");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -57);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -110, "creatingyouraccount");
                if (var2 != null) {
                  DualLinkNodeHashTable.creatingyouraccount = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21097);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -61, "create_youmustaccept");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21140);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 109, "create_passwordsdifferent");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 120, "create_success");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20913);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -108, "day");
                if (null != var2) {
                  TextureCache.day = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21104);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 102, "month");
                if (var2 != null) {
                  ShotPreviewState.month = Cp1252DecodingSupport.decodeBytesToString(var2, -121);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -85, "year");
                if (var2 != null) {
                  IndexedSpriteState.year = Cp1252DecodingSupport.decodeBytesToString(var2, -21);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 113, "monthnames,0");
                if (null != var2) {
                  TikiTableScene.monthnames[0] = Cp1252DecodingSupport.decodeBytesToString(var2, -43);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -85, "monthnames,1");
                if (null != var2) {
                  TikiTableScene.monthnames[1] = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21139);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 93, "monthnames,2");
                if (null != var2) {
                  TikiTableScene.monthnames[2] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -103, "monthnames,3");
                if (var2 != null) {
                  TikiTableScene.monthnames[3] = Cp1252DecodingSupport.decodeBytesToString(var2, -98);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 101, "monthnames,4");
                if (var2 != null) {
                  TikiTableScene.monthnames[4] = Cp1252DecodingSupport.decodeBytesToString(var2, -60);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -27, "monthnames,5");
                if (var2 != null) {
                  TikiTableScene.monthnames[5] = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20939);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 98, "monthnames,6");
                if (null != var2) {
                  TikiTableScene.monthnames[6] = Cp1252DecodingSupport.decodeBytesToString(var2, -106);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 114, "monthnames,7");
                if (null != var2) {
                  TikiTableScene.monthnames[7] = Cp1252DecodingSupport.decodeBytesToString(var2, -54);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 94, "monthnames,8");
                if (var2 != null) {
                  TikiTableScene.monthnames[8] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -30, "monthnames,9");
                if (null != var2) {
                  TikiTableScene.monthnames[9] = Cp1252DecodingSupport.decodeBytesToString(var2, -119);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -86, "monthnames,10");
                if (null != var2) {
                  TikiTableScene.monthnames[10] = Cp1252DecodingSupport.decodeBytesToString(var2, TutorialFactory.bitwiseXor(param1, 21071));
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -42, "monthnames,11");
                if (null != var2) {
                  TikiTableScene.monthnames[11] = Cp1252DecodingSupport.decodeBytesToString(var2, -109);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -61, "create_welcome");
                if (var2 != null) {
                  PolarObject.createWelcome = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21137);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -127, "create_u13_welcome");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -115, "create_createanaccount");
                if (null != var2) {
                  ArchiveIndex.createCreateanaccount = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20978);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 107, "create_username");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 107, "create_displayname");
                if (null != var2) {
                  KillerBallSkin.createDisplayname = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 124, "create_password");
                if (null != var2) {
                  PolarBallSkin.createPassword = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20909);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 111, "create_password_confirm");
                if (null != var2) {
                  ChoiceButtonSupport.createPasswordConfirm = Cp1252DecodingSupport.decodeBytesToString(var2, -64);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 114, "create_email");
                if (null != var2) {
                  ThreeSliceButtonPainter.createEmail = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -42, "create_email_confirm");
                if (null != var2) {
                  ProxyAuthenticationRequiredException.createEmailConfirm = Cp1252DecodingSupport.decodeBytesToString(var2, 15);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 123, "create_age");
                if (null != var2) {
                  MusicPatch.createAge = Cp1252DecodingSupport.decodeBytesToString(var2, -123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -109, "create_u13_email");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -49, "create_u13_email_confirm");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 116, "create_dob");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -57);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 121, "create_country");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -60);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 102, "create_alternatives_header");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -77);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -73, "create_alternatives_select");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21024);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 103, "create_suggestions");
                if (var2 != null) {
                  TriangleMesh.createSuggestions = Cp1252DecodingSupport.decodeBytesToString(var2, -27);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 121, "create_more_suggestions");
                if (var2 != null) {
                  OptionsScreen.createMoreSuggestions = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -48, "create_select_alternative");
                if (null != var2) {
                  ArchiveAvailabilitySupport.createSelectAlternative = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21099);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -57, "create_optin_news");
                if (null != var2) {
                  ArchiveAvailabilitySupport.createOptinNews = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 127, "create_agreeterms");
                if (var2 != null) {
                  ArchiveProvider.createAgreeterms = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 124, "create_u13terms");
                if (var2 != null) {
                  NodeHashTableIterator.createU13terms = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21100);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 105, "login_username_email");
                if (null != var2) {
                  Cp1252CharacterSupport.loginUsernameEmail = Cp1252DecodingSupport.decodeBytesToString(var2, -124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -36, "login_username");
                if (null != var2) {
                  QuickChatMenu.loginUsername = Cp1252DecodingSupport.decodeBytesToString(var2, -102);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -86, "login_email");
                if (null != var2) {
                  ReportAbuseDialog.loginEmail = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -89, "login_username_tooltip");
                if (var2 != null) {
                  ChatMessage.loginUsernameTooltip = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -45, "login_password_tooltip");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 8);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -99, "login_login_tooltip");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -115, "login_create_tooltip");
                if (null != var2) {
                  AccountMenuText.loginCreateTooltip = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 107, "login_justplay_tooltip");
                if (var2 != null) {
                  ArchiveProvider.loginJustplayTooltip = Cp1252DecodingSupport.decodeBytesToString(var2, -63);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 103, "login_back_tooltip");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 127, "login_no_displayname");
                if (var2 != null) {
                  AnimatedNotification.loginNoDisplayname = Cp1252DecodingSupport.decodeBytesToString(var2, -118);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 103, "create_username_tooltip");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -83, "create_username_hint");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -107);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 115, "create_displayname_tooltip");
                if (null != var2) {
                  ThemeSelectScreen.createDisplaynameTooltip = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21139);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 93, "create_displayname_hint");
                if (var2 != null) {
                  LongAndTextLoginPayload.createDisplaynameHint = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 103, "create_password_tooltip");
                if (null != var2) {
                  CanvasInputAttachmentSupport.createPasswordTooltip = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21140);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -54, "create_password_hint");
                if (var2 != null) {
                  AimTarget.createPasswordHint = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -125, "create_password_confirm_tooltip");
                if (var2 != null) {
                  ProxyConnectorSupport.createPasswordConfirmTooltip = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20969);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -99, "create_email_tooltip");
                if (var2 != null) {
                  CheckboxWidget.createEmailTooltip = Cp1252DecodingSupport.decodeBytesToString(var2, -8);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -58, "create_email_confirm_tooltip");
                if (null != var2) {
                  CompressedContainerSupport.createEmailConfirmTooltip = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21140);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 126, "create_age_tooltip");
                if (var2 != null) {
                  PoolMatchController.createAgeTooltip = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -107, "create_optin_news_tooltip");
                if (var2 != null) {
                  LoginForm.createOptinNewsTooltip = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 101, "create_u13_email_tooltip");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -76, "create_u13_email_confirm_tooltip");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 112, "create_dob_tooltip");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20912);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -82, "create_country_tooltip");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -31);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -75, "create_optin_tooltip");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21042);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 100, "create_continue");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -36);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 120, "create_username_unavailable");
                if (var2 != null) {
                  TextHotspotRegion.createUsernameUnavailable = Cp1252DecodingSupport.decodeBytesToString(var2, -67);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -112, "create_username_available");
                if (null != var2) {
                  DimmedPauseMenu.createUsernameAvailable = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20924);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -39, "create_alert_namelength");
                if (null != var2) {
                  AchievementProtocolSupport.createAlertNamelength = Cp1252DecodingSupport.decodeBytesToString(var2, -103);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -41, "create_alert_namechars");
                if (var2 != null) {
                  RasterBuffer.createAlertNamechars = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20950);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 107, "create_alert_nameleadingspace");
                if (null != var2) {
                  StatefulTextPainter.createAlertNameleadingspace = Cp1252DecodingSupport.decodeBytesToString(var2, -90);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -40, "create_alert_doublespace");
                if (null != var2) {
                  GzipDecoder.createAlertDoublespace = Cp1252DecodingSupport.decodeBytesToString(var2, -11);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -27, "create_alert_passchars");
                if (var2 != null) {
                  IterableNodeHashTable.createAlertPasschars = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21092);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -122, "create_alert_passrepeated");
                if (null != var2) {
                  ArchiveProvider.createAlertPassrepeated = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 114, "create_alert_passlength");
                if (null != var2) {
                  Bzip2DecoderState.createAlertPasslength = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21137);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 116, "create_alert_passcontainsname");
                if (null != var2) {
                  field_o = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 114, "create_alert_passcontainsemail");
                if (var2 != null) {
                  ClientUiResourceState.createAlertPasscontainsemail = Cp1252DecodingSupport.decodeBytesToString(var2, -46);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 102, "create_alert_passcontainsname_partial");
                if (null != var2) {
                  AgeValidator.createAlertPasscontainsnamePartial = Cp1252DecodingSupport.decodeBytesToString(var2, -26);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 99, "create_alert_checkname");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 106, "create_alert_invalidemail");
                if (null != var2) {
                  DelayedServerPacket.createAlertInvalidemail = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -127, "create_alert_email_unavailable");
                if (var2 != null) {
                  Quaternion.createAlertEmailUnavailable = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 97, "create_alert_invaliddate");
                if (var2 != null) {
                  AnimatedNotification.createAlertInvaliddate = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -49, "create_alert_invalidage");
                if (null != var2) {
                  ThemeSelectScreen.createAlertInvalidage = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21138);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 110, "create_alert_yearrange");
                if (var2 != null) {
                  JaggrabDownloader.createAlertYearrange = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21138);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -103, "create_alert_mismatch");
                if (null != var2) {
                  HuffmanCodec.createAlertMismatch = Cp1252DecodingSupport.decodeBytesToString(var2, 12);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 127, "create_passwordvalid");
                if (null != var2) {
                  NodeHashTableIterator.createPasswordvalid = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 110, "create_emailvalid");
                if (null != var2) {
                  NodeHashTableIterator.createEmailvalid = Cp1252DecodingSupport.decodeBytesToString(var2, -34);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -71, "create_account_success");
                if (var2 != null) {
                  SingleChildWidget.createAccountSuccess = Cp1252DecodingSupport.decodeBytesToString(var2, -13);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 113, "invalid_name");
                if (var2 != null) {
                  ModelInstance.invalidName = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21099);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -116, "cannot_add_yourself");
                if (null != var2) {
                  QuickChatHelpDialog.cannotAddYourself = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20894);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -62, "unable_to_add_friend");
                if (var2 != null) {
                  AgeValidator.unableToAddFriend = Cp1252DecodingSupport.decodeBytesToString(var2, -58);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 110, "unable_to_add_ignore");
                if (var2 != null) {
                  MonotonicClock.unableToAddIgnore = Cp1252DecodingSupport.decodeBytesToString(var2, -80);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -33, "unable_to_delete_friend");
                if (var2 != null) {
                  ShotRecord.unableToDeleteFriend = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21015);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -118, "unable_to_delete_ignore");
                if (null != var2) {
                  TextInputValidator.unableToDeleteIgnore = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -41, "friendlistfull");
                if (null != var2) {
                  MessageDialogContent.friendlistfull = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20970);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 94, "friendlistdupe");
                if (null != var2) {
                  RankingsScreen.friendlistdupe = Cp1252DecodingSupport.decodeBytesToString(var2, -44);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -45, "friendnotfound");
                if (var2 != null) {
                  IntrusiveDequeCursor.friendnotfound = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21137);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 113, "ignorelistfull");
                if (null != var2) {
                  DebugTuningSlider.ignorelistfull = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 112, "ignorelistdupe");
                if (null != var2) {
                  LobbyPlayerLookupSupport.ignorelistdupe = Cp1252DecodingSupport.decodeBytesToString(var2, -39);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -90, "ignorenotfound");
                if (var2 != null) {
                  ThemeSelectScreen.ignorenotfound = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21081);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -28, "removeignorefirst");
                if (var2 != null) {
                  DisplayNamePanel.removeignorefirst = Cp1252DecodingSupport.decodeBytesToString(var2, -100);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -43, "removefriendfirst");
                if (null != var2) {
                  UsernameSuggestionSupport.removefriendfirst = Cp1252DecodingSupport.decodeBytesToString(var2, -62);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 108, "enterfriend_add");
                if (var2 != null) {
                  TutorialFactory.enterfriendAdd = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21110);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 99, "enterfriend_del");
                if (var2 != null) {
                  MidiPcmStream.enterfriendDel = Cp1252DecodingSupport.decodeBytesToString(var2, -4);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -79, "enterignore_add");
                if (null != var2) {
                  SpaceObject.enterignoreAdd = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 115, "enterignore_del");
                if (var2 != null) {
                  BirthDatePromptPanel.enterignoreDel = Cp1252DecodingSupport.decodeBytesToString(var2, -76);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 105, "text_removed_from_game");
                if (var2 != null) {
                  LoginForm.textRemovedFromGame = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21103);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 119, "text_lobby_pleaselogin_free");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21100);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -63, "opengl");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 112, "sse");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21100);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 95, "purejava");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20922);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -111, "waitingfor_graphics");
                if (null != var2) {
                  NineSliceFrameSupport.waitingforGraphics = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21104);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 100, "waitingfor_models");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -90);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -71, "waitingfor_fonts");
                if (null != var2) {
                  SpaceTableScene.waitingforFonts = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -92, "waitingfor_soundeffects");
                if (null != var2) {
                  HuffmanCodec.waitingforSoundeffects = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21097);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 97, "waitingfor_music");
                if (var2 != null) {
                  NameEntryPopup.waitingforMusic = Cp1252DecodingSupport.decodeBytesToString(var2, -94);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -104, "waitingfor_instruments");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 1);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -115, "waitingfor_levels");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -107);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -39, "waitingfor_extradata");
                if (null != var2) {
                  DebugTuningSupport.waitingforExtradata = Cp1252DecodingSupport.decodeBytesToString(var2, -7);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 106, "waitingfor_languages");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -84);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 126, "waitingfor_textures");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 96, "waitingfor_animations");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -74, "loading_graphics");
                if (null != var2) {
                  HighScoreSubmission.loadingGraphics = Cp1252DecodingSupport.decodeBytesToString(var2, -87);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -53, "loading_models");
            }
            void runChunk2() throws java.lang.RuntimeException {
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -44);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 108, "loading_fonts");
                if (var2 != null) {
                  TickClock.loadingFonts = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21004);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 123, "loading_soundeffects");
                if (null != var2) {
                  AudioService.loadingSoundeffects = Cp1252DecodingSupport.decodeBytesToString(var2, 6);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -122, "loading_music");
                if (null != var2) {
                  Camera.loadingMusic = Cp1252DecodingSupport.decodeBytesToString(var2, -49);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -48, "loading_instruments");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21037);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -80, "loading_levels");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 14);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 122, "loading_extradata");
                if (null != var2) {
                  SoundCache.loadingExtradata = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -108, "loading_languages");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -67, "loading_textures");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -81);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -103, "loading_animations");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -109);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 127, "unpacking_graphics");
                if (var2 != null) {
                  NineBallRules.unpackingGraphics = Cp1252DecodingSupport.decodeBytesToString(var2, -11);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 122, "unpacking_models");
                if (var2 != null) {
                  ValidationIconWidget.unpackingModels = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -100, "unpacking_soundeffects");
                if (var2 != null) {
                  TutorialFactory.unpackingSoundeffects = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21063);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 114, "unpacking_music");
                if (var2 != null) {
                  KillerBallSkin.unpackingMusic = Cp1252DecodingSupport.decodeBytesToString(var2, -44);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 102, "unpacking_levels");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -72, "unpacking_languages");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -41);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -65, "unpacking_animations");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21136);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 93, "unpacking_toolkit");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 99, "instructions");
                if (null != var2) {
                  NodeHashTableIterator.instructions = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21100);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -70, "tutorial");
                if (null != var2) {
                  CollisionContact.tutorial = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 108, "playtutorial");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -104);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 99, "sound_colon");
                if (null != var2) {
                  CachedArchiveSource.soundColon = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21139);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 100, "music_colon");
                if (null != var2) {
                  QuickChatHelpDialog.musicColon = Cp1252DecodingSupport.decodeBytesToString(var2, -89);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -78, "fullscreen");
                if (null != var2) {
                  TabbedPane.fullscreen = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -46, "screensize");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 115, "highscores");
                if (var2 != null) {
                  LookupProtocolSupport.highscores = Cp1252DecodingSupport.decodeBytesToString(var2, -69);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -72, "rankings");
                if (var2 != null) {
                  WorldPointProjectionSupport.rankings = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -62, "achievements");
                if (null != var2) {
                  PacketBuffer.achievements = Cp1252DecodingSupport.decodeBytesToString(var2, -20);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 98, "achievementsthisgame");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -23);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -41, "achievementsthissession");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -80, "watchintroduction");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -42, "quit");
                if (null != var2) {
                  Js5ArchiveManager.quit = Cp1252DecodingSupport.decodeBytesToString(var2, -101);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 123, "login_createaccount");
                if (var2 != null) {
                  NetworkGameClient.loginCreateaccount = Cp1252DecodingSupport.decodeBytesToString(var2, -117);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 116, "tohighscores");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -71);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -32, "returntomainmenu");
                if (var2 != null) {
                  CompressedContainerSupport.returntomainmenu = Cp1252DecodingSupport.decodeBytesToString(var2, -124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 112, "returntopausemenu");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21021);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 101, "returntooptionsmenu_notpaused");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -15);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -116, "mainmenu");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20975);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 97, "pausemenu");
                if (var2 != null) {
                  WhirlpoolHasher.pausemenu = Cp1252DecodingSupport.decodeBytesToString(var2, -71);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 117, "optionsmenu_notpaused");
                if (var2 != null) {
                  ModelTableScene.optionsmenuNotpaused = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21100);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 122, "menu");
                if (null != var2) {
                  ShotRecord.menu = Cp1252DecodingSupport.decodeBytesToString(var2, -19);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 124, "selectlevel");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -91);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -93, "nextlevel");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 111, "startgame");
                if (null != var2) {
                  UsernameAvailabilityValidator.startgame = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21098);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 124, "newgame");
                if (null != var2) {
                  WidgetContainer.newgame = Cp1252DecodingSupport.decodeBytesToString(var2, -20);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 116, "resumegame");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -113, "resumetutorial");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 104, "skip");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -94, "skiptutorial");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -15);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -55, "skipending");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -68);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 113, "restartlevel");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21028);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -33, "endtest");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -102, "endgame");
                if (null != var2) {
                  IterableNodeHashTable.endgame = Cp1252DecodingSupport.decodeBytesToString(var2, 11);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -85, "endtutorial");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 116, "ok");
                if (var2 != null) {
                  ReflectionReplySupport.ok = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 118, "on");
                if (var2 != null) {
                  AppletUrlSupport.on = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -117, "off");
                if (null != var2) {
                  BeveledFrameSpriteFactory.off = Cp1252DecodingSupport.decodeBytesToString(var2, -60);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 108, "previous");
                if (var2 != null) {
                  AwtEventQueueSupport.previous = Cp1252DecodingSupport.decodeBytesToString(var2, -66);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 111, "prev");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -98);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 111, "next");
                if (var2 != null) {
                  StartupInterfaceSupport.next = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -69, "graphics_colon");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -109);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -104, "hotseatmultiplayer");
                if (var2 != null) {
                  ScoreboardNameRecord.hotseatmultiplayer = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21137);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 110, "entermultiplayerlobby");
                if (var2 != null) {
                  ArchiveRequest.entermultiplayerlobby = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -29, "singleplayergame");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -121, "returntogame");
                if (null != var2) {
                  DebugSliderInputSupport.returntogame = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21104);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -37, "endgameresign");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -41);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -77, "offerdraw");
                if (var2 != null) {
                  DateInputWidget.offerdraw = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21097);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -76, "canceldraw");
                if (var2 != null) {
                  FullscreenDisplayMode.canceldraw = Cp1252DecodingSupport.decodeBytesToString(var2, -95);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 112, "acceptdraw");
                if (var2 != null) {
                  SlidingPanelSupport.acceptdraw = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21139);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 126, "resign");
                if (null != var2) {
                  IntrusiveDeque.resign = Cp1252DecodingSupport.decodeBytesToString(var2, -62);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 119, "returntolobby");
                if (null != var2) {
                  GlowParticle.returntolobby = Cp1252DecodingSupport.decodeBytesToString(var2, 15);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -74, "cont");
                if (null != var2) {
                  WeightedLruCache.cont = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21138);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 98, "continue_spectating");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -43);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 95, "messages");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21099);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 100, "graphics_fastest");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -12);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -89, "graphics_medium");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21044);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 119, "graphics_best");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -118);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -115, "graphics_directx");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20903);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -78, "graphics_opengl");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20982);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 112, "graphics_java");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 1);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 123, "graphics_quality_high");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 126, "graphics_quality_low");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20968);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 104, "graphics_mode");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -66, "graphics_quality");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 11);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -88, "mode");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -61, "quality");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -51);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 127, "keys");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 127, "objective");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20894);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 121, "currentobjective");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -35, "pressescforpausemenu");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21137);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -107, "pressescforpausemenuortoskiptutorial");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 105, "pressescforoptionsmenu_doesntpause");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -94, "pressescforoptionsmenu_doesntpause_short");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 98, "powerups");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -26);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -114, "latestlevel_suffix");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21140);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -49, "unreachedlevel_name");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21097);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 124, "unreachedlevel_cannotplayreason");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -62, "unreachedlevel_cannotplayreason_shorter");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20998);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -121, "unreachedworld_cannotplayreason");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 98, "memberslevel_name");
                if (null != var2) {
                  ProjectedLineSupport.memberslevelName = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 105, "memberslevel_cannotplayreason");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21139);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -75, "membersworld_cannotplayreason");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -44);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -104, "unreachedlevel_createtip");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -116);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 95, "unreachedlevel_createtip_line1");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -59);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 107, "unreachedlevel_createtip_line2");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -89);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -124, "unreachedlevel_logintip");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -128, "memberslevel_logintip");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -106);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -120, "displayname_none");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20965);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 93, "levelxofy1");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -110);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -36, "levelxofy2");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21104);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -103, "levelxofy");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20969);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 103, "ingame_level");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 103, "mouseoveranicon");
                if (var2 != null) {
                  StrongCacheEntry.mouseoveranicon = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 114, "notyetachieved");
                if (var2 != null) {
                  FontPaletteSupport.notyetachieved = Cp1252DecodingSupport.decodeBytesToString(var2, -25);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -121, "achieved");
                if (null != var2) {
                  SectorCacheStore.achieved = Cp1252DecodingSupport.decodeBytesToString(var2, -49);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 114, "orbpoints");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21136);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -33, "orbcoins");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -44, "orbpoints_colon");
                if (var2 != null) {
                  Under13NoticePanel.orbpointsColon = Cp1252DecodingSupport.decodeBytesToString(var2, -107);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 106, "orbcoins_colon");
                if (var2 != null) {
                  CheckboxWidget.orbcoinsColon = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21138);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -98, "achieved_colon_description");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -109);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 98, "secretachievement");
                if (null != var2) {
                  TickClock.secretachievement = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -61, "no_highscores");
                if (var2 != null) {
                  ModernTableScene.noHighscores = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 114, "hs_name");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -49);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -123, "hs_level");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 96, "hs_fromlevel");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -117);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -112, "hs_tolevel");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -44, "hs_score");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21098);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -95, "hs_end");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -76);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 118, "ingame_score");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21046);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 93, "score_colon");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -80);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 102, "mp_leavegame");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -36);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 102, "mp_offerrematch");
                if (null != var2) {
                  MenuSelection.mpOfferrematch = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21068);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 95, "mp_offerrematch_unrated");
                if (var2 != null) {
                  TutorialSelectScreen.mpOfferrematchUnrated = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 112, "mp_acceptrematch");
                if (var2 != null) {
                  DialWidget.mpAcceptrematch = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -83, "mp_acceptrematch_unrated");
                if (null != var2) {
                  NodeHashTableIterator.mpAcceptrematchUnrated = Cp1252DecodingSupport.decodeBytesToString(var2, 5);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -127, "mp_cancelrematch");
                if (null != var2) {
                  AimTarget.mpCancelrematch = Cp1252DecodingSupport.decodeBytesToString(var2, -68);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 122, "mp_cancelrematch_unrated");
                if (var2 != null) {
                  GrowableIntListFactory.mpCancelrematchUnrated = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 120, "mp_rematchnewgame");
                if (var2 != null) {
                  AccountCreationDialog.mpRematchnewgame = Cp1252DecodingSupport.decodeBytesToString(var2, -22);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 124, "mp_rematchnewgame_unrated");
                if (null != var2) {
                  ChoiceButtonSupport.mpRematchnewgameUnrated = Cp1252DecodingSupport.decodeBytesToString(var2, -92);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 115, "mp_x_wantstodraw");
                if (var2 != null) {
                  DiskCacheWorker.mpXWantstodraw = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 120, "mp_x_offersrematch");
                if (var2 != null) {
                  ModelInstance.mpXOffersrematch = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -105, "mp_x_offersrematch_unrated");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -70, "mp_youofferrematch");
                if (null != var2) {
                  TickClock.mpYouofferrematch = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20917);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 112, "mp_youofferrematch_unrated");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -94, "mp_youofferdraw");
                if (null != var2) {
                  MembershipBenefitsLoader.mpYouofferdraw = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 117, "mp_youresigned");
                if (null != var2) {
                  ClientInputResetSupport.mpYouresigned = Cp1252DecodingSupport.decodeBytesToString(var2, -107);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 123, "mp_youresigned_rematch");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -98, "mp_x_hasresignedandleft");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 117, "mp_x_hasresigned_rematch");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -87);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 108, "mp_x_hasresigned");
                if (var2 != null) {
                  VertexNormal.mpXHasresigned = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 93, "mp_x_hasleft");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21139);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 96, "mp_x_haswon");
                if (null != var2) {
                  PacketBuffer.mpXHaswon = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20900);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 106, "mp_youhavewon");
                if (null != var2) {
                  BeveledFrameSpriteFactory.mpYouhavewon = Cp1252DecodingSupport.decodeBytesToString(var2, -66);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -90, "mp_gamedrawn");
                if (null != var2) {
                  Js5Transport.mpGamedrawn = Cp1252DecodingSupport.decodeBytesToString(var2, -27);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -102, "mp_timeremaining");
                if (var2 != null) {
                  ModelInstance.mpTimeremaining = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21136);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 109, "mp_x_turn");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 120, "mp_yourturn");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 109, "gameover");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21099);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 116, "mp_hidechat");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -71);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -87, "mp_showchat_nounread");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -98);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 127, "mp_showchat_unread1");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -69);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -125, "mp_showchat_unread2");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 103, "click_to_quickchat");
                if (var2 != null) {
                  ArchiveBootstrapSupport.clickToQuickchat = Cp1252DecodingSupport.decodeBytesToString(var2, -111);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -33, "autorespond");
                if (null != var2) {
                  field_k = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20957);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 109, "quickchat_help");
                if (null != var2) {
                  GrowableIntListFactory.quickchatHelp = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21140);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -105, "quickchat_help_title");
                if (null != var2) {
                  Atan2Support.quickchatHelpTitle = Cp1252DecodingSupport.decodeBytesToString(var2, -105);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -61, "quickchat_shortcut_help,0");
                if (var2 != null) {
                  LookupQuery.quickchatShortcutHelp[0] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -76, "quickchat_shortcut_help,1");
                if (null != var2) {
                  LookupQuery.quickchatShortcutHelp[1] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 103, "quickchat_shortcut_help,2");
                if (var2 != null) {
                  LookupQuery.quickchatShortcutHelp[2] = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21139);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 120, "quickchat_shortcut_help,3");
                if (var2 != null) {
                  LookupQuery.quickchatShortcutHelp[3] = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21136);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -112, "quickchat_shortcut_help,4");
                if (null != var2) {
                  LookupQuery.quickchatShortcutHelp[4] = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20967);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 110, "quickchat_shortcut_help,5");
                if (null != var2) {
                  LookupQuery.quickchatShortcutHelp[5] = Cp1252DecodingSupport.decodeBytesToString(var2, -75);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -53, "quickchat_shortcut_keys,0");
                if (null != var2) {
                  ValidationMessageWidget.quickchatShortcutKeys[0] = Cp1252DecodingSupport.decodeBytesToString(var2, -35);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -51, "quickchat_shortcut_keys,1");
                if (null != var2) {
                  ValidationMessageWidget.quickchatShortcutKeys[1] = Cp1252DecodingSupport.decodeBytesToString(var2, -5);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 119, "quickchat_shortcut_keys,2");
                if (null != var2) {
                  ValidationMessageWidget.quickchatShortcutKeys[2] = Cp1252DecodingSupport.decodeBytesToString(var2, -45);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -33, "quickchat_shortcut_keys,3");
                if (var2 != null) {
                  ValidationMessageWidget.quickchatShortcutKeys[3] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 95, "quickchat_shortcut_keys,4");
                if (null != var2) {
                  ValidationMessageWidget.quickchatShortcutKeys[4] = Cp1252DecodingSupport.decodeBytesToString(var2, -113);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -101, "quickchat_shortcut_keys,5");
                if (var2 != null) {
                  ValidationMessageWidget.quickchatShortcutKeys[5] = Cp1252DecodingSupport.decodeBytesToString(var2, -57);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 108, "keychar_the_character_under_questionmark");
                if (null != var2) {
                  ArchiveLoadStep.keycharTheCharacterUnderQuestionmark = DisplayModeSupport.decodeCp1252Byte(var2[0], 8);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 113, "rating_noratings");
                if (var2 != null) {
                  Camera.ratingNoratings = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -89, "rating_rating");
                if (null != var2) {
                  DateInputWidget.ratingRating = Cp1252DecodingSupport.decodeBytesToString(var2, -72);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -31, "rating_played");
                if (null != var2) {
                  ImageProducerRasterBuffer.ratingPlayed = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21026);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -33, "rating_won");
                if (null != var2) {
                  TextLineLayout.ratingWon = Cp1252DecodingSupport.decodeBytesToString(var2, -20);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -118, "rating_lost");
                if (var2 != null) {
                  ShotRecord.ratingLost = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20990);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -113, "rating_drawn");
                if (var2 != null) {
                  MeshBase.ratingDrawn = Cp1252DecodingSupport.decodeBytesToString(var2, 4);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -101, "benefits_fullscreen");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -67);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -67, "benefits_noadverts");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21014);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -101, "benefits_price");
                if (null != var2) {
                  OpacityWidget.benefitsPrice = Cp1252DecodingSupport.decodeBytesToString(var2, 6);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 106, "members_expansion_benefits,0");
                if (null != var2) {
                  ReflectionRequestSupport.membersExpansionBenefits[0] = Cp1252DecodingSupport.decodeBytesToString(var2, 4);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -84, "members_expansion_benefits,1");
                if (var2 != null) {
                  ReflectionRequestSupport.membersExpansionBenefits[1] = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21137);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 118, "members_expansion_benefits,2");
                if (var2 != null) {
                  ReflectionRequestSupport.membersExpansionBenefits[2] = Cp1252DecodingSupport.decodeBytesToString(var2, TutorialFactory.bitwiseXor(param1, -21100));
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -78, "members_expansion_price_top");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -45);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -127, "members_expansion_price_bottom");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -86, "reconnect_lost_seq,0");
                if (var2 != null) {
                  AccountDisplayNameSupport.reconnectLostSeq[0] = Cp1252DecodingSupport.decodeBytesToString(var2, -3);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -126, "reconnect_lost_seq,1");
                if (null != var2) {
                  AccountDisplayNameSupport.reconnectLostSeq[1] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -63, "reconnect_lost_seq,2");
                if (var2 != null) {
                  AccountDisplayNameSupport.reconnectLostSeq[2] = Cp1252DecodingSupport.decodeBytesToString(var2, TutorialFactory.bitwiseXor(param1, 21092));
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 127, "reconnect_lost_seq,3");
                if (var2 != null) {
                  AccountDisplayNameSupport.reconnectLostSeq[3] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 117, "reconnect_lost");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -72);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -27, "reconnect_restored");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -60);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -64, "reconnect_please_check");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -121);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -118, "reconnect_wait");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -97, "reconnect_retry");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -107, "reconnect_resume");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -80);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 108, "reconnect_or");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -54);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 123, "reconnect_exitfs");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -22);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -40, "reconnect_exitfs_quit");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -112);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 108, "reconnect_quit");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -117, "reconnect_check_fs");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -67);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -79, "reconnect_check_nonfs");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 111, "fs_accept_beforeaccept");
                if (var2 != null) {
                  ProjectedLineSupport.fsAcceptBeforeaccept = Cp1252DecodingSupport.decodeBytesToString(var2, -75);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 109, "fs_button_accept");
                if (var2 != null) {
                  AppletUrlSupport.fsButtonAccept = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21100);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 98, "fs_accept_afteraccept");
                if (var2 != null) {
                  DisplayNamePanel.fsAcceptAfteraccept = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20951);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -45, "fs_button_cancel");
                if (var2 != null) {
                  ArchiveIndex.fsButtonCancel = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 122, "fs_accept_aftercancel");
                if (var2 != null) {
                  field_c = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21075);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -39, "fs_accept_countdown_sing");
                if (var2 != null) {
                  MonotonicClock.fsAcceptCountdownSing = Cp1252DecodingSupport.decodeBytesToString(var2, -95);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -38, "fs_accept_countdown_pl");
                if (null != var2) {
                  SoundCache.fsAcceptCountdownPl = Cp1252DecodingSupport.decodeBytesToString(var2, -77);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 94, "fs_nonmember");
                if (null != var2) {
                  StatefulTextPainter.fsNonmember = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 118, "fs_button_close");
                if (var2 != null) {
                  DirectByteStorage.fsButtonClose = Cp1252DecodingSupport.decodeBytesToString(var2, -5);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 98, "fs_button_members");
                if (null != var2) {
                  CompressedContainerSupport.fsButtonMembers = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20991);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -54, "fs_unavailable");
                if (null != var2) {
                  LoginRequestSupport.fsUnavailable = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21097);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 100, "fs_unavailable_try_signed_applet");
                if (null != var2) {
                  ValidationIconWidget.fsUnavailableTrySignedApplet = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21012);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -119, "fs_focus");
                if (var2 != null) {
                  QuickChatPhraseRegistry.fsFocus = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -32, "fs_focus_or_resolution");
                if (var2 != null) {
                  HuffmanCodec.fsFocusOrResolution = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 96, "fs_timeout");
                if (null != var2) {
                  DebugTuningSupport.fsTimeout = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21098);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -38, "fs_button_tryagain");
                if (null != var2) {
                  AppletContainerSupport.fsButtonTryagain = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21061);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -77, "graphics_ui_fs_countdown");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -85);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 114, "mb_caption_title");
                if (null != var2) {
                  PlasmaTableScene.mbCaptionTitle = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ 21043);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -64, "mb_including_gamename");
                if (var2 != null) {
                  ReportAbuseDialog.mbIncludingGamename = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21138);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -57, "mb_full_access_1");
                if (null != var2) {
                  HalloweenBallSkin.mbFullAccess1 = Cp1252DecodingSupport.decodeBytesToString(var2, -8);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 100, "mb_full_access_2");
                if (var2 != null) {
                  BufferedSocket.mbFullAccess2 = Cp1252DecodingSupport.decodeBytesToString(var2, -17);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 94, "mb_achievement_count_1");
                if (var2 != null) {
                  CachedArchiveSource.mbAchievementCount1 = Cp1252DecodingSupport.decodeBytesToString(var2, -43);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 115, "mb_achievement_count_2");
                if (null != var2) {
                  PotEvent.mbAchievementCount2 = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20933);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -32, "mb_exclusive_1");
            }
            void runChunk3() throws java.lang.RuntimeException {
                if (var2 != null) {
                  UsernameSuggestionsPanel.field_X = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 115, "mb_exclusive_2");
                if (var2 != null) {
                  InputIdleSupport.mbExclusive2 = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -64, "me_extra_benefits");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -90);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -113, "hs_friend_tip");
                if (var2 != null) {
                  MultiHandleSliderWidget.hsFriendTip = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20980);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -85, "hs_friend_tip_multi");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -62);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -79, "hs_mode_name,0");
                if (var2 != null) {
                  LoginRequestSupport.hsModeName[0] = Cp1252DecodingSupport.decodeBytesToString(var2, -77);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -59, "hs_mode_name,1");
                if (null != var2) {
                  LoginRequestSupport.hsModeName[1] = Cp1252DecodingSupport.decodeBytesToString(var2, -52);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -95, "hs_mode_name,2");
                if (null != var2) {
                  LoginRequestSupport.hsModeName[2] = Cp1252DecodingSupport.decodeBytesToString(var2, -106);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 116, "rating_mode_name,0");
                if (null != var2) {
                  Camera.ratingModeName[0] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -41, "rating_mode_name,1");
                if (null != var2) {
                  Camera.ratingModeName[1] = Cp1252DecodingSupport.decodeBytesToString(var2, TutorialFactory.bitwiseXor(param1, -21097));
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -115, "rating_mode_long_name,0");
                if (null != var2) {
                  GameApplet.ratingModeLongName[0] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -128, "rating_mode_long_name,1");
                if (null != var2) {
                  GameApplet.ratingModeLongName[1] = Cp1252DecodingSupport.decodeBytesToString(var2, -44);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 109, "graphics_config_fixed_size");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 127, "graphics_config_resizable");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21100);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 101, "graphics_config_fullscreen");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21136);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 105, "graphics_config_done");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -27, "graphics_config_apply");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 101, "graphics_config_title");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -31);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 124, "graphics_config_instruction");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -80, "graphics_config_need_memory");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -94);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 106, "pleasewait_dotdotdot");
                if (var2 != null) {
                  ProjectedLineSupport.pleasewaitDotdotdot = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -31, "serviceunavailable");
                if (var2 != null) {
                  ArchiveFactory.serviceunavailable = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 93, "createtouse");
                if (var2 != null) {
                  IntegerRecordProtocolSupport.createtouse = Cp1252DecodingSupport.decodeBytesToString(var2, param1 ^ -21100);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 111, "achievementsoffline");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20994);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -113, "warning");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -69, "DEFAULT_PLAYER_NAME");
                if (null != var2) {
                  LoginPayloadKind.dEFAULTPLAYERNAME = Cp1252DecodingSupport.decodeBytesToString(var2, -14);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 103, "mustlogin1");
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -88, "mustlogin2,1");
                if (var2 != null) {
                  MidiNoteMixer.mustlogin2[1] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 119, "mustlogin2,2");
                if (null != var2) {
                  MidiNoteMixer.mustlogin2[2] = Cp1252DecodingSupport.decodeBytesToString(var2, -51);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -30, "mustlogin2,3");
                if (var2 != null) {
                  MidiNoteMixer.mustlogin2[3] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 111, "mustlogin2,4");
                if (var2 != null) {
                  MidiNoteMixer.mustlogin2[4] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -86, "mustlogin2,5");
                if (null != var2) {
                  MidiNoteMixer.mustlogin2[5] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -85, "mustlogin2,6");
                if (null != var2) {
                  MidiNoteMixer.mustlogin2[6] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 96, "mustlogin2,7");
                if (var2 != null) {
                  MidiNoteMixer.mustlogin2[7] = Cp1252DecodingSupport.decodeBytesToString(var2, -97);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -46, "mustlogin3,1");
                if (var2 != null) {
                  Js5ArchiveManager.mustlogin3[1] = Cp1252DecodingSupport.decodeBytesToString(var2, -14);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -51, "mustlogin3,2");
                if (null != var2) {
                  Js5ArchiveManager.mustlogin3[2] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 95, "mustlogin3,3");
                if (null != var2) {
                  Js5ArchiveManager.mustlogin3[3] = Cp1252DecodingSupport.decodeBytesToString(var2, -111);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 117, "mustlogin3,4");
                if (null != var2) {
                  Js5ArchiveManager.mustlogin3[4] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -126, "mustlogin3,5");
                if (null != var2) {
                  Js5ArchiveManager.mustlogin3[5] = Cp1252DecodingSupport.decodeBytesToString(var2, TutorialFactory.bitwiseXor(param1, -21023));
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 110, "mustlogin3,6");
                if (var2 != null) {
                  Js5ArchiveManager.mustlogin3[6] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -98, "mustlogin3,7");
                if (null != var2) {
                  Js5ArchiveManager.mustlogin3[7] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -41, "discard");
                if (var2 != null) {
                  DebugTuningSupport.discard = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 114, "mustlogin4,1");
                if (null != var2) {
                  ServerListLauncher.mustlogin4[1] = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21138);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -73, "mustlogin4,2");
                if (var2 != null) {
                  ServerListLauncher.mustlogin4[2] = Cp1252DecodingSupport.decodeBytesToString(var2, -52);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 96, "mustlogin4,3");
                if (var2 != null) {
                  ServerListLauncher.mustlogin4[3] = Cp1252DecodingSupport.decodeBytesToString(var2, -43);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -106, "mustlogin4,4");
                if (var2 != null) {
                  ServerListLauncher.mustlogin4[4] = Cp1252DecodingSupport.decodeBytesToString(var2, -13);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -111, "mustlogin4,5");
                if (var2 != null) {
                  ServerListLauncher.mustlogin4[5] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 100, "mustlogin4,6");
                if (var2 != null) {
                  ServerListLauncher.mustlogin4[6] = Cp1252DecodingSupport.decodeBytesToString(var2, -97);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -97, "mustlogin4,7");
                if (var2 != null) {
                  ServerListLauncher.mustlogin4[7] = Cp1252DecodingSupport.decodeBytesToString(var2, -42);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 98, "mustlogin_notloggedin");
                if (var2 != null) {
                  FadingDialog.mustloginNotloggedin = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 127, "mustlogin_alternate,1");
                if (null != var2) {
                  LoginMethod.mustloginAlternate[1] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -93, "mustlogin_alternate,2");
                if (var2 != null) {
                  LoginMethod.mustloginAlternate[2] = Cp1252DecodingSupport.decodeBytesToString(var2, -106);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -54, "mustlogin_alternate,3");
                if (null != var2) {
                  LoginMethod.mustloginAlternate[3] = Cp1252DecodingSupport.decodeBytesToString(var2, -123);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -41, "mustlogin_alternate,4");
                if (var2 != null) {
                  LoginMethod.mustloginAlternate[4] = Cp1252DecodingSupport.decodeBytesToString(var2, -36);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 108, "mustlogin_alternate,5");
                if (var2 != null) {
                  LoginMethod.mustloginAlternate[5] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 126, "mustlogin_alternate,6");
                if (null != var2) {
                  LoginMethod.mustloginAlternate[6] = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 21138);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 120, "mustlogin_alternate,7");
                if (var2 != null) {
                  LoginMethod.mustloginAlternate[7] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -99, "subscription_cost_monthly,0");
                if (var2 != null) {
                  FontPaletteSupport.subscriptionCostMonthly[0] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -123, "subscription_cost_monthly,1");
                if (null != var2) {
                  FontPaletteSupport.subscriptionCostMonthly[1] = Cp1252DecodingSupport.decodeBytesToString(var2, param1 + 20921);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -75, "subscription_cost_monthly,2");
                if (null != var2) {
                  FontPaletteSupport.subscriptionCostMonthly[2] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -50, "subscription_cost_monthly,3");
                if (null != var2) {
                  FontPaletteSupport.subscriptionCostMonthly[3] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -30, "subscription_cost_monthly,4");
                if (null != var2) {
                  FontPaletteSupport.subscriptionCostMonthly[4] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -95, "subscription_cost_monthly,5");
                if (var2 != null) {
                  FontPaletteSupport.subscriptionCostMonthly[5] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -54, "subscription_cost_monthly,6");
                if (null != var2) {
                  FontPaletteSupport.subscriptionCostMonthly[6] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 95, "subscription_cost_monthly,7");
                if (null != var2) {
                  FontPaletteSupport.subscriptionCostMonthly[7] = Cp1252DecodingSupport.decodeBytesToString(var2, TutorialFactory.bitwiseXor(param1, 21031));
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 95, "subscription_cost_monthly,8");
                if (var2 != null) {
                  FontPaletteSupport.subscriptionCostMonthly[8] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) 112, "subscription_cost_monthly,9");
                if (null != var2) {
                  FontPaletteSupport.subscriptionCostMonthly[9] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -75, "subscription_cost_monthly,10");
                if (var2 != null) {
                  FontPaletteSupport.subscriptionCostMonthly[10] = Cp1252DecodingSupport.decodeBytesToString(var2, -94);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -116, "subscription_cost_monthly,11");
                if (null != var2) {
                  FontPaletteSupport.subscriptionCostMonthly[11] = Cp1252DecodingSupport.decodeBytesToString(var2, -39);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -127, "subscription_cost_monthly,12");
                if (null != var2) {
                  FontPaletteSupport.subscriptionCostMonthly[12] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = DebouncedValidationProvider.loadNamedFile((byte) -59, "sentence_separator");
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                EmailAvailabilityValidator.field_r = null;
            }
            void run() {
                var3 = Pool.field_O;
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
                  stackIn_2626_0 = (RuntimeException) (var2_ref);
                  stackIn_2626_1 = new StringBuilder().append("nk.E(");
                  if (param0 == null) {
                    stackIn_2627_2 = "null";
                  } else {
                    stackIn_2627_2 = "{...}";
                  }
                  throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_2626_0), ((StringBuilder) (Object) stackIn_2626_1).append(stackIn_2627_2).append(',').append(param1).append(')').toString());
                }
                if (var3 != 0) {
                  stackIn_2635_0 = (!GameApplet.field_k);
                  GameApplet.field_k = stackIn_2635_0;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(archive, obfuscationGuard);
        decompiledBody.run();
    }

    public static void releaseStatics(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_f = null;
          field_k = null;
          field_m = null;
          field_g = null;
          if (param0 != 0) {
            TranslatedUiText.findRootQuickChatCategory(47);
          }
          field_b = null;
          field_o = null;
          field_c = null;
          field_i = null;
          field_l = (byte[][][]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "nk.G(" + param0 + ')');
        }
    }

    final static void readByteRecordResponse(int obfuscationGuard) {
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        ModelOriginSupport var3 = null;
        ByteRecordSubmission var4_ref_kg = null;
        int var4 = 0;
        Object var5 = null;
        byte[] var5_array = null;
        int var6 = 0;
        var6 = Pool.field_O;
        try {
          if (obfuscationGuard <= 104) {
            return;
          }
          var1 = PlayerContextMenu.field_e;
          var2 = var1.readUnsignedByte(-72);
          if (var2 != 0) {
            if (var2 != 1) {
              GrowableIntList.reportClientError((Throwable) null, "A1: " + PacketDiagnosticsSupport.formatPacketDump(93), -8555);
              ShotEvent.closeClientSocket(120);
              if (var6 == 0) {
                return;
              }
            }
            var3_int = var1.readInt(true);
            var4_ref_kg = (ByteRecordSubmission) (ArchiveLoadStep.field_c.last((byte) 86));
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (null != var4_ref_kg) {
                stackIn_21_0 = var3_int;
                decompiledFrameRemainder0 = (var6 == 0);
                if ((decompiledFrameRemainder0) &&
                  (stackIn_21_0 != var4_ref_kg.field_o)) {
                  var4_ref_kg = (ByteRecordSubmission) (ArchiveLoadStep.field_c.previous((byte) -5));
                  continue;
                }
              }
              if (decompiledFrameRemainder0) {
                if (null != var4_ref_kg) {
                  var4_ref_kg.unlink((byte) -117);
                  if (var6 == 0) {
                    return;
                  }
                  break;
                }
                stackIn_21_0 = 77;
              }
              ShotEvent.closeClientSocket(stackIn_21_0);
              return;
            }
          }
          var3 = (ModelOriginSupport) (LoginTextValue.field_f.last((byte) -101));
          if (var3 == null) {
            ShotEvent.closeClientSocket(116);
            return;
          }
          var4 = var1.readUnsignedByte(-70);
          if (var4 == 0) {
            var5 = null;
          }
          if (var4 != 0 ||
            var6 != 0) {
            var5_array = new byte[var4];
            var1.readBytes(0, (byte) -121, var5_array, var4);
          }
          var1.position = var1.position + 4;
          if (!var1.verifyChecksum(false)) {
            ShotEvent.closeClientSocket(112);
            return;
          }
          var3.unlink((byte) -117);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref), "nk.D(" + obfuscationGuard + ')');
        }
    }

    final static void resendRankingsRequests(int opcode, byte obfuscationGuard) {
        RuntimeException runtimeException = null;
        RankingsRequest var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pool.field_O;
        try {
          var2 = (RankingsRequest) (AccountTextSupport.field_c.last((byte) 120));
          while (null != var2) {
            RankingsProtocolSupport.sendRankingsRequest(var2, opcode, (byte) -96);
            var2 = (RankingsRequest) (AccountTextSupport.field_c.previous((byte) -5));
            if (var3 != 0) {
              return;
            }
          }
          if (obfuscationGuard != -91) {
            field_a = 119;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "nk.B(" + opcode + ',' + obfuscationGuard + ')');
        }
    }

    static {
        field_c = "to return to the normal view.";
        field_k = "Auto-respond to <%0>";
        field_g = new QuickChatDynamicCommand(2, 4, 4, 0);
        field_n = 15;
        field_e = false;
        field_j = 640;
        field_i = new String[3];
        field_o = "This password contains your Player Name, and would be easy to guess";
        field_h = 256;
    }
}
