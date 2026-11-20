/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayModeErrorDialog extends ResizableModalPanel implements UiActionListener {
    static String field_L;
    static IntrusiveDeque field_M;
    private UiFocusableComponent closeButton;
    static String field_J;

    public final void onAction(int param0, int param1, int param2, UiFocusableComponent param3, int param4) {
        RuntimeException var6 = null;
        UiFocusableComponent var7 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.closeButton == param3) {
            this.closeDialog(-95);
          }
          if (param0 == 11) {
            return;
          }
          var7 = (UiFocusableComponent) null;
          this.onAction(-125, -106, 11, (UiFocusableComponent) null, 127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("mr.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    final static String getLoginNameOrFallback(byte param0) {
        String var1 = "";
        if (null != SetAiFiringRangeUpshift.field_o) {
          var1 = SetAiFiringRangeUpshift.field_o.getLoginName(30);
        }
        int var2 = 80 / ((-61 - param0) / 55);
        if (0 == var1.length()) {
          var1 = MenuBackgroundBattle.getLocalPlayerName(120);
        }
        if (0 == var1.length()) {
          var1 = SetMachineGunReload.field_o;
        }
        return var1;
    }

    public static void clearSharedReferences(byte param0) {
        field_L = null;
        field_M = null;
        field_J = null;
        if (param0 != -16) {
          DisplayModeErrorDialog.createTickClock(-102);
        }
    }

    DisplayModeErrorDialog(ModalStack param0, FullscreenFailureReason param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        UiComponent var4 = null;
        try {
          var3 = null;
          if (param1 == ComponentAttachmentPlan.signedAppletRequired) {
            var3 = UiArrayContainer.field_t;
          } else {
            if (param1 == AdminMessageFactory.focusOrResolutionFailure) {
              this.height = this.height + 10;
              var3 = RenderResourceNode.field_m;
              if (Particle.canResizeGameWindow((byte) 109)) {
                var3 = WorldFactory.field_b;
                this.height = this.height + 20;
              }
            } else {
              if (param1 == RemoveEventAction.confirmationTimeout) {
                this.height = this.height + 30;
                var3 = SetFighterRepairAmount.field_o;
              }
            }
          }
          var4 = new UiComponent((String) (var3), (UiListener) null);
          var4.height = 80;
          var4.y = 50;
          var4.width = this.width;
          var4.x = 0;
          var4.renderer = (UiRenderer) ((Object) new UiTextStyle(SetTorpedoProjectileLife.field_o, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild(-18756, var4);
          this.closeButton = this.addFooterButton((byte) 113, (UiListener) (this), MissionCondition.field_b);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("mr.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void closeDialog(int param0) {
        if (param0 >= -39) {
          field_J = (String) null;
          if (this.active) {
            this.active = false;
            return;
          }
          return;
        }
        if (this.active) {
          this.active = false;
          return;
        }
    }

    final static TickClock createTickClock(int param0) {
        if (param0 <= 37) {
          DisplayModeErrorDialog.createTickClock(84);
          return (TickClock) ((Object) new SmoothedNanoTickClock());
        }
        return (TickClock) ((Object) new SmoothedNanoTickClock());
    }

    private final UiFocusableComponent addFooterButton(byte param0, UiListener param1, String param2) {
        UiFocusableComponent var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        UiFocusableComponent stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new UiFocusableComponent(param2, param1);
          var4.renderer = (UiRenderer) ((Object) new ThreeSliceButtonStyle());
          var5 = -79 / ((6 - param0) / 32);
          var6 = -6 + this.height;
          this.height = this.height + 38;
          var4.setBounds(15, this.width - 14 - 16, 30, 1, var6);
          this.addChild(-18756, var4);
          this.refreshLayout(false);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("mr.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_L = "<%0> is not on your ignore list.";
        field_J = "Game options";
    }
}
