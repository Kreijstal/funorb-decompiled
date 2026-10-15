/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatLobbyUiHelpers {
    static String field_g;
    static MidiSynthesizer field_f;
    static String field_e;
    static UiComponent chatMessageStyle;
    static String[] field_c;
    static UiComponent friendsStatusLabel;
    static LoadingProgressDialog loadingProgressDialog;

    final static ChatMessage rebuildChatHistoryRows(int rowX, int rowHeight, int obfuscationGuard, int wheelTurns) {
        Object nullFocusMarker = null;
        UiComponent chatFocusMarker = null;
        boolean isPinned = false;
        Object pressedMessage;
        int visibleCount;
        int rebuiltRowsHeight;
        int reverseHistoryIndex;
        int forwardHistoryIndex;
        ChatMessage candidateMessage;
        int visible;
        ChatMessage displayedMessage;
        int filterLevel;
        String prefix;
        String escapedText;
        int messageColor;
        int unusedClientFlag;
        int nextRowY;
        int heightDelta;
        int bottomScrollY;
        unusedClientFlag = BrickABrac.field_J ? 1 : 0;
        pressedMessage = null;
        AchievementIcon.chatHistoryPane.content.children.clear((byte) -61);
        visibleCount = 0;
        rebuiltRowsHeight = 0;
        for (reverseHistoryIndex = -1 + ScrollPane.chatHistorySize; reverseHistoryIndex >= 0; reverseHistoryIndex--) {
          candidateMessage = UnderwaterBackground.chatHistory[reverseHistoryIndex];
          visible = 0;
          if (!TextWidgetRenderer.field_e &&
            visibleCount < WidgetTheme.chatHistoryCategoryLimit) {
            filterLevel = OutgoingPacketHelpers.getChatFilter(candidateMessage.channel, (byte) 18);
            if (filterLevel <= candidateMessage.getRetentionCategory(true) && (candidateMessage.systemMessage ||
              !AchievementBrowserScreen.isIgnoredPlayer(125, candidateMessage.senderName))) {
              visible = 1;
            }
          }
          if (visible == 0) {
            candidateMessage.component = null;
          } else {
            visibleCount++;
            if (candidateMessage.component == null ||
              LevelSequence.chatFiltersChanged) {
              if (null == candidateMessage.component) {
                Brick.unreadChatMessageCount = Brick.unreadChatMessageCount + 1;
              }
              prefix = IntNode.formatChatPrefix(candidateMessage, (byte) 91);
              escapedText = prefix + TextFont.escapeAngles(candidateMessage.text);
              messageColor = IntrusiveHashIterator.getChatMessageColor(-31126, candidateMessage);
              candidateMessage.component = new UiComponent(0L, chatMessageStyle, escapedText);
              candidateMessage.component.capturedTextColor = messageColor + (-((messageColor & 16711422) >> 1) + (chatMessageStyle.capturedTextColor >> 1 & 8355711));
              candidateMessage.component.activeTextColor = (chatMessageStyle.activeTextColor >> 1 & 8355711) - (8355711 & messageColor >> 1) + messageColor;
              candidateMessage.component.textColor = messageColor;
              candidateMessage.component.font = CachedArchiveSource.chatFont;
              rebuiltRowsHeight = rebuiltRowsHeight + rowHeight;
            }
          }
        }
        nextRowY = 0;
        for (forwardHistoryIndex = 0; ScrollPane.chatHistorySize > forwardHistoryIndex; forwardHistoryIndex++) {
          displayedMessage = UnderwaterBackground.chatHistory[forwardHistoryIndex];
          if (null != displayedMessage.component) {
            AchievementIcon.chatHistoryPane.content.addChild(displayedMessage.component, 0);
            displayedMessage.component.setBounds(rowHeight, nextRowY, rowX, displayedMessage.component.getContentWidth(87), (byte) 64);
            if (displayedMessage.component.pressedButton != 0) {
              pressedMessage = displayedMessage;
            }
            nextRowY = nextRowY + rowHeight;
          }
        }
        heightDelta = AchievementIcon.chatHistoryPane.content.remainingHeight + AchievementIcon.chatHistoryPane.content.height - (-rebuiltRowsHeight + nextRowY);
        AchievementIcon.chatHistoryPane.content.height = AchievementIcon.chatHistoryPane.content.height - heightDelta;
        AchievementIcon.chatHistoryPane.content.localY = AchievementIcon.chatHistoryPane.content.localY + heightDelta;
        if (LevelSequence.chatFiltersChanged) {
          AchievementIcon.chatHistoryPane.content.height = nextRowY;
        }
        AchievementIcon.chatHistoryPane.content.remainingHeight = nextRowY - AchievementIcon.chatHistoryPane.content.height;
        if (LevelSequence.chatFiltersChanged) {
          LevelSequence.chatFiltersChanged = false;
          AchievementIcon.chatHistoryPane.content.localY = AchievementIcon.chatHistoryPane.viewport.height - AchievementIcon.chatHistoryPane.content.height;
          nd.chatPinnedToBottom = true;
          AchievementIcon.chatHistoryPane.content.remainingY = 0;
        }
        if (obfuscationGuard != -13294) {
          friendsStatusLabel = (UiComponent) null;
        }
        if (MatchResultScreen.field_s) {
          nullFocusMarker = null;
          chatFocusMarker = SoundCache.field_k;
          if (nullFocusMarker != chatFocusMarker) {
            nd.chatPinnedToBottom = true;
          }
        }
        bottomScrollY = AchievementIcon.chatHistoryPane.viewport.height - (AchievementIcon.chatHistoryPane.content.height + AchievementIcon.chatHistoryPane.content.remainingHeight);
        if (nd.chatPinnedToBottom) {
          AchievementIcon.chatHistoryPane.content.remainingY = bottomScrollY - AchievementIcon.chatHistoryPane.content.localY;
        }
        AchievementIcon.chatHistoryPane.updateScroll(true, rowHeight, true, 2 * (rowHeight * wheelTurns));
        isPinned = (bottomScrollY == AchievementIcon.chatHistoryPane.content.remainingY + AchievementIcon.chatHistoryPane.content.localY);
        nd.chatPinnedToBottom = isPinned;
        return (ChatMessage) (pressedMessage);
    }

    final static void setAppletCookie(java.applet.Applet applet, byte obfuscationGuard, String value, String name, long maxAgeSeconds) {
        try {
          RuntimeException contextFailure = null;
          StringBuilder contextPrefix = null;
          String appletSummary = null;
          StringBuilder valueContextPrefix = null;
          String valueSummary = null;
          StringBuilder nameContextPrefix = null;
          String nameSummary = null;
          Throwable caughtFailure = null;
          Throwable ignoredBrowserFailure = null;
          RuntimeException cookieFailure = null;
          String unusedHostCopy = null;
          String cookieHost = null;
          String cookieAttributes = null;
          String unusedHostAlias;
          String unusedCookieCopy;
          String unusedCookieAlias;
          String cookieWithLifetime;
          try {
            if (obfuscationGuard <= 66) {
              ChatLobbyUiHelpers.rebuildChatHistoryRows(-31, 62, -5, -79);
            }
            try {
              cookieHost = applet.getParameter("cookiehost");
              unusedHostCopy = cookieHost;
              unusedHostAlias = cookieHost;
              cookieAttributes = name + "=" + value + "; version=1; path=/; domain=" + cookieHost;
              unusedCookieCopy = cookieAttributes;
              unusedCookieAlias = cookieAttributes;
              if (0L > maxAgeSeconds) {
                cookieWithLifetime = cookieAttributes + "; Discard;";
              } else {
                cookieWithLifetime = cookieAttributes + "; Expires=" + AppletGameShell.a((byte) -75, MonotonicTime.nowMillis(false) + maxAgeSeconds * 1000L) + "; Max-Age=" + maxAgeSeconds;
              }
              AppletJavaScriptBridge.evaluateScript(applet, "document.cookie=\"" + cookieWithLifetime + "\"", 5797);
            } catch (java.lang.Throwable caughtBrowserFailure) {
              caughtFailure = caughtBrowserFailure;
              ignoredBrowserFailure = caughtFailure;
            }
            return;
          } catch (java.lang.RuntimeException caughtCookieFailure) {
            caughtFailure = caughtCookieFailure;
            cookieFailure = (RuntimeException) (Object) caughtFailure;
            contextFailure = cookieFailure;
            contextPrefix = new StringBuilder().append("sj.C(");
            if (applet == null) {
              appletSummary = "null";
            } else {
              appletSummary = "{...}";
            }
            valueContextPrefix = ((StringBuilder) (Object) contextPrefix).append(appletSummary).append(',').append(obfuscationGuard).append(',');
            if (value == null) {
              valueSummary = "null";
            } else {
              valueSummary = "{...}";
            }
            nameContextPrefix = ((StringBuilder) (Object) valueContextPrefix).append(valueSummary).append(',');
            if (name == null) {
              nameSummary = "null";
            } else {
              nameSummary = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) contextFailure), ((StringBuilder) (Object) nameContextPrefix).append(nameSummary).append(',').append(maxAgeSeconds).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
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
            packet = LogoRenderHelpers.incomingPackets;
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
                    KeyDispatchHelpers.pendingJoinRequestCount = KeyDispatchHelpers.pendingJoinRequestCount - 1;
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
                  KeyDispatchHelpers.pendingJoinRequestCount = 0;
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
                                      ClientResourceHelpers.currentLobbyGame.playerCount = ClientResourceHelpers.currentLobbyGame.playerCount + 1;
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
                                    ClientResourceHelpers.currentLobbyGame.playerCount = ClientResourceHelpers.currentLobbyGame.playerCount - 1;
                                    break regionExit1;
                                  case 20:
                                    EmailLoginCredentials.decodeLobbyGame(ClientResourceHelpers.currentLobbyGame, packet, 0, false);
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
                                    ConditionalTextValue.field_h = ((PacketBuffer) ((Object) packet)).readUnsignedShort(65280);
                                    ArchiveIndex.field_s = ((PacketBuffer) ((Object) packet)).readVarInt((byte) 119);
                                    break regionExit1;
                                  case 23:
                                    Widget.field_p = ((PacketBuffer) ((Object) packet)).readLong(-32768);
                                    break regionExit1;
                                  default:
                                    AlignedIconLabel.a("L1: " + WhirlpoolHasher.c((byte) -121), (Throwable) null, 108);
                                    hn.closeGameTransport((byte) 84);
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
                                    KeyDispatchHelpers.pendingJoinRequestCount = KeyDispatchHelpers.pendingJoinRequestCount - 1;
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
                                    KeyDispatchHelpers.pendingJoinRequestCount = KeyDispatchHelpers.pendingJoinRequestCount + 1;
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
                  KeyDispatchHelpers.pendingJoinRequestCount = KeyDispatchHelpers.pendingJoinRequestCount - 1;
                  resetPlayer.joinRequestPending = false;
                }
                ValidationIconWidget.insertSortedLobbyPlayer(resetPlayer, 17574);
              }
              resetPlayer = (LobbyPlayer) (WhirlpoolHasher.lobbyPlayerIndex.next(false));
            }
            if (responseKind == 1 &&
              ClientResourceHelpers.currentLobbyGame != null) {
              TableNameEntry.field_g = ClientResourceHelpers.currentLobbyGame.displayName;
            }
            if (4 == responseKind) {
              var3_int = ((PacketBuffer) ((Object) packet)).readUnsignedShort(65280);
              ClientResourceHelpers.currentLobbyGame = new LobbyGame(RankingsRequest.gameSettingCount);
              ClientResourceHelpers.currentLobbyGame.setSecondaryKey((long)var3_int, -105);
              EmailLoginCredentials.decodeLobbyGame(ClientResourceHelpers.currentLobbyGame, packet, 0, false);
              ic.optionChangeDeadlineMillis = 0L;
            } else {
              ClientResourceHelpers.currentLobbyGame = null;
            }
            if (responseKind != 2 &&
              3 != responseKind) {
              IncomingPacketHelpers.pendingLobbyGame = null;
            } else {
              if (null == IncomingPacketHelpers.pendingLobbyGame) {
                IncomingPacketHelpers.pendingLobbyGame = new LobbyGame(RankingsRequest.gameSettingCount);
              }
            }
            if (responseKind != 3) {
              fh.pendingGameOptionsReceived = false;
            } else {
              fh.pendingGameOptionsReceived = true;
              for (var3_int = 0; var3_int < CalendarMatchmakingState.matchmakingChoiceMask.length; var3_int++) {
                CalendarMatchmakingState.matchmakingChoiceMask[var3_int] = ((PacketBuffer) ((Object) packet)).readByte(true);
              }
              LinkWidgetRenderer.matchmakingOptionByteOne = ((PacketBuffer) ((Object) packet)).readUnsignedByte(255);
              ResourceArchive.matchmakingOptionByteTwo = ((PacketBuffer) ((Object) packet)).readUnsignedByte(obfuscationGuard + 222);
              for (var3_int = 0; var3_int < PowerUpWarning.matchmakingSettingMask.length; var3_int++) {
                PowerUpWarning.matchmakingSettingMask[var3_int] = ((PacketBuffer) ((Object) packet)).readByte(true);
              }
            }
          }
          if (obfuscationGuard != 33) {
            ChatLobbyUiHelpers.setAppletCookie((java.applet.Applet) null, (byte) -55, (String) null, (String) null, -27L);
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
        chatMessageStyle = null;
        friendsStatusLabel = null;
        field_c = null;
        if (param0 != 11) {
          friendsStatusLabel = (UiComponent) null;
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
