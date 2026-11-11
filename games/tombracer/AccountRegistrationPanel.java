/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRegistrationPanel extends WidgetContainer implements HotspotListener, ButtonListener, mia {
    private ValidatedTextInputWidget field_E;
    private jla field_D;
    private ValidatedTextInputWidget field_I;
    private FocusableWidget field_B;
    private FocusableWidget field_F;
    private HotspotTextWidget field_A;
    private ValidatedTextInputWidget field_z;
    UsernameSuggestionsPanel field_y;
    private ValidatedTextInputWidget field_G;
    static SoundEventPlayer field_w;
    private ValidatedTextInputWidget field_J;
    private ValidatedTextInputWidget field_C;
    static String field_H;
    static String[] dayNames;

    public final void onHotspotAction(HotspotTextWidget param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        HotspotTextWidget var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 != 30846) {
            var7 = (HotspotTextWidget) null;
            this.onHotspotAction((HotspotTextWidget) null, -41, 57, 20);
          }
          if (param1 == 0) {
            DefaultRoomObjectRenderer.a("terms.ws", (byte) -25);
            return;
          }
          if (param1 == 1) {
            DefaultRoomObjectRenderer.a("privacy.ws", (byte) -109);
            return;
          }
          if (param1 != 2) {
            return;
          }
          DefaultRoomObjectRenderer.a("conduct.ws", (byte) -43);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("mr.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int addLabeledField(UiWidget param0, int param1, int param2, byte param3, String param4) {
        jsa var6 = null;
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
          var6 = new jsa(20, param1, param2 + 120, 25, param0, false, 120, 3, KeySwitchComponent.field_J, 16777215, param4);
          this.addChild(var6, -1);
          if (param3 >= 33) {
            stackIn_4_0 = var6.field_p;
            return stackIn_4_0;
          }
          stackIn_2_0 = 97;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("mr.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final boolean submitRegistration(int param0) {
        if (!this.g(param0 ^ -1878)) {
          return false;
        }
        int var2 = param0;
        try {
          var2 = Integer.parseInt(this.field_I.field_o);
        } catch (NumberFormatException numberFormatException) {
        }
        return qt.a(this.field_G.field_o, true, var2, this.field_z.field_o, this.field_E.field_o, this, this.field_D.field_w);
    }

    final static int a(float param0, float param1, boolean param2, float param3) {
        float stackIn_3_0 = 0.0f;
        float stackIn_8_0 = 0.0f;
        float stackIn_11_0 = 0.0f;
        float var4;
        float var5;
        float var6;
        if (!(0.0f > param3)) {
          stackIn_3_0 = param3;
        } else {
          stackIn_3_0 = -param3;
        }
        var4 = stackIn_3_0;
        if (param2) {
          AccountRegistrationPanel.releaseStatics(-14);
        }
        if (param1 < 0.0f) {
          stackIn_8_0 = -param1;
        } else {
          stackIn_8_0 = param1;
        }
        var5 = stackIn_8_0;
        if (0.0f > param0) {
          stackIn_11_0 = -param0;
        } else {
          stackIn_11_0 = param0;
        }
        var6 = stackIn_11_0;
        if (var4 < var5 &&
          var5 > var6) {
          if (param1 > 0.0f) {
            return 0;
          }
          return 1;
        }
        if (var6 > var4 &&
          var6 > var5) {
          if (param0 > 0.0f) {
            return 2;
          }
          return 3;
        }
        if (0.0f < param3) {
          return 4;
        }
        return 5;
    }

    public AccountRegistrationPanel() {
        super(0, 0, 496, 0, (WidgetPainter) null);
        this.field_G = new ValidatedTextInputWidget("", (WidgetListener) null, 12);
        this.field_z = new ValidatedTextInputWidget("", (WidgetListener) null, 100);
        this.field_J = new ValidatedTextInputWidget("", (WidgetListener) null, 100);
        this.field_E = new ValidatedTextInputWidget("", (WidgetListener) null, 20);
        this.field_C = new ValidatedTextInputWidget("", (WidgetListener) null, 20);
        this.field_I = new ValidatedTextInputWidget("", (WidgetListener) null, 3);
        int var1 = 1;
        this.field_D = new jla("", (WidgetListener) null, var1 != 0);
        this.field_F = new FocusableWidget(sla.field_c, (WidgetListener) null);
        this.field_B = new FocusableWidget(HardwareOpenGlToolkit.field_gd, (WidgetListener) null);
        this.field_G.field_q = rma.field_a;
        this.field_z.field_q = ema.field_a;
        this.field_J.field_q = ju.field_a;
        this.field_E.field_q = MatchOverlay.field_f;
        this.field_C.field_q = RevolverItemComponent.field_G;
        this.field_I.field_q = dta.field_e;
        this.field_D.field_q = RenderLayer.field_e;
        this.field_G.a(-13861, new tf(this.field_G));
        this.field_z.a(-13861, new EmailSyntaxValidator(this.field_z));
        this.field_J.a(-13861, new mn(this.field_J, this.field_z));
        this.field_E.a(-13861, new PasswordValidator(this.field_E, this.field_G, this.field_z));
        this.field_C.a(-13861, new MatchingTextValidator(this.field_C, this.field_E));
        this.field_I.a(-13861, new AgeValidator(this.field_I));
        this.field_F.field_y = false;
        this.field_F.field_r = (WidgetPainter) ((Object) new td());
        this.field_B.field_r = (WidgetPainter) ((Object) new kaa());
        this.field_G.field_r = (WidgetPainter) ((Object) new hga(10000536));
        hga dupTemp$0 = new hga(10000536);
        this.field_J.field_r = (WidgetPainter) ((Object) dupTemp$0);
        this.field_z.field_r = (WidgetPainter) ((Object) dupTemp$0);
        this.field_I.field_r = (WidgetPainter) ((Object) new hga(10000536));
        this.field_D.field_r = (WidgetPainter) ((Object) new ee());
        poa dupTemp$1 = new poa(10000536);
        this.field_C.field_r = (WidgetPainter) ((Object) dupTemp$1);
        this.field_E.field_r = (WidgetPainter) ((Object) dupTemp$1);
        String var2 = LegacyOpenGlFlowingWaterEffect.formatText(90, ConstrainToCircleLocomotor.field_y, new String[]{this.linkStylePrefix(170), this.e(127)});
        int var3 = 20;
        var3 = var3 + this.addLabeledField(this.field_z, var3, 170, (byte) 74, HardwareSpecularEffect.field_f);
        var3 = var3 + (this.addFieldWithHelp(var3, 77, this.field_J, 170, 20, "", ct.field_d) + 5);
        var3 = var3 + this.addLabeledField(this.field_E, var3, 170, (byte) 59, rta.field_j);
        var3 = var3 + (this.a(WaypointPath.field_c, GameKeyHandler.field_d, this.field_C, -3, 170, var3) + 5);
        var3 = var3 + (this.a(CrusherBehaviour.field_r, za.field_f, this.field_G, -3, 170, var3) + 5);
        var3 = var3 + this.addValidatedField(this.field_I, var3, (byte) 99, iqa.field_g, 170);
        jsa var4 = new jsa(46, var3, this.field_m - 90, 25, this.field_D, true, this.field_m - 120, 5, BlendModeOperator.field_o, 11579568, OpenGlSprite.field_l);
        this.addChild(var4, -1);
        var3 = var3 + var4.field_p;
        TextWidgetPainter var5 = new TextWidgetPainter(KeySwitchComponent.field_J, 0, 0, 0, 0, 16777215, -1, 0, 0, KeySwitchComponent.field_J.field_w, -1, 2147483647, true);
        this.field_A = new HotspotTextWidget(var2, var5);
        this.field_A.field_q = "";
        this.field_A.setHotspotTooltip(EditableTextField.field_Fb, 0, 0);
        this.field_A.setHotspotTooltip(EditableTextField.field_Fb, 1, 0);
        this.field_A.field_h = (WidgetListener) (this);
        this.field_A.a(var3, (byte) -120, -90 + this.field_m, 46);
        var3 = var3 + (this.field_A.field_p + 15);
        this.addChild(this.field_A, -1);
        int var6 = 4;
        int var7 = 200;
        this.field_F.setBounds((byte) -31, var7, 40, -var7 + 496 >> 1, var3);
        this.field_B.setBounds((byte) -31, 60, 40, var6 + 3, 15 + var3);
        this.field_B.field_h = (WidgetListener) (this);
        this.field_F.field_h = (WidgetListener) (this);
        this.addChild(this.field_F, -1);
        this.addChild(this.field_B, -1);
        this.field_y = new UsernameSuggestionsPanel((mia) (this));
        this.field_y.setBounds((byte) -31, -60 - this.field_G.field_m - this.field_G.field_i + this.field_m, 150, 60 + (this.field_G.field_m + this.field_G.field_i), this.field_G.field_n + 20);
        this.addChild(this.field_y, -1);
        this.setBounds((byte) -31, 496, var6 + 55 + var3, 0, 0);
    }

    public final void onMoreSuggestionsRequested(int param0) {
        ((tf) (this.field_G.getValidationSource((byte) 69))).b((byte) -69);
        if (param0 != 10000536) {
          this.field_E = (ValidatedTextInputWidget) null;
        }
    }

    private final int addFieldWithHelp(int param0, int param1, UiWidget param2, int param3, int param4, String param5, String param6) {
        RuntimeException var8 = null;
        ValidationMessageWidget var9 = null;
        jsa var10 = null;
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
          var10 = new jsa(20, param0, param3 + 120, 25, param2, false, 120, 3, KeySwitchComponent.field_J, 16777215, param6);
          this.addChild(var10, -1);
          var9 = new ValidationMessageWidget(((ValidationProvider) ((Object) param2)).getValidationSource((byte) 120), param5, 126, var10.field_p + param0, param3 + 50, param4);
          var9.field_h = (WidgetListener) (this);
          this.addChild(var9, -1);
          if (param1 >= 66) {
            stackIn_4_0 = var9.field_p + var10.field_p;
            return stackIn_4_0;
          }
          stackIn_2_0 = 37;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("mr.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',');
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
          throw tba.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean handleKeyInput(char param0, UiWidget param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, param1, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_5_0 = this.focusPreviousChild(param1, (byte) -79);
            return stackIn_5_0;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_9_0 = this.focusNextChild(param1, (byte) -9);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("mr.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final String linkStylePrefix(int param0) {
        if (param0 != 170) {
          UiWidget var3 = (UiWidget) null;
          this.updatePointerState(27, -27, (UiWidget) null, -94);
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean g(int param0) {
        if (!this.validateField((byte) -10, this.field_G)) {
          return false;
        }
        if (!this.validateField((byte) -10, this.field_z)) {
          return false;
        }
        if (!this.validateField((byte) -10, this.field_J)) {
          return false;
        }
        if (!this.validateField((byte) -10, this.field_E)) {
          return false;
        }
        if (!this.validateField((byte) -10, this.field_C)) {
          return false;
        }
        if (!this.validateField((byte) -10, this.field_I)) {
          return false;
        }
        if (param0 == 1877) {
          return true;
        }
        this.field_E = (ValidatedTextInputWidget) null;
        return true;
    }

    private final boolean validateField(byte param0, ValidationProvider param1) {
        ValidationSource var3 = null;
        RuntimeException var3_ref = null;
        it var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -10) {
            return true;
          }
          var3 = param1.getValidationSource((byte) 127);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getState(param0 ^ 4656);
          if (var4 == fp.field_c) {
            return false;
          }
          if (BevelOperator.field_p == var4) {
            return false;
          }
          if (ColourRowCache.field_d != var4) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("mr.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void updatePointerState(int param0, int param1, UiWidget param2, int param3) {
        try {
          super.updatePointerState(param0, param1, param2, param3);
          this.field_F.field_y = this.g(param1 - 2095275);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "mr.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final void a(String param0, int param1) {
        ValidatedTextInputWidget var3 = null;
        String var4 = null;
        try {
          var3 = this.field_G;
          var4 = param0;
          if (param1 <= 18) {
            this.field_A = (HotspotTextWidget) null;
          }
          ((TextInputWidget) ((Object) var3)).setText(false, -16719, var4);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "mr.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 == 0) {
          field_w = null;
          field_H = null;
          dayNames = null;
          return;
        }
        AccountRegistrationPanel.a((byte) 10);
        field_w = null;
        field_H = null;
        dayNames = null;
    }

    private final String e(int param0) {
        int var2 = 105 % ((param0 - 83) / 38);
        return "</col></u>";
    }

    private final int a(String param0, String param1, UiWidget param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        HotspotTextWidget var8 = null;
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
          if (param3 != -3) {
            var8 = (HotspotTextWidget) null;
            this.onHotspotAction((HotspotTextWidget) null, -33, -81, -72);
          }
          stackIn_3_0 = this.addFieldWithHelp(param5, param3 + 112, param2, param4, 35, param1, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("mr.N(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static Weapon a(byte param0) {
        Weapon var1 = new Weapon();
        if (param0 > 123) {
          var1.effect = new Effect(1, 3);
          var1.effect.setDeathMessageIndex(1, 12);
          var1.field_n = 655360;
          var1.maxAmmo = 250;
          var1.field_k = 12;
          var1.field_b = 3;
          var1.field_y = false;
          var1.field_h = 2;
          var1.field_a = 524288;
          var1.field_s = 1024;
          var1.field_d = 2;
          var1.field_l = 2097152;
          return var1;
        }
        AccountRegistrationPanel.a(-0.43077895045280457f, 0.6055110096931458f, true, 1.4660576581954956f);
        var1.effect = new Effect(1, 3);
        var1.effect.setDeathMessageIndex(1, 12);
        var1.field_n = 655360;
        var1.maxAmmo = 250;
        var1.field_k = 12;
        var1.field_b = 3;
        var1.field_y = false;
        var1.field_h = 2;
        var1.field_a = 524288;
        var1.field_s = 1024;
        var1.field_d = 2;
        var1.field_l = 2097152;
        return var1;
    }

    public final void onButtonActivated(int param0, int param1, FocusableWidget param2, int param3, byte param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_B == param2) {
            gqa.a((byte) 70);
          } else {
            if (param2 == this.field_F) {
              discarded$1 = this.submitRegistration(-1);
            }
          }
          if (param4 > 44) {
            return;
          }
          this.field_J = (ValidatedTextInputWidget) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("mr.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int addValidatedField(UiWidget param0, int param1, byte param2, String param3, int param4) {
        RuntimeException var6 = null;
        mha var7 = null;
        jsa var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new jsa(20, param1, 120 + param4, 25, param0, false, 120, 3, KeySwitchComponent.field_J, 16777215, param3);
          this.addChild(var8, -1);
          if (param2 < 51) {
            field_w = (SoundEventPlayer) null;
          }
          var7 = new mha(((ValidationProvider) ((Object) param0)).getValidationSource((byte) 106));
          this.addChild(var7, -1);
          var7.setBounds((byte) -31, 15, 15, 3 + (var8.field_m + var8.field_i), var8.field_n + (var8.field_p - 15 >> 1));
          stackIn_3_0 = var8.field_p;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("mr.AA(");
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
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_H = "Creep carefully over snakes.";
        dayNames = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
