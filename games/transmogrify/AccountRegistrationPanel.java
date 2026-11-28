/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRegistrationPanel extends DequeWidgetContainer implements TextHotspotListener, WidgetActivationListener, NameSuggestionListener {
    static Sprite field_K;
    private ValidatedTextField field_C;
    private InteractiveWidget field_G;
    private ValidatedTextField field_x;
    private ValidatedTextField field_J;
    private RichTextWidget field_z;
    private bf field_w;
    private ValidatedTextField field_y;
    private ValidatedTextField field_F;
    NameSuggestionsPanel field_D;
    static boolean field_I;
    private InteractiveWidget field_A;
    private ValidatedTextField field_E;

    public AccountRegistrationPanel() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.field_J = new ValidatedTextField("", (WidgetEventListener) null, 12);
        this.field_y = new ValidatedTextField("", (WidgetEventListener) null, 100);
        this.field_E = new ValidatedTextField("", (WidgetEventListener) null, 100);
        this.field_F = new ValidatedTextField("", (WidgetEventListener) null, 20);
        this.field_x = new ValidatedTextField("", (WidgetEventListener) null, 20);
        this.field_C = new ValidatedTextField("", (WidgetEventListener) null, 3);
        int var1 = 1;
        this.field_w = new bf("", (WidgetEventListener) null, var1 != 0);
        this.field_G = new InteractiveWidget(ModalDialogHost.field_A, (WidgetEventListener) null);
        this.field_A = new InteractiveWidget(el.field_a, (WidgetEventListener) null);
        this.field_J.field_j = mf.field_a;
        this.field_y.field_j = aa.field_c;
        this.field_E.field_j = ProgressDialog.field_V;
        this.field_F.field_j = GameApplet.field_g;
        this.field_x.field_j = gb.field_b;
        this.field_C.field_j = wj.field_l;
        this.field_w.field_j = ia.field_l;
        this.field_J.setFieldValidator(-86, new AccountNameAvailabilityValidator(this.field_J));
        this.field_y.setFieldValidator(120, new EmailFormatValidator(this.field_y));
        this.field_E.setFieldValidator(-91, new ConfirmedEmailAvailabilityValidator(this.field_E, this.field_y));
        this.field_F.setFieldValidator(100, new PasswordValidator(this.field_F, this.field_J, this.field_y));
        this.field_x.setFieldValidator(97, new MatchingFieldValidator(this.field_x, this.field_F));
        this.field_C.setFieldValidator(-104, new AgeValidator(this.field_C));
        this.field_G.field_t = false;
        this.field_G.field_q = (WidgetRenderer) ((Object) new qa());
        this.field_A.field_q = (WidgetRenderer) ((Object) new ek());
        this.field_J.field_q = (WidgetRenderer) ((Object) new ni(10000536));
        ni dupTemp$0 = new ni(10000536);
        this.field_E.field_q = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_y.field_q = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_C.field_q = (WidgetRenderer) ((Object) new ni(10000536));
        this.field_w.field_q = (WidgetRenderer) ((Object) new kd());
        nc dupTemp$1 = new nc(10000536);
        this.field_x.field_q = (WidgetRenderer) ((Object) dupTemp$1);
        this.field_F.field_q = (WidgetRenderer) ((Object) dupTemp$1);
        String var2 = ij.a(gk.field_g, new String[]{this.getLinkOpenMarkup(-122), this.getLinkCloseMarkup(106)}, (byte) -72);
        int var3 = 20;
        var3 = var3 + this.addLabeledField(170, 74, EditableTextField.field_I, this.field_y, var3);
        var3 = var3 + (this.addLabeledFieldWithValidationMessage(66, this.field_E, 20, "", 170, SecondaryNodeDeque.field_i, var3) + 5);
        var3 = var3 + this.addLabeledField(170, 101, DialogMessagePane.field_y, this.field_F, var3);
        var3 = var3 + (5 + this.addLabeledFieldWithDefaultValidationMessage(this.field_x, 170, 35, ContextualRuntimeException.field_d, var3, BoundedRandomAccessFile.field_a));
        var3 = var3 + (5 + this.addLabeledFieldWithDefaultValidationMessage(this.field_J, 170, 35, ResizableModalDialog.field_O, var3, rd.field_b));
        var3 = var3 + this.addLabeledFieldWithValidationIcon(170, 818340513, StripedProgressWidget.field_A, var3, this.field_C);
        LabeledWidgetContainer var4 = new LabeledWidgetContainer(46, var3, -90 + this.field_l, 25, this.field_w, true, -120 + this.field_l, 5, al.field_i, 11579568, uh.field_o);
        this.addChild((UiWidget) (var4), (byte) -105);
        var3 = var3 + var4.field_h;
        DefaultTextWidgetRenderer var5 = new DefaultTextWidgetRenderer(vd.field_h, 0, 0, 0, 0, 16777215, -1, 0, 0, vd.field_h.field_y, -1, 2147483647, true);
        this.field_z = new RichTextWidget(var2, var5);
        this.field_z.field_j = "";
        this.field_z.setHotspotTooltip(ModalDialog.field_E, 0, 0);
        this.field_z.setHotspotTooltip(ModalDialog.field_E, 0, 1);
        this.field_z.field_m = (WidgetEventListener) (this);
        this.field_z.setTextBounds(46, -90 + this.field_l, -1, var3);
        var3 = var3 + (this.field_z.field_h + 15);
        this.addChild((UiWidget) (this.field_z), (byte) -88);
        int var6 = 4;
        int var7 = 200;
        this.field_G.setBounds(-83, var3, -var7 + 496 >> 1, var7, 40);
        this.field_A.setBounds(-107, 15 + var3, 3 + var6, 60, 40);
        this.field_A.field_m = (WidgetEventListener) (this);
        this.field_G.field_m = (WidgetEventListener) (this);
        this.addChild((UiWidget) (this.field_G), (byte) -119);
        this.addChild((UiWidget) (this.field_A), (byte) -125);
        this.field_D = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.field_D.setBounds(124, this.field_J.field_n + 20, this.field_J.field_p + this.field_J.field_l + 60, -this.field_J.field_p + (this.field_l + (-this.field_J.field_l - 60)), 150);
        this.addChild((UiWidget) (this.field_D), (byte) -97);
        this.setBounds(39, 0, 0, 496, 55 + (var3 + var6));
    }

    public final void onNameSuggestionSelected(boolean param0, String param1) {
        ValidatedTextField var3 = null;
        String var4 = null;
        try {
          var3 = this.field_J;
          var4 = param1;
          ((EditableTextField) ((Object) var3)).setText(var4, param0, 1);
        } catch (RuntimeException runtimeException) {
          throw ch.wrapClientException((Throwable) ((Object) runtimeException), "wl.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onNameSuggestionsRefreshRequested(byte param0) {
        ((AccountNameAvailabilityValidator) (this.field_J.getFieldValidator((byte) 125))).invalidateCheckedName(93);
        if (param0 != -69) {
          this.field_C = (ValidatedTextField) null;
        }
    }

    public final void onTextHotspotActivated(int param0, int param1, int param2, RichTextWidget param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param1 != 2818) {
            return;
          }
          if (0 == param2) {
            mh.a(11207, "terms.ws");
            return;
          }
          if (param2 == 1) {
            mh.a(11207, "privacy.ws");
            return;
          }
          if (param2 != 2) {
            return;
          }
          mh.a(param1 + 8389, "conduct.ws");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("wl.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, int param1) {
        if (param0) {
          AccountRegistrationPanel.a(false, -117);
          if (param1 == -1) {
            return true;
          }
          return 0 != (hc.field_t & 1 << param1) ? true : false;
        }
        if (param1 == -1) {
          return true;
        }
        return 0 != (hc.field_t & 1 << param1) ? true : false;
    }

    private final int addLabeledFieldWithValidationIcon(int param0, int param1, String param2, int param3, UiWidget param4) {
        RuntimeException var6 = null;
        ValidationStatusIcon var7 = null;
        LabeledWidgetContainer var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new LabeledWidgetContainer(20, param3, param0 + 120, 25, param4, false, 120, 3, vd.field_h, 16777215, param2);
          this.addChild((UiWidget) (var8), (byte) -124);
          if (param1 != 818340513) {
            stackIn_2_0 = -55;
            return stackIn_2_0;
          }
          var7 = new ValidationStatusIcon(((FieldValidatorProvider) ((Object) param4)).getFieldValidator((byte) 87));
          this.addChild((UiWidget) (var7), (byte) -103);
          var7.setBounds(91, (-15 + var8.field_h >> 1) + var8.field_n, var8.field_l + var8.field_p + 3, 15, 15);
          stackIn_4_0 = var8.field_h;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("wl.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final String getLinkCloseMarkup(int param0) {
        if (param0 < 0) {
          AccountRegistrationPanel.a(true, 45);
          return "</col></u>";
        }
        return "</col></u>";
    }

    private final String getLinkOpenMarkup(int param0) {
        int var2 = -34 / ((-77 - param0) / 42);
        return "<u=2164A2><col=2164A2>";
    }

    private final int addLabeledField(int param0, int param1, String param2, UiWidget param3, int param4) {
        LabeledWidgetContainer var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new LabeledWidgetContainer(20, param4, 120 + param0, 25, param3, false, 120, 3, vd.field_h, 16777215, param2);
          if (param1 <= 12) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          this.addChild((UiWidget) (var6), (byte) -121);
          stackIn_4_0 = var6.field_h;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("wl.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean handleKey(int param0, UiWidget param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, (byte) -99, param3)) {
            return true;
          }
          if (98 == param0) {
            stackIn_5_0 = this.focusPreviousChild(2, param1);
            return stackIn_5_0;
          }
          if (param0 == 99) {
            stackIn_9_0 = this.focusNextChild(param1, 63);
            return stackIn_9_0;
          }
          var5_int = 47 % ((65 - param2) / 55);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("wl.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ch.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean isFieldReadyForRegistration(byte param0, FieldValidatorProvider param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        rc var4 = null;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.getFieldValidator((byte) 85);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getValidationStatus(27835);
          var5 = -88 % ((52 - param0) / 45);
          if (SocketConnector.field_d == var4) {
            return false;
          }
          if (var4 == ek.field_a) {
            return false;
          }
          if (var4 != bc.field_a) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("wl.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ch.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final void onWidgetActivated(InteractiveWidget param0, int param1, int param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 17) {
            field_K = (Sprite) null;
          }
          if (param0 == this.field_A) {
            kc.a((byte) -127);
            return;
          }
          if (param0 != this.field_G) {
            return;
          }
          discarded$1 = this.submitRegistration(2188);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("wl.MA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int addLabeledFieldWithValidationMessage(int param0, UiWidget param1, int param2, String param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        ValidationStatusWidget var9 = null;
        LabeledWidgetContainer var10 = null;
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
          if (param0 < 60) {
            stackIn_2_0 = -93;
            return stackIn_2_0;
          }
          var10 = new LabeledWidgetContainer(20, param6, param4 + 120, 25, param1, false, 120, 3, vd.field_h, 16777215, param5);
          this.addChild((UiWidget) (var10), (byte) -113);
          var9 = new ValidationStatusWidget(((FieldValidatorProvider) ((Object) param1)).getFieldValidator((byte) -101), param3, 126, var10.field_h + param6, param4 + 50, param2);
          var9.field_m = (WidgetEventListener) (this);
          this.addChild((UiWidget) (var9), (byte) -89);
          stackIn_4_0 = var9.field_h + var10.field_h;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("wl.PA(").append(param0).append(',');
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
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (param2 == 170) {
          FrameTimer.a(param2 - 280, param0, (String) null, param1);
          return;
        }
        field_I = false;
        FrameTimer.a(param2 - 280, param0, (String) null, param1);
    }

    private final boolean submitRegistration(int param0) {
        if (!this.canSubmitRegistration(15)) {
          return false;
        }
        int var2 = -1;
        try {
          var2 = Integer.parseInt(this.field_C.field_k);
        } catch (NumberFormatException numberFormatException) {
        }
        if (param0 == 2188) {
          return MusicPatchPcmStream.a(this, this.field_y.field_k, this.field_F.field_k, this.field_w.field_y, false, this.field_J.field_k, var2);
        }
        UiWidget var4 = (UiWidget) null;
        int discarded$0 = this.addLabeledField(80, -87, (String) null, (UiWidget) null, -6);
        return MusicPatchPcmStream.a(this, this.field_y.field_k, this.field_F.field_k, this.field_w.field_y, false, this.field_J.field_k, var2);
    }

    public static void clearStaticReferences(byte param0) {
        int var1 = 54 / ((-76 - param0) / 38);
        field_K = null;
    }

    private final boolean canSubmitRegistration(int param0) {
        if (param0 != 15) {
          this.field_z = (RichTextWidget) null;
          if (!this.isFieldReadyForRegistration((byte) 118, (FieldValidatorProvider) (this.field_J))) {
            return false;
          }
          if (!this.isFieldReadyForRegistration((byte) 98, (FieldValidatorProvider) (this.field_y))) {
            return false;
          }
          if (!this.isFieldReadyForRegistration((byte) 104, (FieldValidatorProvider) (this.field_E))) {
            return false;
          }
          if (!this.isFieldReadyForRegistration((byte) 123, (FieldValidatorProvider) (this.field_F))) {
            return false;
          }
          if (!this.isFieldReadyForRegistration((byte) 0, (FieldValidatorProvider) (this.field_x))) {
            return false;
          }
          if (this.isFieldReadyForRegistration((byte) 114, (FieldValidatorProvider) (this.field_C))) {
            return true;
          }
          return false;
        }
        if (!this.isFieldReadyForRegistration((byte) 118, (FieldValidatorProvider) (this.field_J))) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((byte) 98, (FieldValidatorProvider) (this.field_y))) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((byte) 104, (FieldValidatorProvider) (this.field_E))) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((byte) 123, (FieldValidatorProvider) (this.field_F))) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((byte) 0, (FieldValidatorProvider) (this.field_x))) {
          return false;
        }
        if (this.isFieldReadyForRegistration((byte) 114, (FieldValidatorProvider) (this.field_C))) {
          return true;
        }
        return false;
    }

    private final int addLabeledFieldWithDefaultValidationMessage(UiWidget param0, int param1, int param2, String param3, int param4, String param5) {
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
          if (param2 != 35) {
            this.field_A = (InteractiveWidget) null;
          }
          stackIn_3_0 = this.addLabeledFieldWithValidationMessage(80, param0, 35, param5, param1, param3, param4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("wl.RA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void updatePointer(int param0, byte param1, UiWidget param2, int param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_G.field_t = this.canSubmitRegistration(15);
        } catch (RuntimeException runtimeException) {
          throw ch.wrapClientException((Throwable) ((Object) runtimeException), "wl.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void clearStaticReferences(int param0) {
        if (param0 < 101) {
          field_K = (Sprite) null;
        }
    }

    static {
    }
}
