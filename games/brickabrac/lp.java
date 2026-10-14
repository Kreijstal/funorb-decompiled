/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lp extends fe implements WidgetActionListener {
    static NodeDeque queuedAchievementSubmissions;
    private boolean field_Bb;
    private boolean field_vb;
    private boolean field_tb;
    private cr field_qb;
    private boolean field_zb;
    static RgbSprite[] field_yb;
    static UiComponent field_Ab;
    static ValidationStatus validationInvalid;
    private TextFont field_sb;
    static GameScreen currentScreen;
    static PlatformServices field_ub;

    final boolean handleWidgetKey(int keyCode, byte obfuscationGuard, Widget focusRoot, char character) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (13 == keyCode) {
            this.m(obfuscationGuard ^ 127);
            return true;
          }
          if (obfuscationGuard != 110) {
            currentScreen = (GameScreen) null;
          }
          stackIn_7_0 = super.handleWidgetKey(keyCode, (byte) 110, focusRoot, character);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("lp.T(").append(keyCode).append(',').append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(character).append(')').toString());
        }
    }

    final static boolean n(int param0) {
        if (param0 != -5) {
          field_yb = (RgbSprite[]) null;
          if (!LegacyUtf8Decoder.a((byte) -80)) {
            return false;
          }
          if (0 == (MembershipBenefitsScreen.clientTick & 8)) {
            return true;
          }
          return false;
        }
        if (!LegacyUtf8Decoder.a((byte) -80)) {
          return false;
        }
        if (0 == (MembershipBenefitsScreen.clientTick & 8)) {
          return true;
        }
        return false;
    }

    final void i(byte param0) {
        this.field_qb.b(2121792, 4210752, 2);
        ec var2 = new ec(this, this.field_sb, FarmBackground.field_t);
        if (param0 < -11) {
          var2.a(false, DebouncedValidationSource.field_e, 15);
          this.b((byte) 110, var2);
          return;
        }
    }

    public void onAction(int pointerY, int button, byte obfuscationGuard, int pointerX, FocusableWidget widget) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_Bb) {
            AgeValidator.a("tochangedisplayname.ws", (byte) -113, EmailConfirmationValidator.e((byte) -103));
          } else {
            CheckboxWidgetRenderer.a(3, true);
            this.m(17);
          }
          if (obfuscationGuard < -22) {
            return;
          }
          lp.o(-11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("lp.Q(").append(pointerY).append(',').append(button).append(',').append(obfuscationGuard).append(',').append(pointerX).append(',');
          if (widget == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, String param2) {
        boolean stackIn_7_1 = false;
        ec stackIn_14_0 = null;
        boolean stackIn_14_1 = false;
        String stackIn_15_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        ec var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ec var6 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          if (this.field_zb) {
            return;
          }
          stackIn_7_1 = (256 == param0);
          this.field_Bb = stackIn_7_1;
          this.field_zb = true;
          this.field_qb.b(8405024, 4210752, 2);
          if (param1) {
            this.m(6);
          }
          var6 = new ec(this, this.field_sb, param2);
          var4 = var6;
          if (param0 != 5) {
            if (param0 == 256) {
              var6.a((byte) -78, TabbedPane.field_Tb, (WidgetListener) (this));
            } else {
              stackIn_14_0 = var6;
              stackIn_14_1 = false;
              if (this.field_vb) {
                stackIn_15_2 = TabbedPane.field_Tb;
              } else {
                stackIn_15_2 = HalloweenBackground.field_s;
              }
              ((ec) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_15_2, -1);
            }
          } else {
            var6.a(param1, ec.field_L, 11);
            var6.a(false, wc.field_a, 17);
          }
          if (param0 != 3) {
            if (param0 != 4) {
              if (param0 == 6) {
                var6.a(false, MatchingTextValidator.field_p, 9);
              } else {
                if (9 == param0) {
                  var6.a((byte) 126, BrickABrac.field_G, (WidgetListener) (this));
                }
              }
            } else {
              var6.a(param1, MonotonicTime.field_f, 8);
            }
          } else {
            var6.a(false, Ball.field_H, 7);
          }
          this.b((byte) 125, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("lp.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    lp(WidgetLayerStack param0, TextFont param1, String param2, boolean param3, boolean param4) {
        super(param0, new ec((lp) null, param1, param2), 77, 10, 10);
        try {
          this.field_tb = param4 ? true : false;
          this.field_vb = param3 ? true : false;
          this.field_zb = false;
          this.field_Bb = false;
          this.field_sb = param1;
          this.field_qb = new cr(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_qb.field_J = true;
          this.addChild(this.field_qb, true);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "lp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void m(int param0) {
        if (param0 != 17) {
          this.field_vb = false;
          if (!this.visible) {
            return;
          }
          this.visible = false;
          if (this.field_vb) {
            MatchingTextValidator.e((byte) -46);
            return;
          }
          if (this.field_tb) {
            s.a((byte) -30);
            return;
          }
          return;
        }
        if (!this.visible) {
          return;
        }
        this.visible = false;
        if (this.field_vb) {
          MatchingTextValidator.e((byte) -46);
          return;
        }
        if (this.field_tb) {
          s.a((byte) -30);
          return;
        }
    }

    public static void o(int param0) {
        queuedAchievementSubmissions = null;
        field_ub = null;
        currentScreen = null;
        field_Ab = null;
        if (param0 == 50) {
          validationInvalid = null;
          field_yb = null;
          return;
        }
        lp.o(29);
        validationInvalid = null;
        field_yb = null;
    }

    static {
        queuedAchievementSubmissions = new NodeDeque();
        validationInvalid = new ValidationStatus();
    }
}
