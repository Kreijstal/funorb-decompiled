/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextInputRenderer extends TextWidgetRenderer {
    static ClientProtocolStage awaitingLoginFailureTextStage;
    static int alternateSessionServerPort;
    static String[] mustLoginAlternateTexts;
    static TextWidgetRenderer sharedDefaultTextWidgetRenderer;
    static int[] secondVertexTransformedY;
    static int germsThemeCompletionAchievementId;

    TextInputRenderer(BitmapFont font, int textColor) {
        super(font, 4, 2, 2, 2, textColor, -1, 0, 1, font.maxAscent, -1, 2147483647, false);
    }

    TextInputRenderer(int textColor) {
        this(DialogLayer.sharedUiFont, textColor);
    }

    public final void drawWidget(int parentX, int methodGuard, int parentY, boolean widgetEnabled, UiWidget widget) {
        try {
            if (widgetEnabled) {
                EntityLinkSupport.drawGradientWidgetBorder(parentX + widget.widgetX, widget.widgetHeight, widget.widgetY + parentY, widget.widgetWidth, -1540604944);
            }
            if (methodGuard > -5) {
                sharedDefaultTextWidgetRenderer = (TextWidgetRenderer) null;
            }
            super.drawWidget(parentX, -11, parentY, widgetEnabled, widget);
        } catch (RuntimeException widgetDrawFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) widgetDrawFailure), "ac.E(" + parentX + ',' + methodGuard + ',' + parentY + ',' + widgetEnabled + ',' + (widget != null ? "{...}" : "null") + ')');
        }
    }

    final static UsernameAvailabilityQuery createSuggestedUsernameQuery(int methodGuard, String[] suggestions) {
        UsernameAvailabilityQuery query = null;
        RuntimeException queryFailureForContext = null;
        UsernameAvailabilityQuery nullQueryResult = null;
        UsernameAvailabilityQuery queryResult = null;
        RuntimeException queryFailureBeforeContext = null;
        StringBuilder queryMessagePrefix = null;
        String suggestionsDescription = null;
        RuntimeException caughtQueryFailure = null;
        try {
          if (methodGuard != 28) {
            nullQueryResult = (UsernameAvailabilityQuery) null;
            return nullQueryResult;
          }
          query = new UsernameAvailabilityQuery(false);
          query.suggestedUsernames = suggestions;
          queryResult = query;
          return queryResult;
        } catch (java.lang.RuntimeException queryFailure) {
          caughtQueryFailure = queryFailure;
          queryFailureForContext = caughtQueryFailure;
          queryFailureBeforeContext = queryFailureForContext;
          queryMessagePrefix = new StringBuilder().append("ac.A(").append(methodGuard).append(',');
          if (suggestions == null) {
            suggestionsDescription = "null";
          } else {
            suggestionsDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) queryFailureBeforeContext), ((StringBuilder) (Object) queryMessagePrefix).append(suggestionsDescription).append(')').toString());
        }
    }

    final static boolean readBooleanBit(byte methodGuard, PacketBuffer packet) {
        RuntimeException readFailureForContext = null;
        boolean booleanValueBeforeReturn = false;
        RuntimeException readFailureBeforeDescription = null;
        StringBuilder readMessagePrefix = null;
        String packetDescription = null;
        RuntimeException caughtReadFailure = null;
        try {
          if (methodGuard < 6) {
            TextInputRenderer.releaseStaticReferences((byte) -125);
          }
          booleanValueBeforeReturn = !(1 != packet.readBits((byte) -17, 1));
          return booleanValueBeforeReturn;
        } catch (java.lang.RuntimeException readFailure) {
          caughtReadFailure = readFailure;
          readFailureForContext = caughtReadFailure;
          readFailureBeforeDescription = readFailureForContext;
          readMessagePrefix = new StringBuilder().append("ac.B(").append(methodGuard).append(',');
          if (packet == null) {
            packetDescription = "null";
          } else {
            packetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) readFailureBeforeDescription), ((StringBuilder) (Object) readMessagePrefix).append(packetDescription).append(')').toString());
        }
    }

    final static void renderAchievementDetails(boolean keepDefaultVerticalOffsets, boolean newAchievementsOnly, byte methodGuard) {
        int displayedIconCountBeforeIncrement = 0;
        int coinIconIndex = 0;
        int achievementMaskBeforeStore = 0;
        int titleYBase = 0;
        int titleYOffset = 0;
        RuntimeException caughtRenderFailure = null;
        int gridX = 0;
        RuntimeException renderFailureForContext = null;
        int gridY = 0;
        int achievementMask = 0;
        int displayedIconCount = 0;
        int highlightedAchievementIndex = 0;
        int hiddenAchievementCenteringOffset = 0;
        int hiddenAchievementCount = 0;
        int achievementIndexOrTitleY = 0;
        int descriptionLineStep = 0;
        int descriptionY = 0;
        int unusedClientControlSnapshot = 0;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          gridX = 160;
          gridY = 190;
          if (!keepDefaultVerticalOffsets) {
            gridY -= 10;
          }
          if (!newAchievementsOnly) {
            achievementMaskBeforeStore = InstrumentPatch.earnedAchievementMask;
          } else {
            achievementMaskBeforeStore = ScorePopupSupport.newAchievementMask;
          }
          achievementMask = achievementMaskBeforeStore;
          displayedIconCount = 0;
          highlightedAchievementIndex = BoardEntityState.selectedAchievementIndex;
          hiddenAchievementCenteringOffset = 0;
          hiddenAchievementCount = 0;
          if (newAchievementsOnly) {
            for (achievementIndexOrTitleY = 16; achievementIndexOrTitleY >= 0; achievementIndexOrTitleY--) {
              if ((!((!ClientOptionSupport.isClientOptionEnabled(0, -100)) &&
                    (achievementIndexOrTitleY == 16))) &&
                  ((1 << achievementIndexOrTitleY & achievementMask) == 0)) {
                hiddenAchievementCount++;
                hiddenAchievementCenteringOffset += 20;
              }
            }
          }
          if (8 <= hiddenAchievementCount) {
            gridX = gridX + (-160 + hiddenAchievementCenteringOffset);
          }
          for (achievementIndexOrTitleY = 0; achievementIndexOrTitleY < GameplaySetupSupport.achievementTitles.length; achievementIndexOrTitleY++) {
            if ((!ClientOptionSupport.isClientOptionEnabled(0, -119)) &&
                (achievementIndexOrTitleY == 16) &&
                (!AchievementQuery.hasReceivedAchievementSixteen(105))) {
              continue;
            }
            if ((!((0 == (1 << achievementIndexOrTitleY & achievementMask)) &&
                  (newAchievementsOnly))) &&
                ((PrefixCodeDecoder.pointerXSnapshot >= gridX) &&
                  (32 + gridX >= PrefixCodeDecoder.pointerXSnapshot) &&
                  (gridY <= PcmResampler.pointerYSnapshot) &&
                  (32 + gridY >= PcmResampler.pointerYSnapshot))) {
              SoftwareRasterizer.fillRoundedRectangle(gridX, gridY, 32, 32, 2, 16689938);
              if (highlightedAchievementIndex < 0) {
                highlightedAchievementIndex = achievementIndexOrTitleY;
              }
              SoftwareRasterizer.drawRoundedRectangle(2 + gridX, gridY + 2, 28, 28, 2, 16777215);
            }
            if (achievementIndexOrTitleY == BoardEntityState.selectedAchievementIndex) {
              SoftwareRasterizer.fillRoundedRectangle(gridX, gridY, 32, 32, 2, 15488514);
              SoftwareRasterizer.drawRoundedRectangle(gridX + 2, gridY + 2, 28, 28, 2, 16777215);
            }
            if ((achievementMask & 1 << achievementIndexOrTitleY) == 0) {
              if (newAchievementsOnly) {
                continue;
              }
              IntKeyLookup.unachievedSprite.drawQuarterSize(gridX, gridY);
            } else {
              UsernameAvailabilityQuery.achievementSprites[achievementIndexOrTitleY].drawQuarterSize(gridX, gridY);
            }
            displayedIconCountBeforeIncrement = displayedIconCount;
            displayedIconCount++;
            if (displayedIconCountBeforeIncrement == 7) {
              gridY += 40;
              gridX = 160;
              if (!keepDefaultVerticalOffsets) {
                gridY += 5;
              }
              if (!newAchievementsOnly) {
                continue;
              }
              if (hiddenAchievementCount < 8) {
                gridX = gridX + hiddenAchievementCenteringOffset;
              }
            } else {
              gridX += 40;
            }
          }
          titleYBase = 190;
          if (!keepDefaultVerticalOffsets) {
            titleYOffset = -20;
          } else {
            titleYOffset = -2;
          }
          achievementIndexOrTitleY = titleYBase + titleYOffset;
          if (highlightedAchievementIndex != -1) {
            IntrusiveNodeHashTable.smallFont.drawCenteredText(GameplaySetupSupport.achievementTitles[highlightedAchievementIndex], 315, achievementIndexOrTitleY, 0, -1);
            descriptionLineStep = -IntrusiveNodeHashTable.smallFont.maxDescent + IntrusiveNodeHashTable.smallFont.maxAscent;
            descriptionY = 280;
            if (0 != (1 << highlightedAchievementIndex & achievementMask)) {
              UsernameAvailabilityQuery.achievementSprites[highlightedAchievementIndex].draw(160, descriptionY);
              descriptionY += 30;
              FadingDialog.uiPaletteFont.drawText(ClientFlowState.achievedText, 318, descriptionY, 0, -1);
            } else {
              IntKeyLookup.unachievedSprite.draw(160, descriptionY);
              descriptionY += 30;
              FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 15488514;
              FadingDialog.uiPaletteFont.drawText(DebouncedValidationProvider.notAchievedText, 318, descriptionY, 0, -1);
              FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 16689938;
            }
            descriptionY = descriptionY + (IntrusiveNodeHashTable.smallFont.drawParagraph(LoginProtocolSupport.achievementDescriptions[highlightedAchievementIndex], 318, descriptionY, 190, 200, 0, -1, 0, 0, 16) * descriptionLineStep + descriptionLineStep);
            descriptionY += 10;
            IntrusiveNodeHashTable.smallFont.drawText(OpacityWidget.replaceIndexedTextMarkers(UsernameAvailabilityQuery.orbPointsText, new String[]{Integer.toString(AlternateLongAndTextLoginPayload.achievementDisplayedOrbPoints[highlightedAchievementIndex])}, (byte) -50), 318, 360, 0, -1);
            for (coinIconIndex = 0; coinIconIndex < SocketArchiveNetworkClient.achievementOrbCoinIconCounts[highlightedAchievementIndex]; coinIconIndex++) {
              UsernameAvailabilityValidator.orbCoinSprite.drawQuarterSize(318 + 10 * coinIconIndex, 370);
            }
            descriptionY = descriptionY + descriptionLineStep;
          } else {
            IntrusiveNodeHashTable.smallFont.drawCenteredText(SessionSocketSupport.mouseOverIconText, 315, achievementIndexOrTitleY, 0, -1);
            if (UnderlinedButtonRenderer.isGuestSessionMode(-94)) {
              FadingDialog.uiPaletteFont.drawParagraph(MessageDialogContent.createToUseText, 125, 350, 395, 100, 0, -1, 1, 0, 26);
            }
          }
          if (methodGuard > -61) {
            germsThemeCompletionAchievementId = 108;
          }
          return;
        } catch (java.lang.RuntimeException renderFailure) {
          caughtRenderFailure = renderFailure;
          renderFailureForContext = caughtRenderFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) renderFailureForContext), "ac.D(" + keepDefaultVerticalOffsets + ',' + newAchievementsOnly + ',' + methodGuard + ')');
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        sharedDefaultTextWidgetRenderer = null;
        mustLoginAlternateTexts = null;
        secondVertexTransformedY = null;
        awaitingLoginFailureTextStage = null;
        if (methodGuard < 62) {
            alternateSessionServerPort = -128;
        }
    }

    static {
        awaitingLoginFailureTextStage = new ClientProtocolStage();
        mustLoginAlternateTexts = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        secondVertexTransformedY = new int[8192];
        germsThemeCompletionAchievementId = 11;
    }
}
