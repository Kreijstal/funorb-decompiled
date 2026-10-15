/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConnectionPhase {
    static boolean field_e;
    static RgbSprite waterFarSprite;
    static boolean field_d;
    static String field_b;
    static String nameColumnHeadingText;

    final static void appendChatHistory(int firstOutputIndex, ChatMessage message) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            BubbleDistortion.chatHistoryCategoryCounts[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; ScrollPane.chatHistorySize > var2_intLifetime1; var2_intLifetime1++) {
            if (message.channel == UnderwaterBackground.chatHistory[var2_intLifetime1].channel) {
              dupTemp$3 = UnderwaterBackground.chatHistory[var2_intLifetime1].getRetentionCategory(true);
              BubbleDistortion.chatHistoryCategoryCounts[dupTemp$3] = BubbleDistortion.chatHistoryCategoryCounts[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = message.getRetentionCategory(true);
          BubbleDistortion.chatHistoryCategoryCounts[dupTemp$0] = BubbleDistortion.chatHistoryCategoryCounts[dupTemp$0] + 1;
          var2_intLifetime2 = firstOutputIndex;
          for (var3 = 0; ScrollPane.chatHistorySize > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (message.channel == UnderwaterBackground.chatHistory[var3].channel) {
              var4 = UnderwaterBackground.chatHistory[var3].getRetentionCategory(true);
              if (WidgetTheme.chatHistoryCategoryLimit < BubbleDistortion.chatHistoryCategoryCounts[var4]) {
                BubbleDistortion.chatHistoryCategoryCounts[var4] = BubbleDistortion.chatHistoryCategoryCounts[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              UnderwaterBackground.chatHistory[incrementValue$2] = UnderwaterBackground.chatHistory[var3];
            }
          }
          ScrollPane.chatHistorySize = var2_intLifetime2;
          fieldTemp$1 = ScrollPane.chatHistorySize;
          ScrollPane.chatHistorySize = ScrollPane.chatHistorySize + 1;
          UnderwaterBackground.chatHistory[fieldTemp$1] = message;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("n.C(").append(firstOutputIndex).append(',');
          if (message == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        try {
          if (ResourceArchiveFactory.field_a != null) {
            try {
              ResourceArchiveFactory.field_a.seek(0, 0L);
              ResourceArchiveFactory.field_a.write(LogoRenderHelpers.incomingPackets.data, LogoRenderHelpers.incomingPackets.position, 24, -1);
            } catch (Exception exception) {
            }
          }
          if (param0 != -1) {
            nameColumnHeadingText = (String) null;
          }
          LogoRenderHelpers.incomingPackets.position = LogoRenderHelpers.incomingPackets.position + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static RgbSprite buildRgbSprite(byte obfuscationGuard) {
        int var4_int = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        int var1 = UiGeometryHelpers.decodedSpriteWidths[0] * TextHotspotRegion.decodedSpriteHeights[0];
        if (obfuscationGuard != 21) {
          ConnectionPhase.b(-24);
        }
        byte[] var2 = GameOverlayHelpers.decodedSpriteIndices[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
          var3[var4_int] = PlayerBadgeHelpers.decodedSpritePalette[IntrusiveHashIterator.a(255, (int) var2[var4_int])];
        }
        RgbSprite var4 = new RgbSprite(PauseMenuHelpers.decodedCanvasWidth, FullscreenFailureDialog.decodedCanvasHeight, ArrayWidgetGroup.decodedSpriteOffsetX[0], SocketConnector.decodedSpriteOffsetY[0], UiGeometryHelpers.decodedSpriteWidths[0], TextHotspotRegion.decodedSpriteHeights[0], var3);
        MotionWaypoint.clearDecodedSpriteData((byte) 96);
        return var4;
    }

    final boolean allowsGameTransport(int obfuscationGuard) {
        boolean phaseAllowsTransport = false;
        if (obfuscationGuard != -26774) {
          return true;
        }
        phaseAllowsTransport = (this == rq.awaitingLoginReply) || (this == IsaacGenerator.awaitingLoginSuccessBody) || (this == MenuButton.loggedInConnection);
        return phaseAllowsTransport;
    }

    public static void b(int param0) {
        nameColumnHeadingText = null;
        waterFarSprite = null;
        if (param0 != -2) {
          return;
        }
        field_b = null;
    }

    final static void updateOpponentSearchControls(int gameActionOpcode, boolean inputEnabled, boolean suppressInput, byte obfuscationGuard) {
        int choiceSelectedValue = 0;
        UiComponent searchButtonForText = null;
        String searchButtonCaption = null;
        UiComponent messagePanelForText = null;
        String messagePanelCaption = null;
        String searchStatusCaption = null;
        UiComponent lobbyRoot = null;
        boolean lobbyInputEnabled = false;
        UiComponent gameRoot = null;
        boolean gameInputEnabled = false;
        UiComponent requestsRoot = null;
        boolean requestsInputEnabled = false;
        RuntimeException caughtFailure = null;
        RuntimeException updateFailure = null;
        UiComponent searchButtonForCollapse = null;
        UiComponent statusLabelForCollapse = null;
        int buttonSplitX = 0;
        int alternateSearchCaption = 0;
        int selectedChoiceCount = 0;
        Object statusOrRestrictionDetails = null;
        int choiceIndexOrCaptionWidth = 0;
        int choiceSelected = 0;
        Object restrictionDetailsAlias = null;
        String highlightedSettingName = null;
        int clientBranchFlag = 0;
        int settingIndex = 0;
        UiComponent requestsButtonForCollapse = null;
        String searchStatusText = null;
        UiComponent requestsButtonAlias = null;
        Object restrictionDetailsCopy;
        int firstSettingIndex;
        int settingCursorOrCaptionWidth;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard != -76) {
            return;
          }
          ArchiveSourceManager.layoutLobbyTransition(IntArrayRequest.field_j, false);
          if (IncomingPacketHelpers.pendingLobbyGame != null) {
            requestsButtonForCollapse = RadialSelectorRenderer.field_h;
            requestsButtonAlias = requestsButtonForCollapse;
            RadialSelectorRenderer.field_h.height = 0;
            requestsButtonAlias.width = 0;
            searchButtonForCollapse = DraggableWidget.field_K;
            DraggableWidget.field_K.height = 0;
            searchButtonForCollapse.width = 0;
            statusLabelForCollapse = AppletGameShell.field_e;
            AppletGameShell.field_e.height = 0;
            statusLabelForCollapse.width = 0;
            UiComponentNode.field_v.text = DelayedPacket.field_n.toUpperCase();
            buttonSplitX = (MultiplayerMatch.field_d.width + 2) / 2;
            AppletGameShell.field_e.setBounds(40, -40 + MultiplayerMatch.field_d.height, 0, buttonSplitX - 2, (byte) 64);
            DraggableWidget.field_K.setBounds(40, MultiplayerMatch.field_d.height - 40, buttonSplitX, MultiplayerMatch.field_d.width - buttonSplitX, (byte) 64);
            if (1 == ScreenshotViewer.field_n.length &&
              ScreenshotViewer.field_n[0] == 2) {
              alternateSearchCaption = 0;
            } else {
              alternateSearchCaption = 0;
              selectedChoiceCount = 0;
              choiceIndexOrCaptionWidth = 0;
              while (true) {
                if (choiceIndexOrCaptionWidth < ScreenshotViewer.field_n.length) {
                  choiceSelectedValue = ((CalendarMatchmakingState.matchmakingChoiceMask[choiceIndexOrCaptionWidth / 8] & 1 << (7 & choiceIndexOrCaptionWidth)) == 0) ? 0 : 1;
                  choiceSelected = choiceSelectedValue;
                  if (choiceSelected != 0) {
                    selectedChoiceCount++;
                  }
                  if (choiceSelected != 0 &&
                    ScreenshotViewer.field_n[choiceIndexOrCaptionWidth] != 2) {
                    alternateSearchCaption = 1;
                  } else {
                    choiceIndexOrCaptionWidth++;
                    continue;
                  }
                }
                if (selectedChoiceCount != 0) {
                  break;
                }
                alternateSearchCaption = 1;
                break;
              }
            }
            DraggableWidget.field_K.enabled = true;
            if (fh.pendingGameOptionsReceived) {
              GameUiController.field_e.enabled = false;
              CanvasInputCleanup.field_f.text = TextChoiceDialogStyles.field_a;
              if (alternateSearchCaption != 0) {
                searchStatusCaption = FireworkBurst.matchmakingStatusText;
              } else {
                searchStatusCaption = MatchingTextValidator.field_l;
              }
              searchStatusText = searchStatusCaption;
              statusOrRestrictionDetails = searchStatusText;
              statusOrRestrictionDetails = searchStatusText;
              statusOrRestrictionDetails = searchStatusText;
              settingCursorOrCaptionWidth = AppletGameShell.field_e.font.measureText(searchStatusText) + AppletGameShell.field_e.font.getAdvance('.') * 3;
              AppletGameShell.field_e.horizontalAlignment = 0;
              if (16 == (BirthDateValidator.field_h & 48)) {
                statusOrRestrictionDetails = searchStatusText + ".";
              }
              AppletGameShell.field_e.textInset = (-settingCursorOrCaptionWidth + AppletGameShell.field_e.width) / 2;
              if ((48 & BirthDateValidator.field_h) == 32) {
                statusOrRestrictionDetails = (String) (statusOrRestrictionDetails) + "..";
              }
              if ((BirthDateValidator.field_h & 48) == 48) {
                statusOrRestrictionDetails = (String) (statusOrRestrictionDetails) + "...";
              }
              AppletGameShell.field_e.text = (String) (statusOrRestrictionDetails);
              DraggableWidget.field_K.text = ValidationIconWidget.field_L.toUpperCase();
            } else {
              searchButtonForText = DraggableWidget.field_K;
              if (alternateSearchCaption == 0) {
                searchButtonCaption = NewAchievementsScreen.field_F;
              } else {
                searchButtonCaption = ArrayWidgetGroup.field_J;
              }
              searchButtonForText.text = ((String) (Object) searchButtonCaption).toUpperCase();
              messagePanelForText = CanvasInputCleanup.field_f;
              if (alternateSearchCaption == 0) {
                messagePanelCaption = ResourceArchiveFactory.field_f;
              } else {
                messagePanelCaption = LabeledWidget.field_G;
              }
              messagePanelForText.text = GamePresentationHelpers.formatIndexedText(messagePanelCaption, new String[]{DraggableWidget.field_K.text}, (byte) 103);
              MeshAttributeRecord.field_g = true;
              AppletGameShell.field_e.text = SocialListEntry.field_Pb;
              GameUiController.field_e.enabled = true;
              if (ContextMenu.field_bc != null) {
                if (null == PlayerNameChooserPanel.field_J) {
                  PlayerNameChooserPanel.field_J = new byte[RankingsRequest.gameSettingCount];
                  SingleChildWidget.field_D = new boolean[RankingsRequest.gameSettingCount];
                }
                MusicVoiceMixer.field_s = false;
                MeshAttributeRecord.field_g = false;
                settingIndex = 0;
                firstSettingIndex = settingIndex;
                while (RankingsRequest.gameSettingCount > settingIndex) {
                  SingleChildWidget.field_D[settingIndex] = false;
                  settingIndex++;
                }
                ar.a(true, IncomingPacketHelpers.pendingLobbyGame, -1, -1, -1, 0, RankingsRequest.gameSettingCount, 0);
                if (!(QuickChatHelpDialog.loginPrivilegeByteOne < 2) &&
                  IntArrayRequest.heldKeys[12]) {
                  MeshAttributeRecord.field_g = true;
                }
              }
              if (!MeshAttributeRecord.field_g) {
                DraggableWidget.field_K.enabled = false;
                if (DraggableWidget.field_K.hovered) {
                  statusOrRestrictionDetails = null;
                  if (MusicVoiceMixer.field_s) {
                    statusOrRestrictionDetails = "<col=A00000>" + QuickChatMenu.field_ac + "</col>";
                    restrictionDetailsAlias = statusOrRestrictionDetails;
                    statusOrRestrictionDetails = restrictionDetailsAlias;
                    restrictionDetailsCopy = statusOrRestrictionDetails;
                    statusOrRestrictionDetails = restrictionDetailsCopy;
                  }
                  for (settingCursorOrCaptionWidth = 0; settingCursorOrCaptionWidth < RankingsRequest.gameSettingCount; settingCursorOrCaptionWidth++) {
                    if (SingleChildWidget.field_D[settingCursorOrCaptionWidth]) {
                      highlightedSettingName = "<col=A00000>" + QuickChatPhraseRegistry.field_b[settingCursorOrCaptionWidth] + "</col>";
                      statusOrRestrictionDetails = highlightedSettingName;
                      statusOrRestrictionDetails = highlightedSettingName;
                      if (statusOrRestrictionDetails == null) {
                        statusOrRestrictionDetails = highlightedSettingName;
                      } else {
                        statusOrRestrictionDetails = (String) (statusOrRestrictionDetails) + ", " + highlightedSettingName;
                      }
                    }
                  }
                  WidgetTextLayout.field_e = "<col=A00000>" + RadialSelectorRenderer.field_a + "<br>" + AchievementsScreen.field_G + (String) (statusOrRestrictionDetails);
                }
              }
            }
          }
          lobbyRoot = NinjaBackground.field_w;
          lobbyInputEnabled = (inputEnabled) && (!suppressInput) && (!MeshLobbyUiHelpers.joinRequestsPanelOpen);
          ((UiComponent) (Object) lobbyRoot).updateRoot(lobbyInputEnabled, -15211);
          gameRoot = MultiplayerMatch.field_d;
          gameInputEnabled = (inputEnabled) && (!suppressInput) && (!MeshLobbyUiHelpers.joinRequestsPanelOpen);
          ((UiComponent) (Object) gameRoot).updateRoot(gameInputEnabled, -15211);
          requestsRoot = ProxySocketConnector.field_j;
          requestsInputEnabled = (inputEnabled) && (!suppressInput) && (MeshLobbyUiHelpers.joinRequestsPanelOpen);
          ((UiComponent) (Object) requestsRoot).updateRoot(requestsInputEnabled, -15211);
          BrickGameLayerController.field_c.tabs.processTabPresses(0);
          if (IncomingPacketHelpers.pendingLobbyGame != null) {
            if (GameUiController.field_e.pressedButton != 0) {
              ProxyAuthenticationRequiredException.requestReturnToLobby(-22809, gameActionOpcode);
            }
            if (DraggableWidget.field_K.pressedButton != 0) {
              if (!fh.pendingGameOptionsReceived) {
                UnderwaterBackground.requestFindOpponents(gameActionOpcode, (byte) 98);
              } else {
                TextWidgetRenderer.requestCancelOpponentSearch(obfuscationGuard + 276, gameActionOpcode);
              }
            }
            JungleBackground.a(gameActionOpcode, IncomingPacketHelpers.pendingLobbyGame, true, false);
          }
          return;
        } catch (java.lang.RuntimeException caughtUpdateFailure) {
          caughtFailure = caughtUpdateFailure;
          updateFailure = caughtFailure;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) updateFailure), "n.D(" + gameActionOpcode + ',' + inputEnabled + ',' + suppressInput + ',' + obfuscationGuard + ')');
        }
    }

    static {
        field_b = "You have entered another game.";
        nameColumnHeadingText = "Name";
    }
}
