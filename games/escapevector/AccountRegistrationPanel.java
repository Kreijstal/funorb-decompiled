/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class AccountRegistrationPanel extends UiContainer implements TextHotspotListener, ButtonListener, NameSuggestionListener {
    private ValidatedTextWidget confirmEmailField;
    static ObjectSpriteSet[] objectSpriteSets;
    private Checkbox receiveNewsCheckbox;
    private TextHotspotWidget termsWidget;
    NameSuggestionsPanel suggestions;
    static String field_O;
    private TextButton backButton;
    static QuickChatDynamicCommand field_L;
    private ValidatedTextWidget emailField;
    private TextButton submitButton;
    private ValidatedTextWidget ageField;
    static Sprite field_T;
    private ValidatedTextWidget passwordField;
    private ValidatedTextWidget confirmPasswordField;
    private ValidatedTextWidget displayNameField;

    private final int addLabeledField(int fieldWidth, UiComponent component, String label, int y, int guard) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        try {
          if (guard != 100) {
            AccountRegistrationPanel.currentCanvas((byte) -65);
          }
          LabeledField var6 = new LabeledField(20, y, fieldWidth + 120, 25, component, false, 120, 3, Js5Transport.field_a, 16777215, label);
          this.addChild(var6, false);
          int stackIn_3_0 = var6.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var6_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("bf.D(").append(fieldWidth).append(',');
          if (component == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (label == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(y).append(',').append(guard).append(')').toString());
        }
    }

    public final void onAction(TextButton button, int buttonCode, int localY, int guard, int localX) {
        String stackIn_10_2 = null;
        try {
          if (button == this.backButton) {
            AnimatedPathMarker.showAccountChoice(true);
          } else if (this.submitButton == button) {
            boolean discarded$1 = this.submitRegistration((byte) 123);
          }
          if (guard == 1) {
            return;
          }
          this.ageField = (ValidatedTextWidget) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var6;
          StringBuilder stackIn_9_1 = new StringBuilder().append("bf.K(");
          if (button == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(buttonCode).append(',').append(localY).append(',').append(guard).append(',').append(localX).append(')').toString());
        }
    }

    private final int addFieldWithHelp(int layoutGuard, String label, int y, UiComponent component, String helpText, int fieldWidth) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (layoutGuard != 170) {
            field_T = (Sprite) null;
          }
          int stackIn_3_0 = this.addFieldWithHelp(35, component, fieldWidth, label, layoutGuard - 145, helpText, y);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var7;
          StringBuilder stackIn_6_1 = new StringBuilder().append("bf.H(").append(layoutGuard).append(',');
          if (label == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(y).append(',');
          if (component == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (helpText == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(fieldWidth).append(')').toString());
        }
    }

    public final void onNameSelected(byte guard, String name) {
        String stackIn_6_2 = null;
        try {
          ValidatedTextWidget var3 = this.displayNameField;
          String var4 = name;
          ((EditableTextWidget) ((Object) var3)).setText(var4, false, -33);
          if (guard < -49) {
            return;
          }
          this.confirmPasswordField = (ValidatedTextWidget) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_5_0 = var3_ref;
          StringBuilder stackIn_5_1 = new StringBuilder().append("bf.J(").append(guard).append(',');
          if (name == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void decodeTerrainQuadrants(int top, int bottom, DataInputStream input, int left, int right, int[] rows, int guard) throws IOException {
        int var7_int = right + left >> 1;
        int var8 = top + bottom >> 1;
        int var9 = input.readUnsignedByte();
        TerrainMaskSupport.decodeTerrainQuadrant(left, 3 & var9, var8, var7_int, input, rows, (byte) -74, top);
        var9 = var9 >>> 2;
        TerrainMaskSupport.decodeTerrainQuadrant(var7_int, var9 & 3, var8, right, input, rows, (byte) -74, top);
        var9 = var9 >>> 2;
        if (guard != 2147483647) {
          return;
        }
        try {
          TerrainMaskSupport.decodeTerrainQuadrant(left, var9 & 3, bottom, var7_int, input, rows, (byte) -74, var8);
          var9 = var9 >>> 2;
          TerrainMaskSupport.decodeTerrainQuadrant(var7_int, var9, bottom, right, input, rows, (byte) -74, var8);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "bf.L(" + top + ',' + bottom + ',' + (input != null ? "{...}" : "null") + ',' + left + ',' + right + ',' + (rows != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    public static void releaseStatics(int guard) {
        field_T = null;
        field_L = null;
        if (guard >= -118) {
          return;
        }
        field_O = null;
        objectSpriteSets = null;
    }

    public AccountRegistrationPanel() {
        super(0, 0, 496, 0, (WidgetPainter) null);
        this.displayNameField = new ValidatedTextWidget("", (UiListener) null, 12);
        this.emailField = new ValidatedTextWidget("", (UiListener) null, 100);
        this.confirmEmailField = new ValidatedTextWidget("", (UiListener) null, 100);
        this.passwordField = new ValidatedTextWidget("", (UiListener) null, 20);
        this.confirmPasswordField = new ValidatedTextWidget("", (UiListener) null, 20);
        this.ageField = new ValidatedTextWidget("", (UiListener) null, 3);
        boolean var1 = true;
        this.receiveNewsCheckbox = new Checkbox("", (UiListener) null, (var1));
        this.submitButton = new TextButton(GameKeyHandler.field_c, (UiListener) null);
        this.backButton = new TextButton(CipherPacketBuffer.field_p, (UiListener) null);
        this.displayNameField.tooltip = ModalPanel.field_K;
        this.emailField.tooltip = AchievementTracker.field_a;
        this.confirmEmailField.tooltip = InputGlyphSupport.field_f;
        this.passwordField.tooltip = RepeatedCharacterSupport.field_b;
        this.confirmPasswordField.tooltip = AlternateUsernameCredentials.field_i;
        this.ageField.tooltip = AchievementsScreen.field_k;
        this.receiveNewsCheckbox.tooltip = BoundedUrlRequest.field_h;
        this.displayNameField.setValidator(new NameAvailabilityValidator(this.displayNameField), (byte) 63);
        this.emailField.setValidator(new EmailSyntaxValidator(this.emailField), (byte) 63);
        this.confirmEmailField.setValidator(new EmailAvailabilityValidator(this.confirmEmailField, this.emailField), (byte) 63);
        this.passwordField.setValidator(new PasswordValidator(this.passwordField, this.displayNameField, this.emailField), (byte) 63);
        this.confirmPasswordField.setValidator(new MatchingTextValidator(this.confirmPasswordField, this.passwordField), (byte) 63);
        this.ageField.setValidator(new AgeValidator(this.ageField), (byte) 63);
        this.submitButton.enabled = false;
        this.submitButton.painter = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
        this.backButton.painter = (WidgetPainter) ((Object) new LinkButtonPainter());
        this.displayNameField.painter = (WidgetPainter) ((Object) new GradientOutlineTextPainter(10000536));
        GradientOutlineTextPainter dupTemp$0 = new GradientOutlineTextPainter(10000536);
        this.confirmEmailField.painter = (WidgetPainter) ((Object) dupTemp$0);
        this.emailField.painter = (WidgetPainter) ((Object) dupTemp$0);
        this.ageField.painter = (WidgetPainter) ((Object) new GradientOutlineTextPainter(10000536));
        this.receiveNewsCheckbox.painter = (WidgetPainter) ((Object) new SpriteCheckboxPainter());
        PasswordFieldPainter dupTemp$1 = new PasswordFieldPainter(10000536);
        this.confirmPasswordField.painter = (WidgetPainter) ((Object) dupTemp$1);
        this.passwordField.painter = (WidgetPainter) ((Object) dupTemp$1);
        String var2 = SingleChildContainer.a(AccountSessionSupport.field_b, -63, new String[]{this.linkStartMarkup(66), this.linkEndMarkup(3674)});
        int var3 = 20;
        var3 = var3 + this.addLabeledField(170, this.emailField, AccountNoticeDialog.field_Z, var3, 100);
        var3 = var3 + (this.addFieldWithHelp(20, this.confirmEmailField, 170, DisplayAndRatingSupport.field_a, 25, "", var3) + 5);
        var3 = var3 + this.addLabeledField(170, this.passwordField, RegistrationRequestDialog.field_vb, var3, 100);
        var3 = var3 + (this.addFieldWithHelp(170, LoginIdentifierSupport.field_d, var3, this.confirmPasswordField, DualLinkDequeIterator.field_a, 170) + 5);
        var3 = var3 + (5 + this.addFieldWithHelp(170, ValidationHelpWidget.field_J, var3, this.displayNameField, LevelSelectScreen.field_i, 170));
        var3 = var3 + this.addValidatedField(IterableNodeHashTable.field_a, (byte) 123, var3, this.ageField, 170);
        LabeledField var4 = new LabeledField(46, var3, -90 + this.width, 25, this.receiveNewsCheckbox, true, -120 + this.width, 5, LegacyMenuFontSupport.field_c, 11579568, ChatSettingsSupport.field_b);
        this.addChild(var4, false);
        var3 = var3 + var4.height;
        TextWidgetPainter var5 = new TextWidgetPainter(Js5Transport.field_a, 0, 0, 0, 0, 16777215, -1, 0, 0, Js5Transport.field_a.maxAscent, -1, 2147483647, true);
        this.termsWidget = new TextHotspotWidget(var2, var5);
        this.termsWidget.tooltip = "";
        this.termsWidget.setHotspotTooltip(TextFieldValidator.field_m, (byte) 65, 0);
        this.termsWidget.setHotspotTooltip(TextFieldValidator.field_m, (byte) 97, 1);
        this.termsWidget.listener = (UiListener) (this);
        this.termsWidget.setBoundsToTextHeight(2463, 46, this.width - 90, var3);
        var3 = var3 + (15 + this.termsWidget.height);
        this.addChild(this.termsWidget, false);
        int var6 = 4;
        int var7 = 200;
        this.submitButton.setBounds(var7, var3, -var7 + 496 >> 1, true, 40);
        this.backButton.setBounds(60, 15 + var3, var6 + 3, true, 40);
        this.backButton.listener = (UiListener) (this);
        this.submitButton.listener = (UiListener) (this);
        this.addChild(this.submitButton, false);
        this.addChild(this.backButton, false);
        this.suggestions = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.suggestions.setBounds(-60 - this.displayNameField.x + (this.width - this.displayNameField.width), 20 + this.displayNameField.y, 60 + this.displayNameField.x + this.displayNameField.width, true, 150);
        this.addChild(this.suggestions, false);
        this.setBounds(496, 0, 0, true, var6 + (var3 + 55));
    }

    private final String linkEndMarkup(int guard) {
        if (guard != 3674) {
          field_L = (QuickChatDynamicCommand) null;
          return "</col></u>";
        }
        return "</col></u>";
    }

    public final void onMoreSuggestions(byte guard) {
        ((NameAvailabilityValidator) (this.displayNameField.validator((byte) -89))).clearCachedName(22186);
        if (guard != -61) {
          field_T = (Sprite) null;
        }
    }

    private final boolean isFieldReady(boolean guard, ValidationProvider field) {
        String stackIn_21_2 = null;
        try {
          if (guard) {
            return false;
          }
          ValidationSource var3 = field.validator((byte) -89);
          if (var3 == null) {
            return true;
          }
          ValidationState var4 = var3.validationState(17124);
          if (var4 == ArchiveProvider.field_a) {
            return false;
          }
          if (var4 == SpriteDecodeSupport.field_f) {
            return false;
          }
          if (var4 != GradientOutlineTextPainter.field_s) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var3_ref;
          StringBuilder stackIn_20_1 = new StringBuilder().append("bf.F(").append(guard).append(',');
          if (field == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static IndexedSprite loadNamedIndexedSprite(ResourceArchive archive, int guard, String fileName, String groupName) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          int var4_int = archive.findGroupId(-1, groupName);
          if (guard <= 48) {
            field_L = (QuickChatDynamicCommand) null;
          }
          int var5 = archive.findFileId(var4_int, fileName, true);
          IndexedSprite stackIn_3_0 = StatefulTextPainter.loadIndexedSprite(archive, -18109, var5, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4;
          StringBuilder stackIn_6_1 = new StringBuilder().append("bf.T(");
          if (archive == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(',');
          if (fileName == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (groupName == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final int addValidatedField(String label, byte guard, int y, UiComponent component, int fieldWidth) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        try {
          LabeledField var8 = new LabeledField(20, y, 120 + fieldWidth, 25, component, false, 120, 3, Js5Transport.field_a, 16777215, label);
          this.addChild(var8, false);
          if (guard != 123) {
            this.receiveNewsCheckbox = (Checkbox) null;
          }
          ValidationIndicator var7 = new ValidationIndicator(((ValidationProvider) ((Object) component)).validator((byte) -89));
          this.addChild(var7, false);
          var7.setBounds(15, (-15 + var8.height >> 1) + var8.y, 3 + var8.width + var8.x, true, 15);
          int stackIn_3_0 = var8.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var6;
          StringBuilder stackIn_6_1 = new StringBuilder().append("bf.S(");
          if (label == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(',').append(y).append(',');
          if (component == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(fieldWidth).append(')').toString());
        }
    }

    final static java.awt.Canvas currentCanvas(byte guard) {
        if (guard == 10) {
          return null == IsaacRandom.field_d ? SpriteDecodeSupport.field_d : (java.awt.Canvas) ((Object) IsaacRandom.field_d);
        }
        objectSpriteSets = (ObjectSpriteSet[]) null;
        return null == IsaacRandom.field_d ? SpriteDecodeSupport.field_d : (java.awt.Canvas) ((Object) IsaacRandom.field_d);
    }

    final void updateHover(int guard, int offsetY, int offsetX, UiComponent root) {
        try {
          super.updateHover(guard, offsetY, offsetX, root);
          this.submitButton.enabled = this.areFieldsReady(true);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "bf.Q(" + guard + ',' + offsetY + ',' + offsetX + ',' + (root != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean areFieldsReady(boolean guard) {
        if (!guard) {
          return false;
        }
        if (!this.isFieldReady(false, this.displayNameField)) {
          return false;
        }
        if (!this.isFieldReady(false, this.emailField)) {
          return false;
        }
        if (!this.isFieldReady(false, this.confirmEmailField)) {
          return false;
        }
        if (!this.isFieldReady(!guard ? true : false, this.passwordField)) {
          return false;
        }
        if (!this.isFieldReady(false, this.confirmPasswordField)) {
          return false;
        }
        if (this.isFieldReady(false, this.ageField)) {
          return true;
        }
        return false;
    }

    private final String linkStartMarkup(int guard) {
        int var2 = -12 % ((guard + 57) / 43);
        return "<u=2164A2><col=2164A2>";
    }

    final boolean onFocusedKey(UiComponent root, char character, int keyCode, int guard) {
        String stackIn_18_2 = null;
        try {
          if (super.onFocusedKey(root, character, keyCode, 20)) {
            return true;
          }
          if (keyCode == 98) {
            boolean stackIn_7_0 = this.focusPreviousChild((byte) 22, root);
            return stackIn_7_0;
          }
          if (guard <= 0) {
            this.emailField = (ValidatedTextWidget) null;
          }
          if (keyCode != 99) {
            return false;
          }
          boolean stackIn_12_0 = this.focusNextChild(root, true);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var5;
          StringBuilder stackIn_17_1 = new StringBuilder().append("bf.G(");
          if (root == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(character).append(',').append(keyCode).append(',').append(guard).append(')').toString());
        }
    }

    private final int addFieldWithHelp(int helpHeight, UiComponent component, int fieldWidth, String label, int fieldHeight, String helpText, int y) {
        String stackIn_5_2 = null;
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        try {
          LabeledField var10 = new LabeledField(20, y, 120 + fieldWidth, fieldHeight, component, false, 120, 3, Js5Transport.field_a, 16777215, label);
          this.addChild(var10, false);
          ValidationHelpWidget var9 = new ValidationHelpWidget(((ValidationProvider) ((Object) component)).validator((byte) -89), helpText, 126, var10.height + y, fieldWidth + 50, helpHeight);
          var9.listener = (UiListener) (this);
          this.addChild(var9, false);
          int stackIn_1_0 = var9.height + var10.height;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var8;
          StringBuilder stackIn_4_1 = new StringBuilder().append("bf.B(").append(helpHeight).append(',');
          if (component == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          StringBuilder stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(fieldWidth).append(',');
          if (label == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(fieldHeight).append(',');
          if (helpText == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(y).append(')').toString());
        }
    }

    private final boolean submitRegistration(byte guard) {
        if (!this.areFieldsReady(true)) {
          return false;
        }
        int var2 = -1;
        int var3 = 38 % ((guard - 51) / 35);
        try {
          var2 = Integer.parseInt(this.ageField.text);
        } catch (NumberFormatException numberFormatException) {
        }
        return RegistrationFlowSupport.beginRegistration(this, false, this.emailField.text, var2, this.passwordField.text, this.receiveNewsCheckbox.selected, this.displayNameField.text);
    }

    public final void onHotspotAction(int guard, TextHotspotWidget widget, int hotspotId, int buttonCode) {
        String stackIn_13_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (guard != -2861) {
            objectSpriteSets = (ObjectSpriteSet[]) null;
          }
          if (0 == hotspotId) {
            AchievementRecord.a(12, "terms.ws");
            return;
          }
          if (1 == hotspotId) {
            AchievementRecord.a(12, "privacy.ws");
            return;
          }
          if (2 != hotspotId) {
            return;
          }
          AchievementRecord.a(12, "conduct.ws");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var5;
          StringBuilder stackIn_12_1 = new StringBuilder().append("bf.A(").append(guard).append(',');
          if (widget == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(hotspotId).append(',').append(buttonCode).append(')').toString());
        }
    }

    final static void addSessionCounterOffset(int offset, int guard) {
        if (guard != -15655) {
          return;
        }
        if (null != SocketJs5Transport.field_r) {
          SocketJs5Transport.field_r.addOffset(-1, offset);
        }
    }

    static {
        field_O = "Complete the tutorial by following<br>the instructions at the top of the screen.";
        field_L = new QuickChatDynamicCommand(11, 0, 1, 2);
    }
}
