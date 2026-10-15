/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRegistrationPanel extends WidgetGroup implements TextHotspotListener, WidgetActionListener, UsernameSuggestionListener {
    static RgbSprite field_R;
    private ToggleButtonWidget newsletterToggle;
    private HotspotTextWidget termsLinks;
    private ValidatedTextFieldWidget emailField;
    private FocusableWidget registerButton;
    private ValidatedTextFieldWidget passwordConfirmationField;
    private ValidatedTextFieldWidget passwordField;
    private ValidatedTextFieldWidget ageField;
    private ValidatedTextFieldWidget usernameField;
    private ValidatedTextFieldWidget emailConfirmationField;
    private FocusableWidget backButton;
    UsernameSuggestionPanel suggestionPanel;

    final static void showTextChoiceDialog(String message, boolean useLoginCaption, int mode, boolean usePointer, int obfuscationGuard) {
        String actionCaptionValue = null;
        int measureGuard = 0;
        String textForMeasurement = null;
        boolean isButtonLine = false;
        int contentHeightValue = 0;
        int lineAction = 0;
        int lineHeight = 0;
        RuntimeException contextFailure = null;
        StringBuilder contextPrefix = null;
        String messageArgumentSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException layoutFailure = null;
        String actionCaption = null;
        int bodyLineCount = 0;
        int totalLineCount = 0;
        int lineIndex = 0;
        int unusedClientFlag = 0;
        String messageToWrap = null;
        int contentWidth;
        int lineWidth;
        int measureLineIndex;
        int heightLineIndex;
        unusedClientFlag = BrickABrac.field_J ? 1 : 0;
        try {
          va.textChoiceDialogOpen = true;
          LevelSelectScreen.textChoiceMode = mode;
          messageToWrap = message;
          if (!useLoginCaption) {
            actionCaptionValue = PasswordValidator.field_q;
          } else {
            actionCaptionValue = UiComponent.field_mb;
          }
          actionCaption = actionCaptionValue;
          if (LevelSelectScreen.textChoiceMode == 0) {
            bodyLineCount = FarmBackground.a(RasterSnapshot.field_r, 480, obfuscationGuard ^ -17, Widget.textChoiceBodyFont, messageToWrap);
            totalLineCount = bodyLineCount + 3;
            MenuSelection.textChoiceLineActions = new int[totalLineCount];
            QuickChatCategoryDefinition.textChoiceLines = new String[totalLineCount];
            for (lineIndex = 0; totalLineCount > lineIndex; lineIndex++) {
              MenuSelection.textChoiceLineActions[lineIndex] = -1;
            }
            ButtonWidgetRenderer.textChoiceResultCodes = new int[2];
            for (lineIndex = 0; bodyLineCount > lineIndex; lineIndex++) {
              QuickChatCategoryDefinition.textChoiceLines[lineIndex] = RasterSnapshot.field_r[lineIndex];
            }
            QuickChatCategoryDefinition.textChoiceLines[-3 + totalLineCount] = "";
            QuickChatCategoryDefinition.textChoiceLines[totalLineCount - 2] = actionCaption;
            MenuSelection.textChoiceLineActions[-2 + totalLineCount] = 0;
            ButtonWidgetRenderer.textChoiceResultCodes[0] = 1;
            QuickChatCategoryDefinition.textChoiceLines[-1 + totalLineCount] = LevelSequence.field_a;
            MenuSelection.textChoiceLineActions[totalLineCount - 1] = 1;
            ButtonWidgetRenderer.textChoiceResultCodes[1] = 2;
          } else {
            if (LevelSelectScreen.textChoiceMode != 1) {
              throw new IllegalArgumentException();
            }
            bodyLineCount = FarmBackground.a(RasterSnapshot.field_r, 480, obfuscationGuard - 109, Widget.textChoiceBodyFont, messageToWrap);
            totalLineCount = 2 + bodyLineCount;
            MenuSelection.textChoiceLineActions = new int[totalLineCount];
            QuickChatCategoryDefinition.textChoiceLines = new String[totalLineCount];
            for (lineIndex = 0; totalLineCount > lineIndex; lineIndex++) {
              MenuSelection.textChoiceLineActions[lineIndex] = -1;
            }
            ButtonWidgetRenderer.textChoiceResultCodes = new int[1];
            for (lineIndex = 0; bodyLineCount > lineIndex; lineIndex++) {
              QuickChatCategoryDefinition.textChoiceLines[lineIndex] = RasterSnapshot.field_r[lineIndex];
            }
            QuickChatCategoryDefinition.textChoiceLines[totalLineCount - 2] = "";
            QuickChatCategoryDefinition.textChoiceLines[-1 + totalLineCount] = LevelSequence.field_a;
            MenuSelection.textChoiceLineActions[-1 + totalLineCount] = 0;
            ButtonWidgetRenderer.textChoiceResultCodes[0] = 2;
          }
          ArcticBackground.textChoiceSelection.itemCount = ButtonWidgetRenderer.textChoiceResultCodes.length;
          contentWidth = 0;
          for (measureLineIndex = 0; measureLineIndex < QuickChatCategoryDefinition.textChoiceLines.length; measureLineIndex++) {
            measureGuard = 0;
            textForMeasurement = QuickChatCategoryDefinition.textChoiceLines[measureLineIndex];
            isButtonLine = !(0 > MenuSelection.textChoiceLineActions[measureLineIndex]);
            lineWidth = pl.measureTextChoiceLine(measureGuard, textForMeasurement, isButtonLine);
            if (MenuSelection.textChoiceLineActions[measureLineIndex] != -1) {
              lineWidth = lineWidth + FullscreenFailureDialog.textChoiceButtonPaddingX * 2;
            }
            if (contentWidth < lineWidth) {
              contentWidth = lineWidth;
            }
          }
          MusicVoiceMixer.textChoiceRight = contentWidth + (NewAchievementsScreen.textChoiceCenterX - (contentWidth >> 1));
          ReflectionCheck.textChoiceContentHeight = ArcticBackground.textChoiceSelection.itemCount * (GameCanvas.textChoiceButtonPaddingY + GameClock.textChoiceButtonGapY << 1);
          LevelPack.textChoiceLeft = NewAchievementsScreen.textChoiceCenterX - (contentWidth >> 1);
          heightLineIndex = 0;
          while (QuickChatCategoryDefinition.textChoiceLines.length > heightLineIndex) {
            contentHeightValue = ReflectionCheck.textChoiceContentHeight;
            lineAction = MenuSelection.textChoiceLineActions[heightLineIndex];
            if (lineAction >= 0) {
              lineHeight = TooltipSprite.textChoiceButtonLineHeight;
            } else {
              lineHeight = BufferedSocket.textChoiceBodyLineHeight;
            }
            ReflectionCheck.textChoiceContentHeight = contentHeightValue + lineHeight;
            heightLineIndex++;
          }
          ContentTransitionPhase.textChoiceTop = ea.textChoiceCenterY - (ReflectionCheck.textChoiceContentHeight >> 1);
          ArcticBackground.textChoiceSelection.initializeSelection(TextChoiceDialogHitTest.hitTestTextChoiceDialog(obfuscationGuard - 46, ResourcePreparationEntry.pointerY, MusicPatch.pointerX), 0, usePointer, (byte) -127);
          if (obfuscationGuard != 46) {
            field_R = (RgbSprite) null;
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtLayoutFailure) {
          caughtFailure = caughtLayoutFailure;
          layoutFailure = caughtFailure;
          contextFailure = layoutFailure;
          contextPrefix = new StringBuilder().append("dk.N(");
          if (message == null) {
            messageArgumentSummary = "null";
          } else {
            messageArgumentSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) contextFailure), ((StringBuilder) (Object) contextPrefix).append(messageArgumentSummary).append(',').append(useLoginCaption).append(',').append(mode).append(',').append(usePointer).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_R = null;
        if (param0 != -11310) {
          field_R = (RgbSprite) null;
        }
    }

    private final String j(int param0) {
        if (param0 != -987472479) {
          return (String) null;
        }
        return "</col></u>";
    }

    private final boolean submitRegistration(int obfuscationGuard) {
        if (!this.canSubmitRegistration(obfuscationGuard + 10000537)) {
          return false;
        }
        int var2 = obfuscationGuard;
        try {
          var2 = Integer.parseInt(this.ageField.text);
        } catch (NumberFormatException numberFormatException) {
        }
        return ArchiveSource.a(this.usernameField.text, this.passwordField.text, this.emailField.text, var2, (byte) -126, this, this.newsletterToggle.active);
    }

    private final String c(boolean param0) {
        if (!param0) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    final static RgbSprite loadRgbSprite(int obfuscationGuard, ResourceArchive archive, int groupId, int fileId) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -873) {
            field_R = (RgbSprite) null;
          }
          if (ln.decodeSpritesFromArchive(-123, fileId, archive, groupId)) {
            return ConnectionPhase.buildRgbSprite((byte) 21);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("dk.H(").append(obfuscationGuard).append(',');
          if (archive == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(groupId).append(',').append(fileId).append(')').toString());
        }
    }

    public final void onHotspotAction(int button, int obfuscationGuard, int hotspotId, HotspotTextWidget widget) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard != -526) {
            this.passwordField = (ValidatedTextFieldWidget) null;
          }
          if (0 == hotspotId) {
            ArchiveFetchClient.a("terms.ws", 12);
          } else {
            if (1 != hotspotId) {
              if (hotspotId == 2) {
                ArchiveFetchClient.a("conduct.ws", 12);
              }
            } else {
              ArchiveFetchClient.a("privacy.ws", 12);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("dk.G(").append(button).append(',').append(obfuscationGuard).append(',').append(hotspotId).append(',');
          if (widget == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final void onAction(int pointerY, int button, byte obfuscationGuard, int pointerX, FocusableWidget widget) {
        boolean discarded$1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.backButton == widget) {
            ln.a(103);
          } else {
            if (widget == this.registerButton) {
              discarded$1 = this.submitRegistration(-1);
            }
          }
          if (obfuscationGuard >= -22) {
            this.emailConfirmationField = (ValidatedTextFieldWidget) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("dk.Q(").append(pointerY).append(',').append(button).append(',').append(obfuscationGuard).append(',').append(pointerX).append(',');
          if (widget == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final int a(Widget param0, int param1, String param2, int param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        ValidationMessageWidget var9 = null;
        LabeledWidget var10 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new LabeledWidget(20, param1, param4 + 120, 25, param0, false, 120, 3, ArchiveNetworkClient.field_u, 16777215, param5);
          this.addChild(var10, true);
          var9 = new ValidationMessageWidget(((ValidatableWidget) ((Object) param0)).getValidationSource(-11011), param2, 126, param1 + var10.height, param4 + 50, param3);
          var9.listener = (WidgetListener) (this);
          if (param6 != 170) {
            this.newsletterToggle = (ToggleButtonWidget) null;
          }
          this.addChild(var9, true);
          stackIn_3_0 = var10.height + var9.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("dk.I(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(')').toString());
        }
    }

    private final int a(String param0, Widget param1, int param2, int param3, int param4) {
        LabeledWidget var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new LabeledWidget(20, param2, 120 + param4, 25, param1, false, 120, 3, ArchiveNetworkClient.field_u, 16777215, param0);
          this.addChild(var6, true);
          var7 = -5 / ((-32 - param3) / 59);
          stackIn_1_0 = var6.height;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_4_0 = var6_ref;
          stackIn_4_1 = new StringBuilder().append("dk.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(Widget param0, String param1, int param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        ValidationIconWidget var7 = null;
        LabeledWidget var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 97) {
            discarded$1 = this.submitRegistration(-122);
          }
          var8 = new LabeledWidget(20, param4, param2 + 120, 25, param0, false, 120, 3, ArchiveNetworkClient.field_u, 16777215, param1);
          this.addChild(var8, true);
          var7 = new ValidationIconWidget(((ValidatableWidget) ((Object) param0)).getValidationSource(-11011));
          this.addChild(var7, true);
          var7.setBounds(15, var8.x + var8.width + 3, (var8.height - 15 >> 1) + var8.y, (byte) -119, 15);
          stackIn_3_0 = var8.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("dk.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void h(byte param0) {
        int var1_int = 0;
        MenuScreen var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0 > -59) {
            field_R = (RgbSprite) null;
          }
          for (var1_int = 0; var1_int < DelayedPacket.menuScreens.length; var1_int++) {
            var2 = DelayedPacket.menuScreens[var1_int];
            if (var2 != null) {
              var2.refreshMenu(-88);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "dk.U(" + param0 + ')');
        }
    }

    public final void onUsernameSuggestionChosen(String username, byte obfuscationGuard) {
        String discarded$1 = null;
        ValidatedTextFieldWidget var3 = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.usernameField;
          var4 = username;
          ((TextFieldWidget) ((Object) var3)).setText(var4, -12592, false);
          if (obfuscationGuard != 56) {
            discarded$1 = this.c(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("dk.C(");
          if (username == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, int param1, RasterCacheSurface param2, int param3, int param4, RgbSprite param5) {
        IndexedSpriteGeometry.pushSpriteRaster(-85, param2.sprite);
        Rasterizer2D.fillVerticalGradient(0, 0, param2.width, param2.height, RadialSelectorRenderer.arcticBackgroundColors[param1], 16777215);
        if (param4 != 23275) {
          return;
        }
        try {
          param5.b((-param5.canvasWidth + param2.width) / 2, -(342 / param0) + (-param5.canvasHeight + param2.height), 55, 83);
          sc.popRaster(-84);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "dk.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean handleWidgetKey(int keyCode, byte obfuscationGuard, Widget focusRoot, char character) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleWidgetKey(keyCode, obfuscationGuard, focusRoot, character)) {
            return true;
          }
          if (keyCode == 98) {
            stackIn_6_0 = this.b(focusRoot, (byte) 119);
            return stackIn_6_0;
          }
          if (keyCode != 99) {
            return false;
          }
          stackIn_10_0 = this.a(focusRoot, (byte) -122);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("dk.T(").append(keyCode).append(',').append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(character).append(')').toString());
        }
    }

    private final boolean canSubmitRegistration(int obfuscationGuard) {
        if (obfuscationGuard != 10000536) {
          this.emailConfirmationField = (ValidatedTextFieldWidget) null;
        }
        if (this.passesSubmissionGate(60, this.usernameField) &&
          this.passesSubmissionGate(60, this.emailField) &&
          this.passesSubmissionGate(60, this.emailConfirmationField) &&
          this.passesSubmissionGate(60, this.passwordField) &&
          this.passesSubmissionGate(60, this.passwordConfirmationField) &&
          this.passesSubmissionGate(60, this.ageField)) {
          return true;
        }
        return false;
    }

    final void updatePointer(Widget focusRoot, byte obfuscationGuard, int parentX, int parentY) {
        try {
          super.updatePointer(focusRoot, obfuscationGuard, parentX, parentY);
          this.registerButton.enabled = this.canSubmitRegistration(10000536);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "dk.WA(" + (focusRoot != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + parentX + ',' + parentY + ')');
        }
    }

    private final int a(int param0, String param1, String param2, int param3, Widget param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -3) {
            this.newsletterToggle = (ToggleButtonWidget) null;
          }
          stackIn_3_0 = this.a(param4, param5, param1, 35, param0, param2, 170);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("dk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    public final void onRefreshUsernameSuggestions(byte obfuscationGuard) {
        if (obfuscationGuard < 96) {
          return;
        }
        ((UsernameAvailabilityValidator) (this.usernameField.getValidationSource(-11011))).clearAvailabilityCache((byte) -22);
    }

    public AccountRegistrationPanel() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.usernameField = new ValidatedTextFieldWidget("", (WidgetListener) null, 12);
        this.emailField = new ValidatedTextFieldWidget("", (WidgetListener) null, 100);
        this.emailConfirmationField = new ValidatedTextFieldWidget("", (WidgetListener) null, 100);
        this.passwordField = new ValidatedTextFieldWidget("", (WidgetListener) null, 20);
        this.passwordConfirmationField = new ValidatedTextFieldWidget("", (WidgetListener) null, 20);
        this.ageField = new ValidatedTextFieldWidget("", (WidgetListener) null, 3);
        int var1 = 1;
        this.newsletterToggle = new ToggleButtonWidget("", (WidgetListener) null, var1 != 0);
        this.registerButton = new FocusableWidget(GrowableIntList.field_d, (WidgetListener) null);
        this.backButton = new FocusableWidget(ByteArrayNode.field_l, (WidgetListener) null);
        this.usernameField.tooltip = hh.field_a;
        this.emailField.tooltip = rf.field_d;
        this.emailConfirmationField.tooltip = ResourceArchive.field_e;
        this.passwordField.tooltip = IntKeyIndex.field_a;
        this.passwordConfirmationField.tooltip = BoundedFile.field_b;
        this.ageField.tooltip = hc.field_d;
        this.newsletterToggle.tooltip = ok.field_e;
        this.usernameField.setValidationSource(new UsernameAvailabilityValidator(this.usernameField), (byte) -68);
        this.emailField.setValidationSource(new EmailValidator(this.emailField), (byte) -68);
        this.emailConfirmationField.setValidationSource(new EmailConfirmationValidator(this.emailConfirmationField, this.emailField), (byte) -68);
        this.passwordField.setValidationSource(new PasswordValidator(this.passwordField, this.usernameField, this.emailField), (byte) -68);
        this.passwordConfirmationField.setValidationSource(new MatchingTextValidator(this.passwordConfirmationField, this.passwordField), (byte) -68);
        this.ageField.setValidationSource(new AgeValidator(this.ageField), (byte) -68);
        this.registerButton.enabled = false;
        this.registerButton.renderer = (WidgetRenderer) ((Object) new ButtonWidgetRenderer());
        this.backButton.renderer = (WidgetRenderer) ((Object) new LinkWidgetRenderer());
        this.usernameField.renderer = (WidgetRenderer) ((Object) new TextFieldRenderer(10000536));
        TextFieldRenderer dupTemp$0 = new TextFieldRenderer(10000536);
        this.emailConfirmationField.renderer = (WidgetRenderer) ((Object) dupTemp$0);
        this.emailField.renderer = (WidgetRenderer) ((Object) dupTemp$0);
        this.ageField.renderer = (WidgetRenderer) ((Object) new TextFieldRenderer(10000536));
        this.newsletterToggle.renderer = (WidgetRenderer) ((Object) new CheckboxWidgetRenderer());
        PasswordFieldRenderer dupTemp$1 = new PasswordFieldRenderer(10000536);
        this.passwordConfirmationField.renderer = (WidgetRenderer) ((Object) dupTemp$1);
        this.passwordField.renderer = (WidgetRenderer) ((Object) dupTemp$1);
        String var2 = rd.a(ch.field_e, new String[]{this.c(true), this.j(-987472479)}, (byte) 103);
        int var3 = 20;
        var3 = var3 + this.a(IntNode.field_l, this.emailField, var3, 37, 170);
        var3 = var3 + (this.a(this.emailConfirmationField, var3, "", 20, 170, DelayedPacket.field_o, 170) + 5);
        var3 = var3 + this.a(wc.field_c, this.passwordField, var3, 84, 170);
        var3 = var3 + (this.a(170, InstructionsScreen.field_x, WidgetLayerStack.field_G, -3, this.passwordConfirmationField, var3) + 5);
        var3 = var3 + (this.a(170, GameClock.field_h, BlankScreen.field_j, -3, this.usernameField, var3) + 5);
        var3 = var3 + this.a(this.ageField, HuffmanCodec.field_d, 170, 111, var3);
        LabeledWidget var4 = new LabeledWidget(46, var3, this.width - 90, 25, this.newsletterToggle, true, -120 + this.width, 5, QuickChatMenu.field_Yb, 11579568, LevelCompleteScreen.field_z);
        this.addChild(var4, true);
        var3 = var3 + var4.height;
        TextWidgetRenderer var5 = new TextWidgetRenderer(ArchiveNetworkClient.field_u, 0, 0, 0, 0, 16777215, -1, 0, 0, ArchiveNetworkClient.field_u.ascent, -1, 2147483647, true);
        this.termsLinks = new HotspotTextWidget(var2, var5);
        this.termsLinks.tooltip = "";
        this.termsLinks.setHotspotTooltip(GameConnectionShell.field_z, 0, (byte) -98);
        this.termsLinks.setHotspotTooltip(GameConnectionShell.field_z, 1, (byte) -98);
        this.termsLinks.listener = (WidgetListener) (this);
        this.termsLinks.a(46, (byte) 46, -90 + this.width, var3);
        var3 = var3 + (15 + this.termsLinks.height);
        this.addChild(this.termsLinks, true);
        int var6 = 4;
        int var7 = 200;
        this.registerButton.setBounds(40, -var7 + 496 >> 1, var3, (byte) -119, var7);
        this.backButton.setBounds(40, 3 + var6, var3 + 15, (byte) -119, 60);
        this.backButton.listener = (WidgetListener) (this);
        this.registerButton.listener = (WidgetListener) (this);
        this.addChild(this.registerButton, true);
        this.addChild(this.backButton, true);
        this.suggestionPanel = new UsernameSuggestionPanel((UsernameSuggestionListener) (this));
        this.suggestionPanel.setBounds(150, this.usernameField.x - (-this.usernameField.width - 60), 20 + this.usernameField.y, (byte) -119, this.width - this.usernameField.x - (this.usernameField.width + 60));
        this.addChild(this.suggestionPanel, true);
        this.setBounds(var6 + (var3 + 55), 0, 0, (byte) -119, 496);
    }

    private final boolean passesSubmissionGate(int obfuscationGuard, ValidatableWidget widget) {
        ValidationSource validationSource = null;
        RuntimeException var3_ref = null;
        ValidationStatus status = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          validationSource = widget.getValidationSource(obfuscationGuard ^ -11071);
          if (validationSource == null) {
            return true;
          }
          status = validationSource.getValidationStatus((byte) -31);
          if (AccountMessageDialog.validationInvalid == status) {
            return false;
          }
          if (obfuscationGuard != 60) {
            this.newsletterToggle = (ToggleButtonWidget) null;
          }
          if (ConditionalTextValue.validationDebouncing == status) {
            return false;
          }
          if (status != uo.validationEmpty) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("dk.P(").append(obfuscationGuard).append(',');
          if (widget == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
    }
}
