/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Under13TermsPanel extends WidgetContainer implements HotspotActivationListener, ButtonActivationListener {
    private ButtonWidget continueButton;
    static TextTemplateArgumentType textTemplateArgumentTypeSeven;
    private HotspotTextWidget termsText;
    private AccountCreationDialog accountCreationDialog;
    static int menuPointerRepeatCountdown;
    static volatile int liveHeldPointerButton;
    static Sprite[][] geometrySpritesByThemeAndCategory;
    static String waitingForPumpkinText;

    final static void initializeMenuActionTexts(int musicActionIndex) {
        if (null == RasterTargetSnapshot.menuActionTexts) {
            FullscreenSupport.fullscreenAcceptCountdownPluralText = OpacityWidget.replaceIndexedTextMarkers(FullscreenSupport.fullscreenAcceptCountdownPluralText, new String[]{"<br><shad=000001><%0></shad><br>"}, (byte) -123);
            TextConcatenationSupport.fullscreenAcceptCountdownSingularText = OpacityWidget.replaceIndexedTextMarkers(TextConcatenationSupport.fullscreenAcceptCountdownSingularText, new String[]{"<br><shad=000001><%0></shad><br>"}, (byte) -55);
            RasterTargetSnapshot.menuActionTexts = new String[19];
            RasterTargetSnapshot.menuActionTexts[12] = ValidationState.nextText;
            RasterTargetSnapshot.menuActionTexts[7] = SettingsCookieSupport.quitText;
            RasterTargetSnapshot.menuActionTexts[6] = LoginPayload.endGameText;
            RasterTargetSnapshot.menuActionTexts[8] = AttachmentPointerState.soundLabelText;
            RasterTargetSnapshot.menuActionTexts[14] = PacketByteCipher.discardResultsText;
            RasterTargetSnapshot.menuActionTexts[5] = FullscreenErrorDialog.menuText;
            RasterTargetSnapshot.menuActionTexts[0] = TextPairLoginPayload.startGameText;
            RasterTargetSnapshot.menuActionTexts[4] = SessionGameApplet.fullscreenText;
            RasterTargetSnapshot.menuActionTexts[musicActionIndex] = EndingAnimationSupport.musicLabelText;
            RasterTargetSnapshot.menuActionTexts[10] = BootstrapUiSupport.achievementsText;
            RasterTargetSnapshot.menuActionTexts[11] = RasterTargetSnapshot.previousText;
            RasterTargetSnapshot.menuActionTexts[15] = ArchiveCatalog.replayTutorialText;
            RasterTargetSnapshot.menuActionTexts[1] = RasterTargetRestoreSupport.resumeGameText;
            RasterTargetSnapshot.menuActionTexts[13] = StrongCacheReference.loginRegisterText;
            RasterTargetSnapshot.menuActionTexts[3] = SecondaryNodeDequeIterator.instructionsText;
            RasterTargetSnapshot.menuActionTexts[2] = ArchiveLoadStep.highscoresText;
            RasterTargetSnapshot.menuActionTexts[18] = ReceivedTextRecord.highscoreModeNames[2];
            RasterTargetSnapshot.menuActionTexts[16] = ReceivedTextRecord.highscoreModeNames[0];
            RasterTargetSnapshot.menuActionTexts[17] = ReceivedTextRecord.highscoreModeNames[1];
            return;
        }
    }

    final static void retainReceivedTextRecordIfNew(ReceivedTextRecord record, int methodGuard) {
        int recordIndex = 0;
        ReceivedTextRecord existingRecord = null;
        int clientControlFlowGuard = 0;
        RuntimeException acceptanceFailureBeforeContext = null;
        StringBuilder acceptanceMessagePrefix = null;
        String recordDescription = null;
        RuntimeException caughtAcceptanceFailure = null;
        RuntimeException acceptanceFailureForContext = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != 0) {
            return;
          }
          if (null == record.text) {
            return;
          }
          if (record.recordIdHigh16 != 0 ||
              0 != record.recordIdLow24) {
            for (recordIndex = 0; ByteStorage.retainedTextRecordCount > recordIndex; recordIndex++) {
              existingRecord = MatchingTextValidator.retainedTextRecords[recordIndex];
              if (2 == existingRecord.recordKind &&
                  record.recordIdHigh16 == existingRecord.recordIdHigh16 &&
                  record.recordIdLow24 == existingRecord.recordIdLow24) {
                return;
              }
            }
          }
          if (null == record.referencedTemplateIds) {
          }
          SessionTextHistorySupport.retainTextRecord(record, 31274);
          return;
        } catch (java.lang.RuntimeException acceptanceFailure) {
          caughtAcceptanceFailure = acceptanceFailure;
          acceptanceFailureForContext = caughtAcceptanceFailure;
          acceptanceFailureBeforeContext = acceptanceFailureForContext;
          acceptanceMessagePrefix = new StringBuilder().append("s.C(");
          if (record == null) {
            recordDescription = "null";
          } else {
            recordDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) acceptanceFailureBeforeContext), ((StringBuilder) (Object) acceptanceMessagePrefix).append(recordDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    Under13TermsPanel(AccountCreationDialog accountCreationDialog) {
        super(0, 0, 288, 0, (WidgetRenderer) null);
        String var7 = null;
        int var3 = 0;
        TextWidgetRenderer var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.accountCreationDialog = accountCreationDialog;
            this.continueButton = new ButtonWidget(UsernameQuerySupport.continueText, (WidgetListener) null);
            this.continueButton.renderer = (WidgetRenderer) ((Object) new SpriteButtonRenderer());
            var7 = OpacityWidget.replaceIndexedTextMarkers(TextPairLoginPayload.createUnder13TermsText, new String[]{this.openingTermsLinkMarkup(11501), this.closingTermsLinkMarkup(false)}, (byte) -114);
            var3 = 20;
            var4 = new TextWidgetRenderer(DialogLayer.sharedUiFont, 0, 0, 0, 0, 16777215, -1, 3, 0, DialogLayer.sharedUiFont.maxAscent, -1, 2147483647, true);
            this.termsText = new HotspotTextWidget(var7, var4);
            this.termsText.hoverText = "";
            this.termsText.setHotspotHoverText(0, -47, LogoCompositor.openInPopupWindowText);
            this.termsText.setHotspotHoverText(1, 118, LogoCompositor.openInPopupWindowText);
            this.termsText.listener = (WidgetListener) (this);
            this.termsText.widgetWidth = this.widgetWidth - 40;
            this.termsText.fitTextBounds(26, 0, var3, this.widgetWidth - 40);
            var3 = var3 + (this.termsText.widgetHeight + 15);
            this.addChild((byte) -108, this.termsText);
            var5 = 4;
            var6 = 200;
            this.continueButton.setWidgetBounds(40, var6, (byte) -71, var3, -var6 + 300 >> 1);
            this.continueButton.listener = (WidgetListener) (this);
            this.addChild((byte) -63, this.continueButton);
            this.setWidgetBounds(var3 + (55 + var5), 300, (byte) -104, 0, 0);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "s.<init>(" + (accountCreationDialog != null ? "{...}" : "null") + ')');
        }
    }

    public final void onHotspotActivated(HotspotTextWidget widget, int hotspotId, int methodGuard, int pointerButton) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Geoblox.clientControlFlowFlag;
        try {
          if (0 == hotspotId) {
            UsernameAvailabilityValidator.requestNavigationToSharedTarget(false, "terms.ws");
          } else {
            if (hotspotId != 1) {
              if (2 == hotspotId) {
                UsernameAvailabilityValidator.requestNavigationToSharedTarget(false, "conduct.ws");
              }
            } else {
              UsernameAvailabilityValidator.requestNavigationToSharedTarget(false, "privacy.ws");
            }
          }
          if (methodGuard == 2) {
            return;
          }
          this.accountCreationDialog = (AccountCreationDialog) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("s.A(");
          if (widget == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(hotspotId).append(',').append(methodGuard).append(',').append(pointerButton).append(')').toString());
        }
    }

    private final String openingTermsLinkMarkup(int methodGuard) {
        String unusedClosingMarkupResult = null;
        if (methodGuard != 11501) {
            unusedClosingMarkupResult = this.closingTermsLinkMarkup(true);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean handleKeyInput(int param0, int param1, char param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, param1, param2, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_6_0 = this.requestPreviousChildFocus(7305, param3);
            return stackIn_6_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_10_0 = this.requestNextChildFocus(param3, -104);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("s.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void releaseStaticReferences(boolean methodGuard) {
        if (!methodGuard) {
            geometrySpritesByThemeAndCategory = (Sprite[][]) null;
            textTemplateArgumentTypeSeven = null;
            waitingForPumpkinText = null;
            return;
        }
        liveHeldPointerButton = 58;
        geometrySpritesByThemeAndCategory = (Sprite[][]) null;
        textTemplateArgumentTypeSeven = null;
        waitingForPumpkinText = null;
    }

    private final String closingTermsLinkMarkup(boolean clearTemplateTypeSeven) {
        if (clearTemplateTypeSeven) {
            textTemplateArgumentTypeSeven = (TextTemplateArgumentType) null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void onButtonActivated(int param0, byte param1, int param2, int param3, ButtonWidget param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 == this.continueButton) {
            SessionTextHistorySupport.prepareAccountCreationUi(77);
            this.accountCreationDialog.dismissDialog((byte) -104);
          }
          if (param1 == -20) {
            return;
          }
          this.accountCreationDialog = (AccountCreationDialog) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("s.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static String readSettingsCookieOrFallback(int methodGuard, java.applet.Applet applet) {
        try {
            int cookieIndex = 0;
            String settingsCookieName = null;
            String cookieHeader = null;
            String[] cookieEntries = null;
            int equalsIndex = 0;
            String cookiePrefix = null;
            String cookieValueBeforeReturn = null;
            String cachedSettingsBeforeReturn = null;
            String parameterSettingsBeforeReturn = null;
            RuntimeException lookupFailureBeforeDescription = null;
            StringBuilder lookupMessagePrefix = null;
            String appletDescription = null;
            Throwable caughtLookupThrowable = null;
            Throwable ignoredCookieLookupFailure = null;
            RuntimeException lookupFailureForContext = null;
            try {
              try {
                cookiePrefix = applet.getParameter("cookieprefix");
                settingsCookieName = cookiePrefix + "settings";
                cookieHeader = (String) (AppletJavaScriptBridge.callWithoutArguments((byte) -6, applet, "getcookies"));
                cookieEntries = FullscreenFailureReason.splitAtCharacter(';', true, cookieHeader);
                for (cookieIndex = 0; cookieEntries.length > cookieIndex; cookieIndex++) {
                  equalsIndex = cookieEntries[cookieIndex].indexOf('=');
                  if (equalsIndex >= 0 &&
                      cookieEntries[cookieIndex].substring(0, equalsIndex).trim().equals(settingsCookieName)) {
                    cookieValueBeforeReturn = cookieEntries[cookieIndex].substring(equalsIndex + 1).trim();
                    return cookieValueBeforeReturn;
                  }
                }
              } catch (java.lang.Throwable cookieLookupThrowable) {
                caughtLookupThrowable = cookieLookupThrowable;
                ignoredCookieLookupFailure = caughtLookupThrowable;
              }
              if (methodGuard != -1) {
                Under13TermsPanel.initializeMenuActionTexts(14);
              }
              if (null == NetworkArchiveRequest.settingsCookieValue) {
                parameterSettingsBeforeReturn = applet.getParameter("settings");
                return parameterSettingsBeforeReturn;
              }
              cachedSettingsBeforeReturn = NetworkArchiveRequest.settingsCookieValue;
              return cachedSettingsBeforeReturn;
            } catch (java.lang.RuntimeException lookupFailure) {
              caughtLookupThrowable = lookupFailure;
              lookupFailureForContext = (RuntimeException) (Object) caughtLookupThrowable;
              lookupFailureBeforeDescription = lookupFailureForContext;
              lookupMessagePrefix = new StringBuilder().append("s.B(").append(methodGuard).append(',');
              if (applet == null) {
                appletDescription = "null";
              } else {
                appletDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) lookupFailureBeforeDescription), ((StringBuilder) (Object) lookupMessagePrefix).append(appletDescription).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedBoundaryFailure) {
            throw uncheckedBoundaryFailure;
        } catch (Throwable checkedBoundaryFailure) {
            throw new RuntimeException(checkedBoundaryFailure);
        }
    }

    static {
        textTemplateArgumentTypeSeven = new TextTemplateArgumentType(7, 0, 1, 1);
        geometrySpritesByThemeAndCategory = new Sprite[7][7];
        liveHeldPointerButton = 0;
        waitingForPumpkinText = "Growing Pumpkin";
    }
}
