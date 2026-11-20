/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class UiSingleChildContainer extends UiComponent implements UiContainerMarker {
    UiComponent child;
    static int field_u;

    final int getMaxDrawLayer(int param0) {
        if (param0 != 0) {
          field_u = 110;
        }
        return null == this.child ? 0 : this.child.getMaxDrawLayer(0);
    }

    boolean handleMousePress(int param0, int param1, int param2, int param3, UiComponent param4, int param5, byte param6) {
        RuntimeException var8 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 >= -17) {
            field_u = -57;
          }
          stackIn_6_0 = (this.child != null) && (this.child.handleMousePress(param0, this.x + param1, param2, param3, param4, param5 + this.y, (byte) -109));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("mc.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    String getTooltip(byte param0) {
        String var3 = null;
        String var2 = super.getTooltip(param0);
        if (null != this.child) {
          var3 = this.child.getTooltip((byte) 125);
          if (var3 != null) {
            return var3;
          }
        }
        return var2;
    }

    final boolean requestFocus(int param0, UiComponent param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            return false;
          }
          stackIn_7_0 = (this.child != null) && (this.child.requestFocus(param0 ^ 0, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean hasFocus(byte param0) {
        if (param0 != -120) {
          return true;
        }
        return this.getFocusedChild(param0 ^ -6075) != null ? true : false;
    }

    void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updatePointer(param0, param1, param2, param3);
          if (null != this.child) {
            this.child.updatePointer(this.y + param0, this.x + param1, param2 + 0, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("mc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void drawSlidingLobbyPanels(int param0, boolean param1) {
        if (!(SoftwareTransform3D.field_b <= 0) &&
          TutorialController.field_d) {
          SoftwareRasterizer2D.darkenRectangle(0, 0, SoftwareRasterizer2D.width, SetToggledScoreboard.field_o.screenY);
          GetTorpedoProjectiles.field_o.draw(param1, 45);
        }
        if (param0 >= -117) {
          ShipComponent var3 = (ShipComponent) null;
          UiSingleChildContainer.attachPresetComponents((ShipComponent) null, -56);
        }
        if ((CarouselPlayerEventFactory.field_a > 0 || SetExplosionPushMultiplier.field_p > 0) &&
          GetTorpedoProjectileDamage.field_o) {
          SoftwareRasterizer2D.darkenRectangle(0, 0, SoftwareRasterizer2D.width, SetToggledScoreboard.field_o.screenY);
          SetUseCircleFill.field_o.draw(param1, -91);
        }
    }

    final static void attachPresetComponents(ShipComponent param0, int param1) {
        ShipComponent var3 = null;
        ShipComponent var4 = null;
        try {
          param0.attachToHardpoint(1, 2, new ShipComponent(13));
          param0.attachToHardpoint(param1 ^ 26, 8, new ShipComponent(13));
          param0.attachToHardpoint(1, 11, new ShipComponent(13));
          param0.attachToHardpoint(1, 4, new ShipComponent(25));
          param0.attachToHardpoint(1, 6, new ShipComponent(25));
          param0.attachToHardpoint(1, 5, new ShipComponent(25));
          var3 = new ShipComponent(29);
          var3.attachToHardpoint(1, 0, new ShipComponent(27));
          var3.attachToHardpoint(1, 1, new ShipComponent(13));
          param0.attachToHardpoint(1, 0, var3);
          var4 = new ShipComponent(29);
          var4.attachToHardpoint(1, 0, new ShipComponent(param1));
          var4.attachToHardpoint(1, 2, new ShipComponent(13));
          param0.attachToHardpoint(1, 10, var4);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "mc.TA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void refreshChildLayout(int param0) {
        int var2 = -14 % ((param0 + 80) / 42);
        if (null != this.child) {
          this.child.refreshLayout(false);
        }
    }

    StringBuilder appendDebugTree(boolean param0, Hashtable param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugVisit(param1, param2, (byte) 115, param3)) {
            this.appendDebugProperties(71, param2, param1, param3);
            this.appendChildDebugTree(param2, 13, param3, param1);
          }
          if (param0) {
            this.child = (UiComponent) null;
          }
          stackIn_5_0 = (StringBuilder) (param3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("mc.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    void handleMouseRelease(byte param0, int param1, int param2, int param3, UiComponent param4, int param5) {
        try {
          if (null != this.child) {
            this.child.handleMouseRelease((byte) 122, param1 + this.x, param2, this.y + param3, param4, param5);
          }
          int var7_int = -98 % ((52 - param0) / 52);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "mc.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    void drawLayer(int param0, int param1, int param2, int param3) {
        if (param2 <= 47) {
          this.getFocusedChild(-117);
        }
        if (0 == param1 &&
          null != this.renderer) {
          this.renderer.drawComponent(103, (UiComponent) (this), param0, param3, true);
        }
        if (null != this.child) {
          this.child.drawLayer(this.x + param0, param1, 127, param3 + this.y);
        }
    }

    private final boolean focusPreviousChild(int param0, UiComponent param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -83) {
            this.hasFocus((byte) 65);
          }
          stackIn_7_0 = (null != this.child) && (!this.child.hasFocus((byte) -120)) && (this.child.requestFocus(0, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mc.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void appendChildDebugTree(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$4 = null;
        int var5_int = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = VoidHunters.field_G;
        try {
          discarded$4 = param2.append('\n');
          for (var5_int = 0; var5_int <= param0; var5_int++) {
            discarded$6 = param2.append(' ');
          }
          if (null != this.child) {
            this.child.appendDebugTree(false, param3, param0 + 1, param2);
          } else {
            discarded$5 = param2.append("null");
          }
          if (param1 != 13) {
            this.child = (UiComponent) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("mc.UA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final boolean focusNextChild(byte param0, UiComponent param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -47) {
            field_u = 81;
          }
          stackIn_7_0 = (null != this.child) && (!this.child.hasFocus((byte) -120)) && (this.child.requestFocus(0, param1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mc.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        UiComponent var6 = null;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -15834) {
            var6 = (UiComponent) null;
            this.handleMousePress(-72, 29, -110, -50, (UiComponent) null, 73, (byte) 9);
          }
          if (this.child != null &&
            this.child.hasFocus((byte) -120) &&
            this.child.handleKey(-15834, param1, param2, param3)) {
            return true;
          }
          var5_int = param1;
          if (var5_int != 80) {
            return false;
          }
          if (!SetMachineGunEnergyUsed.field_o[81]) {
            stackIn_12_0 = this.focusNextChild((byte) -47, param2);
          } else {
            stackIn_12_0 = this.focusPreviousChild(-125, param2);
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("mc.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3 + 0, param4);
        this.refreshChildLayout(-124);
        if (param3 != 1) {
          field_u = 87;
        }
    }

    final void clearFocus(byte param0) {
        if (param0 != -34) {
          field_u = -111;
        }
        if (null != this.child) {
          this.child.clearFocus((byte) -34);
        }
    }

    UiSingleChildContainer(int param0, int param1, int param2, int param3, UiRenderer param4, UiListener param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    UiComponent getFocusedChild(int param0) {
        if (param0 != 6093) {
          this.child = (UiComponent) null;
        }
        UiComponent var2 = this.child;
        if (var2 == null) {
          return null;
        }
        if (!var2.hasFocus((byte) -120)) {
          return null;
        }
        return var2;
    }

    final boolean handleMouseWheel(int param0, int param1, int param2, UiComponent param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -6006) {
            return true;
          }
          stackIn_8_0 = (null != this.child) && (this.child.hasFocus((byte) -120)) && (this.child.handleMouseWheel(param0, -6006, param2, param3, param4, param5, param6));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("mc.WA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_u = 5;
    }
}
