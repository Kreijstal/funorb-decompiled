/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayNameForm extends UiContainer implements NameSuggestionListener, ButtonListener {
    private ValidatedTextWidget nameField;
    static Sprite field_O;
    NameSuggestionsPanel suggestions;
    private TextButton submitButton;
    static int[] field_M;
    private TextButton cancelButton;
    static String field_J;
    static int[] field_L;
    static String field_N;

    private final void submitName(int guard) {
        if (!this.canSubmit(84)) {
          return;
        }
        ej.a((byte) -116, this.nameField.text);
        if (guard >= -118) {
          String var3 = (String) null;
          int discarded$0 = this.appendValidatedField(125, (String) null, 33, 115, (UiComponent) null, (String) null, 107);
        }
    }

    public static void releaseStatics(byte guard) {
        field_N = null;
        field_O = null;
        if (guard > 61) {
          field_J = null;
          field_L = null;
          field_M = null;
          return;
        }
        field_L = (int[]) null;
        field_J = null;
        field_L = null;
        field_M = null;
    }

    private final boolean canSubmit(int guard) {
        if (!this.isValidField(this.nameField, -95)) {
          return false;
        }
        if (guard > 47) {
          return true;
        }
        String var3 = (String) null;
        int discarded$0 = this.appendStandardValidatedField(-69, (String) null, (UiComponent) null, -35, (byte) 72, (String) null);
        return true;
    }

    private final int appendValidatedField(int guard, String label, int helpHeight, int y, UiComponent field, String helpText, int fieldWidth) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (guard != 23273) {
            field_N = (String) null;
          }
          LabeledField var10 = new LabeledField(20, y, 120 + fieldWidth, 25, field, false, 120, 3, Js5Transport.field_a, 16777215, label);
          this.addChild(var10, false);
          ValidationHelpWidget var9 = new ValidationHelpWidget(((ValidationProvider) ((Object) field)).validator((byte) -89), helpText, 126, var10.height + y, 25 + fieldWidth, helpHeight);
          var9.listener = (UiListener) (this);
          this.addChild(var9, false);
          int stackIn_3_0 = var10.height + var9.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var8;
          StringBuilder stackIn_6_1 = new StringBuilder().append("oi.E(").append(guard).append(',');
          if (label == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(helpHeight).append(',').append(y).append(',');
          if (field == null) {
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
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(fieldWidth).append(')').toString());
        }
    }

    final static BinaryBitmapFont loadBinaryFont(int param0, ResourceArchive param1, String param2, String param3, ResourceArchive param4) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        try {
          int var5_int = param4.findGroupId(-1, param2);
          if (param0 != 4) {
            field_N = (String) null;
          }
          int var6 = param4.findFileId(var5_int, param3, true);
          BinaryBitmapFont stackIn_3_0 = WeightedLruCache.loadBitmapFont(param0 - 3, param1, var5_int, param4, var6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var5;
          StringBuilder stackIn_6_1 = new StringBuilder().append("oi.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void onMoreSuggestions(byte guard) {
        if (guard != -61) {
          return;
        }
        ((NameAvailabilityValidator) (this.nameField.validator((byte) -89))).clearCachedName(guard + 22247);
    }

    final void updateHover(int guard, int offsetY, int offsetX, UiComponent root) {
        try {
          super.updateHover(guard, offsetY, offsetX, root);
          this.submitButton.enabled = this.canSubmit(guard + 14569);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oi.Q(" + guard + ',' + offsetY + ',' + offsetX + ',' + (root != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean isValidField(ValidationProvider field, int guard) {
        String stackIn_13_2 = null;
        try {
          ValidationSource var3 = field.validator((byte) -89);
          if (var3 == null) {
            return true;
          }
          if (guard > -92) {
            return true;
          }
          ValidationState var4 = var3.validationState(17124);
          boolean stackIn_9_0 = (IsaacRandom.field_h == var4);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3_ref;
          StringBuilder stackIn_12_1 = new StringBuilder().append("oi.F(");
          if (field == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    private final int appendStandardValidatedField(int fieldWidth, String label, UiComponent field, int y, byte guard, String helpText) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (guard != -5) {
            field_J = (String) null;
          }
          int stackIn_3_0 = this.appendValidatedField(guard + 23278, label, 35, y, field, helpText, fieldWidth);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var7;
          StringBuilder stackIn_6_1 = new StringBuilder().append("oi.N(").append(fieldWidth).append(',');
          if (label == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (field == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(y).append(',').append(guard).append(',');
          if (helpText == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void onNameSelected(byte guard, String name) {
        try {
          if (guard >= -49) {
            this.onMoreSuggestions((byte) -79);
          }
          ValidatedTextWidget var3 = this.nameField;
          String var4 = name;
          ((EditableTextWidget) ((Object) var3)).setText(var4, false, -33);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oi.J(" + guard + ',' + (name != null ? "{...}" : "null") + ')');
        }
    }

    public final void onAction(TextButton button, int buttonCode, int localY, int guard, int localX) {
        String stackIn_10_2 = null;
        try {
          if (guard != 1) {
            return;
          }
          if (this.cancelButton == button) {
            GameAppletShell.b(guard ^ -104);
            return;
          }
          if (button != this.submitButton) {
            return;
          }
          this.submitName(-125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var6;
          StringBuilder stackIn_9_1 = new StringBuilder().append("oi.K(");
          if (button == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(buttonCode).append(',').append(localY).append(',').append(guard).append(',').append(localX).append(')').toString());
        }
    }

    final boolean onFocusedKey(UiComponent root, char character, int keyCode, int guard) {
        String stackIn_16_2 = null;
        try {
          if (super.onFocusedKey(root, character, keyCode, 78)) {
            return true;
          }
          if (keyCode == 98) {
            boolean stackIn_6_0 = this.focusPreviousChild((byte) 22, root);
            return stackIn_6_0;
          }
          if (guard <= 0) {
            field_L = (int[]) null;
          }
          if (keyCode != 99) {
            return false;
          }
          boolean stackIn_12_0 = this.focusNextChild(root, true);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var5;
          StringBuilder stackIn_15_1 = new StringBuilder().append("oi.G(");
          if (root == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(character).append(',').append(keyCode).append(',').append(guard).append(')').toString());
        }
    }

    final static int k(int param0) {
        if (param0 != -99) {
          field_M = (int[]) null;
          return AnimatedPanelFrame.field_a;
        }
        return AnimatedPanelFrame.field_a;
    }

    public DisplayNameForm() {
        super(0, 0, 496, 0, (WidgetPainter) null);
        this.nameField = new ValidatedTextWidget("", (UiListener) null, 12);
        TextWidgetPainter var1 = new TextWidgetPainter(ke.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, Js5Transport.field_a.maxAscent, -1, 2147483647, true);
        UiComponent var2 = new UiComponent(DebouncedValidator.field_a, var1, (UiListener) null);
        this.submitButton = new TextButton(TextFieldValidator.field_i, (UiListener) null);
        this.cancelButton = new TextButton(cf.field_b, (UiListener) null);
        this.nameField.tooltip = ModalPanel.field_K;
        this.nameField.setValidator(new NameAvailabilityValidator(this.nameField), (byte) 63);
        this.submitButton.enabled = false;
        this.submitButton.painter = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
        this.cancelButton.painter = (WidgetPainter) ((Object) new LinkButtonPainter());
        this.nameField.painter = (WidgetPainter) ((Object) new GradientOutlineTextPainter(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.setBounds(270, var3, 20, true, 50);
        var3 += 50;
        this.addChild(var2, false);
        var3 = var3 + (5 + this.appendStandardValidatedField(170, ValidationHelpWidget.field_J, this.nameField, var3, (byte) -5, ig.field_i));
        this.submitButton.setBounds(var5, var3, 496 - var5 >> 1, true, 40);
        this.cancelButton.setBounds(60, 15 + var3, 3 + var4, true, 40);
        this.cancelButton.listener = (UiListener) (this);
        this.submitButton.listener = (UiListener) (this);
        this.addChild(this.submitButton, false);
        this.addChild(this.cancelButton, false);
        this.suggestions = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.suggestions.setBounds(-this.nameField.width + this.width + (-this.nameField.x - 60), 20, this.nameField.x + (this.nameField.width + 60), true, 150);
        this.addChild(this.suggestions, false);
        this.setBounds(496, 0, 0, true, var4 + var3 + 55);
    }

    static {
        field_M = new int[4];
        field_J = "Target eliminated";
        field_N = "Sound: ";
        field_L = new int[8192];
    }
}
