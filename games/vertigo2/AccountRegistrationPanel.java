/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRegistrationPanel extends WidgetContainer implements TextHotspotListener, WidgetActivationListener, NameSuggestionListener {
    private ValidatedTextField field_L;
    private ck field_R;
    private ValidatedTextField field_F;
    NameSuggestionsPanel field_V;
    static String field_K;
    static String field_S;
    private ValidatedTextField field_Q;
    static ka field_P;
    static int field_M;
    private ValidatedTextField field_T;
    private ValidatedTextField field_H;
    private InteractiveWidget field_O;
    private RichTextWidget field_N;
    private InteractiveWidget field_I;
    private ValidatedTextField field_U;
    static int field_E;
    static int field_G;
    static IntrusiveDeque field_J;

    public final void onWidgetActivated(int param0, InteractiveWidget param1, byte param2, int param3, int param4) {
        boolean discarded$0 = false;
        try {
          if (this.field_O == param1) {
            sg.b((byte) 81);
          } else {
            if (param1 == this.field_I) {
              discarded$0 = this.submitRegistration((byte) 14);
            }
          }
          int var6_int = 17 % ((-63 - param2) / 51);
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "mk.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final boolean isFieldReadyForRegistration(FieldValidatorProvider param0, int param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ba var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.getFieldValidator((byte) -5);
          if (var3 == null) {
            return true;
          }
          var4 = 71 % ((param1 - 44) / 48);
          var5 = var3.getValidationStatus(-23996);
          if (var5 == ir.field_a) {
            return false;
          }
          if (var5 == ArchiveNetworkClient.field_n) {
            return false;
          }
          if (var5 != nh.field_r) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("mk.L(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean submitRegistration(byte param0) {
        if (!this.canSubmitRegistration(param0 ^ -6553)) {
          return false;
        }
        int var2 = -1;
        if (param0 != 14) {
          return false;
        }
        try {
          var2 = Integer.parseInt(this.field_T.text);
        } catch (NumberFormatException numberFormatException) {
        }
        return LevelRenderable.startAccountCreation(this.field_H.text, var2, this.field_F.text, this.field_R.field_G, this.field_U.text, (byte) 66, this);
    }

    final void updatePointer(byte param0, int param1, int param2, UiWidget param3) {
        try {
          super.updatePointer((byte) 34, param1, param2, param3);
          this.field_I.field_F = this.canSubmitRegistration(-6551);
          if (param0 <= 6) {
            UiWidget var6 = (UiWidget) null;
            this.handleKey('￳', -83, 76, (UiWidget) null);
          }
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "mk.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final int addLabeledField(String param0, int param1, UiWidget param2, int param3, int param4) {
        boolean discarded$1 = false;
        LabeledWidgetContainer var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 45) {
            discarded$1 = this.canSubmitRegistration(115);
          }
          var6 = new LabeledWidgetContainer(20, param4, param3 + 120, 25, param2, false, 120, 3, qc.field_x, 16777215, param0);
          this.addChild((byte) 107, var6);
          stackIn_3_0 = var6.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_6_0 = var6_ref;
          stackIn_6_1 = new StringBuilder().append("mk.F(");
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
          throw wn.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int addLabeledFieldWithValidationIcon(String param0, int param1, UiWidget param2, int param3, int param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        ValidationStatusIcon var7 = null;
        String var8 = null;
        LabeledWidgetContainer var9 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 268) {
            var8 = (String) null;
            discarded$1 = this.addLabeledFieldWithValidationMessage(107, -127, -24, (UiWidget) null, (String) null, -91, (String) null);
          }
          var9 = new LabeledWidgetContainer(20, param3, 120 + param1, 25, param2, false, 120, 3, qc.field_x, 16777215, param0);
          this.addChild((byte) -75, var9);
          var7 = new ValidationStatusIcon(((FieldValidatorProvider) ((Object) param2)).getFieldValidator((byte) -5));
          this.addChild((byte) 79, var7);
          var7.setBounds(false, var9.width + (var9.x + 3), var9.y + (-15 + var9.height >> 1), 15, 15);
          stackIn_3_0 = var9.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("mk.J(");
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
          throw wn.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void onTextHotspotActivated(RichTextWidget param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        UiWidget var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param3 != 70) {
            var7 = (UiWidget) null;
            this.handleKey('\020', -23, 79, (UiWidget) null);
          }
          if (param1 == 0) {
            se.a("terms.ws", 12);
            return;
          }
          if (param1 == 1) {
            se.a("privacy.ws", 12);
            return;
          }
          if (param1 != 2) {
            return;
          }
          se.a("conduct.ws", 12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("mk.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final String getLinkOpenMarkup(int param0) {
        if (param0 != 23559) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean canSubmitRegistration(int param0) {
        if (!this.isFieldReadyForRegistration(this.field_H, param0 ^ 6537)) {
          return false;
        }
        if (!this.isFieldReadyForRegistration(this.field_F, -44)) {
          return false;
        }
        if (!this.isFieldReadyForRegistration(this.field_L, -102)) {
          return false;
        }
        if (!this.isFieldReadyForRegistration(this.field_U, -61)) {
          return false;
        }
        if (!this.isFieldReadyForRegistration(this.field_Q, param0 ^ 6625)) {
          return false;
        }
        if (!this.isFieldReadyForRegistration(this.field_T, -16)) {
          return false;
        }
        if (param0 == -6551) {
          return true;
        }
        AccountRegistrationPanel.b(-8, -69);
        return true;
    }

    private final String getLinkCloseMarkup(int param0) {
        if (param0 != 10000536) {
          AccountRegistrationPanel.b(8, -116);
          return "</col></u>";
        }
        return "</col></u>";
    }

    final boolean handleKey(char param0, int param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param2) {
            stackIn_7_0 = this.focusPreviousChild(param1 ^ 32340, param3);
            return stackIn_7_0;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_11_0 = this.focusNextChild((byte) -72, param3);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("mk.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public AccountRegistrationPanel() {
        super(0, 0, 496, 0, (WidgetListener) null);
        this.field_H = new ValidatedTextField("", (WidgetEventListener) null, 12);
        this.field_F = new ValidatedTextField("", (WidgetEventListener) null, 100);
        this.field_L = new ValidatedTextField("", (WidgetEventListener) null, 100);
        this.field_U = new ValidatedTextField("", (WidgetEventListener) null, 20);
        this.field_Q = new ValidatedTextField("", (WidgetEventListener) null, 20);
        this.field_T = new ValidatedTextField("", (WidgetEventListener) null, 3);
        int var1 = 1;
        this.field_R = new ck("", (WidgetEventListener) null, var1 != 0);
        this.field_I = new InteractiveWidget(DiskArchiveRequest.field_K, (WidgetEventListener) null);
        this.field_O = new InteractiveWidget(tc.field_a, (WidgetEventListener) null);
        this.field_H.field_q = BlastDebrisBatch.field_d;
        this.field_F.field_q = ak.field_f;
        this.field_L.field_q = BirthDateValidator.field_i;
        this.field_U.field_q = dl.field_c;
        this.field_Q.field_q = jk.field_c;
        this.field_T.field_q = PacketBuffer.field_s;
        this.field_R.field_q = pq.field_b;
        this.field_H.setFieldValidator(true, new AccountNameAvailabilityValidator(this.field_H));
        this.field_F.setFieldValidator(true, new EmailFormatValidator(this.field_F));
        this.field_L.setFieldValidator(true, new ConfirmedEmailAvailabilityValidator(this.field_L, this.field_F));
        this.field_U.setFieldValidator(true, new PasswordValidator(this.field_U, this.field_H, this.field_F));
        this.field_Q.setFieldValidator(true, new MatchingFieldValidator(this.field_Q, this.field_U));
        this.field_T.setFieldValidator(true, new AgeValidator(this.field_T));
        this.field_I.field_F = false;
        this.field_I.listener = (WidgetListener) ((Object) new vo());
        this.field_O.listener = (WidgetListener) ((Object) new jc());
        this.field_H.listener = (WidgetListener) ((Object) new ml(10000536));
        ml dupTemp$0 = new ml(10000536);
        this.field_L.listener = (WidgetListener) ((Object) dupTemp$0);
        this.field_F.listener = (WidgetListener) ((Object) dupTemp$0);
        this.field_T.listener = (WidgetListener) ((Object) new ml(10000536));
        this.field_R.listener = (WidgetListener) ((Object) new kb());
        om dupTemp$1 = new om(10000536);
        this.field_Q.listener = (WidgetListener) ((Object) dupTemp$1);
        this.field_U.listener = (WidgetListener) ((Object) dupTemp$1);
        String var2 = Vertigo2.a(new String[]{this.getLinkOpenMarkup(23559), this.getLinkCloseMarkup(10000536)}, GzipDecompressor.field_b, -125);
        int var3 = 20;
        var3 = var3 + this.addLabeledField(le.field_c, 48, this.field_F, 170, var3);
        var3 = var3 + (5 + this.addLabeledFieldWithValidationMessage(27557, var3, 20, this.field_L, "", 170, GrowableIntArray.field_f));
        var3 = var3 + this.addLabeledField(uc.field_c, 125, this.field_U, 170, var3);
        var3 = var3 + (5 + this.addLabeledFieldWithDefaultValidationMessage(ag.field_c, this.field_Q, var3, ln.field_a, 0, 170));
        var3 = var3 + (this.addLabeledFieldWithDefaultValidationMessage(LevelTile.field_m, this.field_H, var3, GameShell.field_q, 0, 170) + 5);
        var3 = var3 + this.addLabeledFieldWithValidationIcon(po.field_b, 170, this.field_T, var3, 268);
        LabeledWidgetContainer var4 = new LabeledWidgetContainer(46, var3, this.width - 90, 25, this.field_R, true, -120 + this.width, 5, bl.field_N, 11579568, FullscreenNoticeType.field_d);
        this.addChild((byte) 88, var4);
        var3 = var3 + var4.height;
        DefaultTextWidgetRenderer var5 = new DefaultTextWidgetRenderer(qc.field_x, 0, 0, 0, 0, 16777215, -1, 0, 0, qc.field_x.field_z, -1, 2147483647, true);
        this.field_N = new RichTextWidget(var2, var5);
        this.field_N.field_q = "";
        this.field_N.setHotspotTooltip(0, 0, fm.field_c);
        this.field_N.setHotspotTooltip(1, 0, fm.field_c);
        this.field_N.field_v = (WidgetEventListener) (this);
        this.field_N.setTextBounds(46, var3, (byte) 119, this.width - 90);
        var3 = var3 + (15 + this.field_N.height);
        this.addChild((byte) 94, this.field_N);
        int var6 = 4;
        int var7 = 200;
        this.field_I.setBounds(false, 496 - var7 >> 1, var3, 40, var7);
        this.field_O.setBounds(false, 3 + var6, 15 + var3, 40, 60);
        this.field_O.field_v = (WidgetEventListener) (this);
        this.field_I.field_v = (WidgetEventListener) (this);
        this.addChild((byte) 119, this.field_I);
        this.addChild((byte) 110, this.field_O);
        this.field_V = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.field_V.setBounds(false, 60 + this.field_H.width + this.field_H.x, 20 + this.field_H.y, 150, -this.field_H.width - this.field_H.x + this.width - 60);
        this.addChild((byte) 116, this.field_V);
        this.setBounds(false, 0, 0, var6 + (var3 + 55), 496);
    }

    final static void b(int param0, int param1) {
        BitPacketBuffer var2 = uh.field_Wb;
        var2.writeCipheredByte(param1, 120);
        var2.position = var2.position + 1;
        int var3 = var2.position;
        var2.writeByte(2, 87);
        var2.writeBytes(0, -10140, qc.field_w, qc.field_w.length);
        var2.writeByte(ua.field_a, 103);
        if (param0 < -76) {
          var2.writeByte(kg.field_y, 106);
          var2.writeBytes(0, -10140, dj.field_a, dj.field_a.length);
          var2.patchByteLength((byte) 24, var2.position - var3);
          return;
        }
        AccountRegistrationPanel.b(102, 66);
        var2.writeByte(kg.field_y, 106);
        var2.writeBytes(0, -10140, dj.field_a, dj.field_a.length);
        var2.patchByteLength((byte) 24, var2.position - var3);
    }

    public static void resetStaticState(int param0) {
        field_S = null;
        field_K = null;
        field_P = null;
        field_J = null;
        if (param0 != 4) {
          field_E = -33;
        }
    }

    public final void onNameSuggestionsRefreshRequested(int param0) {
        ((AccountNameAvailabilityValidator) (this.field_H.getFieldValidator((byte) -5))).invalidateCheckedName(-1);
        if (param0 != -4384) {
          field_K = (String) null;
        }
    }

    private final int addLabeledFieldWithDefaultValidationMessage(String param0, UiWidget param1, int param2, String param3, int param4, int param5) {
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
          if (param4 == 0) {
            stackIn_4_0 = this.addLabeledFieldWithValidationMessage(param4 ^ 27557, param2, 35, param1, param0, param5, param3);
            return stackIn_4_0;
          }
          stackIn_2_0 = 85;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("mk.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final int addLabeledFieldWithValidationMessage(int param0, int param1, int param2, UiWidget param3, String param4, int param5, String param6) {
        RuntimeException var8 = null;
        ValidationStatusWidget var9 = null;
        LabeledWidgetContainer var10 = null;
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
          var10 = new LabeledWidgetContainer(20, param1, param5 + 120, 25, param3, false, 120, 3, qc.field_x, 16777215, param6);
          this.addChild((byte) -30, var10);
          var9 = new ValidationStatusWidget(((FieldValidatorProvider) ((Object) param3)).getFieldValidator((byte) -5), param4, 126, param1 + var10.height, param5 + 50, param2);
          var9.field_v = (WidgetEventListener) (this);
          this.addChild((byte) -110, var9);
          if (param0 != 27557) {
            this.field_R = (ck) null;
          }
          stackIn_3_0 = var9.height + var10.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("mk.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw wn.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void onNameSuggestionSelected(String param0, int param1) {
        ValidatedTextField var3 = this.field_H;
        String var4 = param0;
        if (param1 != 4944) {
          return;
        }
        try {
          ((EditableTextField) ((Object) var3)).setText(var4, -74, false);
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "mk.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_K = "Discard";
        field_E = 360;
    }
}
