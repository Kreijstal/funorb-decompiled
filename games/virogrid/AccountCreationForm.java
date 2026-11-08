/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationForm extends WidgetContainer implements LinkClickListener, ButtonActionListener, UsernameSuggestionListener {
    private ValidatedTextWidget field_S;
    private ValidatedTextWidget field_I;
    static String field_N;
    private TextButton field_L;
    private CheckboxButton field_P;
    static int field_K;
    private ValidatedTextWidget field_Q;
    private HotspotTextWidget field_O;
    private ValidatedTextWidget field_E;
    static SpriteWidget field_R;
    private ValidatedTextWidget field_J;
    UsernameSuggestionPanel field_H;
    private ValidatedTextWidget field_D;
    private TextButton field_F;

    private final int addFieldWithDefaultHelp(int param0, int param1, String param2, UiWidget param3, String param4, int param5) {
        RuntimeException var7 = null;
        TextButton var8 = null;
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
          if (param0 != 19259) {
            var8 = (TextButton) null;
            this.onAction(-8, (TextButton) null, -33, -51, -84);
          }
          stackIn_3_0 = this.addFieldWithValidationHelp(param4, 35, param2, (byte) 78, param5, param3, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("qh.O(").append(param0).append(',').append(param1).append(',');
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    private final int addFieldWithValidationHelp(String param0, int param1, String param2, byte param3, int param4, UiWidget param5, int param6) {
        RuntimeException var8 = null;
        ValidationMessageWidget var9 = null;
        LabeledChildWidget var10 = null;
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
          var10 = new LabeledChildWidget(20, param4, 120 + param6, 25, param5, false, 120, 3, PlayerContextMenu.arezzo14Font, 16777215, param2);
          if (param3 <= 40) {
            this.field_H = (UsernameSuggestionPanel) null;
          }
          this.addChild((UiWidget) (var10), (byte) -78);
          var9 = new ValidationMessageWidget(((ValidationProvider) ((Object) param5)).getValidationSource(-1), param0, 126, var10.field_m + param4, 50 + param6, param1);
          var9.field_o = (UiListener) (this);
          this.addChild((UiWidget) (var9), (byte) -78);
          stackIn_3_0 = var9.field_m + var10.field_m;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("qh.Q(");
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
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(')').toString());
        }
    }

    public final void onSuggestionSelected(String param0, boolean param1) {
        ValidatedTextWidget var3 = null;
        String var4 = null;
        try {
          var3 = this.field_I;
          var4 = param0;
          ((EditableTextWidget) ((Object) var3)).setText(var4, 81, param1);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "qh.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final String getLinkOpenMarkup(byte param0) {
        if (param0 != -117) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean handleKeyInput(UiWidget param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, param1, param2, -125)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_7_0 = this.focusPreviousChild(2, param0);
            return stackIn_7_0;
          }
          var5_int = 77 % ((-75 - param3) / 36);
          if (99 != param2) {
            return false;
          }
          stackIn_11_0 = this.focusNextChild(-16234, param0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("qh.AA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_N = null;
        field_R = null;
        if (param0 != 8246) {
          field_N = (String) null;
        }
    }

    public final void onLinkClicked(int param0, int param1, boolean param2, HotspotTextWidget param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        UiWidget var7 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 == 0) {
            RasterBuffer.requestOpenLink("terms.ws", 12);
          } else {
            if (param0 != 1) {
              if (param0 == 2) {
                RasterBuffer.requestOpenLink("conduct.ws", 12);
              }
            } else {
              RasterBuffer.requestOpenLink("privacy.ws", 12);
            }
          }
          if (param2) {
            return;
          }
          var7 = (UiWidget) null;
          this.updatePointer(33, 84, (UiWidget) null, 92);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("qh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final boolean areAllInputsValid(int param0) {
        if (!this.isFieldValid((ValidationProvider) (this.field_I), param0 - 16765699)) {
          return false;
        }
        if (!this.isFieldValid((ValidationProvider) (this.field_J), 11516)) {
          return false;
        }
        if (!this.isFieldValid((ValidationProvider) (this.field_D), 11516)) {
          return false;
        }
        if (!this.isFieldValid((ValidationProvider) (this.field_Q), 11516)) {
          return false;
        }
        if (!this.isFieldValid((ValidationProvider) (this.field_E), 11516)) {
          return false;
        }
        if (!this.isFieldValid((ValidationProvider) (this.field_S), 11516)) {
          return false;
        }
        if (param0 == 16777215) {
          return true;
        }
        boolean discarded$0 = this.submitRegistration(78);
        return true;
    }

    public AccountCreationForm() {
        super(0, 0, 496, 0, (WidgetListener) null);
        this.field_I = new ValidatedTextWidget("", (UiListener) null, 12);
        this.field_J = new ValidatedTextWidget("", (UiListener) null, 100);
        this.field_D = new ValidatedTextWidget("", (UiListener) null, 100);
        this.field_Q = new ValidatedTextWidget("", (UiListener) null, 20);
        this.field_E = new ValidatedTextWidget("", (UiListener) null, 20);
        this.field_S = new ValidatedTextWidget("", (UiListener) null, 3);
        int var1 = 1;
        this.field_P = new CheckboxButton("", (UiListener) null, var1 != 0);
        this.field_L = new TextButton(TextureCache.field_e, (UiListener) null);
        this.field_F = new TextButton(DialWidgetPainter.field_o, (UiListener) null);
        this.field_I.field_h = ChatFilterHelpers.field_c;
        this.field_J.field_h = SocketJs5Transport.field_w;
        this.field_D.field_h = SocketConnector.field_f;
        this.field_Q.field_h = NameEntryPopup.field_Kb;
        this.field_E.field_h = AccountCreationSupport.field_j;
        this.field_S.field_h = QueuedResultSubmission.field_i;
        this.field_P.field_h = LoginCredentials.field_d;
        this.field_I.setValidationSource(new UsernameAvailabilityValidator(this.field_I), (byte) 125);
        this.field_J.setValidationSource(new EmailValidator(this.field_J), (byte) 127);
        this.field_D.setValidationSource(new EmailAvailabilityValidator(this.field_D, this.field_J), (byte) 127);
        this.field_Q.setValidationSource(new PasswordValidator(this.field_Q, this.field_I, this.field_J), (byte) 126);
        this.field_E.setValidationSource(new PasswordConfirmationValidator(this.field_E, this.field_Q), (byte) 125);
        this.field_S.setValidationSource(new AgeValidator(this.field_S), (byte) 127);
        this.field_L.field_C = false;
        this.field_L.listener = (WidgetListener) ((Object) new ThreeSliceButtonPainter());
        this.field_F.listener = (WidgetListener) ((Object) new LinkTextPainter());
        this.field_I.listener = (WidgetListener) ((Object) new TextFieldPainter(10000536));
        TextFieldPainter dupTemp$0 = new TextFieldPainter(10000536);
        this.field_D.listener = (WidgetListener) ((Object) dupTemp$0);
        this.field_J.listener = (WidgetListener) ((Object) dupTemp$0);
        this.field_S.listener = (WidgetListener) ((Object) new TextFieldPainter(10000536));
        this.field_P.listener = (WidgetListener) ((Object) new CheckboxTickPainter());
        PasswordFieldPainter dupTemp$1 = new PasswordFieldPainter(10000536);
        this.field_E.listener = (WidgetListener) ((Object) dupTemp$1);
        this.field_Q.listener = (WidgetListener) ((Object) dupTemp$1);
        String var2 = MenuScreen.formatIndexedText(new String[]{this.getLinkOpenMarkup((byte) -117), this.getLinkCloseMarkup((byte) -1)}, Js5Archive.field_m, 2);
        int var3 = 20;
        var3 = var3 + this.addLabeledInputRow(170, 126, SpriteLoadHelpers.field_d, var3, this.field_J);
        var3 = var3 + (5 + this.addFieldWithValidationHelp("", 20, HotspotTextWidget.field_J, (byte) 83, var3, this.field_D, 170));
        var3 = var3 + this.addLabeledInputRow(170, 126, GameClock.field_b, var3, this.field_Q);
        var3 = var3 + (this.addFieldWithDefaultHelp(19259, 170, ArchiveFactoryHelpers.field_f, this.field_E, TextHotspot.field_n, var3) + 5);
        var3 = var3 + (this.addFieldWithDefaultHelp(19259, 170, AudioPumpThread.field_g, this.field_I, LoginCredentialType.field_f, var3) + 5);
        var3 = var3 + this.addValidatedField(LoginDialog.field_qb, var3, 170, -87, this.field_S);
        LabeledChildWidget var4 = new LabeledChildWidget(46, var3, this.field_g - 90, 25, this.field_P, true, this.field_g - 120, 5, Js5Transport.arezzo12Font, 11579568, ArchiveProvider.field_b);
        this.addChild((UiWidget) (var4), (byte) -78);
        var3 = var3 + var4.field_m;
        TextWidgetPainter var5 = new TextWidgetPainter(PlayerContextMenu.arezzo14Font, 0, 0, 0, 0, 16777215, -1, 0, 0, PlayerContextMenu.arezzo14Font.field_H, -1, 2147483647, true);
        this.field_O = new HotspotTextWidget(var2, var5);
        this.field_O.field_h = "";
        this.field_O.setHotspotTooltip(DateOfBirthValidator.field_g, (byte) -71, 0);
        this.field_O.setHotspotTooltip(DateOfBirthValidator.field_g, (byte) -77, 1);
        this.field_O.field_o = (UiListener) (this);
        this.field_O.setBoundsToPreferredHeight(-90 + this.field_g, var3, 46, (byte) -125);
        var3 = var3 + (15 + this.field_O.field_m);
        this.addChild((UiWidget) (this.field_O), (byte) -78);
        int var6 = 4;
        int var7 = 200;
        this.field_L.setBounds(40, true, var3, -var7 + 496 >> 1, var7);
        this.field_F.setBounds(40, true, var3 + 15, 3 + var6, 60);
        this.field_F.field_o = (UiListener) (this);
        this.field_L.field_o = (UiListener) (this);
        this.addChild((UiWidget) (this.field_L), (byte) -78);
        this.addChild((UiWidget) (this.field_F), (byte) -78);
        this.field_H = new UsernameSuggestionPanel((UsernameSuggestionListener) (this));
        this.field_H.setBounds(150, true, this.field_I.field_u + 20, this.field_I.field_l + this.field_I.field_g + 60, this.field_g - this.field_I.field_l + (-this.field_I.field_g - 60));
        this.addChild((UiWidget) (this.field_H), (byte) -78);
        this.setBounds(var6 + (55 + var3), true, 0, 0, 496);
    }

    private final int addLabeledInputRow(int param0, int param1, String param2, int param3, UiWidget param4) {
        LabeledChildWidget var6 = null;
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
          if (param1 != 126) {
            stackIn_2_0 = -105;
            return stackIn_2_0;
          }
          var6 = new LabeledChildWidget(20, param3, param0 + 120, 25, param4, false, 120, 3, PlayerContextMenu.arezzo14Font, 16777215, param2);
          this.addChild((UiWidget) (var6), (byte) -78);
          stackIn_4_0 = var6.field_m;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("qh.S(").append(param0).append(',').append(param1).append(',');
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
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final boolean submitRegistration(int param0) {
        if (!this.areAllInputsValid(16777215)) {
          return false;
        }
        int var2 = -76 % ((-1 - param0) / 53);
        int var3 = -1;
        try {
          var3 = Integer.parseInt(this.field_S.field_n);
        } catch (NumberFormatException numberFormatException) {
        }
        return AccountCreationSupport.startAccountCreation(this.field_I.field_n, this.field_Q.field_n, this, this.field_P.field_z, 122, this.field_J.field_n, var3);
    }

    final static void showDisplayNameForm(byte param0) {
        if (null != ThreeSliceButtonPainter.field_w) {
          ThreeSliceButtonPainter.field_w.closeDialog(true);
        }
        PopupMenuDrawHelpers.field_c = new DisplayNameForm();
        UiWidget.field_t.transitionToContent(PopupMenuDrawHelpers.field_c, (byte) -53);
        if (param0 >= 10) {
          return;
        }
        field_R = (SpriteWidget) null;
    }

    private final String getLinkCloseMarkup(byte param0) {
        if (param0 != -1) {
          this.field_J = (ValidatedTextWidget) null;
          return "</col></u>";
        }
        return "</col></u>";
    }

    private final boolean isFieldValid(ValidationProvider param0, int param1) {
        TextValidator var3 = null;
        RuntimeException var3_ref = null;
        AudioSetupHelpers var4 = null;
        HotspotTextWidget var5 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.getValidationSource(param1 - 11517);
          if (var3 == null) {
            return true;
          }
          if (param1 != 11516) {
            var5 = (HotspotTextWidget) null;
            this.onLinkClicked(-125, 60, false, (HotspotTextWidget) null);
          }
          var4 = var3.getValidationState(-22243);
          if (var4 == GuestPlayHelpers.field_c) {
            return false;
          }
          if (var4 == ImageProducerRasterBuffer.field_r) {
            return false;
          }
          if (TriangleMesh.field_v != var4) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("qh.M(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final void updatePointer(int param0, int param1, UiWidget param2, int param3) {
        try {
          super.updatePointer(param0, 115, param2, param3);
          if (param1 <= 113) {
            this.field_P = (CheckboxButton) null;
          }
          this.field_L.field_C = this.areAllInputsValid(16777215);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "qh.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final void onMoreSuggestionsRequested(byte param0) {
        int discarded$0 = 0;
        ((UsernameAvailabilityValidator) (this.field_I.getValidationSource(-1))).clearCachedName(false);
        if (param0 != -72) {
          String var3 = (String) null;
          discarded$0 = this.addFieldWithDefaultHelp(57, 12, (String) null, (UiWidget) null, (String) null, 10);
        }
    }

    public final void onAction(int param0, TextButton param1, int param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != this.field_F) {
            if (this.field_L == param1) {
              discarded$1 = this.submitRegistration(param0 ^ -12146);
            }
          } else {
            GuestPlayHelpers.showGuestPlayConfirmation((byte) 122);
          }
          if (param0 == 12085) {
            return;
          }
          this.field_H = (UsernameSuggestionPanel) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("qh.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void createSharedPanels(byte param0, boolean param1) {
        LobbyGame.field_pc = param1 ? new LobbyLayout(ArrayWidgetContainer.field_A, IntrusiveNode.field_b) : new LobbyLayout(StrongCacheReference.field_A, ViewControlStrings.field_d);
        ScrollPaneWithFooter.field_Eb = new SpriteWidget(0L, (SpriteWidget) null);
        ScrollPaneWithFooter.field_Eb.addChild(0, LobbyGame.field_pc.field_c);
        if (param0 == -68) {
          ScrollPaneWithFooter.field_Eb.addChild(0, CellFlip.field_o);
          MouseTrailPoint.field_n = new SpriteWidget(0L, LobbySessionHelpers.field_e);
          BirthDateInputWidget.field_J = new SpriteWidget(0L, (SpriteWidget) null);
          MouseTrailPoint.field_n.addChild(0, WidgetStyleLayer.field_m);
          MouseTrailPoint.field_n.addChild(0, BirthDateInputWidget.field_J);
          BirthDateInputWidget.field_J.addChild(param0 ^ -68, BackgroundParticle.field_m);
          BirthDateInputWidget.field_J.addChild(0, HelpPopup.field_Ib);
          GameClock.layoutLobbyComponents(param1, true);
          return;
        }
    }

    private final int addValidatedField(String param0, int param1, int param2, int param3, UiWidget param4) {
        RuntimeException var6 = null;
        ValidationIndicator var7 = null;
        LabeledChildWidget var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new LabeledChildWidget(20, param1, param2 + 120, 25, param4, false, 120, 3, PlayerContextMenu.arezzo14Font, 16777215, param0);
          if (param3 >= -1) {
            this.field_E = (ValidatedTextWidget) null;
          }
          this.addChild((UiWidget) (var8), (byte) -78);
          var7 = new ValidationIndicator(((ValidationProvider) ((Object) param4)).getValidationSource(-1));
          this.addChild((UiWidget) (var7), (byte) -78);
          var7.setBounds(15, true, var8.field_u + (var8.field_m - 15 >> 1), var8.field_g + var8.field_l + 3, 15);
          stackIn_3_0 = var8.field_m;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("qh.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_N = "To server list";
    }
}
