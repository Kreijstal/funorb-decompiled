/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class AccountCreationForm extends UiContainer implements HotspotListener, ButtonActionListener, UsernameSuggestionListener {
    private ValidatedTextWidget field_M;
    private TextButton field_H;
    private ValidatedTextWidget field_P;
    private ValidatedTextWidget field_N;
    private HotspotTextWidget field_J;
    NameSuggestionsPanel field_I;
    private TextButton field_L;
    static AccountRequestState field_F;
    private ValidatedTextWidget field_G;
    private ValidatedTextWidget field_R;
    static Sprite field_K;
    private ValidatedTextWidget field_Q;
    private CheckboxWidget field_O;

    private final boolean submitRegistration(byte param0) {
        if (!this.areAllInputsValid(40)) {
          return false;
        }
        int var2 = -1;
        if (param0 >= -108) {
          return true;
        }
        try {
          var2 = Integer.parseInt(this.field_R.field_o);
        } catch (NumberFormatException numberFormatException) {
        }
        return IntroCutsceneScreen.startAccountCreation(this.field_P.field_o, 640, this, this.field_N.field_o, var2, this.field_G.field_o, this.field_O.field_x);
    }

    final boolean requestKeyboardFocus(int param0, int param1, UiWidget param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.requestKeyboardFocus(-120, param1, param2, param3)) {
            return true;
          }
          var5_int = 61 / ((-83 - param0) / 32);
          if (98 == param1) {
            stackIn_5_0 = this.focusPreviousChild((byte) 119, param2);
            return stackIn_5_0;
          }
          if (99 != param1) {
            return false;
          }
          stackIn_9_0 = this.focusNextChild(1, param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("fk.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onMoreSuggestionsRequested(int param0) {
        int var2 = 107 / ((39 - param0) / 49);
        ((NameAvailabilityValidator) (this.field_N.getValidationSource(0))).invalidateCachedAvailability(-28769);
    }

    private final boolean areAllInputsValid(int param0) {
        if (param0 != 40) {
          this.field_L = (TextButton) null;
          if (!this.isFieldAcceptable((byte) 77, (ValidationSource) (this.field_N))) {
            return false;
          }
          if (!this.isFieldAcceptable((byte) 77, (ValidationSource) (this.field_G))) {
            return false;
          }
          if (!this.isFieldAcceptable((byte) 77, (ValidationSource) (this.field_M))) {
            return false;
          }
          if (!this.isFieldAcceptable((byte) 77, (ValidationSource) (this.field_P))) {
            return false;
          }
          if (!this.isFieldAcceptable((byte) 77, (ValidationSource) (this.field_Q))) {
            return false;
          }
          if (this.isFieldAcceptable((byte) 77, (ValidationSource) (this.field_R))) {
            return true;
          }
          return false;
        }
        if (!this.isFieldAcceptable((byte) 77, (ValidationSource) (this.field_N))) {
          return false;
        }
        if (!this.isFieldAcceptable((byte) 77, (ValidationSource) (this.field_G))) {
          return false;
        }
        if (!this.isFieldAcceptable((byte) 77, (ValidationSource) (this.field_M))) {
          return false;
        }
        if (!this.isFieldAcceptable((byte) 77, (ValidationSource) (this.field_P))) {
          return false;
        }
        if (!this.isFieldAcceptable((byte) 77, (ValidationSource) (this.field_Q))) {
          return false;
        }
        if (this.isFieldAcceptable((byte) 77, (ValidationSource) (this.field_R))) {
          return true;
        }
        return false;
    }

    private final String getLinkOpenMarkup(int param0) {
        if (param0 != 60) {
          field_F = (AccountRequestState) null;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final int addLabeledField(String param0, int param1, UiWidget param2, int param3, int param4) {
        CaptionedContainer var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new CaptionedContainer(20, param3, param4 + param1, 25, param2, false, 120, 3, MenuFontGlobals.field_e, 16777215, param0);
          this.addChild(var6, 10);
          stackIn_1_0 = var6.field_n;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_4_0 = var6_ref;
          stackIn_4_1 = new StringBuilder().append("fk.H(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int addValidatedField(int param0, int param1, int param2, String param3, UiWidget param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        ValidationStatusIcon var7 = null;
        CaptionedContainer var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new CaptionedContainer(20, param1, param2 + 120, 25, param4, false, 120, 3, MenuFontGlobals.field_e, 16777215, param3);
          this.addChild(var8, 10);
          var7 = new ValidationStatusIcon(((ValidationSource) ((Object) param4)).getValidationSource(0));
          this.addChild(var7, 10);
          if (param0 > -44) {
            discarded$1 = this.submitRegistration((byte) -123);
          }
          var7.setBounds(76, (-15 + var8.field_n >> 1) + var8.field_j, 3 + var8.field_k + var8.field_i, 15, 15);
          stackIn_3_0 = var8.field_n;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("fk.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_K = null;
        if (param0 != -31) {
          return;
        }
        field_F = null;
    }

    final void updatePointer(UiWidget param0, byte param1, int param2, int param3) {
        try {
          super.updatePointer(param0, (byte) -92, param2, param3);
          int var5_int = 40 % ((46 - param1) / 42);
          this.field_L.field_C = this.areAllInputsValid(40);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "fk.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void onHotspotAction(HotspotTextWidget param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawn.field_J;
        try {
          if (param1 != 120) {
            this.field_Q = (ValidatedTextWidget) null;
          }
          if (param2 == 0) {
            FullscreenCanvasHelpers.requestAccountActionWithText(12, "terms.ws");
            return;
          }
          if (param2 == 1) {
            FullscreenCanvasHelpers.requestAccountActionWithText(12, "privacy.ws");
            return;
          }
          if (2 != param2) {
            return;
          }
          FullscreenCanvasHelpers.requestAccountActionWithText(12, "conduct.ws");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("fk.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onButtonActivated(int param0, int param1, TextButton param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -6) {
            return;
          }
          if (param2 == this.field_H) {
            ZombieDawn.showLoginChoiceDialog(-10401);
            return;
          }
          if (param2 != this.field_L) {
            return;
          }
          discarded$1 = this.submitRegistration((byte) -125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("fk.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int addFieldWithValidationHelpDefaultWidth(int param0, UiWidget param1, String param2, String param3, int param4, int param5) {
        RuntimeException var7 = null;
        String var8 = null;
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
          if (param4 != -24519) {
            var8 = (String) null;
            this.onSuggestionChosen((byte) 41, (String) null);
          }
          stackIn_3_0 = this.addFieldWithValidationHelp(param1, 0, param0, param2, 35, param5, param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("fk.M(").append(param0).append(',');
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final int addFieldWithValidationHelp(UiWidget param0, int param1, int param2, String param3, int param4, int param5, String param6) {
        RuntimeException var8 = null;
        ValidationMessageWidget var9 = null;
        CaptionedContainer var10 = null;
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
          var10 = new CaptionedContainer(20, param2, 120 + param5, 25, param0, false, 120, 3, MenuFontGlobals.field_e, 16777215, param6);
          this.addChild(var10, 10);
          var9 = new ValidationMessageWidget(((ValidationSource) ((Object) param0)).getValidationSource(param1 ^ param1), param3, 126, param2 + var10.field_n, param5 + 50, param4);
          var9.field_v = (WidgetListener) (this);
          this.addChild(var9, 10);
          stackIn_1_0 = var9.field_n + var10.field_n;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("fk.R(");
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
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final String getLinkCloseMarkup(int param0) {
        if (param0 < 84) {
          return (String) null;
        }
        return "</col></u>";
    }

    public final void onSuggestionChosen(byte param0, String param1) {
        ValidatedTextWidget var3 = null;
        String var4 = null;
        try {
          int var5 = 81 / ((param0 + 40) / 48);
          var3 = this.field_N;
          var4 = param1;
          ((EditableTextWidget) ((Object) var3)).setText(false, false, var4);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "fk.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public AccountCreationForm() {
        super(0, 0, 496, 0, (WidgetPainter) null);
        this.field_N = new ValidatedTextWidget("", (WidgetListener) null, 12);
        this.field_G = new ValidatedTextWidget("", (WidgetListener) null, 100);
        this.field_M = new ValidatedTextWidget("", (WidgetListener) null, 100);
        this.field_P = new ValidatedTextWidget("", (WidgetListener) null, 20);
        this.field_Q = new ValidatedTextWidget("", (WidgetListener) null, 20);
        this.field_R = new ValidatedTextWidget("", (WidgetListener) null, 3);
        int var1 = 1;
        this.field_O = new CheckboxWidget("", (WidgetListener) null, var1 != 0);
        this.field_L = new TextButton(MenuScreen.field_c, (WidgetListener) null);
        this.field_H = new TextButton(CheckboxPainter.field_f, (WidgetListener) null);
        this.field_N.field_s = LoginMethod.field_d;
        this.field_G.field_s = LoginUiHelpers.field_a;
        this.field_M.field_s = GameWorld.field_pb;
        this.field_P.field_s = BufferedSocket.field_f;
        this.field_Q.field_s = StatefulWidgetRenderer.field_t;
        this.field_R.field_s = GlassShard.field_D;
        this.field_O.field_s = FullscreenMembershipDialog.field_V;
        this.field_N.setValidationSource(-73, new NameAvailabilityValidator(this.field_N));
        this.field_G.setValidationSource(127, new EmailSyntaxValidator(this.field_G));
        this.field_M.setValidationSource(-110, new EmailAvailabilityValidator(this.field_M, this.field_G));
        this.field_P.setValidationSource(79, new PasswordValidator(this.field_P, this.field_N, this.field_G));
        this.field_Q.setValidationSource(24, new MatchingTextValidator(this.field_Q, this.field_P));
        this.field_R.setValidationSource(-87, new AgeValidator(this.field_R));
        this.field_L.field_C = false;
        this.field_L.field_h = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
        this.field_H.field_h = (WidgetPainter) ((Object) new LinkTextPainter());
        this.field_N.field_h = (WidgetPainter) ((Object) new InsetTextPainter(10000536));
        InsetTextPainter dupTemp$0 = new InsetTextPainter(10000536);
        this.field_M.field_h = (WidgetPainter) ((Object) dupTemp$0);
        this.field_G.field_h = (WidgetPainter) ((Object) dupTemp$0);
        this.field_R.field_h = (WidgetPainter) ((Object) new InsetTextPainter(10000536));
        this.field_O.field_h = (WidgetPainter) ((Object) new SpriteCheckboxPainter());
        PasswordFieldPainter dupTemp$1 = new PasswordFieldPainter(10000536);
        this.field_Q.field_h = (WidgetPainter) ((Object) dupTemp$1);
        this.field_P.field_h = (WidgetPainter) ((Object) dupTemp$1);
        String var2 = BlastAffectedObject.substituteTemplateArguments(1938762664, SpriteCheckboxPainter.field_d, new String[]{this.getLinkOpenMarkup(60), this.getLinkCloseMarkup(110)});
        int var3 = 20;
        var3 = var3 + this.addLabeledField(ScriptedMinigunner.field_Vb, 120, this.field_G, var3, 170);
        var3 = var3 + (5 + this.addFieldWithValidationHelp(this.field_M, 0, var3, "", 20, 170, ChatMessage.field_g));
        var3 = var3 + this.addLabeledField(AudioMixerHelpers.field_c, 120, this.field_P, var3, 170);
        var3 = var3 + (this.addFieldWithValidationHelpDefaultWidth(var3, this.field_Q, SweepingSpotlight.field_J, BloodSplat.field_I, -24519, 170) + 5);
        var3 = var3 + (this.addFieldWithValidationHelpDefaultWidth(var3, this.field_N, BulletCasing.field_l, PendingIntArrayRequest.field_i, -24519, 170) + 5);
        var3 = var3 + this.addValidatedField(-55, var3, 170, Js5ArchiveManager.field_j, this.field_R);
        CaptionedContainer var4 = new CaptionedContainer(46, var3, this.field_i - 90, 25, this.field_O, true, this.field_i - 120, 5, SecondaryNodeDeque.field_a, 11579568, LoginNameValue.field_d);
        this.addChild(var4, 10);
        var3 = var3 + var4.field_n;
        TextWidgetPainter var5 = new TextWidgetPainter(MenuFontGlobals.field_e, 0, 0, 0, 0, 16777215, -1, 0, 0, MenuFontGlobals.field_e.field_I, -1, 2147483647, true);
        this.field_J = new HotspotTextWidget(var2, var5);
        this.field_J.field_s = "";
        this.field_J.setHotspotTooltip(0, -21423, FullscreenErrorReason.field_b);
        this.field_J.setHotspotTooltip(1, -21423, FullscreenErrorReason.field_b);
        this.field_J.field_v = (WidgetListener) (this);
        this.field_J.setBoundsToTextHeight(46, var3, true, -90 + this.field_i);
        var3 = var3 + (15 + this.field_J.field_n);
        this.addChild(this.field_J, 10);
        int var6 = 4;
        int var7 = 200;
        this.field_L.setBounds(57, var3, 496 - var7 >> 1, var7, 40);
        this.field_H.setBounds(35, 15 + var3, var6 + 3, 60, 40);
        this.field_H.field_v = (WidgetListener) (this);
        this.field_L.field_v = (WidgetListener) (this);
        this.addChild(this.field_L, 10);
        this.addChild(this.field_H, 10);
        this.field_I = new NameSuggestionsPanel((UsernameSuggestionListener) (this));
        this.field_I.setBounds(36, 20 + this.field_N.field_j, 60 + this.field_N.field_i + this.field_N.field_k, this.field_i + (-this.field_N.field_k - this.field_N.field_i - 60), 150);
        this.addChild(this.field_I, 10);
        this.setBounds(35, 0, 0, 496, 55 + var3 + var6);
    }

    final static void tickPeriodicSpawn(boolean param0) {
        int fieldTemp$0 = Tree.field_R;
        Tree.field_R = Tree.field_R - 1;
        if (fieldTemp$0 <= 0) {
          Js5Archive.field_e.zombies.addFirst(0, new TrafficVehicle());
          Tree.field_R = GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, 40, 1) + 40;
          if (param0) {
            AccountCreationForm.tickPeriodicSpawn(false);
            return;
          }
          return;
        }
        if (!param0) {
          return;
        }
        AccountCreationForm.tickPeriodicSpawn(false);
    }

    private final boolean isFieldAcceptable(byte param0, ValidationSource param1) {
        TextValidator var3 = null;
        RuntimeException var3_ref = null;
        ValidationState var4 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.getValidationSource(0);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getValidationState((byte) -89);
          if (var4 == MouseWheelInput.field_b) {
            return false;
          }
          if (param0 != 77) {
            return true;
          }
          if (ProxySocketConnector.field_l == var4) {
            return false;
          }
          if (var4 != AccountWelcomePanel.field_L) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_22_0 = var3_ref;
          stackIn_22_1 = new StringBuilder().append("fk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    static {
    }
}
