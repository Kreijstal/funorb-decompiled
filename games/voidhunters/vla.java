/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vla extends UiContainer implements UiTextFieldListener, UiActionListener {
    static String field_E;
    private UiFocusableComponent field_x;
    private boolean field_B;
    private UiFocusableComponent field_A;
    private String field_v;
    private UiTextField field_G;
    private boolean field_F;
    private boolean field_w;
    static String field_C;
    private UiTextField field_y;
    private UiFocusableComponent field_z;

    final void a(byte param0, String param1) {
        UiTextField var3 = null;
        String var4 = null;
        if (param0 != 9) {
          return;
        }
        try {
          var3 = this.field_y;
          var4 = param1;
          var3.setText(false, param0 ^ 9, var4);
          this.field_G.clearText(82);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "vla.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onAction(int param0, int param1, int param2, UiFocusableComponent param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = VoidHunters.field_G;
        try {
          if (param0 != 11) {
            return;
          }
          if (this.field_x != param3) {
            if (param3 == this.field_z) {
              GetPhasedEnergyBeamProjectiles.a(70);
            } else {
              if (param3 == this.field_A) {
                if (!this.field_B) {
                  if (!this.field_w) {
                    OpenGlTransparentWaterEffect.e(-24248);
                  } else {
                    GetGrapplingHookRopeBreakLength.e((byte) -91);
                  }
                } else {
                  qj.a((byte) 127);
                }
              }
            }
          } else {
            this.d(-1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("vla.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        if (this.field_v != null) {
          SetShipToShipRamDamage.field_o.drawParagraph(this.field_v, this.x + (param0 + 20), 15 + (param3 + this.y), -40 + this.width, this.height, 16777215, -1, 1, 0, SetShipToShipRamDamage.field_o.maxAscent);
        }
        if (this.field_z != null) {
          SoftwareRasterizer2D.drawHorizontalLine(param0 + 10, param3 + 134, -20 + this.width, 4210752);
        }
        super.drawLayer(param0, param1, 58, param3);
        if (param2 < 47) {
          UiTextField var6 = (UiTextField) null;
          this.onTextChanged((UiTextField) null, (byte) 79);
        }
    }

    final void i(byte param0) {
        this.field_y.clearText(82);
        if (param0 != -29) {
          this.field_x = (UiFocusableComponent) null;
        }
        this.field_G.clearText(82);
    }

    private final void d(int param0) {
        UiTextField var3;
        if (param0 != -1) {
          var3 = (UiTextField) null;
          this.onTextChanged((UiTextField) null, (byte) -20);
        }
        if (Projectile.f((byte) -21) ||
          !(this.field_y.text.length() <= 0) &&
          !(this.field_G.text.length() <= 0)) {
          PartitionZoneList.a(-41, this.field_G.text, this.field_y.text);
        }
    }

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
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
          if (param1 == 98) {
            stackIn_6_0 = this.focusPreviousChild(param2, 0);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_9_0 = this.focusNextChild(true, param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("vla.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final String a(int param0) {
        if (null == this.field_y.text) {
          return "";
        }
        if (param0 != 30) {
          return (String) null;
        }
        return this.field_y.text;
    }

    vla(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (UiRenderer) null);
        sca dupTemp$0 = null;
        sca dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        UiFocusableComponent stackIn_17_1 = null;
        UiFocusableComponent stackIn_17_2 = null;
        UiFocusableComponent stackIn_18_1 = null;
        UiFocusableComponent stackIn_18_2 = null;
        String stackIn_18_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        vva var6 = null;
        RuntimeException var6_ref = null;
        BitmapFont var7 = null;
        String var8 = null;
        khb var9 = null;
        sca var12 = null;
        sca var13 = null;
        try {
          stackIn_4_1 = (param4);
          this.field_w = stackIn_4_1;
          stackIn_7_1 = (param3);
          this.field_F = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_B = stackIn_10_1;
          this.field_v = param1;
          if (this.field_B && (this.field_F ||
            this.field_w)) {
            throw new IllegalStateException();
          }
          this.field_y = (UiTextField) ((Object) new tga(param0, (UiListener) (this), 100));
          this.field_G = (UiTextField) ((Object) new tga("", (UiListener) (this), 20));
          if (this.field_B) {
            this.field_x = new UiFocusableComponent(SetSpecialOrderBoxHeight.field_p, (UiListener) null);
            this.field_A = new UiFocusableComponent(GetFighterBayAimspeed.field_q, (UiListener) null);
            this.field_y.enabled = false;
          } else {
            this.field_x = new UiFocusableComponent(GetBombletSprayProjectiles.field_s, (UiListener) null);
            stackIn_17_1 = null;
            stackIn_17_2 = null;
            if (this.field_w) {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = cjb.field_a;
            } else {
              stackIn_18_1 = null;
              stackIn_18_2 = null;
              stackIn_18_3 = ArbProgram.field_a;
            }
            this.field_A = new UiFocusableComponent(stackIn_18_3, (UiListener) null);
            if (this.field_F) {
              this.field_z = new UiFocusableComponent(TimedSpecialOrderBehaviour.field_b, (UiListener) (this));
            }
          }
          this.field_y.renderer = (UiRenderer) ((Object) new io(10000536));
          this.field_G.renderer = (UiRenderer) ((Object) new kpb(10000536));
          var6 = new vva();
          this.field_x.renderer = (UiRenderer) ((Object) var6);
          if (null != this.field_A) {
            this.field_A.renderer = (UiRenderer) ((Object) var6);
          }
          this.field_y.tooltip = sja.field_j;
          if (this.field_z != null) {
            this.field_z.renderer = (UiRenderer) ((Object) var6);
          }
          if (this.field_z != null) {
            this.field_z.tooltip = AdjustBodyComponentsAction.field_a;
          }
          if (this.field_B) {
            this.field_A.tooltip = GetSpecialOrderBoxHeight.field_o;
          } else {
            if (!this.field_w) {
              this.field_A.renderer = (UiRenderer) ((Object) new meb());
            } else {
              this.field_A.tooltip = UiContainer.field_u;
              this.field_A.renderer = (UiRenderer) ((Object) new meb());
            }
          }
          this.y = 15;
          var7 = SetShipToShipRamDamage.field_o;
          if (null != this.field_v) {
            this.y = this.y + (var7.getParagraphHeight(this.field_v, this.width - 40, var7.maxAscent) + 5);
          }
          var8 = RemoveEventActionFactory.field_a;
          var9 = gib.a(19314, MissionList.b((byte) -86));
          if (SetFighterBayAimspeed.field_o != var9) {
            if (var9 == SetShowTutorial.field_p) {
              var8 = SetSpinningBladeTopSpeed.field_o;
            }
          } else {
            var8 = fj.field_a;
          }
          dupTemp$0 = new sca(10, this.y, this.width - 20, 25, this.field_y, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.addChild(-18756, dupTemp$0);
          this.y = this.y + (((UiComponent) ((Object) var12)).height + 5);
          dupTemp$1 = new sca(10, this.y, -20 + this.width, 25, this.field_G, false, 80, 3, var7, 16777215, RequestNewestBlackboxRecording.field_q);
          var13 = dupTemp$1;
          this.addChild(-18756, dupTemp$1);
          this.y = this.y + (((UiComponent) ((Object) var13)).height + 5);
          this.field_x.listener = (UiListener) (this);
          if (this.field_z != null) {
            this.field_z.listener = (UiListener) (this);
          }
          if (this.field_A != null) {
            this.field_A.listener = (UiListener) (this);
          }
          if (null == this.field_z) {
            this.field_x.setBounds(8, this.width - 16, 30, 1, this.y);
            this.y = this.y + 35;
          } else {
            this.field_x.setBounds(85, this.width - 95, 30, 1, this.y);
            this.y = this.y + 60;
          }
          if (null != this.field_z) {
            this.field_z.setBounds(8, -16 + this.width, 30, 1, this.y);
            this.y = this.y + 35;
          }
          if (null != this.field_A) {
            if (!this.field_B &&
              !this.field_w) {
              this.field_A.setBounds(8, 40, 20, 1, this.y);
              this.y = this.y + 25;
            } else {
              this.field_A.setBounds(8, -10 + (-6 + this.width), 30, 1, this.y);
              this.y = this.y + 35;
            }
          }
          this.setBounds(0, this.width, 3 + this.y, 1, 0);
          this.addChild(-18756, this.field_x);
          if (this.field_z != null) {
            this.addChild(-18756, this.field_z);
          }
          if (null != this.field_A) {
            this.addChild(-18756, this.field_A);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("vla.<init>(");
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 3) {
          return;
        }
        field_E = null;
        field_C = null;
    }

    final static int a(byte param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          var2_int = param1.length();
          var3 = 0;
          if (param0 <= 105) {
            vla.clearSharedReferences(30);
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            var3 = aea.a(-125, param1.charAt(var4)) + (-var3 + (var3 << 5));
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("vla.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void onTextChanged(UiTextField param0, byte param1) {
        try {
          if (param1 != 100) {
            this.d(-74);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "vla.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void onSubmitted(int param0, UiTextField param1) {
        CharSequence var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != -12409) {
            var4 = (CharSequence) null;
            vla.a((byte) -119, (CharSequence) null);
          }
          if (param1 == this.field_y) {
            this.field_G.requestFocus(param0 ^ -12409, (UiComponent) (this));
          }
          if (param1 == this.field_G) {
            this.d(-1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("vla.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_C = "Hull block";
    }
}
