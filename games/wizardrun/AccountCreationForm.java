/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationForm extends WidgetContainer implements HotspotClickListener, ButtonActionListener, NameSelectionListener {
    private TextButton field_V;
    private ValidatedTextField field_O;
    private ValidatedTextField field_F;
    private ValidatedTextField field_H;
    NameSuggestionsPanel field_J;
    static String field_Q;
    static QuickChatDynamicCommand field_U;
    private ValidatedTextField field_S;
    private ToggleButton field_E;
    private ValidatedTextField field_G;
    static String field_R;
    private HotspotTextWidget field_L;
    private TextButton field_I;
    static String field_M;
    static String field_K;
    private ValidatedTextField field_P;
    static int field_T;
    static IsaacPacketBuffer field_N;

    public final void invalidateNameAvailability(int param0) {
        if (param0 != 2147483647) {
          return;
        }
        ((DisplayNameValidator) (this.field_G.getValidator((byte) -114))).clearCachedNameResult(113);
    }

    public final void onNameSelected(String param0, byte param1) {
        ValidatedTextField var3 = null;
        String var4 = null;
        try {
          var3 = this.field_G;
          var4 = param0;
          if (param1 <= 61) {
            TextButton var5 = (TextButton) null;
            this.onButtonAction(122, (TextButton) null, -97, 3, -8);
          }
          ((EditableTextWidget) ((Object) var3)).setText(-1, false, var4);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "nk.CB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final boolean h(byte param0) {
        if (!this.g(-50)) {
          return false;
        }
        int var2 = -1;
        if (param0 <= 16) {
          return true;
        }
        try {
          var2 = Integer.parseInt(this.field_P.text);
        } catch (NumberFormatException numberFormatException) {
        }
        return NameCheckHelpers.a(this.field_G.text, this.field_E.selected, this, 0, var2, this.field_S.text, this.field_F.text);
    }

    private final boolean g(int param0) {
        if (param0 != -50) {
          return true;
        }
        if (!this.a((byte) 95, (ValidatorProvider) (this.field_G))) {
          return false;
        }
        if (!this.a((byte) 118, (ValidatorProvider) (this.field_F))) {
          return false;
        }
        if (!this.a((byte) 92, (ValidatorProvider) (this.field_H))) {
          return false;
        }
        if (!this.a((byte) 111, (ValidatorProvider) (this.field_S))) {
          return false;
        }
        if (!this.a((byte) 119, (ValidatorProvider) (this.field_O))) {
          return false;
        }
        if (this.a((byte) 105, (ValidatorProvider) (this.field_P))) {
          return true;
        }
        return false;
    }

    private final String d(boolean param0) {
        if (param0) {
          this.field_F = (ValidatedTextField) null;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final int a(byte param0, UiWidget param1, String param2, int param3, int param4, String param5) {
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
          if (param0 != 4) {
            this.field_F = (ValidatedTextField) null;
          }
          stackIn_3_0 = this.a(35, param2, param1, 7501, param3, param4, param5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("nk.WA(").append(param0).append(',');
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

    private final int a(int param0, UiWidget param1, boolean param2, String param3, int param4) {
        RuntimeException var6 = null;
        ValidationIndicator var7 = null;
        LabeledField var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            field_U = (QuickChatDynamicCommand) null;
          }
          var8 = new LabeledField(20, param4, 120 + param0, 25, param1, false, 120, 3, Crc32Helpers.field_b, 16777215, param3);
          this.addChild((UiWidget) (var8), (byte) 39);
          var7 = new ValidationIndicator(((ValidatorProvider) ((Object) param1)).getValidator((byte) 120));
          this.addChild((UiWidget) (var7), (byte) 28);
          var7.setBounds(119, var8.y + (var8.height - 15 >> 1), 15, 15, 3 + var8.x + var8.width);
          stackIn_3_0 = var8.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("nk.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    public final void onButtonAction(int param0, TextButton param1, int param2, int param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != this.field_I) {
            if (param1 == this.field_V) {
              discarded$1 = this.h((byte) 107);
            }
          } else {
            AchievementSubmission.showLoginChoices((byte) -97);
          }
          if (param0 == -18905) {
            return;
          }
          this.field_I = (TextButton) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("nk.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(int param0, String param1, UiWidget param2, int param3, int param4, int param5, String param6) {
        RuntimeException var8 = null;
        ValidationHelpWidget var9 = null;
        LabeledField var10 = null;
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
          var10 = new LabeledField(20, param5, 120 + param4, 25, param2, false, 120, 3, Crc32Helpers.field_b, 16777215, param1);
          this.addChild((UiWidget) (var10), (byte) 39);
          var9 = new ValidationHelpWidget(((ValidatorProvider) ((Object) param2)).getValidator((byte) 109), param6, 126, param5 + var10.height, param4 + 50, param0);
          if (param3 != 7501) {
            this.field_P = (ValidatedTextField) null;
          }
          var9.listener = (WidgetListener) (this);
          this.addChild((UiWidget) (var9), (byte) 39);
          stackIn_3_0 = var9.height + var10.height;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("nk.FA(").append(param0).append(',');
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final int a(int param0, boolean param1, int param2, UiWidget param3, String param4) {
        LabeledField var6 = null;
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
          if (!param1) {
            stackIn_2_0 = -4;
            return stackIn_2_0;
          }
          var6 = new LabeledField(20, param0, param2 + 120, 25, param3, false, 120, 3, Crc32Helpers.field_b, 16777215, param4);
          this.addChild((UiWidget) (var6), (byte) 62);
          stackIn_4_0 = var6.height;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("nk.UA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_R = null;
        field_K = null;
        field_M = null;
        field_N = null;
        field_Q = null;
        field_U = null;
        if (param0 != -1) {
          field_N = (IsaacPacketBuffer) null;
        }
    }

    public AccountCreationForm() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.field_G = new ValidatedTextField("", (WidgetListener) null, 12);
        this.field_F = new ValidatedTextField("", (WidgetListener) null, 100);
        this.field_H = new ValidatedTextField("", (WidgetListener) null, 100);
        this.field_S = new ValidatedTextField("", (WidgetListener) null, 20);
        this.field_O = new ValidatedTextField("", (WidgetListener) null, 20);
        this.field_P = new ValidatedTextField("", (WidgetListener) null, 3);
        int var1 = 1;
        this.field_E = new ToggleButton("", (WidgetListener) null, var1 != 0);
        this.field_V = new TextButton(UiThemeSetupHelpers.field_d, (WidgetListener) null);
        this.field_I = new TextButton(SpriteAlphaState.field_c, (WidgetListener) null);
        this.field_G.tooltip = DiskCacheWorker.field_a;
        this.field_F.tooltip = SettingsCookieReader.field_c;
        this.field_H.tooltip = LogoAnimationLoader.field_e;
        this.field_S.tooltip = GameShell.field_v;
        this.field_O.tooltip = GameMenu.field_s;
        this.field_P.tooltip = GameGraphicsResources.field_c;
        this.field_E.tooltip = Js5Index.field_o;
        this.field_G.setValidator(0, new DisplayNameValidator(this.field_G));
        this.field_F.setValidator(0, new EmailAddressValidator(this.field_F));
        this.field_H.setValidator(0, new ConfirmedEmailValidator(this.field_H, this.field_F));
        this.field_S.setValidator(0, new PasswordValidator(this.field_S, this.field_G, this.field_F));
        this.field_O.setValidator(0, new MatchingTextValidator(this.field_O, this.field_S));
        this.field_P.setValidator(0, new AgeValidator(this.field_P));
        this.field_V.field_B = false;
        this.field_V.renderer = (WidgetRenderer) ((Object) new SpriteButtonPainter());
        this.field_I.renderer = (WidgetRenderer) ((Object) new HyperlinkPainter());
        this.field_G.renderer = (WidgetRenderer) ((Object) new FramedButtonPainter(10000536));
        FramedButtonPainter dupTemp$0 = new FramedButtonPainter(10000536);
        this.field_H.renderer = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_F.renderer = (WidgetRenderer) ((Object) dupTemp$0);
        this.field_P.renderer = (WidgetRenderer) ((Object) new FramedButtonPainter(10000536));
        this.field_E.renderer = (WidgetRenderer) ((Object) new IconButtonPainter());
        PasswordFieldPainter dupTemp$1 = new PasswordFieldPainter(10000536);
        this.field_O.renderer = (WidgetRenderer) ((Object) dupTemp$1);
        this.field_S.renderer = (WidgetRenderer) ((Object) dupTemp$1);
        String var2 = WeightedLruCache.formatPlaceholders(new String[]{this.d(false), this.g((byte) 2)}, (byte) 76, NineSliceFrame.field_b);
        int var3 = 20;
        var3 = var3 + this.a(var3, true, 170, this.field_F, NameAvailabilityFactory.field_d);
        var3 = var3 + (5 + this.a(20, ErrorReportingHelpers.field_b, this.field_H, 7501, 170, var3, ""));
        var3 = var3 + this.a(var3, true, 170, this.field_S, WhirlpoolHasher.field_d);
        var3 = var3 + (this.a((byte) 4, this.field_O, RasterBuffer.field_i, 170, var3, LabeledField.field_H) + 5);
        var3 = var3 + (5 + this.a((byte) 4, this.field_G, AccountConsentPanel.field_E, 170, var3, MonotonicClockHelpers.field_b));
        var3 = var3 + this.a(170, this.field_P, true, Base37Codec.field_a, var3);
        LabeledField var4 = new LabeledField(46, var3, -90 + this.width, 25, this.field_E, true, -120 + this.width, 5, ThreePieceFrameHelpers.field_b, 11579568, SettingsCookieReader.field_e);
        this.addChild((UiWidget) (var4), (byte) 58);
        var3 = var3 + var4.height;
        WidgetPainter var5 = new WidgetPainter(Crc32Helpers.field_b, 0, 0, 0, 0, 16777215, -1, 0, 0, Crc32Helpers.field_b.field_M, -1, 2147483647, true);
        this.field_L = new HotspotTextWidget(var2, var5);
        this.field_L.tooltip = "";
        this.field_L.setHotspotTooltip(1, field_R, 0);
        this.field_L.setHotspotTooltip(1, field_R, 1);
        this.field_L.listener = (WidgetListener) (this);
        this.field_L.setBoundsToPreferredHeight(var3, (byte) 61, this.width - 90, 46);
        var3 = var3 + (this.field_L.height + 15);
        this.addChild((UiWidget) (this.field_L), (byte) 98);
        int var6 = 4;
        int var7 = 200;
        this.field_V.setBounds(110, var3, 40, var7, 496 - var7 >> 1);
        this.field_I.setBounds(125, 15 + var3, 40, 60, 3 + var6);
        this.field_I.listener = (WidgetListener) (this);
        this.field_V.listener = (WidgetListener) (this);
        this.addChild((UiWidget) (this.field_V), (byte) 108);
        this.addChild((UiWidget) (this.field_I), (byte) 121);
        this.field_J = new NameSuggestionsPanel((NameSelectionListener) (this));
        this.field_J.setBounds(118, 20 + this.field_G.y, 150, -this.field_G.width + (-this.field_G.x + this.width - 60), this.field_G.width + this.field_G.x + 60);
        this.addChild((UiWidget) (this.field_J), (byte) 34);
        this.setBounds(115, 0, 55 + (var3 + var6), 496, 0);
    }

    private final boolean a(byte param0, ValidatorProvider param1) {
        Validator var3 = null;
        RuntimeException var3_ref = null;
        ValidationState var4 = null;
        String var5 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.getValidator((byte) -106);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getState(true);
          if (DisplayNameSyntaxHelpers.field_c == var4) {
            return false;
          }
          if (AccountFormTextHelpers.field_c == var4) {
            return false;
          }
          if (param0 < 59) {
            var5 = (String) null;
            this.onNameSelected((String) null, (byte) -6);
          }
          if (PacketBuffer.field_o != var4) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("nk.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public final void onHotspotAction(int param0, HotspotTextWidget param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = wizardrun.field_H;
        try {
          if (param0 != 0) {
            if (1 == param0) {
              BrowserCookieHelpers.setAccountWorkflowResult("privacy.ws", 12);
            } else {
              if (param0 == 2) {
                BrowserCookieHelpers.setAccountWorkflowResult("conduct.ws", 12);
              }
            }
          } else {
            BrowserCookieHelpers.setAccountWorkflowResult("terms.ws", 12);
          }
          var5_int = -16 % ((36 - param3) / 53);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("nk.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final String g(byte param0) {
        if (param0 < 1) {
          return (String) null;
        }
        return "</col></u>";
    }

    final boolean handleKeyPress(char param0, int param1, byte param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyPress(param0, param1, (byte) -106, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_5_0 = this.focusPreviousChild((byte) -117, param3);
            return stackIn_5_0;
          }
          if (param1 == 99) {
            stackIn_8_0 = this.focusNextChild(param3, 1);
            return stackIn_8_0;
          }
          if (param2 < -96) {
            return false;
          }
          field_N = (IsaacPacketBuffer) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("nk.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void updateInput(int param0, int param1, int param2, UiWidget param3) {
        try {
          super.updateInput(param0, param1, param2, param3);
          this.field_V.field_B = this.g(param0 - 10000586);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "nk.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_R = "Open in popup window";
        field_Q = "Names can only contain letters, numbers, spaces and underscores";
        field_U = new QuickChatDynamicCommand(12, 0, 1, 0);
        field_K = "Resume Game";
    }
}
