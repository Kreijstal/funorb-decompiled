/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRegistrationPanel extends DequeWidgetContainer implements TextHotspotListener, WidgetActivationListener, NameSuggestionListener {
    static int[] field_P;
    private ValidatedTextField field_K;
    NameSuggestionsPanel field_W;
    private ValidatedTextField field_U;
    private InteractiveWidget field_V;
    private ValidatedTextField field_S;
    static eh[] field_M;
    private rb field_T;
    private ValidatedTextField field_R;
    private ValidatedTextField field_L;
    private ValidatedTextField field_O;
    private InteractiveWidget field_N;
    private RichTextWidget field_Q;

    final static boolean i(byte param0) {
        if (param0 > -107) {
          field_P = (int[]) null;
        }
        return om.a(DebouncedFieldValidator.c(true), 2);
    }

    private final String getLinkCloseMarkup(byte param0) {
        if (param0 != -115) {
          return (String) null;
        }
        return "</col></u>";
    }

    private final int addLabeledFieldWithDefaultValidationMessage(String param0, UiWidget param1, int param2, String param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7_int = -26 / ((param2 + 76) / 46);
          stackIn_1_0 = this.addLabeledFieldWithValidationMessage(101, param5, param0, param3, param4, param1, 35);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("rg.R(");
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
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final void onWidgetActivated(InteractiveWidget param0, byte param1, int param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_V == param0) {
            li.c(param1 + 218);
          } else {
            if (this.field_N == param0) {
              discarded$1 = this.submitRegistration((byte) -124);
            }
          }
          if (param1 != 98) {
            this.field_W = (NameSuggestionsPanel) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("rg.FA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseDeclaredStaticReferences(byte param0) {
        field_M = null;
        field_P = null;
        if (param0 != -53) {
          field_M = (eh[]) null;
        }
    }

    private final int addLabeledField(int param0, String param1, UiWidget param2, int param3, int param4) {
        LabeledWidgetContainer var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new LabeledWidgetContainer(20, param3, 120 + param4, 25, param2, false, 120, param0, MusicPatchNode.field_C, 16777215, param1);
          this.addChild((byte) -54, var6);
          stackIn_1_0 = var6.field_s;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_4_0 = var6_ref;
          stackIn_4_1 = new StringBuilder().append("rg.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, PacketBuffer param1, int param2, int param3, int param4) {
        String var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          param1.writeByte(6, 12);
          param1.writeShort(17, -119);
          param1.writeShort(param2, -90);
          param1.writeShort(param0, -95);
          if (param3 <= 4) {
            var6 = (String) null;
            AccountRegistrationPanel.a(62, (String) null);
            param1.writeByte(6, param4);
          } else {
            param1.writeByte(6, param4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("rg.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void onTextHotspotActivated(int param0, RichTextWidget param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = DungeonAssault.field_K;
        try {
          if (param0 != 0) {
            if (param0 == 1) {
              lk.a("privacy.ws", (byte) 58);
            } else {
              if (param0 == 2) {
                lk.a("conduct.ws", (byte) 58);
              }
            }
          } else {
            lk.a("terms.ws", (byte) 58);
          }
          if (param2 != 126) {
            this.field_K = (ValidatedTextField) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("rg.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int addLabeledFieldWithValidationIcon(String param0, int param1, int param2, UiWidget param3, int param4) {
        RuntimeException var6 = null;
        ValidationStatusIcon var7 = null;
        LabeledWidgetContainer var8 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new LabeledWidgetContainer(20, param2, param1 + 120, 25, param3, false, 120, 3, MusicPatchNode.field_C, 16777215, param0);
          this.addChild((byte) -117, var8);
          var7 = new ValidationStatusIcon(((FieldValidatorProvider) ((Object) param3)).getFieldValidator(-87));
          this.addChild((byte) -126, var7);
          var7.setBounds(0, 15, var8.field_v + (var8.field_s - 15 >> 1), param4 + var8.field_q + var8.field_x, 15);
          stackIn_1_0 = var8.field_s;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("rg.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    private final int addLabeledFieldWithValidationMessage(int param0, int param1, String param2, String param3, int param4, UiWidget param5, int param6) {
        RuntimeException var8 = null;
        ValidationStatusWidget var9 = null;
        int var10 = 0;
        LabeledWidgetContainer var11 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var11 = new LabeledWidgetContainer(20, param1, param4 + 120, 25, param5, false, 120, 3, MusicPatchNode.field_C, 16777215, param2);
          this.addChild((byte) -119, var11);
          var10 = -18 % ((param0 + 13) / 54);
          var9 = new ValidationStatusWidget(((FieldValidatorProvider) ((Object) param5)).getFieldValidator(-83), param3, 126, param1 + var11.field_s, 50 + param4, param6);
          var9.field_n = (WidgetEventListener) (this);
          this.addChild((byte) -60, var9);
          stackIn_1_0 = var9.field_s + var11.field_s;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("rg.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean canSubmitRegistration(boolean param0) {
        RichTextWidget var3;
        if (!param0) {
          var3 = (RichTextWidget) null;
          this.onTextHotspotActivated(31, (RichTextWidget) null, -50, -67);
        }
        if (this.isFieldReadyForRegistration(23786, (FieldValidatorProvider) (this.field_R)) &&
          this.isFieldReadyForRegistration(23786, (FieldValidatorProvider) (this.field_O)) &&
          this.isFieldReadyForRegistration(23786, (FieldValidatorProvider) (this.field_U)) &&
          this.isFieldReadyForRegistration(23786, (FieldValidatorProvider) (this.field_K)) &&
          this.isFieldReadyForRegistration(23786, (FieldValidatorProvider) (this.field_L))) {
          if (this.isFieldReadyForRegistration(23786, (FieldValidatorProvider) (this.field_S))) {
            return true;
          }
          return false;
        }
        return false;
    }

    private final boolean submitRegistration(byte param0) {
        if (!this.canSubmitRegistration(true)) {
          return false;
        }
        int var2 = -1;
        if (param0 != -124) {
          this.field_T = (rb) null;
        }
        try {
          var2 = Integer.parseInt(this.field_S.field_w);
        } catch (NumberFormatException numberFormatException) {
        }
        return td.a(this.field_K.field_w, this.field_T.field_E, true, this.field_R.field_w, this, var2, this.field_O.field_w);
    }

    final static void a(int param0, String param1) {
        try {
          if (param0 != 15) {
            PacketBuffer var3 = (PacketBuffer) null;
            AccountRegistrationPanel.a(65, (PacketBuffer) null, -49, -86, -120);
          }
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "rg.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final String getLinkOpenMarkup(byte param0) {
        if (param0 > -17) {
          PacketBuffer var3 = (PacketBuffer) null;
          AccountRegistrationPanel.a(76, (PacketBuffer) null, -91, 62, -13);
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void onNameSuggestionSelected(byte param0, String param1) {
        int discarded$0 = 0;
        ValidatedTextField var3 = null;
        String var4 = null;
        try {
          if (param0 > -26) {
            UiWidget var5 = (UiWidget) null;
            discarded$0 = this.addLabeledFieldWithValidationIcon((String) null, 104, -13, (UiWidget) null, -83);
          }
          var3 = this.field_R;
          var4 = param1;
          ((EditableTextField) ((Object) var3)).setText(var4, false, (byte) 91);
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "rg.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void i(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        var6 = DungeonAssault.field_K;
        try {
          var1_int = sn.field_c.length;
          FullscreenNoticeType.field_b = new int[var1_int];
          IntroSequenceScreen.field_w = new int[var1_int];
          for (var2 = 0; var2 < var1_int; var2++) {
            var8 = sn.field_c[var2].field_B;
            var7 = var8;
            var3_ref_int__ = var7;
            var4 = sn.field_c[var2].field_y;
            for (var5 = -1 + var8.length; 0 <= var5; var5--) {
              if (var8[var5] != 16776960) {
                continue;
              }
              break;
            }
            var8[var5] = 0;
            var3_ref_int__[-1 + var5] = 0;
            var3_ref_int__[-var4 + var5] = 0;
            var3_ref_int__[-1 - var4 + var5] = 0;
            IntroSequenceScreen.field_w[var2] = sn.field_c[var2].field_w + var5 / var4 - 1;
            FullscreenNoticeType.field_b[var2] = -1 + var5 % var4 + sn.field_c[var2].field_A;
          }
          var3 = -33 / ((param0 + 41) / 61);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) var1), "rg.F(" + param0 + ')');
        }
    }

    public final void onNameSuggestionsRefreshRequested(int param0) {
        String discarded$0 = null;
        ((AccountNameAvailabilityValidator) (this.field_R.getFieldValidator(-115))).invalidateCheckedName(true);
        if (param0 <= 121) {
          discarded$0 = this.getLinkOpenMarkup((byte) 69);
        }
    }

    public AccountRegistrationPanel() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.field_R = new ValidatedTextField("", (WidgetEventListener) null, 12);
        this.field_O = new ValidatedTextField("", (WidgetEventListener) null, 100);
        this.field_U = new ValidatedTextField("", (WidgetEventListener) null, 100);
        this.field_K = new ValidatedTextField("", (WidgetEventListener) null, 20);
        this.field_L = new ValidatedTextField("", (WidgetEventListener) null, 20);
        this.field_S = new ValidatedTextField("", (WidgetEventListener) null, 3);
        int var1 = 1;
        this.field_T = new rb("", (WidgetEventListener) null, var1 != 0);
        this.field_N = new InteractiveWidget(ef.field_a, (WidgetEventListener) null);
        this.field_V = new InteractiveWidget(pp.field_I, (WidgetEventListener) null);
        this.field_R.field_i = ByteStorage.field_d;
        this.field_O.field_i = lk.field_Q;
        this.field_U.field_i = PcmOutputWorker.field_c;
        this.field_K.field_i = ce.field_t;
        this.field_L.field_i = UiWidget.field_p;
        this.field_S.field_i = AccountServiceResult.field_h;
        this.field_T.field_i = sa.field_h;
        this.field_R.setFieldValidator(new AccountNameAvailabilityValidator(this.field_R), 10508);
        this.field_O.setFieldValidator(new EmailFormatValidator(this.field_O), 10508);
        this.field_U.setFieldValidator(new ConfirmedEmailAvailabilityValidator(this.field_U, this.field_O), 10508);
        this.field_K.setFieldValidator(new PasswordValidator(this.field_K, this.field_R, this.field_O), 10508);
        this.field_L.setFieldValidator(new MatchingFieldValidator(this.field_L, this.field_K), 10508);
        this.field_S.setFieldValidator(new AgeValidator(this.field_S), 10508);
        this.field_N.field_B = false;
        this.field_N.field_o = (WidgetRenderer) ((Object) new na());
        this.field_V.field_o = (WidgetRenderer) ((Object) new oa());
        this.field_R.field_o = (WidgetRenderer) ((Object) new mc(10000536));
        mc dupTemp$0 = new mc(10000536);
        this.field_U.field_o = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_O.field_o = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_S.field_o = (WidgetRenderer) ((Object) new mc(10000536));
        this.field_T.field_o = (WidgetRenderer) ((Object) new dk());
        ic dupTemp$1 = new ic(10000536);
        this.field_L.field_o = (WidgetRenderer) ((Object) dupTemp$1);
        this.field_K.field_o = (WidgetRenderer) ((Object) dupTemp$1);
        String var2 = StandardContentDialog.a(new String[]{this.getLinkOpenMarkup((byte) -47), this.getLinkCloseMarkup((byte) -115)}, ae.field_h, 30496);
        int var3 = 20;
        var3 = var3 + this.addLabeledField(3, mp.field_b, this.field_O, var3, 170);
        var3 = var3 + (this.addLabeledFieldWithValidationMessage(-96, var3, hp.field_a, "", 170, this.field_U, 20) + 5);
        var3 = var3 + this.addLabeledField(3, fk.field_r, this.field_K, var3, 170);
        var3 = var3 + (5 + this.addLabeledFieldWithDefaultValidationMessage(qj.field_a, this.field_L, -126, td.field_b, 170, var3));
        var3 = var3 + (5 + this.addLabeledFieldWithDefaultValidationMessage(wf.field_B, this.field_R, -123, an.field_z, 170, var3));
        var3 = var3 + this.addLabeledFieldWithValidationIcon(fl.field_o, 170, var3, this.field_S, 3);
        LabeledWidgetContainer var4 = new LabeledWidgetContainer(46, var3, -90 + this.field_x, 25, this.field_T, true, this.field_x - 120, 5, ta.field_e, 11579568, lf.field_q);
        this.addChild((byte) -117, var4);
        var3 = var3 + var4.field_s;
        DefaultTextWidgetRenderer var5 = new DefaultTextWidgetRenderer(MusicPatchNode.field_C, 0, 0, 0, 0, 16777215, -1, 0, 0, MusicPatchNode.field_C.field_H, -1, 2147483647, true);
        this.field_Q = new RichTextWidget(var2, var5);
        this.field_Q.field_i = "";
        this.field_Q.setHotspotTooltip(8, 0, ByteArrayPoolSupport.field_d);
        this.field_Q.setHotspotTooltip(8, 1, ByteArrayPoolSupport.field_d);
        this.field_Q.field_n = (WidgetEventListener) (this);
        this.field_Q.setTextBounds(46, (byte) -70, -90 + this.field_x, var3);
        var3 = var3 + (15 + this.field_Q.field_s);
        this.addChild((byte) -46, this.field_Q);
        int var6 = 4;
        int var7 = 200;
        this.field_N.setBounds(0, var7, var3, -var7 + 496 >> 1, 40);
        this.field_V.setBounds(0, 60, var3 + 15, var6 + 3, 40);
        this.field_V.field_n = (WidgetEventListener) (this);
        this.field_N.field_n = (WidgetEventListener) (this);
        this.addChild((byte) -84, this.field_N);
        this.addChild((byte) -73, this.field_V);
        this.field_W = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.field_W.setBounds(0, -this.field_R.field_q + (this.field_x + (-this.field_R.field_x - 60)), 20 + this.field_R.field_v, this.field_R.field_q + this.field_R.field_x + 60, 150);
        this.addChild((byte) -88, this.field_W);
        this.setBounds(0, 496, 0, 0, 55 + var3 + var6);
    }

    final void updatePointer(int param0, int param1, UiWidget param2, boolean param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_N.field_B = this.canSubmitRegistration(param3);
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "rg.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean handleKey(UiWidget param0, char param1, int param2, byte param3) {
        boolean discarded$1 = false;
        RuntimeException var5 = null;
        FieldValidatorProvider var6 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, (byte) 112)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_6_0 = this.focusPreviousChild(param0, (byte) 71);
            return stackIn_6_0;
          }
          if (param3 < 55) {
            var6 = (FieldValidatorProvider) null;
            discarded$1 = this.isFieldReadyForRegistration(108, (FieldValidatorProvider) null);
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_12_0 = this.focusNextChild((byte) -5, param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("rg.W(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean isFieldReadyForRegistration(int param0, FieldValidatorProvider param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        od var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.getFieldValidator(param0 - 23901);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getValidationStatus((byte) -93);
          if (param0 != 23786) {
            this.field_S = (ValidatedTextField) null;
          }
          if (pd.field_J == var4) {
            return false;
          }
          if (ub.field_s == var4) {
            return false;
          }
          if (var4 != BufferedRandomAccessFile.field_g) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("rg.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_P = new int[]{197379, 768, 771, 197376, 196611};
    }
}
