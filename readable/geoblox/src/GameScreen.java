/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameScreen extends MenuScreen {
    private boolean renderingPreviousTutorialPage;
    private int tutorialGeometryCategory;
    private boolean menuPressAnimationActive;
    private int tutorialOrbitRadius;
    private int tutorialBlueDelta;
    private int tutorialRedDelta;
    private int tutorialEffectFrame;
    private int previousTutorialPageIndex;
    private Geoblox gameApplet;
    private int screenId;
    int activeTicks;
    private int fullscreenDialogButtonIndex;
    private int tutorialStarFrameOrColorIndex;
    private int tutorialGreenDelta;
    private int tutorialGeometryVariant;
    private int[] savedTutorialClipBounds;
    private int menuPressOffset;
    private boolean fullscreenDialogActive;
    static String[] quickChatShortcutHelpTexts;
    private int tutorialTintRgb;
    private int previousPointerX;
    private int previousPointerY;
    static int selectedThemeId;
    private double tutorialOrbitAngleRadians;
    private boolean tutorialSlideActive;
    private int animationTick;
    private int foregroundScrollX;
    private int foregroundScrollY;
    private PcmSampleStream volumePreviewStream;
    private int volumePreviewTicks;
    static String createNameLeadingSpaceAlertText;
    private int backgroundScrollX;
    int tutorialPageIndex;
    private boolean tutorialSlideForward;
    static java.applet.Applet errorReportApplet;
    private int tutorialSlideOffset;
    private int backgroundScrollY;
    private int tutorialDemoTick;

    final void handleMenuKey(int itemIndex, int methodGuard) {
        RuntimeException caughtFailure = null;
        int actionId = 0;
        RuntimeException menuKeyFailure = null;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          menuKeyDispatch: {
            volumeKeyHandling: {
              actionId = InstrumentEnvelope.menuActionIds[this.screenId][itemIndex];
              if (actionId == 8 &&
                  clientControlFlowGuard == 0) {
                if (102 != SessionTextHistorySupport.currentKeyboardEventCode) {
                  if (SessionTextHistorySupport.currentKeyboardEventCode != 103) {
                    super.handleMenuKey(itemIndex, -53);
                  } else {
                    SocialListEntry.soundEffectVolume = 80;
                  }
                } else {
                  SocialListEntry.soundEffectVolume = 0;
                }
                this.previewMusicVolume(0);
                break menuKeyDispatch;
              } else {
                if (actionId != 9) {
                  break volumeKeyHandling;
                }
              }
              if (102 != SessionTextHistorySupport.currentKeyboardEventCode) {
                if (103 != SessionTextHistorySupport.currentKeyboardEventCode) {
                  super.handleMenuKey(itemIndex, -70);
                  if (clientControlFlowGuard == 0) {
                    break menuKeyDispatch;
                  }
                }
                AsyncResourceDownloader.setGameMusicVolume(-15346, 80);
                if (clientControlFlowGuard == 0) {
                  break menuKeyDispatch;
                }
              }
              AsyncResourceDownloader.setGameMusicVolume(-15346, 0);
              if (clientControlFlowGuard == 0) {
                break menuKeyDispatch;
              }
            }
            if (SessionTextHistorySupport.currentKeyboardEventCode == 13 &&
                !this.fullscreenDialogActive) {
              if (this.screenId == 1) {
                ScoreSubmission.requestedScreenId = -1;
                if (clientControlFlowGuard != 0) {
                  ScoreSubmission.requestedScreenId = SpriteCheckboxRenderer.previousMenuScreenId;
                }
              } else {
                ScoreSubmission.requestedScreenId = SpriteCheckboxRenderer.previousMenuScreenId;
              }
              if (~ScoreSubmission.requestedScreenId == ~this.screenId) {
                break menuKeyDispatch;
              }
              if (this.screenId != 1 &&
                  this.screenId != 0) {
                break menuKeyDispatch;
              }
              SpriteCheckboxRenderer.previousMenuScreenId = this.screenId;
              if (clientControlFlowGuard == 0) {
                break menuKeyDispatch;
              }
            }
            if (this.fullscreenDialogActive) {
              if (SessionTextHistorySupport.currentKeyboardEventCode == 84 ||
                  83 == SessionTextHistorySupport.currentKeyboardEventCode) {
                if (!UnderlinedButtonRenderer.isGuestSessionMode(-103)) {
                  if (!(TextTemplateDefinition.loginMembershipGateValue <= 0) ||
                      this.fullscreenDialogButtonIndex != 0 &&
                        (!(PrefixCodeDecoder.pointerXSnapshot > 190) ||
                        !(PrefixCodeDecoder.pointerXSnapshot < 449) ||
                        !(265 < PcmResampler.pointerYSnapshot) ||
                        !(PcmResampler.pointerYSnapshot < 299))) {
                    if (InstrumentPatch.activeFullscreenCanvas == null) {
                      if (0 != this.fullscreenDialogButtonIndex) {
                        if (PrefixCodeDecoder.pointerXSnapshot <= 260) {
                          break menuKeyDispatch;
                        }
                        if (PrefixCodeDecoder.pointerXSnapshot >= 380) {
                          break menuKeyDispatch;
                        }
                        if (PcmResampler.pointerYSnapshot <= 274) {
                          break menuKeyDispatch;
                        }
                        if (PcmResampler.pointerYSnapshot >= 309) {
                          break menuKeyDispatch;
                        }
                      }
                      this.pointerInteractionActive = true;
                      this.fullscreenDialogActive = false;
                      if (clientControlFlowGuard == 0) {
                        break menuKeyDispatch;
                      }
                    }
                    if (1 == this.fullscreenDialogButtonIndex ||
                        this.fullscreenDialogButtonIndex < 0 &&
                          !(PrefixCodeDecoder.pointerXSnapshot <= 350) &&
                          !(PrefixCodeDecoder.pointerXSnapshot >= 470) &&
                          !(PcmResampler.pointerYSnapshot <= 327) &&
                          !(PcmResampler.pointerYSnapshot >= 362)) {
                      this.fullscreenDialogActive = false;
                      ArchiveCatalog.exitFullscreenIfActive(255);
                      this.pointerInteractionActive = true;
                      if (clientControlFlowGuard == 0) {
                        break menuKeyDispatch;
                      }
                    }
                    if (this.fullscreenDialogButtonIndex != 0) {
                      if (this.fullscreenDialogButtonIndex >= 0) {
                        break menuKeyDispatch;
                      }
                      if (PrefixCodeDecoder.pointerXSnapshot <= 170) {
                        break menuKeyDispatch;
                      }
                      if (PrefixCodeDecoder.pointerXSnapshot >= 290) {
                        break menuKeyDispatch;
                      }
                      if (PcmResampler.pointerYSnapshot <= 327) {
                        break menuKeyDispatch;
                      }
                      if (PcmResampler.pointerYSnapshot >= 362) {
                        break menuKeyDispatch;
                      }
                    }
                    this.pointerInteractionActive = true;
                    this.fullscreenDialogActive = false;
                    if (clientControlFlowGuard == 0) {
                      break menuKeyDispatch;
                    }
                  }
                  this.pointerInteractionActive = true;
                  this.fullscreenDialogActive = false;
                  if (clientControlFlowGuard == 0) {
                    break menuKeyDispatch;
                  }
                }
                if (this.fullscreenDialogButtonIndex == 1 ||
                    this.fullscreenDialogButtonIndex < 0 &&
                      !(PrefixCodeDecoder.pointerXSnapshot <= 350) &&
                      !(470 <= PrefixCodeDecoder.pointerXSnapshot) &&
                      !(PcmResampler.pointerYSnapshot <= 265) &&
                      !(PcmResampler.pointerYSnapshot >= 299)) {
                  this.pointerInteractionActive = true;
                  this.fullscreenDialogActive = false;
                  if (clientControlFlowGuard == 0) {
                    break menuKeyDispatch;
                  }
                }
                if (this.fullscreenDialogButtonIndex != 0) {
                  if (!(this.fullscreenDialogButtonIndex >= 0)) {
                    if (!(PrefixCodeDecoder.pointerXSnapshot <= 170)) {
                      if (!(PrefixCodeDecoder.pointerXSnapshot >= 290)) {
                        if (!(PcmResampler.pointerYSnapshot <= 265)) {
                          if (!(PcmResampler.pointerYSnapshot >= 299)) {
                            this.pointerInteractionActive = true;
                            if (null != UiWidget.gameplaySession) {
                              UiWidget.gameplaySession.submitScore((byte) -70);
                            }
                            UiWidget.gameplayReturnScreenId = 0;
                            ScoreSubmission.requestedScreenId = -1;
                            ProxySocketConnector.gameplayOriginScreenId = 0;
                            if (clientControlFlowGuard != 0) {
                              super.handleMenuKey(itemIndex, -100);
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  this.pointerInteractionActive = true;
                  if (null != UiWidget.gameplaySession) {
                    UiWidget.gameplaySession.submitScore((byte) -70);
                  }
                  UiWidget.gameplayReturnScreenId = 0;
                  ScoreSubmission.requestedScreenId = -1;
                  ProxySocketConnector.gameplayOriginScreenId = 0;
                  if (clientControlFlowGuard != 0) {
                    super.handleMenuKey(itemIndex, -100);
                  }
                }
              }
            } else {
              super.handleMenuKey(itemIndex, -100);
            }
          }
          if (methodGuard > -26) {
            this.updateTransition(59);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          menuKeyFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) menuKeyFailure), "c.M(" + itemIndex + ',' + methodGuard + ')');
        }
    }

    private final void drawScrollingMenuBackground(boolean setTutorialOffsetGuard) {
        int tileOriginYOrForegroundStartX = 0;
        RuntimeException caughtFailure = null;
        int backgroundTileX = 0;
        RuntimeException backgroundFailure = null;
        int backgroundTileY = 0;
        int clientControlFlowGuard = 0;
        int foregroundTileX;
        int foregroundTileY;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (setTutorialOffsetGuard) {
            this.tutorialSlideOffset = 124;
          }
          this.backgroundScrollX = this.backgroundScrollX % WidgetContainer.menuBackgroundSprite.fullWidth;
          this.backgroundScrollY = this.backgroundScrollY % WidgetContainer.menuBackgroundSprite.fullHeight;
          backgroundTileX = -WidgetContainer.menuBackgroundSprite.fullWidth + this.backgroundScrollX;
          backgroundTileColumns: while (true) {
            if (640 > backgroundTileX) {
              tileOriginYOrForegroundStartX = WidgetContainer.menuBackgroundSprite.fullHeight + this.backgroundScrollY + 480;
              if (clientControlFlowGuard != 0) {
                break backgroundTileColumns;
              }
              backgroundTileY = tileOriginYOrForegroundStartX;
              while (-WidgetContainer.menuBackgroundSprite.fullHeight <= backgroundTileY) {
                WidgetContainer.menuBackgroundSprite.drawUnmasked(backgroundTileX, backgroundTileY);
                backgroundTileY = backgroundTileY - WidgetContainer.menuBackgroundSprite.fullHeight;
              }
              backgroundTileX = backgroundTileX + WidgetContainer.menuBackgroundSprite.fullWidth;
              continue backgroundTileColumns;
            }
            this.foregroundScrollY = this.foregroundScrollY % CachedTextLayout.menuForegroundSprite.fullHeight;
            this.foregroundScrollX = this.foregroundScrollX % CachedTextLayout.menuForegroundSprite.fullWidth;
            tileOriginYOrForegroundStartX = this.foregroundScrollX + (CachedTextLayout.menuForegroundSprite.fullWidth + 640);
            break;
          }
          foregroundTileX = tileOriginYOrForegroundStartX;
          while (-CachedTextLayout.menuForegroundSprite.fullWidth <= foregroundTileX) {
            if (clientControlFlowGuard != 0) {
              return;
            }
            foregroundTileY = this.foregroundScrollY + CachedTextLayout.menuForegroundSprite.fullHeight + 480;
            while (foregroundTileY >= -CachedTextLayout.menuForegroundSprite.fullHeight) {
              CachedTextLayout.menuForegroundSprite.draw(foregroundTileX, foregroundTileY);
              foregroundTileY = foregroundTileY - CachedTextLayout.menuForegroundSprite.fullHeight;
            }
            foregroundTileX = foregroundTileX - CachedTextLayout.menuForegroundSprite.fullWidth;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          backgroundFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) backgroundFailure), "c.I(" + setTutorialOffsetGuard + ')');
        }
    }

    private final void advanceMenuPressAnimation(byte methodGuard) {
        int clientControlFlowGuard = 0;
        RuntimeException caughtFailure = null;
        RuntimeException pressAnimationFailure = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (!this.menuPressAnimationActive) {
            if (this.menuPressOffset < 0) {
              this.menuPressOffset = this.menuPressOffset + 1;
              if (clientControlFlowGuard != 0) {
                if (-4 >= this.menuPressOffset) {
                  this.menuPressAnimationActive = false;
                  this.menuPressOffset = this.menuPressOffset - 1;
                } else {
                  this.menuPressOffset = this.menuPressOffset - 1;
                }
              }
            }
          } else {
            if (-4 >= this.menuPressOffset) {
              this.menuPressAnimationActive = false;
              if (clientControlFlowGuard != 0) {
                this.menuPressOffset = this.menuPressOffset - 1;
              }
            } else {
              this.menuPressOffset = this.menuPressOffset - 1;
            }
          }
          if (methodGuard >= -11) {
            this.gameApplet = (Geoblox) null;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          pressAnimationFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pressAnimationFailure), "c.Q(" + methodGuard + ')');
        }
    }

    final void renderScreen(int methodGuard) {
        int membershipOverlayAlpha = 0;
        int unavailableOverlayAlpha = 0;
        int acceptanceOverlayAlpha = 0;
        int fallbackOverlayAlpha = 0;
        RuntimeException caughtFailure = null;
        int unusedPanelHeightSnapshot = 0;
        RuntimeException renderFailure = null;
        int panelTop = 0;
        int panelWidth = 0;
        int panelLeft = 0;
        int membershipMessageTop = 0;
        int membershipDialogButtonWidth = 0;
        String acceptancePromptText = null;
        int membershipCloseButtonLeft = 0;
        String acceptanceCountdownText = null;
        int membershipCloseButtonTextCenter = 0;
        int cancelButtonLeft = 0;
        int cancelButtonTextCenter = 0;
        int clientControlFlowGuard = 0;
        int screenPanelHeight;
        int loginTextY;
        int unavailableTextYOrButtonTop;
        int nonmemberMessageTop;
        int nonmemberCloseButtonTop;
        int unavailableCloseButtonWidth;
        int nonmemberCloseButtonWidth;
        int unavailableCloseButtonLeft;
        int nonmemberCloseButtonLeft;
        int unavailableCloseButtonTextCenter;
        int nonmemberCloseButtonTextCenter;
        int acceptButtonLeft;
        int acceptButtonTextCenter;
        int membershipCloseButtonTop;
        int membershipMembersButtonTop;
        int membershipMembersButtonLeft;
        int membershipMembersButtonTextCenter;
        int fullscreenOverlayAlpha;
        int tutorialCurtainX;
        int acceptanceTextYOrButtonTop;
        int acceptanceButtonWidth;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != -28750) {
            return;
          }
          this.drawScrollingMenuBackground(false);
          unusedPanelHeightSnapshot = 270;
          panelTop = 140;
          panelWidth = 400;
          if (this.screenId != 0 &&
              this.screenId != 1 &&
              this.screenId != 4) {
            screenPanelHeight = (2 == this.screenId) && (clientControlFlowGuard == 0) ? (235) : (285);
            panelLeft = 120;
            if (this.screenId == 3) {
              panelLeft += 10;
              if (clientControlFlowGuard != 0) {
                if (this.screenId == 8 ||
                    this.screenId == 7) {
                  panelWidth += 20;
                  panelLeft -= 10;
                }
              }
            } else {
              if (this.screenId == 8 ||
                  this.screenId == 7) {
                panelWidth += 20;
                panelLeft -= 10;
              }
            }
            DelayedIncomingPacket.drawNineSlicePanel(panelTop, panelLeft, screenPanelHeight, (byte) -92, panelWidth, GameGraphicsResources.frameNineSliceSprites);
          }
          if (!this.tutorialSlideActive) {
            super.renderScreen(methodGuard + 0);
          }
          if (this.screenId != 2 &&
              this.screenId != 8) {
            if (5 == this.screenId ||
                  7 == this.screenId) {
              AudioService.screenTitleSprites[4].draw(0, 20);
              TextInputRenderer.renderAchievementDetails(false, false, (byte) -93);
              if (clientControlFlowGuard == 0) {
                return;
              }
            }
            if (this.screenId != 6) {
              if (this.screenId == 4) {
                AudioService.screenTitleSprites[8].draw(0, 20);
                DelayedIncomingPacket.drawNineSlicePanel(panelTop + 10, 120, 100, (byte) -92, panelWidth, GameGraphicsResources.frameNineSliceSprites);
                loginTextY = 184;
                FadingDialog.uiPaletteFont.drawCenteredText(Geoblox.loginMessage, 320, loginTextY, 0, -1);
                loginTextY = 185;
                IntrusiveNodeHashTable.smallFont.drawParagraph(AccountCreationDialog.notLoggedInText, 130, loginTextY, 380, 300, 0, -1, 1, 0, 14);
                DelayedIncomingPacket.drawNineSlicePanel(320, 120, 60, (byte) -92, panelWidth, GameGraphicsResources.frameNineSliceSprites);
                IntrusiveNodeHashTable.smallFont.drawParagraph(ProxyAuthenticationRequiredException.discardResultsWarningText, 130, 330, 380, 300, 0, -1, 1, 0, 14);
                if (clientControlFlowGuard == 0) {
                  return;
                }
              }
              if (this.screenId != 3) {
                AudioService.screenTitleSprites[0].draw(0, 20);
                if (this.screenId != 0 &&
                    this.screenId != 1) {
                  return;
                }
                if (!this.fullscreenDialogActive) {
                  return;
                }
                if (UnderlinedButtonRenderer.isGuestSessionMode(-93)) {
                  if (this.activeTicks <= 200) {
                    membershipOverlayAlpha = this.activeTicks;
                  } else {
                    membershipOverlayAlpha = 200;
                  }
                  fullscreenOverlayAlpha = membershipOverlayAlpha;
                  SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, fullscreenOverlayAlpha);
                  DelayedIncomingPacket.drawNineSlicePanel(160, 150, 80, (byte) -92, 340, GameGraphicsResources.frameNineSliceSprites);
                  membershipMessageTop = 170;
                  IntrusiveNodeHashTable.smallFont.drawParagraph(SessionTextHistorySupport.fullscreenNonmemberText, 160, membershipMessageTop, 320, 300, 0, -1, 1, 0, 16);
                  membershipDialogButtonWidth = 100;
                  membershipCloseButtonLeft = -(20 + membershipDialogButtonWidth >> 1) + 410;
                  membershipCloseButtonTop = 265;
                  membershipCloseButtonTextCenter = membershipCloseButtonLeft - (-(membershipDialogButtonWidth >> 1) - 10);
                  DelayedIncomingPacket.drawNineSlicePanel(membershipCloseButtonTop, membershipCloseButtonLeft, 36, (byte) -92, 20 + membershipDialogButtonWidth, ArchiveLoadSequence.mouseBoxFrames);
                  if (1 == this.fullscreenDialogButtonIndex ||
                      this.fullscreenDialogButtonIndex < 0 &&
                        !(350 >= PrefixCodeDecoder.pointerXSnapshot) &&
                        !(PrefixCodeDecoder.pointerXSnapshot >= 470) &&
                        !(PcmResampler.pointerYSnapshot <= 265) &&
                        !(PcmResampler.pointerYSnapshot >= 299)) {
                    FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 15488514;
                  }
                  FadingDialog.uiPaletteFont.drawCenteredText(UiFontResources.fullscreenCloseButtonText, membershipCloseButtonTextCenter, 30 + membershipCloseButtonTop, 0, -1);
                  membershipMembersButtonLeft = 320 - (20 + membershipDialogButtonWidth >> 1) - 90;
                  FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 16689938;
                  membershipMembersButtonTop = 265;
                  membershipMembersButtonTextCenter = 10 + (membershipDialogButtonWidth >> 1) + membershipMembersButtonLeft;
                  DelayedIncomingPacket.drawNineSlicePanel(membershipMembersButtonTop, membershipMembersButtonLeft, 36, (byte) -92, membershipDialogButtonWidth + 20, ArchiveLoadSequence.mouseBoxFrames);
                  if (this.fullscreenDialogButtonIndex == 0 ||
                      0 > this.fullscreenDialogButtonIndex &&
                        !(170 >= PrefixCodeDecoder.pointerXSnapshot) &&
                        !(PrefixCodeDecoder.pointerXSnapshot >= 290) &&
                        !(PcmResampler.pointerYSnapshot <= 265) &&
                        !(PcmResampler.pointerYSnapshot >= 299)) {
                    FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 15488514;
                  }
                  FadingDialog.uiPaletteFont.drawCenteredText(DialWidget.fullscreenMembersButtonText, membershipMembersButtonTextCenter, 30 + membershipMembersButtonTop, 0, -1);
                  FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 16689938;
                  if (clientControlFlowGuard == 0) {
                    return;
                  }
                }
                if (TextTemplateDefinition.loginMembershipGateValue > 0) {
                  if (InstrumentPatch.activeFullscreenCanvas == null) {
                    if (this.activeTicks > 200) {
                      unavailableOverlayAlpha = 200;
                    } else {
                      unavailableOverlayAlpha = this.activeTicks;
                    }
                    fullscreenOverlayAlpha = unavailableOverlayAlpha;
                    SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, fullscreenOverlayAlpha);
                    DelayedIncomingPacket.drawNineSlicePanel(160, 160, 95, (byte) -92, 320, GameGraphicsResources.frameNineSliceSprites);
                    unavailableTextYOrButtonTop = 170;
                    unavailableTextYOrButtonTop = unavailableTextYOrButtonTop + 16 * IntrusiveNodeHashTable.smallFont.drawParagraph(GrowableIntList.fullscreenUnavailableText, 170, unavailableTextYOrButtonTop, 300, 300, 0, -1, 1, 0, 16);
                    unavailableTextYOrButtonTop += 40;
                    unavailableCloseButtonWidth = 100;
                    unavailableCloseButtonLeft = 320 - (unavailableCloseButtonWidth + 20 >> 1);
                    unavailableCloseButtonTextCenter = (unavailableCloseButtonWidth >> 1) + (unavailableCloseButtonLeft + 10);
                    DelayedIncomingPacket.drawNineSlicePanel(unavailableTextYOrButtonTop, unavailableCloseButtonLeft, 36, (byte) -92, 20 + unavailableCloseButtonWidth, ArchiveLoadSequence.mouseBoxFrames);
                    if (0 == this.fullscreenDialogButtonIndex ||
                        !(260 >= PrefixCodeDecoder.pointerXSnapshot) &&
                          !(PrefixCodeDecoder.pointerXSnapshot >= 380) &&
                          !(PcmResampler.pointerYSnapshot <= 274) &&
                          !(PcmResampler.pointerYSnapshot >= 309)) {
                      FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 15488514;
                    }
                    FadingDialog.uiPaletteFont.drawCenteredText(UiFontResources.fullscreenCloseButtonText, unavailableCloseButtonTextCenter, 30 + unavailableTextYOrButtonTop, 0, -1);
                    FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 16689938;
                    if (clientControlFlowGuard == 0) {
                      return;
                    }
                  }
                  if (this.activeTicks <= 200) {
                    acceptanceOverlayAlpha = this.activeTicks;
                  } else {
                    acceptanceOverlayAlpha = 200;
                  }
                  fullscreenOverlayAlpha = acceptanceOverlayAlpha;
                  SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, fullscreenOverlayAlpha);
                  DelayedIncomingPacket.drawNineSlicePanel(160, 160, 140, (byte) -92, 320, GameGraphicsResources.frameNineSliceSprites);
                  acceptanceTextYOrButtonTop = 170;
                  acceptancePromptText = PcmResampler.fullscreenBeforeAcceptText + " " + ArchiveRequest.fullscreenAcceptButtonText + " " + OpacityWidget.fullscreenAfterAcceptText + " " + FontLoadingSupport.fullscreenCancelButtonText + " " + FullscreenFailureReason.fullscreenAfterCancelText;
                  acceptanceTextYOrButtonTop = acceptanceTextYOrButtonTop + 16 * IntrusiveNodeHashTable.smallFont.drawParagraph(acceptancePromptText, 170, acceptanceTextYOrButtonTop, 300, 300, 0, -1, 1, 0, 16);
                  acceptanceTextYOrButtonTop += 10;
                  acceptanceCountdownText = Integer.toString((1500 - this.activeTicks) / 150 + 1);
                  if ((1500 - this.activeTicks) / 150 <= 0) {
                    acceptanceTextYOrButtonTop = acceptanceTextYOrButtonTop + IntrusiveNodeHashTable.smallFont.drawParagraph(OpacityWidget.replaceIndexedTextMarkers(TextConcatenationSupport.fullscreenAcceptCountdownSingularText, new String[]{acceptanceCountdownText}, (byte) -51), 170, acceptanceTextYOrButtonTop, 300, 300, 0, -1, 1, 0, 16) * 16;
                    if (clientControlFlowGuard != 0) {
                      acceptanceTextYOrButtonTop = acceptanceTextYOrButtonTop + IntrusiveNodeHashTable.smallFont.drawParagraph(OpacityWidget.replaceIndexedTextMarkers(FullscreenSupport.fullscreenAcceptCountdownPluralText, new String[]{acceptanceCountdownText}, (byte) -45), 170, acceptanceTextYOrButtonTop, 300, 300, 0, -1, 1, 0, 16) * 16;
                    }
                  } else {
                    acceptanceTextYOrButtonTop = acceptanceTextYOrButtonTop + IntrusiveNodeHashTable.smallFont.drawParagraph(OpacityWidget.replaceIndexedTextMarkers(FullscreenSupport.fullscreenAcceptCountdownPluralText, new String[]{acceptanceCountdownText}, (byte) -45), 170, acceptanceTextYOrButtonTop, 300, 300, 0, -1, 1, 0, 16) * 16;
                  }
                  acceptanceTextYOrButtonTop += 40;
                  acceptanceButtonWidth = 100;
                  cancelButtonLeft = -(20 + acceptanceButtonWidth >> 1) + 320 + 90;
                  DelayedIncomingPacket.drawNineSlicePanel(acceptanceTextYOrButtonTop, cancelButtonLeft, 36, (byte) -92, acceptanceButtonWidth + 20, ArchiveLoadSequence.mouseBoxFrames);
                  cancelButtonTextCenter = 10 + ((acceptanceButtonWidth >> 1) + cancelButtonLeft);
                  if (this.fullscreenDialogButtonIndex == 1 ||
                      0 > this.fullscreenDialogButtonIndex &&
                        !(PrefixCodeDecoder.pointerXSnapshot <= 350) &&
                        !(PrefixCodeDecoder.pointerXSnapshot >= 470) &&
                        !(PcmResampler.pointerYSnapshot <= 317) &&
                        !(PcmResampler.pointerYSnapshot >= 352)) {
                    FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 15488514;
                  }
                  FadingDialog.uiPaletteFont.drawCenteredText(FontLoadingSupport.fullscreenCancelButtonText, cancelButtonTextCenter, 30 + acceptanceTextYOrButtonTop, 0, -1);
                  FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 16689938;
                  acceptButtonLeft = 320 - (20 + acceptanceButtonWidth >> 1) - 90;
                  acceptButtonTextCenter = 10 + (acceptanceButtonWidth >> 1) + acceptButtonLeft;
                  DelayedIncomingPacket.drawNineSlicePanel(acceptanceTextYOrButtonTop, acceptButtonLeft, 36, (byte) -92, 20 + acceptanceButtonWidth, ArchiveLoadSequence.mouseBoxFrames);
                  if (this.fullscreenDialogButtonIndex == 0 ||
                      this.fullscreenDialogButtonIndex < 0 &&
                        !(PrefixCodeDecoder.pointerXSnapshot <= 170) &&
                        !(PrefixCodeDecoder.pointerXSnapshot >= 290) &&
                        !(PcmResampler.pointerYSnapshot <= 317) &&
                        !(PcmResampler.pointerYSnapshot >= 352)) {
                    FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 15488514;
                  }
                  FadingDialog.uiPaletteFont.drawCenteredText(ArchiveRequest.fullscreenAcceptButtonText, acceptButtonTextCenter, 30 + acceptanceTextYOrButtonTop, 0, -1);
                  FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 16689938;
                  if (clientControlFlowGuard == 0) {
                    return;
                  }
                }
                if (this.activeTicks > 200) {
                  fallbackOverlayAlpha = 200;
                } else {
                  fallbackOverlayAlpha = this.activeTicks;
                }
                fullscreenOverlayAlpha = fallbackOverlayAlpha;
                SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, fullscreenOverlayAlpha);
                DelayedIncomingPacket.drawNineSlicePanel(170, 160, 80, (byte) -92, 320, GameGraphicsResources.frameNineSliceSprites);
                nonmemberMessageTop = 180;
                IntrusiveNodeHashTable.smallFont.drawParagraph(SessionTextHistorySupport.fullscreenNonmemberText, 170, nonmemberMessageTop, 300, 300, 0, -1, 1, 0, 16);
                nonmemberCloseButtonWidth = 242;
                nonmemberCloseButtonLeft = 320 - (nonmemberCloseButtonWidth + 20 >> 1);
                nonmemberCloseButtonTextCenter = 10 + (nonmemberCloseButtonLeft + (nonmemberCloseButtonWidth >> 1));
                nonmemberCloseButtonTop = 265;
                DelayedIncomingPacket.drawNineSlicePanel(nonmemberCloseButtonTop, nonmemberCloseButtonLeft, 36, (byte) -92, nonmemberCloseButtonWidth + 20, ArchiveLoadSequence.mouseBoxFrames);
                if (this.fullscreenDialogButtonIndex == 0 ||
                    !(PrefixCodeDecoder.pointerXSnapshot <= 190) &&
                      !(PrefixCodeDecoder.pointerXSnapshot >= 449) &&
                      !(PcmResampler.pointerYSnapshot <= 265) &&
                      !(299 <= PcmResampler.pointerYSnapshot)) {
                  FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 15488514;
                }
                FadingDialog.uiPaletteFont.drawCenteredText(UiFontResources.fullscreenCloseButtonText, nonmemberCloseButtonTextCenter, 30 + nonmemberCloseButtonTop, 0, -1);
                FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 16689938;
                if (clientControlFlowGuard == 0) {
                  return;
                }
              }
              AudioService.screenTitleSprites[5].draw(0, 20);
              if (!this.tutorialSlideActive) {
                this.renderTutorialPage(-97, this.tutorialPageIndex);
                if (clientControlFlowGuard == 0) {
                  return;
                }
              }
              tutorialSlideRendering: {
                tutorialCurtainX = this.tutorialSlideOffset;
                if (!this.tutorialSlideForward) {
                  tutorialCurtainX = 640 - tutorialCurtainX;
                  SoftwareRasterizer.setClip(0, 0, tutorialCurtainX, 480);
                  this.renderTutorialPage(-85, this.previousTutorialPageIndex);
                  this.renderingPreviousTutorialPage = true;
                  super.renderScreen(-28750);
                  this.renderingPreviousTutorialPage = false;
                  SoftwareRasterizer.setClip(tutorialCurtainX, 0, 640, 480);
                  this.renderTutorialPage(methodGuard ^ 28757, this.tutorialPageIndex);
                  super.renderScreen(-28750);
                  SoftwareRasterizer.setClip(0, 0, 640, 480);
                  CharacterReplacementSupport.transitionCurtain.drawRotatedCentered((CharacterReplacementSupport.transitionCurtain.fullHeight >> 1) + tutorialCurtainX, 240, -49150, 4096);
                  if (clientControlFlowGuard == 0) {
                    break tutorialSlideRendering;
                  }
                }
                SoftwareRasterizer.setClip(tutorialCurtainX, 0, 640, 480);
                this.renderTutorialPage(-17, this.previousTutorialPageIndex);
                this.renderingPreviousTutorialPage = true;
                super.renderScreen(-28750);
                this.renderingPreviousTutorialPage = false;
                SoftwareRasterizer.setClip(0, 0, tutorialCurtainX, 480);
                this.renderTutorialPage(-48, this.tutorialPageIndex);
                super.renderScreen(-28750);
                SoftwareRasterizer.setClip(0, 0, 640, 480);
                CharacterReplacementSupport.transitionCurtain.drawRotatedCentered(-(CharacterReplacementSupport.transitionCurtain.fullHeight >> 1) + tutorialCurtainX, 240, -16383, 4096);
              }
              if (clientControlFlowGuard == 0) {
                return;
              }
            }
            AudioService.screenTitleSprites[7].draw(0, 20);
            TextInputRenderer.renderAchievementDetails(false, true, (byte) -122);
            if (clientControlFlowGuard == 0) {
              return;
            }
          }
          this.renderHighscoreList(30);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          renderFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) renderFailure), "c.T(" + methodGuard + ')');
        }
    }

    final void decreaseMenuValue(int itemIndex, byte methodGuard) {
        RuntimeException volumeChangeFailure = null;
        int guardRemainder = 0;
        int actionId = 0;
        int clientControlFlowGuard = 0;
        RuntimeException caughtFailure = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          guardRemainder = 121 % ((44 - methodGuard) / 36);
          actionId = InstrumentEnvelope.menuActionIds[this.screenId][itemIndex];
          if (actionId == 8 &&
              clientControlFlowGuard == 0) {
            if (SocialListEntry.soundEffectVolume > 10) {
              SocialListEntry.soundEffectVolume = SocialListEntry.soundEffectVolume - 10;
              return;
            }
            SocialListEntry.soundEffectVolume = 0;
            return;
          } else {
            if (9 != actionId) {
              return;
            }
          }
          if (SpriteCheckboxRenderer.gameMusicVolumeLevel > 10) {
            AsyncResourceDownloader.setGameMusicVolume(-15346, SpriteCheckboxRenderer.gameMusicVolumeLevel - 10);
            if (clientControlFlowGuard == 0) {
              return;
            }
          }
          AsyncResourceDownloader.setGameMusicVolume(-15346, 0);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          volumeChangeFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) volumeChangeFailure), "c.N(" + itemIndex + ',' + methodGuard + ')');
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        try {
            quickChatShortcutHelpTexts = null;
            errorReportApplet = null;
            createNameLeadingSpaceAlertText = null;
            if (methodGuard != 28) {
                GameScreen.decodeNonzeroTextByte(79, (byte) -113);
            }
        } catch (RuntimeException caughtFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) caughtFailure), "c.S(" + methodGuard + ')');
        }
    }

    private final void skipUnavailableTutorialItemsForward(byte methodGuard) {
        RuntimeException caughtFailure = null;
        RuntimeException selectionFailure = null;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard >= -40) {
            this.renderTutorialPage(77, -13);
          }
          if (3 == this.screenId &&
              !this.tutorialSlideActive) {
            if (this.tutorialPageIndex == 4 ||
                  this.selectedItemIndex != 3) {
              if (4 == this.tutorialPageIndex) {
                if (this.selectedItemIndex == 2) {
                  this.selectedItemIndex = 3;
                }
                if (SpriteCheckboxRenderer.previousMenuScreenId != 1) {
                  return;
                }
                if (this.selectedItemIndex != 3) {
                  return;
                }
                this.selectedItemIndex = 0;
                if (clientControlFlowGuard == 0) {
                  return;
                }
              }
              if (this.tutorialPageIndex != 0) {
                return;
              }
              if (this.selectedItemIndex != 0) {
                return;
              }
              this.selectedItemIndex = 1;
              if (clientControlFlowGuard == 0) {
                return;
              }
            }
            this.selectedItemIndex = 0;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          selectionFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) selectionFailure), "c.C(" + methodGuard + ')');
        }
    }

    final int hitTestMenuItem(int pointerX, int pointerY, byte methodGuard) {
        int wrongGuardResult = 0;
        int horizontalMissResult = 0;
        int inheritedHitResult = 0;
        int singleFooterItemResult = 0;
        int pairedFooterLeftItemResult = 0;
        int pairedFooterRightItemResult = 0;
        int loginUpperItemResult = 0;
        int loginLowerItemResult = 0;
        int shiftedFooterLeftItemResult = 0;
        int shiftedFooterRightItemResult = 0;
        int scoreMiddleItemResult = 0;
        int scoreRightItemResult = 0;
        int scoreLeftItemResult = 0;
        int scoreBottomItemResult = 0;
        int tutorialBackItemResult = 0;
        int tutorialMiddleItemResult = 0;
        int tutorialNextItemResult = 0;
        int tutorialFinalItemResult = 0;
        int nonMainScreenMissResult = 0;
        RuntimeException caughtFailure = null;
        RuntimeException hitTestFailure = null;
        try {
          if (methodGuard < 20) {
            wrongGuardResult = -109;
            return wrongGuardResult;
          }
          if (0 != this.screenId &&
              this.screenId != 1) {
            nonMainMenuHitTest: {
              if (this.screenId == 3) {
                if (pointerY > 430 &&
                    pointerY < 470) {
                  if (this.tutorialPageIndex != 0 &&
                      pointerX > 130 &&
                      pointerX < 253) {
                    tutorialBackItemResult = 0;
                    return tutorialBackItemResult;
                  }
                  if (pointerX > 268 &&
                      391 > pointerX) {
                    tutorialMiddleItemResult = 1;
                    return tutorialMiddleItemResult;
                  }
                  if (this.tutorialPageIndex != 4 &&
                      pointerX > 406 &&
                      pointerX < 529) {
                    tutorialNextItemResult = 2;
                    return tutorialNextItemResult;
                  }
                  if (this.tutorialPageIndex == 4 &&
                      SpriteCheckboxRenderer.previousMenuScreenId != 1 &&
                      pointerX > 406 &&
                      pointerX < 635) {
                    tutorialFinalItemResult = 3;
                    return tutorialFinalItemResult;
                  }
                }
              } else {
                if (this.screenId != 5) {
                  if (this.screenId != 7 &&
                      this.screenId != 8) {
                    if (2 == this.screenId) {
                      if (pointerY > 380 &&
                          pointerY < 420) {
                        if (pointerX > 61 &&
                            220 > pointerX) {
                          scoreLeftItemResult = 0;
                          return scoreLeftItemResult;
                        }
                        if (241 < pointerX &&
                            pointerX < 400) {
                          scoreMiddleItemResult = 1;
                          return scoreMiddleItemResult;
                        }
                        if (pointerX <= 420) {
                          break nonMainMenuHitTest;
                        }
                        if (pointerX >= 579) {
                          break nonMainMenuHitTest;
                        }
                        scoreRightItemResult = 2;
                        return scoreRightItemResult;
                      }
                      if (pointerY <= 430) {
                        break nonMainMenuHitTest;
                      }
                      if (pointerY >= 470) {
                        break nonMainMenuHitTest;
                      }
                      if (pointerX <= 279) {
                        break nonMainMenuHitTest;
                      }
                      if (pointerX >= 362) {
                        break nonMainMenuHitTest;
                      }
                      scoreBottomItemResult = 3;
                      return scoreBottomItemResult;
                    }
                    if (this.screenId == 4) {
                      if (pointerX <= 171) {
                        break nonMainMenuHitTest;
                      }
                      if (pointerX >= 469) {
                        break nonMainMenuHitTest;
                      }
                      if (265 < pointerY &&
                          pointerY < 301) {
                        loginUpperItemResult = 0;
                        return loginUpperItemResult;
                      }
                      if (pointerY <= 395) {
                        break nonMainMenuHitTest;
                      }
                      if (431 <= pointerY) {
                        break nonMainMenuHitTest;
                      }
                      loginLowerItemResult = 1;
                      return loginLowerItemResult;
                    }
                    if (6 != this.screenId) {
                      break nonMainMenuHitTest;
                    }
                    if (pointerY <= 430) {
                      break nonMainMenuHitTest;
                    }
                    if (470 <= pointerY) {
                      break nonMainMenuHitTest;
                    }
                    if (pointerX > 146 &&
                        pointerX < 306) {
                      shiftedFooterLeftItemResult = 0;
                      return shiftedFooterLeftItemResult;
                    }
                    if (pointerX <= 326) {
                      break nonMainMenuHitTest;
                    }
                    if (pointerX >= 486) {
                      break nonMainMenuHitTest;
                    }
                    shiftedFooterRightItemResult = 1;
                    return shiftedFooterRightItemResult;
                  }
                  if (pointerY > 437 &&
                      pointerY < 473) {
                    if (pointerX > 121 &&
                        356 > pointerX) {
                      pairedFooterLeftItemResult = 0;
                      return pairedFooterLeftItemResult;
                    }
                    if (436 < pointerX &&
                        pointerY < 518) {
                      pairedFooterRightItemResult = 1;
                      return pairedFooterRightItemResult;
                    }
                  }
                } else {
                  if (pointerY > 435 &&
                      470 > pointerY &&
                      pointerX > 279 &&
                      361 > pointerX) {
                    singleFooterItemResult = 0;
                    return singleFooterItemResult;
                  }
                }
              }
            }
            nonMainScreenMissResult = -1;
            return nonMainScreenMissResult;
          }
          if (pointerX >= 149 &&
              490 >= pointerX) {
            inheritedHitResult = super.hitTestMenuItem(pointerX, pointerY, (byte) 127);
            return inheritedHitResult;
          }
          horizontalMissResult = -1;
          return horizontalMissResult;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          hitTestFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) hitTestFailure), "c.P(" + pointerX + ',' + pointerY + ',' + methodGuard + ')');
        }
    }

    private final void renderHighscoreList(int methodGuard) {
        Object nullEntryOrSessionSentinel = null;
        RuntimeException caughtFailure = null;
        String highscoreStatusText = null;
        int hasDisplayedEntryFlag = 0;
        RuntimeException highscoreRenderFailure = null;
        int statusTextY = 0;
        String[] categoryNames = null;
        MonochromeBitmapFont scoreFont = null;
        int[] categoryScores = null;
        String noHighscoresMessage = null;
        int entryTextY = 0;
        int currentScoreHighlightedFlag = 0;
        int entryIndex = 0;
        String unlistedCurrentScoreText = null;
        String entryName = null;
        int clientControlFlowGuard = 0;
        String friendTipText;
        int noHighscoresMessageY;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (FifoResponseToken.activeHighscoreQuery == null &&
              !UnderlinedButtonRenderer.isGuestSessionMode(-115)) {
            FifoResponseToken.activeHighscoreQuery = DialWidget.getOrRequestHighscores(22, 1, 0, 10, 3);
          }
          if (0 != ClientOptionSupport.selectedHighscoreView) {
            if (ClientOptionSupport.selectedHighscoreView != 2) {
              if (ClientOptionSupport.selectedHighscoreView == 1) {
                AudioService.screenTitleSprites[3].draw(0, 20);
                if (clientControlFlowGuard != 0) {
                  AudioService.screenTitleSprites[2].draw(0, 20);
                  AudioService.screenTitleSprites[1].draw(0, 20);
                }
              }
            } else {
              AudioService.screenTitleSprites[2].draw(0, 20);
              if (clientControlFlowGuard != 0) {
                AudioService.screenTitleSprites[1].draw(0, 20);
              }
            }
          } else {
            AudioService.screenTitleSprites[1].draw(0, 20);
          }
          if (methodGuard != 30) {
            this.updateTransition(-78);
          }
          highscoreEntriesAndStatus: {
            if (null != FifoResponseToken.activeHighscoreQuery &&
                null != FifoResponseToken.activeHighscoreQuery.namesByView) {
              if (!FifoResponseToken.activeHighscoreQuery.completed) {
                highscoreStatusText = ArchiveLoadSequence.fetchingHighscoresText;
                statusTextY = 76 + (150 + FadingDialog.uiPaletteFont.maxAscent);
                FadingDialog.uiPaletteFont.drawCenteredText(highscoreStatusText, 322, statusTextY, 0, -1);
                if (clientControlFlowGuard == 0) {
                  break highscoreEntriesAndStatus;
                }
              }
              hasDisplayedEntryFlag = 0;
              categoryNames = FifoResponseToken.activeHighscoreQuery.namesByView[ClientOptionSupport.selectedHighscoreView];
              scoreFont = IntrusiveNodeHashTable.smallFont;
              if (categoryNames != null) {
                categoryScores = FifoResponseToken.activeHighscoreQuery.valuesByView[ClientOptionSupport.selectedHighscoreView];
                entryTextY = scoreFont.maxAscent + 150;
                currentScoreHighlightedFlag = 0;
                entryIndex = 0;
                while (true) {
                  if (entryIndex < 10) {
                    nullEntryOrSessionSentinel = null;
                    if (clientControlFlowGuard == 0) {
                      if (nullEntryOrSessionSentinel != categoryNames[entryIndex]) {
                        hasDisplayedEntryFlag = 1;
                        entryName = categoryNames[entryIndex];
                        if (currentScoreHighlightedFlag == 0 &&
                            null != UiWidget.gameplaySession &&
                            categoryScores[entryIndex] == Math.abs(UiWidget.gameplaySession.score) &&
                            WhirlpoolHash.matchesNormalizedSessionName(entryName, (byte) 12)) {
                          currentScoreHighlightedFlag = 1;
                          scoreFont.drawRightAlignedText(1 + entryIndex + ". ", 165, entryTextY, 16610816, -1);
                          scoreFont.drawText(entryName, 165, entryTextY, 16610816, -1);
                          scoreFont.drawRightAlignedText(Integer.toString(categoryScores[entryIndex]), 500, entryTextY, 16610816, -1);
                        } else {
                          scoreFont.drawRightAlignedText(1 + entryIndex + ". ", 165, entryTextY, 1, -1);
                          scoreFont.drawText(entryName, 165, entryTextY, 1, -1);
                          scoreFont.drawRightAlignedText(Integer.toString(categoryScores[entryIndex]), 500, entryTextY, 1, -1);
                        }
                      }
                      entryTextY += 15;
                      entryIndex++;
                      continue;
                    }
                  } else {
                    if (currentScoreHighlightedFlag != 0) {
                      break;
                    }
                    nullEntryOrSessionSentinel = null;
                  }
                  if (nullEntryOrSessionSentinel == UiWidget.gameplaySession) {
                    break;
                  }
                  if (UiWidget.gameplaySession.score == 0) {
                    break;
                  }
                  if (UiWidget.gameplaySession.score == -2147483648) {
                    break;
                  }
                  unlistedCurrentScoreText = SecondaryDeque.receivedSessionName;
                  scoreFont.drawText(unlistedCurrentScoreText, 165, entryTextY, 16724225, -1);
                  scoreFont.drawRightAlignedText(Integer.toString(Math.abs(UiWidget.gameplaySession.score)), 500, entryTextY, 16724225, -1);
                  break;
                }
              }
              if (hasDisplayedEntryFlag == 0) {
                noHighscoresMessage = ClientTimingSupport.noHighscoresText;
                noHighscoresMessageY = 76 + FadingDialog.uiPaletteFont.maxAscent + 150;
                FadingDialog.uiPaletteFont.drawCenteredText(noHighscoresMessage, 322, noHighscoresMessageY, 0, -1);
              }
              if (clientControlFlowGuard != 0) {
                if (!UnderlinedButtonRenderer.isGuestSessionMode(-89)) {
                  highscoreStatusText = PasswordValidator.serviceUnavailableText;
                  highscoreStatusText = ClientTimingSupport.noHighscoresText;
                } else {
                  highscoreStatusText = ClientTimingSupport.noHighscoresText;
                }
                statusTextY = 150 - (-FadingDialog.uiPaletteFont.maxAscent - 76);
                FadingDialog.uiPaletteFont.drawCenteredText(highscoreStatusText, 322, statusTextY, 0, -1);
                if (UnderlinedButtonRenderer.isGuestSessionMode(methodGuard - 147)) {
                  FadingDialog.uiPaletteFont.drawParagraph(MessageDialogContent.createToUseText, 125, 350, 395, 100, 0, -1, 1, 0, 26);
                }
              }
            } else {
              if (!UnderlinedButtonRenderer.isGuestSessionMode(-89)) {
                highscoreStatusText = PasswordValidator.serviceUnavailableText;
                if (clientControlFlowGuard != 0) {
                  highscoreStatusText = ClientTimingSupport.noHighscoresText;
                }
              } else {
                highscoreStatusText = ClientTimingSupport.noHighscoresText;
              }
              statusTextY = 150 - (-FadingDialog.uiPaletteFont.maxAscent - 76);
              FadingDialog.uiPaletteFont.drawCenteredText(highscoreStatusText, 322, statusTextY, 0, -1);
              if (UnderlinedButtonRenderer.isGuestSessionMode(methodGuard - 147)) {
                FadingDialog.uiPaletteFont.drawParagraph(MessageDialogContent.createToUseText, 125, 350, 395, 100, 0, -1, 1, 0, 26);
              }
            }
          }
          if (!UnderlinedButtonRenderer.isGuestSessionMode(methodGuard ^ -109)) {
            friendTipText = PcmResampler.highscoreFriendTipText;
            IntrusiveNodeHashTable.smallFont.drawParagraph(friendTipText, 140, 325, 360, 300, 0, -1, 1, 0, 16);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          highscoreRenderFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) highscoreRenderFailure), "c.U(" + methodGuard + ')');
        }
    }

    final void updateScreen(byte methodGuard) {
        int nextAnimationTickSnapshot = 0;
        int previousPointerPressCountdown = 0;
        RuntimeException caughtFailure = null;
        float colorInterpolationFraction = 0.0f;
        int inputDerivedStateBranch = 0;
        RuntimeException screenUpdateFailure = null;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          nextAnimationTickSnapshot = this.animationTick + 1;
          this.animationTick = this.animationTick + 1;
          if (nextAnimationTickSnapshot % 5 == 0) {
            this.backgroundScrollY = this.backgroundScrollY - 1;
            this.backgroundScrollX = this.backgroundScrollX + 1;
            this.advanceMenuPressAnimation((byte) -102);
          }
          if (3 == (this.animationTick & 3)) {
            this.foregroundScrollY = this.foregroundScrollY - 1;
            this.foregroundScrollX = this.foregroundScrollX - 1;
          }
          if (this.tutorialSlideActive) {
            this.advanceTutorialSlide((byte) 104);
            return;
          }
          FullscreenSupport.fullscreenDialogActiveSnapshot = this.fullscreenDialogActive;
          this.volumePreviewTicks = this.volumePreviewTicks + 1;
          this.activeTicks = this.activeTicks + 1;
          if (this.fullscreenDialogActive &&
              InstrumentPatch.activeFullscreenCanvas != null &&
              this.activeTicks > 1500) {
            ArchiveCatalog.exitFullscreenIfActive(255);
            this.fullscreenDialogActive = false;
          }
          do {
            if (!UiFontResources.pollKeyboardEvent(108)) {
              if (this.screenId == 3 &&
                  this.selectedItemIndex == 0 &&
                  this.tutorialPageIndex == 0 &&
                  !this.menuPressAnimationActive) {
                this.selectedItemIndex = this.selectedItemIndex + 1;
              }
              break;
            }
            this.handleScreenKey((byte) 62);
          } while (clientControlFlowGuard == 0);
          if (this.screenId == 3) {
            if (0 == (1 & this.animationTick)) {
              this.tutorialDemoTick = this.tutorialDemoTick + 1;
              this.tutorialOrbitRadius = -(this.tutorialDemoTick >> 1) + 60;
              if (this.tutorialOrbitRadius < 15) {
                this.tutorialOrbitRadius = 15;
                if (clientControlFlowGuard != 0) {
                  this.tutorialOrbitAngleRadians = this.tutorialOrbitAngleRadians + 0.1;
                }
              } else {
                this.tutorialOrbitAngleRadians = this.tutorialOrbitAngleRadians + 0.1;
              }
            }
            if (120 == this.tutorialDemoTick) {
              this.tutorialGeometryCategory = AchievementQuery.nextSpriteVariantIndex(7, 1);
              this.tutorialGeometryVariant = AchievementQuery.nextSpriteVariantIndex(7, 1);
              this.tutorialDemoTick = 0;
            }
            if (this.tutorialPageIndex < 4 &&
                this.animationTick % 24 == 0) {
              this.tutorialEffectFrame = this.tutorialEffectFrame + 1;
              if (this.tutorialEffectFrame >= 4) {
                this.tutorialEffectFrame = 0;
              }
            }
            tutorialThemeAnimation: {
              if (this.tutorialPageIndex != 3) {
                if (4 == this.tutorialPageIndex) {
                  if (49 > (this.animationTick & 255)) {
                    if ((15 & this.animationTick) != 0) {
                      break tutorialThemeAnimation;
                    }
                    this.tutorialEffectFrame = this.tutorialEffectFrame + 1;
                    if (this.tutorialEffectFrame >= 4) {
                      this.tutorialEffectFrame = 0;
                    }
                    this.tutorialStarFrameOrColorIndex = this.tutorialStarFrameOrColorIndex + 1;
                    if (4 > this.tutorialStarFrameOrColorIndex) {
                      break tutorialThemeAnimation;
                    }
                    this.tutorialStarFrameOrColorIndex = 0;
                    if (clientControlFlowGuard == 0) {
                      break tutorialThemeAnimation;
                    }
                  }
                  this.tutorialStarFrameOrColorIndex = 0;
                  this.tutorialEffectFrame = 0;
                  if (clientControlFlowGuard != 0) {
                    colorInterpolationFraction = 0.019999999552965164f * (float)(this.animationTick % 50);
                    this.tutorialTintRgb = ((int)(colorInterpolationFraction * (float)this.tutorialGreenDelta) << 8) + (SocketConnector.themeCycleColors[selectedThemeId][this.tutorialStarFrameOrColorIndex] + ((int)(colorInterpolationFraction * (float)this.tutorialRedDelta) << 16) + (int)((float)this.tutorialBlueDelta * colorInterpolationFraction));
                    if (this.animationTick % 50 == 49) {
                      this.tutorialStarFrameOrColorIndex = this.tutorialStarFrameOrColorIndex + 1;
                      this.tutorialStarFrameOrColorIndex = this.tutorialStarFrameOrColorIndex % 7;
                      this.tutorialRedDelta = -((16751678 & SocketConnector.themeCycleColors[selectedThemeId][this.tutorialStarFrameOrColorIndex]) >> 16) + ((SocketConnector.themeCycleColors[selectedThemeId][(1 + this.tutorialStarFrameOrColorIndex) % 7] & 16754682) >> 16);
                      this.tutorialGreenDelta = (255 & SocketConnector.themeCycleColors[selectedThemeId][(this.tutorialStarFrameOrColorIndex + 1) % 7] >> 8) - ((SocketConnector.themeCycleColors[selectedThemeId][this.tutorialStarFrameOrColorIndex] & 65438) >> 8);
                      this.tutorialBlueDelta = (255 & SocketConnector.themeCycleColors[selectedThemeId][(1 + this.tutorialStarFrameOrColorIndex) % 7]) - (255 & SocketConnector.themeCycleColors[selectedThemeId][this.tutorialStarFrameOrColorIndex]);
                    }
                  }
                }
              } else {
                colorInterpolationFraction = 0.019999999552965164f * (float)(this.animationTick % 50);
                this.tutorialTintRgb = ((int)(colorInterpolationFraction * (float)this.tutorialGreenDelta) << 8) + (SocketConnector.themeCycleColors[selectedThemeId][this.tutorialStarFrameOrColorIndex] + ((int)(colorInterpolationFraction * (float)this.tutorialRedDelta) << 16) + (int)((float)this.tutorialBlueDelta * colorInterpolationFraction));
                if (this.animationTick % 50 == 49) {
                  this.tutorialStarFrameOrColorIndex = this.tutorialStarFrameOrColorIndex + 1;
                  this.tutorialStarFrameOrColorIndex = this.tutorialStarFrameOrColorIndex % 7;
                  this.tutorialRedDelta = -((16751678 & SocketConnector.themeCycleColors[selectedThemeId][this.tutorialStarFrameOrColorIndex]) >> 16) + ((SocketConnector.themeCycleColors[selectedThemeId][(1 + this.tutorialStarFrameOrColorIndex) % 7] & 16754682) >> 16);
                  this.tutorialGreenDelta = (255 & SocketConnector.themeCycleColors[selectedThemeId][(this.tutorialStarFrameOrColorIndex + 1) % 7] >> 8) - ((SocketConnector.themeCycleColors[selectedThemeId][this.tutorialStarFrameOrColorIndex] & 65438) >> 8);
                  this.tutorialBlueDelta = (255 & SocketConnector.themeCycleColors[selectedThemeId][(1 + this.tutorialStarFrameOrColorIndex) % 7]) - (255 & SocketConnector.themeCycleColors[selectedThemeId][this.tutorialStarFrameOrColorIndex]);
                }
              }
            }
            PrefixCodeDecoder.advanceMenuAvatarAnimation((byte) 127);
          }
          previousPointerPressCountdown = TextTemplateDefinitionLoader.menuPointerPressDebounceTicks;
          TextTemplateDefinitionLoader.menuPointerPressDebounceTicks = TextTemplateDefinitionLoader.menuPointerPressDebounceTicks - 1;
          if (0 > previousPointerPressCountdown) {
            if (CheckboxRenderer.pointerPressButtonSnapshot != 0) {
              TextTemplateDefinitionLoader.menuPointerPressDebounceTicks = 50;
              if (clientControlFlowGuard != 0) {
                CheckboxRenderer.pointerPressButtonSnapshot = 0;
              }
            }
          } else {
            CheckboxRenderer.pointerPressButtonSnapshot = 0;
          }
          if (CheckboxRenderer.pointerPressButtonSnapshot != 0) {
            if (this.screenId == 5 ||
                  7 == this.screenId) {
              ResizableDialog.handleAchievementGridClick(false, false, methodGuard ^ 189);
            }
            if (this.screenId == 6) {
              ResizableDialog.handleAchievementGridClick(true, false, methodGuard + 131);
            }
            if (this.screenId == 4) {
              ResizableDialog.handleAchievementGridClick(true, true, 160);
            }
          }
          fullscreenPointerHandling: {
            if (!this.fullscreenDialogActive) {
              this.updatePointer(true);
              if (clientControlFlowGuard == 0) {
                break fullscreenPointerHandling;
              }
            }
            if (CheckboxRenderer.pointerPressButtonSnapshot != 0) {
              if (UnderlinedButtonRenderer.isGuestSessionMode(-104)) {
                if (265 < FullscreenFocusCanvas.pointerPressYSnapshot &&
                    FullscreenFocusCanvas.pointerPressYSnapshot < 299) {
                  if (AccountCreationSupport.pointerPressXSnapshot > 350 &&
                      AccountCreationSupport.pointerPressXSnapshot < 470) {
                    this.pointerInteractionActive = true;
                    this.fullscreenDialogActive = false;
                    if (clientControlFlowGuard == 0) {
                      break fullscreenPointerHandling;
                    }
                  }
                  if (!(AccountCreationSupport.pointerPressXSnapshot > 170) ||
                        !(AccountCreationSupport.pointerPressXSnapshot < 290)) {
                    this.pointerInteractionActive = false;
                    if (clientControlFlowGuard == 0) {
                      break fullscreenPointerHandling;
                    }
                  }
                  this.pointerInteractionActive = true;
                  if (null != UiWidget.gameplaySession) {
                    UiWidget.gameplaySession.submitScore((byte) -70);
                  }
                  ScoreSubmission.requestedScreenId = -1;
                  UiWidget.gameplayReturnScreenId = 0;
                  ProxySocketConnector.gameplayOriginScreenId = 0;
                  if (clientControlFlowGuard == 0) {
                    break fullscreenPointerHandling;
                  }
                }
                this.pointerInteractionActive = false;
                if (clientControlFlowGuard == 0) {
                  break fullscreenPointerHandling;
                }
              }
              if (TextTemplateDefinition.loginMembershipGateValue > 0 &&
                  null != InstrumentPatch.activeFullscreenCanvas) {
                if (FullscreenFocusCanvas.pointerPressYSnapshot > 317 &&
                    352 > FullscreenFocusCanvas.pointerPressYSnapshot) {
                  if (!(AccountCreationSupport.pointerPressXSnapshot > 350) ||
                        !(AccountCreationSupport.pointerPressXSnapshot < 470)) {
                    if (!(AccountCreationSupport.pointerPressXSnapshot > 170) ||
                          !(AccountCreationSupport.pointerPressXSnapshot < 290)) {
                      this.pointerInteractionActive = false;
                      if (clientControlFlowGuard == 0) {
                        break fullscreenPointerHandling;
                      }
                    }
                    this.fullscreenDialogActive = false;
                    this.pointerInteractionActive = true;
                    if (clientControlFlowGuard != 0) {
                      this.fullscreenDialogActive = false;
                      ArchiveCatalog.exitFullscreenIfActive(255);
                      this.pointerInteractionActive = true;
                      this.pointerInteractionActive = false;
                      this.pointerInteractionActive = true;
                      this.fullscreenDialogActive = false;
                    }
                  } else {
                    this.fullscreenDialogActive = false;
                    ArchiveCatalog.exitFullscreenIfActive(255);
                    this.pointerInteractionActive = true;
                    if (clientControlFlowGuard != 0) {
                      this.pointerInteractionActive = false;
                      this.pointerInteractionActive = true;
                      this.fullscreenDialogActive = false;
                    }
                  }
                } else {
                  this.pointerInteractionActive = false;
                  if (clientControlFlowGuard != 0) {
                    this.pointerInteractionActive = true;
                    this.fullscreenDialogActive = false;
                  }
                }
              } else {
                this.pointerInteractionActive = true;
                this.fullscreenDialogActive = false;
              }
            }
          }
          if (PrefixCodeDecoder.pointerXSnapshot != this.previousPointerX ||
                ~PcmResampler.pointerYSnapshot != ~this.previousPointerY) {
            this.fullscreenDialogButtonIndex = -1;
          }
          this.previousPointerY = PcmResampler.pointerYSnapshot;
          if (methodGuard != 29) {
            this.handleMenuKey(11, 26);
          }
          this.previousPointerX = PrefixCodeDecoder.pointerXSnapshot;
          if (this.selectedItemIndex != 0) {
            inputDerivedStateBranch = (PrefixCodeDecoder.pointerXSnapshot + FullscreenFocusCanvas.pointerPressYSnapshot - (-ClientFlowState.inputAndScoreContextSelectorSeed - SessionTextHistorySupport.currentKeyboardEventCode)) % 8;
            switch (inputDerivedStateBranch) {
              case 3:
                ClientClockSupport.firstScoreContextAccumulator = ClientClockSupport.firstScoreContextAccumulator - DequeCursor.fourthScoreContextCounter;
                UsernameResponseSupport.thirdScoreContextCounter = UsernameResponseSupport.thirdScoreContextCounter + 1;
                break;
              case 6:
                DequeCursor.fourthScoreContextCounter = DequeCursor.fourthScoreContextCounter - 1;
                SpriteButtonRenderer.secondScoreContextAccumulator = SpriteButtonRenderer.secondScoreContextAccumulator - UsernameResponseSupport.thirdScoreContextCounter;
              default:
                break;
              case 7:
                UsernameResponseSupport.thirdScoreContextCounter = UsernameResponseSupport.thirdScoreContextCounter - 1;
                SpriteButtonRenderer.secondScoreContextAccumulator = SpriteButtonRenderer.secondScoreContextAccumulator - DequeCursor.fourthScoreContextCounter;
                if (clientControlFlowGuard == 0) {
                  break;
                }
              case 5:
                UsernameResponseSupport.thirdScoreContextCounter = UsernameResponseSupport.thirdScoreContextCounter + 1;
                SpriteButtonRenderer.secondScoreContextAccumulator = SpriteButtonRenderer.secondScoreContextAccumulator + DequeCursor.fourthScoreContextCounter;
                if (clientControlFlowGuard == 0) {
                  break;
                }
              case 4:
                DequeCursor.fourthScoreContextCounter = DequeCursor.fourthScoreContextCounter + 1;
                SpriteButtonRenderer.secondScoreContextAccumulator = SpriteButtonRenderer.secondScoreContextAccumulator + UsernameResponseSupport.thirdScoreContextCounter;
                if (clientControlFlowGuard == 0) {
                  break;
                }
              case 2:
                ClientClockSupport.firstScoreContextAccumulator = ClientClockSupport.firstScoreContextAccumulator - UsernameResponseSupport.thirdScoreContextCounter;
                DequeCursor.fourthScoreContextCounter = DequeCursor.fourthScoreContextCounter + 1;
                if (clientControlFlowGuard == 0) {
                  break;
                }
              case 1:
                ClientClockSupport.firstScoreContextAccumulator = ClientClockSupport.firstScoreContextAccumulator + DequeCursor.fourthScoreContextCounter;
                UsernameResponseSupport.thirdScoreContextCounter = UsernameResponseSupport.thirdScoreContextCounter - 1;
                if (clientControlFlowGuard == 0) {
                  break;
                }
              case 0:
                ClientClockSupport.firstScoreContextAccumulator = ClientClockSupport.firstScoreContextAccumulator + UsernameResponseSupport.thirdScoreContextCounter;
                DequeCursor.fourthScoreContextCounter = DequeCursor.fourthScoreContextCounter - 1;
                break;
            }
            inputDerivedStateBranch = (SessionTextHistorySupport.currentKeyboardEventCode + PrefixCodeDecoder.pointerXSnapshot - (-FullscreenFocusCanvas.pointerPressYSnapshot - ClientFlowState.inputAndScoreContextSelectorSeed)) % 5;
            if (0 != inputDerivedStateBranch) {
              if (inputDerivedStateBranch != 1) {
                if (inputDerivedStateBranch == 2) {
                  UiWidget.achievementTrackingAccumulator = UiWidget.achievementTrackingAccumulator - AwtRasterBuffer.primaryAchievementTrackingCounter;
                  SessionInstanceState.secondaryAchievementTrackingCounter = SessionInstanceState.secondaryAchievementTrackingCounter - 1;
                  if (clientControlFlowGuard == 0) {
                    return;
                  }
                }
                if (inputDerivedStateBranch == 3) {
                  AwtRasterBuffer.primaryAchievementTrackingCounter = AwtRasterBuffer.primaryAchievementTrackingCounter + 1;
                  UiWidget.achievementTrackingAccumulator = UiWidget.achievementTrackingAccumulator + SessionInstanceState.secondaryAchievementTrackingCounter;
                  if (clientControlFlowGuard == 0) {
                    return;
                  }
                }
                if (inputDerivedStateBranch != 4) {
                  return;
                }
                UiWidget.achievementTrackingAccumulator = UiWidget.achievementTrackingAccumulator - SessionInstanceState.secondaryAchievementTrackingCounter;
                AwtRasterBuffer.primaryAchievementTrackingCounter = AwtRasterBuffer.primaryAchievementTrackingCounter - 1;
                if (clientControlFlowGuard == 0) {
                  return;
                }
              }
              UiWidget.achievementTrackingAccumulator = UiWidget.achievementTrackingAccumulator + AwtRasterBuffer.primaryAchievementTrackingCounter;
              SessionInstanceState.secondaryAchievementTrackingCounter = SessionInstanceState.secondaryAchievementTrackingCounter + 1;
              if (clientControlFlowGuard == 0) {
                return;
              }
            }
            AttachedEntityRenderer.achievementTrackingBits = AttachedEntityRenderer.achievementTrackingBits | SessionInstanceState.secondaryAchievementTrackingCounter + UiWidget.achievementTrackingAccumulator << 17;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          screenUpdateFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) screenUpdateFailure), "c.R(" + methodGuard + ')');
        }
    }

    private final void renderTutorialPage(int methodGuard, int pageIndex) {
        RuntimeException pageRenderFailure = null;
        int paragraphY = 0;
        int orbitCenterX = 0;
        Object pageParagraph = null;
        int orbitCenterY = 0;
        int orbitX = 0;
        int orbitY = 0;
        int orbitAngle = 0;
        double orbitAngleSpacing = 0.0;
        int clientControlFlowGuard = 0;
        RuntimeException caughtFailure = null;
        int tutorialTextLeft;
        int tutorialPageSnapshot;
        int tutorialParagraphLineHeight;
        int tutorialParagraphWidth;
        int unusedSecondSparkleRotationAngle16;
        int unusedThirdSparkleRotationAngle16;
        int secondSparkleX;
        int thirdSparkleX;
        int secondSparkleY;
        int thirdSparkleY;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          paragraphY = 180;
          SoftwareRasterizer.saveClip(this.savedTutorialClipBounds);
          if (pageIndex != 0 &&
              1 != pageIndex &&
              pageIndex != 2) {
            DelayedIncomingPacket.drawNineSlicePanel(140, 30, 80, (byte) -92, 80, GameGraphicsResources.frameNineSliceSprites);
            DelayedIncomingPacket.drawNineSlicePanel(242, 30, 80, (byte) -92, 80, GameGraphicsResources.frameNineSliceSprites);
          }
          if (pageIndex == 0 ||
              1 == pageIndex ||
              pageIndex == 2 || clientControlFlowGuard != 0) {
            tutorialOrbitSpriteRendering: {
              DelayedIncomingPacket.drawNineSlicePanel(140, 30, 80, (byte) -92, 80, GameGraphicsResources.frameNineSliceSprites);
              DelayedIncomingPacket.drawNineSlicePanel(242, 30, 80, (byte) -92, 80, GameGraphicsResources.frameNineSliceSprites);
              DelayedIncomingPacket.drawNineSlicePanel(345, 30, 80, (byte) -92, 80, GameGraphicsResources.frameNineSliceSprites);
              LoginProtocolSupport.drawAvatarFaceLayers(70, 180, 29497);
              HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
              SoftwareRasterizer.clearFramebuffer();
              ConnectionHeaderSupport.entitySpritesByThemeCategoryAndVariant[1][this.tutorialGeometryCategory][this.tutorialGeometryVariant].draw((HotspotTextWidget.spriteScratchRaster.fullWidth >> 1) - (ConnectionHeaderSupport.entitySpritesByThemeCategoryAndVariant[1][this.tutorialGeometryCategory][this.tutorialGeometryVariant].fullWidth >> 1), (HotspotTextWidget.spriteScratchRaster.fullHeight >> 1) - (ConnectionHeaderSupport.entitySpritesByThemeCategoryAndVariant[1][this.tutorialGeometryCategory][this.tutorialGeometryVariant].fullHeight >> 1));
              SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
              SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
              SoftwareRasterizer.intersectClip(50, 250, 90, 310);
              HotspotTextWidget.spriteScratchRaster.addOutline(1);
              HotspotTextWidget.spriteScratchRaster.draw(44, this.tutorialDemoTick + 200);
              SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
              SoftwareRasterizer.intersectClip(40, 355, 93, 415);
              orbitCenterX = 70;
              orbitCenterY = 385;
              orbitX = (int)(-Math.sin(this.tutorialOrbitAngleRadians) * (double)this.tutorialOrbitRadius + 0.5) + orbitCenterX;
              orbitY = (int)(0.5 + Math.cos(this.tutorialOrbitAngleRadians) * (double)this.tutorialOrbitRadius) + orbitCenterY;
              orbitAngle = (int)(this.tutorialOrbitAngleRadians / 6.283185307179586 * 65535.0 + 0.5);
              orbitAngleSpacing = 2.0943741584421716;
              if (this.tutorialOrbitRadius != 15) {
                HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
                SoftwareRasterizer.clearFramebuffer();
                ConnectionHeaderSupport.entitySpritesByThemeCategoryAndVariant[1][this.tutorialGeometryCategory][this.tutorialGeometryVariant].drawRotatedCentered(HotspotTextWidget.spriteScratchRaster.fullWidth >> 1, HotspotTextWidget.spriteScratchRaster.fullHeight >> 1, orbitAngle, 3072);
                SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
                SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
                SoftwareRasterizer.intersectClip(40, 355, 103, 415);
                HotspotTextWidget.spriteScratchRaster.addOutline(1);
                HotspotTextWidget.spriteScratchRaster.draw(orbitX - (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1), orbitY - (HotspotTextWidget.spriteScratchRaster.fullHeight >> 1));
                orbitAngle = (int)(0.5 + 65535.0 * ((this.tutorialOrbitAngleRadians + orbitAngleSpacing) / 6.283185307179586));
                orbitX = orbitCenterX + (int)(0.5 + -Math.sin(this.tutorialOrbitAngleRadians + orbitAngleSpacing) * (double)this.tutorialOrbitRadius);
                orbitY = (int)(0.5 + Math.cos(this.tutorialOrbitAngleRadians + orbitAngleSpacing) * (double)this.tutorialOrbitRadius) + orbitCenterY;
                HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
                SoftwareRasterizer.clearFramebuffer();
                ConnectionHeaderSupport.entitySpritesByThemeCategoryAndVariant[1][this.tutorialGeometryCategory][this.tutorialGeometryVariant].drawRotatedCentered(HotspotTextWidget.spriteScratchRaster.fullWidth >> 1, HotspotTextWidget.spriteScratchRaster.fullHeight >> 1, orbitAngle, 3072);
                SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
                SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
                SoftwareRasterizer.intersectClip(40, 355, 103, 415);
                HotspotTextWidget.spriteScratchRaster.addOutline(1);
                HotspotTextWidget.spriteScratchRaster.draw(orbitX - (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1), -(HotspotTextWidget.spriteScratchRaster.fullHeight >> 1) + orbitY);
                orbitAngleSpacing = orbitAngleSpacing * 2.0;
                orbitAngle = (int)(0.5 + 65535.0 * ((orbitAngleSpacing + this.tutorialOrbitAngleRadians) / 6.283185307179586));
                orbitX = (int)(-Math.sin(orbitAngleSpacing + this.tutorialOrbitAngleRadians) * (double)this.tutorialOrbitRadius + 0.5) + orbitCenterX;
                orbitY = orbitCenterY + (int)(Math.cos(orbitAngleSpacing + this.tutorialOrbitAngleRadians) * (double)this.tutorialOrbitRadius + 0.5);
                HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
                SoftwareRasterizer.clearFramebuffer();
                ConnectionHeaderSupport.entitySpritesByThemeCategoryAndVariant[1][this.tutorialGeometryCategory][this.tutorialGeometryVariant].drawRotatedCentered(HotspotTextWidget.spriteScratchRaster.fullWidth >> 1, HotspotTextWidget.spriteScratchRaster.fullHeight >> 1, orbitAngle, 3072);
                SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
                SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
                SoftwareRasterizer.intersectClip(40, 355, 103, 415);
                HotspotTextWidget.spriteScratchRaster.addOutline(1);
                HotspotTextWidget.spriteScratchRaster.draw(orbitX - (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1), orbitY - (HotspotTextWidget.spriteScratchRaster.fullHeight >> 1));
                if (clientControlFlowGuard == 0) {
                  break tutorialOrbitSpriteRendering;
                }
              }
              KeyboardInputListener.entityAndTutorialScratchRaster.setAsRasterTarget();
              SoftwareRasterizer.clearFramebuffer();
              VisualPropertyOverrides.sparkleFrames[this.tutorialEffectFrame].drawScaled(-10 + (KeyboardInputListener.entityAndTutorialScratchRaster.fullWidth >> 1), (KeyboardInputListener.entityAndTutorialScratchRaster.fullHeight >> 1) - 10, 20, 20);
              SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
              SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
              SoftwareRasterizer.intersectClip(40, 355, 103, 415);
              KeyboardInputListener.entityAndTutorialScratchRaster.draw(orbitX - (KeyboardInputListener.entityAndTutorialScratchRaster.fullWidth >> 1), orbitY - (KeyboardInputListener.entityAndTutorialScratchRaster.fullWidth >> 1));
              unusedSecondSparkleRotationAngle16 = (int)((this.tutorialOrbitAngleRadians + orbitAngleSpacing) / 6.283185307179586 * 65535.0 + 0.5);
              secondSparkleX = (int)(-Math.sin(orbitAngleSpacing + this.tutorialOrbitAngleRadians) * (double)this.tutorialOrbitRadius + 0.5) + orbitCenterX;
              secondSparkleY = orbitCenterY + (int)(0.5 + Math.cos(orbitAngleSpacing + this.tutorialOrbitAngleRadians) * (double)this.tutorialOrbitRadius);
              KeyboardInputListener.entityAndTutorialScratchRaster.setAsRasterTarget();
              SoftwareRasterizer.clearFramebuffer();
              VisualPropertyOverrides.sparkleFrames[this.tutorialEffectFrame].drawScaled((KeyboardInputListener.entityAndTutorialScratchRaster.fullWidth >> 1) - 10, (KeyboardInputListener.entityAndTutorialScratchRaster.fullHeight >> 1) - 10, 20, 20);
              SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
              SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
              SoftwareRasterizer.intersectClip(40, 355, 103, 415);
              KeyboardInputListener.entityAndTutorialScratchRaster.draw(secondSparkleX - (KeyboardInputListener.entityAndTutorialScratchRaster.fullWidth >> 1), -(KeyboardInputListener.entityAndTutorialScratchRaster.fullWidth >> 1) + secondSparkleY);
              orbitAngleSpacing = orbitAngleSpacing * 2.0;
              unusedThirdSparkleRotationAngle16 = (int)(0.5 + (this.tutorialOrbitAngleRadians + orbitAngleSpacing) / 6.283185307179586 * 65535.0);
              thirdSparkleX = (int)(0.5 + -Math.sin(orbitAngleSpacing + this.tutorialOrbitAngleRadians) * (double)this.tutorialOrbitRadius) + orbitCenterX;
              thirdSparkleY = orbitCenterY + (int)(Math.cos(this.tutorialOrbitAngleRadians + orbitAngleSpacing) * (double)this.tutorialOrbitRadius + 0.5);
              KeyboardInputListener.entityAndTutorialScratchRaster.setAsRasterTarget();
              SoftwareRasterizer.clearFramebuffer();
              VisualPropertyOverrides.sparkleFrames[this.tutorialEffectFrame].drawScaled((KeyboardInputListener.entityAndTutorialScratchRaster.fullWidth >> 1) - 10, -10 + (KeyboardInputListener.entityAndTutorialScratchRaster.fullHeight >> 1), 20, 20);
              SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
              SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
              SoftwareRasterizer.intersectClip(40, 355, 103, 415);
              KeyboardInputListener.entityAndTutorialScratchRaster.draw(thirdSparkleX - (KeyboardInputListener.entityAndTutorialScratchRaster.fullWidth >> 1), thirdSparkleY - (KeyboardInputListener.entityAndTutorialScratchRaster.fullWidth >> 1));
            }
            SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
          }
          DelayedIncomingPacket.drawNineSlicePanel(140, 550, 40, (byte) -92, 60, GameGraphicsResources.frameNineSliceSprites);
          FadingDialog.uiPaletteFont.drawCenteredText(pageIndex + 1 + "/5", 580, 170, 0, -1);
          pageParagraph = null;
          tutorialTextLeft = 155;
          tutorialPageSnapshot = pageIndex;
          if (tutorialPageSnapshot == 0) {
            FadingDialog.uiPaletteFont.drawText(BoardEntityState.instructionPageTitles[0], tutorialTextLeft, paragraphY, 0, -1);
            pageParagraph = MatchScoringSupport.instructionParagraphs[0];
            FadingDialog.uiPaletteFont.drawText(BoardEntityState.instructionPageTitles[1], tutorialTextLeft, paragraphY + 110, 0, -1);
          } else {
            if (1 == tutorialPageSnapshot &&
                clientControlFlowGuard == 0) {
              FadingDialog.uiPaletteFont.drawText(BoardEntityState.instructionPageTitles[2], tutorialTextLeft, paragraphY, 0, -1);
              pageParagraph = MatchScoringSupport.instructionParagraphs[1];
            } else {
              if (tutorialPageSnapshot == 2) {
                FadingDialog.uiPaletteFont.drawText(BoardEntityState.instructionPageTitles[3], tutorialTextLeft, paragraphY, 0, -1);
                pageParagraph = MatchScoringSupport.instructionParagraphs[2];
              } else {
                if (tutorialPageSnapshot == 3) {
                  HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
                  SoftwareRasterizer.clearFramebuffer();
                  MenuScreen.amorphousFramesByThemeAndVariant[1][this.tutorialGeometryVariant][this.tutorialEffectFrame].draw(-(MenuScreen.amorphousFramesByThemeAndVariant[1][this.tutorialGeometryVariant][this.tutorialEffectFrame].fullWidth >> 1) + (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1), (HotspotTextWidget.spriteScratchRaster.fullHeight >> 1) - (MenuScreen.amorphousFramesByThemeAndVariant[1][this.tutorialGeometryVariant][this.tutorialEffectFrame].fullHeight >> 1));
                  SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
                  SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
                  HotspotTextWidget.spriteScratchRaster.draw(70 - (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1), -(HotspotTextWidget.spriteScratchRaster.fullHeight >> 1) + 180);
                  HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
                  SoftwareRasterizer.clearFramebuffer();
                  Under13TermsPanel.geometrySpritesByThemeAndCategory[1][this.tutorialGeometryCategory].drawGrayModulated((HotspotTextWidget.spriteScratchRaster.fullWidth >> 1) - (Under13TermsPanel.geometrySpritesByThemeAndCategory[1][this.tutorialGeometryCategory].fullWidth >> 1), (HotspotTextWidget.spriteScratchRaster.fullHeight >> 1) - (Under13TermsPanel.geometrySpritesByThemeAndCategory[1][this.tutorialGeometryCategory].fullHeight >> 1), this.tutorialTintRgb);
                  SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
                  SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
                  HotspotTextWidget.spriteScratchRaster.addOutline(1);
                  HotspotTextWidget.spriteScratchRaster.draw(70 - (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1), 282 - (HotspotTextWidget.spriteScratchRaster.fullHeight >> 1));
                  FadingDialog.uiPaletteFont.drawText(BoardEntityState.instructionPageTitles[4], tutorialTextLeft, paragraphY, 0, -1);
                  pageParagraph = MatchScoringSupport.instructionParagraphs[3];
                } else {
                  if (4 == tutorialPageSnapshot) {
                    HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
                    SoftwareRasterizer.clearFramebuffer();
                    EndingAnimationSupport.blackOrbFrames[this.tutorialEffectFrame].draw(-(EndingAnimationSupport.blackOrbFrames[this.tutorialEffectFrame].fullWidth >> 1) + (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1), -(EndingAnimationSupport.blackOrbFrames[this.tutorialEffectFrame].fullHeight >> 1) + (HotspotTextWidget.spriteScratchRaster.fullHeight >> 1));
                    NodeHashTableIterator.markInsetZeroOutlinePixels(0, 0, HotspotTextWidget.spriteScratchRaster.fullWidth, -27085, HotspotTextWidget.spriteScratchRaster.fullHeight);
                    SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
                    SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
                    HotspotTextWidget.spriteScratchRaster.draw(70 - (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1), 180 - (HotspotTextWidget.spriteScratchRaster.fullHeight >> 1));
                    HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
                    SoftwareRasterizer.clearFramebuffer();
                    if (this.tutorialStarFrameOrColorIndex >= 4) {
                      this.tutorialStarFrameOrColorIndex = 0;
                    }
                    DialRenderer.silverStarFrames[this.tutorialStarFrameOrColorIndex].draw(-(DialRenderer.silverStarFrames[this.tutorialStarFrameOrColorIndex].fullWidth >> 1) + (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1), (HotspotTextWidget.spriteScratchRaster.fullHeight >> 1) - (DialRenderer.silverStarFrames[this.tutorialStarFrameOrColorIndex].fullHeight >> 1));
                    NodeHashTableIterator.markInsetZeroOutlinePixels(0, 0, HotspotTextWidget.spriteScratchRaster.fullWidth, -27085, HotspotTextWidget.spriteScratchRaster.fullHeight);
                    SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
                    SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
                    HotspotTextWidget.spriteScratchRaster.draw(70 - (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1), -(HotspotTextWidget.spriteScratchRaster.fullHeight >> 1) + 282);
                    FadingDialog.uiPaletteFont.drawText(BoardEntityState.instructionPageTitles[5], tutorialTextLeft, paragraphY, 0, -1);
                    pageParagraph = MatchScoringSupport.instructionParagraphs[4];
                  }
                }
              }
            }
          }
          tutorialParagraphLineHeight = IntrusiveNodeHashTable.smallFont.maxAscent + IntrusiveNodeHashTable.smallFont.maxDescent;
          if (methodGuard > -14) {
            this.handleMenuPointer(-3, -61, false, -67, true, 116);
          }
          tutorialParagraphWidth = 355;
          paragraphY = paragraphY + IntrusiveNodeHashTable.smallFont.drawParagraph((String) (pageParagraph), tutorialTextLeft, paragraphY, tutorialParagraphWidth, 300, 0, -1, 0, 0, 16) * tutorialParagraphLineHeight;
          SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          pageRenderFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pageRenderFailure), "c.B(" + methodGuard + ',' + pageIndex + ')');
        }
    }

    final void handleMenuPointer(int itemIndex, int pointerX, boolean initialClick, int rowOffsetY, boolean heldRepeat, int pointerButton) {
        RuntimeException caughtFailure = null;
        int actionId = 0;
        RuntimeException menuPointerFailure = null;
        int selectedActionSnapshot = 0;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (initialClick) {
            this.tutorialPageIndex = -45;
          }
          volumeSliderPointerHandling: {
            actionId = InstrumentEnvelope.menuActionIds[this.screenId][itemIndex];
            selectedActionSnapshot = actionId;
            if (selectedActionSnapshot == 8) {
              pointerX -= 280;
              if (pointerX > 0) {
                if (pointerX < NetworkArchiveRequest.barSprite.fullWidth) {
                  SocialListEntry.soundEffectVolume = 80 * pointerX / NetworkArchiveRequest.barSprite.fullWidth;
                  if (clientControlFlowGuard != 0) {
                    SocialListEntry.soundEffectVolume = 80;
                    SocialListEntry.soundEffectVolume = 0;
                  }
                } else {
                  SocialListEntry.soundEffectVolume = 80;
                  if (clientControlFlowGuard != 0) {
                    SocialListEntry.soundEffectVolume = 0;
                  }
                }
              } else {
                SocialListEntry.soundEffectVolume = 0;
              }
              this.previewMusicVolume(0);
              if (clientControlFlowGuard == 0) {
                return;
              }
            } else {
              if (selectedActionSnapshot != 9) {
                break volumeSliderPointerHandling;
              }
            }
            pointerX -= 280;
            if (pointerX <= 0) {
              AsyncResourceDownloader.setGameMusicVolume(-15346, 0);
              if (clientControlFlowGuard == 0) {
                return;
              }
            }
            if (NetworkArchiveRequest.barSprite.fullWidth > pointerX) {
              AsyncResourceDownloader.setGameMusicVolume(-15346, 80 * pointerX / NetworkArchiveRequest.barSprite.fullWidth);
              if (clientControlFlowGuard == 0) {
                return;
              }
            }
            AsyncResourceDownloader.setGameMusicVolume(-15346, 80);
            if (clientControlFlowGuard == 0) {
              return;
            }
          }
          if (!heldRepeat) {
            super.handleMenuPointer(itemIndex, pointerX, initialClick, rowOffsetY, heldRepeat, pointerButton);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          menuPointerFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) menuPointerFailure), "c.G(" + itemIndex + ',' + pointerX + ',' + initialClick + ',' + rowOffsetY + ',' + heldRepeat + ',' + pointerButton + ')');
        }
    }

    final static char decodeNonzeroTextByte(int methodGuard, byte encodedByte) {
        int unsignedByteOrCodePoint = 0;
        RuntimeException textDecodeFailure = null;
        char decodedCharacterResult = 0;
        RuntimeException caughtFailure = null;
        int extendedCodePoint = 0;
        try {
          unsignedByteOrCodePoint = 255 & encodedByte;
          if (unsignedByteOrCodePoint == 0) {
            throw new IllegalArgumentException("" + Integer.toString(unsignedByteOrCodePoint, 16));
          }
          if (unsignedByteOrCodePoint >= 128 &&
              160 > unsignedByteOrCodePoint) {
            extendedCodePoint = LongAndTextLoginPayload.extendedTextCharacters[-128 + unsignedByteOrCodePoint];
            if (0 == extendedCodePoint) {
              extendedCodePoint = 63;
            }
            unsignedByteOrCodePoint = extendedCodePoint;
          }
          if (methodGuard <= 21) {
            GameScreen.releaseStaticReferences((byte) -112);
          }
          decodedCharacterResult = (char)unsignedByteOrCodePoint;
          return decodedCharacterResult;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          textDecodeFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) textDecodeFailure), "c.A(" + methodGuard + ',' + encodedByte + ')');
        }
    }

    final void setItemCount(int methodGuard, int itemCount) {
        RuntimeException caughtFailure = null;
        RuntimeException itemCountFailure = null;
        try {
          if (methodGuard != -12831) {
            this.renderMenuItem(true, (byte) 98, -83, 83);
          }
          this.itemCount = itemCount;
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          itemCountFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) itemCountFailure), "c.J(" + methodGuard + ',' + itemCount + ')');
        }
    }

    private final void advanceTutorialSlide(byte methodGuard) {
        RuntimeException caughtFailure = null;
        RuntimeException slideUpdateFailure = null;
        try {
          if (methodGuard < 73) {
            this.tutorialRedDelta = 15;
          }
          if (0 == this.menuPressOffset &&
              !this.menuPressAnimationActive) {
            if (0 == this.tutorialSlideOffset) {
              if (this.keyboardSelectionActive) {
                if (this.tutorialPageIndex == 4) {
                  this.selectedItemIndex = 3;
                  if (Geoblox.clientControlFlowFlag != 0) {
                    this.selectedItemIndex = this.hitTestMenuItem(PrefixCodeDecoder.pointerXSnapshot, PcmResampler.pointerYSnapshot, (byte) 54);
                  }
                }
              } else {
                this.selectedItemIndex = this.hitTestMenuItem(PrefixCodeDecoder.pointerXSnapshot, PcmResampler.pointerYSnapshot, (byte) 54);
              }
            }
            this.tutorialSlideOffset = this.tutorialSlideOffset + 8;
            if ((640 + CharacterReplacementSupport.transitionCurtain.height) < this.tutorialSlideOffset) {
              this.tutorialSlideActive = false;
              this.tutorialSlideOffset = 0;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          slideUpdateFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) slideUpdateFailure), "c.E(" + methodGuard + ')');
        }
    }

    private final void skipUnavailableTutorialItemsBackward(byte methodGuard) {
        RuntimeException caughtFailure = null;
        RuntimeException selectionFailure = null;
        try {
          if (methodGuard != 89) {
            return;
          }
          if (3 == this.screenId &&
              !this.tutorialSlideActive) {
            if (this.tutorialPageIndex != 4 &&
                this.selectedItemIndex == 3) {
              this.selectedItemIndex = 2;
              if (Geoblox.clientControlFlowFlag != 0) {
                if (this.tutorialPageIndex == 4) {
                  if (this.selectedItemIndex == 2) {
                    this.selectedItemIndex = 1;
                  }
                  if (SpriteCheckboxRenderer.previousMenuScreenId == 1 &&
                      this.selectedItemIndex == 3) {
                    this.selectedItemIndex = 1;
                  }
                }
              }
            } else {
              if (this.tutorialPageIndex == 4) {
                if (this.selectedItemIndex == 2) {
                  this.selectedItemIndex = 1;
                }
                if (SpriteCheckboxRenderer.previousMenuScreenId == 1 &&
                    this.selectedItemIndex == 3) {
                  this.selectedItemIndex = 1;
                }
              }
            }
            if (this.tutorialPageIndex == 0 &&
                this.selectedItemIndex == 0) {
              this.selectedItemIndex = 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          selectionFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) selectionFailure), "c.F(" + methodGuard + ')');
        }
    }

    GameScreen(Geoblox gameApplet, int screenId) {
        super(InstrumentEnvelope.menuActionIds[screenId].length, 140, 500, 140, 40);
        RuntimeException constructionFailure = null;
        RuntimeException failureContextCause = null;
        StringBuilder failureContextBuilder = null;
        String appletContextDescription = null;
        RuntimeException caughtFailure = null;
        this.renderingPreviousTutorialPage = false;
        this.tutorialGeometryVariant = 0;
        this.menuPressAnimationActive = false;
        this.tutorialGeometryCategory = 0;
        this.animationTick = 0;
        this.foregroundScrollY = 115;
        this.savedTutorialClipBounds = new int[4];
        this.fullscreenDialogButtonIndex = -1;
        this.volumePreviewTicks = 0;
        this.foregroundScrollX = 123;
        this.backgroundScrollY = 0;
        this.tutorialSlideOffset = 0;
        this.tutorialDemoTick = 0;
        this.tutorialSlideForward = true;
        this.backgroundScrollX = 0;
        try {
          this.screenId = screenId;
          this.gameApplet = gameApplet;
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          constructionFailure = caughtFailure;
          failureContextCause = constructionFailure;
          failureContextBuilder = new StringBuilder().append("c.<init>(");
          if (gameApplet == null) {
            appletContextDescription = "null";
          } else {
            appletContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) failureContextCause), ((StringBuilder) (Object) failureContextBuilder).append(appletContextDescription).append(',').append(screenId).append(')').toString());
        }
    }

    private final void previewMusicVolume(int methodGuard) {
        RuntimeException caughtFailure = null;
        RuntimeException volumePreviewFailure = null;
        try {
          if (methodGuard != 0) {
            return;
          }
          if (null != this.volumePreviewStream &&
              !this.volumePreviewStream.isSamplePositionOutOfRange() &&
              50 >= this.volumePreviewTicks) {
            return;
          }
          this.volumePreviewStream = PcmSampleStream.createForPlaybackRate(GameSoundResources.gameSoundSamples[8], 100, SocialListEntry.soundEffectVolume);
          GameplayEntity.registerAudioStream(false, this.volumePreviewStream);
          this.volumePreviewTicks = 0;
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          volumePreviewFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) volumePreviewFailure), "c.H(" + methodGuard + ')');
        }
    }

    final void updateTransition(int methodGuard) {
        int nextAnimationTickSnapshot = 0;
        RuntimeException caughtFailure = null;
        RuntimeException transitionUpdateFailure = null;
        try {
          nextAnimationTickSnapshot = this.animationTick + 1;
          this.animationTick = this.animationTick + 1;
          if (nextAnimationTickSnapshot % 5 == 0) {
            this.backgroundScrollX = this.backgroundScrollX + 1;
            this.backgroundScrollY = this.backgroundScrollY - 1;
            this.advanceMenuPressAnimation((byte) -114);
          }
          if ((this.animationTick & 3) == 3) {
            this.foregroundScrollX = this.foregroundScrollX - 1;
            this.foregroundScrollY = this.foregroundScrollY - 1;
          }
          if (methodGuard != 16405) {
            this.drawScrollingMenuBackground(false);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          transitionUpdateFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) transitionUpdateFailure), "c.K(" + methodGuard + ')');
        }
    }

    final void activateMenuItem(int itemIndex, byte methodGuard) {
        int missingFirstScoreNameFlag = 0;
        RuntimeException caughtFailure = null;
        int newSessionTutorialModeFlag = 0;
        RuntimeException activationFailure = null;
        int suppressPressAnimationFlag = 0;
        int actionId = 0;
        int selectedActionSnapshot = 0;
        String[] scoreCategoryNames = null;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[29]);
          newSessionTutorialModeFlag = 0;
          suppressPressAnimationFlag = 0;
          actionId = InstrumentEnvelope.menuActionIds[this.screenId][itemIndex];
          if (methodGuard != -2) {
            this.updateTransition(-70);
          }
          menuActionDispatch: {
            selectedActionSnapshot = actionId;
            if (selectedActionSnapshot == 15 &&
                clientControlFlowGuard == 0) {
              if (1 == SpriteCheckboxRenderer.previousMenuScreenId) {
                return;
              }
              newSessionTutorialModeFlag = 1;
            } else if (selectedActionSnapshot != 0 ||
                clientControlFlowGuard != 0) {
              switch ((clientControlFlowGuard == 0
                  || selectedActionSnapshot == 3
                  || selectedActionSnapshot == 5
                  || selectedActionSnapshot == 7
                  || selectedActionSnapshot == 10
                  || selectedActionSnapshot == 11
                  || selectedActionSnapshot == 12
                  || selectedActionSnapshot == 13
                  || selectedActionSnapshot == 17
                  || selectedActionSnapshot == 18
                ) ? selectedActionSnapshot : -1) {
                case 1:
                  ScoreSubmission.requestedScreenId = -1;
                  if (clientControlFlowGuard == 0) {
                    break menuActionDispatch;
                  }
                case 2:
                  if (!UnderlinedButtonRenderer.isGuestSessionMode(-100)) {
                    ScoreSubmission.requestedScreenId = 2;
                    if (clientControlFlowGuard == 0) {
                      break menuActionDispatch;
                    }
                  }
                  ScoreSubmission.requestedScreenId = 8;
                  if (clientControlFlowGuard == 0) {
                    break menuActionDispatch;
                  }
                case 3:
                  ScoreSubmission.requestedScreenId = 3;
                  if (clientControlFlowGuard == 0) {
                    break menuActionDispatch;
                  }
                case 4:
                  if (InstrumentPatch.activeFullscreenCanvas == null) {
                    this.fullscreenDialogActive = true;
                  }
                  if (!ArchiveCatalog.exitFullscreenIfActive(255) &&
                      TextTemplateDefinition.loginMembershipGateValue > 0 &&
                      ContextualRuntimeException.hasPlatformFullscreenSupport(MenuScreen.platformTaskDispatcher, (byte) 37)) {
                    MessageDialog.requestFullscreen((byte) -128);
                  }
                  this.fullscreenDialogButtonIndex = 0;
                  this.pointerInteractionActive = false;
                  this.activeTicks = 0;
                  if (clientControlFlowGuard == 0) {
                    break menuActionDispatch;
                  }
                case 14:
                  InstrumentPatch.earnedAchievementMask = 0;
                  ScorePopupSupport.newAchievementMask = 0;
                  SecondaryNodeDeque.receivedAchievementMask = -2147483648;
                case 5:
                  if (2 != this.screenId &&
                      this.screenId != 4 &&
                      6 != this.screenId &&
                      SpriteCheckboxRenderer.previousMenuScreenId == 1) {
                    ScoreSubmission.requestedScreenId = 1;
                    if (clientControlFlowGuard == 0) {
                      break menuActionDispatch;
                    }
                  }
                  ScoreSubmission.requestedScreenId = 0;
                  if (clientControlFlowGuard == 0) {
                    break menuActionDispatch;
                  }
                case 13:
                  if (null != UiWidget.gameplaySession) {
                    UiWidget.gameplaySession.submitScore((byte) -70);
                  }
                  {
                    ScoreSubmission.requestedScreenId = -1;
                    if (this.screenId != 8 && (4 != this.screenId ||
                        null == UiWidget.gameplaySession ||
                        UiWidget.gameplaySession.newActionCount != 0)) {
                      if (this.screenId != 7) {
                        UiWidget.gameplayReturnScreenId = 6;
                        if (clientControlFlowGuard != 0) {
                          UiWidget.gameplayReturnScreenId = 5;
                          UiWidget.gameplayReturnScreenId = 2;
                        }
                      } else {
                        UiWidget.gameplayReturnScreenId = 5;
                        if (clientControlFlowGuard != 0) {
                          UiWidget.gameplayReturnScreenId = 2;
                        }
                      }
                    } else {
                      UiWidget.gameplayReturnScreenId = 2;
                    }
                  }
                  ProxySocketConnector.gameplayOriginScreenId = this.screenId;
                  if (clientControlFlowGuard == 0) {
                    break menuActionDispatch;
                  }
                case 6:
                  sessionResultScreenSelection: {
                    UiWidget.gameplaySession.emitPointsPopup(false);
                    UiWidget.gameplaySession.addScore((byte) 127, WidgetTheme.collectUnfinishedPopupPoints(methodGuard ^ 25864));
                    UiWidget.gameplaySession.addScore((byte) 127, UiWidget.gameplaySession.resultBonusPoints);
                    UiWidget.gameplaySession.resultBonusPoints = 0;
                    if (UnderlinedButtonRenderer.isGuestSessionMode(-114)) {
                      if ((UiWidget.gameplaySession.tutorialMode ||
                            UiWidget.gameplaySession.score != 0 ||
                            ScorePopupSupport.newAchievementMask != 0) &&
                          (!UiWidget.gameplaySession.tutorialMode ||
                            !(UiWidget.gameplaySession.updateTick < 750))) {
                        if (0 == UiWidget.gameplaySession.score &&
                            0 == ScorePopupSupport.newAchievementMask) {
                          ScoreSubmission.requestedScreenId = 0;
                          if (clientControlFlowGuard == 0) {
                            break sessionResultScreenSelection;
                          }
                        }
                        ScoreSubmission.requestedScreenId = 4;
                        if (clientControlFlowGuard == 0) {
                          break sessionResultScreenSelection;
                        }
                      }
                      ScoreSubmission.requestedScreenId = 0;
                      if (clientControlFlowGuard == 0) {
                        break sessionResultScreenSelection;
                      }
                    }
                    if (UiWidget.gameplaySession.score == 0 &&
                        ScorePopupSupport.newAchievementMask == 0) {
                      ScoreSubmission.requestedScreenId = 0;
                      if (clientControlFlowGuard != 0) {
                        UiWidget.gameplaySession.submitScore((byte) -70);
                        if (0 < UiWidget.gameplaySession.newActionCount) {
                          ScoreSubmission.requestedScreenId = 6;
                          ScoreSubmission.requestedScreenId = 2;
                        } else {
                          ScoreSubmission.requestedScreenId = 2;
                        }
                      }
                    } else {
                      UiWidget.gameplaySession.submitScore((byte) -70);
                      if (0 < UiWidget.gameplaySession.newActionCount) {
                        ScoreSubmission.requestedScreenId = 6;
                        if (clientControlFlowGuard != 0) {
                          ScoreSubmission.requestedScreenId = 2;
                        }
                      } else {
                        ScoreSubmission.requestedScreenId = 2;
                      }
                    }
                  }
                  IntrusiveNodeHashTable.selectLoopingBackgroundMusic(methodGuard + 2, GameGraphicsResources.titleMusicTrack);
                  if (clientControlFlowGuard == 0) {
                    break menuActionDispatch;
                  }
                case 7:
                  EntityCollisionSupport.openQuitPage(NodeHashTableIterator.getActiveApplet(methodGuard ^ -125), 62);
                  if (clientControlFlowGuard == 0) {
                    break menuActionDispatch;
                  }
                case 12:
                  if (this.tutorialPageIndex >= 4 ||
                        this.tutorialSlideActive) {
                    suppressPressAnimationFlag = 1;
                    if (clientControlFlowGuard == 0) {
                      break menuActionDispatch;
                    }
                  }
                  this.previousTutorialPageIndex = this.tutorialPageIndex;
                  this.tutorialPageIndex = this.tutorialPageIndex + 1;
                  this.tutorialSlideForward = true;
                  this.tutorialSlideActive = true;
                  if (clientControlFlowGuard == 0) {
                    break menuActionDispatch;
                  }
                case 11:
                  if (this.tutorialPageIndex <= 0 ||
                        this.tutorialSlideActive) {
                    suppressPressAnimationFlag = 1;
                    if (clientControlFlowGuard == 0) {
                      break menuActionDispatch;
                    }
                  }
                  this.previousTutorialPageIndex = this.tutorialPageIndex;
                  this.tutorialSlideActive = true;
                  this.tutorialPageIndex = this.tutorialPageIndex - 1;
                  this.tutorialSlideForward = false;
                  if (clientControlFlowGuard == 0) {
                    break menuActionDispatch;
                  }
                case 10:
                  if (UnderlinedButtonRenderer.isGuestSessionMode(-112)) {
                    ScoreSubmission.requestedScreenId = 7;
                    if (clientControlFlowGuard == 0) {
                      break menuActionDispatch;
                    }
                  }
                  ScoreSubmission.requestedScreenId = 5;
                  if (clientControlFlowGuard == 0) {
                    break menuActionDispatch;
                  }
                case 16:
                  ClientOptionSupport.selectedHighscoreView = 0;
                  if (clientControlFlowGuard == 0) {
                    break menuActionDispatch;
                  }
                case 17:
                  ClientOptionSupport.selectedHighscoreView = 1;
                  if (clientControlFlowGuard == 0) {
                    break menuActionDispatch;
                  }
                case 18:
                  break;
                default:
                  break menuActionDispatch;
              }
              ClientOptionSupport.selectedHighscoreView = 2;
              break menuActionDispatch;
            }
            if (newSessionTutorialModeFlag == 0) {
              if (UnderlinedButtonRenderer.isGuestSessionMode(methodGuard ^ 107) &&
                  BoardReconciliationSupport.sessionStartAttemptCount == 0) {
                newSessionTutorialModeFlag = 1;
              } else {
                if (FifoResponseToken.activeHighscoreQuery != null &&
                    FifoResponseToken.activeHighscoreQuery.completed &&
                    FifoResponseToken.activeHighscoreQuery.namesByView != null) {
                  scoreCategoryNames = FifoResponseToken.activeHighscoreQuery.namesByView[1];
                  missingFirstScoreNameFlag = (scoreCategoryNames[0] != null) ? 0 : 1;
                  newSessionTutorialModeFlag = missingFirstScoreNameFlag;
                }
              }
            }
            BoardReconciliationSupport.sessionStartAttemptCount = BoardReconciliationSupport.sessionStartAttemptCount + 1;
            GameplaySetupSupport.resetGameplayDifficulty(methodGuard ^ -9410);
            UiWidget.gameplaySession = new GameplaySession(this.gameApplet, newSessionTutorialModeFlag != 0);
            PointerInputListener.resetEntityQueuesAndContactState((byte) -39);
            ScoreSubmission.requestedScreenId = -1;
          }
          if (suppressPressAnimationFlag == 0) {
            this.menuPressAnimationActive = true;
            BoardEntityState.selectedAchievementIndex = -1;
          }
          if (~this.screenId != ~ScoreSubmission.requestedScreenId) {
            if (this.screenId != 1 &&
                this.screenId != 0) {
              return;
            }
            SpriteCheckboxRenderer.previousMenuScreenId = this.screenId;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          activationFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) activationFailure), "c.L(" + itemIndex + ',' + methodGuard + ')');
        }
    }

    final void increaseMenuValue(byte methodGuard, int itemIndex) {
        RuntimeException volumeChangeFailure = null;
        int actionId = 0;
        int clientControlFlowGuard = 0;
        RuntimeException caughtFailure = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          volumeIncreaseDispatch: {
            actionId = InstrumentEnvelope.menuActionIds[this.screenId][itemIndex];
            if (actionId == 8) {
              if (SocialListEntry.soundEffectVolume >= 70) {
                SocialListEntry.soundEffectVolume = 80;
                if (clientControlFlowGuard == 0) {
                  break volumeIncreaseDispatch;
                }
              }
              SocialListEntry.soundEffectVolume = SocialListEntry.soundEffectVolume + 10;
              if (clientControlFlowGuard == 0) {
                break volumeIncreaseDispatch;
              }
            } else {
              if (9 != actionId) {
                break volumeIncreaseDispatch;
              }
            }
            if (SpriteCheckboxRenderer.gameMusicVolumeLevel >= 70) {
              AsyncResourceDownloader.setGameMusicVolume(-15346, 80);
              if (clientControlFlowGuard != 0) {
                AsyncResourceDownloader.setGameMusicVolume(-15346, 10 + SpriteCheckboxRenderer.gameMusicVolumeLevel);
              }
            } else {
              AsyncResourceDownloader.setGameMusicVolume(-15346, 10 + SpriteCheckboxRenderer.gameMusicVolumeLevel);
            }
          }
          if (methodGuard != 90) {
            this.activeTicks = 120;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          volumeChangeFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) volumeChangeFailure), "c.V(" + methodGuard + ',' + itemIndex + ')');
        }
    }

    final void renderMenuItem(boolean selected, byte methodGuard, int itemIndex, int rowY) {
        int displayedPageIndexSnapshot = 0;
        int buttonTopSnapshot = 0;
        int buttonLeftSnapshot = 0;
        int selectedPressOffsetSnapshot = 0;
        int volumeLevelSnapshot = 0;
        RuntimeException caughtFailure = null;
        int displayedTutorialPageIndex = 0;
        RuntimeException menuRowRenderFailure = null;
        int actionId = 0;
        String actionText = null;
        PaletteBitmapFont rowFont = null;
        int buttonTextCenter = 0;
        int buttonLeft = 0;
        int buttonWidth = 0;
        int itemColumnOrPressOffset = 0;
        int volumeLevelOrSliderOffset = 0;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard >= -74) {
            return;
          }
          if (this.renderingPreviousTutorialPage) {
            displayedPageIndexSnapshot = this.previousTutorialPageIndex;
          } else {
            displayedPageIndexSnapshot = this.tutorialPageIndex;
          }
          displayedTutorialPageIndex = displayedPageIndexSnapshot;
          if (3 == this.screenId) {
            if (itemIndex == 0 &&
                displayedTutorialPageIndex == 0) {
              return;
            }
            if (itemIndex == 2 &&
                displayedTutorialPageIndex == 4) {
              return;
            }
          }
          actionId = InstrumentEnvelope.menuActionIds[this.screenId][itemIndex];
          actionText = RasterTargetSnapshot.menuActionTexts[actionId];
          if (actionId == 15 && (displayedTutorialPageIndex != 4 ||
              SpriteCheckboxRenderer.previousMenuScreenId == 1)) {
            return;
          }
          if (3 == this.screenId &&
              this.tutorialSlideActive &&
              this.tutorialPageIndex == 4 &&
              SpriteCheckboxRenderer.previousMenuScreenId != 1 &&
              itemIndex == 2 &&
              this.selectedItemIndex == 3) {
            selected = true;
          }
          if (this.screenId == 3 ||
                this.screenId == 2) {
            rowY += 280;
            if (clientControlFlowGuard != 0) {
              if (this.screenId == 5 ||
                  this.screenId == 7 ||
                  this.screenId == 6 ||
                  this.screenId == 4) {
                rowY += 295;
              }
            }
          } else {
            if (this.screenId == 5 ||
                this.screenId == 7 ||
                this.screenId == 6 ||
                this.screenId == 4) {
              rowY += 295;
            }
          }
          rowFont = FadingDialog.uiPaletteFont;
          buttonTextCenter = 320;
          buttonLeft = 160;
          if (0 == this.screenId ||
              this.screenId == 1) {
            buttonWidth = 322;
            if (clientControlFlowGuard != 0) {
              buttonWidth = rowFont.measureMaximumWrappedWidth(actionText, 400);
            }
          } else {
            buttonWidth = rowFont.measureMaximumWrappedWidth(actionText, 400);
          }
          menuButtonLayoutAndFrame: {
            if (this.screenId != 3 &&
                this.screenId != 2 &&
                this.screenId != 6) {
              if (this.screenId != 7 &&
                  this.screenId != 8) {
                if (this.screenId != 4) {
                  if (selected) {
                    buttonTextCenter = buttonTextCenter + this.menuPressOffset;
                    buttonLeft = buttonLeft + this.menuPressOffset;
                    rowY = rowY - this.menuPressOffset;
                  }
                  buttonLeft = 320 - (buttonWidth + 20 >> 1);
                  buttonTopSnapshot = rowY;
                  buttonLeftSnapshot = buttonLeft;
                  if (!selected) {
                    selectedPressOffsetSnapshot = 0;
                  } else {
                    selectedPressOffsetSnapshot = this.menuPressOffset;
                  }
                  DelayedIncomingPacket.drawNineSlicePanel(buttonTopSnapshot, buttonLeftSnapshot + selectedPressOffsetSnapshot, 36, (byte) -92, buttonWidth + 20, ArchiveLoadSequence.mouseBoxFrames);
                  if (clientControlFlowGuard == 0) {
                    break menuButtonLayoutAndFrame;
                  }
                }
                buttonWidth = 278;
                buttonLeft = 320 - (buttonWidth + 20 >> 1);
                if (actionId != 13) {
                  rowY = 395;
                }
                if (actionId == 13 || clientControlFlowGuard != 0) {
                  rowY = 265;
                }
                buttonTextCenter = 10 + (buttonWidth >> 1) + buttonLeft;
                if (selected) {
                  buttonLeft = buttonLeft + this.menuPressOffset;
                  rowY = rowY - this.menuPressOffset;
                  buttonTextCenter = buttonTextCenter + this.menuPressOffset;
                }
                DelayedIncomingPacket.drawNineSlicePanel(rowY, buttonLeft, 36, (byte) -92, 20 + buttonWidth, ArchiveLoadSequence.mouseBoxFrames);
                if (clientControlFlowGuard == 0) {
                  break menuButtonLayoutAndFrame;
                }
              }
              rowY = 437;
              if (actionId == 13) {
                buttonLeft = 121;
                buttonTextCenter = (buttonWidth >> 1) + buttonLeft + 10;
              }
              if (actionId != 13 || clientControlFlowGuard != 0) {
                buttonLeft = 436;
                buttonTextCenter = (buttonWidth >> 1) + buttonLeft + 10;
              }
              if (selected) {
                buttonTextCenter = buttonTextCenter + this.menuPressOffset;
                rowY = rowY - this.menuPressOffset;
                buttonLeft = buttonLeft + this.menuPressOffset;
              }
              DelayedIncomingPacket.drawNineSlicePanel(rowY, buttonLeft, 36, (byte) -92, buttonWidth + 20, ArchiveLoadSequence.mouseBoxFrames);
              if (clientControlFlowGuard == 0) {
                break menuButtonLayoutAndFrame;
              }
            }
            buttonWidth = (this.screenId != 3) && (clientControlFlowGuard == 0) ? (160) : (123);
            footerButtonGeometry: {
              itemColumnOrPressOffset = (rowY + (-280 - this.firstItemY)) / this.itemSpacing;
              buttonTextCenter = 320 + (buttonWidth + 20) * (itemColumnOrPressOffset - 1);
              buttonLeft = -(buttonWidth >> 1) + buttonTextCenter;
              if (6 == this.screenId) {
                buttonTextCenter += 86;
                rowY = 430;
                buttonLeft += 86;
                if (clientControlFlowGuard == 0) {
                  break footerButtonGeometry;
                }
              }
              if (this.screenId == 3) {
                buttonTextCenter = 9 + (320 + (15 + buttonWidth) * (itemColumnOrPressOffset - 1));
                rowY = 430;
                buttonLeft = buttonTextCenter - (buttonWidth >> 1);
                if (15 == actionId) {
                  buttonLeft -= 138;
                  buttonWidth = 229;
                  buttonTextCenter = (buttonWidth >> 1) + buttonLeft;
                  if (clientControlFlowGuard != 0) {
                    rowY = 380;
                    if (actionId == 5) {
                      buttonWidth = 83;
                      buttonTextCenter = 320;
                      rowY += 50;
                      buttonLeft = buttonTextCenter - (buttonWidth >> 1);
                    }
                  }
                }
              } else {
                rowY = 380;
                if (actionId == 5) {
                  buttonWidth = 83;
                  buttonTextCenter = 320;
                  rowY += 50;
                  buttonLeft = buttonTextCenter - (buttonWidth >> 1);
                }
              }
            }
            if (!selected) {
              DelayedIncomingPacket.drawNineSlicePanel(rowY, buttonLeft, 40, (byte) -92, buttonWidth, ArchiveLoadSequence.mouseBoxFrames);
            }
            if (selected || clientControlFlowGuard != 0) {
              buttonTextCenter = buttonTextCenter + this.menuPressOffset;
              buttonLeft = buttonLeft + this.menuPressOffset;
              rowY = rowY - this.menuPressOffset;
              DelayedIncomingPacket.drawNineSlicePanel(rowY, buttonLeft, 40, (byte) -92, buttonWidth, ArchiveLoadSequence.mouseBoxFrames);
            }
            rowY += 2;
          }
          if (selected) {
            FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 15488514;
            itemColumnOrPressOffset = this.menuPressOffset;
          }
          if (!selected || clientControlFlowGuard != 0) {
            itemColumnOrPressOffset = 0;
          }
          if (actionId == 8 ||
                9 == actionId) {
            rowFont.drawRightAlignedText(actionText, 285 + itemColumnOrPressOffset, 30 + rowY, 0, -1);
            NetworkArchiveRequest.barSprite.draw(itemColumnOrPressOffset + 280, rowY + 15);
            if (actionId == 8) {
              volumeLevelSnapshot = SocialListEntry.soundEffectVolume;
            } else {
              volumeLevelSnapshot = SpriteCheckboxRenderer.gameMusicVolumeLevel;
            }
            volumeLevelOrSliderOffset = volumeLevelSnapshot;
            volumeLevelOrSliderOffset = volumeLevelOrSliderOffset * (-4 + NetworkArchiveRequest.barSprite.fullWidth) / 80;
            RankedListQuery.widgetSprite.draw(280 + volumeLevelOrSliderOffset - 1 + itemColumnOrPressOffset, 9 + rowY);
          }
          if (actionId != 8 &&
                9 != actionId || clientControlFlowGuard != 0) {
            rowFont.drawCenteredText(actionText, buttonTextCenter, rowY + 30, 0, -1);
          }
          FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 16689938;
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          menuRowRenderFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) menuRowRenderFailure), "c.O(" + selected + ',' + methodGuard + ',' + itemIndex + ',' + rowY + ')');
        }
    }

    private final void handleScreenKey(byte methodGuard) {
        RuntimeException caughtFailure = null;
        RuntimeException screenKeyFailure = null;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != 62) {
            this.tutorialGeometryCategory = -26;
          }
          if (this.pointerInteractionActive) {
            return;
          }
          screenKeyDispatch: {
            if (this.fullscreenDialogActive ||
                this.screenId != 0 &&
                  1 != this.screenId &&
                  this.screenId != 4) {
              directionalMenuSelection: {
                if (SessionTextHistorySupport.currentKeyboardEventCode == 96) {
                  if (this.fullscreenDialogActive) {
                    if (this.fullscreenDialogButtonIndex == 0) {
                      break directionalMenuSelection;
                    }
                    this.fullscreenDialogButtonIndex = 0;
                    if (clientControlFlowGuard == 0) {
                      break directionalMenuSelection;
                    }
                  }
                  if (0 >= this.selectedItemIndex) {
                    this.selectedItemIndex = this.itemCount;
                  }
                  this.selectedItemIndex = this.selectedItemIndex - 1;
                  this.keyboardSelectionActive = true;
                  this.skipUnavailableTutorialItemsBackward((byte) 89);
                  if (clientControlFlowGuard == 0) {
                    break directionalMenuSelection;
                  }
                }
                if (SessionTextHistorySupport.currentKeyboardEventCode != 97) {
                  if (SessionTextHistorySupport.currentKeyboardEventCode == 98 &&
                      2 == this.screenId) {
                    if (this.selectedItemIndex < 0) {
                      this.selectedItemIndex = 3;
                      if (clientControlFlowGuard == 0) {
                        break directionalMenuSelection;
                      }
                    }
                    if (5 != InstrumentEnvelope.menuActionIds[this.screenId][this.selectedItemIndex]) {
                      break directionalMenuSelection;
                    }
                    this.selectedItemIndex = 1;
                    if (clientControlFlowGuard == 0) {
                      break directionalMenuSelection;
                    }
                  }
                  if (SessionTextHistorySupport.currentKeyboardEventCode != 99) {
                    break directionalMenuSelection;
                  }
                  if (this.screenId != 2) {
                    break directionalMenuSelection;
                  }
                  if (this.selectedItemIndex < 0) {
                    this.selectedItemIndex = 1;
                    if (clientControlFlowGuard == 0) {
                      break directionalMenuSelection;
                    }
                  }
                  if (InstrumentEnvelope.menuActionIds[this.screenId][this.selectedItemIndex] == 5) {
                    break directionalMenuSelection;
                  }
                  this.selectedItemIndex = 3;
                  if (clientControlFlowGuard == 0) {
                    break directionalMenuSelection;
                  }
                }
                if (this.fullscreenDialogActive) {
                  if (this.fullscreenDialogButtonIndex != 1) {
                    if (UnderlinedButtonRenderer.isGuestSessionMode(-122) ||
                        !(TextTemplateDefinition.loginMembershipGateValue <= 0)) {
                      this.fullscreenDialogButtonIndex = 1;
                      if (clientControlFlowGuard != 0) {
                        this.selectedItemIndex = this.selectedItemIndex + 1;
                        this.keyboardSelectionActive = true;
                        if (this.itemCount <= this.selectedItemIndex) {
                          this.selectedItemIndex = 0;
                        }
                        this.skipUnavailableTutorialItemsForward((byte) -117);
                      }
                    }
                  }
                } else {
                  this.selectedItemIndex = this.selectedItemIndex + 1;
                  this.keyboardSelectionActive = true;
                  if (this.itemCount <= this.selectedItemIndex) {
                    this.selectedItemIndex = 0;
                  }
                  this.skipUnavailableTutorialItemsForward((byte) -117);
                }
              }
              if (0 > this.selectedItemIndex) {
                break screenKeyDispatch;
              }
              this.handleMenuKey(this.selectedItemIndex, -49);
              if (clientControlFlowGuard == 0) {
                break screenKeyDispatch;
              }
            }
            if (SessionTextHistorySupport.currentKeyboardEventCode == 98) {
              if (0 >= this.selectedItemIndex) {
                this.selectedItemIndex = this.itemCount;
              }
              this.selectedItemIndex = this.selectedItemIndex - 1;
              this.keyboardSelectionActive = true;
              this.skipUnavailableTutorialItemsBackward((byte) 89);
              if (clientControlFlowGuard == 0) {
                break screenKeyDispatch;
              }
            }
            if (SessionTextHistorySupport.currentKeyboardEventCode == 99) {
              this.selectedItemIndex = this.selectedItemIndex + 1;
              if (this.selectedItemIndex >= this.itemCount) {
                this.selectedItemIndex = 0;
              }
              this.keyboardSelectionActive = true;
              this.skipUnavailableTutorialItemsForward((byte) -107);
              if (clientControlFlowGuard != 0) {
                if (0 <= this.selectedItemIndex) {
                  this.handleMenuKey(this.selectedItemIndex, -29);
                }
              }
            } else {
              if (0 <= this.selectedItemIndex) {
                this.handleMenuKey(this.selectedItemIndex, -29);
              }
            }
          }
          if (SessionTextHistorySupport.currentKeyboardEventCode == 69 &&
              this.screenId == 3 &&
              this.tutorialPageIndex < 4) {
            this.tutorialPageIndex = this.tutorialPageIndex + 1;
            if (clientControlFlowGuard == 0) {
              return;
            }
          }
          if (SessionTextHistorySupport.currentKeyboardEventCode == 41 &&
              this.screenId == 3 &&
              this.tutorialPageIndex > 0) {
            this.tutorialPageIndex = this.tutorialPageIndex - 1;
            if (clientControlFlowGuard == 0) {
              return;
            }
          }
          if (13 == SessionTextHistorySupport.currentKeyboardEventCode &&
              !this.fullscreenDialogActive &&
              4 != this.screenId) {
            if (this.screenId == 1) {
              ScoreSubmission.requestedScreenId = -1;
              if (clientControlFlowGuard != 0) {
                if (this.screenId != 6 &&
                    this.screenId != 2) {
                  ScoreSubmission.requestedScreenId = SpriteCheckboxRenderer.previousMenuScreenId;
                  ScoreSubmission.requestedScreenId = 0;
                } else {
                  ScoreSubmission.requestedScreenId = 0;
                }
              }
            } else {
              if (this.screenId != 6 &&
                  this.screenId != 2) {
                ScoreSubmission.requestedScreenId = SpriteCheckboxRenderer.previousMenuScreenId;
                if (clientControlFlowGuard != 0) {
                  ScoreSubmission.requestedScreenId = 0;
                }
              } else {
                ScoreSubmission.requestedScreenId = 0;
              }
            }
            if (~this.screenId != ~ScoreSubmission.requestedScreenId) {
              if (this.screenId != 1 &&
                  this.screenId != 0) {
                return;
              }
              SpriteCheckboxRenderer.previousMenuScreenId = this.screenId;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          screenKeyFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) screenKeyFailure), "c.D(" + methodGuard + ')');
        }
    }

    static {
        quickChatShortcutHelpTexts = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        selectedThemeId = 0;
        createNameLeadingSpaceAlertText = "Names cannot start or end with space or underscore";
    }
}
