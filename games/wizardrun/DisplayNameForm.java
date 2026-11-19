/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayNameForm extends WidgetContainer implements NameSelectionListener, ButtonActionListener {
    private TextButton field_G;
    private TextButton field_F;
    NameSuggestionsPanel suggestions;
    private ValidatedTextField nameInput;

    private final boolean isFormValid(boolean param0) {
        if (param0) {
          this.field_F = (TextButton) null;
          if (this.isInputValid(3, this.nameInput)) {
            return true;
          }
          return false;
        }
        if (this.isInputValid(3, this.nameInput)) {
          return true;
        }
        return false;
    }

    private final int addStandardValidatedField(int param0, String param1, String param2, int param3, int param4, UiWidget param5) {
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
          if (param3 != 29171) {
            this.nameInput = (ValidatedTextField) null;
          }
          stackIn_3_0 = this.addValidatedField(-31970, param4, 35, param1, param5, param0, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("tb.IA(").append(param0).append(',');
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void updateInput(int param0, int param1, int param2, UiWidget param3) {
        int discarded$0 = 0;
        try {
          super.updateInput(param0 ^ 0, param1, param2, param3);
          if (param0 != 10000536) {
            UiWidget var6 = (UiWidget) null;
            discarded$0 = this.addStandardValidatedField(-69, (String) null, (String) null, -121, -105, (UiWidget) null);
          }
          this.field_F.field_B = this.isFormValid(false);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "tb.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public DisplayNameForm() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.nameInput = new ValidatedTextField("", (WidgetListener) null, 12);
        WidgetPainter var1 = new WidgetPainter(ThreePieceFrameHelpers.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, Crc32Helpers.field_b.field_M, -1, 2147483647, true);
        UiWidget var2 = new UiWidget(MouseWheelInput.field_d, var1, (WidgetListener) null);
        this.field_F = new TextButton(KeyboardShutdownHelpers.field_b, (WidgetListener) null);
        this.field_G = new TextButton(StringPaddingHelpers.field_a, (WidgetListener) null);
        this.nameInput.tooltip = DiskCacheWorker.field_a;
        this.nameInput.setValidator(0, new DisplayNameValidator(this.nameInput));
        this.field_F.field_B = false;
        this.field_F.renderer = (WidgetRenderer) ((Object) new SpriteButtonPainter());
        this.field_G.renderer = (WidgetRenderer) ((Object) new HyperlinkPainter());
        this.nameInput.renderer = (WidgetRenderer) ((Object) new FramedButtonPainter(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.setBounds(121, var3, 50, 270, 20);
        int var5 = 200;
        this.addChild(var2, (byte) 16);
        var3 += 50;
        var3 = var3 + (5 + this.addStandardValidatedField(170, MonotonicClockHelpers.field_b, AccountConsentPanel.field_E, 29171, var3, this.nameInput));
        this.field_F.setBounds(109, var3, 40, var5, -var5 + 496 >> 1);
        this.field_G.setBounds(118, 15 + var3, 40, 60, var4 + 3);
        this.field_G.listener = (WidgetListener) (this);
        this.field_F.listener = (WidgetListener) (this);
        this.addChild((UiWidget) (this.field_F), (byte) 105);
        this.addChild((UiWidget) (this.field_G), (byte) 83);
        this.suggestions = new NameSuggestionsPanel((NameSelectionListener) (this));
        this.suggestions.setBounds(125, 20, 150, this.width - (this.nameInput.x - (-this.nameInput.width - 60)), this.nameInput.x + (this.nameInput.width + 60));
        this.addChild((UiWidget) (this.suggestions), (byte) 47);
        this.setBounds(113, 0, 55 + var3 + var4, 496, 0);
    }

    final static void writeSavedDataSubmission(int param0, int param1, SavedDataSubmission param2) {
        IsaacPacketBuffer var5 = AccountPacketState.field_b;
        var5.writeCipheredOpcode((byte) 77, param0);
        var5.position = var5.position + 1;
        int var4 = var5.position;
        if (param1 != -17932) {
          return;
        }
        try {
          var5.writeByte((byte) 11, 1);
          if (param2.payload == null) {
            var5.writeByte((byte) 11, 0);
          } else {
            var5.writeByte((byte) 11, param2.payload.length);
            var5.writeBytes(param2.payload, 0, param2.payload.length, param1 ^ -17983);
          }
          var5.appendCrc(var4, param1 - 1182869092);
          var5.position = var5.position - 4;
          param2.crc = var5.readInt(255);
          var5.backpatchByteLength(var5.position - var4, -88);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "tb.CA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void resetMembershipSlideState(int param0, boolean param1) {
        Base37Codec.field_d = param0;
        WidgetTheme.field_j = MidiPcmStream.field_M;
        IndexedSpriteArrayFactory.field_c = 0;
        ByteArrayPool.field_c = 0;
        GameGraphicsResources.field_d = new MenuInputState(2);
        GameGraphicsResources.field_d.resetSelection(param0 ^ -12785, ChatMessage.hitTestMembershipButton(29292, NetworkArchiveRequest.field_B, AchievementSubmission.field_n), param1, -1);
    }

    public final void onButtonAction(int param0, TextButton param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -18905) {
            return;
          }
          if (param1 == this.field_G) {
            Js5Index.showEmptyLoginForm(-1);
            return;
          }
          if (param1 != this.field_F) {
            return;
          }
          this.submitDisplayName(104);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("tb.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void submitDisplayName(int param0) {
        if (!this.isFormValid(false)) {
          return;
        }
        if (param0 <= 21) {
          return;
        }
        MessagePanel.showAccountProgressWithText(-125, this.nameInput.text);
    }

    private final boolean isInputValid(int param0, ValidatorProvider param1) {
        Validator var3 = null;
        RuntimeException var3_ref = null;
        ValidationState var4 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.getValidator((byte) -23);
          if (var3 == null) {
            return true;
          }
          if (param0 != 3) {
            this.field_G = (TextButton) null;
          }
          var4 = var3.getState(true);
          stackIn_9_0 = (ContentTransitionDialog.field_V == var4);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("tb.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void invalidateNameAvailability(int param0) {
        if (param0 == 2147483647) {
          ((DisplayNameValidator) (this.nameInput.getValidator((byte) 0))).clearCachedNameResult(105);
          return;
        }
        UiWidget var3 = (UiWidget) null;
        int discarded$0 = this.addStandardValidatedField(4, (String) null, (String) null, 24, -50, (UiWidget) null);
        ((DisplayNameValidator) (this.nameInput.getValidator((byte) 0))).clearCachedNameResult(105);
    }

    private final int addValidatedField(int param0, int param1, int param2, String param3, UiWidget param4, int param5, String param6) {
        RuntimeException var8 = null;
        ValidationHelpWidget var9 = null;
        TextButton var10 = null;
        LabeledField var11 = null;
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
          var11 = new LabeledField(20, param1, 120 + param5, 25, param4, false, 120, 3, Crc32Helpers.field_b, 16777215, param6);
          if (param0 != -31970) {
            var10 = (TextButton) null;
            this.onButtonAction(19, (TextButton) null, -126, -50, 59);
          }
          this.addChild((UiWidget) (var11), (byte) 44);
          var9 = new ValidationHelpWidget(((ValidatorProvider) ((Object) param4)).getValidator((byte) 117), param3, 126, param1 + var11.height, 25 + param5, param2);
          var9.listener = (WidgetListener) (this);
          this.addChild((UiWidget) (var9), (byte) 95);
          stackIn_3_0 = var9.height + var11.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("tb.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean handleKeyPress(char param0, int param1, byte param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyPress(param0, param1, (byte) -100, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_7_0 = this.focusPreviousChild((byte) -117, param3);
            return stackIn_7_0;
          }
          if (param2 >= -96) {
            DisplayNameForm.resetMembershipSlideState(44, false);
          }
          if (99 != param1) {
            return false;
          }
          stackIn_13_0 = this.focusNextChild(param3, 1);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("tb.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final void onNameSelected(String param0, byte param1) {
        ValidatedTextField var3 = null;
        String var4 = null;
        if (param1 <= 61) {
          return;
        }
        try {
          var3 = this.nameInput;
          var4 = param0;
          ((EditableTextWidget) ((Object) var3)).setText(-1, false, var4);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "tb.CB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
