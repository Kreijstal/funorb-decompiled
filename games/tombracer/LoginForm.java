/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginForm extends WidgetContainer implements cd, tsa {
    private FocusableWidget field_y;
    private TextInputWidget field_A;
    private boolean field_w;
    private String field_F;
    private FocusableWidget field_E;
    private FocusableWidget field_B;
    static int[] field_z;
    private boolean field_x;
    private boolean field_D;
    private TextInputWidget field_C;

    LoginForm(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (isa) null);
        jsa dupTemp$0 = null;
        jsa dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        FocusableWidget stackIn_17_1 = null;
        FocusableWidget stackIn_17_2 = null;
        FocusableWidget stackIn_18_1 = null;
        FocusableWidget stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        td var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        nl var9 = null;
        jsa var12 = null;
        jsa var13 = null;
        try {
          stackIn_4_1 = (param4);
          this.field_w = stackIn_4_1;
          this.field_F = param1;
          stackIn_7_1 = (param2);
          this.field_x = stackIn_7_1;
          stackIn_10_1 = (param3);
          this.field_D = stackIn_10_1;
          if (this.field_x && (this.field_D ||
            this.field_w)) {
            throw new IllegalStateException();
          }
          this.field_A = (TextInputWidget) ((Object) new so(param0, (qc) (this), 100));
          this.field_C = (TextInputWidget) ((Object) new so("", (qc) (this), 20));
          if (this.field_x) {
            this.field_B = new FocusableWidget(nga.field_q, (qc) null);
            this.field_y = new FocusableWidget(ControllerLocomotor.field_q, (qc) null);
            this.field_A.field_y = false;
          } else {
            this.field_B = new FocusableWidget(goa.field_c, (qc) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (!this.field_w) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = KeyLockBehaviour.field_o;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = fca.field_d;
            }
            this.field_y = new FocusableWidget(stackIn_18_3, (qc) null);
            if (this.field_D) {
              this.field_E = new FocusableWidget(foa.field_a, (qc) (this));
            }
          }
          this.field_A.field_r = (isa) ((Object) new hga(10000536));
          this.field_C.field_r = (isa) ((Object) new poa(10000536));
          var6 = new td();
          this.field_B.field_r = (isa) ((Object) var6);
          if (this.field_y != null) {
            this.field_y.field_r = (isa) ((Object) var6);
          }
          this.field_A.field_q = kma.field_a;
          if (this.field_E != null) {
            this.field_E.field_r = (isa) ((Object) var6);
          }
          if (null != this.field_E) {
            this.field_E.field_q = hga.field_n;
          }
          if (!this.field_x) {
            if (!this.field_w) {
              this.field_y.field_r = (isa) ((Object) new kaa());
            } else {
              this.field_y.field_q = tg.field_a;
              this.field_y.field_r = (isa) ((Object) new kaa());
            }
          } else {
            this.field_y.field_q = SwitchLinkList.field_c;
          }
          this.field_n = 15;
          var7 = KeySwitchComponent.field_J;
          if (null != this.field_F) {
            this.field_n = this.field_n + (var7.a(this.field_F, this.field_m - 40, var7.field_w) + 5);
          }
          var8 = PooledObject.field_h;
          var9 = cc.a((byte) 122, di.a(28));
          if (vw.field_a != var9) {
            if (var9 == ub.field_d) {
              var8 = ppa.field_a;
            }
          } else {
            var8 = daa.field_c;
          }
          dupTemp$0 = new jsa(10, this.field_n, -20 + this.field_m, 25, this.field_A, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.addChild(dupTemp$0, -1);
          this.field_n = this.field_n + (((UiWidget) ((Object) var12)).field_p + 5);
          dupTemp$1 = new jsa(10, this.field_n, -20 + this.field_m, 25, this.field_C, false, 80, 3, var7, 16777215, rta.field_j);
          var13 = dupTemp$1;
          this.addChild(dupTemp$1, -1);
          this.field_n = this.field_n + (((UiWidget) ((Object) var13)).field_p + 5);
          this.field_B.field_h = (qc) (this);
          if (this.field_E != null) {
            this.field_E.field_h = (qc) (this);
          }
          if (null != this.field_y) {
            this.field_y.field_h = (qc) (this);
          }
          if (this.field_E != null) {
            this.field_B.setBounds((byte) -31, this.field_m - 95, 30, 85, this.field_n);
            this.field_n = this.field_n + 60;
          } else {
            this.field_B.setBounds((byte) -31, -10 + (this.field_m - 6), 30, 8, this.field_n);
            this.field_n = this.field_n + 35;
          }
          if (this.field_E != null) {
            this.field_E.setBounds((byte) -31, -10 + (this.field_m - 6), 30, 8, this.field_n);
            this.field_n = this.field_n + 35;
          }
          if (this.field_y != null) {
            if (!this.field_x &&
              !this.field_w) {
              this.field_y.setBounds((byte) -31, 40, 20, 8, this.field_n);
              this.field_n = this.field_n + 25;
            } else {
              this.field_y.setBounds((byte) -31, -6 + this.field_m - 10, 30, 8, this.field_n);
              this.field_n = this.field_n + 35;
            }
          }
          this.setBounds((byte) -31, this.field_m, 3 + this.field_n, 0, 0);
          this.addChild(this.field_B, -1);
          if (this.field_E != null) {
            this.addChild(this.field_E, -1);
          }
          if (null != this.field_y) {
            this.addChild(this.field_y, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("jw.<init>(");
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
          throw tba.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_z = null;
        int var1 = -9 % ((34 - param0) / 46);
    }

    public final void a(int param0, int param1, FocusableWidget param2, int param3, byte param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        String var8 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 != this.field_B) {
            if (param2 != this.field_E) {
              if (param2 == this.field_y) {
                if (this.field_x) {
                  eo.q(83);
                } else {
                  if (!this.field_w) {
                    TextResourceLoader.b(50);
                  } else {
                    gqa.a((byte) 62);
                  }
                }
              }
            } else {
              qfa.a((byte) 6);
            }
          } else {
            this.submitLogin((byte) 85);
          }
          if (param4 <= 44) {
            var8 = (String) null;
            this.a((String) null, -88);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("jw.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(TextInputWidget param0, int param1) {
        try {
          if (param1 != -10) {
            field_z = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "jw.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(String param0, int param1) {
        TextInputWidget var3 = null;
        String var4 = null;
        try {
          var3 = this.field_A;
          var4 = param0;
          var3.a(false, -16719, var4);
          if (param1 < 121) {
            LoginForm.releaseStatics(-98);
          }
          this.field_C.clearText(-10);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "jw.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void submitLogin(byte param0) {
        if (param0 < 27) {
          return;
        }
        if (foa.a((byte) 91) ||
          !(this.field_A.field_o.length() <= 0) &&
          !(this.field_C.field_o.length() <= 0)) {
          rt.a(true, this.field_A.field_o, this.field_C.field_o);
        }
    }

    final void a(byte param0) {
        if (param0 != -92) {
          this.field_w = false;
        }
        this.field_A.clearText(-121);
        this.field_C.clearText(param0 ^ 34);
    }

    final boolean handleKeyInput(char param0, UiWidget param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, param1, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_6_0 = this.focusPreviousChild(param1, (byte) -81);
            return stackIn_6_0;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_9_0 = this.focusNextChild(param1, (byte) -9);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("jw.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void renderLayer(int param0, int param1, int param2, int param3) {
        if (null != this.field_F) {
          KeySwitchComponent.field_J.a(this.field_F, param0 + (this.field_i + 20), param1 + this.field_n + 15, this.field_m - 40, this.field_p, 16777215, -1, 1, 0, KeySwitchComponent.field_J.field_w);
        }
        if (this.field_E != null) {
          SoftwareRasterizer.drawHorizontalLine(param0 + 10, param1 + 134, this.field_m - 20, 4210752);
        }
        super.renderLayer(param0, param1, param2 + param2, param3);
    }

    public final void a(int param0, TextInputWidget param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != -6038) {
            this.field_A = (TextInputWidget) null;
          }
          if (this.field_A == param1) {
            this.field_C.requestKeyboardFocus((UiWidget) (this), false);
          }
          if (param1 == this.field_C) {
            this.submitLogin((byte) 60);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("jw.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final String a(int param0) {
        if (this.field_A.field_o != null) {
          if (param0 < 29) {
            this.renderLayer(-72, 15, 19, 125);
          }
          return this.field_A.field_o;
        }
        return "";
    }

    static {
        field_z = new int[]{99, 179, 108, 280, 219, 303, 398, 439, 500};
    }
}
