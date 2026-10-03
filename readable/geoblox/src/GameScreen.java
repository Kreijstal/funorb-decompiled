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
          L0: {
            L1: {
              actionId = InstrumentEnvelope.menuActionIds[this.screenId][itemIndex];
              if ((actionId == 8) &&
                  (clientControlFlowGuard == 0)) {
                {
                  if (102 != ki.currentKeyboardEventCode) {
                    if (ki.currentKeyboardEventCode != 103) {
                      super.handleMenuKey(itemIndex, -53);
                    } else {
                      SocialListEntry.field_gb = 80;
                    }
                  } else {
                    SocialListEntry.field_gb = 0;
                  }
                }
                this.previewMusicVolume(0);
                break L0;
              } else {
                if (actionId != 9) {
                  break L1;
                }
              }
              if (102 != ki.currentKeyboardEventCode) {
                if (103 != ki.currentKeyboardEventCode) {
                  super.handleMenuKey(itemIndex, -70);
                  if (clientControlFlowGuard == 0) {
                    break L0;
                  }
                }
                AsyncResourceDownloader.a(-15346, 80);
                if (clientControlFlowGuard == 0) {
                  break L0;
                }
              }
              AsyncResourceDownloader.a(-15346, 0);
              if (clientControlFlowGuard == 0) {
                break L0;
              }
            }
            if ((ki.currentKeyboardEventCode == 13) &&
                (!this.fullscreenDialogActive)) {
              L10: {
                if (this.screenId == 1) {
                  ScoreSubmission.requestedScreenId = -1;
                  if (clientControlFlowGuard == 0) {
                    break L10;
                  }
                }
                ScoreSubmission.requestedScreenId = SpriteCheckboxRenderer.previousMenuScreenId;
              }
              if (~ScoreSubmission.requestedScreenId == ~this.screenId) {
                break L0;
              }
              if ((this.screenId != 1) &&
                  (this.screenId != 0)) {
                break L0;
              }
              SpriteCheckboxRenderer.previousMenuScreenId = this.screenId;
              if (clientControlFlowGuard == 0) {
                break L0;
              }
            }
            if (this.fullscreenDialogActive) {
              if ((ki.currentKeyboardEventCode != 84) &&
                  (83 != ki.currentKeyboardEventCode)) {
                break L0;
              }
              if (!UnderlinedButtonRenderer.c(-103)) {
                if ((!(TextTemplateDefinition.field_n <= 0) ||
                    (!(this.fullscreenDialogButtonIndex == 0) &&
                      !((PrefixCodeDecoder.pointerXSnapshot > 190) &&
                      (PrefixCodeDecoder.pointerXSnapshot < 449) &&
                      (265 < PcmResampler.pointerYSnapshot) &&
                      (PcmResampler.pointerYSnapshot < 299))))) {
                  if (InstrumentPatch.field_n == null) {
                    if (0 != this.fullscreenDialogButtonIndex) {
                      if (PrefixCodeDecoder.pointerXSnapshot <= 260) {
                        break L0;
                      }
                      if (PrefixCodeDecoder.pointerXSnapshot >= 380) {
                        break L0;
                      }
                      if (PcmResampler.pointerYSnapshot <= 274) {
                        break L0;
                      }
                      if (PcmResampler.pointerYSnapshot >= 309) {
                        break L0;
                      }
                    }
                    this.pointerInteractionActive = true;
                    this.fullscreenDialogActive = false;
                    if (clientControlFlowGuard == 0) {
                      break L0;
                    }
                  }
                  if ((!(1 != this.fullscreenDialogButtonIndex) ||
                      (!(this.fullscreenDialogButtonIndex >= 0) &&
                        !(PrefixCodeDecoder.pointerXSnapshot <= 350) &&
                        !(PrefixCodeDecoder.pointerXSnapshot >= 470) &&
                        !(PcmResampler.pointerYSnapshot <= 327) &&
                        !(PcmResampler.pointerYSnapshot >= 362)))) {
                    this.fullscreenDialogActive = false;
                    ArchiveCatalog.b(255);
                    this.pointerInteractionActive = true;
                    if (clientControlFlowGuard == 0) {
                      break L0;
                    }
                  }
                  if (this.fullscreenDialogButtonIndex != 0) {
                    if (this.fullscreenDialogButtonIndex >= 0) {
                      break L0;
                    }
                    if (PrefixCodeDecoder.pointerXSnapshot <= 170) {
                      break L0;
                    }
                    if (PrefixCodeDecoder.pointerXSnapshot >= 290) {
                      break L0;
                    }
                    if (PcmResampler.pointerYSnapshot <= 327) {
                      break L0;
                    }
                    if (PcmResampler.pointerYSnapshot >= 362) {
                      break L0;
                    }
                  }
                  this.pointerInteractionActive = true;
                  this.fullscreenDialogActive = false;
                  if (clientControlFlowGuard == 0) {
                    break L0;
                  }
                }
                this.pointerInteractionActive = true;
                this.fullscreenDialogActive = false;
                if (clientControlFlowGuard == 0) {
                  break L0;
                }
              }
              if ((!(this.fullscreenDialogButtonIndex != 1) ||
                  (!(this.fullscreenDialogButtonIndex >= 0) &&
                    !(PrefixCodeDecoder.pointerXSnapshot <= 350) &&
                    !(470 <= PrefixCodeDecoder.pointerXSnapshot) &&
                    !(PcmResampler.pointerYSnapshot <= 265) &&
                    !(PcmResampler.pointerYSnapshot >= 299)))) {
                this.pointerInteractionActive = true;
                this.fullscreenDialogActive = false;
                if (clientControlFlowGuard == 0) {
                  break L0;
                }
              }
              if (this.fullscreenDialogButtonIndex != 0) {
                if (this.fullscreenDialogButtonIndex >= 0) {
                  break L0;
                }
                if (PrefixCodeDecoder.pointerXSnapshot <= 170) {
                  break L0;
                }
                if (PrefixCodeDecoder.pointerXSnapshot >= 290) {
                  break L0;
                }
                if (PcmResampler.pointerYSnapshot <= 265) {
                  break L0;
                }
                if (PcmResampler.pointerYSnapshot >= 299) {
                  break L0;
                }
              }
              this.pointerInteractionActive = true;
              if (null != UiWidget.gameplaySession) {
                UiWidget.gameplaySession.submitScore((byte) -70);
              }
              UiWidget.gameplayReturnScreenId = 0;
              ScoreSubmission.requestedScreenId = -1;
              ProxySocketConnector.gameplayOriginScreenId = 0;
              if (clientControlFlowGuard == 0) {
                break L0;
              }
            }
            super.handleMenuKey(itemIndex, -100);
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
        int tileX = 0;
        RuntimeException backgroundFailure = null;
        int tileY = 0;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (setTutorialOffsetGuard) {
            this.tutorialSlideOffset = 124;
          }
          this.backgroundScrollX = this.backgroundScrollX % WidgetContainer.menuBackgroundSprite.fullWidth;
          this.backgroundScrollY = this.backgroundScrollY % WidgetContainer.menuBackgroundSprite.fullHeight;
          tileX = -WidgetContainer.menuBackgroundSprite.fullWidth + this.backgroundScrollX;
          L1: while (true) {
            L2: {
              if (640 > tileX) {
                tileOriginYOrForegroundStartX = WidgetContainer.menuBackgroundSprite.fullHeight + this.backgroundScrollY + 480;
                if (clientControlFlowGuard != 0) {
                  break L2;
                }
                tileY = tileOriginYOrForegroundStartX;
                while (true) {
                  if (~-WidgetContainer.menuBackgroundSprite.fullHeight >= ~tileY) {
                    WidgetContainer.menuBackgroundSprite.drawUnmasked(tileX, tileY);
                    tileY = tileY - WidgetContainer.menuBackgroundSprite.fullHeight;
                    continue;
                  }
                  tileX = tileX + WidgetContainer.menuBackgroundSprite.fullWidth;
                  continue L1;
                }
              }
              this.foregroundScrollY = this.foregroundScrollY % CachedTextLayout.menuForegroundSprite.fullHeight;
              this.foregroundScrollX = this.foregroundScrollX % CachedTextLayout.menuForegroundSprite.fullWidth;
              tileOriginYOrForegroundStartX = this.foregroundScrollX + (CachedTextLayout.menuForegroundSprite.fullWidth + 640);
            }
            tileX = tileOriginYOrForegroundStartX;
            L7: while (true) {
              if (~-CachedTextLayout.menuForegroundSprite.fullWidth >= ~tileX) {
                if (clientControlFlowGuard != 0) {
                  return;
                }
                tileY = this.foregroundScrollY + CachedTextLayout.menuForegroundSprite.fullHeight + 480;
                while (true) {
                  if (~tileY <= ~-CachedTextLayout.menuForegroundSprite.fullHeight) {
                    CachedTextLayout.menuForegroundSprite.draw(tileX, tileY);
                    tileY = tileY - CachedTextLayout.menuForegroundSprite.fullHeight;
                    continue;
                  }
                  tileX = tileX - CachedTextLayout.menuForegroundSprite.fullWidth;
                  continue L7;
                }
              }
              return;
            }
          }
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
          L0: {
            if (!this.menuPressAnimationActive) {
              if (this.menuPressOffset >= 0) {
                break L0;
              }
              this.menuPressOffset = this.menuPressOffset + 1;
              if (clientControlFlowGuard == 0) {
                break L0;
              }
            }
            if (-4 >= this.menuPressOffset) {
              this.menuPressAnimationActive = false;
              if (clientControlFlowGuard == 0) {
                break L0;
              }
            }
            this.menuPressOffset = this.menuPressOffset - 1;
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
        int panelHeight = 0;
        RuntimeException renderFailure = null;
        int panelTop = 0;
        int panelWidth = 0;
        int panelLeftOrTextYOrOverlayAlphaOrCurtainX = 0;
        int textYOrButtonTop = 0;
        int dialogButtonWidth = 0;
        String acceptancePromptText = null;
        int dialogButtonLeft = 0;
        String acceptanceCountdownText = null;
        int buttonTextCenterOrConfirmationWidth = 0;
        int confirmationButtonLeft = 0;
        int confirmationTextCenter = 0;
        int clientControlFlowGuard = 0;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != -28750) {
            return;
          }
          this.drawScrollingMenuBackground(false);
          panelHeight = 270;
          panelTop = 140;
          panelWidth = 400;
          if ((this.screenId != 0) &&
              (this.screenId != 1) &&
              (this.screenId != 4)) {
            L1: {
              if (2 == this.screenId) {
                panelHeight = 235;
                if (clientControlFlowGuard == 0) {
                  break L1;
                }
              }
              panelHeight = 285;
            }
            L3: {
              panelLeftOrTextYOrOverlayAlphaOrCurtainX = 120;
              if (this.screenId == 3) {
                panelLeftOrTextYOrOverlayAlphaOrCurtainX += 10;
                if (clientControlFlowGuard == 0) {
                  break L3;
                }
              }
              if ((this.screenId != 8) &&
                  (this.screenId != 7)) {
                break L3;
              }
              panelWidth += 20;
              panelLeftOrTextYOrOverlayAlphaOrCurtainX -= 10;
            }
            DelayedIncomingPacket.drawNineSlicePanel(panelTop, panelLeftOrTextYOrOverlayAlphaOrCurtainX, panelHeight, (byte) -92, panelWidth, ll.frameNineSliceSprites);
          }
          if (!this.tutorialSlideActive) {
            super.renderScreen(methodGuard + 0);
          }
          if ((this.screenId != 2) &&
              (this.screenId != 8)) {
            if (!((5 != this.screenId) &&
                  (7 != this.screenId))) {
              AudioService.screenTitleSprites[4].draw(0, 20);
              TextInputRenderer.a(false, false, (byte) -93);
              if (clientControlFlowGuard == 0) {
                return;
              }
            }
            if (this.screenId != 6) {
              if (this.screenId == 4) {
                AudioService.screenTitleSprites[8].draw(0, 20);
                DelayedIncomingPacket.drawNineSlicePanel(panelTop + 10, 120, 100, (byte) -92, panelWidth, ll.frameNineSliceSprites);
                panelLeftOrTextYOrOverlayAlphaOrCurtainX = 184;
                FadingDialog.uiPaletteFont.drawCenteredText(Geoblox.loginMessage, 320, panelLeftOrTextYOrOverlayAlphaOrCurtainX, 0, -1);
                panelLeftOrTextYOrOverlayAlphaOrCurtainX = 185;
                IntrusiveNodeHashTable.smallFont.drawParagraph(AccountCreationDialog.field_sb, 130, panelLeftOrTextYOrOverlayAlphaOrCurtainX, 380, 300, 0, -1, 1, 0, 14);
                DelayedIncomingPacket.drawNineSlicePanel(320, 120, 60, (byte) -92, panelWidth, ll.frameNineSliceSprites);
                IntrusiveNodeHashTable.smallFont.drawParagraph(ProxyAuthenticationRequiredException.field_b, 130, 330, 380, 300, 0, -1, 1, 0, 14);
                if (clientControlFlowGuard == 0) {
                  return;
                }
              }
              if (this.screenId != 3) {
                AudioService.screenTitleSprites[0].draw(0, 20);
                if ((this.screenId != 0) &&
                    (this.screenId != 1)) {
                  return;
                }
                if (!this.fullscreenDialogActive) {
                  return;
                }
                if (UnderlinedButtonRenderer.c(-93)) {
                  if (this.activeTicks <= 200) {
                    membershipOverlayAlpha = this.activeTicks;
                  } else {
                    membershipOverlayAlpha = 200;
                  }
                  panelLeftOrTextYOrOverlayAlphaOrCurtainX = membershipOverlayAlpha;
                  SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, panelLeftOrTextYOrOverlayAlphaOrCurtainX);
                  DelayedIncomingPacket.drawNineSlicePanel(160, 150, 80, (byte) -92, 340, ll.frameNineSliceSprites);
                  textYOrButtonTop = 170;
                  IntrusiveNodeHashTable.smallFont.drawParagraph(ki.fullscreenNonmemberText, 160, textYOrButtonTop, 320, 300, 0, -1, 1, 0, 16);
                  dialogButtonWidth = 100;
                  dialogButtonLeft = -(20 + dialogButtonWidth >> 1) + 410;
                  textYOrButtonTop = 265;
                  buttonTextCenterOrConfirmationWidth = dialogButtonLeft - (-(dialogButtonWidth >> 1) - 10);
                  DelayedIncomingPacket.drawNineSlicePanel(textYOrButtonTop, dialogButtonLeft, 36, (byte) -92, 20 + dialogButtonWidth, ArchiveLoadSequence.mouseBoxFrames);
                  if ((!(1 != this.fullscreenDialogButtonIndex) ||
                      (!(this.fullscreenDialogButtonIndex >= 0) &&
                        !(350 >= PrefixCodeDecoder.pointerXSnapshot) &&
                        !(PrefixCodeDecoder.pointerXSnapshot >= 470) &&
                        !(PcmResampler.pointerYSnapshot <= 265) &&
                        !(PcmResampler.pointerYSnapshot >= 299)))) {
                    FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.field_p] = 15488514;
                  }
                  FadingDialog.uiPaletteFont.drawCenteredText(hh.fullscreenCloseButtonText, buttonTextCenterOrConfirmationWidth, 30 + textYOrButtonTop, 0, -1);
                  dialogButtonLeft = 320 - (20 + dialogButtonWidth >> 1) - 90;
                  FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.field_p] = 16689938;
                  textYOrButtonTop = 265;
                  buttonTextCenterOrConfirmationWidth = 10 + (dialogButtonWidth >> 1) + dialogButtonLeft;
                  DelayedIncomingPacket.drawNineSlicePanel(textYOrButtonTop, dialogButtonLeft, 36, (byte) -92, dialogButtonWidth + 20, ArchiveLoadSequence.mouseBoxFrames);
                  if ((!(this.fullscreenDialogButtonIndex != 0) ||
                      (!(0 <= this.fullscreenDialogButtonIndex) &&
                        !(170 >= PrefixCodeDecoder.pointerXSnapshot) &&
                        !(PrefixCodeDecoder.pointerXSnapshot >= 290) &&
                        !(PcmResampler.pointerYSnapshot <= 265) &&
                        !(PcmResampler.pointerYSnapshot >= 299)))) {
                    FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.field_p] = 15488514;
                  }
                  FadingDialog.uiPaletteFont.drawCenteredText(DialWidget.fullscreenMembersButtonText, buttonTextCenterOrConfirmationWidth, 30 + textYOrButtonTop, 0, -1);
                  FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.field_p] = 16689938;
                  if (clientControlFlowGuard == 0) {
                    return;
                  }
                }
                if (TextTemplateDefinition.field_n > 0) {
                  if (InstrumentPatch.field_n == null) {
                    if (this.activeTicks > 200) {
                      unavailableOverlayAlpha = 200;
                    } else {
                      unavailableOverlayAlpha = this.activeTicks;
                    }
                    panelLeftOrTextYOrOverlayAlphaOrCurtainX = unavailableOverlayAlpha;
                    SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, panelLeftOrTextYOrOverlayAlphaOrCurtainX);
                    DelayedIncomingPacket.drawNineSlicePanel(160, 160, 95, (byte) -92, 320, ll.frameNineSliceSprites);
                    textYOrButtonTop = 170;
                    textYOrButtonTop = textYOrButtonTop + 16 * IntrusiveNodeHashTable.smallFont.drawParagraph(GrowableIntList.fullscreenUnavailableText, 170, textYOrButtonTop, 300, 300, 0, -1, 1, 0, 16);
                    textYOrButtonTop += 40;
                    dialogButtonWidth = 100;
                    dialogButtonLeft = 320 - (dialogButtonWidth + 20 >> 1);
                    buttonTextCenterOrConfirmationWidth = (dialogButtonWidth >> 1) + (dialogButtonLeft + 10);
                    DelayedIncomingPacket.drawNineSlicePanel(textYOrButtonTop, dialogButtonLeft, 36, (byte) -92, 20 + dialogButtonWidth, ArchiveLoadSequence.mouseBoxFrames);
                    if ((!(0 != this.fullscreenDialogButtonIndex) ||
                        (!(260 >= PrefixCodeDecoder.pointerXSnapshot) &&
                          !(PrefixCodeDecoder.pointerXSnapshot >= 380) &&
                          !(PcmResampler.pointerYSnapshot <= 274) &&
                          !(PcmResampler.pointerYSnapshot >= 309)))) {
                      FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.field_p] = 15488514;
                    }
                    FadingDialog.uiPaletteFont.drawCenteredText(hh.fullscreenCloseButtonText, buttonTextCenterOrConfirmationWidth, 30 + textYOrButtonTop, 0, -1);
                    FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.field_p] = 16689938;
                    if (clientControlFlowGuard == 0) {
                      return;
                    }
                  }
                  if (this.activeTicks <= 200) {
                    acceptanceOverlayAlpha = this.activeTicks;
                  } else {
                    acceptanceOverlayAlpha = 200;
                  }
                  L27: {
                    panelLeftOrTextYOrOverlayAlphaOrCurtainX = acceptanceOverlayAlpha;
                    SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, panelLeftOrTextYOrOverlayAlphaOrCurtainX);
                    DelayedIncomingPacket.drawNineSlicePanel(160, 160, 140, (byte) -92, 320, ll.frameNineSliceSprites);
                    textYOrButtonTop = 170;
                    acceptancePromptText = PcmResampler.fullscreenBeforeAcceptText + " " + ArchiveRequest.fullscreenAcceptButtonText + " " + OpacityWidget.fullscreenAfterAcceptText + " " + rb.fullscreenCancelButtonText + " " + FullscreenFailureReason.fullscreenAfterCancelText;
                    textYOrButtonTop = textYOrButtonTop + 16 * IntrusiveNodeHashTable.smallFont.drawParagraph(acceptancePromptText, 170, textYOrButtonTop, 300, 300, 0, -1, 1, 0, 16);
                    textYOrButtonTop += 10;
                    acceptanceCountdownText = Integer.toString((1500 - this.activeTicks) / 150 + 1);
                    if ((1500 - this.activeTicks) / 150 <= 0) {
                      textYOrButtonTop = textYOrButtonTop + IntrusiveNodeHashTable.smallFont.drawParagraph(OpacityWidget.a(mj.fullscreenAcceptCountdownSingularText, new String[]{acceptanceCountdownText}, (byte) -51), 170, textYOrButtonTop, 300, 300, 0, -1, 1, 0, 16) * 16;
                      if (clientControlFlowGuard == 0) {
                        break L27;
                      }
                    }
                    textYOrButtonTop = textYOrButtonTop + IntrusiveNodeHashTable.smallFont.drawParagraph(OpacityWidget.a(jk.fullscreenAcceptCountdownPluralText, new String[]{acceptanceCountdownText}, (byte) -45), 170, textYOrButtonTop, 300, 300, 0, -1, 1, 0, 16) * 16;
                  }
                  textYOrButtonTop += 40;
                  buttonTextCenterOrConfirmationWidth = 100;
                  confirmationButtonLeft = -(20 + buttonTextCenterOrConfirmationWidth >> 1) + 320 + 90;
                  DelayedIncomingPacket.drawNineSlicePanel(textYOrButtonTop, confirmationButtonLeft, 36, (byte) -92, buttonTextCenterOrConfirmationWidth + 20, ArchiveLoadSequence.mouseBoxFrames);
                  confirmationTextCenter = 10 + ((buttonTextCenterOrConfirmationWidth >> 1) + confirmationButtonLeft);
                  if ((!(this.fullscreenDialogButtonIndex != 1) ||
                      (!(0 <= this.fullscreenDialogButtonIndex) &&
                        !(PrefixCodeDecoder.pointerXSnapshot <= 350) &&
                        !(PrefixCodeDecoder.pointerXSnapshot >= 470) &&
                        !(PcmResampler.pointerYSnapshot <= 317) &&
                        !(PcmResampler.pointerYSnapshot >= 352)))) {
                    FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.field_p] = 15488514;
                  }
                  FadingDialog.uiPaletteFont.drawCenteredText(rb.fullscreenCancelButtonText, confirmationTextCenter, 30 + textYOrButtonTop, 0, -1);
                  FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.field_p] = 16689938;
                  confirmationButtonLeft = 320 - (20 + buttonTextCenterOrConfirmationWidth >> 1) - 90;
                  confirmationTextCenter = 10 + (buttonTextCenterOrConfirmationWidth >> 1) + confirmationButtonLeft;
                  DelayedIncomingPacket.drawNineSlicePanel(textYOrButtonTop, confirmationButtonLeft, 36, (byte) -92, 20 + buttonTextCenterOrConfirmationWidth, ArchiveLoadSequence.mouseBoxFrames);
                  if ((!(this.fullscreenDialogButtonIndex != 0) ||
                      (!(this.fullscreenDialogButtonIndex >= 0) &&
                        !(PrefixCodeDecoder.pointerXSnapshot <= 170) &&
                        !(PrefixCodeDecoder.pointerXSnapshot >= 290) &&
                        !(PcmResampler.pointerYSnapshot <= 317) &&
                        !(PcmResampler.pointerYSnapshot >= 352)))) {
                    FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.field_p] = 15488514;
                  }
                  FadingDialog.uiPaletteFont.drawCenteredText(ArchiveRequest.fullscreenAcceptButtonText, confirmationTextCenter, 30 + textYOrButtonTop, 0, -1);
                  FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.field_p] = 16689938;
                  if (clientControlFlowGuard == 0) {
                    return;
                  }
                }
                if (this.activeTicks > 200) {
                  fallbackOverlayAlpha = 200;
                } else {
                  fallbackOverlayAlpha = this.activeTicks;
                }
                panelLeftOrTextYOrOverlayAlphaOrCurtainX = fallbackOverlayAlpha;
                SoftwareRasterizer.fillRectangleAlpha(0, 0, 640, 480, 0, panelLeftOrTextYOrOverlayAlphaOrCurtainX);
                DelayedIncomingPacket.drawNineSlicePanel(170, 160, 80, (byte) -92, 320, ll.frameNineSliceSprites);
                textYOrButtonTop = 180;
                IntrusiveNodeHashTable.smallFont.drawParagraph(ki.fullscreenNonmemberText, 170, textYOrButtonTop, 300, 300, 0, -1, 1, 0, 16);
                dialogButtonWidth = 242;
                dialogButtonLeft = 320 - (dialogButtonWidth + 20 >> 1);
                buttonTextCenterOrConfirmationWidth = 10 + (dialogButtonLeft + (dialogButtonWidth >> 1));
                textYOrButtonTop = 265;
                DelayedIncomingPacket.drawNineSlicePanel(textYOrButtonTop, dialogButtonLeft, 36, (byte) -92, dialogButtonWidth + 20, ArchiveLoadSequence.mouseBoxFrames);
                if ((!(this.fullscreenDialogButtonIndex != 0) ||
                    (!(PrefixCodeDecoder.pointerXSnapshot <= 190) &&
                      !(PrefixCodeDecoder.pointerXSnapshot >= 449) &&
                      !(PcmResampler.pointerYSnapshot <= 265) &&
                      !(299 <= PcmResampler.pointerYSnapshot)))) {
                  FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.field_p] = 15488514;
                }
                FadingDialog.uiPaletteFont.drawCenteredText(hh.fullscreenCloseButtonText, buttonTextCenterOrConfirmationWidth, 30 + textYOrButtonTop, 0, -1);
                FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.field_p] = 16689938;
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
              L37: {
                panelLeftOrTextYOrOverlayAlphaOrCurtainX = this.tutorialSlideOffset;
                if (!this.tutorialSlideForward) {
                  panelLeftOrTextYOrOverlayAlphaOrCurtainX = 640 - panelLeftOrTextYOrOverlayAlphaOrCurtainX;
                  SoftwareRasterizer.setClip(0, 0, panelLeftOrTextYOrOverlayAlphaOrCurtainX, 480);
                  this.renderTutorialPage(-85, this.previousTutorialPageIndex);
                  this.renderingPreviousTutorialPage = true;
                  super.renderScreen(-28750);
                  this.renderingPreviousTutorialPage = false;
                  SoftwareRasterizer.setClip(panelLeftOrTextYOrOverlayAlphaOrCurtainX, 0, 640, 480);
                  this.renderTutorialPage(methodGuard ^ 28757, this.tutorialPageIndex);
                  super.renderScreen(-28750);
                  SoftwareRasterizer.setClip(0, 0, 640, 480);
                  qj.transitionCurtain.drawRotatedCentered((qj.transitionCurtain.fullHeight >> 1) + panelLeftOrTextYOrOverlayAlphaOrCurtainX, 240, -49150, 4096);
                  if (clientControlFlowGuard == 0) {
                    break L37;
                  }
                }
                SoftwareRasterizer.setClip(panelLeftOrTextYOrOverlayAlphaOrCurtainX, 0, 640, 480);
                this.renderTutorialPage(-17, this.previousTutorialPageIndex);
                this.renderingPreviousTutorialPage = true;
                super.renderScreen(-28750);
                this.renderingPreviousTutorialPage = false;
                SoftwareRasterizer.setClip(0, 0, panelLeftOrTextYOrOverlayAlphaOrCurtainX, 480);
                this.renderTutorialPage(-48, this.tutorialPageIndex);
                super.renderScreen(-28750);
                SoftwareRasterizer.setClip(0, 0, 640, 480);
                qj.transitionCurtain.drawRotatedCentered(-(qj.transitionCurtain.fullHeight >> 1) + panelLeftOrTextYOrOverlayAlphaOrCurtainX, 240, -16383, 4096);
              }
              if (clientControlFlowGuard == 0) {
                return;
              }
            }
            AudioService.screenTitleSprites[7].draw(0, 20);
            TextInputRenderer.a(false, true, (byte) -122);
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
          if ((actionId == 8) &&
              (clientControlFlowGuard == 0)) {
            if (SocialListEntry.field_gb > 10) {
              SocialListEntry.field_gb = SocialListEntry.field_gb - 10;
              return;
            }
            SocialListEntry.field_gb = 0;
            return;
          } else {
            if (9 != actionId) {
              return;
            }
          }
          if (SpriteCheckboxRenderer.field_c > 10) {
            AsyncResourceDownloader.a(-15346, SpriteCheckboxRenderer.field_c - 10);
            if (clientControlFlowGuard == 0) {
              return;
            }
          }
          AsyncResourceDownloader.a(-15346, 0);
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
          if ((3 == this.screenId) &&
              (!this.tutorialSlideActive)) {
            if (!((this.tutorialPageIndex != 4) &&
                  (this.selectedItemIndex == 3))) {
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
          if ((0 != this.screenId) &&
              (this.screenId != 1)) {
            L1: {
              if (this.screenId == 3) {
                if ((pointerY > 430) &&
                    (pointerY < 470)) {
                  if ((this.tutorialPageIndex != 0) &&
                      (pointerX > 130) &&
                      (pointerX < 253)) {
                    tutorialBackItemResult = 0;
                    return tutorialBackItemResult;
                  }
                  if ((pointerX > 268) &&
                      (391 > pointerX)) {
                    tutorialMiddleItemResult = 1;
                    return tutorialMiddleItemResult;
                  }
                  if ((this.tutorialPageIndex != 4) &&
                      (pointerX > 406) &&
                      (pointerX < 529)) {
                    tutorialNextItemResult = 2;
                    return tutorialNextItemResult;
                  }
                  if ((this.tutorialPageIndex == 4) &&
                      (SpriteCheckboxRenderer.previousMenuScreenId != 1) &&
                      (pointerX > 406) &&
                      (pointerX < 635)) {
                    tutorialFinalItemResult = 3;
                    return tutorialFinalItemResult;
                  }
                }
              } else {
                if (this.screenId != 5) {
                  if ((this.screenId != 7) &&
                      (this.screenId != 8)) {
                    if (2 == this.screenId) {
                      if ((pointerY > 380) &&
                          (pointerY < 420)) {
                        if ((pointerX > 61) &&
                            (220 > pointerX)) {
                          scoreLeftItemResult = 0;
                          return scoreLeftItemResult;
                        }
                        if ((241 < pointerX) &&
                            (pointerX < 400)) {
                          scoreMiddleItemResult = 1;
                          return scoreMiddleItemResult;
                        }
                        if (pointerX <= 420) {
                          break L1;
                        }
                        if (pointerX >= 579) {
                          break L1;
                        }
                        scoreRightItemResult = 2;
                        return scoreRightItemResult;
                      }
                      if (pointerY <= 430) {
                        break L1;
                      }
                      if (pointerY >= 470) {
                        break L1;
                      }
                      if (pointerX <= 279) {
                        break L1;
                      }
                      if (pointerX >= 362) {
                        break L1;
                      }
                      scoreBottomItemResult = 3;
                      return scoreBottomItemResult;
                    }
                    if (this.screenId == 4) {
                      if (pointerX <= 171) {
                        break L1;
                      }
                      if (pointerX >= 469) {
                        break L1;
                      }
                      if ((265 < pointerY) &&
                          (pointerY < 301)) {
                        loginUpperItemResult = 0;
                        return loginUpperItemResult;
                      }
                      if (pointerY <= 395) {
                        break L1;
                      }
                      if (431 <= pointerY) {
                        break L1;
                      }
                      loginLowerItemResult = 1;
                      return loginLowerItemResult;
                    }
                    if (6 != this.screenId) {
                      break L1;
                    }
                    if (pointerY <= 430) {
                      break L1;
                    }
                    if (470 <= pointerY) {
                      break L1;
                    }
                    if ((pointerX > 146) &&
                        (pointerX < 306)) {
                      shiftedFooterLeftItemResult = 0;
                      return shiftedFooterLeftItemResult;
                    }
                    if (pointerX <= 326) {
                      break L1;
                    }
                    if (pointerX >= 486) {
                      break L1;
                    }
                    shiftedFooterRightItemResult = 1;
                    return shiftedFooterRightItemResult;
                  }
                  if ((pointerY > 437) &&
                      (pointerY < 473)) {
                    if ((pointerX > 121) &&
                        (356 > pointerX)) {
                      pairedFooterLeftItemResult = 0;
                      return pairedFooterLeftItemResult;
                    }
                    if ((436 < pointerX) &&
                        (pointerY < 518)) {
                      pairedFooterRightItemResult = 1;
                      return pairedFooterRightItemResult;
                    }
                  }
                } else {
                  if ((pointerY > 435) &&
                      (470 > pointerY) &&
                      (pointerX > 279) &&
                      (361 > pointerX)) {
                    singleFooterItemResult = 0;
                    return singleFooterItemResult;
                  }
                }
              }
            }
            nonMainScreenMissResult = -1;
            return nonMainScreenMissResult;
          }
          if ((pointerX >= 149) &&
              (490 >= pointerX)) {
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
        String statusOrFriendTipText = null;
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
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if ((FifoResponseToken.activeHighscoreQuery == null) &&
              (!UnderlinedButtonRenderer.c(-115))) {
            FifoResponseToken.activeHighscoreQuery = DialWidget.getOrRequestHighscores(22, 1, 0, 10, 3);
          }
          L1: {
            if (0 != da.field_c) {
              if (da.field_c != 2) {
                if (da.field_c != 1) {
                  break L1;
                }
                AudioService.screenTitleSprites[3].draw(0, 20);
                if (clientControlFlowGuard == 0) {
                  break L1;
                }
              }
              AudioService.screenTitleSprites[2].draw(0, 20);
              if (clientControlFlowGuard == 0) {
                break L1;
              }
            }
            AudioService.screenTitleSprites[1].draw(0, 20);
          }
          if (methodGuard != 30) {
            this.updateTransition(-78);
          }
          L5: {
            if ((null != FifoResponseToken.activeHighscoreQuery) &&
                (null != FifoResponseToken.activeHighscoreQuery.namesByView)) {
              if (!FifoResponseToken.activeHighscoreQuery.completed) {
                statusOrFriendTipText = ArchiveLoadSequence.field_f;
                statusTextY = 76 + (150 + FadingDialog.uiPaletteFont.maxAscent);
                FadingDialog.uiPaletteFont.drawCenteredText(statusOrFriendTipText, 322, statusTextY, 0, -1);
                if (clientControlFlowGuard == 0) {
                  break L5;
                }
              }
              hasDisplayedEntryFlag = 0;
              categoryNames = FifoResponseToken.activeHighscoreQuery.namesByView[da.field_c];
              scoreFont = IntrusiveNodeHashTable.smallFont;
              if (categoryNames != null) {
                categoryScores = FifoResponseToken.activeHighscoreQuery.valuesByView[da.field_c];
                entryTextY = scoreFont.maxAscent + 150;
                currentScoreHighlightedFlag = 0;
                entryIndex = 0;
                while (true) {
                  L10: {
                    if (entryIndex < 10) {
                      nullEntryOrSessionSentinel = null;
                      if (clientControlFlowGuard != 0) {
                        break L10;
                      }
                      if (nullEntryOrSessionSentinel != categoryNames[entryIndex]) {
                        hasDisplayedEntryFlag = 1;
                        entryName = categoryNames[entryIndex];
                        if ((currentScoreHighlightedFlag == 0) &&
                            (null != UiWidget.gameplaySession) &&
                            (categoryScores[entryIndex] == Math.abs(UiWidget.gameplaySession.score)) &&
                            (WhirlpoolHash.a(entryName, (byte) 12))) {
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
                  unlistedCurrentScoreText = SecondaryDeque.field_f;
                  scoreFont.drawText(unlistedCurrentScoreText, 165, entryTextY, 16724225, -1);
                  scoreFont.drawRightAlignedText(Integer.toString(Math.abs(UiWidget.gameplaySession.score)), 500, entryTextY, 16724225, -1);
                  break;
                }
              }
              if (hasDisplayedEntryFlag == 0) {
                noHighscoresMessage = sb.noHighscoresText;
                entryTextY = 76 + FadingDialog.uiPaletteFont.maxAscent + 150;
                FadingDialog.uiPaletteFont.drawCenteredText(noHighscoresMessage, 322, entryTextY, 0, -1);
              }
              if (clientControlFlowGuard == 0) {
                break L5;
              }
            }
            L15: {
              if (!UnderlinedButtonRenderer.c(-89)) {
                statusOrFriendTipText = PasswordValidator.serviceUnavailableText;
                if (clientControlFlowGuard == 0) {
                  break L15;
                }
              }
              statusOrFriendTipText = sb.noHighscoresText;
            }
            statusTextY = 150 - (-FadingDialog.uiPaletteFont.maxAscent - 76);
            FadingDialog.uiPaletteFont.drawCenteredText(statusOrFriendTipText, 322, statusTextY, 0, -1);
            if (UnderlinedButtonRenderer.c(methodGuard - 147)) {
              FadingDialog.uiPaletteFont.drawParagraph(MessageDialogContent.createToUseText, 125, 350, 395, 100, 0, -1, 1, 0, 26);
            }
          }
          if (!UnderlinedButtonRenderer.c(methodGuard ^ -109)) {
            statusOrFriendTipText = PcmResampler.highscoreFriendTipText;
            IntrusiveNodeHashTable.smallFont.drawParagraph(statusOrFriendTipText, 140, 325, 360, 300, 0, -1, 1, 0, 16);
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
          jk.field_a = this.fullscreenDialogActive;
          this.volumePreviewTicks = this.volumePreviewTicks + 1;
          this.activeTicks = this.activeTicks + 1;
          if ((this.fullscreenDialogActive) &&
              (InstrumentPatch.field_n != null) &&
              (this.activeTicks > 1500)) {
            ArchiveCatalog.b(255);
            this.fullscreenDialogActive = false;
          }
          while (true) {
            L4: {
              if (hh.pollKeyboardEvent(108)) {
                this.handleScreenKey((byte) 62);
                if (clientControlFlowGuard != 0) {
                  break L4;
                }
                continue;
              }
              if ((this.screenId == 3) &&
                  (this.selectedItemIndex == 0) &&
                  (this.tutorialPageIndex == 0) &&
                  (!this.menuPressAnimationActive)) {
                this.selectedItemIndex = this.selectedItemIndex + 1;
              }
            }
            if (this.screenId == 3) {
              L7: {
                if (0 == (1 & this.animationTick)) {
                  this.tutorialDemoTick = this.tutorialDemoTick + 1;
                  this.tutorialOrbitRadius = -(this.tutorialDemoTick >> 1) + 60;
                  if (this.tutorialOrbitRadius < 15) {
                    this.tutorialOrbitRadius = 15;
                    if (clientControlFlowGuard == 0) {
                      break L7;
                    }
                  }
                  this.tutorialOrbitAngleRadians = this.tutorialOrbitAngleRadians + 0.1;
                }
              }
              if (120 == this.tutorialDemoTick) {
                this.tutorialGeometryCategory = AchievementQuery.b(7, 1);
                this.tutorialGeometryVariant = AchievementQuery.b(7, 1);
                this.tutorialDemoTick = 0;
              }
              if ((this.tutorialPageIndex < 4) &&
                  (this.animationTick % 24 == 0)) {
                this.tutorialEffectFrame = this.tutorialEffectFrame + 1;
                if (this.tutorialEffectFrame >= 4) {
                  this.tutorialEffectFrame = 0;
                }
              }
              L11: {
                if (this.tutorialPageIndex != 3) {
                  if (4 != this.tutorialPageIndex) {
                    break L11;
                  }
                  if (49 > (this.animationTick & 255)) {
                    if ((15 & this.animationTick) != 0) {
                      break L11;
                    }
                    this.tutorialEffectFrame = this.tutorialEffectFrame + 1;
                    if (this.tutorialEffectFrame >= 4) {
                      this.tutorialEffectFrame = 0;
                    }
                    this.tutorialStarFrameOrColorIndex = this.tutorialStarFrameOrColorIndex + 1;
                    if (4 > this.tutorialStarFrameOrColorIndex) {
                      break L11;
                    }
                    this.tutorialStarFrameOrColorIndex = 0;
                    if (clientControlFlowGuard == 0) {
                      break L11;
                    }
                  }
                  this.tutorialStarFrameOrColorIndex = 0;
                  this.tutorialEffectFrame = 0;
                  if (clientControlFlowGuard == 0) {
                    break L11;
                  }
                }
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
              PrefixCodeDecoder.advanceMenuAvatarAnimation((byte) 127);
            }
            L15: {
              previousPointerPressCountdown = TextTemplateDefinitionLoader.field_a;
              TextTemplateDefinitionLoader.field_a = TextTemplateDefinitionLoader.field_a - 1;
              if (0 > previousPointerPressCountdown) {
                if (CheckboxRenderer.pointerPressButtonSnapshot == 0) {
                  break L15;
                }
                TextTemplateDefinitionLoader.field_a = 50;
                if (clientControlFlowGuard == 0) {
                  break L15;
                }
              }
              CheckboxRenderer.pointerPressButtonSnapshot = 0;
            }
            if (CheckboxRenderer.pointerPressButtonSnapshot != 0) {
              if (!((this.screenId != 5) &&
                    (7 != this.screenId))) {
                ResizableDialog.a(false, false, methodGuard ^ 189);
              }
              if (this.screenId == 6) {
                ResizableDialog.a(true, false, methodGuard + 131);
              }
              if (this.screenId == 4) {
                ResizableDialog.a(true, true, 160);
              }
            }
            L21: {
              if (!this.fullscreenDialogActive) {
                this.updatePointer(true);
                if (clientControlFlowGuard == 0) {
                  break L21;
                }
              }
              if (CheckboxRenderer.pointerPressButtonSnapshot != 0) {
                if (UnderlinedButtonRenderer.c(-104)) {
                  if ((265 < FullscreenFocusCanvas.pointerPressYSnapshot) &&
                      (FullscreenFocusCanvas.pointerPressYSnapshot < 299)) {
                    if ((mc.pointerPressXSnapshot > 350) &&
                        (mc.pointerPressXSnapshot < 470)) {
                      this.pointerInteractionActive = true;
                      this.fullscreenDialogActive = false;
                      if (clientControlFlowGuard == 0) {
                        break L21;
                      }
                    }
                    if (!((mc.pointerPressXSnapshot > 170) &&
                          (mc.pointerPressXSnapshot < 290))) {
                      this.pointerInteractionActive = false;
                      if (clientControlFlowGuard == 0) {
                        break L21;
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
                      break L21;
                    }
                  }
                  this.pointerInteractionActive = false;
                  if (clientControlFlowGuard == 0) {
                    break L21;
                  }
                }
                if ((TextTemplateDefinition.field_n > 0) &&
                    (null != InstrumentPatch.field_n)) {
                  if ((FullscreenFocusCanvas.pointerPressYSnapshot > 317) &&
                      (352 > FullscreenFocusCanvas.pointerPressYSnapshot)) {
                    if (!((mc.pointerPressXSnapshot > 350) &&
                          (mc.pointerPressXSnapshot < 470))) {
                      if (!((mc.pointerPressXSnapshot > 170) &&
                            (mc.pointerPressXSnapshot < 290))) {
                        this.pointerInteractionActive = false;
                        if (clientControlFlowGuard == 0) {
                          break L21;
                        }
                      }
                      this.fullscreenDialogActive = false;
                      this.pointerInteractionActive = true;
                      if (clientControlFlowGuard == 0) {
                        break L21;
                      }
                    }
                    this.fullscreenDialogActive = false;
                    ArchiveCatalog.b(255);
                    this.pointerInteractionActive = true;
                    if (clientControlFlowGuard == 0) {
                      break L21;
                    }
                  }
                  this.pointerInteractionActive = false;
                  if (clientControlFlowGuard == 0) {
                    break L21;
                  }
                }
                this.pointerInteractionActive = true;
                this.fullscreenDialogActive = false;
              }
            }
            if (!((PrefixCodeDecoder.pointerXSnapshot == this.previousPointerX) &&
                  (~PcmResampler.pointerYSnapshot == ~this.previousPointerY))) {
              this.fullscreenDialogButtonIndex = -1;
            }
            this.previousPointerY = PcmResampler.pointerYSnapshot;
            if (methodGuard != 29) {
              this.handleMenuKey(11, 26);
            }
            this.previousPointerX = PrefixCodeDecoder.pointerXSnapshot;
            if (this.selectedItemIndex != 0) {
              L39: {
                inputDerivedStateBranch = (PrefixCodeDecoder.pointerXSnapshot + FullscreenFocusCanvas.pointerPressYSnapshot - (-kd.field_c - ki.currentKeyboardEventCode)) % 8;
                if (inputDerivedStateBranch != 0) {
                  if (inputDerivedStateBranch != 1) {
                    if (inputDerivedStateBranch != 2) {
                      if (inputDerivedStateBranch == 3) {
                        oa.field_a = oa.field_a - DequeCursor.field_g;
                        kb.field_d = kb.field_d + 1;
                        if (clientControlFlowGuard == 0) {
                          break L39;
                        }
                      }
                      if (inputDerivedStateBranch != 4) {
                        if (inputDerivedStateBranch != 5) {
                          if (6 == inputDerivedStateBranch) {
                            DequeCursor.field_g = DequeCursor.field_g - 1;
                            SpriteButtonRenderer.field_r = SpriteButtonRenderer.field_r - kb.field_d;
                            if (clientControlFlowGuard == 0) {
                              break L39;
                            }
                          }
                          if (inputDerivedStateBranch != 7) {
                            break L39;
                          }
                          kb.field_d = kb.field_d - 1;
                          SpriteButtonRenderer.field_r = SpriteButtonRenderer.field_r - DequeCursor.field_g;
                          if (clientControlFlowGuard == 0) {
                            break L39;
                          }
                        }
                        kb.field_d = kb.field_d + 1;
                        SpriteButtonRenderer.field_r = SpriteButtonRenderer.field_r + DequeCursor.field_g;
                        if (clientControlFlowGuard == 0) {
                          break L39;
                        }
                      }
                      DequeCursor.field_g = DequeCursor.field_g + 1;
                      SpriteButtonRenderer.field_r = SpriteButtonRenderer.field_r + kb.field_d;
                      if (clientControlFlowGuard == 0) {
                        break L39;
                      }
                    }
                    oa.field_a = oa.field_a - kb.field_d;
                    DequeCursor.field_g = DequeCursor.field_g + 1;
                    if (clientControlFlowGuard == 0) {
                      break L39;
                    }
                  }
                  oa.field_a = oa.field_a + DequeCursor.field_g;
                  kb.field_d = kb.field_d - 1;
                  if (clientControlFlowGuard == 0) {
                    break L39;
                  }
                }
                oa.field_a = oa.field_a + kb.field_d;
                DequeCursor.field_g = DequeCursor.field_g - 1;
              }
              inputDerivedStateBranch = (ki.currentKeyboardEventCode + PrefixCodeDecoder.pointerXSnapshot - (-FullscreenFocusCanvas.pointerPressYSnapshot - kd.field_c)) % 5;
              if (0 != inputDerivedStateBranch) {
                if (inputDerivedStateBranch != 1) {
                  if (inputDerivedStateBranch == 2) {
                    UiWidget.achievementTrackingAccumulator = UiWidget.achievementTrackingAccumulator - AwtRasterBuffer.primaryAchievementTrackingCounter;
                    lb.secondaryAchievementTrackingCounter = lb.secondaryAchievementTrackingCounter - 1;
                    if (clientControlFlowGuard == 0) {
                      return;
                    }
                  }
                  if (inputDerivedStateBranch == 3) {
                    AwtRasterBuffer.primaryAchievementTrackingCounter = AwtRasterBuffer.primaryAchievementTrackingCounter + 1;
                    UiWidget.achievementTrackingAccumulator = UiWidget.achievementTrackingAccumulator + lb.secondaryAchievementTrackingCounter;
                    if (clientControlFlowGuard == 0) {
                      return;
                    }
                  }
                  if (inputDerivedStateBranch != 4) {
                    return;
                  }
                  UiWidget.achievementTrackingAccumulator = UiWidget.achievementTrackingAccumulator - lb.secondaryAchievementTrackingCounter;
                  AwtRasterBuffer.primaryAchievementTrackingCounter = AwtRasterBuffer.primaryAchievementTrackingCounter - 1;
                  if (clientControlFlowGuard == 0) {
                    return;
                  }
                }
                UiWidget.achievementTrackingAccumulator = UiWidget.achievementTrackingAccumulator + AwtRasterBuffer.primaryAchievementTrackingCounter;
                lb.secondaryAchievementTrackingCounter = lb.secondaryAchievementTrackingCounter + 1;
                if (clientControlFlowGuard == 0) {
                  return;
                }
              }
              dc.achievementTrackingBits = dc.achievementTrackingBits | lb.secondaryAchievementTrackingCounter + UiWidget.achievementTrackingAccumulator << 17;
            }
            return;
          }
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
        int orbitCenterYOrTextLeft = 0;
        int orbitXOrPageIndexOrLineHeight = 0;
        int orbitYOrParagraphWidth = 0;
        int orbitAngle = 0;
        double orbitAngleSpacing = 0.0;
        int clientControlFlowGuard = 0;
        RuntimeException caughtFailure = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          L0: {
            paragraphY = 180;
            SoftwareRasterizer.saveClip(this.savedTutorialClipBounds);
            if ((pageIndex != 0) &&
                (1 != pageIndex) &&
                (pageIndex != 2)) {
              DelayedIncomingPacket.drawNineSlicePanel(140, 30, 80, (byte) -92, 80, ll.frameNineSliceSprites);
              DelayedIncomingPacket.drawNineSlicePanel(242, 30, 80, (byte) -92, 80, ll.frameNineSliceSprites);
              if (clientControlFlowGuard == 0) {
                break L0;
              }
            }
            L2: {
              DelayedIncomingPacket.drawNineSlicePanel(140, 30, 80, (byte) -92, 80, ll.frameNineSliceSprites);
              DelayedIncomingPacket.drawNineSlicePanel(242, 30, 80, (byte) -92, 80, ll.frameNineSliceSprites);
              DelayedIncomingPacket.drawNineSlicePanel(345, 30, 80, (byte) -92, 80, ll.frameNineSliceSprites);
              ri.a(70, 180, 29497);
              HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
              SoftwareRasterizer.clearFramebuffer();
              ke.entitySpritesByThemeCategoryAndVariant[1][this.tutorialGeometryCategory][this.tutorialGeometryVariant].draw((HotspotTextWidget.spriteScratchRaster.fullWidth >> 1) - (ke.entitySpritesByThemeCategoryAndVariant[1][this.tutorialGeometryCategory][this.tutorialGeometryVariant].fullWidth >> 1), (HotspotTextWidget.spriteScratchRaster.fullHeight >> 1) - (ke.entitySpritesByThemeCategoryAndVariant[1][this.tutorialGeometryCategory][this.tutorialGeometryVariant].fullHeight >> 1));
              SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
              SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
              SoftwareRasterizer.intersectClip(50, 250, 90, 310);
              HotspotTextWidget.spriteScratchRaster.addOutline(1);
              HotspotTextWidget.spriteScratchRaster.draw(44, this.tutorialDemoTick + 200);
              SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
              SoftwareRasterizer.intersectClip(40, 355, 93, 415);
              orbitCenterX = 70;
              orbitCenterYOrTextLeft = 385;
              orbitXOrPageIndexOrLineHeight = (int)(-Math.sin(this.tutorialOrbitAngleRadians) * (double)this.tutorialOrbitRadius + 0.5) + orbitCenterX;
              orbitYOrParagraphWidth = (int)(0.5 + Math.cos(this.tutorialOrbitAngleRadians) * (double)this.tutorialOrbitRadius) + orbitCenterYOrTextLeft;
              orbitAngle = (int)(this.tutorialOrbitAngleRadians / 6.283185307179586 * 65535.0 + 0.5);
              orbitAngleSpacing = 2.0943741584421716;
              if (this.tutorialOrbitRadius != 15) {
                HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
                SoftwareRasterizer.clearFramebuffer();
                ke.entitySpritesByThemeCategoryAndVariant[1][this.tutorialGeometryCategory][this.tutorialGeometryVariant].drawRotatedCentered(HotspotTextWidget.spriteScratchRaster.fullWidth >> 1, HotspotTextWidget.spriteScratchRaster.fullHeight >> 1, orbitAngle, 3072);
                SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
                SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
                SoftwareRasterizer.intersectClip(40, 355, 103, 415);
                HotspotTextWidget.spriteScratchRaster.addOutline(1);
                HotspotTextWidget.spriteScratchRaster.draw(orbitXOrPageIndexOrLineHeight - (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1), orbitYOrParagraphWidth - (HotspotTextWidget.spriteScratchRaster.fullHeight >> 1));
                orbitAngle = (int)(0.5 + 65535.0 * ((this.tutorialOrbitAngleRadians + orbitAngleSpacing) / 6.283185307179586));
                orbitXOrPageIndexOrLineHeight = orbitCenterX + (int)(0.5 + -Math.sin(this.tutorialOrbitAngleRadians + orbitAngleSpacing) * (double)this.tutorialOrbitRadius);
                orbitYOrParagraphWidth = (int)(0.5 + Math.cos(this.tutorialOrbitAngleRadians + orbitAngleSpacing) * (double)this.tutorialOrbitRadius) + orbitCenterYOrTextLeft;
                HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
                SoftwareRasterizer.clearFramebuffer();
                ke.entitySpritesByThemeCategoryAndVariant[1][this.tutorialGeometryCategory][this.tutorialGeometryVariant].drawRotatedCentered(HotspotTextWidget.spriteScratchRaster.fullWidth >> 1, HotspotTextWidget.spriteScratchRaster.fullHeight >> 1, orbitAngle, 3072);
                SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
                SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
                SoftwareRasterizer.intersectClip(40, 355, 103, 415);
                HotspotTextWidget.spriteScratchRaster.addOutline(1);
                HotspotTextWidget.spriteScratchRaster.draw(orbitXOrPageIndexOrLineHeight - (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1), -(HotspotTextWidget.spriteScratchRaster.fullHeight >> 1) + orbitYOrParagraphWidth);
                orbitAngleSpacing = orbitAngleSpacing * 2.0;
                orbitAngle = (int)(0.5 + 65535.0 * ((orbitAngleSpacing + this.tutorialOrbitAngleRadians) / 6.283185307179586));
                orbitXOrPageIndexOrLineHeight = (int)(-Math.sin(orbitAngleSpacing + this.tutorialOrbitAngleRadians) * (double)this.tutorialOrbitRadius + 0.5) + orbitCenterX;
                orbitYOrParagraphWidth = orbitCenterYOrTextLeft + (int)(Math.cos(orbitAngleSpacing + this.tutorialOrbitAngleRadians) * (double)this.tutorialOrbitRadius + 0.5);
                HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
                SoftwareRasterizer.clearFramebuffer();
                ke.entitySpritesByThemeCategoryAndVariant[1][this.tutorialGeometryCategory][this.tutorialGeometryVariant].drawRotatedCentered(HotspotTextWidget.spriteScratchRaster.fullWidth >> 1, HotspotTextWidget.spriteScratchRaster.fullHeight >> 1, orbitAngle, 3072);
                SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
                SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
                SoftwareRasterizer.intersectClip(40, 355, 103, 415);
                HotspotTextWidget.spriteScratchRaster.addOutline(1);
                HotspotTextWidget.spriteScratchRaster.draw(orbitXOrPageIndexOrLineHeight - (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1), orbitYOrParagraphWidth - (HotspotTextWidget.spriteScratchRaster.fullHeight >> 1));
                if (clientControlFlowGuard == 0) {
                  break L2;
                }
              }
              KeyboardInputListener.field_a.setAsRasterTarget();
              SoftwareRasterizer.clearFramebuffer();
              VisualPropertyOverrides.sparkleFrames[this.tutorialEffectFrame].drawScaled(-10 + (KeyboardInputListener.field_a.fullWidth >> 1), (KeyboardInputListener.field_a.fullHeight >> 1) - 10, 20, 20);
              SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
              SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
              SoftwareRasterizer.intersectClip(40, 355, 103, 415);
              KeyboardInputListener.field_a.draw(orbitXOrPageIndexOrLineHeight - (KeyboardInputListener.field_a.fullWidth >> 1), orbitYOrParagraphWidth - (KeyboardInputListener.field_a.fullWidth >> 1));
              orbitAngle = (int)((this.tutorialOrbitAngleRadians + orbitAngleSpacing) / 6.283185307179586 * 65535.0 + 0.5);
              orbitXOrPageIndexOrLineHeight = (int)(-Math.sin(orbitAngleSpacing + this.tutorialOrbitAngleRadians) * (double)this.tutorialOrbitRadius + 0.5) + orbitCenterX;
              orbitYOrParagraphWidth = orbitCenterYOrTextLeft + (int)(0.5 + Math.cos(orbitAngleSpacing + this.tutorialOrbitAngleRadians) * (double)this.tutorialOrbitRadius);
              KeyboardInputListener.field_a.setAsRasterTarget();
              SoftwareRasterizer.clearFramebuffer();
              VisualPropertyOverrides.sparkleFrames[this.tutorialEffectFrame].drawScaled((KeyboardInputListener.field_a.fullWidth >> 1) - 10, (KeyboardInputListener.field_a.fullHeight >> 1) - 10, 20, 20);
              SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
              SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
              SoftwareRasterizer.intersectClip(40, 355, 103, 415);
              KeyboardInputListener.field_a.draw(orbitXOrPageIndexOrLineHeight - (KeyboardInputListener.field_a.fullWidth >> 1), -(KeyboardInputListener.field_a.fullWidth >> 1) + orbitYOrParagraphWidth);
              orbitAngleSpacing = orbitAngleSpacing * 2.0;
              orbitAngle = (int)(0.5 + (this.tutorialOrbitAngleRadians + orbitAngleSpacing) / 6.283185307179586 * 65535.0);
              orbitXOrPageIndexOrLineHeight = (int)(0.5 + -Math.sin(orbitAngleSpacing + this.tutorialOrbitAngleRadians) * (double)this.tutorialOrbitRadius) + orbitCenterX;
              orbitYOrParagraphWidth = orbitCenterYOrTextLeft + (int)(Math.cos(this.tutorialOrbitAngleRadians + orbitAngleSpacing) * (double)this.tutorialOrbitRadius + 0.5);
              KeyboardInputListener.field_a.setAsRasterTarget();
              SoftwareRasterizer.clearFramebuffer();
              VisualPropertyOverrides.sparkleFrames[this.tutorialEffectFrame].drawScaled((KeyboardInputListener.field_a.fullWidth >> 1) - 10, -10 + (KeyboardInputListener.field_a.fullHeight >> 1), 20, 20);
              SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
              SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
              SoftwareRasterizer.intersectClip(40, 355, 103, 415);
              KeyboardInputListener.field_a.draw(orbitXOrPageIndexOrLineHeight - (KeyboardInputListener.field_a.fullWidth >> 1), orbitYOrParagraphWidth - (KeyboardInputListener.field_a.fullWidth >> 1));
            }
            SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
          }
          DelayedIncomingPacket.drawNineSlicePanel(140, 550, 40, (byte) -92, 60, ll.frameNineSliceSprites);
          FadingDialog.uiPaletteFont.drawCenteredText(pageIndex + 1 + "/5", 580, 170, 0, -1);
          pageParagraph = null;
          orbitCenterYOrTextLeft = 155;
          orbitXOrPageIndexOrLineHeight = pageIndex;
          if (orbitXOrPageIndexOrLineHeight == 0) {
            FadingDialog.uiPaletteFont.drawText(a.field_a[0], orbitCenterYOrTextLeft, paragraphY, 0, -1);
            pageParagraph = ec.field_e[0];
            FadingDialog.uiPaletteFont.drawText(a.field_a[1], orbitCenterYOrTextLeft, paragraphY + 110, 0, -1);
          } else {
            if ((1 == orbitXOrPageIndexOrLineHeight) &&
                (clientControlFlowGuard == 0)) {
              FadingDialog.uiPaletteFont.drawText(a.field_a[2], orbitCenterYOrTextLeft, paragraphY, 0, -1);
              pageParagraph = ec.field_e[1];
            } else {
              if (orbitXOrPageIndexOrLineHeight == 2) {
                FadingDialog.uiPaletteFont.drawText(a.field_a[3], orbitCenterYOrTextLeft, paragraphY, 0, -1);
                pageParagraph = ec.field_e[2];
              } else {
                if (orbitXOrPageIndexOrLineHeight == 3) {
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
                  FadingDialog.uiPaletteFont.drawText(a.field_a[4], orbitCenterYOrTextLeft, paragraphY, 0, -1);
                  pageParagraph = ec.field_e[3];
                } else {
                  if (4 == orbitXOrPageIndexOrLineHeight) {
                    HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
                    SoftwareRasterizer.clearFramebuffer();
                    fc.blackOrbFrames[this.tutorialEffectFrame].draw(-(fc.blackOrbFrames[this.tutorialEffectFrame].fullWidth >> 1) + (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1), -(fc.blackOrbFrames[this.tutorialEffectFrame].fullHeight >> 1) + (HotspotTextWidget.spriteScratchRaster.fullHeight >> 1));
                    NodeHashTableIterator.a(0, 0, HotspotTextWidget.spriteScratchRaster.fullWidth, -27085, HotspotTextWidget.spriteScratchRaster.fullHeight);
                    SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
                    SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
                    HotspotTextWidget.spriteScratchRaster.draw(70 - (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1), 180 - (HotspotTextWidget.spriteScratchRaster.fullHeight >> 1));
                    HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
                    SoftwareRasterizer.clearFramebuffer();
                    if (this.tutorialStarFrameOrColorIndex >= 4) {
                      this.tutorialStarFrameOrColorIndex = 0;
                    }
                    DialRenderer.silverStarFrames[this.tutorialStarFrameOrColorIndex].draw(-(DialRenderer.silverStarFrames[this.tutorialStarFrameOrColorIndex].fullWidth >> 1) + (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1), (HotspotTextWidget.spriteScratchRaster.fullHeight >> 1) - (DialRenderer.silverStarFrames[this.tutorialStarFrameOrColorIndex].fullHeight >> 1));
                    NodeHashTableIterator.a(0, 0, HotspotTextWidget.spriteScratchRaster.fullWidth, -27085, HotspotTextWidget.spriteScratchRaster.fullHeight);
                    SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
                    SoftwareRasterizer.restoreClip(this.savedTutorialClipBounds);
                    HotspotTextWidget.spriteScratchRaster.draw(70 - (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1), -(HotspotTextWidget.spriteScratchRaster.fullHeight >> 1) + 282);
                    FadingDialog.uiPaletteFont.drawText(a.field_a[5], orbitCenterYOrTextLeft, paragraphY, 0, -1);
                    pageParagraph = ec.field_e[4];
                  }
                }
              }
            }
          }
          orbitXOrPageIndexOrLineHeight = IntrusiveNodeHashTable.smallFont.maxAscent + IntrusiveNodeHashTable.smallFont.maxDescent;
          if (methodGuard > -14) {
            this.handleMenuPointer(-3, -61, false, -67, true, 116);
          }
          orbitYOrParagraphWidth = 355;
          paragraphY = paragraphY + IntrusiveNodeHashTable.smallFont.drawParagraph((String) (pageParagraph), orbitCenterYOrTextLeft, paragraphY, orbitYOrParagraphWidth, 300, 0, -1, 0, 0, 16) * orbitXOrPageIndexOrLineHeight;
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
          L2: {
            actionId = InstrumentEnvelope.menuActionIds[this.screenId][itemIndex];
            selectedActionSnapshot = actionId;
            if (selectedActionSnapshot == 8) {
              L4: {
                pointerX -= 280;
                if (pointerX > 0) {
                  if (pointerX < NetworkArchiveRequest.barSprite.fullWidth) {
                    SocialListEntry.field_gb = 80 * pointerX / NetworkArchiveRequest.barSprite.fullWidth;
                    if (clientControlFlowGuard == 0) {
                      break L4;
                    }
                  }
                  SocialListEntry.field_gb = 80;
                  if (clientControlFlowGuard == 0) {
                    break L4;
                  }
                }
                SocialListEntry.field_gb = 0;
              }
              this.previewMusicVolume(0);
              if (clientControlFlowGuard == 0) {
                return;
              }
            } else {
              if (selectedActionSnapshot != 9) {
                break L2;
              }
            }
            pointerX -= 280;
            if (pointerX <= 0) {
              AsyncResourceDownloader.a(-15346, 0);
              if (clientControlFlowGuard == 0) {
                return;
              }
            }
            if (~NetworkArchiveRequest.barSprite.fullWidth < ~pointerX) {
              AsyncResourceDownloader.a(-15346, 80 * pointerX / NetworkArchiveRequest.barSprite.fullWidth);
              if (clientControlFlowGuard == 0) {
                return;
              }
            }
            AsyncResourceDownloader.a(-15346, 80);
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
          if ((unsignedByteOrCodePoint >= 128) &&
              (160 > unsignedByteOrCodePoint)) {
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
          if ((0 == this.menuPressOffset) &&
              (!this.menuPressAnimationActive)) {
            L2: {
              if (0 == this.tutorialSlideOffset) {
                if (this.keyboardSelectionActive) {
                  if (this.tutorialPageIndex != 4) {
                    break L2;
                  }
                  this.selectedItemIndex = 3;
                  if (Geoblox.clientControlFlowFlag == 0) {
                    break L2;
                  }
                }
                this.selectedItemIndex = this.hitTestMenuItem(PrefixCodeDecoder.pointerXSnapshot, PcmResampler.pointerYSnapshot, (byte) 54);
              }
            }
            this.tutorialSlideOffset = this.tutorialSlideOffset + 8;
            if (~(640 + qj.transitionCurtain.height) > ~this.tutorialSlideOffset) {
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
          if ((3 == this.screenId) &&
              (!this.tutorialSlideActive)) {
            L1: {
              if ((this.tutorialPageIndex != 4) &&
                  (this.selectedItemIndex == 3)) {
                this.selectedItemIndex = 2;
                if (Geoblox.clientControlFlowFlag == 0) {
                  break L1;
                }
              }
              if (this.tutorialPageIndex == 4) {
                if (this.selectedItemIndex == 2) {
                  this.selectedItemIndex = 1;
                }
                if ((SpriteCheckboxRenderer.previousMenuScreenId == 1) &&
                    (this.selectedItemIndex == 3)) {
                  this.selectedItemIndex = 1;
                }
              }
            }
            if ((this.tutorialPageIndex == 0) &&
                (this.selectedItemIndex == 0)) {
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
          if ((null != this.volumePreviewStream) &&
              (!this.volumePreviewStream.isSamplePositionOutOfRange()) &&
              (50 >= this.volumePreviewTicks)) {
            return;
          }
          this.volumePreviewStream = PcmSampleStream.createForPlaybackRate(fl.field_c[8], 100, SocialListEntry.field_gb);
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
          ValidationIconWidget.playPcmSample(-348, fl.field_c[29]);
          newSessionTutorialModeFlag = 0;
          suppressPressAnimationFlag = 0;
          actionId = InstrumentEnvelope.menuActionIds[this.screenId][itemIndex];
          if (methodGuard != -2) {
            this.updateTransition(-70);
          }
          L1: {
            selectedActionSnapshot = actionId;
            if ((selectedActionSnapshot == 15) &&
                (clientControlFlowGuard == 0)) {
              if (1 == SpriteCheckboxRenderer.previousMenuScreenId) {
                return;
              }
              newSessionTutorialModeFlag = 1;
            } else if (!((selectedActionSnapshot == 0) &&
                (clientControlFlowGuard == 0))) {
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
                    break L1;
                  }
                case 2:
                  if (!UnderlinedButtonRenderer.c(-100)) {
                    ScoreSubmission.requestedScreenId = 2;
                    if (clientControlFlowGuard == 0) {
                      break L1;
                    }
                  }
                  ScoreSubmission.requestedScreenId = 8;
                  if (clientControlFlowGuard == 0) {
                    break L1;
                  }
                case 3:
                  ScoreSubmission.requestedScreenId = 3;
                  if (clientControlFlowGuard == 0) {
                    break L1;
                  }
                case 4:
                  if (InstrumentPatch.field_n == null) {
                    this.fullscreenDialogActive = true;
                  }
                  if ((!ArchiveCatalog.b(255)) &&
                      (TextTemplateDefinition.field_n > 0) &&
                      (ContextualRuntimeException.a(MenuScreen.platformTaskDispatcher, (byte) 37))) {
                    MessageDialog.requestFullscreen((byte) -128);
                  }
                  this.fullscreenDialogButtonIndex = 0;
                  this.pointerInteractionActive = false;
                  this.activeTicks = 0;
                  if (clientControlFlowGuard == 0) {
                    break L1;
                  }
                case 14:
                  InstrumentPatch.earnedAchievementMask = 0;
                  ug.newAchievementMask = 0;
                  SecondaryNodeDeque.receivedAchievementMask = -2147483648;
                case 5:
                  if ((2 != this.screenId) &&
                      (this.screenId != 4) &&
                      (6 != this.screenId) &&
                      (SpriteCheckboxRenderer.previousMenuScreenId == 1)) {
                    ScoreSubmission.requestedScreenId = 1;
                    if (clientControlFlowGuard == 0) {
                      break L1;
                    }
                  }
                  ScoreSubmission.requestedScreenId = 0;
                  if (clientControlFlowGuard == 0) {
                    break L1;
                  }
                case 13:
                  if (null != UiWidget.gameplaySession) {
                    UiWidget.gameplaySession.submitScore((byte) -70);
                  }
                  L30: {
                    ScoreSubmission.requestedScreenId = -1;
                    if (this.screenId != 8) {
                      if (!((4 == this.screenId) &&
                          (null != UiWidget.gameplaySession) &&
                          (UiWidget.gameplaySession.newActionCount == 0))) {
                        if (this.screenId != 7) {
                          UiWidget.gameplayReturnScreenId = 6;
                          if (clientControlFlowGuard == 0) {
                            break L30;
                          }
                        }
                        UiWidget.gameplayReturnScreenId = 5;
                        if (clientControlFlowGuard == 0) {
                          break L30;
                        }
                      }
                    }
                    UiWidget.gameplayReturnScreenId = 2;
                  }
                  ProxySocketConnector.gameplayOriginScreenId = this.screenId;
                  if (clientControlFlowGuard == 0) {
                    break L1;
                  }
                case 6:
                  L34: {
                    UiWidget.gameplaySession.emitPointsPopup(false);
                    UiWidget.gameplaySession.addScore((byte) 127, WidgetTheme.collectUnfinishedPopupPoints(methodGuard ^ 25864));
                    UiWidget.gameplaySession.addScore((byte) 127, UiWidget.gameplaySession.resultBonusPoints);
                    UiWidget.gameplaySession.resultBonusPoints = 0;
                    if (UnderlinedButtonRenderer.c(-114)) {
                      if (!((!UiWidget.gameplaySession.tutorialMode) &&
                            (UiWidget.gameplaySession.score == 0) &&
                            (ug.newAchievementMask == 0)) &&
                          !((UiWidget.gameplaySession.tutorialMode) &&
                            (UiWidget.gameplaySession.updateTick < 750))) {
                        if ((0 == UiWidget.gameplaySession.score) &&
                            (0 == ug.newAchievementMask)) {
                          ScoreSubmission.requestedScreenId = 0;
                          if (clientControlFlowGuard == 0) {
                            break L34;
                          }
                        }
                        ScoreSubmission.requestedScreenId = 4;
                        if (clientControlFlowGuard == 0) {
                          break L34;
                        }
                      }
                      ScoreSubmission.requestedScreenId = 0;
                      if (clientControlFlowGuard == 0) {
                        break L34;
                      }
                    }
                    if ((UiWidget.gameplaySession.score == 0) &&
                        (ug.newAchievementMask == 0)) {
                      ScoreSubmission.requestedScreenId = 0;
                      if (clientControlFlowGuard == 0) {
                        break L34;
                      }
                    }
                    UiWidget.gameplaySession.submitScore((byte) -70);
                    if (0 < UiWidget.gameplaySession.newActionCount) {
                      ScoreSubmission.requestedScreenId = 6;
                      if (clientControlFlowGuard == 0) {
                        break L34;
                      }
                    }
                    ScoreSubmission.requestedScreenId = 2;
                  }
                  IntrusiveNodeHashTable.a(methodGuard + 2, ll.field_d);
                  if (clientControlFlowGuard == 0) {
                    break L1;
                  }
                case 7:
                  gf.a(NodeHashTableIterator.c(methodGuard ^ -125), 62);
                  if (clientControlFlowGuard == 0) {
                    break L1;
                  }
                case 12:
                  if (!((this.tutorialPageIndex < 4) &&
                        (!this.tutorialSlideActive))) {
                    suppressPressAnimationFlag = 1;
                    if (clientControlFlowGuard == 0) {
                      break L1;
                    }
                  }
                  this.previousTutorialPageIndex = this.tutorialPageIndex;
                  this.tutorialPageIndex = this.tutorialPageIndex + 1;
                  this.tutorialSlideForward = true;
                  this.tutorialSlideActive = true;
                  if (clientControlFlowGuard == 0) {
                    break L1;
                  }
                case 11:
                  if (!((this.tutorialPageIndex > 0) &&
                        (!this.tutorialSlideActive))) {
                    suppressPressAnimationFlag = 1;
                    if (clientControlFlowGuard == 0) {
                      break L1;
                    }
                  }
                  this.previousTutorialPageIndex = this.tutorialPageIndex;
                  this.tutorialSlideActive = true;
                  this.tutorialPageIndex = this.tutorialPageIndex - 1;
                  this.tutorialSlideForward = false;
                  if (clientControlFlowGuard == 0) {
                    break L1;
                  }
                case 10:
                  if (UnderlinedButtonRenderer.c(-112)) {
                    ScoreSubmission.requestedScreenId = 7;
                    if (clientControlFlowGuard == 0) {
                      break L1;
                    }
                  }
                  ScoreSubmission.requestedScreenId = 5;
                  if (clientControlFlowGuard == 0) {
                    break L1;
                  }
                case 16:
                  da.field_c = 0;
                  if (clientControlFlowGuard == 0) {
                    break L1;
                  }
                case 17:
                  da.field_c = 1;
                  if (clientControlFlowGuard == 0) {
                    break L1;
                  }
                case 18:
                  break;
                default:
                  break L1;
              }
              da.field_c = 2;
              break L1;
            }
            L47: {
              if (newSessionTutorialModeFlag == 0) {
                if ((UnderlinedButtonRenderer.c(methodGuard ^ 107)) &&
                    (kc.sessionStartAttemptCount == 0)) {
                  newSessionTutorialModeFlag = 1;
                  if (clientControlFlowGuard == 0) {
                    break L47;
                  }
                }
                if ((FifoResponseToken.activeHighscoreQuery != null) &&
                    (FifoResponseToken.activeHighscoreQuery.completed) &&
                    (FifoResponseToken.activeHighscoreQuery.namesByView != null)) {
                  scoreCategoryNames = FifoResponseToken.activeHighscoreQuery.namesByView[1];
                  missingFirstScoreNameFlag = (scoreCategoryNames[0] != null) ? 0 : 1;
                  newSessionTutorialModeFlag = missingFirstScoreNameFlag;
                }
              }
            }
            kc.sessionStartAttemptCount = kc.sessionStartAttemptCount + 1;
            pg.resetGameplayDifficulty(methodGuard ^ -9410);
            UiWidget.gameplaySession = new GameplaySession(this.gameApplet, newSessionTutorialModeFlag != 0);
            PointerInputListener.a((byte) -39);
            ScoreSubmission.requestedScreenId = -1;
          }
          if (suppressPressAnimationFlag == 0) {
            this.menuPressAnimationActive = true;
            a.field_e = -1;
          }
          if (~this.screenId != ~ScoreSubmission.requestedScreenId) {
            if ((this.screenId != 1) &&
                (this.screenId != 0)) {
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
          L0: {
            actionId = InstrumentEnvelope.menuActionIds[this.screenId][itemIndex];
            if (actionId == 8) {
              if (SocialListEntry.field_gb >= 70) {
                SocialListEntry.field_gb = 80;
                if (clientControlFlowGuard == 0) {
                  break L0;
                }
              }
              SocialListEntry.field_gb = SocialListEntry.field_gb + 10;
              if (clientControlFlowGuard == 0) {
                break L0;
              }
            } else {
              if (9 != actionId) {
                break L0;
              }
            }
            if (SpriteCheckboxRenderer.field_c >= 70) {
              AsyncResourceDownloader.a(-15346, 80);
              if (clientControlFlowGuard == 0) {
                break L0;
              }
            }
            AsyncResourceDownloader.a(-15346, 10 + SpriteCheckboxRenderer.field_c);
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
            if ((itemIndex == 0) &&
                (displayedTutorialPageIndex == 0)) {
              return;
            }
            if ((!(itemIndex != 2) &&
                !(displayedTutorialPageIndex != 4))) {
              return;
            }
          }
          actionId = InstrumentEnvelope.menuActionIds[this.screenId][itemIndex];
          actionText = RasterTargetSnapshot.field_f[actionId];
          if (actionId == 15) {
            if (!((displayedTutorialPageIndex == 4) &&
                (SpriteCheckboxRenderer.previousMenuScreenId != 1))) {
              return;
            }
          }
          if ((3 == this.screenId) &&
              (this.tutorialSlideActive) &&
              (this.tutorialPageIndex == 4) &&
              (SpriteCheckboxRenderer.previousMenuScreenId != 1) &&
              (itemIndex == 2) &&
              (this.selectedItemIndex == 3)) {
            selected = true;
          }
          L7: {
            if (!((this.screenId != 3) &&
                  (this.screenId != 2))) {
              rowY += 280;
              if (clientControlFlowGuard == 0) {
                break L7;
              }
            }
            if ((this.screenId != 5) &&
                (this.screenId != 7) &&
                (this.screenId != 6) &&
                (this.screenId != 4)) {
              break L7;
            }
            rowY += 295;
          }
          L11: {
            rowFont = FadingDialog.uiPaletteFont;
            buttonTextCenter = 320;
            buttonLeft = 160;
            if (!((0 != this.screenId) &&
                (this.screenId != 1))) {
              buttonWidth = 322;
              if (clientControlFlowGuard == 0) {
                break L11;
              }
            }
            buttonWidth = rowFont.measureMaximumWrappedWidth(actionText, 400);
          }
          L14: {
            if ((this.screenId != 3) &&
                (this.screenId != 2) &&
                (this.screenId != 6)) {
              if ((this.screenId != 7) &&
                  (this.screenId != 8)) {
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
                    break L14;
                  }
                }
                L20: {
                  buttonWidth = 278;
                  buttonLeft = 320 - (buttonWidth + 20 >> 1);
                  if (actionId != 13) {
                    rowY = 395;
                    if (clientControlFlowGuard == 0) {
                      break L20;
                    }
                  }
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
                  break L14;
                }
              }
              L23: {
                rowY = 437;
                if (actionId == 13) {
                  buttonLeft = 121;
                  buttonTextCenter = (buttonWidth >> 1) + buttonLeft + 10;
                  if (clientControlFlowGuard == 0) {
                    break L23;
                  }
                }
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
                break L14;
              }
            }
            L26: {
              if (this.screenId != 3) {
                buttonWidth = 160;
                if (clientControlFlowGuard == 0) {
                  break L26;
                }
              }
              buttonWidth = 123;
            }
            L28: {
              itemColumnOrPressOffset = (rowY + (-280 - this.firstItemY)) / this.itemSpacing;
              buttonTextCenter = 320 + (buttonWidth + 20) * (itemColumnOrPressOffset - 1);
              buttonLeft = -(buttonWidth >> 1) + buttonTextCenter;
              if (6 == this.screenId) {
                buttonTextCenter += 86;
                rowY = 430;
                buttonLeft += 86;
                if (clientControlFlowGuard == 0) {
                  break L28;
                }
              }
              if (this.screenId == 3) {
                buttonTextCenter = 9 + (320 + (15 + buttonWidth) * (itemColumnOrPressOffset - 1));
                rowY = 430;
                buttonLeft = buttonTextCenter - (buttonWidth >> 1);
                if (15 != actionId) {
                  break L28;
                }
                buttonLeft -= 138;
                buttonWidth = 229;
                buttonTextCenter = (buttonWidth >> 1) + buttonLeft;
                if (clientControlFlowGuard == 0) {
                  break L28;
                }
              }
              rowY = 380;
              if (actionId == 5) {
                buttonWidth = 83;
                buttonTextCenter = 320;
                rowY += 50;
                buttonLeft = buttonTextCenter - (buttonWidth >> 1);
              }
            }
            L31: {
              if (!selected) {
                DelayedIncomingPacket.drawNineSlicePanel(rowY, buttonLeft, 40, (byte) -92, buttonWidth, ArchiveLoadSequence.mouseBoxFrames);
                if (clientControlFlowGuard == 0) {
                  break L31;
                }
              }
              buttonTextCenter = buttonTextCenter + this.menuPressOffset;
              buttonLeft = buttonLeft + this.menuPressOffset;
              rowY = rowY - this.menuPressOffset;
              DelayedIncomingPacket.drawNineSlicePanel(rowY, buttonLeft, 40, (byte) -92, buttonWidth, ArchiveLoadSequence.mouseBoxFrames);
            }
            rowY += 2;
          }
          L33: {
            if (selected) {
              FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.field_p] = 15488514;
              itemColumnOrPressOffset = this.menuPressOffset;
              if (clientControlFlowGuard == 0) {
                break L33;
              }
            }
            itemColumnOrPressOffset = 0;
          }
          L35: {
            if (!((actionId != 8) &&
                  (9 != actionId))) {
              rowFont.drawRightAlignedText(actionText, 285 + itemColumnOrPressOffset, 30 + rowY, 0, -1);
              NetworkArchiveRequest.barSprite.draw(itemColumnOrPressOffset + 280, rowY + 15);
              if (actionId == 8) {
                volumeLevelSnapshot = SocialListEntry.field_gb;
              } else {
                volumeLevelSnapshot = SpriteCheckboxRenderer.field_c;
              }
              volumeLevelOrSliderOffset = volumeLevelSnapshot;
              volumeLevelOrSliderOffset = volumeLevelOrSliderOffset * (-4 + NetworkArchiveRequest.barSprite.fullWidth) / 80;
              RankedListQuery.widgetSprite.draw(280 + volumeLevelOrSliderOffset - 1 + itemColumnOrPressOffset, 9 + rowY);
              if (clientControlFlowGuard == 0) {
                break L35;
              }
            }
            rowFont.drawCenteredText(actionText, buttonTextCenter, rowY + 30, 0, -1);
          }
          FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.field_p] = 16689938;
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
          L1: {
            if ((!(!this.fullscreenDialogActive) ||
                (!(this.screenId == 0) &&
                  !(1 == this.screenId) &&
                  !(this.screenId == 4)))) {
              L4: {
                if (ki.currentKeyboardEventCode == 96) {
                  if (this.fullscreenDialogActive) {
                    if (this.fullscreenDialogButtonIndex == 0) {
                      break L4;
                    }
                    this.fullscreenDialogButtonIndex = 0;
                    if (clientControlFlowGuard == 0) {
                      break L4;
                    }
                  }
                  if (0 >= this.selectedItemIndex) {
                    this.selectedItemIndex = this.itemCount;
                  }
                  this.selectedItemIndex = this.selectedItemIndex - 1;
                  this.keyboardSelectionActive = true;
                  this.skipUnavailableTutorialItemsBackward((byte) 89);
                  if (clientControlFlowGuard == 0) {
                    break L4;
                  }
                }
                if (ki.currentKeyboardEventCode != 97) {
                  if ((ki.currentKeyboardEventCode == 98) &&
                      (2 == this.screenId)) {
                    if (this.selectedItemIndex < 0) {
                      this.selectedItemIndex = 3;
                      if (clientControlFlowGuard == 0) {
                        break L4;
                      }
                    }
                    if (5 != InstrumentEnvelope.menuActionIds[this.screenId][this.selectedItemIndex]) {
                      break L4;
                    }
                    this.selectedItemIndex = 1;
                    if (clientControlFlowGuard == 0) {
                      break L4;
                    }
                  }
                  if (ki.currentKeyboardEventCode != 99) {
                    break L4;
                  }
                  if (this.screenId != 2) {
                    break L4;
                  }
                  if (this.selectedItemIndex < 0) {
                    this.selectedItemIndex = 1;
                    if (clientControlFlowGuard == 0) {
                      break L4;
                    }
                  }
                  if (InstrumentEnvelope.menuActionIds[this.screenId][this.selectedItemIndex] == 5) {
                    break L4;
                  }
                  this.selectedItemIndex = 3;
                  if (clientControlFlowGuard == 0) {
                    break L4;
                  }
                }
                if (this.fullscreenDialogActive) {
                  if (this.fullscreenDialogButtonIndex == 1) {
                    break L4;
                  }
                  if ((!UnderlinedButtonRenderer.c(-122)) &&
                      (TextTemplateDefinition.field_n <= 0)) {
                    break L4;
                  }
                  this.fullscreenDialogButtonIndex = 1;
                  if (clientControlFlowGuard == 0) {
                    break L4;
                  }
                }
                this.selectedItemIndex = this.selectedItemIndex + 1;
                this.keyboardSelectionActive = true;
                if (this.itemCount <= this.selectedItemIndex) {
                  this.selectedItemIndex = 0;
                }
                this.skipUnavailableTutorialItemsForward((byte) -117);
              }
              if (0 > this.selectedItemIndex) {
                break L1;
              }
              this.handleMenuKey(this.selectedItemIndex, -49);
              if (clientControlFlowGuard == 0) {
                break L1;
              }
            }
            if (ki.currentKeyboardEventCode == 98) {
              if (0 >= this.selectedItemIndex) {
                this.selectedItemIndex = this.itemCount;
              }
              this.selectedItemIndex = this.selectedItemIndex - 1;
              this.keyboardSelectionActive = true;
              this.skipUnavailableTutorialItemsBackward((byte) 89);
              if (clientControlFlowGuard == 0) {
                break L1;
              }
            }
            if (ki.currentKeyboardEventCode == 99) {
              this.selectedItemIndex = this.selectedItemIndex + 1;
              if (this.selectedItemIndex >= this.itemCount) {
                this.selectedItemIndex = 0;
              }
              this.keyboardSelectionActive = true;
              this.skipUnavailableTutorialItemsForward((byte) -107);
              if (clientControlFlowGuard == 0) {
                break L1;
              }
            }
            if (0 <= this.selectedItemIndex) {
              this.handleMenuKey(this.selectedItemIndex, -29);
            }
          }
          if ((ki.currentKeyboardEventCode == 69) &&
              (this.screenId == 3) &&
              (this.tutorialPageIndex < 4)) {
            this.tutorialPageIndex = this.tutorialPageIndex + 1;
            if (clientControlFlowGuard == 0) {
              return;
            }
          }
          if ((ki.currentKeyboardEventCode == 41) &&
              (this.screenId == 3) &&
              (this.tutorialPageIndex > 0)) {
            this.tutorialPageIndex = this.tutorialPageIndex - 1;
            if (clientControlFlowGuard == 0) {
              return;
            }
          }
          if ((13 == ki.currentKeyboardEventCode) &&
              (!this.fullscreenDialogActive) &&
              (4 != this.screenId)) {
            L22: {
              if (this.screenId == 1) {
                ScoreSubmission.requestedScreenId = -1;
                if (clientControlFlowGuard == 0) {
                  break L22;
                }
              }
              if ((this.screenId != 6) &&
                  (this.screenId != 2)) {
                ScoreSubmission.requestedScreenId = SpriteCheckboxRenderer.previousMenuScreenId;
                if (clientControlFlowGuard == 0) {
                  break L22;
                }
              }
              ScoreSubmission.requestedScreenId = 0;
            }
            if (~this.screenId != ~ScoreSubmission.requestedScreenId) {
              if ((this.screenId != 1) &&
                  (this.screenId != 0)) {
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
