/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo extends WidgetGroup implements vf, WidgetActionListener {
    static boolean field_I;
    static byte[] field_J;
    static String field_H;
    static int field_N;
    static String field_P;
    private FocusableWidget field_K;
    private ValidatedTextFieldWidget field_L;
    private FocusableWidget field_Q;
    static String[] field_M;
    ri field_R;
    static int pressY;

    private final int a(int param0, String param1, Widget param2, String param3, int param4, int param5) {
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
          if (param0 < -10) {
            stackIn_4_0 = this.a(param1, param5, param4, param2, 35, param3, false);
            return stackIn_4_0;
          }
          stackIn_2_0 = 82;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("qo.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_int = 0;
          var4 = CachedArchiveSource.field_r;
          if (param0 != 120) {
            pressY = -69;
          }
          while (ValidationStatus.field_i.length > var3_int) {
            var5 = BrickABrac.field_K[var3_int];
            if (var5 < 0) {
              var4 = var4 + IntArrayRequest.field_s;
            } else {
              var6 = hm.a(true, ValidationStatus.field_i[var3_int], 0);
              var4 = var4 + kn.field_y;
              var7 = wi.field_k - (var6 >> 1);
              if (bg.containsRectanglePoint(var7 - cn.field_c, (DropTargetWidget.field_H << 1) + b.field_c, var6 + (cn.field_c << 1), (byte) 65, param1, param2, var4)) {
                stackIn_7_0 = var5;
                return stackIn_7_0;
              }
              var4 = var4 + (kn.field_y + ((DropTargetWidget.field_H << 1) + b.field_c));
            }
            var3_int++;
          }
          stackIn_13_0 = -1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var3), "qo.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean handleWidgetKey(int keyCode, byte obfuscationGuard, Widget focusRoot, char character) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleWidgetKey(keyCode, obfuscationGuard, focusRoot, character)) {
            return true;
          }
          if (keyCode == 98) {
            stackIn_6_0 = this.b(focusRoot, (byte) 87);
            return stackIn_6_0;
          }
          if (keyCode != 99) {
            return false;
          }
          stackIn_10_0 = this.a(focusRoot, (byte) -127);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("qo.T(").append(keyCode).append(',').append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(character).append(')').toString());
        }
    }

    private final int a(String param0, int param1, int param2, Widget param3, int param4, String param5, boolean param6) {
        RuntimeException var8 = null;
        ValidationMessageWidget var9 = null;
        LabeledWidget var10 = null;
        LabeledWidget stackIn_2_1 = null;
        boolean stackIn_3_2 = false;
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
          var10 = new LabeledWidget(20, param2, param1 + 120, 25, param3, param6, 120, 3, ArchiveNetworkClient.field_u, 16777215, param0);
          stackIn_2_1 = var10;
          stackIn_3_2 = !(param6);
          this.addChild(stackIn_2_1, stackIn_3_2);
          var9 = new ValidationMessageWidget(((ValidatableWidget) ((Object) param3)).getValidationSource(-11011), param5, 126, param2 + var10.height, 25 + param1, param4);
          var9.listener = (WidgetListener) (this);
          this.addChild(var9, true);
          stackIn_4_0 = var9.height + var10.height;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("qo.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
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
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        IsaacGenerator.field_f = 400 * param1 / param0;
        IsaacGenerator.field_c = (param1 << 16) / 150;
        IsaacGenerator.field_n = param1 * 100 / 150;
    }

    public static void h(int param0) {
        field_P = null;
        field_H = null;
        field_J = null;
        field_M = null;
        int var1 = -119 / ((-4 - param0) / 38);
    }

    public final void onAction(int pointerY, int button, byte obfuscationGuard, int pointerX, FocusableWidget widget) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (widget == this.field_K) {
            MotionWaypoint.d(-101);
          } else {
            if (widget == this.field_Q) {
              this.a(28462);
            }
          }
          if (obfuscationGuard <= -22) {
            return;
          }
          field_P = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("qo.Q(").append(pointerY).append(',').append(button).append(',').append(obfuscationGuard).append(',').append(pointerX).append(',');
          if (widget == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void updatePointer(Widget focusRoot, byte obfuscationGuard, int parentX, int parentY) {
        try {
          super.updatePointer(focusRoot, obfuscationGuard, parentX, parentY);
          this.field_Q.enabled = this.h((byte) 92);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "qo.WA(" + (focusRoot != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + parentX + ',' + parentY + ')');
        }
    }

    private final boolean a(int param0, ValidatableWidget param1) {
        ValidationSource var3 = null;
        RuntimeException var3_ref = null;
        ValidationStatus var4 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.getValidationSource(-11011);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getValidationStatus((byte) -31);
          if (param0 > -64) {
            field_J = (byte[]) null;
          }
          stackIn_9_0 = (var4 == DualLinkIterator.validationValid);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("qo.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void a(int param0) {
        if (!this.h((byte) 92)) {
          return;
        }
        QuickChatHelpDialog.a(this.field_L.text, -96);
        if (param0 != 28462) {
          this.field_Q = (FocusableWidget) null;
          return;
        }
    }

    public qo() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.field_L = new ValidatedTextFieldWidget("", (WidgetListener) null, 12);
        um var1 = new um(QuickChatMenu.field_Yb, 0, 0, 0, 0, 16777215, -1, 3, 0, ArchiveNetworkClient.field_u.ascent, -1, 2147483647, true);
        Widget var2 = new Widget(EmailAvailabilityRequest.field_d, var1, (WidgetListener) null);
        this.field_Q = new FocusableWidget(TextFieldValidator.field_j, (WidgetListener) null);
        this.field_K = new FocusableWidget(ValidationIconWidget.field_L, (WidgetListener) null);
        this.field_L.tooltip = hh.field_a;
        this.field_L.setValidationSource(new UsernameAvailabilityValidator(this.field_L), (byte) -68);
        this.field_Q.enabled = false;
        this.field_Q.renderer = (WidgetRenderer) ((Object) new hi());
        this.field_K.renderer = (WidgetRenderer) ((Object) new bb());
        this.field_L.renderer = (WidgetRenderer) ((Object) new r(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.setBounds(50, 20, var3, (byte) -119, 270);
        var3 += 50;
        this.addChild(var2, true);
        var3 = var3 + (this.a(-14, BlankScreen.field_j, this.field_L, GameClock.field_h, var3, 170) + 5);
        this.field_Q.setBounds(40, 496 - var5 >> 1, var3, (byte) -119, var5);
        this.field_K.setBounds(40, var4 + 3, var3 + 15, (byte) -119, 60);
        this.field_K.listener = (WidgetListener) (this);
        this.field_Q.listener = (WidgetListener) (this);
        this.addChild(this.field_Q, true);
        this.addChild(this.field_K, true);
        this.field_R = new ri((vf) (this));
        this.field_R.setBounds(150, this.field_L.width + this.field_L.x + 60, 20, (byte) -119, -60 + (-this.field_L.width - this.field_L.x + this.width));
        this.addChild(this.field_R, true);
        this.setBounds(var4 + (55 + var3), 0, 0, (byte) -119, 496);
    }

    private final boolean h(byte param0) {
        if (param0 != 92) {
          field_P = (String) null;
          if (this.a(-68, this.field_L)) {
            return true;
          }
          return false;
        }
        if (this.a(-68, this.field_L)) {
          return true;
        }
        return false;
    }

    public final void a(String param0, byte param1) {
        ValidatedTextFieldWidget var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_L;
          var4 = param0;
          ((TextFieldWidget) ((Object) var3)).setText(var4, param1 - 12648, false);
          if (param1 == 56) {
            return;
          }
          field_P = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("qo.C(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(byte param0) {
        if (param0 < 96) {
          return;
        }
        ((UsernameAvailabilityValidator) (this.field_L.getValidationSource(-11011))).clearAvailabilityCache((byte) -22);
    }

    static {
        field_H = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_P = "Curses!";
        field_M = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        pressY = 0;
    }
}
