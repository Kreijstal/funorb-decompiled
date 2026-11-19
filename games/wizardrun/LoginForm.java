/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginForm extends WidgetContainer implements TextChangeListener, ButtonActionListener {
    private boolean field_O;
    private boolean field_P;
    private EditableTextWidget field_Q;
    private TextButton field_M;
    static Sprite[] field_E;
    private String field_F;
    private TextButton field_G;
    private boolean field_J;
    private EditableTextWidget field_K;
    static String field_N;
    static String field_I;
    static int field_L;
    private TextButton field_H;

    final void setLoginIdentifier(int param0, String param1) {
        EditableTextWidget var3 = null;
        String var4 = null;
        try {
          var3 = this.field_K;
          if (param0 != 5990) {
            field_E = (Sprite[]) null;
          }
          var4 = param1;
          var3.setText(-1, false, var4);
          this.field_Q.clearText(true);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "qc.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onTextChanged(EditableTextWidget param0, int param1) {
        try {
          if (param1 != 5) {
            TextButton var4 = (TextButton) null;
            this.onButtonAction(56, (TextButton) null, 121, 39, 55);
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "qc.FA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void submitLogin(int param0) {
        if (param0 != 4210752) {
          return;
        }
        if (FullscreenController.isGameLoginFlow(-1) ||
          !(0 >= this.field_K.text.length()) &&
          !(this.field_Q.text.length() <= 0)) {
          UiThemeSetupHelpers.beginLogin(this.field_Q.text, this.field_K.text, -124);
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        if (this.field_F != null) {
          Crc32Helpers.field_b.drawParagraph(this.field_F, 20 + (param0 + this.x), 15 + (this.y + param3), this.width - 40, this.height, 16777215, -1, 1, 0, Crc32Helpers.field_b.field_M);
        }
        if (null != this.field_M) {
          SoftwareRasterizer.drawHorizontalLine(10 + param0, 134 + param3, this.width - 20, 4210752);
        }
        super.drawLayer(param0, param1, param2, param3);
    }

    final static Class resolveReflectionType(String param0, byte param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_12_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_23_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param1 != -39) {
            stackIn_6_0 = (Class) null;
            return stackIn_6_0;
          }
          if (param0.equals("I")) {
            stackIn_9_0 = Integer.TYPE;
            return stackIn_9_0;
          }
          if (param0.equals("S")) {
            stackIn_12_0 = Short.TYPE;
            return stackIn_12_0;
          }
          if (param0.equals("J")) {
            stackIn_16_0 = Long.TYPE;
            return stackIn_16_0;
          }
          if (param0.equals("Z")) {
            stackIn_20_0 = Boolean.TYPE;
            return stackIn_20_0;
          }
          if (param0.equals("F")) {
            stackIn_23_0 = Float.TYPE;
            return stackIn_23_0;
          }
          if (param0.equals("D")) {
            stackIn_26_0 = Double.TYPE;
            return stackIn_26_0;
          }
          if (!param0.equals("C")) {
            return Class.forName(param0);
          }
          stackIn_30_0 = Character.TYPE;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("qc.JA(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean handleKeyPress(char param0, int param1, byte param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyPress(param0, param1, (byte) -125, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.focusPreviousChild((byte) -117, param3);
            return stackIn_6_0;
          }
          if (param2 > -96) {
            return true;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_12_0 = this.focusNextChild(param3, 1);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("qc.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final void onTextSubmitted(int param0, EditableTextWidget param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_K == param1) {
            this.field_Q.requestFocus((UiWidget) (this), 8);
          }
          if (this.field_Q == param1) {
            this.submitLogin(4210752);
          }
          if (param0 > -111) {
            this.field_O = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("qc.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void onButtonAction(int param0, TextButton param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = wizardrun.field_H;
        try {
          if (param0 != -18905) {
            field_E = (Sprite[]) null;
          }
          if (this.field_H == param1) {
            this.submitLogin(4210752);
          } else {
            if (this.field_M != param1) {
              if (this.field_G == param1) {
                if (this.field_J) {
                  ProxySocketConnector.showAccountWorkflowError(param0 ^ 12849);
                } else {
                  if (!this.field_O) {
                    EmailCheckRequest.requestAccountCreation((byte) -89);
                  } else {
                    AchievementSubmission.showLoginChoices((byte) -97);
                  }
                }
              }
            } else {
              UiThemeSetupHelpers.showAccountCreationForm(param0 ^ 18904);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("qc.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void clearCredentials(int param0) {
        this.field_K.clearText(true);
        this.field_Q.clearText(true);
        int var2 = 127 % ((-20 - param0) / 50);
    }

    LoginForm(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetRenderer) null);
        LabeledField dupTemp$0 = null;
        LabeledField dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        TextButton stackIn_18_1 = null;
        TextButton stackIn_18_2 = null;
        TextButton stackIn_19_1 = null;
        TextButton stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        SpriteButtonPainter var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        LoginMethodPreference var9 = null;
        LabeledField var12 = null;
        LabeledField var13 = null;
        try {
          this.field_F = param1;
          stackIn_4_1 = (param4);
          this.field_O = stackIn_4_1;
          stackIn_7_1 = (param2);
          this.field_J = stackIn_7_1;
          stackIn_10_1 = (param3);
          this.field_P = stackIn_10_1;
          if (this.field_J && (this.field_P ||
            this.field_O)) {
            throw new IllegalStateException();
          }
          this.field_K = (EditableTextWidget) ((Object) new ValidatedTextField(param0, (WidgetListener) (this), 100));
          this.field_Q = (EditableTextWidget) ((Object) new ValidatedTextField("", (WidgetListener) (this), 20));
          if (!this.field_J) {
            this.field_H = new TextButton(ByteStorage.field_a, (WidgetListener) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.field_O) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = IsaacRandom.field_h;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = DualLinkDeque.field_b;
            }
            this.field_G = new TextButton(stackIn_19_3, (WidgetListener) null);
            if (this.field_P) {
              this.field_M = new TextButton(WhirlpoolHasher.field_h, (WidgetListener) (this));
            }
          } else {
            this.field_H = new TextButton(LoadingMessageHelpers.field_a, (WidgetListener) null);
            this.field_G = new TextButton(ReflectionCheck.field_q, (WidgetListener) null);
            this.field_K.field_B = false;
          }
          this.field_K.renderer = (WidgetRenderer) ((Object) new FramedButtonPainter(10000536));
          this.field_Q.renderer = (WidgetRenderer) ((Object) new PasswordFieldPainter(10000536));
          var6 = new SpriteButtonPainter();
          this.field_H.renderer = (WidgetRenderer) ((Object) var6);
          if (null != this.field_G) {
            this.field_G.renderer = (WidgetRenderer) ((Object) var6);
          }
          if (this.field_M != null) {
            this.field_M.renderer = (WidgetRenderer) ((Object) var6);
          }
          this.field_K.tooltip = MouseInputHandler.field_a;
          if (this.field_M != null) {
            this.field_M.tooltip = DelayedServerPacket.field_i;
          }
          if (!this.field_J) {
            if (this.field_O) {
              this.field_G.tooltip = ProxyAuthenticationException.field_a;
              this.field_G.renderer = (WidgetRenderer) ((Object) new HyperlinkPainter());
            } else {
              this.field_G.renderer = (WidgetRenderer) ((Object) new HyperlinkPainter());
            }
          } else {
            this.field_G.tooltip = BrowserUrlLauncher.field_a;
          }
          this.y = 15;
          var7 = Crc32Helpers.field_b;
          if (null != this.field_F) {
            this.y = this.y + (5 + var7.measureWrappedHeight(this.field_F, -40 + this.width, var7.field_M));
          }
          var8 = ScoreSubmission.field_j;
          var9 = IndexedSpriteState.readLastLoginMethod(DisplayNameValidator.getActiveApplet(1), (byte) 48);
          if (var9 == StripedProgressBar.field_C) {
            var8 = ProgressSubmission.field_q;
          } else {
            if (var9 == IndexedSpriteState.field_e) {
              var8 = FriendOrderingHelpers.field_b;
            }
          }
          dupTemp$0 = new LabeledField(10, this.y, -20 + this.width, 25, this.field_K, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.addChild((UiWidget) (dupTemp$0), (byte) 57);
          this.y = this.y + (5 + ((UiWidget) ((Object) var12)).height);
          dupTemp$1 = new LabeledField(10, this.y, -20 + this.width, 25, this.field_Q, false, 80, 3, var7, 16777215, WhirlpoolHasher.field_d);
          var13 = dupTemp$1;
          this.addChild((UiWidget) (dupTemp$1), (byte) 85);
          this.y = this.y + (5 + ((UiWidget) ((Object) var13)).height);
          this.field_H.listener = (WidgetListener) (this);
          if (this.field_M != null) {
            this.field_M.listener = (WidgetListener) (this);
          }
          if (this.field_G != null) {
            this.field_G.listener = (WidgetListener) (this);
          }
          if (this.field_M != null) {
            this.field_H.setBounds(118, this.y, 30, this.width - 95, 85);
            this.y = this.y + 60;
          } else {
            this.field_H.setBounds(118, this.y, 30, -10 + (this.width - 6), 8);
            this.y = this.y + 35;
          }
          if (null != this.field_M) {
            this.field_M.setBounds(121, this.y, 30, this.width - 16, 8);
            this.y = this.y + 35;
          }
          if (null != this.field_G) {
            if (!this.field_J &&
              !this.field_O) {
              this.field_G.setBounds(121, this.y, 20, 40, 8);
              this.y = this.y + 25;
            } else {
              this.field_G.setBounds(110, this.y, 30, -10 + (-6 + this.width), 8);
              this.y = this.y + 35;
            }
          }
          this.setBounds(110, 0, this.y + 3, this.width, 0);
          this.addChild((UiWidget) (this.field_H), (byte) 84);
          if (null != this.field_M) {
            this.addChild((UiWidget) (this.field_M), (byte) 126);
          }
          if (this.field_G != null) {
            this.addChild((UiWidget) (this.field_G), (byte) 58);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("qc.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void configureArchiveConnection(int param0, int param1, int param2, PlatformTaskDispatcher param3, int param4, String param5, boolean param6, int param7, int param8) {
        MidiNoteMixer.field_q = param1;
        ByteArrayPool.field_d = param8;
        TextLayoutLine.field_c = param4;
        AchievementSubmission.field_j = param7;
        if (!param6) {
          return;
        }
        try {
          MidiNote.field_p = param3;
          SystemMemoryHelpers.field_a = param0;
          AccountFormTextHelpers.field_b = param2;
          FriendEntry.field_hb = param5;
          NameAvailabilityFactory.field_f = (Js5Transport) ((Object) new SocketJs5Transport());
          CacheEntry.field_q = new DiskCacheWorker(param3);
          DialogLayer.field_L = new ArchiveCatalog(NameAvailabilityFactory.field_f, CacheEntry.field_q);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "qc.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_N = null;
        if (param0 != -6664) {
          field_L = 3;
        }
        field_E = null;
        field_I = null;
    }

    final String getLoginIdentifier(boolean param0) {
        if (param0) {
          return (String) null;
        }
        if (this.field_K.text == null) {
          return "";
        }
        return this.field_K.text;
    }

    static {
        field_N = "Sound         ";
    }
}
