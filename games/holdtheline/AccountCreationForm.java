/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationForm extends WidgetContainer implements HotspotClickListener, ButtonActionListener, NameSelectionListener {
    private CheckboxWidget field_J;
    private ValidatedTextField field_P;
    private TextHotspotWidget field_O;
    private ValidatedTextField field_G;
    private ValidatedTextField field_K;
    private ValidatedTextField field_T;
    private TextButton field_N;
    static ll field_S;
    private TextButton field_Q;
    private ValidatedTextField field_L;
    static int field_H;
    private ValidatedTextField field_M;
    static SpriteAsset field_F;
    NameSuggestionsPanel field_R;
    static int field_I;

    public final void a(String param0, int param1) {
        ValidatedTextField var3 = null;
        String var4 = null;
        try {
          if (param1 != 25) {
            this.field_N = (TextButton) null;
          }
          var3 = this.field_G;
          var4 = param0;
          ((EditableTextField) ((Object) var3)).a(false, var4, 1471);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "a.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int a(String param0, boolean param1, int param2, UiWidget param3, String param4, int param5, int param6) {
        RuntimeException var8 = null;
        ValidationHelpWidget var9 = null;
        LabeledField var10 = null;
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
          var10 = new LabeledField(20, param5, param2 + 120, 25, param3, param1, 120, 3, IntrusiveNode.field_g, 16777215, param4);
          this.addChild(true, var10);
          var9 = new ValidationHelpWidget(((ValidatorProvider) ((Object) param3)).getValidator(1), param0, 126, var10.height + param5, 50 + param2, param6);
          var9.listener = (WidgetListener) (this);
          this.addChild(true, var9);
          stackIn_1_0 = var10.height + var9.height;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("a.G(");
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
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean h(int param0) {
        if (!this.a((ValidatorProvider) (this.field_G), 16777215)) {
          return false;
        }
        if (!this.a((ValidatorProvider) (this.field_L), 16777215)) {
          return false;
        }
        if (!this.a((ValidatorProvider) (this.field_K), 16777215)) {
          return false;
        }
        if (!this.a((ValidatorProvider) (this.field_T), 16777215)) {
          return false;
        }
        if (!this.a((ValidatorProvider) (this.field_P), 16777215)) {
          return false;
        }
        if (!this.a((ValidatorProvider) (this.field_M), 16777215)) {
          return false;
        }
        if (param0 == 40) {
          return true;
        }
        ValidatorProvider var3 = (ValidatorProvider) null;
        boolean discarded$0 = this.a((ValidatorProvider) null, 100);
        return true;
    }

    public final void onHotspotClick(TextHotspotWidget param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = HoldTheLine.field_D;
        try {
          if (param2 != -106) {
            field_S = (ll) null;
          }
          if (0 == param1) {
            oc.a(16711680, "terms.ws");
            return;
          }
          if (param1 == 1) {
            oc.a(param2 + 16711786, "privacy.ws");
            return;
          }
          if (2 != param1) {
            return;
          }
          oc.a(16711680, "conduct.ws");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("a.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onButtonAction(int param0, TextButton param1, int param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_N == param1) {
            NodeHashTable.a((byte) 44);
          } else {
            if (param1 == this.field_Q) {
              discarded$1 = this.h((byte) 90);
            }
          }
          if (param2 == -4) {
            return;
          }
          this.field_R = (NameSuggestionsPanel) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("a.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void updateHover(int param0, UiWidget param1, int param2, byte param3) {
        try {
          super.updateHover(param0, param1, param2, param3);
          this.field_Q.field_D = this.h(40);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "a.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public AccountCreationForm() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.field_G = new ValidatedTextField("", (WidgetListener) null, 12);
        this.field_L = new ValidatedTextField("", (WidgetListener) null, 100);
        this.field_K = new ValidatedTextField("", (WidgetListener) null, 100);
        this.field_T = new ValidatedTextField("", (WidgetListener) null, 20);
        this.field_P = new ValidatedTextField("", (WidgetListener) null, 20);
        this.field_M = new ValidatedTextField("", (WidgetListener) null, 3);
        int var1 = 1;
        this.field_J = new CheckboxWidget("", (WidgetListener) null, var1 != 0);
        this.field_Q = new TextButton(CheckboxRenderer.field_v, (WidgetListener) null);
        this.field_N = new TextButton(um.field_c, (WidgetListener) null);
        this.field_G.tooltip = PolarSortVector.field_f;
        this.field_L.tooltip = d.field_a;
        this.field_K.tooltip = lj.field_e;
        this.field_T.tooltip = DiskCacheStore.field_c;
        this.field_P.tooltip = GameKeyHandler.field_d;
        this.field_M.tooltip = StandardContentTransitionDialog.field_mb;
        this.field_J.tooltip = DropTargetWidget.field_I;
        this.field_G.a((byte) 64, new DisplayNameValidator(this.field_G));
        this.field_L.a((byte) 56, new EmailAddressValidator(this.field_L));
        this.field_K.a((byte) 58, new EmailConfirmationValidator(this.field_K, this.field_L));
        this.field_T.a((byte) 65, new PasswordValidator(this.field_T, this.field_G, this.field_L));
        this.field_P.a((byte) 55, new MatchingTextValidator(this.field_P, this.field_T));
        this.field_M.a((byte) 45, new AgeValidator(this.field_M));
        this.field_Q.field_D = false;
        this.field_Q.renderer = (WidgetRenderer) ((Object) new SpriteButtonRenderer());
        this.field_N.renderer = (WidgetRenderer) ((Object) new LinkWidgetRenderer());
        this.field_G.renderer = (WidgetRenderer) ((Object) new TextFieldRenderer(10000536));
        TextFieldRenderer dupTemp$0 = new TextFieldRenderer(10000536);
        this.field_K.renderer = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_L.renderer = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_M.renderer = (WidgetRenderer) ((Object) new TextFieldRenderer(10000536));
        this.field_J.renderer = (WidgetRenderer) ((Object) new IconToggleRenderer());
        PasswordFieldRenderer dupTemp$1 = new PasswordFieldRenderer(10000536);
        this.field_P.renderer = (WidgetRenderer) ((Object) dupTemp$1);
        this.field_T.renderer = (WidgetRenderer) ((Object) dupTemp$1);
        String var2 = LoginCredentials.substituteIndexedTokens(DropTargetWidget.field_F, new String[]{this.a(false), this.g((byte) 105)}, true);
        int var3 = 20;
        var3 = var3 + this.a(170, this.field_L, 25, var3, cm.field_c);
        var3 = var3 + (5 + this.a("", false, 170, this.field_K, ByteStorage.field_e, var3, 20));
        var3 = var3 + this.a(170, this.field_T, 25, var3, EmailValidationResult.field_f);
        var3 = var3 + (this.a(170, 21411, this.field_P, TextHotspotRange.field_o, SocialListEntry.field_ib, var3) + 5);
        var3 = var3 + (this.a(170, 21411, this.field_G, ArchiveLoadStage.field_h, sh.field_a, var3) + 5);
        var3 = var3 + this.a(170, (byte) -124, ImageProducerRasterBuffer.field_o, var3, this.field_M);
        LabeledField var4 = new LabeledField(46, var3, -90 + this.width, 25, this.field_J, true, -120 + this.width, 5, SpriteButtonRenderer.field_w, 11579568, TextLayout.field_c);
        this.addChild(true, var4);
        var3 = var3 + var4.height;
        TextWidgetStyle var5 = new TextWidgetStyle(IntrusiveNode.field_g, 0, 0, 0, 0, 16777215, -1, 0, 0, IntrusiveNode.field_g.ascent, -1, 2147483647, true);
        this.field_O = new TextHotspotWidget(var2, var5);
        this.field_O.tooltip = "";
        this.field_O.a(0, m.field_d, true);
        this.field_O.a(1, m.field_d, true);
        this.field_O.listener = (WidgetListener) (this);
        this.field_O.a(-90 + this.width, (byte) 111, var3, 46);
        var3 = var3 + (15 + this.field_O.height);
        this.addChild(true, this.field_O);
        int var6 = 4;
        int var7 = 200;
        this.field_Q.setBounds(496 - var7 >> 1, (byte) 122, var3, 40, var7);
        this.field_N.setBounds(3 + var6, (byte) 122, var3 + 15, 40, 60);
        this.field_N.listener = (WidgetListener) (this);
        this.field_Q.listener = (WidgetListener) (this);
        this.addChild(true, this.field_Q);
        this.addChild(true, this.field_N);
        this.field_R = new NameSuggestionsPanel((NameSelectionListener) (this));
        this.field_R.setBounds(this.field_G.x + this.field_G.width + 60, (byte) 122, this.field_G.y + 20, 150, -60 + this.width - (this.field_G.x + this.field_G.width));
        this.addChild(true, this.field_R);
        this.setBounds(0, (byte) 122, 0, var6 + (55 + var3), 496);
    }

    private final String a(boolean param0) {
        if (param0) {
          field_I = -59;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final String g(byte param0) {
        if (param0 <= 90) {
          this.field_L = (ValidatedTextField) null;
          return "</col></u>";
        }
        return "</col></u>";
    }

    private final boolean h(byte param0) {
        if (!this.h(40)) {
          return false;
        }
        if (param0 <= 28) {
          this.field_N = (TextButton) null;
        }
        int var2 = -1;
        try {
          var2 = Integer.parseInt(this.field_M.text);
        } catch (NumberFormatException numberFormatException) {
        }
        return IntrusiveNode.a(this.field_T.text, -23000, this.field_J.field_B, this.field_G.text, this, this.field_L.text, var2);
    }

    public static void clearSharedReferences(byte param0) {
        field_S = null;
        if (param0 != -16) {
          field_I = -2;
          field_F = null;
          return;
        }
        field_F = null;
    }

    private final boolean a(ValidatorProvider param0, int param1) {
        Validator var3 = null;
        RuntimeException var3_ref = null;
        ValidationState var4 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.getValidator(param1 - 16777214);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getValidationState(-7447);
          if (var4 == LinearPointPath.field_k) {
            return false;
          }
          if (var4 == hh.field_d) {
            return false;
          }
          if (SpriteState.field_q == var4) {
            return false;
          }
          if (param1 == 16777215) {
            return true;
          }
          this.field_O = (TextHotspotWidget) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("a.L(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int param0, int param1, UiWidget param2, String param3, String param4, int param5) {
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
          if (param1 != 21411) {
            this.field_O = (TextHotspotWidget) null;
          }
          stackIn_3_0 = this.a(param3, false, param0, param2, param4, param5, 35);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("a.Q(").append(param0).append(',').append(param1).append(',');
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
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    final boolean handleKeyPress(UiWidget param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyPress(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.focusPreviousChild(param0, -1);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.focusNextChild(param0, 115);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("a.T(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(int param0, UiWidget param1, int param2, int param3, String param4) {
        LabeledField var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new LabeledField(20, param3, param0 + 120, param2, param1, false, 120, 3, IntrusiveNode.field_g, 16777215, param4);
          this.addChild(true, var6);
          stackIn_1_0 = var6.height;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_4_0 = var6_ref;
          stackIn_4_1 = new StringBuilder().append("a.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final int a(int param0, byte param1, String param2, int param3, UiWidget param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        ValidationIndicator var7 = null;
        String var8 = null;
        LabeledField var9 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new LabeledField(20, param3, 120 + param0, 25, param4, false, 120, 3, IntrusiveNode.field_g, 16777215, param2);
          if (param1 != -124) {
            var8 = (String) null;
            discarded$1 = this.a(71, (UiWidget) null, -15, -54, (String) null);
          }
          this.addChild(true, var9);
          var7 = new ValidationIndicator(((ValidatorProvider) ((Object) param4)).getValidator(param1 + 125));
          this.addChild(true, var7);
          var7.setBounds(var9.width + var9.x + 3, (byte) 122, var9.y + (-15 + var9.height >> 1), 15, 15);
          stackIn_3_0 = var9.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("a.O(").append(param0).append(',').append(param1).append(',');
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
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final void a(byte param0) {
        if (param0 > 124) {
          ((DisplayNameValidator) (this.field_G.getValidator(1))).invalidateAvailability(true);
          return;
        }
        this.field_P = (ValidatedTextField) null;
        ((DisplayNameValidator) (this.field_G.getValidator(1))).invalidateAvailability(true);
    }

    static {
        field_S = new ll();
        field_I = -1;
    }
}
