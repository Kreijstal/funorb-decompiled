/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Under13TermsPanel extends WidgetContainer implements HotspotActivationListener, ButtonActivationListener {
    private ButtonWidget continueButton;
    static TextTemplateArgumentType field_E;
    private HotspotTextWidget termsText;
    private AccountCreationDialog accountCreationDialog;
    static int menuPointerRepeatCountdown;
    static volatile int liveHeldPointerButton;
    static Sprite[][] geometrySpritesByThemeAndCategory;
    static String field_F;

    final static void g(int param0) {
        if (null == RasterTargetSnapshot.field_f) {
            FullscreenSupport.fullscreenAcceptCountdownPluralText = OpacityWidget.a(FullscreenSupport.fullscreenAcceptCountdownPluralText, new String[]{"<br><shad=000001><%0></shad><br>"}, (byte) -123);
            TextConcatenationSupport.fullscreenAcceptCountdownSingularText = OpacityWidget.a(TextConcatenationSupport.fullscreenAcceptCountdownSingularText, new String[]{"<br><shad=000001><%0></shad><br>"}, (byte) -55);
            RasterTargetSnapshot.field_f = new String[19];
            RasterTargetSnapshot.field_f[12] = ValidationState.nextText;
            RasterTargetSnapshot.field_f[7] = SettingsCookieSupport.quitText;
            RasterTargetSnapshot.field_f[6] = LoginPayload.endGameText;
            RasterTargetSnapshot.field_f[8] = AttachmentPointerState.soundLabelText;
            RasterTargetSnapshot.field_f[14] = PacketByteCipher.field_c;
            RasterTargetSnapshot.field_f[5] = FullscreenErrorDialog.menuText;
            RasterTargetSnapshot.field_f[0] = TextPairLoginPayload.startGameText;
            RasterTargetSnapshot.field_f[4] = SessionGameApplet.fullscreenText;
            RasterTargetSnapshot.field_f[param0] = EndingAnimationSupport.musicLabelText;
            RasterTargetSnapshot.field_f[10] = BootstrapUiSupport.achievementsText;
            RasterTargetSnapshot.field_f[11] = RasterTargetSnapshot.previousText;
            RasterTargetSnapshot.field_f[15] = ArchiveCatalog.field_a;
            RasterTargetSnapshot.field_f[1] = RasterTargetRestoreSupport.resumeGameText;
            RasterTargetSnapshot.field_f[13] = StrongCacheReference.loginRegisterText;
            RasterTargetSnapshot.field_f[3] = SecondaryNodeDequeIterator.instructionsText;
            RasterTargetSnapshot.field_f[2] = ArchiveLoadStep.highscoresText;
            RasterTargetSnapshot.field_f[18] = ReceivedTextRecord.highscoreModeNames[2];
            RasterTargetSnapshot.field_f[16] = ReceivedTextRecord.highscoreModeNames[0];
            RasterTargetSnapshot.field_f[17] = ReceivedTextRecord.highscoreModeNames[1];
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
          if (!((record.recordIdHigh16 == 0) &&
              (0 == record.recordIdLow24))) {
            for (recordIndex = 0; ByteStorage.retainedTextRecordCount > recordIndex; recordIndex++) {
              existingRecord = MatchingTextValidator.retainedTextRecords[recordIndex];
              if ((2 == existingRecord.recordKind) &&
                  (record.recordIdHigh16 == existingRecord.recordIdHigh16) &&
                  (record.recordIdLow24 == existingRecord.recordIdLow24)) {
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
            var7 = OpacityWidget.a(TextPairLoginPayload.createUnder13TermsText, new String[]{this.f(11501), this.c(false)}, (byte) -114);
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
            UsernameAvailabilityValidator.a(false, "terms.ws");
          } else {
            if (hotspotId != 1) {
              if (2 == hotspotId) {
                UsernameAvailabilityValidator.a(false, "conduct.ws");
              }
            } else {
              UsernameAvailabilityValidator.a(false, "privacy.ws");
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

    private final String f(int param0) {
        String discarded$0 = null;
        if (param0 != 11501) {
            discarded$0 = this.c(true);
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
            stackIn_6_0 = this.a(7305, param3);
            return stackIn_6_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(param3, -104);
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

    public static void b(boolean param0) {
        if (!param0) {
            geometrySpritesByThemeAndCategory = (Sprite[][]) null;
            field_E = null;
            field_F = null;
            return;
        }
        liveHeldPointerButton = 58;
        geometrySpritesByThemeAndCategory = (Sprite[][]) null;
        field_E = null;
        field_F = null;
    }

    private final String c(boolean param0) {
        if (param0) {
            field_E = (TextTemplateArgumentType) null;
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

    final static String a(int param0, java.applet.Applet param1) {
        try {
            int var6 = 0;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var7 = 0;
            String var8 = null;
            String stackIn_5_0 = null;
            String stackIn_13_0 = null;
            String stackIn_15_0 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            try {
              try {
                var8 = param1.getParameter("cookieprefix");
                var3 = var8 + "settings";
                var4 = (String) (AppletJavaScriptBridge.callWithoutArguments((byte) -6, param1, "getcookies"));
                var5 = FullscreenFailureReason.a(';', true, var4);
                for (var6 = 0; var5.length > var6; var6++) {
                  var7 = var5[var6].indexOf('=');
                  if ((var7 >= 0) &&
                      (var5[var6].substring(0, var7).trim().equals(var3))) {
                    stackIn_5_0 = var5[var6].substring(var7 + 1).trim();
                    return stackIn_5_0;
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = decompiledCaughtException;
              }
              if (param0 != -1) {
                Under13TermsPanel.g(14);
              }
              if (null == NetworkArchiveRequest.settingsCookieValue) {
                stackIn_15_0 = param1.getParameter("settings");
                return stackIn_15_0;
              }
              stackIn_13_0 = NetworkArchiveRequest.settingsCookieValue;
              return stackIn_13_0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_18_0 = var2_ref;
              stackIn_18_1 = new StringBuilder().append("s.B(").append(param0).append(',');
              if (param1 == null) {
                stackIn_19_2 = "null";
              } else {
                stackIn_19_2 = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_E = new TextTemplateArgumentType(7, 0, 1, 1);
        geometrySpritesByThemeAndCategory = new Sprite[7][7];
        liveHeldPointerButton = 0;
        field_F = "Growing Pumpkin";
    }
}
