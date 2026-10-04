/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextInputRenderer extends TextWidgetRenderer {
    static ClientProtocolStage awaitingLoginFailureTextStage;
    static int alternateSessionServerPort;
    static String[] mustLoginAlternateTexts;
    static TextWidgetRenderer sharedDefaultTextWidgetRenderer;
    static int[] secondVertexTransformedY;
    static int field_u;

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
          query.field_a = suggestions;
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

    final static boolean a(byte param0, PacketBuffer param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 6) {
            TextInputRenderer.a((byte) -125);
          }
          stackIn_5_0 = !(1 != param1.readBits((byte) -17, 1));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ac.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        int incrementValue$0 = 0;
        int var13 = 0;
        int stackIn_7_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_60_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        var14 = Geoblox.clientControlFlowFlag;
        try {
          var3_int = 160;
          var4 = 190;
          if (!param0) {
            var4 -= 10;
          }
          if (!param1) {
            stackIn_7_0 = InstrumentPatch.earnedAchievementMask;
          } else {
            stackIn_7_0 = ScorePopupSupport.newAchievementMask;
          }
          var5 = stackIn_7_0;
          var6 = 0;
          var7 = BoardEntityState.selectedAchievementIndex;
          var8 = 0;
          var9 = 0;
          if (param1) {
            for (var10 = 16; var10 >= 0; var10--) {
              if ((!((!ClientOptionSupport.isClientOptionEnabled(0, -100)) &&
                    (var10 == 16))) &&
                  ((1 << var10 & var5) == 0)) {
                var9++;
                var8 += 20;
              }
            }
          }
          if (8 <= var9) {
            var3_int = var3_int + (-160 + var8);
          }
          for (var10 = 0; var10 < GameplaySetupSupport.achievementTitles.length; var10++) {
            if ((!ClientOptionSupport.isClientOptionEnabled(0, -119)) &&
                (var10 == 16) &&
                (!AchievementQuery.hasReceivedAchievementSixteen(105))) {
              continue;
            }
            if ((!((0 == (1 << var10 & var5)) &&
                  (param1))) &&
                ((PrefixCodeDecoder.pointerXSnapshot >= var3_int) &&
                  (32 + var3_int >= PrefixCodeDecoder.pointerXSnapshot) &&
                  (var4 <= PcmResampler.pointerYSnapshot) &&
                  (32 + var4 >= PcmResampler.pointerYSnapshot))) {
              SoftwareRasterizer.fillRoundedRectangle(var3_int, var4, 32, 32, 2, 16689938);
              if (var7 < 0) {
                var7 = var10;
              }
              SoftwareRasterizer.drawRoundedRectangle(2 + var3_int, var4 + 2, 28, 28, 2, 16777215);
            }
            if (var10 == BoardEntityState.selectedAchievementIndex) {
              SoftwareRasterizer.fillRoundedRectangle(var3_int, var4, 32, 32, 2, 15488514);
              SoftwareRasterizer.drawRoundedRectangle(var3_int + 2, var4 + 2, 28, 28, 2, 16777215);
            }
            if ((var5 & 1 << var10) == 0) {
              if (param1) {
                continue;
              }
              IntKeyLookup.unachievedSprite.drawQuarterSize(var3_int, var4);
            } else {
              UsernameAvailabilityQuery.achievementSprites[var10].drawQuarterSize(var3_int, var4);
            }
            incrementValue$0 = var6;
            var6++;
            if (incrementValue$0 == 7) {
              var4 += 40;
              var3_int = 160;
              if (!param0) {
                var4 += 5;
              }
              if (!param1) {
                continue;
              }
              if (var9 < 8) {
                var3_int = var3_int + var8;
              }
            } else {
              var3_int += 40;
            }
          }
          stackIn_59_0 = 190;
          if (!param0) {
            stackIn_60_1 = -20;
          } else {
            stackIn_60_1 = -2;
          }
          var10 = stackIn_59_0 + stackIn_60_1;
          if (var7 != -1) {
            IntrusiveNodeHashTable.smallFont.drawCenteredText(GameplaySetupSupport.achievementTitles[var7], 315, var10, 0, -1);
            var11 = -IntrusiveNodeHashTable.smallFont.maxDescent + IntrusiveNodeHashTable.smallFont.maxAscent;
            var12 = 280;
            if (0 != (1 << var7 & var5)) {
              UsernameAvailabilityQuery.achievementSprites[var7].draw(160, var12);
              var12 += 30;
              FadingDialog.uiPaletteFont.drawText(ClientFlowState.achievedText, 318, var12, 0, -1);
            } else {
              IntKeyLookup.unachievedSprite.draw(160, var12);
              var12 += 30;
              FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 15488514;
              FadingDialog.uiPaletteFont.drawText(DebouncedValidationProvider.notAchievedText, 318, var12, 0, -1);
              FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 16689938;
            }
            var12 = var12 + (IntrusiveNodeHashTable.smallFont.drawParagraph(LoginProtocolSupport.achievementDescriptions[var7], 318, var12, 190, 200, 0, -1, 0, 0, 16) * var11 + var11);
            var12 += 10;
            IntrusiveNodeHashTable.smallFont.drawText(OpacityWidget.replaceIndexedTextMarkers(UsernameAvailabilityQuery.orbPointsText, new String[]{Integer.toString(AlternateLongAndTextLoginPayload.field_h[var7])}, (byte) -50), 318, 360, 0, -1);
            for (var13 = 0; var13 < SocketArchiveNetworkClient.field_s[var7]; var13++) {
              UsernameAvailabilityValidator.orbCoinSprite.drawQuarterSize(318 + 10 * var13, 370);
            }
            var12 = var12 + var11;
          } else {
            IntrusiveNodeHashTable.smallFont.drawCenteredText(SessionSocketSupport.mouseOverIconText, 315, var10, 0, -1);
            if (UnderlinedButtonRenderer.c(-94)) {
              FadingDialog.uiPaletteFont.drawParagraph(MessageDialogContent.createToUseText, 125, 350, 395, 100, 0, -1, 1, 0, 26);
            }
          }
          if (param2 > -61) {
            field_u = 108;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var3), "ac.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        sharedDefaultTextWidgetRenderer = null;
        mustLoginAlternateTexts = null;
        secondVertexTransformedY = null;
        awaitingLoginFailureTextStage = null;
        if (param0 < 62) {
            alternateSessionServerPort = -128;
        }
    }

    static {
        awaitingLoginFailureTextStage = new ClientProtocolStage();
        mustLoginAlternateTexts = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        secondVertexTransformedY = new int[8192];
        field_u = 11;
    }
}
