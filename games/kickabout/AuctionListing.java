/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AuctionListing extends IntrusiveNode {
    private PlayerStats playerStats;
    static int field_e;
    private int field_g;
    static String[] field_l;
    private int listingType;
    static String field_i;
    private long auctionId;
    private int slotIndex;

    final boolean isSameListing(AuctionListing param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.auctionId != param0.getAuctionId(param1 ^ -5376)) {
            return false;
          }
          if (param1 != 5250) {
            this.listingType = 117;
          }
          if (this.listingType != param0.getListingType((byte) 37)) {
            return false;
          }
          if (~this.slotIndex != ~param0.getSlotIndex(3)) {
            return false;
          }
          if (this.field_g != param0.b(6)) {
            return false;
          }
          if (null != this.playerStats &&
            null != param0.playerStats &&
            !this.playerStats.isSameAs((byte) -98, param0.getPlayerStats(-78))) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("pt.C(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void pushRasterClip(int param0, int param1, int param2, int param3, int param4) {
        try {
          ClientUiOverlay.pushRasterState(-12974);
          SoftwareRasterizer.intersectClip(param2, param4, param0, param3);
          if (param1 != -22914) {
            field_e = -72;
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "pt.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int getListingType(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 37) {
            AuctionListing.a(true, (ResourceArchive) null);
          }
          stackIn_4_0 = this.listingType;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "pt.A(" + param0 + ')');
        }
    }

    final long getAuctionId(int param0) {
        RuntimeException var2 = null;
        long stackIn_2_0 = 0L;
        long stackIn_4_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -8) {
            stackIn_4_0 = this.auctionId;
            return stackIn_4_0;
          }
          stackIn_2_0 = 25L;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "pt.F(" + param0 + ')');
        }
    }

    final int getSlotIndex(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 3) {
            stackIn_4_0 = this.slotIndex;
            return stackIn_4_0;
          }
          stackIn_2_0 = -91;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "pt.D(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        CipherPacketBuffer var2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (!param0) {
            field_l = (String[]) null;
          }
          var2 = FootballerAiOverlaySupport.field_d;
          var2.writeIsaacByte(param1, (byte) 83);
          var2.writeByte(110, 1);
          var2.writeByte(123, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2_ref), "pt.J(" + param0 + ',' + param1 + ')');
        }
    }

    public final String toString() {
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          stackIn_1_0 = "Auction ID: " + this.auctionId + "  Type: " + this.listingType + " Index: " + this.slotIndex;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "pt.toString()");
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 9) {
          return;
        }
        try {
          field_i = null;
          field_l = null;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "pt.B(" + param0 + ')');
        }
    }

    final PlayerStats getPlayerStats(int param0) {
        RuntimeException var2 = null;
        PlayerStats stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -27) {
            this.slotIndex = -19;
          }
          stackIn_4_0 = this.playerStats;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "pt.L(" + param0 + ')');
        }
    }

    final void writeToPacket(PacketBuffer param0, int param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          param0.writeByte(124, 1);
          param0.writeByte(109, this.slotIndex << 4 | this.listingType);
          if (param1 != 5) {
            field_i = (String) null;
          }
          param0.writeInt(param1 - 113, this.field_g);
          param0.writeLong(this.auctionId, -1781890008);
          if (this.playerStats == null) {
            this.playerStats = new PlayerStats();
          }
          this.playerStats.writeToPacket((byte) 40, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("pt.K(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void readFromPacket(PacketBuffer param0, byte param1) {
        int var3_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 <= 86) {
            this.getSlotIndex(-96);
          }
          param0.readUnsignedByte((byte) -125);
          var3_int = param0.readUnsignedByte((byte) -108);
          this.listingType = var3_int & 15;
          this.slotIndex = (251 & var3_int) >> 4;
          this.field_g = param0.readInt(4);
          this.auctionId = param0.readLong((byte) -124);
          if (this.playerStats == null) {
            this.playerStats = new PlayerStats();
          }
          this.playerStats.readFromPacket(112, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("pt.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, ResourceArchive param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_2604_0;
            StringBuilder stackIn_2604_1;
            String stackIn_2605_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            boolean param0;
            ResourceArchive param1;
            boolean finished;
            $CfrPartitionedBody(boolean initialParam0, ResourceArchive initialParam1) {
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
                DraggableWidget.field_J = param1;
                var2 = HighScoreQuery.loadNamedResource((byte) -110, "loginm3");
                if (var2 != null) {
                  CheatCodeListener.field_h = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -86, "loginm2");
                if (null != var2) {
                  RegistrationRequestState.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -120, "loginm1");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -53, "idlemessage20min");
                if (null != var2) {
                  IntTripleCommand.field_D = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -108, "error_js5crc");
                if (var2 != null) {
                  DateInputWidget.field_F = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -104, "error_js5io");
                if (null != var2) {
                  CachedTextLayout.field_o = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -126, "error_js5connect_full");
                if (var2 != null) {
                  DialogOverlay.field_h = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -86, "error_js5connect");
                if (var2 != null) {
                  KitPatternMaskSupport.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -120, "login_gameupdated");
                if (null != var2) {
                  SortCriterion.field_m = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -117, "create_unable");
                if (null != var2) {
                  AccountInputValidationResult.field_i = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -97, "create_ineligible");
                if (var2 != null) {
                  GameSoundEffect.field_g = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -99, "usernameprompt");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -73, "passwordprompt");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -87, "andagainprompt");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -52, "ticketing_read");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -113, "ticketing_ignore");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -55, "ticketing_oneunread");
                if (null != var2) {
                  ProxySocketConnector.field_h = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -77, "ticketing_xunread");
                if (var2 != null) {
                  ScrollContainer.field_Lb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -72, "ticketing_gotowebsite");
                if (var2 != null) {
                  LobbyPlayerRow.field_Kb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -90, "ticketing_waitingformessages");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -50, "mu_chat_on");
                if (var2 != null) {
                  ClubState.field_Q = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -96, "mu_chat_friends");
                if (var2 != null) {
                  ConsoleExpression.field_n = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -96, "mu_chat_off");
                if (null != var2) {
                  GeneratedPanelPainter.field_j = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -50, "mu_chat_lobby");
                if (null != var2) {
                  ButtonMenuScreen.field_z = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -61, "mu_chat_public");
                if (null != var2) {
                  DraggableWidget.field_F = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -101, "mu_chat_ignore");
                if (null != var2) {
                  TrinketTile.field_Jb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -87, "mu_chat_tips");
                if (var2 != null) {
                  TextHotspotWidget.field_H = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -122, "mu_chat_game");
                if (var2 != null) {
                  ClientPacketFlushSupport.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -68, "mu_chat_private");
                if (var2 != null) {
                  GameOptionMenuSupport.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -111, "mu_x_entered_game");
                if (var2 != null) {
                  ShopPlayerSlot.field_Kb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -86, "mu_x_joined_your_game");
                if (var2 != null) {
                  ConsoleCommand.field_r = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -92, "mu_x_entered_other_game");
                if (var2 != null) {
                  StrongCacheEntry.field_E = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -127, "mu_x_left_lobby");
                if (null != var2) {
                  MusicTrackMixer.field_m = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -120, "mu_x_lost_con");
                if (null != var2) {
                  GameSetupPanel.field_lc = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -101, "mu_x_cannot_join_full");
                if (var2 != null) {
                  GzipDecoder.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -105, "mu_x_cannot_join_inprogress");
                if (null != var2) {
                  WhirlpoolHasher.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -99, "mu_x_declined_invite");
                if (null != var2) {
                  CachedListingRow.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -103, "mu_x_withdrew_request");
                if (null != var2) {
                  RankingRowNode.field_Cb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -86, "mu_x_removed");
                if (null != var2) {
                  SortCriterion.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -72, "mu_x_dropped_out");
                if (null != var2) {
                  TutorialMessages.field_g = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -84, "mu_entered_other_game");
                if (null != var2) {
                  GameOverView.field_E = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -87, "mu_game_is_full");
                if (var2 != null) {
                  QuickChatPhraseDefinition.field_s = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -98, "mu_game_has_started");
                if (null != var2) {
                  TooltipOverlay.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -63, "mu_you_declined_invite");
                if (var2 != null) {
                  GzipDecoder.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -52, "mu_invite_withdrawn");
                if (null != var2) {
                  MeshObject.field_g = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -127, "mu_request_declined");
                if (null != var2) {
                  PlayerPortraitCacheEntry.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -103, "mu_request_withdrawn");
                if (null != var2) {
                  PitchProjectionSupport.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -109, "mu_all_players_have_left");
                if (null != var2) {
                  AnimationClip.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -113, "mu_lobby_name");
                if (null != var2) {
                  WorldSpriteDecoration.field_h = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -90, "mu_lobby_rating");
                if (var2 != null) {
                  GoalSpriteLoader.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -80, "mu_lobby_friend_add");
                if (var2 != null) {
                  ExceptionTextSupport.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -72, "mu_lobby_friend_rm");
                if (null != var2) {
                  ButtonMenuScreen.field_k = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -66, "mu_lobby_name_add");
                if (null != var2) {
                  CheatCodeListener.field_j = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -115, "mu_lobby_name_rm");
                if (var2 != null) {
                  IsSixCommand.field_D = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -116, "mu_lobby_location");
                if (var2 != null) {
                  TextFieldNode.field_Vb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -60, "mu_gamelist_all_games");
                if (var2 != null) {
                  ConsoleValue.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -123, "mu_gamelist_status");
                if (null != var2) {
                  NameSuggestionsPanel.field_B = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -55, "mu_gamelist_owner");
                if (var2 != null) {
                  UrlRequest.field_j = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -76, "mu_gamelist_players");
                if (var2 != null) {
                  ThreadSleepSupport.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -99, "mu_gamelist_avg_rating");
                if (null != var2) {
                  UiLayoutNode.field_C = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -126, "mu_gamelist_options");
                if (var2 != null) {
                  ArchiveManager.field_j = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -60, "mu_gamelist_elapsed_time");
                if (null != var2) {
                  MatchHudSupport.field_h = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -106, "mu_play_rated");
                if (null != var2) {
                  MatchTextInputOverlay.field_n = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -71, "mu_create_unrated");
                if (null != var2) {
                  PlatformTaskState.field_g = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -74, "mu_options");
                if (var2 != null) {
                  IntDoubleCommand.field_F = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -75, "mu_options_whocanjoin");
                if (var2 != null) {
                  ConsoleArgumentSupport.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -124, "mu_options_players");
                if (var2 != null) {
                  Checkbox.field_H = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -99, "mu_options_dontmind");
                if (null != var2) {
                  FaceNormal.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -116, "mu_options_allow_spectate");
                if (null != var2) {
                  GzipDecoder.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -61, "mu_options_ratedgametype");
                if (var2 != null) {
                  DisplayNameUiSupport.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -74, "yes");
                if (var2 != null) {
                  MachineTokenStorageSupport.field_g = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -114, "no");
                if (var2 != null) {
                  ScrollPane.field_Db = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -113, "mu_invite_players");
                if (var2 != null) {
                  SocialRowOrderSupport.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -114, "close");
                if (null != var2) {
                  CalendarSupport.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -124, "add_x_to_friends");
                if (null != var2) {
                  DualLinkNode.field_m = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -61, "add_x_to_ignore");
                if (null != var2) {
                  WeightedCacheEntry.field_r = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -120, "rm_x_from_friends");
                if (null != var2) {
                  Trinket.field_i = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -50, "rm_x_from_ignore");
                if (null != var2) {
                  LeaderboardParticipant.field_i = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -112, "send_pm_to_x");
                if (null != var2) {
                  LeaderboardParticipant.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -74, "send_qc_to_x");
                if (null != var2) {
                  GameMediaSupport.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -57, "send_pm");
                if (null != var2) {
                  ModelMaterialDecoder.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -52, "invite_accept_xs_game");
                if (null != var2) {
                  SocketArchiveNetworkClient.field_u = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -73, "invite_decline_xs_game");
                if (null != var2) {
                  ReceivedAuctionItem.field_z = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -99, "join_xs_game");
                if (null != var2) {
                  SelectionMarkerSupport.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -72, "join_request_xs_game");
                if (null != var2) {
                  GameplayHelpScreen.field_H = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -115, "join_withdraw_request_xs_game");
                if (null != var2) {
                  QuickChatCommandType.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -75, "mu_gameopt_kick_x_from_this_game");
                if (var2 != null) {
                  VertexNormal.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -79, "mu_gameopt_withdraw_invite_to_x");
                if (var2 != null) {
                  FullscreenFocusCanvas.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -58, "mu_gameopt_accept_x_into_game");
                if (var2 != null) {
                  IconLabel.field_Ab = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -97, "mu_gameopt_reject_x_from_game");
                if (null != var2) {
                  ScrollBar.field_Eb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -95, "mu_gameopt_invite_x_to_game");
                if (null != var2) {
                  PlayingView.field_F = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -105, "report_x_for_abuse");
                if (null != var2) {
                  MatchTextInputOverlay.field_m = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -125, "unable_to_send_message_password_a");
                if (null != var2) {
                  ServerTextTemplate.field_i = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -81, "unable_to_send_message_password_b");
                if (var2 != null) {
                  PlayerInputFactory.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -89, "mu_chat_lobby_show_all");
                if (var2 != null) {
                  MatchHudSupport.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -64, "mu_chat_lobby_friends_only");
                if (null != var2) {
                  SpriteBackgroundSupport.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -116, "mu_chat_lobby_friends");
                if (null != var2) {
                  IntValueNode.field_h = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -89, "mu_chat_lobby_hide");
                if (var2 != null) {
                  ConsoleParseException.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -86, "mu_chat_game_show_all");
                if (null != var2) {
                  AnimationFrameset.field_p = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -94, "mu_chat_game_friends_only");
                if (var2 != null) {
                  PlayerInputFactory.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -127, "mu_chat_game_friends");
                if (var2 != null) {
                  QuickChatKeysHelpPanel.field_Bb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -50, "mu_chat_game_hide");
                if (null != var2) {
                  KitStyleDefinition.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -98, "mu_chat_pm_show_all");
                if (null != var2) {
                  ValidationIndicator.field_I = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -111, "mu_chat_pm_friends_only");
                if (var2 != null) {
                  SpriteState.field_u = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -74, "mu_chat_pm_friends");
                if (null != var2) {
                  SharedSpriteTables.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -91, "mu_chat_invisible_and_silent_mode");
                if (var2 != null) {
                  TextWidgetPainter.field_g = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -76, "you_have_been_removed_from_xs_game");
                if (var2 != null) {
                  EmailSyntaxValidator.field_j = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -110, "your_rating_is_x");
                if (var2 != null) {
                  StatefulTextPainter.field_r = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -119, "you_are_on_x_server");
                if (var2 != null) {
                  RegistrationUiSupport.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -126, "rated_game");
                if (var2 != null) {
                  SharedChatLayoutSupport.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -75, "unrated_game");
                if (null != var2) {
                  ModelMaterial.field_i = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -103, "rated_game_tips");
                if (var2 != null) {
                  SessionUrlSupport.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -88, "searching_for_opponent_singular");
                if (var2 != null) {
                  ColorQuantizationBox.field_g = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -59, "searching_for_opponents_plural");
                if (var2 != null) {
                  PlayerArchetypeSortCriterion.field_s = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -124, "find_opponent_singular");
                if (null != var2) {
                  LeaderboardParticipant.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -95, "find_opponents_plural");
                if (null != var2) {
                  AuctionListingDialog.field_F = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -118, "rated_game_tips_setup_singular");
                if (var2 != null) {
                  PitchSurfaceLoader.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -115, "rated_game_tips_setup_plural");
                if (null != var2) {
                  MenuSelection.field_j = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -72, "waiting_to_start_hint");
                if (null != var2) {
                  CheckboxLabelWidget.field_Db = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -126, "your_game");
                if (null != var2) {
                  TabStrip.field_zb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -101, "game_full");
                if (var2 != null) {
                  LeagueWinnerDialog.field_I = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -60, "join_requests_one");
                if (var2 != null) {
                  LobbyGameRecord.field_i = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -113, "join_requests_many");
                if (null != var2) {
                  PopupDialog.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -121, "xs_game");
                if (var2 != null) {
                  AccountNameAvailabilityValidator.field_m = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -112, "waiting_for_x_to_start_game");
                if (var2 != null) {
                  SpriteResourceSupport.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -106, "game_options_changed");
                if (var2 != null) {
                  ModelMaterial.field_h = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -107, "players_x_of_y");
                if (null != var2) {
                  DateOfBirthPanel.field_F = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -99, "message_lobby");
                if (null != var2) {
                  ShopPlayerSlot.field_Cb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -78, "quickchat_lobby");
                if (null != var2) {
                  DualLinkHashTable.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -112, "message_game");
                if (var2 != null) {
                  LoginDialog.field_db = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -121, "message_team");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -88, "quickchat_game");
                if (var2 != null) {
                  CachedTextLayout.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -114, "kick");
                if (null != var2) {
                  ClubStateFactory.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -109, "inviting_x");
                if (null != var2) {
                  SocialListLayoutSupport.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -53, "x_wants_to_join");
                if (var2 != null) {
                  HighScoreQuery.field_p = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -77, "accept");
                if (null != var2) {
                  AvailabilityCheckRequest.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -52, "reject");
                if (null != var2) {
                  DemoIntegersCommand.field_A = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -101, "invite");
                if (null != var2) {
                  LoginPacketSupport.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -82, "status_concluded");
                if (var2 != null) {
                  LinkTextPainter.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -102, "status_spectate");
                if (null != var2) {
                  TextPromptDialog.field_Hb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -99, "status_playing");
                if (var2 != null) {
                  AudioOutputSupport.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -67, "status_join");
                if (null != var2) {
                  FullscreenFailureReason.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -91, "status_private");
                if (var2 != null) {
                  ImageProducerRasterBuffer.field_m = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -121, "status_full");
                if (null != var2) {
                  LoadingProgressDialog.field_R = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -82, "players_in_game");
                if (null != var2) {
                  ScrollPane.field_Eb = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -89, "you_are_invited_to_xs_game");
                if (null != var2) {
                  TextButton.field_x = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -98, "asking_to_join_xs_game");
                if (null != var2) {
                  SetLagCommand.field_C = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -105, "who_can_join");
                if (var2 != null) {
                  ClassNameSupport.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -71, "you_can_join");
                if (null != var2) {
                  BrowserUiSupport.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -52, "you_can_ask_to_join");
                if (null != var2) {
                  ModelMaterial.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -95, "you_cannot_join_in_progress");
                if (null != var2) {
                  PagedHelpScreen.field_B = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -122, "you_can_spectate");
                if (null != var2) {
                  TextInputWidget.field_U = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -117, "you_can_not_spectate");
                if (var2 != null) {
                  SquadPickerDialog.field_G = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -59, "spectate_xs_game");
                if (var2 != null) {
                  SelectableTrinketIcon.field_Ab = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -78, "hide_players_in_xs_game");
                if (var2 != null) {
                  FullscreenDisplayMode.field_h = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -126, "show_players_in_xs_game");
                if (var2 != null) {
                  KitUnlockNoticeSupport.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -85, "connecting_to_friend_server_twoline");
                if (var2 != null) {
                  TutorialChoiceDialog.field_I = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -78, "loading");
                if (null != var2) {
                  CheckboxLabelWidget.field_yb = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -119, "offline");
                if (null != var2) {
                  TextInputWidget.field_K = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -50, "multiconst_invite_only");
                if (null != var2) {
                  ConsoleExpression.field_m = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -96, "multiconst_clan");
                if (null != var2) {
                  IconButtonPainter.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -89, "multiconst_friends");
                if (var2 != null) {
                  LobbyMatchPreview.field_h = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -63, "multiconst_similar_rating");
                if (null != var2) {
                  MatchUiLayoutSupport.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -58, "multiconst_open");
                if (null != var2) {
                  TeamSelectionAgent.field_g = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -112, "no_options_available");
                if (null != var2) {
                  TextInputWidget.field_M = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -118, "reportabuse");
                if (var2 != null) {
                  MatchHudSupport.field_i = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -70, "presstabtochat");
                if (null != var2) {
                  LineupView.field_n = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -80, "pressf10toquickchat");
                if (null != var2) {
                  ChatComposeMode.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -74, "dob_chatdisabled");
                if (null != var2) {
                  SellPlayerDialog.field_H = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -70, "dob_enterforchat");
                if (null != var2) {
                  DebugConsole.field_v = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -73, "tab_hidechattemporarily");
                if (null != var2) {
                  TextEntrySupport.field_h = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -116, "esc_cancelprivatemessage");
                if (var2 != null) {
                  IntrusiveNodeHashTable.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -53, "esc_cancelthisline");
                if (var2 != null) {
                  ListRow.field_Bb = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -71, "privatequickchat_from_x");
                if (null != var2) {
                  UiLayoutNode.field_ib = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -60, "privatequickchat_to_x");
                if (null != var2) {
                  MySquadScreen.field_F = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -108, "privatechat_blankarea_explanation");
                if (var2 != null) {
                  FormationView.field_s = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -110, "publicchat_unavailable_ratedgame");
                if (var2 != null) {
                  MatchTextInputOverlay.field_g = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -71, "privatechat_friend_offline");
                if (null != var2) {
                  ChatComposeSupport.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -81, "privatechat_friend_notlisted");
                if (null != var2) {
                  BrowserUiSupport.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -93, "chatviewscrolledup");
                if (null != var2) {
                  ThumbnailStateFactory.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -124, "thisisrunescapeclan");
                if (var2 != null) {
                  DateOfBirthPanel.field_B = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -111, "thisisrunescapeclan_notowner");
                if (var2 != null) {
                  ClubState.field_v = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -51, "runescapeclan");
                if (null != var2) {
                  RasterGlowSupport.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -106, "rated_membersonly");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -98, "gameopt_membersonly");
                if (var2 != null) {
                  TeamSelectionAgent.field_n = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -72, "gameopt_1moreratedgame");
                if (var2 != null) {
                  UiKeyRoutingSupport.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -57, "gameopt_moreratedgames");
                if (var2 != null) {
                  DiagnosticsOverlaySupport.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -119, "gameopt_needrating");
                if (null != var2) {
                  IsaacRandom.field_h = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -68, "gameopt_unratedonly");
                if (var2 != null) {
                  DialogOverlay.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -69, "gameopt_notunlocked");
                if (null != var2) {
                  AccountRequestDialog.field_bb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -53, "gameopt_cannotbecombined1");
                if (var2 != null) {
                  ChatComposeSupport.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -97, "gameopt_cannotbecombined2");
                if (null != var2) {
                  PlayerModelPreview.field_m = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -56, "gameopt_playernotmember");
                if (var2 != null) {
                  FadingSoundPlayer.field_v = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -113, "gameopt_younotmember");
                if (null != var2) {
                  RenderedBall.field_F = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -115, "gameopt_playerneedsrating");
                if (null != var2) {
                  CommonGame.field_D = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -64, "gameopt_youneedrating");
                if (null != var2) {
                  RegistrationRequestState.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -62, "gameopt_playerneedsratedgames");
                if (null != var2) {
                  TextEntrySupport.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -115, "gameopt_youneedratedgames");
                if (null != var2) {
                  VertexNormal.field_h = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -83, "gameopt_playerneeds1ratedgame");
                if (null != var2) {
                  SessionUrlSupport.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -121, "gameopt_youneed1ratedgame");
                if (null != var2) {
                  BlackFadeScreen.field_k = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -111, "gameopt_playerhasntunlocked");
                if (null != var2) {
                  ClassDescriptorSupport.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -82, "gameopt_youhaventunlocked");
                if (null != var2) {
                  GradientRasterSupport.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -103, "gameopt_trychanging1");
                if (var2 != null) {
                  LoadingProgressDialog.field_V = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -64, "gameopt_trychanging2");
                if (null != var2) {
                  TextFieldNode.field_Cb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -120, "gameopt_needchanging1");
                if (null != var2) {
                  WorldDrawEntry.field_l = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -70, "gameopt_needchanging2");
                if (var2 != null) {
                  SocialRowOrderSupport.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -60, "gameopt_mightchange");
                if (var2 != null) {
                  LoginRequiredDialog.field_F = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -109, "gameopt_playersdontqualify");
                if (var2 != null) {
                  MusicPatchPcmStream.field_m = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -116, "gameopt_playersdontqualify_selectgametab");
                if (var2 != null) {
                  TrinketSlot.field_Fb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -94, "gameopt_unselectedoptions");
                if (null != var2) {
                  StringCursor.field_g = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -61, "gameopt_pleaseselectoption1");
                if (null != var2) {
                  WriteIntegersCommand.field_D = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -108, "gameopt_pleaseselectoption2");
                if (var2 != null) {
                  RenderedFootballer.field_S = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -74, "gameopt_badnumplayers");
                if (var2 != null) {
                  Bzip2State.field_w = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -85, "gameopt_inviteplayers_or_trychanging1");
                if (var2 != null) {
                  ColumnTableWidget.field_yb = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -67, "gameopt_inviteplayers_or_trychanging2");
                if (null != var2) {
                  IntValueNode.field_k = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
            }
            void runChunk1() throws java.lang.RuntimeException {
                var2 = HighScoreQuery.loadNamedResource((byte) -74, "gameopt_novalidcombos");
                if (null != var2) {
                  SpriteButtonPainter.field_t = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -69, "gameopt_pleasetrychanging");
                if (null != var2) {
                  DirectByteStorage.field_h = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -93, "ra_title");
                if (var2 != null) {
                  ConsoleParseException.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -103, "ra_mutethisplayer");
                if (var2 != null) {
                  TickClock.field_h = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -104, "ra_suggestmute");
                if (var2 != null) {
                  ArchiveRequest.field_s = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -111, "ra_intro");
                if (null != var2) {
                  RankingRowNode.field_Ib = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -90, "ra_intro_no_name");
                if (null != var2) {
                  SocialNamePrompt.field_Bb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -65, "ra_explanation");
                if (var2 != null) {
                  LoginPacketSupport.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -81, "rule_pillar_0");
                if (null != var2) {
                  BuyPlayerDialog.field_F = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -114, "rule_0_0");
                if (null != var2) {
                  TextLine.field_j = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -82, "rule_0_1");
                if (var2 != null) {
                  ClientUiUpdateSupport.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -102, "rule_0_2");
                if (null != var2) {
                  PanelSpriteFactory.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -75, "rule_0_3");
                if (null != var2) {
                  GradientRasterSupport.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -114, "rule_0_4");
                if (var2 != null) {
                  ShopPlayerSlot.field_Eb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -116, "rule_0_5");
                if (null != var2) {
                  AuctionItem.field_n = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -72, "rule_pillar_1");
                if (var2 != null) {
                  DateInputWidget.field_H = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -83, "rule_1_0");
                if (var2 != null) {
                  ListingRowCache.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -54, "rule_1_1");
                if (var2 != null) {
                  ImageProducerRasterBuffer.field_k = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -81, "rule_1_2");
                if (null != var2) {
                  ThreadSleepSupport.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -89, "rule_1_3");
                if (var2 != null) {
                  LoginMethod.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -84, "rule_1_4");
                if (var2 != null) {
                  PitchSurfaceLoader.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -93, "rule_pillar_2");
                if (var2 != null) {
                  ScrollContainer.field_Hb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -94, "rule_2_0");
                if (var2 != null) {
                  ParticipantStatus.field_o = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -56, "rule_2_1");
                if (var2 != null) {
                  BlobSubmission.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -70, "rule_2_2");
                if (null != var2) {
                  TutorialChoiceDialog.field_F = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -60, "createafreeaccount");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -58, "cancel");
                if (null != var2) {
                  AsciiCharacterSupport.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -122, "pleaselogintoplay");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -71, "pleaselogin");
                if (null != var2) {
                  NineSlicePanelPainter.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -95, "pleaselogin_member");
                if (var2 != null) {
                  FullscreenFailureReason.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -77, "invaliduserorpass");
                if (null != var2) {
                  PitchPurchaseSupport.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -73, "pleasetryagain");
                if (var2 != null) {
                  AccountTermsPanel.field_L = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -113, "pleasereenterpass");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -121, "playfreeversion");
                if (var2 != null) {
                  GameModesHelpScreen.field_O = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -52, "reloadgame");
                if (var2 != null) {
                  MatchHudRoutingSupport.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -64, "toserverlist");
                if (null != var2) {
                  WelcomeDialog.field_J = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -64, "tocustomersupport");
                if (var2 != null) {
                  AccountNameAvailabilityValidator.field_p = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -101, "changedisplayname");
                if (null != var2) {
                  ThreeCommand.field_C = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -50, "returntohomepage");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -82, "justplay");
                if (var2 != null) {
                  TrinketCountSortCriterion.field_o = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -120, "justplay_excl");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -100, "login");
                if (var2 != null) {
                  ValidationHelpWidget.field_P = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -83, "goback");
                if (null != var2) {
                  PitchDecorationSupport.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -67, "otheroptions");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -104, "proceed");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -79, "connectingtoserver");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -94, "pleasewait");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -94, "logging_in");
                if (var2 != null) {
                  ImageProducerRasterBuffer.field_g = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -54, "reconnect");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -114, "backtoerror");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -54, "pleasecheckinternet");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -125, "attemptingtoreconnect");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -108, "connectionlost_reconnecting");
                if (null != var2) {
                  TextInputUiSupport.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -95, "connectionlost_withreason");
                if (var2 != null) {
                  EmailAvailabilityValidator.field_l = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -128, "passwordverificationrequired");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -54, "invalidpass");
                if (null != var2) {
                  OffscreenPlayerArrow.field_j = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -58, "retry");
                if (null != var2) {
                  QuickChatCategoryCache.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -127, "back");
                if (null != var2) {
                  TextLineLayoutSupport.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -51, "exitfullscreenmode");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -64, "quittowebsite");
                if (null != var2) {
                  AccountNameAvailabilityValidator.field_o = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -85, "connectionrestored");
                if (var2 != null) {
                  AchievementSubmission.field_m = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -64, "warning_ifyouquit");
                if (null != var2) {
                  DebugConsole.field_x = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -66, "warning_ifyouquitorleavepage");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -104, "resubscribe_withoutlosing_fs");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -105, "resubscribe_withoutlosing");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -62, "customersupport_withoutlosing_fs");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -95, "customersupport_withoutlosing");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -77, "js5help_withoutlosing_fs");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -56, "js5help_withoutlosing");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -105, "checkinternet_withoutlosing_fs");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -87, "checkinternet_withoutlosing");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -63, "create_intro");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -120, "create_sameaccounttip_unnamed");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -127, "dateofbirthprompt");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -85, "fetchingcountrylist");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -70, "countryprompt");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -114, "countrylisterror");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -57, "theonlypersonalquestions");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -109, "create_submittingdata");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -83, "check");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -61, "create_pleasechooseausername");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -68, "create_usernameblurb");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -85, "checkingavailability");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -116, "checking");
                if (var2 != null) {
                  SectorCacheStore.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -121, "create_namealreadytaken");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -102, "create_sameaccounttip_named");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -95, "create_nosuggestions");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -95, "create_alternativelygoback");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -107, "create_available");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -82, "create_willnowshowtermsandconditions");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -90, "fetchingterms");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -102, "termserror");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -108, "create_iagree");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -103, "create_idisagree");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -58, "create_pleasescrolldowntoaccept");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -68, "create_linkaddress");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -79, "openinpopupwindow");
                if (null != var2) {
                  PendingRequestAcknowledgement.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -71, "create");
                if (var2 != null) {
                  AudioOutputSupport.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -86, "create_pleasechooseapassword");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -75, "create_passwordblurb");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -105, "create_nevergivepassword");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -104, "creatingyouraccount");
                if (var2 != null) {
                  TriangleMesh.field_L = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -118, "create_youmustaccept");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -67, "create_passwordsdifferent");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -113, "create_success");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -102, "day");
                if (null != var2) {
                  LoginText.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -79, "month");
                if (null != var2) {
                  MatchAgent.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -105, "year");
                if (null != var2) {
                  TrinketTile.field_Ab = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -97, "monthnames,0");
                if (null != var2) {
                  ClientProtocolStage.field_a[0] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -120, "monthnames,1");
                if (var2 != null) {
                  ClientProtocolStage.field_a[1] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -51, "monthnames,2");
                if (var2 != null) {
                  ClientProtocolStage.field_a[2] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -120, "monthnames,3");
                if (var2 != null) {
                  ClientProtocolStage.field_a[3] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -88, "monthnames,4");
                if (null != var2) {
                  ClientProtocolStage.field_a[4] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -76, "monthnames,5");
                if (var2 != null) {
                  ClientProtocolStage.field_a[5] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -54, "monthnames,6");
                if (var2 != null) {
                  ClientProtocolStage.field_a[6] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -123, "monthnames,7");
                if (null != var2) {
                  ClientProtocolStage.field_a[7] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -97, "monthnames,8");
                if (null != var2) {
                  ClientProtocolStage.field_a[8] = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -52, "monthnames,9");
                if (null != var2) {
                  ClientProtocolStage.field_a[9] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -122, "monthnames,10");
                if (null != var2) {
                  ClientProtocolStage.field_a[10] = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -116, "monthnames,11");
                if (var2 != null) {
                  ClientProtocolStage.field_a[11] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -92, "create_welcome");
                if (null != var2) {
                  PitchDecorationSupport.field_i = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -109, "create_u13_welcome");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -109, "create_createanaccount");
                if (null != var2) {
                  ConsoleEvaluationException.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -89, "create_username");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -110, "create_displayname");
                if (var2 != null) {
                  GoalStateAgent.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -82, "create_password");
                if (var2 != null) {
                  TrinketTile.field_Ib = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -124, "create_password_confirm");
                if (var2 != null) {
                  PendingRequestAcknowledgement.field_h = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -71, "create_email");
                if (null != var2) {
                  ReflectionCheck.field_i = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -67, "create_email_confirm");
                if (null != var2) {
                  GameAppletShell.field_n = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -52, "create_age");
                if (var2 != null) {
                  GameOptionMenuSupport.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -126, "create_u13_email");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -92, "create_u13_email_confirm");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -51, "create_dob");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -97, "create_country");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -59, "create_alternatives_header");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -76, "create_alternatives_select");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -128, "create_suggestions");
                if (null != var2) {
                  CheatCodeListener.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -83, "create_more_suggestions");
                if (var2 != null) {
                  PlayingView.field_K = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -115, "create_select_alternative");
                if (null != var2) {
                  TextHotspotWidget.field_G = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -50, "create_optin_news");
                if (var2 != null) {
                  StrongCacheEntry.field_v = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -111, "create_agreeterms");
                if (null != var2) {
                  SquadGridWidget.field_Ab = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -119, "create_u13terms");
                if (null != var2) {
                  NodeHashTableIterator.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -65, "login_username_email");
                if (null != var2) {
                  GameplayHelpScreen.field_J = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -73, "login_username");
                if (var2 != null) {
                  ConsoleTokenCursor.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -116, "login_email");
                if (var2 != null) {
                  SetLagCommand.field_A = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -104, "login_username_tooltip");
                if (var2 != null) {
                  SquadGridWidget.field_yb = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -113, "login_password_tooltip");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -99, "login_login_tooltip");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -57, "login_create_tooltip");
                if (var2 != null) {
                  AppletContextSupport.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -77, "login_justplay_tooltip");
                if (null != var2) {
                  HelpTipDialog.field_G = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -126, "login_back_tooltip");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -83, "login_no_displayname");
                if (var2 != null) {
                  AsciiCharacterSupport.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -92, "create_username_tooltip");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -84, "create_username_hint");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -72, "create_displayname_tooltip");
                if (null != var2) {
                  SortCriterion.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -118, "create_displayname_hint");
                if (var2 != null) {
                  MusicPatch.field_i = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -119, "create_password_tooltip");
                if (null != var2) {
                  PlayerValueSortCriterion.field_o = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -88, "create_password_hint");
                if (!param0) {
                  field_i = (String) null;
                }
                if (var2 != null) {
                  LongPlusOneCommand.field_A = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -79, "create_password_confirm_tooltip");
                if (null != var2) {
                  UiLayoutNode.field_Z = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -109, "create_email_tooltip");
                if (var2 != null) {
                  ColourSwatchTile.field_Bb = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -117, "create_email_confirm_tooltip");
                if (null != var2) {
                  TutorialChoiceDialog.field_G = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -103, "create_age_tooltip");
                if (null != var2) {
                  SpriteState.field_r = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -107, "create_optin_news_tooltip");
                if (null != var2) {
                  ExceptionTextSupport.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -76, "create_u13_email_tooltip");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -90, "create_u13_email_confirm_tooltip");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -99, "create_dob_tooltip");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -55, "create_country_tooltip");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -107, "create_optin_tooltip");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -103, "create_continue");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -96, "create_username_unavailable");
                if (null != var2) {
                  ModalStack.field_B = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -128, "create_username_available");
                if (var2 != null) {
                  Kickabout.field_I = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -89, "create_alert_namelength");
                if (var2 != null) {
                  TeamSelectionView.field_m = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -75, "create_alert_namechars");
                if (null != var2) {
                  GameOptionMenuSupport.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -68, "create_alert_nameleadingspace");
                if (null != var2) {
                  SocketArchiveNetworkClient.field_r = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -50, "create_alert_doublespace");
                if (var2 != null) {
                  TextHotspotWidget.field_N = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -56, "create_alert_passchars");
                if (var2 != null) {
                  GoalStateAgent.field_h = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -58, "create_alert_passrepeated");
                if (null != var2) {
                  NotCommand.field_D = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -93, "create_alert_passlength");
                if (var2 != null) {
                  MySquadScreen.field_M = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -124, "create_alert_passcontainsname");
                if (var2 != null) {
                  ClientUiUpdateSupport.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -78, "create_alert_passcontainsemail");
                if (null != var2) {
                  LeagueWinnerDialog.field_G = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -124, "create_alert_passcontainsname_partial");
                if (var2 != null) {
                  AppScreen.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -107, "create_alert_checkname");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -119, "create_alert_invalidemail");
                if (var2 != null) {
                  ScrollContainer.field_Cb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -54, "create_alert_email_unavailable");
                if (null != var2) {
                  MatchHudRoutingSupport.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -97, "create_alert_invaliddate");
                if (null != var2) {
                  TextEntrySupport.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -50, "create_alert_invalidage");
                if (null != var2) {
                  AccountMessagePanel.field_F = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -63, "create_alert_yearrange");
                if (var2 != null) {
                  StringCursor.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -104, "create_alert_mismatch");
                if (var2 != null) {
                  PlayerArchetypeSortCriterion.field_p = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -67, "create_passwordvalid");
                if (var2 != null) {
                  AuctionHelpResources.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -113, "create_emailvalid");
                if (null != var2) {
                  LookupQuery.field_g = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -50, "create_account_success");
                if (null != var2) {
                  PitchPurchaseSupport.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -75, "invalid_name");
                if (null != var2) {
                  SquadSlotWidget.field_Ib = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -97, "cannot_add_yourself");
                if (var2 != null) {
                  LoginText.field_g = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -59, "unable_to_add_friend");
                if (null != var2) {
                  UiKeyRoutingSupport.field_h = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -96, "unable_to_add_ignore");
                if (var2 != null) {
                  TrinketSlot.field_Ab = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -124, "unable_to_delete_friend");
                if (null != var2) {
                  CanvasResizePolicy.field_t = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -90, "unable_to_delete_ignore");
                if (var2 != null) {
                  ShopPlayerSlot.field_Db = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -81, "friendlistfull");
                if (null != var2) {
                  DraggableWidget.field_A = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -70, "friendlistdupe");
                if (null != var2) {
                  GameAppletShell.field_m = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -84, "friendnotfound");
                if (var2 != null) {
                  AuctionPriceLimits.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -58, "ignorelistfull");
                if (var2 != null) {
                  QuickChatPhraseCache.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -66, "ignorelistdupe");
                if (null != var2) {
                  FriendRemovalSupport.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -101, "ignorenotfound");
                if (null != var2) {
                  DoSomethingCommand.field_A = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -62, "removeignorefirst");
                if (var2 != null) {
                  TrinketTile.field_Gb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -66, "removefriendfirst");
                if (var2 != null) {
                  field_i = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -90, "enterfriend_add");
                if (null != var2) {
                  MainMenuScreen.field_G = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -115, "enterfriend_del");
                if (null != var2) {
                  TabStrip.field_yb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -63, "enterignore_add");
                if (null != var2) {
                  ParticipantStatus.field_j = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -106, "enterignore_del");
                if (null != var2) {
                  PlatformTaskState.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -91, "text_removed_from_game");
                if (null != var2) {
                  IntTripleCommand.field_B = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -87, "text_lobby_pleaselogin_free");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -92, "opengl");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -83, "sse");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -74, "purejava");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -72, "waitingfor_graphics");
                if (var2 != null) {
                  CommonGame.field_M = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -106, "waitingfor_models");
                if (null != var2) {
                  LobbyMatchPreview.field_n = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -73, "waitingfor_fonts");
                if (var2 != null) {
                  QuickChatMenuFactory.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -70, "waitingfor_soundeffects");
                if (var2 != null) {
                  TextLayoutLine.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -85, "waitingfor_music");
                if (var2 != null) {
                  SelectableTrinketIcon.field_yb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -123, "waitingfor_instruments");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -76, "waitingfor_levels");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -117, "waitingfor_extradata");
                if (null != var2) {
                  TeamSelectionAgent.field_l = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -66, "waitingfor_languages");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -86, "waitingfor_textures");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -122, "waitingfor_animations");
                if (null != var2) {
                  RankingRowFactory.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -117, "loading_graphics");
                if (var2 != null) {
                  BufferedSocket.field_q = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
            }
            void runChunk2() throws java.lang.RuntimeException {
                var2 = HighScoreQuery.loadNamedResource((byte) -103, "loading_models");
                if (var2 != null) {
                  CachedTextLayout.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -69, "loading_fonts");
                if (null != var2) {
                  TextLine.field_l = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -122, "loading_soundeffects");
                if (null != var2) {
                  TutorialCaptionSupport.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -86, "loading_music");
                if (var2 != null) {
                  MyPitchScreen.field_H = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -98, "loading_instruments");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -122, "loading_levels");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -104, "loading_extradata");
                if (null != var2) {
                  SumIntegersCommand.field_H = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -97, "loading_languages");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -111, "loading_textures");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -87, "loading_animations");
                if (null != var2) {
                  MatchTextInputOverlay.field_l = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -84, "unpacking_graphics");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -51, "unpacking_models");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -52, "unpacking_soundeffects");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -55, "unpacking_music");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -77, "unpacking_levels");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -126, "unpacking_languages");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -100, "unpacking_animations");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -125, "unpacking_toolkit");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -50, "instructions");
                if (var2 != null) {
                  MeshPreviewSupport.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -79, "tutorial");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -113, "playtutorial");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -114, "sound_colon");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -50, "music_colon");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -113, "fullscreen");
                if (null != var2) {
                  MenuButton.field_i = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -119, "screensize");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -53, "highscores");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -52, "rankings");
                if (null != var2) {
                  SocialNamePrompt.field_zb = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -50, "achievements");
                if (null != var2) {
                  DualLinkDeque.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -108, "achievementsthisgame");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -93, "achievementsthissession");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -106, "watchintroduction");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -86, "quit");
                if (null != var2) {
                  ManagerAction.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -123, "login_createaccount");
                if (null != var2) {
                  MenuButton.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -54, "tohighscores");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -102, "returntomainmenu");
                if (null != var2) {
                  RegistrationRequestState.field_g = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -60, "returntopausemenu");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -89, "returntooptionsmenu_notpaused");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -97, "mainmenu");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -62, "pausemenu");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -78, "optionsmenu_notpaused");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -115, "menu");
                if (var2 != null) {
                  ConsoleEvaluationException.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -97, "selectlevel");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -64, "nextlevel");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -53, "startgame");
                if (null != var2) {
                  BlankScreen.field_g = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -125, "newgame");
                if (null != var2) {
                  AlternateKeyedLoginCredentials.field_l = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -53, "resumegame");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -86, "resumetutorial");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -82, "skip");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -94, "skiptutorial");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -61, "skipending");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -75, "restartlevel");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -116, "endtest");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -120, "endgame");
                if (null != var2) {
                  IconLabel.field_Eb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -87, "endtutorial");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -60, "ok");
                if (var2 != null) {
                  MatchScreen.field_x = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -52, "on");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -112, "off");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -94, "previous");
                if (null != var2) {
                  RotaryDialPainter.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -70, "prev");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -88, "next");
                if (null != var2) {
                  TrinketIcon.field_Db = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -121, "graphics_colon");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -126, "hotseatmultiplayer");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -104, "entermultiplayerlobby");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -122, "singleplayergame");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -84, "returntogame");
                if (var2 != null) {
                  TeamManagementScreen.field_E = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -116, "endgameresign");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -112, "offerdraw");
                if (var2 != null) {
                  NumericDateInputWidget.field_N = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -82, "canceldraw");
                if (var2 != null) {
                  DiagnosticsOverlaySupport.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -128, "acceptdraw");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -66, "resign");
                if (null != var2) {
                  MonotonicClock.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -84, "returntolobby");
                if (null != var2) {
                  NotificationPanelPositionSupport.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -110, "cont");
                if (null != var2) {
                  RowRangeRequest.field_g = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -127, "continue_spectating");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -68, "messages");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -116, "graphics_fastest");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -65, "graphics_medium");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -59, "graphics_best");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -115, "graphics_directx");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -58, "graphics_opengl");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -70, "graphics_java");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -96, "graphics_quality_high");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -77, "graphics_quality_low");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -107, "graphics_mode");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -99, "graphics_quality");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -54, "mode");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -113, "quality");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -68, "keys");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -96, "objective");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -88, "currentobjective");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -92, "pressescforpausemenu");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -111, "pressescforpausemenuortoskiptutorial");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -120, "pressescforoptionsmenu_doesntpause");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -58, "pressescforoptionsmenu_doesntpause_short");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -68, "powerups");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -70, "latestlevel_suffix");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -109, "unreachedlevel_name");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -54, "unreachedlevel_cannotplayreason");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -53, "unreachedlevel_cannotplayreason_shorter");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -95, "unreachedworld_cannotplayreason");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -115, "memberslevel_name");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -61, "memberslevel_cannotplayreason");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -100, "membersworld_cannotplayreason");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -87, "unreachedlevel_createtip");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -114, "unreachedlevel_createtip_line1");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -97, "unreachedlevel_createtip_line2");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -66, "unreachedlevel_logintip");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -86, "memberslevel_logintip");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -58, "displayname_none");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -110, "levelxofy1");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -52, "levelxofy2");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -115, "levelxofy");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -90, "ingame_level");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -69, "mouseoveranicon");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -123, "notyetachieved");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -65, "achieved");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -105, "orbpoints");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -111, "orbcoins");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -114, "orbpoints_colon");
                if (null != var2) {
                  ImageProducerRasterBuffer.field_l = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -92, "orbcoins_colon");
                if (var2 != null) {
                  SocialRowOrderSupport.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -75, "achieved_colon_description");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -59, "secretachievement");
                if (var2 != null) {
                  NetworkGameClient.field_w = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -57, "no_highscores");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -50, "hs_name");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -58, "hs_level");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -77, "hs_fromlevel");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -80, "hs_tolevel");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -101, "hs_score");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -72, "hs_end");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -103, "ingame_score");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -90, "score_colon");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -57, "mp_leavegame");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -95, "mp_offerrematch");
                if (null != var2) {
                  MonotonicClock.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -54, "mp_offerrematch_unrated");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -71, "mp_acceptrematch");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -74, "mp_acceptrematch_unrated");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -52, "mp_cancelrematch");
                if (var2 != null) {
                  HuffmanTextSupport.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -123, "mp_cancelrematch_unrated");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -91, "mp_rematchnewgame");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -84, "mp_rematchnewgame_unrated");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -124, "mp_x_wantstodraw");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -122, "mp_x_offersrematch");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -106, "mp_x_offersrematch_unrated");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -74, "mp_youofferrematch");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -116, "mp_youofferrematch_unrated");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -86, "mp_youofferdraw");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -101, "mp_youresigned");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -100, "mp_youresigned_rematch");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -70, "mp_x_hasresignedandleft");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -76, "mp_x_hasresigned_rematch");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -55, "mp_x_hasresigned");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -85, "mp_x_hasleft");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -116, "mp_x_haswon");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -104, "mp_youhavewon");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -72, "mp_gamedrawn");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -127, "mp_timeremaining");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -99, "mp_x_turn");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -113, "mp_yourturn");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -61, "gameover");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -64, "mp_hidechat");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -121, "mp_showchat_nounread");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -92, "mp_showchat_unread1");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -54, "mp_showchat_unread2");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -69, "click_to_quickchat");
                if (null != var2) {
                  MidiPcmStream.field_t = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -68, "autorespond");
                if (null != var2) {
                  MonotonicClock.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -92, "quickchat_help");
                if (null != var2) {
                  MatchTextInputOverlay.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -94, "quickchat_help_title");
                if (null != var2) {
                  LoggedPlayer.field_l = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -52, "quickchat_shortcut_help,0");
                if (null != var2) {
                  ClientProtocolStage.field_b[0] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -52, "quickchat_shortcut_help,1");
                if (var2 != null) {
                  ClientProtocolStage.field_b[1] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -124, "quickchat_shortcut_help,2");
                if (null != var2) {
                  ClientProtocolStage.field_b[2] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -75, "quickchat_shortcut_help,3");
                if (var2 != null) {
                  ClientProtocolStage.field_b[3] = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -76, "quickchat_shortcut_help,4");
                if (null != var2) {
                  ClientProtocolStage.field_b[4] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -118, "quickchat_shortcut_help,5");
                if (null != var2) {
                  ClientProtocolStage.field_b[5] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -93, "quickchat_shortcut_keys,0");
                if (null != var2) {
                  MatchTransitionScreen.field_A[0] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -123, "quickchat_shortcut_keys,1");
                if (var2 != null) {
                  MatchTransitionScreen.field_A[1] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -90, "quickchat_shortcut_keys,2");
                if (null != var2) {
                  MatchTransitionScreen.field_A[2] = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -105, "quickchat_shortcut_keys,3");
                if (var2 != null) {
                  MatchTransitionScreen.field_A[3] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -69, "quickchat_shortcut_keys,4");
                if (var2 != null) {
                  MatchTransitionScreen.field_A[4] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -83, "quickchat_shortcut_keys,5");
                if (var2 != null) {
                  MatchTransitionScreen.field_A[5] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -106, "keychar_the_character_under_questionmark");
                if (var2 != null) {
                  CipherPacketBuffer.field_v = FootballerAgent.decodeCp1252Byte(false, var2[0]);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -113, "rating_noratings");
                if (null != var2) {
                  CheckboxLabelWidget.field_Fb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -100, "rating_rating");
                if (var2 != null) {
                  CachedArchiveSource.field_p = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -96, "rating_played");
                if (null != var2) {
                  StreetSceneryLoader.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -50, "rating_won");
                if (var2 != null) {
                  GoalSpriteLoader.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -50, "rating_lost");
                if (null != var2) {
                  MouseInputHandler.field_e = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -71, "rating_drawn");
                if (null != var2) {
                  TeamManagementScreen.field_D = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -126, "benefits_fullscreen");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -118, "benefits_noadverts");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -90, "benefits_price");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -110, "members_expansion_benefits,0");
                if (var2 != null) {
                  ArchiveSource.field_f[0] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -101, "members_expansion_benefits,1");
                if (null != var2) {
                  ArchiveSource.field_f[1] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -71, "members_expansion_benefits,2");
                if (var2 != null) {
                  ArchiveSource.field_f[2] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -93, "members_expansion_price_top");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -61, "members_expansion_price_bottom");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -97, "reconnect_lost_seq,0");
                if (var2 != null) {
                  LeaguesScreen.field_F[0] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -121, "reconnect_lost_seq,1");
                if (null != var2) {
                  LeaguesScreen.field_F[1] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -105, "reconnect_lost_seq,2");
                if (null != var2) {
                  LeaguesScreen.field_F[2] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -66, "reconnect_lost_seq,3");
                if (var2 != null) {
                  LeaguesScreen.field_F[3] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -74, "reconnect_lost");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -119, "reconnect_restored");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -61, "reconnect_please_check");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -87, "reconnect_wait");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -78, "reconnect_retry");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -124, "reconnect_resume");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -66, "reconnect_or");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -57, "reconnect_exitfs");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -104, "reconnect_exitfs_quit");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -114, "reconnect_quit");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -121, "reconnect_check_fs");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -101, "reconnect_check_nonfs");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -101, "fs_accept_beforeaccept");
                if (var2 != null) {
                  LoginText.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -88, "fs_button_accept");
                if (var2 != null) {
                  IconButtonPainter.field_f = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -56, "fs_accept_afteraccept");
                if (var2 != null) {
                  RasterGlowSupport.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -69, "fs_button_cancel");
                if (var2 != null) {
                  LinkTextPainter.field_g = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -83, "fs_accept_aftercancel");
                if (var2 != null) {
                  ChatMessage.field_k = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -82, "fs_accept_countdown_sing");
                if (var2 != null) {
                  TextFieldNode.field_Kb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -70, "fs_accept_countdown_pl");
                if (null != var2) {
                  FormationView.field_o = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -52, "fs_nonmember");
                if (var2 != null) {
                  SocialListProtocolSupport.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -96, "fs_button_close");
                if (null != var2) {
                  SharedPanelFactory.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -74, "fs_button_members");
                if (var2 != null) {
                  ScrollContainer.field_Jb = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -54, "fs_unavailable");
                if (null != var2) {
                  GrowableIntList.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -78, "fs_unavailable_try_signed_applet");
                if (null != var2) {
                  ValidatedTextWidget.field_bb = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -117, "fs_focus");
                if (var2 != null) {
                  AnimationSkeleton.field_n = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -58, "fs_focus_or_resolution");
                if (var2 != null) {
                  TextLine.field_k = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -80, "fs_timeout");
                if (null != var2) {
                  ClassNameSupport.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -99, "fs_button_tryagain");
                if (null != var2) {
                  ConsoleArgumentSupport.field_c = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -83, "graphics_ui_fs_countdown");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -118, "mb_caption_title");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -67, "mb_including_gamename");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -117, "mb_full_access_1");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -96, "mb_full_access_2");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -55, "mb_achievement_count_1");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -118, "mb_achievement_count_2");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -76, "mb_exclusive_1");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -117, "mb_exclusive_2");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -100, "me_extra_benefits");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -124, "hs_friend_tip");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -128, "hs_friend_tip_multi");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -50, "hs_mode_name,0");
                if (null != var2) {
                  AccountNameCharacterSupport.field_a[0] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
            }
            void runChunk3() throws java.lang.RuntimeException {
                var2 = HighScoreQuery.loadNamedResource((byte) -90, "hs_mode_name,1");
                if (var2 != null) {
                  AccountNameCharacterSupport.field_a[1] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -63, "hs_mode_name,2");
                if (var2 != null) {
                  AccountNameCharacterSupport.field_a[2] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -127, "rating_mode_name,0");
                if (null != var2) {
                  RankingRowFactory.field_f[0] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -93, "rating_mode_name,1");
                if (var2 != null) {
                  RankingRowFactory.field_f[1] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -103, "rating_mode_long_name,0");
                if (null != var2) {
                  ClientUiOverlay.field_f[0] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -82, "rating_mode_long_name,1");
                if (null != var2) {
                  ClientUiOverlay.field_f[1] = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -79, "graphics_config_fixed_size");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -101, "graphics_config_resizable");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -119, "graphics_config_fullscreen");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -86, "graphics_config_done");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -116, "graphics_config_apply");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -59, "graphics_config_title");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -122, "graphics_config_instruction");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -106, "graphics_config_need_memory");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -65, "pleasewait_dotdotdot");
                if (null != var2) {
                  RegistrationUiSupport.field_a = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -80, "serviceunavailable");
                if (null != var2) {
                  QuickChatPhraseDefinition.field_o = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -96, "createtouse");
                if (null != var2) {
                  LineupPositionSupport.field_b = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -114, "achievementsoffline");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -98, "warning");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -123, "DEFAULT_PLAYER_NAME");
                if (null != var2) {
                  DisplayNameUiSupport.field_d = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -85, "mustlogin1");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -101, "mustlogin2,1");
                if (var2 != null) {
                  SpriteState.field_x[1] = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -85, "mustlogin2,2");
                if (var2 != null) {
                  SpriteState.field_x[2] = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -77, "mustlogin2,3");
                if (var2 != null) {
                  SpriteState.field_x[3] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -76, "mustlogin2,4");
                if (var2 != null) {
                  SpriteState.field_x[4] = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -117, "mustlogin2,5");
                if (var2 != null) {
                  SpriteState.field_x[5] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -53, "mustlogin2,6");
                if (null != var2) {
                  SpriteState.field_x[6] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -103, "mustlogin2,7");
                if (var2 != null) {
                  SpriteState.field_x[7] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -66, "mustlogin3,1");
                if (var2 != null) {
                  InputLayoutState.field_a[1] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -111, "mustlogin3,2");
                if (null != var2) {
                  InputLayoutState.field_a[2] = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -127, "mustlogin3,3");
                if (var2 != null) {
                  InputLayoutState.field_a[3] = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -123, "mustlogin3,4");
                if (null != var2) {
                  InputLayoutState.field_a[4] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -76, "mustlogin3,5");
                if (null != var2) {
                  InputLayoutState.field_a[5] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -87, "mustlogin3,6");
                if (null != var2) {
                  InputLayoutState.field_a[6] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -93, "mustlogin3,7");
                if (var2 != null) {
                  InputLayoutState.field_a[7] = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -90, "discard");
                if (null != var2) {
                  GameOverView.field_n = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -60, "mustlogin4,1");
                if (null != var2) {
                  UrlRequest.field_b[1] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -96, "mustlogin4,2");
                if (null != var2) {
                  UrlRequest.field_b[2] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -70, "mustlogin4,3");
                if (null != var2) {
                  UrlRequest.field_b[3] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -67, "mustlogin4,4");
                if (null != var2) {
                  UrlRequest.field_b[4] = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -82, "mustlogin4,5");
                if (var2 != null) {
                  UrlRequest.field_b[5] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -111, "mustlogin4,6");
                if (var2 != null) {
                  UrlRequest.field_b[6] = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -68, "mustlogin4,7");
                if (null != var2) {
                  UrlRequest.field_b[7] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -60, "mustlogin_notloggedin");
                if (null != var2) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -121, "mustlogin_alternate,1");
                if (var2 != null) {
                  GameResourceLoader.field_b[1] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -91, "mustlogin_alternate,2");
                if (var2 != null) {
                  GameResourceLoader.field_b[2] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -66, "mustlogin_alternate,3");
                if (var2 != null) {
                  GameResourceLoader.field_b[3] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -94, "mustlogin_alternate,4");
                if (var2 != null) {
                  GameResourceLoader.field_b[4] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -109, "mustlogin_alternate,5");
                if (var2 != null) {
                  GameResourceLoader.field_b[5] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -78, "mustlogin_alternate,6");
                if (var2 != null) {
                  GameResourceLoader.field_b[6] = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -124, "mustlogin_alternate,7");
                if (null != var2) {
                  GameResourceLoader.field_b[7] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -126, "subscription_cost_monthly,0");
                if (var2 != null) {
                  EntityAfterimage.field_i[0] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -106, "subscription_cost_monthly,1");
                if (null != var2) {
                  EntityAfterimage.field_i[1] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -86, "subscription_cost_monthly,2");
                if (var2 != null) {
                  EntityAfterimage.field_i[2] = BlackFadeScreen.decodeCp1252Bytes(var2, param0);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -113, "subscription_cost_monthly,3");
                if (var2 != null) {
                  EntityAfterimage.field_i[3] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -76, "subscription_cost_monthly,4");
                if (var2 != null) {
                  EntityAfterimage.field_i[4] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -102, "subscription_cost_monthly,5");
                if (null != var2) {
                  EntityAfterimage.field_i[5] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -86, "subscription_cost_monthly,6");
                if (var2 != null) {
                  EntityAfterimage.field_i[6] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -106, "subscription_cost_monthly,7");
                if (null != var2) {
                  EntityAfterimage.field_i[7] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -67, "subscription_cost_monthly,8");
                if (null != var2) {
                  EntityAfterimage.field_i[8] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -94, "subscription_cost_monthly,9");
                if (null != var2) {
                  EntityAfterimage.field_i[9] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -102, "subscription_cost_monthly,10");
                if (null != var2) {
                  EntityAfterimage.field_i[10] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -59, "subscription_cost_monthly,11");
                if (null != var2) {
                  EntityAfterimage.field_i[11] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -83, "subscription_cost_monthly,12");
                if (null != var2) {
                  EntityAfterimage.field_i[12] = BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                var2 = HighScoreQuery.loadNamedResource((byte) -122, "sentence_separator");
                if (var2 != null) {
                  BlackFadeScreen.decodeCp1252Bytes(var2, true);
                }
                DraggableWidget.field_J = null;
            }
            void run() {
                var3 = Kickabout.field_G;
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
                  stackIn_2604_0 = (RuntimeException) (var2_ref);
                  stackIn_2604_1 = new StringBuilder().append("pt.H(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_2605_2 = "null";
                  } else {
                    stackIn_2605_2 = "{...}";
                  }
                  throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_2604_0), ((StringBuilder) (Object) stackIn_2604_1).append(stackIn_2605_2).append(')').toString());
                }
                if (GameAppletShell.field_d) {
                  var3++;
                  Kickabout.field_G = var3;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    final int b(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 6) {
            this.auctionId = -31L;
          }
          stackIn_4_0 = this.field_g;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "pt.I(" + param0 + ')');
        }
    }

    AuctionListing(long param0, int param1, int param2, int param3, PlayerStats param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.listingType = param1;
          this.slotIndex = param2;
          this.playerStats = param4;
          this.field_g = param3;
          this.auctionId = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pt.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    AuctionListing(PacketBuffer param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.readFromPacket(param0, (byte) 115);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pt.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_l = new String[]{"Online Auctions", "Online Auctions"};
        field_i = "Please remove <%0> from your friend list first.";
    }
}
