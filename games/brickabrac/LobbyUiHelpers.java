/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyUiHelpers {
    static UiComponent cancelCreateGameButton;
    static String reportSecurityHeading;
    static int receivedChatBadge;
    static QuickChatPhraseRegistry quickChatPhrases;

    final static void paintNineSliceFrame(int width, int height, int obfuscationGuard, int x, RgbSprite[] sprites, int y) {
        int leftWidthValue = 0;
        int rightWidthValue = 0;
        int topHeightValue = 0;
        int bottomHeightValue = 0;
        RuntimeException contextFailure = null;
        StringBuilder contextPrefix = null;
        String spritesArgumentSummary = null;
        RuntimeException caughtFailure = null;
        int leftWidth = 0;
        RuntimeException paintingFailure = null;
        int rightWidth = 0;
        int topHeight = 0;
        int bottomHeight = 0;
        int rightX = 0;
        int bottomY = 0;
        int centerLeft = 0;
        int centerRight = 0;
        int centerTop = 0;
        int centerBottom = 0;
        int clipCenterLeft = 0;
        int clipCenterRight = 0;
        int clipCenterTop = 0;
        int clipCenterBottom = 0;
        int topTileX = 0;
        int centerTileX = 0;
        int clientBranchFlag = 0;
        int bottomTileX;
        int leftTileY;
        int rightTileY;
        int centerTileY;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (sprites == null) {
            return;
          }
          if (width > 0 &&
            height > 0) {
            if (sprites[3] != null) {
              leftWidthValue = sprites[3].canvasWidth;
            } else {
              leftWidthValue = 0;
            }
            leftWidth = leftWidthValue;
            if (sprites[5] == null) {
              rightWidthValue = 0;
            } else {
              rightWidthValue = sprites[5].canvasWidth;
            }
            rightWidth = rightWidthValue;
            if (obfuscationGuard != -40) {
              return;
            }
            if (null == sprites[1]) {
              topHeightValue = 0;
            } else {
              topHeightValue = sprites[1].canvasHeight;
            }
            topHeight = topHeightValue;
            if (sprites[7] != null) {
              bottomHeightValue = sprites[7].canvasHeight;
            } else {
              bottomHeightValue = 0;
            }
            bottomHeight = bottomHeightValue;
            rightX = width + x;
            bottomY = y + height;
            centerLeft = leftWidth + x;
            centerRight = -rightWidth + rightX;
            centerTop = topHeight + y;
            centerBottom = bottomY - bottomHeight;
            clipCenterLeft = centerLeft;
            clipCenterRight = centerRight;
            if (clipCenterLeft > clipCenterRight) {
              clipCenterRight = width * leftWidth / (rightWidth + leftWidth) + x;
              clipCenterLeft = width * leftWidth / (rightWidth + leftWidth) + x;
            }
            clipCenterTop = centerTop;
            clipCenterBottom = centerBottom;
            if (clipCenterBottom < clipCenterTop) {
              clipCenterBottom = height * topHeight / (topHeight + bottomHeight) + y;
              clipCenterTop = height * topHeight / (topHeight + bottomHeight) + y;
            }
            Rasterizer2D.saveClip(QuickChatPhraseRegistry.nineSliceClipScratch);
            if (null != sprites[0]) {
              Rasterizer2D.intersectClip(x, y, clipCenterLeft, clipCenterTop);
              sprites[0].drawTransparent(x, y);
              Rasterizer2D.restoreClip(QuickChatPhraseRegistry.nineSliceClipScratch);
            }
            if (null != sprites[2]) {
              Rasterizer2D.intersectClip(clipCenterRight, y, rightX, clipCenterTop);
              sprites[2].drawTransparent(centerRight, y);
              Rasterizer2D.restoreClip(QuickChatPhraseRegistry.nineSliceClipScratch);
            }
            if (null != sprites[6]) {
              Rasterizer2D.intersectClip(x, clipCenterBottom, clipCenterLeft, bottomY);
              sprites[6].drawTransparent(x, centerBottom);
              Rasterizer2D.restoreClip(QuickChatPhraseRegistry.nineSliceClipScratch);
            }
            if (sprites[8] != null) {
              Rasterizer2D.intersectClip(clipCenterRight, clipCenterBottom, rightX, bottomY);
              sprites[8].drawTransparent(centerRight, centerBottom);
              Rasterizer2D.restoreClip(QuickChatPhraseRegistry.nineSliceClipScratch);
            }
            boolean topTilesCompleted = true;
            if (sprites[1] != null &&
              0 != sprites[1].canvasWidth) {
              Rasterizer2D.intersectClip(clipCenterLeft, y, clipCenterRight, clipCenterTop);
              topTileX = centerLeft;
              while (centerRight > topTileX) {
                sprites[1].drawTransparent(topTileX, y);
                topTileX = topTileX + sprites[1].canvasWidth;
                if (clientBranchFlag != 0) {
                  topTilesCompleted = false;
                  break;
                }
              }
              if (topTilesCompleted) {
                Rasterizer2D.restoreClip(QuickChatPhraseRegistry.nineSliceClipScratch);
              }
            }
            boolean bottomTilesCompleted = true;
            if (sprites[7] != null &&
              sprites[7].canvasWidth != 0) {
              Rasterizer2D.intersectClip(clipCenterLeft, clipCenterBottom, clipCenterRight, bottomY);
              bottomTileX = centerLeft;
              while (centerRight > bottomTileX) {
                sprites[7].drawTransparent(bottomTileX, centerBottom);
                bottomTileX = bottomTileX + sprites[7].canvasWidth;
                if (clientBranchFlag != 0) {
                  bottomTilesCompleted = false;
                  break;
                }
              }
              if (bottomTilesCompleted) {
                Rasterizer2D.restoreClip(QuickChatPhraseRegistry.nineSliceClipScratch);
              }
            }
            boolean leftTilesCompleted = true;
            if (sprites[3] != null &&
              sprites[3].canvasHeight != 0) {
              Rasterizer2D.intersectClip(x, clipCenterTop, clipCenterLeft, clipCenterBottom);
              leftTileY = centerTop;
              while (leftTileY < centerBottom) {
                sprites[3].drawTransparent(x, leftTileY);
                leftTileY = leftTileY + sprites[3].canvasHeight;
                if (clientBranchFlag != 0) {
                  leftTilesCompleted = false;
                  break;
                }
              }
              if (leftTilesCompleted) {
                Rasterizer2D.restoreClip(QuickChatPhraseRegistry.nineSliceClipScratch);
              }
            }
            boolean rightTilesCompleted = true;
            if (null != sprites[5] &&
              sprites[5].canvasHeight != 0) {
              Rasterizer2D.intersectClip(clipCenterRight, clipCenterTop, rightX, clipCenterBottom);
              rightTileY = centerTop;
              while (centerBottom > rightTileY) {
                sprites[5].drawTransparent(centerRight, rightTileY);
                rightTileY = rightTileY + sprites[5].canvasHeight;
                if (clientBranchFlag != 0) {
                  rightTilesCompleted = false;
                  break;
                }
              }
              if (rightTilesCompleted) {
                Rasterizer2D.restoreClip(QuickChatPhraseRegistry.nineSliceClipScratch);
              }
            }
            if (null != sprites[4] &&
              sprites[4].canvasWidth != 0 &&
              sprites[4].canvasHeight != 0) {
              Rasterizer2D.intersectClip(clipCenterLeft, clipCenterTop, clipCenterRight, clipCenterBottom);
              centerTileY = centerTop;
              while (centerTileY < centerBottom) {
                if (clientBranchFlag != 0) {
                  return;
                }
                centerTileX = centerLeft;
                while (centerTileX < centerRight) {
                  sprites[4].drawTransparent(centerTileX, centerTileY);
                  centerTileX = centerTileX + sprites[4].canvasWidth;
                }
                centerTileY = centerTileY + sprites[4].canvasHeight;
              }
              Rasterizer2D.restoreClip(QuickChatPhraseRegistry.nineSliceClipScratch);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtPaintingFailure) {
          caughtFailure = caughtPaintingFailure;
          paintingFailure = caughtFailure;
          contextFailure = paintingFailure;
          contextPrefix = new StringBuilder().append("nh.D(").append(width).append(',').append(height).append(',').append(obfuscationGuard).append(',').append(x).append(',');
          if (sprites == null) {
            spritesArgumentSummary = "null";
          } else {
            spritesArgumentSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) contextFailure), ((StringBuilder) (Object) contextPrefix).append(spritesArgumentSummary).append(',').append(y).append(')').toString());
        }
    }

    final static void configureTextChoiceDialogWithFont(RgbSprite[] outerFrameSprites, int centerY, int buttonPaddingX, int centerX, int buttonTextColor, TextFont font, int bodyTextColor, int outerPaddingY, int selectedButtonTextColor, RgbSprite[] buttonFrameSprites, int outerPaddingX, RgbSprite[] selectedButtonFrameSprites, int buttonGapY, byte obfuscationGuard, int buttonPaddingY) {
        RuntimeException contextFailure = null;
        StringBuilder contextPrefix = null;
        String firstSpritesSummary = null;
        StringBuilder fontContextPrefix = null;
        String fontArgumentSummary = null;
        StringBuilder secondSpritesContextPrefix = null;
        String secondSpritesSummary = null;
        StringBuilder thirdSpritesContextPrefix = null;
        String thirdSpritesSummary = null;
        RuntimeException caughtFailure = null;
        int fontLineHeight = 0;
        RuntimeException initializationFailure = null;
        int fontCapHeight = 0;
        RgbSprite[] unusedSprites = null;
        try {
          fontLineHeight = font.capHeight + font.descent;
          fontCapHeight = font.capHeight;
          if (obfuscationGuard != -110) {
            unusedSprites = (RgbSprite[]) null;
            LobbyUiHelpers.configureTextChoiceDialogWithFont((RgbSprite[]) null, -71, 62, -50, 61, (TextFont) null, 97, 90, 79, (RgbSprite[]) null, 117, (RgbSprite[]) null, 81, (byte) 46, -119);
          }
          TabbedPane.configureTextChoiceDialogFromSprites(centerX, fontLineHeight, outerPaddingX, buttonPaddingX, fontLineHeight, buttonGapY, centerY, outerPaddingY, buttonTextColor, outerFrameSprites, font, selectedButtonFrameSprites, selectedButtonTextColor, bodyTextColor, fontCapHeight, false, buttonPaddingY, buttonFrameSprites, font, fontCapHeight);
          return;
        } catch (java.lang.RuntimeException caughtInitializationFailure) {
          caughtFailure = caughtInitializationFailure;
          initializationFailure = caughtFailure;
          contextFailure = initializationFailure;
          contextPrefix = new StringBuilder().append("nh.C(");
          if (outerFrameSprites == null) {
            firstSpritesSummary = "null";
          } else {
            firstSpritesSummary = "{...}";
          }
          fontContextPrefix = ((StringBuilder) (Object) contextPrefix).append(firstSpritesSummary).append(',').append(centerY).append(',').append(buttonPaddingX).append(',').append(centerX).append(',').append(buttonTextColor).append(',');
          if (font == null) {
            fontArgumentSummary = "null";
          } else {
            fontArgumentSummary = "{...}";
          }
          secondSpritesContextPrefix = ((StringBuilder) (Object) fontContextPrefix).append(fontArgumentSummary).append(',').append(bodyTextColor).append(',').append(outerPaddingY).append(',').append(selectedButtonTextColor).append(',');
          if (buttonFrameSprites == null) {
            secondSpritesSummary = "null";
          } else {
            secondSpritesSummary = "{...}";
          }
          thirdSpritesContextPrefix = ((StringBuilder) (Object) secondSpritesContextPrefix).append(secondSpritesSummary).append(',').append(outerPaddingX).append(',');
          if (selectedButtonFrameSprites == null) {
            thirdSpritesSummary = "null";
          } else {
            thirdSpritesSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) contextFailure), ((StringBuilder) (Object) thirdSpritesContextPrefix).append(thirdSpritesSummary).append(',').append(buttonGapY).append(',').append(obfuscationGuard).append(',').append(buttonPaddingY).append(')').toString());
        }
    }

    final static void updateLobbyControls(boolean obfuscationGuard, boolean suppressInput, boolean inputEnabled, int gameActionOpcode, boolean allowStartGame) {
        int transitionTick = 0;
        boolean transitionAlternateGuard = false;
        UiComponent startButtonForEnable = null;
        boolean startAllowedWithoutPendingOptions = false;
        int ruleLengthOrInvertedSetting = 0;
        int ruleIndexOrInvertedMaximumSetting = 0;
        int playerCountForRule = 0;
        int ruleSettingIndex = 0;
        int playerCountRuleSentinel = 0;
        int rulePairCursor = 0;
        int overrideGateValue = 0;
        boolean affectedSetting = false;
        int affectedSettingValue = 0;
        boolean playerUnindexed = false;
        int playerOverrideGateValue = 0;
        UiComponent lobbyRoot = null;
        boolean lobbyInputEnabled = false;
        UiComponent gameRoot = null;
        boolean gameInputEnabled = false;
        UiComponent requestsRoot = null;
        boolean requestsInputEnabled = false;
        RuntimeException caughtFailure = null;
        boolean affectedSettingForTooltip;
        boolean playerUnindexedValue;
        RuntimeException updateFailure = null;
        UiComponent startButtonForCollapse = null;
        UiComponent waitingMessageForCollapse = null;
        UiComponent countdownTarget = null;
        String gameDisplayName = null;
        int buttonSplitXOrCountdownSeconds = 0;
        String pendingRequestCaption = null;
        int restrictionPass = 0;
        int settingCursorOrRestrictionFlag = 0;
        Object affectedSettingNames = null;
        int ruleCursorOrMultipleSettingsFlag = 0;
        int[] rulePairsForInspection = null;
        int tooltipSettingIndex = 0;
        String restrictionHeading = null;
        int pairCursorOrMinimumRatedGames = 0;
        String restrictionDetails = null;
        int settingCursorOrEligibilityMask = 0;
        int settingCursorOrIneligiblePlayer = 0;
        int settingValueOrPlayerCount = 0;
        NodeDeque gamePlayerRows = null;
        Object unusedIterationScratch = null;
        int requiredRatingValue = 0;
        LobbyPlayer player = null;
        int clientBranchFlag = 0;
        RgbSprite[] unusedSprites = null;
        int[] rulePairsAlias = null;
        UiComponent requestsButtonForCollapse = null;
        int[] rulePairsForMatching = null;
        String highlightedSettingName = null;
        int[] rulePairs = null;
        UiComponent requestsButtonAlias = null;
        int pairIndexForMaximum;
        int pairCountForMaximum;
        int ruleMatched;
        int minimumRating;
        int requiredRatedGamesValue;
        unusedIterationScratch = null;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          transitionTick = TableDataRequest.field_m;
          transitionAlternateGuard = !(obfuscationGuard);
          ArchiveSourceManager.layoutLobbyTransition(transitionTick, transitionAlternateGuard);
          if (ClientResourceHelpers.currentLobbyGame != null) {
            boolean continueOwnerEligibility = true;
            GameUiController.field_e.enabled = true;
            requestsButtonForCollapse = RadialSelectorRenderer.field_h;
            requestsButtonAlias = requestsButtonForCollapse;
            RadialSelectorRenderer.field_h.height = 0;
            requestsButtonAlias.width = 0;
            DraggableWidget.field_K.height = 0;
            startButtonForCollapse = DraggableWidget.field_K;
            startButtonForCollapse.width = 0;
            waitingMessageForCollapse = AppletGameShell.field_e;
            AppletGameShell.field_e.height = 0;
            waitingMessageForCollapse.width = 0;
            if (!hn.b((byte) 7)) {
              gameDisplayName = ClientResourceHelpers.currentLobbyGame.displayName;
              ba.field_v.text = GamePresentationHelpers.formatIndexedText(fm.field_a, new String[]{gameDisplayName}, (byte) 103).toUpperCase();
              AppletGameShell.field_e.setBounds(40, MultiplayerMatch.field_d.height - 40, 0, MultiplayerMatch.field_d.width, (byte) 64);
              AppletGameShell.field_e.text = GamePresentationHelpers.formatIndexedText(IntrusiveNode.field_a, new String[]{gameDisplayName}, (byte) 103);
              countdownTarget = AppletGameShell.field_e;
              continueOwnerEligibility = (clientBranchFlag != 0);
            }
            if (continueOwnerEligibility) {
              ba.field_v.text = ba.field_x.toUpperCase();
              buttonSplitXOrCountdownSeconds = (MultiplayerMatch.field_d.width + 2) / 2;
              RadialSelectorRenderer.field_h.setBounds(40, MultiplayerMatch.field_d.height - 40, 0, -2 + buttonSplitXOrCountdownSeconds, (byte) 64);
              if (ClientResourceHelpers.currentLobbyGame.maxPlayers <= ClientResourceHelpers.currentLobbyGame.playerCount) {
                RadialSelectorRenderer.field_h.text = GameCanvas.field_d.toUpperCase();
                RadialSelectorRenderer.field_h.enabled = false;
                if (clientBranchFlag != 0) {
                  RadialSelectorRenderer.field_h.text = SecondaryNodeQueue.field_a.toUpperCase();
                  RadialSelectorRenderer.field_h.enabled = true;
                }
              } else {
                RadialSelectorRenderer.field_h.text = SecondaryNodeQueue.field_a.toUpperCase();
                RadialSelectorRenderer.field_h.enabled = true;
              }
              RadialSelectorRenderer.field_h.frameSprites = fm.field_b.frameSprites;
              if (KeyDispatchHelpers.pendingJoinRequestCount > 0) {
                boolean usePluralRequestCaption = (KeyDispatchHelpers.pendingJoinRequestCount != 1);
                if (!usePluralRequestCaption) {
                  pendingRequestCaption = LabeledToggleRenderer.field_g;
                  usePluralRequestCaption = (clientBranchFlag != 0);
                }
                if (usePluralRequestCaption) {
                  pendingRequestCaption = GamePresentationHelpers.formatIndexedText(LevelPackLoader.field_h, new String[]{Integer.toString(KeyDispatchHelpers.pendingJoinRequestCount)}, (byte) 103);
                }
                RadialSelectorRenderer.field_h.text = RadialSelectorRenderer.field_h.text + "<br>" + pendingRequestCaption;
                if ((BirthDateValidator.field_h & 16) == 0 &&
                  !hc.joinRequestsPanelOpen) {
                  RadialSelectorRenderer.field_h.frameSprites = fm.field_b.activeFrameSprites;
                }
              }
              DraggableWidget.field_K.setBounds(40, MultiplayerMatch.field_d.height - 40, buttonSplitXOrCountdownSeconds, MultiplayerMatch.field_d.width - buttonSplitXOrCountdownSeconds, (byte) 64);
              DraggableWidget.field_K.text = ConstructionBackground.field_r.toUpperCase();
              countdownTarget = DraggableWidget.field_K;
              startButtonForEnable = DraggableWidget.field_K;
              startAllowedWithoutPendingOptions = (allowStartGame) && (ic.optionChangeDeadlineMillis == 0L);
              startButtonForEnable.enabled = startAllowedWithoutPendingOptions;
              restrictionPass = 2;
              if (null != ContextMenu.field_bc) {
                if (PlayerNameChooserPanel.field_J == null) {
                  SingleChildWidget.field_D = new boolean[RankingsRequest.gameSettingCount];
                  PlayerNameChooserPanel.field_J = new byte[RankingsRequest.gameSettingCount];
                }
                settingCursorOrRestrictionFlag = 0;
                do {
                  if (!(RankingsRequest.gameSettingCount > settingCursorOrRestrictionFlag)) {
                    restrictionPass = 0;
                    break;
                  }
                  SingleChildWidget.field_D[settingCursorOrRestrictionFlag] = false;
                  settingCursorOrRestrictionFlag++;
                } while (clientBranchFlag == 0);
                scanLoop1: while (true) {
                  if (restrictionPass < 2) {
                    settingCursorOrRestrictionFlag = 0;
                    overrideGateValue = 0;
                    if (clientBranchFlag != 0) {
                      break scanLoop1;
                    }
                    ruleCursorOrMultipleSettingsFlag = overrideGateValue;
                    while (true) {
                      ruleLengthOrInvertedSetting = ContextMenu.field_bc.length;
                      ruleIndexOrInvertedMaximumSetting = ruleCursorOrMultipleSettingsFlag;
                      if (ruleLengthOrInvertedSetting > ruleIndexOrInvertedMaximumSetting) {
                        rulePairs = ContextMenu.field_bc[ruleCursorOrMultipleSettingsFlag];
                        rulePairsForMatching = rulePairs;
                        rulePairsAlias = rulePairsForMatching;
                        rulePairsForInspection = rulePairsAlias;
                        rulePairCursor = 0;
                        pairCursorOrMinimumRatedGames = rulePairCursor;
                        scanLoop2: while (true) {
                          if (rulePairs.length > pairCursorOrMinimumRatedGames) {
                            settingCursorOrEligibilityMask = rulePairs[pairCursorOrMinimumRatedGames];
                            settingCursorOrIneligiblePlayer = rulePairsAlias[pairCursorOrMinimumRatedGames + 1];
                            ruleSettingIndex = settingCursorOrEligibilityMask;
                            playerCountRuleSentinel = -1;
                            if (ruleSettingIndex != playerCountRuleSentinel) {
                              if (~(ClientResourceHelpers.currentLobbyGame.settings[settingCursorOrEligibilityMask] & 255) != ~settingCursorOrIneligiblePlayer) {
                                break scanLoop2;
                              }
                            } else {
                              if (restrictionPass != 0) {
                                playerCountForRule = ClientResourceHelpers.currentLobbyGame.playerCount;
                              } else {
                                playerCountForRule = ClientResourceHelpers.currentLobbyGame.maxPlayers;
                              }
                              settingValueOrPlayerCount = playerCountForRule;
                              if (settingValueOrPlayerCount != settingCursorOrIneligiblePlayer &&
                                clientBranchFlag == 0) {
                                break scanLoop2;
                              }
                            }
                            pairCursorOrMinimumRatedGames += 2;
                            continue;
                          }
                          settingCursorOrRestrictionFlag = 1;
                          pairCursorOrMinimumRatedGames = -1;
                          settingCursorOrEligibilityMask = 0;
                          while (true) {
                            pairIndexForMaximum = settingCursorOrEligibilityMask;
                            pairCountForMaximum = rulePairs.length;
                            if (pairIndexForMaximum >= pairCountForMaximum) {
                              break;
                            }
                            settingCursorOrIneligiblePlayer = rulePairs[settingCursorOrEligibilityMask];
                            ruleLengthOrInvertedSetting = ~settingCursorOrIneligiblePlayer;
                            ruleIndexOrInvertedMaximumSetting = ~pairCursorOrMinimumRatedGames;
                            if (ruleLengthOrInvertedSetting < ruleIndexOrInvertedMaximumSetting) {
                              pairCursorOrMinimumRatedGames = settingCursorOrIneligiblePlayer;
                            }
                            settingCursorOrEligibilityMask += 2;
                          }
                          SingleChildWidget.field_D[pairCursorOrMinimumRatedGames] = true;
                          break;
                        }
                        ruleCursorOrMultipleSettingsFlag++;
                        continue;
                      }
                      break;
                    }
                    ruleMatched = settingCursorOrRestrictionFlag;
                    if (ruleMatched == 0 ||
                      clientBranchFlag != 0) {
                      restrictionPass++;
                      continue;
                    }
                  }
                  overrideGateValue = 2;
                  break;
                }
                if (!(overrideGateValue > QuickChatHelpDialog.field_Yb) &&
                  IntArrayRequest.heldKeys[12]) {
                  restrictionPass = 2;
                }
              }
              if (restrictionPass < 2) {
                DraggableWidget.field_K.enabled = false;
                continueOwnerEligibility = !(!DraggableWidget.field_K.hovered);
                if (continueOwnerEligibility) {
                  affectedSettingNames = null;
                  ruleCursorOrMultipleSettingsFlag = 0;
                  tooltipSettingIndex = 0;
                  while (true) {
                    if (RankingsRequest.gameSettingCount > tooltipSettingIndex) {
                      affectedSettingForTooltip = SingleChildWidget.field_D[tooltipSettingIndex];
                      affectedSettingValue = affectedSettingForTooltip ? 1 : 0;
                      affectedSetting = affectedSettingForTooltip;
                      if (clientBranchFlag == 0) {
                        if (affectedSetting) {
                          highlightedSettingName = "<col=A00000>" + QuickChatPhraseRegistry.field_b[tooltipSettingIndex] + "</col>";
                          if (affectedSettingNames != null) {
                            affectedSettingNames = (String) (affectedSettingNames) + ", " + highlightedSettingName;
                            ruleCursorOrMultipleSettingsFlag = 1;
                          } else {
                            affectedSettingNames = highlightedSettingName;
                          }
                        }
                        tooltipSettingIndex++;
                        continue;
                      }
                    } else {
                      affectedSettingValue = -1;
                    }
                    break;
                  }
                  if (affectedSettingValue != ~restrictionPass) {
                    restrictionHeading = AccountContentTransitionLayer.field_rb;
                    if (ruleCursorOrMultipleSettingsFlag == 0) {
                      restrictionDetails = GamePresentationHelpers.formatIndexedText(ContextMenu.field_ac, new String[]{(String) (affectedSettingNames)}, (byte) 103);
                      if (clientBranchFlag != 0) {
                        restrictionDetails = LoginCredentials.field_e + (String) (affectedSettingNames);
                      }
                    } else {
                      restrictionDetails = LoginCredentials.field_e + (String) (affectedSettingNames);
                    }
                  } else {
                    restrictionHeading = WhirlpoolHasher.field_b;
                    boolean useSingularRestrictionCaption = (ruleCursorOrMultipleSettingsFlag == 0);
                    if (!useSingularRestrictionCaption) {
                      restrictionDetails = BackgroundScene.field_g + (String) (affectedSettingNames);
                      useSingularRestrictionCaption = (clientBranchFlag != 0);
                    }
                    if (useSingularRestrictionCaption) {
                      restrictionDetails = GamePresentationHelpers.formatIndexedText(MouseWheelSource.field_b, new String[]{(String) (affectedSettingNames)}, (byte) 103);
                    }
                  }
                  WidgetTextLayout.field_e = "<col=A00000>" + restrictionHeading + "<br>" + restrictionDetails;
                }
              }
              if ((continueOwnerEligibility) && (!(restrictionPass < 2) || clientBranchFlag != 0) && (null != NodeDeque.field_a ||
                AchievementsScreen.field_F != null ||
                MatchResultScreen.field_v != null ||
                null != LoginMethodPreference.field_e)) {
                settingCursorOrRestrictionFlag = 0;
                ruleCursorOrMultipleSettingsFlag = 0;
                minimumRating = 0;
                pairCursorOrMinimumRatedGames = 0;
                settingCursorOrEligibilityMask = 0;
                settingCursorOrIneligiblePlayer = 0;
                boolean allSettingsVisited = false;
                while (!(allSettingsVisited = (!(RankingsRequest.gameSettingCount > settingCursorOrIneligiblePlayer)))) {
                  settingValueOrPlayerCount = 255 & ClientResourceHelpers.currentLobbyGame.settings[settingCursorOrIneligiblePlayer];
                  if (clientBranchFlag == 0) {
                    if (NodeDeque.field_a != null &&
                      NodeDeque.field_a[settingCursorOrIneligiblePlayer] != null &&
                      NodeDeque.field_a[settingCursorOrIneligiblePlayer][settingValueOrPlayerCount]) {
                      settingCursorOrRestrictionFlag = 1;
                    }
                    if (AchievementsScreen.field_F != null &&
                      null != AchievementsScreen.field_F[settingCursorOrIneligiblePlayer]) {
                      requiredRatingValue = AchievementsScreen.field_F[settingCursorOrIneligiblePlayer][settingValueOrPlayerCount];
                      if (requiredRatingValue != 0 &&
                        !ea.field_g) {
                        settingCursorOrRestrictionFlag = 1;
                      }
                      if (requiredRatingValue > minimumRating) {
                        minimumRating = requiredRatingValue;
                      }
                    }
                    if (MatchResultScreen.field_v != null &&
                      MatchResultScreen.field_v[settingCursorOrIneligiblePlayer] != null) {
                      requiredRatedGamesValue = MatchResultScreen.field_v[settingCursorOrIneligiblePlayer][settingValueOrPlayerCount];
                      if (requiredRatedGamesValue != 0 &&
                        !ea.field_g) {
                        settingCursorOrRestrictionFlag = 1;
                      }
                      if (pairCursorOrMinimumRatedGames < requiredRatedGamesValue) {
                        pairCursorOrMinimumRatedGames = requiredRatedGamesValue;
                      }
                    }
                    if (null != LoginMethodPreference.field_e &&
                      LoginMethodPreference.field_e[settingCursorOrIneligiblePlayer] != null) {
                      settingCursorOrEligibilityMask = settingCursorOrEligibilityMask | LoginMethodPreference.field_e[settingCursorOrIneligiblePlayer][settingValueOrPlayerCount];
                    }
                    settingCursorOrIneligiblePlayer++;
                    continue;
                  }
                  break;
                }
                if (allSettingsVisited) {
                  settingCursorOrIneligiblePlayer = 0;
                }
                gamePlayerRows = TimedSplashScreen.field_u.content.children;
                player = (LobbyPlayer) (gamePlayerRows.first(-97));
                scanLoop3: while (true) {
                  boolean continuePlayerIteration = true;
                  if (player != null) {
                    playerUnindexedValue = player.isUnindexed(0);
                    playerOverrideGateValue = playerUnindexedValue ? 1 : 0;
                    playerUnindexed = playerUnindexedValue;
                    if (clientBranchFlag != 0) {
                      break scanLoop3;
                    }
                    if (!playerUnindexed ||
                      clientBranchFlag != 0) {
                      if (settingCursorOrRestrictionFlag != 0 &&
                        !player.member) {
                        settingCursorOrIneligiblePlayer = 1;
                        continuePlayerIteration = false;
                      }
                      else {
                        if (minimumRating > player.rating) {
                          settingCursorOrIneligiblePlayer = 1;
                          continuePlayerIteration = false;
                        }
                        else {
                          if (player.ratedGameCount < pairCursorOrMinimumRatedGames) {
                            settingCursorOrIneligiblePlayer = 1;
                            continuePlayerIteration = false;
                          }
                          else {
                            if ((settingCursorOrEligibilityMask & ~player.optionEligibilityMask) > 0) {
                              settingCursorOrIneligiblePlayer = 1;
                              continuePlayerIteration = false;
                            }
                            else {
                              if (ruleCursorOrMultipleSettingsFlag != 0) {
                                settingCursorOrIneligiblePlayer = 1;
                                continuePlayerIteration = false;
                              }
                            }
                          }
                        }
                      }
                    }
                    if (continuePlayerIteration) {
                      player = (LobbyPlayer) (gamePlayerRows.next((byte) 116));
                      continue;
                    }
                  }
                  playerOverrideGateValue = 2;
                  break;
                }
                if (playerOverrideGateValue <= QuickChatHelpDialog.field_Yb &&
                  IntArrayRequest.heldKeys[12]) {
                  settingCursorOrIneligiblePlayer = 0;
                }
                if (settingCursorOrIneligiblePlayer != 0) {
                  DraggableWidget.field_K.enabled = false;
                  if (DraggableWidget.field_K.hovered) {
                    if (BrickGameLayerController.field_c.tabs.selectedTab != 0) {
                      WidgetTextLayout.field_e = GamePresentationHelpers.formatIndexedText(NineSliceFrame.field_d, new String[]{UiComponent.field_Z}, (byte) 103);
                      if (clientBranchFlag != 0) {
                        WidgetTextLayout.field_e = LabeledToggleRenderer.field_a;
                      }
                    } else {
                      WidgetTextLayout.field_e = LabeledToggleRenderer.field_a;
                    }
                  }
                }
              }
            }
            if (0L != ic.optionChangeDeadlineMillis) {
              buttonSplitXOrCountdownSeconds = (int)(ic.optionChangeDeadlineMillis - MonotonicTime.nowMillis(false));
              buttonSplitXOrCountdownSeconds = (buttonSplitXOrCountdownSeconds + 999) / 1000;
              if (1 > buttonSplitXOrCountdownSeconds) {
                buttonSplitXOrCountdownSeconds = 1;
              }
              countdownTarget.text = GamePresentationHelpers.formatIndexedText(SpriteGeometry.field_w, new String[]{Integer.toString(buttonSplitXOrCountdownSeconds)}, (byte) 103);
            }
            TextWidgetRenderer.field_b.text = GamePresentationHelpers.formatIndexedText(rl.field_d, new String[]{Integer.toString(ClientResourceHelpers.currentLobbyGame.playerCount), Integer.toString(ClientResourceHelpers.currentLobbyGame.maxPlayers)}, (byte) 103);
          }
          lobbyRoot = NinjaBackground.field_w;
          lobbyInputEnabled = (inputEnabled) && (!suppressInput) && (!hc.joinRequestsPanelOpen);
          ((UiComponent) (Object) lobbyRoot).updateRoot(lobbyInputEnabled, -15211);
          gameRoot = MultiplayerMatch.field_d;
          gameInputEnabled = (inputEnabled) && (!suppressInput) && (!hc.joinRequestsPanelOpen);
          ((UiComponent) (Object) gameRoot).updateRoot(gameInputEnabled, -15211);
          requestsRoot = ProxySocketConnector.field_j;
          requestsInputEnabled = (inputEnabled) && (!suppressInput) && (hc.joinRequestsPanelOpen);
          ((UiComponent) (Object) requestsRoot).updateRoot(requestsInputEnabled, -15211);
          if (!obfuscationGuard) {
            unusedSprites = (RgbSprite[]) null;
            LobbyUiHelpers.paintNineSliceFrame(-9, -55, 119, -100, (RgbSprite[]) null, -102);
          }
          BrickGameLayerController.field_c.tabs.processTabPresses(0);
          if (null != ClientResourceHelpers.currentLobbyGame) {
            if (GameUiController.field_e.pressedButton != 0) {
              GameTransportActions.requestLeaveOrDeclineGame(ClientResourceHelpers.currentLobbyGame.getGameId((byte) 123), false, gameActionOpcode);
            }
            if (RadialSelectorRenderer.field_h.pressedButton != 0) {
              hc.joinRequestsPanelOpen = true;
            }
            if (DraggableWidget.field_K.pressedButton != 0) {
              CacheEntry.field_w = true;
            }
            if (0 != nd.field_a.pressedButton) {
              hc.joinRequestsPanelOpen = false;
            }
            JungleBackground.a(gameActionOpcode, ClientResourceHelpers.currentLobbyGame, false, false);
          }
          return;
        } catch (java.lang.RuntimeException caughtUpdateFailure) {
          caughtFailure = caughtUpdateFailure;
          updateFailure = caughtFailure;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) updateFailure), "nh.E(" + obfuscationGuard + ',' + suppressInput + ',' + inputEnabled + ',' + gameActionOpcode + ',' + allowStartGame + ')');
        }
    }

    final static void advanceLobbyStatusTimers(int obfuscationGuard) {
        LobbyGame iteratedGame = null;
        Object nextCollectionEntry = null;
        int expiryMinusOne = 0;
        int invertedLobbyPlayerTimer = 0;
        RuntimeException caughtFailure = null;
        LobbyGame gameForUpdate;
        LobbyPlayer lobbyPlayer = null;
        LobbyGame game = null;
        RuntimeException timerFailure = null;
        int clientBranchFlag = 0;
        LobbyPlayer gamePlayer;
        int expiredTimerMinusOne;
        int invertedGamePlayerTimer;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          lobbyPlayer = (LobbyPlayer) (GameplayRenderHelpers.lobbyPlayers.first(-50));
          while (lobbyPlayer != null) {
            expiryMinusOne = -1;
            invertedLobbyPlayerTimer = ~lobbyPlayer.statusChangeTick;
            if (clientBranchFlag != 0) {
              while (true) {
                if (expiryMinusOne == invertedLobbyPlayerTimer) {
                  lobbyPlayer.removalStatus = 0;
                  if (lobbyPlayer.isUnindexed(obfuscationGuard + 0)) {
                    lobbyPlayer.unlink((byte) 111);
                  }
                }
                while (true) {
                  lobbyPlayer = (LobbyPlayer) (SocialListEntry.gamePlayers.next((byte) 116));
                  return;
                }
              }
            }
            if (expiryMinusOne > invertedLobbyPlayerTimer) {
              lobbyPlayer.statusChangeTick = lobbyPlayer.statusChangeTick - 1;
              if (lobbyPlayer.statusChangeTick == 0) {
                lobbyPlayer.removalStatus = 0;
                if (lobbyPlayer.isUnindexed(0)) {
                  lobbyPlayer.unlink((byte) 111);
                }
              }
            }
            lobbyPlayer = (LobbyPlayer) (GameplayRenderHelpers.lobbyPlayers.next((byte) 116));
            if (clientBranchFlag == 0) {
              continue;
            }
            break;
          }
          game = (LobbyGame) (rq.lobbyGames.first(-14));
          if (obfuscationGuard != 0) {
            receivedChatBadge = -23;
          }
          boolean allGamesVisited = false;
          while (!(allGamesVisited = (game == null))) {
            gameForUpdate = game;
            nextCollectionEntry = gameForUpdate;
            iteratedGame = gameForUpdate;
            if (clientBranchFlag == 0) {
              if (iteratedGame.statusChangeTick > 0) {
                game.statusChangeTick = game.statusChangeTick - 1;
                if (game.statusChangeTick == 0) {
                  game.removalStatus = 0;
                  if (game.isUnindexed(obfuscationGuard ^ -15)) {
                    game.unlink((byte) 111);
                  }
                }
              }
              game = (LobbyGame) (rq.lobbyGames.next((byte) 116));
              continue;
            }
            break;
          }
          if (allGamesVisited) {
            nextCollectionEntry = SocialListEntry.gamePlayers.first(-21);
          }
          gamePlayer = (LobbyPlayer) (nextCollectionEntry);
          while (true) {
            if (gamePlayer == null) {
              return;
            }
            if (clientBranchFlag != 0) {
              return;
            }
            if (gamePlayer.statusChangeTick > 0) {
              gamePlayer.statusChangeTick = gamePlayer.statusChangeTick - 1;
              expiredTimerMinusOne = -1;
              invertedGamePlayerTimer = ~gamePlayer.statusChangeTick;
              if (expiredTimerMinusOne == invertedGamePlayerTimer) {
                gamePlayer.removalStatus = 0;
                if (gamePlayer.isUnindexed(obfuscationGuard + 0)) {
                  gamePlayer.unlink((byte) 111);
                }
              }
            }
            gamePlayer = (LobbyPlayer) (SocialListEntry.gamePlayers.next((byte) 116));
          }
        } catch (java.lang.RuntimeException caughtTimerFailure) {
          caughtFailure = caughtTimerFailure;
          timerFailure = caughtFailure;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) timerFailure), "nh.B(" + obfuscationGuard + ')');
        }
    }

    public static void clearSharedReferences(int obfuscationGuard) {
        int unusedGuardQuotient = 17 / ((obfuscationGuard + 45) / 59);
        reportSecurityHeading = null;
        cancelCreateGameButton = null;
        quickChatPhrases = null;
    }

    static {
        reportSecurityHeading = "Security";
    }
}
