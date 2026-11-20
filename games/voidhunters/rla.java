/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rla extends UiContainer implements UiActionListener {
    private UiFocusableComponent field_w;
    private UiFocusableComponent field_z;
    private UiFocusableComponent field_y;
    static GameStateFactory field_v;
    static int field_x;

    final static boolean c(boolean param0) {
        if (param0) {
          rla.clearSharedReferences((byte) -52);
          if (!ShipComponentFactory.field_a) {
            return false;
          }
          if (GetUseDetailLines.field_o != -1) {
            return true;
          }
          if (-1 != GetTorpedoReload.field_q) {
            return true;
          }
          return false;
        }
        if (!ShipComponentFactory.field_a) {
          return false;
        }
        if (GetUseDetailLines.field_o != -1) {
          return true;
        }
        if (-1 == GetTorpedoReload.field_q) {
          return false;
        }
        return true;
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var5 = param0 + this.x;
        int var6Lifetime1;
        if (param2 > 47) {
          var6 = param3 + this.y;
          SetShipToShipRamDamage.field_o.drawParagraph(NebulaFactory.field_a, 20 + var5, var6 + 20, this.width - 40, this.height - 50, 16777215, -1, 1, 0, SetShipToShipRamDamage.field_o.maxAscent);
          super.drawLayer(param0, param1, 94, param3);
          return;
        }
        this.field_z = (UiFocusableComponent) null;
        var6Lifetime1 = param3 + this.y;
        SetShipToShipRamDamage.field_o.drawParagraph(NebulaFactory.field_a, 20 + var5, var6Lifetime1 + 20, this.width - 40, this.height - 50, 16777215, -1, 1, 0, SetShipToShipRamDamage.field_o.maxAscent);
        super.drawLayer(param0, param1, 94, param3);
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 < 45) {
          return;
        }
        field_v = null;
    }

    public rla() {
        super(0, 0, 476, 225, (UiRenderer) null);
        this.field_w = new UiFocusableComponent(TimedSpecialOrderBehaviour.field_b, (UiListener) null);
        this.field_y = new UiFocusableComponent(SetTorpedoReload.field_p, (UiListener) null);
        this.field_z = new UiFocusableComponent(cjb.field_a, (UiListener) null);
        vva var1 = new vva();
        this.field_w.renderer = (UiRenderer) ((Object) var1);
        this.field_y.renderer = (UiRenderer) ((Object) var1);
        this.field_z.renderer = (UiRenderer) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_y.setBounds(this.width - var3 >> 1, var4, 30, 1, -48 + this.height - var2);
        this.field_z.setBounds(var4 + ((this.width - var3 >> 1) + var2), var4, 30, 1, -var2 - 48 + this.height);
        this.field_w.setBounds(this.width - var3 >> 1, var3, 30, 1, -78 + (this.height - var2 * 2));
        this.field_y.listener = (UiListener) (this);
        this.field_w.listener = (UiListener) (this);
        this.field_z.listener = (UiListener) (this);
        this.field_w.tooltip = AdjustBodyComponentsAction.field_a;
        this.field_z.tooltip = UiContainer.field_u;
        this.addChild(-18756, this.field_y);
        this.addChild(-18756, this.field_w);
        this.addChild(-18756, this.field_z);
    }

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0 + 0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_7_0 = this.focusPreviousChild(param2, param0 ^ -15834);
            return stackIn_7_0;
          }
          if (param1 == 99) {
            stackIn_10_0 = this.focusNextChild(true, param2);
            return stackIn_10_0;
          }
          if (param0 == -15834) {
            return false;
          }
          field_x = -28;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("rla.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onAction(int param0, int param1, int param2, UiFocusableComponent param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = VoidHunters.field_G;
        try {
          if (this.field_y == param3) {
            ot.a(-96);
          } else {
            if (this.field_w == param3) {
              GetPhasedEnergyBeamProjectiles.a(70);
            } else {
              if (param3 == this.field_z) {
                pr.a(17496);
              }
            }
          }
          if (param0 == 11) {
            return;
          }
          this.field_y = (UiFocusableComponent) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("rla.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_v = (GameStateFactory) ((Object) new ShipTeamConditionFactory());
        field_x = 1;
    }
}
