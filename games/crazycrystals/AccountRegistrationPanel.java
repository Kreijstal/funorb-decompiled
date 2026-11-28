/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRegistrationPanel extends DequeWidgetContainer implements TextHotspotListener, WidgetActivationListener, NameSuggestionListener {
    private ValidatedTextField field_K;
    private ValidatedTextField field_M;
    static int[] field_J;
    private ValidatedTextField field_N;
    private InteractiveWidget field_E;
    private ValidatedTextField field_I;
    private ValidatedTextField field_z;
    private InteractiveWidget field_G;
    private of field_F;
    NameSuggestionsPanel field_L;
    private ValidatedTextField field_A;
    private RichTextWidget field_H;
    static String field_C;

    private final int addLabeledFieldWithValidationIcon(int param0, int param1, String param2, int param3, UiWidget param4) {
        RuntimeException var6 = null;
        ValidationStatusIcon var7 = null;
        LabeledWidgetContainer var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -80) {
            this.field_G = (InteractiveWidget) null;
          }
          var8 = new LabeledWidgetContainer(20, param3, param0 + 120, 25, param4, false, 120, 3, ai.field_h, 16777215, param2);
          this.addChild(var8, -117);
          var7 = new ValidationStatusIcon(((FieldValidatorProvider) ((Object) param4)).getFieldValidator(-121));
          this.addChild(var7, 47);
          var7.setBounds(15, var8.field_r + var8.field_g + 3, var8.field_j + (var8.field_f - 15 >> 1), 15, (byte) -52);
          stackIn_3_0 = var8.field_f;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("dc.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public AccountRegistrationPanel() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.field_N = new ValidatedTextField("", (WidgetEventListener) null, 12);
        this.field_A = new ValidatedTextField("", (WidgetEventListener) null, 100);
        this.field_K = new ValidatedTextField("", (WidgetEventListener) null, 100);
        this.field_M = new ValidatedTextField("", (WidgetEventListener) null, 20);
        this.field_I = new ValidatedTextField("", (WidgetEventListener) null, 20);
        this.field_z = new ValidatedTextField("", (WidgetEventListener) null, 3);
        int var1 = 1;
        this.field_F = new of("", (WidgetEventListener) null, var1 != 0);
        this.field_G = new InteractiveWidget(ok.field_i, (WidgetEventListener) null);
        this.field_E = new InteractiveWidget(ProfileDataRequest.field_i, (WidgetEventListener) null);
        this.field_N.field_t = ac.field_k;
        this.field_A.field_t = go.field_g;
        this.field_K.field_t = dq.field_C;
        this.field_M.field_t = LevelProgressUpdate.field_l;
        this.field_I.field_t = ad.field_j;
        this.field_z.field_t = tf.field_a;
        this.field_F.field_t = ProgressMessageDialog.field_fb;
        this.field_N.setFieldValidator(true, new AccountNameAvailabilityValidator(this.field_N));
        this.field_A.setFieldValidator(true, new EmailFormatValidator(this.field_A));
        this.field_K.setFieldValidator(true, new ConfirmedEmailAvailabilityValidator(this.field_K, this.field_A));
        this.field_M.setFieldValidator(true, new PasswordValidator(this.field_M, this.field_N, this.field_A));
        this.field_I.setFieldValidator(true, new MatchingFieldValidator(this.field_I, this.field_M));
        this.field_z.setFieldValidator(true, new AgeValidator(this.field_z));
        this.field_G.field_x = false;
        this.field_G.field_i = (WidgetRenderer) ((Object) new ve());
        this.field_E.field_i = (WidgetRenderer) ((Object) new ok());
        this.field_N.field_i = (WidgetRenderer) ((Object) new wc(10000536));
        wc dupTemp$0 = new wc(10000536);
        this.field_K.field_i = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_A.field_i = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_z.field_i = (WidgetRenderer) ((Object) new wc(10000536));
        this.field_F.field_i = (WidgetRenderer) ((Object) new wn());
        aq dupTemp$1 = new aq(10000536);
        this.field_I.field_i = (WidgetRenderer) ((Object) dupTemp$1);
        this.field_M.field_i = (WidgetRenderer) ((Object) dupTemp$1);
        String var2 = AgeValidator.a(new String[]{this.getLinkOpenMarkup((byte) -102), this.getLinkCloseMarkup(true)}, el.field_h, 3);
        int var3 = 20;
        var3 = var3 + this.addLabeledField(var3, 170, vm.field_h, this.field_A, 25406);
        var3 = var3 + (this.addLabeledFieldWithValidationMessage(170, 20, var3, 0, sh.field_m, "", this.field_K) + 5);
        var3 = var3 + this.addLabeledField(var3, 170, fh.field_h, this.field_M, 25406);
        var3 = var3 + (this.addLabeledFieldWithDefaultValidationMessage(ArchiveSourceManager.field_f, var3, this.field_I, true, AccountServiceResult.field_c, 170) + 5);
        var3 = var3 + (5 + this.addLabeledFieldWithDefaultValidationMessage(fh.field_g, var3, this.field_N, true, TextLayout.field_c, 170));
        var3 = var3 + this.addLabeledFieldWithValidationIcon(170, -81, ui.field_b, var3, this.field_z);
        LabeledWidgetContainer var4 = new LabeledWidgetContainer(46, var3, -90 + this.field_g, 25, this.field_F, true, -120 + this.field_g, 5, ba.field_i, 11579568, Bzip2State.field_j);
        this.addChild(var4, -123);
        var3 = var3 + var4.field_f;
        DefaultTextWidgetRenderer var5 = new DefaultTextWidgetRenderer(ai.field_h, 0, 0, 0, 0, 16777215, -1, 0, 0, ai.field_h.field_o, -1, 2147483647, true);
        this.field_H = new RichTextWidget(var2, var5);
        this.field_H.field_t = "";
        this.field_H.setHotspotTooltip(47, hp.field_r, 0);
        this.field_H.setHotspotTooltip(47, hp.field_r, 1);
        this.field_H.field_l = (WidgetEventListener) (this);
        this.field_H.setTextBounds(var3, 47, 46, -90 + this.field_g);
        var3 = var3 + (15 + this.field_H.field_f);
        this.addChild(this.field_H, 42);
        int var6 = 4;
        int var7 = 200;
        this.field_G.setBounds(40, 496 - var7 >> 1, var3, var7, (byte) -52);
        this.field_E.setBounds(40, 3 + var6, 15 + var3, 60, (byte) -52);
        this.field_E.field_l = (WidgetEventListener) (this);
        this.field_G.field_l = (WidgetEventListener) (this);
        this.addChild(this.field_G, -116);
        this.addChild(this.field_E, -124);
        this.field_L = new NameSuggestionsPanel((NameSuggestionListener) (this));
        this.field_L.setBounds(150, 60 + this.field_N.field_r + this.field_N.field_g, 20 + this.field_N.field_j, -60 - this.field_N.field_r + (this.field_g - this.field_N.field_g), (byte) -52);
        this.addChild(this.field_L, 65);
        this.setBounds(var6 + var3 + 55, 0, 0, 496, (byte) -52);
    }

    final void updatePointer(UiWidget param0, int param1, int param2, int param3) {
        try {
          super.updatePointer(param0, 19, param2, param3);
          int var5_int = -55 / ((param1 + 50) / 59);
          this.field_G.field_x = this.canSubmitRegistration(-103);
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "dc.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void onTextHotspotActivated(int param0, int param1, RichTextWidget param2, byte param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = CrazyCrystals.field_B;
        try {
          if (0 == param0) {
            fq.a(-128, "terms.ws");
          } else {
            if (param0 != 1) {
              if (param0 == 2) {
                fq.a(-128, "conduct.ws");
              }
            } else {
              fq.a(56, "privacy.ws");
            }
          }
          if (param3 <= -127) {
            return;
          }
          field_J = (int[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("dc.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        int var3 = 0;
        int var3Lifetime1;
        if (!param2) {
          SoftwareRasterizer.clearRaster();
          var3 = -33 % ((param1 - 49) / 52);
          d.a((byte) 90, param2);
          return;
        }
        SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_l, SoftwareRasterizer.field_d, 0, 192);
        var3Lifetime1 = -33 % ((param1 - 49) / 52);
        d.a((byte) 90, param2);
    }

    private final boolean submitRegistration(int param0) {
        if (!this.canSubmitRegistration(-114)) {
          return false;
        }
        int var2 = -1;
        try {
          var2 = Integer.parseInt(this.field_z.field_o);
        } catch (NumberFormatException numberFormatException) {
        }
        if (param0 >= 87) {
          return mp.a(0, this.field_N.field_o, this, this.field_A.field_o, this.field_M.field_o, this.field_F.field_A, var2);
        }
        this.field_E = (InteractiveWidget) null;
        return mp.a(0, this.field_N.field_o, this, this.field_A.field_o, this.field_M.field_o, this.field_F.field_A, var2);
    }

    private final String getLinkOpenMarkup(byte param0) {
        if (param0 != -102) {
          this.field_F = (of) null;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean canSubmitRegistration(int param0) {
        if (param0 > -95) {
          return true;
        }
        if (!this.isFieldReadyForRegistration((FieldValidatorProvider) (this.field_N), (byte) 61)) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((FieldValidatorProvider) (this.field_A), (byte) 61)) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((FieldValidatorProvider) (this.field_K), (byte) 61)) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((FieldValidatorProvider) (this.field_M), (byte) 61)) {
          return false;
        }
        if (!this.isFieldReadyForRegistration((FieldValidatorProvider) (this.field_I), (byte) 61)) {
          return false;
        }
        if (this.isFieldReadyForRegistration((FieldValidatorProvider) (this.field_z), (byte) 61)) {
          return true;
        }
        return false;
    }

    final boolean handleKey(int param0, int param1, UiWidget param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_6_0 = this.focusPreviousChild((byte) -104, param2);
            return stackIn_6_0;
          }
          if (99 != param0) {
            return false;
          }
          stackIn_9_0 = this.focusNextChild(param2, -25911);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("dc.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    private final int addLabeledFieldWithValidationMessage(int param0, int param1, int param2, int param3, String param4, String param5, UiWidget param6) {
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
          if (param3 != 0) {
            stackIn_2_0 = -62;
            return stackIn_2_0;
          }
          var10 = new LabeledWidgetContainer(20, param2, 120 + param0, 25, param6, false, 120, 3, ai.field_h, 16777215, param4);
          this.addChild(var10, param3 ^ -124);
          var9 = new ValidationStatusWidget(((FieldValidatorProvider) ((Object) param6)).getFieldValidator(param3 - 95), param5, 126, param2 + var10.field_f, 50 + param0, param1);
          var9.field_l = (WidgetEventListener) (this);
          this.addChild(var9, -116);
          stackIn_4_0 = var10.field_f + var9.field_f;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("dc.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param6 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static MusicTrack a(boolean param0, String param1, byte param2) {
        long var3_long = 0L;
        RuntimeException var3 = null;
        MusicTrack var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        Object stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        MidiPcmStream stackIn_9_0;
        ResourceArchive stackIn_9_1;
        SoundCache stackIn_9_2;
        MusicTrack stackIn_9_3;
        int stackIn_9_4;
        int stackIn_10_5 = 0;
        MusicTrack stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = (CharSequence) ((Object) param1);
          var3_long = DualLinkNode.a(true, var7);
          var5 = (MusicTrack) (ra.field_d.a(var3_long, 0));
          if (var5 == null) {
            var5 = (MusicTrack) (ah.field_a.a(var3_long, 0));
            if (var5 == null) {
              var5 = MusicTrack.load(mg.field_c, param1, "");
              if (var5 == null) {
                stackIn_4_0 = null;
                return (MusicTrack) (stackIn_4_0);
              }
              ah.field_a.a(-22072, var3_long, var5);
              stackIn_6_0 = null;
              return (MusicTrack) (stackIn_6_0);
            }
            stackIn_9_0 = fq.field_x;
            stackIn_9_1 = rl.field_i;
            stackIn_9_2 = aa.field_b;
            stackIn_9_3 = var5;
            stackIn_9_4 = -128;
            if (param0) {
              stackIn_10_5 = 22050;
            } else {
              stackIn_10_5 = 2205;
            }
            if (!((MidiPcmStream) (Object) stackIn_9_0).prepareTrackSamples(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_10_5)) {
              return null;
            }
            ra.field_d.a(-22072, var3_long, var5);
          }
          var6 = -4 % ((param2 + 64) / 35);
          stackIn_15_0 = var5;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("dc.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseDeclaredStaticReferences(int param0) {
        field_J = null;
        int var1 = -101 / ((15 - param0) / 35);
        field_C = null;
    }

    public final void onWidgetActivated(byte param0, int param1, int param2, int param3, InteractiveWidget param4) {
        boolean discarded$1 = false;
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = -47 / ((param0 - 83) / 36);
          if (this.field_E == param4) {
            ba.c((byte) 93);
            return;
          }
          if (this.field_G != param4) {
            return;
          }
          discarded$1 = this.submitRegistration(100);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("dc.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final void onNameSuggestionSelected(String param0, int param1) {
        ValidatedTextField var3 = null;
        String var4 = null;
        try {
          var3 = this.field_N;
          var4 = param0;
          if (param1 != -23752) {
            this.field_L = (NameSuggestionsPanel) null;
          }
          ((EditableTextField) ((Object) var3)).setText(false, -100, var4);
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "dc.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int addLabeledFieldWithDefaultValidationMessage(String param0, int param1, UiWidget param2, boolean param3, String param4, int param5) {
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
          if (param3) {
            stackIn_4_0 = this.addLabeledFieldWithValidationMessage(param5, 35, param1, 0, param4, param0, param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = 31;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("dc.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean isFieldReadyForRegistration(FieldValidatorProvider param0, byte param1) {
        FieldValidator var3 = null;
        RuntimeException var3_ref = null;
        oi var4 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 61) {
            return false;
          }
          var3 = param0.getFieldValidator(-113);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getValidationStatus((byte) 45);
          if (var4 == rk.field_c) {
            return false;
          }
          if (var4 == ta.field_h) {
            return false;
          }
          if (pe.field_p != var4) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_22_0 = var3_ref;
          stackIn_22_1 = new StringBuilder().append("dc.O(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    private final String getLinkCloseMarkup(boolean param0) {
        if (!param0) {
          String var3 = (String) null;
          this.onNameSuggestionSelected((String) null, -79);
          return "</col></u>";
        }
        return "</col></u>";
    }

    public final void onNameSuggestionsRefreshRequested(int param0) {
        ((AccountNameAvailabilityValidator) (this.field_N.getFieldValidator(-101))).invalidateCheckedName(-31626);
        if (param0 != 20) {
          this.field_F = (of) null;
        }
    }

    private final int addLabeledField(int param0, int param1, String param2, UiWidget param3, int param4) {
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
          if (param4 != 25406) {
            field_C = (String) null;
          }
          var6 = new LabeledWidgetContainer(20, param0, 120 + param1, 25, param3, false, 120, 3, ai.field_h, 16777215, param2);
          this.addChild(var6, 112);
          stackIn_3_0 = var6.field_f;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_6_0 = var6_ref;
          stackIn_6_1 = new StringBuilder().append("dc.C(").append(param0).append(',').append(param1).append(',');
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
          throw dn.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_J = new int[]{33023, 49216, 8388863, 16711680};
        field_C = "Quit";
    }
}
