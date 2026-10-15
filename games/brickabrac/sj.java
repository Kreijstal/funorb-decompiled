/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static String field_g;
    static MidiSynthesizer field_f;
    static String field_e;
    static UiComponent field_a;
    static String[] field_c;
    static UiComponent field_d;
    static LoadingProgressDialog loadingProgressDialog;

    final static ChatMessage a(int param0, int param1, int param2, int param3) {
        Object stackIn_42_0 = null;
        UiComponent stackIn_42_1 = null;
        boolean stackIn_50_0 = false;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        ChatMessage var8_ref_gb;
        int var9;
        ChatMessage var9_ref_gb;
        int var10_int;
        String var10;
        String var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = BrickABrac.field_J ? 1 : 0;
        var4 = null;
        AchievementIcon.field_q.content.children.clear((byte) -61);
        var5 = 0;
        var6 = 0;
        for (var7 = -1 + ScrollPane.chatHistorySize; var7 >= 0; var7--) {
          var8_ref_gb = UnderwaterBackground.chatHistory[var7];
          var9 = 0;
          if (!TextWidgetRenderer.field_e &&
            var5 < WidgetTheme.chatHistoryCategoryLimit) {
            var10_int = tm.getChatFilter(var8_ref_gb.channel, (byte) 18);
            if (var10_int <= var8_ref_gb.getRetentionCategory(true) && (var8_ref_gb.systemMessage ||
              !AchievementBrowserScreen.isIgnoredPlayer(125, var8_ref_gb.senderName))) {
              var9 = 1;
            }
          }
          if (var9 == 0) {
            var8_ref_gb.component = null;
          } else {
            var5++;
            if (var8_ref_gb.component == null ||
              LevelSequence.chatFiltersChanged) {
              if (null == var8_ref_gb.component) {
                Brick.field_E = Brick.field_E + 1;
              }
              var10 = IntNode.formatChatPrefix(var8_ref_gb, (byte) 91);
              var11 = var10 + TextFont.escapeAngles(var8_ref_gb.text);
              var12 = IntrusiveHashIterator.getChatMessageColor(-31126, var8_ref_gb);
              var8_ref_gb.component = new UiComponent(0L, field_a, var11);
              var8_ref_gb.component.capturedTextColor = var12 + (-((var12 & 16711422) >> 1) + (field_a.capturedTextColor >> 1 & 8355711));
              var8_ref_gb.component.activeTextColor = (field_a.activeTextColor >> 1 & 8355711) - (8355711 & var12 >> 1) + var12;
              var8_ref_gb.component.textColor = var12;
              var8_ref_gb.component.font = CachedArchiveSource.field_y;
              var6 = var6 + param1;
            }
          }
        }
        var7Lifetime1 = 0;
        for (var8 = 0; ScrollPane.chatHistorySize > var8; var8++) {
          var9_ref_gb = UnderwaterBackground.chatHistory[var8];
          if (null != var9_ref_gb.component) {
            AchievementIcon.field_q.content.addChild(var9_ref_gb.component, 0);
            var9_ref_gb.component.setBounds(param1, var7Lifetime1, param0, var9_ref_gb.component.getContentWidth(87), (byte) 64);
            if (var9_ref_gb.component.pressedButton != 0) {
              var4 = var9_ref_gb;
            }
            var7Lifetime1 = var7Lifetime1 + param1;
          }
        }
        var8Lifetime1 = AchievementIcon.field_q.content.remainingHeight + AchievementIcon.field_q.content.height - (-var6 + var7Lifetime1);
        AchievementIcon.field_q.content.height = AchievementIcon.field_q.content.height - var8Lifetime1;
        AchievementIcon.field_q.content.localY = AchievementIcon.field_q.content.localY + var8Lifetime1;
        if (LevelSequence.chatFiltersChanged) {
          AchievementIcon.field_q.content.height = var7Lifetime1;
        }
        AchievementIcon.field_q.content.remainingHeight = var7Lifetime1 - AchievementIcon.field_q.content.height;
        if (LevelSequence.chatFiltersChanged) {
          LevelSequence.chatFiltersChanged = false;
          AchievementIcon.field_q.content.localY = AchievementIcon.field_q.viewport.height - AchievementIcon.field_q.content.height;
          nd.field_b = true;
          AchievementIcon.field_q.content.remainingY = 0;
        }
        if (param2 != -13294) {
          field_d = (UiComponent) null;
        }
        if (MatchResultScreen.field_s) {
          stackIn_42_0 = null;
          stackIn_42_1 = SoundCache.field_k;
          if (stackIn_42_0 != stackIn_42_1) {
            nd.field_b = true;
          }
        }
        var9Lifetime1 = AchievementIcon.field_q.viewport.height - (AchievementIcon.field_q.content.height + AchievementIcon.field_q.content.remainingHeight);
        if (nd.field_b) {
          AchievementIcon.field_q.content.remainingY = var9Lifetime1 - AchievementIcon.field_q.content.localY;
        }
        AchievementIcon.field_q.updateScroll(true, param1, true, 2 * (param1 * param3));
        stackIn_50_0 = (var9Lifetime1 == AchievementIcon.field_q.content.remainingY + AchievementIcon.field_q.content.localY);
        nd.field_b = stackIn_50_0;
        return (ChatMessage) (var4);
    }

    final static void a(java.applet.Applet param0, byte param1, String param2, String param3, long param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            if (param1 <= 66) {
              sj.a(-31, 62, -5, -79);
            }
            try {
              var8 = param0.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param3 + "=" + param2 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (0L > param4) {
                var7Lifetime4 = var9 + "; Discard;";
              } else {
                var7Lifetime4 = var9 + "; Expires=" + AppletGameShell.a((byte) -75, MonotonicTime.nowMillis(false) + param4 * 1000L) + "; Max-Age=" + param4;
              }
              ne.a(param0, "document.cookie=\"" + var7Lifetime4 + "\"", 5797);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("sj.C(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param3 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void handleLobbyResponse(byte obfuscationGuard) {
        LobbyPlayer stackIn_111_0 = null;
        boolean stackIn_112_1 = false;
        int stackIn_133_0 = 0;
        LobbyPlayer stackIn_139_0 = null;
        boolean stackIn_140_1 = false;
        RuntimeException decompiledCaughtException = null;
        BitPacketBuffer packet = null;
        RuntimeException failure = null;
        int responseKind = 0;
        long playerId = 0L;
        int var3_int = 0;
        LobbyPlayer resetPlayer = null;
        int gameStatus = 0;
        LobbyGame updatedGame = null;
        int playerStatus = 0;
        String nameUpdateMarker = null;
        LobbyGame statusGameAlias = null;
        LobbyPlayer gamePlayer = null;
        LobbyPlayer lobbyPlayer = null;
        int gamePackedMembershipCount = 0;
        int hasNameUpdate = 0;
        int lobbyPackedMembershipCount = 0;
        int clientBranchFlag = 0;
        LobbyPlayer removedGamePlayer = null;
        LobbyPlayer requestPlayer = null;
        LobbyGame statusGame = null;
        Object var17 = null;
        Object var18 = null;
        LobbyGame requestGame = null;
        Object var19 = null;
        Object var20 = null;
        LobbyGame invitedGameLookup = null;
        LobbyPlayer removedLobbyPlayer = null;
        Object var22 = null;
        LobbyGame invitedGame = null;
        LobbyPlayer pendingPlayer = null;
        LobbyPlayer removedGamePlayerAlias = null;
        String gameAccountName = null;
        String gameDisplayName = null;
        LobbyPlayer requestPlayerAlias = null;
        String lobbyAccountName = null;
        String lobbyDisplayName = null;
        LobbyPlayer existingLobbyPlayer = null;
        LobbyGame removedGame = null;
        LobbyGame clearedGame = null;
        LobbyPlayer clearedLobbyPlayer = null;
        var22 = null;
        var17 = null;
        var20 = null;
        var18 = null;
        var19 = null;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          regionExit1: {
            packet = jl.incomingPackets;
            responseKind = ((PacketBuffer) ((Object) packet)).readUnsignedByte(255);
            if (responseKind != 0 &&
              responseKind != 1 &&
              responseKind != 2 &&
              responseKind != 3 &&
              4 != responseKind) {
              if (responseKind == 5) {
                playerId = ((PacketBuffer) ((Object) packet)).readLong(-32768);
                lobbyAccountName = ((PacketBuffer) ((Object) packet)).readCp1252String(-1);
                nameUpdateMarker = ((PacketBuffer) ((Object) packet)).readCp1252String(-1);
                lobbyDisplayName = ((PacketBuffer) ((Object) packet)).readCp1252String(-1);
                existingLobbyPlayer = MatchCompleteScreen.findLobbyPlayer((byte) 96, playerId);
                lobbyPlayer = existingLobbyPlayer;
                stackIn_133_0 = (nameUpdateMarker.equals("")) ? 0 : 1;
                hasNameUpdate = stackIn_133_0;
                if (existingLobbyPlayer != null) {
                  if (hasNameUpdate != 0) {
                    existingLobbyPlayer.updateNames(lobbyDisplayName, lobbyAccountName, (byte) -121);
                  }
                } else {
                  lobbyPlayer = new LobbyPlayer(lobbyAccountName, lobbyDisplayName, playerId);
                  WhirlpoolHasher.lobbyPlayerIndex.put(playerId, lobbyPlayer, 86);
                }
                lobbyPlayer.arrivalTimeMillis = MonotonicTime.nowMillis(false) - (long)((PacketBuffer) ((Object) packet)).readInt(255);
                lobbyPlayer.rating = ((PacketBuffer) ((Object) packet)).readUnsignedShort(65280);
                lobbyPackedMembershipCount = ((PacketBuffer) ((Object) packet)).readVarInt((byte) 110);
                lobbyPlayer.ratedGameCount = lobbyPackedMembershipCount >> 1;
                stackIn_139_0 = lobbyPlayer;
                stackIn_140_1 = ((1 & lobbyPackedMembershipCount) != 0);
                stackIn_139_0.member = stackIn_140_1;
                lobbyPlayer.badgeId = ((PacketBuffer) ((Object) packet)).readUnsignedByte(255);
                lobbyPlayer.optionEligibilityMask = ((PacketBuffer) ((Object) packet)).readUnsignedByte(255);
                ValidationIconWidget.insertSortedLobbyPlayer(lobbyPlayer, 17574);
                break regionExit1;
              }
              if (responseKind == 6) {
                playerId = ((PacketBuffer) ((Object) packet)).readLong(obfuscationGuard ^ -32735);
                playerStatus = ((PacketBuffer) ((Object) packet)).readUnsignedByte(255);
                removedLobbyPlayer = MatchCompleteScreen.findLobbyPlayer((byte) 96, playerId);
                if ((removedLobbyPlayer != null)) {
                  if (removedLobbyPlayer.joinRequestPending) {
                    uf.pendingJoinRequestCount = uf.pendingJoinRequestCount - 1;
                    removedLobbyPlayer.joinRequestPending = false;
                  }
                  if (playerStatus == 0) {
                    removedLobbyPlayer.unlink((byte) 111);
                  } else {
                    removedLobbyPlayer.removalStatus = playerStatus;
                    removedLobbyPlayer.statusChangeTick = AlternateNumericLoginCredentials.field_o;
                  }
                  removedLobbyPlayer.unlinkSecondary(obfuscationGuard ^ 34);
                }
              } else {
                if (responseKind == 7) {
                  clearedLobbyPlayer = (LobbyPlayer) (GameplayRenderHelpers.lobbyPlayers.first(-61));
                  while (clearedLobbyPlayer != null) {
                    clearedLobbyPlayer.unlink((byte) 111);
                    clearedLobbyPlayer.unlinkSecondary(3);
                    clearedLobbyPlayer = (LobbyPlayer) (GameplayRenderHelpers.lobbyPlayers.next((byte) 116));
                  }
                  uf.pendingJoinRequestCount = 0;
                } else {
                  if (responseKind == 8) {
                    var3_int = ((PacketBuffer) ((Object) packet)).readUnsignedShort(65280);
                    updatedGame = (LobbyGame) (LevelResultSubmission.lobbyGameIndex.get((long)var3_int, -1));
                    if (updatedGame == null) {
                      updatedGame = new LobbyGame(RankingsRequest.gameSettingCount);
                      LevelResultSubmission.lobbyGameIndex.put((long)var3_int, updatedGame, 47);
                    }
                    EmailLoginCredentials.decodeLobbyGame(updatedGame, packet, 0, true);
                    ic.insertSortedLobbyGame(true, updatedGame);
                  } else {
                    if (9 == responseKind) {
                      var3_int = ((PacketBuffer) ((Object) packet)).readUnsignedShort(65280);
                      gameStatus = ((PacketBuffer) ((Object) packet)).readUnsignedByte(255);
                      removedGame = (LobbyGame) (LevelResultSubmission.lobbyGameIndex.get((long)var3_int, -1));
                      if ((removedGame != null)) {
                        if (gameStatus == 0) {
                          removedGame.unlink((byte) 111);
                        } else {
                          removedGame.removalStatus = gameStatus;
                          removedGame.statusChangeTick = AlternateNumericLoginCredentials.field_o;
                        }
                        removedGame.unlinkSecondary(3);
                      }
                    } else {
                      if (responseKind == 10) {
                        clearedGame = (LobbyGame) (rq.lobbyGames.first(-62));
                        while (clearedGame != null) {
                          clearedGame.unlink((byte) 111);
                          clearedGame.unlinkSecondary(3);
                          clearedGame = (LobbyGame) (rq.lobbyGames.next((byte) 116));
                        }
                      } else {
                        if (responseKind != 11 &&
                          responseKind != 12) {
                          if (responseKind == 13) {
                            var3_int = ((PacketBuffer) ((Object) packet)).readUnsignedShort(65280);
                            gameStatus = ((PacketBuffer) ((Object) packet)).readUnsignedByte(255);
                            requestGame = (LobbyGame) (LevelResultSubmission.lobbyGameIndex.get((long)var3_int, obfuscationGuard - 34));
                            if ((requestGame != null)) {
                              statusGame = requestGame;
                              statusGameAlias = statusGame;
                              requestGame.joinRequestPending = false;
                              statusGame.invitationPending = false;
                              if (gameStatus != 0) {
                                requestGame.removalStatus = gameStatus;
                                requestGame.statusChangeTick = AlternateNumericLoginCredentials.field_o;
                              }
                              ic.insertSortedLobbyGame(true, requestGame);
                            }
                          } else {
                            if (responseKind != 14 &&
                              16 != responseKind) {
                              if (responseKind != 15 &&
                                responseKind != 17) {
                                switch (responseKind) {
                                  case 18:
                                    playerId = ((PacketBuffer) ((Object) packet)).readLong(-32768);
                                    gameAccountName = ((PacketBuffer) ((Object) packet)).readCp1252String(obfuscationGuard - 34);
                                    gameDisplayName = ((PacketBuffer) ((Object) packet)).readCp1252String(obfuscationGuard - 34);
                                    gamePlayer = EmailAvailabilityRequest.findGamePlayer(playerId, 2);
                                    if (gamePlayer == null) {
                                      gamePlayer = new LobbyPlayer(gameAccountName, gameDisplayName, playerId);
                                      BrickABrac.gamePlayerIndex.put(playerId, gamePlayer, 48);
                                      o.currentLobbyGame.playerCount = o.currentLobbyGame.playerCount + 1;
                                    }
                                    gamePlayer.rating = ((PacketBuffer) ((Object) packet)).readUnsignedShort(65280);
                                    gamePackedMembershipCount = ((PacketBuffer) ((Object) packet)).readVarInt((byte) 127);
                                    stackIn_111_0 = gamePlayer;
                                    stackIn_112_1 = (0 != (gamePackedMembershipCount & 1));
                                    stackIn_111_0.member = stackIn_112_1;
                                    gamePlayer.ratedGameCount = gamePackedMembershipCount >> 1;
                                    gamePlayer.badgeId = ((PacketBuffer) ((Object) packet)).readUnsignedByte(obfuscationGuard ^ 222);
                                    gamePlayer.optionEligibilityMask = ((PacketBuffer) ((Object) packet)).readUnsignedByte(obfuscationGuard + 222);
                                    SocialListEntry.gamePlayers.addLast(gamePlayer, (byte) 3);
                                    break regionExit1;
                                  case 19:
                                    playerId = ((PacketBuffer) ((Object) packet)).readLong(-32768);
                                    playerStatus = ((PacketBuffer) ((Object) packet)).readUnsignedByte(255);
                                    removedGamePlayer = EmailAvailabilityRequest.findGamePlayer(playerId, 2);
                                    removedGamePlayerAlias = removedGamePlayer;
                                    if (removedGamePlayer == null) {
                                      break regionExit1;
                                    }
                                    if (0 == playerStatus) {
                                      removedGamePlayerAlias.unlink((byte) 111);
                                    } else {
                                      removedGamePlayer.statusChangeTick = AlternateNumericLoginCredentials.field_o;
                                      removedGamePlayer.removalStatus = playerStatus;
                                    }
                                    removedGamePlayerAlias.unlinkSecondary(obfuscationGuard - 30);
                                    o.currentLobbyGame.playerCount = o.currentLobbyGame.playerCount - 1;
                                    break regionExit1;
                                  case 20:
                                    EmailLoginCredentials.decodeLobbyGame(o.currentLobbyGame, packet, 0, false);
                                    break regionExit1;
                                  case 21:
                                    var3_int = ((PacketBuffer) ((Object) packet)).readUnsignedShort(65280);
                                    if (var3_int != 0) {
                                      ic.optionChangeDeadlineMillis = (long)var3_int + MonotonicTime.nowMillis(false);
                                      break regionExit1;
                                    }
                                    ic.optionChangeDeadlineMillis = 0L;
                                    break regionExit1;
                                  case 22:
                                    m.field_h = ((PacketBuffer) ((Object) packet)).readUnsignedShort(65280);
                                    ArchiveIndex.field_s = ((PacketBuffer) ((Object) packet)).readVarInt((byte) 119);
                                    break regionExit1;
                                  case 23:
                                    Widget.field_p = ((PacketBuffer) ((Object) packet)).readLong(-32768);
                                    break regionExit1;
                                  default:
                                    AlignedIconLabel.a("L1: " + WhirlpoolHasher.c((byte) -121), (Throwable) null, 108);
                                    hn.a((byte) 84);
                                    break regionExit1;
                                }
                              }
                              playerId = ((PacketBuffer) ((Object) packet)).readLong(-32768);
                              playerStatus = ((PacketBuffer) ((Object) packet)).readUnsignedByte(obfuscationGuard ^ 222);
                              requestPlayer = MatchCompleteScreen.findLobbyPlayer((byte) 96, playerId);
                              requestPlayerAlias = requestPlayer;
                              if ((requestPlayer != null)) {
                                if (15 != responseKind) {
                                  if (requestPlayerAlias.joinRequestPending) {
                                    requestPlayerAlias.joinRequestPending = false;
                                    uf.pendingJoinRequestCount = uf.pendingJoinRequestCount - 1;
                                  }
                                } else {
                                  requestPlayer.invitationPending = false;
                                }
                                if (playerStatus != 0) {
                                  requestPlayerAlias.statusChangeTick = AlternateNumericLoginCredentials.field_o;
                                  requestPlayerAlias.removalStatus = playerStatus;
                                }
                                ValidationIconWidget.insertSortedLobbyPlayer(requestPlayerAlias, 17574);
                              }
                            } else {
                              playerId = ((PacketBuffer) ((Object) packet)).readLong(obfuscationGuard ^ -32735);
                              pendingPlayer = MatchCompleteScreen.findLobbyPlayer((byte) 96, playerId);
                              if ((pendingPlayer != null)) {
                                if (responseKind != 14) {
                                  if (!pendingPlayer.joinRequestPending) {
                                    uf.pendingJoinRequestCount = uf.pendingJoinRequestCount + 1;
                                    pendingPlayer.joinRequestPending = true;
                                  }
                                } else {
                                  pendingPlayer.invitationPending = true;
                                }
                                ValidationIconWidget.insertSortedLobbyPlayer(pendingPlayer, 17574);
                              }
                            }
                          }
                        } else {
                          var3_int = ((PacketBuffer) ((Object) packet)).readUnsignedShort(65280);
                          invitedGameLookup = (LobbyGame) (LevelResultSubmission.lobbyGameIndex.get((long)var3_int, -1));
                          invitedGame = invitedGameLookup;
                          if ((invitedGame != null)) {
                            if (responseKind != 11) {
                              invitedGame.joinRequestPending = true;
                            } else {
                              invitedGame.invitationPending = true;
                            }
                            ic.insertSortedLobbyGame(true, invitedGame);
                          }
                        }
                      }
                    }
                  }
                }
              }
              break regionExit1;
            }
            resetPlayer = (LobbyPlayer) (SocialListEntry.gamePlayers.first(-8));
            while (resetPlayer != null) {
              resetPlayer.unlink((byte) 111);
              resetPlayer.unlinkSecondary(obfuscationGuard - 30);
              resetPlayer = (LobbyPlayer) (SocialListEntry.gamePlayers.next((byte) 116));
            }
            resetPlayer = (LobbyPlayer) (WhirlpoolHasher.lobbyPlayerIndex.first((byte) 89));
            while (resetPlayer != null) {
              if (resetPlayer.invitationPending ||
                resetPlayer.joinRequestPending) {
                resetPlayer.invitationPending = false;
                if (resetPlayer.joinRequestPending) {
                  uf.pendingJoinRequestCount = uf.pendingJoinRequestCount - 1;
                  resetPlayer.joinRequestPending = false;
                }
                ValidationIconWidget.insertSortedLobbyPlayer(resetPlayer, 17574);
              }
              resetPlayer = (LobbyPlayer) (WhirlpoolHasher.lobbyPlayerIndex.next(false));
            }
            if (responseKind == 1 &&
              o.currentLobbyGame != null) {
              TableNameEntry.field_g = o.currentLobbyGame.displayName;
            }
            if (4 == responseKind) {
              var3_int = ((PacketBuffer) ((Object) packet)).readUnsignedShort(65280);
              o.currentLobbyGame = new LobbyGame(RankingsRequest.gameSettingCount);
              o.currentLobbyGame.setSecondaryKey((long)var3_int, -105);
              EmailLoginCredentials.decodeLobbyGame(o.currentLobbyGame, packet, 0, false);
              ic.optionChangeDeadlineMillis = 0L;
            } else {
              o.currentLobbyGame = null;
            }
            if (responseKind != 2 &&
              3 != responseKind) {
              nl.pendingLobbyGame = null;
            } else {
              if (null == nl.pendingLobbyGame) {
                nl.pendingLobbyGame = new LobbyGame(RankingsRequest.gameSettingCount);
              }
            }
            if (responseKind != 3) {
              fh.pendingGameOptionsReceived = false;
            } else {
              fh.pendingGameOptionsReceived = true;
              for (var3_int = 0; var3_int < rh.matchmakingChoiceMask.length; var3_int++) {
                rh.matchmakingChoiceMask[var3_int] = ((PacketBuffer) ((Object) packet)).readByte(true);
              }
              LinkWidgetRenderer.matchmakingOptionByteOne = ((PacketBuffer) ((Object) packet)).readUnsignedByte(255);
              ResourceArchive.matchmakingOptionByteTwo = ((PacketBuffer) ((Object) packet)).readUnsignedByte(obfuscationGuard + 222);
              for (var3_int = 0; var3_int < PowerUpWarning.matchmakingSettingMask.length; var3_int++) {
                PowerUpWarning.matchmakingSettingMask[var3_int] = ((PacketBuffer) ((Object) packet)).readByte(true);
              }
            }
          }
          if (obfuscationGuard != 33) {
            sj.a((java.applet.Applet) null, (byte) -55, (String) null, (String) null, -27L);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "sj.A(" + obfuscationGuard + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 != 11) {
          field_d = (UiComponent) null;
        }
        field_g = null;
        loadingProgressDialog = null;
        field_e = null;
    }

    static {
        field_g = "Remove <%0> from friend list";
        field_e = "Confuse: reverse the paddle's controls.";
    }
}
