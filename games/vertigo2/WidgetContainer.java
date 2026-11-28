/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class WidgetContainer extends UiWidget implements WidgetContainerMarker {
    IntrusiveDeque children;
    static int field_D;

    boolean handleKey(char param0, int param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        UiWidget var6_ref_iq = null;
        int var6 = 0;
        int var7 = 0;
        IntrusiveDequeCursor var8 = null;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          var8 = new IntrusiveDequeCursor(this.children);
          if (param1 != 13) {
            this.children = (IntrusiveDeque) null;
          }
          var6_ref_iq = (UiWidget) (var8.d(param1 - 9));
          while (var6_ref_iq != null) {
            if (var6_ref_iq.isLinked(92)) {
              if (var6_ref_iq.isFocused(102) &&
                var6_ref_iq.handleKey(param0, param1 ^ 0, param2, param3)) {
                return true;
              }
              var6_ref_iq = (UiWidget) (var8.c(2));
              continue;
            }
            break;
          }
          var6 = param2;
          if (var6 != 80) {
            return false;
          }
          if (!UiPanel.field_eb[81]) {
            stackIn_17_0 = this.focusNextChild((byte) -89, param3);
          } else {
            stackIn_17_0 = this.focusPreviousChild(32345, param3);
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("cj.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void blur(byte param0) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.children);
        if (param0 != 2) {
          field_D = 47;
        }
        UiWidget var3 = (UiWidget) (var2.d(param0 ^ 6));
        while (var3 != null) {
          var3.blur((byte) 2);
          var3 = (UiWidget) (var2.c(param0 + 0));
        }
    }

    String getTooltipText(boolean param0) {
        IntrusiveDequeCursor var2;
        UiWidget var3;
        String var4;
        int var5;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (param0) {
          this.getFocusedChild(true);
        }
        var2 = new IntrusiveDequeCursor(this.children);
        var3 = (UiWidget) (var2.d(4));
        while (var3 != null) {
          var4 = var3.getTooltipText(false);
          if (var4 != null) {
            return var4;
          }
          var3 = (UiWidget) (var2.c(2));
        }
        return null;
    }

    final boolean focusNextChild(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        IntrusiveDequeCursor var8 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.children.isEmpty(false)) {
            return false;
          }
          var8 = new IntrusiveDequeCursor(this.children);
          var4 = (UiWidget) (var8.d(4));
          while (var4 != null) {
            if (var4.isFocused(34)) {
              var5 = new IntrusiveDequeCursor(this.children);
              var5.a(-108, var4);
              var6 = (UiWidget) (var5.c(2));
              while (var6 != null) {
                if (!var6.takeFocus((byte) 116, param1)) {
                  var6 = (UiWidget) (var5.c(2));
                  continue;
                }
                return true;
              }
            }
            var4 = (UiWidget) (var8.c(2));
          }
          if (param0 < -63) {
            return false;
          }
          this.getFocusedChild(false);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("cj.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void refreshChildLayouts(int param0) {
        int var4 = Vertigo2.field_L ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.children);
        if (param0 != -641) {
          this.children = (IntrusiveDeque) null;
        }
        UiWidget var3 = (UiWidget) (var2.d(4));
        while (var3 != null) {
          var3.refreshLayout(param0 + 553);
          var3 = (UiWidget) (var2.c(param0 + 643));
        }
    }

    final boolean handleWheel(int param0, int param1, int param2, int param3, int param4, byte param5, UiWidget param6) {
        IntrusiveDequeCursor var8 = null;
        RuntimeException var8_ref = null;
        UiWidget var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          var8 = new IntrusiveDequeCursor(this.children);
          var9 = (UiWidget) (var8.d(4));
          while (var9 != null) {
            if (var9.isLinked(94)) {
              if (var9.isFocused(61) &&
                var9.handleWheel(param0, param1, param2, param3, param4, (byte) -123, param6)) {
                return true;
              }
              var9 = (UiWidget) (var8.c(2));
              continue;
            }
            break;
          }
          var10 = 39 % ((-87 - param5) / 35);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_14_0 = var8_ref;
          stackIn_14_1 = new StringBuilder().append("cj.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    WidgetContainer(int param0, int param1, int param2, int param3, WidgetListener param4) {
        super(param0, param1, param2, param3, param4, (WidgetEventListener) null);
        this.children = new IntrusiveDeque();
    }

    final boolean isFocused(int param0) {
        if (param0 < 3) {
          this.drawWidget(true, 15, -89, 98);
        }
        return null != this.getFocusedChild(true) ? true : false;
    }

    final int getMaximumRenderLayer(byte param0) {
        int var5 = 0;
        int var6 = Vertigo2.field_L ? 1 : 0;
        int var2 = 0;
        IntrusiveDequeCursor var3 = new IntrusiveDequeCursor(this.children);
        UiWidget var4 = (UiWidget) (var3.d(4));
        if (param0 > -97) {
          UiWidget var7 = (UiWidget) null;
          this.updatePointer((byte) 126, 47, 97, (UiWidget) null);
        }
        while (var4 != null) {
          var5 = var4.getMaximumRenderLayer((byte) -121);
          if (var2 < var5) {
            var2 = var5;
          }
          var4 = (UiWidget) (var3.c(2));
        }
        return var2;
    }

    final boolean pointerPressed(int param0, int param1, int param2, UiWidget param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        UiWidget var9 = null;
        int var10 = 0;
        UiWidget var11 = null;
        IntrusiveDequeCursor var12 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param5 > -107) {
            var11 = (UiWidget) null;
            this.pointerPressed(77, -56, -46, (UiWidget) null, 32, (byte) 26, 97);
          }
          var12 = new IntrusiveDequeCursor(this.children);
          var9 = (UiWidget) (var12.d(4));
          while (var9 != null) {
            if (var9.isLinked(115)) {
              if (var9.pointerPressed(param0, param1 + this.x, param2 + this.y, param3, param4, (byte) -108, param6)) {
                return true;
              }
              var9 = (UiWidget) (var12.c(2));
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("cj.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void setBounds(boolean param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.refreshChildLayouts(-641);
    }

    private final void appendChildDebugTrees(int param0, boolean param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$3 = null;
        int var7 = 0;
        StringBuilder discarded$4 = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          var5 = new IntrusiveDequeCursor(this.children);
          if (param1) {
            return;
          }
          var6 = (UiWidget) (var5.d(4));
          while (var6 != null) {
            discarded$3 = param2.append('\n');
            for (var7 = 0; param0 >= var7; var7++) {
              discarded$4 = param2.append(' ');
            }
            var6.appendDebugTree(param3, 1 + param0, (byte) -79, param2);
            var6 = (UiWidget) (var5.c(2));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("cj.U(").append(param0).append(',').append(param1).append(',');
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
          throw wn.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void pointerReleased(UiWidget param0, byte param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var7 = null;
        UiWidget var8 = null;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param1 != 46) {
            return;
          }
          var7 = new IntrusiveDequeCursor(this.children);
          var8 = (UiWidget) (var7.d(4));
          while (var8 != null) {
            if (var8.isLinked(125)) {
              var8.pointerReleased(param0, (byte) 46, param2 + this.x, this.y + param3, param4, param5);
              var8 = (UiWidget) (var7.c(param1 - 44));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("cj.HA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean focusPreviousChild(int param0, UiWidget param1) {
        RuntimeException var3 = null;
        UiWidget var4 = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        IntrusiveDequeCursor var8 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.children.isEmpty(false)) {
            return false;
          }
          var8 = new IntrusiveDequeCursor(this.children);
          if (param0 != 32345) {
            this.children = (IntrusiveDeque) null;
          }
          var4 = (UiWidget) (var8.b(param0 - 32341));
          while (var4 != null) {
            if (var4.isFocused(85)) {
              var5 = new IntrusiveDequeCursor(this.children);
              var5.a(var4, param0 - 32342);
              var6 = (UiWidget) (var5.a((byte) 76));
              while (var6 != null) {
                if (!var6.takeFocus((byte) 116, param1)) {
                  var6 = (UiWidget) (var5.a((byte) 121));
                  continue;
                }
                return true;
              }
            }
            var4 = (UiWidget) (var8.a((byte) 101));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("cj.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void addChild(byte param0, UiWidget param1) {
        try {
          int var3_int = 36 / ((param0 - 35) / 38);
          this.children.addFirst(param1, false);
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "cj.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    UiWidget getFocusedChild(boolean param0) {
        IntrusiveDequeCursor var2;
        UiWidget var3;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (!param0) {
          this.getTooltipText(false);
        }
        var2 = new IntrusiveDequeCursor(this.children);
        var3 = (UiWidget) (var2.d(4));
        while (var3 != null) {
          if (var3.isFocused(93)) {
            return var3;
          }
          var3 = (UiWidget) (var2.c(2));
        }
        return null;
    }

    void drawWidget(boolean param0, int param1, int param2, int param3) {
        int var7 = Vertigo2.field_L ? 1 : 0;
        if (param1 == 0 &&
          this.listener != null) {
          this.listener.paintWidget(true, param2, true, (UiWidget) (this), param3);
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.children);
        if (param0) {
          this.drawWidget(true, 10, -73, -106);
        }
        UiWidget var6 = (UiWidget) (var5.b(4));
        while (var6 != null) {
          var6.drawWidget(false, param1, param2 + this.x, this.y + param3);
          var6 = (UiWidget) (var5.a((byte) 15));
        }
    }

    final StringBuilder appendDebugTree(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.beginDebugTreeEntry(param3, param2 ^ 78, param1, param0)) {
            this.appendDebugProperties(param0, param3, true, param1);
            this.appendChildDebugTrees(param1, false, param3, param0);
          }
          if (param2 == -79) {
            stackIn_7_0 = (StringBuilder) (param3);
            return stackIn_7_0;
          }
          stackIn_5_0 = (StringBuilder) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("cj.FA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    void updatePointer(byte param0, int param1, int param2, UiWidget param3) {
        RuntimeException runtimeException = null;
        IntrusiveDequeCursor var5 = null;
        UiWidget var6 = null;
        int var7 = 0;
        UiWidget var8 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          super.updatePointer((byte) 66, param1, param2, param3);
          var5 = new IntrusiveDequeCursor(this.children);
          if (param0 <= 6) {
            var8 = (UiWidget) null;
            this.focusNextChild((byte) 25, (UiWidget) null);
          }
          var6 = (UiWidget) (var5.d(4));
          while (var6 != null) {
            if (var6.isLinked(101)) {
              var6.updatePointer((byte) 73, param1 + this.x, this.y + param2, param3);
              var6 = (UiWidget) (var5.c(2));
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("cj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void b(boolean param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        if (!BufferedSocket.field_a) {
          return;
        }
        BirthDateChatEnableForm.field_L.a(0, param0);
        var4 = TextureOperator.field_n.l(0) ? 1 : 0;
        if (param1 != ~kf.field_c &&
          var4 == 0) {
          param0 = false;
          on.a(9110);
        }
        if (param0) {
          TextureOperator.field_n.a(param2, 538, param3);
        }
        if (var4 != 0) {
          BirthDateChatEnableForm.field_L.a(0, param0);
        }
        var5 = TextureOperator.field_n.k(12282) + TextureOperator.field_n.field_ob;
        if (var5 <= 640) {
          if (635 > var5 &&
            !(0 >= FullscreenStatusDialog.field_Y)) {
            FullscreenStatusDialog.field_Y = FullscreenStatusDialog.field_Y - 5;
          }
        } else {
          FullscreenStatusDialog.field_Y = FullscreenStatusDialog.field_Y + 5;
        }
    }

    final boolean takeFocus(byte param0, UiWidget param1) {
        IntrusiveDequeCursor var3 = null;
        RuntimeException var3_ref = null;
        UiWidget var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 116) {
            return true;
          }
          var3 = new IntrusiveDequeCursor(this.children);
          var4 = (UiWidget) (var3.d(param0 - 112));
          while (var4 != null) {
            if (var4.takeFocus((byte) 116, param1)) {
              return true;
            }
            var4 = (UiWidget) (var3.c(2));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("cj.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_D = 100;
    }
}
