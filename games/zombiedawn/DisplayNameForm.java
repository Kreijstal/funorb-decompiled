/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayNameForm extends UiContainer implements UsernameSuggestionListener, ButtonActionListener {
    private TextButton field_H;
    private TextButton field_G;
    NameSuggestionsPanel field_I;
    private ValidatedTextWidget field_F;

    public DisplayNameForm() {
        super(0, 0, 496, 0, (WidgetPainter) null);
        this.field_F = new ValidatedTextWidget("", (WidgetListener) null, 12);
        TextWidgetPainter var1 = new TextWidgetPainter(SecondaryNodeDeque.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, MenuFontGlobals.field_e.field_I, -1, 2147483647, true);
        UiWidget var2 = new UiWidget(PendingRecordRequest.field_j, var1, (WidgetListener) null);
        this.field_H = new TextButton(TileMap.field_n, (WidgetListener) null);
        this.field_G = new TextButton(NameCharacterHelpers.field_b, (WidgetListener) null);
        this.field_F.field_s = LoginMethod.field_d;
        this.field_F.setValidationSource(46, new NameAvailabilityValidator(this.field_F));
        this.field_H.field_C = false;
        this.field_H.field_h = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
        this.field_G.field_h = (WidgetPainter) ((Object) new LinkTextPainter());
        this.field_F.field_h = (WidgetPainter) ((Object) new InsetTextPainter(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.setBounds(87, var3, 20, 270, 50);
        var3 += 50;
        this.addChild(var2, 10);
        var3 = var3 + (this.addFieldWithHelpDefaultWidth(170, BulletCasing.field_l, (byte) -76, PendingIntArrayRequest.field_i, this.field_F, var3) + 5);
        this.field_H.setBounds(34, var3, 496 - var5 >> 1, var5, 40);
        this.field_G.setBounds(63, 15 + var3, var4 + 3, 60, 40);
        this.field_G.field_v = (WidgetListener) (this);
        this.field_H.field_v = (WidgetListener) (this);
        this.addChild(this.field_H, 10);
        this.addChild(this.field_G, 10);
        this.field_I = new NameSuggestionsPanel((UsernameSuggestionListener) (this));
        this.field_I.setBounds(38, 20, 60 + this.field_F.field_i + this.field_F.field_k, -60 + (this.field_i - this.field_F.field_k - this.field_F.field_i), 150);
        this.addChild(this.field_I, 10);
        this.setBounds(-90, 0, 0, 496, var4 + (var3 + 55));
    }

    private final boolean canSubmit(int param0) {
        int discarded$0 = 0;
        if (param0 != 13) {
          UiWidget var3 = (UiWidget) null;
          discarded$0 = this.addFieldWithHelpDefaultWidth(106, (String) null, (byte) -4, (String) null, (UiWidget) null, -13);
          if (this.isInputValid(65, (ValidationSource) (this.field_F))) {
            return true;
          }
          return false;
        }
        if (this.isInputValid(65, (ValidationSource) (this.field_F))) {
          return true;
        }
        return false;
    }

    private final int addFieldWithHelp(int param0, int param1, UiWidget param2, String param3, int param4, int param5, String param6) {
        RuntimeException var8 = null;
        ValidationMessageWidget var9 = null;
        CaptionedContainer var10 = null;
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
          var10 = new CaptionedContainer(20, param1, param0 + 120, 25, param2, false, 120, 3, MenuFontGlobals.field_e, 16777215, param3);
          this.addChild(var10, 10);
          var9 = new ValidationMessageWidget(((ValidationSource) ((Object) param2)).getValidationSource(0), param6, 126, param1 + var10.field_n, param0 + 25, param5);
          var9.field_v = (WidgetListener) (this);
          this.addChild(var9, 10);
          if (param4 != -24396) {
            this.field_I = (NameSuggestionsPanel) null;
          }
          stackIn_3_0 = var9.field_n + var10.field_n;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("fh.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void submitName(byte param0) {
        if (!this.canSubmit(13)) {
          return;
        }
        UiResourceHelpers.submitDisplayName((byte) 2, this.field_F.field_o);
        if (param0 < 97) {
          CharSequence var3 = (CharSequence) null;
          DisplayNameForm.validateDisplayName((CharSequence) null, -91, false);
        }
    }

    public final void onSuggestionChosen(byte param0, String param1) {
        ValidatedTextWidget var3 = null;
        String var4 = null;
        try {
          var3 = this.field_F;
          var4 = param1;
          ((EditableTextWidget) ((Object) var3)).setText(false, false, var4);
          int var5 = -116 % ((-40 - param0) / 48);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "fh.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String validateDisplayName(CharSequence param0, int param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = ZombieDawn.field_J;
        try {
          if (param1 != 7065) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var3 = MusicPatchPcmStream.getDisplayNameValidationMessage(1048576, param2, param0);
          if (var3 != null) {
            stackIn_7_0 = var3;
            return stackIn_7_0;
          }
          var4 = 0;
          while (true) {
            if (param0.length() <= var4) {
              return null;
            }
            if (SpriteCheckboxPainter.isValidNameCharacter((byte) 27, param0.charAt(var4))) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_13_0 = ScorePopup.field_G;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("fh.J(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean requestKeyboardFocus(int param0, int param1, UiWidget param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -90 % ((param0 + 83) / 32);
          if (super.requestKeyboardFocus(-119, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_5_0 = this.focusPreviousChild((byte) 120, param2);
            return stackIn_5_0;
          }
          if (99 != param1) {
            return false;
          }
          stackIn_8_0 = this.focusNextChild(1, param2);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("fh.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean isInputValid(int param0, ValidationSource param1) {
        TextValidator var3 = null;
        RuntimeException var3_ref = null;
        ValidationState var4 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 64) {
            this.field_F = (ValidatedTextWidget) null;
          }
          var3 = param1.getValidationSource(0);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getValidationState((byte) -90);
          stackIn_9_0 = (EmailSyntaxValidator.field_g == var4);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("fh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void createMenuScreens(int param0) {
        int[] var5 = new int[]{0, 42, 3, 43, 2, 14, 11};
        int[] var2 = new int[]{37, 12, 13, 4, 6};
        FadingModalPanel.createMenuScreen(0, param0, new int[]{}, 0, false, -14237, 0, 0);
        FadingModalPanel.createMenuScreen(170, 470, var5, 1, true, -14237, 33, 180);
        FadingModalPanel.createMenuScreen(170, 470, var2, 14, true, -14237, 33, 180);
        FadingModalPanel.createMenuScreen(170, 460, new int[]{1, 12, 13, 34, 3, 21, 7}, 2, true, -14237, 38, 118);
        FadingModalPanel.createMenuScreen(0, 640, new int[]{15, 5}, 3, false, -14237, 40, 430);
        FadingModalPanel.createMenuScreen(30, 468, new int[]{17, 6, 18}, 4, false, -14237, 200, 430);
        FadingModalPanel.createMenuScreen(0, 640, new int[]{15, 6}, 5, false, -14237, 120, 430);
        FadingModalPanel.createMenuScreen(100, 440, new int[]{2, 5}, 6, false, param0 - 14237, 220, 430);
        FadingModalPanel.createMenuScreen(194, 446, new int[]{15, 16}, 7, true, param0 - 14237, 100, 200);
        FadingModalPanel.createMenuScreen(50, 288, new int[]{5}, 8, false, -14237, 40, 400);
        GrowableIntList.createMenuScreen(240, 428, 400, 160, new int[]{5, 39, 26, 27, 28, 29, 30, 31, 32, 33}, 9, false, (byte) -12, new int[]{5, 39, 22, 23, 24, 25});
        int[] var4 = (int[]) null;
        FadingModalPanel.createMenuScreen(180, 460, (int[]) null, 10, true, -14237, 60, 370);
        FadingModalPanel.createMenuScreen(0, 0, new int[]{}, 11, true, param0 - 14237, 0, 0);
        FadingModalPanel.createMenuScreen(0, 0, new int[]{19}, 12, true, -14237, 0, 0);
        FadingModalPanel.createMenuScreen(240, 400, new int[]{5, 39, 45, 46}, 13, false, -14237, 160, 428);
        TextLayoutLine.createMenuBackgroundActors(param0 ^ 1);
        SettingsCookieHelpers.field_b = ProgressMessageDialog.field_jb.textWidth(InputValidationResult.field_b[12]);
        int var3 = ProgressMessageDialog.field_jb.textWidth(InputValidationResult.field_b[13]);
        if (!(var3 <= SettingsCookieHelpers.field_b)) {
          SettingsCookieHelpers.field_b = var3;
        }
        ((MainMenuScreen) (ArmedHuman.field_Jb[1])).fitWidthToLabels((byte) -49);
        ((MainMenuScreen) (ArmedHuman.field_Jb[14])).fitWidthToLabels((byte) -41);
    }

    final void updatePointer(UiWidget param0, byte param1, int param2, int param3) {
        try {
          super.updatePointer(param0, (byte) -48, param2, param3);
          int var5_int = 102 % ((param1 - 46) / 42);
          this.field_H.field_C = this.canSubmit(13);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "fh.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String getLoginPromptText(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = param2;
        if (param1) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (param0) {
          var4++;
        }
        return ErrorReportHelpers.field_b[var4];
    }

    private final int addFieldWithHelpDefaultWidth(int param0, String param1, byte param2, String param3, UiWidget param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == -76) {
            stackIn_4_0 = this.addFieldWithHelp(param0, param5, param4, param3, param2 - 24320, 35, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = 105;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("fh.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(')').toString());
        }
    }

    public final void onMoreSuggestionsRequested(int param0) {
        ((NameAvailabilityValidator) (this.field_F.getValidationSource(0))).invalidateCachedAvailability(-28769);
        int var2 = -91 % ((39 - param0) / 49);
    }

    public final void onButtonActivated(int param0, int param1, TextButton param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != this.field_G) {
            if (this.field_H == param2) {
              this.submitName((byte) 117);
            }
          } else {
            Js5Archive.showLoginDialog(113);
          }
          if (param1 == -6) {
            return;
          }
          this.submitName((byte) 71);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("fh.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
