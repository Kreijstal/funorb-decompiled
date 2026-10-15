/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FriendListUi {
    static String field_a;
    static RgbSprite desertNearSprite;
    static ResourceArchive field_c;

    final static SocialListEntry updateFriendsList(boolean allowActiveRelayout, int wheelTurns, int obfuscationGuard) {
        ScrollPane scrollPaneForLayout;
        int rowGapForLayout;
        int wheelPixels;
        int lineStep;
        int layoutGuard;
        boolean activeRelayout;
        boolean keepChildLayout = false;
        SocialListEntry entryForInitialization = null;
        UiComponent nameLabelForText = null;
        String displayedName = null;
        UiComponent serverLabelForText = null;
        String displayedLocation = null;
        int truncatedValue = 0;
        Object returnedEntry = null;
        RuntimeException caughtFailure = null;
        SocialListEntry iteratedEntry;
        int layoutRetained = 0;
        RuntimeException updateFailure = null;
        NodeDeque entries = null;
        Object pressedEntry = null;
        Object previousEntry = null;
        SocialListEntry entry = null;
        int createdLabels = 0;
        int rowY = 0;
        int textColor = 0;
        int activeTextColor = 0;
        int hasPreviousName = 0;
        int nameX = 0;
        int nameWidth = 0;
        int isTruncated = 0;
        String pressedName = null;
        ContextActionController contextForMessage = null;
        String messageCaption = null;
        int clientBranchFlag = 0;
        ContextActionController contextForSpectate;
        String spectateCaption;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          scrollPaneForLayout = GameScreen.friendsListPane.scrollPane;
          rowGapForLayout = 2;
          wheelPixels = wheelTurns * (6 + 3 * np.uiRowHeight);
          lineStep = np.uiRowHeight + 2;
          layoutGuard = 22676;
          activeRelayout = allowActiveRelayout;
          keepChildLayout = (GameScreen.friendsListPane.scrollPane == o.field_b);
          layoutRetained = ((ScrollPane) (Object) scrollPaneForLayout).updateContentLayout(rowGapForLayout, wheelPixels, lineStep, layoutGuard, activeRelayout, keepChildLayout) ? 1 : 0;
          if (obfuscationGuard > -12) {
            FriendListUi.a((byte) 96);
          }
          boolean processFooterActions = true;
          entries = GameScreen.friendsListPane.content.children;
          pressedEntry = null;
          if (LevelMetadata.field_m == 2) {
            QuickChatPhraseRegistry.friendsPanel.enabled = true;
            ChatLobbyUiHelpers.friendsStatusLabel.text = rd.a(LevelDecoder.field_c, new String[]{AlignedIconLabel.currentSocialServer}, (byte) 103);
            GameScreen.friendsListPane.scrollPane.viewport.text = null;
            previousEntry = null;
            entry = (SocialListEntry) (entries.first(-76));
            while (entry != null) {
              createdLabels = 0;
              iteratedEntry = entry;
              returnedEntry = iteratedEntry;
              entryForInitialization = iteratedEntry;
              if (clientBranchFlag != 0) {
                processFooterActions = false;
                break;
              }
              if (entryForInitialization.children == null) {
                entry.nameLabel = new UiComponent(0L, TextFieldWidget.field_K);
                entry.addChild(entry.nameLabel, 0);
                entry.serverLabel = new UiComponent(0L, OptionsScreen.field_v);
                entry.addChild(entry.serverLabel, 0);
                entry.renameIndicator = new UiComponent(0L, TextFieldWidget.field_K);
                entry.addChild(entry.renameIndicator, 0);
                entry.serverLabel.horizontalAlignment = 2;
                createdLabels = 1;
                entry.markDescendantsToInheritVisualState(true);
              }
              entry.width = GameScreen.friendsListPane.content.width;
              rowY = 0;
              if (entry.serverName == null) {
                textColor = 13369344;
                activeTextColor = 16737894;
              } else if (entry.serverName != AlignedIconLabel.currentSocialServer) {
                textColor = 13421568;
                activeTextColor = 16777062;
              } else {
                activeTextColor = 6750054;
                textColor = 52224;
              }
              hasPreviousName = 0;
              if (null != entry.previousName &&
                !entry.previousName.equals("")) {
                entry.renameIndicator.sprite = ok.displayNameChangedSprite;
                entry.renameIndicator.activeTextColor = activeTextColor;
                entry.renameIndicator.setBounds(np.uiRowHeight, rowY, 0, 3 + ok.displayNameChangedSprite.canvasWidth, (byte) 64);
                hasPreviousName = 1;
              }
              entry.serverLabel.capturedTextColor = activeTextColor;
              entry.nameLabel.capturedTextColor = activeTextColor;
              entry.serverLabel.selectedTextColor = activeTextColor;
              entry.nameLabel.selectedTextColor = activeTextColor;
              entry.serverLabel.activeTextColor = activeTextColor;
              entry.nameLabel.activeTextColor = activeTextColor;
              entry.serverLabel.textColor = textColor;
              entry.nameLabel.textColor = textColor;
              nameX = 0;
              nameWidth = -80 + (entry.width - 2);
              if (hasPreviousName != 0) {
                nameX = 3 + ok.displayNameChangedSprite.canvasWidth;
                nameWidth = nameWidth - nameX;
              }
              nameLabelForText = entry.nameLabel;
              if (nameWidth > 0) {
                displayedName = TextFont.truncateText(entry.nameLabel.font, entry.name, nameWidth);
              } else {
                displayedName = entry.name;
              }
              nameLabelForText.text = displayedName;
              entry.nameLabel.setBounds(np.uiRowHeight, rowY, nameX, nameWidth, (byte) 64);
              serverLabelForText = entry.serverLabel;
              if (entry.serverName != null) {
                displayedLocation = entry.serverName;
              } else {
                displayedLocation = DialogMessagePanel.field_S;
              }
              serverLabelForText.text = displayedLocation;
              entry.serverLabel.setBounds(np.uiRowHeight, rowY, -80 + entry.width, 80, (byte) 64);
              truncatedValue = (entry.nameLabel.text.equals(entry.name)) ? 0 : 1;
              isTruncated = truncatedValue;
              rowY = rowY + np.uiRowHeight;
              if (layoutRetained == 0) {
                entry.remainingHeight = rowY - entry.height;
              }
              if (createdLabels != 0) {
                GameScreen.friendsListPane.content.placeBelow((UiComponent) (previousEntry), 2, entry, 17290);
              }
              previousEntry = entry;
              if (null != entry.renameIndicator &&
                entry.renameIndicator.activeInside) {
                WidgetTextLayout.field_e = entry.previousName;
              } else if (0 == entry.pressedButton) {
                if (entry.nameLabel.activeInside &&
                  isTruncated != 0) {
                  WidgetTextLayout.field_e = entry.name;
                }
              } else {
                pressedName = entry.name;
                SpriteGeometry.a(-1, entry, GameScreen.friendsListPane.scrollPane, (int[]) null, pressedName, -1, (byte) -58, 0L, (String) null);
                if (null != entry.serverName &&
                  !ConditionalTextValue.a(13134, GameRenderAudioHelpers.contextActions.targetName) &&
                  !TextWidgetRenderer.field_e) {
                  if (!PlayerNameChooserPanel.field_I) {
                    contextForMessage = GameRenderAudioHelpers.contextActions;
                    messageCaption = rd.a(ClientException.field_c, new String[]{pressedName}, (byte) 103);
                    contextForMessage.contextMenu.addAction(messageCaption, 8, (byte) 84);
                  }
                  contextForSpectate = GameRenderAudioHelpers.contextActions;
                  spectateCaption = rd.a(qm.field_b, new String[]{pressedName}, (byte) 103);
                  contextForSpectate.contextMenu.addAction(spectateCaption, 18, (byte) 97);
                }
                pressedEntry = entry;
              }
              entry = (SocialListEntry) (entries.next((byte) 116));
            }
            if (processFooterActions) {
              if (GameScreen.friendsListPane.leftFooter.pressedButton != 0) {
                MusicCrossfadeStream.nameEntryPopup = new NameEntryPopup(GameScreen.friendsListPane.leftFooter.screenX, GameScreen.friendsListPane.leftFooter.screenY, GameScreen.friendsListPane.leftFooter.width, GameScreen.friendsListPane.leftFooter.height, ArchiveNetworkClient.field_t, GameUiController.field_c, CappedUrlRequest.field_l, CappedUrlRequest.field_l);
                GameUiController.field_d = 0;
              }
              if (0 != GameScreen.friendsListPane.rightFooter.pressedButton) {
                MusicCrossfadeStream.nameEntryPopup = new NameEntryPopup(GameScreen.friendsListPane.rightFooter.screenX, GameScreen.friendsListPane.rightFooter.screenY, GameScreen.friendsListPane.rightFooter.width, GameScreen.friendsListPane.rightFooter.height, TableDataRequest.field_j, GameUiController.field_c, CappedUrlRequest.field_l, CappedUrlRequest.field_l);
                GameUiController.field_d = 1;
              }
            }
          } else {
            ChatLobbyUiHelpers.friendsStatusLabel.text = kd.field_a;
            QuickChatPhraseRegistry.friendsPanel.enabled = false;
            if (LevelMetadata.field_m == 1) {
              GameScreen.friendsListPane.scrollPane.viewport.text = LoginCredentialKind.field_f;
              if (clientBranchFlag != 0) {
                GameScreen.friendsListPane.scrollPane.viewport.text = AlternateNumericLoginCredentials.field_t;
              }
            } else {
              GameScreen.friendsListPane.scrollPane.viewport.text = AlternateNumericLoginCredentials.field_t;
            }
            jh.a(true, GameScreen.friendsListPane.content);
          }
          if (processFooterActions) {
            returnedEntry = pressedEntry;
          }
          return (SocialListEntry) (returnedEntry);
        } catch (java.lang.RuntimeException caughtUpdateFailure) {
          caughtFailure = caughtUpdateFailure;
          updateFailure = caughtFailure;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) updateFailure), "wn.C(" + allowActiveRelayout + ',' + wheelTurns + ',' + obfuscationGuard + ')');
        }
    }

    final static void snapshotKeyboardInput(byte obfuscationGuard) {
        int keyIndex = 0;
        int clientBranchFlag = 0;
        int stackIn_27_0 = 0;
        Throwable decompiledCaughtException = null;
        Object keyboardMonitor = null;
        RuntimeException var1_ref = null;
        int keyChange;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          keyboardMonitor = DualLinkDeque.keyboardInput;
          synchronized (keyboardMonitor) {
            if (obfuscationGuard != -97) {
              FriendListUi.a(-86, (byte) 78);
            }
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder0 = true;
            IntrusiveHashTable.keyEventReadIndex = fm.keyEventFrameEnd;
            PowerUp.keyboardIdleTicks = PowerUp.keyboardIdleTicks + 1;
            if (pl.keyChangeWriteIndex < 0) {
              keyIndex = 0;
              while (true) {
                if (112 > keyIndex) {
                  IntArrayRequest.heldKeys[keyIndex] = false;
                  keyIndex++;
                  if (clientBranchFlag == 0) {
                    continue;
                  }
                } else {
                  pl.keyChangeWriteIndex = FullscreenFailureDialog.keyChangeReadIndex;
                }
                break;
              }
              decompiledFrameRemainder0 = (clientBranchFlag != 0);
            }
            if (decompiledFrameRemainder0) {
              while (true) {
                if (~pl.keyChangeWriteIndex == ~FullscreenFailureDialog.keyChangeReadIndex) {
                  break;
                }
                keyChange = LegacyEmailValidationError.keyChangeQueue[FullscreenFailureDialog.keyChangeReadIndex];
                FullscreenFailureDialog.keyChangeReadIndex = FullscreenFailureDialog.keyChangeReadIndex + 1 & 127;
                stackIn_27_0 = keyChange;
                if (clientBranchFlag != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_27_0 < 0) {
                  IntArrayRequest.heldKeys[~keyChange] = false;
                } else {
                  IntArrayRequest.heldKeys[keyChange] = true;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_27_0 = ResourceRequest.keyEventWriteIndex;
            }
            fm.keyEventFrameEnd = stackIn_27_0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1_ref), "wn.E(" + obfuscationGuard + ')');
        }
    }

    final static void a(ResourceArchive param0, ResourceArchive param1, int param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          ContentTransitionLayer.field_jb = param1;
          if (param2 != 0) {
            FriendListUi.applyChatFilters(79, -114);
          }
          BufferedFile.field_d = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("wn.G(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        try {
          desertNearSprite = null;
          int var1_int = 98 / ((param0 - 73) / 36);
          field_c = null;
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "wn.F(" + param0 + ')');
        }
    }

    final static BinaryMaskFont loadBinaryMaskFont(int groupId, ResourceArchive metricsArchive, ResourceArchive spriteArchive, int fileId, byte obfuscationGuard) {
        int unusedGuardQuotient = 0;
        RuntimeException failure = null;
        Object unavailableFont = null;
        BinaryMaskFont font = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String metricsArchiveSummary = null;
        StringBuilder spriteContextBuilder = null;
        String spriteArchiveSummary = null;
        RuntimeException caughtFailure = null;
        try {
          if (!ln.decodeSpritesFromArchive(-123, fileId, spriteArchive, groupId)) {
            unavailableFont = null;
            return (BinaryMaskFont) (unavailableFont);
          }
          unusedGuardQuotient = 126 / ((obfuscationGuard + 35) / 45);
          font = rm.createBinaryMaskFont(12658477, metricsArchive.takeFile(fileId, groupId, 4));
          return font;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("wn.D(").append(groupId).append(',');
          if (metricsArchive == null) {
            metricsArchiveSummary = "null";
          } else {
            metricsArchiveSummary = "{...}";
          }
          spriteContextBuilder = ((StringBuilder) (Object) contextBuilder).append(metricsArchiveSummary).append(',');
          if (spriteArchive == null) {
            spriteArchiveSummary = "null";
          } else {
            spriteArchiveSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) spriteContextBuilder).append(spriteArchiveSummary).append(',').append(fileId).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static boolean a(int param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -6) {
            stackIn_7_0 = ((-param0 & param0) == param0);
            return stackIn_7_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "wn.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void applyChatFilters(int maximumGameFilter, int packedFilters) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          InstructionsScreen.lobbyChatFilter = packedFilters >> 4 & 3;
          InstructionsScreen.gameChatFilter = (packedFilters & 12) >> 2;
          if (InstructionsScreen.lobbyChatFilter > 2) {
            InstructionsScreen.lobbyChatFilter = 2;
          }
          if (InstructionsScreen.gameChatFilter > maximumGameFilter) {
            InstructionsScreen.gameChatFilter = 2;
          }
          WeightedLruCache.privateChatFilter = 3 & packedFilters;
          if (WeightedLruCache.privateChatFilter > 2) {
            WeightedLruCache.privateChatFilter = 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "wn.H(" + maximumGameFilter + ',' + packedFilters + ')');
        }
    }

    final static int a(byte param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -98) {
            desertNearSprite = (RgbSprite) null;
          }
          stackIn_4_0 = (int)(1000000000L / ResourceRequest.tickDurationNanos);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "wn.A(" + param0 + ')');
        }
    }

    static {
    }
}
