/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Kickabout extends GameLoopApplet {
    private boolean field_L;
    static ResourceArchive field_J;
    static String field_I;
    static UiLayoutNode field_H;
    static String field_F;
    public static int field_G;

    public final void update(int param0, boolean param1) {
        boolean stackIn_3_1 = false;
        boolean stackIn_17_0 = false;
        AppScreen stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        boolean stackIn_31_2 = false;
        boolean stackIn_59_0 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        AuctionListing var8;
        AuctionListing var9;
        boolean stackIn_59_0Lifetime1;
        boolean stackIn_59_0Lifetime2;
        var7 = field_G;
        stackIn_3_1 = (param1);
        boolean decompiledFrameRemainder0 = true;
        this.field_L = stackIn_3_1;
        ColourSwatchTile.serviceFadingAudio(17702);
        if (ByteStorage.field_c &&
          this.field_L && ((null != SplashScreen.field_m ||
          PitchDecorationSupport.field_k) &&
          (GameModesHelpScreen.field_G != null &&
          MachineTokenStorageSupport.field_e == GameModesHelpScreen.field_G ||
          AuctionLogEntry.field_h == MachineTokenStorageSupport.field_e &&
          null == GameModesHelpScreen.field_G)) && MachineTokenStorageSupport.field_e.canUsePitchPointer((byte) 29)) {
          stackIn_17_0 = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_17_0 = false;
        }
        AvailabilityCheckRequest.b(stackIn_17_0, (byte) -116);
        CheckboxPainter.b(param0 ^ -105);
        ((GameResourceLoader) (NetworkGameClient.field_t)).pollMessageOfTheDay(0);
        if (MachineTokenStorageSupport.field_e == null &&
          !FadingSoundPlayer.field_q &&
          !PlayerValueSortCriterion.field_n ||
          null != MachineTokenStorageSupport.field_e &&
          MyKitScreen.field_O) {
          MenuButton.a(2);
        }
        if (param0 != -25) {
          this.onShutdown((byte) -89);
        }
        stackIn_30_0 = AuctionLogEntry.field_h;
        stackIn_30_1 = -96;
        stackIn_31_2 = (this.field_L) && (null == GameModesHelpScreen.field_G);
        ((AppScreen) (Object) stackIn_30_0).updateScreen((byte) stackIn_30_1, stackIn_31_2);
        if (GameModesHelpScreen.field_G == null) {
          if (MachineTokenStorageSupport.field_e != null &&
            AuctionLogEntry.field_h != MachineTokenStorageSupport.field_e) {
            MachineTokenStorageSupport.field_e.updateScreen((byte) 119, false);
          } else {
            if (null != SortCriterion.field_l &&
              SortCriterion.field_l != AuctionLogEntry.field_h) {
              SortCriterion.field_l.updateScreen((byte) -116, false);
            }
          }
        } else {
          var3 = (BuyPlayerDialog.field_I << 8) / 24;
          AuctionLogEntry.field_h.setTransitionProgress(var3, false, -53, GameModesHelpScreen.field_G);
          GameModesHelpScreen.field_G.setTransitionProgress(var3, true, -100, AuctionLogEntry.field_h);
          GameModesHelpScreen.field_G.updateScreen((byte) -51, false);
          if (!GameQuickChatResolver.field_b) {
            BuyPlayerDialog.field_I = BuyPlayerDialog.field_I + 1;
          }
          var4 = -BuyPlayerDialog.field_I + 24;
          var5 = (var4 * var4 << 8) / 576;
          var6 = -var5 + 256;
          FormationAgent.field_f = var5 * SocialRowOrderSupport.getScreenPanelWidth(AuctionLogEntry.field_h, -4) + SocialRowOrderSupport.getScreenPanelWidth(GameModesHelpScreen.field_G, -4) * var6 >> 8;
          if (BuyPlayerDialog.field_I == 24) {
            MeshObject.a((byte) 105);
          }
        }
        ImageProducerRasterBuffer.updateMenuCamera(true);
        if (this.field_L) {
          var9 = (AuctionListing) (GameLoopApplet.field_E.auctionListings.first(24009));
          while (true) {
            if (var9 != null) {
              var9.unlink((byte) -109);
              stackIn_59_0 = ColourSwatchTile.isAuctionListingUnqueued(param0 ^ -149, var9);
              if (stackIn_59_0) {
                ContextMenu.a((byte) -25, var9, true);
              }
              var9 = (AuctionListing) (GameLoopApplet.field_E.auctionListings.next(33));
              continue;
            }
            break;
          }
          var8 = (AuctionListing) (AccountNameCheckState.field_a.first(param0 + 24034));
          while (var8 != null) {
            var8.unlink((byte) -109);
            stackIn_59_0Lifetime1 = ColourSwatchTile.isAuctionListingUnqueued(140, var8);
            if (stackIn_59_0Lifetime1) {
              ContextMenu.a((byte) -25, var8, false);
            }
            var8 = (AuctionListing) (AccountNameCheckState.field_a.next(33));
          }
          stackIn_59_0Lifetime2 = GameLoopApplet.field_E.field_m;
          if (stackIn_59_0Lifetime2) {
            HuffmanTextSupport.enqueueLeagueWinnerDialog(0);
            GameLoopApplet.field_E.field_m = false;
          }
          this.updateLogoHover(param0 ^ 23294);
        }
        if (PlayArea.isGuestSession(100) &&
          AccountNameCharacterSupport.field_f) {
          MatchHudRoutingSupport.enqueueWelcomeDialog(31663);
          AccountNameCharacterSupport.field_f = false;
        }
    }

    private final void updateLogoHover(int param0) {
        if (param0 != -23271) {
          return;
        }
        if (IntKeyLookup.field_b == null ||
          "" == IntKeyLookup.field_b) {
          return;
        }
        if (WorldDrawEntry.getScreenBackgroundOpacity(AuctionLogEntry.field_h, param0 + 23275) == 0) {
          return;
        }
        ArgbSprite var2 = DelayedServerPacket.field_g == null ? (ArgbSprite) (MainMenuScreen.field_C) : DelayedServerPacket.field_g;
        int var3 = -var2.field_o + 640 >> 1;
        if (BytePlusOneCommand.field_A >= var3 && var2.field_o + var3 >= BytePlusOneCommand.field_A && 10 <= ArchiveManager.field_m &&
          !(ArchiveManager.field_m > (10 + var2.field_v))) {
          IndexedSpriteState.$cfr$intArgs$a$b6210757cdab(-67, IntKeyLookup.field_b);
        }
    }

    final void onConnectionResult(int param0, byte param1) {
        int var3;
        int var4;
        var4 = field_G;
        LobbyGameRecord.a(4, -120);
        SquadGridWidget.resendRankingsRequests(7, (byte) -97);
        if (AuctionLogEntry.field_h instanceof FindingOpponentScreen) {
          DelayedServerPacket.a(0, false, -2);
        }
        var3 = -37 % ((-39 - param1) / 32);
        if (param0 == 1) {
          QuickChatPhraseCache.field_d = true;
          LoginText.field_e = true;
        } else {
          if (PlayerValueSortCriterion.field_n) {
            TextButton.field_B = true;
            FriendsListPanel.field_Db = true;
            StreetSceneryLoader.field_k = true;
            if (null != MachineTokenStorageSupport.field_e) {
              if (!MachineTokenStorageSupport.field_e.isSpectator(-2)) {
                GameQuickChatResolver.a(2, IntTripleCommand.field_B);
                ServerTextTemplate.a(10, 113);
              } else {
                ServerTextTemplate.a(0, 104);
              }
              DelayedServerPacket.a(18, false, -2);
            } else {
              if (SortCriterion.field_l == null) {
                DelayedServerPacket.a(0, false, -2);
              } else {
                GameQuickChatResolver.a(2, IntTripleCommand.field_B);
                ServerTextTemplate.a(10, 112);
                DelayedServerPacket.a(18, false, -2);
              }
            }
            PlayerValueSortCriterion.field_n = false;
            PitchSurfaceLoader.b(1);
          }
          LoginText.field_e = false;
          QuickChatPhraseCache.field_d = false;
        }
    }

    public static void releaseStatics(byte param0) {
        field_H = null;
        field_I = null;
        field_F = null;
        field_J = null;
        if (param0 >= -35) {
          Kickabout.releaseStatics((byte) -40);
        }
    }

    private final void drawLogoBanner(int param0) {
        int var3;
        int var4;
        int var5;
        int var6;
        ArgbSprite var7;
        Object stackIn_5_0 = null;
        if (param0 < 95) {
          return;
        }
        if (null != DelayedServerPacket.field_g) {
          stackIn_5_0 = DelayedServerPacket.field_g;
        } else {
          stackIn_5_0 = MainMenuScreen.field_C;
        }
        var7 = (ArgbSprite) (stackIn_5_0);
        var3 = 640 - var7.field_o >> 1;
        var4 = WorldDrawEntry.getScreenBackgroundOpacity(AuctionLogEntry.field_h, 4);
        if (GameModesHelpScreen.field_G != null) {
          var5 = WorldDrawEntry.getScreenBackgroundOpacity(GameModesHelpScreen.field_G, 4);
          if (var4 > var5) {
            var6 = Math.min(256, (BuyPlayerDialog.field_I << 9) / 24);
            var4 = var4 + ((-var4 + var5) * var6 >> 8);
          } else {
            if (var5 > var4) {
              var6 = Math.max(0, -256 + 2 * ((BuyPlayerDialog.field_I << 8) / 24));
              var4 = var4 + ((-var4 + var5) * var6 >> 8);
            }
          }
        }
        if (256 == var4) {
          var7.draw(var3, 10);
        }
        if (0 != var4) {
          var7.drawAlpha(var3, 10, var4);
        }
    }

    public final boolean handleKeyTyped(int param0, int param1, char param2) {
        int var8 = 0;
        int var7 = 0;
        int fieldTemp$0 = 0;
        boolean stackIn_38_0 = false;
        boolean stackIn_44_0 = false;
        boolean stackIn_49_0 = false;
        boolean stackIn_55_0 = false;
        boolean stackIn_60_0 = false;
        boolean stackIn_75_0 = false;
        boolean stackIn_81_0 = false;
        boolean stackIn_86_0 = false;
        boolean stackIn_92_0 = false;
        boolean stackIn_97_0 = false;
        boolean stackIn_109_0 = false;
        boolean stackIn_115_0 = false;
        boolean stackIn_120_0 = false;
        boolean stackIn_126_0 = false;
        boolean stackIn_131_0 = false;
        boolean stackIn_140_0 = false;
        int stackIn_146_0 = 0;
        boolean stackIn_151_0 = false;
        boolean stackIn_156_0 = false;
        boolean stackIn_163_0 = false;
        boolean stackIn_168_0 = false;
        boolean stackIn_174_0 = false;
        boolean stackIn_183_0 = false;
        boolean stackIn_192_0 = false;
        boolean stackIn_240_0 = false;
        boolean stackOut_139_0;
        int var4;
        int var5;
        int var6_int;
        AppScreen var6;
        String[] var7_ref_String__;
        int var9;
        String[] var10;
        String var11;
        ManagerAction var12;
        int var6_intLifetime1;
        int stackIn_146_0Lifetime1;
        int var6_intLifetime2;
        int var6_intLifetime3;
        var9 = field_G;
        var4 = GameplayHelpScreen.field_G[82] ? 1 : 0;
        var5 = GameplayHelpScreen.field_G[86] ? 1 : 0;
        if (GameQuickChatResolver.field_b &&
          83 == param1) {
          BuyPlayerDialog.field_I = BuyPlayerDialog.field_I + 1;
          return true;
        }
        if (param1 == 103 &&
          SocketArchiveNetworkClient.field_v == 1) {
          SocketArchiveNetworkClient.field_v = 0;
        }
        if (102 == param1 &&
          SocketArchiveNetworkClient.field_v == 0) {
          SocketArchiveNetworkClient.field_v = 1;
        }
        if (AchievementsScreen.hasJagexModeratorRights(false)) {
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder0 = true;
          if (var4 != 0 &&
            var5 != 0) {
            if ((param1 != 51) &&
              (decompiledFrameRemainder0 = (param2 != 96))) {
              ListingRowCache.field_a = false;
              return true;
            }
            if (decompiledFrameRemainder0) {
              var11 = "The quick brown fox jumped over the lazy rabbit. Also this sentence is getting quite long with some long words that might not fit at end of a sentence/line but we shall see. Oooh double-barrel-ness, see how it deals with that.";
              var10 = RasterBuffer.a(var11, 100, (byte) -69);
              var7_ref_String__ = var10;
              if (var7_ref_String__ == null) {
                return true;
              }
              for (var8 = 0; var10.length > var8; var8++) {
                System.out.println(var10[var8]);
              }
              return true;
            }
          }
          if (decompiledFrameRemainder0) {
            if (param2 == 96) {
              ClientProtocolStage.field_d = new DebugConsole(EmailSyntaxValidator.d((byte) 26), IsSixCommand.field_C, PlatformTaskState.field_c);
              OverlayLayerSupport.registerOverlay(false, ClientProtocolStage.field_d);
              return ClientProtocolStage.field_d.handleKeyTyped(11516, param1, param2);
            }
            if (param1 == 89) {
              System.gc();
              return true;
            }
            decompiledFrameRemainder2 = (var4 != 0);
            if ((decompiledFrameRemainder2) &&
              (var5 != 0)) {
              if (param1 == 1) {
                AnimationClip.a(RankingsScreen.field_C, param0 - 11592, false, KitPatternMaskSupport.field_c);
                SelectionMarkerSupport.a(0);
                return true;
              }
              if (2 == param1) {
                AnimationClip.a(RankingsScreen.field_C, -76, true, KitPatternMaskSupport.field_c);
                SelectionMarkerSupport.a(0);
                return true;
              }
              if (16 == param1) {
                stackIn_75_0 = !(ListingRowCache.field_a);
                ListingRowCache.field_a = stackIn_75_0;
                return true;
              }
              if (param1 == 17) {
                stackIn_81_0 = !(LookupRecordUpdate.field_k);
                LookupRecordUpdate.field_k = stackIn_81_0;
                return true;
              }
              if (param1 == 18) {
                stackIn_86_0 = !(LineupAgent.field_o);
                LineupAgent.field_o = stackIn_86_0;
                return true;
              }
              if (param1 == 19) {
                stackIn_92_0 = !(FadingSoundSupport.field_d);
                FadingSoundSupport.field_d = stackIn_92_0;
                return true;
              }
              if (param1 == 20) {
                stackIn_97_0 = !(LineupAgent.field_g);
                LineupAgent.field_g = stackIn_97_0;
                return true;
              }
              decompiledFrameRemainder1 = (param1 == 21);
              if (decompiledFrameRemainder1) {
                for (var6_int = 0; GameLoopApplet.field_E.field_J.length > var6_int; var6_int++) {
                  GameLoopApplet.field_E.field_J[var6_int] = true;
                }
                decompiledFrameRemainder3 = false;
              }
            }
          }
          if ((decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            if (16 == param1) {
              stackIn_38_0 = !(ListingRowCache.field_a);
              ListingRowCache.field_a = stackIn_38_0;
              return true;
            }
            if (param1 == 17) {
              stackIn_44_0 = !(LookupRecordUpdate.field_k);
              LookupRecordUpdate.field_k = stackIn_44_0;
              return true;
            }
            if (param1 == 18) {
              stackIn_49_0 = !(LineupAgent.field_o);
              LineupAgent.field_o = stackIn_49_0;
              return true;
            }
            if (param1 == 19) {
              stackIn_55_0 = !(FadingSoundSupport.field_d);
              FadingSoundSupport.field_d = stackIn_55_0;
              return true;
            }
            if (param1 == 20) {
              stackIn_60_0 = !(LineupAgent.field_g);
              LineupAgent.field_g = stackIn_60_0;
              return true;
            }
            decompiledFrameRemainder1 = (param1 == 21);
            if (decompiledFrameRemainder1) {
              for (var6_intLifetime3 = 0; GameLoopApplet.field_E.field_J.length > var6_intLifetime3; var6_intLifetime3++) {
                GameLoopApplet.field_E.field_J[var6_intLifetime3] = true;
              }
            }
          }
          if ((decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (!PlayArea.isGuestSession(100))) {
            var6_intLifetime2 = 0;
            for (var7 = 0; var7 < GameLoopApplet.field_E.field_J.length; var7++) {
              stackOut_139_0 = GameLoopApplet.field_E.field_J[var7];
              stackIn_146_0 = stackOut_139_0 ? 1 : 0;
              stackIn_140_0 = stackOut_139_0;
              if (stackIn_140_0) {
                var6_intLifetime2 = var6_intLifetime2 | 1 << var7;
              }
            }
            FootballerAiOverlaySupport.field_d.writeIsaacByte(69, (byte) -54);
            FootballerAiOverlaySupport.field_d.writeInt(-88, var6_intLifetime2);
          }
          if (decompiledFrameRemainder2) {
            stackIn_146_0Lifetime1 = -23;
            if (stackIn_146_0Lifetime1 == ~param1) {
              stackIn_151_0 = !(ChatComposeSupport.field_e);
              ChatComposeSupport.field_e = stackIn_151_0;
              return true;
            }
            if (param1 == 23) {
              stackIn_156_0 = !(LeaderboardParticipant.field_f);
              LeaderboardParticipant.field_f = stackIn_156_0;
              if (null == MachineTokenStorageSupport.field_e) {
                return true;
              }
              MachineTokenStorageSupport.field_e.rebuildRenderedMatch(-109);
              return true;
            }
            if (param1 == 24) {
              stackIn_163_0 = !(SquadPickerDialog.field_K);
              SquadPickerDialog.field_K = stackIn_163_0;
              return true;
            }
            if (param1 == 25) {
              stackIn_168_0 = !(GameQuickChatResolver.field_b);
              GameQuickChatResolver.field_b = stackIn_168_0;
              return true;
            }
            if (26 == param1) {
              stackIn_174_0 = !(SelectionMarkerSupport.field_g);
              SelectionMarkerSupport.field_g = stackIn_174_0;
              return true;
            }
            if (27 == param1) {
              fieldTemp$0 = PendingRequestAcknowledgement.field_j + 1;
              PendingRequestAcknowledgement.field_j = PendingRequestAcknowledgement.field_j + 1;
              PendingRequestAcknowledgement.field_j = fieldTemp$0 & 3;
              return true;
            }
            if (85 == param1) {
              stackIn_183_0 = !(IsSixCommand.field_B);
              IsSixCommand.field_B = stackIn_183_0;
              return true;
            }
            if (35 == param1) {
              FormationView.b((byte) -116);
            }
            if (param1 == 39) {
              stackIn_192_0 = !(DisplayNameUiSupport.field_e);
              DisplayNameUiSupport.field_e = stackIn_192_0;
              return true;
            }
            if (param1 == 40 &&
              !PlayArea.isGuestSession(param0 ^ 11416)) {
              FootballerAiOverlaySupport.field_d.writeIsaacByte(85, (byte) 112);
              return true;
            }
            if (param1 == 41 &&
              !PlayArea.isGuestSession(100)) {
              FootballerAiOverlaySupport.field_d.writeIsaacByte(80, (byte) 114);
              return true;
            }
            if (param1 == 56 &&
              !PlayArea.isGuestSession(100)) {
              FootballerAiOverlaySupport.field_d.writeIsaacByte(81, (byte) 107);
              FootballerAiOverlaySupport.field_d.field_n = FootballerAiOverlaySupport.field_d.field_n + 2;
              var6_intLifetime1 = FootballerAiOverlaySupport.field_d.field_n;
              FootballerAiOverlaySupport.field_d.writeByte(113, 1);
              var12 = new ManagerAction(3, new int[]{0, 0});
              var12.writeToPacket(1, FootballerAiOverlaySupport.field_d);
              FootballerAiOverlaySupport.field_d.backpatchShortLength(FootballerAiOverlaySupport.field_d.field_n - var6_intLifetime1, 62);
              return true;
            }
            if (param1 == 1) {
              AnimationClip.a(0, param0 - 11592, NanoTickClock.field_n, KitPatternMaskSupport.field_c);
              SelectionMarkerSupport.a(0);
              return true;
            }
            if (param1 == 2) {
              AnimationClip.a(1, -76, NanoTickClock.field_n, KitPatternMaskSupport.field_c);
              SelectionMarkerSupport.a(param0 - 11516);
              return true;
            }
            if (param1 == 3) {
              AnimationClip.a(2, -76, NanoTickClock.field_n, KitPatternMaskSupport.field_c);
              SelectionMarkerSupport.a(0);
              return true;
            }
            if (param1 == 4) {
              AnimationClip.a(3, param0 ^ -11448, NanoTickClock.field_n, KitPatternMaskSupport.field_c);
              SelectionMarkerSupport.a(0);
              return true;
            }
          }
          if (var5 != 0) {
            if (param1 == 1) {
              AnimationClip.a(RankingsScreen.field_C, -76, NanoTickClock.field_n, 0);
              SelectionMarkerSupport.a(param0 ^ 11516);
              return true;
            }
            if (param1 == 2) {
              AnimationClip.a(RankingsScreen.field_C, -76, NanoTickClock.field_n, 1);
              SelectionMarkerSupport.a(0);
              return true;
            }
            if (param1 == 3) {
              AnimationClip.a(RankingsScreen.field_C, param0 ^ -11448, NanoTickClock.field_n, 2);
              SelectionMarkerSupport.a(0);
              return true;
            }
          }
          if (87 == param1) {
            SquadPickerDialog.field_J = (SquadPickerDialog.field_J + 1) % 10;
            return true;
          }
          if (param1 == 88) {
            SquadPickerDialog.field_J = (9 + SquadPickerDialog.field_J) % 10;
            return true;
          }
        }
        var6 = AuctionLogEntry.field_h;
        if (param0 != 11516) {
          return true;
        }
        if (null != GameModesHelpScreen.field_G) {
          var6 = GameModesHelpScreen.field_G;
        }
        if (var6 == null) {
          stackIn_240_0 = false;
        } else {
          stackIn_240_0 = var6.handleKey(param1, -17, param2);
        }
        return stackIn_240_0;
    }

    private final void drawLoadingBar(int param0) {
        SoftwareRasterizer.fillRectangleAlpha(0, 300, 640, 87, 0, 190);
        int var2 = (int)(250.0f * TextInputWidget.field_R / 100.0f);
        int var3 = var2 + 196;
        ByteArrayPool.field_d.drawCentered(LoginDialog.$cfr$intArgs$a$53ce4ab4c593(-18, TickClock.field_e, new String[]{QuickChatMenuBuilder.field_b[KitPatternMaskSupport.field_c][RankingsScreen.field_C].toUpperCase()}), 320, 332, 16777215, 0);
        SoftwareRasterizer.drawRoundedRectangle(193, 348, 254, 19, 8, 268435455);
        if (param0 != 81) {
          return;
        }
        if (var2 <= 16) {
          AuctionListing.pushRasterClip((var2 >> 1) + 195, -22914, 0, 480, 0);
          SoftwareRasterizer.fillRoundedRectangle(195, 350, 250, 15, 6, 268435455);
          TeamManagementScreen.e(117);
          AuctionListing.pushRasterClip(640, -22914, (var2 >> 1) + 195, 480, 0);
          SoftwareRasterizer.fillRoundedRectangle(-250 + (var2 + 195), 350, 250, 15, 6, 268435455);
          TeamManagementScreen.e(122);
        } else {
          SoftwareRasterizer.fillRoundedRectangle(195, 350, var2, 15, 6, 268435455);
        }
        AuctionListing.pushRasterClip(640, -22914, var3, 480, 0);
        ConsoleTokenCursor.field_d.drawCentered(SquadGridWidget.field_Db, 320, 362, 16777215, -1);
        TeamManagementScreen.e(126);
        AuctionListing.pushRasterClip(var3, -22914, 0, 480, 0);
        ConsoleTokenCursor.field_d.drawCentered(SquadGridWidget.field_Db, 320, 362, 65793, -1);
        TeamManagementScreen.e(param0 ^ 39);
    }

    public Kickabout() {
        CharSequence var2 = (CharSequence) ((Object) HuffmanTextSupport.field_b);
        GameLoopApplet.field_E = new ClubState(LoggedPlayer.a(var2, false));
        AnimationClip.field_g = this;
    }

    final static void prepareAccountChoiceSprites(int param0) {
        int var3_int = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_22_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        ArgbSprite var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        ArgbSprite var11 = null;
        int stackIn_11_0Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var9 = field_G;
        try {
          var11 = AccountChoicePanel.field_B;
          if (param0 != -826875391) {
            Kickabout.releaseStatics((byte) -117);
          }
          var2 = 0;
          for (var3_int = 0; var3_int < var11.field_v; var3_int++) {
            var4 = 70 * var3_int / var11.field_v;
            for (var5 = 0; var11.field_o > var5; var5++) {
              var11.field_y[var2] = TextLayoutLine.bitwiseAnd(var11.field_y[var2], -16777216);
              var11.field_y[var2] = PainterStyle.bitwiseOr(var11.field_y[var2], PainterStyle.bitwiseOr(PainterStyle.bitwiseOr(var4 << 16, var4 << 8), var4));
              var2++;
            }
          }
          var3 = AccountChoicePanel.field_B;
          FullscreenFocusCanvas.field_d = new Sprite(((Sprite) ((Object) var3)).field_o, ((Sprite) ((Object) var3)).field_v);
          var10 = 0;
          var4Lifetime1 = var10;
          var5Lifetime1 = 0;
          while (true) {
            stackIn_11_0 = ~((Sprite) ((Object) var3)).field_v;
            if (stackIn_11_0 >= ~var5Lifetime1) {
              SocialRowOrderSupport.field_h = new Sprite(((Sprite) ((Object) var3)).field_o, ((Sprite) ((Object) var3)).field_v);
              return;
            }
            var6 = 0;
            var7 = 0;
            for (var8 = 0; var8 < ((Sprite) ((Object) var3)).field_o; var8++) {
              stackIn_11_0Lifetime1 = var6;
              if (stackIn_11_0Lifetime1 == 0 &&
                (((Sprite) ((Object) var3)).field_y[var10] & -16777216) != 0) {
                incrementValue$0 = var7;
                var7++;
                if (5 < incrementValue$0) {
                  var6 = 1;
                }
              }
              incrementValue$1 = var10;
              var10++;
              stackIn_21_0 = FullscreenFocusCanvas.field_d.field_y;
              stackIn_21_1 = incrementValue$1;
              if (var6 != 0) {
                stackIn_22_2 = -1;
              } else {
                stackIn_22_2 = 0;
              }
              stackIn_21_0[stackIn_21_1] = stackIn_22_2;
            }
            var5Lifetime1++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "Kickabout.HA(" + param0 + ')');
        }
    }

    final void onShutdown(byte param0) {
        AudioOutputSupport.shutdownAudioOutputs(4);
        if (param0 != -24) {
          return;
        }
        ClientProtocolStage.disconnectAndLeaveFullscreen(true);
    }

    final void onStartup(byte param0) {
        if (param0 >= -23) {
          this.onStartup((byte) 116);
        }
        this.initialiseClient(1, 69, 0, 2, 18, (byte) -4, 4, true);
        this.startWithLoader(107, new GameResourceLoader());
        FullscreenFocusCanvas.a(PlatformTaskState.field_c, (byte) 23, (java.awt.Component) ((Object) RegistrationRequestState.field_d));
        ListingRow.a((byte) -8, IntTripleCommand.field_A);
    }

    final void applyPendingNavigation(int param0) {
        if (2147483647 == SpriteButtonPainter.field_v) {
        } else {
          if (SpriteButtonPainter.field_v != -3) {
            DelayedServerPacket.a(SpriteButtonPainter.field_v, false, -2);
          } else {
            MouseWheelInput.a(-1822);
          }
        }
        RenderedFootballer.restoreSharedDefaultButtons(0);
        if (param0 < 50) {
          field_I = (String) null;
        }
    }

    final boolean isConnectionBusy(byte param0) {
        boolean stackIn_8_0 = false;
        if (param0 >= -70) {
          return true;
        }
        stackIn_8_0 = (PlayerValueSortCriterion.field_n) || (LoginText.field_e) || (QuickChatPhraseCache.field_d);
        return stackIn_8_0;
    }

    final boolean handlePacket(int param0, CipherPacketBuffer param1, int param2) {
        boolean stackIn_9_0 = false;
        boolean stackIn_10_1 = false;
        int stackIn_29_0 = 0;
        CipherPacketBuffer stackIn_29_1 = null;
        boolean stackIn_30_2 = false;
        boolean stackIn_36_0 = false;
        boolean stackIn_37_1 = false;
        boolean stackIn_45_0 = false;
        boolean stackIn_46_1 = false;
        boolean stackIn_55_0 = false;
        boolean stackIn_56_1 = false;
        boolean stackIn_88_0 = false;
        boolean stackIn_91_0 = false;
        boolean stackIn_93_0 = false;
        boolean stackIn_94_1 = false;
        int stackIn_160_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_166_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_190_0 = 0;
        MatchScreen stackIn_192_0 = null;
        boolean stackIn_193_1 = false;
        int stackIn_242_0 = 0;
        int stackIn_245_0 = 0;
        int stackIn_248_0 = 0;
        int stackIn_251_0 = 0;
        int stackIn_254_1 = 0;
        boolean stackIn_257_0 = false;
        int stackIn_272_0 = 0;
        int stackIn_275_0 = 0;
        int stackIn_278_0 = 0;
        RuntimeException stackIn_306_0 = null;
        StringBuilder stackIn_306_1 = null;
        String stackIn_307_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        String[] var4 = null;
        int[] var4_array = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ReceivedAuctionItem[] var5_ref_vc__ = null;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        ReceivedAuctionItem[] var7_ref_vc__ = null;
        int var7 = 0;
        int var8_int = 0;
        ChatMessage var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String[] var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        ReceivedAuctionItem[] var30 = null;
        ReceivedAuctionItem[] var31 = null;
        String[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        String var40 = null;
        PlayerStats[] var41 = null;
        ServerTextTemplate var42 = null;
        String var43 = null;
        String[] var44 = null;
        String var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        ReceivedAuctionItem[] var5_ref_vc__Lifetime1;
        int[] var5_ref_int__Lifetime1;
        int[] var5_ref_int__Lifetime2;
        int[] var6_ref_int__Lifetime1;
        int[] var6_ref_int__Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8_intLifetime1;
        int var13Lifetime1;
        int var15Lifetime1;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var4_intLifetime3;
        int var4_intLifetime4;
        int var4_intLifetime5;
        int var4_intLifetime6;
        int var4_intLifetime7;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime3;
        int var7Lifetime4;
        int var5Lifetime2Lifetime1;
        int var5Lifetime4Lifetime1;
        int var5Lifetime4Lifetime2;
        int var4_intLifetime6Lifetime1;
        int var4_intLifetime6Lifetime2;
        int var6Lifetime3Lifetime1;
        int var6Lifetime3Lifetime2;
        var22 = field_G;
        try {
          if (param2 != 1) {
            this.isConnectionBusy((byte) -8);
          }
          if (param0 == 90) {
            ((GameResourceLoader) (NetworkGameClient.field_t)).requestMessageOfTheDay((byte) 115);
            return true;
          }
          if (param0 == 86) {
            stackIn_9_0 = false;
            stackIn_10_1 = (param1.readUnsignedByte((byte) -122) == 1);
            ConsoleLexer.a(stackIn_9_0, stackIn_10_1);
            return true;
          }
          if (85 == param0) {
            ModelMaterialDecoder.field_g = true;
            return true;
          }
          if (param0 == 84) {
            TextEntrySupport.field_f = true;
            return true;
          }
          if (param0 == 81) {
            AccountNameCheckState.field_a.addLast(new AuctionListing(ByteArrayPool.field_e), param2 ^ 2);
            return true;
          }
          if (71 != param0 &&
            83 != param0) {
            if (73 == param0) {
              ModelMaterialDecoder.field_g = false;
              param1.beginBitRead(-127);
              stackIn_36_0 = false;
              stackIn_37_1 = (param1.readBits(1, 59) == 1);
              ConsoleLexer.a(stackIn_36_0, stackIn_37_1);
              param1.finishBitRead((byte) 103);
              var4_int = ByteArrayPool.field_e.readUnsignedMedium(param2 ^ -97);
              var5 = ByteArrayPool.field_e.readSignedMedium(param2 ^ 65281);
              var6 = ByteArrayPool.field_e.readUnsignedByte((byte) -119);
              var7_ref_vc__ = new ReceivedAuctionItem[var6];
              for (var8_int = 0; var8_int < var6; var8_int++) {
                var7_ref_vc__[var8_int] = ReceivedAuctionItem.readAuctionItem(param2 - 21833, ByteArrayPool.field_e);
              }
              ((AuctionsScreen) (VertexNormal.getMenuScreen(param2 - 120, 16))).updateAuctionRows(true, var7_ref_vc__, var4_int, var5);
              return true;
            }
            if (param0 == 76) {
              ModelMaterialDecoder.field_g = false;
              param1.beginBitRead(-104);
              stackIn_45_0 = false;
              stackIn_46_1 = (param1.readBits(1, param2 ^ 58) == 1);
              ConsoleLexer.a(stackIn_45_0, stackIn_46_1);
              param1.finishBitRead((byte) -84);
              var4_intLifetime1 = ByteArrayPool.field_e.readUnsignedByte((byte) -125);
              var30 = new ReceivedAuctionItem[var4_intLifetime1];
              var5_ref_vc__ = var30;
              for (var6Lifetime1 = 0; var6Lifetime1 < var4_intLifetime1; var6Lifetime1++) {
                var5_ref_vc__[var6Lifetime1] = ReceivedAuctionItem.readAuctionItem(-21832, ByteArrayPool.field_e);
              }
              FadingSoundPlayer.linkAuctionItemsToLog((byte) 99, var30);
              return true;
            }
            if (param0 == 80) {
              ModelMaterialDecoder.field_g = false;
              param1.beginBitRead(-100);
              stackIn_55_0 = false;
              stackIn_56_1 = (param1.readBits(1, param2 + 58) == 1);
              ConsoleLexer.a(stackIn_55_0, stackIn_56_1);
              param1.finishBitRead((byte) 112);
              var4_intLifetime2 = ByteArrayPool.field_e.readUnsignedByte((byte) -125);
              var31 = new ReceivedAuctionItem[var4_intLifetime2];
              var5_ref_vc__Lifetime1 = var31;
              for (var6Lifetime2 = 0; var6Lifetime2 < var4_intLifetime2; var6Lifetime2++) {
                var5_ref_vc__Lifetime1[var6Lifetime2] = ReceivedAuctionItem.readAuctionItem(TrinketShopDialog.bitwiseXor(param2, -21831), ByteArrayPool.field_e);
              }
              ((AuctionsScreen) (VertexNormal.getMenuScreen(-53, 16))).setAuctionList(true, var31);
              return true;
            }
            if (param0 == 77) {
              var4_intLifetime3 = ByteArrayPool.field_e.readUnsignedByte((byte) -115);
              StreetSceneryLoader.enqueuePromotionDialog(true, var4_intLifetime3);
              BufferedSocket.field_k = var4_intLifetime3;
              if (AuctionLogEntry.field_h instanceof PlayerShopScreen) {
                if (null != GameModesHelpScreen.field_G) {
                  return true;
                }
                ((ButtonMenuScreen) (AuctionLogEntry.field_h)).enterScreen(param2 ^ 1, 0, true);
                SocketArchiveNetworkClient.enqueueMessageDialog((byte) 126, 28);
              }
              return true;
            }
            if (param0 == 78) {
              var32 = new String[param1.readUnsignedShort((byte) 81)];
              var4 = var32;
              for (var5Lifetime1 = 0; var32.length > var5Lifetime1; var5Lifetime1++) {
                var4[var5Lifetime1] = param1.readString(TrinketShopDialog.bitwiseXor(param2, -112));
              }
              SocialPlayerRow.setDivisionWinners(var32, (byte) 88);
              return true;
            }
            if (70 == param0) {
              NetworkArchiveRequest.field_y = true;
              GameLoopApplet.field_E.readFromPacket(85, param1, 4);
              ByteStorage.field_c = GameLoopApplet.field_E.field_d;
              if (GameLoopApplet.field_E.field_L) {
                SocketArchiveNetworkClient.field_v = 1;
              } else {
                SocketArchiveNetworkClient.field_v = 0;
              }
              RotaryDialPainter.field_n = GameLoopApplet.field_E.field_A;
              if (!CachedListingRow.field_h) {
                ConsoleValue.setMusicVolume(GameLoopApplet.field_E.field_p, (byte) 33);
                MeshPreviewSupport.a(GameLoopApplet.field_E.field_F, (byte) -116);
              }
              if (AuctionLogEntry.field_h instanceof TeamManagementScreen &&
                GameModesHelpScreen.field_G == null) {
                ((ButtonMenuScreen) (AuctionLogEntry.field_h)).enterScreen(0, 0, true);
                SocketArchiveNetworkClient.enqueueMessageDialog((byte) 126, 28);
              }
              param1.beginBitRead(param2 ^ -105);
              stackIn_88_0 = (param1.readBits(1, 59) == 1);
              ClientPacketFlushSupport.field_g = stackIn_88_0;
              stackIn_91_0 = (1 == param1.readBits(1, 59));
              SpriteNumberPainter.field_c = stackIn_91_0;
              stackIn_93_0 = false;
              stackIn_94_1 = (param1.readBits(1, 59) == 1);
              ConsoleLexer.a(stackIn_93_0, stackIn_94_1);
              param1.finishBitRead((byte) 108);
              return true;
            }
            if (param0 == 74) {
              var4_intLifetime4 = param1.readInt(param2 + 3);
              if (MachineTokenStorageSupport.field_e != null) {
                MachineTokenStorageSupport.field_e.readParticipantPingTimes(-21573, param1);
              }
              FootballerAiOverlaySupport.field_d.writeIsaacByte(57, (byte) -80);
              FootballerAiOverlaySupport.field_d.writeInt(param2 ^ -30, var4_intLifetime4);
              return true;
            }
            if (param0 == 9) {
              MeshObject.a((byte) 87);
              LoginText.field_e = false;
              DelayedServerPacket.a(10, false, -2);
              GameQuickChatResolver.a(2, param1.readString(param2 - 98));
              return true;
            }
            if (param0 == 14) {
              MeshObject.a((byte) 81);
              ConsoleTokenCursor.a(NetworkGameClient.getLobbyPlayerListContent(param2 ^ 1), 120, MatchHudSupport.ceilPowerOfTwo((byte) 6, 1250), MatchHudSupport.ceilPowerOfTwo((byte) 6, 16), AnimationPlayer.b(-116), UrlRequest.field_c, ClassNameSupport.getActiveLayoutChild(param2 ^ 1), 150, ArchiveSource.field_c.length, 1024);
              DropTargetWidget.a(64, LoginRequiredDialog.h((byte) -64), ButtonMenuScreen.f((byte) -63));
              LoginText.field_e = false;
              PlayerValueSortCriterion.field_n = true;
              if (!QuickChatPhraseCache.field_d) {
                DelayedServerPacket.a(-3, false, -2);
              }
              return true;
            }
            if (param0 == 15) {
              if (PlayerValueSortCriterion.field_n) {
                ReceivedAuctionItem.f((byte) 119);
                ContextMenuItem.b(122);
                DelayedServerPacket.a(0, false, -2);
                TextButton.field_B = true;
                StreetSceneryLoader.field_k = true;
                PlayerValueSortCriterion.field_n = false;
                FriendsListPanel.field_Db = true;
                PitchSurfaceLoader.b(1);
              }
              QuickChatPhraseCache.field_d = false;
              LoginText.field_e = false;
              return true;
            }
            if (10 == param0 &&
              PlayerValueSortCriterion.field_n) {
              VerticalScrollbar.i(14);
              return true;
            }
            if (param0 == 67) {
              var23 = new int[8];
              var48 = var23;
              var35 = var48;
              var4_array = var35;
              for (var5Lifetime2 = 0; 2 >= var5Lifetime2; var5Lifetime2++) {
                var23[var5Lifetime2] = param1.readInt(TrinketShopDialog.bitwiseXor(param2, 5));
              }
              var46 = var4_array;
              var33 = var46;
              var24 = var33;
              var5_ref_int__ = var24;
              var47 = BufferedSocket.field_f;
              var34 = var47;
              var25 = var34;
              var6_ref_int__ = var25;
              for (var7 = 0; var7 < 8; var7++) {
                var24[var7] = TextLayoutLine.bitwiseAnd(var46[var7], ~var47[var7]);
              }
              for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < 73; var5Lifetime2Lifetime1++) {
                if (ClientPacketFlushSupport.isBitSet(var5Lifetime2Lifetime1, 0, var48)) {
                  LoginText.field_f.addLast(new IntValueNode(var5Lifetime2Lifetime1), 3);
                  Cp1252EncodingSupport.field_a.addLast(new IntValueNode(var5Lifetime2Lifetime1), 3);
                }
              }
              var49 = BufferedSocket.field_f;
              var36 = var49;
              var26 = var36;
              var5_ref_int__Lifetime1 = var26;
              var50 = var4_array;
              var37 = var50;
              var27 = var37;
              var6_ref_int__Lifetime1 = var27;
              for (var7Lifetime3 = 0; var7Lifetime3 < 8; var7Lifetime3++) {
                var26[var7Lifetime3] = PainterStyle.bitwiseOr(var49[var7Lifetime3], var50[var7Lifetime3]);
              }
              var51 = WelcomeDialog.field_F;
              var38 = var51;
              var28 = var38;
              var5_ref_int__Lifetime2 = var28;
              var52 = var4_array;
              var39 = var52;
              var29 = var39;
              var6_ref_int__Lifetime2 = var29;
              for (var7Lifetime4 = 0; var7Lifetime4 < 8; var7Lifetime4++) {
                var28[var7Lifetime4] = PainterStyle.bitwiseOr(var51[var7Lifetime4], var52[var7Lifetime4]);
              }
              if (ResourceArchive.field_g) {
                RasterBuffer.a(20164);
              }
              return true;
            }
            if (param0 == 75) {
              var4_intLifetime5 = param1.readUnsignedByte((byte) -114);
              for (var5Lifetime3 = 0; var5Lifetime3 < var4_intLifetime5; var5Lifetime3++) {
                var40 = param1.readString(80);
                ClientProtocolStage.field_d.print("  <col=99ccff># " + var40 + "</col", (byte) 94);
              }
              return true;
            }
            if (param0 != 64 &&
              param0 != 65) {
              if (param0 == 66) {
                if (null != SortCriterion.field_l) {
                  TextButton.field_B = true;
                  DelayedServerPacket.a(-3, false, -2);
                  PitchSurfaceLoader.b(1);
                }
                if (null != MachineTokenStorageSupport.field_e &&
                  MachineTokenStorageSupport.field_e.isOnlineMatch) {
                  MachineTokenStorageSupport.field_e.leaveMatch(false, param2 ^ 19);
                  FriendsListPanel.field_Db = true;
                  TextButton.field_B = true;
                  DelayedServerPacket.a(-3, false, -2);
                  PitchSurfaceLoader.b(param2 ^ 0);
                }
                QuickChatPhraseCache.field_d = false;
                return true;
              }
              if (82 == param0) {
                SocketArchiveNetworkClient.enqueueMessageDialog((byte) 126, 38);
                return true;
              }
              if (MachineTokenStorageSupport.field_e != null &&
                MachineTokenStorageSupport.field_e.isOnlineMatch) {
                if (69 == param0) {
                  MachineTokenStorageSupport.field_e.readMatchState((byte) -17, param1);
                  return true;
                }
                if (68 == param0) {
                  var4_intLifetime6 = param1.readUnsignedByte((byte) -105);
                  for (var5Lifetime4 = 0; var5Lifetime4 < var4_intLifetime6; var5Lifetime4++) {
                    MachineTokenStorageSupport.field_e.field_m.tick(4);
                  }
                  var5Lifetime4 = param1.readInt(4);
                  MachineTokenStorageSupport.field_e.field_m.readDeltaState(param1, -5);
                  var6Lifetime3 = MachineTokenStorageSupport.field_e.field_m.computeChecksum(-98);
                  if (var5Lifetime4 != -1 &&
                    ~var6Lifetime3 != ~var5Lifetime4 &&
                    MachineTokenStorageSupport.field_e.field_g) {
                    UnreadMessagesScreen.a("ChecksumError: server=" + Integer.toHexString(var5Lifetime4) + " client=" + Integer.toHexString(var6Lifetime3), (Throwable) ((Object) new IllegalStateException(MachineTokenStorageSupport.field_e.field_m.toString())), 1);
                    MachineTokenStorageSupport.field_e.field_g = false;
                  }
                  MachineTokenStorageSupport.field_e.field_i.copyStateFrom(MachineTokenStorageSupport.field_e.field_m, (byte) 119);
                  return true;
                }
              }
              if (param0 == 87) {
                if (MachineTokenStorageSupport.field_e != null) {
                  FriendsListPanel.field_Db = true;
                }
                var6Lifetime3Lifetime1 = 0;
                param1.beginBitRead(-114);
                var5Lifetime4Lifetime1 = 0;
                var4_intLifetime6Lifetime1 = 0;
                stackIn_242_0 = (!ContentTransitionDialog.a(param1, (byte) -39)) ? 0 : 1;
                var4_intLifetime6Lifetime1 = stackIn_242_0;
                stackIn_245_0 = (!ContentTransitionDialog.a(param1, (byte) -39)) ? 0 : 1;
                var5Lifetime4Lifetime1 = stackIn_245_0;
                stackIn_248_0 = (!ContentTransitionDialog.a(param1, (byte) -39)) ? 0 : 1;
                var6Lifetime3Lifetime1 = stackIn_248_0;
                param1.finishBitRead((byte) -50);
                stackIn_251_0 = (var6Lifetime3Lifetime1 != 0) ? 0 : 1;
                if (var5Lifetime4Lifetime1 == var4_intLifetime6Lifetime1) {
                  stackIn_254_1 = 0;
                } else {
                  stackIn_254_1 = 1;
                }
                stackIn_257_0 = (stackIn_251_0 == stackIn_254_1);
                if (!stackIn_257_0) {
                  throw new RuntimeException("Tried to init a lobby without the full state being sent [" + (var4_intLifetime6Lifetime1 != 0) + "," + (var5Lifetime4Lifetime1 != 0) + "," + (var6Lifetime3Lifetime1 != 0) + "]");
                }
                SortCriterion.field_l = new TournamentLobbyScreen(param1);
                MusicPatchNode.a(-88);
                if (null == GameModesHelpScreen.field_G ||
                  GameModesHelpScreen.field_G.screenId != 18) {
                  if (AuctionLogEntry.field_h.screenId == -2) {
                    AuctionLogEntry.field_h = (AppScreen) ((Object) SortCriterion.field_l);
                  } else {
                    FriendsListPanel.field_Db = true;
                    ServerTextTemplate.a(-2, param2 ^ 71);
                    DelayedServerPacket.a(18, false, param2 - 3);
                  }
                }
                QuickChatPhraseCache.field_d = false;
                return true;
              }
              if (null != SortCriterion.field_l &&
                param0 == 88) {
                param1.beginBitRead(-112);
                var6Lifetime3Lifetime2 = 0;
                var4_intLifetime6Lifetime2 = 0;
                var5Lifetime4Lifetime2 = 0;
                stackIn_272_0 = (!ContentTransitionDialog.a(param1, (byte) -39)) ? 0 : 1;
                var4_intLifetime6Lifetime2 = stackIn_272_0;
                stackIn_275_0 = (!ContentTransitionDialog.a(param1, (byte) -39)) ? 0 : 1;
                var5Lifetime4Lifetime2 = stackIn_275_0;
                stackIn_278_0 = (!ContentTransitionDialog.a(param1, (byte) -39)) ? 0 : 1;
                var6Lifetime3Lifetime2 = stackIn_278_0;
                param1.finishBitRead((byte) 103);
                if (var4_intLifetime6Lifetime2 != 0) {
                  SortCriterion.field_l.readPlayerNames(param1, false);
                }
                if (var5Lifetime4Lifetime2 != 0) {
                  SortCriterion.field_l.readTournamentStatistics(param2 + 8, param1);
                }
                if (var6Lifetime3Lifetime2 != 0) {
                  SortCriterion.field_l.readRoundUpdate(param1, (byte) 110);
                }
                return true;
              }
              if (param0 == 89) {
                var42 = new ServerTextTemplate();
                var42.decode(param1, param2 ^ -20364);
                var43 = var42.format((byte) 51);
                var44 = RasterBuffer.a(var43, 80, (byte) 123);
                for (var7Lifetime1 = 0; var7Lifetime1 < var44.length; var7Lifetime1++) {
                  var8 = new ChatMessage(2, "", 0, "", var44[var7Lifetime1]);
                  SectorCacheStore.a((byte) 94, var8);
                }
                return true;
              }
              if (param0 != 91) {
                return false;
              }
              var45 = param1.readString(param2 - 108);
              if (MachineTokenStorageSupport.field_e != null &&
                MachineTokenStorageSupport.field_e.isTournamentMatch ||
                SortCriterion.field_l != null) {
                ConsoleValue.enqueueTournamentChampionDialog(2009, var45);
              }
              return true;
            }
            Cp1252EncodingSupport.field_a.clear(22997);
            if (SortCriterion.field_l != null) {
              TextButton.field_B = true;
            }
            var4_intLifetime7 = param1.field_n;
            MeshObject.a((byte) 72);
            stackIn_160_0 = (0 == param1.readUnsignedByte((byte) -106)) ? 0 : 1;
            var5Lifetime5 = stackIn_160_0;
            stackIn_163_0 = (0 == param1.readUnsignedByte((byte) -116)) ? 0 : 1;
            var6Lifetime4 = stackIn_163_0;
            var7Lifetime2 = param1.readUnsignedByte((byte) -117);
            var8_intLifetime1 = param1.readUnsignedByte((byte) -126);
            stackIn_166_0 = (param1.readUnsignedByte((byte) -123) == 0) ? 0 : 1;
            var9 = stackIn_166_0;
            stackIn_169_0 = (0 == param1.readUnsignedByte((byte) -113)) ? 0 : 1;
            var10 = stackIn_169_0;
            var11 = param1.readUnsignedByte((byte) -111);
            var12 = new String[var11];
            for (var13 = 0; var12.length > var13; var13++) {
              var12[var13] = param1.readString(-111);
            }
            var13Lifetime1 = param1.readByte((byte) -64);
            var14 = null;
            if (var10 != 0 &&
              var13Lifetime1 >= 0) {
              var41 = new PlayerStats[9];
              var14 = var41;
              for (var15 = 0; 9 > var15; var15++) {
                ((Object[]) (var14))[var15] = new PlayerStats();
                var41[var15].readFromPacket(39, param1);
              }
            }
            PlayerPortraitCacheEntry.field_g = null;
            var15Lifetime1 = param1.readUnsignedByte((byte) -128);
            stackIn_181_0 = (0 == (var15Lifetime1 & 1)) ? 0 : 1;
            var16 = stackIn_181_0;
            stackIn_184_0 = ((var15Lifetime1 & 2) == 0) ? 0 : 1;
            var17 = stackIn_184_0;
            stackIn_187_0 = ((var15Lifetime1 & 4) == 0) ? 0 : 1;
            var18 = stackIn_187_0;
            stackIn_190_0 = ((var15Lifetime1 & 8) == 0) ? 0 : 1;
            var19 = stackIn_190_0;
            var20 = param1.readByte((byte) -87);
            MachineTokenStorageSupport.field_e = new MatchScreen(true, (PlayerStats[]) (var14), var12, var13Lifetime1, var5Lifetime5 != 0, var6Lifetime4 != 0, var7Lifetime2, var8_intLifetime1, var9 != 0, var10 != 0, var16 != 0, var17 != 0, var18 != 0, var20, (ClubState) null);
            stackIn_192_0 = MachineTokenStorageSupport.field_e;
            stackIn_193_1 = (var19 != 0);
            stackIn_192_0.tournamentSpectatorControlsEnabled = stackIn_193_1;
            MusicPatchNode.a(-76);
            if (GameModesHelpScreen.field_G == null ||
              GameModesHelpScreen.field_G.screenId != 18) {
              if (AuctionLogEntry.field_h.screenId == -1) {
                AuctionLogEntry.field_h = (AppScreen) ((Object) MachineTokenStorageSupport.field_e);
              } else {
                TextButton.field_B = true;
                ServerTextTemplate.a(-1, param2 ^ 85);
                DelayedServerPacket.a(18, false, -2);
              }
            }
            QuickChatPhraseCache.field_d = false;
            var21 = param1.field_n - var4_intLifetime7;
            if (var21 != MusicVolumeSupport.field_b) {
              throw new RuntimeException("");
            }
            return true;
          }
          TextEntrySupport.field_f = false;
          stackIn_29_0 = -105;
          stackIn_29_1 = (CipherPacketBuffer) (param1);
          stackIn_30_2 = (83 == AppletContextSupport.field_b);
          SquadGridWidget.readLeagueRankingPage(stackIn_29_0, stackIn_29_1, stackIn_30_2);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_306_0 = var4_ref;
          stackIn_306_1 = new StringBuilder().append("Kickabout.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_307_2 = "null";
          } else {
            stackIn_307_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_306_0), ((StringBuilder) (Object) stackIn_306_1).append(stackIn_307_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void paint(int param0) {
        int incrementValue$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        TournamentLobbyScreen stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        boolean stackIn_45_2 = false;
        MatchScreen stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        boolean stackIn_54_2 = false;
        AppScreen stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        boolean stackIn_64_2 = false;
        ButtonMenuScreen stackIn_74_0 = null;
        boolean stackIn_75_1 = false;
        AppScreen stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        boolean stackIn_86_2 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        boolean decompiledFrameRemainder1 = true;
        var6 = field_G;
        var2 = 97 % ((param0 - 50) / 45);
        var3 = 0;
        if (0 < FormationAgent.field_f) {
          stackIn_4_0 = (SocialRowOrderSupport.getScreenPanelWidth(AuctionLogEntry.field_h, -4) < 640) ? 0 : 1;
          var4 = stackIn_4_0;
          if ((var4 == 0 ||
            GameModesHelpScreen.field_G != null) && 0 != SocketArchiveNetworkClient.field_v) {
            var3 = 240;
            if ((GameModesHelpScreen.field_G != null)) {
              stackIn_14_0 = (SocialRowOrderSupport.getScreenPanelWidth(GameModesHelpScreen.field_G, -4) < 640) ? 0 : 1;
              var5 = stackIn_14_0;
              if (var4 != 0 &&
                var5 != 0) {
                var3 = 256;
              }
              if (var4 == 0 &&
                var5 != 0) {
                var3 = var3 + (BuyPlayerDialog.field_I << 3);
              }
              if (var4 != 0 &&
                var5 == 0) {
                var3 = var3 + (24 - BuyPlayerDialog.field_I << 3);
              }
              if (!(var3 <= 256)) {
                var3 = 256;
              }
            }
            decompiledFrameRemainder1 = false;
          }
          else {
            var3 = 256;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (AuctionLogEntry.field_h.screenId == -3 && (null == GameModesHelpScreen.field_G ||
          18 == GameModesHelpScreen.field_G.screenId)) {
          var4Lifetime1 = 0;
          for (var5Lifetime1 = -SoftwareRasterizer.field_a.length; var5Lifetime1 < 0; var5Lifetime1++) {
            incrementValue$0 = var4Lifetime1;
            var4Lifetime1++;
            SoftwareRasterizer.field_a[incrementValue$0] = 65793;
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          if (FormationAgent.field_f < 680) {
            LookupRecordUpdate.a((byte) -48);
          }
          if (SortCriterion.field_l != null &&
            AuctionLogEntry.field_h.screenId != 0 &&
            AuctionLogEntry.field_h.screenId != -1 &&
            6 != AuctionLogEntry.field_h.screenId) {
            stackIn_44_0 = SortCriterion.field_l;
            stackIn_44_1 = -5;
            stackIn_45_2 = (this.field_L) && (SortCriterion.field_l == AuctionLogEntry.field_h) && (GameModesHelpScreen.field_G == null);
            ((TournamentLobbyScreen) (Object) stackIn_44_0).drawScreen(stackIn_44_1, stackIn_45_2);
          }
          if (MachineTokenStorageSupport.field_e != null &&
            AuctionLogEntry.field_h.screenId != 0 &&
            -2 != AuctionLogEntry.field_h.screenId) {
            stackIn_53_0 = MachineTokenStorageSupport.field_e;
            stackIn_53_1 = -5;
            stackIn_54_2 = (this.field_L) && (MachineTokenStorageSupport.field_e == AuctionLogEntry.field_h) && (null == GameModesHelpScreen.field_G);
            ((MatchScreen) (Object) stackIn_53_0).drawScreen(stackIn_53_1, stackIn_54_2);
          }
        }
        AuctionListing.pushRasterClip(FormationAgent.field_f, -22914, 0, 480, 0);
        var4Lifetime2 = -AccountChoicePanel.field_B.field_o + FormationAgent.field_f;
        if (var3 > 0) {
          SoftwareDrawingSupport.captureRasterThroughSpriteMask(SocialRowOrderSupport.field_h, FullscreenFocusCanvas.field_d, var4Lifetime2);
          SoftwareDrawingSupport.drawSpriteClipped(TutorialScenerySupport.field_a, 0, 0, FormationAgent.field_f, 480, var3, 0);
          AuctionLogEntry.field_j.drawAdditive(-36, 50, 64);
        }
        if (AuctionLogEntry.field_h instanceof ButtonMenuScreen) {
          stackIn_63_0 = AuctionLogEntry.field_h;
          stackIn_63_1 = -5;
          stackIn_64_2 = (this.field_L) && (null == GameModesHelpScreen.field_G);
          ((AppScreen) (Object) stackIn_63_0).drawScreen(stackIn_63_1, stackIn_64_2);
        }
        if (GameModesHelpScreen.field_G instanceof ButtonMenuScreen) {
          GameModesHelpScreen.field_G.drawScreen(-5, false);
        }
        if (FormationAgent.field_f > 0) {
          SocialRowOrderSupport.field_h.draw(var4Lifetime2, 0);
          AccountChoicePanel.field_B.draw(var4Lifetime2, 0);
        }
        TeamManagementScreen.e(118);
        if (AuctionLogEntry.field_h instanceof ButtonMenuScreen) {
          stackIn_74_0 = (ButtonMenuScreen) (AuctionLogEntry.field_h);
          stackIn_75_1 = (this.field_L) && (GameModesHelpScreen.field_G == null);
          ((ButtonMenuScreen) (Object) stackIn_74_0).drawOverlay(stackIn_75_1, 117);
        }
        if (GameModesHelpScreen.field_G instanceof ButtonMenuScreen) {
          ((ButtonMenuScreen) (GameModesHelpScreen.field_G)).drawOverlay(false, 119);
        }
        if (!(AuctionLogEntry.field_h instanceof ButtonMenuScreen) &&
          AuctionLogEntry.field_h != MachineTokenStorageSupport.field_e &&
          AuctionLogEntry.field_h != SortCriterion.field_l) {
          stackIn_85_0 = AuctionLogEntry.field_h;
          stackIn_85_1 = -5;
          stackIn_86_2 = (this.field_L) && (GameModesHelpScreen.field_G == null);
          ((AppScreen) (Object) stackIn_85_0).drawScreen(stackIn_85_1, stackIn_86_2);
        }
        if (GameModesHelpScreen.field_G != null &&
          !(GameModesHelpScreen.field_G instanceof ButtonMenuScreen) &&
          MachineTokenStorageSupport.field_e != GameModesHelpScreen.field_G &&
          SortCriterion.field_l != GameModesHelpScreen.field_G) {
          GameModesHelpScreen.field_G.drawScreen(-5, false);
        }
        this.drawLogoBanner(102);
        if (IsSixCommand.field_B) {
          FindingOpponentScreen.g((byte) -119);
        }
        if (GameQuickChatResolver.field_b) {
          var5Lifetime2 = -BuyPlayerDialog.field_I + 24 << 4;
          if (BuyPlayerDialog.field_I < 12) {
            var5Lifetime2 = BuyPlayerDialog.field_I << 4;
          }
          ConsoleTokenCursor.field_d.drawCentered("Transition: " + BuyPlayerDialog.field_I + " : " + var5Lifetime2, 320, 100, 16777215, 0);
        }
        if (FadingSoundPlayer.field_q &&
          AuctionLogEntry.field_h.screenId != -4) {
          this.drawLoadingBar(81);
        }
        DiagnosticsOverlaySupport.drawDiagnostics((byte) 71);
        SelectionMarkerSupport.drawSelectionMarkers((byte) -106);
    }

    final void releaseStatics(int param0) {
        Kickabout.releaseStatics((byte) -99);
        SceneSpriteFactory.releaseStatics(false);
        ChatInputState.releaseStatics(-91);
        SocialListLayoutSupport.releaseStatics(-1);
        ThumbnailStateFactory.releaseStatics(121);
        DialogOverlay.releaseStatics(23);
        ServerTextTemplate.releaseStatics(param0 ^ 126);
        PlayerStats.releaseStatics(112);
        ManagerAction.releaseStatics((byte) 122);
        AuctionListing.releaseStatics((byte) 9);
        WidgetStyleFactory.releaseStatics((byte) -115);
        ClubState.releaseStatics((byte) 0);
        AuctionItem.releaseStatics(-23834);
        ClubStateFactory.releaseStatics((byte) -67);
        DisplayNameUiSupport.releaseStatics(-13827);
        PitchBoundaryCacheState.releaseStatics((byte) 115);
        PlatformTaskState.releaseStatics(param0 ^ -18184);
        GameOptionMenuSupport.releaseStatics(20177);
        LeagueRatingRequirements.releaseStatics(0);
        IntValueNode.a(false);
        IntrusiveDeque.releaseStatics(param0 - 133);
        SoftwareRasterizer.clearRasterState();
        InputLayoutState.releaseStatics(param0 ^ 8198);
        CipherPacketBuffer.releaseStatics(0);
        SelectionMarkerSupport.releaseStatics((byte) -117);
        ConsoleArgumentSupport.releaseStatics(param0 - 6);
        LoginPacketSupport.releaseStatics((byte) 72);
        UiKeyRoutingSupport.releaseStatics((byte) -90);
        GameLoopApplet.q(30907);
        GameKeyHandler.releaseStatics(param0 + 3896);
        HuffmanTextSupport.releaseStatics(param0 + 92);
        SessionUrlSupport.releaseStatics(false);
        NetworkGameClient.releaseStatics(true);
        ClientException.releaseStatics((byte) -95);
        GameAppletShell.releaseAppletResources(1);
        JaggrabDownloader.releaseStatics(param0 - 8);
        MouseInputHandler.releaseStatics(param0 - 7);
        MouseWheelInput.releaseStatics((byte) 66);
        ResourceArchive.releaseStatics(param0 ^ -122);
        LoginResponseUiSupport.releaseStatics(29136);
        TrinketCatalog.releaseStatics(false);
        PacketBuffer.releaseStatics((byte) 88);
        MonotonicClock.releaseStatics((byte) -64);
        SharedSpriteTables.releaseStatics((byte) 122);
        PanelSpriteFactory.releaseStatics(-81);
        MusicVolumeSupport.releaseStatics((byte) 53);
        SocialUiState.releaseStatics(false);
        RankingRowFactory.releaseStatics(param0 ^ 6);
        OverlayLayerSupport.releaseStatics(param0 - 6);
        ChatMessage.releaseStatics(2);
        ChatComposeMode.releaseStatics(0);
        NotificationPanelPositionSupport.releaseStatics((byte) 60);
        TickClock.releaseStatics((byte) -116);
        ArchivePreloader.releaseStatics(true);
        FullscreenFocusCanvas.releaseStatics((byte) 25);
        CanvasResizePolicy.releaseStatics(param0 - 1712);
        SpriteBackgroundSupport.releaseStatics(-1);
        MatchScreen.releaseStatics(true);
        TournamentLobbyScreen.releaseStatics(true);
        AppScreen.releaseStatics((byte) 125);
        DebugConsole.releaseStatics(-1);
        SpriteState.releaseStatics((byte) -28);
        DualLinkNode.releaseStatics(13421568);
        IntrusiveNode.releaseStatics(126);
        BlankScreen.releaseStatics(param0 + 50);
        KitStyleDefinition.releaseStatics(true);
        ModelMaterialDecoder.releaseStatics(-49);
        AuctionLogEntry.releaseStatics(110);
        GameResourceLoader.releaseStatics(1);
        MatchHudSupport.releaseStatics((byte) -13);
        PitchDecorationSupport.releaseStatics(0);
        Trinket.releaseStatics(140);
        MatchPhaseView.releaseStatics(104);
        ClassDescriptorSupport.releaseStatics((byte) 101);
        PopupDialog.releaseStatics(false);
        BrowserUiSupport.releaseStatics((byte) -73);
        RenderedFootballer.releaseStatics((byte) 14);
        WorldDrawEntry.releaseStatics(17);
        PitchSurfaceLoader.releaseStatics((byte) -118);
        GradientRasterSupport.releaseStatics((byte) -72);
        AccountNameCharacterSupport.releaseStatics(-25514);
        ConsoleLexer.releaseStatics(true);
        ClientPacketFlushSupport.releaseStatics((byte) 114);
        UrlRequest.releaseStatics(-1316);
        NamedValueContainer.releaseStatics((byte) -126);
        SpritePixelSupport.releaseStatics();
        ThreadSleepSupport.releaseStatics(-9097);
        ExceptionTextSupport.releaseStatics(false);
        MatchUiLayoutSupport.releaseStatics((byte) -127);
        NineSlicePanelPainter.releaseStatics((byte) -90);
        TriangleRasterizer.releaseStatics();
        TutorialMessages.releaseStatics(0);
        TextPromptState.releaseStatics(false);
        SoundCache.releaseStatics((byte) -116);
        HuffmanCodec.releaseStatics(0);
        PcmPlayerService.releaseStatics();
        MusicTrackMixer.releaseStatics((byte) -99);
        ButtonMenuScreen.releaseStatics((byte) -107);
        TooltipOverlay.releaseStatics((byte) 108);
        GoalSpriteLoader.releaseStatics(param0 ^ 7);
        ScrollBar.releaseStatics(-123);
        UiLayoutNode.releaseStatics(-14457);
        MenuButton.releaseStatics((byte) -6);
        MenuSelection.releaseStatics((byte) -22);
        BufferedCacheFile.releaseStatics(81);
        QuickChatMenuFactory.releaseStatics(true);
        LoginText.releaseStatics(0);
        ClientUiUpdateSupport.releaseStatics((byte) -43);
        DisplayModeSupport.releaseStatics(param0 ^ -121);
        LoginKind.releaseStatics((byte) -118);
        LoginCredentials.releaseStatics(-27680);
        BufferedSocket.releaseStatics(param0 ^ -109);
        BlackFadeScreen.releaseStatics(125);
        SplashScreen.releaseStatics(-1);
        TeamManagementScreen.releaseStatics((byte) 91);
        ShopPlayerSlot.j(param0 - 246);
        PitchOptionTile.releaseStatics((byte) -17);
        UiInputRoutingSupport.releaseStatics(param0 ^ 31347);
        MatchTransitionScreen.releaseStatics(14513);
        ParticipantStatus.releaseStatics(true);
        LoggedGoal.releaseStatics((byte) 119);
        SharedChatLayoutSupport.releaseStatics((byte) -124);
        BitmapFont.releaseStatics();
        CommonGame.releaseStatics(true);
        IsaacRandom.releaseStatics(1);
        RasterGlowSupport.releaseStatics((byte) 111);
        VorbisSample.releaseStatics();
        FadingSoundPlayer.releaseStatics(0);
        UnreadMessagesScreen.releaseStatics(param0 ^ -54);
        ChatComposeSupport.releaseStatics((byte) -127);
        RankingsScreen.releaseStatics(-71);
        RegistrationUiSupport.releaseStatics(param0 ^ 3547);
        GameplayHelpScreen.g(29250);
        PitchPurchaseSupport.releaseStatics((byte) -100);
        RenderedBall.i(127);
        PlayArea.releaseStatics((byte) -124);
        BallAgent.releaseStatics(0);
        FootballerAgent.e((byte) -108);
        TextLineLayoutSupport.releaseStatics(116);
        PitchAppearanceSupport.releaseStatics(param0 ^ 6);
        IconLabel.releaseStatics(0);
        VerticalScrollbar.releaseStatics(param0 ^ 116);
        SharedWidgetFactory.releaseStatics(false);
        ContextMenu.releaseStatics((byte) 38);
        FriendsListPanel.releaseStatics(1);
        PlayerContextMenu.releaseStatics(123);
        ScrollPane.releaseStatics((byte) -122);
        TextPromptDialog.releaseStatics(true);
        LobbyPlayerRow.releaseStatics(240);
        GameSetupPanel.releaseStatics(-7);
        DualLinkHashTable.releaseStatics((byte) 36);
        LoadingProgressSupport.releaseStatics(-5514);
        AudioOutputSupport.releaseStatics(1114366657);
        LocalizedTextLoader.releaseStatics(param0 - 6);
        LeaguesScreen.releaseStatics(-38);
        AppletContextSupport.releaseStatics((byte) -113);
        AuctionHelpResources.releaseStatics(true);
        LobbyGameRecord.releaseStatics((byte) 101);
        ArchiveReconnectSupport.releaseStatics(50);
        PlayerMeshFactory.releaseStatics((byte) -116);
        QuickChatMenuBuilder.releaseStatics(false);
        LoggedPlayer.releaseStatics(48);
        LoggedPossession.releaseStatics(320);
        ParticipantAgent.releaseStatics(92);
        TeamSelectionAgent.releaseStatics((byte) -90);
        FormationAgent.a(true);
        GoalStateAgent.releaseStatics((byte) -30);
        PlayerInputEvent.releaseStatics(0);
        MatchAgent.releaseStatics(-3);
        SocialRowOrderSupport.releaseStatics(0);
        FindingOpponentScreen.releaseStatics(130);
        ServerMessageScreen.releaseStatics(true);
        PortraitCacheOrder.releaseStatics(-89);
        QuickChatKeysHelpPanel.releaseStatics(param0 ^ 78);
        SocialListProtocolSupport.releaseStatics(false);
        ModelMesh.releaseStatics();
        LineupPositionSupport.releaseStatics(320);
        TextInputUiSupport.releaseStatics(param0 ^ 125);
        DualLinkDeque.releaseStatics(1603);
        ConsolePanel.releaseStatics((byte) -53);
        TextLine.releaseStatics(-64);
        PitchCoordinateSupport.releaseStatics((byte) 123);
        TextFieldNode.releaseStatics(param0 + 90);
        IndexedSpriteState.a(-75);
        WorldSpriteSequence.releaseStatics(0);
        PlayerModelPreview.releaseStatics((byte) 126);
        ClassNameSupport.releaseStatics((byte) -127);
        AchievementsScreen.releaseStatics((byte) 81);
        SoftwareDrawingSupport.releaseStatics();
        ScrollContainer.i((byte) -69);
        AuctionsScreen.h((byte) -53);
        CheckboxLabelWidget.a(0);
        AuctionTableWidget.releaseStatics((byte) 68);
        ReceivedAuctionItemRow.releaseStatics(-25734);
        IntrusiveNodeHashTable.releaseStatics((byte) -111);
        MySquadScreen.releaseStatics(-2010043359);
        SquadGridWidget.releaseStatics((byte) -127);
        TrinketSlot.releaseStatics((byte) -108);
        PlayerShopScreen.releaseStatics((byte) -111);
        ColumnTableWidget.releaseStatics(false);
        SquadSlotWidget.releaseStatics((byte) -123);
        ContextMenuItem.a(-15410);
        SocialTabsPanel.releaseStatics(-97);
        TabStrip.releaseStatics(true);
        HoverTooltip.releaseStatics((byte) 39);
        TrinketUnlockNotice.releaseStatics((byte) 16);
        SpriteResourceSupport.releaseStatics((byte) 116);
        TextEntrySupport.releaseStatics(param0 - 121);
        MidiPcmStream.releaseStatics((byte) -32);
        ArchiveIndex.releaseStatics(param0 ^ 6);
        GzipDecoder.releaseStatics(113);
        ArchiveSource.releaseStatics(false);
        VorbisFloor.releaseStatics();
        AudioService.releaseStatics((byte) 60);
        MyPitchScreen.releaseStatics(-107);
        MessageDialog.releaseStatics((byte) 90);
        HelpTipDialog.g((byte) -111);
        SaveChangesDialog.releaseStatics(13);
        LoginRequiredDialog.g(param0 + 2350);
        TutorialChoiceDialog.releaseStatics((byte) -117);
        WelcomeDialog.releaseStatics(100);
        PromotionDialog.releaseStatics(22100);
        TournamentChampionDialog.h(0);
        LeagueWinnerDialog.releaseStatics((byte) -93);
        SquadPickerDialog.g(-14948);
        AuctionSettingsDialog.releaseStatics(-8332);
        ColourSwatchTile.releaseStatics(-31922);
        AuctionBidDialog.g(0);
        StatChoiceDialog.releaseStatics(param0 ^ 25994);
        SellPlayerDialog.releaseStatics(24342);
        TrinketShopDialog.releaseStatics(false);
        TrinketPickerDialog.releaseStatics(2);
        BuyPitchDialog.g((byte) -45);
        BuyPlayerDialog.releaseStatics(30);
        AuctionListingDialog.releaseStatics(false);
        PlayAreaMovementSupport.releaseStatics(-122);
        FriendRemovalSupport.releaseStatics(false);
        KitPatternMaskSupport.releaseStatics(66049);
        FixedVelocitySupport.releaseStatics(0);
        ModalStack.releaseStatics(-1);
        RegistrationRequestDialog.releaseStatics(248);
        LoadingProgressDialog.releaseStatics((byte) 110);
        LoginDialog.j((byte) 53);
        AccountRequestDialog.j((byte) -108);
        AccountRegistrationPanel.releaseStatics((byte) -94);
        AccountChoicePanel.releaseStatics(2);
        LoginForm.releaseStatics(param0 ^ -11205);
        DisplayNameForm.releaseStatics((byte) -94);
        WidgetTheme.releaseStatics(10);
        GameMediaSupport.releaseStatics((byte) -100);
        FadingSoundSupport.releaseStatics(false);
        FullscreenErrorDialog.releaseStatics((byte) 77);
        GuestLoginSupport.releaseStatics((byte) -98);
        ResizableModalPanel.releaseStatics(1);
        TextWidgetPainter.releaseStatics(true);
        TextButton.a(79);
        UiWidget.releaseStatics((byte) 88);
        ModalPanel.releaseStatics((byte) -103);
        WidgetContainer.releaseStatics(param0 ^ -336184830);
        IntrusiveDequeCursor.releaseStatics((byte) -65);
        TextLayout.releaseStatics(0);
        SingleChildContainer.releaseStatics(31068);
        SharedPanelFactory.releaseStatics(127);
        ArchiveNetworkClient.releaseStatics(param0 - 6);
        DiskCacheWorker.releaseStatics(2);
        ArchiveManager.releaseStatics(-2147483648);
        ModelMaterial.releaseStatics(64);
        TriangleMesh.releaseStatics((byte) 94);
        MeshPreviewSupport.releaseStatics((byte) 7);
        DiagnosticsOverlaySupport.releaseStatics(-109);
        SpriteNumberPainter.releaseStatics((byte) -88);
        ConsoleTokenParser.releaseStatics(0);
        RandomAccessCacheFile.releaseStatics(113);
        DelegatingCanvas.releaseStatics((byte) 125);
        SquadOrderSupport.releaseStatics(-10);
        IntKeyLookup.releaseStatics((byte) 94);
        ByteStorage.releaseStatics((byte) 98);
        Bzip2Decoder.releaseStatics();
        Bzip2State.b(3);
        ReflectionCheck.releaseStatics(0);
        ByteArrayPool.releaseStatics((byte) 106);
        CheckboxPainter.releaseStatics((byte) 109);
        StatefulTextPainter.releaseStatics(-116);
        RotaryDialPainter.releaseStatics(-19485);
        MarkerSliderPainter.releaseStatics(-24229);
        MatchHudRoutingSupport.releaseStatics(7);
        DefaultPlayerFactory.releaseStatics(true);
        GameQuickChatResolver.releaseStatics(19044);
        ByteArrayPoolState.releaseStatics(false);
        CascadingMenu.releaseStatics(111);
        QuickChatCategoryCache.releaseStatics(true);
        QuickChatPhraseCache.releaseStatics(30297);
        QuickChatPhraseDefinition.releaseStatics(71);
        WeightedLruCache.releaseStatics((byte) -32);
        SocketConnector.releaseStatics(99);
        ProxyAuthenticationRequiredException.releaseStatics((byte) -125);
        NanoTickClock.releaseStatics(125);
        ImageProducerRasterBuffer.releaseStatics((byte) -29);
        ClientInteractionSupport.releaseStatics(param0 + 55);
        FullscreenDisplayMode.releaseStatics(-1);
        ClientUiOverlay.releaseStatics(false);
        GameOverView.releaseStatics(-39);
        PlayingView.releaseStatics((byte) -40);
        TeamSelectionView.g(param0 - 119);
        WaitForPlayersView.releaseStatics(1);
        FormationView.f(param0 - 15646);
        LineupView.releaseStatics((byte) -113);
        DateOfBirthPanel.releaseStatics(param0 + 905215451);
        MeshObject.releaseStatics((byte) -39);
        FaceNormal.releaseStatics((byte) 107);
        VertexNormal.releaseStatics(-66);
        AnimationSkeleton.releaseStatics(-1);
        Cp1252EncodingSupport.releaseStatics(param0 + 121);
        AnimationFrameset.releaseStatics((byte) -31);
        AnimationFrame.releaseStatics();
        TutorialScenerySupport.releaseStatics(17437);
        SharedScrollbarState.releaseStatics((byte) -128);
        AnimationClip.releaseStatics(256);
        GrayscalePaletteSupport.releaseStatics(true);
        TutorialCaptionSupport.releaseStatics((byte) 40);
        RasterGammaSupport.releaseStatics(-123);
        MatchTextInputOverlay.releaseStatics((byte) 125);
        MusicPatchNode.releaseStatics((byte) -80);
        MidiFileReader.releaseStatics();
        MusicPatchPcmStream.releaseStatics(false);
        PagedHelpScreen.releaseStatics(param0 - 29110);
        SocketArchiveNetworkClient.releaseStatics((byte) -115);
        NetworkArchiveRequest.releaseStatics(true);
        SectorCacheStore.releaseStatics(-1);
        DiskCacheRequest.releaseStatics(-26236);
        CachedArchiveSource.releaseStatics((byte) -119);
        FootballerAiOverlaySupport.releaseStatics((byte) 69);
        ArchiveRequest.releaseStatics((byte) 18);
        AuctionPriceLimits.releaseStatics((byte) 105);
        CaptionedContainer.releaseStatics(115);
        ValidatedTextWidget.releaseStatics((byte) 74);
        TextInputWidget.releaseStatics(param0 - 6);
        ContentTransitionDialog.releaseStatics(12);
        NameSuggestionsPanel.releaseStatics(param0 - 6);
        TextHotspotWidget.releaseStatics(param0 + 9568);
        ValidationIndicator.releaseStatics((byte) 38);
        ValidationHelpWidget.releaseStatics((byte) -120);
        Checkbox.releaseStatics((byte) 108);
        TextFieldValidator.releaseStatics((byte) -124);
        KitUnlockNoticeSupport.releaseStatics(true);
        AccountTermsPanel.releaseStatics(0);
        CalendarSupport.releaseStatics(-79);
        SynthesizedSoundInstrument.releaseSynthesisBuffers();
        InstrumentNoteMask.releaseStatics(96);
        MainMenuScreen.releaseStatics(90);
        GameModesHelpScreen.releaseStatics(128);
        LeaguesHelpScreen.releaseStatics(60);
        AuctionsHelpScreen.releaseStatics(false);
        MyKitScreen.releaseStatics(8);
        MachineTokenStorageSupport.releaseStatics(123);
        RowRangeRequest.releaseStatics((byte) -49);
        DateInputValidator.releaseStatics(param0 ^ -5);
        NumericDateInputWidget.releaseStatics(-23192);
        ArrayWidgetContainer.releaseStatics(false);
        PitchProjectionSupport.releaseStatics(99);
        PlayerInputFactory.releaseStatics(param0 ^ 136);
        GoalkeeperAiSupport.releaseStatics(23);
        MusicPatch.releaseStatics((byte) -37);
        InstrumentEnvelope.releaseStatics(93);
        WhirlpoolHasher.releaseStatics(0);
        RotaryDialWidget.releaseStatics(-1);
        MarkerSliderWidget.releaseStatics(696);
        CachedTextLayout.releaseStatics((byte) -103);
        DraggableWidget.releaseStatics((byte) -112);
        DropTargetWidget.releaseStatics(31235);
        DirectByteStorage.releaseStatics((byte) -56);
        GrowableIntList.releaseStatics(true);
        IterableNodeHashTable.releaseStatics(false);
        IterableDualLinkDeque.releaseStatics(18);
        WeightedCacheEntry.releaseStatics((byte) -46);
        QuickChatCommandType.releaseStatics((byte) 101);
        StrongCacheEntry.releaseStatics(-1);
        ProxySocketConnector.releaseStatics(false);
        OffscreenPlayerArrow.releaseStatics(43);
        DateInputWidget.releaseStatics(param0 ^ -104);
        AsciiCharacterSupport.releaseStatics(-73);
        SoundFilter.releaseStatics();
        KitStyleTile.releaseStatics(4476);
        NodeHashTableIterator.releaseStatics(1);
        DualLinkDequeIterator.releaseStatics(-119);
        GameSoundEffect.a(true);
        SoundStreamHandle.releaseStatics((byte) 100);
        ReceivedAuctionItem.releaseStatics((byte) -126);
        RankingsRequest.releaseStatics((byte) 122);
        HighScoreQuery.releaseStatics(-1859);
        HighScoreSubmission.releaseStatics(0);
        LeaderboardParticipant.releaseStatics(param0 ^ 6);
        SpriteButtonPainter.releaseStatics(-1842526431);
        LinkTextPainter.releaseStatics(param0 + 18080);
        BeveledTextPainter.releaseStatics(true);
        PasswordFieldPainter.releaseStatics(102);
        IconButtonPainter.releaseStatics((byte) 106);
        AlphaContainer.releaseStatics((byte) 115);
        ArchivePreloadEntry.releaseStatics((byte) -116);
        AchievementQuery.releaseStatics(7571);
        AchievementSubmission.releaseStatics(84);
        LobbyMatchPreview.releaseStatics((byte) -104);
        ConsoleExpression.releaseStatics(param0 - 6);
        ConsoleValue.releaseStatics((byte) -126);
        ConsoleCommand.releaseStatics(15);
        ConsoleParseException.releaseStatics((byte) 121);
        ConsoleEvaluationException.releaseStatics(param0 ^ 6);
        StringCursor.releaseStatics(-127);
        ConsoleTokenCursor.releaseStatics(-84);
        PlayerSurnameSortCriterion.releaseStatics((byte) 38);
        PlayerArchetypeSortCriterion.releaseStatics(20);
        TrinketCountSortCriterion.releaseStatics((byte) -35);
        PlayerValueSortCriterion.releaseStatics(param0 - 6);
        PlayerStatSortCriterion.releaseStatics((byte) 85);
        SortCriterion.releaseStatics((byte) 121);
        TexturedPanelPainter.a(-15207);
        GeneratedPanelPainter.releaseStatics((byte) 125);
        CheatCodeListener.releaseStatics(param0 ^ 32312);
        PendingRequestAcknowledgement.releaseStatics(param0 - 121);
        AvailabilityCheckRequest.releaseStatics((byte) -122);
        ClientProtocolStage.releaseStatics(param0 ^ -94);
        DelayedServerPacket.releaseStatics(104);
        AccountNameCheckState.releaseStatics(-5);
        AccountRegistrationResponse.releaseStatics(param0 ^ param0);
        NamedValueEntry.a(92);
        FootballerPreview.releaseStatics(true);
        LoginMethod.releaseStatics(120);
        KeyedLoginCredentials.releaseStatics((byte) -104);
        AlternateKeyedLoginCredentials.releaseStatics(false);
        PasswordLoginCredentials.releaseStatics(85);
        WorldSpriteDecoration.releaseStatics((byte) -47);
        PlayerPortraitCacheEntry.releaseStatics(0);
        RankingRowNode.releaseStatics(-13);
        CachedListingRow.releaseStatics((byte) -123);
        ListingRowCache.releaseStatics(22897);
        SumIntegersCommand.releaseStatics(10040319);
        WriteIntegersCommand.releaseStatics(1);
        DemoIntegersCommand.releaseStatics(param0 - 6);
        DoSomethingCommand.g(param0 + 121);
        ThreeCommand.releaseStatics(false);
        IsSixCommand.g(50);
        NotCommand.g(115);
        IntDoubleCommand.releaseStatics(param0 ^ -107);
        IntTripleCommand.g(220);
        LongPlusOneCommand.releaseStatics(1);
        BytePlusOneCommand.releaseStatics((byte) 52);
        SetLagCommand.a(false);
        BroadcastServerCommand.releaseStatics((byte) 96);
        SelectableTrinketIcon.releaseStatics((byte) 118);
        ListRow.releaseStatics(-18523);
        TrinketTile.releaseStatics((byte) -117);
        TrinketIcon.releaseStatics(true);
        AccountMessagePanel.a(14);
        FullscreenFailureReason.releaseStatics((byte) 121);
        TextLayoutLine.releaseStatics((byte) -125);
        LookupQuery.releaseStatics((byte) -61);
        LookupRecordUpdate.releaseStatics(2);
        StreetSceneryLoader.releaseStatics(-77);
        BlobSubmission.releaseStatics(1);
        PainterStyle.releaseStatics(true);
        EntityAfterimage.releaseStatics(0);
        AccountNameAvailabilityValidator.releaseStatics(-70);
        PasswordValidator.releaseStatics((byte) -96);
        EmailSyntaxValidator.releaseStatics((byte) -126);
        EmailAvailabilityValidator.releaseStatics(-29635);
        AgeValidator.releaseStatics((byte) 92);
        MatchingTextValidator.releaseStatics((byte) 76);
        RegistrationRequestState.releaseStatics((byte) 68);
        TextHotspotRegion.releaseStatics((byte) -94);
        ValidationState.releaseStatics(-89);
        DebouncedValidationProvider.d(param0 ^ 344);
        ColorQuantizationBox.releaseStatics(param0 ^ -110);
        AccountInputValidationResult.releaseStatics((byte) 112);
        this.field_z = null;
    }

    public final void init() {
        this.initializeAppletParameters("Kickabout", 19, (byte) -60);
    }

    static {
        field_I = "Name is available";
        field_F = "Duration";
    }
}
